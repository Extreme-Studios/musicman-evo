package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF0' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes.dex */
public final class y33 {
    public static final y33 h;
    public static final y33 i;
    public static final y33 j;
    public static final /* synthetic */ y33[] k;
    public final z33 f;
    public final int g;

    /* JADX INFO: Fake field, exist only in values array */
    y33 EF1;

    /* JADX INFO: Fake field, exist only in values array */
    y33 EF2;

    /* JADX INFO: Fake field, exist only in values array */
    y33 EF0;

    static {
        y33 y33Var = new y33("DOUBLE", 0, z33.i, 1);
        y33 y33Var2 = new y33("FLOAT", 1, z33.h, 5);
        z33 z33Var = z33.g;
        y33 y33Var3 = new y33("INT64", 2, z33Var, 0);
        y33 y33Var4 = new y33("UINT64", 3, z33Var, 0);
        z33 z33Var2 = z33.f;
        y33 y33Var5 = new y33("INT32", 4, z33Var2, 0);
        y33 y33Var6 = new y33("FIXED64", 5, z33Var, 1);
        y33 y33Var7 = new y33("FIXED32", 6, z33Var2, 5);
        y33 y33Var8 = new y33("BOOL", 7, z33.j, 0);
        y33 y33Var9 = new y33("STRING", 8, z33.k, 2);
        h = y33Var9;
        z33 z33Var3 = z33.n;
        y33 y33Var10 = new y33("GROUP", 9, z33Var3, 3);
        i = y33Var10;
        y33 y33Var11 = new y33("MESSAGE", 10, z33Var3, 2);
        j = y33Var11;
        k = new y33[]{y33Var, y33Var2, y33Var3, y33Var4, y33Var5, y33Var6, y33Var7, y33Var8, y33Var9, y33Var10, y33Var11, new y33("BYTES", 11, z33.l, 2), new y33("UINT32", 12, z33Var2, 0), new y33("ENUM", 13, z33.m, 0), new y33("SFIXED32", 14, z33Var2, 5), new y33("SFIXED64", 15, z33Var, 1), new y33("SINT32", 16, z33Var2, 0), new y33("SINT64", 17, z33Var, 0)};
    }

    public y33(String str, int i2, z33 z33Var, int i3) {
        super(str, i2);
        this.f = z33Var;
        this.g = i3;
    }

    public static y33[] values() {
        return (y33[]) k.clone();
    }
}
