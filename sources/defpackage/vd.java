package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class vd extends s20 implements gl {
    public Iterator j;
    public Object k;
    public int l;
    public /* synthetic */ Object m;
    public final /* synthetic */ List n;
    public final /* synthetic */ ArrayList o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vd(List list, ArrayList arrayList, yb ybVar) {
        super(2, ybVar);
        this.n = list;
        this.o = arrayList;
    }

    @Override // defpackage.gl
    public final Object f(Object obj, Object obj2) {
        return ((vd) k((yb) obj2, obj)).m(k50.a);
    }

    @Override // defpackage.ac
    public final yb k(yb ybVar, Object obj) {
        vd vdVar = new vd(this.n, this.o, ybVar);
        vdVar.m = obj;
        return vdVar;
    }

    @Override // defpackage.ac
    public final Object m(Object obj) {
        Iterator it;
        List list;
        int i = this.l;
        if (i == 0) {
            ar.n(obj);
            obj = this.m;
            it = this.n.iterator();
            list = this.o;
        } else if (i == 1) {
            Object obj2 = this.k;
            Iterator it2 = this.j;
            List list2 = (List) this.m;
            ar.n(obj);
            if (((Boolean) obj).booleanValue()) {
                list2.add(new ud(1, null));
                this.m = list2;
                this.j = it2;
                this.k = null;
                this.l = 2;
                throw null;
            }
            obj = obj2;
            it = it2;
            list = list2;
        } else {
            if (i != 2) {
                j7.e("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            it = this.j;
            list = (List) this.m;
            ar.n(obj);
        }
        if (!it.hasNext()) {
            return obj;
        }
        if (it.next() != null) {
            j7.j();
            return null;
        }
        this.m = list;
        this.j = it;
        this.k = obj;
        this.l = 1;
        throw null;
    }
}
