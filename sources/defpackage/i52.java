package defpackage;

import android.location.Location;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes.dex */
public final class i52 {
    public final ee2 a;
    public final a31 b;
    public final nz1 c;
    public final f93 d;
    public final Bundle e;
    public final kb3 f;
    public final String g;
    public final ArrayList h;
    public final ArrayList i;
    public final qz0 j;
    public final kf3 k;
    public final int l;
    public final o2 m;
    public final ew n;
    public final ig1 o;
    public final yp p;
    public final boolean q;
    public final boolean r;
    public final boolean s;
    public final Bundle t;
    public final AtomicLong u;
    public final yh1 v;

    public i52(h52 h52Var) {
        this.f = h52Var.b;
        this.g = h52Var.c;
        this.v = h52Var.v;
        f93 f93Var = h52Var.a;
        this.e = f93Var.G;
        int i = f93Var.f;
        long j = f93Var.g;
        Bundle bundle = f93Var.h;
        int i2 = f93Var.i;
        List list = f93Var.j;
        boolean z = f93Var.k;
        int i3 = f93Var.l;
        boolean z2 = true;
        if (!f93Var.m && !h52Var.e) {
            z2 = false;
        }
        String str = f93Var.n;
        qc2 qc2Var = f93Var.o;
        Location location = f93Var.p;
        String str2 = f93Var.q;
        Bundle bundle2 = f93Var.r;
        Bundle bundle3 = f93Var.s;
        List list2 = f93Var.t;
        String str3 = f93Var.u;
        String str4 = f93Var.v;
        boolean z3 = f93Var.w;
        q91 q91Var = f93Var.x;
        int i4 = f93Var.y;
        String str5 = f93Var.z;
        List list3 = f93Var.A;
        int iT = zb3.t(f93Var.B);
        f93 f93Var2 = h52Var.a;
        f93 f93Var3 = new f93(i, j, bundle, i2, list, z, i3, z2, str, qc2Var, location, str2, bundle2, bundle3, list2, str3, str4, z3, q91Var, i4, str5, list3, iT, f93Var2.C, f93Var2.D, f93Var2.E, f93Var2.F);
        this.d = f93Var3;
        ee2 ee2Var = h52Var.d;
        qz0 qz0Var = null;
        if (ee2Var == null) {
            qz0 qz0Var2 = h52Var.h;
            ee2Var = qz0Var2 != null ? qz0Var2.k : null;
        }
        this.a = ee2Var;
        ArrayList arrayList = h52Var.f;
        this.h = arrayList;
        this.i = h52Var.g;
        if (arrayList != null && (qz0Var = h52Var.h) == null) {
            qz0Var = new qz0(new ft(new ft()));
        }
        this.j = qz0Var;
        this.k = h52Var.i;
        this.l = h52Var.m;
        this.m = h52Var.j;
        this.n = h52Var.k;
        this.o = h52Var.l;
        this.b = h52Var.n;
        this.p = new yp(h52Var.o);
        this.q = h52Var.p;
        this.r = h52Var.q;
        this.c = h52Var.r;
        this.s = h52Var.s;
        this.t = h52Var.t;
        long j2 = f93Var3.F;
        this.u = j2 != 0 ? new AtomicLong(j2) : h52Var.u;
    }

    public final boolean a() {
        return this.g.matches((String) tu0.e.c.a(lx0.A3));
    }
}
