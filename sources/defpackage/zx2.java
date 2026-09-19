package defpackage;

import java.security.spec.ECParameterSpec;

/* JADX INFO: loaded from: classes.dex */
public final class zx2 {
    public static final zx2 c = new zx2("NIST_P256", hr2.a);
    public static final zx2 d = new zx2("NIST_P384", hr2.b);
    public static final zx2 e = new zx2("NIST_P521", hr2.c);
    public final String a;
    public final ECParameterSpec b;

    public zx2(String str, ECParameterSpec eCParameterSpec) {
        this.a = str;
        this.b = eCParameterSpec;
    }

    public final String toString() {
        return this.a;
    }
}
