package defpackage;

import android.os.Build;
import android.util.Log;
import android.view.ViewConfiguration;

/* JADX INFO: loaded from: classes.dex */
public abstract class x60 {
    public static final /* synthetic */ int a = 0;

    static {
        if (Build.VERSION.SDK_INT == 25) {
            try {
                ViewConfiguration.class.getDeclaredMethod("getScaledScrollFactor", null);
            } catch (Exception unused) {
                Log.i("ViewConfigCompat", "Could not find method getScaledScrollFactor() on ViewConfiguration");
            }
        }
    }
}
