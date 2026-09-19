package defpackage;

import java.security.GeneralSecurityException;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class oy2 implements jo2 {
    public final ns2 a;

    public oy2(ns2 ns2Var) {
        this.a = ns2Var;
    }

    @Override // defpackage.jo2
    public final void a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        Iterator it = this.a.a(bArr).iterator();
        while (it.hasNext()) {
            try {
                ((ny2) it.next()).a.a(bArr, bArr2);
                int length = bArr2.length;
                return;
            } catch (GeneralSecurityException unused) {
            }
        }
        j7.r("invalid signature");
    }
}
