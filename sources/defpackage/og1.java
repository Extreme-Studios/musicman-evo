package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class og1 implements mk1 {
    public final /* synthetic */ int f;
    public final Object g;

    public /* synthetic */ og1(int i, Object obj) {
        this.f = i;
        this.g = obj;
    }

    @Override // defpackage.mk1
    public final void h(Context context) {
        int i = this.f;
        Object obj = this.g;
        switch (i) {
            case 0:
                try {
                    try {
                        ((s52) obj).a.j();
                        return;
                    } catch (Throwable th) {
                        throw new l52(th);
                    }
                } catch (l52 e) {
                    jn.V("Cannot invoke onDestroy for the mediation adapter.", e);
                    return;
                }
            default:
                md1 md1Var = (md1) obj;
                if (md1Var != null) {
                    md1Var.destroy();
                    return;
                }
                return;
        }
    }

    @Override // defpackage.mk1
    public final void l(Context context) {
        int i = this.f;
        Object obj = this.g;
        switch (i) {
            case 0:
                try {
                    try {
                        ((s52) obj).a.i();
                        return;
                    } catch (Throwable th) {
                        throw new l52(th);
                    }
                } catch (l52 e) {
                    jn.V("Cannot invoke onPause for the mediation adapter.", e);
                    return;
                }
            default:
                md1 md1Var = (md1) obj;
                if (md1Var != null) {
                    md1Var.onPause();
                    return;
                }
                return;
        }
    }

    @Override // defpackage.mk1
    public final void p(Context context) {
        int i = this.f;
        Object obj = this.g;
        switch (i) {
            case 0:
                try {
                    try {
                        n41 n41Var = ((s52) obj).a;
                        n41Var.m();
                        if (context != null) {
                            try {
                                n41Var.l0(new ju(context));
                                return;
                            } catch (Throwable th) {
                                throw new l52(th);
                            }
                        }
                        return;
                    } catch (Throwable th2) {
                        throw new l52(th2);
                    }
                } catch (l52 e) {
                    jn.V("Cannot invoke onResume for the mediation adapter.", e);
                    return;
                }
            default:
                md1 md1Var = (md1) obj;
                if (md1Var != null) {
                    md1Var.onResume();
                    return;
                }
                return;
        }
    }
}
