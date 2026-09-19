package defpackage;

import android.app.Activity;
import android.app.FragmentManager;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public abstract class zw {
    /* JADX WARN: Multi-variable type inference failed */
    public static void a(Activity activity, eo eoVar) {
        oo ooVarE;
        eoVar.getClass();
        if (!(activity instanceof mo) || (ooVarE = ((mo) activity).e()) == null) {
            return;
        }
        ooVarE.d(eoVar);
    }

    public static void b(Activity activity) {
        if (Build.VERSION.SDK_INT >= 29) {
            bx.a.Companion.getClass();
            activity.registerActivityLifecycleCallbacks(new bx.a());
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new bx(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }
}
