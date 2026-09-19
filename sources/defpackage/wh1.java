package defpackage;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class wh1 implements r63 {
    public final /* synthetic */ int a;
    public final y91 b;

    public /* synthetic */ wh1(y91 y91Var, int i) {
        this.a = i;
        this.b = y91Var;
    }

    @Override // defpackage.v63
    public final Object c() {
        int i = this.a;
        y91 y91Var = this.b;
        switch (i) {
            case 0:
                View view = (View) y91Var.h;
                dq.D(view);
                return view;
            case 1:
                y42 y42Var = (y42) y91Var.i;
                dq.D(y42Var);
                return y42Var;
            case 2:
                return (li1) y91Var.g;
            default:
                return (md1) y91Var.j;
        }
    }
}
