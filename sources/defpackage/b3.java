package defpackage;

import android.content.DialogInterface;
import android.media.MediaCodec;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class b3 extends Handler {
    public final /* synthetic */ int a = 0;
    public Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b3(jc3 jc3Var, Looper looper) {
        super(looper);
        Objects.requireNonNull(jc3Var);
        this.b = jc3Var;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        switch (this.a) {
            case 0:
                int i = message.what;
                if (i == -3 || i == -2 || i == -1) {
                    ((DialogInterface.OnClickListener) message.obj).onClick((DialogInterface) ((WeakReference) this.b).get(), message.what);
                    return;
                } else {
                    if (i != 1) {
                        return;
                    }
                    ((DialogInterface) message.obj).dismiss();
                    return;
                }
            default:
                jc3 jc3Var = (jc3) this.b;
                jc3Var.getClass();
                int i2 = message.what;
                ic3 ic3Var = null;
                if (i2 == 1) {
                    ic3 ic3Var2 = (ic3) message.obj;
                    try {
                        jc3Var.a.queueInputBuffer(ic3Var2.a, 0, ic3Var2.b, ic3Var2.d, ic3Var2.e);
                        break;
                    } catch (RuntimeException e) {
                        AtomicReference atomicReference = jc3Var.d;
                        while (!atomicReference.compareAndSet(null, e) && atomicReference.get() == null) {
                        }
                    }
                    ic3Var = ic3Var2;
                } else if (i2 == 2) {
                    ic3 ic3Var3 = (ic3) message.obj;
                    int i3 = ic3Var3.a;
                    MediaCodec.CryptoInfo cryptoInfo = ic3Var3.c;
                    long j = ic3Var3.d;
                    int i4 = ic3Var3.e;
                    try {
                        synchronized (jc3.h) {
                            try {
                                jc3Var.a.queueSecureInputBuffer(i3, 0, cryptoInfo, j, i4);
                            } catch (Throwable th) {
                                throw th;
                            }
                            break;
                        }
                    } catch (RuntimeException e2) {
                        AtomicReference atomicReference2 = jc3Var.d;
                        while (!atomicReference2.compareAndSet(null, e2) && atomicReference2.get() == null) {
                        }
                    }
                    ic3Var = ic3Var3;
                } else if (i2 == 3) {
                    jc3Var.e.a();
                } else if (i2 != 4) {
                    AtomicReference atomicReference3 = jc3Var.d;
                    IllegalStateException illegalStateException = new IllegalStateException(String.valueOf(i2));
                    while (!atomicReference3.compareAndSet(null, illegalStateException) && atomicReference3.get() == null) {
                    }
                } else {
                    try {
                        jc3Var.a.setParameters((Bundle) message.obj);
                        break;
                    } catch (RuntimeException e3) {
                        AtomicReference atomicReference4 = jc3Var.d;
                        while (!atomicReference4.compareAndSet(null, e3) && atomicReference4.get() == null) {
                        }
                    }
                }
                if (ic3Var != null) {
                    ArrayDeque arrayDeque = jc3.g;
                    synchronized (arrayDeque) {
                        arrayDeque.add(ic3Var);
                        break;
                    }
                    return;
                }
                return;
        }
    }

    public /* synthetic */ b3() {
    }
}
