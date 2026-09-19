package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class ni1 implements oi1 {
    public final Map a;

    public ni1(Map map) {
        this.a = map;
    }

    @Override // defpackage.oi1
    public final tw1 a(String str, int i) {
        return (tw1) this.a.get(str);
    }
}
