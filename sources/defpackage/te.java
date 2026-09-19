package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class te implements z80, yh {
    public static final String o = yp.f("DelayMetCommandHandler");
    public final Context f;
    public final int g;
    public final String h;
    public final w20 i;
    public final a90 j;
    public PowerManager.WakeLock m;
    public boolean n = false;
    public int l = 0;
    public final Object k = new Object();

    public te(Context context, int i, String str, w20 w20Var) {
        this.f = context;
        this.g = i;
        this.i = w20Var;
        this.h = str;
        this.j = new a90(context, w20Var.g, this);
    }

    @Override // defpackage.yh
    public final void a(String str, boolean z) {
        yp.d().a(o, "onExecuted " + str + ", " + z, new Throwable[0]);
        d();
        int i = 2;
        int i2 = this.g;
        w20 w20Var = this.i;
        Context context = this.f;
        if (z) {
            Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
            intent.setAction("ACTION_SCHEDULE_WORK");
            intent.putExtra("KEY_WORKSPEC_ID", this.h);
            w20Var.e(new e6(w20Var, intent, i2, i));
        }
        if (this.n) {
            Intent intent2 = new Intent(context, (Class<?>) SystemAlarmService.class);
            intent2.setAction("ACTION_CONSTRAINTS_CHANGED");
            w20Var.e(new e6(w20Var, intent2, i2, i));
        }
    }

    @Override // defpackage.z80
    public final void b(ArrayList arrayList) {
        f();
    }

    @Override // defpackage.z80
    public final void c(List list) {
        if (list.contains(this.h)) {
            synchronized (this.k) {
                try {
                    if (this.l == 0) {
                        this.l = 1;
                        yp.d().a(o, "onAllConstraintsMet for " + this.h, new Throwable[0]);
                        if (this.i.i.e(this.h, null)) {
                            this.i.h.a(this.h, this);
                        } else {
                            d();
                        }
                    } else {
                        yp.d().a(o, "Already started work for " + this.h, new Throwable[0]);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final void d() {
        synchronized (this.k) {
            try {
                this.j.c();
                this.i.h.b(this.h);
                PowerManager.WakeLock wakeLock = this.m;
                if (wakeLock != null && wakeLock.isHeld()) {
                    yp.d().a(o, "Releasing wakelock " + this.m + " for WorkSpec " + this.h, new Throwable[0]);
                    this.m.release();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void e() {
        StringBuilder sb = new StringBuilder();
        String str = this.h;
        sb.append(str);
        sb.append(" (");
        sb.append(this.g);
        sb.append(")");
        this.m = r70.a(this.f, sb.toString());
        yp ypVarD = yp.d();
        PowerManager.WakeLock wakeLock = this.m;
        String str2 = o;
        ypVarD.a(str2, "Acquiring wakelock " + wakeLock + " for WorkSpec " + str, new Throwable[0]);
        this.m.acquire();
        j90 j90VarK = this.i.j.c.h().k(str);
        if (j90VarK == null) {
            f();
            return;
        }
        boolean zEquals = kb.i.equals(j90VarK.j);
        this.n = !zEquals;
        if (!zEquals) {
            this.j.b(Collections.singletonList(j90VarK));
            return;
        }
        yp.d().a(str2, "No constraints for " + str, new Throwable[0]);
        c(Collections.singletonList(str));
    }

    public final void f() {
        synchronized (this.k) {
            try {
                int i = 2;
                if (this.l < 2) {
                    this.l = 2;
                    yp ypVarD = yp.d();
                    String str = o;
                    ypVarD.a(str, "Stopping work for WorkSpec " + this.h, new Throwable[0]);
                    Context context = this.f;
                    String str2 = this.h;
                    Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
                    intent.setAction("ACTION_STOP_WORK");
                    intent.putExtra("KEY_WORKSPEC_ID", str2);
                    w20 w20Var = this.i;
                    w20Var.e(new e6(w20Var, intent, this.g, i));
                    if (this.i.i.c(this.h)) {
                        yp.d().a(str, "WorkSpec " + this.h + " needs to be rescheduled", new Throwable[0]);
                        Context context2 = this.f;
                        String str3 = this.h;
                        Intent intent2 = new Intent(context2, (Class<?>) SystemAlarmService.class);
                        intent2.setAction("ACTION_SCHEDULE_WORK");
                        intent2.putExtra("KEY_WORKSPEC_ID", str3);
                        w20 w20Var2 = this.i;
                        w20Var2.e(new e6(w20Var2, intent2, this.g, i));
                    } else {
                        yp.d().a(str, "Processor does not have WorkSpec " + this.h + ". No need to reschedule ", new Throwable[0]);
                    }
                } else {
                    yp.d().a(o, "Already stopped work for " + this.h, new Throwable[0]);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
