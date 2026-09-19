package defpackage;

import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;

/* JADX INFO: loaded from: classes.dex */
public final class vv extends ih {
    final /* synthetic */ wv this$0;

    public static final class a extends ih {
        final /* synthetic */ wv this$0;

        public a(wv wvVar) {
            this.this$0 = wvVar;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            activity.getClass();
            this.this$0.a();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            activity.getClass();
            wv wvVar = this.this$0;
            int i = wvVar.f + 1;
            wvVar.f = i;
            if (i == 1 && wvVar.i) {
                wvVar.k.d(eo.ON_START);
                wvVar.i = false;
            }
        }
    }

    public vv(wv wvVar) {
        this.this$0 = wvVar;
    }

    @Override // defpackage.ih, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        activity.getClass();
        if (Build.VERSION.SDK_INT < 29) {
            int i = bx.g;
            Fragment fragmentFindFragmentByTag = activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
            fragmentFindFragmentByTag.getClass();
            ((bx) fragmentFindFragmentByTag).f = this.this$0.m;
        }
    }

    @Override // defpackage.ih, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        activity.getClass();
        wv wvVar = this.this$0;
        int i = wvVar.g - 1;
        wvVar.g = i;
        if (i == 0) {
            Handler handler = wvVar.j;
            handler.getClass();
            handler.postDelayed(wvVar.l, 700L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        activity.getClass();
        z6.d(activity, new a(this.this$0));
    }

    @Override // defpackage.ih, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        activity.getClass();
        wv wvVar = this.this$0;
        int i = wvVar.f - 1;
        wvVar.f = i;
        if (i == 0 && wvVar.h) {
            wvVar.k.d(eo.ON_STOP);
            wvVar.i = true;
        }
    }
}
