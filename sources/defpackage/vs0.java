package defpackage;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class vs0 {
    public final Context a;
    public boolean b;
    public final d91 c;
    public final i71 d = new i71(false, Collections.EMPTY_LIST);

    public vs0(Context context, d91 d91Var) {
        this.a = context;
        this.c = d91Var;
    }

    public final boolean a() {
        d91 d91Var = this.c;
        return ((d91Var == null || !d91Var.g.k) && !this.d.f) || this.b;
    }

    public final void b(String str) {
        List<String> list;
        i71 i71Var = this.d;
        d91 d91Var = this.c;
        if ((d91Var == null || !d91Var.g.k) && !i71Var.f) {
            return;
        }
        if (str == null) {
            str = "";
        }
        if (d91Var != null) {
            d91Var.b(str, null, 3);
            return;
        }
        if (!i71Var.f || (list = i71Var.g) == null) {
            return;
        }
        for (String str2 : list) {
            if (!TextUtils.isEmpty(str2)) {
                String strReplace = str2.replace("{NAVIGATION_URL}", Uri.encode(str));
                zb3 zb3Var = vc3.C.c;
                new l51(this.a, "", strReplace, null).o1();
            }
        }
    }
}
