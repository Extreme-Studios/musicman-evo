package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class sc3 {
    public static final sc3 f;
    public static final sc3 g;
    public static final sc3 h;
    public static final sc3 i;
    public static final /* synthetic */ sc3[] j;

    static {
        sc3 sc3Var = new sc3("SUCCESS", 0);
        f = sc3Var;
        sc3 sc3Var2 = new sc3("PERMANENT_FAILURE", 1);
        g = sc3Var2;
        sc3 sc3Var3 = new sc3("RETRIABLE_FAILURE", 2);
        h = sc3Var3;
        sc3 sc3Var4 = new sc3("BUFFERED", 3);
        i = sc3Var4;
        j = new sc3[]{sc3Var, sc3Var2, sc3Var3, sc3Var4};
    }

    public static sc3[] values() {
        return (sc3[]) j.clone();
    }
}
