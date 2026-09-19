package androidx.work.impl.foreground;

import android.app.NotificationManager;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.work.impl.WorkDatabase;
import defpackage.g90;
import defpackage.ib;
import defpackage.po;
import defpackage.r52;
import defpackage.v8;
import defpackage.x20;
import defpackage.yp;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public class SystemForegroundService extends po {
    public static final String k = yp.f("SystemFgService");
    public Handler g;
    public boolean h;
    public x20 i;
    public NotificationManager j;

    public final void a() {
        this.g = new Handler(Looper.getMainLooper());
        this.j = (NotificationManager) getApplicationContext().getSystemService("notification");
        x20 x20Var = new x20(getApplicationContext());
        this.i = x20Var;
        if (x20Var.n != null) {
            yp.d().c(x20.o, "A callback already exists.", new Throwable[0]);
        } else {
            x20Var.n = this;
        }
    }

    @Override // defpackage.po, android.app.Service
    public final void onCreate() {
        super.onCreate();
        a();
    }

    @Override // defpackage.po, android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        this.i.e();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        boolean z = this.h;
        String str = k;
        if (z) {
            yp.d().e(str, "Re-initializing SystemForegroundService after a request to shut-down.", new Throwable[0]);
            this.i.e();
            a();
            this.h = false;
        }
        if (intent == null) {
            return 3;
        }
        x20 x20Var = this.i;
        g90 g90Var = x20Var.f;
        String str2 = x20.o;
        String action = intent.getAction();
        if ("ACTION_START_FOREGROUND".equals(action)) {
            yp.d().e(str2, String.format("Started foreground service %s", intent), new Throwable[0]);
            String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
            WorkDatabase workDatabase = g90Var.c;
            ((r52) x20Var.g).i(new ib(4, x20Var, workDatabase, stringExtra));
            x20Var.d(intent);
            return 3;
        }
        if ("ACTION_NOTIFY".equals(action)) {
            x20Var.d(intent);
            return 3;
        }
        if ("ACTION_CANCEL_WORK".equals(action)) {
            yp.d().e(str2, String.format("Stopping foreground work for %s", intent), new Throwable[0]);
            String stringExtra2 = intent.getStringExtra("KEY_WORKSPEC_ID");
            if (stringExtra2 == null || TextUtils.isEmpty(stringExtra2)) {
                return 3;
            }
            UUID uuidFromString = UUID.fromString(stringExtra2);
            g90Var.getClass();
            g90Var.d.i(new v8(g90Var, uuidFromString));
            return 3;
        }
        if (!"ACTION_STOP_FOREGROUND".equals(action)) {
            return 3;
        }
        yp.d().e(str2, "Stopping foreground service", new Throwable[0]);
        SystemForegroundService systemForegroundService = x20Var.n;
        if (systemForegroundService == null) {
            return 3;
        }
        systemForegroundService.h = true;
        yp.d().a(str, "All commands completed.", new Throwable[0]);
        if (Build.VERSION.SDK_INT >= 26) {
            systemForegroundService.stopForeground(true);
        }
        systemForegroundService.stopSelf();
        return 3;
    }
}
