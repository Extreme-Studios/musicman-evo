package defpackage;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.media.metrics.LogSessionId;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.os.Trace;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public abstract class yc3 implements v83 {
    public static final byte[] D0 = {0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120};
    public final lt2 A;
    public boolean A0;
    public final lt2 B;
    public boolean B0;
    public final lt2 C;
    public long C0;
    public final lc3 D;
    public final MediaCodec.BufferInfo E;
    public final ArrayDeque F;
    public final tg0 G;
    public de3 H;
    public de3 I;
    public s62 J;
    public s62 K;
    public q73 L;
    public final long M;
    public float N;
    public float O;
    public nc3 P;
    public de3 Q;
    public MediaFormat R;
    public boolean S;
    public float T;
    public ArrayDeque U;
    public wc3 V;
    public pc3 W;
    public int X;
    public boolean Y;
    public boolean Z;
    public boolean a0;
    public boolean b0;
    public long c0;
    public long d0;
    public int e0;
    public int f0;
    public final int g;
    public ByteBuffer g0;
    public boolean h0;
    public z83 i;
    public boolean i0;
    public int j;
    public boolean j0;
    public la3 k;
    public boolean k0;
    public ig l;
    public boolean l0;
    public int m;
    public int m0;
    public af3 n;
    public int n0;
    public de3[] o;
    public int o0;
    public long p;
    public boolean p0;
    public long q;
    public boolean q0;
    public boolean r0;
    public boolean s;
    public long s0;
    public boolean t;
    public boolean t0;
    public boolean u0;
    public yd3 v;
    public boolean v0;
    public zf3 w;
    public b03 w0;
    public final sw1 x;
    public xc3 x0;
    public final r53 y;
    public long y0;
    public final float z;
    public boolean z0;
    public final Object f = new Object();
    public final us2 h = new us2(28, false);
    public long r = Long.MIN_VALUE;
    public ox0 u = ox0.a;

    public yc3(int i, sw1 sw1Var, r53 r53Var, float f) {
        this.g = i;
        this.x = sw1Var;
        r53Var.getClass();
        this.y = r53Var;
        this.z = f;
        this.A = new lt2(0);
        this.B = new lt2(0);
        this.C = new lt2(2);
        lc3 lc3Var = new lc3(2);
        lc3Var.k = 32;
        this.D = lc3Var;
        this.E = new MediaCodec.BufferInfo();
        this.N = 1.0f;
        this.O = 1.0f;
        this.M = -9223372036854775807L;
        this.F = new ArrayDeque();
        this.x0 = xc3.f;
        lc3Var.d(0);
        lc3Var.d.order(ByteOrder.nativeOrder());
        tg0 tg0Var = new tg0();
        tg0Var.h = cd1.a;
        tg0Var.g = 0;
        tg0Var.f = 2;
        this.G = tg0Var;
        this.T = -1.0f;
        this.X = 0;
        this.m0 = 0;
        this.e0 = -1;
        this.f0 = -1;
        this.d0 = -9223372036854775807L;
        this.s0 = -9223372036854775807L;
        this.y0 = -9223372036854775807L;
        this.c0 = -9223372036854775807L;
        this.n0 = 0;
        this.o0 = 0;
        this.w0 = new b03();
        this.B0 = false;
        this.C0 = 0L;
    }

    public static boolean I(int i, boolean z) {
        int i2 = i & 7;
        if (i2 != 4) {
            return z && i2 == 3;
        }
        return true;
    }

    public void A() {
        this.e0 = -1;
        this.B.d = null;
        this.f0 = -1;
        this.g0 = null;
        this.s0 = -9223372036854775807L;
        this.x0.e = -9223372036854775807L;
        this.y0 = -9223372036854775807L;
        this.d0 = -9223372036854775807L;
        this.q0 = false;
        this.c0 = -9223372036854775807L;
        this.p0 = false;
        this.Z = false;
        this.a0 = false;
        this.h0 = false;
        this.n0 = 0;
        this.o0 = 0;
        this.m0 = this.l0 ? 1 : 0;
        this.B0 = false;
        this.C0 = 0L;
    }

    public final void B() {
        A();
        this.U = null;
        this.W = null;
        this.Q = null;
        this.R = null;
        this.S = false;
        this.r0 = false;
        this.T = -1.0f;
        this.X = 0;
        this.Y = false;
        this.b0 = false;
        this.l0 = false;
        this.m0 = 0;
    }

    public oc3 C(IllegalStateException illegalStateException, pc3 pc3Var) {
        return new oc3(illegalStateException, pc3Var);
    }

    public int F(lt2 lt2Var) {
        return 0;
    }

    public boolean G(lt2 lt2Var) {
        return false;
    }

    public void H(long j) {
        this.y0 = j;
        while (true) {
            ArrayDeque arrayDeque = this.F;
            if (arrayDeque.isEmpty() || j < ((xc3) arrayDeque.peek()).a) {
                return;
            }
            xc3 xc3Var = (xc3) arrayDeque.poll();
            xc3Var.getClass();
            i0(xc3Var);
            X();
        }
    }

    public final int J(de3 de3Var) throws q43 {
        try {
            return K(this.y, de3Var);
        } catch (ad3 e) {
            throw m(e, de3Var, false, 4002);
        }
    }

    public abstract int K(r53 r53Var, de3 de3Var);

    public final void L(long j, boolean z, boolean z2) {
        this.s = false;
        this.q = j;
        this.r = j;
        if (!z2) {
            af3 af3Var = this.n;
            af3Var.getClass();
            z2 = af3Var.f(j - this.p) != 0;
        }
        c(j, z, z2);
    }

    public abstract ArrayList M(r53 r53Var, de3 de3Var);

    public boolean N(de3 de3Var) {
        return false;
    }

    public abstract kd0 O(pc3 pc3Var, de3 de3Var, float f);

    public abstract k03 P(pc3 pc3Var, de3 de3Var, de3 de3Var2);

    public long Q(long j, long j2) {
        if (this.m == 1) {
            return (t() || u()) ? 1000000L : 10000L;
        }
        return 10000L;
    }

    public abstract float R(float f, de3 de3Var, de3[] de3VarArr);

    public abstract void S(long j, long j2, String str);

    public abstract void T(String str);

    public abstract void U(Exception exc);

    /* JADX WARN: Code duplicated, block: B:29:0x0073  */
    public k03 V(us2 us2Var) {
        int i;
        boolean z = true;
        this.v0 = true;
        de3 de3Var = (de3) us2Var.h;
        de3Var.getClass();
        String str = de3Var.m;
        if (str == null) {
            throw m(new IllegalArgumentException("Sample MIME type is null."), de3Var, false, 4005);
        }
        if ((str.equals("video/av01") || str.equals("video/x-vnd.on2.vp9")) && !de3Var.p.isEmpty()) {
            uc3 uc3Var = new uc3(de3Var);
            uc3Var.o = null;
            de3Var = new de3(uc3Var);
        }
        de3 de3Var2 = de3Var;
        this.K = (s62) us2Var.g;
        this.H = de3Var2;
        if (this.i0) {
            this.k0 = true;
            return null;
        }
        nc3 nc3Var = this.P;
        if (nc3Var == null) {
            this.U = null;
            v();
            return null;
        }
        pc3 pc3Var = this.W;
        pc3Var.getClass();
        de3 de3Var3 = this.Q;
        de3Var3.getClass();
        s62 s62Var = this.J;
        s62 s62Var2 = this.K;
        if (s62Var != s62Var2) {
            g0();
            return new k03(pc3Var.a, de3Var3, de3Var2, 0, 128);
        }
        k03 k03VarP = P(pc3Var, de3Var3, de3Var2);
        int i2 = k03VarP.d;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (e0(de3Var2)) {
                        this.Q = de3Var2;
                        if (s62Var2 != s62Var) {
                            f0();
                        }
                    } else {
                        i = 16;
                    }
                } else if (e0(de3Var2)) {
                    this.l0 = true;
                    this.m0 = 1;
                    int i3 = this.X;
                    if (i3 != 2 && (i3 != 1 || de3Var2.t != de3Var3.t || de3Var2.u != de3Var3.u)) {
                        z = false;
                    }
                    this.Z = z;
                    this.Q = de3Var2;
                    if (s62Var2 != s62Var) {
                        f0();
                    }
                } else {
                    i = 16;
                }
            } else if (e0(de3Var2)) {
                this.Q = de3Var2;
                if (s62Var2 != s62Var) {
                    f0();
                } else if (this.p0) {
                    this.n0 = 1;
                    this.o0 = 1;
                }
            } else {
                i = 16;
            }
            return (i2 != 0 || (this.P == nc3Var && this.o0 != 3)) ? k03VarP : new k03(pc3Var.a, de3Var3, de3Var2, 0, i);
        }
        g0();
        i = 0;
        if (i2 != 0) {
        }
    }

    public abstract void W(de3 de3Var, MediaFormat mediaFormat);

    public abstract void X();

    public abstract boolean Y(long j, long j2, nc3 nc3Var, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, de3 de3Var);

    public abstract void Z();

    public abstract void a0(lt2 lt2Var);

    public final void b0() {
        this.s0 = -9223372036854775807L;
        this.x0.e = -9223372036854775807L;
        this.y0 = -9223372036854775807L;
        this.k0 = false;
        this.D.a();
        this.C.a();
        this.j0 = false;
        tg0 tg0Var = this.G;
        tg0Var.getClass();
        tg0Var.h = cd1.a;
        tg0Var.g = 0;
        tg0Var.f = 2;
    }

    public void c(long j, boolean z, boolean z2) {
        if (z2) {
            this.t0 = false;
            this.u0 = false;
            if (this.i0) {
                b0();
            } else if (this.P != null) {
                if (y()) {
                    x();
                    v();
                } else if (z()) {
                    c0();
                } else {
                    this.B0 = true;
                }
            }
            d6 d6Var = this.x0.d;
            if (d6Var.e() > 0) {
                this.v0 = true;
            }
            synchronized (d6Var) {
                d6Var.a = 0;
                d6Var.b = 0;
                Arrays.fill((Object[]) d6Var.d, (Object) null);
            }
            this.F.clear();
        }
    }

    public final void c0() {
        try {
            nc3 nc3Var = this.P;
            if (nc3Var == null) {
                throw null;
            }
            nc3Var.g();
            A();
        } catch (Throwable th) {
            A();
            throw th;
        }
    }

    public abstract void d();

    public final boolean d0(int i) throws Throwable {
        us2 us2Var = this.h;
        us2Var.g = null;
        us2Var.h = null;
        lt2 lt2Var = this.A;
        lt2Var.a();
        int iN = n(us2Var, lt2Var, i | 4);
        if (iN == -5) {
            V(us2Var);
            return true;
        }
        if (iN != -4 || !lt2Var.c(4)) {
            return false;
        }
        this.t0 = true;
        h0();
        return false;
    }

    public final boolean e0(de3 de3Var) throws Throwable {
        if (this.P != null && this.o0 != 3 && this.m != 0) {
            float f = this.O;
            de3Var.getClass();
            de3[] de3VarArr = this.o;
            de3VarArr.getClass();
            float fR = R(f, de3Var, de3VarArr);
            float f2 = this.T;
            if (f2 != fR) {
                if (fR == -1.0f) {
                    g0();
                    return false;
                }
                if (f2 != -1.0f || fR > this.z) {
                    Bundle bundle = new Bundle();
                    bundle.putFloat("operating-rate", fR);
                    nc3 nc3Var = this.P;
                    nc3Var.getClass();
                    nc3Var.c0(bundle);
                    this.T = fR;
                }
            }
        }
        return true;
    }

    public final boolean f0() {
        if (this.p0) {
            this.n0 = 1;
            this.o0 = 2;
            return true;
        }
        s62 s62Var = this.K;
        s62Var.getClass();
        this.J = s62Var;
        this.n0 = 0;
        this.o0 = 0;
        return true;
    }

    public final void g0() throws Throwable {
        if (this.p0) {
            this.n0 = 1;
            this.o0 = 3;
        } else {
            x();
            v();
        }
    }

    public abstract void h();

    public final void h0() throws Throwable {
        int i = this.o0;
        if (i == 1) {
            c0();
            return;
        }
        if (i != 2) {
            if (i != 3) {
                this.u0 = true;
                Z();
                return;
            } else {
                x();
                v();
                return;
            }
        }
        c0();
        s62 s62Var = this.K;
        s62Var.getClass();
        this.J = s62Var;
        this.n0 = 0;
        this.o0 = 0;
    }

    public void i() {
        this.H = null;
        i0(xc3.f);
        this.F.clear();
        if (this.i0) {
            this.i0 = false;
            b0();
        } else {
            if (this.P == null) {
                return;
            }
            if (y()) {
                x();
            } else if (z()) {
                c0();
            } else {
                this.B0 = true;
            }
        }
    }

    public final void i0(xc3 xc3Var) {
        this.x0 = xc3Var;
        if (xc3Var.c != -9223372036854775807L) {
            this.z0 = true;
        }
    }

    public abstract void j();

    public final xc3 j0() {
        ArrayDeque arrayDeque = this.F;
        return !arrayDeque.isEmpty() ? (xc3) arrayDeque.getLast() : this.x0;
    }

    public abstract void k();

    public final boolean k0(long j, long j2) {
        if (j2 >= j) {
            return false;
        }
        de3 de3Var = this.I;
        return de3Var == null || !Objects.equals(de3Var.m, "audio/opus") || j - j2 > 80000;
    }

    public final void l() {
        this.i.getClass();
    }

    public final void l0(de3[] de3VarArr, af3 af3Var, long j, long j2, yd3 yd3Var) {
        hn.M(!this.s);
        this.n = af3Var;
        this.v = yd3Var;
        if (this.r == Long.MIN_VALUE) {
            this.r = j;
        }
        this.o = de3VarArr;
        this.p = j2;
        q0(de3VarArr, j, j2, yd3Var);
    }

    public final q43 m(Exception exc, de3 de3Var, boolean z, int i) {
        int iJ;
        if (de3Var == null || this.t) {
            iJ = 4;
        } else {
            this.t = true;
            try {
                iJ = J(de3Var) & 7;
                this.t = false;
            } catch (q43 unused) {
                this.t = false;
                iJ = 4;
            } catch (Throwable th) {
                this.t = false;
                throw th;
            }
        }
        return new q43(1, exc, i, o(), this.j, de3Var, de3Var == null ? 4 : iJ, this.v, z);
    }

    public g83 m0() {
        return null;
    }

    public final int n(us2 us2Var, lt2 lt2Var, int i) {
        af3 af3Var = this.n;
        af3Var.getClass();
        int iA = af3Var.a(us2Var, lt2Var, i);
        if (iA == -4) {
            if (lt2Var.c(4)) {
                this.r = Long.MIN_VALUE;
                return this.s ? -4 : -3;
            }
            long j = lt2Var.f + this.p;
            lt2Var.f = j;
            this.r = Math.max(this.r, j);
            return iA;
        }
        if (iA == -5) {
            de3 de3Var = (de3) us2Var.h;
            de3Var.getClass();
            long j2 = de3Var.r;
            if (j2 != Long.MAX_VALUE) {
                uc3 uc3Var = new uc3(de3Var);
                uc3Var.q = j2 + this.p;
                us2Var.h = new de3(uc3Var);
                return -5;
            }
        }
        return iA;
    }

    public final boolean n0() {
        return this.r == Long.MIN_VALUE;
    }

    public abstract String o();

    public final void o0() {
        synchronized (this.f) {
            this.w = null;
        }
    }

    public boolean p(long j) {
        return false;
    }

    public abstract void p0(boolean z, boolean z2);

    public void q(float f, float f2) throws Throwable {
        this.N = f;
        this.O = f2;
        e0(this.Q);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003a, code lost:
    
        if (r4 >= r0) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void q0(defpackage.de3[] r12, long r13, long r15, defpackage.yd3 r17) {
        /*
            r11 = this;
            xc3 r12 = r11.x0
            long r0 = r12.c
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r12 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r12 != 0) goto L24
            xc3 r4 = new xc3
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7 = r13
            r9 = r15
            r4.<init>(r5, r7, r9)
            r11.i0(r4)
            boolean r12 = r11.A0
            if (r12 == 0) goto L56
            r11.X()
            return
        L24:
            java.util.ArrayDeque r12 = r11.F
            boolean r0 = r12.isEmpty()
            if (r0 == 0) goto L57
            long r0 = r11.s0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L3c
            long r4 = r11.y0
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 == 0) goto L57
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 < 0) goto L57
        L3c:
            xc3 r4 = new xc3
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7 = r13
            r9 = r15
            r4.<init>(r5, r7, r9)
            r11.i0(r4)
            xc3 r12 = r11.x0
            long r12 = r12.c
            int r12 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r12 == 0) goto L56
            r11.X()
        L56:
            return
        L57:
            xc3 r0 = new xc3
            long r1 = r11.s0
            r3 = r13
            r5 = r15
            r0.<init>(r1, r3, r5)
            r12.add(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yc3.q0(de3[], long, long, yd3):void");
    }

    /* JADX WARN: Code duplicated, block: B:108:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:111:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:112:0x01e3 A[Catch: IllegalStateException -> 0x00a6, CryptoException -> 0x00ab, TryCatch #4 {CryptoException -> 0x00ab, blocks: (B:130:0x022a, B:46:0x00a3, B:56:0x00b6, B:58:0x00ba, B:60:0x00c0, B:64:0x00d8, B:65:0x00e7, B:69:0x00f4, B:71:0x00fa, B:120:0x020c, B:122:0x0212, B:123:0x0215, B:125:0x021b, B:127:0x021f, B:73:0x010c, B:75:0x0113, B:76:0x0127, B:78:0x0137, B:82:0x0146, B:83:0x014e, B:86:0x0154, B:88:0x0158, B:90:0x0162, B:92:0x016c, B:93:0x0194, B:94:0x019c, B:95:0x019d, B:97:0x01a4, B:99:0x01ac, B:101:0x01b4, B:102:0x01bb, B:107:0x01ce, B:109:0x01dc, B:114:0x01f3, B:118:0x01fe, B:112:0x01e3, B:119:0x0201, B:133:0x0235, B:135:0x0242, B:136:0x0250, B:138:0x0254, B:144:0x0267, B:148:0x0270, B:150:0x0276, B:152:0x027e, B:154:0x0288, B:156:0x0290, B:158:0x029e, B:159:0x02a3, B:160:0x02a4, B:162:0x02a8, B:164:0x02ac, B:166:0x02b0, B:167:0x02b3, B:169:0x02b9, B:171:0x02ca, B:174:0x02da, B:176:0x02e7, B:179:0x02fc, B:181:0x0300, B:183:0x0306, B:184:0x0314, B:186:0x031e, B:187:0x032d, B:189:0x033b, B:191:0x033f, B:193:0x0343, B:195:0x034f, B:200:0x035a, B:202:0x035e, B:205:0x036c, B:207:0x0370, B:211:0x037b, B:213:0x0383, B:217:0x038c, B:203:0x0368, B:196:0x0352, B:198:0x0356), top: B:411:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:117:0x01fa A[LOOP:4: B:65:0x00e7->B:117:0x01fa, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:237:0x03e9 A[Catch: CryptoException -> 0x0010, IllegalStateException -> 0x007e, TryCatch #2 {CryptoException -> 0x0010, blocks: (B:3:0x0003, B:5:0x0007, B:12:0x0014, B:14:0x0019, B:16:0x001f, B:23:0x0041, B:25:0x0060, B:27:0x0074, B:38:0x0091, B:33:0x0086, B:237:0x03e9, B:246:0x0412, B:248:0x0416, B:250:0x041b, B:254:0x0423, B:256:0x0427, B:258:0x042f, B:260:0x043d, B:263:0x0442, B:265:0x0446, B:268:0x0459, B:269:0x045c, B:220:0x03b0, B:222:0x03b6, B:227:0x03c6, B:229:0x03ca, B:231:0x03ce, B:232:0x03d9, B:234:0x03e1), top: B:408:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:239:0x03f8  */
    /* JADX WARN: Code duplicated, block: B:240:0x03f9  */
    /* JADX WARN: Code duplicated, block: B:241:0x03fb  */
    /* JADX WARN: Code duplicated, block: B:244:0x03ff A[LOOP:0: B:136:0x0250->B:244:0x03ff, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:385:0x063d  */
    /* JADX WARN: Code duplicated, block: B:394:0x0662  */
    /* JADX WARN: Code duplicated, block: B:396:0x0665  */
    /* JADX WARN: Code duplicated, block: B:399:0x0674  */
    /* JADX WARN: Code duplicated, block: B:400:0x0677  */
    /* JADX WARN: Code duplicated, block: B:425:0x03fe A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:450:0x019c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:457:0x01fe A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:458:0x01f9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:86:0x0154 A[Catch: IllegalStateException -> 0x00a6, CryptoException -> 0x00ab, TRY_ENTER, TryCatch #4 {CryptoException -> 0x00ab, blocks: (B:130:0x022a, B:46:0x00a3, B:56:0x00b6, B:58:0x00ba, B:60:0x00c0, B:64:0x00d8, B:65:0x00e7, B:69:0x00f4, B:71:0x00fa, B:120:0x020c, B:122:0x0212, B:123:0x0215, B:125:0x021b, B:127:0x021f, B:73:0x010c, B:75:0x0113, B:76:0x0127, B:78:0x0137, B:82:0x0146, B:83:0x014e, B:86:0x0154, B:88:0x0158, B:90:0x0162, B:92:0x016c, B:93:0x0194, B:94:0x019c, B:95:0x019d, B:97:0x01a4, B:99:0x01ac, B:101:0x01b4, B:102:0x01bb, B:107:0x01ce, B:109:0x01dc, B:114:0x01f3, B:118:0x01fe, B:112:0x01e3, B:119:0x0201, B:133:0x0235, B:135:0x0242, B:136:0x0250, B:138:0x0254, B:144:0x0267, B:148:0x0270, B:150:0x0276, B:152:0x027e, B:154:0x0288, B:156:0x0290, B:158:0x029e, B:159:0x02a3, B:160:0x02a4, B:162:0x02a8, B:164:0x02ac, B:166:0x02b0, B:167:0x02b3, B:169:0x02b9, B:171:0x02ca, B:174:0x02da, B:176:0x02e7, B:179:0x02fc, B:181:0x0300, B:183:0x0306, B:184:0x0314, B:186:0x031e, B:187:0x032d, B:189:0x033b, B:191:0x033f, B:193:0x0343, B:195:0x034f, B:200:0x035a, B:202:0x035e, B:205:0x036c, B:207:0x0370, B:211:0x037b, B:213:0x0383, B:217:0x038c, B:203:0x0368, B:196:0x0352, B:198:0x0356), top: B:411:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:88:0x0158 A[Catch: IllegalStateException -> 0x00a6, CryptoException -> 0x00ab, TryCatch #4 {CryptoException -> 0x00ab, blocks: (B:130:0x022a, B:46:0x00a3, B:56:0x00b6, B:58:0x00ba, B:60:0x00c0, B:64:0x00d8, B:65:0x00e7, B:69:0x00f4, B:71:0x00fa, B:120:0x020c, B:122:0x0212, B:123:0x0215, B:125:0x021b, B:127:0x021f, B:73:0x010c, B:75:0x0113, B:76:0x0127, B:78:0x0137, B:82:0x0146, B:83:0x014e, B:86:0x0154, B:88:0x0158, B:90:0x0162, B:92:0x016c, B:93:0x0194, B:94:0x019c, B:95:0x019d, B:97:0x01a4, B:99:0x01ac, B:101:0x01b4, B:102:0x01bb, B:107:0x01ce, B:109:0x01dc, B:114:0x01f3, B:118:0x01fe, B:112:0x01e3, B:119:0x0201, B:133:0x0235, B:135:0x0242, B:136:0x0250, B:138:0x0254, B:144:0x0267, B:148:0x0270, B:150:0x0276, B:152:0x027e, B:154:0x0288, B:156:0x0290, B:158:0x029e, B:159:0x02a3, B:160:0x02a4, B:162:0x02a8, B:164:0x02ac, B:166:0x02b0, B:167:0x02b3, B:169:0x02b9, B:171:0x02ca, B:174:0x02da, B:176:0x02e7, B:179:0x02fc, B:181:0x0300, B:183:0x0306, B:184:0x0314, B:186:0x031e, B:187:0x032d, B:189:0x033b, B:191:0x033f, B:193:0x0343, B:195:0x034f, B:200:0x035a, B:202:0x035e, B:205:0x036c, B:207:0x0370, B:211:0x037b, B:213:0x0383, B:217:0x038c, B:203:0x0368, B:196:0x0352, B:198:0x0356), top: B:411:0x002b }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v23 */
    /* JADX WARN: Type inference failed for: r10v33 */
    /* JADX WARN: Type inference failed for: r10v34 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v20 */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r15v0, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r15v11 */
    /* JADX WARN: Type inference failed for: r15v14 */
    /* JADX WARN: Type inference failed for: r15v19 */
    /* JADX WARN: Type inference failed for: r15v20 */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r15v6, types: [java.lang.Object, java.lang.Throwable, java.nio.ByteBuffer] */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9, types: [android.media.MediaFormat, java.lang.Object, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r31v0, types: [yc3] */
    public void s(long j, long j2) throws Throwable {
        boolean z;
        boolean z2;
        ?? r12;
        ?? r10;
        boolean z3;
        ?? r2;
        oc3 oc3VarC;
        int i;
        StackTraceElement[] stackTrace;
        us2 us2Var;
        lt2 lt2Var;
        boolean z4;
        lt2 lt2Var2;
        int i2;
        lt2 lt2Var3;
        lt2 lt2Var4;
        de3 de3Var;
        long j3;
        de3 de3Var2;
        Throwable th;
        lt2 lt2Var5;
        us2 us2Var2;
        long j4;
        int i3;
        int i4;
        lt2 lt2Var6;
        lt2 lt2Var7;
        ?? r15;
        Throwable th2;
        lt2 lt2Var8;
        boolean z5;
        us2 us2Var3;
        boolean z6;
        boolean z7;
        lt2 lt2Var9;
        Throwable th3;
        boolean z8 = true;
        try {
            try {
                if (this.u0) {
                    Z();
                    return;
                }
                int i5 = 2;
                if (this.H == null && !d0(2)) {
                    return;
                }
                v();
                boolean z9 = this.i0;
                us2 us2Var4 = this.h;
                int i6 = 4;
                byte b = -5;
                lt2 lt2Var10 = this.B;
                ?? r11 = 0;
                try {
                    try {
                        try {
                            try {
                                if (z9) {
                                    try {
                                        try {
                                            Trace.beginSection("bypassRender");
                                            while (true) {
                                                hn.M(this.u0 ^ z8);
                                                lc3 lc3Var = this.D;
                                                try {
                                                    if (lc3Var.i()) {
                                                        us2 us2Var5 = us2Var4;
                                                        ByteBuffer byteBuffer = lc3Var.d;
                                                        int i7 = this.f0;
                                                        lt2 lt2Var11 = lt2Var10;
                                                        int iH = lc3Var.h();
                                                        ?? r16 = r11;
                                                        long j5 = lc3Var.f;
                                                        boolean zK0 = k0(this.q, lc3Var.i);
                                                        boolean zC = lc3Var.c(i6);
                                                        de3 de3Var3 = this.I;
                                                        if (de3Var3 == null) {
                                                            throw r16;
                                                        }
                                                        us2Var = us2Var5;
                                                        lt2Var = lt2Var11;
                                                        if (Y(j, j2, null, byteBuffer, i7, 0, iH, j5, zK0, zC, de3Var3)) {
                                                            H(lc3Var.i);
                                                            lc3Var.a();
                                                            r11 = 0;
                                                        } else {
                                                            z8 = true;
                                                        }
                                                        z4 = false;
                                                        break;
                                                    }
                                                    us2Var = us2Var4;
                                                    lt2Var = lt2Var10;
                                                    r11 = r11;
                                                    if (!this.t0) {
                                                        z8 = true;
                                                        boolean z10 = this.j0;
                                                        lt2 lt2Var12 = this.C;
                                                        if (z10) {
                                                            hn.M(lc3Var.j(lt2Var12));
                                                            z4 = false;
                                                            this.j0 = false;
                                                        } else {
                                                            z4 = false;
                                                        }
                                                        if (this.k0) {
                                                            if (!lc3Var.i()) {
                                                                this.i0 = z4;
                                                                b0();
                                                                this.k0 = z4;
                                                                v();
                                                                if (!this.i0) {
                                                                    break;
                                                                }
                                                            } else {
                                                                us2Var4 = us2Var;
                                                                lt2Var10 = lt2Var;
                                                                i6 = 4;
                                                                b = -5;
                                                            }
                                                        }
                                                        hn.M(!this.t0);
                                                        us2Var4 = us2Var;
                                                        us2Var4.g = r11;
                                                        us2Var4.h = r11;
                                                        lt2Var12.a();
                                                        lt2 lt2Var13 = lt2Var;
                                                        while (true) {
                                                            lt2Var12.a();
                                                            int iN = n(us2Var4, lt2Var12, z4 ? 1 : 0);
                                                            if (iN == -5) {
                                                                lt2Var2 = lt2Var13;
                                                                i2 = 4;
                                                                V(us2Var4);
                                                                break;
                                                            }
                                                            if (iN != -4) {
                                                                if (n0()) {
                                                                    j0().e = this.s0;
                                                                }
                                                                lt2Var2 = lt2Var13;
                                                                i2 = 4;
                                                                break;
                                                            }
                                                            if (lt2Var12.c(4)) {
                                                                this.t0 = true;
                                                                j0().e = this.s0;
                                                                i2 = 4;
                                                                lt2Var2 = lt2Var13;
                                                                break;
                                                            }
                                                            this.s0 = Math.max(this.s0, lt2Var12.f);
                                                            if (n0()) {
                                                                lt2Var3 = lt2Var13;
                                                            } else {
                                                                lt2 lt2Var14 = lt2Var13;
                                                                if (lt2Var14.c(536870912)) {
                                                                    lt2Var4 = lt2Var14;
                                                                    lt2Var3 = lt2Var14;
                                                                }
                                                                lt2Var4 = lt2Var14;
                                                                if (this.v0) {
                                                                    de3Var2 = this.H;
                                                                    if (de3Var2 != null) {
                                                                        throw r11;
                                                                    }
                                                                    this.I = de3Var2;
                                                                    if (Objects.equals(de3Var2.m, "audio/opus") && !this.I.p.isEmpty()) {
                                                                        byte[] bArr = (byte[]) this.I.p.get(z4 ? 1 : 0);
                                                                        int i8 = (bArr[10] & 255) | ((bArr[11] & 255) << 8);
                                                                        uc3 uc3VarA = this.I.a();
                                                                        uc3VarA.a(i8);
                                                                        this.I = uc3VarA.b();
                                                                    }
                                                                    W(this.I, r11);
                                                                    this.v0 = z4;
                                                                }
                                                                lt2Var12.f();
                                                                de3Var = this.I;
                                                                if (de3Var == null && Objects.equals(de3Var.m, "audio/opus")) {
                                                                    if (lt2Var12.c(268435456)) {
                                                                        lt2Var12.b = this.I;
                                                                        a0(lt2Var12);
                                                                    }
                                                                    i2 = 4;
                                                                    if (this.q - lt2Var12.f <= 80000 ? true : z4 ? 1 : 0) {
                                                                        this.G.d(lt2Var12, this.I.p);
                                                                    }
                                                                } else {
                                                                    i2 = 4;
                                                                }
                                                                if (!lc3Var.i()) {
                                                                    j3 = this.q;
                                                                    if (k0(j3, lc3Var.i) == k0(j3, lt2Var12.f)) {
                                                                    }
                                                                    this.j0 = true;
                                                                    lt2Var2 = lt2Var4;
                                                                    break;
                                                                }
                                                                if (!lc3Var.j(lt2Var12)) {
                                                                    this.j0 = true;
                                                                    lt2Var2 = lt2Var4;
                                                                    break;
                                                                }
                                                                lt2Var13 = lt2Var4;
                                                            }
                                                            j0().e = this.s0;
                                                            lt2Var4 = lt2Var3;
                                                            lt2Var4 = lt2Var14;
                                                            if (this.v0) {
                                                                de3Var2 = this.H;
                                                                if (de3Var2 != null) {
                                                                    throw r11;
                                                                }
                                                                this.I = de3Var2;
                                                                if (Objects.equals(de3Var2.m, "audio/opus")) {
                                                                    byte[] bArr2 = (byte[]) this.I.p.get(z4 ? 1 : 0);
                                                                    int i9 = (bArr2[10] & 255) | ((bArr2[11] & 255) << 8);
                                                                    uc3 uc3VarA2 = this.I.a();
                                                                    uc3VarA2.a(i9);
                                                                    this.I = uc3VarA2.b();
                                                                }
                                                                W(this.I, r11);
                                                                this.v0 = z4;
                                                            }
                                                            lt2Var12.f();
                                                            de3Var = this.I;
                                                            if (de3Var == null) {
                                                                i2 = 4;
                                                            } else {
                                                                i2 = 4;
                                                            }
                                                            if (!lc3Var.i()) {
                                                                j3 = this.q;
                                                                if (k0(j3, lc3Var.i) == k0(j3, lt2Var12.f)) {
                                                                }
                                                                this.j0 = true;
                                                                lt2Var2 = lt2Var4;
                                                                break;
                                                            }
                                                            if (!lc3Var.j(lt2Var12)) {
                                                                this.j0 = true;
                                                                lt2Var2 = lt2Var4;
                                                                break;
                                                            }
                                                            lt2Var13 = lt2Var4;
                                                        }
                                                        if (lc3Var.i()) {
                                                            lc3Var.f();
                                                        }
                                                        if (!lc3Var.i() && !this.t0 && !this.k0) {
                                                            break;
                                                        }
                                                        lt2Var10 = lt2Var2;
                                                        i6 = i2;
                                                        b = -5;
                                                    } else {
                                                        z8 = true;
                                                        this.u0 = true;
                                                        z4 = false;
                                                        break;
                                                    }
                                                } catch (IllegalStateException e) {
                                                    e = e;
                                                    z8 = true;
                                                    r10 = z8;
                                                    r12 = 0;
                                                    z3 = e instanceof MediaCodec.CodecException;
                                                    if (!z3) {
                                                        stackTrace = e.getStackTrace();
                                                        if (stackTrace.length > 0) {
                                                        }
                                                        throw e;
                                                    }
                                                    U(e);
                                                    if (z3) {
                                                        r2 = r12;
                                                    } else {
                                                        r2 = r12;
                                                    }
                                                    if (r2 != 0) {
                                                        x();
                                                    }
                                                    oc3VarC = C(e, this.W);
                                                    if (oc3VarC.f == 1101) {
                                                        i = 4006;
                                                    } else {
                                                        i = 4003;
                                                    }
                                                    throw m(oc3VarC, this.H, r2, i);
                                                }
                                            }
                                            Trace.endSection();
                                        } catch (MediaCodec.CryptoException e2) {
                                            e = e2;
                                            z2 = false;
                                            throw m(e, this.H, z2, qz1.e(e.getErrorCode()));
                                        }
                                    } catch (IllegalStateException e3) {
                                        e = e3;
                                    }
                                } else {
                                    int i10 = 4;
                                    Throwable th4 = null;
                                    boolean z11 = false;
                                    char c = 0;
                                    lt2 lt2Var15 = lt2Var10;
                                    if (this.P != null) {
                                        ig igVar = this.l;
                                        igVar.getClass();
                                        long jE = igVar.e();
                                        Trace.beginSection("drainAndFeed");
                                        while (true) {
                                            nc3 nc3Var = this.P;
                                            if (nc3Var == null) {
                                                throw th4;
                                            }
                                            boolean z12 = this.f0 >= 0 ? z8 : z11;
                                            long j6 = this.M;
                                            MediaCodec.BufferInfo bufferInfo = this.E;
                                            if (z12) {
                                                th3 = th4;
                                                lt2Var9 = lt2Var15;
                                            } else {
                                                try {
                                                    int iJ = nc3Var.j(bufferInfo);
                                                    if (iJ >= 0) {
                                                        th = th4;
                                                        lt2Var5 = lt2Var15;
                                                        bufferInfo.presentationTimeUs -= this.C0;
                                                        if (!this.a0) {
                                                            if (bufferInfo.size == 0 && (bufferInfo.flags & 4) != 0) {
                                                                h0();
                                                                us2Var2 = us2Var4;
                                                                j4 = j6;
                                                                i3 = -1;
                                                                i4 = i10;
                                                                lt2Var6 = lt2Var5;
                                                                r15 = th;
                                                                break;
                                                            }
                                                            this.f0 = iJ;
                                                            ByteBuffer byteBufferA = nc3Var.A(iJ);
                                                            this.g0 = byteBufferA;
                                                            if (byteBufferA != null) {
                                                                byteBufferA.position(bufferInfo.offset);
                                                                this.g0.limit(bufferInfo.offset + bufferInfo.size);
                                                            }
                                                            de3 de3Var4 = (de3) this.x0.d.g(bufferInfo.presentationTimeUs);
                                                            if (de3Var4 == null && this.z0 && this.R != null) {
                                                                de3Var4 = (de3) this.x0.d.f();
                                                            }
                                                            if (de3Var4 != null) {
                                                                this.I = de3Var4;
                                                            } else if (this.S && this.I != null) {
                                                            }
                                                            th3 = th;
                                                            lt2Var9 = lt2Var5;
                                                            th3 = th;
                                                            lt2Var9 = lt2Var5;
                                                            de3 de3Var5 = this.I;
                                                            if (de3Var5 == null) {
                                                                throw th;
                                                            }
                                                            W(de3Var5, this.R);
                                                            this.S = z11;
                                                            this.z0 = z11;
                                                            th3 = th;
                                                            lt2Var9 = lt2Var5;
                                                        } else {
                                                            this.a0 = z11;
                                                            nc3Var.H(iJ);
                                                            us2Var2 = us2Var4;
                                                            j4 = j6;
                                                            i3 = -1;
                                                            i4 = i10;
                                                            lt2Var7 = lt2Var5;
                                                            th2 = th;
                                                            if (j4 != -9223372036854775807L) {
                                                                this.l.getClass();
                                                                if (SystemClock.elapsedRealtime() - jE < j4) {
                                                                    z7 = true;
                                                                } else {
                                                                    z7 = false;
                                                                }
                                                            } else {
                                                                z7 = true;
                                                            }
                                                            if (!z7) {
                                                                r15 = th2;
                                                                lt2Var6 = lt2Var7;
                                                                break;
                                                            }
                                                            i10 = i4;
                                                            th4 = th2;
                                                            us2Var4 = us2Var2;
                                                            lt2Var15 = lt2Var7;
                                                            z8 = true;
                                                            i5 = 2;
                                                            z11 = false;
                                                            c = 0;
                                                        }
                                                    } else {
                                                        if (iJ != -2) {
                                                            if (this.b0 && (this.t0 || this.n0 == i5)) {
                                                                h0();
                                                            }
                                                            long j7 = this.c0;
                                                            if (j7 != -9223372036854775807L) {
                                                                long j8 = j7 + 100;
                                                                this.l.getClass();
                                                                if (j8 < System.currentTimeMillis()) {
                                                                    h0();
                                                                }
                                                            }
                                                            r15 = th4;
                                                            us2Var2 = us2Var4;
                                                            j4 = j6;
                                                            lt2Var6 = lt2Var15;
                                                            i3 = -1;
                                                            i4 = i10;
                                                            break;
                                                        }
                                                        this.r0 = z8;
                                                        nc3 nc3Var2 = this.P;
                                                        if (nc3Var2 == null) {
                                                            throw th4;
                                                        }
                                                        MediaFormat mediaFormatE = nc3Var2.e();
                                                        if (this.X != 0 && mediaFormatE.getInteger("width") == 32 && mediaFormatE.getInteger("height") == 32) {
                                                            this.a0 = z8;
                                                        } else {
                                                            this.R = mediaFormatE;
                                                            this.S = z8;
                                                        }
                                                        th2 = th4;
                                                        us2Var2 = us2Var4;
                                                        j4 = j6;
                                                        lt2Var7 = lt2Var15;
                                                        i3 = -1;
                                                        i4 = i10;
                                                        if (j4 != -9223372036854775807L) {
                                                            this.l.getClass();
                                                            if (SystemClock.elapsedRealtime() - jE < j4) {
                                                                z7 = true;
                                                            } else {
                                                                z7 = false;
                                                            }
                                                        } else {
                                                            z7 = true;
                                                        }
                                                        if (!z7) {
                                                            r15 = th2;
                                                            lt2Var6 = lt2Var7;
                                                            break;
                                                        }
                                                        i10 = i4;
                                                        th4 = th2;
                                                        us2Var4 = us2Var2;
                                                        lt2Var15 = lt2Var7;
                                                        z8 = true;
                                                        i5 = 2;
                                                        z11 = false;
                                                        c = 0;
                                                    }
                                                } catch (IllegalStateException e4) {
                                                    e = e4;
                                                    r12 = z11;
                                                    r10 = 1;
                                                }
                                            }
                                            th3 = th;
                                            lt2Var9 = lt2Var5;
                                            th3 = th;
                                            lt2Var9 = lt2Var5;
                                            th3 = th;
                                            lt2Var9 = lt2Var5;
                                            boolean z13 = (this.B0 || bufferInfo.presentationTimeUs < this.q) ? true : z11;
                                            long j9 = this.x0.e;
                                            boolean z14 = (j9 == -9223372036854775807L || j9 > bufferInfo.presentationTimeUs) ? z11 : true;
                                            this.h0 = z14;
                                            us2 us2Var6 = us2Var4;
                                            ByteBuffer byteBuffer2 = this.g0;
                                            int i11 = this.f0;
                                            int i12 = bufferInfo.flags;
                                            j4 = j6;
                                            long j10 = bufferInfo.presentationTimeUs;
                                            Throwable th5 = th3;
                                            de3 de3Var6 = this.I;
                                            if (de3Var6 == null) {
                                                throw th5;
                                            }
                                            us2Var2 = us2Var6;
                                            lt2 lt2Var16 = lt2Var9;
                                            if (!Y(j, j2, nc3Var, byteBuffer2, i11, i12, 1, j10, z13, z14, de3Var6)) {
                                                i3 = -1;
                                                i4 = 4;
                                                r15 = 0;
                                                lt2Var6 = lt2Var16;
                                                break;
                                            }
                                            H(bufferInfo.presentationTimeUs);
                                            i4 = 4;
                                            boolean z15 = (bufferInfo.flags & 4) != 0;
                                            if (!z15 && this.q0 && this.h0) {
                                                this.l.getClass();
                                                this.c0 = System.currentTimeMillis();
                                            }
                                            i3 = -1;
                                            this.f0 = -1;
                                            th2 = null;
                                            r15 = 0;
                                            this.g0 = null;
                                            lt2Var7 = lt2Var16;
                                            if (z15) {
                                                h0();
                                                lt2Var6 = lt2Var16;
                                                break;
                                            }
                                            if (j4 != -9223372036854775807L) {
                                                this.l.getClass();
                                                if (SystemClock.elapsedRealtime() - jE < j4) {
                                                    z7 = true;
                                                } else {
                                                    z7 = false;
                                                }
                                            } else {
                                                z7 = true;
                                            }
                                            if (!z7) {
                                                r15 = th2;
                                                lt2Var6 = lt2Var7;
                                                break;
                                            }
                                            i10 = i4;
                                            th4 = th2;
                                            us2Var4 = us2Var2;
                                            lt2Var15 = lt2Var7;
                                            z8 = true;
                                            i5 = 2;
                                            z11 = false;
                                            c = 0;
                                        }
                                        while (true) {
                                            nc3 nc3Var3 = this.P;
                                            if (nc3Var3 != null && this.n0 != 2 && !this.t0) {
                                                if (this.e0 < 0) {
                                                    int iB = nc3Var3.b();
                                                    this.e0 = iB;
                                                    if (iB >= 0) {
                                                        lt2 lt2Var17 = lt2Var6;
                                                        lt2Var17.d = nc3Var3.z(iB);
                                                        lt2Var17.a();
                                                        lt2Var8 = lt2Var17;
                                                    }
                                                } else {
                                                    lt2Var8 = lt2Var6;
                                                }
                                                z = true;
                                                if (this.n0 == 1) {
                                                    if (!this.b0) {
                                                        this.q0 = true;
                                                        nc3Var3.a(this.e0, 0, 0L, 4);
                                                        this.e0 = i3;
                                                        lt2Var8.d = r15;
                                                    }
                                                    this.n0 = 2;
                                                    Trace.endSection();
                                                } else {
                                                    try {
                                                        if (this.Z) {
                                                            z5 = false;
                                                            this.Z = false;
                                                            ByteBuffer byteBuffer3 = lt2Var8.d;
                                                            if (byteBuffer3 == null) {
                                                                throw r15;
                                                            }
                                                            byteBuffer3.put(D0);
                                                            nc3Var3.a(this.e0, 38, 0L, 0);
                                                            this.e0 = i3;
                                                            lt2Var8.d = r15;
                                                            this.p0 = true;
                                                            us2Var3 = us2Var2;
                                                        } else {
                                                            z5 = false;
                                                            if (this.m0 == 1) {
                                                                int i13 = 0;
                                                                while (true) {
                                                                    de3 de3Var7 = this.Q;
                                                                    if (de3Var7 == null) {
                                                                        throw r15;
                                                                    }
                                                                    if (i13 >= de3Var7.p.size()) {
                                                                        this.m0 = 2;
                                                                        break;
                                                                    }
                                                                    byte[] bArr3 = (byte[]) this.Q.p.get(i13);
                                                                    ByteBuffer byteBuffer4 = lt2Var8.d;
                                                                    if (byteBuffer4 == null) {
                                                                        throw r15;
                                                                    }
                                                                    byteBuffer4.put(bArr3);
                                                                    i13++;
                                                                }
                                                            }
                                                            ByteBuffer byteBuffer5 = lt2Var8.d;
                                                            if (byteBuffer5 == null) {
                                                                throw r15;
                                                            }
                                                            int iPosition = byteBuffer5.position();
                                                            us2Var3 = us2Var2;
                                                            us2Var3.g = r15;
                                                            us2Var3.h = r15;
                                                            try {
                                                                int iN2 = n(us2Var3, lt2Var8, 0);
                                                                if (iN2 == -3) {
                                                                    if (n0()) {
                                                                        j0().e = this.s0;
                                                                    }
                                                                } else if (iN2 == -5) {
                                                                    if (this.m0 == 2) {
                                                                        lt2Var8.a();
                                                                        this.m0 = 1;
                                                                    }
                                                                    V(us2Var3);
                                                                } else if (lt2Var8.c(i4)) {
                                                                    j0().e = this.s0;
                                                                    if (this.m0 == 2) {
                                                                        lt2Var8.a();
                                                                        this.m0 = 1;
                                                                    }
                                                                    this.t0 = true;
                                                                    if (!this.p0) {
                                                                        h0();
                                                                    } else if (!this.b0) {
                                                                        this.q0 = true;
                                                                        nc3Var3.a(this.e0, 0, 0L, 4);
                                                                        this.e0 = i3;
                                                                        lt2Var8.d = r15;
                                                                    }
                                                                } else if (!this.p0 && !lt2Var8.b()) {
                                                                    lt2Var8.a();
                                                                    if (this.m0 == 2) {
                                                                        this.m0 = 1;
                                                                    }
                                                                } else if (!G(lt2Var8)) {
                                                                    boolean zE = lt2Var8.e();
                                                                    if (zE) {
                                                                        lt2Var8.c.a(iPosition);
                                                                    }
                                                                    long j11 = lt2Var8.f;
                                                                    if (this.v0) {
                                                                        d6 d6Var = j0().d;
                                                                        de3 de3Var8 = this.H;
                                                                        if (de3Var8 == null) {
                                                                            throw r15;
                                                                        }
                                                                        d6Var.d(j11, de3Var8);
                                                                        this.v0 = false;
                                                                    }
                                                                    this.s0 = Math.max(this.s0, j11);
                                                                    if (n0() || lt2Var8.c(536870912)) {
                                                                        j0().e = this.s0;
                                                                    }
                                                                    lt2Var8.f();
                                                                    if (lt2Var8.c(268435456)) {
                                                                        a0(lt2Var8);
                                                                    }
                                                                    if (this.B0) {
                                                                        long j12 = this.s0;
                                                                        if (j11 <= j12) {
                                                                            this.C0 = (j12 - j11) + 1 + this.C0;
                                                                        }
                                                                        this.s0 = j11;
                                                                        this.B0 = false;
                                                                    }
                                                                    E(lt2Var8);
                                                                    int iF = F(lt2Var8);
                                                                    long j13 = j11 + this.C0;
                                                                    int i14 = this.e0;
                                                                    if (zE) {
                                                                        nc3Var3.h(i14, lt2Var8.c, j13, iF);
                                                                    } else {
                                                                        ByteBuffer byteBuffer6 = lt2Var8.d;
                                                                        if (byteBuffer6 == null) {
                                                                            throw r15;
                                                                        }
                                                                        nc3Var3.a(i14, byteBuffer6.limit(), j13, iF);
                                                                    }
                                                                    this.e0 = i3;
                                                                    lt2Var8.d = r15;
                                                                    this.p0 = true;
                                                                    this.m0 = 0;
                                                                    this.w0.c++;
                                                                }
                                                            } catch (ws2 e5) {
                                                                U(e5);
                                                                d0(0);
                                                                c0();
                                                            }
                                                            Trace.endSection();
                                                        }
                                                        if (j4 != -9223372036854775807L) {
                                                            this.l.getClass();
                                                            z6 = SystemClock.elapsedRealtime() - jE < j4 ? true : z5;
                                                        }
                                                        if (z6) {
                                                            us2Var2 = us2Var3;
                                                            lt2Var6 = lt2Var8;
                                                            i4 = 4;
                                                        } else {
                                                            Trace.endSection();
                                                        }
                                                    } catch (IllegalStateException e6) {
                                                        e = e6;
                                                    }
                                                }
                                                e = e6;
                                                r12 = 0;
                                                r10 = z;
                                                z3 = e instanceof MediaCodec.CodecException;
                                                if (!z3) {
                                                    stackTrace = e.getStackTrace();
                                                    if (stackTrace.length > 0 || !stackTrace[r12].getClassName().equals("android.media.MediaCodec")) {
                                                        throw e;
                                                    }
                                                }
                                                U(e);
                                                if (z3 || !((MediaCodec.CodecException) e).isRecoverable()) {
                                                    r2 = r12;
                                                } else {
                                                    r2 = r10;
                                                }
                                                if (r2 != 0) {
                                                    x();
                                                }
                                                oc3VarC = C(e, this.W);
                                                if (oc3VarC.f == 1101) {
                                                    i = 4006;
                                                } else {
                                                    i = 4003;
                                                }
                                                throw m(oc3VarC, this.H, r2, i);
                                            }
                                            Trace.endSection();
                                        }
                                    } else {
                                        b03 b03Var = this.w0;
                                        int i15 = b03Var.d;
                                        af3 af3Var = this.n;
                                        af3Var.getClass();
                                        b03Var.d = i15 + af3Var.f(j - this.p);
                                        d0(1);
                                    }
                                }
                                this.w0.a();
                            } catch (MediaCodec.CryptoException e7) {
                                e = e7;
                            }
                        } catch (IllegalStateException e8) {
                            e = e8;
                            z = true;
                        }
                    } catch (IllegalStateException e9) {
                        e = e9;
                    }
                } catch (MediaCodec.CryptoException e10) {
                    e = e10;
                    throw m(e, this.H, z2, qz1.e(e.getErrorCode()));
                } catch (IllegalStateException e11) {
                    e = e11;
                    r10 = lt2Var10;
                }
            } catch (MediaCodec.CryptoException e12) {
                e = e12;
                z2 = false;
            }
        } catch (IllegalStateException e13) {
            e = e13;
            z = true;
        }
    }

    public abstract boolean t();

    public abstract boolean u();

    /* JADX WARN: Code duplicated, block: B:103:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:116:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:168:0x02b0 A[Catch: wc3 -> 0x02ca, TryCatch #2 {wc3 -> 0x02ca, blocks: (B:166:0x027e, B:168:0x02b0, B:171:0x02bd, B:173:0x02c7, B:177:0x02e1, B:180:0x02e9, B:181:0x02eb, B:176:0x02cc, B:183:0x02ef, B:184:0x02f0, B:186:0x02f7, B:187:0x02f8, B:188:0x0302, B:190:0x0305), top: B:198:0x0056 }] */
    /* JADX WARN: Code duplicated, block: B:170:0x02ba  */
    /* JADX WARN: Code duplicated, block: B:173:0x02c7 A[Catch: wc3 -> 0x02ca, TryCatch #2 {wc3 -> 0x02ca, blocks: (B:166:0x027e, B:168:0x02b0, B:171:0x02bd, B:173:0x02c7, B:177:0x02e1, B:180:0x02e9, B:181:0x02eb, B:176:0x02cc, B:183:0x02ef, B:184:0x02f0, B:186:0x02f7, B:187:0x02f8, B:188:0x0302, B:190:0x0305), top: B:198:0x0056 }] */
    /* JADX WARN: Code duplicated, block: B:176:0x02cc A[Catch: wc3 -> 0x02ca, TryCatch #2 {wc3 -> 0x02ca, blocks: (B:166:0x027e, B:168:0x02b0, B:171:0x02bd, B:173:0x02c7, B:177:0x02e1, B:180:0x02e9, B:181:0x02eb, B:176:0x02cc, B:183:0x02ef, B:184:0x02f0, B:186:0x02f7, B:187:0x02f8, B:188:0x0302, B:190:0x0305), top: B:198:0x0056 }] */
    /* JADX WARN: Code duplicated, block: B:179:0x02e7  */
    /* JADX WARN: Code duplicated, block: B:219:0x02e9 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.util.ArrayDeque] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v2, types: [yc3] */
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
    public final void v() throws Throwable {
        de3 de3Var;
        yc3 yc3Var;
        boolean z;
        Throwable th;
        yc3 yc3Var2;
        Exception exc;
        wc3 wc3Var;
        ?? diagnosticInfo;
        wc3 wc3Var2;
        yc3 yc3Var3;
        long j;
        LogSessionId logSessionId;
        int i;
        boolean z2;
        yc3 yc3Var4 = this;
        lc3 lc3Var = yc3Var4.D;
        if (yc3Var4.P != null || yc3Var4.i0 || (de3Var = yc3Var4.H) == null) {
            return;
        }
        ?? r9 = 1;
        boolean z3 = true;
        if (yc3Var4.K == null && yc3Var4.N(de3Var)) {
            yc3Var4.i0 = false;
            yc3Var4.b0();
            String str = de3Var.m;
            if ("audio/mp4a-latm".equals(str) || "audio/mpeg".equals(str) || "audio/opus".equals(str)) {
                lc3Var.k = 32;
            } else {
                lc3Var.k = 1;
            }
            yc3Var4.i0 = true;
            return;
        }
        s62 s62Var = yc3Var4.K;
        yc3Var4.J = s62Var;
        if (s62Var != null) {
            int i2 = ec3.a;
        }
        try {
            de3 de3Var2 = yc3Var4.H;
            Throwable th2 = null;
            try {
                if (de3Var2 == null) {
                    throw null;
                }
                if (yc3Var4.U == null) {
                    try {
                        ArrayList arrayListM = yc3Var4.M(yc3Var4.y, de3Var2);
                        arrayListM.isEmpty();
                        yc3Var4.U = new ArrayDeque();
                        if (!arrayListM.isEmpty()) {
                            yc3Var4.U.add((pc3) arrayListM.get(0));
                        }
                        yc3Var4.V = null;
                    } catch (ad3 e) {
                        throw new wc3(de3Var2, e, -49998);
                    }
                }
                if (yc3Var4.U.isEmpty()) {
                    throw new wc3(de3Var2, null, -49999);
                }
                ArrayDeque arrayDeque = yc3Var4.U;
                if (arrayDeque == null) {
                    yc3Var = yc3Var4;
                    throw null;
                }
                while (true) {
                    yc3Var = yc3Var4;
                    if (yc3Var.P != null) {
                        yc3Var.U = th2;
                        return;
                    }
                    pc3 pc3Var = (pc3) arrayDeque.peekFirst();
                    if (pc3Var == null) {
                        throw th2;
                    }
                    yc3Var.D(de3Var2);
                    if (!yc3Var.w(pc3Var)) {
                        return;
                    }
                    try {
                        yc3Var.W = pc3Var;
                        de3 de3Var3 = yc3Var.H;
                        if (de3Var3 == null) {
                            throw th2;
                        }
                        String str2 = pc3Var.a;
                        float f = yc3Var.O;
                        try {
                            de3[] de3VarArr = yc3Var.o;
                            de3VarArr.getClass();
                            float fR = yc3Var.R(f, de3Var3, de3VarArr);
                            if (fR <= yc3Var.z) {
                                fR = -1.0f;
                            }
                            yc3Var.l.getClass();
                            long jElapsedRealtime = SystemClock.elapsedRealtime();
                            z = z3;
                            try {
                                kd0 kd0VarO = yc3Var.O(pc3Var, de3Var3, fR);
                                int i3 = Build.VERSION.SDK_INT;
                                th = th2;
                                if (i3 >= 31) {
                                    try {
                                        la3 la3Var = yc3Var.k;
                                        la3Var.getClass();
                                        synchronized (la3Var) {
                                            j = jElapsedRealtime;
                                            rz1 rz1Var = la3Var.b;
                                            if (rz1Var == null) {
                                                throw th;
                                            }
                                            logSessionId = (LogSessionId) rz1Var.g;
                                        }
                                        LogSessionId unused = LogSessionId.LOG_SESSION_ID_NONE;
                                        if (!logSessionId.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
                                            ((MediaFormat) kd0VarO.h).setString("log-session-id", logSessionId.getStringId());
                                        }
                                    } catch (Exception e2) {
                                        exc = e2;
                                        yc3Var2 = yc3Var;
                                        s90.T("MediaCodecRenderer", "Failed to initialize decoder: ".concat(pc3Var.a), exc);
                                        arrayDeque.removeFirst();
                                        String str3 = pc3Var.a;
                                        int length = str3.length();
                                        String string = de3Var2.toString();
                                        String strO = ec.o(new StringBuilder(length + 23 + string.length()), "Decoder init failed: ", str3, ", ", string);
                                        String str4 = de3Var2.m;
                                        if (exc instanceof MediaCodec.CodecException) {
                                            diagnosticInfo = ((MediaCodec.CodecException) exc).getDiagnosticInfo();
                                        } else {
                                            diagnosticInfo = th;
                                        }
                                        wc3Var = new wc3(strO, exc, str4, pc3Var, diagnosticInfo);
                                        yc3Var2.U(wc3Var);
                                        wc3Var2 = yc3Var2.V;
                                        if (wc3Var2 == null) {
                                            yc3Var2.V = wc3Var;
                                        } else {
                                            yc3Var2.V = new wc3(wc3Var2.getMessage(), wc3Var2.getCause(), wc3Var2.f, wc3Var2.g, wc3Var2.h);
                                        }
                                        if (!arrayDeque.isEmpty()) {
                                            throw yc3Var2.V;
                                        }
                                    }
                                } else {
                                    j = jElapsedRealtime;
                                }
                                try {
                                    try {
                                        StringBuilder sb = new StringBuilder(str2.length() + 12);
                                        sb.append("createCodec:");
                                        sb.append(str2);
                                        Trace.beginSection(sb.toString());
                                        nc3 nc3VarC = yc3Var.x.c(kd0VarO);
                                        yc3Var.P = nc3VarC;
                                        nc3VarC.c(new w32(11, yc3Var));
                                        try {
                                            Trace.endSection();
                                            try {
                                                yc3Var.l.getClass();
                                                long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                                                if (!pc3Var.b(de3Var3)) {
                                                    String strC = de3.c(de3Var3);
                                                    String str5 = qz1.a;
                                                    Locale locale = Locale.US;
                                                    s90.Q("MediaCodecRenderer", "Format exceeds selected codec's capabilities [" + strC + ", " + str2 + "]");
                                                }
                                                yc3Var.T = fR;
                                                yc3Var.Q = de3Var3;
                                                if (i3 > 25 || !"OMX.Exynos.avc.dec.secure".equals(str2)) {
                                                    i = 0;
                                                } else {
                                                    String str6 = Build.MODEL;
                                                    if (str6.startsWith("SM-T585") || str6.startsWith("SM-A510") || str6.startsWith("SM-A520") || str6.startsWith("SM-J700")) {
                                                        i = 2;
                                                    } else {
                                                        i = 0;
                                                    }
                                                }
                                                yc3Var.X = i;
                                                yc3Var.Y = (i3 == 29 && "c2.android.aac.decoder".equals(str2)) ? z : false;
                                                String str7 = pc3Var.a;
                                                if (i3 <= 25 && "OMX.rk.video_decoder.avc".equals(str7)) {
                                                    z2 = z;
                                                } else if ((i3 > 29 || !("OMX.broadcom.video_decoder.tunnel".equals(str7) || "OMX.broadcom.video_decoder.tunnel.secure".equals(str7) || "OMX.bcm.vdec.avc.tunnel".equals(str7) || "OMX.bcm.vdec.avc.tunnel.secure".equals(str7) || "OMX.bcm.vdec.hevc.tunnel".equals(str7) || "OMX.bcm.vdec.hevc.tunnel.secure".equals(str7))) && !("Amazon".equals(Build.MANUFACTURER) && "AFTS".equals(Build.MODEL) && pc3Var.f)) {
                                                    z2 = false;
                                                } else {
                                                    z2 = z;
                                                }
                                                yc3Var.b0 = z2;
                                                if (yc3Var.P == null) {
                                                    throw th;
                                                }
                                                if (yc3Var.m == 2) {
                                                    yc3Var.l.getClass();
                                                    yc3Var.d0 = SystemClock.elapsedRealtime() + 1000;
                                                }
                                                yc3Var.w0.a++;
                                                yc3Var.S(jElapsedRealtime2, jElapsedRealtime2 - j, str2);
                                                yc3Var2 = yc3Var;
                                                yc3Var = yc3Var2;
                                                z3 = z;
                                                th2 = th;
                                            } catch (Exception e3) {
                                                e = e3;
                                                yc3Var3 = yc3Var;
                                                exc = e;
                                                yc3Var2 = yc3Var3;
                                                s90.T("MediaCodecRenderer", "Failed to initialize decoder: ".concat(pc3Var.a), exc);
                                                arrayDeque.removeFirst();
                                                String str8 = pc3Var.a;
                                                int length2 = str8.length();
                                                String string2 = de3Var2.toString();
                                                String strO2 = ec.o(new StringBuilder(length2 + 23 + string2.length()), "Decoder init failed: ", str8, ", ", string2);
                                                String str9 = de3Var2.m;
                                                if (exc instanceof MediaCodec.CodecException) {
                                                    diagnosticInfo = ((MediaCodec.CodecException) exc).getDiagnosticInfo();
                                                } else {
                                                    diagnosticInfo = th;
                                                }
                                                wc3Var = new wc3(strO2, exc, str9, pc3Var, diagnosticInfo);
                                                yc3Var2.U(wc3Var);
                                                wc3Var2 = yc3Var2.V;
                                                if (wc3Var2 == null) {
                                                    yc3Var2.V = wc3Var;
                                                } else {
                                                    yc3Var2.V = new wc3(wc3Var2.getMessage(), wc3Var2.getCause(), wc3Var2.f, wc3Var2.g, wc3Var2.h);
                                                }
                                                if (!arrayDeque.isEmpty()) {
                                                    throw yc3Var2.V;
                                                }
                                            }
                                        } catch (Exception e4) {
                                            e = e4;
                                        }
                                    } catch (Throwable th3) {
                                        Trace.endSection();
                                        throw th3;
                                    }
                                } catch (Exception e5) {
                                    e = e5;
                                    yc3Var3 = kd0VarO;
                                    exc = e;
                                    yc3Var2 = yc3Var3;
                                    s90.T("MediaCodecRenderer", "Failed to initialize decoder: ".concat(pc3Var.a), exc);
                                    arrayDeque.removeFirst();
                                    String str10 = pc3Var.a;
                                    int length3 = str10.length();
                                    String string3 = de3Var2.toString();
                                    String strO3 = ec.o(new StringBuilder(length3 + 23 + string3.length()), "Decoder init failed: ", str10, ", ", string3);
                                    String str11 = de3Var2.m;
                                    if (exc instanceof MediaCodec.CodecException) {
                                        diagnosticInfo = ((MediaCodec.CodecException) exc).getDiagnosticInfo();
                                    } else {
                                        diagnosticInfo = th;
                                    }
                                    wc3Var = new wc3(strO3, exc, str11, pc3Var, diagnosticInfo);
                                    yc3Var2.U(wc3Var);
                                    wc3Var2 = yc3Var2.V;
                                    if (wc3Var2 == null) {
                                        yc3Var2.V = wc3Var;
                                    } else {
                                        yc3Var2.V = new wc3(wc3Var2.getMessage(), wc3Var2.getCause(), wc3Var2.f, wc3Var2.g, wc3Var2.h);
                                    }
                                    if (!arrayDeque.isEmpty()) {
                                        throw yc3Var2.V;
                                    }
                                }
                            } catch (Exception e6) {
                                e = e6;
                                yc3Var3 = yc3Var;
                                th = th2;
                            }
                        } catch (Exception e7) {
                            e = e7;
                            z = z3;
                            th = th2;
                        }
                    } catch (Exception e8) {
                        e = e8;
                        z = z3;
                        th = th2;
                    }
                    yc3Var3 = yc3Var;
                    exc = e;
                    yc3Var2 = yc3Var3;
                    s90.T("MediaCodecRenderer", "Failed to initialize decoder: ".concat(pc3Var.a), exc);
                    arrayDeque.removeFirst();
                    String str12 = pc3Var.a;
                    int length4 = str12.length();
                    String string4 = de3Var2.toString();
                    String strO4 = ec.o(new StringBuilder(length4 + 23 + string4.length()), "Decoder init failed: ", str12, ", ", string4);
                    String str13 = de3Var2.m;
                    if (exc instanceof MediaCodec.CodecException) {
                        diagnosticInfo = ((MediaCodec.CodecException) exc).getDiagnosticInfo();
                    } else {
                        diagnosticInfo = th;
                    }
                    wc3Var = new wc3(strO4, exc, str13, pc3Var, diagnosticInfo);
                    yc3Var2.U(wc3Var);
                    wc3Var2 = yc3Var2.V;
                    if (wc3Var2 == null) {
                        yc3Var2.V = wc3Var;
                    } else {
                        yc3Var2.V = new wc3(wc3Var2.getMessage(), wc3Var2.getCause(), wc3Var2.f, wc3Var2.g, wc3Var2.h);
                    }
                    if (!arrayDeque.isEmpty()) {
                        throw yc3Var2.V;
                    }
                    yc3Var = yc3Var2;
                    z3 = z;
                    th2 = th;
                }
            } catch (wc3 e9) {
                e = e9;
                throw r9.m(e, de3Var, false, 4001);
            }
        } catch (wc3 e10) {
            e = e10;
            r9 = yc3Var4;
            throw r9.m(e, de3Var, false, 4001);
        }
    }

    public boolean w(pc3 pc3Var) {
        return true;
    }

    public final void x() {
        try {
            nc3 nc3Var = this.P;
            if (nc3Var != null) {
                nc3Var.k();
                this.w0.b++;
                pc3 pc3Var = this.W;
                if (pc3Var == null) {
                    throw null;
                }
                T(pc3Var.a);
            }
            this.P = null;
            this.J = null;
            B();
        } catch (Throwable th) {
            this.P = null;
            this.J = null;
            B();
            throw th;
        }
    }

    public boolean y() {
        int i = this.o0;
        if (i == 3 || (this.Y && !this.r0)) {
            return true;
        }
        if (i == 2) {
            try {
                s62 s62Var = this.K;
                s62Var.getClass();
                this.J = s62Var;
                this.n0 = 0;
                this.o0 = 0;
            } catch (q43 e) {
                s90.T("MediaCodecRenderer", "Failed to update the DRM session, releasing the codec instead.", e);
                return true;
            }
        }
        return false;
    }

    public boolean z() {
        return true;
    }

    public void r() {
    }

    public void D(de3 de3Var) {
    }

    public void E(lt2 lt2Var) {
    }
}
