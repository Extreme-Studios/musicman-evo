package defpackage;

import android.content.Context;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class ng1 implements fg1 {
    public final Context a;
    public final h73 b = vc3.C.h.g();

    public ng1(Context context) {
        this.a = context;
    }

    @Override // defpackage.fg1
    public final void a(HashMap map) {
        String str;
        if (map.isEmpty() || (str = (String) map.get("gad_idless")) == null) {
            return;
        }
        boolean z = Boolean.parseBoolean(str);
        this.b.r(z);
        if (z) {
            w40.a0(this.a);
        }
    }
}
