package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.Message;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public final class ha0 extends za0 {
    public final Context b;
    public final /* synthetic */ zl c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ha0(zl zlVar, Context context) {
        super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper(), 0, false);
        this.c = zlVar;
        this.b = context.getApplicationContext();
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i = message.what;
        if (i != 1) {
            StringBuilder sb = new StringBuilder(50);
            sb.append("Don't know how to handle this message: ");
            sb.append(i);
            Log.w("GoogleApiAvailability", sb.toString());
            return;
        }
        int i2 = am.a;
        zl zlVar = this.c;
        Context context = this.b;
        int iC = zlVar.c(context, i2);
        int i3 = fm.c;
        if (iC == 1 || iC == 2 || iC == 3 || iC == 9) {
            Intent intentB = zlVar.b(iC, context, "n");
            zlVar.g(context, iC, intentB == null ? null : PendingIntent.getActivity(context, 0, intentB, 201326592));
        }
    }
}
