package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;

/* JADX INFO: loaded from: classes.dex */
public final class x91 implements r63 {
    public final /* synthetic */ int a;
    public final xe1 b;

    public /* synthetic */ x91(xe1 xe1Var, int i) {
        this.a = i;
        this.b = xe1Var;
    }

    @Override // defpackage.v63
    public final Object c() {
        int i = this.a;
        xe1 xe1Var = this.b;
        switch (i) {
            case 0:
                return new v81(xe1Var.a());
            case 1:
                ApplicationInfo applicationInfo = xe1Var.a().getApplicationInfo();
                dq.D(applicationInfo);
                return applicationInfo;
            case 2:
                return new ma2(xe1Var.a(), vc3.C.t.c());
            case 3:
                return r52.y(xe1Var.a());
            case 4:
                return new gt1(xe1Var.a());
            case 5:
                return new yt1(xe1Var.a());
            case 6:
                return new uk1(xe1Var.a());
            case 7:
                Context contextA = xe1Var.a();
                ya1 ya1Var = za1.a;
                dq.D(ya1Var);
                return new bw1(contextA, ya1Var);
            case 8:
                ya1 ya1Var2 = za1.a;
                dq.D(ya1Var2);
                return new k02(ya1Var2, xe1Var.a(), 2);
            case 9:
                Context contextA2 = xe1Var.a();
                ya1 ya1Var3 = za1.a;
                dq.D(ya1Var3);
                return new k02(contextA2, ya1Var3, 6);
            default:
                return new a32(xe1Var.a());
        }
    }
}
