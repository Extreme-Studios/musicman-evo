package com.google.android.gms.ads.mediation.customevent;

import android.content.Context;
import android.os.Bundle;
import defpackage.cd;
import defpackage.ht;
import defpackage.zc;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public interface CustomEventNative extends zc {
    /* synthetic */ void onDestroy();

    /* synthetic */ void onPause();

    /* synthetic */ void onResume();

    void requestNativeAd(Context context, cd cdVar, String str, ht htVar, Bundle bundle);
}
