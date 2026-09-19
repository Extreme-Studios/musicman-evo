package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class pf0 extends bt0 {
    public final /* synthetic */ Context b;
    public final /* synthetic */ j41 c;

    public pf0(es0 es0Var, Context context, j41 j41Var) {
        this.b = context;
        this.c = j41Var;
        Objects.requireNonNull(es0Var);
    }

    @Override // defpackage.bt0
    public final /* bridge */ /* synthetic */ Object a() {
        return null;
    }

    @Override // defpackage.bt0
    public final Object b() {
        IInterface ja1Var;
        Context context = this.b;
        ju juVar = new ju(context);
        try {
            try {
                IBinder iBinderB = yd.A(context).b("com.google.android.gms.ads.DynamiteSignalGeneratorCreatorImpl");
                int i = ka1.f;
                if (iBinderB == null) {
                    ja1Var = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = iBinderB.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalGeneratorCreator");
                    ja1Var = iInterfaceQueryLocalInterface instanceof la1 ? (la1) iInterfaceQueryLocalInterface : new ja1(iBinderB, "com.google.android.gms.ads.internal.signals.ISignalGeneratorCreator", 2);
                }
                return ((ja1) ja1Var).Z0(juVar, this.c);
            } catch (Exception e) {
                throw new mb3(e);
            }
        } catch (RemoteException | NullPointerException | mb3 unused) {
            return null;
        }
    }

    @Override // defpackage.bt0
    public final Object c(oh1 oh1Var) {
        return oh1Var.d2(new ju(this.b), this.c, ModuleDescriptor.MODULE_VERSION);
    }
}
