package defpackage;

import java.util.function.Supplier;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class co0 implements Supplier {
    public final /* synthetic */ int a;
    public static final /* synthetic */ co0 c = new co0(1);
    public static final /* synthetic */ co0 b = new co0(0);

    public /* synthetic */ co0(int i) {
        this.a = i;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        return this.a != 0 ? qo0.a(null) : new fo0();
    }
}
