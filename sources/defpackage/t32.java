package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class t32 implements Runnable {
    public final /* synthetic */ int f;
    public final /* synthetic */ u32 g;

    public /* synthetic */ t32(u32 u32Var, int i) {
        this.f = i;
        this.g = u32Var;
    }

    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        int i = this.f;
        u32 u32Var = this.g;
        switch (i) {
            case 0:
                u32Var.f.b().execute(new t32(u32Var, 1));
                break;
            default:
                u32Var.B3(5);
                break;
        }
    }
}
