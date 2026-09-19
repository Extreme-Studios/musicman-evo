package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class pg3 implements Runnable {
    public final /* synthetic */ int f;
    public final /* synthetic */ us2 g;

    public /* synthetic */ pg3(us2 us2Var, i61 i61Var) {
        this.f = 2;
        this.g = us2Var;
    }

    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        int i = this.f;
        us2 us2Var = this.g;
        switch (i) {
            case 0:
                ((ob0) us2Var.h).h.c();
                break;
            case 1:
                ((ob0) us2Var.h).h.h();
                break;
            default:
                ((ob0) us2Var.h).h.getClass();
                break;
        }
    }

    public /* synthetic */ pg3(us2 us2Var, int i) {
        this.f = i;
        this.g = us2Var;
    }
}
