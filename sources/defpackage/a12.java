package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a12 implements Runnable {
    public final /* synthetic */ int f;
    public final /* synthetic */ b12 g;

    public /* synthetic */ a12(b12 b12Var, int i) {
        this.f = i;
        this.g = b12Var;
    }

    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        int i = this.f;
        b12 b12Var = this.g;
        switch (i) {
            case 0:
                b12Var.a.set(new z02(b12Var.e.a(), b12Var.f, b12Var.c));
                break;
            default:
                b12Var.d.execute(new a12(b12Var, 0));
                break;
        }
    }
}
