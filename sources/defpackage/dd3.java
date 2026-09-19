package defpackage;

import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class dd3 {
    public final ArrayList a = new ArrayList(1);
    public final HashSet b = new HashSet(1);
    public final xb3 c;
    public final xb3 d;
    public Looper e;
    public ox0 f;
    public la3 g;

    public dd3() {
        yd3 yd3Var = null;
        this.c = new xb3(new CopyOnWriteArrayList(), yd3Var);
        this.d = new xb3(new CopyOnWriteArrayList(), yd3Var);
    }

    public abstract void a(li0 li0Var);

    public abstract void b(xd3 xd3Var);

    public abstract xd3 c(yd3 yd3Var, fg3 fg3Var, long j);

    public abstract li0 f();

    public abstract void h(qp2 qp2Var);

    public abstract void j();

    public final void k(ox0 ox0Var) {
        this.f = ox0Var;
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((zd3) arrayList.get(i)).a(this, ox0Var);
        }
    }

    public final void l(ge3 ge3Var) {
        CopyOnWriteArrayList<ae3> copyOnWriteArrayList = this.c.b;
        for (ae3 ae3Var : copyOnWriteArrayList) {
            if (ae3Var.b == ge3Var) {
                copyOnWriteArrayList.remove(ae3Var);
            }
        }
    }

    public final void m(yb3 yb3Var) {
        CopyOnWriteArrayList<wb3> copyOnWriteArrayList = this.d.b;
        for (wb3 wb3Var : copyOnWriteArrayList) {
            if (wb3Var.a == yb3Var) {
                copyOnWriteArrayList.remove(wb3Var);
            }
        }
    }

    public final void n(zd3 zd3Var, qp2 qp2Var, la3 la3Var) {
        Looper looperMyLooper = Looper.myLooper();
        Looper looper = this.e;
        boolean z = true;
        if (looper != null && looper != looperMyLooper) {
            z = false;
        }
        hn.v(z);
        this.g = la3Var;
        ox0 ox0Var = this.f;
        this.a.add(zd3Var);
        if (this.e == null) {
            this.e = looperMyLooper;
            this.b.add(zd3Var);
            h(qp2Var);
        } else if (ox0Var != null) {
            o(zd3Var);
            zd3Var.a(this, ox0Var);
        }
    }

    public final void o(zd3 zd3Var) {
        this.e.getClass();
        HashSet hashSet = this.b;
        boolean zIsEmpty = hashSet.isEmpty();
        hashSet.add(zd3Var);
        if (zIsEmpty) {
            g();
        }
    }

    public final void p(zd3 zd3Var) {
        HashSet hashSet = this.b;
        boolean zIsEmpty = hashSet.isEmpty();
        hashSet.remove(zd3Var);
        if (zIsEmpty || !hashSet.isEmpty()) {
            return;
        }
        i();
    }

    public final void q(zd3 zd3Var) {
        ArrayList arrayList = this.a;
        arrayList.remove(zd3Var);
        if (!arrayList.isEmpty()) {
            p(zd3Var);
            return;
        }
        this.e = null;
        this.f = null;
        this.g = null;
        this.b.clear();
        j();
    }

    public abstract void r();

    public void d() {
    }

    public void e() {
    }

    public void g() {
    }

    public void i() {
    }
}
