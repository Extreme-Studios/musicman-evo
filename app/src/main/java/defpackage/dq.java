package defpackage;

import android.app.Activity;
import android.content.Context;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import java.io.Closeable;

public class dq {
    public static void g(Object obj, String s) {}
    public static void d(String s) {}
    public static int h(Context context, String permission) {
        return ContextCompat.checkSelfPermission(context, permission);
    }
    public static void i(Closeable closeable, Throwable th) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception e) {
                if (th != null) {
                    th.addSuppressed(e);
                }
            }
        }
    }
    public static void n(Activity activity, String[] permissions, int requestCode) {
        ActivityCompat.requestPermissions(activity, permissions, requestCode);
    }
}
