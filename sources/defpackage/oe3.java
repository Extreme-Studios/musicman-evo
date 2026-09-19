package defpackage;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class oe3 implements af3 {
    public final int a;
    public final /* synthetic */ qe3 b;

    public oe3(qe3 qe3Var, int i) {
        this.b = qe3Var;
        this.a = i;
    }

    @Override // defpackage.af3
    public final int a(us2 us2Var, lt2 lt2Var, int i) {
        int i2;
        int i3;
        boolean z;
        qe3 qe3Var = this.b;
        int i4 = this.a;
        if (qe3Var.q()) {
            return -3;
        }
        qe3Var.n(i4);
        ze3 ze3Var = qe3Var.w[i4];
        boolean z2 = qe3Var.Q;
        ze3Var.getClass();
        boolean z3 = (i & 2) != 0;
        ri0 ri0Var = ze3Var.b;
        synchronized (ze3Var) {
            try {
                lt2Var.e = false;
                int i5 = ze3Var.r;
                i2 = -4;
                i3 = -5;
                if (i5 != ze3Var.o) {
                    de3 de3Var = ((ye3) ze3Var.c.j(ze3Var.p + i5)).a;
                    if (z3 || de3Var != ze3Var.f) {
                        ze3Var.e(de3Var, us2Var);
                    } else {
                        int iH = ze3Var.h(ze3Var.r);
                        if (ze3Var.g != null) {
                            int i6 = ze3Var.l[iH];
                            z = false;
                        } else {
                            z = true;
                        }
                        if (z) {
                            int i7 = ze3Var.l[iH];
                            lt2Var.a = i7;
                            if (ze3Var.r == ze3Var.o - 1 && (z2 || ze3Var.v)) {
                                lt2Var.a = 536870912 | i7;
                            }
                            lt2Var.f = ze3Var.m[iH];
                            ri0Var.g = ze3Var.k[iH];
                            ri0Var.h = ze3Var.j[iH];
                            ri0Var.i = ze3Var.n[iH];
                            i3 = -4;
                        } else {
                            lt2Var.e = true;
                            i3 = -3;
                        }
                    }
                } else if (z2 || ze3Var.v) {
                    lt2Var.a = 4;
                    lt2Var.f = Long.MIN_VALUE;
                    i3 = -4;
                } else {
                    de3 de3Var2 = ze3Var.y;
                    if (de3Var2 == null || (!z3 && de3Var2 == ze3Var.f)) {
                        i3 = -3;
                    } else {
                        ze3Var.e(de3Var2, us2Var);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (i3 != -4) {
            i2 = i3;
        } else if (!lt2Var.c(4)) {
            int i8 = i & 1;
            if ((i & 4) == 0) {
                xe3 xe3Var = ze3Var.a;
                if (i8 != 0) {
                    xe3.c(xe3Var.d, lt2Var, ri0Var, xe3Var.b);
                } else {
                    xe3Var.d = xe3.c(xe3Var.d, lt2Var, ri0Var, xe3Var.b);
                    ze3Var.r++;
                }
            } else if (i8 == 0) {
                ze3Var.r++;
            }
        }
        if (i2 == -3) {
            qe3Var.p(i4);
        }
        return i2;
    }

    @Override // defpackage.af3
    public final boolean c() {
        qe3 qe3Var = this.b;
        return !qe3Var.q() && qe3Var.w[this.a].j(qe3Var.Q);
    }

    /* JADX WARN: Code duplicated, block: B:38:0x005c  */
    @Override // defpackage.af3
    public final int f(long j) {
        boolean z;
        int iF;
        qe3 qe3Var = this.b;
        int i = this.a;
        if (qe3Var.q()) {
            return 0;
        }
        qe3Var.n(i);
        ze3 ze3Var = qe3Var.w[i];
        boolean z2 = qe3Var.Q;
        synchronized (ze3Var) {
            int i2 = ze3Var.r;
            int iH = ze3Var.h(i2);
            int i3 = ze3Var.r;
            int i4 = ze3Var.o;
            z = true;
            if ((i3 != i4) && j >= ze3Var.m[iH]) {
                if (j <= ze3Var.u || !z2) {
                    iF = ze3Var.f(iH, i4 - i2, j, true);
                    if (iF == -1) {
                    }
                } else {
                    iF = i4 - i2;
                }
            }
            iF = 0;
        }
        synchronized (ze3Var) {
            if (iF >= 0) {
                try {
                    if (ze3Var.r + iF > ze3Var.o) {
                        z = false;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            } else {
                z = false;
            }
            hn.v(z);
            ze3Var.r += iF;
        }
        if (iF != 0) {
            return iF;
        }
        qe3Var.p(i);
        return 0;
    }

    @Override // defpackage.af3
    public final void h() throws IOException {
        IOException iOException;
        int i = this.a;
        qe3 qe3Var = this.b;
        s62 s62Var = qe3Var.w[i].g;
        if (s62Var != null) {
            throw ((vb3) s62Var.f);
        }
        int i2 = qe3Var.G == 7 ? 6 : 3;
        p83 p83Var = qe3Var.o;
        IOException iOException2 = (IOException) p83Var.i;
        if (iOException2 != null) {
            throw iOException2;
        }
        mg3 mg3Var = (mg3) p83Var.h;
        if (mg3Var != null && (iOException = mg3Var.h) != null && mg3Var.i > i2) {
            throw iOException;
        }
    }
}
