package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.view.textclassifier.TextClassifier;
import android.webkit.CookieManager;
import android.webkit.WebChromeClient;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.Toolbar;
import com.extremestudios.musicmanevo.R;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import java.util.Collections;
import java.util.concurrent.ScheduledFuture;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class nf0 extends p61 {
    public static final int D = Color.argb(0, 0, 0, 0);
    public Toolbar A;
    public final /* synthetic */ int C;
    public final Activity g;
    public AdOverlayInfoParcel h;
    public md1 i;
    public g2 j;
    public hd3 k;
    public FrameLayout m;
    public WebChromeClient.CustomViewCallback n;
    public b43 q;
    public ly1 u;
    public boolean v;
    public boolean w;
    public boolean l = false;
    public boolean o = false;
    public boolean p = false;
    public boolean r = false;
    public int B = 1;
    public final Object s = new Object();
    public final f1 t = new f1(4, this);
    public boolean x = false;
    public boolean y = false;
    public boolean z = true;

    public nf0(Activity activity, int i) {
        this.C = i;
        this.g = activity;
    }

    public static final void F3(View view, qw1 qw1Var) {
        if (qw1Var == null || view == null) {
            return;
        }
        if (((Boolean) tu0.e.c.a(lx0.I5)).booleanValue() && ((w82) qw1Var.b.l) == w82.g) {
            return;
        }
        el1 el1Var = vc3.C.x;
        x82 x82Var = qw1Var.a;
        el1Var.getClass();
        el1.g(x82Var, view);
    }

    public final void B3() {
        AdOverlayInfoParcel adOverlayInfoParcel;
        lb3 lb3Var;
        if (!this.g.isFinishing() || this.x) {
            return;
        }
        this.x = true;
        md1 md1Var = this.i;
        if (md1Var != null) {
            md1Var.g0(this.B - 1);
            synchronized (this.s) {
                try {
                    if (!this.v && this.i.z0()) {
                        ix0 ix0Var = lx0.u5;
                        tu0 tu0Var = tu0.e;
                        if (((Boolean) tu0Var.c.a(ix0Var)).booleanValue() && !this.y && (adOverlayInfoParcel = this.h) != null && (lb3Var = adOverlayInfoParcel.h) != null) {
                            lb3Var.N1();
                        }
                        ly1 ly1Var = new ly1(3, this);
                        this.u = ly1Var;
                        zb3.l.postDelayed(ly1Var, ((Long) tu0Var.c.a(lx0.g1)).longValue());
                        return;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        C3();
    }

    @Override // defpackage.q61
    public final void C(rm rmVar) {
        D3((Configuration) ju.Z0(rmVar));
    }

    public final void C3() {
        md1 md1Var;
        lb3 lb3Var;
        if (this.y) {
            return;
        }
        this.y = true;
        md1 md1Var2 = this.i;
        if (md1Var2 != null) {
            this.q.removeView(md1Var2.p0());
            g2 g2Var = this.j;
            if (g2Var != null) {
                this.i.L0((Context) g2Var.j);
                this.i.O0(false);
                if (((Boolean) tu0.e.c.a(lx0.wd)).booleanValue() && this.i.getParent() != null) {
                    ((ViewGroup) this.i.getParent()).removeView(this.i.p0());
                }
                ViewGroup viewGroup = (ViewGroup) this.j.i;
                View viewP0 = this.i.p0();
                g2 g2Var2 = this.j;
                viewGroup.addView(viewP0, g2Var2.g, (ViewGroup.LayoutParams) g2Var2.h);
                this.j = null;
            } else {
                Activity activity = this.g;
                if (activity.getApplicationContext() != null) {
                    this.i.L0(activity.getApplicationContext());
                }
            }
            this.i = null;
        }
        AdOverlayInfoParcel adOverlayInfoParcel = this.h;
        if (adOverlayInfoParcel != null && (lb3Var = adOverlayInfoParcel.h) != null) {
            lb3Var.H1(this.B);
        }
        AdOverlayInfoParcel adOverlayInfoParcel2 = this.h;
        if (adOverlayInfoParcel2 == null || (md1Var = adOverlayInfoParcel2.i) == null) {
            return;
        }
        F3(this.h.i.p0(), md1Var.k0());
    }

    /* JADX WARN: Code duplicated, block: B:12:0x002e  */
    /* JADX WARN: Code duplicated, block: B:47:0x010f  */
    /* JADX WARN: Code duplicated, block: B:49:0x0115 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:50:0x0117  */
    /* JADX WARN: Code duplicated, block: B:51:0x011a  */
    /* JADX WARN: Code duplicated, block: B:52:0x011d  */
    /* JADX WARN: Code duplicated, block: B:54:0x0124  */
    /* JADX WARN: Code duplicated, block: B:56:0x012a  */
    /* JADX WARN: Code duplicated, block: B:58:0x0132  */
    /* JADX WARN: Code duplicated, block: B:59:0x013c  */
    public final void D3(Configuration configuration) {
        boolean zIsInMultiWindowMode;
        boolean z;
        boolean z2;
        q83 q83Var;
        Window window;
        int i;
        int i2;
        q83 q83Var2;
        AdOverlayInfoParcel adOverlayInfoParcel = this.h;
        boolean z3 = true;
        boolean z4 = (adOverlayInfoParcel == null || (q83Var2 = adOverlayInfoParcel.t) == null || !q83Var2.g) ? false : true;
        vc3.C.f.getClass();
        ix0 ix0Var = lx0.v5;
        tu0 tu0Var = tu0.e;
        kx0 kx0Var = tu0Var.c;
        kx0 kx0Var2 = tu0Var.c;
        boolean zBooleanValue = ((Boolean) kx0Var.a(ix0Var)).booleanValue();
        Activity activity = this.g;
        if (!zBooleanValue) {
            zIsInMultiWindowMode = false;
        } else if (((Boolean) kx0Var.a(lx0.x5)).booleanValue()) {
            zIsInMultiWindowMode = activity.isInMultiWindowMode();
        } else {
            f32 f32Var = ut0.f.a;
            int iB = f32.b(activity, configuration.screenHeightDp);
            int iN = f32.n(activity.getResources().getDisplayMetrics(), configuration.screenWidthDp);
            WindowManager windowManager = (WindowManager) activity.getApplicationContext().getSystemService("window");
            DisplayMetrics displayMetrics = new DisplayMetrics();
            windowManager.getDefaultDisplay().getMetrics(displayMetrics);
            int i3 = displayMetrics.heightPixels;
            int i4 = displayMetrics.widthPixels;
            int identifier = activity.getResources().getIdentifier("status_bar_height", "dimen", "android");
            int dimensionPixelSize = identifier > 0 ? activity.getResources().getDimensionPixelSize(identifier) : 0;
            int iIntValue = ((Integer) kx0Var.a(lx0.t5)).intValue() * ((int) Math.round(((double) activity.getResources().getDisplayMetrics().density) + 0.5d));
            if (Math.abs(i3 - (iB + dimensionPixelSize)) > iIntValue || Math.abs(i4 - iN) > iIntValue) {
                zIsInMultiWindowMode = true;
            } else {
                zIsInMultiWindowMode = false;
            }
        }
        if ((!this.p || z4 || ((Boolean) kx0Var2.a(lx0.O0)).booleanValue()) && (!zIsInMultiWindowMode || ((Boolean) kx0Var2.a(lx0.N0)).booleanValue())) {
            AdOverlayInfoParcel adOverlayInfoParcel2 = this.h;
            if (adOverlayInfoParcel2 == null || (q83Var = adOverlayInfoParcel2.t) == null || !q83Var.l) {
                z = true;
                z2 = false;
            } else {
                z = true;
            }
            window = activity.getWindow();
            if (((Boolean) kx0Var2.a(lx0.n1)).booleanValue()) {
                View decorView = window.getDecorView();
                if (z) {
                    i2 = 256;
                    z3 = false;
                } else if (z2) {
                    i2 = 5894;
                } else {
                    i2 = 5380;
                }
                decorView.setSystemUiVisibility(i2);
            } else if (z) {
                window.addFlags(1024);
                window.clearFlags(2048);
                if (z2) {
                    window.getDecorView().setSystemUiVisibility(4098);
                }
            } else {
                window.addFlags(2048);
                window.clearFlags(1024);
                z3 = false;
            }
            if (((Boolean) kx0Var2.a(lx0.ee)).booleanValue() || (i = Build.VERSION.SDK_INT) > 34 || i < 28 || !z3) {
                return;
            }
            window.getAttributes().layoutInDisplayCutoutMode = 1;
            if (i >= 35) {
                q0.e(window);
                return;
            } else if (i >= 30) {
                q0.d(window);
                return;
            } else {
                View decorView2 = window.getDecorView();
                decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() | 1792);
                return;
            }
        }
        z = false;
        z2 = z;
        window = activity.getWindow();
        if (((Boolean) kx0Var2.a(lx0.n1)).booleanValue()) {
            View decorView3 = window.getDecorView();
            if (z) {
                i2 = 256;
                z3 = false;
            } else if (z2) {
                i2 = 5894;
            } else {
                i2 = 5380;
            }
            decorView3.setSystemUiVisibility(i2);
        } else if (z) {
            window.addFlags(1024);
            window.clearFlags(2048);
            if (z2) {
                window.getDecorView().setSystemUiVisibility(4098);
            }
        } else {
            window.addFlags(2048);
            window.clearFlags(1024);
            z3 = false;
        }
        if (((Boolean) kx0Var2.a(lx0.ee)).booleanValue()) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void E3(View view) {
        qw1 qw1VarK0;
        pw1 pw1VarV0;
        md1 md1Var = this.i;
        if (md1Var == null) {
            return;
        }
        ix0 ix0Var = lx0.J5;
        tu0 tu0Var = tu0.e;
        boolean z = false;
        Object[] objArr = 0;
        if (((Boolean) tu0Var.c.a(ix0Var)).booleanValue() && (pw1VarV0 = md1Var.V0()) != null) {
            synchronized (pw1VarV0) {
                c92 c92Var = pw1VarV0.f;
                if (c92Var != null) {
                    vc3.C.x.getClass();
                    el1.n(new hb1(c92Var, view, 23, z));
                    return;
                }
                return;
            }
        }
        if (((Boolean) tu0Var.c.a(lx0.I5)).booleanValue() && (qw1VarK0 = md1Var.k0()) != null && ((w82) qw1VarK0.b.l) == w82.g) {
            el1 el1Var = vc3.C.x;
            x82 x82Var = qw1VarK0.a;
            el1Var.getClass();
            el1.n(new lw1(x82Var, view, objArr == true ? 1 : 0));
        }
    }

    public final void G3(boolean z) {
        if (this.h.B) {
            return;
        }
        ix0 ix0Var = lx0.z5;
        tu0 tu0Var = tu0.e;
        int iIntValue = ((Integer) tu0Var.c.a(ix0Var)).intValue();
        boolean z2 = ((Boolean) tu0Var.c.a(lx0.j1)).booleanValue() || z;
        rc3 rc3Var = new rc3();
        rc3Var.a = 0;
        rc3Var.b = 0;
        rc3Var.c = 0;
        rc3Var.d = 50;
        rc3Var.a = true != z2 ? 0 : iIntValue;
        rc3Var.b = true != z2 ? iIntValue : 0;
        rc3Var.c = iIntValue;
        this.k = new hd3(this.g, rc3Var, this);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(10);
        layoutParams.addRule(true != z2 ? 9 : 11);
        H3(z, this.h.l);
        this.q.addView(this.k, layoutParams);
        E3(this.k);
    }

    public final void H3(boolean z, boolean z2) {
        AdOverlayInfoParcel adOverlayInfoParcel;
        q83 q83Var;
        AdOverlayInfoParcel adOverlayInfoParcel2;
        q83 q83Var2;
        ix0 ix0Var = lx0.h1;
        tu0 tu0Var = tu0.e;
        kx0 kx0Var = tu0Var.c;
        kx0 kx0Var2 = tu0Var.c;
        boolean zBooleanValue = ((Boolean) kx0Var.a(ix0Var)).booleanValue();
        boolean z3 = true;
        boolean z4 = zBooleanValue && (adOverlayInfoParcel2 = this.h) != null && (q83Var2 = adOverlayInfoParcel2.t) != null && q83Var2.m;
        boolean z5 = ((Boolean) kx0Var2.a(lx0.i1)).booleanValue() && (adOverlayInfoParcel = this.h) != null && (q83Var = adOverlayInfoParcel.t) != null && q83Var.n;
        if (z && z2 && z4 && !z5) {
            md1 md1Var = this.i;
            try {
                JSONObject jSONObjectPut = new JSONObject().put("message", "Custom close has been disabled for interstitial ads in this ad slot.").put("action", "useCustomClose");
                if (md1Var != null) {
                    md1Var.b("onError", jSONObjectPut);
                }
            } catch (JSONException e) {
                jn.P("Error occurred while dispatching error event.", e);
            }
        }
        hd3 hd3Var = this.k;
        if (hd3Var != null) {
            if (!z5 && (!z2 || z4)) {
                z3 = false;
            }
            ImageButton imageButton = hd3Var.f;
            if (!z3) {
                imageButton.setVisibility(0);
                return;
            }
            imageButton.setVisibility(8);
            if (((Long) kx0Var2.a(lx0.l1)).longValue() > 0) {
                imageButton.animate().cancel();
                imageButton.clearAnimation();
            }
        }
    }

    public final void I3(int i) {
        int i2;
        Activity activity = this.g;
        int i3 = activity.getApplicationInfo().targetSdkVersion;
        ix0 ix0Var = lx0.r6;
        tu0 tu0Var = tu0.e;
        kx0 kx0Var = tu0Var.c;
        kx0 kx0Var2 = tu0Var.c;
        if (i3 < ((Integer) kx0Var.a(ix0Var)).intValue() || activity.getApplicationInfo().targetSdkVersion > ((Integer) kx0Var2.a(lx0.s6)).intValue() || (i2 = Build.VERSION.SDK_INT) < ((Integer) kx0Var2.a(lx0.t6)).intValue() || i2 > ((Integer) kx0Var2.a(lx0.u6)).intValue()) {
            try {
                activity.setRequestedOrientation(i);
            } catch (Throwable th) {
                vc3.C.h.e("AdOverlay.setRequestedOrientation", th);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x002c  */
    /* JADX WARN: Code duplicated, block: B:39:0x0064  */
    public final void J3(boolean z) throws zp2 {
        boolean z2;
        boolean z3;
        boolean z4;
        Resources.Theme theme;
        int i;
        boolean z5;
        Activity activity = this.g;
        if (!this.w) {
            activity.requestWindowFeature(1);
        }
        Window window = activity.getWindow();
        if (window == null) {
            throw new zp2("Invalid activity, no window available.");
        }
        md1 md1Var = this.h.i;
        he1 he1VarE0 = md1Var != null ? md1Var.e0() : null;
        if (he1VarE0 != null) {
            synchronized (he1VarE0.i) {
                z5 = he1VarE0.v;
            }
            if (z5) {
                z2 = true;
            } else {
                z2 = false;
            }
        } else {
            z2 = false;
        }
        this.r = false;
        if (z2) {
            int i2 = this.h.o;
            if (i2 == 6) {
                z3 = activity.getResources().getConfiguration().orientation == 1;
                this.r = z3;
            } else if (i2 == 7) {
                z3 = activity.getResources().getConfiguration().orientation == 2;
                this.r = z3;
            } else {
                z3 = false;
            }
        } else {
            z3 = false;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(z3).length() + 41);
        sb.append("Delay onShow to next orientation change: ");
        sb.append(z3);
        jn.F(sb.toString());
        I3(this.h.o);
        window.setFlags(16777216, 16777216);
        jn.F("Hardware acceleration on the AdActivity window enabled.");
        boolean z6 = this.p;
        b43 b43Var = this.q;
        if (z6) {
            b43Var.setBackgroundColor(D);
        } else {
            b43Var.setBackgroundColor(-16777216);
        }
        activity.setContentView(this.q);
        this.w = true;
        if (z) {
            try {
                ue0 ue0Var = vc3.C.d;
                md1 md1Var2 = this.h.i;
                eg egVarX = md1Var2 != null ? md1Var2.x() : null;
                md1 md1Var3 = this.h.i;
                String strV = md1Var3 != null ? md1Var3.V() : null;
                AdOverlayInfoParcel adOverlayInfoParcel = this.h;
                d60 d60Var = adOverlayInfoParcel.r;
                md1 md1Var4 = adOverlayInfoParcel.i;
                z4 = z2;
                eg egVar = egVarX;
                theme = null;
                md1 md1VarP = ue0.p(activity, egVar, strV, true, z4, null, null, d60Var, null, md1Var4 != null ? md1Var4.k() : null, new cv0(), null, null, null, null, null);
                this.i = md1VarP;
                he1 he1VarE1 = md1VarP.e0();
                AdOverlayInfoParcel adOverlayInfoParcel2 = this.h;
                j11 j11Var = adOverlayInfoParcel2.u;
                k11 k11Var = adOverlayInfoParcel2.j;
                md0 md0Var = adOverlayInfoParcel2.n;
                md1 md1Var5 = adOverlayInfoParcel2.i;
                he1VarE1.p(null, j11Var, null, k11Var, md0Var, true, null, md1Var5 != null ? md1Var5.e0().B : null, null, null, null, null, null, null, null, null, null, null, null, null, null);
                this.i.e0().l = new w32(4, this);
                AdOverlayInfoParcel adOverlayInfoParcel3 = this.h;
                String str = adOverlayInfoParcel3.q;
                if (str != null) {
                    this.i.loadUrl(str);
                } else {
                    String str2 = adOverlayInfoParcel3.m;
                    if (str2 == null) {
                        throw new zp2("No URL or HTML to display in ad overlay.");
                    }
                    this.i.loadDataWithBaseURL(adOverlayInfoParcel3.k, str2, "text/html", "UTF-8", null);
                }
                md1 md1Var6 = this.h.i;
                if (md1Var6 != null) {
                    md1Var6.X(this);
                }
            } catch (Exception e) {
                jn.P("Error obtaining webview.", e);
                throw new zp2("Could not obtain webview for the overlay.", e);
            }
        } else {
            z4 = z2;
            theme = null;
            md1 md1Var7 = this.h.i;
            this.i = md1Var7;
            md1Var7.L0(activity);
        }
        if (this.h.B) {
            i = 0;
            CookieManager.getInstance().setAcceptThirdPartyCookies(this.i.t(), false);
            ix0 ix0Var = lx0.Y0;
            tu0 tu0Var = tu0.e;
            if (((Boolean) tu0Var.c.a(ix0Var)).booleanValue() && Build.VERSION.SDK_INT >= 27) {
                this.i.t().setTextClassifier(TextClassifier.NO_OP);
            }
            if (((Boolean) tu0Var.c.a(lx0.Z0)).booleanValue()) {
                this.i.t().setDownloadListener(gu1.f);
            }
        } else {
            i = 0;
        }
        this.i.m0(this);
        md1 md1Var8 = this.h.i;
        if (md1Var8 != null) {
            F3(this.q, md1Var8.k0());
        }
        if (this.h.p != 5) {
            ViewParent parent = this.i.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.i.p0());
            }
            if (this.p) {
                this.i.H();
            }
            if (this.h.B) {
                Toolbar toolbar = new Toolbar(activity);
                this.A = toolbar;
                toolbar.setId(View.generateViewId());
                this.i.p0().setId(View.generateViewId());
                this.A.setBackgroundColor(-12303292);
                this.A.setVisibility(i);
                try {
                    this.A.setNavigationIcon(vc3.C.h.c().getDrawable(R.drawable.admob_close_button_white_cross, theme));
                } catch (Resources.NotFoundException | NullPointerException e2) {
                    jn.w("Error obtaining close icon.", e2);
                }
                this.A.setNavigationOnClickListener(this.t);
                this.A.setTitleMarginStart(i);
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams.addRule(10);
                this.q.addView(this.A, layoutParams);
                RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams2.addRule(3, this.A.getId());
                layoutParams2.addRule(12);
                this.q.addView(this.i.p0(), layoutParams2);
                E3(this.A);
            } else {
                this.q.addView(this.i.p0(), -1, -1);
            }
        }
        if (!z && !this.r) {
            this.i.M();
        }
        AdOverlayInfoParcel adOverlayInfoParcel4 = this.h;
        if (adOverlayInfoParcel4.p != 5) {
            G3(z4);
            if (this.i.Z0()) {
                H3(z4, true);
                return;
            }
            return;
        }
        aw1 aw1Var = new aw1(activity, this, adOverlayInfoParcel4.v, adOverlayInfoParcel4.w);
        if (adOverlayInfoParcel4 != null) {
            try {
                k61 k61Var = adOverlayInfoParcel4.A;
                if (k61Var != null) {
                    k61Var.R(new ju(aw1Var));
                    return;
                }
            } catch (RemoteException | zp2 e3) {
                throw new zp2(e3.getMessage(), e3);
            }
        }
        throw new zp2("noioou");
    }

    @Override // defpackage.q61
    public final void P1(int i, String[] strArr, int[] iArr) {
        if (i == 12345) {
            Activity activity = this.g;
            if (activity == null) {
                j7.l("Null activity");
                return;
            }
            AdOverlayInfoParcel adOverlayInfoParcel = this.h;
            if (adOverlayInfoParcel.p != 5) {
                this = null;
            }
            try {
                adOverlayInfoParcel.A.V2(strArr, iArr, new ju(new aw1(activity, this, null, null)));
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // defpackage.q61
    public final void S() {
        lb3 lb3Var;
        AdOverlayInfoParcel adOverlayInfoParcel = this.h;
        if (adOverlayInfoParcel != null && (lb3Var = adOverlayInfoParcel.h) != null) {
            lb3Var.n2();
        }
        if (((Boolean) tu0.e.c.a(lx0.w5)).booleanValue() && this.i != null && (!this.g.isFinishing() || this.j == null)) {
            this.i.onPause();
        }
        B3();
    }

    @Override // defpackage.q61
    public final void W1(int i, int i2, Intent intent) {
        es1 es1Var;
        AdOverlayInfoParcel adOverlayInfoParcel;
        if (i == 236) {
            ix0 ix0Var = lx0.Ud;
            tu0 tu0Var = tu0.e;
            if (((Boolean) tu0Var.c.a(ix0Var)).booleanValue()) {
                StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 66);
                sb.append("Callback from intent launch with requestCode: 236 and resultCode: ");
                sb.append(i2);
                jn.p(sb.toString());
                md1 md1Var = this.i;
                if (md1Var == null || md1Var.e0() == null || (es1Var = md1Var.e0().E) == null || (adOverlayInfoParcel = this.h) == null || !((Boolean) tu0Var.c.a(ix0Var)).booleanValue()) {
                    return;
                }
                us2 us2VarA = es1Var.a();
                us2VarA.s("action", "hilca");
                String str = adOverlayInfoParcel.v;
                if (str == null) {
                    str = "";
                }
                us2VarA.s("gqi", str);
                StringBuilder sb2 = new StringBuilder(String.valueOf(i2).length());
                sb2.append(i2);
                us2VarA.s("hilr", sb2.toString());
                if (i2 == -1 && intent != null) {
                    String stringExtra = intent.getStringExtra("callerPackage");
                    String stringExtra2 = intent.getStringExtra("loadingStage");
                    if (stringExtra != null) {
                        us2VarA.s("hilcp", stringExtra);
                    }
                    if (stringExtra2 != null) {
                        us2VarA.s("hills", stringExtra2);
                    }
                }
                us2VarA.y();
            }
        }
    }

    @Override // defpackage.q61
    public void Y2(Bundle bundle) {
        lb3 lb3Var;
        switch (this.C) {
            case 4:
                jn.p("AdOverlayParcel is null or does not contain valid overlay type.");
                this.B = 4;
                this.g.finish();
                return;
            default:
                if (!this.w) {
                    this.g.requestWindowFeature(1);
                }
                this.o = bundle != null && bundle.getBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", false);
                try {
                    Activity activity = this.g;
                    AdOverlayInfoParcel adOverlayInfoParcelA = AdOverlayInfoParcel.a(activity.getIntent());
                    this.h = adOverlayInfoParcelA;
                    if (adOverlayInfoParcelA == null) {
                        throw new zp2("Could not get info for ad overlay.");
                    }
                    if (adOverlayInfoParcelA.B) {
                        if (Build.VERSION.SDK_INT >= 28) {
                            activity.setShowWhenLocked(true);
                        } else {
                            activity.getWindow().addFlags(524288);
                        }
                    }
                    if (this.h.r.h > 7500000) {
                        this.B = 4;
                    }
                    if (activity.getIntent() != null) {
                        this.z = activity.getIntent().getBooleanExtra("shouldCallOnOverlayOpened", true);
                    }
                    AdOverlayInfoParcel adOverlayInfoParcel = this.h;
                    q83 q83Var = adOverlayInfoParcel.t;
                    if (q83Var != null) {
                        boolean z = q83Var.f;
                        this.p = z;
                        if (z) {
                            if (adOverlayInfoParcel.p != 5 && q83Var.k != -1) {
                                new s91(this).o1();
                            }
                        }
                        jn.T(e.getMessage());
                        this.B = 4;
                        this.g.finish();
                        return;
                    }
                    if (adOverlayInfoParcel.p == 5) {
                        this.p = true;
                        if (adOverlayInfoParcel.p != 5) {
                            new s91(this).o1();
                        }
                    } else {
                        this.p = false;
                    }
                    if (bundle == null) {
                        if (this.z) {
                            ik1 ik1Var = this.h.y;
                            if (ik1Var != null) {
                                synchronized (ik1Var) {
                                    ScheduledFuture scheduledFuture = ik1Var.i;
                                    if (scheduledFuture != null) {
                                        scheduledFuture.cancel(true);
                                    }
                                }
                            }
                            lb3 lb3Var2 = this.h.h;
                            if (lb3Var2 != null) {
                                lb3Var2.f();
                            }
                        }
                        AdOverlayInfoParcel adOverlayInfoParcel2 = this.h;
                        if (adOverlayInfoParcel2.p != 1) {
                            ib0 ib0Var = adOverlayInfoParcel2.g;
                            if (ib0Var != null) {
                                ib0Var.B();
                            }
                            zm1 zm1Var = this.h.z;
                            if (zm1Var != null) {
                                zm1Var.q0();
                            }
                        }
                    }
                    AdOverlayInfoParcel adOverlayInfoParcel3 = this.h;
                    if (adOverlayInfoParcel3 != null && (lb3Var = adOverlayInfoParcel3.h) != null) {
                        lb3Var.g3();
                    }
                    AdOverlayInfoParcel adOverlayInfoParcel4 = this.h;
                    b43 b43Var = new b43(activity, adOverlayInfoParcel4.s, adOverlayInfoParcel4.r.f, adOverlayInfoParcel4.x);
                    this.q = b43Var;
                    b43Var.setId(1000);
                    vc3.C.f.j(activity);
                    AdOverlayInfoParcel adOverlayInfoParcel5 = this.h;
                    int i = adOverlayInfoParcel5.p;
                    if (i == 1) {
                        J3(false);
                        return;
                    }
                    if (i == 2) {
                        this.j = new g2(adOverlayInfoParcel5.i);
                        J3(false);
                        return;
                    } else if (i == 3) {
                        J3(true);
                        return;
                    } else {
                        if (i != 5) {
                            throw new zp2("Could not determine ad overlay type.");
                        }
                        J3(false);
                        return;
                    }
                } catch (zp2 e) {
                    jn.T(e.getMessage());
                    this.B = 4;
                    this.g.finish();
                    return;
                }
                break;
        }
    }

    @Override // defpackage.q61
    public final void b() {
        this.B = 1;
    }

    @Override // defpackage.q61
    public final void c0(Bundle bundle) {
        bundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", this.o);
    }

    @Override // defpackage.q61
    public final void d() {
        lb3 lb3Var;
        AdOverlayInfoParcel adOverlayInfoParcel = this.h;
        if (adOverlayInfoParcel == null || (lb3Var = adOverlayInfoParcel.h) == null) {
            return;
        }
        lb3Var.S2();
    }

    @Override // defpackage.q61
    public final boolean e() {
        this.B = 1;
        if (this.i == null) {
            return true;
        }
        if (((Boolean) tu0.e.c.a(lx0.I9)).booleanValue() && this.i.canGoBack()) {
            this.i.goBack();
            return false;
        }
        boolean zP0 = this.i.P0();
        if (!zP0) {
            this.i.a("onbackblocked", Collections.EMPTY_MAP);
        }
        return zP0;
    }

    @Override // defpackage.q61
    public final void g() {
        lb3 lb3Var;
        if (((Boolean) tu0.e.c.a(lx0.w5)).booleanValue()) {
            md1 md1Var = this.i;
            if (md1Var == null || md1Var.l0()) {
                jn.T("The webview does not exist. Ignoring action.");
            } else {
                this.i.onResume();
            }
        }
        AdOverlayInfoParcel adOverlayInfoParcel = this.h;
        if (adOverlayInfoParcel == null || (lb3Var = adOverlayInfoParcel.h) == null) {
            return;
        }
        lb3Var.K0();
    }

    @Override // defpackage.q61
    public final void i() {
        lb3 lb3Var;
        r();
        AdOverlayInfoParcel adOverlayInfoParcel = this.h;
        if (adOverlayInfoParcel != null && (lb3Var = adOverlayInfoParcel.h) != null) {
            lb3Var.Y();
        }
        if (!((Boolean) tu0.e.c.a(lx0.w5)).booleanValue() && this.i != null && (!this.g.isFinishing() || this.j == null)) {
            this.i.onPause();
        }
        B3();
    }

    @Override // defpackage.q61
    public final void j() {
        lb3 lb3Var;
        AdOverlayInfoParcel adOverlayInfoParcel = this.h;
        if (adOverlayInfoParcel == null || (lb3Var = adOverlayInfoParcel.h) == null) {
            return;
        }
        lb3Var.F1();
    }

    @Override // defpackage.q61
    public final void k() {
        lb3 lb3Var;
        AdOverlayInfoParcel adOverlayInfoParcel = this.h;
        if (adOverlayInfoParcel != null && (lb3Var = adOverlayInfoParcel.h) != null) {
            lb3Var.C1();
        }
        D3(this.g.getResources().getConfiguration());
        if (((Boolean) tu0.e.c.a(lx0.w5)).booleanValue()) {
            return;
        }
        md1 md1Var = this.i;
        if (md1Var == null || md1Var.l0()) {
            jn.T("The webview does not exist. Ignoring action.");
        } else {
            this.i.onResume();
        }
    }

    public final void r() {
        AdOverlayInfoParcel adOverlayInfoParcel = this.h;
        if (adOverlayInfoParcel != null && this.l) {
            I3(adOverlayInfoParcel.o);
        }
        if (this.m != null) {
            this.g.setContentView(this.q);
            this.w = true;
            this.m.removeAllViews();
            this.m = null;
        }
        WebChromeClient.CustomViewCallback customViewCallback = this.n;
        if (customViewCallback != null) {
            customViewCallback.onCustomViewHidden();
            this.n = null;
        }
        this.l = false;
    }

    @Override // defpackage.q61
    public final void u() {
        this.w = true;
    }

    @Override // defpackage.q61
    public final void x() {
        lb3 lb3Var;
        AdOverlayInfoParcel adOverlayInfoParcel = this.h;
        if (adOverlayInfoParcel != null && (lb3Var = adOverlayInfoParcel.h) != null) {
            lb3Var.i3();
        }
        md1 md1Var = this.i;
        if (md1Var != null) {
            try {
                this.q.removeView(md1Var.p0());
            } catch (NullPointerException unused) {
            }
        }
        B3();
    }

    public final void y() {
        this.B = 3;
        Activity activity = this.g;
        activity.finish();
        AdOverlayInfoParcel adOverlayInfoParcel = this.h;
        if (adOverlayInfoParcel == null || adOverlayInfoParcel.p != 5) {
            return;
        }
        activity.overridePendingTransition(0, 0);
        md1 md1Var = this.i;
        if (md1Var != null) {
            md1Var.m0(null);
        }
    }
}
