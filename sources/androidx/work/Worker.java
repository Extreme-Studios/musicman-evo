package androidx.work;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import defpackage.hp;
import defpackage.kp;
import defpackage.q7;
import defpackage.xz;

/* JADX INFO: loaded from: classes.dex */
public abstract class Worker extends ListenableWorker {
    public xz k;

    @Keep
    @SuppressLint({"BanKeepAnnotation"})
    public Worker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    public abstract kp doWork();

    public final hp startWork() {
        this.k = new xz();
        getBackgroundExecutor().execute(new q7(10, this));
        return this.k;
    }
}
