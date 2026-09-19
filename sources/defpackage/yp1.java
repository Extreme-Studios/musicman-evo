package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class yp1 implements xm2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ kb3 b;
    public final /* synthetic */ x42 c;
    public final /* synthetic */ z42 d;
    public final /* synthetic */ vs0 e;
    public final /* synthetic */ d91 f;
    public final /* synthetic */ String g;
    public final /* synthetic */ String h;
    public final /* synthetic */ Object i;

    public /* synthetic */ yp1(Object obj, kb3 kb3Var, x42 x42Var, z42 z42Var, vs0 vs0Var, d91 d91Var, String str, String str2, int i) {
        this.a = i;
        this.i = obj;
        this.b = kb3Var;
        this.c = x42Var;
        this.d = z42Var;
        this.e = vs0Var;
        this.f = d91Var;
        this.g = str;
        this.h = str2;
    }

    @Override // defpackage.xm2
    public final hp b(Object obj) {
        os1 os1Var;
        switch (this.a) {
            case 0:
                aq1 aq1Var = (aq1) this.i;
                kb3 kb3Var = this.b;
                x42 x42Var = this.c;
                z42 z42Var = this.d;
                vs0 vs0Var = this.e;
                d91 d91Var = this.f;
                String str = this.g;
                String str2 = this.h;
                md1 md1VarA = aq1Var.j.a(kb3Var, x42Var, z42Var);
                yu0 yu0Var = new yu0(md1VarA);
                vq1 vq1Var = aq1Var.l.a;
                he1 he1VarE0 = md1VarA.e0();
                ix0 ix0Var = lx0.pe;
                tu0 tu0Var = tu0.e;
                he1VarE0.p(vq1Var, vq1Var, vq1Var, vq1Var, vq1Var, false, null, !((Boolean) tu0Var.c.a(ix0Var)).booleanValue() ? new vs0(aq1Var.a, null) : vs0Var, null, true != ((Boolean) tu0Var.c.a(ix0Var)).booleanValue() ? null : d91Var, aq1Var.o, aq1Var.n, aq1Var.m, null, vq1Var, null, null, null, null, null, null);
                md1VarA.t0("/getNativeAdViewSignals", u11.n);
                md1VarA.t0("/getNativeClickMeta", u11.o);
                if (((Boolean) tu0Var.c.a(lx0.l8)).booleanValue()) {
                    if (((Boolean) tu0Var.c.a(lx0.n8)).booleanValue() && (os1Var = aq1Var.s) != null) {
                        md1VarA.t0("/onDeviceStorageEvent", new i11(3, os1Var));
                    }
                }
                he1 he1VarE1 = md1VarA.e0();
                synchronized (he1VarE1.i) {
                    he1VarE1.x = true;
                    break;
                }
                md1VarA.e0().l = new zy1(24, yu0Var);
                md1VarA.H0(str, str2);
                return yu0Var;
            default:
                hq1 hq1Var = (hq1) this.i;
                kb3 kb3Var2 = this.b;
                x42 x42Var2 = this.c;
                z42 z42Var2 = this.d;
                vs0 vs0Var2 = this.e;
                d91 d91Var2 = this.f;
                String str3 = this.g;
                String str4 = this.h;
                md1 md1VarA2 = hq1Var.c.a(kb3Var2, x42Var2, z42Var2);
                yu0 yu0Var2 = new yu0(md1VarA2);
                if (hq1Var.a.b != null) {
                    hq1Var.a(md1VarA2, vs0Var2, d91Var2);
                    md1VarA2.W(new eg(5, 0, 0));
                } else {
                    vq1 vq1Var2 = hq1Var.d.a;
                    he1 he1VarE2 = md1VarA2.e0();
                    ix0 ix0Var2 = lx0.pe;
                    tu0 tu0Var2 = tu0.e;
                    he1VarE2.p(vq1Var2, vq1Var2, vq1Var2, vq1Var2, vq1Var2, false, null, !((Boolean) tu0Var2.c.a(ix0Var2)).booleanValue() ? new vs0(hq1Var.e, null) : vs0Var2, null, true != ((Boolean) tu0Var2.c.a(ix0Var2)).booleanValue() ? null : d91Var2, hq1Var.h, hq1Var.g, hq1Var.f, null, vq1Var2, null, null, null, null, hq1Var.j, null);
                    hq1.b(md1VarA2);
                }
                md1VarA2.e0().l = new r52(hq1Var, md1VarA2, yu0Var2, 17, false);
                md1VarA2.H0(str3, str4);
                return yu0Var2;
        }
    }
}
