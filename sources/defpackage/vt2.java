package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class vt2 {
    public static final pt2 a;
    public static final pt2 b;
    public static final gt2 c;

    static {
        nt2 nt2Var = nt2.f;
        nt2 nt2Var2 = nt2.d;
        ot2 ot2Var = ot2.b;
        try {
            u40 u40Var = new u40(21);
            u40Var.j(32);
            u40Var.p(16);
            u40Var.j = ot2Var;
            u40Var.i = nt2Var2;
            a = u40Var.A();
            try {
                u40 u40Var2 = new u40(21);
                u40Var2.j(32);
                u40Var2.p(32);
                u40Var2.j = ot2Var;
                u40Var2.i = nt2Var2;
                u40Var2.A();
                try {
                    u40 u40Var3 = new u40(21);
                    u40Var3.j(64);
                    u40Var3.p(32);
                    u40Var3.j = ot2Var;
                    u40Var3.i = nt2Var;
                    u40Var3.A();
                    try {
                        u40 u40Var4 = new u40(21);
                        u40Var4.j(64);
                        u40Var4.p(64);
                        u40Var4.j = ot2Var;
                        u40Var4.i = nt2Var;
                        b = u40Var4.A();
                        try {
                            r52 r52Var = new r52(29);
                            r52Var.A(32);
                            r52Var.F(16);
                            r52Var.i = ao2.n;
                            c = r52Var.M();
                        } catch (Exception e) {
                            j7.i(e);
                        }
                    } catch (Exception e2) {
                        j7.i(e2);
                    }
                } catch (Exception e3) {
                    j7.i(e3);
                }
            } catch (Exception e4) {
                j7.i(e4);
            }
        } catch (Exception e5) {
            j7.i(e5);
        }
    }
}
