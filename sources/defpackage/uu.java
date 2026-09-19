package defpackage;

import android.os.Build;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import java.util.Iterator;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public final class uu {
    public final Runnable a;
    public final f7 b = new f7();
    public qj c;
    public final OnBackInvokedCallback d;
    public OnBackInvokedDispatcher e;
    public boolean f;
    public boolean g;

    public uu(Runnable runnable) {
        OnBackInvokedCallback onBackInvokedCallbackA;
        this.a = runnable;
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            if (i >= 34) {
                onBackInvokedCallbackA = qu.a.a(new mu(0, this), new mu(1, this), new nu(0, this), new nu(1, this));
            } else {
                onBackInvokedCallbackA = ou.a.a(new nu(2, this));
            }
            this.d = onBackInvokedCallbackA;
        }
    }

    public final void a() {
        Object objPrevious;
        f7 f7Var = this.b;
        ListIterator listIterator = f7Var.listIterator(f7Var.h);
        do {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
        } while (!((qj) objPrevious).a);
        qj qjVar = (qj) objPrevious;
        this.c = null;
        if (qjVar == null) {
            this.a.run();
            return;
        }
        xj xjVar = qjVar.d;
        xjVar.x(true);
        if (xjVar.h.a) {
            xjVar.L();
        } else {
            xjVar.g.a();
        }
    }

    public final void b(boolean z) {
        OnBackInvokedCallback onBackInvokedCallback;
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.e;
        if (onBackInvokedDispatcher == null || (onBackInvokedCallback = this.d) == null) {
            return;
        }
        ou ouVar = ou.a;
        if (z && !this.f) {
            ouVar.b(onBackInvokedDispatcher, 0, onBackInvokedCallback);
            this.f = true;
        } else {
            if (z || !this.f) {
                return;
            }
            ouVar.c(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f = false;
        }
    }

    public final void c() {
        boolean z = this.g;
        boolean z2 = false;
        f7 f7Var = this.b;
        if (f7Var == null || !f7Var.isEmpty()) {
            Iterator it = f7Var.iterator();
            while (it.hasNext()) {
                if (((qj) it.next()).a) {
                    z2 = true;
                    break;
                }
            }
        }
        this.g = z2;
        if (z2 == z || Build.VERSION.SDK_INT < 33) {
            return;
        }
        b(z2);
    }
}
