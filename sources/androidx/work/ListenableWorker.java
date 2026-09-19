package androidx.work;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Network;
import android.net.Uri;
import androidx.annotation.Keep;
import defpackage.fj;
import defpackage.hp;
import defpackage.j7;
import defpackage.l30;
import defpackage.o90;
import defpackage.qd;
import defpackage.xz;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public abstract class ListenableWorker {
    public final Context f;
    public final WorkerParameters g;
    public volatile boolean h;
    public boolean i;
    public boolean j;

    @Keep
    @SuppressLint({"BanKeepAnnotation"})
    public ListenableWorker(Context context, WorkerParameters workerParameters) {
        if (context == null) {
            j7.p("Application Context is null");
            throw null;
        }
        if (workerParameters == null) {
            j7.p("WorkerParameters is null");
            throw null;
        }
        this.f = context;
        this.g = workerParameters;
    }

    public final Context getApplicationContext() {
        return this.f;
    }

    public Executor getBackgroundExecutor() {
        return null;
    }

    public hp getForegroundInfoAsync() {
        xz xzVar = new xz();
        xzVar.j(new IllegalStateException("Expedited WorkRequests require a ListenableWorker to provide an implementation for `getForegroundInfoAsync()`"));
        return xzVar;
    }

    public final UUID getId() {
        return null;
    }

    public final qd getInputData() {
        return null;
    }

    public final Network getNetwork() {
        throw null;
    }

    public final int getRunAttemptCount() {
        return 0;
    }

    public final Set<String> getTags() {
        return null;
    }

    public l30 getTaskExecutor() {
        return null;
    }

    public final List<String> getTriggeredContentAuthorities() {
        throw null;
    }

    public final List<Uri> getTriggeredContentUris() {
        throw null;
    }

    public o90 getWorkerFactory() {
        return null;
    }

    public boolean isRunInForeground() {
        return this.j;
    }

    public final boolean isStopped() {
        return this.h;
    }

    public final boolean isUsed() {
        return this.i;
    }

    public void onStopped() {
    }

    public final hp setForegroundAsync(fj fjVar) {
        this.j = true;
        getApplicationContext();
        getId();
        throw null;
    }

    public hp setProgressAsync(qd qdVar) {
        getApplicationContext();
        getId();
        throw null;
    }

    public void setRunInForeground(boolean z) {
        this.j = z;
    }

    public final void setUsed() {
        this.i = true;
    }

    public final void stop() {
        this.h = true;
        onStopped();
    }
}
