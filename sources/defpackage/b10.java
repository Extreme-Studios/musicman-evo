package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class b10 {
    public final /* synthetic */ dt a;
    public final /* synthetic */ rw b;
    public final /* synthetic */ sw c;
    public final /* synthetic */ i10 d;

    public b10(dt dtVar, rw rwVar, sw swVar, i10 i10Var) {
        this.a = dtVar;
        this.b = rwVar;
        this.c = swVar;
        this.d = i10Var;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00b0 A[Catch: all -> 0x0052, TRY_LEAVE, TryCatch #0 {all -> 0x0052, blocks: (B:21:0x004e, B:35:0x00a8, B:37:0x00b0), top: B:52:0x004e }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:42:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(vd vdVar, ac acVar) throws Throwable {
        a10 a10Var;
        dt dtVar;
        rw rwVar;
        sw swVar;
        i10 i10Var;
        gl glVar;
        dt dtVar2;
        dt dtVar3;
        sw swVar2;
        Object obj;
        if (acVar instanceof a10) {
            a10Var = (a10) acVar;
            int i = a10Var.p;
            if ((i & Integer.MIN_VALUE) != 0) {
                a10Var.p = i - Integer.MIN_VALUE;
            } else {
                a10Var = new a10(this, acVar);
            }
        } else {
            a10Var = new a10(this, acVar);
        }
        Object obj2 = a10Var.n;
        int i2 = a10Var.p;
        rc rcVar = rc.f;
        try {
            if (i2 == 0) {
                ar.n(obj2);
                a10Var.i = vdVar;
                dtVar = this.a;
                a10Var.j = dtVar;
                rwVar = this.b;
                a10Var.k = rwVar;
                swVar = this.c;
                a10Var.l = swVar;
                i10Var = this.d;
                a10Var.m = i10Var;
                a10Var.p = 1;
                if (dtVar.c(a10Var) != rcVar) {
                }
                glVar = vdVar;
                return rcVar;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        j7.e("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    obj = a10Var.k;
                    swVar2 = (sw) a10Var.j;
                    dtVar2 = (dt) a10Var.i;
                    try {
                        ar.n(obj2);
                        swVar2.f = obj;
                        Object obj3 = swVar2.f;
                        dtVar2.d(null);
                        return obj3;
                    } catch (Throwable th) {
                        th = th;
                        dtVar2.d(null);
                        throw th;
                    }
                }
                i10Var = (i10) a10Var.k;
                swVar2 = (sw) a10Var.j;
                dtVar3 = (dt) a10Var.i;
                try {
                    ar.n(obj2);
                    if (!jn.b(obj2, swVar2.f)) {
                        a10Var.i = dtVar3;
                        a10Var.j = swVar2;
                        a10Var.k = obj2;
                        a10Var.p = 3;
                        if (i10Var.j(obj2, a10Var) != rcVar) {
                            obj = obj2;
                            dtVar2 = dtVar3;
                            swVar2.f = obj;
                        }
                        glVar = vdVar;
                        return rcVar;
                    }
                    dtVar2 = dtVar3;
                    Object obj4 = swVar2.f;
                    dtVar2.d(null);
                    return obj4;
                } catch (Throwable th2) {
                    th = th2;
                    dtVar2 = dtVar3;
                    dtVar2.d(null);
                    throw th;
                }
            }
            i10Var = a10Var.m;
            sw swVar3 = a10Var.l;
            rwVar = (rw) a10Var.k;
            dt dtVar4 = (dt) a10Var.j;
            gl glVar2 = (gl) a10Var.i;
            ar.n(obj2);
            swVar = swVar3;
            glVar = glVar2;
            dtVar = dtVar4;
            glVar = vdVar;
            if (rwVar.f) {
                throw new IllegalStateException("InitializerApi.updateData should not be called after initialization is complete.");
            }
            Object obj5 = swVar.f;
            a10Var.i = dtVar;
            a10Var.j = swVar;
            a10Var.k = i10Var;
            a10Var.l = null;
            a10Var.m = null;
            a10Var.p = 2;
            Object objF = glVar.f(obj5, a10Var);
            if (objF != rcVar) {
                dtVar3 = dtVar;
                obj2 = objF;
                swVar2 = swVar;
                if (!jn.b(obj2, swVar2.f)) {
                    a10Var.i = dtVar3;
                    a10Var.j = swVar2;
                    a10Var.k = obj2;
                    a10Var.p = 3;
                    if (i10Var.j(obj2, a10Var) != rcVar) {
                        obj = obj2;
                        dtVar2 = dtVar3;
                        swVar2.f = obj;
                    }
                } else {
                    dtVar2 = dtVar3;
                }
                Object obj6 = swVar2.f;
                dtVar2.d(null);
                return obj6;
            }
            glVar = vdVar;
            return rcVar;
        } catch (Throwable th3) {
            th = th3;
            dtVar2 = dtVar;
            dtVar2.d(null);
            throw th;
        }
    }
}
