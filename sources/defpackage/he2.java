package defpackage;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class he2 implements Callable {
    public final /* synthetic */ ie2 a;
    public final /* synthetic */ int b;

    public /* synthetic */ he2(ie2 ie2Var, int i) {
        this.a = ie2Var;
        this.b = i;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Object call() {
        int i = this.b - 1;
        ie2 ie2Var = this.a;
        if (i == 1) {
            return (ge2) ie2Var.a.c();
        }
        if (i == 2) {
            return (ge2) ie2Var.b.c();
        }
        if (i == 3) {
            return (ge2) ie2Var.c.c();
        }
        throw new IllegalArgumentException();
    }
}
