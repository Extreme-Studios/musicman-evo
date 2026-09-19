package defpackage;

import android.content.Context;
import android.os.Looper;

/* JADX INFO: loaded from: classes.dex */
public final class k31 implements g31, u31 {
    public final md1 f;

    public k31(Context context, d60 d60Var) throws wd1 {
        ue0 ue0Var = vc3.C.d;
        md1 md1VarP = ue0.p(context, new eg(0, 0, 0), "", false, false, null, null, d60Var, null, null, new cv0(), null, null, null, null, null);
        this.f = md1VarP;
        md1VarP.p0().setWillNotDraw(true);
    }

    public static final void d(Runnable runnable) {
        f32 f32Var = ut0.f.a;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            jn.p("runOnUiThread > the UI thread is the main thread, the runnable will be run now");
            runnable.run();
        } else {
            jn.p("runOnUiThread > the UI thread is not the main thread, the runnable will be added to the message queue");
            if (zb3.l.post(runnable)) {
                return;
            }
            jn.T("runOnUiThread > the runnable could not be placed to the message queue");
        }
    }

    @Override // defpackage.u31
    public final void h(String str, v11 v11Var) {
        this.f.d0(str, new oc2(14, v11Var));
    }

    @Override // defpackage.g31, defpackage.l31
    public final void l(String str) {
        jn.p("invokeJavascript on adWebView from js");
        d(new i31(this, str, 3));
    }

    @Override // defpackage.u31
    public final void p(String str, v11 v11Var) {
        this.f.t0(str, new h31(this, v11Var));
    }
}
