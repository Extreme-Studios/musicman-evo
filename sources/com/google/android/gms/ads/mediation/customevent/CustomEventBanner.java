package com.google.android.gms.ads.mediation.customevent;

import android.content.Context;
import android.os.Bundle;
import defpackage.ad;
import defpackage.er;
import defpackage.s2;
import defpackage.zc;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public interface CustomEventBanner extends zc {
    /* synthetic */ void onDestroy();

    /* synthetic */ void onPause();

    /* synthetic */ void onResume();

    void requestBannerAd(Context context, ad adVar, String str, s2 s2Var, er erVar, Bundle bundle);
}
