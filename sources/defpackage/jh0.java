package defpackage;

import android.util.Pair;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public abstract class jh0 {
    public static final byte[] a;

    static {
        String str = qz1.a;
        a = "OpusHead".getBytes(StandardCharsets.UTF_8);
    }

    public static int a(int i) {
        return (i >> 24) & 255;
    }

    /* JADX WARN: Code duplicated, block: B:664:0x0fc0  */
    /* JADX WARN: Code duplicated, block: B:665:0x0fc4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:666:0x0fc6  */
    /* JADX WARN: Code duplicated, block: B:668:0x0fd6  */
    /* JADX WARN: Code duplicated, block: B:669:0x0fe2  */
    /* JADX WARN: Code duplicated, block: B:671:0x0ff6  */
    /* JADX WARN: Code duplicated, block: B:675:0x1023  */
    /* JADX WARN: Code duplicated, block: B:676:0x104d  */
    /* JADX WARN: Code duplicated, block: B:72:0x013d  */
    /* JADX WARN: Code duplicated, block: B:73:0x013f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:74:0x0141  */
    /* JADX WARN: Code duplicated, block: B:75:0x0143 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:76:0x0145  */
    /* JADX WARN: Code duplicated, block: B:77:0x0148  */
    /* JADX WARN: Code duplicated, block: B:80:0x014c A[PHI: r12
  0x014c: PHI (r12v7 int) = (r12v8 int), (r12v3 int) binds: [B:85:0x0157, B:74:0x0141] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:82:0x0150 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:83:0x0152  */
    /* JADX WARN: Code duplicated, block: B:84:0x0155  */
    /* JADX WARN: Code duplicated, block: B:86:0x0159  */
    /* JADX WARN: Code duplicated, block: B:87:0x015c A[DONT_INVERT, PHI: r5 r10 r12
  0x015c: PHI (r5v12 int) = (r5v11 int), (r5v13 int) binds: [B:71:0x013b, B:81:0x014d] A[DONT_GENERATE, DONT_INLINE]
  0x015c: PHI (r10v4 int) = (r10v3 int), (r10v5 int) binds: [B:71:0x013b, B:81:0x014d] A[DONT_GENERATE, DONT_INLINE]
  0x015c: PHI (r12v4 int) = (r12v3 int), (r12v6 int) binds: [B:71:0x013b, B:81:0x014d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:88:0x015e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:91:0x0164 A[ADDED_TO_REGION] */
    public static ArrayList b(i12 i12Var, wd0 wd0Var, long j, va3 va3Var, boolean z, boolean z2, wh2 wh2Var) {
        int i;
        long jT;
        long jP;
        int i2;
        int i3;
        boolean z3;
        long j2;
        long jT2;
        String str;
        ArrayList arrayList;
        int i4;
        i12 i12Var2;
        long[] jArr;
        long[] jArr2;
        de3 de3Var;
        wh0 wh0Var;
        f12 f12Var;
        am0 am0Var;
        am0 am0Var2;
        Pair pairCreate;
        ArrayList arrayList2;
        va3 va3Var2;
        int i5;
        String str2;
        String str3;
        byte[] bArrArray;
        int i6;
        int i7;
        String str4;
        int i8;
        int i9;
        y91 y91Var;
        int i10;
        int i11;
        boolean z4;
        int i12;
        String str5;
        boolean z5;
        qk2 qk2VarF;
        boolean z6;
        boolean z7;
        va3 va3VarA;
        char c;
        qk2 qk2VarI;
        String str6;
        long j3;
        boolean z8;
        wh0 wh0Var2;
        ArrayList arrayList3;
        ArrayList arrayList4 = new ArrayList();
        int i13 = 0;
        while (true) {
            ArrayList arrayList5 = i12Var.e;
            if (i13 >= arrayList5.size()) {
                return arrayList4;
            }
            i12 i12Var3 = (i12) arrayList5.get(i13);
            if (i12Var3.b != 1953653099) {
                arrayList3 = arrayList4;
                i4 = i13;
            } else {
                l12 l12VarB = i12Var.b(1836476516);
                l12VarB.getClass();
                i12 i12VarC = i12Var3.c(1835297121);
                i12VarC.getClass();
                l12 l12VarB2 = i12VarC.b(1751411826);
                l12VarB2.getClass();
                cw1 cw1Var = l12VarB2.c;
                cw1Var.E(16);
                int iB = cw1Var.b();
                if (iB == 1936684398) {
                    i = 1;
                } else if (iB == 1986618469) {
                    i = 2;
                } else if (iB == 1952807028 || iB == 1935832172 || iB == 1937072756 || iB == 1668047728 || iB == 1937072752) {
                    i = 3;
                } else {
                    i = iB == 1835365473 ? 5 : -1;
                }
                if (i == -1) {
                    arrayList = arrayList4;
                    i4 = i13;
                    i12Var2 = i12Var3;
                } else {
                    l12 l12VarB3 = i12Var3.b(1953196132);
                    l12VarB3.getClass();
                    cw1 cw1Var2 = l12VarB3.c;
                    cw1Var2.E(8);
                    int iA = a(cw1Var2.b());
                    cw1Var2.G(iA == 0 ? 8 : 16);
                    int iB2 = cw1Var2.b();
                    cw1Var2.G(4);
                    int i14 = cw1Var2.b;
                    int i15 = 0;
                    while (true) {
                        int i16 = iA == 0 ? 4 : 8;
                        jT = -9223372036854775807L;
                        if (i15 >= i16) {
                            cw1Var2.G(i16);
                        } else {
                            if (cw1Var2.a[i14 + i15] != -1) {
                                jP = iA == 0 ? cw1Var2.P() : cw1Var2.j();
                                if (jP != 0) {
                                    break;
                                }
                                break;
                            }
                            i15++;
                        }
                        jP = -9223372036854775807L;
                        break;
                    }
                    cw1Var2.G(10);
                    int iL = cw1Var2.L();
                    cw1Var2.G(4);
                    int iB3 = cw1Var2.b();
                    int iB4 = cw1Var2.b();
                    cw1Var2.G(4);
                    int iB5 = cw1Var2.b();
                    int iB6 = cw1Var2.b();
                    if (iB3 == 0) {
                        if (iB4 == 65536) {
                            if (iB5 != -65536) {
                                if (iB5 == 65536) {
                                    z8 = iB6 != 0;
                                    iB5 = 65536;
                                }
                                iB4 = 65536;
                            } else {
                                z8 = iB6 != 0;
                            }
                            if (true != z8) {
                                i2 = 90;
                            } else {
                                iB4 = 65536;
                            }
                            i3 = i2;
                        }
                        iB3 = 0;
                        if (iB3 == 0) {
                            if (iB3 != -65536) {
                                i2 = 180;
                                i3 = i2;
                            } else {
                                i2 = 180;
                                i3 = i2;
                            }
                            i3 = 0;
                        } else {
                            if (iB4 == -65536) {
                                if (iB5 != 65536) {
                                    if (iB5 == -65536) {
                                        if (iB6 == 0) {
                                            z3 = false;
                                        } else {
                                            z3 = true;
                                        }
                                        iB5 = -65536;
                                    }
                                    iB4 = -65536;
                                } else if (iB6 == 0) {
                                    z3 = false;
                                } else {
                                    z3 = true;
                                }
                                if (true != z3) {
                                    i2 = 270;
                                } else {
                                    iB4 = -65536;
                                }
                                i3 = i2;
                            }
                            iB3 = 0;
                            if (iB3 != -65536) {
                                i2 = 180;
                                i3 = i2;
                            } else {
                                i2 = 180;
                                i3 = i2;
                            }
                            i3 = 0;
                        }
                    } else if (iB3 == 0) {
                        if (iB4 == -65536) {
                            if (iB5 != 65536) {
                                if (iB5 == -65536) {
                                    if (iB6 == 0) {
                                        z3 = false;
                                    } else {
                                        z3 = true;
                                    }
                                    iB5 = -65536;
                                }
                                iB4 = -65536;
                            } else if (iB6 == 0) {
                                z3 = false;
                            } else {
                                z3 = true;
                            }
                            if (true != z3) {
                                i2 = 270;
                            } else {
                                iB4 = -65536;
                            }
                            i3 = i2;
                        }
                        iB3 = 0;
                        if (iB3 != -65536) {
                            i2 = 180;
                            i3 = i2;
                        } else {
                            i2 = 180;
                            i3 = i2;
                        }
                        i3 = 0;
                    } else if ((iB3 != -65536 || iB3 == 65536) && iB4 == 0 && iB5 == 0 && iB6 == -65536) {
                        i2 = 180;
                        i3 = i2;
                    } else {
                        i3 = 0;
                    }
                    cw1Var2.G(16);
                    short sN = cw1Var2.N();
                    cw1Var2.G(2);
                    short sN2 = cw1Var2.N();
                    long j4 = j == -9223372036854775807L ? jP : j;
                    long j5 = d(l12VarB.c).c;
                    if (j4 == -9223372036854775807L) {
                        j2 = j5;
                        jT2 = -9223372036854775807L;
                    } else {
                        j2 = j5;
                        jT2 = qz1.t(j4, 1000000L, j2, RoundingMode.DOWN);
                    }
                    i12 i12VarC2 = i12VarC.c(1835626086);
                    i12VarC2.getClass();
                    i12 i12VarC3 = i12VarC2.c(1937007212);
                    i12VarC3.getClass();
                    l12 l12VarB4 = i12VarC.b(1835296868);
                    l12VarB4.getClass();
                    cw1 cw1Var3 = l12VarB4.c;
                    cw1Var3.E(8);
                    int iA2 = a(cw1Var3.b());
                    cw1Var3.G(iA2 == 0 ? 8 : 16);
                    long jP2 = cw1Var3.P();
                    int i17 = cw1Var3.b;
                    int i18 = 0;
                    while (true) {
                        int i19 = iA2 == 0 ? 4 : 8;
                        if (i18 >= i19) {
                            cw1Var3.G(i19);
                            break;
                        }
                        if (cw1Var3.a[i17 + i18] != -1) {
                            long jP3 = iA2 == 0 ? cw1Var3.P() : cw1Var3.j();
                            if (jP3 == 0) {
                                break;
                            }
                            jT = qz1.t(jP3, 1000000L, jP2, RoundingMode.DOWN);
                            break;
                        }
                        i18++;
                    }
                    int iL2 = cw1Var3.L();
                    char[] cArr = {(char) (((iL2 >> 10) & 31) + 96), (char) (((iL2 >> 5) & 31) + 96), (char) ((iL2 & 31) + 96)};
                    int i20 = 0;
                    while (true) {
                        if (i20 >= 3) {
                            str = new String(cArr);
                            break;
                        }
                        char c2 = cArr[i20];
                        if (c2 < 'a' || c2 > 'z') {
                            str = null;
                            break;
                        }
                        i20++;
                    }
                    l12 l12VarB5 = i12VarC3.b(1937011556);
                    String str7 = "BoxParsers";
                    if (l12VarB5 == null) {
                        s90.Q("BoxParsers", "Ignoring track where sample table (stbl) box is missing a sample description (stsd).");
                        wh2Var = wh2Var;
                        arrayList = arrayList4;
                        i4 = i13;
                        i12Var2 = i12Var3;
                        wh0Var = null;
                    } else {
                        cw1 cw1Var4 = l12VarB5.c;
                        cw1Var4.E(12);
                        int iB7 = cw1Var4.b();
                        d6 d6Var = new d6();
                        d6Var.c = new xh0[iB7];
                        d6Var.b = 0;
                        int i21 = 0;
                        while (i21 < iB7) {
                            int i22 = i;
                            int i23 = cw1Var4.b;
                            int iB8 = cw1Var4.b();
                            int i24 = i21;
                            String str8 = "childAtomSize must be positive";
                            rs0.q("childAtomSize must be positive", iB8 > 0);
                            int iB9 = cw1Var4.b();
                            int i25 = i23;
                            if (iB9 == 1635148593 || iB9 == 1635148595 || iB9 == 1701733238 || iB9 == 1831958048 || iB9 == 1836070006 || iB9 == 1752589105 || iB9 == 1751479857 || iB9 == 1932670515 || iB9 == 1211250227 || iB9 == 1748121139 || iB9 == 1987063864 || iB9 == 1987063865 || iB9 == 1635135537 || iB9 == 1685479798 || iB9 == 1685479729 || iB9 == 1685481573 || iB9 == 1685481521 || iB9 == 1634760241) {
                                sN = sN;
                                String str9 = str7;
                                int i26 = iB2;
                                iB7 = iB7;
                                int i27 = iB8;
                                i25 = i25;
                                String str10 = str;
                                cw1Var4 = cw1Var4;
                                i13 = i13;
                                i24 = i24;
                                cw1Var4.E(i25 + 16);
                                cw1Var4.G(16);
                                int iL3 = cw1Var4.L();
                                int iL4 = cw1Var4.L();
                                sN2 = sN2;
                                cw1Var4.G(50);
                                int i28 = cw1Var4.b;
                                arrayList2 = arrayList4;
                                int iIntValue = 1701733238;
                                if (iB9 == 1701733238) {
                                    Pair pairK = k(cw1Var4, i25, i27);
                                    if (pairK != null) {
                                        iIntValue = ((Integer) pairK.first).intValue();
                                        va3VarA = va3Var == null ? null : va3Var.a(((xh0) pairK.second).b);
                                        ((xh0[]) d6Var.c)[i24] = (xh0) pairK.second;
                                    } else {
                                        i25 = i25;
                                        va3VarA = va3Var;
                                    }
                                    cw1Var4.E(i28);
                                    va3Var2 = va3VarA;
                                } else {
                                    i25 = i25;
                                    iIntValue = iB9;
                                    va3Var2 = va3Var;
                                }
                                if (iIntValue == 1831958048) {
                                    int i29 = iIntValue;
                                    str2 = "video/mpeg";
                                    i5 = i29;
                                } else {
                                    i5 = 1211250227;
                                    if (iIntValue == 1211250227) {
                                        str2 = "video/3gpp";
                                    } else {
                                        i5 = iIntValue;
                                        str2 = null;
                                    }
                                }
                                va3 va3Var3 = va3Var2;
                                iL = iL;
                                int i30 = i3;
                                i12Var3 = i12Var3;
                                int i31 = i28;
                                float fH = 1.0f;
                                int i32 = -1;
                                int iC = -1;
                                y91 y91Var2 = null;
                                int i33 = 8;
                                List listF = null;
                                int i34 = 8;
                                int i35 = -1;
                                int i36 = -1;
                                boolean z9 = false;
                                int i37 = -1;
                                int i38 = -1;
                                ByteBuffer byteBuffer = null;
                                String str11 = null;
                                byte[] bArrCopyOfRange = null;
                                ec0 ec0Var = null;
                                gh0 gh0Var = null;
                                String str12 = str2;
                                int iB10 = -1;
                                int i39 = -1;
                                while (i31 - i25 < i27) {
                                    cw1Var4.E(i31);
                                    int i40 = cw1Var4.b;
                                    int iB11 = cw1Var4.b();
                                    int i41 = i31;
                                    if (iB11 != 0) {
                                        i6 = iB11;
                                    } else {
                                        if (cw1Var4.b - i25 == i27) {
                                            break;
                                        }
                                        i6 = 0;
                                    }
                                    rs0.q(str8, i6 > 0);
                                    int iB12 = cw1Var4.b();
                                    if (iB12 == 1635148611) {
                                        int i42 = i40 + 8;
                                        rs0.q(null, str12 == null);
                                        cw1Var4.E(i42);
                                        yc0 yc0VarA = yc0.a(cw1Var4);
                                        listF = yc0VarA.a;
                                        d6Var.a = yc0VarA.b;
                                        if (z9) {
                                            z7 = true;
                                        } else {
                                            fH = yc0VarA.k;
                                            z7 = false;
                                        }
                                        String str13 = yc0VarA.l;
                                        int i43 = yc0VarA.j;
                                        int i44 = yc0VarA.g;
                                        int i45 = yc0VarA.h;
                                        int i46 = yc0VarA.i;
                                        i34 = yc0VarA.e;
                                        i36 = i43;
                                        iB10 = i44;
                                        iC = i46;
                                        str12 = "video/avc";
                                        str4 = str8;
                                        i9 = yc0VarA.f;
                                        i7 = i5;
                                        z9 = z7;
                                        str11 = str13;
                                        d6Var = d6Var;
                                        i8 = i45;
                                    } else {
                                        i7 = i5;
                                        if (iB12 == 1752589123) {
                                            int i47 = i40 + 8;
                                            rs0.q(null, str12 == null);
                                            cw1Var4.E(i47);
                                            xd0 xd0VarA = xd0.a(cw1Var4, false, null);
                                            listF = xd0VarA.a;
                                            d6Var.a = xd0VarA.b;
                                            if (z9) {
                                                z6 = true;
                                            } else {
                                                fH = xd0VarA.l;
                                                z6 = false;
                                            }
                                            int i48 = xd0VarA.m;
                                            int i49 = xd0VarA.c;
                                            String str14 = xd0VarA.n;
                                            int i50 = xd0VarA.k;
                                            if (i50 == -1) {
                                                i50 = i39;
                                            }
                                            int i51 = xd0VarA.d;
                                            int i52 = xd0VarA.e;
                                            int i53 = xd0VarA.h;
                                            int i54 = xd0VarA.i;
                                            boolean z10 = z6;
                                            int i55 = xd0VarA.j;
                                            i35 = i49;
                                            iB10 = i53;
                                            i34 = xd0VarA.f;
                                            z9 = z10;
                                            str4 = str8;
                                            i9 = xd0VarA.g;
                                            d6Var = d6Var;
                                            str11 = str14;
                                            i38 = i51;
                                            i8 = i54;
                                            i37 = i52;
                                            y91Var2 = xd0VarA.o;
                                            str12 = "video/hevc";
                                            i39 = i50;
                                            iC = i55;
                                            str9 = str9;
                                            i36 = i48;
                                        } else if (iB12 == 1818785347) {
                                            int i56 = i40 + 8;
                                            rs0.q("lhvC must follow hvcC atom", "video/hevc".equals(str12));
                                            if (y91Var2 != null) {
                                                z5 = ((vj2) y91Var2.g).size() >= 2;
                                            } else {
                                                z5 = false;
                                                y91Var2 = null;
                                            }
                                            rs0.q("must have at least two layers", z5);
                                            cw1Var4.E(i56);
                                            y91Var2.getClass();
                                            xd0 xd0VarA2 = xd0.a(cw1Var4, true, y91Var2);
                                            rs0.q("nalUnitLengthFieldLength must be same for both hvcC and lhvC atoms", d6Var.a == xd0VarA2.b);
                                            int i57 = xd0VarA2.h;
                                            if (i57 != -1) {
                                                rs0.q("colorSpace must be the same for both views", iB10 == i57);
                                            }
                                            int i58 = xd0VarA2.i;
                                            if (i58 != -1) {
                                                rs0.q("colorRange must be the same for both views", i32 == i58);
                                            }
                                            int i59 = xd0VarA2.j;
                                            if (i59 != -1) {
                                                rs0.q("colorTransfer must be the same for both views", iC == i59);
                                            }
                                            rs0.q("bitdepthLuma must be the same for both views", i34 == xd0VarA2.f);
                                            rs0.q("bitdepthChroma must be the same for both views", i33 == xd0VarA2.g);
                                            if (listF != null) {
                                                tj2 tj2Var = vj2.g;
                                                sj2 sj2Var = new sj2(4);
                                                sj2Var.b(listF);
                                                sj2Var.b(xd0VarA2.a);
                                                qk2VarF = sj2Var.f();
                                            } else {
                                                rs0.q("initializationData must be already set from hvcC atom", false);
                                                qk2VarF = null;
                                            }
                                            str4 = str8;
                                            i8 = i32;
                                            listF = qk2VarF;
                                            str11 = xd0VarA2.n;
                                            str12 = "video/mv-hevc";
                                            d6Var = d6Var;
                                            i9 = i33;
                                        } else if (iB12 == 1986361461) {
                                            cw1Var4.E(i40 + 8);
                                            int i60 = cw1Var4.b;
                                            zy1 zy1Var = null;
                                            while (i60 - i40 < i6) {
                                                cw1Var4.E(i60);
                                                int iB13 = cw1Var4.b();
                                                rs0.q(str8, iB13 > 0);
                                                int i61 = i60;
                                                if (cw1Var4.b() == 1702454643) {
                                                    cw1Var4.E(i61 + 8);
                                                    int i62 = cw1Var4.b;
                                                    while (true) {
                                                        if (i62 - i61 >= iB13) {
                                                            str5 = str8;
                                                            zy1Var = null;
                                                            break;
                                                        }
                                                        cw1Var4.E(i62);
                                                        int iB14 = cw1Var4.b();
                                                        rs0.q(str8, iB14 > 0);
                                                        str5 = str8;
                                                        if (cw1Var4.b() == 1937011305) {
                                                            cw1Var4.G(4);
                                                            int iK = cw1Var4.K();
                                                            int i63 = iK & 1;
                                                            boolean z11 = (iK & 2) == 2;
                                                            boolean z12 = (iK & 8) == 8;
                                                            boolean z13 = 1 == i63;
                                                            i60 i60Var = new i60();
                                                            i60Var.a = z13;
                                                            i60Var.b = z11;
                                                            i60Var.c = z12;
                                                            zy1Var = new zy1(10, i60Var);
                                                            break;
                                                        }
                                                        i62 += iB14;
                                                        str8 = str5;
                                                    }
                                                } else {
                                                    str5 = str8;
                                                }
                                                i60 = i61 + iB13;
                                                i32 = i32;
                                                str8 = str5;
                                            }
                                            str4 = str8;
                                            i8 = i32;
                                            kc2 kc2Var = zy1Var == null ? null : new kc2(11, zy1Var);
                                            if (kc2Var != null) {
                                                zy1 zy1Var2 = (zy1) kc2Var.g;
                                                if (y91Var2 == null) {
                                                    y91Var2 = null;
                                                } else if (((vj2) y91Var2.g).size() >= 2) {
                                                    i60 i60Var2 = (i60) zy1Var2.g;
                                                    rs0.q("both eye views must be marked as available", i60Var2.a && i60Var2.b);
                                                    rs0.q("for MV-HEVC, eye_views_reversed must be set to false", !((i60) zy1Var2.g).c);
                                                }
                                                if (i39 == -1) {
                                                    d6Var = d6Var;
                                                    i9 = i33;
                                                    if (true != ((i60) zy1Var2.g).c) {
                                                        i39 = 4;
                                                    } else {
                                                        i39 = 5;
                                                    }
                                                } else {
                                                    i9 = i33;
                                                    str9 = str9;
                                                }
                                            }
                                            d6Var = d6Var;
                                            y91Var = y91Var2;
                                            i10 = i39;
                                            i9 = i33;
                                            i11 = i34;
                                            str9 = str9;
                                            y91Var2 = y91Var;
                                            i34 = i11;
                                            i39 = i10;
                                        } else {
                                            str4 = str8;
                                            i8 = i32;
                                            if (iB12 == 1685480259 || iB12 == 1685485123 || iB12 == 1685485379) {
                                                d6Var = d6Var;
                                                y91 y91Var3 = y91Var2;
                                                int i64 = i39;
                                                i9 = i33;
                                                int i65 = i34;
                                                str9 = str9;
                                                int i66 = i6 - 8;
                                                int i67 = i40 + 8;
                                                byte[] bArr = new byte[i66];
                                                cw1Var4.H(bArr, 0, i66);
                                                if (listF != null) {
                                                    tj2 tj2Var2 = vj2.g;
                                                    sj2 sj2Var2 = new sj2(4);
                                                    sj2Var2.b(listF);
                                                    sj2Var2.a(bArr);
                                                    listF = sj2Var2.f();
                                                } else {
                                                    rs0.q("initializationData must already be set from hvcC or avcC atom", false);
                                                    listF = null;
                                                }
                                                cw1Var4.E(i67);
                                                bp2 bp2VarA = bp2.a(cw1Var4);
                                                if (bp2VarA != null) {
                                                    str12 = "video/dolby-vision";
                                                    str11 = bp2VarA.g;
                                                }
                                                y91Var2 = y91Var3;
                                                i34 = i65;
                                                i39 = i64;
                                            } else if (iB12 == 1987076931) {
                                                int i68 = i40 + 12;
                                                rs0.q(null, str12 == null);
                                                cw1Var4.E(i68);
                                                byte bK = (byte) cw1Var4.K();
                                                byte bK2 = (byte) cw1Var4.K();
                                                int iK2 = cw1Var4.K();
                                                int i69 = iK2 >> 4;
                                                int i70 = iK2 >> 1;
                                                String str15 = i7 == 1987063864 ? "video/x-vnd.on2.vp8" : "video/x-vnd.on2.vp9";
                                                if (str15.equals("video/x-vnd.on2.vp9")) {
                                                    byte[] bArr2 = rl1.a;
                                                    i12 = 1;
                                                    listF = vj2.i(new byte[]{1, 1, bK, 2, 1, bK2, 3, 1, (byte) i69, 4, 1, (byte) (i70 & 7)});
                                                } else {
                                                    i12 = 1;
                                                }
                                                int i71 = iK2 & 1;
                                                int iK3 = cw1Var4.K();
                                                int iK4 = cw1Var4.K();
                                                iB10 = c43.b(iK3);
                                                i8 = i12 != i71 ? 2 : 1;
                                                iC = c43.c(iK4);
                                                i9 = i69;
                                                d6Var = d6Var;
                                                i7 = i7;
                                                str12 = str15;
                                                str9 = str9;
                                                i34 = i9;
                                            } else {
                                                int i72 = 6;
                                                if (iB12 == 1635135811) {
                                                    int i73 = i6 - 8;
                                                    byte[] bArr3 = new byte[i73];
                                                    cw1Var4.H(bArr3, 0, i73);
                                                    listF = vj2.i(bArr3);
                                                    cw1Var4.E(i40 + 8);
                                                    c43 c43VarH = h(cw1Var4);
                                                    int i74 = c43VarH.e;
                                                    int i75 = c43VarH.f;
                                                    iB10 = c43VarH.a;
                                                    i34 = i74;
                                                    i9 = i75;
                                                    i8 = c43VarH.b;
                                                    str12 = "video/av01";
                                                    iC = c43VarH.c;
                                                    str9 = str9;
                                                } else if (iB12 == 1668050025) {
                                                    ByteBuffer byteBufferOrder = byteBuffer == null ? ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN) : byteBuffer;
                                                    byteBufferOrder.position(21);
                                                    byteBufferOrder.putShort(cw1Var4.N());
                                                    byteBufferOrder.putShort(cw1Var4.N());
                                                    byteBuffer = byteBufferOrder;
                                                    d6Var = d6Var;
                                                    i9 = i33;
                                                } else {
                                                    if (iB12 == 1835295606) {
                                                        ByteBuffer byteBufferOrder2 = byteBuffer == null ? ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN) : byteBuffer;
                                                        short sN3 = cw1Var4.N();
                                                        short sN4 = cw1Var4.N();
                                                        short sN5 = cw1Var4.N();
                                                        short sN6 = cw1Var4.N();
                                                        y91Var = y91Var2;
                                                        short sN7 = cw1Var4.N();
                                                        i9 = i33;
                                                        short sN8 = cw1Var4.N();
                                                        i11 = i34;
                                                        short sN9 = cw1Var4.N();
                                                        d6Var = d6Var;
                                                        short sN10 = cw1Var4.N();
                                                        long jP4 = cw1Var4.P();
                                                        long jP5 = cw1Var4.P();
                                                        i10 = i39;
                                                        byteBufferOrder2.position(1);
                                                        byteBufferOrder2.putShort(sN7);
                                                        byteBufferOrder2.putShort(sN8);
                                                        byteBufferOrder2.putShort(sN3);
                                                        byteBufferOrder2.putShort(sN4);
                                                        byteBufferOrder2.putShort(sN5);
                                                        byteBufferOrder2.putShort(sN6);
                                                        byteBufferOrder2.putShort(sN9);
                                                        byteBufferOrder2.putShort(sN10);
                                                        byteBufferOrder2.putShort((short) (jP4 / 10000));
                                                        byteBufferOrder2.putShort((short) (jP5 / 10000));
                                                        byteBuffer = byteBufferOrder2;
                                                    } else {
                                                        d6Var = d6Var;
                                                        y91Var = y91Var2;
                                                        i10 = i39;
                                                        i9 = i33;
                                                        i11 = i34;
                                                        if (iB12 == 1681012275) {
                                                            rs0.q(null, str12 == null);
                                                            str12 = "video/3gpp";
                                                        } else if (iB12 == 1702061171) {
                                                            rs0.q(null, str12 == null);
                                                            gh0 gh0VarJ = j(i40, cw1Var4);
                                                            String str16 = (String) gh0VarJ.h;
                                                            byte[] bArr4 = (byte[]) gh0VarJ.i;
                                                            if (bArr4 != null) {
                                                                listF = vj2.i(bArr4);
                                                            }
                                                            gh0Var = gh0VarJ;
                                                            str12 = str16;
                                                        } else if (iB12 == 1651798644) {
                                                            cw1Var4.E(i40 + 8);
                                                            cw1Var4.G(4);
                                                            ec0Var = new ec0(cw1Var4.P(), cw1Var4.P());
                                                        } else if (iB12 == 1885434736) {
                                                            cw1Var4.E(i40 + 8);
                                                            fH = cw1Var4.h() / cw1Var4.h();
                                                            str9 = str9;
                                                            y91Var2 = y91Var;
                                                            i34 = i11;
                                                            i39 = i10;
                                                            z9 = true;
                                                        } else if (iB12 == 1937126244) {
                                                            int i76 = i40 + 8;
                                                            while (true) {
                                                                if (i76 - i40 >= i6) {
                                                                    bArrCopyOfRange = null;
                                                                    break;
                                                                }
                                                                cw1Var4.E(i76);
                                                                int iB15 = cw1Var4.b() + i76;
                                                                if (cw1Var4.b() == 1886547818) {
                                                                    bArrCopyOfRange = Arrays.copyOfRange(cw1Var4.a, i76, iB15);
                                                                    break;
                                                                }
                                                                i76 = iB15;
                                                            }
                                                        } else {
                                                            if (iB12 == 1936995172) {
                                                                int iK5 = cw1Var4.K();
                                                                cw1Var4.G(3);
                                                                if (iK5 == 0) {
                                                                    int iK6 = cw1Var4.K();
                                                                    if (iK6 == 0) {
                                                                        str9 = str9;
                                                                        y91Var2 = y91Var;
                                                                        i34 = i11;
                                                                        i39 = 0;
                                                                    } else if (iK6 == 1) {
                                                                        str9 = str9;
                                                                        y91Var2 = y91Var;
                                                                        i34 = i11;
                                                                        i39 = 1;
                                                                    } else if (iK6 == 2) {
                                                                        str9 = str9;
                                                                        y91Var2 = y91Var;
                                                                        i34 = i11;
                                                                        i39 = 2;
                                                                    } else if (iK6 == 3) {
                                                                        i39 = 3;
                                                                        y91Var2 = y91Var;
                                                                        i34 = i11;
                                                                    }
                                                                }
                                                            } else if (iB12 == 1634760259) {
                                                                int i77 = i6 - 12;
                                                                byte[] bArr5 = new byte[i77];
                                                                cw1Var4.E(i40 + 12);
                                                                cw1Var4.H(bArr5, 0, i77);
                                                                byte[] bArr6 = rl1.a;
                                                                hn.F(i77 >= 17, "Invalid APV CSD length: %s", i77);
                                                                byte b = bArr5[0];
                                                                hn.F(b == 1, "Invalid APV CSD version: %s", b);
                                                                byte b2 = bArr5[5];
                                                                byte b3 = bArr5[6];
                                                                byte b4 = bArr5[7];
                                                                String str17 = qz1.a;
                                                                Locale locale = Locale.US;
                                                                String str18 = "apv1.apvf" + ((int) b2) + ".apvl" + ((int) b3) + ".apvb" + ((int) b4);
                                                                listF = vj2.i(bArr5);
                                                                cw1 cw1Var5 = new cw1(bArr5);
                                                                oe0 oe0Var = new oe0(bArr5.length, bArr5);
                                                                int i78 = 8;
                                                                oe0Var.l(cw1Var5.b * 8);
                                                                int i79 = 1;
                                                                oe0Var.x(1);
                                                                int iR = oe0Var.r(8);
                                                                int i80 = 0;
                                                                int iB16 = -1;
                                                                int i81 = -1;
                                                                int iC2 = -1;
                                                                int i82 = -1;
                                                                int i83 = -1;
                                                                while (i80 < iR) {
                                                                    oe0Var.x(i79);
                                                                    int iR2 = oe0Var.r(i78);
                                                                    int i84 = 0;
                                                                    while (i84 < iR2) {
                                                                        int i85 = i78;
                                                                        oe0Var.o(i72);
                                                                        boolean zQ = oe0Var.q();
                                                                        oe0Var.m();
                                                                        oe0Var.x(11);
                                                                        oe0Var.o(4);
                                                                        int iR3 = oe0Var.r(4) + 8;
                                                                        oe0Var.x(i79);
                                                                        if (zQ) {
                                                                            int iR4 = oe0Var.r(i85);
                                                                            int iR5 = oe0Var.r(i85);
                                                                            oe0Var.x(i79);
                                                                            boolean zQ2 = oe0Var.q();
                                                                            iB16 = c43.b(iR4);
                                                                            int i86 = i79 != zQ2 ? 2 : 1;
                                                                            iC2 = c43.c(iR5);
                                                                            i81 = i86;
                                                                        }
                                                                        i84++;
                                                                        i82 = iR3;
                                                                        i83 = i82;
                                                                        i79 = 1;
                                                                        i78 = 8;
                                                                        i72 = 6;
                                                                    }
                                                                    i80++;
                                                                    i79 = 1;
                                                                    i78 = 8;
                                                                    i72 = 6;
                                                                }
                                                                iB10 = iB16;
                                                                str11 = str18;
                                                                i8 = i81;
                                                                iC = iC2;
                                                                i9 = i83;
                                                                str9 = str9;
                                                                y91Var2 = y91Var;
                                                                i39 = i10;
                                                                i34 = i82;
                                                                str12 = "video/apv";
                                                            } else {
                                                                if (iB12 != 1668246642 || iB10 != -1) {
                                                                    str9 = str9;
                                                                } else if (iC == -1) {
                                                                    int iB17 = cw1Var4.b();
                                                                    if (iB17 == 1852009592 || iB17 == 1852009571) {
                                                                        str9 = str9;
                                                                        int iL5 = cw1Var4.L();
                                                                        int iL6 = cw1Var4.L();
                                                                        cw1Var4.G(2);
                                                                        if (i6 != 19) {
                                                                            z4 = false;
                                                                        } else if ((cw1Var4.K() & 128) != 0) {
                                                                            i6 = 19;
                                                                            z4 = true;
                                                                        } else {
                                                                            i6 = 19;
                                                                            z4 = false;
                                                                        }
                                                                        int iB18 = c43.b(iL5);
                                                                        int i87 = true != z4 ? 2 : 1;
                                                                        iB10 = iB18;
                                                                        iC = c43.c(iL6);
                                                                        i8 = i87;
                                                                    } else {
                                                                        str9 = str9;
                                                                        s90.Q(str9, "Unsupported color type: ".concat(c9.a(iB17)));
                                                                        iB10 = -1;
                                                                        iC = -1;
                                                                    }
                                                                } else {
                                                                    str9 = str9;
                                                                    iB10 = -1;
                                                                }
                                                                y91Var2 = y91Var;
                                                                i34 = i11;
                                                                i39 = i10;
                                                            }
                                                            str9 = str9;
                                                            y91Var2 = y91Var;
                                                            i34 = i11;
                                                            i39 = i10;
                                                        }
                                                    }
                                                    y91Var2 = y91Var;
                                                    i34 = i11;
                                                    i39 = i10;
                                                }
                                            }
                                        }
                                        i31 = i41 + i6;
                                        str9 = str9;
                                        i27 = i27;
                                        i5 = i7;
                                        i32 = i8;
                                        str8 = str4;
                                        i33 = i9;
                                        d6Var = d6Var;
                                    }
                                    i31 = i41 + i6;
                                    str9 = str9;
                                    i27 = i27;
                                    i5 = i7;
                                    i32 = i8;
                                    str8 = str4;
                                    i33 = i9;
                                    d6Var = d6Var;
                                }
                                int i88 = i32;
                                iB8 = i27;
                                d6 d6Var2 = d6Var;
                                int i89 = i39;
                                int i90 = i33;
                                int i91 = i34;
                                str3 = str9;
                                if (str12 == null) {
                                    str = str10;
                                    i3 = i30;
                                    iB2 = i26;
                                    d6Var = d6Var2;
                                } else {
                                    uc3 uc3Var = new uc3();
                                    uc3Var.c(iB2);
                                    uc3Var.e(str12);
                                    uc3Var.i = str11;
                                    uc3Var.s = iL3;
                                    uc3Var.t = iL4;
                                    uc3Var.u = i38;
                                    uc3Var.v = i37;
                                    uc3Var.y = fH;
                                    i3 = i30;
                                    uc3Var.x = i3;
                                    uc3Var.z = bArrCopyOfRange;
                                    uc3Var.A = i89;
                                    uc3Var.o = listF;
                                    uc3Var.n = i36;
                                    uc3Var.C = i35;
                                    uc3Var.p = va3Var3;
                                    str = str10;
                                    uc3Var.d = str;
                                    if (byteBuffer != null) {
                                        iB2 = i26;
                                        bArrArray = byteBuffer.array();
                                    } else {
                                        iB2 = i26;
                                        bArrArray = null;
                                    }
                                    uc3Var.B = new c43(iB10, i88, iC, bArrArray, i91, i90);
                                    ec0 ec0Var2 = ec0Var;
                                    if (ec0Var2 != null) {
                                        uc3Var.g = w40.f0(ec0Var2.a);
                                        uc3Var.h = w40.f0(ec0Var2.b);
                                    } else {
                                        gh0 gh0Var2 = gh0Var;
                                        if (gh0Var2 != null) {
                                            uc3Var.g = w40.f0(gh0Var2.f);
                                            uc3Var.h = w40.f0(gh0Var2.g);
                                        }
                                    }
                                    de3 de3Var2 = new de3(uc3Var);
                                    d6Var = d6Var2;
                                    d6Var.d = de3Var2;
                                }
                            } else if (iB9 == 1836069985 || iB9 == 1701733217 || iB9 == 1633889587 || iB9 == 1700998451 || iB9 == 1633889588 || iB9 == 1835823201 || iB9 == 1685353315 || iB9 == 1685353317 || iB9 == 1685353320 || iB9 == 1685353324 || iB9 == 1685353336 || iB9 == 1935764850 || iB9 == 1935767394 || iB9 == 1819304813 || iB9 == 1936684916 || iB9 == 1953984371 || iB9 == 778924082 || iB9 == 778924083 || iB9 == 1835557169 || iB9 == 1835560241 || iB9 == 1634492771 || iB9 == 1634492791 || iB9 == 1970037111 || iB9 == 1332770163 || iB9 == 1716281667 || iB9 == 1767992678 || iB9 == 1768973165 || iB9 == 1718641517) {
                                byte b5 = -1;
                                i(cw1Var4, iB9, i25, iB8, iB2, str, z2, va3Var, d6Var, i24);
                                i25 = i25;
                                iB8 = iB8;
                                str = str;
                                d6Var = d6Var;
                                i24 = i24;
                                arrayList2 = arrayList4;
                                i3 = i3;
                                i12Var3 = i12Var3;
                                sN2 = sN2;
                                str3 = str7;
                            } else {
                                if (iB9 == 1414810956 || iB9 == 1954034535 || iB9 == 2004251764 || iB9 == 1937010800 || iB9 == 1664495672 || iB9 == 1836070003) {
                                    cw1Var4.E(i25 + 16);
                                    String str19 = "application/ttml+xml";
                                    if (iB9 == 1414810956) {
                                        str6 = str19;
                                        j3 = Long.MAX_VALUE;
                                        qk2VarI = null;
                                        c = '\n';
                                    } else if (iB9 == 1954034535) {
                                        int i92 = iB8 - 16;
                                        byte[] bArr7 = new byte[i92];
                                        cw1Var4.H(bArr7, 0, i92);
                                        qk2VarI = vj2.i(bArr7);
                                        cw1Var4 = cw1Var4;
                                        str6 = "application/x-quicktime-tx3g";
                                        str7 = str7;
                                        iL = iL;
                                        j3 = Long.MAX_VALUE;
                                        c = '\n';
                                    } else {
                                        if (iB9 == 2004251764) {
                                            str19 = "application/x-mp4-vtt";
                                        } else if (iB9 == 1937010800) {
                                            str6 = "application/ttml+xml";
                                            j3 = 0;
                                            qk2VarI = null;
                                            c = '\n';
                                        } else if (iB9 == 1664495672) {
                                            d6Var.b = 1;
                                            str19 = "application/x-mp4-cea-608";
                                        } else {
                                            int i93 = cw1Var4.b;
                                            cw1Var4.G(4);
                                            if (cw1Var4.b() == 1702061171) {
                                                byte[] bArr8 = (byte[]) j(i93, cw1Var4).i;
                                                if (bArr8 == null || bArr8.length != 64) {
                                                    str3 = str7;
                                                } else {
                                                    hn.M(bArr8.length == 64);
                                                    ArrayList arrayList6 = new ArrayList(16);
                                                    int i94 = 0;
                                                    while (i94 < bArr8.length - 3) {
                                                        byte[] bArr9 = bArr8;
                                                        String str20 = str7;
                                                        int iR0 = w40.r0(bArr8[i94], bArr9[i94 + 1], bArr9[i94 + 2], bArr9[i94 + 3]);
                                                        String str21 = qz1.a;
                                                        int i95 = ((iR0 >> 8) & 255) - 128;
                                                        int i96 = (iR0 >> 16) & 255;
                                                        int i97 = (iR0 & 255) - 128;
                                                        arrayList6.add(String.format("%06x", Integer.valueOf(Math.max(0, Math.min(((i97 * 17790) / 10000) + i96, 255)) | (Math.max(0, Math.min(((i95 * 14075) / 10000) + i96, 255)) << 16) | (Math.max(0, Math.min((i96 - ((i97 * 3455) / 10000)) - ((i95 * 7169) / 10000), 255)) << 8))));
                                                        i94 += 4;
                                                        bArr8 = bArr9;
                                                        str7 = str20;
                                                        iL = iL;
                                                    }
                                                    str7 = str7;
                                                    iL = iL;
                                                    Iterator it = arrayList6.iterator();
                                                    StringBuilder sb = new StringBuilder();
                                                    i8.D(sb, it, ", ");
                                                    String string = sb.toString();
                                                    c = '\n';
                                                    StringBuilder sb2 = new StringBuilder(ec.f(string, ec.f(String.valueOf((int) sN2), String.valueOf((int) sN).length() + 7, 10), 1));
                                                    sb2.append("size: ");
                                                    sb2.append((int) sN);
                                                    sb2.append("x");
                                                    sb2.append((int) sN2);
                                                    String strN = ec.n(sb2, "\npalette: ", string, "\n");
                                                    String str22 = qz1.a;
                                                    qk2VarI = vj2.i(strN.getBytes(StandardCharsets.UTF_8));
                                                    str6 = "application/vobsub";
                                                }
                                            } else {
                                                str7 = str7;
                                                iL = iL;
                                                c = '\n';
                                                qk2VarI = null;
                                                str6 = null;
                                            }
                                            j3 = Long.MAX_VALUE;
                                        }
                                        str6 = str19;
                                        j3 = Long.MAX_VALUE;
                                        qk2VarI = null;
                                        c = '\n';
                                    }
                                    if (str6 != null) {
                                        uc3 uc3Var2 = new uc3();
                                        uc3Var2.c(iB2);
                                        uc3Var2.e(str6);
                                        uc3Var2.d = str;
                                        uc3Var2.q = j3;
                                        uc3Var2.o = qk2VarI;
                                        d6Var.d = new de3(uc3Var2);
                                    }
                                    str = str;
                                    sN = sN;
                                    iB2 = iB2;
                                    d6Var = d6Var;
                                    iB7 = iB7;
                                    i3 = i3;
                                    sN2 = sN2;
                                    iB8 = iB8;
                                    i25 = i25;
                                    cw1Var4 = cw1Var4;
                                    str3 = str7;
                                    arrayList2 = arrayList4;
                                    i13 = i13;
                                    i12Var3 = i12Var3;
                                } else {
                                    if (iB9 == 1835365492) {
                                        cw1Var4.E(i25 + 16);
                                        cw1Var4.m();
                                        String strM = cw1Var4.m();
                                        if (strM != null) {
                                            uc3 uc3Var3 = new uc3();
                                            uc3Var3.c(iB2);
                                            uc3Var3.e(strM);
                                            d6Var.d = new de3(uc3Var3);
                                        }
                                    } else if (iB9 == 1667329389) {
                                        uc3 uc3Var4 = new uc3();
                                        uc3Var4.c(iB2);
                                        uc3Var4.e("application/x-camera-motion");
                                        d6Var.d = new de3(uc3Var4);
                                    }
                                    str3 = str7;
                                }
                                arrayList2 = arrayList4;
                                i13 = i13;
                            }
                            cw1Var4.E(i25 + iB8);
                            d6Var = d6Var;
                            i3 = i3;
                            i21 = i24 + 1;
                            sN = sN;
                            sN2 = sN2;
                            iB7 = iB7;
                            i13 = i13;
                            arrayList4 = arrayList2;
                            i12Var3 = i12Var3;
                            iL = iL;
                            iB2 = iB2;
                            str7 = str3;
                            cw1Var4 = cw1Var4;
                            str = str;
                            i = i22;
                        }
                        int i98 = i;
                        int i99 = iB2;
                        int i100 = iL;
                        d6 d6Var3 = d6Var;
                        arrayList = arrayList4;
                        i4 = i13;
                        i12 i12Var4 = i12Var3;
                        if (z) {
                            i12Var2 = i12Var4;
                        } else {
                            i12Var2 = i12Var4;
                            i12 i12VarC4 = i12Var2.c(1701082227);
                            if (i12VarC4 != null) {
                                l12 l12VarB6 = i12VarC4.b(1701606260);
                                if (l12VarB6 != null) {
                                    cw1 cw1Var6 = l12VarB6.c;
                                    cw1Var6.E(8);
                                    int iA3 = a(cw1Var6.b());
                                    int iH = cw1Var6.h();
                                    long[] jArr3 = new long[iH];
                                    long[] jArr4 = new long[iH];
                                    int i101 = 0;
                                    while (true) {
                                        if (i101 >= iH) {
                                            pairCreate = Pair.create(jArr3, jArr4);
                                            break;
                                        }
                                        jArr3[i101] = iA3 == 1 ? cw1Var6.j() : cw1Var6.P();
                                        jArr4[i101] = iA3 == 1 ? cw1Var6.d() : cw1Var6.b();
                                        if (cw1Var6.N() != 1) {
                                            j7.p("Unsupported media rate.");
                                            pairCreate = null;
                                            break;
                                        }
                                        cw1Var6.G(2);
                                        i101++;
                                    }
                                } else {
                                    pairCreate = null;
                                    break;
                                }
                                if (pairCreate != null) {
                                    jArr = (long[]) pairCreate.first;
                                    jArr2 = (long[]) pairCreate.second;
                                }
                            }
                            de3Var = (de3) d6Var3.d;
                            if (de3Var == null) {
                                if (i100 != 0) {
                                    f12Var = new f12(i100);
                                    uc3 uc3Var5 = new uc3(de3Var);
                                    am0Var = de3Var.k;
                                    if (am0Var != null) {
                                        am0Var2 = am0Var.c(f12Var);
                                    } else {
                                        am0Var2 = new am0(f12Var);
                                    }
                                    uc3Var5.j = am0Var2;
                                    de3Var = new de3(uc3Var5);
                                }
                                wh0 wh0Var3 = new wh0(i99, i98, jP2, j2, jT2, jT, de3Var, d6Var3.b, (xh0[]) d6Var3.c, d6Var3.a, jArr, jArr2);
                                wh2Var = wh2Var;
                                wh0Var = wh0Var3;
                            }
                        }
                        jArr = null;
                        jArr2 = null;
                        de3Var = (de3) d6Var3.d;
                        if (de3Var == null) {
                            if (i100 != 0) {
                                f12Var = new f12(i100);
                                uc3 uc3Var6 = new uc3(de3Var);
                                am0Var = de3Var.k;
                                if (am0Var != null) {
                                    am0Var2 = am0Var.c(f12Var);
                                } else {
                                    am0Var2 = new am0(f12Var);
                                }
                                uc3Var6.j = am0Var2;
                                de3Var = new de3(uc3Var6);
                            }
                            wh0 wh0Var4 = new wh0(i99, i98, jP2, j2, jT2, jT, de3Var, d6Var3.b, (xh0[]) d6Var3.c, d6Var3.a, jArr, jArr2);
                            wh2Var = wh2Var;
                            wh0Var = wh0Var4;
                        }
                    }
                    wh0Var2 = (wh0) wh2Var.apply(wh0Var);
                    if (wh0Var2 != null) {
                        i12 i12VarC5 = i12Var2.c(1835297121);
                        i12VarC5.getClass();
                        i12 i12VarC6 = i12VarC5.c(1835626086);
                        i12VarC6.getClass();
                        i12 i12VarC7 = i12VarC6.c(1937007212);
                        i12VarC7.getClass();
                        zh0 zh0VarG = g(wh0Var2, i12VarC7, wd0Var);
                        arrayList3 = arrayList;
                        arrayList3.add(zh0VarG);
                    } else {
                        arrayList3 = arrayList;
                    }
                }
                wh0Var = null;
                wh0Var2 = (wh0) wh2Var.apply(wh0Var);
                if (wh0Var2 != null) {
                    i12 i12VarC8 = i12Var2.c(1835297121);
                    i12VarC8.getClass();
                    i12 i12VarC9 = i12VarC8.c(1835626086);
                    i12VarC9.getClass();
                    i12 i12VarC10 = i12VarC9.c(1937007212);
                    i12VarC10.getClass();
                    zh0 zh0VarG2 = g(wh0Var2, i12VarC10, wd0Var);
                    arrayList3 = arrayList;
                    arrayList3.add(zh0VarG2);
                } else {
                    arrayList3 = arrayList;
                }
            }
            i13 = i4 + 1;
            arrayList4 = arrayList3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:153:0x02d5 A[Catch: all -> 0x0094, TryCatch #2 {all -> 0x0094, blocks: (B:22:0x007d, B:24:0x0089, B:27:0x0097, B:31:0x00a4, B:34:0x00b1, B:37:0x00be, B:40:0x00cb, B:43:0x00d8, B:45:0x00e4, B:53:0x0100, B:54:0x011e, B:55:0x0131, B:58:0x013d, B:61:0x014a, B:64:0x0157, B:67:0x0164, B:70:0x0171, B:73:0x017e, B:76:0x018b, B:79:0x0198, B:82:0x01a5, B:85:0x01b2, B:89:0x01c4, B:91:0x01c8, B:93:0x01d9, B:95:0x01e2, B:97:0x01e9, B:103:0x01f6, B:109:0x0205, B:153:0x02d5, B:110:0x021b, B:112:0x0222, B:114:0x022e, B:115:0x0242, B:128:0x026b, B:131:0x0278, B:134:0x0285, B:137:0x0292, B:140:0x029e, B:143:0x02aa, B:146:0x02b4, B:149:0x02c0, B:152:0x02cc, B:154:0x02f3, B:155:0x02fa), top: B:234:0x007d }] */
    /* JADX WARN: Code duplicated, block: B:203:0x039e  */
    /* JADX WARN: Code duplicated, block: B:212:0x03b7  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v12, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v31 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static am0 c(l12 l12Var) {
        int i;
        boolean z;
        am0 am0Var;
        am0 am0Var2;
        int iF;
        am0 am0Var3;
        Object objE;
        String str;
        cw1 cw1Var = l12Var.c;
        int i2 = 8;
        cw1Var.E(8);
        boolean z2 = false;
        am0 am0Var4 = new am0(new il0[0]);
        while (cw1Var.B() >= i2) {
            int i3 = cw1Var.b;
            int iB = cw1Var.b() + i3;
            int iB2 = cw1Var.b();
            boolean z3 = true;
            String str2 = null;
            if (iB2 == 1835365473) {
                cw1Var.E(i3);
                cw1Var.G(i2);
                f(cw1Var);
                boolean z4 = z2;
                while (true) {
                    int i4 = cw1Var.b;
                    if (i4 < iB) {
                        int iB3 = cw1Var.b() + i4;
                        if (cw1Var.b() == 1768715124) {
                            cw1Var.E(i4);
                            cw1Var.G(i2);
                            ArrayList arrayList = new ArrayList();
                            ?? r3 = z4;
                            while (true) {
                                int i5 = cw1Var.b;
                                if (i5 >= iB3) {
                                    break;
                                }
                                int iB4 = cw1Var.b() + i5;
                                int iB5 = cw1Var.b();
                                int i6 = (iB5 >> 24) & 255;
                                if (i6 == 169 || i6 == 253) {
                                    int i7 = iB5 & 16777215;
                                    if (i7 == 6516084) {
                                        int iB6 = cw1Var.b();
                                        if (cw1Var.b() == 1684108385) {
                                            cw1Var.G(8);
                                            String strL = cw1Var.l(iB6 - 16);
                                            objE = new xf0("und", strL, strL);
                                        } else {
                                            s90.Q("MetadataUtil", "Failed to parse comment attribute: ".concat(c9.a(iB5)));
                                            objE = null;
                                        }
                                    } else if (i7 == 7233901 || i7 == 7631467) {
                                        objE = hn.E(iB5, "TIT2", cw1Var);
                                    } else if (i7 == 6516589 || i7 == 7828084) {
                                        objE = hn.E(iB5, "TCOM", cw1Var);
                                    } else if (i7 == 6578553) {
                                        objE = hn.E(iB5, "TDRC", cw1Var);
                                    } else if (i7 == 4280916) {
                                        objE = hn.E(iB5, "TPE1", cw1Var);
                                    } else if (i7 == 7630703) {
                                        objE = hn.E(iB5, "TSSE", cw1Var);
                                    } else if (i7 == 6384738) {
                                        objE = hn.E(iB5, "TALB", cw1Var);
                                    } else if (i7 == 7108978) {
                                        objE = hn.E(iB5, "USLT", cw1Var);
                                    } else if (i7 == 6776174) {
                                        objE = hn.E(iB5, "TCON", cw1Var);
                                    } else if (i7 == 6779504) {
                                        objE = hn.E(iB5, "TIT1", cw1Var);
                                    } else if (i7 == 7173742) {
                                        objE = hn.E(iB5, "MVNM", cw1Var);
                                    } else if (i7 == 7173737) {
                                        objE = hn.H(iB5, "MVIN", cw1Var, true, false);
                                    } else {
                                        String strA = c9.a(iB5);
                                        StringBuilder sb = new StringBuilder(strA.length() + 32);
                                        sb.append("Skipped unknown metadata entry: ");
                                        sb.append(strA);
                                        s90.C("MetadataUtil", sb.toString());
                                        objE = null;
                                    }
                                } else if (iB5 == 1735291493) {
                                    try {
                                        String strA2 = cg0.a(hn.J(cw1Var) - 1);
                                        if (strA2 != null) {
                                            objE = new gg0("TCON", str2, vj2.i(strA2));
                                        } else {
                                            s90.Q("MetadataUtil", "Failed to parse standard genre code");
                                            objE = str2;
                                        }
                                    } catch (Throwable th) {
                                        cw1Var.E(iB4);
                                        throw th;
                                    }
                                } else if (iB5 == 1684632427) {
                                    objE = hn.L(1684632427, "TPOS", cw1Var);
                                } else if (iB5 == 1953655662) {
                                    objE = hn.L(1953655662, "TRCK", cw1Var);
                                } else if (iB5 == 1953329263) {
                                    objE = hn.H(1953329263, "TBPM", cw1Var, z3, r3);
                                } else if (iB5 == 1668311404) {
                                    objE = hn.H(1668311404, "TCMP", cw1Var, z3, z3);
                                } else if (iB5 == 1668249202) {
                                    int iB7 = cw1Var.b();
                                    if (cw1Var.b() == 1684108385) {
                                        int iB8 = cw1Var.b() & 16777215;
                                        if (iB8 == 13) {
                                            str = "image/jpeg";
                                        } else if (iB8 == 14) {
                                            str = "image/png";
                                            iB8 = 14;
                                        } else {
                                            str = str2;
                                        }
                                        if (str == null) {
                                            StringBuilder sb2 = new StringBuilder(String.valueOf(iB8).length() + 30);
                                            sb2.append("Unrecognized cover art flags: ");
                                            sb2.append(iB8);
                                            s90.Q("MetadataUtil", sb2.toString());
                                        } else {
                                            cw1Var.G(4);
                                            int i8 = iB7 - 16;
                                            byte[] bArr = new byte[i8];
                                            cw1Var.H(bArr, r3, i8);
                                            objE = new tf0(str, str2, 3, bArr);
                                        }
                                    } else {
                                        s90.Q("MetadataUtil", "Failed to parse cover art attribute");
                                    }
                                    objE = str2;
                                } else if (iB5 == 1631670868) {
                                    objE = hn.E(1631670868, "TPE2", cw1Var);
                                } else if (iB5 == 1936682605) {
                                    objE = hn.E(1936682605, "TSOT", cw1Var);
                                } else if (iB5 == 1936679276) {
                                    objE = hn.E(1936679276, "TSOA", cw1Var);
                                } else if (iB5 == 1936679282) {
                                    objE = hn.E(1936679282, "TSOP", cw1Var);
                                } else if (iB5 == 1936679265) {
                                    objE = hn.E(1936679265, "TSO2", cw1Var);
                                } else if (iB5 == 1936679791) {
                                    objE = hn.E(1936679791, "TSOC", cw1Var);
                                } else if (iB5 == 1920233063) {
                                    objE = hn.H(1920233063, "ITUNESADVISORY", cw1Var, r3, r3);
                                } else if (iB5 == 1885823344) {
                                    objE = hn.H(1885823344, "ITUNESGAPLESS", cw1Var, r3, z3);
                                } else if (iB5 == 1936683886) {
                                    objE = hn.E(1936683886, "TVSHOWSORT", cw1Var);
                                } else if (iB5 == 1953919848) {
                                    objE = hn.E(1953919848, "TVSHOW", cw1Var);
                                } else {
                                    if (iB5 == 757935405) {
                                        String strL2 = str2;
                                        String strL3 = strL2;
                                        int i9 = -1;
                                        int i10 = -1;
                                        while (true) {
                                            int i11 = cw1Var.b;
                                            if (i11 >= iB4) {
                                                break;
                                            }
                                            int iB9 = cw1Var.b();
                                            int iB10 = cw1Var.b();
                                            cw1Var.G(4);
                                            if (iB10 == 1835360622) {
                                                strL2 = cw1Var.l(iB9 - 12);
                                            } else {
                                                int i12 = iB9 - 12;
                                                if (iB10 == 1851878757) {
                                                    strL3 = cw1Var.l(i12);
                                                } else {
                                                    if (iB10 == 1684108385) {
                                                        i10 = iB9;
                                                    }
                                                    if (iB10 == 1684108385) {
                                                        i9 = i11;
                                                    }
                                                    cw1Var.G(i12);
                                                }
                                            }
                                        }
                                        if (strL2 != null && strL3 != null && i9 != -1) {
                                            cw1Var.E(i9);
                                            cw1Var.G(16);
                                            objE = new dg0(strL2, strL3, cw1Var.l(i10 - 16));
                                        }
                                    } else {
                                        String strA3 = c9.a(iB5);
                                        StringBuilder sb3 = new StringBuilder(strA3.length() + 32);
                                        sb3.append("Skipped unknown metadata entry: ");
                                        sb3.append(strA3);
                                        s90.C("MetadataUtil", sb3.toString());
                                    }
                                    objE = null;
                                }
                                cw1Var.E(iB4);
                                if (objE != null) {
                                    arrayList.add(objE);
                                }
                                r3 = 0;
                                z3 = true;
                                str2 = null;
                            }
                            if (!arrayList.isEmpty()) {
                                am0Var3 = new am0(arrayList);
                                break;
                            }
                            break;
                        }
                        cw1Var.E(iB3);
                        i2 = 8;
                        z4 = false;
                        z3 = true;
                        str2 = null;
                    }
                    am0Var3 = null;
                    break;
                }
                am0Var4 = am0Var4.b(am0Var3);
                i = 8;
            } else if (iB2 == 1936553057) {
                cw1Var.E(i3);
                cw1Var.G(12);
                while (true) {
                    int i13 = cw1Var.b;
                    if (i13 < iB) {
                        int iB11 = cw1Var.b();
                        if (cw1Var.b() == 1935766900) {
                            if (iB11 >= 16) {
                                cw1Var.G(4);
                                int i14 = 0;
                                int i15 = -1;
                                for (int i16 = 0; i16 < 2; i16++) {
                                    int iK = cw1Var.K();
                                    int iK2 = cw1Var.K();
                                    if (iK == 0) {
                                        i15 = iK2;
                                    } else if (iK == 1) {
                                        i14 = iK2;
                                    }
                                }
                                if (i15 == 12) {
                                    iF = 240;
                                } else if (i15 == 13) {
                                    iF = 120;
                                } else {
                                    if (i15 != 21) {
                                        iF = -2147483647;
                                    } else {
                                        i = 8;
                                        if (cw1Var.B() < 8 || cw1Var.b + 8 > iB) {
                                            iF = -2147483647;
                                        } else {
                                            int iB12 = cw1Var.b();
                                            int iB13 = cw1Var.b();
                                            if (iB12 < 12 || iB13 != 1936877170) {
                                                iF = -2147483647;
                                            } else {
                                                iF = cw1Var.f();
                                            }
                                        }
                                    }
                                    if (iF == -2147483647) {
                                        am0Var2 = new am0(new lg0(i14, iF));
                                    }
                                    am0Var4 = am0Var4.b(am0Var2);
                                }
                                i = 8;
                                if (iF == -2147483647) {
                                    am0Var2 = new am0(new lg0(i14, iF));
                                }
                                am0Var4 = am0Var4.b(am0Var2);
                            }
                            am0Var2 = null;
                            am0Var4 = am0Var4.b(am0Var2);
                        } else {
                            cw1Var.E(i13 + iB11);
                        }
                    }
                    i = 8;
                    am0Var2 = null;
                    am0Var4 = am0Var4.b(am0Var2);
                }
            } else {
                i = 8;
                if (iB2 == -1451722374) {
                    short sN = cw1Var.N();
                    cw1Var.G(2);
                    String strK = cw1Var.k(sN, StandardCharsets.UTF_8);
                    int iMax = Math.max(strK.lastIndexOf(43), strK.lastIndexOf(45));
                    try {
                        try {
                            a22 a22Var = new a22(Float.parseFloat(strK.substring(0, iMax)), Float.parseFloat(strK.substring(iMax, strK.length() - 1)));
                            il0[] il0VarArr = new il0[1];
                            z = false;
                            try {
                                il0VarArr[0] = a22Var;
                                am0Var = new am0(il0VarArr);
                            } catch (IndexOutOfBoundsException | NumberFormatException unused) {
                                am0Var = null;
                            }
                        } catch (IndexOutOfBoundsException | NumberFormatException unused2) {
                            z = false;
                        }
                    } catch (IndexOutOfBoundsException | NumberFormatException unused3) {
                        z = false;
                    }
                    am0Var4 = am0Var4.b(am0Var);
                }
                cw1Var.E(iB);
                i2 = i;
                z2 = z;
            }
            z = false;
            cw1Var.E(iB);
            i2 = i;
            z2 = z;
        }
        return am0Var4;
    }

    public static k22 d(cw1 cw1Var) {
        long jD;
        long jD2;
        cw1Var.E(8);
        if (a(cw1Var.b()) == 0) {
            jD = cw1Var.P();
            jD2 = cw1Var.P();
        } else {
            jD = cw1Var.d();
            jD2 = cw1Var.d();
        }
        return new k22(jD, jD2, cw1Var.P());
    }

    public static am0 e(i12 i12Var) {
        v02 v02Var;
        l12 l12VarB = i12Var.b(1751411826);
        l12 l12VarB2 = i12Var.b(1801812339);
        l12 l12VarB3 = i12Var.b(1768715124);
        if (l12VarB != null && l12VarB2 != null && l12VarB3 != null) {
            cw1 cw1Var = l12VarB.c;
            cw1Var.E(16);
            if (cw1Var.b() == 1835299937) {
                cw1 cw1Var2 = l12VarB2.c;
                cw1Var2.E(12);
                int iB = cw1Var2.b();
                String[] strArr = new String[iB];
                for (int i = 0; i < iB; i++) {
                    int iB2 = cw1Var2.b();
                    cw1Var2.G(4);
                    strArr[i] = cw1Var2.k(iB2 - 8, StandardCharsets.UTF_8);
                }
                cw1 cw1Var3 = l12VarB3.c;
                cw1Var3.E(8);
                ArrayList arrayList = new ArrayList();
                while (cw1Var3.B() > 8) {
                    int iB3 = cw1Var3.b() + cw1Var3.b;
                    int iB4 = cw1Var3.b() - 1;
                    if (iB4 < 0 || iB4 >= iB) {
                        ec.u(new StringBuilder(String.valueOf(iB4).length() + 41), "Skipped metadata with unknown key index: ", iB4, "BoxParsers");
                    } else {
                        String str = strArr[iB4];
                        while (true) {
                            int i2 = cw1Var3.b;
                            if (i2 >= iB3) {
                                v02Var = null;
                                break;
                            }
                            int iB5 = cw1Var3.b();
                            if (cw1Var3.b() == 1684108385) {
                                int iB6 = cw1Var3.b();
                                int iB7 = cw1Var3.b();
                                int i3 = iB5 - 16;
                                byte[] bArr = new byte[i3];
                                cw1Var3.H(bArr, 0, i3);
                                v02Var = new v02(str, bArr, iB7, iB6);
                                break;
                            }
                            cw1Var3.E(i2 + iB5);
                        }
                        if (v02Var != null) {
                            arrayList.add(v02Var);
                        }
                    }
                    cw1Var3.E(iB3);
                }
                if (!arrayList.isEmpty()) {
                    return new am0(arrayList);
                }
            }
        }
        return null;
    }

    public static void f(cw1 cw1Var) {
        int i = cw1Var.b;
        cw1Var.G(4);
        if (cw1Var.b() != 1751411826) {
            i += 4;
        }
        cw1Var.E(i);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x02ce  */
    /* JADX WARN: Code duplicated, block: B:101:0x02d1  */
    /* JADX WARN: Code duplicated, block: B:104:0x02d7  */
    /* JADX WARN: Code duplicated, block: B:106:0x02db A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:112:0x02ef A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:113:0x02f1  */
    /* JADX WARN: Code duplicated, block: B:114:0x02ff  */
    /* JADX WARN: Code duplicated, block: B:115:0x0302  */
    /* JADX WARN: Code duplicated, block: B:120:0x032a A[DONT_INVERT, LOOP:15: B:120:0x032a->B:124:0x0335, LOOP_START, PHI: r34
  0x032a: PHI (r34v2 int) = (r34v1 int), (r34v3 int) binds: [B:119:0x0328, B:124:0x0335] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:121:0x032c  */
    /* JADX WARN: Code duplicated, block: B:124:0x0335 A[LOOP:15: B:120:0x032a->B:124:0x0335, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:125:0x033b A[EDGE_INSN: B:125:0x033b->B:126:0x033d BREAK  A[LOOP:15: B:120:0x032a->B:124:0x0335]] */
    /* JADX WARN: Code duplicated, block: B:127:0x033f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:128:0x0341 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:129:0x0343 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:130:0x0345 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:131:0x0347 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:132:0x0349  */
    /* JADX WARN: Code duplicated, block: B:133:0x0357  */
    /* JADX WARN: Code duplicated, block: B:134:0x0365  */
    /* JADX WARN: Code duplicated, block: B:136:0x0373  */
    /* JADX WARN: Code duplicated, block: B:138:0x0380  */
    /* JADX WARN: Code duplicated, block: B:139:0x038c  */
    /* JADX WARN: Code duplicated, block: B:141:0x0399  */
    /* JADX WARN: Code duplicated, block: B:144:0x03ee  */
    /* JADX WARN: Code duplicated, block: B:145:0x03f1  */
    /* JADX WARN: Code duplicated, block: B:150:0x0436  */
    /* JADX WARN: Code duplicated, block: B:155:0x0461  */
    /* JADX WARN: Code duplicated, block: B:158:0x0479  */
    /* JADX WARN: Code duplicated, block: B:160:0x0486  */
    /* JADX WARN: Code duplicated, block: B:162:0x048a  */
    /* JADX WARN: Code duplicated, block: B:188:0x053c  */
    /* JADX WARN: Code duplicated, block: B:189:0x0544  */
    /* JADX WARN: Code duplicated, block: B:192:0x0551  */
    /* JADX WARN: Code duplicated, block: B:194:0x0559  */
    /* JADX WARN: Code duplicated, block: B:197:0x0563 A[LOOP:4: B:195:0x0560->B:197:0x0563, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:200:0x058c  */
    /* JADX WARN: Code duplicated, block: B:203:0x059b  */
    /* JADX WARN: Code duplicated, block: B:204:0x059d  */
    /* JADX WARN: Code duplicated, block: B:208:0x05b0  */
    /* JADX WARN: Code duplicated, block: B:210:0x05bb  */
    /* JADX WARN: Code duplicated, block: B:212:0x05e0  */
    /* JADX WARN: Code duplicated, block: B:213:0x05e2 A[LOOP:9: B:213:0x05e2->B:218:0x05f0, LOOP_START, PHI: r0
  0x05e2: PHI (r0v65 int) = (r0v64 int), (r0v70 int) binds: [B:211:0x05de, B:218:0x05f0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:220:0x05f4  */
    /* JADX WARN: Code duplicated, block: B:221:0x05f6  */
    /* JADX WARN: Code duplicated, block: B:229:0x060f  */
    /* JADX WARN: Code duplicated, block: B:241:0x0632  */
    /* JADX WARN: Code duplicated, block: B:243:0x063a A[LOOP:8: B:239:0x062b->B:243:0x063a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:246:0x0646  */
    /* JADX WARN: Code duplicated, block: B:247:0x0648  */
    /* JADX WARN: Code duplicated, block: B:249:0x064f  */
    /* JADX WARN: Code duplicated, block: B:253:0x0663  */
    /* JADX WARN: Code duplicated, block: B:254:0x0665  */
    /* JADX WARN: Code duplicated, block: B:257:0x066a  */
    /* JADX WARN: Code duplicated, block: B:258:0x066d  */
    /* JADX WARN: Code duplicated, block: B:260:0x0670  */
    /* JADX WARN: Code duplicated, block: B:262:0x0674  */
    /* JADX WARN: Code duplicated, block: B:264:0x0678  */
    /* JADX WARN: Code duplicated, block: B:266:0x067c  */
    /* JADX WARN: Code duplicated, block: B:267:0x067f  */
    /* JADX WARN: Code duplicated, block: B:271:0x068d  */
    /* JADX WARN: Code duplicated, block: B:273:0x0697  */
    /* JADX WARN: Code duplicated, block: B:276:0x06a6  */
    /* JADX WARN: Code duplicated, block: B:278:0x06ca  */
    /* JADX WARN: Code duplicated, block: B:280:0x06cf  */
    /* JADX WARN: Code duplicated, block: B:290:0x0713  */
    /* JADX WARN: Code duplicated, block: B:291:0x0729  */
    /* JADX WARN: Code duplicated, block: B:308:0x063d A[EDGE_INSN: B:308:0x063d->B:244:0x063d BREAK  A[LOOP:8: B:239:0x062b->B:243:0x063a], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:309:0x063d A[EDGE_INSN: B:309:0x063d->B:244:0x063d BREAK  A[LOOP:8: B:239:0x062b->B:243:0x063a], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:317:0x0318 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:318:0x027f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:322:0x0273 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:323:0x0278 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:325:0x02af A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:326:0x033b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:327:0x0332 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:51:0x0167  */
    /* JADX WARN: Code duplicated, block: B:59:0x0183 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:76:0x022b A[PHI: r3
  0x022b: PHI (r3v7 int) = (r3v6 int), (r3v6 int), (r3v50 int), (r3v6 int) binds: [B:50:0x0165, B:57:0x017f, B:75:0x0229, B:56:0x017d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:78:0x0254  */
    /* JADX WARN: Code duplicated, block: B:80:0x025c  */
    /* JADX WARN: Code duplicated, block: B:82:0x0264 A[LOOP:13: B:79:0x025a->B:82:0x0264, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:88:0x029d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:90:0x02a0 A[ADDED_TO_REGION, LOOP:14: B:90:0x02a0->B:92:0x02a4, LOOP_START, PHI: r8 r33 r34
  0x02a0: PHI (r8v11 int) = (r8v4 int), (r8v12 int) binds: [B:88:0x029d, B:92:0x02a4] A[DONT_GENERATE, DONT_INLINE]
  0x02a0: PHI (r33v3 int) = (r33v1 int), (r33v7 int) binds: [B:88:0x029d, B:92:0x02a4] A[DONT_GENERATE, DONT_INLINE]
  0x02a0: PHI (r34v5 int) = (r34v1 int), (r34v6 int) binds: [B:88:0x029d, B:92:0x02a4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:91:0x02a2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:92:0x02a4 A[LOOP:14: B:90:0x02a0->B:92:0x02a4, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:97:0x02c0  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r18v20 */
    /* JADX WARN: Type inference failed for: r18v21 */
    /* JADX WARN: Type inference failed for: r18v22 */
    /* JADX WARN: Type inference failed for: r18v34 */
    /* JADX WARN: Type inference failed for: r18v35 */
    /* JADX WARN: Type inference failed for: r18v36 */
    public static zh0 g(wh0 wh0Var, i12 i12Var, wd0 wd0Var) throws no0 {
        hh0 hh0Var;
        boolean z;
        int iH;
        int iH2;
        int iH3;
        int i;
        int iC;
        cw1 cw1Var;
        de3 de3Var;
        long[] jArr;
        int[] iArr;
        long[] jArr2;
        int[] iArr2;
        int i2;
        hh0 hh0Var2;
        int iH4;
        long j;
        long j2;
        int iH5;
        int i3;
        int i4;
        int i5;
        int iH6;
        int i6;
        int i7;
        long j3;
        int iB;
        de3 de3Var2;
        wh0 wh0Var2;
        int[] iArr3;
        long[] jArrCopyOf;
        int[] iArrCopyOf;
        long[] jArr3;
        long j4;
        int i8;
        long j5;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        long j6;
        long j7;
        int i14;
        String str;
        long j8;
        int i15;
        ?? r18;
        int i16;
        ?? r19;
        int iH7;
        int[] iArr4;
        int i17;
        int i18;
        boolean zA;
        int[] iArr5;
        int[] iArr6;
        long j9;
        wh0 wh0VarA;
        de3 de3Var3;
        int i19;
        long[] jArr4;
        long j10;
        long jT;
        long[] jArr5;
        int length;
        wh0 wh0Var3;
        long[] jArr6;
        long j11;
        int i20;
        long j12;
        int i21;
        long j13;
        wh0 wh0Var4;
        long[] jArr7;
        int i22;
        boolean z2;
        int[] iArr7;
        int[] iArr8;
        int i23;
        int i24;
        boolean z3;
        int i25;
        de3 de3Var4;
        int[] iArr9;
        boolean z4;
        boolean z5;
        long[] jArr8;
        int[] iArr10;
        int[] iArr11;
        long[] jArr9;
        int i26;
        boolean z6;
        int i27;
        int i28;
        long j14;
        wh0 wh0VarA2;
        long j15;
        int i29;
        int i30;
        boolean z7;
        long jT2;
        boolean z8;
        boolean z9;
        int[] iArr12;
        long j16;
        int[] iArr13;
        long j17;
        int iBinarySearch;
        int i31;
        int i32;
        int i33;
        int i34;
        int i35;
        int i36;
        boolean z10;
        int i37;
        int i38;
        long j18;
        int i39;
        int length2;
        long jT3;
        String str2;
        wh0 wh0VarA3 = wh0Var;
        de3 de3Var5 = wh0VarA3.g;
        l12 l12VarB = i12Var.b(1937011578);
        if (l12VarB != null) {
            tg0 tg0Var = new tg0();
            cw1 cw1Var2 = l12VarB.c;
            tg0Var.h = cw1Var2;
            cw1Var2.E(12);
            int iH8 = cw1Var2.h();
            if ("audio/raw".equals(de3Var5.m)) {
                int iD = qz1.d(de3Var5.G) * de3Var5.E;
                if (iH8 == 0 || iH8 % iD != 0) {
                    s90.Q("BoxParsers", ec.l(new StringBuilder(String.valueOf(iD).length() + 66 + String.valueOf(iH8).length()), "Audio sample size mismatch. stsd sample size: ", iD, ", stsz sample size: ", iH8));
                    iH8 = iD;
                }
            }
            if (iH8 == 0) {
                iH8 = -1;
            }
            tg0Var.f = iH8;
            tg0Var.g = cw1Var2.h();
            hh0Var = tg0Var;
        } else {
            l12 l12VarB2 = i12Var.b(1937013298);
            if (l12VarB2 == null) {
                throw no0.a(null, "Track has no sample table size information");
            }
            ih0 ih0Var = new ih0();
            cw1 cw1Var3 = l12VarB2.c;
            ih0Var.j = cw1Var3;
            cw1Var3.E(12);
            ih0Var.g = cw1Var3.h() & 255;
            ih0Var.f = cw1Var3.h();
            hh0Var = ih0Var;
        }
        int iA = hh0Var.a();
        if (iA == 0) {
            return new zh0(wh0VarA3, new long[0], new int[0], 0, new long[0], new int[0], 0L, 0);
        }
        if (wh0VarA3.b == 2) {
            long j19 = wh0VarA3.f;
            if (j19 > 0) {
                uc3 uc3Var = new uc3(de3Var5);
                uc3Var.w = iA / (j19 / 1000000.0f);
                wh0VarA3 = wh0VarA3.a(new de3(uc3Var));
            }
        }
        l12 l12VarB3 = i12Var.b(1937007471);
        if (l12VarB3 == null) {
            l12VarB3 = i12Var.b(1668232756);
            l12VarB3.getClass();
            z = true;
        } else {
            z = false;
        }
        l12 l12VarB4 = i12Var.b(1937011555);
        l12VarB4.getClass();
        cw1 cw1Var4 = l12VarB4.c;
        l12 l12VarB5 = i12Var.b(1937011827);
        l12VarB5.getClass();
        cw1 cw1Var5 = l12VarB5.c;
        l12 l12VarB6 = i12Var.b(1937011571);
        cw1 cw1Var6 = l12VarB6 != null ? l12VarB6.c : null;
        l12 l12VarB7 = i12Var.b(1668576371);
        cw1 cw1Var7 = l12VarB7 != null ? l12VarB7.c : null;
        fh0 fh0Var = new fh0(cw1Var4, l12VarB3.c, z);
        cw1Var5.E(12);
        int iH9 = cw1Var5.h() - 1;
        int iH10 = cw1Var5.h();
        int iH11 = cw1Var5.h();
        if (cw1Var7 != null) {
            cw1Var7.E(12);
            iH = cw1Var7.h();
        } else {
            iH = 0;
        }
        if (cw1Var6 != null) {
            cw1Var6.E(12);
            iH3 = cw1Var6.h();
            if (iH3 > 0) {
                iH2 = cw1Var6.h() - 1;
            } else {
                iH2 = -1;
                i = 1;
                cw1Var6 = null;
            }
            iC = hh0Var.c();
            cw1Var = cw1Var7;
            de3Var = wh0VarA3.g;
            if (iC != -1) {
                str2 = de3Var.m;
                if (("audio/raw".equals(str2) && !"audio/g711-mlaw".equals(str2) && !"audio/g711-alaw".equals(str2)) || iH9 != 0) {
                    jArr = new long[iA];
                    iArr = new int[iA];
                    jArr2 = new long[iA];
                    int i40 = iH9;
                    iArr2 = new int[iA];
                    i2 = iH3;
                    hh0Var2 = hh0Var;
                    iH4 = iH10;
                    j = 0;
                    j2 = 0;
                    iH5 = iH2;
                    i3 = 0;
                    i4 = 0;
                    i5 = 0;
                    iH6 = 0;
                    i6 = iH;
                    i7 = i40;
                    j3 = 0;
                    iB = 0;
                    while (true) {
                        if (i4 < iA) {
                            de3Var2 = de3Var;
                            wh0Var2 = wh0VarA3;
                            iArr3 = iArr;
                            jArrCopyOf = jArr2;
                            iArrCopyOf = iArr2;
                            jArr3 = jArr;
                            break;
                        }
                        j8 = j3;
                        i15 = i5;
                        r18 = i;
                        while (true) {
                            if (i15 == 0) {
                                de3Var2 = de3Var;
                                i16 = i15;
                                r19 = r18;
                                break;
                            }
                            zA = fh0Var.a();
                            de3Var2 = de3Var;
                            if (zA) {
                                i16 = 0;
                                r19 = zA;
                                break;
                            }
                            j8 = fh0Var.d;
                            i15 = fh0Var.c;
                            wh0VarA3 = wh0VarA3;
                            de3Var = de3Var2;
                            r18 = zA;
                        }
                        wh0Var2 = wh0VarA3;
                        if (r19 == 0) {
                            s90.Q("BoxParsers", "Unexpected end of chunk data");
                            long[] jArrCopyOf2 = Arrays.copyOf(jArr, i4);
                            int[] iArrCopyOf2 = Arrays.copyOf(iArr, i4);
                            jArr3 = jArrCopyOf2;
                            iArr3 = iArrCopyOf2;
                            jArrCopyOf = Arrays.copyOf(jArr2, i4);
                            iA = i4;
                            i5 = i15;
                            iArrCopyOf = Arrays.copyOf(iArr2, i4);
                            break;
                        }
                        if (cw1Var != null) {
                            while (iH6 == 0) {
                                if (i6 > 0) {
                                    iH6 = 0;
                                    break;
                                }
                                i6--;
                                iH6 = cw1Var.h();
                                iB = cw1Var.b();
                            }
                            iH6--;
                        }
                        iH7 = hh0Var2.h();
                        iArr4 = iArr2;
                        int i41 = iA;
                        long j20 = iH7;
                        j2 += j20;
                        if (iH7 > i3) {
                            i3 = iH7;
                        }
                        jArr[i4] = j8;
                        iArr[i4] = iH7;
                        int i42 = i16;
                        jArr2[i4] = j + ((long) iB);
                        if (cw1Var6 == null) {
                            i17 = i;
                        } else {
                            i17 = 0;
                        }
                        iArr4[i4] = i17;
                        if (i4 == iH5) {
                            iArr4[i4] = i;
                        }
                        if (cw1Var6 != null) {
                            iH5 = cw1Var6.h() - 1;
                        }
                        j += (long) iH11;
                        i18 = iH4 - 1;
                        if (i18 == 0) {
                            iH4 = i18;
                        } else if (i7 > 0) {
                            i7--;
                            iH4 = cw1Var5.h();
                            iH11 = cw1Var5.b();
                        } else {
                            iH4 = 0;
                        }
                        long j21 = j8 + j20;
                        i5 = i42 - 1;
                        i4++;
                        iA = i41;
                        iArr2 = iArr4;
                        wh0VarA3 = wh0Var2;
                        j3 = j21;
                        de3Var = de3Var2;
                    }
                    j4 = j + ((long) iB);
                    if (cw1Var != null) {
                        i8 = i;
                        break;
                    }
                    while (true) {
                        if (i6 > 0) {
                            i8 = i;
                            break;
                        }
                        if (cw1Var.h() != 0) {
                            i8 = 0;
                            break;
                        }
                        cw1Var.b();
                        i6--;
                    }
                    if (i2 == 0) {
                        if (iH4 == 0) {
                            if (i5 == 0) {
                                wh0Var2 = wh0Var2;
                                j5 = j4;
                                i8 = i8;
                                i5 = i5;
                                i9 = 0;
                                i10 = 0;
                            } else if (i7 == 0) {
                                wh0Var2 = wh0Var2;
                                j5 = j4;
                                i8 = i8;
                                i9 = 0;
                                i10 = 0;
                                i5 = 0;
                            } else if (iH6 == 0) {
                                wh0Var2 = wh0Var2;
                                j5 = j4;
                                i8 = i8;
                                i9 = 0;
                                i10 = 0;
                                i5 = 0;
                                i11 = 0;
                                i12 = iH6;
                                int i43 = wh0Var2.a;
                                int length3 = String.valueOf(i11).length() + String.valueOf(i5).length() + String.valueOf(i10).length() + String.valueOf(i9).length() + String.valueOf(i43).length() + 66 + 35 + 26 + 33 + 36;
                                int length4 = String.valueOf(i12).length();
                                if (i != i8) {
                                    str = ", ctts invalid";
                                } else {
                                    str = "";
                                }
                                StringBuilder sb = new StringBuilder(str.length() + length3 + length4);
                                ec.v(sb, "Inconsistent stbl box for track ", i43, ": remainingSynchronizationSamples ", i9);
                                ec.v(sb, ", remainingSamplesAtTimestampDelta ", i10, ", remainingSamplesInChunk ", i5);
                                ec.v(sb, ", remainingTimestampDeltaChanges ", i11, ", remainingSamplesAtTimestampOffset ", i12);
                                sb.append(str);
                                s90.Q("BoxParsers", sb.toString());
                            } else if (i8 == 0) {
                                wh0Var2 = wh0Var2;
                                j5 = j4;
                                i9 = 0;
                                i10 = 0;
                                i5 = 0;
                                i11 = 0;
                                i12 = 0;
                                i8 = 0;
                                int i44 = wh0Var2.a;
                                int length5 = String.valueOf(i11).length() + String.valueOf(i5).length() + String.valueOf(i10).length() + String.valueOf(i9).length() + String.valueOf(i44).length() + 66 + 35 + 26 + 33 + 36;
                                int length6 = String.valueOf(i12).length();
                                if (i != i8) {
                                    str = ", ctts invalid";
                                } else {
                                    str = "";
                                }
                                StringBuilder sb2 = new StringBuilder(str.length() + length5 + length6);
                                ec.v(sb2, "Inconsistent stbl box for track ", i44, ": remainingSynchronizationSamples ", i9);
                                ec.v(sb2, ", remainingSamplesAtTimestampDelta ", i10, ", remainingSamplesInChunk ", i5);
                                ec.v(sb2, ", remainingTimestampDeltaChanges ", i11, ", remainingSamplesAtTimestampOffset ", i12);
                                sb2.append(str);
                                s90.Q("BoxParsers", sb2.toString());
                            } else {
                                wh0Var2 = wh0Var2;
                                j5 = j4;
                            }
                            i11 = i7;
                            i12 = iH6;
                            int i45 = wh0Var2.a;
                            int length7 = String.valueOf(i11).length() + String.valueOf(i5).length() + String.valueOf(i10).length() + String.valueOf(i9).length() + String.valueOf(i45).length() + 66 + 35 + 26 + 33 + 36;
                            int length8 = String.valueOf(i12).length();
                            if (i != i8) {
                                str = ", ctts invalid";
                            } else {
                                str = "";
                            }
                            StringBuilder sb3 = new StringBuilder(str.length() + length7 + length8);
                            ec.v(sb3, "Inconsistent stbl box for track ", i45, ": remainingSynchronizationSamples ", i9);
                            ec.v(sb3, ", remainingSamplesAtTimestampDelta ", i10, ", remainingSamplesInChunk ", i5);
                            ec.v(sb3, ", remainingTimestampDeltaChanges ", i11, ", remainingSamplesAtTimestampOffset ", i12);
                            sb3.append(str);
                            s90.Q("BoxParsers", sb3.toString());
                        } else {
                            j5 = j4;
                            i9 = 0;
                        }
                        i13 = iA;
                        j6 = j5;
                        j7 = j2;
                        i14 = i3;
                    } else {
                        j5 = j4;
                        i9 = i2;
                    }
                    i10 = iH4;
                    i11 = i7;
                    i12 = iH6;
                    int i46 = wh0Var2.a;
                    int length9 = String.valueOf(i11).length() + String.valueOf(i5).length() + String.valueOf(i10).length() + String.valueOf(i9).length() + String.valueOf(i46).length() + 66 + 35 + 26 + 33 + 36;
                    int length10 = String.valueOf(i12).length();
                    if (i != i8) {
                        str = ", ctts invalid";
                    } else {
                        str = "";
                    }
                    StringBuilder sb4 = new StringBuilder(str.length() + length9 + length10);
                    ec.v(sb4, "Inconsistent stbl box for track ", i46, ": remainingSynchronizationSamples ", i9);
                    ec.v(sb4, ", remainingSamplesAtTimestampDelta ", i10, ", remainingSamplesInChunk ", i5);
                    ec.v(sb4, ", remainingTimestampDeltaChanges ", i11, ", remainingSamplesAtTimestampOffset ", i12);
                    sb4.append(str);
                    s90.Q("BoxParsers", sb4.toString());
                    i13 = iA;
                    j6 = j5;
                    j7 = j2;
                    i14 = i3;
                } else if (iH == 0 || iH3 != 0) {
                    iH9 = 0;
                    jArr = new long[iA];
                    iArr = new int[iA];
                    jArr2 = new long[iA];
                    int i47 = iH9;
                    iArr2 = new int[iA];
                    i2 = iH3;
                    hh0Var2 = hh0Var;
                    iH4 = iH10;
                    j = 0;
                    j2 = 0;
                    iH5 = iH2;
                    i3 = 0;
                    i4 = 0;
                    i5 = 0;
                    iH6 = 0;
                    i6 = iH;
                    i7 = i47;
                    j3 = 0;
                    iB = 0;
                    while (true) {
                        if (i4 < iA) {
                            de3Var2 = de3Var;
                            wh0Var2 = wh0VarA3;
                            iArr3 = iArr;
                            jArrCopyOf = jArr2;
                            iArrCopyOf = iArr2;
                            jArr3 = jArr;
                            break;
                        }
                        j8 = j3;
                        i15 = i5;
                        r18 = i;
                        while (true) {
                            if (i15 == 0) {
                                de3Var2 = de3Var;
                                i16 = i15;
                                r19 = r18;
                                break;
                            }
                            zA = fh0Var.a();
                            de3Var2 = de3Var;
                            if (zA) {
                                i16 = 0;
                                r19 = zA;
                                break;
                            }
                            j8 = fh0Var.d;
                            i15 = fh0Var.c;
                            wh0VarA3 = wh0VarA3;
                            de3Var = de3Var2;
                            r18 = zA;
                        }
                        wh0Var2 = wh0VarA3;
                        if (r19 == 0) {
                            s90.Q("BoxParsers", "Unexpected end of chunk data");
                            long[] jArrCopyOf3 = Arrays.copyOf(jArr, i4);
                            int[] iArrCopyOf3 = Arrays.copyOf(iArr, i4);
                            jArr3 = jArrCopyOf3;
                            iArr3 = iArrCopyOf3;
                            jArrCopyOf = Arrays.copyOf(jArr2, i4);
                            iA = i4;
                            i5 = i15;
                            iArrCopyOf = Arrays.copyOf(iArr2, i4);
                            break;
                        }
                        if (cw1Var != null) {
                            while (iH6 == 0) {
                                if (i6 > 0) {
                                    iH6 = 0;
                                    break;
                                }
                                i6--;
                                iH6 = cw1Var.h();
                                iB = cw1Var.b();
                            }
                            iH6--;
                        }
                        iH7 = hh0Var2.h();
                        iArr4 = iArr2;
                        int i48 = iA;
                        long j22 = iH7;
                        j2 += j22;
                        if (iH7 > i3) {
                            i3 = iH7;
                        }
                        jArr[i4] = j8;
                        iArr[i4] = iH7;
                        int i49 = i16;
                        jArr2[i4] = j + ((long) iB);
                        if (cw1Var6 == null) {
                            i17 = i;
                        } else {
                            i17 = 0;
                        }
                        iArr4[i4] = i17;
                        if (i4 == iH5) {
                            iArr4[i4] = i;
                        }
                        if (cw1Var6 != null && i4 == iH5 && (i2 = i2 - 1) > 0) {
                            iH5 = cw1Var6.h() - 1;
                        }
                        j += (long) iH11;
                        i18 = iH4 - 1;
                        if (i18 == 0) {
                            iH4 = i18;
                        } else if (i7 > 0) {
                            i7--;
                            iH4 = cw1Var5.h();
                            iH11 = cw1Var5.b();
                        } else {
                            iH4 = 0;
                        }
                        long j23 = j8 + j22;
                        i5 = i49 - 1;
                        i4++;
                        iA = i48;
                        iArr2 = iArr4;
                        wh0VarA3 = wh0Var2;
                        j3 = j23;
                        de3Var = de3Var2;
                    }
                    j4 = j + ((long) iB);
                    if (cw1Var != null) {
                        i8 = i;
                        break;
                    }
                    while (true) {
                        if (i6 > 0) {
                            i8 = i;
                            break;
                        }
                        if (cw1Var.h() != 0) {
                            i8 = 0;
                            break;
                        }
                        cw1Var.b();
                        i6--;
                    }
                    if (i2 == 0) {
                        if (iH4 == 0) {
                            if (i5 == 0) {
                                wh0Var2 = wh0Var2;
                                j5 = j4;
                                i8 = i8;
                                i5 = i5;
                                i9 = 0;
                                i10 = 0;
                            } else if (i7 == 0) {
                                wh0Var2 = wh0Var2;
                                j5 = j4;
                                i8 = i8;
                                i9 = 0;
                                i10 = 0;
                                i5 = 0;
                            } else if (iH6 == 0) {
                                wh0Var2 = wh0Var2;
                                j5 = j4;
                                i8 = i8;
                                i9 = 0;
                                i10 = 0;
                                i5 = 0;
                                i11 = 0;
                                i12 = iH6;
                                int i410 = wh0Var2.a;
                                int length11 = String.valueOf(i11).length() + String.valueOf(i5).length() + String.valueOf(i10).length() + String.valueOf(i9).length() + String.valueOf(i410).length() + 66 + 35 + 26 + 33 + 36;
                                int length12 = String.valueOf(i12).length();
                                if (i != i8) {
                                    str = ", ctts invalid";
                                } else {
                                    str = "";
                                }
                                StringBuilder sb5 = new StringBuilder(str.length() + length11 + length12);
                                ec.v(sb5, "Inconsistent stbl box for track ", i410, ": remainingSynchronizationSamples ", i9);
                                ec.v(sb5, ", remainingSamplesAtTimestampDelta ", i10, ", remainingSamplesInChunk ", i5);
                                ec.v(sb5, ", remainingTimestampDeltaChanges ", i11, ", remainingSamplesAtTimestampOffset ", i12);
                                sb5.append(str);
                                s90.Q("BoxParsers", sb5.toString());
                            } else if (i8 == 0) {
                                wh0Var2 = wh0Var2;
                                j5 = j4;
                                i9 = 0;
                                i10 = 0;
                                i5 = 0;
                                i11 = 0;
                                i12 = 0;
                                i8 = 0;
                                int i411 = wh0Var2.a;
                                int length13 = String.valueOf(i11).length() + String.valueOf(i5).length() + String.valueOf(i10).length() + String.valueOf(i9).length() + String.valueOf(i411).length() + 66 + 35 + 26 + 33 + 36;
                                int length14 = String.valueOf(i12).length();
                                if (i != i8) {
                                    str = ", ctts invalid";
                                } else {
                                    str = "";
                                }
                                StringBuilder sb6 = new StringBuilder(str.length() + length13 + length14);
                                ec.v(sb6, "Inconsistent stbl box for track ", i411, ": remainingSynchronizationSamples ", i9);
                                ec.v(sb6, ", remainingSamplesAtTimestampDelta ", i10, ", remainingSamplesInChunk ", i5);
                                ec.v(sb6, ", remainingTimestampDeltaChanges ", i11, ", remainingSamplesAtTimestampOffset ", i12);
                                sb6.append(str);
                                s90.Q("BoxParsers", sb6.toString());
                            } else {
                                wh0Var2 = wh0Var2;
                                j5 = j4;
                            }
                            i11 = i7;
                            i12 = iH6;
                            int i412 = wh0Var2.a;
                            int length15 = String.valueOf(i11).length() + String.valueOf(i5).length() + String.valueOf(i10).length() + String.valueOf(i9).length() + String.valueOf(i412).length() + 66 + 35 + 26 + 33 + 36;
                            int length16 = String.valueOf(i12).length();
                            if (i != i8) {
                                str = ", ctts invalid";
                            } else {
                                str = "";
                            }
                            StringBuilder sb7 = new StringBuilder(str.length() + length15 + length16);
                            ec.v(sb7, "Inconsistent stbl box for track ", i412, ": remainingSynchronizationSamples ", i9);
                            ec.v(sb7, ", remainingSamplesAtTimestampDelta ", i10, ", remainingSamplesInChunk ", i5);
                            ec.v(sb7, ", remainingTimestampDeltaChanges ", i11, ", remainingSamplesAtTimestampOffset ", i12);
                            sb7.append(str);
                            s90.Q("BoxParsers", sb7.toString());
                        } else {
                            j5 = j4;
                            i9 = 0;
                        }
                        i13 = iA;
                        j6 = j5;
                        j7 = j2;
                        i14 = i3;
                    } else {
                        j5 = j4;
                        i9 = i2;
                    }
                    i10 = iH4;
                    i11 = i7;
                    i12 = iH6;
                    int i413 = wh0Var2.a;
                    int length17 = String.valueOf(i11).length() + String.valueOf(i5).length() + String.valueOf(i10).length() + String.valueOf(i9).length() + String.valueOf(i413).length() + 66 + 35 + 26 + 33 + 36;
                    int length18 = String.valueOf(i12).length();
                    if (i != i8) {
                        str = ", ctts invalid";
                    } else {
                        str = "";
                    }
                    StringBuilder sb8 = new StringBuilder(str.length() + length17 + length18);
                    ec.v(sb8, "Inconsistent stbl box for track ", i413, ": remainingSynchronizationSamples ", i9);
                    ec.v(sb8, ", remainingSamplesAtTimestampDelta ", i10, ", remainingSamplesInChunk ", i5);
                    ec.v(sb8, ", remainingTimestampDeltaChanges ", i11, ", remainingSamplesAtTimestampOffset ", i12);
                    sb8.append(str);
                    s90.Q("BoxParsers", sb8.toString());
                    i13 = iA;
                    j6 = j5;
                    j7 = j2;
                    i14 = i3;
                } else {
                    int i50 = fh0Var.a;
                    long[] jArr10 = new long[i50];
                    int[] iArr14 = new int[i50];
                    while (fh0Var.a()) {
                        int i51 = fh0Var.b;
                        jArr10[i51] = fh0Var.d;
                        iArr14[i51] = fh0Var.c;
                    }
                    long j24 = iH11;
                    int i52 = 8192 / iC;
                    int i53 = 0;
                    for (int i54 = 0; i54 < i50; i54++) {
                        int i55 = iArr14[i54];
                        String str3 = qz1.a;
                        i53 += ((i55 + i52) - 1) / i52;
                    }
                    long[] jArr11 = new long[i53];
                    iArr3 = new int[i53];
                    jArrCopyOf = new long[i53];
                    iArrCopyOf = new int[i53];
                    int i56 = 0;
                    int i57 = 0;
                    int i58 = 0;
                    int i59 = 0;
                    int i60 = 0;
                    while (i58 < i50) {
                        int i61 = iArr14[i58];
                        long j25 = jArr10[i58];
                        int i62 = i60;
                        int i63 = i50;
                        int iMax = i59;
                        int i64 = i62;
                        int i65 = i57;
                        int i66 = i61;
                        while (i66 > 0) {
                            int iMin = Math.min(i52, i66);
                            jArr11[i64] = j25;
                            int i67 = i66;
                            int i68 = iC * iMin;
                            iArr3[i64] = i68;
                            int i69 = i65 + i68;
                            iMax = Math.max(iMax, i68);
                            long j26 = j24;
                            jArrCopyOf[i64] = j26 * ((long) i56);
                            iArrCopyOf[i64] = i;
                            j25 += (long) iArr3[i64];
                            i56 += iMin;
                            i66 = i67 - iMin;
                            i64++;
                            i65 = i69;
                            j24 = j26;
                        }
                        i58++;
                        int i70 = i64;
                        i59 = iMax;
                        i50 = i63;
                        i60 = i70;
                        i57 = i65;
                    }
                    j7 = i57;
                    de3Var2 = de3Var;
                    wh0Var2 = wh0VarA3;
                    j6 = j24 * ((long) i56);
                    jArr3 = jArr11;
                    i13 = i53;
                    i14 = i59;
                }
            } else {
                jArr = new long[iA];
                iArr = new int[iA];
                jArr2 = new long[iA];
                int i414 = iH9;
                iArr2 = new int[iA];
                i2 = iH3;
                hh0Var2 = hh0Var;
                iH4 = iH10;
                j = 0;
                j2 = 0;
                iH5 = iH2;
                i3 = 0;
                i4 = 0;
                i5 = 0;
                iH6 = 0;
                i6 = iH;
                i7 = i414;
                j3 = 0;
                iB = 0;
                while (true) {
                    if (i4 < iA) {
                        de3Var2 = de3Var;
                        wh0Var2 = wh0VarA3;
                        iArr3 = iArr;
                        jArrCopyOf = jArr2;
                        iArrCopyOf = iArr2;
                        jArr3 = jArr;
                        break;
                    }
                    j8 = j3;
                    i15 = i5;
                    r18 = i;
                    while (true) {
                        if (i15 == 0) {
                            de3Var2 = de3Var;
                            i16 = i15;
                            r19 = r18;
                            break;
                        }
                        zA = fh0Var.a();
                        de3Var2 = de3Var;
                        if (zA) {
                            i16 = 0;
                            r19 = zA;
                            break;
                        }
                        j8 = fh0Var.d;
                        i15 = fh0Var.c;
                        wh0VarA3 = wh0VarA3;
                        de3Var = de3Var2;
                        r18 = zA;
                    }
                    wh0Var2 = wh0VarA3;
                    if (r19 == 0) {
                        s90.Q("BoxParsers", "Unexpected end of chunk data");
                        long[] jArrCopyOf4 = Arrays.copyOf(jArr, i4);
                        int[] iArrCopyOf4 = Arrays.copyOf(iArr, i4);
                        jArr3 = jArrCopyOf4;
                        iArr3 = iArrCopyOf4;
                        jArrCopyOf = Arrays.copyOf(jArr2, i4);
                        iA = i4;
                        i5 = i15;
                        iArrCopyOf = Arrays.copyOf(iArr2, i4);
                        break;
                    }
                    if (cw1Var != null) {
                        while (iH6 == 0) {
                            if (i6 > 0) {
                                iH6 = 0;
                                break;
                            }
                            i6--;
                            iH6 = cw1Var.h();
                            iB = cw1Var.b();
                        }
                        iH6--;
                    }
                    iH7 = hh0Var2.h();
                    iArr4 = iArr2;
                    int i415 = iA;
                    long j27 = iH7;
                    j2 += j27;
                    if (iH7 > i3) {
                        i3 = iH7;
                    }
                    jArr[i4] = j8;
                    iArr[i4] = iH7;
                    int i416 = i16;
                    jArr2[i4] = j + ((long) iB);
                    if (cw1Var6 == null) {
                        i17 = i;
                    } else {
                        i17 = 0;
                    }
                    iArr4[i4] = i17;
                    if (i4 == iH5) {
                        iArr4[i4] = i;
                    }
                    if (cw1Var6 != null) {
                        iH5 = cw1Var6.h() - 1;
                    }
                    j += (long) iH11;
                    i18 = iH4 - 1;
                    if (i18 == 0) {
                        iH4 = i18;
                    } else if (i7 > 0) {
                        i7--;
                        iH4 = cw1Var5.h();
                        iH11 = cw1Var5.b();
                    } else {
                        iH4 = 0;
                    }
                    long j28 = j8 + j27;
                    i5 = i416 - 1;
                    i4++;
                    iA = i415;
                    iArr2 = iArr4;
                    wh0VarA3 = wh0Var2;
                    j3 = j28;
                    de3Var = de3Var2;
                }
                j4 = j + ((long) iB);
                if (cw1Var != null) {
                    i8 = i;
                    break;
                }
                while (true) {
                    if (i6 > 0) {
                        i8 = i;
                        break;
                    }
                    if (cw1Var.h() != 0) {
                        i8 = 0;
                        break;
                    }
                    cw1Var.b();
                    i6--;
                }
                if (i2 == 0) {
                    if (iH4 == 0) {
                        if (i5 == 0) {
                            wh0Var2 = wh0Var2;
                            j5 = j4;
                            i8 = i8;
                            i5 = i5;
                            i9 = 0;
                            i10 = 0;
                        } else if (i7 == 0) {
                            wh0Var2 = wh0Var2;
                            j5 = j4;
                            i8 = i8;
                            i9 = 0;
                            i10 = 0;
                            i5 = 0;
                        } else if (iH6 == 0) {
                            wh0Var2 = wh0Var2;
                            j5 = j4;
                            i8 = i8;
                            i9 = 0;
                            i10 = 0;
                            i5 = 0;
                            i11 = 0;
                            i12 = iH6;
                            int i417 = wh0Var2.a;
                            int length19 = String.valueOf(i11).length() + String.valueOf(i5).length() + String.valueOf(i10).length() + String.valueOf(i9).length() + String.valueOf(i417).length() + 66 + 35 + 26 + 33 + 36;
                            int length110 = String.valueOf(i12).length();
                            if (i != i8) {
                                str = ", ctts invalid";
                            } else {
                                str = "";
                            }
                            StringBuilder sb9 = new StringBuilder(str.length() + length19 + length110);
                            ec.v(sb9, "Inconsistent stbl box for track ", i417, ": remainingSynchronizationSamples ", i9);
                            ec.v(sb9, ", remainingSamplesAtTimestampDelta ", i10, ", remainingSamplesInChunk ", i5);
                            ec.v(sb9, ", remainingTimestampDeltaChanges ", i11, ", remainingSamplesAtTimestampOffset ", i12);
                            sb9.append(str);
                            s90.Q("BoxParsers", sb9.toString());
                        } else if (i8 == 0) {
                            wh0Var2 = wh0Var2;
                            j5 = j4;
                            i9 = 0;
                            i10 = 0;
                            i5 = 0;
                            i11 = 0;
                            i12 = 0;
                            i8 = 0;
                            int i418 = wh0Var2.a;
                            int length111 = String.valueOf(i11).length() + String.valueOf(i5).length() + String.valueOf(i10).length() + String.valueOf(i9).length() + String.valueOf(i418).length() + 66 + 35 + 26 + 33 + 36;
                            int length112 = String.valueOf(i12).length();
                            if (i != i8) {
                                str = ", ctts invalid";
                            } else {
                                str = "";
                            }
                            StringBuilder sb10 = new StringBuilder(str.length() + length111 + length112);
                            ec.v(sb10, "Inconsistent stbl box for track ", i418, ": remainingSynchronizationSamples ", i9);
                            ec.v(sb10, ", remainingSamplesAtTimestampDelta ", i10, ", remainingSamplesInChunk ", i5);
                            ec.v(sb10, ", remainingTimestampDeltaChanges ", i11, ", remainingSamplesAtTimestampOffset ", i12);
                            sb10.append(str);
                            s90.Q("BoxParsers", sb10.toString());
                        } else {
                            wh0Var2 = wh0Var2;
                            j5 = j4;
                        }
                        i11 = i7;
                        i12 = iH6;
                        int i419 = wh0Var2.a;
                        int length113 = String.valueOf(i11).length() + String.valueOf(i5).length() + String.valueOf(i10).length() + String.valueOf(i9).length() + String.valueOf(i419).length() + 66 + 35 + 26 + 33 + 36;
                        int length114 = String.valueOf(i12).length();
                        if (i != i8) {
                            str = ", ctts invalid";
                        } else {
                            str = "";
                        }
                        StringBuilder sb11 = new StringBuilder(str.length() + length113 + length114);
                        ec.v(sb11, "Inconsistent stbl box for track ", i419, ": remainingSynchronizationSamples ", i9);
                        ec.v(sb11, ", remainingSamplesAtTimestampDelta ", i10, ", remainingSamplesInChunk ", i5);
                        ec.v(sb11, ", remainingTimestampDeltaChanges ", i11, ", remainingSamplesAtTimestampOffset ", i12);
                        sb11.append(str);
                        s90.Q("BoxParsers", sb11.toString());
                    } else {
                        j5 = j4;
                        i9 = 0;
                    }
                    i13 = iA;
                    j6 = j5;
                    j7 = j2;
                    i14 = i3;
                } else {
                    j5 = j4;
                    i9 = i2;
                }
                i10 = iH4;
                i11 = i7;
                i12 = iH6;
                int i4110 = wh0Var2.a;
                int length115 = String.valueOf(i11).length() + String.valueOf(i5).length() + String.valueOf(i10).length() + String.valueOf(i9).length() + String.valueOf(i4110).length() + 66 + 35 + 26 + 33 + 36;
                int length116 = String.valueOf(i12).length();
                if (i != i8) {
                    str = ", ctts invalid";
                } else {
                    str = "";
                }
                StringBuilder sb12 = new StringBuilder(str.length() + length115 + length116);
                ec.v(sb12, "Inconsistent stbl box for track ", i4110, ": remainingSynchronizationSamples ", i9);
                ec.v(sb12, ", remainingSamplesAtTimestampDelta ", i10, ", remainingSamplesInChunk ", i5);
                ec.v(sb12, ", remainingTimestampDeltaChanges ", i11, ", remainingSamplesAtTimestampOffset ", i12);
                sb12.append(str);
                s90.Q("BoxParsers", sb12.toString());
                i13 = iA;
                j6 = j5;
                j7 = j2;
                i14 = i3;
            }
            iArr5 = iArr3;
            iArr6 = iArrCopyOf;
            j9 = wh0Var2.f;
            if (j9 > 0) {
                jT3 = qz1.t(j7 * 8, 1000000L, j9, RoundingMode.HALF_DOWN);
                if (jT3 > 0 || jT3 >= 2147483647L) {
                    wh0VarA = wh0Var2;
                } else {
                    uc3 uc3Var2 = new uc3(de3Var2);
                    uc3Var2.g = (int) jT3;
                    wh0VarA = wh0Var2.a(new de3(uc3Var2));
                }
            } else {
                wh0VarA = wh0Var2;
            }
            de3Var3 = wh0VarA.g;
            i19 = wh0VarA.b;
            jArr4 = wh0VarA.j;
            j10 = wh0VarA.c;
            RoundingMode roundingMode = RoundingMode.DOWN;
            jT = qz1.t(j6, 1000000L, j10, roundingMode);
            jArr5 = wh0VarA.i;
            if (jArr5 == null) {
                qz1.u(jArrCopyOf, j10);
                return new zh0(wh0VarA, jArr3, iArr5, i14, jArrCopyOf, iArr6, jT, i13);
            }
            length = jArr5.length;
            if (length == 1) {
                if (i19 == 1 || (length2 = jArrCopyOf.length) < 2) {
                    wh0Var3 = wh0VarA;
                    jArr6 = jArr4;
                    j11 = j6;
                    j12 = j10;
                } else {
                    jArr4.getClass();
                    long j29 = jArr4[0];
                    long j30 = jArr5[0];
                    long j31 = wh0VarA.d;
                    long jT4 = qz1.t(j30, j10, j31, roundingMode) + j29;
                    wh0 wh0Var5 = wh0VarA;
                    int i71 = length2 - 1;
                    jArr6 = jArr4;
                    j11 = j6;
                    int iMax2 = Math.max(0, Math.min(4, i71));
                    int iMax3 = Math.max(0, Math.min(length2 - 4, i71));
                    if (jArrCopyOf[0] > j29 || j29 >= jArrCopyOf[iMax2] || jArrCopyOf[iMax3] >= jT4 || jT4 > j11 + 2) {
                        wh0Var3 = wh0Var5;
                        j12 = j10;
                    } else {
                        long jMax = Math.max(0L, j11 - jT4);
                        long j32 = j29 - jArrCopyOf[0];
                        long j33 = de3Var3.F;
                        long jT5 = qz1.t(j32, j33, j10, roundingMode);
                        long jT6 = qz1.t(jMax, j33, j10, roundingMode);
                        j12 = j10;
                        if (jT5 != 0) {
                            if (jT5 <= 2147483647L && jT6 <= 2147483647L) {
                                wd0Var.a = (int) jT5;
                                wd0Var.b = (int) jT6;
                                qz1.u(jArrCopyOf, j12);
                                return new zh0(wh0Var5, jArr3, iArr5, i14, jArrCopyOf, iArr6, qz1.t(jArr5[0], 1000000L, j31, roundingMode), i13);
                            }
                        } else if (jT6 != 0) {
                            jT5 = 0;
                            if (jT5 <= 2147483647L) {
                                wd0Var.a = (int) jT5;
                                wd0Var.b = (int) jT6;
                                qz1.u(jArrCopyOf, j12);
                                return new zh0(wh0Var5, jArr3, iArr5, i14, jArrCopyOf, iArr6, qz1.t(jArr5[0], 1000000L, j31, roundingMode), i13);
                            }
                        }
                        wh0Var3 = wh0Var5;
                    }
                }
                i20 = 1;
                i21 = 1;
            } else {
                wh0Var3 = wh0VarA;
                jArr6 = jArr4;
                j11 = j6;
                i20 = length;
                j12 = j10;
                i21 = 1;
            }
            if (i20 == i21) {
                if (jArr5[0] == 0) {
                    jArr6.getClass();
                    j18 = jArr6[0];
                    for (i39 = 0; i39 < jArrCopyOf.length; i39++) {
                        jArrCopyOf[i39] = qz1.t(jArrCopyOf[i39] - j18, 1000000L, j12, RoundingMode.DOWN);
                    }
                    return new zh0(wh0Var3, jArr3, iArr5, i14, jArrCopyOf, iArr6, qz1.t(j11 - j18, 1000000L, j12, RoundingMode.DOWN), i13);
                }
                i21 = 1;
            }
            j13 = j12;
            wh0Var4 = wh0Var3;
            jArr7 = jArr3;
            i22 = i13;
            if (i19 == i21) {
                z2 = true;
            } else {
                z2 = false;
            }
            iArr7 = new int[i20];
            iArr8 = new int[i20];
            jArr6.getClass();
            i23 = 0;
            i24 = 0;
            z3 = false;
            i25 = 0;
            while (i23 < jArr5.length) {
                z9 = z2;
                iArr12 = iArr7;
                j16 = jArr6[i23];
                if (j16 != -1) {
                    iArr13 = iArr12;
                    long j34 = j13;
                    long jT7 = qz1.t(jArr5[i23], j34, wh0Var4.d, RoundingMode.DOWN);
                    j13 = j34;
                    iArr13[i23] = qz1.p(jArrCopyOf, j16, true);
                    j17 = j16 + jT7;
                    iBinarySearch = Arrays.binarySearch(jArrCopyOf, j17);
                    if (iBinarySearch < 0) {
                        i33 = ~iBinarySearch;
                    } else {
                        while (true) {
                            i31 = iBinarySearch + 1;
                            i32 = iBinarySearch;
                            if (i31 >= jArrCopyOf.length || jArrCopyOf[i31] != j17) {
                                break;
                            }
                            iBinarySearch = i31;
                        }
                        if (z9) {
                            i33 = i32;
                        } else {
                            i33 = i31;
                        }
                    }
                    iArr8[i23] = i33;
                    i34 = iArr13[i23];
                    while (true) {
                        i35 = iArr13[i23];
                        if (i35 < 0 || (iArr6[i35] & 1) != 0) {
                            break;
                        }
                        iArr13[i23] = i35 - 1;
                    }
                    if (i35 < 0) {
                        iArr13[i23] = i34;
                        while (true) {
                            i35 = iArr13[i23];
                            if (i35 >= iArr8[i23] || (iArr6[i35] & 1) != 0) {
                                break;
                            }
                            iArr13[i23] = i35 + 1;
                        }
                    }
                    if (i19 == 2 && i35 != iArr8[i23]) {
                        while (true) {
                            i37 = iArr8[i23];
                            if (i37 < jArrCopyOf.length - 1) {
                                break;
                            }
                            i38 = i37 + 1;
                            if (jArrCopyOf[i38] <= j17) {
                                break;
                            }
                            iArr8[i23] = i38;
                        }
                    }
                    int i72 = iArr8[i23];
                    i36 = iArr13[i23];
                    int i73 = (i72 - i36) + i24;
                    if (i25 != i36) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    i25 = i72;
                    z3 = z10 | z3;
                    i24 = i73;
                } else {
                    iArr13 = iArr12;
                }
                i23++;
                z2 = z9;
                iArr7 = iArr13;
                de3Var3 = de3Var3;
            }
            de3Var4 = de3Var3;
            iArr9 = iArr7;
            if (i24 != i22) {
                z4 = true;
            } else {
                z4 = false;
            }
            z5 = z4 | z3;
            if (z5) {
                jArr8 = new long[i24];
            } else {
                jArr8 = jArr7;
            }
            if (z5) {
                iArr10 = new int[i24];
            } else {
                iArr10 = iArr5;
            }
            if (true == z5) {
                i14 = 0;
            }
            if (z5) {
                iArr11 = new int[i24];
            } else {
                iArr11 = iArr6;
            }
            jArr9 = new long[i24];
            i26 = 0;
            z6 = false;
            i27 = 0;
            i28 = i14;
            j14 = 0;
            while (i26 < jArr5.length) {
                j15 = jArr6[i26];
                i29 = iArr9[i26];
                i30 = iArr8[i26];
                z7 = z5;
                if (z5) {
                    int i74 = i30 - i29;
                    System.arraycopy(jArr7, i29, jArr8, i27, i74);
                    System.arraycopy(iArr5, i29, iArr10, i27, i74);
                    System.arraycopy(iArr6, i29, iArr11, i27, i74);
                }
                int i75 = i28;
                while (i29 < i30) {
                    int[] iArr15 = iArr10;
                    int[] iArr16 = iArr11;
                    long j35 = wh0Var4.d;
                    RoundingMode roundingMode2 = RoundingMode.DOWN;
                    long jT8 = qz1.t(j14, 1000000L, j35, roundingMode2);
                    jT2 = qz1.t(jArrCopyOf[i29] - j15, 1000000L, j13, roundingMode2);
                    if (jT2 < 0) {
                        z8 = false;
                    } else {
                        z8 = true;
                    }
                    z6 = (!z8) | z6;
                    jArr9[i27] = jT8 + jT2;
                    if (!z7 && iArr15[i27] > i75) {
                        i75 = iArr5[i29];
                    }
                    i27++;
                    i29++;
                    iArr10 = iArr15;
                    iArr11 = iArr16;
                }
                j14 += jArr5[i26];
                i26++;
                i28 = i75;
                iArr10 = iArr10;
                iArr11 = iArr11;
                z5 = z7;
            }
            int[] iArr17 = iArr10;
            int[] iArr18 = iArr11;
            long jT9 = qz1.t(j14, 1000000L, wh0Var4.d, RoundingMode.DOWN);
            if (z6) {
                uc3 uc3Var3 = new uc3(de3Var4);
                uc3Var3.r = true;
                wh0VarA2 = wh0Var4.a(new de3(uc3Var3));
            } else {
                wh0VarA2 = wh0Var4;
            }
            return new zh0(wh0VarA2, jArr8, iArr17, i28, jArr9, iArr18, jT9, jArr8.length);
        }
        iH2 = -1;
        iH3 = 0;
        i = 1;
        iC = hh0Var.c();
        cw1Var = cw1Var7;
        de3Var = wh0VarA3.g;
        if (iC != -1) {
            str2 = de3Var.m;
            if ("audio/raw".equals(str2)) {
                if (iH == 0) {
                }
                iH9 = 0;
                jArr = new long[iA];
                iArr = new int[iA];
                jArr2 = new long[iA];
                int i4111 = iH9;
                iArr2 = new int[iA];
                i2 = iH3;
                hh0Var2 = hh0Var;
                iH4 = iH10;
                j = 0;
                j2 = 0;
                iH5 = iH2;
                i3 = 0;
                i4 = 0;
                i5 = 0;
                iH6 = 0;
                i6 = iH;
                i7 = i4111;
                j3 = 0;
                iB = 0;
                while (true) {
                    if (i4 < iA) {
                        de3Var2 = de3Var;
                        wh0Var2 = wh0VarA3;
                        iArr3 = iArr;
                        jArrCopyOf = jArr2;
                        iArrCopyOf = iArr2;
                        jArr3 = jArr;
                        break;
                    }
                    j8 = j3;
                    i15 = i5;
                    r18 = i;
                    while (true) {
                        if (i15 == 0) {
                            de3Var2 = de3Var;
                            i16 = i15;
                            r19 = r18;
                            break;
                        }
                        zA = fh0Var.a();
                        de3Var2 = de3Var;
                        if (zA) {
                            i16 = 0;
                            r19 = zA;
                            break;
                        }
                        j8 = fh0Var.d;
                        i15 = fh0Var.c;
                        wh0VarA3 = wh0VarA3;
                        de3Var = de3Var2;
                        r18 = zA;
                    }
                    wh0Var2 = wh0VarA3;
                    if (r19 == 0) {
                        s90.Q("BoxParsers", "Unexpected end of chunk data");
                        long[] jArrCopyOf5 = Arrays.copyOf(jArr, i4);
                        int[] iArrCopyOf5 = Arrays.copyOf(iArr, i4);
                        jArr3 = jArrCopyOf5;
                        iArr3 = iArrCopyOf5;
                        jArrCopyOf = Arrays.copyOf(jArr2, i4);
                        iA = i4;
                        i5 = i15;
                        iArrCopyOf = Arrays.copyOf(iArr2, i4);
                        break;
                    }
                    if (cw1Var != null) {
                        while (iH6 == 0) {
                            if (i6 > 0) {
                                iH6 = 0;
                                break;
                            }
                            i6--;
                            iH6 = cw1Var.h();
                            iB = cw1Var.b();
                        }
                        iH6--;
                    }
                    iH7 = hh0Var2.h();
                    iArr4 = iArr2;
                    int i4112 = iA;
                    long j210 = iH7;
                    j2 += j210;
                    if (iH7 > i3) {
                        i3 = iH7;
                    }
                    jArr[i4] = j8;
                    iArr[i4] = iH7;
                    int i4113 = i16;
                    jArr2[i4] = j + ((long) iB);
                    if (cw1Var6 == null) {
                        i17 = i;
                    } else {
                        i17 = 0;
                    }
                    iArr4[i4] = i17;
                    if (i4 == iH5) {
                        iArr4[i4] = i;
                    }
                    if (cw1Var6 != null) {
                        iH5 = cw1Var6.h() - 1;
                    }
                    j += (long) iH11;
                    i18 = iH4 - 1;
                    if (i18 == 0) {
                        iH4 = i18;
                    } else if (i7 > 0) {
                        i7--;
                        iH4 = cw1Var5.h();
                        iH11 = cw1Var5.b();
                    } else {
                        iH4 = 0;
                    }
                    long j211 = j8 + j210;
                    i5 = i4113 - 1;
                    i4++;
                    iA = i4112;
                    iArr2 = iArr4;
                    wh0VarA3 = wh0Var2;
                    j3 = j211;
                    de3Var = de3Var2;
                }
                j4 = j + ((long) iB);
                if (cw1Var != null) {
                    i8 = i;
                    break;
                }
                while (true) {
                    if (i6 > 0) {
                        i8 = i;
                        break;
                    }
                    if (cw1Var.h() != 0) {
                        i8 = 0;
                        break;
                    }
                    cw1Var.b();
                    i6--;
                }
                if (i2 == 0) {
                    if (iH4 == 0) {
                        if (i5 == 0) {
                            wh0Var2 = wh0Var2;
                            j5 = j4;
                            i8 = i8;
                            i5 = i5;
                            i9 = 0;
                            i10 = 0;
                        } else if (i7 == 0) {
                            wh0Var2 = wh0Var2;
                            j5 = j4;
                            i8 = i8;
                            i9 = 0;
                            i10 = 0;
                            i5 = 0;
                        } else if (iH6 == 0) {
                            wh0Var2 = wh0Var2;
                            j5 = j4;
                            i8 = i8;
                            i9 = 0;
                            i10 = 0;
                            i5 = 0;
                            i11 = 0;
                            i12 = iH6;
                            int i4114 = wh0Var2.a;
                            int length117 = String.valueOf(i11).length() + String.valueOf(i5).length() + String.valueOf(i10).length() + String.valueOf(i9).length() + String.valueOf(i4114).length() + 66 + 35 + 26 + 33 + 36;
                            int length118 = String.valueOf(i12).length();
                            if (i != i8) {
                                str = ", ctts invalid";
                            } else {
                                str = "";
                            }
                            StringBuilder sb13 = new StringBuilder(str.length() + length117 + length118);
                            ec.v(sb13, "Inconsistent stbl box for track ", i4114, ": remainingSynchronizationSamples ", i9);
                            ec.v(sb13, ", remainingSamplesAtTimestampDelta ", i10, ", remainingSamplesInChunk ", i5);
                            ec.v(sb13, ", remainingTimestampDeltaChanges ", i11, ", remainingSamplesAtTimestampOffset ", i12);
                            sb13.append(str);
                            s90.Q("BoxParsers", sb13.toString());
                        } else if (i8 == 0) {
                            wh0Var2 = wh0Var2;
                            j5 = j4;
                            i9 = 0;
                            i10 = 0;
                            i5 = 0;
                            i11 = 0;
                            i12 = 0;
                            i8 = 0;
                            int i4115 = wh0Var2.a;
                            int length119 = String.valueOf(i11).length() + String.valueOf(i5).length() + String.valueOf(i10).length() + String.valueOf(i9).length() + String.valueOf(i4115).length() + 66 + 35 + 26 + 33 + 36;
                            int length1110 = String.valueOf(i12).length();
                            if (i != i8) {
                                str = ", ctts invalid";
                            } else {
                                str = "";
                            }
                            StringBuilder sb14 = new StringBuilder(str.length() + length119 + length1110);
                            ec.v(sb14, "Inconsistent stbl box for track ", i4115, ": remainingSynchronizationSamples ", i9);
                            ec.v(sb14, ", remainingSamplesAtTimestampDelta ", i10, ", remainingSamplesInChunk ", i5);
                            ec.v(sb14, ", remainingTimestampDeltaChanges ", i11, ", remainingSamplesAtTimestampOffset ", i12);
                            sb14.append(str);
                            s90.Q("BoxParsers", sb14.toString());
                        } else {
                            wh0Var2 = wh0Var2;
                            j5 = j4;
                        }
                        i11 = i7;
                        i12 = iH6;
                        int i4116 = wh0Var2.a;
                        int length1111 = String.valueOf(i11).length() + String.valueOf(i5).length() + String.valueOf(i10).length() + String.valueOf(i9).length() + String.valueOf(i4116).length() + 66 + 35 + 26 + 33 + 36;
                        int length1112 = String.valueOf(i12).length();
                        if (i != i8) {
                            str = ", ctts invalid";
                        } else {
                            str = "";
                        }
                        StringBuilder sb15 = new StringBuilder(str.length() + length1111 + length1112);
                        ec.v(sb15, "Inconsistent stbl box for track ", i4116, ": remainingSynchronizationSamples ", i9);
                        ec.v(sb15, ", remainingSamplesAtTimestampDelta ", i10, ", remainingSamplesInChunk ", i5);
                        ec.v(sb15, ", remainingTimestampDeltaChanges ", i11, ", remainingSamplesAtTimestampOffset ", i12);
                        sb15.append(str);
                        s90.Q("BoxParsers", sb15.toString());
                    } else {
                        j5 = j4;
                        i9 = 0;
                    }
                    i13 = iA;
                    j6 = j5;
                    j7 = j2;
                    i14 = i3;
                } else {
                    j5 = j4;
                    i9 = i2;
                }
                i10 = iH4;
                i11 = i7;
                i12 = iH6;
                int i4117 = wh0Var2.a;
                int length1113 = String.valueOf(i11).length() + String.valueOf(i5).length() + String.valueOf(i10).length() + String.valueOf(i9).length() + String.valueOf(i4117).length() + 66 + 35 + 26 + 33 + 36;
                int length1114 = String.valueOf(i12).length();
                if (i != i8) {
                    str = ", ctts invalid";
                } else {
                    str = "";
                }
                StringBuilder sb16 = new StringBuilder(str.length() + length1113 + length1114);
                ec.v(sb16, "Inconsistent stbl box for track ", i4117, ": remainingSynchronizationSamples ", i9);
                ec.v(sb16, ", remainingSamplesAtTimestampDelta ", i10, ", remainingSamplesInChunk ", i5);
                ec.v(sb16, ", remainingTimestampDeltaChanges ", i11, ", remainingSamplesAtTimestampOffset ", i12);
                sb16.append(str);
                s90.Q("BoxParsers", sb16.toString());
                i13 = iA;
                j6 = j5;
                j7 = j2;
                i14 = i3;
            } else {
                if (iH == 0) {
                }
                iH9 = 0;
                jArr = new long[iA];
                iArr = new int[iA];
                jArr2 = new long[iA];
                int i4118 = iH9;
                iArr2 = new int[iA];
                i2 = iH3;
                hh0Var2 = hh0Var;
                iH4 = iH10;
                j = 0;
                j2 = 0;
                iH5 = iH2;
                i3 = 0;
                i4 = 0;
                i5 = 0;
                iH6 = 0;
                i6 = iH;
                i7 = i4118;
                j3 = 0;
                iB = 0;
                while (true) {
                    if (i4 < iA) {
                        de3Var2 = de3Var;
                        wh0Var2 = wh0VarA3;
                        iArr3 = iArr;
                        jArrCopyOf = jArr2;
                        iArrCopyOf = iArr2;
                        jArr3 = jArr;
                        break;
                    }
                    j8 = j3;
                    i15 = i5;
                    r18 = i;
                    while (true) {
                        if (i15 == 0) {
                            de3Var2 = de3Var;
                            i16 = i15;
                            r19 = r18;
                            break;
                        }
                        zA = fh0Var.a();
                        de3Var2 = de3Var;
                        if (zA) {
                            i16 = 0;
                            r19 = zA;
                            break;
                        }
                        j8 = fh0Var.d;
                        i15 = fh0Var.c;
                        wh0VarA3 = wh0VarA3;
                        de3Var = de3Var2;
                        r18 = zA;
                    }
                    wh0Var2 = wh0VarA3;
                    if (r19 == 0) {
                        s90.Q("BoxParsers", "Unexpected end of chunk data");
                        long[] jArrCopyOf6 = Arrays.copyOf(jArr, i4);
                        int[] iArrCopyOf6 = Arrays.copyOf(iArr, i4);
                        jArr3 = jArrCopyOf6;
                        iArr3 = iArrCopyOf6;
                        jArrCopyOf = Arrays.copyOf(jArr2, i4);
                        iA = i4;
                        i5 = i15;
                        iArrCopyOf = Arrays.copyOf(iArr2, i4);
                        break;
                    }
                    if (cw1Var != null) {
                        while (iH6 == 0) {
                            if (i6 > 0) {
                                iH6 = 0;
                                break;
                            }
                            i6--;
                            iH6 = cw1Var.h();
                            iB = cw1Var.b();
                        }
                        iH6--;
                    }
                    iH7 = hh0Var2.h();
                    iArr4 = iArr2;
                    int i4119 = iA;
                    long j212 = iH7;
                    j2 += j212;
                    if (iH7 > i3) {
                        i3 = iH7;
                    }
                    jArr[i4] = j8;
                    iArr[i4] = iH7;
                    int i41110 = i16;
                    jArr2[i4] = j + ((long) iB);
                    if (cw1Var6 == null) {
                        i17 = i;
                    } else {
                        i17 = 0;
                    }
                    iArr4[i4] = i17;
                    if (i4 == iH5) {
                        iArr4[i4] = i;
                    }
                    if (cw1Var6 != null) {
                        iH5 = cw1Var6.h() - 1;
                    }
                    j += (long) iH11;
                    i18 = iH4 - 1;
                    if (i18 == 0) {
                        iH4 = i18;
                    } else if (i7 > 0) {
                        i7--;
                        iH4 = cw1Var5.h();
                        iH11 = cw1Var5.b();
                    } else {
                        iH4 = 0;
                    }
                    long j213 = j8 + j212;
                    i5 = i41110 - 1;
                    i4++;
                    iA = i4119;
                    iArr2 = iArr4;
                    wh0VarA3 = wh0Var2;
                    j3 = j213;
                    de3Var = de3Var2;
                }
                j4 = j + ((long) iB);
                if (cw1Var != null) {
                    i8 = i;
                    break;
                }
                while (true) {
                    if (i6 > 0) {
                        i8 = i;
                        break;
                    }
                    if (cw1Var.h() != 0) {
                        i8 = 0;
                        break;
                    }
                    cw1Var.b();
                    i6--;
                }
                if (i2 == 0) {
                    if (iH4 == 0) {
                        if (i5 == 0) {
                            wh0Var2 = wh0Var2;
                            j5 = j4;
                            i8 = i8;
                            i5 = i5;
                            i9 = 0;
                            i10 = 0;
                        } else if (i7 == 0) {
                            wh0Var2 = wh0Var2;
                            j5 = j4;
                            i8 = i8;
                            i9 = 0;
                            i10 = 0;
                            i5 = 0;
                        } else if (iH6 == 0) {
                            wh0Var2 = wh0Var2;
                            j5 = j4;
                            i8 = i8;
                            i9 = 0;
                            i10 = 0;
                            i5 = 0;
                            i11 = 0;
                            i12 = iH6;
                            int i41111 = wh0Var2.a;
                            int length1115 = String.valueOf(i11).length() + String.valueOf(i5).length() + String.valueOf(i10).length() + String.valueOf(i9).length() + String.valueOf(i41111).length() + 66 + 35 + 26 + 33 + 36;
                            int length1116 = String.valueOf(i12).length();
                            if (i != i8) {
                                str = ", ctts invalid";
                            } else {
                                str = "";
                            }
                            StringBuilder sb17 = new StringBuilder(str.length() + length1115 + length1116);
                            ec.v(sb17, "Inconsistent stbl box for track ", i41111, ": remainingSynchronizationSamples ", i9);
                            ec.v(sb17, ", remainingSamplesAtTimestampDelta ", i10, ", remainingSamplesInChunk ", i5);
                            ec.v(sb17, ", remainingTimestampDeltaChanges ", i11, ", remainingSamplesAtTimestampOffset ", i12);
                            sb17.append(str);
                            s90.Q("BoxParsers", sb17.toString());
                        } else if (i8 == 0) {
                            wh0Var2 = wh0Var2;
                            j5 = j4;
                            i9 = 0;
                            i10 = 0;
                            i5 = 0;
                            i11 = 0;
                            i12 = 0;
                            i8 = 0;
                            int i41112 = wh0Var2.a;
                            int length1117 = String.valueOf(i11).length() + String.valueOf(i5).length() + String.valueOf(i10).length() + String.valueOf(i9).length() + String.valueOf(i41112).length() + 66 + 35 + 26 + 33 + 36;
                            int length1118 = String.valueOf(i12).length();
                            if (i != i8) {
                                str = ", ctts invalid";
                            } else {
                                str = "";
                            }
                            StringBuilder sb18 = new StringBuilder(str.length() + length1117 + length1118);
                            ec.v(sb18, "Inconsistent stbl box for track ", i41112, ": remainingSynchronizationSamples ", i9);
                            ec.v(sb18, ", remainingSamplesAtTimestampDelta ", i10, ", remainingSamplesInChunk ", i5);
                            ec.v(sb18, ", remainingTimestampDeltaChanges ", i11, ", remainingSamplesAtTimestampOffset ", i12);
                            sb18.append(str);
                            s90.Q("BoxParsers", sb18.toString());
                        } else {
                            wh0Var2 = wh0Var2;
                            j5 = j4;
                        }
                        i11 = i7;
                        i12 = iH6;
                        int i41113 = wh0Var2.a;
                        int length1119 = String.valueOf(i11).length() + String.valueOf(i5).length() + String.valueOf(i10).length() + String.valueOf(i9).length() + String.valueOf(i41113).length() + 66 + 35 + 26 + 33 + 36;
                        int length11110 = String.valueOf(i12).length();
                        if (i != i8) {
                            str = ", ctts invalid";
                        } else {
                            str = "";
                        }
                        StringBuilder sb19 = new StringBuilder(str.length() + length1119 + length11110);
                        ec.v(sb19, "Inconsistent stbl box for track ", i41113, ": remainingSynchronizationSamples ", i9);
                        ec.v(sb19, ", remainingSamplesAtTimestampDelta ", i10, ", remainingSamplesInChunk ", i5);
                        ec.v(sb19, ", remainingTimestampDeltaChanges ", i11, ", remainingSamplesAtTimestampOffset ", i12);
                        sb19.append(str);
                        s90.Q("BoxParsers", sb19.toString());
                    } else {
                        j5 = j4;
                        i9 = 0;
                    }
                    i13 = iA;
                    j6 = j5;
                    j7 = j2;
                    i14 = i3;
                } else {
                    j5 = j4;
                    i9 = i2;
                }
                i10 = iH4;
                i11 = i7;
                i12 = iH6;
                int i41114 = wh0Var2.a;
                int length11111 = String.valueOf(i11).length() + String.valueOf(i5).length() + String.valueOf(i10).length() + String.valueOf(i9).length() + String.valueOf(i41114).length() + 66 + 35 + 26 + 33 + 36;
                int length11112 = String.valueOf(i12).length();
                if (i != i8) {
                    str = ", ctts invalid";
                } else {
                    str = "";
                }
                StringBuilder sb110 = new StringBuilder(str.length() + length11111 + length11112);
                ec.v(sb110, "Inconsistent stbl box for track ", i41114, ": remainingSynchronizationSamples ", i9);
                ec.v(sb110, ", remainingSamplesAtTimestampDelta ", i10, ", remainingSamplesInChunk ", i5);
                ec.v(sb110, ", remainingTimestampDeltaChanges ", i11, ", remainingSamplesAtTimestampOffset ", i12);
                sb110.append(str);
                s90.Q("BoxParsers", sb110.toString());
                i13 = iA;
                j6 = j5;
                j7 = j2;
                i14 = i3;
            }
        } else {
            jArr = new long[iA];
            iArr = new int[iA];
            jArr2 = new long[iA];
            int i41115 = iH9;
            iArr2 = new int[iA];
            i2 = iH3;
            hh0Var2 = hh0Var;
            iH4 = iH10;
            j = 0;
            j2 = 0;
            iH5 = iH2;
            i3 = 0;
            i4 = 0;
            i5 = 0;
            iH6 = 0;
            i6 = iH;
            i7 = i41115;
            j3 = 0;
            iB = 0;
            while (true) {
                if (i4 < iA) {
                    de3Var2 = de3Var;
                    wh0Var2 = wh0VarA3;
                    iArr3 = iArr;
                    jArrCopyOf = jArr2;
                    iArrCopyOf = iArr2;
                    jArr3 = jArr;
                    break;
                }
                j8 = j3;
                i15 = i5;
                r18 = i;
                while (true) {
                    if (i15 == 0) {
                        de3Var2 = de3Var;
                        i16 = i15;
                        r19 = r18;
                        break;
                    }
                    zA = fh0Var.a();
                    de3Var2 = de3Var;
                    if (zA) {
                        i16 = 0;
                        r19 = zA;
                        break;
                    }
                    j8 = fh0Var.d;
                    i15 = fh0Var.c;
                    wh0VarA3 = wh0VarA3;
                    de3Var = de3Var2;
                    r18 = zA;
                }
                wh0Var2 = wh0VarA3;
                if (r19 == 0) {
                    s90.Q("BoxParsers", "Unexpected end of chunk data");
                    long[] jArrCopyOf7 = Arrays.copyOf(jArr, i4);
                    int[] iArrCopyOf7 = Arrays.copyOf(iArr, i4);
                    jArr3 = jArrCopyOf7;
                    iArr3 = iArrCopyOf7;
                    jArrCopyOf = Arrays.copyOf(jArr2, i4);
                    iA = i4;
                    i5 = i15;
                    iArrCopyOf = Arrays.copyOf(iArr2, i4);
                    break;
                }
                if (cw1Var != null) {
                    while (iH6 == 0) {
                        if (i6 > 0) {
                            iH6 = 0;
                            break;
                        }
                        i6--;
                        iH6 = cw1Var.h();
                        iB = cw1Var.b();
                    }
                    iH6--;
                }
                iH7 = hh0Var2.h();
                iArr4 = iArr2;
                int i41116 = iA;
                long j214 = iH7;
                j2 += j214;
                if (iH7 > i3) {
                    i3 = iH7;
                }
                jArr[i4] = j8;
                iArr[i4] = iH7;
                int i41117 = i16;
                jArr2[i4] = j + ((long) iB);
                if (cw1Var6 == null) {
                    i17 = i;
                } else {
                    i17 = 0;
                }
                iArr4[i4] = i17;
                if (i4 == iH5) {
                    iArr4[i4] = i;
                }
                if (cw1Var6 != null) {
                    iH5 = cw1Var6.h() - 1;
                }
                j += (long) iH11;
                i18 = iH4 - 1;
                if (i18 == 0) {
                    iH4 = i18;
                } else if (i7 > 0) {
                    i7--;
                    iH4 = cw1Var5.h();
                    iH11 = cw1Var5.b();
                } else {
                    iH4 = 0;
                }
                long j215 = j8 + j214;
                i5 = i41117 - 1;
                i4++;
                iA = i41116;
                iArr2 = iArr4;
                wh0VarA3 = wh0Var2;
                j3 = j215;
                de3Var = de3Var2;
            }
            j4 = j + ((long) iB);
            if (cw1Var != null) {
                i8 = i;
                break;
            }
            while (true) {
                if (i6 > 0) {
                    i8 = i;
                    break;
                }
                if (cw1Var.h() != 0) {
                    i8 = 0;
                    break;
                }
                cw1Var.b();
                i6--;
            }
            if (i2 == 0) {
                if (iH4 == 0) {
                    if (i5 == 0) {
                        wh0Var2 = wh0Var2;
                        j5 = j4;
                        i8 = i8;
                        i5 = i5;
                        i9 = 0;
                        i10 = 0;
                    } else if (i7 == 0) {
                        wh0Var2 = wh0Var2;
                        j5 = j4;
                        i8 = i8;
                        i9 = 0;
                        i10 = 0;
                        i5 = 0;
                    } else if (iH6 == 0) {
                        wh0Var2 = wh0Var2;
                        j5 = j4;
                        i8 = i8;
                        i9 = 0;
                        i10 = 0;
                        i5 = 0;
                        i11 = 0;
                        i12 = iH6;
                        int i41118 = wh0Var2.a;
                        int length11113 = String.valueOf(i11).length() + String.valueOf(i5).length() + String.valueOf(i10).length() + String.valueOf(i9).length() + String.valueOf(i41118).length() + 66 + 35 + 26 + 33 + 36;
                        int length11114 = String.valueOf(i12).length();
                        if (i != i8) {
                            str = ", ctts invalid";
                        } else {
                            str = "";
                        }
                        StringBuilder sb111 = new StringBuilder(str.length() + length11113 + length11114);
                        ec.v(sb111, "Inconsistent stbl box for track ", i41118, ": remainingSynchronizationSamples ", i9);
                        ec.v(sb111, ", remainingSamplesAtTimestampDelta ", i10, ", remainingSamplesInChunk ", i5);
                        ec.v(sb111, ", remainingTimestampDeltaChanges ", i11, ", remainingSamplesAtTimestampOffset ", i12);
                        sb111.append(str);
                        s90.Q("BoxParsers", sb111.toString());
                    } else if (i8 == 0) {
                        wh0Var2 = wh0Var2;
                        j5 = j4;
                        i9 = 0;
                        i10 = 0;
                        i5 = 0;
                        i11 = 0;
                        i12 = 0;
                        i8 = 0;
                        int i41119 = wh0Var2.a;
                        int length11115 = String.valueOf(i11).length() + String.valueOf(i5).length() + String.valueOf(i10).length() + String.valueOf(i9).length() + String.valueOf(i41119).length() + 66 + 35 + 26 + 33 + 36;
                        int length11116 = String.valueOf(i12).length();
                        if (i != i8) {
                            str = ", ctts invalid";
                        } else {
                            str = "";
                        }
                        StringBuilder sb112 = new StringBuilder(str.length() + length11115 + length11116);
                        ec.v(sb112, "Inconsistent stbl box for track ", i41119, ": remainingSynchronizationSamples ", i9);
                        ec.v(sb112, ", remainingSamplesAtTimestampDelta ", i10, ", remainingSamplesInChunk ", i5);
                        ec.v(sb112, ", remainingTimestampDeltaChanges ", i11, ", remainingSamplesAtTimestampOffset ", i12);
                        sb112.append(str);
                        s90.Q("BoxParsers", sb112.toString());
                    } else {
                        wh0Var2 = wh0Var2;
                        j5 = j4;
                    }
                    i11 = i7;
                    i12 = iH6;
                    int i411110 = wh0Var2.a;
                    int length11117 = String.valueOf(i11).length() + String.valueOf(i5).length() + String.valueOf(i10).length() + String.valueOf(i9).length() + String.valueOf(i411110).length() + 66 + 35 + 26 + 33 + 36;
                    int length11118 = String.valueOf(i12).length();
                    if (i != i8) {
                        str = ", ctts invalid";
                    } else {
                        str = "";
                    }
                    StringBuilder sb113 = new StringBuilder(str.length() + length11117 + length11118);
                    ec.v(sb113, "Inconsistent stbl box for track ", i411110, ": remainingSynchronizationSamples ", i9);
                    ec.v(sb113, ", remainingSamplesAtTimestampDelta ", i10, ", remainingSamplesInChunk ", i5);
                    ec.v(sb113, ", remainingTimestampDeltaChanges ", i11, ", remainingSamplesAtTimestampOffset ", i12);
                    sb113.append(str);
                    s90.Q("BoxParsers", sb113.toString());
                } else {
                    j5 = j4;
                    i9 = 0;
                }
                i13 = iA;
                j6 = j5;
                j7 = j2;
                i14 = i3;
            } else {
                j5 = j4;
                i9 = i2;
            }
            i10 = iH4;
            i11 = i7;
            i12 = iH6;
            int i411111 = wh0Var2.a;
            int length11119 = String.valueOf(i11).length() + String.valueOf(i5).length() + String.valueOf(i10).length() + String.valueOf(i9).length() + String.valueOf(i411111).length() + 66 + 35 + 26 + 33 + 36;
            int length111110 = String.valueOf(i12).length();
            if (i != i8) {
                str = ", ctts invalid";
            } else {
                str = "";
            }
            StringBuilder sb114 = new StringBuilder(str.length() + length11119 + length111110);
            ec.v(sb114, "Inconsistent stbl box for track ", i411111, ": remainingSynchronizationSamples ", i9);
            ec.v(sb114, ", remainingSamplesAtTimestampDelta ", i10, ", remainingSamplesInChunk ", i5);
            ec.v(sb114, ", remainingTimestampDeltaChanges ", i11, ", remainingSamplesAtTimestampOffset ", i12);
            sb114.append(str);
            s90.Q("BoxParsers", sb114.toString());
            i13 = iA;
            j6 = j5;
            j7 = j2;
            i14 = i3;
        }
        iArr5 = iArr3;
        iArr6 = iArrCopyOf;
        j9 = wh0Var2.f;
        if (j9 > 0) {
            jT3 = qz1.t(j7 * 8, 1000000L, j9, RoundingMode.HALF_DOWN);
            if (jT3 > 0) {
                wh0VarA = wh0Var2;
            } else {
                wh0VarA = wh0Var2;
            }
        } else {
            wh0VarA = wh0Var2;
        }
        de3Var3 = wh0VarA.g;
        i19 = wh0VarA.b;
        jArr4 = wh0VarA.j;
        j10 = wh0VarA.c;
        RoundingMode roundingMode3 = RoundingMode.DOWN;
        jT = qz1.t(j6, 1000000L, j10, roundingMode3);
        jArr5 = wh0VarA.i;
        if (jArr5 == null) {
            qz1.u(jArrCopyOf, j10);
            return new zh0(wh0VarA, jArr3, iArr5, i14, jArrCopyOf, iArr6, jT, i13);
        }
        length = jArr5.length;
        if (length == 1) {
            if (i19 == 1) {
                wh0Var3 = wh0VarA;
                jArr6 = jArr4;
                j11 = j6;
                j12 = j10;
            } else {
                wh0Var3 = wh0VarA;
                jArr6 = jArr4;
                j11 = j6;
                j12 = j10;
            }
            i20 = 1;
            i21 = 1;
        } else {
            wh0Var3 = wh0VarA;
            jArr6 = jArr4;
            j11 = j6;
            i20 = length;
            j12 = j10;
            i21 = 1;
        }
        if (i20 == i21) {
            if (jArr5[0] == 0) {
                jArr6.getClass();
                j18 = jArr6[0];
                while (i39 < jArrCopyOf.length) {
                    jArrCopyOf[i39] = qz1.t(jArrCopyOf[i39] - j18, 1000000L, j12, RoundingMode.DOWN);
                }
                return new zh0(wh0Var3, jArr3, iArr5, i14, jArrCopyOf, iArr6, qz1.t(j11 - j18, 1000000L, j12, RoundingMode.DOWN), i13);
            }
            i21 = 1;
        }
        j13 = j12;
        wh0Var4 = wh0Var3;
        jArr7 = jArr3;
        i22 = i13;
        if (i19 == i21) {
            z2 = true;
        } else {
            z2 = false;
        }
        iArr7 = new int[i20];
        iArr8 = new int[i20];
        jArr6.getClass();
        i23 = 0;
        i24 = 0;
        z3 = false;
        i25 = 0;
        while (i23 < jArr5.length) {
            z9 = z2;
            iArr12 = iArr7;
            j16 = jArr6[i23];
            if (j16 != -1) {
                iArr13 = iArr12;
                long j36 = j13;
                long jT10 = qz1.t(jArr5[i23], j36, wh0Var4.d, RoundingMode.DOWN);
                j13 = j36;
                iArr13[i23] = qz1.p(jArrCopyOf, j16, true);
                j17 = j16 + jT10;
                iBinarySearch = Arrays.binarySearch(jArrCopyOf, j17);
                if (iBinarySearch < 0) {
                    i33 = ~iBinarySearch;
                } else {
                    while (true) {
                        i31 = iBinarySearch + 1;
                        i32 = iBinarySearch;
                        if (i31 >= jArrCopyOf.length) {
                            break;
                        }
                        break;
                        break;
                        iBinarySearch = i31;
                    }
                    if (z9) {
                        i33 = i31;
                    } else {
                        i33 = i32;
                    }
                }
                iArr8[i23] = i33;
                i34 = iArr13[i23];
                while (true) {
                    i35 = iArr13[i23];
                    if (i35 < 0) {
                        break;
                    }
                    break;
                    break;
                    iArr13[i23] = i35 - 1;
                }
                if (i35 < 0) {
                    iArr13[i23] = i34;
                    while (true) {
                        i35 = iArr13[i23];
                        if (i35 >= iArr8[i23]) {
                            break;
                        }
                        break;
                        break;
                        iArr13[i23] = i35 + 1;
                    }
                }
                if (i19 == 2) {
                    while (true) {
                        i37 = iArr8[i23];
                        if (i37 < jArrCopyOf.length - 1) {
                            break;
                            break;
                        }
                        i38 = i37 + 1;
                        if (jArrCopyOf[i38] <= j17) {
                            break;
                            break;
                        }
                        iArr8[i23] = i38;
                    }
                }
                int i76 = iArr8[i23];
                i36 = iArr13[i23];
                int i77 = (i76 - i36) + i24;
                if (i25 != i36) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                i25 = i76;
                z3 = z10 | z3;
                i24 = i77;
            } else {
                iArr13 = iArr12;
            }
            i23++;
            z2 = z9;
            iArr7 = iArr13;
            de3Var3 = de3Var3;
        }
        de3Var4 = de3Var3;
        iArr9 = iArr7;
        if (i24 != i22) {
            z4 = true;
        } else {
            z4 = false;
        }
        z5 = z4 | z3;
        if (z5) {
            jArr8 = new long[i24];
        } else {
            jArr8 = jArr7;
        }
        if (z5) {
            iArr10 = new int[i24];
        } else {
            iArr10 = iArr5;
        }
        if (true == z5) {
            i14 = 0;
        }
        if (z5) {
            iArr11 = new int[i24];
        } else {
            iArr11 = iArr6;
        }
        jArr9 = new long[i24];
        i26 = 0;
        z6 = false;
        i27 = 0;
        i28 = i14;
        j14 = 0;
        while (i26 < jArr5.length) {
            j15 = jArr6[i26];
            i29 = iArr9[i26];
            i30 = iArr8[i26];
            z7 = z5;
            if (z5) {
                int i78 = i30 - i29;
                System.arraycopy(jArr7, i29, jArr8, i27, i78);
                System.arraycopy(iArr5, i29, iArr10, i27, i78);
                System.arraycopy(iArr6, i29, iArr11, i27, i78);
            }
            int i79 = i28;
            while (i29 < i30) {
                int[] iArr19 = iArr10;
                int[] iArr110 = iArr11;
                long j37 = wh0Var4.d;
                RoundingMode roundingMode4 = RoundingMode.DOWN;
                long jT11 = qz1.t(j14, 1000000L, j37, roundingMode4);
                jT2 = qz1.t(jArrCopyOf[i29] - j15, 1000000L, j13, roundingMode4);
                if (jT2 < 0) {
                    z8 = false;
                } else {
                    z8 = true;
                }
                z6 = (!z8) | z6;
                jArr9[i27] = jT11 + jT2;
                if (!z7) {
                }
                i27++;
                i29++;
                iArr10 = iArr19;
                iArr11 = iArr110;
            }
            j14 += jArr5[i26];
            i26++;
            i28 = i79;
            iArr10 = iArr10;
            iArr11 = iArr11;
            z5 = z7;
        }
        int[] iArr111 = iArr10;
        int[] iArr112 = iArr11;
        long jT12 = qz1.t(j14, 1000000L, wh0Var4.d, RoundingMode.DOWN);
        if (z6) {
            uc3 uc3Var4 = new uc3(de3Var4);
            uc3Var4.r = true;
            wh0VarA2 = wh0Var4.a(new de3(uc3Var4));
        } else {
            wh0VarA2 = wh0Var4;
        }
        return new zh0(wh0VarA2, jArr8, iArr111, i28, jArr9, iArr112, jT12, jArr8.length);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x003d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:13:0x003f  */
    /* JADX WARN: Code duplicated, block: B:14:0x0041  */
    /* JADX WARN: Code duplicated, block: B:70:0x0158  */
    /* JADX WARN: Code duplicated, block: B:76:0x0167  */
    /* JADX WARN: Code duplicated, block: B:84:0x0181 A[PHI: r3
  0x0181: PHI (r3v5 int) = (r3v4 int), (r3v4 int), (r3v8 int) binds: [B:77:0x0173, B:78:0x0175, B:83:0x0180] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:89:0x018d  */
    /* JADX WARN: Code duplicated, block: B:91:0x0198  */
    public static c43 h(cw1 cw1Var) {
        int i;
        boolean z;
        int iB;
        int iC;
        int iR;
        int iR2;
        byte[] bArr = cw1Var.a;
        oe0 oe0Var = new oe0(bArr.length, bArr);
        oe0Var.l(cw1Var.b * 8);
        oe0Var.x(1);
        int iR3 = oe0Var.r(3);
        oe0Var.o(6);
        boolean zQ = oe0Var.q();
        boolean zQ2 = oe0Var.q();
        int i2 = 12;
        int i3 = 10;
        int i4 = -1;
        if (iR3 == 2) {
            if (!zQ) {
                iR3 = 2;
                zQ = false;
                if (iR3 > 2) {
                    i = -1;
                } else if (true != zQ) {
                    i3 = 8;
                }
            } else if (true == zQ2) {
                i3 = 12;
            }
            i = i3;
        } else if (iR3 > 2) {
            if (true != zQ) {
                i3 = 8;
            }
            i = i3;
        } else {
            i = -1;
        }
        int i5 = i;
        int i6 = 13;
        oe0Var.o(13);
        oe0Var.m();
        int iR4 = oe0Var.r(4);
        if (iR4 != 1) {
            StringBuilder sb = new StringBuilder(String.valueOf(iR4).length() + 22);
            sb.append("Unsupported obu_type: ");
            sb.append(iR4);
            s90.K("BoxParsers", sb.toString());
            return new c43(-1, -1, -1, null, i, i5);
        }
        if (oe0Var.q()) {
            s90.K("BoxParsers", "Unsupported obu_extension_flag");
            return new c43(-1, -1, -1, null, i, i5);
        }
        boolean zQ3 = oe0Var.q();
        oe0Var.m();
        if (zQ3 && oe0Var.r(8) > 127) {
            s90.K("BoxParsers", "Excessive obu_size");
            return new c43(-1, -1, -1, null, i, i5);
        }
        int iR5 = oe0Var.r(3);
        oe0Var.m();
        if (oe0Var.q()) {
            s90.K("BoxParsers", "Unsupported reduced_still_picture_header");
            return new c43(-1, -1, -1, null, i, i5);
        }
        if (oe0Var.q()) {
            s90.K("BoxParsers", "Unsupported timing_info_present_flag");
            return new c43(-1, -1, -1, null, i, i5);
        }
        if (oe0Var.q()) {
            s90.K("BoxParsers", "Unsupported initial_display_delay_present_flag");
            return new c43(-1, -1, -1, null, i, i5);
        }
        int iR6 = oe0Var.r(5);
        int i7 = 0;
        while (i7 <= iR6) {
            oe0Var.o(i2);
            if (oe0Var.r(5) > 7) {
                oe0Var.m();
            }
            i7++;
            i2 = 12;
        }
        int iR7 = oe0Var.r(4);
        int iR8 = oe0Var.r(4);
        oe0Var.o(iR7 + 1);
        oe0Var.o(iR8 + 1);
        if (oe0Var.q()) {
            oe0Var.o(7);
        }
        oe0Var.o(7);
        boolean zQ4 = oe0Var.q();
        if (zQ4) {
            oe0Var.o(2);
        }
        if ((oe0Var.q() || oe0Var.r(1) > 0) && !oe0Var.q()) {
            oe0Var.o(1);
        }
        if (zQ4) {
            oe0Var.o(3);
        }
        oe0Var.o(3);
        boolean zQ5 = oe0Var.q();
        if (iR5 != 2) {
            if (iR5 == 1) {
                z = false;
            }
            if (oe0Var.q()) {
                int iR9 = oe0Var.r(8);
                iR = oe0Var.r(8);
                int iR10 = oe0Var.r(8);
                if (!z || iR9 != 1) {
                    i6 = iR;
                    iR2 = oe0Var.r(1);
                } else if (iR != 13) {
                    iR9 = 1;
                    i6 = iR;
                    iR2 = oe0Var.r(1);
                } else if (iR10 == 0) {
                    iR2 = 1;
                    iR9 = 1;
                } else {
                    iR9 = 1;
                    iR2 = oe0Var.r(1);
                }
                iB = c43.b(iR9);
                i4 = iR2 != 1 ? 2 : 1;
                iC = c43.c(i6);
            } else {
                iB = -1;
                iC = -1;
            }
            return new c43(iB, i4, iC, null, i, i5);
        }
        if (zQ5) {
            oe0Var.m();
        }
        if (oe0Var.q()) {
            z = true;
        } else {
            z = false;
        }
        if (oe0Var.q()) {
            int iR11 = oe0Var.r(8);
            iR = oe0Var.r(8);
            int iR12 = oe0Var.r(8);
            if (!z) {
                i6 = iR;
                iR2 = oe0Var.r(1);
            } else {
                i6 = iR;
                iR2 = oe0Var.r(1);
            }
            iB = c43.b(iR11);
            i4 = iR2 != 1 ? 2 : 1;
            iC = c43.c(i6);
        } else {
            iB = -1;
            iC = -1;
        }
        return new c43(iB, i4, iC, null, i, i5);
    }

    /* JADX WARN: Code duplicated, block: B:213:0x047e  */
    /* JADX WARN: Code duplicated, block: B:30:0x0082  */
    /* JADX WARN: Code duplicated, block: B:363:0x06fe A[LOOP:5: B:362:0x06fc->B:363:0x06fe, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:382:0x0752  */
    /* JADX WARN: Code duplicated, block: B:423:0x07ff A[PHI: r37
  0x07ff: PHI (r37v16 int) = (r37v14 int), (r37v13 int) binds: [B:428:0x080a, B:421:0x07fc] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:89:0x0164  */
    public static void i(cw1 cw1Var, int i, int i2, int i3, int i4, String str, boolean z, va3 va3Var, d6 d6Var, int i5) throws no0 {
        int iL;
        int iB;
        int iRound;
        int iH;
        int i6;
        String str2;
        String str3;
        String str4;
        int i7;
        int i8;
        int i9;
        gh0 gh0Var;
        qk2 qk2VarI;
        int i10;
        int i11;
        String str5;
        int i12;
        int i13;
        int i14;
        int i15;
        int iR;
        int i16;
        boolean z2;
        boolean z3;
        int i17;
        int i18;
        int i19;
        int i20;
        boolean z4;
        int iR2;
        int i21;
        String str6;
        qk2 qk2VarJ;
        int i22;
        cw1 cw1Var2 = cw1Var;
        int i23 = i;
        int i24 = i3;
        va3 va3VarA = va3Var;
        int[] iArr = jn.f;
        int[] iArr2 = jn.d;
        cw1Var2.E(i2 + 16);
        if (z) {
            iL = cw1Var2.L();
            cw1Var2.G(6);
        } else {
            cw1Var2.G(8);
            iL = 0;
        }
        if (iL == 0 || iL == 1) {
            int iL2 = cw1Var2.L();
            cw1Var2.G(6);
            int iF = cw1Var2.f();
            cw1Var2.E(cw1Var2.b - 4);
            iB = cw1Var2.b();
            if (iL == 1) {
                cw1Var2.G(16);
            }
            iRound = iF;
            iH = iL2;
            i6 = -1;
        } else {
            if (iL != 2) {
                return;
            }
            cw1Var2.G(16);
            iRound = (int) Math.round(Double.longBitsToDouble(cw1Var2.d()));
            iH = cw1Var2.h();
            cw1Var2.G(4);
            int iH2 = cw1Var2.h();
            int iH3 = cw1Var2.h();
            int i25 = iH3 & 1;
            int i26 = iH3 & 2;
            if (i25 == 0) {
                if (iH2 == 8) {
                    i22 = 3;
                } else if (iH2 == 16) {
                    i22 = i26 != 0 ? 268435456 : 2;
                } else if (iH2 == 24) {
                    i22 = i26 != 0 ? 1342177280 : 21;
                } else if (iH2 == 32) {
                    i22 = i26 != 0 ? 1610612736 : 22;
                } else {
                    i22 = -1;
                }
            } else if (iH2 == 32) {
                i22 = 4;
            } else {
                i22 = -1;
            }
            cw1Var2.G(8);
            i6 = i22;
            iB = 0;
        }
        if (i23 == 1767992678) {
            iRound = -1;
            iH = -1;
        } else {
            if (i23 == 1935764850) {
                iRound = 8000;
            } else if (i23 == 1935767394) {
                iRound = 16000;
                i23 = 1935767394;
            }
            iH = 1;
        }
        int i27 = cw1Var2.b;
        int iIntValue = 1701733217;
        if (i23 == 1701733217) {
            Pair pairK = k(cw1Var2, i2, i24);
            if (pairK != null) {
                iIntValue = ((Integer) pairK.first).intValue();
                va3VarA = va3VarA == null ? null : va3VarA.a(((xh0) pairK.second).b);
                ((xh0[]) d6Var.c)[i5] = (xh0) pairK.second;
            }
            i23 = iIntValue;
            cw1Var2.E(i27);
        }
        String str7 = "audio/mhm1";
        String str8 = "audio/ac3";
        if (i23 == 1633889587) {
            str2 = "audio/ac3";
        } else if (i23 == 1700998451) {
            str2 = "audio/eac3";
        } else if (i23 == 1633889588) {
            str2 = "audio/ac4";
        } else if (i23 == 1685353315) {
            str2 = "audio/vnd.dts";
        } else if (i23 == 1685353320 || i23 == 1685353324) {
            str2 = "audio/vnd.dts.hd";
        } else if (i23 == 1685353317) {
            str2 = "audio/vnd.dts.hd;profile=lbr";
        } else if (i23 == 1685353336) {
            str2 = "audio/vnd.dts.uhd;profile=p2";
        } else if (i23 == 1935764850) {
            str2 = "audio/3gpp";
        } else if (i23 == 1935767394) {
            str2 = "audio/amr-wb";
        } else if (i23 == 1936684916) {
            str2 = "audio/raw";
            i6 = 2;
        } else if (i23 == 1953984371) {
            str2 = "audio/raw";
            i6 = 268435456;
        } else if (i23 == 1819304813) {
            if (i6 == -1) {
                str2 = "audio/raw";
                i6 = 2;
            } else {
                str2 = "audio/raw";
            }
        } else if (i23 == 778924082 || i23 == 778924083) {
            str2 = "audio/mpeg";
        } else if (i23 == 1835557169) {
            str2 = "audio/mha1";
        } else if (i23 == 1835560241) {
            str2 = "audio/mhm1";
        } else if (i23 == 1634492771) {
            str2 = "audio/alac";
        } else if (i23 == 1634492791) {
            str2 = "audio/g711-alaw";
        } else if (i23 == 1970037111) {
            str2 = "audio/g711-mlaw";
        } else if (i23 == 1332770163) {
            str2 = "audio/opus";
        } else if (i23 == 1716281667) {
            str2 = "audio/flac";
        } else if (i23 == 1835823201) {
            str2 = "audio/true-hd";
        } else if (i23 == 1767992678) {
            str2 = "audio/iamf";
            i23 = 1767992678;
        } else {
            str2 = null;
        }
        int i28 = i6;
        int i29 = iRound;
        List listI = null;
        String str9 = null;
        gh0 gh0Var2 = null;
        ec0 ec0Var = null;
        while (i27 - i2 < i24) {
            cw1Var2.E(i27);
            int iB2 = cw1Var2.b();
            iH = iH;
            rs0.q("childAtomSize must be positive", iB2 > 0);
            int iB3 = cw1Var2.b();
            if (iB3 == 1835557187) {
                cw1Var2.E(i27 + 8);
                cw1Var2.G(1);
                int iK = cw1Var2.K();
                cw1Var2.G(1);
                String str10 = Objects.equals(str2, str7) ? String.format("mhm1.%02X", Integer.valueOf(iK)) : String.format("mha1.%02X", Integer.valueOf(iK));
                int iL3 = cw1Var2.L();
                byte[] bArr = new byte[iL3];
                String str11 = str10;
                cw1Var2.H(bArr, 0, iL3);
                if (listI == null) {
                    str9 = str11;
                    str8 = str8;
                    str2 = str2;
                    listI = vj2.i(bArr);
                    str3 = str7;
                    i7 = i27;
                    iB2 = iB2;
                    iH = iH;
                    i23 = i23;
                } else {
                    qk2VarJ = vj2.j(bArr, (byte[]) listI.get(0));
                    str9 = str11;
                    listI = qk2VarJ;
                    str3 = str7;
                    i7 = i27;
                    i23 = i23;
                }
            } else {
                if (iB3 == 1835557200) {
                    cw1Var2.E(i27 + 8);
                    int iK2 = cw1Var2.K();
                    if (iK2 > 0) {
                        byte[] bArr2 = new byte[iK2];
                        cw1Var2.H(bArr2, 0, iK2);
                        if (listI == null) {
                            str8 = str8;
                            str2 = str2;
                            listI = vj2.i(bArr2);
                            str3 = str7;
                            i7 = i27;
                            iB2 = iB2;
                        } else {
                            qk2VarJ = vj2.j((byte[]) listI.get(0), bArr2);
                            listI = qk2VarJ;
                            str3 = str7;
                            i7 = i27;
                        }
                        i23 = i23;
                    } else {
                        str4 = str2;
                        str3 = str7;
                        i7 = i27;
                        iB2 = iB2;
                    }
                } else {
                    str3 = str7;
                    if (iB3 == 1702061171) {
                        str4 = str2;
                        i7 = i27;
                        i8 = i7;
                        i9 = -1;
                    } else if (z && iB3 == 2002876005) {
                        int i30 = cw1Var2.b;
                        rs0.q(null, i30 >= i27);
                        while (true) {
                            if (i30 - i27 < iB2) {
                                cw1Var2.E(i30);
                                int iB4 = cw1Var2.b();
                                rs0.q("childAtomSize must be positive", iB4 > 0);
                                int i31 = i30;
                                if (cw1Var2.b() != 1702061171) {
                                    i30 = i31 + iB4;
                                } else {
                                    str4 = str2;
                                    i7 = i27;
                                    i9 = -1;
                                    i8 = i31;
                                }
                            } else {
                                str4 = str2;
                                i7 = i27;
                                i9 = -1;
                                i8 = -1;
                            }
                        }
                    } else if (iB3 == 1651798644) {
                        cw1Var2.E(i27 + 8);
                        cw1Var2.G(4);
                        listI = listI;
                        ec0Var = new ec0(cw1Var2.P(), cw1Var2.P());
                        i7 = i27;
                        i23 = i23;
                    } else {
                        int i32 = i27;
                        iB2 = iB2;
                        if (iB3 == 1684103987) {
                            cw1Var2.E(i32 + 8);
                            String string = Integer.toString(i4);
                            oe0 oe0Var = new oe0();
                            oe0Var.b(cw1Var2);
                            int i33 = iArr2[oe0Var.r(2)];
                            oe0Var.o(8);
                            int i34 = iArr[oe0Var.r(3)];
                            if (oe0Var.r(1) != 0) {
                                i34++;
                            }
                            int i35 = jn.g[oe0Var.r(5)] * 1000;
                            oe0Var.w();
                            cw1Var2.E(oe0Var.i());
                            uc3 uc3Var = new uc3();
                            uc3Var.a = string;
                            uc3Var.e(str8);
                            uc3Var.D = i34;
                            uc3Var.E = i33;
                            uc3Var.p = va3VarA;
                            uc3Var.d = str;
                            uc3Var.g = i35;
                            uc3Var.h = i35;
                            d6Var.d = new de3(uc3Var);
                            str4 = str2;
                            i7 = i32;
                        } else if (iB3 == 1684366131) {
                            cw1Var2.E(i32 + 8);
                            String string2 = Integer.toString(i4);
                            oe0 oe0Var2 = new oe0();
                            oe0Var2.b(cw1Var2);
                            int iR3 = oe0Var2.r(13) * 1000;
                            oe0Var2.o(3);
                            int i36 = iArr2[oe0Var2.r(2)];
                            oe0Var2.o(10);
                            int i37 = iArr[oe0Var2.r(3)];
                            if (oe0Var2.r(1) != 0) {
                                i37++;
                            }
                            int i38 = i37;
                            oe0Var2.o(3);
                            int iR4 = oe0Var2.r(4);
                            oe0Var2.o(1);
                            if (iR4 > 0) {
                                oe0Var2.o(6);
                                if (oe0Var2.r(1) != 0) {
                                    i38 += 2;
                                }
                                oe0Var2.o(1);
                            }
                            int i39 = i38;
                            i7 = i32;
                            if (oe0Var2.f() > 7) {
                                oe0Var2.o(7);
                                if (oe0Var2.r(1) != 0) {
                                    str6 = "audio/eac3-joc";
                                } else {
                                    str6 = "audio/eac3";
                                }
                            } else {
                                str6 = "audio/eac3";
                            }
                            oe0Var2.w();
                            cw1Var2.E(oe0Var2.i());
                            uc3 uc3Var2 = new uc3();
                            uc3Var2.a = string2;
                            uc3Var2.e(str6);
                            uc3Var2.D = i39;
                            uc3Var2.E = i36;
                            uc3Var2.p = va3VarA;
                            uc3Var2.d = str;
                            uc3Var2.h = iR3;
                            d6Var.d = new de3(uc3Var2);
                            str4 = str2;
                        } else {
                            str8 = str8;
                            i7 = i32;
                            if (iB3 == 1684103988) {
                                cw1Var2.E(i7 + 8);
                                String string3 = Integer.toString(i4);
                                oe0 oe0Var3 = new oe0();
                                oe0Var3.b(cw1Var2);
                                int iF2 = oe0Var3.f();
                                int iR5 = oe0Var3.r(3);
                                if (iR5 > 1) {
                                    StringBuilder sb = new StringBuilder(String.valueOf(iR5).length() + 30);
                                    sb.append("Unsupported AC-4 DSI version: ");
                                    sb.append(iR5);
                                    throw no0.b(sb.toString());
                                }
                                int iR6 = oe0Var3.r(7);
                                int i40 = true != oe0Var3.q() ? 44100 : 48000;
                                oe0Var3.o(4);
                                int iR7 = oe0Var3.r(9);
                                if (iR6 > 1) {
                                    if (iR5 == 0) {
                                        throw no0.b("Invalid AC-4 DSI version: 0");
                                    }
                                    if (oe0Var3.q()) {
                                        oe0Var3.o(16);
                                        if (oe0Var3.q()) {
                                            oe0Var3.o(128);
                                        }
                                    }
                                }
                                if (iR5 == 1) {
                                    if (oe0Var3.f() < 66) {
                                        throw no0.b("Invalid AC-4 DSI bitrate.");
                                    }
                                    oe0Var3.o(66);
                                    oe0Var3.w();
                                }
                                xc0 xc0Var = new xc0();
                                xc0Var.a = true;
                                xc0Var.b = -1;
                                xc0Var.c = -1;
                                xc0Var.d = true;
                                listI = listI;
                                xc0Var.e = 2;
                                xc0Var.f = 1;
                                xc0Var.g = 0;
                                int i41 = 0;
                                while (true) {
                                    if (i41 < iR7) {
                                        if (iR5 == 0) {
                                            boolean zQ = oe0Var3.q();
                                            int iR8 = oe0Var3.r(5);
                                            i11 = i23;
                                            str5 = str2;
                                            iR = oe0Var3.r(5);
                                            i16 = 0;
                                            z2 = false;
                                            z3 = zQ;
                                            i17 = iR8;
                                            i18 = 0;
                                        } else {
                                            int i42 = iR7;
                                            int iR9 = oe0Var3.r(8);
                                            str5 = str2;
                                            int iR10 = oe0Var3.r(8);
                                            i11 = i23;
                                            int iR11 = iR10 == 255 ? oe0Var3.r(16) + 255 : iR10;
                                            if (iR9 > 2) {
                                                oe0Var3.o(iR11 * 8);
                                                i41++;
                                                iR7 = i42;
                                                str2 = str5;
                                                i23 = i11;
                                            } else {
                                                int iF3 = (iF2 - oe0Var3.f()) / 8;
                                                int iR12 = oe0Var3.r(5);
                                                z2 = iR12 == 31;
                                                i17 = iR12;
                                                iR = iR9;
                                                i18 = iF3;
                                                i16 = iR11;
                                                z3 = false;
                                            }
                                        }
                                        xc0Var.f = iR;
                                        boolean z5 = z2;
                                        if (z3 || z5 || i17 != 6) {
                                            xc0Var.g = oe0Var3.r(3);
                                            if (oe0Var3.q()) {
                                                oe0Var3.o(5);
                                            }
                                            oe0Var3.o(2);
                                            int i43 = 1;
                                            if (iR5 == 1) {
                                                if (iR == 1) {
                                                    oe0Var3.o(2);
                                                } else if (iR == 2) {
                                                    iR = 2;
                                                    oe0Var3.o(2);
                                                }
                                            }
                                            oe0Var3.o(5);
                                            oe0Var3.o(10);
                                            if (iR5 == 1) {
                                                if (iR > 0) {
                                                    xc0Var.a = oe0Var3.q();
                                                }
                                                if (xc0Var.a) {
                                                    if (iR != 1) {
                                                        i20 = 2;
                                                        if (iR == 2) {
                                                            i19 = 2;
                                                        } else {
                                                            i19 = iR;
                                                        }
                                                        oe0Var3.o(24);
                                                        i43 = 1;
                                                    } else {
                                                        i19 = 1;
                                                    }
                                                    int iR13 = oe0Var3.r(5);
                                                    if (iR13 >= 0 && iR13 <= 15) {
                                                        xc0Var.b = iR13;
                                                    }
                                                    if (iR13 < 11 || iR13 > 14) {
                                                        i20 = 2;
                                                    } else {
                                                        xc0Var.d = oe0Var3.q();
                                                        i20 = 2;
                                                        xc0Var.e = oe0Var3.r(2);
                                                    }
                                                    oe0Var3.o(24);
                                                    i43 = 1;
                                                } else {
                                                    i20 = 2;
                                                    i19 = iR;
                                                }
                                                if (iR == i43 || iR == i20) {
                                                    if (oe0Var3.q() && oe0Var3.q()) {
                                                        oe0Var3.o(i20);
                                                    }
                                                    if (oe0Var3.q()) {
                                                        oe0Var3.m();
                                                        int i44 = 8;
                                                        int iR14 = oe0Var3.r(8);
                                                        int i45 = 0;
                                                        while (i45 < iR14) {
                                                            oe0Var3.o(i44);
                                                            i45++;
                                                            i44 = 8;
                                                        }
                                                    }
                                                }
                                            } else {
                                                i19 = iR;
                                            }
                                            if (!z3 && !z5) {
                                                oe0Var3.m();
                                                if (i17 == 0 || i17 == 1 || i17 == 2) {
                                                    if (i19 == 0) {
                                                        for (int i46 = 0; i46 < 2; i46++) {
                                                            ar.E(oe0Var3, xc0Var);
                                                        }
                                                        i19 = 0;
                                                    } else {
                                                        for (int i47 = 0; i47 < 2; i47++) {
                                                            ar.G(oe0Var3, xc0Var);
                                                        }
                                                    }
                                                } else if (i17 == 3 || i17 == 4) {
                                                    if (i19 == 0) {
                                                        for (int i48 = 0; i48 < 3; i48++) {
                                                            ar.E(oe0Var3, xc0Var);
                                                        }
                                                        i19 = 0;
                                                    } else {
                                                        for (int i49 = 0; i49 < 3; i49++) {
                                                            ar.G(oe0Var3, xc0Var);
                                                        }
                                                    }
                                                } else if (i17 != 5) {
                                                    int iR15 = oe0Var3.r(7);
                                                    for (int i50 = 0; i50 < iR15; i50++) {
                                                        oe0Var3.o(8);
                                                    }
                                                } else if (i19 == 0) {
                                                    ar.E(oe0Var3, xc0Var);
                                                    i19 = 0;
                                                } else {
                                                    int iR16 = oe0Var3.r(3);
                                                    for (int i51 = 0; i51 < iR16 + 2; i51++) {
                                                        ar.G(oe0Var3, xc0Var);
                                                    }
                                                }
                                            } else if (i19 == 0) {
                                                ar.E(oe0Var3, xc0Var);
                                                i19 = 0;
                                            } else {
                                                ar.G(oe0Var3, xc0Var);
                                            }
                                            oe0Var3.m();
                                            if (oe0Var3.q()) {
                                                iR = i19;
                                                iR2 = oe0Var3.r(7);
                                                for (i21 = 0; i21 < iR2; i21++) {
                                                    oe0Var3.o(15);
                                                }
                                                i19 = iR;
                                            }
                                        } else {
                                            iR2 = oe0Var3.r(7);
                                            while (i21 < iR2) {
                                                oe0Var3.o(15);
                                            }
                                            i19 = iR;
                                        }
                                        if (i19 > 0) {
                                            if (oe0Var3.q()) {
                                                if (oe0Var3.f() < 66) {
                                                    z4 = false;
                                                } else {
                                                    oe0Var3.o(66);
                                                    z4 = true;
                                                }
                                                if (!z4) {
                                                    throw no0.b("Can't parse bitrate DSI.");
                                                }
                                            }
                                            if (oe0Var3.q()) {
                                                oe0Var3.w();
                                                oe0Var3.x(oe0Var3.r(16));
                                                int iR17 = oe0Var3.r(5);
                                                for (int i52 = 0; i52 < iR17; i52++) {
                                                    oe0Var3.o(3);
                                                    oe0Var3.o(8);
                                                }
                                            }
                                        }
                                        i12 = 8;
                                        oe0Var3.w();
                                        if (iR5 == 1) {
                                            int iF4 = ((iF2 - oe0Var3.f()) / 8) - i18;
                                            if (i16 < iF4) {
                                                throw no0.b("pres_bytes is smaller than presentation bytes read.");
                                            }
                                            oe0Var3.x(i16 - iF4);
                                        }
                                        if (xc0Var.a && xc0Var.b == -1) {
                                            StringBuilder sb2 = new StringBuilder(String.valueOf(i41).length() + 45);
                                            sb2.append("Can't determine channel mode of presentation ");
                                            sb2.append(i41);
                                            throw no0.b(sb2.toString());
                                        }
                                    } else {
                                        i11 = i23;
                                        str5 = str2;
                                        i12 = 8;
                                    }
                                    if (xc0Var.a) {
                                        int i53 = xc0Var.b;
                                        boolean z6 = xc0Var.d;
                                        int i54 = xc0Var.e;
                                        switch (i53) {
                                            case 0:
                                                i14 = 11;
                                                i15 = 1;
                                                break;
                                            case 1:
                                                i14 = 11;
                                                i15 = 2;
                                                break;
                                            case 2:
                                                i14 = 11;
                                                i15 = 3;
                                                break;
                                            case 3:
                                                i14 = 11;
                                                i15 = 5;
                                                break;
                                            case 4:
                                                i14 = 11;
                                                i15 = 6;
                                                break;
                                            case 5:
                                            case 7:
                                            case 9:
                                                i14 = 11;
                                                i15 = 7;
                                                break;
                                            case 6:
                                            case 8:
                                            case 10:
                                                i15 = i12;
                                                i14 = 11;
                                                break;
                                            case 11:
                                                i14 = 11;
                                                i15 = 11;
                                                break;
                                            case 12:
                                                i15 = 12;
                                                i14 = 11;
                                                break;
                                            case 13:
                                                i14 = 11;
                                                i15 = 13;
                                                break;
                                            case 14:
                                                i14 = 11;
                                                i15 = 14;
                                                break;
                                            case 15:
                                                i14 = 11;
                                                i15 = 24;
                                                break;
                                            default:
                                                i14 = 11;
                                                i15 = -1;
                                                break;
                                        }
                                        if (i53 == i14 || i53 == 12 || i53 == 13 || i53 == 14) {
                                            if (!z6) {
                                                i15 -= 2;
                                            }
                                            if (i54 == 0) {
                                                i13 = i15 - 4;
                                            } else if (i54 != 1) {
                                                i13 = i15;
                                            } else {
                                                i13 = i15 - 2;
                                            }
                                        } else {
                                            i13 = i15;
                                        }
                                    } else {
                                        int i55 = xc0Var.c;
                                        int i56 = xc0Var.g;
                                        if (i55 > 0) {
                                            i13 = i55 + 1;
                                            if (i56 == 4 && i13 == 17) {
                                                i13 = 21;
                                            }
                                        } else if (i56 == 0) {
                                            i13 = 2;
                                        } else if (i56 == 1) {
                                            i13 = 6;
                                        } else if (i56 == 2) {
                                            i13 = i12;
                                        } else if (i56 == 3) {
                                            i13 = 10;
                                        } else if (i56 != 4) {
                                            StringBuilder sb3 = new StringBuilder(String.valueOf(i56).length() + 33);
                                            sb3.append("AC-4 level ");
                                            sb3.append(i56);
                                            sb3.append(" has not been defined.");
                                            s90.Q("Ac4Util", sb3.toString());
                                            i13 = 2;
                                        } else {
                                            i13 = 12;
                                        }
                                    }
                                    if (i13 <= 0) {
                                        throw no0.b("Cannot determine channel count of presentation.");
                                    }
                                    Object[] objArr = {Integer.valueOf(iR6), Integer.valueOf(xc0Var.f), Integer.valueOf(xc0Var.g)};
                                    String str12 = qz1.a;
                                    String str13 = String.format(Locale.US, "ac-4.%02d.%02d.%02d", objArr);
                                    uc3 uc3Var3 = new uc3();
                                    uc3Var3.a = string3;
                                    uc3Var3.e("audio/ac4");
                                    uc3Var3.D = i13;
                                    uc3Var3.E = i40;
                                    uc3Var3.p = va3VarA;
                                    uc3Var3.d = str;
                                    uc3Var3.i = str13;
                                    d6Var.d = new de3(uc3Var3);
                                    str4 = str5;
                                    i23 = i11;
                                    str2 = str4;
                                    i29 = i29;
                                }
                            } else {
                                i23 = i23;
                                str2 = str2;
                                listI = listI;
                                if (iB3 != 1684892784) {
                                    if (iB3 == 1684305011 || iB3 == 1969517683) {
                                        i23 = i23;
                                        uc3 uc3Var4 = new uc3();
                                        uc3Var4.c(i4);
                                        str4 = str2;
                                        uc3Var4.e(str4);
                                        iH = iH;
                                        uc3Var4.D = iH;
                                        i29 = i29;
                                        uc3Var4.E = i29;
                                        uc3Var4.p = va3VarA;
                                        uc3Var4.d = str;
                                        d6Var.d = new de3(uc3Var4);
                                    } else if (iB3 == 1682927731) {
                                        int i57 = iB2 - 8;
                                        byte[] bArr3 = a;
                                        int length = bArr3.length;
                                        byte[] bArrCopyOf = Arrays.copyOf(bArr3, length + i57);
                                        cw1Var.E(i7 + 8);
                                        cw1Var.H(bArrCopyOf, length, i57);
                                        listI = na1.s(bArrCopyOf);
                                        iH = iH;
                                    } else {
                                        if (iB3 == 1684425825) {
                                            byte[] bArr4 = new byte[iB2 - 8];
                                            bArr4[0] = 102;
                                            bArr4[1] = 76;
                                            bArr4[2] = 97;
                                            bArr4[3] = 67;
                                            cw1Var.E(i7 + 12);
                                            cw1Var.H(bArr4, 4, iB2 - 12);
                                            listI = vj2.i(bArr4);
                                            iH = iH;
                                        } else if (iB3 == 1634492771) {
                                            int i58 = iB2 - 12;
                                            byte[] bArr5 = new byte[i58];
                                            cw1Var.E(i7 + 12);
                                            cw1Var.H(bArr5, 0, i58);
                                            byte[] bArr6 = rl1.a;
                                            cw1 cw1Var3 = new cw1(bArr5);
                                            cw1Var3.E(5);
                                            int iK3 = cw1Var3.K();
                                            cw1Var3.E(9);
                                            int iK4 = cw1Var3.K();
                                            cw1Var3.E(20);
                                            int[] iArr3 = {cw1Var3.h(), iK4, iK3};
                                            int i59 = iArr3[0];
                                            int i60 = iArr3[1];
                                            int iY = qz1.y(iK3, ByteOrder.LITTLE_ENDIAN);
                                            listI = vj2.i(bArr5);
                                            iH = i60;
                                            i28 = iY;
                                            i29 = i59;
                                        } else if (iB3 == 1767990114) {
                                            cw1Var.E(i7 + 9);
                                            int iV = w40.V(cw1Var.p());
                                            byte[] bArr7 = new byte[iV];
                                            cw1Var.H(bArr7, 0, iV);
                                            byte[] bArr8 = rl1.a;
                                            cw1 cw1Var4 = new cw1(bArr7);
                                            String str14 = null;
                                            String strK = null;
                                            while (cw1Var4.B() > 0 && (str14 == null || strK == null)) {
                                                int iK5 = cw1Var4.K();
                                                int i61 = iK5 >> 3;
                                                int i62 = iK5 & 2;
                                                int i63 = iK5 & 1;
                                                int iV2 = w40.V(cw1Var4.p());
                                                if (i61 > 4 && i61 < 24 && i62 != 0) {
                                                    do {
                                                    } while ((cw1Var4.K() & 128) != 0);
                                                    for (i10 = 128; (cw1Var4.K() & i10) != 0; i10 = 128) {
                                                    }
                                                }
                                                if (i63 != 0) {
                                                    cw1Var4.G(w40.V(cw1Var4.p()));
                                                }
                                                int i64 = cw1Var4.b + iV2;
                                                if (i61 == 31) {
                                                    cw1Var4.G(4);
                                                    Object[] objArr2 = {Integer.valueOf(cw1Var4.K()), Integer.valueOf(cw1Var4.K())};
                                                    String str15 = qz1.a;
                                                    str14 = String.format(Locale.US, "iamf.%03X.%03X", objArr2);
                                                } else {
                                                    if (i61 == 0) {
                                                        while ((cw1Var4.K() & 128) != 0) {
                                                        }
                                                        strK = cw1Var4.k(4, StandardCharsets.UTF_8);
                                                        if (strK.equals("mp4a")) {
                                                            while ((cw1Var4.K() & 128) != 0) {
                                                            }
                                                            cw1Var4.G(2);
                                                            oe0 oe0Var4 = new oe0();
                                                            oe0Var4.b(cw1Var4);
                                                            int iR18 = oe0Var4.r(5);
                                                            if (iR18 == 31) {
                                                                iR18 = oe0Var4.r(6) + 32;
                                                            }
                                                            StringBuilder sb4 = new StringBuilder(strK.length() + 4 + String.valueOf(iR18).length());
                                                            sb4.append(strK);
                                                            sb4.append(".40.");
                                                            sb4.append(iR18);
                                                            strK = sb4.toString();
                                                        }
                                                        cw1Var4.E(i64);
                                                    }
                                                    cw1Var4.E(i64);
                                                }
                                                cw1Var4.E(i64);
                                            }
                                            String strN = (str14 == null || strK == null) ? null : ec.n(new StringBuilder(str14.length() + 1 + strK.length()), str14, ".", strK);
                                            listI = vj2.i(bArr7);
                                            str9 = strN;
                                            i23 = i23;
                                        } else if (iB3 == 1885564227) {
                                            cw1Var.E(i7 + 12);
                                            ByteOrder byteOrder = (cw1Var.K() & 1) != 0 ? ByteOrder.LITTLE_ENDIAN : ByteOrder.BIG_ENDIAN;
                                            int iK6 = cw1Var.K();
                                            i23 = i23;
                                            int iY2 = i23 == 1768973165 ? qz1.y(iK6, byteOrder) : (i23 == 1718641517 && iK6 == 32 && byteOrder.equals(ByteOrder.LITTLE_ENDIAN)) ? 4 : i28;
                                            i28 = iY2;
                                            if (iY2 != -1) {
                                                str2 = "audio/raw";
                                            }
                                        } else {
                                            i23 = i23;
                                            i29 = i29;
                                            iH = iH;
                                            str4 = str2;
                                        }
                                        i23 = i23;
                                    }
                                    str2 = str4;
                                    i29 = i29;
                                } else {
                                    if (iB <= 0) {
                                        StringBuilder sb5 = new StringBuilder(String.valueOf(iB).length() + 49);
                                        sb5.append("Invalid sample rate for Dolby TrueHD MLP stream: ");
                                        sb5.append(iB);
                                        throw no0.a(null, sb5.toString());
                                    }
                                    i29 = iB;
                                    iH = 2;
                                }
                            }
                        }
                    }
                    if (i8 != i9) {
                        gh0 gh0VarJ = j(i8, cw1Var2);
                        String str16 = (String) gh0VarJ.h;
                        byte[] bArr9 = (byte[]) gh0VarJ.i;
                        if (bArr9 != null) {
                            if ("audio/vorbis".equals(str16)) {
                                cw1 cw1Var5 = new cw1(bArr9);
                                int i65 = 1;
                                cw1Var5.G(1);
                                int i66 = 0;
                                while (true) {
                                    gh0Var = gh0VarJ;
                                    if (cw1Var5.B() > 0 && cw1Var5.I() == 255) {
                                        cw1Var5.G(i65);
                                        i66 += 255;
                                        gh0VarJ = gh0Var;
                                        i65 = 1;
                                    }
                                }
                                int iK7 = cw1Var5.K() + i66;
                                int i67 = 0;
                                while (cw1Var5.B() > 0 && cw1Var5.I() == 255) {
                                    cw1Var5.G(1);
                                    i67 += 255;
                                }
                                int iK8 = cw1Var5.K() + i67;
                                byte[] bArr10 = new byte[iK7];
                                int i68 = cw1Var5.b;
                                System.arraycopy(bArr9, i68, bArr10, 0, iK7);
                                int i69 = i68 + iK7 + iK8;
                                int length2 = bArr9.length - i69;
                                byte[] bArr11 = new byte[length2];
                                System.arraycopy(bArr9, i69, bArr11, 0, length2);
                                qk2VarI = vj2.j(bArr10, bArr11);
                            } else {
                                gh0Var = gh0VarJ;
                                if ("audio/mp4a-latm".equals(str16)) {
                                    tc0 tc0VarA = hn.A(new oe0(bArr9.length, bArr9), false);
                                    i29 = tc0VarA.b;
                                    iH = tc0VarA.c;
                                    str9 = tc0VarA.a;
                                }
                                qk2VarI = vj2.i(bArr9);
                            }
                            listI = qk2VarI;
                        } else {
                            gh0Var = gh0VarJ;
                        }
                        str2 = str16;
                        gh0Var2 = gh0Var;
                    } else {
                        str2 = str4;
                    }
                    i29 = i29;
                }
                str2 = str4;
                i29 = i29;
            }
            i27 = i7 + iB2;
            cw1Var2 = cw1Var;
            i24 = i3;
            str7 = str3;
            i23 = i23;
            str8 = str8;
            listI = listI;
            str2 = str2;
        }
        String str17 = str2;
        List list = listI;
        int i70 = i29;
        if (((de3) d6Var.d) != null || str17 == null) {
            return;
        }
        uc3 uc3Var5 = new uc3();
        uc3Var5.c(i4);
        uc3Var5.e(str17);
        uc3Var5.i = str9;
        uc3Var5.D = iH;
        uc3Var5.E = i70;
        uc3Var5.F = i28;
        uc3Var5.o = list;
        uc3Var5.p = va3VarA;
        uc3Var5.d = str;
        gh0 gh0Var3 = gh0Var2;
        if (gh0Var3 != null) {
            uc3Var5.g = w40.f0(gh0Var3.f);
            uc3Var5.h = w40.f0(gh0Var3.g);
        } else {
            ec0 ec0Var2 = ec0Var;
            if (ec0Var2 != null) {
                uc3Var5.g = w40.f0(ec0Var2.a);
                uc3Var5.h = w40.f0(ec0Var2.b);
            }
        }
        d6Var.d = new de3(uc3Var5);
    }

    public static gh0 j(int i, cw1 cw1Var) {
        cw1Var.E(i + 12);
        cw1Var.G(1);
        l(cw1Var);
        cw1Var.G(2);
        int iK = cw1Var.K();
        if ((iK & 128) != 0) {
            cw1Var.G(2);
        }
        if ((iK & 64) != 0) {
            cw1Var.G(cw1Var.K());
        }
        if ((iK & 32) != 0) {
            cw1Var.G(2);
        }
        cw1Var.G(1);
        l(cw1Var);
        String strF = rn0.f(cw1Var.K());
        if ("audio/mpeg".equals(strF) || "audio/vnd.dts".equals(strF) || "audio/vnd.dts.hd".equals(strF)) {
            return new gh0(strF, null, -1L, -1L);
        }
        cw1Var.G(4);
        long jP = cw1Var.P();
        long jP2 = cw1Var.P();
        cw1Var.G(1);
        int iL = l(cw1Var);
        long j = jP2;
        byte[] bArr = new byte[iL];
        cw1Var.H(bArr, 0, iL);
        if (j <= 0) {
            j = -1;
        }
        return new gh0(strF, bArr, j, jP > 0 ? jP : -1L);
    }

    public static Pair k(cw1 cw1Var, int i, int i2) throws no0 {
        xh0 xh0Var;
        Pair pairCreate;
        int i3;
        int i4;
        int i5 = cw1Var.b;
        while (i5 - i < i2) {
            cw1Var.E(i5);
            int iB = cw1Var.b();
            rs0.q("childAtomSize must be positive", iB > 0);
            if (cw1Var.b() == 1936289382) {
                int i6 = i5 + 8;
                int i7 = 0;
                int i8 = -1;
                Integer numValueOf = null;
                String strK = null;
                while (i6 - i5 < iB) {
                    cw1Var.E(i6);
                    int iB2 = cw1Var.b();
                    int iB3 = cw1Var.b();
                    if (iB3 == 1718775137) {
                        numValueOf = Integer.valueOf(cw1Var.b());
                    } else if (iB3 == 1935894637) {
                        cw1Var.G(4);
                        strK = cw1Var.k(4, StandardCharsets.UTF_8);
                    } else if (iB3 == 1935894633) {
                        i8 = i6;
                        i7 = iB2;
                    }
                    i6 += iB2;
                }
                byte[] bArr = null;
                if ("cenc".equals(strK) || "cbc1".equals(strK) || "cens".equals(strK) || "cbcs".equals(strK)) {
                    rs0.q("frma atom is mandatory", numValueOf != null);
                    rs0.q("schi atom is mandatory", i8 != -1);
                    int i9 = i8 + 8;
                    while (true) {
                        if (i9 - i8 >= i7) {
                            xh0Var = null;
                            break;
                        }
                        cw1Var.E(i9);
                        int iB4 = cw1Var.b();
                        if (cw1Var.b() == 1952804451) {
                            int iA = a(cw1Var.b());
                            cw1Var.G(1);
                            if (iA == 0) {
                                cw1Var.G(1);
                                i4 = 0;
                                i3 = 0;
                            } else {
                                int iK = cw1Var.K();
                                i3 = iK & 15;
                                i4 = (iK & 240) >> 4;
                            }
                            boolean z = cw1Var.K() == 1;
                            int iK2 = cw1Var.K();
                            byte[] bArr2 = new byte[16];
                            cw1Var.H(bArr2, 0, 16);
                            if (z && iK2 == 0) {
                                int iK3 = cw1Var.K();
                                byte[] bArr3 = new byte[iK3];
                                cw1Var.H(bArr3, 0, iK3);
                                bArr = bArr3;
                            }
                            xh0Var = new xh0(z, strK, iK2, bArr2, i4, i3, bArr);
                            break;
                        }
                        i9 += iB4;
                    }
                    rs0.q("tenc atom is mandatory", xh0Var != null);
                    String str = qz1.a;
                    pairCreate = Pair.create(numValueOf, xh0Var);
                } else {
                    pairCreate = null;
                }
                if (pairCreate != null) {
                    return pairCreate;
                }
            }
            i5 += iB;
        }
        return null;
    }

    public static int l(cw1 cw1Var) {
        int iK = cw1Var.K();
        int i = iK & 127;
        while ((iK & 128) == 128) {
            iK = cw1Var.K();
            i = (i << 7) | (iK & 127);
        }
        return i;
    }
}
