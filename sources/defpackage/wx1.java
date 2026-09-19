package defpackage;

import android.os.Handler;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class wx1 {
    public static final ArrayList b = new ArrayList(50);
    public final Handler a;

    public wx1(Handler handler) {
        this.a = handler;
    }

    public static /* synthetic */ void e(ox1 ox1Var) {
        ArrayList arrayList = b;
        synchronized (arrayList) {
            try {
                if (arrayList.size() < 50) {
                    arrayList.add(ox1Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static ox1 f() {
        ox1 ox1Var;
        ArrayList arrayList = b;
        synchronized (arrayList) {
            try {
                ox1Var = arrayList.isEmpty() ? new ox1() : (ox1) arrayList.remove(arrayList.size() - 1);
            } catch (Throwable th) {
                throw th;
            }
        }
        return ox1Var;
    }

    public final ox1 a(int i, Object obj) {
        ox1 ox1VarF = f();
        ox1VarF.a = this.a.obtainMessage(i, obj);
        return ox1VarF;
    }

    public final void b(int i) {
        this.a.sendEmptyMessage(i);
    }

    public final void c(int i) {
        this.a.removeMessages(i);
    }

    public final void d(Runnable runnable) {
        this.a.post(runnable);
    }
}
