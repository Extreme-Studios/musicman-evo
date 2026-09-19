package com.google.ads.mediation;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import defpackage.d51;
import defpackage.e31;
import defpackage.ee2;
import defpackage.er;
import defpackage.et;
import defpackage.f11;
import defpackage.f32;
import defpackage.ft;
import defpackage.g11;
import defpackage.h11;
import defpackage.h60;
import defpackage.ht;
import defpackage.hv1;
import defpackage.i6;
import defpackage.in;
import defpackage.ir;
import defpackage.j2;
import defpackage.j60;
import defpackage.jn;
import defpackage.ju1;
import defpackage.k2;
import defpackage.kr;
import defpackage.m51;
import defpackage.mr;
import defpackage.n71;
import defpackage.p2;
import defpackage.p83;
import defpackage.q2;
import defpackage.qz0;
import defpackage.s2;
import defpackage.ut0;
import defpackage.ys0;
import defpackage.zd2;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractAdViewAdapter implements MediationBannerAdapter, MediationInterstitialAdapter, MediationNativeAdapter {
    public static final String AD_UNIT_ID_PARAMETER = "pubid";
    private k2 adLoader;
    protected AdView mAdView;
    protected in mInterstitialAd;

    public q2 buildAdRequest(Context context, er erVar, Bundle bundle, Bundle bundle2) {
        p2 p2Var = new p2(1);
        i6 i6Var = (i6) p2Var.f;
        Set setC = erVar.c();
        if (setC != null) {
            Iterator it = setC.iterator();
            while (it.hasNext()) {
                ((HashSet) i6Var.d).add((String) it.next());
            }
        }
        if (erVar.b()) {
            f32 f32Var = ut0.f.a;
            ((HashSet) i6Var.g).add(f32.c(context));
        }
        if (erVar.d() != -1) {
            i6Var.a = erVar.d() != 1 ? 0 : 1;
        }
        i6Var.b = erVar.a();
        p2Var.f1(buildExtrasBundle(bundle, bundle2));
        return new q2(p2Var);
    }

    public abstract Bundle buildExtrasBundle(Bundle bundle, Bundle bundle2);

    public String getAdUnitId(Bundle bundle) {
        return bundle.getString(AD_UNIT_ID_PARAMETER);
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter
    public View getBannerView() {
        return this.mAdView;
    }

    public in getInterstitialAd() {
        return this.mInterstitialAd;
    }

    public hv1 getVideoController() {
        hv1 hv1Var;
        AdView adView = this.mAdView;
        if (adView == null) {
            return null;
        }
        h60 h60Var = adView.f.c;
        synchronized (h60Var.a) {
            hv1Var = h60Var.b;
        }
        return hv1Var;
    }

    public j2 newAdLoader(Context context, String str) {
        return new j2(context, str);
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter, defpackage.fr, com.google.android.gms.ads.mediation.MediationInterstitialAdapter, com.google.android.gms.ads.mediation.MediationNativeAdapter
    public void onDestroy() {
        AdView adView = this.mAdView;
        if (adView != null) {
            adView.a();
            this.mAdView = null;
        }
        if (this.mInterstitialAd != null) {
            this.mInterstitialAd = null;
        }
        if (this.adLoader != null) {
            this.adLoader = null;
        }
    }

    public void onImmersiveModeUpdated(boolean z) {
        in inVar = this.mInterstitialAd;
        if (inVar != null) {
            try {
                n71 n71Var = ((e31) inVar).c;
                if (n71Var != null) {
                    n71Var.u1(z);
                }
            } catch (RemoteException e) {
                jn.Z("#007 Could not call remote method.", e);
            }
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter, defpackage.fr, com.google.android.gms.ads.mediation.MediationInterstitialAdapter, com.google.android.gms.ads.mediation.MediationNativeAdapter
    public void onPause() {
        AdView adView = this.mAdView;
        if (adView != null) {
            adView.c();
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter, defpackage.fr, com.google.android.gms.ads.mediation.MediationInterstitialAdapter, com.google.android.gms.ads.mediation.MediationNativeAdapter
    public void onResume() {
        AdView adView = this.mAdView;
        if (adView != null) {
            adView.d();
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter
    public void requestBannerAd(Context context, ir irVar, Bundle bundle, s2 s2Var, er erVar, Bundle bundle2) {
        AdView adView = new AdView(context);
        this.mAdView = adView;
        adView.setAdSize(new s2(s2Var.a, s2Var.b));
        this.mAdView.setAdUnitId(getAdUnitId(bundle));
        this.mAdView.setAdListener(new ys0(this, irVar));
        this.mAdView.b(buildAdRequest(context, erVar, bundle2, bundle));
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public void requestInterstitialAd(Context context, kr krVar, Bundle bundle, er erVar, Bundle bundle2) {
        in.a(context, getAdUnitId(bundle), buildAdRequest(context, erVar, bundle2, bundle), new a(this, krVar));
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00b9  */
    @Override // com.google.android.gms.ads.mediation.MediationNativeAdapter
    public void requestNativeAd(Context context, mr mrVar, Bundle bundle, ht htVar, Bundle bundle2) {
        ft ftVar;
        et etVar;
        ju1 ju1Var = new ju1(this, mrVar);
        j2 j2VarNewAdLoader = newAdLoader(context, bundle.getString(AD_UNIT_ID_PARAMETER));
        j2VarNewAdLoader.getClass();
        m51 m51Var = j2VarNewAdLoader.b;
        try {
            m51Var.w0(new zd2(ju1Var));
        } catch (RemoteException e) {
            jn.V("Failed to set AdListener.", e);
        }
        d51 d51Var = (d51) htVar;
        d51Var.getClass();
        ft ftVar2 = new ft();
        qz0 qz0Var = d51Var.d;
        int i = 3;
        if (qz0Var == null) {
            ftVar = new ft(ftVar2);
        } else {
            int i2 = qz0Var.f;
            if (i2 == 2) {
                ftVar2.e = qz0Var.j;
            } else {
                if (i2 != 3) {
                    if (i2 == 4) {
                        ftVar2.g = qz0Var.l;
                        ftVar2.c = qz0Var.m;
                    }
                }
                ee2 ee2Var = qz0Var.k;
                if (ee2Var != null) {
                    ftVar2.f = new j60(ee2Var);
                }
                ftVar2.e = qz0Var.j;
            }
            ftVar2.a = qz0Var.g;
            ftVar2.b = qz0Var.h;
            ftVar2.d = qz0Var.i;
            ftVar = new ft(ftVar2);
        }
        try {
            m51Var.x1(new qz0(ftVar));
        } catch (RemoteException e2) {
            jn.V("Failed to specify native ad options", e2);
        }
        d51 d51Var2 = (d51) htVar;
        HashMap map = d51Var2.g;
        ArrayList arrayList = d51Var2.e;
        qz0 qz0Var2 = d51Var2.d;
        et etVar2 = new et();
        if (qz0Var2 == null) {
            etVar = new et(etVar2);
        } else {
            int i3 = qz0Var2.f;
            if (i3 == 2) {
                etVar2.d = qz0Var2.j;
            } else {
                if (i3 != 3) {
                    if (i3 == 4) {
                        etVar2.f = qz0Var2.l;
                        etVar2.b = qz0Var2.m;
                        int i4 = qz0Var2.n;
                        etVar2.g = qz0Var2.o;
                        etVar2.h = i4;
                        int i5 = qz0Var2.p;
                        if (i5 == 0) {
                            i = 1;
                        } else if (i5 != 2) {
                            if (i5 == 1) {
                                i = 2;
                            } else {
                                i = 1;
                            }
                        }
                        etVar2.i = i;
                    }
                }
                ee2 ee2Var2 = qz0Var2.k;
                if (ee2Var2 != null) {
                    etVar2.e = new j60(ee2Var2);
                }
                etVar2.d = qz0Var2.j;
            }
            etVar2.a = qz0Var2.g;
            etVar2.c = qz0Var2.i;
            etVar = new et(etVar2);
        }
        j2VarNewAdLoader.b(etVar);
        if (arrayList.contains("6")) {
            try {
                m51Var.r1(new h11(0, ju1Var));
            } catch (RemoteException e3) {
                jn.V("Failed to add google native ad listener", e3);
            }
        }
        if (arrayList.contains("3")) {
            for (String str : map.keySet()) {
                f11 f11Var = null;
                ju1 ju1Var2 = true != ((Boolean) map.get(str)).booleanValue() ? null : ju1Var;
                p83 p83Var = new p83(ju1Var, 11, ju1Var2);
                try {
                    g11 g11Var = new g11(p83Var);
                    if (ju1Var2 != null) {
                        f11Var = new f11(p83Var);
                    }
                    m51Var.n1(str, g11Var, f11Var);
                } catch (RemoteException e4) {
                    jn.V("Failed to add custom template ad listener", e4);
                }
            }
        }
        k2 k2VarA = j2VarNewAdLoader.a();
        this.adLoader = k2VarA;
        k2VarA.a(buildAdRequest(context, htVar, bundle2, bundle));
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public void showInterstitial() {
        in inVar = this.mInterstitialAd;
        if (inVar != null) {
            inVar.b(null);
        }
    }
}
