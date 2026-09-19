package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class jo1 implements qt0 {
    public final /* synthetic */ String f;
    public final /* synthetic */ no1 g;

    public jo1(no1 no1Var, String str) {
        this.f = str;
        this.g = no1Var;
    }

    @Override // defpackage.qt0
    public final void Q0(pt0 pt0Var) {
        if (!((Boolean) tu0.e.c.a(lx0.R1)).booleanValue()) {
            if (pt0Var.j) {
                no1 no1Var = this.g;
                if (no1Var.w != null) {
                    no1Var.H.put(this.f, Boolean.TRUE);
                    np1 np1Var = no1Var.w;
                    if (np1Var == null) {
                        return;
                    }
                    no1Var.t(np1Var.Z0(), np1Var.g(), np1Var.k(), true);
                    return;
                }
                return;
            }
            return;
        }
        synchronized (this) {
            try {
                if (pt0Var.j) {
                    no1 no1Var2 = this.g;
                    if (no1Var2.w != null) {
                        no1Var2.H.put(this.f, Boolean.TRUE);
                        np1 np1Var2 = no1Var2.w;
                        if (np1Var2 == null) {
                        } else {
                            no1Var2.t(np1Var2.Z0(), no1Var2.w.g(), no1Var2.w.k(), true);
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
