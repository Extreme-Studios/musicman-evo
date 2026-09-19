package defpackage;

import android.app.ActivityManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import com.extremestudios.musicmanevo.R;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class g90 {
    public static g90 h;
    public static g90 i;
    public static final Object j;
    public final Context a;
    public final g2 b;
    public final WorkDatabase c;
    public final r52 d;
    public final yv e;
    public boolean f;
    public BroadcastReceiver.PendingResult g;

    static {
        yp.f("WorkManagerImpl");
        h = null;
        i = null;
        j = new Object();
    }

    public g90(Context context, g2 g2Var, r52 r52Var) {
        wx wxVar;
        Executor executor;
        String str;
        boolean z = context.getResources().getBoolean(R.bool.workmanager_test_configuration);
        Context applicationContext = context.getApplicationContext();
        vz vzVar = (vz) r52Var.g;
        int i2 = 1;
        if (z) {
            wxVar = new wx(applicationContext, null);
            wxVar.g = true;
        } else {
            String str2 = f90.a;
            wx wxVar2 = new wx(applicationContext, "androidx.work.workdb");
            wxVar2.f = new n92(applicationContext, i2);
            wxVar = wxVar2;
        }
        wxVar.d = vzVar;
        c90 c90Var = new c90();
        if (wxVar.c == null) {
            wxVar.c = new ArrayList();
        }
        wxVar.c.add(c90Var);
        wxVar.a(i8.n);
        wxVar.a(new e90(applicationContext, 2, 3));
        wxVar.a(i8.o);
        wxVar.a(i8.p);
        wxVar.a(new e90(applicationContext, 5, 6));
        wxVar.a(i8.q);
        wxVar.a(i8.r);
        wxVar.a(i8.s);
        wxVar.a(new e90(applicationContext));
        wxVar.a(new e90(applicationContext, 10, 11));
        wxVar.a(i8.t);
        wxVar.h = false;
        wxVar.i = true;
        Context context2 = wxVar.b;
        if (context2 == null) {
            j7.p("Cannot provide null context for the database.");
            throw null;
        }
        Executor executor2 = wxVar.d;
        if (executor2 == null && wxVar.e == null) {
            c7 c7Var = d7.E;
            wxVar.e = c7Var;
            wxVar.d = c7Var;
        } else if (executor2 != null && wxVar.e == null) {
            wxVar.e = executor2;
        } else if (executor2 == null && (executor = wxVar.e) != null) {
            wxVar.d = executor;
        }
        if (wxVar.f == null) {
            wxVar.f = new gm();
        }
        String str3 = wxVar.a;
        p20 p20Var = wxVar.f;
        dr0 dr0Var = wxVar.j;
        ArrayList arrayList = wxVar.c;
        boolean z2 = wxVar.g;
        ActivityManager activityManager = (ActivityManager) context2.getSystemService("activity");
        int i3 = (activityManager == null || activityManager.isLowRamDevice()) ? 2 : 3;
        Executor executor3 = wxVar.d;
        wd wdVar = new wd(context2, str3, p20Var, dr0Var, arrayList, z2, i3, executor3, wxVar.e, wxVar.h, wxVar.i);
        int i4 = i3;
        String name = WorkDatabase.class.getPackage().getName();
        String canonicalName = WorkDatabase.class.getCanonicalName();
        String str4 = (name.isEmpty() ? canonicalName : canonicalName.substring(name.length() + 1)).replace('.', '_') + "_Impl";
        try {
            if (name.isEmpty()) {
                str = str4;
            } else {
                str = name + "." + str4;
            }
            WorkDatabase workDatabase = (WorkDatabase) Class.forName(str).newInstance();
            q20 q20VarC = workDatabase.c(wdVar);
            workDatabase.b = q20VarC;
            q20VarC.setWriteAheadLoggingEnabled(i4 == 3);
            workDatabase.d = arrayList;
            workDatabase.a = executor3;
            new ArrayDeque();
            workDatabase.c = z2;
            Context applicationContext2 = context.getApplicationContext();
            yp ypVar = new yp(g2Var.g, 0);
            synchronized (yp.class) {
                yp.h = ypVar;
            }
            String str5 = ez.a;
            new ComponentName(applicationContext2.getApplicationContext(), (Class<?>) SystemJobService.class);
            z20 z20Var = new z20();
            hv.a(applicationContext2, SystemJobService.class, true);
            yp.d().a(ez.a, "Created SystemJobScheduler and enabled SystemJobService", new Throwable[0]);
            yv yvVar = new yv(context, g2Var, r52Var, workDatabase, Arrays.asList(z20Var, new hm(applicationContext2, g2Var, r52Var, this)));
            Context applicationContext3 = context.getApplicationContext();
            this.a = applicationContext3;
            this.b = g2Var;
            this.d = r52Var;
            this.c = workDatabase;
            this.e = yvVar;
            this.f = false;
            if (applicationContext3.isDeviceProtectedStorage()) {
                j7.e("Cannot initialize WorkManager in direct boot mode");
                throw null;
            }
            this.d.i(new ej(applicationContext3, this));
        } catch (ClassNotFoundException unused) {
            throw new RuntimeException("cannot find implementation for " + WorkDatabase.class.getCanonicalName() + ". " + str4 + " does not exist");
        } catch (IllegalAccessException unused2) {
            throw new RuntimeException("Cannot access the constructor" + WorkDatabase.class.getCanonicalName());
        } catch (InstantiationException unused3) {
            throw new RuntimeException("Failed to create an instance of " + WorkDatabase.class.getCanonicalName());
        }
    }

    public static g90 b(Context context) {
        g90 g90Var;
        Object obj = j;
        synchronized (obj) {
            try {
                synchronized (obj) {
                    try {
                        g90Var = h;
                        if (g90Var == null) {
                            g90Var = i;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return g90Var;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (g90Var != null) {
            return g90Var;
        }
        context.getApplicationContext();
        throw new IllegalStateException("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");
    }

    public static void c(Context context, g2 g2Var) {
        synchronized (j) {
            try {
                g90 g90Var = h;
                if (g90Var != null && i != null) {
                    throw new IllegalStateException("WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information.");
                }
                if (g90Var == null) {
                    Context applicationContext = context.getApplicationContext();
                    if (i == null) {
                        i = new g90(applicationContext, g2Var, new r52((ExecutorService) g2Var.i));
                    }
                    h = i;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void a(bv bvVar) {
        List listSingletonList = Collections.singletonList(bvVar);
        if (listSingletonList.isEmpty()) {
            j7.p("enqueue needs at least one WorkRequest.");
        } else {
            this.d.i(new oh(new b90(this, listSingletonList)));
        }
    }

    public final void d() {
        synchronized (j) {
            try {
                this.f = true;
                BroadcastReceiver.PendingResult pendingResult = this.g;
                if (pendingResult != null) {
                    pendingResult.finish();
                    this.g = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void e(String str, ig igVar) {
        ib ibVar = new ib(3);
        ibVar.g = this;
        ibVar.h = str;
        ibVar.i = igVar;
        this.d.i(ibVar);
    }

    public final void f(String str) {
        this.d.i(new c20(this, str, false));
    }
}
