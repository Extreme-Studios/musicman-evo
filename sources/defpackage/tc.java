package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class tc {
    public static final tc f;
    public static final /* synthetic */ tc[] g;

    static {
        tc tcVar = new tc("DEFAULT", 0);
        f = tcVar;
        g = new tc[]{tcVar, new tc("LAZY", 1), new tc("ATOMIC", 2), new tc("UNDISPATCHED", 3)};
    }

    public static tc valueOf(String str) {
        return (tc) Enum.valueOf(tc.class, str);
    }

    public static tc[] values() {
        return (tc[]) g.clone();
    }
}
