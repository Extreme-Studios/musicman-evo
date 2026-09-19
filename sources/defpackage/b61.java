package defpackage;

import android.app.Activity;
import android.text.TextUtils;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class b61 extends us2 {
    public final Map i;
    public final Activity j;
    public final String k;
    public final long l;
    public final long m;
    public final String n;
    public final String o;

    public b61(md1 md1Var, Map map) {
        long j;
        super(md1Var, "createCalendarEvent", 12, false);
        this.i = map;
        this.j = md1Var.g();
        this.k = E("description");
        this.n = E("summary");
        String str = (String) map.get("start_ticks");
        long j2 = -1;
        if (str == null) {
            j = -1;
        } else {
            try {
                j = Long.parseLong(str);
            } catch (NumberFormatException unused) {
                j = -1;
            }
        }
        this.l = j;
        String str2 = (String) this.i.get("end_ticks");
        if (str2 != null) {
            try {
                j2 = Long.parseLong(str2);
            } catch (NumberFormatException unused2) {
            }
        }
        this.m = j2;
        this.o = E("location");
    }

    public final String E(String str) {
        Map map = this.i;
        return TextUtils.isEmpty((CharSequence) map.get(str)) ? "" : (String) map.get(str);
    }
}
