package defpackage;

import android.os.SystemClock;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class l11 implements v11 {
    public static final Pattern f = Pattern.compile("^[a-zA-Z]([a-zA-Z0-9]|:|-|_)*$");
    public static final Pattern g = Pattern.compile("^[0-9]*(,[0-9]*)*$");

    @Override // defpackage.v11
    public final void f(Object obj, Map map) {
        md1 md1Var = (md1) obj;
        String str = (String) map.get("action");
        boolean zEquals = "tick".equals(str);
        Pattern pattern = f;
        if (!zEquals) {
            if ("experiment".equals(str)) {
                String str2 = (String) map.get("value");
                if (TextUtils.isEmpty(str2)) {
                    jn.T("No value given for CSI experiment.");
                    return;
                }
                if (!((Boolean) tu0.e.c.a(lx0.i2)).booleanValue() || g.matcher(str2).matches()) {
                    ((sx0) md1Var.n().h).c("e", str2);
                    return;
                } else {
                    jn.F("Invalid value given for CSI experiment. Should be a comma separated list of numbers.");
                    return;
                }
            }
            if ("extra".equals(str)) {
                String str3 = (String) map.get("name");
                String str4 = (String) map.get("value");
                if (TextUtils.isEmpty(str4)) {
                    jn.T("No value given for CSI extra.");
                    return;
                }
                if (TextUtils.isEmpty(str3)) {
                    jn.T("No name given for CSI extra.");
                    return;
                }
                if (!((Boolean) tu0.e.c.a(lx0.i2)).booleanValue() || pattern.matcher(str3).matches()) {
                    ((sx0) md1Var.n().h).c(str3, str4);
                    return;
                } else {
                    jn.F("Invalid name given for CSI extra. Should start with a letter and only alphanumerics, :, -, _ are allowed.");
                    return;
                }
            }
            return;
        }
        String str5 = (String) map.get("label");
        String str6 = (String) map.get("start_label");
        String str7 = (String) map.get("timestamp");
        if (TextUtils.isEmpty(str5)) {
            jn.T("No label given for CSI tick.");
            return;
        }
        ix0 ix0Var = lx0.i2;
        tu0 tu0Var = tu0.e;
        if (((Boolean) tu0Var.c.a(ix0Var)).booleanValue() && !pattern.matcher(str5).matches()) {
            jn.F("Invalid label given for CSI tick. Should start with a letter and only alphanumerics, :, -, _ are allowed.");
            return;
        }
        if (TextUtils.isEmpty(str7)) {
            jn.T("No timestamp given for CSI tick.");
            return;
        }
        try {
            long j = Long.parseLong(str7);
            vc3 vc3Var = vc3.C;
            vc3Var.k.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            vc3Var.k.getClass();
            long jElapsedRealtime = (j - jCurrentTimeMillis) + SystemClock.elapsedRealtime();
            if (true == TextUtils.isEmpty(str6)) {
                str6 = "native:view_load";
            }
            if (((Boolean) tu0Var.c.a(ix0Var)).booleanValue() && !pattern.matcher(str6).matches()) {
                jn.F("Invalid start label given for CSI tick. Should start with a letter and only alphanumerics, :, -, _ are allowed.");
                return;
            }
            us2 us2VarN = md1Var.n();
            HashMap map2 = (HashMap) us2VarN.g;
            rx0 rx0Var = (rx0) map2.get(str6);
            String[] strArr = {str5};
            if (rx0Var != null) {
                ((sx0) us2VarN.h).a(rx0Var, jElapsedRealtime, strArr);
            }
            map2.put(str5, new rx0(jElapsedRealtime, null, null));
        } catch (NumberFormatException e) {
            jn.V("Malformed timestamp for CSI tick.", e);
        }
    }
}
