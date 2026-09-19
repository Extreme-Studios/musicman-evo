package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.CookieManager;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class kg1 implements fg1 {
    public final /* synthetic */ int a;
    public final Object b;

    public kg1(Context context) {
        this.a = 2;
        this.b = vc3.C.f.c();
    }

    @Override // defpackage.fg1
    public final void a(HashMap map) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                if (((Boolean) tu0.e.c.a(lx0.ib)).booleanValue()) {
                    na1.J(fn2.r(((sw1) obj).b(true)), Throwable.class, kg0.c, za1.a);
                    return;
                }
                return;
            case 1:
                String str = (String) map.get("render_in_browser");
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                try {
                    ((w42) obj).a(Boolean.parseBoolean(str));
                    return;
                } catch (Exception e) {
                    throw new IllegalStateException("Invalid render_in_browser state", e);
                }
            default:
                CookieManager cookieManager = (CookieManager) obj;
                if (cookieManager == null) {
                    return;
                }
                if (((String) map.get("clear")) == null) {
                    String str2 = (String) map.get("cookie");
                    if (TextUtils.isEmpty(str2)) {
                        return;
                    }
                    cookieManager.setCookie((String) tu0.e.c.a(lx0.W0), str2);
                    return;
                }
                String str3 = (String) tu0.e.c.a(lx0.W0);
                String cookie = cookieManager.getCookie(str3);
                if (cookie != null) {
                    List listM = bz1.c(new vh2(';')).m(cookie);
                    for (int i2 = 0; i2 < listM.size(); i2++) {
                        String str4 = (String) listM.get(i2);
                        bz1 bz1VarC = bz1.c(new vh2('='));
                        str4.getClass();
                        gi2 gi2Var = (gi2) ((hi2) bz1VarC.f).f(bz1VarC, str4);
                        if (!gi2Var.hasNext()) {
                            StringBuilder sb = new StringBuilder(String.valueOf(0).length() + 70);
                            sb.append("position (0) must be less than the number of elements that remained (0)");
                            throw new IndexOutOfBoundsException(sb.toString());
                        }
                        cookieManager.setCookie(str3, String.valueOf((String) gi2Var.next()).concat(String.valueOf((String) tu0.e.c.a(lx0.I0))));
                    }
                    return;
                }
                return;
        }
    }

    public /* synthetic */ kg1(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }
}
