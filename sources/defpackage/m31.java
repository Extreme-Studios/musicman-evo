package defpackage;

import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class m31 implements v11 {
    public final /* synthetic */ long f;
    public final /* synthetic */ t31 g;
    public final /* synthetic */ k31 h;
    public final /* synthetic */ uj1 i;

    public m31(uj1 uj1Var, long j, t31 t31Var, k31 k31Var) {
        this.f = j;
        this.g = t31Var;
        this.h = k31Var;
        this.i = uj1Var;
    }

    @Override // defpackage.v11
    public final void f(Object obj, Map map) {
        vc3.C.k.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis() - this.f;
        StringBuilder sb = new StringBuilder(String.valueOf(jCurrentTimeMillis).length() + 42);
        sb.append("onGmsg /jsLoaded. JsLoaded latency is ");
        sb.append(jCurrentTimeMillis);
        sb.append(" ms.");
        jn.p(sb.toString());
        jn.p("loadJavascriptEngine > /jsLoaded handler: Trying to acquire lock");
        uj1 uj1Var = this.i;
        synchronized (uj1Var.b) {
            jn.p("loadJavascriptEngine > /jsLoaded handler: Lock acquired");
            t31 t31Var = this.g;
            if (((AtomicInteger) t31Var.b).get() != -1 && ((AtomicInteger) t31Var.b).get() != 1) {
                uj1Var.g = 0;
                k31 k31Var = this.h;
                k31Var.p("/log", u11.c);
                k31Var.p("/result", u11.j);
                ((cb1) t31Var.a).b(k31Var);
                uj1Var.f = t31Var;
                jn.p("Successfully loaded JS Engine.");
                jn.p("loadJavascriptEngine > /jsLoaded handler: Lock released");
                return;
            }
            jn.p("loadJavascriptEngine > /jsLoaded handler: Lock released, the promise is already settled");
        }
    }
}
