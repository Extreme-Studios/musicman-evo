package defpackage;

import android.content.Context;
import com.google.android.gms.ads.internal.ClientApi;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class u82 {
    public final Context a;
    public final d60 b;
    public final ScheduledExecutorService c;
    public final ClientApi d = new ClientApi();
    public final r52 e;
    public final ae f;

    public u82(Context context, d60 d60Var, ScheduledExecutorService scheduledExecutorService, r52 r52Var, ae aeVar) {
        this.a = context;
        this.b = d60Var;
        this.c = scheduledExecutorService;
        this.f = aeVar;
        this.e = r52Var;
    }

    public static l82 c() {
        ix0 ix0Var = lx0.D;
        tu0 tu0Var = tu0.e;
        return new l82(((Long) tu0Var.c.a(ix0Var)).longValue(), ((Long) tu0Var.c.a(lx0.E)).longValue());
    }

    public final k82 a(ab2 ab2Var, bb1 bb1Var) {
        h2 h2VarA = h2.a(ab2Var.g);
        if (h2VarA == null) {
            return null;
        }
        int iOrdinal = h2VarA.ordinal();
        Context context = this.a;
        d60 d60Var = this.b;
        if (iOrdinal == 1) {
            return new k82(this.d, context, d60Var.h, this.e, ab2Var, bb1Var, this.c, c(), this.f, 1);
        }
        if (iOrdinal == 2) {
            return new k82(this.d, context, d60Var.h, this.e, ab2Var, bb1Var, this.c, c(), this.f, 2);
        }
        if (iOrdinal != 5) {
            return null;
        }
        return new k82(this.d, context, d60Var.h, this.e, ab2Var, bb1Var, this.c, c(), this.f, 0);
    }

    public final k82 b(String str, ab2 ab2Var, kc1 kc1Var) {
        h2 h2VarA = h2.a(ab2Var.g);
        if (h2VarA == null) {
            return null;
        }
        int iOrdinal = h2VarA.ordinal();
        Context context = this.a;
        d60 d60Var = this.b;
        if (iOrdinal == 1) {
            return new k82(str, this.d, context, d60Var.h, this.e, ab2Var, kc1Var, this.c, c(), this.f, 1);
        }
        if (iOrdinal == 2) {
            return new k82(str, this.d, context, d60Var.h, this.e, ab2Var, kc1Var, this.c, c(), this.f, 2);
        }
        if (iOrdinal != 5) {
            return null;
        }
        return new k82(str, this.d, context, d60Var.h, this.e, ab2Var, kc1Var, this.c, c(), this.f, 0);
    }
}
