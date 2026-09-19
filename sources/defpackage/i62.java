package defpackage;

import android.content.Context;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class i62 {
    public final HashMap a = new HashMap();

    public final h62 a(b62 b62Var, Context context, w52 w52Var, gv1 gv1Var) {
        c62 c62Var;
        HashMap map = this.a;
        h62 h62Var = (h62) map.get(b62Var);
        if (h62Var != null) {
            return h62Var;
        }
        if (b62Var == b62.f) {
            ix0 ix0Var = lx0.J6;
            kx0 kx0Var = tu0.e.c;
            c62Var = new c62(context, b62Var, ((Integer) kx0Var.a(ix0Var)).intValue(), ((Integer) kx0Var.a(lx0.P6)).intValue(), ((Integer) kx0Var.a(lx0.R6)).intValue(), (String) kx0Var.a(lx0.T6), (String) kx0Var.a(lx0.L6), (String) kx0Var.a(lx0.N6));
        } else if (b62Var == b62.g) {
            ix0 ix0Var2 = lx0.K6;
            kx0 kx0Var2 = tu0.e.c;
            c62Var = new c62(context, b62Var, ((Integer) kx0Var2.a(ix0Var2)).intValue(), ((Integer) kx0Var2.a(lx0.Q6)).intValue(), ((Integer) kx0Var2.a(lx0.S6)).intValue(), (String) kx0Var2.a(lx0.U6), (String) kx0Var2.a(lx0.M6), (String) kx0Var2.a(lx0.O6));
        } else if (b62Var == b62.h) {
            ix0 ix0Var3 = lx0.X6;
            kx0 kx0Var3 = tu0.e.c;
            c62Var = new c62(context, b62Var, ((Integer) kx0Var3.a(ix0Var3)).intValue(), ((Integer) kx0Var3.a(lx0.Z6)).intValue(), ((Integer) kx0Var3.a(lx0.a7)).intValue(), (String) kx0Var3.a(lx0.V6), (String) kx0Var3.a(lx0.W6), (String) kx0Var3.a(lx0.Y6));
        } else {
            c62Var = null;
        }
        r52 r52Var = new r52(c62Var);
        h62 h62Var2 = new h62(r52Var, new dg3(r52Var, w52Var, gv1Var));
        map.put(b62Var, h62Var2);
        return h62Var2;
    }
}
