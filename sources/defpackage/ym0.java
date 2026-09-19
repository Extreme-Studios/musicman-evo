package defpackage;

import android.os.SystemClock;
import android.text.TextUtils;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
public final class ym0 {
    public long a;
    public final int b;
    public final Serializable c;
    public final Object d;

    public ym0(File file) {
        this.c = new LinkedHashMap(16, 0.75f, true);
        this.a = 0L;
        this.d = new dr0(this, 12, file);
        this.b = 20971520;
    }

    public static byte[] e(wm0 wm0Var, long j) throws IOException {
        long j2 = wm0Var.g - wm0Var.h;
        if (j >= 0 && j <= j2) {
            int i = (int) j;
            if (i == j) {
                byte[] bArr = new byte[i];
                new DataInputStream(wm0Var).readFully(bArr);
                return bArr;
            }
        }
        StringBuilder sb = new StringBuilder(String.valueOf(j).length() + 33 + String.valueOf(j2).length());
        ec.w(sb, "streamToBytes length=", j, ", maxLength=");
        sb.append(j2);
        throw new IOException(sb.toString());
    }

    public static void f(BufferedOutputStream bufferedOutputStream, int i) throws IOException {
        bufferedOutputStream.write(i & 255);
        bufferedOutputStream.write((i >> 8) & 255);
        bufferedOutputStream.write((i >> 16) & 255);
        bufferedOutputStream.write((i >> 24) & 255);
    }

    public static int g(wm0 wm0Var) {
        return (m(wm0Var) << 24) | m(wm0Var) | (m(wm0Var) << 8) | (m(wm0Var) << 16);
    }

    public static void h(BufferedOutputStream bufferedOutputStream, long j) throws IOException {
        bufferedOutputStream.write((byte) j);
        bufferedOutputStream.write((byte) (j >>> 8));
        bufferedOutputStream.write((byte) (j >>> 16));
        bufferedOutputStream.write((byte) (j >>> 24));
        bufferedOutputStream.write((byte) (j >>> 32));
        bufferedOutputStream.write((byte) (j >>> 40));
        bufferedOutputStream.write((byte) (j >>> 48));
        bufferedOutputStream.write((byte) (j >>> 56));
    }

    public static long i(wm0 wm0Var) {
        return (((long) m(wm0Var)) & 255) | ((((long) m(wm0Var)) & 255) << 8) | ((((long) m(wm0Var)) & 255) << 16) | ((((long) m(wm0Var)) & 255) << 24) | ((((long) m(wm0Var)) & 255) << 32) | ((((long) m(wm0Var)) & 255) << 40) | ((((long) m(wm0Var)) & 255) << 48) | ((((long) m(wm0Var)) & 255) << 56);
    }

    public static void j(BufferedOutputStream bufferedOutputStream, String str) throws IOException {
        byte[] bytes = str.getBytes("UTF-8");
        int length = bytes.length;
        h(bufferedOutputStream, length);
        bufferedOutputStream.write(bytes, 0, length);
    }

    public static String k(wm0 wm0Var) {
        return new String(e(wm0Var, i(wm0Var)), "UTF-8");
    }

    public static int m(wm0 wm0Var) throws IOException {
        int i = wm0Var.read();
        if (i != -1) {
            return i;
        }
        throw new EOFException();
    }

    public static final String n(String str) {
        int length = str.length() / 2;
        return String.valueOf(String.valueOf(str.substring(0, length).hashCode())).concat(String.valueOf(String.valueOf(str.substring(length).hashCode())));
    }

    public synchronized dm0 a(String str) {
        vm0 vm0Var = (vm0) ((LinkedHashMap) this.c).get(str);
        if (vm0Var == null) {
            return null;
        }
        File fileD = d(str);
        try {
            wm0 wm0Var = new wm0(new BufferedInputStream(new FileInputStream(fileD)), fileD.length());
            try {
                String str2 = vm0.a(wm0Var).b;
                if (!TextUtils.equals(str, str2)) {
                    tm0.b("%s: key=%s, found=%s", fileD.getAbsolutePath(), str, str2);
                    vm0 vm0Var2 = (vm0) ((LinkedHashMap) this.c).remove(str);
                    if (vm0Var2 != null) {
                        this.a -= vm0Var2.a;
                    }
                    wm0Var.close();
                    return null;
                }
                byte[] bArrE = e(wm0Var, wm0Var.g - wm0Var.h);
                dm0 dm0Var = new dm0();
                dm0Var.a = bArrE;
                dm0Var.b = vm0Var.c;
                dm0Var.c = vm0Var.d;
                dm0Var.d = vm0Var.e;
                dm0Var.e = vm0Var.f;
                dm0Var.f = vm0Var.g;
                List<gm0> list = vm0Var.h;
                TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
                for (gm0 gm0Var : list) {
                    treeMap.put(gm0Var.a, gm0Var.b);
                }
                dm0Var.g = treeMap;
                dm0Var.h = Collections.unmodifiableList(list);
                wm0Var.close();
                return dm0Var;
            } catch (Throwable th) {
                wm0Var.close();
                throw th;
            }
        } catch (IOException e) {
            tm0.b("%s: %s", fileD.getAbsolutePath(), e.toString());
            synchronized (this) {
                boolean zDelete = d(str).delete();
                vm0 vm0Var3 = (vm0) ((LinkedHashMap) this.c).remove(str);
                if (vm0Var3 != null) {
                    this.a -= vm0Var3.a;
                }
                if (!zDelete) {
                    tm0.b("Could not delete cache entry for key=%s, filename=%s", str, n(str));
                }
                return null;
            }
        }
    }

