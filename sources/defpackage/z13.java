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
public final class z13 {
    public static final z13 g;
    public static final z13 h;
    public static final z13[] i;
    public static final /* synthetic */ z13[] j;
    public final int f;

    /* JADX INFO: Fake field, exist only in values array */
    z13 EF0;

    static {
        q23 q23Var = q23.j;
        z13 z13Var = new z13("DOUBLE", 0, 0, 1, q23Var);
        q23 q23Var2 = q23.i;
        z13 z13Var2 = new z13("FLOAT", 1, 1, 1, q23Var2);
        q23 q23Var3 = q23.h;
        z13 z13Var3 = new z13("INT64", 2, 2, 1, q23Var3);
        z13 z13Var4 = new z13("UINT64", 3, 3, 1, q23Var3);
        q23 q23Var4 = q23.g;
        z13 z13Var5 = new z13("INT32", 4, 4, 1, q23Var4);
        z13 z13Var6 = new z13("FIXED64", 5, 5, 1, q23Var3);
        z13 z13Var7 = new z13("FIXED32", 6, 6, 1, q23Var4);
        q23 q23Var5 = q23.k;
        z13 z13Var8 = new z13("BOOL", 7, 7, 1, q23Var5);
        q23 q23Var6 = q23.l;
        z13 z13Var9 = new z13("STRING", 8, 8, 1, q23Var6);
        q23 q23Var7 = q23.o;
        z13 z13Var10 = new z13("MESSAGE", 9, 9, 1, q23Var7);
        q23 q23Var8 = q23.m;
        z13 z13Var11 = new z13("BYTES", 10, 10, 1, q23Var8);
        z13 z13Var12 = new z13("UINT32", 11, 11, 1, q23Var4);
        q23 q23Var9 = q23.n;
        z13 z13Var13 = new z13("ENUM", 12, 12, 1, q23Var9);
        z13 z13Var14 = new z13("SFIXED32", 13, 13, 1, q23Var4);
        z13 z13Var15 = new z13("SFIXED64", 14, 14, 1, q23Var3);
        z13 z13Var16 = new z13("SINT32", 15, 15, 1, q23Var4);
        z13 z13Var17 = new z13("SINT64", 16, 16, 1, q23Var3);
        z13 z13Var18 = new z13("GROUP", 17, 17, 1, q23Var7);
        z13 z13Var19 = new z13("DOUBLE_LIST", 18, 18, 2, q23Var);
        z13 z13Var20 = new z13("FLOAT_LIST", 19, 19, 2, q23Var2);
        z13 z13Var21 = new z13("INT64_LIST", 20, 20, 2, q23Var3);
        z13 z13Var22 = new z13("UINT64_LIST", 21, 21, 2, q23Var3);
        z13 z13Var23 = new z13("INT32_LIST", 22, 22, 2, q23Var4);
        z13 z13Var24 = new z13("FIXED64_LIST", 23, 23, 2, q23Var3);
        z13 z13Var25 = new z13("FIXED32_LIST", 24, 24, 2, q23Var4);
        z13 z13Var26 = new z13("BOOL_LIST", 25, 25, 2, q23Var5);
        z13 z13Var27 = new z13("STRING_LIST", 26, 26, 2, q23Var6);
        z13 z13Var28 = new z13("MESSAGE_LIST", 27, 27, 2, q23Var7);
        z13 z13Var29 = new z13("BYTES_LIST", 28, 28, 2, q23Var8);
        z13 z13Var30 = new z13("UINT32_LIST", 29, 29, 2, q23Var4);
        z13 z13Var31 = new z13("ENUM_LIST", 30, 30, 2, q23Var9);
        z13 z13Var32 = new z13("SFIXED32_LIST", 31, 31, 2, q23Var4);
        z13 z13Var33 = new z13("SFIXED64_LIST", 32, 32, 2, q23Var3);
        z13 z13Var34 = new z13("SINT32_LIST", 33, 33, 2, q23Var4);
        z13 z13Var35 = new z13("SINT64_LIST", 34, 34, 2, q23Var3);
        z13 z13Var36 = new z13("DOUBLE_LIST_PACKED", 35, 35, 3, q23Var);
        g = z13Var36;
        z13 z13Var37 = new z13("FLOAT_LIST_PACKED", 36, 36, 3, q23Var2);
        z13 z13Var38 = new z13("INT64_LIST_PACKED", 37, 37, 3, q23Var3);
        z13 z13Var39 = new z13("UINT64_LIST_PACKED", 38, 38, 3, q23Var3);
        z13 z13Var40 = new z13("INT32_LIST_PACKED", 39, 39, 3, q23Var4);
        z13 z13Var41 = new z13("FIXED64_LIST_PACKED", 40, 40, 3, q23Var3);
        z13 z13Var42 = new z13("FIXED32_LIST_PACKED", 41, 41, 3, q23Var4);
        z13 z13Var43 = new z13("BOOL_LIST_PACKED", 42, 42, 3, q23Var5);
        z13 z13Var44 = new z13("UINT32_LIST_PACKED", 43, 43, 3, q23Var4);
        z13 z13Var45 = new z13("ENUM_LIST_PACKED", 44, 44, 3, q23Var9);
        z13 z13Var46 = new z13("SFIXED32_LIST_PACKED", 45, 45, 3, q23Var4);
        z13 z13Var47 = new z13("SFIXED64_LIST_PACKED", 46, 46, 3, q23Var3);
        z13 z13Var48 = new z13("SINT32_LIST_PACKED", 47, 47, 3, q23Var4);
        z13 z13Var49 = new z13("SINT64_LIST_PACKED", 48, 48, 3, q23Var3);
        h = z13Var49;
        j = new z13[]{z13Var, z13Var2, z13Var3, z13Var4, z13Var5, z13Var6, z13Var7, z13Var8, z13Var9, z13Var10, z13Var11, z13Var12, z13Var13, z13Var14, z13Var15, z13Var16, z13Var17, z13Var18, z13Var19, z13Var20, z13Var21, z13Var22, z13Var23, z13Var24, z13Var25, z13Var26, z13Var27, z13Var28, z13Var29, z13Var30, z13Var31, z13Var32, z13Var33, z13Var34, z13Var35, z13Var36, z13Var37, z13Var38, z13Var39, z13Var40, z13Var41, z13Var42, z13Var43, z13Var44, z13Var45, z13Var46, z13Var47, z13Var48, z13Var49, new z13("GROUP_LIST", 49, 49, 2, q23Var7), new z13("MAP", 50, 50, 4, q23.f)};
        z13[] z13VarArrValues = values();
        i = new z13[z13VarArrValues.length];
        for (z13 z13Var50 : z13VarArrValues) {
            i[z13Var50.f] = z13Var50;
        }
    }

    public z13(String str, int i2, int i3, int i4, q23 q23Var) {
        super(str, i2);
        this.f = i3;
        int i5 = i4 - 1;
        if (i5 == 1 || i5 == 3) {
            q23Var.getClass();
        }
        if (i4 == 1) {
            q23 q23Var2 = q23.f;
            q23Var.ordinal();
        }
    }

    public static z13[] values() {
        return (z13[]) j.clone();
    }
}
