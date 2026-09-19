package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public final class e5 {
    public static final PorterDuff.Mode b = PorterDuff.Mode.SRC_IN;
    public static e5 c;
    public kx a;

    public static synchronized e5 a() {
        try {
            if (c == null) {
                c();
            }
        } catch (Throwable th) {
            throw th;
        }
        return c;
    }

    public static synchronized void c() {
        if (c == null) {
            e5 e5Var = new e5();
            c = e5Var;
            e5Var.a = kx.c();
            kx kxVar = c.a;
            es0 es0Var = new es0(1);
            synchronized (kxVar) {
                kxVar.e = es0Var;
            }
        }
    }

    public static void d(Drawable drawable, g92 g92Var, int[] iArr) {
        PorterDuff.Mode mode = kx.f;
        int[] state = drawable.getState();
        if (drawable.mutate() != drawable) {
            Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
            return;
        }
        if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
            drawable.setState(new int[0]);
            drawable.setState(state);
        }
        boolean z = g92Var.b;
        if (!z && !g92Var.a) {
            drawable.clearColorFilter();
            return;
        }
        PorterDuffColorFilter porterDuffColorFilterF = null;
        ColorStateList colorStateList = z ? (ColorStateList) g92Var.c : null;
        PorterDuff.Mode mode2 = g92Var.a ? (PorterDuff.Mode) g92Var.d : kx.f;
        if (colorStateList != null && mode2 != null) {
            porterDuffColorFilterF = kx.f(colorStateList.getColorForState(iArr, 0), mode2);
        }
        drawable.setColorFilter(porterDuffColorFilterF);
    }

    public final synchronized Drawable b(Context context, int i) {
        return this.a.d(context, i);
    }
}
