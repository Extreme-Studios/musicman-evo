package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.Size;
import android.util.SizeF;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.io.StringReader;
import java.lang.reflect.Array;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: loaded from: classes.dex */
public abstract class ss0 implements j70 {
    public static volatile ze1 a;
    public static boolean h;
    public static int i;
    public static final xo2 b = new xo2("UNDEFINED", 3);
    public static final xo2 c = new xo2("REUSABLE_CLAIMED", 3);
    public static final gm d = new gm();
    public static final ig e = new ig(20);
    public static final gm f = new gm();
    public static final Object g = new Object();
    public static final tt0 j = new tt0(16);
    public static final xn1 k = new xn1(12);
    public static final xn1 l = new xn1(25);
    public static final byte[] m = {0, 0, 0, 1};
    public static final float[] n = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};
    public static final Object o = new Object();
    public static int[] p = new int[10];

    public ss0(hn hnVar) {
        new Rect();
    }

    public static File A(String str, String str2, File file) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return null;
        }
        return new File(P(file, str), str2);
    }

    public static void B(String str) {
        if (((Boolean) cz0.a.u()).booleanValue()) {
            jn.F(str);
        }
    }

    public static boolean D(String str) {
        int length = str.length();
        int i2 = 0;
        while (i2 != length) {
            char cCharAt = str.charAt(i2);
            int i3 = i2 + 1;
            if (!Character.isSurrogate(cCharAt)) {
                i2 = i3;
            } else {
                if (Character.isLowSurrogate(cCharAt) || i3 == length || !Character.isLowSurrogate(str.charAt(i3))) {
                    return false;
                }
                i2 += 2;
            }
        }
        return true;
    }

    public static boolean E(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getEventType() == 3 && xmlPullParser.getName().equals(str);
    }

    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r3v5 ??, new type: boolean
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
        	... 5 more
        */
    public static boolean F(defpackage.cw1 r27, defpackage.td0 r28, int r29, defpackage.rd0 r30) {
        /*
            Method dump skipped, instruction units count: 307
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ss0.F(cw1, td0, int, rd0):boolean");
    }

    public static int G(int i2) {
        return (int) (((long) Integer.rotateLeft((int) (((long) i2) * (-862048943)), 15)) * 461845907);
    }

    public static float H(String str) {
        if (str.endsWith("%")) {
            return Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
        }
        throw new NumberFormatException("Percentages must end with %");
    }

    public static int I(Object obj) {
        return G(obj == null ? 0 : obj.hashCode());
    }

    public static int J(de3 de3Var) {
        String str = de3Var.m;
        if (Objects.equals(str, "video/avc")) {
            return 1;
        }
        return (Objects.equals(str, "video/hevc") || rn0.e(de3Var.j, "video/hevc")) ? 2 : 0;
    }

    public static o03 K(String str) throws IOException {
        try {
            return jr2.T(new c13(new StringReader(str)));
        } catch (NumberFormatException e2) {
            throw new IOException(e2);
        }
    }

    public static boolean M(File file, byte[] bArr) throws Throwable {
        FileOutputStream fileOutputStream = null;
        try {
            FileOutputStream fileOutputStream2 = new FileOutputStream(file);
            try {
                if (Build.VERSION.SDK_INT >= 34) {
                    file.setReadOnly();
                }
                fileOutputStream2.write(bArr);
                fileOutputStream2.flush();
                ar.b(fileOutputStream2);
                return true;
            } catch (IOException unused) {
                fileOutputStream = fileOutputStream2;
                ar.b(fileOutputStream);
                return false;
            } catch (Throwable th) {
                th = th;
                fileOutputStream = fileOutputStream2;
                ar.b(fileOutputStream);
                throw th;
            }
        } catch (IOException unused2) {
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static boolean N(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getEventType() == 2 && xmlPullParser.getName().equals(str);
    }

    public static int O(int i2, cw1 cw1Var) {
        switch (i2) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i2 - 2);
            case 6:
                return cw1Var.K() + 1;
            case 7:
                return cw1Var.L() + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return 256 << (i2 - 8);
            default:
                return -1;
        }
    }

    public static File P(File file, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        File file2 = new File(file, str);
        V(file2, false);
        return file2;
    }

    public static String Q(XmlPullParser xmlPullParser, String str) {
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i2 = 0; i2 < attributeCount; i2++) {
            if (xmlPullParser.getAttributeName(i2).equals(str)) {
                return xmlPullParser.getAttributeValue(i2);
            }
        }
        return null;
    }

    public static boolean S(byte[] bArr, int i2, de3 de3Var) {
        int i3;
        String str = de3Var.m;
        if (Objects.equals(str, "video/avc")) {
            byte b2 = bArr[4];
            if (((b2 & 96) >> 5) == 0 && ((i3 = b2 & 31) == 1 || i3 == 9 || i3 == 14)) {
                return false;
            }
        } else if (Objects.equals(str, "video/hevc")) {
            eg egVarJ0 = j0(new oe0(bArr, 4, i2 + 4));
            int i4 = egVarJ0.a;
            if (i4 == 35) {
                return false;
            }
            if (i4 <= 14 && i4 % 2 == 0 && egVarJ0.c == de3Var.D - 1) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0188  */
    /* JADX WARN: Code duplicated, block: B:102:0x018d  */
    /* JADX WARN: Code duplicated, block: B:105:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:108:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:110:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:113:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:115:0x01db  */
    /* JADX WARN: Code duplicated, block: B:116:0x01de  */
    /* JADX WARN: Code duplicated, block: B:119:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:122:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:125:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:128:0x0206  */
    /* JADX WARN: Code duplicated, block: B:131:0x020d  */
    /* JADX WARN: Code duplicated, block: B:134:0x0219  */
    /* JADX WARN: Code duplicated, block: B:136:0x0239  */
    /* JADX WARN: Code duplicated, block: B:141:0x00a6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:144:0x00a1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:21:0x0057  */
    /* JADX WARN: Code duplicated, block: B:23:0x005e  */
    /* JADX WARN: Code duplicated, block: B:26:0x0071 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:27:0x0073  */
    /* JADX WARN: Code duplicated, block: B:28:0x0075  */
    /* JADX WARN: Code duplicated, block: B:31:0x007a  */
    /* JADX WARN: Code duplicated, block: B:33:0x0080  */
    /* JADX WARN: Code duplicated, block: B:35:0x0083  */
    /* JADX WARN: Code duplicated, block: B:36:0x0086  */
    /* JADX WARN: Code duplicated, block: B:39:0x008f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:40:0x0091  */
    /* JADX WARN: Code duplicated, block: B:42:0x009f  */
    /* JADX WARN: Code duplicated, block: B:90:0x015f  */
    /* JADX WARN: Code duplicated, block: B:92:0x0165  */
    /* JADX WARN: Code duplicated, block: B:94:0x016f  */
    /* JADX WARN: Code duplicated, block: B:98:0x0181  */
    /* JADX WARN: Code duplicated, block: B:99:0x0184  */
    public static x62 T(byte[] bArr, int i2, int i3) {
        int iP;
        int i4;
        int i5;
        int iP2;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int iN;
        int i11;
        int i12;
        int iP3;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        float f2;
        int i18;
        float f3;
        int iB;
        int iC;
        boolean zJ;
        boolean zJ2;
        int iK;
        int iK2;
        int i19;
        oe0 oe0Var = new oe0(bArr, i2, i3);
        int iK3 = oe0Var.k(8);
        int iK4 = oe0Var.k(8);
        int iK5 = oe0Var.k(8);
        int iP4 = oe0Var.p();
        if (iK3 == 100 || iK3 == 110 || iK3 == 122 || iK3 == 244 || iK3 == 44 || iK3 == 83 || iK3 == 86 || iK3 == 118 || iK3 == 128) {
            iP = oe0Var.p();
            if (iP == 3) {
                oe0Var.j();
                i4 = 3;
            } else {
                i4 = iP;
            }
            i5 = 16;
            iP2 = oe0Var.p();
            int iP5 = oe0Var.p();
            oe0Var.a();
            if (oe0Var.j()) {
                if (i4 != 3) {
                    i7 = 8;
                } else {
                    i7 = 12;
                }
                for (i8 = 0; i8 < i7; i8++) {
                    if (!oe0Var.j()) {
                        if (i8 < 6) {
                            i9 = 16;
                        } else {
                            i9 = 64;
                        }
                        iN = 8;
                        i11 = 8;
                        for (i10 = 0; i10 < i9; i10++) {
                            if (iN != 0) {
                                iN = ((oe0Var.n() + i11) + 256) % 256;
                            }
                            if (iN != 0) {
                                i11 = iN;
                            }
                        }
                    }
                }
            }
            i6 = iP5;
        } else if (iK3 == 138) {
            iK3 = 138;
            iP = oe0Var.p();
            if (iP == 3) {
                oe0Var.j();
                i4 = 3;
            } else {
                i4 = iP;
            }
            i5 = 16;
            iP2 = oe0Var.p();
            int iP6 = oe0Var.p();
            oe0Var.a();
            if (oe0Var.j()) {
                if (i4 != 3) {
                    i7 = 8;
                } else {
                    i7 = 12;
                }
                while (i8 < i7) {
                    if (!oe0Var.j()) {
                        if (i8 < 6) {
                            i9 = 16;
                        } else {
                            i9 = 64;
                        }
                        iN = 8;
                        i11 = 8;
                        while (i10 < i9) {
                            if (iN != 0) {
                                iN = ((oe0Var.n() + i11) + 256) % 256;
                            }
                            if (iN != 0) {
                                i11 = iN;
                            }
                        }
                    }
                }
            }
            i6 = iP6;
        } else {
            iP = 1;
            i5 = 16;
            i6 = 0;
            iP2 = 0;
        }
        oe0Var.p();
        int iP7 = oe0Var.p();
        if (iP7 == 0) {
            oe0Var.p();
        } else if (iP7 == 1) {
            oe0Var.j();
            oe0Var.n();
            oe0Var.n();
            long jP = oe0Var.p();
            for (int i20 = 0; i20 < jP; i20++) {
                oe0Var.p();
            }
        }
        oe0Var.p();
        oe0Var.a();
        int iP8 = oe0Var.p() + 1;
        int iP9 = oe0Var.p() + 1;
        boolean zJ3 = oe0Var.j();
        int i21 = 2 - (zJ3 ? 1 : 0);
        if (!zJ3) {
            oe0Var.a();
        }
        oe0Var.a();
        int i22 = iP8 * 16;
        int i23 = iP9 * i21 * 16;
        if (oe0Var.j()) {
            int iP10 = oe0Var.p();
            int iP11 = oe0Var.p();
            int iP12 = oe0Var.p();
            int iP13 = oe0Var.p();
            if (iP == 0) {
                i19 = 1;
            } else {
                i19 = iP == 3 ? 1 : 2;
                i21 *= iP == 1 ? 2 : 1;
            }
            i22 -= (iP10 + iP11) * i19;
            i23 -= (iP12 + iP13) * i21;
        }
        int i24 = i22;
        if (iK3 != 44 && iK3 != 86 && iK3 != 100 && iK3 != 110 && iK3 != 122) {
            if (iK3 == 244) {
                i12 = 244;
            } else {
                iP3 = i5;
                i13 = iK3;
            }
            i14 = -1;
            if (oe0Var.j()) {
                if (oe0Var.j()) {
                    iK = oe0Var.k(8);
                    if (iK == 255) {
                        int i25 = i5;
                        iK2 = oe0Var.k(i25);
                        int iK6 = oe0Var.k(i25);
                        if (iK2 != 0 || iK6 == 0) {
                            f3 = 1.0f;
                        } else {
                            f3 = iK2 / iK6;
                        }
                    } else if (iK < 17) {
                        f3 = n[iK];
                    } else {
                        ec.u(new StringBuilder(String.valueOf(iK).length() + 35), "Unexpected aspect_ratio_idc value: ", iK, "NalUnitUtil");
                        f3 = 1.0f;
                    }
                } else {
                    f3 = 1.0f;
                }
                if (oe0Var.j()) {
                    oe0Var.a();
                }
                if (oe0Var.j()) {
                    oe0Var.e(3);
                    int i26 = true != oe0Var.j() ? 2 : 1;
                    if (oe0Var.j()) {
                        int iK7 = oe0Var.k(8);
                        int iK8 = oe0Var.k(8);
                        oe0Var.e(8);
                        iB = c43.b(iK7);
                        iC = c43.c(iK8);
                    } else {
                        iB = -1;
                        iC = -1;
                    }
                    i14 = i26;
                } else {
                    iB = -1;
                    iC = -1;
                }
                if (oe0Var.j()) {
                    oe0Var.p();
                    oe0Var.p();
                }
                if (oe0Var.j()) {
                    oe0Var.e(65);
                }
                zJ = oe0Var.j();
                if (zJ) {
                    l0(oe0Var);
                }
                zJ2 = oe0Var.j();
                if (zJ2) {
                    l0(oe0Var);
                }
                if (zJ || zJ2) {
                    oe0Var.a();
                }
                oe0Var.a();
                if (oe0Var.j()) {
                    oe0Var.a();
                    oe0Var.p();
                    oe0Var.p();
                    oe0Var.p();
                    oe0Var.p();
                    iP3 = oe0Var.p();
                    oe0Var.p();
                }
                i16 = iC;
                i15 = i14;
                f2 = f3;
                i17 = iP3;
                i18 = iB;
            } else {
                i15 = -1;
                i16 = -1;
                i17 = iP3;
                f2 = 1.0f;
                i18 = -1;
            }
            return new x62(i13, iK4, iK5, iP4, i24, i23, f2, iP2, i6, i18, i15, i16, i17);
        }
        i12 = iK3;
        if ((iK4 & 16) != 0) {
            i13 = i12;
            iP3 = 0;
        } else {
            iP3 = i5;
            i13 = i12;
        }
        i14 = -1;
        if (oe0Var.j()) {
            if (oe0Var.j()) {
                f3 = 1.0f;
            } else {
                iK = oe0Var.k(8);
                if (iK == 255) {
                    int i27 = i5;
                    iK2 = oe0Var.k(i27);
                    int iK9 = oe0Var.k(i27);
                    if (iK2 != 0) {
                        f3 = 1.0f;
                    } else {
                        f3 = 1.0f;
                    }
                } else if (iK < 17) {
                    f3 = n[iK];
                } else {
                    ec.u(new StringBuilder(String.valueOf(iK).length() + 35), "Unexpected aspect_ratio_idc value: ", iK, "NalUnitUtil");
                    f3 = 1.0f;
                }
            }
            if (oe0Var.j()) {
                oe0Var.a();
            }
            if (oe0Var.j()) {
                oe0Var.e(3);
                if (true != oe0Var.j()) {
                }
                if (oe0Var.j()) {
                    int iK10 = oe0Var.k(8);
                    int iK11 = oe0Var.k(8);
                    oe0Var.e(8);
                    iB = c43.b(iK10);
                    iC = c43.c(iK11);
                } else {
                    iB = -1;
                    iC = -1;
                }
                i14 = i26;
            } else {
                iB = -1;
                iC = -1;
            }
            if (oe0Var.j()) {
                oe0Var.p();
                oe0Var.p();
            }
            if (oe0Var.j()) {
                oe0Var.e(65);
            }
            zJ = oe0Var.j();
            if (zJ) {
                l0(oe0Var);
            }
            zJ2 = oe0Var.j();
            if (zJ2) {
                l0(oe0Var);
            }
            if (zJ) {
                oe0Var.a();
            } else {
                oe0Var.a();
            }
            oe0Var.a();
            if (oe0Var.j()) {
                oe0Var.a();
                oe0Var.p();
                oe0Var.p();
                oe0Var.p();
                oe0Var.p();
                iP3 = oe0Var.p();
                oe0Var.p();
            }
            i16 = iC;
            i15 = i14;
            f2 = f3;
            i17 = iP3;
            i18 = iB;
        } else {
            i15 = -1;
            i16 = -1;
            i17 = iP3;
            f2 = 1.0f;
            i18 = -1;
        }
        return new x62(i13, iK4, iK5, iP4, i24, i23, f2, iP2, i6, i18, i15, i16, i17);
    }

    public static void U(byte b2, byte b3, char[] cArr, int i2) throws o23 {
        if (b2 < -62 || e0(b3)) {
            j7.s("Protocol message had invalid UTF-8.");
        } else {
            cArr[i2] = (char) (((b2 & 31) << 6) | (b3 & 63));
        }
    }

    public static void V(File file, boolean z) {
        if (z && file.exists() && !file.isDirectory()) {
            file.delete();
        }
        if (file.exists()) {
            return;
        }
        file.mkdirs();
    }

    /* JADX WARN: Code duplicated, block: B:482:0x014e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:0x010f  */
    /* JADX WARN: Code duplicated, block: B:66:0x0128  */
    /* JADX WARN: Code duplicated, block: B:70:0x013b  */
    /* JADX WARN: Code duplicated, block: B:72:0x0140  */
    /* JADX WARN: Code duplicated, block: B:74:0x0148  */
    /* JADX WARN: Multi-variable type inference failed */
    public static y91 X(byte[] bArr, int i2, int i3) {
        r32 r32Var;
        boolean z;
        int iK;
        int iK2;
        int iK3;
        int iK4;
        int[] iArr;
        boolean[][] zArr;
        qk2 qk2Var;
        boolean[][] zArr2;
        int[] iArr2;
        int i4;
        int i5;
        boolean zJ;
        int i6;
        int i7;
        int i8;
        int iP;
        int i9;
        int i10;
        int i11;
        boolean z2;
        boolean z3;
        oe0 oe0Var = new oe0(bArr, i2, i3);
        j0(oe0Var);
        oe0Var.e(4);
        boolean zJ2 = oe0Var.j();
        boolean zJ3 = oe0Var.j();
        int iK5 = oe0Var.k(6);
        int i12 = iK5 + 1;
        int iK6 = oe0Var.k(3);
        oe0Var.e(17);
        m32 m32VarK0 = k0(oe0Var, true, iK6, null);
        for (int i13 = true != oe0Var.j() ? iK6 : 0; i13 <= iK6; i13++) {
            oe0Var.p();
            oe0Var.p();
            oe0Var.p();
        }
        int iK7 = oe0Var.k(6);
        int iP2 = oe0Var.p() + 1;
        int i14 = 6;
        r32 r32Var2 = new r32(vj2.i(m32VarK0), new int[1], 0);
        boolean z4 = i12 >= 2 && iP2 >= 2;
        boolean z5 = zJ2 && zJ3;
        int i15 = iK7 + 1;
        if (!z4 || !z5 || i15 < i12) {
            return new y91((qk2) null, r32Var2, (us2) null, (r32) null);
        }
        Class cls = Integer.TYPE;
        int[][] iArr3 = (int[][]) Array.newInstance((Class<?>) cls, iP2, i15);
        int i16 = 1;
        int[] iArr4 = new int[iP2];
        int[] iArr5 = new int[iP2];
        iArr3[0][0] = 0;
        iArr4[0] = 1;
        iArr5[0] = 0;
        for (int i17 = 1; i17 < iP2; i17++) {
            int i18 = 0;
            for (int i19 = 0; i19 <= iK7; i19++) {
                if (oe0Var.j()) {
                    iArr3[i17][i18] = i19;
                    iArr5[i17] = i19;
                    i18++;
                }
                iArr4[i17] = i18;
            }
        }
        if (oe0Var.j()) {
            oe0Var.e(64);
            if (oe0Var.j()) {
                oe0Var.p();
            }
            int iP3 = oe0Var.p();
            int i20 = 0;
            while (i20 < iP3) {
                oe0Var.p();
                if (i20 == 0 || oe0Var.j()) {
                    boolean zJ4 = oe0Var.j();
                    boolean zJ5 = oe0Var.j();
                    z3 = zJ4;
                    z2 = zJ5;
                    if (zJ4 || zJ5) {
                        zJ = oe0Var.j();
                        if (zJ) {
                            oe0Var.e(19);
                        }
                        oe0Var.e(8);
                        if (zJ) {
                            oe0Var.e(4);
                        }
                        oe0Var.e(15);
                        i7 = zJ4;
                        i6 = zJ5;
                    }
                    i8 = 0;
                    while (i8 <= iK6) {
                        if (!oe0Var.j() || oe0Var.j()) {
                            oe0Var.p();
                        } else {
                            if (oe0Var.j()) {
                                iP = 0;
                            }
                            int[][] iArr6 = iArr3;
                            i9 = i7 + i6;
                            int[] iArr7 = iArr5;
                            i10 = 0;
                            while (i10 < i9) {
                                int i21 = i9;
                                for (i11 = 0; i11 <= iP; i11++) {
                                    oe0Var.p();
                                    oe0Var.p();
                                    if (zJ) {
                                        oe0Var.p();
                                        oe0Var.p();
                                    }
                                    oe0Var.a();
                                }
                                i10++;
                                i9 = i21;
                            }
                            i8++;
                            iArr3 = iArr6;
                            i20 = i20;
                            iArr5 = iArr7;
                        }
                        iP = oe0Var.p();
                        int[][] iArr8 = iArr3;
                        i9 = i7 + i6;
                        int[] iArr9 = iArr5;
                        i10 = 0;
                        while (i10 < i9) {
                            int i22 = i9;
                            while (i11 <= iP) {
                                oe0Var.p();
                                oe0Var.p();
                                if (zJ) {
                                    oe0Var.p();
                                    oe0Var.p();
                                }
                                oe0Var.a();
                            }
                            i10++;
                            i9 = i22;
                        }
                        i8++;
                        iArr3 = iArr8;
                        i20 = i20;
                        iArr5 = iArr9;
                    }
                    i20++;
                } else {
                    z3 = false;
                    z2 = false;
                }
                zJ = false;
                i7 = z3;
                i6 = z2;
                i8 = 0;
                while (i8 <= iK6) {
                    if (oe0Var.j()) {
                        oe0Var.p();
                        iP = oe0Var.p();
                    } else {
                        oe0Var.p();
                        iP = oe0Var.p();
                    }
                    int[][] iArr10 = iArr3;
                    i9 = i7 + i6;
                    int[] iArr11 = iArr5;
                    i10 = 0;
                    while (i10 < i9) {
                        int i23 = i9;
                        while (i11 <= iP) {
                            oe0Var.p();
                            oe0Var.p();
                            if (zJ) {
                                oe0Var.p();
                                oe0Var.p();
                            }
                            oe0Var.a();
                        }
                        i10++;
                        i9 = i23;
                    }
                    i8++;
                    iArr3 = iArr10;
                    i20 = i20;
                    iArr5 = iArr11;
                }
                i20++;
            }
        }
        int[][] iArr12 = iArr3;
        int[] iArr13 = iArr5;
        if (!oe0Var.j()) {
            return new y91((qk2) null, r32Var2, (us2) null, (r32) null);
        }
        int i24 = oe0Var.d;
        if (i24 > 0) {
            oe0Var.e(8 - i24);
        }
        m32 m32VarK1 = k0(oe0Var, false, iK6, m32VarK0);
        boolean zJ6 = oe0Var.j();
        boolean[] zArr3 = new boolean[16];
        int i25 = 0;
        for (int i26 = 0; i26 < 16; i26++) {
            boolean zJ7 = oe0Var.j();
            zArr3[i26] = zJ7;
            if (zJ7) {
                i25++;
            }
        }
        if (i25 == 0 || !zArr3[1]) {
            return new y91((qk2) null, r32Var2, (us2) null, (r32) null);
        }
        int i27 = i25 + 1;
        int[] iArr14 = new int[i25];
        for (int i28 = 0; i28 < i25 - (zJ6 ? 1 : 0); i28++) {
            iArr14[i28] = oe0Var.k(3);
        }
        int[] iArr15 = new int[i27];
        if (zJ6) {
            for (int i29 = 1; i29 < i25; i29++) {
                for (int i30 = 0; i30 < i29; i30++) {
                    iArr15[i29] = iArr14[i30] + 1 + iArr15[i29];
                }
            }
            iArr15[i25] = 6;
        }
        int[][] iArr16 = (int[][]) Array.newInstance((Class<?>) cls, i12, i25);
        int[] iArr17 = new int[i12];
        iArr17[0] = 0;
        boolean zJ8 = oe0Var.j();
        int i31 = 1;
        while (i31 < i12) {
            if (zJ8) {
                iArr17[i31] = oe0Var.k(i14);
            } else {
                iArr17[i31] = i31;
            }
            if (zJ6) {
                i5 = i31;
                int i32 = 0;
                while (i32 < i25) {
                    int i33 = i32 + 1;
                    iArr16[i5][i32] = (iArr17[i5] & ((1 << iArr15[i33]) - 1)) >> iArr15[i32];
                    i32 = i33;
                }
            } else {
                int i34 = 0;
                while (i34 < i25) {
                    iArr16[i31][i34] = oe0Var.k(iArr14[i34] + 1);
                    i34++;
                    i31 = i31;
                }
                i5 = i31;
            }
            i31 = i5 + 1;
            i14 = 6;
        }
        int[] iArr18 = new int[i15];
        int i35 = 1;
        int i36 = 0;
        while (i36 < i12) {
            iArr18[iArr17[i36]] = -1;
            int[] iArr19 = iArr18;
            int i37 = 0;
            int i38 = 0;
            while (i37 < 16) {
                if (zArr3[i37]) {
                    i4 = i16;
                    if (i37 == i4) {
                        iArr19[iArr17[i36]] = iArr16[i36][i38];
                        i37 = i4;
                    }
                    i38++;
                } else {
                    i4 = i16;
                }
                i37 += i4;
                i16 = i4;
            }
            if (i36 > 0) {
                int i39 = 0;
                while (true) {
                    if (i39 >= i36) {
                        i35++;
                        break;
                    }
                    int i40 = i39;
                    if (iArr19[iArr17[i36]] == iArr19[iArr17[i39]]) {
                        break;
                    }
                    i39 = i40 + 1;
                }
            }
            i36++;
            iArr18 = iArr19;
            i16 = 1;
        }
        int[] iArr20 = iArr18;
        int iK8 = oe0Var.k(4);
        if (i35 < 2 || iK8 == 0) {
            return new y91((qk2) null, r32Var2, (us2) null, (r32) null);
        }
        int[] iArr21 = new int[i35];
        for (int i41 = 0; i41 < i35; i41++) {
            iArr21[i41] = oe0Var.k(iK8);
        }
        int[] iArr22 = new int[i15];
        for (int i42 = 0; i42 < i12; i42++) {
            iArr22[Math.min(iArr17[i42], iK7)] = i42;
        }
        w40.k0("initialCapacity", 4);
        Object[] objArrCopyOf = new Object[4];
        int i43 = i35;
        int i44 = 0;
        int i45 = 0;
        while (i45 <= iK7) {
            int[] iArr23 = iArr22;
            int[] iArr24 = iArr17;
            int iMin = Math.min(iArr20[i45], i43 - 1);
            int i46 = i45;
            x22 x22Var = new x22(iArr23[i46], iMin >= 0 ? iArr21[iMin] : -1);
            int length = objArrCopyOf.length;
            int i47 = i44 + 1;
            int iD = pj2.d(length, i47);
            if (iD > length) {
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, iD);
            }
            objArrCopyOf[i44] = x22Var;
            i45 = i46 + 1;
            i44 = i47;
            iArr22 = iArr23;
            iArr17 = iArr24;
        }
        int[] iArr25 = iArr17;
        qk2 qk2VarO = vj2.o(objArrCopyOf, i44);
        if (((x22) qk2VarO.get(0)).b == -1) {
            return new y91((qk2) null, r32Var2, (us2) null, (r32) null);
        }
        int i48 = 1;
        while (true) {
            if (i48 > iK7) {
                i48 = -1;
                break;
            }
            if (((x22) qk2VarO.get(i48)).b != -1) {
                break;
            }
            i48++;
        }
        if (i48 == -1) {
            return new y91((qk2) null, r32Var2, (us2) null, (r32) null);
        }
        Class cls2 = Boolean.TYPE;
        boolean[][] zArr4 = (boolean[][]) Array.newInstance((Class<?>) cls2, i12, i12);
        boolean[][] zArr5 = (boolean[][]) Array.newInstance((Class<?>) cls2, i12, i12);
        int i49 = 1;
        while (i49 < i12) {
            boolean[][] zArr6 = zArr5;
            for (int i50 = 0; i50 < i49; i50++) {
                boolean[] zArr7 = zArr4[i49];
                boolean[] zArr8 = zArr6[i49];
                boolean zJ9 = oe0Var.j();
                zArr8[i50] = zJ9;
                zArr7[i50] = zJ9;
            }
            i49++;
            zArr5 = zArr6;
        }
        boolean[][] zArr9 = zArr5;
        for (int i51 = 1; i51 < i12; i51++) {
            int i52 = 0;
            while (i52 < iK5) {
                boolean[][] zArr10 = zArr4;
                for (int i53 = 0; i53 < i51; i53++) {
                    boolean[] zArr11 = zArr9[i51];
                    if (zArr11[i53] && zArr9[i53][i52]) {
                        zArr11[i52] = true;
                        break;
                    }
                }
                i52++;
                zArr4 = zArr10;
            }
        }
        boolean[][] zArr12 = zArr4;
        int[] iArr26 = new int[i15];
        for (int i54 = 0; i54 < i12; i54++) {
            int i55 = 0;
            for (int i56 = 0; i56 < i54; i56++) {
                i55 += zArr12[i54][i56] ? 1 : 0;
            }
            iArr26[iArr25[i54]] = i55;
        }
        int i57 = 0;
        for (int i58 = 0; i58 < i12; i58++) {
            if (iArr26[iArr25[i58]] == 0) {
                i57++;
            }
        }
        if (i57 > 1) {
            return new y91((qk2) null, r32Var2, (us2) null, (r32) null);
        }
        int[] iArr27 = new int[i12];
        int[] iArr28 = new int[iP2];
        if (oe0Var.j()) {
            int i59 = 0;
            while (i59 < i12) {
                int i60 = i59;
                iArr27[i60] = oe0Var.k(3);
                i59 = i60 + 1;
            }
        } else {
            Arrays.fill(iArr27, 0, i12, iK6);
        }
        int i61 = 0;
        while (i61 < iP2) {
            int i62 = i61;
            int[] iArr29 = iArr27;
            int[] iArr30 = iArr28;
            int iMax = 0;
            for (int i63 = 0; i63 < iArr4[i62]; i63++) {
                iMax = Math.max(iMax, iArr29[((x22) qk2VarO.get(iArr12[i62][i63])).a]);
            }
            iArr30[i62] = iMax + 1;
            i61 = i62 + 1;
            iArr27 = iArr29;
            iArr28 = iArr30;
        }
        int[] iArr31 = iArr28;
        if (oe0Var.j()) {
            int i64 = 0;
            while (i64 < iK5) {
                int i65 = i64 + 1;
                int i66 = i65;
                while (i66 < i12) {
                    if (zArr12[i66][i64]) {
                        oe0Var.e(3);
                    }
                    i66++;
                    iK5 = iK5;
                }
                i64 = i65;
            }
        }
        oe0Var.a();
        int iP4 = oe0Var.p() + 1;
        sj2 sj2Var = new sj2(4);
        sj2Var.a(m32VarK0);
        if (iP4 > 1) {
            sj2Var.a(m32VarK1);
            for (int i67 = 2; i67 < iP4; i67++) {
                m32VarK1 = k0(oe0Var, oe0Var.j(), iK6, m32VarK1);
                sj2Var.a(m32VarK1);
            }
        }
        qk2 qk2VarF = sj2Var.f();
        int iP5 = oe0Var.p() + iP2;
        if (iP5 > iP2) {
            return new y91((qk2) null, r32Var2, (us2) null, (r32) null);
        }
        int iK9 = oe0Var.k(2);
        boolean[][] zArr13 = (boolean[][]) Array.newInstance((Class<?>) cls2, iP5, i15);
        int[] iArr32 = new int[iP5];
        int i68 = 0;
        int[] iArr33 = new int[iP5];
        int i69 = 0;
        while (i69 < iP2) {
            iArr32[i69] = i68;
            int i70 = i69;
            int i71 = iArr13[i70];
            iArr33[i70] = i71;
            if (iK9 == 0) {
                zArr2 = zArr13;
                qk2Var = qk2VarF;
                iArr2 = iArr32;
                Arrays.fill(zArr13[i70], i68, iArr4[i70], true);
                iArr2[i70] = iArr4[i70];
            } else {
                qk2Var = qk2VarF;
                zArr2 = zArr13;
                iArr2 = iArr32;
                if (iK9 == 1) {
                    for (int i72 = 0; i72 < iArr4[i70]; i72++) {
                        zArr2[i70][i72] = iArr12[i70][i72] == i71;
                    }
                    iArr2[i70] = 1;
                } else {
                    i68 = 0;
                    zArr2[0][0] = true;
                    iArr2[0] = 1;
                }
                i69 = i70 + 1;
                zArr13 = zArr2;
                iArr32 = iArr2;
                qk2VarF = qk2Var;
            }
            i68 = 0;
            i69 = i70 + 1;
            zArr13 = zArr2;
            iArr32 = iArr2;
            qk2VarF = qk2Var;
        }
        qk2 qk2Var2 = qk2VarF;
        boolean[][] zArr14 = zArr13;
        int[] iArr34 = iArr32;
        int[] iArr35 = new int[i15];
        int i73 = 2;
        int[] iArr36 = new int[2];
        iArr36[1] = i15;
        iArr36[i68] = iP5;
        boolean[][] zArr15 = (boolean[][]) Array.newInstance((Class<?>) cls2, iArr36);
        int i74 = 1;
        int i75 = 0;
        while (i74 < iP5) {
            if (iK9 == i73) {
                for (int i76 = 0; i76 < iArr4[i74]; i76++) {
                    zArr14[i74][i76] = oe0Var.j();
                    int i77 = iArr34[i74];
                    boolean z6 = zArr14[i74][i76];
                    iArr34[i74] = i77 + (z6 ? 1 : 0);
                    if (z6) {
                        iArr33[i74] = iArr12[i74][i76];
                    }
                }
            }
            if (i75 == 0) {
                if (iArr12[i74][0] == 0 && zArr14[i74][0]) {
                    i75 = 0;
                    for (int i78 = 1; i78 < iArr4[i74]; i78++) {
                        if (iArr12[i74][i78] == i48 && zArr14[i74][i48]) {
                            i75 = i74;
                        }
                    }
                } else {
                    i75 = 0;
                }
            }
            int i79 = 0;
            while (i79 < iArr4[i74]) {
                if (iP4 > 1) {
                    zArr15[i74][i79] = zArr14[i74][i79];
                    iArr = iArr35;
                    zArr = zArr15;
                    RoundingMode roundingMode = RoundingMode.CEILING;
                    int iB = pl2.b(iP4);
                    if (!zArr[i74][i79]) {
                        int i80 = ((x22) qk2VarO.get(iArr12[i74][i79])).a;
                        int i81 = 0;
                        while (i81 < i79) {
                            int i82 = i81;
                            if (zArr9[i80][((x22) qk2VarO.get(iArr12[i74][i82])).a]) {
                                zArr[i74][i79] = true;
                                break;
                            }
                            i81 = i82 + 1;
                        }
                    }
                    if (zArr[i74][i79]) {
                        if (i75 <= 0 || i74 != i75) {
                            oe0Var.e(iB);
                        } else {
                            iArr[i79] = oe0Var.k(iB);
                        }
                    }
                } else {
                    iArr = iArr35;
                    zArr = zArr15;
                }
                i79++;
                iArr35 = iArr;
                zArr15 = zArr;
            }
            int[] iArr37 = iArr35;
            boolean[][] zArr16 = zArr15;
            if (iArr34[i74] == 1 && iArr26[iArr33[i74]] > 0) {
                oe0Var.a();
            }
            i74++;
            iArr35 = iArr37;
            zArr15 = zArr16;
            i73 = 2;
        }
        int[] iArr38 = iArr35;
        boolean[][] zArr17 = zArr15;
        if (i75 == 0) {
            return new y91((qk2) null, r32Var2, (us2) null, (r32) null);
        }
        int iP6 = oe0Var.p();
        int i83 = iP6 + 1;
        w40.k0("expectedSize", i83);
        w40.k0("initialCapacity", i83);
        int[] iArr39 = new int[i12];
        Object[] objArrCopyOf2 = new Object[i83];
        int i84 = 0;
        boolean z7 = false;
        for (int i85 = 0; i85 < i83; i85++) {
            int iK10 = oe0Var.k(16);
            int iK11 = oe0Var.k(16);
            if (oe0Var.j()) {
                iK2 = oe0Var.k(2);
                if (iK2 == 3) {
                    oe0Var.a();
                }
                iK3 = oe0Var.k(4);
                iK4 = oe0Var.k(4);
            } else {
                iK2 = 0;
                iK3 = 0;
                iK4 = 0;
            }
            if (oe0Var.j()) {
                int iP7 = oe0Var.p();
                int iP8 = oe0Var.p();
                int iP9 = oe0Var.p();
                int iP10 = oe0Var.p();
                iK10 -= (iP7 + iP8) * ((iK2 == 1 || iK2 == 2) ? 2 : 1);
                iK11 -= (iP9 + iP10) * (iK2 == 1 ? 2 : 1);
            }
            a42 a42Var = new a42(iK2, iK3, iK4, iK10, iK11);
            int length2 = objArrCopyOf2.length;
            int iD2 = pj2.d(length2, i84 + 1);
            if (iD2 > length2 || z7 != 0) {
                objArrCopyOf2 = Arrays.copyOf(objArrCopyOf2, iD2);
                z7 = false;
            } else {
                z7 = z7;
            }
            objArrCopyOf2[i84] = a42Var;
            i84++;
        }
        if (i83 <= 1 || !oe0Var.j()) {
            for (int i86 = 1; i86 < i12; i86++) {
                iArr39[i86] = Math.min(i86, iP6);
            }
        } else {
            RoundingMode roundingMode2 = RoundingMode.CEILING;
            int iB2 = pl2.b(i83);
            for (int i87 = 1; i87 < i12; i87++) {
                iArr39[i87] = oe0Var.k(iB2);
            }
        }
        us2 us2Var = new us2(vj2.o(objArrCopyOf2, i84), iArr39);
        oe0Var.e(2);
        for (int i88 = 1; i88 < i12; i88++) {
            if (iArr26[iArr25[i88]] == 0) {
                oe0Var.a();
            }
        }
        for (int i89 = 1; i89 < iP5; i89++) {
            boolean zJ10 = oe0Var.j();
            int i90 = 0;
            while (i90 < iArr31[i89]) {
                if ((i90 <= 0 || !zJ10) ? i90 == 0 : oe0Var.j()) {
                    for (int i91 = 0; i91 < iArr4[i89]; i91++) {
                        if (zArr17[i89][i91]) {
                            oe0Var.p();
                        }
                    }
                    oe0Var.p();
                    oe0Var.p();
                }
                i90++;
            }
        }
        int iP11 = oe0Var.p() + 2;
        if (oe0Var.j()) {
            oe0Var.e(iP11);
        } else {
            for (int i92 = 1; i92 < i12; i92++) {
                for (int i93 = 0; i93 < i92; i93++) {
                    if (zArr12[i92][i93]) {
                        oe0Var.e(iP11);
                    }
                }
            }
        }
        int iP12 = oe0Var.p();
        for (int i94 = 1; i94 <= iP12; i94++) {
            oe0Var.e(8);
        }
        if (oe0Var.j()) {
            int i95 = oe0Var.d;
            if (i95 > 0) {
                oe0Var.e(8 - i95);
            }
            if (oe0Var.j() || oe0Var.j()) {
                oe0Var.a();
            }
            boolean zJ11 = oe0Var.j();
            boolean zJ12 = oe0Var.j();
            if (zJ11 || zJ12) {
                for (int i96 = 0; i96 < iP2; i96++) {
                    for (int i97 = 0; i97 < iArr31[i96]; i97++) {
                        boolean zJ13 = zJ11 ? oe0Var.j() : false;
                        boolean zJ14 = zJ12 ? oe0Var.j() : false;
                        if (zJ13) {
                            oe0Var.e(32);
                        }
                        if (zJ14) {
                            oe0Var.e(18);
                        }
                    }
                }
            }
            boolean zJ15 = oe0Var.j();
            if (zJ15) {
                z = true;
                iK = oe0Var.k(4) + 1;
            } else {
                z = true;
                iK = i12;
            }
            w40.k0("expectedSize", iK);
            w40.k0("initialCapacity", iK);
            int[] iArr40 = new int[i12];
            Object[] objArrCopyOf3 = new Object[iK];
            int i98 = 0;
            int i99 = 0;
            boolean z8 = false;
            while (i98 < iK) {
                oe0Var.e(3);
                int i100 = z != oe0Var.j() ? 2 : 1;
                int iB3 = c43.b(oe0Var.k(8));
                int iC = c43.c(oe0Var.k(8));
                oe0Var.e(8);
                m52 m52Var = new m52(iB3, i100, iC);
                int length3 = objArrCopyOf3.length;
                int iD3 = pj2.d(length3, i99 + 1);
                if (iD3 > length3 || z8) {
                    objArrCopyOf3 = Arrays.copyOf(objArrCopyOf3, iD3);
                    z8 = false;
                }
                objArrCopyOf3[i99] = m52Var;
                i98++;
                i99++;
                z = true;
            }
            if (zJ15 && iK > 1) {
                for (int i101 = 0; i101 < i12; i101++) {
                    iArr40[i101] = oe0Var.k(4);
                }
            }
            r32Var = new r32(vj2.o(objArrCopyOf3, i99), iArr40, 1);
        } else {
            r32Var = null;
        }
        return new y91(qk2VarO, new r32(qk2Var2, iArr38, 0), us2Var, r32Var);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0013 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:11:0x0015  */
    /* JADX WARN: Code duplicated, block: B:12:0x0016 A[PHI: r2
  0x0016: PHI (r2v3 byte) = (r2v2 byte), (r2v9 byte) binds: [B:9:0x0011, B:11:0x0015] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:14:0x001c  */
    public static void Z(byte b2, byte b3, byte b4, char[] cArr, int i2) throws o23 {
        if (!e0(b3)) {
            if (b2 != -32) {
                if (b2 != -19) {
                    if (!e0(b4)) {
                        cArr[i2] = (char) (((b2 & 15) << 12) | ((b3 & 63) << 6) | (b4 & 63));
                        return;
                    }
                } else if (b3 < -96) {
                    b2 = -19;
                    if (!e0(b4)) {
                        cArr[i2] = (char) (((b2 & 15) << 12) | ((b3 & 63) << 6) | (b4 & 63));
                        return;
                    }
                }
            } else if (b3 >= -96) {
                b2 = -32;
                if (b2 != -19) {
                    if (!e0(b4)) {
                        cArr[i2] = (char) (((b2 & 15) << 12) | ((b3 & 63) << 6) | (b4 & 63));
                        return;
                    }
                } else if (b3 < -96) {
                    b2 = -19;
                    if (!e0(b4)) {
                        cArr[i2] = (char) (((b2 & 15) << 12) | ((b3 & 63) << 6) | (b4 & 63));
                        return;
                    }
                }
            }
        }
        j7.s("Protocol message had invalid UTF-8.");
    }

    public static boolean a0(File file) {
        boolean z;
        if (!file.exists()) {
            return true;
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            z = true;
            for (int i2 = 0; i2 < fileArrListFiles.length; i2++) {
                File file2 = fileArrListFiles[i2];
                z = file2 != null && a0(file2) && z;
            }
        } else {
            z = true;
        }
        return file.delete() && z;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x004d  */
    /* JADX WARN: Code duplicated, block: B:203:0x03b6  */
    /* JADX WARN: Code duplicated, block: B:37:0x00be  */
    public static c52 b0(byte[] bArr, int i2, int i3, y91 y91Var) {
        int i4;
        boolean z;
        int i5;
        int i6;
        int i7;
        int i8;
        int iP;
        int i9;
        int i10;
        int i11;
        int i12;
        float f2;
        int i13;
        int i14;
        int i15;
        int i16;
        int iB;
        int iC;
        int i17;
        r32 r32Var;
        int i18;
        us2 us2Var;
        eg egVarJ0 = j0(new oe0(bArr, i2, i3));
        oe0 oe0Var = new oe0(bArr, i2 + 2, i3);
        int i19 = 4;
        oe0Var.e(4);
        int iK = oe0Var.k(3);
        int i20 = egVarJ0.b;
        if (i20 == 0 || iK != 7) {
            i4 = iK;
            z = false;
        } else {
            z = true;
            i4 = 7;
        }
        if (y91Var != null) {
            vj2 vj2Var = (vj2) y91Var.g;
            if (vj2Var.isEmpty()) {
                i5 = 0;
            } else {
                i5 = ((x22) vj2Var.get(Math.min(i20, vj2Var.size() - 1))).a;
            }
        } else {
            i5 = 0;
        }
        m32 m32VarK0 = null;
        if (!z) {
            oe0Var.a();
            m32VarK0 = k0(oe0Var, true, i4, null);
        } else if (y91Var != null) {
            r32 r32Var2 = (r32) y91Var.h;
            int i21 = r32Var2.b[i5];
            vj2 vj2Var2 = r32Var2.a;
            if (vj2Var2.size() > i21) {
                m32VarK0 = (m32) vj2Var2.get(i21);
            }
        }
        m32 m32Var = m32VarK0;
        oe0Var.p();
        if (z) {
            int iK2 = oe0Var.j() ? oe0Var.k(8) : -1;
            if (y91Var == null || (us2Var = (us2) y91Var.i) == null) {
                i7 = 0;
                i11 = 0;
                iP = 0;
                i10 = 0;
                i8 = 0;
                i9 = 0;
            } else {
                if (iK2 == -1) {
                    iK2 = ((int[]) us2Var.h)[i5];
                }
                if (iK2 != -1) {
                    vj2 vj2Var3 = (vj2) us2Var.g;
                    if (vj2Var3.size() > iK2) {
                        a42 a42Var = (a42) vj2Var3.get(iK2);
                        int i22 = a42Var.a;
                        int i23 = a42Var.d;
                        int i24 = a42Var.e;
                        int i25 = a42Var.b;
                        i8 = i23;
                        i9 = i24;
                        iP = a42Var.c;
                        i10 = i8;
                        i11 = i25;
                        i7 = i9;
                    } else {
                        i7 = 0;
                        i11 = 0;
                        iP = 0;
                        i10 = 0;
                        i8 = 0;
                        i9 = 0;
                    }
                } else {
                    i7 = 0;
                    i11 = 0;
                    iP = 0;
                    i10 = 0;
                    i8 = 0;
                    i9 = 0;
                }
            }
        } else {
            int iP2 = oe0Var.p();
            if (iP2 == 3) {
                oe0Var.a();
                iP2 = 3;
            }
            int iP3 = oe0Var.p();
            int iP4 = oe0Var.p();
            if (oe0Var.j()) {
                int iP5 = oe0Var.p();
                int iP6 = oe0Var.p();
                int iP7 = oe0Var.p();
                int iP8 = oe0Var.p();
                i6 = iP3 - ((iP5 + iP6) * ((iP2 == 1 || iP2 == 2) ? 2 : 1));
                i7 = iP4 - ((iP7 + iP8) * (iP2 == 1 ? 2 : 1));
            } else {
                i6 = iP3;
                i7 = iP4;
            }
            int iP9 = oe0Var.p();
            i8 = iP3;
            iP = oe0Var.p();
            i9 = iP4;
            i10 = i6;
            i11 = iP9;
        }
        int iP10 = oe0Var.p();
        if (z) {
            i12 = -1;
        } else {
            int iMax = -1;
            for (int i26 = true != oe0Var.j() ? i4 : 0; i26 <= i4; i26++) {
                oe0Var.p();
                iMax = Math.max(oe0Var.p(), iMax);
                oe0Var.p();
            }
            i12 = iMax;
        }
        oe0Var.p();
        oe0Var.p();
        oe0Var.p();
        oe0Var.p();
        oe0Var.p();
        oe0Var.p();
        if (oe0Var.j()) {
            if (z && oe0Var.j()) {
                oe0Var.e(6);
            } else if (oe0Var.j()) {
                int i27 = 0;
                while (i27 < i19) {
                    int i28 = 0;
                    while (i28 < 6) {
                        if (oe0Var.j()) {
                            int iMin = Math.min(64, 1 << ((i27 + i27) + i19));
                            if (i27 > 1) {
                                oe0Var.n();
                            }
                            for (int i29 = 0; i29 < iMin; i29++) {
                                oe0Var.n();
                            }
                        } else {
                            oe0Var.p();
                        }
                        i28 += i27 == 3 ? 3 : 1;
                        i19 = 4;
                    }
                    i27++;
                    i19 = 4;
                }
            }
        }
        oe0Var.e(2);
        if (oe0Var.j()) {
            oe0Var.e(8);
            oe0Var.p();
            oe0Var.p();
            oe0Var.a();
        }
        int iP11 = oe0Var.p();
        int[] iArr = new int[0];
        int[] iArrCopyOf = new int[0];
        int i30 = 0;
        int i31 = -1;
        int i32 = -1;
        while (i30 < iP11) {
            if (i30 == 0 || !oe0Var.j()) {
                int iP12 = oe0Var.p();
                int iP13 = oe0Var.p();
                int[] iArr2 = new int[iP12];
                int i33 = 0;
                while (i33 < iP12) {
                    iArr2[i33] = (i33 > 0 ? iArr2[i33 - 1] : 0) - (oe0Var.p() + 1);
                    oe0Var.a();
                    i33++;
                }
                int[] iArr3 = new int[iP13];
                int i34 = 0;
                while (i34 < iP13) {
                    iArr3[i34] = oe0Var.p() + 1 + (i34 > 0 ? iArr3[i34 - 1] : 0);
                    oe0Var.a();
                    i34++;
                }
                i32 = iP13;
                iArr = iArr2;
                iArrCopyOf = iArr3;
                i31 = iP12;
            } else {
                int i35 = i31 + i32;
                boolean zJ = oe0Var.j();
                int iP14 = oe0Var.p() + 1;
                int i36 = 1 - ((zJ ? 1 : 0) + (zJ ? 1 : 0));
                int i37 = i35 + 1;
                boolean[] zArr = new boolean[i37];
                for (int i38 = 0; i38 <= i35; i38++) {
                    if (oe0Var.j()) {
                        zArr[i38] = true;
                    } else {
                        zArr[i38] = oe0Var.j();
                    }
                }
                int i39 = i32 - 1;
                int[] iArr4 = new int[i37];
                int[] iArr5 = new int[i37];
                int i40 = 0;
                while (true) {
                    i18 = i36 * iP14;
                    if (i39 < 0) {
                        break;
                    }
                    int i41 = iArrCopyOf[i39] + i18;
                    if (i41 < 0 && zArr[i31 + i39]) {
                        iArr4[i40] = i41;
                        i40++;
                    }
                    i39--;
                }
                if (i18 < 0 && zArr[i35]) {
                    iArr4[i40] = i18;
                    i40++;
                }
                int[] iArr6 = iArr;
                int i42 = i40;
                for (int i43 = 0; i43 < i31; i43++) {
                    int i44 = iArr6[i43] + i18;
                    if (i44 < 0 && zArr[i43]) {
                        iArr4[i42] = i44;
                        i42++;
                    }
                }
                int[] iArrCopyOf2 = Arrays.copyOf(iArr4, i42);
                int i45 = 0;
                for (int i46 = i31 - 1; i46 >= 0; i46--) {
                    int i47 = iArr6[i46] + i18;
                    if (i47 > 0 && zArr[i46]) {
                        iArr5[i45] = i47;
                        i45++;
                    }
                }
                if (i18 > 0 && zArr[i35]) {
                    iArr5[i45] = i18;
                    i45++;
                }
                int i48 = i45;
                for (int i49 = 0; i49 < i32; i49++) {
                    int i50 = iArrCopyOf[i49] + i18;
                    if (i50 > 0 && zArr[i31 + i49]) {
                        iArr5[i48] = i50;
                        i48++;
                    }
                }
                iArrCopyOf = Arrays.copyOf(iArr5, i48);
                i31 = i42;
                i32 = i48;
                iArr = iArrCopyOf2;
            }
            i30++;
            iP11 = iP11;
            i5 = i5;
        }
        int i51 = i5;
        if (oe0Var.j()) {
            int iP15 = oe0Var.p();
            for (int i52 = 0; i52 < iP15; i52++) {
                oe0Var.e(iP10 + 5);
            }
        }
        oe0Var.e(2);
        float f3 = 1.0f;
        if (oe0Var.j()) {
            if (oe0Var.j()) {
                int iK3 = oe0Var.k(8);
                if (iK3 == 255) {
                    int iK4 = oe0Var.k(16);
                    int iK5 = oe0Var.k(16);
                    if (iK4 != 0 && iK5 != 0) {
                        f3 = iK4 / iK5;
                    }
                } else if (iK3 < 17) {
                    f3 = n[iK3];
                } else {
                    ec.u(new StringBuilder(String.valueOf(iK3).length() + 35), "Unexpected aspect_ratio_idc value: ", iK3, "NalUnitUtil");
                }
            }
            if (oe0Var.j()) {
                oe0Var.a();
            }
            if (oe0Var.j()) {
                oe0Var.e(3);
                i17 = true != oe0Var.j() ? 2 : 1;
                if (oe0Var.j()) {
                    int iK6 = oe0Var.k(8);
                    int iK7 = oe0Var.k(8);
                    oe0Var.e(8);
                    iB = c43.b(iK6);
                    iC = c43.c(iK7);
                } else {
                    iB = -1;
                    iC = -1;
                }
            } else if (y91Var == null || (r32Var = (r32) y91Var.j) == null) {
                iB = -1;
                iC = -1;
                i17 = -1;
            } else {
                int i53 = r32Var.b[i51];
                vj2 vj2Var4 = r32Var.a;
                if (vj2Var4.size() > i53) {
                    m52 m52Var = (m52) vj2Var4.get(i53);
                    int i54 = m52Var.a;
                    int i55 = m52Var.b;
                    iC = m52Var.c;
                    iB = i54;
                    i17 = i55;
                } else {
                    iB = -1;
                    iC = -1;
                    i17 = -1;
                }
            }
            if (oe0Var.j()) {
                oe0Var.p();
                oe0Var.p();
            }
            oe0Var.a();
            if (oe0Var.j()) {
                i7 += i7;
            }
            i14 = iB;
            i16 = iC;
            f2 = f3;
            i15 = i17;
            i13 = i7;
        } else {
            f2 = 1.0f;
            i13 = i7;
            i14 = -1;
            i15 = -1;
            i16 = -1;
        }
        return new c52(i4, m32Var, i11, iP, i10, i13, i8, i9, f2, i12, i14, i15, i16);
    }

    public static final Bundle d(lv... lvVarArr) {
        Bundle bundle = new Bundle(lvVarArr.length);
        for (lv lvVar : lvVarArr) {
            String str = (String) lvVar.f;
            Object obj = lvVar.g;
            if (obj == null) {
                bundle.putString(str, null);
            } else if (obj instanceof Boolean) {
                bundle.putBoolean(str, ((Boolean) obj).booleanValue());
            } else if (obj instanceof Byte) {
                bundle.putByte(str, ((Number) obj).byteValue());
            } else if (obj instanceof Character) {
                bundle.putChar(str, ((Character) obj).charValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Number) obj).doubleValue());
            } else if (obj instanceof Float) {
                bundle.putFloat(str, ((Number) obj).floatValue());
            } else if (obj instanceof Integer) {
                bundle.putInt(str, ((Number) obj).intValue());
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Number) obj).longValue());
            } else if (obj instanceof Short) {
                bundle.putShort(str, ((Number) obj).shortValue());
            } else if (obj instanceof Bundle) {
                bundle.putBundle(str, (Bundle) obj);
            } else if (obj instanceof CharSequence) {
                bundle.putCharSequence(str, (CharSequence) obj);
            } else if (obj instanceof Parcelable) {
                bundle.putParcelable(str, (Parcelable) obj);
            } else if (obj instanceof boolean[]) {
                bundle.putBooleanArray(str, (boolean[]) obj);
            } else if (obj instanceof byte[]) {
                bundle.putByteArray(str, (byte[]) obj);
            } else if (obj instanceof char[]) {
                bundle.putCharArray(str, (char[]) obj);
            } else if (obj instanceof double[]) {
                bundle.putDoubleArray(str, (double[]) obj);
            } else if (obj instanceof float[]) {
                bundle.putFloatArray(str, (float[]) obj);
            } else if (obj instanceof int[]) {
                bundle.putIntArray(str, (int[]) obj);
            } else if (obj instanceof long[]) {
                bundle.putLongArray(str, (long[]) obj);
            } else if (obj instanceof short[]) {
                bundle.putShortArray(str, (short[]) obj);
            } else if (obj instanceof Object[]) {
                Class<?> componentType = obj.getClass().getComponentType();
                componentType.getClass();
                if (Parcelable.class.isAssignableFrom(componentType)) {
                    bundle.putParcelableArray(str, (Parcelable[]) obj);
                } else if (String.class.isAssignableFrom(componentType)) {
                    bundle.putStringArray(str, (String[]) obj);
                } else if (CharSequence.class.isAssignableFrom(componentType)) {
                    bundle.putCharSequenceArray(str, (CharSequence[]) obj);
                } else {
                    if (!Serializable.class.isAssignableFrom(componentType)) {
                        throw new IllegalArgumentException("Illegal value array type " + componentType.getCanonicalName() + " for key \"" + str + '\"');
                    }
                    bundle.putSerializable(str, (Serializable) obj);
                }
            } else if (obj instanceof Serializable) {
                bundle.putSerializable(str, (Serializable) obj);
            } else if (obj instanceof IBinder) {
                bundle.putBinder(str, (IBinder) obj);
            } else if (obj instanceof Size) {
                bundle.putSize(str, (Size) obj);
            } else {
                if (!(obj instanceof SizeF)) {
                    throw new IllegalArgumentException("Illegal value type " + obj.getClass().getCanonicalName() + " for key \"" + str + '\"');
                }
                bundle.putSizeF(str, (SizeF) obj);
            }
        }
        return bundle;
    }

    public static void d0(byte b2, byte b3, byte b4, byte b5, char[] cArr, int i2) throws o23 {
        if (!e0(b3)) {
            if ((((b3 + 112) + (b2 << 28)) >> 30) == 0 && !e0(b4) && !e0(b5)) {
                int i3 = ((b2 & 7) << 18) | ((b3 & 63) << 12) | ((b4 & 63) << 6) | (b5 & 63);
                cArr[i2] = (char) ((i3 >>> 10) + 55232);
                cArr[i2 + 1] = (char) ((i3 & 1023) + 56320);
                return;
            }
        }
        j7.s("Protocol message had invalid UTF-8.");
    }

    public static boolean e0(byte b2) {
        return b2 > -65;
    }

    public static int g0(byte[] bArr, int i2, int i3, boolean[] zArr) {
        int i4 = i3 - i2;
        hn.M(i4 >= 0);
        if (i4 == 0) {
            return i3;
        }
        if (zArr[0]) {
            h0(zArr);
            return i2 - 3;
        }
        if (i4 > 1 && zArr[1] && bArr[i2] == 1) {
            h0(zArr);
            return i2 - 2;
        }
        if (i4 > 2 && zArr[2] && bArr[i2] == 0 && bArr[i2 + 1] == 1) {
            h0(zArr);
            return i2 - 1;
        }
        int i5 = i3 - 1;
        int i6 = i2 + 2;
        while (i6 < i5) {
            byte b2 = bArr[i6];
            if ((b2 & 254) == 0) {
                int i7 = i6 - 2;
                if (bArr[i7] == 0 && bArr[i6 - 1] == 0 && b2 == 1) {
                    h0(zArr);
                    return i7;
                }
                i6 = i7;
            }
            i6 += 3;
        }
        zArr[0] = i4 <= 2 ? !(i4 != 2 ? !(zArr[1] && bArr[i5] == 1) : !(zArr[2] && bArr[i3 + (-2)] == 0 && bArr[i5] == 1)) : bArr[i3 + (-3)] == 0 && bArr[i3 + (-2)] == 0 && bArr[i5] == 1;
        zArr[1] = i4 <= 1 ? zArr[2] && bArr[i5] == 0 : bArr[i3 + (-2)] == 0 && bArr[i5] == 0;
        zArr[2] = bArr[i5] == 0;
        return i3;
    }

    public static ss0 h(hn hnVar, int i2) {
        if (i2 == 0) {
            return new gv(hnVar);
        }
        if (i2 == 1) {
            return new gv(hnVar);
        }
        j7.p("invalid orientation");
        return null;
    }

    public static void h0(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    public static final void i(bz bzVar) {
        yy yyVar;
        fo foVar = bzVar.e().c;
        if (foVar != fo.g && foVar != fo.h) {
            j7.p("Failed requirement.");
            return;
        }
        az azVar = (az) bzVar.b().g;
        synchronized (azVar.c) {
            Iterator it = azVar.d.entrySet().iterator();
            do {
                yyVar = null;
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                String str = (String) entry.getKey();
                yy yyVar2 = (yy) entry.getValue();
                if (jn.b(str, "androidx.lifecycle.internal.SavedStateHandlesProvider")) {
                    yyVar = yyVar2;
                }
            } while (yyVar == null);
        }
        if (yyVar == null) {
            vy vyVar = new vy(bzVar.b(), (d70) bzVar);
            bzVar.b().y("androidx.lifecycle.internal.SavedStateHandlesProvider", vyVar);
            bzVar.e().a(new pw(4, vyVar));
        }
    }

    public static String i0(List list) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            byte[] bArr = (byte[]) list.get(i2);
            int length = bArr.length;
            if (length > 3) {
                boolean[] zArr = new boolean[3];
                tj2 tj2Var = vj2.g;
                w40.k0("initialCapacity", 4);
                Object[] objArrCopyOf = new Object[4];
                int i3 = 0;
                int i4 = 0;
                while (true) {
                    int length2 = bArr.length;
                    if (i3 >= length2) {
                        break;
                    }
                    int iG0 = g0(bArr, i3, length2, zArr);
                    if (iG0 != length2) {
                        Integer numValueOf = Integer.valueOf(iG0);
                        int length3 = objArrCopyOf.length;
                        int i5 = i4 + 1;
                        int iD = pj2.d(length3, i5);
                        if (iD > length3) {
                            objArrCopyOf = Arrays.copyOf(objArrCopyOf, iD);
                        }
                        objArrCopyOf[i4] = numValueOf;
                        i4 = i5;
                    }
                    i3 = iG0 + 3;
                }
                qk2 qk2VarO = vj2.o(objArrCopyOf, i4);
                for (int i6 = 0; i6 < qk2VarO.i; i6++) {
                    if (((Integer) qk2VarO.get(i6)).intValue() + 3 < length) {
                        oe0 oe0Var = new oe0(bArr, ((Integer) qk2VarO.get(i6)).intValue() + 3, length);
                        eg egVarJ0 = j0(oe0Var);
                        if (egVarJ0.a == 33 && egVarJ0.b == 0) {
                            oe0Var.e(4);
                            int iK = oe0Var.k(3);
                            oe0Var.a();
                            m32 m32VarK0 = k0(oe0Var, true, iK, null);
                            return rl1.a(m32VarK0.a, m32VarK0.b, m32VarK0.c, m32VarK0.d, m32VarK0.e, m32VarK0.f);
                        }
                    }
                }
            }
        }
        return null;
    }

    public static eg j0(oe0 oe0Var) {
        oe0Var.a();
        return new eg(oe0Var.k(6), oe0Var.k(6), oe0Var.k(3) - 1, false);
    }

    public static final Class k(q9 q9Var) {
        Class clsA = q9Var.a();
        clsA.getClass();
        return clsA;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x005c  */
    /* JADX WARN: Code duplicated, block: B:23:0x0062  */
    /* JADX WARN: Code duplicated, block: B:26:0x006a  */
    /* JADX WARN: Code duplicated, block: B:30:0x0074  */
    /* JADX WARN: Code duplicated, block: B:39:0x006c A[SYNTHETIC] */
    public static m32 k0(oe0 oe0Var, boolean z, int i2, m32 m32Var) {
        int[] iArr;
        int i3;
        boolean z2;
        int i4;
        int i5;
        boolean zJ;
        int iK;
        int i6;
        int i7;
        int[] iArr2 = new int[6];
        if (!z) {
            if (m32Var != null) {
                int i8 = m32Var.a;
                zJ = m32Var.b;
                iK = m32Var.c;
                i6 = m32Var.d;
                iArr2 = m32Var.e;
                i3 = i8;
            } else {
                iArr = iArr2;
                i3 = 0;
                z2 = false;
                i4 = 0;
                i5 = 0;
            }
            int iK2 = oe0Var.k(8);
            i7 = 0;
            for (int i9 = 0; i9 < i2; i9++) {
                if (oe0Var.j()) {
                    i7 += 88;
                }
                if (oe0Var.j()) {
                    i7 += 8;
                }
            }
            oe0Var.e(i7);
            if (i2 > 0) {
                int i10 = 8 - i2;
                oe0Var.e(i10 + i10);
            }
            return new m32(i3, z2, i4, i5, iArr, iK2);
        }
        int iK3 = oe0Var.k(2);
        zJ = oe0Var.j();
        iK = oe0Var.k(5);
        i6 = 0;
        for (int i11 = 0; i11 < 32; i11++) {
            if (oe0Var.j()) {
                i6 |= 1 << i11;
            }
        }
        for (int i12 = 0; i12 < 6; i12++) {
            iArr2[i12] = oe0Var.k(8);
        }
        i3 = iK3;
        iArr = iArr2;
        z2 = zJ;
        i4 = iK;
        i5 = i6;
        int iK4 = oe0Var.k(8);
        i7 = 0;
        while (i9 < i2) {
            if (oe0Var.j()) {
                i7 += 88;
            }
            if (oe0Var.j()) {
                i7 += 8;
            }
        }
        oe0Var.e(i7);
        if (i2 > 0) {
            int i13 = 8 - i2;
            oe0Var.e(i13 + i13);
        }
        return new m32(i3, z2, i4, i5, iArr, iK4);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final Class l(q9 q9Var) {
        q9Var.getClass();
        Class clsA = q9Var.a();
        if (clsA.isPrimitive()) {
            String name = clsA.getName();
            switch (name.hashCode()) {
                case -1325958191:
                    if (name.equals("double")) {
                        return Double.class;
                    }
                    break;
                case 104431:
                    if (name.equals("int")) {
                        return Integer.class;
                    }
                    break;
                case 3039496:
                    if (name.equals("byte")) {
                        return Byte.class;
                    }
                    break;
                case 3052374:
                    if (name.equals("char")) {
                        return Character.class;
                    }
                    break;
                case 3327612:
                    if (name.equals("long")) {
                        return Long.class;
                    }
                    break;
                case 3625364:
                    if (name.equals("void")) {
                        return Void.class;
                    }
                    break;
                case 64711720:
                    if (name.equals("boolean")) {
                        return Boolean.class;
                    }
                    break;
                case 97526364:
                    if (name.equals("float")) {
                        return Float.class;
                    }
                    break;
                case 109413500:
                    if (name.equals("short")) {
                        return Short.class;
                    }
                    break;
            }
        }
        return clsA;
    }

    public static void l0(oe0 oe0Var) {
        int iP = oe0Var.p() + 1;
        oe0Var.e(8);
        for (int i2 = 0; i2 < iP; i2++) {
            oe0Var.p();
            oe0Var.p();
            oe0Var.a();
        }
        oe0Var.e(20);
    }

    public static final wy m(d70 d70Var) {
        uy uyVar = new uy();
        wc wcVarC = d70Var instanceof km ? ((km) d70Var).c() : vc.b;
        wcVarC.getClass();
        c70 c70VarD = d70Var.d();
        c70VarD.getClass();
        return (wy) new u40(c70VarD, uyVar, wcVarC).f(tw.a(wy.class), "androidx.lifecycle.internal.SavedStateHandlesVM");
    }

    public static final lz n(Object obj) {
        if (obj != s90.a) {
            obj.getClass();
            return (lz) obj;
        }
        j7.e("Does not contain segment");
        return null;
    }

    public static final void o(ic icVar, Throwable th) {
        try {
            i3 i3Var = (i3) icVar.f(gm.g);
            if (i3Var != null) {
                i3Var.a(th);
            } else {
                rs0.h(icVar, th);
            }
        } catch (Throwable th2) {
            if (th != th2) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                na1.d(runtimeException, th);
                th = runtimeException;
            }
            rs0.h(icVar, th);
        }
    }

    public static final boolean p(Object obj) {
        return obj == s90.a;
    }

    public static final void t(yb ybVar, Object obj) {
        if (!(ybVar instanceof ff)) {
            ybVar.d(obj);
            return;
        }
        ff ffVar = (ff) ybVar;
        lc lcVar = ffVar.i;
        ac acVar = ffVar.j;
        Throwable thA = sx.a(obj);
        Object maVar = thA == null ? obj : new ma(thA, false);
        if (lcVar.c(acVar.getContext())) {
            ffVar.k = maVar;
            ffVar.h = 1;
            lcVar.a(acVar.getContext(), ffVar);
            return;
        }
        xh xhVarA = u30.a();
        if (xhVarA.h >= 4294967296L) {
            ffVar.k = maVar;
            ffVar.h = 1;
            f7 f7Var = xhVarA.j;
            if (f7Var == null) {
                f7Var = new f7();
                xhVarA.j = f7Var;
            }
            f7Var.addLast(ffVar);
            return;
        }
        xhVarA.l(true);
        try {
            wn wnVar = (wn) acVar.getContext().f(gm.h);
            if (wnVar == null || wnVar.A()) {
                Object obj2 = ffVar.l;
                ic context = acVar.getContext();
                Object objS = dq.s(context, obj2);
                i50 i50VarL = objS != dq.m ? s90.l(acVar, context, objS) : null;
                try {
                    acVar.d(obj);
                    if (i50VarL == null || i50VarL.P()) {
                        dq.o(context, objS);
                    }
                } catch (Throwable th) {
                    if (i50VarL == null || i50VarL.P()) {
                        dq.o(context, objS);
                    }
                    throw th;
                }
            } else {
                ffVar.d(new rx(wnVar.s()));
            }
            while (xhVarA.o()) {
            }
        } catch (Throwable th2) {
            try {
                ffVar.i(th2);
            } finally {
                xhVarA.g();
            }
        }
    }

    public static int x(int i2) {
        switch (i2) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            case 9:
                return 10;
            case 10:
                return 11;
            case 11:
                return 12;
            case 12:
                return 13;
            case 13:
                return 14;
            default:
                return 0;
        }
    }

    public static int y(int i2, byte[] bArr) {
        int i3;
        synchronized (o) {
            int i4 = 0;
            int i5 = 0;
            while (i4 < i2) {
                while (true) {
                    try {
                        if (i4 >= i2 - 2) {
                            i4 = i2;
                            break;
                        }
                        int i6 = i4 + 1;
                        if (bArr[i4] == 0 && bArr[i6] == 0 && bArr[i4 + 2] == 3) {
                            break;
                        }
                        i4 = i6;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (i4 < i2) {
                    int[] iArr = p;
                    int length = iArr.length;
                    if (length <= i5) {
                        p = Arrays.copyOf(iArr, length + length);
                    }
                    p[i5] = i4;
                    i4 += 3;
                    i5++;
                }
            }
            i3 = i2 - i5;
            int i7 = 0;
            int i8 = 0;
            for (int i9 = 0; i9 < i5; i9++) {
                int i10 = p[i9] - i7;
                System.arraycopy(bArr, i7, bArr, i8, i10);
                int i11 = i8 + i10;
                int i12 = i11 + 1;
                bArr[i11] = 0;
                i8 = i11 + 2;
                bArr[i12] = 0;
                i7 += i10 + 3;
            }
            System.arraycopy(bArr, i7, bArr, i8, i3 - i8);
        }
        return i3;
    }

    public static long z(String str) {
        String str2 = qz1.a;
        String[] strArrSplit = str.split("\\.", 2);
        long j2 = 0;
        for (String str3 : strArrSplit[0].split(":", -1)) {
            j2 = (j2 * 60) + Long.parseLong(str3);
        }
        long j3 = j2 * 1000;
        if (strArrSplit.length == 2) {
            String strTrim = strArrSplit[1].trim();
            if (strTrim.length() != 3) {
                j7.p("Expected 3 decimal places, got: ".concat(strTrim));
                return 0L;
            }
            j3 += Long.parseLong(strTrim);
        }
        return j3 * 1000;
    }

    public abstract void C(mm2 mm2Var, Thread thread);

    public abstract void L(mm2 mm2Var, mm2 mm2Var2);

    public abstract boolean R(nm2 nm2Var, mm2 mm2Var, mm2 mm2Var2);

    public abstract boolean W(fm2 fm2Var, cm2 cm2Var, cm2 cm2Var2);

    public abstract mm2 Y(fm2 fm2Var);

    public abstract cm2 c0(fm2 fm2Var);

    public abstract boolean e(s sVar, n nVar, n nVar2);

    public abstract boolean f(s sVar, Object obj, Object obj2);

    public abstract boolean f0(nm2 nm2Var, Object obj, Object obj2);

    public abstract boolean g(s sVar, r rVar, r rVar2);

    public abstract InputFilter[] j(InputFilter[] inputFilterArr);

    public abstract boolean q();

    public abstract void r(r rVar, r rVar2);

    public abstract void s(r rVar, Thread thread);

    public abstract void u(boolean z);

    public abstract void v(boolean z);

    public abstract TransformationMethod w(TransformationMethod transformationMethod);

    @Override // defpackage.j70
    public void b() {
    }

    @Override // defpackage.j70
    public void c() {
    }
}
