package defpackage;

import android.content.Context;
import android.os.RemoteException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class t2 {
    public abstract c60 getSDKVersionInfo();

    public abstract c60 getVersionInfo();

    public abstract void initialize(Context context, ym ymVar, List<gm> list);

    public void loadAppOpenAd(gr grVar, dr drVar) {
        drVar.A(new g2(7, getClass().getSimpleName().concat(" does not support app open ads."), "com.google.android.gms.ads", (g2) null));
    }

    public void loadBannerAd(hr hrVar, dr drVar) {
        drVar.A(new g2(7, getClass().getSimpleName().concat(" does not support banner ads."), "com.google.android.gms.ads", (g2) null));
    }

    public void loadInterstitialAd(jr jrVar, dr drVar) {
        drVar.A(new g2(7, getClass().getSimpleName().concat(" does not support interstitial ads."), "com.google.android.gms.ads", (g2) null));
    }

    @Deprecated
    public void loadNativeAd(lr lrVar, dr drVar) {
        drVar.A(new g2(7, getClass().getSimpleName().concat(" does not support native ads."), "com.google.android.gms.ads", (g2) null));
    }

    public void loadNativeAdMapper(lr lrVar, dr drVar) {
        throw new RemoteException("Method is not found");
    }

    public void loadRewardedAd(nr nrVar, dr drVar) {
        drVar.A(new g2(7, getClass().getSimpleName().concat(" does not support rewarded ads."), "com.google.android.gms.ads", (g2) null));
    }

    public void loadRewardedInterstitialAd(nr nrVar, dr drVar) {
        drVar.A(new g2(7, getClass().getSimpleName().concat(" does not support rewarded interstitial ads."), "com.google.android.gms.ads", (g2) null));
    }
}
