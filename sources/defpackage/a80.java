package defpackage;

import android.webkit.WebView;
import org.chromium.support_lib_boundary.ProfileStoreBoundaryInterface;
import org.chromium.support_lib_boundary.StaticsBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;

/* JADX INFO: loaded from: classes.dex */
public interface a80 {
    WebViewProviderBoundaryInterface createWebView(WebView webView);

    String[] g();

    ProfileStoreBoundaryInterface getProfileStore();

    StaticsBoundaryInterface getStatics();
}
