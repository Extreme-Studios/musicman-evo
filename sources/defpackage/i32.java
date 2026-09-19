package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public final class i32 extends db0 {
    public final IBinder g;
    public final /* synthetic */ a8 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i32(a8 a8Var, int i, IBinder iBinder, Bundle bundle) {
        super(a8Var, i, bundle);
        this.h = a8Var;
        this.g = iBinder;
    }

    @Override // defpackage.db0
    public final void a(db dbVar) {
        y7 y7Var = this.h.p;
        if (y7Var != null) {
            y7Var.U(dbVar);
        }
        System.currentTimeMillis();
    }

    @Override // defpackage.db0
    public final boolean b() {
        IBinder iBinder = this.g;
        try {
            dq.f(iBinder);
            String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            a8 a8Var = this.h;
            if (!a8Var.u().equals(interfaceDescriptor)) {
                Log.w("GmsClient", "service descriptor mismatch: " + a8Var.u() + " vs. " + interfaceDescriptor);
                return false;
            }
            IInterface iInterfaceN = a8Var.n(iBinder);
            if (iInterfaceN == null || !(a8.x(a8Var, 2, 4, iInterfaceN) || a8.x(a8Var, 3, 4, iInterfaceN))) {
                return false;
            }
            a8Var.t = null;
            x7 x7Var = a8Var.o;
            if (x7Var == null) {
                return true;
            }
            x7Var.Y();
            return true;
        } catch (RemoteException unused) {
            Log.w("GmsClient", "service probably died");
            return false;
        }
    }
}
