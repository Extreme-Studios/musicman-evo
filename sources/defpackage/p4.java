package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public abstract class p4 {
    public static final n4 f = new n4(new o4(0));
    public static final int g = -100;
    public static qp h = null;
    public static qp i = null;
    public static Boolean j = null;
    public static boolean k = false;
    public static final n7 l = new n7(0);
    public static final Object m = new Object();
    public static final Object n = new Object();

    public static boolean b(Context context) {
        if (j == null) {
            try {
                int i2 = x6.f;
                Bundle bundle = context.getPackageManager().getServiceInfo(new ComponentName(context, (Class<?>) x6.class), w6.a() | 128).metaData;
                if (bundle != null) {
                    j = Boolean.valueOf(bundle.getBoolean("autoStoreLocales"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
                Log.d("AppCompatDelegate", "Checking for metadata for AppLocalesMetadataHolderService : Service not found");
                j = Boolean.FALSE;
            }
        }
        return j.booleanValue();
    }

    public static void e(c5 c5Var) {
        synchronized (m) {
            try {
                n7 n7Var = l;
                n7Var.getClass();
                h7 h7Var = new h7(n7Var);
                while (h7Var.hasNext()) {
                    p4 p4Var = (p4) ((WeakReference) h7Var.next()).get();
                    if (p4Var == c5Var || p4Var == null) {
                        h7Var.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract void a();

    public abstract void c();

    public abstract void d();

    public abstract boolean f(int i2);

    public abstract void g(int i2);

    public abstract void h(View view);

    public abstract void j(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void k(CharSequence charSequence);
}
