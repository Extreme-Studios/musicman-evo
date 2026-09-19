package defpackage;

import android.content.Context;
import android.os.DeadObjectException;
import android.os.HandlerThread;
import android.os.Parcel;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: loaded from: classes.dex */
public final class la2 implements x7, y7 {
    public final va2 f;
    public final String g;
    public final String h;
    public final ct0 i;
    public final LinkedBlockingQueue j;
    public final HandlerThread k;
    public final ga2 l;
    public final long m;

    public la2(Context context, ct0 ct0Var, String str, String str2, ga2 ga2Var) {
        this.g = str;
        this.i = ct0Var;
        this.h = str2;
        this.l = ga2Var;
        HandlerThread handlerThread = new HandlerThread("GassDGClient");
        this.k = handlerThread;
        handlerThread.start();
        this.m = System.currentTimeMillis();
        va2 va2Var = new va2(context, handlerThread.getLooper(), this, this, 19621000);
        this.f = va2Var;
        this.j = new LinkedBlockingQueue();
        va2Var.m();
    }

    @Override // defpackage.x7
    public final void T(int i) {
        try {
            b(4011, this.m, null);
            this.j.put(new cb2());
        } catch (InterruptedException unused) {
        }
    }

    @Override // defpackage.y7
    public final void U(db dbVar) {
        try {
            b(4012, this.m, null);
            this.j.put(new cb2());
        } catch (InterruptedException unused) {
        }
    }

    @Override // defpackage.x7
    public final void Y() {
        ya2 ya2Var;
        long j = this.m;
        HandlerThread handlerThread = this.k;
        try {
            ya2Var = (ya2) this.f.t();
        } catch (DeadObjectException | IllegalStateException unused) {
            ya2Var = null;
        }
        if (ya2Var != null) {
            try {
                bb2 bb2Var = new bb2(1, 1, this.i.f, this.g, this.h);
                Parcel parcelU = ya2Var.U();
                kt0.c(parcelU, bb2Var);
                Parcel parcelY = ya2Var.Y(parcelU, 3);
                cb2 cb2Var = (cb2) kt0.b(parcelY, cb2.CREATOR);
                parcelY.recycle();
                b(5011, j, null);
                this.j.put(cb2Var);
            } catch (Throwable th) {
                try {
                    b(2010, j, new Exception(th));
                } finally {
                    a();
                    handlerThread.quit();
                }
            }
        }
    }

    public final void a() {
        va2 va2Var = this.f;
        if (va2Var != null) {
            if (va2Var.a() || va2Var.e()) {
                va2Var.o();
            }
        }
    }

    public final void b(int i, long j, Exception exc) {
        ga2 ga2Var = this.l;
        if (ga2Var != null) {
            ga2Var.c(i, System.currentTimeMillis() - j, exc);
        }
    }
}
