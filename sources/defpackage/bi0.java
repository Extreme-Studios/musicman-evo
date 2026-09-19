package defpackage;

import java.io.EOFException;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class bi0 implements gi0 {
    public final fi0 f;
    public final long g;
    public final long h;
    public final ii0 i;
    public int j;
    public long k;
    public long l;
    public long m;
    public long n;
    public long o;
    public long p;
    public long q;

    public bi0(ii0 ii0Var, long j, long j2, long j3, long j4, boolean z) {
        hn.v(j >= 0 && j2 > j);
        this.i = ii0Var;
        this.g = j;
        this.h = j2;
        if (j3 == j2 - j || z) {
            this.k = j4;
            this.j = 4;
        } else {
            this.j = 0;
        }
        this.f = new fi0();
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00c9 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:40:0x00ca  */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v9 */
    @Override // defpackage.gi0
    public final long d(od0 od0Var) throws IOException {
        long j;
        ?? r3;
        long j2;
        long j3;
        long jMax;
        fi0 fi0Var;
        long j4;
        int i = this.j;
        long j5 = this.h;
        fi0 fi0Var2 = this.f;
        if (i == 0) {
            j = 0;
            long jO = od0Var.o();
            this.l = jO;
            this.j = 1;
            long j6 = (-65307) + j5;
            if (j6 > jO) {
                return j6;
            }
            r3 = 0;
        } else if (i != 1) {
            if (i == 2) {
                long j7 = this.n;
                long j8 = this.o;
                if (j7 == j8) {
                    jMax = -1;
                    j3 = -1;
                } else {
                    long jO2 = od0Var.o();
                    if (fi0Var2.a(od0Var, j8)) {
                        fi0Var2.b(od0Var, false);
                        od0Var.i();
                        long j9 = this.m;
                        long j10 = fi0Var2.b;
                        long j11 = j9 - j10;
                        j2 = 2;
                        int i2 = fi0Var2.d + fi0Var2.e;
                        if (j11 < 0 || j11 >= 72000) {
                            if (j11 < 0) {
                                this.o = jO2;
                                this.q = j10;
                            } else {
                                this.n = od0Var.o() + ((long) i2);
                                this.p = j10;
                            }
                            long j12 = this.o;
                            long j13 = this.n;
                            long j14 = j12 - j13;
                            if (j14 < 100000) {
                                this.o = j13;
                                fi0Var2 = fi0Var2;
                                j3 = -1;
                                jMax = j13;
                            } else {
                                fi0Var2 = fi0Var2;
                                long jO3 = od0Var.o() - (((long) i2) * (j11 <= 0 ? 2L : 1L));
                                j3 = -1;
                                String str = qz1.a;
                                jMax = Math.max(j13, Math.min(((j11 * j14) / (this.q - this.p)) + jO3, j12 - 1));
                            }
                        } else {
                            fi0Var2 = fi0Var2;
                            jMax = -1;
                            j3 = -1;
                        }
                    } else {
                        jMax = this.n;
                        if (jMax == jO2) {
                            throw new IOException("No ogg page can be found.");
                        }
                        j3 = -1;
                    }
                    if (jMax != j3) {
                        return jMax;
                    }
                    this.j = 3;
                    fi0Var = fi0Var2;
                    j4 = j3;
                }
                j2 = 2;
                if (jMax != j3) {
                    return jMax;
                }
                this.j = 3;
                fi0Var = fi0Var2;
                j4 = j3;
            } else {
                if (i != 3) {
                    return -1L;
                }
                fi0Var = fi0Var2;
                j4 = -1;
                j2 = 2;
            }
            while (true) {
                fi0Var.a(od0Var, j4);
                fi0Var.b(od0Var, false);
                if (fi0Var.b > this.m) {
                    od0Var.i();
                    this.j = 4;
                    return -(this.p + j2);
                }
                od0Var.t(fi0Var.d + fi0Var.e);
                this.n = od0Var.o();
                this.p = fi0Var.b;
                j4 = -1;
            }
        } else {
            j = 0;
            r3 = 0;
        }
        fi0Var2.a = r3;
        fi0Var2.b = j;
        fi0Var2.c = r3;
        fi0Var2.d = r3;
        fi0Var2.e = r3;
        if (!fi0Var2.a(od0Var, -1L)) {
            throw new EOFException();
        }
        fi0Var2.b(od0Var, r3);
        od0Var.t(fi0Var2.d + fi0Var2.e);
        long j15 = fi0Var2.b;
        while ((fi0Var2.a & 4) != 4 && fi0Var2.a(od0Var, -1L) && od0Var.o() < j5 && fi0Var2.b(od0Var, true)) {
            try {
                od0Var.t(fi0Var2.d + fi0Var2.e);
                j15 = fi0Var2.b;
            } catch (EOFException unused) {
            }
        }
        this.k = j15;
        this.j = 4;
        return this.l;
    }

    @Override // defpackage.gi0
    public final /* bridge */ /* synthetic */ ee0 h() {
        if (this.k != 0) {
            return new ai0(this);
        }
        return null;
    }

    @Override // defpackage.gi0
    public final void j(long j) {
        long j2 = this.k - 1;
        String str = qz1.a;
        this.m = Math.max(0L, Math.min(j, j2));
        this.j = 2;
        this.n = this.g;
        this.o = this.h;
        this.p = 0L;
        this.q = this.k;
    }
}
