package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

/* JADX INFO: loaded from: classes.dex */
public final class eh0 extends bt0 {
    public final /* synthetic */ Context b;
    public final /* synthetic */ j41 c;

    public eh0(es0 es0Var, Context context, j41 j41Var) {
        this.b = context;
        this.c = j41Var;
    }

    @Override // defpackage.bt0
    public final /* bridge */ /* synthetic */ Object a() {
        return null;
    }

    @Override // defpackage.bt0
    public final Object b() {
        IInterface l61Var;
        Context context = this.b;
        ju juVar = new ju(context);
        try {
            try {
                IBinder iBinderB = yd.A(context).b("com.google.android.gms.ads.DynamiteOfflineUtilsCreatorImpl");
                int i = m61.f;
                if (iBinderB == null) {
                    l61Var = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = iBinderB.queryLocalInterface("com.google.android.gms.ads.internal.offline.IOfflineUtilsCreator");
                    l61Var = iInterfaceQueryLocalInterface instanceof n61 ? (n61) iInterfaceQueryLocalInterface : new l61(iBinderB, "com.google.android.gms.ads.internal.offline.IOfflineUtilsCreator", 2);
                }
                return ((l61) l61Var).Z0(juVar, this.c);
            } catch (Exception e) {
                throw new mb3(e);
            }
        } catch (RemoteException | NullPointerException | mb3 unused) {
            return null;
        }
    }

    @Override // defpackage.bt0
    public final Object c(oh1 oh1Var) {
        return oh1Var.s1(new ju(this.b), this.c, ModuleDescriptor.MODULE_VERSION);
    }
}
