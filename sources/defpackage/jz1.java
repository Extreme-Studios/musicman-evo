package defpackage;

import android.content.Context;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class jz1 extends x41 {
    public final Context f;
    public final if1 g;
    public final h52 h;
    public final m40 i;
    public b11 j;

    public jz1(if1 if1Var, Context context, String str) {
        h52 h52Var = new h52();
        this.h = h52Var;
        this.i = new m40();
        this.g = if1Var;
        h52Var.c = str;
        this.f = context;
    }

    @Override // defpackage.m51
    public final void D0(ew ewVar) {
        h52 h52Var = this.h;
        h52Var.k = ewVar;
        if (ewVar != null) {
            h52Var.e = ewVar.f;
            h52Var.l = ewVar.g;
        }
    }

    @Override // defpackage.m51
    public final void G0(o2 o2Var) {
        h52 h52Var = this.h;
        h52Var.j = o2Var;
        if (o2Var != null) {
            h52Var.e = o2Var.f;
        }
    }

    @Override // defpackage.m51
    public final void O2(yh1 yh1Var) {
        this.h.v = yh1Var;
    }

    @Override // defpackage.m51
    public final void Z1(v01 v01Var, kb3 kb3Var) {
        this.i.i = v01Var;
        this.h.b = kb3Var;
    }

    @Override // defpackage.m51
    public final s31 b() {
        m40 m40Var = this.i;
        m40Var.getClass();
        wo1 wo1Var = new wo1(m40Var);
        ArrayList arrayList = new ArrayList();
        if (wo1Var.c != null) {
            arrayList.add(Integer.toString(6));
        }
        if (wo1Var.a != null) {
            arrayList.add(Integer.toString(1));
        }
        if (wo1Var.b != null) {
            arrayList.add(Integer.toString(2));
        }
        q00 q00Var = wo1Var.f;
        if (!q00Var.isEmpty()) {
            arrayList.add(Integer.toString(3));
        }
        if (wo1Var.e != null) {
            arrayList.add(Integer.toString(7));
        }
        h52 h52Var = this.h;
        h52Var.f = arrayList;
        ArrayList arrayList2 = new ArrayList(q00Var.h);
        for (int i = 0; i < q00Var.h; i++) {
            arrayList2.add((String) q00Var.f(i));
        }
        h52Var.g = arrayList2;
        if (h52Var.b == null) {
            h52Var.b = kb3.a();
        }
        return new kz1(this.f, this.g, h52Var, wo1Var, this.j);
    }

    @Override // defpackage.m51
    public final void m3(o01 o01Var) {
        this.i.g = o01Var;
    }

    @Override // defpackage.m51
    public final void n1(String str, t01 t01Var, r01 r01Var) {
        m40 m40Var = this.i;
        ((q00) m40Var.k).put(str, t01Var);
        if (r01Var != null) {
            ((q00) m40Var.l).put(str, r01Var);
        }
    }

    @Override // defpackage.m51
    public final void r1(x01 x01Var) {
        this.i.h = x01Var;
    }

    @Override // defpackage.m51
    public final void v0(d31 d31Var) {
        this.i.j = d31Var;
    }

    @Override // defpackage.m51
    public final void v3(p01 p01Var) {
        this.i.f = p01Var;
    }

    @Override // defpackage.m51
    public final void w0(b11 b11Var) {
        this.j = b11Var;
    }

    @Override // defpackage.m51
    public final void x1(qz0 qz0Var) {
        this.h.h = qz0Var;
    }

    @Override // defpackage.m51
    public final void x3(a31 a31Var) {
        h52 h52Var = this.h;
        h52Var.n = a31Var;
        h52Var.d = new ee2(false, true, false);
    }
}
