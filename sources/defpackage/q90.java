package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class q90 {
    public static final q90 b;
    public iv a;

    static {
        q90 q90Var = new q90();
        q90Var.a = null;
        b = q90Var;
    }

    public static iv a(Context context) {
        iv ivVar;
        q90 q90Var = b;
        synchronized (q90Var) {
            try {
                if (q90Var.a == null) {
                    if (context.getApplicationContext() != null) {
                        context = context.getApplicationContext();
                    }
                    q90Var.a = new iv(context);
                }
                ivVar = q90Var.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return ivVar;
    }
}
