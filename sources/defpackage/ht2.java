package defpackage;

import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes.dex */
public final class ht2 {
    public static ht2 a(dt2 dt2Var, Provider provider) throws GeneralSecurityException {
        ht2 ht2Var = new ht2();
        if (!jn.r(1)) {
            j7.r("Cannot use AES-CMAC in FIPS-mode.");
            return null;
        }
        try {
            Mac.getInstance("AESCMAC", provider);
            dt2Var.L.b();
            new SecretKeySpec(((j03) dt2Var.K.g).b(), "AES");
            return ht2Var;
        } catch (NoSuchAlgorithmException e) {
            throw new GeneralSecurityException("AES-CMAC not available.", e);
        }
    }
}
