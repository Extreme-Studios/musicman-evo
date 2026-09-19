package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class wc2 implements v63 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ wc2(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.v63
    public final /* synthetic */ Object c() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return new gv1(8, (hm1) ((hm1) obj).a);
            case 1:
                return new w32(3, (hm1) ((hm1) obj).a);
            case 2:
                return new j52((hm1) ((hm1) obj).a);
            default:
                y91 y91Var = (y91) obj;
                return new mx0((hm1) y91Var.g, (y91) y91Var.j);
        }
    }
}
