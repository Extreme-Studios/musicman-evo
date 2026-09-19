package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class g41 implements xm2 {
    public final /* synthetic */ int a;
    public final hp b;

    public /* synthetic */ g41(int i, hp hpVar) {
        this.a = i;
        this.b = hpVar;
    }

    @Override // defpackage.xm2
    public final hp b(Object obj) {
        int i = this.a;
        hp hpVar = this.b;
        switch (i) {
            case 0:
                return na1.L(hpVar, new yy0(this, 2, obj), za1.g);
            default:
                return hpVar;
        }
    }
}
