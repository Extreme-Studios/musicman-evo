package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.text.TextUtils;
import android.util.Base64;
import android.util.DisplayMetrics;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class zo1 extends d01 implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, np1 {
    public static final qk2 u;
    public final String g;
    public FrameLayout i;
    public FrameLayout j;
    public final ya1 k;
    public View l;
    public no1 n;
    public rt0 o;
    public yz0 q;
    public boolean r;
    public GestureDetector t;
    public HashMap h = new HashMap();
    public rm p = null;
    public boolean s = false;
    public final int m = ModuleDescriptor.MODULE_VERSION;

    static {
        tj2 tj2Var = vj2.g;
        Object[] objArr = {"2011", "1009", "3010"};
        dq.y(objArr, 3);
        u = vj2.o(objArr, 3);
    }

    public zo1(FrameLayout frameLayout, FrameLayout frameLayout2) {
        String str;
        ViewTreeObserver viewTreeObserver;
        ViewTreeObserver viewTreeObserver2 = null;
        this.i = frameLayout;
        this.j = frameLayout2;
        String canonicalName = frameLayout.getClass().getCanonicalName();
        if ("com.google.android.gms.ads.formats.NativeContentAdView".equals(canonicalName)) {
            str = "1007";
        } else if ("com.google.android.gms.ads.formats.NativeAppInstallAdView".equals(canonicalName)) {
            str = "2009";
        } else {
            "com.google.android.gms.ads.formats.UnifiedNativeAdView".equals(canonicalName);
            str = "3012";
        }
        this.g = str;
        zf0 zf0Var = vc3.C.B;
        fb1 fb1Var = new fb1(frameLayout, this);
        View view = (View) ((WeakReference) fb1Var.f).get();
        ViewTreeObserver viewTreeObserver3 = (view == null || (viewTreeObserver3 = view.getViewTreeObserver()) == null || !viewTreeObserver3.isAlive()) ? null : viewTreeObserver3;
        if (viewTreeObserver3 != null) {
            fb1Var.R1(viewTreeObserver3);
        }
        gb1 gb1Var = new gb1(frameLayout, this);
        View view2 = (View) ((WeakReference) gb1Var.f).get();
        if (view2 != null && (viewTreeObserver = view2.getViewTreeObserver()) != null && viewTreeObserver.isAlive()) {
            viewTreeObserver2 = viewTreeObserver;
        }
        if (viewTreeObserver2 != null) {
            gb1Var.R1(viewTreeObserver2);
        }
        this.k = za1.f;
        this.o = new rt0(this.i.getContext(), this.i);
        frameLayout.setOnTouchListener(this);
        frameLayout.setOnClickListener(this);
    }

    @Override // defpackage.e01
    public final synchronized void A1(rm rmVar) {
        if (this.s) {
            return;
        }
        this.p = rmVar;
    }

    public final synchronized void B3() {
        int iV;
        if (((Boolean) tu0.e.c.a(lx0.oc)).booleanValue()) {
            no1 no1Var = this.n;
            synchronized (no1Var) {
                iV = no1Var.n.v();
            }
            if (iV != 0) {
                this.t = new GestureDetector(this.i.getContext(), new dp1(this.n, this));
            }
        }
    }

    public final synchronized void C3(String str) {
        DisplayMetrics displayMetrics;
        try {
            View frameLayout = new FrameLayout(this.j.getContext());
            frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            Context context = this.j.getContext();
            frameLayout.setClickable(false);
            frameLayout.setFocusable(false);
            if (!TextUtils.isEmpty(str)) {
                if (context.getApplicationContext() != null) {
                    context = context.getApplicationContext();
                }
                Resources resources = context.getResources();
                if (resources != null && (displayMetrics = resources.getDisplayMetrics()) != null) {
                    try {
                        byte[] bArrDecode = Base64.decode(str, 0);
                        BitmapDrawable bitmapDrawable = new BitmapDrawable(BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length));
                        bitmapDrawable.setTargetDensity(displayMetrics.densityDpi);
                        Shader.TileMode tileMode = Shader.TileMode.REPEAT;
                        bitmapDrawable.setTileModeXY(tileMode, tileMode);
                        frameLayout.setBackground(bitmapDrawable);
                    } catch (IllegalArgumentException e) {
                        jn.V("Encountered invalid base64 watermark.", e);
                    }
                }
            }
            this.j.addView(frameLayout);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // defpackage.e01
    public final void F0(rm rmVar) {
        onTouch(this.i, (MotionEvent) ju.Z0(rmVar));
    }

    @Override // defpackage.e01
    public final synchronized void L(rm rmVar) {
        no1 no1Var = this.n;
        View view = (View) ju.Z0(rmVar);
        synchronized (no1Var) {
            no1Var.n.g(view);
        }
    }

    @Override // defpackage.e01
    public final synchronized void N0(rm rmVar) {
        if (this.s) {
            return;
        }
        Object objZ0 = ju.Z0(rmVar);
        if (!(objZ0 instanceof no1)) {
            jn.T("Not an instance of native engine. This is most likely a transient error");
            return;
        }
        no1 no1Var = this.n;
        if (no1Var != null) {
            no1Var.r(this);
        }
        synchronized (this) {
            this.k.execute(new va1(19, this));
            no1 no1Var2 = (no1) objZ0;
            this.n = no1Var2;
            no1Var2.q(this);
            this.n.f(this.i);
            no1 no1Var3 = this.n;
            FrameLayout frameLayout = this.j;
            qw1 qw1VarK = no1Var3.m.k();
            if (no1Var3.p.c() && qw1VarK != null && frameLayout != null) {
                el1 el1Var = vc3.C.x;
                x82 x82Var = qw1VarK.a;
                el1Var.getClass();
                el1.n(new lw1(x82Var, frameLayout, 0));
            }
            if (this.r) {
                po1 po1Var = this.n.F;
                yz0 yz0Var = this.q;
                synchronized (po1Var) {
                    po1Var.a = yz0Var;
                }
            }
            if (((Boolean) tu0.e.c.a(lx0.m4)).booleanValue() && !TextUtils.isEmpty(this.n.p.e())) {
                C3(this.n.p.e());
            }
            B3();
        }
    }

    @Override // defpackage.e01
    public final synchronized rm O(String str) {
        return new ju(y3(str));
    }

    @Override // defpackage.np1
    public final FrameLayout O0() {
        return this.j;
    }

    @Override // defpackage.e01
    public final synchronized void U2(yz0 yz0Var) {
        if (!this.s) {
            this.r = true;
            this.q = yz0Var;
            no1 no1Var = this.n;
            if (no1Var != null) {
                po1 po1Var = no1Var.F;
                synchronized (po1Var) {
                    po1Var.a = yz0Var;
                }
            }
        }
    }

    @Override // defpackage.e01
    public final synchronized void X0(rm rmVar, String str) {
        Y1((View) ju.Z0(rmVar), str);
    }

    @Override // defpackage.np1
    public final synchronized void Y1(View view, String str) {
        if (!this.s) {
            HashMap map = this.h;
            if (view == null) {
                map.remove(str);
                return;
            }
            map.put(str, new WeakReference(view));
            if (!"1098".equals(str) && !"3011".equals(str)) {
                if (rs0.r(this.m)) {
                    view.setOnTouchListener(this);
                }
                view.setClickable(true);
                view.setOnClickListener(this);
            }
        }
    }

    @Override // defpackage.np1
    public final /* synthetic */ View Z0() {
        return this.i;
    }

    @Override // defpackage.e01
    public final synchronized void b() {
        try {
            if (this.s) {
                return;
            }
            no1 no1Var = this.n;
            if (no1Var != null) {
                no1Var.r(this);
                this.n = null;
            }
            this.h.clear();
            this.i.removeAllViews();
            this.j.removeAllViews();
            this.h = null;
            this.i = null;
            this.j = null;
            this.l = null;
            this.o = null;
            this.s = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // defpackage.e01
    public final synchronized void d0(rm rmVar, int i) {
    }

    @Override // defpackage.np1
    public final rt0 f() {
        return this.o;
    }

    @Override // defpackage.np1
    public final synchronized Map g() {
        return this.h;
    }

    @Override // defpackage.np1
    public final synchronized Map i() {
        return null;
    }

    @Override // defpackage.np1
    public final synchronized Map k() {
        return this.h;
    }

    @Override // defpackage.np1
    public final synchronized JSONObject n() {
        JSONObject jSONObjectH;
        no1 no1Var = this.n;
        if (no1Var == null) {
            return null;
        }
        FrameLayout frameLayout = this.i;
        Map mapG = g();
        Map mapK = k();
        synchronized (no1Var) {
            jSONObjectH = no1Var.n.h(frameLayout, mapG, mapK, no1Var.k());
        }
        return jSONObjectH;
    }

    @Override // defpackage.np1
    public final synchronized String o() {
        return this.g;
    }

    @Override // android.view.View.OnClickListener
    public final synchronized void onClick(View view) {
        boolean zS;
        no1 no1Var = this.n;
        if (no1Var != null) {
            synchronized (no1Var) {
                zS = no1Var.n.s();
            }
            if (zS) {
                no1 no1Var2 = this.n;
                synchronized (no1Var2) {
                    no1Var2.n.x();
                }
                this.n.s(view, this.i, g(), k(), false);
            }
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final synchronized void onGlobalLayout() {
        no1 no1Var = this.n;
        if (no1Var != null) {
            FrameLayout frameLayout = this.i;
            no1Var.t(frameLayout, g(), k(), no1.d(frameLayout));
        }
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final synchronized void onScrollChanged() {
        no1 no1Var = this.n;
        if (no1Var != null) {
            FrameLayout frameLayout = this.i;
            no1Var.t(frameLayout, g(), k(), no1.d(frameLayout));
        }
    }

    @Override // android.view.View.OnTouchListener
    public final synchronized boolean onTouch(View view, MotionEvent motionEvent) {
        int iV;
        no1 no1Var = this.n;
        if (no1Var != null) {
            FrameLayout frameLayout = this.i;
            synchronized (no1Var) {
                no1Var.n.u(frameLayout, motionEvent);
            }
            if (((Boolean) tu0.e.c.a(lx0.oc)).booleanValue() && this.t != null) {
                no1 no1Var2 = this.n;
                synchronized (no1Var2) {
                    iV = no1Var2.n.v();
                }
                if (iV != 0) {
                    this.t.onTouchEvent(motionEvent);
                }
            }
        }
        return false;
    }

    @Override // defpackage.np1
    public final rm p() {
        return this.p;
    }

    @Override // defpackage.np1
    public final synchronized JSONObject q() {
        JSONObject jSONObjectM;
        no1 no1Var = this.n;
        if (no1Var == null) {
            return null;
        }
        FrameLayout frameLayout = this.i;
        Map mapG = g();
        Map mapK = k();
        synchronized (no1Var) {
            jSONObjectM = no1Var.n.m(frameLayout, mapG, mapK, no1Var.k());
        }
        return jSONObjectM;
    }

    @Override // defpackage.np1
    public final synchronized View y3(String str) {
        WeakReference weakReference;
        if (!this.s && (weakReference = (WeakReference) this.h.get(str)) != null) {
            return (View) weakReference.get();
        }
        return null;
    }
}
