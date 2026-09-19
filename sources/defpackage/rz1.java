package defpackage;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class rz1 implements uz1, gm1, vu, jd2, sa2, zz2, ii2, hp1, vf3 {
    public final /* synthetic */ int f;
    public Object g;

    public /* synthetic */ rz1(q93 q93Var, b03 b03Var) {
        this.f = 12;
        this.g = b03Var;
    }

    @Override // defpackage.sa2
    public void B(int i, long j) {
        ((y73) this.g).m.b(i, System.currentTimeMillis() - j);
    }

    @Override // defpackage.uz1
    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public void mo10a() {
        switch (this.f) {
            case 0:
                sz1 sz1Var = (sz1) this.g;
                synchronized (sz1Var) {
                    sz1Var.o = null;
                    break;
                }
                return;
            case 1:
                u32 u32Var = (u32) this.g;
                synchronized (u32Var) {
                    u32Var.p = null;
                    break;
                }
                return;
            default:
                v42 v42Var = (v42) this.g;
                synchronized (v42Var) {
                    v42Var.i = null;
                    break;
                }
                return;
        }
    }

    @Override // defpackage.gm1
    /* JADX INFO: renamed from: b */
    public void mo4b(Object obj) {
        switch (this.f) {
            case 3:
                p62 p62Var = (p62) this.g;
                ((v62) obj).P(p62Var.g, (r62) p62Var.f);
                break;
            case 10:
                int i = p73.f0;
                boolean z = ((u83) this.g).l;
                ((ds0) obj).f();
                break;
            default:
                ((r93) obj).b((b03) this.g);
                break;
        }
    }

    @Override // defpackage.vf3
    public qk2 c(int i, cy0 cy0Var, int[] iArr) {
        tj2 tj2Var = vj2.g;
        w40.k0("initialCapacity", 4);
        Object[] objArrCopyOf = new Object[4];
        int i2 = 0;
        int i3 = 0;
        while (i2 < cy0Var.a) {
            int i4 = i;
            cy0 cy0Var2 = cy0Var;
            pf3 pf3Var = new pf3(i4, cy0Var2, i2, (sf3) this.g, iArr[i2]);
            int length = objArrCopyOf.length;
            int i5 = i3 + 1;
            int iD = pj2.d(length, i5);
            if (iD > length) {
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, iD);
            }
            objArrCopyOf[i3] = pf3Var;
            i2++;
            i3 = i5;
            i = i4;
            cy0Var = cy0Var2;
        }
        return vj2.o(objArrCopyOf, i3);
    }

    @Override // defpackage.jd2
    public Object d(FileInputStream fileInputStream) {
        try {
            b33 b33VarO = ((d23) ((f13) this.g)).o();
            v13 v13Var = v13.a;
            int i = h13.a;
            v13 v13Var2 = v13.b;
            c23 c23Var = (c23) b33VarO;
            c23Var.getClass();
            q13 q13Var = new q13(fileInputStream);
            d23 d23VarL = d23.l(c23Var.a, q13Var, v13Var2);
            q13Var.i(0);
            if (d23.w(d23VarL, true)) {
                return d23VarL;
            }
            throw new o23(new o33().getMessage());
        } catch (o23 e) {
            throw new id2("Cannot read proto.", e);
        }
    }

    @Override // defpackage.jd2
    public /* synthetic */ void f(Object obj, FileOutputStream fileOutputStream) {
        ((f13) obj).c(fileOutputStream);
    }

    @Override // defpackage.vu
    public void g(ve3 ve3Var) {
        sc2 sc2Var = (sc2) this.g;
        if (ve3Var.d) {
            sc2Var.cancel(false);
            return;
        }
        if (ve3Var.c()) {
            sc2Var.d(ve3Var.b());
            return;
        }
        Exception excA = ve3Var.a();
        if (excA != null) {
            sc2Var.e(excA);
        } else {
            j7.a();
        }
    }

    @Override // defpackage.jd2
    public /* synthetic */ Object h() {
        return (f13) this.g;
    }

    @Override // defpackage.zz2
    public Object l(String str) throws GeneralSecurityException {
        String[] strArr = {"GmsCore_OpenSSL", "AndroidOpenSSL", "Conscrypt"};
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (int i2 = 0; i2 < 3; i2++) {
            Provider provider = Security.getProvider(strArr[i2]);
            if (provider != null) {
                arrayList.add(provider);
            }
        }
        int size = arrayList.size();
        Exception exc = null;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            try {
                return ((c03) this.g).a(str, (Provider) obj);
            } catch (Exception e) {
                if (exc == null) {
                    exc = e;
                }
            }
        }
        throw new GeneralSecurityException("No good Provider found.", exc);
    }

    @Override // defpackage.uz1
    public void m(mi1 mi1Var) {
        switch (this.f) {
            case 0:
                sz1 sz1Var = (sz1) this.g;
                in1 in1Var = (in1) mi1Var;
                synchronized (sz1Var) {
                    sz1Var.o = in1Var;
                    in1Var.a();
                    break;
                }
                return;
            case 1:
                ph1 ph1Var = (ph1) mi1Var;
                u32 u32Var = (u32) this.g;
                synchronized (u32Var) {
                    try {
                        ph1 ph1Var2 = u32Var.p;
                        if (ph1Var2 != null) {
                            ph1Var2.d();
                        }
                        u32Var.p = ph1Var;
                        md1 md1Var = ph1Var.l;
                        if (md1Var != null) {
                            md1Var.R0(u32Var);
                        }
                        u32Var.k.a(new qh1(ph1Var, u32Var, u32Var.k, u32Var.m));
                        ph1Var.a();
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return;
            default:
                v42 v42Var = (v42) this.g;
                cr1 cr1Var = (cr1) mi1Var;
                synchronized (v42Var) {
                    try {
                        v42Var.i = cr1Var;
                        if (((Boolean) tu0.e.c.a(lx0.T3)).booleanValue()) {
                            cr1Var.u.a = v42Var.h;
                        }
                        v42Var.i.a();
                    } catch (Throwable th2) {
                        throw th2;
                    }
                    break;
                }
                return;
        }
    }

    @Override // defpackage.sa2
    public void r(int i, long j, String str) {
        ((y73) this.g).m.e(i, System.currentTimeMillis() - j, null, null, str);
    }

    public /* synthetic */ rz1(int i, Object obj) {
        this.f = i;
        this.g = obj;
    }

    public /* synthetic */ rz1() {
        this.f = 13;
    }

    @Override // defpackage.ii2
    public /* synthetic */ Object a() {
        return (s70) this.g;
    }
}
