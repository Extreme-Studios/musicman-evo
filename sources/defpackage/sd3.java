package defpackage;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class sd3 extends od3 {
    public static final Object e = new Object();
    public final Object c;
    public final Object d;

    public sd3(ox0 ox0Var, Object obj, Object obj2) {
        super(ox0Var);
        this.c = obj;
        this.d = obj2;
    }

    @Override // defpackage.od3, defpackage.ox0
    public final ex0 b(int i, ex0 ex0Var, long j) {
        this.b.b(i, ex0Var, j);
        if (Objects.equals(ex0Var.a, this.c)) {
            ex0Var.a = ex0.m;
        }
        return ex0Var;
    }

    @Override // defpackage.od3, defpackage.ox0
    public final su0 d(int i, su0 su0Var, boolean z) {
        this.b.d(i, su0Var, z);
        if (Objects.equals(su0Var.b, this.d) && z) {
            su0Var.b = e;
        }
        return su0Var;
    }

    @Override // defpackage.od3, defpackage.ox0
    public final int e(Object obj) {
        Object obj2;
        if (e == obj && (obj2 = this.d) != null) {
            obj = obj2;
        }
        return this.b.e(obj);
    }

    @Override // defpackage.od3, defpackage.ox0
    public final Object f(int i) {
        Object objF = this.b.f(i);
        return Objects.equals(objF, this.d) ? e : objF;
    }
}
