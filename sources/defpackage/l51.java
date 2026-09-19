package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class l51 extends t33 {
    public final id3 h;
    public final String i;
    public final j52 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l51(Context context, String str, String str2, j52 j52Var) {
        super(4);
        String strE = vc3.C.c.E(context, str);
        this.h = new id3(context, strE);
        this.i = str2;
        this.j = j52Var;
    }

    @Override // defpackage.t33
    public final void m1() {
        String str = this.i;
        j52 j52Var = this.j;
        id3 id3Var = this.h;
        if (j52Var == null) {
            id3Var.a(str, null);
        } else {
            new kd0((t93) j52Var.f, id3Var, za1.e, (Object) null, (Object) null, 11).f(str);
        }
    }
}
