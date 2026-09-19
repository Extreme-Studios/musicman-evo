package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.os.Process;
import android.os.StrictMode;
import android.text.TextUtils;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public abstract class s90 {
    public static final xo2 a = new xo2("CLOSED", 3);
    public static final byte[] b = {48, 49, 53, 0};
    public static final byte[] c = {48, 49, 48, 0};
    public static final byte[] d = {48, 48, 57, 0};
    public static final byte[] e = {48, 48, 53, 0};
    public static final byte[] f = {48, 48, 49, 0};
    public static final byte[] g = {48, 48, 49, 0};
    public static final byte[] h = {48, 48, 50, 0};
    public static final String[] i = {"audio/mpeg-L1", "audio/mpeg-L2", "audio/mpeg"};
    public static final int[] j = {44100, 48000, 32000};
    public static final int[] k = {32000, 64000, 96000, 128000, 160000, 192000, 224000, 256000, 288000, 320000, 352000, 384000, 416000, 448000};
    public static final int[] l = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 176000, 192000, 224000, 256000};
    public static final int[] m = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000, 384000};
    public static final int[] n = {32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000};
    public static final int[] o = {8000, 16000, 24000, 32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000};
    public static final tt0 p = new tt0(14);
    public static final Object q = new Object();
    public static final xn1 r = new xn1(22);
    public static final l32 s = new l32(11);
    public static final int[] t = {0, 3, 6, 9, 12, 16, 19, 22, 25, 28};
    public static final int[] u = {0, 2, 3, 5, 6, 0, 1, 3, 4, 6};
    public static final int[] v = {67108863, 33554431};
    public static final int[] w = {26, 25};

    public static void A(long j2, cw1 cw1Var, me0[] me0VarArr) {
        int i2;
        int iB;
        int iK;
        while (true) {
            if (cw1Var.B() <= 1) {
                return;
            }
            int i3 = 0;
            while (true) {
                if (cw1Var.B() == 0) {
                    i2 = -1;
                    break;
                }
                int iK2 = cw1Var.K();
                i3 += iK2;
                if (iK2 != 255) {
                    i2 = i3;
                    break;
                }
            }
            int i4 = 0;
            do {
                if (cw1Var.B() == 0) {
                    i4 = -1;
                    break;
                } else {
                    iK = cw1Var.K();
                    i4 += iK;
                }
            } while (iK == 255);
            int i5 = cw1Var.b + i4;
            if (i4 == -1 || i4 > cw1Var.B()) {
                Q("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                i5 = cw1Var.c;
            } else if (i2 == 4 && i4 >= 8) {
                int iK3 = cw1Var.K();
                int iL = cw1Var.L();
                if (iL == 49) {
                    iB = cw1Var.b();
                    iL = 49;
                } else {
                    iB = 0;
                }
                int iK4 = cw1Var.K();
                if (iL == 47) {
                    cw1Var.G(1);
                    iL = 47;
                }
                boolean z = iK3 == 181 && (iL == 49 || iL == 47) && iK4 == 3;
                if (iL == 49) {
                    z &= iB == 1195456820;
                }
                if (z) {
                    I(j2, cw1Var, me0VarArr);
                }
            }
            cw1Var.E(i5);
        }
    }

    public static void B(rm rmVar, Throwable th, String str) {
        e71.a((Context) ju.Z0(rmVar)).g(th, str, ((Double) dz0.f.u()).floatValue());
    }

    public static void C(String str, String str2) {
        synchronized (q) {
            Log.d(str, e0(str2, null));
        }
    }

    public static void D(ni0 ni0Var, ri0 ri0Var) {
        for (int i2 = 0; i2 < ni0Var.a(); i2++) {
            long jD = ni0Var.d(i2);
            ArrayList arrayListG = ni0Var.g(jD);
            if (!arrayListG.isEmpty()) {
                if (i2 == ni0Var.a() - 1) {
                    j7.a();
                    return;
                } else {
                    long jD2 = ni0Var.d(i2 + 1) - ni0Var.d(i2);
                    if (jD2 > 0) {
                        ri0Var.mo0b(new mi0(arrayListG, jD, jD2));
                    }
                }
            }
        }
    }

    public static void E(long[] jArr, long[] jArr2, int i2) {
        for (int i3 = 0; i3 < 10; i3++) {
            int i4 = (int) jArr[i3];
            jArr[i3] = ((-i2) & (((int) jArr2[i3]) ^ i4)) ^ i4;
        }
    }

    public static void F(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i2 = 0; i2 < 10; i2++) {
            jArr[i2] = jArr2[i2] + jArr3[i2];
        }
    }

    public static long[] G(long[]... jArr) {
        long length = 0;
        for (long[] jArr2 : jArr) {
            length += (long) jArr2.length;
        }
        int i2 = (int) length;
        hn.I(length == ((long) i2), "the total number of elements (%s) in the arrays must fit in an int", length);
        long[] jArr3 = new long[i2];
        int i3 = 0;
        for (long[] jArr4 : jArr) {
            int length2 = jArr4.length;
            System.arraycopy(jArr4, 0, jArr3, i3, length2);
            i3 += length2;
        }
        return jArr3;
    }

    public static int H(int i2, Object obj) {
        if (obj instanceof byte[]) {
            return ((byte[]) obj)[i2] & 255;
        }
        return obj instanceof short[] ? (char) ((short[]) obj)[i2] : ((int[]) obj)[i2];
    }

    public static void I(long j2, cw1 cw1Var, me0[] me0VarArr) {
        int iK = cw1Var.K();
        if ((iK & 64) != 0) {
            int i2 = iK & 31;
            cw1Var.G(1);
            int i3 = cw1Var.b;
            for (me0 me0Var : me0VarArr) {
                int i4 = i2 * 3;
                cw1Var.E(i3);
                me0Var.a(cw1Var, i4, 0);
                hn.M(j2 != -9223372036854775807L);
                me0Var.c(j2, 1, i4, 0, null);
            }
        }
    }

    public static void J(Parcel parcel, int i2) {
        int iDataPosition = parcel.dataPosition();
        parcel.setDataPosition(i2 - 4);
        parcel.writeInt(iDataPosition - i2);
        parcel.setDataPosition(iDataPosition);
    }

    public static void K(String str, String str2) {
        synchronized (q) {
            Log.i(str, e0(str2, null));
        }
    }

    public static final void L(n13 n13Var, ArrayDeque arrayDeque) {
        if (!n13Var.h()) {
            if (!(n13Var instanceof i33)) {
                j7.p("Has a new type of ByteString been created? Found ".concat(String.valueOf(n13Var.getClass())));
                return;
            }
            i33 i33Var = (i33) n13Var;
            L(i33Var.i, arrayDeque);
            L(i33Var.j, arrayDeque);
            return;
        }
        int iBinarySearch = Arrays.binarySearch(i33.m, n13Var.d());
        if (iBinarySearch < 0) {
            iBinarySearch = (-(iBinarySearch + 1)) - 1;
        }
        int iR = i33.r(iBinarySearch + 1);
        if (arrayDeque.isEmpty() || ((n13) arrayDeque.peek()).d() >= iR) {
            arrayDeque.push(n13Var);
            return;
        }
        int iR2 = i33.r(iBinarySearch);
        n13 i33Var2 = (n13) arrayDeque.pop();
        while (!arrayDeque.isEmpty() && ((n13) arrayDeque.peek()).d() < iR2) {
            i33Var2 = new i33((n13) arrayDeque.pop(), i33Var2);
        }
        i33 i33Var3 = new i33(i33Var2, n13Var);
        while (!arrayDeque.isEmpty()) {
            int iBinarySearch2 = Arrays.binarySearch(i33.m, i33Var3.h);
            if (iBinarySearch2 < 0) {
                iBinarySearch2 = (-(iBinarySearch2 + 1)) - 1;
            }
            if (((n13) arrayDeque.peek()).d() >= i33.r(iBinarySearch2 + 1)) {
                break;
            } else {
                i33Var3 = new i33((n13) arrayDeque.pop(), i33Var3);
            }
        }
        arrayDeque.push(i33Var3);
    }

    public static void M(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i2 = 0; i2 < 10; i2++) {
            jArr[i2] = jArr2[i2] - jArr3[i2];
        }
    }

    public static int N(SQLiteDatabase sQLiteDatabase, int i2) {
        int i3 = 0;
        if (i2 == 2) {
            return 0;
        }
        Cursor cursorD0 = d0(sQLiteDatabase, i2);
        if (cursorD0.getCount() > 0) {
            cursorD0.moveToNext();
            i3 = cursorD0.getInt(cursorD0.getColumnIndexOrThrow("value"));
        }
        cursorD0.close();
        return i3;
    }

    public static void O(int i2, int i3, Object obj) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i2] = (byte) i3;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i2] = (short) i3;
        } else {
            ((int[]) obj)[i2] = i3;
        }
    }

    public static void P(Parcel parcel, int i2, int i3) {
        parcel.writeInt(i2 | (i3 << 16));
    }

    public static void Q(String str, String str2) {
        synchronized (q) {
            Log.w(str, e0(str2, null));
        }
    }

    public static void R(long[] jArr, long[] jArr2) {
        int length = jArr.length;
        if (length != 19) {
            long[] jArr3 = new long[19];
            System.arraycopy(jArr, 0, jArr3, 0, length);
            jArr = jArr3;
        }
        long j2 = jArr[8];
        long j3 = jArr[18];
        long j4 = j2 + (j3 << 4);
        jArr[8] = j4;
        long j5 = j3 + j3 + j4;
        jArr[8] = j5;
        jArr[8] = j5 + j3;
        long j6 = jArr[7];
        long j7 = jArr[17];
        long j8 = j6 + (j7 << 4);
        jArr[7] = j8;
        long j9 = j7 + j7 + j8;
        jArr[7] = j9;
        jArr[7] = j9 + j7;
        long j10 = jArr[6];
        long j11 = jArr[16];
        long j12 = j10 + (j11 << 4);
        jArr[6] = j12;
        long j13 = j11 + j11 + j12;
        jArr[6] = j13;
        jArr[6] = j13 + j11;
        long j14 = jArr[5];
        long j15 = jArr[15];
        long j16 = j14 + (j15 << 4);
        jArr[5] = j16;
        long j17 = j15 + j15 + j16;
        jArr[5] = j17;
        jArr[5] = j17 + j15;
        long j18 = jArr[4];
        long j19 = jArr[14];
        long j20 = j18 + (j19 << 4);
        jArr[4] = j20;
        long j21 = j19 + j19 + j20;
        jArr[4] = j21;
        jArr[4] = j21 + j19;
        long j22 = jArr[3];
        long j23 = jArr[13];
        long j24 = j22 + (j23 << 4);
        jArr[3] = j24;
        long j25 = j23 + j23 + j24;
        jArr[3] = j25;
        jArr[3] = j25 + j23;
        long j26 = jArr[2];
        long j27 = jArr[12];
        long j28 = j26 + (j27 << 4);
        jArr[2] = j28;
        long j29 = j27 + j27 + j28;
        jArr[2] = j29;
        jArr[2] = j29 + j27;
        long j30 = jArr[1];
        long j31 = jArr[11];
        long j32 = j30 + (j31 << 4);
        jArr[1] = j32;
        long j33 = j31 + j31 + j32;
        jArr[1] = j33;
        jArr[1] = j33 + j31;
        long j34 = jArr[0];
        long j35 = jArr[10];
        long j36 = j34 + (j35 << 4);
        jArr[0] = j36;
        long j37 = j35 + j35 + j36;
        jArr[0] = j37;
        jArr[0] = j37 + j35;
        U(jArr);
        System.arraycopy(jArr, 0, jArr2, 0, 10);
    }

    public static long S(ByteBuffer byteBuffer) {
        long jX = x(byteBuffer) << 32;
        if (jX >= 0) {
            return x(byteBuffer) + jX;
        }
        throw new RuntimeException("I don't know how to deal with UInt64! long is not sufficient and I don't want to use BigInt");
    }

    public static void T(String str, String str2, Throwable th) {
        synchronized (q) {
            Log.w(str, e0(str2, th));
        }
    }

    public static void U(long[] jArr) {
        jArr[10] = 0;
        int i2 = 0;
        while (i2 < 10) {
            long j2 = jArr[i2];
            long j3 = j2 / 67108864;
            jArr[i2] = j2 - (j3 << 26);
            int i3 = i2 + 1;
            long j4 = jArr[i3] + j3;
            jArr[i3] = j4;
            long j5 = j4 / 33554432;
            jArr[i3] = j4 - (j5 << 25);
            i2 += 2;
            jArr[i2] = jArr[i2] + j5;
        }
        long j6 = jArr[0];
        long j7 = jArr[10];
        long j8 = j6 + (j7 << 4);
        jArr[0] = j8;
        long j9 = j7 + j7 + j8;
        jArr[0] = j9;
        long j10 = j9 + j7;
        jArr[0] = j10;
        jArr[10] = 0;
        long j11 = j10 / 67108864;
        jArr[0] = j10 - (j11 << 26);
        jArr[1] = jArr[1] + j11;
    }

    public static double V(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[4];
        byteBuffer.get(bArr);
        return ((double) (((((bArr[0] << 24) & (-16777216)) | ((bArr[1] << 16) & 16711680)) | (65280 & (bArr[2] << 8))) | (bArr[3] & 255))) / 65536.0d;
    }

    public static int W(Object obj, Object obj2, int i2, Object obj3, int[] iArr, Object[] objArr, Object[] objArr2) {
        int I = ss0.I(obj);
        int i3 = I & i2;
        int iH = H(i3, obj3);
        if (iH != 0) {
            int i4 = ~i2;
            int i5 = I & i4;
            int i6 = -1;
            while (true) {
                int i7 = iH - 1;
                int i8 = iArr[i7];
                int i9 = i8 & i2;
                if ((i8 & i4) != i5 || !Objects.equals(obj, objArr[i7]) || (objArr2 != null && !Objects.equals(obj2, objArr2[i7]))) {
                    if (i9 == 0) {
                        break;
                    }
                    i6 = i7;
                    iH = i9;
                } else {
                    if (i6 == -1) {
                        O(i3, i9, obj3);
                        return i7;
                    }
                    iArr[i6] = (iArr[i6] & i4) | (i9 & i2);
                    return i7;
                }
            }
        }
        return -1;
    }

    public static void X(SQLiteDatabase sQLiteDatabase, long j2, byte[] bArr) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("timestamp", Long.valueOf(j2));
        contentValues.put("serialized_proto_data", bArr);
        if (sQLiteDatabase.update("offline_signal_contents", contentValues, "timestamp = ?", new String[]{String.valueOf(j2)}) == 0) {
            sQLiteDatabase.insert("offline_signal_contents", null, contentValues);
        }
    }

    public static void Y(String str, String str2) {
        synchronized (q) {
            Log.e(str, e0(str2, null));
        }
    }

    public static void Z(long[] jArr, long[] jArr2, long[] jArr3) {
        long j2 = jArr2[0];
        long j3 = jArr3[0];
        long j4 = j2 * j3;
        long j5 = jArr3[1];
        long j6 = jArr2[1];
        long j7 = (j6 * j3) + (j2 * j5);
        long j8 = jArr3[2];
        long j9 = jArr2[2];
        long j10 = ((j6 + j6) * j5) + (j2 * j8) + (j9 * j3);
        long j11 = jArr3[3];
        long j12 = jArr2[3];
        long j13 = (j6 * j8) + (j9 * j5) + (j2 * j11) + (j12 * j3);
        long j14 = jArr3[4];
        long j15 = jArr2[4];
        long j16 = (j6 * j11) + (j12 * j5);
        long j17 = j16 + j16 + (j9 * j8) + (j2 * j14) + (j15 * j3);
        long j18 = jArr3[5];
        long j19 = jArr2[5];
        long j20 = (j9 * j11) + (j12 * j8) + (j6 * j14) + (j15 * j5) + (j2 * j18) + (j19 * j3);
        long j21 = jArr3[6];
        long j22 = jArr2[6];
        long j23 = (j12 * j11) + (j6 * j18) + (j19 * j5);
        long j24 = j23 + j23 + (j9 * j14) + (j15 * j8) + (j2 * j21) + (j22 * j3);
        long j25 = jArr3[7];
        long j26 = jArr2[7];
        long j27 = (j12 * j14) + (j15 * j11) + (j9 * j18) + (j19 * j8) + (j6 * j21) + (j22 * j5) + (j2 * j25) + (j26 * j3);
        long j28 = jArr3[8];
        long j29 = jArr2[8];
        long j30 = (j12 * j18) + (j19 * j11) + (j6 * j25) + (j26 * j5);
        long j31 = j30 + j30 + (j15 * j14) + (j9 * j21) + (j22 * j8) + (j2 * j28) + (j29 * j3);
        long j32 = jArr3[9];
        long j33 = jArr2[9];
        long j34 = (j15 * j18) + (j19 * j14) + (j12 * j21) + (j22 * j11) + (j9 * j25) + (j26 * j8) + (j6 * j28) + (j29 * j5) + (j2 * j32) + (j3 * j33);
        long j35 = (j19 * j18) + (j12 * j25) + (j26 * j11) + (j6 * j32) + (j5 * j33);
        long j36 = (j19 * j25) + (j26 * j18) + (j12 * j32) + (j11 * j33);
        long j37 = (j26 * j25) + (j19 * j32) + (j18 * j33);
        long j38 = (j26 * j28) + (j29 * j25) + (j22 * j32) + (j21 * j33);
        long j39 = (j25 * j33) + (j26 * j32);
        R(new long[]{j4, j7, j10, j13, j17, j20, j24, j27, j31, j34, j35 + j35 + (j15 * j21) + (j22 * j14) + (j9 * j28) + (j29 * j8), (j19 * j21) + (j22 * j18) + (j15 * j25) + (j26 * j14) + (j12 * j28) + (j29 * j11) + (j9 * j32) + (j8 * j33), j36 + j36 + (j22 * j21) + (j15 * j28) + (j29 * j14), (j22 * j25) + (j26 * j21) + (j19 * j28) + (j29 * j18) + (j15 * j32) + (j14 * j33), j37 + j37 + (j22 * j28) + (j29 * j21), j38, j39 + j39 + (j29 * j28), (j28 * j33) + (j29 * j32), (j33 + j33) * j32}, jArr);
    }

    public static boolean a(File file, Resources resources, int i2) throws Throwable {
        InputStream inputStreamOpenRawResource;
        try {
            inputStreamOpenRawResource = resources.openRawResource(i2);
            try {
                boolean zB = b(file, inputStreamOpenRawResource);
                if (inputStreamOpenRawResource != null) {
                    try {
                        inputStreamOpenRawResource.close();
                    } catch (IOException unused) {
                    }
                }
                return zB;
            } catch (Throwable th) {
                th = th;
                if (inputStreamOpenRawResource != null) {
                    try {
                        inputStreamOpenRawResource.close();
                    } catch (IOException unused2) {
                    }
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            inputStreamOpenRawResource = null;
        }
    }

    public static double a0(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[4];
        byteBuffer.get(bArr);
        return ((double) (((((bArr[0] << 24) & (-16777216)) | ((bArr[1] << 16) & 16711680)) | (65280 & (bArr[2] << 8))) | (bArr[3] & 255))) / 1.073741824E9d;
    }

    public static boolean b(File file, InputStream inputStream) throws Throwable {
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        FileOutputStream fileOutputStream = null;
        try {
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(file, false);
                try {
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int i2 = inputStream.read(bArr);
                        if (i2 != -1) {
                            fileOutputStream2.write(bArr, 0, i2);
                        } else {
                            try {
                                break;
                            } catch (IOException unused) {
                            }
                        }
                    }
                    fileOutputStream2.close();
                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                    return true;
                } catch (IOException e2) {
                    e = e2;
                    fileOutputStream = fileOutputStream2;
                    Log.e("TypefaceCompatUtil", "Error copying resource contents to temp file: " + e.getMessage());
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException unused2) {
                        }
                    }
                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                    return false;
                } catch (Throwable th) {
                    th = th;
                    fileOutputStream = fileOutputStream2;
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException unused3) {
                        }
                    }
                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                    throw th;
                }
            } catch (IOException e3) {
                e = e3;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static void b0(String str, String str2, Throwable th) {
        synchronized (q) {
            Log.e(str, e0(str2, th));
        }
    }

    public static boolean c(File file) {
        if (!file.isDirectory()) {
            file.delete();
            return true;
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            return false;
        }
        boolean z = true;
        for (File file2 : fileArrListFiles) {
            z = c(file2) && z;
        }
        return z;
    }

    public static void c0(long[] jArr, long[] jArr2) {
        long j2 = jArr2[0];
        long j3 = j2 * j2;
        long j4 = jArr2[1];
        long j5 = (j2 + j2) * j4;
        long j6 = jArr2[2];
        long j7 = (j2 * j6) + (j4 * j4);
        long j8 = jArr2[3];
        long j9 = (j2 * j8) + (j4 * j6);
        long j10 = jArr2[4];
        long j11 = (j6 * j6) + (j4 * 4 * j8) + ((j2 + j2) * j10);
        long j12 = jArr2[5];
        long j13 = (j6 * j8) + (j4 * j10) + (j2 * j12);
        long j14 = jArr2[6];
        long j15 = (j8 * j8) + (j6 * j10) + (j2 * j14) + ((j4 + j4) * j12);
        long j16 = jArr2[7];
        long j17 = (j8 * j10) + (j6 * j12) + (j4 * j14) + (j2 * j16);
        long j18 = jArr2[8];
        long j19 = (j8 * j12) + (j4 * j16);
        long j20 = j19 + j19 + (j6 * j14) + (j2 * j18);
        long j21 = j20 + j20 + (j10 * j10);
        long j22 = jArr2[9];
        long j23 = (j10 * j12) + (j8 * j14) + (j6 * j16) + (j4 * j18) + (j2 * j22);
        long j24 = (j4 * j22) + (j8 * j16);
        long j25 = j24 + j24 + (j12 * j12) + (j10 * j14) + (j6 * j18);
        long j26 = (j12 * j14) + (j10 * j16) + (j8 * j18) + (j6 * j22);
        long j27 = (j8 * j22) + (j12 * j16);
        long j28 = j27 + j27 + (j10 * j18);
        long j29 = j28 + j28 + (j14 * j14);
        long j30 = (j14 * j16) + (j12 * j18) + (j10 * j22);
        long j31 = (j16 * j16) + (j14 * j18) + ((j12 + j12) * j22);
        long j32 = (j14 * j22) + (j16 * j18);
        R(new long[]{j3, j5, j7 + j7, j9 + j9, j11, j13 + j13, j15 + j15, j17 + j17, j21, j23 + j23, j25 + j25, j26 + j26, j29, j30 + j30, j31 + j31, j32 + j32, (j16 * 4 * j22) + (j18 * j18), (j18 + j18) * j22, (j22 + j22) * j22}, jArr);
    }

    public static boolean d(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static Cursor d0(SQLiteDatabase sQLiteDatabase, int i2) {
        String[] strArr = {"value"};
        String[] strArr2 = new String[1];
        if (i2 == 0) {
            strArr2[0] = "failed_requests";
        } else if (i2 == 1) {
            strArr2[0] = "total_requests";
        } else if (i2 != 2) {
            strArr2[0] = "completed_requests";
        } else {
            strArr2[0] = "last_successful_request_time";
        }
        return sQLiteDatabase.query("offline_signal_statistics", strArr, "statistic_name = ?", strArr2, null, null, null);
    }

    public static final Object e(lz lzVar, long j2, gl glVar) {
        while (true) {
            if (lzVar.c >= j2 && !lzVar.c()) {
                return lzVar;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = bb.a;
            Object obj = atomicReferenceFieldUpdater.get(lzVar);
            xo2 xo2Var = a;
            if (obj == xo2Var) {
                return xo2Var;
            }
            lz lzVar2 = (lz) ((bb) obj);
            if (lzVar2 == null) {
                lzVar2 = (lz) glVar.f(Long.valueOf(lzVar.c + 1), lzVar);
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(lzVar, null, lzVar2)) {
                        if (lzVar.c()) {
                            lzVar.d();
                        }
                    }
                } while (atomicReferenceFieldUpdater.get(lzVar) == null);
            }
            lzVar = lzVar2;
        }
    }

    public static String e0(String str, Throwable th) {
        String strReplace;
        if (th != null) {
            synchronized (q) {
                Throwable cause = th;
                while (true) {
                    if (cause == null) {
                        strReplace = Log.getStackTraceString(th).trim().replace("\t", "    ");
                        break;
                    }
                    try {
                        if (cause instanceof UnknownHostException) {
                            strReplace = "UnknownHostException (no network)";
                            break;
                        }
                        cause = cause.getCause();
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        } else {
            strReplace = null;
        }
        if (TextUtils.isEmpty(strReplace)) {
            return str;
        }
        String strReplace2 = strReplace.replace("\n", "\n  ");
        int length = str.length();
        return ec.o(new StringBuilder(String.valueOf(strReplace2).length() + length + 3 + 1), str, "\n  ", strReplace2, "\n");
    }

    public static final ic f(ic icVar, ic icVar2, boolean z) {
        Boolean bool = Boolean.FALSE;
        int i2 = 2;
        boolean zBooleanValue = ((Boolean) icVar.b(bool, new ga(i2))).booleanValue();
        boolean zBooleanValue2 = ((Boolean) icVar2.b(bool, new ga(i2))).booleanValue();
        if (!zBooleanValue && !zBooleanValue2) {
            return icVar.e(icVar2);
        }
        ga gaVar = new ga(3);
        jh jhVar = jh.f;
        ic icVar3 = (ic) icVar.b(jhVar, gaVar);
        Object objB = icVar2;
        if (zBooleanValue2) {
            objB = icVar2.b(jhVar, new ga(4));
        }
        return icVar3.e((ic) objB);
    }

    public static long[] f0(byte[] bArr) {
        long[] jArr = new long[10];
        for (int i2 = 0; i2 < 10; i2++) {
            int i3 = t[i2];
            int i4 = bArr[i3] & 255;
            int i5 = bArr[i3 + 1] & 255;
            long j2 = ((long) i4) | (((long) i5) << 8);
            jArr[i2] = (((j2 | (((long) (bArr[i3 + 2] & 255)) << 16)) | (((long) (bArr[i3 + 3] & 255)) << 24)) >> u[i2]) & ((long) v[i2 & 1]);
        }
        return jArr;
    }

    public static File g(Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            return null;
        }
        String str = ".font" + Process.myPid() + "-" + Process.myTid() + "-";
        for (int i2 = 0; i2 < 100; i2++) {
            File file = new File(cacheDir, str + i2);
            try {
                if (file.createNewFile()) {
                    return file;
                }
            } catch (IOException unused) {
            }
        }
        return null;
    }

    public static void g0(SQLiteDatabase sQLiteDatabase, String str) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("value", (Integer) 0);
        sQLiteDatabase.update("offline_signal_statistics", contentValues, "statistic_name = ?", new String[]{str});
    }

    public static yb h(yb ybVar) {
        ybVar.getClass();
        ac acVar = ybVar instanceof ac ? (ac) ybVar : null;
        if (acVar == null || (ybVar = acVar.h) != null) {
            return ybVar;
        }
        lc lcVar = (lc) acVar.getContext().f(ig.g);
        yb ffVar = lcVar != null ? new ff(lcVar, acVar) : acVar;
        acVar.h = ffVar;
        return ffVar;
    }

    public static byte[] h0(long[] jArr) {
        long j2;
        int[] iArr;
        int i2;
        int[] iArr2;
        long[] jArrCopyOf = Arrays.copyOf(jArr, 10);
        int i3 = 0;
        int i4 = 0;
        while (true) {
            j2 = 19;
            iArr = w;
            if (i4 >= 2) {
                break;
            }
            int i5 = 0;
            while (i5 < 9) {
                long j3 = jArrCopyOf[i5];
                int i6 = iArr[i5 & 1];
                int i7 = -((int) (((j3 >> 31) & j3) >> i6));
                jArrCopyOf[i5] = j3 + ((long) (i7 << i6));
                i5++;
                jArrCopyOf[i5] = jArrCopyOf[i5] - ((long) i7);
            }
            long j4 = jArrCopyOf[9];
            int i8 = -((int) (((j4 >> 31) & j4) >> 25));
            jArrCopyOf[9] = j4 + ((long) (i8 << 25));
            jArrCopyOf[0] = jArrCopyOf[0] - (((long) i8) * 19);
            i4++;
        }
        long j5 = jArrCopyOf[0];
        int i9 = -((int) (((j5 >> 31) & j5) >> 26));
        jArrCopyOf[0] = j5 + ((long) (i9 << 26));
        jArrCopyOf[1] = jArrCopyOf[1] - ((long) i9);
        int i10 = 0;
        while (true) {
            iArr2 = v;
            if (i10 >= 2) {
                break;
            }
            int i11 = i3;
            while (i11 < 9) {
                long j6 = jArrCopyOf[i11];
                int i12 = i11 & 1;
                int i13 = i3;
                long j7 = j6 >> iArr[i12];
                jArrCopyOf[i11] = ((long) iArr2[i12]) & j6;
                i11++;
                jArrCopyOf[i11] = jArrCopyOf[i11] + ((long) ((int) j7));
                i3 = i13;
                i10 = i10;
                j2 = j2;
            }
            i10++;
        }
        int i14 = i3;
        long j8 = jArrCopyOf[9];
        jArrCopyOf[9] = j8 & 33554431;
        long j9 = (((long) ((int) (j8 >> 25))) * j2) + jArrCopyOf[i14];
        jArrCopyOf[i14] = j9;
        int i15 = ~((((int) j9) - 67108845) >> 31);
        for (int i16 = 1; i16 < 10; i16++) {
            int i17 = ~(((int) jArrCopyOf[i16]) ^ iArr2[i16 & 1]);
            int i18 = i17 & (i17 << 16);
            int i19 = i18 & (i18 << 8);
            int i20 = i19 & (i19 << 4);
            int i21 = i20 & (i20 << 2);
            i15 &= (i21 & (i21 + i21)) >> 31;
        }
        jArrCopyOf[i14] = jArrCopyOf[i14] - ((long) (67108845 & i15));
        long j10 = 33554431 & i15;
        jArrCopyOf[1] = jArrCopyOf[1] - j10;
        for (i2 = 2; i2 < 10; i2 += 2) {
            jArrCopyOf[i2] = jArrCopyOf[i2] - ((long) (67108863 & i15));
            int i22 = i2 + 1;
            jArrCopyOf[i22] = jArrCopyOf[i22] - j10;
        }
        for (int i23 = i14; i23 < 10; i23++) {
            jArrCopyOf[i23] = jArrCopyOf[i23] << u[i23];
        }
        byte[] bArr = new byte[32];
        for (int i24 = i14; i24 < 10; i24++) {
            int i25 = t[i24];
            long j11 = bArr[i25];
            long j12 = jArrCopyOf[i24];
            bArr[i25] = (byte) (j11 | (j12 & 255));
            int i26 = i25 + 1;
            bArr[i26] = (byte) (((long) bArr[i26]) | ((j12 >> 8) & 255));
            int i27 = i25 + 2;
            bArr[i27] = (byte) (((long) bArr[i27]) | ((j12 >> 16) & 255));
            int i28 = i25 + 3;
            bArr[i28] = (byte) (((long) bArr[i28]) | ((j12 >> 24) & 255));
        }
        return bArr;
    }

    public static MappedByteBuffer i(Context context, Uri uri) {
        try {
            ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "r", null);
            if (parcelFileDescriptorOpenFileDescriptor == null) {
                if (parcelFileDescriptorOpenFileDescriptor != null) {
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return null;
                }
                return null;
            }
            try {
                FileInputStream fileInputStream = new FileInputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
                try {
                    FileChannel channel = fileInputStream.getChannel();
                    MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                    fileInputStream.close();
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return map;
                } catch (Throwable th) {
                    try {
                        fileInputStream.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            } catch (Throwable th3) {
                try {
                    parcelFileDescriptorOpenFileDescriptor.close();
                    throw th3;
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                    throw th3;
                }
            }
        } catch (IOException unused) {
        }
    }

    public static void i0(SQLiteDatabase sQLiteDatabase, String str) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("statistic_name", str);
        contentValues.put("value", (Integer) 0);
        sQLiteDatabase.insert("offline_signal_statistics", null, contentValues);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [ac] */
    /* JADX WARN: Type inference failed for: r2v1, types: [sc] */
    /* JADX WARN: Type inference failed for: r2v2, types: [sc] */
    public static final i50 l(ac acVar, ic icVar, Object obj) {
        i50 i50Var = null;
        if (acVar != 0 && icVar.f(j50.f) != null) {
            while (!(acVar instanceof gf) && (acVar = acVar.c()) != 0) {
                if (acVar instanceof i50) {
                    i50Var = (i50) acVar;
                    break;
                }
            }
            if (i50Var != null) {
                i50Var.Q(icVar, obj);
            }
        }
        return i50Var;
    }

    public static void m(Parcel parcel, int i2, Bundle bundle) {
        if (bundle == null) {
            return;
        }
        int iW = w(parcel, i2);
        parcel.writeBundle(bundle);
        J(parcel, iW);
    }

    public static void n(Parcel parcel, int i2, byte[] bArr) {
        if (bArr == null) {
            return;
        }
        int iW = w(parcel, i2);
        parcel.writeByteArray(bArr);
        J(parcel, iW);
    }

    public static void o(Parcel parcel, int i2, IBinder iBinder) {
        if (iBinder == null) {
            return;
        }
        int iW = w(parcel, i2);
        parcel.writeStrongBinder(iBinder);
        J(parcel, iW);
    }

    public static void p(Parcel parcel, int i2, Parcelable parcelable, int i3) {
        if (parcelable == null) {
            return;
        }
        int iW = w(parcel, i2);
        parcelable.writeToParcel(parcel, i3);
        J(parcel, iW);
    }

    public static void q(Parcel parcel, int i2, String str) {
        if (str == null) {
            return;
        }
        int iW = w(parcel, i2);
        parcel.writeString(str);
        J(parcel, iW);
    }

    public static void r(Parcel parcel, int i2, String[] strArr) {
        if (strArr == null) {
            return;
        }
        int iW = w(parcel, i2);
        parcel.writeStringArray(strArr);
        J(parcel, iW);
    }

    public static void s(Parcel parcel, int i2, List list) {
        if (list == null) {
            return;
        }
        int iW = w(parcel, i2);
        parcel.writeStringList(list);
        J(parcel, iW);
    }

    public static void t(Parcel parcel, int i2, Parcelable[] parcelableArr, int i3) {
        if (parcelableArr == null) {
            return;
        }
        int iW = w(parcel, i2);
        parcel.writeInt(parcelableArr.length);
        for (Parcelable parcelable : parcelableArr) {
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                int iDataPosition = parcel.dataPosition();
                parcel.writeInt(1);
                int iDataPosition2 = parcel.dataPosition();
                parcelable.writeToParcel(parcel, i3);
                int iDataPosition3 = parcel.dataPosition();
                parcel.setDataPosition(iDataPosition);
                parcel.writeInt(iDataPosition3 - iDataPosition2);
                parcel.setDataPosition(iDataPosition3);
            }
        }
        J(parcel, iW);
    }

    public static void u(Parcel parcel, int i2, List list) {
        if (list == null) {
            return;
        }
        int iW = w(parcel, i2);
        int size = list.size();
        parcel.writeInt(size);
        for (int i3 = 0; i3 < size; i3++) {
            Parcelable parcelable = (Parcelable) list.get(i3);
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                int iDataPosition = parcel.dataPosition();
                parcel.writeInt(1);
                int iDataPosition2 = parcel.dataPosition();
                parcelable.writeToParcel(parcel, 0);
                int iDataPosition3 = parcel.dataPosition();
                parcel.setDataPosition(iDataPosition);
                parcel.writeInt(iDataPosition3 - iDataPosition2);
                parcel.setDataPosition(iDataPosition3);
            }
        }
        J(parcel, iW);
    }

    public static int v(int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        if ((i2 & (-2097152)) != -2097152 || (i3 = (i2 >>> 19) & 3) == 1 || (i4 = (i2 >>> 17) & 3) == 0 || (i5 = (i2 >>> 12) & 15) == 0 || i5 == 15 || (i6 = (i2 >>> 10) & 3) == 3) {
            return -1;
        }
        int i8 = i5 - 1;
        int i9 = j[i6];
        if (i3 == 2) {
            i9 /= 2;
        } else if (i3 == 0) {
            i9 /= 4;
        }
        int i10 = (i2 >>> 9) & 1;
        if (i4 == 3) {
            return ((((i3 == 3 ? k[i8] : l[i8]) * 12) / i9) + i10) * 4;
        }
        if (i3 == 3) {
            i7 = i4 == 2 ? m[i8] : n[i8];
        } else {
            i7 = o[i8];
        }
        if (i3 == 3) {
            return ((i7 * 144) / i9) + i10;
        }
        return (((i4 == 1 ? 72 : 144) * i7) / i9) + i10;
    }

    public static int w(Parcel parcel, int i2) {
        parcel.writeInt(i2 | (-65536));
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    public static long x(ByteBuffer byteBuffer) {
        long j2 = byteBuffer.getInt();
        return j2 < 0 ? j2 + 4294967296L : j2;
    }

    public static Object y(int i2) {
        if (i2 < 2 || i2 > 1073741824 || Integer.highestOneBit(i2) != i2) {
            j7.p(ec.j(new StringBuilder(String.valueOf(i2).length() + 41), "must be power of 2 between 2^1 and 2^30: ", i2));
            return null;
        }
        if (i2 <= 256) {
            return new byte[i2];
        }
        return i2 <= 65536 ? new short[i2] : new int[i2];
    }

    public static cb2 z(Context context, ct0 ct0Var, String str, String str2, ga2 ga2Var) {
        cb2 cb2Var;
        la2 la2Var = new la2(context, ct0Var, str, str2, ga2Var);
        try {
            cb2Var = (cb2) la2Var.j.poll(50000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e2) {
            la2Var.b(2009, la2Var.m, e2);
            cb2Var = null;
        }
        la2Var.b(3004, la2Var.m, null);
        if (cb2Var != null) {
            if (cb2Var.h == 7) {
                ga2.e = 3;
            } else {
                ga2.e = 2;
            }
        }
        return cb2Var == null ? new cb2() : cb2Var;
    }

    public abstract void j(Throwable th);

    public abstract void k(u40 u40Var);
}
