package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.widget.FrameLayout;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class kq0 extends bt0 {
    public final /* synthetic */ gt b;
    public final /* synthetic */ FrameLayout c;
    public final /* synthetic */ Context d;
    public final /* synthetic */ es0 e;

    public kq0(es0 es0Var, gt gtVar, FrameLayout frameLayout, Context context) {
        this.b = gtVar;
        this.c = frameLayout;
        this.d = context;
        Objects.requireNonNull(es0Var);
        this.e = es0Var;
    }

    @Override // defpackage.bt0
    public final Object a() {
        es0.D(this.d, "native_ad_view_delegate");
        return new d82();
    }

    @Override // defpackage.bt0
    public final Object b() {
        IInterface f01Var;
        Context context = this.d;
        lx0.a(context);
        boolean zBooleanValue = ((Boolean) tu0.e.c.a(lx0.wb)).booleanValue();
        es0 es0Var = this.e;
        FrameLayout frameLayout = this.c;
        gt gtVar = this.b;
        if (!zBooleanValue) {
            e11 e11Var = (e11) es0Var.i;
            try {
                ju juVar = new ju(context);
                ju juVar2 = new ju(gtVar);
                ju juVar3 = new ju(frameLayout);
                f01 f01Var2 = (f01) ((h01) e11Var.h(context));
                Parcel parcelU = f01Var2.U();
                kt0.e(parcelU, juVar);
                kt0.e(parcelU, juVar2);
                kt0.e(parcelU, juVar3);
                parcelU.writeInt(ModuleDescriptor.MODULE_VERSION);
                Parcel parcelY = f01Var2.Y(parcelU, 1);
                IBinder strongBinder = parcelY.readStrongBinder();
                parcelY.recycle();
                if (strongBinder == null) {
                    return null;
                }
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
                return iInterfaceQueryLocalInterface instanceof e01 ? (e01) iInterfaceQueryLocalInterface : new c01(strongBinder);
            } catch (RemoteException e) {
                e = e;
                jn.V("Could not create remote NativeAdViewDelegate.", e);
                return null;
            } catch (xw e2) {
                e = e2;
                jn.V("Could not create remote NativeAdViewDelegate.", e);
                return null;
            }
        }
        try {
            ju juVar4 = new ju(context);
            ju juVar5 = new ju(gtVar);
            ju juVar6 = new ju(frameLayout);
            try {
                IBinder iBinderB = yd.A(context).b("com.google.android.gms.ads.ChimeraNativeAdViewDelegateCreatorImpl");
                int i = g01.f;
                if (iBinderB == null) {
                    f01Var = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface2 = iBinderB.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegateCreator");
                    f01Var = iInterfaceQueryLocalInterface2 instanceof h01 ? (h01) iInterfaceQueryLocalInterface2 : new f01(iBinderB);
                }
                f01 f01Var3 = (f01) f01Var;
                Parcel parcelU2 = f01Var3.U();
                kt0.e(parcelU2, juVar4);
                kt0.e(parcelU2, juVar5);
                kt0.e(parcelU2, juVar6);
                parcelU2.writeInt(ModuleDescriptor.MODULE_VERSION);
                Parcel parcelY2 = f01Var3.Y(parcelU2, 1);
                IBinder strongBinder2 = parcelY2.readStrongBinder();
                parcelY2.recycle();
                int i2 = d01.f;
                if (strongBinder2 == null) {
                    return null;
                }
                IInterface iInterfaceQueryLocalInterface3 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
                return iInterfaceQueryLocalInterface3 instanceof e01 ? (e01) iInterfaceQueryLocalInterface3 : new c01(strongBinder2);
            } catch (Exception e3) {
                throw new mb3(e3);
            }
        } catch (RemoteException | NullPointerException | mb3 e4) {
            f71 f71VarA = e71.a(context);
            es0Var.getClass();
            f71VarA.c("ClientApiBroker.createNativeAdViewDelegate", e4);
            return null;
        }
    }

    @Override // defpackage.bt0
    public final Object c(oh1 oh1Var) {
        return oh1Var.y1(new ju(this.b), new ju(this.c));
    }
}
