package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: loaded from: classes.dex */
public abstract class od implements ServiceConnection {
    public Context a;

    public abstract void a(nd ndVar);

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        pm pmVar;
        if (this.a == null) {
            j7.e("Custom Tabs Service connected before an applicationcontext has been provided.");
            return;
        }
        int i = om.f;
        if (iBinder == null) {
            pmVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(pm.b);
            if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof pm)) {
                nm nmVar = new nm();
                nmVar.f = iBinder;
                pmVar = nmVar;
            } else {
                pmVar = (pm) iInterfaceQueryLocalInterface;
            }
        }
        a(new nd(pmVar, componentName));
    }
}
