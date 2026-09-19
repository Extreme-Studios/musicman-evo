package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import defpackage.g90;
import defpackage.yp;

/* JADX INFO: loaded from: classes.dex */
public class RescheduleReceiver extends BroadcastReceiver {
    public static final String a = yp.f("RescheduleReceiver");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        yp.d().a(a, String.format("Received intent %s", intent), new Throwable[0]);
        try {
            g90 g90VarB = g90.b(context);
            BroadcastReceiver.PendingResult pendingResultGoAsync = goAsync();
            synchronized (g90.j) {
                try {
                    g90VarB.g = pendingResultGoAsync;
                    if (g90VarB.f) {
                        pendingResultGoAsync.finish();
                        g90VarB.g = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (IllegalStateException e) {
            yp.d().c(a, "Cannot reschedule jobs. WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e);
        }
    }
}
