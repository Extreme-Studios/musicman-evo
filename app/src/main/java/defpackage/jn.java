package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.core.content.ContextCompat;
import java.util.Objects;

public abstract class jn {
    public static void k(String str) {
        throw new NullPointerException("lateinit property " + str + " has not been initialized");
    }

    public static boolean b(Object a, Object b) {
        return Objects.equals(a, b);
    }

    public static Drawable f(Context context, int resId) {
        return ContextCompat.getDrawable(context, resId);
    }
}
