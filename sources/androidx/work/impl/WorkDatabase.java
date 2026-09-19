package androidx.work.impl;

import android.os.Looper;
import defpackage.a23;
import defpackage.dq;
import defpackage.hn;
import defpackage.i8;
import defpackage.j7;
import defpackage.q20;
import defpackage.wd;
import defpackage.yd;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public abstract class WorkDatabase {
    public Executor a;
    public q20 b;
    public boolean c;
    public List d;

    public final void a() {
        if (!this.c && Looper.getMainLooper().getThread() == Thread.currentThread()) {
            j7.e("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
        }
    }

    public final void b() {
        a();
        this.b.i();
        throw null;
    }

    public abstract q20 c(wd wdVar);

    public abstract hn d();

    public abstract dq e();

    public abstract dq f();

    public abstract a23 g();

    public abstract i8 h();

    public abstract yd i();
}
