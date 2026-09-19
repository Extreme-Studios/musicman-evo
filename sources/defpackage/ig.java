package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.WebView;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.List;
import org.chromium.support_lib_boundary.ProfileStoreBoundaryInterface;
import org.chromium.support_lib_boundary.StaticsBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;

/* JADX INFO: loaded from: classes.dex */
public class ig implements hc, a80, ie0, aw, hz, bd0, gd0 {
    public static final /* synthetic */ ig g = new ig(1);
    public static final String[] h = new String[0];
    public static final ig i = new ig(3);
    public static final ig j = new ig(4);
    public static final ig k = new ig(5);
    public static final ig l = new ig(6);
    public static final ig m = new ig(8);
    public static final /* synthetic */ ig n = new ig(28);
    public final /* synthetic */ int f;

    public ig() {
        this.f = 25;
        List list = Collections.EMPTY_LIST;
    }

    public static final boolean d(Context context, Intent intent, md0 md0Var, lb0 lb0Var, boolean z, es1 es1Var, String str, Bundle bundle) {
        int iK;
        if (z) {
            try {
                iK = vc3.C.c.K(context, intent.getData(), bundle);
                if (md0Var != null) {
                    md0Var.i();
                }
            } catch (ActivityNotFoundException e) {
                jn.T(e.getMessage());
                iK = 6;
            }
            if (lb0Var != null) {
                lb0Var.d(iK);
            }
            return iK == 5;
        }
        try {
            String uri = intent.toURI();
            StringBuilder sb = new StringBuilder(String.valueOf(uri).length() + 21);
            sb.append("Launching an intent: ");
            sb.append(uri);
            jn.p(sb.toString());
            if (((Boolean) tu0.e.c.a(lx0.Td)).booleanValue()) {
                zb3 zb3Var = vc3.C.c;
                zb3.v(context, intent, es1Var, str);
            } else {
                zb3 zb3Var2 = vc3.C.c;
                zb3.s(context, intent);
            }
            if (md0Var != null) {
                md0Var.i();
            }
            if (lb0Var != null) {
                lb0Var.T(true);
            }
            return true;
        } catch (ActivityNotFoundException e2) {
            jn.T(e2.getMessage());
            if (lb0Var != null) {
                lb0Var.T(false);
            }
            return false;
        }
    }

    public static final boolean h(Context context, r91 r91Var, md0 md0Var, lb0 lb0Var, es1 es1Var, String str) {
        int i2 = 0;
        if (r91Var == null) {
            jn.T("No intent data for launcher overlay.");
            return false;
        }
        lx0.a(context);
        Intent intent = r91Var.m;
        if (intent != null) {
            return d(context, intent, md0Var, lb0Var, r91Var.o, es1Var, str, r91Var.p);
        }
        Intent intent2 = new Intent();
        String str2 = r91Var.g;
        if (TextUtils.isEmpty(str2)) {
            jn.T("Open GMSG did not contain a URL.");
            return false;
        }
        String str3 = r91Var.h;
        if (TextUtils.isEmpty(str3)) {
            intent2.setData(Uri.parse(str2));
        } else {
            intent2.setDataAndType(Uri.parse(str2), str3);
        }
        intent2.setAction("android.intent.action.VIEW");
        String str4 = r91Var.i;
        if (!TextUtils.isEmpty(str4)) {
            intent2.setPackage(str4);
        }
        String str5 = r91Var.j;
        if (!TextUtils.isEmpty(str5)) {
            String[] strArrSplit = str5.split("/", 2);
            if (strArrSplit.length < 2) {
                jn.T("Could not parse component name from open GMSG: ".concat(str5));
                return false;
            }
            intent2.setClassName(strArrSplit[0], strArrSplit[1]);
        }
        String str6 = r91Var.k;
        if (!TextUtils.isEmpty(str6)) {
            try {
                i2 = Integer.parseInt(str6);
            } catch (NumberFormatException unused) {
                jn.T("Could not parse intent flags.");
            }
            intent2.addFlags(i2);
        }
        ix0 ix0Var = lx0.W4;
        tu0 tu0Var = tu0.e;
        if (((Boolean) tu0Var.c.a(ix0Var)).booleanValue()) {
            intent2.addFlags(268435456);
            intent2.putExtra("android.support.customtabs.extra.user_opt_out", true);
        } else {
            if (((Boolean) tu0Var.c.a(lx0.V4)).booleanValue()) {
                zb3 zb3Var = vc3.C.c;
                zb3.M(context, intent2);
            }
        }
        return d(context, intent2, md0Var, lb0Var, r91Var.o, es1Var, str, r91Var.p);
    }

    public static /* bridge */ p33 j(Object obj) {
        d23 d23Var = (d23) obj;
        p33 p33Var = d23Var.zzt;
        if (p33Var != p33.f) {
            return p33Var;
        }
        p33 p33VarA = p33.a();
        d23Var.zzt = p33VarA;
        return p33VarA;
    }

