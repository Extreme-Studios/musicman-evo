package defpackage;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public abstract class o80 extends v80 {
    public static boolean i = false;
    public static Method j;
    public static Class k;
    public static Field l;
    public static Field m;
    public final WindowInsets c;
    public gn[] d;
    public gn e;
    public y80 f;
    public gn g;
    public int h;

    public o80(y80 y80Var, WindowInsets windowInsets) {
        super(y80Var);
        this.e = null;
        this.c = windowInsets;
    }

    @SuppressLint({"WrongConstant"})
    private gn s(int i2, boolean z) {
        gn gnVarA = gn.e;
        for (int i3 = 1; i3 <= 512; i3 <<= 1) {
            if ((i2 & i3) != 0) {
                gn gnVarT = t(i3, z);
                gnVarA = gn.a(Math.max(gnVarA.a, gnVarT.a), Math.max(gnVarA.b, gnVarT.b), Math.max(gnVarA.c, gnVarT.c), Math.max(gnVarA.d, gnVarT.d));
            }
        }
        return gnVarA;
    }

    private gn u() {
        y80 y80Var = this.f;
        return y80Var != null ? y80Var.a.h() : gn.e;
    }

    private gn v(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
        }
        if (!i) {
            w();
        }
        Method method = j;
        if (method != null && k != null && l != null) {
            try {
                Object objInvoke = method.invoke(view, null);
                if (objInvoke == null) {
                    Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                    return null;
                }
                Rect rect = (Rect) l.get(m.get(objInvoke));
                if (rect != null) {
                    return gn.a(rect.left, rect.top, rect.right, rect.bottom);
                }
                return null;
            } catch (ReflectiveOperationException e) {
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e.getMessage(), e);
            }
        }
        return null;
    }

    @SuppressLint({"PrivateApi"})
    private static void w() {
        try {
            j = View.class.getDeclaredMethod("getViewRootImpl", null);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            k = cls;
            l = cls.getDeclaredField("mVisibleInsets");
            m = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
            l.setAccessible(true);
            m.setAccessible(true);
        } catch (ReflectiveOperationException e) {
            Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e.getMessage(), e);
        }
        i = true;
    }

    public static boolean y(int i2, int i3) {
        return (i2 & 6) == (i3 & 6);
    }

    @Override // defpackage.v80
    public void d(View view) {
        gn gnVarV = v(view);
        if (gnVarV == null) {
            gnVarV = gn.e;
        }
        x(gnVarV);
    }

    @Override // defpackage.v80
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        o80 o80Var = (o80) obj;
        return Objects.equals(this.g, o80Var.g) && y(this.h, o80Var.h);
    }

    @Override // defpackage.v80
    public gn f(int i2) {
        return s(i2, false);
    }

    @Override // defpackage.v80
    public final gn j() {
        if (this.e == null) {
            WindowInsets windowInsets = this.c;
            this.e = gn.a(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return this.e;
    }

    @Override // defpackage.v80
    public y80 l(int i2, int i3, int i4, int i5) {
        n80 j80Var;
        y80 y80VarC = y80.c(this.c, null);
        int i6 = Build.VERSION.SDK_INT;
        if (i6 >= 34) {
            j80Var = new m80(y80VarC);
        } else if (i6 >= 31) {
            j80Var = new l80(y80VarC);
        } else if (i6 >= 30) {
            j80Var = new k80(y80VarC);
        } else {
            j80Var = i6 >= 29 ? new j80(y80VarC) : new h80(y80VarC);
        }
        j80Var.d(y80.a(j(), i2, i3, i4, i5));
        j80Var.c(y80.a(h(), i2, i3, i4, i5));
        return j80Var.b();
    }

    @Override // defpackage.v80
    public boolean n() {
        return this.c.isRound();
    }

    @Override // defpackage.v80
    public void o(gn[] gnVarArr) {
        this.d = gnVarArr;
    }

    @Override // defpackage.v80
    public void p(y80 y80Var) {
        this.f = y80Var;
    }

    @Override // defpackage.v80
    public void r(int i2) {
        this.h = i2;
    }

    public gn t(int i2, boolean z) {
        gn gnVarH;
        int i3;
        gn gnVar = gn.e;
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 == 8) {
                    gn[] gnVarArr = this.d;
                    gnVarH = gnVarArr != null ? gnVarArr[3] : null;
                    if (gnVarH != null) {
                        return gnVarH;
                    }
                    gn gnVarJ = j();
                    gn gnVarU = u();
                    int i4 = gnVarJ.d;
                    if (i4 > gnVarU.d) {
                        return gn.a(0, 0, 0, i4);
                    }
                    gn gnVar2 = this.g;
                    if (gnVar2 != null && !gnVar2.equals(gnVar) && (i3 = this.g.d) > gnVarU.d) {
                        return gn.a(0, 0, 0, i3);
                    }
                } else {
                    if (i2 == 16) {
                        return i();
                    }
                    if (i2 == 32) {
                        return g();
                    }
                    if (i2 == 64) {
                        return k();
                    }
                    if (i2 == 128) {
                        y80 y80Var = this.f;
                        kf kfVarE = y80Var != null ? y80Var.a.e() : e();
                        if (kfVarE != null) {
                            int i5 = Build.VERSION.SDK_INT;
                            return gn.a(i5 >= 28 ? pe.g(kfVarE.a) : 0, i5 >= 28 ? pe.i(kfVarE.a) : 0, i5 >= 28 ? pe.h(kfVarE.a) : 0, i5 >= 28 ? pe.f(kfVarE.a) : 0);
                        }
                    }
                }
            } else {
                if (z) {
                    gn gnVarU2 = u();
                    gn gnVarH2 = h();
                    return gn.a(Math.max(gnVarU2.a, gnVarH2.a), 0, Math.max(gnVarU2.c, gnVarH2.c), Math.max(gnVarU2.d, gnVarH2.d));
                }
                if ((this.h & 2) == 0) {
                    gn gnVarJ2 = j();
                    y80 y80Var2 = this.f;
                    gnVarH = y80Var2 != null ? y80Var2.a.h() : null;
                    int iMin = gnVarJ2.d;
                    if (gnVarH != null) {
                        iMin = Math.min(iMin, gnVarH.d);
                    }
                    return gn.a(gnVarJ2.a, 0, gnVarJ2.c, iMin);
                }
            }
        } else {
            if (z) {
                return gn.a(0, Math.max(u().b, j().b), 0, 0);
            }
            if ((this.h & 4) == 0) {
                return gn.a(0, j().b, 0, 0);
            }
        }
        return gnVar;
    }

    public void x(gn gnVar) {
        this.g = gnVar;
    }
}
