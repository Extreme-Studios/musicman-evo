package defpackage;

import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes.dex */
public final class f03 implements go2 {
    public static final byte[] e = {0};
    public final au2 a;
    public final int b;
    public final byte[] c;
    public final byte[] d;

    public f03(jt2 jt2Var) {
        String strValueOf = String.valueOf(jt2Var.J.d);
        this.a = new g2("HMAC".concat(strValueOf), new SecretKeySpec(((j03) jt2Var.K.g).b(), "HMAC"));
        pt2 pt2Var = jt2Var.J;
        this.b = pt2Var.b;
        this.c = jt2Var.L.b();
        if (pt2Var.c != ot2.d) {
            this.d = new byte[0];
        } else {
            this.d = Arrays.copyOf(e, 1);
        }
    }

    public f03(dt2 dt2Var) {
        this.a = a23.x(yt2.I(zt2.b(dt2Var.J.a), dt2Var.K));
        gt2 gt2Var = dt2Var.J;
        this.b = gt2Var.b;
        this.c = dt2Var.L.b();
        if (gt2Var.c != ao2.p) {
            this.d = new byte[0];
        } else {
            this.d = Arrays.copyOf(e, 1);
        }
    }

    public f03(g2 g2Var, int i) throws InvalidAlgorithmParameterException {
        this.a = g2Var;
        this.b = i;
        this.c = new byte[0];
        this.d = new byte[0];
        g2Var.i(i, new byte[0]);
    }
}
