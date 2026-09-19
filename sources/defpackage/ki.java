package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ki implements hi {
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;

    public /* synthetic */ ki(int i, Object obj) {
        this.f = i;
        this.g = obj;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x001a  */
    @Override // defpackage.hi
    public final Object i(Object obj, yb ybVar) throws Throwable {
        x00 x00Var;
        int i = this.f;
        Object obj2 = this.g;
        switch (i) {
            case 0:
                ((sw) obj2).f = obj;
                throw new a(this);
            default:
                if (ybVar instanceof x00) {
                    x00Var = (x00) ybVar;
                    int i2 = x00Var.j;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        x00Var.j = i2 - Integer.MIN_VALUE;
                    } else {
                        x00Var = new x00(this, ybVar);
                    }
                } else {
                    x00Var = new x00(this, ybVar);
                }
                Object obj3 = x00Var.i;
                int i3 = x00Var.j;
                if (i3 == 0) {
                    ar.n(obj3);
                    hi hiVar = (hi) obj2;
                    w10 w10Var = (w10) obj;
                    if (w10Var instanceof ow) {
                        throw ((ow) w10Var).a;
                    }
                    if (w10Var instanceof fi) {
                        throw ((fi) w10Var).a;
                    }
                    if (!(w10Var instanceof rd)) {
                        if (!(w10Var instanceof g50)) {
                            throw new na();
                        }
                        j7.e("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
                        return null;
                    }
                    Object obj4 = ((rd) w10Var).a;
                    x00Var.j = 1;
                    Object objI = hiVar.i(obj4, x00Var);
                    rc rcVar = rc.f;
                    if (objI == rcVar) {
                        return rcVar;
                    }
                } else {
                    if (i3 != 1) {
                        j7.e("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ar.n(obj3);
                }
                return k50.a;
        }
    }
}
