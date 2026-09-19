package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class za2 implements oe2 {
    public final boolean f;
    public final ArrayList g = new ArrayList(1);
    public int h;
    public eg2 i;

    public za2(boolean z) {
        this.f = z;
    }

    public final void b(eg2 eg2Var) {
        for (int i = 0; i < this.h; i++) {
            ((qp2) this.g.get(i)).getClass();
        }
    }

    @Override // defpackage.oe2
    public final void c(qp2 qp2Var) {
        qp2Var.getClass();
        ArrayList arrayList = this.g;
        if (arrayList.contains(qp2Var)) {
            return;
        }
        arrayList.add(qp2Var);
        this.h++;
    }

    public final void e(eg2 eg2Var) {
        this.i = eg2Var;
        for (int i = 0; i < this.h; i++) {
            ((qp2) this.g.get(i)).e(this, eg2Var, this.f);
        }
    }

    public final void f(int i) {
        eg2 eg2Var = this.i;
        String str = qz1.a;
        for (int i2 = 0; i2 < this.h; i2++) {
            ((qp2) this.g.get(i2)).f(eg2Var, this.f, i);
        }
    }

    public final void j() {
        eg2 eg2Var = this.i;
        String str = qz1.a;
        for (int i = 0; i < this.h; i++) {
            ((qp2) this.g.get(i)).c(eg2Var, this.f);
        }
        this.i = null;
    }
}
