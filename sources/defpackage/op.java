package defpackage;

/* JADX INFO: loaded from: classes.dex */
public class op extends z60 {
    public static final zj c = new zj(1);
    public final n10 b = new n10();

    @Override // defpackage.z60
    public final void b() {
        n10 n10Var = this.b;
        int i = n10Var.h;
        Object[] objArr = n10Var.g;
        if (i > 0) {
            objArr[0].getClass();
            j7.j();
            return;
        }
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        n10Var.h = 0;
    }
}
