package defpackage;

import android.content.Context;
import android.text.TextUtils;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public interface a72 {
    static a72 e(Context context, int i, int i2, f93 f93Var) {
        boolean zMatches;
        a72 a72VarJ = j(context, i);
        if (a72VarJ instanceof b72) {
            b72 b72Var = (b72) a72VarJ;
            b72Var.n();
            b72Var.d(i2);
            b72Var.t(jn.D(f93Var.r));
            String str = f93Var.u;
            if (TextUtils.isEmpty(str)) {
                zMatches = false;
            } else {
                zMatches = Pattern.matches((String) tu0.e.c.a(lx0.w9), str);
            }
            if (zMatches) {
                b72Var.F(str);
            }
        }
        return a72VarJ;
    }

    static a72 j(Context context, int i) {
        boolean zBooleanValue;
        if (e72.a()) {
            int i2 = i - 2;
            if (i2 == 20 || i2 == 21) {
                zBooleanValue = ((Boolean) my0.e.u()).booleanValue();
            } else if (i2 != 110) {
                switch (i2) {
                    case 2:
                    case 3:
                    case 6:
                    case 7:
                    case 8:
                        zBooleanValue = ((Boolean) my0.c.u()).booleanValue();
                        break;
                    case 4:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                        zBooleanValue = ((Boolean) my0.d.u()).booleanValue();
                        break;
                    case 5:
                        zBooleanValue = ((Boolean) my0.b.u()).booleanValue();
                        break;
                }
            } else {
                zBooleanValue = ((Boolean) tu0.e.c.a(lx0.E9)).booleanValue();
            }
            if (zBooleanValue) {
                return new b72(context, i);
            }
        }
        return new q72();
    }

    a72 F(String str);

    a72 a();

    a72 b(boolean z);

    boolean c();

    a72 d(int i);

    a72 f(Throwable th);

    a72 g(fu1 fu1Var);

    a72 h();

    boolean i();

    a72 k(String str);

    a72 l(y91 y91Var);

    c72 m();

    a72 r0(String str);

    a72 t(int i);
}
