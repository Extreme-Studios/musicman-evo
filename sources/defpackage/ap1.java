package defpackage;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class ap1 {
    public static final ImageView.ScaleType k = ImageView.ScaleType.CENTER_INSIDE;
    public final h73 a;
    public final i52 b;
    public final to1 c;
    public final ro1 d;
    public final jp1 e;
    public final mp1 f;
    public final Executor g;
    public final Executor h;
    public final qz0 i;
    public final po1 j;

    public ap1(h73 h73Var, i52 i52Var, to1 to1Var, ro1 ro1Var, jp1 jp1Var, mp1 mp1Var, Executor executor, ya1 ya1Var, po1 po1Var) {
        this.a = h73Var;
        this.b = i52Var;
        this.i = i52Var.j;
        this.c = to1Var;
        this.d = ro1Var;
        this.e = jp1Var;
        this.f = mp1Var;
        this.g = executor;
        this.h = ya1Var;
        this.j = po1Var;
    }

    public static void b(RelativeLayout.LayoutParams layoutParams, int i) {
        if (i == 0) {
            layoutParams.addRule(10);
            layoutParams.addRule(9);
        } else if (i == 2) {
            layoutParams.addRule(12);
            layoutParams.addRule(11);
        } else if (i != 3) {
            layoutParams.addRule(10);
            layoutParams.addRule(11);
        } else {
            layoutParams.addRule(12);
            layoutParams.addRule(9);
        }
    }

    public final void a(np1 np1Var) {
        if (np1Var == null) {
            return;
        }
        Context context = np1Var.Z0().getContext();
        if (rs0.E(context, this.c.a)) {
            if (!(context instanceof Activity)) {
                jn.F("Activity context is needed for policy validator.");
                return;
            }
            mp1 mp1Var = this.f;
            if (mp1Var == null || np1Var.O0() == null) {
                return;
            }
            try {
                WindowManager windowManager = (WindowManager) context.getSystemService("window");
                windowManager.addView(mp1Var.a(np1Var.O0(), windowManager), rs0.G());
            } catch (wd1 e) {
                jn.w("web view can not be obtained", e);
            }
        }
    }

    public final boolean c(ViewGroup viewGroup, boolean z) {
        View view;
        ro1 ro1Var = this.d;
        if (z) {
            synchronized (ro1Var) {
                view = ro1Var.o;
            }
        } else {
            synchronized (ro1Var) {
                view = ro1Var.p;
            }
        }
        if (view == null) {
            return false;
        }
        viewGroup.removeAllViews();
        if (view.getParent() instanceof ViewGroup) {
            ((ViewGroup) view.getParent()).removeView(view);
        }
        viewGroup.addView(view, ((Boolean) tu0.e.c.a(lx0.j4)).booleanValue() ? new FrameLayout.LayoutParams(-1, -1, 17) : new FrameLayout.LayoutParams(-2, -2, 17));
        return true;
    }
}
