package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class j42 implements r63 {
    public final /* synthetic */ int a;
    public final s63 b;
    public final v63 c;
    public final v63 d;

    public /* synthetic */ j42(s63 s63Var, q63 q63Var, q63 q63Var2, int i) {
        this.a = i;
        this.b = s63Var;
        this.c = q63Var;
        this.d = q63Var2;
    }

    public i42 a() {
        qa1 qa1VarM;
        boolean z;
        qa1 qa1VarM2;
        int i = 29;
        switch (this.a) {
            case 0:
                Context context = (Context) this.b.a;
                w52 w52Var = (w52) this.c.c();
                i62 i62Var = (i62) this.d.c();
                ix0 ix0Var = lx0.H6;
                tu0 tu0Var = tu0.e;
                if (!((Boolean) tu0Var.c.a(ix0Var)).booleanValue()) {
                    h73 h73VarG = vc3.C.h.g();
                    synchronized (h73VarG.a) {
                        qa1VarM = h73VarG.n;
                        break;
                    }
                } else {
                    qa1VarM = vc3.C.h.g().m();
                }
                z = qa1VarM != null && qa1VarM.j;
                if (((Integer) tu0Var.c.a(lx0.X6)).intValue() > 0) {
                    if (!((Boolean) tu0Var.c.a(lx0.G6)).booleanValue() || z) {
                        h62 h62VarA = i62Var.a(b62.h, context, w52Var, new gv1(4, new w32(0)));
                        un1 un1Var = new un1(new dr0(i));
                        r52 r52Var = h62VarA.a;
                        ya1 ya1Var = za1.a;
                        return new es0(un1Var, new p83(r52Var, ya1Var), h62VarA.b, ((c62) r52Var.h).l, ya1Var);
                    }
                }
                return new dr0(i);
            default:
                Context context2 = (Context) this.b.a;
                w52 w52Var2 = (w52) this.c.c();
                i62 i62Var2 = (i62) this.d.c();
                ix0 ix0Var2 = lx0.H6;
                tu0 tu0Var2 = tu0.e;
                if (!((Boolean) tu0Var2.c.a(ix0Var2)).booleanValue()) {
                    h73 h73VarG2 = vc3.C.h.g();
                    synchronized (h73VarG2.a) {
                        qa1VarM2 = h73VarG2.n;
                        break;
                    }
                } else {
                    qa1VarM2 = vc3.C.h.g().m();
                }
                z = qa1VarM2 != null && qa1VarM2.j;
                if (((Integer) tu0Var2.c.a(lx0.J6)).intValue() > 0) {
                    if (!((Boolean) tu0Var2.c.a(lx0.G6)).booleanValue() || z) {
                        h62 h62VarA2 = i62Var2.a(b62.f, context2, w52Var2, new gv1(4, new w32(0)));
                        un1 un1Var2 = new un1(new dr0(i));
                        r52 r52Var2 = h62VarA2.a;
                        ya1 ya1Var2 = za1.a;
                        return new es0(un1Var2, new p83(r52Var2, ya1Var2), h62VarA2.b, ((c62) r52Var2.h).l, ya1Var2);
                    }
                }
                return new dr0(i);
        }
    }

    @Override // defpackage.v63
    public final Object c() {
        int i = this.a;
        v63 v63Var = this.d;
        v63 v63Var2 = this.c;
        s63 s63Var = this.b;
        switch (i) {
            case 0:
                return a();
            case 1:
                return a();
            case 2:
                return new mf2("dFQH+5qiD2PRdi0XHMSOoNm+a3fekCOGUzmH+eYRmk9bJvOb468Cs8O4aRQ5LdYP", "cV7R50f2/HQumOgCDB4L1ZcSwVOfPPdtbjhx11w36hE=", (hp0) s63Var.a, (cf2) v63Var2.c(), ((dh2) v63Var.c()).a(114), 1);
            default:
                return new mf2("Zh6cd+aDndZV+YUcVHG1KoZXWtL97j2QmZXbwOqvXvMv7NRw9MmD/Gx8wRyupV8R", "kj+4OypsnIcMTfpnmlGzqqY0pqeQ7F3FRQZTzB0M60E=", (hp0) s63Var.a, (cf2) v63Var2.c(), ((dh2) v63Var.c()).a(117), 0);
        }
    }
}
