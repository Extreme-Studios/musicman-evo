package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.text.TextUtils;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import java.util.ArrayList;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class w20 implements yh {
    public static final String p = yp.f("SystemAlarmDispatcher");
    public final Context f;
    public final l30 g;
    public final m90 h;
    public final yv i;
    public final g90 j;
    public final ia k;
    public final Handler l;
    public final ArrayList m;
    public Intent n;
    public SystemAlarmService o;

    public w20(SystemAlarmService systemAlarmService) {
        Context applicationContext = systemAlarmService.getApplicationContext();
        this.f = applicationContext;
        this.k = new ia(applicationContext);
        this.h = new m90();
        g90 g90VarB = g90.b(systemAlarmService);
        this.j = g90VarB;
        yv yvVar = g90VarB.e;
        this.i = yvVar;
        this.g = g90VarB.d;
        yvVar.b(this);
        this.m = new ArrayList();
        this.n = null;
        this.l = new Handler(Looper.getMainLooper());
    }

    @Override // defpackage.yh
    public final void a(String str, boolean z) {
        String str2 = ia.i;
        Intent intent = new Intent(this.f, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_EXECUTION_COMPLETED");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        intent.putExtra("KEY_NEEDS_RESCHEDULE", z);
        e(new e6(this, intent, 0, 2));
    }

    public final void b(Intent intent, int i) {
        yp ypVarD = yp.d();
        String str = p;
        int i2 = 0;
        ypVarD.a(str, String.format("Adding command %s (%s)", intent, Integer.valueOf(i)), new Throwable[0]);
        c();
        String action = intent.getAction();
        if (TextUtils.isEmpty(action)) {
            yp.d().g(str, "Unknown command. Ignoring", new Throwable[0]);
            return;
        }
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            c();
            synchronized (this.m) {
                try {
                    ArrayList arrayList = this.m;
                    int size = arrayList.size();
                    while (i2 < size) {
                        Object obj = arrayList.get(i2);
                        i2++;
                        if ("ACTION_CONSTRAINTS_CHANGED".equals(((Intent) obj).getAction())) {
                            return;
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        intent.putExtra("KEY_START_ID", i);
        synchronized (this.m) {
            try {
                boolean zIsEmpty = this.m.isEmpty();
                this.m.add(intent);
                if (zIsEmpty) {
                    f();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void c() {
        if (this.l.getLooper().getThread() == Thread.currentThread()) {
            return;
        }
        j7.e("Needs to be invoked on the main thread.");
    }

    public final void d() {
        yp.d().a(p, "Destroying SystemAlarmDispatcher", new Throwable[0]);
        this.i.d(this);
        ScheduledExecutorService scheduledExecutorService = this.h.a;
        if (!scheduledExecutorService.isShutdown()) {
            scheduledExecutorService.shutdownNow();
        }
        this.o = null;
    }

    public final void e(Runnable runnable) {
        this.l.post(runnable);
    }

    public final void f() {
        c();
        PowerManager.WakeLock wakeLockA = r70.a(this.f, "ProcessCommand");
        try {
            wakeLockA.acquire();
            this.j.d.i(new v20(this, 0));
        } finally {
            wakeLockA.release();
        }
    }
}
