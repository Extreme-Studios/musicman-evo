package defpackage;

import android.app.ActivityManager;
import android.app.Application;
import android.app.UiModeManager;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import android.view.WindowManager;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class kz0 implements gm1, hn2, mw1 {
    public final Context f;

    public /* synthetic */ kz0(Context context) {
        this.f = context;
    }

    @Override // defpackage.mw1
    public Object a() {
        ph0 ph0Var = v51.m;
        if (ph0Var.g) {
            return Boolean.TRUE;
        }
        Context applicationContext = this.f.getApplicationContext();
        if (applicationContext == null) {
            j7.p("Application Context cannot be null");
            return null;
        }
        if (!ph0Var.g) {
            ph0Var.g = true;
            p92 p92VarA = p92.a();
            p92VarA.getClass();
            p92VarA.b = new f92(new Handler(), applicationContext, p92VarA);
            boolean z = applicationContext instanceof Application;
            if (z) {
                ((Application) applicationContext).registerActivityLifecycleCallbacks(h92.i);
            }
            yd.q = (UiModeManager) applicationContext.getSystemService("uimode");
            WindowManager windowManager = v92.a;
            v92.c = applicationContext.getResources().getDisplayMetrics().density;
            v92.a = (WindowManager) applicationContext.getSystemService("window");
            applicationContext.registerReceiver(new w92(0), new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"));
            n92.h.g = applicationContext.getApplicationContext();
            g92 g92Var = g92.e;
            if (!g92Var.a) {
                k92 k92Var = (k92) g92Var.d;
                if (z) {
                    ((Application) applicationContext).registerActivityLifecycleCallbacks(k92Var);
                }
                k92Var.h = g92Var;
                k92Var.f = true;
                ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
                ActivityManager.getMyMemoryState(runningAppProcessInfo);
                k92Var.g = runningAppProcessInfo.importance == 100;
                g92Var.b = k92Var.g;
                g92Var.a = true;
            }
            q92.d.a = new WeakReference(applicationContext);
            IntentFilter intentFilter = new IntentFilter("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            applicationContext.registerReceiver(new y4(), intentFilter);
        }
        return Boolean.valueOf(ph0Var.g);
    }

    @Override // defpackage.gm1
    /* JADX INFO: renamed from: b */
    public /* synthetic */ void mo4b(Object obj) {
        ((mk1) obj).l(this.f);
    }

    @Override // defpackage.hn2
    /* JADX INFO: renamed from: e */
    public /* bridge */ /* synthetic */ void mo5e(Object obj) {
        if (((Boolean) ly0.j.u()).booleanValue()) {
            i8.G(this.f);
        }
    }

    @Override // defpackage.hn2
    public void w(Throwable th) {
        if (((Boolean) ly0.h.u()).booleanValue() && (th instanceof bs0)) {
            i8.G(this.f);
        }
    }
}
