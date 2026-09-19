package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Looper;

/* JADX INFO: loaded from: classes.dex */
public final class z63 {
    public final Context a;
    public final ig b;
    public final rz1 c;
    public final sw1 d;
    public ii2 e;
    public ii2 f;
    public final n92 g;
    public final Looper h;
    public final int i;
    public final qk1 j;
    public final int k;
    public final boolean l;
    public final c93 m;
    public final b93 n;
    public final long o;
    public final long p;
    public final int q;
    public final int r;
    public final int s;
    public final int t;
    public final boolean u;
    public boolean v;
    public final String w;
    public final z03 x;

    public z63(Context context, s70 s70Var) {
        rz1 rz1Var = new rz1(9, s70Var);
        sw1 sw1Var = new sw1(context);
        w32 w32Var = new w32(7, context);
        r53 r53Var = r53.g;
        n92 n92Var = new n92(context, 5);
        context.getClass();
        this.a = context;
        this.c = rz1Var;
        this.d = sw1Var;
        this.e = w32Var;
        this.f = r53Var;
        this.g = n92Var;
        String str = qz1.a;
        Looper looperMyLooper = Looper.myLooper();
        this.h = looperMyLooper == null ? Looper.getMainLooper() : looperMyLooper;
        this.j = qk1.b;
        this.k = 1;
        this.l = true;
        this.m = c93.d;
        this.n = b93.b;
        this.x = new z03(qz1.r(20L), qz1.r(500L));
        this.b = ig.k;
        this.o = 500L;
        this.p = 2000L;
        this.q = 600000;
        this.r = Integer.MAX_VALUE;
        this.s = Integer.MAX_VALUE;
        this.t = 600000;
        this.u = true;
        this.w = "";
        this.i = -1000;
        if (Build.VERSION.SDK_INT >= 35) {
            int i = d43.a;
        }
    }
}
