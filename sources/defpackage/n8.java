package defpackage;

import android.os.Build;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public abstract class n8 {
    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            q0.b(30);
        }
        if (i >= 30) {
            q0.b(31);
        }
        if (i >= 30) {
            q0.b(33);
        }
        if (i >= 30) {
            q0.b(1000000);
        }
    }

    public static final boolean a() {
        Integer num = 0;
        int i = Build.VERSION.SDK_INT;
        if (i >= 31) {
            return true;
        }
        if (i >= 30) {
            String str = Build.VERSION.CODENAME;
            str.getClass();
            if (!"REL".equals(str)) {
                Locale locale = Locale.ROOT;
                String upperCase = str.toUpperCase(locale);
                upperCase.getClass();
                Integer num2 = upperCase.equals("BAKLAVA") ? num : null;
                String upperCase2 = "S".toUpperCase(locale);
                upperCase2.getClass();
                num = upperCase2.equals("BAKLAVA") ? 0 : null;
                if (num2 == null || num == null) {
                    if (num2 == null && num == null) {
                        String upperCase3 = str.toUpperCase(locale);
                        upperCase3.getClass();
                        String upperCase4 = "S".toUpperCase(locale);
                        upperCase4.getClass();
                        if (upperCase3.compareTo(upperCase4) >= 0) {
                            return true;
                        }
                    } else if (num2 != null) {
                        return true;
                    }
                } else if (num2.intValue() >= num.intValue()) {
                    return true;
                }
            }
        }
        return false;
    }
}
