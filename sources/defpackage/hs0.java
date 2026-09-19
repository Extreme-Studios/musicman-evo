package defpackage;

import android.view.View;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class hs0 extends js0 {
    public final rr0 h;
    public final long i;

    public hs0(nr0 nr0Var, hp0 hp0Var, int i, rr0 rr0Var) {
        super(nr0Var, "7i2iPrjrwVOXQymI9kbzBw+Saen0JiBKsL25H084g9vqkkZvrS3PC/gXCAaliMdd", "jjLuguQ1TtUBIYvLkWHGRHLEQB49t1f8VaYjdD5pX6Q=", hp0Var, i, 53);
        this.h = rr0Var;
        if (rr0Var != null) {
            if (rr0Var.q <= -2) {
                WeakReference weakReference = rr0Var.m;
                if ((weakReference != null ? (View) weakReference.get() : null) == null) {
                    rr0Var.q = -3L;
                }
            }
            this.i = rr0Var.q;
        }
    }

    @Override // defpackage.js0
    public final void a() {
        if (this.h != null) {
            long jLongValue = ((Long) this.e.invoke(null, Long.valueOf(this.i))).longValue();
            hp0 hp0Var = this.d;
            hp0Var.b();
            ((sp0) hp0Var.g).R(jLongValue);
        }
    }
}
