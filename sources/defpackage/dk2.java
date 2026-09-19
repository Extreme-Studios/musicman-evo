package defpackage;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class dk2 extends ej2 implements Serializable {
    public final transient vk2 i;
    public final transient int j;
    public transient ck2 k;

    public dk2(vk2 vk2Var, int i) {
        this.i = vk2Var;
        this.j = i;
        Object[] objArr = wk2.n;
    }

    @Override // defpackage.cj2
    public final /* synthetic */ Collection a() {
        return new zj2(this);
    }

    @Override // defpackage.cj2
    public final Map b() {
        throw new AssertionError("should never be called");
    }

    @Override // defpackage.cj2
    public final boolean c(Object obj) {
        return obj != null && super.c(obj);
    }

    @Override // defpackage.cj2
    public /* synthetic */ Map d() {
        return this.i;
    }
}
