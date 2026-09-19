package defpackage;

import android.content.Context;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Pair;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class b83 implements Handler.Callback, wd3, dc0 {
    public static final long i0 = qz1.q(10000);
    public final z93 A;
    public final wx1 B;
    public final boolean C;
    public final iz2 D;
    public c93 E;
    public boolean G;
    public boolean H;
    public a83 I;
    public int J;
    public u83 K;
    public zk0 L;
    public boolean M;
    public boolean O;
    public boolean P;
    public boolean R;
    public boolean U;
    public int V;
    public a83 W;
    public long X;
    public long Y;
    public int Z;
    public boolean a0;
    public q43 b0;
    public a73 d0;
    public final a93[] f;
    public boolean f0;
    public final yc3[] g;
    public final boolean[] h;
    public final z03 h0;
    public final zf3 i;
    public final dg3 j;
    public final d83 k;
    public final kg3 l;
    public final wx1 m;
    public final g2 n;
    public final Looper o;
    public final ex0 p;
    public final su0 q;
    public final long r;
    public final c22 s;
    public final ArrayList t;
    public final ig u;
    public final gv1 v;
    public final j83 w;
    public final c00 x;
    public final long y;
    public final la3 z;
    public long e0 = -9223372036854775807L;
    public int S = 0;
    public boolean T = false;
    public boolean N = false;
    public float g0 = 1.0f;
    public b93 F = b93.b;
    public long c0 = -9223372036854775807L;
    public long Q = -9223372036854775807L;

    public b83(Context context, yc3[] yc3VarArr, yc3[] yc3VarArr2, zf3 zf3Var, dg3 dg3Var, d83 d83Var, kg3 kg3Var, z93 z93Var, c93 c93Var, z03 z03Var, long j, Looper looper, ig igVar, gv1 gv1Var, la3 la3Var, a73 a73Var) {
        Looper looper2;
        this.v = gv1Var;
        this.i = zf3Var;
        this.j = dg3Var;
        this.k = d83Var;
        this.l = kg3Var;
        boolean z = false;
        this.E = c93Var;
        this.h0 = z03Var;
        this.y = j;
        this.u = igVar;
        this.z = la3Var;
        this.d0 = a73Var;
        this.A = z93Var;
        this.r = d83Var.d();
        cu0 cu0Var = ox0.a;
        u83 u83VarA = u83.a(dg3Var);
        this.K = u83VarA;
        this.L = new zk0(u83VarA);
        int length = yc3VarArr.length;
        this.g = new yc3[2];
        this.h = new boolean[2];
        zf3Var.getClass();
        this.f = new a93[2];
        boolean z2 = false;
        for (int i = 0; i < 2; i++) {
            yc3 yc3Var = yc3VarArr[i];
            yc3Var.j = i;
            yc3Var.k = la3Var;
            yc3Var.l = igVar;
            yc3[] yc3VarArr3 = this.g;
            yc3Var.getClass();
            yc3VarArr3[i] = yc3Var;
            yc3 yc3Var2 = this.g[i];
            synchronized (yc3Var2.f) {
                yc3Var2.w = zf3Var;
            }
            yc3 yc3Var3 = yc3VarArr2[i];
            if (yc3Var3 != null) {
                yc3Var3.j = i;
                yc3Var3.k = la3Var;
                yc3Var3.l = igVar;
                z2 = true;
            }
            this.f[i] = new a93(yc3VarArr[i], yc3Var3, i);
        }
        this.C = z2;
        this.s = new c22(this);
        this.t = new ArrayList();
        this.p = new ex0();
        this.q = new su0();
        hn.M(zf3Var.a == null);
        zf3Var.a = this;
        zf3Var.b = kg3Var;
        this.a0 = true;
        wx1 wx1VarI = igVar.i(looper, null);
        this.B = wx1VarI;
        this.w = new j83(z93Var, wx1VarI, new j52(this), a73Var);
        this.x = new c00(this, z93Var, wx1VarI, la3Var);
        g2 g2Var = new g2(7);
        this.n = g2Var;
        synchronized (g2Var.h) {
            try {
                if (((Looper) g2Var.i) == null) {
                    if (g2Var.g == 0 && ((HandlerThread) g2Var.j) == null) {
                        z = true;
                    }
                    hn.M(z);
                    HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
                    g2Var.j = handlerThread;
                    handlerThread.start();
                    g2Var.i = ((HandlerThread) g2Var.j).getLooper();
                }
                g2Var.g++;
                looper2 = (Looper) g2Var.i;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.o = looper2;
        wx1 wx1VarI2 = igVar.i(looper2, this);
        this.m = wx1VarI2;
        this.D = new iz2(context, looper2, this);
        wx1VarI2.a(35, new dc0() { // from class: r73
            @Override // defpackage.dc0
            public final /* synthetic */ void b(long j2, long j3, de3 de3Var, MediaFormat mediaFormat) {
                this.f.b(j2, j3, de3Var, mediaFormat);
            }
        }).a();
    }

    public static final boolean A(h83 h83Var) {
        if (h83Var != null) {
            try {
                xd3 xd3Var = h83Var.a;
                if (h83Var.e) {
                    af3[] af3VarArr = h83Var.c;
                    for (int i = 0; i < 2; i++) {
                        af3 af3Var = af3VarArr[i];
                        if (af3Var != null) {
                            af3Var.h();
                        }
                    }
                } else {
                    xd3Var.r();
                }
                if ((!h83Var.e ? 0L : xd3Var.i()) != Long.MIN_VALUE) {
                    return true;
                }
            } catch (IOException unused) {
            }
        }
        return false;
    }

    public static int W(ex0 ex0Var, su0 su0Var, int i, boolean z, Object obj, ox0 ox0Var, ox0 ox0Var2) {
        ox0 ox0Var3 = ox0Var;
        Object obj2 = ox0Var3.b(ox0Var3.o(obj, su0Var).c, ex0Var, 0L).a;
        for (int i2 = 0; i2 < ox0Var2.a(); i2++) {
            if (ox0Var2.b(i2, ex0Var, 0L).a.equals(obj2)) {
                return i2;
            }
        }
        int iE = ox0Var3.e(obj);
        int iC = ox0Var3.c();
        int iE2 = -1;
        int i3 = 0;
        while (i3 < iC && iE2 == -1) {
            ox0 ox0Var4 = ox0Var3;
            int iL = ox0Var4.l(iE, su0Var, ex0Var, i, z);
            if (iL == -1) {
                iE2 = -1;
                break;
            }
            iE2 = ox0Var2.e(ox0Var4.f(iL));
            i3++;
            ox0Var3 = ox0Var4;
            iE = iL;
        }
        if (iE2 == -1) {
            return -1;
        }
        return ox0Var2.d(iE2, su0Var, false).c;
    }

    public static Pair z(ox0 ox0Var, a83 a83Var, int i, boolean z, ex0 ex0Var, su0 su0Var) {
        ox0 ox0Var2 = a83Var.a;
        if (ox0Var.g()) {
            return null;
        }
        ox0 ox0Var3 = true == ox0Var2.g() ? ox0Var : ox0Var2;
        try {
            Pair pairM = ox0Var3.m(ex0Var, su0Var, a83Var.b, a83Var.c);
            if (!ox0Var.equals(ox0Var3)) {
                int iE = ox0Var.e(pairM.first);
                Object obj = pairM.first;
                if (iE == -1) {
                    int iW = W(ex0Var, su0Var, i, z, obj, ox0Var3, ox0Var);
                    if (iW != -1) {
                        return ox0Var.m(ex0Var, su0Var, iW, -9223372036854775807L);
                    }
                    return null;
                }
                if (ox0Var3.o(obj, su0Var).e && ox0Var3.b(su0Var.c, ex0Var, 0L).k == ox0Var3.e(pairM.first)) {
                    return ox0Var.m(ex0Var, su0Var, ox0Var.o(pairM.first, su0Var).c, a83Var.c);
                }
            }
            return pairM;
        } catch (IndexOutOfBoundsException unused) {
            return null;
        }
    }

    public final void B() {
        for (int i = 0; i < 2; i++) {
            a93[] a93VarArr = this.f;
            int iR = a93VarArr[i].r();
            a93 a93Var = a93VarArr[i];
            yc3 yc3Var = a93Var.a;
            yc3 yc3Var2 = a93Var.c;
            c22 c22Var = this.s;
            a93Var.i(yc3Var, c22Var);
            if (yc3Var2 != null) {
                boolean z = (yc3Var2.m == 0 || a93Var.d == 3) ? false : true;
                a93Var.i(yc3Var2, c22Var);
                a93Var.j(false);
                if (z) {
                    yc3 yc3Var3 = a93Var.a;
                    yc3Var2.getClass();
                    yc3Var2.a(17, yc3Var3);
                }
            }
            a93Var.d = 0;
            m(i, false);
            this.V -= iR;
        }
        this.e0 = -9223372036854775807L;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0030  */
    /* JADX WARN: Code duplicated, block: B:21:0x0033  */
    /* JADX WARN: Code duplicated, block: B:25:0x0043  */
    public final void C() {
        boolean z;
        yc3 yc3Var;
        if (!this.C || !V()) {
            return;
        }
        int i = 0;
        while (true) {
            int i2 = 2;
            if (i >= 2) {
                this.e0 = -9223372036854775807L;
                return;
            }
            a93 a93Var = this.f[i];
            int iR = a93Var.r();
            if (a93Var.q()) {
                int i3 = a93Var.d;
                if (i3 != 4) {
                    if (i3 != 2) {
                        i2 = i3;
                        z = false;
                    }
                    if (z) {
                        yc3Var = a93Var.a;
                    } else {
                        yc3Var = a93Var.c;
                        yc3Var.getClass();
                    }
                    a93Var.i(yc3Var, this.s);
                    a93Var.j(z);
                    a93Var.d = i2 != 4 ? 0 : 1;
                } else {
                    i2 = i3;
                }
                z = true;
                if (z) {
                    yc3Var = a93Var.a;
                } else {
                    yc3Var = a93Var.c;
                    yc3Var.getClass();
                }
                a93Var.i(yc3Var, this.s);
                a93Var.j(z);
                a93Var.d = i2 != 4 ? 0 : 1;
            }
            this.V -= iR - a93Var.r();
            i++;
        }
    }

    /* JADX WARN: Code duplicated, block: B:77:0x0159  */
    /* JADX WARN: Code duplicated, block: B:90:? A[RETURN, SYNTHETIC] */
    public final void D() throws Throwable {
        int i;
        int i2;
        int i3;
        c22 c22Var = this.s;
        float f = c22Var.g().a;
        j83 j83Var = this.w;
        h83 h83Var = j83Var.h;
        h83 h83Var2 = j83Var.i;
        dg3 dg3Var = null;
        h83 h83Var3 = h83Var;
        boolean z = true;
        while (h83Var3 != null && h83Var3.e) {
            dg3 dg3VarF = h83Var3.f(this.K.a);
            dg3 dg3Var2 = h83Var3 == j83Var.h ? dg3VarF : dg3Var;
            dg3 dg3Var3 = h83Var3.o;
            boolean z2 = false;
            if (dg3Var3 != null) {
                bg3[] bg3VarArr = (bg3[]) dg3VarF.h;
                if (((bg3[]) dg3Var3.h).length == bg3VarArr.length) {
                    int i4 = 0;
                    while (true) {
                        if (i4 >= bg3VarArr.length) {
                            if (h83Var3 != h83Var2) {
                                z2 = true;
                            }
                            z &= z2;
                            h83Var3 = h83Var3.m;
                            dg3Var = dg3Var2;
                        } else if (dg3VarF.b(dg3Var3, i4)) {
                            i4++;
                        }
                    }
                }
            }
            if (!z) {
                i = 4;
                j83Var.y(h83Var3);
                if (h83Var3.e) {
                    long jMax = Math.max(h83Var3.g.b, this.X - h83Var3.p);
                    if (this.C && V() && j83Var.j == h83Var3) {
                        C();
                    }
                    i2 = 4;
                    i3 = 2;
                    h83Var3.g(dg3VarF, jMax, false, new boolean[2]);
                }
                Q(true);
                if (this.K.e != i2) {
                    L();
                    l();
                    this.m.b(i3);
                    return;
                }
                return;
            }
            h83 h83Var4 = j83Var.h;
            int iY = j83Var.y(h83Var4) & 1;
            a93[] a93VarArr = this.f;
            boolean[] zArr = new boolean[2];
            dg3Var2.getClass();
            long jG = h83Var4.g(dg3Var2, this.K.r, 1 == iY, zArr);
            u83 u83Var = this.K;
            boolean z3 = (u83Var.e == 4 || jG == u83Var.r) ? false : true;
            u83 u83Var2 = this.K;
            boolean z4 = z3;
            i = 4;
            this.K = N(u83Var2.b, jG, u83Var2.c, u83Var2.d, z4, 5);
            if (z4) {
                s(jG, true);
            }
            C();
            boolean[] zArr2 = new boolean[2];
            int i5 = 0;
            for (int i6 = 2; i5 < i6; i6 = 2) {
                int iR = a93VarArr[i5].r();
                zArr2[i5] = a93VarArr[i5].g();
                a93 a93Var = a93VarArr[i5];
                af3 af3Var = h83Var4.c[i5];
                long j = this.X;
                boolean z5 = zArr[i5];
                yc3 yc3Var = a93Var.a;
                if (a93.l(yc3Var)) {
                    if (af3Var != yc3Var.n) {
                        a93Var.i(yc3Var, c22Var);
                    } else if (z5) {
                        yc3Var.L(j, false, true);
                    }
                }
                yc3 yc3Var2 = a93Var.c;
                if (yc3Var2 != null && a93.l(yc3Var2)) {
                    if (af3Var != yc3Var2.n) {
                        a93Var.i(yc3Var2, c22Var);
                    } else if (z5) {
                        yc3Var2.L(j, false, true);
                    }
                }
                if (iR - a93VarArr[i5].r() > 0) {
                    m(i5, false);
                }
                this.V -= iR - a93VarArr[i5].r();
                i5++;
            }
            O(zArr2, this.X);
            h83Var4.h = true;
            i2 = i;
            i3 = 2;
            Q(true);
            if (this.K.e != i2) {
                L();
                l();
                this.m.b(i3);
                return;
            }
            return;
        }
    }

    public final boolean E() {
        h83 h83Var = this.w.h;
        long j = h83Var.g.e;
        if (h83Var.e) {
            return j == -9223372036854775807L || this.K.r < j || !T();
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0221  */
    /* JADX WARN: Code duplicated, block: B:103:0x0229  */
    /* JADX WARN: Code duplicated, block: B:19:0x005b  */
    /* JADX WARN: Code duplicated, block: B:22:0x0062  */
    /* JADX WARN: Code duplicated, block: B:235:0x03d9  */
    /* JADX WARN: Code duplicated, block: B:236:0x03dc  */
    /* JADX WARN: Code duplicated, block: B:239:0x03e8  */
    /* JADX WARN: Code duplicated, block: B:243:0x03f4  */
    /* JADX WARN: Code duplicated, block: B:245:0x03fe A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:24:0x006b  */
    /* JADX WARN: Code duplicated, block: B:251:0x0411  */
    /* JADX WARN: Code duplicated, block: B:254:0x041d  */
    /* JADX WARN: Code duplicated, block: B:256:0x0426  */
    /* JADX WARN: Code duplicated, block: B:25:0x0077  */
    /* JADX WARN: Code duplicated, block: B:260:0x044b  */
    /* JADX WARN: Code duplicated, block: B:27:0x007f  */
    /* JADX WARN: Code duplicated, block: B:28:0x008a  */
    /* JADX WARN: Code duplicated, block: B:31:0x009c  */
    /* JADX WARN: Code duplicated, block: B:32:0x009e  */
    /* JADX WARN: Code duplicated, block: B:35:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:37:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:38:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:40:0x00db  */
    /* JADX WARN: Code duplicated, block: B:42:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:43:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:46:0x0103  */
    /* JADX WARN: Code duplicated, block: B:48:0x0108  */
    /* JADX WARN: Code duplicated, block: B:49:0x0119 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:50:0x011b  */
    /* JADX WARN: Code duplicated, block: B:52:0x012e  */
    /* JADX WARN: Code duplicated, block: B:53:0x014c  */
    /* JADX WARN: Code duplicated, block: B:55:0x0156  */
    /* JADX WARN: Code duplicated, block: B:56:0x016b  */
    /* JADX WARN: Code duplicated, block: B:58:0x017b  */
    /* JADX WARN: Code duplicated, block: B:60:0x018a  */
    /* JADX WARN: Code duplicated, block: B:61:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:69:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:79:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:82:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:85:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:88:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:90:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:91:0x01ff  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v18, types: [int] */
    /* JADX WARN: Type inference failed for: r8v29 */
    /* JADX WARN: Type inference failed for: r8v30 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8, types: [int] */
    public final void F(ox0 ox0Var, boolean z) throws Throwable {
        long j;
        boolean z2;
        long j2;
        Object obj;
        ex0 ex0Var;
        yd3 yd3Var;
        su0 su0Var;
        ox0 ox0Var2;
        ox0 ox0Var3;
        boolean z3;
        Object obj2;
        boolean z4;
        boolean z5;
        boolean z6;
        int iK;
        int i;
        long jMax;
        int iW;
        boolean z7;
        su0 su0Var2;
        Object obj3;
        long jLongValue;
        yd3 yd3VarE;
        boolean z8;
        su0 su0VarO;
        long j3;
        long jR;
        boolean z9;
        boolean z10;
        yd3 yd3Var2;
        int i2;
        fb0 fb0VarA;
        ?? r8;
        int[] iArr;
        int i3;
        Pair pairZ;
        long j4;
        Object obj4;
        long jLongValue2;
        Object obj5;
        boolean z11;
        boolean z12;
        boolean z13;
        Object obj6;
        boolean z14;
        long j5;
        boolean z15;
        int i4;
        int i5;
        boolean z16;
        a83 a83Var;
        long j6;
        yd3 yd3Var3;
        ox0 ox0Var4;
        Object obj7;
        int i6;
        h83 h83Var;
        u83 u83Var = this.K;
        a83 a83Var2 = this.W;
        int i7 = this.S;
        boolean z17 = this.T;
        if (ox0Var.g()) {
            ox0Var2 = ox0Var;
            yd3Var2 = u83.t;
            z9 = false;
            z10 = false;
            jR = 0;
            z3 = false;
            j = -9223372036854775807L;
            z6 = true;
            j2 = -9223372036854775807L;
        } else {
            su0 su0Var3 = this.q;
            yd3 yd3Var4 = u83Var.b;
            Object obj8 = yd3Var4.a;
            ox0 ox0Var5 = u83Var.a;
            if (ox0Var5.g()) {
                j = -9223372036854775807L;
            } else {
                j = -9223372036854775807L;
                if (!ox0Var5.o(yd3Var4.a, su0Var3).e) {
                    z2 = false;
                }
                if (!yd3Var4.b() || z2) {
                    j2 = u83Var.c;
                } else {
                    j2 = u83Var.r;
                }
                obj = obj8;
                ex0Var = this.p;
                if (a83Var2 != null) {
                    yd3Var = yd3Var4;
                    ox0Var2 = ox0Var;
                    pairZ = z(ox0Var2, a83Var2, i7, z17, ex0Var, su0Var3);
                    if (pairZ == null) {
                        iK = ox0Var2.k(z17);
                        obj6 = obj;
                        j5 = j2;
                        z14 = false;
                        z13 = false;
                        z6 = true;
                    } else {
                        j4 = a83Var2.c;
                        obj4 = pairZ.first;
                        if (j4 == j) {
                            iK = ox0Var2.o(obj4, su0Var3).c;
                            obj5 = obj;
                            jLongValue2 = j2;
                            z11 = false;
                        } else {
                            jLongValue2 = ((Long) pairZ.second).longValue();
                            obj5 = obj4;
                            iK = -1;
                            z11 = true;
                        }
                        long j7 = jLongValue2;
                        if (u83Var.e == 4) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        z13 = z11;
                        obj6 = obj5;
                        z14 = z12;
                        j5 = j7;
                        z6 = false;
                    }
                    j2 = j5;
                    su0Var = su0Var3;
                    z4 = z14;
                    obj2 = obj6;
                    z5 = z13;
                    i = -1;
                    z3 = false;
                } else {
                    yd3Var = yd3Var4;
                    su0Var = su0Var3;
                    ox0Var2 = ox0Var;
                    ox0Var3 = u83Var.a;
                    if (ox0Var3.g()) {
                        iK = ox0Var2.k(z17);
                        obj2 = obj;
                        j2 = j2;
                        i = -1;
                        z3 = false;
                        z4 = false;
                        z5 = false;
                        z6 = false;
                    } else {
                        if (ox0Var2.e(obj) == -1) {
                            z3 = false;
                            iW = W(ex0Var, su0Var, i7, z17, obj, ox0Var3, ox0Var2);
                            if (iW == -1) {
                                ex0Var = ex0Var;
                                ox0Var2 = ox0Var2;
                                obj = obj;
                                iK = ox0Var2.k(z17);
                                z7 = true;
                            } else {
                                ex0Var = ex0Var;
                                ox0Var2 = ox0Var2;
                                obj = obj;
                                iK = iW;
                                z7 = false;
                            }
                            z6 = z7;
                            obj2 = obj;
                            z4 = false;
                            z5 = false;
                        } else {
                            z3 = false;
                            if (j2 == j) {
                                iK = ox0Var2.o(obj, su0Var).c;
                                obj2 = obj;
                                z4 = false;
                                z5 = false;
                                z6 = false;
                            } else if (z2) {
                                ox0Var3.o(obj, su0Var);
                                if (ox0Var3.b(su0Var.c, ex0Var, 0L).k == ox0Var3.e(obj)) {
                                    Pair pairM = ox0Var2.m(ex0Var, su0Var, ox0Var2.o(obj, su0Var).c, j2);
                                    ex0Var = ex0Var;
                                    su0Var = su0Var;
                                    obj2 = pairM.first;
                                    jMax = ((Long) pairM.second).longValue();
                                } else if (ox0Var2.o(obj, su0Var).d != j) {
                                    long j8 = su0Var.d - 1;
                                    String str = qz1.a;
                                    jMax = Math.max(0L, Math.min(j2, j8));
                                    obj2 = obj;
                                } else {
                                    obj2 = obj;
                                    jMax = j2;
                                }
                                z4 = false;
                                z6 = false;
                                j2 = jMax;
                                iK = -1;
                                i = -1;
                                z5 = true;
                            } else {
                                obj2 = obj;
                                j2 = j2;
                                z4 = false;
                                z5 = false;
                                z6 = false;
                                iK = -1;
                                i = -1;
                            }
                        }
                        i = -1;
                    }
                }
                if (iK != i) {
                    su0Var2 = su0Var;
                    Pair pairM2 = ox0Var2.m(ex0Var, su0Var2, iK, -9223372036854775807L);
                    obj3 = pairM2.first;
                    jLongValue = ((Long) pairM2.second).longValue();
                    j2 = j;
                } else {
                    Object obj9 = obj2;
                    su0Var2 = su0Var;
                    obj3 = obj9;
                    jLongValue = j2;
                }
                yd3VarE = this.w.E(ox0Var2, obj3);
                if (obj.equals(obj3) || yd3Var.b() || yd3VarE.b()) {
                    z8 = z3;
                } else {
                    z8 = true;
                }
                su0VarO = ox0Var2.o(obj3, su0Var2);
                if (!z2 && j2 == j2 && obj.equals(yd3VarE.a)) {
                    if (yd3Var.b()) {
                        su0VarO.c(yd3Var.b);
                    }
                    if (yd3VarE.b()) {
                        su0VarO.c(-1);
                    }
                }
                if (true == z8) {
                    yd3VarE = yd3Var;
                }
                if (yd3VarE.b()) {
                    j3 = jLongValue;
                } else if (yd3VarE.equals(yd3Var)) {
                    j3 = u83Var.r;
                } else {
                    ox0Var2.o(yd3VarE.a, su0Var2);
                    i2 = yd3VarE.c;
                    fb0VarA = su0Var2.f.a(yd3VarE.b);
                    r8 = z3;
                    while (true) {
                        iArr = fb0VarA.d;
                        if (r8 < iArr.length || (i3 = iArr[r8]) == 0 || i3 == 1) {
                            break;
                        } else {
                            r8++;
                        }
                    }
                    if (i2 == r8) {
                        su0Var2.f.getClass();
                    }
                    j3 = 0;
                }
                jR = j3;
                z9 = z4;
                z10 = z5;
                yd3Var2 = yd3VarE;
            }
            z2 = true;
            if (yd3Var4.b()) {
                j2 = u83Var.c;
            } else {
                j2 = u83Var.c;
            }
            obj = obj8;
            ex0Var = this.p;
            if (a83Var2 != null) {
                yd3Var = yd3Var4;
                ox0Var2 = ox0Var;
                pairZ = z(ox0Var2, a83Var2, i7, z17, ex0Var, su0Var3);
                if (pairZ == null) {
                    iK = ox0Var2.k(z17);
                    obj6 = obj;
                    j5 = j2;
                    z14 = false;
                    z13 = false;
                    z6 = true;
                } else {
                    j4 = a83Var2.c;
                    obj4 = pairZ.first;
                    if (j4 == j) {
                        iK = ox0Var2.o(obj4, su0Var3).c;
                        obj5 = obj;
                        jLongValue2 = j2;
                        z11 = false;
                    } else {
                        jLongValue2 = ((Long) pairZ.second).longValue();
                        obj5 = obj4;
                        iK = -1;
                        z11 = true;
                    }
                    long j9 = jLongValue2;
                    if (u83Var.e == 4) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    z13 = z11;
                    obj6 = obj5;
                    z14 = z12;
                    j5 = j9;
                    z6 = false;
                }
                j2 = j5;
                su0Var = su0Var3;
                z4 = z14;
                obj2 = obj6;
                z5 = z13;
                i = -1;
                z3 = false;
            } else {
                yd3Var = yd3Var4;
                su0Var = su0Var3;
                ox0Var2 = ox0Var;
                ox0Var3 = u83Var.a;
                if (ox0Var3.g()) {
                    iK = ox0Var2.k(z17);
                    obj2 = obj;
                    j2 = j2;
                    i = -1;
                    z3 = false;
                    z4 = false;
                    z5 = false;
                    z6 = false;
                } else {
                    if (ox0Var2.e(obj) == -1) {
                        z3 = false;
                        iW = W(ex0Var, su0Var, i7, z17, obj, ox0Var3, ox0Var2);
                        if (iW == -1) {
                            ex0Var = ex0Var;
                            ox0Var2 = ox0Var2;
                            obj = obj;
                            iK = ox0Var2.k(z17);
                            z7 = true;
                        } else {
                            ex0Var = ex0Var;
                            ox0Var2 = ox0Var2;
                            obj = obj;
                            iK = iW;
                            z7 = false;
                        }
                        z6 = z7;
                        obj2 = obj;
                        z4 = false;
                        z5 = false;
                    } else {
                        z3 = false;
                        if (j2 == j) {
                            iK = ox0Var2.o(obj, su0Var).c;
                            obj2 = obj;
                            z4 = false;
                            z5 = false;
                            z6 = false;
                        } else if (z2) {
                            ox0Var3.o(obj, su0Var);
                            if (ox0Var3.b(su0Var.c, ex0Var, 0L).k == ox0Var3.e(obj)) {
                                Pair pairM3 = ox0Var2.m(ex0Var, su0Var, ox0Var2.o(obj, su0Var).c, j2);
                                ex0Var = ex0Var;
                                su0Var = su0Var;
                                obj2 = pairM3.first;
                                jMax = ((Long) pairM3.second).longValue();
                            } else if (ox0Var2.o(obj, su0Var).d != j) {
                                long j10 = su0Var.d - 1;
                                String str2 = qz1.a;
                                jMax = Math.max(0L, Math.min(j2, j10));
                                obj2 = obj;
                            } else {
                                obj2 = obj;
                                jMax = j2;
                            }
                            z4 = false;
                            z6 = false;
                            j2 = jMax;
                            iK = -1;
                            i = -1;
                            z5 = true;
                        } else {
                            obj2 = obj;
                            j2 = j2;
                            z4 = false;
                            z5 = false;
                            z6 = false;
                            iK = -1;
                            i = -1;
                        }
                    }
                    i = -1;
                }
            }
            if (iK != i) {
                su0Var2 = su0Var;
                Pair pairM4 = ox0Var2.m(ex0Var, su0Var2, iK, -9223372036854775807L);
                obj3 = pairM4.first;
                jLongValue = ((Long) pairM4.second).longValue();
                j2 = j;
            } else {
                Object obj10 = obj2;
                su0Var2 = su0Var;
                obj3 = obj10;
                jLongValue = j2;
            }
            yd3VarE = this.w.E(ox0Var2, obj3);
            if (obj.equals(obj3)) {
                z8 = z3;
            } else {
                z8 = z3;
            }
            su0VarO = ox0Var2.o(obj3, su0Var2);
            if (!z2) {
                if (yd3Var.b()) {
                    su0VarO.c(yd3Var.b);
                }
                if (yd3VarE.b()) {
                    su0VarO.c(-1);
                }
            }
            if (true == z8) {
                yd3VarE = yd3Var;
            }
            if (yd3VarE.b()) {
                j3 = jLongValue;
            } else if (yd3VarE.equals(yd3Var)) {
                j3 = u83Var.r;
            } else {
                ox0Var2.o(yd3VarE.a, su0Var2);
                i2 = yd3VarE.c;
                fb0VarA = su0Var2.f.a(yd3VarE.b);
                r8 = z3;
                while (true) {
                    iArr = fb0VarA.d;
                    if (r8 < iArr.length) {
                        break;
                    } else {
                        break;
                    }
                    r8++;
                }
                if (i2 == r8) {
                    su0Var2.f.getClass();
                }
                j3 = 0;
            }
            jR = j3;
            z9 = z4;
            z10 = z5;
            yd3Var2 = yd3VarE;
        }
        boolean z18 = (this.K.b.equals(yd3Var2) && jR == this.K.r) ? z3 : true;
        char c = 2;
        if (z6) {
            try {
                z15 = true;
                if (this.K.e != 1) {
                    i4 = 4;
                    try {
                        d(4);
                    } catch (Throwable th) {
                        th = th;
                        i5 = 2;
                        z16 = z15;
                        i4 = i4;
                        yd3Var2 = yd3Var2;
                        a83Var = null;
                        u83 u83Var2 = this.K;
                        ox0 ox0Var6 = u83Var2.a;
                        yd3 yd3Var5 = u83Var2.b;
                        if (z16 != z10) {
                            j6 = j;
                        } else {
                            j6 = jR;
                        }
                        yd3Var3 = yd3Var2;
                        int i8 = i5;
                        ox0Var4 = ox0Var;
                        G(ox0Var4, yd3Var3, ox0Var6, yd3Var5, j6, false);
                        if (z18) {
                            u83 u83Var3 = this.K;
                            obj7 = u83Var3.b.a;
                            ox0 ox0Var7 = u83Var3.a;
                            if (z18) {
                                z16 = z3;
                            } else {
                                z16 = z3;
                            }
                            long j11 = this.K.d;
                            if (ox0Var4.e(obj7) == -1) {
                                i6 = i4;
                            } else {
                                i6 = 3;
                            }
                            this.K = N(yd3Var3, jR, j2, j11, z16, i6);
                        } else {
                            u83 u83Var4 = this.K;
                            obj7 = u83Var4.b.a;
                            ox0 ox0Var8 = u83Var4.a;
                            if (z18) {
                                z16 = z3;
                            } else {
                                z16 = z3;
                            }
                            long j12 = this.K.d;
                            if (ox0Var4.e(obj7) == -1) {
                                i6 = i4;
                            } else {
                                i6 = 3;
                            }
                            this.K = N(yd3Var3, jR, j2, j12, z16, i6);
                        }
                        J();
                        x(ox0Var4, this.K.a);
                        this.K = this.K.c(ox0Var4);
                        if (!ox0Var4.g()) {
                            this.W = a83Var;
                        }
                        Q(z3);
                        this.m.b(i8);
                        throw th;
                    }
                } else {
                    i4 = 4;
                }
                v(z3, z3, z3, true);
            } catch (Throwable th2) {
                th = th2;
                z15 = true;
                i4 = 4;
                i5 = 2;
                z16 = z15;
                i4 = i4;
                yd3Var2 = yd3Var2;
                a83Var = null;
                u83 u83Var5 = this.K;
                ox0 ox0Var9 = u83Var5.a;
                yd3 yd3Var6 = u83Var5.b;
                if (z16 != z10) {
                    j6 = j;
                } else {
                    j6 = jR;
                }
                yd3Var3 = yd3Var2;
                int i9 = i5;
                ox0Var4 = ox0Var;
                G(ox0Var4, yd3Var3, ox0Var9, yd3Var6, j6, false);
                if (z18 || j2 != this.K.c) {
                    u83 u83Var6 = this.K;
                    obj7 = u83Var6.b.a;
                    ox0 ox0Var10 = u83Var6.a;
                    if (z18 || !z || ox0Var10.g() || ox0Var10.o(obj7, this.q).e) {
                        z16 = z3;
                    }
                    long j13 = this.K.d;
                    if (ox0Var4.e(obj7) == -1) {
                        i6 = i4;
                    } else {
                        i6 = 3;
                    }
                    this.K = N(yd3Var3, jR, j2, j13, z16, i6);
                } else {
                    ox0Var4 = ox0Var4;
                    a83Var = a83Var;
                }
                J();
                x(ox0Var4, this.K.a);
                this.K = this.K.c(ox0Var4);
                if (!ox0Var4.g()) {
                    this.W = a83Var;
                }
                Q(z3);
                this.m.b(i9);
                throw th;
            }
        } else {
            z15 = true;
            i4 = 4;
        }
        a93[] a93VarArr = this.f;
        for (?? r9 = z3; r9 < c; r9++) {
            try {
                a93 a93Var = a93VarArr[r9];
                yc3 yc3Var = a93Var.a;
                if (!Objects.equals(yc3Var.u, ox0Var2)) {
                    yc3Var.u = ox0Var2;
                }
                yc3 yc3Var2 = a93Var.c;
                if (yc3Var2 != null && !Objects.equals(yc3Var2.u, ox0Var2)) {
                    yc3Var2.u = ox0Var2;
                }
                c = 2;
            } catch (Throwable th3) {
                th = th3;
                z16 = z15;
                i4 = i4;
                a83Var = null;
                i5 = 2;
                u83 u83Var7 = this.K;
                ox0 ox0Var11 = u83Var7.a;
                yd3 yd3Var7 = u83Var7.b;
                if (z16 != z10) {
                    j6 = j;
                } else {
                    j6 = jR;
                }
                yd3Var3 = yd3Var2;
                int i10 = i5;
                ox0Var4 = ox0Var;
                G(ox0Var4, yd3Var3, ox0Var11, yd3Var7, j6, false);
                if (z18) {
                    u83 u83Var8 = this.K;
                    obj7 = u83Var8.b.a;
                    ox0 ox0Var12 = u83Var8.a;
                    if (z18) {
                        z16 = z3;
                    } else {
                        z16 = z3;
                    }
                    long j14 = this.K.d;
                    if (ox0Var4.e(obj7) == -1) {
                        i6 = i4;
                    } else {
                        i6 = 3;
                    }
                    this.K = N(yd3Var3, jR, j2, j14, z16, i6);
                } else {
                    u83 u83Var9 = this.K;
                    obj7 = u83Var9.b.a;
                    ox0 ox0Var13 = u83Var9.a;
                    if (z18) {
                        z16 = z3;
                    } else {
                        z16 = z3;
                    }
                    long j15 = this.K.d;
                    if (ox0Var4.e(obj7) == -1) {
                        i6 = i4;
                    } else {
                        i6 = 3;
                    }
                    this.K = N(yd3Var3, jR, j2, j15, z16, i6);
                }
                J();
                x(ox0Var4, this.K.a);
                this.K = this.K.c(ox0Var4);
                if (!ox0Var4.g()) {
                    this.W = a83Var;
                }
                Q(z3);
                this.m.b(i10);
                throw th;
            }
        }
        try {
            if (z18) {
                ox0 ox0Var14 = ox0Var2;
                i4 = i4;
                i5 = 2;
                if (ox0Var14.g()) {
                    yd3Var2 = yd3Var2;
                } else {
                    j83 j83Var = this.w;
                    for (h83 h83Var2 = j83Var.h; h83Var2 != null; h83Var2 = h83Var2.m) {
                        if (h83Var2.g.a.equals(yd3Var2)) {
                            i83 i83VarD = j83Var.D(ox0Var14, h83Var2.g);
                            h83Var2.g = i83VarD;
                            xd3 xd3Var = h83Var2.a;
                            if (xd3Var instanceof fd3) {
                                long j16 = i83VarD.d;
                                if (j16 == j) {
                                    j16 = Long.MIN_VALUE;
                                }
                                ((fd3) xd3Var).j = j16;
                            }
                        }
                    }
                    try {
                        j83 j83Var2 = this.w;
                        yd3Var2 = yd3Var2;
                        long j17 = jR;
                        try {
                            jR = r(yd3Var2, j17, j83Var2.h != j83Var2.i ? true : z3, z9);
                        } catch (Throwable th4) {
                            th = th4;
                            jR = j17;
                            z16 = true;
                            a83Var = null;
                            u83 u83Var10 = this.K;
                            ox0 ox0Var15 = u83Var10.a;
                            yd3 yd3Var8 = u83Var10.b;
                            if (z16 != z10) {
                                j6 = j;
                            } else {
                                j6 = jR;
                            }
                            yd3Var3 = yd3Var2;
                            int i11 = i5;
                            ox0Var4 = ox0Var;
                            G(ox0Var4, yd3Var3, ox0Var15, yd3Var8, j6, false);
                            if (z18) {
                                u83 u83Var11 = this.K;
                                obj7 = u83Var11.b.a;
                                ox0 ox0Var16 = u83Var11.a;
                                if (z18) {
                                    z16 = z3;
                                } else {
                                    z16 = z3;
                                }
                                long j18 = this.K.d;
                                if (ox0Var4.e(obj7) == -1) {
                                    i6 = i4;
                                } else {
                                    i6 = 3;
                                }
                                this.K = N(yd3Var3, jR, j2, j18, z16, i6);
                            } else {
                                u83 u83Var12 = this.K;
                                obj7 = u83Var12.b.a;
                                ox0 ox0Var17 = u83Var12.a;
                                if (z18) {
                                    z16 = z3;
                                } else {
                                    z16 = z3;
                                }
                                long j19 = this.K.d;
                                if (ox0Var4.e(obj7) == -1) {
                                    i6 = i4;
                                } else {
                                    i6 = 3;
                                }
                                this.K = N(yd3Var3, jR, j2, j19, z16, i6);
                            }
                            J();
                            x(ox0Var4, this.K.a);
                            this.K = this.K.c(ox0Var4);
                            if (!ox0Var4.g()) {
                                this.W = a83Var;
                            }
                            Q(z3);
                            this.m.b(i11);
                            throw th;
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        yd3Var2 = yd3Var2;
                        z16 = true;
                        a83Var = null;
                        u83 u83Var13 = this.K;
                        ox0 ox0Var18 = u83Var13.a;
                        yd3 yd3Var9 = u83Var13.b;
                        if (z16 != z10) {
                            j6 = j;
                        } else {
                            j6 = jR;
                        }
                        yd3Var3 = yd3Var2;
                        int i12 = i5;
                        ox0Var4 = ox0Var;
                        G(ox0Var4, yd3Var3, ox0Var18, yd3Var9, j6, false);
                        if (z18) {
                            u83 u83Var14 = this.K;
                            obj7 = u83Var14.b.a;
                            ox0 ox0Var19 = u83Var14.a;
                            if (z18) {
                                z16 = z3;
                            } else {
                                z16 = z3;
                            }
                            long j110 = this.K.d;
                            if (ox0Var4.e(obj7) == -1) {
                                i6 = i4;
                            } else {
                                i6 = 3;
                            }
                            this.K = N(yd3Var3, jR, j2, j110, z16, i6);
                        } else {
                            u83 u83Var15 = this.K;
                            obj7 = u83Var15.b.a;
                            ox0 ox0Var110 = u83Var15.a;
                            if (z18) {
                                z16 = z3;
                            } else {
                                z16 = z3;
                            }
                            long j111 = this.K.d;
                            if (ox0Var4.e(obj7) == -1) {
                                i6 = i4;
                            } else {
                                i6 = 3;
                            }
                            this.K = N(yd3Var3, jR, j2, j111, z16, i6);
                        }
                        J();
                        x(ox0Var4, this.K.a);
                        this.K = this.K.c(ox0Var4);
                        if (!ox0Var4.g()) {
                            this.W = a83Var;
                        }
                        Q(z3);
                        this.m.b(i12);
                        throw th;
                    }
                }
            } else {
                try {
                    j83 j83Var3 = this.w;
                    h83 h83Var3 = j83Var3.i;
                    try {
                        try {
                            int iC = j83Var3.C(ox0Var, this.X, h83Var3 == null ? 0L : H(h83Var3), (!V() || (h83Var = j83Var3.j) == null) ? 0L : H(h83Var));
                            if ((iC & 1) != 0) {
                                try {
                                    i(z3);
                                    yd3Var2 = yd3Var2;
                                    i5 = 2;
                                } catch (Throwable th6) {
                                    th = th6;
                                    z16 = true;
                                    a83Var = null;
                                    i5 = 2;
                                    u83 u83Var16 = this.K;
                                    ox0 ox0Var111 = u83Var16.a;
                                    yd3 yd3Var10 = u83Var16.b;
                                    if (z16 != z10) {
                                        j6 = j;
                                    } else {
                                        j6 = jR;
                                    }
                                    yd3Var3 = yd3Var2;
                                    int i13 = i5;
                                    ox0Var4 = ox0Var;
                                    G(ox0Var4, yd3Var3, ox0Var111, yd3Var10, j6, false);
                                    if (z18) {
                                        u83 u83Var17 = this.K;
                                        obj7 = u83Var17.b.a;
                                        ox0 ox0Var112 = u83Var17.a;
                                        if (z18) {
                                            z16 = z3;
                                        } else {
                                            z16 = z3;
                                        }
                                        long j112 = this.K.d;
                                        if (ox0Var4.e(obj7) == -1) {
                                            i6 = i4;
                                        } else {
                                            i6 = 3;
                                        }
                                        this.K = N(yd3Var3, jR, j2, j112, z16, i6);
                                    } else {
                                        u83 u83Var18 = this.K;
                                        obj7 = u83Var18.b.a;
                                        ox0 ox0Var113 = u83Var18.a;
                                        if (z18) {
                                            z16 = z3;
                                        } else {
                                            z16 = z3;
                                        }
                                        long j113 = this.K.d;
                                        if (ox0Var4.e(obj7) == -1) {
                                            i6 = i4;
                                        } else {
                                            i6 = 3;
                                        }
                                        this.K = N(yd3Var3, jR, j2, j113, z16, i6);
                                    }
                                    J();
                                    x(ox0Var4, this.K.a);
                                    this.K = this.K.c(ox0Var4);
                                    if (!ox0Var4.g()) {
                                        this.W = a83Var;
                                    }
                                    Q(z3);
                                    this.m.b(i13);
                                    throw th;
                                }
                            } else {
                                i5 = 2;
                                if ((iC & 2) != 0) {
                                    C();
                                }
                                yd3Var2 = yd3Var2;
                            }
                        } catch (Throwable th7) {
                            th = th7;
                            i5 = 2;
                            yd3Var2 = yd3Var2;
                            z16 = true;
                            a83Var = null;
                            u83 u83Var19 = this.K;
                            ox0 ox0Var114 = u83Var19.a;
                            yd3 yd3Var11 = u83Var19.b;
                            if (z16 != z10) {
                                j6 = j;
                            } else {
                                j6 = jR;
                            }
                            yd3Var3 = yd3Var2;
                            int i14 = i5;
                            ox0Var4 = ox0Var;
                            G(ox0Var4, yd3Var3, ox0Var114, yd3Var11, j6, false);
                            if (z18) {
                                u83 u83Var110 = this.K;
                                obj7 = u83Var110.b.a;
                                ox0 ox0Var115 = u83Var110.a;
                                if (z18) {
                                    z16 = z3;
                                } else {
                                    z16 = z3;
                                }
                                long j114 = this.K.d;
                                if (ox0Var4.e(obj7) == -1) {
                                    i6 = i4;
                                } else {
                                    i6 = 3;
                                }
                                this.K = N(yd3Var3, jR, j2, j114, z16, i6);
                            } else {
                                u83 u83Var111 = this.K;
                                obj7 = u83Var111.b.a;
                                ox0 ox0Var116 = u83Var111.a;
                                if (z18) {
                                    z16 = z3;
                                } else {
                                    z16 = z3;
                                }
                                long j115 = this.K.d;
                                if (ox0Var4.e(obj7) == -1) {
                                    i6 = i4;
                                } else {
                                    i6 = 3;
                                }
                                this.K = N(yd3Var3, jR, j2, j115, z16, i6);
                            }
                            J();
                            x(ox0Var4, this.K.a);
                            this.K = this.K.c(ox0Var4);
                            if (!ox0Var4.g()) {
                                this.W = a83Var;
                            }
                            Q(z3);
                            this.m.b(i14);
                            throw th;
                        }
                    } catch (Throwable th8) {
                        th = th8;
                    }
                } catch (Throwable th9) {
                    th = th9;
                    i4 = i4;
                }
            }
            u83 u83Var20 = this.K;
            yd3 yd3Var12 = yd3Var2;
            G(ox0Var, yd3Var12, u83Var20.a, u83Var20.b, true != z10 ? j : jR, false);
            if (z18 || j2 != this.K.c) {
                u83 u83Var21 = this.K;
                Object obj11 = u83Var21.b.a;
                ox0 ox0Var20 = u83Var21.a;
                this.K = N(yd3Var12, jR, j2, this.K.d, (!z18 || !z || ox0Var20.g() || ox0Var20.o(obj11, this.q).e) ? z3 : true, ox0Var.e(obj11) == -1 ? i4 : 3);
            }
            J();
            x(ox0Var, this.K.a);
            this.K = this.K.c(ox0Var);
            if (!ox0Var.g()) {
                this.W = null;
            }
            Q(z3);
            this.m.b(i5);
        } catch (Throwable th10) {
            th = th10;
        }
    }

    public final void G(ox0 ox0Var, yd3 yd3Var, ox0 ox0Var2, yd3 yd3Var2, long j, boolean z) throws Throwable {
        if (!o(ox0Var, yd3Var)) {
            up0 up0Var = yd3Var.b() ? up0.d : this.K.o;
            c22 c22Var = this.s;
            if (c22Var.g().equals(up0Var)) {
                return;
            }
            this.m.c(16);
            c22Var.b(up0Var);
            K(this.K.o, up0Var.a, false, false);
            return;
        }
        Object obj = yd3Var.a;
        su0 su0Var = this.q;
        int i = ox0Var.o(obj, su0Var).c;
        ex0 ex0Var = this.p;
        ox0Var.b(i, ex0Var, 0L);
        te0 te0Var = ex0Var.h;
        String str = qz1.a;
        z03 z03Var = this.h0;
        z03Var.getClass();
        te0Var.getClass();
        long jR = qz1.r(-9223372036854775807L);
        z03Var.c = jR;
        z03Var.f = jR;
        z03Var.g = jR;
        z03Var.c();
        if (j != -9223372036854775807L) {
            z03Var.d = n(ox0Var, obj, j);
            z03Var.c();
            return;
        }
        if (!Objects.equals(!ox0Var2.g() ? ox0Var2.b(ox0Var2.o(yd3Var2.a, su0Var).c, ex0Var, 0L).a : null, ex0Var.a) || z) {
            z03Var.d = -9223372036854775807L;
            z03Var.c();
        }
    }

    public final long H(h83 h83Var) {
        if (h83Var == null) {
            return 0L;
        }
        long jMax = h83Var.p;
        if (h83Var.e) {
            for (int i = 0; i < 2; i++) {
                a93[] a93VarArr = this.f;
                if (a93VarArr[i].m(h83Var) != null) {
                    yc3 yc3VarM = a93VarArr[i].m(h83Var);
                    Objects.requireNonNull(yc3VarM);
                    long j = yc3VarM.r;
                    if (j == Long.MIN_VALUE) {
                        return Long.MIN_VALUE;
                    }
                    jMax = Math.max(j, jMax);
                }
            }
        }
        return jMax;
    }

    public final void I() {
        boolean z;
        j83 j83Var = this.w;
        j83Var.z();
        h83 h83Var = j83Var.l;
        if (h83Var != null) {
            xd3 xd3Var = h83Var.a;
            if ((!h83Var.d || h83Var.e) && !xd3Var.o()) {
                ox0 ox0Var = this.K.a;
                if (h83Var.e) {
                    xd3Var.j();
                }
                if (this.k.g()) {
                    if (!h83Var.d) {
                        long j = h83Var.g.b;
                        h83Var.d = true;
                        xd3Var.a(this, j);
                        return;
                    }
                    e83 e83Var = new e83();
                    e83Var.a = this.X - h83Var.p;
                    float f = this.s.g().a;
                    hn.v(f > 0.0f || f == -3.4028235E38f);
                    e83Var.b = f;
                    long j2 = this.Q;
                    if (j2 >= 0) {
                        z = true;
                    } else if (j2 == -9223372036854775807L) {
                        z = true;
                        j2 = -9223372036854775807L;
                    } else {
                        z = false;
                    }
                    hn.v(z);
                    e83Var.c = j2;
                    f83 f83Var = new f83(e83Var);
                    hn.M(h83Var.m == null);
                    xd3Var.b(f83Var);
                }
            }
        }
    }

    public final void J() {
        h83 h83Var = this.w.h;
        boolean z = false;
        if (h83Var != null && h83Var.g.g && this.N) {
            z = true;
        }
        this.O = z;
    }

    public final void K(up0 up0Var, float f, boolean z, boolean z2) throws Throwable {
        int i;
        if (z) {
            if (z2) {
                this.L.b(1);
            }
            u83 u83Var = this.K;
            this.K = new u83(u83Var.a, u83Var.b, u83Var.c, u83Var.d, u83Var.e, u83Var.f, u83Var.g, u83Var.h, u83Var.i, u83Var.j, u83Var.k, u83Var.l, u83Var.m, u83Var.n, up0Var, u83Var.p, u83Var.q, u83Var.r, u83Var.s);
        }
        float f2 = up0Var.a;
        h83 h83Var = this.w.h;
        while (true) {
            i = 0;
            if (h83Var == null) {
                break;
            }
            bg3[] bg3VarArr = (bg3[]) h83Var.o.h;
            int length = bg3VarArr.length;
            while (i < length) {
                bg3 bg3Var = bg3VarArr[i];
                i++;
            }
            h83Var = h83Var.m;
        }
        a93[] a93VarArr = this.f;
        while (i < 2) {
            a93 a93Var = a93VarArr[i];
            a93Var.a.q(f, f2);
            yc3 yc3Var = a93Var.c;
            if (yc3Var != null) {
                yc3Var.q(f, f2);
            }
            i++;
        }
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00db  */
    public final void L() {
        boolean zA;
        boolean z;
        j83 j83Var = this.w;
        long j = -9223372036854775807L;
        if (A(j83Var.k)) {
            h83 h83Var = j83Var.k;
            long jR = R(!h83Var.e ? 0L : h83Var.a.i());
            long j2 = o(this.K.a, h83Var.g.a) ? this.h0.h : -9223372036854775807L;
            la3 la3Var = this.z;
            ox0 ox0Var = this.K.a;
            yd3 yd3Var = h83Var.g.a;
            float f = this.s.g().a;
            boolean z2 = this.K.l;
            c83 c83Var = new c83(la3Var, ox0Var, yd3Var, jR, f, this.P, j2);
            d83 d83Var = this.k;
            zA = d83Var.a(c83Var);
            h83 h83Var2 = j83Var.h;
            if (!zA && h83Var2.e && jR < 500000 && this.r > 0) {
                h83Var2.a.e(this.K.r);
                zA = d83Var.a(c83Var);
            }
        } else {
            zA = false;
        }
        this.R = zA;
        if (zA) {
            h83 h83Var3 = j83Var.k;
            h83Var3.getClass();
            e83 e83Var = new e83();
            e83Var.a = this.X - h83Var3.p;
            float f2 = this.s.g().a;
            hn.v(f2 > 0.0f || f2 == -3.4028235E38f);
            e83Var.b = f2;
            long j3 = this.Q;
            if (j3 < 0) {
                if (j3 != -9223372036854775807L) {
                    z = false;
                    j = j3;
                }
                hn.v(z);
                e83Var.c = j;
                f83 f83Var = new f83(e83Var);
                hn.M(h83Var3.m == null);
                h83Var3.a.b(f83Var);
            } else {
                j = j3;
            }
            z = true;
            hn.v(z);
            e83Var.c = j;
            f83 f83Var2 = new f83(e83Var);
            hn.M(h83Var3.m == null);
            h83Var3.a.b(f83Var2);
        }
        M();
    }

    public final void M() {
        h83 h83Var = this.w.k;
        boolean z = true;
        if (!this.R && (h83Var == null || !h83Var.a.o())) {
            z = false;
        }
        u83 u83Var = this.K;
        if (z != u83Var.g) {
            this.K = u83Var.f(z);
        }
    }

    public final u83 N(yd3 yd3Var, long j, long j2, long j3, boolean z, int i) {
        dg3 dg3Var;
        List list;
        gf3 gf3Var;
        qk2 qk2VarF;
        this.a0 = (!this.a0 && j == this.K.r && yd3Var.equals(this.K.b)) ? false : true;
        J();
        u83 u83Var = this.K;
        gf3 gf3Var2 = u83Var.h;
        dg3 dg3Var2 = u83Var.i;
        List list2 = u83Var.j;
        if (this.x.f) {
            j83 j83Var = this.w;
            h83 h83Var = j83Var.h;
            gf3 gf3Var3 = h83Var == null ? gf3.d : h83Var.n;
            dg3 dg3Var3 = h83Var == null ? this.j : h83Var.o;
            bg3[] bg3VarArr = (bg3[]) dg3Var3.h;
            sj2 sj2Var = new sj2(4);
            int length = bg3VarArr.length;
            int i2 = 0;
            boolean z2 = false;
            while (i2 < length) {
                bg3 bg3Var = bg3VarArr[i2];
                if (bg3Var != null) {
                    am0 am0Var = bg3Var.d(0).k;
                    if (am0Var == null) {
                        sj2Var.a(new am0(new il0[0]));
                    } else {
                        sj2Var.a(am0Var);
                        z2 = true;
                    }
                }
                i2++;
                gf3Var3 = gf3Var3;
            }
            gf3 gf3Var4 = gf3Var3;
            if (z2) {
                qk2VarF = sj2Var.f();
            } else {
                tj2 tj2Var = vj2.g;
                qk2VarF = qk2.j;
            }
            if (h83Var != null) {
                i83 i83Var = h83Var.g;
                if (i83Var.c != j2) {
                    h83Var.g = i83Var.b(j2);
                }
            }
            h83 h83Var2 = j83Var.h;
            if (h83Var2 == j83Var.i && h83Var2 != null) {
                dg3 dg3Var4 = h83Var2.o;
                int i3 = 0;
                while (true) {
                    a93[] a93VarArr = this.f;
                    if (i3 >= 2) {
                        break;
                    }
                    if (dg3Var4.a(i3)) {
                        if (a93VarArr[i3].a.g != 1) {
                            break;
                        }
                        ((z83[]) dg3Var4.g)[i3].getClass();
                    }
                    i3++;
                }
            }
            list = qk2VarF;
            dg3Var = dg3Var3;
            gf3Var = gf3Var4;
        } else {
            if (!yd3Var.equals(u83Var.b)) {
                dg3Var2 = this.j;
                gf3Var2 = gf3.d;
                list2 = qk2.j;
            }
            dg3Var = dg3Var2;
            list = list2;
            gf3Var = gf3Var2;
        }
        if (z) {
            zk0 zk0Var = this.L;
            if (!zk0Var.c || zk0Var.d == 5) {
                zk0Var.a = true;
                zk0Var.c = true;
                zk0Var.d = i;
            } else {
                hn.v(i == 5);
            }
        }
        u83 u83Var2 = this.K;
        return u83Var2.b(yd3Var, j, j2, j3, R(u83Var2.p), gf3Var, dg3Var, list);
    }

    public final void O(boolean[] zArr, long j) {
        a93[] a93VarArr;
        b83 b83Var;
        long j2;
        h83 h83Var = this.w.i;
        dg3 dg3Var = h83Var.o;
        int i = 0;
        while (true) {
            a93VarArr = this.f;
            if (i >= 2) {
                break;
            }
            if (!dg3Var.a(i)) {
                a93VarArr[i].b();
            }
            i++;
        }
        int i2 = 0;
        while (i2 < 2) {
            if (dg3Var.a(i2) && a93VarArr[i2].m(h83Var) == null) {
                b83Var = this;
                j2 = j;
                b83Var.P(h83Var, i2, zArr[i2], j2);
            } else {
                b83Var = this;
                j2 = j;
            }
            i2++;
            this = b83Var;
            j = j2;
        }
    }

    public final void P(h83 h83Var, int i, boolean z, long j) {
        int iB;
        int i2;
        a93 a93Var = this.f[i];
        if (a93Var.g()) {
            return;
        }
        boolean z2 = h83Var == this.w.h;
        dg3 dg3Var = h83Var.o;
        z83 z83Var = ((z83[]) dg3Var.g)[i];
        bg3 bg3Var = ((bg3[]) dg3Var.h)[i];
        boolean z3 = T() && this.K.e == 3;
        boolean z4 = !z && z3;
        this.V++;
        af3 af3Var = h83Var.c[i];
        long j2 = h83Var.p;
        yd3 yd3Var = h83Var.g.a;
        if (bg3Var != null) {
            iB = bg3Var.b();
            i2 = 0;
        } else {
            iB = 0;
            i2 = 0;
        }
        de3[] de3VarArr = new de3[iB];
        while (i2 < iB) {
            bg3Var.getClass();
            de3VarArr[i2] = bg3Var.d(i2);
            i2++;
        }
        int i3 = a93Var.d;
        c22 c22Var = this.s;
        if (i3 == 0 || i3 == 2 || i3 == 4) {
            a93Var.e = true;
            yc3 yc3Var = a93Var.a;
            hn.M(yc3Var.m == 0);
            yc3Var.i = z83Var;
            yc3Var.v = yd3Var;
            yc3Var.m = 1;
            yc3Var.p0(z4, z2);
            yc3Var.l0(de3VarArr, af3Var, j, j2, yd3Var);
            yc3Var.L(j, z4, true);
            c22Var.c(yc3Var);
        } else {
            a93Var.f = true;
            yc3 yc3Var2 = a93Var.c;
            yc3Var2.getClass();
            hn.M(yc3Var2.m == 0);
            yc3Var2.i = z83Var;
            yc3Var2.v = yd3Var;
            yc3Var2.m = 1;
            yc3Var2.p0(z4, z2);
            yc3Var2.l0(de3VarArr, af3Var, j, j2, yd3Var);
            yc3Var2.L(j, z4, true);
            c22Var.c(yc3Var2);
        }
        q73 q73Var = new q73(this);
        yc3 yc3VarM = a93Var.m(h83Var);
        yc3VarM.getClass();
        yc3VarM.a(11, q73Var);
        if (z3 && z2) {
            a93Var.D();
        }
    }

    public final void Q(boolean z) {
        h83 h83Var = this.w.k;
        yd3 yd3Var = h83Var == null ? this.K.b : h83Var.g.a;
        boolean zEquals = this.K.k.equals(yd3Var);
        if (!zEquals) {
            this.K = this.K.g(yd3Var);
        }
        u83 u83Var = this.K;
        u83Var.p = h83Var == null ? u83Var.r : h83Var.d();
        u83 u83Var2 = this.K;
        u83Var2.q = R(u83Var2.p);
        if ((!zEquals || z) && h83Var != null && h83Var.e) {
            S(h83Var.g.a, h83Var.n, h83Var.o);
        }
    }

    public final long R(long j) {
        h83 h83Var = this.w.k;
        if (h83Var == null) {
            return 0L;
        }
        return Math.max(0L, j - (this.X - h83Var.p));
    }

    public final void S(yd3 yd3Var, gf3 gf3Var, dg3 dg3Var) {
        h83 h83Var = this.w.k;
        h83Var.getClass();
        long jR = R(h83Var.d());
        long j = o(this.K.a, h83Var.g.a) ? this.h0.h : -9223372036854775807L;
        ox0 ox0Var = this.K.a;
        float f = this.s.g().a;
        boolean z = this.K.l;
        this.k.b(new c83(this.z, ox0Var, yd3Var, jR, f, this.P, j), (bg3[]) dg3Var.h);
    }

    public final boolean T() {
        u83 u83Var = this.K;
        return u83Var.l && u83Var.n == 0;
    }

    public final void U(int i) {
        a93 a93Var = this.f[i];
        try {
            h83 h83Var = this.w.h;
            if (h83Var == null) {
                throw null;
            }
            yc3 yc3VarM = a93Var.m(h83Var);
            yc3VarM.getClass();
            af3 af3Var = yc3VarM.n;
            af3Var.getClass();
            af3Var.h();
        } catch (IOException | RuntimeException e) {
            int i2 = a93Var.a.g;
            throw e;
        }
    }

    public final boolean V() {
        if (!this.C) {
            return false;
        }
        for (int i = 0; i < 2; i++) {
            if (this.f[i].q()) {
                return true;
            }
        }
        return false;
    }

    public final void a(IOException iOException, int i) {
        q43 q43Var = new q43(0, iOException, i);
        h83 h83Var = this.w.h;
        if (h83Var != null) {
            q43Var = q43Var.a(h83Var.g.a);
        }
        s90.b0("ExoPlayerImplInternal", "Playback error", q43Var);
        u(false, false);
        this.K = this.K.e(q43Var);
    }

    @Override // defpackage.dc0
    public final void b(long j, long j2, de3 de3Var, MediaFormat mediaFormat) {
        if (this.H) {
            Handler handler = this.m.a;
            ox1 ox1VarF = wx1.f();
            ox1VarF.a = handler.obtainMessage(37);
            ox1VarF.a();
        }
    }

    @Override // defpackage.wd3
    public final /* bridge */ /* synthetic */ void c(bf3 bf3Var) {
        this.m.a(9, (xd3) bf3Var).a();
    }

    public final void d(int i) {
        u83 u83Var = this.K;
        if (u83Var.e != i) {
            if (i != 2) {
                this.c0 = -9223372036854775807L;
            }
            this.K = u83Var.d(i);
        }
    }

    public final void e() {
        zk0 zk0Var = this.L;
        u83 u83Var = this.K;
        boolean z = zk0Var.a | (((u83) zk0Var.e) != u83Var);
        zk0Var.a = z;
        zk0Var.e = u83Var;
        if (z) {
            p73 p73Var = (p73) this.v.g;
            p73Var.p.d(new u52(p73Var, 12, zk0Var));
            this.L = new zk0(this.K);
        }
    }

    public final void f(float f) {
        this.g0 = f;
        float f2 = f * this.D.g;
        for (int i = 0; i < 2; i++) {
            a93 a93Var = this.f[i];
            yc3 yc3Var = a93Var.a;
            if (yc3Var.g == 1) {
                Float fValueOf = Float.valueOf(f2);
                yc3Var.a(2, fValueOf);
                yc3 yc3Var2 = a93Var.c;
                if (yc3Var2 != null) {
                    yc3Var2.a(2, fValueOf);
                }
            }
        }
    }

    @Override // defpackage.wd3
    public final void g(xd3 xd3Var) {
        this.m.a(8, xd3Var).a();
    }

    public final void h(int i, int i2, int i3, boolean z) throws Throwable {
        boolean z2;
        if (!z) {
            z2 = false;
        } else if (i != -1) {
            z2 = true;
        } else {
            i = -1;
            z2 = false;
        }
        if (i == -1) {
            i3 = 2;
        } else if (i3 == 2) {
            i3 = 1;
        }
        boolean z3 = this.G;
        if (i == 0) {
            i2 = 1;
        } else if (i2 == 1) {
            i2 = z3 ? 4 : 0;
        }
        u83 u83Var = this.K;
        if (u83Var.l == z2 && u83Var.n == i2 && u83Var.m == i3) {
            return;
        }
        this.K = u83Var.h(i3, i2, z2);
        y(false, false);
        j83 j83Var = this.w;
        for (h83 h83Var = j83Var.h; h83Var != null; h83Var = h83Var.m) {
            for (bg3 bg3Var : (bg3[]) h83Var.o.h) {
            }
        }
        if (!T()) {
            k();
            l();
            this.K.getClass();
            j83Var.n(this.X);
            return;
        }
        int i4 = this.K.e;
        wx1 wx1Var = this.m;
        if (i4 != 3) {
            if (i4 == 2) {
                wx1Var.b(2);
                return;
            }
            return;
        }
        c22 c22Var = this.s;
        c22Var.g = true;
        e93 e93Var = (e93) c22Var.h;
        if (!e93Var.f) {
            e93Var.h = SystemClock.elapsedRealtime();
            e93Var.f = true;
        }
        j();
        wx1Var.b(2);
    }

    /* JADX WARN: Code duplicated, block: B:298:0x0634  */
    /* JADX WARN: Code duplicated, block: B:299:0x063a A[Catch: IOException -> 0x0028, ze2 -> 0x002b, no0 -> 0x002e, vb3 -> 0x0031, RuntimeException -> 0x05dc, q43 -> 0x05df, TRY_LEAVE, TryCatch #26 {RuntimeException -> 0x05dc, q43 -> 0x05df, blocks: (B:278:0x05d8, B:286:0x05f3, B:287:0x05fb, B:289:0x0608, B:291:0x0616, B:296:0x062e, B:389:0x07ab, B:391:0x07b1, B:393:0x07b7, B:396:0x07bc, B:397:0x07c7, B:399:0x07cb, B:403:0x07f0, B:405:0x07f6, B:410:0x0804, B:411:0x080c, B:412:0x080f, B:414:0x0818, B:462:0x08e6, B:463:0x08eb, B:468:0x08f8, B:470:0x0900, B:471:0x0906, B:473:0x0914, B:474:0x092d, B:476:0x0931, B:478:0x0939, B:492:0x0963, B:479:0x093e, B:481:0x0947, B:485:0x0950, B:491:0x0960, B:494:0x096d, B:496:0x0973, B:500:0x0980, B:509:0x09bc, B:511:0x09c2, B:513:0x09c6, B:540:0x0a59, B:542:0x0a65, B:544:0x0a76, B:545:0x0a7f, B:564:0x0ac9, B:567:0x0ad0, B:569:0x0ad4, B:574:0x0ae1, B:575:0x0ae4, B:576:0x0ae7, B:578:0x0aed, B:580:0x0af6, B:582:0x0afe, B:584:0x0b04, B:586:0x0b0a, B:593:0x0b2c, B:595:0x0b32, B:599:0x0b3b, B:608:0x0b55, B:605:0x0b4e, B:607:0x0b52, B:587:0x0b11, B:590:0x0b1f, B:591:0x0b27, B:592:0x0b28, B:546:0x0a83, B:548:0x0a89, B:550:0x0a8d, B:554:0x0a96, B:556:0x0aa5, B:558:0x0aab, B:560:0x0ab7, B:561:0x0abc, B:562:0x0ac1, B:563:0x0ac6, B:516:0x09d4, B:518:0x09d8, B:520:0x09ea, B:522:0x09f5, B:524:0x09fd, B:528:0x0a06, B:530:0x0a10, B:536:0x0a1b, B:502:0x0988, B:504:0x098c, B:505:0x09a6, B:507:0x09ac, B:493:0x0966, B:417:0x0821, B:419:0x0825, B:421:0x082b, B:423:0x0831, B:425:0x083b, B:428:0x0841, B:429:0x0844, B:431:0x084d, B:433:0x085f, B:435:0x0868, B:437:0x0870, B:442:0x087c, B:444:0x08a4, B:446:0x08aa, B:448:0x08af, B:449:0x08b7, B:451:0x08bd, B:452:0x08c0, B:453:0x08c9, B:455:0x08cd, B:457:0x08d3, B:458:0x08d8, B:461:0x08e5, B:299:0x063a, B:309:0x0657, B:314:0x0668, B:318:0x067a, B:325:0x069f, B:342:0x06d6, B:344:0x0709, B:346:0x070d, B:350:0x071d, B:352:0x0721, B:356:0x0728, B:358:0x072e, B:360:0x074d, B:363:0x0756, B:367:0x075e, B:368:0x0766, B:370:0x076c, B:348:0x0713, B:372:0x0779, B:373:0x0781, B:375:0x0787, B:377:0x078b, B:379:0x0790, B:388:0x07a8, B:385:0x079f, B:387:0x07a5, B:609:0x0b5a, B:613:0x0b64), top: B:692:0x0012 }] */
    /* JADX WARN: Code duplicated, block: B:303:0x0644  */
    /* JADX WARN: Code duplicated, block: B:304:0x064a A[Catch: RuntimeException -> 0x06b6, IOException -> 0x06bb, ze2 -> 0x06c0, no0 -> 0x06c5, vb3 -> 0x06ca, q43 -> 0x06cf, TryCatch #15 {RuntimeException -> 0x06b6, no0 -> 0x06c5, IOException -> 0x06bb, q43 -> 0x06cf, vb3 -> 0x06ca, ze2 -> 0x06c0, blocks: (B:301:0x0640, B:304:0x064a, B:307:0x0653, B:312:0x0662, B:316:0x0672, B:321:0x0688, B:323:0x0690), top: B:701:0x0640 }] */
    /* JADX WARN: Code duplicated, block: B:306:0x0652  */
    /* JADX WARN: Code duplicated, block: B:309:0x0657 A[Catch: IOException -> 0x0028, ze2 -> 0x002b, no0 -> 0x002e, vb3 -> 0x0031, RuntimeException -> 0x05dc, q43 -> 0x05df, TRY_ENTER, TRY_LEAVE, TryCatch #26 {RuntimeException -> 0x05dc, q43 -> 0x05df, blocks: (B:278:0x05d8, B:286:0x05f3, B:287:0x05fb, B:289:0x0608, B:291:0x0616, B:296:0x062e, B:389:0x07ab, B:391:0x07b1, B:393:0x07b7, B:396:0x07bc, B:397:0x07c7, B:399:0x07cb, B:403:0x07f0, B:405:0x07f6, B:410:0x0804, B:411:0x080c, B:412:0x080f, B:414:0x0818, B:462:0x08e6, B:463:0x08eb, B:468:0x08f8, B:470:0x0900, B:471:0x0906, B:473:0x0914, B:474:0x092d, B:476:0x0931, B:478:0x0939, B:492:0x0963, B:479:0x093e, B:481:0x0947, B:485:0x0950, B:491:0x0960, B:494:0x096d, B:496:0x0973, B:500:0x0980, B:509:0x09bc, B:511:0x09c2, B:513:0x09c6, B:540:0x0a59, B:542:0x0a65, B:544:0x0a76, B:545:0x0a7f, B:564:0x0ac9, B:567:0x0ad0, B:569:0x0ad4, B:574:0x0ae1, B:575:0x0ae4, B:576:0x0ae7, B:578:0x0aed, B:580:0x0af6, B:582:0x0afe, B:584:0x0b04, B:586:0x0b0a, B:593:0x0b2c, B:595:0x0b32, B:599:0x0b3b, B:608:0x0b55, B:605:0x0b4e, B:607:0x0b52, B:587:0x0b11, B:590:0x0b1f, B:591:0x0b27, B:592:0x0b28, B:546:0x0a83, B:548:0x0a89, B:550:0x0a8d, B:554:0x0a96, B:556:0x0aa5, B:558:0x0aab, B:560:0x0ab7, B:561:0x0abc, B:562:0x0ac1, B:563:0x0ac6, B:516:0x09d4, B:518:0x09d8, B:520:0x09ea, B:522:0x09f5, B:524:0x09fd, B:528:0x0a06, B:530:0x0a10, B:536:0x0a1b, B:502:0x0988, B:504:0x098c, B:505:0x09a6, B:507:0x09ac, B:493:0x0966, B:417:0x0821, B:419:0x0825, B:421:0x082b, B:423:0x0831, B:425:0x083b, B:428:0x0841, B:429:0x0844, B:431:0x084d, B:433:0x085f, B:435:0x0868, B:437:0x0870, B:442:0x087c, B:444:0x08a4, B:446:0x08aa, B:448:0x08af, B:449:0x08b7, B:451:0x08bd, B:452:0x08c0, B:453:0x08c9, B:455:0x08cd, B:457:0x08d3, B:458:0x08d8, B:461:0x08e5, B:299:0x063a, B:309:0x0657, B:314:0x0668, B:318:0x067a, B:325:0x069f, B:342:0x06d6, B:344:0x0709, B:346:0x070d, B:350:0x071d, B:352:0x0721, B:356:0x0728, B:358:0x072e, B:360:0x074d, B:363:0x0756, B:367:0x075e, B:368:0x0766, B:370:0x076c, B:348:0x0713, B:372:0x0779, B:373:0x0781, B:375:0x0787, B:377:0x078b, B:379:0x0790, B:388:0x07a8, B:385:0x079f, B:387:0x07a5, B:609:0x0b5a, B:613:0x0b64), top: B:692:0x0012 }] */
    /* JADX WARN: Code duplicated, block: B:311:0x065f A[LOOP:15: B:307:0x0653->B:311:0x065f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:323:0x0690 A[Catch: RuntimeException -> 0x06b6, IOException -> 0x06bb, ze2 -> 0x06c0, no0 -> 0x06c5, vb3 -> 0x06ca, q43 -> 0x06cf, TRY_LEAVE, TryCatch #15 {RuntimeException -> 0x06b6, no0 -> 0x06c5, IOException -> 0x06bb, q43 -> 0x06cf, vb3 -> 0x06ca, ze2 -> 0x06c0, blocks: (B:301:0x0640, B:304:0x064a, B:307:0x0653, B:312:0x0662, B:316:0x0672, B:321:0x0688, B:323:0x0690), top: B:701:0x0640 }] */
    /* JADX WARN: Code duplicated, block: B:327:0x06b1  */
    /* JADX WARN: Code duplicated, block: B:328:0x06b2  */
    /* JADX WARN: Code duplicated, block: B:341:0x06d4  */
    /* JADX WARN: Code duplicated, block: B:344:0x0709 A[Catch: IOException -> 0x0028, ze2 -> 0x002b, no0 -> 0x002e, vb3 -> 0x0031, RuntimeException -> 0x05dc, q43 -> 0x05df, TryCatch #26 {RuntimeException -> 0x05dc, q43 -> 0x05df, blocks: (B:278:0x05d8, B:286:0x05f3, B:287:0x05fb, B:289:0x0608, B:291:0x0616, B:296:0x062e, B:389:0x07ab, B:391:0x07b1, B:393:0x07b7, B:396:0x07bc, B:397:0x07c7, B:399:0x07cb, B:403:0x07f0, B:405:0x07f6, B:410:0x0804, B:411:0x080c, B:412:0x080f, B:414:0x0818, B:462:0x08e6, B:463:0x08eb, B:468:0x08f8, B:470:0x0900, B:471:0x0906, B:473:0x0914, B:474:0x092d, B:476:0x0931, B:478:0x0939, B:492:0x0963, B:479:0x093e, B:481:0x0947, B:485:0x0950, B:491:0x0960, B:494:0x096d, B:496:0x0973, B:500:0x0980, B:509:0x09bc, B:511:0x09c2, B:513:0x09c6, B:540:0x0a59, B:542:0x0a65, B:544:0x0a76, B:545:0x0a7f, B:564:0x0ac9, B:567:0x0ad0, B:569:0x0ad4, B:574:0x0ae1, B:575:0x0ae4, B:576:0x0ae7, B:578:0x0aed, B:580:0x0af6, B:582:0x0afe, B:584:0x0b04, B:586:0x0b0a, B:593:0x0b2c, B:595:0x0b32, B:599:0x0b3b, B:608:0x0b55, B:605:0x0b4e, B:607:0x0b52, B:587:0x0b11, B:590:0x0b1f, B:591:0x0b27, B:592:0x0b28, B:546:0x0a83, B:548:0x0a89, B:550:0x0a8d, B:554:0x0a96, B:556:0x0aa5, B:558:0x0aab, B:560:0x0ab7, B:561:0x0abc, B:562:0x0ac1, B:563:0x0ac6, B:516:0x09d4, B:518:0x09d8, B:520:0x09ea, B:522:0x09f5, B:524:0x09fd, B:528:0x0a06, B:530:0x0a10, B:536:0x0a1b, B:502:0x0988, B:504:0x098c, B:505:0x09a6, B:507:0x09ac, B:493:0x0966, B:417:0x0821, B:419:0x0825, B:421:0x082b, B:423:0x0831, B:425:0x083b, B:428:0x0841, B:429:0x0844, B:431:0x084d, B:433:0x085f, B:435:0x0868, B:437:0x0870, B:442:0x087c, B:444:0x08a4, B:446:0x08aa, B:448:0x08af, B:449:0x08b7, B:451:0x08bd, B:452:0x08c0, B:453:0x08c9, B:455:0x08cd, B:457:0x08d3, B:458:0x08d8, B:461:0x08e5, B:299:0x063a, B:309:0x0657, B:314:0x0668, B:318:0x067a, B:325:0x069f, B:342:0x06d6, B:344:0x0709, B:346:0x070d, B:350:0x071d, B:352:0x0721, B:356:0x0728, B:358:0x072e, B:360:0x074d, B:363:0x0756, B:367:0x075e, B:368:0x0766, B:370:0x076c, B:348:0x0713, B:372:0x0779, B:373:0x0781, B:375:0x0787, B:377:0x078b, B:379:0x0790, B:388:0x07a8, B:385:0x079f, B:387:0x07a5, B:609:0x0b5a, B:613:0x0b64), top: B:692:0x0012 }] */
    /* JADX WARN: Code duplicated, block: B:364:0x0759  */
    /* JADX WARN: Code duplicated, block: B:372:0x0779 A[Catch: IOException -> 0x0028, ze2 -> 0x002b, no0 -> 0x002e, vb3 -> 0x0031, RuntimeException -> 0x05dc, q43 -> 0x05df, LOOP:18: B:371:0x0777->B:372:0x0779, LOOP_END, TryCatch #26 {RuntimeException -> 0x05dc, q43 -> 0x05df, blocks: (B:278:0x05d8, B:286:0x05f3, B:287:0x05fb, B:289:0x0608, B:291:0x0616, B:296:0x062e, B:389:0x07ab, B:391:0x07b1, B:393:0x07b7, B:396:0x07bc, B:397:0x07c7, B:399:0x07cb, B:403:0x07f0, B:405:0x07f6, B:410:0x0804, B:411:0x080c, B:412:0x080f, B:414:0x0818, B:462:0x08e6, B:463:0x08eb, B:468:0x08f8, B:470:0x0900, B:471:0x0906, B:473:0x0914, B:474:0x092d, B:476:0x0931, B:478:0x0939, B:492:0x0963, B:479:0x093e, B:481:0x0947, B:485:0x0950, B:491:0x0960, B:494:0x096d, B:496:0x0973, B:500:0x0980, B:509:0x09bc, B:511:0x09c2, B:513:0x09c6, B:540:0x0a59, B:542:0x0a65, B:544:0x0a76, B:545:0x0a7f, B:564:0x0ac9, B:567:0x0ad0, B:569:0x0ad4, B:574:0x0ae1, B:575:0x0ae4, B:576:0x0ae7, B:578:0x0aed, B:580:0x0af6, B:582:0x0afe, B:584:0x0b04, B:586:0x0b0a, B:593:0x0b2c, B:595:0x0b32, B:599:0x0b3b, B:608:0x0b55, B:605:0x0b4e, B:607:0x0b52, B:587:0x0b11, B:590:0x0b1f, B:591:0x0b27, B:592:0x0b28, B:546:0x0a83, B:548:0x0a89, B:550:0x0a8d, B:554:0x0a96, B:556:0x0aa5, B:558:0x0aab, B:560:0x0ab7, B:561:0x0abc, B:562:0x0ac1, B:563:0x0ac6, B:516:0x09d4, B:518:0x09d8, B:520:0x09ea, B:522:0x09f5, B:524:0x09fd, B:528:0x0a06, B:530:0x0a10, B:536:0x0a1b, B:502:0x0988, B:504:0x098c, B:505:0x09a6, B:507:0x09ac, B:493:0x0966, B:417:0x0821, B:419:0x0825, B:421:0x082b, B:423:0x0831, B:425:0x083b, B:428:0x0841, B:429:0x0844, B:431:0x084d, B:433:0x085f, B:435:0x0868, B:437:0x0870, B:442:0x087c, B:444:0x08a4, B:446:0x08aa, B:448:0x08af, B:449:0x08b7, B:451:0x08bd, B:452:0x08c0, B:453:0x08c9, B:455:0x08cd, B:457:0x08d3, B:458:0x08d8, B:461:0x08e5, B:299:0x063a, B:309:0x0657, B:314:0x0668, B:318:0x067a, B:325:0x069f, B:342:0x06d6, B:344:0x0709, B:346:0x070d, B:350:0x071d, B:352:0x0721, B:356:0x0728, B:358:0x072e, B:360:0x074d, B:363:0x0756, B:367:0x075e, B:368:0x0766, B:370:0x076c, B:348:0x0713, B:372:0x0779, B:373:0x0781, B:375:0x0787, B:377:0x078b, B:379:0x0790, B:388:0x07a8, B:385:0x079f, B:387:0x07a5, B:609:0x0b5a, B:613:0x0b64), top: B:692:0x0012 }] */
    /* JADX WARN: Code duplicated, block: B:375:0x0787 A[Catch: IOException -> 0x0028, ze2 -> 0x002b, no0 -> 0x002e, vb3 -> 0x0031, RuntimeException -> 0x05dc, q43 -> 0x05df, TryCatch #26 {RuntimeException -> 0x05dc, q43 -> 0x05df, blocks: (B:278:0x05d8, B:286:0x05f3, B:287:0x05fb, B:289:0x0608, B:291:0x0616, B:296:0x062e, B:389:0x07ab, B:391:0x07b1, B:393:0x07b7, B:396:0x07bc, B:397:0x07c7, B:399:0x07cb, B:403:0x07f0, B:405:0x07f6, B:410:0x0804, B:411:0x080c, B:412:0x080f, B:414:0x0818, B:462:0x08e6, B:463:0x08eb, B:468:0x08f8, B:470:0x0900, B:471:0x0906, B:473:0x0914, B:474:0x092d, B:476:0x0931, B:478:0x0939, B:492:0x0963, B:479:0x093e, B:481:0x0947, B:485:0x0950, B:491:0x0960, B:494:0x096d, B:496:0x0973, B:500:0x0980, B:509:0x09bc, B:511:0x09c2, B:513:0x09c6, B:540:0x0a59, B:542:0x0a65, B:544:0x0a76, B:545:0x0a7f, B:564:0x0ac9, B:567:0x0ad0, B:569:0x0ad4, B:574:0x0ae1, B:575:0x0ae4, B:576:0x0ae7, B:578:0x0aed, B:580:0x0af6, B:582:0x0afe, B:584:0x0b04, B:586:0x0b0a, B:593:0x0b2c, B:595:0x0b32, B:599:0x0b3b, B:608:0x0b55, B:605:0x0b4e, B:607:0x0b52, B:587:0x0b11, B:590:0x0b1f, B:591:0x0b27, B:592:0x0b28, B:546:0x0a83, B:548:0x0a89, B:550:0x0a8d, B:554:0x0a96, B:556:0x0aa5, B:558:0x0aab, B:560:0x0ab7, B:561:0x0abc, B:562:0x0ac1, B:563:0x0ac6, B:516:0x09d4, B:518:0x09d8, B:520:0x09ea, B:522:0x09f5, B:524:0x09fd, B:528:0x0a06, B:530:0x0a10, B:536:0x0a1b, B:502:0x0988, B:504:0x098c, B:505:0x09a6, B:507:0x09ac, B:493:0x0966, B:417:0x0821, B:419:0x0825, B:421:0x082b, B:423:0x0831, B:425:0x083b, B:428:0x0841, B:429:0x0844, B:431:0x084d, B:433:0x085f, B:435:0x0868, B:437:0x0870, B:442:0x087c, B:444:0x08a4, B:446:0x08aa, B:448:0x08af, B:449:0x08b7, B:451:0x08bd, B:452:0x08c0, B:453:0x08c9, B:455:0x08cd, B:457:0x08d3, B:458:0x08d8, B:461:0x08e5, B:299:0x063a, B:309:0x0657, B:314:0x0668, B:318:0x067a, B:325:0x069f, B:342:0x06d6, B:344:0x0709, B:346:0x070d, B:350:0x071d, B:352:0x0721, B:356:0x0728, B:358:0x072e, B:360:0x074d, B:363:0x0756, B:367:0x075e, B:368:0x0766, B:370:0x076c, B:348:0x0713, B:372:0x0779, B:373:0x0781, B:375:0x0787, B:377:0x078b, B:379:0x0790, B:388:0x07a8, B:385:0x079f, B:387:0x07a5, B:609:0x0b5a, B:613:0x0b64), top: B:692:0x0012 }] */
    /* JADX WARN: Code duplicated, block: B:377:0x078b A[Catch: IOException -> 0x0028, ze2 -> 0x002b, no0 -> 0x002e, vb3 -> 0x0031, RuntimeException -> 0x05dc, q43 -> 0x05df, TryCatch #26 {RuntimeException -> 0x05dc, q43 -> 0x05df, blocks: (B:278:0x05d8, B:286:0x05f3, B:287:0x05fb, B:289:0x0608, B:291:0x0616, B:296:0x062e, B:389:0x07ab, B:391:0x07b1, B:393:0x07b7, B:396:0x07bc, B:397:0x07c7, B:399:0x07cb, B:403:0x07f0, B:405:0x07f6, B:410:0x0804, B:411:0x080c, B:412:0x080f, B:414:0x0818, B:462:0x08e6, B:463:0x08eb, B:468:0x08f8, B:470:0x0900, B:471:0x0906, B:473:0x0914, B:474:0x092d, B:476:0x0931, B:478:0x0939, B:492:0x0963, B:479:0x093e, B:481:0x0947, B:485:0x0950, B:491:0x0960, B:494:0x096d, B:496:0x0973, B:500:0x0980, B:509:0x09bc, B:511:0x09c2, B:513:0x09c6, B:540:0x0a59, B:542:0x0a65, B:544:0x0a76, B:545:0x0a7f, B:564:0x0ac9, B:567:0x0ad0, B:569:0x0ad4, B:574:0x0ae1, B:575:0x0ae4, B:576:0x0ae7, B:578:0x0aed, B:580:0x0af6, B:582:0x0afe, B:584:0x0b04, B:586:0x0b0a, B:593:0x0b2c, B:595:0x0b32, B:599:0x0b3b, B:608:0x0b55, B:605:0x0b4e, B:607:0x0b52, B:587:0x0b11, B:590:0x0b1f, B:591:0x0b27, B:592:0x0b28, B:546:0x0a83, B:548:0x0a89, B:550:0x0a8d, B:554:0x0a96, B:556:0x0aa5, B:558:0x0aab, B:560:0x0ab7, B:561:0x0abc, B:562:0x0ac1, B:563:0x0ac6, B:516:0x09d4, B:518:0x09d8, B:520:0x09ea, B:522:0x09f5, B:524:0x09fd, B:528:0x0a06, B:530:0x0a10, B:536:0x0a1b, B:502:0x0988, B:504:0x098c, B:505:0x09a6, B:507:0x09ac, B:493:0x0966, B:417:0x0821, B:419:0x0825, B:421:0x082b, B:423:0x0831, B:425:0x083b, B:428:0x0841, B:429:0x0844, B:431:0x084d, B:433:0x085f, B:435:0x0868, B:437:0x0870, B:442:0x087c, B:444:0x08a4, B:446:0x08aa, B:448:0x08af, B:449:0x08b7, B:451:0x08bd, B:452:0x08c0, B:453:0x08c9, B:455:0x08cd, B:457:0x08d3, B:458:0x08d8, B:461:0x08e5, B:299:0x063a, B:309:0x0657, B:314:0x0668, B:318:0x067a, B:325:0x069f, B:342:0x06d6, B:344:0x0709, B:346:0x070d, B:350:0x071d, B:352:0x0721, B:356:0x0728, B:358:0x072e, B:360:0x074d, B:363:0x0756, B:367:0x075e, B:368:0x0766, B:370:0x076c, B:348:0x0713, B:372:0x0779, B:373:0x0781, B:375:0x0787, B:377:0x078b, B:379:0x0790, B:388:0x07a8, B:385:0x079f, B:387:0x07a5, B:609:0x0b5a, B:613:0x0b64), top: B:692:0x0012 }] */
    /* JADX WARN: Code duplicated, block: B:379:0x0790 A[Catch: IOException -> 0x0028, ze2 -> 0x002b, no0 -> 0x002e, vb3 -> 0x0031, RuntimeException -> 0x05dc, q43 -> 0x05df, TryCatch #26 {RuntimeException -> 0x05dc, q43 -> 0x05df, blocks: (B:278:0x05d8, B:286:0x05f3, B:287:0x05fb, B:289:0x0608, B:291:0x0616, B:296:0x062e, B:389:0x07ab, B:391:0x07b1, B:393:0x07b7, B:396:0x07bc, B:397:0x07c7, B:399:0x07cb, B:403:0x07f0, B:405:0x07f6, B:410:0x0804, B:411:0x080c, B:412:0x080f, B:414:0x0818, B:462:0x08e6, B:463:0x08eb, B:468:0x08f8, B:470:0x0900, B:471:0x0906, B:473:0x0914, B:474:0x092d, B:476:0x0931, B:478:0x0939, B:492:0x0963, B:479:0x093e, B:481:0x0947, B:485:0x0950, B:491:0x0960, B:494:0x096d, B:496:0x0973, B:500:0x0980, B:509:0x09bc, B:511:0x09c2, B:513:0x09c6, B:540:0x0a59, B:542:0x0a65, B:544:0x0a76, B:545:0x0a7f, B:564:0x0ac9, B:567:0x0ad0, B:569:0x0ad4, B:574:0x0ae1, B:575:0x0ae4, B:576:0x0ae7, B:578:0x0aed, B:580:0x0af6, B:582:0x0afe, B:584:0x0b04, B:586:0x0b0a, B:593:0x0b2c, B:595:0x0b32, B:599:0x0b3b, B:608:0x0b55, B:605:0x0b4e, B:607:0x0b52, B:587:0x0b11, B:590:0x0b1f, B:591:0x0b27, B:592:0x0b28, B:546:0x0a83, B:548:0x0a89, B:550:0x0a8d, B:554:0x0a96, B:556:0x0aa5, B:558:0x0aab, B:560:0x0ab7, B:561:0x0abc, B:562:0x0ac1, B:563:0x0ac6, B:516:0x09d4, B:518:0x09d8, B:520:0x09ea, B:522:0x09f5, B:524:0x09fd, B:528:0x0a06, B:530:0x0a10, B:536:0x0a1b, B:502:0x0988, B:504:0x098c, B:505:0x09a6, B:507:0x09ac, B:493:0x0966, B:417:0x0821, B:419:0x0825, B:421:0x082b, B:423:0x0831, B:425:0x083b, B:428:0x0841, B:429:0x0844, B:431:0x084d, B:433:0x085f, B:435:0x0868, B:437:0x0870, B:442:0x087c, B:444:0x08a4, B:446:0x08aa, B:448:0x08af, B:449:0x08b7, B:451:0x08bd, B:452:0x08c0, B:453:0x08c9, B:455:0x08cd, B:457:0x08d3, B:458:0x08d8, B:461:0x08e5, B:299:0x063a, B:309:0x0657, B:314:0x0668, B:318:0x067a, B:325:0x069f, B:342:0x06d6, B:344:0x0709, B:346:0x070d, B:350:0x071d, B:352:0x0721, B:356:0x0728, B:358:0x072e, B:360:0x074d, B:363:0x0756, B:367:0x075e, B:368:0x0766, B:370:0x076c, B:348:0x0713, B:372:0x0779, B:373:0x0781, B:375:0x0787, B:377:0x078b, B:379:0x0790, B:388:0x07a8, B:385:0x079f, B:387:0x07a5, B:609:0x0b5a, B:613:0x0b64), top: B:692:0x0012 }] */
    /* JADX WARN: Code duplicated, block: B:381:0x0798  */
    /* JADX WARN: Code duplicated, block: B:382:0x079b  */
    /* JADX WARN: Code duplicated, block: B:384:0x079e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:385:0x079f A[Catch: IOException -> 0x0028, ze2 -> 0x002b, no0 -> 0x002e, vb3 -> 0x0031, RuntimeException -> 0x05dc, q43 -> 0x05df, TryCatch #26 {RuntimeException -> 0x05dc, q43 -> 0x05df, blocks: (B:278:0x05d8, B:286:0x05f3, B:287:0x05fb, B:289:0x0608, B:291:0x0616, B:296:0x062e, B:389:0x07ab, B:391:0x07b1, B:393:0x07b7, B:396:0x07bc, B:397:0x07c7, B:399:0x07cb, B:403:0x07f0, B:405:0x07f6, B:410:0x0804, B:411:0x080c, B:412:0x080f, B:414:0x0818, B:462:0x08e6, B:463:0x08eb, B:468:0x08f8, B:470:0x0900, B:471:0x0906, B:473:0x0914, B:474:0x092d, B:476:0x0931, B:478:0x0939, B:492:0x0963, B:479:0x093e, B:481:0x0947, B:485:0x0950, B:491:0x0960, B:494:0x096d, B:496:0x0973, B:500:0x0980, B:509:0x09bc, B:511:0x09c2, B:513:0x09c6, B:540:0x0a59, B:542:0x0a65, B:544:0x0a76, B:545:0x0a7f, B:564:0x0ac9, B:567:0x0ad0, B:569:0x0ad4, B:574:0x0ae1, B:575:0x0ae4, B:576:0x0ae7, B:578:0x0aed, B:580:0x0af6, B:582:0x0afe, B:584:0x0b04, B:586:0x0b0a, B:593:0x0b2c, B:595:0x0b32, B:599:0x0b3b, B:608:0x0b55, B:605:0x0b4e, B:607:0x0b52, B:587:0x0b11, B:590:0x0b1f, B:591:0x0b27, B:592:0x0b28, B:546:0x0a83, B:548:0x0a89, B:550:0x0a8d, B:554:0x0a96, B:556:0x0aa5, B:558:0x0aab, B:560:0x0ab7, B:561:0x0abc, B:562:0x0ac1, B:563:0x0ac6, B:516:0x09d4, B:518:0x09d8, B:520:0x09ea, B:522:0x09f5, B:524:0x09fd, B:528:0x0a06, B:530:0x0a10, B:536:0x0a1b, B:502:0x0988, B:504:0x098c, B:505:0x09a6, B:507:0x09ac, B:493:0x0966, B:417:0x0821, B:419:0x0825, B:421:0x082b, B:423:0x0831, B:425:0x083b, B:428:0x0841, B:429:0x0844, B:431:0x084d, B:433:0x085f, B:435:0x0868, B:437:0x0870, B:442:0x087c, B:444:0x08a4, B:446:0x08aa, B:448:0x08af, B:449:0x08b7, B:451:0x08bd, B:452:0x08c0, B:453:0x08c9, B:455:0x08cd, B:457:0x08d3, B:458:0x08d8, B:461:0x08e5, B:299:0x063a, B:309:0x0657, B:314:0x0668, B:318:0x067a, B:325:0x069f, B:342:0x06d6, B:344:0x0709, B:346:0x070d, B:350:0x071d, B:352:0x0721, B:356:0x0728, B:358:0x072e, B:360:0x074d, B:363:0x0756, B:367:0x075e, B:368:0x0766, B:370:0x076c, B:348:0x0713, B:372:0x0779, B:373:0x0781, B:375:0x0787, B:377:0x078b, B:379:0x0790, B:388:0x07a8, B:385:0x079f, B:387:0x07a5, B:609:0x0b5a, B:613:0x0b64), top: B:692:0x0012 }] */
    /* JADX WARN: Code duplicated, block: B:399:0x07cb A[Catch: IOException -> 0x0028, ze2 -> 0x002b, no0 -> 0x002e, vb3 -> 0x0031, RuntimeException -> 0x05dc, q43 -> 0x05df, LOOP:5: B:397:0x07c7->B:399:0x07cb, LOOP_END, TryCatch #26 {RuntimeException -> 0x05dc, q43 -> 0x05df, blocks: (B:278:0x05d8, B:286:0x05f3, B:287:0x05fb, B:289:0x0608, B:291:0x0616, B:296:0x062e, B:389:0x07ab, B:391:0x07b1, B:393:0x07b7, B:396:0x07bc, B:397:0x07c7, B:399:0x07cb, B:403:0x07f0, B:405:0x07f6, B:410:0x0804, B:411:0x080c, B:412:0x080f, B:414:0x0818, B:462:0x08e6, B:463:0x08eb, B:468:0x08f8, B:470:0x0900, B:471:0x0906, B:473:0x0914, B:474:0x092d, B:476:0x0931, B:478:0x0939, B:492:0x0963, B:479:0x093e, B:481:0x0947, B:485:0x0950, B:491:0x0960, B:494:0x096d, B:496:0x0973, B:500:0x0980, B:509:0x09bc, B:511:0x09c2, B:513:0x09c6, B:540:0x0a59, B:542:0x0a65, B:544:0x0a76, B:545:0x0a7f, B:564:0x0ac9, B:567:0x0ad0, B:569:0x0ad4, B:574:0x0ae1, B:575:0x0ae4, B:576:0x0ae7, B:578:0x0aed, B:580:0x0af6, B:582:0x0afe, B:584:0x0b04, B:586:0x0b0a, B:593:0x0b2c, B:595:0x0b32, B:599:0x0b3b, B:608:0x0b55, B:605:0x0b4e, B:607:0x0b52, B:587:0x0b11, B:590:0x0b1f, B:591:0x0b27, B:592:0x0b28, B:546:0x0a83, B:548:0x0a89, B:550:0x0a8d, B:554:0x0a96, B:556:0x0aa5, B:558:0x0aab, B:560:0x0ab7, B:561:0x0abc, B:562:0x0ac1, B:563:0x0ac6, B:516:0x09d4, B:518:0x09d8, B:520:0x09ea, B:522:0x09f5, B:524:0x09fd, B:528:0x0a06, B:530:0x0a10, B:536:0x0a1b, B:502:0x0988, B:504:0x098c, B:505:0x09a6, B:507:0x09ac, B:493:0x0966, B:417:0x0821, B:419:0x0825, B:421:0x082b, B:423:0x0831, B:425:0x083b, B:428:0x0841, B:429:0x0844, B:431:0x084d, B:433:0x085f, B:435:0x0868, B:437:0x0870, B:442:0x087c, B:444:0x08a4, B:446:0x08aa, B:448:0x08af, B:449:0x08b7, B:451:0x08bd, B:452:0x08c0, B:453:0x08c9, B:455:0x08cd, B:457:0x08d3, B:458:0x08d8, B:461:0x08e5, B:299:0x063a, B:309:0x0657, B:314:0x0668, B:318:0x067a, B:325:0x069f, B:342:0x06d6, B:344:0x0709, B:346:0x070d, B:350:0x071d, B:352:0x0721, B:356:0x0728, B:358:0x072e, B:360:0x074d, B:363:0x0756, B:367:0x075e, B:368:0x0766, B:370:0x076c, B:348:0x0713, B:372:0x0779, B:373:0x0781, B:375:0x0787, B:377:0x078b, B:379:0x0790, B:388:0x07a8, B:385:0x079f, B:387:0x07a5, B:609:0x0b5a, B:613:0x0b64), top: B:692:0x0012 }] */
    /* JADX WARN: Code duplicated, block: B:401:0x07ed  */
    /* JADX WARN: Code duplicated, block: B:403:0x07f0 A[Catch: IOException -> 0x0028, ze2 -> 0x002b, no0 -> 0x002e, vb3 -> 0x0031, RuntimeException -> 0x05dc, q43 -> 0x05df, TryCatch #26 {RuntimeException -> 0x05dc, q43 -> 0x05df, blocks: (B:278:0x05d8, B:286:0x05f3, B:287:0x05fb, B:289:0x0608, B:291:0x0616, B:296:0x062e, B:389:0x07ab, B:391:0x07b1, B:393:0x07b7, B:396:0x07bc, B:397:0x07c7, B:399:0x07cb, B:403:0x07f0, B:405:0x07f6, B:410:0x0804, B:411:0x080c, B:412:0x080f, B:414:0x0818, B:462:0x08e6, B:463:0x08eb, B:468:0x08f8, B:470:0x0900, B:471:0x0906, B:473:0x0914, B:474:0x092d, B:476:0x0931, B:478:0x0939, B:492:0x0963, B:479:0x093e, B:481:0x0947, B:485:0x0950, B:491:0x0960, B:494:0x096d, B:496:0x0973, B:500:0x0980, B:509:0x09bc, B:511:0x09c2, B:513:0x09c6, B:540:0x0a59, B:542:0x0a65, B:544:0x0a76, B:545:0x0a7f, B:564:0x0ac9, B:567:0x0ad0, B:569:0x0ad4, B:574:0x0ae1, B:575:0x0ae4, B:576:0x0ae7, B:578:0x0aed, B:580:0x0af6, B:582:0x0afe, B:584:0x0b04, B:586:0x0b0a, B:593:0x0b2c, B:595:0x0b32, B:599:0x0b3b, B:608:0x0b55, B:605:0x0b4e, B:607:0x0b52, B:587:0x0b11, B:590:0x0b1f, B:591:0x0b27, B:592:0x0b28, B:546:0x0a83, B:548:0x0a89, B:550:0x0a8d, B:554:0x0a96, B:556:0x0aa5, B:558:0x0aab, B:560:0x0ab7, B:561:0x0abc, B:562:0x0ac1, B:563:0x0ac6, B:516:0x09d4, B:518:0x09d8, B:520:0x09ea, B:522:0x09f5, B:524:0x09fd, B:528:0x0a06, B:530:0x0a10, B:536:0x0a1b, B:502:0x0988, B:504:0x098c, B:505:0x09a6, B:507:0x09ac, B:493:0x0966, B:417:0x0821, B:419:0x0825, B:421:0x082b, B:423:0x0831, B:425:0x083b, B:428:0x0841, B:429:0x0844, B:431:0x084d, B:433:0x085f, B:435:0x0868, B:437:0x0870, B:442:0x087c, B:444:0x08a4, B:446:0x08aa, B:448:0x08af, B:449:0x08b7, B:451:0x08bd, B:452:0x08c0, B:453:0x08c9, B:455:0x08cd, B:457:0x08d3, B:458:0x08d8, B:461:0x08e5, B:299:0x063a, B:309:0x0657, B:314:0x0668, B:318:0x067a, B:325:0x069f, B:342:0x06d6, B:344:0x0709, B:346:0x070d, B:350:0x071d, B:352:0x0721, B:356:0x0728, B:358:0x072e, B:360:0x074d, B:363:0x0756, B:367:0x075e, B:368:0x0766, B:370:0x076c, B:348:0x0713, B:372:0x0779, B:373:0x0781, B:375:0x0787, B:377:0x078b, B:379:0x0790, B:388:0x07a8, B:385:0x079f, B:387:0x07a5, B:609:0x0b5a, B:613:0x0b64), top: B:692:0x0012 }] */
    /* JADX WARN: Code duplicated, block: B:405:0x07f6 A[Catch: IOException -> 0x0028, ze2 -> 0x002b, no0 -> 0x002e, vb3 -> 0x0031, RuntimeException -> 0x05dc, q43 -> 0x05df, TryCatch #26 {RuntimeException -> 0x05dc, q43 -> 0x05df, blocks: (B:278:0x05d8, B:286:0x05f3, B:287:0x05fb, B:289:0x0608, B:291:0x0616, B:296:0x062e, B:389:0x07ab, B:391:0x07b1, B:393:0x07b7, B:396:0x07bc, B:397:0x07c7, B:399:0x07cb, B:403:0x07f0, B:405:0x07f6, B:410:0x0804, B:411:0x080c, B:412:0x080f, B:414:0x0818, B:462:0x08e6, B:463:0x08eb, B:468:0x08f8, B:470:0x0900, B:471:0x0906, B:473:0x0914, B:474:0x092d, B:476:0x0931, B:478:0x0939, B:492:0x0963, B:479:0x093e, B:481:0x0947, B:485:0x0950, B:491:0x0960, B:494:0x096d, B:496:0x0973, B:500:0x0980, B:509:0x09bc, B:511:0x09c2, B:513:0x09c6, B:540:0x0a59, B:542:0x0a65, B:544:0x0a76, B:545:0x0a7f, B:564:0x0ac9, B:567:0x0ad0, B:569:0x0ad4, B:574:0x0ae1, B:575:0x0ae4, B:576:0x0ae7, B:578:0x0aed, B:580:0x0af6, B:582:0x0afe, B:584:0x0b04, B:586:0x0b0a, B:593:0x0b2c, B:595:0x0b32, B:599:0x0b3b, B:608:0x0b55, B:605:0x0b4e, B:607:0x0b52, B:587:0x0b11, B:590:0x0b1f, B:591:0x0b27, B:592:0x0b28, B:546:0x0a83, B:548:0x0a89, B:550:0x0a8d, B:554:0x0a96, B:556:0x0aa5, B:558:0x0aab, B:560:0x0ab7, B:561:0x0abc, B:562:0x0ac1, B:563:0x0ac6, B:516:0x09d4, B:518:0x09d8, B:520:0x09ea, B:522:0x09f5, B:524:0x09fd, B:528:0x0a06, B:530:0x0a10, B:536:0x0a1b, B:502:0x0988, B:504:0x098c, B:505:0x09a6, B:507:0x09ac, B:493:0x0966, B:417:0x0821, B:419:0x0825, B:421:0x082b, B:423:0x0831, B:425:0x083b, B:428:0x0841, B:429:0x0844, B:431:0x084d, B:433:0x085f, B:435:0x0868, B:437:0x0870, B:442:0x087c, B:444:0x08a4, B:446:0x08aa, B:448:0x08af, B:449:0x08b7, B:451:0x08bd, B:452:0x08c0, B:453:0x08c9, B:455:0x08cd, B:457:0x08d3, B:458:0x08d8, B:461:0x08e5, B:299:0x063a, B:309:0x0657, B:314:0x0668, B:318:0x067a, B:325:0x069f, B:342:0x06d6, B:344:0x0709, B:346:0x070d, B:350:0x071d, B:352:0x0721, B:356:0x0728, B:358:0x072e, B:360:0x074d, B:363:0x0756, B:367:0x075e, B:368:0x0766, B:370:0x076c, B:348:0x0713, B:372:0x0779, B:373:0x0781, B:375:0x0787, B:377:0x078b, B:379:0x0790, B:388:0x07a8, B:385:0x079f, B:387:0x07a5, B:609:0x0b5a, B:613:0x0b64), top: B:692:0x0012 }] */
    /* JADX WARN: Code duplicated, block: B:407:0x07fe  */
    /* JADX WARN: Code duplicated, block: B:408:0x0801  */
    /* JADX WARN: Code duplicated, block: B:410:0x0804 A[Catch: IOException -> 0x0028, ze2 -> 0x002b, no0 -> 0x002e, vb3 -> 0x0031, RuntimeException -> 0x05dc, q43 -> 0x05df, TryCatch #26 {RuntimeException -> 0x05dc, q43 -> 0x05df, blocks: (B:278:0x05d8, B:286:0x05f3, B:287:0x05fb, B:289:0x0608, B:291:0x0616, B:296:0x062e, B:389:0x07ab, B:391:0x07b1, B:393:0x07b7, B:396:0x07bc, B:397:0x07c7, B:399:0x07cb, B:403:0x07f0, B:405:0x07f6, B:410:0x0804, B:411:0x080c, B:412:0x080f, B:414:0x0818, B:462:0x08e6, B:463:0x08eb, B:468:0x08f8, B:470:0x0900, B:471:0x0906, B:473:0x0914, B:474:0x092d, B:476:0x0931, B:478:0x0939, B:492:0x0963, B:479:0x093e, B:481:0x0947, B:485:0x0950, B:491:0x0960, B:494:0x096d, B:496:0x0973, B:500:0x0980, B:509:0x09bc, B:511:0x09c2, B:513:0x09c6, B:540:0x0a59, B:542:0x0a65, B:544:0x0a76, B:545:0x0a7f, B:564:0x0ac9, B:567:0x0ad0, B:569:0x0ad4, B:574:0x0ae1, B:575:0x0ae4, B:576:0x0ae7, B:578:0x0aed, B:580:0x0af6, B:582:0x0afe, B:584:0x0b04, B:586:0x0b0a, B:593:0x0b2c, B:595:0x0b32, B:599:0x0b3b, B:608:0x0b55, B:605:0x0b4e, B:607:0x0b52, B:587:0x0b11, B:590:0x0b1f, B:591:0x0b27, B:592:0x0b28, B:546:0x0a83, B:548:0x0a89, B:550:0x0a8d, B:554:0x0a96, B:556:0x0aa5, B:558:0x0aab, B:560:0x0ab7, B:561:0x0abc, B:562:0x0ac1, B:563:0x0ac6, B:516:0x09d4, B:518:0x09d8, B:520:0x09ea, B:522:0x09f5, B:524:0x09fd, B:528:0x0a06, B:530:0x0a10, B:536:0x0a1b, B:502:0x0988, B:504:0x098c, B:505:0x09a6, B:507:0x09ac, B:493:0x0966, B:417:0x0821, B:419:0x0825, B:421:0x082b, B:423:0x0831, B:425:0x083b, B:428:0x0841, B:429:0x0844, B:431:0x084d, B:433:0x085f, B:435:0x0868, B:437:0x0870, B:442:0x087c, B:444:0x08a4, B:446:0x08aa, B:448:0x08af, B:449:0x08b7, B:451:0x08bd, B:452:0x08c0, B:453:0x08c9, B:455:0x08cd, B:457:0x08d3, B:458:0x08d8, B:461:0x08e5, B:299:0x063a, B:309:0x0657, B:314:0x0668, B:318:0x067a, B:325:0x069f, B:342:0x06d6, B:344:0x0709, B:346:0x070d, B:350:0x071d, B:352:0x0721, B:356:0x0728, B:358:0x072e, B:360:0x074d, B:363:0x0756, B:367:0x075e, B:368:0x0766, B:370:0x076c, B:348:0x0713, B:372:0x0779, B:373:0x0781, B:375:0x0787, B:377:0x078b, B:379:0x0790, B:388:0x07a8, B:385:0x079f, B:387:0x07a5, B:609:0x0b5a, B:613:0x0b64), top: B:692:0x0012 }] */
    /* JADX WARN: Code duplicated, block: B:448:0x08af A[Catch: IOException -> 0x0028, ze2 -> 0x002b, no0 -> 0x002e, vb3 -> 0x0031, RuntimeException -> 0x05dc, q43 -> 0x05df, LOOP:8: B:447:0x08ad->B:448:0x08af, LOOP_END, TryCatch #26 {RuntimeException -> 0x05dc, q43 -> 0x05df, blocks: (B:278:0x05d8, B:286:0x05f3, B:287:0x05fb, B:289:0x0608, B:291:0x0616, B:296:0x062e, B:389:0x07ab, B:391:0x07b1, B:393:0x07b7, B:396:0x07bc, B:397:0x07c7, B:399:0x07cb, B:403:0x07f0, B:405:0x07f6, B:410:0x0804, B:411:0x080c, B:412:0x080f, B:414:0x0818, B:462:0x08e6, B:463:0x08eb, B:468:0x08f8, B:470:0x0900, B:471:0x0906, B:473:0x0914, B:474:0x092d, B:476:0x0931, B:478:0x0939, B:492:0x0963, B:479:0x093e, B:481:0x0947, B:485:0x0950, B:491:0x0960, B:494:0x096d, B:496:0x0973, B:500:0x0980, B:509:0x09bc, B:511:0x09c2, B:513:0x09c6, B:540:0x0a59, B:542:0x0a65, B:544:0x0a76, B:545:0x0a7f, B:564:0x0ac9, B:567:0x0ad0, B:569:0x0ad4, B:574:0x0ae1, B:575:0x0ae4, B:576:0x0ae7, B:578:0x0aed, B:580:0x0af6, B:582:0x0afe, B:584:0x0b04, B:586:0x0b0a, B:593:0x0b2c, B:595:0x0b32, B:599:0x0b3b, B:608:0x0b55, B:605:0x0b4e, B:607:0x0b52, B:587:0x0b11, B:590:0x0b1f, B:591:0x0b27, B:592:0x0b28, B:546:0x0a83, B:548:0x0a89, B:550:0x0a8d, B:554:0x0a96, B:556:0x0aa5, B:558:0x0aab, B:560:0x0ab7, B:561:0x0abc, B:562:0x0ac1, B:563:0x0ac6, B:516:0x09d4, B:518:0x09d8, B:520:0x09ea, B:522:0x09f5, B:524:0x09fd, B:528:0x0a06, B:530:0x0a10, B:536:0x0a1b, B:502:0x0988, B:504:0x098c, B:505:0x09a6, B:507:0x09ac, B:493:0x0966, B:417:0x0821, B:419:0x0825, B:421:0x082b, B:423:0x0831, B:425:0x083b, B:428:0x0841, B:429:0x0844, B:431:0x084d, B:433:0x085f, B:435:0x0868, B:437:0x0870, B:442:0x087c, B:444:0x08a4, B:446:0x08aa, B:448:0x08af, B:449:0x08b7, B:451:0x08bd, B:452:0x08c0, B:453:0x08c9, B:455:0x08cd, B:457:0x08d3, B:458:0x08d8, B:461:0x08e5, B:299:0x063a, B:309:0x0657, B:314:0x0668, B:318:0x067a, B:325:0x069f, B:342:0x06d6, B:344:0x0709, B:346:0x070d, B:350:0x071d, B:352:0x0721, B:356:0x0728, B:358:0x072e, B:360:0x074d, B:363:0x0756, B:367:0x075e, B:368:0x0766, B:370:0x076c, B:348:0x0713, B:372:0x0779, B:373:0x0781, B:375:0x0787, B:377:0x078b, B:379:0x0790, B:388:0x07a8, B:385:0x079f, B:387:0x07a5, B:609:0x0b5a, B:613:0x0b64), top: B:692:0x0012 }] */
    /* JADX WARN: Code duplicated, block: B:451:0x08bd A[Catch: IOException -> 0x0028, ze2 -> 0x002b, no0 -> 0x002e, vb3 -> 0x0031, RuntimeException -> 0x05dc, q43 -> 0x05df, TryCatch #26 {RuntimeException -> 0x05dc, q43 -> 0x05df, blocks: (B:278:0x05d8, B:286:0x05f3, B:287:0x05fb, B:289:0x0608, B:291:0x0616, B:296:0x062e, B:389:0x07ab, B:391:0x07b1, B:393:0x07b7, B:396:0x07bc, B:397:0x07c7, B:399:0x07cb, B:403:0x07f0, B:405:0x07f6, B:410:0x0804, B:411:0x080c, B:412:0x080f, B:414:0x0818, B:462:0x08e6, B:463:0x08eb, B:468:0x08f8, B:470:0x0900, B:471:0x0906, B:473:0x0914, B:474:0x092d, B:476:0x0931, B:478:0x0939, B:492:0x0963, B:479:0x093e, B:481:0x0947, B:485:0x0950, B:491:0x0960, B:494:0x096d, B:496:0x0973, B:500:0x0980, B:509:0x09bc, B:511:0x09c2, B:513:0x09c6, B:540:0x0a59, B:542:0x0a65, B:544:0x0a76, B:545:0x0a7f, B:564:0x0ac9, B:567:0x0ad0, B:569:0x0ad4, B:574:0x0ae1, B:575:0x0ae4, B:576:0x0ae7, B:578:0x0aed, B:580:0x0af6, B:582:0x0afe, B:584:0x0b04, B:586:0x0b0a, B:593:0x0b2c, B:595:0x0b32, B:599:0x0b3b, B:608:0x0b55, B:605:0x0b4e, B:607:0x0b52, B:587:0x0b11, B:590:0x0b1f, B:591:0x0b27, B:592:0x0b28, B:546:0x0a83, B:548:0x0a89, B:550:0x0a8d, B:554:0x0a96, B:556:0x0aa5, B:558:0x0aab, B:560:0x0ab7, B:561:0x0abc, B:562:0x0ac1, B:563:0x0ac6, B:516:0x09d4, B:518:0x09d8, B:520:0x09ea, B:522:0x09f5, B:524:0x09fd, B:528:0x0a06, B:530:0x0a10, B:536:0x0a1b, B:502:0x0988, B:504:0x098c, B:505:0x09a6, B:507:0x09ac, B:493:0x0966, B:417:0x0821, B:419:0x0825, B:421:0x082b, B:423:0x0831, B:425:0x083b, B:428:0x0841, B:429:0x0844, B:431:0x084d, B:433:0x085f, B:435:0x0868, B:437:0x0870, B:442:0x087c, B:444:0x08a4, B:446:0x08aa, B:448:0x08af, B:449:0x08b7, B:451:0x08bd, B:452:0x08c0, B:453:0x08c9, B:455:0x08cd, B:457:0x08d3, B:458:0x08d8, B:461:0x08e5, B:299:0x063a, B:309:0x0657, B:314:0x0668, B:318:0x067a, B:325:0x069f, B:342:0x06d6, B:344:0x0709, B:346:0x070d, B:350:0x071d, B:352:0x0721, B:356:0x0728, B:358:0x072e, B:360:0x074d, B:363:0x0756, B:367:0x075e, B:368:0x0766, B:370:0x076c, B:348:0x0713, B:372:0x0779, B:373:0x0781, B:375:0x0787, B:377:0x078b, B:379:0x0790, B:388:0x07a8, B:385:0x079f, B:387:0x07a5, B:609:0x0b5a, B:613:0x0b64), top: B:692:0x0012 }] */
    /* JADX WARN: Code duplicated, block: B:455:0x08cd A[Catch: IOException -> 0x0028, ze2 -> 0x002b, no0 -> 0x002e, vb3 -> 0x0031, RuntimeException -> 0x05dc, q43 -> 0x05df, TryCatch #26 {RuntimeException -> 0x05dc, q43 -> 0x05df, blocks: (B:278:0x05d8, B:286:0x05f3, B:287:0x05fb, B:289:0x0608, B:291:0x0616, B:296:0x062e, B:389:0x07ab, B:391:0x07b1, B:393:0x07b7, B:396:0x07bc, B:397:0x07c7, B:399:0x07cb, B:403:0x07f0, B:405:0x07f6, B:410:0x0804, B:411:0x080c, B:412:0x080f, B:414:0x0818, B:462:0x08e6, B:463:0x08eb, B:468:0x08f8, B:470:0x0900, B:471:0x0906, B:473:0x0914, B:474:0x092d, B:476:0x0931, B:478:0x0939, B:492:0x0963, B:479:0x093e, B:481:0x0947, B:485:0x0950, B:491:0x0960, B:494:0x096d, B:496:0x0973, B:500:0x0980, B:509:0x09bc, B:511:0x09c2, B:513:0x09c6, B:540:0x0a59, B:542:0x0a65, B:544:0x0a76, B:545:0x0a7f, B:564:0x0ac9, B:567:0x0ad0, B:569:0x0ad4, B:574:0x0ae1, B:575:0x0ae4, B:576:0x0ae7, B:578:0x0aed, B:580:0x0af6, B:582:0x0afe, B:584:0x0b04, B:586:0x0b0a, B:593:0x0b2c, B:595:0x0b32, B:599:0x0b3b, B:608:0x0b55, B:605:0x0b4e, B:607:0x0b52, B:587:0x0b11, B:590:0x0b1f, B:591:0x0b27, B:592:0x0b28, B:546:0x0a83, B:548:0x0a89, B:550:0x0a8d, B:554:0x0a96, B:556:0x0aa5, B:558:0x0aab, B:560:0x0ab7, B:561:0x0abc, B:562:0x0ac1, B:563:0x0ac6, B:516:0x09d4, B:518:0x09d8, B:520:0x09ea, B:522:0x09f5, B:524:0x09fd, B:528:0x0a06, B:530:0x0a10, B:536:0x0a1b, B:502:0x0988, B:504:0x098c, B:505:0x09a6, B:507:0x09ac, B:493:0x0966, B:417:0x0821, B:419:0x0825, B:421:0x082b, B:423:0x0831, B:425:0x083b, B:428:0x0841, B:429:0x0844, B:431:0x084d, B:433:0x085f, B:435:0x0868, B:437:0x0870, B:442:0x087c, B:444:0x08a4, B:446:0x08aa, B:448:0x08af, B:449:0x08b7, B:451:0x08bd, B:452:0x08c0, B:453:0x08c9, B:455:0x08cd, B:457:0x08d3, B:458:0x08d8, B:461:0x08e5, B:299:0x063a, B:309:0x0657, B:314:0x0668, B:318:0x067a, B:325:0x069f, B:342:0x06d6, B:344:0x0709, B:346:0x070d, B:350:0x071d, B:352:0x0721, B:356:0x0728, B:358:0x072e, B:360:0x074d, B:363:0x0756, B:367:0x075e, B:368:0x0766, B:370:0x076c, B:348:0x0713, B:372:0x0779, B:373:0x0781, B:375:0x0787, B:377:0x078b, B:379:0x0790, B:388:0x07a8, B:385:0x079f, B:387:0x07a5, B:609:0x0b5a, B:613:0x0b64), top: B:692:0x0012 }] */
    /* JADX WARN: Code duplicated, block: B:457:0x08d3 A[Catch: IOException -> 0x0028, ze2 -> 0x002b, no0 -> 0x002e, vb3 -> 0x0031, RuntimeException -> 0x05dc, q43 -> 0x05df, TryCatch #26 {RuntimeException -> 0x05dc, q43 -> 0x05df, blocks: (B:278:0x05d8, B:286:0x05f3, B:287:0x05fb, B:289:0x0608, B:291:0x0616, B:296:0x062e, B:389:0x07ab, B:391:0x07b1, B:393:0x07b7, B:396:0x07bc, B:397:0x07c7, B:399:0x07cb, B:403:0x07f0, B:405:0x07f6, B:410:0x0804, B:411:0x080c, B:412:0x080f, B:414:0x0818, B:462:0x08e6, B:463:0x08eb, B:468:0x08f8, B:470:0x0900, B:471:0x0906, B:473:0x0914, B:474:0x092d, B:476:0x0931, B:478:0x0939, B:492:0x0963, B:479:0x093e, B:481:0x0947, B:485:0x0950, B:491:0x0960, B:494:0x096d, B:496:0x0973, B:500:0x0980, B:509:0x09bc, B:511:0x09c2, B:513:0x09c6, B:540:0x0a59, B:542:0x0a65, B:544:0x0a76, B:545:0x0a7f, B:564:0x0ac9, B:567:0x0ad0, B:569:0x0ad4, B:574:0x0ae1, B:575:0x0ae4, B:576:0x0ae7, B:578:0x0aed, B:580:0x0af6, B:582:0x0afe, B:584:0x0b04, B:586:0x0b0a, B:593:0x0b2c, B:595:0x0b32, B:599:0x0b3b, B:608:0x0b55, B:605:0x0b4e, B:607:0x0b52, B:587:0x0b11, B:590:0x0b1f, B:591:0x0b27, B:592:0x0b28, B:546:0x0a83, B:548:0x0a89, B:550:0x0a8d, B:554:0x0a96, B:556:0x0aa5, B:558:0x0aab, B:560:0x0ab7, B:561:0x0abc, B:562:0x0ac1, B:563:0x0ac6, B:516:0x09d4, B:518:0x09d8, B:520:0x09ea, B:522:0x09f5, B:524:0x09fd, B:528:0x0a06, B:530:0x0a10, B:536:0x0a1b, B:502:0x0988, B:504:0x098c, B:505:0x09a6, B:507:0x09ac, B:493:0x0966, B:417:0x0821, B:419:0x0825, B:421:0x082b, B:423:0x0831, B:425:0x083b, B:428:0x0841, B:429:0x0844, B:431:0x084d, B:433:0x085f, B:435:0x0868, B:437:0x0870, B:442:0x087c, B:444:0x08a4, B:446:0x08aa, B:448:0x08af, B:449:0x08b7, B:451:0x08bd, B:452:0x08c0, B:453:0x08c9, B:455:0x08cd, B:457:0x08d3, B:458:0x08d8, B:461:0x08e5, B:299:0x063a, B:309:0x0657, B:314:0x0668, B:318:0x067a, B:325:0x069f, B:342:0x06d6, B:344:0x0709, B:346:0x070d, B:350:0x071d, B:352:0x0721, B:356:0x0728, B:358:0x072e, B:360:0x074d, B:363:0x0756, B:367:0x075e, B:368:0x0766, B:370:0x076c, B:348:0x0713, B:372:0x0779, B:373:0x0781, B:375:0x0787, B:377:0x078b, B:379:0x0790, B:388:0x07a8, B:385:0x079f, B:387:0x07a5, B:609:0x0b5a, B:613:0x0b64), top: B:692:0x0012 }] */
    /* JADX WARN: Code duplicated, block: B:701:0x0640 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:710:0x07eb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:713:0x080c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:714:0x080c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:725:0x08d8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:739:0x0662 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:740:0x0634 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v119, types: [android.os.Handler] */
    /* JADX WARN: Type inference failed for: r0v20, types: [wx1] */
    /* JADX WARN: Type inference failed for: r15v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v11 */
    /* JADX WARN: Type inference failed for: r15v15 */
    /* JADX WARN: Type inference failed for: r15v16 */
    /* JADX WARN: Type inference failed for: r15v18 */
    /* JADX WARN: Type inference failed for: r15v19 */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v20 */
    /* JADX WARN: Type inference failed for: r15v21 */
    /* JADX WARN: Type inference failed for: r15v22 */
    /* JADX WARN: Type inference failed for: r15v4, types: [int] */
    /* JADX WARN: Type inference failed for: r15v5, types: [int] */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r36v0, types: [b83, wd3] */
    /* JADX WARN: Type inference failed for: r8v37, types: [boolean] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:415:0x081c
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:272)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:237)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:80)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.addCases(SwitchRegionMaker.java:127)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.process(SwitchRegionMaker.java:75)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:115)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(android.os.Message r37) {
        /*
            Method dump skipped, instruction units count: 3376
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b83.handleMessage(android.os.Message):boolean");
    }

    public final void i(boolean z) {
        yd3 yd3Var = this.w.h.g.a;
        long jR = r(yd3Var, this.K.r, true, false);
        if (jR != this.K.r) {
            u83 u83Var = this.K;
            this.K = N(yd3Var, jR, u83Var.c, u83Var.d, z, 5);
        }
    }

    public final void j() {
        h83 h83Var = this.w.h;
        if (h83Var == null) {
            return;
        }
        dg3 dg3Var = h83Var.o;
        for (int i = 0; i < 2; i++) {
            if (dg3Var.a(i)) {
                this.f[i].D();
            }
        }
    }

    public final void k() {
        c22 c22Var = this.s;
        c22Var.g = false;
        e93 e93Var = (e93) c22Var.h;
        if (e93Var.f) {
            e93Var.a(e93Var.e());
            e93Var.f = false;
        }
        for (int i = 0; i < 2; i++) {
            a93 a93Var = this.f[i];
            yc3 yc3Var = a93Var.a;
            if (a93.l(yc3Var)) {
                a93.n(yc3Var);
            }
            yc3 yc3Var2 = a93Var.c;
            if (yc3Var2 != null && yc3Var2.m != 0) {
                a93.n(yc3Var2);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00df  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v6 */
    public final void l() throws Throwable {
        long j;
        up0 up0VarG;
        ?? r11;
        long j2;
        long j3;
        long jMax;
        j83 j83Var = this.w;
        h83 h83Var = j83Var.h;
        if (h83Var == null) {
            return;
        }
        long jF = h83Var.e ? h83Var.a.f() : -9223372036854775807L;
        if (jF != -9223372036854775807L) {
            if (!h83Var.b()) {
                j83Var.y(h83Var);
                Q(false);
                L();
            }
            s(jF, true);
            if (jF != this.K.r) {
                u83 u83Var = this.K;
                j = -9223372036854775807L;
                r11 = 0;
                this.K = N(u83Var.b, jF, u83Var.c, jF, true, 5);
            } else {
                j = -9223372036854775807L;
                r11 = 0;
            }
        } else {
            j = -9223372036854775807L;
            boolean z = false;
            c22 c22Var = this.s;
            boolean z2 = h83Var != j83Var.i;
            e93 e93Var = (e93) c22Var.h;
            yc3 yc3Var = (yc3) c22Var.j;
            if (yc3Var == null || yc3Var.u() || ((z2 && ((yc3) c22Var.j).m != 2) || (!((yc3) c22Var.j).t() && (z2 || ((yc3) c22Var.j).n0())))) {
                c22Var.f = true;
                if (c22Var.g && !e93Var.f) {
                    e93Var.h = SystemClock.elapsedRealtime();
                    e93Var.f = true;
                }
            } else {
                g83 g83Var = (g83) c22Var.k;
                g83Var.getClass();
                long jE = g83Var.e();
                if (!c22Var.f) {
                    e93Var.a(jE);
                    up0VarG = g83Var.g();
                    if (!up0VarG.equals(e93Var.i)) {
                        e93Var.b(up0VarG);
                        ((b83) c22Var.i).m.a(16, up0VarG).a();
                    }
                } else if (jE >= e93Var.e()) {
                    c22Var.f = false;
                    if (c22Var.g && !e93Var.f) {
                        e93Var.h = SystemClock.elapsedRealtime();
                        e93Var.f = true;
                    }
                    e93Var.a(jE);
                    up0VarG = g83Var.g();
                    if (!up0VarG.equals(e93Var.i)) {
                        e93Var.b(up0VarG);
                        ((b83) c22Var.i).m.a(16, up0VarG).a();
                    }
                } else if (e93Var.f) {
                    e93Var.a(e93Var.e());
                    e93Var.f = false;
                }
            }
            long jE2 = c22Var.e();
            this.X = jE2;
            long j4 = jE2 - h83Var.p;
            long j5 = this.K.r;
            ArrayList arrayList = this.t;
            if (!arrayList.isEmpty() && !this.K.b.b()) {
                if (this.a0) {
                    this.a0 = false;
                }
                u83 u83Var2 = this.K;
                u83Var2.a.e(u83Var2.b.a);
                int iMin = Math.min(this.Z, arrayList.size());
                if (iMin > 0 && arrayList.get(iMin - 1) != null) {
                    j7.j();
                    return;
                } else {
                    if (iMin < arrayList.size() && arrayList.get(iMin) != null) {
                        j7.j();
                        return;
                    }
                    this.Z = iMin;
                }
            }
            if (c22Var.f()) {
                boolean z3 = !this.L.c;
                u83 u83Var3 = this.K;
                this.K = N(u83Var3.b, j4, u83Var3.c, j4, z3, 6);
                r11 = z;
            } else {
                u83 u83Var4 = this.K;
                u83Var4.r = j4;
                u83Var4.s = SystemClock.elapsedRealtime();
                r11 = z;
            }
        }
        this.K.p = j83Var.k.d();
        u83 u83Var5 = this.K;
        u83Var5.q = R(u83Var5.p);
        u83 u83Var6 = this.K;
        if (u83Var6.l && u83Var6.e == 3 && o(u83Var6.a, u83Var6.b)) {
            u83 u83Var7 = this.K;
            float fMax = 1.0f;
            if (u83Var7.o.a == 1.0f) {
                z03 z03Var = this.h0;
                long jN = n(u83Var7.a, u83Var7.b.a, u83Var7.r);
                long j6 = this.K.q;
                if (z03Var.c != j) {
                    long j7 = jN - j6;
                    long j8 = z03Var.k;
                    if (j8 == j) {
                        z03Var.k = j7;
                        z03Var.l = 0L;
                    } else {
                        long jMax2 = Math.max(j7, (long) ((j7 * 9.999871E-4f) + (j8 * 0.999f)));
                        z03Var.k = jMax2;
                        z03Var.l = (long) ((Math.abs(j7 - jMax2) * 9.999871E-4f) + (z03Var.l * 0.999f));
                    }
                    if (z03Var.j != j) {
                        j2 = 1000;
                        if (SystemClock.elapsedRealtime() - z03Var.j < 1000) {
                            fMax = z03Var.i;
                        }
                    } else {
                        j2 = 1000;
                    }
                    z03Var.j = SystemClock.elapsedRealtime();
                    long j9 = (z03Var.l * 3) + z03Var.k;
                    if (z03Var.h > j9) {
                        long jR = qz1.r(j2);
                        float f = z03Var.i - 1.0f;
                        long j10 = z03Var.e;
                        j3 = jN;
                        float f2 = jR;
                        long j11 = z03Var.h - (((long) (f * f2)) + ((long) (0.029999971f * f2)));
                        long[] jArr = new long[3];
                        jArr[r11] = j9;
                        jArr[1] = j10;
                        jArr[2] = j11;
                        jMax = jArr[r11];
                        for (int i = 1; i < 3; i++) {
                            long j12 = jArr[i];
                            if (j12 > jMax) {
                                jMax = j12;
                            }
                        }
                        z03Var.h = jMax;
                    } else {
                        j3 = jN;
                        long jMax3 = j3 - ((long) (Math.max(0.0f, z03Var.i - 1.0f) / 1.0E-7f));
                        long j13 = z03Var.h;
                        String str = qz1.a;
                        jMax = Math.max(j13, Math.min(jMax3, j9));
                        z03Var.h = jMax;
                        long j14 = z03Var.g;
                        if (j14 != j && jMax > j14) {
                            z03Var.h = j14;
                            jMax = j14;
                        }
                    }
                    long j15 = j3 - jMax;
                    if (Math.abs(j15) < z03Var.a) {
                        z03Var.i = 1.0f;
                        fMax = 1.0f;
                    } else {
                        fMax = Math.max(0.97f, Math.min((j15 * 1.0E-7f) + 1.0f, 1.03f));
                        z03Var.i = fMax;
                    }
                }
                c22 c22Var2 = this.s;
                if (c22Var2.g().a != fMax) {
                    up0 up0Var = new up0(fMax, this.K.o.b);
                    this.m.c(16);
                    this.s.b(up0Var);
                    K(this.K.o, c22Var2.g().a, r11, r11);
                }
            }
        }
    }

    public final void m(int i, boolean z) {
        boolean[] zArr = this.h;
        if (zArr[i] != z) {
            zArr[i] = z;
            this.B.d(new og(this, i, z));
        }
    }

    public final long n(ox0 ox0Var, Object obj, long j) {
        int i = ox0Var.o(obj, this.q).c;
        ex0 ex0Var = this.p;
        ox0Var.b(i, ex0Var, 0L);
        if (ex0Var.d == -9223372036854775807L || !ex0Var.b() || !ex0Var.g) {
            return -9223372036854775807L;
        }
        long j2 = ex0Var.e;
        String str = qz1.a;
        return qz1.r((j2 == -9223372036854775807L ? System.currentTimeMillis() : j2 + SystemClock.elapsedRealtime()) - ex0Var.d) - j;
    }

    public final boolean o(ox0 ox0Var, yd3 yd3Var) {
        if (yd3Var.b() || ox0Var.g()) {
            return false;
        }
        int i = ox0Var.o(yd3Var.a, this.q).c;
        ex0 ex0Var = this.p;
        ox0Var.b(i, ex0Var, 0L);
        return ex0Var.b() && ex0Var.g && ex0Var.d != -9223372036854775807L;
    }

    public final void p(long j) {
        boolean z;
        if (this.G) {
            this.F.getClass();
            z = true;
        } else {
            z = false;
        }
        u83 u83Var = this.K;
        long jMin = 1000;
        long j2 = i0;
        if (z) {
            jMin = u83Var.e != 3 ? j2 : 1000L;
            for (int i = 0; i < 2; i++) {
                a93 a93Var = this.f[i];
                long j3 = this.X;
                long j4 = this.Y;
                yc3 yc3Var = a93Var.a;
                long jQ = a93.l(yc3Var) ? yc3Var.Q(j3, j4) : Long.MAX_VALUE;
                yc3 yc3Var2 = a93Var.c;
                if (yc3Var2 != null && yc3Var2.m != 0) {
                    jQ = Math.min(jQ, yc3Var2.Q(j3, j4));
                }
                jMin = Math.min(jMin, qz1.q(jQ));
            }
            if (this.K.i()) {
                h83 h83Var = this.w.h;
                h83 h83Var2 = h83Var != null ? h83Var.m : null;
                if (h83Var2 != null) {
                    if (this.X + (qz1.r(jMin) * this.K.o.a) >= h83Var2.a()) {
                        jMin = Math.min(jMin, j2);
                    }
                }
            }
        } else if (u83Var.e != 3 || T()) {
            jMin = j2;
        }
        this.m.a.sendEmptyMessageAtTime(2, j + jMin);
    }

    public final void q(a83 a83Var, boolean z) throws Throwable {
        long jLongValue;
        long j;
        long j2;
        yd3 yd3VarE;
        boolean z2;
        int i;
        long j3;
        boolean z3;
        long j4;
        long jH;
        long jR;
        boolean z4;
        u83 u83Var;
        yd3 yd3Var;
        ox0 ox0Var;
        long j5;
        long j6;
        long j7;
        boolean z5;
        u83 u83Var2;
        int i2;
        this.L.b(z ? 1 : 0);
        if (this.H) {
            if (this.I != null) {
                this.J++;
            }
            this.I = a83Var;
            return;
        }
        ox0 ox0Var2 = this.K.a;
        int i3 = this.S;
        boolean z6 = this.T;
        ex0 ex0Var = this.p;
        su0 su0Var = this.q;
        Pair pairZ = z(ox0Var2, a83Var, i3, z6, ex0Var, su0Var);
        if (pairZ == null) {
            Pair pairW = w(this.K.a);
            yd3 yd3Var2 = (yd3) pairW.first;
            jLongValue = ((Long) pairW.second).longValue();
            z2 = !this.K.a.g();
            yd3VarE = yd3Var2;
            j = -9223372036854775807L;
            j2 = 0;
        } else {
            Object obj = pairZ.first;
            jLongValue = ((Long) pairZ.second).longValue();
            long j8 = a83Var.c;
            j = j8 == -9223372036854775807L ? -9223372036854775807L : jLongValue;
            j2 = 0;
            yd3VarE = this.w.E(this.K.a, obj);
            if (yd3VarE.b()) {
                this.K.a.o(yd3VarE.a, su0Var);
                fb0 fb0VarA = su0Var.f.a(-1);
                int i4 = 0;
                while (true) {
                    int[] iArr = fb0VarA.d;
                    if (i4 >= iArr.length || (i = iArr[i4]) == 0 || i == 1) {
                        break;
                    } else {
                        i4++;
                    }
                }
                if (i4 == -1) {
                    su0Var.f.getClass();
                }
                z2 = true;
                jLongValue = 0;
            } else {
                z2 = j8 == -9223372036854775807L;
            }
        }
        try {
            if (this.K.a.g()) {
                this.W = a83Var;
            } else {
                u83 u83Var3 = this.K;
                if (pairZ == null) {
                    if (u83Var3.e != 1) {
                        d(4);
                    }
                    v(false, true, false, true);
                } else {
                    try {
                        try {
                            try {
                                if (yd3VarE.equals(u83Var3.b)) {
                                    h83 h83Var = this.w.h;
                                    if (h83Var == null || !h83Var.e || jLongValue == j2) {
                                        jH = jLongValue;
                                    } else {
                                        xd3 xd3Var = h83Var.a;
                                        long j9 = ex0Var.j;
                                        if (this.G && j9 != -9223372036854775807L) {
                                            this.F.getClass();
                                        }
                                        jH = xd3Var.h(jLongValue, this.E);
                                    }
                                    if (qz1.q(jH) == qz1.q(this.K.r) && ((i2 = (u83Var2 = this.K).e) == 2 || i2 == 3)) {
                                        jLongValue = u83Var2.r;
                                    }
                                    this.K = N(yd3VarE, j7, j6, j7, z5, 2);
                                }
                                jH = jLongValue;
                                G(ox0Var, yd3Var, ox0Var, u83Var.b, j5, true);
                                yd3VarE = yd3Var;
                                j6 = j5;
                                j7 = jR;
                                z5 = z4;
                                this.K = N(yd3VarE, j7, j6, j7, z5, 2);
                            } catch (Throwable th) {
                                th = th;
                                yd3VarE = yd3Var;
                                j3 = j5;
                                j4 = jR;
                                z3 = z4;
                                this.K = N(yd3VarE, j4, j3, j4, z3, 2);
                                throw th;
                            }
                            ox0Var = u83Var.a;
                            j5 = j;
                        } catch (Throwable th2) {
                            th = th2;
                            yd3VarE = yd3Var;
                            j3 = j;
                            j4 = jR;
                            z3 = z4;
                            this.K = N(yd3VarE, j4, j3, j4, z3, 2);
                            throw th;
                        }
                        u83Var = this.K;
                        yd3Var = yd3VarE;
                    } catch (Throwable th3) {
                        th = th3;
                    }
                    this.H = this.G;
                    boolean z7 = this.K.e == 4;
                    j83 j83Var = this.w;
                    jR = r(yd3VarE, jH, j83Var.h != j83Var.i, z7);
                    z4 = z2 | (jLongValue != jR);
                }
            }
            z5 = z2;
            j7 = jLongValue;
            j6 = j;
            this.K = N(yd3VarE, j7, j6, j7, z5, 2);
        } catch (Throwable th4) {
            th = th4;
            j3 = j;
            z3 = z2;
            j4 = jLongValue;
        }
    }

    /* JADX WARN: Code duplicated, block: B:54:0x00d4  */
    public final long r(yd3 yd3Var, long j, boolean z, boolean z2) {
        k();
        boolean z3 = true;
        y(false, true);
        if (z2 || this.K.e == 3) {
            d(2);
        }
        j83 j83Var = this.w;
        h83 h83Var = j83Var.h;
        h83 h83Var2 = h83Var;
        while (h83Var2 != null && !yd3Var.equals(h83Var2.g.a)) {
            h83Var2 = h83Var2.m;
        }
        if (z || h83Var != h83Var2 || (h83Var2 != null && h83Var2.p + j < 0)) {
            B();
            if (h83Var2 != null) {
                while (j83Var.h != h83Var2) {
                    j83Var.x();
                }
                j83Var.y(h83Var2);
                h83Var2.p = 1000000000000L;
                O(new boolean[2], this.w.i.a());
                h83Var2.h = true;
            }
        }
        C();
        if (h83Var2 != null) {
            j83Var.y(h83Var2);
            if (!h83Var2.e) {
                h83Var2.g = h83Var2.g.a(j);
            } else if (h83Var2.f) {
                if (this.G) {
                    this.F.getClass();
                    if (this.K.a.g() || !h83Var2.g.a.equals(this.K.b)) {
                        xd3 xd3Var = h83Var2.a;
                        j = xd3Var.d(j);
                        xd3Var.e(j - this.r);
                    } else {
                        a93[] a93VarArr = this.f;
                        boolean z4 = true;
                        for (int i = 0; i < 2; i++) {
                            a93 a93Var = a93VarArr[i];
                            if (a93Var.g()) {
                                yc3 yc3VarM = a93Var.m(h83Var2);
                                z4 &= yc3VarM != null && yc3VarM.p(j);
                            }
                        }
                        if (z4) {
                            xd3 xd3Var2 = h83Var2.a;
                            long j2 = this.K.r;
                            c93 c93Var = c93.c;
                            if (xd3Var2.h(j2, c93Var) == xd3Var2.h(j, c93Var)) {
                                z3 = false;
                            } else {
                                xd3 xd3Var3 = h83Var2.a;
                                j = xd3Var3.d(j);
                                xd3Var3.e(j - this.r);
                            }
                        } else {
                            xd3 xd3Var4 = h83Var2.a;
                            j = xd3Var4.d(j);
                            xd3Var4.e(j - this.r);
                        }
                    }
                } else {
                    xd3 xd3Var5 = h83Var2.a;
                    j = xd3Var5.d(j);
                    xd3Var5.e(j - this.r);
                }
            }
            s(j, z3);
            L();
        } else {
            j83Var.B();
            s(j, true);
        }
        Q(false);
        this.m.b(2);
        return j;
    }

    public final void s(long j, boolean z) {
        h83 h83Var = this.w.h;
        long j2 = j + (h83Var == null ? 1000000000000L : h83Var.p);
        this.X = j2;
        ((e93) this.s.h).a(j2);
        for (int i = 0; i < 2; i++) {
            a93 a93Var = this.f[i];
            long j3 = this.X;
            yc3 yc3VarM = a93Var.m(h83Var);
            if (yc3VarM != null) {
                yc3VarM.L(j3, false, z);
            }
        }
        for (h83 h83Var2 = r0.h; h83Var2 != null; h83Var2 = h83Var2.m) {
            for (bg3 bg3Var : (bg3[]) h83Var2.o.h) {
            }
        }
    }

    public final void t() {
        for (int i = 0; i < 2; i++) {
            a93 a93Var = this.f[i];
            b93 b93Var = this.G ? this.F : null;
            a93Var.a.a(18, b93Var);
            yc3 yc3Var = a93Var.c;
            if (yc3Var != null) {
                yc3Var.a(18, b93Var);
            }
        }
    }

    public final void u(boolean z, boolean z2) {
        v(z || !this.U, false, true, false);
        this.L.b(z2 ? 1 : 0);
        this.k.e(this.z);
        this.D.b(1, this.K.l);
        d(1);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0084  */
    /* JADX WARN: Code duplicated, block: B:34:0x00b2 A[PHI: r2 r7 r9
  0x00b2: PHI (r2v2 yd3) = (r2v1 yd3), (r2v9 yd3) binds: [B:30:0x0088, B:32:0x00ad] A[DONT_GENERATE, DONT_INLINE]
  0x00b2: PHI (r7v4 long) = (r7v3 long), (r7v17 long) binds: [B:30:0x0088, B:32:0x00ad] A[DONT_GENERATE, DONT_INLINE]
  0x00b2: PHI (r9v2 long) = (r9v1 long), (r9v10 long) binds: [B:30:0x0088, B:32:0x00ad] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:48:0x010f  */
    public final void v(boolean z, boolean z2, boolean z3, boolean z4) {
        long j;
        boolean z5;
        yd3 yd3Var;
        ox0 ox0Var;
        List list;
        this.m.c(2);
        this.H = false;
        this.I = null;
        this.b0 = null;
        y(false, true);
        c22 c22Var = this.s;
        c22Var.g = false;
        e93 e93Var = (e93) c22Var.h;
        if (e93Var.f) {
            e93Var.a(e93Var.e());
            e93Var.f = false;
        }
        this.X = 1000000000000L;
        try {
            B();
        } catch (RuntimeException | q43 e) {
            s90.b0("ExoPlayerImplInternal", "Disable failed.", e);
        }
        if (z) {
            a93[] a93VarArr = this.f;
            for (int i = 0; i < 2; i++) {
                try {
                    a93VarArr[i].b();
                } catch (RuntimeException e2) {
                    s90.b0("ExoPlayerImplInternal", "Reset failed.", e2);
                }
            }
        }
        this.V = 0;
        u83 u83Var = this.K;
        yd3 yd3Var2 = u83Var.b;
        long jLongValue = u83Var.r;
        if (this.K.b.b()) {
            j = this.K.c;
        } else {
            u83 u83Var2 = this.K;
            su0 su0Var = this.q;
            yd3 yd3Var3 = u83Var2.b;
            ox0 ox0Var2 = u83Var2.a;
            if (ox0Var2.g() || ox0Var2.o(yd3Var3.a, su0Var).e) {
                j = this.K.c;
            } else {
                j = this.K.r;
            }
        }
        if (z2) {
            this.W = null;
            Pair pairW = w(this.K.a);
            yd3Var2 = (yd3) pairW.first;
            jLongValue = ((Long) pairW.second).longValue();
            j = -9223372036854775807L;
            z5 = yd3Var2.equals(this.K.b) ? false : true;
        }
        long j2 = jLongValue;
        long j3 = j;
        j83 j83Var = this.w;
        j83Var.B();
        this.R = false;
        ox0 ox0Var3 = this.K.a;
        if (z3 && (ox0Var3 instanceof y83)) {
            y83 y83Var = (y83) ox0Var3;
            cf3 cf3Var = (cf3) this.x.q;
            ox0[] ox0VarArr = y83Var.h;
            ox0[] ox0VarArr2 = new ox0[ox0VarArr.length];
            for (int i2 = 0; i2 < ox0VarArr.length; i2++) {
                ox0VarArr2[i2] = new x83(y83Var, ox0VarArr[i2]);
            }
            y83 y83Var2 = new y83(ox0VarArr2, y83Var.i, cf3Var);
            if (yd3Var2.b != -1) {
                Object obj = yd3Var2.a;
                su0 su0Var2 = this.q;
                y83Var2.o(obj, su0Var2);
                ex0 ex0Var = this.p;
                y83Var2.b(su0Var2.c, ex0Var, 0L);
                if (ex0Var.b()) {
                    ox0Var = y83Var2;
                    yd3Var = new yd3(obj, yd3Var2.d);
                } else {
                    yd3Var = yd3Var2;
                    ox0Var = y83Var2;
                }
            } else {
                yd3Var = yd3Var2;
                ox0Var = y83Var2;
            }
        } else {
            yd3Var = yd3Var2;
            ox0Var = ox0Var3;
        }
        u83 u83Var3 = this.K;
        int i3 = u83Var3.e;
        q43 q43Var = z4 ? null : u83Var3.f;
        gf3 gf3Var = z5 ? gf3.d : u83Var3.h;
        dg3 dg3Var = z5 ? this.j : u83Var3.i;
        if (z5) {
            tj2 tj2Var = vj2.g;
            list = qk2.j;
        } else {
            list = u83Var3.j;
        }
        this.K = new u83(ox0Var, yd3Var, j3, j2, i3, q43Var, false, gf3Var, dg3Var, list, yd3Var, u83Var3.l, u83Var3.m, u83Var3.n, u83Var3.o, j2, 0L, j2, 0L);
        if (z3) {
            j83Var.r();
            c00 c00Var = this.x;
            HashMap map = (HashMap) c00Var.l;
            for (r83 r83Var : map.values()) {
                try {
                    r83Var.a.q(r83Var.b);
                } catch (RuntimeException e3) {
                    s90.b0("MediaSourceList", "Failed to release child source.", e3);
                }
                dd3 dd3Var = r83Var.a;
                n83 n83Var = r83Var.c;
                dd3Var.l(n83Var);
                dd3Var.m(n83Var);
            }
            map.clear();
            ((HashSet) c00Var.m).clear();
            c00Var.f = false;
        }
    }

    public final Pair w(ox0 ox0Var) {
        int i;
        long j = 0;
        if (ox0Var.g()) {
            return Pair.create(u83.t, 0L);
        }
        int iK = ox0Var.k(this.T);
        ex0 ex0Var = this.p;
        su0 su0Var = this.q;
        Pair pairM = ox0Var.m(ex0Var, su0Var, iK, -9223372036854775807L);
        yd3 yd3VarE = this.w.E(ox0Var, pairM.first);
        long jLongValue = ((Long) pairM.second).longValue();
        if (yd3VarE.b()) {
            ox0Var.o(yd3VarE.a, su0Var);
            fb0 fb0VarA = su0Var.f.a(-1);
            int i2 = 0;
            while (true) {
                int[] iArr = fb0VarA.d;
                if (i2 >= iArr.length || (i = iArr[i2]) == 0 || i == 1) {
                    break;
                }
                i2++;
            }
            if (-1 == i2) {
                su0Var.f.getClass();
            }
        } else {
            j = jLongValue;
        }
        return Pair.create(yd3VarE, Long.valueOf(j));
    }

    public final void x(ox0 ox0Var, ox0 ox0Var2) {
        if (ox0Var.g() && ox0Var2.g()) {
            return;
        }
        ArrayList arrayList = this.t;
        int size = arrayList.size() - 1;
        if (size < 0) {
            Collections.sort(arrayList);
        } else {
            arrayList.get(size).getClass();
            j7.j();
        }
    }

    public final void y(boolean z, boolean z2) {
        this.P = z;
        long jElapsedRealtime = -9223372036854775807L;
        if (z && !z2) {
            jElapsedRealtime = SystemClock.elapsedRealtime();
        }
        this.Q = jElapsedRealtime;
    }
}
