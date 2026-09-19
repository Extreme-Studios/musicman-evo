package defpackage;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class ku1 {
    public final WeakReference a;
    public final Executor b;
    public final /* synthetic */ nv1 c;

    public ku1(nv1 nv1Var, jg3 jg3Var, Executor executor) {
        this.c = nv1Var;
        this.a = new WeakReference(jg3Var);
        this.b = executor;
    }
}
