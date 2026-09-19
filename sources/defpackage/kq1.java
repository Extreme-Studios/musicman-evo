package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class kq1 extends jt0 implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, IInterface {
    public View f;
    public hv1 g;
    public no1 h;
    public boolean i;
    public boolean j;

    @Override // defpackage.jt0
    public final boolean A3(int i, Parcel parcel, Parcel parcel2) {
        po1 po1Var;
        hv1 hv1Var = null;
        yz0Var = null;
        yz0Var = null;
        yz0 yz0Var = null;
        c31 b31Var = null;
        if (i == 3) {
            dq.d("#008 Must be called on the main UI thread.");
            if (this.i) {
                jn.M("getVideoController: Instream ad should not be used after destroyed");
            } else {
                hv1Var = this.g;
            }
            parcel2.writeNoException();
            kt0.e(parcel2, hv1Var);
        } else if (i == 4) {
            dq.d("#008 Must be called on the main UI thread.");
            C3();
            no1 no1Var = this.h;
            if (no1Var != null) {
                no1Var.o();
            }
            this.h = null;
            this.f = null;
            this.g = null;
            this.i = true;
            parcel2.writeNoException();
        } else if (i == 5) {
            rm rmVarO0 = ju.O0(parcel.readStrongBinder());
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder != null) {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.instream.client.IInstreamAdCallback");
                b31Var = iInterfaceQueryLocalInterface instanceof c31 ? (c31) iInterfaceQueryLocalInterface : new b31(strongBinder, "com.google.android.gms.ads.internal.instream.client.IInstreamAdCallback", 2);
            }
            kt0.f(parcel);
            B3(rmVarO0, b31Var);
            parcel2.writeNoException();
        } else if (i == 6) {
            rm rmVarO1 = ju.O0(parcel.readStrongBinder());
            kt0.f(parcel);
            dq.d("#008 Must be called on the main UI thread.");
            B3(rmVarO1, new jq1("com.google.android.gms.ads.internal.instream.client.IInstreamAdCallback"));
            parcel2.writeNoException();
        } else {
            if (i != 7) {
                return false;
            }
            dq.d("#008 Must be called on the main UI thread.");
            if (this.i) {
                jn.M("getVideoController: Instream ad should not be used after destroyed");
            } else {
                no1 no1Var2 = this.h;
                if (no1Var2 != null && (po1Var = no1Var2.F) != null) {
                    synchronized (po1Var) {
                        yz0Var = po1Var.a;
                    }
                }
            }
            parcel2.writeNoException();
            kt0.e(parcel2, yz0Var);
        }
        return true;
    }

    public final void B3(rm rmVar, c31 c31Var) {
        ViewTreeObserver viewTreeObserver;
        ViewTreeObserver viewTreeObserver2;
        dq.d("#008 Must be called on the main UI thread.");
        if (this.i) {
            jn.M("Instream ad can not be shown after destroy().");
            try {
                c31Var.t(2);
                return;
            } catch (RemoteException e) {
                jn.Z("#007 Could not call remote method.", e);
                return;
            }
        }
        View view = this.f;
        if (view == null || this.g == null) {
            jn.M("Instream internal error: ".concat(view == null ? "can not get video view." : "can not get video controller."));
            try {
                c31Var.t(0);
                return;
            } catch (RemoteException e2) {
                jn.Z("#007 Could not call remote method.", e2);
                return;
            }
        }
        if (this.j) {
            jn.M("Instream ad should not be used again.");
            try {
                c31Var.t(1);
                return;
            } catch (RemoteException e3) {
                jn.Z("#007 Could not call remote method.", e3);
                return;
            }
        }
        this.j = true;
        C3();
        ((ViewGroup) ju.Z0(rmVar)).addView(this.f, new ViewGroup.LayoutParams(-1, -1));
        zf0 zf0Var = vc3.C.B;
        fb1 fb1Var = new fb1(this.f, this);
        View view2 = (View) ((WeakReference) fb1Var.f).get();
        ViewTreeObserver viewTreeObserver3 = null;
        if (view2 == null || (viewTreeObserver = view2.getViewTreeObserver()) == null || !viewTreeObserver.isAlive()) {
            viewTreeObserver = null;
        }
        if (viewTreeObserver != null) {
            fb1Var.R1(viewTreeObserver);
        }
        gb1 gb1Var = new gb1(this.f, this);
        View view3 = (View) ((WeakReference) gb1Var.f).get();
        if (view3 != null && (viewTreeObserver2 = view3.getViewTreeObserver()) != null && viewTreeObserver2.isAlive()) {
            viewTreeObserver3 = viewTreeObserver2;
        }
        if (viewTreeObserver3 != null) {
            gb1Var.R1(viewTreeObserver3);
        }
        D3();
        try {
            c31Var.b();
        } catch (RemoteException e4) {
            jn.Z("#007 Could not call remote method.", e4);
        }
    }

    public final void C3() {
        View view = this.f;
        if (view == null) {
            return;
        }
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.f);
        }
    }

    public final void D3() {
        View view;
        no1 no1Var = this.h;
        if (no1Var == null || (view = this.f) == null) {
            return;
        }
        Map map = Collections.EMPTY_MAP;
        no1Var.t(view, map, map, no1.d(view));
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        D3();
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        D3();
    }
}
