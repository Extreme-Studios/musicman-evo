package defpackage;

import androidx.appcompat.widget.ActionBarContextView;

/* JADX INFO: loaded from: classes.dex */
public final class b implements j70 {
    public boolean a = false;
    public int b;
    public final /* synthetic */ ActionBarContextView c;

    public b(ActionBarContextView actionBarContextView) {
        this.c = actionBarContextView;
    }

    @Override // defpackage.j70
    public final void a() {
        if (this.a) {
            return;
        }
        ActionBarContextView actionBarContextView = this.c;
        actionBarContextView.k = null;
        super/*android.view.View*/.setVisibility(this.b);
    }

    @Override // defpackage.j70
    public final void b() {
        this.a = true;
    }

    @Override // defpackage.j70
    public final void c() {
        super/*android.view.View*/.setVisibility(0);
        this.a = false;
    }
}
