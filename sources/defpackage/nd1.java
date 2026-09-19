package defpackage;

import android.view.View;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class nd1 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ d91 f;
    public final /* synthetic */ he1 g;

    public nd1(he1 he1Var, d91 d91Var) {
        this.f = d91Var;
        Objects.requireNonNull(he1Var);
        this.g = he1Var;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.g.s(view, this.f, 10);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
