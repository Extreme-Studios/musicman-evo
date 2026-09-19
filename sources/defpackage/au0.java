package defpackage;

import android.R;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.app.KeyguardManager;
import android.graphics.Rect;
import android.os.PowerManager;
import android.os.Process;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.TextView;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class au0 extends Thread {
    public boolean f;
    public boolean g;
    public final Object h;
    public final um0 i;
    public final int j;
    public final int k;
    public final int l;
    public final int m;
    public final int n;
    public final int o;
    public final int p;
    public final int q;
    public final String r;
    public final boolean s;
    public final boolean t;

    public au0() {
        um0 um0Var = new um0(6, false);
        this.f = false;
        this.g = false;
        this.i = um0Var;
        this.h = new Object();
        this.k = ((Long) ky0.d.u()).intValue();
        this.l = ((Long) ky0.a.u()).intValue();
        this.m = ((Long) ky0.e.u()).intValue();
        this.n = ((Long) ky0.c.u()).intValue();
        ix0 ix0Var = lx0.e0;
        tu0 tu0Var = tu0.e;
        this.o = ((Integer) tu0Var.c.a(ix0Var)).intValue();
        ix0 ix0Var2 = lx0.f0;
        kx0 kx0Var = tu0Var.c;
        this.p = ((Integer) kx0Var.a(ix0Var2)).intValue();
        this.q = ((Integer) kx0Var.a(lx0.g0)).intValue();
        this.j = ((Long) ky0.f.u()).intValue();
        this.r = (String) kx0Var.a(lx0.i0);
        this.s = ((Boolean) kx0Var.a(lx0.j0)).booleanValue();
        this.t = ((Boolean) kx0Var.a(lx0.k0)).booleanValue();
        ((Boolean) kx0Var.a(lx0.l0)).getClass();
        setName("ContentFetchTask");
    }

    public final pt a(View view, wt0 wt0Var) {
        if (view == null) {
            return new pt(this, 0, 0);
        }
        boolean globalVisibleRect = view.getGlobalVisibleRect(new Rect());
        if ((view instanceof TextView) && !(view instanceof EditText)) {
            CharSequence text = ((TextView) view).getText();
            if (TextUtils.isEmpty(text)) {
                return new pt(this, 0, 0);
            }
            wt0Var.c(text.toString(), globalVisibleRect, view.getX(), view.getY(), view.getWidth(), view.getHeight());
            return new pt(this, 1, 0);
        }
        if ((view instanceof WebView) && !(view instanceof md1)) {
            WebView webView = (WebView) view;
            synchronized (wt0Var.g) {
                wt0Var.m++;
            }
            webView.post(new ib(this, wt0Var, webView, globalVisibleRect));
            return new pt(this, 0, 1);
        }
        if (!(view instanceof ViewGroup)) {
            return new pt(this, 0, 0);
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
            pt ptVarA = a(viewGroup.getChildAt(i3), wt0Var);
            i += ptVarA.a;
            i2 += ptVarA.b;
        }
        return new pt(this, i, i2);
    }

    public final void b() {
        synchronized (this.h) {
            this.g = true;
            StringBuilder sb = new StringBuilder(40);
            sb.append("ContentFetchThread: paused, pause = true");
            jn.F(sb.toString());
        }
    }

    /* JADX WARN: Code duplicated, block: B:57:0x00ca A[Catch: Exception -> 0x007c, InterruptedException -> 0x007e, TryCatch #7 {InterruptedException -> 0x007e, Exception -> 0x007c, blocks: (B:33:0x0069, B:35:0x0073, B:58:0x00d2, B:50:0x00b1, B:48:0x00a1, B:57:0x00ca, B:56:0x00c1, B:41:0x0080, B:43:0x0086, B:45:0x0090, B:2:0x0000, B:3:0x0006, B:15:0x001b, B:18:0x002f, B:20:0x0035, B:21:0x0039, B:23:0x003f, B:25:0x004d, B:27:0x0053, B:29:0x0059, B:31:0x0063, B:55:0x00c0, B:4:0x0007, B:6:0x000e, B:7:0x0010, B:11:0x0015), top: B:85:0x0069, inners: #0, #5 }] */
    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        View viewFindViewById;
        Application application;
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        PowerManager powerManager;
        while (true) {
            try {
                qk qkVar = vc3.C.g;
                synchronized (qkVar.g) {
                    try {
                        xt0 xt0Var = (xt0) qkVar.h;
                        viewFindViewById = null;
                        application = xt0Var != null ? xt0Var.g : null;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (application != null) {
                    ActivityManager activityManager = (ActivityManager) application.getSystemService("activity");
                    KeyguardManager keyguardManager = (KeyguardManager) application.getSystemService("keyguard");
                    if (activityManager != null && keyguardManager != null && (runningAppProcesses = activityManager.getRunningAppProcesses()) != null) {
                        Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                ActivityManager.RunningAppProcessInfo next = it.next();
                                if (Process.myPid() == next.pid) {
                                    if (next.importance != 100 || keyguardManager.inKeyguardRestrictedInputMode() || (powerManager = (PowerManager) application.getSystemService("power")) == null || !powerManager.isScreenOn()) {
                                        break;
                                    }
                                    try {
                                        Activity activityI = vc3.C.g.i();
                                        if (activityI != null) {
                                            try {
                                                if (activityI.getWindow() != null && activityI.getWindow().getDecorView() != null) {
                                                    viewFindViewById = activityI.getWindow().getDecorView().findViewById(R.id.content);
                                                }
                                            } catch (Exception e) {
                                                vc3.C.h.d("ContentFetchTask.extractContent", e);
                                                jn.F("Failed getting root view of activity. Content not extracted.");
                                            }
                                            if (viewFindViewById == null) {
                                                break;
                                            }
                                            viewFindViewById.post(new in2(this, viewFindViewById, 18, false));
                                            break;
                                        }
                                        jn.F("ContentFetchThread: no activity. Sleeping.");
                                        b();
                                        break;
                                    } catch (InterruptedException e2) {
                                        jn.P("Error in ContentFetchTask", e2);
                                    } catch (Exception e3) {
                                        jn.P("Error in ContentFetchTask", e3);
                                        vc3.C.h.d("ContentFetchTask.run", e3);
                                    }
                                }
                            }
                            jn.F("ContentFetchTask: sleeping");
                            b();
                            break;
                        }
                    }
                    jn.F("ContentFetchTask: sleeping");
                    b();
                    break;
                }
                jn.F("ContentFetchTask: sleeping");
                b();
                break;
            } catch (Throwable th2) {
                vc3.C.h.d("ContentFetchTask.isInForeground", th2);
            }
            Thread.sleep(this.j * 1000);
            Object obj = this.h;
            synchronized (obj) {
                while (this.g) {
                    try {
                        jn.F("ContentFetchTask: waiting");
                        obj.wait();
                    } catch (InterruptedException unused) {
                    }
                }
            }
        }
    }
}
