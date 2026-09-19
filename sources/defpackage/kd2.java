package defpackage;

import java.io.File;
import java.util.concurrent.ExecutorService;
import java.util.function.Function;

/* JADX INFO: loaded from: classes.dex */
public final class kd2 {
    public final File a;
    public final ExecutorService b;
    public final jd2 c;
    public final Function d;

    public kd2(File file, ExecutorService executorService, jd2 jd2Var, Function function) {
        this.a = file;
        this.b = executorService;
        this.c = jd2Var;
        this.d = function;
    }

    public final xn2 a(Object obj) {
        return na1.F(new hq0(this, 12, obj), this.b);
    }
}
