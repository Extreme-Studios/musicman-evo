package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* JADX INFO: loaded from: classes.dex */
public final class ya0 extends wl {
    public final q30 z;

    public ya0(Context context, Looper looper, es0 es0Var, q30 q30Var, z90 z90Var, z90 z90Var2) {
        super(context, looper, 270, es0Var, z90Var, z90Var2);
        this.z = q30Var;
    }

    @Override // defpackage.a8, defpackage.t3
    public final int d() {
        return 203400000;
    }

    @Override // defpackage.a8
    public final IInterface n(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientTelemetryService");
        return iInterfaceQueryLocalInterface instanceof ua0 ? (ua0) iInterfaceQueryLocalInterface : new ua0(iBinder, "com.google.android.gms.common.internal.service.IClientTelemetryService", 0);
    }

    @Override // defpackage.a8
    public final ei[] q() {
        return yd.j;
    }

    @Override // defpackage.a8
    public final Bundle r() {
        this.z.getClass();
        return new Bundle();
    }

    @Override // defpackage.a8
    public final String u() {
        return "com.google.android.gms.common.internal.service.IClientTelemetryService";
    }

    @Override // defpackage.a8
    public final String v() {
        return "com.google.android.gms.common.telemetry.service.START";
    }

    @Override // defpackage.a8
    public final boolean w() {
        return true;
    }
}
