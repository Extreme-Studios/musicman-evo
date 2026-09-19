package defpackage;

import android.content.Context;
import android.util.Pair;
import android.util.SparseArray;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes.dex */
public final class cc0 {
    public final Context a;
    public final ac0 b;
    public final SparseArray c;
    public final boolean d;
    public final ob0 e;
    public final ig f;
    public final CopyOnWriteArraySet g;
    public final long h;
    public final hc0 i;
    public d6 j = new d6();
    public wx1 k;
    public Pair l;
    public int m;
    public int n;
    public long o;
    public int p;

    public cc0(xb0 xb0Var) {
        this.a = xb0Var.a;
        ac0 ac0Var = xb0Var.c;
        ac0Var.getClass();
        this.b = ac0Var;
        this.c = new SparseArray();
        tj2 tj2Var = vj2.g;
        qk2 qk2Var = qk2.j;
        this.d = xb0Var.d;
        ig igVar = xb0Var.e;
        this.f = igVar;
        long j = xb0Var.g;
        this.h = j != -9223372036854775807L ? -j : -9223372036854775807L;
        hc0 hc0Var = xb0Var.h;
        this.i = hc0Var;
        this.e = new ob0(xb0Var.b, hc0Var, igVar);
        this.g = new CopyOnWriteArraySet();
        new de3(new uc3());
        this.o = -9223372036854775807L;
        this.p = -1;
        this.n = 0;
    }
}
