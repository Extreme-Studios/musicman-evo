package defpackage;

import android.os.Build;
import java.math.BigInteger;
import java.security.KeyFactory;
import java.security.NoSuchProviderException;
import java.security.Provider;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.RSAPublicKeySpec;
import java.util.Collections;
import java.util.HashMap;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public abstract class g03 implements jo2 {
    public static final byte[] a = new byte[0];
    public static final byte[] b = {0};
    public static final z61 c;

    static {
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        d03 d03Var = d03.f;
        ry2 ry2Var = ry2.b;
        map.put(d03Var, ry2Var);
        map2.put(ry2Var, d03Var);
        d03 d03Var2 = d03.g;
        ry2 ry2Var2 = ry2.c;
        map.put(d03Var2, ry2Var2);
        map2.put(ry2Var2, d03Var2);
        d03 d03Var3 = d03.h;
        ry2 ry2Var3 = ry2.d;
        map.put(d03Var3, ry2Var3);
        map2.put(ry2Var3, d03Var3);
        c = new z61(Collections.unmodifiableMap(map), 25, Collections.unmodifiableMap(map2));
    }

    public static jo2 b(vy2 vy2Var) {
        try {
            int i = ct2.a;
            if (Objects.equals(System.getProperty("java.vendor"), "The Android Project")) {
                (!Objects.equals(System.getProperty("java.vendor"), "The Android Project") ? null : Integer.valueOf(Build.VERSION.SDK_INT)).getClass();
            }
            Provider providerS = ar.s();
            if (providerS != null) {
                return qz2.c(vy2Var, providerS);
            }
            throw new NoSuchProviderException("RSA-PKCS1.5 using Conscrypt is not supported.");
        } catch (NoSuchProviderException unused) {
            KeyFactory keyFactory = (KeyFactory) a03.g.a.l("RSA");
            BigInteger bigInteger = vy2Var.K;
            ty2 ty2Var = vy2Var.J;
            return new mz2((RSAPublicKey) keyFactory.generatePublic(new RSAPublicKeySpec(bigInteger, ty2Var.b)), (d03) c.D(ty2Var.d), vy2Var.L.b(), ty2Var.c.equals(sy2.d) ? b : a);
        }
    }
}
