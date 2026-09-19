package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes.dex */
public final class ef2 extends pf2 {
    public final /* synthetic */ int f = 3;
    public final Object g;
    public final Object h;

    public ef2(hp0 hp0Var, cf2 cf2Var, DisplayMetrics displayMetrics, View view, dh2 dh2Var) {
        super("P6F0ZRwWAQfQFwxv0Pq3Kr7GsgVJK2iuMjcPK+Aq3kgEIqqz95IgzklzBsNVE1/z", "noWWhxc3WlXlb4cqOg7NtD3uZWHj+L+uVXJvY7XilyA=", hp0Var, cf2Var, dh2Var.a(124));
        this.g = displayMetrics;
        this.h = view;
    }

    @Override // defpackage.pf2
    public final void a(Method method, hp0 hp0Var) throws IllegalAccessException, InvocationTargetException {
        switch (this.f) {
            case 0:
                Object[] objArr = (Object[]) method.invoke("", (View) this.h, (Activity) this.g);
                objArr.getClass();
                synchronized (hp0Var) {
                    long jLongValue = ((Long) objArr[0]).longValue();
                    hp0Var.b();
                    ((sp0) hp0Var.g).c0(jLongValue);
                    long jLongValue2 = ((Long) objArr[1]).longValue();
                    hp0Var.b();
                    ((sp0) hp0Var.g).d0(jLongValue2);
                    String str = (String) objArr[2];
                    hp0Var.b();
                    ((sp0) hp0Var.g).e0(str);
                    break;
                }
                return;
            case 1:
                Long lValueOf = -1L;
                try {
                    if (Build.VERSION.SDK_INT >= 30) {
                        Long l = (Long) method.invoke("", (Context) this.g);
                        if (l == null) {
                            throw null;
                        }
                        lValueOf = l;
                    } else {
                        hp hpVar = (hp) ((Map) this.h).get("gs");
                        if (hpVar != null && hpVar.isDone()) {
                            lValueOf = Long.valueOf(((sp0) hpVar.get()).x0());
                        }
                    }
                } catch (InterruptedException | ExecutionException unused) {
                }
                synchronized (hp0Var) {
                    long jLongValue3 = lValueOf.longValue();
                    hp0Var.b();
                    ((sp0) hp0Var.g).b0(jLongValue3);
                    break;
                }
                return;
            case 2:
                Long[] lArr = new Long[9];
                Arrays.fill((Object[]) lArr, (Object) (-1L));
                Map map = (Map) this.g;
                Long l2 = (Long) map.get("tcq");
                if (l2 == null) {
                    l2 = -1L;
                }
                lArr[0] = l2;
                Long l3 = (Long) map.get("tpq");
                if (l3 == null) {
                    l3 = -1L;
                }
                lArr[1] = l3;
                Long l4 = (Long) map.get("tcv");
                if (l4 == null) {
                    l4 = -1L;
                }
                lArr[2] = l4;
                Long l5 = (Long) map.get("tpv");
                if (l5 == null) {
                    l5 = -1L;
                }
                lArr[3] = l5;
                Long l6 = (Long) map.get("tchv");
                if (l6 == null) {
                    l6 = -1L;
                }
                lArr[4] = l6;
                Long l7 = (Long) map.get("tphv");
                if (l7 == null) {
                    l7 = -1L;
                }
                lArr[5] = l7;
                Long l8 = (Long) map.get("tcc");
                if (l8 == null) {
                    l8 = -1L;
                }
                lArr[6] = l8;
                Long l9 = (Long) map.get("tpc");
                if (l9 == null) {
                    l9 = -1L;
                }
                lArr[7] = l9;
                Long l10 = (Long) map.get("tst");
                if (l10 == null) {
                    l10 = -1L;
                }
                lArr[8] = l10;
                for (int i = 0; i < 9; i++) {
                    if (lArr[i] == null) {
                        lArr[i] = -1L;
                    }
                }
                Long[] lArr2 = (Long[]) method.invoke("", lArr, Integer.valueOf(((dd2) this.h).ordinal()));
                lArr2.getClass();
                synchronized (hp0Var) {
                    long jLongValue4 = lArr2[0].longValue();
                    hp0Var.b();
                    ((sp0) hp0Var.g).m0(jLongValue4);
                    long jLongValue5 = lArr2[1].longValue();
                    hp0Var.b();
                    ((sp0) hp0Var.g).C(jLongValue5);
                    long jLongValue6 = lArr2[2].longValue();
                    hp0Var.b();
                    ((sp0) hp0Var.g).Q0(jLongValue6);
                    long jLongValue7 = lArr2[3].longValue();
                    hp0Var.b();
                    ((sp0) hp0Var.g).N0(jLongValue7);
                    long jLongValue8 = lArr2[4].longValue();
                    hp0Var.b();
                    ((sp0) hp0Var.g).i0(jLongValue8);
                    long jLongValue9 = lArr2[5].longValue();
                    hp0Var.b();
                    ((sp0) hp0Var.g).j0(jLongValue9);
                    long jLongValue10 = lArr2[6].longValue();
                    hp0Var.b();
                    ((sp0) hp0Var.g).P(jLongValue10);
                    long jLongValue11 = lArr2[7].longValue();
                    hp0Var.b();
                    ((sp0) hp0Var.g).Q(jLongValue11);
                    break;
                }
                return;
            default:
                View view = (View) this.h;
                if (view == null) {
                    return;
                }
                Object objInvoke = method.invoke("", (DisplayMetrics) this.g, view);
                objInvoke.getClass();
                Long[] lArr3 = (Long[]) objInvoke;
                qp0 qp0VarZ = rp0.z();
                long jLongValue12 = lArr3[2].longValue();
                qp0VarZ.b();
                ((rp0) qp0VarZ.g).B(jLongValue12);
                long jLongValue13 = lArr3[1].longValue();
                qp0VarZ.b();
                ((rp0) qp0VarZ.g).C(jLongValue13);
                long jLongValue14 = lArr3[0].longValue();
                qp0VarZ.b();
                ((rp0) qp0VarZ.g).D(jLongValue14);
                long jLongValue15 = lArr3[3].longValue();
                qp0VarZ.b();
                ((rp0) qp0VarZ.g).A(jLongValue15);
                long jLongValue16 = lArr3[4].longValue();
                qp0VarZ.b();
                ((rp0) qp0VarZ.g).E(jLongValue16);
                rp0 rp0Var = (rp0) qp0VarZ.c();
                hp0Var.b();
                ((sp0) hp0Var.g).V(rp0Var);
                return;
        }
    }

