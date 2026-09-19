package defpackage;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public final class y1 implements Application.ActivityLifecycleCallbacks {
    public Object f;
    public Activity g;
    public final int h;
    public boolean i = false;
    public boolean j = false;
    public boolean k = false;

    public y1(Activity activity) {
        this.g = activity;
        this.h = activity.hashCode();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        if (this.g == activity) {
            this.g = null;
            this.j = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        if (!this.j || this.k || this.i) {
            return;
        }
        Object obj = this.f;
        try {
            Object obj2 = z1.c.get(activity);
            if (obj2 == obj && activity.hashCode() == this.h) {
                z1.g.postAtFrontOfQueue(new in2(z1.b.get(activity), 4, obj2));
                this.k = true;
                this.f = null;
            }
        } catch (Throwable th) {
            Log.e("ActivityRecreator", "Exception while fetching field values", th);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        if (this.g == activity) {
            this.i = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
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
