package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class t71 {
    public int a;
    public int b;
    public final boolean c;
    public final boolean d;
    public final String e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final String i;
    public final String j;
    public final float k;
    public final int l;
    public final int m;
    public final String n;

    /* JADX WARN: Code duplicated, block: B:12:0x0064  */
    public t71(Context context) {
        ActivityInfo activityInfo;
        String string;
        DisplayMetrics displayMetrics;
        PackageManager packageManager = context.getPackageManager();
        lx0.a(context);
        b(context);
        c(context);
        d(context);
        Locale locale = Locale.getDefault();
        this.c = e(packageManager, "geo:0,0?q=donuts") != null;
        this.d = e(packageManager, "http://www.google.com") != null;
        this.e = locale.getCountry();
        zb3 zb3Var = vc3.C.c;
        f32 f32Var = ut0.f.a;
        this.f = f32.o();
        this.g = jn.h(context);
        this.h = jn.s(context);
        this.i = locale.getLanguage();
        ResolveInfo resolveInfoE = e(packageManager, "market://details?id=com.google.android.gms.ads");
        String string2 = null;
        if (resolveInfoE == null || (activityInfo = resolveInfoE.activityInfo) == null) {
            string = null;
        } else {
            try {
                PackageInfo packageInfoD = q90.a(context).d(activityInfo.packageName, 0);
                if (packageInfoD != null) {
                    int i = packageInfoD.versionCode;
                    String str = activityInfo.packageName;
                    StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 1 + String.valueOf(str).length());
                    sb.append(i);
                    sb.append(".");
                    sb.append(str);
                    string = sb.toString();
                } else {
                    string = null;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        this.j = string;
        try {
            PackageInfo packageInfoD2 = q90.a(context).d("com.android.vending", 128);
            if (packageInfoD2 != null) {
                int i2 = packageInfoD2.versionCode;
                String str2 = packageInfoD2.packageName;
                StringBuilder sb2 = new StringBuilder(String.valueOf(i2).length() + 1 + String.valueOf(str2).length());
                sb2.append(i2);
                sb2.append(".");
                sb2.append(str2);
                string2 = sb2.toString();
            }
        } catch (Exception unused2) {
        }
        this.n = string2;
        Resources resources = context.getResources();
        if (resources == null || (displayMetrics = resources.getDisplayMetrics()) == null) {
            return;
        }
        this.k = displayMetrics.density;
        this.l = displayMetrics.widthPixels;
        this.m = displayMetrics.heightPixels;
    }

    public static ResolveInfo e(PackageManager packageManager, String str) {
        try {
            return packageManager.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)), 65536);
        } catch (Throwable th) {
            vc3.C.h.d("DeviceInfo.getResolveInfo", th);
            return null;
        }
    }

    public final u71 a() {
        return new u71(this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.n, this.a, this.b, this.k, this.l, this.m);
    }

    public final void b(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        if (audioManager != null) {
            try {
                audioManager.getMode();
                audioManager.isMusicActive();
                audioManager.isSpeakerphoneOn();
                audioManager.getStreamVolume(3);
                audioManager.getRingerMode();
                audioManager.getStreamVolume(2);
            } catch (Throwable th) {
                vc3.C.h.d("DeviceInfo.gatherAudioInfo", th);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x002d  */
    public final void c(Context context) {
        int networkType;
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        telephonyManager.getNetworkOperator();
        if (ej1.m()) {
            if (((Boolean) tu0.e.c.a(lx0.n9)).booleanValue()) {
                networkType = 0;
            } else {
                networkType = telephonyManager.getNetworkType();
            }
        } else {
            networkType = telephonyManager.getNetworkType();
        }
        this.b = networkType;
        telephonyManager.getPhoneType();
        this.a = -2;
        zb3 zb3Var = vc3.C.c;
        if (zb3.c(context, "android.permission.ACCESS_NETWORK_STATE")) {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                this.a = activeNetworkInfo.getType();
                activeNetworkInfo.getDetailedState().ordinal();
            } else {
                this.a = -1;
            }
            connectivityManager.isActiveNetworkMetered();
        }
    }

    public final void d(Context context) {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.BATTERY_CHANGED");
        Intent intentRegisterReceiver = (!((Boolean) tu0.e.c.a(lx0.Nb)).booleanValue() || Build.VERSION.SDK_INT < 33) ? context.registerReceiver(null, intentFilter) : context.registerReceiver(null, intentFilter, 4);
        if (intentRegisterReceiver != null) {
            intentRegisterReceiver.getIntExtra("status", -1);
            intentRegisterReceiver.getIntExtra("level", -1);
            intentRegisterReceiver.getIntExtra("scale", -1);
        }
    }

    public t71(Context context, u71 u71Var) {
        lx0.a(context);
        b(context);
        c(context);
        d(context);
        String str = Build.FINGERPRINT;
        String str2 = Build.DEVICE;
        xx0.a(context);
        this.c = u71Var.a;
        this.d = u71Var.b;
        this.e = u71Var.c;
        this.f = u71Var.d;
        this.g = u71Var.e;
        this.h = u71Var.f;
        this.i = u71Var.g;
        this.j = u71Var.h;
        this.n = u71Var.i;
        this.k = u71Var.l;
        this.l = u71Var.m;
        this.m = u71Var.n;
    }
}
