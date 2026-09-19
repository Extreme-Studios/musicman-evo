package androidx.work.impl.background.systemjob;

import android.app.Application;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.os.Build;
import android.os.PersistableBundle;
import android.text.TextUtils;
import defpackage.g90;
import defpackage.ig;
import defpackage.j7;
import defpackage.yh;
import defpackage.yp;
import defpackage.yv;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class SystemJobService extends JobService implements yh {
    public static final String h = yp.f("SystemJobService");
    public g90 f;
    public final HashMap g = new HashMap();

    @Override // defpackage.yh
    public final void a(String str, boolean z) {
        JobParameters jobParameters;
        yp.d().a(h, str + " executed on JobScheduler", new Throwable[0]);
        synchronized (this.g) {
            jobParameters = (JobParameters) this.g.remove(str);
        }
        if (jobParameters != null) {
            jobFinished(jobParameters, z);
        }
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        try {
            g90 g90VarB = g90.b(getApplicationContext());
            this.f = g90VarB;
            g90VarB.e.b(this);
        } catch (IllegalStateException unused) {
            if (!Application.class.equals(getApplication().getClass())) {
                j7.e("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().");
            } else {
                yp.d().g(h, "Could not find WorkManager instance; this may be because an auto-backup is in progress. Ignoring JobScheduler commands for now. Please make sure that you are initializing WorkManager if you have manually disabled WorkManagerInitializer.", new Throwable[0]);
            }
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        g90 g90Var = this.f;
        if (g90Var != null) {
            g90Var.e.d(this);
        }
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        String string;
        if (this.f == null) {
            yp.d().a(h, "WorkManager is not initialized; requesting retry.", new Throwable[0]);
            jobFinished(jobParameters, true);
            return false;
        }
        try {
            PersistableBundle extras = jobParameters.getExtras();
            string = (extras == null || !extras.containsKey("EXTRA_WORK_SPEC_ID")) ? null : extras.getString("EXTRA_WORK_SPEC_ID");
        } catch (NullPointerException unused) {
        }
        if (TextUtils.isEmpty(string)) {
            yp.d().c(h, "WorkSpec id not found!", new Throwable[0]);
            return false;
        }
        synchronized (this.g) {
            try {
                if (this.g.containsKey(string)) {
                    yp.d().a(h, "Job is already being executed by SystemJobService: " + string, new Throwable[0]);
                    return false;
                }
                yp.d().a(h, "onStartJob for " + string, new Throwable[0]);
                this.g.put(string, jobParameters);
                ig igVar = new ig();
                if (jobParameters.getTriggeredContentUris() != null) {
                    Arrays.asList(jobParameters.getTriggeredContentUris());
                }
                if (jobParameters.getTriggeredContentAuthorities() != null) {
                    Arrays.asList(jobParameters.getTriggeredContentAuthorities());
                }
                if (Build.VERSION.SDK_INT >= 28) {
                    jobParameters.getNetwork();
                }
                this.f.e(string, igVar);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        String string;
        boolean zContains;
        if (this.f == null) {
            yp.d().a(h, "WorkManager is not initialized; requesting retry.", new Throwable[0]);
            return true;
        }
        try {
            PersistableBundle extras = jobParameters.getExtras();
            string = (extras == null || !extras.containsKey("EXTRA_WORK_SPEC_ID")) ? null : extras.getString("EXTRA_WORK_SPEC_ID");
        } catch (NullPointerException unused) {
        }
        if (TextUtils.isEmpty(string)) {
            yp.d().c(h, "WorkSpec id not found!", new Throwable[0]);
            return false;
        }
        yp.d().a(h, "onStopJob for " + string, new Throwable[0]);
        synchronized (this.g) {
            this.g.remove(string);
        }
        this.f.f(string);
        yv yvVar = this.f.e;
        synchronized (yvVar.m) {
            zContains = yvVar.k.contains(string);
        }
        return !zContains;
    }
}
