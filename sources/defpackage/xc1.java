package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.SystemClock;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes.dex */
public final class xc1 extends za2 {
    public final Context j;
    public final oe2 k;
    public final dr0 l;
    public final String m;
    public final int n;
    public final boolean o;
    public InputStream p;
    public boolean q;
    public Uri r;
    public volatile wu0 s;
    public boolean t;
    public boolean u;
    public boolean v;
    public boolean w;
    public long x;
    public hp y;
    public final AtomicLong z;

    public xc1(Context context, oe2 oe2Var, String str, int i, qp2 qp2Var, dr0 dr0Var) {
        super(false);
        this.j = context;
        this.k = oe2Var;
        this.l = dr0Var;
        this.m = str;
        this.n = i;
        this.t = false;
        this.u = false;
        this.v = false;
        this.w = false;
        this.x = 0L;
        this.z = new AtomicLong(-1L);
        this.y = null;
        this.o = ((Boolean) tu0.e.c.a(lx0.Y1)).booleanValue();
        c(qp2Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v20, types: [vc3] */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v29, types: [qb1] */
    /* JADX WARN: Type inference failed for: r2v35, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v40, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v56 */
    /* JADX WARN: Type inference failed for: r2v57 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5, types: [boolean] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.oe2
    public final long a(eg2 eg2Var) throws Throwable {
        uu0 uu0VarR;
        boolean z;
        long j;
        boolean z2;
        boolean z3;
        long jElapsedRealtime;
        StringBuilder sb;
        ?? string;
        eg2 eg2Var2 = eg2Var;
        if (this.q) {
            throw new IOException("Attempt to open an already open GcacheDataSource.");
        }
        ?? r5 = 1;
        this.q = true;
        Uri uri = eg2Var2.a;
        this.r = uri;
        boolean z4 = this.o;
        if (!z4) {
            e(eg2Var);
        }
        this.s = wu0.a(uri);
        ix0 ix0Var = lx0.J4;
        tu0 tu0Var = tu0.e;
        boolean zBooleanValue = ((Boolean) tu0Var.c.a(ix0Var)).booleanValue();
        wu0 wu0Var = this.s;
        if (!zBooleanValue) {
            if (wu0Var != null) {
                this.s.m = eg2Var2.c;
                wu0 wu0Var2 = this.s;
                String str = this.m;
                wu0Var2.n = str != null ? str : "";
                this.s.o = this.n;
                uu0VarR = vc3.C.j.r(this.s);
            } else {
                uu0VarR = null;
            }
            if (uu0VarR != null && uu0VarR.a()) {
                synchronized (uu0VarR) {
                    z = uu0VarR.g;
                }
                this.t = z;
                this.v = uu0VarR.d();
                this.w = uu0VarR.c();
                synchronized (uu0VarR) {
                    j = uu0VarR.i;
                }
                this.x = j;
                this.u = true;
                if (!k()) {
                    this.p = uu0VarR.b();
                    if (this.o) {
                        e(eg2Var);
                    }
                    return -1L;
                }
            }
        } else if (wu0Var != null) {
            this.s.m = eg2Var2.c;
            wu0 wu0Var3 = this.s;
            String str2 = this.m;
            wu0Var3.n = str2 != null ? str2 : "";
            this.s.o = this.n;
            long jLongValue = (this.s.l ? (Long) tu0Var.c.a(lx0.L4) : (Long) tu0Var.c.a(lx0.K4)).longValue();
            ?? string2 = vc3.C;
            string2.k.getClass();
            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            yu0 yu0VarD = zf0.d(this.j, this.s);
            try {
                try {
                    av0 av0Var = (av0) yu0VarD.f.get(jLongValue, TimeUnit.MILLISECONDS);
                    try {
                        this.t = av0Var.b;
                        this.v = av0Var.c;
                        this.w = av0Var.e;
                        this.x = av0Var.d;
                        if (!k()) {
                            this.p = av0Var.a;
                            if (z4) {
                                e(eg2Var);
                            }
                            string2.k.getClass();
                            long jElapsedRealtime3 = SystemClock.elapsedRealtime() - jElapsedRealtime2;
                            qb1 qb1Var = ((ed1) this.l.g).o;
                            if (qb1Var != null) {
                                qb1Var.v(jElapsedRealtime3, true);
                            }
                            this.u = true;
                            StringBuilder sb2 = new StringBuilder(String.valueOf(jElapsedRealtime3).length() + 24);
                            sb2.append("Cache connection took ");
                            sb2.append(jElapsedRealtime3);
                            sb2.append("ms");
                            jn.p(sb2.toString());
                            return -1L;
                        }
                        string2.k.getClass();
                        long jElapsedRealtime4 = SystemClock.elapsedRealtime() - jElapsedRealtime2;
                        qb1 qb1Var2 = ((ed1) this.l.g).o;
                        if (qb1Var2 != null) {
                            qb1Var2.v(jElapsedRealtime4, true);
                        }
                        this.u = true;
                        StringBuilder sb3 = new StringBuilder(String.valueOf(jElapsedRealtime4).length() + 24);
                        sb3.append("Cache connection took ");
                        sb3.append(jElapsedRealtime4);
                        sb3.append("ms");
                        string = sb3.toString();
                    } catch (InterruptedException unused) {
                        z3 = true;
                        yu0VarD.cancel(true);
                        Thread.currentThread().interrupt();
                        vc3.C.k.getClass();
                        jElapsedRealtime = SystemClock.elapsedRealtime() - jElapsedRealtime2;
                        qb1 qb1Var3 = ((ed1) this.l.g).o;
                        if (qb1Var3 != null) {
                            qb1Var3.v(jElapsedRealtime, z3);
                        }
                        this.u = z3;
                        sb = new StringBuilder(String.valueOf(jElapsedRealtime).length() + 24);
                        sb.append("Cache connection took ");
                        sb.append(jElapsedRealtime);
                        sb.append("ms");
                        string2 = sb.toString();
                        string = string2;
                    } catch (ExecutionException | TimeoutException unused2) {
                        z2 = true;
                        yu0VarD.cancel(true);
                        vc3.C.k.getClass();
                        jElapsedRealtime = SystemClock.elapsedRealtime() - jElapsedRealtime2;
                        qb1 qb1Var4 = ((ed1) this.l.g).o;
                        if (qb1Var4 != null) {
                            qb1Var4.v(jElapsedRealtime, z2);
                        }
                        this.u = z2;
                        sb = new StringBuilder(String.valueOf(jElapsedRealtime).length() + 24);
                        sb.append("Cache connection took ");
                        sb.append(jElapsedRealtime);
                        sb.append("ms");
                        string2 = sb.toString();
                        string = string2;
                    } catch (Throwable th) {
                        th = th;
                        vc3.C.k.getClass();
                        long jElapsedRealtime5 = SystemClock.elapsedRealtime() - jElapsedRealtime2;
                        ?? r2 = ((ed1) this.l.g).o;
                        if (r2 != 0) {
                            r2.v(jElapsedRealtime5, r5);
                        }
                        this.u = r5;
                        StringBuilder sb4 = new StringBuilder(String.valueOf(jElapsedRealtime5).length() + 24);
                        sb4.append("Cache connection took ");
                        sb4.append(jElapsedRealtime5);
                        sb4.append("ms");
                        jn.p(sb4.toString());
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    r5 = string2;
                }
            } catch (InterruptedException unused3) {
                z3 = false;
            } catch (ExecutionException | TimeoutException unused4) {
                z2 = false;
            } catch (Throwable th3) {
                th = th3;
                r5 = 0;
            }
            jn.p(string);
        }
        this.u = false;
        if (this.s != null) {
            Map map = eg2Var2.b;
            long j2 = eg2Var2.c;
            long j3 = eg2Var2.d;
            int i = eg2Var2.e;
            Uri uri2 = Uri.parse(this.s.f);
            hn.O(uri2, "The uri must be set.");
            eg2Var2 = new eg2(uri2, map, j2, j3, i);
        }
        return this.k.a(eg2Var2);
    }

    @Override // defpackage.k73
    public final int d(byte[] bArr, int i, int i2) throws IOException {
        if (!this.q) {
            throw new IOException("Attempt to read closed GcacheDataSource.");
        }
        InputStream inputStream = this.p;
        int iD = inputStream != null ? inputStream.read(bArr, i, i2) : this.k.d(bArr, i, i2);
        if (this.o && this.p == null) {
            return iD;
        }
        f(iD);
        return iD;
    }

    @Override // defpackage.oe2
    public final Uri h() {
        return this.r;
    }

    public final boolean k() {
        if (!this.o) {
            return false;
        }
        ix0 ix0Var = lx0.M4;
        tu0 tu0Var = tu0.e;
        if (!((Boolean) tu0Var.c.a(ix0Var)).booleanValue() || this.v) {
            return ((Boolean) tu0Var.c.a(lx0.N4)).booleanValue() && !this.w;
        }
        return true;
    }

    @Override // defpackage.oe2
    public final void l() throws IOException {
        if (!this.q) {
            throw new IOException("Attempt to close an already closed GcacheDataSource.");
        }
        this.q = false;
        this.r = null;
        boolean z = (this.o && this.p == null) ? false : true;
        InputStream inputStream = this.p;
        if (inputStream != null) {
            ar.b(inputStream);
            this.p = null;
        } else {
            this.k.l();
        }
        if (z) {
            j();
        }
    }
}