    public synchronized void b(String str, dm0 dm0Var) {
        try {
            long j = this.a;
            int length = dm0Var.a.length;
            long j2 = j + ((long) length);
            int i = this.b;
            float f = 0.9f;
            if (j2 <= i || length <= i * 0.9f) {
                File fileD = d(str);
                try {
                    BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(fileD));
                    vm0 vm0Var = new vm0(str, dm0Var);
                    try {
                        f(bufferedOutputStream, 538247942);
                        j(bufferedOutputStream, str);
                        String str2 = vm0Var.c;
                        if (str2 == null) {
                            str2 = "";
                        }
                        j(bufferedOutputStream, str2);
                        h(bufferedOutputStream, vm0Var.d);
                        h(bufferedOutputStream, vm0Var.e);
                        h(bufferedOutputStream, vm0Var.f);
                        h(bufferedOutputStream, vm0Var.g);
                        List<gm0> list = vm0Var.h;
                        if (list != null) {
                            f(bufferedOutputStream, list.size());
                            for (gm0 gm0Var : list) {
                                j(bufferedOutputStream, gm0Var.a);
                                j(bufferedOutputStream, gm0Var.b);
                            }
                        } else {
                            f(bufferedOutputStream, 0);
                        }
                        bufferedOutputStream.flush();
                        bufferedOutputStream.write(dm0Var.a);
                        bufferedOutputStream.close();
                        vm0Var.a = fileD.length();
                        l(str, vm0Var);
                        long j3 = this.a;
                        int i2 = this.b;
                        if (j3 >= i2) {
                            boolean z = tm0.a;
                            if (z) {
                                tm0.a("Pruning old cache entries.", new Object[0]);
                            }
                            long j4 = this.a;
                            long jElapsedRealtime = SystemClock.elapsedRealtime();
                            Iterator it = ((LinkedHashMap) this.c).entrySet().iterator();
                            int i3 = 0;
                            while (it.hasNext()) {
                                vm0 vm0Var2 = (vm0) ((Map.Entry) it.next()).getValue();
                                String str3 = vm0Var2.b;
                                if (d(str3).delete()) {
                                    this.a -= vm0Var2.a;
                                } else {
                                    tm0.b("Could not delete cache entry for key=%s, filename=%s", str3, n(str3));
                                }
                                it.remove();
                                i3++;
                                if (this.a < i2 * f) {
                                    break;
                                } else {
                                    f = f;
                                }
                            }
                            if (z) {
                                tm0.a("pruned %d files, %d bytes, %d ms", Integer.valueOf(i3), Long.valueOf(this.a - j4), Long.valueOf(SystemClock.elapsedRealtime() - jElapsedRealtime));
                            }
                        }
                    } catch (IOException e) {
                        tm0.b("%s", e.toString());
                        bufferedOutputStream.close();
                        tm0.b("Failed to write header for %s", fileD.getAbsolutePath());
                        throw new IOException();
                    }
                } catch (IOException unused) {
                    if (!fileD.delete()) {
                        tm0.b("Could not clean up file %s", fileD.getAbsolutePath());
                    }
                    if (!((xm0) this.d).mo2a().exists()) {
                        tm0.b("Re-initializing cache after external clearing.", new Object[0]);
                        ((LinkedHashMap) this.c).clear();
                        this.a = 0L;
                        c();
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void c() {
        try {
            File fileMo2a = ((xm0) this.d).mo2a();
            if (fileMo2a.exists()) {
                File[] fileArrListFiles = fileMo2a.listFiles();
                if (fileArrListFiles != null) {
                    for (File file : fileArrListFiles) {
                        try {
                            long length = file.length();
                            wm0 wm0Var = new wm0(new BufferedInputStream(new FileInputStream(file)), length);
                            try {
                                vm0 vm0VarA = vm0.a(wm0Var);
                                vm0VarA.a = length;
                                l(vm0VarA.b, vm0VarA);
                                wm0Var.close();
                            } catch (Throwable th) {
                                wm0Var.close();
                                throw th;
                            }
                        } catch (IOException unused) {
                            file.delete();
                        }
                    }
                }
            } else if (!fileMo2a.mkdirs()) {
                tm0.c("Unable to create cache dir %s", fileMo2a.getAbsolutePath());
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public File d(String str) {
        return new File(((xm0) this.d).mo2a(), n(str));
    }

    public void l(String str, vm0 vm0Var) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.c;
        if (linkedHashMap.containsKey(str)) {
            this.a = (vm0Var.a - ((vm0) linkedHashMap.get(str)).a) + this.a;
        } else {
            this.a += vm0Var.a;
        }
        linkedHashMap.put(str, vm0Var);
    }

    public ym0(un1 un1Var) {
        this.c = new LinkedHashMap(16, 0.75f, true);
        this.a = 0L;
        this.d = un1Var;
        this.b = 5242880;
    }

    public ym0(long j, String str, String str2, int i) {
        this.a = j;
        this.c = str;
        this.d = str2;
        this.b = i;
    }
}