    public static boolean k(int i2, n9 n9Var, Object obj) throws o23 {
        r13 r13Var = (r13) n9Var.d;
        int i3 = n9Var.a;
        int i4 = i3 >>> 3;
        int i5 = i3 & 7;
        if (i5 == 0) {
            n9Var.r(0);
            ((p33) obj).d(i4 << 3, Long.valueOf(r13Var.n()));
            return true;
        }
        if (i5 == 1) {
            n9Var.r(1);
            ((p33) obj).d((i4 << 3) | 1, Long.valueOf(r13Var.p()));
            return true;
        }
        if (i5 == 2) {
            ((p33) obj).d((i4 << 3) | 2, n9Var.z());
            return true;
        }
        if (i5 != 3) {
            if (i5 == 4) {
                if (i2 != 0) {
                    return false;
                }
                j7.s("Protocol message end-group tag did not match expected tag.");
                return false;
            }
            if (i5 != 5) {
                j7.q();
                return false;
            }
            n9Var.r(5);
            ((p33) obj).d(5 | (i4 << 3), Integer.valueOf(r13Var.q()));
            return true;
        }
        p33 p33VarA = p33.a();
        int i6 = i4 << 3;
        int i7 = i2 + 1;
        if (i7 >= 100) {
            j7.s("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
            return false;
        }
        while (n9Var.y() != Integer.MAX_VALUE && k(i7, n9Var, p33VarA)) {
        }
        if ((i6 | 4) != n9Var.a) {
            j7.s("Protocol message end-group tag did not match expected tag.");
            return false;
        }
        if (p33VarA.e) {
            p33VarA.e = false;
        }
        ((p33) obj).d(i6 | 3, p33VarA);
        return true;
    }

    @Override // defpackage.gd0
    public /* synthetic */ Constructor a() throws IllegalAccessException, InvocationTargetException {
        int[] iArr = hd0.h;
        if (Boolean.TRUE.equals(Class.forName("androidx.media3.decoder.flac.FlacLibrary").getMethod("isAvailable", null).invoke(null, null))) {
            return Class.forName("androidx.media3.decoder.flac.FlacExtractor").asSubclass(nd0.class).getConstructor(Integer.TYPE);
        }
        return null;
    }

    public Signature[] b(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }

    public boolean c(CharSequence charSequence) {
        return charSequence instanceof uv;
    }

    @Override // defpackage.a80
    public WebViewProviderBoundaryInterface createWebView(WebView webView) {
        throw new UnsupportedOperationException("This should never happen, if this method was called it means we're trying to reach into WebView APK code on an incompatible device. This most likely means the current method is being called too early, or is being called on start-up rather than lazily");
    }

    public long e() {
        return SystemClock.elapsedRealtime();
    }

    @Override // defpackage.a80
    public String[] g() {
        return h;
    }

    @Override // defpackage.a80
    public ProfileStoreBoundaryInterface getProfileStore() {
        throw new UnsupportedOperationException("This should never happen, if this method was called it means we're trying to reach into WebView APK code on an incompatible device. This most likely means the current method is being called too early, or is being called on start-up rather than lazily");
    }

    @Override // defpackage.a80
    public StaticsBoundaryInterface getStatics() {
        throw new UnsupportedOperationException("This should never happen, if this method was called it means we're trying to reach into WebView APK code on an incompatible device. This most likely means the current method is being called too early, or is being called on start-up rather than lazily");
    }

    public wx1 i(Looper looper, Handler.Callback callback) {
        return new wx1(new Handler(looper, callback));
    }

    @Override // defpackage.aw
    public void l() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override // defpackage.aw
    public void n(int i2, Object obj) {
        String str;
        switch (i2) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case 2:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case 3:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case 4:
                str = "RESULT_NOT_WRITABLE";
                break;
            case 5:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case 6:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case 7:
                str = "RESULT_IO_EXCEPTION";
                break;
            case 8:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case 9:
            default:
                str = "";
                break;
            case 10:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case 11:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (i2 == 6 || i2 == 7 || i2 == 8) {
            Log.e("ProfileInstaller", str, (Throwable) obj);
        } else {
            Log.d("ProfileInstaller", str);
        }
    }

    public String toString() {
        switch (this.f) {
            case 4:
                return "NoDeclaredBrand";
            default:
                return super.toString();
        }
    }

    public /* synthetic */ ig(int i2) {
        this.f = i2;
    }

    @Override // defpackage.bd0
    public long f(long j2) {
        return j2;
    }

    @Override // defpackage.hz
    public void onScrollLimit(int i2, int i3, int i4, boolean z) {
    }

    @Override // defpackage.hz
    public void onScrollProgress(int i2, int i3, int i4, int i5) {
    }
}
