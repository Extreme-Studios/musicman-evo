package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.WebView;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Locale;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class e71 implements f71 {
    public static final Object q = new Object();
    public static f71 r;
    public static f71 s;
    public static f71 t;
    public static Boolean u;
    public final Context g;
    public final d60 j;
    public final PackageInfo k;
    public final String l;
    public final String m;
    public boolean o;
    public final HashSet p;
    public final Object f = new Object();
    public final WeakHashMap h = new WeakHashMap();
    public final ExecutorService i = Executors.unconfigurableExecutorService(Executors.newCachedThreadPool());
    public final AtomicBoolean n = new AtomicBoolean();

    /* JADX WARN: Code duplicated, block: B:11:0x004d  */
    public e71(Context context, d60 d60Var) {
        PackageInfo packageInfoD;
        String country;
        context = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.g = context;
        this.j = d60Var;
        String string = null;
        if (((Boolean) tu0.e.c.a(lx0.v8)).booleanValue()) {
            za0 za0Var = f32.b;
            if (context == null || context.getApplicationInfo() == null) {
                packageInfoD = null;
            } else {
                try {
                    packageInfoD = q90.a(context).d(context.getApplicationInfo().packageName, 0);
                } catch (PackageManager.NameNotFoundException unused) {
                    packageInfoD = null;
                }
            }
        } else {
            packageInfoD = null;
        }
        this.k = packageInfoD;
        ix0 ix0Var = lx0.j8;
        tu0 tu0Var = tu0.e;
        if (((Boolean) tu0Var.c.a(ix0Var)).booleanValue()) {
            za0 za0Var2 = f32.b;
            country = Locale.getDefault().getCountry();
        } else {
            country = "unknown";
        }
        this.l = country;
        if (((Boolean) tu0Var.c.a(ix0Var)).booleanValue()) {
            Context context2 = this.g;
            za0 za0Var3 = f32.b;
            if (context2 != null) {
                try {
                    PackageInfo packageInfoD2 = q90.a(context2).d("com.android.vending", 128);
                    if (packageInfoD2 != null) {
                        string = Integer.toString(packageInfoD2.versionCode);
                    }
                } catch (PackageManager.NameNotFoundException unused2) {
                }
            }
        } else {
            string = "unknown";
        }
        this.m = string;
        if (((Integer) tu0.e.c.a(lx0.f8)).intValue() > 0) {
            this.p = new HashSet();
        }
    }

    public static f71 a(Context context) {
        synchronized (q) {
            try {
                if (r == null) {
                    if (h(context)) {
                        r = new e71(context, d60.a());
                    } else {
                        r = new ue0(15);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return r;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0039  */
    public static f71 b(Context context, d60 d60Var) {
        boolean z;
        synchronized (q) {
            try {
                if (t == null) {
                    int i = 0;
                    if (((Boolean) ly0.c.u()).booleanValue()) {
                        if (!((Boolean) tu0.e.c.a(lx0.d8)).booleanValue() || ((Boolean) ly0.a.u()).booleanValue()) {
                            z = true;
                        } else {
                            z = false;
                        }
                    } else {
                        z = false;
                    }
                    if (h(context)) {
                        e71 e71Var = new e71(context, d60Var);
                        e71Var.i();
                        Thread.setDefaultUncaughtExceptionHandler(new d71(e71Var, Thread.getDefaultUncaughtExceptionHandler(), i));
                        t = e71Var;
                    } else if (!z || context == null) {
                        t = new ue0(15);
                    } else {
                        e71 e71Var2 = new e71(context, d60Var);
                        e71Var2.o = true;
                        e71Var2.i();
                        Thread.setDefaultUncaughtExceptionHandler(new d71(e71Var2, Thread.getDefaultUncaughtExceptionHandler(), i));
                        t = e71Var2;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return t;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0037 A[Catch: all -> 0x0035, TryCatch #0 {all -> 0x0035, blocks: (B:4:0x0003, B:6:0x0007, B:8:0x0019, B:10:0x0029, B:13:0x0037, B:14:0x0040), top: B:19:0x0003 }] */
    public static f71 d(Context context) {
        synchronized (q) {
            try {
                if (s == null) {
                    ix0 ix0Var = lx0.e8;
                    tu0 tu0Var = tu0.e;
                    if (((Boolean) tu0Var.c.a(ix0Var)).booleanValue()) {
                        if (((Boolean) tu0Var.c.a(lx0.d8)).booleanValue()) {
                            s = new ue0(15);
                        } else {
                            s = new e71(context, d60.a());
                        }
                    } else {
                        s = new ue0(15);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return s;
    }

    public static String e(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    public static boolean h(Context context) {
        if (context != null) {
            synchronized (q) {
                try {
                    if (u == null) {
                        u = Boolean.valueOf(ut0.f.e.nextInt(100) < ((Integer) tu0.e.c.a(lx0.yd)).intValue());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (u.booleanValue()) {
                if (!((Boolean) tu0.e.c.a(lx0.d8)).booleanValue()) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.f71
    public final void c(String str, Throwable th) {
        if (this.o) {
            return;
        }
        g(th, str, 1.0f);
    }

    public final void f(Throwable th) {
        Context context;
        SharedPreferences sharedPreferences;
        if (th != null) {
            boolean zM = false;
            boolean zEquals = false;
            for (Throwable cause = th; cause != null; cause = cause.getCause()) {
                for (StackTraceElement stackTraceElement : cause.getStackTrace()) {
                    zM |= f32.m(stackTraceElement.getClassName());
                    zEquals |= e71.class.getName().equals(stackTraceElement.getClassName());
                }
            }
            int iIntValue = ((Integer) tu0.e.c.a(lx0.f8)).intValue();
            if (iIntValue > 0) {
                HashSet hashSet = this.p;
                if (hashSet.size() >= iIntValue) {
                    return;
                }
                String strD = f32.d(e(th), "SHA-256");
                if (strD == null) {
                    strD = "";
                }
                if (hashSet.contains(strD)) {
                    return;
                } else {
                    hashSet.add(strD);
                }
            }
            if (!zM || zEquals) {
                return;
            }
            if (!this.o) {
                c("", th);
            }
            if (this.n.getAndSet(true) || !((Boolean) ly0.c.u()).booleanValue() || (sharedPreferences = (context = this.g).getSharedPreferences("admob", 0)) == null) {
                return;
            }
            sharedPreferences.edit().putInt("crash_without_write", i8.H(context, "crash_without_write") + 1).commit();
        }
    }

    @Override // defpackage.f71
    public final void g(Throwable th, String str, float f) {
        Throwable th2;
        boolean zE;
        String packageName;
        PackageInfo packageInfoD;
        ActivityManager activityManager;
        ActivityManager.MemoryInfo memoryInfo;
        String strD;
        Context context = this.g;
        if (this.o) {
            return;
        }
        za0 za0Var = f32.b;
        if (((Boolean) dz0.e.u()).booleanValue()) {
            th2 = th;
        } else {
            LinkedList linkedList = new LinkedList();
            for (Throwable cause = th; cause != null; cause = cause.getCause()) {
                linkedList.push(cause);
            }
            th2 = null;
            while (!linkedList.isEmpty()) {
                Throwable th3 = (Throwable) linkedList.pop();
                StackTraceElement[] stackTrace = th3.getStackTrace();
                boolean z = ((Boolean) tu0.e.c.a(lx0.y2)).booleanValue() && stackTrace != null && stackTrace.length == 0 && f32.m(th3.getClass().getName());
                ArrayList arrayList = new ArrayList();
                arrayList.add(new StackTraceElement(th3.getClass().getName(), "<filtered>", "<filtered>", 1));
                for (StackTraceElement stackTraceElement : stackTrace) {
                    if (f32.m(stackTraceElement.getClassName())) {
                        arrayList.add(stackTraceElement);
                        z = true;
                    } else {
                        String className = stackTraceElement.getClassName();
                        if (!TextUtils.isEmpty(className) && (className.startsWith("android.") || className.startsWith("java."))) {
                            arrayList.add(stackTraceElement);
                        } else {
                            arrayList.add(new StackTraceElement("<filtered>", "<filtered>", "<filtered>", 1));
                        }
                    }
                }
                if (z) {
                    th2 = th2 == null ? new Throwable(th3.getMessage()) : new Throwable(th3.getMessage(), th2);
                    th2.setStackTrace((StackTraceElement[]) arrayList.toArray(new StackTraceElement[0]));
                }
            }
        }
        if (th2 != null) {
            String name = th.getClass().getName();
            String strE = e(th);
            String str2 = "";
            if (((Boolean) tu0.e.c.a(lx0.x9)).booleanValue() && (strD = f32.d(e(th), "SHA-256")) != null) {
                str2 = strD;
            }
            double d = f;
            double dRandom = Math.random();
            int i = f > 0.0f ? (int) (1.0f / f) : 1;
            if (dRandom < d) {
                ArrayList arrayList2 = new ArrayList();
                try {
                    zE = q90.a(context).e();
                } catch (Throwable th4) {
                    jn.P("Error fetching instant app info", th4);
                    zE = false;
                }
                try {
                    packageName = context.getPackageName();
                } catch (Throwable unused) {
                    jn.T("Cannot obtain package name, proceeding.");
                    packageName = "unknown";
                }
                Uri.Builder builderAppendQueryParameter = new Uri.Builder().scheme("https").path("//pagead2.googlesyndication.com/pagead/gen_204").appendQueryParameter("is_aia", Boolean.toString(zE)).appendQueryParameter("id", "gmob-apps-report-exception").appendQueryParameter("os", Build.VERSION.RELEASE);
                int i2 = Build.VERSION.SDK_INT;
                Uri.Builder builderAppendQueryParameter2 = builderAppendQueryParameter.appendQueryParameter("api", String.valueOf(i2));
                String str3 = Build.MANUFACTURER;
                String strN = Build.MODEL;
                if (!strN.startsWith(str3)) {
                    strN = ec.n(new StringBuilder(String.valueOf(str3).length() + 1 + strN.length()), str3, " ", strN);
                }
                Uri.Builder builderAppendQueryParameter3 = builderAppendQueryParameter2.appendQueryParameter("device", strN);
                d60 d60Var = this.j;
                Uri.Builder builderAppendQueryParameter4 = builderAppendQueryParameter3.appendQueryParameter("js", d60Var.f).appendQueryParameter("appid", packageName).appendQueryParameter("exceptiontype", name).appendQueryParameter("stacktrace", strE);
                tu0 tu0Var = tu0.e;
                r52 r52Var = tu0Var.a;
                kx0 kx0Var = tu0Var.c;
                Uri.Builder builderAppendQueryParameter5 = builderAppendQueryParameter4.appendQueryParameter("eids", TextUtils.join(",", r52Var.N())).appendQueryParameter("exceptionkey", str).appendQueryParameter("cl", "811902923").appendQueryParameter("rc", "dev").appendQueryParameter("sampling_rate", Integer.toString(i)).appendQueryParameter("pb_tm", String.valueOf(dz0.c.u()));
                am.b.getClass();
                Uri.Builder builderAppendQueryParameter6 = builderAppendQueryParameter5.appendQueryParameter("gmscv", String.valueOf(am.a(context))).appendQueryParameter("lite", true != d60Var.j ? "0" : "1");
                if (!TextUtils.isEmpty(str2)) {
                    builderAppendQueryParameter6.appendQueryParameter("hash", str2);
                }
                if (((Boolean) kx0Var.a(lx0.k8)).booleanValue()) {
                    if (context == null || (activityManager = (ActivityManager) context.getSystemService("activity")) == null) {
                        memoryInfo = null;
                    } else {
                        memoryInfo = new ActivityManager.MemoryInfo();
                        try {
                            activityManager.getMemoryInfo(memoryInfo);
                        } catch (NullPointerException unused2) {
                            jn.T("Error retrieving the memory information.");
                        }
                    }
                    if (memoryInfo != null) {
                        builderAppendQueryParameter6.appendQueryParameter("available_memory", Long.toString(memoryInfo.availMem));
                        builderAppendQueryParameter6.appendQueryParameter("total_memory", Long.toString(memoryInfo.totalMem));
                        builderAppendQueryParameter6.appendQueryParameter("is_low_memory", true != memoryInfo.lowMemory ? "0" : "1");
                    }
                }
                if (((Boolean) kx0Var.a(lx0.j8)).booleanValue()) {
                    String str4 = this.l;
                    if (!TextUtils.isEmpty(str4)) {
                        builderAppendQueryParameter6.appendQueryParameter("countrycode", str4);
                    }
                    String str5 = this.m;
                    if (!TextUtils.isEmpty(str5)) {
                        builderAppendQueryParameter6.appendQueryParameter("psv", str5);
                    }
                    if (i2 >= 26) {
                        packageInfoD = WebView.getCurrentWebViewPackage();
                    } else if (context == null) {
                        packageInfoD = null;
                    } else {
                        try {
                            packageInfoD = q90.a(context).d("com.android.webview", 128);
                        } catch (PackageManager.NameNotFoundException unused3) {
                            packageInfoD = null;
                        }
                    }
                    if (packageInfoD != null) {
                        builderAppendQueryParameter6.appendQueryParameter("wvvc", Integer.toString(packageInfoD.versionCode));
                        builderAppendQueryParameter6.appendQueryParameter("wvvn", packageInfoD.versionName);
                        builderAppendQueryParameter6.appendQueryParameter("wvpn", packageInfoD.packageName);
                    }
                }
                PackageInfo packageInfo = this.k;
                if (packageInfo != null) {
                    builderAppendQueryParameter6.appendQueryParameter("appvc", String.valueOf(packageInfo.versionCode));
                    builderAppendQueryParameter6.appendQueryParameter("appvn", packageInfo.versionName);
                }
                arrayList2.add(builderAppendQueryParameter6.toString());
                int size = arrayList2.size();
                int i3 = 0;
                while (i3 < size) {
                    Object obj = arrayList2.get(i3);
                    i3++;
                    this.i.execute(new in2(new id3(context, null), 25, (String) obj));
                }
            }
        }
    }

    public final void i() {
        Thread thread = Looper.getMainLooper().getThread();
        if (thread == null) {
            return;
        }
        synchronized (this.f) {
            this.h.put(thread, Boolean.TRUE);
        }
        thread.setUncaughtExceptionHandler(new d71(this, thread.getUncaughtExceptionHandler(), 1));
    }
}
