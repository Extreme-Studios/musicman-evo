package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class xs1 extends r81 {
    public final /* synthetic */ zs1 f;

    public xs1(zs1 zs1Var) {
        this.f = zs1Var;
    }

    @Override // defpackage.s81
    public final void a(fu1 fu1Var) {
        zs1 zs1Var = this.f;
        kc2 kc2Var = zs1Var.b;
        long j = zs1Var.a;
        int i = fu1Var.f;
        es0 es0Var = new es0("rewarded");
        es0Var.f = Long.valueOf(j);
        es0Var.h = "onRewardedAdFailedToLoad";
        es0Var.i = Integer.valueOf(i);
        kc2Var.r(es0Var);
    }

    @Override // defpackage.s81
    public final void b() {
        zs1 zs1Var = this.f;
        kc2 kc2Var = zs1Var.b;
        long j = zs1Var.a;
        es0 es0Var = new es0("rewarded");
        es0Var.f = Long.valueOf(j);
        es0Var.h = "onRewardedAdLoaded";
        kc2Var.r(es0Var);
    }

    @Override // defpackage.s81
    public final void t(int i) {
        zs1 zs1Var = this.f;
        kc2 kc2Var = zs1Var.b;
        long j = zs1Var.a;
        es0 es0Var = new es0("rewarded");
        es0Var.f = Long.valueOf(j);
        es0Var.h = "onRewardedAdFailedToLoad";
        es0Var.i = Integer.valueOf(i);
        kc2Var.r(es0Var);
    }
}
