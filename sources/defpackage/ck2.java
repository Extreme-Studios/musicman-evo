package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class ck2 extends bk2 {
    public final /* synthetic */ int i = 0;
    public final transient Object j;

    public ck2(Object obj) {
        obj.getClass();
        this.j = obj;
    }

    @Override // defpackage.rj2
    public final dl2 a() {
        switch (this.i) {
            case 0:
                return new xj2((dk2) this.j);
            default:
                return new hk2(this.j);
        }
    }

    @Override // defpackage.rj2, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        int i = this.i;
        Object obj2 = this.j;
        switch (i) {
            case 0:
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    Object key = entry.getKey();
                    Object value = entry.getValue();
                    Collection collection = (Collection) ((vk2) ((dk2) obj2).d()).get(key);
                    if (collection != null && collection.contains(value)) {
                        return true;
                    }
                }
                return false;
            default:
                return obj2.equals(obj);
        }
    }

    @Override // defpackage.bk2, defpackage.rj2
    public vj2 e() {
        switch (this.i) {
            case 1:
                return vj2.i(this.j);
            default:
                return super.e();
        }
    }

    @Override // defpackage.rj2
    public final boolean f() {
        switch (this.i) {
        }
        return false;
    }

    @Override // defpackage.rj2
    public int g(Object[] objArr, int i) {
        switch (this.i) {
            case 1:
                objArr[i] = this.j;
                return i + 1;
            default:
                return super.g(objArr, i);
        }
    }

    @Override // defpackage.bk2, java.util.Collection, java.util.Set
    public int hashCode() {
        switch (this.i) {
            case 1:
                return this.j.hashCode();
            default:
                return super.hashCode();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        switch (this.i) {
            case 0:
                return new xj2((dk2) this.j);
            default:
                return new hk2(this.j);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        switch (this.i) {
            case 0:
                return ((dk2) this.j).j;
            default:
                return 1;
        }
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        switch (this.i) {
            case 1:
                String string = this.j.toString();
                return ec.n(new StringBuilder(String.valueOf(string).length() + 2), "[", string, "]");
            default:
                return super.toString();
        }
    }

    public ck2(dk2 dk2Var) {
        this.j = dk2Var;
    }
}
