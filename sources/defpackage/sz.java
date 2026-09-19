package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class sz extends tz {
    public static List H(rz rzVar) {
        Iterator it = rzVar.iterator();
        if (!it.hasNext()) {
            return lh.f;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return a23.g(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }
}
