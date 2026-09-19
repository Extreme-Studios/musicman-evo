package defpackage;

import android.os.SystemClock;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes.dex */
public final class mb1 implements Runnable {
    public final /* synthetic */ int f;
    public final /* synthetic */ pb1 g;

    public /* synthetic */ mb1(pb1 pb1Var, int i) {
        this.f = i;
        this.g = pb1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f;
        pb1 pb1Var = this.g;
        switch (i) {
            case 0:
                pb1Var.c("surfaceCreated", new String[0]);
                break;
            case 1:
                pb1Var.c("surfaceDestroyed", new String[0]);
                break;
            case 2:
                pb1Var.c("firstFrameRendered", new String[0]);
                break;
            default:
                boolean z = pb1Var.m;
                ImageView imageView = pb1Var.v;
                if (z && imageView.getParent() != null) {
                    pb1Var.g.removeView(imageView);
                }
                lb1 lb1Var = pb1Var.l;
                if (lb1Var != null && pb1Var.u != null) {
                    vc3 vc3Var = vc3.C;
                    vc3Var.k.getClass();
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    if (lb1Var.getBitmap(pb1Var.u) != null) {
                        pb1Var.w = true;
                    }
                    vc3Var.k.getClass();
                    long jElapsedRealtime2 = SystemClock.elapsedRealtime() - jElapsedRealtime;
                    if (jn.B()) {
                        StringBuilder sb = new StringBuilder(String.valueOf(jElapsedRealtime2).length() + 26);
                        sb.append("Spinner frame grab took ");
                        sb.append(jElapsedRealtime2);
                        sb.append("ms");
                        jn.p(sb.toString());
                    }
                    if (jElapsedRealtime2 > pb1Var.k) {
                        jn.T("Spinner frame grab crossed jank threshold! Suspending spinner.");
                        pb1Var.p = false;
                        pb1Var.u = null;
                        sx0 sx0Var = pb1Var.i;
                        if (sx0Var != null) {
                            sx0Var.c("spinner_jank", Long.toString(jElapsedRealtime2));
                        }
                    }
                }
                break;
        }
    }
}
