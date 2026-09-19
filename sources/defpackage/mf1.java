package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class mf1 {
    public final /* synthetic */ int a;
    public final if1 b;
    public k42 c;
    public y32 d;
    public im1 e;
    public uj1 f;

    public /* synthetic */ mf1(if1 if1Var, int i) {
        this.a = i;
        this.b = if1Var;
    }

    public nf1 a() {
        dq.F(this.e, im1.class);
        dq.F(this.f, uj1.class);
        return new nf1(this.b, new fl1(17), this.e, this.f, new zy1(29, false), this.c, this.d);
    }

    public wf1 b() {
        dq.F(this.e, im1.class);
        dq.F(this.f, uj1.class);
        return new wf1(this.b, new fl1(17), this.e, this.f, new zy1(29, false), this.c, this.d);
    }

    public final /* bridge */ Object c() {
        switch (this.a) {
            case 0:
                return a();
            default:
                return b();
        }
    }
}
