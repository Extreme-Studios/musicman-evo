package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ji implements hi {
    public final /* synthetic */ rw f;
    public final /* synthetic */ hi g;
    public final /* synthetic */ w00 h;

    public ji(rw rwVar, hi hiVar, w00 w00Var) {
        this.f = rwVar;
        this.g = hiVar;
        this.h = w00Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.hi
    public final Object i(Object obj, yb ybVar) {
        ii iiVar;
        if (ybVar instanceof ii) {
            iiVar = (ii) ybVar;
            int i = iiVar.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                iiVar.m = i - Integer.MIN_VALUE;
            } else {
                iiVar = new ii(this, ybVar);
            }
        } else {
            iiVar = new ii(this, ybVar);
        }
        Object objF = iiVar.k;
        int i2 = iiVar.m;
        k50 k50Var = k50.a;
        rc rcVar = rc.f;
        if (i2 == 0) {
            ar.n(objF);
            if (this.f.f) {
                iiVar.m = 1;
                if (this.g.i(obj, iiVar) != rcVar) {
                    return k50Var;
                }
            } else {
                iiVar.i = this;
                iiVar.j = obj;
                iiVar.m = 2;
                objF = this.h.f(obj, iiVar);
                if (objF != rcVar) {
                }
            }
            return rcVar;
        }
        if (i2 == 1) {
            ar.n(objF);
            return k50Var;
        }
        if (i2 != 2) {
            if (i2 == 3) {
                ar.n(objF);
                return k50Var;
            }
            j7.e("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        obj = iiVar.j;
        this = iiVar.i;
        ar.n(objF);
        if (!((Boolean) objF).booleanValue()) {
            this.f.f = true;
            hi hiVar = this.g;
            iiVar.i = null;
            iiVar.j = null;
            iiVar.m = 3;
            if (hiVar.i(obj, iiVar) == rcVar) {
                return rcVar;
            }
        }
        return k50Var;
    }
}
