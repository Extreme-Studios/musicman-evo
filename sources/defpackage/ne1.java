package defpackage;

import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class ne1 implements cd1 {
    public int b;
    public float c;
    public float d;
    public nb1 e;
    public nb1 f;
    public nb1 g;
    public nb1 h;
    public boolean i;
    public be1 j;
    public ByteBuffer k;
    public ShortBuffer l;
    public ByteBuffer m;
    public long n;
    public long o;
    public boolean p;

    @Override // defpackage.cd1
    public final nb1 a(nb1 nb1Var) throws jc1 {
        if (nb1Var.c != 2) {
            throw new jc1("Unhandled input format:", nb1Var);
        }
        int i = this.b;
        if (i == -1) {
            i = nb1Var.a;
        }
        this.e = nb1Var;
        nb1 nb1Var2 = new nb1(i, nb1Var.b, 2);
        this.f = nb1Var2;
        this.i = true;
        return nb1Var2;
    }

    @Override // defpackage.cd1
    public final void b() {
        be1 be1Var = this.j;
        if (be1Var != null) {
            int i = be1Var.k;
            int i2 = be1Var.r;
            int i3 = be1Var.m;
            float f = be1Var.c;
            float f2 = be1Var.d;
            int i4 = i3 + ((int) ((((((((double) (i - i2)) / ((double) (f / f2))) + ((double) i2)) + be1Var.w) + ((double) be1Var.o)) / ((double) (be1Var.e * f2))) + 0.5d));
            be1Var.w = 0.0d;
            int i5 = be1Var.h;
            int i6 = i5 + i5;
            be1Var.j = be1Var.a(be1Var.j, i, i + i6);
            int i7 = 0;
            while (true) {
                int i8 = be1Var.b;
                if (i7 >= i6 * i8) {
                    break;
                }
                be1Var.j[(i8 * i) + i7] = 0;
                i7++;
            }
            be1Var.k += i6;
            be1Var.e();
            if (be1Var.m > i4) {
                be1Var.m = Math.max(i4, 0);
            }
            be1Var.k = 0;
            be1Var.r = 0;
            be1Var.o = 0;
        }
        this.p = true;
    }

    @Override // defpackage.cd1
    public final void c(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            be1 be1Var = this.j;
            be1Var.getClass();
            ShortBuffer shortBufferAsShortBuffer = byteBuffer.asShortBuffer();
            int iRemaining = byteBuffer.remaining();
            this.n += (long) iRemaining;
            int iRemaining2 = shortBufferAsShortBuffer.remaining();
            int i = be1Var.b;
            int i2 = iRemaining2 / i;
            int i3 = i2 * i;
            short[] sArrA = be1Var.a(be1Var.j, be1Var.k, i2);
            be1Var.j = sArrA;
            shortBufferAsShortBuffer.get(sArrA, be1Var.k * i, (i3 + i3) / 2);
            be1Var.k += i2;
            be1Var.e();
            byteBuffer.position(byteBuffer.position() + iRemaining);
        }
    }

    @Override // defpackage.cd1
    public final ByteBuffer d() {
        be1 be1Var = this.j;
        if (be1Var != null) {
            int i = be1Var.b;
            hn.M(be1Var.m >= 0);
            int i2 = be1Var.m * i;
            int i3 = i2 + i2;
            if (i3 > 0) {
                if (this.k.capacity() < i3) {
                    ByteBuffer byteBufferOrder = ByteBuffer.allocateDirect(i3).order(ByteOrder.nativeOrder());
                    this.k = byteBufferOrder;
                    this.l = byteBufferOrder.asShortBuffer();
                } else {
                    this.k.clear();
                    this.l.clear();
                }
                ShortBuffer shortBuffer = this.l;
                hn.M(be1Var.m >= 0);
                int iMin = Math.min(shortBuffer.remaining() / i, be1Var.m);
                int i4 = iMin * i;
                shortBuffer.put(be1Var.l, 0, i4);
                int i5 = be1Var.m - iMin;
                be1Var.m = i5;
                short[] sArr = be1Var.l;
                System.arraycopy(sArr, i4, sArr, 0, i5 * i);
                this.o += (long) i3;
                this.k.limit(i3);
                this.m = this.k;
            }
        }
        ByteBuffer byteBuffer = this.m;
        this.m = cd1.a;
        return byteBuffer;
    }

    @Override // defpackage.cd1
    public final boolean e() {
        if (this.p) {
            be1 be1Var = this.j;
            if (be1Var != null) {
                hn.M(be1Var.m >= 0);
                int i = be1Var.m * be1Var.b;
                if (i + i != 0) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.cd1
    public final long f(long j) {
        long j2 = this.o;
        if (j2 < 1024) {
            return (long) (j / ((double) this.c));
        }
        long j3 = this.n;
        be1 be1Var = this.j;
        be1Var.getClass();
        int i = be1Var.k * be1Var.b;
        long j4 = j3 - ((long) (i + i));
        int i2 = this.h.a;
        int i3 = this.g.a;
        return i2 == i3 ? qz1.t(j, j2, j4, RoundingMode.DOWN) : qz1.t(j, j2 * ((long) i3), j4 * ((long) i2), RoundingMode.DOWN);
    }

    @Override // defpackage.cd1
    public final void g() {
        this.c = 1.0f;
        this.d = 1.0f;
        nb1 nb1Var = nb1.e;
        this.e = nb1Var;
        this.f = nb1Var;
        this.g = nb1Var;
        this.h = nb1Var;
        ByteBuffer byteBuffer = cd1.a;
        this.k = byteBuffer;
        this.l = byteBuffer.asShortBuffer();
        this.m = byteBuffer;
        this.b = -1;
        this.i = false;
        this.j = null;
        this.n = 0L;
        this.o = 0L;
        this.p = false;
    }

    @Override // defpackage.cd1
    public final boolean h() {
        if (this.f.a != -1) {
            return Math.abs(this.c + (-1.0f)) >= 1.0E-4f || Math.abs(this.d + (-1.0f)) >= 1.0E-4f || this.f.a != this.e.a;
        }
        return false;
    }

    @Override // defpackage.cd1
    public final void j() {
        if (h()) {
            nb1 nb1Var = this.e;
            this.g = nb1Var;
            nb1 nb1Var2 = this.f;
            this.h = nb1Var2;
            if (this.i) {
                this.j = new be1(nb1Var.a, nb1Var.b, this.c, this.d, nb1Var2.a);
            } else {
                be1 be1Var = this.j;
                if (be1Var != null) {
                    be1Var.k = 0;
                    be1Var.m = 0;
                    be1Var.o = 0;
                    be1Var.p = 0;
                    be1Var.q = 0;
                    be1Var.r = 0;
                    be1Var.s = 0;
                    be1Var.t = 0;
                    be1Var.u = 0;
                    be1Var.v = 0;
                    be1Var.w = 0.0d;
                }
            }
        }
        this.m = cd1.a;
        this.n = 0L;
        this.o = 0L;
        this.p = false;
    }
}
