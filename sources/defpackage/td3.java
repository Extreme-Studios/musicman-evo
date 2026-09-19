package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class td3 extends ox0 {
    public final li0 b;

    public td3(li0 li0Var) {
        this.b = li0Var;
    }

    @Override // defpackage.ox0
    public final int a() {
        return 1;
    }

    @Override // defpackage.ox0
    public final ex0 b(int i, ex0 ex0Var, long j) {
        Object obj = ex0.m;
        ex0Var.a(this.b, false, true, null, -9223372036854775807L);
        ex0Var.i = true;
        return ex0Var;
    }

    @Override // defpackage.ox0
    public final int c() {
        return 1;
    }

    @Override // defpackage.ox0
    public final su0 d(int i, su0 su0Var, boolean z) {
        Integer num = z ? 0 : null;
        Object obj = z ? sd3.e : null;
        l91 l91Var = l91.b;
        su0Var.a(num, obj, 0, -9223372036854775807L, true);
        return su0Var;
    }

    @Override // defpackage.ox0
    public final int e(Object obj) {
        return obj == sd3.e ? 0 : -1;
    }

    @Override // defpackage.ox0
    public final Object f(int i) {
        return sd3.e;
    }
}
