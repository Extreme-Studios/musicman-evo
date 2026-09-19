package defpackage;

import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public final class v extends w implements RandomAccess {
    public final w f;
    public final int g;
    public final int h;

    public v(w wVar, int i, int i2) {
        this.f = wVar;
        this.g = i;
        v51.c(i, i2, wVar.a());
        this.h = i2 - i;
    }

    @Override // defpackage.w
    public final int a() {
        return this.h;
    }

    @Override // java.util.List
    public final Object get(int i) {
        int i2 = this.h;
        if (i < 0 || i >= i2) {
            j7.g("index: ", i, ", size: ", i2);
            return null;
        }
        return this.f.get(this.g + i);
    }

    @Override // defpackage.w, java.util.List
    public final List subList(int i, int i2) {
        v51.c(i, i2, this.h);
        int i3 = this.g;
        return new v(this.f, i + i3, i3 + i2);
    }
}
