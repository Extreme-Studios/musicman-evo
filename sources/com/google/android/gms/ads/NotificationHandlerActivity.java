package com.google.android.gms.ads;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import defpackage.eh0;
import defpackage.es0;
import defpackage.j41;
import defpackage.jn;
import defpackage.k61;
import defpackage.ut0;

/* JADX INFO: loaded from: classes.dex */
public final class NotificationHandlerActivity extends Activity {
    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            es0 es0Var = ut0.f.b;
            j41 j41Var = new j41();
            es0Var.getClass();
            k61 k61Var = (k61) new eh0(es0Var, this, j41Var).d(this, false);
            if (k61Var == null) {
                jn.M("OfflineUtils is null");
            } else {
                k61Var.t0(getIntent());
            }
        } catch (RemoteException e) {
            jn.M("RemoteException calling handleNotificationIntent: ".concat(e.toString()));
        }
    }

    @Override // android.app.Activity
    public final void onResume() {
        super.onResume();
        finish();
    }
}
