package defpackage;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.Locale;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public abstract class i8 implements qd0 {
    public static final /* synthetic */ int B = 0;
    public static ve3 x;
    public static fe3 y;
    public static final int[] f = {R.attr.name, R.attr.tint, R.attr.height, R.attr.width, R.attr.alpha, R.attr.autoMirrored, R.attr.tintMode, R.attr.viewportWidth, R.attr.viewportHeight};
    public static final int[] g = {R.attr.name, R.attr.pivotX, R.attr.pivotY, R.attr.scaleX, R.attr.scaleY, R.attr.rotation, R.attr.translateX, R.attr.translateY};
    public static final int[] h = {R.attr.name, R.attr.fillColor, R.attr.pathData, R.attr.strokeColor, R.attr.strokeWidth, R.attr.trimPathStart, R.attr.trimPathEnd, R.attr.trimPathOffset, R.attr.strokeLineCap, R.attr.strokeLineJoin, R.attr.strokeMiterLimit, R.attr.strokeAlpha, R.attr.fillAlpha, R.attr.fillType};
    public static final int[] i = {R.attr.name, R.attr.pathData, R.attr.fillType};
    public static final int[] j = {R.attr.drawable};
    public static final int[] k = {R.attr.name, R.attr.animation};
    public static final int[] l = {R.attr.theme, com.extremestudios.musicmanevo.R.attr.theme};
    public static final int[] m = {com.extremestudios.musicmanevo.R.attr.materialThemeOverlay};
    public static final d90 n = new d90(1, 2, 0);
    public static final d90 o = new d90(3, 4, 1);
    public static final d90 p = new d90(4, 5, 2);
    public static final d90 q = new d90(6, 7, 3);
    public static final d90 r = new d90(7, 8, 4);
    public static final d90 s = new d90(8, 9, 5);
    public static final d90 t = new d90(11, 12, 6);
    public static final um0 u = new um0("gads:pan:experiment_id", 4, "");
    public static final xn1 v = new xn1(0);
    public static final xn1 w = new xn1(18);
    public static final Object z = new Object();
    public static final l32 A = new l32(17);

    public static void A(File file) throws IOException {
        file.getClass();
        File parentFile = file.getCanonicalFile().getParentFile();
        if (parentFile == null) {
            return;
        }
        parentFile.mkdirs();
        if (!parentFile.isDirectory()) {
            throw new IOException("Unable to create parent directories of ".concat(file.toString()));
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x006b A[Catch: all -> 0x0020, TryCatch #0 {all -> 0x0020, blocks: (B:3:0x0006, B:7:0x0013, B:20:0x003e, B:23:0x0049, B:25:0x006b, B:29:0x0071, B:41:0x008d, B:42:0x008f, B:45:0x0095, B:48:0x009f, B:31:0x007b, B:35:0x0082, B:10:0x0023), top: B:54:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:27:0x006f  */
    /* JADX WARN: Code duplicated, block: B:28:0x0070  */
    /* JADX WARN: Code duplicated, block: B:30:0x0079 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x007b A[Catch: all -> 0x0020, TryCatch #0 {all -> 0x0020, blocks: (B:3:0x0006, B:7:0x0013, B:20:0x003e, B:23:0x0049, B:25:0x006b, B:29:0x0071, B:41:0x008d, B:42:0x008f, B:45:0x0095, B:48:0x009f, B:31:0x007b, B:35:0x0082, B:10:0x0023), top: B:54:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x007f  */
    /* JADX WARN: Code duplicated, block: B:34:0x0081  */
    /* JADX WARN: Code duplicated, block: B:37:0x0086  */
    /* JADX WARN: Code duplicated, block: B:38:0x0087  */
    /* JADX WARN: Code duplicated, block: B:39:0x0089  */
    /* JADX WARN: Code duplicated, block: B:41:0x008d A[Catch: all -> 0x0020, TryCatch #0 {all -> 0x0020, blocks: (B:3:0x0006, B:7:0x0013, B:20:0x003e, B:23:0x0049, B:25:0x006b, B:29:0x0071, B:41:0x008d, B:42:0x008f, B:45:0x0095, B:48:0x009f, B:31:0x007b, B:35:0x0082, B:10:0x0023), top: B:54:0x0006 }] */
    public static boolean B(cw1 cw1Var, int i2, int i3, boolean z2) {
        boolean z3;
        int iO;
        long jO;
        int iL;
        int i4;
        int i5 = cw1Var.b;
        while (true) {
            try {
                z3 = true;
                z3 = true;
                int i6 = 1;
                int i7 = 1;
                if (cw1Var.B() >= i3) {
                    if (i2 >= 3) {
                        iO = cw1Var.b();
                        jO = cw1Var.P();
                        iL = cw1Var.L();
                    } else {
                        iO = cw1Var.O();
                        jO = cw1Var.O();
                        iL = 0;
                    }
                    if (iO != 0 || jO != 0 || iL != 0) {
                        if (i2 != 4 || z2) {
                            if (i2 == 4) {
                                if ((iL & 64) != 0) {
                                    i6 = 0;
                                }
                                int i8 = i6;
                                i7 = iL & 1;
                                i4 = i8;
                            } else if (i2 == 3) {
                                if ((iL & 32) != 0) {
                                    i4 = 1;
                                } else {
                                    i4 = 0;
                                }
                                if ((iL & 128) != 0) {
                                    i7 = 0;
                                }
                            } else {
                                i4 = 0;
                                i7 = 0;
                            }
                            if (i7 != 0) {
                                i4 += 4;
                            }
                            if (jO >= i4 && cw1Var.B() >= jO) {
                                cw1Var.G((int) jO);
                            }
                        } else if ((8421504 & jO) == 0) {
                            long j2 = ((jO >> 16) & 255) << 14;
                            jO = ((jO >> 24) << 21) | j2 | (jO & 255) | (((jO >> 8) & 255) << 7);
                            if (i2 == 4) {
                                if ((iL & 64) != 0) {
                                    i6 = 0;
                                }
                                int i9 = i6;
                                i7 = iL & 1;
                                i4 = i9;
                            } else if (i2 == 3) {
                                if ((iL & 32) != 0) {
                                    i4 = 1;
                                } else {
                                    i4 = 0;
                                }
                                if ((iL & 128) != 0) {
                                    i7 = 0;
                                }
                            } else {
                                i4 = 0;
                                i7 = 0;
                            }
                            if (i7 != 0) {
                                i4 += 4;
                            }
                            if (jO >= i4) {
                                cw1Var.G((int) jO);
                            }
                        }
                        z3 = false;
                        break;
                    }
                    break;
                }
                break;
            } catch (Throwable th) {
                cw1Var.E(i5);
                throw th;
            }
        }
        cw1Var.E(i5);
        return z3;
    }

    /* JADX WARN: Code duplicated, block: B:153:0x026b  */
    /* JADX WARN: Code duplicated, block: B:154:0x026d  */
    /* JADX WARN: Code duplicated, block: B:158:0x0274  */
    /* JADX WARN: Code duplicated, block: B:159:0x027a  */
    /* JADX WARN: Code duplicated, block: B:161:0x027e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:166:0x0297 A[Catch: all -> 0x0130, Exception -> 0x0255, OutOfMemoryError -> 0x025a, TRY_LEAVE, TryCatch #0 {all -> 0x0130, blocks: (B:83:0x0105, B:92:0x013e, B:95:0x0145, B:106:0x016f, B:109:0x01a1, B:117:0x01cc, B:119:0x01e0, B:121:0x01e7, B:120:0x01e3, B:135:0x0206, B:137:0x021d, B:139:0x0244, B:141:0x024b, B:140:0x0247, B:164:0x0284, B:166:0x0297, B:168:0x02a0, B:180:0x02e4, B:182:0x0300, B:184:0x0307, B:183:0x0303, B:176:0x02c2, B:178:0x02de, B:196:0x0325, B:202:0x0366, B:206:0x03a0, B:210:0x03ad, B:211:0x03b3, B:213:0x03b9, B:215:0x03c0, B:216:0x03c4, B:224:0x03e5, B:228:0x0410, B:230:0x041b, B:231:0x044d, B:232:0x0458, B:234:0x045e, B:236:0x0465, B:237:0x0469, B:242:0x0482, B:249:0x0493, B:251:0x04bd, B:252:0x04cc, B:253:0x04d7), top: B:265:0x00f2 }] */
    /* JADX WARN: Code duplicated, block: B:170:0x02b7  */
    /* JADX WARN: Code duplicated, block: B:176:0x02c2 A[Catch: all -> 0x0130, Exception -> 0x02bc, OutOfMemoryError -> 0x02bf, TryCatch #0 {all -> 0x0130, blocks: (B:83:0x0105, B:92:0x013e, B:95:0x0145, B:106:0x016f, B:109:0x01a1, B:117:0x01cc, B:119:0x01e0, B:121:0x01e7, B:120:0x01e3, B:135:0x0206, B:137:0x021d, B:139:0x0244, B:141:0x024b, B:140:0x0247, B:164:0x0284, B:166:0x0297, B:168:0x02a0, B:180:0x02e4, B:182:0x0300, B:184:0x0307, B:183:0x0303, B:176:0x02c2, B:178:0x02de, B:196:0x0325, B:202:0x0366, B:206:0x03a0, B:210:0x03ad, B:211:0x03b3, B:213:0x03b9, B:215:0x03c0, B:216:0x03c4, B:224:0x03e5, B:228:0x0410, B:230:0x041b, B:231:0x044d, B:232:0x0458, B:234:0x045e, B:236:0x0465, B:237:0x0469, B:242:0x0482, B:249:0x0493, B:251:0x04bd, B:252:0x04cc, B:253:0x04d7), top: B:265:0x00f2 }] */
    /* JADX WARN: Code duplicated, block: B:178:0x02de A[Catch: all -> 0x0130, Exception -> 0x02bc, OutOfMemoryError -> 0x02bf, TryCatch #0 {all -> 0x0130, blocks: (B:83:0x0105, B:92:0x013e, B:95:0x0145, B:106:0x016f, B:109:0x01a1, B:117:0x01cc, B:119:0x01e0, B:121:0x01e7, B:120:0x01e3, B:135:0x0206, B:137:0x021d, B:139:0x0244, B:141:0x024b, B:140:0x0247, B:164:0x0284, B:166:0x0297, B:168:0x02a0, B:180:0x02e4, B:182:0x0300, B:184:0x0307, B:183:0x0303, B:176:0x02c2, B:178:0x02de, B:196:0x0325, B:202:0x0366, B:206:0x03a0, B:210:0x03ad, B:211:0x03b3, B:213:0x03b9, B:215:0x03c0, B:216:0x03c4, B:224:0x03e5, B:228:0x0410, B:230:0x041b, B:231:0x044d, B:232:0x0458, B:234:0x045e, B:236:0x0465, B:237:0x0469, B:242:0x0482, B:249:0x0493, B:251:0x04bd, B:252:0x04cc, B:253:0x04d7), top: B:265:0x00f2 }] */
    /* JADX WARN: Code duplicated, block: B:179:0x02e3  */
    /* JADX WARN: Code duplicated, block: B:182:0x0300 A[Catch: all -> 0x0130, Exception -> 0x02bc, OutOfMemoryError -> 0x02bf, TryCatch #0 {all -> 0x0130, blocks: (B:83:0x0105, B:92:0x013e, B:95:0x0145, B:106:0x016f, B:109:0x01a1, B:117:0x01cc, B:119:0x01e0, B:121:0x01e7, B:120:0x01e3, B:135:0x0206, B:137:0x021d, B:139:0x0244, B:141:0x024b, B:140:0x0247, B:164:0x0284, B:166:0x0297, B:168:0x02a0, B:180:0x02e4, B:182:0x0300, B:184:0x0307, B:183:0x0303, B:176:0x02c2, B:178:0x02de, B:196:0x0325, B:202:0x0366, B:206:0x03a0, B:210:0x03ad, B:211:0x03b3, B:213:0x03b9, B:215:0x03c0, B:216:0x03c4, B:224:0x03e5, B:228:0x0410, B:230:0x041b, B:231:0x044d, B:232:0x0458, B:234:0x045e, B:236:0x0465, B:237:0x0469, B:242:0x0482, B:249:0x0493, B:251:0x04bd, B:252:0x04cc, B:253:0x04d7), top: B:265:0x00f2 }] */
    /* JADX WARN: Code duplicated, block: B:183:0x0303 A[Catch: all -> 0x0130, Exception -> 0x02bc, OutOfMemoryError -> 0x02bf, TryCatch #0 {all -> 0x0130, blocks: (B:83:0x0105, B:92:0x013e, B:95:0x0145, B:106:0x016f, B:109:0x01a1, B:117:0x01cc, B:119:0x01e0, B:121:0x01e7, B:120:0x01e3, B:135:0x0206, B:137:0x021d, B:139:0x0244, B:141:0x024b, B:140:0x0247, B:164:0x0284, B:166:0x0297, B:168:0x02a0, B:180:0x02e4, B:182:0x0300, B:184:0x0307, B:183:0x0303, B:176:0x02c2, B:178:0x02de, B:196:0x0325, B:202:0x0366, B:206:0x03a0, B:210:0x03ad, B:211:0x03b3, B:213:0x03b9, B:215:0x03c0, B:216:0x03c4, B:224:0x03e5, B:228:0x0410, B:230:0x041b, B:231:0x044d, B:232:0x0458, B:234:0x045e, B:236:0x0465, B:237:0x0469, B:242:0x0482, B:249:0x0493, B:251:0x04bd, B:252:0x04cc, B:253:0x04d7), top: B:265:0x00f2 }] */
    /* JADX WARN: Code duplicated, block: B:187:0x0313  */
    /* JADX WARN: Code duplicated, block: B:197:0x035c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:198:0x035e  */
    /* JADX WARN: Code duplicated, block: B:218:0x03d9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:219:0x03db  */
    /* JADX WARN: Code duplicated, block: B:243:0x0487 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:244:0x0489  */
    /* JADX WARN: Code duplicated, block: B:259:0x04f6  */
    public static bg0 C(int i2, cw1 cw1Var, boolean z2, zf0 zf0Var) {
        int iH;
        int i3;
        int i4;
        boolean z3;
        boolean z4;
        boolean z5;
        bg0 bg0Var;
        int i5;
        bg0 uf0Var;
        bg0 eg0Var;
        int i6;
        byte[] bArr;
        int iN;
        String strV;
        String strConcat;
        int iO;
        byte[] bArrCopyOfRange;
        int iK = cw1Var.K();
        int iK2 = cw1Var.K();
        int iK3 = cw1Var.K();
        int iK4 = i2 >= 3 ? cw1Var.K() : 0;
        if (i2 == 4) {
            iH = cw1Var.h();
            if (!z2) {
                iH = ((iH >> 24) << 21) | (iH & 255) | (((iH >> 8) & 255) << 7) | (((iH >> 16) & 255) << 14);
            }
        } else {
            iH = i2 == 3 ? cw1Var.h() : cw1Var.O();
        }
        int iL = i2 >= 3 ? cw1Var.L() : 0;
        if (iK == 0 && iK2 == 0 && iK3 == 0 && iK4 == 0 && iH == 0 && iL == 0) {
            cw1Var.E(cw1Var.c);
            return null;
        }
        int iD = cw1Var.D() + iH;
        String str = "Id3Decoder";
        if (iD > cw1Var.c) {
            s90.Q("Id3Decoder", "Frame size exceeds remaining tag data");
            cw1Var.E(cw1Var.c);
            return null;
        }
        if (zf0Var != null) {
            cw1Var.E(iD);
            return null;
        }
        if (i2 == 3) {
            int i7 = iL & 64;
            i3 = (iL & 128) != 0 ? 1 : 0;
            z5 = false;
            z4 = i7 != 0;
            z3 = (iL & 32) != 0;
            i4 = i3;
        } else if (i2 == 4) {
            boolean z6 = (iL & 64) != 0;
            int i8 = (iL & 8) != 0 ? 1 : 0;
            z4 = (iL & 4) != 0;
            z5 = (iL & 2) != 0;
            i4 = iL & 1;
            int i9 = i8;
            z3 = z6;
            i3 = i9;
        } else {
            i3 = 0;
            i4 = 0;
            z3 = false;
            z4 = false;
            z5 = false;
        }
        if (i3 != 0 || z4) {
            s90.Q("Id3Decoder", "Skipping unsupported compressed or encrypted frame");
            cw1Var.E(iD);
            return null;
        }
        if (z3) {
            cw1Var.G(1);
            iH--;
        }
        if (i4 != 0) {
            cw1Var.G(4);
            iH -= 4;
        }
        if (z5) {
            iH = F(iH, cw1Var);
        }
        try {
            try {
                if (iK == 84 && iK2 == 88 && iK3 == 88 && (i2 == 2 || iK4 == 88)) {
                    if (iH <= 0) {
                        uf0Var = null;
                    } else {
                        int iK5 = cw1Var.K();
                        int i10 = iH - 1;
                        byte[] bArr2 = new byte[i10];
                        cw1Var.H(bArr2, 0, i10);
                        int iL2 = L(bArr2, 0, iK5);
                        uf0Var = new gg0("TXXX", new String(bArr2, 0, iL2, I(iK5)), E(bArr2, iK5, iL2 + O(iK5)));
                    }
                    str = "Id3Decoder";
                } else {
                    if (iK == 84) {
                        String strK = K(i2, 84, iK2, iK3, iK4);
                        if (iH > 0) {
                            int iK6 = cw1Var.K();
                            int i11 = iH - 1;
                            byte[] bArr3 = new byte[i11];
                            cw1Var.H(bArr3, 0, i11);
                            uf0Var = new gg0(strK, null, E(bArr3, iK6, 0));
                        }
                        str = "Id3Decoder";
                    } else {
                        if (iK == 87) {
                            if (iK2 != 88 || iK3 != 88 || (i2 != 2 && iK4 != 88)) {
                                i5 = 87;
                            } else if (iH > 0) {
                                int iK7 = cw1Var.K();
                                int i12 = iH - 1;
                                byte[] bArr4 = new byte[i12];
                                cw1Var.H(bArr4, 0, i12);
                                int iL3 = L(bArr4, 0, iK7);
                                String str2 = new String(bArr4, 0, iL3, I(iK7));
                                int iO2 = iL3 + O(iK7);
                                uf0Var = new hg0("WXXX", str2, P(bArr4, iO2, N(iO2, bArr4), StandardCharsets.ISO_8859_1));
                            }
                            str = "Id3Decoder";
                        } else {
                            i5 = iK;
                        }
                        if (i5 == 87) {
                            String strK2 = K(i2, 87, iK2, iK3, iK4);
                            byte[] bArr5 = new byte[iH];
                            cw1Var.H(bArr5, 0, iH);
                            uf0Var = new hg0(strK2, null, new String(bArr5, 0, N(0, bArr5), StandardCharsets.ISO_8859_1));
                        } else {
                            if (i5 == 80) {
                                if (iK2 == 82 && iK3 == 73 && iK4 == 86) {
                                    byte[] bArr6 = new byte[iH];
                                    cw1Var.H(bArr6, 0, iH);
                                    int iN2 = N(0, bArr6);
                                    String str3 = new String(bArr6, 0, iN2, StandardCharsets.ISO_8859_1);
                                    int i13 = iN2 + 1;
                                    uf0Var = new fg0(str3, iH <= i13 ? qz1.b : Arrays.copyOfRange(bArr6, i13, iH));
                                } else {
                                    i5 = 80;
                                }
                            }
                            try {
                                if (i5 != 71) {
                                    try {
                                        if (i2 == 2) {
                                            if (i5 != 80 && iK2 == 73 && iK3 == 67) {
                                                int iK8 = cw1Var.K();
                                                Charset charsetI = I(iK8);
                                                i6 = iH - 1;
                                                bArr = new byte[i6];
                                                cw1Var.H(bArr, 0, i6);
                                                if (i2 == 2) {
                                                    iK = iK;
                                                    strConcat = "image/".concat(String.valueOf(dq.v(new String(bArr, 0, 3, StandardCharsets.ISO_8859_1))));
                                                    if ("image/jpg".equals(strConcat)) {
                                                        strConcat = "image/jpeg";
                                                    }
                                                    iN = 2;
                                                } else {
                                                    iK = iK;
                                                    iN = N(0, bArr);
                                                    strV = dq.v(new String(bArr, 0, iN, StandardCharsets.ISO_8859_1));
                                                    if (strV.indexOf(47) == -1) {
                                                        strConcat = "image/".concat(strV);
                                                    } else {
                                                        strConcat = strV;
                                                    }
                                                }
                                                int i14 = bArr[iN + 1] & 255;
                                                int i15 = iN + 2;
                                                int iL4 = L(bArr, i15, iK8);
                                                String str4 = new String(bArr, i15, iL4 - i15, charsetI);
                                                iO = iL4 + O(iK8);
                                                if (i6 <= iO) {
                                                    bArrCopyOfRange = qz1.b;
                                                } else {
                                                    bArrCopyOfRange = Arrays.copyOfRange(bArr, iO, i6);
                                                }
                                                uf0Var = new tf0(strConcat, str4, i14, bArrCopyOfRange);
                                            } else {
                                                iK = iK;
                                                if (i5 == 67 || iK2 != 79 || iK3 != 77 || (iK4 != 77 && i2 != 2)) {
                                                    if (i5 != 67 && iK2 == 72 && iK3 == 65 && iK4 == 80) {
                                                        int iD2 = cw1Var.D();
                                                        int iN3 = N(iD2, cw1Var.F());
                                                        String str5 = new String(cw1Var.F(), iD2, iN3 - iD2, StandardCharsets.ISO_8859_1);
                                                        cw1Var.E(iN3 + 1);
                                                        int iB = cw1Var.b();
                                                        int iB2 = cw1Var.b();
                                                        long jP = cw1Var.P();
                                                        long j2 = jP == 4294967295L ? -1L : jP;
                                                        long jP2 = cw1Var.P();
                                                        long j3 = jP2 == 4294967295L ? -1L : jP2;
                                                        ArrayList arrayList = new ArrayList();
                                                        int i16 = iD2 + iH;
                                                        while (cw1Var.D() < i16) {
                                                            bg0 bg0VarC = C(i2, cw1Var, z2, null);
                                                            if (bg0VarC != null) {
                                                                arrayList.add(bg0VarC);
                                                            }
                                                        }
                                                        eg0Var = new vf0(str5, iB, iB2, j2, j3, (bg0[]) arrayList.toArray(new bg0[0]));
                                                    } else if (i5 != 67 && iK2 == 84 && iK3 == 79 && iK4 == 67) {
                                                        int iD3 = cw1Var.D();
                                                        int iN4 = N(iD3, cw1Var.F());
                                                        String str6 = new String(cw1Var.F(), iD3, iN4 - iD3, StandardCharsets.ISO_8859_1);
                                                        cw1Var.E(iN4 + 1);
                                                        int iK9 = cw1Var.K();
                                                        boolean z7 = (iK9 & 2) != 0;
                                                        int i17 = iK9 & 1;
                                                        int iK10 = cw1Var.K();
                                                        String[] strArr = new String[iK10];
                                                        int i18 = 0;
                                                        while (i18 < iK10) {
                                                            int iD4 = cw1Var.D();
                                                            int iN5 = N(iD4, cw1Var.F());
                                                            strArr[i18] = new String(cw1Var.F(), iD4, iN5 - iD4, StandardCharsets.ISO_8859_1);
                                                            cw1Var.E(iN5 + 1);
                                                            i18++;
                                                            iD3 = iD3;
                                                            iK10 = iK10;
                                                            str6 = str6;
                                                        }
                                                        int i19 = iD3;
                                                        String str7 = str6;
                                                        ArrayList arrayList2 = new ArrayList();
                                                        int i20 = i19 + iH;
                                                        while (cw1Var.D() < i20) {
                                                            bg0 bg0VarC2 = C(i2, cw1Var, z2, null);
                                                            if (bg0VarC2 != null) {
                                                                arrayList2.add(bg0VarC2);
                                                            }
                                                        }
                                                        eg0Var = new wf0(str7, z7, 1 == i17, strArr, (bg0[]) arrayList2.toArray(new bg0[0]));
                                                    } else if (i5 != 77 && iK2 == 76 && iK3 == 76 && iK4 == 84) {
                                                        int iL5 = cw1Var.L();
                                                        int iO3 = cw1Var.O();
                                                        int iO4 = cw1Var.O();
                                                        int iK11 = cw1Var.K();
                                                        int iK12 = cw1Var.K();
                                                        oe0 oe0Var = new oe0();
                                                        oe0Var.b(cw1Var);
                                                        int i21 = ((iH - 10) * 8) / (iK11 + iK12);
                                                        int[] iArr = new int[i21];
                                                        int[] iArr2 = new int[i21];
                                                        for (int i22 = 0; i22 < i21; i22++) {
                                                            int iR = oe0Var.r(iK11);
                                                            int iR2 = oe0Var.r(iK12);
                                                            iArr[i22] = iR;
                                                            iArr2[i22] = iR2;
                                                        }
                                                        eg0Var = new eg0(iL5, iO3, iO4, iArr, iArr2);
                                                    } else {
                                                        String strK3 = K(i2, i5, iK2, iK3, iK4);
                                                        byte[] bArr7 = new byte[iH];
                                                        cw1Var.H(bArr7, 0, iH);
                                                        uf0Var = new uf0(strK3, bArr7);
                                                    }
                                                    uf0Var = eg0Var;
                                                } else if (iH < 4) {
                                                    uf0Var = null;
                                                } else {
                                                    int iK13 = cw1Var.K();
                                                    Charset charsetI2 = I(iK13);
                                                    byte[] bArr8 = new byte[3];
                                                    cw1Var.H(bArr8, 0, 3);
                                                    String str8 = new String(bArr8, 0, 3);
                                                    int i23 = iH - 4;
                                                    byte[] bArr9 = new byte[i23];
                                                    cw1Var.H(bArr9, 0, i23);
                                                    int iL6 = L(bArr9, 0, iK13);
                                                    String str9 = new String(bArr9, 0, iL6, charsetI2);
                                                    int iO5 = iL6 + O(iK13);
                                                    uf0Var = new xf0(str8, str9, P(bArr9, iO5, L(bArr9, iO5, iK13), charsetI2));
                                                }
                                            }
                                        } else if (i5 != 65 && iK2 == 80 && iK3 == 73 && iK4 == 67) {
                                            int iK14 = cw1Var.K();
                                            Charset charsetI3 = I(iK14);
                                            i6 = iH - 1;
                                            bArr = new byte[i6];
                                            cw1Var.H(bArr, 0, i6);
                                            if (i2 == 2) {
                                                iK = iK;
                                                strConcat = "image/".concat(String.valueOf(dq.v(new String(bArr, 0, 3, StandardCharsets.ISO_8859_1))));
                                                if ("image/jpg".equals(strConcat)) {
                                                    strConcat = "image/jpeg";
                                                }
                                                iN = 2;
                                            } else {
                                                iK = iK;
                                                iN = N(0, bArr);
                                                strV = dq.v(new String(bArr, 0, iN, StandardCharsets.ISO_8859_1));
                                                if (strV.indexOf(47) == -1) {
                                                    strConcat = "image/".concat(strV);
                                                } else {
                                                    strConcat = strV;
                                                }
                                            }
                                            int i110 = bArr[iN + 1] & 255;
                                            int i111 = iN + 2;
                                            int iL7 = L(bArr, i111, iK14);
                                            String str10 = new String(bArr, i111, iL7 - i111, charsetI3);
                                            iO = iL7 + O(iK14);
                                            if (i6 <= iO) {
                                                bArrCopyOfRange = qz1.b;
                                            } else {
                                                bArrCopyOfRange = Arrays.copyOfRange(bArr, iO, i6);
                                            }
                                            uf0Var = new tf0(strConcat, str10, i110, bArrCopyOfRange);
                                        } else {
                                            iK = iK;
                                            if (i5 == 67) {
                                                if (i5 != 67) {
                                                    if (i5 != 67) {
                                                        if (i5 != 77) {
                                                        }
                                                        String strK4 = K(i2, i5, iK2, iK3, iK4);
                                                        byte[] bArr10 = new byte[iH];
                                                        cw1Var.H(bArr10, 0, iH);
                                                        uf0Var = new uf0(strK4, bArr10);
                                                    } else {
                                                        if (i5 != 77) {
                                                        }
                                                        String strK5 = K(i2, i5, iK2, iK3, iK4);
                                                        byte[] bArr11 = new byte[iH];
                                                        cw1Var.H(bArr11, 0, iH);
                                                        uf0Var = new uf0(strK5, bArr11);
                                                    }
                                                } else if (i5 != 67) {
                                                    if (i5 != 77) {
                                                    }
                                                    String strK6 = K(i2, i5, iK2, iK3, iK4);
                                                    byte[] bArr12 = new byte[iH];
                                                    cw1Var.H(bArr12, 0, iH);
                                                    uf0Var = new uf0(strK6, bArr12);
                                                } else {
                                                    if (i5 != 77) {
                                                    }
                                                    String strK7 = K(i2, i5, iK2, iK3, iK4);
                                                    byte[] bArr13 = new byte[iH];
                                                    cw1Var.H(bArr13, 0, iH);
                                                    uf0Var = new uf0(strK7, bArr13);
                                                }
                                            } else if (i5 != 67) {
                                                if (i5 != 67) {
                                                    if (i5 != 77) {
                                                    }
                                                    String strK8 = K(i2, i5, iK2, iK3, iK4);
                                                    byte[] bArr14 = new byte[iH];
                                                    cw1Var.H(bArr14, 0, iH);
                                                    uf0Var = new uf0(strK8, bArr14);
                                                } else {
                                                    if (i5 != 77) {
                                                    }
                                                    String strK9 = K(i2, i5, iK2, iK3, iK4);
                                                    byte[] bArr15 = new byte[iH];
                                                    cw1Var.H(bArr15, 0, iH);
                                                    uf0Var = new uf0(strK9, bArr15);
                                                }
                                            } else if (i5 != 67) {
                                                if (i5 != 77) {
                                                }
                                                String strK10 = K(i2, i5, iK2, iK3, iK4);
                                                byte[] bArr16 = new byte[iH];
                                                cw1Var.H(bArr16, 0, iH);
                                                uf0Var = new uf0(strK10, bArr16);
                                            } else {
                                                if (i5 != 77) {
                                                }
                                                String strK11 = K(i2, i5, iK2, iK3, iK4);
                                                byte[] bArr17 = new byte[iH];
                                                cw1Var.H(bArr17, 0, iH);
                                                uf0Var = new uf0(strK11, bArr17);
                                            }
                                        }
                                    } catch (Exception e) {
                                        e = e;
                                        cw1Var.E(iD);
                                        bg0Var = null;
                                    } catch (OutOfMemoryError e2) {
                                        e = e2;
                                        cw1Var.E(iD);
                                        bg0Var = null;
                                    }
                                } else if (iK2 != 69 || iK3 != 79) {
                                    i5 = 71;
                                    if (i2 == 2) {
                                        if (i5 != 80) {
                                        }
                                        iK = iK;
                                        if (i5 == 67) {
                                            if (i5 != 67) {
                                                if (i5 != 67) {
                                                    if (i5 != 77) {
                                                    }
                                                    String strK12 = K(i2, i5, iK2, iK3, iK4);
                                                    byte[] bArr18 = new byte[iH];
                                                    cw1Var.H(bArr18, 0, iH);
                                                    uf0Var = new uf0(strK12, bArr18);
                                                } else {
                                                    if (i5 != 77) {
                                                    }
                                                    String strK13 = K(i2, i5, iK2, iK3, iK4);
                                                    byte[] bArr19 = new byte[iH];
                                                    cw1Var.H(bArr19, 0, iH);
                                                    uf0Var = new uf0(strK13, bArr19);
                                                }
                                            } else if (i5 != 67) {
                                                if (i5 != 77) {
                                                }
                                                String strK14 = K(i2, i5, iK2, iK3, iK4);
                                                byte[] bArr110 = new byte[iH];
                                                cw1Var.H(bArr110, 0, iH);
                                                uf0Var = new uf0(strK14, bArr110);
                                            } else {
                                                if (i5 != 77) {
                                                }
                                                String strK15 = K(i2, i5, iK2, iK3, iK4);
                                                byte[] bArr111 = new byte[iH];
                                                cw1Var.H(bArr111, 0, iH);
                                                uf0Var = new uf0(strK15, bArr111);
                                            }
                                        } else if (i5 != 67) {
                                            if (i5 != 67) {
                                                if (i5 != 77) {
                                                }
                                                String strK16 = K(i2, i5, iK2, iK3, iK4);
                                                byte[] bArr112 = new byte[iH];
                                                cw1Var.H(bArr112, 0, iH);
                                                uf0Var = new uf0(strK16, bArr112);
                                            } else {
                                                if (i5 != 77) {
                                                }
                                                String strK17 = K(i2, i5, iK2, iK3, iK4);
                                                byte[] bArr113 = new byte[iH];
                                                cw1Var.H(bArr113, 0, iH);
                                                uf0Var = new uf0(strK17, bArr113);
                                            }
                                        } else if (i5 != 67) {
                                            if (i5 != 77) {
                                            }
                                            String strK18 = K(i2, i5, iK2, iK3, iK4);
                                            byte[] bArr114 = new byte[iH];
                                            cw1Var.H(bArr114, 0, iH);
                                            uf0Var = new uf0(strK18, bArr114);
                                        } else {
                                            if (i5 != 77) {
                                            }
                                            String strK19 = K(i2, i5, iK2, iK3, iK4);
                                            byte[] bArr115 = new byte[iH];
                                            cw1Var.H(bArr115, 0, iH);
                                            uf0Var = new uf0(strK19, bArr115);
                                        }
                                    } else {
                                        if (i5 != 65) {
                                        }
                                        iK = iK;
                                        if (i5 == 67) {
                                            if (i5 != 67) {
                                                if (i5 != 67) {
                                                    if (i5 != 77) {
                                                    }
                                                    String strK110 = K(i2, i5, iK2, iK3, iK4);
                                                    byte[] bArr116 = new byte[iH];
                                                    cw1Var.H(bArr116, 0, iH);
                                                    uf0Var = new uf0(strK110, bArr116);
                                                } else {
                                                    if (i5 != 77) {
                                                    }
                                                    String strK111 = K(i2, i5, iK2, iK3, iK4);
                                                    byte[] bArr117 = new byte[iH];
                                                    cw1Var.H(bArr117, 0, iH);
                                                    uf0Var = new uf0(strK111, bArr117);
                                                }
                                            } else if (i5 != 67) {
                                                if (i5 != 77) {
                                                }
                                                String strK112 = K(i2, i5, iK2, iK3, iK4);
                                                byte[] bArr118 = new byte[iH];
                                                cw1Var.H(bArr118, 0, iH);
                                                uf0Var = new uf0(strK112, bArr118);
                                            } else {
                                                if (i5 != 77) {
                                                }
                                                String strK113 = K(i2, i5, iK2, iK3, iK4);
                                                byte[] bArr119 = new byte[iH];
                                                cw1Var.H(bArr119, 0, iH);
                                                uf0Var = new uf0(strK113, bArr119);
                                            }
                                        } else if (i5 != 67) {
                                            if (i5 != 67) {
                                                if (i5 != 77) {
                                                }
                                                String strK114 = K(i2, i5, iK2, iK3, iK4);
                                                byte[] bArr1110 = new byte[iH];
                                                cw1Var.H(bArr1110, 0, iH);
                                                uf0Var = new uf0(strK114, bArr1110);
                                            } else {
                                                if (i5 != 77) {
                                                }
                                                String strK115 = K(i2, i5, iK2, iK3, iK4);
                                                byte[] bArr1111 = new byte[iH];
                                                cw1Var.H(bArr1111, 0, iH);
                                                uf0Var = new uf0(strK115, bArr1111);
                                            }
                                        } else if (i5 != 67) {
                                            if (i5 != 77) {
                                            }
                                            String strK116 = K(i2, i5, iK2, iK3, iK4);
                                            byte[] bArr1112 = new byte[iH];
                                            cw1Var.H(bArr1112, 0, iH);
                                            uf0Var = new uf0(strK116, bArr1112);
                                        } else {
                                            if (i5 != 77) {
                                            }
                                            String strK117 = K(i2, i5, iK2, iK3, iK4);
                                            byte[] bArr1113 = new byte[iH];
                                            cw1Var.H(bArr1113, 0, iH);
                                            uf0Var = new uf0(strK117, bArr1113);
                                        }
                                    }
                                } else if (iK4 == 66 || i2 == 2) {
                                    try {
                                        int iK15 = cw1Var.K();
                                        Charset charsetI4 = I(iK15);
                                        int i24 = iH - 1;
                                        byte[] bArr20 = new byte[i24];
                                        cw1Var.H(bArr20, 0, i24);
                                        int iN6 = N(0, bArr20);
                                        str = "Id3Decoder";
                                        String strI = rn0.i(new String(bArr20, 0, iN6, StandardCharsets.ISO_8859_1));
                                        int i25 = iN6 + 1;
                                        int iL8 = L(bArr20, i25, iK15);
                                        String strP = P(bArr20, i25, iL8, charsetI4);
                                        int iO6 = iL8 + O(iK15);
                                        int iL9 = L(bArr20, iO6, iK15);
                                        String strP2 = P(bArr20, iO6, iL9, charsetI4);
                                        int iO7 = iL9 + O(iK15);
                                        iK = iK;
                                        uf0Var = new yf0(strI, strP, strP2, i24 <= iO7 ? qz1.b : Arrays.copyOfRange(bArr20, iO7, i24));
                                    } catch (Exception e3) {
                                        e = e3;
                                        str = "Id3Decoder";
                                        cw1Var.E(iD);
                                        bg0Var = null;
                                    } catch (OutOfMemoryError e4) {
                                        e = e4;
                                        str = "Id3Decoder";
                                        cw1Var.E(iD);
                                        bg0Var = null;
                                    }
                                } else {
                                    i5 = 71;
                                    if (i2 == 2) {
                                        if (i5 != 80) {
                                        }
                                        iK = iK;
                                        if (i5 == 67) {
                                            if (i5 != 67) {
                                                if (i5 != 67) {
                                                    if (i5 != 77) {
                                                    }
                                                    String strK118 = K(i2, i5, iK2, iK3, iK4);
                                                    byte[] bArr1114 = new byte[iH];
                                                    cw1Var.H(bArr1114, 0, iH);
                                                    uf0Var = new uf0(strK118, bArr1114);
                                                } else {
                                                    if (i5 != 77) {
                                                    }
                                                    String strK119 = K(i2, i5, iK2, iK3, iK4);
                                                    byte[] bArr1115 = new byte[iH];
                                                    cw1Var.H(bArr1115, 0, iH);
                                                    uf0Var = new uf0(strK119, bArr1115);
                                                }
                                            } else if (i5 != 67) {
                                                if (i5 != 77) {
                                                }
                                                String strK1110 = K(i2, i5, iK2, iK3, iK4);
                                                byte[] bArr1116 = new byte[iH];
                                                cw1Var.H(bArr1116, 0, iH);
                                                uf0Var = new uf0(strK1110, bArr1116);
                                            } else {
                                                if (i5 != 77) {
                                                }
                                                String strK1111 = K(i2, i5, iK2, iK3, iK4);
                                                byte[] bArr1117 = new byte[iH];
                                                cw1Var.H(bArr1117, 0, iH);
                                                uf0Var = new uf0(strK1111, bArr1117);
                                            }
                                        } else if (i5 != 67) {
                                            if (i5 != 67) {
                                                if (i5 != 77) {
                                                }
                                                String strK1112 = K(i2, i5, iK2, iK3, iK4);
                                                byte[] bArr1118 = new byte[iH];
                                                cw1Var.H(bArr1118, 0, iH);
                                                uf0Var = new uf0(strK1112, bArr1118);
                                            } else {
                                                if (i5 != 77) {
                                                }
                                                String strK1113 = K(i2, i5, iK2, iK3, iK4);
                                                byte[] bArr1119 = new byte[iH];
                                                cw1Var.H(bArr1119, 0, iH);
                                                uf0Var = new uf0(strK1113, bArr1119);
                                            }
                                        } else if (i5 != 67) {
                                            if (i5 != 77) {
                                            }
                                            String strK1114 = K(i2, i5, iK2, iK3, iK4);
                                            byte[] bArr11110 = new byte[iH];
                                            cw1Var.H(bArr11110, 0, iH);
                                            uf0Var = new uf0(strK1114, bArr11110);
                                        } else {
                                            if (i5 != 77) {
                                            }
                                            String strK1115 = K(i2, i5, iK2, iK3, iK4);
                                            byte[] bArr11111 = new byte[iH];
                                            cw1Var.H(bArr11111, 0, iH);
                                            uf0Var = new uf0(strK1115, bArr11111);
                                        }
                                    } else {
                                        if (i5 != 65) {
                                        }
                                        iK = iK;
                                        if (i5 == 67) {
                                            if (i5 != 67) {
                                                if (i5 != 67) {
                                                    if (i5 != 77) {
                                                    }
                                                    String strK1116 = K(i2, i5, iK2, iK3, iK4);
                                                    byte[] bArr11112 = new byte[iH];
                                                    cw1Var.H(bArr11112, 0, iH);
                                                    uf0Var = new uf0(strK1116, bArr11112);
                                                } else {
                                                    if (i5 != 77) {
                                                    }
                                                    String strK1117 = K(i2, i5, iK2, iK3, iK4);
                                                    byte[] bArr11113 = new byte[iH];
                                                    cw1Var.H(bArr11113, 0, iH);
                                                    uf0Var = new uf0(strK1117, bArr11113);
                                                }
                                            } else if (i5 != 67) {
                                                if (i5 != 77) {
                                                }
                                                String strK1118 = K(i2, i5, iK2, iK3, iK4);
                                                byte[] bArr11114 = new byte[iH];
                                                cw1Var.H(bArr11114, 0, iH);
                                                uf0Var = new uf0(strK1118, bArr11114);
                                            } else {
                                                if (i5 != 77) {
                                                }
                                                String strK1119 = K(i2, i5, iK2, iK3, iK4);
                                                byte[] bArr11115 = new byte[iH];
                                                cw1Var.H(bArr11115, 0, iH);
                                                uf0Var = new uf0(strK1119, bArr11115);
                                            }
                                        } else if (i5 != 67) {
                                            if (i5 != 67) {
                                                if (i5 != 77) {
                                                }
                                                String strK11110 = K(i2, i5, iK2, iK3, iK4);
                                                byte[] bArr11116 = new byte[iH];
                                                cw1Var.H(bArr11116, 0, iH);
                                                uf0Var = new uf0(strK11110, bArr11116);
                                            } else {
                                                if (i5 != 77) {
                                                }
                                                String strK11111 = K(i2, i5, iK2, iK3, iK4);
                                                byte[] bArr11117 = new byte[iH];
                                                cw1Var.H(bArr11117, 0, iH);
                                                uf0Var = new uf0(strK11111, bArr11117);
                                            }
                                        } else if (i5 != 67) {
                                            if (i5 != 77) {
                                            }
                                            String strK11112 = K(i2, i5, iK2, iK3, iK4);
                                            byte[] bArr11118 = new byte[iH];
                                            cw1Var.H(bArr11118, 0, iH);
                                            uf0Var = new uf0(strK11112, bArr11118);
                                        } else {
                                            if (i5 != 77) {
                                            }
                                            String strK11113 = K(i2, i5, iK2, iK3, iK4);
                                            byte[] bArr11119 = new byte[iH];
                                            cw1Var.H(bArr11119, 0, iH);
                                            uf0Var = new uf0(strK11113, bArr11119);
                                        }
                                    }
                                }
                            } catch (Exception e5) {
                                e = e5;
                            } catch (OutOfMemoryError e6) {
                                e = e6;
                            }
                        }
                        str = "Id3Decoder";
                    }
                    uf0Var = null;
                    str = "Id3Decoder";
                }
                cw1Var.E(iD);
                bg0Var = uf0Var;
                e = null;
            } catch (Throwable th) {
                cw1Var.E(iD);
                throw th;
            }
        } catch (Exception e7) {
            e = e7;
            str = "Id3Decoder";
            cw1Var.E(iD);
            bg0Var = null;
            if (bg0Var == null) {
                String strK20 = K(i2, iK, iK2, iK3, iK4);
                StringBuilder sb = new StringBuilder(strK20.length() + 39 + String.valueOf(iH).length());
                sb.append("Failed to decode frame: id=");
                sb.append(strK20);
                sb.append(", frameSize=");
                sb.append(iH);
                s90.T(str, sb.toString(), e);
            }
            return bg0Var;
        } catch (OutOfMemoryError e8) {
            e = e8;
            str = "Id3Decoder";
            cw1Var.E(iD);
            bg0Var = null;
            if (bg0Var == null) {
                String strK21 = K(i2, iK, iK2, iK3, iK4);
                StringBuilder sb2 = new StringBuilder(strK21.length() + 39 + String.valueOf(iH).length());
                sb2.append("Failed to decode frame: id=");
                sb2.append(strK21);
                sb2.append(", frameSize=");
                sb2.append(iH);
                s90.T(str, sb2.toString(), e);
            }
            return bg0Var;
        }
        if (bg0Var == null) {
            String strK22 = K(i2, iK, iK2, iK3, iK4);
            StringBuilder sb3 = new StringBuilder(strK22.length() + 39 + String.valueOf(iH).length());
            sb3.append("Failed to decode frame: id=");
            sb3.append(strK22);
            sb3.append(", frameSize=");
            sb3.append(iH);
            s90.T(str, sb3.toString(), e);
        }
        return bg0Var;
    }

    public static final void D(StringBuilder sb, Iterator it, String str) {
        try {
            if (it.hasNext()) {
                Object next = it.next();
                Objects.requireNonNull(next);
                sb.append(next instanceof CharSequence ? (CharSequence) next : next.toString());
                while (it.hasNext()) {
                    sb.append((CharSequence) str);
                    Object next2 = it.next();
                    Objects.requireNonNull(next2);
                    sb.append(next2 instanceof CharSequence ? (CharSequence) next2 : next2.toString());
                }
            }
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    public static qk2 E(byte[] bArr, int i2, int i3) {
        if (i3 >= bArr.length) {
            return vj2.i("");
        }
        tj2 tj2Var = vj2.g;
        w40.k0("initialCapacity", 4);
        Object[] objArrCopyOf = new Object[4];
        int iL = L(bArr, i3, i2);
        int i4 = 0;
        while (i3 < iL) {
            String str = new String(bArr, i3, iL - i3, I(i2));
            int length = objArrCopyOf.length;
            int i5 = i4 + 1;
            int iD = pj2.d(length, i5);
            if (iD > length) {
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, iD);
            }
            objArrCopyOf[i4] = str;
            i3 = O(i2) + iL;
            iL = L(bArr, i3, i2);
            i4 = i5;
        }
        qk2 qk2VarO = vj2.o(objArrCopyOf, i4);
        return qk2VarO.isEmpty() ? vj2.i("") : qk2VarO;
    }

    public static int F(int i2, cw1 cw1Var) {
        byte[] bArr = cw1Var.a;
        int i3 = cw1Var.b;
        int i4 = i3;
        while (true) {
            int i5 = i4 + 1;
            if (i5 >= i3 + i2) {
                return i2;
            }
            if ((bArr[i4] & 255) == 255 && bArr[i5] == 0) {
                System.arraycopy(bArr, i4 + 2, bArr, i5, (i2 - (i4 - i3)) - 2);
                i2--;
            }
            i4 = i5;
        }
    }

    public static void G(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("admob", 0);
        if (sharedPreferences == null) {
            return;
        }
        sharedPreferences.edit().putInt("init_without_write", 0).putInt("crash_without_write", 0).commit();
    }

    public static int H(Context context, String str) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("admob", 0);
        if (sharedPreferences == null) {
            return 0;
        }
        try {
            return sharedPreferences.getInt(str, 0);
        } catch (ClassCastException unused) {
            return 0;
        }
    }

    public static Charset I(int i2) {
        if (i2 == 1) {
            return StandardCharsets.UTF_16;
        }
        if (i2 != 2) {
            return i2 != 3 ? StandardCharsets.ISO_8859_1 : StandardCharsets.UTF_8;
        }
        return StandardCharsets.UTF_16BE;
    }

    public static int J(i52 i52Var) {
        int iN = jn.N(i52Var) - 1;
        return (iN == 0 || iN == 1) ? 7 : 23;
    }

    public static String K(int i2, int i3, int i4, int i5, int i6) {
        return i2 == 2 ? String.format(Locale.US, "%c%c%c", Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)) : String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6));
    }

    public static int L(byte[] bArr, int i2, int i3) {
        int iN = N(i2, bArr);
        if (i3 == 0 || i3 == 3) {
            return iN;
        }
        while (true) {
            int length = bArr.length;
            if (iN >= length - 1) {
                return length;
            }
            int i4 = iN + 1;
            if ((iN - i2) % 2 == 0 && bArr[i4] == 0) {
                return iN;
            }
            iN = N(i4, bArr);
        }
    }

    public static void M(hp hpVar, d72 d72Var, a72 a72Var, boolean z2) {
        if (((Boolean) my0.c.u()).booleanValue()) {
            fn2 fn2VarR = fn2.r(hpVar);
            qk qkVar = new qk();
            qkVar.g = d72Var;
            qkVar.h = a72Var;
            qkVar.f = z2;
            fn2VarR.a(new in2(fn2VarR, 0, qkVar), za1.g);
        }
    }

    public static int N(int i2, byte[] bArr) {
        while (true) {
            int length = bArr.length;
            if (i2 >= length) {
                return length;
            }
            if (bArr[i2] == 0) {
                return i2;
            }
            i2++;
        }
    }

    public static int O(int i2) {
        return (i2 == 0 || i2 == 3) ? 1 : 2;
    }

    public static String P(byte[] bArr, int i2, int i3, Charset charset) {
        return (i3 <= i2 || i3 > bArr.length) ? "" : new String(bArr, i2, i3 - i2, charset);
    }

    public static Object f(Class cls, InvocationHandler invocationHandler) {
        if (invocationHandler == null) {
            return null;
        }
        return cls.cast(Proxy.newProxyInstance(i8.class.getClassLoader(), new Class[]{cls}, invocationHandler));
    }

    public static ui g(Context context) {
        ProviderInfo providerInfo;
        si siVar;
        ApplicationInfo applicationInfo;
        int i2 = 11;
        ig ceVar = Build.VERSION.SDK_INT >= 28 ? new ce(i2) : new ig(i2);
        PackageManager packageManager = context.getPackageManager();
        a23.f(packageManager, "Package manager required to locate emoji font provider");
        Iterator<ResolveInfo> it = packageManager.queryIntentContentProviders(new Intent("androidx.content.action.LOAD_EMOJI_FONT"), 0).iterator();
        while (true) {
            if (!it.hasNext()) {
                providerInfo = null;
                break;
            }
            providerInfo = it.next().providerInfo;
            if (providerInfo != null && (applicationInfo = providerInfo.applicationInfo) != null && (applicationInfo.flags & 1) == 1) {
                break;
            }
        }
        if (providerInfo == null) {
            siVar = null;
        } else {
            try {
                String str = providerInfo.authority;
                String str2 = providerInfo.packageName;
                Signature[] signatureArrB = ceVar.b(packageManager, str2);
                ArrayList arrayList = new ArrayList();
                for (Signature signature : signatureArrB) {
                    arrayList.add(signature.toByteArray());
                }
                siVar = new si(str, str2, "emojicompat-emoji-font", Collections.singletonList(arrayList), null, null);
            } catch (PackageManager.NameNotFoundException e) {
                Log.wtf("emoji2.text.DefaultEmojiConfig", e);
                siVar = null;
            }
        }
        if (siVar == null) {
            return null;
        }
        return new ui(new ti(context, siVar));
    }

    public static int h(Context context, int i2) {
        Integer numValueOf;
        TypedValue typedValueM = a23.m(context, i2);
        if (typedValueM != null) {
            int i3 = typedValueM.resourceId;
            numValueOf = Integer.valueOf(i3 != 0 ? context.getColor(i3) : typedValueM.data);
        } else {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    public static int i(View view, int i2) {
        Context context = view.getContext();
        Context context2 = view.getContext();
        String canonicalName = view.getClass().getCanonicalName();
        TypedValue typedValueM = a23.m(context2, i2);
        if (typedValueM == null) {
            throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", canonicalName, context2.getResources().getResourceName(i2)));
        }
        int i3 = typedValueM.resourceId;
        return i3 != 0 ? context.getColor(i3) : typedValueM.data;
    }

    public static final int j(int i2, int i3, int i4) {
        if (i4 > 0) {
            if (i2 < i3) {
                int i5 = i3 % i4;
                if (i5 < 0) {
                    i5 += i4;
                }
                int i6 = i2 % i4;
                if (i6 < 0) {
                    i6 += i4;
                }
                int i7 = (i5 - i6) % i4;
                if (i7 < 0) {
                    i7 += i4;
                }
                return i3 - i7;
            }
        } else {
            if (i4 >= 0) {
                j7.p("Step is zero.");
                return 0;
            }
            if (i2 > i3) {
                int i8 = -i4;
                int i9 = i2 % i8;
                if (i9 < 0) {
                    i9 += i8;
                }
                int i10 = i3 % i8;
                if (i10 < 0) {
                    i10 += i8;
                }
                int i11 = (i9 - i10) % i8;
                if (i11 < 0) {
                    i11 += i8;
                }
                return i11 + i3;
            }
        }
        return i3;
    }

    public static int m(float f2, int i2, int i3) {
        return fa.b(fa.d(i3, Math.round(Color.alpha(i3) * f2)), i2);
    }

    public static final Object r(Object obj) {
        return obj instanceof ma ? ar.d(((ma) obj).a) : obj;
    }

    public static Context s(Context context, AttributeSet attributeSet, int i2, int i3, int[] iArr) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, m, i2, i3);
        int[] iArr2 = {typedArrayObtainStyledAttributes.getResourceId(0, 0)};
        typedArrayObtainStyledAttributes.recycle();
        int i4 = iArr2[0];
        boolean z2 = (context instanceof xb) && ((xb) context).a == i4;
        if (i4 == 0 || z2) {
            return context;
        }
        xb xbVar = new xb(context, i4);
        int length = iArr.length;
        int[] iArr3 = new int[length];
        if (iArr.length > 0) {
            TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr, i2, i3);
            for (int i5 = 0; i5 < iArr.length; i5++) {
                iArr3[i5] = typedArrayObtainStyledAttributes2.getResourceId(i5, 0);
            }
            typedArrayObtainStyledAttributes2.recycle();
        }
        for (int i6 = 0; i6 < length; i6++) {
            int i7 = iArr3[i6];
            if (i7 != 0) {
                xbVar.getTheme().applyStyle(i7, true);
            }
        }
        TypedArray typedArrayObtainStyledAttributes3 = context.obtainStyledAttributes(attributeSet, l);
        int resourceId = typedArrayObtainStyledAttributes3.getResourceId(0, 0);
        int resourceId2 = typedArrayObtainStyledAttributes3.getResourceId(1, 0);
        typedArrayObtainStyledAttributes3.recycle();
        if (resourceId == 0) {
            resourceId = resourceId2;
        }
        if (resourceId != 0) {
            xbVar.getTheme().applyStyle(resourceId, true);
        }
        return xbVar;
    }

    public static r52 t(String str) throws GeneralSecurityException {
        String str2;
        try {
            try {
                byte[] bArrB = new zn2(new ByteArrayInputStream(str.getBytes(zn2.b))).a().b();
                try {
                    v13 v13Var = v13.a;
                    int i2 = h13.a;
                    lw2 lw2VarD = lw2.D(bArrB, v13.b);
                    for (kw2 kw2Var : lw2VarD.A()) {
                        if (kw2Var.A().B() == 1 || kw2Var.A().B() == 2 || kw2Var.A().B() == 3) {
                            switch (kw2Var.A().B()) {
                                case 1:
                                    str2 = "UNKNOWN_KEYMATERIAL";
                                    break;
                                case 2:
                                    str2 = "SYMMETRIC";
                                    break;
                                case 3:
                                    str2 = "ASYMMETRIC_PRIVATE";
                                    break;
                                case 4:
                                    str2 = "ASYMMETRIC_PUBLIC";
                                    break;
                                case 5:
                                    str2 = "REMOTE";
                                    break;
                                case 6:
                                    str2 = "UNRECOGNIZED";
                                    break;
                                default:
                                    throw null;
                            }
                            throw new GeneralSecurityException("keyset contains key material of type " + str2 + " for type url " + kw2Var.A().z());
                        }
                    }
                    return r52.z(lw2VarD);
                } catch (o23 unused) {
                    throw new GeneralSecurityException("invalid keyset");
                }
            } catch (o23 unused2) {
                throw new GeneralSecurityException("invalid keyset");
            }
        } catch (IOException unused3) {
            j7.r("Parse keyset failed");
            return null;
        }
    }

    public static void u(Context context) {
        boolean z2;
        Object obj = o83.b;
        if (((Boolean) oy0.a.u()).booleanValue()) {
            try {
                if (Settings.Global.getInt(context.getContentResolver(), "development_settings_enabled", 0) != 0) {
                    synchronized (o83.b) {
                        z2 = o83.c;
                    }
                    if (z2) {
                        return;
                    }
                    hp hpVarO1 = new s91(context).o1();
                    jn.R("Updating ad debug logging enablement.");
                    ej1.s(hpVarO1, "AdDebugLogUpdater.updateEnablement");
                }
            } catch (Exception e) {
                jn.V("Fail to determine debug setting.", e);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0038 A[Catch: all -> 0x000f, TryCatch #2 {all -> 0x000f, blocks: (B:4:0x0003, B:6:0x0007, B:9:0x0011, B:11:0x0015, B:12:0x0017, B:16:0x001d, B:19:0x0027, B:20:0x002b, B:27:0x0034, B:32:0x0045, B:30:0x0037, B:31:0x0038, B:21:0x002c, B:22:0x002e, B:13:0x0018, B:14:0x001a), top: B:40:0x0003, inners: #0, #1 }] */
    public static void v(Context context, boolean z2) {
        boolean z3;
        boolean z4;
        synchronized (z) {
            try {
                if (y == null) {
                    y = new fe3(context);
                }
                ve3 ve3Var = x;
                if (ve3Var != null) {
                    synchronized (ve3Var.a) {
                        z3 = ve3Var.c;
                    }
                    if (z3 && !x.c()) {
                        fe3 fe3Var = y;
                        dq.g(fe3Var, "the appSetIdClient shouldn't be null");
                        x = fe3Var.e();
                    } else if (z2) {
                        ve3 ve3Var2 = x;
                        synchronized (ve3Var2.a) {
                            z4 = ve3Var2.c;
                        }
                        if (z4) {
                            fe3 fe3Var2 = y;
                            dq.g(fe3Var2, "the appSetIdClient shouldn't be null");
                            x = fe3Var2.e();
                        }
                    }
                } else {
                    fe3 fe3Var3 = y;
                    dq.g(fe3Var3, "the appSetIdClient shouldn't be null");
                    x = fe3Var3.e();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void w(File file, byte[] bArr) throws IOException {
        file.getClass();
        int i2 = bk2.h;
        wk2 wk2Var = wk2.o;
        bArr.getClass();
        FileOutputStream fileOutputStream = new FileOutputStream(file, wk2Var.contains(ml2.f));
        try {
            fileOutputStream.write(bArr);
            fileOutputStream.close();
        } catch (Throwable th) {
            try {
                fileOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static boolean x(Bundle bundle, Bundle bundle2) {
        if (bundle != null && bundle2 != null) {
            if (bundle.size() != bundle2.size()) {
                return false;
            }
            for (String str : bundle.keySet()) {
                if (!bundle2.containsKey(str)) {
                    return false;
                }
                Object obj = bundle.get(str);
                Object obj2 = bundle2.get(str);
                if (obj == null || obj2 == null) {
                    bundle2 = obj2;
                    bundle = obj;
                } else if (obj instanceof Bundle) {
                    if (!(obj2 instanceof Bundle) || !x((Bundle) obj, (Bundle) obj2)) {
                        return false;
                    }
                } else if (obj.getClass().isArray()) {
                    int length = Array.getLength(obj);
                    if (!obj2.getClass().isArray() || length != Array.getLength(obj2)) {
                        return false;
                    }
                    for (int i2 = 0; i2 < length; i2++) {
                        if (!s90.d(Array.get(obj, i2), Array.get(obj2, i2))) {
                            return false;
                        }
                    }
                } else if (!obj.equals(obj2)) {
                    return false;
                }
            }
            return true;
        }
        return bundle == null && bundle2 == null;
    }

    public static String y(d03 d03Var) throws GeneralSecurityException {
        int iOrdinal = d03Var.ordinal();
        if (iOrdinal == 0) {
            return "SHA-1";
        }
        if (iOrdinal == 1) {
            return "SHA-224";
        }
        if (iOrdinal == 2) {
            return "SHA-256";
        }
        if (iOrdinal == 3) {
            return "SHA-384";
        }
        if (iOrdinal == 4) {
            return "SHA-512";
        }
        throw new GeneralSecurityException("Unsupported hash ".concat(d03Var.toString()));
    }

    public static void z(hp hpVar, a72 a72Var) {
        if (((Boolean) my0.c.u()).booleanValue()) {
            fn2 fn2VarR = fn2.r(hpVar);
            gv1 gv1Var = new gv1(6, a72Var);
            fn2VarR.a(new in2(fn2VarR, 0, gv1Var), za1.g);
        }
    }

    public abstract j90 k(String str);

    public abstract void n(np npVar);

    public abstract void o(Object obj);

    public abstract View p(int i2);

    public abstract boolean q();
}
