package defpackage;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes.dex */
public final class vq2 extends z4 {
    public final /* synthetic */ int c;

    public vq2(int i, byte[] bArr) throws GeneralSecurityException {
        this.c = i;
        if (!jn.r(1)) {
            j7.r("Can not use ChaCha20Poly1305 in FIPS-mode.");
            throw null;
        }
        this.a = k(1, bArr);
        this.b = k(0, bArr);
    }

    @Override // defpackage.z4
    public final uq2 k(int i, byte[] bArr) {
        switch (this.c) {
            case 0:
                return new uq2(bArr, i, 0);
            default:
                return new uq2(bArr, i, 1);
        }
    }
}
