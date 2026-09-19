package defpackage;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class pn0 implements io0 {
    public static final /* synthetic */ pn0 b;
    public static final /* synthetic */ pn0 c;
    public static final /* synthetic */ pn0 d;
    public static final /* synthetic */ pn0 e;
    public static final /* synthetic */ pn0 f;
    public static final /* synthetic */ pn0 g;
    public static final /* synthetic */ pn0 h;
    public static final /* synthetic */ pn0 i;
    public static final /* synthetic */ pn0 j;
    public static final /* synthetic */ pn0 k;
    public static final /* synthetic */ pn0 l;
    public static final /* synthetic */ pn0 m;
    public static final /* synthetic */ pn0 n;
    public static final /* synthetic */ pn0 o;
    public static final /* synthetic */ pn0 p;
    public static final /* synthetic */ pn0 q;
    public static final /* synthetic */ pn0 r;
    public static final /* synthetic */ pn0 s;
    public static final /* synthetic */ pn0 t;
    public static final /* synthetic */ pn0 u;
    public static final /* synthetic */ pn0 v;
    public final /* synthetic */ int a;

    static {
        int i2 = (((((~1272469786) & 1097507524) | 723881402) + ((1272469786 & 1078604356) | 746642480)) - (-1830851820)) ^ (1544617505 % 243268139);
        int i3 = (((((~1722060049) & 1087578905) | 70644109) + ((1722060049 & 1625428690) | 673239279)) - 1747544094) ^ (860516127 % 777720504);
        int i4 = (((((~168057522) & 567809569) | 2007585082) + ((168057522 & 1112917761) | 1200484666)) - (-1753249985)) ^ (1761250573 % 1089653714);
        int i5 = (((((~386839851) & 502322088) | 1879579687) + ((386839851 & 1341449096) | 1376723987)) - (-1804183292)) ^ (2118801173 % 1119399015);
        int i6 = (((((~627992393) & 399075139) | 1263590114) + ((627992393 & 1418280193) | 1644468862)) - (-1502362592)) ^ (1449228398 % 989241888);
        int i7 = (((((~1687776787) & 1627592001) | 771768986) + ((1687776787 & 1226806633) | 136094264)) - 1910482017) ^ (992028067 % 180785147);
        int i8 = (((((~1111088131) & 1881672142) | 1222111317) + ((1111088131 & 807995786) | 38123124)) - 1508183881) ^ (1348361729 % 788380902);
        v = new pn0((((((~636453333) & 363983206) | 1075208291) + ((636453333 & 2146013964) | 1783382730)) - (-1139191409)) ^ (1564003050 % 99885196));
        u = new pn0((((((~338346092) & 646267944) | 2030210865) + ((338346092 & 109431182) | 1768591350)) - (-956795148)) ^ (1912163036 % 671068506));
        t = new pn0((((((~1374600938) & 269492393) | 962980710) + ((1374600938 & (-2079309685)) | (-1096234186))) - (-724963331)) ^ (1587992726 % 995234140));
        s = new pn0(i8);
        r = new pn0(i5);
        q = new pn0(i6);
        pn0 pn0Var = new pn0(i7);
        int i9 = (((((~406011017) & 1269108768) | 73167649) + ((406011017 & 2074166272) | 872470299)) - 1878158194) ^ (1615935710 % 639806732);
        int i10 = (((((~257675105) & 286888065) | 1680106172) + ((257675105 & 353998857) | 216033710)) - (-2120570644)) ^ (2033505236 % 29777560);
        int i11 = (((((~2137100237) & 243279585) | 1476690352) + ((2137100237 & 1182836297) | 1215531406)) - (-1785612177)) ^ (1251300606 % 959372260);
        int i12 = (((((~1280321648) & 1509448282) | 1074834725) + ((1280321648 & 434689663) | 67544101)) - 1396684682) ^ (1309383303 % 1129033333);
        int i13 = (((((~1635905385) & 436500164) | 1627617040) + ((1635905385 & 1527677388) | 1092341018)) - (-1251599253)) ^ (1253207672 % 570073850);
        int i14 = (((((~2058657199) & 1077280871) | 426331554) + ((2058657199 & 1242960213) | 260153146)) - 1453981149) ^ (711845894 % 404158660);
        int i15 = (((((~2077486715) & 1348527492) | 196553360) + ((2077486715 & 1547749134) | 218380923)) - 1621461405) ^ (1713258270 % 1573363368);
        int i16 = (((((~1194953865) & 541827704) | 1410336387) + ((1194953865 & 676044922) | 221517442)) - 2090845028) ^ (485560280 % 402724286);
        int i17 = (((((~1424268980) & 433259076) | 136627722) + ((1424268980 & 299303110) | 33824130)) - 448747429) ^ (1129566413 % 184803526);
        p = pn0Var;
        o = new pn0(i4);
        n = new pn0(i9);
        m = new pn0(i10);
        l = new pn0(i11);
        k = new pn0(i3);
        j = new pn0(i12);
        i = new pn0(i13);
        h = new pn0(i14);
        g = new pn0(i2);
        f = new pn0(i15);
        e = new pn0(i16);
        d = new pn0(i17);
        c = new pn0(1);
        b = new pn0(0);
    }

    public /* synthetic */ pn0(int i2) {
        this.a = i2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:96:0x01b7 A[Catch: ho0 -> 0x0045, fo0 | go0 -> 0x00c5, ClassNotFoundException -> 0x01c7, mo0 -> 0x01cb, TryCatch #4 {fo0 | go0 -> 0x00c5, blocks: (B:5:0x0017, B:9:0x0033, B:11:0x003b, B:16:0x004c, B:18:0x0057, B:31:0x00b6, B:19:0x0060, B:20:0x0065, B:21:0x0066, B:23:0x006e, B:24:0x0073, B:28:0x007b, B:30:0x0083, B:34:0x00be, B:35:0x00c3, B:36:0x00c4, B:41:0x00d4, B:42:0x00e6, B:44:0x00ec, B:50:0x011a, B:47:0x00fb, B:48:0x0102, B:52:0x0121, B:59:0x0140, B:64:0x015e, B:97:0x01bb, B:68:0x0169, B:72:0x0174, B:79:0x0188, B:83:0x0193, B:87:0x019e, B:91:0x01a9, B:95:0x01b4, B:96:0x01b7, B:103:0x01d3, B:107:0x01ea, B:117:0x0228, B:117:0x0228, B:123:0x0252, B:133:0x0284, B:135:0x029a, B:143:0x02c8, B:136:0x029d, B:140:0x02ae, B:142:0x02c6, B:145:0x02cd, B:149:0x02de, B:168:0x035e, B:178:0x03b7, B:171:0x038b, B:174:0x0395, B:176:0x039b, B:181:0x03bf, B:183:0x03c5, B:184:0x03da, B:187:0x03e3, B:205:0x042c, B:211:0x045a, B:215:0x047d, B:219:0x04c7, B:223:0x04e4, B:236:0x052b, B:240:0x0551, B:244:0x0574), top: B:253:0x0010 }] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        jn0 jn0Var;
        Object obj2;
        jn0 jn0Var2;
        int i2 = this.a;
        long j2 = 1;
        Class<?> cls = Void.TYPE;
        Object obj3 = null;
        int i3 = 0;
        try {
            try {
                try {
                    try {
                        switch (i2) {
                            case 0:
                                e3 e3Var = ((ko0) obj).a;
                                e3Var.k(qo0.b(e3Var.n().m() + e3Var.n().m()));
                                return Optional.empty();
                            case 1:
                                e3 e3Var2 = ((ko0) obj).a;
                                e3Var2.k(qo0.c(e3Var2.n().q() + e3Var2.n().q()));
                                return Optional.empty();
                            case 2:
                                e3 e3Var3 = ((ko0) obj).a;
                                e3Var3.k(qo0.d(e3Var3.n().n().d(e3Var3.n().n())));
                                return Optional.empty();
                            case 3:
                                ko0 ko0Var = (ko0) obj;
                                try {
                                    long jL = ko0Var.c.l();
                                    for (long j3 = 0; j3 < jL; j3++) {
                                        ko0Var.a.k(qo0.a(null));
                                    }
                                    return Optional.empty();
                                } catch (ho0 unused) {
                                    jn0Var = jn0.g;
                                    return Optional.of(jn0Var);
                                }
                            case 4:
                                e3 e3Var4 = ((ko0) obj).a;
                                e3Var4.k(qo0.b(e3Var4.n().m() & e3Var4.n().m()));
                                return Optional.empty();
                            case 5:
                                long[] jArr = {916768482, 1259538933, 805446160, -15648283, -1266372608, 883303887, 6538657, 384868448, 102194872};
                                long j4 = jArr[0];
                                long j5 = jArr[1];
                                long j6 = jArr[2];
                                long j7 = jArr[3];
                                long j8 = jArr[4];
                                long j9 = jArr[5];
                                long j10 = jArr[6];
                                long j11 = jArr[7];
                                long j12 = (((((~j4) & j5) | j6) + ((j4 & j7) | j8)) - j9) + j10;
                                long j13 = j11 % 102194872;
                                e3 e3Var5 = ((ko0) obj).a;
                                e3Var5.k(qo0.b((j12 ^ j13) ^ e3Var5.n().m()));
                                return Optional.empty();
                            case 6:
                                e3 e3Var6 = ((ko0) obj).a;
                                e3Var6.k(qo0.b(e3Var6.n().m() | e3Var6.n().m()));
                                return Optional.empty();
                            case 7:
                                e3 e3Var7 = ((ko0) obj).a;
                                e3Var7.k(qo0.b(e3Var7.n().m() ^ e3Var7.n().m()));
                                return Optional.empty();
                            case 8:
                                ko0 ko0Var2 = (ko0) obj;
                                try {
                                    e3 e3Var8 = ko0Var2.a;
                                    long jM = e3Var8.n().m();
                                    zy1 zy1Var = ko0Var2.b;
                                    g2 g2Var = ko0Var2.c;
                                    zy1Var.m(g2Var.f(), 0L, e3Var8.g);
                                    g2Var.e(jM);
                                    return Optional.empty();
                                } catch (ao0 | bo0 unused2) {
                                    jn0Var = jn0.x;
                                    return Optional.of(jn0Var);
                                } catch (eo0 unused3) {
                                    jn0Var = jn0.H;
                                    return Optional.of(jn0Var);
                                }
                            case 9:
                                try {
                                    e3 e3Var9 = ((ko0) obj).a;
                                    long jM2 = e3Var9.n().m();
                                    ArrayList arrayList = (ArrayList) e3Var9.n().o();
                                    int size = arrayList.size();
                                    Object objH = e3Var9.n().h();
                                    Object objL = e3Var9.n().l();
                                    if (objL instanceof Method) {
                                        Method method = (Method) objL;
                                        Class<?>[] parameterTypes = method.getParameterTypes();
                                        if (parameterTypes.length == size) {
                                            Object[] objArr = new Object[size];
                                            if (objH instanceof Constructor) {
                                                Class<?>[] parameterTypes2 = ((Constructor) objH).getParameterTypes();
                                                int length = parameterTypes2.length;
                                                Object[] objArr2 = new Object[length];
                                                ArrayList arrayList2 = (ArrayList) ((qo0) arrayList.get(0)).o();
                                                if (arrayList2.size() == length) {
                                                    int i4 = 0;
                                                    while (i4 < arrayList2.size()) {
                                                        objArr2[i4] = ((qo0) arrayList2.get(i4)).i(parameterTypes2[i4]);
                                                        i4++;
                                                        obj3 = obj3;
                                                    }
                                                    obj2 = obj3;
                                                    objArr[0] = objArr2;
                                                }
                                            } else {
                                                obj2 = null;
                                                while (i3 < size) {
                                                    objArr[i3] = ((qo0) arrayList.get(i3)).i(parameterTypes[i3]);
                                                    i3++;
                                                }
                                            }
                                            try {
                                                Object objInvoke = method.invoke(objH, objArr);
                                                e3Var9.k((method.getReturnType() == Void.class || method.getReturnType() == cls) ? qo0.a(obj2) : jM2 != 0 ? qo0.g(objInvoke) : qo0.a(objInvoke));
                                                return Optional.empty();
                                            } catch (Throwable unused4) {
                                                jn0Var = jn0.w;
                                                return Optional.of(jn0Var);
                                            }
                                        }
                                    }
                                    return Optional.of(jn0.v);
                                } catch (mo0 unused5) {
                                    jn0Var = jn0.v;
                                }
                                break;
                            case 10:
                                ko0 ko0Var3 = (ko0) obj;
                                e3 e3Var10 = ko0Var3.a;
                                int intExact = Math.toIntExact(e3Var10.n().m());
                                xn0 xn0VarN = e3Var10.n().n();
                                xn0 xn0VarN2 = e3Var10.n().n();
                                if (xn0VarN.a.length != 16) {
                                    return Optional.of(jn0.N);
                                }
                                int[] iArr = new int[4];
                                ByteBuffer.wrap(xn0VarN.a()).asIntBuffer().get(iArr);
                                e3 e3Var11 = new e3(intExact, 6, iArr);
                                byte[] bArrA = xn0VarN2.a();
                                byte[] bArr = new byte[8];
                                int i5 = 0;
                                while (i5 < bArrA.length) {
                                    if (i5 % 8 == 0) {
                                        e3Var11.h(i5 >>> 3, bArr);
                                    } else if (i5 == 0) {
                                        i5 = 0;
                                        e3Var11.h(i5 >>> 3, bArr);
                                    }
                                    bArrA[i5] = (byte) (((bArrA[i5] ^ bArr[i5 % 8]) << 24) >> 24);
                                    i5++;
                                }
                                ko0Var3.a.k(qo0.d(xn0.e(bArrA)));
                                return Optional.empty();
                            case 11:
                                e3 e3Var12 = ((ko0) obj).a;
                                double dQ = e3Var12.n().q();
                                double dQ2 = e3Var12.n().q();
                                if (dQ == 0.0d) {
                                    jn0Var2 = jn0.L;
                                    return Optional.of(jn0Var2);
                                }
                                e3Var12.k(qo0.c(dQ2 / dQ));
                                return Optional.empty();
                            case 12:
                                e3 e3Var13 = ((ko0) obj).a;
                                long jM3 = e3Var13.n().m();
                                long jM4 = e3Var13.n().m();
                                if (jM3 == 0) {
                                    jn0Var2 = jn0.L;
                                    return Optional.of(jn0Var2);
                                }
                                e3Var13.k(qo0.b(jM4 / jM3));
                                return Optional.empty();
                            case 13:
                                try {
                                    ((ko0) obj).a.n();
                                    return Optional.empty();
                                } catch (go0 unused6) {
                                    jn0Var = jn0.G;
                                    return Optional.of(jn0Var);
                                }
                            case 14:
                                ko0 ko0Var4 = (ko0) obj;
                                long jM5 = ko0Var4.a.n().m();
                                e3 e3Var14 = ko0Var4.a;
                                e3Var14.k(qo0.j(e3Var14.o(jM5)));
                                return Optional.empty();
                            case 15:
                                ko0 ko0Var5 = (ko0) obj;
                                long jM6 = ko0Var5.b.r().b + ko0Var5.a.n().m();
                                e3 e3Var15 = ko0Var5.a;
                                e3Var15.k(qo0.j(e3Var15.o(-jM6)));
                                return Optional.empty();
                            case 16:
                                ko0 ko0Var6 = (ko0) obj;
                                long jL2 = ko0Var6.b.r().b + ko0Var6.c.l();
                                e3 e3Var16 = ko0Var6.a;
                                e3Var16.k(qo0.j(e3Var16.o(-jL2)));
                                return Optional.empty();
                            case 17:
                                try {
                                    e3 e3Var17 = ((ko0) obj).a;
                                    if (new lo0(true).compare(e3Var17.n(), e3Var17.n()) != 0) {
                                        j2 = 0;
                                    }
                                    e3Var17.k(qo0.b(j2));
                                    return Optional.empty();
                                } catch (IllegalArgumentException unused7) {
                                    jn0Var = jn0.j;
                                    return Optional.of(jn0Var);
                                }
                            case 18:
                                try {
                                    e3 e3Var18 = ((ko0) obj).a;
                                    String strC = e3Var18.n().n().c();
                                    switch (strC.hashCode()) {
                                        case -1325958191:
                                            if (strC.equals("double")) {
                                                cls = Double.TYPE;
                                            } else {
                                                cls = Class.forName(strC);
                                            }
                                            break;
                                        case 104431:
                                            if (strC.equals("int")) {
                                                cls = Integer.TYPE;
                                            } else {
                                                cls = Class.forName(strC);
                                            }
                                            break;
                                        case 3039496:
                                            if (strC.equals("byte")) {
                                                cls = Byte.TYPE;
                                            } else {
                                                cls = Class.forName(strC);
                                            }
                                            break;
                                        case 3052374:
                                            if (strC.equals("char")) {
                                                cls = Character.TYPE;
                                            } else {
                                                cls = Class.forName(strC);
                                            }
                                            break;
                                        case 3327612:
                                            if (strC.equals("long")) {
                                                cls = Long.TYPE;
                                            } else {
                                                cls = Class.forName(strC);
                                            }
                                            break;
                                        case 3625364:
                                            if (!strC.equals("void")) {
                                                cls = Class.forName(strC);
                                            }
                                            break;
                                        case 64711720:
                                            if (strC.equals("boolean")) {
                                                cls = Boolean.TYPE;
                                            } else {
                                                cls = Class.forName(strC);
                                            }
                                            break;
                                        case 97526364:
                                            if (strC.equals("float")) {
                                                cls = Float.TYPE;
                                            } else {
                                                cls = Class.forName(strC);
                                            }
                                            break;
                                        case 109413500:
                                            if (strC.equals("short")) {
                                                cls = Short.TYPE;
                                            } else {
                                                cls = Class.forName(strC);
                                            }
                                            break;
                                        default:
                                            cls = Class.forName(strC);
                                            break;
                                    }
                                    e3Var18.k(qo0.a(cls));
                                    return Optional.empty();
                                } catch (ClassNotFoundException unused8) {
                                    jn0Var = jn0.s;
                                    return Optional.of(jn0Var);
                                } catch (mo0 unused9) {
                                    jn0Var = jn0.r;
                                    return Optional.of(jn0Var);
                                }
                            case 19:
                                try {
                                    e3 e3Var19 = ((ko0) obj).a;
                                    ArrayList arrayList3 = (ArrayList) e3Var19.n().o();
                                    Class<?>[] clsArr = new Class[arrayList3.size()];
                                    while (i3 < arrayList3.size()) {
                                        Object objL2 = ((qo0) arrayList3.get(i3)).l();
                                        if (!(objL2 instanceof Class)) {
                                            return Optional.of(jn0.t);
                                        }
                                        clsArr[i3] = (Class) objL2;
                                        i3++;
                                    }
                                    String strC2 = e3Var19.n().n().c();
                                    Object objL3 = e3Var19.n().l();
                                    if (objL3 instanceof Class) {
                                        e3Var19.k(qo0.a(((Class) objL3).getMethod(strC2, clsArr)));
                                        return Optional.empty();
                                    }
                                    return Optional.of(jn0.t);
                                } catch (NoSuchMethodException unused10) {
                                    jn0Var = jn0.u;
                                    return Optional.of(jn0Var);
                                } catch (SecurityException unused11) {
                                    jn0Var = jn0.I;
                                    return Optional.of(jn0Var);
                                } catch (mo0 unused12) {
                                    jn0Var = jn0.t;
                                    return Optional.of(jn0Var);
                                }
                            default:
                                e3 e3Var20 = ((ko0) obj).a;
                                long jM7 = e3Var20.n().m();
                                qo0 qo0VarN = e3Var20.n();
                                qo0 qo0VarN2 = e3Var20.n();
                                int i6 = qo0VarN2.g;
                                int i7 = i6 - 1;
                                if (i6 == 0) {
                                    throw null;
                                }
                                if (i7 == 3) {
                                    xn0 xn0VarN3 = qo0VarN2.n();
                                    if (jM7 < 0) {
                                        jM7 += (long) xn0VarN3.a.length;
                                    }
                                    if (qo0VarN.g != 4) {
                                        throw new mo0();
                                    }
                                    if (jM7 >= 0 && jM7 < xn0VarN3.a.length) {
                                        char cCharAt = xn0VarN3.c().charAt((int) jM7);
                                        StringBuilder sb = new StringBuilder(String.valueOf(cCharAt).length());
                                        sb.append(cCharAt);
                                        qo0VarN = qo0.d(xn0.e(sb.toString().getBytes(Charset.forName(wn0.a("Hn2H4l0=")))));
                                    }
                                } else {
                                    if (i7 != 4) {
                                        throw new mo0();
                                    }
                                    List listO = qo0VarN2.o();
                                    if (jM7 < 0) {
                                        jM7 += (long) ((ArrayList) listO).size();
                                    }
                                    if (jM7 >= 0) {
                                        ArrayList arrayList4 = (ArrayList) listO;
                                        if (jM7 < arrayList4.size()) {
                                            qo0VarN = (qo0) arrayList4.get((int) jM7);
                                        }
                                    }
                                }
                                e3Var20.k(qo0VarN);
                                return Optional.empty();
                        }
                    } catch (fo0 | go0 unused13) {
                        jn0Var = jn0.D;
                    }
                } catch (go0 unused14) {
                    jn0Var = jn0.l;
                }
            } catch (ho0 e2) {
                throw new AssertionError(wn0.a("CEiv6BFfPnitUE+D"), e2);
            }
        } catch (bo0 | mo0 | zn0 unused15) {
            jn0Var = jn0.E;
        }
    }
}
