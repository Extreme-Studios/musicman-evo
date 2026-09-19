package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class n03 extends o03 implements Iterable {
    public final ArrayList f = new ArrayList();

    @Override // defpackage.o03
    public final String a() {
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        if (size == 1) {
            return ((o03) arrayList.get(0)).a();
        }
        j7.e(ec.j(new StringBuilder(String.valueOf(size).length() + 37), "Array must have size 1, but has size ", size));
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof n03) && ((n03) obj).f.equals(this.f);
        }
        return true;
    }

    public final int hashCode() {
        return this.f.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f.iterator();
    }
}
