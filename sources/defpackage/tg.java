package defpackage;

import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: loaded from: classes.dex */
public final class tg extends s90 {
    public final /* synthetic */ s90 x;
    public final /* synthetic */ ThreadPoolExecutor y;

    public tg(s90 s90Var, ThreadPoolExecutor threadPoolExecutor) {
        this.x = s90Var;
        this.y = threadPoolExecutor;
    }

    @Override // defpackage.s90
    public final void j(Throwable th) {
        ThreadPoolExecutor threadPoolExecutor = this.y;
        try {
            this.x.j(th);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }

    @Override // defpackage.s90
    public final void k(u40 u40Var) {
        ThreadPoolExecutor threadPoolExecutor = this.y;
        try {
            this.x.k(u40Var);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }
}
