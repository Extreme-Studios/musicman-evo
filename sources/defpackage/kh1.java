package defpackage;

import android.os.SystemClock;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class kh1 implements qt0 {
    public md1 f;
    public final Executor g;
    public final dh1 h;
    public final ae i;
    public boolean j = false;
    public boolean k = false;
    public final hh1 l = new hh1();

    public kh1(Executor executor, dh1 dh1Var, ae aeVar) {
        this.g = executor;
        this.h = dh1Var;
        this.i = aeVar;
    }

    @Override // defpackage.qt0
    public final void Q0(pt0 pt0Var) {
        boolean z = this.k ? false : pt0Var.j;
        hh1 hh1Var = this.l;
        hh1Var.a = z;
        this.i.getClass();
        hh1Var.c = SystemClock.elapsedRealtime();
        hh1Var.e = pt0Var;
        if (this.j) {
            a();
        }
    }

    public final void a() {
        try {
            JSONObject jSONObjectE = this.h.e(this.l);
            if (this.f != null) {
                this.g.execute(new hb1(this, jSONObjectE, 6, false));
            }
        } catch (JSONException e) {
            jn.w("Failed to call video active view js", e);
        }
    }
}
