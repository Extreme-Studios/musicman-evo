package defpackage;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.view.Surface;

/* JADX INFO: loaded from: classes.dex */
public final class wb0 extends Surface {
    public static int i;
    public static boolean j;
    public final boolean f;
    public final vb0 g;
    public boolean h;

    public /* synthetic */ wb0(vb0 vb0Var, SurfaceTexture surfaceTexture, boolean z) {
        super(surfaceTexture);
        this.g = vb0Var;
        this.f = z;
    }

    public static synchronized boolean a(Context context) {
        int i2;
        if (!j) {
            try {
                if (yd.u(context)) {
                    i2 = yd.G("EGL_KHR_surfaceless_context") ? 1 : 2;
                } else {
                    i2 = 0;
                }
            } catch (ln1 e) {
                s90.Y("PlaceholderSurface", "Failed to determine secure mode due to GL error: ".concat(String.valueOf(e.getMessage())));
            }
            i = i2;
            j = true;
        }
        return i != 0;
    }

    @Override // android.view.Surface
    public final void release() {
        super.release();
        vb0 vb0Var = this.g;
        synchronized (vb0Var) {
            try {
                if (!this.h) {
                    Handler handler = vb0Var.g;
                    handler.getClass();
                    handler.sendEmptyMessage(2);
                    this.h = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
