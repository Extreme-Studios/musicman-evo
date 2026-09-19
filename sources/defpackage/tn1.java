package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class tn1 implements oi1 {
    public final Map a;
    public final Map b;
    public final Map c;
    public final q63 d;
    public final wo1 e;

    public tn1(Map map, Map map2, Map map3, q63 q63Var, wo1 wo1Var) {
        this.a = map;
        this.b = map2;
        this.c = map3;
        this.d = q63Var;
        this.e = wo1Var;
    }

    @Override // defpackage.oi1
    public final tw1 a(String str, int i) {
        tw1 tw1VarA;
        tw1 tw1Var = (tw1) this.a.get(str);
        if (tw1Var != null) {
            return tw1Var;
        }
        if (i != 1) {
            if (i != 4) {
                return null;
            }
            vx1 vx1Var = (vx1) this.c.get(str);
            if (vx1Var != null) {
                return new uw1(vx1Var, lh0.j);
            }
            tw1VarA = (tw1) this.b.get(str);
            if (tw1VarA == null) {
                return null;
            }
        } else if (this.e.d == null || (tw1VarA = ((oi1) this.d.c()).a(str, i)) == null) {
            return null;
        }
        return new uw1(tw1VarA, lh0.i);
    }
}
