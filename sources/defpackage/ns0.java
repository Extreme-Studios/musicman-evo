package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class ns0 {
    public final Context a;
    public final uk1 b;
    public final long c;
    public final ScheduledExecutorService d;
    public final PackageInfo e;

    public ns0(Context context, long j, PackageInfo packageInfo, uk1 uk1Var, ScheduledExecutorService scheduledExecutorService) {
        this.a = context;
        this.c = j;
        this.e = packageInfo;
        this.b = uk1Var;
        this.d = scheduledExecutorService;
    }

    public static final void b(int i, Bundle bundle) {
        if (((Boolean) tu0.e.c.a(lx0.a8)).booleanValue()) {
            ec.q(vc3.C.k, bundle, ec.a(i));
        }
    }

    public static final void c(int i, Bundle bundle) {
        bundle.putBoolean("sod_h", false);
        bundle.putInt("cmr", i - 1);
    }

    public final boolean a() {
        return this.b.d().size() >= ((Integer) tu0.e.c.a(lx0.Z7)).intValue();
    }
}
