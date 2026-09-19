package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class y81 extends r81 {
    public final /* synthetic */ int f;
    public final i8 g;
    public final Object h;

    public /* synthetic */ y81(i8 i8Var, Object obj, int i) {
        this.f = i;
        this.g = i8Var;
        this.h = obj;
    }

    @Override // defpackage.s81
    public final void a(fu1 fu1Var) {
        int i = this.f;
        i8 i8Var = this.g;
        switch (i) {
            case 0:
                vt1 vt1Var = (vt1) i8Var;
                if (vt1Var != null) {
                    vt1Var.n(fu1Var.b());
                }
                break;
            default:
                vt1 vt1Var2 = (vt1) i8Var;
                if (vt1Var2 != null) {
                    vt1Var2.n(fu1Var.b());
                }
                break;
        }
    }

    @Override // defpackage.s81
    public final void b() {
        c91 c91Var;
        int i = this.f;
        Object obj = this.h;
        i8 i8Var = this.g;
        switch (i) {
            case 0:
                vt1 vt1Var = (vt1) i8Var;
                if (vt1Var != null) {
                    vt1Var.o((u81) obj);
                }
                break;
            default:
                vt1 vt1Var2 = (vt1) i8Var;
                if (vt1Var2 != null && (c91Var = (c91) obj) != null) {
                    vt1Var2.o(c91Var);
                    break;
                }
                break;
        }
    }

    @Override // defpackage.s81
    public final void t(int i) {
        int i2 = this.f;
    }

    private final void B3(int i) {
    }

    private final void C3(int i) {
    }
}
