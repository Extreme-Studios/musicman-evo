package defpackage;

import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class sj0 {
    public static final Pattern c = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");
    public static final Pattern d = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");
    public final cw1 a = new cw1();
    public final StringBuilder b = new StringBuilder();

    public static void a(cw1 cw1Var) {
        while (true) {
            for (boolean z = true; cw1Var.B() > 0 && z; z = false) {
                int i = cw1Var.b;
                byte[] bArr = cw1Var.a;
                byte b = bArr[i];
                char c2 = (char) b;
                if (c2 == '\t' || c2 == '\n' || c2 == '\f' || c2 == '\r' || c2 == ' ') {
                    cw1Var.G(1);
                } else {
                    int i2 = cw1Var.c;
                    if (i + 2 <= i2) {
                        int i3 = i + 1;
                        if (b == 47) {
                            int i4 = i + 2;
                            if (bArr[i3] == 42) {
                                while (true) {
                                    int i5 = i4 + 1;
                                    if (i5 >= i2) {
                                        break;
                                    }
                                    if (((char) bArr[i4]) == '*' && ((char) bArr[i5]) == '/') {
                                        i2 = i4 + 2;
                                        i4 = i2;
                                    } else {
                                        i4 = i5;
                                    }
                                }
                                cw1Var.G(i2 - cw1Var.b);
                            }
                        } else {
                            continue;
                        }
                    }
                }
            }
            return;
        }
    }

    public static String b(cw1 cw1Var, StringBuilder sb) {
        a(cw1Var);
        if (cw1Var.B() == 0) {
            return null;
        }
        String strC = c(cw1Var, sb);
        if (!strC.isEmpty()) {
            return strC;
        }
        char cK = (char) cw1Var.K();
        StringBuilder sb2 = new StringBuilder(String.valueOf(cK).length());
        sb2.append(cK);
        return sb2.toString();
    }

    public static String c(cw1 cw1Var, StringBuilder sb) {
        char c2;
        sb.setLength(0);
        int i = cw1Var.b;
        int i2 = cw1Var.c;
        loop0: while (true) {
            boolean z = false;
            while (true) {
                if (i < i2 && !z) {
                    c2 = (char) cw1Var.a[i];
                    if ((c2 >= 'A' && c2 <= 'Z') || ((c2 >= 'a' && c2 <= 'z') || ((c2 >= '0' && c2 <= '9') || c2 == '#' || c2 == '-' || c2 == '.' || c2 == '_'))) {
                        break;
                    }
                    z = true;
                } else {
                    break loop0;
                }
            }
            sb.append(c2);
            i++;
        }
        cw1Var.G(i - cw1Var.b);
        return sb.toString();
    }
}
