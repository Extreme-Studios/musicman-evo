package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class gk2 implements Iterator {
    public static final gk2 f;
    public static final /* synthetic */ gk2[] g;

    static {
        gk2 gk2Var = new gk2("INSTANCE", 0);
        f = gk2Var;
        g = new gk2[]{gk2Var};
    }

    public static gk2[] values() {
        return (gk2[]) g.clone();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        hn.N("no calls to next() since the last call to remove()", false);
    }
}
