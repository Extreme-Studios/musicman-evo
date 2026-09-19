package defpackage;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class lw1 implements Runnable {
    public final /* synthetic */ int f;
    public final /* synthetic */ x82 g;
    public final /* synthetic */ View h;

    public /* synthetic */ lw1(x82 x82Var, View view, int i) {
        this.f = i;
        this.g = x82Var;
        this.h = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f;
        x82 x82Var = this.g;
        View view = this.h;
        switch (i) {
            case 0:
                if (((Boolean) tu0.e.c.a(lx0.G5)).booleanValue() && v51.m.g && !x82Var.f) {
                    x82Var.b.a(view, a92.f);
                    break;
                }
                break;
            default:
                if (((Boolean) tu0.e.c.a(lx0.G5)).booleanValue() && v51.m.g) {
                    x82Var.b(view);
                    break;
                }
                break;
        }
    }
}
