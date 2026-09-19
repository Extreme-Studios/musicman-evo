package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* JADX INFO: loaded from: classes.dex */
public abstract class j8 extends jb {
    public static final String h = yp.f("BrdcstRcvrCnstrntTrckr");
    public final y4 g;

    public j8(Context context, l30 l30Var) {
        super(context, l30Var);
        this.g = new y4(1, this);
    }

    @Override // defpackage.jb
    public final void d() {
        yp.d().a(h, getClass().getSimpleName().concat(": registering receiver"), new Throwable[0]);
        this.b.registerReceiver(this.g, f());
    }

    @Override // defpackage.jb
    public final void e() {
        yp.d().a(h, getClass().getSimpleName().concat(": unregistering receiver"), new Throwable[0]);
        this.b.unregisterReceiver(this.g);
    }

    public abstract IntentFilter f();

    public abstract void g(Intent intent);
}
