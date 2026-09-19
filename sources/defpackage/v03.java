package defpackage;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class v03 extends AbstractSet {
    public final /* synthetic */ int f;
    public final /* synthetic */ x03 g;

    public /* synthetic */ v03(x03 x03Var, int i) {
        this.f = i;
        this.g = x03Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.f) {
            case 0:
                this.g.clear();
                break;
            default:
                this.g.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        w03 w03VarA;
        int i = this.f;
        x03 x03Var = this.g;
        switch (i) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                x03Var.getClass();
                Object key = entry.getKey();
                w03 w03Var = null;
                if (key != null) {
                    try {
                        w03VarA = x03Var.a(key, false);
                    } catch (ClassCastException unused) {
                        w03VarA = null;
                    }
                    break;
                } else {
                    w03VarA = null;
                }
                if (w03VarA != null && Objects.equals(w03VarA.l, entry.getValue())) {
                    w03Var = w03VarA;
                }
                return w03Var != null;
            default:
                return x03Var.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f) {
            case 0:
                return new u03(this.g, 0);
            default:
                return new u03(this.g, 1);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        w03 w03VarA;
        int i = this.f;
        w03 w03VarA2 = null;
        x03 x03Var = this.g;
        switch (i) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                x03Var.getClass();
                Object key = entry.getKey();
                if (key != null) {
                    try {
                        w03VarA = x03Var.a(key, false);
                    } catch (ClassCastException unused) {
                        w03VarA = null;
                    }
                    break;
                } else {
                    w03VarA = null;
                }
                if (w03VarA != null && Objects.equals(w03VarA.l, entry.getValue())) {
                    w03VarA2 = w03VarA;
                }
                if (w03VarA2 == null) {
                    return false;
                }
                x03Var.b(w03VarA2, true);
                return true;
            default:
                x03Var.getClass();
                if (obj != null) {
                    try {
                        w03VarA2 = x03Var.a(obj, false);
                        break;
                    } catch (ClassCastException unused2) {
                    }
                }
                if (w03VarA2 != null) {
                    x03Var.b(w03VarA2, true);
                }
                return w03VarA2 != null;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        switch (this.f) {
            case 0:
                break;
        }
        return this.g.h;
    }
}
