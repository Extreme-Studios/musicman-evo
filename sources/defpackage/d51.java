package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class d51 implements ht {
    public final Set a;
    public final boolean b;
    public final int c;
    public final qz0 d;
    public final boolean f;
    public final ArrayList e = new ArrayList();
    public final HashMap g = new HashMap();

    public d51(HashSet hashSet, boolean z, int i, qz0 qz0Var, List list, boolean z2) {
        this.a = hashSet;
        this.b = z;
        this.c = i;
        this.d = qz0Var;
        this.f = z2;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                if (str.startsWith("custom:")) {
                    String[] strArrSplit = str.split(":", 3);
                    if (strArrSplit.length == 3) {
                        if ("true".equals(strArrSplit[2])) {
                            this.g.put(strArrSplit[1], Boolean.TRUE);
                        } else if ("false".equals(strArrSplit[2])) {
                            this.g.put(strArrSplit[1], Boolean.FALSE);
                        }
                    }
                } else {
                    this.e.add(str);
                }
            }
        }
    }

    @Override // defpackage.er
    public final boolean a() {
        return this.f;
    }

    @Override // defpackage.er
    public final boolean b() {
        return this.b;
    }

    @Override // defpackage.er
    public final Set c() {
        return this.a;
    }

    @Override // defpackage.er
    public final int d() {
        return this.c;
    }
}
