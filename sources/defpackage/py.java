package defpackage;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class py implements Iterable {
    public my f;
    public my g;
    public final WeakHashMap h = new WeakHashMap();
    public int i = 0;

    public my a(Object obj) {
        my myVar = this.f;
        while (myVar != null && !myVar.f.equals(obj)) {
            myVar = myVar.h;
        }
        return myVar;
    }

    public Object b(Object obj) {
        my myVarA = a(obj);
        if (myVarA == null) {
            return null;
        }
        this.i--;
        WeakHashMap weakHashMap = this.h;
        if (!weakHashMap.isEmpty()) {
            Iterator it = weakHashMap.keySet().iterator();
            while (it.hasNext()) {
                ((oy) it.next()).a(myVarA);
            }
        }
        my myVar = myVarA.i;
        my myVar2 = myVarA.h;
        if (myVar != null) {
            myVar.h = myVar2;
        } else {
            this.f = myVar2;
        }
        my myVar3 = myVarA.h;
        if (myVar3 != null) {
            myVar3.i = myVar;
        } else {
            this.g = myVar;
        }
        myVarA.h = null;
        myVarA.i = null;
        return myVarA.g;
    }

    public final boolean equals(Object obj) {
        ly lyVar;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof py)) {
            return false;
        }
        py pyVar = (py) obj;
        if (this.i != pyVar.i) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = pyVar.iterator();
        while (true) {
            lyVar = (ly) it;
            if (!lyVar.hasNext()) {
                break;
            }
            ly lyVar2 = (ly) it2;
            if (!lyVar2.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) lyVar.next();
            Object next = lyVar2.next();
            if ((entry == null && next != null) || (entry != null && !entry.equals(next))) {
                return false;
            }
        }
        return (lyVar.hasNext() || ((ly) it2).hasNext()) ? false : true;
    }

    public final int hashCode() {
        Iterator it = iterator();
        int iHashCode = 0;
        while (true) {
            ly lyVar = (ly) it;
            if (!lyVar.hasNext()) {
                return iHashCode;
            }
            iHashCode += ((Map.Entry) lyVar.next()).hashCode();
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        ly lyVar = new ly(this.f, this.g, 0);
        this.h.put(lyVar, Boolean.FALSE);
        return lyVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        Iterator it = iterator();
        while (true) {
            ly lyVar = (ly) it;
            if (!lyVar.hasNext()) {
                sb.append("]");
                return sb.toString();
            }
            sb.append(((Map.Entry) lyVar.next()).toString());
            if (lyVar.hasNext()) {
                sb.append(", ");
            }
        }
    }
}
