package defpackage;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class u11 {
    public static final m11 a = new m11(12);
    public static final m11 b = new m11(13);
    public static final m11 c = new m11(14);
    public static final m11 d = new m11(15);
    public static final m11 e = new m11(16);
    public static final m11 f = new m11(17);
    public static final ec1 g = new ec1();
    public static final m11 h = new m11(25);
    public static final l11 i = new l11();
    public static final s11 j = new s11();
    public static final m11 k = new m11(18);
    public static final m11 l = new m11(19);
    public static final m11 m = new m11(0);
    public static final m11 n = new m11(1);
    public static final m11 o = new m11(2);
    public static final m11 p = new m11(3);
    public static final m11 q = new m11(4);
    public static final m11 r = new m11(5);
    public static final m11 s = new m11(6);
    public static final m11 t = new m11(7);
    public static final m11 u = new m11(8);
    public static final m11 v = new m11(9);
    public static final m11 w = new m11(10);
    public static final m11 x = new m11(11);

    public static hp a(md1 md1Var, String str) {
        String strD;
        String strReplace;
        Uri uriB = Uri.parse(str);
        try {
            zq0 zq0VarS = md1Var.S();
            k52 k52VarS0 = md1Var.s0();
            if (!((Boolean) tu0.e.c.a(lx0.Mc)).booleanValue() || k52VarS0 == null) {
                if (zq0VarS != null && zq0VarS.a(uriB)) {
                    uriB = zq0VarS.b(uriB, md1Var.getContext(), md1Var.p0(), md1Var.g());
                }
            } else if (zq0VarS != null && zq0VarS.a(uriB)) {
                uriB = k52VarS0.a(uriB, md1Var.getContext(), md1Var.p0(), md1Var.g());
            }
        } catch (ar0 unused) {
            jn.T("Unable to append parameter to URL: ".concat(str));
        }
        HashMap map = new HashMap();
        if (md1Var.E() != null) {
            map = md1Var.E().w0;
        }
        Context context = md1Var.getContext();
        aa1 aa1Var = vc3.C.y;
        if (aa1Var.a(context) && (strD = aa1Var.d(context)) != null) {
            ix0 ix0Var = lx0.s0;
            kx0 kx0Var = tu0.e.c;
            String str2 = (String) kx0Var.a(ix0Var);
            String string = uriB.toString();
            if (((Boolean) kx0Var.a(lx0.r0)).booleanValue() && string.contains(str2)) {
                aa1Var.h(context, "_ac", strD, aa1.f((Map) map.get("_ac")));
                strReplace = v51.E(context, string).replace(str2, strD);
            } else if (!TextUtils.isEmpty(uriB.getQueryParameter("fbs_aeid")) || ((Boolean) kx0Var.a(lx0.q0)).booleanValue()) {
                strReplace = string;
            } else {
                String string2 = v51.B(v51.E(context, string), "fbs_aeid", strD).toString();
                aa1Var.h(context, "_ac", strD, aa1.f((Map) map.get("_ac")));
                strReplace = string2;
            }
        } else {
            strReplace = uriB.toString();
        }
        long jLongValue = ((Long) qy0.e.u()).longValue();
        if (jLongValue <= 0 || jLongValue > 253830000) {
            return na1.t(strReplace);
        }
        fn2 fn2VarR = fn2.r(md1Var.r0());
        lh0 lh0Var = lh0.e;
        ya1 ya1Var = za1.g;
        return na1.I(na1.M(na1.I(fn2VarR, Throwable.class, lh0Var, ya1Var), new r11(strReplace, 0), ya1Var), Throwable.class, new r11(strReplace, 1), ya1Var);
    }

    public static void b(Map map, zm1 zm1Var) {
        if (((Boolean) tu0.e.c.a(lx0.zb)).booleanValue() && map.containsKey("sc") && ((String) map.get("sc")).equals("1") && zm1Var != null) {
            zm1Var.q0();
        }
    }
}
