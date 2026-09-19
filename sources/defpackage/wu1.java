package defpackage;

import android.content.Context;
import android.os.Binder;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public abstract class wu1 implements x7, y7 {
    public final cb1 f = new cb1();
    public final Object g = new Object();
    public boolean h = false;
    public boolean i = false;
    public r71 j;
    public vu0 k;

    public static void b(Context context, cb1 cb1Var, Executor executor) {
        if (((Boolean) ly0.j.u()).booleanValue() || ((Boolean) ly0.h.u()).booleanValue()) {
            cb1Var.a(new in2(cb1Var, 0, new kz0(context)), executor);
        }
    }

    @Override // defpackage.x7
    public void T(int i) {
        jn.F("Cannot connect to remote service, fallback to local instance.");
    }

    public void U(db dbVar) {
        jn.F("Disconnected from remote ad request service.");
        this.f.c(new dv1(1));
    }

    public final void a() {
        synchronized (this.g) {
            try {
                this.i = true;
                if (this.k.a() || this.k.e()) {
                    this.k.o();
                }
                Binder.flushPendingCommands();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
