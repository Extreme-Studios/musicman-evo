package defpackage;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class v82 extends r81 {
    public final /* synthetic */ tn2 f;
    public final /* synthetic */ u42 g;
    public final /* synthetic */ k82 h;

    public v82(k82 k82Var, tn2 tn2Var, u42 u42Var) {
        this.f = tn2Var;
        this.g = u42Var;
        this.h = k82Var;
    }

    @Override // defpackage.s81
    public final void a(fu1 fu1Var) {
        String string = fu1Var.b().toString();
        k82 k82Var = this.h;
        String str = k82Var.e.f;
        StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 51 + String.valueOf(str).length());
        sb.append("Failed to load rewarded ad with error: ");
        sb.append(string);
        sb.append(", adUnitId: ");
        sb.append(str);
        jn.T(sb.toString());
        k82Var.q(fu1Var);
    }

    @Override // defpackage.s81
    public final void b() {
        Objects.requireNonNull(this.h);
        this.f.d(this.g);
    }

    @Override // defpackage.s81
    public final void t(int i) {
    }
}
