package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Binder;
import android.os.Build;
import android.os.Looper;
import android.os.Parcel;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class dd1 implements x7, y7 {
    public boolean f;
    public boolean g;
    public final Object h;
    public final Object i;
    public Object j;

    public dd1(Context context, Looper looper, ra2 ra2Var) {
        this.j = new Object();
        this.f = false;
        this.g = false;
        this.i = ra2Var;
        this.h = new va2(context, looper, this, this, 12800000);
    }

    @Override // defpackage.x7
    public void Y() {
        synchronized (this.j) {
            try {
                if (this.g) {
                    return;
                }
                this.g = true;
                try {
                    ya2 ya2Var = (ya2) ((va2) this.h).t();
                    ua2 ua2Var = new ua2(1, ((ra2) this.i).b());
                    Parcel parcelU = ya2Var.U();
                    kt0.c(parcelU, ua2Var);
                    ya2Var.K0(parcelU, 2);
                } catch (Exception unused) {
                } finally {
                    b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public synchronized void a(Context context) {
        try {
            if (this.f) {
                return;
            }
            Context applicationContext = context.getApplicationContext();
            this.j = applicationContext;
            if (applicationContext == null) {
                this.j = context;
            }
            lx0.a((Context) this.j);
            ix0 ix0Var = lx0.i4;
            tu0 tu0Var = tu0.e;
            this.g = ((Boolean) tu0Var.c.a(ix0Var)).booleanValue();
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            if (!((Boolean) tu0Var.c.a(lx0.Nb)).booleanValue() || Build.VERSION.SDK_INT < 33) {
                ((Context) this.j).registerReceiver((y4) this.h, intentFilter);
            } else {
                ((Context) this.j).registerReceiver((y4) this.h, intentFilter, 4);
            }
            this.f = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public void b() {
        synchronized (this.j) {
            try {
                va2 va2Var = (va2) this.h;
                if (va2Var.a() || va2Var.e()) {
                    va2Var.o();
                }
                Binder.flushPendingCommands();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public synchronized void c(Context context, y4 y4Var) {
        if (this.g) {
            ((WeakHashMap) this.i).remove(y4Var);
        } else {
            context.unregisterReceiver(y4Var);
        }
    }

    public dd1() {
        this.f = false;
        this.i = new WeakHashMap();
        this.h = new y4(4, this);
    }

    @Override // defpackage.x7
    public void T(int i) {
    }

    @Override // defpackage.y7
    public void U(db dbVar) {
    }
}
