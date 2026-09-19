package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class r8 extends e0 {
    public final /* synthetic */ s8 m;

    public r8(s8 s8Var) {
        this.m = s8Var;
    }

    @Override // defpackage.e0
    public final String g() {
        q8 q8Var = (q8) this.m.f.get();
        if (q8Var == null) {
            return "Completer object has been garbage collected, future will fail soon";
        }
        return "tag=[" + q8Var.a + "]";
    }
}
