package defpackage;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.HandlerThread;
import android.os.Looper;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class bc3 {
    public static final Object g = new Object();
    public static bc3 h;
    public static HandlerThread i;
    public final HashMap a = new HashMap();
    public final Context b;
    public volatile za0 c;
    public final zx d;
    public final long e;
    public final long f;

    public bc3(Context context, Looper looper) {
        yq1 yq1Var = new yq1(1, this);
        this.b = context.getApplicationContext();
        za0 za0Var = new za0(looper, yq1Var, 3);
        Looper.getMainLooper();
        this.c = za0Var;
        this.d = zx.q();
        this.e = 5000L;
        this.f = 300000L;
    }

    public static bc3 a(Context context) {
        synchronized (g) {
            try {
                if (h == null) {
                    h = new bc3(context.getApplicationContext(), context.getMainLooper());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return h;
    }

    public final void b(String str, ServiceConnection serviceConnection, boolean z) {
        y93 y93Var = new y93(str, z);
        dq.g(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.a) {
            try {
                ha3 ha3Var = (ha3) this.a.get(y93Var);
                if (ha3Var == null) {
                    throw new IllegalStateException("Nonexistent connection status for service config: ".concat(y93Var.toString()));
                }
                if (!ha3Var.a.containsKey(serviceConnection)) {
                    throw new IllegalStateException("Trying to unbind a GmsServiceConnection  that was not bound before.  config=".concat(y93Var.toString()));
                }
                ha3Var.a.remove(serviceConnection);
                if (ha3Var.a.isEmpty()) {
                    this.c.sendMessageDelayed(this.c.obtainMessage(0, y93Var), this.e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean c(y93 y93Var, iu1 iu1Var, String str, Executor executor) {
        boolean z;
        synchronized (this.a) {
            try {
                ha3 ha3Var = (ha3) this.a.get(y93Var);
                if (executor == null) {
                    executor = null;
                }
                if (ha3Var == null) {
                    ha3Var = new ha3(this, y93Var);
                    ha3Var.a.put(iu1Var, iu1Var);
                    ha3Var.a(str, executor);
                    this.a.put(y93Var, ha3Var);
                } else {
                    this.c.removeMessages(0, y93Var);
                    if (ha3Var.a.containsKey(iu1Var)) {
                        throw new IllegalStateException("Trying to bind a GmsServiceConnection that was already connected before.  config=".concat(y93Var.toString()));
                    }
                    ha3Var.a.put(iu1Var, iu1Var);
                    int i2 = ha3Var.b;
                    if (i2 == 1) {
                        iu1Var.onServiceConnected(ha3Var.f, ha3Var.d);
                    } else if (i2 == 2) {
                        ha3Var.a(str, executor);
                    }
                }
                z = ha3Var.c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }
}
