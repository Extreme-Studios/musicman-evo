package defpackage;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes.dex */
public class sr2 {
    public final String a;
    public final Class b;
    public final int c;

    public sr2(String str, Class cls, int i) {
        this.a = str;
        this.b = cls;
        this.c = i;
    }

    public final Object a(n13 n13Var) throws GeneralSecurityException {
        return ((rs2) ds2.b.a.get()).a(fs2.b.e(ts2.j(this.a, n13Var, this.c, yw2.RAW, null)), this.b);
    }
}
