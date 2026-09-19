package androidx.work;

import android.content.Context;
import defpackage.g2;
import defpackage.g90;
import defpackage.ig;
import defpackage.yp;
import defpackage.zm;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class WorkManagerInitializer implements zm {
    public static final String a = yp.f("WrkMgrInitializer");

    @Override // defpackage.zm
    public final List a() {
        return Collections.EMPTY_LIST;
    }

    @Override // defpackage.zm
    public final Object b(Context context) {
        yp.d().a(a, "Initializing WorkManager with default configuration.", new Throwable[0]);
        g90.c(context, new g2(new ig(10)));
        return g90.b(context);
    }
}
