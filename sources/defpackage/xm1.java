package defpackage;

import android.content.Context;
import android.view.View;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class xm1 extends t33 implements qt0 {
    public final WeakHashMap h;
    public final Context i;
    public final x42 j;

    public xm1(Context context, Set set, x42 x42Var) {
        super(set);
        this.h = new WeakHashMap(1);
        this.i = context;
        this.j = x42Var;
    }

    @Override // defpackage.qt0
    public final synchronized void Q0(pt0 pt0Var) {
        L1(new kc2(22, pt0Var));
    }

    public final synchronized void R1(View view) {
        try {
            WeakHashMap weakHashMap = this.h;
            rt0 rt0Var = (rt0) weakHashMap.get(view);
            if (rt0Var == null) {
                rt0 rt0Var2 = new rt0(this.i, view);
                rt0Var2.q.add(this);
                rt0Var2.d(3);
                weakHashMap.put(view, rt0Var2);
                rt0Var = rt0Var2;
            }
            if (this.j.X) {
                ix0 ix0Var = lx0.x1;
                tu0 tu0Var = tu0.e;
                if (((Boolean) tu0Var.c.a(ix0Var)).booleanValue()) {
                    long jLongValue = ((Long) tu0Var.c.a(lx0.w1)).longValue();
                    vl0 vl0Var = rt0Var.n;
                    synchronized (vl0Var.h) {
                        vl0Var.f = jLongValue;
                    }
                    return;
                }
                throw th;
            }
            vl0 vl0Var2 = rt0Var.n;
            long j = rt0.t;
            synchronized (vl0Var2.h) {
                vl0Var2.f = j;
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
