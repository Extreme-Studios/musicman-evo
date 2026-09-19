package defpackage;

import java.security.GeneralSecurityException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes.dex */
public final class e03 extends ThreadLocal {
    public final /* synthetic */ g2 a;

    public e03(g2 g2Var) {
        this.a = g2Var;
    }

    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        try {
            a03 a03Var = a03.c;
            g2 g2Var = this.a;
            Mac mac = (Mac) a03Var.a.l((String) g2Var.h);
            mac.init((SecretKeySpec) g2Var.j);
            return mac;
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException(e);
        }
    }
}
