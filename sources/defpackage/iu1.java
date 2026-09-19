package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: loaded from: classes.dex */
public final class iu1 implements ServiceConnection {
    public final int a;
    public final /* synthetic */ a8 b;

    public iu1(a8 a8Var, int i) {
        this.b = a8Var;
        this.a = i;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        int i;
        int i2;
        a8 a8Var = this.b;
        if (iBinder == null) {
            synchronized (a8Var.g) {
                i = a8Var.n;
            }
            if (i == 3) {
                a8Var.u = true;
                i2 = 5;
            } else {
                i2 = 4;
            }
            ps0 ps0Var = a8Var.f;
            ps0Var.sendMessage(ps0Var.obtainMessage(i2, a8Var.w.get(), 16));
            return;
        }
        synchronized (a8Var.h) {
            try {
                a8 a8Var2 = this.b;
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                a8Var2.i = (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof ld0)) ? new ld0(iBinder) : (ld0) iInterfaceQueryLocalInterface;
            } catch (Throwable th) {
                throw th;
            }
        }
        a8 a8Var3 = this.b;
        int i3 = this.a;
        ae2 ae2Var = new ae2(a8Var3, 0);
        ps0 ps0Var2 = a8Var3.f;
        ps0Var2.sendMessage(ps0Var2.obtainMessage(7, i3, -1, ae2Var));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        a8 a8Var;
        synchronized (this.b.h) {
            a8Var = this.b;
            a8Var.i = null;
        }
        int i = this.a;
        ps0 ps0Var = a8Var.f;
        ps0Var.sendMessage(ps0Var.obtainMessage(6, i, 1));
    }
}
