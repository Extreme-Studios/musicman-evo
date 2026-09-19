package defpackage;

import android.net.Uri;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class tc1 extends pc1 implements qb1 {
    public ed1 i;
    public String j;
    public boolean k;
    public boolean l;
    public fc1 m;
    public long n;
    public long o;

    public static final String o(String str) {
        return "cache:".concat(String.valueOf(f32.d(str, "MD5")));
    }

    public static String p(String str, Exception exc) {
        String canonicalName = exc.getClass().getCanonicalName();
        String message = exc.getMessage();
        int length = String.valueOf(canonicalName).length();
        StringBuilder sb = new StringBuilder(str.length() + 1 + length + 1 + String.valueOf(message).length());
        ec.x(sb, str, "/", canonicalName, ":");
        sb.append(message);
        return sb.toString();
    }

    @Override // defpackage.pc1
    public final void a() {
        ed1 ed1Var = this.i;
        if (ed1Var != null) {
            ed1Var.o = null;
            d93 d93Var = ed1Var.l;
            if (d93Var != null) {
                d93Var.i.b();
                d93Var.h.T1(ed1Var);
                d93 d93Var2 = ed1Var.l;
                d93Var2.i.b();
                d93Var2.h.U1();
                ed1Var.l = null;
                ed1.A.decrementAndGet();
            }
        }
    }

    @Override // defpackage.pc1
    public final boolean b(String str) {
        return d(str, new String[]{str});
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [md1] */
    /* JADX WARN: Type inference failed for: r1v0, types: [pc1, tc1] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v3, types: [pc1, tc1] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v3, types: [pc1, tc1] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16, types: [long] */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.StringBuilder] */
    @Override // defpackage.pc1
    public final boolean d(String str, String[] strArr) throws Throwable {
        boolean z;
        ?? r2;
        ?? r3;
        ?? r1;
        long j;
        long j2;
        ?? r4 = this;
        ?? r5 = str;
        r4.j = r5;
        ?? O = o(r5);
        String str2 = " ms";
        String str3 = "Timeout reached. Limit: ";
        boolean z2 = false;
        try {
            Uri[] uriArr = new Uri[strArr.length];
            for (int i = 0; i < strArr.length; i++) {
                uriArr[i] = Uri.parse(strArr[i]);
            }
            ed1 ed1Var = r4.i;
            ed1Var.getClass();
            ed1Var.u(uriArr, ByteBuffer.allocate(0), false);
            ?? r0 = (md1) r4.h.get();
            if (r0 != 0) {
                r0.b1(O, r4);
            }
            vc3.C.k.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            ix0 ix0Var = lx0.K;
            tu0 tu0Var = tu0.e;
            long jLongValue = ((Long) tu0Var.c.a(ix0Var)).longValue();
            long jLongValue2 = ((Long) tu0Var.c.a(lx0.J)).longValue() * 1000;
            long jIntValue = ((Integer) tu0Var.c.a(lx0.v)).intValue();
            boolean zBooleanValue = ((Boolean) tu0Var.c.a(lx0.Y1)).booleanValue();
            long j3 = -1;
            r4 = r4;
            r5 = r5;
            O = O;
            while (true) {
                synchronized (this) {
                    try {
                        if (System.currentTimeMillis() - jCurrentTimeMillis > jLongValue2) {
                            String str4 = str3;
                            long j4 = jLongValue2;
                            StringBuilder sb = new StringBuilder(String.valueOf(j4).length() + 27);
                            sb.append(str4);
                            sb.append(j4);
                            sb.append(str2);
                            throw new IOException(sb.toString());
                        }
                        if (r4.k) {
                            throw new IOException("Abort requested before buffering finished. ");
                        }
                        if (r4.l) {
                            return true;
                        }
                        d93 d93Var = r4.i.l;
                        if (!(d93Var != null ? true : z2)) {
                            throw new IOException("ExoPlayer was released during preloading.");
                        }
                        long jR1 = d93Var.R1();
                        if (jR1 > 0) {
                            long jS1 = r4.i.l.S1();
                            if (jS1 != j3) {
                                boolean z3 = jS1 > 0 ? true : z2;
                                if (zBooleanValue) {
                                    try {
                                        ed1 ed1Var2 = r4.i;
                                        j2 = (ed1Var2.x == null || !ed1Var2.x.u) ? ed1Var2.p : 0L;
                                    } catch (Throwable th) {
                                        th = th;
                                        z = false;
                                        r1 = r4;
                                        r3 = r5;
                                    }
                                } else {
                                    j2 = -1;
                                }
                                long jQ = zBooleanValue ? r4.i.q() : -1L;
                                long jR = zBooleanValue ? r4.i.r() : -1L;
                                try {
                                    int i2 = ed1.z.get();
                                    int i3 = ed1.A.get();
                                    za0 za0Var = f32.b;
                                    long j5 = jQ;
                                    z = false;
                                    try {
                                        ic1 ic1Var = new ic1(r4, r5, O, jS1, jR1, j2, j5, jR, z3, i2, i3);
                                        j = jS1;
                                        O = jR1;
                                        za0Var.post(ic1Var);
                                        j3 = j;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        r2 = this;
                                        O = O;
                                        O = str;
                                        throw th;
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    z = false;
                                    r2 = this;
                                    O = O;
                                    O = str;
                                    throw th;
                                }
                            } else {
                                z = z2;
                                O = jR1;
                                j = jS1;
                            }
                            r2 = (j > O ? 1 : (j == O ? 0 : -1));
                            if (r2 >= 0) {
                                tc1 tc1Var = this;
                                String str5 = str;
                                try {
                                    f32.b.post(new nc1(tc1Var, str5, (String) O, (long) O));
                                    return true;
                                } catch (Throwable th4) {
                                    th = th4;
                                    r1 = tc1Var;
                                    r3 = str5;
                                }
                            } else {
                                try {
                                    tc1 tc1Var2 = this;
                                    O = str;
                                    if (tc1Var2.i.p >= jIntValue && j > 0) {
                                        return true;
                                    }
                                    r2 = tc1Var2;
                                } catch (Throwable th5) {
                                    th = th5;
                                }
                            }
                        } else {
                            str2 = str2;
                            str3 = str3;
                            z = z2;
                            jLongValue2 = jLongValue2;
                            jIntValue = jIntValue;
                            O = r5;
                            r2 = r4;
                        }
                        try {
                            r2.wait(jLongValue);
                        } catch (InterruptedException unused) {
                            throw new IOException("Wait interrupted.");
                        }
                    } catch (Throwable th6) {
                        th = th6;
                        z = z2;
                        r1 = r4;
                        r3 = r5;
                    }
                    O = r3;
                    r2 = r1;
                }
                try {
                    throw th;
                } catch (Exception e) {
                    e = e;
                    String message = e.getMessage();
                    ?? sb2 = new StringBuilder(String.valueOf((Object) O).length() + 34 + String.valueOf(message).length());
                    sb2.append("Failed to preload url ");
                    sb2.append(O);
                    sb2.append(" Exception: ");
                    sb2.append(message);
                    jn.T(sb2.toString());
                    vc3.C.h.e("VideoStreamExoPlayerCache.preload", e);
                    r2.a();
                    r2.m(O, O, "error", p("error", e));
                    return z;
                }
                jLongValue = jLongValue;
                r4 = r2;
                r5 = O;
                O = O;
                jLongValue2 = jLongValue2;
                jIntValue = jIntValue;
                z2 = z;
                str2 = str2;
                str3 = str3;
            }
        } catch (Exception e2) {
            e = e2;
            O = O;
            z = z2;
            O = r5;
            r2 = r4;
        }
    }

    @Override // defpackage.pc1
    public final boolean g(String str, String[] strArr, fc1 fc1Var) {
        this.j = str;
        this.m = fc1Var;
        String strO = o(str);
        try {
            Uri[] uriArr = new Uri[strArr.length];
            for (int i = 0; i < strArr.length; i++) {
                uriArr[i] = Uri.parse(strArr[i]);
            }
            ed1 ed1Var = this.i;
            ed1Var.getClass();
            ed1Var.u(uriArr, ByteBuffer.allocate(0), false);
            md1 md1Var = (md1) this.h.get();
            if (md1Var != null) {
                md1Var.b1(strO, this);
            }
            vc3.C.k.getClass();
            this.n = System.currentTimeMillis();
            this.o = -1L;
            zb3.l.postDelayed(new va1(4, this), 0L);
            return true;
        } catch (Exception e) {
            String message = e.getMessage();
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 34 + String.valueOf(message).length());
            sb.append("Failed to preload url ");
            sb.append(str);
            sb.append(" Exception: ");
            sb.append(message);
            jn.T(sb.toString());
            vc3.C.h.e("VideoStreamExoPlayerCache.preload", e);
            a();
            m(str, strO, "error", p("error", e));
            return false;
        }
    }

    @Override // defpackage.pc1
    public final void h(int i) {
        wc1 wc1Var = this.i.g;
        synchronized (wc1Var) {
            wc1Var.c = ((long) i) * 1000;
        }
    }

    @Override // defpackage.pc1
    public final void i(int i) {
        wc1 wc1Var = this.i.g;
        synchronized (wc1Var) {
            wc1Var.b = ((long) i) * 1000;
        }
    }

    @Override // defpackage.pc1
    public final void j(int i) {
        wc1 wc1Var = this.i.g;
        synchronized (wc1Var) {
            wc1Var.d = ((long) i) * 1000;
        }
    }

    @Override // defpackage.pc1
    public final void k(int i) {
        wc1 wc1Var = this.i.g;
        synchronized (wc1Var) {
            wc1Var.e = ((long) i) * 1000;
        }
    }

    @Override // defpackage.pc1
    public final void l() {
        synchronized (this) {
            this.k = true;
            notify();
            a();
        }
        String str = this.j;
        if (str != null) {
            m(this.j, o(str), "externalAbort", "Programmatic precache abort.");
        }
    }

    @Override // defpackage.qb1
    public final void t() {
        jn.T("Precache onRenderedFirstFrame");
    }

    @Override // defpackage.qb1
    public final void u(IOException iOException) {
        jn.V("Precache exception", iOException);
        vc3.C.h.e("VideoStreamExoPlayerCache.onException", iOException);
    }

    @Override // defpackage.qb1
    public final void v(long j, boolean z) {
        md1 md1Var = (md1) this.h.get();
        if (md1Var != null) {
            za1.f.execute(new ac1(md1Var, z, j, 1));
        }
    }

    @Override // defpackage.qb1
    public final void x(String str, Exception exc) {
        jn.V("Precache error", exc);
        vc3.C.h.e("VideoStreamExoPlayerCache.onError", exc);
    }

    @Override // defpackage.qb1
    public final void f0(int i) {
    }

    @Override // defpackage.qb1
    public final void w(int i, int i2) {
    }
}
