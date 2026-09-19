package defpackage;

import android.os.Looper;

/* JADX INFO: loaded from: classes.dex */
public final class w83 {
    public final v83 a;
    public final b83 b;
    public int c;
    public Object d;
    public final Looper e;
    public boolean f;

    public w83(b83 b83Var, v83 v83Var, Looper looper) {
        this.b = b83Var;
        this.a = v83Var;
        this.e = looper;
    }

    public final void a() {
        hn.M(!this.f);
        this.f = true;
        b83 b83Var = this.b;
        if (!b83Var.M && b83Var.o.getThread().isAlive()) {
            b83Var.m.a(14, this).a();
        } else {
            s90.Q("ExoPlayerImplInternal", "Ignoring messages sent after release.");
            b(false);
        }
    }

    public final synchronized void b(boolean z) {
        notifyAll();
    }
}
