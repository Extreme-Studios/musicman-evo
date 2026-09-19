package defpackage;

import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public final class w00 extends s20 implements gl {
    public final /* synthetic */ int j;
    public /* synthetic */ Object k;
    public final /* synthetic */ Object l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w00(Object obj, yb ybVar, int i) {
        super(2, ybVar);
        this.j = i;
        this.l = obj;
    }

    @Override // defpackage.gl
    public final Object f(Object obj, Object obj2) {
        int i = this.j;
        k50 k50Var = k50.a;
        switch (i) {
            case 0:
                return ((w00) k((yb) obj2, (w10) obj)).m(k50Var);
            case 1:
                return ((w00) k((yb) obj2, (tb2) obj)).m(k50Var);
            default:
                return ((w00) k((yb) obj2, (tb2) obj)).m(k50Var);
        }
    }

    @Override // defpackage.ac
    public final yb k(yb ybVar, Object obj) {
        switch (this.j) {
            case 0:
                w00 w00Var = new w00((w10) this.l, ybVar, 0);
                w00Var.k = obj;
                return w00Var;
            case 1:
                w00 w00Var2 = new w00((String) this.l, ybVar, 1);
                w00Var2.k = obj;
                return w00Var2;
            default:
                w00 w00Var3 = new w00((qb2) this.l, ybVar, 2);
                w00Var3.k = obj;
                return w00Var3;
        }
    }

    @Override // defpackage.ac
    public final Object m(Object obj) {
        int i = this.j;
        Object obj2 = this.l;
        switch (i) {
            case 0:
                ar.n(obj);
                w10 w10Var = (w10) this.k;
                w10 w10Var2 = (w10) obj2;
                boolean z = false;
                if (!(w10Var2 instanceof rd) && !(w10Var2 instanceof fi) && w10Var == w10Var2) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 1:
                ar.n(obj);
                rb2 rb2Var = (rb2) ((tb2) this.k).r();
                Collections.unmodifiableMap(((tb2) rb2Var.g).A()).getClass();
                String str = (String) obj2;
                str.getClass();
                rb2Var.b();
                ((tb2) rb2Var.g).D().remove(str);
                return (tb2) rb2Var.c();
            default:
                ar.n(obj);
                rb2 rb2Var2 = (rb2) ((tb2) this.k).r();
                Collections.unmodifiableMap(((tb2) rb2Var2.g).A()).getClass();
                qb2 qb2Var = (qb2) obj2;
                String strC = qb2Var.C();
                strC.getClass();
                rb2Var2.b();
                ((tb2) rb2Var2.g).D().put(strC, qb2Var);
                return (tb2) rb2Var2.c();
        }
    }
}
