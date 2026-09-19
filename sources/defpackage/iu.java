package defpackage;

import android.app.NotificationManager;
import android.content.Context;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public final class iu {
    public final NotificationManager a;

    static {
        new HashSet();
    }

    public iu(Context context) {
        this.a = (NotificationManager) context.getSystemService("notification");
    }
}
