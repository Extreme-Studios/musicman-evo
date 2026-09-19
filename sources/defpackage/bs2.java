package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class bs2 {
    public static final bs2 b = new bs2();
    public static final as2 c = new as2();
    public final AtomicReference a = new AtomicReference();

    public final as2 a() {
        as2 as2Var = (as2) this.a.get();
        return as2Var == null ? c : as2Var;
    }
}
