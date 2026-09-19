package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class a92 {
    public static final a92 f;
    public static final /* synthetic */ a92[] g;

    /* JADX INFO: Fake field, exist only in values array */
    a92 EF0;

    static {
        a92 a92Var = new a92("VIDEO_CONTROLS", 0);
        a92 a92Var2 = new a92("CLOSE_AD", 1);
        a92 a92Var3 = new a92("NOT_VISIBLE", 2);
        f = a92Var3;
        g = new a92[]{a92Var, a92Var2, a92Var3, new a92("OTHER", 3)};
    }

    public static a92[] values() {
        return (a92[]) g.clone();
    }
}
