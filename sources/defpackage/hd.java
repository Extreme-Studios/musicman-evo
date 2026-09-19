package defpackage;

import android.app.Notification;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.work.impl.foreground.SystemForegroundService;

/* JADX INFO: loaded from: classes.dex */
public final class hd implements Runnable {
    public final /* synthetic */ int f = 1;
    public final /* synthetic */ int g;
    public final /* synthetic */ int h;
    public final /* synthetic */ Parcelable i;
    public final /* synthetic */ Object j;

    public hd(SystemForegroundService systemForegroundService, int i, Notification notification, int i2) {
        this.j = systemForegroundService;
        this.g = i;
        this.i = notification;
        this.h = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f;
        int i2 = this.h;
        Object obj = this.j;
        int i3 = this.g;
        Parcelable parcelable = this.i;
        switch (i) {
            case 0:
                ((id) obj).g.c(i3, i2, (Bundle) parcelable);
                break;
            default:
                Notification notification = (Notification) parcelable;
                SystemForegroundService systemForegroundService = (SystemForegroundService) obj;
                if (Build.VERSION.SDK_INT < 29) {
                    systemForegroundService.startForeground(i3, notification);
                } else {
                    systemForegroundService.startForeground(i3, notification, i2);
                }
                break;
        }
    }

    public hd(id idVar, int i, int i2, Bundle bundle) {
        this.j = idVar;
        this.g = i;
        this.h = i2;
        this.i = bundle;
    }
}
