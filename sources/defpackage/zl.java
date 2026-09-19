package defpackage;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.FragmentManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.util.Log;
import android.util.TypedValue;
import com.google.android.gms.common.api.GoogleApiActivity;

/* JADX INFO: loaded from: classes.dex */
public final class zl extends am {
    public static final Object c = new Object();
    public static final zl d = new zl();

    public static AlertDialog e(Activity activity, int i, qa0 qa0Var, DialogInterface.OnCancelListener onCancelListener) {
        String string;
        if (i == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        activity.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        AlertDialog.Builder builder = "Theme.Dialog.Alert".equals(activity.getResources().getResourceEntryName(typedValue.resourceId)) ? new AlertDialog.Builder(activity, 5) : null;
        if (builder == null) {
            builder = new AlertDialog.Builder(activity);
        }
        builder.setMessage(fa0.b(activity, i));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        Resources resources = activity.getResources();
        if (i == 1) {
            string = resources.getString(com.extremestudios.musicmanevo.R.string.common_google_play_services_install_button);
        } else if (i != 2) {
            string = i != 3 ? resources.getString(R.string.ok) : resources.getString(com.extremestudios.musicmanevo.R.string.common_google_play_services_enable_button);
        } else {
            string = resources.getString(com.extremestudios.musicmanevo.R.string.common_google_play_services_update_button);
        }
        if (string != null) {
            builder.setPositiveButton(string, qa0Var);
        }
        String strC = fa0.c(activity, i);
        if (strC != null) {
            builder.setTitle(strC);
        }
        Log.w("GoogleApiAvailability", ec.h("Creating dialog for Google Play services availability issue. ConnectionResult=", i), new IllegalArgumentException());
        return builder.create();
    }

    public static void f(Activity activity, AlertDialog alertDialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        try {
            if (activity instanceof c4) {
                xj xjVar = ((mj) ((c4) activity).w.g).F;
                k20 k20Var = new k20();
                dq.g(alertDialog, "Cannot display null dialog");
                alertDialog.setOnCancelListener(null);
                alertDialog.setOnDismissListener(null);
                k20Var.k0 = alertDialog;
                if (onCancelListener != null) {
                    k20Var.l0 = onCancelListener;
                }
                k20Var.h0 = false;
                k20Var.i0 = true;
                xjVar.getClass();
                s7 s7Var = new s7(xjVar);
                s7Var.o = true;
                s7Var.e(0, k20Var, str);
                s7Var.d(false);
                return;
            }
        } catch (NoClassDefFoundError unused) {
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        vh vhVar = new vh();
        dq.g(alertDialog, "Cannot display null dialog");
        alertDialog.setOnCancelListener(null);
        alertDialog.setOnDismissListener(null);
        vhVar.f = alertDialog;
        if (onCancelListener != null) {
            vhVar.g = onCancelListener;
        }
        vhVar.show(fragmentManager, str);
    }

    public final void d(GoogleApiActivity googleApiActivity, int i, GoogleApiActivity googleApiActivity2) {
        AlertDialog alertDialogE = e(googleApiActivity, i, new na0(super.b(i, googleApiActivity, "d"), googleApiActivity), googleApiActivity2);
        if (alertDialogE == null) {
            return;
        }
        f(googleApiActivity, alertDialogE, "GooglePlayServicesErrorDialog", googleApiActivity2);
    }

    public final void g(Context context, int i, PendingIntent pendingIntent) {
        int i2;
        Log.w("GoogleApiAvailability", "GMS core API Availability. ConnectionResult=" + i + ", tag=null", new IllegalArgumentException());
        if (i == 18) {
            new ha0(this, context).sendEmptyMessageDelayed(1, 120000L);
            return;
        }
        if (pendingIntent == null) {
            if (i == 6) {
                Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
                return;
            }
            return;
        }
        String strE = i == 6 ? fa0.e(context, "common_google_play_services_resolution_required_title") : fa0.c(context, i);
        if (strE == null) {
            strE = context.getResources().getString(com.extremestudios.musicmanevo.R.string.common_google_play_services_notification_ticker);
        }
        String strD = (i == 6 || i == 19) ? fa0.d(context, "common_google_play_services_resolution_required_text", fa0.a(context)) : fa0.b(context, i);
        Resources resources = context.getResources();
        Object systemService = context.getSystemService("notification");
        dq.f(systemService);
        NotificationManager notificationManager = (NotificationManager) systemService;
        gu guVar = new gu(context, null);
        guVar.l = true;
        guVar.d(16, true);
        guVar.e = gu.c(strE);
        fu fuVar = new fu(0);
        fuVar.i = gu.c(strD);
        guVar.f(fuVar);
        PackageManager packageManager = context.getPackageManager();
        if (jn.o == null) {
            jn.o = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        if (jn.o.booleanValue()) {
            guVar.p.icon = context.getApplicationInfo().icon;
            guVar.i = 2;
            if (jn.i(context)) {
                guVar.a(com.extremestudios.musicmanevo.R.drawable.common_full_open_on_phone, resources.getString(com.extremestudios.musicmanevo.R.string.common_open_on_phone), pendingIntent);
            } else {
                guVar.g = pendingIntent;
            }
        } else {
            guVar.p.icon = R.drawable.stat_sys_warning;
            guVar.p.tickerText = gu.c(resources.getString(com.extremestudios.musicmanevo.R.string.common_google_play_services_notification_ticker));
            guVar.p.when = System.currentTimeMillis();
            guVar.g = pendingIntent;
            guVar.f = gu.c(strD);
        }
        if (ej1.k()) {
            if (!ej1.k()) {
                j7.a();
                return;
            }
            synchronized (c) {
            }
            NotificationChannel notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
            String string = context.getResources().getString(com.extremestudios.musicmanevo.R.string.common_google_play_services_notification_channel_name);
            if (notificationChannel == null) {
                notificationManager.createNotificationChannel(o0.d(string));
            } else if (!string.contentEquals(notificationChannel.getName())) {
                notificationChannel.setName(string);
                notificationManager.createNotificationChannel(notificationChannel);
            }
            guVar.n = "com.google.android.gms.availability";
        }
        Notification notificationB = guVar.b();
        if (i == 1 || i == 2 || i == 3) {
            fm.a.set(false);
            i2 = 10436;
        } else {
            i2 = 39789;
        }
        notificationManager.notify(i2, notificationB);
    }

    public final void h(Activity activity, ko koVar, int i, DialogInterface.OnCancelListener onCancelListener) {
        AlertDialog alertDialogE = e(activity, i, new pa0(super.b(i, activity, "d"), koVar), onCancelListener);
        if (alertDialogE == null) {
            return;
        }
        f(activity, alertDialogE, "GooglePlayServicesErrorDialog", onCancelListener);
    }
}
