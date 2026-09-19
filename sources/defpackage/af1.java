package defpackage;

import android.os.RemoteException;

/* JADX INFO: loaded from: classes.dex */
public final class af1 implements r63 {
    public final xe1 a;

    public af1(xe1 xe1Var) {
        this.a = xe1Var;
    }

    @Override // defpackage.v63
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final String c() {
        s32 liteSdkVersion;
        vj1 vj1Var = (vj1) r52.y(this.a.a()).h;
        if (vj1Var != null) {
            try {
                liteSdkVersion = vj1Var.getLiteSdkVersion();
            } catch (RemoteException unused) {
                liteSdkVersion = null;
            }
        } else {
            liteSdkVersion = null;
        }
        if (liteSdkVersion != null) {
            return liteSdkVersion.h;
        }
        return null;
    }
}
