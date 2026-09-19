package defpackage;

import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public final class qt extends gb {
    public static final String e = yp.f("NetworkMeteredCtrlr");

    @Override // defpackage.gb
    public final boolean a(j90 j90Var) {
        return j90Var.j.a == 5;
    }

    @Override // defpackage.gb
    public final boolean b(Object obj) {
        st stVar = (st) obj;
        if (Build.VERSION.SDK_INT >= 26) {
            return (stVar.a && stVar.c) ? false : true;
        }
        yp.d().a(e, "Metered network constraint is not supported before API 26, only checking for connected state.", new Throwable[0]);
        return !stVar.a;
    }
}
