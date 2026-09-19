package defpackage;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class ut1 extends y6 {
    public final /* synthetic */ String C;
    public final /* synthetic */ xt1 D;

    public ut1(xt1 xt1Var, String str) {
        this.C = str;
        Objects.requireNonNull(xt1Var);
        this.D = xt1Var;
    }

    @Override // defpackage.i8
    public final void n(np npVar) {
        this.D.C3(xt1.F3(npVar));
    }

    @Override // defpackage.i8
    public final /* bridge */ /* synthetic */ void o(Object obj) {
        String str = this.C;
        this.D.B3((in) obj, str);
    }
}
