package com.google.android.gms.ads;

import android.app.IntentService;
import android.content.Intent;
import android.os.RemoteException;
import defpackage.eh0;
import defpackage.es0;
import defpackage.j41;
import defpackage.jn;
import defpackage.k61;
import defpackage.ut0;

/* JADX INFO: loaded from: classes.dex */
public class AdService extends IntentService {
    public AdService() {
        super("AdService");
    }

    @Override // android.app.IntentService
    public final void onHandleIntent(Intent intent) {
        try {
            es0 es0Var = ut0.f.b;
            j41 j41Var = new j41();
            es0Var.getClass();
            ((k61) new eh0(es0Var, this, j41Var).d(this, false)).t0(intent);
        } catch (RemoteException e) {
            jn.M("RemoteException calling handleNotificationIntent: ".concat(e.toString()));
        }
    }
}
