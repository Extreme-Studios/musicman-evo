package defpackage;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class es1 {
    public final hs1 a;
    public final Executor b;
    public final HashMap c;

    public es1(hs1 hs1Var, ya1 ya1Var) {
        this.a = hs1Var;
        hs1Var.getClass();
        this.c = new HashMap(hs1Var.a);
        this.b = ya1Var;
    }

    public final us2 a() {
        us2 us2Var = new us2(this);
        ((ConcurrentHashMap) us2Var.g).putAll(this.c);
        return us2Var;
    }

    public final void b() {
        if (((Boolean) tu0.e.c.a(lx0.sc)).booleanValue()) {
            us2 us2VarA = a();
            us2VarA.s("action", "pecr");
            us2VarA.t();
        }
    }
}
