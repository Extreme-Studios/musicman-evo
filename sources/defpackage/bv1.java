package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class bv1 implements cv1 {
    public final Map a;
    public final ya1 b;
    public final ol1 c;

    public bv1(Map map, ya1 ya1Var, ol1 ol1Var) {
        this.a = map;
        this.b = ya1Var;
        this.c = ol1Var;
    }

    @Override // defpackage.cv1
    public final hp d(r71 r71Var) {
        this.c.E0(r71Var);
        nm2 nm2VarC = na1.C(new au1(3));
        int i = 0;
        for (String str : ((String) tu0.e.c.a(lx0.R8)).split(",")) {
            v63 v63Var = (v63) this.a.get(str.trim());
            if (v63Var != null) {
                nm2VarC = na1.J(nm2VarC, au1.class, new yy0(v63Var, 8, r71Var), this.b);
            }
        }
        nm2VarC.a(new in2(nm2VarC, i, new oc2(27, this)), za1.g);
        return nm2VarC;
    }
}
