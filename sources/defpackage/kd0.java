package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import android.view.View;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class kd0 implements hn2, ni0, yd2, x7, y7 {
    public final /* synthetic */ int f;
    public final Object g;
    public final Object h;
    public Object i;
    public final Object j;
    public Object k;

    public kd0(d11 d11Var) {
        a01 zz0Var;
        this.f = 2;
        this.h = new ArrayList();
        this.j = new h60();
        this.k = new ArrayList();
        this.g = d11Var;
        b01 b01Var = null;
        try {
            List listD = d11Var.d();
            if (listD != null) {
                for (Object obj : listD) {
                    if (obj instanceof IBinder) {
                        IBinder iBinder = (IBinder) obj;
                        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
                        zz0Var = iInterfaceQueryLocalInterface instanceof a01 ? (a01) iInterfaceQueryLocalInterface : new zz0(iBinder);
                    } else {
                        zz0Var = null;
                    }
                    if (zz0Var != null) {
                        ((ArrayList) this.h).add(new b01(zz0Var));
                    }
                }
            }
        } catch (RemoteException e) {
            jn.P("", e);
        }
        try {
            List listX = ((d11) this.g).X();
            if (listX != null) {
                for (Object obj2 : listX) {
                    mn1 mn1VarB3 = obj2 instanceof IBinder ? y22.B3((IBinder) obj2) : null;
                    if (mn1VarB3 != null) {
                        ((ArrayList) this.k).add(new gp2(mn1VarB3));
                    }
                }
            }
        } catch (RemoteException e2) {
            jn.P("", e2);
        }
        try {
            a01 a01VarF = ((d11) this.g).f();
            if (a01VarF != null) {
                b01Var = new b01(a01VarF);
            }
        } catch (RemoteException e3) {
            jn.P("", e3);
        }
        this.i = b01Var;
        try {
            if (((d11) this.g).n() != null) {
                new oc2(((d11) this.g).n());
            }
        } catch (RemoteException e4) {
            jn.P("", e4);
        }
    }

    public static JSONObject i(Context context, d60 d60Var) {
        JSONObject jSONObject = new JSONObject();
        try {
            if (((Boolean) ry0.d.u()).booleanValue()) {
                jSONObject.put("package_name", context.getPackageName());
            }
            jSONObject.put("js", d60Var.f);
            jSONObject.put("mf", ry0.e.u());
            jSONObject.put("cl", "811902923");
            jSONObject.put("rapid_rc", "dev");
            jSONObject.put("rapid_rollup", "HEAD");
            jSONObject.put("admob_module_version", 12451000);
            jSONObject.put("dynamite_local_version", ModuleDescriptor.MODULE_VERSION);
            jSONObject.put("dynamite_version", fg.d(context, false));
            jSONObject.put("container_version", 12451000);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public static sp0 l() {
        hp0 hp0VarB0 = sp0.B0();
        hp0VarB0.g(32768L);
        return (sp0) hp0VarB0.c();
    }

    @Override // defpackage.x7
    public void T(int i) {
        try {
            ((LinkedBlockingQueue) this.j).put(l());
        } catch (InterruptedException unused) {
        }
    }

    @Override // defpackage.y7
    public void U(db dbVar) {
        try {
            ((LinkedBlockingQueue) this.j).put(l());
        } catch (InterruptedException unused) {
        }
    }

    @Override // defpackage.x7
    public void Y() {
        ya2 ya2Var;
        LinkedBlockingQueue linkedBlockingQueue = (LinkedBlockingQueue) this.j;
        HandlerThread handlerThread = (HandlerThread) this.k;
        try {
            ya2Var = (ya2) ((va2) this.g).t();
        } catch (DeadObjectException | IllegalStateException unused) {
            ya2Var = null;
        }
        if (ya2Var != null) {
            try {
                try {
                    wa2 wa2Var = new wa2(1, (String) this.h, (String) this.i);
                    Parcel parcelU = ya2Var.U();
                    kt0.c(parcelU, wa2Var);
                    Parcel parcelY = ya2Var.Y(parcelU, 1);
                    xa2 xa2Var = (xa2) kt0.b(parcelY, xa2.CREATOR);
                    parcelY.recycle();
                    if (xa2Var.g == null) {
                        try {
                            byte[] bArr = xa2Var.h;
                            v13 v13Var = v13.a;
                            int i = h13.a;
                            xa2Var.g = sp0.A0(bArr, v13.b);
                            xa2Var.h = null;
                        } catch (NullPointerException | o23 e) {
                            throw new IllegalStateException(e);
                        }
                    }
                    xa2Var.a();
                    linkedBlockingQueue.put(xa2Var.g);
                } catch (Throwable unused2) {
                    linkedBlockingQueue.put(l());
                }
            } catch (InterruptedException unused3) {
            } finally {
                c();
                handlerThread.quit();
            }
        }
    }

    @Override // defpackage.ni0
    public int a() {
        return ((long[]) this.h).length;
    }

    public hp b() {
        synchronized (this.g) {
            try {
                if (((SharedPreferences) this.i) == null) {
                    this.i = ((Context) this.h).getSharedPreferences("google_ads_flags_meta", 0);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        SharedPreferences sharedPreferences = (SharedPreferences) this.i;
        long j = sharedPreferences != null ? sharedPreferences.getLong("js_last_update", 0L) : 0L;
        vc3.C.k.getClass();
        if (System.currentTimeMillis() - j < ((Long) ry0.f.u()).longValue()) {
            return kn2.g;
        }
        return na1.M(((c41) this.j).a(i((Context) this.h, (d60) this.k)), new zl0(1, this), za1.g);
    }

    @Override // defpackage.yd2
    public void c() {
        switch (this.f) {
            case 6:
                break;
            default:
                va2 va2Var = (va2) this.g;
                if (va2Var != null) {
                    if (va2Var.a() || va2Var.e()) {
                        va2Var.o();
                    }
                }
                break;
        }
    }

    @Override // defpackage.ni0
    public long d(int i) {
        return ((long[]) this.h)[i];
    }

    @Override // defpackage.hn2
    /* JADX INFO: renamed from: e */
    public void mo5e(Object obj) {
        boolean zBooleanValue;
        d72 d72Var;
        d72 d72Var2;
        d72 d72Var3;
        d72 d72Var4;
        final int i = 0;
        final int i2 = 1;
        switch (this.f) {
            case 0:
                fa1 fa1Var = (fa1) this.i;
                a72 a72Var = (a72) this.j;
                hp hpVar = (hp) this.g;
                ep0 ep0Var = (ep0) this.k;
                AtomicBoolean atomicBoolean = ep0Var.H;
                j01 j01Var = (j01) obj;
                d72 d72VarK3 = ep0.K3(hpVar, (ma1) this.h);
                atomicBoolean.set(true);
                if (!((Boolean) tu0.e.c.a(lx0.b8)).booleanValue()) {
                    if (fa1Var != null) {
                        try {
                            fa1Var.w("QueryInfo generation has been disabled.");
                        } catch (RemoteException e) {
                            jn.M("QueryInfo generation has been disabled.".concat(e.toString()));
                        }
                        break;
                    }
                    if (!((Boolean) my0.e.u()).booleanValue() || d72VarK3 == null) {
                        return;
                    }
                    a72Var.k("QueryInfo generation has been disabled.");
                    a72Var.b(false);
                    d72VarK3.a(a72Var);
                    d72VarK3.h();
                    return;
                }
                try {
                    if (j01Var == null) {
                        if (fa1Var != null) {
                            fa1Var.t3(null, null, null);
                        }
                        a72Var.b(true);
                        if (!((Boolean) my0.e.u()).booleanValue() || d72VarK3 == null) {
                            return;
                        }
                    } else {
                        try {
                            if (TextUtils.isEmpty((!TextUtils.isEmpty(j01Var.c) ? new JSONObject(j01Var.c) : new JSONObject(j01Var.b)).optString("request_id", ""))) {
                                jn.T("The request ID is empty in request JSON.");
                                if (fa1Var != null) {
                                    fa1Var.w("Internal error: request ID is empty in request JSON.");
                                }
                                a72Var.k("Request ID empty");
                                a72Var.b(false);
                                if (!((Boolean) my0.e.u()).booleanValue() || d72VarK3 == null) {
                                    return;
                                }
                            } else {
                                Bundle bundle = j01Var.f;
                                boolean z = ep0Var.v;
                                String str = ep0Var.w;
                                String str2 = ep0Var.x;
                                if (z && bundle != null && bundle.getInt(str2, -1) == -1) {
                                    bundle.putInt(str2, ep0Var.y.get());
                                }
                                if (ep0Var.u && bundle != null && TextUtils.isEmpty(bundle.getString(str))) {
                                    if (TextUtils.isEmpty(ep0Var.A)) {
                                        ep0Var.A = vc3.C.c.E(ep0Var.h, ep0Var.z.f);
                                    }
                                    bundle.putString(str, ep0Var.A);
                                }
                                if (fa1Var != null) {
                                    boolean zIsEmpty = TextUtils.isEmpty(j01Var.c);
                                    String str3 = j01Var.a;
                                    if (zIsEmpty) {
                                        fa1Var.t3(str3, bundle, j01Var.b);
                                    } else {
                                        fa1Var.t3(str3, bundle, j01Var.c);
                                    }
                                }
                                a72Var.b(true);
                                if (!((Boolean) my0.e.u()).booleanValue() || d72VarK3 == null) {
                                    return;
                                }
                            }
                        } catch (JSONException e2) {
                            jn.T("Failed to create JSON object from the request string.");
                            if (fa1Var != null) {
                                String string = e2.toString();
                                StringBuilder sb = new StringBuilder(string.length() + 33);
                                sb.append("Internal error for request JSON: ");
                                sb.append(string);
                                fa1Var.w(sb.toString());
                            }
                            a72Var.f(e2);
                            a72Var.b(false);
                            vc3.C.h.d("SignalGeneratorImpl.generateSignals.onSuccess", e2);
                            if (!((Boolean) my0.e.u()).booleanValue() || d72VarK3 == null) {
                                return;
                            }
                        }
                    }
                } catch (RemoteException e3) {
                    a72Var.f(e3);
                    a72Var.b(false);
                    jn.P("", e3);
                    vc3.C.h.d("SignalGeneratorImpl.generateSignals.onSuccess", e3);
                    if (!zBooleanValue || d72VarK3 == null) {
                        return;
                    }
                } finally {
                    if (((Boolean) my0.e.u()).booleanValue() && d72VarK3 != null) {
                        d72VarK3.a(a72Var);
                        d72VarK3.h();
                    }
                }
                return;
            case 7:
                es0 es0Var = (es0) this.k;
                mi1 mi1Var = (mi1) obj;
                synchronized (es0Var) {
                    if (mi1Var != null) {
                        try {
                            mi1Var.b();
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    ((tl1) mi1Var.g.f.g).g = (nz1) ((r52) es0Var.i).h;
                    ((zx) this.g).m(mi1Var);
                    ((if1) es0Var.g).b().execute(new ri1(this, i2));
                    if (!((Boolean) my0.c.u()).booleanValue() || (d72Var = (d72) this.h) == null) {
                        e72 e72Var = (e72) es0Var.j;
                        a72 a72Var2 = (a72) this.j;
                        a72Var2.l(mi1Var.a.b);
                        a72Var2.r0(mi1Var.f.f);
                        a72Var2.b(true);
                        e72Var.b(a72Var2.m());
                    } else {
                        d72Var.e(mi1Var.a.b);
                        d72Var.g(mi1Var.f.f);
                        a72 a72Var3 = (a72) this.j;
                        a72Var3.b(true);
                        d72Var.a(a72Var3);
                        d72Var.h();
                    }
                    break;
                }
                return;
            case 8:
                p32 p32Var = (p32) this.k;
                mi1 mi1Var2 = (mi1) obj;
                synchronized (p32Var) {
                    if (mi1Var2 != null) {
                        try {
                            mi1Var2.b();
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    p32Var.j = null;
                    if (((Boolean) tu0.e.c.a(lx0.P8)).booleanValue()) {
                        ((tl1) mi1Var2.g.f.g).i = p32Var.d;
                    }
                    ((uz1) this.g).m(mi1Var2);
                    if (!((Boolean) my0.c.u()).booleanValue() || (d72Var2 = (d72) this.h) == null) {
                        e72 e72Var2 = p32Var.h;
                        a72 a72Var4 = (a72) this.j;
                        a72Var4.l(mi1Var2.a.b);
                        a72Var4.r0(mi1Var2.f.f);
                        a72Var4.b(true);
                        e72Var2.b(a72Var4.m());
                    } else {
                        d72Var2.e(mi1Var2.a.b);
                        d72Var2.g(mi1Var2.f.f);
                        a72 a72Var5 = (a72) this.j;
                        a72Var5.b(true);
                        d72Var2.a(a72Var5);
                        d72Var2.h();
                    }
                    break;
                }
                return;
            case 9:
                o42 o42Var = (o42) this.k;
                in1 in1Var = (in1) obj;
                synchronized (o42Var) {
                    if (in1Var != null) {
                        try {
                            in1Var.b();
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                    o42Var.i = null;
                    ix0 ix0Var = lx0.Q8;
                    tu0 tu0Var = tu0.e;
                    if (((Boolean) tu0Var.c.a(ix0Var)).booleanValue()) {
                        kc2 kc2Var = in1Var.g.f;
                        nz1 nz1Var = o42Var.d;
                        tl1 tl1Var = (tl1) kc2Var.g;
                        tl1Var.g = nz1Var;
                        tl1Var.j = o42Var.e;
                    }
                    ((uz1) this.g).m(in1Var);
                    if (((Boolean) tu0Var.c.a(ix0Var)).booleanValue()) {
                        o42Var.b.execute(new Runnable(this) { // from class: m42
                            public final /* synthetic */ kd0 g;

                            {
                                this.g = this;
                            }

                            @Override // java.lang.Runnable
                            public final /* synthetic */ void run() {
                                int i3 = i2;
                                kd0 kd0Var = this.g;
                                switch (i3) {
                                    case 0:
                                        ((o42) kd0Var.k).e.e();
                                        break;
                                    default:
                                        ((o42) kd0Var.k).d.e();
                                        break;
                                }
                            }
                        });
                        o42Var.b.execute(new Runnable(this) { // from class: m42
                            public final /* synthetic */ kd0 g;

                            {
                                this.g = this;
                            }

                            @Override // java.lang.Runnable
                            public final /* synthetic */ void run() {
                                int i3 = i;
                                kd0 kd0Var = this.g;
                                switch (i3) {
                                    case 0:
                                        ((o42) kd0Var.k).e.e();
                                        break;
                                    default:
                                        ((o42) kd0Var.k).d.e();
                                        break;
                                }
                            }
                        });
                    }
                    if (!((Boolean) my0.c.u()).booleanValue() || (d72Var3 = (d72) this.h) == null) {
                        e72 e72Var3 = o42Var.g;
                        a72 a72Var6 = (a72) this.j;
                        a72Var6.l(in1Var.a.b);
                        a72Var6.r0(in1Var.f.f);
                        a72Var6.b(true);
                        e72Var3.b(a72Var6.m());
                    } else {
                        d72Var3.e(in1Var.a.b);
                        d72Var3.g(in1Var.f.f);
                        a72 a72Var7 = (a72) this.j;
                        a72Var7.b(true);
                        d72Var3.a(a72Var7);
                        d72Var3.h();
                    }
                    break;
                }
                return;
            default:
                s42 s42Var = (s42) this.k;
                cr1 cr1Var = (cr1) obj;
                synchronized (s42Var) {
                    if (cr1Var != null) {
                        try {
                            cr1Var.b();
                        } catch (Throwable th4) {
                            throw th4;
                        }
                    }
                    ((tl1) cr1Var.g.f.g).j = s42Var.d;
                    ((uz1) this.g).m(cr1Var);
                    Executor executor = s42Var.b;
                    p42 p42Var = s42Var.d;
                    Objects.requireNonNull(p42Var);
                    executor.execute(new ly1(8, p42Var));
                    s42Var.d.l();
                    if (!((Boolean) my0.c.u()).booleanValue() || (d72Var4 = (d72) this.h) == null) {
                        e72 e72Var4 = s42Var.g;
                        a72 a72Var8 = (a72) this.j;
                        a72Var8.l(cr1Var.a.b);
                        a72Var8.r0(cr1Var.f.f);
                        a72Var8.b(true);
                        e72Var4.b(a72Var8.m());
                    } else {
                        d72Var4.e(cr1Var.a.b);
                        d72Var4.g(cr1Var.f.f);
                        a72 a72Var9 = (a72) this.j;
                        a72Var9.b(true);
                        d72Var4.a(a72Var9);
                        d72Var4.h();
                    }
                    break;
                }
                return;
        }
    }

    public hp f(String str) {
        sc3 sc3Var = sc3.g;
        if (str != null) {
            if (!((Boolean) tu0.e.c.a(lx0.f)).booleanValue() || !str.isEmpty()) {
                try {
                    return n(1, 0L, str);
                } catch (NullPointerException | RejectedExecutionException unused) {
                    return na1.t(sc3Var);
                }
            }
        }
        return na1.t(sc3Var);
    }

    @Override // defpackage.ni0
    public ArrayList g(long j) {
        Map map = (Map) this.i;
        HashMap map2 = (HashMap) this.j;
        HashMap map3 = (HashMap) this.k;
        lj0 lj0Var = (lj0) this.g;
        ArrayList arrayList = new ArrayList();
        String str = lj0Var.h;
        lj0Var.g(j, str, arrayList);
        TreeMap treeMap = new TreeMap();
        lj0Var.h(j, false, str, treeMap);
        lj0Var.j(j, map, map2, str, treeMap);
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Pair pair = (Pair) arrayList.get(i);
            String str2 = (String) map3.get(pair.second);
            if (str2 != null) {
                byte[] bArrDecode = Base64.decode(str2, 0);
                Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
                oj0 oj0Var = (oj0) map2.get(pair.first);
                oj0Var.getClass();
                arrayList2.add(new tf1(null, null, null, bitmapDecodeByteArray, oj0Var.c, 0, oj0Var.e, oj0Var.b, 0, Integer.MIN_VALUE, -3.4028235E38f, oj0Var.f, oj0Var.g, oj0Var.j, 0.0f, 0));
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            oj0 oj0Var2 = (oj0) map2.get(entry.getKey());
            oj0Var2.getClass();
            jf1 jf1Var = (jf1) entry.getValue();
            CharSequence charSequence = jf1Var.a;
            charSequence.getClass();
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) charSequence;
            for (jj0 jj0Var : (jj0[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), jj0.class)) {
                spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(jj0Var), spannableStringBuilder.getSpanEnd(jj0Var), (CharSequence) "");
            }
            int i2 = 0;
            while (i2 < spannableStringBuilder.length()) {
                int i3 = i2 + 1;
                if (spannableStringBuilder.charAt(i2) == ' ') {
                    int i4 = i3;
                    while (i4 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i4) == ' ') {
                        i4++;
                    }
                    int i5 = i4 - i3;
                    if (i5 > 0) {
                        spannableStringBuilder.delete(i2, i5 + i2);
                    }
                }
                i2 = i3;
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(0) == ' ') {
                spannableStringBuilder.delete(0, 1);
            }
            int i6 = 0;
            while (i6 < spannableStringBuilder.length() - 1) {
                int i7 = i6 + 1;
                if (spannableStringBuilder.charAt(i6) == '\n' && spannableStringBuilder.charAt(i7) == ' ') {
                    spannableStringBuilder.delete(i7, i6 + 2);
                }
                i6 = i7;
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == ' ') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            int i8 = 0;
            while (i8 < spannableStringBuilder.length() - 1) {
                int i9 = i8 + 1;
                if (spannableStringBuilder.charAt(i8) == ' ' && spannableStringBuilder.charAt(i9) == '\n') {
                    spannableStringBuilder.delete(i8, i9);
                }
                i8 = i9;
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == '\n') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            float f = oj0Var2.c;
            int i10 = oj0Var2.d;
            jf1Var.e = f;
            jf1Var.f = i10;
            jf1Var.g = oj0Var2.e;
            jf1Var.h = oj0Var2.b;
            jf1Var.l = oj0Var2.f;
            float f2 = oj0Var2.i;
            int i11 = oj0Var2.h;
            jf1Var.k = f2;
            jf1Var.j = i11;
            jf1Var.n = oj0Var2.j;
            arrayList2.add(jf1Var.a());
        }
        return arrayList2;
    }

    @Override // defpackage.yd2
    public void k(View view) {
        zx zxVar = (zx) this.j;
        bz1 bz1Var = (bz1) ((vy1) this.k).e;
        e52 e52Var = (e52) this.h;
        x42 x42Var = (x42) this.i;
        cb1 cb1Var = (cb1) this.g;
        dr1 dr1Var = new dr1(new gv1(bz1Var, 3, x42Var), null, 1);
        p83 p83Var = new p83(e52Var, x42Var, (String) null);
        sf1 sf1Var = (sf1) bz1Var.f;
        rf1 rf1Var = new rf1(sf1Var.b, sf1Var.c, p83Var, dr1Var);
        dr0 dr0Var = new dr0(bz1Var, 27, rf1Var);
        synchronized (zxVar) {
            zxVar.g = dr0Var;
        }
        cb1Var.b(rf1Var.I());
    }

    public byte[] m() throws Throwable {
        FileInputStream fileInputStream;
        byte[] bArrP;
        FileInputStream fileInputStream2 = null;
        if (((byte[]) this.k) == null) {
            try {
                fileInputStream = new FileInputStream((File) this.j);
                try {
                    l13 l13Var = n13.g;
                    ArrayList arrayList = new ArrayList();
                    int iMin = 256;
                    while (true) {
                        byte[] bArr = new byte[iMin];
                        int i = 0;
                        while (i < iMin) {
                            int i2 = fileInputStream.read(bArr, i, iMin - i);
                            if (i2 == -1) {
                                break;
                            }
                            i += i2;
                        }
                        l13 l13VarN = i == 0 ? null : n13.n(bArr, 0, i);
                        if (l13VarN == null) {
                            break;
                        }
                        arrayList.add(l13VarN);
                        iMin = Math.min(iMin + iMin, 8192);
                    }
                    bArrP = n13.o(arrayList).p();
                    ar.b(fileInputStream);
                } catch (IOException unused) {
                    ar.b(fileInputStream);
                    bArrP = null;
                } catch (Throwable th) {
                    th = th;
                    fileInputStream2 = fileInputStream;
                    ar.b(fileInputStream2);
                    throw th;
                }
            } catch (IOException unused2) {
                fileInputStream = null;
            } catch (Throwable th2) {
                th = th2;
            }
            this.k = bArrP;
        }
        byte[] bArr2 = (byte[]) this.k;
        if (bArr2 == null) {
            return null;
        }
        return Arrays.copyOf(bArr2, bArr2.length);
    }

    public hp n(final int i, final long j, final String str) {
        final String strN;
        t93 t93Var = (t93) this.g;
        if (i > t93Var.a) {
            c82 c82Var = (c82) this.j;
            if (c82Var == null || !t93Var.d) {
                return na1.t(sc3.h);
            }
            vc3.C.k.getClass();
            ym0 ym0Var = new ym0(System.currentTimeMillis(), "", str, 2);
            bw1 bw1Var = c82Var.a;
            bw1Var.getClass();
            bw1Var.a(new z61(bw1Var, 20, ym0Var));
            return na1.t(sc3.i);
        }
        final int i2 = 1;
        if (((Boolean) tu0.e.c.a(lx0.k9)).booleanValue()) {
            Uri uri = Uri.parse(str);
            String encodedQuery = uri.getEncodedQuery();
            Uri.Builder builderClearQuery = uri.buildUpon().clearQuery();
            builderClearQuery.appendQueryParameter("pa", Integer.toString(i));
            String strValueOf = String.valueOf(builderClearQuery.build());
            strN = ec.n(new StringBuilder(strValueOf.length() + 1 + String.valueOf(encodedQuery).length()), strValueOf, "&", encodedQuery);
        } else {
            strN = str;
        }
        xm2 xm2Var = new xm2() { // from class: b82
            @Override // defpackage.xm2
            public final hp b(Object obj) {
                sc3 sc3Var = (sc3) obj;
                if (sc3Var != sc3.h) {
                    return na1.t(sc3Var);
                }
                kd0 kd0Var = this.a;
                t93 t93Var2 = (t93) kd0Var.g;
                long j2 = t93Var2.b;
                int i3 = i;
                if (i3 != 1) {
                    j2 = (long) (t93Var2.c * j);
                }
                return kd0Var.n(i3 + 1, j2, str);
            }
        };
        rn2 rn2Var = (rn2) this.i;
        if (j == 0) {
            return na1.L(rn2Var.b(new Callable(this) { // from class: a82
                public final /* synthetic */ kd0 b;

                {
                    this.b = this;
                }

                @Override // java.util.concurrent.Callable
                public final /* synthetic */ Object call() {
                    int i3 = i2;
                    String str2 = strN;
                    kd0 kd0Var = this.b;
                    switch (i3) {
                        case 0:
                            break;
                    }
                    return kd0Var.o(str2);
                }
            }), xm2Var, rn2Var);
        }
        final int i3 = 0;
        Callable callable = new Callable(this) { // from class: a82
            public final /* synthetic */ kd0 b;

            {
                this.b = this;
            }

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                int i4 = i3;
                String str2 = strN;
                kd0 kd0Var = this.b;
                switch (i4) {
                    case 0:
                        break;
                }
                return kd0Var.o(str2);
            }
        };
        rn2Var.getClass();
        xn2 xn2Var = new xn2(callable);
        return na1.L(new pn2(xn2Var, rn2Var.h.schedule(xn2Var, j, TimeUnit.MILLISECONDS)), xm2Var, rn2Var);
    }

    public sc3 o(String str) {
        se1 se1Var;
        id3 id3Var = (id3) this.h;
        ix0 ix0Var = lx0.C9;
        tu0 tu0Var = tu0.e;
        if (((Boolean) tu0Var.c.a(ix0Var)).booleanValue() && (se1Var = (se1) this.k) != null) {
            vc3 vc3Var = vc3.C;
            if (vc3Var.c.F(str) || vc3Var.c.G(str)) {
                e63 e63Var = se1Var.c;
                String strEncodeToString = e63Var != null ? Base64.encodeToString(e63Var.b(), 10) : null;
                HashMap map = new HashMap();
                if (strEncodeToString != null) {
                    map.put((String) tu0Var.c.a(lx0.D9), strEncodeToString);
                }
                return id3Var.a(str, map);
            }
        }
        return id3Var.a(str, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.hn2
    public void w(Throwable th) {
        d72 d72Var;
        d72 d72Var2;
        d72 d72Var3;
        d72 d72Var4;
        boolean z = false;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        switch (this.f) {
            case 0:
                String message = th.getMessage();
                if (((Boolean) tu0.e.c.a(lx0.h8)).booleanValue()) {
                    vc3.C.h.e("SignalGeneratorImpl.generateSignals", th);
                } else {
                    vc3.C.h.d("SignalGeneratorImpl.generateSignals", th);
                }
                d72 d72VarK3 = ep0.K3((hp) this.g, (ma1) this.h);
                if (((Boolean) my0.e.u()).booleanValue() && d72VarK3 != null) {
                    a72 a72Var = (a72) this.j;
                    a72Var.f(th);
                    a72Var.b(false);
                    d72VarK3.a(a72Var);
                    d72VarK3.h();
                }
                fa1 fa1Var = (fa1) this.i;
                if (fa1Var == null) {
                    return;
                }
                try {
                    if (!"Unknown format is no longer supported.".equals(message)) {
                        StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 16);
                        sb.append("Internal error. ");
                        sb.append(message);
                        message = sb.toString();
                    }
                    fa1Var.w(message);
                    return;
                } catch (RemoteException e) {
                    jn.P("", e);
                    return;
                }
            case 7:
                a72 a72Var2 = (a72) this.j;
                if (((Boolean) tu0.e.c.a(lx0.h6)).booleanValue()) {
                    jn.w("Native ad failed to load", th);
                }
                hf1 hf1Var = (hf1) this.i;
                fu1 fu1VarV = a23.v(th, ((vi1) hf1Var.n.c()).l);
                ((dk1) hf1Var.j.c()).Z(fu1VarV);
                es0 es0Var = (es0) this.k;
                ((if1) es0Var.g).b().execute(new hb1(this, fu1VarV, 26, objArr == true ? 1 : 0));
                dq.w(fu1VarV.f, th, "NativeAdLoader.onFailure");
                ((zx) this.g).mo10a();
                if (!((Boolean) my0.c.u()).booleanValue() || (d72Var = (d72) this.h) == null) {
                    e72 e72Var = (e72) es0Var.j;
                    a72Var2.g(fu1VarV);
                    a72Var2.f(th);
                    a72Var2.b(false);
                    e72Var.b(a72Var2.m());
                    return;
                }
                d72Var.f(fu1VarV);
                a72Var2.f(th);
                a72Var2.b(false);
                d72Var.a(a72Var2);
                d72Var.h();
                return;
            case 8:
                ix0 ix0Var = lx0.h6;
                tu0 tu0Var = tu0.e;
                if (((Boolean) tu0Var.c.a(ix0Var)).booleanValue()) {
                    jn.w("App open ad failed to load", th);
                }
                p32 p32Var = (p32) this.k;
                nf1 nf1Var = (nf1) p32Var.e.l();
                fu1 fu1VarV2 = nf1Var == null ? a23.v(th, null) : a23.v(th, nf1Var.a().l);
                synchronized (p32Var) {
                    try {
                        p32Var.j = null;
                        if (nf1Var != null) {
                            ((dk1) nf1Var.k.c()).Z(fu1VarV2);
                            if (((Boolean) tu0Var.c.a(lx0.P8)).booleanValue()) {
                                p32Var.b.execute(new hb1(this, fu1VarV2, 27, objArr2 == true ? 1 : 0));
                            }
                        } else {
                            p32Var.d.Z(fu1VarV2);
                            p32Var.b((n32) this.i).a().a().f.p();
                        }
                        dq.w(fu1VarV2.f, th, "AppOpenAdLoader.onFailure");
                        ((uz1) this.g).mo10a();
                        if (!((Boolean) my0.c.u()).booleanValue() || (d72Var2 = (d72) this.h) == null) {
                            e72 e72Var2 = p32Var.h;
                            a72 a72Var3 = (a72) this.j;
                            a72Var3.g(fu1VarV2);
                            a72Var3.f(th);
                            a72Var3.b(false);
                            e72Var2.b(a72Var3.m());
                        } else {
                            d72Var2.f(fu1VarV2);
                            a72 a72Var4 = (a72) this.j;
                            a72Var4.f(th);
                            a72Var4.b(false);
                            d72Var2.a(a72Var4);
                            d72Var2.h();
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                    break;
                }
                return;
            case 9:
                ix0 ix0Var2 = lx0.h6;
                tu0 tu0Var2 = tu0.e;
                if (((Boolean) tu0Var2.c.a(ix0Var2)).booleanValue()) {
                    jn.w("Interstitial ad failed to load", th);
                }
                sf1 sf1Var = (sf1) this.i;
                final fu1 fu1VarV3 = a23.v(th, ((vi1) sf1Var.m.c()).l);
                o42 o42Var = (o42) this.k;
                synchronized (o42Var) {
                    try {
                        o42Var.i = null;
                        ((dk1) sf1Var.i.c()).Z(fu1VarV3);
                        if (((Boolean) tu0Var2.c.a(lx0.Q8)).booleanValue()) {
                            Executor executor = o42Var.b;
                            final Object[] objArr4 = objArr3 == true ? 1 : 0;
                            executor.execute(new Runnable(this) { // from class: n42
                                public final /* synthetic */ kd0 g;

                                {
                                    this.g = this;
                                }

                                @Override // java.lang.Runnable
                                public final /* synthetic */ void run() {
                                    int i = objArr4;
                                    fu1 fu1Var = fu1VarV3;
                                    kd0 kd0Var = this.g;
                                    switch (i) {
                                        case 0:
                                            ((o42) kd0Var.k).d.Z(fu1Var);
                                            break;
                                        default:
                                            ((o42) kd0Var.k).e.Z(fu1Var);
                                            break;
                                    }
                                }
                            });
                            final int i = 1;
                            o42Var.b.execute(new Runnable(this) { // from class: n42
                                public final /* synthetic */ kd0 g;

                                {
                                    this.g = this;
                                }

                                @Override // java.lang.Runnable
                                public final /* synthetic */ void run() {
                                    int i2 = i;
                                    fu1 fu1Var = fu1VarV3;
                                    kd0 kd0Var = this.g;
                                    switch (i2) {
                                        case 0:
                                            ((o42) kd0Var.k).d.Z(fu1Var);
                                            break;
                                        default:
                                            ((o42) kd0Var.k).e.Z(fu1Var);
                                            break;
                                    }
                                }
                            });
                        }
                        dq.w(fu1VarV3.f, th, "InterstitialAdLoader.onFailure");
                        ((uz1) this.g).mo10a();
                        if (!((Boolean) my0.c.u()).booleanValue() || (d72Var3 = (d72) this.h) == null) {
                            e72 e72Var3 = o42Var.g;
                            a72 a72Var5 = (a72) this.j;
                            a72Var5.g(fu1VarV3);
                            a72Var5.f(th);
                            a72Var5.b(false);
                            e72Var3.b(a72Var5.m());
                        } else {
                            d72Var3.f(fu1VarV3);
                            a72 a72Var6 = (a72) this.j;
                            a72Var6.f(th);
                            a72Var6.b(false);
                            d72Var3.a(a72Var6);
                            d72Var3.h();
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                    break;
                }
                return;
            default:
                if (((Boolean) tu0.e.c.a(lx0.h6)).booleanValue()) {
                    jn.w("Rewarded ad failed to load", th);
                }
                s42 s42Var = (s42) this.k;
                wf1 wf1Var = (wf1) s42Var.e.l();
                fu1 fu1VarV4 = wf1Var == null ? a23.v(th, null) : a23.v(th, wf1Var.a().l);
                synchronized (s42Var) {
                    try {
                        if (wf1Var != null) {
                            ((dk1) wf1Var.m.c()).Z(fu1VarV4);
                            s42Var.b.execute(new hb1(this, fu1VarV4, 29, z));
                        } else {
                            s42Var.d.Z(fu1VarV4);
                            s42Var.b((r42) this.i).b().a().f.p();
                        }
                        dq.w(fu1VarV4.f, th, "RewardedAdLoader.onFailure");
                        ((uz1) this.g).mo10a();
                        if (!((Boolean) my0.c.u()).booleanValue() || (d72Var4 = (d72) this.h) == null) {
                            e72 e72Var4 = s42Var.g;
                            a72 a72Var7 = (a72) this.j;
                            a72Var7.g(fu1VarV4);
                            a72Var7.f(th);
                            a72Var7.b(false);
                            e72Var4.b(a72Var7.m());
                        } else {
                            d72Var4.f(fu1VarV4);
                            a72 a72Var8 = (a72) this.j;
                            a72Var8.f(th);
                            a72Var8.b(false);
                            d72Var4.a(a72Var8);
                            d72Var4.h();
                        }
                    } catch (Throwable th4) {
                        throw th4;
                    }
                    break;
                }
                return;
        }
    }

    private final void j() {
    }

    @Override // defpackage.yd2
    public void h() {
    }

    public /* synthetic */ kd0(Object obj, hp hpVar, Object obj2, Object obj3, Object obj4, int i) {
        this.f = i;
        this.g = hpVar;
        this.h = obj2;
        this.i = obj3;
        this.j = obj4;
        this.k = obj;
    }

    public /* synthetic */ kd0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.f = i;
        this.g = obj;
        this.h = obj2;
        this.i = obj3;
        this.j = obj4;
        this.k = obj5;
    }

    public /* synthetic */ kd0(Object obj, uz1 uz1Var, d72 d72Var, a72 a72Var, Object obj2, int i) {
        this.f = i;
        this.g = uz1Var;
        this.h = d72Var;
        this.j = a72Var;
        this.i = obj2;
        this.k = obj;
    }

    public kd0(ht0 ht0Var, File file, File file2, File file3) {
        this.f = 13;
        this.g = ht0Var;
        this.h = file;
        this.i = file3;
        this.j = file2;
    }

    public kd0(Context context, String str, String str2) {
        this.f = 12;
        this.h = str;
        this.i = str2;
        HandlerThread handlerThread = new HandlerThread("GassClient");
        this.k = handlerThread;
        handlerThread.start();
        va2 va2Var = new va2(context, handlerThread.getLooper(), this, this, 9200000);
        this.g = va2Var;
        this.j = new LinkedBlockingQueue();
        va2Var.m();
    }

    public kd0(Context context, yd1 yd1Var, yd1 yd1Var2, es1 es1Var) {
        this.f = 4;
        this.g = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.i = yd1Var;
        this.h = yd1Var2;
        this.k = null;
        this.j = es1Var;
    }

    public kd0(lj0 lj0Var, HashMap map, HashMap map2, HashMap map3) {
        this.f = 1;
        this.g = lj0Var;
        this.j = map2;
        this.k = map3;
        this.i = Collections.unmodifiableMap(map);
        TreeSet treeSet = new TreeSet();
        int i = 0;
        lj0Var.f(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i] = ((Long) it.next()).longValue();
            i++;
        }
        this.h = jArr;
    }

    public kd0(Context context, c41 c41Var, d60 d60Var) {
        this.f = 3;
        this.g = new Object();
        this.h = context.getApplicationContext();
        this.k = d60Var;
        this.j = c41Var;
    }
}
