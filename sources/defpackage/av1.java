package defpackage;

import android.content.Context;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public final class av1 implements pl1 {
    public final Context f;
    public final aa1 g;

    public av1(Context context, aa1 aa1Var) {
        this.f = context;
        this.g = aa1Var;
    }

    @Override // defpackage.pl1
    public final void A(e52 e52Var) {
        String str = ((z42) e52Var.b.h).e;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        aa1 aa1Var = this.g;
        Context context = this.f;
        aa1Var.getClass();
        if (((Boolean) tu0.e.c.a(lx0.A0)).booleanValue() && aa1Var.a(context) && aa1.g(context)) {
            synchronized (aa1Var.i) {
            }
        }
        aa1Var.h(context, "_aq", str, null);
    }

    @Override // defpackage.pl1
    public final void E0(r71 r71Var) {
    }
}
