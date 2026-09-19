package defpackage;

import java.io.IOException;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class jd3 implements ge3, yb3 {
    public final Object f;
    public xb3 g;
    public xb3 h;
    public final /* synthetic */ ld3 i;

    public jd3(ld3 ld3Var, Object obj) {
        this.i = ld3Var;
        yd3 yd3Var = null;
        this.g = new xb3(ld3Var.c.b, yd3Var);
        this.h = new xb3(ld3Var.d.b, yd3Var);
        this.f = obj;
    }

    public final boolean a(yd3 yd3Var) {
        yd3 yd3VarV;
        Object obj = this.f;
        ld3 ld3Var = this.i;
        if (yd3Var != null) {
            yd3VarV = ld3Var.v(obj, yd3Var);
            if (yd3VarV == null) {
                return false;
            }
        } else {
            yd3VarV = null;
        }
        ld3Var.u(obj);
        xb3 xb3Var = this.g;
        xb3Var.getClass();
        if (!Objects.equals(xb3Var.a, yd3VarV)) {
            this.g = new xb3(ld3Var.c.b, yd3VarV);
        }
        xb3 xb3Var2 = this.h;
        xb3Var2.getClass();
        if (Objects.equals(xb3Var2.a, yd3VarV)) {
            return true;
        }
        this.h = new xb3(ld3Var.d.b, yd3VarV);
        return true;
    }

    public final void b(vd3 vd3Var, yd3 yd3Var) {
        long j = vd3Var.c;
        ld3 ld3Var = this.i;
        Object obj = this.f;
        ld3Var.w(j, obj);
        ld3Var.w(vd3Var.d, obj);
    }

    @Override // defpackage.ge3
    public final void j(int i, yd3 yd3Var, qd3 qd3Var, vd3 vd3Var) {
        if (a(yd3Var)) {
            xb3 xb3Var = this.g;
            b(vd3Var, yd3Var);
            xb3Var.getClass();
            xb3Var.a(new hb3(xb3Var, qd3Var, vd3Var));
        }
    }

    @Override // defpackage.ge3
    public final void m(int i, yd3 yd3Var, qd3 qd3Var, vd3 vd3Var, int i2) {
        if (a(yd3Var)) {
            xb3 xb3Var = this.g;
            b(vd3Var, yd3Var);
            xb3Var.getClass();
            xb3Var.a(new g2(xb3Var, qd3Var, vd3Var, i2));
        }
    }

    @Override // defpackage.ge3
    public final void o(int i, yd3 yd3Var, qd3 qd3Var, vd3 vd3Var, IOException iOException, boolean z) {
        if (a(yd3Var)) {
            xb3 xb3Var = this.g;
            b(vd3Var, yd3Var);
            xb3Var.getClass();
            xb3Var.a(new db2(xb3Var, qd3Var, vd3Var, iOException, z));
        }
    }

    @Override // defpackage.ge3
    public final void p(int i, yd3 yd3Var, vd3 vd3Var) {
        if (a(yd3Var)) {
            xb3 xb3Var = this.g;
            b(vd3Var, yd3Var);
            xb3Var.getClass();
            xb3Var.a(new fe3(xb3Var, vd3Var));
        }
    }

    @Override // defpackage.ge3
    public final void r(int i, yd3 yd3Var, qd3 qd3Var, vd3 vd3Var) {
        if (a(yd3Var)) {
            xb3 xb3Var = this.g;
            b(vd3Var, yd3Var);
            xb3Var.getClass();
            xb3Var.a(new dy2(xb3Var, qd3Var, vd3Var));
        }
    }
}
