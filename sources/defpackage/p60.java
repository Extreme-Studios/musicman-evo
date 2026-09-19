package defpackage;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import com.extremestudios.musicmanevo.R;

/* JADX INFO: loaded from: classes.dex */
public abstract class p60 {
    public static void a(WindowInsets windowInsets, View view) {
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback);
        if (onApplyWindowInsetsListener != null) {
            onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
        }
    }

    public static y80 b(View view, y80 y80Var, Rect rect) {
        WindowInsets windowInsetsB = y80Var.b();
        if (windowInsetsB != null) {
            return y80.c(view.computeSystemWindowInsets(windowInsetsB, rect), view);
        }
        rect.setEmpty();
        return y80Var;
    }

    public static ColorStateList c(View view) {
        return view.getBackgroundTintList();
    }

    public static PorterDuff.Mode d(View view) {
        return view.getBackgroundTintMode();
    }

    public static void e(View view, ColorStateList colorStateList) {
        view.setBackgroundTintList(colorStateList);
    }

    public static void f(View view, PorterDuff.Mode mode) {
        view.setBackgroundTintMode(mode);
    }

    public static void g(View view, float f) {
        view.setElevation(f);
    }

    public static void h(View view, lu luVar) {
        o60 o60Var = luVar != null ? new o60(view, luVar) : null;
        if (Build.VERSION.SDK_INT < 30) {
            view.setTag(R.id.tag_on_apply_window_listener, o60Var);
        }
        if (view.getTag(R.id.tag_compat_insets_dispatch) != null) {
            return;
        }
        if (o60Var != null) {
            view.setOnApplyWindowInsetsListener(o60Var);
        } else {
            view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback));
        }
    }

    public static void i(View view) {
        view.stopNestedScroll();
    }
}
