package defpackage;

import android.app.Notification;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public final class fu extends t33 {
    public final /* synthetic */ int h;
    public Object i;

    public /* synthetic */ fu(int i) {
        this.h = i;
    }

    @Override // defpackage.t33
    public final void g1(y91 y91Var) {
        switch (this.h) {
            case 0:
                new Notification.BigTextStyle((Notification.Builder) y91Var.h).setBigContentTitle(null).bigText((CharSequence) this.i);
                break;
            default:
                int i = Build.VERSION.SDK_INT;
                Notification.Builder builder = (Notification.Builder) y91Var.h;
                if (i < 34) {
                    au.d(builder, au.b(au.a(), (int[]) this.i, null));
                } else {
                    au.d(builder, au.b(bu.a(au.a(), null, 0, null, Boolean.FALSE), (int[]) this.i, null));
                }
                break;
        }
    }

    @Override // defpackage.t33
    public String h1() {
        switch (this.h) {
            case 0:
                return "androidx.core.app.NotificationCompat$BigTextStyle";
            default:
                return super.h1();
        }
    }
}
