package defpackage;

import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes.dex */
public final class gf2 implements of2 {
    public final Map a;
    public final hp0 b;
    public final ch2 c;
    public final long d;

    public gf2(hp0 hp0Var, Map map, vc2 vc2Var, dh2 dh2Var) {
        this.a = map;
        this.b = hp0Var;
        this.c = dh2Var.a(112);
        this.d = vc2Var.K();
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        sp0 sp0Var;
        try {
            try {
                this.c.a();
                hp hpVar = (hp) this.a.get("gs");
                if (hpVar != null && (sp0Var = (sp0) hpVar.get(this.d, TimeUnit.MILLISECONDS)) != null) {
                    hp0 hp0Var = this.b;
                    synchronized (hp0Var) {
                        bq0 bq0VarZ0 = sp0Var.z0();
                        hp0Var.b();
                        ((sp0) hp0Var.g).n0(bq0VarZ0);
                        long jW0 = sp0Var.w0();
                        hp0Var.b();
                        ((sp0) hp0Var.g).W(jW0);
                    }
                }
            } catch (Throwable th) {
                this.c.c();
                throw th;
            }
        } catch (ClassCastException | InterruptedException | ExecutionException | TimeoutException e) {
            this.c.b(e);
        }
        this.c.c();
        return null;
    }
}
