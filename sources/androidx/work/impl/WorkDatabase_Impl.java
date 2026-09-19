package androidx.work.impl;

import android.content.Context;
import defpackage.a23;
import defpackage.dq;
import defpackage.hn;
import defpackage.i8;
import defpackage.j7;
import defpackage.md;
import defpackage.q20;
import defpackage.us2;
import defpackage.wd;
import defpackage.yd;
import defpackage.zy1;

/* JADX INFO: loaded from: classes.dex */
public final class WorkDatabase_Impl extends WorkDatabase {
    @Override // androidx.work.impl.WorkDatabase
    public final q20 c(wd wdVar) {
        us2 us2Var = new us2(wdVar, new zy1(8, this), 4, false);
        Context context = wdVar.b;
        String str = wdVar.c;
        if (context != null) {
            return wdVar.a.d(new md(context, str, us2Var, false));
        }
        j7.p("Must set a non-null context to create the configuration.");
        return null;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final hn d() {
        return null;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final dq e() {
        return null;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final dq f() {
        return null;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final a23 g() {
        return null;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final i8 h() {
        return null;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final yd i() {
        return null;
    }
}
