package defpackage;

import android.content.Context;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class we1 implements r63 {
    public final /* synthetic */ int a;
    public final ue1 b;

    public /* synthetic */ we1(ue1 ue1Var, int i) {
        this.a = i;
        this.b = ue1Var;
    }

    @Override // defpackage.v63
    public final Object c() {
        int i = this.a;
        ue1 ue1Var = this.b;
        switch (i) {
            case 0:
                return new te1(ue1Var.b, ue1Var.a);
            case 1:
                Context context = ue1Var.b;
                dq.D(context);
                return context;
            case 2:
                WeakReference weakReference = ue1Var.d;
                dq.D(weakReference);
                return weakReference;
            case 3:
                return new kz0(ue1Var.b);
            case 4:
                return new y73(ue1Var.b, ue1Var.a);
            case 5:
                String strE = vc3.C.c.E(ue1Var.b, ue1Var.a.f);
                dq.D(strE);
                return strE;
            default:
                return Long.valueOf(ue1Var.c);
        }
    }
}
