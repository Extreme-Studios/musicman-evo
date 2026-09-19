package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.mediation.customevent.CustomEventAdapter;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;

/* JADX INFO: loaded from: classes.dex */
public final class j41 extends jt0 implements l41 {
    public j41() {
        super("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
    }

    public static l41 B3(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
        return iInterfaceQueryLocalInterface instanceof l41 ? (l41) iInterfaceQueryLocalInterface : new k41(iBinder, "com.google.android.gms.ads.internal.mediation.client.IAdapterCreator", 2);
    }

    @Override // defpackage.jt0
    public final boolean A3(int i, Parcel parcel, Parcel parcel2) throws RemoteException {
        if (i == 1) {
            String string = parcel.readString();
            kt0.f(parcel);
            n41 n41VarW = w(string);
            parcel2.writeNoException();
            kt0.e(parcel2, n41VarW);
            return true;
        }
        if (i == 2) {
            String string2 = parcel.readString();
            kt0.f(parcel);
            boolean zO = O(string2);
            parcel2.writeNoException();
            parcel2.writeInt(zO ? 1 : 0);
            return true;
        }
        if (i == 3) {
            String string3 = parcel.readString();
            kt0.f(parcel);
            s51 s51VarF = F(string3);
            parcel2.writeNoException();
            kt0.e(parcel2, s51VarF);
            return true;
        }
        if (i != 4) {
            return false;
        }
        String string4 = parcel.readString();
        kt0.f(parcel);
        boolean zI = I(string4);
        parcel2.writeNoException();
        parcel2.writeInt(zI ? 1 : 0);
        return true;
    }

    @Override // defpackage.l41
    public final s51 F(String str) throws RemoteException {
        try {
            return new w51((RtbAdapter) Class.forName(str, false, v51.class.getClassLoader()).getDeclaredConstructor(null).newInstance(null));
        } catch (Throwable unused) {
            j7.n();
            return null;
        }
    }

    @Override // defpackage.l41
    public final boolean I(String str) {
        try {
            return t2.class.isAssignableFrom(Class.forName(str, false, j41.class.getClassLoader()));
        } catch (Throwable unused) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 104);
            sb.append("Could not load custom event implementation class as Adapter: ");
            sb.append(str);
            sb.append(", assuming old custom event implementation.");
            jn.T(sb.toString());
            return false;
        }
    }

    @Override // defpackage.l41
    public final boolean O(String str) {
        try {
            return zc.class.isAssignableFrom(Class.forName(str, false, j41.class.getClassLoader()));
        } catch (Throwable unused) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 88);
            sb.append("Could not load custom event implementation class: ");
            sb.append(str);
            sb.append(", trying Adapter implementation class.");
            jn.T(sb.toString());
            return false;
        }
    }

    @Override // defpackage.l41
    public final n41 w(String str) throws RemoteException {
        try {
            try {
                Class<?> cls = Class.forName(str, false, j41.class.getClassLoader());
                if (fr.class.isAssignableFrom(cls)) {
                    return new b51((fr) cls.getDeclaredConstructor(null).newInstance(null));
                }
                if (t2.class.isAssignableFrom(cls)) {
                    return new b51((t2) cls.getDeclaredConstructor(null).newInstance(null));
                }
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 64);
                sb.append("Could not instantiate mediation adapter: ");
                sb.append(str);
                sb.append(" (not a valid adapter).");
                jn.T(sb.toString());
                throw new RemoteException();
            } catch (Throwable unused) {
                jn.F("Reflection failed, retrying using direct instantiation");
                if ("com.google.ads.mediation.admob.AdMobAdapter".equals(str)) {
                    return new b51(new AdMobAdapter());
                }
                if ("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
                    return new b51(new CustomEventAdapter());
                }
                j7.n();
                return null;
            }
        } catch (Throwable th) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 43);
            sb2.append("Could not instantiate mediation adapter: ");
            sb2.append(str);
            sb2.append(". ");
            jn.V(sb2.toString(), th);
            j7.n();
            return null;
        }
    }
}
