package defpackage;

import android.util.DisplayMetrics;
import android.view.View;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class qf2 implements r63 {
    public final /* synthetic */ int a = 1;
    public final s63 b;
    public final v63 c;
    public final q63 d;
    public final s63 e;
    public final v63 f;

    public qf2(s63 s63Var, q63 q63Var, q63 q63Var2, s63 s63Var2, q63 q63Var3) {
        this.b = s63Var;
        this.c = q63Var;
        this.d = q63Var2;
        this.e = s63Var2;
        this.f = q63Var3;
    }

    @Override // defpackage.v63
    public final Object c() {
        int i = this.a;
        v63 v63Var = this.f;
        s63 s63Var = this.e;
        q63 q63Var = this.d;
        v63 v63Var2 = this.c;
        s63 s63Var2 = this.b;
        switch (i) {
            case 0:
                return new nf2((hp0) s63Var2.a, (cf2) v63Var2.c(), (Map) s63Var.a, (DisplayMetrics) q63Var.c(), (dh2) v63Var.c());
            default:
                return new ef2((hp0) s63Var2.a, (cf2) v63Var2.c(), (DisplayMetrics) q63Var.c(), (View) s63Var.a, (dh2) v63Var.c());
        }
    }

    public qf2(s63 s63Var, q63 q63Var, s63 s63Var2, q63 q63Var2, q63 q63Var3) {
        this.b = s63Var;
        this.c = q63Var;
        this.e = s63Var2;
        this.d = q63Var2;
        this.f = q63Var3;
    }
}
