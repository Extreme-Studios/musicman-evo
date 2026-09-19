package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import androidx.room.MultiInstanceInvalidationService;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes.dex */
public final class rs extends Binder implements IInterface {
    public final /* synthetic */ int f = 0;
    public final /* synthetic */ Object g;

    public rs(k30 k30Var) {
        this.g = k30Var;
        attachInterface(this, "com.google.android.gms.appset.internal.IAppSetIdCallback");
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        int i = this.f;
        return this;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        int i3 = 0;
        qm qmVar = null;
        qm qmVar2 = null;
        switch (this.f) {
            case 0:
                if (i == 1) {
                    parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
                    IBinder strongBinder = parcel.readStrongBinder();
                    if (strongBinder != null) {
                        IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("androidx.room.IMultiInstanceInvalidationCallback");
                        if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof qm)) {
                            qmVar = new qm();
                            qmVar.f = strongBinder;
                        } else {
                            qmVar = (qm) iInterfaceQueryLocalInterface;
                        }
                    }
                    String string = parcel.readString();
                    if (string != null) {
                        synchronized (((MultiInstanceInvalidationService) this.g).h) {
                            try {
                                MultiInstanceInvalidationService multiInstanceInvalidationService = (MultiInstanceInvalidationService) this.g;
                                int i4 = multiInstanceInvalidationService.f + 1;
                                multiInstanceInvalidationService.f = i4;
                                boolean zRegister = multiInstanceInvalidationService.h.register(qmVar, Integer.valueOf(i4));
                                MultiInstanceInvalidationService multiInstanceInvalidationService2 = (MultiInstanceInvalidationService) this.g;
                                if (zRegister) {
                                    multiInstanceInvalidationService2.g.put(Integer.valueOf(i4), string);
                                    i3 = i4;
                                } else {
                                    multiInstanceInvalidationService2.f--;
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        break;
                    }
                    parcel2.writeNoException();
                    parcel2.writeInt(i3);
                    return true;
                }
                if (i == 2) {
                    parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
                    IBinder strongBinder2 = parcel.readStrongBinder();
                    if (strongBinder2 != null) {
                        IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("androidx.room.IMultiInstanceInvalidationCallback");
                        if (iInterfaceQueryLocalInterface2 == null || !(iInterfaceQueryLocalInterface2 instanceof qm)) {
                            qmVar2 = new qm();
                            qmVar2.f = strongBinder2;
                        } else {
                            qmVar2 = (qm) iInterfaceQueryLocalInterface2;
                        }
                    }
                    int i5 = parcel.readInt();
                    synchronized (((MultiInstanceInvalidationService) this.g).h) {
                        ((MultiInstanceInvalidationService) this.g).h.unregister(qmVar2);
                        ((MultiInstanceInvalidationService) this.g).g.remove(Integer.valueOf(i5));
                        break;
                    }
                    parcel2.writeNoException();
                    return true;
                }
                if (i != 3) {
                    if (i != 1598968902) {
                        return super.onTransact(i, parcel, parcel2, i2);
                    }
                    parcel2.writeString("androidx.room.IMultiInstanceInvalidationService");
                    return true;
                }
                parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
                int i6 = parcel.readInt();
                String[] strArrCreateStringArray = parcel.createStringArray();
                synchronized (((MultiInstanceInvalidationService) this.g).h) {
                    try {
                        String str = (String) ((MultiInstanceInvalidationService) this.g).g.get(Integer.valueOf(i6));
                        if (str == null) {
                            Log.w("ROOM", "Remote invalidation client ID not registered");
                            return true;
                        }
                        int iBeginBroadcast = ((MultiInstanceInvalidationService) this.g).h.beginBroadcast();
                        while (true) {
                            qs qsVar = ((MultiInstanceInvalidationService) this.g).h;
                            if (i3 >= iBeginBroadcast) {
                                qsVar.finishBroadcast();
                                return true;
                            }
                            try {
                                Integer num = (Integer) qsVar.getBroadcastCookie(i3);
                                int iIntValue = num.intValue();
                                String str2 = (String) ((MultiInstanceInvalidationService) this.g).g.get(num);
                                if (i6 != iIntValue && str.equals(str2)) {
                                    try {
                                        ((qm) ((MultiInstanceInvalidationService) this.g).h.getBroadcastItem(i3)).T(strArrCreateStringArray);
                                    } catch (RemoteException e) {
                                        Log.w("ROOM", "Error invoking a remote callback", e);
                                    }
                                }
                                i3++;
                            } catch (Throwable th2) {
                                ((MultiInstanceInvalidationService) this.g).h.finishBroadcast();
                                throw th2;
                            }
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                break;
            default:
                if (i > 16777215) {
                    if (!super.onTransact(i, parcel, parcel2, i2)) {
                    }
                    return true;
                }
                parcel.enforceInterface(getInterfaceDescriptor());
                if (i != 1) {
                    return false;
                }
                Parcelable.Creator<Status> creator = Status.CREATOR;
                int i7 = n91.a;
                Status statusCreateFromParcel = parcel.readInt() == 0 ? null : creator.createFromParcel(parcel);
                v91 v91VarCreateFromParcel = parcel.readInt() == 0 ? null : v91.CREATOR.createFromParcel(parcel);
                b7 b7Var = v91VarCreateFromParcel != null ? new b7(v91VarCreateFromParcel.f, v91VarCreateFromParcel.g) : null;
                ve3 ve3Var = ((k30) this.g).a;
                if (statusCreateFromParcel.f <= 0) {
                    ve3Var.e(b7Var);
                } else {
                    ve3Var.d(new v3(statusCreateFromParcel));
                }
                return true;
        }
    }

    public rs(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.g = multiInstanceInvalidationService;
        attachInterface(this, "androidx.room.IMultiInstanceInvalidationService");
    }
}
