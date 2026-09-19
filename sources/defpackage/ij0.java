package defpackage;

import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class ij0 implements qi0 {
    public static final Pattern i = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d{3}))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d{3}))?)\\s*");
    public static final Pattern j = Pattern.compile("\\{\\\\.*?\\}");
    public final StringBuilder f = new StringBuilder();
    public final ArrayList g = new ArrayList();
    public final cw1 h = new cw1();

    public static long a(Matcher matcher, int i2) {
        String strGroup = matcher.group(i2 + 1);
        long j2 = strGroup != null ? Long.parseLong(strGroup) * 3600000 : 0L;
        String strGroup2 = matcher.group(i2 + 2);
        strGroup2.getClass();
        long j3 = (Long.parseLong(strGroup2) * 60000) + j2;
        String strGroup3 = matcher.group(i2 + 3);
        strGroup3.getClass();
        long j4 = (Long.parseLong(strGroup3) * 1000) + j3;
        String strGroup4 = matcher.group(i2 + 4);
        if (strGroup4 != null) {
            j4 += Long.parseLong(strGroup4);
        }
        return j4 * 1000;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:55:0x0134  */
    /* JADX WARN: Code duplicated, block: B:58:0x013c  */
    /* JADX WARN: Code duplicated, block: B:59:0x013e  */
    /* JADX WARN: Code duplicated, block: B:71:0x015d  */
    /* JADX WARN: Code duplicated, block: B:80:0x0175  */
    /* JADX WARN: Code duplicated, block: B:81:0x0177  */
    @Override // defpackage.qi0
    public final void s(byte[] bArr, int i2, int i3, ri0 ri0Var) {
        String str;
        int i4;
        int i5;
        float f;
        tf1 tf1Var;
        ij0 ij0Var = this;
        cw1 cw1Var = ij0Var.h;
        cw1Var.z(i2 + i3, bArr);
        cw1Var.E(i2);
        Charset charsetQ = cw1Var.q();
        if (charsetQ == null) {
            charsetQ = StandardCharsets.UTF_8;
        }
        while (true) {
            String strN = cw1Var.n(charsetQ);
            if (strN == null) {
                return;
            }
            if (!strN.isEmpty()) {
                try {
                    Integer.parseInt(strN);
                    String strN2 = cw1Var.n(charsetQ);
                    if (strN2 == null) {
                        s90.Q("SubripParser", "Unexpected end");
                        return;
                    }
                    Matcher matcher = i.matcher(strN2);
                    if (matcher.matches()) {
                        long jA = a(matcher, 1);
                        long jA2 = a(matcher, 6);
                        StringBuilder sb = ij0Var.f;
                        int i6 = 0;
                        sb.setLength(0);
                        ArrayList arrayList = ij0Var.g;
                        arrayList.clear();
                        String strN3 = cw1Var.n(charsetQ);
                        while (!TextUtils.isEmpty(strN3)) {
                            if (sb.length() > 0) {
                                sb.append("<br>");
                            }
                            String strTrim = strN3.trim();
                            StringBuilder sb2 = new StringBuilder(strTrim);
                            Matcher matcher2 = j.matcher(strTrim);
                            int i7 = i6;
                            while (matcher2.find()) {
                                String strGroup = matcher2.group();
                                arrayList.add(strGroup);
                                int iStart = matcher2.start() - i7;
                                int length = strGroup.length();
                                sb2.replace(iStart, iStart + length, "");
                                i7 += length;
                            }
                            sb.append(sb2.toString());
                            strN3 = cw1Var.n(charsetQ);
                            i6 = 0;
                        }
                        Spanned spannedFromHtml = Html.fromHtml(sb.toString());
                        int i8 = 0;
                        while (true) {
                            if (i8 < arrayList.size()) {
                                str = (String) arrayList.get(i8);
                                if (!str.matches("\\{\\\\an[1-9]\\}")) {
                                    i8++;
                                }
                            } else {
                                str = null;
                            }
                        }
                        if (str == null) {
                            tf1Var = new tf1(spannedFromHtml, null, null, null, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, 0.0f, 0);
                        } else {
                            switch (str.hashCode()) {
                                case -685620710:
                                    if (!str.equals("{\\an1}")) {
                                        i4 = 1;
                                    } else {
                                        i4 = 0;
                                    }
                                    break;
                                case -685620648:
                                    if (!str.equals("{\\an3}")) {
                                        i4 = 1;
                                    } else {
                                        i4 = 2;
                                    }
                                    break;
                                case -685620617:
                                    if (!str.equals("{\\an4}")) {
                                        i4 = 1;
                                    } else {
                                        i4 = 0;
                                    }
                                    break;
                                case -685620555:
                                    if (!str.equals("{\\an6}")) {
                                        i4 = 1;
                                    } else {
                                        i4 = 2;
                                    }
                                    break;
                                case -685620524:
                                    if (!str.equals("{\\an7}")) {
                                        i4 = 1;
                                    } else {
                                        i4 = 0;
                                    }
                                    break;
                                case -685620462:
                                    if (!str.equals("{\\an9}")) {
                                        i4 = 1;
                                    } else {
                                        i4 = 2;
                                    }
                                    break;
                                default:
                                    i4 = 1;
                                    break;
                            }
                            switch (str) {
                                case "{\an1}":
                                case "{\an2}":
                                case "{\an3}":
                                    i5 = 2;
                                    break;
                                case "{\an7}":
                                case "{\an8}":
                                case "{\an9}":
                                    i5 = 0;
                                    break;
                                default:
                                    i5 = 1;
                                    break;
                            }
                            float f2 = 0.08f;
                            if (i4 == 0) {
                                f = 0.08f;
                            } else if (i4 == 1) {
                                f = 0.5f;
                            } else {
                                if (i4 != 2) {
                                    throw new IllegalArgumentException();
                                }
                                f = 0.92f;
                            }
                            if (i5 != 0) {
                                if (i5 == 1) {
                                    f2 = 0.5f;
                                } else {
                                    if (i5 != 2) {
                                        throw new IllegalArgumentException();
                                    }
                                    f2 = 0.92f;
                                }
                            }
                            tf1Var = new tf1(spannedFromHtml, null, null, null, f2, 0, i5, f, i4, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, 0.0f, 0);
                        }
                        ri0Var.mo0b(new mi0(vj2.i(tf1Var), jA, jA2 - jA));
                    } else {
                        s90.Q("SubripParser", "Skipping invalid timing: ".concat(strN2));
                    }
                } catch (NumberFormatException unused) {
                    s90.Q("SubripParser", "Skipping invalid index: ".concat(strN));
                }
            }
            ij0Var = this;
        }
    }
}
