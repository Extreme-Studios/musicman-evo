package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class ny extends oy implements Iterator {
    public my f;
    public boolean g = true;
    public final /* synthetic */ py h;

    public ny(py pyVar) {
        this.h = pyVar;
    }

    @Override // defpackage.oy
    public final void a(my myVar) {
        my myVar2 = this.f;
        if (myVar == myVar2) {
            my myVar3 = myVar2.i;
            this.f = myVar3;
            this.g = myVar3 == null;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.g) {
            return this.h.f != null;
        }
        my myVar = this.f;
        return (myVar == null || myVar.h == null) ? false : true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.g) {
            this.g = false;
            this.f = this.h.f;
        } else {
            my myVar = this.f;
            this.f = myVar != null ? myVar.h : null;
        }
        return this.f;
    }
}
