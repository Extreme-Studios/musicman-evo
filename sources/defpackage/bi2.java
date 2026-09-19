package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class bi2 implements zh2 {
    public static final bi2 f;
    public static final /* synthetic */ bi2[] g;

    static {
        bi2 bi2Var = new bi2("ALWAYS_TRUE", 0);
        f = bi2Var;
        g = new bi2[]{bi2Var, new bi2("ALWAYS_FALSE", 1), new bi2("IS_NULL", 2), new bi2("NOT_NULL", 3)};
    }

    public static bi2[] values() {
        return (bi2[]) g.clone();
    }

    @Override // defpackage.zh2
    public final /* synthetic */ boolean b(Object obj) {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            return true;
        }
        if (iOrdinal != 1) {
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    return obj != null;
                }
                throw null;
            }
            if (obj == null) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.Enum
    public final /* synthetic */ String toString() {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            return "Predicates.alwaysTrue()";
        }
        if (iOrdinal == 1) {
            return "Predicates.alwaysFalse()";
        }
        if (iOrdinal != 2) {
            return iOrdinal != 3 ? super.toString() : "Predicates.notNull()";
        }
        return "Predicates.isNull()";
    }
}
