package defpackage;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public abstract class k63 implements Iterator, Closeable {
    public static final gn0 l = new gn0("eof ", 1);
    public bn0 f;
    public lk g;
    public dn0 h = null;
    public long i = 0;
    public long j = 0;
    public final ArrayList k = new ArrayList();

    static {
        na1.y(k63.class);
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final dn0 next() {
        dn0 dn0VarA;
        dn0 dn0Var = this.h;
        if (dn0Var != null && dn0Var != l) {
            this.h = null;
            return dn0Var;
        }
        lk lkVar = this.g;
        if (lkVar == null || this.i >= this.j) {
            this.h = l;
            throw new NoSuchElementException();
        }
        try {
            synchronized (lkVar) {
                ((ByteBuffer) this.g.g).position((int) this.i);
                dn0VarA = this.f.a(this.g, this);
                this.i = this.g.g();
            }
            return dn0VarA;
        } catch (EOFException unused) {
            throw new NoSuchElementException();
        } catch (IOException unused2) {
            throw new NoSuchElementException();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        dn0 dn0Var = this.h;
        gn0 gn0Var = l;
        if (dn0Var == gn0Var) {
            return false;
        }
        if (dn0Var != null) {
            return true;
        }
        try {
            this.h = next();
            return true;
        } catch (NoSuchElementException unused) {
            this.h = gn0Var;
            return false;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("[");
        int i = 0;
        while (true) {
            ArrayList arrayList = this.k;
            if (i >= arrayList.size()) {
                sb.append("]");
                return sb.toString();
            }
            if (i > 0) {
                sb.append(";");
            }
            sb.append(((dn0) arrayList.get(i)).toString());
            i++;
        }
    }

    public void close() {
    }
}
