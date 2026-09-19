package defpackage;

import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class vs1 extends l01 {
    public final /* synthetic */ kc2 f;
    public final /* synthetic */ ws1 g;

    public vs1(ws1 ws1Var, kc2 kc2Var) {
        this.f = kc2Var;
        this.g = ws1Var;
    }

    @Override // defpackage.b11
    public final void H(int i) {
        long j = this.g.a;
        es0 es0Var = new es0("interstitial");
        es0Var.f = Long.valueOf(j);
        es0Var.h = "onAdFailedToLoad";
        es0Var.i = Integer.valueOf(i);
        this.f.r(es0Var);
    }

    @Override // defpackage.b11
    public final void W(fu1 fu1Var) {
        long j = this.g.a;
        int i = fu1Var.f;
        es0 es0Var = new es0("interstitial");
        es0Var.f = Long.valueOf(j);
        es0Var.h = "onAdFailedToLoad";
        es0Var.i = Integer.valueOf(i);
        this.f.r(es0Var);
    }

    @Override // defpackage.b11
    public final void d() {
        long j = this.g.a;
        es0 es0Var = new es0("interstitial");
        es0Var.f = Long.valueOf(j);
        es0Var.h = "onAdLoaded";
        this.f.r(es0Var);
    }

    @Override // defpackage.b11
    public final void e() {
        long j = this.g.a;
        es0 es0Var = new es0("interstitial");
        es0Var.f = Long.valueOf(j);
        es0Var.h = "onAdOpened";
        this.f.r(es0Var);
    }

    @Override // defpackage.b11
    public final void f() {
        long j = this.g.a;
        es0 es0Var = new es0("interstitial");
        es0Var.f = Long.valueOf(j);
        es0Var.h = "onAdClicked";
        String strI = es0Var.i();
        j21 j21Var = (j21) this.f.g;
        Parcel parcelU = j21Var.U();
        parcelU.writeString(strI);
        j21Var.K0(parcelU, 1);
    }

    @Override // defpackage.b11
    public final void y() {
        long j = this.g.a;
        es0 es0Var = new es0("interstitial");
        es0Var.f = Long.valueOf(j);
        es0Var.h = "onAdClosed";
        this.f.r(es0Var);
    }

    @Override // defpackage.b11
    public final void b() {
    }

    @Override // defpackage.b11
    public final void g() {
    }

    @Override // defpackage.b11
    public final void j() {
    }
}
