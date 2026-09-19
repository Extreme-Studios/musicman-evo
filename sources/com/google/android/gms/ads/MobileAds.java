package com.google.android.gms.ads;

import android.os.RemoteException;
import defpackage.b22;
import defpackage.hl1;
import defpackage.jn;

/* JADX INFO: loaded from: classes.dex */
public class MobileAds {
    private static void setPlugin(String str) {
        b22 b22VarC = b22.c();
        synchronized (b22VarC.e) {
            hl1 hl1Var = b22VarC.f;
            if (!(hl1Var != null)) {
                throw new IllegalStateException("MobileAds.initialize() must be called prior to setting the plugin.");
            }
            try {
                hl1Var.i0(str);
            } catch (RemoteException e) {
                jn.P("Unable to set plugin.", e);
            }
        }
    }
}
