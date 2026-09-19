package defpackage;

import android.content.Context;
import android.content.Intent;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class c02 implements m22 {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;

    public c02(d60 d60Var, ya1 ya1Var) {
        this.a = 2;
        this.c = d60Var;
        this.b = ya1Var;
    }

    @Override // defpackage.m22
    public final hp a() {
        int i = this.a;
        Object obj = null;
        boolean z = false;
        z = false;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                ((ae) obj3).getClass();
                return na1.t(new d02((i52) obj2, System.currentTimeMillis()));
            case 1:
                if (((Boolean) tu0.e.c.a(lx0.j3)).booleanValue()) {
                    return na1.t(new m02(z ? 1 : 0, obj));
                }
                return na1.M(((sa1) obj2).h(), lh0.n, (Executor) obj3);
            case 2:
                return ((ya1) obj3).b(new br0(13, this));
            case 3:
                return ((ya1) obj3).b(new br0(19, this));
            case 4:
                jn.p("HsdpMigrationSignal.produce");
                if (!((Boolean) tu0.e.c.a(lx0.Dd)).booleanValue()) {
                    return na1.t(new n12(null, 1));
                }
                try {
                    if (((Intent) obj2).resolveActivity(((Context) obj3).getPackageManager()) != null) {
                        jn.p("HSDP intent is supported");
                        z = true;
                    }
                } catch (Exception e) {
                    vc3.C.h.d("HsdpMigrationSignal.isHsdpMigrationSupported", e);
                }
                return na1.t(new n12(Boolean.valueOf(z), 1));
            case 5:
                return ((ya1) obj3).b(new br0(21, this));
            case 6:
                return ((ya1) obj3).b(new br0(23, this));
            case 7:
                Executor executor = (Executor) obj3;
                return na1.J(na1.M(na1.t((String) obj2), lh0.p, executor), Throwable.class, new r21(11, this), executor);
            default:
                return ((ya1) obj3).b(new s22(2, this));
        }
    }

    @Override // defpackage.m22
    public final int c() {
        switch (this.a) {
            case 0:
                return 4;
            case 1:
                return 10;
            case 2:
                return 54;
            case 3:
                return 21;
            case 4:
                return 60;
            case 5:
                return 23;
            case 6:
                return 62;
            case 7:
                return 41;
            default:
                return 48;
        }
    }

    public /* synthetic */ c02(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }
}
