package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: loaded from: classes.dex */
public final class w92 extends BroadcastReceiver {
    public final /* synthetic */ int a;

    public /* synthetic */ w92(int i) {
        this.a = i;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        switch (this.a) {
            case 0:
                if (intent.getAction() == "android.media.action.HDMI_AUDIO_PLUG") {
                    int intExtra = intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", -1);
                    if (intExtra == 0) {
                        jn.E = 1;
                        return;
                    } else {
                        if (intExtra == 1) {
                            jn.E = 2;
                            return;
                        }
                        return;
                    }
                }
                return;
            default:
                synchronized (o83.b) {
                    o83.c = false;
                    o83.d = false;
                    jn.T("Ad debug logging enablement is out of date.");
                    break;
                }
                i8.u(context);
                return;
        }
    }
}
