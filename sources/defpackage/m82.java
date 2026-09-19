package defpackage;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class m82 extends a21 {
    public final /* synthetic */ tn2 f;
    public final /* synthetic */ sz1 g;
    public final /* synthetic */ k82 h;

    public m82(k82 k82Var, tn2 tn2Var, sz1 sz1Var) {
        this.f = tn2Var;
        this.g = sz1Var;
        this.h = k82Var;
    }

    @Override // defpackage.m21
    public final void N(fu1 fu1Var) {
        String string = fu1Var.b().toString();
        k82 k82Var = this.h;
        String str = k82Var.e.f;
        StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 57 + String.valueOf(str).length());
        sb.append("Failed to load interstitial ad with error: ");
        sb.append(string);
        sb.append(" for ad unit: ");
        sb.append(str);
        jn.T(sb.toString());
        k82Var.q(fu1Var);
    }

    @Override // defpackage.m21
    public final void y() {
        Objects.requireNonNull(this.h);
        this.f.d(this.g);
    }
}
