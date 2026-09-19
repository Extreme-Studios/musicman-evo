package defpackage;

import android.content.Context;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class cg2 extends ga2 {
    public final ud2 f;

    public cg2(Context context, ExecutorService executorService, ud2 ud2Var) {
        super(context, executorService, new ve3(), false);
        this.f = ud2Var;
    }

    @Override // defpackage.ga2
    public final void b(int i, long j) {
        this.f.b(i, j, null, null);
        new ve3().e(Boolean.TRUE);
    }

    @Override // defpackage.ga2
    public final void c(int i, long j, Exception exc) {
        this.f.b(i, j, exc, null);
        new ve3().e(Boolean.TRUE);
    }

    @Override // defpackage.ga2
    public final void d(String str, int i) {
        this.f.b(i, -1L, null, str);
        new ve3().e(Boolean.TRUE);
    }
}
