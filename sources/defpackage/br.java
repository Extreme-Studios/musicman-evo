package defpackage;

import android.os.RemoteException;
import android.widget.FrameLayout;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes.dex */
public final class br extends FrameLayout {
    public boolean f;
    public oc2 g;
    public ImageView.ScaleType h;
    public boolean i;
    public dr0 j;

    public xq getMediaContent() {
        return null;
    }

    public void setImageScaleType(ImageView.ScaleType scaleType) {
        this.i = true;
        this.h = scaleType;
        dr0 dr0Var = this.j;
        if (dr0Var != null) {
            dr0Var.o(scaleType);
        }
    }

    public void setMediaContent(xq xqVar) {
        boolean zQ0;
        this.f = true;
        oc2 oc2Var = this.g;
        if (oc2Var != null) {
            oc2Var.mo3a();
        }
        if (xqVar == null) {
            return;
        }
        try {
            n01 n01VarC = xqVar.c();
            if (n01VarC != null) {
                if (!xqVar.d()) {
                    if (xqVar.a()) {
                        zQ0 = n01VarC.q0(new ju(this));
                    }
                    removeAllViews();
                }
                zQ0 = n01VarC.C(new ju(this));
                if (zQ0) {
                    return;
                }
                removeAllViews();
            }
        } catch (RemoteException e) {
            removeAllViews();
            jn.P("", e);
        }
    }
}
