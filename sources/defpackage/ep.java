package defpackage;

import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class ep implements View.OnTouchListener {
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;

    public /* synthetic */ ep(int i, Object obj) {
        this.f = i;
        this.g = obj;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        switch (this.f) {
            case 0:
                fp fpVar = (fp) this.g;
                bp bpVar = fpVar.w;
                Handler handler = fpVar.A;
                l5 l5Var = fpVar.E;
                int action = motionEvent.getAction();
                int x = (int) motionEvent.getX();
                int y = (int) motionEvent.getY();
                if (action == 0 && l5Var != null && l5Var.isShowing() && x >= 0 && x < l5Var.getWidth() && y >= 0 && y < l5Var.getHeight()) {
                    handler.postDelayed(bpVar, 250L);
                } else if (action == 1) {
                    handler.removeCallbacks(bpVar);
                }
                break;
            default:
                ir1 ir1Var = (ir1) this.g;
                if (((Boolean) tu0.e.c.a(lx0.Pa)).booleanValue() && motionEvent != null && motionEvent.getAction() == 0) {
                    ir1Var.r.a = motionEvent;
                }
                ir1Var.j.b = true;
                if (view != null) {
                    view.performClick();
                }
                break;
        }
        return false;
    }
}
