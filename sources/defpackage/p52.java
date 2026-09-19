package defpackage;

import android.util.Base64;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes.dex */
public final class p52 {
    public static final String a(byte[] bArr, byte[] bArr2, String str, cs1 cs1Var) {
        r52 r52VarZ;
        if (str != null) {
            try {
                try {
                    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(Base64.decode(str, 11));
                    try {
                        v13 v13Var = v13.a;
                        int i = h13.a;
                        lw2 lw2VarE = lw2.E(byteArrayInputStream, v13.b);
                        byteArrayInputStream.close();
                        r52VarZ = r52.z(lw2VarE);
                    } catch (Throwable th) {
                        byteArrayInputStream.close();
                        throw th;
                    }
                } catch (IOException unused) {
                    throw new GeneralSecurityException("Parse keyset failed");
                }
            } catch (GeneralSecurityException e) {
                jn.p("Failed to get keysethandle".concat(e.toString()));
                vc3.C.h.d("CryptoUtils.getHandle", e);
                r52VarZ = null;
            }
            if (r52VarZ != null) {
                try {
                    byte[] bArrA = ((yn2) r52VarZ.U(ar.u(), yn2.class)).a(bArr, bArr2);
                    cs1Var.a.put("ds", "1");
                    return new String(bArrA, "UTF-8");
                } catch (UnsupportedEncodingException | UnsupportedOperationException | GeneralSecurityException e2) {
                    jn.p("Failed to decrypt ".concat(e2.toString()));
                    vc3.C.h.d("CryptoUtils.decrypt", e2);
                    cs1Var.a.put("dsf", e2.toString());
                }
            }
        }
        return null;
    }
}
