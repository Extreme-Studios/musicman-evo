package defpackage;

import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class v8 implements Runnable {
    public final fv f;
    public final /* synthetic */ int g;
    public final /* synthetic */ g90 h;

    public v8() {
        this.f = new fv();
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            int i = this.g;
            g90 g90Var = this.h;
            switch (i) {
                case 0:
                    g90Var.c.b();
                    throw null;
                default:
                    g90Var.c.b();
                    throw null;
            }
        } catch (Throwable th) {
            this.f.a(new cv(th));
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public v8(g90 g90Var, UUID uuid) {
        this();
        this.g = 0;
        this.h = g90Var;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public v8(g90 g90Var) {
        this();
        this.g = 1;
        this.h = g90Var;
    }
}
