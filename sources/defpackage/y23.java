package defpackage;

import java.io.IOException;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public final class y23 implements j33 {
    public static final int[] k = new int[0];
    public static final Unsafe l = u33.o();
    public final int[] a;
    public final Object[] b;
    public final int c;
    public final int d;
    public final f13 e;
    public final boolean f;
    public final int[] g;
    public final int h;
    public final int i;
    public final ig j;

    public y23(int[] iArr, Object[] objArr, int i, int i2, f13 f13Var, int[] iArr2, int i3, int i4, ig igVar, kt2 kt2Var) {
        this.a = iArr;
        this.b = objArr;
        this.c = i;
        this.d = i2;
        this.f = f13Var instanceof d23;
        this.g = iArr2;
        this.h = i3;
        this.i = i4;
        this.j = igVar;
        this.e = f13Var;
    }

    public static Field A(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException e) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String string = Arrays.toString(declaredFields);
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 11 + name.length() + 29 + String.valueOf(string).length());
            ec.x(sb, "Field ", str, " for ", name);
            j7.h(ec.m(sb, " not found. Known fields are ", string), e);
            return null;
        }
    }

    public static int l(int i) {
        return (i >>> 20) & 255;
    }

    public static boolean m(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof d23) {
            return ((d23) obj).h();
        }
        return true;
    }

    public static void n(Object obj) {
        if (m(obj)) {
            return;
        }
        j7.p("Mutating immutable message: ".concat(String.valueOf(obj)));
    }

    public static int o(long j, Object obj) {
        return ((Integer) u33.k(j, obj)).intValue();
    }

    public static long p(long j, Object obj) {
        return ((Long) u33.k(j, obj)).longValue();
    }

    public static final int x(byte[] bArr, int i, int i2, y33 y33Var, Class cls, i13 i13Var) throws o23 {
        y33 y33Var2 = y33.h;
        switch (y33Var.ordinal()) {
            case 0:
                int i3 = i + 8;
                i13Var.c = Double.valueOf(Double.longBitsToDouble(w40.s0(i, bArr)));
                return i3;
            case 1:
                int i4 = i + 4;
                i13Var.c = Float.valueOf(Float.intBitsToFloat(w40.p0(i, bArr)));
                return i4;
            case 2:
            case 3:
                int iO0 = w40.o0(bArr, i, i13Var);
                i13Var.c = Long.valueOf(i13Var.b);
                return iO0;
            case 4:
            case 12:
            case 13:
                int iW = w40.W(bArr, i, i13Var);
                i13Var.c = Integer.valueOf(i13Var.a);
                return iW;
            case 5:
            case 15:
                int i5 = i + 8;
                i13Var.c = Long.valueOf(w40.s0(i, bArr));
                return i5;
            case 6:
            case 14:
                int i6 = i + 4;
                i13Var.c = Integer.valueOf(w40.p0(i, bArr));
                return i6;
            case 7:
                int iO1 = w40.o0(bArr, i, i13Var);
                i13Var.c = Boolean.valueOf(i13Var.b != 0);
                return iO1;
            case 8:
                return w40.w0(bArr, i, i13Var);
            case 9:
            default:
                throw new RuntimeException("unsupported field type.");
            case 10:
                j33 j33VarA = d33.c.a(cls);
                d23 d23VarA = j33VarA.a();
                int iL0 = w40.L0(d23VarA, j33VarA, bArr, i, i2, i13Var);
                j33VarA.h(d23VarA);
                i13Var.c = d23VarA;
                return iL0;
            case 11:
                return w40.A0(bArr, i, i13Var);
            case 16:
                int iW2 = w40.W(bArr, i, i13Var);
                i13Var.c = Integer.valueOf(r13.f(i13Var.a));
                return iW2;
            case 17:
                int iO2 = w40.o0(bArr, i, i13Var);
                i13Var.c = Long.valueOf(r13.g(i13Var.b));
                return iO2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:125:0x0274  */
    /* JADX WARN: Code duplicated, block: B:126:0x0277  */
    /* JADX WARN: Code duplicated, block: B:129:0x0290  */
    /* JADX WARN: Code duplicated, block: B:130:0x0293  */
    /* JADX WARN: Code duplicated, block: B:171:0x035d  */
    /* JADX WARN: Code duplicated, block: B:186:0x03ab  */
    /* JADX WARN: Code duplicated, block: B:189:0x03b5  */
    public static y23 z(f33 f33Var, ig igVar, kt2 kt2Var) {
        int i;
        int iCharAt;
        int i2;
        int[] iArr;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        char cCharAt;
        int i9;
        char cCharAt2;
        int i10;
        char cCharAt3;
        int i11;
        char cCharAt4;
        int i12;
        char cCharAt5;
        int i13;
        char cCharAt6;
        int i14;
        char cCharAt7;
        int i15;
        char cCharAt8;
        int i16;
        int i17;
        Object[] objArr;
        int iObjectFieldOffset;
        int iObjectFieldOffset2;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        Field fieldA;
        char cCharAt9;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        Object obj;
        Field fieldA2;
        int i28;
        Object obj2;
        Field fieldA3;
        int i29;
        char cCharAt10;
        int i30;
        char cCharAt11;
        int i31;
        char cCharAt12;
        int i32;
        char cCharAt13;
        if (!(f33Var instanceof f33)) {
            j7.j();
            return null;
        }
        String str = f33Var.b;
        int length = str.length();
        int i33 = 55296;
        if (str.charAt(0) >= 55296) {
            int i34 = 1;
            while (true) {
                i = i34 + 1;
                if (str.charAt(i34) < 55296) {
                    break;
                }
                i34 = i;
            }
        } else {
            i = 1;
        }
        int i35 = i + 1;
        int iCharAt2 = str.charAt(i);
        if (iCharAt2 >= 55296) {
            int i36 = iCharAt2 & 8191;
            int i37 = 13;
            while (true) {
                i32 = i35 + 1;
                cCharAt13 = str.charAt(i35);
                if (cCharAt13 < 55296) {
                    break;
                }
                i36 |= (cCharAt13 & 8191) << i37;
                i37 += 13;
                i35 = i32;
            }
            iCharAt2 = i36 | (cCharAt13 << i37);
            i35 = i32;
        }
        if (iCharAt2 == 0) {
            i4 = 0;
            i6 = 0;
            iCharAt = 0;
            i3 = 0;
            i5 = 0;
            i7 = 0;
            iArr = k;
            i2 = 0;
        } else {
            int i38 = i35 + 1;
            int iCharAt3 = str.charAt(i35);
            if (iCharAt3 >= 55296) {
                int i39 = iCharAt3 & 8191;
                int i40 = 13;
                while (true) {
                    i15 = i38 + 1;
                    cCharAt8 = str.charAt(i38);
                    if (cCharAt8 < 55296) {
                        break;
                    }
                    i39 |= (cCharAt8 & 8191) << i40;
                    i40 += 13;
                    i38 = i15;
                }
                iCharAt3 = i39 | (cCharAt8 << i40);
                i38 = i15;
            }
            int i41 = i38 + 1;
            int iCharAt4 = str.charAt(i38);
            if (iCharAt4 >= 55296) {
                int i42 = iCharAt4 & 8191;
                int i43 = 13;
                while (true) {
                    i14 = i41 + 1;
                    cCharAt7 = str.charAt(i41);
                    if (cCharAt7 < 55296) {
                        break;
                    }
                    i42 |= (cCharAt7 & 8191) << i43;
                    i43 += 13;
                    i41 = i14;
                }
                iCharAt4 = i42 | (cCharAt7 << i43);
                i41 = i14;
            }
            int i44 = i41 + 1;
            int iCharAt5 = str.charAt(i41);
            if (iCharAt5 >= 55296) {
                int i45 = iCharAt5 & 8191;
                int i46 = 13;
                while (true) {
                    i13 = i44 + 1;
                    cCharAt6 = str.charAt(i44);
                    if (cCharAt6 < 55296) {
                        break;
                    }
                    i45 |= (cCharAt6 & 8191) << i46;
                    i46 += 13;
                    i44 = i13;
                }
                iCharAt5 = i45 | (cCharAt6 << i46);
                i44 = i13;
            }
            int i47 = i44 + 1;
            int iCharAt6 = str.charAt(i44);
            if (iCharAt6 >= 55296) {
                int i48 = iCharAt6 & 8191;
                int i49 = 13;
                while (true) {
                    i12 = i47 + 1;
                    cCharAt5 = str.charAt(i47);
                    if (cCharAt5 < 55296) {
                        break;
                    }
                    i48 |= (cCharAt5 & 8191) << i49;
                    i49 += 13;
                    i47 = i12;
                }
                iCharAt6 = i48 | (cCharAt5 << i49);
                i47 = i12;
            }
            int i50 = i47 + 1;
            iCharAt = str.charAt(i47);
            if (iCharAt >= 55296) {
                int i51 = iCharAt & 8191;
                int i52 = 13;
                while (true) {
                    i11 = i50 + 1;
                    cCharAt4 = str.charAt(i50);
                    if (cCharAt4 < 55296) {
                        break;
                    }
                    i51 |= (cCharAt4 & 8191) << i52;
                    i52 += 13;
                    i50 = i11;
                }
                iCharAt = i51 | (cCharAt4 << i52);
                i50 = i11;
            }
            int i53 = i50 + 1;
            int iCharAt7 = str.charAt(i50);
            if (iCharAt7 >= 55296) {
                int i54 = iCharAt7 & 8191;
                int i55 = 13;
                while (true) {
                    i10 = i53 + 1;
                    cCharAt3 = str.charAt(i53);
                    if (cCharAt3 < 55296) {
                        break;
                    }
                    i54 |= (cCharAt3 & 8191) << i55;
                    i55 += 13;
                    i53 = i10;
                }
                iCharAt7 = i54 | (cCharAt3 << i55);
                i53 = i10;
            }
            int i56 = i53 + 1;
            int iCharAt8 = str.charAt(i53);
            if (iCharAt8 >= 55296) {
                int i57 = iCharAt8 & 8191;
                int i58 = 13;
                while (true) {
                    i9 = i56 + 1;
                    cCharAt2 = str.charAt(i56);
                    if (cCharAt2 < 55296) {
                        break;
                    }
                    i57 |= (cCharAt2 & 8191) << i58;
                    i58 += 13;
                    i56 = i9;
                }
                iCharAt8 = i57 | (cCharAt2 << i58);
                i56 = i9;
            }
            int i59 = i56 + 1;
            int iCharAt9 = str.charAt(i56);
            if (iCharAt9 >= 55296) {
                int i60 = iCharAt9 & 8191;
                int i61 = 13;
                while (true) {
                    i8 = i59 + 1;
                    cCharAt = str.charAt(i59);
                    if (cCharAt < 55296) {
                        break;
                    }
                    i60 |= (cCharAt & 8191) << i61;
                    i61 += 13;
                    i59 = i8;
                }
                iCharAt9 = i60 | (cCharAt << i61);
                i59 = i8;
            }
            int i62 = iCharAt3 + iCharAt3 + iCharAt4;
            i2 = iCharAt3;
            i35 = i59;
            iArr = new int[iCharAt9 + iCharAt7 + iCharAt8];
            int i63 = iCharAt7;
            i3 = iCharAt5;
            i4 = i63;
            i5 = iCharAt6;
            i6 = i62;
            i7 = iCharAt9;
        }
        Unsafe unsafe = l;
        Object[] objArr2 = f33Var.c;
        Class<?> cls = f33Var.a.getClass();
        int i64 = i7 + i4;
        int i65 = iCharAt + iCharAt;
        int[] iArr2 = new int[iCharAt * 3];
        Object[] objArr3 = new Object[i65];
        int i66 = i64;
        int i67 = i7;
        int i68 = 0;
        int i69 = 0;
        while (i35 < length) {
            int i70 = i35 + 1;
            int iCharAt10 = str.charAt(i35);
            if (iCharAt10 >= i33) {
                int i71 = iCharAt10 & 8191;
                int i72 = i70;
                int i73 = 13;
                while (true) {
                    i31 = i72 + 1;
                    cCharAt12 = str.charAt(i72);
                    i16 = length;
                    if (cCharAt12 < 55296) {
                        break;
                    }
                    i71 |= (cCharAt12 & 8191) << i73;
                    i73 += 13;
                    i72 = i31;
                    length = i16;
                }
                iCharAt10 = i71 | (cCharAt12 << i73);
                i17 = i31;
            } else {
                i16 = length;
                i17 = i70;
            }
            int i74 = i17 + 1;
            int iCharAt11 = str.charAt(i17);
            Object[] objArr4 = objArr2;
            char c = 55296;
            if (iCharAt11 >= 55296) {
                int i75 = iCharAt11 & 8191;
                int i76 = 13;
                while (true) {
                    i30 = i74 + 1;
                    cCharAt11 = str.charAt(i74);
                    if (cCharAt11 < c) {
                        break;
                    }
                    i75 |= (cCharAt11 & 8191) << i76;
                    i76 += 13;
                    i74 = i30;
                    c = 55296;
                }
                iCharAt11 = i75 | (cCharAt11 << i76);
                i74 = i30;
            }
            if ((iCharAt11 & 1024) != 0) {
                iArr[i68] = i69;
                i68++;
            }
            int i77 = iCharAt11 & 255;
            int i78 = iCharAt10;
            int i79 = iCharAt11 & 2048;
            if (i77 >= 51) {
                int i80 = i74 + 1;
                int iCharAt12 = str.charAt(i74);
                char c2 = 55296;
                if (iCharAt12 >= 55296) {
                    int i81 = iCharAt12 & 8191;
                    int i82 = i80;
                    int i83 = 13;
                    while (true) {
                        i29 = i82 + 1;
                        cCharAt10 = str.charAt(i82);
                        if (cCharAt10 < c2) {
                            break;
                        }
                        i81 |= (cCharAt10 & 8191) << i83;
                        i83 += 13;
                        i82 = i29;
                        c2 = 55296;
                    }
                    iCharAt12 = i81 | (cCharAt10 << i83);
                    i24 = i29;
                } else {
                    i24 = i80;
                }
                int i84 = i24;
                int i85 = i77 - 51;
                int i86 = iCharAt12;
                if (i85 == 9 || i85 == 17) {
                    i25 = i6 + 1;
                    int i87 = i69 / 3;
                    objArr3[i87 + i87 + 1] = objArr4[i6];
                } else {
                    if (i85 != 12) {
                        i26 = i79;
                    } else if (f33Var.a() == 1 || i79 != 0) {
                        i25 = i6 + 1;
                        int i88 = i69 / 3;
                        objArr3[i88 + i88 + 1] = objArr4[i6];
                    } else {
                        i26 = 0;
                    }
                    i27 = i86 + i86;
                    i79 = i26;
                    obj = objArr4[i27];
                    if (obj instanceof Field) {
                        fieldA2 = (Field) obj;
                    } else {
                        fieldA2 = A(cls, (String) obj);
                        objArr4[i27] = fieldA2;
                    }
                    int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldA2);
                    i28 = i27 + 1;
                    obj2 = objArr4[i28];
                    if (obj2 instanceof Field) {
                        fieldA3 = (Field) obj2;
                    } else {
                        fieldA3 = A(cls, (String) obj2);
                        objArr4[i28] = fieldA3;
                    }
                    i19 = i84;
                    i22 = iObjectFieldOffset3;
                    i18 = 55296;
                    objArr = objArr3;
                    i2 = i2;
                    cls = cls;
                    i21 = 0;
                    iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldA3);
                }
                i6 = i25;
                i26 = i79;
                i27 = i86 + i86;
                i79 = i26;
                obj = objArr4[i27];
                if (obj instanceof Field) {
                    fieldA2 = (Field) obj;
                } else {
                    fieldA2 = A(cls, (String) obj);
                    objArr4[i27] = fieldA2;
                }
                int iObjectFieldOffset4 = (int) unsafe.objectFieldOffset(fieldA2);
                i28 = i27 + 1;
                obj2 = objArr4[i28];
                if (obj2 instanceof Field) {
                    fieldA3 = (Field) obj2;
                } else {
                    fieldA3 = A(cls, (String) obj2);
                    objArr4[i28] = fieldA3;
                }
                i19 = i84;
                i22 = iObjectFieldOffset4;
                i18 = 55296;
                objArr = objArr3;
                i2 = i2;
                cls = cls;
                i21 = 0;
                iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldA3);
            } else {
                int i89 = i6 + 1;
                Field fieldA4 = A(cls, (String) objArr4[i6]);
                objArr = objArr3;
                if (i77 == 9 || i77 == 17) {
                    int i90 = i69 / 3;
                    objArr[i90 + i90 + 1] = fieldA4.getType();
                } else {
                    if (i77 != 27) {
                        if (i77 == 49) {
                            i6 += 2;
                            i23 = 1;
                        } else if (i77 == 12 || i77 == 30 || i77 == 44) {
                            i2 = i2;
                            if (f33Var.a() == 1 || i79 != 0) {
                                i6 += 2;
                                int i91 = i69 / 3;
                                objArr[i91 + i91 + 1] = objArr4[i89];
                                cls = cls;
                            } else {
                                cls = cls;
                                i6 = i89;
                                i79 = 0;
                            }
                        } else if (i77 == 50) {
                            int i92 = i6 + 2;
                            i67++;
                            iArr[i67] = i69;
                            int i93 = i69 / 3;
                            int i94 = i93 + i93;
                            objArr[i94] = objArr4[i89];
                            if (i79 != 0) {
                                i6 += 3;
                                objArr[i94 + 1] = objArr4[i92];
                            } else {
                                i6 = i92;
                                i79 = 0;
                            }
                            i2 = i2;
                        }
                        iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldA4);
                        iObjectFieldOffset2 = 1048575;
                        if ((iCharAt11 & 4096) != 0 || i77 > 17) {
                            i18 = 55296;
                            i19 = i74;
                            i20 = 0;
                        } else {
                            int i95 = i74 + 1;
                            int iCharAt13 = str.charAt(i74);
                            if (iCharAt13 >= 55296) {
                                int i96 = iCharAt13 & 8191;
                                int i97 = 13;
                                while (true) {
                                    i19 = i95 + 1;
                                    cCharAt9 = str.charAt(i95);
                                    if (cCharAt9 < 55296) {
                                        break;
                                    }
                                    i96 |= (cCharAt9 & 8191) << i97;
                                    i97 += 13;
                                    i95 = i19;
                                }
                                iCharAt13 = i96 | (cCharAt9 << i97);
                            } else {
                                i19 = i95;
                            }
                            int i98 = (iCharAt13 / 32) + i2 + i2;
                            Object obj3 = objArr4[i98];
                            if (obj3 instanceof Field) {
                                fieldA = (Field) obj3;
                            } else {
                                fieldA = A(cls, (String) obj3);
                                objArr4[i98] = fieldA;
                            }
                            i20 = iCharAt13 % 32;
                            iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldA);
                            i18 = 55296;
                        }
                        if (i77 >= 18 && i77 <= 49) {
                            iArr[i66] = iObjectFieldOffset;
                            i66++;
                        }
                        i21 = i20;
                        i22 = iObjectFieldOffset;
                    } else {
                        i23 = 1;
                        i6 += 2;
                    }
                    int i99 = i69 / 3;
                    objArr[i99 + i99 + i23] = objArr4[i89];
                    cls = cls;
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldA4);
                    iObjectFieldOffset2 = 1048575;
                    if ((iCharAt11 & 4096) != 0) {
                        i18 = 55296;
                        i19 = i74;
                        i20 = 0;
                    } else {
                        i18 = 55296;
                        i19 = i74;
                        i20 = 0;
                    }
                    if (i77 >= 18) {
                        iArr[i66] = iObjectFieldOffset;
                        i66++;
                    }
                    i21 = i20;
                    i22 = iObjectFieldOffset;
                }
                cls = cls;
                i6 = i89;
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldA4);
                iObjectFieldOffset2 = 1048575;
                if ((iCharAt11 & 4096) != 0) {
                    i18 = 55296;
                    i19 = i74;
                    i20 = 0;
                } else {
                    i18 = 55296;
                    i19 = i74;
                    i20 = 0;
                }
                if (i77 >= 18) {
                    iArr[i66] = iObjectFieldOffset;
                    i66++;
                }
                i21 = i20;
                i22 = iObjectFieldOffset;
            }
            int i100 = i79;
            int i101 = i69 + 1;
            iArr2[i69] = i78;
            int i102 = i69 + 2;
            String str2 = str;
            iArr2[i101] = ((iCharAt11 & 512) != 0 ? 536870912 : 0) | ((iCharAt11 & 256) != 0 ? 268435456 : 0) | (i100 != 0 ? Integer.MIN_VALUE : 0) | (i77 << 20) | i22;
            i69 += 3;
            iArr2[i102] = (i21 << 20) | iObjectFieldOffset2;
            cls = cls;
            objArr2 = objArr4;
            i33 = i18;
            length = i16;
            objArr3 = objArr;
            i2 = i2;
            i35 = i19;
            str = str2;
        }
        return new y23(iArr2, objArr3, i3, i5, f33Var.a, iArr, i7, i64, igVar, kt2Var);
    }

    public final void B(Object obj, int i, Object obj2) {
        if (s(i, obj2)) {
            int iK = k(i) & 1048575;
            Unsafe unsafe = l;
            long j = iK;
            Object object = unsafe.getObject(obj2, j);
            if (object == null) {
                int i2 = this.a[i];
                String string = obj2.toString();
                StringBuilder sb = new StringBuilder(g72.a(i2, 38) + string.length());
                sb.append("Source subfield ");
                sb.append(i2);
                sb.append(" is present but null: ");
                sb.append(string);
                throw new IllegalStateException(sb.toString());
            }
            j33 j33VarD = D(i);
            if (!s(i, obj)) {
                if (m(object)) {
                    d23 d23VarA = j33VarD.a();
                    j33VarD.c(d23VarA, object);
                    unsafe.putObject(obj, j, d23VarA);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                t(i, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, j);
            if (!m(object2)) {
                d23 d23VarA2 = j33VarD.a();
                j33VarD.c(d23VarA2, object2);
                unsafe.putObject(obj, j, d23VarA2);
                object2 = d23VarA2;
            }
            j33VarD.c(object2, object);
        }
    }

    public final void C(Object obj, int i, Object obj2) {
        int[] iArr = this.a;
        int i2 = iArr[i];
        if (u(i2, i, obj2)) {
            int iK = k(i) & 1048575;
            Unsafe unsafe = l;
            long j = iK;
            Object object = unsafe.getObject(obj2, j);
            if (object == null) {
                int i3 = iArr[i];
                String string = obj2.toString();
                StringBuilder sb = new StringBuilder(g72.a(i3, 38) + string.length());
                sb.append("Source subfield ");
                sb.append(i3);
                sb.append(" is present but null: ");
                sb.append(string);
                throw new IllegalStateException(sb.toString());
            }
            j33 j33VarD = D(i);
            if (!u(i2, i, obj)) {
                if (m(object)) {
                    d23 d23VarA = j33VarD.a();
                    j33VarD.c(d23VarA, object);
                    unsafe.putObject(obj, j, d23VarA);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                v(i2, i, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, j);
            if (!m(object2)) {
                d23 d23VarA2 = j33VarD.a();
                j33VarD.c(d23VarA2, object2);
                unsafe.putObject(obj, j, d23VarA2);
                object2 = d23VarA2;
            }
            j33VarD.c(object2, object);
        }
    }

    public final j33 D(int i) {
        int i2 = i / 3;
        int i3 = i2 + i2;
        Object[] objArr = this.b;
        j33 j33Var = (j33) objArr[i3];
        if (j33Var != null) {
            return j33Var;
        }
        j33 j33VarA = d33.c.a((Class) objArr[i3 + 1]);
        objArr[i3] = j33VarA;
        return j33VarA;
    }

    public final Object E(int i) {
        int i2 = i / 3;
        return this.b[i2 + i2];
    }

    public final g23 F(int i) {
        int i2 = i / 3;
        return (g23) this.b[i2 + i2 + 1];
    }

    public final Object G(int i, Object obj) {
        j33 j33VarD = D(i);
        int iK = k(i) & 1048575;
        if (!s(i, obj)) {
            return j33VarD.a();
        }
        Object object = l.getObject(obj, iK);
        if (m(object)) {
            return object;
        }
        d23 d23VarA = j33VarD.a();
        if (object != null) {
            j33VarD.c(d23VarA, object);
        }
        return d23VarA;
    }

    public final void H(Object obj, int i, Object obj2) {
        l.putObject(obj, k(i) & 1048575, obj2);
        t(i, obj);
    }

    public final Object I(int i, int i2, Object obj) {
        j33 j33VarD = D(i2);
        if (!u(i, i2, obj)) {
            return j33VarD.a();
        }
        Object object = l.getObject(obj, k(i2) & 1048575);
        if (m(object)) {
            return object;
        }
        d23 d23VarA = j33VarD.a();
        if (object != null) {
            j33VarD.c(d23VarA, object);
        }
        return d23VarA;
    }

    public final void J(Object obj, int i, Object obj2, int i2) {
        l.putObject(obj, k(i2) & 1048575, obj2);
        v(i, i2, obj);
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01ab A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:60:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:61:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:62:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:64:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:66:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:68:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:69:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:70:0x0203  */
    /* JADX WARN: Code duplicated, block: B:71:0x020f  */
    /* JADX WARN: Code duplicated, block: B:73:0x0213  */
    /* JADX WARN: Code duplicated, block: B:75:0x0221  */
    /* JADX WARN: Code duplicated, block: B:76:0x0229  */
    /* JADX WARN: Code duplicated, block: B:77:0x0236  */
    /* JADX WARN: Code duplicated, block: B:78:0x023f  */
    /* JADX WARN: Code duplicated, block: B:80:0x0243  */
    /* JADX WARN: Code duplicated, block: B:81:0x024e  */
    /* JADX WARN: Code duplicated, block: B:82:0x0255  */
    /* JADX WARN: Code duplicated, block: B:83:0x025c  */
    /* JADX WARN: Code duplicated, block: B:84:0x0263  */
    /* JADX WARN: Code duplicated, block: B:85:0x026a  */
    /* JADX WARN: Code duplicated, block: B:86:0x0276  */
    /* JADX WARN: Code duplicated, block: B:87:0x0281  */
    /* JADX WARN: Code duplicated, block: B:88:0x028c  */
    /* JADX WARN: Code duplicated, block: B:89:0x0293  */
    public final Object K(Object obj, int i, Object obj2, ig igVar, Object obj3) {
        g23 g23VarF;
        int iB;
        int iD;
        int iA;
        int i2;
        int iA2;
        int iB2;
        int iD2;
        int iA3;
        int i3 = this.a[i];
        Object objK = u33.k(k(i) & 1048575, obj);
        if (objK == null || (g23VarF = F(i)) == null) {
            return obj2;
        }
        dy2 dy2Var = ((t23) E(i)).a;
        Iterator it = ((u23) objK).entrySet().iterator();
        Object objJ = obj2;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!g23VarF.a(((Integer) entry.getValue()).intValue())) {
                if (objJ == null) {
                    igVar.getClass();
                    objJ = ig.j(obj3);
                }
                Object key = entry.getKey();
                Object value = entry.getValue();
                y33 y33Var = (y33) dy2Var.g;
                y33 y33Var2 = (y33) dy2Var.h;
                int i4 = y13.c;
                int iA4 = u13.a(8);
                y33 y33Var3 = y33.i;
                if (y33Var == y33Var3) {
                    iA4 += iA4;
                }
                z33 z33Var = z33.f;
                char c = '?';
                switch (y33Var.ordinal()) {
                    case 0:
                        ((Double) key).getClass();
                        iB = 8;
                        i2 = iB + iA4;
                        iA2 = u13.a(16);
                        if (y33Var2 == y33Var3) {
                            iA2 += iA2;
                        }
                        switch (y33Var2.ordinal()) {
                            case 0:
                                ((Double) value).getClass();
                                iB2 = 8;
                                int i5 = iB2 + iA2 + i2;
                                l13 l13Var = n13.g;
                                byte[] bArr = new byte[i5];
                                s13 s13Var = new s13(i5, bArr);
                                try {
                                    t23.a(s13Var, dy2Var, entry.getKey(), entry.getValue());
                                    s13Var.d();
                                    l13 l13Var2 = new l13(bArr);
                                    igVar.getClass();
                                    ((p33) objJ).d((i3 << 3) | 2, l13Var2);
                                    it.remove();
                                } catch (IOException e) {
                                    throw new RuntimeException(e);
                                }
                                break;
                            case 1:
                                ((Float) value).getClass();
                                iB2 = 4;
                                int i6 = iB2 + iA2 + i2;
                                l13 l13Var3 = n13.g;
                                byte[] bArr2 = new byte[i6];
                                s13 s13Var2 = new s13(i6, bArr2);
                                t23.a(s13Var2, dy2Var, entry.getKey(), entry.getValue());
                                s13Var2.d();
                                l13 l13Var4 = new l13(bArr2);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var4);
                                it.remove();
                                break;
                            case 2:
                                iB2 = u13.b(((Long) value).longValue());
                                int i7 = iB2 + iA2 + i2;
                                l13 l13Var5 = n13.g;
                                byte[] bArr3 = new byte[i7];
                                s13 s13Var3 = new s13(i7, bArr3);
                                t23.a(s13Var3, dy2Var, entry.getKey(), entry.getValue());
                                s13Var3.d();
                                l13 l13Var6 = new l13(bArr3);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var6);
                                it.remove();
                                break;
                            case 3:
                                iB2 = u13.b(((Long) value).longValue());
                                int i8 = iB2 + iA2 + i2;
                                l13 l13Var7 = n13.g;
                                byte[] bArr4 = new byte[i8];
                                s13 s13Var4 = new s13(i8, bArr4);
                                t23.a(s13Var4, dy2Var, entry.getKey(), entry.getValue());
                                s13Var4.d();
                                l13 l13Var8 = new l13(bArr4);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var8);
                                it.remove();
                                break;
                            case 4:
                                iB2 = u13.b(((Integer) value).intValue());
                                int i9 = iB2 + iA2 + i2;
                                l13 l13Var9 = n13.g;
                                byte[] bArr5 = new byte[i9];
                                s13 s13Var5 = new s13(i9, bArr5);
                                t23.a(s13Var5, dy2Var, entry.getKey(), entry.getValue());
                                s13Var5.d();
                                l13 l13Var10 = new l13(bArr5);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var10);
                                it.remove();
                                break;
                            case 5:
                                ((Long) value).getClass();
                                iB2 = 8;
                                int i10 = iB2 + iA2 + i2;
                                l13 l13Var11 = n13.g;
                                byte[] bArr6 = new byte[i10];
                                s13 s13Var6 = new s13(i10, bArr6);
                                t23.a(s13Var6, dy2Var, entry.getKey(), entry.getValue());
                                s13Var6.d();
                                l13 l13Var12 = new l13(bArr6);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var12);
                                it.remove();
                                break;
                            case 6:
                                ((Integer) value).getClass();
                                iB2 = 4;
                                int i11 = iB2 + iA2 + i2;
                                l13 l13Var13 = n13.g;
                                byte[] bArr7 = new byte[i11];
                                s13 s13Var7 = new s13(i11, bArr7);
                                t23.a(s13Var7, dy2Var, entry.getKey(), entry.getValue());
                                s13Var7.d();
                                l13 l13Var14 = new l13(bArr7);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var14);
                                it.remove();
                                break;
                            case 7:
                                ((Boolean) value).getClass();
                                iB2 = 1;
                                int i12 = iB2 + iA2 + i2;
                                l13 l13Var15 = n13.g;
                                byte[] bArr8 = new byte[i12];
                                s13 s13Var8 = new s13(i12, bArr8);
                                t23.a(s13Var8, dy2Var, entry.getKey(), entry.getValue());
                                s13Var8.d();
                                l13 l13Var16 = new l13(bArr8);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var16);
                                it.remove();
                                break;
                            case 8:
                                if (value instanceof n13) {
                                    iD2 = ((n13) value).d();
                                    iA3 = u13.a(iD2);
                                    iB2 = iA3 + iD2;
                                } else {
                                    iB2 = u13.c((String) value);
                                }
                                int i13 = iB2 + iA2 + i2;
                                l13 l13Var17 = n13.g;
                                byte[] bArr9 = new byte[i13];
                                s13 s13Var9 = new s13(i13, bArr9);
                                t23.a(s13Var9, dy2Var, entry.getKey(), entry.getValue());
                                s13Var9.d();
                                l13 l13Var18 = new l13(bArr9);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var18);
                                it.remove();
                                break;
                            case 9:
                                iB2 = ((d23) ((f13) value)).d(null);
                                int i14 = iB2 + iA2 + i2;
                                l13 l13Var19 = n13.g;
                                byte[] bArr10 = new byte[i14];
                                s13 s13Var10 = new s13(i14, bArr10);
                                t23.a(s13Var10, dy2Var, entry.getKey(), entry.getValue());
                                s13Var10.d();
                                l13 l13Var110 = new l13(bArr10);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var110);
                                it.remove();
                                break;
                            case 10:
                                iD2 = ((d23) ((f13) value)).d(null);
                                iA3 = u13.a(iD2);
                                iB2 = iA3 + iD2;
                                int i15 = iB2 + iA2 + i2;
                                l13 l13Var111 = n13.g;
                                byte[] bArr11 = new byte[i15];
                                s13 s13Var11 = new s13(i15, bArr11);
                                t23.a(s13Var11, dy2Var, entry.getKey(), entry.getValue());
                                s13Var11.d();
                                l13 l13Var112 = new l13(bArr11);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var112);
                                it.remove();
                                break;
                            case 11:
                                if (value instanceof n13) {
                                    iD2 = ((n13) value).d();
                                    iA3 = u13.a(iD2);
                                } else {
                                    iD2 = ((byte[]) value).length;
                                    iA3 = u13.a(iD2);
                                }
                                iB2 = iA3 + iD2;
                                int i16 = iB2 + iA2 + i2;
                                l13 l13Var113 = n13.g;
                                byte[] bArr12 = new byte[i16];
                                s13 s13Var12 = new s13(i16, bArr12);
                                t23.a(s13Var12, dy2Var, entry.getKey(), entry.getValue());
                                s13Var12.d();
                                l13 l13Var114 = new l13(bArr12);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var114);
                                it.remove();
                                break;
                            case 12:
                                iB2 = u13.a(((Integer) value).intValue());
                                int i17 = iB2 + iA2 + i2;
                                l13 l13Var115 = n13.g;
                                byte[] bArr13 = new byte[i17];
                                s13 s13Var13 = new s13(i17, bArr13);
                                t23.a(s13Var13, dy2Var, entry.getKey(), entry.getValue());
                                s13Var13.d();
                                l13 l13Var116 = new l13(bArr13);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var116);
                                it.remove();
                                break;
                            case 13:
                                if (value instanceof f23) {
                                    iB2 = u13.b(((f23) value).a());
                                } else {
                                    iB2 = u13.b(((Integer) value).intValue());
                                }
                                int i18 = iB2 + iA2 + i2;
                                l13 l13Var117 = n13.g;
                                byte[] bArr14 = new byte[i18];
                                s13 s13Var14 = new s13(i18, bArr14);
                                t23.a(s13Var14, dy2Var, entry.getKey(), entry.getValue());
                                s13Var14.d();
                                l13 l13Var118 = new l13(bArr14);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var118);
                                it.remove();
                                break;
                            case 14:
                                ((Integer) value).getClass();
                                iB2 = 4;
                                int i19 = iB2 + iA2 + i2;
                                l13 l13Var119 = n13.g;
                                byte[] bArr15 = new byte[i19];
                                s13 s13Var15 = new s13(i19, bArr15);
                                t23.a(s13Var15, dy2Var, entry.getKey(), entry.getValue());
                                s13Var15.d();
                                l13 l13Var1110 = new l13(bArr15);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var1110);
                                it.remove();
                                break;
                            case 15:
                                ((Long) value).getClass();
                                iB2 = 8;
                                int i110 = iB2 + iA2 + i2;
                                l13 l13Var1111 = n13.g;
                                byte[] bArr16 = new byte[i110];
                                s13 s13Var16 = new s13(i110, bArr16);
                                t23.a(s13Var16, dy2Var, entry.getKey(), entry.getValue());
                                s13Var16.d();
                                l13 l13Var1112 = new l13(bArr16);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var1112);
                                it.remove();
                                break;
                            case 16:
                                int iIntValue = ((Integer) value).intValue();
                                iB2 = u13.a((iIntValue >> 31) ^ (iIntValue + iIntValue));
                                int i111 = iB2 + iA2 + i2;
                                l13 l13Var1113 = n13.g;
                                byte[] bArr17 = new byte[i111];
                                s13 s13Var17 = new s13(i111, bArr17);
                                t23.a(s13Var17, dy2Var, entry.getKey(), entry.getValue());
                                s13Var17.d();
                                l13 l13Var1114 = new l13(bArr17);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var1114);
                                it.remove();
                                break;
                            case 17:
                                long jLongValue = ((Long) value).longValue();
                                iB2 = u13.b((jLongValue >> c) ^ (jLongValue + jLongValue));
                                int i112 = iB2 + iA2 + i2;
                                l13 l13Var1115 = n13.g;
                                byte[] bArr18 = new byte[i112];
                                s13 s13Var18 = new s13(i112, bArr18);
                                t23.a(s13Var18, dy2Var, entry.getKey(), entry.getValue());
                                s13Var18.d();
                                l13 l13Var1116 = new l13(bArr18);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var1116);
                                it.remove();
                                break;
                            default:
                                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                        }
                        break;
                    case 1:
                        ((Float) key).getClass();
                        iB = 4;
                        i2 = iB + iA4;
                        iA2 = u13.a(16);
                        if (y33Var2 == y33Var3) {
                            iA2 += iA2;
                        }
                        switch (y33Var2.ordinal()) {
                            case 0:
                                ((Double) value).getClass();
                                iB2 = 8;
                                int i113 = iB2 + iA2 + i2;
                                l13 l13Var1117 = n13.g;
                                byte[] bArr19 = new byte[i113];
                                s13 s13Var19 = new s13(i113, bArr19);
                                t23.a(s13Var19, dy2Var, entry.getKey(), entry.getValue());
                                s13Var19.d();
                                l13 l13Var1118 = new l13(bArr19);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var1118);
                                it.remove();
                                break;
                            case 1:
                                ((Float) value).getClass();
                                iB2 = 4;
                                int i114 = iB2 + iA2 + i2;
                                l13 l13Var1119 = n13.g;
                                byte[] bArr110 = new byte[i114];
                                s13 s13Var110 = new s13(i114, bArr110);
                                t23.a(s13Var110, dy2Var, entry.getKey(), entry.getValue());
                                s13Var110.d();
                                l13 l13Var11110 = new l13(bArr110);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var11110);
                                it.remove();
                                break;
                            case 2:
                                iB2 = u13.b(((Long) value).longValue());
                                int i115 = iB2 + iA2 + i2;
                                l13 l13Var11111 = n13.g;
                                byte[] bArr111 = new byte[i115];
                                s13 s13Var111 = new s13(i115, bArr111);
                                t23.a(s13Var111, dy2Var, entry.getKey(), entry.getValue());
                                s13Var111.d();
                                l13 l13Var11112 = new l13(bArr111);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var11112);
                                it.remove();
                                break;
                            case 3:
                                iB2 = u13.b(((Long) value).longValue());
                                int i116 = iB2 + iA2 + i2;
                                l13 l13Var11113 = n13.g;
                                byte[] bArr112 = new byte[i116];
                                s13 s13Var112 = new s13(i116, bArr112);
                                t23.a(s13Var112, dy2Var, entry.getKey(), entry.getValue());
                                s13Var112.d();
                                l13 l13Var11114 = new l13(bArr112);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var11114);
                                it.remove();
                                break;
                            case 4:
                                iB2 = u13.b(((Integer) value).intValue());
                                int i117 = iB2 + iA2 + i2;
                                l13 l13Var11115 = n13.g;
                                byte[] bArr113 = new byte[i117];
                                s13 s13Var113 = new s13(i117, bArr113);
                                t23.a(s13Var113, dy2Var, entry.getKey(), entry.getValue());
                                s13Var113.d();
                                l13 l13Var11116 = new l13(bArr113);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var11116);
                                it.remove();
                                break;
                            case 5:
                                ((Long) value).getClass();
                                iB2 = 8;
                                int i118 = iB2 + iA2 + i2;
                                l13 l13Var11117 = n13.g;
                                byte[] bArr114 = new byte[i118];
                                s13 s13Var114 = new s13(i118, bArr114);
                                t23.a(s13Var114, dy2Var, entry.getKey(), entry.getValue());
                                s13Var114.d();
                                l13 l13Var11118 = new l13(bArr114);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var11118);
                                it.remove();
                                break;
                            case 6:
                                ((Integer) value).getClass();
                                iB2 = 4;
                                int i119 = iB2 + iA2 + i2;
                                l13 l13Var11119 = n13.g;
                                byte[] bArr115 = new byte[i119];
                                s13 s13Var115 = new s13(i119, bArr115);
                                t23.a(s13Var115, dy2Var, entry.getKey(), entry.getValue());
                                s13Var115.d();
                                l13 l13Var111110 = new l13(bArr115);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var111110);
                                it.remove();
                                break;
                            case 7:
                                ((Boolean) value).getClass();
                                iB2 = 1;
                                int i1110 = iB2 + iA2 + i2;
                                l13 l13Var111111 = n13.g;
                                byte[] bArr116 = new byte[i1110];
                                s13 s13Var116 = new s13(i1110, bArr116);
                                t23.a(s13Var116, dy2Var, entry.getKey(), entry.getValue());
                                s13Var116.d();
                                l13 l13Var111112 = new l13(bArr116);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var111112);
                                it.remove();
                                break;
                            case 8:
                                if (value instanceof n13) {
                                    iD2 = ((n13) value).d();
                                    iA3 = u13.a(iD2);
                                    iB2 = iA3 + iD2;
                                } else {
                                    iB2 = u13.c((String) value);
                                }
                                int i1111 = iB2 + iA2 + i2;
                                l13 l13Var111113 = n13.g;
                                byte[] bArr117 = new byte[i1111];
                                s13 s13Var117 = new s13(i1111, bArr117);
                                t23.a(s13Var117, dy2Var, entry.getKey(), entry.getValue());
                                s13Var117.d();
                                l13 l13Var111114 = new l13(bArr117);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var111114);
                                it.remove();
                                break;
                            case 9:
                                iB2 = ((d23) ((f13) value)).d(null);
                                int i1112 = iB2 + iA2 + i2;
                                l13 l13Var111115 = n13.g;
                                byte[] bArr118 = new byte[i1112];
                                s13 s13Var118 = new s13(i1112, bArr118);
                                t23.a(s13Var118, dy2Var, entry.getKey(), entry.getValue());
                                s13Var118.d();
                                l13 l13Var111116 = new l13(bArr118);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var111116);
                                it.remove();
                                break;
                            case 10:
                                iD2 = ((d23) ((f13) value)).d(null);
                                iA3 = u13.a(iD2);
                                iB2 = iA3 + iD2;
                                int i1113 = iB2 + iA2 + i2;
                                l13 l13Var111117 = n13.g;
                                byte[] bArr119 = new byte[i1113];
                                s13 s13Var119 = new s13(i1113, bArr119);
                                t23.a(s13Var119, dy2Var, entry.getKey(), entry.getValue());
                                s13Var119.d();
                                l13 l13Var111118 = new l13(bArr119);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var111118);
                                it.remove();
                                break;
                            case 11:
                                if (value instanceof n13) {
                                    iD2 = ((n13) value).d();
                                    iA3 = u13.a(iD2);
                                } else {
                                    iD2 = ((byte[]) value).length;
                                    iA3 = u13.a(iD2);
                                }
                                iB2 = iA3 + iD2;
                                int i1114 = iB2 + iA2 + i2;
                                l13 l13Var111119 = n13.g;
                                byte[] bArr1110 = new byte[i1114];
                                s13 s13Var1110 = new s13(i1114, bArr1110);
                                t23.a(s13Var1110, dy2Var, entry.getKey(), entry.getValue());
                                s13Var1110.d();
                                l13 l13Var1111110 = new l13(bArr1110);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var1111110);
                                it.remove();
                                break;
                            case 12:
                                iB2 = u13.a(((Integer) value).intValue());
                                int i1115 = iB2 + iA2 + i2;
                                l13 l13Var1111111 = n13.g;
                                byte[] bArr1111 = new byte[i1115];
                                s13 s13Var1111 = new s13(i1115, bArr1111);
                                t23.a(s13Var1111, dy2Var, entry.getKey(), entry.getValue());
                                s13Var1111.d();
                                l13 l13Var1111112 = new l13(bArr1111);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var1111112);
                                it.remove();
                                break;
                            case 13:
                                if (value instanceof f23) {
                                    iB2 = u13.b(((f23) value).a());
                                } else {
                                    iB2 = u13.b(((Integer) value).intValue());
                                }
                                int i1116 = iB2 + iA2 + i2;
                                l13 l13Var1111113 = n13.g;
                                byte[] bArr1112 = new byte[i1116];
                                s13 s13Var1112 = new s13(i1116, bArr1112);
                                t23.a(s13Var1112, dy2Var, entry.getKey(), entry.getValue());
                                s13Var1112.d();
                                l13 l13Var1111114 = new l13(bArr1112);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var1111114);
                                it.remove();
                                break;
                            case 14:
                                ((Integer) value).getClass();
                                iB2 = 4;
                                int i1117 = iB2 + iA2 + i2;
                                l13 l13Var1111115 = n13.g;
                                byte[] bArr1113 = new byte[i1117];
                                s13 s13Var1113 = new s13(i1117, bArr1113);
                                t23.a(s13Var1113, dy2Var, entry.getKey(), entry.getValue());
                                s13Var1113.d();
                                l13 l13Var1111116 = new l13(bArr1113);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var1111116);
                                it.remove();
                                break;
                            case 15:
                                ((Long) value).getClass();
                                iB2 = 8;
                                int i1118 = iB2 + iA2 + i2;
                                l13 l13Var1111117 = n13.g;
                                byte[] bArr1114 = new byte[i1118];
                                s13 s13Var1114 = new s13(i1118, bArr1114);
                                t23.a(s13Var1114, dy2Var, entry.getKey(), entry.getValue());
                                s13Var1114.d();
                                l13 l13Var1111118 = new l13(bArr1114);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var1111118);
                                it.remove();
                                break;
                            case 16:
                                int iIntValue2 = ((Integer) value).intValue();
                                iB2 = u13.a((iIntValue2 >> 31) ^ (iIntValue2 + iIntValue2));
                                int i1119 = iB2 + iA2 + i2;
                                l13 l13Var1111119 = n13.g;
                                byte[] bArr1115 = new byte[i1119];
                                s13 s13Var1115 = new s13(i1119, bArr1115);
                                t23.a(s13Var1115, dy2Var, entry.getKey(), entry.getValue());
                                s13Var1115.d();
                                l13 l13Var11111110 = new l13(bArr1115);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var11111110);
                                it.remove();
                                break;
                            case 17:
                                long jLongValue2 = ((Long) value).longValue();
                                iB2 = u13.b((jLongValue2 >> c) ^ (jLongValue2 + jLongValue2));
                                int i11110 = iB2 + iA2 + i2;
                                l13 l13Var11111111 = n13.g;
                                byte[] bArr1116 = new byte[i11110];
                                s13 s13Var1116 = new s13(i11110, bArr1116);
                                t23.a(s13Var1116, dy2Var, entry.getKey(), entry.getValue());
                                s13Var1116.d();
                                l13 l13Var11111112 = new l13(bArr1116);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var11111112);
                                it.remove();
                                break;
                            default:
                                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                        }
                        break;
                    case 2:
                        c = '?';
                        iB = u13.b(((Long) key).longValue());
                        i2 = iB + iA4;
                        iA2 = u13.a(16);
                        if (y33Var2 == y33Var3) {
                            iA2 += iA2;
                        }
                        switch (y33Var2.ordinal()) {
                            case 0:
                                ((Double) value).getClass();
                                iB2 = 8;
                                int i11111 = iB2 + iA2 + i2;
                                l13 l13Var11111113 = n13.g;
                                byte[] bArr1117 = new byte[i11111];
                                s13 s13Var1117 = new s13(i11111, bArr1117);
                                t23.a(s13Var1117, dy2Var, entry.getKey(), entry.getValue());
                                s13Var1117.d();
                                l13 l13Var11111114 = new l13(bArr1117);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var11111114);
                                it.remove();
                                break;
                            case 1:
                                ((Float) value).getClass();
                                iB2 = 4;
                                int i11112 = iB2 + iA2 + i2;
                                l13 l13Var11111115 = n13.g;
                                byte[] bArr1118 = new byte[i11112];
                                s13 s13Var1118 = new s13(i11112, bArr1118);
                                t23.a(s13Var1118, dy2Var, entry.getKey(), entry.getValue());
                                s13Var1118.d();
                                l13 l13Var11111116 = new l13(bArr1118);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var11111116);
                                it.remove();
                                break;
                            case 2:
                                iB2 = u13.b(((Long) value).longValue());
                                int i11113 = iB2 + iA2 + i2;
                                l13 l13Var11111117 = n13.g;
                                byte[] bArr1119 = new byte[i11113];
                                s13 s13Var1119 = new s13(i11113, bArr1119);
                                t23.a(s13Var1119, dy2Var, entry.getKey(), entry.getValue());
                                s13Var1119.d();
                                l13 l13Var11111118 = new l13(bArr1119);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var11111118);
                                it.remove();
                                break;
                            case 3:
                                iB2 = u13.b(((Long) value).longValue());
                                int i11114 = iB2 + iA2 + i2;
                                l13 l13Var11111119 = n13.g;
                                byte[] bArr11110 = new byte[i11114];
                                s13 s13Var11110 = new s13(i11114, bArr11110);
                                t23.a(s13Var11110, dy2Var, entry.getKey(), entry.getValue());
                                s13Var11110.d();
                                l13 l13Var111111110 = new l13(bArr11110);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var111111110);
                                it.remove();
                                break;
                            case 4:
                                iB2 = u13.b(((Integer) value).intValue());
                                int i11115 = iB2 + iA2 + i2;
                                l13 l13Var111111111 = n13.g;
                                byte[] bArr11111 = new byte[i11115];
                                s13 s13Var11111 = new s13(i11115, bArr11111);
                                t23.a(s13Var11111, dy2Var, entry.getKey(), entry.getValue());
                                s13Var11111.d();
                                l13 l13Var111111112 = new l13(bArr11111);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var111111112);
                                it.remove();
                                break;
                            case 5:
                                ((Long) value).getClass();
                                iB2 = 8;
                                int i11116 = iB2 + iA2 + i2;
                                l13 l13Var111111113 = n13.g;
                                byte[] bArr11112 = new byte[i11116];
                                s13 s13Var11112 = new s13(i11116, bArr11112);
                                t23.a(s13Var11112, dy2Var, entry.getKey(), entry.getValue());
                                s13Var11112.d();
                                l13 l13Var111111114 = new l13(bArr11112);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var111111114);
                                it.remove();
                                break;
                            case 6:
                                ((Integer) value).getClass();
                                iB2 = 4;
                                int i11117 = iB2 + iA2 + i2;
                                l13 l13Var111111115 = n13.g;
                                byte[] bArr11113 = new byte[i11117];
                                s13 s13Var11113 = new s13(i11117, bArr11113);
                                t23.a(s13Var11113, dy2Var, entry.getKey(), entry.getValue());
                                s13Var11113.d();
                                l13 l13Var111111116 = new l13(bArr11113);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var111111116);
                                it.remove();
                                break;
                            case 7:
                                ((Boolean) value).getClass();
                                iB2 = 1;
                                int i11118 = iB2 + iA2 + i2;
                                l13 l13Var111111117 = n13.g;
                                byte[] bArr11114 = new byte[i11118];
                                s13 s13Var11114 = new s13(i11118, bArr11114);
                                t23.a(s13Var11114, dy2Var, entry.getKey(), entry.getValue());
                                s13Var11114.d();
                                l13 l13Var111111118 = new l13(bArr11114);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var111111118);
                                it.remove();
                                break;
                            case 8:
                                if (value instanceof n13) {
                                    iD2 = ((n13) value).d();
                                    iA3 = u13.a(iD2);
                                    iB2 = iA3 + iD2;
                                } else {
                                    iB2 = u13.c((String) value);
                                }
                                int i11119 = iB2 + iA2 + i2;
                                l13 l13Var111111119 = n13.g;
                                byte[] bArr11115 = new byte[i11119];
                                s13 s13Var11115 = new s13(i11119, bArr11115);
                                t23.a(s13Var11115, dy2Var, entry.getKey(), entry.getValue());
                                s13Var11115.d();
                                l13 l13Var1111111110 = new l13(bArr11115);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var1111111110);
                                it.remove();
                                break;
                            case 9:
                                iB2 = ((d23) ((f13) value)).d(null);
                                int i111110 = iB2 + iA2 + i2;
                                l13 l13Var1111111111 = n13.g;
                                byte[] bArr11116 = new byte[i111110];
                                s13 s13Var11116 = new s13(i111110, bArr11116);
                                t23.a(s13Var11116, dy2Var, entry.getKey(), entry.getValue());
                                s13Var11116.d();
                                l13 l13Var1111111112 = new l13(bArr11116);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var1111111112);
                                it.remove();
                                break;
                            case 10:
                                iD2 = ((d23) ((f13) value)).d(null);
                                iA3 = u13.a(iD2);
                                iB2 = iA3 + iD2;
                                int i111111 = iB2 + iA2 + i2;
                                l13 l13Var1111111113 = n13.g;
                                byte[] bArr11117 = new byte[i111111];
                                s13 s13Var11117 = new s13(i111111, bArr11117);
                                t23.a(s13Var11117, dy2Var, entry.getKey(), entry.getValue());
                                s13Var11117.d();
                                l13 l13Var1111111114 = new l13(bArr11117);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var1111111114);
                                it.remove();
                                break;
                            case 11:
                                if (value instanceof n13) {
                                    iD2 = ((n13) value).d();
                                    iA3 = u13.a(iD2);
                                } else {
                                    iD2 = ((byte[]) value).length;
                                    iA3 = u13.a(iD2);
                                }
                                iB2 = iA3 + iD2;
                                int i111112 = iB2 + iA2 + i2;
                                l13 l13Var1111111115 = n13.g;
                                byte[] bArr11118 = new byte[i111112];
                                s13 s13Var11118 = new s13(i111112, bArr11118);
                                t23.a(s13Var11118, dy2Var, entry.getKey(), entry.getValue());
                                s13Var11118.d();
                                l13 l13Var1111111116 = new l13(bArr11118);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var1111111116);
                                it.remove();
                                break;
                            case 12:
                                iB2 = u13.a(((Integer) value).intValue());
                                int i111113 = iB2 + iA2 + i2;
                                l13 l13Var1111111117 = n13.g;
                                byte[] bArr11119 = new byte[i111113];
                                s13 s13Var11119 = new s13(i111113, bArr11119);
                                t23.a(s13Var11119, dy2Var, entry.getKey(), entry.getValue());
                                s13Var11119.d();
                                l13 l13Var1111111118 = new l13(bArr11119);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var1111111118);
                                it.remove();
                                break;
                            case 13:
                                if (value instanceof f23) {
                                    iB2 = u13.b(((f23) value).a());
                                } else {
                                    iB2 = u13.b(((Integer) value).intValue());
                                }
                                int i111114 = iB2 + iA2 + i2;
                                l13 l13Var1111111119 = n13.g;
                                byte[] bArr111110 = new byte[i111114];
                                s13 s13Var111110 = new s13(i111114, bArr111110);
                                t23.a(s13Var111110, dy2Var, entry.getKey(), entry.getValue());
                                s13Var111110.d();
                                l13 l13Var11111111110 = new l13(bArr111110);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var11111111110);
                                it.remove();
                                break;
                            case 14:
                                ((Integer) value).getClass();
                                iB2 = 4;
                                int i111115 = iB2 + iA2 + i2;
                                l13 l13Var11111111111 = n13.g;
                                byte[] bArr111111 = new byte[i111115];
                                s13 s13Var111111 = new s13(i111115, bArr111111);
                                t23.a(s13Var111111, dy2Var, entry.getKey(), entry.getValue());
                                s13Var111111.d();
                                l13 l13Var11111111112 = new l13(bArr111111);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var11111111112);
                                it.remove();
                                break;
                            case 15:
                                ((Long) value).getClass();
                                iB2 = 8;
                                int i111116 = iB2 + iA2 + i2;
                                l13 l13Var11111111113 = n13.g;
                                byte[] bArr111112 = new byte[i111116];
                                s13 s13Var111112 = new s13(i111116, bArr111112);
                                t23.a(s13Var111112, dy2Var, entry.getKey(), entry.getValue());
                                s13Var111112.d();
                                l13 l13Var11111111114 = new l13(bArr111112);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var11111111114);
                                it.remove();
                                break;
                            case 16:
                                int iIntValue3 = ((Integer) value).intValue();
                                iB2 = u13.a((iIntValue3 >> 31) ^ (iIntValue3 + iIntValue3));
                                int i111117 = iB2 + iA2 + i2;
                                l13 l13Var11111111115 = n13.g;
                                byte[] bArr111113 = new byte[i111117];
                                s13 s13Var111113 = new s13(i111117, bArr111113);
                                t23.a(s13Var111113, dy2Var, entry.getKey(), entry.getValue());
                                s13Var111113.d();
                                l13 l13Var11111111116 = new l13(bArr111113);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var11111111116);
                                it.remove();
                                break;
                            case 17:
                                long jLongValue3 = ((Long) value).longValue();
                                iB2 = u13.b((jLongValue3 >> c) ^ (jLongValue3 + jLongValue3));
                                int i111118 = iB2 + iA2 + i2;
                                l13 l13Var11111111117 = n13.g;
                                byte[] bArr111114 = new byte[i111118];
                                s13 s13Var111114 = new s13(i111118, bArr111114);
                                t23.a(s13Var111114, dy2Var, entry.getKey(), entry.getValue());
                                s13Var111114.d();
                                l13 l13Var11111111118 = new l13(bArr111114);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var11111111118);
                                it.remove();
                                break;
                            default:
                                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                        }
                        break;
                    case 3:
                        c = '?';
                        iB = u13.b(((Long) key).longValue());
                        i2 = iB + iA4;
                        iA2 = u13.a(16);
                        if (y33Var2 == y33Var3) {
                            iA2 += iA2;
                        }
                        switch (y33Var2.ordinal()) {
                            case 0:
                                ((Double) value).getClass();
                                iB2 = 8;
                                int i111119 = iB2 + iA2 + i2;
                                l13 l13Var11111111119 = n13.g;
                                byte[] bArr111115 = new byte[i111119];
                                s13 s13Var111115 = new s13(i111119, bArr111115);
                                t23.a(s13Var111115, dy2Var, entry.getKey(), entry.getValue());
                                s13Var111115.d();
                                l13 l13Var111111111110 = new l13(bArr111115);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var111111111110);
                                it.remove();
                                break;
                            case 1:
                                ((Float) value).getClass();
                                iB2 = 4;
                                int i1111110 = iB2 + iA2 + i2;
                                l13 l13Var111111111111 = n13.g;
                                byte[] bArr111116 = new byte[i1111110];
                                s13 s13Var111116 = new s13(i1111110, bArr111116);
                                t23.a(s13Var111116, dy2Var, entry.getKey(), entry.getValue());
                                s13Var111116.d();
                                l13 l13Var111111111112 = new l13(bArr111116);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var111111111112);
                                it.remove();
                                break;
                            case 2:
                                iB2 = u13.b(((Long) value).longValue());
                                int i1111111 = iB2 + iA2 + i2;
                                l13 l13Var111111111113 = n13.g;
                                byte[] bArr111117 = new byte[i1111111];
                                s13 s13Var111117 = new s13(i1111111, bArr111117);
                                t23.a(s13Var111117, dy2Var, entry.getKey(), entry.getValue());
                                s13Var111117.d();
                                l13 l13Var111111111114 = new l13(bArr111117);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var111111111114);
                                it.remove();
                                break;
                            case 3:
                                iB2 = u13.b(((Long) value).longValue());
                                int i1111112 = iB2 + iA2 + i2;
                                l13 l13Var111111111115 = n13.g;
                                byte[] bArr111118 = new byte[i1111112];
                                s13 s13Var111118 = new s13(i1111112, bArr111118);
                                t23.a(s13Var111118, dy2Var, entry.getKey(), entry.getValue());
                                s13Var111118.d();
                                l13 l13Var111111111116 = new l13(bArr111118);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var111111111116);
                                it.remove();
                                break;
                            case 4:
                                iB2 = u13.b(((Integer) value).intValue());
                                int i1111113 = iB2 + iA2 + i2;
                                l13 l13Var111111111117 = n13.g;
                                byte[] bArr111119 = new byte[i1111113];
                                s13 s13Var111119 = new s13(i1111113, bArr111119);
                                t23.a(s13Var111119, dy2Var, entry.getKey(), entry.getValue());
                                s13Var111119.d();
                                l13 l13Var111111111118 = new l13(bArr111119);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var111111111118);
                                it.remove();
                                break;
                            case 5:
                                ((Long) value).getClass();
                                iB2 = 8;
                                int i1111114 = iB2 + iA2 + i2;
                                l13 l13Var111111111119 = n13.g;
                                byte[] bArr1111110 = new byte[i1111114];
                                s13 s13Var1111110 = new s13(i1111114, bArr1111110);
                                t23.a(s13Var1111110, dy2Var, entry.getKey(), entry.getValue());
                                s13Var1111110.d();
                                l13 l13Var1111111111110 = new l13(bArr1111110);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var1111111111110);
                                it.remove();
                                break;
                            case 6:
                                ((Integer) value).getClass();
                                iB2 = 4;
                                int i1111115 = iB2 + iA2 + i2;
                                l13 l13Var1111111111111 = n13.g;
                                byte[] bArr1111111 = new byte[i1111115];
                                s13 s13Var1111111 = new s13(i1111115, bArr1111111);
                                t23.a(s13Var1111111, dy2Var, entry.getKey(), entry.getValue());
                                s13Var1111111.d();
                                l13 l13Var1111111111112 = new l13(bArr1111111);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var1111111111112);
                                it.remove();
                                break;
                            case 7:
                                ((Boolean) value).getClass();
                                iB2 = 1;
                                int i1111116 = iB2 + iA2 + i2;
                                l13 l13Var1111111111113 = n13.g;
                                byte[] bArr1111112 = new byte[i1111116];
                                s13 s13Var1111112 = new s13(i1111116, bArr1111112);
                                t23.a(s13Var1111112, dy2Var, entry.getKey(), entry.getValue());
                                s13Var1111112.d();
                                l13 l13Var1111111111114 = new l13(bArr1111112);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var1111111111114);
                                it.remove();
                                break;
                            case 8:
                                if (value instanceof n13) {
                                    iD2 = ((n13) value).d();
                                    iA3 = u13.a(iD2);
                                    iB2 = iA3 + iD2;
                                } else {
                                    iB2 = u13.c((String) value);
                                }
                                int i1111117 = iB2 + iA2 + i2;
                                l13 l13Var1111111111115 = n13.g;
                                byte[] bArr1111113 = new byte[i1111117];
                                s13 s13Var1111113 = new s13(i1111117, bArr1111113);
                                t23.a(s13Var1111113, dy2Var, entry.getKey(), entry.getValue());
                                s13Var1111113.d();
                                l13 l13Var1111111111116 = new l13(bArr1111113);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var1111111111116);
                                it.remove();
                                break;
                            case 9:
                                iB2 = ((d23) ((f13) value)).d(null);
                                int i1111118 = iB2 + iA2 + i2;
                                l13 l13Var1111111111117 = n13.g;
                                byte[] bArr1111114 = new byte[i1111118];
                                s13 s13Var1111114 = new s13(i1111118, bArr1111114);
                                t23.a(s13Var1111114, dy2Var, entry.getKey(), entry.getValue());
                                s13Var1111114.d();
                                l13 l13Var1111111111118 = new l13(bArr1111114);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var1111111111118);
                                it.remove();
                                break;
                            case 10:
                                iD2 = ((d23) ((f13) value)).d(null);
                                iA3 = u13.a(iD2);
                                iB2 = iA3 + iD2;
                                int i1111119 = iB2 + iA2 + i2;
                                l13 l13Var1111111111119 = n13.g;
                                byte[] bArr1111115 = new byte[i1111119];
                                s13 s13Var1111115 = new s13(i1111119, bArr1111115);
                                t23.a(s13Var1111115, dy2Var, entry.getKey(), entry.getValue());
                                s13Var1111115.d();
                                l13 l13Var11111111111110 = new l13(bArr1111115);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var11111111111110);
                                it.remove();
                                break;
                            case 11:
                                if (value instanceof n13) {
                                    iD2 = ((n13) value).d();
                                    iA3 = u13.a(iD2);
                                } else {
                                    iD2 = ((byte[]) value).length;
                                    iA3 = u13.a(iD2);
                                }
                                iB2 = iA3 + iD2;
                                int i11111110 = iB2 + iA2 + i2;
                                l13 l13Var11111111111111 = n13.g;
                                byte[] bArr1111116 = new byte[i11111110];
                                s13 s13Var1111116 = new s13(i11111110, bArr1111116);
                                t23.a(s13Var1111116, dy2Var, entry.getKey(), entry.getValue());
                                s13Var1111116.d();
                                l13 l13Var11111111111112 = new l13(bArr1111116);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var11111111111112);
                                it.remove();
                                break;
                            case 12:
                                iB2 = u13.a(((Integer) value).intValue());
                                int i11111111 = iB2 + iA2 + i2;
                                l13 l13Var11111111111113 = n13.g;
                                byte[] bArr1111117 = new byte[i11111111];
                                s13 s13Var1111117 = new s13(i11111111, bArr1111117);
                                t23.a(s13Var1111117, dy2Var, entry.getKey(), entry.getValue());
                                s13Var1111117.d();
                                l13 l13Var11111111111114 = new l13(bArr1111117);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var11111111111114);
                                it.remove();
                                break;
                            case 13:
                                if (value instanceof f23) {
                                    iB2 = u13.b(((f23) value).a());
                                } else {
                                    iB2 = u13.b(((Integer) value).intValue());
                                }
                                int i11111112 = iB2 + iA2 + i2;
                                l13 l13Var11111111111115 = n13.g;
                                byte[] bArr1111118 = new byte[i11111112];
                                s13 s13Var1111118 = new s13(i11111112, bArr1111118);
                                t23.a(s13Var1111118, dy2Var, entry.getKey(), entry.getValue());
                                s13Var1111118.d();
                                l13 l13Var11111111111116 = new l13(bArr1111118);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var11111111111116);
                                it.remove();
                                break;
                            case 14:
                                ((Integer) value).getClass();
                                iB2 = 4;
                                int i11111113 = iB2 + iA2 + i2;
                                l13 l13Var11111111111117 = n13.g;
                                byte[] bArr1111119 = new byte[i11111113];
                                s13 s13Var1111119 = new s13(i11111113, bArr1111119);
                                t23.a(s13Var1111119, dy2Var, entry.getKey(), entry.getValue());
                                s13Var1111119.d();
                                l13 l13Var11111111111118 = new l13(bArr1111119);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var11111111111118);
                                it.remove();
                                break;
                            case 15:
                                ((Long) value).getClass();
                                iB2 = 8;
                                int i11111114 = iB2 + iA2 + i2;
                                l13 l13Var11111111111119 = n13.g;
                                byte[] bArr11111110 = new byte[i11111114];
                                s13 s13Var11111110 = new s13(i11111114, bArr11111110);
                                t23.a(s13Var11111110, dy2Var, entry.getKey(), entry.getValue());
                                s13Var11111110.d();
                                l13 l13Var111111111111110 = new l13(bArr11111110);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var111111111111110);
                                it.remove();
                                break;
                            case 16:
                                int iIntValue4 = ((Integer) value).intValue();
                                iB2 = u13.a((iIntValue4 >> 31) ^ (iIntValue4 + iIntValue4));
                                int i11111115 = iB2 + iA2 + i2;
                                l13 l13Var111111111111111 = n13.g;
                                byte[] bArr11111111 = new byte[i11111115];
                                s13 s13Var11111111 = new s13(i11111115, bArr11111111);
                                t23.a(s13Var11111111, dy2Var, entry.getKey(), entry.getValue());
                                s13Var11111111.d();
                                l13 l13Var111111111111112 = new l13(bArr11111111);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var111111111111112);
                                it.remove();
                                break;
                            case 17:
                                long jLongValue4 = ((Long) value).longValue();
                                iB2 = u13.b((jLongValue4 >> c) ^ (jLongValue4 + jLongValue4));
                                int i11111116 = iB2 + iA2 + i2;
                                l13 l13Var111111111111113 = n13.g;
                                byte[] bArr11111112 = new byte[i11111116];
                                s13 s13Var11111112 = new s13(i11111116, bArr11111112);
                                t23.a(s13Var11111112, dy2Var, entry.getKey(), entry.getValue());
                                s13Var11111112.d();
                                l13 l13Var111111111111114 = new l13(bArr11111112);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var111111111111114);
                                it.remove();
                                break;
                            default:
                                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                        }
                        break;
                    case 4:
                        c = '?';
                        iB = u13.b(((Integer) key).intValue());
                        i2 = iB + iA4;
                        iA2 = u13.a(16);
                        if (y33Var2 == y33Var3) {
                            iA2 += iA2;
                        }
                        switch (y33Var2.ordinal()) {
                            case 0:
                                ((Double) value).getClass();
                                iB2 = 8;
                                int i11111117 = iB2 + iA2 + i2;
                                l13 l13Var111111111111115 = n13.g;
                                byte[] bArr11111113 = new byte[i11111117];
                                s13 s13Var11111113 = new s13(i11111117, bArr11111113);
                                t23.a(s13Var11111113, dy2Var, entry.getKey(), entry.getValue());
                                s13Var11111113.d();
                                l13 l13Var111111111111116 = new l13(bArr11111113);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var111111111111116);
                                it.remove();
                                break;
                            case 1:
                                ((Float) value).getClass();
                                iB2 = 4;
                                int i11111118 = iB2 + iA2 + i2;
                                l13 l13Var111111111111117 = n13.g;
                                byte[] bArr11111114 = new byte[i11111118];
                                s13 s13Var11111114 = new s13(i11111118, bArr11111114);
                                t23.a(s13Var11111114, dy2Var, entry.getKey(), entry.getValue());
                                s13Var11111114.d();
                                l13 l13Var111111111111118 = new l13(bArr11111114);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var111111111111118);
                                it.remove();
                                break;
                            case 2:
                                iB2 = u13.b(((Long) value).longValue());
                                int i11111119 = iB2 + iA2 + i2;
                                l13 l13Var111111111111119 = n13.g;
                                byte[] bArr11111115 = new byte[i11111119];
                                s13 s13Var11111115 = new s13(i11111119, bArr11111115);
                                t23.a(s13Var11111115, dy2Var, entry.getKey(), entry.getValue());
                                s13Var11111115.d();
                                l13 l13Var1111111111111110 = new l13(bArr11111115);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var1111111111111110);
                                it.remove();
                                break;
                            case 3:
                                iB2 = u13.b(((Long) value).longValue());
                                int i111111110 = iB2 + iA2 + i2;
                                l13 l13Var1111111111111111 = n13.g;
                                byte[] bArr11111116 = new byte[i111111110];
                                s13 s13Var11111116 = new s13(i111111110, bArr11111116);
                                t23.a(s13Var11111116, dy2Var, entry.getKey(), entry.getValue());
                                s13Var11111116.d();
                                l13 l13Var1111111111111112 = new l13(bArr11111116);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var1111111111111112);
                                it.remove();
                                break;
                            case 4:
                                iB2 = u13.b(((Integer) value).intValue());
                                int i111111111 = iB2 + iA2 + i2;
                                l13 l13Var1111111111111113 = n13.g;
                                byte[] bArr11111117 = new byte[i111111111];
                                s13 s13Var11111117 = new s13(i111111111, bArr11111117);
                                t23.a(s13Var11111117, dy2Var, entry.getKey(), entry.getValue());
                                s13Var11111117.d();
                                l13 l13Var1111111111111114 = new l13(bArr11111117);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var1111111111111114);
                                it.remove();
                                break;
                            case 5:
                                ((Long) value).getClass();
                                iB2 = 8;
                                int i111111112 = iB2 + iA2 + i2;
                                l13 l13Var1111111111111115 = n13.g;
                                byte[] bArr11111118 = new byte[i111111112];
                                s13 s13Var11111118 = new s13(i111111112, bArr11111118);
                                t23.a(s13Var11111118, dy2Var, entry.getKey(), entry.getValue());
                                s13Var11111118.d();
                                l13 l13Var1111111111111116 = new l13(bArr11111118);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var1111111111111116);
                                it.remove();
                                break;
                            case 6:
                                ((Integer) value).getClass();
                                iB2 = 4;
                                int i111111113 = iB2 + iA2 + i2;
                                l13 l13Var1111111111111117 = n13.g;
                                byte[] bArr11111119 = new byte[i111111113];
                                s13 s13Var11111119 = new s13(i111111113, bArr11111119);
                                t23.a(s13Var11111119, dy2Var, entry.getKey(), entry.getValue());
                                s13Var11111119.d();
                                l13 l13Var1111111111111118 = new l13(bArr11111119);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var1111111111111118);
                                it.remove();
                                break;
                            case 7:
                                ((Boolean) value).getClass();
                                iB2 = 1;
                                int i111111114 = iB2 + iA2 + i2;
                                l13 l13Var1111111111111119 = n13.g;
                                byte[] bArr111111110 = new byte[i111111114];
                                s13 s13Var111111110 = new s13(i111111114, bArr111111110);
                                t23.a(s13Var111111110, dy2Var, entry.getKey(), entry.getValue());
                                s13Var111111110.d();
                                l13 l13Var11111111111111110 = new l13(bArr111111110);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var11111111111111110);
                                it.remove();
                                break;
                            case 8:
                                if (value instanceof n13) {
                                    iD2 = ((n13) value).d();
                                    iA3 = u13.a(iD2);
                                    iB2 = iA3 + iD2;
                                } else {
                                    iB2 = u13.c((String) value);
                                }
                                int i111111115 = iB2 + iA2 + i2;
                                l13 l13Var11111111111111111 = n13.g;
                                byte[] bArr111111111 = new byte[i111111115];
                                s13 s13Var111111111 = new s13(i111111115, bArr111111111);
                                t23.a(s13Var111111111, dy2Var, entry.getKey(), entry.getValue());
                                s13Var111111111.d();
                                l13 l13Var11111111111111112 = new l13(bArr111111111);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var11111111111111112);
                                it.remove();
                                break;
                            case 9:
                                iB2 = ((d23) ((f13) value)).d(null);
                                int i111111116 = iB2 + iA2 + i2;
                                l13 l13Var11111111111111113 = n13.g;
                                byte[] bArr111111112 = new byte[i111111116];
                                s13 s13Var111111112 = new s13(i111111116, bArr111111112);
                                t23.a(s13Var111111112, dy2Var, entry.getKey(), entry.getValue());
                                s13Var111111112.d();
                                l13 l13Var11111111111111114 = new l13(bArr111111112);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var11111111111111114);
                                it.remove();
                                break;
                            case 10:
                                iD2 = ((d23) ((f13) value)).d(null);
                                iA3 = u13.a(iD2);
                                iB2 = iA3 + iD2;
                                int i111111117 = iB2 + iA2 + i2;
                                l13 l13Var11111111111111115 = n13.g;
                                byte[] bArr111111113 = new byte[i111111117];
                                s13 s13Var111111113 = new s13(i111111117, bArr111111113);
                                t23.a(s13Var111111113, dy2Var, entry.getKey(), entry.getValue());
                                s13Var111111113.d();
                                l13 l13Var11111111111111116 = new l13(bArr111111113);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var11111111111111116);
                                it.remove();
                                break;
                            case 11:
                                if (value instanceof n13) {
                                    iD2 = ((n13) value).d();
                                    iA3 = u13.a(iD2);
                                } else {
                                    iD2 = ((byte[]) value).length;
                                    iA3 = u13.a(iD2);
                                }
                                iB2 = iA3 + iD2;
                                int i111111118 = iB2 + iA2 + i2;
                                l13 l13Var11111111111111117 = n13.g;
                                byte[] bArr111111114 = new byte[i111111118];
                                s13 s13Var111111114 = new s13(i111111118, bArr111111114);
                                t23.a(s13Var111111114, dy2Var, entry.getKey(), entry.getValue());
                                s13Var111111114.d();
                                l13 l13Var11111111111111118 = new l13(bArr111111114);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var11111111111111118);
                                it.remove();
                                break;
                            case 12:
                                iB2 = u13.a(((Integer) value).intValue());
                                int i111111119 = iB2 + iA2 + i2;
                                l13 l13Var11111111111111119 = n13.g;
                                byte[] bArr111111115 = new byte[i111111119];
                                s13 s13Var111111115 = new s13(i111111119, bArr111111115);
                                t23.a(s13Var111111115, dy2Var, entry.getKey(), entry.getValue());
                                s13Var111111115.d();
                                l13 l13Var111111111111111110 = new l13(bArr111111115);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var111111111111111110);
                                it.remove();
                                break;
                            case 13:
                                if (value instanceof f23) {
                                    iB2 = u13.b(((f23) value).a());
                                } else {
                                    iB2 = u13.b(((Integer) value).intValue());
                                }
                                int i1111111110 = iB2 + iA2 + i2;
                                l13 l13Var111111111111111111 = n13.g;
                                byte[] bArr111111116 = new byte[i1111111110];
                                s13 s13Var111111116 = new s13(i1111111110, bArr111111116);
                                t23.a(s13Var111111116, dy2Var, entry.getKey(), entry.getValue());
                                s13Var111111116.d();
                                l13 l13Var111111111111111112 = new l13(bArr111111116);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var111111111111111112);
                                it.remove();
                                break;
                            case 14:
                                ((Integer) value).getClass();
                                iB2 = 4;
                                int i1111111111 = iB2 + iA2 + i2;
                                l13 l13Var111111111111111113 = n13.g;
                                byte[] bArr111111117 = new byte[i1111111111];
                                s13 s13Var111111117 = new s13(i1111111111, bArr111111117);
                                t23.a(s13Var111111117, dy2Var, entry.getKey(), entry.getValue());
                                s13Var111111117.d();
                                l13 l13Var111111111111111114 = new l13(bArr111111117);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var111111111111111114);
                                it.remove();
                                break;
                            case 15:
                                ((Long) value).getClass();
                                iB2 = 8;
                                int i1111111112 = iB2 + iA2 + i2;
                                l13 l13Var111111111111111115 = n13.g;
                                byte[] bArr111111118 = new byte[i1111111112];
                                s13 s13Var111111118 = new s13(i1111111112, bArr111111118);
                                t23.a(s13Var111111118, dy2Var, entry.getKey(), entry.getValue());
                                s13Var111111118.d();
                                l13 l13Var111111111111111116 = new l13(bArr111111118);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var111111111111111116);
                                it.remove();
                                break;
                            case 16:
                                int iIntValue5 = ((Integer) value).intValue();
                                iB2 = u13.a((iIntValue5 >> 31) ^ (iIntValue5 + iIntValue5));
                                int i1111111113 = iB2 + iA2 + i2;
                                l13 l13Var111111111111111117 = n13.g;
                                byte[] bArr111111119 = new byte[i1111111113];
                                s13 s13Var111111119 = new s13(i1111111113, bArr111111119);
                                t23.a(s13Var111111119, dy2Var, entry.getKey(), entry.getValue());
                                s13Var111111119.d();
                                l13 l13Var111111111111111118 = new l13(bArr111111119);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var111111111111111118);
                                it.remove();
                                break;
                            case 17:
                                long jLongValue5 = ((Long) value).longValue();
                                iB2 = u13.b((jLongValue5 >> c) ^ (jLongValue5 + jLongValue5));
                                int i1111111114 = iB2 + iA2 + i2;
                                l13 l13Var111111111111111119 = n13.g;
                                byte[] bArr1111111110 = new byte[i1111111114];
                                s13 s13Var1111111110 = new s13(i1111111114, bArr1111111110);
                                t23.a(s13Var1111111110, dy2Var, entry.getKey(), entry.getValue());
                                s13Var1111111110.d();
                                l13 l13Var1111111111111111110 = new l13(bArr1111111110);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var1111111111111111110);
                                it.remove();
                                break;
                            default:
                                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                        }
                        break;
                    case 5:
                        ((Long) key).getClass();
                        iB = 8;
                        i2 = iB + iA4;
                        iA2 = u13.a(16);
                        if (y33Var2 == y33Var3) {
                            iA2 += iA2;
                        }
                        switch (y33Var2.ordinal()) {
                            case 0:
                                ((Double) value).getClass();
                                iB2 = 8;
                                int i1111111115 = iB2 + iA2 + i2;
                                l13 l13Var1111111111111111111 = n13.g;
                                byte[] bArr1111111111 = new byte[i1111111115];
                                s13 s13Var1111111111 = new s13(i1111111115, bArr1111111111);
                                t23.a(s13Var1111111111, dy2Var, entry.getKey(), entry.getValue());
                                s13Var1111111111.d();
                                l13 l13Var1111111111111111112 = new l13(bArr1111111111);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var1111111111111111112);
                                it.remove();
                                break;
                            case 1:
                                ((Float) value).getClass();
                                iB2 = 4;
                                int i1111111116 = iB2 + iA2 + i2;
                                l13 l13Var1111111111111111113 = n13.g;
                                byte[] bArr1111111112 = new byte[i1111111116];
                                s13 s13Var1111111112 = new s13(i1111111116, bArr1111111112);
                                t23.a(s13Var1111111112, dy2Var, entry.getKey(), entry.getValue());
                                s13Var1111111112.d();
                                l13 l13Var1111111111111111114 = new l13(bArr1111111112);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var1111111111111111114);
                                it.remove();
                                break;
                            case 2:
                                iB2 = u13.b(((Long) value).longValue());
                                int i1111111117 = iB2 + iA2 + i2;
                                l13 l13Var1111111111111111115 = n13.g;
                                byte[] bArr1111111113 = new byte[i1111111117];
                                s13 s13Var1111111113 = new s13(i1111111117, bArr1111111113);
                                t23.a(s13Var1111111113, dy2Var, entry.getKey(), entry.getValue());
                                s13Var1111111113.d();
                                l13 l13Var1111111111111111116 = new l13(bArr1111111113);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var1111111111111111116);
                                it.remove();
                                break;
                            case 3:
                                iB2 = u13.b(((Long) value).longValue());
                                int i1111111118 = iB2 + iA2 + i2;
                                l13 l13Var1111111111111111117 = n13.g;
                                byte[] bArr1111111114 = new byte[i1111111118];
                                s13 s13Var1111111114 = new s13(i1111111118, bArr1111111114);
                                t23.a(s13Var1111111114, dy2Var, entry.getKey(), entry.getValue());
                                s13Var1111111114.d();
                                l13 l13Var1111111111111111118 = new l13(bArr1111111114);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var1111111111111111118);
                                it.remove();
                                break;
                            case 4:
                                iB2 = u13.b(((Integer) value).intValue());
                                int i1111111119 = iB2 + iA2 + i2;
                                l13 l13Var1111111111111111119 = n13.g;
                                byte[] bArr1111111115 = new byte[i1111111119];
                                s13 s13Var1111111115 = new s13(i1111111119, bArr1111111115);
                                t23.a(s13Var1111111115, dy2Var, entry.getKey(), entry.getValue());
                                s13Var1111111115.d();
                                l13 l13Var11111111111111111110 = new l13(bArr1111111115);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var11111111111111111110);
                                it.remove();
                                break;
                            case 5:
                                ((Long) value).getClass();
                                iB2 = 8;
                                int i11111111110 = iB2 + iA2 + i2;
                                l13 l13Var11111111111111111111 = n13.g;
                                byte[] bArr1111111116 = new byte[i11111111110];
                                s13 s13Var1111111116 = new s13(i11111111110, bArr1111111116);
                                t23.a(s13Var1111111116, dy2Var, entry.getKey(), entry.getValue());
                                s13Var1111111116.d();
                                l13 l13Var11111111111111111112 = new l13(bArr1111111116);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var11111111111111111112);
                                it.remove();
                                break;
                            case 6:
                                ((Integer) value).getClass();
                                iB2 = 4;
                                int i11111111111 = iB2 + iA2 + i2;
                                l13 l13Var11111111111111111113 = n13.g;
                                byte[] bArr1111111117 = new byte[i11111111111];
                                s13 s13Var1111111117 = new s13(i11111111111, bArr1111111117);
                                t23.a(s13Var1111111117, dy2Var, entry.getKey(), entry.getValue());
                                s13Var1111111117.d();
                                l13 l13Var11111111111111111114 = new l13(bArr1111111117);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var11111111111111111114);
                                it.remove();
                                break;
                            case 7:
                                ((Boolean) value).getClass();
                                iB2 = 1;
                                int i11111111112 = iB2 + iA2 + i2;
                                l13 l13Var11111111111111111115 = n13.g;
                                byte[] bArr1111111118 = new byte[i11111111112];
                                s13 s13Var1111111118 = new s13(i11111111112, bArr1111111118);
                                t23.a(s13Var1111111118, dy2Var, entry.getKey(), entry.getValue());
                                s13Var1111111118.d();
                                l13 l13Var11111111111111111116 = new l13(bArr1111111118);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var11111111111111111116);
                                it.remove();
                                break;
                            case 8:
                                if (value instanceof n13) {
                                    iD2 = ((n13) value).d();
                                    iA3 = u13.a(iD2);
                                    iB2 = iA3 + iD2;
                                } else {
                                    iB2 = u13.c((String) value);
                                }
                                int i11111111113 = iB2 + iA2 + i2;
                                l13 l13Var11111111111111111117 = n13.g;
                                byte[] bArr1111111119 = new byte[i11111111113];
                                s13 s13Var1111111119 = new s13(i11111111113, bArr1111111119);
                                t23.a(s13Var1111111119, dy2Var, entry.getKey(), entry.getValue());
                                s13Var1111111119.d();
                                l13 l13Var11111111111111111118 = new l13(bArr1111111119);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var11111111111111111118);
                                it.remove();
                                break;
                            case 9:
                                iB2 = ((d23) ((f13) value)).d(null);
                                int i11111111114 = iB2 + iA2 + i2;
                                l13 l13Var11111111111111111119 = n13.g;
                                byte[] bArr11111111110 = new byte[i11111111114];
                                s13 s13Var11111111110 = new s13(i11111111114, bArr11111111110);
                                t23.a(s13Var11111111110, dy2Var, entry.getKey(), entry.getValue());
                                s13Var11111111110.d();
                                l13 l13Var111111111111111111110 = new l13(bArr11111111110);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var111111111111111111110);
                                it.remove();
                                break;
                            case 10:
                                iD2 = ((d23) ((f13) value)).d(null);
                                iA3 = u13.a(iD2);
                                iB2 = iA3 + iD2;
                                int i11111111115 = iB2 + iA2 + i2;
                                l13 l13Var111111111111111111111 = n13.g;
                                byte[] bArr11111111111 = new byte[i11111111115];
                                s13 s13Var11111111111 = new s13(i11111111115, bArr11111111111);
                                t23.a(s13Var11111111111, dy2Var, entry.getKey(), entry.getValue());
                                s13Var11111111111.d();
                                l13 l13Var111111111111111111112 = new l13(bArr11111111111);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var111111111111111111112);
                                it.remove();
                                break;
                            case 11:
                                if (value instanceof n13) {
                                    iD2 = ((n13) value).d();
                                    iA3 = u13.a(iD2);
                                } else {
                                    iD2 = ((byte[]) value).length;
                                    iA3 = u13.a(iD2);
                                }
                                iB2 = iA3 + iD2;
                                int i11111111116 = iB2 + iA2 + i2;
                                l13 l13Var111111111111111111113 = n13.g;
                                byte[] bArr11111111112 = new byte[i11111111116];
                                s13 s13Var11111111112 = new s13(i11111111116, bArr11111111112);
                                t23.a(s13Var11111111112, dy2Var, entry.getKey(), entry.getValue());
                                s13Var11111111112.d();
                                l13 l13Var111111111111111111114 = new l13(bArr11111111112);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var111111111111111111114);
                                it.remove();
                                break;
                            case 12:
                                iB2 = u13.a(((Integer) value).intValue());
                                int i11111111117 = iB2 + iA2 + i2;
                                l13 l13Var111111111111111111115 = n13.g;
                                byte[] bArr11111111113 = new byte[i11111111117];
                                s13 s13Var11111111113 = new s13(i11111111117, bArr11111111113);
                                t23.a(s13Var11111111113, dy2Var, entry.getKey(), entry.getValue());
                                s13Var11111111113.d();
                                l13 l13Var111111111111111111116 = new l13(bArr11111111113);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var111111111111111111116);
                                it.remove();
                                break;
                            case 13:
                                if (value instanceof f23) {
                                    iB2 = u13.b(((f23) value).a());
                                } else {
                                    iB2 = u13.b(((Integer) value).intValue());
                                }
                                int i11111111118 = iB2 + iA2 + i2;
                                l13 l13Var111111111111111111117 = n13.g;
                                byte[] bArr11111111114 = new byte[i11111111118];
                                s13 s13Var11111111114 = new s13(i11111111118, bArr11111111114);
                                t23.a(s13Var11111111114, dy2Var, entry.getKey(), entry.getValue());
                                s13Var11111111114.d();
                                l13 l13Var111111111111111111118 = new l13(bArr11111111114);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var111111111111111111118);
                                it.remove();
                                break;
                            case 14:
                                ((Integer) value).getClass();
                                iB2 = 4;
                                int i11111111119 = iB2 + iA2 + i2;
                                l13 l13Var111111111111111111119 = n13.g;
                                byte[] bArr11111111115 = new byte[i11111111119];
                                s13 s13Var11111111115 = new s13(i11111111119, bArr11111111115);
                                t23.a(s13Var11111111115, dy2Var, entry.getKey(), entry.getValue());
                                s13Var11111111115.d();
                                l13 l13Var1111111111111111111110 = new l13(bArr11111111115);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var1111111111111111111110);
                                it.remove();
                                break;
                            case 15:
                                ((Long) value).getClass();
                                iB2 = 8;
                                int i111111111110 = iB2 + iA2 + i2;
                                l13 l13Var1111111111111111111111 = n13.g;
                                byte[] bArr11111111116 = new byte[i111111111110];
                                s13 s13Var11111111116 = new s13(i111111111110, bArr11111111116);
                                t23.a(s13Var11111111116, dy2Var, entry.getKey(), entry.getValue());
                                s13Var11111111116.d();
                                l13 l13Var1111111111111111111112 = new l13(bArr11111111116);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var1111111111111111111112);
                                it.remove();
                                break;
                            case 16:
                                int iIntValue6 = ((Integer) value).intValue();
                                iB2 = u13.a((iIntValue6 >> 31) ^ (iIntValue6 + iIntValue6));
                                int i111111111111 = iB2 + iA2 + i2;
                                l13 l13Var1111111111111111111113 = n13.g;
                                byte[] bArr11111111117 = new byte[i111111111111];
                                s13 s13Var11111111117 = new s13(i111111111111, bArr11111111117);
                                t23.a(s13Var11111111117, dy2Var, entry.getKey(), entry.getValue());
                                s13Var11111111117.d();
                                l13 l13Var1111111111111111111114 = new l13(bArr11111111117);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var1111111111111111111114);
                                it.remove();
                                break;
                            case 17:
                                long jLongValue6 = ((Long) value).longValue();
                                iB2 = u13.b((jLongValue6 >> c) ^ (jLongValue6 + jLongValue6));
                                int i111111111112 = iB2 + iA2 + i2;
                                l13 l13Var1111111111111111111115 = n13.g;
                                byte[] bArr11111111118 = new byte[i111111111112];
                                s13 s13Var11111111118 = new s13(i111111111112, bArr11111111118);
                                t23.a(s13Var11111111118, dy2Var, entry.getKey(), entry.getValue());
                                s13Var11111111118.d();
                                l13 l13Var1111111111111111111116 = new l13(bArr11111111118);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var1111111111111111111116);
                                it.remove();
                                break;
                            default:
                                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                        }
                        break;
                    case 6:
                        ((Integer) key).getClass();
                        iB = 4;
                        i2 = iB + iA4;
                        iA2 = u13.a(16);
                        if (y33Var2 == y33Var3) {
                            iA2 += iA2;
                        }
                        switch (y33Var2.ordinal()) {
                            case 0:
                                ((Double) value).getClass();
                                iB2 = 8;
                                int i111111111113 = iB2 + iA2 + i2;
                                l13 l13Var1111111111111111111117 = n13.g;
                                byte[] bArr11111111119 = new byte[i111111111113];
                                s13 s13Var11111111119 = new s13(i111111111113, bArr11111111119);
                                t23.a(s13Var11111111119, dy2Var, entry.getKey(), entry.getValue());
                                s13Var11111111119.d();
                                l13 l13Var1111111111111111111118 = new l13(bArr11111111119);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var1111111111111111111118);
                                it.remove();
                                break;
                            case 1:
                                ((Float) value).getClass();
                                iB2 = 4;
                                int i111111111114 = iB2 + iA2 + i2;
                                l13 l13Var1111111111111111111119 = n13.g;
                                byte[] bArr111111111110 = new byte[i111111111114];
                                s13 s13Var111111111110 = new s13(i111111111114, bArr111111111110);
                                t23.a(s13Var111111111110, dy2Var, entry.getKey(), entry.getValue());
                                s13Var111111111110.d();
                                l13 l13Var11111111111111111111110 = new l13(bArr111111111110);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var11111111111111111111110);
                                it.remove();
                                break;
                            case 2:
                                iB2 = u13.b(((Long) value).longValue());
                                int i111111111115 = iB2 + iA2 + i2;
                                l13 l13Var11111111111111111111111 = n13.g;
                                byte[] bArr111111111111 = new byte[i111111111115];
                                s13 s13Var111111111111 = new s13(i111111111115, bArr111111111111);
                                t23.a(s13Var111111111111, dy2Var, entry.getKey(), entry.getValue());
                                s13Var111111111111.d();
                                l13 l13Var11111111111111111111112 = new l13(bArr111111111111);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var11111111111111111111112);
                                it.remove();
                                break;
                            case 3:
                                iB2 = u13.b(((Long) value).longValue());
                                int i111111111116 = iB2 + iA2 + i2;
                                l13 l13Var11111111111111111111113 = n13.g;
                                byte[] bArr111111111112 = new byte[i111111111116];
                                s13 s13Var111111111112 = new s13(i111111111116, bArr111111111112);
                                t23.a(s13Var111111111112, dy2Var, entry.getKey(), entry.getValue());
                                s13Var111111111112.d();
                                l13 l13Var11111111111111111111114 = new l13(bArr111111111112);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var11111111111111111111114);
                                it.remove();
                                break;
                            case 4:
                                iB2 = u13.b(((Integer) value).intValue());
                                int i111111111117 = iB2 + iA2 + i2;
                                l13 l13Var11111111111111111111115 = n13.g;
                                byte[] bArr111111111113 = new byte[i111111111117];
                                s13 s13Var111111111113 = new s13(i111111111117, bArr111111111113);
                                t23.a(s13Var111111111113, dy2Var, entry.getKey(), entry.getValue());
                                s13Var111111111113.d();
                                l13 l13Var11111111111111111111116 = new l13(bArr111111111113);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var11111111111111111111116);
                                it.remove();
                                break;
                            case 5:
                                ((Long) value).getClass();
                                iB2 = 8;
                                int i111111111118 = iB2 + iA2 + i2;
                                l13 l13Var11111111111111111111117 = n13.g;
                                byte[] bArr111111111114 = new byte[i111111111118];
                                s13 s13Var111111111114 = new s13(i111111111118, bArr111111111114);
                                t23.a(s13Var111111111114, dy2Var, entry.getKey(), entry.getValue());
                                s13Var111111111114.d();
                                l13 l13Var11111111111111111111118 = new l13(bArr111111111114);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var11111111111111111111118);
                                it.remove();
                                break;
                            case 6:
                                ((Integer) value).getClass();
                                iB2 = 4;
                                int i111111111119 = iB2 + iA2 + i2;
                                l13 l13Var11111111111111111111119 = n13.g;
                                byte[] bArr111111111115 = new byte[i111111111119];
                                s13 s13Var111111111115 = new s13(i111111111119, bArr111111111115);
                                t23.a(s13Var111111111115, dy2Var, entry.getKey(), entry.getValue());
                                s13Var111111111115.d();
                                l13 l13Var111111111111111111111110 = new l13(bArr111111111115);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var111111111111111111111110);
                                it.remove();
                                break;
                            case 7:
                                ((Boolean) value).getClass();
                                iB2 = 1;
                                int i1111111111110 = iB2 + iA2 + i2;
                                l13 l13Var111111111111111111111111 = n13.g;
                                byte[] bArr111111111116 = new byte[i1111111111110];
                                s13 s13Var111111111116 = new s13(i1111111111110, bArr111111111116);
                                t23.a(s13Var111111111116, dy2Var, entry.getKey(), entry.getValue());
                                s13Var111111111116.d();
                                l13 l13Var111111111111111111111112 = new l13(bArr111111111116);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var111111111111111111111112);
                                it.remove();
                                break;
                            case 8:
                                if (value instanceof n13) {
                                    iD2 = ((n13) value).d();
                                    iA3 = u13.a(iD2);
                                    iB2 = iA3 + iD2;
                                } else {
                                    iB2 = u13.c((String) value);
                                }
                                int i1111111111111 = iB2 + iA2 + i2;
                                l13 l13Var111111111111111111111113 = n13.g;
                                byte[] bArr111111111117 = new byte[i1111111111111];
                                s13 s13Var111111111117 = new s13(i1111111111111, bArr111111111117);
                                t23.a(s13Var111111111117, dy2Var, entry.getKey(), entry.getValue());
                                s13Var111111111117.d();
                                l13 l13Var111111111111111111111114 = new l13(bArr111111111117);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var111111111111111111111114);
                                it.remove();
                                break;
                            case 9:
                                iB2 = ((d23) ((f13) value)).d(null);
                                int i1111111111112 = iB2 + iA2 + i2;
                                l13 l13Var111111111111111111111115 = n13.g;
                                byte[] bArr111111111118 = new byte[i1111111111112];
                                s13 s13Var111111111118 = new s13(i1111111111112, bArr111111111118);
                                t23.a(s13Var111111111118, dy2Var, entry.getKey(), entry.getValue());
                                s13Var111111111118.d();
                                l13 l13Var111111111111111111111116 = new l13(bArr111111111118);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var111111111111111111111116);
                                it.remove();
                                break;
                            case 10:
                                iD2 = ((d23) ((f13) value)).d(null);
                                iA3 = u13.a(iD2);
                                iB2 = iA3 + iD2;
                                int i1111111111113 = iB2 + iA2 + i2;
                                l13 l13Var111111111111111111111117 = n13.g;
                                byte[] bArr111111111119 = new byte[i1111111111113];
                                s13 s13Var111111111119 = new s13(i1111111111113, bArr111111111119);
                                t23.a(s13Var111111111119, dy2Var, entry.getKey(), entry.getValue());
                                s13Var111111111119.d();
                                l13 l13Var111111111111111111111118 = new l13(bArr111111111119);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var111111111111111111111118);
                                it.remove();
                                break;
                            case 11:
                                if (value instanceof n13) {
                                    iD2 = ((n13) value).d();
                                    iA3 = u13.a(iD2);
                                } else {
                                    iD2 = ((byte[]) value).length;
                                    iA3 = u13.a(iD2);
                                }
                                iB2 = iA3 + iD2;
                                int i1111111111114 = iB2 + iA2 + i2;
                                l13 l13Var111111111111111111111119 = n13.g;
                                byte[] bArr1111111111110 = new byte[i1111111111114];
                                s13 s13Var1111111111110 = new s13(i1111111111114, bArr1111111111110);
                                t23.a(s13Var1111111111110, dy2Var, entry.getKey(), entry.getValue());
                                s13Var1111111111110.d();
                                l13 l13Var1111111111111111111111110 = new l13(bArr1111111111110);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var1111111111111111111111110);
                                it.remove();
                                break;
                            case 12:
                                iB2 = u13.a(((Integer) value).intValue());
                                int i1111111111115 = iB2 + iA2 + i2;
                                l13 l13Var1111111111111111111111111 = n13.g;
                                byte[] bArr1111111111111 = new byte[i1111111111115];
                                s13 s13Var1111111111111 = new s13(i1111111111115, bArr1111111111111);
                                t23.a(s13Var1111111111111, dy2Var, entry.getKey(), entry.getValue());
                                s13Var1111111111111.d();
                                l13 l13Var1111111111111111111111112 = new l13(bArr1111111111111);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var1111111111111111111111112);
                                it.remove();
                                break;
                            case 13:
                                if (value instanceof f23) {
                                    iB2 = u13.b(((f23) value).a());
                                } else {
                                    iB2 = u13.b(((Integer) value).intValue());
                                }
                                int i1111111111116 = iB2 + iA2 + i2;
                                l13 l13Var1111111111111111111111113 = n13.g;
                                byte[] bArr1111111111112 = new byte[i1111111111116];
                                s13 s13Var1111111111112 = new s13(i1111111111116, bArr1111111111112);
                                t23.a(s13Var1111111111112, dy2Var, entry.getKey(), entry.getValue());
                                s13Var1111111111112.d();
                                l13 l13Var1111111111111111111111114 = new l13(bArr1111111111112);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var1111111111111111111111114);
                                it.remove();
                                break;
                            case 14:
                                ((Integer) value).getClass();
                                iB2 = 4;
                                int i1111111111117 = iB2 + iA2 + i2;
                                l13 l13Var1111111111111111111111115 = n13.g;
                                byte[] bArr1111111111113 = new byte[i1111111111117];
                                s13 s13Var1111111111113 = new s13(i1111111111117, bArr1111111111113);
                                t23.a(s13Var1111111111113, dy2Var, entry.getKey(), entry.getValue());
                                s13Var1111111111113.d();
                                l13 l13Var1111111111111111111111116 = new l13(bArr1111111111113);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var1111111111111111111111116);
                                it.remove();
                                break;
                            case 15:
                                ((Long) value).getClass();
                                iB2 = 8;
                                int i1111111111118 = iB2 + iA2 + i2;
                                l13 l13Var1111111111111111111111117 = n13.g;
                                byte[] bArr1111111111114 = new byte[i1111111111118];
                                s13 s13Var1111111111114 = new s13(i1111111111118, bArr1111111111114);
                                t23.a(s13Var1111111111114, dy2Var, entry.getKey(), entry.getValue());
                                s13Var1111111111114.d();
                                l13 l13Var1111111111111111111111118 = new l13(bArr1111111111114);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var1111111111111111111111118);
                                it.remove();
                                break;
                            case 16:
                                int iIntValue7 = ((Integer) value).intValue();
                                iB2 = u13.a((iIntValue7 >> 31) ^ (iIntValue7 + iIntValue7));
                                int i1111111111119 = iB2 + iA2 + i2;
                                l13 l13Var1111111111111111111111119 = n13.g;
                                byte[] bArr1111111111115 = new byte[i1111111111119];
                                s13 s13Var1111111111115 = new s13(i1111111111119, bArr1111111111115);
                                t23.a(s13Var1111111111115, dy2Var, entry.getKey(), entry.getValue());
                                s13Var1111111111115.d();
                                l13 l13Var11111111111111111111111110 = new l13(bArr1111111111115);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var11111111111111111111111110);
                                it.remove();
                                break;
                            case 17:
                                long jLongValue7 = ((Long) value).longValue();
                                iB2 = u13.b((jLongValue7 >> c) ^ (jLongValue7 + jLongValue7));
                                int i11111111111110 = iB2 + iA2 + i2;
                                l13 l13Var11111111111111111111111111 = n13.g;
                                byte[] bArr1111111111116 = new byte[i11111111111110];
                                s13 s13Var1111111111116 = new s13(i11111111111110, bArr1111111111116);
                                t23.a(s13Var1111111111116, dy2Var, entry.getKey(), entry.getValue());
                                s13Var1111111111116.d();
                                l13 l13Var11111111111111111111111112 = new l13(bArr1111111111116);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var11111111111111111111111112);
                                it.remove();
                                break;
                            default:
                                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                        }
                        break;
                    case 7:
                        c = '?';
                        ((Boolean) key).getClass();
                        iB = 1;
                        i2 = iB + iA4;
                        iA2 = u13.a(16);
                        if (y33Var2 == y33Var3) {
                            iA2 += iA2;
                        }
                        switch (y33Var2.ordinal()) {
                            case 0:
                                ((Double) value).getClass();
                                iB2 = 8;
                                int i11111111111111 = iB2 + iA2 + i2;
                                l13 l13Var11111111111111111111111113 = n13.g;
                                byte[] bArr1111111111117 = new byte[i11111111111111];
                                s13 s13Var1111111111117 = new s13(i11111111111111, bArr1111111111117);
                                t23.a(s13Var1111111111117, dy2Var, entry.getKey(), entry.getValue());
                                s13Var1111111111117.d();
                                l13 l13Var11111111111111111111111114 = new l13(bArr1111111111117);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var11111111111111111111111114);
                                it.remove();
                                break;
                            case 1:
                                ((Float) value).getClass();
                                iB2 = 4;
                                int i11111111111112 = iB2 + iA2 + i2;
                                l13 l13Var11111111111111111111111115 = n13.g;
                                byte[] bArr1111111111118 = new byte[i11111111111112];
                                s13 s13Var1111111111118 = new s13(i11111111111112, bArr1111111111118);
                                t23.a(s13Var1111111111118, dy2Var, entry.getKey(), entry.getValue());
                                s13Var1111111111118.d();
                                l13 l13Var11111111111111111111111116 = new l13(bArr1111111111118);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var11111111111111111111111116);
                                it.remove();
                                break;
                            case 2:
                                iB2 = u13.b(((Long) value).longValue());
                                int i11111111111113 = iB2 + iA2 + i2;
                                l13 l13Var11111111111111111111111117 = n13.g;
                                byte[] bArr1111111111119 = new byte[i11111111111113];
                                s13 s13Var1111111111119 = new s13(i11111111111113, bArr1111111111119);
                                t23.a(s13Var1111111111119, dy2Var, entry.getKey(), entry.getValue());
                                s13Var1111111111119.d();
                                l13 l13Var11111111111111111111111118 = new l13(bArr1111111111119);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var11111111111111111111111118);
                                it.remove();
                                break;
                            case 3:
                                iB2 = u13.b(((Long) value).longValue());
                                int i11111111111114 = iB2 + iA2 + i2;
                                l13 l13Var11111111111111111111111119 = n13.g;
                                byte[] bArr11111111111110 = new byte[i11111111111114];
                                s13 s13Var11111111111110 = new s13(i11111111111114, bArr11111111111110);
                                t23.a(s13Var11111111111110, dy2Var, entry.getKey(), entry.getValue());
                                s13Var11111111111110.d();
                                l13 l13Var111111111111111111111111110 = new l13(bArr11111111111110);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var111111111111111111111111110);
                                it.remove();
                                break;
                            case 4:
                                iB2 = u13.b(((Integer) value).intValue());
                                int i11111111111115 = iB2 + iA2 + i2;
                                l13 l13Var111111111111111111111111111 = n13.g;
                                byte[] bArr11111111111111 = new byte[i11111111111115];
                                s13 s13Var11111111111111 = new s13(i11111111111115, bArr11111111111111);
                                t23.a(s13Var11111111111111, dy2Var, entry.getKey(), entry.getValue());
                                s13Var11111111111111.d();
                                l13 l13Var111111111111111111111111112 = new l13(bArr11111111111111);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var111111111111111111111111112);
                                it.remove();
                                break;
                            case 5:
                                ((Long) value).getClass();
                                iB2 = 8;
                                int i11111111111116 = iB2 + iA2 + i2;
                                l13 l13Var111111111111111111111111113 = n13.g;
                                byte[] bArr11111111111112 = new byte[i11111111111116];
                                s13 s13Var11111111111112 = new s13(i11111111111116, bArr11111111111112);
                                t23.a(s13Var11111111111112, dy2Var, entry.getKey(), entry.getValue());
                                s13Var11111111111112.d();
                                l13 l13Var111111111111111111111111114 = new l13(bArr11111111111112);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var111111111111111111111111114);
                                it.remove();
                                break;
                            case 6:
                                ((Integer) value).getClass();
                                iB2 = 4;
                                int i11111111111117 = iB2 + iA2 + i2;
                                l13 l13Var111111111111111111111111115 = n13.g;
                                byte[] bArr11111111111113 = new byte[i11111111111117];
                                s13 s13Var11111111111113 = new s13(i11111111111117, bArr11111111111113);
                                t23.a(s13Var11111111111113, dy2Var, entry.getKey(), entry.getValue());
                                s13Var11111111111113.d();
                                l13 l13Var111111111111111111111111116 = new l13(bArr11111111111113);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var111111111111111111111111116);
                                it.remove();
                                break;
                            case 7:
                                ((Boolean) value).getClass();
                                iB2 = 1;
                                int i11111111111118 = iB2 + iA2 + i2;
                                l13 l13Var111111111111111111111111117 = n13.g;
                                byte[] bArr11111111111114 = new byte[i11111111111118];
                                s13 s13Var11111111111114 = new s13(i11111111111118, bArr11111111111114);
                                t23.a(s13Var11111111111114, dy2Var, entry.getKey(), entry.getValue());
                                s13Var11111111111114.d();
                                l13 l13Var111111111111111111111111118 = new l13(bArr11111111111114);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var111111111111111111111111118);
                                it.remove();
                                break;
                            case 8:
                                if (value instanceof n13) {
                                    iD2 = ((n13) value).d();
                                    iA3 = u13.a(iD2);
                                    iB2 = iA3 + iD2;
                                } else {
                                    iB2 = u13.c((String) value);
                                }
                                int i11111111111119 = iB2 + iA2 + i2;
                                l13 l13Var111111111111111111111111119 = n13.g;
                                byte[] bArr11111111111115 = new byte[i11111111111119];
                                s13 s13Var11111111111115 = new s13(i11111111111119, bArr11111111111115);
                                t23.a(s13Var11111111111115, dy2Var, entry.getKey(), entry.getValue());
                                s13Var11111111111115.d();
                                l13 l13Var1111111111111111111111111110 = new l13(bArr11111111111115);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var1111111111111111111111111110);
                                it.remove();
                                break;
                            case 9:
                                iB2 = ((d23) ((f13) value)).d(null);
                                int i111111111111110 = iB2 + iA2 + i2;
                                l13 l13Var1111111111111111111111111111 = n13.g;
                                byte[] bArr11111111111116 = new byte[i111111111111110];
                                s13 s13Var11111111111116 = new s13(i111111111111110, bArr11111111111116);
                                t23.a(s13Var11111111111116, dy2Var, entry.getKey(), entry.getValue());
                                s13Var11111111111116.d();
                                l13 l13Var1111111111111111111111111112 = new l13(bArr11111111111116);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var1111111111111111111111111112);
                                it.remove();
                                break;
                            case 10:
                                iD2 = ((d23) ((f13) value)).d(null);
                                iA3 = u13.a(iD2);
                                iB2 = iA3 + iD2;
                                int i111111111111111 = iB2 + iA2 + i2;
                                l13 l13Var1111111111111111111111111113 = n13.g;
                                byte[] bArr11111111111117 = new byte[i111111111111111];
                                s13 s13Var11111111111117 = new s13(i111111111111111, bArr11111111111117);
                                t23.a(s13Var11111111111117, dy2Var, entry.getKey(), entry.getValue());
                                s13Var11111111111117.d();
                                l13 l13Var1111111111111111111111111114 = new l13(bArr11111111111117);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var1111111111111111111111111114);
                                it.remove();
                                break;
                            case 11:
                                if (value instanceof n13) {
                                    iD2 = ((n13) value).d();
                                    iA3 = u13.a(iD2);
                                } else {
                                    iD2 = ((byte[]) value).length;
                                    iA3 = u13.a(iD2);
                                }
                                iB2 = iA3 + iD2;
                                int i111111111111112 = iB2 + iA2 + i2;
                                l13 l13Var1111111111111111111111111115 = n13.g;
                                byte[] bArr11111111111118 = new byte[i111111111111112];
                                s13 s13Var11111111111118 = new s13(i111111111111112, bArr11111111111118);
                                t23.a(s13Var11111111111118, dy2Var, entry.getKey(), entry.getValue());
                                s13Var11111111111118.d();
                                l13 l13Var1111111111111111111111111116 = new l13(bArr11111111111118);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var1111111111111111111111111116);
                                it.remove();
                                break;
                            case 12:
                                iB2 = u13.a(((Integer) value).intValue());
                                int i111111111111113 = iB2 + iA2 + i2;
                                l13 l13Var1111111111111111111111111117 = n13.g;
                                byte[] bArr11111111111119 = new byte[i111111111111113];
                                s13 s13Var11111111111119 = new s13(i111111111111113, bArr11111111111119);
                                t23.a(s13Var11111111111119, dy2Var, entry.getKey(), entry.getValue());
                                s13Var11111111111119.d();
                                l13 l13Var1111111111111111111111111118 = new l13(bArr11111111111119);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var1111111111111111111111111118);
                                it.remove();
                                break;
                            case 13:
                                if (value instanceof f23) {
                                    iB2 = u13.b(((f23) value).a());
                                } else {
                                    iB2 = u13.b(((Integer) value).intValue());
                                }
                                int i111111111111114 = iB2 + iA2 + i2;
                                l13 l13Var1111111111111111111111111119 = n13.g;
                                byte[] bArr111111111111110 = new byte[i111111111111114];
                                s13 s13Var111111111111110 = new s13(i111111111111114, bArr111111111111110);
                                t23.a(s13Var111111111111110, dy2Var, entry.getKey(), entry.getValue());
                                s13Var111111111111110.d();
                                l13 l13Var11111111111111111111111111110 = new l13(bArr111111111111110);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var11111111111111111111111111110);
                                it.remove();
                                break;
                            case 14:
                                ((Integer) value).getClass();
                                iB2 = 4;
                                int i111111111111115 = iB2 + iA2 + i2;
                                l13 l13Var11111111111111111111111111111 = n13.g;
                                byte[] bArr111111111111111 = new byte[i111111111111115];
                                s13 s13Var111111111111111 = new s13(i111111111111115, bArr111111111111111);
                                t23.a(s13Var111111111111111, dy2Var, entry.getKey(), entry.getValue());
                                s13Var111111111111111.d();
                                l13 l13Var11111111111111111111111111112 = new l13(bArr111111111111111);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var11111111111111111111111111112);
                                it.remove();
                                break;
                            case 15:
                                ((Long) value).getClass();
                                iB2 = 8;
                                int i111111111111116 = iB2 + iA2 + i2;
                                l13 l13Var11111111111111111111111111113 = n13.g;
                                byte[] bArr111111111111112 = new byte[i111111111111116];
                                s13 s13Var111111111111112 = new s13(i111111111111116, bArr111111111111112);
                                t23.a(s13Var111111111111112, dy2Var, entry.getKey(), entry.getValue());
                                s13Var111111111111112.d();
                                l13 l13Var11111111111111111111111111114 = new l13(bArr111111111111112);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var11111111111111111111111111114);
                                it.remove();
                                break;
                            case 16:
                                int iIntValue8 = ((Integer) value).intValue();
                                iB2 = u13.a((iIntValue8 >> 31) ^ (iIntValue8 + iIntValue8));
                                int i111111111111117 = iB2 + iA2 + i2;
                                l13 l13Var11111111111111111111111111115 = n13.g;
                                byte[] bArr111111111111113 = new byte[i111111111111117];
                                s13 s13Var111111111111113 = new s13(i111111111111117, bArr111111111111113);
                                t23.a(s13Var111111111111113, dy2Var, entry.getKey(), entry.getValue());
                                s13Var111111111111113.d();
                                l13 l13Var11111111111111111111111111116 = new l13(bArr111111111111113);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var11111111111111111111111111116);
                                it.remove();
                                break;
                            case 17:
                                long jLongValue8 = ((Long) value).longValue();
                                iB2 = u13.b((jLongValue8 >> c) ^ (jLongValue8 + jLongValue8));
                                int i111111111111118 = iB2 + iA2 + i2;
                                l13 l13Var11111111111111111111111111117 = n13.g;
                                byte[] bArr111111111111114 = new byte[i111111111111118];
                                s13 s13Var111111111111114 = new s13(i111111111111118, bArr111111111111114);
                                t23.a(s13Var111111111111114, dy2Var, entry.getKey(), entry.getValue());
                                s13Var111111111111114.d();
                                l13 l13Var11111111111111111111111111118 = new l13(bArr111111111111114);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var11111111111111111111111111118);
                                it.remove();
                                break;
                            default:
                                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                        }
                        break;
                    case 8:
                        c = '?';
                        if (key instanceof n13) {
                            iD = ((n13) key).d();
                            iA = u13.a(iD);
                            iB = iD + iA;
                        } else {
                            iB = u13.c((String) key);
                        }
                        i2 = iB + iA4;
                        iA2 = u13.a(16);
                        if (y33Var2 == y33Var3) {
                            iA2 += iA2;
                        }
                        switch (y33Var2.ordinal()) {
                            case 0:
                                ((Double) value).getClass();
                                iB2 = 8;
                                int i111111111111119 = iB2 + iA2 + i2;
                                l13 l13Var11111111111111111111111111119 = n13.g;
                                byte[] bArr111111111111115 = new byte[i111111111111119];
                                s13 s13Var111111111111115 = new s13(i111111111111119, bArr111111111111115);
                                t23.a(s13Var111111111111115, dy2Var, entry.getKey(), entry.getValue());
                                s13Var111111111111115.d();
                                l13 l13Var111111111111111111111111111110 = new l13(bArr111111111111115);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var111111111111111111111111111110);
                                it.remove();
                                break;
                            case 1:
                                ((Float) value).getClass();
                                iB2 = 4;
                                int i1111111111111110 = iB2 + iA2 + i2;
                                l13 l13Var111111111111111111111111111111 = n13.g;
                                byte[] bArr111111111111116 = new byte[i1111111111111110];
                                s13 s13Var111111111111116 = new s13(i1111111111111110, bArr111111111111116);
                                t23.a(s13Var111111111111116, dy2Var, entry.getKey(), entry.getValue());
                                s13Var111111111111116.d();
                                l13 l13Var111111111111111111111111111112 = new l13(bArr111111111111116);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var111111111111111111111111111112);
                                it.remove();
                                break;
                            case 2:
                                iB2 = u13.b(((Long) value).longValue());
                                int i1111111111111111 = iB2 + iA2 + i2;
                                l13 l13Var111111111111111111111111111113 = n13.g;
                                byte[] bArr111111111111117 = new byte[i1111111111111111];
                                s13 s13Var111111111111117 = new s13(i1111111111111111, bArr111111111111117);
                                t23.a(s13Var111111111111117, dy2Var, entry.getKey(), entry.getValue());
                                s13Var111111111111117.d();
                                l13 l13Var111111111111111111111111111114 = new l13(bArr111111111111117);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var111111111111111111111111111114);
                                it.remove();
                                break;
                            case 3:
                                iB2 = u13.b(((Long) value).longValue());
                                int i1111111111111112 = iB2 + iA2 + i2;
                                l13 l13Var111111111111111111111111111115 = n13.g;
                                byte[] bArr111111111111118 = new byte[i1111111111111112];
                                s13 s13Var111111111111118 = new s13(i1111111111111112, bArr111111111111118);
                                t23.a(s13Var111111111111118, dy2Var, entry.getKey(), entry.getValue());
                                s13Var111111111111118.d();
                                l13 l13Var111111111111111111111111111116 = new l13(bArr111111111111118);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var111111111111111111111111111116);
                                it.remove();
                                break;
                            case 4:
                                iB2 = u13.b(((Integer) value).intValue());
                                int i1111111111111113 = iB2 + iA2 + i2;
                                l13 l13Var111111111111111111111111111117 = n13.g;
                                byte[] bArr111111111111119 = new byte[i1111111111111113];
                                s13 s13Var111111111111119 = new s13(i1111111111111113, bArr111111111111119);
                                t23.a(s13Var111111111111119, dy2Var, entry.getKey(), entry.getValue());
                                s13Var111111111111119.d();
                                l13 l13Var111111111111111111111111111118 = new l13(bArr111111111111119);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var111111111111111111111111111118);
                                it.remove();
                                break;
                            case 5:
                                ((Long) value).getClass();
                                iB2 = 8;
                                int i1111111111111114 = iB2 + iA2 + i2;
                                l13 l13Var111111111111111111111111111119 = n13.g;
                                byte[] bArr1111111111111110 = new byte[i1111111111111114];
                                s13 s13Var1111111111111110 = new s13(i1111111111111114, bArr1111111111111110);
                                t23.a(s13Var1111111111111110, dy2Var, entry.getKey(), entry.getValue());
                                s13Var1111111111111110.d();
                                l13 l13Var1111111111111111111111111111110 = new l13(bArr1111111111111110);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var1111111111111111111111111111110);
                                it.remove();
                                break;
                            case 6:
                                ((Integer) value).getClass();
                                iB2 = 4;
                                int i1111111111111115 = iB2 + iA2 + i2;
                                l13 l13Var1111111111111111111111111111111 = n13.g;
                                byte[] bArr1111111111111111 = new byte[i1111111111111115];
                                s13 s13Var1111111111111111 = new s13(i1111111111111115, bArr1111111111111111);
                                t23.a(s13Var1111111111111111, dy2Var, entry.getKey(), entry.getValue());
                                s13Var1111111111111111.d();
                                l13 l13Var1111111111111111111111111111112 = new l13(bArr1111111111111111);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var1111111111111111111111111111112);
                                it.remove();
                                break;
                            case 7:
                                ((Boolean) value).getClass();
                                iB2 = 1;
                                int i1111111111111116 = iB2 + iA2 + i2;
                                l13 l13Var1111111111111111111111111111113 = n13.g;
                                byte[] bArr1111111111111112 = new byte[i1111111111111116];
                                s13 s13Var1111111111111112 = new s13(i1111111111111116, bArr1111111111111112);
                                t23.a(s13Var1111111111111112, dy2Var, entry.getKey(), entry.getValue());
                                s13Var1111111111111112.d();
                                l13 l13Var1111111111111111111111111111114 = new l13(bArr1111111111111112);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var1111111111111111111111111111114);
                                it.remove();
                                break;
                            case 8:
                                if (value instanceof n13) {
                                    iD2 = ((n13) value).d();
                                    iA3 = u13.a(iD2);
                                    iB2 = iA3 + iD2;
                                } else {
                                    iB2 = u13.c((String) value);
                                }
                                int i1111111111111117 = iB2 + iA2 + i2;
                                l13 l13Var1111111111111111111111111111115 = n13.g;
                                byte[] bArr1111111111111113 = new byte[i1111111111111117];
                                s13 s13Var1111111111111113 = new s13(i1111111111111117, bArr1111111111111113);
                                t23.a(s13Var1111111111111113, dy2Var, entry.getKey(), entry.getValue());
                                s13Var1111111111111113.d();
                                l13 l13Var1111111111111111111111111111116 = new l13(bArr1111111111111113);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var1111111111111111111111111111116);
                                it.remove();
                                break;
                            case 9:
                                iB2 = ((d23) ((f13) value)).d(null);
                                int i1111111111111118 = iB2 + iA2 + i2;
                                l13 l13Var1111111111111111111111111111117 = n13.g;
                                byte[] bArr1111111111111114 = new byte[i1111111111111118];
                                s13 s13Var1111111111111114 = new s13(i1111111111111118, bArr1111111111111114);
                                t23.a(s13Var1111111111111114, dy2Var, entry.getKey(), entry.getValue());
                                s13Var1111111111111114.d();
                                l13 l13Var1111111111111111111111111111118 = new l13(bArr1111111111111114);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var1111111111111111111111111111118);
                                it.remove();
                                break;
                            case 10:
                                iD2 = ((d23) ((f13) value)).d(null);
                                iA3 = u13.a(iD2);
                                iB2 = iA3 + iD2;
                                int i1111111111111119 = iB2 + iA2 + i2;
                                l13 l13Var1111111111111111111111111111119 = n13.g;
                                byte[] bArr1111111111111115 = new byte[i1111111111111119];
                                s13 s13Var1111111111111115 = new s13(i1111111111111119, bArr1111111111111115);
                                t23.a(s13Var1111111111111115, dy2Var, entry.getKey(), entry.getValue());
                                s13Var1111111111111115.d();
                                l13 l13Var11111111111111111111111111111110 = new l13(bArr1111111111111115);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var11111111111111111111111111111110);
                                it.remove();
                                break;
                            case 11:
                                if (value instanceof n13) {
                                    iD2 = ((n13) value).d();
                                    iA3 = u13.a(iD2);
                                } else {
                                    iD2 = ((byte[]) value).length;
                                    iA3 = u13.a(iD2);
                                }
                                iB2 = iA3 + iD2;
                                int i11111111111111110 = iB2 + iA2 + i2;
                                l13 l13Var11111111111111111111111111111111 = n13.g;
                                byte[] bArr1111111111111116 = new byte[i11111111111111110];
                                s13 s13Var1111111111111116 = new s13(i11111111111111110, bArr1111111111111116);
                                t23.a(s13Var1111111111111116, dy2Var, entry.getKey(), entry.getValue());
                                s13Var1111111111111116.d();
                                l13 l13Var11111111111111111111111111111112 = new l13(bArr1111111111111116);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var11111111111111111111111111111112);
                                it.remove();
                                break;
                            case 12:
                                iB2 = u13.a(((Integer) value).intValue());
                                int i11111111111111111 = iB2 + iA2 + i2;
                                l13 l13Var11111111111111111111111111111113 = n13.g;
                                byte[] bArr1111111111111117 = new byte[i11111111111111111];
                                s13 s13Var1111111111111117 = new s13(i11111111111111111, bArr1111111111111117);
                                t23.a(s13Var1111111111111117, dy2Var, entry.getKey(), entry.getValue());
                                s13Var1111111111111117.d();
                                l13 l13Var11111111111111111111111111111114 = new l13(bArr1111111111111117);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var11111111111111111111111111111114);
                                it.remove();
                                break;
                            case 13:
                                if (value instanceof f23) {
                                    iB2 = u13.b(((f23) value).a());
                                } else {
                                    iB2 = u13.b(((Integer) value).intValue());
                                }
                                int i11111111111111112 = iB2 + iA2 + i2;
                                l13 l13Var11111111111111111111111111111115 = n13.g;
                                byte[] bArr1111111111111118 = new byte[i11111111111111112];
                                s13 s13Var1111111111111118 = new s13(i11111111111111112, bArr1111111111111118);
                                t23.a(s13Var1111111111111118, dy2Var, entry.getKey(), entry.getValue());
                                s13Var1111111111111118.d();
                                l13 l13Var11111111111111111111111111111116 = new l13(bArr1111111111111118);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var11111111111111111111111111111116);
                                it.remove();
                                break;
                            case 14:
                                ((Integer) value).getClass();
                                iB2 = 4;
                                int i11111111111111113 = iB2 + iA2 + i2;
                                l13 l13Var11111111111111111111111111111117 = n13.g;
                                byte[] bArr1111111111111119 = new byte[i11111111111111113];
                                s13 s13Var1111111111111119 = new s13(i11111111111111113, bArr1111111111111119);
                                t23.a(s13Var1111111111111119, dy2Var, entry.getKey(), entry.getValue());
                                s13Var1111111111111119.d();
                                l13 l13Var11111111111111111111111111111118 = new l13(bArr1111111111111119);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var11111111111111111111111111111118);
                                it.remove();
                                break;
                            case 15:
                                ((Long) value).getClass();
                                iB2 = 8;
                                int i11111111111111114 = iB2 + iA2 + i2;
                                l13 l13Var11111111111111111111111111111119 = n13.g;
                                byte[] bArr11111111111111110 = new byte[i11111111111111114];
                                s13 s13Var11111111111111110 = new s13(i11111111111111114, bArr11111111111111110);
                                t23.a(s13Var11111111111111110, dy2Var, entry.getKey(), entry.getValue());
                                s13Var11111111111111110.d();
                                l13 l13Var111111111111111111111111111111110 = new l13(bArr11111111111111110);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var111111111111111111111111111111110);
                                it.remove();
                                break;
                            case 16:
                                int iIntValue9 = ((Integer) value).intValue();
                                iB2 = u13.a((iIntValue9 >> 31) ^ (iIntValue9 + iIntValue9));
                                int i11111111111111115 = iB2 + iA2 + i2;
                                l13 l13Var111111111111111111111111111111111 = n13.g;
                                byte[] bArr11111111111111111 = new byte[i11111111111111115];
                                s13 s13Var11111111111111111 = new s13(i11111111111111115, bArr11111111111111111);
                                t23.a(s13Var11111111111111111, dy2Var, entry.getKey(), entry.getValue());
                                s13Var11111111111111111.d();
                                l13 l13Var111111111111111111111111111111112 = new l13(bArr11111111111111111);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var111111111111111111111111111111112);
                                it.remove();
                                break;
                            case 17:
                                long jLongValue9 = ((Long) value).longValue();
                                iB2 = u13.b((jLongValue9 >> c) ^ (jLongValue9 + jLongValue9));
                                int i11111111111111116 = iB2 + iA2 + i2;
                                l13 l13Var111111111111111111111111111111113 = n13.g;
                                byte[] bArr11111111111111112 = new byte[i11111111111111116];
                                s13 s13Var11111111111111112 = new s13(i11111111111111116, bArr11111111111111112);
                                t23.a(s13Var11111111111111112, dy2Var, entry.getKey(), entry.getValue());
                                s13Var11111111111111112.d();
                                l13 l13Var111111111111111111111111111111114 = new l13(bArr11111111111111112);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var111111111111111111111111111111114);
                                it.remove();
                                break;
                            default:
                                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                        }
                        break;
                    case 9:
                        c = '?';
                        iB = ((d23) ((f13) key)).d(null);
                        i2 = iB + iA4;
                        iA2 = u13.a(16);
                        if (y33Var2 == y33Var3) {
                            iA2 += iA2;
                        }
                        switch (y33Var2.ordinal()) {
                            case 0:
                                ((Double) value).getClass();
                                iB2 = 8;
                                int i11111111111111117 = iB2 + iA2 + i2;
                                l13 l13Var111111111111111111111111111111115 = n13.g;
                                byte[] bArr11111111111111113 = new byte[i11111111111111117];
                                s13 s13Var11111111111111113 = new s13(i11111111111111117, bArr11111111111111113);
                                t23.a(s13Var11111111111111113, dy2Var, entry.getKey(), entry.getValue());
                                s13Var11111111111111113.d();
                                l13 l13Var111111111111111111111111111111116 = new l13(bArr11111111111111113);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var111111111111111111111111111111116);
                                it.remove();
                                break;
                            case 1:
                                ((Float) value).getClass();
                                iB2 = 4;
                                int i11111111111111118 = iB2 + iA2 + i2;
                                l13 l13Var111111111111111111111111111111117 = n13.g;
                                byte[] bArr11111111111111114 = new byte[i11111111111111118];
                                s13 s13Var11111111111111114 = new s13(i11111111111111118, bArr11111111111111114);
                                t23.a(s13Var11111111111111114, dy2Var, entry.getKey(), entry.getValue());
                                s13Var11111111111111114.d();
                                l13 l13Var111111111111111111111111111111118 = new l13(bArr11111111111111114);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var111111111111111111111111111111118);
                                it.remove();
                                break;
                            case 2:
                                iB2 = u13.b(((Long) value).longValue());
                                int i11111111111111119 = iB2 + iA2 + i2;
                                l13 l13Var111111111111111111111111111111119 = n13.g;
                                byte[] bArr11111111111111115 = new byte[i11111111111111119];
                                s13 s13Var11111111111111115 = new s13(i11111111111111119, bArr11111111111111115);
                                t23.a(s13Var11111111111111115, dy2Var, entry.getKey(), entry.getValue());
                                s13Var11111111111111115.d();
                                l13 l13Var1111111111111111111111111111111110 = new l13(bArr11111111111111115);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var1111111111111111111111111111111110);
                                it.remove();
                                break;
                            case 3:
                                iB2 = u13.b(((Long) value).longValue());
                                int i111111111111111110 = iB2 + iA2 + i2;
                                l13 l13Var1111111111111111111111111111111111 = n13.g;
                                byte[] bArr11111111111111116 = new byte[i111111111111111110];
                                s13 s13Var11111111111111116 = new s13(i111111111111111110, bArr11111111111111116);
                                t23.a(s13Var11111111111111116, dy2Var, entry.getKey(), entry.getValue());
                                s13Var11111111111111116.d();
                                l13 l13Var1111111111111111111111111111111112 = new l13(bArr11111111111111116);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var1111111111111111111111111111111112);
                                it.remove();
                                break;
                            case 4:
                                iB2 = u13.b(((Integer) value).intValue());
                                int i111111111111111111 = iB2 + iA2 + i2;
                                l13 l13Var1111111111111111111111111111111113 = n13.g;
                                byte[] bArr11111111111111117 = new byte[i111111111111111111];
                                s13 s13Var11111111111111117 = new s13(i111111111111111111, bArr11111111111111117);
                                t23.a(s13Var11111111111111117, dy2Var, entry.getKey(), entry.getValue());
                                s13Var11111111111111117.d();
                                l13 l13Var1111111111111111111111111111111114 = new l13(bArr11111111111111117);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var1111111111111111111111111111111114);
                                it.remove();
                                break;
                            case 5:
                                ((Long) value).getClass();
                                iB2 = 8;
                                int i111111111111111112 = iB2 + iA2 + i2;
                                l13 l13Var1111111111111111111111111111111115 = n13.g;
                                byte[] bArr11111111111111118 = new byte[i111111111111111112];
                                s13 s13Var11111111111111118 = new s13(i111111111111111112, bArr11111111111111118);
                                t23.a(s13Var11111111111111118, dy2Var, entry.getKey(), entry.getValue());
                                s13Var11111111111111118.d();
                                l13 l13Var1111111111111111111111111111111116 = new l13(bArr11111111111111118);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var1111111111111111111111111111111116);
                                it.remove();
                                break;
                            case 6:
                                ((Integer) value).getClass();
                                iB2 = 4;
                                int i111111111111111113 = iB2 + iA2 + i2;
                                l13 l13Var1111111111111111111111111111111117 = n13.g;
                                byte[] bArr11111111111111119 = new byte[i111111111111111113];
                                s13 s13Var11111111111111119 = new s13(i111111111111111113, bArr11111111111111119);
                                t23.a(s13Var11111111111111119, dy2Var, entry.getKey(), entry.getValue());
                                s13Var11111111111111119.d();
                                l13 l13Var1111111111111111111111111111111118 = new l13(bArr11111111111111119);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var1111111111111111111111111111111118);
                                it.remove();
                                break;
                            case 7:
                                ((Boolean) value).getClass();
                                iB2 = 1;
                                int i111111111111111114 = iB2 + iA2 + i2;
                                l13 l13Var1111111111111111111111111111111119 = n13.g;
                                byte[] bArr111111111111111110 = new byte[i111111111111111114];
                                s13 s13Var111111111111111110 = new s13(i111111111111111114, bArr111111111111111110);
                                t23.a(s13Var111111111111111110, dy2Var, entry.getKey(), entry.getValue());
                                s13Var111111111111111110.d();
                                l13 l13Var11111111111111111111111111111111110 = new l13(bArr111111111111111110);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var11111111111111111111111111111111110);
                                it.remove();
                                break;
                            case 8:
                                if (value instanceof n13) {
                                    iD2 = ((n13) value).d();
                                    iA3 = u13.a(iD2);
                                    iB2 = iA3 + iD2;
                                } else {
                                    iB2 = u13.c((String) value);
                                }
                                int i111111111111111115 = iB2 + iA2 + i2;
                                l13 l13Var11111111111111111111111111111111111 = n13.g;
                                byte[] bArr111111111111111111 = new byte[i111111111111111115];
                                s13 s13Var111111111111111111 = new s13(i111111111111111115, bArr111111111111111111);
                                t23.a(s13Var111111111111111111, dy2Var, entry.getKey(), entry.getValue());
                                s13Var111111111111111111.d();
                                l13 l13Var11111111111111111111111111111111112 = new l13(bArr111111111111111111);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var11111111111111111111111111111111112);
                                it.remove();
                                break;
                            case 9:
                                iB2 = ((d23) ((f13) value)).d(null);
                                int i111111111111111116 = iB2 + iA2 + i2;
                                l13 l13Var11111111111111111111111111111111113 = n13.g;
                                byte[] bArr111111111111111112 = new byte[i111111111111111116];
                                s13 s13Var111111111111111112 = new s13(i111111111111111116, bArr111111111111111112);
                                t23.a(s13Var111111111111111112, dy2Var, entry.getKey(), entry.getValue());
                                s13Var111111111111111112.d();
                                l13 l13Var11111111111111111111111111111111114 = new l13(bArr111111111111111112);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var11111111111111111111111111111111114);
                                it.remove();
                                break;
                            case 10:
                                iD2 = ((d23) ((f13) value)).d(null);
                                iA3 = u13.a(iD2);
                                iB2 = iA3 + iD2;
                                int i111111111111111117 = iB2 + iA2 + i2;
                                l13 l13Var11111111111111111111111111111111115 = n13.g;
                                byte[] bArr111111111111111113 = new byte[i111111111111111117];
                                s13 s13Var111111111111111113 = new s13(i111111111111111117, bArr111111111111111113);
                                t23.a(s13Var111111111111111113, dy2Var, entry.getKey(), entry.getValue());
                                s13Var111111111111111113.d();
                                l13 l13Var11111111111111111111111111111111116 = new l13(bArr111111111111111113);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var11111111111111111111111111111111116);
                                it.remove();
                                break;
                            case 11:
                                if (value instanceof n13) {
                                    iD2 = ((n13) value).d();
                                    iA3 = u13.a(iD2);
                                } else {
                                    iD2 = ((byte[]) value).length;
                                    iA3 = u13.a(iD2);
                                }
                                iB2 = iA3 + iD2;
                                int i111111111111111118 = iB2 + iA2 + i2;
                                l13 l13Var11111111111111111111111111111111117 = n13.g;
                                byte[] bArr111111111111111114 = new byte[i111111111111111118];
                                s13 s13Var111111111111111114 = new s13(i111111111111111118, bArr111111111111111114);
                                t23.a(s13Var111111111111111114, dy2Var, entry.getKey(), entry.getValue());
                                s13Var111111111111111114.d();
                                l13 l13Var11111111111111111111111111111111118 = new l13(bArr111111111111111114);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var11111111111111111111111111111111118);
                                it.remove();
                                break;
                            case 12:
                                iB2 = u13.a(((Integer) value).intValue());
                                int i111111111111111119 = iB2 + iA2 + i2;
                                l13 l13Var11111111111111111111111111111111119 = n13.g;
                                byte[] bArr111111111111111115 = new byte[i111111111111111119];
                                s13 s13Var111111111111111115 = new s13(i111111111111111119, bArr111111111111111115);
                                t23.a(s13Var111111111111111115, dy2Var, entry.getKey(), entry.getValue());
                                s13Var111111111111111115.d();
                                l13 l13Var111111111111111111111111111111111110 = new l13(bArr111111111111111115);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var111111111111111111111111111111111110);
                                it.remove();
                                break;
                            case 13:
                                if (value instanceof f23) {
                                    iB2 = u13.b(((f23) value).a());
                                } else {
                                    iB2 = u13.b(((Integer) value).intValue());
                                }
                                int i1111111111111111110 = iB2 + iA2 + i2;
                                l13 l13Var111111111111111111111111111111111111 = n13.g;
                                byte[] bArr111111111111111116 = new byte[i1111111111111111110];
                                s13 s13Var111111111111111116 = new s13(i1111111111111111110, bArr111111111111111116);
                                t23.a(s13Var111111111111111116, dy2Var, entry.getKey(), entry.getValue());
                                s13Var111111111111111116.d();
                                l13 l13Var111111111111111111111111111111111112 = new l13(bArr111111111111111116);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var111111111111111111111111111111111112);
                                it.remove();
                                break;
                            case 14:
                                ((Integer) value).getClass();
                                iB2 = 4;
                                int i1111111111111111111 = iB2 + iA2 + i2;
                                l13 l13Var111111111111111111111111111111111113 = n13.g;
                                byte[] bArr111111111111111117 = new byte[i1111111111111111111];
                                s13 s13Var111111111111111117 = new s13(i1111111111111111111, bArr111111111111111117);
                                t23.a(s13Var111111111111111117, dy2Var, entry.getKey(), entry.getValue());
                                s13Var111111111111111117.d();
                                l13 l13Var111111111111111111111111111111111114 = new l13(bArr111111111111111117);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var111111111111111111111111111111111114);
                                it.remove();
                                break;
                            case 15:
                                ((Long) value).getClass();
                                iB2 = 8;
                                int i1111111111111111112 = iB2 + iA2 + i2;
                                l13 l13Var111111111111111111111111111111111115 = n13.g;
                                byte[] bArr111111111111111118 = new byte[i1111111111111111112];
                                s13 s13Var111111111111111118 = new s13(i1111111111111111112, bArr111111111111111118);
                                t23.a(s13Var111111111111111118, dy2Var, entry.getKey(), entry.getValue());
                                s13Var111111111111111118.d();
                                l13 l13Var111111111111111111111111111111111116 = new l13(bArr111111111111111118);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var111111111111111111111111111111111116);
                                it.remove();
                                break;
                            case 16:
                                int iIntValue10 = ((Integer) value).intValue();
                                iB2 = u13.a((iIntValue10 >> 31) ^ (iIntValue10 + iIntValue10));
                                int i1111111111111111113 = iB2 + iA2 + i2;
                                l13 l13Var111111111111111111111111111111111117 = n13.g;
                                byte[] bArr111111111111111119 = new byte[i1111111111111111113];
                                s13 s13Var111111111111111119 = new s13(i1111111111111111113, bArr111111111111111119);
                                t23.a(s13Var111111111111111119, dy2Var, entry.getKey(), entry.getValue());
                                s13Var111111111111111119.d();
                                l13 l13Var111111111111111111111111111111111118 = new l13(bArr111111111111111119);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var111111111111111111111111111111111118);
                                it.remove();
                                break;
                            case 17:
                                long jLongValue10 = ((Long) value).longValue();
                                iB2 = u13.b((jLongValue10 >> c) ^ (jLongValue10 + jLongValue10));
                                int i1111111111111111114 = iB2 + iA2 + i2;
                                l13 l13Var111111111111111111111111111111111119 = n13.g;
                                byte[] bArr1111111111111111110 = new byte[i1111111111111111114];
                                s13 s13Var1111111111111111110 = new s13(i1111111111111111114, bArr1111111111111111110);
                                t23.a(s13Var1111111111111111110, dy2Var, entry.getKey(), entry.getValue());
                                s13Var1111111111111111110.d();
                                l13 l13Var1111111111111111111111111111111111110 = new l13(bArr1111111111111111110);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var1111111111111111111111111111111111110);
                                it.remove();
                                break;
                            default:
                                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                        }
                        break;
                    case 10:
                        c = '?';
                        iD = ((d23) ((f13) key)).d(null);
                        iA = u13.a(iD);
                        iB = iD + iA;
                        i2 = iB + iA4;
                        iA2 = u13.a(16);
                        if (y33Var2 == y33Var3) {
                            iA2 += iA2;
                        }
                        switch (y33Var2.ordinal()) {
                            case 0:
                                ((Double) value).getClass();
                                iB2 = 8;
                                int i1111111111111111115 = iB2 + iA2 + i2;
                                l13 l13Var1111111111111111111111111111111111111 = n13.g;
                                byte[] bArr1111111111111111111 = new byte[i1111111111111111115];
                                s13 s13Var1111111111111111111 = new s13(i1111111111111111115, bArr1111111111111111111);
                                t23.a(s13Var1111111111111111111, dy2Var, entry.getKey(), entry.getValue());
                                s13Var1111111111111111111.d();
                                l13 l13Var1111111111111111111111111111111111112 = new l13(bArr1111111111111111111);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var1111111111111111111111111111111111112);
                                it.remove();
                                break;
                            case 1:
                                ((Float) value).getClass();
                                iB2 = 4;
                                int i1111111111111111116 = iB2 + iA2 + i2;
                                l13 l13Var1111111111111111111111111111111111113 = n13.g;
                                byte[] bArr1111111111111111112 = new byte[i1111111111111111116];
                                s13 s13Var1111111111111111112 = new s13(i1111111111111111116, bArr1111111111111111112);
                                t23.a(s13Var1111111111111111112, dy2Var, entry.getKey(), entry.getValue());
                                s13Var1111111111111111112.d();
                                l13 l13Var1111111111111111111111111111111111114 = new l13(bArr1111111111111111112);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var1111111111111111111111111111111111114);
                                it.remove();
                                break;
                            case 2:
                                iB2 = u13.b(((Long) value).longValue());
                                int i1111111111111111117 = iB2 + iA2 + i2;
                                l13 l13Var1111111111111111111111111111111111115 = n13.g;
                                byte[] bArr1111111111111111113 = new byte[i1111111111111111117];
                                s13 s13Var1111111111111111113 = new s13(i1111111111111111117, bArr1111111111111111113);
                                t23.a(s13Var1111111111111111113, dy2Var, entry.getKey(), entry.getValue());
                                s13Var1111111111111111113.d();
                                l13 l13Var1111111111111111111111111111111111116 = new l13(bArr1111111111111111113);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var1111111111111111111111111111111111116);
                                it.remove();
                                break;
                            case 3:
                                iB2 = u13.b(((Long) value).longValue());
                                int i1111111111111111118 = iB2 + iA2 + i2;
                                l13 l13Var1111111111111111111111111111111111117 = n13.g;
                                byte[] bArr1111111111111111114 = new byte[i1111111111111111118];
                                s13 s13Var1111111111111111114 = new s13(i1111111111111111118, bArr1111111111111111114);
                                t23.a(s13Var1111111111111111114, dy2Var, entry.getKey(), entry.getValue());
                                s13Var1111111111111111114.d();
                                l13 l13Var1111111111111111111111111111111111118 = new l13(bArr1111111111111111114);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var1111111111111111111111111111111111118);
                                it.remove();
                                break;
                            case 4:
                                iB2 = u13.b(((Integer) value).intValue());
                                int i1111111111111111119 = iB2 + iA2 + i2;
                                l13 l13Var1111111111111111111111111111111111119 = n13.g;
                                byte[] bArr1111111111111111115 = new byte[i1111111111111111119];
                                s13 s13Var1111111111111111115 = new s13(i1111111111111111119, bArr1111111111111111115);
                                t23.a(s13Var1111111111111111115, dy2Var, entry.getKey(), entry.getValue());
                                s13Var1111111111111111115.d();
                                l13 l13Var11111111111111111111111111111111111110 = new l13(bArr1111111111111111115);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var11111111111111111111111111111111111110);
                                it.remove();
                                break;
                            case 5:
                                ((Long) value).getClass();
                                iB2 = 8;
                                int i11111111111111111110 = iB2 + iA2 + i2;
                                l13 l13Var11111111111111111111111111111111111111 = n13.g;
                                byte[] bArr1111111111111111116 = new byte[i11111111111111111110];
                                s13 s13Var1111111111111111116 = new s13(i11111111111111111110, bArr1111111111111111116);
                                t23.a(s13Var1111111111111111116, dy2Var, entry.getKey(), entry.getValue());
                                s13Var1111111111111111116.d();
                                l13 l13Var11111111111111111111111111111111111112 = new l13(bArr1111111111111111116);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var11111111111111111111111111111111111112);
                                it.remove();
                                break;
                            case 6:
                                ((Integer) value).getClass();
                                iB2 = 4;
                                int i11111111111111111111 = iB2 + iA2 + i2;
                                l13 l13Var11111111111111111111111111111111111113 = n13.g;
                                byte[] bArr1111111111111111117 = new byte[i11111111111111111111];
                                s13 s13Var1111111111111111117 = new s13(i11111111111111111111, bArr1111111111111111117);
                                t23.a(s13Var1111111111111111117, dy2Var, entry.getKey(), entry.getValue());
                                s13Var1111111111111111117.d();
                                l13 l13Var11111111111111111111111111111111111114 = new l13(bArr1111111111111111117);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var11111111111111111111111111111111111114);
                                it.remove();
                                break;
                            case 7:
                                ((Boolean) value).getClass();
                                iB2 = 1;
                                int i11111111111111111112 = iB2 + iA2 + i2;
                                l13 l13Var11111111111111111111111111111111111115 = n13.g;
                                byte[] bArr1111111111111111118 = new byte[i11111111111111111112];
                                s13 s13Var1111111111111111118 = new s13(i11111111111111111112, bArr1111111111111111118);
                                t23.a(s13Var1111111111111111118, dy2Var, entry.getKey(), entry.getValue());
                                s13Var1111111111111111118.d();
                                l13 l13Var11111111111111111111111111111111111116 = new l13(bArr1111111111111111118);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var11111111111111111111111111111111111116);
                                it.remove();
                                break;
                            case 8:
                                if (value instanceof n13) {
                                    iD2 = ((n13) value).d();
                                    iA3 = u13.a(iD2);
                                    iB2 = iA3 + iD2;
                                } else {
                                    iB2 = u13.c((String) value);
                                }
                                int i11111111111111111113 = iB2 + iA2 + i2;
                                l13 l13Var11111111111111111111111111111111111117 = n13.g;
                                byte[] bArr1111111111111111119 = new byte[i11111111111111111113];
                                s13 s13Var1111111111111111119 = new s13(i11111111111111111113, bArr1111111111111111119);
                                t23.a(s13Var1111111111111111119, dy2Var, entry.getKey(), entry.getValue());
                                s13Var1111111111111111119.d();
                                l13 l13Var11111111111111111111111111111111111118 = new l13(bArr1111111111111111119);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var11111111111111111111111111111111111118);
                                it.remove();
                                break;
                            case 9:
                                iB2 = ((d23) ((f13) value)).d(null);
                                int i11111111111111111114 = iB2 + iA2 + i2;
                                l13 l13Var11111111111111111111111111111111111119 = n13.g;
                                byte[] bArr11111111111111111110 = new byte[i11111111111111111114];
                                s13 s13Var11111111111111111110 = new s13(i11111111111111111114, bArr11111111111111111110);
                                t23.a(s13Var11111111111111111110, dy2Var, entry.getKey(), entry.getValue());
                                s13Var11111111111111111110.d();
                                l13 l13Var111111111111111111111111111111111111110 = new l13(bArr11111111111111111110);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var111111111111111111111111111111111111110);
                                it.remove();
                                break;
                            case 10:
                                iD2 = ((d23) ((f13) value)).d(null);
                                iA3 = u13.a(iD2);
                                iB2 = iA3 + iD2;
                                int i11111111111111111115 = iB2 + iA2 + i2;
                                l13 l13Var111111111111111111111111111111111111111 = n13.g;
                                byte[] bArr11111111111111111111 = new byte[i11111111111111111115];
                                s13 s13Var11111111111111111111 = new s13(i11111111111111111115, bArr11111111111111111111);
                                t23.a(s13Var11111111111111111111, dy2Var, entry.getKey(), entry.getValue());
                                s13Var11111111111111111111.d();
                                l13 l13Var111111111111111111111111111111111111112 = new l13(bArr11111111111111111111);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var111111111111111111111111111111111111112);
                                it.remove();
                                break;
                            case 11:
                                if (value instanceof n13) {
                                    iD2 = ((n13) value).d();
                                    iA3 = u13.a(iD2);
                                } else {
                                    iD2 = ((byte[]) value).length;
                                    iA3 = u13.a(iD2);
                                }
                                iB2 = iA3 + iD2;
                                int i11111111111111111116 = iB2 + iA2 + i2;
                                l13 l13Var111111111111111111111111111111111111113 = n13.g;
                                byte[] bArr11111111111111111112 = new byte[i11111111111111111116];
                                s13 s13Var11111111111111111112 = new s13(i11111111111111111116, bArr11111111111111111112);
                                t23.a(s13Var11111111111111111112, dy2Var, entry.getKey(), entry.getValue());
                                s13Var11111111111111111112.d();
                                l13 l13Var111111111111111111111111111111111111114 = new l13(bArr11111111111111111112);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var111111111111111111111111111111111111114);
                                it.remove();
                                break;
                            case 12:
                                iB2 = u13.a(((Integer) value).intValue());
                                int i11111111111111111117 = iB2 + iA2 + i2;
                                l13 l13Var111111111111111111111111111111111111115 = n13.g;
                                byte[] bArr11111111111111111113 = new byte[i11111111111111111117];
                                s13 s13Var11111111111111111113 = new s13(i11111111111111111117, bArr11111111111111111113);
                                t23.a(s13Var11111111111111111113, dy2Var, entry.getKey(), entry.getValue());
                                s13Var11111111111111111113.d();
                                l13 l13Var111111111111111111111111111111111111116 = new l13(bArr11111111111111111113);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var111111111111111111111111111111111111116);
                                it.remove();
                                break;
                            case 13:
                                if (value instanceof f23) {
                                    iB2 = u13.b(((f23) value).a());
                                } else {
                                    iB2 = u13.b(((Integer) value).intValue());
                                }
                                int i11111111111111111118 = iB2 + iA2 + i2;
                                l13 l13Var111111111111111111111111111111111111117 = n13.g;
                                byte[] bArr11111111111111111114 = new byte[i11111111111111111118];
                                s13 s13Var11111111111111111114 = new s13(i11111111111111111118, bArr11111111111111111114);
                                t23.a(s13Var11111111111111111114, dy2Var, entry.getKey(), entry.getValue());
                                s13Var11111111111111111114.d();
                                l13 l13Var111111111111111111111111111111111111118 = new l13(bArr11111111111111111114);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var111111111111111111111111111111111111118);
                                it.remove();
                                break;
                            case 14:
                                ((Integer) value).getClass();
                                iB2 = 4;
                                int i11111111111111111119 = iB2 + iA2 + i2;
                                l13 l13Var111111111111111111111111111111111111119 = n13.g;
                                byte[] bArr11111111111111111115 = new byte[i11111111111111111119];
                                s13 s13Var11111111111111111115 = new s13(i11111111111111111119, bArr11111111111111111115);
                                t23.a(s13Var11111111111111111115, dy2Var, entry.getKey(), entry.getValue());
                                s13Var11111111111111111115.d();
                                l13 l13Var1111111111111111111111111111111111111110 = new l13(bArr11111111111111111115);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var1111111111111111111111111111111111111110);
                                it.remove();
                                break;
                            case 15:
                                ((Long) value).getClass();
                                iB2 = 8;
                                int i111111111111111111110 = iB2 + iA2 + i2;
                                l13 l13Var1111111111111111111111111111111111111111 = n13.g;
                                byte[] bArr11111111111111111116 = new byte[i111111111111111111110];
                                s13 s13Var11111111111111111116 = new s13(i111111111111111111110, bArr11111111111111111116);
                                t23.a(s13Var11111111111111111116, dy2Var, entry.getKey(), entry.getValue());
                                s13Var11111111111111111116.d();
                                l13 l13Var1111111111111111111111111111111111111112 = new l13(bArr11111111111111111116);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var1111111111111111111111111111111111111112);
                                it.remove();
                                break;
                            case 16:
                                int iIntValue11 = ((Integer) value).intValue();
                                iB2 = u13.a((iIntValue11 >> 31) ^ (iIntValue11 + iIntValue11));
                                int i111111111111111111111 = iB2 + iA2 + i2;
                                l13 l13Var1111111111111111111111111111111111111113 = n13.g;
                                byte[] bArr11111111111111111117 = new byte[i111111111111111111111];
                                s13 s13Var11111111111111111117 = new s13(i111111111111111111111, bArr11111111111111111117);
                                t23.a(s13Var11111111111111111117, dy2Var, entry.getKey(), entry.getValue());
                                s13Var11111111111111111117.d();
                                l13 l13Var1111111111111111111111111111111111111114 = new l13(bArr11111111111111111117);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var1111111111111111111111111111111111111114);
                                it.remove();
                                break;
                            case 17:
                                long jLongValue11 = ((Long) value).longValue();
                                iB2 = u13.b((jLongValue11 >> c) ^ (jLongValue11 + jLongValue11));
                                int i111111111111111111112 = iB2 + iA2 + i2;
                                l13 l13Var1111111111111111111111111111111111111115 = n13.g;
                                byte[] bArr11111111111111111118 = new byte[i111111111111111111112];
                                s13 s13Var11111111111111111118 = new s13(i111111111111111111112, bArr11111111111111111118);
                                t23.a(s13Var11111111111111111118, dy2Var, entry.getKey(), entry.getValue());
                                s13Var11111111111111111118.d();
                                l13 l13Var1111111111111111111111111111111111111116 = new l13(bArr11111111111111111118);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var1111111111111111111111111111111111111116);
                                it.remove();
                                break;
                            default:
                                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                        }
                        break;
                    case 11:
                        c = '?';
                        if (key instanceof n13) {
                            iD = ((n13) key).d();
                            iA = u13.a(iD);
                        } else {
                            iD = ((byte[]) key).length;
                            iA = u13.a(iD);
                        }
                        iB = iD + iA;
                        i2 = iB + iA4;
                        iA2 = u13.a(16);
                        if (y33Var2 == y33Var3) {
                            iA2 += iA2;
                        }
                        switch (y33Var2.ordinal()) {
                            case 0:
                                ((Double) value).getClass();
                                iB2 = 8;
                                int i111111111111111111113 = iB2 + iA2 + i2;
                                l13 l13Var1111111111111111111111111111111111111117 = n13.g;
                                byte[] bArr11111111111111111119 = new byte[i111111111111111111113];
                                s13 s13Var11111111111111111119 = new s13(i111111111111111111113, bArr11111111111111111119);
                                t23.a(s13Var11111111111111111119, dy2Var, entry.getKey(), entry.getValue());
                                s13Var11111111111111111119.d();
                                l13 l13Var1111111111111111111111111111111111111118 = new l13(bArr11111111111111111119);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var1111111111111111111111111111111111111118);
                                it.remove();
                                break;
                            case 1:
                                ((Float) value).getClass();
                                iB2 = 4;
                                int i111111111111111111114 = iB2 + iA2 + i2;
                                l13 l13Var1111111111111111111111111111111111111119 = n13.g;
                                byte[] bArr111111111111111111110 = new byte[i111111111111111111114];
                                s13 s13Var111111111111111111110 = new s13(i111111111111111111114, bArr111111111111111111110);
                                t23.a(s13Var111111111111111111110, dy2Var, entry.getKey(), entry.getValue());
                                s13Var111111111111111111110.d();
                                l13 l13Var11111111111111111111111111111111111111110 = new l13(bArr111111111111111111110);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var11111111111111111111111111111111111111110);
                                it.remove();
                                break;
                            case 2:
                                iB2 = u13.b(((Long) value).longValue());
                                int i111111111111111111115 = iB2 + iA2 + i2;
                                l13 l13Var11111111111111111111111111111111111111111 = n13.g;
                                byte[] bArr111111111111111111111 = new byte[i111111111111111111115];
                                s13 s13Var111111111111111111111 = new s13(i111111111111111111115, bArr111111111111111111111);
                                t23.a(s13Var111111111111111111111, dy2Var, entry.getKey(), entry.getValue());
                                s13Var111111111111111111111.d();
                                l13 l13Var11111111111111111111111111111111111111112 = new l13(bArr111111111111111111111);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var11111111111111111111111111111111111111112);
                                it.remove();
                                break;
                            case 3:
                                iB2 = u13.b(((Long) value).longValue());
                                int i111111111111111111116 = iB2 + iA2 + i2;
                                l13 l13Var11111111111111111111111111111111111111113 = n13.g;
                                byte[] bArr111111111111111111112 = new byte[i111111111111111111116];
                                s13 s13Var111111111111111111112 = new s13(i111111111111111111116, bArr111111111111111111112);
                                t23.a(s13Var111111111111111111112, dy2Var, entry.getKey(), entry.getValue());
                                s13Var111111111111111111112.d();
                                l13 l13Var11111111111111111111111111111111111111114 = new l13(bArr111111111111111111112);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var11111111111111111111111111111111111111114);
                                it.remove();
                                break;
                            case 4:
                                iB2 = u13.b(((Integer) value).intValue());
                                int i111111111111111111117 = iB2 + iA2 + i2;
                                l13 l13Var11111111111111111111111111111111111111115 = n13.g;
                                byte[] bArr111111111111111111113 = new byte[i111111111111111111117];
                                s13 s13Var111111111111111111113 = new s13(i111111111111111111117, bArr111111111111111111113);
                                t23.a(s13Var111111111111111111113, dy2Var, entry.getKey(), entry.getValue());
                                s13Var111111111111111111113.d();
                                l13 l13Var11111111111111111111111111111111111111116 = new l13(bArr111111111111111111113);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var11111111111111111111111111111111111111116);
                                it.remove();
                                break;
                            case 5:
                                ((Long) value).getClass();
                                iB2 = 8;
                                int i111111111111111111118 = iB2 + iA2 + i2;
                                l13 l13Var11111111111111111111111111111111111111117 = n13.g;
                                byte[] bArr111111111111111111114 = new byte[i111111111111111111118];
                                s13 s13Var111111111111111111114 = new s13(i111111111111111111118, bArr111111111111111111114);
                                t23.a(s13Var111111111111111111114, dy2Var, entry.getKey(), entry.getValue());
                                s13Var111111111111111111114.d();
                                l13 l13Var11111111111111111111111111111111111111118 = new l13(bArr111111111111111111114);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var11111111111111111111111111111111111111118);
                                it.remove();
                                break;
                            case 6:
                                ((Integer) value).getClass();
                                iB2 = 4;
                                int i111111111111111111119 = iB2 + iA2 + i2;
                                l13 l13Var11111111111111111111111111111111111111119 = n13.g;
                                byte[] bArr111111111111111111115 = new byte[i111111111111111111119];
                                s13 s13Var111111111111111111115 = new s13(i111111111111111111119, bArr111111111111111111115);
                                t23.a(s13Var111111111111111111115, dy2Var, entry.getKey(), entry.getValue());
                                s13Var111111111111111111115.d();
                                l13 l13Var111111111111111111111111111111111111111110 = new l13(bArr111111111111111111115);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var111111111111111111111111111111111111111110);
                                it.remove();
                                break;
                            case 7:
                                ((Boolean) value).getClass();
                                iB2 = 1;
                                int i1111111111111111111110 = iB2 + iA2 + i2;
                                l13 l13Var111111111111111111111111111111111111111111 = n13.g;
                                byte[] bArr111111111111111111116 = new byte[i1111111111111111111110];
                                s13 s13Var111111111111111111116 = new s13(i1111111111111111111110, bArr111111111111111111116);
                                t23.a(s13Var111111111111111111116, dy2Var, entry.getKey(), entry.getValue());
                                s13Var111111111111111111116.d();
                                l13 l13Var111111111111111111111111111111111111111112 = new l13(bArr111111111111111111116);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var111111111111111111111111111111111111111112);
                                it.remove();
                                break;
                            case 8:
                                if (value instanceof n13) {
                                    iD2 = ((n13) value).d();
                                    iA3 = u13.a(iD2);
                                    iB2 = iA3 + iD2;
                                } else {
                                    iB2 = u13.c((String) value);
                                }
                                int i1111111111111111111111 = iB2 + iA2 + i2;
                                l13 l13Var111111111111111111111111111111111111111113 = n13.g;
                                byte[] bArr111111111111111111117 = new byte[i1111111111111111111111];
                                s13 s13Var111111111111111111117 = new s13(i1111111111111111111111, bArr111111111111111111117);
                                t23.a(s13Var111111111111111111117, dy2Var, entry.getKey(), entry.getValue());
                                s13Var111111111111111111117.d();
                                l13 l13Var111111111111111111111111111111111111111114 = new l13(bArr111111111111111111117);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var111111111111111111111111111111111111111114);
                                it.remove();
                                break;
                            case 9:
                                iB2 = ((d23) ((f13) value)).d(null);
                                int i1111111111111111111112 = iB2 + iA2 + i2;
                                l13 l13Var111111111111111111111111111111111111111115 = n13.g;
                                byte[] bArr111111111111111111118 = new byte[i1111111111111111111112];
                                s13 s13Var111111111111111111118 = new s13(i1111111111111111111112, bArr111111111111111111118);
                                t23.a(s13Var111111111111111111118, dy2Var, entry.getKey(), entry.getValue());
                                s13Var111111111111111111118.d();
                                l13 l13Var111111111111111111111111111111111111111116 = new l13(bArr111111111111111111118);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var111111111111111111111111111111111111111116);
                                it.remove();
                                break;
                            case 10:
                                iD2 = ((d23) ((f13) value)).d(null);
                                iA3 = u13.a(iD2);
                                iB2 = iA3 + iD2;
                                int i1111111111111111111113 = iB2 + iA2 + i2;
                                l13 l13Var111111111111111111111111111111111111111117 = n13.g;
                                byte[] bArr111111111111111111119 = new byte[i1111111111111111111113];
                                s13 s13Var111111111111111111119 = new s13(i1111111111111111111113, bArr111111111111111111119);
                                t23.a(s13Var111111111111111111119, dy2Var, entry.getKey(), entry.getValue());
                                s13Var111111111111111111119.d();
                                l13 l13Var111111111111111111111111111111111111111118 = new l13(bArr111111111111111111119);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var111111111111111111111111111111111111111118);
                                it.remove();
                                break;
                            case 11:
                                if (value instanceof n13) {
                                    iD2 = ((n13) value).d();
                                    iA3 = u13.a(iD2);
                                } else {
                                    iD2 = ((byte[]) value).length;
                                    iA3 = u13.a(iD2);
                                }
                                iB2 = iA3 + iD2;
                                int i1111111111111111111114 = iB2 + iA2 + i2;
                                l13 l13Var111111111111111111111111111111111111111119 = n13.g;
                                byte[] bArr1111111111111111111110 = new byte[i1111111111111111111114];
                                s13 s13Var1111111111111111111110 = new s13(i1111111111111111111114, bArr1111111111111111111110);
                                t23.a(s13Var1111111111111111111110, dy2Var, entry.getKey(), entry.getValue());
                                s13Var1111111111111111111110.d();
                                l13 l13Var1111111111111111111111111111111111111111110 = new l13(bArr1111111111111111111110);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var1111111111111111111111111111111111111111110);
                                it.remove();
                                break;
                            case 12:
                                iB2 = u13.a(((Integer) value).intValue());
                                int i1111111111111111111115 = iB2 + iA2 + i2;
                                l13 l13Var1111111111111111111111111111111111111111111 = n13.g;
                                byte[] bArr1111111111111111111111 = new byte[i1111111111111111111115];
                                s13 s13Var1111111111111111111111 = new s13(i1111111111111111111115, bArr1111111111111111111111);
                                t23.a(s13Var1111111111111111111111, dy2Var, entry.getKey(), entry.getValue());
                                s13Var1111111111111111111111.d();
                                l13 l13Var1111111111111111111111111111111111111111112 = new l13(bArr1111111111111111111111);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var1111111111111111111111111111111111111111112);
                                it.remove();
                                break;
                            case 13:
                                if (value instanceof f23) {
                                    iB2 = u13.b(((f23) value).a());
                                } else {
                                    iB2 = u13.b(((Integer) value).intValue());
                                }
                                int i1111111111111111111116 = iB2 + iA2 + i2;
                                l13 l13Var1111111111111111111111111111111111111111113 = n13.g;
                                byte[] bArr1111111111111111111112 = new byte[i1111111111111111111116];
                                s13 s13Var1111111111111111111112 = new s13(i1111111111111111111116, bArr1111111111111111111112);
                                t23.a(s13Var1111111111111111111112, dy2Var, entry.getKey(), entry.getValue());
                                s13Var1111111111111111111112.d();
                                l13 l13Var1111111111111111111111111111111111111111114 = new l13(bArr1111111111111111111112);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var1111111111111111111111111111111111111111114);
                                it.remove();
                                break;
                            case 14:
                                ((Integer) value).getClass();
                                iB2 = 4;
                                int i1111111111111111111117 = iB2 + iA2 + i2;
                                l13 l13Var1111111111111111111111111111111111111111115 = n13.g;
                                byte[] bArr1111111111111111111113 = new byte[i1111111111111111111117];
                                s13 s13Var1111111111111111111113 = new s13(i1111111111111111111117, bArr1111111111111111111113);
                                t23.a(s13Var1111111111111111111113, dy2Var, entry.getKey(), entry.getValue());
                                s13Var1111111111111111111113.d();
                                l13 l13Var1111111111111111111111111111111111111111116 = new l13(bArr1111111111111111111113);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var1111111111111111111111111111111111111111116);
                                it.remove();
                                break;
                            case 15:
                                ((Long) value).getClass();
                                iB2 = 8;
                                int i1111111111111111111118 = iB2 + iA2 + i2;
                                l13 l13Var1111111111111111111111111111111111111111117 = n13.g;
                                byte[] bArr1111111111111111111114 = new byte[i1111111111111111111118];
                                s13 s13Var1111111111111111111114 = new s13(i1111111111111111111118, bArr1111111111111111111114);
                                t23.a(s13Var1111111111111111111114, dy2Var, entry.getKey(), entry.getValue());
                                s13Var1111111111111111111114.d();
                                l13 l13Var1111111111111111111111111111111111111111118 = new l13(bArr1111111111111111111114);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var1111111111111111111111111111111111111111118);
                                it.remove();
                                break;
                            case 16:
                                int iIntValue12 = ((Integer) value).intValue();
                                iB2 = u13.a((iIntValue12 >> 31) ^ (iIntValue12 + iIntValue12));
                                int i1111111111111111111119 = iB2 + iA2 + i2;
                                l13 l13Var1111111111111111111111111111111111111111119 = n13.g;
                                byte[] bArr1111111111111111111115 = new byte[i1111111111111111111119];
                                s13 s13Var1111111111111111111115 = new s13(i1111111111111111111119, bArr1111111111111111111115);
                                t23.a(s13Var1111111111111111111115, dy2Var, entry.getKey(), entry.getValue());
                                s13Var1111111111111111111115.d();
                                l13 l13Var11111111111111111111111111111111111111111110 = new l13(bArr1111111111111111111115);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var11111111111111111111111111111111111111111110);
                                it.remove();
                                break;
                            case 17:
                                long jLongValue12 = ((Long) value).longValue();
                                iB2 = u13.b((jLongValue12 >> c) ^ (jLongValue12 + jLongValue12));
                                int i11111111111111111111110 = iB2 + iA2 + i2;
                                l13 l13Var11111111111111111111111111111111111111111111 = n13.g;
                                byte[] bArr1111111111111111111116 = new byte[i11111111111111111111110];
                                s13 s13Var1111111111111111111116 = new s13(i11111111111111111111110, bArr1111111111111111111116);
                                t23.a(s13Var1111111111111111111116, dy2Var, entry.getKey(), entry.getValue());
                                s13Var1111111111111111111116.d();
                                l13 l13Var11111111111111111111111111111111111111111112 = new l13(bArr1111111111111111111116);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var11111111111111111111111111111111111111111112);
                                it.remove();
                                break;
                            default:
                                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                        }
                        break;
                    case 12:
                        c = '?';
                        iB = u13.a(((Integer) key).intValue());
                        i2 = iB + iA4;
                        iA2 = u13.a(16);
                        if (y33Var2 == y33Var3) {
                            iA2 += iA2;
                        }
                        switch (y33Var2.ordinal()) {
                            case 0:
                                ((Double) value).getClass();
                                iB2 = 8;
                                int i11111111111111111111111 = iB2 + iA2 + i2;
                                l13 l13Var11111111111111111111111111111111111111111113 = n13.g;
                                byte[] bArr1111111111111111111117 = new byte[i11111111111111111111111];
                                s13 s13Var1111111111111111111117 = new s13(i11111111111111111111111, bArr1111111111111111111117);
                                t23.a(s13Var1111111111111111111117, dy2Var, entry.getKey(), entry.getValue());
                                s13Var1111111111111111111117.d();
                                l13 l13Var11111111111111111111111111111111111111111114 = new l13(bArr1111111111111111111117);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var11111111111111111111111111111111111111111114);
                                it.remove();
                                break;
                            case 1:
                                ((Float) value).getClass();
                                iB2 = 4;
                                int i11111111111111111111112 = iB2 + iA2 + i2;
                                l13 l13Var11111111111111111111111111111111111111111115 = n13.g;
                                byte[] bArr1111111111111111111118 = new byte[i11111111111111111111112];
                                s13 s13Var1111111111111111111118 = new s13(i11111111111111111111112, bArr1111111111111111111118);
                                t23.a(s13Var1111111111111111111118, dy2Var, entry.getKey(), entry.getValue());
                                s13Var1111111111111111111118.d();
                                l13 l13Var11111111111111111111111111111111111111111116 = new l13(bArr1111111111111111111118);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var11111111111111111111111111111111111111111116);
                                it.remove();
                                break;
                            case 2:
                                iB2 = u13.b(((Long) value).longValue());
                                int i11111111111111111111113 = iB2 + iA2 + i2;
                                l13 l13Var11111111111111111111111111111111111111111117 = n13.g;
                                byte[] bArr1111111111111111111119 = new byte[i11111111111111111111113];
                                s13 s13Var1111111111111111111119 = new s13(i11111111111111111111113, bArr1111111111111111111119);
                                t23.a(s13Var1111111111111111111119, dy2Var, entry.getKey(), entry.getValue());
                                s13Var1111111111111111111119.d();
                                l13 l13Var11111111111111111111111111111111111111111118 = new l13(bArr1111111111111111111119);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var11111111111111111111111111111111111111111118);
                                it.remove();
                                break;
                            case 3:
                                iB2 = u13.b(((Long) value).longValue());
                                int i11111111111111111111114 = iB2 + iA2 + i2;
                                l13 l13Var11111111111111111111111111111111111111111119 = n13.g;
                                byte[] bArr11111111111111111111110 = new byte[i11111111111111111111114];
                                s13 s13Var11111111111111111111110 = new s13(i11111111111111111111114, bArr11111111111111111111110);
                                t23.a(s13Var11111111111111111111110, dy2Var, entry.getKey(), entry.getValue());
                                s13Var11111111111111111111110.d();
                                l13 l13Var111111111111111111111111111111111111111111110 = new l13(bArr11111111111111111111110);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var111111111111111111111111111111111111111111110);
                                it.remove();
                                break;
                            case 4:
                                iB2 = u13.b(((Integer) value).intValue());
                                int i11111111111111111111115 = iB2 + iA2 + i2;
                                l13 l13Var111111111111111111111111111111111111111111111 = n13.g;
                                byte[] bArr11111111111111111111111 = new byte[i11111111111111111111115];
                                s13 s13Var11111111111111111111111 = new s13(i11111111111111111111115, bArr11111111111111111111111);
                                t23.a(s13Var11111111111111111111111, dy2Var, entry.getKey(), entry.getValue());
                                s13Var11111111111111111111111.d();
                                l13 l13Var111111111111111111111111111111111111111111112 = new l13(bArr11111111111111111111111);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var111111111111111111111111111111111111111111112);
                                it.remove();
                                break;
                            case 5:
                                ((Long) value).getClass();
                                iB2 = 8;
                                int i11111111111111111111116 = iB2 + iA2 + i2;
                                l13 l13Var111111111111111111111111111111111111111111113 = n13.g;
                                byte[] bArr11111111111111111111112 = new byte[i11111111111111111111116];
                                s13 s13Var11111111111111111111112 = new s13(i11111111111111111111116, bArr11111111111111111111112);
                                t23.a(s13Var11111111111111111111112, dy2Var, entry.getKey(), entry.getValue());
                                s13Var11111111111111111111112.d();
                                l13 l13Var111111111111111111111111111111111111111111114 = new l13(bArr11111111111111111111112);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var111111111111111111111111111111111111111111114);
                                it.remove();
                                break;
                            case 6:
                                ((Integer) value).getClass();
                                iB2 = 4;
                                int i11111111111111111111117 = iB2 + iA2 + i2;
                                l13 l13Var111111111111111111111111111111111111111111115 = n13.g;
                                byte[] bArr11111111111111111111113 = new byte[i11111111111111111111117];
                                s13 s13Var11111111111111111111113 = new s13(i11111111111111111111117, bArr11111111111111111111113);
                                t23.a(s13Var11111111111111111111113, dy2Var, entry.getKey(), entry.getValue());
                                s13Var11111111111111111111113.d();
                                l13 l13Var111111111111111111111111111111111111111111116 = new l13(bArr11111111111111111111113);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var111111111111111111111111111111111111111111116);
                                it.remove();
                                break;
                            case 7:
                                ((Boolean) value).getClass();
                                iB2 = 1;
                                int i11111111111111111111118 = iB2 + iA2 + i2;
                                l13 l13Var111111111111111111111111111111111111111111117 = n13.g;
                                byte[] bArr11111111111111111111114 = new byte[i11111111111111111111118];
                                s13 s13Var11111111111111111111114 = new s13(i11111111111111111111118, bArr11111111111111111111114);
                                t23.a(s13Var11111111111111111111114, dy2Var, entry.getKey(), entry.getValue());
                                s13Var11111111111111111111114.d();
                                l13 l13Var111111111111111111111111111111111111111111118 = new l13(bArr11111111111111111111114);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var111111111111111111111111111111111111111111118);
                                it.remove();
                                break;
                            case 8:
                                if (value instanceof n13) {
                                    iD2 = ((n13) value).d();
                                    iA3 = u13.a(iD2);
                                    iB2 = iA3 + iD2;
                                } else {
                                    iB2 = u13.c((String) value);
                                }
                                int i11111111111111111111119 = iB2 + iA2 + i2;
                                l13 l13Var111111111111111111111111111111111111111111119 = n13.g;
                                byte[] bArr11111111111111111111115 = new byte[i11111111111111111111119];
                                s13 s13Var11111111111111111111115 = new s13(i11111111111111111111119, bArr11111111111111111111115);
                                t23.a(s13Var11111111111111111111115, dy2Var, entry.getKey(), entry.getValue());
                                s13Var11111111111111111111115.d();
                                l13 l13Var1111111111111111111111111111111111111111111110 = new l13(bArr11111111111111111111115);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var1111111111111111111111111111111111111111111110);
                                it.remove();
                                break;
                            case 9:
                                iB2 = ((d23) ((f13) value)).d(null);
                                int i111111111111111111111110 = iB2 + iA2 + i2;
                                l13 l13Var1111111111111111111111111111111111111111111111 = n13.g;
                                byte[] bArr11111111111111111111116 = new byte[i111111111111111111111110];
                                s13 s13Var11111111111111111111116 = new s13(i111111111111111111111110, bArr11111111111111111111116);
                                t23.a(s13Var11111111111111111111116, dy2Var, entry.getKey(), entry.getValue());
                                s13Var11111111111111111111116.d();
                                l13 l13Var1111111111111111111111111111111111111111111112 = new l13(bArr11111111111111111111116);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var1111111111111111111111111111111111111111111112);
                                it.remove();
                                break;
                            case 10:
                                iD2 = ((d23) ((f13) value)).d(null);
                                iA3 = u13.a(iD2);
                                iB2 = iA3 + iD2;
                                int i111111111111111111111111 = iB2 + iA2 + i2;
                                l13 l13Var1111111111111111111111111111111111111111111113 = n13.g;
                                byte[] bArr11111111111111111111117 = new byte[i111111111111111111111111];
                                s13 s13Var11111111111111111111117 = new s13(i111111111111111111111111, bArr11111111111111111111117);
                                t23.a(s13Var11111111111111111111117, dy2Var, entry.getKey(), entry.getValue());
                                s13Var11111111111111111111117.d();
                                l13 l13Var1111111111111111111111111111111111111111111114 = new l13(bArr11111111111111111111117);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var1111111111111111111111111111111111111111111114);
                                it.remove();
                                break;
                            case 11:
                                if (value instanceof n13) {
                                    iD2 = ((n13) value).d();
                                    iA3 = u13.a(iD2);
                                } else {
                                    iD2 = ((byte[]) value).length;
                                    iA3 = u13.a(iD2);
                                }
                                iB2 = iA3 + iD2;
                                int i111111111111111111111112 = iB2 + iA2 + i2;
                                l13 l13Var1111111111111111111111111111111111111111111115 = n13.g;
                                byte[] bArr11111111111111111111118 = new byte[i111111111111111111111112];
                                s13 s13Var11111111111111111111118 = new s13(i111111111111111111111112, bArr11111111111111111111118);
                                t23.a(s13Var11111111111111111111118, dy2Var, entry.getKey(), entry.getValue());
                                s13Var11111111111111111111118.d();
                                l13 l13Var1111111111111111111111111111111111111111111116 = new l13(bArr11111111111111111111118);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var1111111111111111111111111111111111111111111116);
                                it.remove();
                                break;
                            case 12:
                                iB2 = u13.a(((Integer) value).intValue());
                                int i111111111111111111111113 = iB2 + iA2 + i2;
                                l13 l13Var1111111111111111111111111111111111111111111117 = n13.g;
                                byte[] bArr11111111111111111111119 = new byte[i111111111111111111111113];
                                s13 s13Var11111111111111111111119 = new s13(i111111111111111111111113, bArr11111111111111111111119);
                                t23.a(s13Var11111111111111111111119, dy2Var, entry.getKey(), entry.getValue());
                                s13Var11111111111111111111119.d();
                                l13 l13Var1111111111111111111111111111111111111111111118 = new l13(bArr11111111111111111111119);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var1111111111111111111111111111111111111111111118);
                                it.remove();
                                break;
                            case 13:
                                if (value instanceof f23) {
                                    iB2 = u13.b(((f23) value).a());
                                } else {
                                    iB2 = u13.b(((Integer) value).intValue());
                                }
                                int i111111111111111111111114 = iB2 + iA2 + i2;
                                l13 l13Var1111111111111111111111111111111111111111111119 = n13.g;
                                byte[] bArr111111111111111111111110 = new byte[i111111111111111111111114];
                                s13 s13Var111111111111111111111110 = new s13(i111111111111111111111114, bArr111111111111111111111110);
                                t23.a(s13Var111111111111111111111110, dy2Var, entry.getKey(), entry.getValue());
                                s13Var111111111111111111111110.d();
                                l13 l13Var11111111111111111111111111111111111111111111110 = new l13(bArr111111111111111111111110);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var11111111111111111111111111111111111111111111110);
                                it.remove();
                                break;
                            case 14:
                                ((Integer) value).getClass();
                                iB2 = 4;
                                int i111111111111111111111115 = iB2 + iA2 + i2;
                                l13 l13Var11111111111111111111111111111111111111111111111 = n13.g;
                                byte[] bArr111111111111111111111111 = new byte[i111111111111111111111115];
                                s13 s13Var111111111111111111111111 = new s13(i111111111111111111111115, bArr111111111111111111111111);
                                t23.a(s13Var111111111111111111111111, dy2Var, entry.getKey(), entry.getValue());
                                s13Var111111111111111111111111.d();
                                l13 l13Var11111111111111111111111111111111111111111111112 = new l13(bArr111111111111111111111111);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var11111111111111111111111111111111111111111111112);
                                it.remove();
                                break;
                            case 15:
                                ((Long) value).getClass();
                                iB2 = 8;
                                int i111111111111111111111116 = iB2 + iA2 + i2;
                                l13 l13Var11111111111111111111111111111111111111111111113 = n13.g;
                                byte[] bArr111111111111111111111112 = new byte[i111111111111111111111116];
                                s13 s13Var111111111111111111111112 = new s13(i111111111111111111111116, bArr111111111111111111111112);
                                t23.a(s13Var111111111111111111111112, dy2Var, entry.getKey(), entry.getValue());
                                s13Var111111111111111111111112.d();
                                l13 l13Var11111111111111111111111111111111111111111111114 = new l13(bArr111111111111111111111112);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var11111111111111111111111111111111111111111111114);
                                it.remove();
                                break;
                            case 16:
                                int iIntValue13 = ((Integer) value).intValue();
                                iB2 = u13.a((iIntValue13 >> 31) ^ (iIntValue13 + iIntValue13));
                                int i111111111111111111111117 = iB2 + iA2 + i2;
                                l13 l13Var11111111111111111111111111111111111111111111115 = n13.g;
                                byte[] bArr111111111111111111111113 = new byte[i111111111111111111111117];
                                s13 s13Var111111111111111111111113 = new s13(i111111111111111111111117, bArr111111111111111111111113);
                                t23.a(s13Var111111111111111111111113, dy2Var, entry.getKey(), entry.getValue());
                                s13Var111111111111111111111113.d();
                                l13 l13Var11111111111111111111111111111111111111111111116 = new l13(bArr111111111111111111111113);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var11111111111111111111111111111111111111111111116);
                                it.remove();
                                break;
                            case 17:
                                long jLongValue13 = ((Long) value).longValue();
                                iB2 = u13.b((jLongValue13 >> c) ^ (jLongValue13 + jLongValue13));
                                int i111111111111111111111118 = iB2 + iA2 + i2;
                                l13 l13Var11111111111111111111111111111111111111111111117 = n13.g;
                                byte[] bArr111111111111111111111114 = new byte[i111111111111111111111118];
                                s13 s13Var111111111111111111111114 = new s13(i111111111111111111111118, bArr111111111111111111111114);
                                t23.a(s13Var111111111111111111111114, dy2Var, entry.getKey(), entry.getValue());
                                s13Var111111111111111111111114.d();
                                l13 l13Var11111111111111111111111111111111111111111111118 = new l13(bArr111111111111111111111114);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var11111111111111111111111111111111111111111111118);
                                it.remove();
                                break;
                            default:
                                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                        }
                        break;
                    case 13:
                        if (key instanceof f23) {
                            c = '?';
                            iB = u13.b(((f23) key).a());
                        } else {
                            c = '?';
                            iB = u13.b(((Integer) key).intValue());
                        }
                        i2 = iB + iA4;
                        iA2 = u13.a(16);
                        if (y33Var2 == y33Var3) {
                            iA2 += iA2;
                        }
                        switch (y33Var2.ordinal()) {
                            case 0:
                                ((Double) value).getClass();
                                iB2 = 8;
                                int i111111111111111111111119 = iB2 + iA2 + i2;
                                l13 l13Var11111111111111111111111111111111111111111111119 = n13.g;
                                byte[] bArr111111111111111111111115 = new byte[i111111111111111111111119];
                                s13 s13Var111111111111111111111115 = new s13(i111111111111111111111119, bArr111111111111111111111115);
                                t23.a(s13Var111111111111111111111115, dy2Var, entry.getKey(), entry.getValue());
                                s13Var111111111111111111111115.d();
                                l13 l13Var111111111111111111111111111111111111111111111110 = new l13(bArr111111111111111111111115);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var111111111111111111111111111111111111111111111110);
                                it.remove();
                                break;
                            case 1:
                                ((Float) value).getClass();
                                iB2 = 4;
                                int i1111111111111111111111110 = iB2 + iA2 + i2;
                                l13 l13Var111111111111111111111111111111111111111111111111 = n13.g;
                                byte[] bArr111111111111111111111116 = new byte[i1111111111111111111111110];
                                s13 s13Var111111111111111111111116 = new s13(i1111111111111111111111110, bArr111111111111111111111116);
                                t23.a(s13Var111111111111111111111116, dy2Var, entry.getKey(), entry.getValue());
                                s13Var111111111111111111111116.d();
                                l13 l13Var111111111111111111111111111111111111111111111112 = new l13(bArr111111111111111111111116);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var111111111111111111111111111111111111111111111112);
                                it.remove();
                                break;
                            case 2:
                                iB2 = u13.b(((Long) value).longValue());
                                int i1111111111111111111111111 = iB2 + iA2 + i2;
                                l13 l13Var111111111111111111111111111111111111111111111113 = n13.g;
                                byte[] bArr111111111111111111111117 = new byte[i1111111111111111111111111];
                                s13 s13Var111111111111111111111117 = new s13(i1111111111111111111111111, bArr111111111111111111111117);
                                t23.a(s13Var111111111111111111111117, dy2Var, entry.getKey(), entry.getValue());
                                s13Var111111111111111111111117.d();
                                l13 l13Var111111111111111111111111111111111111111111111114 = new l13(bArr111111111111111111111117);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var111111111111111111111111111111111111111111111114);
                                it.remove();
                                break;
                            case 3:
                                iB2 = u13.b(((Long) value).longValue());
                                int i1111111111111111111111112 = iB2 + iA2 + i2;
                                l13 l13Var111111111111111111111111111111111111111111111115 = n13.g;
                                byte[] bArr111111111111111111111118 = new byte[i1111111111111111111111112];
                                s13 s13Var111111111111111111111118 = new s13(i1111111111111111111111112, bArr111111111111111111111118);
                                t23.a(s13Var111111111111111111111118, dy2Var, entry.getKey(), entry.getValue());
                                s13Var111111111111111111111118.d();
                                l13 l13Var111111111111111111111111111111111111111111111116 = new l13(bArr111111111111111111111118);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var111111111111111111111111111111111111111111111116);
                                it.remove();
                                break;
                            case 4:
                                iB2 = u13.b(((Integer) value).intValue());
                                int i1111111111111111111111113 = iB2 + iA2 + i2;
                                l13 l13Var111111111111111111111111111111111111111111111117 = n13.g;
                                byte[] bArr111111111111111111111119 = new byte[i1111111111111111111111113];
                                s13 s13Var111111111111111111111119 = new s13(i1111111111111111111111113, bArr111111111111111111111119);
                                t23.a(s13Var111111111111111111111119, dy2Var, entry.getKey(), entry.getValue());
                                s13Var111111111111111111111119.d();
                                l13 l13Var111111111111111111111111111111111111111111111118 = new l13(bArr111111111111111111111119);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var111111111111111111111111111111111111111111111118);
                                it.remove();
                                break;
                            case 5:
                                ((Long) value).getClass();
                                iB2 = 8;
                                int i1111111111111111111111114 = iB2 + iA2 + i2;
                                l13 l13Var111111111111111111111111111111111111111111111119 = n13.g;
                                byte[] bArr1111111111111111111111110 = new byte[i1111111111111111111111114];
                                s13 s13Var1111111111111111111111110 = new s13(i1111111111111111111111114, bArr1111111111111111111111110);
                                t23.a(s13Var1111111111111111111111110, dy2Var, entry.getKey(), entry.getValue());
                                s13Var1111111111111111111111110.d();
                                l13 l13Var1111111111111111111111111111111111111111111111110 = new l13(bArr1111111111111111111111110);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var1111111111111111111111111111111111111111111111110);
                                it.remove();
                                break;
                            case 6:
                                ((Integer) value).getClass();
                                iB2 = 4;
                                int i1111111111111111111111115 = iB2 + iA2 + i2;
                                l13 l13Var1111111111111111111111111111111111111111111111111 = n13.g;
                                byte[] bArr1111111111111111111111111 = new byte[i1111111111111111111111115];
                                s13 s13Var1111111111111111111111111 = new s13(i1111111111111111111111115, bArr1111111111111111111111111);
                                t23.a(s13Var1111111111111111111111111, dy2Var, entry.getKey(), entry.getValue());
                                s13Var1111111111111111111111111.d();
                                l13 l13Var1111111111111111111111111111111111111111111111112 = new l13(bArr1111111111111111111111111);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var1111111111111111111111111111111111111111111111112);
                                it.remove();
                                break;
                            case 7:
                                ((Boolean) value).getClass();
                                iB2 = 1;
                                int i1111111111111111111111116 = iB2 + iA2 + i2;
                                l13 l13Var1111111111111111111111111111111111111111111111113 = n13.g;
                                byte[] bArr1111111111111111111111112 = new byte[i1111111111111111111111116];
                                s13 s13Var1111111111111111111111112 = new s13(i1111111111111111111111116, bArr1111111111111111111111112);
                                t23.a(s13Var1111111111111111111111112, dy2Var, entry.getKey(), entry.getValue());
                                s13Var1111111111111111111111112.d();
                                l13 l13Var1111111111111111111111111111111111111111111111114 = new l13(bArr1111111111111111111111112);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var1111111111111111111111111111111111111111111111114);
                                it.remove();
                                break;
                            case 8:
                                if (value instanceof n13) {
                                    iD2 = ((n13) value).d();
                                    iA3 = u13.a(iD2);
                                    iB2 = iA3 + iD2;
                                } else {
                                    iB2 = u13.c((String) value);
                                }
                                int i1111111111111111111111117 = iB2 + iA2 + i2;
                                l13 l13Var1111111111111111111111111111111111111111111111115 = n13.g;
                                byte[] bArr1111111111111111111111113 = new byte[i1111111111111111111111117];
                                s13 s13Var1111111111111111111111113 = new s13(i1111111111111111111111117, bArr1111111111111111111111113);
                                t23.a(s13Var1111111111111111111111113, dy2Var, entry.getKey(), entry.getValue());
                                s13Var1111111111111111111111113.d();
                                l13 l13Var1111111111111111111111111111111111111111111111116 = new l13(bArr1111111111111111111111113);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var1111111111111111111111111111111111111111111111116);
                                it.remove();
                                break;
                            case 9:
                                iB2 = ((d23) ((f13) value)).d(null);
                                int i1111111111111111111111118 = iB2 + iA2 + i2;
                                l13 l13Var1111111111111111111111111111111111111111111111117 = n13.g;
                                byte[] bArr1111111111111111111111114 = new byte[i1111111111111111111111118];
                                s13 s13Var1111111111111111111111114 = new s13(i1111111111111111111111118, bArr1111111111111111111111114);
                                t23.a(s13Var1111111111111111111111114, dy2Var, entry.getKey(), entry.getValue());
                                s13Var1111111111111111111111114.d();
                                l13 l13Var1111111111111111111111111111111111111111111111118 = new l13(bArr1111111111111111111111114);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var1111111111111111111111111111111111111111111111118);
                                it.remove();
                                break;
                            case 10:
                                iD2 = ((d23) ((f13) value)).d(null);
                                iA3 = u13.a(iD2);
                                iB2 = iA3 + iD2;
                                int i1111111111111111111111119 = iB2 + iA2 + i2;
                                l13 l13Var1111111111111111111111111111111111111111111111119 = n13.g;
                                byte[] bArr1111111111111111111111115 = new byte[i1111111111111111111111119];
                                s13 s13Var1111111111111111111111115 = new s13(i1111111111111111111111119, bArr1111111111111111111111115);
                                t23.a(s13Var1111111111111111111111115, dy2Var, entry.getKey(), entry.getValue());
                                s13Var1111111111111111111111115.d();
                                l13 l13Var11111111111111111111111111111111111111111111111110 = new l13(bArr1111111111111111111111115);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var11111111111111111111111111111111111111111111111110);
                                it.remove();
                                break;
                            case 11:
                                if (value instanceof n13) {
                                    iD2 = ((n13) value).d();
                                    iA3 = u13.a(iD2);
                                } else {
                                    iD2 = ((byte[]) value).length;
                                    iA3 = u13.a(iD2);
                                }
                                iB2 = iA3 + iD2;
                                int i11111111111111111111111110 = iB2 + iA2 + i2;
                                l13 l13Var11111111111111111111111111111111111111111111111111 = n13.g;
                                byte[] bArr1111111111111111111111116 = new byte[i11111111111111111111111110];
                                s13 s13Var1111111111111111111111116 = new s13(i11111111111111111111111110, bArr1111111111111111111111116);
                                t23.a(s13Var1111111111111111111111116, dy2Var, entry.getKey(), entry.getValue());
                                s13Var1111111111111111111111116.d();
                                l13 l13Var11111111111111111111111111111111111111111111111112 = new l13(bArr1111111111111111111111116);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var11111111111111111111111111111111111111111111111112);
                                it.remove();
                                break;
                            case 12:
                                iB2 = u13.a(((Integer) value).intValue());
                                int i11111111111111111111111111 = iB2 + iA2 + i2;
                                l13 l13Var11111111111111111111111111111111111111111111111113 = n13.g;
                                byte[] bArr1111111111111111111111117 = new byte[i11111111111111111111111111];
                                s13 s13Var1111111111111111111111117 = new s13(i11111111111111111111111111, bArr1111111111111111111111117);
                                t23.a(s13Var1111111111111111111111117, dy2Var, entry.getKey(), entry.getValue());
                                s13Var1111111111111111111111117.d();
                                l13 l13Var11111111111111111111111111111111111111111111111114 = new l13(bArr1111111111111111111111117);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var11111111111111111111111111111111111111111111111114);
                                it.remove();
                                break;
                            case 13:
                                if (value instanceof f23) {
                                    iB2 = u13.b(((f23) value).a());
                                } else {
                                    iB2 = u13.b(((Integer) value).intValue());
                                }
                                int i11111111111111111111111112 = iB2 + iA2 + i2;
                                l13 l13Var11111111111111111111111111111111111111111111111115 = n13.g;
                                byte[] bArr1111111111111111111111118 = new byte[i11111111111111111111111112];
                                s13 s13Var1111111111111111111111118 = new s13(i11111111111111111111111112, bArr1111111111111111111111118);
                                t23.a(s13Var1111111111111111111111118, dy2Var, entry.getKey(), entry.getValue());
                                s13Var1111111111111111111111118.d();
                                l13 l13Var11111111111111111111111111111111111111111111111116 = new l13(bArr1111111111111111111111118);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var11111111111111111111111111111111111111111111111116);
                                it.remove();
                                break;
                            case 14:
                                ((Integer) value).getClass();
                                iB2 = 4;
                                int i11111111111111111111111113 = iB2 + iA2 + i2;
                                l13 l13Var11111111111111111111111111111111111111111111111117 = n13.g;
                                byte[] bArr1111111111111111111111119 = new byte[i11111111111111111111111113];
                                s13 s13Var1111111111111111111111119 = new s13(i11111111111111111111111113, bArr1111111111111111111111119);
                                t23.a(s13Var1111111111111111111111119, dy2Var, entry.getKey(), entry.getValue());
                                s13Var1111111111111111111111119.d();
                                l13 l13Var11111111111111111111111111111111111111111111111118 = new l13(bArr1111111111111111111111119);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var11111111111111111111111111111111111111111111111118);
                                it.remove();
                                break;
                            case 15:
                                ((Long) value).getClass();
                                iB2 = 8;
                                int i11111111111111111111111114 = iB2 + iA2 + i2;
                                l13 l13Var11111111111111111111111111111111111111111111111119 = n13.g;
                                byte[] bArr11111111111111111111111110 = new byte[i11111111111111111111111114];
                                s13 s13Var11111111111111111111111110 = new s13(i11111111111111111111111114, bArr11111111111111111111111110);
                                t23.a(s13Var11111111111111111111111110, dy2Var, entry.getKey(), entry.getValue());
                                s13Var11111111111111111111111110.d();
                                l13 l13Var111111111111111111111111111111111111111111111111110 = new l13(bArr11111111111111111111111110);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var111111111111111111111111111111111111111111111111110);
                                it.remove();
                                break;
                            case 16:
                                int iIntValue14 = ((Integer) value).intValue();
                                iB2 = u13.a((iIntValue14 >> 31) ^ (iIntValue14 + iIntValue14));
                                int i11111111111111111111111115 = iB2 + iA2 + i2;
                                l13 l13Var111111111111111111111111111111111111111111111111111 = n13.g;
                                byte[] bArr11111111111111111111111111 = new byte[i11111111111111111111111115];
                                s13 s13Var11111111111111111111111111 = new s13(i11111111111111111111111115, bArr11111111111111111111111111);
                                t23.a(s13Var11111111111111111111111111, dy2Var, entry.getKey(), entry.getValue());
                                s13Var11111111111111111111111111.d();
                                l13 l13Var111111111111111111111111111111111111111111111111112 = new l13(bArr11111111111111111111111111);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var111111111111111111111111111111111111111111111111112);
                                it.remove();
                                break;
                            case 17:
                                long jLongValue14 = ((Long) value).longValue();
                                iB2 = u13.b((jLongValue14 >> c) ^ (jLongValue14 + jLongValue14));
                                int i11111111111111111111111116 = iB2 + iA2 + i2;
                                l13 l13Var111111111111111111111111111111111111111111111111113 = n13.g;
                                byte[] bArr11111111111111111111111112 = new byte[i11111111111111111111111116];
                                s13 s13Var11111111111111111111111112 = new s13(i11111111111111111111111116, bArr11111111111111111111111112);
                                t23.a(s13Var11111111111111111111111112, dy2Var, entry.getKey(), entry.getValue());
                                s13Var11111111111111111111111112.d();
                                l13 l13Var111111111111111111111111111111111111111111111111114 = new l13(bArr11111111111111111111111112);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var111111111111111111111111111111111111111111111111114);
                                it.remove();
                                break;
                            default:
                                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                        }
                        break;
                    case 14:
                        ((Integer) key).getClass();
                        iB = 4;
                        i2 = iB + iA4;
                        iA2 = u13.a(16);
                        if (y33Var2 == y33Var3) {
                            iA2 += iA2;
                        }
                        switch (y33Var2.ordinal()) {
                            case 0:
                                ((Double) value).getClass();
                                iB2 = 8;
                                int i11111111111111111111111117 = iB2 + iA2 + i2;
                                l13 l13Var111111111111111111111111111111111111111111111111115 = n13.g;
                                byte[] bArr11111111111111111111111113 = new byte[i11111111111111111111111117];
                                s13 s13Var11111111111111111111111113 = new s13(i11111111111111111111111117, bArr11111111111111111111111113);
                                t23.a(s13Var11111111111111111111111113, dy2Var, entry.getKey(), entry.getValue());
                                s13Var11111111111111111111111113.d();
                                l13 l13Var111111111111111111111111111111111111111111111111116 = new l13(bArr11111111111111111111111113);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var111111111111111111111111111111111111111111111111116);
                                it.remove();
                                break;
                            case 1:
                                ((Float) value).getClass();
                                iB2 = 4;
                                int i11111111111111111111111118 = iB2 + iA2 + i2;
                                l13 l13Var111111111111111111111111111111111111111111111111117 = n13.g;
                                byte[] bArr11111111111111111111111114 = new byte[i11111111111111111111111118];
                                s13 s13Var11111111111111111111111114 = new s13(i11111111111111111111111118, bArr11111111111111111111111114);
                                t23.a(s13Var11111111111111111111111114, dy2Var, entry.getKey(), entry.getValue());
                                s13Var11111111111111111111111114.d();
                                l13 l13Var111111111111111111111111111111111111111111111111118 = new l13(bArr11111111111111111111111114);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var111111111111111111111111111111111111111111111111118);
                                it.remove();
                                break;
                            case 2:
                                iB2 = u13.b(((Long) value).longValue());
                                int i11111111111111111111111119 = iB2 + iA2 + i2;
                                l13 l13Var111111111111111111111111111111111111111111111111119 = n13.g;
                                byte[] bArr11111111111111111111111115 = new byte[i11111111111111111111111119];
                                s13 s13Var11111111111111111111111115 = new s13(i11111111111111111111111119, bArr11111111111111111111111115);
                                t23.a(s13Var11111111111111111111111115, dy2Var, entry.getKey(), entry.getValue());
                                s13Var11111111111111111111111115.d();
                                l13 l13Var1111111111111111111111111111111111111111111111111110 = new l13(bArr11111111111111111111111115);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var1111111111111111111111111111111111111111111111111110);
                                it.remove();
                                break;
                            case 3:
                                iB2 = u13.b(((Long) value).longValue());
                                int i111111111111111111111111110 = iB2 + iA2 + i2;
                                l13 l13Var1111111111111111111111111111111111111111111111111111 = n13.g;
                                byte[] bArr11111111111111111111111116 = new byte[i111111111111111111111111110];
                                s13 s13Var11111111111111111111111116 = new s13(i111111111111111111111111110, bArr11111111111111111111111116);
                                t23.a(s13Var11111111111111111111111116, dy2Var, entry.getKey(), entry.getValue());
                                s13Var11111111111111111111111116.d();
                                l13 l13Var1111111111111111111111111111111111111111111111111112 = new l13(bArr11111111111111111111111116);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var1111111111111111111111111111111111111111111111111112);
                                it.remove();
                                break;
                            case 4:
                                iB2 = u13.b(((Integer) value).intValue());
                                int i111111111111111111111111111 = iB2 + iA2 + i2;
                                l13 l13Var1111111111111111111111111111111111111111111111111113 = n13.g;
                                byte[] bArr11111111111111111111111117 = new byte[i111111111111111111111111111];
                                s13 s13Var11111111111111111111111117 = new s13(i111111111111111111111111111, bArr11111111111111111111111117);
                                t23.a(s13Var11111111111111111111111117, dy2Var, entry.getKey(), entry.getValue());
                                s13Var11111111111111111111111117.d();
                                l13 l13Var1111111111111111111111111111111111111111111111111114 = new l13(bArr11111111111111111111111117);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var1111111111111111111111111111111111111111111111111114);
                                it.remove();
                                break;
                            case 5:
                                ((Long) value).getClass();
                                iB2 = 8;
                                int i111111111111111111111111112 = iB2 + iA2 + i2;
                                l13 l13Var1111111111111111111111111111111111111111111111111115 = n13.g;
                                byte[] bArr11111111111111111111111118 = new byte[i111111111111111111111111112];
                                s13 s13Var11111111111111111111111118 = new s13(i111111111111111111111111112, bArr11111111111111111111111118);
                                t23.a(s13Var11111111111111111111111118, dy2Var, entry.getKey(), entry.getValue());
                                s13Var11111111111111111111111118.d();
                                l13 l13Var1111111111111111111111111111111111111111111111111116 = new l13(bArr11111111111111111111111118);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var1111111111111111111111111111111111111111111111111116);
                                it.remove();
                                break;
                            case 6:
                                ((Integer) value).getClass();
                                iB2 = 4;
                                int i111111111111111111111111113 = iB2 + iA2 + i2;
                                l13 l13Var1111111111111111111111111111111111111111111111111117 = n13.g;
                                byte[] bArr11111111111111111111111119 = new byte[i111111111111111111111111113];
                                s13 s13Var11111111111111111111111119 = new s13(i111111111111111111111111113, bArr11111111111111111111111119);
                                t23.a(s13Var11111111111111111111111119, dy2Var, entry.getKey(), entry.getValue());
                                s13Var11111111111111111111111119.d();
                                l13 l13Var1111111111111111111111111111111111111111111111111118 = new l13(bArr11111111111111111111111119);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var1111111111111111111111111111111111111111111111111118);
                                it.remove();
                                break;
                            case 7:
                                ((Boolean) value).getClass();
                                iB2 = 1;
                                int i111111111111111111111111114 = iB2 + iA2 + i2;
                                l13 l13Var1111111111111111111111111111111111111111111111111119 = n13.g;
                                byte[] bArr111111111111111111111111110 = new byte[i111111111111111111111111114];
                                s13 s13Var111111111111111111111111110 = new s13(i111111111111111111111111114, bArr111111111111111111111111110);
                                t23.a(s13Var111111111111111111111111110, dy2Var, entry.getKey(), entry.getValue());
                                s13Var111111111111111111111111110.d();
                                l13 l13Var11111111111111111111111111111111111111111111111111110 = new l13(bArr111111111111111111111111110);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var11111111111111111111111111111111111111111111111111110);
                                it.remove();
                                break;
                            case 8:
                                if (value instanceof n13) {
                                    iD2 = ((n13) value).d();
                                    iA3 = u13.a(iD2);
                                    iB2 = iA3 + iD2;
                                } else {
                                    iB2 = u13.c((String) value);
                                }
                                int i111111111111111111111111115 = iB2 + iA2 + i2;
                                l13 l13Var11111111111111111111111111111111111111111111111111111 = n13.g;
                                byte[] bArr111111111111111111111111111 = new byte[i111111111111111111111111115];
                                s13 s13Var111111111111111111111111111 = new s13(i111111111111111111111111115, bArr111111111111111111111111111);
                                t23.a(s13Var111111111111111111111111111, dy2Var, entry.getKey(), entry.getValue());
                                s13Var111111111111111111111111111.d();
                                l13 l13Var11111111111111111111111111111111111111111111111111112 = new l13(bArr111111111111111111111111111);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var11111111111111111111111111111111111111111111111111112);
                                it.remove();
                                break;
                            case 9:
                                iB2 = ((d23) ((f13) value)).d(null);
                                int i111111111111111111111111116 = iB2 + iA2 + i2;
                                l13 l13Var11111111111111111111111111111111111111111111111111113 = n13.g;
                                byte[] bArr111111111111111111111111112 = new byte[i111111111111111111111111116];
                                s13 s13Var111111111111111111111111112 = new s13(i111111111111111111111111116, bArr111111111111111111111111112);
                                t23.a(s13Var111111111111111111111111112, dy2Var, entry.getKey(), entry.getValue());
                                s13Var111111111111111111111111112.d();
                                l13 l13Var11111111111111111111111111111111111111111111111111114 = new l13(bArr111111111111111111111111112);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var11111111111111111111111111111111111111111111111111114);
                                it.remove();
                                break;
                            case 10:
                                iD2 = ((d23) ((f13) value)).d(null);
                                iA3 = u13.a(iD2);
                                iB2 = iA3 + iD2;
                                int i111111111111111111111111117 = iB2 + iA2 + i2;
                                l13 l13Var11111111111111111111111111111111111111111111111111115 = n13.g;
                                byte[] bArr111111111111111111111111113 = new byte[i111111111111111111111111117];
                                s13 s13Var111111111111111111111111113 = new s13(i111111111111111111111111117, bArr111111111111111111111111113);
                                t23.a(s13Var111111111111111111111111113, dy2Var, entry.getKey(), entry.getValue());
                                s13Var111111111111111111111111113.d();
                                l13 l13Var11111111111111111111111111111111111111111111111111116 = new l13(bArr111111111111111111111111113);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var11111111111111111111111111111111111111111111111111116);
                                it.remove();
                                break;
                            case 11:
                                if (value instanceof n13) {
                                    iD2 = ((n13) value).d();
                                    iA3 = u13.a(iD2);
                                } else {
                                    iD2 = ((byte[]) value).length;
                                    iA3 = u13.a(iD2);
                                }
                                iB2 = iA3 + iD2;
                                int i111111111111111111111111118 = iB2 + iA2 + i2;
                                l13 l13Var11111111111111111111111111111111111111111111111111117 = n13.g;
                                byte[] bArr111111111111111111111111114 = new byte[i111111111111111111111111118];
                                s13 s13Var111111111111111111111111114 = new s13(i111111111111111111111111118, bArr111111111111111111111111114);
                                t23.a(s13Var111111111111111111111111114, dy2Var, entry.getKey(), entry.getValue());
                                s13Var111111111111111111111111114.d();
                                l13 l13Var11111111111111111111111111111111111111111111111111118 = new l13(bArr111111111111111111111111114);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var11111111111111111111111111111111111111111111111111118);
                                it.remove();
                                break;
                            case 12:
                                iB2 = u13.a(((Integer) value).intValue());
                                int i111111111111111111111111119 = iB2 + iA2 + i2;
                                l13 l13Var11111111111111111111111111111111111111111111111111119 = n13.g;
                                byte[] bArr111111111111111111111111115 = new byte[i111111111111111111111111119];
                                s13 s13Var111111111111111111111111115 = new s13(i111111111111111111111111119, bArr111111111111111111111111115);
                                t23.a(s13Var111111111111111111111111115, dy2Var, entry.getKey(), entry.getValue());
                                s13Var111111111111111111111111115.d();
                                l13 l13Var111111111111111111111111111111111111111111111111111110 = new l13(bArr111111111111111111111111115);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var111111111111111111111111111111111111111111111111111110);
                                it.remove();
                                break;
                            case 13:
                                if (value instanceof f23) {
                                    iB2 = u13.b(((f23) value).a());
                                } else {
                                    iB2 = u13.b(((Integer) value).intValue());
                                }
                                int i1111111111111111111111111110 = iB2 + iA2 + i2;
                                l13 l13Var111111111111111111111111111111111111111111111111111111 = n13.g;
                                byte[] bArr111111111111111111111111116 = new byte[i1111111111111111111111111110];
                                s13 s13Var111111111111111111111111116 = new s13(i1111111111111111111111111110, bArr111111111111111111111111116);
                                t23.a(s13Var111111111111111111111111116, dy2Var, entry.getKey(), entry.getValue());
                                s13Var111111111111111111111111116.d();
                                l13 l13Var111111111111111111111111111111111111111111111111111112 = new l13(bArr111111111111111111111111116);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var111111111111111111111111111111111111111111111111111112);
                                it.remove();
                                break;
                            case 14:
                                ((Integer) value).getClass();
                                iB2 = 4;
                                int i1111111111111111111111111111 = iB2 + iA2 + i2;
                                l13 l13Var111111111111111111111111111111111111111111111111111113 = n13.g;
                                byte[] bArr111111111111111111111111117 = new byte[i1111111111111111111111111111];
                                s13 s13Var111111111111111111111111117 = new s13(i1111111111111111111111111111, bArr111111111111111111111111117);
                                t23.a(s13Var111111111111111111111111117, dy2Var, entry.getKey(), entry.getValue());
                                s13Var111111111111111111111111117.d();
                                l13 l13Var111111111111111111111111111111111111111111111111111114 = new l13(bArr111111111111111111111111117);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var111111111111111111111111111111111111111111111111111114);
                                it.remove();
                                break;
                            case 15:
                                ((Long) value).getClass();
                                iB2 = 8;
                                int i1111111111111111111111111112 = iB2 + iA2 + i2;
                                l13 l13Var111111111111111111111111111111111111111111111111111115 = n13.g;
                                byte[] bArr111111111111111111111111118 = new byte[i1111111111111111111111111112];
                                s13 s13Var111111111111111111111111118 = new s13(i1111111111111111111111111112, bArr111111111111111111111111118);
                                t23.a(s13Var111111111111111111111111118, dy2Var, entry.getKey(), entry.getValue());
                                s13Var111111111111111111111111118.d();
                                l13 l13Var111111111111111111111111111111111111111111111111111116 = new l13(bArr111111111111111111111111118);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var111111111111111111111111111111111111111111111111111116);
                                it.remove();
                                break;
                            case 16:
                                int iIntValue15 = ((Integer) value).intValue();
                                iB2 = u13.a((iIntValue15 >> 31) ^ (iIntValue15 + iIntValue15));
                                int i1111111111111111111111111113 = iB2 + iA2 + i2;
                                l13 l13Var111111111111111111111111111111111111111111111111111117 = n13.g;
                                byte[] bArr111111111111111111111111119 = new byte[i1111111111111111111111111113];
                                s13 s13Var111111111111111111111111119 = new s13(i1111111111111111111111111113, bArr111111111111111111111111119);
                                t23.a(s13Var111111111111111111111111119, dy2Var, entry.getKey(), entry.getValue());
                                s13Var111111111111111111111111119.d();
                                l13 l13Var111111111111111111111111111111111111111111111111111118 = new l13(bArr111111111111111111111111119);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var111111111111111111111111111111111111111111111111111118);
                                it.remove();
                                break;
                            case 17:
                                long jLongValue15 = ((Long) value).longValue();
                                iB2 = u13.b((jLongValue15 >> c) ^ (jLongValue15 + jLongValue15));
                                int i1111111111111111111111111114 = iB2 + iA2 + i2;
                                l13 l13Var111111111111111111111111111111111111111111111111111119 = n13.g;
                                byte[] bArr1111111111111111111111111110 = new byte[i1111111111111111111111111114];
                                s13 s13Var1111111111111111111111111110 = new s13(i1111111111111111111111111114, bArr1111111111111111111111111110);
                                t23.a(s13Var1111111111111111111111111110, dy2Var, entry.getKey(), entry.getValue());
                                s13Var1111111111111111111111111110.d();
                                l13 l13Var1111111111111111111111111111111111111111111111111111110 = new l13(bArr1111111111111111111111111110);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var1111111111111111111111111111111111111111111111111111110);
                                it.remove();
                                break;
                            default:
                                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                        }
                        break;
                    case 15:
                        ((Long) key).getClass();
                        iB = 8;
                        i2 = iB + iA4;
                        iA2 = u13.a(16);
                        if (y33Var2 == y33Var3) {
                            iA2 += iA2;
                        }
                        switch (y33Var2.ordinal()) {
                            case 0:
                                ((Double) value).getClass();
                                iB2 = 8;
                                int i1111111111111111111111111115 = iB2 + iA2 + i2;
                                l13 l13Var1111111111111111111111111111111111111111111111111111111 = n13.g;
                                byte[] bArr1111111111111111111111111111 = new byte[i1111111111111111111111111115];
                                s13 s13Var1111111111111111111111111111 = new s13(i1111111111111111111111111115, bArr1111111111111111111111111111);
                                t23.a(s13Var1111111111111111111111111111, dy2Var, entry.getKey(), entry.getValue());
                                s13Var1111111111111111111111111111.d();
                                l13 l13Var1111111111111111111111111111111111111111111111111111112 = new l13(bArr1111111111111111111111111111);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var1111111111111111111111111111111111111111111111111111112);
                                it.remove();
                                break;
                            case 1:
                                ((Float) value).getClass();
                                iB2 = 4;
                                int i1111111111111111111111111116 = iB2 + iA2 + i2;
                                l13 l13Var1111111111111111111111111111111111111111111111111111113 = n13.g;
                                byte[] bArr1111111111111111111111111112 = new byte[i1111111111111111111111111116];
                                s13 s13Var1111111111111111111111111112 = new s13(i1111111111111111111111111116, bArr1111111111111111111111111112);
                                t23.a(s13Var1111111111111111111111111112, dy2Var, entry.getKey(), entry.getValue());
                                s13Var1111111111111111111111111112.d();
                                l13 l13Var1111111111111111111111111111111111111111111111111111114 = new l13(bArr1111111111111111111111111112);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var1111111111111111111111111111111111111111111111111111114);
                                it.remove();
                                break;
                            case 2:
                                iB2 = u13.b(((Long) value).longValue());
                                int i1111111111111111111111111117 = iB2 + iA2 + i2;
                                l13 l13Var1111111111111111111111111111111111111111111111111111115 = n13.g;
                                byte[] bArr1111111111111111111111111113 = new byte[i1111111111111111111111111117];
                                s13 s13Var1111111111111111111111111113 = new s13(i1111111111111111111111111117, bArr1111111111111111111111111113);
                                t23.a(s13Var1111111111111111111111111113, dy2Var, entry.getKey(), entry.getValue());
                                s13Var1111111111111111111111111113.d();
                                l13 l13Var1111111111111111111111111111111111111111111111111111116 = new l13(bArr1111111111111111111111111113);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var1111111111111111111111111111111111111111111111111111116);
                                it.remove();
                                break;
                            case 3:
                                iB2 = u13.b(((Long) value).longValue());
                                int i1111111111111111111111111118 = iB2 + iA2 + i2;
                                l13 l13Var1111111111111111111111111111111111111111111111111111117 = n13.g;
                                byte[] bArr1111111111111111111111111114 = new byte[i1111111111111111111111111118];
                                s13 s13Var1111111111111111111111111114 = new s13(i1111111111111111111111111118, bArr1111111111111111111111111114);
                                t23.a(s13Var1111111111111111111111111114, dy2Var, entry.getKey(), entry.getValue());
                                s13Var1111111111111111111111111114.d();
                                l13 l13Var1111111111111111111111111111111111111111111111111111118 = new l13(bArr1111111111111111111111111114);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var1111111111111111111111111111111111111111111111111111118);
                                it.remove();
                                break;
                            case 4:
                                iB2 = u13.b(((Integer) value).intValue());
                                int i1111111111111111111111111119 = iB2 + iA2 + i2;
                                l13 l13Var1111111111111111111111111111111111111111111111111111119 = n13.g;
                                byte[] bArr1111111111111111111111111115 = new byte[i1111111111111111111111111119];
                                s13 s13Var1111111111111111111111111115 = new s13(i1111111111111111111111111119, bArr1111111111111111111111111115);
                                t23.a(s13Var1111111111111111111111111115, dy2Var, entry.getKey(), entry.getValue());
                                s13Var1111111111111111111111111115.d();
                                l13 l13Var11111111111111111111111111111111111111111111111111111110 = new l13(bArr1111111111111111111111111115);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var11111111111111111111111111111111111111111111111111111110);
                                it.remove();
                                break;
                            case 5:
                                ((Long) value).getClass();
                                iB2 = 8;
                                int i11111111111111111111111111110 = iB2 + iA2 + i2;
                                l13 l13Var11111111111111111111111111111111111111111111111111111111 = n13.g;
                                byte[] bArr1111111111111111111111111116 = new byte[i11111111111111111111111111110];
                                s13 s13Var1111111111111111111111111116 = new s13(i11111111111111111111111111110, bArr1111111111111111111111111116);
                                t23.a(s13Var1111111111111111111111111116, dy2Var, entry.getKey(), entry.getValue());
                                s13Var1111111111111111111111111116.d();
                                l13 l13Var11111111111111111111111111111111111111111111111111111112 = new l13(bArr1111111111111111111111111116);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var11111111111111111111111111111111111111111111111111111112);
                                it.remove();
                                break;
                            case 6:
                                ((Integer) value).getClass();
                                iB2 = 4;
                                int i11111111111111111111111111111 = iB2 + iA2 + i2;
                                l13 l13Var11111111111111111111111111111111111111111111111111111113 = n13.g;
                                byte[] bArr1111111111111111111111111117 = new byte[i11111111111111111111111111111];
                                s13 s13Var1111111111111111111111111117 = new s13(i11111111111111111111111111111, bArr1111111111111111111111111117);
                                t23.a(s13Var1111111111111111111111111117, dy2Var, entry.getKey(), entry.getValue());
                                s13Var1111111111111111111111111117.d();
                                l13 l13Var11111111111111111111111111111111111111111111111111111114 = new l13(bArr1111111111111111111111111117);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var11111111111111111111111111111111111111111111111111111114);
                                it.remove();
                                break;
                            case 7:
                                ((Boolean) value).getClass();
                                iB2 = 1;
                                int i11111111111111111111111111112 = iB2 + iA2 + i2;
                                l13 l13Var11111111111111111111111111111111111111111111111111111115 = n13.g;
                                byte[] bArr1111111111111111111111111118 = new byte[i11111111111111111111111111112];
                                s13 s13Var1111111111111111111111111118 = new s13(i11111111111111111111111111112, bArr1111111111111111111111111118);
                                t23.a(s13Var1111111111111111111111111118, dy2Var, entry.getKey(), entry.getValue());
                                s13Var1111111111111111111111111118.d();
                                l13 l13Var11111111111111111111111111111111111111111111111111111116 = new l13(bArr1111111111111111111111111118);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var11111111111111111111111111111111111111111111111111111116);
                                it.remove();
                                break;
                            case 8:
                                if (value instanceof n13) {
                                    iD2 = ((n13) value).d();
                                    iA3 = u13.a(iD2);
                                    iB2 = iA3 + iD2;
                                } else {
                                    iB2 = u13.c((String) value);
                                }
                                int i11111111111111111111111111113 = iB2 + iA2 + i2;
                                l13 l13Var11111111111111111111111111111111111111111111111111111117 = n13.g;
                                byte[] bArr1111111111111111111111111119 = new byte[i11111111111111111111111111113];
                                s13 s13Var1111111111111111111111111119 = new s13(i11111111111111111111111111113, bArr1111111111111111111111111119);
                                t23.a(s13Var1111111111111111111111111119, dy2Var, entry.getKey(), entry.getValue());
                                s13Var1111111111111111111111111119.d();
                                l13 l13Var11111111111111111111111111111111111111111111111111111118 = new l13(bArr1111111111111111111111111119);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var11111111111111111111111111111111111111111111111111111118);
                                it.remove();
                                break;
                            case 9:
                                iB2 = ((d23) ((f13) value)).d(null);
                                int i11111111111111111111111111114 = iB2 + iA2 + i2;
                                l13 l13Var11111111111111111111111111111111111111111111111111111119 = n13.g;
                                byte[] bArr11111111111111111111111111110 = new byte[i11111111111111111111111111114];
                                s13 s13Var11111111111111111111111111110 = new s13(i11111111111111111111111111114, bArr11111111111111111111111111110);
                                t23.a(s13Var11111111111111111111111111110, dy2Var, entry.getKey(), entry.getValue());
                                s13Var11111111111111111111111111110.d();
                                l13 l13Var111111111111111111111111111111111111111111111111111111110 = new l13(bArr11111111111111111111111111110);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var111111111111111111111111111111111111111111111111111111110);
                                it.remove();
                                break;
                            case 10:
                                iD2 = ((d23) ((f13) value)).d(null);
                                iA3 = u13.a(iD2);
                                iB2 = iA3 + iD2;
                                int i11111111111111111111111111115 = iB2 + iA2 + i2;
                                l13 l13Var111111111111111111111111111111111111111111111111111111111 = n13.g;
                                byte[] bArr11111111111111111111111111111 = new byte[i11111111111111111111111111115];
                                s13 s13Var11111111111111111111111111111 = new s13(i11111111111111111111111111115, bArr11111111111111111111111111111);
                                t23.a(s13Var11111111111111111111111111111, dy2Var, entry.getKey(), entry.getValue());
                                s13Var11111111111111111111111111111.d();
                                l13 l13Var111111111111111111111111111111111111111111111111111111112 = new l13(bArr11111111111111111111111111111);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var111111111111111111111111111111111111111111111111111111112);
                                it.remove();
                                break;
                            case 11:
                                if (value instanceof n13) {
                                    iD2 = ((n13) value).d();
                                    iA3 = u13.a(iD2);
                                } else {
                                    iD2 = ((byte[]) value).length;
                                    iA3 = u13.a(iD2);
                                }
                                iB2 = iA3 + iD2;
                                int i11111111111111111111111111116 = iB2 + iA2 + i2;
                                l13 l13Var111111111111111111111111111111111111111111111111111111113 = n13.g;
                                byte[] bArr11111111111111111111111111112 = new byte[i11111111111111111111111111116];
                                s13 s13Var11111111111111111111111111112 = new s13(i11111111111111111111111111116, bArr11111111111111111111111111112);
                                t23.a(s13Var11111111111111111111111111112, dy2Var, entry.getKey(), entry.getValue());
                                s13Var11111111111111111111111111112.d();
                                l13 l13Var111111111111111111111111111111111111111111111111111111114 = new l13(bArr11111111111111111111111111112);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var111111111111111111111111111111111111111111111111111111114);
                                it.remove();
                                break;
                            case 12:
                                iB2 = u13.a(((Integer) value).intValue());
                                int i11111111111111111111111111117 = iB2 + iA2 + i2;
                                l13 l13Var111111111111111111111111111111111111111111111111111111115 = n13.g;
                                byte[] bArr11111111111111111111111111113 = new byte[i11111111111111111111111111117];
                                s13 s13Var11111111111111111111111111113 = new s13(i11111111111111111111111111117, bArr11111111111111111111111111113);
                                t23.a(s13Var11111111111111111111111111113, dy2Var, entry.getKey(), entry.getValue());
                                s13Var11111111111111111111111111113.d();
                                l13 l13Var111111111111111111111111111111111111111111111111111111116 = new l13(bArr11111111111111111111111111113);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var111111111111111111111111111111111111111111111111111111116);
                                it.remove();
                                break;
                            case 13:
                                if (value instanceof f23) {
                                    iB2 = u13.b(((f23) value).a());
                                } else {
                                    iB2 = u13.b(((Integer) value).intValue());
                                }
                                int i11111111111111111111111111118 = iB2 + iA2 + i2;
                                l13 l13Var111111111111111111111111111111111111111111111111111111117 = n13.g;
                                byte[] bArr11111111111111111111111111114 = new byte[i11111111111111111111111111118];
                                s13 s13Var11111111111111111111111111114 = new s13(i11111111111111111111111111118, bArr11111111111111111111111111114);
                                t23.a(s13Var11111111111111111111111111114, dy2Var, entry.getKey(), entry.getValue());
                                s13Var11111111111111111111111111114.d();
                                l13 l13Var111111111111111111111111111111111111111111111111111111118 = new l13(bArr11111111111111111111111111114);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var111111111111111111111111111111111111111111111111111111118);
                                it.remove();
                                break;
                            case 14:
                                ((Integer) value).getClass();
                                iB2 = 4;
                                int i11111111111111111111111111119 = iB2 + iA2 + i2;
                                l13 l13Var111111111111111111111111111111111111111111111111111111119 = n13.g;
                                byte[] bArr11111111111111111111111111115 = new byte[i11111111111111111111111111119];
                                s13 s13Var11111111111111111111111111115 = new s13(i11111111111111111111111111119, bArr11111111111111111111111111115);
                                t23.a(s13Var11111111111111111111111111115, dy2Var, entry.getKey(), entry.getValue());
                                s13Var11111111111111111111111111115.d();
                                l13 l13Var1111111111111111111111111111111111111111111111111111111110 = new l13(bArr11111111111111111111111111115);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var1111111111111111111111111111111111111111111111111111111110);
                                it.remove();
                                break;
                            case 15:
                                ((Long) value).getClass();
                                iB2 = 8;
                                int i111111111111111111111111111110 = iB2 + iA2 + i2;
                                l13 l13Var1111111111111111111111111111111111111111111111111111111111 = n13.g;
                                byte[] bArr11111111111111111111111111116 = new byte[i111111111111111111111111111110];
                                s13 s13Var11111111111111111111111111116 = new s13(i111111111111111111111111111110, bArr11111111111111111111111111116);
                                t23.a(s13Var11111111111111111111111111116, dy2Var, entry.getKey(), entry.getValue());
                                s13Var11111111111111111111111111116.d();
                                l13 l13Var1111111111111111111111111111111111111111111111111111111112 = new l13(bArr11111111111111111111111111116);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var1111111111111111111111111111111111111111111111111111111112);
                                it.remove();
                                break;
                            case 16:
                                int iIntValue16 = ((Integer) value).intValue();
                                iB2 = u13.a((iIntValue16 >> 31) ^ (iIntValue16 + iIntValue16));
                                int i111111111111111111111111111111 = iB2 + iA2 + i2;
                                l13 l13Var1111111111111111111111111111111111111111111111111111111113 = n13.g;
                                byte[] bArr11111111111111111111111111117 = new byte[i111111111111111111111111111111];
                                s13 s13Var11111111111111111111111111117 = new s13(i111111111111111111111111111111, bArr11111111111111111111111111117);
                                t23.a(s13Var11111111111111111111111111117, dy2Var, entry.getKey(), entry.getValue());
                                s13Var11111111111111111111111111117.d();
                                l13 l13Var1111111111111111111111111111111111111111111111111111111114 = new l13(bArr11111111111111111111111111117);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var1111111111111111111111111111111111111111111111111111111114);
                                it.remove();
                                break;
                            case 17:
                                long jLongValue16 = ((Long) value).longValue();
                                iB2 = u13.b((jLongValue16 >> c) ^ (jLongValue16 + jLongValue16));
                                int i111111111111111111111111111112 = iB2 + iA2 + i2;
                                l13 l13Var1111111111111111111111111111111111111111111111111111111115 = n13.g;
                                byte[] bArr11111111111111111111111111118 = new byte[i111111111111111111111111111112];
                                s13 s13Var11111111111111111111111111118 = new s13(i111111111111111111111111111112, bArr11111111111111111111111111118);
                                t23.a(s13Var11111111111111111111111111118, dy2Var, entry.getKey(), entry.getValue());
                                s13Var11111111111111111111111111118.d();
                                l13 l13Var1111111111111111111111111111111111111111111111111111111116 = new l13(bArr11111111111111111111111111118);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var1111111111111111111111111111111111111111111111111111111116);
                                it.remove();
                                break;
                            default:
                                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                        }
                        break;
                    case 16:
                        int iIntValue17 = ((Integer) key).intValue();
                        iB = u13.a((iIntValue17 >> 31) ^ (iIntValue17 + iIntValue17));
                        c = '?';
                        i2 = iB + iA4;
                        iA2 = u13.a(16);
                        if (y33Var2 == y33Var3) {
                            iA2 += iA2;
                        }
                        switch (y33Var2.ordinal()) {
                            case 0:
                                ((Double) value).getClass();
                                iB2 = 8;
                                int i111111111111111111111111111113 = iB2 + iA2 + i2;
                                l13 l13Var1111111111111111111111111111111111111111111111111111111117 = n13.g;
                                byte[] bArr11111111111111111111111111119 = new byte[i111111111111111111111111111113];
                                s13 s13Var11111111111111111111111111119 = new s13(i111111111111111111111111111113, bArr11111111111111111111111111119);
                                t23.a(s13Var11111111111111111111111111119, dy2Var, entry.getKey(), entry.getValue());
                                s13Var11111111111111111111111111119.d();
                                l13 l13Var1111111111111111111111111111111111111111111111111111111118 = new l13(bArr11111111111111111111111111119);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var1111111111111111111111111111111111111111111111111111111118);
                                it.remove();
                                break;
                            case 1:
                                ((Float) value).getClass();
                                iB2 = 4;
                                int i111111111111111111111111111114 = iB2 + iA2 + i2;
                                l13 l13Var1111111111111111111111111111111111111111111111111111111119 = n13.g;
                                byte[] bArr111111111111111111111111111110 = new byte[i111111111111111111111111111114];
                                s13 s13Var111111111111111111111111111110 = new s13(i111111111111111111111111111114, bArr111111111111111111111111111110);
                                t23.a(s13Var111111111111111111111111111110, dy2Var, entry.getKey(), entry.getValue());
                                s13Var111111111111111111111111111110.d();
                                l13 l13Var11111111111111111111111111111111111111111111111111111111110 = new l13(bArr111111111111111111111111111110);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var11111111111111111111111111111111111111111111111111111111110);
                                it.remove();
                                break;
                            case 2:
                                iB2 = u13.b(((Long) value).longValue());
                                int i111111111111111111111111111115 = iB2 + iA2 + i2;
                                l13 l13Var11111111111111111111111111111111111111111111111111111111111 = n13.g;
                                byte[] bArr111111111111111111111111111111 = new byte[i111111111111111111111111111115];
                                s13 s13Var111111111111111111111111111111 = new s13(i111111111111111111111111111115, bArr111111111111111111111111111111);
                                t23.a(s13Var111111111111111111111111111111, dy2Var, entry.getKey(), entry.getValue());
                                s13Var111111111111111111111111111111.d();
                                l13 l13Var11111111111111111111111111111111111111111111111111111111112 = new l13(bArr111111111111111111111111111111);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var11111111111111111111111111111111111111111111111111111111112);
                                it.remove();
                                break;
                            case 3:
                                iB2 = u13.b(((Long) value).longValue());
                                int i111111111111111111111111111116 = iB2 + iA2 + i2;
                                l13 l13Var11111111111111111111111111111111111111111111111111111111113 = n13.g;
                                byte[] bArr111111111111111111111111111112 = new byte[i111111111111111111111111111116];
                                s13 s13Var111111111111111111111111111112 = new s13(i111111111111111111111111111116, bArr111111111111111111111111111112);
                                t23.a(s13Var111111111111111111111111111112, dy2Var, entry.getKey(), entry.getValue());
                                s13Var111111111111111111111111111112.d();
                                l13 l13Var11111111111111111111111111111111111111111111111111111111114 = new l13(bArr111111111111111111111111111112);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var11111111111111111111111111111111111111111111111111111111114);
                                it.remove();
                                break;
                            case 4:
                                iB2 = u13.b(((Integer) value).intValue());
                                int i111111111111111111111111111117 = iB2 + iA2 + i2;
                                l13 l13Var11111111111111111111111111111111111111111111111111111111115 = n13.g;
                                byte[] bArr111111111111111111111111111113 = new byte[i111111111111111111111111111117];
                                s13 s13Var111111111111111111111111111113 = new s13(i111111111111111111111111111117, bArr111111111111111111111111111113);
                                t23.a(s13Var111111111111111111111111111113, dy2Var, entry.getKey(), entry.getValue());
                                s13Var111111111111111111111111111113.d();
                                l13 l13Var11111111111111111111111111111111111111111111111111111111116 = new l13(bArr111111111111111111111111111113);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var11111111111111111111111111111111111111111111111111111111116);
                                it.remove();
                                break;
                            case 5:
                                ((Long) value).getClass();
                                iB2 = 8;
                                int i111111111111111111111111111118 = iB2 + iA2 + i2;
                                l13 l13Var11111111111111111111111111111111111111111111111111111111117 = n13.g;
                                byte[] bArr111111111111111111111111111114 = new byte[i111111111111111111111111111118];
                                s13 s13Var111111111111111111111111111114 = new s13(i111111111111111111111111111118, bArr111111111111111111111111111114);
                                t23.a(s13Var111111111111111111111111111114, dy2Var, entry.getKey(), entry.getValue());
                                s13Var111111111111111111111111111114.d();
                                l13 l13Var11111111111111111111111111111111111111111111111111111111118 = new l13(bArr111111111111111111111111111114);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var11111111111111111111111111111111111111111111111111111111118);
                                it.remove();
                                break;
                            case 6:
                                ((Integer) value).getClass();
                                iB2 = 4;
                                int i111111111111111111111111111119 = iB2 + iA2 + i2;
                                l13 l13Var11111111111111111111111111111111111111111111111111111111119 = n13.g;
                                byte[] bArr111111111111111111111111111115 = new byte[i111111111111111111111111111119];
                                s13 s13Var111111111111111111111111111115 = new s13(i111111111111111111111111111119, bArr111111111111111111111111111115);
                                t23.a(s13Var111111111111111111111111111115, dy2Var, entry.getKey(), entry.getValue());
                                s13Var111111111111111111111111111115.d();
                                l13 l13Var111111111111111111111111111111111111111111111111111111111110 = new l13(bArr111111111111111111111111111115);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var111111111111111111111111111111111111111111111111111111111110);
                                it.remove();
                                break;
                            case 7:
                                ((Boolean) value).getClass();
                                iB2 = 1;
                                int i1111111111111111111111111111110 = iB2 + iA2 + i2;
                                l13 l13Var111111111111111111111111111111111111111111111111111111111111 = n13.g;
                                byte[] bArr111111111111111111111111111116 = new byte[i1111111111111111111111111111110];
                                s13 s13Var111111111111111111111111111116 = new s13(i1111111111111111111111111111110, bArr111111111111111111111111111116);
                                t23.a(s13Var111111111111111111111111111116, dy2Var, entry.getKey(), entry.getValue());
                                s13Var111111111111111111111111111116.d();
                                l13 l13Var111111111111111111111111111111111111111111111111111111111112 = new l13(bArr111111111111111111111111111116);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var111111111111111111111111111111111111111111111111111111111112);
                                it.remove();
                                break;
                            case 8:
                                if (value instanceof n13) {
                                    iD2 = ((n13) value).d();
                                    iA3 = u13.a(iD2);
                                    iB2 = iA3 + iD2;
                                } else {
                                    iB2 = u13.c((String) value);
                                }
                                int i1111111111111111111111111111111 = iB2 + iA2 + i2;
                                l13 l13Var111111111111111111111111111111111111111111111111111111111113 = n13.g;
                                byte[] bArr111111111111111111111111111117 = new byte[i1111111111111111111111111111111];
                                s13 s13Var111111111111111111111111111117 = new s13(i1111111111111111111111111111111, bArr111111111111111111111111111117);
                                t23.a(s13Var111111111111111111111111111117, dy2Var, entry.getKey(), entry.getValue());
                                s13Var111111111111111111111111111117.d();
                                l13 l13Var111111111111111111111111111111111111111111111111111111111114 = new l13(bArr111111111111111111111111111117);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var111111111111111111111111111111111111111111111111111111111114);
                                it.remove();
                                break;
                            case 9:
                                iB2 = ((d23) ((f13) value)).d(null);
                                int i1111111111111111111111111111112 = iB2 + iA2 + i2;
                                l13 l13Var111111111111111111111111111111111111111111111111111111111115 = n13.g;
                                byte[] bArr111111111111111111111111111118 = new byte[i1111111111111111111111111111112];
                                s13 s13Var111111111111111111111111111118 = new s13(i1111111111111111111111111111112, bArr111111111111111111111111111118);
                                t23.a(s13Var111111111111111111111111111118, dy2Var, entry.getKey(), entry.getValue());
                                s13Var111111111111111111111111111118.d();
                                l13 l13Var111111111111111111111111111111111111111111111111111111111116 = new l13(bArr111111111111111111111111111118);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var111111111111111111111111111111111111111111111111111111111116);
                                it.remove();
                                break;
                            case 10:
                                iD2 = ((d23) ((f13) value)).d(null);
                                iA3 = u13.a(iD2);
                                iB2 = iA3 + iD2;
                                int i1111111111111111111111111111113 = iB2 + iA2 + i2;
                                l13 l13Var111111111111111111111111111111111111111111111111111111111117 = n13.g;
                                byte[] bArr111111111111111111111111111119 = new byte[i1111111111111111111111111111113];
                                s13 s13Var111111111111111111111111111119 = new s13(i1111111111111111111111111111113, bArr111111111111111111111111111119);
                                t23.a(s13Var111111111111111111111111111119, dy2Var, entry.getKey(), entry.getValue());
                                s13Var111111111111111111111111111119.d();
                                l13 l13Var111111111111111111111111111111111111111111111111111111111118 = new l13(bArr111111111111111111111111111119);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var111111111111111111111111111111111111111111111111111111111118);
                                it.remove();
                                break;
                            case 11:
                                if (value instanceof n13) {
                                    iD2 = ((n13) value).d();
                                    iA3 = u13.a(iD2);
                                } else {
                                    iD2 = ((byte[]) value).length;
                                    iA3 = u13.a(iD2);
                                }
                                iB2 = iA3 + iD2;
                                int i1111111111111111111111111111114 = iB2 + iA2 + i2;
                                l13 l13Var111111111111111111111111111111111111111111111111111111111119 = n13.g;
                                byte[] bArr1111111111111111111111111111110 = new byte[i1111111111111111111111111111114];
                                s13 s13Var1111111111111111111111111111110 = new s13(i1111111111111111111111111111114, bArr1111111111111111111111111111110);
                                t23.a(s13Var1111111111111111111111111111110, dy2Var, entry.getKey(), entry.getValue());
                                s13Var1111111111111111111111111111110.d();
                                l13 l13Var1111111111111111111111111111111111111111111111111111111111110 = new l13(bArr1111111111111111111111111111110);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var1111111111111111111111111111111111111111111111111111111111110);
                                it.remove();
                                break;
                            case 12:
                                iB2 = u13.a(((Integer) value).intValue());
                                int i1111111111111111111111111111115 = iB2 + iA2 + i2;
                                l13 l13Var1111111111111111111111111111111111111111111111111111111111111 = n13.g;
                                byte[] bArr1111111111111111111111111111111 = new byte[i1111111111111111111111111111115];
                                s13 s13Var1111111111111111111111111111111 = new s13(i1111111111111111111111111111115, bArr1111111111111111111111111111111);
                                t23.a(s13Var1111111111111111111111111111111, dy2Var, entry.getKey(), entry.getValue());
                                s13Var1111111111111111111111111111111.d();
                                l13 l13Var1111111111111111111111111111111111111111111111111111111111112 = new l13(bArr1111111111111111111111111111111);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var1111111111111111111111111111111111111111111111111111111111112);
                                it.remove();
                                break;
                            case 13:
                                if (value instanceof f23) {
                                    iB2 = u13.b(((f23) value).a());
                                } else {
                                    iB2 = u13.b(((Integer) value).intValue());
                                }
                                int i1111111111111111111111111111116 = iB2 + iA2 + i2;
                                l13 l13Var1111111111111111111111111111111111111111111111111111111111113 = n13.g;
                                byte[] bArr1111111111111111111111111111112 = new byte[i1111111111111111111111111111116];
                                s13 s13Var1111111111111111111111111111112 = new s13(i1111111111111111111111111111116, bArr1111111111111111111111111111112);
                                t23.a(s13Var1111111111111111111111111111112, dy2Var, entry.getKey(), entry.getValue());
                                s13Var1111111111111111111111111111112.d();
                                l13 l13Var1111111111111111111111111111111111111111111111111111111111114 = new l13(bArr1111111111111111111111111111112);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var1111111111111111111111111111111111111111111111111111111111114);
                                it.remove();
                                break;
                            case 14:
                                ((Integer) value).getClass();
                                iB2 = 4;
                                int i1111111111111111111111111111117 = iB2 + iA2 + i2;
                                l13 l13Var1111111111111111111111111111111111111111111111111111111111115 = n13.g;
                                byte[] bArr1111111111111111111111111111113 = new byte[i1111111111111111111111111111117];
                                s13 s13Var1111111111111111111111111111113 = new s13(i1111111111111111111111111111117, bArr1111111111111111111111111111113);
                                t23.a(s13Var1111111111111111111111111111113, dy2Var, entry.getKey(), entry.getValue());
                                s13Var1111111111111111111111111111113.d();
                                l13 l13Var1111111111111111111111111111111111111111111111111111111111116 = new l13(bArr1111111111111111111111111111113);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var1111111111111111111111111111111111111111111111111111111111116);
                                it.remove();
                                break;
                            case 15:
                                ((Long) value).getClass();
                                iB2 = 8;
                                int i1111111111111111111111111111118 = iB2 + iA2 + i2;
                                l13 l13Var1111111111111111111111111111111111111111111111111111111111117 = n13.g;
                                byte[] bArr1111111111111111111111111111114 = new byte[i1111111111111111111111111111118];
                                s13 s13Var1111111111111111111111111111114 = new s13(i1111111111111111111111111111118, bArr1111111111111111111111111111114);
                                t23.a(s13Var1111111111111111111111111111114, dy2Var, entry.getKey(), entry.getValue());
                                s13Var1111111111111111111111111111114.d();
                                l13 l13Var1111111111111111111111111111111111111111111111111111111111118 = new l13(bArr1111111111111111111111111111114);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var1111111111111111111111111111111111111111111111111111111111118);
                                it.remove();
                                break;
                            case 16:
                                int iIntValue18 = ((Integer) value).intValue();
                                iB2 = u13.a((iIntValue18 >> 31) ^ (iIntValue18 + iIntValue18));
                                int i1111111111111111111111111111119 = iB2 + iA2 + i2;
                                l13 l13Var1111111111111111111111111111111111111111111111111111111111119 = n13.g;
                                byte[] bArr1111111111111111111111111111115 = new byte[i1111111111111111111111111111119];
                                s13 s13Var1111111111111111111111111111115 = new s13(i1111111111111111111111111111119, bArr1111111111111111111111111111115);
                                t23.a(s13Var1111111111111111111111111111115, dy2Var, entry.getKey(), entry.getValue());
                                s13Var1111111111111111111111111111115.d();
                                l13 l13Var11111111111111111111111111111111111111111111111111111111111110 = new l13(bArr1111111111111111111111111111115);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var11111111111111111111111111111111111111111111111111111111111110);
                                it.remove();
                                break;
                            case 17:
                                long jLongValue17 = ((Long) value).longValue();
                                iB2 = u13.b((jLongValue17 >> c) ^ (jLongValue17 + jLongValue17));
                                int i11111111111111111111111111111110 = iB2 + iA2 + i2;
                                l13 l13Var11111111111111111111111111111111111111111111111111111111111111 = n13.g;
                                byte[] bArr1111111111111111111111111111116 = new byte[i11111111111111111111111111111110];
                                s13 s13Var1111111111111111111111111111116 = new s13(i11111111111111111111111111111110, bArr1111111111111111111111111111116);
                                t23.a(s13Var1111111111111111111111111111116, dy2Var, entry.getKey(), entry.getValue());
                                s13Var1111111111111111111111111111116.d();
                                l13 l13Var11111111111111111111111111111111111111111111111111111111111112 = new l13(bArr1111111111111111111111111111116);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var11111111111111111111111111111111111111111111111111111111111112);
                                it.remove();
                                break;
                            default:
                                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                        }
                        break;
                    case 17:
                        long jLongValue18 = ((Long) key).longValue();
                        iB = u13.b((jLongValue18 + jLongValue18) ^ (jLongValue18 >> 63));
                        c = '?';
                        i2 = iB + iA4;
                        iA2 = u13.a(16);
                        if (y33Var2 == y33Var3) {
                            iA2 += iA2;
                        }
                        switch (y33Var2.ordinal()) {
                            case 0:
                                ((Double) value).getClass();
                                iB2 = 8;
                                int i11111111111111111111111111111111 = iB2 + iA2 + i2;
                                l13 l13Var11111111111111111111111111111111111111111111111111111111111113 = n13.g;
                                byte[] bArr1111111111111111111111111111117 = new byte[i11111111111111111111111111111111];
                                s13 s13Var1111111111111111111111111111117 = new s13(i11111111111111111111111111111111, bArr1111111111111111111111111111117);
                                t23.a(s13Var1111111111111111111111111111117, dy2Var, entry.getKey(), entry.getValue());
                                s13Var1111111111111111111111111111117.d();
                                l13 l13Var11111111111111111111111111111111111111111111111111111111111114 = new l13(bArr1111111111111111111111111111117);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var11111111111111111111111111111111111111111111111111111111111114);
                                it.remove();
                                break;
                            case 1:
                                ((Float) value).getClass();
                                iB2 = 4;
                                int i11111111111111111111111111111112 = iB2 + iA2 + i2;
                                l13 l13Var11111111111111111111111111111111111111111111111111111111111115 = n13.g;
                                byte[] bArr1111111111111111111111111111118 = new byte[i11111111111111111111111111111112];
                                s13 s13Var1111111111111111111111111111118 = new s13(i11111111111111111111111111111112, bArr1111111111111111111111111111118);
                                t23.a(s13Var1111111111111111111111111111118, dy2Var, entry.getKey(), entry.getValue());
                                s13Var1111111111111111111111111111118.d();
                                l13 l13Var11111111111111111111111111111111111111111111111111111111111116 = new l13(bArr1111111111111111111111111111118);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var11111111111111111111111111111111111111111111111111111111111116);
                                it.remove();
                                break;
                            case 2:
                                iB2 = u13.b(((Long) value).longValue());
                                int i11111111111111111111111111111113 = iB2 + iA2 + i2;
                                l13 l13Var11111111111111111111111111111111111111111111111111111111111117 = n13.g;
                                byte[] bArr1111111111111111111111111111119 = new byte[i11111111111111111111111111111113];
                                s13 s13Var1111111111111111111111111111119 = new s13(i11111111111111111111111111111113, bArr1111111111111111111111111111119);
                                t23.a(s13Var1111111111111111111111111111119, dy2Var, entry.getKey(), entry.getValue());
                                s13Var1111111111111111111111111111119.d();
                                l13 l13Var11111111111111111111111111111111111111111111111111111111111118 = new l13(bArr1111111111111111111111111111119);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var11111111111111111111111111111111111111111111111111111111111118);
                                it.remove();
                                break;
                            case 3:
                                iB2 = u13.b(((Long) value).longValue());
                                int i11111111111111111111111111111114 = iB2 + iA2 + i2;
                                l13 l13Var11111111111111111111111111111111111111111111111111111111111119 = n13.g;
                                byte[] bArr11111111111111111111111111111110 = new byte[i11111111111111111111111111111114];
                                s13 s13Var11111111111111111111111111111110 = new s13(i11111111111111111111111111111114, bArr11111111111111111111111111111110);
                                t23.a(s13Var11111111111111111111111111111110, dy2Var, entry.getKey(), entry.getValue());
                                s13Var11111111111111111111111111111110.d();
                                l13 l13Var111111111111111111111111111111111111111111111111111111111111110 = new l13(bArr11111111111111111111111111111110);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var111111111111111111111111111111111111111111111111111111111111110);
                                it.remove();
                                break;
                            case 4:
                                iB2 = u13.b(((Integer) value).intValue());
                                int i11111111111111111111111111111115 = iB2 + iA2 + i2;
                                l13 l13Var111111111111111111111111111111111111111111111111111111111111111 = n13.g;
                                byte[] bArr11111111111111111111111111111111 = new byte[i11111111111111111111111111111115];
                                s13 s13Var11111111111111111111111111111111 = new s13(i11111111111111111111111111111115, bArr11111111111111111111111111111111);
                                t23.a(s13Var11111111111111111111111111111111, dy2Var, entry.getKey(), entry.getValue());
                                s13Var11111111111111111111111111111111.d();
                                l13 l13Var111111111111111111111111111111111111111111111111111111111111112 = new l13(bArr11111111111111111111111111111111);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var111111111111111111111111111111111111111111111111111111111111112);
                                it.remove();
                                break;
                            case 5:
                                ((Long) value).getClass();
                                iB2 = 8;
                                int i11111111111111111111111111111116 = iB2 + iA2 + i2;
                                l13 l13Var111111111111111111111111111111111111111111111111111111111111113 = n13.g;
                                byte[] bArr11111111111111111111111111111112 = new byte[i11111111111111111111111111111116];
                                s13 s13Var11111111111111111111111111111112 = new s13(i11111111111111111111111111111116, bArr11111111111111111111111111111112);
                                t23.a(s13Var11111111111111111111111111111112, dy2Var, entry.getKey(), entry.getValue());
                                s13Var11111111111111111111111111111112.d();
                                l13 l13Var111111111111111111111111111111111111111111111111111111111111114 = new l13(bArr11111111111111111111111111111112);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var111111111111111111111111111111111111111111111111111111111111114);
                                it.remove();
                                break;
                            case 6:
                                ((Integer) value).getClass();
                                iB2 = 4;
                                int i11111111111111111111111111111117 = iB2 + iA2 + i2;
                                l13 l13Var111111111111111111111111111111111111111111111111111111111111115 = n13.g;
                                byte[] bArr11111111111111111111111111111113 = new byte[i11111111111111111111111111111117];
                                s13 s13Var11111111111111111111111111111113 = new s13(i11111111111111111111111111111117, bArr11111111111111111111111111111113);
                                t23.a(s13Var11111111111111111111111111111113, dy2Var, entry.getKey(), entry.getValue());
                                s13Var11111111111111111111111111111113.d();
                                l13 l13Var111111111111111111111111111111111111111111111111111111111111116 = new l13(bArr11111111111111111111111111111113);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var111111111111111111111111111111111111111111111111111111111111116);
                                it.remove();
                                break;
                            case 7:
                                ((Boolean) value).getClass();
                                iB2 = 1;
                                int i11111111111111111111111111111118 = iB2 + iA2 + i2;
                                l13 l13Var111111111111111111111111111111111111111111111111111111111111117 = n13.g;
                                byte[] bArr11111111111111111111111111111114 = new byte[i11111111111111111111111111111118];
                                s13 s13Var11111111111111111111111111111114 = new s13(i11111111111111111111111111111118, bArr11111111111111111111111111111114);
                                t23.a(s13Var11111111111111111111111111111114, dy2Var, entry.getKey(), entry.getValue());
                                s13Var11111111111111111111111111111114.d();
                                l13 l13Var111111111111111111111111111111111111111111111111111111111111118 = new l13(bArr11111111111111111111111111111114);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var111111111111111111111111111111111111111111111111111111111111118);
                                it.remove();
                                break;
                            case 8:
                                if (value instanceof n13) {
                                    iD2 = ((n13) value).d();
                                    iA3 = u13.a(iD2);
                                    iB2 = iA3 + iD2;
                                } else {
                                    iB2 = u13.c((String) value);
                                }
                                int i11111111111111111111111111111119 = iB2 + iA2 + i2;
                                l13 l13Var111111111111111111111111111111111111111111111111111111111111119 = n13.g;
                                byte[] bArr11111111111111111111111111111115 = new byte[i11111111111111111111111111111119];
                                s13 s13Var11111111111111111111111111111115 = new s13(i11111111111111111111111111111119, bArr11111111111111111111111111111115);
                                t23.a(s13Var11111111111111111111111111111115, dy2Var, entry.getKey(), entry.getValue());
                                s13Var11111111111111111111111111111115.d();
                                l13 l13Var1111111111111111111111111111111111111111111111111111111111111110 = new l13(bArr11111111111111111111111111111115);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var1111111111111111111111111111111111111111111111111111111111111110);
                                it.remove();
                                break;
                            case 9:
                                iB2 = ((d23) ((f13) value)).d(null);
                                int i111111111111111111111111111111110 = iB2 + iA2 + i2;
                                l13 l13Var1111111111111111111111111111111111111111111111111111111111111111 = n13.g;
                                byte[] bArr11111111111111111111111111111116 = new byte[i111111111111111111111111111111110];
                                s13 s13Var11111111111111111111111111111116 = new s13(i111111111111111111111111111111110, bArr11111111111111111111111111111116);
                                t23.a(s13Var11111111111111111111111111111116, dy2Var, entry.getKey(), entry.getValue());
                                s13Var11111111111111111111111111111116.d();
                                l13 l13Var1111111111111111111111111111111111111111111111111111111111111112 = new l13(bArr11111111111111111111111111111116);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var1111111111111111111111111111111111111111111111111111111111111112);
                                it.remove();
                                break;
                            case 10:
                                iD2 = ((d23) ((f13) value)).d(null);
                                iA3 = u13.a(iD2);
                                iB2 = iA3 + iD2;
                                int i111111111111111111111111111111111 = iB2 + iA2 + i2;
                                l13 l13Var1111111111111111111111111111111111111111111111111111111111111113 = n13.g;
                                byte[] bArr11111111111111111111111111111117 = new byte[i111111111111111111111111111111111];
                                s13 s13Var11111111111111111111111111111117 = new s13(i111111111111111111111111111111111, bArr11111111111111111111111111111117);
                                t23.a(s13Var11111111111111111111111111111117, dy2Var, entry.getKey(), entry.getValue());
                                s13Var11111111111111111111111111111117.d();
                                l13 l13Var1111111111111111111111111111111111111111111111111111111111111114 = new l13(bArr11111111111111111111111111111117);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var1111111111111111111111111111111111111111111111111111111111111114);
                                it.remove();
                                break;
                            case 11:
                                if (value instanceof n13) {
                                    iD2 = ((n13) value).d();
                                    iA3 = u13.a(iD2);
                                } else {
                                    iD2 = ((byte[]) value).length;
                                    iA3 = u13.a(iD2);
                                }
                                iB2 = iA3 + iD2;
                                int i111111111111111111111111111111112 = iB2 + iA2 + i2;
                                l13 l13Var1111111111111111111111111111111111111111111111111111111111111115 = n13.g;
                                byte[] bArr11111111111111111111111111111118 = new byte[i111111111111111111111111111111112];
                                s13 s13Var11111111111111111111111111111118 = new s13(i111111111111111111111111111111112, bArr11111111111111111111111111111118);
                                t23.a(s13Var11111111111111111111111111111118, dy2Var, entry.getKey(), entry.getValue());
                                s13Var11111111111111111111111111111118.d();
                                l13 l13Var1111111111111111111111111111111111111111111111111111111111111116 = new l13(bArr11111111111111111111111111111118);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var1111111111111111111111111111111111111111111111111111111111111116);
                                it.remove();
                                break;
                            case 12:
                                iB2 = u13.a(((Integer) value).intValue());
                                int i111111111111111111111111111111113 = iB2 + iA2 + i2;
                                l13 l13Var1111111111111111111111111111111111111111111111111111111111111117 = n13.g;
                                byte[] bArr11111111111111111111111111111119 = new byte[i111111111111111111111111111111113];
                                s13 s13Var11111111111111111111111111111119 = new s13(i111111111111111111111111111111113, bArr11111111111111111111111111111119);
                                t23.a(s13Var11111111111111111111111111111119, dy2Var, entry.getKey(), entry.getValue());
                                s13Var11111111111111111111111111111119.d();
                                l13 l13Var1111111111111111111111111111111111111111111111111111111111111118 = new l13(bArr11111111111111111111111111111119);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var1111111111111111111111111111111111111111111111111111111111111118);
                                it.remove();
                                break;
                            case 13:
                                if (value instanceof f23) {
                                    iB2 = u13.b(((f23) value).a());
                                } else {
                                    iB2 = u13.b(((Integer) value).intValue());
                                }
                                int i111111111111111111111111111111114 = iB2 + iA2 + i2;
                                l13 l13Var1111111111111111111111111111111111111111111111111111111111111119 = n13.g;
                                byte[] bArr111111111111111111111111111111110 = new byte[i111111111111111111111111111111114];
                                s13 s13Var111111111111111111111111111111110 = new s13(i111111111111111111111111111111114, bArr111111111111111111111111111111110);
                                t23.a(s13Var111111111111111111111111111111110, dy2Var, entry.getKey(), entry.getValue());
                                s13Var111111111111111111111111111111110.d();
                                l13 l13Var11111111111111111111111111111111111111111111111111111111111111110 = new l13(bArr111111111111111111111111111111110);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var11111111111111111111111111111111111111111111111111111111111111110);
                                it.remove();
                                break;
                            case 14:
                                ((Integer) value).getClass();
                                iB2 = 4;
                                int i111111111111111111111111111111115 = iB2 + iA2 + i2;
                                l13 l13Var11111111111111111111111111111111111111111111111111111111111111111 = n13.g;
                                byte[] bArr111111111111111111111111111111111 = new byte[i111111111111111111111111111111115];
                                s13 s13Var111111111111111111111111111111111 = new s13(i111111111111111111111111111111115, bArr111111111111111111111111111111111);
                                t23.a(s13Var111111111111111111111111111111111, dy2Var, entry.getKey(), entry.getValue());
                                s13Var111111111111111111111111111111111.d();
                                l13 l13Var11111111111111111111111111111111111111111111111111111111111111112 = new l13(bArr111111111111111111111111111111111);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var11111111111111111111111111111111111111111111111111111111111111112);
                                it.remove();
                                break;
                            case 15:
                                ((Long) value).getClass();
                                iB2 = 8;
                                int i111111111111111111111111111111116 = iB2 + iA2 + i2;
                                l13 l13Var11111111111111111111111111111111111111111111111111111111111111113 = n13.g;
                                byte[] bArr111111111111111111111111111111112 = new byte[i111111111111111111111111111111116];
                                s13 s13Var111111111111111111111111111111112 = new s13(i111111111111111111111111111111116, bArr111111111111111111111111111111112);
                                t23.a(s13Var111111111111111111111111111111112, dy2Var, entry.getKey(), entry.getValue());
                                s13Var111111111111111111111111111111112.d();
                                l13 l13Var11111111111111111111111111111111111111111111111111111111111111114 = new l13(bArr111111111111111111111111111111112);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var11111111111111111111111111111111111111111111111111111111111111114);
                                it.remove();
                                break;
                            case 16:
                                int iIntValue19 = ((Integer) value).intValue();
                                iB2 = u13.a((iIntValue19 >> 31) ^ (iIntValue19 + iIntValue19));
                                int i111111111111111111111111111111117 = iB2 + iA2 + i2;
                                l13 l13Var11111111111111111111111111111111111111111111111111111111111111115 = n13.g;
                                byte[] bArr111111111111111111111111111111113 = new byte[i111111111111111111111111111111117];
                                s13 s13Var111111111111111111111111111111113 = new s13(i111111111111111111111111111111117, bArr111111111111111111111111111111113);
                                t23.a(s13Var111111111111111111111111111111113, dy2Var, entry.getKey(), entry.getValue());
                                s13Var111111111111111111111111111111113.d();
                                l13 l13Var11111111111111111111111111111111111111111111111111111111111111116 = new l13(bArr111111111111111111111111111111113);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var11111111111111111111111111111111111111111111111111111111111111116);
                                it.remove();
                                break;
                            case 17:
                                long jLongValue19 = ((Long) value).longValue();
                                iB2 = u13.b((jLongValue19 >> c) ^ (jLongValue19 + jLongValue19));
                                int i111111111111111111111111111111118 = iB2 + iA2 + i2;
                                l13 l13Var11111111111111111111111111111111111111111111111111111111111111117 = n13.g;
                                byte[] bArr111111111111111111111111111111114 = new byte[i111111111111111111111111111111118];
                                s13 s13Var111111111111111111111111111111114 = new s13(i111111111111111111111111111111118, bArr111111111111111111111111111111114);
                                t23.a(s13Var111111111111111111111111111111114, dy2Var, entry.getKey(), entry.getValue());
                                s13Var111111111111111111111111111111114.d();
                                l13 l13Var11111111111111111111111111111111111111111111111111111111111111118 = new l13(bArr111111111111111111111111111111114);
                                igVar.getClass();
                                ((p33) objJ).d((i3 << 3) | 2, l13Var11111111111111111111111111111111111111111111111111111111111111118);
                                it.remove();
                                break;
                            default:
                                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                        }
                        break;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            }
        }
        return objJ;
    }

    public final void L(int i, n9 n9Var, Object obj) {
        r13 r13Var = (r13) n9Var.d;
        long j = i & 1048575;
        if ((536870912 & i) != 0) {
            n9Var.r(2);
            u33.l(obj, j, r13Var.t());
        } else if (!this.f) {
            u33.l(obj, j, n9Var.z());
        } else {
            n9Var.r(2);
            u33.l(obj, j, r13Var.s());
        }
    }

    @Override // defpackage.j33
    public final d23 a() {
        return ((d23) this.e).p();
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00db A[PHI: r1
  0x00db: PHI (r1v34 int) = (r1v10 int), (r1v35 int) binds: [B:85:0x01ea, B:43:0x00d9] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // defpackage.j33
    public final int b(d23 d23Var) {
        int i;
        long jDoubleToLongBits;
        int i2;
        int iFloatToIntBits;
        int i3;
        int i4;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            int[] iArr = this.a;
            if (i5 >= iArr.length) {
                return d23Var.zzt.hashCode() + (i6 * 53);
            }
            int iK = k(i5);
            int i7 = 1048575 & iK;
            int iL = l(iK);
            int i8 = iArr[i5];
            long j = i7;
            int i9 = 1237;
            int iHashCode = 37;
            switch (iL) {
                case 0:
                    i = i6 * 53;
                    jDoubleToLongBits = Double.doubleToLongBits(u33.c.v1(j, d23Var));
                    Charset charset = m23.a;
                    i6 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    break;
                case 1:
                    i2 = i6 * 53;
                    iFloatToIntBits = Float.floatToIntBits(u33.c.t1(j, d23Var));
                    i6 = iFloatToIntBits + i2;
                    break;
                case 2:
                    i = i6 * 53;
                    jDoubleToLongBits = u33.i(j, d23Var);
                    Charset charset2 = m23.a;
                    i6 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    break;
                case 3:
                    i = i6 * 53;
                    jDoubleToLongBits = u33.i(j, d23Var);
                    Charset charset3 = m23.a;
                    i6 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    break;
                case 4:
                    i2 = i6 * 53;
                    iFloatToIntBits = u33.g(j, d23Var);
                    i6 = iFloatToIntBits + i2;
                    break;
                case 5:
                    i = i6 * 53;
                    jDoubleToLongBits = u33.i(j, d23Var);
                    Charset charset4 = m23.a;
                    i6 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    break;
                case 6:
                    i2 = i6 * 53;
                    iFloatToIntBits = u33.g(j, d23Var);
                    i6 = iFloatToIntBits + i2;
                    break;
                case 7:
                    i3 = i6 * 53;
                    boolean zQ1 = u33.c.q1(j, d23Var);
                    Charset charset5 = m23.a;
                    if (zQ1) {
                        i9 = 1231;
                    }
                    i6 = i9 + i3;
                    break;
                case 8:
                    i2 = i6 * 53;
                    iFloatToIntBits = ((String) u33.k(j, d23Var)).hashCode();
                    i6 = iFloatToIntBits + i2;
                    break;
                case 9:
                    i4 = i6 * 53;
                    Object objK = u33.k(j, d23Var);
                    if (objK != null) {
                        iHashCode = objK.hashCode();
                    }
                    i6 = i4 + iHashCode;
                    break;
                case 10:
                    i2 = i6 * 53;
                    iFloatToIntBits = u33.k(j, d23Var).hashCode();
                    i6 = iFloatToIntBits + i2;
                    break;
                case 11:
                    i2 = i6 * 53;
                    iFloatToIntBits = u33.g(j, d23Var);
                    i6 = iFloatToIntBits + i2;
                    break;
                case 12:
                    i2 = i6 * 53;
                    iFloatToIntBits = u33.g(j, d23Var);
                    i6 = iFloatToIntBits + i2;
                    break;
                case 13:
                    i2 = i6 * 53;
                    iFloatToIntBits = u33.g(j, d23Var);
                    i6 = iFloatToIntBits + i2;
                    break;
                case 14:
                    i = i6 * 53;
                    jDoubleToLongBits = u33.i(j, d23Var);
                    Charset charset6 = m23.a;
                    i6 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    break;
                case 15:
                    i2 = i6 * 53;
                    iFloatToIntBits = u33.g(j, d23Var);
                    i6 = iFloatToIntBits + i2;
                    break;
                case 16:
                    i = i6 * 53;
                    jDoubleToLongBits = u33.i(j, d23Var);
                    Charset charset7 = m23.a;
                    i6 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    break;
                case 17:
                    i4 = i6 * 53;
                    Object objK2 = u33.k(j, d23Var);
                    if (objK2 != null) {
                        iHashCode = objK2.hashCode();
                    }
                    i6 = i4 + iHashCode;
                    break;
                case 18:
                case 19:
                case 20:
                case zw0.zzm /* 21 */:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    i2 = i6 * 53;
                    iFloatToIntBits = u33.k(j, d23Var).hashCode();
                    i6 = iFloatToIntBits + i2;
                    break;
                case 50:
                    i2 = i6 * 53;
                    iFloatToIntBits = u33.k(j, d23Var).hashCode();
                    i6 = iFloatToIntBits + i2;
                    break;
                case 51:
                    if (u(i8, i5, d23Var)) {
                        i = i6 * 53;
                        jDoubleToLongBits = Double.doubleToLongBits(((Double) u33.k(j, d23Var)).doubleValue());
                        Charset charset8 = m23.a;
                        i6 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    }
                    break;
                case 52:
                    if (u(i8, i5, d23Var)) {
                        i2 = i6 * 53;
                        iFloatToIntBits = Float.floatToIntBits(((Float) u33.k(j, d23Var)).floatValue());
                        i6 = iFloatToIntBits + i2;
                    }
                    break;
                case 53:
                    if (u(i8, i5, d23Var)) {
                        i = i6 * 53;
                        jDoubleToLongBits = p(j, d23Var);
                        Charset charset9 = m23.a;
                        i6 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    }
                    break;
                case 54:
                    if (u(i8, i5, d23Var)) {
                        i = i6 * 53;
                        jDoubleToLongBits = p(j, d23Var);
                        Charset charset10 = m23.a;
                        i6 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    }
                    break;
                case 55:
                    if (u(i8, i5, d23Var)) {
                        i2 = i6 * 53;
                        iFloatToIntBits = o(j, d23Var);
                        i6 = iFloatToIntBits + i2;
                    }
                    break;
                case 56:
                    if (u(i8, i5, d23Var)) {
                        i = i6 * 53;
                        jDoubleToLongBits = p(j, d23Var);
                        Charset charset11 = m23.a;
                        i6 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    }
                    break;
                case 57:
                    if (u(i8, i5, d23Var)) {
                        i2 = i6 * 53;
                        iFloatToIntBits = o(j, d23Var);
                        i6 = iFloatToIntBits + i2;
                    }
                    break;
                case 58:
                    if (u(i8, i5, d23Var)) {
                        i3 = i6 * 53;
                        boolean zBooleanValue = ((Boolean) u33.k(j, d23Var)).booleanValue();
                        Charset charset12 = m23.a;
                        if (zBooleanValue) {
                            i9 = 1231;
                        }
                        i6 = i9 + i3;
                    }
                    break;
                case 59:
                    if (u(i8, i5, d23Var)) {
                        i2 = i6 * 53;
                        iFloatToIntBits = ((String) u33.k(j, d23Var)).hashCode();
                        i6 = iFloatToIntBits + i2;
                    }
                    break;
                case 60:
                    if (u(i8, i5, d23Var)) {
                        i2 = i6 * 53;
                        iFloatToIntBits = u33.k(j, d23Var).hashCode();
                        i6 = iFloatToIntBits + i2;
                    }
                    break;
                case 61:
                    if (u(i8, i5, d23Var)) {
                        i2 = i6 * 53;
                        iFloatToIntBits = u33.k(j, d23Var).hashCode();
                        i6 = iFloatToIntBits + i2;
                    }
                    break;
                case 62:
                    if (u(i8, i5, d23Var)) {
                        i2 = i6 * 53;
                        iFloatToIntBits = o(j, d23Var);
                        i6 = iFloatToIntBits + i2;
                    }
                    break;
                case 63:
                    if (u(i8, i5, d23Var)) {
                        i2 = i6 * 53;
                        iFloatToIntBits = o(j, d23Var);
                        i6 = iFloatToIntBits + i2;
                    }
                    break;
                case 64:
                    if (u(i8, i5, d23Var)) {
                        i2 = i6 * 53;
                        iFloatToIntBits = o(j, d23Var);
                        i6 = iFloatToIntBits + i2;
                    }
                    break;
                case 65:
                    if (u(i8, i5, d23Var)) {
                        i = i6 * 53;
                        jDoubleToLongBits = p(j, d23Var);
                        Charset charset13 = m23.a;
                        i6 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    }
                    break;
                case 66:
                    if (u(i8, i5, d23Var)) {
                        i2 = i6 * 53;
                        iFloatToIntBits = o(j, d23Var);
                        i6 = iFloatToIntBits + i2;
                    }
                    break;
                case 67:
                    if (u(i8, i5, d23Var)) {
                        i = i6 * 53;
                        jDoubleToLongBits = p(j, d23Var);
                        Charset charset14 = m23.a;
                        i6 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    }
                    break;
                case 68:
                    if (u(i8, i5, d23Var)) {
                        i2 = i6 * 53;
                        iFloatToIntBits = u33.k(j, d23Var).hashCode();
                        i6 = iFloatToIntBits + i2;
                    }
                    break;
            }
            i5 += 3;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:7:0x001e  */
    @Override // defpackage.j33
    public final void c(Object obj, Object obj2) {
        Object obj3;
        n(obj);
        obj2.getClass();
        int i = 0;
        while (true) {
            int[] iArr = this.a;
            if (i >= iArr.length) {
                k33.d(obj, obj2);
                return;
            }
            int iK = k(i);
            int i2 = 1048575 & iK;
            int iL = l(iK);
            int i3 = iArr[i];
            long j = i2;
            switch (iL) {
                case 0:
                    if (!s(i, obj2)) {
                        obj3 = obj;
                    } else {
                        t33 t33Var = u33.c;
                        obj3 = obj;
                        t33Var.w1(obj3, j, t33Var.v1(j, obj2));
                        t(i, obj3);
                    }
                    break;
                case 1:
                    if (s(i, obj2)) {
                        t33 t33Var2 = u33.c;
                        t33Var2.u1(obj, j, t33Var2.t1(j, obj2));
                        t(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 2:
                    if (s(i, obj2)) {
                        u33.j(obj, j, u33.i(j, obj2));
                        t(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 3:
                    if (s(i, obj2)) {
                        u33.j(obj, j, u33.i(j, obj2));
                        t(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 4:
                    if (s(i, obj2)) {
                        u33.h(obj, j, u33.g(j, obj2));
                        t(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 5:
                    if (s(i, obj2)) {
                        u33.j(obj, j, u33.i(j, obj2));
                        t(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 6:
                    if (s(i, obj2)) {
                        u33.h(obj, j, u33.g(j, obj2));
                        t(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 7:
                    if (s(i, obj2)) {
                        t33 t33Var3 = u33.c;
                        t33Var3.s1(obj, j, t33Var3.q1(j, obj2));
                        t(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 8:
                    if (s(i, obj2)) {
                        u33.l(obj, j, u33.k(j, obj2));
                        t(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 9:
                    B(obj, i, obj2);
                    obj3 = obj;
                    break;
                case 10:
                    if (s(i, obj2)) {
                        u33.l(obj, j, u33.k(j, obj2));
                        t(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 11:
                    if (s(i, obj2)) {
                        u33.h(obj, j, u33.g(j, obj2));
                        t(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 12:
                    if (s(i, obj2)) {
                        u33.h(obj, j, u33.g(j, obj2));
                        t(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 13:
                    if (s(i, obj2)) {
                        u33.h(obj, j, u33.g(j, obj2));
                        t(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 14:
                    if (s(i, obj2)) {
                        u33.j(obj, j, u33.i(j, obj2));
                        t(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 15:
                    if (s(i, obj2)) {
                        u33.h(obj, j, u33.g(j, obj2));
                        t(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 16:
                    if (s(i, obj2)) {
                        u33.j(obj, j, u33.i(j, obj2));
                        t(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 17:
                    B(obj, i, obj2);
                    obj3 = obj;
                    break;
                case 18:
                case 19:
                case 20:
                case zw0.zzm /* 21 */:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    l23 l23VarZ = (l23) u33.k(j, obj);
                    l23 l23Var = (l23) u33.k(j, obj2);
                    int size = l23VarZ.size();
                    int size2 = l23Var.size();
                    if (size > 0 && size2 > 0) {
                        if (!((g13) l23VarZ).f) {
                            l23VarZ = l23VarZ.z(size2 + size);
                        }
                        l23VarZ.addAll(l23Var);
                    }
                    if (size > 0) {
                        l23Var = l23VarZ;
                    }
                    u33.l(obj, j, l23Var);
                    obj3 = obj;
                    break;
                case 50:
                    ig igVar = k33.a;
                    u33.l(obj, j, et2.g(u33.k(j, obj), u33.k(j, obj2)));
                    obj3 = obj;
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (u(i3, i, obj2)) {
                        u33.l(obj, j, u33.k(j, obj2));
                        v(i3, i, obj);
                    }
                    obj3 = obj;
                    break;
                case 60:
                    C(obj, i, obj2);
                    obj3 = obj;
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (u(i3, i, obj2)) {
                        u33.l(obj, j, u33.k(j, obj2));
                        v(i3, i, obj);
                    }
                    obj3 = obj;
                    break;
                case 68:
                    C(obj, i, obj2);
                    obj3 = obj;
                    break;
                default:
                    obj3 = obj;
                    break;
            }
            i += 3;
            obj = obj3;
        }
    }

    @Override // defpackage.j33
    public final boolean d(Object obj) {
        int i;
        int i2;
        int i3 = 0;
        int i4 = 0;
        int i5 = 1048575;
        while (i4 < this.h) {
            int i6 = this.g[i4];
            int[] iArr = this.a;
            int i7 = iArr[i6];
            int iK = k(i6);
            int i8 = iArr[i6 + 2];
            int i9 = i8 & 1048575;
            int i10 = 1 << (i8 >>> 20);
            if (i9 != i5) {
                if (i9 != 1048575) {
                    i3 = l.getInt(obj, i9);
                }
                i2 = i3;
                i = i9;
            } else {
                int i11 = i3;
                i = i5;
                i2 = i11;
            }
            if ((268435456 & iK) == 0 || r(obj, i6, i, i2, i10)) {
                int iL = l(iK);
                if (iL != 9 && iL != 17) {
                    if (iL != 27) {
                        if (iL == 60 || iL == 68) {
                            if (!u(i7, i6, obj) || D(i6).d(u33.k(iK & 1048575, obj))) {
                                i4++;
                                i5 = i;
                                i3 = i2;
                            }
                        } else if (iL != 49) {
                            if (iL != 50) {
                                continue;
                            } else {
                                u23 u23Var = (u23) u33.k(iK & 1048575, obj);
                                if (!u23Var.isEmpty() && ((y33) ((t23) E(i6)).a.h).f == z33.n) {
                                    j33 j33VarA = null;
                                    for (Object obj2 : u23Var.values()) {
                                        if (j33VarA == null) {
                                            j33VarA = d33.c.a(obj2.getClass());
                                        }
                                        if (!j33VarA.d(obj2)) {
                                        }
                                    }
                                }
                            }
                            i4++;
                            i5 = i;
                            i3 = i2;
                        }
                    }
                    List list = (List) u33.k(iK & 1048575, obj);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        j33 j33VarD = D(i6);
                        for (int i12 = 0; i12 < list.size(); i12++) {
                            if (j33VarD.d(list.get(i12))) {
                            }
                        }
                    }
                    i4++;
                    i5 = i;
                    i3 = i2;
                } else if (!r(obj, i6, i, i2, i10) || D(i6).d(u33.k(iK & 1048575, obj))) {
                    i4++;
                    i5 = i;
                    i3 = i2;
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:131:0x0352  */
    /* JADX WARN: Code duplicated, block: B:136:0x0360  */
    /* JADX WARN: Code duplicated, block: B:137:0x0371  */
    /* JADX WARN: Code duplicated, block: B:138:0x0382  */
    /* JADX WARN: Code duplicated, block: B:140:0x038b  */
    /* JADX WARN: Code duplicated, block: B:142:0x0394  */
    /* JADX WARN: Code duplicated, block: B:144:0x0398  */
    /* JADX WARN: Code duplicated, block: B:145:0x03a5  */
    /* JADX WARN: Code duplicated, block: B:146:0x03b2  */
    /* JADX WARN: Code duplicated, block: B:147:0x03be  */
    /* JADX WARN: Code duplicated, block: B:149:0x03c2  */
    /* JADX WARN: Code duplicated, block: B:151:0x03cf  */
    /* JADX WARN: Code duplicated, block: B:152:0x03d7  */
    /* JADX WARN: Code duplicated, block: B:153:0x03e5  */
    /* JADX WARN: Code duplicated, block: B:154:0x03ef  */
    /* JADX WARN: Code duplicated, block: B:156:0x03f3  */
    /* JADX WARN: Code duplicated, block: B:157:0x03fe  */
    /* JADX WARN: Code duplicated, block: B:158:0x0405  */
    /* JADX WARN: Code duplicated, block: B:159:0x040d  */
    /* JADX WARN: Code duplicated, block: B:160:0x0414  */
    /* JADX WARN: Code duplicated, block: B:161:0x041b  */
    /* JADX WARN: Code duplicated, block: B:162:0x0427  */
    /* JADX WARN: Code duplicated, block: B:163:0x0432  */
    /* JADX WARN: Code duplicated, block: B:164:0x043d  */
    /* JADX WARN: Code duplicated, block: B:165:0x0444  */
    /* JADX WARN: Code duplicated, block: B:221:0x062c A[PHI: r21 r22
  0x062c: PHI (r21v21 int) = (r21v3 int), (r21v4 int), (r21v10 int), (r21v12 int), (r21v13 int), (r21v14 int), (r21v18 int), (r21v22 int) binds: [B:276:0x07d2, B:272:0x07b2, B:255:0x0734, B:241:0x06cb, B:237:0x06ab, B:233:0x068d, B:226:0x064d, B:220:0x062a] A[DONT_GENERATE, DONT_INLINE]
  0x062c: PHI (r22v20 int) = (r22v3 int), (r22v4 int), (r22v10 int), (r22v12 int), (r22v13 int), (r22v14 int), (r22v17 int), (r22v21 int) binds: [B:276:0x07d2, B:272:0x07b2, B:255:0x0734, B:241:0x06cb, B:237:0x06ab, B:233:0x068d, B:226:0x064d, B:220:0x062a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:266:0x0774 A[PHI: r21 r22
  0x0774: PHI (r21v8 int) = (r21v2 int), (r21v9 int) binds: [B:280:0x07f2, B:265:0x0772] A[DONT_GENERATE, DONT_INLINE]
  0x0774: PHI (r22v8 int) = (r22v2 int), (r22v9 int) binds: [B:280:0x07f2, B:265:0x0772] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:352:0x035a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:35:0x00af  */
    /* JADX WARN: Code duplicated, block: B:38:0x00bd  */
    /* JADX WARN: Code restructure failed: missing block: B:327:0x093b, code lost:
    
        if (r(r1, r2, r3, r4, r5) != false) goto L328;
     */
    /* JADX WARN: Code restructure failed: missing block: B:328:0x093d, code lost:
    
        r0 = r12 << 3;
        r1 = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:342:0x0995, code lost:
    
        if (r(r1, r2, r3, r4, r5) != false) goto L328;
     */
    @Override // defpackage.j33
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int e(defpackage.d23 r29) {
        /*
            Method dump skipped, instruction units count: 2710
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y23.e(d23):int");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:121:0x02ee  */
    /* JADX WARN: Code duplicated, block: B:126:0x02fc  */
    /* JADX WARN: Code duplicated, block: B:127:0x030d  */
    /* JADX WARN: Code duplicated, block: B:128:0x031e  */
    /* JADX WARN: Code duplicated, block: B:130:0x0327  */
    /* JADX WARN: Code duplicated, block: B:132:0x032f  */
    /* JADX WARN: Code duplicated, block: B:134:0x0333  */
    /* JADX WARN: Code duplicated, block: B:135:0x0340  */
    /* JADX WARN: Code duplicated, block: B:136:0x034d  */
    /* JADX WARN: Code duplicated, block: B:137:0x0359  */
    /* JADX WARN: Code duplicated, block: B:139:0x035d  */
    /* JADX WARN: Code duplicated, block: B:141:0x036a  */
    /* JADX WARN: Code duplicated, block: B:142:0x0372  */
    /* JADX WARN: Code duplicated, block: B:143:0x0380  */
    /* JADX WARN: Code duplicated, block: B:144:0x038a  */
    /* JADX WARN: Code duplicated, block: B:146:0x038e  */
    /* JADX WARN: Code duplicated, block: B:147:0x0399  */
    /* JADX WARN: Code duplicated, block: B:148:0x03a0  */
    /* JADX WARN: Code duplicated, block: B:149:0x03a7  */
    /* JADX WARN: Code duplicated, block: B:150:0x03ae  */
    /* JADX WARN: Code duplicated, block: B:151:0x03b5  */
    /* JADX WARN: Code duplicated, block: B:152:0x03c1  */
    /* JADX WARN: Code duplicated, block: B:153:0x03cc  */
    /* JADX WARN: Code duplicated, block: B:154:0x03d7  */
    /* JADX WARN: Code duplicated, block: B:155:0x03de  */
    /* JADX WARN: Code duplicated, block: B:284:0x02f6 A[SYNTHETIC] */
    @Override // defpackage.j33
    public final void f(Object obj, j52 j52Var) {
        int i;
        j52 j52Var2;
        int i2;
        int i3;
        boolean z;
        int iB;
        int iD;
        int iA;
        int iA2;
        int i4;
        int iA3;
        int iB2;
        int iD2;
        int iA4;
        j52 j52Var3 = j52Var;
        u13 u13Var = (u13) j52Var3.f;
        Unsafe unsafe = l;
        int i5 = 1048575;
        int i6 = 1048575;
        int i7 = 0;
        int i8 = 0;
        while (true) {
            int[] iArr = this.a;
            if (i7 >= iArr.length) {
                ((d23) obj).zzt.b(j52Var3);
                return;
            }
            int iK = k(i7);
            int iL = l(iK);
            int i9 = iArr[i7];
            if (iL <= 17) {
                int i10 = iArr[i7 + 2];
                int i11 = i10 & i5;
                if (i11 != i6) {
                    i8 = i11 == i5 ? 0 : unsafe.getInt(obj, i11);
                    i6 = i11;
                }
                i = 1 << (i10 >>> 20);
            } else {
                i = 0;
            }
            long j = iK & i5;
            switch (iL) {
                case 0:
                    j52Var2 = j52Var3;
                    if (r(obj, i7, i6, i8, i)) {
                        u13Var.m(i9, Double.doubleToRawLongBits(u33.c.v1(j, obj)));
                    }
                    i7 += 3;
                    j52Var3 = j52Var2;
                    i5 = 1048575;
                    break;
                case 1:
                    j52Var2 = j52Var3;
                    if (r(obj, i7, i6, i8, i)) {
                        u13Var.i(i9, Float.floatToRawIntBits(u33.c.t1(j, obj)));
                    }
                    i7 += 3;
                    j52Var3 = j52Var2;
                    i5 = 1048575;
                    break;
                case 2:
                    j52Var2 = j52Var3;
                    if (r(obj, i7, i6, i8, i)) {
                        u13Var.j(i9, unsafe.getLong(obj, j));
                    }
                    i7 += 3;
                    j52Var3 = j52Var2;
                    i5 = 1048575;
                    break;
                case 3:
                    j52Var2 = j52Var3;
                    if (r(obj, i7, i6, i8, i)) {
                        u13Var.j(i9, unsafe.getLong(obj, j));
                    }
                    i7 += 3;
                    j52Var3 = j52Var2;
                    i5 = 1048575;
                    break;
                case 4:
                    j52Var2 = j52Var3;
                    if (r(obj, i7, i6, i8, i)) {
                        u13Var.g(i9, unsafe.getInt(obj, j));
                    }
                    i7 += 3;
                    j52Var3 = j52Var2;
                    i5 = 1048575;
                    break;
                case 5:
                    j52Var2 = j52Var3;
                    if (r(obj, i7, i6, i8, i)) {
                        u13Var.m(i9, unsafe.getLong(obj, j));
                    }
                    i7 += 3;
                    j52Var3 = j52Var2;
                    i5 = 1048575;
                    break;
                case 6:
                    j52Var2 = j52Var3;
                    if (r(obj, i7, i6, i8, i)) {
                        u13Var.i(i9, unsafe.getInt(obj, j));
                    }
                    i7 += 3;
                    j52Var3 = j52Var2;
                    i5 = 1048575;
                    break;
                case 7:
                    j52Var2 = j52Var3;
                    if (r(obj, i7, i6, i8, i)) {
                        u13Var.n(i9, u33.c.q1(j, obj));
                    }
                    i7 += 3;
                    j52Var3 = j52Var2;
                    i5 = 1048575;
                    break;
                case 8:
                    j52Var2 = j52Var3;
                    if (r(obj, i7, i6, i8, i)) {
                        Object object = unsafe.getObject(obj, j);
                        if (object instanceof String) {
                            u13Var.o((String) object, i9);
                        } else {
                            u13Var.p(i9, (n13) object);
                        }
                    }
                    i7 += 3;
                    j52Var3 = j52Var2;
                    i5 = 1048575;
                    break;
                case 9:
                    j52Var2 = j52Var3;
                    if (r(obj, i7, i6, i8, i)) {
                        j52Var2.d(i9, unsafe.getObject(obj, j), D(i7));
                    }
                    i7 += 3;
                    j52Var3 = j52Var2;
                    i5 = 1048575;
                    break;
                case 10:
                    j52Var2 = j52Var3;
                    if (r(obj, i7, i6, i8, i)) {
                        u13Var.p(i9, (n13) unsafe.getObject(obj, j));
                    }
                    i7 += 3;
                    j52Var3 = j52Var2;
                    i5 = 1048575;
                    break;
                case 11:
                    j52Var2 = j52Var3;
                    if (r(obj, i7, i6, i8, i)) {
                        u13Var.h(i9, unsafe.getInt(obj, j));
                    }
                    i7 += 3;
                    j52Var3 = j52Var2;
                    i5 = 1048575;
                    break;
                case 12:
                    j52Var2 = j52Var3;
                    if (r(obj, i7, i6, i8, i)) {
                        u13Var.g(i9, unsafe.getInt(obj, j));
                    }
                    i7 += 3;
                    j52Var3 = j52Var2;
                    i5 = 1048575;
                    break;
                case 13:
                    j52Var2 = j52Var3;
                    if (r(obj, i7, i6, i8, i)) {
                        u13Var.i(i9, unsafe.getInt(obj, j));
                    }
                    i7 += 3;
                    j52Var3 = j52Var2;
                    i5 = 1048575;
                    break;
                case 14:
                    j52Var2 = j52Var3;
                    if (r(obj, i7, i6, i8, i)) {
                        u13Var.m(i9, unsafe.getLong(obj, j));
                    }
                    i7 += 3;
                    j52Var3 = j52Var2;
                    i5 = 1048575;
                    break;
                case 15:
                    j52Var2 = j52Var3;
                    if (r(obj, i7, i6, i8, i)) {
                        int i12 = unsafe.getInt(obj, j);
                        u13Var.h(i9, (i12 >> 31) ^ (i12 + i12));
                    }
                    i7 += 3;
                    j52Var3 = j52Var2;
                    i5 = 1048575;
                    break;
                case 16:
                    j52Var2 = j52Var3;
                    if (r(obj, i7, i6, i8, i)) {
                        long j2 = unsafe.getLong(obj, j);
                        u13Var.j(i9, (j2 >> 63) ^ (j2 + j2));
                    }
                    i7 += 3;
                    j52Var3 = j52Var2;
                    i5 = 1048575;
                    break;
                case 17:
                    j52Var2 = j52Var3;
                    if (r(obj, i7, i6, i8, i)) {
                        Object object2 = unsafe.getObject(obj, j);
                        u13Var.f(i9, 3);
                        D(i7).f((f13) object2, j52Var2);
                        u13Var.f(i9, 4);
                    }
                    i7 += 3;
                    j52Var3 = j52Var2;
                    i5 = 1048575;
                    break;
                case 18:
                    i6 = i6;
                    i8 = i8;
                    j52Var2 = j52Var3;
                    k33.f(iArr[i7], (List) unsafe.getObject(obj, j), j52Var2, false);
                    i6 = i6;
                    i8 = i8;
                    i7 += 3;
                    j52Var3 = j52Var2;
                    i5 = 1048575;
                    break;
                case 19:
                    i6 = i6;
                    i8 = i8;
                    j52Var2 = j52Var3;
                    k33.g(iArr[i7], (List) unsafe.getObject(obj, j), j52Var2, false);
                    i6 = i6;
                    i8 = i8;
                    i7 += 3;
                    j52Var3 = j52Var2;
                    i5 = 1048575;
                    break;
                case 20:
                    i6 = i6;
                    i8 = i8;
                    j52Var2 = j52Var3;
                    k33.h(iArr[i7], (List) unsafe.getObject(obj, j), j52Var2, false);
                    i6 = i6;
                    i8 = i8;
                    i7 += 3;
                    j52Var3 = j52Var2;
                    i5 = 1048575;
                    break;
                case zw0.zzm /* 21 */:
                    i6 = i6;
                    i8 = i8;
                    j52Var2 = j52Var3;
                    k33.i(iArr[i7], (List) unsafe.getObject(obj, j), j52Var2, false);
                    i6 = i6;
                    i8 = i8;
                    i7 += 3;
                    j52Var3 = j52Var2;
                    i5 = 1048575;
                    break;
                case 22:
                    i6 = i6;
                    i8 = i8;
                    j52Var2 = j52Var3;
                    k33.m(iArr[i7], (List) unsafe.getObject(obj, j), j52Var2, false);
                    i6 = i6;
                    i8 = i8;
                    i7 += 3;
                    j52Var3 = j52Var2;
                    i5 = 1048575;
                    break;
                case 23:
                    i6 = i6;
                    i8 = i8;
                    j52Var2 = j52Var3;
                    k33.k(iArr[i7], (List) unsafe.getObject(obj, j), j52Var2, false);
                    i6 = i6;
                    i8 = i8;
                    i7 += 3;
                    j52Var3 = j52Var2;
                    i5 = 1048575;
                    break;
                case 24:
                    i6 = i6;
                    i8 = i8;
                    j52Var2 = j52Var3;
                    k33.p(iArr[i7], (List) unsafe.getObject(obj, j), j52Var2, false);
                    i6 = i6;
                    i8 = i8;
                    i7 += 3;
                    j52Var3 = j52Var2;
                    i5 = 1048575;
                    break;
                case 25:
                    i6 = i6;
                    i8 = i8;
                    j52Var2 = j52Var3;
                    k33.s(iArr[i7], (List) unsafe.getObject(obj, j), j52Var2, false);
                    i6 = i6;
                    i8 = i8;
                    i7 += 3;
                    j52Var3 = j52Var2;
                    i5 = 1048575;
                    break;
                case 26:
                    i2 = i6;
                    i3 = i8;
                    j52Var2 = j52Var3;
                    int i13 = iArr[i7];
                    List list = (List) unsafe.getObject(obj, j);
                    ig igVar = k33.a;
                    if (list != null && !list.isEmpty()) {
                        for (int i14 = 0; i14 < list.size(); i14++) {
                            u13Var.o((String) list.get(i14), i13);
                        }
                    }
                    i6 = i2;
                    i8 = i3;
                    i7 += 3;
                    j52Var3 = j52Var2;
                    i5 = 1048575;
                    break;
                case 27:
                    i2 = i6;
                    i3 = i8;
                    j52Var2 = j52Var3;
                    int i15 = iArr[i7];
                    List list2 = (List) unsafe.getObject(obj, j);
                    j33 j33VarD = D(i7);
                    ig igVar2 = k33.a;
                    if (list2 != null && !list2.isEmpty()) {
                        for (int i16 = 0; i16 < list2.size(); i16++) {
                            j52Var2.d(i15, list2.get(i16), j33VarD);
                        }
                    }
                    i6 = i2;
                    i8 = i3;
                    i7 += 3;
                    j52Var3 = j52Var2;
                    i5 = 1048575;
                    break;
                case 28:
                    i2 = i6;
                    i3 = i8;
                    j52Var2 = j52Var3;
                    int i17 = iArr[i7];
                    List list3 = (List) unsafe.getObject(obj, j);
                    ig igVar3 = k33.a;
                    if (list3 != null && !list3.isEmpty()) {
                        for (int i18 = 0; i18 < list3.size(); i18++) {
                            u13Var.p(i17, (n13) list3.get(i18));
                        }
                    }
                    i6 = i2;
                    i8 = i3;
                    i7 += 3;
                    j52Var3 = j52Var2;
                    i5 = 1048575;
                    break;
                case 29:
                    j52Var2 = j52Var3;
                    z = false;
                    k33.n(iArr[i7], (List) unsafe.getObject(obj, j), j52Var2, false);
                    i6 = i6;
                    i8 = i8;
                    i7 += 3;
                    j52Var3 = j52Var2;
                    i5 = 1048575;
                    break;
                case 30:
                    j52Var2 = j52Var3;
                    z = false;
                    k33.r(iArr[i7], (List) unsafe.getObject(obj, j), j52Var2, false);
                    i6 = i6;
                    i8 = i8;
                    i7 += 3;
                    j52Var3 = j52Var2;
                    i5 = 1048575;
                    break;
                case 31:
                    j52Var2 = j52Var3;
                    z = false;
                    k33.q(iArr[i7], (List) unsafe.getObject(obj, j), j52Var2, false);
                    i6 = i6;
                    i8 = i8;
                    i7 += 3;
                    j52Var3 = j52Var2;
                    i5 = 1048575;
                    break;
                case 32:
                    j52Var2 = j52Var3;
                    z = false;
                    k33.l(iArr[i7], (List) unsafe.getObject(obj, j), j52Var2, false);
                    i6 = i6;
                    i8 = i8;
                    i7 += 3;
                    j52Var3 = j52Var2;
                    i5 = 1048575;
                    break;
                case 33:
                    j52Var2 = j52Var3;
                    z = false;
                    k33.o(iArr[i7], (List) unsafe.getObject(obj, j), j52Var2, false);
                    i6 = i6;
                    i8 = i8;
                    i7 += 3;
                    j52Var3 = j52Var2;
                    i5 = 1048575;
                    break;
                case 34:
                    j52Var2 = j52Var3;
                    z = false;
                    k33.j(iArr[i7], (List) unsafe.getObject(obj, j), j52Var2, false);
                    i6 = i6;
                    i8 = i8;
                    i7 += 3;
                    j52Var3 = j52Var2;
                    i5 = 1048575;
                    break;
                case 35:
                    i2 = i6;
                    i3 = i8;
                    j52Var2 = j52Var3;
                    k33.f(iArr[i7], (List) unsafe.getObject(obj, j), j52Var2, true);
                    i6 = i2;
                    i8 = i3;
                    i7 += 3;
                    j52Var3 = j52Var2;
                    i5 = 1048575;
                    break;
                case 36:
                    i2 = i6;
                    i3 = i8;
                    j52Var2 = j52Var3;
                    k33.g(iArr[i7], (List) unsafe.getObject(obj, j), j52Var2, true);
                    i6 = i2;
                    i8 = i3;
                    i7 += 3;
                    j52Var3 = j52Var2;
                    i5 = 1048575;
                    break;
                case 37:
                    i2 = i6;
                    i3 = i8;
                    j52Var2 = j52Var3;
                    k33.h(iArr[i7], (List) unsafe.getObject(obj, j), j52Var2, true);
                    i6 = i2;
                    i8 = i3;
                    i7 += 3;
                    j52Var3 = j52Var2;
                    i5 = 1048575;
                    break;
                case 38:
                    i2 = i6;
                    i3 = i8;
                    j52Var2 = j52Var3;
                    k33.i(iArr[i7], (List) unsafe.getObject(obj, j), j52Var2, true);
                    i6 = i2;
                    i8 = i3;
                    i7 += 3;
                    j52Var3 = j52Var2;
                    i5 = 1048575;
                    break;
                case 39:
                    i2 = i6;
                    i3 = i8;
                    j52Var2 = j52Var3;
                    k33.m(iArr[i7], (List) unsafe.getObject(obj, j), j52Var2, true);
                    i6 = i2;
                    i8 = i3;
                    i7 += 3;
                    j52Var3 = j52Var2;
                    i5 = 1048575;
                    break;
                case 40:
                    i2 = i6;
                    i3 = i8;
                    j52Var2 = j52Var3;
                    k33.k(iArr[i7], (List) unsafe.getObject(obj, j), j52Var2, true);
                    i6 = i2;
                    i8 = i3;
                    i7 += 3;
                    j52Var3 = j52Var2;
                    i5 = 1048575;
                    break;
                case 41:
                    i2 = i6;
                    i3 = i8;
                    j52Var2 = j52Var3;
                    k33.p(iArr[i7], (List) unsafe.getObject(obj, j), j52Var2, true);
                    i6 = i2;
                    i8 = i3;
                    i7 += 3;
                    j52Var3 = j52Var2;
                    i5 = 1048575;
                    break;
                case 42:
                    i2 = i6;
                    i3 = i8;
                    j52Var2 = j52Var3;
                    k33.s(iArr[i7], (List) unsafe.getObject(obj, j), j52Var2, true);
                    i6 = i2;
                    i8 = i3;
                    i7 += 3;
                    j52Var3 = j52Var2;
                    i5 = 1048575;
                    break;
                case 43:
                    i2 = i6;
                    i3 = i8;
                    j52Var2 = j52Var3;
                    k33.n(iArr[i7], (List) unsafe.getObject(obj, j), j52Var2, true);
                    i6 = i2;
                    i8 = i3;
                    i7 += 3;
                    j52Var3 = j52Var2;
                    i5 = 1048575;
                    break;
                case 44:
                    i2 = i6;
                    i3 = i8;
                    j52Var2 = j52Var3;
                    k33.r(iArr[i7], (List) unsafe.getObject(obj, j), j52Var2, true);
                    i6 = i2;
                    i8 = i3;
                    i7 += 3;
                    j52Var3 = j52Var2;
                    i5 = 1048575;
                    break;
                case 45:
                    i2 = i6;
                    i3 = i8;
                    j52Var2 = j52Var3;
                    k33.q(iArr[i7], (List) unsafe.getObject(obj, j), j52Var2, true);
                    i6 = i2;
                    i8 = i3;
                    i7 += 3;
                    j52Var3 = j52Var2;
                    i5 = 1048575;
                    break;
                case 46:
                    i2 = i6;
                    i3 = i8;
                    j52Var2 = j52Var3;
                    k33.l(iArr[i7], (List) unsafe.getObject(obj, j), j52Var2, true);
                    i6 = i2;
                    i8 = i3;
                    i7 += 3;
                    j52Var3 = j52Var2;
                    i5 = 1048575;
                    break;
                case 47:
                    i2 = i6;
                    i3 = i8;
                    j52Var2 = j52Var3;
                    k33.o(iArr[i7], (List) unsafe.getObject(obj, j), j52Var2, true);
                    i6 = i2;
                    i8 = i3;
                    i7 += 3;
                    j52Var3 = j52Var2;
                    i5 = 1048575;
                    break;
                case 48:
                    i2 = i6;
                    i3 = i8;
                    j52Var2 = j52Var3;
                    k33.j(iArr[i7], (List) unsafe.getObject(obj, j), j52Var2, true);
                    i6 = i2;
                    i8 = i3;
                    i7 += 3;
                    j52Var3 = j52Var2;
                    i5 = 1048575;
                    break;
                case 49:
                    i2 = i6;
                    i3 = i8;
                    int i19 = iArr[i7];
                    List list4 = (List) unsafe.getObject(obj, j);
                    j33 j33VarD2 = D(i7);
                    ig igVar4 = k33.a;
                    if (list4 != null && !list4.isEmpty()) {
                        for (int i20 = 0; i20 < list4.size(); i20++) {
                            f13 f13Var = (f13) list4.get(i20);
                            u13Var.f(i19, 3);
                            j33VarD2.f(f13Var, j52Var);
                            u13Var.f(i19, 4);
                        }
                    }
                    j52Var2 = j52Var;
                    i6 = i2;
                    i8 = i3;
                    i7 += 3;
                    j52Var3 = j52Var2;
                    i5 = 1048575;
                    break;
                case 50:
                    Object object3 = unsafe.getObject(obj, j);
                    if (object3 != null) {
                        dy2 dy2Var = ((t23) E(i7)).a;
                        Iterator it = ((u23) object3).entrySet().iterator();
                        while (it.hasNext()) {
                            Map.Entry entry = (Map.Entry) it.next();
                            u13Var.f(i9, 2);
                            Object key = entry.getKey();
                            Object value = entry.getValue();
                            y33 y33Var = (y33) dy2Var.g;
                            y33 y33Var2 = (y33) dy2Var.h;
                            int i21 = y13.c;
                            int iA5 = u13.a(8);
                            int i22 = i6;
                            y33 y33Var3 = y33.i;
                            if (y33Var == y33Var3) {
                                iA5 += iA5;
                            }
                            z33 z33Var = z33.f;
                            int i23 = i8;
                            Iterator it2 = it;
                            switch (y33Var.ordinal()) {
                                case 0:
                                    ((Double) key).getClass();
                                    iB = 8;
                                    i4 = iB + iA5;
                                    iA3 = u13.a(16);
                                    if (y33Var2 == y33Var3) {
                                        iA3 += iA3;
                                    }
                                    switch (y33Var2.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iB2 = 8;
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iB2 = 4;
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 2:
                                            iB2 = u13.b(((Long) value).longValue());
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 3:
                                            iB2 = u13.b(((Long) value).longValue());
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 4:
                                            iB2 = u13.b(((Integer) value).intValue());
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iB2 = 8;
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iB2 = 4;
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 7:
                                            ((Boolean) value).getClass();
                                            iB2 = 1;
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 8:
                                            if (value instanceof n13) {
                                                iD2 = ((n13) value).d();
                                                iA4 = u13.a(iD2);
                                                iB2 = iD2 + iA4;
                                            } else {
                                                iB2 = u13.c((String) value);
                                            }
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 9:
                                            iB2 = ((d23) ((f13) value)).d(null);
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 10:
                                            iD2 = ((d23) ((f13) value)).d(null);
                                            iA4 = u13.a(iD2);
                                            iB2 = iD2 + iA4;
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 11:
                                            if (value instanceof n13) {
                                                iD2 = ((n13) value).d();
                                                iA4 = u13.a(iD2);
                                            } else {
                                                iD2 = ((byte[]) value).length;
                                                iA4 = u13.a(iD2);
                                            }
                                            iB2 = iD2 + iA4;
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 12:
                                            iB2 = u13.a(((Integer) value).intValue());
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 13:
                                            if (value instanceof f23) {
                                                iB2 = u13.b(((f23) value).a());
                                            } else {
                                                iB2 = u13.b(((Integer) value).intValue());
                                            }
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iB2 = 4;
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iB2 = 8;
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 16:
                                            int iIntValue = ((Integer) value).intValue();
                                            iB2 = u13.a((iIntValue >> 31) ^ (iIntValue + iIntValue));
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 17:
                                            long jLongValue = ((Long) value).longValue();
                                            iB2 = u13.b((jLongValue >> 63) ^ (jLongValue + jLongValue));
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case 1:
                                    ((Float) key).getClass();
                                    iB = 4;
                                    i4 = iB + iA5;
                                    iA3 = u13.a(16);
                                    if (y33Var2 == y33Var3) {
                                        iA3 += iA3;
                                    }
                                    switch (y33Var2.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iB2 = 8;
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iB2 = 4;
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 2:
                                            iB2 = u13.b(((Long) value).longValue());
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 3:
                                            iB2 = u13.b(((Long) value).longValue());
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 4:
                                            iB2 = u13.b(((Integer) value).intValue());
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iB2 = 8;
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iB2 = 4;
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 7:
                                            ((Boolean) value).getClass();
                                            iB2 = 1;
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 8:
                                            if (value instanceof n13) {
                                                iD2 = ((n13) value).d();
                                                iA4 = u13.a(iD2);
                                                iB2 = iD2 + iA4;
                                            } else {
                                                iB2 = u13.c((String) value);
                                            }
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 9:
                                            iB2 = ((d23) ((f13) value)).d(null);
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 10:
                                            iD2 = ((d23) ((f13) value)).d(null);
                                            iA4 = u13.a(iD2);
                                            iB2 = iD2 + iA4;
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 11:
                                            if (value instanceof n13) {
                                                iD2 = ((n13) value).d();
                                                iA4 = u13.a(iD2);
                                            } else {
                                                iD2 = ((byte[]) value).length;
                                                iA4 = u13.a(iD2);
                                            }
                                            iB2 = iD2 + iA4;
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 12:
                                            iB2 = u13.a(((Integer) value).intValue());
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 13:
                                            if (value instanceof f23) {
                                                iB2 = u13.b(((f23) value).a());
                                            } else {
                                                iB2 = u13.b(((Integer) value).intValue());
                                            }
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iB2 = 4;
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iB2 = 8;
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 16:
                                            int iIntValue2 = ((Integer) value).intValue();
                                            iB2 = u13.a((iIntValue2 >> 31) ^ (iIntValue2 + iIntValue2));
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 17:
                                            long jLongValue2 = ((Long) value).longValue();
                                            iB2 = u13.b((jLongValue2 >> 63) ^ (jLongValue2 + jLongValue2));
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case 2:
                                    iB = u13.b(((Long) key).longValue());
                                    i4 = iB + iA5;
                                    iA3 = u13.a(16);
                                    if (y33Var2 == y33Var3) {
                                        iA3 += iA3;
                                    }
                                    switch (y33Var2.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iB2 = 8;
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iB2 = 4;
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 2:
                                            iB2 = u13.b(((Long) value).longValue());
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 3:
                                            iB2 = u13.b(((Long) value).longValue());
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 4:
                                            iB2 = u13.b(((Integer) value).intValue());
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iB2 = 8;
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iB2 = 4;
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 7:
                                            ((Boolean) value).getClass();
                                            iB2 = 1;
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 8:
                                            if (value instanceof n13) {
                                                iD2 = ((n13) value).d();
                                                iA4 = u13.a(iD2);
                                                iB2 = iD2 + iA4;
                                            } else {
                                                iB2 = u13.c((String) value);
                                            }
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 9:
                                            iB2 = ((d23) ((f13) value)).d(null);
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 10:
                                            iD2 = ((d23) ((f13) value)).d(null);
                                            iA4 = u13.a(iD2);
                                            iB2 = iD2 + iA4;
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 11:
                                            if (value instanceof n13) {
                                                iD2 = ((n13) value).d();
                                                iA4 = u13.a(iD2);
                                            } else {
                                                iD2 = ((byte[]) value).length;
                                                iA4 = u13.a(iD2);
                                            }
                                            iB2 = iD2 + iA4;
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 12:
                                            iB2 = u13.a(((Integer) value).intValue());
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 13:
                                            if (value instanceof f23) {
                                                iB2 = u13.b(((f23) value).a());
                                            } else {
                                                iB2 = u13.b(((Integer) value).intValue());
                                            }
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iB2 = 4;
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iB2 = 8;
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 16:
                                            int iIntValue3 = ((Integer) value).intValue();
                                            iB2 = u13.a((iIntValue3 >> 31) ^ (iIntValue3 + iIntValue3));
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 17:
                                            long jLongValue3 = ((Long) value).longValue();
                                            iB2 = u13.b((jLongValue3 >> 63) ^ (jLongValue3 + jLongValue3));
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case 3:
                                    iB = u13.b(((Long) key).longValue());
                                    i4 = iB + iA5;
                                    iA3 = u13.a(16);
                                    if (y33Var2 == y33Var3) {
                                        iA3 += iA3;
                                    }
                                    switch (y33Var2.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iB2 = 8;
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iB2 = 4;
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 2:
                                            iB2 = u13.b(((Long) value).longValue());
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 3:
                                            iB2 = u13.b(((Long) value).longValue());
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 4:
                                            iB2 = u13.b(((Integer) value).intValue());
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iB2 = 8;
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iB2 = 4;
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 7:
                                            ((Boolean) value).getClass();
                                            iB2 = 1;
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 8:
                                            if (value instanceof n13) {
                                                iD2 = ((n13) value).d();
                                                iA4 = u13.a(iD2);
                                                iB2 = iD2 + iA4;
                                            } else {
                                                iB2 = u13.c((String) value);
                                            }
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 9:
                                            iB2 = ((d23) ((f13) value)).d(null);
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 10:
                                            iD2 = ((d23) ((f13) value)).d(null);
                                            iA4 = u13.a(iD2);
                                            iB2 = iD2 + iA4;
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 11:
                                            if (value instanceof n13) {
                                                iD2 = ((n13) value).d();
                                                iA4 = u13.a(iD2);
                                            } else {
                                                iD2 = ((byte[]) value).length;
                                                iA4 = u13.a(iD2);
                                            }
                                            iB2 = iD2 + iA4;
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 12:
                                            iB2 = u13.a(((Integer) value).intValue());
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 13:
                                            if (value instanceof f23) {
                                                iB2 = u13.b(((f23) value).a());
                                            } else {
                                                iB2 = u13.b(((Integer) value).intValue());
                                            }
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iB2 = 4;
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iB2 = 8;
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 16:
                                            int iIntValue4 = ((Integer) value).intValue();
                                            iB2 = u13.a((iIntValue4 >> 31) ^ (iIntValue4 + iIntValue4));
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 17:
                                            long jLongValue4 = ((Long) value).longValue();
                                            iB2 = u13.b((jLongValue4 >> 63) ^ (jLongValue4 + jLongValue4));
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case 4:
                                    iB = u13.b(((Integer) key).intValue());
                                    i4 = iB + iA5;
                                    iA3 = u13.a(16);
                                    if (y33Var2 == y33Var3) {
                                        iA3 += iA3;
                                    }
                                    switch (y33Var2.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iB2 = 8;
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iB2 = 4;
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 2:
                                            iB2 = u13.b(((Long) value).longValue());
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 3:
                                            iB2 = u13.b(((Long) value).longValue());
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 4:
                                            iB2 = u13.b(((Integer) value).intValue());
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iB2 = 8;
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iB2 = 4;
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 7:
                                            ((Boolean) value).getClass();
                                            iB2 = 1;
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 8:
                                            if (value instanceof n13) {
                                                iD2 = ((n13) value).d();
                                                iA4 = u13.a(iD2);
                                                iB2 = iD2 + iA4;
                                            } else {
                                                iB2 = u13.c((String) value);
                                            }
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 9:
                                            iB2 = ((d23) ((f13) value)).d(null);
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 10:
                                            iD2 = ((d23) ((f13) value)).d(null);
                                            iA4 = u13.a(iD2);
                                            iB2 = iD2 + iA4;
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 11:
                                            if (value instanceof n13) {
                                                iD2 = ((n13) value).d();
                                                iA4 = u13.a(iD2);
                                            } else {
                                                iD2 = ((byte[]) value).length;
                                                iA4 = u13.a(iD2);
                                            }
                                            iB2 = iD2 + iA4;
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 12:
                                            iB2 = u13.a(((Integer) value).intValue());
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 13:
                                            if (value instanceof f23) {
                                                iB2 = u13.b(((f23) value).a());
                                            } else {
                                                iB2 = u13.b(((Integer) value).intValue());
                                            }
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iB2 = 4;
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iB2 = 8;
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 16:
                                            int iIntValue5 = ((Integer) value).intValue();
                                            iB2 = u13.a((iIntValue5 >> 31) ^ (iIntValue5 + iIntValue5));
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 17:
                                            long jLongValue5 = ((Long) value).longValue();
                                            iB2 = u13.b((jLongValue5 >> 63) ^ (jLongValue5 + jLongValue5));
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case 5:
                                    ((Long) key).getClass();
                                    iB = 8;
                                    i4 = iB + iA5;
                                    iA3 = u13.a(16);
                                    if (y33Var2 == y33Var3) {
                                        iA3 += iA3;
                                    }
                                    switch (y33Var2.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iB2 = 8;
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iB2 = 4;
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 2:
                                            iB2 = u13.b(((Long) value).longValue());
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 3:
                                            iB2 = u13.b(((Long) value).longValue());
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 4:
                                            iB2 = u13.b(((Integer) value).intValue());
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iB2 = 8;
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iB2 = 4;
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 7:
                                            ((Boolean) value).getClass();
                                            iB2 = 1;
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 8:
                                            if (value instanceof n13) {
                                                iD2 = ((n13) value).d();
                                                iA4 = u13.a(iD2);
                                                iB2 = iD2 + iA4;
                                            } else {
                                                iB2 = u13.c((String) value);
                                            }
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 9:
                                            iB2 = ((d23) ((f13) value)).d(null);
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 10:
                                            iD2 = ((d23) ((f13) value)).d(null);
                                            iA4 = u13.a(iD2);
                                            iB2 = iD2 + iA4;
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 11:
                                            if (value instanceof n13) {
                                                iD2 = ((n13) value).d();
                                                iA4 = u13.a(iD2);
                                            } else {
                                                iD2 = ((byte[]) value).length;
                                                iA4 = u13.a(iD2);
                                            }
                                            iB2 = iD2 + iA4;
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 12:
                                            iB2 = u13.a(((Integer) value).intValue());
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 13:
                                            if (value instanceof f23) {
                                                iB2 = u13.b(((f23) value).a());
                                            } else {
                                                iB2 = u13.b(((Integer) value).intValue());
                                            }
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iB2 = 4;
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iB2 = 8;
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 16:
                                            int iIntValue6 = ((Integer) value).intValue();
                                            iB2 = u13.a((iIntValue6 >> 31) ^ (iIntValue6 + iIntValue6));
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 17:
                                            long jLongValue6 = ((Long) value).longValue();
                                            iB2 = u13.b((jLongValue6 >> 63) ^ (jLongValue6 + jLongValue6));
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case 6:
                                    ((Integer) key).getClass();
                                    iB = 4;
                                    i4 = iB + iA5;
                                    iA3 = u13.a(16);
                                    if (y33Var2 == y33Var3) {
                                        iA3 += iA3;
                                    }
                                    switch (y33Var2.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iB2 = 8;
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iB2 = 4;
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 2:
                                            iB2 = u13.b(((Long) value).longValue());
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 3:
                                            iB2 = u13.b(((Long) value).longValue());
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 4:
                                            iB2 = u13.b(((Integer) value).intValue());
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iB2 = 8;
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iB2 = 4;
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 7:
                                            ((Boolean) value).getClass();
                                            iB2 = 1;
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 8:
                                            if (value instanceof n13) {
                                                iD2 = ((n13) value).d();
                                                iA4 = u13.a(iD2);
                                                iB2 = iD2 + iA4;
                                            } else {
                                                iB2 = u13.c((String) value);
                                            }
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 9:
                                            iB2 = ((d23) ((f13) value)).d(null);
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 10:
                                            iD2 = ((d23) ((f13) value)).d(null);
                                            iA4 = u13.a(iD2);
                                            iB2 = iD2 + iA4;
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 11:
                                            if (value instanceof n13) {
                                                iD2 = ((n13) value).d();
                                                iA4 = u13.a(iD2);
                                            } else {
                                                iD2 = ((byte[]) value).length;
                                                iA4 = u13.a(iD2);
                                            }
                                            iB2 = iD2 + iA4;
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 12:
                                            iB2 = u13.a(((Integer) value).intValue());
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 13:
                                            if (value instanceof f23) {
                                                iB2 = u13.b(((f23) value).a());
                                            } else {
                                                iB2 = u13.b(((Integer) value).intValue());
                                            }
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iB2 = 4;
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iB2 = 8;
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 16:
                                            int iIntValue7 = ((Integer) value).intValue();
                                            iB2 = u13.a((iIntValue7 >> 31) ^ (iIntValue7 + iIntValue7));
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 17:
                                            long jLongValue7 = ((Long) value).longValue();
                                            iB2 = u13.b((jLongValue7 >> 63) ^ (jLongValue7 + jLongValue7));
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case 7:
                                    ((Boolean) key).getClass();
                                    iB = 1;
                                    i4 = iB + iA5;
                                    iA3 = u13.a(16);
                                    if (y33Var2 == y33Var3) {
                                        iA3 += iA3;
                                    }
                                    switch (y33Var2.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iB2 = 8;
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iB2 = 4;
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 2:
                                            iB2 = u13.b(((Long) value).longValue());
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 3:
                                            iB2 = u13.b(((Long) value).longValue());
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 4:
                                            iB2 = u13.b(((Integer) value).intValue());
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iB2 = 8;
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iB2 = 4;
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 7:
                                            ((Boolean) value).getClass();
                                            iB2 = 1;
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 8:
                                            if (value instanceof n13) {
                                                iD2 = ((n13) value).d();
                                                iA4 = u13.a(iD2);
                                                iB2 = iD2 + iA4;
                                            } else {
                                                iB2 = u13.c((String) value);
                                            }
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 9:
                                            iB2 = ((d23) ((f13) value)).d(null);
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 10:
                                            iD2 = ((d23) ((f13) value)).d(null);
                                            iA4 = u13.a(iD2);
                                            iB2 = iD2 + iA4;
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 11:
                                            if (value instanceof n13) {
                                                iD2 = ((n13) value).d();
                                                iA4 = u13.a(iD2);
                                            } else {
                                                iD2 = ((byte[]) value).length;
                                                iA4 = u13.a(iD2);
                                            }
                                            iB2 = iD2 + iA4;
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 12:
                                            iB2 = u13.a(((Integer) value).intValue());
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 13:
                                            if (value instanceof f23) {
                                                iB2 = u13.b(((f23) value).a());
                                            } else {
                                                iB2 = u13.b(((Integer) value).intValue());
                                            }
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iB2 = 4;
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iB2 = 8;
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 16:
                                            int iIntValue8 = ((Integer) value).intValue();
                                            iB2 = u13.a((iIntValue8 >> 31) ^ (iIntValue8 + iIntValue8));
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 17:
                                            long jLongValue8 = ((Long) value).longValue();
                                            iB2 = u13.b((jLongValue8 >> 63) ^ (jLongValue8 + jLongValue8));
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case 8:
                                    if (key instanceof n13) {
                                        iD = ((n13) key).d();
                                        iA = u13.a(iD);
                                        iB = iD + iA;
                                    } else {
                                        iB = u13.c((String) key);
                                    }
                                    i4 = iB + iA5;
                                    iA3 = u13.a(16);
                                    if (y33Var2 == y33Var3) {
                                        iA3 += iA3;
                                    }
                                    switch (y33Var2.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iB2 = 8;
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iB2 = 4;
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 2:
                                            iB2 = u13.b(((Long) value).longValue());
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 3:
                                            iB2 = u13.b(((Long) value).longValue());
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 4:
                                            iB2 = u13.b(((Integer) value).intValue());
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iB2 = 8;
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iB2 = 4;
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 7:
                                            ((Boolean) value).getClass();
                                            iB2 = 1;
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 8:
                                            if (value instanceof n13) {
                                                iD2 = ((n13) value).d();
                                                iA4 = u13.a(iD2);
                                                iB2 = iD2 + iA4;
                                            } else {
                                                iB2 = u13.c((String) value);
                                            }
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 9:
                                            iB2 = ((d23) ((f13) value)).d(null);
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 10:
                                            iD2 = ((d23) ((f13) value)).d(null);
                                            iA4 = u13.a(iD2);
                                            iB2 = iD2 + iA4;
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 11:
                                            if (value instanceof n13) {
                                                iD2 = ((n13) value).d();
                                                iA4 = u13.a(iD2);
                                            } else {
                                                iD2 = ((byte[]) value).length;
                                                iA4 = u13.a(iD2);
                                            }
                                            iB2 = iD2 + iA4;
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 12:
                                            iB2 = u13.a(((Integer) value).intValue());
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 13:
                                            if (value instanceof f23) {
                                                iB2 = u13.b(((f23) value).a());
                                            } else {
                                                iB2 = u13.b(((Integer) value).intValue());
                                            }
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iB2 = 4;
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iB2 = 8;
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 16:
                                            int iIntValue9 = ((Integer) value).intValue();
                                            iB2 = u13.a((iIntValue9 >> 31) ^ (iIntValue9 + iIntValue9));
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 17:
                                            long jLongValue9 = ((Long) value).longValue();
                                            iB2 = u13.b((jLongValue9 >> 63) ^ (jLongValue9 + jLongValue9));
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case 9:
                                    iB = ((d23) ((f13) key)).d(null);
                                    i4 = iB + iA5;
                                    iA3 = u13.a(16);
                                    if (y33Var2 == y33Var3) {
                                        iA3 += iA3;
                                    }
                                    switch (y33Var2.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iB2 = 8;
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iB2 = 4;
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 2:
                                            iB2 = u13.b(((Long) value).longValue());
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 3:
                                            iB2 = u13.b(((Long) value).longValue());
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 4:
                                            iB2 = u13.b(((Integer) value).intValue());
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iB2 = 8;
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iB2 = 4;
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 7:
                                            ((Boolean) value).getClass();
                                            iB2 = 1;
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 8:
                                            if (value instanceof n13) {
                                                iD2 = ((n13) value).d();
                                                iA4 = u13.a(iD2);
                                                iB2 = iD2 + iA4;
                                            } else {
                                                iB2 = u13.c((String) value);
                                            }
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 9:
                                            iB2 = ((d23) ((f13) value)).d(null);
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 10:
                                            iD2 = ((d23) ((f13) value)).d(null);
                                            iA4 = u13.a(iD2);
                                            iB2 = iD2 + iA4;
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 11:
                                            if (value instanceof n13) {
                                                iD2 = ((n13) value).d();
                                                iA4 = u13.a(iD2);
                                            } else {
                                                iD2 = ((byte[]) value).length;
                                                iA4 = u13.a(iD2);
                                            }
                                            iB2 = iD2 + iA4;
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 12:
                                            iB2 = u13.a(((Integer) value).intValue());
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 13:
                                            if (value instanceof f23) {
                                                iB2 = u13.b(((f23) value).a());
                                            } else {
                                                iB2 = u13.b(((Integer) value).intValue());
                                            }
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iB2 = 4;
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iB2 = 8;
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 16:
                                            int iIntValue10 = ((Integer) value).intValue();
                                            iB2 = u13.a((iIntValue10 >> 31) ^ (iIntValue10 + iIntValue10));
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 17:
                                            long jLongValue10 = ((Long) value).longValue();
                                            iB2 = u13.b((jLongValue10 >> 63) ^ (jLongValue10 + jLongValue10));
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case 10:
                                    iD = ((d23) ((f13) key)).d(null);
                                    iA = u13.a(iD);
                                    iB = iD + iA;
                                    i4 = iB + iA5;
                                    iA3 = u13.a(16);
                                    if (y33Var2 == y33Var3) {
                                        iA3 += iA3;
                                    }
                                    switch (y33Var2.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iB2 = 8;
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iB2 = 4;
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 2:
                                            iB2 = u13.b(((Long) value).longValue());
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 3:
                                            iB2 = u13.b(((Long) value).longValue());
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 4:
                                            iB2 = u13.b(((Integer) value).intValue());
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iB2 = 8;
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iB2 = 4;
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 7:
                                            ((Boolean) value).getClass();
                                            iB2 = 1;
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 8:
                                            if (value instanceof n13) {
                                                iD2 = ((n13) value).d();
                                                iA4 = u13.a(iD2);
                                                iB2 = iD2 + iA4;
                                            } else {
                                                iB2 = u13.c((String) value);
                                            }
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 9:
                                            iB2 = ((d23) ((f13) value)).d(null);
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 10:
                                            iD2 = ((d23) ((f13) value)).d(null);
                                            iA4 = u13.a(iD2);
                                            iB2 = iD2 + iA4;
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 11:
                                            if (value instanceof n13) {
                                                iD2 = ((n13) value).d();
                                                iA4 = u13.a(iD2);
                                            } else {
                                                iD2 = ((byte[]) value).length;
                                                iA4 = u13.a(iD2);
                                            }
                                            iB2 = iD2 + iA4;
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 12:
                                            iB2 = u13.a(((Integer) value).intValue());
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 13:
                                            if (value instanceof f23) {
                                                iB2 = u13.b(((f23) value).a());
                                            } else {
                                                iB2 = u13.b(((Integer) value).intValue());
                                            }
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iB2 = 4;
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iB2 = 8;
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 16:
                                            int iIntValue11 = ((Integer) value).intValue();
                                            iB2 = u13.a((iIntValue11 >> 31) ^ (iIntValue11 + iIntValue11));
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 17:
                                            long jLongValue11 = ((Long) value).longValue();
                                            iB2 = u13.b((jLongValue11 >> 63) ^ (jLongValue11 + jLongValue11));
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case 11:
                                    if (key instanceof n13) {
                                        iD = ((n13) key).d();
                                        iA = u13.a(iD);
                                    } else {
                                        iD = ((byte[]) key).length;
                                        iA = u13.a(iD);
                                    }
                                    iB = iD + iA;
                                    i4 = iB + iA5;
                                    iA3 = u13.a(16);
                                    if (y33Var2 == y33Var3) {
                                        iA3 += iA3;
                                    }
                                    switch (y33Var2.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iB2 = 8;
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iB2 = 4;
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 2:
                                            iB2 = u13.b(((Long) value).longValue());
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 3:
                                            iB2 = u13.b(((Long) value).longValue());
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 4:
                                            iB2 = u13.b(((Integer) value).intValue());
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iB2 = 8;
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iB2 = 4;
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 7:
                                            ((Boolean) value).getClass();
                                            iB2 = 1;
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 8:
                                            if (value instanceof n13) {
                                                iD2 = ((n13) value).d();
                                                iA4 = u13.a(iD2);
                                                iB2 = iD2 + iA4;
                                            } else {
                                                iB2 = u13.c((String) value);
                                            }
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 9:
                                            iB2 = ((d23) ((f13) value)).d(null);
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 10:
                                            iD2 = ((d23) ((f13) value)).d(null);
                                            iA4 = u13.a(iD2);
                                            iB2 = iD2 + iA4;
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 11:
                                            if (value instanceof n13) {
                                                iD2 = ((n13) value).d();
                                                iA4 = u13.a(iD2);
                                            } else {
                                                iD2 = ((byte[]) value).length;
                                                iA4 = u13.a(iD2);
                                            }
                                            iB2 = iD2 + iA4;
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 12:
                                            iB2 = u13.a(((Integer) value).intValue());
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 13:
                                            if (value instanceof f23) {
                                                iB2 = u13.b(((f23) value).a());
                                            } else {
                                                iB2 = u13.b(((Integer) value).intValue());
                                            }
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iB2 = 4;
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iB2 = 8;
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 16:
                                            int iIntValue12 = ((Integer) value).intValue();
                                            iB2 = u13.a((iIntValue12 >> 31) ^ (iIntValue12 + iIntValue12));
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 17:
                                            long jLongValue12 = ((Long) value).longValue();
                                            iB2 = u13.b((jLongValue12 >> 63) ^ (jLongValue12 + jLongValue12));
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case 12:
                                    iB = u13.a(((Integer) key).intValue());
                                    i4 = iB + iA5;
                                    iA3 = u13.a(16);
                                    if (y33Var2 == y33Var3) {
                                        iA3 += iA3;
                                    }
                                    switch (y33Var2.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iB2 = 8;
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iB2 = 4;
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 2:
                                            iB2 = u13.b(((Long) value).longValue());
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 3:
                                            iB2 = u13.b(((Long) value).longValue());
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 4:
                                            iB2 = u13.b(((Integer) value).intValue());
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iB2 = 8;
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iB2 = 4;
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 7:
                                            ((Boolean) value).getClass();
                                            iB2 = 1;
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 8:
                                            if (value instanceof n13) {
                                                iD2 = ((n13) value).d();
                                                iA4 = u13.a(iD2);
                                                iB2 = iD2 + iA4;
                                            } else {
                                                iB2 = u13.c((String) value);
                                            }
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 9:
                                            iB2 = ((d23) ((f13) value)).d(null);
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 10:
                                            iD2 = ((d23) ((f13) value)).d(null);
                                            iA4 = u13.a(iD2);
                                            iB2 = iD2 + iA4;
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 11:
                                            if (value instanceof n13) {
                                                iD2 = ((n13) value).d();
                                                iA4 = u13.a(iD2);
                                            } else {
                                                iD2 = ((byte[]) value).length;
                                                iA4 = u13.a(iD2);
                                            }
                                            iB2 = iD2 + iA4;
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 12:
                                            iB2 = u13.a(((Integer) value).intValue());
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 13:
                                            if (value instanceof f23) {
                                                iB2 = u13.b(((f23) value).a());
                                            } else {
                                                iB2 = u13.b(((Integer) value).intValue());
                                            }
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iB2 = 4;
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iB2 = 8;
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 16:
                                            int iIntValue13 = ((Integer) value).intValue();
                                            iB2 = u13.a((iIntValue13 >> 31) ^ (iIntValue13 + iIntValue13));
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 17:
                                            long jLongValue13 = ((Long) value).longValue();
                                            iB2 = u13.b((jLongValue13 >> 63) ^ (jLongValue13 + jLongValue13));
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case 13:
                                    iB = key instanceof f23 ? u13.b(((f23) key).a()) : u13.b(((Integer) key).intValue());
                                    i4 = iB + iA5;
                                    iA3 = u13.a(16);
                                    if (y33Var2 == y33Var3) {
                                        iA3 += iA3;
                                    }
                                    switch (y33Var2.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iB2 = 8;
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iB2 = 4;
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 2:
                                            iB2 = u13.b(((Long) value).longValue());
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 3:
                                            iB2 = u13.b(((Long) value).longValue());
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 4:
                                            iB2 = u13.b(((Integer) value).intValue());
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iB2 = 8;
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iB2 = 4;
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 7:
                                            ((Boolean) value).getClass();
                                            iB2 = 1;
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 8:
                                            if (value instanceof n13) {
                                                iD2 = ((n13) value).d();
                                                iA4 = u13.a(iD2);
                                                iB2 = iD2 + iA4;
                                            } else {
                                                iB2 = u13.c((String) value);
                                            }
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 9:
                                            iB2 = ((d23) ((f13) value)).d(null);
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 10:
                                            iD2 = ((d23) ((f13) value)).d(null);
                                            iA4 = u13.a(iD2);
                                            iB2 = iD2 + iA4;
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 11:
                                            if (value instanceof n13) {
                                                iD2 = ((n13) value).d();
                                                iA4 = u13.a(iD2);
                                            } else {
                                                iD2 = ((byte[]) value).length;
                                                iA4 = u13.a(iD2);
                                            }
                                            iB2 = iD2 + iA4;
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 12:
                                            iB2 = u13.a(((Integer) value).intValue());
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 13:
                                            if (value instanceof f23) {
                                                iB2 = u13.b(((f23) value).a());
                                            } else {
                                                iB2 = u13.b(((Integer) value).intValue());
                                            }
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iB2 = 4;
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iB2 = 8;
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 16:
                                            int iIntValue14 = ((Integer) value).intValue();
                                            iB2 = u13.a((iIntValue14 >> 31) ^ (iIntValue14 + iIntValue14));
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 17:
                                            long jLongValue14 = ((Long) value).longValue();
                                            iB2 = u13.b((jLongValue14 >> 63) ^ (jLongValue14 + jLongValue14));
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case 14:
                                    ((Integer) key).getClass();
                                    iB = 4;
                                    i4 = iB + iA5;
                                    iA3 = u13.a(16);
                                    if (y33Var2 == y33Var3) {
                                        iA3 += iA3;
                                    }
                                    switch (y33Var2.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iB2 = 8;
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iB2 = 4;
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 2:
                                            iB2 = u13.b(((Long) value).longValue());
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 3:
                                            iB2 = u13.b(((Long) value).longValue());
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 4:
                                            iB2 = u13.b(((Integer) value).intValue());
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iB2 = 8;
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iB2 = 4;
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 7:
                                            ((Boolean) value).getClass();
                                            iB2 = 1;
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 8:
                                            if (value instanceof n13) {
                                                iD2 = ((n13) value).d();
                                                iA4 = u13.a(iD2);
                                                iB2 = iD2 + iA4;
                                            } else {
                                                iB2 = u13.c((String) value);
                                            }
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 9:
                                            iB2 = ((d23) ((f13) value)).d(null);
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 10:
                                            iD2 = ((d23) ((f13) value)).d(null);
                                            iA4 = u13.a(iD2);
                                            iB2 = iD2 + iA4;
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 11:
                                            if (value instanceof n13) {
                                                iD2 = ((n13) value).d();
                                                iA4 = u13.a(iD2);
                                            } else {
                                                iD2 = ((byte[]) value).length;
                                                iA4 = u13.a(iD2);
                                            }
                                            iB2 = iD2 + iA4;
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 12:
                                            iB2 = u13.a(((Integer) value).intValue());
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 13:
                                            if (value instanceof f23) {
                                                iB2 = u13.b(((f23) value).a());
                                            } else {
                                                iB2 = u13.b(((Integer) value).intValue());
                                            }
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iB2 = 4;
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iB2 = 8;
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 16:
                                            int iIntValue15 = ((Integer) value).intValue();
                                            iB2 = u13.a((iIntValue15 >> 31) ^ (iIntValue15 + iIntValue15));
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 17:
                                            long jLongValue15 = ((Long) value).longValue();
                                            iB2 = u13.b((jLongValue15 >> 63) ^ (jLongValue15 + jLongValue15));
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case 15:
                                    ((Long) key).getClass();
                                    iB = 8;
                                    i4 = iB + iA5;
                                    iA3 = u13.a(16);
                                    if (y33Var2 == y33Var3) {
                                        iA3 += iA3;
                                    }
                                    switch (y33Var2.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iB2 = 8;
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iB2 = 4;
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 2:
                                            iB2 = u13.b(((Long) value).longValue());
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 3:
                                            iB2 = u13.b(((Long) value).longValue());
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 4:
                                            iB2 = u13.b(((Integer) value).intValue());
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iB2 = 8;
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iB2 = 4;
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 7:
                                            ((Boolean) value).getClass();
                                            iB2 = 1;
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 8:
                                            if (value instanceof n13) {
                                                iD2 = ((n13) value).d();
                                                iA4 = u13.a(iD2);
                                                iB2 = iD2 + iA4;
                                            } else {
                                                iB2 = u13.c((String) value);
                                            }
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 9:
                                            iB2 = ((d23) ((f13) value)).d(null);
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 10:
                                            iD2 = ((d23) ((f13) value)).d(null);
                                            iA4 = u13.a(iD2);
                                            iB2 = iD2 + iA4;
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 11:
                                            if (value instanceof n13) {
                                                iD2 = ((n13) value).d();
                                                iA4 = u13.a(iD2);
                                            } else {
                                                iD2 = ((byte[]) value).length;
                                                iA4 = u13.a(iD2);
                                            }
                                            iB2 = iD2 + iA4;
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 12:
                                            iB2 = u13.a(((Integer) value).intValue());
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 13:
                                            if (value instanceof f23) {
                                                iB2 = u13.b(((f23) value).a());
                                            } else {
                                                iB2 = u13.b(((Integer) value).intValue());
                                            }
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iB2 = 4;
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iB2 = 8;
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 16:
                                            int iIntValue16 = ((Integer) value).intValue();
                                            iB2 = u13.a((iIntValue16 >> 31) ^ (iIntValue16 + iIntValue16));
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 17:
                                            long jLongValue16 = ((Long) value).longValue();
                                            iB2 = u13.b((jLongValue16 >> 63) ^ (jLongValue16 + jLongValue16));
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case 16:
                                    int iIntValue17 = ((Integer) key).intValue();
                                    iA2 = u13.a((iIntValue17 >> 31) ^ (iIntValue17 + iIntValue17));
                                    iB = iA2;
                                    i4 = iB + iA5;
                                    iA3 = u13.a(16);
                                    if (y33Var2 == y33Var3) {
                                        iA3 += iA3;
                                    }
                                    switch (y33Var2.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iB2 = 8;
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iB2 = 4;
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 2:
                                            iB2 = u13.b(((Long) value).longValue());
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 3:
                                            iB2 = u13.b(((Long) value).longValue());
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 4:
                                            iB2 = u13.b(((Integer) value).intValue());
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iB2 = 8;
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iB2 = 4;
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 7:
                                            ((Boolean) value).getClass();
                                            iB2 = 1;
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 8:
                                            if (value instanceof n13) {
                                                iD2 = ((n13) value).d();
                                                iA4 = u13.a(iD2);
                                                iB2 = iD2 + iA4;
                                            } else {
                                                iB2 = u13.c((String) value);
                                            }
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 9:
                                            iB2 = ((d23) ((f13) value)).d(null);
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 10:
                                            iD2 = ((d23) ((f13) value)).d(null);
                                            iA4 = u13.a(iD2);
                                            iB2 = iD2 + iA4;
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 11:
                                            if (value instanceof n13) {
                                                iD2 = ((n13) value).d();
                                                iA4 = u13.a(iD2);
                                            } else {
                                                iD2 = ((byte[]) value).length;
                                                iA4 = u13.a(iD2);
                                            }
                                            iB2 = iD2 + iA4;
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 12:
                                            iB2 = u13.a(((Integer) value).intValue());
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 13:
                                            if (value instanceof f23) {
                                                iB2 = u13.b(((f23) value).a());
                                            } else {
                                                iB2 = u13.b(((Integer) value).intValue());
                                            }
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iB2 = 4;
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iB2 = 8;
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 16:
                                            int iIntValue18 = ((Integer) value).intValue();
                                            iB2 = u13.a((iIntValue18 >> 31) ^ (iIntValue18 + iIntValue18));
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 17:
                                            long jLongValue17 = ((Long) value).longValue();
                                            iB2 = u13.b((jLongValue17 >> 63) ^ (jLongValue17 + jLongValue17));
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case 17:
                                    long jLongValue18 = ((Long) key).longValue();
                                    iA2 = u13.b((jLongValue18 + jLongValue18) ^ (jLongValue18 >> 63));
                                    iB = iA2;
                                    i4 = iB + iA5;
                                    iA3 = u13.a(16);
                                    if (y33Var2 == y33Var3) {
                                        iA3 += iA3;
                                    }
                                    switch (y33Var2.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iB2 = 8;
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iB2 = 4;
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 2:
                                            iB2 = u13.b(((Long) value).longValue());
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 3:
                                            iB2 = u13.b(((Long) value).longValue());
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 4:
                                            iB2 = u13.b(((Integer) value).intValue());
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iB2 = 8;
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iB2 = 4;
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 7:
                                            ((Boolean) value).getClass();
                                            iB2 = 1;
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 8:
                                            if (value instanceof n13) {
                                                iD2 = ((n13) value).d();
                                                iA4 = u13.a(iD2);
                                                iB2 = iD2 + iA4;
                                            } else {
                                                iB2 = u13.c((String) value);
                                            }
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 9:
                                            iB2 = ((d23) ((f13) value)).d(null);
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 10:
                                            iD2 = ((d23) ((f13) value)).d(null);
                                            iA4 = u13.a(iD2);
                                            iB2 = iD2 + iA4;
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 11:
                                            if (value instanceof n13) {
                                                iD2 = ((n13) value).d();
                                                iA4 = u13.a(iD2);
                                            } else {
                                                iD2 = ((byte[]) value).length;
                                                iA4 = u13.a(iD2);
                                            }
                                            iB2 = iD2 + iA4;
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 12:
                                            iB2 = u13.a(((Integer) value).intValue());
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 13:
                                            if (value instanceof f23) {
                                                iB2 = u13.b(((f23) value).a());
                                            } else {
                                                iB2 = u13.b(((Integer) value).intValue());
                                            }
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iB2 = 4;
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iB2 = 8;
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 16:
                                            int iIntValue19 = ((Integer) value).intValue();
                                            iB2 = u13.a((iIntValue19 >> 31) ^ (iIntValue19 + iIntValue19));
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        case 17:
                                            long jLongValue19 = ((Long) value).longValue();
                                            iB2 = u13.b((jLongValue19 >> 63) ^ (jLongValue19 + jLongValue19));
                                            u13Var.v(iB2 + iA3 + i4);
                                            t23.a(u13Var, dy2Var, entry.getKey(), entry.getValue());
                                            i6 = i22;
                                            i8 = i23;
                                            it = it2;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                default:
                                    throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                            }
                        }
                    }
                    j52Var2 = j52Var;
                    i7 += 3;
                    j52Var3 = j52Var2;
                    i5 = 1048575;
                    break;
                case 51:
                    if (u(i9, i7, obj)) {
                        u13Var.m(i9, Double.doubleToRawLongBits(((Double) u33.k(j, obj)).doubleValue()));
                    }
                    j52Var2 = j52Var3;
                    i7 += 3;
                    j52Var3 = j52Var2;
                    i5 = 1048575;
                    break;
                case 52:
                    if (u(i9, i7, obj)) {
                        u13Var.i(i9, Float.floatToRawIntBits(((Float) u33.k(j, obj)).floatValue()));
                    }
                    j52Var2 = j52Var3;
                    i7 += 3;
                    j52Var3 = j52Var2;
                    i5 = 1048575;
                    break;
                case 53:
                    if (u(i9, i7, obj)) {
                        u13Var.j(i9, p(j, obj));
                    }
                    j52Var2 = j52Var3;
                    i7 += 3;
                    j52Var3 = j52Var2;
                    i5 = 1048575;
                    break;
                case 54:
                    if (u(i9, i7, obj)) {
                        u13Var.j(i9, p(j, obj));
                    }
                    j52Var2 = j52Var3;
                    i7 += 3;
                    j52Var3 = j52Var2;
                    i5 = 1048575;
                    break;
                case 55:
                    if (u(i9, i7, obj)) {
                        u13Var.g(i9, o(j, obj));
                    }
                    j52Var2 = j52Var3;
                    i7 += 3;
                    j52Var3 = j52Var2;
                    i5 = 1048575;
                    break;
                case 56:
                    if (u(i9, i7, obj)) {
                        u13Var.m(i9, p(j, obj));
                    }
                    j52Var2 = j52Var3;
                    i7 += 3;
                    j52Var3 = j52Var2;
                    i5 = 1048575;
                    break;
                case 57:
                    if (u(i9, i7, obj)) {
                        u13Var.i(i9, o(j, obj));
                    }
                    j52Var2 = j52Var3;
                    i7 += 3;
                    j52Var3 = j52Var2;
                    i5 = 1048575;
                    break;
                case 58:
                    if (u(i9, i7, obj)) {
                        u13Var.n(i9, ((Boolean) u33.k(j, obj)).booleanValue());
                    }
                    j52Var2 = j52Var3;
                    i7 += 3;
                    j52Var3 = j52Var2;
                    i5 = 1048575;
                    break;
                case 59:
                    if (u(i9, i7, obj)) {
                        Object object4 = unsafe.getObject(obj, j);
                        if (object4 instanceof String) {
                            u13Var.o((String) object4, i9);
                        } else {
                            u13Var.p(i9, (n13) object4);
                        }
                    }
                    j52Var2 = j52Var3;
                    i7 += 3;
                    j52Var3 = j52Var2;
                    i5 = 1048575;
                    break;
                case 60:
                    if (u(i9, i7, obj)) {
                        j52Var3.d(i9, unsafe.getObject(obj, j), D(i7));
                    }
                    j52Var2 = j52Var3;
                    i7 += 3;
                    j52Var3 = j52Var2;
                    i5 = 1048575;
                    break;
                case 61:
                    if (u(i9, i7, obj)) {
                        u13Var.p(i9, (n13) unsafe.getObject(obj, j));
                    }
                    j52Var2 = j52Var3;
                    i7 += 3;
                    j52Var3 = j52Var2;
                    i5 = 1048575;
                    break;
                case 62:
                    if (u(i9, i7, obj)) {
                        u13Var.h(i9, o(j, obj));
                    }
                    j52Var2 = j52Var3;
                    i7 += 3;
                    j52Var3 = j52Var2;
                    i5 = 1048575;
                    break;
                case 63:
                    if (u(i9, i7, obj)) {
                        u13Var.g(i9, o(j, obj));
                    }
                    j52Var2 = j52Var3;
                    i7 += 3;
                    j52Var3 = j52Var2;
                    i5 = 1048575;
                    break;
                case 64:
                    if (u(i9, i7, obj)) {
                        u13Var.i(i9, o(j, obj));
                    }
                    j52Var2 = j52Var3;
                    i7 += 3;
                    j52Var3 = j52Var2;
                    i5 = 1048575;
                    break;
                case 65:
                    if (u(i9, i7, obj)) {
                        u13Var.m(i9, p(j, obj));
                    }
                    j52Var2 = j52Var3;
                    i7 += 3;
                    j52Var3 = j52Var2;
                    i5 = 1048575;
                    break;
                case 66:
                    if (u(i9, i7, obj)) {
                        int iO = o(j, obj);
                        u13Var.h(i9, (iO >> 31) ^ (iO + iO));
                    }
                    j52Var2 = j52Var3;
                    i7 += 3;
                    j52Var3 = j52Var2;
                    i5 = 1048575;
                    break;
                case 67:
                    if (u(i9, i7, obj)) {
                        long jP = p(j, obj);
                        u13Var.j(i9, (jP >> 63) ^ (jP + jP));
                    }
                    j52Var2 = j52Var3;
                    i7 += 3;
                    j52Var3 = j52Var2;
                    i5 = 1048575;
                    break;
                case 68:
                    if (u(i9, i7, obj)) {
                        Object object5 = unsafe.getObject(obj, j);
                        u13Var.f(i9, 3);
                        D(i7).f((f13) object5, j52Var3);
                        u13Var.f(i9, 4);
                    }
                    j52Var2 = j52Var3;
                    i7 += 3;
                    j52Var3 = j52Var2;
                    i5 = 1048575;
                    break;
                default:
                    j52Var2 = j52Var3;
                    i7 += 3;
                    j52Var3 = j52Var2;
                    i5 = 1048575;
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:207:0x07c2 A[LOOP:3: B:206:0x07c0->B:207:0x07c2, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:209:0x07d7  */
    /* JADX WARN: Code duplicated, block: B:211:0x07e3  */
    /* JADX WARN: Code duplicated, block: B:217:0x07ef A[LOOP:1: B:216:0x07ed->B:217:0x07ef, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:219:0x0800  */
    /* JADX WARN: Code duplicated, block: B:228:0x07ae A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:324:0x07bf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:348:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.j33
    public final void g(Object obj, n9 n9Var, v13 v13Var) throws Throwable {
        Object obj2;
        Object objK;
        Object objK2;
        y23 y23Var;
        ig igVar;
        Object obj3;
        y23 y23Var2;
        Object objJ;
        Object obj4;
        y23 y23Var3 = this;
        r13 r13Var = (r13) n9Var.d;
        int[] iArr = y23Var3.g;
        int i = y23Var3.i;
        int i2 = y23Var3.h;
        v13Var.getClass();
        n(obj);
        ig igVar2 = y23Var3.j;
        Object objJ2 = null;
        while (true) {
            try {
                int iY = n9Var.y();
                int iW = (iY < y23Var3.c || iY > y23Var3.d) ? -1 : y23Var3.w(iY, 0);
                if (iW >= 0) {
                    int iK = y23Var3.k(iW);
                    try {
                        try {
                            switch (l(iK)) {
                                case 0:
                                    obj2 = objJ2;
                                    igVar = igVar2;
                                    y23 y23Var4 = y23Var3;
                                    int i3 = iK & 1048575;
                                    try {
                                        n9Var.r(1);
                                        y23Var = y23Var4;
                                        u33.c.w1(obj, i3, r13Var.k());
                                        y23Var.t(iW, obj);
                                        y23Var3 = y23Var;
                                        igVar2 = igVar;
                                        objJ2 = obj2;
                                    } catch (Throwable th) {
                                        th = th;
                                        igVar2 = igVar;
                                        objJ2 = obj2;
                                        objK = objJ2;
                                        while (i2 < i) {
                                            objK = K(obj, iArr[i2], objK, igVar2, obj);
                                            i2++;
                                        }
                                        if (objK != null) {
                                            igVar2.getClass();
                                            ((d23) obj).zzt = (p33) objK;
                                        }
                                        throw th;
                                    }
                                    break;
                                case 1:
                                    obj2 = objJ2;
                                    igVar = igVar2;
                                    y23Var2 = y23Var3;
                                    n9Var.r(5);
                                    u33.c.u1(obj, iK & 1048575, r13Var.l());
                                    y23Var2.t(iW, obj);
                                    y23Var = y23Var2;
                                    y23Var3 = y23Var;
                                    igVar2 = igVar;
                                    objJ2 = obj2;
                                    break;
                                case 2:
                                    obj2 = objJ2;
                                    igVar = igVar2;
                                    y23Var2 = y23Var3;
                                    n9Var.r(0);
                                    u33.j(obj, iK & 1048575, r13Var.n());
                                    y23Var2.t(iW, obj);
                                    y23Var = y23Var2;
                                    y23Var3 = y23Var;
                                    igVar2 = igVar;
                                    objJ2 = obj2;
                                    break;
                                case 3:
                                    obj2 = objJ2;
                                    igVar = igVar2;
                                    y23Var2 = y23Var3;
                                    n9Var.r(0);
                                    u33.j(obj, iK & 1048575, r13Var.m());
                                    y23Var2.t(iW, obj);
                                    y23Var = y23Var2;
                                    y23Var3 = y23Var;
                                    igVar2 = igVar;
                                    objJ2 = obj2;
                                    break;
                                case 4:
                                    obj2 = objJ2;
                                    igVar = igVar2;
                                    y23Var2 = y23Var3;
                                    n9Var.r(0);
                                    u33.h(obj, iK & 1048575, r13Var.o());
                                    y23Var2.t(iW, obj);
                                    y23Var = y23Var2;
                                    y23Var3 = y23Var;
                                    igVar2 = igVar;
                                    objJ2 = obj2;
                                    break;
                                case 5:
                                    obj2 = objJ2;
                                    igVar = igVar2;
                                    y23Var2 = y23Var3;
                                    n9Var.r(1);
                                    u33.j(obj, iK & 1048575, r13Var.p());
                                    y23Var2.t(iW, obj);
                                    y23Var = y23Var2;
                                    y23Var3 = y23Var;
                                    igVar2 = igVar;
                                    objJ2 = obj2;
                                    break;
                                case 6:
                                    obj2 = objJ2;
                                    igVar = igVar2;
                                    y23Var2 = y23Var3;
                                    n9Var.r(5);
                                    u33.h(obj, iK & 1048575, r13Var.q());
                                    y23Var2.t(iW, obj);
                                    y23Var = y23Var2;
                                    y23Var3 = y23Var;
                                    igVar2 = igVar;
                                    objJ2 = obj2;
                                    break;
                                case 7:
                                    obj2 = objJ2;
                                    igVar = igVar2;
                                    y23Var2 = y23Var3;
                                    n9Var.r(0);
                                    u33.c.s1(obj, iK & 1048575, r13Var.r());
                                    y23Var2.t(iW, obj);
                                    y23Var = y23Var2;
                                    y23Var3 = y23Var;
                                    igVar2 = igVar;
                                    objJ2 = obj2;
                                    break;
                                case 8:
                                    obj2 = objJ2;
                                    igVar = igVar2;
                                    y23Var2 = y23Var3;
                                    y23Var2.L(iK, n9Var, obj);
                                    y23Var2.t(iW, obj);
                                    y23Var = y23Var2;
                                    y23Var3 = y23Var;
                                    igVar2 = igVar;
                                    objJ2 = obj2;
                                    break;
                                case 9:
                                    obj2 = objJ2;
                                    igVar = igVar2;
                                    y23Var2 = y23Var3;
                                    f13 f13Var = (f13) y23Var2.G(iW, obj);
                                    j33 j33VarD = y23Var2.D(iW);
                                    n9Var.r(2);
                                    n9Var.s(f13Var, j33VarD, v13Var);
                                    y23Var2.H(obj, iW, f13Var);
                                    y23Var = y23Var2;
                                    y23Var3 = y23Var;
                                    igVar2 = igVar;
                                    objJ2 = obj2;
                                    break;
                                case 10:
                                    obj2 = objJ2;
                                    igVar = igVar2;
                                    y23Var2 = y23Var3;
                                    u33.l(obj, iK & 1048575, n9Var.z());
                                    y23Var2.t(iW, obj);
                                    y23Var = y23Var2;
                                    y23Var3 = y23Var;
                                    igVar2 = igVar;
                                    objJ2 = obj2;
                                    break;
                                case 11:
                                    obj2 = objJ2;
                                    igVar = igVar2;
                                    y23Var2 = y23Var3;
                                    n9Var.r(0);
                                    u33.h(obj, iK & 1048575, r13Var.v());
                                    y23Var2.t(iW, obj);
                                    y23Var = y23Var2;
                                    y23Var3 = y23Var;
                                    igVar2 = igVar;
                                    objJ2 = obj2;
                                    break;
                                case 12:
                                    obj2 = objJ2;
                                    igVar = igVar2;
                                    y23Var2 = y23Var3;
                                    n9Var.r(0);
                                    int iW2 = r13Var.w();
                                    g23 g23VarF = y23Var2.F(iW);
                                    if (g23VarF != null && !g23VarF.a(iW2)) {
                                        ig igVar3 = k33.a;
                                        if (obj2 == null) {
                                            igVar.getClass();
                                            objJ = ig.j(obj);
                                        } else {
                                            objJ = obj2;
                                        }
                                        igVar.getClass();
                                        ((p33) objJ).d(iY << 3, Long.valueOf(iW2));
                                        y23Var3 = y23Var2;
                                        objJ2 = objJ;
                                        igVar2 = igVar;
                                    }
                                    u33.h(obj, iK & 1048575, iW2);
                                    y23Var2.t(iW, obj);
                                    y23Var = y23Var2;
                                    y23Var3 = y23Var;
                                    igVar2 = igVar;
                                    objJ2 = obj2;
                                    break;
                                case 13:
                                    obj2 = objJ2;
                                    igVar = igVar2;
                                    y23Var2 = y23Var3;
                                    n9Var.r(5);
                                    u33.h(obj, iK & 1048575, r13Var.x());
                                    y23Var2.t(iW, obj);
                                    y23Var = y23Var2;
                                    y23Var3 = y23Var;
                                    igVar2 = igVar;
                                    objJ2 = obj2;
                                    break;
                                case 14:
                                    obj2 = objJ2;
                                    igVar = igVar2;
                                    y23Var2 = y23Var3;
                                    n9Var.r(1);
                                    u33.j(obj, iK & 1048575, r13Var.y());
                                    y23Var2.t(iW, obj);
                                    y23Var = y23Var2;
                                    y23Var3 = y23Var;
                                    igVar2 = igVar;
                                    objJ2 = obj2;
                                    break;
                                case 15:
                                    obj2 = objJ2;
                                    igVar = igVar2;
                                    y23Var2 = y23Var3;
                                    n9Var.r(0);
                                    u33.h(obj, iK & 1048575, r13Var.z());
                                    y23Var2.t(iW, obj);
                                    y23Var = y23Var2;
                                    y23Var3 = y23Var;
                                    igVar2 = igVar;
                                    objJ2 = obj2;
                                    break;
                                case 16:
                                    obj2 = objJ2;
                                    igVar = igVar2;
                                    y23Var2 = y23Var3;
                                    n9Var.r(0);
                                    u33.j(obj, iK & 1048575, r13Var.A());
                                    y23Var2.t(iW, obj);
                                    y23Var = y23Var2;
                                    y23Var3 = y23Var;
                                    igVar2 = igVar;
                                    objJ2 = obj2;
                                    break;
                                case 17:
                                    obj2 = objJ2;
                                    igVar = igVar2;
                                    y23Var2 = y23Var3;
                                    obj3 = obj;
                                    try {
                                        f13 f13Var2 = (f13) y23Var2.G(iW, obj3);
                                        j33 j33VarD2 = y23Var2.D(iW);
                                        n9Var.r(3);
                                        n9Var.t(f13Var2, j33VarD2, v13Var);
                                        y23Var2.H(obj3, iW, f13Var2);
                                        y23Var = y23Var2;
                                        y23Var3 = y23Var;
                                        igVar2 = igVar;
                                        objJ2 = obj2;
                                    } catch (n23 unused) {
                                        y23Var = y23Var2;
                                        objJ2 = obj2;
                                        if (objJ2 == null) {
                                            try {
                                                igVar.getClass();
                                                objJ2 = ig.j(obj3);
                                            } catch (Throwable th2) {
                                                th = th2;
                                                igVar2 = igVar;
                                                objK = objJ2;
                                                while (i2 < i) {
                                                    objK = K(obj, iArr[i2], objK, igVar2, obj);
                                                    i2++;
                                                }
                                                if (objK != null) {
                                                    igVar2.getClass();
                                                    ((d23) obj).zzt = (p33) objK;
                                                }
                                                throw th;
                                            }
                                        }
                                        igVar.getClass();
                                        if (!ig.k(0, n9Var, objJ2)) {
                                            objK2 = objJ2;
                                            while (i2 < i) {
                                                objK2 = y23Var.K(obj3, iArr[i2], objK2, igVar, obj);
                                                i2++;
                                                y23Var = this;
                                                obj3 = obj;
                                            }
                                            igVar2 = igVar;
                                            if (objK2 != null) {
                                                igVar2.getClass();
                                                ((d23) obj).zzt = (p33) objK2;
                                            }
                                        }
                                        y23Var3 = this;
                                        igVar2 = igVar;
                                    }
                                    break;
                                case 18:
                                    y23Var = y23Var3;
                                    obj2 = objJ2;
                                    igVar = igVar2;
                                    n9Var.A(et2.f(iK & 1048575, obj));
                                    y23Var3 = y23Var;
                                    igVar2 = igVar;
                                    objJ2 = obj2;
                                    break;
                                case 19:
                                    y23Var = y23Var3;
                                    obj2 = objJ2;
                                    igVar = igVar2;
                                    n9Var.B(et2.f(iK & 1048575, obj));
                                    y23Var3 = y23Var;
                                    igVar2 = igVar;
                                    objJ2 = obj2;
                                    break;
                                case 20:
                                    y23Var = y23Var3;
                                    obj2 = objJ2;
                                    igVar = igVar2;
                                    n9Var.b(et2.f(iK & 1048575, obj));
                                    y23Var3 = y23Var;
                                    igVar2 = igVar;
                                    objJ2 = obj2;
                                    break;
                                case zw0.zzm /* 21 */:
                                    y23Var = y23Var3;
                                    obj2 = objJ2;
                                    igVar = igVar2;
                                    n9Var.C(et2.f(iK & 1048575, obj));
                                    y23Var3 = y23Var;
                                    igVar2 = igVar;
                                    objJ2 = obj2;
                                    break;
                                case 22:
                                    y23Var = y23Var3;
                                    obj2 = objJ2;
                                    igVar = igVar2;
                                    n9Var.c(et2.f(iK & 1048575, obj));
                                    y23Var3 = y23Var;
                                    igVar2 = igVar;
                                    objJ2 = obj2;
                                    break;
                                case 23:
                                    y23Var = y23Var3;
                                    obj2 = objJ2;
                                    igVar = igVar2;
                                    n9Var.d(et2.f(iK & 1048575, obj));
                                    y23Var3 = y23Var;
                                    igVar2 = igVar;
                                    objJ2 = obj2;
                                    break;
                                case 24:
                                    y23Var = y23Var3;
                                    obj2 = objJ2;
                                    igVar = igVar2;
                                    n9Var.e(et2.f(iK & 1048575, obj));
                                    y23Var3 = y23Var;
                                    igVar2 = igVar;
                                    objJ2 = obj2;
                                    break;
                                case 25:
                                    y23Var = y23Var3;
                                    obj2 = objJ2;
                                    igVar = igVar2;
                                    n9Var.f(et2.f(iK & 1048575, obj));
                                    y23Var3 = y23Var;
                                    igVar2 = igVar;
                                    objJ2 = obj2;
                                    break;
                                case 26:
                                    y23Var = y23Var3;
                                    obj2 = objJ2;
                                    igVar = igVar2;
                                    if ((536870912 & iK) != 0) {
                                        n9Var.g(et2.f(iK & 1048575, obj), true);
                                    } else {
                                        n9Var.g(et2.f(iK & 1048575, obj), false);
                                    }
                                    y23Var3 = y23Var;
                                    igVar2 = igVar;
                                    objJ2 = obj2;
                                    break;
                                case 27:
                                    y23Var = y23Var3;
                                    obj2 = objJ2;
                                    igVar = igVar2;
                                    n9Var.h(et2.f(iK & 1048575, obj), y23Var.D(iW), v13Var);
                                    y23Var3 = y23Var;
                                    igVar2 = igVar;
                                    objJ2 = obj2;
                                    break;
                                case 28:
                                    y23Var = y23Var3;
                                    obj2 = objJ2;
                                    igVar = igVar2;
                                    n9Var.j(et2.f(iK & 1048575, obj));
                                    y23Var3 = y23Var;
                                    igVar2 = igVar;
                                    objJ2 = obj2;
                                    break;
                                case 29:
                                    y23Var = y23Var3;
                                    obj2 = objJ2;
                                    igVar = igVar2;
                                    obj3 = obj;
                                    try {
                                        try {
                                            n9Var.k(et2.f(iK & 1048575, obj3));
                                            y23Var3 = y23Var;
                                            igVar2 = igVar;
                                            objJ2 = obj2;
                                        } catch (n23 unused2) {
                                            objJ2 = obj2;
                                            if (objJ2 == null) {
                                                igVar.getClass();
                                                objJ2 = ig.j(obj3);
                                            }
                                            igVar.getClass();
                                            if (!ig.k(0, n9Var, objJ2)) {
                                                objK2 = objJ2;
                                                while (i2 < i) {
                                                    objK2 = y23Var.K(obj3, iArr[i2], objK2, igVar, obj);
                                                    i2++;
                                                    y23Var = this;
                                                    obj3 = obj;
                                                }
                                                igVar2 = igVar;
                                                if (objK2 != null) {
                                                    igVar2.getClass();
                                                    ((d23) obj).zzt = (p33) objK2;
                                                }
                                            }
                                            y23Var3 = this;
                                            igVar2 = igVar;
                                        }
                                    } catch (Throwable th3) {
                                        th = th3;
                                        igVar2 = igVar;
                                        objJ2 = obj2;
                                        objK = objJ2;
                                        while (i2 < i) {
                                            objK = K(obj, iArr[i2], objK, igVar2, obj);
                                            i2++;
                                        }
                                        if (objK != null) {
                                            igVar2.getClass();
                                            ((d23) obj).zzt = (p33) objK;
                                        }
                                        throw th;
                                    }
                                    break;
                                case 30:
                                    y23Var = y23Var3;
                                    igVar = igVar2;
                                    obj3 = obj;
                                    Object obj5 = objJ2;
                                    try {
                                        l23 l23VarF = et2.f(iK & 1048575, obj3);
                                        n9Var.l(l23VarF);
                                        try {
                                            objJ2 = k33.e(obj3, iY, l23VarF, y23Var.F(iW), obj5, igVar);
                                            igVar = igVar;
                                            y23Var3 = y23Var;
                                        } catch (Throwable th4) {
                                            th = th4;
                                            obj2 = obj5;
                                            igVar = igVar;
                                            igVar2 = igVar;
                                            objJ2 = obj2;
                                            objK = objJ2;
                                            while (i2 < i) {
                                                objK = K(obj, iArr[i2], objK, igVar2, obj);
                                                i2++;
                                            }
                                            if (objK != null) {
                                                igVar2.getClass();
                                                ((d23) obj).zzt = (p33) objK;
                                            }
                                            throw th;
                                        }
                                    } catch (n23 unused3) {
                                        obj2 = obj5;
                                        objJ2 = obj2;
                                        if (objJ2 == null) {
                                            igVar.getClass();
                                            objJ2 = ig.j(obj3);
                                        }
                                        igVar.getClass();
                                        if (!ig.k(0, n9Var, objJ2)) {
                                            objK2 = objJ2;
                                            while (i2 < i) {
                                                objK2 = y23Var.K(obj3, iArr[i2], objK2, igVar, obj);
                                                i2++;
                                                y23Var = this;
                                                obj3 = obj;
                                            }
                                            igVar2 = igVar;
                                            if (objK2 != null) {
                                                igVar2.getClass();
                                                ((d23) obj).zzt = (p33) objK2;
                                            }
                                        }
                                        y23Var3 = this;
                                        break;
                                    } catch (Throwable th5) {
                                        th = th5;
                                        obj2 = obj5;
                                    }
                                    igVar2 = igVar;
                                    break;
                                case 31:
                                    y23Var = y23Var3;
                                    n9Var.m(et2.f(iK & 1048575, obj));
                                    obj2 = objJ2;
                                    igVar = igVar2;
                                    y23Var3 = y23Var;
                                    igVar2 = igVar;
                                    objJ2 = obj2;
                                    break;
                                case 32:
                                    y23Var = y23Var3;
                                    n9Var.n(et2.f(iK & 1048575, obj));
                                    obj2 = objJ2;
                                    igVar = igVar2;
                                    y23Var3 = y23Var;
                                    igVar2 = igVar;
                                    objJ2 = obj2;
                                    break;
                                case 33:
                                    y23Var = y23Var3;
                                    n9Var.o(et2.f(iK & 1048575, obj));
                                    obj2 = objJ2;
                                    igVar = igVar2;
                                    y23Var3 = y23Var;
                                    igVar2 = igVar;
                                    objJ2 = obj2;
                                    break;
                                case 34:
                                    y23Var = y23Var3;
                                    n9Var.p(et2.f(iK & 1048575, obj));
                                    obj2 = objJ2;
                                    igVar = igVar2;
                                    y23Var3 = y23Var;
                                    igVar2 = igVar;
                                    objJ2 = obj2;
                                    break;
                                case 35:
                                    y23Var = y23Var3;
                                    n9Var.A(et2.f(iK & 1048575, obj));
                                    obj2 = objJ2;
                                    igVar = igVar2;
                                    y23Var3 = y23Var;
                                    igVar2 = igVar;
                                    objJ2 = obj2;
                                    break;
                                case 36:
                                    y23Var = y23Var3;
                                    n9Var.B(et2.f(iK & 1048575, obj));
                                    obj2 = objJ2;
                                    igVar = igVar2;
                                    y23Var3 = y23Var;
                                    igVar2 = igVar;
                                    objJ2 = obj2;
                                    break;
                                case 37:
                                    y23Var = y23Var3;
                                    n9Var.b(et2.f(iK & 1048575, obj));
                                    obj2 = objJ2;
                                    igVar = igVar2;
                                    y23Var3 = y23Var;
                                    igVar2 = igVar;
                                    objJ2 = obj2;
                                    break;
                                case 38:
                                    y23Var = y23Var3;
                                    n9Var.C(et2.f(iK & 1048575, obj));
                                    obj2 = objJ2;
                                    igVar = igVar2;
                                    y23Var3 = y23Var;
                                    igVar2 = igVar;
                                    objJ2 = obj2;
                                    break;
                                case 39:
                                    y23Var = y23Var3;
                                    n9Var.c(et2.f(iK & 1048575, obj));
                                    obj2 = objJ2;
                                    igVar = igVar2;
                                    y23Var3 = y23Var;
                                    igVar2 = igVar;
                                    objJ2 = obj2;
                                    break;
                                case 40:
                                    y23Var = y23Var3;
                                    n9Var.d(et2.f(iK & 1048575, obj));
                                    obj2 = objJ2;
                                    igVar = igVar2;
                                    y23Var3 = y23Var;
                                    igVar2 = igVar;
                                    objJ2 = obj2;
                                    break;
                                case 41:
                                    y23Var = y23Var3;
                                    n9Var.e(et2.f(iK & 1048575, obj));
                                    obj2 = objJ2;
                                    igVar = igVar2;
                                    y23Var3 = y23Var;
                                    igVar2 = igVar;
                                    objJ2 = obj2;
                                    break;
                                case 42:
                                    y23Var = y23Var3;
                                    n9Var.f(et2.f(iK & 1048575, obj));
                                    obj2 = objJ2;
                                    igVar = igVar2;
                                    y23Var3 = y23Var;
                                    igVar2 = igVar;
                                    objJ2 = obj2;
                                    break;
                                case 43:
                                    y23Var = y23Var3;
                                    obj3 = obj;
                                    try {
                                        n9Var.k(et2.f(iK & 1048575, obj3));
                                        obj2 = objJ2;
                                        igVar = igVar2;
                                        y23Var3 = y23Var;
                                        igVar2 = igVar;
                                        objJ2 = obj2;
                                    } catch (n23 unused4) {
                                        obj2 = objJ2;
                                        igVar = igVar2;
                                        objJ2 = obj2;
                                        if (objJ2 == null) {
                                            igVar.getClass();
                                            objJ2 = ig.j(obj3);
                                        }
                                        igVar.getClass();
                                        if (!ig.k(0, n9Var, objJ2)) {
                                            objK2 = objJ2;
                                            while (i2 < i) {
                                                objK2 = y23Var.K(obj3, iArr[i2], objK2, igVar, obj);
                                                i2++;
                                                y23Var = this;
                                                obj3 = obj;
                                            }
                                            igVar2 = igVar;
                                            if (objK2 != null) {
                                                igVar2.getClass();
                                                ((d23) obj).zzt = (p33) objK2;
                                            }
                                        }
                                        y23Var3 = this;
                                        igVar2 = igVar;
                                    }
                                    break;
                                case 44:
                                    igVar = igVar2;
                                    try {
                                        l23 l23VarF2 = et2.f(iK & 1048575, obj);
                                        n9Var.l(l23VarF2);
                                        g23 g23VarF2 = y23Var3.F(iW);
                                        y23Var = y23Var3;
                                        obj3 = obj;
                                        Object obj6 = objJ2;
                                        try {
                                            try {
                                                objJ2 = k33.e(obj3, iY, l23VarF2, g23VarF2, obj6, igVar);
                                                igVar2 = igVar;
                                                y23Var3 = y23Var;
                                            } catch (Throwable th6) {
                                                th = th6;
                                                objJ2 = obj6;
                                                igVar2 = igVar;
                                                obj2 = objJ2;
                                                objJ2 = obj2;
                                                objK = objJ2;
                                                while (i2 < i) {
                                                    objK = K(obj, iArr[i2], objK, igVar2, obj);
                                                    i2++;
                                                }
                                                if (objK != null) {
                                                    igVar2.getClass();
                                                    ((d23) obj).zzt = (p33) objK;
                                                }
                                                throw th;
                                            }
                                        } catch (n23 unused5) {
                                            obj2 = obj6;
                                            igVar = igVar;
                                            objJ2 = obj2;
                                            if (objJ2 == null) {
                                                igVar.getClass();
                                                objJ2 = ig.j(obj3);
                                            }
                                            igVar.getClass();
                                            if (!ig.k(0, n9Var, objJ2)) {
                                                objK2 = objJ2;
                                                while (i2 < i) {
                                                    objK2 = y23Var.K(obj3, iArr[i2], objK2, igVar, obj);
                                                    i2++;
                                                    y23Var = this;
                                                    obj3 = obj;
                                                }
                                                igVar2 = igVar;
                                                if (objK2 != null) {
                                                    igVar2.getClass();
                                                    ((d23) obj).zzt = (p33) objK2;
                                                }
                                            }
                                            y23Var3 = this;
                                            igVar2 = igVar;
                                            break;
                                        }
                                    } catch (n23 unused6) {
                                        y23Var = y23Var3;
                                        obj3 = obj;
                                        obj2 = objJ2;
                                    } catch (Throwable th7) {
                                        th = th7;
                                        igVar2 = igVar;
                                    }
                                    break;
                                case 45:
                                    igVar = igVar2;
                                    obj4 = obj;
                                    n9Var.m(et2.f(iK & 1048575, obj4));
                                    y23Var = y23Var3;
                                    obj2 = objJ2;
                                    y23Var3 = y23Var;
                                    igVar2 = igVar;
                                    objJ2 = obj2;
                                    break;
                                case 46:
                                    igVar = igVar2;
                                    obj4 = obj;
                                    n9Var.n(et2.f(iK & 1048575, obj4));
                                    y23Var = y23Var3;
                                    obj2 = objJ2;
                                    y23Var3 = y23Var;
                                    igVar2 = igVar;
                                    objJ2 = obj2;
                                    break;
                                case 47:
                                    igVar = igVar2;
                                    obj4 = obj;
                                    n9Var.o(et2.f(iK & 1048575, obj4));
                                    y23Var = y23Var3;
                                    obj2 = objJ2;
                                    y23Var3 = y23Var;
                                    igVar2 = igVar;
                                    objJ2 = obj2;
                                    break;
                                case 48:
                                    igVar = igVar2;
                                    obj4 = obj;
                                    n9Var.p(et2.f(iK & 1048575, obj4));
                                    y23Var = y23Var3;
                                    obj2 = objJ2;
                                    y23Var3 = y23Var;
                                    igVar2 = igVar;
                                    objJ2 = obj2;
                                    break;
                                case 49:
                                    igVar = igVar2;
                                    obj4 = obj;
                                    n9Var.i(et2.f(iK & 1048575, obj4), y23Var3.D(iW), v13Var);
                                    y23Var = y23Var3;
                                    obj2 = objJ2;
                                    y23Var3 = y23Var;
                                    igVar2 = igVar;
                                    objJ2 = obj2;
                                    break;
                                case 50:
                                    igVar = igVar2;
                                    obj4 = obj;
                                    Object objE = y23Var3.E(iW);
                                    long jK = y23Var3.k(iW) & 1048575;
                                    Object objK3 = u33.k(jK, obj4);
                                    if (objK3 == null) {
                                        objK3 = u23.g.a();
                                        u33.l(obj4, jK, objK3);
                                    } else if (!((u23) objK3).f) {
                                        Object objA = u23.g.a();
                                        et2.g(objA, objK3);
                                        u33.l(obj4, jK, objA);
                                        objK3 = objA;
                                    }
                                    n9Var.q((u23) objK3, ((t23) objE).b(), v13Var);
                                    y23Var = y23Var3;
                                    obj2 = objJ2;
                                    y23Var3 = y23Var;
                                    igVar2 = igVar;
                                    objJ2 = obj2;
                                    break;
                                case 51:
                                    igVar = igVar2;
                                    obj4 = obj;
                                    n9Var.r(1);
                                    u33.l(obj4, iK & 1048575, Double.valueOf(r13Var.k()));
                                    y23Var3.v(iY, iW, obj4);
                                    y23Var = y23Var3;
                                    obj2 = objJ2;
                                    y23Var3 = y23Var;
                                    igVar2 = igVar;
                                    objJ2 = obj2;
                                    break;
                                case 52:
                                    igVar = igVar2;
                                    obj4 = obj;
                                    n9Var.r(5);
                                    u33.l(obj4, iK & 1048575, Float.valueOf(r13Var.l()));
                                    y23Var3.v(iY, iW, obj4);
                                    y23Var = y23Var3;
                                    obj2 = objJ2;
                                    y23Var3 = y23Var;
                                    igVar2 = igVar;
                                    objJ2 = obj2;
                                    break;
                                case 53:
                                    igVar = igVar2;
                                    obj4 = obj;
                                    n9Var.r(0);
                                    u33.l(obj4, iK & 1048575, Long.valueOf(r13Var.n()));
                                    y23Var3.v(iY, iW, obj4);
                                    y23Var = y23Var3;
                                    obj2 = objJ2;
                                    y23Var3 = y23Var;
                                    igVar2 = igVar;
                                    objJ2 = obj2;
                                    break;
                                case 54:
                                    igVar = igVar2;
                                    obj4 = obj;
                                    n9Var.r(0);
                                    u33.l(obj4, iK & 1048575, Long.valueOf(r13Var.m()));
                                    y23Var3.v(iY, iW, obj4);
                                    y23Var = y23Var3;
                                    obj2 = objJ2;
                                    y23Var3 = y23Var;
                                    igVar2 = igVar;
                                    objJ2 = obj2;
                                    break;
                                case 55:
                                    igVar = igVar2;
                                    obj4 = obj;
                                    n9Var.r(0);
                                    u33.l(obj4, iK & 1048575, Integer.valueOf(r13Var.o()));
                                    y23Var3.v(iY, iW, obj4);
                                    y23Var = y23Var3;
                                    obj2 = objJ2;
                                    y23Var3 = y23Var;
                                    igVar2 = igVar;
                                    objJ2 = obj2;
                                    break;
                                case 56:
                                    igVar = igVar2;
                                    obj4 = obj;
                                    n9Var.r(1);
                                    u33.l(obj4, iK & 1048575, Long.valueOf(r13Var.p()));
                                    y23Var3.v(iY, iW, obj4);
                                    y23Var = y23Var3;
                                    obj2 = objJ2;
                                    y23Var3 = y23Var;
                                    igVar2 = igVar;
                                    objJ2 = obj2;
                                    break;
                                case 57:
                                    igVar = igVar2;
                                    obj4 = obj;
                                    n9Var.r(5);
                                    u33.l(obj4, iK & 1048575, Integer.valueOf(r13Var.q()));
                                    y23Var3.v(iY, iW, obj4);
                                    y23Var = y23Var3;
                                    obj2 = objJ2;
                                    y23Var3 = y23Var;
                                    igVar2 = igVar;
                                    objJ2 = obj2;
                                    break;
                                case 58:
                                    igVar = igVar2;
                                    obj4 = obj;
                                    n9Var.r(0);
                                    u33.l(obj4, iK & 1048575, Boolean.valueOf(r13Var.r()));
                                    y23Var3.v(iY, iW, obj4);
                                    y23Var = y23Var3;
                                    obj2 = objJ2;
                                    y23Var3 = y23Var;
                                    igVar2 = igVar;
                                    objJ2 = obj2;
                                    break;
                                case 59:
                                    igVar = igVar2;
                                    obj4 = obj;
                                    y23Var3.L(iK, n9Var, obj4);
                                    y23Var3.v(iY, iW, obj4);
                                    y23Var = y23Var3;
                                    obj2 = objJ2;
                                    y23Var3 = y23Var;
                                    igVar2 = igVar;
                                    objJ2 = obj2;
                                    break;
                                case 60:
                                    igVar = igVar2;
                                    obj4 = obj;
                                    f13 f13Var3 = (f13) y23Var3.I(iY, iW, obj4);
                                    j33 j33VarD3 = y23Var3.D(iW);
                                    n9Var.r(2);
                                    n9Var.s(f13Var3, j33VarD3, v13Var);
                                    y23Var3.J(obj4, iY, f13Var3, iW);
                                    y23Var = y23Var3;
                                    obj2 = objJ2;
                                    y23Var3 = y23Var;
                                    igVar2 = igVar;
                                    objJ2 = obj2;
                                    break;
                                case 61:
                                    igVar = igVar2;
                                    obj4 = obj;
                                    u33.l(obj4, iK & 1048575, n9Var.z());
                                    y23Var3.v(iY, iW, obj4);
                                    y23Var = y23Var3;
                                    obj2 = objJ2;
                                    y23Var3 = y23Var;
                                    igVar2 = igVar;
                                    objJ2 = obj2;
                                    break;
                                case 62:
                                    igVar = igVar2;
                                    obj4 = obj;
                                    n9Var.r(0);
                                    u33.l(obj4, iK & 1048575, Integer.valueOf(r13Var.v()));
                                    y23Var3.v(iY, iW, obj4);
                                    y23Var = y23Var3;
                                    obj2 = objJ2;
                                    y23Var3 = y23Var;
                                    igVar2 = igVar;
                                    objJ2 = obj2;
                                    break;
                                case 63:
                                    igVar = igVar2;
                                    obj4 = obj;
                                    n9Var.r(0);
                                    int iW3 = r13Var.w();
                                    g23 g23VarF3 = y23Var3.F(iW);
                                    if (g23VarF3 != null && !g23VarF3.a(iW3)) {
                                        ig igVar4 = k33.a;
                                        if (objJ2 == null) {
                                            igVar.getClass();
                                            objJ = ig.j(obj4);
                                        } else {
                                            objJ = objJ2;
                                        }
                                        igVar.getClass();
                                        ((p33) objJ).d(iY << 3, Long.valueOf(iW3));
                                        objJ2 = objJ;
                                        igVar2 = igVar;
                                    }
                                    u33.l(obj4, iK & 1048575, Integer.valueOf(iW3));
                                    y23Var3.v(iY, iW, obj4);
                                    y23Var = y23Var3;
                                    obj2 = objJ2;
                                    y23Var3 = y23Var;
                                    igVar2 = igVar;
                                    objJ2 = obj2;
                                    break;
                                case 64:
                                    igVar = igVar2;
                                    obj4 = obj;
                                    n9Var.r(5);
                                    u33.l(obj4, iK & 1048575, Integer.valueOf(r13Var.x()));
                                    y23Var3.v(iY, iW, obj4);
                                    y23Var = y23Var3;
                                    obj2 = objJ2;
                                    y23Var3 = y23Var;
                                    igVar2 = igVar;
                                    objJ2 = obj2;
                                    break;
                                case 65:
                                    igVar = igVar2;
                                    obj4 = obj;
                                    n9Var.r(1);
                                    u33.l(obj4, iK & 1048575, Long.valueOf(r13Var.y()));
                                    y23Var3.v(iY, iW, obj4);
                                    y23Var = y23Var3;
                                    obj2 = objJ2;
                                    y23Var3 = y23Var;
                                    igVar2 = igVar;
                                    objJ2 = obj2;
                                    break;
                                case 66:
                                    igVar = igVar2;
                                    obj4 = obj;
                                    n9Var.r(0);
                                    u33.l(obj4, iK & 1048575, Integer.valueOf(r13Var.z()));
                                    y23Var3.v(iY, iW, obj4);
                                    y23Var = y23Var3;
                                    obj2 = objJ2;
                                    y23Var3 = y23Var;
                                    igVar2 = igVar;
                                    objJ2 = obj2;
                                    break;
                                case 67:
                                    igVar = igVar2;
                                    obj4 = obj;
                                    n9Var.r(0);
                                    u33.l(obj4, iK & 1048575, Long.valueOf(r13Var.A()));
                                    y23Var3.v(iY, iW, obj4);
                                    y23Var = y23Var3;
                                    obj2 = objJ2;
                                    y23Var3 = y23Var;
                                    igVar2 = igVar;
                                    objJ2 = obj2;
                                    break;
                                case 68:
                                    igVar = igVar2;
                                    obj4 = obj;
                                    try {
                                        f13 f13Var4 = (f13) y23Var3.I(iY, iW, obj4);
                                        j33 j33VarD4 = y23Var3.D(iW);
                                        n9Var.r(3);
                                        n9Var.t(f13Var4, j33VarD4, v13Var);
                                        y23Var3.J(obj4, iY, f13Var4, iW);
                                        y23Var = y23Var3;
                                        obj2 = objJ2;
                                        y23Var3 = y23Var;
                                        igVar2 = igVar;
                                        objJ2 = obj2;
                                    } catch (n23 unused7) {
                                        y23Var = y23Var3;
                                        obj2 = objJ2;
                                        obj3 = obj4;
                                        objJ2 = obj2;
                                        if (objJ2 == null) {
                                            igVar.getClass();
                                            objJ2 = ig.j(obj3);
                                        }
                                        igVar.getClass();
                                        if (!ig.k(0, n9Var, objJ2)) {
                                            objK2 = objJ2;
                                            while (i2 < i) {
                                                objK2 = y23Var.K(obj3, iArr[i2], objK2, igVar, obj);
                                                i2++;
                                                y23Var = this;
                                                obj3 = obj;
                                            }
                                            igVar2 = igVar;
                                            if (objK2 != null) {
                                                igVar2.getClass();
                                                ((d23) obj).zzt = (p33) objK2;
                                            }
                                        }
                                        y23Var3 = this;
                                        igVar2 = igVar;
                                    } catch (Throwable th8) {
                                        th = th8;
                                        obj2 = objJ2;
                                        igVar2 = igVar;
                                        objJ2 = obj2;
                                        objK = objJ2;
                                        while (i2 < i) {
                                            objK = K(obj, iArr[i2], objK, igVar2, obj);
                                            i2++;
                                        }
                                        if (objK != null) {
                                            igVar2.getClass();
                                            ((d23) obj).zzt = (p33) objK;
                                        }
                                        throw th;
                                    }
                                    break;
                                default:
                                    if (objJ2 == null) {
                                        igVar2.getClass();
                                        objJ2 = ig.j(obj);
                                    }
                                    try {
                                        igVar2.getClass();
                                        if (ig.k(0, n9Var, objJ2)) {
                                            igVar = igVar2;
                                            igVar2 = igVar;
                                        } else {
                                            objK2 = objJ2;
                                            while (i2 < i) {
                                                objK2 = y23Var3.K(obj, iArr[i2], objK2, igVar2, obj);
                                                i2++;
                                                igVar2 = igVar2;
                                            }
                                            igVar = igVar2;
                                            igVar2 = igVar;
                                        }
                                    } catch (n23 unused8) {
                                        igVar = igVar2;
                                        y23Var = y23Var3;
                                        obj3 = obj;
                                        if (objJ2 == null) {
                                            igVar.getClass();
                                            objJ2 = ig.j(obj3);
                                        }
                                        igVar.getClass();
                                        if (!ig.k(0, n9Var, objJ2)) {
                                            objK2 = objJ2;
                                            while (i2 < i) {
                                                objK2 = y23Var.K(obj3, iArr[i2], objK2, igVar, obj);
                                                i2++;
                                                y23Var = this;
                                                obj3 = obj;
                                            }
                                            igVar2 = igVar;
                                            if (objK2 != null) {
                                                igVar2.getClass();
                                                ((d23) obj).zzt = (p33) objK2;
                                            }
                                        }
                                        y23Var3 = this;
                                    } catch (Throwable th9) {
                                        th = th9;
                                        igVar = igVar2;
                                        igVar2 = igVar;
                                        objK = objJ2;
                                        while (i2 < i) {
                                            objK = K(obj, iArr[i2], objK, igVar2, obj);
                                            i2++;
                                        }
                                        if (objK != null) {
                                            igVar2.getClass();
                                            ((d23) obj).zzt = (p33) objK;
                                        }
                                        throw th;
                                    }
                                    break;
                            }
                        } catch (Throwable th10) {
                            th = th10;
                            obj2 = objJ2;
                        }
                    } catch (n23 unused9) {
                        y23Var = y23Var3;
                        obj2 = objJ2;
                        igVar = igVar2;
                        obj3 = obj;
                    }
                } else if (iY == Integer.MAX_VALUE) {
                    objK2 = objJ2;
                    while (i2 < i) {
                        objK2 = y23Var3.K(obj, iArr[i2], objK2, igVar2, obj);
                        i2++;
                        y23Var3 = this;
                    }
                } else {
                    if (objJ2 == null) {
                        igVar2.getClass();
                        objJ2 = ig.j(obj);
                    }
                    try {
                        igVar2.getClass();
                        if (ig.k(0, n9Var, objJ2)) {
                            y23Var3 = this;
                        } else {
                            objK2 = objJ2;
                            while (i2 < i) {
                                objK2 = K(obj, iArr[i2], objK2, igVar2, obj);
                                i2++;
                            }
                        }
                    } catch (Throwable th11) {
                        th = th11;
                        objK = objJ2;
                        while (i2 < i) {
                            objK = K(obj, iArr[i2], objK, igVar2, obj);
                            i2++;
                        }
                        if (objK != null) {
                            igVar2.getClass();
                            ((d23) obj).zzt = (p33) objK;
                        }
                        throw th;
                    }
                }
            } catch (Throwable th12) {
                th = th12;
            }
        }
        if (objK2 != null) {
            igVar2.getClass();
            ((d23) obj).zzt = (p33) objK2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0074  */
    /* JADX WARN: Code duplicated, block: B:30:0x007a  */
    /* JADX WARN: Code duplicated, block: B:44:0x0087 A[SYNTHETIC] */
    @Override // defpackage.j33
    public final void h(Object obj) {
        if (!m(obj)) {
            return;
        }
        if (obj instanceof d23) {
            d23 d23Var = (d23) obj;
            d23Var.g(Integer.MAX_VALUE);
            d23Var.zzq = 0;
            d23Var.i();
        }
        int i = 0;
        while (true) {
            int[] iArr = this.a;
            if (i >= iArr.length) {
                this.j.getClass();
                p33 p33Var = ((d23) obj).zzt;
                if (p33Var.e) {
                    p33Var.e = false;
                    return;
                }
                return;
            }
            int iK = k(i);
            int i2 = 1048575 & iK;
            int iL = l(iK);
            long j = i2;
            if (iL != 9) {
                if (iL != 60 && iL != 68) {
                    switch (iL) {
                        case 17:
                            if (s(i, obj)) {
                                D(i).h(l.getObject(obj, j));
                            }
                            break;
                        case 18:
                        case 19:
                        case 20:
                        case zw0.zzm /* 21 */:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                        case 26:
                        case 27:
                        case 28:
                        case 29:
                        case 30:
                        case 31:
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case 37:
                        case 38:
                        case 39:
                        case 40:
                        case 41:
                        case 42:
                        case 43:
                        case 44:
                        case 45:
                        case 46:
                        case 47:
                        case 48:
                        case 49:
                            g13 g13Var = (g13) ((l23) u33.k(j, obj));
                            if (g13Var.f) {
                                g13Var.f = false;
                            }
                            break;
                        case 50:
                            Unsafe unsafe = l;
                            Object object = unsafe.getObject(obj, j);
                            if (object != null) {
                                ((u23) object).f = false;
                                unsafe.putObject(obj, j, object);
                            }
                            break;
                    }
                } else if (u(iArr[i], i, obj)) {
                    D(i).h(l.getObject(obj, j));
                }
            } else if (s(i, obj)) {
                D(i).h(l.getObject(obj, j));
            }
            i += 3;
        }
    }

    @Override // defpackage.j33
    public final void i(Object obj, byte[] bArr, int i, int i2, i13 i13Var) {
        y(obj, bArr, i, i2, 0, i13Var);
    }

    @Override // defpackage.j33
    public final boolean j(d23 d23Var, d23 d23Var2) {
        boolean zC;
        int i = 0;
        while (true) {
            int[] iArr = this.a;
            if (i < iArr.length) {
                int iK = k(i);
                long j = iK & 1048575;
                switch (l(iK)) {
                    case 0:
                        if (q(d23Var, d23Var2, i)) {
                            t33 t33Var = u33.c;
                            if (Double.doubleToLongBits(t33Var.v1(j, d23Var)) == Double.doubleToLongBits(t33Var.v1(j, d23Var2))) {
                                continue;
                                i += 3;
                            }
                        }
                        break;
                    case 1:
                        if (q(d23Var, d23Var2, i)) {
                            t33 t33Var2 = u33.c;
                            if (Float.floatToIntBits(t33Var2.t1(j, d23Var)) == Float.floatToIntBits(t33Var2.t1(j, d23Var2))) {
                                continue;
                                i += 3;
                            }
                        }
                        break;
                    case 2:
                        if (q(d23Var, d23Var2, i) && u33.i(j, d23Var) == u33.i(j, d23Var2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 3:
                        if (q(d23Var, d23Var2, i) && u33.i(j, d23Var) == u33.i(j, d23Var2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 4:
                        if (q(d23Var, d23Var2, i) && u33.g(j, d23Var) == u33.g(j, d23Var2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 5:
                        if (q(d23Var, d23Var2, i) && u33.i(j, d23Var) == u33.i(j, d23Var2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 6:
                        if (q(d23Var, d23Var2, i) && u33.g(j, d23Var) == u33.g(j, d23Var2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 7:
                        if (q(d23Var, d23Var2, i)) {
                            t33 t33Var3 = u33.c;
                            if (t33Var3.q1(j, d23Var) == t33Var3.q1(j, d23Var2)) {
                                continue;
                                i += 3;
                            }
                        }
                        break;
                    case 8:
                        if (q(d23Var, d23Var2, i) && k33.c(u33.k(j, d23Var), u33.k(j, d23Var2))) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 9:
                        if (q(d23Var, d23Var2, i) && k33.c(u33.k(j, d23Var), u33.k(j, d23Var2))) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 10:
                        if (q(d23Var, d23Var2, i) && k33.c(u33.k(j, d23Var), u33.k(j, d23Var2))) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 11:
                        if (q(d23Var, d23Var2, i) && u33.g(j, d23Var) == u33.g(j, d23Var2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 12:
                        if (q(d23Var, d23Var2, i) && u33.g(j, d23Var) == u33.g(j, d23Var2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 13:
                        if (q(d23Var, d23Var2, i) && u33.g(j, d23Var) == u33.g(j, d23Var2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 14:
                        if (q(d23Var, d23Var2, i) && u33.i(j, d23Var) == u33.i(j, d23Var2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 15:
                        if (q(d23Var, d23Var2, i) && u33.g(j, d23Var) == u33.g(j, d23Var2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 16:
                        if (q(d23Var, d23Var2, i) && u33.i(j, d23Var) == u33.i(j, d23Var2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 17:
                        if (q(d23Var, d23Var2, i) && k33.c(u33.k(j, d23Var), u33.k(j, d23Var2))) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 18:
                    case 19:
                    case 20:
                    case zw0.zzm /* 21 */:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                    case 37:
                    case 38:
                    case 39:
                    case 40:
                    case 41:
                    case 42:
                    case 43:
                    case 44:
                    case 45:
                    case 46:
                    case 47:
                    case 48:
                    case 49:
                        zC = k33.c(u33.k(j, d23Var), u33.k(j, d23Var2));
                        break;
                    case 50:
                        zC = k33.c(u33.k(j, d23Var), u33.k(j, d23Var2));
                        break;
                    case 51:
                    case 52:
                    case 53:
                    case 54:
                    case 55:
                    case 56:
                    case 57:
                    case 58:
                    case 59:
                    case 60:
                    case 61:
                    case 62:
                    case 63:
                    case 64:
                    case 65:
                    case 66:
                    case 67:
                    case 68:
                        long j2 = iArr[i + 2] & 1048575;
                        if (u33.g(j2, d23Var) == u33.g(j2, d23Var2) && k33.c(u33.k(j, d23Var), u33.k(j, d23Var2))) {
                            continue;
                            i += 3;
                        }
                        break;
                    default:
                        continue;
                        i += 3;
                        break;
                }
                if (zC) {
                    i += 3;
                }
            } else if (d23Var.zzt.equals(d23Var2.zzt)) {
                return true;
            }
        }
        return false;
    }

    public final int k(int i) {
        return this.a[i + 1];
    }

    public final boolean q(d23 d23Var, d23 d23Var2, int i) {
        return s(i, d23Var) == s(i, d23Var2);
    }

    public final boolean r(Object obj, int i, int i2, int i3, int i4) {
        if (i2 == 1048575) {
            return s(i, obj);
        }
        return (i3 & i4) != 0;
    }

    public final boolean s(int i, Object obj) {
        int i2 = this.a[i + 2];
        long j = i2 & 1048575;
        if (j == 1048575) {
            int iK = k(i);
            long j2 = iK & 1048575;
            switch (l(iK)) {
                case 0:
                    if (Double.doubleToRawLongBits(u33.c.v1(j2, obj)) == 0) {
                        return false;
                    }
                    break;
                case 1:
                    if (Float.floatToRawIntBits(u33.c.t1(j2, obj)) == 0) {
                        return false;
                    }
                    break;
                case 2:
                    if (u33.i(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 3:
                    if (u33.i(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 4:
                    if (u33.g(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 5:
                    if (u33.i(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 6:
                    if (u33.g(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 7:
                    return u33.c.q1(j2, obj);
                case 8:
                    Object objK = u33.k(j2, obj);
                    if (objK instanceof String) {
                        if (((String) objK).isEmpty()) {
                            return false;
                        }
                    } else {
                        if (!(objK instanceof n13)) {
                            throw new IllegalArgumentException();
                        }
                        if (n13.g.equals(objK)) {
                            return false;
                        }
                    }
                case 9:
                    if (u33.k(j2, obj) == null) {
                        return false;
                    }
                    break;
                case 10:
                    if (n13.g.equals(u33.k(j2, obj))) {
                        return false;
                    }
                    break;
                case 11:
                    if (u33.g(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 12:
                    if (u33.g(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 13:
                    if (u33.g(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 14:
                    if (u33.i(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 15:
                    if (u33.g(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 16:
                    if (u33.i(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 17:
                    if (u33.k(j2, obj) == null) {
                        return false;
                    }
                    break;
                default:
                    throw new IllegalArgumentException();
            }
        } else if (((1 << (i2 >>> 20)) & u33.g(j, obj)) == 0) {
            return false;
        }
        return true;
    }

    public final void t(int i, Object obj) {
        int i2 = this.a[i + 2];
        long j = 1048575 & i2;
        if (j == 1048575) {
            return;
        }
        u33.h(obj, j, (1 << (i2 >>> 20)) | u33.g(j, obj));
    }

    public final boolean u(int i, int i2, Object obj) {
        return u33.g((long) (this.a[i2 + 2] & 1048575), obj) == i;
    }

    public final void v(int i, int i2, Object obj) {
        u33.h(obj, this.a[i2 + 2] & 1048575, i);
    }

    public final int w(int i, int i2) {
        int[] iArr = this.a;
        int length = (iArr.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int i5 = iArr[i4];
            if (i == i5) {
                return i4;
            }
            if (i < i5) {
                length = i3 - 1;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 36441. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    public final int y(java.lang.Object r36, byte[] r37, int r38, int r39, int r40, defpackage.i13 r41) {
        /*
            Method dump skipped, instruction units count: 3644
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y23.y(java.lang.Object, byte[], int, int, int, i13):int");
    }
}
