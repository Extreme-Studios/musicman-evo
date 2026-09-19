package defpackage;

import java.security.GeneralSecurityException;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class qo2 implements yn2 {
    public final ns2 a;

    @Override // defpackage.yn2
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        Iterator it = this.a.a(bArr).iterator();
        while (it.hasNext()) {
            try {
                return ((po2) it.next()).a.a(bArr, bArr2);
            } catch (GeneralSecurityException unused) {
            }
        }
        j7.r("decryption failed");
        return null;
    }
}
