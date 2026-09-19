package defpackage;

import android.media.MediaCodec;
import android.os.HandlerThread;
import java.util.ArrayDeque;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class jc3 {
    public static final ArrayDeque g = new ArrayDeque();
    public static final Object h = new Object();
    public final MediaCodec a;
    public final HandlerThread b;
    public b3 c;
    public final AtomicReference d;
    public final km1 e;
    public boolean f;

    public jc3(MediaCodec mediaCodec, HandlerThread handlerThread) {
        km1 km1Var = new km1();
        this.a = mediaCodec;
        this.b = handlerThread;
        this.e = km1Var;
        this.d = new AtomicReference();
    }

    public static ic3 c() {
        ArrayDeque arrayDeque = g;
        synchronized (arrayDeque) {
            try {
                if (arrayDeque.isEmpty()) {
                    return new ic3();
                }
                return (ic3) arrayDeque.removeFirst();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void a() {
        if (this.f) {
            try {
                b3 b3Var = this.c;
                if (b3Var == null) {
                    throw null;
                }
                b3Var.removeCallbacksAndMessages(null);
                km1 km1Var = this.e;
                synchronized (km1Var) {
                    km1Var.a = false;
                }
                b3 b3Var2 = this.c;
                if (b3Var2 == null) {
                    throw null;
                }
                b3Var2.obtainMessage(3).sendToTarget();
                synchronized (km1Var) {
                    while (!km1Var.a) {
                        km1Var.wait();
                    }
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e);
            }
        }
    }

    public final void b() {
        RuntimeException runtimeException = (RuntimeException) this.d.getAndSet(null);
        if (runtimeException != null) {
            throw runtimeException;
        }
    }
}
