package defpackage;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class g33 extends dl2 {
    public final h33 g;
    public dl2 h;

    public g33(i33 i33Var) {
        super(1);
        this.g = new h33(i33Var);
        this.h = b();
    }

    @Override // defpackage.dl2
    public final byte a() {
        dl2 dl2Var = this.h;
        if (dl2Var == null) {
            throw new NoSuchElementException();
        }
        byte bA = dl2Var.a();
        if (!this.h.hasNext()) {
            this.h = b();
        }
        return bA;
    }

    public final j13 b() {
        h33 h33Var = this.g;
        if (h33Var.hasNext()) {
            return new j13(h33Var.next());
        }
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.h != null;
    }
}
