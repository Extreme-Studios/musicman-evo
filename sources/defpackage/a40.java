package defpackage;

import androidx.appcompat.widget.Toolbar;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a40 implements Runnable {
    public final /* synthetic */ int f;
    public final /* synthetic */ Toolbar g;

    public /* synthetic */ a40(Toolbar toolbar, int i) {
        this.f = i;
        this.g = toolbar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f;
        Toolbar toolbar = this.g;
        switch (i) {
            case 0:
                c40 c40Var = toolbar.Q;
                ur urVar = c40Var == null ? null : c40Var.g;
                if (urVar != null) {
                    urVar.collapseActionView();
                }
                break;
            default:
                toolbar.m();
                break;
        }
    }
}
