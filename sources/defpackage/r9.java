package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class r9 {
    public final HashMap a = new HashMap();
    public final HashMap b;

    public r9(HashMap map) {
        this.b = map;
        for (Map.Entry entry : map.entrySet()) {
            eo eoVar = (eo) entry.getValue();
            List arrayList = (List) this.a.get(eoVar);
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.a.put(eoVar, arrayList);
            }
            arrayList.add((s9) entry.getKey());
        }
    }

    public static void a(List list, mo moVar, eo eoVar, lo loVar) {
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                s9 s9Var = (s9) list.get(size);
                Method method = s9Var.b;
                try {
                    int i = s9Var.a;
                    if (i == 0) {
                        method.invoke(loVar, null);
                    } else if (i == 1) {
                        method.invoke(loVar, moVar);
                    } else if (i == 2) {
                        method.invoke(loVar, moVar, eoVar);
                    }
                } catch (IllegalAccessException e) {
                    throw new RuntimeException(e);
                } catch (InvocationTargetException e2) {
                    j7.h("Failed to call observer method", e2.getCause());
                    return;
                }
            }
        }
    }
}
