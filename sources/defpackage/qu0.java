package defpackage;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class qu0 implements yt0 {
    public final /* synthetic */ int f = 0;
    public final /* synthetic */ Object g;

    public qu0(es0 es0Var) {
        Objects.requireNonNull(es0Var);
        this.g = es0Var;
    }

    @Override // defpackage.yt0
    public final void T(boolean z) {
        switch (this.f) {
            case 0:
                es0 es0Var = (es0) this.g;
                if (!z) {
                    es0Var.w();
                } else {
                    es0Var.C();
                }
                break;
            case 1:
                if (((Boolean) tu0.e.c.a(lx0.y)).booleanValue()) {
                    ((h82) this.g).b(z);
                }
                break;
            default:
                if (((Boolean) tu0.e.c.a(lx0.y)).booleanValue()) {
                    ((o82) this.g).c(z);
                }
                break;
        }
    }

    public qu0(h82 h82Var) {
        Objects.requireNonNull(h82Var);
        this.g = h82Var;
    }

    public qu0(o82 o82Var) {
        Objects.requireNonNull(o82Var);
        this.g = o82Var;
    }
}
