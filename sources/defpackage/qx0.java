package defpackage;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public final class qx0 {
    public static final qx0 b = new qx0(0);
    public static final qx0 c = new qx0(1);
    public static final qx0 d = new qx0(2);
    public final /* synthetic */ int a;

    public /* synthetic */ qx0(int i) {
        this.a = i;
    }

    public static final String b(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        int length = str.length();
        int i = 0;
        int i2 = 0;
        while (i2 < str.length() && str.charAt(i2) == ',') {
            i2++;
        }
        while (length > 0) {
            int i3 = length - 1;
            if (str.charAt(i3) != ',') {
                break;
            }
            length = i3;
        }
        if (length < i2) {
            return null;
        }
        if (i2 != 0) {
            i = i2;
        } else if (length == str.length()) {
            return str;
        }
        return str.substring(i, length);
    }

    public final String a(String str, String str2) {
        switch (this.a) {
            case 0:
                return str2;
            case 1:
                return str != null ? str : str2;
            default:
                String strB = b(str);
                String strB2 = b(str2);
                if (TextUtils.isEmpty(strB)) {
                    return strB2;
                }
                if (TextUtils.isEmpty(strB2)) {
                    return strB;
                }
                return ec.n(new StringBuilder(String.valueOf(strB).length() + 1 + String.valueOf(strB2).length()), strB, ",", strB2);
        }
    }
}
