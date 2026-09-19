package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class j30 {
    public ei[] a;
    public boolean b;
    public int c;
    public Object d;

    public j30 a() {
        if (!(((ww) this.d) != null)) {
            j7.p("execute parameter required");
            return null;
        }
        ei[] eiVarArr = this.a;
        boolean z = this.b;
        int i = this.c;
        j30 j30Var = new j30();
        j30Var.d = this;
        j30Var.a = eiVarArr;
        boolean z2 = false;
        if (eiVarArr != null && z) {
            z2 = true;
        }
        j30Var.b = z2;
        j30Var.c = i;
        return j30Var;
    }
}
