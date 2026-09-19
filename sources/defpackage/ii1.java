package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ii1 implements r63 {
    public final /* synthetic */ int a;
    public final un1 b;

    public /* synthetic */ ii1(un1 un1Var, int i) {
        this.a = i;
        this.b = un1Var;
    }

    @Override // defpackage.v63
    public final Object c() {
        int i = this.a;
        un1 un1Var = this.b;
        switch (i) {
            case 0:
                am1 am1Var = (am1) un1Var.h;
                return am1Var != null ? new wm1(am1Var, za1.g) : new wm1(new hi1(), za1.g);
            default:
                return (am1) un1Var.h;
        }
    }
}
