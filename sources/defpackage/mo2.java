package defpackage;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes.dex */
public abstract class mo2 {
    public static final ir2 a;

    static {
        try {
            un1 un1Var = new un1(23);
            un1Var.u(ro2.a);
            un1Var.q(new os2(so2.class, yn2.class, ki2.j));
            un1Var.q(new os2(dp2.class, yn2.class, ki2.i));
            un1Var.q(new os2(ip2.class, yn2.class, fi2.j));
            un1Var.q(new os2(zo2.class, yn2.class, fi2.i));
            un1Var.q(new os2(mp2.class, yn2.class, ki2.h));
            un1Var.q(new os2(hq2.class, yn2.class, fi2.h));
            un1Var.q(new os2(eq2.class, yn2.class, fi2.k));
            a = new ir2(new rs2(un1Var));
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException(e);
        }
    }
}
