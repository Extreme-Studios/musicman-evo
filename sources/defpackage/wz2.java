package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class wz2 {
    public static final wz2 f;
    public static final wz2 g;
    public static final wz2 h;
    public static final /* synthetic */ wz2[] i;

    static {
        wz2 wz2Var = new wz2("NIST_P256", 0);
        f = wz2Var;
        wz2 wz2Var2 = new wz2("NIST_P384", 1);
        g = wz2Var2;
        wz2 wz2Var3 = new wz2("NIST_P521", 2);
        h = wz2Var3;
        i = new wz2[]{wz2Var, wz2Var2, wz2Var3};
    }

    public static wz2[] values() {
        return (wz2[]) i.clone();
    }
}
