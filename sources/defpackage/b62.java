package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class b62 {
    public static final b62 f;
    public static final b62 g;
    public static final b62 h;
    public static final /* synthetic */ b62[] i;

    static {
        b62 b62Var = new b62("Rewarded", 0);
        f = b62Var;
        b62 b62Var2 = new b62("Interstitial", 1);
        g = b62Var2;
        b62 b62Var3 = new b62("AppOpen", 2);
        h = b62Var3;
        i = new b62[]{b62Var, b62Var2, b62Var3};
    }

    public static b62[] values() {
        return (b62[]) i.clone();
    }
}
