package defpackage;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.os.Build;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import com.extremestudios.musicmanevo.R;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class gu {
    public final Context a;
    public CharSequence e;
    public CharSequence f;
    public PendingIntent g;
    public IconCompat h;
    public int i;
    public t33 k;
    public Bundle m;
    public String n;
    public final boolean o;
    public final Notification p;
    public final ArrayList q;
    public final ArrayList b = new ArrayList();
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public final boolean j = true;
    public boolean l = false;

    public gu(Context context, String str) {
        Notification notification = new Notification();
        this.p = notification;
        this.a = context;
        this.n = str;
        notification.when = System.currentTimeMillis();
        notification.audioStreamType = -1;
        this.i = 0;
        this.q = new ArrayList();
        this.o = true;
    }

    public static CharSequence c(CharSequence charSequence) {
        return (charSequence != null && charSequence.length() > 5120) ? charSequence.subSequence(0, 5120) : charSequence;
    }

    public final void a(int i, String str, PendingIntent pendingIntent) {
        this.b.add(new zt(i, str, pendingIntent));
    }

    public final Notification b() {
        Bundle bundle;
        String strH1;
        y91 y91Var = new y91(this);
        gu guVar = (gu) y91Var.i;
        t33 t33Var = guVar.k;
        if (t33Var != null) {
            t33Var.g1(y91Var);
        }
        int i = Build.VERSION.SDK_INT;
        Notification.Builder builder = (Notification.Builder) y91Var.h;
        Notification notificationBuild = i >= 26 ? builder.build() : builder.build();
        if (t33Var != null) {
            guVar.k.getClass();
        }
        if (t33Var != null && (bundle = notificationBuild.extras) != null && (strH1 = t33Var.h1()) != null) {
            bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", strH1);
        }
        return notificationBuild;
    }

    public final void d(int i, boolean z) {
        Notification notification = this.p;
        if (z) {
            notification.flags = i | notification.flags;
        } else {
            notification.flags = (~i) & notification.flags;
        }
    }

    public final void e(Bitmap bitmap) {
        if (Build.VERSION.SDK_INT < 27) {
            Resources resources = this.a.getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.compat_notification_large_icon_max_width);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.compat_notification_large_icon_max_height);
            if (bitmap.getWidth() > dimensionPixelSize || bitmap.getHeight() > dimensionPixelSize2) {
                double dMin = Math.min(((double) dimensionPixelSize) / ((double) Math.max(1, bitmap.getWidth())), ((double) dimensionPixelSize2) / ((double) Math.max(1, bitmap.getHeight())));
                bitmap = Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(((double) bitmap.getWidth()) * dMin), (int) Math.ceil(((double) bitmap.getHeight()) * dMin), true);
            }
        }
        PorterDuff.Mode mode = IconCompat.k;
        bitmap.getClass();
        IconCompat iconCompat = new IconCompat(1);
        iconCompat.b = bitmap;
        this.h = iconCompat;
    }

    public final void f(t33 t33Var) {
        if (this.k != t33Var) {
            this.k = t33Var;
            if (((gu) t33Var.f) != this) {
                t33Var.f = this;
                f(t33Var);
            }
        }
    }
}
