package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import android.util.SparseArray;
import android.util.TypedValue;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.security.DigestException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.MGF1ParameterSpec;
import java.security.spec.PSSParameterSpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public abstract class jn {
    public static Field A = null;
    public static boolean B = false;
    public static long C = 0;
    public static Method D = null;
    public static int E = 2;
    public static Boolean F;
    public static final xo2 a;
    public static final xo2 b;
    public static final int[] c = {1, 2, 3, 6};
    public static final int[] d = {48000, 44100, 32000};
    public static final int[] e = {24000, 22050, 16000};
    public static final int[] f = {2, 1, 2, 3, 3, 4, 4, 5};
    public static final int[] g = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320, 384, 448, 512, 576, 640};
    public static final int[] h = {69, 87, 104, 121, 139, 174, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};
    public static final tt0 i = new tt0(11);
    public static final xn1 j = new xn1(7);
    public static final bz1 k = new bz1(new fi2(0));
    public static final l32 l = new l32(8);
    public static final ei m;
    public static final ei[] n;
    public static Boolean o;
    public static Boolean p;
    public static Boolean q;
    public static Boolean r;
    public static Boolean s;
    public static Boolean t;
    public static Field u;
    public static boolean v;
    public static Class w;
    public static boolean x;
    public static Field y;
    public static boolean z;

    static {
        int i2 = 3;
        a = new xo2("RESUME_TOKEN", i2);
        b = new xo2("NULL", i2);
        ei eiVar = new ei("additional_video_csi");
        m = eiVar;
        n = new ei[]{eiVar};
    }

    public static void A(String str) {
        if (str.length() <= 10000) {
            return;
        }
        String strSubstring = str.substring(0, 30);
        throw new NumberFormatException(ec.n(new StringBuilder(strSubstring.length() + 28), "Number string too large: ", strSubstring, "..."));
    }

    public static boolean B() {
        return a0(2) && ((Boolean) ty0.a.u()).booleanValue();
    }

    public static X509Certificate[] C(ByteBuffer byteBuffer, HashMap map, CertificateFactory certificateFactory) throws IOException {
        String str;
        Pair pairCreate;
        ByteBuffer byteBufferU = U(byteBuffer);
        ByteBuffer byteBufferU2 = U(byteBuffer);
        byte[] bArrX = X(byteBuffer);
        ArrayList arrayList = new ArrayList();
        byte[] bArrX2 = null;
        byte[] bArrX3 = null;
        int i2 = -1;
        int i3 = 0;
        while (byteBufferU2.hasRemaining()) {
            i3++;
            try {
                ByteBuffer byteBufferU3 = U(byteBufferU2);
                if (byteBufferU3.remaining() < 8) {
                    throw new SecurityException("Signature record too short");
                }
                int i4 = byteBufferU3.getInt();
                arrayList.add(Integer.valueOf(i4));
                if (i4 != 513 && i4 != 514 && i4 != 769) {
                    switch (i4) {
                        case 257:
                        case 258:
                        case 259:
                        case 260:
                            break;
                        default:
                            continue;
                    }
                }
                if (i2 != -1) {
                    int iK = K(i4);
                    int iK2 = K(i2);
                    if (iK != 1 && iK2 == 1) {
                    }
                }
                bArrX3 = X(byteBufferU3);
                i2 = i4;
            } catch (IOException e2) {
                e = e2;
                throw new SecurityException(ec.j(new StringBuilder(String.valueOf(i3).length() + 34), "Failed to parse signature record #", i3), e);
            } catch (BufferUnderflowException e3) {
                e = e3;
                throw new SecurityException(ec.j(new StringBuilder(String.valueOf(i3).length() + 34), "Failed to parse signature record #", i3), e);
            }
        }
        if (i2 == -1) {
            if (i3 == 0) {
                throw new SecurityException("No signatures found");
            }
            throw new SecurityException("No supported signatures found");
        }
        if (i2 == 513 || i2 == 514) {
            str = "EC";
        } else if (i2 != 769) {
            switch (i2) {
                case 257:
                case 258:
                case 259:
                case 260:
                    str = "RSA";
                    break;
                default:
                    j7.p("Unknown signature algorithm: 0x".concat(String.valueOf(Long.toHexString(i2))));
                    return null;
            }
        } else {
            str = "DSA";
        }
        if (i2 == 513) {
            pairCreate = Pair.create("SHA256withECDSA", null);
        } else if (i2 == 514) {
            pairCreate = Pair.create("SHA512withECDSA", null);
        } else if (i2 != 769) {
            switch (i2) {
                case 257:
                    pairCreate = Pair.create("SHA256withRSA/PSS", new PSSParameterSpec("SHA-256", "MGF1", MGF1ParameterSpec.SHA256, 32, 1));
                    break;
                case 258:
                    pairCreate = Pair.create("SHA512withRSA/PSS", new PSSParameterSpec("SHA-512", "MGF1", MGF1ParameterSpec.SHA512, 64, 1));
                    break;
                case 259:
                    pairCreate = Pair.create("SHA256withRSA", null);
                    break;
                case 260:
                    pairCreate = Pair.create("SHA512withRSA", null);
                    break;
                default:
                    j7.p("Unknown signature algorithm: 0x".concat(String.valueOf(Long.toHexString(i2))));
                    return null;
            }
        } else {
            pairCreate = Pair.create("SHA256withDSA", null);
        }
        String str2 = (String) pairCreate.first;
        AlgorithmParameterSpec algorithmParameterSpec = (AlgorithmParameterSpec) pairCreate.second;
        try {
            PublicKey publicKeyGeneratePublic = KeyFactory.getInstance(str).generatePublic(new X509EncodedKeySpec(bArrX));
            Signature signature = Signature.getInstance(str2);
            signature.initVerify(publicKeyGeneratePublic);
            if (algorithmParameterSpec != null) {
                signature.setParameter(algorithmParameterSpec);
            }
            signature.update(byteBufferU);
            if (!signature.verify(bArrX3)) {
                throw new SecurityException(String.valueOf(str2).concat(" signature did not verify"));
            }
            byteBufferU.clear();
            ByteBuffer byteBufferU4 = U(byteBufferU);
            ArrayList arrayList2 = new ArrayList();
            int i5 = 0;
            while (byteBufferU4.hasRemaining()) {
                i5++;
                try {
                    ByteBuffer byteBufferU5 = U(byteBufferU4);
                    if (byteBufferU5.remaining() < 8) {
                        throw new IOException("Record too short");
                    }
                    int i6 = byteBufferU5.getInt();
                    arrayList2.add(Integer.valueOf(i6));
                    if (i6 == i2) {
                        bArrX2 = X(byteBufferU5);
                    }
                } catch (IOException e4) {
                    e = e4;
                    throw new IOException(ec.j(new StringBuilder(String.valueOf(i5).length() + 31), "Failed to parse digest record #", i5), e);
                } catch (BufferUnderflowException e5) {
                    e = e5;
                    throw new IOException(ec.j(new StringBuilder(String.valueOf(i5).length() + 31), "Failed to parse digest record #", i5), e);
                }
            }
            if (!arrayList.equals(arrayList2)) {
                throw new SecurityException("Signature algorithms don't match between digests and signatures records");
            }
            int iK3 = K(i2);
            byte[] bArr = (byte[]) map.put(Integer.valueOf(iK3), bArrX2);
            if (bArr != null && !MessageDigest.isEqual(bArr, bArrX2)) {
                throw new SecurityException(O(iK3).concat(" contents digest does not match the digest specified by a preceding signer"));
            }
            ByteBuffer byteBufferU6 = U(byteBufferU);
            ArrayList arrayList3 = new ArrayList();
            int i7 = 0;
            while (byteBufferU6.hasRemaining()) {
                i7++;
                byte[] bArrX4 = X(byteBufferU6);
                try {
                    arrayList3.add(new yl0((X509Certificate) certificateFactory.generateCertificate(new ByteArrayInputStream(bArrX4)), bArrX4));
                } catch (CertificateException e6) {
                    throw new SecurityException(ec.j(new StringBuilder(String.valueOf(i7).length() + 30), "Failed to decode certificate #", i7), e6);
                }
            }
            if (arrayList3.isEmpty()) {
                throw new SecurityException("No certificates listed");
            }
            if (Arrays.equals(bArrX, ((X509Certificate) arrayList3.get(0)).getPublicKey().getEncoded())) {
                return (X509Certificate[]) arrayList3.toArray(new X509Certificate[arrayList3.size()]);
            }
            throw new SecurityException("Public key mismatch between certificate and signature record");
        } catch (InvalidAlgorithmParameterException e7) {
            e = e7;
            throw new SecurityException(ec.n(new StringBuilder(String.valueOf(str2).length() + 27), "Failed to verify ", str2, " signature"), e);
        } catch (InvalidKeyException e8) {
            e = e8;
            throw new SecurityException(ec.n(new StringBuilder(String.valueOf(str2).length() + 27), "Failed to verify ", str2, " signature"), e);
        } catch (NoSuchAlgorithmException e9) {
            e = e9;
            throw new SecurityException(ec.n(new StringBuilder(String.valueOf(str2).length() + 27), "Failed to verify ", str2, " signature"), e);
        } catch (SignatureException e10) {
            e = e10;
            throw new SecurityException(ec.n(new StringBuilder(String.valueOf(str2).length() + 27), "Failed to verify ", str2, " signature"), e);
        } catch (InvalidKeySpecException e11) {
            e = e11;
            throw new SecurityException(ec.n(new StringBuilder(String.valueOf(str2).length() + 27), "Failed to verify ", str2, " signature"), e);
        }
    }

    public static int D(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("com.google.ads.mediation.admob.AdMobAdapter");
        if (bundle2 != null) {
            bundle = bundle2;
        }
        String string = bundle.getString("query_info_type");
        if (TextUtils.isEmpty(string)) {
            return 2;
        }
        switch (string.hashCode()) {
            case 1743582862:
                return string.equals("requester_type_0") ? 1 : 2;
            case 1743582863:
                return string.equals("requester_type_1") ? 3 : 2;
            case 1743582864:
                return string.equals("requester_type_2") ? 4 : 2;
            case 1743582865:
                return string.equals("requester_type_3") ? 5 : 2;
            case 1743582866:
                return string.equals("requester_type_4") ? 6 : 2;
            case 1743582867:
                return string.equals("requester_type_5") ? 7 : 2;
            case 1743582868:
                return string.equals("requester_type_6") ? 8 : 2;
            case 1743582869:
                return string.equals("requester_type_7") ? 9 : 2;
            case 1743582870:
                return string.equals("requester_type_8") ? 10 : 2;
            default:
                return 2;
        }
    }

    public static String E(String str, Object... objArr) {
        int length;
        int iIndexOf;
        StringBuilder sb = new StringBuilder(str.length() + (objArr.length * 16));
        int i2 = 0;
        int i3 = 0;
        while (true) {
            length = objArr.length;
            if (i2 >= length || (iIndexOf = str.indexOf("%s", i3)) == -1) {
                break;
            }
            sb.append((CharSequence) str, i3, iIndexOf);
            sb.append(G(objArr[i2]));
            i3 = iIndexOf + 2;
            i2++;
        }
        sb.append((CharSequence) str, i3, str.length());
        if (i2 < length) {
            String str2 = " [";
            while (i2 < objArr.length) {
                sb.append(str2);
                sb.append(G(objArr[i2]));
                i2++;
                str2 = ", ";
            }
            sb.append(']');
        }
        return sb.toString();
    }

    public static void F(String str) {
        if (!a0(3)) {
            return;
        }
        if (str.length() <= 4000) {
            Log.d("Ads", str);
            return;
        }
        bz1 bz1Var = k;
        Iterator itF = ((hi2) bz1Var.f).f(bz1Var, str);
        boolean z2 = true;
        while (true) {
            gi2 gi2Var = (gi2) itF;
            if (!gi2Var.hasNext()) {
                return;
            }
            String str2 = (String) gi2Var.next();
            if (z2) {
                Log.d("Ads", str2);
            } else {
                Log.d("Ads-cont", str2);
            }
            z2 = false;
        }
    }

    public static String G(Object obj) {
        if (obj == null) {
            return "null";
        }
        try {
            return obj.toString();
        } catch (Exception e2) {
            String name = obj.getClass().getName();
            String hexString = Integer.toHexString(System.identityHashCode(obj));
            String strN = ec.n(new StringBuilder(name.length() + 1 + String.valueOf(hexString).length()), name, "@", hexString);
            Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(strN), (Throwable) e2);
            String name2 = e2.getClass().getName();
            StringBuilder sb = new StringBuilder(strN.length() + 8 + name2.length() + 1);
            ec.x(sb, "<", strN, " threw ", name2);
            sb.append(">");
            return sb.toString();
        }
    }

    public static void H(String str, Throwable th) {
        if (a0(3)) {
            Log.d("Ads", str, th);
        }
    }

    public static void I(hs1 hs1Var, String str, Pair... pairArr) {
        if (((Boolean) tu0.e.c.a(lx0.n7)).booleanValue()) {
            za1.a.execute(new ib(hs1Var, str, pairArr, 25));
        }
    }

    public static byte[][] J(int[] iArr, ul0[] ul0VarArr) throws DigestException {
        long j2;
        int i2;
        int length;
        char c2;
        byte[][] bArr;
        String str;
        int i3 = 0;
        long jA = 0;
        while (true) {
            j2 = 1048576;
            if (i3 >= 3) {
                break;
            }
            jA += (ul0VarArr[i3].a() + 1048575) / 1048576;
            i3++;
        }
        if (jA >= 2097151) {
            StringBuilder sb = new StringBuilder(String.valueOf(jA).length() + 17);
            sb.append("Too many chunks: ");
            sb.append(jA);
            throw new DigestException(sb.toString());
        }
        byte[][] bArr2 = new byte[iArr.length][];
        int i4 = 0;
        while (true) {
            length = iArr.length;
            c2 = 5;
            if (i4 >= length) {
                break;
            }
            int i5 = (int) jA;
            byte[] bArr3 = new byte[(Q(iArr[i4]) * i5) + 5];
            bArr3[0] = 90;
            Y(i5, bArr3);
            bArr2[i4] = bArr3;
            i4++;
        }
        byte[] bArr4 = new byte[5];
        bArr4[0] = -91;
        MessageDigest[] messageDigestArr = new MessageDigest[length];
        int i6 = 0;
        while (true) {
            bArr = null;
            str = " digest not supported";
            if (i6 >= iArr.length) {
                break;
            }
            String strO = O(iArr[i6]);
            try {
                messageDigestArr[i6] = MessageDigest.getInstance(strO);
                i6++;
            } catch (NoSuchAlgorithmException e2) {
                j7.h(strO.concat(" digest not supported"), e2);
                return null;
            }
        }
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        for (i2 = 3; i7 < i2; i2 = 3) {
            ul0 ul0Var = ul0VarArr[i7];
            int i10 = i7;
            long jA2 = ul0Var.a();
            long j3 = 0;
            while (jA2 > 0) {
                byte[][] bArr5 = bArr;
                String str2 = str;
                int iMin = (int) Math.min(jA2, j2);
                Y(iMin, bArr4);
                for (int i11 = 0; i11 < length; i11++) {
                    messageDigestArr[i11].update(bArr4);
                }
                try {
                    ul0Var.i(messageDigestArr, j3, iMin);
                    int i12 = 0;
                    while (i12 < iArr.length) {
                        int i13 = iArr[i12];
                        byte[] bArr6 = bArr2[i12];
                        int iQ = Q(i13);
                        char c3 = c2;
                        MessageDigest messageDigest = messageDigestArr[i12];
                        ul0 ul0Var2 = ul0Var;
                        int iDigest = messageDigest.digest(bArr6, (i8 * iQ) + 5, iQ);
                        if (iDigest != iQ) {
                            String algorithm = messageDigest.getAlgorithm();
                            StringBuilder sb2 = new StringBuilder(String.valueOf(algorithm).length() + 35 + String.valueOf(iDigest).length());
                            sb2.append("Unexpected output size of ");
                            sb2.append(algorithm);
                            sb2.append(" digest: ");
                            sb2.append(iDigest);
                            throw new RuntimeException(sb2.toString());
                        }
                        i12++;
                        c2 = c3;
                        ul0Var = ul0Var2;
                    }
                    long j4 = iMin;
                    j3 += j4;
                    jA2 -= j4;
                    i8++;
                    bArr = bArr5;
                    str = str2;
                    j2 = 1048576;
                } catch (IOException e3) {
                    throw new DigestException(ec.l(new StringBuilder(String.valueOf(i8).length() + 37 + String.valueOf(i9).length()), "Failed to digest chunk #", i8, " of section #", i9), e3);
                }
            }
            i9++;
            i7 = i10 + 1;
            j2 = 1048576;
        }
        byte[][] bArr7 = bArr;
        String str3 = str;
        byte[][] bArr8 = new byte[iArr.length][];
        for (int i14 = 0; i14 < iArr.length; i14++) {
            int i15 = iArr[i14];
            byte[] bArr9 = bArr2[i14];
            String strO2 = O(i15);
            try {
                bArr8[i14] = MessageDigest.getInstance(strO2).digest(bArr9);
            } catch (NoSuchAlgorithmException e4) {
                j7.h(strO2.concat(str3), e4);
                return bArr7;
            }
        }
        return bArr8;
    }

    public static int K(int i2) {
        if (i2 == 513) {
            return 1;
        }
        if (i2 == 514) {
            return 2;
        }
        if (i2 == 769) {
            return 1;
        }
        switch (i2) {
            case 257:
            case 259:
                return 1;
            case 258:
            case 260:
                return 2;
            default:
                j7.p("Unknown signature algorithm: 0x".concat(String.valueOf(Long.toHexString(i2))));
                return 0;
        }
    }

    public static int L(int i2, int i3) {
        int i4;
        if (i2 < 0 || i2 >= 3 || i3 < 0 || (i4 = i3 >> 1) >= 19) {
            return -1;
        }
        int i5 = d[i2];
        if (i5 == 44100) {
            int i6 = h[i4] + (i3 & 1);
            return i6 + i6;
        }
        int i7 = g[i4];
        return i5 == 32000 ? i7 * 6 : i7 * 4;
    }

    public static void M(String str) {
        if (!a0(6)) {
            return;
        }
        if (str == null || str.length() <= 4000) {
            Log.e("Ads", str);
            return;
        }
        bz1 bz1Var = k;
        Iterator itF = ((hi2) bz1Var.f).f(bz1Var, str);
        boolean z2 = true;
        while (true) {
            gi2 gi2Var = (gi2) itF;
            if (!gi2Var.hasNext()) {
                return;
            }
            String str2 = (String) gi2Var.next();
            if (z2) {
                Log.e("Ads", str2);
            } else {
                Log.e("Ads-cont", str2);
            }
            z2 = false;
        }
    }

    public static int N(i52 i52Var) {
        if (i52Var.s) {
            return 2;
        }
        f93 f93Var = i52Var.d;
        q91 q91Var = f93Var.x;
        String str = f93Var.C;
        if (q91Var == null && str == null) {
            return 1;
        }
        if (q91Var == null || str == null) {
            return q91Var != null ? 3 : 4;
        }
        return 5;
    }

    public static String O(int i2) {
        if (i2 == 1) {
            return "SHA-256";
        }
        if (i2 == 2) {
            return "SHA-512";
        }
        j7.p(ec.j(new StringBuilder(String.valueOf(i2).length() + 33), "Unknown content digest algorthm: ", i2));
        return null;
    }

    public static void P(String str, Throwable th) {
        if (a0(6)) {
            Log.e("Ads", str, th);
        }
    }

    public static int Q(int i2) {
        if (i2 == 1) {
            return 32;
        }
        if (i2 == 2) {
            return 64;
        }
        j7.p(ec.j(new StringBuilder(String.valueOf(i2).length() + 33), "Unknown content digest algorthm: ", i2));
        return 0;
    }

    public static void R(String str) {
        if (!a0(4)) {
            return;
        }
        if (str.length() <= 4000) {
            Log.i("Ads", str);
            return;
        }
        bz1 bz1Var = k;
        Iterator itF = ((hi2) bz1Var.f).f(bz1Var, str);
        boolean z2 = true;
        while (true) {
            gi2 gi2Var = (gi2) itF;
            if (!gi2Var.hasNext()) {
                return;
            }
            String str2 = (String) gi2Var.next();
            if (z2) {
                Log.i("Ads", str2);
            } else {
                Log.i("Ads-cont", str2);
            }
            z2 = false;
        }
    }

    public static ByteBuffer S(int i2, ByteBuffer byteBuffer) {
        int iLimit = byteBuffer.limit();
        int iPosition = byteBuffer.position();
        int i3 = i2 + iPosition;
        if (i3 < iPosition || i3 > iLimit) {
            throw new BufferUnderflowException();
        }
        byteBuffer.limit(i3);
        try {
            ByteBuffer byteBufferSlice = byteBuffer.slice();
            byteBufferSlice.order(byteBuffer.order());
            byteBuffer.position(i3);
            return byteBufferSlice;
        } finally {
            byteBuffer.limit(iLimit);
        }
    }

    public static void T(String str) {
        if (!a0(5)) {
            return;
        }
        if (str == null || str.length() <= 4000) {
            Log.w("Ads", str);
            return;
        }
        bz1 bz1Var = k;
        Iterator itF = ((hi2) bz1Var.f).f(bz1Var, str);
        boolean z2 = true;
        while (true) {
            gi2 gi2Var = (gi2) itF;
            if (!gi2Var.hasNext()) {
                return;
            }
            String str2 = (String) gi2Var.next();
            if (z2) {
                Log.w("Ads", str2);
            } else {
                Log.w("Ads-cont", str2);
            }
            z2 = false;
        }
    }

    public static ByteBuffer U(ByteBuffer byteBuffer) throws IOException {
        if (byteBuffer.remaining() < 4) {
            int iRemaining = byteBuffer.remaining();
            throw new IOException(ec.j(new StringBuilder(String.valueOf(iRemaining).length() + 82), "Remaining buffer too short to contain length of length-prefixed field. Remaining: ", iRemaining));
        }
        int i2 = byteBuffer.getInt();
        if (i2 < 0) {
            j7.p("Negative length");
            return null;
        }
        if (i2 <= byteBuffer.remaining()) {
            return S(i2, byteBuffer);
        }
        int iRemaining2 = byteBuffer.remaining();
        throw new IOException(ec.l(new StringBuilder(String.valueOf(i2).length() + 79 + String.valueOf(iRemaining2).length()), "Length-prefixed field longer than remaining buffer. Field length: ", i2, ", remaining: ", iRemaining2));
    }

    public static void V(String str, Throwable th) {
        if (a0(5)) {
            Log.w("Ads", str, th);
        }
    }

    public static String W(String str) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        if (stackTrace.length < 4) {
            return str;
        }
        int lineNumber = stackTrace[3].getLineNumber();
        StringBuilder sb = new StringBuilder(str.length() + 2 + String.valueOf(lineNumber).length());
        sb.append(str);
        sb.append(" @");
        sb.append(lineNumber);
        return sb.toString();
    }

    public static byte[] X(ByteBuffer byteBuffer) throws IOException {
        int i2 = byteBuffer.getInt();
        if (i2 < 0) {
            throw new IOException("Negative length");
        }
        if (i2 <= byteBuffer.remaining()) {
            byte[] bArr = new byte[i2];
            byteBuffer.get(bArr);
            return bArr;
        }
        int iRemaining = byteBuffer.remaining();
        throw new IOException(ec.l(new StringBuilder(String.valueOf(i2).length() + 68 + String.valueOf(iRemaining).length()), "Underflow while reading length-prefixed value. Length: ", i2, ", available: ", iRemaining));
    }

    public static void Y(int i2, byte[] bArr) {
        bArr[1] = (byte) (i2 & 255);
        bArr[2] = (byte) ((i2 >>> 8) & 255);
        bArr[3] = (byte) ((i2 >>> 16) & 255);
        bArr[4] = (byte) (i2 >> 24);
    }

    public static void Z(String str, Exception exc) {
        if (a0(5)) {
            if (exc != null) {
                V(W(str), exc);
            } else {
                T(W(str));
            }
        }
    }

    public static void a(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcelable.writeToParcel(parcel, 0);
        }
    }

    public static boolean a0(int i2) {
        return i2 >= 5 || Log.isLoggable("Ads", i2);
    }

    public static boolean b(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    public static s8 c(re reVar) {
        q8 q8Var = new q8();
        q8Var.c = new ix();
        s8 s8Var = new s8(q8Var);
        q8Var.b = s8Var;
        q8Var.a = ec.class;
        try {
            reVar.z(true, new k9(1, new fc(q8Var, 0, reVar)));
            q8Var.a = "Deferred.asListenableFuture";
            return s8Var;
        } catch (Exception e2) {
            s8Var.g.i(e2);
            return s8Var;
        }
    }

    public static void d(String str) {
        if (str.length() > 127) {
            str = str.substring(0, 127);
        }
        Trace.beginSection(str);
    }

    public static ColorStateList e(Context context, int i2) {
        ColorStateList colorStateListA;
        ColorStateList colorStateList;
        lx lxVar;
        Resources resources = context.getResources();
        Resources.Theme theme = context.getTheme();
        mx mxVar = new mx(resources, theme);
        synchronized (ox.c) {
            try {
                SparseArray sparseArray = (SparseArray) ox.b.get(mxVar);
                colorStateListA = null;
                if (sparseArray == null || sparseArray.size() <= 0 || (lxVar = (lx) sparseArray.get(i2)) == null) {
                    colorStateList = null;
                } else {
                    if (lxVar.b.equals(resources.getConfiguration())) {
                        if (theme != null || lxVar.c != 0) {
                            if (theme == null || lxVar.c != theme.hashCode()) {
                            }
                        }
                        colorStateList = lxVar.a;
                    }
                    sparseArray.remove(i2);
                    colorStateList = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (colorStateList != null) {
            return colorStateList;
        }
        ThreadLocal threadLocal = ox.a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        resources.getValue(i2, typedValue, true);
        int i3 = typedValue.type;
        if (i3 < 28 || i3 > 31) {
            try {
                colorStateListA = ea.a(resources, resources.getXml(i2), theme);
            } catch (Exception e2) {
                Log.w("ResourcesCompat", "Failed to inflate ColorStateList, leaving it to the framework", e2);
            }
        }
        if (colorStateListA == null) {
            return resources.getColorStateList(i2, theme);
        }
        synchronized (ox.c) {
            try {
                WeakHashMap weakHashMap = ox.b;
                SparseArray sparseArray2 = (SparseArray) weakHashMap.get(mxVar);
                if (sparseArray2 == null) {
                    sparseArray2 = new SparseArray();
                    weakHashMap.put(mxVar, sparseArray2);
                }
                sparseArray2.append(i2, new lx(colorStateListA, mxVar.a.getConfiguration(), theme));
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return colorStateListA;
    }

    public static Drawable f(Context context, int i2) {
        return kx.c().d(context, i2);
    }

    public static boolean g() {
        if (Build.VERSION.SDK_INT >= 29) {
            return s40.a();
        }
        try {
            if (D == null) {
                C = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                D = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) D.invoke(null, Long.valueOf(C))).booleanValue();
        } catch (Exception e2) {
            if (!(e2 instanceof InvocationTargetException)) {
                Log.v("Trace", "Unable to call isTagEnabled via reflection", e2);
                return false;
            }
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            throw new RuntimeException(cause);
        }
    }

    public static boolean h(Context context) {
        if (q == null) {
            PackageManager packageManager = context.getPackageManager();
            boolean z2 = false;
            if (packageManager.hasSystemFeature("com.google.android.feature.services_updater") && packageManager.hasSystemFeature("cn.google.services")) {
                z2 = true;
            }
            q = Boolean.valueOf(z2);
        }
        return q.booleanValue();
    }

    public static boolean i(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (o == null) {
            o = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        o.booleanValue();
        if (s(context)) {
            return !ej1.k() || ej1.m();
        }
        return false;
    }

    public static void j(RuntimeException runtimeException, String str) {
        StackTraceElement[] stackTrace = runtimeException.getStackTrace();
        int length = stackTrace.length;
        int i2 = -1;
        for (int i3 = 0; i3 < length; i3++) {
            if (str.equals(stackTrace[i3].getClassName())) {
                i2 = i3;
            }
        }
        runtimeException.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i2 + 1, length));
    }

    public static void k(String str) {
        na naVar = new na(ec.i("lateinit property ", str, " has not been initialized"));
        j(naVar, jn.class.getName());
        throw naVar;
    }

    public static long l(long j2, long j3, RoundingMode roundingMode) {
        roundingMode.getClass();
        long j4 = j2 / j3;
        long j5 = j2 - (j3 * j4);
        if (j5 == 0) {
            return j4;
        }
        int i2 = ((int) ((j2 ^ j3) >> 63)) | 1;
        switch (rl2.a[roundingMode.ordinal()]) {
            case 1:
                ar.A(false);
                return j4;
            case 2:
                return j4;
            case 3:
                if (i2 >= 0) {
                    return j4;
                }
                break;
            case 4:
                break;
            case 5:
                if (i2 <= 0) {
                    return j4;
                }
                break;
            case 6:
            case 7:
            case 8:
                long jAbs = Math.abs(j5);
                long jAbs2 = jAbs - (Math.abs(j3) - jAbs);
                if (jAbs2 == 0) {
                    if (roundingMode != RoundingMode.HALF_UP && (roundingMode != RoundingMode.HALF_EVEN || (1 & j4) == 0)) {
                        return j4;
                    }
                } else if (jAbs2 <= 0) {
                    return j4;
                }
            default:
                throw new AssertionError();
        }
        return j4 + ((long) i2);
    }

    public static Bundle m(Pair... pairArr) {
        Bundle bundle = new Bundle();
        if (((Boolean) tu0.e.c.a(lx0.m2)).booleanValue()) {
            for (int i2 = 0; i2 < 2; i2++) {
                Pair pair = pairArr[i2];
                if (!TextUtils.isEmpty((CharSequence) pair.first) && ((Long) pair.second).longValue() > 0) {
                    bundle.putLong((String) pair.first, ((Long) pair.second).longValue());
                }
            }
        }
        return bundle;
    }

    public static String n(ArrayList arrayList) {
        int size = arrayList.size();
        boolean z2 = false;
        String str = null;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            String str2 = ((zh0) obj).a.g.m;
            if (rn0.b(str2)) {
                return "video/mp4";
            }
            if (rn0.a(str2)) {
                z2 = true;
            } else if (rn0.c(str2)) {
                if (Objects.equals(str2, "image/heic")) {
                    str = "image/heif";
                } else if (Objects.equals(str2, "image/avif")) {
                    str = "image/avif";
                }
            }
        }
        if (z2) {
            return "audio/mp4";
        }
        return str != null ? str : "application/mp4";
    }

    public static BigDecimal o(String str) {
        A(str);
        BigDecimal bigDecimal = new BigDecimal(str);
        if (Math.abs(bigDecimal.scale()) < 10000) {
            return bigDecimal;
        }
        throw new NumberFormatException("Number has unsupported scale: ".concat(str));
    }

    public static void p(String str) {
        if (!B()) {
            return;
        }
        if (str == null || str.length() <= 4000) {
            Log.v("Ads", str);
            return;
        }
        bz1 bz1Var = k;
        Iterator itF = ((hi2) bz1Var.f).f(bz1Var, str);
        boolean z2 = true;
        while (true) {
            gi2 gi2Var = (gi2) itF;
            if (!gi2Var.hasNext()) {
                return;
            }
            String str2 = (String) gi2Var.next();
            if (z2) {
                Log.v("Ads", str2);
            } else {
                Log.v("Ads-cont", str2);
            }
            z2 = false;
        }
    }

    public static void q(sx0 sx0Var, rx0 rx0Var, String... strArr) {
        if (rx0Var == null) {
            return;
        }
        vc3.C.k.getClass();
        sx0Var.a(rx0Var, SystemClock.elapsedRealtime(), strArr);
    }

    public static boolean r(int i2) {
        Boolean bool;
        if (i2 - 1 == 0) {
            return !cr2.a();
        }
        if (!cr2.a()) {
            return true;
        }
        try {
            bool = (Boolean) Class.forName("org.conscrypt.Conscrypt").getMethod("isBoringSslFIPSBuild", null).invoke(null, null);
        } catch (Exception unused) {
            cr2.a.logp(Level.INFO, "com.google.crypto.tink.config.internal.TinkFipsUtil", "checkConscryptIsAvailableAndUsesFipsBoringSsl", "Conscrypt is not available or does not support checking for FIPS build.");
            bool = Boolean.FALSE;
        }
        return bool.booleanValue();
    }

    public static boolean s(Context context) {
        if (p == null) {
            p = Boolean.valueOf(context.getPackageManager().hasSystemFeature("cn.google"));
        }
        return p.booleanValue();
    }

    public static X509Certificate[][] t(String str) throws Throwable {
        RandomAccessFile randomAccessFile;
        Pair pairF;
        RandomAccessFile randomAccessFile2 = new RandomAccessFile(str, "r");
        try {
            if (randomAccessFile2.length() < 22) {
                pairF = null;
            } else {
                pairF = ar.F(randomAccessFile2, 0);
                if (pairF == null) {
                    pairF = ar.F(randomAccessFile2, 65535);
                }
            }
            try {
                if (pairF == null) {
                    long length = randomAccessFile2.length();
                    StringBuilder sb = new StringBuilder(String.valueOf(length).length() + 82);
                    sb.append("Not an APK file: ZIP End of Central Directory record not found in file with ");
                    sb.append(length);
                    sb.append(" bytes");
                    throw new xl0(sb.toString());
                }
                ByteBuffer byteBuffer = (ByteBuffer) pairF.first;
                long jLongValue = ((Long) pairF.second).longValue();
                long j2 = (-20) + jLongValue;
                if (j2 >= 0) {
                    randomAccessFile2.seek(j2);
                    if (randomAccessFile2.readInt() == 1347094023) {
                        throw new xl0("ZIP64 APK not supported");
                    }
                }
                ar.H(byteBuffer);
                long j3 = ((long) byteBuffer.getInt(byteBuffer.position() + 16)) & 4294967295L;
                if (j3 >= jLongValue) {
                    StringBuilder sb2 = new StringBuilder(String.valueOf(j3).length() + 82 + String.valueOf(jLongValue).length());
                    sb2.append("ZIP Central Directory offset out of range: ");
                    sb2.append(j3);
                    sb2.append(". ZIP End of Central Directory offset: ");
                    sb2.append(jLongValue);
                    throw new xl0(sb2.toString());
                }
                ar.H(byteBuffer);
                if ((((long) byteBuffer.getInt(byteBuffer.position() + 12)) & 4294967295L) + j3 != jLongValue) {
                    throw new xl0("ZIP Central Directory is not immediately followed by End of Central Directory");
                }
                if (j3 < 32) {
                    StringBuilder sb3 = new StringBuilder(String.valueOf(j3).length() + 67);
                    sb3.append("APK too small for APK Signing Block. ZIP Central Directory offset: ");
                    sb3.append(j3);
                    throw new xl0(sb3.toString());
                }
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(24);
                ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
                byteBufferAllocate.order(byteOrder);
                randomAccessFile2.seek(j3 - ((long) byteBufferAllocate.capacity()));
                randomAccessFile2.readFully(byteBufferAllocate.array(), byteBufferAllocate.arrayOffset(), byteBufferAllocate.capacity());
                if (byteBufferAllocate.getLong(8) != 2334950737559900225L || byteBufferAllocate.getLong(16) != 3617552046287187010L) {
                    throw new xl0("No APK Signing Block before ZIP Central Directory");
                }
                long j4 = byteBufferAllocate.getLong(0);
                if (j4 < byteBufferAllocate.capacity() || j4 > 2147483639) {
                    StringBuilder sb4 = new StringBuilder(String.valueOf(j4).length() + 37);
                    sb4.append("APK Signing Block size out of range: ");
                    sb4.append(j4);
                    throw new xl0(sb4.toString());
                }
                int i2 = (int) (8 + j4);
                long j5 = j3 - ((long) i2);
                if (j5 < 0) {
                    StringBuilder sb5 = new StringBuilder(String.valueOf(j5).length() + 39);
                    sb5.append("APK Signing Block offset out of range: ");
                    sb5.append(j5);
                    throw new xl0(sb5.toString());
                }
                ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(i2);
                byteBufferAllocate2.order(byteOrder);
                randomAccessFile2.seek(j5);
                long j6 = j3;
                randomAccessFile2.readFully(byteBufferAllocate2.array(), byteBufferAllocate2.arrayOffset(), byteBufferAllocate2.capacity());
                long j7 = byteBufferAllocate2.getLong(0);
                if (j7 != j4) {
                    StringBuilder sb6 = new StringBuilder(String.valueOf(j7).length() + 63 + String.valueOf(j4).length());
                    sb6.append("APK Signing Block sizes in header and footer do not match: ");
                    sb6.append(j7);
                    sb6.append(" vs ");
                    sb6.append(j4);
                    throw new xl0(sb6.toString());
                }
                Pair pairCreate = Pair.create(byteBufferAllocate2, Long.valueOf(j5));
                ByteBuffer byteBuffer2 = (ByteBuffer) pairCreate.first;
                long jLongValue2 = ((Long) pairCreate.second).longValue();
                if (byteBuffer2.order() != byteOrder) {
                    throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
                }
                int iCapacity = byteBuffer2.capacity() - 24;
                randomAccessFile = randomAccessFile2;
                if (iCapacity < 8) {
                    StringBuilder sb7 = new StringBuilder(String.valueOf(iCapacity).length() + 17);
                    sb7.append("end < start: ");
                    sb7.append(iCapacity);
                    sb7.append(" < 8");
                    throw new IllegalArgumentException(sb7.toString());
                }
                int iCapacity2 = byteBuffer2.capacity();
                if (iCapacity > byteBuffer2.capacity()) {
                    StringBuilder sb8 = new StringBuilder(String.valueOf(iCapacity).length() + 19 + String.valueOf(iCapacity2).length());
                    sb8.append("end > capacity: ");
                    sb8.append(iCapacity);
                    sb8.append(" > ");
                    sb8.append(iCapacity2);
                    throw new IllegalArgumentException(sb8.toString());
                }
                int iLimit = byteBuffer2.limit();
                int iPosition = byteBuffer2.position();
                try {
                    byteBuffer2.position(0);
                    byteBuffer2.limit(iCapacity);
                    byteBuffer2.position(8);
                    ByteBuffer byteBufferSlice = byteBuffer2.slice();
                    byteBufferSlice.order(byteBuffer2.order());
                    byteBuffer2.position(0);
                    byteBuffer2.limit(iLimit);
                    byteBuffer2.position(iPosition);
                    int i3 = 0;
                    while (byteBufferSlice.hasRemaining()) {
                        i3++;
                        if (byteBufferSlice.remaining() < 8) {
                            StringBuilder sb9 = new StringBuilder(String.valueOf(i3).length() + 59);
                            sb9.append("Insufficient data to read size of APK Signing Block entry #");
                            sb9.append(i3);
                            throw new xl0(sb9.toString());
                        }
                        long j8 = byteBufferSlice.getLong();
                        if (j8 < 4 || j8 > 2147483647L) {
                            StringBuilder sb10 = new StringBuilder(String.valueOf(i3).length() + 45 + String.valueOf(j8).length());
                            sb10.append("APK Signing Block entry #");
                            sb10.append(i3);
                            sb10.append(" size out of range: ");
                            sb10.append(j8);
                            throw new xl0(sb10.toString());
                        }
                        int i4 = (int) j8;
                        int iPosition2 = byteBufferSlice.position() + i4;
                        if (i4 > byteBufferSlice.remaining()) {
                            int iRemaining = byteBufferSlice.remaining();
                            StringBuilder sb11 = new StringBuilder(String.valueOf(i3).length() + 45 + String.valueOf(i4).length() + 13 + String.valueOf(iRemaining).length());
                            sb11.append("APK Signing Block entry #");
                            sb11.append(i3);
                            sb11.append(" size out of range: ");
                            sb11.append(i4);
                            sb11.append(", available: ");
                            sb11.append(iRemaining);
                            throw new xl0(sb11.toString());
                        }
                        if (byteBufferSlice.getInt() == 1896449818) {
                            X509Certificate[][] x509CertificateArrX = x(randomAccessFile.getChannel(), new wl0(S(i4 - 4, byteBufferSlice), jLongValue2, j6, jLongValue, byteBuffer));
                            randomAccessFile.close();
                            try {
                                randomAccessFile.close();
                            } catch (IOException unused) {
                            }
                            return x509CertificateArrX;
                        }
                        long j9 = j6;
                        byteBufferSlice.position(iPosition2);
                        j6 = j9;
                    }
                    throw new xl0("No APK Signature Scheme v2 block in APK Signing Block");
                } catch (Throwable th) {
                    byteBuffer2.position(0);
                    byteBuffer2.limit(iLimit);
                    byteBuffer2.position(iPosition);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                try {
                    randomAccessFile.close();
                } catch (IOException unused2) {
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            randomAccessFile = randomAccessFile2;
        }
    }

    public static long u(long j2, long j3) {
        ar.w("a", j2);
        ar.w("b", j3);
        if (j2 == 0) {
            return j3;
        }
        if (j3 == 0) {
            return j2;
        }
        int iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j2);
        long jNumberOfTrailingZeros = j2 >> iNumberOfTrailingZeros;
        int iNumberOfTrailingZeros2 = Long.numberOfTrailingZeros(j3);
        long j4 = j3 >> iNumberOfTrailingZeros2;
        while (jNumberOfTrailingZeros != j4) {
            long j5 = jNumberOfTrailingZeros - j4;
            long j6 = (j5 >> 63) & j5;
            long j7 = (j5 - j6) - j6;
            jNumberOfTrailingZeros = j7 >> Long.numberOfTrailingZeros(j7);
            j4 += j6;
        }
        return jNumberOfTrailingZeros << Math.min(iNumberOfTrailingZeros, iNumberOfTrailingZeros2);
    }

    public static String v(String str) {
        if (TextUtils.isEmpty(str)) {
            return "unspecified";
        }
        switch (str.hashCode()) {
            case 1743582862:
                return str.equals("requester_type_0") ? "0" : str;
            case 1743582863:
                return str.equals("requester_type_1") ? "1" : str;
            case 1743582864:
                return str.equals("requester_type_2") ? "2" : str;
            case 1743582865:
                return str.equals("requester_type_3") ? "3" : str;
            case 1743582866:
                return str.equals("requester_type_4") ? "4" : str;
            case 1743582867:
                return str.equals("requester_type_5") ? "5" : str;
            case 1743582868:
                return str.equals("requester_type_6") ? "6" : str;
            case 1743582869:
                return str.equals("requester_type_7") ? "7" : str;
            case 1743582870:
                return str.equals("requester_type_8") ? "8" : str;
            default:
                return str;
        }
    }

    public static void w(String str, Throwable th) {
        if (B()) {
            Log.v("Ads", str, th);
        }
    }

    public static X509Certificate[][] x(FileChannel fileChannel, wl0 wl0Var) {
        HashMap map = new HashMap();
        ArrayList arrayList = new ArrayList();
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            try {
                ByteBuffer byteBufferU = U((ByteBuffer) wl0Var.d);
                int i2 = 0;
                while (byteBufferU.hasRemaining()) {
                    i2++;
                    try {
                        arrayList.add(C(U(byteBufferU), map, certificateFactory));
                    } catch (IOException | SecurityException | BufferUnderflowException e2) {
                        throw new SecurityException(ec.k(new StringBuilder(String.valueOf(i2).length() + 37), "Failed to parse/verify signer #", i2, " block"), e2);
                    }
                }
                if (i2 <= 0) {
                    throw new SecurityException("No signers found");
                }
                if (map.isEmpty()) {
                    throw new SecurityException("No content digests found");
                }
                long j2 = wl0Var.a;
                long j3 = wl0Var.b;
                long j4 = wl0Var.c;
                ByteBuffer byteBuffer = (ByteBuffer) wl0Var.e;
                if (map.isEmpty()) {
                    throw new SecurityException("No digests provided");
                }
                vl0 vl0Var = new vl0(fileChannel, 0L, j2);
                vl0 vl0Var2 = new vl0(fileChannel, j3, j4 - j3);
                ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
                byteBufferDuplicate.order(ByteOrder.LITTLE_ENDIAN);
                ar.H(byteBufferDuplicate);
                int iPosition = byteBufferDuplicate.position() + 16;
                if (j2 < 0 || j2 > 4294967295L) {
                    StringBuilder sb = new StringBuilder(String.valueOf(j2).length() + 27);
                    sb.append("uint32 value of out range: ");
                    sb.append(j2);
                    throw new IllegalArgumentException(sb.toString());
                }
                byteBufferDuplicate.putInt(byteBufferDuplicate.position() + iPosition, (int) j2);
                zx zxVar = new zx(byteBufferDuplicate);
                int size = map.size();
                int[] iArr = new int[size];
                Iterator it = map.keySet().iterator();
                int i3 = 0;
                while (it.hasNext()) {
                    iArr[i3] = ((Integer) it.next()).intValue();
                    i3++;
                }
                try {
                    byte[][] bArrJ = J(iArr, new ul0[]{vl0Var, vl0Var2, zxVar});
                    for (int i4 = 0; i4 < size; i4++) {
                        int i5 = iArr[i4];
                        if (!MessageDigest.isEqual((byte[]) map.get(Integer.valueOf(i5)), bArrJ[i4])) {
                            throw new SecurityException(O(i5).concat(" digest of contents did not verify"));
                        }
                    }
                    return (X509Certificate[][]) arrayList.toArray(new X509Certificate[arrayList.size()][]);
                } catch (DigestException e3) {
                    throw new SecurityException("Failed to compute digest(s) of contents", e3);
                }
            } catch (IOException e4) {
                throw new SecurityException("Failed to read list of signers", e4);
            }
        } catch (CertificateException e5) {
            j7.h("Failed to obtain X.509 CertificateFactory", e5);
            return null;
        }
    }

    public static long y(long j2, long j3) {
        int iNumberOfLeadingZeros = Long.numberOfLeadingZeros(~j3) + Long.numberOfLeadingZeros(j3) + Long.numberOfLeadingZeros(~j2) + Long.numberOfLeadingZeros(j2);
        if (iNumberOfLeadingZeros > 65) {
            return j2 * j3;
        }
        long j4 = j2 ^ j3;
        long j5 = (j4 >>> 63) + Long.MAX_VALUE;
        if (!((iNumberOfLeadingZeros < 64) | ((j3 == Long.MIN_VALUE) & (j2 < 0)))) {
            long j6 = j2 * j3;
            if (j2 == 0 || j6 / j2 == j3) {
                return j6;
            }
        }
        return j5;
    }

    public static String z(f93 f93Var) {
        Bundle bundle;
        return (f93Var == null || (bundle = f93Var.h) == null) ? "unspecified" : bundle.getString("query_info_type");
    }
}
