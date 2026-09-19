package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class rg1 implements Runnable {
    public final /* synthetic */ int f;
    public final /* synthetic */ sg1 g;
    public final /* synthetic */ Throwable h;

    public /* synthetic */ rg1(sg1 sg1Var, Throwable th, int i) {
        this.f = i;
        this.g = sg1Var;
        this.h = th;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f;
        Throwable th = this.h;
        sg1 sg1Var = this.g;
        switch (i) {
            case 0:
                boolean zBooleanValue = ((Boolean) tu0.e.c.a(lx0.db)).booleanValue();
                Context context = sg1Var.a;
                if (!zBooleanValue) {
                    e71.a(context).c("AttributionReportingSampled", th);
                } else {
                    e71.d(context).c("AttributionReporting", th);
                }
                break;
            default:
                boolean zBooleanValue2 = ((Boolean) tu0.e.c.a(lx0.db)).booleanValue();
                Context context2 = sg1Var.a;
                if (!zBooleanValue2) {
                    e71.a(context2).c("AttributionReportingSampled.getUpdatedUrlAndRegisterSource", th);
                } else {
                    e71.d(context2).c("AttributionReporting.getUpdatedUrlAndRegisterSource", th);
                }
                break;
        }
    }
}
