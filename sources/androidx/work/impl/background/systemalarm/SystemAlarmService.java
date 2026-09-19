package androidx.work.impl.background.systemalarm;

import android.content.Intent;
import android.os.PowerManager;
import defpackage.po;
import defpackage.r70;
import defpackage.w20;
import defpackage.yp;
import java.util.HashMap;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class SystemAlarmService extends po {
    public static final String i = yp.f("SystemAlarmService");
    public w20 g;
    public boolean h;

    public final void a() {
        this.h = true;
        yp.d().a(i, "All commands completed in dispatcher", new Throwable[0]);
        String str = r70.a;
        HashMap map = new HashMap();
        WeakHashMap weakHashMap = r70.b;
        synchronized (weakHashMap) {
            map.putAll(weakHashMap);
        }
        for (PowerManager.WakeLock wakeLock : map.keySet()) {
            if (wakeLock != null && wakeLock.isHeld()) {
                yp.d().g(r70.a, String.format("WakeLock held for %s", map.get(wakeLock)), new Throwable[0]);
            }
        }
        stopSelf();
    }

    @Override // defpackage.po, android.app.Service
    public final void onCreate() {
        super.onCreate();
        w20 w20Var = new w20(this);
        this.g = w20Var;
        if (w20Var.o != null) {
            yp.d().c(w20.p, "A completion listener for SystemAlarmDispatcher already exists.", new Throwable[0]);
        } else {
            w20Var.o = this;
        }
        this.h = false;
    }

    @Override // defpackage.po, android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        this.h = true;
        this.g.d();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i2, int i3) {
        super.onStartCommand(intent, i2, i3);
        if (this.h) {
            yp.d().e(i, "Re-initializing SystemAlarmDispatcher after a request to shut-down.", new Throwable[0]);
            this.g.d();
            w20 w20Var = new w20(this);
            this.g = w20Var;
            if (w20Var.o != null) {
                yp.d().c(w20.p, "A completion listener for SystemAlarmDispatcher already exists.", new Throwable[0]);
            } else {
                w20Var.o = this;
            }
            this.h = false;
        }
        if (intent == null) {
            return 3;
        }
        this.g.b(intent, i3);
        return 3;
    }
}
