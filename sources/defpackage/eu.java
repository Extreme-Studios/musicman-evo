package defpackage;

import android.app.Notification;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import androidx.core.graphics.drawable.IconCompat;

/* JADX INFO: loaded from: classes.dex */
public final class eu extends t33 {
    public IconCompat h;
    public IconCompat i;
    public boolean j;

    @Override // defpackage.t33
    public final void g1(y91 y91Var) {
        Bitmap bitmapA;
        Notification.Builder builder = (Notification.Builder) y91Var.h;
        Context context = (Context) y91Var.g;
        Notification.BigPictureStyle bigContentTitle = new Notification.BigPictureStyle(builder).setBigContentTitle(null);
        IconCompat iconCompat = this.h;
        if (iconCompat != null) {
            if (Build.VERSION.SDK_INT >= 31) {
                du.a(bigContentTitle, iconCompat.f(context));
            } else if (iconCompat.d() == 1) {
                IconCompat iconCompat2 = this.h;
                int i = iconCompat2.a;
                if (i == -1) {
                    Object obj = iconCompat2.b;
                    bitmapA = obj instanceof Bitmap ? (Bitmap) obj : null;
                } else if (i == 1) {
                    bitmapA = (Bitmap) iconCompat2.b;
                } else {
                    if (i != 5) {
                        j7.d(iconCompat2, "called getBitmap() on ");
                        return;
                    }
                    bitmapA = IconCompat.a((Bitmap) iconCompat2.b, true);
                }
                bigContentTitle = bigContentTitle.bigPicture(bitmapA);
            }
        }
        if (this.j) {
            IconCompat iconCompat3 = this.i;
            if (iconCompat3 == null) {
                bigContentTitle.bigLargeIcon((Bitmap) null);
            } else {
                cu.a(bigContentTitle, iconCompat3.f(context));
            }
        }
        if (Build.VERSION.SDK_INT >= 31) {
            du.c(bigContentTitle, false);
            du.b(bigContentTitle, null);
        }
    }

    @Override // defpackage.t33
    public final String h1() {
        return "androidx.core.app.NotificationCompat$BigPictureStyle";
    }
}
