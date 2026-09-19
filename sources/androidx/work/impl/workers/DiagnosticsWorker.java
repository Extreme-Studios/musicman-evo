package androidx.work.impl.workers;

import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import defpackage.dq;
import defpackage.g90;
import defpackage.i8;
import defpackage.j90;
import defpackage.kp;
import defpackage.yd;
import defpackage.yp;
import defpackage.yx;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class DiagnosticsWorker extends Worker {
    public static final String l = yp.f("DiagnosticsWrkr");

    public DiagnosticsWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    public static String a(dq dqVar, yd ydVar, dq dqVar2, ArrayList arrayList) {
        StringBuilder sb = new StringBuilder("\n Id \t Class Name\t Job Id\t State\t Unique Name\t Tags\t");
        if (arrayList.size() <= 0) {
            return sb.toString();
        }
        j90 j90Var = (j90) arrayList.get(0);
        dqVar2.k(j90Var.a);
        String str = j90Var.a;
        dqVar.getClass();
        yx yxVarC = yx.c("SELECT name FROM workname WHERE work_spec_id=?", 1);
        if (str == null) {
            yxVarC.k[1] = 1;
        } else {
            yxVarC.k[1] = 4;
            yxVarC.i[1] = str;
        }
        throw null;
    }

    @Override // androidx.work.Worker
    public final kp doWork() {
        WorkDatabase workDatabase = g90.b(getApplicationContext()).c;
        i8 i8VarH = workDatabase.h();
        workDatabase.f();
        workDatabase.i();
        workDatabase.e();
        long jCurrentTimeMillis = System.currentTimeMillis() - 86400000;
        i8VarH.getClass();
        yx yxVarC = yx.c("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE period_start_time >= ? AND state IN (2, 3, 5) ORDER BY period_start_time DESC", 1);
        yxVarC.k[1] = 2;
        yxVarC.g[1] = jCurrentTimeMillis;
        throw null;
    }
}
