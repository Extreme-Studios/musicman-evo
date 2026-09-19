package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class ek2 extends dl2 {
    public Object g;
    public int h;
    public final /* synthetic */ int i;
    public final Iterator j;
    public final /* synthetic */ Object k;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ek2(yk2 yk2Var, Set set, Set set2) {
        this();
        this.i = 1;
        this.k = set2;
        this.j = set.iterator();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // java.util.Iterator
    public final boolean hasNext() {
        Object next;
        hn.M(this.h != 4);
        int i = this.h;
        int i2 = i - 1;
        Object obj = null;
        if (i == 0) {
            throw null;
        }
        if (i2 == 0) {
            return true;
        }
        if (i2 != 2) {
            this.h = 4;
            int i3 = this.i;
            Object obj2 = this.k;
            Iterator it = this.j;
            switch (i3) {
                case 0:
                    while (true) {
                        if (!it.hasNext()) {
                            this.h = 3;
                            break;
                        } else {
                            next = it.next();
                            if (((zh2) obj2).b(next)) {
                                obj = next;
                                break;
                            }
                        }
                    }
                    break;
                default:
                    while (true) {
                        if (!it.hasNext()) {
                            this.h = 3;
                            break;
                        } else {
                            next = it.next();
                            if (((Set) obj2).contains(next)) {
                                obj = next;
                                break;
                            }
                        }
                    }
                    break;
            }
            this.g = obj;
            if (this.h != 3) {
                this.h = 1;
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.dl2, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.h = 2;
        Object obj = this.g;
        this.g = null;
        return obj;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ek2(Iterator it, zh2 zh2Var) {
        this();
        this.i = 0;
        this.j = it;
        this.k = zh2Var;
    }

    public ek2() {
        super(0);
        this.h = 2;
    }
}
