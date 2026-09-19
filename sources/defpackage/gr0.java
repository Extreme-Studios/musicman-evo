package defpackage;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class gr0 implements Application.ActivityLifecycleCallbacks {
    public final Application g;
    public final WeakReference h;
    public final /* synthetic */ int f = 0;
    public boolean i = false;

    public gr0(Application application, rt0 rt0Var) {
        this.h = new WeakReference(rt0Var);
        this.g = application;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        int i = this.f;
        Application application = this.g;
        WeakReference weakReference = this.h;
        switch (i) {
            case 0:
                try {
                    Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = (Application.ActivityLifecycleCallbacks) weakReference.get();
                    if (activityLifecycleCallbacks != null) {
                        activityLifecycleCallbacks.onActivityCreated(activity, bundle);
                    } else if (!this.i) {
                        application.unregisterActivityLifecycleCallbacks(this);
                        this.i = true;
                    }
                } catch (Exception unused) {
                    return;
                }
                break;
            default:
                try {
                    Application.ActivityLifecycleCallbacks activityLifecycleCallbacks2 = (Application.ActivityLifecycleCallbacks) weakReference.get();
                    if (activityLifecycleCallbacks2 != null) {
                        activityLifecycleCallbacks2.onActivityCreated(activity, bundle);
                    } else if (!this.i) {
                        application.unregisterActivityLifecycleCallbacks(this);
                        this.i = true;
                    }
                } catch (Exception e) {
                    jn.P("Error while dispatching lifecycle callback.", e);
                    return;
                }
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        int i = this.f;
        Application application = this.g;
        WeakReference weakReference = this.h;
        switch (i) {
            case 0:
                try {
                    Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = (Application.ActivityLifecycleCallbacks) weakReference.get();
                    if (activityLifecycleCallbacks != null) {
                        activityLifecycleCallbacks.onActivityDestroyed(activity);
                    } else if (!this.i) {
                        application.unregisterActivityLifecycleCallbacks(this);
                        this.i = true;
                    }
                } catch (Exception unused) {
                    return;
                }
                break;
            default:
                try {
                    Application.ActivityLifecycleCallbacks activityLifecycleCallbacks2 = (Application.ActivityLifecycleCallbacks) weakReference.get();
                    if (activityLifecycleCallbacks2 != null) {
                        activityLifecycleCallbacks2.onActivityDestroyed(activity);
                    } else if (!this.i) {
                        application.unregisterActivityLifecycleCallbacks(this);
                        this.i = true;
                    }
                } catch (Exception e) {
                    jn.P("Error while dispatching lifecycle callback.", e);
                    return;
                }
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        int i = this.f;
        Application application = this.g;
        WeakReference weakReference = this.h;
        switch (i) {
            case 0:
                try {
                    Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = (Application.ActivityLifecycleCallbacks) weakReference.get();
                    if (activityLifecycleCallbacks != null) {
                        activityLifecycleCallbacks.onActivityPaused(activity);
                    } else if (!this.i) {
                        application.unregisterActivityLifecycleCallbacks(this);
                        this.i = true;
                    }
                } catch (Exception unused) {
                    return;
                }
                break;
            default:
                try {
                    Application.ActivityLifecycleCallbacks activityLifecycleCallbacks2 = (Application.ActivityLifecycleCallbacks) weakReference.get();
                    if (activityLifecycleCallbacks2 != null) {
                        activityLifecycleCallbacks2.onActivityPaused(activity);
                    } else if (!this.i) {
                        application.unregisterActivityLifecycleCallbacks(this);
                        this.i = true;
                    }
                } catch (Exception e) {
                    jn.P("Error while dispatching lifecycle callback.", e);
                    return;
                }
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        int i = this.f;
        Application application = this.g;
        WeakReference weakReference = this.h;
        switch (i) {
            case 0:
                try {
                    Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = (Application.ActivityLifecycleCallbacks) weakReference.get();
                    if (activityLifecycleCallbacks != null) {
                        activityLifecycleCallbacks.onActivityResumed(activity);
                    } else if (!this.i) {
                        application.unregisterActivityLifecycleCallbacks(this);
                        this.i = true;
                    }
                } catch (Exception unused) {
                    return;
                }
                break;
            default:
                try {
                    Application.ActivityLifecycleCallbacks activityLifecycleCallbacks2 = (Application.ActivityLifecycleCallbacks) weakReference.get();
                    if (activityLifecycleCallbacks2 != null) {
                        activityLifecycleCallbacks2.onActivityResumed(activity);
                    } else if (!this.i) {
                        application.unregisterActivityLifecycleCallbacks(this);
                        this.i = true;
                    }
                } catch (Exception e) {
                    jn.P("Error while dispatching lifecycle callback.", e);
                    return;
                }
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        int i = this.f;
        Application application = this.g;
        WeakReference weakReference = this.h;
        switch (i) {
            case 0:
                try {
                    Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = (Application.ActivityLifecycleCallbacks) weakReference.get();
                    if (activityLifecycleCallbacks != null) {
                        activityLifecycleCallbacks.onActivitySaveInstanceState(activity, bundle);
                    } else if (!this.i) {
                        application.unregisterActivityLifecycleCallbacks(this);
                        this.i = true;
                    }
                } catch (Exception unused) {
                    return;
                }
                break;
            default:
                try {
                    Application.ActivityLifecycleCallbacks activityLifecycleCallbacks2 = (Application.ActivityLifecycleCallbacks) weakReference.get();
                    if (activityLifecycleCallbacks2 != null) {
                        activityLifecycleCallbacks2.onActivitySaveInstanceState(activity, bundle);
                    } else if (!this.i) {
                        application.unregisterActivityLifecycleCallbacks(this);
                        this.i = true;
                    }
                } catch (Exception e) {
                    jn.P("Error while dispatching lifecycle callback.", e);
                    return;
                }
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        int i = this.f;
        Application application = this.g;
        WeakReference weakReference = this.h;
        switch (i) {
            case 0:
                try {
                    Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = (Application.ActivityLifecycleCallbacks) weakReference.get();
                    if (activityLifecycleCallbacks != null) {
                        activityLifecycleCallbacks.onActivityStarted(activity);
                    } else if (!this.i) {
                        application.unregisterActivityLifecycleCallbacks(this);
                        this.i = true;
                    }
                } catch (Exception unused) {
                    return;
                }
                break;
            default:
                try {
                    Application.ActivityLifecycleCallbacks activityLifecycleCallbacks2 = (Application.ActivityLifecycleCallbacks) weakReference.get();
                    if (activityLifecycleCallbacks2 != null) {
                        activityLifecycleCallbacks2.onActivityStarted(activity);
                    } else if (!this.i) {
                        application.unregisterActivityLifecycleCallbacks(this);
                        this.i = true;
                    }
                } catch (Exception e) {
                    jn.P("Error while dispatching lifecycle callback.", e);
                    return;
                }
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        int i = this.f;
        Application application = this.g;
        WeakReference weakReference = this.h;
        switch (i) {
            case 0:
                try {
                    Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = (Application.ActivityLifecycleCallbacks) weakReference.get();
                    if (activityLifecycleCallbacks != null) {
                        activityLifecycleCallbacks.onActivityStopped(activity);
                    } else if (!this.i) {
                        application.unregisterActivityLifecycleCallbacks(this);
                        this.i = true;
                    }
                } catch (Exception unused) {
                    return;
                }
                break;
            default:
                try {
                    Application.ActivityLifecycleCallbacks activityLifecycleCallbacks2 = (Application.ActivityLifecycleCallbacks) weakReference.get();
                    if (activityLifecycleCallbacks2 != null) {
                        activityLifecycleCallbacks2.onActivityStopped(activity);
                    } else if (!this.i) {
                        application.unregisterActivityLifecycleCallbacks(this);
                        this.i = true;
                    }
                } catch (Exception e) {
                    jn.P("Error while dispatching lifecycle callback.", e);
                    return;
                }
                break;
        }
    }

    public gr0(Application application, rr0 rr0Var) {
        this.h = new WeakReference(rr0Var);
        this.g = application;
    }
}
