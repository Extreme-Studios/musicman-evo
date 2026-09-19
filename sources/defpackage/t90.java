package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;

/* JADX INFO: loaded from: classes.dex */
public final class t90 extends yd {
    public final /* synthetic */ int r;

    @Override // defpackage.yd
    public t3 b(Context context, Looper looper, es0 es0Var, Object obj, bm bmVar, cm cmVar) {
        switch (this.r) {
            case 0:
                es0Var.getClass();
                Integer num = (Integer) es0Var.k;
                Bundle bundle = new Bundle();
                bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", null);
                if (num != null) {
                    bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", num.intValue());
                }
                bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", false);
                bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", false);
                bundle.putString("com.google.android.gms.signin.internal.serverClientId", null);
                bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
                bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", false);
                bundle.putString("com.google.android.gms.signin.internal.hostedDomain", null);
                bundle.putString("com.google.android.gms.signin.internal.logSessionId", null);
                bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", false);
                return new n00(context, looper, es0Var, bundle, bmVar, cmVar);
            case 1:
                obj.getClass();
                throw new ClassCastException();
            default:
                return super.b(context, looper, es0Var, obj, bmVar, cmVar);
        }
    }

    @Override // defpackage.yd
    public t3 c(Context context, Looper looper, es0 es0Var, Object obj, z90 z90Var, z90 z90Var2) {
        switch (this.r) {
            case 2:
                return new ya0(context, looper, es0Var, (q30) obj, z90Var, z90Var2);
            case 3:
                return new sk1(context, looper, 300, es0Var, z90Var, z90Var2);
            default:
                return super.c(context, looper, es0Var, obj, z90Var, z90Var2);
        }
    }
}
