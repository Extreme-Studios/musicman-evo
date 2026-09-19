package defpackage;

import java.lang.reflect.Method;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: classes.dex */
public final class is0 {
    public final nr0 a;
    public final String b;
    public final String c;
    public final Class[] e;
    public volatile Method d = null;
    public final CountDownLatch f = new CountDownLatch(1);

    public is0(nr0 nr0Var, String str, String str2, Class... clsArr) {
        this.a = nr0Var;
        this.b = str;
        this.c = str2;
        this.e = clsArr;
        nr0Var.b.submit(new q7(21, this));
    }
}
