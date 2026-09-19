package defpackage;

import android.content.Context;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.gms.ads.nativead.NativeAd;

/* JADX INFO: loaded from: classes.dex */
public final class gt extends FrameLayout {
    public final FrameLayout f;
    public final e01 g;

    public gt(Context context) {
        e01 e01Var;
        super(context);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(frameLayout);
        this.f = frameLayout;
        if (isInEditMode()) {
            e01Var = null;
        } else {
            es0 es0Var = ut0.f.b;
            Context context2 = frameLayout.getContext();
            es0Var.getClass();
            e01Var = (e01) new kq0(es0Var, this, frameLayout, context2).d(context2, false);
        }
        this.g = e01Var;
    }

    public final View a(String str) {
        e01 e01Var = this.g;
        if (e01Var != null) {
            try {
                rm rmVarO = e01Var.O(str);
                if (rmVarO != null) {
                    return (View) ju.Z0(rmVarO);
                }
            } catch (RemoteException e) {
                jn.P("Unable to call getAssetView on delegate", e);
            }
        }
        return null;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        super.bringChildToFront(this.f);
    }

    public final void b(View view, String str) {
        e01 e01Var = this.g;
        if (e01Var == null) {
            return;
        }
        try {
            e01Var.X0(new ju(view), str);
        } catch (RemoteException e) {
            jn.P("Unable to call setAssetView on delegate", e);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void bringChildToFront(View view) {
        super.bringChildToFront(view);
        FrameLayout frameLayout = this.f;
        if (frameLayout != view) {
            super.bringChildToFront(frameLayout);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        e01 e01Var = this.g;
        if (e01Var != null) {
            if (((Boolean) tu0.e.c.a(lx0.oc)).booleanValue()) {
                try {
                    e01Var.F0(new ju(motionEvent));
                } catch (RemoteException e) {
                    jn.P("Unable to call handleTouchEvent on delegate", e);
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public f2 getAdChoicesView() {
        a("3011");
        return null;
    }

    public final View getAdvertiserView() {
        return a("3005");
    }

    public final View getBodyView() {
        return a("3004");
    }

    public final View getCallToActionView() {
        return a("3002");
    }

    public final View getHeadlineView() {
        return a("3001");
    }

    public final View getIconView() {
        return a("3003");
    }

    public final View getImageView() {
        return a("3008");
    }

    public final br getMediaView() {
        View viewA = a("3010");
        if (viewA instanceof br) {
            return (br) viewA;
        }
        if (viewA == null) {
            return null;
        }
        jn.F("View is not an instance of MediaView");
        return null;
    }

    public final View getPriceView() {
        return a("3007");
    }

    public final View getStarRatingView() {
        return a("3009");
    }

    public final View getStoreView() {
        return a("3006");
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        e01 e01Var = this.g;
        if (e01Var == null) {
            return;
        }
        try {
            e01Var.d0(new ju(view), i);
        } catch (RemoteException e) {
            jn.P("Unable to call onVisibilityChanged on delegate", e);
        }
    }

    @Override // android.view.ViewGroup
    public final void removeAllViews() {
        super.removeAllViews();
        addView(this.f);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        if (this.f == view) {
            return;
        }
        super.removeView(view);
    }

    public void setAdChoicesView(f2 f2Var) {
        b(f2Var, "3011");
    }

    public final void setAdvertiserView(View view) {
        b(view, "3005");
    }

    public final void setBodyView(View view) {
        b(view, "3004");
    }

    public final void setCallToActionView(View view) {
        b(view, "3002");
    }

    public final void setClickConfirmingView(View view) {
        e01 e01Var = this.g;
        if (e01Var == null) {
            return;
        }
        try {
            e01Var.L(new ju(view));
        } catch (RemoteException e) {
            jn.P("Unable to call setClickConfirmingView on delegate", e);
        }
    }

    public final void setHeadlineView(View view) {
        b(view, "3001");
    }

    public final void setIconView(View view) {
        b(view, "3003");
    }

    public final void setImageView(View view) {
        b(view, "3008");
    }

    public final void setMediaView(br brVar) {
        b(brVar, "3010");
        if (brVar == null) {
            return;
        }
        oc2 oc2Var = new oc2(12, this);
        synchronized (brVar) {
            brVar.g = oc2Var;
            if (brVar.f) {
                oc2Var.mo3a();
            }
        }
        dr0 dr0Var = new dr0(9, this);
        synchronized (brVar) {
            brVar.j = dr0Var;
            if (brVar.i) {
                dr0Var.o(brVar.h);
            }
        }
    }

    public void setNativeAd(NativeAd nativeAd) {
        e01 e01Var = this.g;
        if (e01Var == null) {
            return;
        }
        try {
            e01Var.N0(nativeAd.d());
        } catch (RemoteException e) {
            jn.P("Unable to call setNativeAd on delegate", e);
        }
    }

    public final void setPriceView(View view) {
        b(view, "3007");
    }

    public final void setStarRatingView(View view) {
        b(view, "3009");
    }

    public final void setStoreView(View view) {
        b(view, "3006");
    }
}
