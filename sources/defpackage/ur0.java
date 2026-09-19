package defpackage;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ur0 extends js0 {
    public final /* synthetic */ int h = 1;
    public Object i;
    public final Object j;

    public ur0(nr0 nr0Var, hp0 hp0Var, int i, Context context) {
        super(nr0Var, "JC98YOkW1OV00In88Kxh39aoA4/Lc5LugpNahl16Tw21h78xPzCO3AkqsFSMWF+O", "uHu4aeoXgHtmEAr/p8TbphROLjKobmRTgSnNeTPf/24=", hp0Var, i, 31);
        this.i = null;
        this.j = context;
    }

    @Override // defpackage.js0
    public final void a() {
        switch (this.h) {
            case 0:
                View view = (View) this.j;
                if (view == null) {
                    return;
                }
                Boolean bool = (Boolean) tu0.e.c.a(lx0.P2);
                boolean zBooleanValue = bool.booleanValue();
                Object[] objArr = (Object[]) this.e.invoke(null, view, (Activity) this.i, bool);
                hp0 hp0Var = this.d;
                synchronized (hp0Var) {
                    try {
                        long jLongValue = ((Long) objArr[0]).longValue();
                        hp0Var.b();
                        ((sp0) hp0Var.g).c0(jLongValue);
                        long jLongValue2 = ((Long) objArr[1]).longValue();
                        hp0Var.b();
                        ((sp0) hp0Var.g).d0(jLongValue2);
                        if (zBooleanValue) {
                            String str = (String) objArr[2];
                            hp0Var.b();
                            ((sp0) hp0Var.g).e0(str);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return;
            default:
                hp0 hp0Var2 = this.d;
                hp0Var2.b();
                ((sp0) hp0Var2.g).A(-1L);
                hp0Var2.b();
                ((sp0) hp0Var2.g).B(-1L);
                Context context = (Context) this.j;
                if (context == null) {
                    context = this.a.a;
                }
                if (((List) this.i) == null) {
                    this.i = (List) this.e.invoke(null, context);
                }
                List list = (List) this.i;
                if (list == null || list.size() != 2) {
                    return;
                }
                synchronized (hp0Var2) {
                    long jLongValue3 = ((Long) ((List) this.i).get(0)).longValue();
                    hp0Var2.b();
                    ((sp0) hp0Var2.g).A(jLongValue3);
                    long jLongValue4 = ((Long) ((List) this.i).get(1)).longValue();
                    hp0Var2.b();
                    ((sp0) hp0Var2.g).B(jLongValue4);
                    break;
                }
                return;
        }
    }

    public ur0(nr0 nr0Var, hp0 hp0Var, int i, View view, Activity activity) {
        super(nr0Var, "YJMz4lZ/SFOXN6kW19UKnvAqcLtndNv4f6er9d24/5MuXcrsMTIC+9Jfbhpe2HMW", "6iuDHA2XEqaGCIdpenyLvoYWzHjKpoW5EjYN40bz5Cs=", hp0Var, i, 62);
        this.j = view;
        this.i = activity;
    }
}
