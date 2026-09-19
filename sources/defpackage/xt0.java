package defpackage;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class xt0 implements Application.ActivityLifecycleCallbacks {
    public Activity f;
    public Application g;
    public q7 m;
    public long o;
    public final Object h = new Object();
    public final AtomicBoolean i = new AtomicBoolean(true);
    public boolean j = false;
    public final ArrayList k = new ArrayList();
    public final ArrayList l = new ArrayList();
    public boolean n = false;

    public final void a(Activity activity) {
        synchronized (this.h) {
            try {
                if (!activity.getClass().getName().startsWith("com.google.android.gms.ads")) {
                    this.f = activity;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        synchronized (this.h) {
            try {
                Activity activity2 = this.f;
                if (activity2 == null) {
                    return;
                }
                if (activity2.equals(activity)) {
                    this.f = null;
                }
                ArrayList arrayList = this.l;
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    try {
                        ((nr1) obj).d();
                    } catch (Exception e) {
                        vc3.C.h.d("AppActivityTracker.ActivityListener.onActivityDestroyed", e);
                        jn.P("", e);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        a(activity);
        synchronized (this.h) {
            ArrayList arrayList = this.l;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                try {
                    ((nr1) obj).c();
                } catch (Exception e) {
                    vc3.C.h.d("AppActivityTracker.ActivityListener.onActivityPaused", e);
                    jn.P("", e);
                }
            }
        }
        this.j = true;
        q7 q7Var = this.m;
        if (q7Var != null) {
            zb3.l.removeCallbacks(q7Var);
        }
        e32 e32Var = zb3.l;
        q7 q7Var2 = new q7(23, this);
        this.m = q7Var2;
        e32Var.postDelayed(q7Var2, this.o);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        a(activity);
        int i = 0;
        this.j = false;
        boolean andSet = this.i.getAndSet(true);
        q7 q7Var = this.m;
        if (q7Var != null) {
            zb3.l.removeCallbacks(q7Var);
        }
        synchronized (this.h) {
            ArrayList arrayList = this.l;
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                try {
                    ((nr1) obj).b();
                } catch (Exception e) {
                    vc3.C.h.d("AppActivityTracker.ActivityListener.onActivityResumed", e);
                    jn.P("", e);
                }
            }
            if (andSet) {
                jn.F("App is still foreground.");
            } else {
                ArrayList arrayList2 = this.k;
                int size2 = arrayList2.size();
                while (i < size2) {
                    Object obj2 = arrayList2.get(i);
                    i++;
                    try {
                        ((yt0) obj2).T(true);
                    } catch (Exception e2) {
                        jn.P("", e2);
                    }
                }
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        a(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
