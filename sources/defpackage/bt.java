package defpackage;

import android.os.Looper;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class bt {
    public static final Object k = new Object();
    public final Object a = new Object();
    public final py b = new py();
    public int c = 0;
    public boolean d;
    public volatile Object e;
    public volatile Object f;
    public int g;
    public boolean h;
    public boolean i;
    public final q7 j;

    public bt() {
        Object obj = k;
        this.f = obj;
        this.j = new q7(6, this);
        this.e = obj;
        this.g = -1;
    }

    public static void a(String str) {
        d7.Q().C.getClass();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return;
        }
        j7.e(ec.i("Cannot invoke ", str, " on a background thread"));
    }

    public final void b(mp mpVar) {
        if (mpVar.b) {
            int i = mpVar.c;
            int i2 = this.g;
            if (i >= i2) {
                return;
            }
            mpVar.c = i2;
            zx zxVar = mpVar.a;
            Object obj = this.e;
            zxVar.getClass();
            mo moVar = (mo) obj;
            df dfVar = (df) zxVar.g;
            if (moVar == null || !dfVar.b0) {
                return;
            }
            throw new IllegalStateException("Fragment " + dfVar + " did not return a View from onCreateView() or this was called before onCreateView().");
        }
    }

    public final void c(mp mpVar) {
        if (this.h) {
            this.i = true;
            return;
        }
        this.h = true;
        do {
            this.i = false;
            if (mpVar != null) {
                b(mpVar);
                mpVar = null;
            } else {
                py pyVar = this.b;
                pyVar.getClass();
                ny nyVar = new ny(pyVar);
                pyVar.h.put(nyVar, Boolean.FALSE);
                while (nyVar.hasNext()) {
                    b((mp) ((Map.Entry) nyVar.next()).getValue());
                    if (this.i) {
                        break;
                    }
                }
            }
        } while (this.i);
        this.h = false;
    }
}
