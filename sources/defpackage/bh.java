package defpackage;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class bh {
    public int a = 1;
    public final ns b;
    public ns c;
    public ns d;
    public int e;
    public int f;

    public bh(ns nsVar) {
        this.b = nsVar;
        this.c = nsVar;
    }

    public final void a() {
        this.a = 1;
        this.c = this.b;
        this.f = 0;
    }

    public final boolean b() {
        ls lsVarB = this.c.b.b();
        int iA = lsVarB.a(6);
        return !(iA == 0 || ((ByteBuffer) lsVarB.d).get(iA + lsVarB.a) == 0) || this.e == 65039;
    }
}
