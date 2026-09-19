package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.extremestudios.musicmanevo.R;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class yd1 extends FrameLayout implements md1 {
    public final de1 f;
    public final kd0 g;
    public final AtomicBoolean h;

    public yd1(de1 de1Var, es1 es1Var) {
        super(de1Var.getContext());
        this.h = new AtomicBoolean();
        this.f = de1Var;
        this.g = new kd0(de1Var.f.c, this, this, es1Var);
        addView(de1Var);
    }

    @Override // defpackage.md1
    public final pz0 A0() {
        return this.f.A0();
    }

    @Override // defpackage.ib0
    public final void B() {
        de1 de1Var = this.f;
        if (de1Var != null) {
            de1Var.B();
        }
    }

    @Override // defpackage.md1
    public final void C(String str, String str2) {
        this.f.C(str, str2);
    }

    @Override // defpackage.md1
    public final void C0(x42 x42Var, z42 z42Var) {
        de1 de1Var = this.f;
        de1Var.o = x42Var;
        de1Var.p = z42Var;
    }

    @Override // defpackage.md1
    public final void D(pw1 pw1Var) {
        this.f.D(pw1Var);
    }

    @Override // defpackage.md1
    public final z42 D0() {
        return this.f.p;
    }

    @Override // defpackage.md1
    public final x42 E() {
        return this.f.o;
    }

    @Override // defpackage.w93
    public final void F() {
        this.f.F();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.md1
    public final void F0() {
        qw1 qw1VarK0;
        pw1 pw1VarV0;
        de1 de1Var = this.f;
        TextView textView = new TextView(getContext());
        vc3 vc3Var = vc3.C;
        zb3 zb3Var = vc3Var.c;
        Resources resourcesC = vc3Var.h.c();
        textView.setText(resourcesC != null ? resourcesC.getString(R.string.s7) : "Test Ad");
        textView.setTextSize(15.0f);
        textView.setTextColor(-1);
        boolean z = false;
        Object[] objArr = 0;
        textView.setPadding(5, 0, 5, 0);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(-12303292);
        gradientDrawable.setCornerRadius(8.0f);
        textView.setBackground(gradientDrawable);
        addView(textView, new FrameLayout.LayoutParams(-2, -2, 49));
        bringChildToFront(textView);
        ix0 ix0Var = lx0.J5;
        tu0 tu0Var = tu0.e;
        if (((Boolean) tu0Var.c.a(ix0Var)).booleanValue() && (pw1VarV0 = de1Var.V0()) != null) {
            synchronized (pw1VarV0) {
                c92 c92Var = pw1VarV0.f;
                if (c92Var != null) {
                    vc3Var.x.getClass();
                    el1.n(new hb1(c92Var, textView, 23, z));
                    return;
                }
                return;
            }
        }
        if (((Boolean) tu0Var.c.a(lx0.I5)).booleanValue() && (qw1VarK0 = de1Var.k0()) != null && ((w82) qw1VarK0.b.l) == w82.g) {
            el1 el1Var = vc3Var.x;
            x82 x82Var = qw1VarK0.a;
            el1Var.getClass();
            el1.n(new lw1(x82Var, textView, objArr == true ? 1 : 0));
        }
    }

    @Override // defpackage.md1
    public final void G(boolean z, int i, String str, boolean z2, boolean z3) {
        this.f.G(z, i, str, z2, z3);
    }

    @Override // defpackage.md1
    public final void H() {
        setBackgroundColor(0);
        this.f.setBackgroundColor(0);
    }

    @Override // defpackage.md1
    public final void H0(String str, String str2) throws Throwable {
        this.f.H0(str, str2);
    }

    @Override // defpackage.md1
    public final void I0() {
        this.f.g0 = true;
    }

    @Override // defpackage.md1
    public final int J() {
        return ((Boolean) tu0.e.c.a(lx0.k4)).booleanValue() ? this.f.getMeasuredHeight() : getMeasuredHeight();
    }

    @Override // defpackage.md1
    public final void J0() {
        this.f.J0();
    }

    @Override // defpackage.md1
    public final void K(r91 r91Var, boolean z, boolean z2, String str) {
        this.f.K(r91Var, z, z2, str);
    }

    @Override // defpackage.md1
    public final void L(pz0 pz0Var) {
        this.f.L(pz0Var);
    }

    @Override // defpackage.md1
    public final void L0(Context context) {
        this.f.L0(context);
    }

    @Override // defpackage.md1
    public final void M() {
        this.f.M();
    }

    @Override // defpackage.md1
    public final void M0(boolean z) {
        this.f.M0(z);
    }

    @Override // defpackage.md1
    public final nf0 N0() {
        return this.f.N0();
    }

    @Override // defpackage.md1
    public final void O(int i) {
        pb1 pb1Var = (pb1) this.g.k;
        if (pb1Var != null) {
            if (((Boolean) tu0.e.c.a(lx0.R)).booleanValue()) {
                pb1Var.g.setBackgroundColor(i);
                pb1Var.h.setBackgroundColor(i);
            }
        }
    }

    @Override // defpackage.md1
    public final void O0(boolean z) {
        this.f.O0(z);
    }

    @Override // defpackage.md1
    public final boolean P0() {
        return this.f.P0();
    }

    @Override // defpackage.md1
    public final ArrayList Q() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt != this.f) {
                arrayList.add(childAt);
            }
        }
        return arrayList;
    }

    @Override // defpackage.qt0
    public final void Q0(pt0 pt0Var) {
        this.f.Q0(pt0Var);
    }

    @Override // defpackage.md1
    public final void R0(u32 u32Var) {
        this.f.R0(u32Var);
    }

    @Override // defpackage.md1
    public final zq0 S() {
        return this.f.g;
    }

    @Override // defpackage.md1
    public final void S0(kq1 kq1Var) {
        this.f.S0(kq1Var);
    }

    @Override // defpackage.md1
    public final u32 T() {
        return this.f.T();
    }

    @Override // defpackage.zm1
    public final void T0() {
        de1 de1Var = this.f;
        if (de1Var != null) {
            de1Var.T0();
        }
    }

    @Override // defpackage.md1
    public final void U0(fe1 fe1Var) {
        this.f.U0(fe1Var);
    }

    @Override // defpackage.md1
    public final String V() {
        return this.f.V();
    }

    @Override // defpackage.md1
    public final pw1 V0() {
        return this.f.V0();
    }

    @Override // defpackage.md1
    public final void W(eg egVar) {
        this.f.W(egVar);
    }

    @Override // defpackage.md1
    public final void W0(boolean z) {
        this.f.W0(z);
    }

    @Override // defpackage.md1
    public final void X(nf0 nf0Var) {
        this.f.X(nf0Var);
    }

    @Override // defpackage.md1
    public final boolean X0() {
        return this.f.X0();
    }

    @Override // defpackage.md1
    public final void Y0(int i, boolean z, boolean z2) {
        this.f.Y0(i, z, z2);
    }

    @Override // defpackage.md1
    public final boolean Z0() {
        return this.f.Z0();
    }

    @Override // defpackage.f31
    public final void a(String str, Map map) {
        this.f.a(str, map);
    }

    @Override // defpackage.md1
    public final Context a0() {
        return this.f.f.c;
    }

    @Override // defpackage.md1
    public final void a1(int i) {
        this.f.a1(i);
    }

    @Override // defpackage.f31
    public final void b(String str, JSONObject jSONObject) {
        this.f.b(str, jSONObject);
    }

    @Override // defpackage.md1
    public final void b0() {
        this.f.b0();
    }

    @Override // defpackage.md1
    public final void b1(String str, pc1 pc1Var) {
        this.f.b1(str, pc1Var);
    }

    @Override // defpackage.md1
    public final int c() {
        return ((Boolean) tu0.e.c.a(lx0.k4)).booleanValue() ? this.f.getMeasuredWidth() : getMeasuredWidth();
    }

    @Override // defpackage.md1
    public final kd0 c0() {
        return this.g;
    }

    @Override // defpackage.md1
    public final void c1(boolean z) {
        this.f.c1(z);
    }

    @Override // defpackage.md1
    public final boolean canGoBack() {
        return this.f.canGoBack();
    }

    @Override // defpackage.w93
    public final void d() {
        this.f.d();
    }

    @Override // defpackage.md1
    public final void d0(String str, oc2 oc2Var) {
        this.f.d0(str, oc2Var);
    }

    @Override // defpackage.md1
    public final void d1(String str, v11 v11Var) {
        this.f.d1(str, v11Var);
    }

    @Override // defpackage.md1
    public final void destroy() {
        pw1 pw1VarV0;
        de1 de1Var = this.f;
        qw1 qw1VarK0 = de1Var.k0();
        if (qw1VarK0 != null) {
            e32 e32Var = zb3.l;
            e32Var.post(new va1(7, qw1VarK0));
            e32Var.postDelayed(new xd1(de1Var, 1), ((Integer) tu0.e.c.a(lx0.H5)).intValue());
        } else if (!((Boolean) tu0.e.c.a(lx0.J5)).booleanValue() || (pw1VarV0 = de1Var.V0()) == null) {
            de1Var.destroy();
        } else {
            zb3.l.post(new hb1(this, pw1VarV0, 2, false));
        }
    }

    @Override // defpackage.l31
    public final void e(String str, JSONObject jSONObject) {
        this.f.s(str, jSONObject.toString());
    }

    @Override // defpackage.md1
    public final he1 e0() {
        return this.f.s;
    }

    @Override // defpackage.md1
    public final fe1 f() {
        return this.f.f();
    }

    @Override // defpackage.md1
    public final Activity g() {
        return this.f.f.a;
    }

    @Override // defpackage.md1
    public final void g0(int i) {
        this.f.g0(i);
    }

    @Override // defpackage.md1
    public final void goBack() {
        this.f.goBack();
    }

    @Override // defpackage.md1
    public final boolean h0() {
        return this.h.get();
    }

    @Override // defpackage.md1
    public final void i() {
        this.f.i();
    }

    @Override // defpackage.md1
    public final void i0() {
        this.f.i0();
    }

    @Override // defpackage.md1
    public final rx0 j() {
        return this.f.O;
    }

    @Override // defpackage.md1
    public final void j0(qw1 qw1Var) {
        this.f.j0(qw1Var);
    }

    @Override // defpackage.md1
    public final vg2 k() {
        return this.f.l;
    }

    @Override // defpackage.md1
    public final qw1 k0() {
        return this.f.k0();
    }

    @Override // defpackage.l31
    public final void l(String str) {
        this.f.A(str);
    }

    @Override // defpackage.md1
    public final boolean l0() {
        return this.f.l0();
    }

    @Override // defpackage.md1
    public final void loadData(String str, String str2, String str3) {
        this.f.loadData(str, "text/html", str3);
    }

    @Override // defpackage.md1
    public final void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        this.f.loadDataWithBaseURL(str, str2, "text/html", "UTF-8", null);
    }

    @Override // defpackage.md1
    public final void loadUrl(String str) {
        this.f.loadUrl(str);
    }

    @Override // defpackage.md1
    public final String m() {
        return this.f.m();
    }

    @Override // defpackage.md1
    public final void m0(nf0 nf0Var) {
        this.f.m0(nf0Var);
    }

    @Override // defpackage.md1
    public final us2 n() {
        return this.f.Q;
    }

    @Override // defpackage.md1
    public final String o() {
        return this.f.o();
    }

    @Override // defpackage.md1
    public final void onPause() {
        lb1 lb1Var;
        kd0 kd0Var = this.g;
        kd0Var.getClass();
        dq.d("onPause must be called from the UI thread.");
        pb1 pb1Var = (pb1) kd0Var.k;
        if (pb1Var != null && (lb1Var = pb1Var.l) != null) {
            lb1Var.i();
        }
        this.f.onPause();
    }

    @Override // defpackage.md1
    public final void onResume() {
        this.f.onResume();
    }

    @Override // defpackage.md1
    public final int q() {
        return this.f.q();
    }

    @Override // defpackage.zm1
    public final void q0() {
        de1 de1Var = this.f;
        if (de1Var != null) {
            de1Var.q0();
        }
    }

    public final void r() {
        kd0 kd0Var = this.g;
        kd0Var.getClass();
        dq.d("onDestroy must be called from the UI thread.");
        pb1 pb1Var = (pb1) kd0Var.k;
        if (pb1Var != null) {
            pb1Var.j.a();
            lb1 lb1Var = pb1Var.l;
            if (lb1Var != null) {
                lb1Var.g();
            }
            pb1Var.d();
            ((yd1) kd0Var.i).removeView((pb1) kd0Var.k);
            kd0Var.k = null;
        }
        this.f.r();
    }

    @Override // defpackage.md1
    public final hp r0() {
        return this.f.r0();
    }

    @Override // defpackage.l31
    public final void s(String str, String str2) {
        this.f.s("window.inspectorInfo", str2);
    }

    @Override // defpackage.md1
    public final k52 s0() {
        return this.f.h;
    }

    @Override // android.view.View, defpackage.md1
    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.f.setOnClickListener(onClickListener);
    }

    @Override // android.view.View, defpackage.md1
    public final void setOnTouchListener(View.OnTouchListener onTouchListener) {
        this.f.setOnTouchListener(onTouchListener);
    }

    @Override // defpackage.md1
    public final void setWebChromeClient(WebChromeClient webChromeClient) {
        this.f.setWebChromeClient(webChromeClient);
    }

    @Override // defpackage.md1
    public final void setWebViewClient(WebViewClient webViewClient) {
        this.f.setWebViewClient(webViewClient);
    }

    @Override // defpackage.md1
    public final WebView t() {
        return this.f;
    }

    @Override // defpackage.md1
    public final void t0(String str, v11 v11Var) {
        this.f.t0(str, v11Var);
    }

    @Override // defpackage.md1
    public final d60 u() {
        return this.f.j;
    }

    @Override // defpackage.md1
    public final pc1 u0(String str) {
        return this.f.u0(str);
    }

    @Override // defpackage.md1
    public final void v(boolean z, int i, String str, String str2, boolean z2) {
        this.f.v(z, i, str, str2, z2);
    }

    @Override // defpackage.md1
    public final void v0(boolean z) {
        this.f.s.I = z;
    }

    @Override // defpackage.md1
    public final void w0(boolean z) {
        this.f.w0(z);
    }

    @Override // defpackage.md1
    public final eg x() {
        return this.f.x();
    }

    @Override // defpackage.md1
    public final nf0 x0() {
        return this.f.x0();
    }

    @Override // defpackage.md1
    public final void y(int i) {
        this.f.y(i);
    }

    @Override // defpackage.md1
    public final void z(long j, boolean z) {
        this.f.z(j, z);
    }

    @Override // defpackage.md1
    public final boolean z0() {
        return this.f.z0();
    }

    @Override // defpackage.md1
    public final View p0() {
        return this;
    }
}
