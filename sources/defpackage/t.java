package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public class t implements Iterator {
    public final /* synthetic */ int f;
    public int g;
    public final Object h;

    public t(m63 m63Var) {
        this.f = 2;
        this.h = m63Var;
        this.g = 0;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.f;
        Object obj = this.h;
        switch (i) {
            case 0:
                return this.g < ((w) obj).a();
            case 1:
                return this.g < ((Object[]) obj).length;
            default:
                m63 m63Var = (m63) obj;
                return this.g < m63Var.f.size() || m63Var.g.hasNext();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f;
        Object obj = this.h;
        switch (i) {
            case 0:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                int i2 = this.g;
                this.g = i2 + 1;
                return ((w) obj).get(i2);
            case 1:
                try {
                    int i3 = this.g;
                    this.g = i3 + 1;
                    return ((Object[]) obj)[i3];
                } catch (ArrayIndexOutOfBoundsException e) {
                    this.g--;
                    throw new NoSuchElementException(e.getMessage());
                }
            default:
                int i4 = this.g;
                m63 m63Var = (m63) obj;
                List list = m63Var.f;
                if (i4 >= list.size()) {
                    list.add(m63Var.g.next());
                    return next();
                }
                int i5 = this.g;
                this.g = i5 + 1;
                return list.get(i5);
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException();
        }
    }

    public /* synthetic */ t(int i, Object obj) {
        this.f = i;
        this.h = obj;
    }
}
