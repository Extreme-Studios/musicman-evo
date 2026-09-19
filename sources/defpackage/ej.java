package defpackage;

import android.app.job.JobScheduler;
import android.content.Context;
import android.database.sqlite.SQLiteAccessPermException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteConstraintException;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteTableLockedException;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public final class ej implements Runnable {
    public static final String i = yp.f("ForceStopRunnable");
    public static final long j = 315360000000L;
    public final Context f;
    public final g90 g;
    public int h = 0;

    public ej(Context context, g90 g90Var) {
        this.f = context.getApplicationContext();
        this.g = g90Var;
    }

    public final void a() {
        String str = z20.f;
        Context context = this.f;
        z20.a(context, (JobScheduler) context.getSystemService("jobscheduler"));
        this.g.c.e().getClass();
        yx.c("SELECT DISTINCT work_spec_id FROM SystemIdInfo", 0);
        throw null;
    }

    public final boolean b() {
        g2 g2Var = this.g.b;
        g2Var.getClass();
        boolean zIsEmpty = TextUtils.isEmpty(null);
        String str = i;
        if (zIsEmpty) {
            yp.d().a(str, "The default process name was not specified.", new Throwable[0]);
            return true;
        }
        boolean zA = xv.a(this.f, g2Var);
        yp.d().a(str, "Is default app process = " + zA, new Throwable[0]);
        return zA;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str = i;
        g90 g90Var = this.g;
        try {
            if (!b()) {
                g90Var.d();
                return;
            }
            while (true) {
                f90.a(this.f);
                yp.d().a(str, "Performing cleanup operations.", new Throwable[0]);
                try {
                    a();
                    throw null;
                } catch (SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteTableLockedException e) {
                    int i2 = this.h + 1;
                    this.h = i2;
                    if (i2 >= 3) {
                        yp.d().c(str, "The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e);
                        IllegalStateException illegalStateException = new IllegalStateException("The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e);
                        g90Var.b.getClass();
                        throw illegalStateException;
                    }
                    long j2 = ((long) i2) * 300;
                    yp.d().a(str, "Retrying after " + j2, e);
                    try {
                        Thread.sleep(((long) this.h) * 300);
                    } catch (InterruptedException unused) {
                    }
                }
            }
        } catch (Throwable th) {
            g90Var.d();
            throw th;
        }
    }
}
