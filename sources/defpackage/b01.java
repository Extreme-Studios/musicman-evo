package defpackage;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes.dex */
public final class b01 {
    public final a01 a;
    public final Drawable b;
    public final Uri c;
    public final double d;
    public final int e;
    public final int f;

    public b01(a01 a01Var) {
        Drawable drawable;
        double dL;
        int iB;
        this.a = a01Var;
        Uri uriH = null;
        try {
            rm rmVarC = a01Var.c();
            drawable = rmVarC != null ? (Drawable) ju.Z0(rmVarC) : null;
        } catch (RemoteException e) {
            jn.P("", e);
        }
        this.b = drawable;
        try {
            uriH = this.a.h();
        } catch (RemoteException e2) {
            jn.P("", e2);
        }
        this.c = uriH;
        try {
            dL = this.a.l();
        } catch (RemoteException e3) {
            jn.P("", e3);
            dL = 1.0d;
        }
        this.d = dL;
        int iD = -1;
        try {
            iB = this.a.b();
        } catch (RemoteException e4) {
            jn.P("", e4);
            iB = -1;
        }
        this.e = iB;
        try {
            iD = this.a.d();
        } catch (RemoteException e5) {
            jn.P("", e5);
        }
        this.f = iD;
    }
}
