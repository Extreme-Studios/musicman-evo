package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class eg {
    public int a;
    public int b;
    public int c;

    public eg(int i, int i2, int i3) {
        this.a = i;
        this.c = i2;
        this.b = i3;
    }

    public static eg a(kb3 kb3Var) {
        if (kb3Var.i) {
            return new eg(3, 0, 0);
        }
        if (kb3Var.n) {
            return new eg(2, 0, 0);
        }
        return kb3Var.m ? new eg(0, 0, 0) : new eg(1, kb3Var.k, kb3Var.h);
    }

    public boolean b() {
        return this.a == 3;
    }

    public /* synthetic */ eg(int i, int i2, int i3, boolean z) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }
}
