package defpackage;

import java.util.Comparator;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class s82 implements Comparator {
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;

    public /* synthetic */ s82(int i, Object obj) {
        this.f = i;
        this.g = obj;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i = this.f;
        Object obj3 = this.g;
        switch (i) {
            case 0:
                r82 r82Var = (r82) obj;
                r82 r82Var2 = (r82) obj2;
                k82 k82Var = (k82) obj3;
                lu1 lu1VarG = k82Var.g(r82Var2.a);
                double d = !(lu1VarG instanceof zj1) ? 0.0d : ((zj1) lu1VarG).o;
                lu1 lu1VarG2 = k82Var.g(r82Var.a);
                int iCompare = Double.compare(d, lu1VarG2 instanceof zj1 ? ((zj1) lu1VarG2).o : 0.0d);
                return iCompare == 0 ? Long.compare(r82Var.b, r82Var2.b) : iCompare;
            default:
                HashMap map = cd3.a;
                bd3 bd3Var = (bd3) obj3;
                return bd3Var.b(obj2) - bd3Var.b(obj);
        }
    }
}
