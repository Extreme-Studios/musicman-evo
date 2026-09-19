package defpackage;

import android.app.Activity;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public abstract class v4 {
    public static OnBackInvokedDispatcher a(Activity activity) {
        return activity.getOnBackInvokedDispatcher();
    }

    public static OnBackInvokedCallback b(Object obj, c5 c5Var) {
        Objects.requireNonNull(c5Var);
        u4 u4Var = new u4(0, c5Var);
        n0.h(obj).registerOnBackInvokedCallback(1000000, u4Var);
        return u4Var;
    }

    public static void c(Object obj, Object obj2) {
        n0.h(obj).unregisterOnBackInvokedCallback(n0.e(obj2));
    }
}
