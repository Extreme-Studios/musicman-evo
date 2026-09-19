package defpackage;

import android.app.Notification;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Icon;
import android.view.MenuItem;

/* JADX INFO: loaded from: classes.dex */
public abstract class um {
    public static Notification.Builder a(Context context, String str) {
        return new Notification.Builder(context, str);
    }

    public static Icon b(Bitmap bitmap) {
        return Icon.createWithAdaptiveBitmap(bitmap);
    }

    public static void c(MenuItem menuItem, char c, int i) {
        menuItem.setAlphabeticShortcut(c, i);
    }

    public static void d(Notification.Builder builder) {
        builder.setBadgeIconType(0);
    }

    public static void e(MenuItem menuItem, CharSequence charSequence) {
        menuItem.setContentDescription(charSequence);
    }

    public static void f(Notification.Builder builder) {
        builder.setGroupAlertBehavior(0);
    }

    public static void g(MenuItem menuItem, ColorStateList colorStateList) {
        menuItem.setIconTintList(colorStateList);
    }

    public static void h(MenuItem menuItem, PorterDuff.Mode mode) {
        menuItem.setIconTintMode(mode);
    }

    public static void i(MenuItem menuItem, char c, int i) {
        menuItem.setNumericShortcut(c, i);
    }

    public static void j(Notification.Builder builder) {
        builder.setSettingsText(null);
    }

    public static void k(Notification.Builder builder) {
        builder.setShortcutId(null);
    }

    public static void l(Notification.Builder builder) {
        builder.setTimeoutAfter(0L);
    }

    public static void m(MenuItem menuItem, CharSequence charSequence) {
        menuItem.setTooltipText(charSequence);
    }
}
