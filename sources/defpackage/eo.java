package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class eo {
    private static final /* synthetic */ ph $ENTRIES;
    private static final /* synthetic */ eo[] $VALUES;
    public static final bo Companion;
    public static final eo ON_ANY;
    public static final eo ON_CREATE;
    public static final eo ON_DESTROY;
    public static final eo ON_PAUSE;
    public static final eo ON_RESUME;
    public static final eo ON_START;
    public static final eo ON_STOP;

    static {
        eo eoVar = new eo("ON_CREATE", 0);
        ON_CREATE = eoVar;
        eo eoVar2 = new eo("ON_START", 1);
        ON_START = eoVar2;
        eo eoVar3 = new eo("ON_RESUME", 2);
        ON_RESUME = eoVar3;
        eo eoVar4 = new eo("ON_PAUSE", 3);
        ON_PAUSE = eoVar4;
        eo eoVar5 = new eo("ON_STOP", 4);
        ON_STOP = eoVar5;
        eo eoVar6 = new eo("ON_DESTROY", 5);
        ON_DESTROY = eoVar6;
        eo eoVar7 = new eo("ON_ANY", 6);
        ON_ANY = eoVar7;
        eo[] eoVarArr = {eoVar, eoVar2, eoVar3, eoVar4, eoVar5, eoVar6, eoVar7};
        $VALUES = eoVarArr;
        $ENTRIES = new qh(eoVarArr);
        Companion = new bo();
    }

    public static eo valueOf(String str) {
        return (eo) Enum.valueOf(eo.class, str);
    }

    public static eo[] values() {
        return (eo[]) $VALUES.clone();
    }

    public final fo a() {
        switch (co.a[ordinal()]) {
            case 1:
            case 2:
                return fo.h;
            case 3:
            case 4:
                return fo.i;
            case 5:
                return fo.j;
            case 6:
                return fo.f;
            case 7:
                throw new IllegalArgumentException(this + " has no target state");
            default:
                throw new na();
        }
    }
}
