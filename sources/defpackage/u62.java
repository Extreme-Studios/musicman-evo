package defpackage;

import java.util.Collections;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class u62 {
    public static final kn2 d = kn2.g;
    public final ya1 a;
    public final ScheduledExecutorService b;
    public final t62 c;

    public u62(ya1 ya1Var, ScheduledExecutorService scheduledExecutorService, t62 t62Var) {
        this.a = ya1Var;
        this.b = scheduledExecutorService;
        this.c = t62Var;
    }

    public final es0 a(hp hpVar, Object obj) {
        return new es0(this, obj, null, hpVar, Collections.singletonList(hpVar), hpVar);
    }
}
