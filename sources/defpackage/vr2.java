package defpackage;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes.dex */
public final class vr2 extends a23 {
    public final ts2 J;

    public vr2(ts2 ts2Var) {
        int i = tr2.b[ec.z(ts2Var.f)];
        this.J = ts2Var;
    }

    public final j03 I() throws GeneralSecurityException {
        ts2 ts2Var = this.J;
        yw2 yw2Var = (yw2) ts2Var.j;
        Integer num = (Integer) ts2Var.k;
        if (yw2Var.equals(yw2.RAW)) {
            return j03.a(new byte[0]);
        }
        if (yw2Var.equals(yw2.TINK)) {
            return gs2.b(num.intValue());
        }
        if (yw2Var.equals(yw2.LEGACY) || yw2Var.equals(yw2.CRUNCHY)) {
            return gs2.a(num.intValue());
        }
        j7.r("Unknown output prefix type");
        return null;
    }

    @Override // defpackage.a23
    public final ho2 u() {
        ts2 ts2Var = this.J;
        return new ur2((String) ts2Var.g, (yw2) ts2Var.j);
    }
}
