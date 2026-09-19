package defpackage;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class ia implements yh {
    public static final String i = yp.f("CommandHandler");
    public final Context f;
    public final HashMap g = new HashMap();
    public final Object h = new Object();

    public ia(Context context) {
        this.f = context;
    }

    @Override // defpackage.yh
    public final void a(String str, boolean z) {
        synchronized (this.h) {
            try {
                yh yhVar = (yh) this.g.remove(str);
                if (yhVar != null) {
                    yhVar.a(str, z);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(Intent intent, int i2, w20 w20Var) {
        ArrayList arrayListA;
        String action = intent.getAction();
        dq dqVar = null;
        int i3 = 0;
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            yp.d().a(i, String.format("Handling constraints changed %s", intent), new Throwable[0]);
            new lb(this.f, i2, w20Var);
            w20Var.j.c.h().getClass();
            yx.c("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 AND schedule_requested_at<>-1", 0);
            throw null;
        }
        if ("ACTION_RESCHEDULE".equals(action)) {
            yp.d().a(i, String.format("Handling reschedule %s, %s", intent, Integer.valueOf(i2)), new Throwable[0]);
            g90 g90Var = w20Var.j;
            Context context = g90Var.a;
            String str = z20.f;
            JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
            if (jobScheduler != null && (arrayListA = z20.a(context, jobScheduler)) != null && !arrayListA.isEmpty()) {
                int size = arrayListA.size();
                while (i3 < size) {
                    Object obj = arrayListA.get(i3);
                    i3++;
                    int id = ((JobInfo) obj).getId();
                    try {
                        jobScheduler.cancel(id);
                    } catch (Throwable th) {
                        yp.d().c(z20.f, String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", Integer.valueOf(id)), th);
                    }
                }
            }
            g90Var.c.h().getClass();
            throw null;
        }
        Bundle extras = intent.getExtras();
        String[] strArr = {"KEY_WORKSPEC_ID"};
        if (extras == null || extras.isEmpty() || extras.get(strArr[0]) == null) {
            yp.d().c(i, ec.i("Invalid request for ", action, ", requires KEY_WORKSPEC_ID."), new Throwable[0]);
            return;
        }
        if ("ACTION_SCHEDULE_WORK".equals(action)) {
            String string = intent.getExtras().getString("KEY_WORKSPEC_ID");
            yp.d().a(i, "Handling schedule work for " + string, new Throwable[0]);
            w20Var.j.c.b();
            throw null;
        }
        if ("ACTION_DELAY_MET".equals(action)) {
            Bundle extras2 = intent.getExtras();
            synchronized (this.h) {
                try {
                    String string2 = extras2.getString("KEY_WORKSPEC_ID");
                    yp ypVarD = yp.d();
                    String str2 = i;
                    ypVarD.a(str2, "Handing delay met for " + string2, new Throwable[0]);
                    if (this.g.containsKey(string2)) {
                        yp.d().a(str2, "WorkSpec " + string2 + " is already being handled for ACTION_DELAY_MET", new Throwable[0]);
                    } else {
                        te teVar = new te(this.f, i2, string2, w20Var);
                        this.g.put(string2, teVar);
                        teVar.e();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return;
        }
        if (!"ACTION_STOP_WORK".equals(action)) {
            if (!"ACTION_EXECUTION_COMPLETED".equals(action)) {
                yp.d().g(i, String.format("Ignoring intent %s", intent), new Throwable[0]);
                return;
            }
            Bundle extras3 = intent.getExtras();
            String string3 = extras3.getString("KEY_WORKSPEC_ID");
            boolean z = extras3.getBoolean("KEY_NEEDS_RESCHEDULE");
            yp.d().a(i, String.format("Handling onExecutionCompleted %s, %s", intent, Integer.valueOf(i2)), new Throwable[0]);
            a(string3, z);
            return;
        }
        String string4 = intent.getExtras().getString("KEY_WORKSPEC_ID");
        yp.d().a(i, "Handing stopWork work for " + string4, new Throwable[0]);
        w20Var.j.f(string4);
        Context context2 = this.f;
        g90 g90Var2 = w20Var.j;
        String str3 = y2.a;
        g90Var2.c.e();
        if (dqVar.k(string4) == null) {
            w20Var.a(string4, false);
            return;
        }
        AlarmManager alarmManager = (AlarmManager) context2.getSystemService("alarm");
        Intent intent2 = new Intent(context2, (Class<?>) SystemAlarmService.class);
        intent2.setAction("ACTION_DELAY_MET");
        intent2.putExtra("KEY_WORKSPEC_ID", string4);
        PendingIntent service = PendingIntent.getService(context2, 0, intent2, 603979776);
        if (service != null && alarmManager != null) {
            yp.d().a(y2.a, "Cancelling existing alarm with (workSpecId, systemId) (" + string4 + ", 0)", new Throwable[0]);
            alarmManager.cancel(service);
        }
        yp.d().a(y2.a, ec.i("Removing SystemIdInfo for workSpecId (", string4, ")"), new Throwable[0]);
        throw null;
    }
}
