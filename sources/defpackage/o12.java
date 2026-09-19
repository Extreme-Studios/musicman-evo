package defpackage;

import android.content.Intent;

/* JADX INFO: loaded from: classes.dex */
public final class o12 implements r63 {
    public final v63 a;
    public final v63 b;

    public o12(xe1 xe1Var, q63 q63Var) {
        this.a = xe1Var;
        this.b = q63Var;
    }

    @Override // defpackage.v63
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final c02 c() {
        return new c02(((xe1) this.a).a(), 4, (Intent) this.b.c());
    }
}
