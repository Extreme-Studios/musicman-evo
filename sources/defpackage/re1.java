package defpackage;

import android.webkit.CookieManager;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class re1 implements r63 {
    public final /* synthetic */ int a;
    public final q63 b;
    public final q63 c;

    public /* synthetic */ re1(q63 q63Var, q63 q63Var2, int i) {
        this.a = i;
        this.b = q63Var;
        this.c = q63Var2;
    }

    @Override // defpackage.v63
    public final Object c() {
        ya1 ya1Var;
        int i = this.a;
        q63 q63Var = this.c;
        q63 q63Var2 = this.b;
        switch (i) {
            case 0:
                return new qe1((me1) q63Var2.c(), (es1) q63Var.c());
            case 1:
                return new se1((ScheduledExecutorService) q63Var.c());
            case 2:
                return ((Boolean) tu0.e.c.a(lx0.d3)).booleanValue() ? new zq0((vq0) q63Var.c()) : new zq0((vq0) q63Var2.c());
            case 3:
                ot0 ot0Var = (ot0) q63Var2.c();
                d41 d41Var = (d41) q63Var.c();
                ix0 ix0Var = lx0.g6;
                tu0 tu0Var = tu0.e;
                if (((Boolean) tu0Var.c.a(ix0Var)).booleanValue()) {
                    ya1Var = za1.c;
                } else {
                    ya1Var = ((Boolean) tu0Var.c.a(lx0.f6)).booleanValue() ? za1.a : za1.f;
                }
                dq.D(ya1Var);
                return new ch1(ot0Var.c, d41Var, ya1Var);
            case 4:
                ih1 ih1Var = (ih1) q63Var2.c();
                ya1 ya1Var2 = za1.a;
                dq.D(ya1Var2);
                Set setSingleton = ((JSONObject) q63Var.c()) == null ? Collections.EMPTY_SET : Collections.singleton(new wm1(ih1Var, ya1Var2));
                dq.D(setSingleton);
                return setSingleton;
            case 5:
                ih1 ih1Var2 = (ih1) q63Var2.c();
                ya1 ya1Var3 = za1.a;
                dq.D(ya1Var3);
                Set setSingleton2 = ((JSONObject) q63Var.c()) == null ? Collections.EMPTY_SET : Collections.singleton(new wm1(ih1Var2, ya1Var3));
                dq.D(setSingleton2);
                return setSingleton2;
            case 6:
                ih1 ih1Var3 = (ih1) q63Var2.c();
                ya1 ya1Var4 = za1.a;
                dq.D(ya1Var4);
                Set setSingleton3 = ((JSONObject) q63Var.c()) == null ? Collections.EMPTY_SET : Collections.singleton(new wm1(ih1Var3, ya1Var4));
                dq.D(setSingleton3);
                return setSingleton3;
            case 7:
                ih1 ih1Var4 = (ih1) q63Var2.c();
                ya1 ya1Var5 = za1.a;
                dq.D(ya1Var5);
                Set setSingleton4 = ((JSONObject) q63Var.c()) == null ? Collections.EMPTY_SET : Collections.singleton(new wm1(ih1Var4, ya1Var5));
                dq.D(setSingleton4);
                return setSingleton4;
            case 8:
                return new nn1((gl1) q63Var2.c(), (tm1) q63Var.c());
            case 9:
                return new js1((String) q63Var2.c(), (hs1) q63Var.c());
            case 10:
                return new mt1((dt1) q63Var2.c(), (qr1) q63Var.c());
            case 11:
                u62 u62Var = (u62) q63Var2.c();
                CookieManager cookieManagerC = vc3.C.f.c();
                Objects.requireNonNull(u62Var);
                br0 br0Var = new br0(5, cookieManagerC);
                es0 es0Var = new es0(u62Var, r62.x, null, u62.d, Collections.EMPTY_LIST, na1.K(u62Var.a.b(br0Var), 1L, TimeUnit.SECONDS, u62Var.b));
                kg0 kg0Var = new kg0(15);
                u62 u62Var2 = (u62) es0Var.k;
                return new es0(u62Var2, es0Var.f, (String) es0Var.g, (hp) es0Var.h, (List) es0Var.i, na1.J((hp) es0Var.j, Exception.class, kg0Var, u62Var2.a)).y();
            case 12:
                ya1 ya1Var6 = za1.a;
                dq.D(ya1Var6);
                c12 c12Var = new c12(ya1Var6, 2);
                ae aeVar = (ae) q63Var2.c();
                dq.D(ya1Var6);
                return new b12(c12Var, ((Long) jy0.f.u()).longValue(), aeVar, ya1Var6, (es1) q63Var.c());
            case 13:
                return new w42((ae) q63Var2.c(), (es1) q63Var.c());
            case 14:
                return new y12((String) q63Var2.c(), ((Integer) q63Var.c()).intValue());
            case 15:
                return new n82((o82) q63Var2.c(), (h82) q63Var.c());
            case 16:
                i10 i10Var = (i10) q63Var2.c();
                ya1 ya1Var7 = za1.a;
                dq.D(ya1Var7);
                return new gr1(i10Var, new s62(ya1Var7), (or1) q63Var.c(), new el1(29, (byte) 0));
            default:
                return new dh2((rc2) q63Var2.c(), (ud2) q63Var.c());
        }
    }
}
