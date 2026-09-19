package defpackage;

import android.app.Activity;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.hardware.display.DisplayManager;
import android.media.AudioManager;
import android.net.Uri;
import android.os.BatteryManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.LocaleList;
import android.os.Parcel;
import android.os.Process;
import android.os.RemoteException;
import android.os.StatFs;
import android.os.ext.SdkExtensions;
import android.preference.PreferenceManager;
import android.provider.Settings;
import android.util.Base64;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.webkit.CookieManager;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class br0 implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ br0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    private final Object a() {
        HashMap map;
        os1 os1Var = (os1) ((c02) this.b).c;
        synchronized (os1Var) {
            map = new HashMap();
            if (((Boolean) tu0.e.c.a(lx0.l8)).booleanValue()) {
                os1Var.b();
                for (Map.Entry entry : os1Var.a.entrySet()) {
                    map.put((ns1) entry.getKey(), new ArrayDeque((Collection) entry.getValue()));
                }
            }
        }
        return new s12(map, 0);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x004d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:15:0x004f A[Catch: IOException -> 0x0036, TryCatch #2 {IOException -> 0x0036, blocks: (B:3:0x0004, B:5:0x001e, B:7:0x0030, B:12:0x003b, B:17:0x0061, B:18:0x0086, B:26:0x0093, B:28:0x00a5, B:30:0x00bb, B:32:0x00c4, B:37:0x00e6, B:39:0x0104, B:40:0x0127, B:48:0x013c, B:49:0x0141, B:58:0x015a, B:56:0x0156, B:46:0x013a, B:35:0x00d6, B:25:0x0092, B:15:0x004f, B:20:0x0089, B:21:0x008d, B:50:0x0142, B:51:0x0150, B:41:0x0128, B:42:0x0136), top: B:66:0x0004, inners: #0, #1, #3 }] */
    /* JADX WARN: Code duplicated, block: B:17:0x0061 A[Catch: IOException -> 0x0036, TryCatch #2 {IOException -> 0x0036, blocks: (B:3:0x0004, B:5:0x001e, B:7:0x0030, B:12:0x003b, B:17:0x0061, B:18:0x0086, B:26:0x0093, B:28:0x00a5, B:30:0x00bb, B:32:0x00c4, B:37:0x00e6, B:39:0x0104, B:40:0x0127, B:48:0x013c, B:49:0x0141, B:58:0x015a, B:56:0x0156, B:46:0x013a, B:35:0x00d6, B:25:0x0092, B:15:0x004f, B:20:0x0089, B:21:0x008d, B:50:0x0142, B:51:0x0150, B:41:0x0128, B:42:0x0136), top: B:66:0x0004, inners: #0, #1, #3 }] */
    /* JADX WARN: Code duplicated, block: B:19:0x0087  */
    /* JADX WARN: Code duplicated, block: B:34:0x00d4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x00d6 A[Catch: IOException -> 0x0036, TryCatch #2 {IOException -> 0x0036, blocks: (B:3:0x0004, B:5:0x001e, B:7:0x0030, B:12:0x003b, B:17:0x0061, B:18:0x0086, B:26:0x0093, B:28:0x00a5, B:30:0x00bb, B:32:0x00c4, B:37:0x00e6, B:39:0x0104, B:40:0x0127, B:48:0x013c, B:49:0x0141, B:58:0x015a, B:56:0x0156, B:46:0x013a, B:35:0x00d6, B:25:0x0092, B:15:0x004f, B:20:0x0089, B:21:0x008d, B:50:0x0142, B:51:0x0150, B:41:0x0128, B:42:0x0136), top: B:66:0x0004, inners: #0, #1, #3 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x00e6 A[Catch: IOException -> 0x0036, TryCatch #2 {IOException -> 0x0036, blocks: (B:3:0x0004, B:5:0x001e, B:7:0x0030, B:12:0x003b, B:17:0x0061, B:18:0x0086, B:26:0x0093, B:28:0x00a5, B:30:0x00bb, B:32:0x00c4, B:37:0x00e6, B:39:0x0104, B:40:0x0127, B:48:0x013c, B:49:0x0141, B:58:0x015a, B:56:0x0156, B:46:0x013a, B:35:0x00d6, B:25:0x0092, B:15:0x004f, B:20:0x0089, B:21:0x008d, B:50:0x0142, B:51:0x0150, B:41:0x0128, B:42:0x0136), top: B:66:0x0004, inners: #0, #1, #3 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x0104 A[Catch: IOException -> 0x0036, TryCatch #2 {IOException -> 0x0036, blocks: (B:3:0x0004, B:5:0x001e, B:7:0x0030, B:12:0x003b, B:17:0x0061, B:18:0x0086, B:26:0x0093, B:28:0x00a5, B:30:0x00bb, B:32:0x00c4, B:37:0x00e6, B:39:0x0104, B:40:0x0127, B:48:0x013c, B:49:0x0141, B:58:0x015a, B:56:0x0156, B:46:0x013a, B:35:0x00d6, B:25:0x0092, B:15:0x004f, B:20:0x0089, B:21:0x008d, B:50:0x0142, B:51:0x0150, B:41:0x0128, B:42:0x0136), top: B:66:0x0004, inners: #0, #1, #3 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x013b  */
    /* JADX WARN: Code duplicated, block: B:64:0x0142 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:67:0x0128 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    private final Object b() {
        boolean z;
        boolean z2;
        nc2 nc2VarF;
        kc2 kc2VarN;
        a02 a02Var = (a02) this.b;
        try {
            Context context = (Context) a02Var.c;
            boolean zA = ((i52) a02Var.b).a();
            je0 je0Var = new je0(6);
            je0 je0Var2 = new je0(6);
            if (zA) {
                if (!((Boolean) tu0.e.c.a(lx0.v3)).booleanValue()) {
                    return new x12(true);
                }
            }
            if (!zA) {
                if (((Boolean) tu0.e.c.a(lx0.r3)).booleanValue()) {
                    mc2 mc2VarF = mc2.f(context);
                    long jLongValue = ((Long) tu0.e.c.a(lx0.C3)).longValue();
                    boolean zS = vc3.C.h.g().s();
                    mc2VarF.getClass();
                    synchronized (mc2.class) {
                        je0Var = mc2VarF.a(null, null, jLongValue, zS);
                    }
                } else if (zA) {
                    if (((Boolean) tu0.e.c.a(lx0.t3)).booleanValue()) {
                        mc2 mc2VarF2 = mc2.f(context);
                        long jLongValue2 = ((Long) tu0.e.c.a(lx0.C3)).longValue();
                        boolean zS2 = vc3.C.h.g().s();
                        mc2VarF2.getClass();
                        synchronized (mc2.class) {
                        }
                        je0Var = mc2VarF2.a(null, null, jLongValue2, zS2);
                    }
                }
            } else if (zA) {
                if (((Boolean) tu0.e.c.a(lx0.t3)).booleanValue()) {
                    mc2 mc2VarF3 = mc2.f(context);
                    long jLongValue3 = ((Long) tu0.e.c.a(lx0.C3)).longValue();
                    boolean zS3 = vc3.C.h.g().s();
                    mc2VarF3.getClass();
                    synchronized (mc2.class) {
                        je0Var = mc2VarF3.a(null, null, jLongValue3, zS3);
                    }
                }
            }
            ix0 ix0Var = lx0.z3;
            tu0 tu0Var = tu0.e;
            if (((Boolean) tu0Var.c.a(ix0Var)).booleanValue()) {
                if (((d60) a02Var.e).h < ((Integer) tu0Var.c.a(lx0.y3)).intValue()) {
                    nc2.f(context).h();
                }
            }
            if (zA) {
                if (zA) {
                    if (((Boolean) tu0Var.c.a(lx0.u3)).booleanValue()) {
                        nc2VarF = nc2.f(context);
                        kc2VarN = kc2.n(context);
                        if (((d60) a02Var.e).h >= ((Integer) tu0Var.c.a(lx0.y3)).intValue()) {
                            je0Var2 = nc2VarF.g(((Long) tu0Var.c.a(lx0.D3)).longValue(), vc3.C.h.g().s());
                            kc2VarN.getClass();
                            synchronized (kc2.class) {
                                z = ((SharedPreferences) ((z61) kc2VarN.g).h).getBoolean("paidv2_publisher_option", true);
                            }
                        } else {
                            z = true;
                        }
                        kc2VarN.getClass();
                        synchronized (kc2.class) {
                            z2 = ((SharedPreferences) ((z61) kc2VarN.g).h).getBoolean("paidv2_user_option", true);
                        }
                    }
                }
                z = true;
                z2 = true;
            } else {
                if (((Boolean) tu0Var.c.a(lx0.s3)).booleanValue()) {
                    nc2VarF = nc2.f(context);
                    kc2VarN = kc2.n(context);
                    if (((d60) a02Var.e).h >= ((Integer) tu0Var.c.a(lx0.y3)).intValue()) {
                        je0Var2 = nc2VarF.g(((Long) tu0Var.c.a(lx0.D3)).longValue(), vc3.C.h.g().s());
                        kc2VarN.getClass();
                        synchronized (kc2.class) {
                            z = ((SharedPreferences) ((z61) kc2VarN.g).h).getBoolean("paidv2_publisher_option", true);
                        }
                    } else {
                        z = true;
                    }
                    kc2VarN.getClass();
                    synchronized (kc2.class) {
                        z2 = ((SharedPreferences) ((z61) kc2VarN.g).h).getBoolean("paidv2_user_option", true);
                    }
                } else {
                    if (zA) {
                        if (((Boolean) tu0Var.c.a(lx0.u3)).booleanValue()) {
                            nc2VarF = nc2.f(context);
                            kc2VarN = kc2.n(context);
                            if (((d60) a02Var.e).h >= ((Integer) tu0Var.c.a(lx0.y3)).intValue()) {
                                je0Var2 = nc2VarF.g(((Long) tu0Var.c.a(lx0.D3)).longValue(), vc3.C.h.g().s());
                                kc2VarN.getClass();
                                synchronized (kc2.class) {
                                    z = ((SharedPreferences) ((z61) kc2VarN.g).h).getBoolean("paidv2_publisher_option", true);
                                }
                            } else {
                                z = true;
                            }
                            kc2VarN.getClass();
                            synchronized (kc2.class) {
                            }
                            z2 = ((SharedPreferences) ((z61) kc2VarN.g).h).getBoolean("paidv2_user_option", true);
                        }
                    }
                    z = true;
                    z2 = true;
                }
            }
            return new x12(je0Var, je0Var2, z, z2, zA);
        } catch (IOException e) {
            vc3.C.h.d("PerAppIdSignal", e);
            return new x12(((i52) a02Var.b).a());
        }
    }

    private final Object c() {
        g02 g02Var = (g02) this.b;
        aa1 aa1Var = (aa1) g02Var.b;
        Context context = (Context) g02Var.d;
        if (!aa1Var.a(context)) {
            return new f22(null, null, null, null, null);
        }
        String strB = aa1Var.b(context);
        String str = strB == null ? "" : strB;
        String strC = aa1Var.c(context);
        String str2 = strC == null ? "" : strC;
        String strD = aa1Var.d(context);
        String str3 = strD == null ? "" : strD;
        boolean zA = aa1Var.a(context);
        Long l = null;
        String str4 = true != zA ? null : "fa";
        if ("TIME_OUT".equals(str2)) {
            l = (Long) tu0.e.c.a(lx0.t0);
        }
        return new f22(str, str2, str3, str4 == null ? "" : str4, l);
    }

    private final Object d() {
        Context context = ((k02) this.b).c;
        return new p22(i8.H(context, "init_without_write"), i8.H(context, "crash_without_write"));
    }

    /* JADX WARN: Code duplicated, block: B:10:0x008e  */
    /* JADX WARN: Code duplicated, block: B:112:0x0308  */
    /* JADX WARN: Code duplicated, block: B:211:0x052b  */
    /* JADX WARN: Code duplicated, block: B:362:0x0889  */
    /* JADX WARN: Code duplicated, block: B:61:0x0202  */
    /* JADX WARN: Code duplicated, block: B:62:0x0204  */
    /* JADX WARN: Code duplicated, block: B:64:0x0207  */
    /* JADX WARN: Code duplicated, block: B:65:0x0209  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:281:0x068e -> B:283:0x069a). Please report as a decompilation issue!!! */
    @Override // java.util.concurrent.Callable
    public final Object call() {
        long j;
        String strEncodeToString;
        byte[] byteArray;
        ho2 ho2VarX;
        int extensionVersion;
        boolean z;
        int i;
        int streamMaxVolume;
        boolean z2;
        int intExtra;
        boolean zIsCharging;
        int intExtra2;
        JSONObject jSONObject;
        Bundle bundle;
        Boolean boolValueOf;
        tu0 tu0Var;
        String str;
        boolean z3;
        ActivityInfo activityInfo;
        String string;
        boolean z4;
        String string2;
        String str2;
        String str3;
        boolean zEquals;
        String str4;
        String string3;
        boolean z5;
        boolean z6;
        int i2 = 0;
        switch (this.a) {
            case 0:
                Context context = (Context) this.b;
                try {
                    return w40.Z(context, context.getPackageName(), Integer.toString(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode));
                } catch (Throwable unused) {
                    return null;
                }
            case 1:
                return ((h30) this.b).getViewSignals();
            case 2:
                Context context2 = ((sa1) this.b).e;
                int i3 = x30.b;
                Context applicationContext = context2.getApplicationContext();
                if (applicationContext != null) {
                    context2 = applicationContext;
                }
                ArrayList arrayList = new ArrayList();
                try {
                    PackageInfo packageInfoD = q90.a(context2).d(context2.getApplicationInfo().packageName, 4096);
                    if (packageInfoD.requestedPermissions != null && packageInfoD.requestedPermissionsFlags != null) {
                        while (true) {
                            String[] strArr = packageInfoD.requestedPermissions;
                            if (i2 < strArr.length) {
                                if ((packageInfoD.requestedPermissionsFlags[i2] & 2) != 0) {
                                    arrayList.add(strArr[i2]);
                                }
                                i2++;
                            }
                        }
                    }
                } catch (PackageManager.NameNotFoundException unused2) {
                }
                return arrayList;
            case 3:
                fc1 fc1Var = (fc1) this.b;
                return Boolean.valueOf(fc1Var.i.g(fc1Var.j, fc1Var.k, fc1Var));
            case 4:
                xc1 xc1Var = (xc1) this.b;
                xc1Var.getClass();
                es0 es0Var = vc3.C.j;
                wu0 wu0Var = xc1Var.s;
                synchronized (es0Var.h) {
                    try {
                        j = -2;
                        if (((xu0) es0Var.k) != null) {
                            if (((vu0) es0Var.i).z()) {
                                try {
                                    xu0 xu0Var = (xu0) es0Var.k;
                                    Parcel parcelU = xu0Var.U();
                                    kt0.c(parcelU, wu0Var);
                                    Parcel parcelY = xu0Var.Y(parcelU, 3);
                                    long j2 = parcelY.readLong();
                                    parcelY.recycle();
                                    j = j2;
                                } catch (RemoteException e) {
                                    jn.P("Unable to call into cache service.", e);
                                }
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return Long.valueOf(j);
            case 5:
                CookieManager cookieManager = (CookieManager) this.b;
                return cookieManager == null ? "" : cookieManager.getCookie((String) tu0.e.c.a(lx0.W0));
            case 6:
                return ((uv1) this.b).getWritableDatabase();
            case 7:
                return ((bw1) this.b).getWritableDatabase();
            case 8:
                a02 a02Var = (a02) this.b;
                ArrayList arrayList2 = new ArrayList();
                View view = (ViewGroup) a02Var.e;
                while (view != null) {
                    Object parent = view.getParent();
                    if (parent != null) {
                        int iIndexOfChild = parent instanceof ViewGroup ? ((ViewGroup) parent).indexOfChild(view) : -1;
                        Bundle bundle2 = new Bundle();
                        bundle2.putString("type", parent.getClass().getName());
                        bundle2.putInt("index_of_child", iIndexOfChild);
                        arrayList2.add(bundle2);
                        if (parent instanceof View) {
                            view = (View) parent;
                        }
                    }
                    return new b02((Context) a02Var.c, ((i52) a02Var.b).f, arrayList2, i2);
                }
                return new b02((Context) a02Var.c, ((i52) a02Var.b).f, arrayList2, i2);
            case 9:
                e02 e02Var = (e02) this.b;
                ix0 ix0Var = lx0.s7;
                tu0 tu0Var2 = tu0.e;
                if (((Boolean) tu0Var2.c.a(ix0Var)).booleanValue()) {
                    i52 i52Var = e02Var.b;
                    if (e02Var.c == 2) {
                        strEncodeToString = null;
                    } else if ((((Boolean) tu0Var2.c.a(lx0.u7)).booleanValue() ? Arrays.asList(((String) tu0Var2.c.a(lx0.v7)).split(",")) : Arrays.asList(((String) tu0Var2.c.a(lx0.t7)).split(","))).contains(jn.v(jn.z(i52Var.d)))) {
                        try {
                            cs2 cs2Var = cs2.b;
                            synchronized (cs2Var) {
                                HashMap map = cs2Var.a;
                                if (!map.containsKey("AES128_GCM")) {
                                    throw new GeneralSecurityException("Name AES128_GCM does not exist");
                                }
                                ho2VarX = (ho2) map.get("AES128_GCM");
                            }
                            if (ho2VarX == null) {
                                try {
                                    ho2VarX = yd.x(((gw2) ((us2) fs2.b.h(null)).h).b());
                                } catch (GeneralSecurityException e2) {
                                    throw new na("Parsing parameters failed in getProto(). You probably want to call some Tink register function for ".concat("null"), e2);
                                }
                            }
                            r52 r52VarR = r52.R(ho2VarX);
                            try {
                                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                try {
                                    r52VarR.E().c(byteArrayOutputStream);
                                    byteArrayOutputStream.close();
                                    byteArray = byteArrayOutputStream.toByteArray();
                                    strEncodeToString = Base64.encodeToString(byteArray, 11);
                                } catch (Throwable th2) {
                                    byteArrayOutputStream.close();
                                    throw th2;
                                }
                            } catch (IOException unused3) {
                                throw new GeneralSecurityException("Serialize keyset failed");
                            }
                        } catch (GeneralSecurityException e3) {
                            jn.p("Failed to generate key".concat(e3.toString()));
                            vc3.C.h.d("CryptoUtils.generateKey", e3);
                            byteArray = new byte[0];
                        }
                    } else {
                        strEncodeToString = null;
                    }
                } else {
                    strEncodeToString = null;
                }
                return new f02(strEncodeToString, i2);
            case 10:
                a02 a02Var2 = (a02) this.b;
                List<String> listAsList = Arrays.asList(((String) tu0.e.c.a(lx0.z1)).split(";"));
                Bundle bundle3 = new Bundle();
                for (String str5 : listAsList) {
                    try {
                        s52 s52VarA = ((rr1) a02Var2.c).a(str5, new JSONObject());
                        s52VarA.a();
                        boolean z7 = ((dt1) a02Var2.b).b;
                        Bundle bundle4 = new Bundle();
                        if (!((Boolean) tu0.e.c.a(lx0.tc)).booleanValue() || z7) {
                            try {
                                x51 x51VarA3 = s52VarA.a.a3();
                                if (x51VarA3 != null) {
                                    try {
                                        bundle4.putString("sdk_version", x51VarA3.toString());
                                    } catch (l52 unused4) {
                                    }
                                }
                            } catch (Throwable th3) {
                                throw new l52(th3);
                            }
                        }
                        try {
                            x51 x51VarG = s52VarA.a.G();
                            if (x51VarG != null) {
                                try {
                                    bundle4.putString("adapter_version", x51VarG.toString());
                                } catch (l52 unused5) {
                                }
                            }
                            bundle3.putBundle(str5, bundle4);
                        } catch (Throwable th4) {
                            throw new l52(th4);
                        }
                    } catch (l52 unused6) {
                    }
                }
                i02 i02Var = new i02(0, bundle3);
                if (((Boolean) tu0.e.c.a(lx0.tc)).booleanValue()) {
                    ((j02) a02Var2.e).b = i02Var;
                }
                return i02Var;
            case 11:
                ContentResolver contentResolver = (ContentResolver) this.b;
                return new l02(Settings.Secure.getString(contentResolver, "advertising_id"), Settings.Secure.getInt(contentResolver, "limit_ad_tracking", 0) == 1, i2);
            case 12:
                g02 g02Var = (g02) this.b;
                return new l02(((i52) g02Var.c).k, ((ua1) g02Var.d).l, 1);
            case 13:
                d60 d60Var = (d60) ((c02) this.b).c;
                ix0 ix0Var2 = lx0.Pa;
                kx0 kx0Var = tu0.e.c;
                if (!((Boolean) kx0Var.a(ix0Var2)).booleanValue()) {
                    return new s02(null, 0);
                }
                zb3 zb3Var = vc3.C.c;
                try {
                    int i4 = Build.VERSION.SDK_INT;
                    extensionVersion = (i4 < 30 || SdkExtensions.getExtensionVersion(30) <= 3) ? (!((Boolean) kx0Var.a(lx0.Sa)).booleanValue() || d60Var.h < ((Integer) kx0Var.a(lx0.Ra)).intValue() || i4 < 31 || SdkExtensions.getExtensionVersion(31) < 9) ? 0 : SdkExtensions.getExtensionVersion(31) : SdkExtensions.getExtensionVersion(1000000);
                } catch (Exception e4) {
                    vc3.C.h.d("AdUtil.getAdServicesExtensionVersion", e4);
                }
                return new s02(Integer.valueOf(extensionVersion), 0);
            case 14:
                AudioManager audioManager = (AudioManager) ((k02) this.b).c.getSystemService("audio");
                vc3 vc3Var = vc3.C;
                float fA = vc3Var.i.a();
                mb0 mb0Var = vc3Var.i;
                synchronized (mb0Var) {
                    z = mb0Var.a;
                }
                if (audioManager == null) {
                    return new u02(-1, false, false, -1, -1, -1, -1, -1, fA, z, true);
                }
                int mode = audioManager.getMode();
                boolean zIsMusicActive = audioManager.isMusicActive();
                boolean zIsSpeakerphoneOn = audioManager.isSpeakerphoneOn();
                int streamVolume = audioManager.getStreamVolume(3);
                if (((Boolean) tu0.e.c.a(lx0.Mb)).booleanValue()) {
                    int iK = vc3Var.f.k(audioManager);
                    streamMaxVolume = audioManager.getStreamMaxVolume(3);
                    i = iK;
                } else {
                    i = -1;
                    streamMaxVolume = -1;
                }
                return new u02(mode, zIsMusicActive, zIsSpeakerphoneOn, streamVolume, i, streamMaxVolume, audioManager.getRingerMode(), audioManager.getStreamVolume(2), fA, z, false);
            case 15:
                k02 k02Var = (k02) this.b;
                double intExtra3 = -1.0d;
                if (((Boolean) tu0.e.c.a(lx0.Nc)).booleanValue()) {
                    BatteryManager batteryManager = (BatteryManager) k02Var.c.getSystemService("batterymanager");
                    intExtra3 = batteryManager != null ? ((double) batteryManager.getIntProperty(4)) / 100.0d : -1.0d;
                    if (batteryManager != null) {
                        zIsCharging = batteryManager.isCharging();
                    } else {
                        Intent intentB = k02Var.b();
                        z2 = intentB != null && ((intExtra2 = intentB.getIntExtra("status", -1)) == 2 || intExtra2 == 5);
                    }
                    return new y02(intExtra3, zIsCharging);
                }
                Intent intentB2 = k02Var.b();
                z2 = intentB2 != null && ((intExtra = intentB2.getIntExtra("status", -1)) == 2 || intExtra == 5);
                if (intentB2 != null) {
                    intExtra3 = ((double) intentB2.getIntExtra("level", -1)) / ((double) intentB2.getIntExtra("scale", -1));
                }
                zIsCharging = z2;
                return new y02(intExtra3, zIsCharging);
            case 16:
                a02 a02Var3 = (a02) this.b;
                i52 i52Var2 = (i52) a02Var3.b;
                ur1 ur1Var = (ur1) a02Var3.c;
                String str6 = i52Var2.g;
                String str7 = (String) a02Var3.e;
                ur1Var.getClass();
                ix0 ix0Var3 = lx0.u4;
                kx0 kx0Var2 = tu0.e.c;
                if (!((Boolean) kx0Var2.a(ix0Var3)).booleanValue() || str6 == null || str7 == null) {
                    jSONObject = null;
                } else {
                    if (!ur1Var.d) {
                        ur1Var.a();
                        if (((Boolean) kx0Var2.a(lx0.v4)).booleanValue() && !ur1Var.f.getAndSet(true)) {
                            vc3.C.h.g().c.add(new tr1(ur1Var, 0));
                        }
                    }
                    Map map2 = (Map) ur1Var.a.get(str7);
                    if (map2 == null) {
                        jSONObject = null;
                    } else {
                        JSONObject jSONObject2 = (JSONObject) map2.get(str6);
                        if (jSONObject2 != null) {
                            jSONObject = jSONObject2;
                        } else {
                            String strS = hn.s(ur1Var.e, str6, str7);
                            if (strS != null) {
                                jSONObject = (JSONObject) map2.get(strS);
                            } else {
                                jSONObject = null;
                            }
                        }
                    }
                }
                return new e12(jSONObject, !((Boolean) kx0Var2.a(lx0.w4)).booleanValue() ? null : ur1Var.b);
            case 17:
                Context context3 = ((k02) this.b).c;
                zb3 zb3Var2 = vc3.C.c;
                ix0 ix0Var4 = lx0.v6;
                kx0 kx0Var3 = tu0.e.c;
                String string4 = !((Boolean) kx0Var3.a(ix0Var4)).booleanValue() ? "" : context3.getSharedPreferences("mobileads_consent", 0).getString("consent_string", "");
                String string5 = ((Boolean) kx0Var3.a(lx0.x6)).booleanValue() ? context3.getSharedPreferences("mobileads_consent", 0).getString("fc_consent", "") : "";
                if (((Boolean) kx0Var3.a(lx0.w6)).booleanValue()) {
                    SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context3);
                    bundle = new Bundle();
                    if (defaultSharedPreferences.contains("IABConsent_CMPPresent")) {
                        bundle.putBoolean("IABConsent_CMPPresent", defaultSharedPreferences.getBoolean("IABConsent_CMPPresent", false));
                    }
                    String[] strArr2 = {"IABConsent_SubjectToGDPR", "IABConsent_ConsentString", "IABConsent_ParsedPurposeConsents", "IABConsent_ParsedVendorConsents"};
                    while (i2 < 4) {
                        String str8 = strArr2[i2];
                        if (defaultSharedPreferences.contains(str8)) {
                            bundle.putString(str8, defaultSharedPreferences.getString(str8, null));
                        }
                        i2++;
                    }
                } else {
                    bundle = null;
                }
                return new j12(string4, string5, bundle);
            case 18:
                k02 k02Var2 = (k02) this.b;
                zb3 zb3Var3 = vc3.C.c;
                Object systemService = k02Var2.c.getSystemService("display");
                return new s02(systemService instanceof DisplayManager ? Integer.valueOf(((DisplayManager) systemService).getDisplays().length) : null, 1);
            case 19:
                return new m12("requester_type_2".equals(jn.z(((i52) ((c02) this.b).c).d)));
            case 20:
                a02 a02Var4 = (a02) this.b;
                Set set = (Set) a02Var4.b;
                ViewGroup viewGroup = (ViewGroup) a02Var4.e;
                ix0 ix0Var5 = lx0.n6;
                tu0 tu0Var3 = tu0.e;
                if (((Boolean) tu0Var3.c.a(ix0Var5)).booleanValue() && viewGroup != null && set.contains("banner")) {
                    return new n12(Boolean.valueOf(viewGroup.isHardwareAccelerated()), 0);
                }
                if (((Boolean) tu0Var3.c.a(lx0.o6)).booleanValue() && set.contains("native")) {
                    Context context4 = (Context) a02Var4.c;
                    if (context4 instanceof Activity) {
                        Activity activity = (Activity) context4;
                        Window window = activity.getWindow();
                        if (window == null || (window.getAttributes().flags & 16777216) == 0) {
                            try {
                                boolValueOf = Boolean.valueOf((activity.getPackageManager().getActivityInfo(activity.getComponentName(), 0).flags & 512) != 0);
                            } catch (PackageManager.NameNotFoundException unused7) {
                                boolValueOf = null;
                            }
                            break;
                        } else {
                            boolValueOf = Boolean.TRUE;
                        }
                        return new n12(boolValueOf, 0);
                    }
                }
                return new n12(null, 0);
            case zw0.zzm /* 21 */:
                qt1 qt1Var = (qt1) ((c02) this.b).c;
                synchronized (qt1Var) {
                    ix0 ix0Var6 = lx0.I9;
                    tu0Var = tu0.e;
                    if (((Boolean) tu0Var.c.a(ix0Var6)).booleanValue() && qt1Var.f()) {
                        long j3 = qt1Var.q;
                        vc3.C.k.getClass();
                        if (j3 < System.currentTimeMillis() / 1000) {
                            qt1Var.o = "{}";
                            qt1Var.q = Long.MAX_VALUE;
                            str = "";
                        } else if (qt1Var.o.equals("{}")) {
                            str = "";
                        } else {
                            str = qt1Var.o;
                        }
                    } else {
                        str = "";
                    }
                }
                synchronized (qt1Var) {
                    z3 = qt1Var.s;
                }
                return new p12(str, z3, vc3.C.o.g(), qt1Var.p != null, qt1Var.w < ((Long) tu0Var.c.a(lx0.da)).longValue());
            case 22:
                a02 a02Var5 = (a02) this.b;
                return new r12((i52) a02Var5.b, (PackageInfo) a02Var5.c, (h73) a02Var5.e);
            case 23:
                return a();
            case 24:
                return b();
            case 25:
                return c();
            case 26:
                a02 a02Var6 = (a02) this.b;
                Context context5 = (Context) a02Var6.c;
                boolean zE = q90.a(context5).e();
                zb3 zb3Var4 = vc3.C.c;
                boolean zF = zb3.f(context5);
                String str9 = ((d60) a02Var6.b).f;
                int iMyUid = Process.myUid();
                boolean z8 = iMyUid == 0 || iMyUid == 1000;
                ApplicationInfo applicationInfo = context5.getApplicationInfo();
                return new g22(zE, zF, str9, z8, applicationInfo == null ? 0 : applicationInfo.targetSdkVersion, fg.d(context5, false), fg.a(context5), (String) a02Var6.e);
            case 27:
                return new w12(w40.h0(((k02) this.b).c, (String) tu0.e.c.a(lx0.y6)), 1);
            case 28:
                return d();
            default:
                g02 g02Var2 = (g02) this.b;
                Context context6 = (Context) g02Var2.c;
                PackageManager packageManager = context6.getPackageManager();
                Locale locale = Locale.getDefault();
                ResolveInfo resolveInfoResolveActivity = packageManager.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse("geo:0,0?q=donuts")), 65536);
                ResolveInfo resolveInfoResolveActivity2 = packageManager.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://www.google.com")), 65536);
                String country = locale.getCountry();
                zb3 zb3Var5 = vc3.C.c;
                f32 f32Var = ut0.f.a;
                boolean zO = f32.o();
                boolean zH = jn.h(context6);
                boolean zS = jn.s(context6);
                String language = locale.getLanguage();
                ArrayList arrayList3 = new ArrayList();
                LocaleList localeList = LocaleList.getDefault();
                for (int i5 = 0; i5 < localeList.size(); i5++) {
                    arrayList3.add(localeList.get(i5).getLanguage());
                }
                ResolveInfo resolveInfoResolveActivity3 = packageManager.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=com.google.android.gms.ads")), 65536);
                if (resolveInfoResolveActivity3 == null || (activityInfo = resolveInfoResolveActivity3.activityInfo) == null) {
                    string = null;
                } else {
                    try {
                        PackageInfo packageInfoD2 = q90.a(context6).d(activityInfo.packageName, 0);
                        if (packageInfoD2 != null) {
                            int i6 = packageInfoD2.versionCode;
                            String str10 = activityInfo.packageName;
                            StringBuilder sb = new StringBuilder(String.valueOf(i6).length() + 1 + String.valueOf(str10).length());
                            sb.append(i6);
                            sb.append(".");
                            sb.append(str10);
                            string = sb.toString();
                        } else {
                            string = null;
                        }
                    } catch (PackageManager.NameNotFoundException unused8) {
                    }
                }
                try {
                    PackageInfo packageInfoD3 = q90.a(context6).d("com.android.vending", 128);
                    if (packageInfoD3 != null) {
                        int i7 = packageInfoD3.versionCode;
                        String str11 = packageInfoD3.packageName;
                        StringBuilder sb2 = new StringBuilder(String.valueOf(i7).length() + 1 + String.valueOf(str11).length());
                        sb2.append(i7);
                        sb2.append(".");
                        sb2.append(str11);
                        string2 = sb2.toString();
                        z4 = true;
                    } else {
                        z4 = true;
                        string2 = null;
                    }
                } catch (Exception unused9) {
                    z4 = true;
                }
                String str12 = Build.FINGERPRINT;
                String language2 = Locale.getDefault().getLanguage();
                ix0 ix0Var7 = lx0.ge;
                tu0 tu0Var4 = tu0.e;
                if (((Boolean) tu0Var4.c.a(ix0Var7)).booleanValue()) {
                    mm1 mm1VarJ = zb3.J(context6);
                    String str13 = mm1VarJ.f;
                    str3 = mm1VarJ.g;
                    str2 = str13;
                } else {
                    if (((Boolean) tu0Var4.c.a(lx0.fe)).booleanValue()) {
                        language2 = zb3.J(context6).f;
                    }
                    str2 = language2;
                    str3 = null;
                }
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com"));
                ResolveInfo resolveInfoResolveActivity4 = packageManager.resolveActivity(intent, 0);
                List<ResolveInfo> listQueryIntentActivities = packageManager.queryIntentActivities(intent, 65536);
                if (listQueryIntentActivities == null || resolveInfoResolveActivity4 == null) {
                    zEquals = false;
                } else {
                    int i8 = 0;
                    while (true) {
                        if (i8 >= listQueryIntentActivities.size()) {
                            zEquals = false;
                        } else if (resolveInfoResolveActivity4.activityInfo.name.equals(listQueryIntentActivities.get(i8).activityInfo.name)) {
                            zEquals = resolveInfoResolveActivity4.activityInfo.packageName.equals(a23.r(context6));
                        } else {
                            i8++;
                        }
                    }
                }
                zb3 zb3Var6 = vc3.C.c;
                long availableBytes = new StatFs(Environment.getDataDirectory().getAbsolutePath()).getAvailableBytes() / 1024;
                ix0 ix0Var8 = lx0.fc;
                tu0 tu0Var5 = tu0.e;
                boolean z9 = (((Boolean) tu0Var5.c.a(ix0Var8)).booleanValue() && zb3.d(context6)) ? z4 : false;
                if (((Boolean) tu0Var5.c.a(lx0.jc)).booleanValue()) {
                    try {
                        Bundle bundle5 = q90.a(context6).c(context6.getPackageName(), 128).metaData;
                        if (bundle5 != null && bundle5.containsKey("com.google.unity.ads.UNITY_VERSION")) {
                            string3 = bundle5.getString("com.google.unity.ads.UNITY_VERSION");
                        } else {
                            str4 = null;
                        }
                        break;
                    } catch (PackageManager.NameNotFoundException unused10) {
                    }
                    if (resolveInfoResolveActivity2 != null) {
                        z5 = z4;
                    } else {
                        z5 = false;
                    }
                    if (resolveInfoResolveActivity != null) {
                        z6 = z4;
                    } else {
                        z6 = false;
                    }
                    zt1 zt1Var = (zt1) g02Var2.d;
                    String str14 = Build.MODEL;
                    return new q22(z6, z5, country, zO, zH, zS, language, arrayList3, string, string2, zEquals, availableBytes, z9, str4, Build.VERSION.SDK_INT, str2, str3, zt1Var.a());
                }
                string3 = "";
                str4 = string3;
                if (resolveInfoResolveActivity2 != null) {
                    z5 = z4;
                } else {
                    z5 = false;
                }
                if (resolveInfoResolveActivity != null) {
                    z6 = z4;
                } else {
                    z6 = false;
                }
                zt1 zt1Var2 = (zt1) g02Var2.d;
                String str15 = Build.MODEL;
                return new q22(z6, z5, country, zO, zH, zS, language, arrayList3, string, string2, zEquals, availableBytes, z9, str4, Build.VERSION.SDK_INT, str2, str3, zt1Var2.a());
        }
    }
}
