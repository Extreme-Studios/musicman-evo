package defpackage;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class hk2 extends dl2 {
    public final Object g;
    public boolean h;

    public hk2(Object obj) {
        super(0);
        this.g = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.h;
    }

    @Override // defpackage.dl2, java.util.Iterator
    public final Object next() {
        if (this.h) {
            throw new NoSuchElementException();
        }
        this.h = true;
        return this.g;
    }
}
