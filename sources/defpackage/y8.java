package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class y8 implements hl {
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;

    public /* synthetic */ y8(dt dtVar, ct ctVar) {
        this.f = 1;
        this.g = dtVar;
    }

    @Override // defpackage.hl
    public final Object e(Object obj, Object obj2, Object obj3) {
        int i = this.f;
        k50 k50Var = k50.a;
        Object obj4 = this.g;
        switch (i) {
            case 0:
                ((g) obj4).h((Throwable) obj);
                break;
            case 1:
                dt dtVar = (dt) obj4;
                dt.g.set(dtVar, null);
                dtVar.d(null);
                break;
            default:
                ((oz) obj4).b();
                break;
        }
        return k50Var;
    }

    public /* synthetic */ y8(int i, Object obj) {
        this.f = i;
        this.g = obj;
    }
}
