package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ag3 {
    public final cy0 a;
    public final int[] b;

    public ag3(cy0 cy0Var, int[] iArr) {
        if (iArr.length == 0) {
            s90.b0("ETSDefinition", "Empty tracks are not allowed", new IllegalArgumentException());
        }
        this.a = cy0Var;
        this.b = iArr;
    }
}
