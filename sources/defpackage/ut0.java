package defpackage;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Random;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class ut0 {
    public static final ut0 f = new ut0();
    public final f32 a;
    public final es0 b;
    public final String c;
    public final d60 d;
    public final Random e;

    public ut0() {
        f32 f32Var = new f32();
        f32Var.a = -1.0f;
        e11 e11Var = new e11("com.google.android.gms.ads.AdManagerCreatorImpl", 4);
        e11 e11Var2 = new e11("com.google.android.gms.ads.AdLoaderBuilderCreatorImpl", 3);
        e11 e11Var3 = new e11("com.google.android.gms.ads.MobileAdsSettingManagerCreatorImpl", 2);
        e11 e11Var4 = new e11("com.google.android.gms.ads.NativeAdViewDelegateCreatorImpl", 0);
        e11 e11Var5 = new e11("com.google.android.gms.ads.AdOverlayCreatorImpl", 1);
        e11 e11Var6 = new e11("com.google.android.gms.ads.AdPreloaderRemoteCreatorImpl", 5);
        es0 es0Var = new es0();
        es0Var.f = e11Var;
        es0Var.g = e11Var2;
        es0Var.h = e11Var3;
        es0Var.i = e11Var4;
        es0Var.j = e11Var5;
        es0Var.k = e11Var6;
        UUID uuidRandomUUID = UUID.randomUUID();
        byte[] byteArray = BigInteger.valueOf(uuidRandomUUID.getLeastSignificantBits()).toByteArray();
        byte[] byteArray2 = BigInteger.valueOf(uuidRandomUUID.getMostSignificantBits()).toByteArray();
        String string = new BigInteger(1, byteArray).toString();
        for (int i = 0; i < 2; i++) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                messageDigest.update(byteArray);
                messageDigest.update(byteArray2);
                byte[] bArr = new byte[8];
                System.arraycopy(messageDigest.digest(), 0, bArr, 0, 8);
                string = new BigInteger(1, bArr).toString();
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        d60 d60Var = new d60(0, ModuleDescriptor.MODULE_VERSION, true);
        Random random = new Random();
        this.a = f32Var;
        this.b = es0Var;
        this.c = string;
        this.d = d60Var;
        this.e = random;
    }
}
