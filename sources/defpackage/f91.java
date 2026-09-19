package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class f91 implements SharedPreferences.OnSharedPreferenceChangeListener {
    public final Context a;
    public final SharedPreferences b;
    public final h73 c;
    public String d = "-1";
    public int e = -1;

    public f91(Context context, h73 h73Var) {
        this.b = PreferenceManager.getDefaultSharedPreferences(context);
        this.c = h73Var;
        this.a = context;
    }

    public final void a(String str, int i) {
        Context context;
        ix0 ix0Var = lx0.H0;
        tu0 tu0Var = tu0.e;
        boolean z = true;
        if (!((Boolean) tu0Var.c.a(ix0Var)).booleanValue() ? !(str.isEmpty() || str.charAt(0) != '1') : !(i == 0 || str.isEmpty() || (str.charAt(0) != '1' && !str.equals("-1")))) {
            z = false;
        }
        this.c.r(z);
        if (((Boolean) tu0Var.c.a(lx0.C6)).booleanValue() && z && (context = this.a) != null) {
            context.deleteDatabase("OfflineUpload.db");
        }
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        try {
            ix0 ix0Var = lx0.J0;
            tu0 tu0Var = tu0.e;
            if (((Boolean) tu0Var.c.a(ix0Var)).booleanValue()) {
                boolean zEquals = Objects.equals(str, "gad_has_consent_for_cookies");
                Context context = this.a;
                h73 h73Var = this.c;
                if (zEquals) {
                    int i = sharedPreferences.getInt("gad_has_consent_for_cookies", -1);
                    h73Var.h();
                    if (i != h73Var.m) {
                        h73Var.r(true);
                        w40.a0(context);
                    }
                    h73Var.b(i);
                    return;
                }
                if (Objects.equals(str, "IABTCF_TCString")) {
                    String string = sharedPreferences.getString(str, "-1");
                    h73Var.h();
                    if (!Objects.equals(string, h73Var.l)) {
                        h73Var.r(true);
                        w40.a0(context);
                    }
                    h73Var.a(string);
                    return;
                }
                return;
            }
            String string2 = sharedPreferences.getString("IABTCF_PurposeConsents", "-1");
            int i2 = sharedPreferences.getInt("gad_has_consent_for_cookies", -1);
            String strValueOf = String.valueOf(str);
            int iHashCode = strValueOf.hashCode();
            if (iHashCode == -2004976699) {
                if (!strValueOf.equals("IABTCF_PurposeConsents") || string2.equals("-1") || this.d.equals(string2)) {
                    return;
                }
                this.d = string2;
                a(string2, i2);
                return;
            }
            if (iHashCode == -527267622 && strValueOf.equals("gad_has_consent_for_cookies")) {
                if (!((Boolean) tu0Var.c.a(lx0.H0)).booleanValue() || i2 == -1 || this.e == i2) {
                    return;
                }
                this.e = i2;
                a(string2, i2);
            }
        } catch (Throwable th) {
            vc3.C.h.d("AdMobPlusIdlessListener.onSharedPreferenceChanged", th);
            jn.w("onSharedPreferenceChanged, errorMessage = ", th);
        }
    }
}
