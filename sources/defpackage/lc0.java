package defpackage;

import android.os.SystemClock;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class lc0 {
    public final gc0 a;
    public final ec0 b = new ec0();
    public final d6 c = new d6();
    public final d6 d = new d6();
    public final ih0 e;
    public final hc0 f;
    public long g;
    public long h;
    public long i;
    public i61 j;
    public long k;
    public final us2 l;

    public lc0(us2 us2Var, gc0 gc0Var, hc0 hc0Var) {
        this.l = us2Var;
        this.a = gc0Var;
        this.f = hc0Var;
        ih0 ih0Var = new ih0();
        int i = 16;
        if (Integer.bitCount(16) != 1) {
            int iHighestOneBit = Integer.highestOneBit(15);
            i = iHighestOneBit + iHighestOneBit;
        }
        ih0Var.f = 0;
        ih0Var.g = -1;
        ih0Var.h = 0;
        ih0Var.j = new long[i];
        ih0Var.i = i - 1;
        this.e = ih0Var;
        this.g = -9223372036854775807L;
        this.j = i61.d;
        this.h = -9223372036854775807L;
        this.i = -9223372036854775807L;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0092  */
    public final void a(long j, long j2) {
        double dDoubleValue;
        us2 us2Var = this.l;
        ob0 ob0Var = (ob0) us2Var.h;
        while (true) {
            ih0 ih0Var = this.e;
            int i = ih0Var.h;
            if (i == 0) {
                return;
            }
            if (i == 0) {
                throw new NoSuchElementException();
            }
            long j3 = ((long[]) ih0Var.j)[ih0Var.f];
            Long l = (Long) this.d.g(j3);
            if (l != null && l.longValue() != this.k) {
                this.k = l.longValue();
                this.a.a(2);
            }
            long j4 = this.k;
            gc0 gc0Var = this.a;
            ec0 ec0Var = this.b;
            int iG = gc0Var.g(j3, j, j2, j4, false, false, ec0Var);
            if (iG != 5 && iG != 4) {
                long j5 = ec0Var.a;
                hc0 hc0Var = this.f;
                hc0Var.getClass();
                hn.v(j3 != -9223372036854775807L);
                hn.v(j5 != -9223372036854775807L);
                long j6 = hc0Var.a;
                if (j6 != -9223372036854775807L) {
                    long j7 = hc0Var.b;
                    if (j7 == -9223372036854775807L || j3 == j6) {
                        dDoubleValue = ((Double) hc0Var.d.getUpper()).doubleValue();
                    } else {
                        dDoubleValue = (j5 - j7) / (j3 - j6);
                    }
                } else {
                    dDoubleValue = ((Double) hc0Var.d.getUpper()).doubleValue();
                }
                hc0Var.c = (((Double) hc0Var.d.clamp(Double.valueOf(dDoubleValue))).doubleValue() * 0.20000000298023224d) + (hc0Var.c * 0.800000011920929d);
                hc0Var.a = j3;
                hc0Var.b = j5;
            }
            if (iG == 0 || iG == 1) {
                this.h = j3;
                long jB = ih0Var.b();
                i61 i61Var = (i61) this.c.g(jB);
                if (i61Var != null && !i61Var.equals(i61.d) && !i61Var.equals(this.j)) {
                    this.j = i61Var;
                    uc3 uc3Var = new uc3();
                    uc3Var.s = i61Var.a;
                    uc3Var.t = i61Var.b;
                    uc3Var.e("video/raw");
                    us2Var.g = new de3(uc3Var);
                    ob0Var.i.execute(new pg3(us2Var, i61Var));
                }
                long jNanoTime = iG == 0 ? System.nanoTime() : ec0Var.b;
                int i2 = gc0Var.d;
                gc0Var.d = 3;
                gc0Var.k.getClass();
                gc0Var.f = qz1.r(SystemClock.elapsedRealtime());
                if ((i2 != 3) && ob0Var.e != null) {
                    ob0Var.i.execute(new pg3(us2Var, 0));
                }
                de3 de3Var = (de3) us2Var.g;
                long j8 = jNanoTime;
                ob0Var.j.b(jB, j8, de3Var == null ? new de3(new uc3()) : de3Var, null);
                tb0 tb0Var = (tb0) ob0Var.d.remove();
                tb0Var.c.w0(tb0Var.a, tb0Var.b, j8);
            } else if (iG == 2 || iG == 3) {
                this.h = j3;
                ih0Var.b();
                ob0Var.i.execute(new pg3(us2Var, 1));
                ((tb0) ob0Var.d.remove()).a();
            } else if (iG != 4) {
                return;
            } else {
                this.h = j3;
            }
        }
    }
}
