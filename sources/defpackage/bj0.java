package defpackage;

import android.graphics.PointF;
import android.text.Layout;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class bj0 implements qi0 {
    public static final Pattern l = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");
    public final boolean f;
    public final ui0 g;
    public LinkedHashMap i;
    public float j = -3.4028235E38f;
    public float k = -3.4028235E38f;
    public final cw1 h = new cw1();

    public bj0(List list) {
        if (list == null || list.isEmpty()) {
            this.f = false;
            this.g = null;
            return;
        }
        this.f = true;
        byte[] bArr = (byte[]) list.get(0);
        Charset charset = StandardCharsets.UTF_8;
        String str = new String(bArr, charset);
        hn.v(str.startsWith("Format:"));
        ui0 ui0VarA = ui0.a(str);
        ui0VarA.getClass();
        this.g = ui0VarA;
        a(new cw1((byte[]) list.get(1)), charset);
    }

    public static long b(String str) {
        Matcher matcher = l.matcher(str.trim());
        if (!matcher.matches()) {
            return -9223372036854775807L;
        }
        String strGroup = matcher.group(1);
        String str2 = qz1.a;
        long j = Long.parseLong(strGroup) * 3600000000L;
        long j2 = Long.parseLong(matcher.group(2)) * 60000000;
        return j + j2 + (Long.parseLong(matcher.group(3)) * 1000000) + (Long.parseLong(matcher.group(4)) * 10000);
    }

    public static int c(long j, ArrayList arrayList, ArrayList arrayList2) {
        int i;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                i = 0;
                break;
            }
            if (((Long) arrayList.get(size)).longValue() == j) {
                return size;
            }
            if (((Long) arrayList.get(size)).longValue() < j) {
                i = size + 1;
                break;
            }
        }
        arrayList.add(i, Long.valueOf(j));
        arrayList2.add(i, i == 0 ? new ArrayList() : new ArrayList((Collection) arrayList2.get(i - 1)));
        return i;
    }

    /* JADX WARN: Code duplicated, block: B:155:0x02e4  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void a(cw1 cw1Var, Charset charset) {
        int i;
        int i2;
        hj0 hj0Var;
        int i3;
        while (true) {
            String strN = cw1Var.n(charset);
            if (strN == null) {
                return;
            }
            int i4 = 91;
            int i5 = 0;
            if ("[Script Info]".equalsIgnoreCase(strN)) {
                while (true) {
                    String strN2 = cw1Var.n(charset);
                    if (strN2 == null) {
                        break;
                    }
                    if (cw1Var.B() != 0) {
                        int iT = cw1Var.t(charset);
                        if ((iT != 0 ? w40.V(iT >>> 8) : 1114112) == 91) {
                            break;
                        }
                    }
                    String[] strArrSplit = strN2.split(":");
                    if (strArrSplit.length == 2) {
                        String strV = dq.v(strArrSplit[0].trim());
                        switch (strV.hashCode()) {
                            case 1879649548:
                                if (strV.equals("playresx")) {
                                    this.j = Float.parseFloat(strArrSplit[1].trim());
                                }
                                break;
                            case 1879649549:
                                if (strV.equals("playresy")) {
                                    try {
                                        this.k = Float.parseFloat(strArrSplit[1].trim());
                                    } catch (NumberFormatException unused) {
                                    }
                                }
                                break;
                        }
                    }
                }
            } else if ("[V4+ Styles]".equalsIgnoreCase(strN)) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                while (true) {
                    cj0 cj0Var = null;
                    while (true) {
                        String strN3 = cw1Var.n(charset);
                        if (strN3 != null) {
                            if (cw1Var.B() != 0) {
                                int iT2 = cw1Var.t(charset);
                                if ((iT2 != 0 ? w40.V(iT2 >>> 8) : 1114112) == i4) {
                                }
                            }
                            if (strN3.startsWith("Format:")) {
                                String[] strArrSplit2 = TextUtils.split(strN3.substring(7), ",");
                                int i6 = i5;
                                int i7 = -1;
                                int i8 = -1;
                                int i9 = -1;
                                int i10 = -1;
                                int i11 = -1;
                                int i12 = -1;
                                int i13 = -1;
                                int i14 = -1;
                                int i15 = -1;
                                int i16 = -1;
                                while (true) {
                                    int length = strArrSplit2.length;
                                    if (i6 < length) {
                                        String strV2 = dq.v(strArrSplit2[i6].trim());
                                        switch (strV2.hashCode()) {
                                            case -1178781136:
                                                if (strV2.equals("italic")) {
                                                    i13 = i6;
                                                }
                                                break;
                                            case -1026963764:
                                                if (strV2.equals("underline")) {
                                                    i14 = i6;
                                                }
                                                break;
                                            case -192095652:
                                                if (strV2.equals("strikeout")) {
                                                    i15 = i6;
                                                }
                                                break;
                                            case -70925746:
                                                if (strV2.equals("primarycolour")) {
                                                    i9 = i6;
                                                }
                                                break;
                                            case 3029637:
                                                if (strV2.equals("bold")) {
                                                    i12 = i6;
                                                }
                                                break;
                                            case 3373707:
                                                if (strV2.equals("name")) {
                                                    i7 = i6;
                                                }
                                                break;
                                            case 366554320:
                                                if (strV2.equals("fontsize")) {
                                                    i11 = i6;
                                                }
                                                break;
                                            case 767321349:
                                                if (strV2.equals("borderstyle")) {
                                                    i16 = i6;
                                                }
                                                break;
                                            case 1767875043:
                                                if (strV2.equals("alignment")) {
                                                    i8 = i6;
                                                }
                                                break;
                                            case 1988365454:
                                                if (strV2.equals("outlinecolour")) {
                                                    i10 = i6;
                                                }
                                                break;
                                        }
                                        i6++;
                                    } else if (i7 != -1) {
                                        cj0Var = new cj0(i7, i8, i9, i10, i11, i12, i13, i14, i15, i16, length);
                                    }
                                }
                            } else {
                                if (strN3.startsWith("Style:")) {
                                    if (cj0Var == null) {
                                        s90.Q("SsaParser", "Skipping 'Style:' line before 'Format:' line: ".concat(strN3));
                                    } else {
                                        hn.v(strN3.startsWith("Style:"));
                                        String[] strArrSplit3 = TextUtils.split(strN3.substring(6), ",");
                                        int length2 = strArrSplit3.length;
                                        int i17 = cj0Var.k;
                                        if (length2 != i17) {
                                            String str = qz1.a;
                                            Locale locale = Locale.US;
                                            s90.Q("SsaStyle", "Skipping malformed 'Style:' line (expected " + i17 + " values, found " + length2 + "): '" + strN3 + "'");
                                        } else {
                                            try {
                                                String strTrim = strArrSplit3[cj0Var.a].trim();
                                                int i18 = cj0Var.b;
                                                if (i18 != -1) {
                                                    String strTrim2 = strArrSplit3[i18].trim();
                                                    try {
                                                        i3 = Integer.parseInt(strTrim2.trim());
                                                        switch (i3) {
                                                            case 1:
                                                            case 2:
                                                            case 3:
                                                            case 4:
                                                            case 5:
                                                            case 6:
                                                            case 7:
                                                            case 8:
                                                            case 9:
                                                                break;
                                                            default:
                                                                s90.Q("SsaStyle", "Ignoring unknown alignment: ".concat(String.valueOf(strTrim2)));
                                                                i3 = -1;
                                                                break;
                                                        }
                                                    } catch (NumberFormatException unused2) {
                                                    }
                                                    i = i3;
                                                } else {
                                                    i = -1;
                                                }
                                                int i19 = cj0Var.c;
                                                Integer numA = i19 != -1 ? hj0.a(strArrSplit3[i19].trim()) : null;
                                                int i20 = cj0Var.d;
                                                Integer numA2 = i20 != -1 ? hj0.a(strArrSplit3[i20].trim()) : null;
                                                int i21 = cj0Var.e;
                                                float f = -3.4028235E38f;
                                                if (i21 != -1) {
                                                    String strTrim3 = strArrSplit3[i21].trim();
                                                    try {
                                                        f = Float.parseFloat(strTrim3);
                                                    } catch (NumberFormatException e) {
                                                        StringBuilder sb = new StringBuilder(String.valueOf(strTrim3).length() + 29);
                                                        sb.append("Failed to parse font size: '");
                                                        sb.append(strTrim3);
                                                        sb.append("'");
                                                        s90.T("SsaStyle", sb.toString(), e);
                                                    }
                                                }
                                                float f2 = f;
                                                int i22 = cj0Var.f;
                                                boolean z = i22 != -1 && hj0.b(strArrSplit3[i22].trim());
                                                int i23 = cj0Var.g;
                                                boolean z2 = i23 != -1 && hj0.b(strArrSplit3[i23].trim());
                                                int i24 = cj0Var.h;
                                                boolean z3 = i24 != -1 && hj0.b(strArrSplit3[i24].trim());
                                                int i25 = cj0Var.i;
                                                boolean z4 = i25 != -1 && hj0.b(strArrSplit3[i25].trim());
                                                int i26 = cj0Var.j;
                                                if (i26 != -1) {
                                                    String strTrim4 = strArrSplit3[i26].trim();
                                                    try {
                                                        int i27 = Integer.parseInt(strTrim4.trim());
                                                        if (i27 == 1 || i27 == 3) {
                                                            i2 = i27;
                                                        } else {
                                                            s90.Q("SsaStyle", "Ignoring unknown BorderStyle: ".concat(String.valueOf(strTrim4)));
                                                            i2 = -1;
                                                        }
                                                    } catch (NumberFormatException unused3) {
                                                    }
                                                } else {
                                                    i2 = -1;
                                                }
                                                hj0Var = new hj0(strTrim, i, numA, numA2, f2, z, z2, z3, z4, i2);
                                            } catch (RuntimeException e2) {
                                                s90.T("SsaStyle", ec.n(new StringBuilder(strN3.length() + 36), "Skipping malformed 'Style:' line: '", strN3, "'"), e2);
                                                hj0Var = null;
                                            }
                                            if (hj0Var != null) {
                                                linkedHashMap.put(hj0Var.a, hj0Var);
                                            }
                                        }
                                        hj0Var = null;
                                        if (hj0Var != null) {
                                            linkedHashMap.put(hj0Var.a, hj0Var);
                                        }
                                    }
                                }
                                i4 = 91;
                                i5 = 0;
                            }
                        }
                    }
                }
                this.i = linkedHashMap;
            } else if ("[V4 Styles]".equalsIgnoreCase(strN)) {
                s90.K("SsaParser", "[V4 Styles] are not supported");
            } else if ("[Events]".equalsIgnoreCase(strN)) {
                return;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:185:0x03f4  */
    /* JADX WARN: Code duplicated, block: B:194:0x01b6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:220:0x0419 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:72:0x019a  */
    /* JADX WARN: Code duplicated, block: B:77:0x01af A[Catch: RuntimeException -> 0x01e1, TRY_LEAVE, TryCatch #1 {RuntimeException -> 0x01e1, blocks: (B:75:0x01a3, B:77:0x01af, B:79:0x01b6, B:83:0x01cf, B:81:0x01c1), top: B:196:0x01a3 }] */
    /* JADX WARN: Code duplicated, block: B:81:0x01c1 A[Catch: RuntimeException -> 0x01e1, TRY_ENTER, TryCatch #1 {RuntimeException -> 0x01e1, blocks: (B:75:0x01a3, B:77:0x01af, B:79:0x01b6, B:83:0x01cf, B:81:0x01c1), top: B:196:0x01a3 }] */
    /* JADX WARN: Code duplicated, block: B:83:0x01cf A[Catch: RuntimeException -> 0x01e1, TRY_LEAVE, TryCatch #1 {RuntimeException -> 0x01e1, blocks: (B:75:0x01a3, B:77:0x01af, B:79:0x01b6, B:83:0x01cf, B:81:0x01c1), top: B:196:0x01a3 }] */
    /* JADX WARN: Code duplicated, block: B:84:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:86:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:88:0x01e1  */
    /* JADX WARN: Failed to find 'out' block for switch in B:80:0x01be. Please report as an issue. */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // defpackage.qi0
    public final void s(byte[] bArr, int i, int i2, ri0 ri0Var) {
        ui0 ui0VarA;
        Charset charset;
        ui0 ui0Var;
        cw1 cw1Var;
        int i3;
        int i4;
        float f;
        float f2;
        int i5;
        Layout.Alignment alignment;
        int i6;
        int i7;
        float f3;
        float f4;
        float f5;
        float f6;
        int i8;
        Integer num;
        Matcher matcher;
        int i9;
        String strGroup;
        PointF pointF;
        String strGroup2;
        String strGroup3;
        int i10;
        bj0 bj0Var = this;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        cw1 cw1Var2 = bj0Var.h;
        cw1Var2.z(i + i2, bArr);
        cw1Var2.E(i);
        Charset charsetQ = cw1Var2.q();
        if (charsetQ == null) {
            charsetQ = StandardCharsets.UTF_8;
        }
        if (bj0Var.f) {
            ui0VarA = bj0Var.g;
        } else {
            bj0Var.a(cw1Var2, charsetQ);
            ui0VarA = null;
        }
        while (true) {
            String strN = cw1Var2.n(charsetQ);
            int i11 = 1;
            if (strN == null) {
                int i12 = 0;
                while (i12 < arrayList.size()) {
                    List list = (List) arrayList.get(i12);
                    if (list.isEmpty()) {
                        if (i12 == 0) {
                            i12 = 0;
                            if (i12 != arrayList.size() - 1) {
                                j7.a();
                                return;
                            } else {
                                long jLongValue = ((Long) arrayList2.get(i12)).longValue();
                                ri0Var.mo0b(new mi0(list, jLongValue, ((Long) arrayList2.get(i12 + 1)).longValue() - jLongValue));
                            }
                        }
                    } else if (i12 != arrayList.size() - 1) {
                        j7.a();
                        return;
                    } else {
                        long jLongValue2 = ((Long) arrayList2.get(i12)).longValue();
                        ri0Var.mo0b(new mi0(list, jLongValue2, ((Long) arrayList2.get(i12 + 1)).longValue() - jLongValue2));
                    }
                    i12++;
                }
                return;
            }
            if (strN.startsWith("Format:")) {
                ui0VarA = ui0.a(strN);
            } else {
                if (strN.startsWith("Dialogue:")) {
                    if (ui0VarA == null) {
                        s90.Q("SsaParser", "Skipping dialogue line before complete format: ".concat(strN));
                    } else {
                        int i13 = ui0VarA.a;
                        hn.v(strN.startsWith("Dialogue:"));
                        String strSubstring = strN.substring(9);
                        int i14 = ui0VarA.f;
                        String[] strArrSplit = strSubstring.split(",", i14);
                        if (strArrSplit.length != i14) {
                            s90.Q("SsaParser", "Skipping dialogue line with fewer columns than format: ".concat(strN));
                        } else {
                            if (i13 != -1) {
                                try {
                                    i3 = Integer.parseInt(strArrSplit[i13].trim());
                                } catch (RuntimeException unused) {
                                    ec.t(strArrSplit[i13], "Fail to parse layer: ", "SsaParser");
                                    i3 = 0;
                                }
                            } else {
                                i3 = 0;
                            }
                            long jB = b(strArrSplit[ui0VarA.b]);
                            if (jB == -9223372036854775807L) {
                                s90.Q("SsaParser", "Skipping invalid timing: ".concat(strN));
                                charset = charsetQ;
                                ui0Var = ui0VarA;
                                cw1Var = cw1Var2;
                            } else {
                                long jB2 = b(strArrSplit[ui0VarA.c]);
                                if (jB2 == -9223372036854775807L || jB2 <= jB) {
                                    charset = charsetQ;
                                    ui0Var = ui0VarA;
                                    cw1Var = cw1Var2;
                                    s90.Q("SsaParser", "Skipping invalid timing: ".concat(strN));
                                } else {
                                    LinkedHashMap linkedHashMap = bj0Var.i;
                                    hj0 hj0Var = (linkedHashMap == null || (i10 = ui0VarA.d) == -1) ? null : (hj0) linkedHashMap.get(strArrSplit[i10].trim());
                                    String str = strArrSplit[ui0VarA.e];
                                    Matcher matcher2 = gj0.a.matcher(str);
                                    PointF pointF2 = null;
                                    int i15 = -1;
                                    while (matcher2.find()) {
                                        String strGroup4 = matcher2.group(i11);
                                        strGroup4.getClass();
                                        charsetQ = charsetQ;
                                        try {
                                            Matcher matcher3 = gj0.b.matcher(strGroup4);
                                            ui0VarA = ui0VarA;
                                            try {
                                                Matcher matcher4 = gj0.c.matcher(strGroup4);
                                                boolean zFind = matcher3.find();
                                                boolean zFind2 = matcher4.find();
                                                if (zFind) {
                                                    if (zFind2) {
                                                        cw1Var2 = cw1Var2;
                                                        matcher2 = matcher2;
                                                        try {
                                                            StringBuilder sb = new StringBuilder(strGroup4.length() + 82);
                                                            sb.append("Override has both \\pos(x,y) and \\move(x1,y1,x2,y2); using \\pos values. override='");
                                                            sb.append(strGroup4);
                                                            sb.append("'");
                                                            s90.K("SsaStyle.Overrides", sb.toString());
                                                        } catch (RuntimeException unused2) {
                                                        }
                                                    } else {
                                                        cw1Var2 = cw1Var2;
                                                        matcher2 = matcher2;
                                                    }
                                                    strGroup2 = matcher3.group(1);
                                                    strGroup3 = matcher3.group(2);
                                                } else {
                                                    cw1Var2 = cw1Var2;
                                                    matcher2 = matcher2;
                                                    if (zFind2) {
                                                        String strGroup5 = matcher4.group(1);
                                                        String strGroup6 = matcher4.group(2);
                                                        strGroup2 = strGroup5;
                                                        strGroup3 = strGroup6;
                                                    } else {
                                                        pointF = null;
                                                    }
                                                    if (pointF != null) {
                                                        pointF2 = pointF;
                                                    }
                                                    try {
                                                        matcher = gj0.d.matcher(strGroup4);
                                                        if (!matcher.find()) {
                                                            strGroup = matcher.group(1);
                                                            if (strGroup != null) {
                                                                throw null;
                                                            }
                                                            try {
                                                                i9 = Integer.parseInt(strGroup.trim());
                                                                switch (i9) {
                                                                    case 1:
                                                                    case 2:
                                                                    case 3:
                                                                    case 4:
                                                                    case 5:
                                                                    case 6:
                                                                    case 7:
                                                                    case 8:
                                                                    case 9:
                                                                        break;
                                                                    default:
                                                                        s90.Q("SsaStyle", "Ignoring unknown alignment: ".concat(strGroup));
                                                                        i9 = -1;
                                                                        break;
                                                                }
                                                            } catch (NumberFormatException unused3) {
                                                            }
                                                        } else {
                                                            i9 = -1;
                                                        }
                                                        if (i9 != -1) {
                                                            i15 = i9;
                                                        }
                                                    } catch (RuntimeException unused4) {
                                                    }
                                                    i11 = 1;
                                                }
                                                if (strGroup2 == null) {
                                                    throw null;
                                                }
                                                float f7 = Float.parseFloat(strGroup2.trim());
                                                if (strGroup3 == null) {
                                                    throw null;
                                                }
                                                pointF = new PointF(f7, Float.parseFloat(strGroup3.trim()));
                                                if (pointF != null) {
                                                    pointF2 = pointF;
                                                }
                                                matcher = gj0.d.matcher(strGroup4);
                                                if (!matcher.find()) {
                                                    strGroup = matcher.group(1);
                                                    if (strGroup != null) {
                                                        throw null;
                                                    }
                                                    i9 = Integer.parseInt(strGroup.trim());
                                                    switch (i9) {
                                                        case 1:
                                                        case 2:
                                                        case 3:
                                                        case 4:
                                                        case 5:
                                                        case 6:
                                                        case 7:
                                                        case 8:
                                                        case 9:
                                                            break;
                                                        default:
                                                            s90.Q("SsaStyle", "Ignoring unknown alignment: ".concat(strGroup));
                                                            i9 = -1;
                                                            break;
                                                    }
                                                } else {
                                                    i9 = -1;
                                                }
                                                if (i9 != -1) {
                                                    i15 = i9;
                                                }
                                                i11 = 1;
                                            } catch (RuntimeException unused5) {
                                                cw1Var2 = cw1Var2;
                                                matcher2 = matcher2;
                                            }
                                        } catch (RuntimeException unused6) {
                                            ui0VarA = ui0VarA;
                                        }
                                    }
                                    charset = charsetQ;
                                    ui0Var = ui0VarA;
                                    cw1Var = cw1Var2;
                                    String strReplace = gj0.a.matcher(str).replaceAll("").replace("\\N", "\n").replace("\\n", "\n").replace("\\h", " ");
                                    float f8 = bj0Var.j;
                                    float f9 = bj0Var.k;
                                    SpannableString spannableString = new SpannableString(strReplace);
                                    if (hj0Var != null) {
                                        Integer num2 = hj0Var.c;
                                        if (num2 != null) {
                                            spannableString.setSpan(new ForegroundColorSpan(num2.intValue()), 0, spannableString.length(), 33);
                                        }
                                        if (hj0Var.j != 3 || (num = hj0Var.d) == null) {
                                            f = -3.4028235E38f;
                                        } else {
                                            f = -3.4028235E38f;
                                            spannableString.setSpan(new BackgroundColorSpan(num.intValue()), 0, spannableString.length(), 33);
                                        }
                                        float f10 = hj0Var.e;
                                        if (f10 == f || f9 == f) {
                                            f6 = -3.4028235E38f;
                                            i5 = Integer.MIN_VALUE;
                                        } else {
                                            f6 = f10 / f9;
                                            i5 = 1;
                                        }
                                        boolean z = hj0Var.f;
                                        boolean z2 = hj0Var.g;
                                        if (!z) {
                                            i8 = 33;
                                            i4 = 0;
                                            if (z2) {
                                                spannableString.setSpan(new StyleSpan(2), 0, spannableString.length(), 33);
                                            }
                                        } else if (z2) {
                                            i8 = 33;
                                            i4 = 0;
                                            spannableString.setSpan(new StyleSpan(3), 0, spannableString.length(), 33);
                                        } else {
                                            i8 = 33;
                                            i4 = 0;
                                            spannableString.setSpan(new StyleSpan(1), 0, spannableString.length(), 33);
                                        }
                                        if (hj0Var.h) {
                                            spannableString.setSpan(new UnderlineSpan(), i4, spannableString.length(), i8);
                                        }
                                        if (hj0Var.i) {
                                            spannableString.setSpan(new StrikethroughSpan(), i4, spannableString.length(), i8);
                                        }
                                        f2 = f6;
                                    } else {
                                        i4 = 0;
                                        f = -3.4028235E38f;
                                        f2 = -3.4028235E38f;
                                        i5 = Integer.MIN_VALUE;
                                    }
                                    int i16 = i15 != -1 ? i15 : hj0Var != null ? hj0Var.b : -1;
                                    switch (i16) {
                                        case 0:
                                        default:
                                            StringBuilder sb2 = new StringBuilder(g72.a(i16, 19));
                                            sb2.append("Unknown alignment: ");
                                            sb2.append(i16);
                                            s90.Q("SsaParser", sb2.toString());
                                        case -1:
                                            alignment = null;
                                            break;
                                        case 1:
                                        case 4:
                                        case 7:
                                            alignment = Layout.Alignment.ALIGN_NORMAL;
                                            break;
                                        case 2:
                                        case 5:
                                        case 8:
                                            alignment = Layout.Alignment.ALIGN_CENTER;
                                            break;
                                        case 3:
                                        case 6:
                                        case 9:
                                            alignment = Layout.Alignment.ALIGN_OPPOSITE;
                                            break;
                                    }
                                    switch (i16) {
                                        case 0:
                                        default:
                                            StringBuilder sb3 = new StringBuilder(g72.a(i16, 19));
                                            sb3.append("Unknown alignment: ");
                                            sb3.append(i16);
                                            s90.Q("SsaParser", sb3.toString());
                                        case -1:
                                            i6 = Integer.MIN_VALUE;
                                            break;
                                        case 1:
                                        case 4:
                                        case 7:
                                            i6 = i4;
                                            break;
                                        case 2:
                                        case 5:
                                        case 8:
                                            i6 = 1;
                                            break;
                                        case 3:
                                        case 6:
                                        case 9:
                                            i6 = 2;
                                            break;
                                    }
                                    switch (i16) {
                                        case 0:
                                        default:
                                            StringBuilder sb4 = new StringBuilder(g72.a(i16, 19));
                                            sb4.append("Unknown alignment: ");
                                            sb4.append(i16);
                                            s90.Q("SsaParser", sb4.toString());
                                        case -1:
                                            i7 = Integer.MIN_VALUE;
                                            break;
                                        case 1:
                                        case 2:
                                        case 3:
                                            i7 = 2;
                                            break;
                                        case 4:
                                        case 5:
                                        case 6:
                                            i7 = 1;
                                            break;
                                        case 7:
                                        case 8:
                                        case 9:
                                            i7 = i4;
                                            break;
                                    }
                                    if (pointF2 == 0 || f9 == f || f8 == f) {
                                        f3 = 0.05f;
                                        if (i6 == 0) {
                                            f4 = 0.05f;
                                        } else if (i6 != 1) {
                                            f4 = i6 != 2 ? f : 0.95f;
                                        } else {
                                            f4 = 0.5f;
                                        }
                                        if (i7 != 0) {
                                            f3 = i7 != 1 ? i7 != 2 ? f : 0.95f : 0.5f;
                                        }
                                        f5 = f4;
                                    } else {
                                        float f11 = pointF2.x / f8;
                                        f3 = pointF2.y / f9;
                                        f5 = f11;
                                    }
                                    tf1 tf1Var = new tf1(spannableString, alignment, null, null, f3, i4, i7, f5, i6, i5, f2, -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, 0.0f, i3);
                                    int iC = c(jB2, arrayList2, arrayList);
                                    for (int iC2 = c(jB, arrayList2, arrayList); iC2 < iC; iC2++) {
                                        ((List) arrayList.get(iC2)).add(tf1Var);
                                    }
                                }
                            }
                        }
                    }
                    charset = charsetQ;
                    ui0Var = ui0VarA;
                    cw1Var = cw1Var2;
                } else {
                    charset = charsetQ;
                    ui0Var = ui0VarA;
                    cw1Var = cw1Var2;
                }
                bj0Var = this;
                charsetQ = charset;
                ui0VarA = ui0Var;
                cw1Var2 = cw1Var;
            }
        }
    }
}
