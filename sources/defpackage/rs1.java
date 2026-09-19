package defpackage;

import android.content.Context;
import android.util.DisplayMetrics;
import java.io.File;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class rs1 implements r63 {
    public final /* synthetic */ int a;
    public final s63 b;

    public /* synthetic */ rs1(s63 s63Var, int i) {
        this.a = i;
        this.b = s63Var;
    }

    @Override // defpackage.v63
    public final Object c() {
        int i = this.a;
        s63 s63Var = this.b;
        switch (i) {
            case 0:
                return new kc2(24, (j21) s63Var.a);
            case 1:
                return new bz1((sf1) s63Var.a);
            case 2:
                return new xz1(3, (y32) s63Var.a);
            case 3:
                return new i22((k42) s63Var.a);
            case 4:
                File dir = ((Context) s63Var.a).getDir("yqzdkcache", 0);
                dq.D(dir);
                return dir;
            case 5:
                ExecutorService executorService = (ExecutorService) s63Var.a;
                if (executorService instanceof ya1) {
                    return (ya1) executorService;
                }
                return executorService instanceof ScheduledExecutorService ? new rn2((ScheduledExecutorService) executorService) : new ya1(executorService);
            case 6:
                return new ld2((ExecutorService) s63Var.a);
            default:
                DisplayMetrics displayMetrics = ((Context) s63Var.a).getResources().getDisplayMetrics();
                dq.D(displayMetrics);
                return displayMetrics;
        }
    }
}
