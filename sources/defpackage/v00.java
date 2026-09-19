package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class v00 extends s20 implements gl {
    public final /* synthetic */ int j;
    public int k;
    public /* synthetic */ Object l;
    public final /* synthetic */ i10 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v00(i10 i10Var, yb ybVar, int i) {
        super(2, ybVar);
        this.j = i;
        this.m = i10Var;
    }

    @Override // defpackage.gl
    public final Object f(Object obj, Object obj2) {
        int i = this.j;
        k50 k50Var = k50.a;
        switch (i) {
            case 0:
                return ((v00) k((yb) obj2, (t00) obj)).m(k50Var);
            default:
                return ((v00) k((yb) obj2, (hi) obj)).m(k50Var);
        }
    }

    @Override // defpackage.ac
    public final yb k(yb ybVar, Object obj) {
        int i = this.j;
        i10 i10Var = this.m;
        switch (i) {
            case 0:
                v00 v00Var = new v00(i10Var, ybVar, 0);
                v00Var.l = obj;
                return v00Var;
            default:
                v00 v00Var2 = new v00(i10Var, ybVar, 1);
                v00Var2.l = obj;
                return v00Var2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00a8  */
    @Override // defpackage.ac
    public final Object m(Object obj) throws Throwable {
        Object objE;
        int i = this.j;
        rc rcVar = rc.f;
        i10 i10Var = this.m;
        k50 k50Var = k50.a;
        yb ybVar = null;
        switch (i) {
            case 0:
                int i2 = this.k;
                if (i2 != 0) {
                    if (i2 == 1 || i2 == 2) {
                        ar.n(obj);
                        return k50Var;
                    }
                    j7.e("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ar.n(obj);
                t00 t00Var = (t00) this.l;
                if (t00Var instanceof r00) {
                    r00 r00Var = (r00) t00Var;
                    this.k = 1;
                    w10 w10Var = (w10) i10Var.e.b();
                    if (w10Var instanceof rd) {
                        objE = k50Var;
                    } else if (!(w10Var instanceof ow)) {
                        if (jn.b(w10Var, g50.a)) {
                            objE = i10Var.e(this);
                            if (objE != rcVar) {
                            }
                        } else if (w10Var instanceof fi) {
                            j7.e("Can't read in final state.");
                            return null;
                        }
                        objE = k50Var;
                    } else if (w10Var != r00Var.a || (objE = i10Var.e(this)) != rcVar) {
                        objE = k50Var;
                    }
                    if (objE == rcVar) {
                        return rcVar;
                    }
                } else if (t00Var instanceof s00) {
                    this.k = 2;
                    if (i10.a(i10Var, (s00) t00Var, this) == rcVar) {
                        return rcVar;
                    }
                }
                return k50Var;
            default:
                y10 y10Var = i10Var.e;
                int i3 = this.k;
                if (i3 != 0) {
                    if (i3 == 1) {
                        ar.n(obj);
                        return k50Var;
                    }
                    j7.e("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ar.n(obj);
                hi hiVar = (hi) this.l;
                w10 w10Var2 = (w10) y10Var.b();
                if (!(w10Var2 instanceof rd)) {
                    i10Var.g.g(new r00(w10Var2));
                }
                w00 w00Var = new w00(w10Var2, ybVar, 0);
                this.k = 1;
                y10Var.a(new ji(new rw(), new ki(1, hiVar), w00Var), this);
                return rcVar;
        }
    }
}
