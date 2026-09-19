package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class wx0 extends od {
    public final AtomicBoolean b = new AtomicBoolean(false);
    public Context c;
    public es1 d;
    public u40 e;
    public nd f;

    @Override // defpackage.od
    public final void a(nd ndVar) {
        this.f = ndVar;
        try {
            ((nm) ndVar.a).O0();
        } catch (RemoteException unused) {
        }
        this.e = ndVar.b(new vx0(this));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f = null;
        this.e = null;
    }
}
