package defpackage;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public interface md1 extends ib0, zm1, f31, l31, qt0, w93 {
    pz0 A0();

    void C(String str, String str2);

    void C0(x42 x42Var, z42 z42Var);

    void D(pw1 pw1Var);

    z42 D0();

    x42 E();

    void F0();

    void G(boolean z, int i, String str, boolean z2, boolean z3);

    void H();

    void H0(String str, String str2);

    void I0();

    int J();

    void J0();

    void K(r91 r91Var, boolean z, boolean z2, String str);

    void L(pz0 pz0Var);

    void L0(Context context);

    void M();

    void M0(boolean z);

    nf0 N0();

    void O(int i);

    void O0(boolean z);

    boolean P0();

    ArrayList Q();

    void R0(u32 u32Var);

    zq0 S();

    void S0(kq1 kq1Var);

    u32 T();

    void U0(fe1 fe1Var);

    String V();

    pw1 V0();

    void W(eg egVar);

    void W0(boolean z);

    void X(nf0 nf0Var);

    boolean X0();

    void Y0(int i, boolean z, boolean z2);

    boolean Z0();

    Context a0();

    void a1(int i);

    void b0();

    void b1(String str, pc1 pc1Var);

    int c();

    kd0 c0();

    void c1(boolean z);

    boolean canGoBack();

    void d0(String str, oc2 oc2Var);

    void d1(String str, v11 v11Var);

    void destroy();

    he1 e0();

    fe1 f();

    Activity g();

    void g0(int i);

    Context getContext();

    ViewGroup.LayoutParams getLayoutParams();

    ViewParent getParent();

    int getWidth();

    void goBack();

    boolean h0();

    void i();

    void i0();

    boolean isAttachedToWindow();

    rx0 j();

    void j0(qw1 qw1Var);

    vg2 k();

    qw1 k0();

    boolean l0();

    void loadData(String str, String str2, String str3);

    void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5);

    void loadUrl(String str);

    String m();

    void m0(nf0 nf0Var);

    us2 n();

    String o();

    void onPause();

    void onResume();

    View p0();

    int q();

    hp r0();

    k52 s0();

    void setBackgroundColor(int i);

    void setOnClickListener(View.OnClickListener onClickListener);

    void setOnTouchListener(View.OnTouchListener onTouchListener);

    void setWebChromeClient(WebChromeClient webChromeClient);

    void setWebViewClient(WebViewClient webViewClient);

    WebView t();

    void t0(String str, v11 v11Var);

    d60 u();

    pc1 u0(String str);

    void v(boolean z, int i, String str, String str2, boolean z2);

    void v0(boolean z);

    void w0(boolean z);

    eg x();

    nf0 x0();

    void y(int i);

    void z(long j, boolean z);

    boolean z0();
}
