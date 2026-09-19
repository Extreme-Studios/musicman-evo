package defpackage;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;

/* JADX INFO: loaded from: classes.dex */
public final class v12 implements r63 {
    public final v63 a;
    public final v63 b;
    public final v63 c;

    public v12(q63 q63Var, q63 q63Var2, xe1 xe1Var) {
        this.a = q63Var;
        this.b = q63Var2;
        this.c = xe1Var;
    }

    @Override // defpackage.v63
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final g02 c() {
        return new g02((ApplicationInfo) this.a.c(), (PackageInfo) this.b.c(), ((xe1) this.c).a(), 2);
    }
}
