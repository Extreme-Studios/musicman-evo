package defpackage;

import android.content.res.Configuration;
import android.os.LocaleList;

/* JADX INFO: loaded from: classes.dex */
public abstract class t4 {
    public static void a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
        LocaleList locales = configuration.getLocales();
        LocaleList locales2 = configuration2.getLocales();
        if (locales.equals(locales2)) {
            return;
        }
        configuration3.setLocales(locales2);
        configuration3.locale = configuration2.locale;
    }

    public static qp b(Configuration configuration) {
        return qp.a(configuration.getLocales().toLanguageTags());
    }

    public static void c(qp qpVar) {
        LocaleList.setDefault(LocaleList.forLanguageTags(qpVar.a.a.toLanguageTags()));
    }

    public static void d(Configuration configuration, qp qpVar) {
        configuration.setLocales(LocaleList.forLanguageTags(qpVar.a.a.toLanguageTags()));
    }
}
