package defpackage;

import android.content.Context;
import android.os.Bundle;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class uj1 {
    public Context a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;
    public int g;

    public /* synthetic */ uj1(uj1 uj1Var) {
        this.a = uj1Var.a;
        this.b = (i52) uj1Var.b;
        this.c = (Bundle) uj1Var.c;
        this.d = (f52) uj1Var.d;
        this.e = (r52) uj1Var.e;
        this.f = (yw1) uj1Var.f;
        this.g = uj1Var.g;
    }

    public t31 a() {
        a72 a72VarJ = a72.j(this.a, 6);
        a72VarJ.a();
        t31 t31Var = new t31();
        jn.p("loadJavascriptEngine > Before UI_THREAD_EXECUTOR");
        za1.f.execute(new in2(this, 22, t31Var));
        jn.p("loadNewJavascriptEngine: Promise created");
        t31Var.m(new r52(this, t31Var, a72VarJ, 13), new p83(this, t31Var, a72VarJ, 12, false));
        return t31Var;
    }

    public uj1 b() {
        uj1 uj1Var = new uj1();
        uj1Var.a = this.a;
        uj1Var.b = (i52) this.b;
        uj1Var.c = (Bundle) this.c;
        uj1Var.e = (r52) this.e;
        uj1Var.f = (yw1) this.f;
        return uj1Var;
    }

    public r31 c() {
        jn.p("getEngine: Trying to acquire lock");
        Object obj = this.b;
        synchronized (obj) {
            try {
                jn.p("getEngine: Lock acquired");
                jn.p("refreshIfDestroyed: Trying to acquire lock");
                synchronized (obj) {
                    try {
                        jn.p("refreshIfDestroyed: Lock acquired");
                        t31 t31Var = (t31) this.f;
                        if (t31Var != null && this.g == 0) {
                            t31Var.m(new zx(15, this), zf0.h);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        jn.p("refreshIfDestroyed: Lock released");
        t31 t31Var2 = (t31) this.f;
        if (t31Var2 != null && ((AtomicInteger) t31Var2.b).get() != -1) {
            int i = this.g;
            if (i == 0) {
                jn.p("getEngine (NO_UPDATE): Lock released");
                return ((t31) this.f).p();
            }
            if (i != 1) {
                jn.p("getEngine (UPDATING): Lock released");
                return ((t31) this.f).p();
            }
            this.g = 2;
            a();
            jn.p("getEngine (PENDING_UPDATE): Lock released");
            return ((t31) this.f).p();
        }
        this.g = 2;
        this.f = a();
        jn.p("getEngine (NULL or REJECTED): Lock released");
        return ((t31) this.f).p();
    }

    public uj1() {
        this.g = 0;
    }
}
