package defpackage;

import android.os.LocaleList;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class qp {
    public static final qp b = new qp(new rp(new LocaleList(new Locale[0])));
    public final rp a;

    public qp(rp rpVar) {
        this.a = rpVar;
    }

    public static qp a(String str) {
        if (str == null || str.isEmpty()) {
            return b;
        }
        String[] strArrSplit = str.split(",", -1);
        int length = strArrSplit.length;
        Locale[] localeArr = new Locale[length];
        for (int i = 0; i < length; i++) {
            String str2 = strArrSplit[i];
            int i2 = pp.a;
            localeArr[i] = Locale.forLanguageTag(str2);
        }
        return new qp(new rp(new LocaleList(localeArr)));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof qp) {
            return this.a.equals(((qp) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }

    public final String toString() {
        return this.a.a.toString();
    }
}
