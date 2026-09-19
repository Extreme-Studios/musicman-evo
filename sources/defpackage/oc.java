package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class oc {
    public static final oc f;
    public static final oc g;
    public static final oc h;
    public static final oc i;
    public static final oc j;
    public static final /* synthetic */ oc[] k;

    static {
        oc ocVar = new oc("CPU_ACQUIRED", 0);
        f = ocVar;
        oc ocVar2 = new oc("BLOCKING", 1);
        g = ocVar2;
        oc ocVar3 = new oc("PARKING", 2);
        h = ocVar3;
        oc ocVar4 = new oc("DORMANT", 3);
        i = ocVar4;
        oc ocVar5 = new oc("TERMINATED", 4);
        j = ocVar5;
        k = new oc[]{ocVar, ocVar2, ocVar3, ocVar4, ocVar5};
    }

    public static oc valueOf(String str) {
        return (oc) Enum.valueOf(oc.class, str);
    }

    public static oc[] values() {
        return (oc[]) k.clone();
    }
}
