package defpackage;

import android.app.Activity;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public final class d61 extends us2 {
    public String i;
    public boolean j;
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;
    public int p;
    public final Object q;
    public final md1 r;
    public final Activity s;
    public eg t;
    public ImageView u;
    public LinearLayout v;
    public final dr0 w;
    public PopupWindow x;
    public RelativeLayout y;
    public ViewGroup z;

    static {
        n7 n7Var = new n7(7);
        Collections.addAll(n7Var, "top-left", "top-right", "top-center", "center", "bottom-left", "bottom-right", "bottom-center");
        Collections.unmodifiableSet(n7Var);
    }

    public d61(yd1 yd1Var, dr0 dr0Var) {
        super(yd1Var, "resize", 12, false);
        this.i = "top-right";
        this.j = true;
        this.k = 0;
        this.l = 0;
        this.m = -1;
        this.n = 0;
        this.o = 0;
        this.p = -1;
        this.q = new Object();
        this.r = yd1Var;
        this.s = yd1Var.g();
        this.w = dr0Var;
    }

    public final void E(boolean z) {
        synchronized (this.q) {
            try {
                if (this.x != null) {
                    if (!((Boolean) tu0.e.c.a(lx0.Db)).booleanValue() || Looper.getMainLooper().getThread() == Thread.currentThread()) {
                        F(z);
                    } else {
                        za1.f.a(new c61(this, z, 0));
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void F(boolean z) {
        ix0 ix0Var = lx0.Eb;
        tu0 tu0Var = tu0.e;
        kx0 kx0Var = tu0Var.c;
        kx0 kx0Var2 = tu0Var.c;
        boolean zBooleanValue = ((Boolean) kx0Var.a(ix0Var)).booleanValue();
        md1 md1Var = this.r;
        if (zBooleanValue) {
            this.y.removeView((View) md1Var);
            this.x.dismiss();
        } else {
            this.x.dismiss();
            this.y.removeView((View) md1Var);
        }
        if (((Boolean) kx0Var2.a(lx0.Fb)).booleanValue()) {
            View view = (View) md1Var;
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view);
            }
        }
        ViewGroup viewGroup = this.z;
        if (viewGroup != null) {
            viewGroup.removeView(this.u);
            boolean zBooleanValue2 = ((Boolean) kx0Var2.a(lx0.Gb)).booleanValue();
            ViewGroup viewGroup2 = this.z;
            if (zBooleanValue2) {
                try {
                    viewGroup2.addView((View) md1Var);
                    md1Var.W(this.t);
                } catch (IllegalStateException e) {
                    jn.P("Unable to add webview back to view hierarchy.", e);
                }
            } else {
                viewGroup2.addView((View) md1Var);
                md1Var.W(this.t);
            }
        }
        if (z) {
            C("default");
            dr0 dr0Var = this.w;
            if (dr0Var != null) {
                ((ir1) dr0Var.g).c.L1(zf0.o);
            }
        }
        this.x = null;
        this.y = null;
        this.z = null;
        this.v = null;
    }
}
