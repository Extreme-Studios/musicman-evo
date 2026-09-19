package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class vs {
    public static final vs f;
    public static final vs g;
    public static final vs h;
    public static final /* synthetic */ vs[] i;

    static {
        vs vsVar = new vs("OFF", 0);
        f = vsVar;
        vs vsVar2 = new vs("ALL", 1);
        g = vsVar2;
        vs vsVar3 = new vs("ONE", 2);
        h = vsVar3;
        i = new vs[]{vsVar, vsVar2, vsVar3};
    }

    public static vs valueOf(String str) {
        return (vs) Enum.valueOf(vs.class, str);
    }

    public static vs[] values() {
        return (vs[]) i.clone();
    }
}
