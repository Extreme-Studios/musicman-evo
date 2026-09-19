package defpackage;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.RelativeLayout;

/* JADX INFO: loaded from: classes.dex */
public final class b43 extends RelativeLayout {
    public final oo0 f;
    public boolean g;

    public b43(Context context, String str, String str2, String str3) {
        super(context);
        oo0 oo0Var = new oo0(context);
        oo0Var.c = str;
        this.f = oo0Var;
        oo0Var.e = str2;
        oo0Var.d = str3;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.g) {
            return false;
        }
        this.f.a(motionEvent);
        return false;
    }
}
