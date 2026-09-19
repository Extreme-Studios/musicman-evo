package defpackage;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class mx1 implements tw1 {
    public final /* synthetic */ int a = 0;
    public final Context b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;

    public mx1(Context context, Executor executor, sf1 sf1Var, w42 w42Var, es1 es1Var) {
        this.b = context;
        this.c = sf1Var;
        this.d = executor;
        this.e = w42Var;
        this.f = es1Var;
    }

    @Override // defpackage.tw1
    public final boolean a(e52 e52Var, x42 x42Var) {
        String string;
        b52 b52Var;
        switch (this.a) {
            case 0:
                Context context = this.b;
                if (!(context instanceof Activity) || !xx0.a(context)) {
                    return false;
                }
                try {
                    string = x42Var.v.getString("tab_url");
                    break;
                } catch (Exception unused) {
                    string = null;
                }
                return !TextUtils.isEmpty(string);
            default:
                return (((ux0) this.d) == null || (b52Var = x42Var.s) == null || b52Var.a == null) ? false : true;
        }
    }

    @Override // defpackage.tw1
    public final hp b(e52 e52Var, x42 x42Var) {
        String string;
        int i = this.a;
        Object obj = this.f;
        switch (i) {
            case 0:
                if (((Boolean) tu0.e.c.a(lx0.Sd)).booleanValue()) {
                    us2 us2VarA = ((es1) obj).a();
                    us2VarA.s("action", "cstm_tbs_rndr");
                    us2VarA.t();
                }
                try {
                    string = x42Var.v.getString("tab_url");
                    break;
                } catch (Exception unused) {
                    string = null;
                }
                return na1.L(kn2.g, new lx1(this, string != null ? Uri.parse(string) : null, e52Var, x42Var, (z42) e52Var.b.h, 0), (Executor) this.d);
            default:
                xy1 xy1Var = new xy1(new View(this.b), null, fl1.x, (y42) x42Var.u.get(0));
                p83 p83Var = new p83(e52Var, x42Var, (String) null);
                pf1 pf1Var = (pf1) this.c;
                of1 of1Var = new of1(pf1Var.d, pf1Var.e, p83Var, xy1Var);
                ak1 ak1Var = (ak1) of1Var.T.c();
                kk1 kk1Var = (kk1) of1Var.W.c();
                an1 an1Var = (an1) of1Var.Y.c();
                xm1 xm1Var = (xm1) of1Var.h0.c();
                ih1 ih1Var = (ih1) of1Var.N.c();
                es0 es0Var = new es0();
                es0Var.k = new AtomicBoolean(false);
                es0Var.f = ak1Var;
                es0Var.g = kk1Var;
                es0Var.h = an1Var;
                es0Var.i = xm1Var;
                es0Var.j = ih1Var;
                b52 b52Var = x42Var.s;
                tx0 tx0Var = new tx0(es0Var, b52Var.b, b52Var.a);
                u62 u62Var = (u62) obj;
                Objects.requireNonNull(u62Var);
                es0 es0Var2 = new es0(u62Var, r62.v, null, u62.d, Collections.EMPTY_LIST, ((ya1) this.e).b(new s22(3, new vg2(this, 18, tx0Var))));
                es0 es0VarA = ((u62) es0Var2.k).a(es0Var2.y(), r62.w);
                return new es0((u62) es0VarA.k, es0VarA.f, (String) es0VarA.g, (hp) es0VarA.h, (List) es0VarA.i, na1.L((hp) es0VarA.j, new g41(1, na1.t(of1Var.J())), za1.g)).y();
        }
    }

    public mx1(Context context, pf1 pf1Var, u62 u62Var, ya1 ya1Var, ux0 ux0Var) {
        this.b = context;
        this.c = pf1Var;
        this.f = u62Var;
        this.e = ya1Var;
        this.d = ux0Var;
    }
}
