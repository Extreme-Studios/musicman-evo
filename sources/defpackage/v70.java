package defpackage;

import android.content.pm.PackageInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;

/* JADX INFO: loaded from: classes.dex */
public abstract class v70 {
    public static final /* synthetic */ int a = 0;

    static {
        Uri.parse("*");
        Uri.parse("");
    }

    public static PackageInfo a() {
        return (PackageInfo) Class.forName("android.webkit.WebViewFactory").getMethod("getLoadedPackageInfo", null).invoke(null, null);
    }

    public static oc2 b(WebView webView) {
        return new oc2(6, z70.a.createWebView(webView));
    }

    public static String c() {
        if (y70.f.b()) {
            return z70.a.getStatics().getVariationsHeader();
        }
        throw y70.a();
    }

    public static WebViewClient d(WebView webView) {
        x3 x3Var = y70.b;
        if (x3Var.a()) {
            return webView.getWebViewClient();
        }
        if (!x3Var.b()) {
            throw y70.a();
        }
        if (Build.VERSION.SDK_INT >= 28) {
            Looper webViewLooper = webView.getWebViewLooper();
            if (webViewLooper != Looper.myLooper()) {
                StringBuilder sb = new StringBuilder("A WebView method was called on thread '");
                sb.append(Thread.currentThread().getName());
                sb.append("'. All WebView methods must be called on the same thread. (Expected Looper ");
                sb.append(webViewLooper);
                sb.append(" called on ");
                sb.append(Looper.myLooper());
                Looper mainLooper = Looper.getMainLooper();
                sb.append(", FYI main Looper is ");
                sb.append(mainLooper);
                sb.append(")");
                throw new RuntimeException(sb.toString());
            }
        } else {
            try {
                Method declaredMethod = WebView.class.getDeclaredMethod("checkThread", null);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(webView, null);
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
                throw new RuntimeException(e);
            }
        }
        return ((WebViewProviderBoundaryInterface) b(webView).g).getWebViewClient();
    }
}
