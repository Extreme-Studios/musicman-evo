package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class vn0 implements io0 {
    public static final /* synthetic */ vn0 b;
    public static final /* synthetic */ vn0 c;
    public static final /* synthetic */ vn0 d;
    public static final /* synthetic */ vn0 e;
    public static final /* synthetic */ vn0 f;
    public static final /* synthetic */ vn0 g;
    public static final /* synthetic */ vn0 h;
    public static final /* synthetic */ vn0 i;
    public static final /* synthetic */ vn0 j;
    public static final /* synthetic */ vn0 k;
    public static final /* synthetic */ vn0 l;
    public static final /* synthetic */ vn0 m;
    public static final /* synthetic */ vn0 n;
    public static final /* synthetic */ vn0 o;
    public static final /* synthetic */ vn0 p;
    public static final /* synthetic */ vn0 q;
    public final /* synthetic */ int a;

    static {
        int i2 = (((((~358984857) & 11257432) | 369424399) + ((358984857 & 615188052) | 873771151)) - 1245366369) ^ (1985433483 % 395279207);
        int i3 = (((((~1402492972) & 1009329808) | 1643537068) + ((1402492972 & 503911450) | 580170602)) - (-2136216298)) ^ (1489001354 % 953691761);
        int i4 = (((((~1389079342) & 405954790) | 5768193) + ((1389079342 & 967468022) | 1640566552)) - 1618010502) ^ (1588695568 % 1155465115);
        int i5 = (((((~1666231349) & 289538432) | 621649449) + ((1666231349 & 406985104) | 264059443)) - 1093855303) ^ (1698487330 % 272312086);
        int i6 = (((((~1953161956) & 2021553924) | 1308628610) + ((1953161956 & 813590916) | 134225131)) - 2074905685) ^ (1172063133 % 990526343);
        int i7 = (((((~1889804310) & 69748745) | 707083896) + ((1889804310 & 604795185) | 951435262)) - 1284100923) ^ (1663080928 % 610506582);
        int i8 = (((((~279121308) & 136482862) | 293951273) + ((279121308 & 1302561302) | 1440046744)) - 1857458389) ^ (1404515797 % 695748720);
        int i9 = (((((~1460082195) & 849562858) | 543970048) + ((1460082195 & 381881578) | 1279262981)) - 1872584419) ^ (1122336503 % 861109485);
        int i10 = (((((~70788355) & 1377181904) | 713084892) + ((70788355 & 1410740224) | 99160279)) - 1955016785) ^ (1156541312 % 318561886);
        int i11 = (((((~12895151) & 1277237303) | 185162640) + ((12895151 & 1411547303) | 306429832)) - 1475739783) ^ (1498617647 % 669908538);
        int i12 = (((((~1566288819) & 1018167620) | 793479703) + ((1566288819 & 284165456) | 1648575546)) - (-1895196318)) ^ (846942590 % 524688209);
        int i13 = (((((~1540846267) & 571107379) | 1484708373) + ((1540846267 & 709108258) | 1568035525)) - (-834164565)) ^ (2037335344 % 1874960596);
        q = new vn0((((((~1245644428) & 268473430) | 2019232319) + ((1245644428 & 2266696) | 1693582250)) - (-827594116)) ^ (1308581515 % 354367395));
        p = new vn0((((((~464837581) & 1181588952) | 603091067) + ((464837581 & 1544523140) | 967967255)) - (-2124025763)) ^ (1295815494 % 753959819));
        o = new vn0(i13);
        n = new vn0(i4);
        m = new vn0(i5);
        l = new vn0(i6);
        k = new vn0(i3);
        j = new vn0(i7);
        i = new vn0(i8);
        h = new vn0(i9);
        g = new vn0(i2);
        f = new vn0(i10);
        e = new vn0(i11);
        d = new vn0(i12);
        c = new vn0(1);
        b = new vn0(0);
    }

    public /* synthetic */ vn0(int i2) {
        this.a = i2;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        jn0 jn0Var;
        qo0 qo0VarN;
        int i2 = 0;
        try {
            try {
                try {
                    try {
                        try {
                            switch (this.a) {
                                case 0:
                                    return ((ko0) obj).a();
                                case 1:
                                    try {
                                        e3 e3Var = ((ko0) obj).a;
                                        long jM = e3Var.n().m();
                                        qo0 qo0VarN2 = e3Var.n();
                                        List listO = qo0VarN2.o();
                                        if (jM < 0) {
                                            jM += (long) ((ArrayList) listO).size();
                                        }
                                        if (jM >= 0) {
                                            ArrayList arrayList = (ArrayList) listO;
                                            if (jM < arrayList.size()) {
                                                arrayList.remove((int) jM);
                                                e3Var.k(qo0VarN2);
                                                return Optional.empty();
                                            }
                                        }
                                        throw new po0();
                                    } catch (po0 unused) {
                                        jn0Var = jn0.O;
                                    }
                                    break;
                                case 2:
                                    ko0 ko0Var = (ko0) obj;
                                    e3 e3Var2 = ko0Var.a;
                                    qo0 qo0VarN3 = e3Var2.n();
                                    xn0 xn0VarN = e3Var2.n().n();
                                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                    qo0VarN3.k(byteArrayOutputStream);
                                    ko0Var.a.k(qo0.d(xn0VarN.d(xn0.e(byteArrayOutputStream.toByteArray()))));
                                    return Optional.empty();
                                case 3:
                                    ko0 ko0Var2 = (ko0) obj;
                                    e3 e3Var3 = ko0Var2.a;
                                    qo0 qo0VarN4 = e3Var3.n();
                                    xn0 xn0VarN2 = e3Var3.n().n();
                                    ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                                    ue0.s(qo0VarN4.m(), new kc2(13, byteArrayOutputStream2), false);
                                    ko0Var2.a.k(qo0.d(xn0VarN2.d(xn0.e(byteArrayOutputStream2.toByteArray()))));
                                    return Optional.empty();
                                case 4:
                                    ko0 ko0Var3 = (ko0) obj;
                                    g2 g2Var = ko0Var3.c;
                                    e3 e3Var4 = ko0Var3.a;
                                    ((ArrayList) e3Var4.h).set(e3Var4.d(-(ko0Var3.b.r().b + g2Var.l())), e3Var4.n());
                                    return Optional.empty();
                                case 5:
                                    e3 e3Var5 = ((ko0) obj).a;
                                    e3Var5.k(qo0.b(e3Var5.n().m() << ((int) e3Var5.n().m())));
                                    return Optional.empty();
                                case 6:
                                    e3 e3Var6 = ((ko0) obj).a;
                                    e3Var6.k(qo0.b(e3Var6.n().m() >>> ((int) e3Var6.n().m())));
                                    return Optional.empty();
                                case 7:
                                    e3 e3Var7 = ((ko0) obj).a;
                                    e3Var7.k(qo0.c(e3Var7.n().q() - e3Var7.n().q()));
                                    return Optional.empty();
                                case 8:
                                    e3 e3Var8 = ((ko0) obj).a;
                                    e3Var8.k(qo0.b(e3Var8.n().m() - e3Var8.n().m()));
                                    return Optional.empty();
                                case 9:
                                    ko0 ko0Var4 = (ko0) obj;
                                    e3 e3Var9 = ko0Var4.a;
                                    long jM2 = e3Var9.n().m();
                                    qo0 qo0VarN5 = e3Var9.n();
                                    e3 e3Var10 = ko0Var4.a;
                                    qo0 qo0VarO = e3Var10.o(jM2);
                                    ((ArrayList) e3Var10.h).set(e3Var10.d(jM2), qo0VarN5);
                                    e3Var10.k(qo0VarO);
                                    return Optional.empty();
                                case 10:
                                    ko0 ko0Var5 = (ko0) obj;
                                    e3 e3Var11 = ko0Var5.a;
                                    long jM3 = ko0Var5.b.r().b + e3Var11.n().m();
                                    qo0 qo0VarN6 = e3Var11.n();
                                    e3 e3Var12 = ko0Var5.a;
                                    long j2 = -jM3;
                                    qo0 qo0VarO2 = e3Var12.o(j2);
                                    ((ArrayList) e3Var12.h).set(e3Var12.d(j2), qo0VarN6);
                                    e3Var12.k(qo0VarO2);
                                    return Optional.empty();
                                case 11:
                                    ko0 ko0Var6 = (ko0) obj;
                                    g2 g2Var2 = ko0Var6.c;
                                    e3 e3Var13 = ko0Var6.a;
                                    long jL = ko0Var6.b.r().b + g2Var2.l();
                                    qo0 qo0VarN7 = e3Var13.n();
                                    long j3 = -jL;
                                    qo0 qo0VarO3 = e3Var13.o(j3);
                                    ((ArrayList) e3Var13.h).set(e3Var13.d(j3), qo0VarN7);
                                    e3Var13.k(qo0VarO3);
                                    return Optional.empty();
                                case 12:
                                    ko0 ko0Var7 = (ko0) obj;
                                    long jM4 = ko0Var7.a.n().m();
                                    try {
                                        e3 e3Var14 = ko0Var7.a;
                                        if (jM4 == 0) {
                                            qo0VarN = e3Var14.n();
                                        } else {
                                            int iD = e3Var14.d(jM4);
                                            e3Var14.g--;
                                            qo0VarN = (qo0) ((ArrayList) e3Var14.h).remove(iD);
                                        }
                                        e3Var14.k(qo0VarN);
                                        return Optional.empty();
                                    } catch (go0 unused2) {
                                        jn0Var = jn0.m;
                                    }
                                    break;
                                case 13:
                                    ko0 ko0Var8 = (ko0) obj;
                                    try {
                                        e3 e3Var15 = ko0Var8.a;
                                        long jM5 = e3Var15.n().m();
                                        long jM6 = e3Var15.n().m();
                                        zy1 zy1Var = ko0Var8.b;
                                        g2 g2Var3 = ko0Var8.c;
                                        zy1Var.m(g2Var3.f(), jM6, zy1Var.r().b);
                                        g2Var3.e(jM5);
                                        return Optional.empty();
                                    } catch (ao0 | bo0 unused3) {
                                        jn0Var = jn0.x;
                                    } catch (eo0 unused4) {
                                        jn0Var = jn0.H;
                                    } catch (fo0 unused5) {
                                        jn0Var = jn0.C;
                                    }
                                    break;
                                case 14:
                                    ko0 ko0Var9 = (ko0) obj;
                                    try {
                                        ko0Var9.a.k(qo0.g(ko0Var9.a.n().l()));
                                        return Optional.empty();
                                    } catch (mo0 unused6) {
                                        jn0Var = jn0.v;
                                    }
                                    break;
                                default:
                                    try {
                                        e3 e3Var16 = ((ko0) obj).a;
                                        ArrayList arrayList2 = (ArrayList) e3Var16.n().o();
                                        int size = arrayList2.size();
                                        while (i2 < size) {
                                            Object obj2 = arrayList2.get(i2);
                                            i2++;
                                            e3Var16.k((qo0) obj2);
                                        }
                                        return Optional.empty();
                                    } catch (ho0 unused7) {
                                        jn0Var = jn0.g;
                                    }
                                    break;
                            }
                        } catch (go0 unused8) {
                            jn0Var = jn0.n;
                        }
                    } catch (bo0 | mo0 | zn0 unused9) {
                        jn0Var = jn0.E;
                    }
                } catch (fo0 | go0 unused10) {
                    jn0Var = jn0.D;
                }
            } catch (ho0 e2) {
                e = e2;
                throw new AssertionError(wn0.a("CEiv6BFfPnitUE+D"), e);
            }
        } catch (IOException e3) {
            e = e3;
            throw new AssertionError(wn0.a("CEiv6BFfPnitUE+D"), e);
        } catch (mo0 unused11) {
            jn0Var = jn0.q;
        }
        return Optional.of(jn0Var);
    }
}
