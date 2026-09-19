package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.hardware.display.DisplayManager;
import android.media.MediaFormat;
import android.os.BadParcelableException;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Pair;
import android.util.TypedValue;
import android.view.Display;
import android.view.View;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.List;
import java.util.concurrent.Executor;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: loaded from: classes.dex */
public abstract class ar implements qd0 {
    public static final i9 f = new i9();
    public static final gm g = new gm();
    public static final int[] h = {2002, 2000, 1920, 1601, 1600, 1001, 1000, 960, 800, 800, 480, 400, 400, 2048};
    public static final tt0 i = new tt0(12);
    public static final xn1 j = new xn1(8);
    public static final ei k;
    public static final ei[] l;
    public static final l32 m;
    public static final String[] n;
    public static final /* synthetic */ int o = 0;

    static {
        ei eiVar = new ei("app_set_id");
        k = eiVar;
        l = new ei[]{eiVar};
        m = new l32(9);
        n = new String[]{"GmsCore_OpenSSL", "AndroidOpenSSL", "Conscrypt"};
    }

    public static void A(boolean z) {
        if (!z) {
            throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
        }
    }

    public static final ResolveInfo B(Intent intent, ArrayList arrayList, Context context) {
        ResolveInfo resolveInfo = null;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                return null;
            }
            List<ResolveInfo> listQueryIntentActivities = packageManager.queryIntentActivities(intent, 65536);
            ResolveInfo resolveInfoResolveActivity = packageManager.resolveActivity(intent, 65536);
            if (listQueryIntentActivities != null && resolveInfoResolveActivity != null) {
                for (int i2 = 0; i2 < listQueryIntentActivities.size(); i2++) {
                    if (resolveInfoResolveActivity.activityInfo.name.equals(listQueryIntentActivities.get(i2).activityInfo.name)) {
                        resolveInfo = resolveInfoResolveActivity;
                        break;
                    }
                }
            }
            arrayList.addAll(listQueryIntentActivities);
            return resolveInfo;
        } catch (Throwable th) {
            vc3.C.h.d("OpenSystemBrowserHandler.getDefaultBrowserResolverForIntent", th);
            return resolveInfo;
        }
    }

    public static void C(int i2, cw1 cw1Var) {
        cw1Var.y(7);
        byte[] bArr = cw1Var.a;
        bArr[0] = -84;
        bArr[1] = 64;
        bArr[2] = -1;
        bArr[3] = -1;
        bArr[4] = (byte) ((i2 >> 16) & 255);
        bArr[5] = (byte) ((i2 >> 8) & 255);
        bArr[6] = (byte) (i2 & 255);
    }

    public static final Intent D(Intent intent, ResolveInfo resolveInfo) {
        Intent intent2 = new Intent(intent);
        ActivityInfo activityInfo = resolveInfo.activityInfo;
        intent2.setClassName(activityInfo.packageName, activityInfo.name);
        return intent2;
    }

    public static void E(oe0 oe0Var, xc0 xc0Var) throws no0 {
        int iR = oe0Var.r(5);
        oe0Var.o(2);
        if (oe0Var.q()) {
            oe0Var.o(5);
        }
        if (iR >= 7 && iR <= 10) {
            oe0Var.m();
        }
        if (oe0Var.q()) {
            int iR2 = oe0Var.r(3);
            if (xc0Var.b == -1 && iR >= 0 && iR <= 15 && (iR2 == 0 || iR2 == 1)) {
                xc0Var.b = iR;
            }
            if (oe0Var.q()) {
                I(oe0Var);
            }
        }
    }

    public static Pair F(RandomAccessFile randomAccessFile, int i2) throws IOException {
        int i3;
        long length = randomAccessFile.length();
        if (length < 22) {
            return null;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(((int) Math.min(i2, (-22) + length)) + 22);
        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
        long jCapacity = length - ((long) byteBufferAllocate.capacity());
        randomAccessFile.seek(jCapacity);
        randomAccessFile.readFully(byteBufferAllocate.array(), byteBufferAllocate.arrayOffset(), byteBufferAllocate.capacity());
        H(byteBufferAllocate);
        int iCapacity = byteBufferAllocate.capacity();
        if (iCapacity >= 22) {
            int i4 = iCapacity - 22;
            int iMin = Math.min(i4, 65535);
            int i5 = 0;
            while (true) {
                if (i5 >= iMin) {
                    i3 = -1;
                    break;
                }
                i3 = i4 - i5;
                if (byteBufferAllocate.getInt(i3) == 101010256 && ((char) byteBufferAllocate.getShort(i3 + 20)) == i5) {
                    break;
                }
                i5++;
            }
        } else {
            i3 = -1;
            break;
        }
        if (i3 == -1) {
            return null;
        }
        byteBufferAllocate.position(i3);
        ByteBuffer byteBufferSlice = byteBufferAllocate.slice();
        byteBufferSlice.order(ByteOrder.LITTLE_ENDIAN);
        return Pair.create(byteBufferSlice, Long.valueOf(jCapacity + ((long) i3)));
    }

    public static void G(oe0 oe0Var, xc0 xc0Var) throws no0 {
        oe0Var.o(2);
        boolean zQ = oe0Var.q();
        int iR = oe0Var.r(8);
        for (int i2 = 0; i2 < iR; i2++) {
            oe0Var.o(2);
            if (oe0Var.q()) {
                oe0Var.o(5);
            }
            if (zQ) {
                oe0Var.o(24);
            } else {
                if (oe0Var.q()) {
                    if (!oe0Var.q()) {
                        oe0Var.o(4);
                    }
                    xc0Var.c = oe0Var.r(6) + 1;
                }
                oe0Var.o(4);
            }
        }
        if (oe0Var.q()) {
            oe0Var.o(3);
            if (oe0Var.q()) {
                I(oe0Var);
            }
        }
    }

    public static void H(ByteBuffer byteBuffer) {
        if (byteBuffer.order() == ByteOrder.LITTLE_ENDIAN) {
            return;
        }
        j7.p("ByteBuffer byte order must be little endian");
    }

    public static void I(oe0 oe0Var) throws no0 {
        int iR = oe0Var.r(6);
        if (iR < 2 || iR > 42) {
            throw no0.b(String.format("Invalid language tag bytes number: %d. Must be between 2 and 42.", Integer.valueOf(iR)));
        }
        oe0Var.o(iR * 8);
    }

    public static void b(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static long c(InputStream inputStream, OutputStream outputStream, boolean z) {
        byte[] bArr = new byte[1024];
        long j2 = 0;
        while (true) {
            try {
                int i2 = inputStream.read(bArr, 0, 1024);
                if (i2 == -1) {
                    break;
                }
                j2 += (long) i2;
                outputStream.write(bArr, 0, i2);
            } catch (Throwable th) {
                if (z) {
                    b(inputStream);
                    b(outputStream);
                }
                throw th;
            }
        }
        if (z) {
            b(inputStream);
            b(outputStream);
        }
        return j2;
    }

    public static final rx d(Throwable th) {
        th.getClass();
        return new rx(th);
    }

    public static um0 e(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i2) {
        um0 um0VarD;
        String attributeValue = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str);
        Object obj = null;
        int i3 = 0;
        if (attributeValue != null) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i2, typedValue);
            int i4 = typedValue.type;
            if (i4 >= 28 && i4 <= 31) {
                return new um0(obj, typedValue.data, obj);
            }
            try {
                um0VarD = um0.d(typedArray.getResources(), typedArray.getResourceId(i2, 0), theme);
            } catch (Exception e) {
                Log.e("ComplexColorCompat", "Failed to inflate ComplexColor.", e);
                um0VarD = null;
            }
            if (um0VarD != null) {
                return um0VarD;
            }
        }
        return new um0(obj, i3, obj);
    }

    public static boolean f(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null;
    }

    public static final int g(n7 n7Var, Object obj, int i2) {
        int i3 = n7Var.h;
        if (i3 == 0) {
            return -1;
        }
        try {
            int iC = rs0.c(i3, i2, n7Var.f);
            if (iC < 0 || jn.b(obj, n7Var.g[iC])) {
                return iC;
            }
            int i4 = iC + 1;
            while (i4 < i3 && n7Var.f[i4] == i2) {
                if (jn.b(obj, n7Var.g[i4])) {
                    return i4;
                }
                i4++;
            }
            for (int i5 = iC - 1; i5 >= 0 && n7Var.f[i5] == i2; i5--) {
                if (jn.b(obj, n7Var.g[i5])) {
                    return i5;
                }
            }
            return ~i4;
        } catch (IndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public static void h(PackageInfo packageInfo, File file) {
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat")));
            try {
                dataOutputStream.writeLong(packageInfo.lastUpdateTime);
                dataOutputStream.close();
            } catch (Throwable th) {
                try {
                    dataOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException unused) {
        }
    }

    public static TypedArray i(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    public static ic j(ic icVar, ic icVar2) {
        icVar2.getClass();
        return icVar2 == jh.f ? icVar : (ic) icVar2.b(icVar, new ga(1));
    }

    public static ms k(MappedByteBuffer mappedByteBuffer) throws IOException {
        long j2;
        ByteBuffer byteBufferDuplicate = mappedByteBuffer.duplicate();
        byteBufferDuplicate.order(ByteOrder.BIG_ENDIAN);
        byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
        int i2 = byteBufferDuplicate.getShort() & 65535;
        if (i2 > 100) {
            throw new IOException("Cannot read metadata.");
        }
        byteBufferDuplicate.position(byteBufferDuplicate.position() + 6);
        int i3 = 0;
        while (true) {
            if (i3 >= i2) {
                j2 = -1;
                break;
            }
            int i4 = byteBufferDuplicate.getInt();
            byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
            j2 = ((long) byteBufferDuplicate.getInt()) & 4294967295L;
            byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
            if (1835365473 == i4) {
                break;
            }
            i3++;
        }
        if (j2 != -1) {
            byteBufferDuplicate.position(byteBufferDuplicate.position() + ((int) (j2 - ((long) byteBufferDuplicate.position()))));
            byteBufferDuplicate.position(byteBufferDuplicate.position() + 12);
            long j3 = ((long) byteBufferDuplicate.getInt()) & 4294967295L;
            for (int i5 = 0; i5 < j3; i5++) {
                int i6 = byteBufferDuplicate.getInt();
                long j4 = ((long) byteBufferDuplicate.getInt()) & 4294967295L;
                byteBufferDuplicate.getInt();
                if (1164798569 == i6 || 1701669481 == i6) {
                    byteBufferDuplicate.position((int) (j4 + j2));
                    ms msVar = new ms();
                    byteBufferDuplicate.order(ByteOrder.LITTLE_ENDIAN);
                    int iPosition = byteBufferDuplicate.position() + byteBufferDuplicate.getInt(byteBufferDuplicate.position());
                    msVar.d = byteBufferDuplicate;
                    msVar.a = iPosition;
                    int i7 = iPosition - byteBufferDuplicate.getInt(iPosition);
                    msVar.b = i7;
                    msVar.c = ((ByteBuffer) msVar.d).getShort(i7);
                    return msVar;
                }
            }
        }
        throw new IOException("Cannot read metadata.");
    }

    public static final void m(z8 z8Var, yb ybVar, boolean z) {
        Object obj = z8.l.get(z8Var);
        Throwable thF = z8Var.f(obj);
        Object rxVar = thF != null ? new rx(thF) : z8Var.h(obj);
        if (!z) {
            ybVar.d(rxVar);
            return;
        }
        ybVar.getClass();
        ff ffVar = (ff) ybVar;
        ac acVar = ffVar.j;
        Object obj2 = ffVar.l;
        ic context = acVar.getContext();
        Object objS = dq.s(context, obj2);
        i50 i50VarL = objS != dq.m ? s90.l(acVar, context, objS) : null;
        try {
            acVar.d(rxVar);
        } finally {
            if (i50VarL == null || i50VarL.P()) {
                dq.o(context, objS);
            }
        }
    }

    public static final void n(Object obj) {
        if (obj instanceof rx) {
            throw ((rx) obj).f;
        }
    }

    public static Bundle o(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        bundle.setClassLoader(ar.class.getClassLoader());
        try {
            bundle.isEmpty();
            return bundle;
        } catch (BadParcelableException unused) {
            Log.e("MediaSessionCompat", "Could not unparcel the data.");
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:107:0x018c A[Catch: all -> 0x0189, TRY_ENTER, TryCatch #24 {all -> 0x0189, blocks: (B:94:0x0168, B:96:0x0174, B:107:0x018c, B:108:0x0191), top: B:280:0x0168, outer: #34 }] */
    /* JADX WARN: Code duplicated, block: B:114:0x019b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:115:0x019d A[Catch: IllegalStateException -> 0x0183, IOException -> 0x0185, FileNotFoundException -> 0x0187, TRY_LEAVE, TryCatch #34 {FileNotFoundException -> 0x0187, IOException -> 0x0185, IllegalStateException -> 0x0183, blocks: (B:92:0x0160, B:97:0x017e, B:115:0x019d, B:113:0x019a, B:112:0x0197, B:94:0x0168, B:96:0x0174, B:107:0x018c, B:108:0x0191, B:109:0x0192), top: B:299:0x0160, inners: #24, #33 }] */
    /* JADX WARN: Code duplicated, block: B:122:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:132:0x01d6 A[Catch: all -> 0x01e4, TRY_LEAVE, TryCatch #3 {all -> 0x01e4, blocks: (B:130:0x01ca, B:132:0x01d6, B:141:0x01e7), top: B:256:0x01ca, outer: #37 }] */
    /* JADX WARN: Code duplicated, block: B:141:0x01e7 A[Catch: all -> 0x01e4, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x01e4, blocks: (B:130:0x01ca, B:132:0x01d6, B:141:0x01e7), top: B:256:0x01ca, outer: #37 }] */
    /* JADX WARN: Code duplicated, block: B:152:0x0204  */
    /* JADX WARN: Code duplicated, block: B:156:0x020c  */
    /* JADX WARN: Code duplicated, block: B:157:0x0210  */
    /* JADX WARN: Code duplicated, block: B:166:0x0230 A[Catch: all -> 0x026e, TryCatch #12 {all -> 0x026e, blocks: (B:164:0x022a, B:166:0x0230, B:167:0x0234, B:169:0x023a), top: B:266:0x022a }] */
    /* JADX WARN: Code duplicated, block: B:169:0x023a A[Catch: all -> 0x026e, TRY_LEAVE, TryCatch #12 {all -> 0x026e, blocks: (B:164:0x022a, B:166:0x0230, B:167:0x0234, B:169:0x023a), top: B:266:0x022a }] */
    /* JADX WARN: Code duplicated, block: B:235:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:239:0x02c9  */
    /* JADX WARN: Code duplicated, block: B:246:0x02d7  */
    /* JADX WARN: Code duplicated, block: B:266:0x022a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:272:0x0105 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:280:0x0168 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:296:0x0214 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:297:0x01c5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:300:0x023f A[EDGE_INSN: B:300:0x023f->B:171:0x023f BREAK  A[LOOP:0: B:167:0x0234->B:301:?], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:55:0x010f A[Catch: all -> 0x0122, IllegalStateException -> 0x0125, IOException -> 0x0127, TRY_LEAVE, TryCatch #17 {IllegalStateException -> 0x0125, blocks: (B:53:0x0105, B:55:0x010f, B:66:0x0129, B:67:0x012e), top: B:272:0x0105, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:66:0x0129 A[Catch: all -> 0x0122, IllegalStateException -> 0x0125, IOException -> 0x0127, TRY_ENTER, TryCatch #17 {IllegalStateException -> 0x0125, blocks: (B:53:0x0105, B:55:0x010f, B:66:0x0129, B:67:0x012e), top: B:272:0x0105, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:96:0x0174 A[Catch: all -> 0x0189, TRY_LEAVE, TryCatch #24 {all -> 0x0189, blocks: (B:94:0x0168, B:96:0x0174, B:107:0x018c, B:108:0x0191), top: B:280:0x0168, outer: #34 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v22, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v23 */
    /* JADX WARN: Type inference failed for: r7v24 */
    /* JADX WARN: Type inference failed for: r7v25 */
    /* JADX WARN: Type inference failed for: r7v26, types: [java.io.ByteArrayOutputStream, java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r7v27, types: [int] */
    /* JADX WARN: Type inference failed for: r7v28 */
    /* JADX WARN: Type inference failed for: r7v29 */
    /* JADX WARN: Type inference failed for: r7v30 */
    /* JADX WARN: Type inference failed for: r7v31 */
    /* JADX WARN: Type inference failed for: r7v32 */
    /* JADX WARN: Type inference failed for: r7v33, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v37 */
    /* JADX WARN: Type inference failed for: r7v38 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v44 */
    /* JADX WARN: Type inference failed for: r7v45 */
    /* JADX WARN: Type inference failed for: r7v46 */
    /* JADX WARN: Type inference failed for: r7v47 */
    /* JADX WARN: Type inference failed for: r7v48 */
    /* JADX WARN: Type inference failed for: r7v49 */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.io.FileInputStream, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r7v50 */
    /* JADX WARN: Type inference failed for: r7v51 */
    /* JADX WARN: Type inference failed for: r7v52 */
    /* JADX WARN: Type inference failed for: r7v53 */
    /* JADX WARN: Type inference failed for: r7v54 */
    /* JADX WARN: Type inference failed for: r7v55 */
    /* JADX WARN: Type inference failed for: r7v56 */
    /* JADX WARN: Type inference failed for: r7v57 */
    /* JADX WARN: Type inference failed for: r7v58 */
    /* JADX WARN: Type inference failed for: r7v59 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v60 */
    /* JADX WARN: Type inference failed for: r7v61 */
    /* JADX WARN: Type inference failed for: r7v62 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v17 */
    public static void p(Context context, Executor executor, aw awVar, boolean z) {
        boolean z2;
        ?? A;
        ye[] yeVarArrI;
        ye[] yeVarArr;
        aw awVar2;
        ye[] yeVarArr2;
        byte[] bArr;
        ?? r7;
        byte[] bArr2;
        ?? r8;
        boolean z3;
        ByteArrayInputStream byteArrayInputStream;
        Throwable th;
        FileOutputStream fileOutputStream;
        Throwable th2;
        FileChannel channel;
        FileLock fileLockTryLock;
        byte[] bArr3;
        int i2;
        ?? r9;
        boolean z4;
        ?? byteArrayOutputStream;
        ?? r10;
        xe xeVar;
        ?? r11;
        FileInputStream fileInputStreamA;
        ?? r12;
        ?? r13;
        boolean z5;
        Context applicationContext = context.getApplicationContext();
        String packageName = applicationContext.getPackageName();
        ApplicationInfo applicationInfo = applicationContext.getApplicationInfo();
        AssetManager assets = applicationContext.getAssets();
        String name = new File(applicationInfo.sourceDir).getName();
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
            File filesDir = context.getFilesDir();
            if (!z) {
                File file = new File(filesDir, "profileinstaller_profileWrittenFor_lastUpdateTime.dat");
                if (file.exists()) {
                    try {
                        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
                        try {
                            long j2 = dataInputStream.readLong();
                            dataInputStream.close();
                            z5 = j2 == packageInfo.lastUpdateTime;
                            if (z5) {
                                awVar.n(2, null);
                            }
                        } catch (Throwable th3) {
                            try {
                                dataInputStream.close();
                                throw th3;
                            } catch (Throwable th4) {
                                th3.addSuppressed(th4);
                                throw th3;
                            }
                        }
                    } catch (IOException unused) {
                        z5 = false;
                    }
                } else {
                    z5 = false;
                }
                if (z5) {
                    Log.d("ProfileInstaller", "Skipping profile installation for " + context.getPackageName());
                    dw.c(context, false);
                    return;
                }
            }
            Log.d("ProfileInstaller", "Installing profile for " + context.getPackageName());
            byte[] bArr4 = w40.g;
            File file2 = new File(new File("/data/misc/profiles/cur/0", packageName), "primary.prof");
            xe xeVar2 = new xe(assets, executor, awVar, name, file2);
            byte[] bArr5 = xeVar2.c;
            if (bArr5 != null) {
                if (!file2.exists()) {
                    try {
                        if (file2.createNewFile()) {
                            xeVar2.f = true;
                            A = xeVar2.a(assets, "dexopt/baseline.prof");
                            if (A != 0) {
                                if (Arrays.equals(bArr4, v51.k(A, 4))) {
                                    throw new IllegalStateException("Invalid magic");
                                }
                                yeVarArrI = w40.I(A, v51.k(A, 4), xeVar2.e);
                                A.close();
                                xeVar2.g = yeVarArrI;
                            }
                            yeVarArr = xeVar2.g;
                            if (yeVarArr != null) {
                                A = "dexopt/baseline.profm";
                                fileInputStreamA = xeVar2.a(assets, "dexopt/baseline.profm");
                                r11 = A;
                                if (fileInputStreamA == null) {
                                    if (fileInputStreamA != null) {
                                        fileInputStreamA.close();
                                        r11 = A;
                                    }
                                    xeVar = null;
                                    A = r11;
                                } else {
                                    if (Arrays.equals(w40.h, v51.k(fileInputStreamA, 4))) {
                                        throw new IllegalStateException("Invalid magic");
                                    }
                                    byte[] bArrK = v51.k(fileInputStreamA, 4);
                                    xeVar2.g = w40.F(fileInputStreamA, bArrK, bArr5, yeVarArr);
                                    fileInputStreamA.close();
                                    xeVar = xeVar2;
                                    A = bArrK;
                                }
                                if (xeVar != null) {
                                    xeVar2 = xeVar;
                                }
                            }
                            awVar2 = xeVar2.b;
                            yeVarArr2 = xeVar2.g;
                            bArr = xeVar2.c;
                            r7 = A;
                            r7 = A;
                            if (yeVarArr2 != null) {
                                byteArrayOutputStream = xeVar2.f;
                                if (byteArrayOutputStream != 0) {
                                    j7.e("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                    return;
                                }
                                byteArrayOutputStream = new ByteArrayOutputStream();
                                byteArrayOutputStream.write(bArr4);
                                byteArrayOutputStream.write(bArr);
                                if (w40.O(byteArrayOutputStream, bArr, yeVarArr2)) {
                                    xeVar2.h = byteArrayOutputStream.toByteArray();
                                    byteArrayOutputStream.close();
                                    r10 = byteArrayOutputStream;
                                    xeVar2.g = null;
                                    r7 = r10;
                                } else {
                                    awVar2.n(5, null);
                                    xeVar2.g = null;
                                    byteArrayOutputStream.close();
                                    r7 = byteArrayOutputStream;
                                }
                            }
                            bArr2 = xeVar2.h;
                            if (bArr2 != null) {
                                if (xeVar2.f) {
                                    j7.e("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                    return;
                                }
                                byteArrayInputStream = new ByteArrayInputStream(bArr2);
                                fileOutputStream = new FileOutputStream(xeVar2.d);
                                channel = fileOutputStream.getChannel();
                                fileLockTryLock = channel.tryLock();
                                if (fileLockTryLock != null) {
                                    if (fileLockTryLock.isValid()) {
                                        bArr3 = new byte[512];
                                        while (true) {
                                            i2 = byteArrayInputStream.read(bArr3);
                                            if (i2 > 0) {
                                                break;
                                                break;
                                            }
                                            fileOutputStream.write(bArr3, 0, i2);
                                        }
                                        r9 = 1;
                                        xeVar2.b(1, null);
                                        fileLockTryLock.close();
                                        channel.close();
                                        fileOutputStream.close();
                                        byteArrayInputStream.close();
                                        xeVar2.h = null;
                                        xeVar2.g = null;
                                        z3 = true;
                                    }
                                }
                                throw new IOException("Unable to acquire a lock on the underlying file channel.");
                            }
                            z3 = false;
                            r9 = 1;
                            if (z3) {
                                h(packageInfo, filesDir);
                            }
                            z4 = z3;
                            r12 = r9;
                        } else {
                            xeVar2.b(4, null);
                        }
                    } catch (IOException unused2) {
                        z2 = true;
                        xeVar2.b(4, null);
                    }
                } else if (file2.canWrite()) {
                    xeVar2.f = true;
                    try {
                        A = xeVar2.a(assets, "dexopt/baseline.prof");
                    } catch (FileNotFoundException e) {
                        awVar.n(6, e);
                        A = 0;
                    } catch (IOException e2) {
                        awVar.n(7, e2);
                        A = 0;
                    }
                    try {
                        if (A != 0) {
                            try {
                                try {
                                    if (Arrays.equals(bArr4, v51.k(A, 4))) {
                                        throw new IllegalStateException("Invalid magic");
                                    }
                                    yeVarArrI = w40.I(A, v51.k(A, 4), xeVar2.e);
                                    try {
                                        A.close();
                                    } catch (IOException e3) {
                                        awVar.n(7, e3);
                                    }
                                    xeVar2.g = yeVarArrI;
                                } catch (IllegalStateException e4) {
                                    awVar.n(8, e4);
                                    try {
                                        A.close();
                                    } catch (IOException e5) {
                                        awVar.n(7, e5);
                                    }
                                    yeVarArrI = null;
                                }
                            } catch (IOException e6) {
                                awVar.n(7, e6);
                                A.close();
                                yeVarArrI = null;
                            }
                        }
                        yeVarArr = xeVar2.g;
                        if (yeVarArr != null && ((A = Build.VERSION.SDK_INT) >= 31 || A == 24 || A == 25)) {
                            try {
                                A = "dexopt/baseline.profm";
                                fileInputStreamA = xeVar2.a(assets, "dexopt/baseline.profm");
                                r11 = A;
                                if (fileInputStreamA == null) {
                                    try {
                                        if (Arrays.equals(w40.h, v51.k(fileInputStreamA, 4))) {
                                            throw new IllegalStateException("Invalid magic");
                                        }
                                        byte[] bArrK2 = v51.k(fileInputStreamA, 4);
                                        xeVar2.g = w40.F(fileInputStreamA, bArrK2, bArr5, yeVarArr);
                                        fileInputStreamA.close();
                                        xeVar = xeVar2;
                                        A = bArrK2;
                                    } catch (Throwable th5) {
                                        try {
                                            fileInputStreamA.close();
                                            throw th5;
                                        } catch (Throwable th6) {
                                            th5.addSuppressed(th6);
                                            throw th5;
                                        }
                                    }
                                } else {
                                    if (fileInputStreamA != null) {
                                        fileInputStreamA.close();
                                        r11 = A;
                                    }
                                    xeVar = null;
                                    A = r11;
                                }
                            } catch (FileNotFoundException e7) {
                                awVar.n(9, e7);
                                r11 = A;
                                xeVar = null;
                                A = r11;
                            } catch (IOException e8) {
                                awVar.n(7, e8);
                                r11 = A;
                                xeVar = null;
                                A = r11;
                            } catch (IllegalStateException e9) {
                                xeVar2.g = null;
                                awVar.n(8, e9);
                                r11 = A;
                                xeVar = null;
                                A = r11;
                            }
                            if (xeVar != null) {
                                xeVar2 = xeVar;
                            }
                        }
                        awVar2 = xeVar2.b;
                        yeVarArr2 = xeVar2.g;
                        bArr = xeVar2.c;
                        r7 = A;
                        r7 = A;
                        if (yeVarArr2 != null && bArr != null) {
                            byteArrayOutputStream = xeVar2.f;
                            if (byteArrayOutputStream != 0) {
                                j7.e("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                return;
                            }
                            try {
                                byteArrayOutputStream = new ByteArrayOutputStream();
                                try {
                                    byteArrayOutputStream.write(bArr4);
                                    byteArrayOutputStream.write(bArr);
                                    if (w40.O(byteArrayOutputStream, bArr, yeVarArr2)) {
                                        awVar2.n(5, null);
                                        xeVar2.g = null;
                                        byteArrayOutputStream.close();
                                        r7 = byteArrayOutputStream;
                                    } else {
                                        xeVar2.h = byteArrayOutputStream.toByteArray();
                                        byteArrayOutputStream.close();
                                        r10 = byteArrayOutputStream;
                                        xeVar2.g = null;
                                        r7 = r10;
                                    }
                                } catch (Throwable th7) {
                                    try {
                                        byteArrayOutputStream.close();
                                        throw th7;
                                    } catch (Throwable th8) {
                                        th7.addSuppressed(th8);
                                        throw th7;
                                    }
                                }
                            } catch (IOException e10) {
                                awVar2.n(7, e10);
                                r10 = byteArrayOutputStream;
                            } catch (IllegalStateException e11) {
                                awVar2.n(8, e11);
                                r10 = byteArrayOutputStream;
                            }
                        }
                        bArr2 = xeVar2.h;
                        if (bArr2 != null) {
                            z3 = false;
                            r9 = 1;
                        } else {
                            try {
                                if (xeVar2.f) {
                                    j7.e("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                    return;
                                }
                                try {
                                    try {
                                        byteArrayInputStream = new ByteArrayInputStream(bArr2);
                                        try {
                                            try {
                                                fileOutputStream = new FileOutputStream(xeVar2.d);
                                                try {
                                                    try {
                                                        channel = fileOutputStream.getChannel();
                                                        try {
                                                            fileLockTryLock = channel.tryLock();
                                                            try {
                                                                try {
                                                                    if (fileLockTryLock != null) {
                                                                        try {
                                                                            if (fileLockTryLock.isValid()) {
                                                                                bArr3 = new byte[512];
                                                                                while (true) {
                                                                                    i2 = byteArrayInputStream.read(bArr3);
                                                                                    if (i2 > 0) {
                                                                                        break;
                                                                                    } else {
                                                                                        fileOutputStream.write(bArr3, 0, i2);
                                                                                    }
                                                                                }
                                                                                r9 = 1;
                                                                                xeVar2.b(1, null);
                                                                                fileLockTryLock.close();
                                                                                channel.close();
                                                                                fileOutputStream.close();
                                                                                byteArrayInputStream.close();
                                                                                xeVar2.h = null;
                                                                                xeVar2.g = null;
                                                                                z3 = true;
                                                                            }
                                                                        } catch (Throwable th9) {
                                                                            th = th9;
                                                                            Throwable th10 = th;
                                                                            if (fileLockTryLock == null) {
                                                                                throw th10;
                                                                            }
                                                                            try {
                                                                                fileLockTryLock.close();
                                                                                throw th10;
                                                                            } catch (Throwable th11) {
                                                                                th10.addSuppressed(th11);
                                                                                throw th10;
                                                                            }
                                                                        }
                                                                    }
                                                                    throw new IOException("Unable to acquire a lock on the underlying file channel.");
                                                                } catch (Throwable th12) {
                                                                    th = th12;
                                                                    Throwable th13 = th;
                                                                    if (channel == null) {
                                                                        throw th13;
                                                                    }
                                                                    try {
                                                                        channel.close();
                                                                        throw th13;
                                                                    } catch (Throwable th14) {
                                                                        th13.addSuppressed(th14);
                                                                        throw th13;
                                                                    }
                                                                }
                                                            } catch (Throwable th15) {
                                                                th = th15;
                                                            }
                                                        } catch (Throwable th16) {
                                                            th = th16;
                                                        }
                                                    } catch (Throwable th17) {
                                                        th = th17;
                                                        th2 = th;
                                                        try {
                                                            fileOutputStream.close();
                                                            throw th2;
                                                        } catch (Throwable th18) {
                                                            th2.addSuppressed(th18);
                                                            throw th2;
                                                        }
                                                    }
                                                } catch (Throwable th19) {
                                                    th = th19;
                                                    th2 = th;
                                                    fileOutputStream.close();
                                                    throw th2;
                                                }
                                            } catch (Throwable th20) {
                                                th = th20;
                                                th = th;
                                                try {
                                                    byteArrayInputStream.close();
                                                    throw th;
                                                } catch (Throwable th21) {
                                                    th.addSuppressed(th21);
                                                    throw th;
                                                }
                                            }
                                        } catch (Throwable th22) {
                                            th = th22;
                                            th = th;
                                            byteArrayInputStream.close();
                                            throw th;
                                        }
                                    } catch (FileNotFoundException e12) {
                                        e = e12;
                                        xeVar2.b(6, e);
                                        r8 = r7;
                                        xeVar2.h = null;
                                        xeVar2.g = null;
                                        z3 = false;
                                        r9 = r8;
                                    } catch (IOException e13) {
                                        e = e13;
                                        xeVar2.b(7, e);
                                        r8 = r7;
                                        xeVar2.h = null;
                                        xeVar2.g = null;
                                        z3 = false;
                                        r9 = r8;
                                    }
                                } catch (FileNotFoundException e14) {
                                    e = e14;
                                    r7 = 1;
                                    xeVar2.b(6, e);
                                    r8 = r7;
                                    xeVar2.h = null;
                                    xeVar2.g = null;
                                    z3 = false;
                                    r9 = r8;
                                } catch (IOException e15) {
                                    e = e15;
                                    r7 = 1;
                                    xeVar2.b(7, e);
                                    r8 = r7;
                                    xeVar2.h = null;
                                    xeVar2.g = null;
                                    z3 = false;
                                    r9 = r8;
                                }
                            } catch (Throwable th23) {
                                xeVar2.h = null;
                                xeVar2.g = null;
                                throw th23;
                            }
                        }
                        if (z3) {
                            h(packageInfo, filesDir);
                        }
                        z4 = z3;
                        r12 = r9;
                    } catch (Throwable th24) {
                        try {
                            A.close();
                            throw th24;
                        } catch (IOException e16) {
                            awVar.n(7, e16);
                            throw th24;
                        }
                    }
                } else {
                    xeVar2.b(4, null);
                }
                if (z4 || !z) {
                    r13 = 0;
                } else {
                    r13 = r12;
                }
                dw.c(context, r13);
            }
            xeVar2.b(3, Integer.valueOf(Build.VERSION.SDK_INT));
            z2 = true;
            z4 = false;
            r12 = z2;
            if (z4) {
                r13 = 0;
            } else {
                r13 = 0;
            }
            dw.c(context, r13);
        } catch (PackageManager.NameNotFoundException e17) {
            awVar.n(7, e17);
            dw.c(context, false);
        }
    }

    public static /* synthetic */ String q(int i2) {
        switch (i2) {
            case 1:
                return "BEGIN_ARRAY";
            case 2:
                return "END_ARRAY";
            case 3:
                return "BEGIN_OBJECT";
            case 4:
                return "END_OBJECT";
            case 5:
                return "NAME";
            case 6:
                return "STRING";
            case 7:
                return "NUMBER";
            case 8:
                return "BOOLEAN";
            case 9:
                return "NULL";
            default:
                return "END_DOCUMENT";
        }
    }

    public static String r(View view) {
        if (!view.isAttachedToWindow()) {
            return "notAttached";
        }
        int visibility = view.getVisibility();
        if (visibility == 8) {
            return "viewGone";
        }
        if (visibility == 4) {
            return "viewInvisible";
        }
        if (visibility != 0) {
            return "viewNotVisible";
        }
        if (view.getAlpha() == 0.0f) {
            return "viewAlphaZero";
        }
        return null;
    }

    public static Provider s() {
        for (int i2 = 0; i2 < 3; i2++) {
            Provider provider = Security.getProvider(n[i2]);
            if (provider != null) {
                return provider;
            }
        }
        return null;
    }

    public static ii2 t(ii2 ii2Var) {
        if ((ii2Var instanceof li2) || (ii2Var instanceof ji2)) {
            return ii2Var;
        }
        return ii2Var instanceof Serializable ? new ji2(ii2Var) : new li2(ii2Var);
    }

    public static ir2 u() {
        try {
            ir2 ir2Var = mo2.a;
            if (cr2.a()) {
                throw new GeneralSecurityException("Cannot use non-FIPS-compliant AeadConfigurationV1 in FIPS mode");
            }
            return mo2.a;
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException(e);
        }
    }

    public static void v(MediaFormat mediaFormat, List list) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            mediaFormat.setByteBuffer(ec.j(new StringBuilder(String.valueOf(i2).length() + 4), "csd-", i2), ByteBuffer.wrap((byte[]) list.get(i2)));
        }
    }

    public static void w(String str, long j2) {
        if (j2 >= 0) {
            return;
        }
        int length = str.length();
        StringBuilder sb = new StringBuilder(String.valueOf(j2).length() + length + 2 + 14);
        sb.append(str);
        sb.append(" (");
        sb.append(j2);
        sb.append(") must be >= 0");
        throw new IllegalArgumentException(sb.toString());
    }

    public static boolean x(Context context) {
        Display.HdrCapabilities hdrCapabilities;
        DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        Display display = displayManager != null ? displayManager.getDisplay(0) : null;
        if (display != null && display.isHdr() && (hdrCapabilities = display.getHdrCapabilities()) != null) {
            for (int i2 : hdrCapabilities.getSupportedHdrTypes()) {
                if (i2 == 1) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0084  */
    /* JADX WARN: Code duplicated, block: B:44:0x008c  */
    /* JADX WARN: Code duplicated, block: B:47:0x0091  */
    public static eg y(oe0 oe0Var) {
        int i2;
        int i3;
        int iR = oe0Var.r(16);
        int iR2 = oe0Var.r(16);
        if (iR2 == 65535) {
            iR2 = oe0Var.r(24);
            i2 = 7;
        } else {
            i2 = 4;
        }
        int i4 = iR2 + i2;
        if (iR == 44097) {
            i4 += 2;
        }
        if (oe0Var.r(2) == 3) {
            do {
                oe0Var.r(2);
            } while (oe0Var.q());
        }
        int iR3 = oe0Var.r(10);
        if (oe0Var.q() && oe0Var.r(3) > 0) {
            oe0Var.o(2);
        }
        int i5 = true != oe0Var.q() ? 44100 : 48000;
        int iR4 = oe0Var.r(4);
        int[] iArr = h;
        boolean z = false;
        if (i5 == 44100 && iR4 == 13) {
            i3 = iArr[13];
        } else if (i5 != 48000 || iR4 >= 14) {
            i3 = 0;
        } else {
            int i6 = iArr[iR4];
            int i7 = iR3 % 5;
            if (i7 == 1) {
                if (iR4 != 3 || iR4 == 8) {
                    i3 = i6 + 1;
                } else {
                    i3 = i6;
                }
            } else if (i7 != 2) {
                if (i7 == 3) {
                    if (iR4 != 3) {
                    }
                    i3 = i6 + 1;
                } else if (i7 == 4 && (iR4 == 3 || iR4 == 8 || iR4 == 11)) {
                    i3 = i6 + 1;
                } else {
                    i3 = i6;
                }
            } else if (iR4 == 8 || iR4 == 11) {
                i3 = i6 + 1;
            } else {
                i3 = i6;
            }
        }
        return new eg(i5, i4, i3, z);
    }

    public static void z(MediaFormat mediaFormat, String str, int i2) {
        if (i2 != -1) {
            mediaFormat.setInteger(str, i2);
        }
    }
}
