package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class v42 extends jt0 {
    public final s42 f;
    public final p42 g;
    public final f52 h;
    public cr1 i;
    public boolean j;

    public v42(s42 s42Var, p42 p42Var, f52 f52Var) {
        super("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd");
        this.j = false;
        this.f = s42Var;
        this.g = p42Var;
        this.h = f52Var;
    }

    public final synchronized void A0(rm rmVar) {
        dq.d("pause must be called on the main UI thread.");
        if (this.i != null) {
            Context context = rmVar == null ? null : (Context) ju.Z0(rmVar);
            nk1 nk1Var = this.i.c;
            nk1Var.getClass();
            nk1Var.L1(new kz0(context));
        }
    }

    /* JADX WARN: Code duplicated, block: B:158:0x022e A[Catch: all -> 0x0222, TryCatch #2 {all -> 0x0222, blocks: (B:147:0x0203, B:151:0x021b, B:157:0x0225, B:158:0x022e, B:160:0x0234, B:164:0x0248), top: B:174:0x0203, inners: #4 }] */
    /* JADX WARN: Code duplicated, block: B:160:0x0234 A[Catch: all -> 0x0222, TRY_LEAVE, TryCatch #2 {all -> 0x0222, blocks: (B:147:0x0203, B:151:0x021b, B:157:0x0225, B:158:0x022e, B:160:0x0234, B:164:0x0248), top: B:174:0x0203, inners: #4 }] */
    /* JADX WARN: Code duplicated, block: B:162:0x0246 A[DONT_GENERATE] */
    @Override // defpackage.jt0
    public final boolean A3(int i, Parcel parcel, Parcel parcel2) {
        String str;
        x81 x81Var;
        Bundle bundle;
        md1 md1Var;
        cr1 cr1Var;
        y71 y71Var = null;
        zj1Var = null;
        zj1 zj1Var = null;
        x71 x71Var = null;
        if (i == 1) {
            c81 c81Var = (c81) kt0.b(parcel, c81.CREATOR);
            kt0.f(parcel);
            synchronized (this) {
                try {
                    dq.d("loadAd must be called on the main UI thread.");
                    String str2 = c81Var.g;
                    String str3 = (String) tu0.e.c.a(lx0.S5);
                    if (str3 == null || str2 == null) {
                        if (C3()) {
                            if (!((Boolean) tu0.e.c.a(lx0.U5)).booleanValue()) {
                            }
                        }
                        q42 q42Var = new q42(20);
                        this.i = null;
                        s42 s42Var = this.f;
                        s42Var.h.o.g = 1;
                        s42Var.a(c81Var.f, c81Var.g, q42Var, new rz1(2, this));
                    } else {
                        try {
                            if (!Pattern.matches(str3, str2)) {
                                if (C3()) {
                                    if (!((Boolean) tu0.e.c.a(lx0.U5)).booleanValue()) {
                                    }
                                }
                                q42 q42Var2 = new q42(20);
                                this.i = null;
                                s42 s42Var2 = this.f;
                                s42Var2.h.o.g = 1;
                                s42Var2.a(c81Var.f, c81Var.g, q42Var2, new rz1(2, this));
                            }
                        } catch (RuntimeException e) {
                            vc3.C.h.d("NonagonUtil.isPatternMatched", e);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            parcel2.writeNoException();
            return true;
        }
        if (i == 2) {
            synchronized (this) {
                b3(null);
            }
            parcel2.writeNoException();
            return true;
        }
        if (i == 3) {
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder != null) {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
                y71Var = iInterfaceQueryLocalInterface instanceof y71 ? (y71) iInterfaceQueryLocalInterface : new y71(strongBinder);
            }
            kt0.f(parcel);
            dq.d("setRewardedVideoAdListener can only be called from the UI thread.");
            this.g.j.set(y71Var);
            parcel2.writeNoException();
            return true;
        }
        if (i == 34) {
            boolean zA = kt0.a(parcel);
            kt0.f(parcel);
            synchronized (this) {
                dq.d("setImmersiveMode must be called on the main UI thread.");
                this.j = zA;
            }
            parcel2.writeNoException();
            return true;
        }
        int i2 = 0;
        switch (i) {
            case 5:
                dq.d("isLoaded must be called on the main UI thread.");
                boolean zC3 = C3();
                parcel2.writeNoException();
                ClassLoader classLoader = kt0.a;
                parcel2.writeInt(zC3 ? 1 : 0);
                return true;
            case 6:
                A0(null);
                parcel2.writeNoException();
                return true;
            case 7:
                p1(null);
                parcel2.writeNoException();
                return true;
            case 8:
                B3(null);
                parcel2.writeNoException();
                return true;
            case 9:
                rm rmVarO0 = ju.O0(parcel.readStrongBinder());
                kt0.f(parcel);
                A0(rmVarO0);
                parcel2.writeNoException();
                return true;
            case 10:
                rm rmVarO1 = ju.O0(parcel.readStrongBinder());
                kt0.f(parcel);
                p1(rmVarO1);
                parcel2.writeNoException();
                return true;
            case 11:
                rm rmVarO2 = ju.O0(parcel.readStrongBinder());
                kt0.f(parcel);
                B3(rmVarO2);
                parcel2.writeNoException();
                return true;
            case 12:
                synchronized (this) {
                    cr1 cr1Var2 = this.i;
                    str = cr1Var2 != null ? cr1Var2.f.f : null;
                    break;
                }
                parcel2.writeNoException();
                parcel2.writeString(str);
                return true;
            case 13:
                String string = parcel.readString();
                kt0.f(parcel);
                synchronized (this) {
                    dq.d("setUserId must be called on the main UI thread.");
                    this.h.a = string;
                }
                parcel2.writeNoException();
                return true;
            case 14:
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 == null) {
                    x81Var = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdMetadataListener");
                    x81Var = iInterfaceQueryLocalInterface2 instanceof x81 ? (x81) iInterfaceQueryLocalInterface2 : new x81(strongBinder2, "com.google.android.gms.ads.internal.client.IAdMetadataListener", 2);
                }
                kt0.f(parcel);
                dq.d("setAdMetadataListener can only be called from the UI thread.");
                p42 p42Var = this.g;
                if (x81Var == null) {
                    p42Var.g.set(null);
                } else {
                    p42Var.g.set(new t42(this, x81Var, 1));
                }
                parcel2.writeNoException();
                return true;
            case 15:
                dq.d("getAdMetadata can only be called from the UI thread.");
                cr1 cr1Var3 = this.i;
                if (cr1Var3 != null) {
                    bl1 bl1Var = cr1Var3.q;
                    synchronized (bl1Var) {
                        bundle = new Bundle(bl1Var.h);
                    }
                } else {
                    bundle = new Bundle();
                }
                parcel2.writeNoException();
                kt0.d(parcel2, bundle);
                return true;
            case 16:
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedAdSkuListener");
                    x71Var = iInterfaceQueryLocalInterface3 instanceof x71 ? (x71) iInterfaceQueryLocalInterface3 : new x71(strongBinder3, "com.google.android.gms.ads.internal.reward.client.IRewardedAdSkuListener", 2);
                }
                kt0.f(parcel);
                dq.d("#008 Must be called on the main UI thread.: setRewardedAdSkuListener");
                this.g.l.set(x71Var);
                parcel2.writeNoException();
                return true;
            case 17:
                parcel.readString();
                kt0.f(parcel);
                parcel2.writeNoException();
                return true;
            case 18:
                rm rmVarO3 = ju.O0(parcel.readStrongBinder());
                kt0.f(parcel);
                b3(rmVarO3);
                parcel2.writeNoException();
                return true;
            case 19:
                String string2 = parcel.readString();
                kt0.f(parcel);
                synchronized (this) {
                    dq.d("#008 Must be called on the main UI thread.: setCustomData");
                    this.h.b = string2;
                }
                parcel2.writeNoException();
                return true;
            case 20:
                cr1 cr1Var4 = this.i;
                if (cr1Var4 != null && (md1Var = (md1) cr1Var4.m.get()) != null && !md1Var.h0()) {
                    i2 = 1;
                }
                parcel2.writeNoException();
                ClassLoader classLoader2 = kt0.a;
                parcel2.writeInt(i2);
                return true;
            case zw0.zzm /* 21 */:
                synchronized (this) {
                    if (((Boolean) tu0.e.c.a(lx0.d7)).booleanValue() && (cr1Var = this.i) != null) {
                        zj1Var = cr1Var.f;
                    }
                    break;
                }
                parcel2.writeNoException();
                kt0.e(parcel2, zj1Var);
                return true;
            default:
                return false;
        }
    }

    public final synchronized void B3(rm rmVar) {
        dq.d("destroy must be called on the main UI thread.");
        Context context = null;
        this.g.g.set(null);
        if (this.i != null) {
            if (rmVar != null) {
                context = (Context) ju.Z0(rmVar);
            }
            nk1 nk1Var = this.i.c;
            nk1Var.getClass();
            nk1Var.L1(new iv(context));
        }
    }

    public final synchronized boolean C3() {
        cr1 cr1Var = this.i;
        return (cr1Var == null || cr1Var.r.g.get()) ? false : true;
    }

    public final synchronized void b3(rm rmVar) {
        try {
            dq.d("showAd must be called on the main UI thread.");
            if (this.i != null) {
                Activity activity = null;
                if (rmVar != null) {
                    Object objZ0 = ju.Z0(rmVar);
                    if (objZ0 instanceof Activity) {
                        activity = (Activity) objZ0;
                    }
                }
                this.i.c(activity, this.j);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void p1(rm rmVar) {
        dq.d("resume must be called on the main UI thread.");
        if (this.i != null) {
            Context context = rmVar == null ? null : (Context) ju.Z0(rmVar);
            nk1 nk1Var = this.i.c;
            nk1Var.getClass();
            nk1Var.L1(new n92(context, 3));
        }
    }
}
