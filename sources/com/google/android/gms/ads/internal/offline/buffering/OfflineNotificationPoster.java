package com.google.android.gms.ads.internal.offline.buffering;

import android.content.Context;
import android.os.RemoteException;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import defpackage.eh0;
import defpackage.es0;
import defpackage.ip;
import defpackage.j41;
import defpackage.jb0;
import defpackage.jp;
import defpackage.ju;
import defpackage.k61;
import defpackage.kp;
import defpackage.qd;
import defpackage.ut0;

/* JADX INFO: loaded from: classes.dex */
public class OfflineNotificationPoster extends Worker {
    public final k61 l;

    public OfflineNotificationPoster(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        es0 es0Var = ut0.f.b;
        j41 j41Var = new j41();
        es0Var.getClass();
        this.l = (k61) new eh0(es0Var, context, j41Var).d(context, false);
    }

    @Override // androidx.work.Worker
    public final kp doWork() {
        try {
            this.l.E2(new ju(getApplicationContext()), new jb0(getInputData().b("uri"), getInputData().b("gws_query_id"), getInputData().b("image_url")));
            return new jp(qd.c);
        } catch (RemoteException unused) {
            return new ip();
        }
    }
}
