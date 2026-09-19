package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class ag2 {
    public static final ag2 f;
    public static final ag2 g;
    public static final ag2 h;
    public static final ag2 i;
    public static final ag2 j;
    public static final /* synthetic */ ag2[] k;

    static {
        ag2 ag2Var = new ag2("RESULT_UNKNOWN", 0);
        f = ag2Var;
        ag2 ag2Var2 = new ag2("RESULT_NOOP_LOCAL_PROGRAM_STILL_VALID", 1);
        g = ag2Var2;
        ag2 ag2Var3 = new ag2("RESULT_UPDATED", 2);
        h = ag2Var3;
        ag2 ag2Var4 = new ag2("RESULT_NOOP_NO_NEW_PROGRAM", 3);
        i = ag2Var4;
        ag2 ag2Var5 = new ag2("RESULT_FAILURE_INVALID_RESPONSE", 4);
        j = ag2Var5;
        k = new ag2[]{ag2Var, ag2Var2, ag2Var3, ag2Var4, ag2Var5};
    }

    public static ag2[] values() {
        return (ag2[]) k.clone();
    }
}
