package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ys1 extends n81 {
    public final /* synthetic */ zs1 f;

    public ys1(zs1 zs1Var) {
        this.f = zs1Var;
    }

    @Override // defpackage.o81
    public final void W0(i81 i81Var) {
        zs1 zs1Var = this.f;
        kc2 kc2Var = zs1Var.b;
        long j = zs1Var.a;
        es0 es0Var = new es0("rewarded");
        es0Var.f = Long.valueOf(j);
        es0Var.h = "onUserEarnedReward";
        es0Var.j = i81Var.b();
        es0Var.k = Integer.valueOf(i81Var.d());
        kc2Var.r(es0Var);
    }

    @Override // defpackage.o81
    public final void b() {
        zs1 zs1Var = this.f;
        kc2 kc2Var = zs1Var.b;
        long j = zs1Var.a;
        es0 es0Var = new es0("rewarded");
        es0Var.f = Long.valueOf(j);
        es0Var.h = "onRewardedAdOpened";
        kc2Var.r(es0Var);
    }

    @Override // defpackage.o81
    public final void d() {
        zs1 zs1Var = this.f;
        kc2 kc2Var = zs1Var.b;
        long j = zs1Var.a;
        es0 es0Var = new es0("rewarded");
        es0Var.f = Long.valueOf(j);
        es0Var.h = "onRewardedAdClosed";
        kc2Var.r(es0Var);
    }

    @Override // defpackage.o81
    public final void g() {
        zs1 zs1Var = this.f;
        kc2 kc2Var = zs1Var.b;
        long j = zs1Var.a;
        es0 es0Var = new es0("rewarded");
        es0Var.f = Long.valueOf(j);
        es0Var.h = "onAdImpression";
        kc2Var.r(es0Var);
    }

    @Override // defpackage.o81
    public final void k() {
        zs1 zs1Var = this.f;
        kc2 kc2Var = zs1Var.b;
        long j = zs1Var.a;
        es0 es0Var = new es0("rewarded");
        es0Var.f = Long.valueOf(j);
        es0Var.h = "onAdClicked";
        kc2Var.r(es0Var);
    }

    @Override // defpackage.o81
    public final void u2(fu1 fu1Var) {
        zs1 zs1Var = this.f;
        kc2 kc2Var = zs1Var.b;
        long j = zs1Var.a;
        int i = fu1Var.f;
        es0 es0Var = new es0("rewarded");
        es0Var.f = Long.valueOf(j);
        es0Var.h = "onRewardedAdFailedToShow";
        es0Var.i = Integer.valueOf(i);
        kc2Var.r(es0Var);
    }

    @Override // defpackage.o81
    public final void z(int i) {
        zs1 zs1Var = this.f;
        kc2 kc2Var = zs1Var.b;
        long j = zs1Var.a;
        es0 es0Var = new es0("rewarded");
        es0Var.f = Long.valueOf(j);
        es0Var.h = "onRewardedAdFailedToShow";
        es0Var.i = Integer.valueOf(i);
        kc2Var.r(es0Var);
    }
}
