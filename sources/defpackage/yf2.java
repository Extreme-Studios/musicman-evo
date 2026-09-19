package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import java.io.File;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.Objects;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class yf2 implements xm2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ bg2 b;

    public /* synthetic */ yf2(bg2 bg2Var, int i) {
        this.a = i;
        this.b = bg2Var;
    }

    @Override // defpackage.xm2
    public final hp b(Object obj) {
        hp hpVarM;
        int i;
        int i2 = this.a;
        final bg2 bg2Var = this.b;
        final int i3 = 0;
        final int i4 = 1;
        cn2 cn2Var = cn2.f;
        switch (i2) {
            case 0:
                final lg2 lg2Var = bg2Var.b;
                switch (lg2Var.a) {
                    case 0:
                        o63 o63Var = (o63) lg2Var.e;
                        Objects.requireNonNull(o63Var);
                        s22 s22Var = new s22(8, o63Var);
                        ExecutorService executorService = lg2Var.c;
                        wl2 wl2VarI = na1.I(na1.M(na1.L(na1.M(fn2.r(na1.F(s22Var, executorService)), new wh2() { // from class: kg2
                            @Override // defpackage.wh2
                            public final Object apply(Object obj2) {
                                int i5 = i4;
                                boolean zA = false;
                                lg2 lg2Var2 = lg2Var;
                                switch (i5) {
                                    case 0:
                                        fe2 fe2Var = (fe2) obj2;
                                        o63 o63Var2 = (o63) lg2Var2.e;
                                        String strZ = fe2Var.z().z();
                                        String strA = fe2Var.z().A();
                                        dh2 dh2Var = lg2Var2.d;
                                        ch2 ch2VarA = dh2Var.a(15203);
                                        try {
                                            ch2VarA.a();
                                            cb2 cb2VarZ = s90.z(lg2Var2.b, (ct0) o63Var2.c(), strZ, strA, (ga2) lg2Var2.h);
                                            int i6 = cb2VarZ.h;
                                            ch2VarA.c();
                                            int i7 = 2;
                                            if (i6 == 2) {
                                                dh2Var.b(15208);
                                                return lg2.b(4);
                                            }
                                            byte[] bArr = cb2VarZ.g;
                                            if (bArr == null || bArr.length == 0) {
                                                dh2Var.b(5010);
                                                return lg2.b(8);
                                            }
                                            try {
                                                dt0 dt0VarD = dt0.D(bArr, v13.a());
                                                if (dt0VarD.z().z().isEmpty() || dt0VarD.z().A().isEmpty() || dt0VarD.B().p().length == 0) {
                                                    dh2Var.b(15207);
                                                } else {
                                                    if (fe2Var.equals(fe2.D()) || !TextUtils.equals(fe2Var.z().z(), dt0VarD.z().z()) || !TextUtils.equals(fe2Var.z().A(), dt0VarD.z().A())) {
                                                        if (i6 == 4) {
                                                            fg2 fg2Var = (fg2) lg2Var2.g;
                                                            byte[] bArrP = dt0VarD.A().p();
                                                            File file = fg2Var.a;
                                                            try {
                                                                i8.A(file);
                                                                i8.w(file, bArrP);
                                                                fg2Var.b.getClass();
                                                                zA = fa2.a(file);
                                                            } catch (IOException | GeneralSecurityException e) {
                                                                fg2Var.c.c(2027, e);
                                                            }
                                                            try {
                                                                file.delete();
                                                                break;
                                                            } catch (SecurityException unused) {
                                                            }
                                                            if (!zA) {
                                                                dh2Var.b(15206);
                                                                return lg2.b(12);
                                                            }
                                                            i6 = 4;
                                                            break;
                                                        }
                                                        vd2 vd2VarC = wd2.C();
                                                        if (i6 == 2) {
                                                            i7 = 4;
                                                        } else if (i6 != 3) {
                                                            i7 = i6 != 4 ? i6 != 6 ? 1 : 5 : 3;
                                                        }
                                                        vd2VarC.b();
                                                        ((wd2) vd2VarC.g).H(i7);
                                                        xd2 xd2VarC = fe2.C();
                                                        ht0 ht0VarZ = dt0VarD.z();
                                                        xd2VarC.b();
                                                        ((fe2) xd2VarC.g).E(ht0VarZ);
                                                        ct0 ct0Var = (ct0) o63Var2.c();
                                                        xd2VarC.b();
                                                        ((fe2) xd2VarC.g).G(ct0Var);
                                                        fe2 fe2Var2 = (fe2) xd2VarC.c();
                                                        vd2VarC.b();
                                                        ((wd2) vd2VarC.g).D(fe2Var2);
                                                        n13 n13VarA = dt0VarD.A();
                                                        vd2VarC.b();
                                                        ((wd2) vd2VarC.g).F(n13VarA);
                                                        n13 n13VarB = dt0VarD.B();
                                                        vd2VarC.b();
                                                        ((wd2) vd2VarC.g).E(n13VarB);
                                                        return (wd2) vd2VarC.c();
                                                    }
                                                    dh2Var.b(15209);
                                                }
                                                return lg2.b(11);
                                            } catch (NullPointerException unused2) {
                                                dh2Var.b(15210);
                                                return lg2.b(10);
                                            } catch (o23 e2) {
                                                dh2Var.c(15205, e2);
                                                return lg2.b(9);
                                            }
                                        } catch (Throwable th) {
                                            try {
                                                ch2VarA.b(th);
                                                throw th;
                                            } catch (Throwable th2) {
                                                ch2VarA.c();
                                                throw th2;
                                            }
                                        }
                                    default:
                                        ct0 ct0Var2 = (ct0) obj2;
                                        if (rs0.s(ct0Var2)) {
                                            return new Integer(0);
                                        }
                                        lg2Var2.d.a.b(15203, -1L, null, ct0Var2.name());
                                        throw new jg2();
                                }
                            }
                        }, cn2Var), new r21(18, lg2Var), cn2Var), new wh2() { // from class: kg2
                            @Override // defpackage.wh2
                            public final Object apply(Object obj2) {
                                int i5 = i3;
                                boolean zA = false;
                                lg2 lg2Var2 = lg2Var;
                                switch (i5) {
                                    case 0:
                                        fe2 fe2Var = (fe2) obj2;
                                        o63 o63Var2 = (o63) lg2Var2.e;
                                        String strZ = fe2Var.z().z();
                                        String strA = fe2Var.z().A();
                                        dh2 dh2Var = lg2Var2.d;
                                        ch2 ch2VarA = dh2Var.a(15203);
                                        try {
                                            ch2VarA.a();
                                            cb2 cb2VarZ = s90.z(lg2Var2.b, (ct0) o63Var2.c(), strZ, strA, (ga2) lg2Var2.h);
                                            int i6 = cb2VarZ.h;
                                            ch2VarA.c();
                                            int i7 = 2;
                                            if (i6 == 2) {
                                                dh2Var.b(15208);
                                                return lg2.b(4);
                                            }
                                            byte[] bArr = cb2VarZ.g;
                                            if (bArr == null || bArr.length == 0) {
                                                dh2Var.b(5010);
                                                return lg2.b(8);
                                            }
                                            try {
                                                dt0 dt0VarD = dt0.D(bArr, v13.a());
                                                if (dt0VarD.z().z().isEmpty() || dt0VarD.z().A().isEmpty() || dt0VarD.B().p().length == 0) {
                                                    dh2Var.b(15207);
                                                } else {
                                                    if (fe2Var.equals(fe2.D()) || !TextUtils.equals(fe2Var.z().z(), dt0VarD.z().z()) || !TextUtils.equals(fe2Var.z().A(), dt0VarD.z().A())) {
                                                        if (i6 == 4) {
                                                            fg2 fg2Var = (fg2) lg2Var2.g;
                                                            byte[] bArrP = dt0VarD.A().p();
                                                            File file = fg2Var.a;
                                                            try {
                                                                i8.A(file);
                                                                i8.w(file, bArrP);
                                                                fg2Var.b.getClass();
                                                                zA = fa2.a(file);
                                                            } catch (IOException | GeneralSecurityException e) {
                                                                fg2Var.c.c(2027, e);
                                                            }
                                                            try {
                                                                file.delete();
                                                                break;
                                                            } catch (SecurityException unused) {
                                                            }
                                                            if (!zA) {
                                                                dh2Var.b(15206);
                                                                return lg2.b(12);
                                                            }
                                                            i6 = 4;
                                                            break;
                                                        }
                                                        vd2 vd2VarC = wd2.C();
                                                        if (i6 == 2) {
                                                            i7 = 4;
                                                        } else if (i6 != 3) {
                                                            i7 = i6 != 4 ? i6 != 6 ? 1 : 5 : 3;
                                                        }
                                                        vd2VarC.b();
                                                        ((wd2) vd2VarC.g).H(i7);
                                                        xd2 xd2VarC = fe2.C();
                                                        ht0 ht0VarZ = dt0VarD.z();
                                                        xd2VarC.b();
                                                        ((fe2) xd2VarC.g).E(ht0VarZ);
                                                        ct0 ct0Var = (ct0) o63Var2.c();
                                                        xd2VarC.b();
                                                        ((fe2) xd2VarC.g).G(ct0Var);
                                                        fe2 fe2Var2 = (fe2) xd2VarC.c();
                                                        vd2VarC.b();
                                                        ((wd2) vd2VarC.g).D(fe2Var2);
                                                        n13 n13VarA = dt0VarD.A();
                                                        vd2VarC.b();
                                                        ((wd2) vd2VarC.g).F(n13VarA);
                                                        n13 n13VarB = dt0VarD.B();
                                                        vd2VarC.b();
                                                        ((wd2) vd2VarC.g).E(n13VarB);
                                                        return (wd2) vd2VarC.c();
                                                    }
                                                    dh2Var.b(15209);
                                                }
                                                return lg2.b(11);
                                            } catch (NullPointerException unused2) {
                                                dh2Var.b(15210);
                                                return lg2.b(10);
                                            } catch (o23 e2) {
                                                dh2Var.c(15205, e2);
                                                return lg2.b(9);
                                            }
                                        } catch (Throwable th) {
                                            try {
                                                ch2VarA.b(th);
                                                throw th;
                                            } catch (Throwable th2) {
                                                ch2VarA.c();
                                                throw th2;
                                            }
                                        }
                                    default:
                                        ct0 ct0Var2 = (ct0) obj2;
                                        if (rs0.s(ct0Var2)) {
                                            return new Integer(0);
                                        }
                                        lg2Var2.d.a.b(15203, -1L, null, ct0Var2.name());
                                        throw new jg2();
                                }
                            }
                        }, executorService), jg2.class, zf2.e, cn2Var);
                        lg2Var.d.d(15202, wl2VarI);
                        hpVarM = wl2VarI;
                        break;
                    default:
                        ks0 ks0VarZ = ls0.z();
                        byte[] bArrT = rs0.t();
                        l13 l13Var = n13.g;
                        l13 l13VarN = n13.n(bArrT, 0, bArrT.length);
                        ks0VarZ.b();
                        ((ls0) ks0VarZ.g).A(l13VarN);
                        long j = Build.VERSION.SDK_INT;
                        ks0VarZ.b();
                        ((ls0) ks0VarZ.g).B(j);
                        String str = Build.MODEL;
                        ks0VarZ.b();
                        ((ls0) ks0VarZ.g).C(str);
                        Context context = lg2Var.b;
                        String packageName = context.getPackageName();
                        ks0VarZ.b();
                        ((ls0) ks0VarZ.g).D(packageName);
                        try {
                            i = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
                        } catch (PackageManager.NameNotFoundException unused) {
                            i = -1;
                        }
                        gd2 gd2Var = (gd2) lg2Var.e;
                        dh2 dh2Var = lg2Var.d;
                        ks0VarZ.b();
                        ((ls0) ks0VarZ.g).E(i);
                        String str2 = (String) lg2Var.f;
                        ks0VarZ.b();
                        ((ls0) ks0VarZ.g).F(str2);
                        byte[] bArrB = ((ls0) ks0VarZ.c()).b();
                        gl2 gl2Var = il2.e;
                        if (gl2Var.b != null) {
                            gl2Var = new gl2(gl2Var.a, (Character) null);
                        }
                        hpVarM = na1.M(gd2Var.a(Uri.parse((String) lg2Var.g).buildUpon().appendQueryParameter("aspq", gl2Var.g(bArrB.length, bArrB)).build().toString(), false, new byte[0], null), new zl0(14, lg2Var), lg2Var.c);
                        dh2Var.d(20002, hpVarM);
                        break;
                }
                qm2 qm2VarM = na1.M(na1.L(na1.M(fn2.r(hpVarM), new lh0(28), cn2Var), new yf2(bg2Var, i4), cn2Var), lh0.B, cn2Var);
                bg2Var.d.d(1002, qm2VarM);
                return qm2VarM;
            default:
                final wd2 wd2Var = (wd2) obj;
                ng2 ng2Var = bg2Var.c;
                final int i5 = 2;
                if (wd2Var.G() == 2) {
                    return na1.L(fn2.r(ng2Var.c(wd2Var.A().p())), new xm2() { // from class: xf2
                        @Override // defpackage.xm2
                        public final hp b(Object obj2) {
                            xn2 xn2VarA;
                            int i6 = i4;
                            wd2 wd2Var2 = wd2Var;
                            bg2 bg2Var2 = bg2Var;
                            switch (i6) {
                                case 0:
                                    return bg2Var2.c.b(wd2Var2.z());
                                case 1:
                                    return bg2Var2.c.b(wd2Var2.z());
                                default:
                                    byte[] bArrP = wd2Var2.A().p();
                                    ng2 ng2Var2 = bg2Var2.c;
                                    xn2 xn2VarC = ng2Var2.c(bArrP);
                                    byte[] bArrP2 = wd2Var2.B().p();
                                    switch (ng2Var2.a) {
                                        case 0:
                                            xn2VarA = ((kd2) ng2Var2.d.c()).a(bArrP2);
                                            ng2Var2.e.d(15307, xn2VarA);
                                            break;
                                        default:
                                            xn2VarA = ((kd2) ng2Var2.d.c()).a(bArrP2);
                                            ng2Var2.e.d(20307, xn2VarA);
                                            break;
                                    }
                                    return new ym2(vj2.n(new hp[]{xn2VarC, xn2VarA}), true);
                            }
                        }
                    }, cn2Var);
                }
                if (wd2Var.G() == 3) {
                    return na1.L(na1.L(fn2.r(ng2Var.b(fe2.D())), new xm2() { // from class: xf2
                        @Override // defpackage.xm2
                        public final hp b(Object obj2) {
                            xn2 xn2VarA;
                            int i6 = i5;
                            wd2 wd2Var2 = wd2Var;
                            bg2 bg2Var2 = bg2Var;
                            switch (i6) {
                                case 0:
                                    return bg2Var2.c.b(wd2Var2.z());
                                case 1:
                                    return bg2Var2.c.b(wd2Var2.z());
                                default:
                                    byte[] bArrP = wd2Var2.A().p();
                                    ng2 ng2Var2 = bg2Var2.c;
                                    xn2 xn2VarC = ng2Var2.c(bArrP);
                                    byte[] bArrP2 = wd2Var2.B().p();
                                    switch (ng2Var2.a) {
                                        case 0:
                                            xn2VarA = ((kd2) ng2Var2.d.c()).a(bArrP2);
                                            ng2Var2.e.d(15307, xn2VarA);
                                            break;
                                        default:
                                            xn2VarA = ((kd2) ng2Var2.d.c()).a(bArrP2);
                                            ng2Var2.e.d(20307, xn2VarA);
                                            break;
                                    }
                                    return new ym2(vj2.n(new hp[]{xn2VarC, xn2VarA}), true);
                            }
                        }
                    }, cn2Var), new xm2() { // from class: xf2
                        @Override // defpackage.xm2
                        public final hp b(Object obj2) {
                            xn2 xn2VarA;
                            int i6 = i3;
                            wd2 wd2Var2 = wd2Var;
                            bg2 bg2Var2 = bg2Var;
                            switch (i6) {
                                case 0:
                                    return bg2Var2.c.b(wd2Var2.z());
                                case 1:
                                    return bg2Var2.c.b(wd2Var2.z());
                                default:
                                    byte[] bArrP = wd2Var2.A().p();
                                    ng2 ng2Var2 = bg2Var2.c;
                                    xn2 xn2VarC = ng2Var2.c(bArrP);
                                    byte[] bArrP2 = wd2Var2.B().p();
                                    switch (ng2Var2.a) {
                                        case 0:
                                            xn2VarA = ((kd2) ng2Var2.d.c()).a(bArrP2);
                                            ng2Var2.e.d(15307, xn2VarA);
                                            break;
                                        default:
                                            xn2VarA = ((kd2) ng2Var2.d.c()).a(bArrP2);
                                            ng2Var2.e.d(20307, xn2VarA);
                                            break;
                                    }
                                    return new ym2(vj2.n(new hp[]{xn2VarC, xn2VarA}), true);
                            }
                        }
                    }, cn2Var);
                }
                throw new AssertionError("Unreachable");
        }
    }
}
