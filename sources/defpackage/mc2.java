package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class mc2 extends lc2 {
    public static mc2 i;

    public static final mc2 f(Context context) {
        mc2 mc2Var;
        synchronized (mc2.class) {
            try {
                if (i == null) {
                    i = new mc2(context, "paidv1_id", "paidv1_creation_time", "PaidV1LifecycleImpl");
                }
                mc2Var = i;
            } catch (Throwable th) {
                throw th;
            }
        }
        return mc2Var;
    }
}
