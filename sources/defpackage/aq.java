package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class aq {
    public final /* synthetic */ int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public final Object f;
    public final Object g;

    public aq(int i) {
        this.a = 0;
        this.b = i;
        if (i <= 0) {
            j7.p("maxSize <= 0");
            throw null;
        }
        this.f = new kc2(5);
        this.g = new ig(15);
    }

    public Object a(Object obj) {
        synchronized (((ig) this.g)) {
            kc2 kc2Var = (kc2) this.f;
            kc2Var.getClass();
            Object obj2 = ((LinkedHashMap) kc2Var.g).get(obj);
            if (obj2 != null) {
                this.d++;
                return obj2;
            }
            this.e++;
            return null;
        }
    }

    public Object b(Object obj, Object obj2) {
        Object objPut;
        synchronized (((ig) this.g)) {
            this.c++;
            objPut = ((LinkedHashMap) ((kc2) this.f).g).put(obj, obj2);
            if (objPut != null) {
                this.c--;
            }
        }
        int i = this.b;
        while (true) {
            synchronized (((ig) this.g)) {
                try {
                    if (this.c < 0 || (((LinkedHashMap) ((kc2) this.f).g).isEmpty() && this.c != 0)) {
                        break;
                    }
                    if (this.c > i && !((LinkedHashMap) ((kc2) this.f).g).isEmpty()) {
                        Set setEntrySet = ((LinkedHashMap) ((kc2) this.f).g).entrySet();
                        setEntrySet.getClass();
                        Object next = null;
                        if (setEntrySet instanceof List) {
                            List list = (List) setEntrySet;
                            if (!list.isEmpty()) {
                                next = list.get(0);
                            }
                        } else {
                            Iterator it = setEntrySet.iterator();
                            if (it.hasNext()) {
                                next = it.next();
                            }
                        }
                        Map.Entry entry = (Map.Entry) next;
                        if (entry == null) {
                            return objPut;
                        }
                        Object key = entry.getKey();
                        Object value = entry.getValue();
                        kc2 kc2Var = (kc2) this.f;
                        kc2Var.getClass();
                        key.getClass();
                        ((LinkedHashMap) kc2Var.g).remove(key);
                        int i2 = this.c;
                        value.getClass();
                        this.c = i2 - 1;
                    }
                    return objPut;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        throw new IllegalStateException("LruCache.sizeOf() is reporting inconsistent results!");
    }

    public void c(int i, float f) {
        og3 og3Var;
        og3[] og3VarArr = (og3[]) this.g;
        ArrayList arrayList = (ArrayList) this.f;
        if (this.b != 1) {
            Collections.sort(arrayList, ts.v);
            this.b = 1;
        }
        int i2 = this.e;
        if (i2 > 0) {
            int i3 = i2 - 1;
            this.e = i3;
            og3Var = og3VarArr[i3];
        } else {
            og3Var = new og3();
        }
        int i4 = this.c;
        this.c = i4 + 1;
        og3Var.a = i4;
        og3Var.b = i;
        og3Var.c = f;
        arrayList.add(og3Var);
        this.d += i;
        while (true) {
            int i5 = this.d;
            if (i5 <= 2000) {
                return;
            }
            int i6 = i5 - 2000;
            og3 og3Var2 = (og3) arrayList.get(0);
            int i7 = og3Var2.b;
            if (i7 <= i6) {
                this.d -= i7;
                arrayList.remove(0);
                int i8 = this.e;
                if (i8 < 5) {
                    this.e = i8 + 1;
                    og3VarArr[i8] = og3Var2;
                }
            } else {
                og3Var2.b = i7 - i6;
                this.d -= i6;
            }
        }
    }

    public float d() {
        ArrayList arrayList = (ArrayList) this.f;
        if (this.b != 0) {
            Collections.sort(arrayList, ts.u);
            this.b = 0;
        }
        float f = this.d;
        int i = 0;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            float f2 = 0.5f * f;
            og3 og3Var = (og3) arrayList.get(i2);
            i += og3Var.b;
            if (i >= f2) {
                return og3Var.c;
            }
        }
        if (arrayList.isEmpty()) {
            return Float.NaN;
        }
        return ((og3) arrayList.get(arrayList.size() - 1)).c;
    }

    public String toString() {
        String str;
        switch (this.a) {
            case 0:
                synchronized (((ig) this.g)) {
                    try {
                        int i = this.d;
                        int i2 = this.e + i;
                        str = "LruCache[maxSize=" + this.b + ",hits=" + this.d + ",misses=" + this.e + ",hitRate=" + (i2 != 0 ? (i * 100) / i2 : 0) + "%]";
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return str;
            default:
                return super.toString();
        }
    }

    public aq() {
        this.a = 1;
        this.g = new og3[5];
        this.f = new ArrayList();
        this.b = -1;
    }
}
