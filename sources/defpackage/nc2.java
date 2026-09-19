package defpackage;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes.dex */
public final class nc2 extends lc2 {
    public static nc2 i;

    public static final nc2 f(Context context) {
        nc2 nc2Var;
        synchronized (nc2.class) {
            try {
                if (i == null) {
                    i = new nc2(context, "paidv2_id", "paidv2_creation_time", "PaidV2LifecycleImpl");
                }
                nc2Var = i;
            } catch (Throwable th) {
                throw th;
            }
        }
        return nc2Var;
    }

    public final je0 g(long j, boolean z) {
        boolean z2;
        synchronized (nc2.class) {
            try {
                kc2 kc2Var = this.g;
                kc2Var.getClass();
                synchronized (kc2.class) {
                    z2 = ((SharedPreferences) ((z61) kc2Var.g).h).getBoolean("paidv2_publisher_option", true);
                }
                if (z2) {
                    return a(null, null, j, z);
                }
                return new je0(6);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void h() {
        synchronized (nc2.class) {
            try {
                z61 z61Var = this.f;
                if (((SharedPreferences) z61Var.h).contains(this.a)) {
                    c(false);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
