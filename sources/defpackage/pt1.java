package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class pt1 {
    public static final pt1 f;
    public static final pt1 g;
    public static final pt1 h;
    public static final pt1 i;
    public static final /* synthetic */ pt1[] j;

    static {
        pt1 pt1Var = new pt1("UNKNOWN", 0);
        f = pt1Var;
        pt1 pt1Var2 = new pt1("API", 1);
        g = pt1Var2;
        pt1 pt1Var3 = new pt1("GESTURE", 2);
        h = pt1Var3;
        pt1 pt1Var4 = new pt1("DEBUG_MENU", 3);
        i = pt1Var4;
        j = new pt1[]{pt1Var, pt1Var2, pt1Var3, pt1Var4};
    }

    public static pt1[] values() {
        return (pt1[]) j.clone();
    }
}
