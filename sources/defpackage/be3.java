package defpackage;

import android.app.Activity;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.telephony.TelephonyManager;

/* JADX INFO: loaded from: classes.dex */
public class be3 extends r53 {
    @Override // defpackage.r53
    public final he1 e(yd1 yd1Var, cv0 cv0Var, boolean z, hw1 hw1Var) {
        return new ie1(yd1Var, cv0Var, z, hw1Var);
    }

    @Override // defpackage.r53
    public final int f(Context context, TelephonyManager telephonyManager) {
        zb3 zb3Var = vc3.C.c;
        return (zb3.c(context, "android.permission.ACCESS_NETWORK_STATE") && telephonyManager.isDataEnabled()) ? 2 : 1;
    }

    @Override // defpackage.r53
    public final void g(Context context) {
        o0.r();
        NotificationChannel notificationChannelC = bd1.c(((Integer) tu0.e.c.a(lx0.g9)).intValue());
        notificationChannelC.setShowBadge(false);
        ((NotificationManager) context.getSystemService(NotificationManager.class)).createNotificationChannel(notificationChannelC);
    }

    @Override // defpackage.r53
    public final boolean h(Context context) {
        NotificationChannel notificationChannel = ((NotificationManager) context.getSystemService(NotificationManager.class)).getNotificationChannel("offline_notification_channel");
        return notificationChannel != null && notificationChannel.getImportance() == 0;
    }

    @Override // defpackage.r53
    public final Intent i(Activity activity) {
        Intent intent = new Intent();
        intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
        intent.putExtra("android.provider.extra.APP_PACKAGE", activity.getPackageName());
        return intent;
    }
}
