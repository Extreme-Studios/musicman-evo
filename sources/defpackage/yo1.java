package defpackage;

import android.os.Parcel;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class yo1 extends jt0 implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, np1 {
    public final WeakReference f;
    public final HashMap g;
    public final HashMap h;
    public final HashMap i;
    public no1 j;
    public final rt0 k;

    public yo1(View view, HashMap map, HashMap map2) {
        ViewTreeObserver viewTreeObserver;
        super("com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegate");
        this.g = new HashMap();
        this.h = new HashMap();
        this.i = new HashMap();
        view.setOnTouchListener(this);
        view.setOnClickListener(this);
        zf0 zf0Var = vc3.C.B;
        fb1 fb1Var = new fb1(view, this);
        View view2 = (View) ((WeakReference) fb1Var.f).get();
        ViewTreeObserver viewTreeObserver2 = null;
        ViewTreeObserver viewTreeObserver3 = (view2 == null || (viewTreeObserver3 = view2.getViewTreeObserver()) == null || !viewTreeObserver3.isAlive()) ? null : viewTreeObserver3;
        if (viewTreeObserver3 != null) {
            fb1Var.R1(viewTreeObserver3);
        }
        gb1 gb1Var = new gb1(view, this);
        View view3 = (View) ((WeakReference) gb1Var.f).get();
        if (view3 != null && (viewTreeObserver = view3.getViewTreeObserver()) != null && viewTreeObserver.isAlive()) {
            viewTreeObserver2 = viewTreeObserver;
        }
        if (viewTreeObserver2 != null) {
            gb1Var.R1(viewTreeObserver2);
        }
        this.f = new WeakReference(view);
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            View view4 = (View) entry.getValue();
            if (view4 != null) {
                this.g.put(str, new WeakReference(view4));
                if (!"1098".equals(str) && !"3011".equals(str)) {
                    view4.setOnTouchListener(this);
                    view4.setClickable(true);
                    view4.setOnClickListener(this);
                }
            }
        }
        this.i.putAll(this.g);
        for (Map.Entry entry2 : map2.entrySet()) {
            View view5 = (View) entry2.getValue();
            if (view5 != null) {
                this.h.put((String) entry2.getKey(), new WeakReference(view5));
                view5.setOnTouchListener(this);
                view5.setClickable(false);
            }
        }
        this.i.putAll(this.h);
        this.k = new rt0(view.getContext(), view);
    }

    @Override // defpackage.jt0
    public final boolean A3(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            rm rmVarO0 = ju.O0(parcel.readStrongBinder());
            kt0.f(parcel);
            synchronized (this) {
                Object objZ0 = ju.Z0(rmVarO0);
                if (objZ0 instanceof no1) {
                    no1 no1Var = this.j;
                    if (no1Var != null) {
                        no1Var.r(this);
                    }
                    no1 no1Var2 = (no1) objZ0;
                    if (no1Var2.p.b()) {
                        this.j = no1Var2;
                        no1Var2.q(this);
                        this.j.f(Z0());
                    } else {
                        jn.M("Your account must be enabled to use this feature. Talk to your account manager to request this feature for your account.");
                    }
                } else {
                    jn.T("Not an instance of InternalNativeAd. This is most likely a transient error");
                }
            }
        } else if (i == 2) {
            synchronized (this) {
                no1 no1Var3 = this.j;
                if (no1Var3 != null) {
                    no1Var3.r(this);
                    this.j = null;
                }
            }
        } else {
            if (i != 3) {
                return false;
            }
            rm rmVarO1 = ju.O0(parcel.readStrongBinder());
            kt0.f(parcel);
            synchronized (this) {
                try {
                    if (this.j != null) {
                        Object objZ1 = ju.Z0(rmVarO1);
                        if (!(objZ1 instanceof View)) {
                            jn.T("Calling NativeAdViewHolderNonagonDelegate.setClickConfirmingView with wrong wrapped object");
                        }
                        no1 no1Var4 = this.j;
                        View view = (View) objZ1;
                        synchronized (no1Var4) {
                            no1Var4.n.g(view);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        parcel2.writeNoException();
        return true;
    }

    @Override // defpackage.np1
    public final FrameLayout O0() {
        return null;
    }

    @Override // defpackage.np1
    public final synchronized void Y1(View view, String str) {
        this.i.put(str, new WeakReference(view));
        if (!"1098".equals(str) && !"3011".equals(str)) {
            this.g.put(str, new WeakReference(view));
            view.setClickable(true);
            view.setOnClickListener(this);
            view.setOnTouchListener(this);
        }
    }

    @Override // defpackage.np1
    public final View Z0() {
        return (View) this.f.get();
    }

    @Override // defpackage.np1
    public final rt0 f() {
        return this.k;
    }

    @Override // defpackage.np1
    public final synchronized Map g() {
        return this.i;
    }

    @Override // defpackage.np1
    public final synchronized Map i() {
        return this.h;
    }

    @Override // defpackage.np1
    public final synchronized Map k() {
        return this.g;
    }

    @Override // defpackage.np1
    public final synchronized JSONObject n() {
        JSONObject jSONObjectH;
        no1 no1Var = this.j;
        if (no1Var == null) {
            return null;
        }
        View viewZ0 = Z0();
        Map mapG = g();
        Map mapK = k();
        synchronized (no1Var) {
            jSONObjectH = no1Var.n.h(viewZ0, mapG, mapK, no1Var.k());
        }
        return jSONObjectH;
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // defpackage.np1
    public final synchronized String o() {
        return "1007";
    }

    @Override // android.view.View.OnClickListener
    public final synchronized void onClick(View view) {
        no1 no1Var = this.j;
        if (no1Var != null) {
            no1Var.s(view, Z0(), g(), k(), true);
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final synchronized void onGlobalLayout() {
        no1 no1Var = this.j;
        if (no1Var != null) {
            no1Var.t(Z0(), g(), k(), no1.d(Z0()));
        }
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final synchronized void onScrollChanged() {
        no1 no1Var = this.j;
        if (no1Var != null) {
            no1Var.t(Z0(), g(), k(), no1.d(Z0()));
        }
    }

    @Override // android.view.View.OnTouchListener
    public final synchronized boolean onTouch(View view, MotionEvent motionEvent) {
        no1 no1Var = this.j;
        if (no1Var != null) {
            View viewZ0 = Z0();
            synchronized (no1Var) {
                no1Var.n.u(viewZ0, motionEvent);
            }
        }
        return false;
    }

    @Override // defpackage.np1
    public final synchronized rm p() {
        return null;
    }

    @Override // defpackage.np1
    public final synchronized JSONObject q() {
        return null;
    }

    @Override // defpackage.np1
    public final synchronized View y3(String str) {
        WeakReference weakReference = (WeakReference) this.i.get(str);
        if (weakReference == null) {
            return null;
        }
        return (View) weakReference.get();
    }
}
