package defpackage;

import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;

/* JADX INFO: loaded from: classes.dex */
public final class vb0 extends HandlerThread implements Handler.Callback {
    public jn1 f;
    public Handler g;
    public Error h;
    public RuntimeException i;
    public wb0 j;

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        try {
            if (i == 1) {
                try {
                    int i2 = message.arg1;
                    jn1 jn1Var = this.f;
                    if (jn1Var == null) {
                        throw null;
                    }
                    jn1Var.a(i2);
                    SurfaceTexture surfaceTexture = this.f.k;
                    surfaceTexture.getClass();
                    this.j = new wb0(this, surfaceTexture, i2 != 0);
                    synchronized (this) {
                        notify();
                    }
                    return true;
                } catch (Error e) {
                    s90.b0("PlaceholderSurface", "Failed to initialize placeholder surface", e);
                    this.h = e;
                    synchronized (this) {
                        notify();
                    }
                } catch (RuntimeException e2) {
                    s90.b0("PlaceholderSurface", "Failed to initialize placeholder surface", e2);
                    this.i = e2;
                    synchronized (this) {
                        notify();
                    }
                } catch (ln1 e3) {
                    s90.b0("PlaceholderSurface", "Failed to initialize placeholder surface", e3);
                    this.i = new IllegalStateException(e3);
                    synchronized (this) {
                        notify();
                    }
                }
            } else if (i == 2) {
                try {
                    jn1 jn1Var2 = this.f;
                    if (jn1Var2 == null) {
                        throw null;
                    }
                    jn1Var2.b();
                    return true;
                } catch (Throwable th) {
                    try {
                        s90.b0("PlaceholderSurface", "Failed to release placeholder surface", th);
                    } finally {
                        quit();
                    }
                }
            }
            return true;
        } catch (Throwable th2) {
            synchronized (this) {
                notify();
                throw th2;
            }
        }
    }
}
