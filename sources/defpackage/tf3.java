package defpackage;

import android.media.Spatializer;
import android.media.Spatializer$OnSpatializerStateChangedListener;

/* JADX INFO: loaded from: classes.dex */
public final class tf3 implements Spatializer$OnSpatializerStateChangedListener {
    public final /* synthetic */ zf3 a;

    public tf3(md mdVar, zf3 zf3Var) {
        this.a = zf3Var;
    }

    public final void onSpatializerAvailableChanged(Spatializer spatializer, boolean z) {
        this.a.f();
    }

    public final void onSpatializerEnabledChanged(Spatializer spatializer, boolean z) {
        this.a.f();
    }
}
