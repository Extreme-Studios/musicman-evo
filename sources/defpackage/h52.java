package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes.dex */
public final class h52 {
    public f93 a;
    public kb3 b;
    public String c;
    public ee2 d;
    public boolean e;
    public ArrayList f;
    public ArrayList g;
    public qz0 h;
    public kf3 i;
    public o2 j;
    public ew k;
    public ig1 l;
    public int m = 1;
    public a31 n;
    public final yp o;
    public boolean p;
    public boolean q;
    public nz1 r;
    public boolean s;
    public Bundle t;
    public final AtomicLong u;
    public yh1 v;

    public h52() {
        yp ypVar = new yp();
        ypVar.g = 2;
        this.o = ypVar;
        this.p = false;
        this.q = false;
        this.s = false;
        this.u = new AtomicLong();
    }

    public final i52 a() {
        dq.g(this.c, "ad unit must not be null");
        dq.g(this.b, "ad size must not be null");
        dq.g(this.a, "ad request must not be null");
        return new i52(this);
    }
}
