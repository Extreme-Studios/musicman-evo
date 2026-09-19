package defpackage;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes.dex */
public final class e82 {
    public final hy1 a;
    public final String b;
    public final String c;
    public final String d;
    public final Context e;
    public final f52 f;
    public final g52 g;
    public final ae h;
    public final zq0 i;

    public e82(hy1 hy1Var, d60 d60Var, String str, String str2, Context context, f52 f52Var, g52 g52Var, ae aeVar, zq0 zq0Var) {
        this.a = hy1Var;
        this.b = d60Var.f;
        this.c = str;
        this.d = str2;
        this.e = context;
        this.f = f52Var;
        this.g = g52Var;
        this.h = aeVar;
        this.i = zq0Var;
    }

    public static String c(String str, String str2, String str3) {
        if (true == TextUtils.isEmpty(str3)) {
            str3 = "";
        }
        return str.replaceAll(str2, str3);
    }

    public final ArrayList a(e52 e52Var, x42 x42Var, List list) {
        return b(e52Var, x42Var, false, "", "", list, null);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:40:0x0118  */
    public final ArrayList b(e52 e52Var, x42 x42Var, boolean z, String str, String str2, List list, oj1 oj1Var) {
        long j;
        boolean z2;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String strC = c(c(c((String) it.next(), "@gw_adlocid@", ((i52) e52Var.a.g).g), "@gw_adnetrefresh@", true != z ? "0" : "1"), "@gw_sdkver@", this.b);
            if (x42Var != null) {
                String strC2 = c(c(c(strC, "@gw_qdata@", x42Var.y), "@gw_adnetid@", x42Var.x), "@gw_allocid@", x42Var.w);
                Context context = this.e;
                strC = v51.r(strC2, context, x42Var.W, x42Var.w0);
                if (((Boolean) tu0.e.c.a(lx0.ie)).booleanValue() && x42Var.e == 4) {
                    zb3 zb3Var = vc3.C.c;
                    strC = c(strC, "@gw_aps@", true != zb3.g(context) ? "0" : "1");
                }
            }
            hy1 hy1Var = this.a;
            String strC3 = c(strC, "@gw_adnetstatus@", hy1Var.d());
            synchronized (hy1Var) {
                j = hy1Var.h;
            }
            String strC4 = c(c(c(strC3, "@gw_ttr@", Long.toString(j, 10)), "@gw_seqnum@", this.c), "@gw_sessid@", this.d);
            ix0 ix0Var = lx0.re;
            tu0 tu0Var = tu0.e;
            if (((Boolean) tu0Var.c.a(ix0Var)).booleanValue()) {
                if (oj1Var != null) {
                    AtomicLong atomicLong = oj1Var.a;
                    if (atomicLong.get() > 0) {
                        strC4 = c(strC4, "@gw_placement_id@", Long.toString(atomicLong.get(), 10));
                    } else {
                        strC4 = c(strC4, "@gw_placement_id@", "");
                    }
                } else {
                    strC4 = c(strC4, "@gw_placement_id@", "");
                }
            }
            boolean z3 = false;
            if (((Boolean) tu0Var.c.a(lx0.S3)).booleanValue() && !TextUtils.isEmpty(str)) {
                z3 = true;
            }
            boolean zIsEmpty = TextUtils.isEmpty(str2);
            boolean z4 = !zIsEmpty;
            if (z3) {
                z2 = z4;
            } else {
                if (!zIsEmpty) {
                    z2 = true;
                }
                arrayList.add(strC4);
            }
            if (this.i.a(Uri.parse(strC4))) {
                Uri.Builder builderBuildUpon = Uri.parse(strC4).buildUpon();
                if (z3) {
                    builderBuildUpon = builderBuildUpon.appendQueryParameter("ms", str);
                }
                if (z2) {
                    builderBuildUpon = builderBuildUpon.appendQueryParameter("attok", str2);
                }
                strC4 = builderBuildUpon.build().toString();
            }
            arrayList.add(strC4);
        }
        return arrayList;
    }
}
