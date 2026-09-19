package defpackage;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes.dex */
public final class tz2 {
    public static final bi d = new bi(8);
    public final SecretKeySpec a;
    public final int b;
    public final int c;

    public tz2(int i, byte[] bArr) throws GeneralSecurityException {
        if (!jn.r(2)) {
            j7.r("Can not use AES-CTR in FIPS-mode, as BoringCrypto module is not available.");
            throw null;
        }
        yd.t(bArr.length);
        this.a = new SecretKeySpec(bArr, "AES");
        int blockSize = ((Cipher) d.get()).getBlockSize();
        this.c = blockSize;
        if (i <= blockSize) {
            this.b = i;
        } else {
            j7.r("invalid IV size");
            throw null;
        }
    }
}
