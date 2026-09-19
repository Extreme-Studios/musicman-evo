package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class bu1 implements pl1, en1, yk1 {
    public final Context f;
    public final es1 g;

    public bu1(Context context, es1 es1Var) {
        this.f = context;
        this.g = es1Var;
    }

    @Override // defpackage.pl1
    public final void E0(r71 r71Var) {
        if (((Boolean) tu0.e.c.a(lx0.b5)).booleanValue()) {
            b(this.f);
        }
    }

    @Override // defpackage.en1
    public final void a(j01 j01Var) {
        if (((Boolean) tu0.e.c.a(lx0.c5)).booleanValue()) {
            b(this.f);
        }
    }

    public final void b(Context context) {
        if (((Boolean) tu0.e.c.a(lx0.Z4)).booleanValue()) {
            za1.a.execute(new hb1(this, context, 17, false));
        }
    }

    @Override // defpackage.yk1
    public final void e() {
        if (((Boolean) tu0.e.c.a(lx0.d5)).booleanValue()) {
            b(this.f);
        }
    }

    @Override // defpackage.pl1
    public final void A(e52 e52Var) {
    }

    @Override // defpackage.en1
    public final void F(String str) {
    }
}
