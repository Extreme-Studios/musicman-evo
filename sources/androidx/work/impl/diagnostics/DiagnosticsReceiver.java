package androidx.work.impl.diagnostics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.workers.DiagnosticsWorker;
import defpackage.g90;
import defpackage.r52;
import defpackage.yp;

/* JADX INFO: loaded from: classes.dex */
public class DiagnosticsReceiver extends BroadcastReceiver {
    public static final String a = yp.f("DiagnosticsRcvr");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        String str = a;
        yp.d().a(str, "Requesting diagnostics", new Throwable[0]);
        try {
            g90.b(context).a(new r52(DiagnosticsWorker.class).a());
        } catch (IllegalStateException e) {
            yp.d().c(str, "WorkManager is not initialized", e);
        }
    }
}
