package defpackage;

import android.content.Context;
import android.os.Message;

/* JADX INFO: loaded from: classes.dex */
public final class e32 extends za0 {
    @Override // defpackage.za0
    public final void a(Message message) {
        try {
            super.a(message);
        } catch (Throwable th) {
            vc3 vc3Var = vc3.C;
            zb3 zb3Var = vc3Var.c;
            Context context = vc3Var.h.e;
            if (context != null) {
                try {
                    if (((Boolean) dz0.b.u()).booleanValue()) {
                        na1.c(context, th);
                    }
                } catch (IllegalStateException unused) {
                }
            }
            throw th;
        }
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        try {
            super.handleMessage(message);
        } catch (Exception e) {
            vc3.C.h.d("AdMobHandler.handleMessage", e);
        }
    }
}
