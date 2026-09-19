package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class ht1 {
    public static final ht1 f;
    public static final ht1 g;
    public static final ht1 h;
    public static final /* synthetic */ ht1[] i;

    static {
        ht1 ht1Var = new ht1("AD_REQUESTED", 0);
        f = ht1Var;
        ht1 ht1Var2 = new ht1("AD_LOADED", 1);
        g = ht1Var2;
        ht1 ht1Var3 = new ht1("AD_LOAD_FAILED", 2);
        h = ht1Var3;
        i = new ht1[]{ht1Var, ht1Var2, ht1Var3};
    }

    public static ht1[] values() {
        return (ht1[]) i.clone();
    }
}
