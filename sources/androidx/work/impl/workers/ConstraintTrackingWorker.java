package androidx.work.impl.workers;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import defpackage.g90;
import defpackage.l30;
import defpackage.yp;
import defpackage.z80;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class ConstraintTrackingWorker extends ListenableWorker implements z80 {
    public static final String l = yp.f("ConstraintTrkngWrkr");
    public final Object k;

    public ConstraintTrackingWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.k = new Object();
    }

    @Override // defpackage.z80
    public final void b(ArrayList arrayList) {
        yp.d().a(l, String.format("Constraints changed for %s", arrayList), new Throwable[0]);
        synchronized (this.k) {
        }
    }

    @Override // defpackage.z80
    public final void c(List list) {
    }

    @Override // androidx.work.ListenableWorker
    public final l30 getTaskExecutor() {
        return g90.b(getApplicationContext()).d;
    }

    @Override // androidx.work.ListenableWorker
    public final boolean isRunInForeground() {
        return false;
    }

    @Override // androidx.work.ListenableWorker
    public final void onStopped() {
        super.onStopped();
    }
}
