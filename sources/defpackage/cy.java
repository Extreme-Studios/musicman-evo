package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class cy extends hn {
    @Override // defpackage.hn
    public final void e(k00 k00Var, float f, float f2) {
        float f3 = f2 * f;
        k00Var.d(f3, 180.0f, 90.0f);
        float f4 = f3 * 2.0f;
        g00 g00Var = new g00(0.0f, 0.0f, f4, f4);
        g00Var.f = 180.0f;
        g00Var.g = 90.0f;
        k00Var.f.add(g00Var);
        e00 e00Var = new e00(g00Var);
        k00Var.a(180.0f);
        k00Var.g.add(e00Var);
        k00Var.d = 270.0f;
        float f5 = (0.0f + f4) * 0.5f;
        float f6 = (f4 - 0.0f) / 2.0f;
        k00Var.b = (((float) Math.cos(Math.toRadians(270.0d))) * f6) + f5;
        k00Var.c = (f6 * ((float) Math.sin(Math.toRadians(270.0d)))) + f5;
    }
}
