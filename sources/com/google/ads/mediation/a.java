package com.google.ads.mediation;

import android.os.RemoteException;
import defpackage.dq;
import defpackage.e31;
import defpackage.fx0;
import defpackage.in;
import defpackage.jn;
import defpackage.kr;
import defpackage.n71;
import defpackage.np;
import defpackage.q41;
import defpackage.r52;
import defpackage.y6;
import defpackage.zs;

/* JADX INFO: loaded from: classes.dex */
public final class a extends y6 {
    public final AbstractAdViewAdapter C;
    public final kr D;

    public a(AbstractAdViewAdapter abstractAdViewAdapter, kr krVar) {
        this.C = abstractAdViewAdapter;
        this.D = krVar;
    }

    @Override // defpackage.i8
    public final void n(np npVar) {
        ((r52) this.D).u(npVar);
    }

    @Override // defpackage.i8
    public final void o(Object obj) {
        in inVar = (in) obj;
        AbstractAdViewAdapter abstractAdViewAdapter = this.C;
        abstractAdViewAdapter.mInterstitialAd = inVar;
        kr krVar = this.D;
        zs zsVar = new zs(abstractAdViewAdapter, krVar);
        e31 e31Var = (e31) inVar;
        e31Var.getClass();
        try {
            n71 n71Var = e31Var.c;
            if (n71Var != null) {
                n71Var.p2(new fx0(zsVar));
            }
        } catch (RemoteException e) {
            jn.Z("#007 Could not call remote method.", e);
        }
        r52 r52Var = (r52) krVar;
        r52Var.getClass();
        dq.d("#008 Must be called on the main UI thread.");
        jn.F("Adapter called onAdLoaded.");
        try {
            ((q41) r52Var.g).g();
        } catch (RemoteException e2) {
            jn.Z("#007 Could not call remote method.", e2);
        }
    }
}
