package defpackage;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class pg2 implements oe2 {
    public final Context f;
    public final ArrayList g = new ArrayList();
    public final yh2 h;
    public dj2 i;
    public ja2 j;
    public xc2 k;
    public oe2 l;
    public lq2 m;
    public hd2 n;
    public xc2 o;
    public oe2 p;

    public pg2(Context context, yh2 yh2Var) {
        this.f = context.getApplicationContext();
        this.h = yh2Var;
    }

    public static final void e(oe2 oe2Var, qp2 qp2Var) {
        if (oe2Var != null) {
            oe2Var.c(qp2Var);
        }
    }

    @Override // defpackage.oe2
    public final long a(eg2 eg2Var) {
        hn.M(this.p == null);
        Uri uri = eg2Var.a;
        String scheme = uri.getScheme();
        String str = qz1.a;
        String scheme2 = uri.getScheme();
        boolean zIsEmpty = TextUtils.isEmpty(scheme2);
        Context context = this.f;
        if (zIsEmpty || Objects.equals(scheme2, "file")) {
            String path = uri.getPath();
            if (path == null || !path.startsWith("/android_asset/")) {
                if (this.i == null) {
                    dj2 dj2Var = new dj2(false);
                    this.i = dj2Var;
                    b(dj2Var);
                }
                this.p = this.i;
            } else {
                if (this.j == null) {
                    ja2 ja2Var = new ja2(context);
                    this.j = ja2Var;
                    b(ja2Var);
                }
                this.p = this.j;
            }
        } else if ("asset".equals(scheme)) {
            if (this.j == null) {
                ja2 ja2Var2 = new ja2(context);
                this.j = ja2Var2;
                b(ja2Var2);
            }
            this.p = this.j;
        } else if ("content".equals(scheme)) {
            if (this.k == null) {
                xc2 xc2Var = new xc2(context, 0);
                this.k = xc2Var;
                b(xc2Var);
            }
            this.p = this.k;
        } else {
            boolean zEquals = "rtmp".equals(scheme);
            yh2 yh2Var = this.h;
            if (zEquals) {
                if (this.l == null) {
                    try {
                        oe2 oe2Var = (oe2) Class.forName("androidx.media3.datasource.rtmp.RtmpDataSource").getConstructor(null).newInstance(null);
                        this.l = oe2Var;
                        b(oe2Var);
                    } catch (ClassNotFoundException unused) {
                        s90.Q("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
                    } catch (Exception e) {
                        j7.h("Error instantiating RTMP extension", e);
                        return 0L;
                    }
                    if (this.l == null) {
                        this.l = yh2Var;
                    }
                }
                this.p = this.l;
            } else if ("udp".equals(scheme)) {
                if (this.m == null) {
                    lq2 lq2Var = new lq2();
                    this.m = lq2Var;
                    b(lq2Var);
                }
                this.p = this.m;
            } else if ("data".equals(scheme)) {
                if (this.n == null) {
                    hd2 hd2Var = new hd2(false);
                    this.n = hd2Var;
                    b(hd2Var);
                }
                this.p = this.n;
            } else if ("rawresource".equals(scheme) || "android.resource".equals(scheme)) {
                if (this.o == null) {
                    xc2 xc2Var2 = new xc2(context, 1);
                    this.o = xc2Var2;
                    b(xc2Var2);
                }
                this.p = this.o;
            } else {
                this.p = yh2Var;
            }
        }
        return this.p.a(eg2Var);
    }

    public final void b(oe2 oe2Var) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.g;
            if (i >= arrayList.size()) {
                return;
            }
            oe2Var.c((qp2) arrayList.get(i));
            i++;
        }
    }

    @Override // defpackage.oe2
    public final void c(qp2 qp2Var) {
        qp2Var.getClass();
        this.h.c(qp2Var);
        this.g.add(qp2Var);
        e(this.i, qp2Var);
        e(this.j, qp2Var);
        e(this.k, qp2Var);
        e(this.l, qp2Var);
        e(this.m, qp2Var);
        e(this.n, qp2Var);
        e(this.o, qp2Var);
    }

    @Override // defpackage.k73
    public final int d(byte[] bArr, int i, int i2) {
        oe2 oe2Var = this.p;
        oe2Var.getClass();
        return oe2Var.d(bArr, i, i2);
    }

    @Override // defpackage.oe2
    public final Map g() {
        oe2 oe2Var = this.p;
        return oe2Var == null ? Collections.EMPTY_MAP : oe2Var.g();
    }

    @Override // defpackage.oe2
    public final Uri h() {
        oe2 oe2Var = this.p;
        if (oe2Var == null) {
            return null;
        }
        return oe2Var.h();
    }

    @Override // defpackage.oe2
    public final void l() {
        oe2 oe2Var = this.p;
        if (oe2Var != null) {
            try {
                oe2Var.l();
            } finally {
                this.p = null;
            }
        }
    }
}
