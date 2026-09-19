package defpackage;

import android.os.Handler;
import android.os.Message;

/* JADX INFO: loaded from: classes.dex */
public final class o93 implements Handler.Callback, ds0 {
    public final p73 f;
    public final d73 g;
    public final su0 h = new su0();
    public final wx1 i;
    public final k93 j;
    public final l93 k;
    public final m93 l;
    public final n93 m;

    public o93(p73 p73Var, d73 d73Var, ig igVar, int i, int i2, int i3, int i4) {
        this.f = p73Var;
        this.g = d73Var;
        this.i = igVar.i(p73Var.y, this);
        this.j = new k93(this, i);
        this.k = new l93(this, i2);
        this.l = new m93(this, i3);
        this.m = new n93(this, i4);
        p73Var.s.a(this);
    }

    @Override // defpackage.ds0
    public final void a() {
        this.j.a();
        this.k.a();
        this.l.a();
        this.m.a();
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            this.j.a();
            return true;
        }
        if (i == 2) {
            this.k.a();
            return true;
        }
        if (i == 3) {
            this.l.a();
            return true;
        }
        if (i != 4) {
            return false;
        }
        this.m.a();
        return true;
    }
}
