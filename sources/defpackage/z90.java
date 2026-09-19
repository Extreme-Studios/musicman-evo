package defpackage;

import android.content.Context;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.SparseIntArray;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class z90 implements bm, cm {
    public final t3 g;
    public final z3 h;
    public final us2 i;
    public final int l;
    public final la0 m;
    public boolean n;
    public final /* synthetic */ dm r;
    public final LinkedList f = new LinkedList();
    public final HashSet j = new HashSet();
    public final HashMap k = new HashMap();
    public final ArrayList o = new ArrayList();
    public db p = null;
    public int q = 0;

    /* JADX WARN: Multi-variable type inference failed */
    public z90(dm dmVar, yl ylVar) {
        this.r = dmVar;
        Looper looper = dmVar.r.getLooper();
        r52 r52VarA = ylVar.a();
        es0 es0Var = new es0((n7) r52VarA.g, (String) r52VarA.h, (String) r52VarA.i);
        yd ydVar = (yd) ylVar.h.g;
        dq.f(ydVar);
        t3 t3VarB = ydVar.b(ylVar.f, looper, es0Var, ylVar.i, this, this);
        String str = ylVar.g;
        if (str != null && (t3VarB instanceof a8)) {
            ((a8) t3VarB).s = str;
        }
        if (str != null && (t3VarB instanceof xt)) {
            ec.s(t3VarB);
            throw null;
        }
        this.g = t3VarB;
        this.h = ylVar.j;
        this.i = new us2(5);
        this.l = ylVar.k;
        if (!t3VarB.k()) {
            this.m = null;
            return;
        }
        Context context = dmVar.j;
        za0 za0Var = dmVar.r;
        r52 r52VarA2 = ylVar.a();
        this.m = new la0(context, za0Var, new es0((n7) r52VarA2.g, (String) r52VarA2.h, (String) r52VarA2.i));
    }

    @Override // defpackage.bm
    public final void T(int i) {
        Looper looperMyLooper = Looper.myLooper();
        za0 za0Var = this.r.r;
        if (looperMyLooper == za0Var.getLooper()) {
            f(i);
        } else {
            za0Var.post(new og(i, 2, this));
        }
    }

    @Override // defpackage.cm
    public final void U(db dbVar) {
        l(dbVar, null);
    }

    @Override // defpackage.bm
    public final void Y() {
        Looper looperMyLooper = Looper.myLooper();
        za0 za0Var = this.r.r;
        if (looperMyLooper == za0Var.getLooper()) {
            e();
        } else {
            za0Var.post(new q7(11, this));
        }
    }

    public final void a(db dbVar) {
        HashSet hashSet = this.j;
        Iterator it = hashSet.iterator();
        if (!it.hasNext()) {
            hashSet.clear();
        } else if (it.next() != null) {
            j7.j();
        } else {
            if (s90.d(dbVar, db.j)) {
                this.g.h();
            }
            throw null;
        }
    }

    public final void b(Status status) {
        dq.c(this.r.r);
        c(status, null, false);
    }

    public final void c(Status status, Exception exc, boolean z) {
        dq.c(this.r.r);
        if ((status == null) == (exc == null)) {
            j7.p("Status XOR exception should be null");
            return;
        }
        Iterator it = this.f.iterator();
        while (it.hasNext()) {
            ea0 ea0Var = (ea0) it.next();
            if (!z || ea0Var.a == 2) {
                if (status != null) {
                    ea0Var.c(status);
                } else {
                    ea0Var.d(exc);
                }
                it.remove();
            }
        }
    }

    public final void d() {
        LinkedList linkedList = this.f;
        ArrayList arrayList = new ArrayList(linkedList);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ea0 ea0Var = (ea0) arrayList.get(i);
            if (!this.g.a()) {
                return;
            }
            if (h(ea0Var)) {
                linkedList.remove(ea0Var);
            }
        }
    }

    public final void e() {
        dm dmVar = this.r;
        dq.c(dmVar.r);
        this.p = null;
        a(db.j);
        za0 za0Var = dmVar.r;
        if (this.n) {
            z3 z3Var = this.h;
            za0Var.removeMessages(11, z3Var);
            za0Var.removeMessages(9, z3Var);
            this.n = false;
        }
        Iterator it = this.k.values().iterator();
        if (it.hasNext()) {
            it.next().getClass();
            j7.j();
        } else {
            d();
            g();
        }
    }

    public final void f(int i) {
        dm dmVar = this.r;
        za0 za0Var = dmVar.r;
        dq.c(dmVar.r);
        this.p = null;
        this.n = true;
        String strJ = this.g.j();
        us2 us2Var = this.i;
        us2Var.getClass();
        StringBuilder sb = new StringBuilder("The connection to Google Play services was lost");
        if (i == 1) {
            sb.append(" due to service disconnection.");
        } else if (i == 3) {
            sb.append(" due to dead object exception.");
        }
        if (strJ != null) {
            sb.append(" Last reason for disconnect: ");
            sb.append(strJ);
        }
        us2Var.m(true, new Status(20, sb.toString(), null, null));
        z3 z3Var = this.h;
        za0Var.sendMessageDelayed(Message.obtain(za0Var, 9, z3Var), 5000L);
        za0Var.sendMessageDelayed(Message.obtain(za0Var, 11, z3Var), 120000L);
        ((SparseIntArray) dmVar.l.g).clear();
        Iterator it = this.k.values().iterator();
        if (it.hasNext()) {
            it.next().getClass();
            j7.j();
        }
    }

    public final void g() {
        dm dmVar = this.r;
        za0 za0Var = dmVar.r;
        z3 z3Var = this.h;
        za0Var.removeMessages(12, z3Var);
        za0Var.sendMessageDelayed(za0Var.obtainMessage(12, z3Var), dmVar.f);
    }

    public final boolean h(ea0 ea0Var) {
        ei eiVar;
        if (ea0Var == null) {
            us2 us2Var = this.i;
            t3 t3Var = this.g;
            ea0Var.f(us2Var, t3Var.k());
            try {
                ea0Var.e(this);
                return true;
            } catch (DeadObjectException unused) {
                T(1);
                t3Var.c("DeadObjectException thrown while running ApiCallRunner.");
                return true;
            }
        }
        ei[] eiVarArrB = ea0Var.b(this);
        if (eiVarArrB == null || eiVarArrB.length == 0) {
            eiVar = null;
            break;
        }
        ei[] eiVarArrG = this.g.g();
        if (eiVarArrG == null) {
            eiVarArrG = new ei[0];
        }
        m7 m7Var = new m7(eiVarArrG.length);
        for (ei eiVar2 : eiVarArrG) {
            m7Var.put(eiVar2.f, Long.valueOf(eiVar2.a()));
        }
        int length = eiVarArrB.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                eiVar = null;
                break;
            }
            eiVar = eiVarArrB[i];
            Long l = (Long) m7Var.get(eiVar.f);
            if (l == null || l.longValue() < eiVar.a()) {
                break;
            }
            i++;
        }
        if (eiVar == null) {
            us2 us2Var2 = this.i;
            t3 t3Var2 = this.g;
            ea0Var.f(us2Var2, t3Var2.k());
            try {
                ea0Var.e(this);
                return true;
            } catch (DeadObjectException unused2) {
                T(1);
                t3Var2.c("DeadObjectException thrown while running ApiCallRunner.");
                return true;
            }
        }
        String name = this.g.getClass().getName();
        String str = eiVar.f;
        long jA = eiVar.a();
        StringBuilder sb = new StringBuilder(name.length() + 77 + String.valueOf(str).length());
        ec.x(sb, name, " could not execute call because it requires feature (", str, ", ");
        sb.append(jA);
        sb.append(").");
        Log.w("GoogleApiManager", sb.toString());
        if (!this.r.s || !ea0Var.a(this)) {
            ea0Var.d(new o50(eiVar));
            return true;
        }
        aa0 aa0Var = new aa0(this.h, eiVar);
        int iIndexOf = this.o.indexOf(aa0Var);
        ArrayList arrayList = this.o;
        if (iIndexOf >= 0) {
            aa0 aa0Var2 = (aa0) arrayList.get(iIndexOf);
            this.r.r.removeMessages(15, aa0Var2);
            za0 za0Var = this.r.r;
            za0Var.sendMessageDelayed(Message.obtain(za0Var, 15, aa0Var2), 5000L);
            return false;
        }
        arrayList.add(aa0Var);
        za0 za0Var2 = this.r.r;
        za0Var2.sendMessageDelayed(Message.obtain(za0Var2, 15, aa0Var), 5000L);
        za0 za0Var3 = this.r.r;
        za0Var3.sendMessageDelayed(Message.obtain(za0Var3, 16, aa0Var), 120000L);
        db dbVar = new db(2, null);
        if (!i(dbVar)) {
            this.r.b(dbVar, this.l);
        }
        return false;
    }

    public final boolean i(db dbVar) {
        synchronized (dm.v) {
        }
        return false;
    }

    public final void j() {
        dm dmVar = this.r;
        dq.c(dmVar.r);
        t3 t3Var = this.g;
        if (t3Var.a() || t3Var.e()) {
            return;
        }
        try {
            z61 z61Var = dmVar.l;
            Context context = dmVar.j;
            SparseIntArray sparseIntArray = (SparseIntArray) z61Var.g;
            dq.f(context);
            int iD = t3Var.d();
            int iC = ((SparseIntArray) z61Var.g).get(iD, -1);
            if (iC == -1) {
                int i = 0;
                while (true) {
                    if (i >= sparseIntArray.size()) {
                        iC = -1;
                        break;
                    }
                    int iKeyAt = sparseIntArray.keyAt(i);
                    if (iKeyAt > iD && sparseIntArray.get(iKeyAt) == 0) {
                        iC = 0;
                        break;
                    }
                    i++;
                }
                if (iC == -1) {
                    iC = ((zl) z61Var.h).c(context, iD);
                }
                sparseIntArray.put(iD, iC);
            }
            if (iC != 0) {
                db dbVar = new db(iC, null);
                String name = t3Var.getClass().getName();
                String string = dbVar.toString();
                StringBuilder sb = new StringBuilder(name.length() + 35 + string.length());
                sb.append("The service for ");
                sb.append(name);
                sb.append(" is not available: ");
                sb.append(string);
                Log.w("GoogleApiManager", sb.toString());
                l(dbVar, null);
                return;
            }
            ba0 ba0Var = new ba0();
            ba0Var.k = dmVar;
            ba0Var.i = null;
            ba0Var.j = null;
            ba0Var.f = false;
            ba0Var.g = t3Var;
            ba0Var.h = this.h;
            if (t3Var.k()) {
                la0 la0Var = this.m;
                dq.f(la0Var);
                Handler handler = la0Var.h;
                es0 es0Var = la0Var.k;
                n00 n00Var = la0Var.l;
                if (n00Var != null) {
                    n00Var.o();
                }
                es0Var.k = Integer.valueOf(System.identityHashCode(la0Var));
                la0Var.l = (n00) la0Var.i.b(la0Var.g, handler.getLooper(), es0Var, (o00) es0Var.j, la0Var, la0Var);
                la0Var.m = ba0Var;
                Set set = la0Var.j;
                if (set == null || set.isEmpty()) {
                    handler.post(new q7(13, la0Var));
                } else {
                    n00 n00Var2 = la0Var.l;
                    n00Var2.getClass();
                    n00Var2.i(new zx(3, n00Var2));
                }
            }
            try {
                t3Var.i(ba0Var);
            } catch (SecurityException e) {
                l(new db(10), e);
            }
        } catch (IllegalStateException e2) {
            l(new db(10), e2);
        }
    }

    public final void k(ea0 ea0Var) {
        dq.c(this.r.r);
        boolean zA = this.g.a();
        LinkedList linkedList = this.f;
        if (zA) {
            if (h(ea0Var)) {
                g();
                return;
            } else {
                linkedList.add(ea0Var);
                return;
            }
        }
        linkedList.add(ea0Var);
        db dbVar = this.p;
        if (dbVar == null || dbVar.g == 0 || dbVar.h == null) {
            j();
        } else {
            l(dbVar, null);
        }
    }

    public final void l(db dbVar, RuntimeException runtimeException) {
        n00 n00Var;
        dq.c(this.r.r);
        la0 la0Var = this.m;
        if (la0Var != null && (n00Var = la0Var.l) != null) {
            n00Var.o();
        }
        dq.c(this.r.r);
        this.p = null;
        ((SparseIntArray) this.r.l.g).clear();
        a(dbVar);
        if ((this.g instanceof ya0) && dbVar.g != 24) {
            dm dmVar = this.r;
            dmVar.g = true;
            za0 za0Var = dmVar.r;
            za0Var.sendMessageDelayed(za0Var.obtainMessage(19), 300000L);
        }
        if (dbVar.g == 4) {
            b(dm.u);
            return;
        }
        if (this.f.isEmpty()) {
            this.p = dbVar;
            return;
        }
        dm dmVar2 = this.r;
        if (runtimeException != null) {
            dq.c(dmVar2.r);
            c(null, runtimeException, false);
            return;
        }
        boolean z = dmVar2.s;
        z3 z3Var = this.h;
        if (!z) {
            b(dm.c(z3Var, dbVar));
            return;
        }
        c(dm.c(z3Var, dbVar), null, true);
        if (this.f.isEmpty() || i(dbVar) || this.r.b(dbVar, this.l)) {
            return;
        }
        if (dbVar.g == 18) {
            this.n = true;
        }
        if (!this.n) {
            b(dm.c(this.h, dbVar));
        } else {
            za0 za0Var2 = this.r.r;
            za0Var2.sendMessageDelayed(Message.obtain(za0Var2, 9, this.h), 5000L);
        }
    }

    public final void m() {
        dq.c(this.r.r);
        Status status = dm.t;
        b(status);
        this.i.m(false, status);
        for (lp lpVar : (lp[]) this.k.keySet().toArray(new lp[0])) {
            k(new ta0(new k30()));
        }
        a(new db(4));
        t3 t3Var = this.g;
        if (t3Var.a()) {
            t3Var.f(new kc2(9, this));
        }
    }
}
