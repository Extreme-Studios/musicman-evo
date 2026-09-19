package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;

/* JADX INFO: loaded from: classes.dex */
public final class cf1 implements r63 {
    public final /* synthetic */ int a;
    public final xe1 b;
    public final q63 c;

    public cf1(xe1 xe1Var, q63 q63Var) {
        this.a = 3;
        this.c = q63Var;
        this.b = xe1Var;
    }

    public bz1 a() {
        es1 es1Var = (es1) this.c.c();
        this.b.a();
        return new bz1(es1Var);
    }

    @Override // defpackage.v63
    public final Object c() {
        int i = this.a;
        q63 q63Var = this.c;
        xe1 xe1Var = this.b;
        switch (i) {
            case 0:
                try {
                    return q90.a(xe1Var.a()).d(((ApplicationInfo) q63Var.c()).packageName, 0);
                } catch (PackageManager.NameNotFoundException unused) {
                    return null;
                }
            case 1:
                return new id3(xe1Var.a(), (String) q63Var.c());
            case 2:
                ya1 ya1Var = za1.a;
                dq.D(ya1Var);
                return new g02(ya1Var, xe1Var.a(), (zt1) q63Var.c(), 4);
            case 3:
                return a();
            default:
                Context contextA = xe1Var.a();
                hs1 hs1Var = (hs1) q63Var.c();
                ya1 ya1Var2 = za1.a;
                dq.D(ya1Var2);
                return new x93(contextA, hs1Var, ya1Var2);
        }
    }

    public /* synthetic */ cf1(xe1 xe1Var, q63 q63Var, int i) {
        this.a = i;
        this.b = xe1Var;
        this.c = q63Var;
    }
}
