package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ti1 implements r63 {
    public final /* synthetic */ int a;
    public final p83 b;

    public /* synthetic */ ti1(p83 p83Var, int i) {
        this.a = i;
        this.b = p83Var;
    }

    public x42 a() {
        x42 x42Var = (x42) this.b.h;
        dq.D(x42Var);
        return x42Var;
    }

    public e52 b() {
        e52 e52Var = (e52) this.b.g;
        dq.D(e52Var);
        return e52Var;
    }

    @Override // defpackage.v63
    public final Object c() {
        int i = this.a;
        p83 p83Var = this.b;
        switch (i) {
            case 0:
                x42 x42Var = (x42) p83Var.h;
                dq.D(x42Var);
                return x42Var;
            case 1:
                return (String) p83Var.i;
            case 2:
                return p83Var.v();
            default:
                e52 e52Var = (e52) p83Var.g;
                dq.D(e52Var);
                return e52Var;
        }
    }
}
