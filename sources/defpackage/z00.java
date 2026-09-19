package defpackage;

import java.io.Serializable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class z00 extends ac {
    public i10 i;
    public Object j;
    public Serializable k;
    public Object l;
    public b10 m;
    public Iterator n;
    public /* synthetic */ Object o;
    public final /* synthetic */ i10 p;
    public int q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z00(i10 i10Var, ac acVar) {
        super(acVar);
        this.p = i10Var;
    }

    @Override // defpackage.ac
    public final Object m(Object obj) {
        this.o = obj;
        this.q |= Integer.MIN_VALUE;
        return this.p.c(this);
    }
}
