package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Binder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class qk implements hn2 {
    public boolean f;
    public Object g;
    public Object h;

    public qk(int i) {
        switch (i) {
            case 4:
                this.h = xs0.b;
                break;
            case 5:
            case 6:
            default:
                this.g = new Object();
                this.h = null;
                this.f = false;
                break;
            case 7:
                this.h = new ArrayList();
                this.g = xr2.b;
                this.f = false;
                break;
            case 8:
                this.g = new Object();
                break;
        }
    }

    public void a(Context context) {
        synchronized (this.g) {
            try {
                if (!this.f) {
                    Context applicationContext = context.getApplicationContext();
                    if (applicationContext == null) {
                        applicationContext = context;
                    }
                    Application application = applicationContext instanceof Application ? (Application) applicationContext : null;
                    if (application == null) {
                        jn.T("Can not cast Context to Application");
                        return;
                    }
                    if (((xt0) this.h) == null) {
                        this.h = new xt0();
                    }
                    xt0 xt0Var = (xt0) this.h;
                    if (!xt0Var.n) {
                        application.registerActivityLifecycleCallbacks(xt0Var);
                        if (context instanceof Activity) {
                            xt0Var.a((Activity) context);
                        }
                        xt0Var.g = application;
                        xt0Var.o = ((Long) tu0.e.c.a(lx0.c1)).longValue();
                        xt0Var.n = true;
                    }
                    this.f = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void b(wa3 wa3Var) {
        synchronized (this.g) {
            try {
                if (((ArrayDeque) this.h) == null) {
                    this.h = new ArrayDeque();
                }
                ((ArrayDeque) this.h).add(wa3Var);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public /* synthetic */ void c() {
        synchronized (this.g) {
            try {
                vu0 vu0Var = (vu0) this.h;
                if (vu0Var == null) {
                    return;
                }
                vu0Var.o();
                this.h = null;
                Binder.flushPendingCommands();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public synchronized void d(int i) {
        if (this.f) {
            return;
        }
        this.f = true;
        j(new fu1(i, vy1.c(((ww1) this.g).a, i), "undefined", null, null));
    }

    @Override // defpackage.hn2
    /* JADX INFO: renamed from: e */
    public void mo5e(Object obj) {
        a72 a72Var = (a72) this.h;
        a72Var.b(true);
        d72 d72Var = (d72) this.g;
        d72Var.a(a72Var);
        if (this.f) {
            d72Var.h();
        }
    }

    public void f(yt0 yt0Var) {
        synchronized (this.g) {
            try {
                if (((xt0) this.h) == null) {
                    this.h = new xt0();
                }
                xt0 xt0Var = (xt0) this.h;
                synchronized (xt0Var.h) {
                    xt0Var.k.add(yt0Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void g(ve3 ve3Var) {
        wa3 wa3Var;
        synchronized (this.g) {
            if (((ArrayDeque) this.h) != null && !this.f) {
                this.f = true;
                while (true) {
                    synchronized (this.g) {
                        try {
                            wa3Var = (wa3) ((ArrayDeque) this.h).poll();
                            if (wa3Var == null) {
                                this.f = false;
                                return;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    wa3Var.a(ve3Var);
                }
            }
        }
    }

    public void h(yt0 yt0Var) {
        synchronized (this.g) {
            try {
                xt0 xt0Var = (xt0) this.h;
                if (xt0Var == null) {
                    return;
                }
                synchronized (xt0Var.h) {
                    xt0Var.k.remove(yt0Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public Activity i() {
        synchronized (this.g) {
            try {
                xt0 xt0Var = (xt0) this.h;
                if (xt0Var == null) {
                    return null;
                }
                return xt0Var.f;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public synchronized void j(fu1 fu1Var) {
        int i = 1;
        if (true == ((Boolean) tu0.e.c.a(lx0.V5)).booleanValue()) {
            i = 3;
        }
        ((cb1) this.h).c(new xw1(i, fu1Var));
    }

    public boolean k() {
        synchronized (this.g) {
            try {
                xt0 xt0Var = (xt0) this.h;
                if (xt0Var == null) {
                    return false;
                }
                return xt0Var.i.get();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.hn2
    public void w(Throwable th) {
        a72 a72Var = (a72) this.h;
        if (a72Var.c()) {
            d72 d72Var = (d72) this.g;
            a72Var.f(th);
            a72Var.b(false);
            d72Var.a(a72Var);
            if (this.f) {
                d72Var.h();
            }
        }
    }

    public qk(Context context, int i) {
        switch (i) {
            case 4:
                ExecutorService executorService = xs0.b;
                this.h = executorService;
                executorService.execute(new in2(this, 20, context));
                break;
            default:
                this.g = new Object();
                break;
        }
    }
}
