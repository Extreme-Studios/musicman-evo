package defpackage;

import android.net.Uri;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class df3 extends ox0 {
    public static final Object g = new Object();
    public final long b;
    public final long c;
    public final boolean d;
    public final li0 e;
    public final te0 f;

    static {
        tj2 tj2Var = vj2.g;
        qk2 qk2Var = qk2.j;
        List list = Collections.EMPTY_LIST;
        qk2 qk2Var2 = qk2.j;
        dh0 dh0Var = dh0.a;
        Uri uri = Uri.EMPTY;
        if (uri != null) {
            new of0(uri, qk2Var2);
        }
        new vc0();
        uk0 uk0Var = uk0.B;
    }

    public df3(long j, long j2, boolean z, li0 li0Var, te0 te0Var) {
        this.b = j;
        this.c = j2;
        this.d = z;
        li0Var.getClass();
        this.e = li0Var;
        this.f = te0Var;
    }

    @Override // defpackage.ox0
    public final int a() {
        return 1;
    }

    @Override // defpackage.ox0
    public final ex0 b(int i, ex0 ex0Var, long j) {
        hn.P(i, 1);
        Object obj = ex0.m;
        ex0Var.a(this.e, this.d, false, this.f, this.c);
        return ex0Var;
    }

    @Override // defpackage.ox0
    public final int c() {
        return 1;
    }

    @Override // defpackage.ox0
    public final su0 d(int i, su0 su0Var, boolean z) {
        hn.P(i, 1);
        Object obj = z ? g : null;
        l91 l91Var = l91.b;
        su0Var.a(null, obj, 0, this.b, false);
        return su0Var;
    }

    @Override // defpackage.ox0
    public final int e(Object obj) {
        return g != obj ? -1 : 0;
    }

    @Override // defpackage.ox0
    public final Object f(int i) {
        hn.P(i, 1);
        return g;
    }
}
