package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class bc2 extends s20 implements gl {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ Object l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bc2(Object obj, yb ybVar, int i) {
        super(2, ybVar);
        this.j = i;
        this.l = obj;
    }

    @Override // defpackage.gl
    public final Object f(Object obj, Object obj2) {
        int i = this.j;
        k50 k50Var = k50.a;
        qc qcVar = (qc) obj;
        yb ybVar = (yb) obj2;
        switch (i) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
        }
        return ((bc2) k(ybVar, qcVar)).m(k50Var);
    }

    @Override // defpackage.ac
    public final yb k(yb ybVar, Object obj) {
        int i = this.j;
        Object obj2 = this.l;
        switch (i) {
            case 0:
                return new bc2((gr1) obj2, ybVar, 0);
            case 1:
                return new bc2((gr1) obj2, ybVar, 1);
            case 2:
                return new bc2((gr1) obj2, ybVar, 2);
            case 3:
                return new bc2((gr1) obj2, ybVar, 3);
            case 4:
                return new bc2((gr1) obj2, ybVar, 4);
            case 5:
                return new bc2((gr1) obj2, ybVar, 5);
            default:
                return new bc2((wq) obj2, ybVar, 6);
        }
    }

    @Override // defpackage.ac
    public final Object m(Object obj) {
        int i = this.j;
        k50 k50Var = k50.a;
        Object obj2 = this.l;
        rc rcVar = rc.f;
        switch (i) {
            case 0:
                int i2 = this.k;
                ar.n(obj);
                if (i2 != 0) {
                    return k50Var;
                }
                this.k = 1;
                return ((gr1) obj2).i(this) == rcVar ? rcVar : k50Var;
            case 1:
                int i3 = this.k;
                ar.n(obj);
                if (i3 != 0) {
                    return k50Var;
                }
                this.k = 1;
                return ((gr1) obj2).m(this) == rcVar ? rcVar : k50Var;
            case 2:
                int i4 = this.k;
                ar.n(obj);
                if (i4 != 0) {
                    return k50Var;
                }
                this.k = 1;
                return ((gr1) obj2).k(this) == rcVar ? rcVar : k50Var;
            case 3:
                int i5 = this.k;
                ar.n(obj);
                if (i5 != 0) {
                    return k50Var;
                }
                this.k = 1;
                return ((gr1) obj2).f(this) == rcVar ? rcVar : k50Var;
            case 4:
                int i6 = this.k;
                ar.n(obj);
                if (i6 != 0) {
                    return k50Var;
                }
                this.k = 1;
                return ((gr1) obj2).l(this) == rcVar ? rcVar : k50Var;
            case 5:
                int i7 = this.k;
                ar.n(obj);
                if (i7 != 0) {
                    return k50Var;
                }
                this.k = 1;
                return ((gr1) obj2).j(this) == rcVar ? rcVar : k50Var;
            default:
                int i8 = this.k;
                if (i8 != 0) {
                    if (i8 == 1) {
                        ar.n(obj);
                        return obj;
                    }
                    j7.e("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ar.n(obj);
                uq uqVar = ((wq) obj2).a;
                this.k = 1;
                Object objB = uqVar.b(this);
                return objB == rcVar ? rcVar : objB;
        }
    }
}
