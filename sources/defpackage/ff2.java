package defpackage;

import android.app.Activity;
import android.view.View;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class ff2 implements r63 {
    public final /* synthetic */ int a;
    public final s63 b;
    public final v63 c;
    public final s63 d;
    public final s63 e;
    public final v63 f;

    public /* synthetic */ ff2(s63 s63Var, q63 q63Var, s63 s63Var2, s63 s63Var3, q63 q63Var2, int i) {
        this.a = i;
        this.b = s63Var;
        this.c = q63Var;
        this.d = s63Var2;
        this.e = s63Var3;
        this.f = q63Var2;
    }

    @Override // defpackage.v63
    public final Object c() {
        int i = this.a;
        v63 v63Var = this.f;
        s63 s63Var = this.e;
        s63 s63Var2 = this.d;
        v63 v63Var2 = this.c;
        s63 s63Var3 = this.b;
        switch (i) {
            case 0:
                return new ef2((hp0) s63Var3.a, (cf2) v63Var2.c(), (View) s63Var2.a, (Activity) s63Var.a, (dh2) v63Var.c());
            default:
                return new ef2((hp0) s63Var3.a, (cf2) v63Var2.c(), (dd2) s63Var2.a, (Map) s63Var.a, (dh2) v63Var.c());
        }
    }
}
