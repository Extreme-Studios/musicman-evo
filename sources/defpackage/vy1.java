package defpackage;

import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class vy1 implements tw1 {
    public final /* synthetic */ int a;
    public final ya1 b;
    public final u62 c;
    public final Object d;
    public final Object e;

    public /* synthetic */ vy1(u62 u62Var, ya1 ya1Var, Object obj, Object obj2, int i) {
        this.a = i;
        this.c = u62Var;
        this.b = ya1Var;
        this.e = obj2;
        this.d = obj;
    }

    public static final String c(String str, int i) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 20 + String.valueOf(i).length());
        sb.append("Error from: ");
        sb.append(str);
        sb.append(", code: ");
        sb.append(i);
        return sb.toString();
    }

    @Override // defpackage.tw1
    public final boolean a(e52 e52Var, x42 x42Var) {
        b52 b52Var;
        switch (this.a) {
            case 0:
                return !x42Var.t.isEmpty();
            default:
                return (((ux0) this.d) == null || (b52Var = x42Var.s) == null || b52Var.a == null) ? false : true;
        }
    }

    @Override // defpackage.tw1
    public final hp b(e52 e52Var, x42 x42Var) {
        ww1 ww1VarA;
        e52 e52Var2;
        boolean z = false;
        int i = 1;
        int i2 = 3;
        switch (this.a) {
            case 0:
                Iterator it = x42Var.t.iterator();
                while (true) {
                    if (it.hasNext()) {
                        try {
                            ww1VarA = ((vw1) this.d).a((String) it.next(), x42Var.v);
                        } catch (l52 unused) {
                        }
                    } else {
                        ww1VarA = null;
                    }
                }
                ww1 ww1Var = ww1VarA;
                if (ww1Var == null) {
                    return na1.C(new zx1("Unable to instantiate mediation adapter class.", 3));
                }
                cb1 cb1Var = new cb1();
                qk qkVar = new qk();
                qkVar.g = ww1Var;
                qkVar.h = cb1Var;
                qkVar.f = false;
                ww1Var.c.U(qkVar);
                if (x42Var.M) {
                    e52Var2 = e52Var;
                    Bundle bundle = ((i52) e52Var2.a.g).d.r;
                    Bundle bundle2 = bundle.getBundle(AdMobAdapter.class.getName());
                    if (bundle2 == null) {
                        bundle2 = new Bundle();
                        bundle.putBundle(AdMobAdapter.class.getName(), bundle2);
                    }
                    bundle2.putBoolean("render_test_ad_label", true);
                } else {
                    e52Var2 = e52Var;
                }
                u62 u62Var = this.c;
                r62 r62Var = r62.s;
                Objects.requireNonNull(u62Var);
                u40 u40Var = new u40(this, e52Var2, x42Var, ww1Var, 14, false);
                es0 es0Var = new es0(u62Var, r62Var, null, u62.d, Collections.EMPTY_LIST, this.b.b(new s22(i2, u40Var)));
                es0 es0VarA = ((u62) es0Var.k).a(es0Var.y(), r62.t);
                g41 g41Var = new g41(i, cb1Var);
                ya1 ya1Var = za1.g;
                es0 es0Var2 = new es0((u62) es0VarA.k, es0VarA.f, (String) es0VarA.g, (hp) es0VarA.h, (List) es0VarA.i, na1.L((hp) es0VarA.j, g41Var, ya1Var));
                return ((u62) es0Var2.k).a(es0Var2.y(), r62.u).o(new y91(this, e52Var, x42Var, ww1Var, 13, false)).y();
            default:
                cb1 cb1Var2 = new cb1();
                zx zxVar = new zx(28);
                kd0 kd0Var = new kd0((Object) this, (hp) cb1Var2, (Object) e52Var, (Object) x42Var, (Object) zxVar, 6);
                synchronized (zxVar) {
                    zxVar.g = kd0Var;
                }
                b52 b52Var = x42Var.s;
                tx0 tx0Var = new tx0(zxVar, b52Var.b, b52Var.a);
                r62 r62Var2 = r62.v;
                u62 u62Var2 = this.c;
                Objects.requireNonNull(u62Var2);
                us2 us2Var = new us2(this, tx0Var, 21, z);
                es0 es0Var3 = new es0(u62Var2, r62Var2, null, u62.d, Collections.EMPTY_LIST, this.b.b(new s22(i2, us2Var)));
                es0 es0VarA2 = ((u62) es0Var3.k).a(es0Var3.y(), r62.w);
                g41 g41Var2 = new g41(i, cb1Var2);
                ya1 ya1Var2 = za1.g;
                return new es0((u62) es0VarA2.k, es0VarA2.f, (String) es0VarA2.g, (hp) es0VarA2.h, (List) es0VarA2.i, na1.L((hp) es0VarA2.j, g41Var2, ya1Var2)).y();
        }
    }
}
