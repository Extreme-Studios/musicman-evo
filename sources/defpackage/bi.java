package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.SecureRandom;
import java.util.Random;
import javax.crypto.Cipher;

/* JADX INFO: loaded from: classes.dex */
public final class bi extends ThreadLocal {
    public final /* synthetic */ int a;

    public /* synthetic */ bi(int i) {
        this.a = i;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0069  */
    /* JADX WARN: Code duplicated, block: B:69:0x0064 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        SecureRandom secureRandom;
        Provider provider = null;
        switch (this.a) {
            case 0:
                return new Random();
            case 1:
                return ByteBuffer.allocate(32);
            case 2:
                return 0L;
            case 3:
                try {
                    return (Cipher) a03.b.a.l("AES/GCM/NoPadding");
                } catch (GeneralSecurityException e) {
                    throw new IllegalStateException(e);
                }
            case 4:
                try {
                    Cipher cipher = (Cipher) a03.b.a.l("ChaCha20-Poly1305");
                    if (rq2.b(cipher)) {
                        return cipher;
                    }
                    return null;
                } catch (GeneralSecurityException unused) {
                    return null;
                }
            case 5:
                try {
                    Cipher cipher2 = (Cipher) a03.b.a.l("AES/GCM-SIV/NoPadding");
                    if (pq2.b(cipher2)) {
                        return cipher2;
                    }
                    return null;
                } catch (GeneralSecurityException e2) {
                    throw new IllegalStateException(e2);
                }
            case 6:
                Provider providerS = ar.s();
                if (providerS == null) {
                    provider = (Provider) Class.forName("org.conscrypt.Conscrypt").getMethod("newProvider", null).invoke(null, null);
                    if (provider != null) {
                        secureRandom = SecureRandom.getInstance("SHA1PRNG", provider);
                    } else {
                        secureRandom = new SecureRandom();
                    }
                    break;
                } else {
                    try {
                        secureRandom = SecureRandom.getInstance("SHA1PRNG", providerS);
                    } catch (GeneralSecurityException unused2) {
                        try {
                            provider = (Provider) Class.forName("org.conscrypt.Conscrypt").getMethod("newProvider", null).invoke(null, null);
                        } catch (ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException unused3) {
                        }
                        if (provider != null) {
                            try {
                                secureRandom = SecureRandom.getInstance("SHA1PRNG", provider);
                            } catch (GeneralSecurityException unused4) {
                                secureRandom = new SecureRandom();
                            }
                        } else {
                            secureRandom = new SecureRandom();
                        }
                    }
                    break;
                }
                secureRandom.nextLong();
                return secureRandom;
            case 7:
                try {
                    return (Cipher) a03.b.a.l("AES/ECB/NoPadding");
                } catch (GeneralSecurityException e3) {
                    throw new IllegalStateException(e3);
                }
            case 8:
                try {
                    return (Cipher) a03.b.a.l("AES/CTR/NoPadding");
                } catch (GeneralSecurityException e4) {
                    throw new IllegalStateException(e4);
                }
            default:
                try {
                    return (Cipher) a03.b.a.l("AES/CTR/NOPADDING");
                } catch (GeneralSecurityException e5) {
                    throw new IllegalStateException(e5);
                }
        }
    }
}
