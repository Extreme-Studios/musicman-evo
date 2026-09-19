package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class rc {
    public static final rc f;
    public static final /* synthetic */ rc[] g;

    static {
        rc rcVar = new rc("COROUTINE_SUSPENDED", 0);
        f = rcVar;
        g = new rc[]{rcVar, new rc("UNDECIDED", 1), new rc("RESUMED", 2)};
    }

    public static rc valueOf(String str) {
        return (rc) Enum.valueOf(rc.class, str);
    }

    public static rc[] values() {
        return (rc[]) g.clone();
    }
}
