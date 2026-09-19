package defpackage;

import android.app.Application;
import com.extremestudios.musicmanevo.MusicmanEvoApp;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class g92 implements j92 {
    public static final g92 e = new g92(new k92());
    public boolean a;
    public boolean b;
    public Object c;
    public Object d;

    public g92(r52 r52Var, gv1 gv1Var, x32 x32Var) {
        this.a = false;
        this.b = false;
        this.c = x32Var;
        hp hpVarE = ((w32) gv1Var.g).e(x32Var.b, x32Var.a, null);
        c41 c41Var = new c41(this, gv1Var, r52Var, x32Var, 6);
        Executor executor = x32Var.e;
        this.d = na1.J(na1.L(hpVarE, c41Var, executor), Exception.class, new r21(this, gv1Var), executor);
    }

    public void a() {
        if (this.a || ((hu0) this.c) != null) {
            return;
        }
        this.a = true;
        hu0.a((MusicmanEvoApp) this.d, "ca-app-pub-8451272966172172/8782788435", new q2(new p2(1)), new ys(this));
    }

    @Override // defpackage.j92
    public void b(boolean z) {
        if (!this.b && z) {
            Date date = new Date();
            Date date2 = (Date) this.c;
            if (date2 == null || date.after(date2)) {
                this.c = date;
                if (this.a) {
                    Iterator it = Collections.unmodifiableCollection(i92.c.b).iterator();
                    while (it.hasNext()) {
                        r92 r92Var = ((x82) it.next()).d;
                        Date date3 = (Date) this.c;
                        r92Var.f(date3 != null ? (Date) date3.clone() : null);
                    }
                }
            }
        }
        this.b = z;
    }

    public /* synthetic */ g92(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        this.d = activityLifecycleCallbacks;
    }
}
