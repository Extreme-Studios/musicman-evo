package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.util.JsonReader;
import android.util.JsonToken;
import android.util.JsonWriter;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EdgeEffect;
import android.widget.LinearLayout;
import android.widget.TableRow;
import android.widget.TextView;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.StringWriter;
import java.lang.reflect.Array;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public abstract class w40 implements qd0 {
    public static final Object[] f = new Object[0];
    public static final byte[] g = {112, 114, 111, 0};
    public static final byte[] h = {112, 114, 109, 0};
    public static final int[] i = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};
    public static final int[] j = {-1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1};
    public static final int[] k = {64, 112, 128, 192, 224, 256, 384, 448, 512, 640, 768, 896, 1024, 1152, 1280, 1536, 1920, 2048, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, 7680};
    public static final int[] l = {8000, 16000, 32000, 64000, 128000, 22050, 44100, 88200, 176400, 352800, 12000, 24000, 48000, 96000, 192000, 384000};
    public static final int[] m = {5, 8, 10, 12};
    public static final int[] n = {6, 9, 12, 15};
    public static final int[] o = {2, 4, 6, 8};
    public static final int[] p = {9, 11, 13, 16};
    public static final int[] q = {5, 8, 10, 12};
    public static final tt0 r = new tt0(13);
    public static final xn1 s = new xn1(9);
    public static final xn1 t = new xn1(21);
    public static final l32 u = new l32(10);
    public static final dr2 v = new dr2(new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0});
    public static final un1 w = new un1(new r52(new long[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}, 28, false), 22, new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0});
    public static final byte[] x = {-19, -45, -11, 92, 26, 99, 18, 88, -42, -100, -9, -94, -34, -7, -34, 20, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 16};
    public static final /* synthetic */ int y = 0;

    public w40() {
        new ConcurrentHashMap();
    }

    public static boolean A(Parcel parcel, int i2) {
        j0(parcel, i2, 4);
        return parcel.readInt() != 0;
    }

    public static int A0(byte[] bArr, int i2, i13 i13Var) throws o23 {
        int iW = W(bArr, i2, i13Var);
        int i3 = i13Var.a;
        if (i3 < 0) {
            j7.s("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            return 0;
        }
        if (i3 > bArr.length - iW) {
            j7.s("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            return 0;
        }
        if (i3 == 0) {
            i13Var.c = n13.g;
            return iW;
        }
        i13Var.c = n13.n(bArr, iW, i3);
        return iW + i3;
    }

    public static int[] B(ByteArrayInputStream byteArrayInputStream, int i2) {
        int[] iArr = new int[i2];
        int iN = 0;
        for (int i3 = 0; i3 < i2; i3++) {
            iN += (int) v51.n(byteArrayInputStream, 2);
            iArr[i3] = iN;
        }
        return iArr;
    }

    public static List B0(int... iArr) {
        int length = iArr.length;
        return length == 0 ? Collections.EMPTY_LIST : new tl2(0, length, iArr);
    }

    public static IBinder C(Parcel parcel, int i2) {
        int iJ = J(parcel, i2);
        int iDataPosition = parcel.dataPosition();
        if (iJ == 0) {
            return null;
        }
        IBinder strongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(iDataPosition + iJ);
        return strongBinder;
    }

    public static void C0(JsonWriter jsonWriter, JSONArray jSONArray) throws IOException {
        try {
            jsonWriter.beginArray();
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                Object obj = jSONArray.get(i2);
                if (obj instanceof String) {
                    jsonWriter.value((String) obj);
                } else if (obj instanceof Number) {
                    jsonWriter.value((Number) obj);
                } else if (obj instanceof Boolean) {
                    jsonWriter.value(((Boolean) obj).booleanValue());
                } else if (obj instanceof JSONObject) {
                    x0(jsonWriter, (JSONObject) obj);
                } else {
                    if (!(obj instanceof JSONArray)) {
                        String strValueOf = String.valueOf(obj);
                        StringBuilder sb = new StringBuilder(strValueOf.length() + 23);
                        sb.append("unable to write field: ");
                        sb.append(strValueOf);
                        throw new JSONException(sb.toString());
                    }
                    C0(jsonWriter, (JSONArray) obj);
                }
            }
            jsonWriter.endArray();
        } catch (JSONException e) {
            throw new IOException(e);
        }
    }

    public static int D(Parcel parcel, int i2) {
        j0(parcel, i2, 4);
        return parcel.readInt();
    }

    public static void D0(un1 un1Var, vg2 vg2Var, dr2 dr2Var) {
        r52 r52Var = (r52) vg2Var.g;
        r52 r52Var2 = (r52) un1Var.g;
        long[] jArr = new long[10];
        long[] jArr2 = (long[]) r52Var2.g;
        long[] jArr3 = (long[]) r52Var.h;
        long[] jArr4 = (long[]) r52Var.g;
        s90.F(jArr2, jArr3, jArr4);
        long[] jArr5 = (long[]) r52Var2.h;
        s90.M(jArr5, jArr3, jArr4);
        s90.Z(jArr5, jArr5, dr2Var.b);
        long[] jArr6 = dr2Var.a;
        long[] jArr7 = (long[]) r52Var2.i;
        s90.Z(jArr7, jArr2, jArr6);
        long[] jArr8 = (long[]) un1Var.h;
        s90.Z(jArr8, (long[]) vg2Var.h, dr2Var.c);
        dr2Var.a(jArr2, (long[]) r52Var.i);
        s90.F(jArr, jArr2, jArr2);
        s90.M(jArr2, jArr7, jArr5);
        s90.F(jArr5, jArr7, jArr5);
        s90.F(jArr7, jArr, jArr8);
        s90.M(jArr8, jArr, jArr8);
    }

    public static long E(Parcel parcel, int i2) {
        j0(parcel, i2, 8);
        return parcel.readLong();
    }

    public static int E0(oe0 oe0Var, int[] iArr) {
        int i2 = 0;
        for (int i3 = 0; i3 < 3 && oe0Var.q(); i3++) {
            i2++;
        }
        int i4 = 0;
        for (int i5 = 0; i5 < i2; i5++) {
            i4 += 1 << iArr[i5];
        }
        return oe0Var.r(iArr[i2]) + i4;
    }

    public static ye[] F(FileInputStream fileInputStream, byte[] bArr, byte[] bArr2, ye[] yeVarArr) throws IOException {
        byte[] bArr3 = s90.g;
        if (!Arrays.equals(bArr, bArr3)) {
            if (!Arrays.equals(bArr, s90.h)) {
                j7.e("Unsupported meta version");
                return null;
            }
            int iN = (int) v51.n(fileInputStream, 2);
            byte[] bArrM = v51.m(fileInputStream, (int) v51.n(fileInputStream, 4), (int) v51.n(fileInputStream, 4));
            if (fileInputStream.read() > 0) {
                j7.e("Content found after the end of file");
                return null;
            }
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrM);
            try {
                ye[] yeVarArrH = H(byteArrayInputStream, bArr2, iN, yeVarArr);
                byteArrayInputStream.close();
                return yeVarArrH;
            } catch (Throwable th) {
                try {
                    byteArrayInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (Arrays.equals(s90.b, bArr2)) {
            j7.e("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
            return null;
        }
        if (!Arrays.equals(bArr, bArr3)) {
            j7.e("Unsupported meta version");
            return null;
        }
        int iN2 = (int) v51.n(fileInputStream, 1);
        byte[] bArrM2 = v51.m(fileInputStream, (int) v51.n(fileInputStream, 4), (int) v51.n(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            j7.e("Content found after the end of file");
            return null;
        }
        ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(bArrM2);
        try {
            ye[] yeVarArrG = G(byteArrayInputStream2, iN2, yeVarArr);
            byteArrayInputStream2.close();
            return yeVarArrG;
        } catch (Throwable th3) {
            try {
                byteArrayInputStream2.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:4:0x000a  */
    public static Integer F0(String str) {
        byte b;
        Long lValueOf;
        byte b2;
        str.getClass();
        if (!str.isEmpty()) {
            char cCharAt = str.charAt(0);
            int i2 = cCharAt == '-' ? 1 : 0;
            if (i2 != str.length()) {
                int i3 = i2 + 1;
                char cCharAt2 = str.charAt(i2);
                if (cCharAt2 < 128) {
                    b = ul2.a[cCharAt2];
                } else {
                    byte[] bArr = ul2.a;
                    b = -1;
                }
                if (b >= 0 && b < 10) {
                    long j2 = -b;
                    while (true) {
                        if (i3 >= str.length()) {
                            if (cCharAt != '-') {
                                if (j2 != Long.MIN_VALUE) {
                                    lValueOf = Long.valueOf(-j2);
                                    break;
                                }
                                break;
                            }
                            lValueOf = Long.valueOf(j2);
                            break;
                        }
                        int i4 = i3 + 1;
                        char cCharAt3 = str.charAt(i3);
                        if (cCharAt3 < 128) {
                            b2 = ul2.a[cCharAt3];
                        } else {
                            byte[] bArr2 = ul2.a;
                            b2 = -1;
                        }
                        if (b2 >= 0 && b2 < 10 && j2 >= -922337203685477580L) {
                            long j3 = j2 * 10;
                            long j4 = b2;
                            if (j3 >= Long.MIN_VALUE + j4) {
                                j2 = j3 - j4;
                                i3 = i4;
                            }
                        }
                        lValueOf = null;
                        break;
                    }
                }
                lValueOf = null;
                break;
            }
            lValueOf = null;
            break;
        }
        lValueOf = null;
        break;
        if (lValueOf == null || lValueOf.longValue() != lValueOf.intValue()) {
            return null;
        }
        return Integer.valueOf(lValueOf.intValue());
    }

    public static ye[] G(ByteArrayInputStream byteArrayInputStream, int i2, ye[] yeVarArr) {
        if (byteArrayInputStream.available() == 0) {
            return new ye[0];
        }
        if (i2 != yeVarArr.length) {
            j7.e("Mismatched number of dex files found in metadata");
            return null;
        }
        String[] strArr = new String[i2];
        int[] iArr = new int[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            int iN = (int) v51.n(byteArrayInputStream, 2);
            iArr[i3] = (int) v51.n(byteArrayInputStream, 2);
            strArr[i3] = new String(v51.k(byteArrayInputStream, iN), StandardCharsets.UTF_8);
        }
        for (int i4 = 0; i4 < i2; i4++) {
            ye yeVar = yeVarArr[i4];
            if (!yeVar.b.equals(strArr[i4])) {
                j7.e("Order of dexfiles in metadata did not match baseline");
                return null;
            }
            int i5 = iArr[i4];
            yeVar.e = i5;
            yeVar.h = B(byteArrayInputStream, i5);
        }
        return yeVarArr;
    }

    public static JSONObject G0(String str, JSONObject jSONObject) throws JSONException {
        try {
            return jSONObject.getJSONObject(str);
        } catch (JSONException unused) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject.put(str, jSONObject2);
            return jSONObject2;
        }
    }

    public static ye[] H(ByteArrayInputStream byteArrayInputStream, byte[] bArr, int i2, ye[] yeVarArr) {
        ye yeVar;
        if (byteArrayInputStream.available() == 0) {
            return new ye[0];
        }
        if (i2 != yeVarArr.length) {
            j7.e("Mismatched number of dex files found in metadata");
            return null;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            v51.n(byteArrayInputStream, 2);
            String str = new String(v51.k(byteArrayInputStream, (int) v51.n(byteArrayInputStream, 2)), StandardCharsets.UTF_8);
            long jN = v51.n(byteArrayInputStream, 4);
            int iN = (int) v51.n(byteArrayInputStream, 2);
            if (yeVarArr.length <= 0) {
                yeVar = null;
                break;
            }
            int iIndexOf = str.indexOf("!");
            if (iIndexOf < 0) {
                iIndexOf = str.indexOf(":");
            }
            String strSubstring = iIndexOf > 0 ? str.substring(iIndexOf + 1) : str;
            int i4 = 0;
            while (true) {
                if (i4 >= yeVarArr.length) {
                    yeVar = null;
                    break;
                }
                if (yeVarArr[i4].b.equals(strSubstring)) {
                    yeVar = yeVarArr[i4];
                    break;
                }
                i4++;
            }
            if (yeVar == null) {
                j7.e("Missing profile key: ".concat(str));
                return null;
            }
            yeVar.d = jN;
            int[] iArrB = B(byteArrayInputStream, iN);
            if (Arrays.equals(bArr, s90.f)) {
                yeVar.e = iN;
                yeVar.h = iArrB;
            }
        }
        return yeVarArr;
    }

    public static void H0(un1 un1Var, vg2 vg2Var, dr2 dr2Var) {
        r52 r52Var = (r52) vg2Var.g;
        r52 r52Var2 = (r52) un1Var.g;
        long[] jArr = new long[10];
        long[] jArr2 = (long[]) r52Var2.g;
        long[] jArr3 = (long[]) r52Var.h;
        long[] jArr4 = (long[]) r52Var.g;
        s90.F(jArr2, jArr3, jArr4);
        long[] jArr5 = (long[]) r52Var2.h;
        s90.M(jArr5, jArr3, jArr4);
        s90.Z(jArr5, jArr5, dr2Var.a);
        long[] jArr6 = dr2Var.b;
        long[] jArr7 = (long[]) r52Var2.i;
        s90.Z(jArr7, jArr2, jArr6);
        long[] jArr8 = (long[]) un1Var.h;
        s90.Z(jArr8, (long[]) vg2Var.h, dr2Var.c);
        dr2Var.a(jArr2, (long[]) r52Var.i);
        s90.F(jArr, jArr2, jArr2);
        s90.M(jArr2, jArr7, jArr5);
        s90.F(jArr5, jArr7, jArr5);
        s90.M(jArr7, jArr, jArr8);
        s90.F(jArr8, jArr, jArr8);
    }

    public static ye[] I(FileInputStream fileInputStream, byte[] bArr, String str) throws IOException {
        if (!Arrays.equals(bArr, s90.c)) {
            j7.e("Unsupported version");
            return null;
        }
        int iN = (int) v51.n(fileInputStream, 1);
        byte[] bArrM = v51.m(fileInputStream, (int) v51.n(fileInputStream, 4), (int) v51.n(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            j7.e("Content found after the end of file");
            return null;
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrM);
        try {
            ye[] yeVarArrK = K(byteArrayInputStream, str, iN);
            byteArrayInputStream.close();
            return yeVarArrK;
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static oe0 I0(byte[] bArr) {
        byte[] bArr2;
        byte b = bArr[0];
        if (b == 127 || b == 100 || b == 64 || b == 113) {
            return new oe0(bArr.length, bArr);
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        byte b2 = bArrCopyOf[0];
        if (b2 == -2 || b2 == -1 || b2 == 37 || b2 == -14 || b2 == -24) {
            for (int i2 = 0; i2 < bArrCopyOf.length - 1; i2 += 2) {
                byte b3 = bArrCopyOf[i2];
                int i3 = i2 + 1;
                bArrCopyOf[i2] = bArrCopyOf[i3];
                bArrCopyOf[i3] = b3;
            }
        }
        int length = bArrCopyOf.length;
        oe0 oe0Var = new oe0(length, bArrCopyOf);
        if (bArrCopyOf[0] == 31) {
            oe0 oe0Var2 = new oe0(length, bArrCopyOf);
            while (oe0Var2.f() >= 16) {
                oe0Var2.o(2);
                int iR = oe0Var2.r(14);
                int iMin = Math.min(8 - oe0Var.c, 14);
                int i4 = oe0Var.c;
                int i5 = (8 - i4) - iMin;
                byte[] bArr3 = oe0Var.a;
                int i6 = oe0Var.b;
                byte b4 = (byte) (((65280 >> i4) | ((1 << i5) - 1)) & bArr3[i6]);
                bArr3[i6] = b4;
                int i7 = 14 - iMin;
                int i8 = iR & 16383;
                bArr3[i6] = (byte) (b4 | ((i8 >>> i7) << i5));
                int i9 = i6 + 1;
                while (true) {
                    bArr2 = oe0Var.a;
                    if (i7 > 8) {
                        i7 -= 8;
                        bArr2[i9] = (byte) (i8 >>> i7);
                        i9++;
                    }
                }
                int i10 = 8 - i7;
                byte b5 = (byte) (bArr2[i9] & ((1 << i10) - 1));
                bArr2[i9] = b5;
                bArr2[i9] = (byte) (((i8 & ((1 << i7) - 1)) << i10) | b5);
                oe0Var.o(14);
                oe0Var.y();
            }
        }
        int length2 = bArrCopyOf.length;
        oe0Var.a = bArrCopyOf;
        oe0Var.b = 0;
        oe0Var.c = 0;
        oe0Var.d = length2;
        return oe0Var;
    }

    public static int J(Parcel parcel, int i2) {
        return (i2 & (-65536)) != -65536 ? (char) (i2 >> 16) : parcel.readInt();
    }

    public static void J0(un1 un1Var, r52 r52Var) {
        r52 r52Var2 = (r52) un1Var.g;
        long[] jArr = (long[]) r52Var2.g;
        long[] jArr2 = (long[]) r52Var.g;
        long[] jArr3 = new long[10];
        s90.c0(jArr, jArr2);
        long[] jArr4 = (long[]) r52Var2.i;
        long[] jArr5 = (long[]) r52Var.h;
        s90.c0(jArr4, jArr5);
        long[] jArr6 = (long[]) un1Var.h;
        s90.c0(jArr6, (long[]) r52Var.i);
        s90.F(jArr6, jArr6, jArr6);
        long[] jArr7 = (long[]) r52Var2.h;
        s90.F(jArr7, jArr2, jArr5);
        s90.c0(jArr3, jArr7);
        s90.F(jArr7, jArr4, jArr);
        s90.M(jArr4, jArr4, jArr);
        s90.M(jArr, jArr3, jArr7);
        s90.M(jArr6, jArr6, jArr4);
    }

    public static ye[] K(ByteArrayInputStream byteArrayInputStream, String str, int i2) throws IOException {
        int i3 = 0;
        if (byteArrayInputStream.available() == 0) {
            return new ye[0];
        }
        ye[] yeVarArr = new ye[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            int iN = (int) v51.n(byteArrayInputStream, 2);
            int iN2 = (int) v51.n(byteArrayInputStream, 2);
            yeVarArr[i4] = new ye(str, new String(v51.k(byteArrayInputStream, iN), StandardCharsets.UTF_8), v51.n(byteArrayInputStream, 4), iN2, (int) v51.n(byteArrayInputStream, 4), (int) v51.n(byteArrayInputStream, 4), new int[iN2], new TreeMap());
        }
        int i5 = 0;
        while (i5 < i2) {
            ye yeVar = yeVarArr[i5];
            int iAvailable = byteArrayInputStream.available();
            int i6 = yeVar.f;
            int i7 = yeVar.g;
            TreeMap treeMap = yeVar.i;
            int i8 = iAvailable - i6;
            int iN3 = i3;
            while (byteArrayInputStream.available() > i8) {
                iN3 += (int) v51.n(byteArrayInputStream, 2);
                treeMap.put(Integer.valueOf(iN3), 1);
                int iN4 = (int) v51.n(byteArrayInputStream, 2);
                while (iN4 > 0) {
                    v51.n(byteArrayInputStream, 2);
                    int iN5 = (int) v51.n(byteArrayInputStream, 1);
                    if (iN5 != 6 && iN5 != 7) {
                        while (iN5 > 0) {
                            v51.n(byteArrayInputStream, 1);
                            int i9 = i3;
                            int i10 = i5;
                            for (int iN6 = (int) v51.n(byteArrayInputStream, 1); iN6 > 0; iN6--) {
                                v51.n(byteArrayInputStream, 2);
                            }
                            iN5--;
                            i3 = i9;
                            i5 = i10;
                        }
                    }
                    iN4--;
                    i3 = i3;
                    i5 = i5;
                }
            }
            int i11 = i3;
            int i12 = i5;
            if (byteArrayInputStream.available() != i8) {
                j7.e("Read too much data during profile line parse");
                return null;
            }
            yeVar.h = B(byteArrayInputStream, yeVar.e);
            BitSet bitSetValueOf = BitSet.valueOf(v51.k(byteArrayInputStream, (((i7 * 2) + 7) & (-8)) / 8));
            for (int i13 = i11; i13 < i7; i13++) {
                int i14 = bitSetValueOf.get(i13) ? 2 : i11;
                if (bitSetValueOf.get(i13 + i7)) {
                    i14 |= 4;
                }
                if (i14 != 0) {
                    Integer numValueOf = (Integer) treeMap.get(Integer.valueOf(i13));
                    if (numValueOf == null) {
                        numValueOf = Integer.valueOf(i11);
                    }
                    treeMap.put(Integer.valueOf(i13), Integer.valueOf(i14 | numValueOf.intValue()));
                }
            }
            i5 = i12 + 1;
            i3 = i11;
        }
        return yeVarArr;
    }

    public static int K0(int i2, int i3) {
        int i4 = (~(i2 ^ i3)) & 255;
        int i5 = i4 & (i4 << 4);
        int i6 = i5 & (i5 << 2);
        return (i6 & (i6 + i6)) >> 7;
    }

    public static void L(Parcel parcel, int i2) {
        parcel.setDataPosition(parcel.dataPosition() + J(parcel, i2));
    }

    public static int L0(Object obj, j33 j33Var, byte[] bArr, int i2, int i3, i13 i13Var) throws o23 {
        int iE0 = i2 + 1;
        int i4 = bArr[i2];
        if (i4 < 0) {
            iE0 = e0(i4, bArr, iE0, i13Var);
            i4 = i13Var.a;
        }
        int i5 = iE0;
        if (i4 < 0 || i4 > i3 - i5) {
            j7.s("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            return 0;
        }
        int i6 = i13Var.d + 1;
        i13Var.d = i6;
        if (i6 >= 100) {
            j7.s("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
            return 0;
        }
        int i7 = i5 + i4;
        j33Var.i(obj, bArr, i5, i7, i13Var);
        i13Var.d--;
        i13Var.c = obj;
        return i7;
    }

    public static final Object[] M(Collection collection) {
        int size = collection.size();
        if (size != 0) {
            Iterator it = collection.iterator();
            if (it.hasNext()) {
                Object[] objArrCopyOf = new Object[size];
                int i2 = 0;
                while (true) {
                    int i3 = i2 + 1;
                    objArrCopyOf[i2] = it.next();
                    if (i3 >= objArrCopyOf.length) {
                        if (!it.hasNext()) {
                            return objArrCopyOf;
                        }
                        int i4 = ((i3 * 3) + 1) >>> 1;
                        if (i4 <= i3) {
                            i4 = 2147483645;
                            if (i3 >= 2147483645) {
                                throw new OutOfMemoryError();
                            }
                        }
                        objArrCopyOf = Arrays.copyOf(objArrCopyOf, i4);
                    } else if (!it.hasNext()) {
                        return Arrays.copyOf(objArrCopyOf, i3);
                    }
                    i2 = i3;
                }
            }
        }
        return f;
    }

    public static int M0(Object obj, j33 j33Var, byte[] bArr, int i2, int i3, int i4, i13 i13Var) throws o23 {
        y23 y23Var = (y23) j33Var;
        int i5 = i13Var.d + 1;
        i13Var.d = i5;
        if (i5 >= 100) {
            j7.s("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
            return 0;
        }
        int iY = y23Var.y(obj, bArr, i2, i3, i4, i13Var);
        i13Var.d--;
        i13Var.c = obj;
        return iY;
    }

    public static final Object[] N(Collection collection, Object[] objArr) {
        Object[] objArrCopyOf;
        int size = collection.size();
        int i2 = 0;
        if (size != 0) {
            Iterator it = collection.iterator();
            if (it.hasNext()) {
                if (size <= objArr.length) {
                    objArrCopyOf = objArr;
                } else {
                    Object objNewInstance = Array.newInstance(objArr.getClass().getComponentType(), size);
                    objNewInstance.getClass();
                    objArrCopyOf = (Object[]) objNewInstance;
                }
                while (true) {
                    int i3 = i2 + 1;
                    objArrCopyOf[i2] = it.next();
                    if (i3 >= objArrCopyOf.length) {
                        if (!it.hasNext()) {
                            return objArrCopyOf;
                        }
                        int i4 = ((i3 * 3) + 1) >>> 1;
                        if (i4 <= i3) {
                            i4 = 2147483645;
                            if (i3 >= 2147483645) {
                                throw new OutOfMemoryError();
                            }
                        }
                        objArrCopyOf = Arrays.copyOf(objArrCopyOf, i4);
                    } else if (!it.hasNext()) {
                        if (objArrCopyOf != objArr) {
                            return Arrays.copyOf(objArrCopyOf, i3);
                        }
                        objArr[i3] = null;
                        return objArr;
                    }
                    i2 = i3;
                }
            } else if (objArr.length > 0) {
                objArr[0] = null;
            }
        } else if (objArr.length > 0) {
            objArr[0] = null;
            return objArr;
        }
        return objArr;
    }

    public static void N0(dr2 dr2Var, int i2, byte b) {
        dr2[][] dr2VarArr = fr2.d;
        int i3 = (b & 255) >> 7;
        int i4 = (-i3) & b;
        int i5 = b - (i4 + i4);
        dr2Var.b(dr2VarArr[i2][0], K0(i5, 1));
        dr2Var.b(dr2VarArr[i2][1], K0(i5, 2));
        dr2Var.b(dr2VarArr[i2][2], K0(i5, 3));
        dr2Var.b(dr2VarArr[i2][3], K0(i5, 4));
        dr2Var.b(dr2VarArr[i2][4], K0(i5, 5));
        dr2Var.b(dr2VarArr[i2][5], K0(i5, 6));
        dr2Var.b(dr2VarArr[i2][6], K0(i5, 7));
        dr2Var.b(dr2VarArr[i2][7], K0(i5, 8));
        long[] jArr = dr2Var.c;
        long[] jArr2 = dr2Var.a;
        long[] jArr3 = dr2Var.b;
        long[] jArrCopyOf = Arrays.copyOf(jArr3, 10);
        long[] jArrCopyOf2 = Arrays.copyOf(jArr2, 10);
        long[] jArrCopyOf3 = Arrays.copyOf(jArr, 10);
        for (int i6 = 0; i6 < jArrCopyOf3.length; i6++) {
            jArrCopyOf3[i6] = -jArrCopyOf3[i6];
        }
        s90.E(jArr2, jArrCopyOf, i3);
        s90.E(jArr3, jArrCopyOf2, i3);
        s90.E(jArr, jArrCopyOf3, i3);
    }

    public static boolean O(ByteArrayOutputStream byteArrayOutputStream, byte[] bArr, ye[] yeVarArr) throws IOException {
        int i2;
        long j2;
        int length;
        byte[] bArr2 = s90.f;
        byte[] bArr3 = s90.e;
        byte[] bArr4 = s90.b;
        int i3 = 0;
        if (!Arrays.equals(bArr, bArr4)) {
            byte[] bArr5 = s90.c;
            if (Arrays.equals(bArr, bArr5)) {
                byte[] bArrE = e(yeVarArr, bArr5);
                v51.p(byteArrayOutputStream, yeVarArr.length, 1);
                v51.p(byteArrayOutputStream, bArrE.length, 4);
                byte[] bArrD = v51.d(bArrE);
                v51.p(byteArrayOutputStream, bArrD.length, 4);
                byteArrayOutputStream.write(bArrD);
                return true;
            }
            if (Arrays.equals(bArr, bArr3)) {
                v51.p(byteArrayOutputStream, yeVarArr.length, 1);
                for (ye yeVar : yeVarArr) {
                    int size = yeVar.i.size() * 4;
                    String strR = r(bArr3, yeVar.a, yeVar.b);
                    Charset charset = StandardCharsets.UTF_8;
                    v51.q(byteArrayOutputStream, strR.getBytes(charset).length);
                    v51.q(byteArrayOutputStream, yeVar.h.length);
                    v51.p(byteArrayOutputStream, size, 4);
                    v51.p(byteArrayOutputStream, yeVar.c, 4);
                    byteArrayOutputStream.write(strR.getBytes(charset));
                    Iterator it = yeVar.i.keySet().iterator();
                    while (it.hasNext()) {
                        v51.q(byteArrayOutputStream, ((Integer) it.next()).intValue());
                        v51.q(byteArrayOutputStream, 0);
                    }
                    for (int i4 : yeVar.h) {
                        v51.q(byteArrayOutputStream, i4);
                    }
                }
                return true;
            }
            byte[] bArr6 = s90.d;
            if (Arrays.equals(bArr, bArr6)) {
                byte[] bArrE2 = e(yeVarArr, bArr6);
                v51.p(byteArrayOutputStream, yeVarArr.length, 1);
                v51.p(byteArrayOutputStream, bArrE2.length, 4);
                byte[] bArrD2 = v51.d(bArrE2);
                v51.p(byteArrayOutputStream, bArrD2.length, 4);
                byteArrayOutputStream.write(bArrD2);
                return true;
            }
            if (!Arrays.equals(bArr, bArr2)) {
                return false;
            }
            v51.q(byteArrayOutputStream, yeVarArr.length);
            for (ye yeVar2 : yeVarArr) {
                String str = yeVar2.a;
                TreeMap treeMap = yeVar2.i;
                String strR2 = r(bArr2, str, yeVar2.b);
                Charset charset2 = StandardCharsets.UTF_8;
                v51.q(byteArrayOutputStream, strR2.getBytes(charset2).length);
                v51.q(byteArrayOutputStream, treeMap.size());
                v51.q(byteArrayOutputStream, yeVar2.h.length);
                v51.p(byteArrayOutputStream, yeVar2.c, 4);
                byteArrayOutputStream.write(strR2.getBytes(charset2));
                Iterator it2 = treeMap.keySet().iterator();
                while (it2.hasNext()) {
                    v51.q(byteArrayOutputStream, ((Integer) it2.next()).intValue());
                }
                for (int i5 : yeVar2.h) {
                    v51.q(byteArrayOutputStream, i5);
                }
            }
            return true;
        }
        ArrayList arrayList = new ArrayList(3);
        ArrayList arrayList2 = new ArrayList(3);
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        try {
            v51.q(byteArrayOutputStream2, yeVarArr.length);
            int i6 = 2;
            int i7 = 2;
            for (ye yeVar3 : yeVarArr) {
                v51.p(byteArrayOutputStream2, yeVar3.c, 4);
                v51.p(byteArrayOutputStream2, yeVar3.d, 4);
                v51.p(byteArrayOutputStream2, yeVar3.g, 4);
                String strR3 = r(bArr4, yeVar3.a, yeVar3.b);
                Charset charset3 = StandardCharsets.UTF_8;
                int length2 = strR3.getBytes(charset3).length;
                v51.q(byteArrayOutputStream2, length2);
                i7 = i7 + 14 + length2;
                byteArrayOutputStream2.write(strR3.getBytes(charset3));
            }
            byte[] byteArray = byteArrayOutputStream2.toByteArray();
            if (i7 != byteArray.length) {
                throw new IllegalStateException("Expected size " + i7 + ", does not match actual size " + byteArray.length);
            }
            r90 r90Var = new r90(1, false, byteArray);
            byteArrayOutputStream2.close();
            arrayList.add(r90Var);
            ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i8 = 0;
            int i9 = 0;
            while (i8 < yeVarArr.length) {
                try {
                    ye yeVar4 = yeVarArr[i8];
                    v51.q(byteArrayOutputStream3, i8);
                    v51.q(byteArrayOutputStream3, yeVar4.e);
                    i9 = i9 + 4 + (yeVar4.e * i6);
                    int[] iArr = yeVar4.h;
                    int length3 = iArr.length;
                    int i10 = i3;
                    while (i3 < length3) {
                        int i11 = iArr[i3];
                        v51.q(byteArrayOutputStream3, i11 - i10);
                        i3++;
                        i6 = i6;
                        i10 = i11;
                    }
                    i8++;
                    i3 = 0;
                } catch (Throwable th) {
                    try {
                        byteArrayOutputStream3.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            }
            int i12 = i6;
            byte[] byteArray2 = byteArrayOutputStream3.toByteArray();
            if (i9 != byteArray2.length) {
                throw new IllegalStateException("Expected size " + i9 + ", does not match actual size " + byteArray2.length);
            }
            r90 r90Var2 = new r90(3, true, byteArray2);
            byteArrayOutputStream3.close();
            arrayList.add(r90Var2);
            ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
            int i13 = 0;
            for (int i14 = 0; i14 < yeVarArr.length; i14++) {
                try {
                    ye yeVar5 = yeVarArr[i14];
                    Iterator it3 = yeVar5.i.entrySet().iterator();
                    int iIntValue = 0;
                    while (it3.hasNext()) {
                        iIntValue |= ((Integer) ((Map.Entry) it3.next()).getValue()).intValue();
                    }
                    ByteArrayOutputStream byteArrayOutputStream5 = new ByteArrayOutputStream();
                    try {
                        S(byteArrayOutputStream5, iIntValue, yeVar5);
                        byte[] byteArray3 = byteArrayOutputStream5.toByteArray();
                        byteArrayOutputStream5.close();
                        ByteArrayOutputStream byteArrayOutputStream6 = new ByteArrayOutputStream();
                        try {
                            T(byteArrayOutputStream6, yeVar5);
                            byte[] byteArray4 = byteArrayOutputStream6.toByteArray();
                            byteArrayOutputStream6.close();
                            v51.q(byteArrayOutputStream4, i14);
                            int length4 = byteArray3.length + 2 + byteArray4.length;
                            int i15 = i13 + 6;
                            v51.p(byteArrayOutputStream4, length4, 4);
                            v51.q(byteArrayOutputStream4, iIntValue);
                            byteArrayOutputStream4.write(byteArray3);
                            byteArrayOutputStream4.write(byteArray4);
                            i13 = i15 + length4;
                        } catch (Throwable th3) {
                            try {
                                byteArrayOutputStream6.close();
                                throw th3;
                            } catch (Throwable th4) {
                                th3.addSuppressed(th4);
                                throw th3;
                            }
                        }
                    } catch (Throwable th5) {
                        try {
                            byteArrayOutputStream5.close();
                            throw th5;
                        } catch (Throwable th6) {
                            th5.addSuppressed(th6);
                            throw th5;
                        }
                    }
                } catch (Throwable th7) {
                    try {
                        byteArrayOutputStream4.close();
                        throw th7;
                    } catch (Throwable th8) {
                        th7.addSuppressed(th8);
                        throw th7;
                    }
                }
            }
            byte[] byteArray5 = byteArrayOutputStream4.toByteArray();
            if (i13 != byteArray5.length) {
                throw new IllegalStateException("Expected size " + i13 + ", does not match actual size " + byteArray5.length);
            }
            r90 r90Var3 = new r90(4, true, byteArray5);
            byteArrayOutputStream4.close();
            arrayList.add(r90Var3);
            long size2 = 12 + ((long) (arrayList.size() * 16));
            v51.p(byteArrayOutputStream, arrayList.size(), 4);
            int i16 = 0;
            while (i16 < arrayList.size()) {
                r90 r90Var4 = (r90) arrayList.get(i16);
                int i17 = r90Var4.a;
                byte[] bArr7 = r90Var4.b;
                if (i17 != 1) {
                    i2 = i12;
                    if (i17 == i2) {
                        j2 = 1;
                    } else if (i17 == 3) {
                        j2 = 2;
                    } else if (i17 == 4) {
                        j2 = 3;
                    } else {
                        if (i17 != 5) {
                            throw null;
                        }
                        j2 = 4;
                    }
                } else {
                    i2 = i12;
                    j2 = 0;
                }
                v51.p(byteArrayOutputStream, j2, 4);
                v51.p(byteArrayOutputStream, size2, 4);
                if (r90Var4.c) {
                    long length5 = bArr7.length;
                    byte[] bArrD3 = v51.d(bArr7);
                    arrayList2.add(bArrD3);
                    v51.p(byteArrayOutputStream, bArrD3.length, 4);
                    v51.p(byteArrayOutputStream, length5, 4);
                    length = bArrD3.length;
                } else {
                    arrayList2.add(bArr7);
                    v51.p(byteArrayOutputStream, bArr7.length, 4);
                    v51.p(byteArrayOutputStream, 0L, 4);
                    length = bArr7.length;
                }
                size2 += (long) length;
                i16++;
                i12 = i2;
            }
            for (int i18 = 0; i18 < arrayList2.size(); i18++) {
                byteArrayOutputStream.write((byte[]) arrayList2.get(i18));
            }
            return true;
        } catch (Throwable th9) {
            try {
                byteArrayOutputStream2.close();
                throw th9;
            } catch (Throwable th10) {
                th9.addSuppressed(th10);
                throw th9;
            }
        }
    }

    public static int O0(int i2, byte[] bArr, int i3, int i4, l23 l23Var, i13 i13Var) {
        e23 e23Var = (e23) l23Var;
        int iW = W(bArr, i3, i13Var);
        e23Var.d(i13Var.a);
        while (iW < i4) {
            int iW2 = W(bArr, iW, i13Var);
            if (i2 != i13Var.a) {
                break;
            }
            iW = W(bArr, iW2, i13Var);
            e23Var.d(i13Var.a);
        }
        return iW;
    }

    public static int P(Parcel parcel) {
        int i2 = parcel.readInt();
        int iJ = J(parcel, i2);
        char c = (char) i2;
        int iDataPosition = parcel.dataPosition();
        if (c != 20293) {
            throw new na("Expected object header. Got 0x".concat(String.valueOf(Integer.toHexString(i2))), parcel);
        }
        int i3 = iJ + iDataPosition;
        if (i3 >= iDataPosition && i3 <= parcel.dataSize()) {
            return i3;
        }
        throw new na("Size read is invalid start=" + iDataPosition + " end=" + i3, parcel);
    }

    public static Bundle P0(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        Iterator<String> itKeys = jSONObject.keys();
        Bundle bundle = new Bundle();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object objOpt = jSONObject.opt(next);
            if (objOpt != null) {
                if (objOpt instanceof Boolean) {
                    bundle.putBoolean(next, ((Boolean) objOpt).booleanValue());
                } else if (objOpt instanceof Double) {
                    bundle.putDouble(next, ((Double) objOpt).doubleValue());
                } else if (objOpt instanceof Integer) {
                    bundle.putInt(next, ((Integer) objOpt).intValue());
                } else if (objOpt instanceof Long) {
                    bundle.putLong(next, ((Long) objOpt).longValue());
                } else if (objOpt instanceof String) {
                    bundle.putString(next, (String) objOpt);
                } else if (objOpt instanceof JSONArray) {
                    JSONArray jSONArray = (JSONArray) objOpt;
                    if (jSONArray.length() != 0) {
                        int length = jSONArray.length();
                        int i2 = 0;
                        Object objOpt2 = null;
                        for (int i3 = 0; objOpt2 == null && i3 < length; i3++) {
                            objOpt2 = !jSONArray.isNull(i3) ? jSONArray.opt(i3) : null;
                        }
                        if (objOpt2 == null) {
                            jn.T("Expected JSONArray with at least 1 non-null element for key:".concat(String.valueOf(next)));
                        } else if (objOpt2 instanceof JSONObject) {
                            Bundle[] bundleArr = new Bundle[length];
                            while (i2 < length) {
                                bundleArr[i2] = !jSONArray.isNull(i2) ? P0(jSONArray.optJSONObject(i2)) : null;
                                i2++;
                            }
                            bundle.putParcelableArray(next, bundleArr);
                        } else if (objOpt2 instanceof Number) {
                            double[] dArr = new double[jSONArray.length()];
                            while (i2 < length) {
                                dArr[i2] = jSONArray.optDouble(i2);
                                i2++;
                            }
                            bundle.putDoubleArray(next, dArr);
                        } else if (objOpt2 instanceof CharSequence) {
                            String[] strArr = new String[length];
                            while (i2 < length) {
                                strArr[i2] = !jSONArray.isNull(i2) ? jSONArray.optString(i2) : null;
                                i2++;
                            }
                            bundle.putStringArray(next, strArr);
                        } else if (objOpt2 instanceof Boolean) {
                            boolean[] zArr = new boolean[length];
                            while (i2 < length) {
                                zArr[i2] = jSONArray.optBoolean(i2);
                                i2++;
                            }
                            bundle.putBooleanArray(next, zArr);
                        } else {
                            jn.T("JSONArray with unsupported type " + objOpt2.getClass().getCanonicalName() + " for key:" + next);
                        }
                    }
                } else if (objOpt instanceof JSONObject) {
                    bundle.putBundle(next, P0((JSONObject) objOpt));
                } else {
                    jn.T("Unsupported type for key:".concat(String.valueOf(next)));
                }
            }
        }
        return bundle;
    }

    public static void Q(ByteArrayOutputStream byteArrayOutputStream, ye yeVar) throws IOException {
        T(byteArrayOutputStream, yeVar);
        int i2 = yeVar.g;
        int[] iArr = yeVar.h;
        int length = iArr.length;
        int i3 = 0;
        int i4 = 0;
        while (i3 < length) {
            int i5 = iArr[i3];
            v51.q(byteArrayOutputStream, i5 - i4);
            i3++;
            i4 = i5;
        }
        byte[] bArr = new byte[(((i2 * 2) + 7) & (-8)) / 8];
        for (Map.Entry entry : yeVar.i.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            int iIntValue2 = ((Integer) entry.getValue()).intValue();
            if ((iIntValue2 & 2) != 0) {
                int i6 = iIntValue / 8;
                bArr[i6] = (byte) (bArr[i6] | (1 << (iIntValue % 8)));
            }
            if ((iIntValue2 & 4) != 0) {
                int i7 = iIntValue + i2;
                int i8 = i7 / 8;
                bArr[i8] = (byte) ((1 << (i7 % 8)) | bArr[i8]);
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static byte[] Q0(byte[] bArr) {
        int i2;
        byte[] bArr2 = new byte[256];
        for (int i3 = 0; i3 < 256; i3++) {
            bArr2[i3] = (byte) (1 & ((bArr[i3 >> 3] & 255) >> (i3 & 7)));
        }
        for (int i4 = 0; i4 < 256; i4++) {
            if (bArr2[i4] != 0) {
                for (int i5 = 1; i5 <= 6 && (i2 = i4 + i5) < 256; i5++) {
                    byte b = bArr2[i2];
                    if (b != 0) {
                        byte b2 = bArr2[i4];
                        int i6 = b << i5;
                        int i7 = b2 + i6;
                        if (i7 > 15) {
                            int i8 = b2 - i6;
                            if (i8 < -15) {
                                break;
                            }
                            bArr2[i4] = (byte) i8;
                            while (i2 < 256) {
                                if (bArr2[i2] == 0) {
                                    bArr2[i2] = 1;
                                    break;
                                }
                                bArr2[i2] = 0;
                                i2++;
                            }
                        } else {
                            bArr2[i4] = (byte) i7;
                            bArr2[i2] = 0;
                        }
                    }
                }
            }
        }
        return bArr2;
    }

    public static void R(ByteArrayOutputStream byteArrayOutputStream, ye yeVar, String str) throws IOException {
        Charset charset = StandardCharsets.UTF_8;
        v51.q(byteArrayOutputStream, str.getBytes(charset).length);
        v51.q(byteArrayOutputStream, yeVar.e);
        v51.p(byteArrayOutputStream, yeVar.f, 4);
        v51.p(byteArrayOutputStream, yeVar.c, 4);
        v51.p(byteArrayOutputStream, yeVar.g, 4);
        byteArrayOutputStream.write(str.getBytes(charset));
    }

    public static int R0(byte[] bArr, int i2, l23 l23Var, i13 i13Var) throws o23 {
        e23 e23Var = (e23) l23Var;
        int iW = W(bArr, i2, i13Var);
        int i3 = i13Var.a + iW;
        while (iW < i3) {
            iW = W(bArr, iW, i13Var);
            e23Var.d(i13Var.a);
        }
        if (iW == i3) {
            return iW;
        }
        j7.s("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        return 0;
    }

    public static void S(ByteArrayOutputStream byteArrayOutputStream, int i2, ye yeVar) throws IOException {
        int i3 = yeVar.g;
        byte[] bArr = new byte[(((Integer.bitCount(i2 & (-2)) * i3) + 7) & (-8)) / 8];
        for (Map.Entry entry : yeVar.i.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            int iIntValue2 = ((Integer) entry.getValue()).intValue();
            int i4 = 0;
            for (int i5 = 1; i5 <= 4; i5 <<= 1) {
                if (i5 != 1 && (i5 & i2) != 0) {
                    if ((i5 & iIntValue2) == i5) {
                        int i6 = (i4 * i3) + iIntValue;
                        int i7 = i6 / 8;
                        bArr[i7] = (byte) ((1 << (i6 % 8)) | bArr[i7]);
                    }
                    i4++;
                }
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static String S0(b52 b52Var) {
        if (b52Var == null) {
            return null;
        }
        StringWriter stringWriter = new StringWriter();
        try {
            JsonWriter jsonWriter = new JsonWriter(stringWriter);
            V0(jsonWriter, b52Var);
            jsonWriter.close();
            return stringWriter.toString();
        } catch (IOException e) {
            jn.P("Error when writing JSON.", e);
            return null;
        }
    }

    public static void T(ByteArrayOutputStream byteArrayOutputStream, ye yeVar) {
        int i2 = 0;
        for (Map.Entry entry : yeVar.i.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            if ((((Integer) entry.getValue()).intValue() & 1) != 0) {
                v51.q(byteArrayOutputStream, iIntValue - i2);
                v51.q(byteArrayOutputStream, 0);
                i2 = iIntValue;
            }
        }
    }

    public static int T0(j33 j33Var, int i2, byte[] bArr, int i3, int i4, l23 l23Var, i13 i13Var) throws o23 {
        d23 d23VarA = j33Var.a();
        j33 j33Var2 = j33Var;
        byte[] bArr2 = bArr;
        int i5 = i4;
        i13 i13Var2 = i13Var;
        int iL0 = L0(d23VarA, j33Var2, bArr2, i3, i5, i13Var2);
        j33Var2.h(d23VarA);
        i13Var2.c = d23VarA;
        l23Var.add(d23VarA);
        while (iL0 < i5) {
            i13 i13Var3 = i13Var2;
            int i6 = i5;
            int iW = W(bArr2, iL0, i13Var3);
            if (i2 != i13Var3.a) {
                break;
            }
            byte[] bArr3 = bArr2;
            j33 j33Var3 = j33Var2;
            d23 d23VarA2 = j33Var3.a();
            iL0 = L0(d23VarA2, j33Var3, bArr3, iW, i6, i13Var3);
            j33Var2 = j33Var3;
            bArr2 = bArr3;
            i5 = i6;
            i13Var2 = i13Var3;
            j33Var2.h(d23VarA2);
            i13Var2.c = d23VarA2;
            l23Var.add(d23VarA2);
        }
        return iL0;
    }

    public static int U(int i2) {
        if (i2 == 2147385345 || i2 == -25230976 || i2 == 536864768 || i2 == -14745368) {
            return 1;
        }
        if (i2 == 1683496997 || i2 == 622876772) {
            return 2;
        }
        if (i2 == 1078008818 || i2 == -233094848) {
            return 3;
        }
        return (i2 == 1908687592 || i2 == -398277519) ? 4 : 0;
    }

    public static long U0(int i2, byte[] bArr) {
        return (((long) (bArr[i2 + 2] & 255)) << 16) | (bArr[i2] & 255) | (((long) (bArr[i2 + 1] & 255)) << 8);
    }

    public static int V(long j2) {
        int i2 = (int) j2;
        hn.I(((long) i2) == j2, "Out of range: %s", j2);
        return i2;
    }

    public static void V0(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        if (obj instanceof Number) {
            jsonWriter.value((Number) obj);
            return;
        }
        if (obj instanceof Boolean) {
            jsonWriter.value(((Boolean) obj).booleanValue());
            return;
        }
        if (obj instanceof String) {
            jsonWriter.value((String) obj);
            return;
        }
        if (obj instanceof b52) {
            x0(jsonWriter, ((b52) obj).d);
            return;
        }
        if (!(obj instanceof Map)) {
            if (!(obj instanceof List)) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginArray();
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                V0(jsonWriter, it.next());
            }
            jsonWriter.endArray();
            return;
        }
        jsonWriter.beginObject();
        for (Map.Entry entry : ((Map) obj).entrySet()) {
            Object key = entry.getKey();
            if (key instanceof String) {
                V0(jsonWriter.name((String) key), entry.getValue());
            }
        }
        jsonWriter.endObject();
    }

    public static int W(byte[] bArr, int i2, i13 i13Var) {
        int i3 = i2 + 1;
        byte b = bArr[i2];
        if (b < 0) {
            return e0(b, bArr, i3, i13Var);
        }
        i13Var.a = b;
        return i3;
    }

    public static int W0(int i2, byte[] bArr, int i3, int i4, p33 p33Var, i13 i13Var) throws o23 {
        if ((i2 >>> 3) == 0) {
            j7.s("Protocol message contained an invalid tag (zero).");
            return 0;
        }
        int i5 = i2 & 7;
        if (i5 == 0) {
            int iO0 = o0(bArr, i3, i13Var);
            p33Var.d(i2, Long.valueOf(i13Var.b));
            return iO0;
        }
        if (i5 == 1) {
            p33Var.d(i2, Long.valueOf(s0(i3, bArr)));
            return i3 + 8;
        }
        if (i5 == 2) {
            int iW = W(bArr, i3, i13Var);
            int i6 = i13Var.a;
            if (i6 < 0) {
                j7.s("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                return 0;
            }
            if (i6 > bArr.length - iW) {
                j7.s("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                return 0;
            }
            if (i6 == 0) {
                p33Var.d(i2, n13.g);
            } else {
                p33Var.d(i2, n13.n(bArr, iW, i6));
            }
            return iW + i6;
        }
        if (i5 != 3) {
            if (i5 == 5) {
                p33Var.d(i2, Integer.valueOf(p0(i3, bArr)));
                return i3 + 4;
            }
            j7.s("Protocol message contained an invalid tag (zero).");
            return 0;
        }
        int i7 = (i2 & (-8)) | 4;
        p33 p33VarA = p33.a();
        int i8 = i13Var.d + 1;
        i13Var.d = i8;
        if (i8 >= 100) {
            j7.s("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
            return 0;
        }
        int i9 = 0;
        while (i3 < i4) {
            int iW2 = W(bArr, i3, i13Var);
            int i10 = i13Var.a;
            if (i10 == i7) {
                i9 = i10;
                i3 = iW2;
                break;
            }
            i3 = W0(i10, bArr, iW2, i4, p33VarA, i13Var);
            i9 = i10;
        }
        i13Var.d--;
        if (i3 > i4 || i9 != i7) {
            j7.s("Failed to parse the message.");
            return 0;
        }
        p33Var.d(i2, p33VarA);
        return i3;
    }

    public static List X(JSONArray jSONArray, ArrayList arrayList) {
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        if (jSONArray != null) {
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                arrayList.add(jSONArray.getString(i2));
            }
        }
        return arrayList;
    }

    public static long X0(int i2, byte[] bArr) {
        return (((long) (bArr[i2 + 3] & 255)) << 24) | U0(i2, bArr);
    }

    public static dm0 Y(km0 km0Var) {
        long j2;
        boolean z;
        long j3;
        long j4;
        long j5;
        long j6;
        long jCurrentTimeMillis = System.currentTimeMillis();
        Map map = km0Var.c;
        if (map == null) {
            return null;
        }
        String str = (String) map.get("Date");
        long jG0 = str != null ? g0(str) : 0L;
        String str2 = (String) map.get("Cache-Control");
        int i2 = 0;
        if (str2 != null) {
            String[] strArrSplit = str2.split(",", 0);
            z = false;
            j3 = 0;
            j4 = 0;
            while (i2 < strArrSplit.length) {
                String strTrim = strArrSplit[i2].trim();
                if (strTrim.equals("no-cache") || strTrim.equals("no-store")) {
                    return null;
                }
                if (strTrim.startsWith("max-age=")) {
                    try {
                        j4 = Long.parseLong(strTrim.substring(8));
                    } catch (Exception unused) {
                    }
                } else if (strTrim.startsWith("stale-while-revalidate=")) {
                    j3 = Long.parseLong(strTrim.substring(23));
                } else if (strTrim.equals("must-revalidate") || strTrim.equals("proxy-revalidate")) {
                    z = true;
                }
                i2++;
            }
            j2 = 0;
            i2 = 1;
        } else {
            j2 = 0;
            z = false;
            j3 = 0;
            j4 = 0;
        }
        String str3 = (String) map.get("Expires");
        long jG1 = str3 != null ? g0(str3) : j2;
        String str4 = (String) map.get("Last-Modified");
        long jG2 = str4 != null ? g0(str4) : j2;
        String str5 = (String) map.get("ETag");
        if (i2 != 0) {
            long j7 = (j4 * 1000) + jCurrentTimeMillis;
            j6 = z ? j7 : (j3 * 1000) + j7;
            j5 = j7;
        } else {
            j5 = (jG0 <= j2 || jG1 < jG0) ? j2 : (jG1 - jG0) + jCurrentTimeMillis;
            j6 = j5;
        }
        dm0 dm0Var = new dm0();
        dm0Var.a = km0Var.b;
        dm0Var.b = str5;
        dm0Var.f = j5;
        dm0Var.e = j6;
        dm0Var.c = jG0;
        dm0Var.d = jG2;
        dm0Var.g = map;
        dm0Var.h = km0Var.d;
        return dm0Var;
    }

    public static JSONObject Y0(JSONObject jSONObject, String[] strArr) {
        for (int i2 = 0; i2 < strArr.length - 1; i2 = 1) {
            if (jSONObject == null) {
                return null;
            }
            jSONObject = jSONObject.optJSONObject(strArr[0]);
        }
        return jSONObject;
    }

    public static sp0 Z(Context context, String str, String str2) {
        sp0 sp0Var;
        try {
            sp0Var = (sp0) ((LinkedBlockingQueue) new kd0(context, str, str2).j).poll(5000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
            sp0Var = null;
        }
        return sp0Var == null ? kd0.l() : sp0Var;
    }

    public static int Z0(int i2, byte[] bArr, int i3, int i4, i13 i13Var) throws o23 {
        if ((i2 >>> 3) == 0) {
            j7.s("Protocol message contained an invalid tag (zero).");
            return 0;
        }
        int i5 = i2 & 7;
        if (i5 == 0) {
            return o0(bArr, i3, i13Var);
        }
        if (i5 == 1) {
            return i3 + 8;
        }
        if (i5 == 2) {
            return W(bArr, i3, i13Var) + i13Var.a;
        }
        if (i5 != 3) {
            if (i5 == 5) {
                return i3 + 4;
            }
            j7.s("Protocol message contained an invalid tag (zero).");
            return 0;
        }
        int i6 = (i2 & (-8)) | 4;
        int i7 = 0;
        while (i3 < i4) {
            i3 = W(bArr, i3, i13Var);
            i7 = i13Var.a;
            if (i7 == i6) {
                break;
            }
            i3 = Z0(i7, bArr, i3, i4, i13Var);
        }
        if (i3 <= i4 && i7 == i6) {
            return i3;
        }
        j7.s("Failed to parse the message.");
        return 0;
    }

    public static void a0(Context context) {
        if (((Boolean) tu0.e.c.a(lx0.C6)).booleanValue() && context != null) {
            context.deleteDatabase("OfflineUpload.db");
        }
        try {
            mc2 mc2VarF = mc2.f(context);
            nc2 nc2VarF = nc2.f(context);
            oc2 oc2VarO = oc2.o(context);
            mc2VarF.getClass();
            synchronized (mc2.class) {
                mc2VarF.c(false);
            }
            synchronized (mc2.class) {
                mc2VarF.c(true);
            }
            nc2VarF.h();
            oc2VarO.r();
        } catch (IOException e) {
            vc3.C.h.d("clearStorageOnIdlessMode", e);
        }
        try {
            if (context.getSharedPreferences("query_info_shared_prefs", 0).edit().clear().commit()) {
            } else {
                throw new IOException("Failed to remove query_info_shared_prefs");
            }
        } catch (IOException e2) {
            vc3.C.h.d("clearStorageOnIdlessMode_scar", e2);
        }
    }

    public static void b(int i2, Object obj) {
        if (w(i2, obj)) {
            return;
        }
        String strH = ec.h("kotlin.jvm.functions.Function", i2);
        ClassCastException classCastException = new ClassCastException(obj.getClass().getName() + " cannot be cast to " + strH);
        jn.j(classCastException, w40.class.getName());
        throw classCastException;
    }

    public static void b0(Object obj, Object obj2) {
        if (obj == null) {
            j7.l("null key in entry: null=".concat(String.valueOf(obj2)));
        } else {
            if (obj2 != null) {
                return;
            }
            String string = obj.toString();
            j7.l(ec.n(new StringBuilder(string.length() + 26), "null value in entry: ", string, "=null"));
        }
    }

    public static Bundle c(Parcel parcel, int i2) {
        int iJ = J(parcel, i2);
        int iDataPosition = parcel.dataPosition();
        if (iJ == 0) {
            return null;
        }
        Bundle bundle = parcel.readBundle();
        parcel.setDataPosition(iDataPosition + iJ);
        return bundle;
    }

    public static byte[] c0(BigInteger bigInteger) {
        if (bigInteger.signum() != -1) {
            return bigInteger.toByteArray();
        }
        j7.p("n must not be negative");
        return null;
    }

    public static byte[] d(Parcel parcel, int i2) {
        int iJ = J(parcel, i2);
        int iDataPosition = parcel.dataPosition();
        if (iJ == 0) {
            return null;
        }
        byte[] bArrCreateByteArray = parcel.createByteArray();
        parcel.setDataPosition(iDataPosition + iJ);
        return bArrCreateByteArray;
    }

    public static byte[] d0(byte[] bArr) {
        int i2;
        byte[] bArr2 = new byte[64];
        int i3 = 0;
        while (true) {
            if (i3 >= 32) {
                break;
            }
            int i4 = i3 + i3;
            bArr2[i4] = (byte) (bArr[i3] & 15);
            bArr2[i4 + 1] = (byte) ((bArr[i3] & 255) >> 4);
            i3++;
        }
        int i5 = 0;
        int i6 = 0;
        while (i5 < 63) {
            byte b = (byte) (bArr2[i5] + i6);
            bArr2[i5] = b;
            int i7 = (b + 8) >> 4;
            bArr2[i5] = (byte) (b - (i7 << 4));
            i5++;
            i6 = i7;
        }
        bArr2[63] = (byte) (bArr2[63] + i6);
        un1 un1Var = new un1(22);
        vg2 vg2Var = new vg2(23);
        for (i2 = 1; i2 < 64; i2 += 2) {
            dr2 dr2Var = new dr2();
            N0(dr2Var, i2 / 2, bArr2[i2]);
            vg2.r(vg2Var, un1Var);
            D0(un1Var, vg2Var, dr2Var);
        }
        r52 r52Var = new r52(28);
        r52.C(un1Var, r52Var);
        J0(un1Var, r52Var);
        r52.C(un1Var, r52Var);
        J0(un1Var, r52Var);
        r52.C(un1Var, r52Var);
        J0(un1Var, r52Var);
        r52.C(un1Var, r52Var);
        J0(un1Var, r52Var);
        for (int i8 = 0; i8 < 64; i8 += 2) {
            dr2 dr2Var2 = new dr2();
            N0(dr2Var2, i8 / 2, bArr2[i8]);
            vg2.r(vg2Var, un1Var);
            D0(un1Var, vg2Var, dr2Var2);
        }
        r52 r52Var2 = new r52(un1Var);
        long[] jArr = new long[10];
        s90.c0(jArr, (long[]) r52Var2.g);
        long[] jArr2 = new long[10];
        s90.c0(jArr2, (long[]) r52Var2.h);
        long[] jArr3 = new long[10];
        s90.c0(jArr3, (long[]) r52Var2.i);
        long[] jArr4 = new long[10];
        s90.c0(jArr4, jArr3);
        long[] jArr5 = new long[10];
        s90.M(jArr5, jArr2, jArr);
        s90.Z(jArr5, jArr5, jArr3);
        long[] jArr6 = new long[10];
        s90.Z(jArr6, jArr, jArr2);
        s90.Z(jArr6, jArr6, fr2.a);
        s90.F(jArr6, jArr6, jArr4);
        s90.R(jArr6, jArr6);
        if (MessageDigest.isEqual(s90.h0(jArr5), s90.h0(jArr6))) {
            return r52Var2.I();
        }
        j7.e("arithmetic error in scalar multiplication");
        return null;
    }

    public static byte[] e(ye[] yeVarArr, byte[] bArr) throws IOException {
        int i2 = 0;
        int length = 0;
        for (ye yeVar : yeVarArr) {
            length += ((((yeVar.g * 2) + 7) & (-8)) / 8) + (yeVar.e * 2) + r(bArr, yeVar.a, yeVar.b).getBytes(StandardCharsets.UTF_8).length + 16 + yeVar.f;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(length);
        if (Arrays.equals(bArr, s90.d)) {
            int length2 = yeVarArr.length;
            while (i2 < length2) {
                ye yeVar2 = yeVarArr[i2];
                R(byteArrayOutputStream, yeVar2, r(bArr, yeVar2.a, yeVar2.b));
                Q(byteArrayOutputStream, yeVar2);
                i2++;
            }
        } else {
            for (ye yeVar3 : yeVarArr) {
                R(byteArrayOutputStream, yeVar3, r(bArr, yeVar3.a, yeVar3.b));
            }
            int length3 = yeVarArr.length;
            while (i2 < length3) {
                Q(byteArrayOutputStream, yeVarArr[i2]);
                i2++;
            }
        }
        if (byteArrayOutputStream.size() == length) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new IllegalStateException("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + length);
    }

    public static int e0(int i2, byte[] bArr, int i3, i13 i13Var) {
        byte b = bArr[i3];
        int i4 = i3 + 1;
        int i5 = i2 & 127;
        if (b >= 0) {
            i13Var.a = i5 | (b << 7);
            return i4;
        }
        int i6 = i5 | ((b & 127) << 7);
        int i7 = i3 + 2;
        byte b2 = bArr[i4];
        if (b2 >= 0) {
            i13Var.a = i6 | (b2 << 14);
            return i7;
        }
        int i8 = i6 | ((b2 & 127) << 14);
        int i9 = i3 + 3;
        byte b3 = bArr[i7];
        if (b3 >= 0) {
            i13Var.a = i8 | (b3 << 21);
            return i9;
        }
        int i10 = i8 | ((b3 & 127) << 21);
        int i11 = i3 + 4;
        byte b4 = bArr[i9];
        if (b4 >= 0) {
            i13Var.a = i10 | (b4 << 28);
            return i11;
        }
        int i12 = i10 | ((b4 & 127) << 28);
        while (true) {
            int i13 = i11 + 1;
            if (bArr[i11] >= 0) {
                i13Var.a = i12;
                return i13;
            }
            i11 = i13;
        }
    }

    public static int f0(long j2) {
        if (j2 > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j2 < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j2;
    }

    public static long g0(String str) {
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss zzz", Locale.US);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
            return simpleDateFormat.parse(str).getTime();
        } catch (ParseException e) {
            if ("0".equals(str) || "-1".equals(str)) {
                tm0.a("Unable to parse dateStr: %s, falling back to 0", str);
                return 0L;
            }
            Log.e("Volley", tm0.d("Unable to parse dateStr: %s, falling back to 0", str), e);
            return 0L;
        }
    }

    public static Bundle h0(Context context, String str) {
        JSONArray jSONArray;
        int i2;
        Object obj;
        SharedPreferences sharedPreferences;
        String str2;
        if (TextUtils.isEmpty(str)) {
            jSONArray = null;
        } else {
            try {
                jSONArray = new JSONArray(str);
            } catch (JSONException e) {
                jn.H("JSON parsing error", e);
                jSONArray = null;
            }
        }
        if (jSONArray == null) {
            return Bundle.EMPTY;
        }
        Bundle bundle = new Bundle();
        for (int i3 = 0; i3 < jSONArray.length(); i3++) {
            JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i3);
            String strOptString = jSONObjectOptJSONObject.optString("bk");
            String strOptString2 = jSONObjectOptJSONObject.optString("sk");
            int iOptInt = jSONObjectOptJSONObject.optInt("type", -1);
            if (iOptInt == 0) {
                i2 = 1;
            } else if (iOptInt != 1) {
                i2 = iOptInt != 2 ? 0 : 3;
            } else {
                i2 = 2;
            }
            if (!TextUtils.isEmpty(strOptString) && !TextUtils.isEmpty(strOptString2) && i2 != 0) {
                List listM = bz1.c(new vh2('/')).m(strOptString2);
                if (listM.size() > 2 || listM.isEmpty()) {
                    obj = null;
                } else {
                    if (listM.size() == 1) {
                        sharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
                        str2 = (String) listM.get(0);
                    } else {
                        sharedPreferences = context.getSharedPreferences((String) listM.get(0), 0);
                        str2 = (String) listM.get(1);
                    }
                    obj = sharedPreferences.getAll().get(str2);
                }
                if (obj != null) {
                    int i4 = i2 - 1;
                    if (i4 != 0) {
                        if (i4 != 1) {
                            if (obj instanceof Boolean) {
                                bundle.putBoolean(strOptString, ((Boolean) obj).booleanValue());
                            }
                        } else if (obj instanceof Integer) {
                            bundle.putInt(strOptString, ((Integer) obj).intValue());
                        } else if (obj instanceof Long) {
                            bundle.putLong(strOptString, ((Long) obj).longValue());
                        } else if (obj instanceof Float) {
                            bundle.putFloat(strOptString, ((Float) obj).floatValue());
                        }
                    } else if (obj instanceof String) {
                        bundle.putString(strOptString, (String) obj);
                    }
                }
            }
        }
        return bundle;
    }

    public static ArrayList i0(JsonReader jsonReader) {
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            arrayList.add(jsonReader.nextString());
        }
        jsonReader.endArray();
        return arrayList;
    }

    public static Parcelable j(Parcel parcel, int i2, Parcelable.Creator creator) {
        int iJ = J(parcel, i2);
        int iDataPosition = parcel.dataPosition();
        if (iJ == 0) {
            return null;
        }
        Parcelable parcelable = (Parcelable) creator.createFromParcel(parcel);
        parcel.setDataPosition(iDataPosition + iJ);
        return parcelable;
    }

    public static void j0(Parcel parcel, int i2, int i3) {
        int iJ = J(parcel, i2);
        if (iJ == i3) {
            return;
        }
        String hexString = Integer.toHexString(iJ);
        StringBuilder sb = new StringBuilder("Expected size ");
        sb.append(i3);
        sb.append(" got ");
        sb.append(iJ);
        sb.append(" (0x");
        throw new na(ec.m(sb, hexString, ")"), parcel);
    }

    public static String k(Parcel parcel, int i2) {
        int iJ = J(parcel, i2);
        int iDataPosition = parcel.dataPosition();
        if (iJ == 0) {
            return null;
        }
        String string = parcel.readString();
        parcel.setDataPosition(iDataPosition + iJ);
        return string;
    }

    public static void k0(String str, int i2) {
        if (i2 >= 0) {
            return;
        }
        StringBuilder sb = new StringBuilder(str.length() + 29 + String.valueOf(i2).length());
        sb.append(str);
        sb.append(" cannot be negative but was: ");
        sb.append(i2);
        throw new IllegalArgumentException(sb.toString());
    }

    public static byte[] l0(BigInteger bigInteger, int i2) throws GeneralSecurityException {
        if (bigInteger.signum() == -1) {
            j7.p("integer must be nonnegative");
            return null;
        }
        byte[] byteArray = bigInteger.toByteArray();
        int length = byteArray.length;
        if (length == i2) {
            return byteArray;
        }
        int i3 = i2 + 1;
        if (length > i3) {
            j7.r("integer too large");
            return null;
        }
        if (length != i3) {
            byte[] bArr = new byte[i2];
            System.arraycopy(byteArray, 0, bArr, i2 - length, length);
            return bArr;
        }
        if (byteArray[0] == 0) {
            return Arrays.copyOfRange(byteArray, 1, length);
        }
        j7.r("integer too large");
        return null;
    }

    public static String[] m(Parcel parcel, int i2) {
        int iJ = J(parcel, i2);
        int iDataPosition = parcel.dataPosition();
        if (iJ == 0) {
            return null;
        }
        String[] strArrCreateStringArray = parcel.createStringArray();
        parcel.setDataPosition(iDataPosition + iJ);
        return strArrCreateStringArray;
    }

    public static byte[] m0(byte[] bArr) {
        MessageDigest messageDigest = (MessageDigest) a03.e.a.l("SHA-512");
        messageDigest.update(bArr, 0, 32);
        byte[] bArrDigest = messageDigest.digest();
        bArrDigest[0] = (byte) (bArrDigest[0] & 248);
        int i2 = bArrDigest[31] & 127;
        bArrDigest[31] = (byte) i2;
        bArrDigest[31] = (byte) (i2 | 64);
        return bArrDigest;
    }

    public static ArrayList n(Parcel parcel, int i2) {
        int iJ = J(parcel, i2);
        int iDataPosition = parcel.dataPosition();
        if (iJ == 0) {
            return null;
        }
        ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(iDataPosition + iJ);
        return arrayListCreateStringArrayList;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x005e  */
    /* JADX WARN: Code duplicated, block: B:17:? A[RETURN, SYNTHETIC] */
    public static int n0(byte[] bArr) {
        int i2;
        int i3;
        byte b;
        int i4;
        int i5;
        int i6;
        byte b2;
        boolean z = false;
        byte b3 = bArr[0];
        if (b3 != -2) {
            if (b3 == -1) {
                i5 = (bArr[7] & 3) << 12;
                i6 = (bArr[6] & 255) << 4;
                b2 = bArr[9];
            } else if (b3 != 31) {
                i2 = (bArr[5] & 3) << 12;
                i3 = (bArr[6] & 255) << 4;
                b = bArr[7];
            } else {
                i5 = (bArr[6] & 3) << 12;
                i6 = (bArr[7] & 255) << 4;
                b2 = bArr[8];
            }
            i4 = (((b2 & 60) >> 2) | i5 | i6) + 1;
            z = true;
            if (z) {
                return (i4 * 16) / 14;
            }
            return i4;
        }
        i2 = (bArr[4] & 3) << 12;
        i3 = (bArr[7] & 255) << 4;
        b = bArr[6];
        i4 = (((b & 240) >> 4) | i2 | i3) + 1;
        if (z) {
            return (i4 * 16) / 14;
        }
        return i4;
    }

    public static Object[] o(Parcel parcel, int i2, Parcelable.Creator creator) {
        int iJ = J(parcel, i2);
        int iDataPosition = parcel.dataPosition();
        if (iJ == 0) {
            return null;
        }
        Object[] objArrCreateTypedArray = parcel.createTypedArray(creator);
        parcel.setDataPosition(iDataPosition + iJ);
        return objArrCreateTypedArray;
    }

    public static int o0(byte[] bArr, int i2, i13 i13Var) {
        long j2 = bArr[i2];
        int i3 = i2 + 1;
        if (j2 >= 0) {
            i13Var.b = j2;
            return i3;
        }
        int i4 = i2 + 2;
        byte b = bArr[i3];
        long j3 = (j2 & 127) | (((long) (b & 127)) << 7);
        int i5 = 7;
        while (b < 0) {
            int i6 = i4 + 1;
            byte b2 = bArr[i4];
            i5 += 7;
            j3 |= ((long) (b2 & 127)) << i5;
            b = b2;
            i4 = i6;
        }
        i13Var.b = j3;
        return i4;
    }

    public static void p(Parcel parcel, int i2) {
        if (parcel.dataPosition() != i2) {
            throw new na(ec.h("Overread allowed size end=", i2), parcel);
        }
    }

    public static int p0(int i2, byte[] bArr) {
        int i3 = bArr[i2] & 255;
        int i4 = bArr[i2 + 1] & 255;
        int i5 = bArr[i2 + 2] & 255;
        return ((bArr[i2 + 3] & 255) << 24) | (i4 << 8) | i3 | (i5 << 16);
    }

    public static dj q(dj[] djVarArr, int i2) {
        int i3 = (i2 & 1) == 0 ? 400 : 700;
        boolean z = (i2 & 2) != 0;
        dj djVar = null;
        int i4 = Integer.MAX_VALUE;
        for (dj djVar2 : djVarArr) {
            int iAbs = (Math.abs(djVar2.c - i3) * 2) + (djVar2.d == z ? 0 : 1);
            if (djVar == null || i4 > iAbs) {
                djVar = djVar2;
                i4 = iAbs;
            }
        }
        return djVar;
    }

    public static JSONObject q0(JsonReader jsonReader) {
        JSONObject jSONObject = new JSONObject();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            JsonToken jsonTokenPeek = jsonReader.peek();
            if (JsonToken.BEGIN_ARRAY.equals(jsonTokenPeek)) {
                jSONObject.put(strNextName, u0(jsonReader));
            } else if (JsonToken.BEGIN_OBJECT.equals(jsonTokenPeek)) {
                jSONObject.put(strNextName, q0(jsonReader));
            } else if (JsonToken.BOOLEAN.equals(jsonTokenPeek)) {
                jSONObject.put(strNextName, jsonReader.nextBoolean());
            } else if (JsonToken.NUMBER.equals(jsonTokenPeek)) {
                jSONObject.put(strNextName, jsonReader.nextDouble());
            } else {
                if (!JsonToken.STRING.equals(jsonTokenPeek)) {
                    j7.e("unexpected json token: ".concat(String.valueOf(jsonTokenPeek)));
                    return null;
                }
                jSONObject.put(strNextName, jsonReader.nextString());
            }
        }
        jsonReader.endObject();
        return jSONObject;
    }

    public static String r(byte[] bArr, String str, String str2) {
        byte[] bArr2 = s90.e;
        byte[] bArr3 = s90.f;
        Object obj = (Arrays.equals(bArr, bArr3) || Arrays.equals(bArr, bArr2)) ? ":" : "!";
        if (str.length() <= 0) {
            if ("!".equals(obj)) {
                return str2.replace(":", "!");
            }
            if (":".equals(obj)) {
                return str2.replace("!", ":");
            }
        } else {
            if (str2.equals("classes.dex")) {
                return str;
            }
            if (str2.contains("!") || str2.contains(":")) {
                if ("!".equals(obj)) {
                    return str2.replace(":", "!");
                }
                if (":".equals(obj)) {
                    return str2.replace("!", ":");
                }
            } else if (!str2.endsWith(".apk")) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                return ec.m(sb, (Arrays.equals(bArr, bArr3) || Arrays.equals(bArr, bArr2)) ? ":" : "!", str2);
            }
        }
        return str2;
    }

    public static int r0(byte b, byte b2, byte b3, byte b4) {
        return (b << 24) | ((b2 & 255) << 16) | ((b3 & 255) << 8) | (b4 & 255);
    }

    public static float s(EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return hg.b(edgeEffect);
        }
        return 0.0f;
    }

    public static long s0(int i2, byte[] bArr) {
        return (((long) bArr[i2]) & 255) | ((((long) bArr[i2 + 1]) & 255) << 8) | ((((long) bArr[i2 + 2]) & 255) << 16) | ((((long) bArr[i2 + 3]) & 255) << 24) | ((((long) bArr[i2 + 4]) & 255) << 32) | ((((long) bArr[i2 + 5]) & 255) << 40) | ((((long) bArr[i2 + 6]) & 255) << 48) | ((((long) bArr[i2 + 7]) & 255) << 56);
    }

    public static Intent t(c4 c4Var) {
        Intent parentActivityIntent = c4Var.getParentActivityIntent();
        if (parentActivityIntent != null) {
            return parentActivityIntent;
        }
        try {
            String strV = v(c4Var, c4Var.getComponentName());
            if (strV == null) {
                return null;
            }
            ComponentName componentName = new ComponentName(c4Var, strV);
            try {
                return v(c4Var, componentName) == null ? Intent.makeMainActivity(componentName) : new Intent().setComponent(componentName);
            } catch (PackageManager.NameNotFoundException unused) {
                Log.e("NavUtils", "getParentActivityIntent: bad parentActivityName '" + strV + "' in manifest");
                return null;
            }
        } catch (PackageManager.NameNotFoundException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static TextView t0(Context context, String str, int i2, int i3, float f2, String str2) {
        TextView textView = new TextView(context);
        textView.setTag(str2);
        y0(textView, -2, -2);
        ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new TableRow.LayoutParams();
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(layoutParams);
        marginLayoutParams.bottomMargin = (int) TypedValue.applyDimension(1, f2, textView.getResources().getDisplayMetrics());
        textView.setLayoutParams(marginLayoutParams);
        textView.setTextAppearance(context, i2);
        textView.setTextColor(i3);
        textView.setText(str);
        return textView;
    }

    public static Intent u(ContextWrapper contextWrapper, ComponentName componentName) {
        String strV = v(contextWrapper, componentName);
        if (strV == null) {
            return null;
        }
        ComponentName componentName2 = new ComponentName(componentName.getPackageName(), strV);
        return v(contextWrapper, componentName2) == null ? Intent.makeMainActivity(componentName2) : new Intent().setComponent(componentName2);
    }

    public static JSONArray u0(JsonReader jsonReader) throws JSONException, IOException {
        JSONArray jSONArray = new JSONArray();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            JsonToken jsonTokenPeek = jsonReader.peek();
            if (JsonToken.BEGIN_ARRAY.equals(jsonTokenPeek)) {
                jSONArray.put(u0(jsonReader));
            } else if (JsonToken.BEGIN_OBJECT.equals(jsonTokenPeek)) {
                jSONArray.put(q0(jsonReader));
            } else if (JsonToken.BOOLEAN.equals(jsonTokenPeek)) {
                jSONArray.put(jsonReader.nextBoolean());
            } else if (JsonToken.NUMBER.equals(jsonTokenPeek)) {
                jSONArray.put(jsonReader.nextDouble());
            } else {
                if (!JsonToken.STRING.equals(jsonTokenPeek)) {
                    j7.e("unexpected json token: ".concat(String.valueOf(jsonTokenPeek)));
                    return null;
                }
                jSONArray.put(jsonReader.nextString());
            }
        }
        jsonReader.endArray();
        return jSONArray;
    }

    public static String v(Context context, ComponentName componentName) {
        String string;
        ActivityInfo activityInfo = context.getPackageManager().getActivityInfo(componentName, Build.VERSION.SDK_INT >= 29 ? 269222528 : 787072);
        String str = activityInfo.parentActivityName;
        if (str != null) {
            return str;
        }
        Bundle bundle = activityInfo.metaData;
        if (bundle == null || (string = bundle.getString("android.support.PARENT_ACTIVITY")) == null) {
            return null;
        }
        if (string.charAt(0) != '.') {
            return string;
        }
        return context.getPackageName() + string;
    }

    public static /* synthetic */ boolean v0(long[] jArr) {
        long[] jArr2 = new long[11];
        System.arraycopy(jArr, 0, jArr2, 0, 10);
        s90.U(jArr2);
        byte[] bArrH0 = s90.h0(jArr2);
        for (int i2 = 0; i2 < 32; i2++) {
            if (bArrH0[i2] != 0) {
                return true;
            }
        }
        return false;
    }

    public static boolean w(int i2, Object obj) {
        int iB;
        if (obj instanceof ol) {
            if (obj instanceof pl) {
                iB = ((pl) obj).b();
            } else if (obj instanceof rk) {
                iB = 0;
            } else if (obj instanceof cl) {
                iB = 1;
            } else if (obj instanceof gl) {
                iB = 2;
            } else {
                iB = obj instanceof hl ? 3 : -1;
            }
            if (iB == i2) {
                return true;
            }
        }
        return false;
    }

    public static int w0(byte[] bArr, int i2, i13 i13Var) throws o23 {
        int iW = W(bArr, i2, i13Var);
        int i3 = i13Var.a;
        if (i3 < 0) {
            j7.s("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            return 0;
        }
        if (i3 == 0) {
            i13Var.c = "";
            return iW;
        }
        x33.a.getClass();
        i13Var.c = v33.c(bArr, iW, i3);
        return iW + i3;
    }

    public static float x(EdgeEffect edgeEffect, float f2, float f3) {
        if (Build.VERSION.SDK_INT >= 31) {
            return hg.c(edgeEffect, f2, f3);
        }
        gg.a(edgeEffect, f2, f3);
        return f2;
    }

    public static void x0(JsonWriter jsonWriter, JSONObject jSONObject) throws IOException {
        try {
            jsonWriter.beginObject();
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                Object obj = jSONObject.get(next);
                if (obj instanceof String) {
                    jsonWriter.name(next).value((String) obj);
                } else if (obj instanceof Number) {
                    jsonWriter.name(next).value((Number) obj);
                } else if (obj instanceof Boolean) {
                    jsonWriter.name(next).value(((Boolean) obj).booleanValue());
                } else if (obj instanceof JSONObject) {
                    x0(jsonWriter.name(next), (JSONObject) obj);
                } else {
                    if (!(obj instanceof JSONArray)) {
                        String strValueOf = String.valueOf(obj);
                        StringBuilder sb = new StringBuilder(strValueOf.length() + 23);
                        sb.append("unable to write field: ");
                        sb.append(strValueOf);
                        throw new JSONException(sb.toString());
                    }
                    C0(jsonWriter.name(next), (JSONArray) obj);
                }
            }
            jsonWriter.endObject();
        } catch (JSONException e) {
            throw new IOException(e);
        }
    }

    public static ic y(gc gcVar, ic icVar) {
        icVar.getClass();
        return ar.j(gcVar, icVar);
    }

    public static void y0(View view, int i2, int i3) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new TableRow.LayoutParams();
        }
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(layoutParams);
        layoutParams2.height = i2;
        layoutParams2.width = i3;
        view.setLayoutParams(layoutParams2);
    }

    public static final Object z(Object obj, Object obj2) {
        if (obj == null) {
            return obj2;
        }
        if (obj instanceof ArrayList) {
            ((ArrayList) obj).add(obj2);
            return obj;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(obj2);
        return arrayList;
    }

    public static int[] z0(bk2 bk2Var) {
        Object[] array = bk2Var.toArray(rj2.f);
        int length = array.length;
        int[] iArr = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            Object obj = array[i2];
            obj.getClass();
            iArr[i2] = ((Number) obj).intValue();
        }
        return iArr;
    }

    public abstract Typeface f(Context context, aj ajVar, Resources resources, int i2);

    public abstract Typeface g(Context context, dj[] djVarArr, int i2);

    public Typeface h(Context context, List list, int i2) {
        throw new IllegalStateException("createFromFontInfoWithFallback must only be called on API 29+");
    }

    public Typeface i(Context context, Resources resources, int i2, String str, int i3) {
        File fileG = s90.g(context);
        if (fileG == null) {
            return null;
        }
        try {
            if (s90.a(fileG, resources, i2)) {
                return Typeface.createFromFile(fileG.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            fileG.delete();
        }
    }
}
