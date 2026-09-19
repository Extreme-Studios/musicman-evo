package defpackage;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class j82 extends mu0 {
    public final /* synthetic */ tn2 f;
    public final /* synthetic */ ab2 g;
    public final /* synthetic */ k82 h;

    public j82(k82 k82Var, tn2 tn2Var, ab2 ab2Var) {
        this.f = tn2Var;
        this.g = ab2Var;
        this.h = k82Var;
    }

    @Override // defpackage.nu0
    public final void W(fu1 fu1Var) {
        String string = fu1Var.b().toString();
        String str = this.g.f;
        StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 60 + String.valueOf(str).length());
        sb.append("Failed to load app open ad with error parcel: ");
        sb.append(string);
        sb.append(" for ad unit: ");
        sb.append(str);
        jn.T(sb.toString());
        k82 k82Var = this.h;
        Objects.requireNonNull(k82Var);
        k82Var.q(fu1Var);
    }

    @Override // defpackage.nu0
    public final void e3(ku0 ku0Var) {
        Objects.requireNonNull(this.h);
        this.f.d(ku0Var);
    }

    @Override // defpackage.nu0
    public final void H(int i) {
    }
}
