package defpackage;

import android.content.Context;
import android.util.Range;

/* JADX INFO: loaded from: classes.dex */
public final class xb0 {
    public final Context a;
    public final gc0 b;
    public ac0 c;
    public boolean d;
    public ig e;
    public boolean f;
    public long g = 15000;
    public final hc0 h;

    public xb0(Context context, gc0 gc0Var) {
        this.a = context.getApplicationContext();
        this.b = gc0Var;
        hc0 hc0Var = new hc0();
        Range range = new Range(Double.valueOf(0.0d), Double.valueOf(1.0d));
        hc0Var.d = range;
        hc0Var.c = ((Double) range.getUpper()).doubleValue();
        hc0Var.a = -9223372036854775807L;
        hc0Var.b = -9223372036854775807L;
        this.h = hc0Var;
        this.e = ig.k;
    }
}
