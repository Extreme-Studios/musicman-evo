package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class fo {
    public static final fo f;
    public static final fo g;
    public static final fo h;
    public static final fo i;
    public static final fo j;
    public static final /* synthetic */ fo[] k;

    static {
        fo foVar = new fo("DESTROYED", 0);
        f = foVar;
        fo foVar2 = new fo("INITIALIZED", 1);
        g = foVar2;
        fo foVar3 = new fo("CREATED", 2);
        h = foVar3;
        fo foVar4 = new fo("STARTED", 3);
        i = foVar4;
        fo foVar5 = new fo("RESUMED", 4);
        j = foVar5;
        k = new fo[]{foVar, foVar2, foVar3, foVar4, foVar5};
    }

    public static fo valueOf(String str) {
        return (fo) Enum.valueOf(fo.class, str);
    }

    public static fo[] values() {
        return (fo[]) k.clone();
    }
}
