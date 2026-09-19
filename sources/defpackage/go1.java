package defpackage;

import android.graphics.drawable.Drawable;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes.dex */
public final class go1 extends jt0 implements yz0 {
    public final ro1 f;
    public rm g;

    public go1(ro1 ro1Var) {
        super("com.google.android.gms.ads.internal.formats.client.IMediaContent");
        this.f = ro1Var;
    }

    public static float B3(rm rmVar) {
        Drawable drawable;
        if (rmVar == null || (drawable = (Drawable) ju.Z0(rmVar)) == null || drawable.getIntrinsicWidth() == -1 || drawable.getIntrinsicHeight() == -1) {
            return 0.0f;
        }
        return drawable.getIntrinsicWidth() / drawable.getIntrinsicHeight();
    }

    @Override // defpackage.jt0
    public final boolean A3(int i, Parcel parcel, Parcel parcel2) {
        float f;
        eg egVarX;
        int i2;
        int i3;
        int i4;
        u01 u01Var;
        md1 md1Var;
        float fM = 0.0f;
        switch (i) {
            case 2:
                ro1 ro1Var = this.f;
                synchronized (ro1Var) {
                    f = ro1Var.x;
                }
                if (f != 0.0f) {
                    synchronized (ro1Var) {
                        fM = ro1Var.x;
                    }
                } else if (ro1Var.r() != null) {
                    try {
                        fM = ro1Var.r().m();
                    } catch (RemoteException e) {
                        jn.P("Remote exception getting video controller aspect ratio.", e);
                    }
                    break;
                } else {
                    rm rmVar = this.g;
                    if (rmVar != null) {
                        fM = B3(rmVar);
                    } else if (!((Boolean) tu0.e.c.a(lx0.fd)).booleanValue() || ro1Var.i() == null || (egVarX = ro1Var.i().x()) == null || (i2 = egVarX.c) < 0 || (i3 = egVarX.b) <= 0) {
                        a01 a01VarB = ro1Var.b();
                        if (a01VarB != null) {
                            float fB = (a01VarB.b() == -1 || a01VarB.d() == -1) ? 0.0f : a01VarB.b() / a01VarB.d();
                            fM = fB == 0.0f ? B3(a01VarB.c()) : fB;
                        }
                    } else {
                        fM = i2 / i3;
                    }
                }
                parcel2.writeNoException();
                parcel2.writeFloat(fM);
                return true;
            case 3:
                rm rmVarO0 = ju.O0(parcel.readStrongBinder());
                kt0.f(parcel);
                this.g = rmVarO0;
                parcel2.writeNoException();
                return true;
            case 4:
                rm rmVarE = e();
                parcel2.writeNoException();
                kt0.e(parcel2, rmVarE);
                return true;
            case 5:
                ro1 ro1Var2 = this.f;
                fM = ro1Var2.r() != null ? ro1Var2.r().g() : 0.0f;
                parcel2.writeNoException();
                parcel2.writeFloat(fM);
                return true;
            case 6:
                ro1 ro1Var3 = this.f;
                fM = ro1Var3.r() != null ? ro1Var3.r().k() : 0.0f;
                parcel2.writeNoException();
                parcel2.writeFloat(fM);
                return true;
            case 7:
                hv1 hv1VarR = this.f.r();
                parcel2.writeNoException();
                kt0.e(parcel2, hv1VarR);
                return true;
            case 8:
                i4 = this.f.r() != null ? 1 : 0;
                parcel2.writeNoException();
                ClassLoader classLoader = kt0.a;
                parcel2.writeInt(i4);
                return true;
            case 9:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder == null) {
                    u01Var = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnMediaContentChangedListener");
                    u01Var = iInterfaceQueryLocalInterface instanceof u01 ? (u01) iInterfaceQueryLocalInterface : new u01(strongBinder, "com.google.android.gms.ads.internal.formats.client.IOnMediaContentChangedListener", 2);
                }
                kt0.f(parcel);
                ro1 ro1Var4 = this.f;
                if (ro1Var4.r() instanceof fe1) {
                    fe1 fe1Var = (fe1) ro1Var4.r();
                    synchronized (fe1Var.g) {
                        fe1Var.s = u01Var;
                        break;
                    }
                }
                parcel2.writeNoException();
                return true;
            case 10:
                ro1 ro1Var5 = this.f;
                synchronized (ro1Var5) {
                    md1Var = ro1Var5.j;
                }
                i4 = md1Var != null ? 1 : 0;
                parcel2.writeNoException();
                ClassLoader classLoader2 = kt0.a;
                parcel2.writeInt(i4);
                return true;
            default:
                return false;
        }
    }

    @Override // defpackage.yz0
    public final rm e() {
        rm rmVar = this.g;
        if (rmVar != null) {
            return rmVar;
        }
        a01 a01VarB = this.f.b();
        if (a01VarB == null) {
            return null;
        }
        return a01VarB.c();
    }
}
