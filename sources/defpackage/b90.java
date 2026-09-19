package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class b90 {
    public final g90 a;
    public final ArrayList b;
    public final ArrayList c = new ArrayList();

    static {
        yp.f("WorkContinuationImpl");
    }

    public b90(g90 g90Var, List list) {
        this.a = g90Var;
        this.b = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            String string = ((bv) list.get(i)).a.toString();
            this.b.add(string);
            this.c.add(string);
        }
    }

    public static boolean a(b90 b90Var, HashSet hashSet) {
        hashSet.addAll(b90Var.b);
        HashSet hashSet2 = new HashSet();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (hashSet2.contains((String) it.next())) {
                return true;
            }
        }
        hashSet.removeAll(b90Var.b);
        return false;
    }
}
