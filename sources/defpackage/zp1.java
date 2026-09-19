package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zp1 implements xm2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ pm2 b;

    public /* synthetic */ zp1(pm2 pm2Var, int i) {
        this.a = i;
        this.b = pm2Var;
    }

    @Override // defpackage.xm2
    public final hp b(Object obj) throws ky1 {
        int i = this.a;
        pm2 pm2Var = this.b;
        md1 md1Var = (md1) obj;
        switch (i) {
            case 0:
                if (md1Var != null) {
                    return pm2Var;
                }
                throw new ky1("Retrieve Web View from image ad response failed.", 1);
            default:
                if (md1Var == null || md1Var.f() == null) {
                    throw new ky1("Retrieve video view in html5 ad response failed.", 1);
                }
                return pm2Var;
        }
    }
}
