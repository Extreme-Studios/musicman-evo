package defpackage;

import android.os.Handler;

/* JADX INFO: loaded from: classes.dex */
public final class wv implements mo {
    public static final wv n = new wv();
    public int f;
    public int g;
    public Handler j;
    public boolean h = true;
    public boolean i = true;
    public final oo k = new oo(this);
    public final x1 l = new x1(8, this);
    public final kc2 m = new kc2(6, this);

    public final void a() {
        int i = this.g + 1;
        this.g = i;
        if (i == 1) {
            if (this.h) {
                this.k.d(eo.ON_RESUME);
                this.h = false;
            } else {
                Handler handler = this.j;
                handler.getClass();
                handler.removeCallbacks(this.l);
            }
        }
    }

    @Override // defpackage.mo
    public final oo e() {
        return this.k;
    }
}
