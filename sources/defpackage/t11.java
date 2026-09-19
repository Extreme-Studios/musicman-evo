package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class t11 implements xm2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ sg1 b;
    public final /* synthetic */ String c;

    public /* synthetic */ t11(sg1 sg1Var, String str, int i) {
        this.a = i;
        this.b = sg1Var;
        this.c = str;
    }

    @Override // defpackage.xm2
    public final hp b(Object obj) {
        int i = this.a;
        String str = this.c;
        sg1 sg1Var = this.b;
        switch (i) {
            case 0:
                String str2 = (String) obj;
                m11 m11Var = u11.a;
                return (((Boolean) tu0.e.c.a(lx0.Pa)).booleanValue() && sg1Var != null && sg1.b(str)) ? sg1Var.a(str2, ut0.f.e) : na1.t(str2);
            default:
                sg1Var.e.a(new rg1(sg1Var, (Throwable) obj, 1));
                return na1.t(str);
        }
    }
}
