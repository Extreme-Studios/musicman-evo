package defpackage;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class j13 extends dl2 {
    public int g;
    public final int h;
    public final /* synthetic */ n13 i;

    public j13(n13 n13Var) {
        super(1);
        this.i = n13Var;
        this.g = 0;
        this.h = n13Var.d();
    }

    @Override // defpackage.dl2
    public final byte a() {
        int i = this.g;
        if (i >= this.h) {
            throw new NoSuchElementException();
        }
        this.g = i + 1;
        return this.i.c(i);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.g < this.h;
    }
}
