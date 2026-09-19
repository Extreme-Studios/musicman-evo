package defpackage;

import java.nio.ByteBuffer;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class ab1 {
    public final vj2 a;
    public final ArrayList b = new ArrayList();
    public ByteBuffer[] c = new ByteBuffer[0];
    public boolean d;

    public ab1(vj2 vj2Var) {
        this.a = vj2Var;
        nb1 nb1Var = nb1.e;
        this.d = false;
    }

    public final nb1 a(nb1 nb1Var) {
        nb1 nb1Var2 = nb1.e;
        if (nb1Var.equals(nb1Var2)) {
            throw new jc1("Unhandled input format:", nb1Var);
        }
        int i = 0;
        while (true) {
            vj2 vj2Var = this.a;
            if (i >= vj2Var.size()) {
                return nb1Var;
            }
            cd1 cd1Var = (cd1) vj2Var.get(i);
            nb1 nb1VarA = cd1Var.a(nb1Var);
            if (cd1Var.h()) {
                hn.M(!nb1VarA.equals(nb1Var2));
                nb1Var = nb1VarA;
            }
            i++;
        }
    }

    public final void b(zb1 zb1Var) {
        ArrayList arrayList = this.b;
        arrayList.clear();
        this.d = false;
        long jF = zb1Var.a;
        int i = 0;
        while (true) {
            vj2 vj2Var = this.a;
            if (i >= vj2Var.size()) {
                break;
            }
            cd1 cd1Var = (cd1) vj2Var.get(i);
            new zb1(jF);
            cd1Var.j();
            if (cd1Var.h()) {
                jF = cd1Var.f(jF);
                hn.M(jF >= 0);
                arrayList.add(cd1Var);
            }
            i++;
        }
        this.c = new ByteBuffer[arrayList.size()];
        for (int i2 = 0; i2 <= f(); i2++) {
            this.c[i2] = ((cd1) arrayList.get(i2)).d();
        }
    }

    public final boolean c() {
        return !this.b.isEmpty();
    }

    public final boolean d() {
        return this.d && ((cd1) this.b.get(f())).e() && !this.c[f()].hasRemaining();
    }

    public final void e(ByteBuffer byteBuffer) {
        boolean z;
        do {
            z = false;
            for (int i = 0; i <= f(); i++) {
                if (!this.c[i].hasRemaining()) {
                    ArrayList arrayList = this.b;
                    cd1 cd1Var = (cd1) arrayList.get(i);
                    if (!cd1Var.e()) {
                        ByteBuffer byteBuffer2 = i > 0 ? this.c[i - 1] : byteBuffer.hasRemaining() ? byteBuffer : cd1.a;
                        long jRemaining = byteBuffer2.remaining();
                        cd1Var.c(byteBuffer2);
                        this.c[i] = cd1Var.d();
                        boolean z2 = true;
                        if (jRemaining - ((long) byteBuffer2.remaining()) <= 0 && !this.c[i].hasRemaining()) {
                            z2 = false;
                        }
                        z |= z2;
                    } else if (!this.c[i].hasRemaining() && i < f()) {
                        ((cd1) arrayList.get(i + 1)).b();
                    }
                }
            }
        } while (z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ab1)) {
            return false;
        }
        vj2 vj2Var = this.a;
        int size = vj2Var.size();
        vj2 vj2Var2 = ((ab1) obj).a;
        if (size != vj2Var2.size()) {
            return false;
        }
        for (int i = 0; i < vj2Var.size(); i++) {
            if (vj2Var.get(i) != vj2Var2.get(i)) {
                return false;
            }
        }
        return true;
    }

    public final int f() {
        return this.c.length - 1;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
