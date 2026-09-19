package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class vb1 {
    public static final boolean r;
    public final Context a;
    public final String b;
    public final d60 c;
    public final rx0 d;
    public final sx0 e;
    public final dg3 f;
    public final long[] g;
    public final String[] h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;
    public lb1 n;
    public boolean o;
    public boolean p;
    public long q;

    static {
        r = ut0.f.e.nextInt(100) < ((Integer) tu0.e.c.a(lx0.xd)).intValue();
    }

    public vb1(Context context, d60 d60Var, String str, sx0 sx0Var, rx0 rx0Var) {
        p83 p83Var = new p83(10);
        p83Var.s("min_1", Double.MIN_VALUE, 1.0d);
        p83Var.s("1_5", 1.0d, 5.0d);
        p83Var.s("5_10", 5.0d, 10.0d);
        p83Var.s("10_20", 10.0d, 20.0d);
        p83Var.s("20_30", 20.0d, 30.0d);
        p83Var.s("30_max", 30.0d, Double.MAX_VALUE);
        this.f = new dg3(p83Var);
        this.i = false;
        this.j = false;
        this.k = false;
        this.l = false;
        this.q = -1L;
        this.a = context;
        this.c = d60Var;
        this.b = str;
        this.e = sx0Var;
        this.d = rx0Var;
        String str2 = (String) tu0.e.c.a(lx0.M);
        if (str2 == null) {
            this.h = new String[0];
            this.g = new long[0];
            return;
        }
        String[] strArrSplit = TextUtils.split(str2, ",");
        int length = strArrSplit.length;
        this.h = new String[length];
        this.g = new long[length];
        for (int i = 0; i < strArrSplit.length; i++) {
            try {
                this.g[i] = Long.parseLong(strArrSplit[i]);
            } catch (NumberFormatException e) {
                jn.V("Unable to parse frame hash target time number.", e);
                this.g[i] = -1;
            }
        }
    }

    public final void a(lb1 lb1Var) {
        rx0 rx0Var = this.d;
        sx0 sx0Var = this.e;
        jn.q(sx0Var, rx0Var, "vpc2");
        this.i = true;
        sx0Var.c("vpn", lb1Var.d());
        this.n = lb1Var;
    }

    public final void b() {
        Bundle bundleH0;
        if (!r || this.o) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("type", "native-player-metrics");
        bundle.putString("request", this.b);
        bundle.putString("player", this.n.d());
        dg3 dg3Var = this.f;
        String[] strArr = (String[]) dg3Var.g;
        ArrayList arrayList = new ArrayList(strArr.length);
        int i = 0;
        while (i < strArr.length) {
            String str = strArr[i];
            double[] dArr = (double[]) dg3Var.i;
            double[] dArr2 = (double[]) dg3Var.h;
            int[] iArr = (int[]) dg3Var.j;
            double d = dArr[i];
            double d2 = dArr2[i];
            int i2 = iArr[i];
            arrayList.add(new ru0(str, d, d2, ((double) i2) / ((double) dg3Var.f), i2));
            i++;
            dg3Var = dg3Var;
            strArr = strArr;
        }
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            ru0 ru0Var = (ru0) obj;
            String str2 = ru0Var.a;
            String strValueOf = String.valueOf(str2);
            bundle.putString("fps_c_".concat(strValueOf), Integer.toString(ru0Var.e));
            String strValueOf2 = String.valueOf(str2);
            bundle.putString("fps_p_".concat(strValueOf2), Double.toString(ru0Var.d));
        }
        int i4 = 0;
        while (true) {
            long[] jArr = this.g;
            if (i4 >= jArr.length) {
                break;
            }
            String str3 = this.h[i4];
            if (str3 != null) {
                Long lValueOf = Long.valueOf(jArr[i4]);
                new StringBuilder(lValueOf.toString().length() + 3);
                bundle.putString("fh_".concat(lValueOf.toString()), str3);
            }
            i4++;
        }
        final zb3 zb3Var = vc3.C.c;
        String str4 = this.c.f;
        AtomicReference atomicReference = zb3Var.c;
        bundle.putString("device", zb3.P());
        ix0 ix0Var = lx0.a;
        tu0 tu0Var = tu0.e;
        bundle.putString("eids", TextUtils.join(",", tu0Var.a.N()));
        boolean zIsEmpty = bundle.isEmpty();
        final Context context = this.a;
        if (zIsEmpty) {
            jn.F("Empty or null bundle.");
        } else {
            final String str5 = (String) tu0Var.c.a(lx0.pb);
            if (!zb3Var.d.getAndSet(true)) {
                SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: g93
                    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                    public final /* synthetic */ void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str6) {
                        zb3Var.c.set(w40.h0(context, str5));
                    }
                };
                if (TextUtils.isEmpty(str5)) {
                    bundleH0 = Bundle.EMPTY;
                } else {
                    PreferenceManager.getDefaultSharedPreferences(context).registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
                    bundleH0 = w40.h0(context, str5);
                }
                atomicReference.set(bundleH0);
            }
            bundle.putAll((Bundle) atomicReference.get());
        }
        f32 f32Var = ut0.f.a;
        f32.a(context, str4, bundle, new z61(context, 27, str4));
        this.o = true;
    }

    public final void c(lb1 lb1Var) {
        if (this.k && !this.l) {
            if (jn.B() && !this.l) {
                jn.p("VideoMetricsMixin first frame");
            }
            jn.q(this.e, this.d, "vff2");
            this.l = true;
        }
        vc3.C.k.getClass();
        long jNanoTime = System.nanoTime();
        if (this.m && this.p) {
            long j = this.q;
            if (j != -1) {
                double d = 1.0E9d / (jNanoTime - j);
                dg3 dg3Var = this.f;
                dg3Var.f++;
                int i = 0;
                while (true) {
                    double[] dArr = (double[]) dg3Var.i;
                    if (i >= dArr.length) {
                        break;
                    }
                    double d2 = dArr[i];
                    if (d2 <= d && d < ((double[]) dg3Var.h)[i]) {
                        int[] iArr = (int[]) dg3Var.j;
                        iArr[i] = iArr[i] + 1;
                    }
                    if (d < d2) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
        }
        this.p = this.m;
        this.q = jNanoTime;
        long jLongValue = ((Long) tu0.e.c.a(lx0.N)).longValue();
        long jK = lb1Var.k();
        int i2 = 0;
        while (true) {
            String[] strArr = this.h;
            if (i2 >= strArr.length) {
                return;
            }
            if (strArr[i2] == null && jLongValue > Math.abs(jK - this.g[i2])) {
                int i3 = 8;
                Bitmap bitmap = lb1Var.getBitmap(8, 8);
                long j2 = 63;
                long j3 = 0;
                int i4 = 0;
                while (i4 < i3) {
                    int i5 = 0;
                    while (i5 < i3) {
                        int pixel = bitmap.getPixel(i5, i4);
                        j3 |= (Color.green(pixel) + (Color.red(pixel) + Color.blue(pixel)) > 128 ? 1L : 0L) << ((int) j2);
                        j2--;
                        i5++;
                        i3 = 8;
                    }
                    i4++;
                    i3 = 8;
                }
                strArr[i2] = String.format("%016X", Long.valueOf(j3));
                return;
            }
            i2++;
        }
    }

    public final void d() {
        this.m = true;
        if (!this.j || this.k) {
            return;
        }
        jn.q(this.e, this.d, "vfp2");
        this.k = true;
    }
}
