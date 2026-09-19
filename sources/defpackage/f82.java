package defpackage;

import android.content.Context;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class f82 {
    public final Context a;
    public final Executor b;
    public final rn2 c;
    public final id3 d;
    public final c82 e;
    public final e72 f;
    public final se1 g;

    public f82(Context context, ya1 ya1Var, rn2 rn2Var, id3 id3Var, c82 c82Var, e72 e72Var, se1 se1Var) {
        this.a = context;
        this.b = ya1Var;
        this.c = rn2Var;
        this.d = id3Var;
        this.e = c82Var;
        this.f = e72Var;
        this.g = se1Var;
    }

    public final void a(List list, j52 j52Var) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            b((String) it.next(), j52Var, null, null);
        }
    }

    public final void b(String str, j52 j52Var, d72 d72Var, il1 il1Var) {
        hp hpVarB;
        a72 a72VarJ = null;
        if (e72.a() && ((Boolean) my0.d.u()).booleanValue()) {
            a72VarJ = a72.j(this.a, 14);
            a72VarJ.a();
        }
        a72 a72Var = a72VarJ;
        if (j52Var != null) {
            hpVarB = new kd0((t93) j52Var.f, this.d, this.c, this.e, this.g, 11).f(str);
        } else {
            hpVarB = this.c.b(new hq0(this, 11, str));
        }
        hpVarB.a(new in2(hpVarB, 0, new u40(this, a72Var, d72Var, il1Var, 17)), this.b);
    }
}
