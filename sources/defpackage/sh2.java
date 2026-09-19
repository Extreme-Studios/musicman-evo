package defpackage;

import android.content.Context;
import android.content.Intent;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class sh2 implements Runnable {
    public final /* synthetic */ int f;
    public final /* synthetic */ qx1 g;
    public final /* synthetic */ Runnable h;

    public /* synthetic */ sh2(qx1 qx1Var, Runnable runnable, int i) {
        this.f = i;
        this.g = qx1Var;
        this.h = runnable;
    }

    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        switch (this.f) {
            case 0:
                qx1 qx1Var = this.g;
                Runnable runnable = this.h;
                if (((hh2) qx1Var.o) != null || qx1Var.f) {
                    if (!qx1Var.f) {
                        runnable.run();
                        return;
                    }
                    ((wo2) qx1Var.i).d("Waiting to bind to the service.", new Object[0]);
                    ArrayList arrayList = (ArrayList) qx1Var.k;
                    synchronized (arrayList) {
                        arrayList.add(runnable);
                        break;
                    }
                    return;
                }
                ((wo2) qx1Var.i).d("Initiate binding to the service.", new Object[0]);
                ArrayList arrayList2 = (ArrayList) qx1Var.k;
                synchronized (arrayList2) {
                    arrayList2.add(runnable);
                    break;
                }
                ph2 ph2Var = new ph2(qx1Var);
                qx1Var.n = ph2Var;
                qx1Var.f = true;
                if (((Context) qx1Var.g).bindService((Intent) qx1Var.l, ph2Var, 1)) {
                    return;
                }
                ((wo2) qx1Var.i).d("Failed to bind to the service.", new Object[0]);
                qx1Var.f = false;
                ArrayList arrayList3 = (ArrayList) qx1Var.k;
                synchronized (arrayList3) {
                    arrayList3.clear();
                    break;
                }
                return;
            default:
                qx1 qx1Var2 = this.g;
                try {
                    this.h.run();
                    return;
                } catch (RuntimeException e) {
                    ((wo2) qx1Var2.i).f("error caused by ", e);
                    return;
                }
        }
    }
}
