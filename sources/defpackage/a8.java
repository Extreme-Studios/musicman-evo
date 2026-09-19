package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public abstract class a8 {
    public static final ei[] x = new ei[0];
    public xx b;
    public final Context c;
    public final bc3 d;
    public final am e;
    public final ps0 f;
    public ld0 i;
    public z7 j;
    public IInterface k;
    public iu1 m;
    public final x7 o;
    public final y7 p;
    public final int q;
    public final String r;
    public volatile String s;
    public volatile String a = null;
    public final Object g = new Object();
    public final Object h = new Object();
    public final ArrayList l = new ArrayList();
    public int n = 1;
    public db t = null;
    public boolean u = false;
    public volatile w73 v = null;
    public final AtomicInteger w = new AtomicInteger(0);

    public a8(Context context, Looper looper, bc3 bc3Var, am amVar, int i, x7 x7Var, y7 y7Var, String str) {
        dq.g(context, "Context must not be null");
        this.c = context;
        dq.g(looper, "Looper must not be null");
        dq.g(bc3Var, "Supervisor must not be null");
        this.d = bc3Var;
        dq.g(amVar, "API availability must not be null");
        this.e = amVar;
        this.f = new ps0(this, looper);
        this.q = i;
        this.o = x7Var;
        this.p = y7Var;
        this.r = str;
    }

    public static /* bridge */ /* synthetic */ boolean x(a8 a8Var, int i, int i2, IInterface iInterface) {
        synchronized (a8Var.g) {
            try {
                if (a8Var.n != i) {
                    return false;
                }
                a8Var.y(i2, iInterface);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean a() {
        boolean z;
        synchronized (this.g) {
            z = this.n == 4;
        }
        return z;
    }

    public final void c(String str) {
        this.a = str;
        o();
    }

    public int d() {
        return am.a;
    }

    public final boolean e() {
        boolean z;
        synchronized (this.g) {
            int i = this.n;
            z = true;
            if (i != 2 && i != 3) {
                z = false;
            }
        }
        return z;
    }

    public final void f(kc2 kc2Var) {
        ((z90) kc2Var.g).r.r.post(new q7(12, kc2Var));
    }

    public final ei[] g() {
        w73 w73Var = this.v;
        if (w73Var == null) {
            return null;
        }
        return w73Var.g;
    }

    public final void h() {
        if (!a() || this.b == null) {
            throw new RuntimeException("Failed to connect when checking package");
        }
    }

    public final void i(z7 z7Var) {
        this.j = z7Var;
        y(2, null);
    }

    public final String j() {
        return this.a;
    }

    public boolean k() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void l(lm lmVar, Set set) {
        Bundle bundleR = r();
        String str = this.s;
        int i = am.a;
        Scope[] scopeArr = sl.t;
        Bundle bundle = new Bundle();
        int i2 = this.q;
        ei[] eiVarArr = sl.u;
        sl slVar = new sl(6, i2, i, null, null, scopeArr, bundle, null, eiVarArr, eiVarArr, true, 0, false, str);
        slVar.i = this.c.getPackageName();
        slVar.l = bundleR;
        if (set != null) {
            slVar.k = (Scope[]) set.toArray(new Scope[0]);
        }
        if (k()) {
            Account accountP = p();
            if (accountP == null) {
                accountP = new Account("<<default account>>", "com.google");
            }
            slVar.m = accountP;
            if (lmVar != 0) {
                slVar.j = ((v90) lmVar).g;
            }
        }
        slVar.n = x;
        slVar.o = q();
        if (this instanceof sk1) {
            slVar.r = true;
        }
        try {
            synchronized (this.h) {
                try {
                    ld0 ld0Var = this.i;
                    if (ld0Var != null) {
                        ld0Var.T(new vk1(this, this.w.get()), slVar);
                    } else {
                        Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (DeadObjectException e) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            int i3 = this.w.get();
            ps0 ps0Var = this.f;
            ps0Var.sendMessage(ps0Var.obtainMessage(6, i3, 3));
        } catch (RemoteException e2) {
            e = e2;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            int i4 = this.w.get();
            i32 i32Var = new i32(this, 8, null, null);
            ps0 ps0Var2 = this.f;
            ps0Var2.sendMessage(ps0Var2.obtainMessage(1, i4, -1, i32Var));
        } catch (SecurityException e3) {
            throw e3;
        } catch (RuntimeException e4) {
            e = e4;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            int i5 = this.w.get();
            i32 i32Var2 = new i32(this, 8, null, null);
            ps0 ps0Var3 = this.f;
            ps0Var3.sendMessage(ps0Var3.obtainMessage(1, i5, -1, i32Var2));
        }
    }

    public final void m() {
        int iC = this.e.c(this.c, d());
        int i = 3;
        if (iC == 0) {
            i(new zx(i, this));
            return;
        }
        y(1, null);
        this.j = new zx(i, this);
        int i2 = this.w.get();
        ps0 ps0Var = this.f;
        ps0Var.sendMessage(ps0Var.obtainMessage(3, i2, iC, null));
    }

    public abstract IInterface n(IBinder iBinder);

    public final void o() {
        this.w.incrementAndGet();
        synchronized (this.l) {
            try {
                int size = this.l.size();
                int i = 0;
                while (true) {
                    ArrayList arrayList = this.l;
                    if (i < size) {
                        db0 db0Var = (db0) arrayList.get(i);
                        synchronized (db0Var) {
                            db0Var.a = null;
                        }
                        i++;
                    } else {
                        arrayList.clear();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        synchronized (this.h) {
            this.i = null;
        }
        y(1, null);
    }

    public Account p() {
        return null;
    }

    public ei[] q() {
        return x;
    }

    public Bundle r() {
        return new Bundle();
    }

    public Set s() {
        return Collections.EMPTY_SET;
    }

    public final IInterface t() {
        IInterface iInterface;
        synchronized (this.g) {
            try {
                if (this.n == 5) {
                    throw new DeadObjectException();
                }
                if (!a()) {
                    throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
                }
                iInterface = this.k;
                dq.g(iInterface, "Client is connected but service is null");
            } catch (Throwable th) {
                throw th;
            }
        }
        return iInterface;
    }

    public abstract String u();

    public abstract String v();

    public boolean w() {
        return d() >= 211700000;
    }

    public final void y(int i, IInterface iInterface) {
        xx xxVar;
        dq.b((i == 4) == (iInterface != null));
        synchronized (this.g) {
            try {
                this.n = i;
                this.k = iInterface;
                if (i == 1) {
                    iu1 iu1Var = this.m;
                    if (iu1Var != null) {
                        bc3 bc3Var = this.d;
                        String str = this.b.a;
                        dq.f(str);
                        this.b.getClass();
                        if (this.r == null) {
                            this.c.getClass();
                        }
                        bc3Var.b(str, iu1Var, this.b.b);
                        this.m = null;
                    }
                } else if (i == 2 || i == 3) {
                    iu1 iu1Var2 = this.m;
                    if (iu1Var2 != null && (xxVar = this.b) != null) {
                        Log.e("GmsClient", "Calling connect() while still connected, missing disconnect() for " + xxVar.a + " on com.google.android.gms");
                        bc3 bc3Var2 = this.d;
                        String str2 = this.b.a;
                        dq.f(str2);
                        this.b.getClass();
                        if (this.r == null) {
                            this.c.getClass();
                        }
                        bc3Var2.b(str2, iu1Var2, this.b.b);
                        this.w.incrementAndGet();
                    }
                    iu1 iu1Var3 = new iu1(this, this.w.get());
                    this.m = iu1Var3;
                    String strV = v();
                    boolean zW = w();
                    this.b = new xx(strV, zW);
                    if (zW && d() < 17895000) {
                        throw new IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(String.valueOf(this.b.a)));
                    }
                    bc3 bc3Var3 = this.d;
                    String str3 = this.b.a;
                    dq.f(str3);
                    this.b.getClass();
                    String name = this.r;
                    if (name == null) {
                        name = this.c.getClass().getName();
                    }
                    if (!bc3Var3.c(new y93(str3, this.b.b), iu1Var3, name, null)) {
                        Log.w("GmsClient", "unable to connect to service: " + this.b.a + " on com.google.android.gms");
                        int i2 = this.w.get();
                        ae2 ae2Var = new ae2(this, 16);
                        ps0 ps0Var = this.f;
                        ps0Var.sendMessage(ps0Var.obtainMessage(7, i2, -1, ae2Var));
                    }
                } else if (i == 4) {
                    dq.f(iInterface);
                    System.currentTimeMillis();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