    public ef2(hp0 hp0Var, cf2 cf2Var, View view, Activity activity, dh2 dh2Var) {
        super("71irZxeyztMVPxtkZNjCXCWzc9uBzzqfxPgw1LkoaIGD1YWtoRaLj8ZtqyMHro2I", "sazFFsabItlse3qDY43b32ZnLCjQJ0+CJQYLaEeKmSw=", hp0Var, cf2Var, dh2Var.a(111));
        this.h = view;
        this.g = activity;
    }

    public ef2(hp0 hp0Var, cf2 cf2Var, Map map, Context context, dh2 dh2Var) {
        super("yl2V2fIFd/+gtM2i3wtw7rRydnC7INCVtpRFdnYEC9BkEYS1KI4o6evRDqm9gjRN", "/ngo8an629JW3IpM1KyGjEthGKpic0JTOThCbrYq6ZE=", hp0Var, cf2Var, dh2Var.a(120));
        this.g = context;
        this.h = map;
    }

    public ef2(hp0 hp0Var, cf2 cf2Var, dd2 dd2Var, Map map, dh2 dh2Var) {
        super("lJ67yAwBUtoZhasVqN11g6g6opAmTxjVxzUKxhl0fOhTr4nQH4cVWV7NJy0RD49z", "0isRm8IoYsyXMQyBCJPbREn4r5FwCMP2Q3k9zoXRqyk=", hp0Var, cf2Var, dh2Var.a(122));
        this.g = map;
        this.h = dd2Var;
    }
}
