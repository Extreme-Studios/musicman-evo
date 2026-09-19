package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class d03 {
    public static final d03 f;
    public static final d03 g;
    public static final d03 h;
    public static final /* synthetic */ d03[] i;

    /* JADX INFO: Fake field, exist only in values array */
    d03 EF0;

    static {
        d03 d03Var = new d03("SHA1", 0);
        d03 d03Var2 = new d03("SHA224", 1);
        d03 d03Var3 = new d03("SHA256", 2);
        f = d03Var3;
        d03 d03Var4 = new d03("SHA384", 3);
        g = d03Var4;
        d03 d03Var5 = new d03("SHA512", 4);
        h = d03Var5;
        i = new d03[]{d03Var, d03Var2, d03Var3, d03Var4, d03Var5};
    }

    public static d03[] values() {
        return (d03[]) i.clone();
    }
}
