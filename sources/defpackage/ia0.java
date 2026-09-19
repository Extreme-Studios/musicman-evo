package defpackage;

import android.os.SystemClock;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes.dex */
public final class ia0 implements vu {
    public final dm f;
    public final int g;
    public final z3 h;
    public final long i;
    public final long j;

    public ia0(dm dmVar, int i, z3 z3Var, long j, long j2) {
        this.f = dmVar;
        this.g = i;
        this.h = z3Var;
        this.i = j;
        this.j = j2;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0031 A[RETURN] */
    public static eb a(z90 z90Var, a8 a8Var, int i) {
        w73 w73Var = a8Var.v;
        eb ebVar = w73Var == null ? null : w73Var.i;
        if (ebVar != null && ebVar.g) {
            int[] iArr = ebVar.i;
            int i2 = 0;
            if (iArr == null) {
                int[] iArr2 = ebVar.k;
                if (iArr2 != null) {
                    while (i2 < iArr2.length) {
                        if (iArr2[i2] != i) {
                            i2++;
                        }
                    }
                    if (z90Var.q < ebVar.j) {
                        return ebVar;
                    }
                } else if (z90Var.q < ebVar.j) {
                    return ebVar;
                }
            } else {
                while (i2 < iArr.length) {
                    if (iArr[i2] != i) {
                        i2++;
                    } else if (z90Var.q < ebVar.j) {
                        return ebVar;
                    }
                }
            }
        }
        return null;
    }

    @Override // defpackage.vu
    public final void g(ve3 ve3Var) {
        int i;
        int i2;
        int i3;
        int i4;
        long j;
        long j2;
        int iElapsedRealtime;
        if (this.f.a()) {
            ay ayVar = (ay) zx.o().g;
            if (ayVar == null || ayVar.g) {
                z90 z90Var = (z90) this.f.o.get(this.h);
                if (z90Var != null) {
                    Object obj = z90Var.g;
                    if (obj instanceof a8) {
                        a8 a8Var = (a8) obj;
                        int i5 = 0;
                        boolean z = this.i > 0;
                        int i6 = a8Var.q;
                        if (ayVar != null) {
                            z &= ayVar.h;
                            int i7 = ayVar.i;
                            int i8 = ayVar.j;
                            i = ayVar.f;
                            if (a8Var.v != null && !a8Var.e()) {
                                eb ebVarA = a(z90Var, a8Var, this.g);
                                if (ebVarA == null) {
                                    return;
                                }
                                boolean z2 = ebVarA.h && this.i > 0;
                                i8 = ebVarA.j;
                                z = z2;
                            }
                            i3 = i7;
                            i2 = i8;
                        } else {
                            i = 0;
                            i2 = 100;
                            i3 = 5000;
                        }
                        dm dmVar = this.f;
                        if (ve3Var.c()) {
                            i4 = 0;
                        } else {
                            if (ve3Var.d) {
                                i4 = 100;
                            } else {
                                Exception excA = ve3Var.a();
                                if (excA instanceof v3) {
                                    Status status = ((v3) excA).f;
                                    int i9 = status.f;
                                    db dbVar = status.i;
                                    i5 = dbVar == null ? -1 : dbVar.g;
                                    i4 = i9;
                                } else {
                                    i4 = 101;
                                }
                            }
                            i5 = -1;
                        }
                        if (z) {
                            long j3 = this.i;
                            long jCurrentTimeMillis = System.currentTimeMillis();
                            iElapsedRealtime = (int) (SystemClock.elapsedRealtime() - this.j);
                            j2 = jCurrentTimeMillis;
                            j = j3;
                        } else {
                            j = 0;
                            j2 = 0;
                            iElapsedRealtime = -1;
                        }
                        za0 za0Var = dmVar.r;
                        za0Var.sendMessage(za0Var.obtainMessage(18, new ja0(new os(this.g, i4, i5, j, j2, null, null, i6, iElapsedRealtime), i, i3, i2)));
                    }
                }
            }
        }
    }
}
