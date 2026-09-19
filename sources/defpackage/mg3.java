package defpackage;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.os.Trace;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class mg3 extends Handler implements Runnable {
    public final me3 f;
    public qe3 g;
    public IOException h;
    public int i;
    public Thread j;
    public boolean k;
    public volatile boolean l;
    public final /* synthetic */ p83 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mg3(p83 p83Var, Looper looper, me3 me3Var, qe3 qe3Var, long j) {
        super(looper);
        Objects.requireNonNull(p83Var);
        this.m = p83Var;
        this.f = me3Var;
        this.g = qe3Var;
    }

    public final void a(boolean z) {
        this.l = z;
        this.h = null;
        if (hasMessages(1)) {
            this.k = true;
            removeMessages(1);
            if (!z) {
                sendEmptyMessage(2);
            }
        } else {
            synchronized (this) {
                try {
                    this.k = true;
                    this.f.g = true;
                    Thread thread = this.j;
                    if (thread != null) {
                        thread.interrupt();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        if (z) {
            this.m.h = null;
            SystemClock.elapsedRealtime();
            qe3 qe3Var = this.g;
            qe3Var.getClass();
            qe3Var.c(this.f, true);
            this.g = null;
        }
    }

    public final void b() {
        qd3 qd3Var;
        SystemClock.elapsedRealtime();
        qe3 qe3Var = this.g;
        qe3Var.getClass();
        int i = this.i;
        me3 me3Var = this.f;
        ep2 ep2Var = me3Var.b;
        if (i == 0) {
            Uri uri = me3Var.j.a;
            qd3Var = new qd3();
        } else {
            Uri uri2 = ep2Var.g;
            qd3Var = new qd3();
        }
        xb3 xb3Var = qe3Var.i;
        xb3Var.a(new g2(xb3Var, qd3Var, new vd3(-1, null, qz1.q(me3Var.i), qz1.q(qe3Var.E)), i));
        this.h = null;
        p83 p83Var = this.m;
        mg3 mg3Var = (mg3) p83Var.h;
        mg3Var.getClass();
        ((h90) p83Var.g).execute(mg3Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        long jMin;
        sl0 sl0Var;
        ee0 ee0Var;
        if (this.l) {
            return;
        }
        int i = message.what;
        int i2 = 1;
        if (i == 1) {
            b();
            return;
        }
        if (i == 4) {
            throw ((Error) message.obj);
        }
        p83 p83Var = this.m;
        p83Var.h = null;
        SystemClock.elapsedRealtime();
        qe3 qe3Var = this.g;
        qe3Var.getClass();
        if (this.k) {
            qe3Var.c(this.f, false);
            return;
        }
        int i3 = message.what;
        if (i3 == 2) {
            try {
                qe3Var.g(this.f);
                return;
            } catch (RuntimeException e) {
                s90.b0("LoadTask", "Unexpected exception handling load completed", e);
                this.m.i = new ng3(e);
                return;
            }
        }
        if (i3 != 3) {
            return;
        }
        IOException iOException = (IOException) message.obj;
        this.h = iOException;
        int i4 = this.i;
        this.i = i4 + 1;
        me3 me3Var = this.f;
        Uri uri = me3Var.b.g;
        qd3 qd3Var = new qd3();
        String str = qz1.a;
        if ((iOException instanceof no0) || (iOException instanceof FileNotFoundException) || (iOException instanceof qj2) || (iOException instanceof ng3)) {
            jMin = -9223372036854775807L;
            break;
        }
        Throwable cause = iOException;
        while (true) {
            if (cause == null) {
                jMin = Math.min(i4 * 1000, 5000);
                break;
            } else {
                if ((cause instanceof ze2) && ((ze2) cause).f == 2008) {
                    jMin = -9223372036854775807L;
                    break;
                }
                cause = cause.getCause();
            }
        }
        if (jMin == -9223372036854775807L) {
            sl0Var = p83.l;
        } else {
            int iX = qe3Var.x();
            int i5 = iX > qe3Var.P ? 1 : 0;
            if (qe3Var.L || !((ee0Var = qe3Var.D) == null || ee0Var.a() == -9223372036854775807L)) {
                qe3Var.P = iX;
            } else {
                boolean z = qe3Var.z;
                if (!z || qe3Var.q()) {
                    qe3Var.I = z;
                    qe3Var.M = 0L;
                    qe3Var.P = 0;
                    for (ze3 ze3Var : qe3Var.w) {
                        ze3Var.i(false);
                    }
                    me3Var.f.a = 0L;
                    me3Var.i = 0L;
                    i2 = 1;
                    me3Var.h = true;
                    me3Var.l = false;
                } else {
                    qe3Var.O = true;
                    sl0Var = p83.k;
                }
            }
            sl0Var = new sl0(i5, jMin);
        }
        int i6 = sl0Var.a;
        int i7 = (i6 == 0 || i6 == i2) ? i2 : 0;
        xb3 xb3Var = qe3Var.i;
        xb3Var.a(new db2(xb3Var, qd3Var, new vd3(-1, null, qz1.q(me3Var.i), qz1.q(qe3Var.E)), iOException, i7 ^ 1));
        int i8 = sl0Var.a;
        if (i8 == 3) {
            p83Var.i = this.h;
            return;
        }
        if (i8 != 2) {
            if (i8 == 1) {
                this.i = 1;
            }
            long jMin2 = sl0Var.b;
            if (jMin2 == -9223372036854775807L) {
                jMin2 = Math.min((this.i - 1) * 1000, 5000);
            }
            p83 p83Var2 = this.m;
            hn.M(((mg3) p83Var2.h) == null);
            p83Var2.h = this;
            if (jMin2 > 0) {
                sendEmptyMessageDelayed(1, jMin2);
            } else {
                b();
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        try {
            synchronized (this) {
                z = this.k;
                this.j = Thread.currentThread();
            }
            if (!z) {
                me3 me3Var = this.f;
                String simpleName = me3Var.getClass().getSimpleName();
                StringBuilder sb = new StringBuilder(simpleName.length() + 5);
                sb.append("load:");
                sb.append(simpleName);
                Trace.beginSection(sb.toString());
                try {
                    me3Var.a();
                    Trace.endSection();
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            }
            synchronized (this) {
                this.j = null;
                Thread.interrupted();
            }
            if (this.l) {
                return;
            }
            sendEmptyMessage(2);
        } catch (IOException e) {
            if (this.l) {
                return;
            }
            obtainMessage(3, e).sendToTarget();
        } catch (Exception e2) {
            if (this.l) {
                return;
            }
            s90.b0("LoadTask", "Unexpected exception loading stream", e2);
            obtainMessage(3, new ng3(e2)).sendToTarget();
        } catch (OutOfMemoryError e3) {
            if (this.l) {
                return;
            }
            s90.b0("LoadTask", "OutOfMemory error loading stream", e3);
            obtainMessage(3, new ng3(e3)).sendToTarget();
        } catch (Error e4) {
            if (!this.l) {
                s90.b0("LoadTask", "Unexpected error loading stream", e4);
                obtainMessage(4, e4).sendToTarget();
            }
            throw e4;
        }
    }
}
