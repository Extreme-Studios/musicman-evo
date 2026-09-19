package defpackage;

import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class xe0 implements qe0 {
    public final vj2 a;
    public final int b;

    public xe0(int i, qk2 qk2Var) {
        this.b = i;
        this.a = qk2Var;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static xe0 b(int i, cw1 cw1Var) {
        String str;
        String str2;
        qe0 ye0Var;
        String str3;
        w40.k0("initialCapacity", 4);
        Object[] objArrCopyOf = new Object[4];
        int i2 = cw1Var.c;
        int iB = -2;
        int i3 = 0;
        while (cw1Var.B() > 8) {
            int iC = cw1Var.c();
            int iC2 = cw1Var.b + cw1Var.c();
            cw1Var.C(iC2);
            if (iC != 1414744396) {
                ve0 ve0Var = null;
                switch (iC) {
                    case 1718776947:
                        if (iB != 2) {
                            if (iB == 1) {
                                int iM = cw1Var.M();
                                if (iM == 1) {
                                    str2 = "audio/raw";
                                } else if (iM == 85) {
                                    str2 = "audio/mpeg";
                                } else if (iM == 255) {
                                    str2 = "audio/mp4a-latm";
                                } else if (iM != 8192) {
                                    str2 = iM != 8193 ? null : "audio/vnd.dts";
                                } else {
                                    str2 = "audio/ac3";
                                }
                                if (str2 != null) {
                                    int iM2 = cw1Var.M();
                                    int iC3 = cw1Var.c();
                                    cw1Var.G(6);
                                    int iY = qz1.y(cw1Var.M(), ByteOrder.LITTLE_ENDIAN);
                                    int iM3 = cw1Var.B() > 0 ? cw1Var.M() : 0;
                                    uc3 uc3Var = new uc3();
                                    uc3Var.e(str2);
                                    uc3Var.D = iM2;
                                    uc3Var.E = iC3;
                                    if (str2.equals("audio/raw") && iY != 0) {
                                        uc3Var.F = iY;
                                    }
                                    if (str2.equals("audio/mp4a-latm") && iM3 > 0) {
                                        byte[] bArr = new byte[iM3];
                                        cw1Var.H(bArr, 0, iM3);
                                        uc3Var.o = vj2.i(bArr);
                                    }
                                    ye0Var = new ye0(new de3(uc3Var));
                                } else {
                                    ec.u(new StringBuilder(String.valueOf(iM).length() + 43), "Ignoring track with unsupported format tag ", iM, "StreamFormatChunk");
                                }
                            } else {
                                String str4 = qz1.a;
                                switch (iB) {
                                    case -2:
                                        str = "none";
                                        break;
                                    case -1:
                                        str = "unknown";
                                        break;
                                    case 0:
                                        str = "default";
                                        break;
                                    case 1:
                                        str = "audio";
                                        break;
                                    case 2:
                                        str = "video";
                                        break;
                                    case 3:
                                        str = "text";
                                        break;
                                    case 4:
                                        str = "image";
                                        break;
                                    case 5:
                                        str = "metadata";
                                        break;
                                    default:
                                        str = "camera motion";
                                        break;
                                }
                                s90.Q("StreamFormatChunk", "Ignoring strf box for unsupported track type: ".concat(str));
                            }
                            ye0Var = ve0Var;
                            break;
                        } else {
                            cw1Var.G(4);
                            int iC4 = cw1Var.c();
                            int iC5 = cw1Var.c();
                            cw1Var.G(4);
                            int iC6 = cw1Var.c();
                            switch (iC6) {
                                case 808802372:
                                case 877677894:
                                case 1145656883:
                                case 1145656920:
                                case 1482049860:
                                case 1684633208:
                                case 2021026148:
                                    str3 = "video/mp4v-es";
                                    break;
                                case 826496577:
                                case 828601953:
                                case 875967048:
                                    str3 = "video/avc";
                                    break;
                                case 842289229:
                                    str3 = "video/mp42";
                                    break;
                                case 859066445:
                                    str3 = "video/mp43";
                                    break;
                                case 1196444237:
                                case 1735420525:
                                    str3 = "video/mjpeg";
                                    break;
                                default:
                                    str3 = null;
                                    break;
                            }
                            if (str3 != null) {
                                uc3 uc3Var2 = new uc3();
                                uc3Var2.s = iC4;
                                uc3Var2.t = iC5;
                                uc3Var2.e(str3);
                                ye0Var = new ye0(new de3(uc3Var2));
                            } else {
                                ec.u(new StringBuilder(String.valueOf(iC6).length() + 44), "Ignoring track with unsupported compression ", iC6, "StreamFormatChunk");
                                ye0Var = ve0Var;
                            }
                        }
                        break;
                    case 1751742049:
                        int iC7 = cw1Var.c();
                        cw1Var.G(8);
                        int iC8 = cw1Var.c();
                        int iC9 = cw1Var.c();
                        cw1Var.G(4);
                        cw1Var.c();
                        cw1Var.G(12);
                        ye0Var = new se0(iC7, iC8, iC9);
                        break;
                    case 1752331379:
                        int iC10 = cw1Var.c();
                        cw1Var.G(12);
                        cw1Var.c();
                        int iC11 = cw1Var.c();
                        int iC12 = cw1Var.c();
                        cw1Var.G(4);
                        int iC13 = cw1Var.c();
                        int iC14 = cw1Var.c();
                        cw1Var.G(4);
                        ve0Var = new ve0(iC10, iC11, iC12, iC13, iC14, cw1Var.c());
                        ye0Var = ve0Var;
                        break;
                    case 1852994675:
                        ye0Var = new ze0(cw1Var.k(cw1Var.B(), StandardCharsets.UTF_8));
                        break;
                    default:
                        ye0Var = ve0Var;
                        break;
                }
            } else {
                ye0Var = b(cw1Var.c(), cw1Var);
            }
            if (ye0Var != null) {
                if (ye0Var.a() == 1752331379) {
                    iB = ((ve0) ye0Var).b();
                }
                int length = objArrCopyOf.length;
                int i4 = i3 + 1;
                int iD = pj2.d(length, i4);
                if (iD > length) {
                    objArrCopyOf = Arrays.copyOf(objArrCopyOf, iD);
                }
                objArrCopyOf[i3] = ye0Var;
                i3 = i4;
            }
            cw1Var.E(iC2);
            cw1Var.C(i2);
        }
        return new xe0(i, vj2.o(objArrCopyOf, i3));
    }

    @Override // defpackage.qe0
    public final int a() {
        return this.b;
    }

    public final qe0 c(Class cls) {
        vj2 vj2Var = this.a;
        int size = vj2Var.size();
        int i = 0;
        while (i < size) {
            qe0 qe0Var = (qe0) vj2Var.get(i);
            i++;
            if (qe0Var.getClass() == cls) {
                return qe0Var;
            }
        }
        return null;
    }
}
