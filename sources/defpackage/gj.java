package defpackage;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;

/* JADX INFO: loaded from: classes.dex */
public final class gj implements Runnable {
    public final /* synthetic */ int f;
    public final /* synthetic */ hj g;

    public /* synthetic */ gj(hj hjVar, int i) {
        this.f = i;
        this.g = hjVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f;
        hj hjVar = this.g;
        switch (i) {
            case 0:
                ViewParent parent = hjVar.i.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                }
                break;
            default:
                hjVar.a();
                View view = hjVar.i;
                if (view.isEnabled() && !view.isLongClickable() && hjVar.c()) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                    view.onTouchEvent(motionEventObtain);
                    motionEventObtain.recycle();
                    hjVar.l = true;
                    break;
                }
                break;
        }
    }
}
