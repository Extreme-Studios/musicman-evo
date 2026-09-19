package defpackage;

import android.content.Context;
import android.content.Intent;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class oh2 {
    public static final wo2 c = new wo2("OverlayDisplayService");
    public static final Intent d = new Intent("com.google.android.play.core.lmd.BIND_OVERLAY_DISPLAY_SERVICE").setPackage("com.android.vending");
    public final qx1 a;
    public final String b;

    public oh2(Context context) {
        if (th2.a(context)) {
            this.a = new qx1(context.getApplicationContext(), c, d);
        } else {
            this.a = null;
        }
        this.b = context.getPackageName();
    }

    public static boolean b(String str) {
        if (str == null) {
            str = "";
        }
        return str.trim().isEmpty();
    }

    public static boolean c(s62 s62Var, String str, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!b((String) it.next())) {
                return true;
            }
        }
        c.f(str, new Object[0]);
        byte b = (byte) (((byte) (((byte) (0 | 1)) | 2)) | 1);
        if (b == 3) {
            s62Var.c(new lh2(null, 8160, 0));
            return false;
        }
        StringBuilder sb = new StringBuilder();
        if ((b & 1) == 0) {
            sb.append(" statusCode");
        }
        if ((b & 2) == 0) {
            sb.append(" uiMode");
        }
        j7.e("Missing required properties:".concat(sb.toString()));
        return false;
    }

    public final void a(mh2 mh2Var, s62 s62Var, int i) {
        qx1 qx1Var = this.a;
        if (qx1Var == null) {
            c.f("error: %s", "Play Store not found.");
        } else if (c(s62Var, "Failed to apply OverlayDisplayUpdateRequest: missing appId and sessionToken.", Arrays.asList(mh2Var.a, mh2Var.b))) {
            qx1Var.d(new sh2(qx1Var, new mc1(this, mh2Var, i, s62Var), 0));
        }
    }
}
