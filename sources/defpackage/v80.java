package defpackage;

import android.os.Build;
import android.view.View;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class v80 {
    public static final y80 b;
    public final y80 a;

    static {
        n80 j80Var;
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            j80Var = new m80();
        } else if (i >= 31) {
            j80Var = new l80();
        } else if (i >= 30) {
            j80Var = new k80();
        } else {
            j80Var = i >= 29 ? new j80() : new h80();
        }
        b = j80Var.b().a.a().a.b().a.c();
    }

    public v80(y80 y80Var) {
        this.a = y80Var;
    }

    public y80 a() {
        return this.a;
    }

    public y80 b() {
        return this.a;
    }

    public y80 c() {
        return this.a;
    }

    public kf e() {
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v80)) {
            return false;
        }
        v80 v80Var = (v80) obj;
        return n() == v80Var.n() && m() == v80Var.m() && Objects.equals(j(), v80Var.j()) && Objects.equals(h(), v80Var.h()) && Objects.equals(e(), v80Var.e());
    }

    public gn f(int i) {
        return gn.e;
    }

    public gn g() {
        return j();
    }

    public gn h() {
        return gn.e;
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(n()), Boolean.valueOf(m()), j(), h(), e());
    }

    public gn i() {
        return j();
    }

    public gn j() {
        return gn.e;
    }

    public gn k() {
        return j();
    }

    public y80 l(int i, int i2, int i3, int i4) {
        return b;
    }

    public boolean m() {
        return false;
    }

    public boolean n() {
        return false;
    }

    public void d(View view) {
    }

    public void o(gn[] gnVarArr) {
    }

    public void p(y80 y80Var) {
    }

    public void q(gn gnVar) {
    }

    public void r(int i) {
    }
}
