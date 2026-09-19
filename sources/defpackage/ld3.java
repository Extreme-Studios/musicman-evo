package defpackage;

import android.os.Handler;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class ld3 extends dd3 {
    public final HashMap h = new HashMap();
    public Handler i;
    public qp2 j;

    @Override // defpackage.dd3
    public final void g() {
        for (kd3 kd3Var : this.h.values()) {
            kd3Var.a.o(kd3Var.b);
        }
    }

    @Override // defpackage.dd3
    public final void i() {
        for (kd3 kd3Var : this.h.values()) {
            kd3Var.a.p(kd3Var.b);
        }
    }

    @Override // defpackage.dd3
    public void j() {
        HashMap map = this.h;
        for (kd3 kd3Var : map.values()) {
            dd3 dd3Var = kd3Var.a;
            dd3Var.q(kd3Var.b);
            jd3 jd3Var = kd3Var.c;
            dd3Var.l(jd3Var);
            dd3Var.m(jd3Var);
        }
        map.clear();
    }

    @Override // defpackage.dd3
    public void r() {
        Iterator it = this.h.values().iterator();
        while (it.hasNext()) {
            ((kd3) it.next()).a.r();
        }
    }

    public abstract void s(Object obj, dd3 dd3Var, ox0 ox0Var);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [gd3, zd3] */
    public final void t(final Integer num, dd3 dd3Var) {
        HashMap map = this.h;
        hn.v(!map.containsKey(num));
        ?? r1 = new zd3() { // from class: gd3
            @Override // defpackage.zd3
            public final /* synthetic */ void a(dd3 dd3Var2, ox0 ox0Var) {
                this.a.s(num, dd3Var2, ox0Var);
            }
        };
        jd3 jd3Var = new jd3(this, num);
        map.put(num, new kd3(dd3Var, r1, jd3Var));
        Handler handler = this.i;
        handler.getClass();
        xb3 xb3Var = dd3Var.c;
        xb3Var.getClass();
        xb3Var.b.add(new ae3(handler, jd3Var));
        this.i.getClass();
        xb3 xb3Var2 = dd3Var.d;
        xb3Var2.getClass();
        xb3Var2.b.add(new wb3(jd3Var));
        qp2 qp2Var = this.j;
        la3 la3Var = this.g;
        la3Var.getClass();
        dd3Var.n(r1, qp2Var, la3Var);
        if (this.b.isEmpty()) {
            dd3Var.p(r1);
        }
    }

    public abstract yd3 v(Object obj, yd3 yd3Var);

    public void u(Object obj) {
    }

    public void w(long j, Object obj) {
    }
}
