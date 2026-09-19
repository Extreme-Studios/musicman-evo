package defpackage;

import android.os.Build;
import android.view.View;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public abstract class b30 {
    public int a;
    public int b;
    public int c;
    public Object d;

    public b30() {
        if (gm.p == null) {
            gm.p = new gm();
        }
    }

    public int a(int i) {
        if (i < this.c) {
            return ((ByteBuffer) this.d).getShort(this.b + i);
        }
        return 0;
    }

    public abstract Object b(View view);

    public abstract void c(View view, Object obj);

    public void d(View view, Object obj) {
        Object tag;
        if (Build.VERSION.SDK_INT >= this.b) {
            c(view, obj);
            return;
        }
        i0 i0Var = null;
        if (Build.VERSION.SDK_INT >= this.b) {
            tag = b(view);
        } else {
            tag = view.getTag(this.a);
            if (!((Class) this.d).isInstance(tag)) {
                tag = null;
            }
        }
        if (e(tag, obj)) {
            View.AccessibilityDelegate accessibilityDelegateD = w60.d(view);
            if (accessibilityDelegateD != null) {
                i0Var = accessibilityDelegateD instanceof h0 ? ((h0) accessibilityDelegateD).a : new i0(accessibilityDelegateD);
            }
            if (i0Var == null) {
                i0Var = new i0();
            }
            w60.i(view, i0Var);
            view.setTag(this.a, obj);
            w60.f(view, this.c);
        }
    }

    public abstract boolean e(Object obj, Object obj2);
}
