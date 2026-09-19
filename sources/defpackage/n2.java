package defpackage;

import android.os.RemoteException;

/* JADX INFO: loaded from: classes.dex */
public final class n2 extends w7 {
    public s2[] getAdSizes() {
        return this.f.g;
    }

    public v6 getAppEventListener() {
        return this.f.h;
    }

    public h60 getVideoController() {
        return this.f.c;
    }

    public j60 getVideoOptions() {
        return this.f.j;
    }

    public void setAdSizes(s2... s2VarArr) {
        if (s2VarArr == null || s2VarArr.length <= 0) {
            j7.p("The supported ad sizes must contain at least one valid ad size.");
        } else {
            this.f.d(s2VarArr);
        }
    }

    public void setAppEventListener(v6 v6Var) {
        this.f.e(v6Var);
    }

    public void setManualImpressionsEnabled(boolean z) {
        yy1 yy1Var = this.f;
        yy1Var.m = z;
        try {
            n71 n71Var = yy1Var.i;
            if (n71Var != null) {
                n71Var.i1(z);
            }
        } catch (RemoteException e) {
            jn.Z("#007 Could not call remote method.", e);
        }
    }

    public void setVideoOptions(j60 j60Var) {
        yy1 yy1Var = this.f;
        yy1Var.j = j60Var;
        try {
            n71 n71Var = yy1Var.i;
            if (n71Var != null) {
                n71Var.K2(j60Var == null ? null : new ee2(j60Var));
            }
        } catch (RemoteException e) {
            jn.Z("#007 Could not call remote method.", e);
        }
    }
}
