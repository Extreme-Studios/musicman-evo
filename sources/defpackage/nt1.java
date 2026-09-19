package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class nt1 {
    public static final nt1 f;
    public static final nt1 g;
    public static final nt1 h;
    public static final /* synthetic */ nt1[] i;

    static {
        nt1 nt1Var = new nt1("NONE", 0);
        f = nt1Var;
        nt1 nt1Var2 = new nt1("SHAKE", 1);
        g = nt1Var2;
        nt1 nt1Var3 = new nt1("FLICK", 2);
        h = nt1Var3;
        i = new nt1[]{nt1Var, nt1Var2, nt1Var3};
    }

    public static nt1[] values() {
        return (nt1[]) i.clone();
    }
}
