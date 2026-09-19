package defpackage;

import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class di extends py {
    public final HashMap j = new HashMap();

    @Override // defpackage.py
    public final my a(Object obj) {
        return (my) this.j.get(obj);
    }

    @Override // defpackage.py
    public final Object b(Object obj) {
        Object objB = super.b(obj);
        this.j.remove(obj);
        return objB;
    }
}
