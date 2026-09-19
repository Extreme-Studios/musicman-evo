package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class s02 implements j22 {
    public final /* synthetic */ int a;
    public final Integer b;

    public /* synthetic */ s02(Integer num, int i) {
        this.a = i;
        this.b = num;
    }

    @Override // defpackage.j22
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        int i = this.a;
        Integer num = this.b;
        switch (i) {
            case 0:
                rj1 rj1Var = (rj1) obj;
                if (num != null) {
                    rj1Var.a.putInt("aos", num.intValue());
                }
                break;
            default:
                rj1 rj1Var2 = (rj1) obj;
                if (num != null) {
                    rj1Var2.a.putInt("dspct", Math.min(num.intValue(), 20));
                }
                break;
        }
    }
}
