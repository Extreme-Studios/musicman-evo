package defpackage;

import java.security.SecureRandom;

/* JADX INFO: loaded from: classes.dex */
public abstract class vs2 {
    public static final bi a = new bi(6);

    public static byte[] a(int i) {
        byte[] bArr = new byte[i];
        ((SecureRandom) a.get()).nextBytes(bArr);
        return bArr;
    }
}
