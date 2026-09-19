package defpackage;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class nd3 implements bf3 {
    public final qk2 f;
    public long g;

    public nd3(List list, List list2) {
        tj2 tj2Var = vj2.g;
        w40.k0("initialCapacity", 4);
        Object[] objArrCopyOf = new Object[4];
        int i = 0;
        hn.v(list.size() == list2.size());
        int i2 = 0;
        while (i < list.size()) {
            md3 md3Var = new md3((bf3) list.get(i), (List) list2.get(i));
            int length = objArrCopyOf.length;
            int i3 = i2 + 1;
            int iD = pj2.d(length, i3);
            if (iD > length) {
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, iD);
            }
            objArrCopyOf[i2] = md3Var;
            i++;
            i2 = i3;
        }
        this.f = vj2.o(objArrCopyOf, i2);
        this.g = -9223372036854775807L;
    }

    @Override // defpackage.bf3
    public final boolean b(f83 f83Var) {
        boolean zB;
        boolean z = false;
        do {
            long jI = i();
            if (jI == Long.MIN_VALUE) {
                break;
            }
            int i = 0;
            zB = false;
            while (true) {
                qk2 qk2Var = this.f;
                if (i >= qk2Var.i) {
                    break;
                }
                long jI2 = ((md3) qk2Var.get(i)).f.i();
                boolean z2 = jI2 != Long.MIN_VALUE && jI2 <= f83Var.a;
                if (jI2 == jI || z2) {
                    zB |= ((md3) qk2Var.get(i)).f.b(f83Var);
                }
                i++;
            }
            z |= zB;
        } while (zB);
        return z;
    }

    @Override // defpackage.bf3
    public final long i() {
        int i = 0;
        long jMin = Long.MAX_VALUE;
        while (true) {
            qk2 qk2Var = this.f;
            if (i >= qk2Var.i) {
                break;
            }
            long jI = ((md3) qk2Var.get(i)).f.i();
            if (jI != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jI);
            }
            i++;
        }
        if (jMin == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return jMin;
    }

    @Override // defpackage.bf3
    public final long j() {
        int i = 0;
        long jMin = Long.MAX_VALUE;
        long jMin2 = Long.MAX_VALUE;
        while (true) {
            qk2 qk2Var = this.f;
            if (i >= qk2Var.i) {
                break;
            }
            md3 md3Var = (md3) qk2Var.get(i);
            long j = md3Var.f.j();
            vj2 vj2Var = md3Var.g;
            if ((vj2Var.contains(1) || vj2Var.contains(2) || vj2Var.contains(4)) && j != Long.MIN_VALUE) {
                jMin = Math.min(jMin, j);
            }
            if (j != Long.MIN_VALUE) {
                jMin2 = Math.min(jMin2, j);
            }
            i++;
        }
        if (jMin != Long.MAX_VALUE) {
            this.g = jMin;
            return jMin;
        }
        if (jMin2 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        long j2 = this.g;
        return j2 != -9223372036854775807L ? j2 : jMin2;
    }

    @Override // defpackage.bf3
    public final void k(long j) {
        int i = 0;
        while (true) {
            qk2 qk2Var = this.f;
            if (i >= qk2Var.i) {
                return;
            }
            ((md3) qk2Var.get(i)).k(j);
            i++;
        }
    }

    @Override // defpackage.bf3
    public final boolean o() {
        int i = 0;
        while (true) {
            qk2 qk2Var = this.f;
            if (i >= qk2Var.i) {
                return false;
            }
            if (((md3) qk2Var.get(i)).f.o()) {
                return true;
            }
            i++;
        }
    }
}
