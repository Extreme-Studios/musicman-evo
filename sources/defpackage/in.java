package defpackage;

import android.app.Activity;
import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public abstract class in {
    public static void a(Context context, String str, q2 q2Var, y6 y6Var) {
        dq.g(context, "Context cannot be null.");
        dq.g(str, "AdUnitId cannot be null.");
        dq.g(q2Var, "AdRequest cannot be null.");
        dq.d("#008 Must be called on the main UI thread.");
        lx0.a(context);
        if (((Boolean) py0.i.u()).booleanValue()) {
            if (((Boolean) tu0.e.c.a(lx0.Wb)).booleanValue()) {
                xs0.b.execute(new e9(context, str, q2Var, y6Var, 1));
                return;
            }
        }
        new e31(context, str).c(q2Var.a, y6Var);
    }

    public abstract void b(Activity activity);
}
