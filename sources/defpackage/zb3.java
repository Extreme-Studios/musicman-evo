package defpackage;

import android.R;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.AlertDialog;
import android.app.KeyguardManager;
import android.app.LocaleManager;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.PowerManager;
import android.os.Process;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebSettings;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class zb3 {
    public static final e32 l = new e32(Looper.getMainLooper(), 2);
    public String g;
    public volatile String h;
    public final AtomicReference a = new AtomicReference(null);
    public final AtomicReference b = new AtomicReference(null);
    public final AtomicReference c = new AtomicReference(new Bundle());
    public final AtomicBoolean d = new AtomicBoolean();
    public boolean e = true;
    public final Object f = new Object();
    public boolean i = false;
    public boolean j = false;
    public final ExecutorService k = Executors.newSingleThreadExecutor();

    public static final String A(Context context, String str) {
        Context contextCreatePackageContext;
        if (str == null) {
            return O();
        }
        String strO = null;
        try {
            if (ao2.r == null) {
                ao2.r = new ao2();
            }
            ao2 ao2Var = ao2.r;
            if (TextUtils.isEmpty(ao2Var.g)) {
                int i = fm.c;
                try {
                    contextCreatePackageContext = context.createPackageContext("com.google.android.gms", 3);
                } catch (PackageManager.NameNotFoundException unused) {
                    contextCreatePackageContext = null;
                }
                ao2Var.g = (String) na1.p(context, new hq0(contextCreatePackageContext, context));
            }
            strO = ao2Var.g;
        } catch (Exception unused2) {
        }
        if (TextUtils.isEmpty(strO)) {
            strO = WebSettings.getDefaultUserAgent(context);
        }
        if (TextUtils.isEmpty(strO)) {
            strO = O();
        }
        String strN = ec.n(new StringBuilder(String.valueOf(strO).length() + 10 + str.length()), strO, " (Mobile; ", str);
        try {
            if (q90.a(context).e()) {
                StringBuilder sb = new StringBuilder(strN.length() + 4);
                sb.append(strN);
                sb.append(";aia");
                strN = sb.toString();
            }
        } catch (Exception e) {
            vc3.C.h.d("AdUtil.getUserAgent", e);
        }
        return strN.concat(")");
    }

    public static ArrayList H() {
        ix0 ix0Var = lx0.a;
        ArrayList arrayListQ = tu0.e.a.Q();
        ArrayList arrayList = new ArrayList();
        int size = arrayListQ.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayListQ.get(i);
            i++;
            String str = (String) obj;
            bz1 bz1VarC = bz1.c(new vh2(','));
            str.getClass();
            Iterator itF = ((hi2) bz1VarC.f).f(bz1VarC, str);
            while (true) {
                gi2 gi2Var = (gi2) itF;
                if (gi2Var.hasNext()) {
                    try {
                        arrayList.add(Long.valueOf((String) gi2Var.next()));
                    } catch (NumberFormatException unused) {
                        jn.p("Experiment ID is not a number");
                    }
                }
            }
        }
        return arrayList;
    }

    public static String I(String str, String str2) {
        char[] charArray = str.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            charArray[i] = (char) (charArray[i] ^ str2.charAt(i % str2.length()));
        }
        return new String(charArray);
    }

    public static mm1 J(Context context) {
        mm1 mm1Var = new mm1(Locale.getDefault().getLanguage(), Locale.getDefault().getCountry());
        if (Build.VERSION.SDK_INT < 33) {
            Locale locale = context.getResources().getConfiguration().getLocales().get(0);
            return new mm1(locale.getLanguage(), locale.getCountry());
        }
        LocaleManager localeManagerB = n0.b(context.getSystemService(n0.i()));
        if (localeManagerB == null || localeManagerB.getSystemLocales().isEmpty()) {
            return mm1Var;
        }
        Locale locale2 = localeManagerB.getSystemLocales().get(0);
        return new mm1(locale2.getLanguage(), locale2.getCountry());
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0007  */
    public static final boolean L(View view) {
        Activity activity;
        View rootView = view.getRootView();
        if (rootView == null) {
            activity = null;
        } else {
            Context context = rootView.getContext();
            if (context instanceof Activity) {
                activity = (Activity) context;
            } else {
                activity = null;
            }
        }
        if (activity == null) {
            return false;
        }
        Window window = activity.getWindow();
        WindowManager.LayoutParams attributes = window != null ? window.getAttributes() : null;
        return (attributes == null || (attributes.flags & 524288) == 0) ? false : true;
    }

    public static final void M(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        Bundle extras = intent.getExtras() != null ? intent.getExtras() : new Bundle();
        extras.putBinder("android.support.customtabs.extra.SESSION", null);
        extras.putString("com.android.browser.application_id", context.getPackageName());
        intent.putExtras(extras);
    }

    public static final String N(Context context) {
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        return x(y(context));
    }

    public static final String O() {
        StringBuilder sb = new StringBuilder(256);
        sb.append("Mozilla/5.0 (Linux; U; Android");
        String str = Build.VERSION.RELEASE;
        if (str != null) {
            sb.append(" ");
            sb.append(str);
        }
        sb.append("; ");
        sb.append(Locale.getDefault());
        String str2 = Build.DEVICE;
        if (str2 != null) {
            sb.append("; ");
            sb.append(str2);
            String str3 = Build.DISPLAY;
            if (str3 != null) {
                sb.append(" Build/");
                sb.append(str3);
            }
        }
        sb.append(") AppleWebKit/533 Version/4.0 Safari/533");
        return sb.toString();
    }

    public static final String P() {
        String str = Build.MANUFACTURER;
        String str2 = Build.MODEL;
        return str2.startsWith(str) ? str2 : ec.n(new StringBuilder(String.valueOf(str).length() + 1 + str2.length()), str, " ", str2);
    }

    public static final HashMap Q(String str) {
        HashMap map = new HashMap();
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                HashSet hashSet = new HashSet();
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(next);
                if (jSONArrayOptJSONArray != null) {
                    for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                        String strOptString = jSONArrayOptJSONArray.optString(i);
                        if (strOptString != null) {
                            hashSet.add(strOptString);
                        }
                    }
                    map.put(next, hashSet);
                }
            }
            return map;
        } catch (JSONException e) {
            vc3.C.h.d("AdUtil.getMapOfFileNamesToKeysFromJsonString", e);
            return map;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v6, types: [android.view.ViewParent] */
    public static final long a(View view) {
        float fMin = Float.MAX_VALUE;
        do {
            if (!(view instanceof View)) {
                break;
            }
            View view2 = (View) view;
            fMin = Math.min(fMin, view2.getAlpha());
            view = view2.getParent();
        } while (fMin > 0.0f);
        return Math.round((fMin >= 0.0f ? fMin : 0.0f) * 100.0f);
    }

    public static final u21 b(Context context) {
        try {
            Object objNewInstance = context.getClassLoader().loadClass("com.google.android.gms.ads.internal.util.WorkManagerUtil").getDeclaredConstructor(null).newInstance(null);
            if (!(objNewInstance instanceof IBinder)) {
                jn.M("Instantiated WorkManagerUtil not instance of IBinder.");
                return null;
            }
            IBinder iBinder = (IBinder) objNewInstance;
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.util.IWorkManagerUtil");
            return iInterfaceQueryLocalInterface instanceof u21 ? (u21) iInterfaceQueryLocalInterface : new x11(iBinder, "com.google.android.gms.ads.internal.util.IWorkManagerUtil", 2);
        } catch (Exception e) {
            vc3.C.h.d("Failed to instantiate WorkManagerUtil", e);
            return null;
        }
    }

    public static final boolean c(Context context, String str) {
        int i = x30.b;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        return q90.a(context).f.getPackageManager().checkPermission(str, context.getPackageName()) == 0;
    }

    public static final boolean d(Context context) {
        try {
            if (jn.t == null) {
                jn.t = Boolean.valueOf(ej1.m() && context.getPackageManager().hasSystemFeature("com.google.android.play.feature.HPE_EXPERIENCE"));
            }
            return jn.t.booleanValue();
        } catch (NoSuchMethodError unused) {
            return false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0054  */
    /* JADX WARN: Code duplicated, block: B:21:0x005c  */
    /* JADX WARN: Code duplicated, block: B:23:0x0064 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:25:0x0066 A[LOOP:1: B:20:0x005a->B:25:0x0066, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:30:0x0064 A[SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:19:0x0054, please report this as an issue */
    public static final boolean e(String str) {
        String str2;
        int i;
        if (o83.c()) {
            ix0 ix0Var = lx0.C5;
            tu0 tu0Var = tu0.e;
            if (((Boolean) tu0Var.c.a(ix0Var)).booleanValue()) {
                String str3 = (String) tu0Var.c.a(lx0.E5);
                if (str3.isEmpty()) {
                    str2 = (String) tu0.e.c.a(lx0.D5);
                    if (str2.isEmpty()) {
                        return true;
                    }
                    for (String str4 : str2.split(";")) {
                        if (str4.equals(str)) {
                            return true;
                        }
                    }
                } else {
                    for (String str5 : str3.split(";")) {
                        if (!str5.equals(str)) {
                        }
                    }
                    str2 = (String) tu0.e.c.a(lx0.D5);
                    if (str2.isEmpty()) {
                        return true;
                    }
                    while (i < r2) {
                        if (str4.equals(str)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public static final boolean f(Context context) {
        try {
            context.getClassLoader().loadClass("com.google.android.gms.ads.internal.ClientApi");
            return false;
        } catch (ClassNotFoundException unused) {
            return true;
        } catch (Throwable th) {
            jn.P("Error loading class.", th);
            vc3.C.h.d("AdUtil.isLiteSdk", th);
            return false;
        }
    }

    public static final boolean g(Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        PowerManager powerManager;
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            KeyguardManager keyguardManager = (KeyguardManager) context.getSystemService("keyguard");
            if (activityManager == null || keyguardManager == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null) {
                return false;
            }
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (Process.myPid() == runningAppProcessInfo.pid) {
                    return runningAppProcessInfo.importance != 100 || keyguardManager.inKeyguardRestrictedInputMode() || (powerManager = (PowerManager) context.getSystemService("power")) == null || !powerManager.isScreenOn();
                }
            }
            return true;
        } catch (Throwable unused) {
        }
        return false;
    }

    public static final boolean h(Context context) {
        try {
            Bundle bundleY = y(context);
            return TextUtils.isEmpty(x(bundleY)) && !TextUtils.isEmpty(bundleY.getString("com.google.android.gms.ads.INTEGRATION_MANAGER"));
        } catch (RemoteException unused) {
        }
    }

    public static final boolean i(Context context) {
        Window window;
        if ((context instanceof Activity) && (window = ((Activity) context).getWindow()) != null && window.getDecorView() != null) {
            Rect rect = new Rect();
            Rect rect2 = new Rect();
            window.getDecorView().getGlobalVisibleRect(rect, null);
            window.getDecorView().getWindowVisibleDisplayFrame(rect2);
            if (rect.bottom != 0 && rect2.bottom != 0 && rect.top == rect2.top) {
                return true;
            }
        }
        return false;
    }

    public static final void j(View view, int i) {
        String str;
        int i2;
        int iHeight;
        int iWidth;
        String str2;
        String strA;
        x42 x42VarE;
        z42 z42VarD0;
        View childAt = view;
        int[] iArr = new int[2];
        Rect rect = new Rect();
        try {
            String packageName = childAt.getContext().getPackageName();
            if (childAt instanceof lr1) {
                childAt = ((lr1) childAt).getChildAt(0);
            }
            if (childAt instanceof gt) {
                str = "NATIVE";
                i2 = 1;
            } else {
                str = "UNKNOWN";
                i2 = 0;
            }
            if (childAt.getLocalVisibleRect(rect)) {
                iWidth = rect.width();
                iHeight = rect.height();
            } else {
                iHeight = 0;
                iWidth = 0;
            }
            zb3 zb3Var = vc3.C.c;
            long jA = a(childAt);
            childAt.getLocationOnScreen(iArr);
            int i3 = iArr[0];
            int i4 = iArr[1];
            String str3 = "none";
            if (!(childAt instanceof md1) || (z42VarD0 = ((md1) childAt).D0()) == null) {
                str2 = "none";
            } else {
                str2 = z42VarD0.b;
                int iHashCode = childAt.hashCode();
                StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 1 + String.valueOf(iHashCode).length());
                sb.append(str2);
                sb.append(":");
                sb.append(iHashCode);
                childAt.setContentDescription(sb.toString());
            }
            if (!(childAt instanceof md1) || (x42VarE = ((md1) childAt).E()) == null) {
                strA = str;
            } else {
                strA = x42.a(x42VarE.b);
                i2 = x42VarE.e;
                str3 = x42VarE.E;
            }
            Locale locale = Locale.US;
            jn.R("<Ad hashCode=" + childAt.hashCode() + ", package=" + packageName + ", adNetCls=" + str3 + ", gwsQueryId=" + str2 + ", format=" + strA + ", impType=" + i2 + ", class=" + childAt.getClass().getName() + ", x=" + i3 + ", y=" + i4 + ", width=" + childAt.getWidth() + ", height=" + childAt.getHeight() + ", vWidth=" + iWidth + ", vHeight=" + iHeight + ", alpha=" + jA + ", state=" + Integer.toString(i, 2) + ">");
        } catch (Exception e) {
            jn.P("Failure getting view location.", e);
        }
    }

    public static final AlertDialog.Builder k(Context context) {
        r53 r53Var = vc3.C.f;
        return new AlertDialog.Builder(context, R.style.Theme.Material.Dialog.Alert);
    }

    public static final void l(Context context, x42 x42Var, es1 es1Var) {
        us2 us2VarA = es1Var.a();
        us2VarA.s("action", "can_show");
        vc3 vc3Var = vc3.C;
        zb3 zb3Var = vc3Var.c;
        us2VarA.s("foreground", true != g(context) ? "1" : "0");
        us2VarA.s("fg_al", true == vc3Var.g.k() ? "1" : "0");
        if (x42Var != null) {
            List list = x42Var.t;
            if (!list.isEmpty()) {
                us2VarA.s("ancn", (String) list.get(0));
            }
            us2VarA.s("ad_format", x42.a(x42Var.b));
        }
        us2VarA.t();
    }

    public static final boolean m(x42 x42Var) {
        return ((Boolean) tu0.e.c.a(lx0.he)).booleanValue() && x42Var != null && x42Var.e == 4;
    }

    public static final int n(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e) {
            jn.T("Could not parse value:".concat(e.toString()));
            return 0;
        }
    }

    public static final HashMap o(Uri uri) {
        String encodedQuery;
        if (uri == null) {
            return null;
        }
        if (!((Boolean) tu0.e.c.a(lx0.s)).booleanValue()) {
            HashMap map = new HashMap();
            for (String str : uri.getQueryParameterNames()) {
                if (!TextUtils.isEmpty(str)) {
                    map.put(str, uri.getQueryParameter(str));
                }
            }
            return map;
        }
        HashMap map2 = new HashMap();
        if (!uri.isOpaque() && (encodedQuery = uri.getEncodedQuery()) != null) {
            int i = 0;
            while (true) {
                int iIndexOf = encodedQuery.indexOf(38, i);
                int length = encodedQuery.length();
                if (iIndexOf != -1) {
                    length = iIndexOf;
                }
                int iIndexOf2 = encodedQuery.indexOf(61, i);
                if (iIndexOf2 > length || iIndexOf2 == -1) {
                    iIndexOf2 = length;
                }
                map2.put(Uri.decode(encodedQuery.substring(i, iIndexOf2)), iIndexOf2 == length ? "" : Uri.decode(encodedQuery.substring(iIndexOf2 + 1, length)));
                if (iIndexOf == -1) {
                    break;
                }
                i = iIndexOf + 1;
            }
        }
        return map2;
    }

    public static final int[] p(Activity activity) {
        View viewFindViewById;
        Window window = activity.getWindow();
        return (window == null || (viewFindViewById = window.findViewById(R.id.content)) == null) ? new int[]{0, 0} : new int[]{viewFindViewById.getWidth(), viewFindViewById.getHeight()};
    }

    public static final int[] q(Activity activity) {
        View viewFindViewById;
        Window window = activity.getWindow();
        int[] iArr = (window == null || (viewFindViewById = window.findViewById(R.id.content)) == null) ? new int[]{0, 0} : new int[]{viewFindViewById.getTop(), viewFindViewById.getBottom()};
        ut0 ut0Var = ut0.f;
        return new int[]{ut0Var.a.i(activity, iArr[0]), ut0Var.a.i(activity, iArr[1])};
    }

    public static final boolean r(View view, PowerManager powerManager, KeyguardManager keyguardManager) {
        boolean z = vc3.C.c.e || keyguardManager == null || !keyguardManager.inKeyguardRestrictedInputMode() || L(view);
        long jA = a(view);
        if (view.getVisibility() == 0 && view.isShown() && ((powerManager == null || powerManager.isScreenOn()) && z)) {
            ix0 ix0Var = lx0.u1;
            tu0 tu0Var = tu0.e;
            kx0 kx0Var = tu0Var.c;
            kx0 kx0Var2 = tu0Var.c;
            if ((!((Boolean) kx0Var.a(ix0Var)).booleanValue() || view.getLocalVisibleRect(new Rect()) || view.getGlobalVisibleRect(new Rect())) && (!((Boolean) kx0Var2.a(lx0.rb)).booleanValue() || jA >= ((Integer) kx0Var2.a(lx0.tb)).intValue())) {
                return true;
            }
        }
        return false;
    }

    public static final void s(Context context, Intent intent) {
        if (!((Boolean) tu0.e.c.a(lx0.Ob)).booleanValue()) {
            try {
                context.startActivity(intent);
                return;
            } catch (Throwable unused) {
                intent.addFlags(268435456);
                context.startActivity(intent);
                return;
            }
        }
        try {
            try {
                context.startActivity(intent);
            } catch (Throwable unused2) {
                intent.addFlags(268435456);
                context.startActivity(intent);
            }
        } catch (SecurityException e) {
            jn.V("", e);
            vc3.C.h.d("AdUtil.startActivityWithUnknownContext", e);
        }
    }

    public static int t(int i) {
        if (i >= 5000) {
            return i;
        }
        if (i <= 0) {
            return 60000;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 86);
        sb.append("HTTP timeout too low: ");
        sb.append(i);
        sb.append(" milliseconds. Reverting to default timeout: 60000 milliseconds.");
        jn.T(sb.toString());
        return 60000;
    }

    public static final void u(Context context, Uri uri) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW", uri);
            Bundle bundle = new Bundle();
            intent.putExtras(bundle);
            M(context, intent);
            bundle.putString("com.android.browser.application_id", context.getPackageName());
            context.startActivity(intent);
            String string = uri.toString();
            StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 26);
            sb.append("Opening ");
            sb.append(string);
            sb.append(" in a new browser.");
            jn.F(sb.toString());
        } catch (ActivityNotFoundException e) {
            jn.P("No browser is found.", e);
        }
    }

    public static final void v(Context context, Intent intent, es1 es1Var, String str) {
        ix0 ix0Var = lx0.Td;
        tu0 tu0Var = tu0.e;
        kx0 kx0Var = tu0Var.c;
        kx0 kx0Var2 = tu0Var.c;
        if (!((Boolean) kx0Var.a(ix0Var)).booleanValue() || !(context instanceof oe1)) {
            s(context, intent);
            return;
        }
        try {
            Uri data = intent.getData();
            if (data == null || data.toString() == null || !data.toString().matches((String) kx0Var2.a(lx0.Vd))) {
                s(context, intent);
                return;
            }
            ((oe1) context).a(intent);
            if (!((Boolean) kx0Var2.a(lx0.Ud)).booleanValue() || es1Var == null) {
                return;
            }
            us2 us2VarA = es1Var.a();
            us2VarA.s("action", "hila");
            if (str == null) {
                str = "";
            }
            us2VarA.s("gqi", str);
            us2VarA.y();
        } catch (ActivityNotFoundException e) {
            e = e;
            jn.P("Error occurred while starting activity for result", e);
            vc3.C.h.d("AdUtil.startActivityForResult", e);
            s(context, intent);
        } catch (SecurityException e2) {
            e = e2;
            jn.P("Error occurred while starting activity for result", e);
            vc3.C.h.d("AdUtil.startActivityForResult", e);
            s(context, intent);
        } catch (Exception e3) {
            jn.P("Error occurred while starting activity for result", e3);
            vc3.C.h.d("AdUtil.startActivityForResult", e3);
            s(context, intent);
        }
    }

    public static boolean w(String str, AtomicReference atomicReference, String str2) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            Pattern patternCompile = (Pattern) atomicReference.get();
            if (patternCompile == null || !str2.equals(patternCompile.pattern())) {
                patternCompile = Pattern.compile(str2);
                atomicReference.set(patternCompile);
            }
            return patternCompile.matcher(str).matches();
        } catch (PatternSyntaxException unused) {
            return false;
        }
    }

    public static String x(Bundle bundle) {
        if (bundle == null) {
            return "";
        }
        String string = bundle.getString("com.google.android.gms.ads.APPLICATION_ID");
        if (TextUtils.isEmpty(string)) {
            return "";
        }
        return (string.matches("^ca-app-pub-[0-9]{16}~[0-9]{10}$") || string.matches("^/\\d+~.+$")) ? string : "";
    }

    public static Bundle y(Context context) {
        try {
            return q90.a(context).c(context.getPackageName(), 128).metaData;
        } catch (PackageManager.NameNotFoundException | NullPointerException e) {
            jn.w("Error getting metadata", e);
            return null;
        }
    }

    public static final void z(md mdVar, Bundle bundle) {
        Intent intent = (Intent) mdVar.g;
        if (bundle.isEmpty()) {
            return;
        }
        int i = bundle.getInt("h", -1);
        if (i >= 0) {
            if (i <= 0) {
                j7.p("Invalid value for the initialHeightPx argument");
                return;
            } else {
                intent.putExtra("androidx.browser.customtabs.extra.INITIAL_ACTIVITY_HEIGHT_PX", i);
                intent.putExtra("androidx.browser.customtabs.extra.ACTIVITY_HEIGHT_RESIZE_BEHAVIOR", 0);
            }
        }
        int i2 = bundle.getInt("cbp", -1);
        if (i2 < 0 || i2 > 2) {
            return;
        }
        if (i2 < 0 || i2 > 2) {
            j7.p("Invalid value for the position argument");
        } else {
            intent.putExtra("androidx.browser.customtabs.extra.CLOSE_BUTTON_POSITION", i2);
        }
    }

    public final void B(Context context, String str, HttpURLConnection httpURLConnection, int i) {
        int iT = t(i);
        StringBuilder sb = new StringBuilder(String.valueOf(iT).length() + 28);
        sb.append("HTTP timeout: ");
        sb.append(iT);
        sb.append(" milliseconds.");
        jn.R(sb.toString());
        httpURLConnection.setConnectTimeout(iT);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setReadTimeout(iT);
        if (TextUtils.isEmpty(httpURLConnection.getRequestProperty("User-Agent"))) {
            httpURLConnection.setRequestProperty("User-Agent", E(context, str));
        }
        httpURLConnection.setUseCaches(false);
    }

    public final void C(Context context) {
        if (this.i) {
            return;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        lx0.a(context);
        if (!((Boolean) tu0.e.c.a(lx0.Nb)).booleanValue() || Build.VERSION.SDK_INT < 33) {
            context.getApplicationContext().registerReceiver(new y4(9, this), intentFilter);
        } else {
            context.getApplicationContext().registerReceiver(new y4(9, this), intentFilter, 4);
        }
        this.i = true;
    }

    public final void D(Context context) {
        if (this.j) {
            return;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.google.android.ads.intent.DEBUG_LOGGING_ENABLEMENT_CHANGED");
        lx0.a(context);
        if (!((Boolean) tu0.e.c.a(lx0.Nb)).booleanValue() || Build.VERSION.SDK_INT < 33) {
            context.getApplicationContext().registerReceiver(new w92(1), intentFilter);
        } else {
            context.getApplicationContext().registerReceiver(new w92(1), intentFilter, 4);
        }
        this.j = true;
    }

    public final String E(Context context, String str) {
        if (((Boolean) tu0.e.c.a(lx0.ac)).booleanValue()) {
            if (this.h != null) {
                return this.h;
            }
            this.h = A(context, str);
            return this.h;
        }
        synchronized (this.f) {
            try {
                String str2 = this.g;
                if (str2 != null) {
                    return str2;
                }
                String strA = A(context, str);
                this.g = strA;
                return strA;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean F(String str) {
        return w(str, this.a, (String) tu0.e.c.a(lx0.o0));
    }

    public final boolean G(String str) {
        return w(str, this.b, (String) tu0.e.c.a(lx0.p0));
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0072, code lost:
    
        if (defpackage.f32.o() != false) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int K(android.content.Context r12, android.net.Uri r13, android.os.Bundle r14) {
        /*
            Method dump skipped, instruction units count: 233
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zb3.K(android.content.Context, android.net.Uri, android.os.Bundle):int");
    }
}
