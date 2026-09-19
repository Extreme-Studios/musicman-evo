package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* JADX INFO: loaded from: classes.dex */
public final class n00 extends wl {
    public final es0 A;
    public final Bundle B;
    public final Integer C;
    public final boolean z;

    public n00(Context context, Looper looper, es0 es0Var, Bundle bundle, bm bmVar, cm cmVar) {
        super(context, looper, 44, es0Var, bmVar, cmVar);
        this.z = true;
        this.A = es0Var;
        this.B = bundle;
        this.C = (Integer) es0Var.k;
    }

    @Override // defpackage.a8, defpackage.t3
    public final int d() {
        return 12451000;
    }

    @Override // defpackage.a8, defpackage.t3
    public final boolean k() {
        return this.z;
    }

    @Override // defpackage.a8
    public final IInterface n(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        return iInterfaceQueryLocalInterface instanceof oa0 ? (oa0) iInterfaceQueryLocalInterface : new oa0(iBinder, "com.google.android.gms.signin.internal.ISignInService", 0);
    }

    @Override // defpackage.a8
    public final Bundle r() {
        es0 es0Var = this.A;
        boolean zEquals = this.c.getPackageName().equals((String) es0Var.h);
        Bundle bundle = this.B;
        if (!zEquals) {
            bundle.putString("com.google.android.gms.signin.internal.realClientPackageName", (String) es0Var.h);
        }
        return bundle;
    }

    @Override // defpackage.a8
    public final String u() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    @Override // defpackage.a8
    public final String v() {
        return "com.google.android.gms.signin.service.START";
    }
}
