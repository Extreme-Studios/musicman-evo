package defpackage;

import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class y41 implements er {
    public final Set a;
    public final boolean b;
    public final int c;
    public final boolean d;

    public y41(HashSet hashSet, boolean z, int i, boolean z2) {
        this.a = hashSet;
        this.b = z;
        this.c = i;
        this.d = z2;
    }

    @Override // defpackage.er
    public final boolean a() {
        return this.d;
    }

    @Override // defpackage.er
    public final boolean b() {
        return this.b;
    }

    @Override // defpackage.er
    public final Set c() {
        return this.a;
    }

    @Override // defpackage.er
    public final int d() {
        return this.c;
    }
}
