package defpackage;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public abstract class db0 {
    public Boolean a;
    public boolean b;
    public final /* synthetic */ a8 c;
    public final int d;
    public final Bundle e;
    public final /* synthetic */ a8 f;

    public db0(a8 a8Var, int i, Bundle bundle) {
        this.f = a8Var;
        Boolean bool = Boolean.TRUE;
        this.c = a8Var;
        this.a = bool;
        this.b = false;
        this.d = i;
        this.e = bundle;
    }

    public abstract void a(db dbVar);

    public abstract boolean b();

    public final void c() {
        synchronized (this) {
            this.a = null;
        }
        synchronized (this.c.l) {
            this.c.l.remove(this);
        }
    }
}
