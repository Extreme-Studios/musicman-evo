package defpackage;

import android.os.RemoteException;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class n31 implements v11 {
    public final /* synthetic */ int f = 0;
    public final Object g;
    public final Object h;
    public final Object i;

    public n31(wo1 wo1Var, ro1 ro1Var, uq1 uq1Var, o63 o63Var) {
        this.g = (r01) wo1Var.g.get(ro1Var.g());
        this.h = uq1Var;
        this.i = o63Var;
    }

    @Override // defpackage.v11
    public final void f(Object obj, Map map) {
        switch (this.f) {
            case 0:
                jn.p("loadJavascriptEngine > /requestReload handler: Trying to acquire lock");
                uj1 uj1Var = (uj1) this.i;
                synchronized (uj1Var.b) {
                    try {
                        jn.p("loadJavascriptEngine > /requestReload handler: Lock acquired");
                        jn.R("JS Engine is requesting an update");
                        if (uj1Var.g == 0) {
                            jn.R("Starting reload.");
                            uj1Var.g = 2;
                            uj1Var.a();
                        }
                        ((k31) this.g).h("/requestReload", (n31) ((kc2) this.h).g);
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                jn.p("loadJavascriptEngine > /requestReload handler: Lock released");
                return;
            default:
                String str = (String) map.get("asset");
                try {
                    ((r01) this.g).S0((n01) ((o63) this.i).c(), str);
                    return;
                } catch (RemoteException e) {
                    StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 40);
                    sb.append("Failed to call onCustomClick for asset ");
                    sb.append(str);
                    sb.append(".");
                    jn.V(sb.toString(), e);
                    return;
                }
        }
    }

    public n31(uj1 uj1Var, k31 k31Var, kc2 kc2Var) {
        this.g = k31Var;
        this.h = kc2Var;
        this.i = uj1Var;
    }
}
