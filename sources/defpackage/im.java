package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public final class im extends lc implements se {
    public final Handler h;
    public final boolean i;
    public final im j;

    public im(Handler handler, boolean z) {
        this.h = handler;
        this.i = z;
        this.j = z ? this : new im(handler, true);
    }

    @Override // defpackage.lc
    public final void a(ic icVar, Runnable runnable) {
        if (this.h.post(runnable)) {
            return;
        }
        rs0.e(icVar, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        ke keVar = jf.a;
        ge.h.a(icVar, runnable);
    }

    @Override // defpackage.lc
    public final boolean c(ic icVar) {
        return (this.i && jn.b(Looper.myLooper(), this.h.getLooper())) ? false : true;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof im)) {
            return false;
        }
        im imVar = (im) obj;
        return imVar.h == this.h && imVar.i == this.i;
    }

    public final int hashCode() {
        return (this.i ? 1231 : 1237) ^ System.identityHashCode(this.h);
    }

    @Override // defpackage.lc
    public final String toString() {
        im imVar;
        String str;
        ke keVar = jf.a;
        im imVar2 = cq.a;
        if (this == imVar2) {
            str = "Dispatchers.Main";
        } else {
            try {
                imVar = imVar2.j;
            } catch (UnsupportedOperationException unused) {
                imVar = null;
            }
            str = this == imVar ? "Dispatchers.Main.immediate" : null;
        }
        if (str != null) {
            return str;
        }
        String string = this.h.toString();
        if (!this.i) {
            return string;
        }
        return string + ".immediate";
    }
}
