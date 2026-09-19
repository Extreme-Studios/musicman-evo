package defpackage;

import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class zt2 extends ho2 {
    public final int a;

    public zt2(int i) {
        this.a = i;
    }

    public static zt2 b(int i) throws InvalidAlgorithmParameterException {
        if (i == 16 || i == 32) {
            return new zt2(i);
        }
        throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 128-bit and 256-bit are supported", Integer.valueOf(i * 8)));
    }

    @Override // defpackage.ho2
    public final boolean a() {
        return false;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof zt2) && ((zt2) obj).a == this.a;
    }

    public final int hashCode() {
        return Objects.hash(zt2.class, Integer.valueOf(this.a));
    }

    public final String toString() {
        int i = this.a;
        return ec.k(new StringBuilder(String.valueOf(i).length() + 34), "AesCmac PRF Parameters (", i, "-byte key)");
    }
}
