package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.ads.OutOfContextTestingActivity;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class ce0 extends bt0 {
    public final /* synthetic */ OutOfContextTestingActivity b;
    public final /* synthetic */ j41 c;

    public ce0(es0 es0Var, OutOfContextTestingActivity outOfContextTestingActivity, j41 j41Var) {
        this.b = outOfContextTestingActivity;
        this.c = j41Var;
        Objects.requireNonNull(es0Var);
    }

    @Override // defpackage.bt0
    public final /* bridge */ /* synthetic */ Object a() {
        es0.D(this.b, "out_of_context_tester");
        return null;
    }

    @Override // defpackage.bt0
    public final Object b() {
        us1 us1Var;
        OutOfContextTestingActivity outOfContextTestingActivity = this.b;
        ju juVar = new ju(outOfContextTestingActivity);
        lx0.a(outOfContextTestingActivity);
        if (((Boolean) tu0.e.c.a(lx0.ha)).booleanValue()) {
            try {
                try {
                    IBinder iBinderB = yd.A(outOfContextTestingActivity).b("com.google.android.gms.ads.DynamiteOutOfContextTesterCreatorImpl");
                    if (iBinderB == null) {
                        us1Var = null;
                    } else {
                        IInterface iInterfaceQueryLocalInterface = iBinderB.queryLocalInterface("com.google.android.gms.ads.internal.client.IOutOfContextTesterCreator");
                        us1Var = iInterfaceQueryLocalInterface instanceof us1 ? (us1) iInterfaceQueryLocalInterface : new us1(iBinderB, "com.google.android.gms.ads.internal.client.IOutOfContextTesterCreator", 2);
                    }
                    return us1Var.Z0(juVar, this.c);
                } catch (Exception e) {
                    throw new mb3(e);
                }
            } catch (RemoteException e2) {
                e = e2;
                e71.a(outOfContextTestingActivity).c("ClientApiBroker.getOutOfContextTester", e);
                return null;
            } catch (NullPointerException e3) {
                e = e3;
                e71.a(outOfContextTestingActivity).c("ClientApiBroker.getOutOfContextTester", e);
                return null;
            } catch (mb3 e4) {
                e = e4;
                e71.a(outOfContextTestingActivity).c("ClientApiBroker.getOutOfContextTester", e);
                return null;
            }
        }
        return null;
    }

    @Override // defpackage.bt0
    public final Object c(oh1 oh1Var) {
        OutOfContextTestingActivity outOfContextTestingActivity = this.b;
        ju juVar = new ju(outOfContextTestingActivity);
        lx0.a(outOfContextTestingActivity);
        if (((Boolean) tu0.e.c.a(lx0.ha)).booleanValue()) {
            return oh1Var.a1(juVar, this.c, ModuleDescriptor.MODULE_VERSION);
        }
        return null;
    }
}
