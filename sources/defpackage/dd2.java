package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class dd2 {
    public static final dd2 f;
    public static final dd2 g;
    public static final dd2 h;
    public static final /* synthetic */ dd2[] i;

    static {
        dd2 dd2Var = new dd2("QUERY", 0);
        f = dd2Var;
        dd2 dd2Var2 = new dd2("VIEW", 1);
        g = dd2Var2;
        dd2 dd2Var3 = new dd2("CLICK", 2);
        h = dd2Var3;
        i = new dd2[]{dd2Var, dd2Var2, dd2Var3};
    }

    public static dd2[] values() {
        return (dd2[]) i.clone();
    }
}
