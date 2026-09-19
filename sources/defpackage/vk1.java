package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public final class vk1 extends x90 {
    public a8 g;
    public final int h;

    public vk1(a8 a8Var, int i) {
        super("com.google.android.gms.common.internal.IGmsCallbacks");
        this.g = a8Var;
        this.h = i;
    }

    @Override // defpackage.x90
    public final boolean K0(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            int i2 = parcel.readInt();
            IBinder strongBinder = parcel.readStrongBinder();
            Bundle bundle = (Bundle) o91.a(parcel, Bundle.CREATOR);
            o91.b(parcel);
            dq.g(this.g, "onPostInitComplete can be called only once per call to getRemoteService");
            a8 a8Var = this.g;
            int i3 = this.h;
            a8Var.getClass();
            i32 i32Var = new i32(a8Var, i2, strongBinder, bundle);
            ps0 ps0Var = a8Var.f;
            ps0Var.sendMessage(ps0Var.obtainMessage(1, i3, -1, i32Var));
            this.g = null;
        } else if (i == 2) {
            parcel.readInt();
            o91.b(parcel);
            Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
        } else {
            if (i != 3) {
                return false;
            }
            int i4 = parcel.readInt();
            IBinder strongBinder2 = parcel.readStrongBinder();
            w73 w73Var = (w73) o91.a(parcel, w73.CREATOR);
            o91.b(parcel);
            a8 a8Var2 = this.g;
            dq.g(a8Var2, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
            dq.f(w73Var);
            a8Var2.v = w73Var;
            if (a8Var2 instanceof sk1) {
                eb ebVar = w73Var.i;
                zx zxVarO = zx.o();
                ay ayVar = ebVar == null ? null : ebVar.f;
                synchronized (zxVarO) {
                    try {
                        if (ayVar == null) {
                            ayVar = zx.i;
                        } else {
                            ay ayVar2 = (ay) zxVarO.g;
                            if (ayVar2 == null || ayVar2.f < ayVar.f) {
                            }
                        }
                        zxVarO.g = ayVar;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            Bundle bundle2 = w73Var.f;
            dq.g(this.g, "onPostInitComplete can be called only once per call to getRemoteService");
            a8 a8Var3 = this.g;
            int i5 = this.h;
            a8Var3.getClass();
            i32 i32Var2 = new i32(a8Var3, i4, strongBinder2, bundle2);
            ps0 ps0Var2 = a8Var3.f;
            ps0Var2.sendMessage(ps0Var2.obtainMessage(1, i5, -1, i32Var2));
            this.g = null;
        }
        parcel2.writeNoException();
        return true;
    }
}
