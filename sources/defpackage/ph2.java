package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* JADX INFO: loaded from: classes.dex */
public final class ph2 implements ServiceConnection {
    public final /* synthetic */ qx1 a;

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        qx1 qx1Var = this.a;
        ((wo2) qx1Var.i).d("LmdServiceConnectionManager.onServiceConnected(%s)", componentName);
        qx1Var.d(new u52(this, 7, iBinder));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        qx1 qx1Var = this.a;
        ((wo2) qx1Var.i).d("LmdServiceConnectionManager.onServiceDisconnected(%s)", componentName);
        qx1Var.d(new ly1(23, this));
    }
}
