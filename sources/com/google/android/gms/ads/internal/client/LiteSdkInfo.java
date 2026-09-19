package com.google.android.gms.ads.internal.client;

import android.content.Context;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import defpackage.j41;
import defpackage.kj1;
import defpackage.l41;
import defpackage.s32;

/* JADX INFO: loaded from: classes.dex */
public class LiteSdkInfo extends kj1 {
    public LiteSdkInfo(Context context) {
        super("com.google.android.gms.ads.internal.client.ILiteSdkInfo");
    }

    @Override // defpackage.vj1
    public l41 getAdapterCreator() {
        return new j41();
    }

    @Override // defpackage.vj1
    public s32 getLiteSdkVersion() {
        return new s32("24.7.0", ModuleDescriptor.MODULE_VERSION, ModuleDescriptor.MODULE_VERSION);
    }
}
