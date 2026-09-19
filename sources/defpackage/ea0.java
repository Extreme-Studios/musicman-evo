package defpackage;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes.dex */
public abstract class ea0 {
    public final int a;

    public ea0(int i) {
        this.a = i;
    }

    public static Status g(RemoteException remoteException) {
        return new Status(19, remoteException.getClass().getSimpleName() + ": " + remoteException.getLocalizedMessage(), null, null);
    }

    public abstract boolean a(z90 z90Var);

    public abstract ei[] b(z90 z90Var);

    public abstract void c(Status status);

    public abstract void d(Exception exc);

    public abstract void e(z90 z90Var);

    public abstract void f(us2 us2Var, boolean z);
}
