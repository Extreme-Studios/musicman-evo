package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Binder;
import android.os.ConditionVariable;
import android.os.Process;
import android.os.StrictMode;
import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class iv implements ii2, gm1 {
    public final Context f;

    public /* synthetic */ iv(Context context) {
        this.f = context;
    }

    /* JADX WARN: Code duplicated, block: B:110:0x0195 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:49:0x00be A[Catch: all -> 0x0068, TRY_ENTER, TryCatch #4 {all -> 0x0068, blocks: (B:22:0x004f, B:23:0x0053, B:28:0x0060, B:34:0x006d, B:37:0x0079, B:38:0x0083, B:40:0x0089, B:42:0x0099, B:44:0x00b0, B:49:0x00be, B:51:0x00c2, B:53:0x00d2, B:55:0x00e9, B:58:0x00f2, B:70:0x0149, B:77:0x0159, B:79:0x0167, B:81:0x0175, B:82:0x017c, B:84:0x018a, B:86:0x018e, B:87:0x0191, B:89:0x0195, B:91:0x01b5, B:93:0x01c1, B:94:0x01c4, B:95:0x01c5, B:61:0x0103, B:63:0x0111, B:65:0x0119, B:67:0x0139, B:68:0x013c, B:72:0x014d, B:73:0x0150, B:66:0x011d), top: B:113:0x004f, outer: #5, inners: #6 }] */
    /* JADX WARN: Code duplicated, block: B:51:0x00c2 A[Catch: all -> 0x0068, TryCatch #4 {all -> 0x0068, blocks: (B:22:0x004f, B:23:0x0053, B:28:0x0060, B:34:0x006d, B:37:0x0079, B:38:0x0083, B:40:0x0089, B:42:0x0099, B:44:0x00b0, B:49:0x00be, B:51:0x00c2, B:53:0x00d2, B:55:0x00e9, B:58:0x00f2, B:70:0x0149, B:77:0x0159, B:79:0x0167, B:81:0x0175, B:82:0x017c, B:84:0x018a, B:86:0x018e, B:87:0x0191, B:89:0x0195, B:91:0x01b5, B:93:0x01c1, B:94:0x01c4, B:95:0x01c5, B:61:0x0103, B:63:0x0111, B:65:0x0119, B:67:0x0139, B:68:0x013c, B:72:0x014d, B:73:0x0150, B:66:0x011d), top: B:113:0x004f, outer: #5, inners: #6 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x00f2 A[Catch: all -> 0x0068, TRY_ENTER, TryCatch #4 {all -> 0x0068, blocks: (B:22:0x004f, B:23:0x0053, B:28:0x0060, B:34:0x006d, B:37:0x0079, B:38:0x0083, B:40:0x0089, B:42:0x0099, B:44:0x00b0, B:49:0x00be, B:51:0x00c2, B:53:0x00d2, B:55:0x00e9, B:58:0x00f2, B:70:0x0149, B:77:0x0159, B:79:0x0167, B:81:0x0175, B:82:0x017c, B:84:0x018a, B:86:0x018e, B:87:0x0191, B:89:0x0195, B:91:0x01b5, B:93:0x01c1, B:94:0x01c4, B:95:0x01c5, B:61:0x0103, B:63:0x0111, B:65:0x0119, B:67:0x0139, B:68:0x013c, B:72:0x014d, B:73:0x0150, B:66:0x011d), top: B:113:0x004f, outer: #5, inners: #6 }] */
    /* JADX WARN: Code duplicated, block: B:60:0x0102  */
    /* JADX WARN: Code duplicated, block: B:61:0x0103 A[Catch: all -> 0x0068, TryCatch #4 {all -> 0x0068, blocks: (B:22:0x004f, B:23:0x0053, B:28:0x0060, B:34:0x006d, B:37:0x0079, B:38:0x0083, B:40:0x0089, B:42:0x0099, B:44:0x00b0, B:49:0x00be, B:51:0x00c2, B:53:0x00d2, B:55:0x00e9, B:58:0x00f2, B:70:0x0149, B:77:0x0159, B:79:0x0167, B:81:0x0175, B:82:0x017c, B:84:0x018a, B:86:0x018e, B:87:0x0191, B:89:0x0195, B:91:0x01b5, B:93:0x01c1, B:94:0x01c4, B:95:0x01c5, B:61:0x0103, B:63:0x0111, B:65:0x0119, B:67:0x0139, B:68:0x013c, B:72:0x014d, B:73:0x0150, B:66:0x011d), top: B:113:0x004f, outer: #5, inners: #6 }] */
    /* JADX WARN: Code duplicated, block: B:63:0x0111 A[Catch: all -> 0x0068, TryCatch #4 {all -> 0x0068, blocks: (B:22:0x004f, B:23:0x0053, B:28:0x0060, B:34:0x006d, B:37:0x0079, B:38:0x0083, B:40:0x0089, B:42:0x0099, B:44:0x00b0, B:49:0x00be, B:51:0x00c2, B:53:0x00d2, B:55:0x00e9, B:58:0x00f2, B:70:0x0149, B:77:0x0159, B:79:0x0167, B:81:0x0175, B:82:0x017c, B:84:0x018a, B:86:0x018e, B:87:0x0191, B:89:0x0195, B:91:0x01b5, B:93:0x01c1, B:94:0x01c4, B:95:0x01c5, B:61:0x0103, B:63:0x0111, B:65:0x0119, B:67:0x0139, B:68:0x013c, B:72:0x014d, B:73:0x0150, B:66:0x011d), top: B:113:0x004f, outer: #5, inners: #6 }] */
    /* JADX WARN: Code duplicated, block: B:75:0x0153 A[Catch: all -> 0x0018, TRY_ENTER, TRY_LEAVE, TryCatch #5 {all -> 0x0018, blocks: (B:7:0x0012, B:9:0x0016, B:13:0x001b, B:15:0x0020, B:16:0x0022, B:18:0x0034, B:19:0x0038, B:20:0x003a, B:45:0x00b4, B:46:0x00b8, B:47:0x00bb, B:56:0x00ed, B:75:0x0153, B:96:0x01c7, B:97:0x01ce, B:99:0x01d0, B:100:0x01d7, B:22:0x004f, B:23:0x0053, B:28:0x0060, B:34:0x006d, B:37:0x0079, B:38:0x0083, B:40:0x0089, B:42:0x0099, B:44:0x00b0, B:49:0x00be, B:51:0x00c2, B:53:0x00d2, B:55:0x00e9, B:58:0x00f2, B:70:0x0149, B:77:0x0159, B:79:0x0167, B:81:0x0175, B:82:0x017c, B:84:0x018a, B:86:0x018e, B:87:0x0191, B:89:0x0195, B:91:0x01b5, B:93:0x01c1, B:94:0x01c4, B:95:0x01c5, B:61:0x0103, B:63:0x0111, B:65:0x0119, B:67:0x0139, B:68:0x013c, B:72:0x014d, B:73:0x0150, B:66:0x011d), top: B:114:0x0012, inners: #4 }] */
    /* JADX WARN: Code duplicated, block: B:77:0x0159 A[Catch: all -> 0x0068, TRY_ENTER, TryCatch #4 {all -> 0x0068, blocks: (B:22:0x004f, B:23:0x0053, B:28:0x0060, B:34:0x006d, B:37:0x0079, B:38:0x0083, B:40:0x0089, B:42:0x0099, B:44:0x00b0, B:49:0x00be, B:51:0x00c2, B:53:0x00d2, B:55:0x00e9, B:58:0x00f2, B:70:0x0149, B:77:0x0159, B:79:0x0167, B:81:0x0175, B:82:0x017c, B:84:0x018a, B:86:0x018e, B:87:0x0191, B:89:0x0195, B:91:0x01b5, B:93:0x01c1, B:94:0x01c4, B:95:0x01c5, B:61:0x0103, B:63:0x0111, B:65:0x0119, B:67:0x0139, B:68:0x013c, B:72:0x014d, B:73:0x0150, B:66:0x011d), top: B:113:0x004f, outer: #5, inners: #6 }] */
    /* JADX WARN: Code duplicated, block: B:79:0x0167 A[Catch: all -> 0x0068, TryCatch #4 {all -> 0x0068, blocks: (B:22:0x004f, B:23:0x0053, B:28:0x0060, B:34:0x006d, B:37:0x0079, B:38:0x0083, B:40:0x0089, B:42:0x0099, B:44:0x00b0, B:49:0x00be, B:51:0x00c2, B:53:0x00d2, B:55:0x00e9, B:58:0x00f2, B:70:0x0149, B:77:0x0159, B:79:0x0167, B:81:0x0175, B:82:0x017c, B:84:0x018a, B:86:0x018e, B:87:0x0191, B:89:0x0195, B:91:0x01b5, B:93:0x01c1, B:94:0x01c4, B:95:0x01c5, B:61:0x0103, B:63:0x0111, B:65:0x0119, B:67:0x0139, B:68:0x013c, B:72:0x014d, B:73:0x0150, B:66:0x011d), top: B:113:0x004f, outer: #5, inners: #6 }] */
    /* JADX WARN: Code duplicated, block: B:84:0x018a A[Catch: all -> 0x0068, TryCatch #4 {all -> 0x0068, blocks: (B:22:0x004f, B:23:0x0053, B:28:0x0060, B:34:0x006d, B:37:0x0079, B:38:0x0083, B:40:0x0089, B:42:0x0099, B:44:0x00b0, B:49:0x00be, B:51:0x00c2, B:53:0x00d2, B:55:0x00e9, B:58:0x00f2, B:70:0x0149, B:77:0x0159, B:79:0x0167, B:81:0x0175, B:82:0x017c, B:84:0x018a, B:86:0x018e, B:87:0x0191, B:89:0x0195, B:91:0x01b5, B:93:0x01c1, B:94:0x01c4, B:95:0x01c5, B:61:0x0103, B:63:0x0111, B:65:0x0119, B:67:0x0139, B:68:0x013c, B:72:0x014d, B:73:0x0150, B:66:0x011d), top: B:113:0x004f, outer: #5, inners: #6 }] */
    @Override // defpackage.ii2
    public Object a() {
        Context applicationContext;
        SharedPreferences sharedPreferencesE;
        SharedPreferences sharedPreferences;
        StrictMode.ThreadPolicy threadPolicy;
        String string;
        tu0 tu0Var;
        SharedPreferences sharedPreferences2;
        StrictMode.ThreadPolicy threadPolicy2;
        SharedPreferences sharedPreferences3;
        ConditionVariable conditionVariable;
        um0 um0Var;
        ix0 ix0Var = lx0.a;
        kx0 kx0Var = tu0.e.c;
        Context applicationContext2 = this.f;
        if (!kx0Var.c) {
            synchronized (kx0Var.a) {
                try {
                    if (kx0Var.c) {
                        return null;
                    }
                    if (!kx0Var.d) {
                        kx0Var.d = true;
                    }
                    kx0Var.i = TextUtils.equals(applicationContext2.getPackageName(), "com.google.android.gms");
                    if (applicationContext2.getApplicationContext() != null) {
                        applicationContext2 = applicationContext2.getApplicationContext();
                    }
                    kx0Var.g = applicationContext2;
                    try {
                        kx0Var.f = q90.a(applicationContext2).c(kx0Var.g.getPackageName(), 128).metaData;
                    } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
                    }
                    try {
                        Context context = kx0Var.g;
                        int i = fm.c;
                        try {
                            applicationContext = context.createPackageContext("com.google.android.gms", 3);
                        } catch (PackageManager.NameNotFoundException unused2) {
                            applicationContext = null;
                        }
                        if (applicationContext != null || context == null || (applicationContext = context.getApplicationContext()) != null) {
                            context = applicationContext;
                        }
                        if (context != null) {
                            zf0 zf0Var = tu0.e.b;
                            sharedPreferencesE = zf0.e(context);
                        } else {
                            sharedPreferencesE = null;
                        }
                        if (sharedPreferencesE != null) {
                            jz0.a.set(new jx0(kx0Var, sharedPreferencesE));
                        }
                        if (!kx0Var.i) {
                            um0 um0Var2 = ly0.d;
                            if (((Long) um0Var2.u()).longValue() > 0 && i8.H(kx0Var.g, "crash_without_write") >= ((Long) um0Var2.u()).longValue()) {
                                kx0Var.j = true;
                                kx0Var.c = true;
                                kx0Var.d = false;
                                conditionVariable = kx0Var.b;
                            } else if (kx0Var.i) {
                                Context context2 = kx0Var.g;
                                if (!((Boolean) ry0.i.u()).booleanValue()) {
                                    if (((Boolean) ry0.j.u()).booleanValue()) {
                                        threadPolicy = StrictMode.getThreadPolicy();
                                        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
                                        string = sharedPreferences.getString("app_settings_json", "{}");
                                        StrictMode.setThreadPolicy(threadPolicy);
                                        if (new JSONObject(string).optBoolean("local_flags_enabled")) {
                                        }
                                    }
                                    if (context == null) {
                                        kx0Var.d = false;
                                        conditionVariable = kx0Var.b;
                                    } else {
                                        tu0Var = tu0.e;
                                        zf0 zf0Var2 = tu0Var.b;
                                        kx0Var.e = zf0.e(context);
                                        if (!kx0Var.i) {
                                            tu0Var.d.a(kx0Var.g);
                                        }
                                        if (!((Boolean) ry0.b.u()).booleanValue()) {
                                            sharedPreferences3.registerOnSharedPreferenceChangeListener(kx0Var);
                                        }
                                        sharedPreferences2 = kx0Var.e;
                                        if (sharedPreferences2 != null) {
                                            threadPolicy2 = StrictMode.getThreadPolicy();
                                            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy2).permitDiskReads().permitDiskWrites().build());
                                            String string2 = sharedPreferences2.getString("flag_configuration", "{}");
                                            StrictMode.setThreadPolicy(threadPolicy2);
                                            kx0Var.h = new JSONObject(string2);
                                        }
                                        kx0Var.c = true;
                                        kx0Var.d = false;
                                        kx0Var.b.open();
                                    }
                                }
                                context = kx0Var.g;
                                if (context == null) {
                                    kx0Var.d = false;
                                    conditionVariable = kx0Var.b;
                                } else {
                                    tu0Var = tu0.e;
                                    zf0 zf0Var3 = tu0Var.b;
                                    kx0Var.e = zf0.e(context);
                                    if (!kx0Var.i) {
                                        tu0Var.d.a(kx0Var.g);
                                    }
                                    if (!((Boolean) ry0.b.u()).booleanValue()) {
                                        sharedPreferences3.registerOnSharedPreferenceChangeListener(kx0Var);
                                    }
                                    sharedPreferences2 = kx0Var.e;
                                    if (sharedPreferences2 != null) {
                                        threadPolicy2 = StrictMode.getThreadPolicy();
                                        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy2).permitDiskReads().permitDiskWrites().build());
                                        String string3 = sharedPreferences2.getString("flag_configuration", "{}");
                                        StrictMode.setThreadPolicy(threadPolicy2);
                                        kx0Var.h = new JSONObject(string3);
                                    }
                                    kx0Var.c = true;
                                    kx0Var.d = false;
                                    kx0Var.b.open();
                                }
                            } else {
                                um0Var = ly0.f;
                                if (((Long) um0Var.u()).longValue() > 0 || i8.H(kx0Var.g, "init_without_write") < ((Long) um0Var.u()).longValue()) {
                                    Context context3 = kx0Var.g;
                                    if (!((Boolean) ry0.i.u()).booleanValue()) {
                                        if (((Boolean) ry0.j.u()).booleanValue() && (sharedPreferences = context3.getSharedPreferences("admob", 0)) != null) {
                                            threadPolicy = StrictMode.getThreadPolicy();
                                            try {
                                                StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
                                                string = sharedPreferences.getString("app_settings_json", "{}");
                                                StrictMode.setThreadPolicy(threadPolicy);
                                                try {
                                                    if (new JSONObject(string).optBoolean("local_flags_enabled")) {
                                                    }
                                                } catch (JSONException unused3) {
                                                }
                                            } catch (Throwable th) {
                                                StrictMode.setThreadPolicy(threadPolicy);
                                                throw th;
                                            }
                                        }
                                        if (context == null) {
                                            kx0Var.d = false;
                                            conditionVariable = kx0Var.b;
                                        } else {
                                            tu0Var = tu0.e;
                                            zf0 zf0Var4 = tu0Var.b;
                                            kx0Var.e = zf0.e(context);
                                            if (!kx0Var.i && ((Boolean) ry0.c.u()).booleanValue()) {
                                                tu0Var.d.a(kx0Var.g);
                                            }
                                            if (!((Boolean) ry0.b.u()).booleanValue() && (sharedPreferences3 = kx0Var.e) != null) {
                                                sharedPreferences3.registerOnSharedPreferenceChangeListener(kx0Var);
                                            }
                                            sharedPreferences2 = kx0Var.e;
                                            if (sharedPreferences2 != null) {
                                                try {
                                                    threadPolicy2 = StrictMode.getThreadPolicy();
                                                    try {
                                                        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy2).permitDiskReads().permitDiskWrites().build());
                                                        String string4 = sharedPreferences2.getString("flag_configuration", "{}");
                                                        StrictMode.setThreadPolicy(threadPolicy2);
                                                        kx0Var.h = new JSONObject(string4);
                                                    } catch (Throwable th2) {
                                                        StrictMode.setThreadPolicy(threadPolicy2);
                                                        throw th2;
                                                    }
                                                } catch (JSONException unused4) {
                                                }
                                            }
                                            kx0Var.c = true;
                                            kx0Var.d = false;
                                            kx0Var.b.open();
                                        }
                                    }
                                    context = kx0Var.g;
                                    if (context == null) {
                                        kx0Var.d = false;
                                        conditionVariable = kx0Var.b;
                                    } else {
                                        tu0Var = tu0.e;
                                        zf0 zf0Var5 = tu0Var.b;
                                        kx0Var.e = zf0.e(context);
                                        if (!kx0Var.i) {
                                            tu0Var.d.a(kx0Var.g);
                                        }
                                        if (!((Boolean) ry0.b.u()).booleanValue()) {
                                            sharedPreferences3.registerOnSharedPreferenceChangeListener(kx0Var);
                                        }
                                        sharedPreferences2 = kx0Var.e;
                                        if (sharedPreferences2 != null) {
                                            threadPolicy2 = StrictMode.getThreadPolicy();
                                            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy2).permitDiskReads().permitDiskWrites().build());
                                            String string5 = sharedPreferences2.getString("flag_configuration", "{}");
                                            StrictMode.setThreadPolicy(threadPolicy2);
                                            kx0Var.h = new JSONObject(string5);
                                        }
                                        kx0Var.c = true;
                                        kx0Var.d = false;
                                        kx0Var.b.open();
                                    }
                                } else {
                                    kx0Var.j = true;
                                    kx0Var.c = true;
                                    kx0Var.d = false;
                                    conditionVariable = kx0Var.b;
                                }
                            }
                            conditionVariable.open();
                        } else if (kx0Var.i) {
                            um0Var = ly0.f;
                            if (((Long) um0Var.u()).longValue() > 0) {
                                Context context4 = kx0Var.g;
                                if (!((Boolean) ry0.i.u()).booleanValue()) {
                                    if (((Boolean) ry0.j.u()).booleanValue()) {
                                        threadPolicy = StrictMode.getThreadPolicy();
                                        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
                                        string = sharedPreferences.getString("app_settings_json", "{}");
                                        StrictMode.setThreadPolicy(threadPolicy);
                                        if (new JSONObject(string).optBoolean("local_flags_enabled")) {
                                        }
                                    }
                                    if (context == null) {
                                        kx0Var.d = false;
                                        conditionVariable = kx0Var.b;
                                        conditionVariable.open();
                                    } else {
                                        tu0Var = tu0.e;
                                        zf0 zf0Var6 = tu0Var.b;
                                        kx0Var.e = zf0.e(context);
                                        if (!kx0Var.i) {
                                            tu0Var.d.a(kx0Var.g);
                                        }
                                        if (!((Boolean) ry0.b.u()).booleanValue()) {
                                            sharedPreferences3.registerOnSharedPreferenceChangeListener(kx0Var);
                                        }
                                        sharedPreferences2 = kx0Var.e;
                                        if (sharedPreferences2 != null) {
                                            threadPolicy2 = StrictMode.getThreadPolicy();
                                            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy2).permitDiskReads().permitDiskWrites().build());
                                            String string6 = sharedPreferences2.getString("flag_configuration", "{}");
                                            StrictMode.setThreadPolicy(threadPolicy2);
                                            kx0Var.h = new JSONObject(string6);
                                        }
                                        kx0Var.c = true;
                                        kx0Var.d = false;
                                        kx0Var.b.open();
                                    }
                                }
                                context = kx0Var.g;
                                if (context == null) {
                                    kx0Var.d = false;
                                    conditionVariable = kx0Var.b;
                                    conditionVariable.open();
                                } else {
                                    tu0Var = tu0.e;
                                    zf0 zf0Var7 = tu0Var.b;
                                    kx0Var.e = zf0.e(context);
                                    if (!kx0Var.i) {
                                        tu0Var.d.a(kx0Var.g);
                                    }
                                    if (!((Boolean) ry0.b.u()).booleanValue()) {
                                        sharedPreferences3.registerOnSharedPreferenceChangeListener(kx0Var);
                                    }
                                    sharedPreferences2 = kx0Var.e;
                                    if (sharedPreferences2 != null) {
                                        threadPolicy2 = StrictMode.getThreadPolicy();
                                        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy2).permitDiskReads().permitDiskWrites().build());
                                        String string7 = sharedPreferences2.getString("flag_configuration", "{}");
                                        StrictMode.setThreadPolicy(threadPolicy2);
                                        kx0Var.h = new JSONObject(string7);
                                    }
                                    kx0Var.c = true;
                                    kx0Var.d = false;
                                    kx0Var.b.open();
                                }
                            } else {
                                Context context5 = kx0Var.g;
                                if (!((Boolean) ry0.i.u()).booleanValue()) {
                                    if (((Boolean) ry0.j.u()).booleanValue()) {
                                        threadPolicy = StrictMode.getThreadPolicy();
                                        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
                                        string = sharedPreferences.getString("app_settings_json", "{}");
                                        StrictMode.setThreadPolicy(threadPolicy);
                                        if (new JSONObject(string).optBoolean("local_flags_enabled")) {
                                        }
                                    }
                                    if (context == null) {
                                        kx0Var.d = false;
                                        conditionVariable = kx0Var.b;
                                        conditionVariable.open();
                                    } else {
                                        tu0Var = tu0.e;
                                        zf0 zf0Var8 = tu0Var.b;
                                        kx0Var.e = zf0.e(context);
                                        if (!kx0Var.i) {
                                            tu0Var.d.a(kx0Var.g);
                                        }
                                        if (!((Boolean) ry0.b.u()).booleanValue()) {
                                            sharedPreferences3.registerOnSharedPreferenceChangeListener(kx0Var);
                                        }
                                        sharedPreferences2 = kx0Var.e;
                                        if (sharedPreferences2 != null) {
                                            threadPolicy2 = StrictMode.getThreadPolicy();
                                            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy2).permitDiskReads().permitDiskWrites().build());
                                            String string8 = sharedPreferences2.getString("flag_configuration", "{}");
                                            StrictMode.setThreadPolicy(threadPolicy2);
                                            kx0Var.h = new JSONObject(string8);
                                        }
                                        kx0Var.c = true;
                                        kx0Var.d = false;
                                        kx0Var.b.open();
                                    }
                                }
                                context = kx0Var.g;
                                if (context == null) {
                                    kx0Var.d = false;
                                    conditionVariable = kx0Var.b;
                                    conditionVariable.open();
                                } else {
                                    tu0Var = tu0.e;
                                    zf0 zf0Var9 = tu0Var.b;
                                    kx0Var.e = zf0.e(context);
                                    if (!kx0Var.i) {
                                        tu0Var.d.a(kx0Var.g);
                                    }
                                    if (!((Boolean) ry0.b.u()).booleanValue()) {
                                        sharedPreferences3.registerOnSharedPreferenceChangeListener(kx0Var);
                                    }
                                    sharedPreferences2 = kx0Var.e;
                                    if (sharedPreferences2 != null) {
                                        threadPolicy2 = StrictMode.getThreadPolicy();
                                        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy2).permitDiskReads().permitDiskWrites().build());
                                        String string9 = sharedPreferences2.getString("flag_configuration", "{}");
                                        StrictMode.setThreadPolicy(threadPolicy2);
                                        kx0Var.h = new JSONObject(string9);
                                    }
                                    kx0Var.c = true;
                                    kx0Var.d = false;
                                    kx0Var.b.open();
                                }
                            }
                        } else {
                            Context context6 = kx0Var.g;
                            if (!((Boolean) ry0.i.u()).booleanValue()) {
                                if (((Boolean) ry0.j.u()).booleanValue()) {
                                    threadPolicy = StrictMode.getThreadPolicy();
                                    StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
                                    string = sharedPreferences.getString("app_settings_json", "{}");
                                    StrictMode.setThreadPolicy(threadPolicy);
                                    if (new JSONObject(string).optBoolean("local_flags_enabled")) {
                                    }
                                }
                                if (context == null) {
                                    kx0Var.d = false;
                                    conditionVariable = kx0Var.b;
                                    conditionVariable.open();
                                } else {
                                    tu0Var = tu0.e;
                                    zf0 zf0Var10 = tu0Var.b;
                                    kx0Var.e = zf0.e(context);
                                    if (!kx0Var.i) {
                                        tu0Var.d.a(kx0Var.g);
                                    }
                                    if (!((Boolean) ry0.b.u()).booleanValue()) {
                                        sharedPreferences3.registerOnSharedPreferenceChangeListener(kx0Var);
                                    }
                                    sharedPreferences2 = kx0Var.e;
                                    if (sharedPreferences2 != null) {
                                        threadPolicy2 = StrictMode.getThreadPolicy();
                                        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy2).permitDiskReads().permitDiskWrites().build());
                                        String string10 = sharedPreferences2.getString("flag_configuration", "{}");
                                        StrictMode.setThreadPolicy(threadPolicy2);
                                        kx0Var.h = new JSONObject(string10);
                                    }
                                    kx0Var.c = true;
                                    kx0Var.d = false;
                                    kx0Var.b.open();
                                }
                            }
                            context = kx0Var.g;
                            if (context == null) {
                                kx0Var.d = false;
                                conditionVariable = kx0Var.b;
                                conditionVariable.open();
                            } else {
                                tu0Var = tu0.e;
                                zf0 zf0Var11 = tu0Var.b;
                                kx0Var.e = zf0.e(context);
                                if (!kx0Var.i) {
                                    tu0Var.d.a(kx0Var.g);
                                }
                                if (!((Boolean) ry0.b.u()).booleanValue()) {
                                    sharedPreferences3.registerOnSharedPreferenceChangeListener(kx0Var);
                                }
                                sharedPreferences2 = kx0Var.e;
                                if (sharedPreferences2 != null) {
                                    threadPolicy2 = StrictMode.getThreadPolicy();
                                    StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy2).permitDiskReads().permitDiskWrites().build());
                                    String string11 = sharedPreferences2.getString("flag_configuration", "{}");
                                    StrictMode.setThreadPolicy(threadPolicy2);
                                    kx0Var.h = new JSONObject(string11);
                                }
                                kx0Var.c = true;
                                kx0Var.d = false;
                                kx0Var.b.open();
                            }
                        }
                    } catch (Throwable th3) {
                        kx0Var.d = false;
                        kx0Var.b.open();
                        throw th3;
                    }
                } catch (Throwable th4) {
                    throw th4;
                }
            }
        }
        return null;
    }

    @Override // defpackage.gm1
    /* JADX INFO: renamed from: b */
    public /* synthetic */ void mo4b(Object obj) {
        ((mk1) obj).h(this.f);
    }

    public ApplicationInfo c(String str, int i) {
        return this.f.getPackageManager().getApplicationInfo(str, i);
    }

    public PackageInfo d(String str, int i) {
        return this.f.getPackageManager().getPackageInfo(str, i);
    }

    public boolean e() {
        String nameForUid;
        int callingUid = Binder.getCallingUid();
        int iMyUid = Process.myUid();
        Context context = this.f;
        if (callingUid == iMyUid) {
            return hn.m(context);
        }
        if (!ej1.k() || (nameForUid = context.getPackageManager().getNameForUid(Binder.getCallingUid())) == null) {
            return false;
        }
        return context.getPackageManager().isInstantApp(nameForUid);
    }
}
