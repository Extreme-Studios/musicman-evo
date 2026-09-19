package com.google.android.gms.ads.mediation.rtb;

import defpackage.dr;
import defpackage.dy;
import defpackage.gr;
import defpackage.hr;
import defpackage.jr;
import defpackage.lr;
import defpackage.nr;
import defpackage.p00;
import defpackage.t2;

/* JADX INFO: loaded from: classes.dex */
public abstract class RtbAdapter extends t2 {
    public abstract void collectSignals(dy dyVar, p00 p00Var);

    public void loadRtbAppOpenAd(gr grVar, dr drVar) {
        loadAppOpenAd(grVar, drVar);
    }

    public void loadRtbBannerAd(hr hrVar, dr drVar) {
        loadBannerAd(hrVar, drVar);
    }

    public void loadRtbInterstitialAd(jr jrVar, dr drVar) {
        loadInterstitialAd(jrVar, drVar);
    }

    @Deprecated
    public void loadRtbNativeAd(lr lrVar, dr drVar) {
        loadNativeAd(lrVar, drVar);
    }

    public void loadRtbNativeAdMapper(lr lrVar, dr drVar) {
        loadNativeAdMapper(lrVar, drVar);
    }

    public void loadRtbRewardedAd(nr nrVar, dr drVar) {
        loadRewardedAd(nrVar, drVar);
    }

    public void loadRtbRewardedInterstitialAd(nr nrVar, dr drVar) {
        loadRewardedInterstitialAd(nrVar, drVar);
    }
}
