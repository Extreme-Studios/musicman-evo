package defpackage;

import android.text.Layout;
import android.text.TextUtils;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* JADX INFO: loaded from: classes.dex */
public final class nj0 implements qi0 {
    public static final Pattern g = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");
    public static final Pattern h = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");
    public static final Pattern i = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");
    public static final Pattern j = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");
    public static final Pattern k = Pattern.compile("^([-+]?\\d+\\.?\\d*?)% ([-+]?\\d+\\.?\\d*?)%$");
    public static final Pattern l = Pattern.compile("^([-+]?\\d+\\.?\\d*?)px ([-+]?\\d+\\.?\\d*?)px$");
    public static final Pattern m = Pattern.compile("^(\\d+) (\\d+)$");
    public static final mj0 n = new mj0(30.0f, 1, 1);
    public final XmlPullParserFactory f;

    public nj0() {
        try {
            XmlPullParserFactory xmlPullParserFactoryNewInstance = XmlPullParserFactory.newInstance();
            this.f = xmlPullParserFactoryNewInstance;
            xmlPullParserFactoryNewInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e) {
            j7.h("Couldn't create XmlPullParserFactory instance", e);
            throw null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:122:0x0219 A[Catch: oi0 -> 0x0281, TryCatch #2 {oi0 -> 0x0281, blocks: (B:91:0x01a8, B:94:0x01c3, B:97:0x01d5, B:99:0x01db, B:101:0x01e2, B:110:0x01fa, B:120:0x0213, B:122:0x0219, B:123:0x0221, B:124:0x0222, B:125:0x023f, B:114:0x0205, B:119:0x0211, B:126:0x0240, B:127:0x0241, B:128:0x025e, B:96:0x01ca, B:129:0x025f, B:130:0x0280), top: B:232:0x01a8 }] */
    /* JADX WARN: Code duplicated, block: B:176:0x035a  */
    /* JADX WARN: Code duplicated, block: B:185:0x038c  */
    /* JADX WARN: Code duplicated, block: B:243:0x0221 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:51:0x0101  */
    /* JADX WARN: Code duplicated, block: B:60:0x012e  */
    /* JADX WARN: Code duplicated, block: B:84:0x0192  */
    /* JADX WARN: Code duplicated, block: B:86:0x0199  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static pj0 b(XmlPullParser xmlPullParser, pj0 pj0Var) {
        Matcher matcher;
        String strGroup;
        kj0 kj0Var;
        int i2;
        int i3;
        int attributeCount = xmlPullParser.getAttributeCount();
        boolean z = false;
        pj0 pj0VarC = pj0Var;
        for (int i4 = 0; i4 < attributeCount; i4++) {
            String attributeValue = xmlPullParser.getAttributeValue(i4);
            String attributeName = xmlPullParser.getAttributeName(i4);
            int i5 = -1;
            switch (attributeName.hashCode()) {
                case -1550943582:
                    if (attributeName.equals("fontStyle")) {
                        pj0VarC = c(pj0VarC);
                        pj0VarC.i = "italic".equalsIgnoreCase(attributeValue) ? 1 : 0;
                        continue;
                    }
                    break;
                case -1289044182:
                    if (attributeName.equals("extent")) {
                        pj0VarC = c(pj0VarC);
                        pj0VarC.u = attributeValue;
                    } else {
                        continue;
                    }
                    break;
                case -1224696685:
                    if (attributeName.equals("fontFamily")) {
                        pj0VarC = c(pj0VarC);
                        pj0VarC.a = attributeValue;
                    } else {
                        continue;
                    }
                    break;
                case -1065511464:
                    if (attributeName.equals("textAlign")) {
                        pj0VarC = c(pj0VarC);
                        pj0VarC.o = d(attributeValue);
                    } else {
                        continue;
                    }
                    break;
                case -1008619738:
                    if (attributeName.equals("origin")) {
                        pj0VarC = c(pj0VarC);
                        pj0VarC.t = attributeValue;
                    } else {
                        continue;
                    }
                    break;
                case -879295043:
                    if (attributeName.equals("textDecoration")) {
                        String strV = dq.v(attributeValue);
                        switch (strV.hashCode()) {
                            case -1461280213:
                                if (strV.equals("nounderline")) {
                                    pj0VarC = c(pj0VarC);
                                    z = false;
                                    pj0VarC.g = 0;
                                }
                                break;
                            case -1026963764:
                                if (strV.equals("underline")) {
                                    pj0VarC = c(pj0VarC);
                                    pj0VarC.g = 1;
                                }
                                break;
                            case 913457136:
                                if (strV.equals("nolinethrough")) {
                                    pj0VarC = c(pj0VarC);
                                    z = false;
                                    pj0VarC.f = 0;
                                }
                                break;
                            case 1679736913:
                                if (strV.equals("linethrough")) {
                                    pj0VarC = c(pj0VarC);
                                    pj0VarC.f = 1;
                                }
                                break;
                        }
                    }
                    break;
                case -734428249:
                    if (attributeName.equals("fontWeight")) {
                        pj0VarC = c(pj0VarC);
                        pj0VarC.h = "bold".equalsIgnoreCase(attributeValue) ? 1 : 0;
                    }
                    break;
                case 3355:
                    if (attributeName.equals("id") && "style".equals(xmlPullParser.getName())) {
                        pj0VarC = c(pj0VarC);
                        pj0VarC.l = attributeValue;
                    }
                    break;
                case 3511770:
                    if (attributeName.equals("ruby")) {
                        String strV2 = dq.v(attributeValue);
                        switch (strV2.hashCode()) {
                            case -618561360:
                                if (strV2.equals("baseContainer")) {
                                    pj0VarC = c(pj0VarC);
                                    pj0VarC.m = 2;
                                }
                                break;
                            case -410956671:
                                if (strV2.equals("container")) {
                                    pj0VarC = c(pj0VarC);
                                    pj0VarC.m = 1;
                                }
                                break;
                            case -250518009:
                                if (strV2.equals("delimiter")) {
                                    pj0VarC = c(pj0VarC);
                                    pj0VarC.m = 4;
                                }
                                break;
                            case -136074796:
                                if (strV2.equals("textContainer")) {
                                    pj0VarC = c(pj0VarC);
                                    pj0VarC.m = 3;
                                }
                                break;
                            case 3016401:
                                if (strV2.equals("base")) {
                                    pj0VarC = c(pj0VarC);
                                    pj0VarC.m = 2;
                                }
                                break;
                            case 3556653:
                                if (strV2.equals("text")) {
                                    pj0VarC = c(pj0VarC);
                                    pj0VarC.m = 3;
                                }
                                break;
                        }
                    }
                    break;
                case 94842723:
                    if (attributeName.equals("color")) {
                        pj0VarC = c(pj0VarC);
                        try {
                            pj0VarC.b = bm1.a(attributeValue, false);
                            pj0VarC.c = true;
                        } catch (IllegalArgumentException unused) {
                            ec.t(attributeValue, "Failed parsing color value: ", "TtmlParser");
                        }
                    }
                    break;
                case 109403361:
                    if (attributeName.equals("shear")) {
                        pj0 pj0VarC2 = c(pj0VarC);
                        Matcher matcher2 = j.matcher(attributeValue);
                        float fMin = Float.MAX_VALUE;
                        if (matcher2.matches()) {
                            try {
                                String strGroup2 = matcher2.group(1);
                                if (strGroup2 == null) {
                                    throw null;
                                }
                                fMin = Math.min(100.0f, Math.max(-100.0f, Float.parseFloat(strGroup2)));
                            } catch (NumberFormatException e) {
                                s90.T("TtmlParser", "Failed to parse shear: ".concat(String.valueOf(attributeValue)), e);
                            }
                        } else {
                            ec.t(attributeValue, "Invalid value for shear: ", "TtmlParser");
                        }
                        pj0VarC2.s = fMin;
                        pj0VarC = pj0VarC2;
                    }
                    break;
                case 110138194:
                    if (attributeName.equals("textCombine")) {
                        String strV3 = dq.v(attributeValue);
                        int iHashCode = strV3.hashCode();
                        if (iHashCode == 96673) {
                            if (strV3.equals("all")) {
                                pj0VarC = c(pj0VarC);
                                pj0VarC.q = 1;
                            }
                        } else if (iHashCode == 3387192 && strV3.equals("none")) {
                            pj0VarC = c(pj0VarC);
                            z = false;
                            pj0VarC.q = 0;
                        }
                        break;
                    }
                    break;
                case 365601008:
                    if (attributeName.equals("fontSize")) {
                        try {
                            pj0VarC = c(pj0VarC);
                            String str = qz1.a;
                            String[] strArrSplit = attributeValue.split("\\s+", -1);
                            int length = strArrSplit.length;
                            Pattern pattern = i;
                            if (length == 1) {
                                matcher = pattern.matcher(attributeValue);
                            } else {
                                if (length != 2) {
                                    StringBuilder sb = new StringBuilder(String.valueOf(length).length() + 41);
                                    sb.append("Invalid number of entries for fontSize: ");
                                    sb.append(length);
                                    sb.append(".");
                                    throw new oi0(sb.toString());
                                }
                                matcher = pattern.matcher(strArrSplit[1]);
                                s90.Q("TtmlParser", "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
                            }
                            if (!matcher.matches()) {
                                StringBuilder sb2 = new StringBuilder(attributeValue.length() + 36);
                                sb2.append("Invalid expression for fontSize: '");
                                sb2.append(attributeValue);
                                sb2.append("'.");
                                throw new oi0(sb2.toString());
                            }
                            String strGroup3 = matcher.group(3);
                            if (strGroup3 == null) {
                                throw null;
                            }
                            int iHashCode2 = strGroup3.hashCode();
                            if (iHashCode2 == 37) {
                                if (!strGroup3.equals("%")) {
                                    StringBuilder sb3 = new StringBuilder(strGroup3.length() + 30);
                                    sb3.append("Invalid unit for fontSize: '");
                                    sb3.append(strGroup3);
                                    sb3.append("'.");
                                    throw new oi0(sb3.toString());
                                }
                                pj0VarC.j = 3;
                                strGroup = matcher.group(1);
                                if (strGroup == null) {
                                    throw null;
                                }
                                pj0VarC.k = Float.parseFloat(strGroup);
                            } else if (iHashCode2 == 3240) {
                                if (!strGroup3.equals("em")) {
                                    StringBuilder sb4 = new StringBuilder(strGroup3.length() + 30);
                                    sb4.append("Invalid unit for fontSize: '");
                                    sb4.append(strGroup3);
                                    sb4.append("'.");
                                    throw new oi0(sb4.toString());
                                }
                                pj0VarC.j = 2;
                                strGroup = matcher.group(1);
                                if (strGroup == null) {
                                    throw null;
                                }
                                pj0VarC.k = Float.parseFloat(strGroup);
                            } else {
                                if (iHashCode2 != 3592 || !strGroup3.equals("px")) {
                                    StringBuilder sb5 = new StringBuilder(strGroup3.length() + 30);
                                    sb5.append("Invalid unit for fontSize: '");
                                    sb5.append(strGroup3);
                                    sb5.append("'.");
                                    throw new oi0(sb5.toString());
                                }
                                pj0VarC.j = 1;
                                strGroup = matcher.group(1);
                                if (strGroup == null) {
                                    throw null;
                                }
                                pj0VarC.k = Float.parseFloat(strGroup);
                            }
                        } catch (oi0 unused2) {
                            ec.t(attributeValue, "Failed parsing fontSize value: ", "TtmlParser");
                        }
                    }
                    break;
                case 921125321:
                    if (attributeName.equals("textEmphasis")) {
                        pj0VarC = c(pj0VarC);
                        Pattern pattern2 = kj0.d;
                        if (attributeValue == null) {
                            kj0Var = null;
                        } else {
                            String strV4 = dq.v(attributeValue.trim());
                            if (strV4.isEmpty()) {
                                kj0Var = null;
                            } else {
                                String[] strArrSplit2 = TextUtils.split(strV4, kj0.d);
                                int length2 = strArrSplit2.length;
                                bk2 bk2VarM = length2 != 0 ? length2 != 1 ? bk2.m((Object[]) strArrSplit2.clone(), length2) : new ck2(strArrSplit2[z ? 1 : 0]) : wk2.o;
                                String str2 = (String) v51.z(a23.t(kj0.h, bk2VarM), "outside");
                                int iHashCode3 = str2.hashCode();
                                if (iHashCode3 != -1106037339) {
                                    if (iHashCode3 == 92734940 && str2.equals("after")) {
                                        i2 = 2;
                                    } else {
                                        i2 = 1;
                                    }
                                } else if (str2.equals("outside")) {
                                    i2 = -2;
                                } else {
                                    i2 = 1;
                                }
                                yk2 yk2VarT = a23.t(kj0.e, bk2VarM);
                                if (yk2VarT.isEmpty()) {
                                    yk2 yk2VarT2 = a23.t(kj0.g, bk2VarM);
                                    yk2 yk2VarT3 = a23.t(kj0.f, bk2VarM);
                                    if (yk2VarT2.isEmpty() && yk2VarT3.isEmpty()) {
                                        i3 = 0;
                                    } else {
                                        String str3 = (String) v51.z(yk2VarT2, "filled");
                                        i3 = (str3.hashCode() == 3417674 && str3.equals("open")) ? 2 : 1;
                                        String str4 = (String) v51.z(yk2VarT3, "circle");
                                        int iHashCode4 = str4.hashCode();
                                        if (iHashCode4 != -905816648) {
                                            if (iHashCode4 == 99657 && str4.equals("dot")) {
                                                i5 = 2;
                                            } else {
                                                i5 = 1;
                                            }
                                        } else if (str4.equals("sesame")) {
                                            i5 = 3;
                                        } else {
                                            i5 = 1;
                                        }
                                    }
                                } else {
                                    String str5 = (String) new ek2(yk2VarT, yk2VarT.f, yk2VarT.g).next();
                                    if (str5.hashCode() == 3387192 && str5.equals("none")) {
                                        i3 = 0;
                                        i5 = 0;
                                    } else {
                                        i3 = 0;
                                    }
                                }
                                kj0Var = new kj0(i5, i3, i2);
                            }
                        }
                        pj0VarC.r = kj0Var;
                        break;
                    }
                    break;
                case 1115953443:
                    if (attributeName.equals("rubyPosition")) {
                        String strV5 = dq.v(attributeValue);
                        int iHashCode5 = strV5.hashCode();
                        if (iHashCode5 != -1392885889) {
                            if (iHashCode5 == 92734940 && strV5.equals("after")) {
                                pj0VarC = c(pj0VarC);
                                pj0VarC.n = 2;
                            }
                        } else if (strV5.equals("before")) {
                            pj0VarC = c(pj0VarC);
                            pj0VarC.n = 1;
                        }
                    } else {
                        continue;
                    }
                    break;
                case 1287124693:
                    if (attributeName.equals("backgroundColor")) {
                        pj0VarC = c(pj0VarC);
                        try {
                            pj0VarC.d = bm1.a(attributeValue, z);
                            pj0VarC.e = true;
                        } catch (IllegalArgumentException unused3) {
                            ec.t(attributeValue, "Failed parsing background value: ", "TtmlParser");
                        }
                    } else {
                        continue;
                    }
                    break;
                case 1754920356:
                    if (attributeName.equals("multiRowAlign")) {
                        pj0VarC = c(pj0VarC);
                        pj0VarC.p = d(attributeValue);
                    } else {
                        continue;
                    }
                    break;
                default:
                    continue;
                    break;
            }
            z = false;
        }
        return pj0VarC;
    }

    public static pj0 c(pj0 pj0Var) {
        return pj0Var == null ? new pj0() : pj0Var;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static Layout.Alignment d(String str) {
        String strV = dq.v(str);
        switch (strV.hashCode()) {
            case -1364013995:
                if (strV.equals("center")) {
                    return Layout.Alignment.ALIGN_CENTER;
                }
                return null;
            case 100571:
                if (!strV.equals("end")) {
                    return null;
                }
                break;
            case 3317767:
                if (!strV.equals("left")) {
                    return null;
                }
                return Layout.Alignment.ALIGN_NORMAL;
            case 108511772:
                if (!strV.equals("right")) {
                    return null;
                }
                break;
            case 109757538:
                if (!strV.equals("start")) {
                    return null;
                }
                return Layout.Alignment.ALIGN_NORMAL;
            default:
                return null;
        }
        return Layout.Alignment.ALIGN_OPPOSITE;
    }

    public static long e(String str, mj0 mj0Var) throws oi0 {
        double d;
        double d2;
        Matcher matcher = g.matcher(str);
        if (matcher.matches()) {
            String strGroup = matcher.group(1);
            strGroup.getClass();
            long j2 = Long.parseLong(strGroup) * 3600;
            String strGroup2 = matcher.group(2);
            strGroup2.getClass();
            long j3 = Long.parseLong(strGroup2) * 60;
            String strGroup3 = matcher.group(3);
            strGroup3.getClass();
            double d3 = j2 + j3;
            double d4 = Long.parseLong(strGroup3);
            String strGroup4 = matcher.group(4);
            double d5 = 0.0d;
            double d6 = strGroup4 != null ? Double.parseDouble(strGroup4) : 0.0d;
            double d7 = d3 + d4;
            String strGroup5 = matcher.group(5);
            double d8 = strGroup5 != null ? Long.parseLong(strGroup5) / mj0Var.a : 0.0d;
            double d9 = d7 + d6;
            String strGroup6 = matcher.group(6);
            if (strGroup6 != null) {
                d5 = (Long.parseLong(strGroup6) / ((double) mj0Var.b)) / ((double) mj0Var.a);
            }
            return (long) ((d9 + d8 + d5) * 1000000.0d);
        }
        Matcher matcher2 = h.matcher(str);
        if (!matcher2.matches()) {
            throw new oi0("Malformed time expression: ".concat(String.valueOf(str)));
        }
        String strGroup7 = matcher2.group(1);
        strGroup7.getClass();
        double d10 = Double.parseDouble(strGroup7);
        String strGroup8 = matcher2.group(2);
        strGroup8.getClass();
        int iHashCode = strGroup8.hashCode();
        if (iHashCode != 102) {
            if (iHashCode != 104) {
                if (iHashCode != 109) {
                    if (iHashCode != 3494) {
                        if (iHashCode == 115) {
                            strGroup8.equals("s");
                        } else if (iHashCode == 116 && strGroup8.equals("t")) {
                            d = mj0Var.c;
                            d10 /= d;
                        }
                    } else if (strGroup8.equals("ms")) {
                        d = 1000.0d;
                        d10 /= d;
                    }
                } else if (strGroup8.equals("m")) {
                    d2 = 60.0d;
                    d10 *= d2;
                }
            } else if (strGroup8.equals("h")) {
                d2 = 3600.0d;
                d10 *= d2;
            }
        } else if (strGroup8.equals("f")) {
            d = mj0Var.a;
            d10 /= d;
        }
        return (long) (d10 * 1000000.0d);
    }

    /* JADX WARN: Code duplicated, block: B:157:0x034f  */
    /* JADX WARN: Code duplicated, block: B:160:0x0361  */
    /* JADX WARN: Code duplicated, block: B:163:0x036a A[Catch: NumberFormatException -> 0x0382, IOException -> 0x07f9, XmlPullParserException -> 0x0802, TryCatch #5 {NumberFormatException -> 0x0382, blocks: (B:161:0x0364, B:163:0x036a, B:165:0x0377, B:166:0x0380, B:167:0x0381), top: B:441:0x0364, outer: #20 }] */
    /* JADX WARN: Code duplicated, block: B:165:0x0377 A[Catch: NumberFormatException -> 0x0382, IOException -> 0x07f9, XmlPullParserException -> 0x0802, TryCatch #5 {NumberFormatException -> 0x0382, blocks: (B:161:0x0364, B:163:0x036a, B:165:0x0377, B:166:0x0380, B:167:0x0381), top: B:441:0x0364, outer: #20 }] */
    /* JADX WARN: Code duplicated, block: B:170:0x038f A[Catch: IOException -> 0x07f9, XmlPullParserException -> 0x0802, TryCatch #20 {IOException -> 0x07f9, XmlPullParserException -> 0x0802, blocks: (B:3:0x0008, B:6:0x005a, B:8:0x0069, B:11:0x0075, B:14:0x0087, B:16:0x008f, B:19:0x0099, B:21:0x00a1, B:25:0x00b7, B:27:0x00d2, B:29:0x00dc, B:30:0x00e0, B:32:0x00ec, B:33:0x00f0, B:67:0x0187, B:86:0x01de, B:89:0x01f2, B:91:0x01f8, B:93:0x0202, B:95:0x020a, B:97:0x0212, B:99:0x021a, B:101:0x0222, B:103:0x0228, B:105:0x0230, B:107:0x0238, B:109:0x023e, B:111:0x0244, B:113:0x024a, B:115:0x0252, B:118:0x025b, B:420:0x07de, B:120:0x0290, B:123:0x0298, B:125:0x02a1, B:127:0x02b2, B:129:0x02be, B:131:0x02ca, B:133:0x02d0, B:135:0x02e4, B:137:0x02ea, B:275:0x057d, B:130:0x02c3, B:139:0x02fa, B:142:0x0306, B:259:0x052c, B:145:0x0325, B:147:0x032d, B:149:0x0335, B:151:0x033d, B:158:0x0351, B:161:0x0364, B:163:0x036a, B:165:0x0377, B:186:0x03e1, B:188:0x03e7, B:190:0x03ed, B:192:0x03f5, B:194:0x03fb, B:197:0x040a, B:199:0x0410, B:201:0x041d, B:221:0x0494, B:223:0x049c, B:237:0x04dd, B:239:0x04e7, B:257:0x051f, B:202:0x0428, B:203:0x0429, B:204:0x042a, B:205:0x0437, B:208:0x043f, B:211:0x044d, B:213:0x0453, B:215:0x045e, B:216:0x0472, B:217:0x0473, B:218:0x0474, B:219:0x0481, B:166:0x0380, B:167:0x0381, B:168:0x0382, B:170:0x038f, B:173:0x0399, B:176:0x03a2, B:178:0x03a8, B:180:0x03b3, B:181:0x03c5, B:182:0x03c6, B:183:0x03c7, B:184:0x03cf, B:262:0x053f, B:264:0x054d, B:266:0x0558, B:268:0x055e, B:270:0x056a, B:280:0x05a4, B:284:0x05cb, B:290:0x05ed, B:293:0x05f6, B:391:0x0759, B:304:0x061e, B:307:0x0629, B:311:0x063c, B:308:0x0630, B:310:0x0638, B:328:0x066e, B:334:0x0687, B:338:0x069c, B:342:0x06b1, B:351:0x06e3, B:355:0x06ed, B:359:0x06f5, B:369:0x070c, B:377:0x071f, B:379:0x072d, B:381:0x0732, B:383:0x0736, B:384:0x073d, B:372:0x0713, B:70:0x0194, B:72:0x019e, B:75:0x01a7, B:77:0x01ad, B:79:0x01b8, B:80:0x01c2, B:81:0x01c3, B:82:0x01c4, B:37:0x010c, B:39:0x0118, B:42:0x0124, B:44:0x012a, B:46:0x0137, B:56:0x0158, B:58:0x015c, B:59:0x016f, B:66:0x017f, B:63:0x0179, B:65:0x017e, B:395:0x077e, B:397:0x078a, B:398:0x0791, B:400:0x0798, B:403:0x079c, B:405:0x07a6, B:407:0x07b0, B:411:0x07b8, B:409:0x07b5, B:414:0x07cf, B:418:0x07d7, B:425:0x07f8), top: B:464:0x0008, inners: #2, #5, #6, #15, #19 }] */
    /* JADX WARN: Code duplicated, block: B:172:0x0397 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:173:0x0399 A[Catch: IOException -> 0x07f9, XmlPullParserException -> 0x0802, TRY_LEAVE, TryCatch #20 {IOException -> 0x07f9, XmlPullParserException -> 0x0802, blocks: (B:3:0x0008, B:6:0x005a, B:8:0x0069, B:11:0x0075, B:14:0x0087, B:16:0x008f, B:19:0x0099, B:21:0x00a1, B:25:0x00b7, B:27:0x00d2, B:29:0x00dc, B:30:0x00e0, B:32:0x00ec, B:33:0x00f0, B:67:0x0187, B:86:0x01de, B:89:0x01f2, B:91:0x01f8, B:93:0x0202, B:95:0x020a, B:97:0x0212, B:99:0x021a, B:101:0x0222, B:103:0x0228, B:105:0x0230, B:107:0x0238, B:109:0x023e, B:111:0x0244, B:113:0x024a, B:115:0x0252, B:118:0x025b, B:420:0x07de, B:120:0x0290, B:123:0x0298, B:125:0x02a1, B:127:0x02b2, B:129:0x02be, B:131:0x02ca, B:133:0x02d0, B:135:0x02e4, B:137:0x02ea, B:275:0x057d, B:130:0x02c3, B:139:0x02fa, B:142:0x0306, B:259:0x052c, B:145:0x0325, B:147:0x032d, B:149:0x0335, B:151:0x033d, B:158:0x0351, B:161:0x0364, B:163:0x036a, B:165:0x0377, B:186:0x03e1, B:188:0x03e7, B:190:0x03ed, B:192:0x03f5, B:194:0x03fb, B:197:0x040a, B:199:0x0410, B:201:0x041d, B:221:0x0494, B:223:0x049c, B:237:0x04dd, B:239:0x04e7, B:257:0x051f, B:202:0x0428, B:203:0x0429, B:204:0x042a, B:205:0x0437, B:208:0x043f, B:211:0x044d, B:213:0x0453, B:215:0x045e, B:216:0x0472, B:217:0x0473, B:218:0x0474, B:219:0x0481, B:166:0x0380, B:167:0x0381, B:168:0x0382, B:170:0x038f, B:173:0x0399, B:176:0x03a2, B:178:0x03a8, B:180:0x03b3, B:181:0x03c5, B:182:0x03c6, B:183:0x03c7, B:184:0x03cf, B:262:0x053f, B:264:0x054d, B:266:0x0558, B:268:0x055e, B:270:0x056a, B:280:0x05a4, B:284:0x05cb, B:290:0x05ed, B:293:0x05f6, B:391:0x0759, B:304:0x061e, B:307:0x0629, B:311:0x063c, B:308:0x0630, B:310:0x0638, B:328:0x066e, B:334:0x0687, B:338:0x069c, B:342:0x06b1, B:351:0x06e3, B:355:0x06ed, B:359:0x06f5, B:369:0x070c, B:377:0x071f, B:379:0x072d, B:381:0x0732, B:383:0x0736, B:384:0x073d, B:372:0x0713, B:70:0x0194, B:72:0x019e, B:75:0x01a7, B:77:0x01ad, B:79:0x01b8, B:80:0x01c2, B:81:0x01c3, B:82:0x01c4, B:37:0x010c, B:39:0x0118, B:42:0x0124, B:44:0x012a, B:46:0x0137, B:56:0x0158, B:58:0x015c, B:59:0x016f, B:66:0x017f, B:63:0x0179, B:65:0x017e, B:395:0x077e, B:397:0x078a, B:398:0x0791, B:400:0x0798, B:403:0x079c, B:405:0x07a6, B:407:0x07b0, B:411:0x07b8, B:409:0x07b5, B:414:0x07cf, B:418:0x07d7, B:425:0x07f8), top: B:464:0x0008, inners: #2, #5, #6, #15, #19 }] */
    /* JADX WARN: Code duplicated, block: B:175:0x03a1  */
    /* JADX WARN: Code duplicated, block: B:178:0x03a8 A[Catch: NumberFormatException -> 0x03c7, IOException -> 0x07f9, XmlPullParserException -> 0x0802, TryCatch #2 {NumberFormatException -> 0x03c7, blocks: (B:176:0x03a2, B:178:0x03a8, B:180:0x03b3, B:181:0x03c5, B:182:0x03c6), top: B:436:0x03a2, outer: #20 }] */
    /* JADX WARN: Code duplicated, block: B:180:0x03b3 A[Catch: NumberFormatException -> 0x03c7, IOException -> 0x07f9, XmlPullParserException -> 0x0802, TryCatch #2 {NumberFormatException -> 0x03c7, blocks: (B:176:0x03a2, B:178:0x03a8, B:180:0x03b3, B:181:0x03c5, B:182:0x03c6), top: B:436:0x03a2, outer: #20 }] */
    /* JADX WARN: Code duplicated, block: B:184:0x03cf A[Catch: IOException -> 0x07f9, XmlPullParserException -> 0x0802, TryCatch #20 {IOException -> 0x07f9, XmlPullParserException -> 0x0802, blocks: (B:3:0x0008, B:6:0x005a, B:8:0x0069, B:11:0x0075, B:14:0x0087, B:16:0x008f, B:19:0x0099, B:21:0x00a1, B:25:0x00b7, B:27:0x00d2, B:29:0x00dc, B:30:0x00e0, B:32:0x00ec, B:33:0x00f0, B:67:0x0187, B:86:0x01de, B:89:0x01f2, B:91:0x01f8, B:93:0x0202, B:95:0x020a, B:97:0x0212, B:99:0x021a, B:101:0x0222, B:103:0x0228, B:105:0x0230, B:107:0x0238, B:109:0x023e, B:111:0x0244, B:113:0x024a, B:115:0x0252, B:118:0x025b, B:420:0x07de, B:120:0x0290, B:123:0x0298, B:125:0x02a1, B:127:0x02b2, B:129:0x02be, B:131:0x02ca, B:133:0x02d0, B:135:0x02e4, B:137:0x02ea, B:275:0x057d, B:130:0x02c3, B:139:0x02fa, B:142:0x0306, B:259:0x052c, B:145:0x0325, B:147:0x032d, B:149:0x0335, B:151:0x033d, B:158:0x0351, B:161:0x0364, B:163:0x036a, B:165:0x0377, B:186:0x03e1, B:188:0x03e7, B:190:0x03ed, B:192:0x03f5, B:194:0x03fb, B:197:0x040a, B:199:0x0410, B:201:0x041d, B:221:0x0494, B:223:0x049c, B:237:0x04dd, B:239:0x04e7, B:257:0x051f, B:202:0x0428, B:203:0x0429, B:204:0x042a, B:205:0x0437, B:208:0x043f, B:211:0x044d, B:213:0x0453, B:215:0x045e, B:216:0x0472, B:217:0x0473, B:218:0x0474, B:219:0x0481, B:166:0x0380, B:167:0x0381, B:168:0x0382, B:170:0x038f, B:173:0x0399, B:176:0x03a2, B:178:0x03a8, B:180:0x03b3, B:181:0x03c5, B:182:0x03c6, B:183:0x03c7, B:184:0x03cf, B:262:0x053f, B:264:0x054d, B:266:0x0558, B:268:0x055e, B:270:0x056a, B:280:0x05a4, B:284:0x05cb, B:290:0x05ed, B:293:0x05f6, B:391:0x0759, B:304:0x061e, B:307:0x0629, B:311:0x063c, B:308:0x0630, B:310:0x0638, B:328:0x066e, B:334:0x0687, B:338:0x069c, B:342:0x06b1, B:351:0x06e3, B:355:0x06ed, B:359:0x06f5, B:369:0x070c, B:377:0x071f, B:379:0x072d, B:381:0x0732, B:383:0x0736, B:384:0x073d, B:372:0x0713, B:70:0x0194, B:72:0x019e, B:75:0x01a7, B:77:0x01ad, B:79:0x01b8, B:80:0x01c2, B:81:0x01c3, B:82:0x01c4, B:37:0x010c, B:39:0x0118, B:42:0x0124, B:44:0x012a, B:46:0x0137, B:56:0x0158, B:58:0x015c, B:59:0x016f, B:66:0x017f, B:63:0x0179, B:65:0x017e, B:395:0x077e, B:397:0x078a, B:398:0x0791, B:400:0x0798, B:403:0x079c, B:405:0x07a6, B:407:0x07b0, B:411:0x07b8, B:409:0x07b5, B:414:0x07cf, B:418:0x07d7, B:425:0x07f8), top: B:464:0x0008, inners: #2, #5, #6, #15, #19 }] */
    /* JADX WARN: Code duplicated, block: B:185:0x03d7  */
    /* JADX WARN: Code duplicated, block: B:194:0x03fb A[Catch: IOException -> 0x07f9, XmlPullParserException -> 0x0802, TRY_LEAVE, TryCatch #20 {IOException -> 0x07f9, XmlPullParserException -> 0x0802, blocks: (B:3:0x0008, B:6:0x005a, B:8:0x0069, B:11:0x0075, B:14:0x0087, B:16:0x008f, B:19:0x0099, B:21:0x00a1, B:25:0x00b7, B:27:0x00d2, B:29:0x00dc, B:30:0x00e0, B:32:0x00ec, B:33:0x00f0, B:67:0x0187, B:86:0x01de, B:89:0x01f2, B:91:0x01f8, B:93:0x0202, B:95:0x020a, B:97:0x0212, B:99:0x021a, B:101:0x0222, B:103:0x0228, B:105:0x0230, B:107:0x0238, B:109:0x023e, B:111:0x0244, B:113:0x024a, B:115:0x0252, B:118:0x025b, B:420:0x07de, B:120:0x0290, B:123:0x0298, B:125:0x02a1, B:127:0x02b2, B:129:0x02be, B:131:0x02ca, B:133:0x02d0, B:135:0x02e4, B:137:0x02ea, B:275:0x057d, B:130:0x02c3, B:139:0x02fa, B:142:0x0306, B:259:0x052c, B:145:0x0325, B:147:0x032d, B:149:0x0335, B:151:0x033d, B:158:0x0351, B:161:0x0364, B:163:0x036a, B:165:0x0377, B:186:0x03e1, B:188:0x03e7, B:190:0x03ed, B:192:0x03f5, B:194:0x03fb, B:197:0x040a, B:199:0x0410, B:201:0x041d, B:221:0x0494, B:223:0x049c, B:237:0x04dd, B:239:0x04e7, B:257:0x051f, B:202:0x0428, B:203:0x0429, B:204:0x042a, B:205:0x0437, B:208:0x043f, B:211:0x044d, B:213:0x0453, B:215:0x045e, B:216:0x0472, B:217:0x0473, B:218:0x0474, B:219:0x0481, B:166:0x0380, B:167:0x0381, B:168:0x0382, B:170:0x038f, B:173:0x0399, B:176:0x03a2, B:178:0x03a8, B:180:0x03b3, B:181:0x03c5, B:182:0x03c6, B:183:0x03c7, B:184:0x03cf, B:262:0x053f, B:264:0x054d, B:266:0x0558, B:268:0x055e, B:270:0x056a, B:280:0x05a4, B:284:0x05cb, B:290:0x05ed, B:293:0x05f6, B:391:0x0759, B:304:0x061e, B:307:0x0629, B:311:0x063c, B:308:0x0630, B:310:0x0638, B:328:0x066e, B:334:0x0687, B:338:0x069c, B:342:0x06b1, B:351:0x06e3, B:355:0x06ed, B:359:0x06f5, B:369:0x070c, B:377:0x071f, B:379:0x072d, B:381:0x0732, B:383:0x0736, B:384:0x073d, B:372:0x0713, B:70:0x0194, B:72:0x019e, B:75:0x01a7, B:77:0x01ad, B:79:0x01b8, B:80:0x01c2, B:81:0x01c3, B:82:0x01c4, B:37:0x010c, B:39:0x0118, B:42:0x0124, B:44:0x012a, B:46:0x0137, B:56:0x0158, B:58:0x015c, B:59:0x016f, B:66:0x017f, B:63:0x0179, B:65:0x017e, B:395:0x077e, B:397:0x078a, B:398:0x0791, B:400:0x0798, B:403:0x079c, B:405:0x07a6, B:407:0x07b0, B:411:0x07b8, B:409:0x07b5, B:414:0x07cf, B:418:0x07d7, B:425:0x07f8), top: B:464:0x0008, inners: #2, #5, #6, #15, #19 }] */
    /* JADX WARN: Code duplicated, block: B:196:0x0409  */
    /* JADX WARN: Code duplicated, block: B:199:0x0410 A[Catch: NumberFormatException -> 0x042a, IOException -> 0x07f9, XmlPullParserException -> 0x0802, TryCatch #19 {NumberFormatException -> 0x042a, blocks: (B:197:0x040a, B:199:0x0410, B:201:0x041d, B:202:0x0428, B:203:0x0429), top: B:463:0x040a, outer: #20 }] */
    /* JADX WARN: Code duplicated, block: B:201:0x041d A[Catch: NumberFormatException -> 0x042a, IOException -> 0x07f9, XmlPullParserException -> 0x0802, TryCatch #19 {NumberFormatException -> 0x042a, blocks: (B:197:0x040a, B:199:0x0410, B:201:0x041d, B:202:0x0428, B:203:0x0429), top: B:463:0x040a, outer: #20 }] */
    /* JADX WARN: Code duplicated, block: B:205:0x0437 A[Catch: IOException -> 0x07f9, XmlPullParserException -> 0x0802, TryCatch #20 {IOException -> 0x07f9, XmlPullParserException -> 0x0802, blocks: (B:3:0x0008, B:6:0x005a, B:8:0x0069, B:11:0x0075, B:14:0x0087, B:16:0x008f, B:19:0x0099, B:21:0x00a1, B:25:0x00b7, B:27:0x00d2, B:29:0x00dc, B:30:0x00e0, B:32:0x00ec, B:33:0x00f0, B:67:0x0187, B:86:0x01de, B:89:0x01f2, B:91:0x01f8, B:93:0x0202, B:95:0x020a, B:97:0x0212, B:99:0x021a, B:101:0x0222, B:103:0x0228, B:105:0x0230, B:107:0x0238, B:109:0x023e, B:111:0x0244, B:113:0x024a, B:115:0x0252, B:118:0x025b, B:420:0x07de, B:120:0x0290, B:123:0x0298, B:125:0x02a1, B:127:0x02b2, B:129:0x02be, B:131:0x02ca, B:133:0x02d0, B:135:0x02e4, B:137:0x02ea, B:275:0x057d, B:130:0x02c3, B:139:0x02fa, B:142:0x0306, B:259:0x052c, B:145:0x0325, B:147:0x032d, B:149:0x0335, B:151:0x033d, B:158:0x0351, B:161:0x0364, B:163:0x036a, B:165:0x0377, B:186:0x03e1, B:188:0x03e7, B:190:0x03ed, B:192:0x03f5, B:194:0x03fb, B:197:0x040a, B:199:0x0410, B:201:0x041d, B:221:0x0494, B:223:0x049c, B:237:0x04dd, B:239:0x04e7, B:257:0x051f, B:202:0x0428, B:203:0x0429, B:204:0x042a, B:205:0x0437, B:208:0x043f, B:211:0x044d, B:213:0x0453, B:215:0x045e, B:216:0x0472, B:217:0x0473, B:218:0x0474, B:219:0x0481, B:166:0x0380, B:167:0x0381, B:168:0x0382, B:170:0x038f, B:173:0x0399, B:176:0x03a2, B:178:0x03a8, B:180:0x03b3, B:181:0x03c5, B:182:0x03c6, B:183:0x03c7, B:184:0x03cf, B:262:0x053f, B:264:0x054d, B:266:0x0558, B:268:0x055e, B:270:0x056a, B:280:0x05a4, B:284:0x05cb, B:290:0x05ed, B:293:0x05f6, B:391:0x0759, B:304:0x061e, B:307:0x0629, B:311:0x063c, B:308:0x0630, B:310:0x0638, B:328:0x066e, B:334:0x0687, B:338:0x069c, B:342:0x06b1, B:351:0x06e3, B:355:0x06ed, B:359:0x06f5, B:369:0x070c, B:377:0x071f, B:379:0x072d, B:381:0x0732, B:383:0x0736, B:384:0x073d, B:372:0x0713, B:70:0x0194, B:72:0x019e, B:75:0x01a7, B:77:0x01ad, B:79:0x01b8, B:80:0x01c2, B:81:0x01c3, B:82:0x01c4, B:37:0x010c, B:39:0x0118, B:42:0x0124, B:44:0x012a, B:46:0x0137, B:56:0x0158, B:58:0x015c, B:59:0x016f, B:66:0x017f, B:63:0x0179, B:65:0x017e, B:395:0x077e, B:397:0x078a, B:398:0x0791, B:400:0x0798, B:403:0x079c, B:405:0x07a6, B:407:0x07b0, B:411:0x07b8, B:409:0x07b5, B:414:0x07cf, B:418:0x07d7, B:425:0x07f8), top: B:464:0x0008, inners: #2, #5, #6, #15, #19 }] */
    /* JADX WARN: Code duplicated, block: B:207:0x043d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:208:0x043f A[Catch: IOException -> 0x07f9, XmlPullParserException -> 0x0802, TRY_LEAVE, TryCatch #20 {IOException -> 0x07f9, XmlPullParserException -> 0x0802, blocks: (B:3:0x0008, B:6:0x005a, B:8:0x0069, B:11:0x0075, B:14:0x0087, B:16:0x008f, B:19:0x0099, B:21:0x00a1, B:25:0x00b7, B:27:0x00d2, B:29:0x00dc, B:30:0x00e0, B:32:0x00ec, B:33:0x00f0, B:67:0x0187, B:86:0x01de, B:89:0x01f2, B:91:0x01f8, B:93:0x0202, B:95:0x020a, B:97:0x0212, B:99:0x021a, B:101:0x0222, B:103:0x0228, B:105:0x0230, B:107:0x0238, B:109:0x023e, B:111:0x0244, B:113:0x024a, B:115:0x0252, B:118:0x025b, B:420:0x07de, B:120:0x0290, B:123:0x0298, B:125:0x02a1, B:127:0x02b2, B:129:0x02be, B:131:0x02ca, B:133:0x02d0, B:135:0x02e4, B:137:0x02ea, B:275:0x057d, B:130:0x02c3, B:139:0x02fa, B:142:0x0306, B:259:0x052c, B:145:0x0325, B:147:0x032d, B:149:0x0335, B:151:0x033d, B:158:0x0351, B:161:0x0364, B:163:0x036a, B:165:0x0377, B:186:0x03e1, B:188:0x03e7, B:190:0x03ed, B:192:0x03f5, B:194:0x03fb, B:197:0x040a, B:199:0x0410, B:201:0x041d, B:221:0x0494, B:223:0x049c, B:237:0x04dd, B:239:0x04e7, B:257:0x051f, B:202:0x0428, B:203:0x0429, B:204:0x042a, B:205:0x0437, B:208:0x043f, B:211:0x044d, B:213:0x0453, B:215:0x045e, B:216:0x0472, B:217:0x0473, B:218:0x0474, B:219:0x0481, B:166:0x0380, B:167:0x0381, B:168:0x0382, B:170:0x038f, B:173:0x0399, B:176:0x03a2, B:178:0x03a8, B:180:0x03b3, B:181:0x03c5, B:182:0x03c6, B:183:0x03c7, B:184:0x03cf, B:262:0x053f, B:264:0x054d, B:266:0x0558, B:268:0x055e, B:270:0x056a, B:280:0x05a4, B:284:0x05cb, B:290:0x05ed, B:293:0x05f6, B:391:0x0759, B:304:0x061e, B:307:0x0629, B:311:0x063c, B:308:0x0630, B:310:0x0638, B:328:0x066e, B:334:0x0687, B:338:0x069c, B:342:0x06b1, B:351:0x06e3, B:355:0x06ed, B:359:0x06f5, B:369:0x070c, B:377:0x071f, B:379:0x072d, B:381:0x0732, B:383:0x0736, B:384:0x073d, B:372:0x0713, B:70:0x0194, B:72:0x019e, B:75:0x01a7, B:77:0x01ad, B:79:0x01b8, B:80:0x01c2, B:81:0x01c3, B:82:0x01c4, B:37:0x010c, B:39:0x0118, B:42:0x0124, B:44:0x012a, B:46:0x0137, B:56:0x0158, B:58:0x015c, B:59:0x016f, B:66:0x017f, B:63:0x0179, B:65:0x017e, B:395:0x077e, B:397:0x078a, B:398:0x0791, B:400:0x0798, B:403:0x079c, B:405:0x07a6, B:407:0x07b0, B:411:0x07b8, B:409:0x07b5, B:414:0x07cf, B:418:0x07d7, B:425:0x07f8), top: B:464:0x0008, inners: #2, #5, #6, #15, #19 }] */
    /* JADX WARN: Code duplicated, block: B:210:0x044c  */
    /* JADX WARN: Code duplicated, block: B:213:0x0453 A[Catch: NumberFormatException -> 0x0474, IOException -> 0x07f9, XmlPullParserException -> 0x0802, TryCatch #15 {NumberFormatException -> 0x0474, blocks: (B:211:0x044d, B:213:0x0453, B:215:0x045e, B:216:0x0472, B:217:0x0473), top: B:458:0x044d, outer: #20 }] */
    /* JADX WARN: Code duplicated, block: B:215:0x045e A[Catch: NumberFormatException -> 0x0474, IOException -> 0x07f9, XmlPullParserException -> 0x0802, TryCatch #15 {NumberFormatException -> 0x0474, blocks: (B:211:0x044d, B:213:0x0453, B:215:0x045e, B:216:0x0472, B:217:0x0473), top: B:458:0x044d, outer: #20 }] */
    /* JADX WARN: Code duplicated, block: B:219:0x0481 A[Catch: IOException -> 0x07f9, XmlPullParserException -> 0x0802, TryCatch #20 {IOException -> 0x07f9, XmlPullParserException -> 0x0802, blocks: (B:3:0x0008, B:6:0x005a, B:8:0x0069, B:11:0x0075, B:14:0x0087, B:16:0x008f, B:19:0x0099, B:21:0x00a1, B:25:0x00b7, B:27:0x00d2, B:29:0x00dc, B:30:0x00e0, B:32:0x00ec, B:33:0x00f0, B:67:0x0187, B:86:0x01de, B:89:0x01f2, B:91:0x01f8, B:93:0x0202, B:95:0x020a, B:97:0x0212, B:99:0x021a, B:101:0x0222, B:103:0x0228, B:105:0x0230, B:107:0x0238, B:109:0x023e, B:111:0x0244, B:113:0x024a, B:115:0x0252, B:118:0x025b, B:420:0x07de, B:120:0x0290, B:123:0x0298, B:125:0x02a1, B:127:0x02b2, B:129:0x02be, B:131:0x02ca, B:133:0x02d0, B:135:0x02e4, B:137:0x02ea, B:275:0x057d, B:130:0x02c3, B:139:0x02fa, B:142:0x0306, B:259:0x052c, B:145:0x0325, B:147:0x032d, B:149:0x0335, B:151:0x033d, B:158:0x0351, B:161:0x0364, B:163:0x036a, B:165:0x0377, B:186:0x03e1, B:188:0x03e7, B:190:0x03ed, B:192:0x03f5, B:194:0x03fb, B:197:0x040a, B:199:0x0410, B:201:0x041d, B:221:0x0494, B:223:0x049c, B:237:0x04dd, B:239:0x04e7, B:257:0x051f, B:202:0x0428, B:203:0x0429, B:204:0x042a, B:205:0x0437, B:208:0x043f, B:211:0x044d, B:213:0x0453, B:215:0x045e, B:216:0x0472, B:217:0x0473, B:218:0x0474, B:219:0x0481, B:166:0x0380, B:167:0x0381, B:168:0x0382, B:170:0x038f, B:173:0x0399, B:176:0x03a2, B:178:0x03a8, B:180:0x03b3, B:181:0x03c5, B:182:0x03c6, B:183:0x03c7, B:184:0x03cf, B:262:0x053f, B:264:0x054d, B:266:0x0558, B:268:0x055e, B:270:0x056a, B:280:0x05a4, B:284:0x05cb, B:290:0x05ed, B:293:0x05f6, B:391:0x0759, B:304:0x061e, B:307:0x0629, B:311:0x063c, B:308:0x0630, B:310:0x0638, B:328:0x066e, B:334:0x0687, B:338:0x069c, B:342:0x06b1, B:351:0x06e3, B:355:0x06ed, B:359:0x06f5, B:369:0x070c, B:377:0x071f, B:379:0x072d, B:381:0x0732, B:383:0x0736, B:384:0x073d, B:372:0x0713, B:70:0x0194, B:72:0x019e, B:75:0x01a7, B:77:0x01ad, B:79:0x01b8, B:80:0x01c2, B:81:0x01c3, B:82:0x01c4, B:37:0x010c, B:39:0x0118, B:42:0x0124, B:44:0x012a, B:46:0x0137, B:56:0x0158, B:58:0x015c, B:59:0x016f, B:66:0x017f, B:63:0x0179, B:65:0x017e, B:395:0x077e, B:397:0x078a, B:398:0x0791, B:400:0x0798, B:403:0x079c, B:405:0x07a6, B:407:0x07b0, B:411:0x07b8, B:409:0x07b5, B:414:0x07cf, B:418:0x07d7, B:425:0x07f8), top: B:464:0x0008, inners: #2, #5, #6, #15, #19 }] */
    /* JADX WARN: Code duplicated, block: B:220:0x0490  */
    /* JADX WARN: Code duplicated, block: B:223:0x049c A[Catch: IOException -> 0x07f9, XmlPullParserException -> 0x0802, TRY_LEAVE, TryCatch #20 {IOException -> 0x07f9, XmlPullParserException -> 0x0802, blocks: (B:3:0x0008, B:6:0x005a, B:8:0x0069, B:11:0x0075, B:14:0x0087, B:16:0x008f, B:19:0x0099, B:21:0x00a1, B:25:0x00b7, B:27:0x00d2, B:29:0x00dc, B:30:0x00e0, B:32:0x00ec, B:33:0x00f0, B:67:0x0187, B:86:0x01de, B:89:0x01f2, B:91:0x01f8, B:93:0x0202, B:95:0x020a, B:97:0x0212, B:99:0x021a, B:101:0x0222, B:103:0x0228, B:105:0x0230, B:107:0x0238, B:109:0x023e, B:111:0x0244, B:113:0x024a, B:115:0x0252, B:118:0x025b, B:420:0x07de, B:120:0x0290, B:123:0x0298, B:125:0x02a1, B:127:0x02b2, B:129:0x02be, B:131:0x02ca, B:133:0x02d0, B:135:0x02e4, B:137:0x02ea, B:275:0x057d, B:130:0x02c3, B:139:0x02fa, B:142:0x0306, B:259:0x052c, B:145:0x0325, B:147:0x032d, B:149:0x0335, B:151:0x033d, B:158:0x0351, B:161:0x0364, B:163:0x036a, B:165:0x0377, B:186:0x03e1, B:188:0x03e7, B:190:0x03ed, B:192:0x03f5, B:194:0x03fb, B:197:0x040a, B:199:0x0410, B:201:0x041d, B:221:0x0494, B:223:0x049c, B:237:0x04dd, B:239:0x04e7, B:257:0x051f, B:202:0x0428, B:203:0x0429, B:204:0x042a, B:205:0x0437, B:208:0x043f, B:211:0x044d, B:213:0x0453, B:215:0x045e, B:216:0x0472, B:217:0x0473, B:218:0x0474, B:219:0x0481, B:166:0x0380, B:167:0x0381, B:168:0x0382, B:170:0x038f, B:173:0x0399, B:176:0x03a2, B:178:0x03a8, B:180:0x03b3, B:181:0x03c5, B:182:0x03c6, B:183:0x03c7, B:184:0x03cf, B:262:0x053f, B:264:0x054d, B:266:0x0558, B:268:0x055e, B:270:0x056a, B:280:0x05a4, B:284:0x05cb, B:290:0x05ed, B:293:0x05f6, B:391:0x0759, B:304:0x061e, B:307:0x0629, B:311:0x063c, B:308:0x0630, B:310:0x0638, B:328:0x066e, B:334:0x0687, B:338:0x069c, B:342:0x06b1, B:351:0x06e3, B:355:0x06ed, B:359:0x06f5, B:369:0x070c, B:377:0x071f, B:379:0x072d, B:381:0x0732, B:383:0x0736, B:384:0x073d, B:372:0x0713, B:70:0x0194, B:72:0x019e, B:75:0x01a7, B:77:0x01ad, B:79:0x01b8, B:80:0x01c2, B:81:0x01c3, B:82:0x01c4, B:37:0x010c, B:39:0x0118, B:42:0x0124, B:44:0x012a, B:46:0x0137, B:56:0x0158, B:58:0x015c, B:59:0x016f, B:66:0x017f, B:63:0x0179, B:65:0x017e, B:395:0x077e, B:397:0x078a, B:398:0x0791, B:400:0x0798, B:403:0x079c, B:405:0x07a6, B:407:0x07b0, B:411:0x07b8, B:409:0x07b5, B:414:0x07cf, B:418:0x07d7, B:425:0x07f8), top: B:464:0x0008, inners: #2, #5, #6, #15, #19 }] */
    /* JADX WARN: Code duplicated, block: B:226:0x04a9  */
    /* JADX WARN: Code duplicated, block: B:232:0x04c0  */
    /* JADX WARN: Code duplicated, block: B:234:0x04c8  */
    /* JADX WARN: Code duplicated, block: B:235:0x04d4  */
    /* JADX WARN: Code duplicated, block: B:239:0x04e7 A[Catch: IOException -> 0x07f9, XmlPullParserException -> 0x0802, TRY_LEAVE, TryCatch #20 {IOException -> 0x07f9, XmlPullParserException -> 0x0802, blocks: (B:3:0x0008, B:6:0x005a, B:8:0x0069, B:11:0x0075, B:14:0x0087, B:16:0x008f, B:19:0x0099, B:21:0x00a1, B:25:0x00b7, B:27:0x00d2, B:29:0x00dc, B:30:0x00e0, B:32:0x00ec, B:33:0x00f0, B:67:0x0187, B:86:0x01de, B:89:0x01f2, B:91:0x01f8, B:93:0x0202, B:95:0x020a, B:97:0x0212, B:99:0x021a, B:101:0x0222, B:103:0x0228, B:105:0x0230, B:107:0x0238, B:109:0x023e, B:111:0x0244, B:113:0x024a, B:115:0x0252, B:118:0x025b, B:420:0x07de, B:120:0x0290, B:123:0x0298, B:125:0x02a1, B:127:0x02b2, B:129:0x02be, B:131:0x02ca, B:133:0x02d0, B:135:0x02e4, B:137:0x02ea, B:275:0x057d, B:130:0x02c3, B:139:0x02fa, B:142:0x0306, B:259:0x052c, B:145:0x0325, B:147:0x032d, B:149:0x0335, B:151:0x033d, B:158:0x0351, B:161:0x0364, B:163:0x036a, B:165:0x0377, B:186:0x03e1, B:188:0x03e7, B:190:0x03ed, B:192:0x03f5, B:194:0x03fb, B:197:0x040a, B:199:0x0410, B:201:0x041d, B:221:0x0494, B:223:0x049c, B:237:0x04dd, B:239:0x04e7, B:257:0x051f, B:202:0x0428, B:203:0x0429, B:204:0x042a, B:205:0x0437, B:208:0x043f, B:211:0x044d, B:213:0x0453, B:215:0x045e, B:216:0x0472, B:217:0x0473, B:218:0x0474, B:219:0x0481, B:166:0x0380, B:167:0x0381, B:168:0x0382, B:170:0x038f, B:173:0x0399, B:176:0x03a2, B:178:0x03a8, B:180:0x03b3, B:181:0x03c5, B:182:0x03c6, B:183:0x03c7, B:184:0x03cf, B:262:0x053f, B:264:0x054d, B:266:0x0558, B:268:0x055e, B:270:0x056a, B:280:0x05a4, B:284:0x05cb, B:290:0x05ed, B:293:0x05f6, B:391:0x0759, B:304:0x061e, B:307:0x0629, B:311:0x063c, B:308:0x0630, B:310:0x0638, B:328:0x066e, B:334:0x0687, B:338:0x069c, B:342:0x06b1, B:351:0x06e3, B:355:0x06ed, B:359:0x06f5, B:369:0x070c, B:377:0x071f, B:379:0x072d, B:381:0x0732, B:383:0x0736, B:384:0x073d, B:372:0x0713, B:70:0x0194, B:72:0x019e, B:75:0x01a7, B:77:0x01ad, B:79:0x01b8, B:80:0x01c2, B:81:0x01c3, B:82:0x01c4, B:37:0x010c, B:39:0x0118, B:42:0x0124, B:44:0x012a, B:46:0x0137, B:56:0x0158, B:58:0x015c, B:59:0x016f, B:66:0x017f, B:63:0x0179, B:65:0x017e, B:395:0x077e, B:397:0x078a, B:398:0x0791, B:400:0x0798, B:403:0x079c, B:405:0x07a6, B:407:0x07b0, B:411:0x07b8, B:409:0x07b5, B:414:0x07cf, B:418:0x07d7, B:425:0x07f8), top: B:464:0x0008, inners: #2, #5, #6, #15, #19 }] */
    /* JADX WARN: Code duplicated, block: B:242:0x04f3  */
    /* JADX WARN: Code duplicated, block: B:244:0x04f8  */
    /* JADX WARN: Code duplicated, block: B:250:0x0509  */
    /* JADX WARN: Code duplicated, block: B:253:0x0512  */
    /* JADX WARN: Code duplicated, block: B:255:0x051a  */
    /* JADX WARN: Code duplicated, block: B:256:0x051d  */
    /* JADX WARN: Code duplicated, block: B:471:0x0381 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:472:0x0380 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:473:0x03c6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:474:0x03c5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:475:0x0429 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:476:0x0428 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:477:0x0473 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:478:0x0472 A[SYNTHETIC] */
    /* JADX WARN: Failed to find 'out' block for switch in B:286:0x05d9. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v23 */
    /* JADX WARN: Type inference failed for: r14v24 */
    /* JADX WARN: Type inference failed for: r14v26 */
    /* JADX WARN: Type inference failed for: r14v27 */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r14v9, types: [pt] */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v24 */
    /* JADX WARN: Type inference failed for: r15v26 */
    /* JADX WARN: Type inference failed for: r15v27 */
    /* JADX WARN: Type inference failed for: r15v28 */
    /* JADX WARN: Type inference failed for: r15v29 */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r15v7 */
    /* JADX WARN: Type inference failed for: r15v8 */
    /* JADX WARN: Type inference failed for: r15v9 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v10 */
    /* JADX WARN: Type inference failed for: r16v11 */
    /* JADX WARN: Type inference failed for: r16v12 */
    /* JADX WARN: Type inference failed for: r16v13 */
    /* JADX WARN: Type inference failed for: r16v14 */
    /* JADX WARN: Type inference failed for: r16v15 */
    /* JADX WARN: Type inference failed for: r16v16 */
    /* JADX WARN: Type inference failed for: r16v17 */
    /* JADX WARN: Type inference failed for: r16v18 */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r16v21 */
    /* JADX WARN: Type inference failed for: r16v23, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r16v29 */
    /* JADX WARN: Type inference failed for: r16v3 */
    /* JADX WARN: Type inference failed for: r16v32 */
    /* JADX WARN: Type inference failed for: r16v33 */
    /* JADX WARN: Type inference failed for: r16v34 */
    /* JADX WARN: Type inference failed for: r16v36 */
    /* JADX WARN: Type inference failed for: r16v37 */
    /* JADX WARN: Type inference failed for: r16v38 */
    /* JADX WARN: Type inference failed for: r16v39 */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r16v40 */
    /* JADX WARN: Type inference failed for: r16v41 */
    /* JADX WARN: Type inference failed for: r16v42 */
    /* JADX WARN: Type inference failed for: r16v43 */
    /* JADX WARN: Type inference failed for: r16v44 */
    /* JADX WARN: Type inference failed for: r16v45 */
    /* JADX WARN: Type inference failed for: r16v46 */
    /* JADX WARN: Type inference failed for: r16v47 */
    /* JADX WARN: Type inference failed for: r16v48 */
    /* JADX WARN: Type inference failed for: r16v49 */
    /* JADX WARN: Type inference failed for: r16v5 */
    /* JADX WARN: Type inference failed for: r16v50 */
    /* JADX WARN: Type inference failed for: r16v51 */
    /* JADX WARN: Type inference failed for: r16v6 */
    /* JADX WARN: Type inference failed for: r16v7 */
    /* JADX WARN: Type inference failed for: r16v8 */
    /* JADX WARN: Type inference failed for: r16v9 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v23, types: [mj0] */
    /* JADX WARN: Type inference failed for: r1v24, types: [mj0] */
    /* JADX WARN: Type inference failed for: r1v25, types: [mj0] */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v31 */
    /* JADX WARN: Type inference failed for: r1v83 */
    /* JADX WARN: Type inference failed for: r1v84 */
    /* JADX WARN: Type inference failed for: r1v85 */
    /* JADX WARN: Type inference failed for: r1v86 */
    /* JADX WARN: Type inference failed for: r1v87 */
    /* JADX WARN: Type inference failed for: r2v31 */
    /* JADX WARN: Type inference failed for: r2v39 */
    /* JADX WARN: Type inference failed for: r2v65, types: [java.lang.Object, oj0] */
    /* JADX WARN: Type inference failed for: r2v67 */
    /* JADX WARN: Type inference failed for: r47v1, types: [java.lang.Throwable, pj0] */
    /* JADX WARN: Type inference failed for: r8v42, types: [mj0] */
    public final kd0 a(byte[] bArr, int i2, int i3) {
        String str;
        String str2;
        String str3;
        mj0 mj0Var;
        kd0 kd0Var;
        HashMap map;
        ?? r14;
        ?? r15;
        HashMap map2;
        int i4;
        int i5;
        ?? r16;
        lj0 lj0Var;
        lj0 lj0Var2;
        long j2;
        long j3;
        boolean z;
        String str4;
        String[] strArrSplit;
        int i6;
        ?? r17;
        int i7;
        String str5;
        String str6;
        String str7;
        String strQ;
        String str8;
        String strA;
        String str9;
        Pattern pattern;
        HashMap map3;
        float f;
        float f2;
        ?? oj0Var;
        String strQ2;
        float f3;
        float f4;
        String strQ3;
        float f5;
        int i8;
        String strQ4;
        int i9;
        String strV;
        int iHashCode;
        String strV2;
        int iHashCode2;
        Matcher matcher;
        Matcher matcher2;
        String strGroup;
        int i10;
        String strGroup2;
        String strGroup3;
        float f6;
        String strGroup4;
        String strQ5;
        pj0 pj0Var;
        Matcher matcher3;
        Matcher matcher4;
        String strGroup5;
        int i11;
        String strGroup6;
        String strGroup7;
        float f7;
        String strGroup8;
        pj0 pj0Var2;
        String[] strArrSplit2;
        float f8;
        boolean z2;
        int i12;
        ?? r18;
        ?? ptVar;
        ?? r19;
        String str10 = "";
        String str11 = "http://www.w3.org/ns/ttml#parameter";
        String str12 = "Ignoring unsupported tag: ";
        try {
            XmlPullParser xmlPullParserNewPullParser = this.f.newPullParser();
            HashMap map4 = new HashMap();
            HashMap map5 = new HashMap();
            HashMap map6 = new HashMap();
            map5.put("", new oj0("", -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE));
            Object obj = null;
            xmlPullParserNewPullParser.setInput(new ByteArrayInputStream(bArr, i2, i3), null);
            ArrayDeque arrayDeque = new ArrayDeque();
            int eventType = xmlPullParserNewPullParser.getEventType();
            mj0 mj0Var2 = n;
            kd0 kd0Var2 = null;
            ?? r110 = 0;
            ?? r111 = mj0Var2;
            int i13 = 0;
            int i14 = 15;
            while (eventType != 1) {
                ?? r47 = obj;
                lj0 lj0Var3 = (lj0) arrayDeque.peek();
                int i15 = 0;
                if (i13 == 0) {
                    String name = xmlPullParserNewPullParser.getName();
                    str = str10;
                    if (eventType == 2) {
                        boolean zEquals = "tt".equals(name);
                        Pattern pattern2 = l;
                        kd0 kd0Var3 = kd0Var2;
                        if (zEquals) {
                            String attributeValue = xmlPullParserNewPullParser.getAttributeValue(str11, "frameRate");
                            int i16 = attributeValue != null ? Integer.parseInt(attributeValue) : 30;
                            String attributeValue2 = xmlPullParserNewPullParser.getAttributeValue(str11, "frameRateMultiplier");
                            if (attributeValue2 != null) {
                                String str13 = qz1.a;
                                String[] strArrSplit3 = attributeValue2.split(" ", -1);
                                hn.B("frameRateMultiplier doesn't have 2 parts", strArrSplit3.length == 2);
                                f8 = Integer.parseInt(strArrSplit3[0]) / Integer.parseInt(strArrSplit3[1]);
                            } else {
                                f8 = 1.0f;
                            }
                            int i17 = mj0Var2.b;
                            String attributeValue3 = xmlPullParserNewPullParser.getAttributeValue(str11, "subFrameRate");
                            if (attributeValue3 != null) {
                                i17 = Integer.parseInt(attributeValue3);
                            }
                            int i18 = mj0Var2.c;
                            float f9 = f8;
                            String attributeValue4 = xmlPullParserNewPullParser.getAttributeValue(str11, "tickRate");
                            if (attributeValue4 != null) {
                                i18 = Integer.parseInt(attributeValue4);
                            }
                            ?? mj0Var3 = new mj0(i16 * f9, i17, i18);
                            String attributeValue5 = xmlPullParserNewPullParser.getAttributeValue(str11, "cellResolution");
                            if (attributeValue5 == null) {
                                str2 = str11;
                                r19 = mj0Var3;
                                mj0Var = mj0Var2;
                                i14 = 15;
                                r18 = r19;
                            } else {
                                Matcher matcher5 = m.matcher(attributeValue5);
                                if (matcher5.matches()) {
                                    str2 = str11;
                                    try {
                                        mj0Var3 = matcher5.group(1);
                                        try {
                                            if (mj0Var3 == 0) {
                                                throw r47;
                                            }
                                            int i19 = Integer.parseInt(mj0Var3);
                                            String strGroup9 = matcher5.group(2);
                                            if (strGroup9 == null) {
                                                throw r47;
                                            }
                                            int i20 = Integer.parseInt(strGroup9);
                                            if (i19 == 0) {
                                                z2 = false;
                                                i12 = i20;
                                            } else if (i20 != 0) {
                                                i12 = i20;
                                                z2 = true;
                                            } else {
                                                i12 = 0;
                                                z2 = false;
                                            }
                                            if (z2) {
                                                r18 = mj0Var3;
                                                mj0Var = mj0Var2;
                                                i14 = i12;
                                            } else {
                                                try {
                                                    throw new IllegalArgumentException(jn.E("Invalid cell resolution %s %s", Integer.valueOf(i19), Integer.valueOf(i12)));
                                                } catch (NumberFormatException unused) {
                                                }
                                            }
                                        } catch (NumberFormatException unused2) {
                                            s90.Q("TtmlParser", "Ignoring malformed cell resolution: ".concat(attributeValue5));
                                            r19 = mj0Var3;
                                            i14 = 15;
                                            r18 = r19;
                                        }
                                    } catch (NumberFormatException unused3) {
                                    }
                                    mj0Var = mj0Var2;
                                    s90.Q("TtmlParser", "Ignoring malformed cell resolution: ".concat(attributeValue5));
                                    r19 = mj0Var3;
                                    i14 = 15;
                                    r18 = r19;
                                } else {
                                    s90.Q("TtmlParser", "Ignoring malformed cell resolution: ".concat(attributeValue5));
                                    str2 = str11;
                                    r19 = mj0Var3;
                                    mj0Var = mj0Var2;
                                    i14 = 15;
                                    r18 = r19;
                                }
                            }
                            String strQ6 = ss0.Q(xmlPullParserNewPullParser, "extent");
                            if (strQ6 == null) {
                                ptVar = r47;
                                r15 = r18;
                                r14 = ptVar;
                            } else {
                                Matcher matcher6 = pattern2.matcher(strQ6);
                                if (matcher6.matches()) {
                                    try {
                                        String strGroup10 = matcher6.group(1);
                                        if (strGroup10 == null) {
                                            throw r47;
                                        }
                                        int i21 = Integer.parseInt(strGroup10);
                                        String strGroup11 = matcher6.group(2);
                                        if (strGroup11 == null) {
                                            throw r47;
                                        }
                                        ptVar = new pt(i21, Integer.parseInt(strGroup11));
                                        r15 = r18;
                                        r14 = ptVar;
                                    } catch (NumberFormatException unused4) {
                                        s90.Q("TtmlParser", "Ignoring malformed tts extent: ".concat(strQ6));
                                        ptVar = r47;
                                    }
                                } else {
                                    s90.Q("TtmlParser", "Ignoring non-pixel tts extent: ".concat(strQ6));
                                }
                                ptVar = r47;
                                r15 = r18;
                                r14 = ptVar;
                            }
                        } else {
                            str2 = str11;
                            lj0Var3 = lj0Var3;
                            arrayDeque = arrayDeque;
                            mj0Var = mj0Var2;
                            r14 = r110;
                            r15 = r111;
                        }
                        int i22 = i14;
                        String str14 = "image";
                        String str15 = "metadata";
                        String str16 = "region";
                        String str17 = "head";
                        ?? r112 = r15;
                        if (name.equals("tt") || name.equals("head")) {
                            map2 = map6;
                        } else {
                            map2 = map6;
                            if (!name.equals("body") && !name.equals("div") && !name.equals("p") && !name.equals("span") && !name.equals("br") && !name.equals("style") && !name.equals("styling") && !name.equals("layout") && !name.equals("region") && !name.equals("metadata") && !name.equals("image") && !name.equals("data") && !name.equals("information")) {
                                String name2 = xmlPullParserNewPullParser.getName();
                                StringBuilder sb = new StringBuilder(String.valueOf(name2).length() + 26);
                                sb.append(str12);
                                sb.append(name2);
                                s90.K("TtmlParser", sb.toString());
                                i14 = i22;
                                str3 = str12;
                                r111 = r112;
                                kd0Var2 = kd0Var3;
                                arrayDeque = arrayDeque;
                                map = map2;
                                r110 = r14;
                                i13 = 1;
                            }
                        }
                        boolean zEquals2 = "head".equals(name);
                        String str18 = "\\s+";
                        if (zEquals2) {
                            while (true) {
                                xmlPullParserNewPullParser.next();
                                if (ss0.N(xmlPullParserNewPullParser, "style")) {
                                    String strQ7 = ss0.Q(xmlPullParserNewPullParser, "style");
                                    str3 = str12;
                                    pj0 pj0VarB = b(xmlPullParserNewPullParser, new pj0());
                                    if (strQ7 != null) {
                                        String strTrim = strQ7.trim();
                                        if (strTrim.isEmpty()) {
                                            strArrSplit2 = new String[i15];
                                        } else {
                                            String str19 = qz1.a;
                                            strArrSplit2 = strTrim.split(str18, -1);
                                        }
                                        String[] strArr = strArrSplit2;
                                        int i23 = 0;
                                        for (int length = strArrSplit2.length; i23 < length; length = length) {
                                            pj0VarB.c((pj0) map4.get(strArr[i23]));
                                            i23++;
                                        }
                                    }
                                    String strD = pj0VarB.d();
                                    if (strD != null) {
                                        map4.put(strD, pj0VarB);
                                    }
                                    str7 = str17;
                                    i7 = i22;
                                    str6 = str14;
                                    str5 = str15;
                                    map = map2;
                                } else {
                                    String str20 = str17;
                                    str3 = str12;
                                    if (ss0.N(xmlPullParserNewPullParser, str16)) {
                                        String str21 = str14;
                                        String strQ8 = ss0.Q(xmlPullParserNewPullParser, "id");
                                        if (strQ8 == null) {
                                            i7 = i22;
                                            map3 = map5;
                                            str9 = str15;
                                            oj0Var = r47;
                                        } else {
                                            String strQ9 = ss0.Q(xmlPullParserNewPullParser, "origin");
                                            if (strQ9 == null) {
                                                str8 = strQ9;
                                                String strQ10 = ss0.Q(xmlPullParserNewPullParser, "style");
                                                if (strQ10 != null && (pj0Var2 = (pj0) map4.get(strQ10)) != null) {
                                                    strA = pj0Var2.a();
                                                }
                                                str9 = str15;
                                                pattern = k;
                                                if (strA != null) {
                                                    map3 = map5;
                                                    matcher3 = pattern.matcher(strA);
                                                    i7 = i22;
                                                    matcher4 = pattern2.matcher(strA);
                                                    if (matcher3.matches()) {
                                                        try {
                                                            strGroup7 = matcher3.group(1);
                                                            if (strGroup7 != null) {
                                                                throw r47;
                                                            }
                                                            f7 = Float.parseFloat(strGroup7) / 100.0f;
                                                            strGroup8 = matcher3.group(2);
                                                            if (strGroup8 != null) {
                                                                throw r47;
                                                            }
                                                            f = Float.parseFloat(strGroup8) / 100.0f;
                                                            f2 = f7;
                                                        } catch (NumberFormatException unused5) {
                                                            s90.Q("TtmlParser", "Ignoring region with malformed origin: ".concat(strA));
                                                        }
                                                    } else {
                                                        if (matcher4.matches()) {
                                                            s90.Q("TtmlParser", "Ignoring region with unsupported origin: ".concat(strA));
                                                        } else if (r14 == 0) {
                                                            s90.Q("TtmlParser", "Ignoring region with missing tts:extent: ".concat(strA));
                                                        } else {
                                                            try {
                                                                strGroup5 = matcher4.group(1);
                                                                if (strGroup5 != null) {
                                                                    throw r47;
                                                                }
                                                                i11 = Integer.parseInt(strGroup5);
                                                                strGroup6 = matcher4.group(2);
                                                                if (strGroup6 != null) {
                                                                    throw r47;
                                                                }
                                                                int i24 = Integer.parseInt(strGroup6);
                                                                float f10 = i11 / r14.a;
                                                                f = i24 / r14.b;
                                                                f2 = f10;
                                                            } catch (NumberFormatException unused6) {
                                                                s90.Q("TtmlParser", "Ignoring region with malformed origin: ".concat(strA));
                                                            }
                                                        }
                                                        oj0Var = r47;
                                                        i7 = i7;
                                                    }
                                                } else {
                                                    i7 = i22;
                                                    map3 = map5;
                                                    f = 0.0f;
                                                    f2 = 0.0f;
                                                }
                                                strQ2 = ss0.Q(xmlPullParserNewPullParser, "extent");
                                                if (strQ2 == null && (strQ5 = ss0.Q(xmlPullParserNewPullParser, "style")) != null && (pj0Var = (pj0) map4.get(strQ5)) != null) {
                                                    strQ2 = pj0Var.b();
                                                }
                                                if (strQ2 != null) {
                                                    matcher = pattern.matcher(strQ2);
                                                    matcher2 = pattern2.matcher(strQ2);
                                                    if (matcher.matches()) {
                                                        try {
                                                            strGroup3 = matcher.group(1);
                                                            if (strGroup3 != null) {
                                                                throw r47;
                                                            }
                                                            f6 = Float.parseFloat(strGroup3) / 100.0f;
                                                            strGroup4 = matcher.group(2);
                                                            if (strGroup4 != null) {
                                                                throw r47;
                                                            }
                                                            f3 = f6;
                                                            f4 = Float.parseFloat(strGroup4) / 100.0f;
                                                        } catch (NumberFormatException unused7) {
                                                            s90.Q("TtmlParser", "Ignoring region with malformed extent: ".concat(String.valueOf(strA)));
                                                            oj0Var = r47;
                                                            i7 = i7;
                                                        }
                                                    } else {
                                                        if (matcher2.matches()) {
                                                            s90.Q("TtmlParser", "Ignoring region with unsupported extent: ".concat(String.valueOf(strA)));
                                                        } else if (r14 == 0) {
                                                            s90.Q("TtmlParser", "Ignoring region with missing tts:extent: ".concat(String.valueOf(strA)));
                                                        } else {
                                                            try {
                                                                strGroup = matcher2.group(1);
                                                                if (strGroup != null) {
                                                                    throw r47;
                                                                }
                                                                i10 = Integer.parseInt(strGroup);
                                                                strGroup2 = matcher2.group(2);
                                                                if (strGroup2 != null) {
                                                                    throw r47;
                                                                }
                                                                int i25 = Integer.parseInt(strGroup2);
                                                                float f11 = i10 / r14.a;
                                                                f4 = i25 / r14.b;
                                                                f3 = f11;
                                                            } catch (NumberFormatException unused8) {
                                                                s90.Q("TtmlParser", "Ignoring region with malformed extent: ".concat(String.valueOf(strA)));
                                                                oj0Var = r47;
                                                                i7 = i7;
                                                            }
                                                        }
                                                        oj0Var = r47;
                                                        i7 = i7;
                                                    }
                                                } else {
                                                    f3 = 1.0f;
                                                    f4 = 1.0f;
                                                }
                                                strQ3 = ss0.Q(xmlPullParserNewPullParser, "displayAlign");
                                                if (strQ3 != null) {
                                                    strV2 = dq.v(strQ3);
                                                    iHashCode2 = strV2.hashCode();
                                                    if (iHashCode2 != -1364013995) {
                                                        if (iHashCode2 != 92734940 && strV2.equals("after")) {
                                                            f5 = f + f4;
                                                            i8 = 2;
                                                        } else {
                                                            f5 = f;
                                                            i8 = 0;
                                                        }
                                                    } else if (strV2.equals("center")) {
                                                        f5 = f + (f4 / 2.0f);
                                                        i8 = 1;
                                                    } else {
                                                        f5 = f;
                                                        i8 = 0;
                                                    }
                                                } else {
                                                    f5 = f;
                                                    i8 = 0;
                                                }
                                                float f12 = 1.0f / i7;
                                                strQ4 = ss0.Q(xmlPullParserNewPullParser, "writingMode");
                                                if (strQ4 != null) {
                                                    strV = dq.v(strQ4);
                                                    iHashCode = strV.hashCode();
                                                    if (iHashCode != 3694) {
                                                        if (iHashCode != 3553396) {
                                                            if (iHashCode == 3553576 && strV.equals("tbrl")) {
                                                                i9 = 1;
                                                            }
                                                        } else if (strV.equals("tblr")) {
                                                            i9 = 2;
                                                        }
                                                        i9 = Integer.MIN_VALUE;
                                                    } else if (strV.equals("tb")) {
                                                        i9 = 2;
                                                    } else {
                                                        i9 = Integer.MIN_VALUE;
                                                    }
                                                } else {
                                                    i9 = Integer.MIN_VALUE;
                                                }
                                                oj0Var = new oj0(strQ8, f2, f5, 0, i8, f3, f4, 1, f12, i9);
                                            } else {
                                                str8 = strQ9;
                                            }
                                            strA = str8;
                                            str9 = str15;
                                            pattern = k;
                                            if (strA != null) {
                                                map3 = map5;
                                                matcher3 = pattern.matcher(strA);
                                                i7 = i22;
                                                matcher4 = pattern2.matcher(strA);
                                                if (matcher3.matches()) {
                                                    strGroup7 = matcher3.group(1);
                                                    if (strGroup7 != null) {
                                                        throw r47;
                                                    }
                                                    f7 = Float.parseFloat(strGroup7) / 100.0f;
                                                    strGroup8 = matcher3.group(2);
                                                    if (strGroup8 != null) {
                                                        throw r47;
                                                    }
                                                    f = Float.parseFloat(strGroup8) / 100.0f;
                                                    f2 = f7;
                                                } else {
                                                    if (matcher4.matches()) {
                                                        s90.Q("TtmlParser", "Ignoring region with unsupported origin: ".concat(strA));
                                                    } else if (r14 == 0) {
                                                        s90.Q("TtmlParser", "Ignoring region with missing tts:extent: ".concat(strA));
                                                    } else {
                                                        strGroup5 = matcher4.group(1);
                                                        if (strGroup5 != null) {
                                                            throw r47;
                                                        }
                                                        i11 = Integer.parseInt(strGroup5);
                                                        strGroup6 = matcher4.group(2);
                                                        if (strGroup6 != null) {
                                                            throw r47;
                                                        }
                                                        int i26 = Integer.parseInt(strGroup6);
                                                        float f13 = i11 / r14.a;
                                                        f = i26 / r14.b;
                                                        f2 = f13;
                                                    }
                                                    oj0Var = r47;
                                                    i7 = i7;
                                                }
                                            } else {
                                                i7 = i22;
                                                map3 = map5;
                                                f = 0.0f;
                                                f2 = 0.0f;
                                            }
                                            strQ2 = ss0.Q(xmlPullParserNewPullParser, "extent");
                                            if (strQ2 == null) {
                                                strQ2 = pj0Var.b();
                                            }
                                            if (strQ2 != null) {
                                                matcher = pattern.matcher(strQ2);
                                                matcher2 = pattern2.matcher(strQ2);
                                                if (matcher.matches()) {
                                                    strGroup3 = matcher.group(1);
                                                    if (strGroup3 != null) {
                                                        throw r47;
                                                    }
                                                    f6 = Float.parseFloat(strGroup3) / 100.0f;
                                                    strGroup4 = matcher.group(2);
                                                    if (strGroup4 != null) {
                                                        throw r47;
                                                    }
                                                    f3 = f6;
                                                    f4 = Float.parseFloat(strGroup4) / 100.0f;
                                                } else {
                                                    if (matcher2.matches()) {
                                                        s90.Q("TtmlParser", "Ignoring region with unsupported extent: ".concat(String.valueOf(strA)));
                                                    } else if (r14 == 0) {
                                                        s90.Q("TtmlParser", "Ignoring region with missing tts:extent: ".concat(String.valueOf(strA)));
                                                    } else {
                                                        strGroup = matcher2.group(1);
                                                        if (strGroup != null) {
                                                            throw r47;
                                                        }
                                                        i10 = Integer.parseInt(strGroup);
                                                        strGroup2 = matcher2.group(2);
                                                        if (strGroup2 != null) {
                                                            throw r47;
                                                        }
                                                        int i27 = Integer.parseInt(strGroup2);
                                                        float f14 = i10 / r14.a;
                                                        f4 = i27 / r14.b;
                                                        f3 = f14;
                                                    }
                                                    oj0Var = r47;
                                                    i7 = i7;
                                                }
                                            } else {
                                                f3 = 1.0f;
                                                f4 = 1.0f;
                                            }
                                            strQ3 = ss0.Q(xmlPullParserNewPullParser, "displayAlign");
                                            if (strQ3 != null) {
                                                strV2 = dq.v(strQ3);
                                                iHashCode2 = strV2.hashCode();
                                                if (iHashCode2 != -1364013995) {
                                                    if (iHashCode2 != 92734940) {
                                                        f5 = f;
                                                        i8 = 0;
                                                    } else {
                                                        f5 = f + f4;
                                                        i8 = 2;
                                                    }
                                                } else if (strV2.equals("center")) {
                                                    f5 = f + (f4 / 2.0f);
                                                    i8 = 1;
                                                } else {
                                                    f5 = f;
                                                    i8 = 0;
                                                }
                                            } else {
                                                f5 = f;
                                                i8 = 0;
                                            }
                                            float f15 = 1.0f / i7;
                                            strQ4 = ss0.Q(xmlPullParserNewPullParser, "writingMode");
                                            if (strQ4 != null) {
                                                strV = dq.v(strQ4);
                                                iHashCode = strV.hashCode();
                                                if (iHashCode != 3694) {
                                                    if (iHashCode != 3553396) {
                                                        if (iHashCode == 3553576) {
                                                            i9 = 1;
                                                        }
                                                    } else if (strV.equals("tblr")) {
                                                        i9 = 2;
                                                    }
                                                    i9 = Integer.MIN_VALUE;
                                                } else if (strV.equals("tb")) {
                                                    i9 = 2;
                                                } else {
                                                    i9 = Integer.MIN_VALUE;
                                                }
                                            } else {
                                                i9 = Integer.MIN_VALUE;
                                            }
                                            oj0Var = new oj0(strQ8, f2, f5, 0, i8, f3, f4, 1, f15, i9);
                                        }
                                        if (oj0Var != 0) {
                                            map5 = map3;
                                            map5.put(oj0Var.a, oj0Var);
                                        } else {
                                            map5 = map3;
                                        }
                                        str7 = str20;
                                        map = map2;
                                        str6 = str21;
                                        str5 = str9;
                                    } else {
                                        i7 = i22;
                                        String str22 = str14;
                                        str5 = str15;
                                        if (ss0.N(xmlPullParserNewPullParser, str5)) {
                                            while (true) {
                                                xmlPullParserNewPullParser.next();
                                                str6 = str22;
                                                if (!ss0.N(xmlPullParserNewPullParser, str6) || (strQ = ss0.Q(xmlPullParserNewPullParser, "id")) == null) {
                                                    map = map2;
                                                } else {
                                                    map = map2;
                                                    map.put(strQ, xmlPullParserNewPullParser.nextText());
                                                }
                                                if (!ss0.E(xmlPullParserNewPullParser, str5)) {
                                                    str22 = str6;
                                                    map2 = map;
                                                }
                                            }
                                        } else {
                                            map = map2;
                                            str6 = str22;
                                        }
                                        str7 = str20;
                                    }
                                }
                                if (ss0.E(xmlPullParserNewPullParser, str7)) {
                                    i4 = i7;
                                    arrayDeque = arrayDeque;
                                    r17 = r112;
                                } else {
                                    str15 = str5;
                                    str14 = str6;
                                    map2 = map;
                                    str16 = str16;
                                    str18 = str18;
                                    i15 = 0;
                                    i22 = i7;
                                    str17 = str7;
                                    str12 = str3;
                                }
                            }
                        } else {
                            i4 = i22;
                            str3 = str12;
                            Object obj2 = "region";
                            String str23 = "\\s+";
                            map = map2;
                            try {
                                int attributeCount = xmlPullParserNewPullParser.getAttributeCount();
                                pj0 pj0VarB2 = b(xmlPullParserNewPullParser, r47);
                                String str24 = str;
                                int i28 = 0;
                                long jE = -9223372036854775807L;
                                long jE2 = -9223372036854775807L;
                                long jE3 = -9223372036854775807L;
                                String[] strArr2 = null;
                                String strSubstring = null;
                                ?? r113 = r112;
                                while (i28 < attributeCount) {
                                    try {
                                        String attributeName = xmlPullParserNewPullParser.getAttributeName(i28);
                                        String attributeValue6 = xmlPullParserNewPullParser.getAttributeValue(i28);
                                        int i29 = attributeCount;
                                        switch (attributeName.hashCode()) {
                                            case -934795532:
                                                i4 = i4;
                                                r113 = r113;
                                                obj2 = obj2;
                                                if (attributeName.equals(obj2) && map5.containsKey(attributeValue6)) {
                                                    str24 = attributeValue6;
                                                }
                                                i28++;
                                                obj2 = obj2;
                                                r113 = r113;
                                                i4 = i4;
                                                attributeCount = i29;
                                                break;
                                            case 99841:
                                                i4 = i4;
                                                ?? r1 = r113;
                                                r113 = r1;
                                                if (attributeName.equals("dur")) {
                                                    jE3 = e(attributeValue6, r1);
                                                    r113 = r1;
                                                }
                                                obj2 = obj2;
                                                i28++;
                                                obj2 = obj2;
                                                r113 = r113;
                                                i4 = i4;
                                                attributeCount = i29;
                                                break;
                                            case 100571:
                                                i4 = i4;
                                                ?? r2 = r113;
                                                r113 = r2;
                                                if (attributeName.equals("end")) {
                                                    jE = e(attributeValue6, r2);
                                                    r113 = r2;
                                                }
                                                obj2 = obj2;
                                                i28++;
                                                obj2 = obj2;
                                                r113 = r113;
                                                i4 = i4;
                                                attributeCount = i29;
                                                break;
                                            case 93616297:
                                                i4 = i4;
                                                i5 = 1;
                                                if (attributeName.equals("begin")) {
                                                    ?? r3 = r113;
                                                    try {
                                                        jE2 = e(attributeValue6, r3);
                                                        r113 = r3;
                                                    } catch (oi0 e) {
                                                        e = e;
                                                        r16 = r3;
                                                        arrayDeque = arrayDeque;
                                                        s90.T("TtmlParser", "Suppressing parser error", e);
                                                        r111 = r16;
                                                        kd0Var2 = kd0Var3;
                                                        i14 = i4;
                                                        r110 = r14;
                                                        i13 = i5;
                                                        xmlPullParserNewPullParser.next();
                                                        eventType = xmlPullParserNewPullParser.getEventType();
                                                        arrayDeque = arrayDeque;
                                                        map6 = map;
                                                        str10 = str;
                                                        str11 = str2;
                                                        mj0Var2 = mj0Var;
                                                        str12 = str3;
                                                        obj = null;
                                                        r111 = r111;
                                                        r110 = r110;
                                                    }
                                                } else {
                                                    r113 = r113;
                                                }
                                                obj2 = obj2;
                                                i28++;
                                                obj2 = obj2;
                                                r113 = r113;
                                                i4 = i4;
                                                attributeCount = i29;
                                                break;
                                            case 109780401:
                                                i5 = 1;
                                                if (!attributeName.equals("style")) {
                                                    i28++;
                                                    obj2 = obj2;
                                                    r113 = r113;
                                                    i4 = i4;
                                                    attributeCount = i29;
                                                } else {
                                                    try {
                                                        String strTrim2 = attributeValue6.trim();
                                                        if (strTrim2.isEmpty()) {
                                                            z = false;
                                                            try {
                                                                strArrSplit = new String[0];
                                                                str4 = str23;
                                                            } catch (oi0 e2) {
                                                                e = e2;
                                                                i4 = i4;
                                                                r16 = r113;
                                                                arrayDeque = arrayDeque;
                                                                s90.T("TtmlParser", "Suppressing parser error", e);
                                                                r111 = r16;
                                                                kd0Var2 = kd0Var3;
                                                                i14 = i4;
                                                                r110 = r14;
                                                                i13 = i5;
                                                                xmlPullParserNewPullParser.next();
                                                                eventType = xmlPullParserNewPullParser.getEventType();
                                                                arrayDeque = arrayDeque;
                                                                map6 = map;
                                                                str10 = str;
                                                                str11 = str2;
                                                                mj0Var2 = mj0Var;
                                                                str12 = str3;
                                                                obj = null;
                                                                r111 = r111;
                                                                r110 = r110;
                                                            }
                                                        } else {
                                                            z = false;
                                                            String str25 = qz1.a;
                                                            str4 = str23;
                                                            strArrSplit = strTrim2.split(str4, -1);
                                                        }
                                                        try {
                                                            if (strArrSplit.length > 0) {
                                                                strArr2 = strArrSplit;
                                                            }
                                                            str23 = str4;
                                                            r113 = r113;
                                                            obj2 = obj2;
                                                            i28++;
                                                            obj2 = obj2;
                                                            r113 = r113;
                                                            i4 = i4;
                                                            attributeCount = i29;
                                                        } catch (oi0 e3) {
                                                            e = e3;
                                                            r16 = r113;
                                                            arrayDeque = arrayDeque;
                                                            s90.T("TtmlParser", "Suppressing parser error", e);
                                                            r111 = r16;
                                                            kd0Var2 = kd0Var3;
                                                            i14 = i4;
                                                            r110 = r14;
                                                            i13 = i5;
                                                            xmlPullParserNewPullParser.next();
                                                            eventType = xmlPullParserNewPullParser.getEventType();
                                                            arrayDeque = arrayDeque;
                                                            map6 = map;
                                                            str10 = str;
                                                            str11 = str2;
                                                            mj0Var2 = mj0Var;
                                                            str12 = str3;
                                                            obj = null;
                                                            r111 = r111;
                                                            r110 = r110;
                                                        }
                                                    } catch (oi0 e4) {
                                                        e = e4;
                                                        i4 = i4;
                                                        z = false;
                                                    }
                                                }
                                                break;
                                            case 1292595405:
                                                if (attributeName.equals("backgroundImage")) {
                                                    try {
                                                        if (attributeValue6.startsWith("#")) {
                                                            i6 = 1;
                                                            try {
                                                                strSubstring = attributeValue6.substring(1);
                                                            } catch (oi0 e5) {
                                                                e = e5;
                                                                i4 = i4;
                                                                i5 = i6;
                                                                r16 = r113;
                                                                s90.T("TtmlParser", "Suppressing parser error", e);
                                                                r111 = r16;
                                                                kd0Var2 = kd0Var3;
                                                                i14 = i4;
                                                                r110 = r14;
                                                                i13 = i5;
                                                                xmlPullParserNewPullParser.next();
                                                                eventType = xmlPullParserNewPullParser.getEventType();
                                                                arrayDeque = arrayDeque;
                                                                map6 = map;
                                                                str10 = str;
                                                                str11 = str2;
                                                                mj0Var2 = mj0Var;
                                                                str12 = str3;
                                                                obj = null;
                                                                r111 = r111;
                                                                r110 = r110;
                                                            }
                                                        }
                                                        i28++;
                                                        obj2 = obj2;
                                                        r113 = r113;
                                                        i4 = i4;
                                                        attributeCount = i29;
                                                    } catch (oi0 e6) {
                                                        e = e6;
                                                        i6 = 1;
                                                    }
                                                    break;
                                                }
                                            default:
                                                i4 = i4;
                                                i28++;
                                                obj2 = obj2;
                                                r113 = r113;
                                                i4 = i4;
                                                attributeCount = i29;
                                                break;
                                        }
                                    } catch (oi0 e7) {
                                        e = e7;
                                        i4 = i4;
                                        i5 = 1;
                                        r16 = r113;
                                    }
                                }
                                i4 = i4;
                                ?? r4 = r113;
                                i5 = 1;
                                if (lj0Var3 != null) {
                                    ?? r114 = r4;
                                    lj0Var = lj0Var3;
                                    try {
                                        long j4 = lj0Var.d;
                                        if (j4 == -9223372036854775807L) {
                                            lj0Var2 = lj0Var;
                                            r16 = r114;
                                        } else {
                                            jE2 = jE2 != -9223372036854775807L ? jE2 + j4 : -9223372036854775807L;
                                            if (jE != -9223372036854775807L) {
                                                jE += j4;
                                                lj0Var2 = lj0Var;
                                                r16 = r114;
                                            } else {
                                                lj0Var2 = lj0Var;
                                                jE = -9223372036854775807L;
                                                r16 = r114;
                                            }
                                        }
                                    } catch (oi0 e8) {
                                        e = e8;
                                        r16 = r114;
                                        arrayDeque = arrayDeque;
                                        s90.T("TtmlParser", "Suppressing parser error", e);
                                        r111 = r16;
                                        kd0Var2 = kd0Var3;
                                        i14 = i4;
                                        r110 = r14;
                                        i13 = i5;
                                        xmlPullParserNewPullParser.next();
                                        eventType = xmlPullParserNewPullParser.getEventType();
                                        arrayDeque = arrayDeque;
                                        map6 = map;
                                        str10 = str;
                                        str11 = str2;
                                        mj0Var2 = mj0Var;
                                        str12 = str3;
                                        obj = null;
                                        r111 = r111;
                                        r110 = r110;
                                    }
                                } else {
                                    r16 = r4;
                                    lj0Var = lj0Var3;
                                    lj0Var2 = null;
                                }
                                if (jE == -9223372036854775807L) {
                                    if (jE3 != -9223372036854775807L) {
                                        j3 = jE2 + jE3;
                                    } else {
                                        if (lj0Var2 != null) {
                                            j3 = lj0Var2.e;
                                            if (j3 != -9223372036854775807L) {
                                            }
                                        }
                                        j2 = -9223372036854775807L;
                                    }
                                    j2 = j3;
                                } else {
                                    j2 = jE;
                                }
                                lj0 lj0VarB = lj0.b(xmlPullParserNewPullParser.getName(), jE2, j2, pj0VarB2, strArr2, str24, strSubstring, lj0Var2);
                                arrayDeque = arrayDeque;
                                try {
                                    arrayDeque.push(lj0VarB);
                                    r17 = r16;
                                    if (lj0Var != null) {
                                        if (lj0Var.m == null) {
                                            lj0Var.m = new ArrayList();
                                        }
                                        lj0Var.m.add(lj0VarB);
                                        r17 = r16;
                                    }
                                } catch (oi0 e9) {
                                    e = e9;
                                    s90.T("TtmlParser", "Suppressing parser error", e);
                                    r111 = r16;
                                    kd0Var2 = kd0Var3;
                                    i14 = i4;
                                    r110 = r14;
                                    i13 = i5;
                                }
                            } catch (oi0 e10) {
                                e = e10;
                                i4 = i4;
                                i5 = 1;
                                r16 = r112;
                            }
                        }
                        r111 = r17;
                        kd0Var2 = kd0Var3;
                        i14 = i4;
                        r110 = r14;
                    } else {
                        str2 = str11;
                        str3 = str12;
                        arrayDeque = arrayDeque;
                        mj0Var = mj0Var2;
                        kd0Var = kd0Var2;
                        i13 = i13;
                        map = map6;
                        if (eventType == 4) {
                            if (lj0Var3 == null) {
                                throw null;
                            }
                            lj0 lj0VarA = lj0.a(xmlPullParserNewPullParser.getText());
                            if (lj0Var3.m == null) {
                                lj0Var3.m = new ArrayList();
                            }
                            lj0Var3.m.add(lj0VarA);
                        } else if (eventType == 3) {
                            if (xmlPullParserNewPullParser.getName().equals("tt")) {
                                lj0 lj0Var4 = (lj0) arrayDeque.peek();
                                if (lj0Var4 == null) {
                                    throw null;
                                }
                                kd0Var2 = new kd0(lj0Var4, map4, map5, map);
                            } else {
                                kd0Var2 = kd0Var;
                            }
                            arrayDeque.pop();
                            r111 = r111;
                            r110 = r110;
                        }
                        kd0Var2 = kd0Var;
                        r111 = r111;
                        r110 = r110;
                    }
                    i13 = i13;
                } else {
                    str = str10;
                    str2 = str11;
                    str3 = str12;
                    arrayDeque = arrayDeque;
                    mj0Var = mj0Var2;
                    kd0Var = kd0Var2;
                    i13 = i13;
                    map = map6;
                    if (eventType == 2) {
                        i13++;
                    } else {
                        if (eventType == 3) {
                            i13--;
                        }
                        kd0Var2 = kd0Var;
                        r111 = r111;
                        r110 = r110;
                        i13 = i13;
                    }
                    kd0Var2 = kd0Var;
                }
                xmlPullParserNewPullParser.next();
                eventType = xmlPullParserNewPullParser.getEventType();
                arrayDeque = arrayDeque;
                map6 = map;
                str10 = str;
                str11 = str2;
                mj0Var2 = mj0Var;
                str12 = str3;
                obj = null;
                r111 = r111;
                r110 = r110;
            }
            kd0 kd0Var4 = kd0Var2;
            if (kd0Var4 != null) {
                return kd0Var4;
            }
            throw null;
        } catch (IOException e11) {
            throw new IllegalStateException("Unexpected error when reading input.", e11);
        } catch (XmlPullParserException e12) {
            throw new IllegalStateException("Unable to decode source", e12);
        }
    }

    @Override // defpackage.qi0
    public final void s(byte[] bArr, int i2, int i3, ri0 ri0Var) {
        s90.D(a(bArr, i2, i3), ri0Var);
    }
}
