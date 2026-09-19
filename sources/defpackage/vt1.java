package defpackage;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class vt1 extends i8 {
    public final /* synthetic */ int C;
    public final /* synthetic */ String D;
    public final /* synthetic */ xt1 E;

    public vt1(xt1 xt1Var, String str, int i) {
        this.C = i;
        switch (i) {
            case 1:
                this.D = str;
                Objects.requireNonNull(xt1Var);
                this.E = xt1Var;
                break;
            default:
                this.D = str;
                Objects.requireNonNull(xt1Var);
                this.E = xt1Var;
                break;
        }
    }

    @Override // defpackage.i8
    public final void n(np npVar) {
        int i = this.C;
        xt1 xt1Var = this.E;
        switch (i) {
            case 0:
                xt1Var.C3(xt1.F3(npVar));
                break;
            default:
                xt1Var.C3(xt1.F3(npVar));
                break;
        }
    }

    @Override // defpackage.i8
    public final /* bridge */ /* synthetic */ void o(Object obj) {
        switch (this.C) {
            case 0:
                String str = this.D;
                this.E.B3((u81) obj, str);
                break;
            default:
                String str2 = this.D;
                this.E.B3((c91) obj, str2);
                break;
        }
    }
}
