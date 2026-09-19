package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class o22 {
    public final Context a;
    public final Set b;
    public final Executor c;
    public final d72 d;
    public final es1 e;
    public long f = 0;
    public int g = 0;

    public o22(Context context, ya1 ya1Var, Set set, d72 d72Var, es1 es1Var) {
        this.a = context;
        this.c = ya1Var;
        this.b = set;
        this.d = d72Var;
        this.e = es1Var;
    }

    public final bn2 a(final Object obj, final Bundle bundle, final boolean z) {
        a72 a72VarJ = a72.j(this.a, 8);
        a72VarJ.a();
        Set<m22> set = this.b;
        final ArrayList arrayList = new ArrayList(set.size());
        List arrayList2 = new ArrayList();
        ix0 ix0Var = lx0.yc;
        tu0 tu0Var = tu0.e;
        kx0 kx0Var = tu0Var.c;
        kx0 kx0Var2 = tu0Var.c;
        if (!((String) kx0Var.a(ix0Var)).isEmpty()) {
            arrayList2 = Arrays.asList(((String) kx0Var2.a(ix0Var)).split(","));
        }
        List list = arrayList2;
        vc3 vc3Var = vc3.C;
        vc3Var.k.getClass();
        this.f = SystemClock.elapsedRealtime();
        final Bundle bundle2 = new Bundle();
        if (((Boolean) kx0Var2.a(lx0.m2)).booleanValue() && bundle != null) {
            vc3Var.k.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (obj instanceof rj1) {
                bundle.putLong("client-signals-start", jCurrentTimeMillis);
            } else {
                bundle.putLong("gms-signals-start", jCurrentTimeMillis);
            }
        }
        for (m22 m22Var : set) {
            if (!list.contains(String.valueOf(m22Var.c()))) {
                vc3.C.k.getClass();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                hp hpVarA = m22Var.a();
                hpVarA.a(new nc1(this, jElapsedRealtime, m22Var, bundle2), za1.g);
                arrayList.add(hpVarA);
            }
        }
        vj2 vj2VarM = vj2.m(arrayList);
        Callable callable = new Callable() { // from class: n22
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Object obj2;
                Bundle bundle3;
                Iterator it = arrayList.iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    obj2 = obj;
                    if (!zHasNext) {
                        break;
                    }
                    j22 j22Var = (j22) ((hp) it.next()).get();
                    if (j22Var != null) {
                        j22Var.b(obj2);
                        if (z) {
                            j22Var.e(obj2);
                        }
                    }
                }
                if (((Boolean) tu0.e.c.a(lx0.m2)).booleanValue() && (bundle3 = bundle) != null) {
                    vc3.C.k.getClass();
                    long jCurrentTimeMillis2 = System.currentTimeMillis();
                    boolean z2 = obj2 instanceof rj1;
                    Bundle bundle4 = bundle2;
                    if (z2) {
                        bundle3.putLong("client-signals-end", jCurrentTimeMillis2);
                        bundle3.putBundle("client_sig_latency_key", bundle4);
                        return obj2;
                    }
                    bundle3.putLong("gms-signals-end", jCurrentTimeMillis2);
                    bundle3.putBundle("gms_sig_latency_key", bundle4);
                }
                return obj2;
            }
        };
        bn2 bn2Var = new bn2(vj2VarM, true, false);
        bn2Var.u = new an2(bn2Var, callable, this.c);
        bn2Var.v();
        if (e72.a()) {
            i8.M(bn2Var, this.d, a72VarJ, false);
        }
        return bn2Var;
    }
}
