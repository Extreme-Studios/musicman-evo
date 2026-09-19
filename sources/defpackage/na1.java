package defpackage;

import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.media.AudioManager;
import android.os.Binder;
import android.os.Build;
import android.os.Looper;
import android.os.Process;
import android.os.StrictMode;
import android.util.Log;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.cert.CertificateEncodingException;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public abstract class na1 implements qd0 {
    public static AudioManager f;
    public static final xo2 g = new xo2("CLOSED_EMPTY", 3);
    public static final xo2 h = new xo2("NONE", 3);
    public static final xo2 i = new xo2("PENDING", 3);
    public static final byte[] j = {0, 0, 0, 0, 16, 0, -128, 0, 0, -86, 0, 56, -101, 113};
    public static final byte[] k = {0, 0, 33, 7, -45, 17, -122, 68, -56, -63, -54, 0, 0, 0};
    public static final tt0 l = new tt0(18);
    public static final xn1 m = new xn1(14);
    public static final l32 n = new l32(1);
    public static final l32 o = new l32(13);
    public static final /* synthetic */ int p = 0;

    public static byte[] A(String str, boolean z) {
        gl2 gl2Var;
        if (z) {
            gl2Var = il2.e;
            if (gl2Var.b != null) {
                gl2Var = new gl2(gl2Var.a, (Character) null);
            }
        } else {
            gl2Var = il2.d;
        }
        byte[] bArrH = gl2Var.h(str);
        if (bArrH.length != 0 || str.length() <= 0) {
            return bArrH;
        }
        j7.p("Unable to decode ".concat(str));
        return null;
    }

    public static AbstractList B(List list, wh2 wh2Var) {
        return list != null ? new kk2(list, wh2Var) : new lk2(list, wh2Var);
    }

    public static jn2 C(Throwable th) {
        th.getClass();
        jn2 jn2Var = new jn2();
        jn2Var.e(th);
        return jn2Var;
    }

    public static final void D(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i2) {
        if (i2 < 0 || byteBuffer2.remaining() < i2 || byteBuffer3.remaining() < i2 || byteBuffer.remaining() < i2) {
            j7.p("That combination of buffers, offsets and length to xor result in out-of-bond accesses.");
            return;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            byteBuffer.put((byte) (byteBuffer2.get() ^ byteBuffer3.get()));
        }
    }

    public static sl0 E(int i2, od0 od0Var, cw1 cw1Var) throws no0 {
        sl0 sl0VarA = sl0.a(od0Var, cw1Var);
        while (true) {
            int i3 = sl0VarA.a;
            if (i3 == i2) {
                return sl0VarA;
            }
            ec.u(new StringBuilder(String.valueOf(i3).length() + 28), "Ignoring unknown WAV chunk: ", i3, "WavHeaderReader");
            long j2 = sl0VarA.b;
            long j3 = 8 + j2;
            if ((1 & j2) != 0) {
                j3 = 9 + j2;
            }
            if (j3 > 2147483647L) {
                StringBuilder sb = new StringBuilder(String.valueOf(i3).length() + 40);
                sb.append("Chunk is too large (~2GB+) to skip; id: ");
                sb.append(i3);
                throw no0.b(sb.toString());
            }
            od0Var.t((int) j3);
            sl0VarA = sl0.a(od0Var, cw1Var);
        }
    }

    public static xn2 F(Callable callable, Executor executor) {
        xn2 xn2Var = new xn2(callable);
        executor.execute(xn2Var);
        return xn2Var;
    }

    public static xn2 G(wm2 wm2Var, Executor executor) {
        xn2 xn2Var = new xn2();
        xn2Var.m = new wn2(xn2Var, wm2Var);
        executor.execute(xn2Var);
        return xn2Var;
    }

    public static long H(byte b, byte b2) {
        int i2;
        int i3;
        int i4 = b & 255;
        int i5 = b & 3;
        if (i5 != 0) {
            i2 = 2;
            if (i5 != 1 && i5 != 2) {
                i2 = b2 & 63;
            }
        } else {
            i2 = 1;
        }
        int i6 = i4 >> 3;
        int i7 = i6 & 3;
        if (i6 >= 16) {
            i3 = 2500 << i7;
        } else if (i6 >= 12) {
            i3 = 10000 << (i6 & 1);
        } else {
            i3 = i7 == 3 ? 60000 : 10000 << i7;
        }
        return ((long) i2) * ((long) i3);
    }

    public static wl2 I(hp hpVar, Class cls, wh2 wh2Var, Executor executor) {
        int i2 = xl2.p;
        wl2 wl2Var = new wl2(hpVar, cls, wh2Var);
        hpVar.a(wl2Var, ej1.B(executor, wl2Var));
        return wl2Var;
    }

    public static vl2 J(hp hpVar, Class cls, xm2 xm2Var, Executor executor) {
        int i2 = xl2.p;
        vl2 vl2Var = new vl2(hpVar, cls, xm2Var);
        hpVar.a(vl2Var, ej1.B(executor, vl2Var));
        return vl2Var;
    }

    public static hp K(hp hpVar, long j2, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        if (hpVar.isDone()) {
            return hpVar;
        }
        vn2 vn2Var = new vn2();
        vn2Var.m = hpVar;
        ly1 ly1Var = new ly1();
        ly1Var.g = vn2Var;
        vn2Var.n = scheduledExecutorService.schedule(ly1Var, j2, timeUnit);
        hpVar.a(ly1Var, cn2.f);
        return vn2Var;
    }

    public static pm2 L(hp hpVar, xm2 xm2Var, Executor executor) {
        int i2 = rm2.o;
        pm2 pm2Var = new pm2(hpVar, xm2Var);
        hpVar.a(pm2Var, ej1.B(executor, pm2Var));
        return pm2Var;
    }

    public static qm2 M(hp hpVar, wh2 wh2Var, Executor executor) {
        int i2 = rm2.o;
        qm2 qm2Var = new qm2(hpVar, wh2Var);
        hpVar.a(qm2Var, ej1.B(executor, qm2Var));
        return qm2Var;
    }

    public static void N(hp hpVar, hn2 hn2Var, Executor executor) {
        hpVar.a(new in2(hpVar, 0, hn2Var), executor);
    }

    public static Object O(Future future) {
        if (future.isDone()) {
            return dq.u(future);
        }
        j7.e(jn.E("Future was expected to be done: %s", future));
        return null;
    }

    public static Object P(cb1 cb1Var) {
        try {
            return dq.u(cb1Var);
        } catch (ExecutionException e) {
            if (e.getCause() instanceof Error) {
                throw new uc((Error) e.getCause());
            }
            throw new na(e.getCause());
        }
    }

    public static void c(Context context, Throwable th) {
        try {
            dq.f(context);
        } catch (Exception e) {
            Log.e("CrashUtils", "Error adding exception to DropBox!", e);
        }
    }

    public static void d(Throwable th, Throwable th2) {
        th.getClass();
        th2.getClass();
        if (th != th2) {
            Integer num = ln.a;
            if (num == null || num.intValue() >= 19) {
                th.addSuppressed(th2);
                return;
            }
            Method method = ov.a;
            if (method != null) {
                method.invoke(th, th2);
            }
        }
    }

    public static final void e(z60 z60Var, z61 z61Var, oo ooVar) {
        AutoCloseable autoCloseable;
        z61Var.getClass();
        ooVar.getClass();
        a70 a70Var = z60Var.a;
        if (a70Var != null) {
            synchronized (a70Var.a) {
                autoCloseable = (AutoCloseable) a70Var.b.get("androidx.lifecycle.savedstate.vm.tag");
            }
        } else {
            autoCloseable = null;
        }
    }

    public static int i(Context context, String str) {
        int iNoteProxyOpNoThrow;
        int iMyPid = Process.myPid();
        int iMyUid = Process.myUid();
        String packageName = context.getPackageName();
        if (context.checkPermission(str, iMyPid, iMyUid) != -1) {
            String strPermissionToOp = AppOpsManager.permissionToOp(str);
            if (strPermissionToOp != null) {
                if (packageName == null) {
                    String[] packagesForUid = context.getPackageManager().getPackagesForUid(iMyUid);
                    if (packagesForUid != null && packagesForUid.length > 0) {
                        packageName = packagesForUid[0];
                    }
                }
                int iMyUid2 = Process.myUid();
                String packageName2 = context.getPackageName();
                if (iMyUid2 == iMyUid && Objects.equals(packageName2, packageName) && Build.VERSION.SDK_INT >= 29) {
                    AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService(AppOpsManager.class);
                    iNoteProxyOpNoThrow = appOpsManager == null ? 1 : appOpsManager.checkOpNoThrow(strPermissionToOp, Binder.getCallingUid(), packageName);
                    if (iNoteProxyOpNoThrow == 0) {
                        iNoteProxyOpNoThrow = appOpsManager != null ? appOpsManager.checkOpNoThrow(strPermissionToOp, iMyUid, z6.a(context)) : 1;
                    }
                } else {
                    iNoteProxyOpNoThrow = ((AppOpsManager) context.getSystemService(AppOpsManager.class)).noteProxyOpNoThrow(strPermissionToOp, packageName);
                }
                if (iNoteProxyOpNoThrow != 0) {
                    return -2;
                }
            }
            return 0;
        }
        return -1;
    }

    public static final z8 j(yb ybVar) {
        z8 z8Var;
        z8 z8Var2;
        if (!(ybVar instanceof ff)) {
            return new z8(1, ybVar);
        }
        ff ffVar = (ff) ybVar;
        xo2 xo2Var = ss0.c;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = ff.m;
        loop0: while (true) {
            Object obj = atomicReferenceFieldUpdater.get(ffVar);
            z8Var = null;
            if (obj == null) {
                atomicReferenceFieldUpdater.set(ffVar, xo2Var);
                z8Var2 = null;
                break;
            }
            if (obj instanceof z8) {
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(ffVar, obj, xo2Var)) {
                        z8Var2 = (z8) obj;
                        break loop0;
                    }
                } while (atomicReferenceFieldUpdater.get(ffVar) == obj);
            } else if (obj != xo2Var && !(obj instanceof Throwable)) {
                j7.k(obj, "Inconsistent state ");
                return null;
            }
        }
        if (z8Var2 != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = z8.l;
            Object obj2 = atomicReferenceFieldUpdater2.get(z8Var2);
            if (!(obj2 instanceof ka) || ((ka) obj2).d == null) {
                z8.k.set(z8Var2, 536870911);
                atomicReferenceFieldUpdater2.set(z8Var2, w1.a);
                z8Var = z8Var2;
            } else {
                z8Var2.p();
            }
            if (z8Var != null) {
                return z8Var;
            }
        }
        return new z8(2, ybVar);
    }

    public static boolean k(String str) {
        x3 x3Var = y70.a;
        Set<y3> setUnmodifiableSet = Collections.unmodifiableSet(y3.c);
        HashSet<y3> hashSet = new HashSet();
        for (y3 y3Var : setUnmodifiableSet) {
            if (y3Var.a.equals(str)) {
                hashSet.add(y3Var);
            }
        }
        if (hashSet.isEmpty()) {
            throw new RuntimeException("Unknown feature ".concat(str));
        }
        for (y3 y3Var2 : hashSet) {
            if (y3Var2.a() || y3Var2.b()) {
                return true;
            }
        }
        return false;
    }

    public static synchronized AudioManager o(Context context) {
        try {
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                f = null;
            }
            AudioManager audioManager = f;
            if (audioManager != null) {
                return audioManager;
            }
            Looper looperMyLooper = Looper.myLooper();
            if (looperMyLooper != null && looperMyLooper != Looper.getMainLooper()) {
                km1 km1Var = new km1();
                ej1.r().execute(new in2(applicationContext, 28, km1Var));
                km1Var.b();
                AudioManager audioManager2 = f;
                if (audioManager2 != null) {
                    return audioManager2;
                }
                throw null;
            }
            AudioManager audioManager3 = (AudioManager) applicationContext.getSystemService("audio");
            f = audioManager3;
            if (audioManager3 != null) {
                return audioManager3;
            }
            throw null;
        } catch (Throwable th) {
            throw th;
        }
    }

    public static Object p(Context context, Callable callable) {
        try {
            StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
            try {
                StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
                return callable.call();
            } finally {
                StrictMode.setThreadPolicy(threadPolicy);
            }
        } catch (Throwable th) {
            jn.P("Unexpected exception.", th);
            e71.a(context).c("StrictModeUtil.runWithLaxStrictMode", th);
            return null;
        }
    }

    public static String q(Context context, String str, ArrayList arrayList) throws PackageManager.NameNotFoundException, CertificateEncodingException {
        if (Build.VERSION.SDK_INT <= 30 && !Build.VERSION.CODENAME.equals("S")) {
            return null;
        }
        tn2 tn2Var = new tn2();
        context.getPackageManager().requestChecksums(str, false, 8, arrayList, new gq0(1, tn2Var));
        return (String) tn2Var.get();
    }

    public static ArrayList r(dl2 dl2Var) {
        ArrayList arrayList = new ArrayList();
        dl2Var.getClass();
        while (dl2Var.hasNext()) {
            arrayList.add(dl2Var.next());
        }
        return arrayList;
    }

    public static ArrayList s(byte[] bArr) {
        long j2 = ((bArr[11] & 255) << 8) | (bArr[10] & 255);
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(bArr);
        arrayList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong((j2 * 1000000000) / 48000).array());
        arrayList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(80000000L).array());
        return arrayList;
    }

    public static kn2 t(Object obj) {
        return obj == null ? kn2.g : new kn2(obj);
    }

    public static kb3 u(Context context, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            y42 y42Var = (y42) it.next();
            if (y42Var.c) {
                arrayList.add(s2.o);
            } else {
                arrayList.add(new s2(y42Var.a, y42Var.b));
            }
        }
        return new kb3(context, (s2[]) arrayList.toArray(new s2[arrayList.size()]));
    }

    public static boolean w(od0 od0Var) {
        cw1 cw1Var = new cw1(8);
        int i2 = sl0.a(od0Var, cw1Var).a;
        if (i2 != 1380533830 && i2 != 1380333108) {
            return false;
        }
        od0Var.u(cw1Var.a, 0, 4);
        cw1Var.E(0);
        int iB = cw1Var.b();
        if (iB == 1463899717) {
            return true;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(iB).length() + 23);
        sb.append("Unsupported form type: ");
        sb.append(iB);
        s90.Y("WavHeaderReader", sb.toString());
        return false;
    }

    public static byte[] x(byte[]... bArr) throws GeneralSecurityException {
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= bArr.length) {
                byte[] bArr2 = new byte[i3];
                int i4 = 0;
                for (byte[] bArr3 : bArr) {
                    int length = bArr3.length;
                    System.arraycopy(bArr3, 0, bArr2, i4, length);
                    i4 += length;
                }
                return bArr2;
            }
            int length2 = bArr[i2].length;
            if (i3 > Integer.MAX_VALUE - length2) {
                j7.r("exceeded size limit");
                return null;
            }
            i3 += length2;
            i2++;
        }
    }

    public static na1 y(Class cls) {
        return System.getProperty("java.vm.name").equalsIgnoreCase("Dalvik") ? new l63(cls.getSimpleName(), 0) : new l63(cls.getSimpleName(), 1);
    }

    public static final byte[] z(int i2, byte[] bArr, byte[] bArr2) {
        if (bArr.length - 16 < i2) {
            j7.p("That combination of buffers, offsets and length to xor result in out-of-bond accesses.");
            return null;
        }
        byte[] bArr3 = new byte[16];
        for (int i3 = 0; i3 < 16; i3++) {
            bArr3[i3] = (byte) (bArr[i3 + i2] ^ bArr2[i3]);
        }
        return bArr3;
    }

    public abstract pk b();

    public abstract boolean f(e0 e0Var, a0 a0Var, a0 a0Var2);

    public abstract boolean g(e0 e0Var, Object obj, Object obj2);

    public abstract boolean h(e0 e0Var, d0 d0Var, d0 d0Var2);

    public abstract void m(d0 d0Var, d0 d0Var2);

    public abstract void n(d0 d0Var, Thread thread);

    public abstract void v(String str);
}
