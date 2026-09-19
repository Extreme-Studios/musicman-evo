package defpackage;

import android.widget.AbsListView;

/* JADX INFO: loaded from: classes.dex */
public final class dp implements AbsListView.OnScrollListener {
    public final /* synthetic */ fp a;

    public dp(fp fpVar) {
        this.a = fpVar;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i) {
        fp fpVar = this.a;
        bp bpVar = fpVar.w;
        l5 l5Var = fpVar.E;
        if (i != 1 || l5Var.getInputMethodMode() == 2 || l5Var.getContentView() == null) {
            return;
        }
        fpVar.A.removeCallbacks(bpVar);
        bpVar.run();
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
    }
}
