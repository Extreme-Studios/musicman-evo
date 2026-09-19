package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class jb1 implements Runnable {
    public final /* synthetic */ int f;
    public final /* synthetic */ int g;
    public final /* synthetic */ int h;
    public final /* synthetic */ lb1 i;

    public /* synthetic */ jb1(lb1 lb1Var, int i, int i2, int i3) {
        this.f = i3;
        this.g = i;
        this.h = i2;
        this.i = lb1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f;
        int i2 = this.h;
        int i3 = this.g;
        lb1 lb1Var = this.i;
        switch (i) {
            case 0:
                pb1 pb1Var = ((kb1) lb1Var).v;
                if (pb1Var != null) {
                    pb1Var.j(i3, i2);
                }
                break;
            default:
                pb1 pb1Var2 = ((bc1) lb1Var).l;
                if (pb1Var2 != null) {
                    pb1Var2.j(i3, i2);
                }
                break;
        }
    }
}
