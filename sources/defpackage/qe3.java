package defpackage;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class qe3 implements xd3, pd0 {
    public static final Map S;
    public static final de3 T;
    public boolean A;
    public boolean B;
    public y91 C;
    public ee0 D;
    public long E;
    public boolean F;
    public int G;
    public boolean H;
    public boolean I;
    public boolean J;
    public int K;
    public boolean L;
    public long M;
    public long N;
    public boolean O;
    public int P;
    public boolean Q;
    public boolean R;
    public final Uri f;
    public final oe2 g;
    public final ig h;
    public final xb3 i;
    public final xb3 j;
    public final we3 k;
    public final fg3 l;
    public final long m;
    public final long n;
    public final hb3 p;
    public final Handler t;
    public wd3 u;
    public sf0 v;
    public ze3[] w;
    public pe3[] x;
    public boolean y;
    public boolean z;
    public final p83 o = new p83(1);
    public final km1 q = new km1();
    public final ne3 r = new ne3(this, 2);
    public final ne3 s = new ne3(this, 0);

    static {
        HashMap map = new HashMap();
        map.put("Icy-MetaData", "1");
        S = Collections.unmodifiableMap(map);
        uc3 uc3Var = new uc3();
        uc3Var.a = "icy";
        uc3Var.e("application/x-icy");
        T = new de3(uc3Var);
    }

    public qe3(Uri uri, oe2 oe2Var, hb3 hb3Var, ig igVar, xb3 xb3Var, xb3 xb3Var2, we3 we3Var, fg3 fg3Var, int i, long j) {
        this.f = uri;
        this.g = oe2Var;
        this.h = igVar;
        this.j = xb3Var;
        this.i = xb3Var2;
        this.k = we3Var;
        this.l = fg3Var;
        this.m = i;
        this.p = hb3Var;
        this.n = j;
        Looper looperMyLooper = Looper.myLooper();
        looperMyLooper.getClass();
        this.t = new Handler(looperMyLooper, null);
        this.x = new pe3[0];
        this.w = new ze3[0];
        this.N = -9223372036854775807L;
        this.G = 1;
    }

    public final boolean A() {
        return this.N != -9223372036854775807L;
    }

    public final void B() {
        hn.M(this.z);
        this.C.getClass();
        this.D.getClass();
    }

    @Override // defpackage.xd3
    public final void a(wd3 wd3Var, long j) {
        this.u = wd3Var;
        this.q.a();
        w();
    }

    @Override // defpackage.bf3
    public final boolean b(f83 f83Var) {
        if (this.Q) {
            return false;
        }
        p83 p83Var = this.o;
        if (((IOException) p83Var.i) != null || this.O) {
            return false;
        }
        if (this.z && this.K == 0) {
            return false;
        }
        boolean zA = this.q.a();
        if (((mg3) p83Var.h) != null) {
            return zA;
        }
        w();
        return true;
    }

    public final void c(me3 me3Var, boolean z) {
        Uri uri = me3Var.b.g;
        qd3 qd3Var = new qd3();
        vd3 vd3Var = new vd3(-1, null, qz1.q(me3Var.i), qz1.q(this.E));
        xb3 xb3Var = this.i;
        xb3Var.a(new hb3(xb3Var, qd3Var, vd3Var));
        if (z) {
            return;
        }
        for (ze3 ze3Var : this.w) {
            ze3Var.i(false);
        }
        if (this.K > 0) {
            wd3 wd3Var = this.u;
            wd3Var.getClass();
            wd3Var.c(this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:56:0x009d  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a6 A[LOOP:1: B:59:0x00a4->B:60:0x00a6, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:63:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:65:0x00c2 A[LOOP:2: B:64:0x00c0->B:65:0x00c2, LOOP_END] */
    /* JADX WARN: Instruction removed from duplicated block: B:58:0x00a0, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:63:0x00b9, please report this as an issue */
    @Override // defpackage.xd3
    public final long d(long j) throws Throwable {
        p83 p83Var;
        int i;
        int i2;
        boolean zK;
        B();
        boolean[] zArr = (boolean[]) this.C.h;
        if (true != this.D.c()) {
            j = 0;
        }
        this.I = false;
        long j2 = this.M;
        this.M = j;
        if (A()) {
            this.N = j;
            return j;
        }
        if (this.G == 7 || (!this.Q && ((mg3) this.o.h) == null)) {
            this.O = false;
            this.N = j;
            this.Q = false;
            this.J = false;
            p83Var = this.o;
            if (((mg3) p83Var.h) != null) {
                p83Var.i = null;
                for (ze3 ze3Var : this.w) {
                    ze3Var.i(false);
                }
                break;
            }
            for (ze3 ze3Var2 : this.w) {
                ze3Var2.l();
            }
            mg3 mg3Var = (mg3) p83Var.h;
            mg3Var.getClass();
            mg3Var.a(false);
            return j;
        }
        int length = this.w.length;
        for (int i3 = 0; i3 < length; i3++) {
            ze3 ze3Var3 = this.w[i3];
            int i4 = ze3Var3.p;
            if (ze3Var3.r + i4 != 0 || j2 != j) {
                if (this.B) {
                    synchronized (ze3Var3) {
                        synchronized (ze3Var3) {
                            ze3Var3.r = 0;
                            xe3 xe3Var = ze3Var3.a;
                            xe3Var.d = xe3Var.c;
                        }
                    }
                    int i5 = ze3Var3.p;
                    if (i4 < i5 || i4 > ze3Var3.o + i5) {
                        zK = false;
                    } else {
                        ze3Var3.s = Long.MIN_VALUE;
                        ze3Var3.r = i4 - i5;
                        zK = true;
                    }
                } else {
                    zK = ze3Var3.k(j, this.Q);
                }
                if (!zK && (zArr[i3] || !this.A)) {
                    this.O = false;
                    this.N = j;
                    this.Q = false;
                    this.J = false;
                    p83Var = this.o;
                    if (((mg3) p83Var.h) != null) {
                        p83Var.i = null;
                        while (i < r0) {
                            ze3Var.i(false);
                        }
                        break;
                        break;
                    }
                    while (i2 < r2) {
                        ze3Var2.l();
                    }
                    mg3 mg3Var2 = (mg3) p83Var.h;
                    mg3Var2.getClass();
                    mg3Var2.a(false);
                    return j;
                }
            }
        }
        return j;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0032  */
    @Override // defpackage.xd3
    public final void e(long j) {
        long j2;
        long jG;
        int i;
        if (this.B) {
            return;
        }
        B();
        if (A()) {
            return;
        }
        boolean[] zArr = (boolean[]) this.C.i;
        int length = this.w.length;
        int i2 = 0;
        while (i2 < length) {
            ze3 ze3Var = this.w[i2];
            boolean z = zArr[i2];
            xe3 xe3Var = ze3Var.a;
            synchronized (ze3Var) {
                try {
                    int i3 = ze3Var.o;
                    if (i3 != 0) {
                        long[] jArr = ze3Var.m;
                        int i4 = ze3Var.q;
                        if (j < jArr[i4]) {
                            j2 = j;
                        } else {
                            j2 = j;
                            int iF = ze3Var.f(i4, (!z || (i = ze3Var.r) == i3) ? i3 : i + 1, j2, false);
                            jG = iF != -1 ? ze3Var.g(iF) : -1L;
                        }
                    } else {
                        j2 = j;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            xe3Var.a(jG);
            i2++;
            j = j2;
        }
    }

    @Override // defpackage.xd3
    public final long f() {
        if (this.J) {
            this.J = false;
        } else {
            if (!this.I) {
                return -9223372036854775807L;
            }
            if (!this.Q && x() <= this.P) {
                return -9223372036854775807L;
            }
            this.I = false;
        }
        return this.M;
    }

    public final void g(me3 me3Var) {
        if (this.E == -9223372036854775807L && this.D != null) {
            long jY = y(true);
            long j = jY == Long.MIN_VALUE ? 0L : jY + 10000;
            this.E = j;
            this.k.s(j, this.D, this.F);
        }
        Uri uri = me3Var.b.g;
        qd3 qd3Var = new qd3();
        vd3 vd3Var = new vd3(-1, null, qz1.q(me3Var.i), qz1.q(this.E));
        xb3 xb3Var = this.i;
        xb3Var.a(new dy2(xb3Var, qd3Var, vd3Var));
        this.Q = true;
        wd3 wd3Var = this.u;
        wd3Var.getClass();
        wd3Var.c(this);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0065  */
    /* JADX WARN: Code duplicated, block: B:31:0x006c  */
    /* JADX WARN: Code duplicated, block: B:34:0x0071  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:68:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:77:0x00d7 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:78:0x00d8 A[RETURN] */
    @Override // defpackage.xd3
    public final long h(long j, c93 c93Var) {
        long j2;
        boolean z;
        long j3;
        boolean z2;
        B();
        if (!this.D.c()) {
            return 0L;
        }
        de0 de0VarG = this.D.g(j);
        fe0 fe0Var = de0VarG.a;
        fe0 fe0Var2 = de0VarG.b;
        long j4 = c93Var.a;
        long j5 = c93Var.b;
        if (j4 == 0) {
            if (j5 == 0) {
                return j;
            }
            j4 = 0;
        }
        String str = qz1.a;
        long j6 = j - j4;
        long j7 = Long.MAX_VALUE;
        long j8 = (((j ^ j6) > 0L ? 1 : ((j ^ j6) == 0L ? 0 : -1)) >= 0) | (((j4 ^ j) > 0L ? 1 : ((j4 ^ j) == 0L ? 0 : -1)) >= 0) ? j6 : ((j6 >>> 63) ^ 1) + Long.MAX_VALUE;
        long j9 = Long.MIN_VALUE;
        if (j8 != Long.MIN_VALUE) {
            if (j8 == Long.MAX_VALUE) {
                if (j6 != Long.MAX_VALUE) {
                    j8 = Long.MIN_VALUE;
                } else {
                    j8 = Long.MAX_VALUE;
                }
            }
        } else if (j6 == Long.MIN_VALUE) {
            j6 = Long.MIN_VALUE;
            if (j8 == Long.MAX_VALUE) {
                if (j6 != Long.MAX_VALUE) {
                    j8 = Long.MIN_VALUE;
                } else {
                    j8 = Long.MAX_VALUE;
                }
            }
        } else {
            j8 = Long.MIN_VALUE;
        }
        long j10 = j + j5;
        long j11 = (((j ^ j10) > 0L ? 1 : ((j ^ j10) == 0L ? 0 : -1)) >= 0) | (((j5 ^ j) > 0L ? 1 : ((j5 ^ j) == 0L ? 0 : -1)) < 0) ? j10 : ((j10 >>> 63) ^ 1) + Long.MAX_VALUE;
        if (j11 == Long.MIN_VALUE) {
            if (j10 == Long.MIN_VALUE) {
            }
            j2 = fe0Var.a;
            if (j8 <= j2 || j2 > j7) {
                z = false;
            } else {
                z = true;
            }
            j3 = fe0Var2.a;
            z2 = j8 > j3 && j3 <= j7;
            if (!z && z2) {
                if (Math.abs(j2 - j) <= Math.abs(j3 - j)) {
                    return j2;
                }
                return j3;
            }
            if (!z) {
                if (z2) {
                    return j3;
                }
                return j8;
            }
            return j2;
        }
        j9 = j10;
        if (j11 == Long.MAX_VALUE) {
            int i = (j9 > Long.MAX_VALUE ? 1 : (j9 == Long.MAX_VALUE ? 0 : -1));
        } else {
            j7 = j11;
        }
        j2 = fe0Var.a;
        if (j8 <= j2) {
            z = false;
        } else {
            z = false;
        }
        j3 = fe0Var2.a;
        if (j8 > j3) {
        }
        if (!z) {
        }
        if (!z) {
            if (z2) {
                return j3;
            }
            return j8;
        }
        return j2;
    }

    @Override // defpackage.bf3
    public final long i() {
        return j();
    }

    @Override // defpackage.bf3
    public final long j() {
        long jY;
        boolean z;
        long j;
        B();
        if (this.Q || this.K == 0) {
            return Long.MIN_VALUE;
        }
        if (A()) {
            return this.N;
        }
        if (this.A) {
            int length = this.w.length;
            jY = Long.MAX_VALUE;
            for (int i = 0; i < length; i++) {
                y91 y91Var = this.C;
                if (((boolean[]) y91Var.h)[i] && ((boolean[]) y91Var.i)[i]) {
                    ze3 ze3Var = this.w[i];
                    synchronized (ze3Var) {
                        z = ze3Var.v;
                    }
                    if (z) {
                        continue;
                    } else {
                        ze3 ze3Var2 = this.w[i];
                        synchronized (ze3Var2) {
                            j = ze3Var2.u;
                        }
                        jY = Math.min(jY, j);
                    }
                }
            }
        } else {
            jY = Long.MAX_VALUE;
        }
        if (jY == Long.MAX_VALUE) {
            jY = y(false);
        }
        return jY == Long.MIN_VALUE ? this.M : jY;
    }

    @Override // defpackage.xd3
    public final gf3 l() {
        B();
        return (gf3) this.C.g;
    }

    @Override // defpackage.xd3
    public final long m(bg3[] bg3VarArr, boolean[] zArr, af3[] af3VarArr, boolean[] zArr2, long j) throws Throwable {
        bg3 bg3Var;
        B();
        y91 y91Var = this.C;
        gf3 gf3Var = (gf3) y91Var.g;
        boolean[] zArr3 = (boolean[]) y91Var.i;
        int i = this.K;
        for (int i2 = 0; i2 < bg3VarArr.length; i2++) {
            af3 af3Var = af3VarArr[i2];
            if (af3Var != null && (bg3VarArr[i2] == null || !zArr[i2])) {
                int i3 = ((oe3) af3Var).a;
                hn.M(zArr3[i3]);
                this.K--;
                zArr3[i3] = false;
                af3VarArr[i2] = null;
            }
        }
        boolean z = !this.H ? j == 0 || this.B : i != 0;
        for (int i4 = 0; i4 < bg3VarArr.length; i4++) {
            if (af3VarArr[i4] == null && (bg3Var = bg3VarArr[i4]) != null) {
                hn.M(bg3Var.b() == 1);
                hn.M(bg3Var.t(0) == 0);
                int iIndexOf = gf3Var.b.indexOf(bg3Var.a());
                if (iIndexOf < 0) {
                    iIndexOf = -1;
                }
                hn.M(!zArr3[iIndexOf]);
                this.K++;
                zArr3[iIndexOf] = true;
                this.J = bg3Var.h().s | this.J;
                af3VarArr[i4] = new oe3(this, iIndexOf);
                zArr2[i4] = true;
                if (!z) {
                    ze3 ze3Var = this.w[iIndexOf];
                    z = (ze3Var.p + ze3Var.r == 0 || ze3Var.k(j, true)) ? false : true;
                }
            }
        }
        if (this.K == 0) {
            this.O = false;
            this.I = false;
            this.J = false;
            p83 p83Var = this.o;
            if (((mg3) p83Var.h) != null) {
                for (ze3 ze3Var2 : this.w) {
                    ze3Var2.l();
                }
                mg3 mg3Var = (mg3) p83Var.h;
                mg3Var.getClass();
                mg3Var.a(false);
            } else {
                this.Q = false;
                for (ze3 ze3Var3 : this.w) {
                    ze3Var3.i(false);
                }
            }
        } else if (z) {
            j = d(j);
            for (int i5 = 0; i5 < af3VarArr.length; i5++) {
                if (af3VarArr[i5] != null) {
                    zArr2[i5] = true;
                }
            }
        }
        this.H = true;
        return j;
    }

    public final void n(int i) {
        B();
        y91 y91Var = this.C;
        boolean[] zArr = (boolean[]) y91Var.j;
        if (zArr[i]) {
            return;
        }
        de3 de3Var = ((gf3) y91Var.g).a(i).d[0];
        vd3 vd3Var = new vd3(rn0.g(de3Var.m), de3Var, qz1.q(this.M), -9223372036854775807L);
        xb3 xb3Var = this.i;
        xb3Var.a(new fe3(xb3Var, vd3Var));
        zArr[i] = true;
    }

    @Override // defpackage.bf3
    public final boolean o() {
        boolean z;
        if (((mg3) this.o.h) == null) {
            return false;
        }
        km1 km1Var = this.q;
        synchronized (km1Var) {
            z = km1Var.a;
        }
        return z;
    }

    public final void p(int i) {
        B();
        if (this.O) {
            if ((!this.A || ((boolean[]) this.C.h)[i]) && !this.w[i].j(false)) {
                this.N = 0L;
                this.O = false;
                this.I = true;
                this.M = 0L;
                this.P = 0;
                for (ze3 ze3Var : this.w) {
                    ze3Var.i(false);
                }
                wd3 wd3Var = this.u;
                wd3Var.getClass();
                wd3Var.c(this);
            }
        }
    }

    public final boolean q() {
        return this.I || A();
    }

    @Override // defpackage.xd3
    public final void r() throws IOException {
        IOException iOException;
        int i = this.G == 7 ? 6 : 3;
        p83 p83Var = this.o;
        IOException iOException2 = (IOException) p83Var.i;
        if (iOException2 != null) {
            throw iOException2;
        }
        mg3 mg3Var = (mg3) p83Var.h;
        if (mg3Var != null && (iOException = mg3Var.h) != null && mg3Var.i > i) {
            throw iOException;
        }
        if (this.Q && !this.z) {
            throw no0.a(null, "Loading finished before preparation is complete.");
        }
    }

    @Override // defpackage.pd0
    public final void s() {
        this.y = true;
        this.t.post(this.r);
    }

    public final me0 t(pe3 pe3Var) {
        int length = this.w.length;
        for (int i = 0; i < length; i++) {
            if (pe3Var.equals(this.x[i])) {
                return this.w[i];
            }
        }
        if (this.y) {
            int i2 = pe3Var.a;
            StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 55);
            sb.append("Extractor added new track (id=");
            sb.append(i2);
            sb.append(") after finishing tracks.");
            s90.Q("ProgressiveMediaPeriod", sb.toString());
            return new id0();
        }
        ze3 ze3Var = new ze3(this.l, this.h, this.j);
        ze3Var.e = this;
        int i3 = length + 1;
        pe3[] pe3VarArr = (pe3[]) Arrays.copyOf(this.x, i3);
        pe3VarArr[length] = pe3Var;
        String str = qz1.a;
        this.x = pe3VarArr;
        ze3[] ze3VarArr = (ze3[]) Arrays.copyOf(this.w, i3);
        ze3VarArr[length] = ze3Var;
        this.w = ze3VarArr;
        return ze3Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void u() {
        de3 de3Var;
        am0 am0VarC;
        int i;
        de3 de3Var2;
        long j = this.n;
        if (this.R || this.z || !this.y || this.D == null) {
            return;
        }
        ze3[] ze3VarArr = this.w;
        int length = ze3VarArr.length;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i3 >= length) {
                km1 km1Var = this.q;
                synchronized (km1Var) {
                    km1Var.a = false;
                }
                int length2 = this.w.length;
                cy0[] cy0VarArr = new cy0[length2];
                boolean[] zArr = new boolean[length2];
                int i4 = 0;
                while (true) {
                    int i5 = 1;
                    if (i4 >= length2) {
                        break;
                    }
                    ze3 ze3Var = this.w[i4];
                    synchronized (ze3Var) {
                        de3Var = ze3Var.x ? null : ze3Var.y;
                    }
                    de3Var.getClass();
                    String str = de3Var.m;
                    boolean zA = rn0.a(str);
                    boolean z = (zA || rn0.b(str)) ? true : i2;
                    zArr[i4] = z;
                    int i6 = i2;
                    this.A = (this.A ? 1 : 0) | (z ? 1 : 0);
                    this.B = (j != -9223372036854775807L && length2 == 1 && rn0.c(str)) ? 1 : i6;
                    sf0 sf0Var = this.v;
                    if (sf0Var != null) {
                        if (zA || this.x[i4].b) {
                            am0 am0Var = de3Var.k;
                            if (am0Var == null) {
                                il0[] il0VarArr = new il0[1];
                                il0VarArr[i6] = sf0Var;
                                am0VarC = new am0(il0VarArr);
                            } else {
                                il0[] il0VarArr2 = new il0[1];
                                il0VarArr2[i6] = sf0Var;
                                am0VarC = am0Var.c(il0VarArr2);
                            }
                            uc3 uc3Var = new uc3(de3Var);
                            uc3Var.j = am0VarC;
                            de3Var = new de3(uc3Var);
                        }
                        if (zA && de3Var.g == -1 && de3Var.h == -1 && (i = sf0Var.a) != -1) {
                            uc3 uc3Var2 = new uc3(de3Var);
                            uc3Var2.g = i;
                            de3Var = new de3(uc3Var2);
                        }
                    }
                    this.h.getClass();
                    if (de3Var.q == null) {
                        i5 = i6;
                    }
                    uc3 uc3Var3 = new uc3(de3Var);
                    uc3Var3.K = i5;
                    de3 de3Var3 = new de3(uc3Var3);
                    cy0VarArr[i4] = new cy0(Integer.toString(i4), de3Var3);
                    this.J |= de3Var3.s;
                    i4++;
                    i2 = i6;
                }
                this.C = new y91(new gf3(cy0VarArr), zArr);
                if (this.B && this.E == -9223372036854775807L) {
                    this.E = j;
                    this.D = new le3(this, this.D);
                }
                this.k.s(this.E, this.D, this.F);
                this.z = true;
                wd3 wd3Var = this.u;
                wd3Var.getClass();
                wd3Var.g(this);
                return;
            }
            ze3 ze3Var2 = ze3VarArr[i3];
            synchronized (ze3Var2) {
                de3Var2 = ze3Var2.x ? null : ze3Var2.y;
            }
            if (de3Var2 == null) {
                return;
            } else {
                i3++;
            }
        }
    }

    @Override // defpackage.pd0
    public final void v(ee0 ee0Var) {
        this.t.post(new u52(this, 25, ee0Var));
    }

    public final void w() {
        me3 me3Var = new me3(this, this.f, this.g, this.p, this, this.q);
        if (this.z) {
            hn.M(A());
            long j = this.E;
            if (j != -9223372036854775807L && this.N > j) {
                this.Q = true;
                this.N = -9223372036854775807L;
                return;
            }
            ee0 ee0Var = this.D;
            ee0Var.getClass();
            fe0 fe0Var = ee0Var.g(this.N).a;
            long j2 = this.N;
            me3Var.f.a = fe0Var.b;
            me3Var.i = j2;
            me3Var.h = true;
            me3Var.l = false;
            for (ze3 ze3Var : this.w) {
                ze3Var.s = this.N;
            }
            this.N = -9223372036854775807L;
        }
        this.P = x();
        p83 p83Var = this.o;
        p83Var.getClass();
        Looper looperMyLooper = Looper.myLooper();
        looperMyLooper.getClass();
        p83Var.i = null;
        mg3 mg3Var = new mg3(p83Var, looperMyLooper, me3Var, this, SystemClock.elapsedRealtime());
        p83 p83Var2 = mg3Var.m;
        hn.M(((mg3) p83Var2.h) == null);
        p83Var2.h = mg3Var;
        mg3Var.b();
    }

    public final int x() {
        int i = 0;
        for (ze3 ze3Var : this.w) {
            i += ze3Var.p + ze3Var.o;
        }
        return i;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x001a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x0017  */
    public final long y(boolean z) {
        ze3 ze3Var;
        int i = 0;
        long jMax = Long.MIN_VALUE;
        while (true) {
            ze3[] ze3VarArr = this.w;
            if (i >= ze3VarArr.length) {
                return jMax;
            }
            if (z) {
                ze3Var = ze3VarArr[i];
                synchronized (ze3Var) {
                    jMax = Math.max(jMax, ze3Var.u);
                }
            } else {
                y91 y91Var = this.C;
                y91Var.getClass();
                if (((boolean[]) y91Var.i)[i]) {
                    ze3Var = ze3VarArr[i];
                    synchronized (ze3Var) {
                    }
                    jMax = Math.max(jMax, ze3Var.u);
                } else {
                    continue;
                }
            }
            i++;
        }
    }

    @Override // defpackage.pd0
    public final me0 z(int i, int i2) {
        return t(new pe3(i, false));
    }

    @Override // defpackage.bf3
    public final void k(long j) {
    }
}
