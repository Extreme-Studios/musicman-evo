package defpackage;

import android.content.Context;
import android.os.Build;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class g91 implements r63 {
    public final /* synthetic */ int a;
    public final s63 b;
    public final s63 c;

    public /* synthetic */ g91(s63 s63Var, s63 s63Var2, int i) {
        this.a = i;
        this.b = s63Var;
        this.c = s63Var2;
    }

    @Override // defpackage.v63
    public final Object c() {
        int i = this.a;
        s63 s63Var = this.c;
        s63 s63Var2 = this.b;
        switch (i) {
            case 0:
                return new f91((Context) s63Var2.a, (h73) s63Var.a);
            case 1:
                ExecutorService executorService = (ExecutorService) s63Var2.a;
                vc2 vc2Var = (vc2) s63Var.a;
                String str = Build.VERSION.RELEASE;
                String str2 = Build.MODEL;
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 30 + String.valueOf(str2).length() + 1);
                ec.x(sb, "Mozilla/5.0 (Linux; Android ", str, "; ", str2);
                sb.append(")");
                return new gd2(executorService, sb.toString(), vc2Var.M());
            case 2:
                return new xg2((Context) s63Var2.a, (ExecutorService) s63Var.a);
            default:
                return new ah2((Context) s63Var2.a, (ExecutorService) s63Var.a);
        }
    }
}
