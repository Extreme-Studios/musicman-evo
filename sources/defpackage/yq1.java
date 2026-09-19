package defpackage;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class yq1 implements Handler.Callback {
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;

    public /* synthetic */ yq1(int i, Object obj) {
        this.f = i;
        this.g = obj;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        switch (this.f) {
            case 0:
                gr1 gr1Var = (gr1) this.g;
                for (cq1 cq1Var : (CopyOnWriteArraySet) gr1Var.f) {
                    rp1 rp1Var = (rp1) gr1Var.e;
                    if (!cq1Var.d && cq1Var.c) {
                        cc3 cc3VarD = cq1Var.b.d();
                        cq1Var.b = new mn0(3);
                        cq1Var.c = false;
                        rp1Var.d(cq1Var.a, cc3VarD);
                    }
                    if (((wx1) gr1Var.d).a.hasMessages(1)) {
                        return true;
                    }
                }
                return true;
            default:
                int i = message.what;
                if (i == 0) {
                    synchronized (((bc3) this.g).a) {
                        try {
                            y93 y93Var = (y93) message.obj;
                            ha3 ha3Var = (ha3) ((bc3) this.g).a.get(y93Var);
                            if (ha3Var != null && ha3Var.a.isEmpty()) {
                                if (ha3Var.c) {
                                    ha3Var.g.c.removeMessages(1, ha3Var.e);
                                    bc3 bc3Var = ha3Var.g;
                                    bc3Var.d.r(bc3Var.b, ha3Var);
                                    ha3Var.c = false;
                                    ha3Var.b = 2;
                                }
                                ((bc3) this.g).a.remove(y93Var);
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                        break;
                    }
                    return true;
                }
                if (i != 1) {
                    return false;
                }
                synchronized (((bc3) this.g).a) {
                    try {
                        y93 y93Var2 = (y93) message.obj;
                        ha3 ha3Var2 = (ha3) ((bc3) this.g).a.get(y93Var2);
                        if (ha3Var2 != null && ha3Var2.b == 3) {
                            Log.e("GmsClientSupervisor", "Timeout waiting for ServiceConnection callback ".concat(String.valueOf(y93Var2)), new Exception());
                            ComponentName componentName = ha3Var2.f;
                            if (componentName == null) {
                                y93Var2.getClass();
                                componentName = null;
                            }
                            if (componentName == null) {
                                String str = y93Var2.b;
                                dq.f(str);
                                componentName = new ComponentName(str, "unknown");
                            }
                            ha3Var2.onServiceDisconnected(componentName);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                    break;
                }
                return true;
        }
    }
}
