package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import defpackage.d60;
import defpackage.dq;
import defpackage.er;
import defpackage.in2;
import defpackage.jn;
import defpackage.kr;
import defpackage.lx0;
import defpackage.md;
import defpackage.q41;
import defpackage.r52;
import defpackage.r91;
import defpackage.ra1;
import defpackage.tu0;
import defpackage.un1;
import defpackage.vc3;
import defpackage.xx0;
import defpackage.y51;
import defpackage.zb3;

/* JADX INFO: loaded from: classes.dex */
public final class zzbub implements MediationInterstitialAdapter {
    public Activity a;
    public kr b;
    public Uri c;

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter, com.google.android.gms.ads.mediation.MediationNativeAdapter
    public final void onDestroy() {
        jn.F("Destroying AdMobCustomTabsAdapter adapter.");
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter, com.google.android.gms.ads.mediation.MediationNativeAdapter
    public final void onPause() {
        jn.F("Pausing AdMobCustomTabsAdapter adapter.");
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter, com.google.android.gms.ads.mediation.MediationNativeAdapter
    public final void onResume() {
        jn.F("Resuming AdMobCustomTabsAdapter adapter.");
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public final void requestInterstitialAd(Context context, kr krVar, Bundle bundle, er erVar, Bundle bundle2) {
        this.b = krVar;
        if (krVar == null) {
            jn.T("Listener not set for mediation. Returning.");
            return;
        }
        if (!(context instanceof Activity)) {
            jn.T("AdMobCustomTabs can only work with Activity context. Bailing out.");
            ((r52) this.b).s();
            return;
        }
        if (!xx0.a(context)) {
            jn.T("Default browser does not support custom tabs. Bailing out.");
            ((r52) this.b).s();
            return;
        }
        String string = bundle.getString("tab_url");
        if (TextUtils.isEmpty(string)) {
            jn.T("The tab_url retrieved from mediation metadata is empty. Bailing out.");
            ((r52) this.b).s();
            return;
        }
        this.a = (Activity) context;
        this.c = Uri.parse(string);
        r52 r52Var = (r52) this.b;
        r52Var.getClass();
        dq.d("#008 Must be called on the main UI thread.");
        jn.F("Adapter called onAdLoaded.");
        try {
            ((q41) r52Var.g).g();
        } catch (RemoteException e) {
            jn.Z("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public final void showInterstitial() {
        un1 un1VarA = new md().a();
        ((Intent) un1VarA.g).setData(this.c);
        zb3.l.post(new in2(this, new AdOverlayInfoParcel(new r91((Intent) un1VarA.g, null), null, new y51(this), null, new d60(0, 0, false), null, null, ""), 24, false));
        vc3 vc3Var = vc3.C;
        ra1 ra1Var = vc3Var.h.m;
        ra1Var.getClass();
        vc3Var.k.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (ra1Var.a) {
            try {
                if (ra1Var.c == 3) {
                    if (ra1Var.b + ((Long) tu0.e.c.a(lx0.q6)).longValue() <= jCurrentTimeMillis) {
                        ra1Var.c = 1;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        vc3Var.k.getClass();
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        synchronized (ra1Var.a) {
            try {
                if (ra1Var.c != 2) {
                    return;
                }
                ra1Var.c = 3;
                if (ra1Var.c == 3) {
                    ra1Var.b = jCurrentTimeMillis2;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
