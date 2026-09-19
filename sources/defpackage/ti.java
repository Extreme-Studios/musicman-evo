package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class ti implements pg {
    public final Context f;
    public final si g;
    public final gm h;
    public final Object i = new Object();
    public Handler j;
    public ThreadPoolExecutor k;
    public ThreadPoolExecutor l;
    public s90 m;

    public ti(Context context, si siVar) {
        a23.f(context, "Context cannot be null");
        this.f = context.getApplicationContext();
        this.g = siVar;
        this.h = ui.d;
    }

    @Override // defpackage.pg
    public final void a(s90 s90Var) {
        synchronized (this.i) {
            this.m = s90Var;
        }
        synchronized (this.i) {
            try {
                if (this.m == null) {
                    return;
                }
                if (this.k == null) {
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new za("emojiCompat"));
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                    this.l = threadPoolExecutor;
                    this.k = threadPoolExecutor;
                }
                this.k.execute(new x1(5, this));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b() {
        synchronized (this.i) {
            try {
                this.m = null;
                Handler handler = this.j;
                if (handler != null) {
                    handler.removeCallbacks(null);
                }
                this.j = null;
                ThreadPoolExecutor threadPoolExecutor = this.l;
                if (threadPoolExecutor != null) {
                    threadPoolExecutor.shutdown();
                }
                this.k = null;
                this.l = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final dj c() {
        try {
            gm gmVar = this.h;
            Context context = this.f;
            si siVar = this.g;
            gmVar.getClass();
            ArrayList arrayList = new ArrayList(1);
            Object obj = new Object[]{siVar}[0];
            Objects.requireNonNull(obj);
            arrayList.add(obj);
            e3 e3VarA = ri.a(context, Collections.unmodifiableList(arrayList));
            int i = e3VarA.g;
            if (i != 0) {
                throw new RuntimeException("fetchFonts failed (" + i + ")");
            }
            dj[] djVarArr = (dj[]) ((List) e3VarA.h).get(0);
            if (djVarArr == null || djVarArr.length == 0) {
                throw new RuntimeException("fetchFonts failed (empty result)");
            }
            return djVarArr[0];
        } catch (PackageManager.NameNotFoundException e) {
            j7.h("provider not found", e);
            return null;
        }
    }
}
