package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.TypedValue;
import com.extremestudios.musicmanevo.R;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class kx {
    public static kx g;
    public WeakHashMap a;
    public final WeakHashMap b = new WeakHashMap(0);
    public TypedValue c;
    public boolean d;
    public es0 e;
    public static final PorterDuff.Mode f = PorterDuff.Mode.SRC_IN;
    public static final jx h = new jx(6);

    public static synchronized kx c() {
        try {
            if (g == null) {
                g = new kx();
            }
        } catch (Throwable th) {
            throw th;
        }
        return g;
    }

    public static synchronized PorterDuffColorFilter f(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        jx jxVar = h;
        jxVar.getClass();
        int i2 = (31 + i) * 31;
        porterDuffColorFilter = (PorterDuffColorFilter) jxVar.a(Integer.valueOf(mode.hashCode() + i2));
        if (porterDuffColorFilter == null) {
            porterDuffColorFilter = new PorterDuffColorFilter(i, mode);
        }
        return porterDuffColorFilter;
    }

    public final void a(Context context, int i, ColorStateList colorStateList) {
        if (this.a == null) {
            this.a = new WeakHashMap();
        }
        n10 n10Var = (n10) this.a.get(context);
        if (n10Var == null) {
            n10Var = new n10();
            this.a.put(context, n10Var);
        }
        int i2 = n10Var.h;
        if (i2 != 0) {
            int[] iArr = n10Var.f;
            if (i <= iArr[i2 - 1]) {
                int iC = rs0.c(i2, i, iArr);
                if (iC >= 0) {
                    n10Var.g[iC] = colorStateList;
                    return;
                }
                int i3 = ~iC;
                int i4 = n10Var.h;
                if (i3 < i4) {
                    Object[] objArr = n10Var.g;
                    if (objArr[i3] == v51.h) {
                        n10Var.f[i3] = i;
                        objArr[i3] = colorStateList;
                        return;
                    }
                }
                if (i4 >= n10Var.f.length) {
                    int i5 = (i4 + 1) * 4;
                    for (int i6 = 4; i6 < 32; i6++) {
                        int i7 = (1 << i6) - 12;
                        if (i5 <= i7) {
                            i5 = i7;
                            break;
                        }
                    }
                    int i8 = i5 / 4;
                    n10Var.f = Arrays.copyOf(n10Var.f, i8);
                    n10Var.g = Arrays.copyOf(n10Var.g, i8);
                }
                int i9 = n10Var.h;
                if (i9 - i3 != 0) {
                    int[] iArr2 = n10Var.f;
                    int i10 = i3 + 1;
                    o7.a1(i10, i3, i9, iArr2, iArr2);
                    Object[] objArr2 = n10Var.g;
                    o7.b1(i10, i3, n10Var.h, objArr2, objArr2);
                }
                n10Var.f[i3] = i;
                n10Var.g[i3] = colorStateList;
                n10Var.h++;
                return;
            }
        }
        if (i2 >= n10Var.f.length) {
            int i11 = (i2 + 1) * 4;
            for (int i12 = 4; i12 < 32; i12++) {
                int i13 = (1 << i12) - 12;
                if (i11 <= i13) {
                    i11 = i13;
                    break;
                }
            }
            int i14 = i11 / 4;
            n10Var.f = Arrays.copyOf(n10Var.f, i14);
            n10Var.g = Arrays.copyOf(n10Var.g, i14);
        }
        n10Var.f[i2] = i;
        n10Var.g[i2] = colorStateList;
        n10Var.h = i2 + 1;
    }

    public final Drawable b(Context context, int i) {
        LayerDrawable layerDrawableD;
        Object obj;
        Drawable drawableNewDrawable;
        int i2;
        if (this.c == null) {
            this.c = new TypedValue();
        }
        TypedValue typedValue = this.c;
        context.getResources().getValue(i, typedValue, true);
        long j = (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
        synchronized (this) {
            zp zpVar = (zp) this.b.get(context);
            layerDrawableD = null;
            if (zpVar != null) {
                int iD = rs0.d(zpVar.g, zpVar.i, j);
                if (iD < 0 || (obj = zpVar.h[iD]) == a23.f) {
                    obj = null;
                }
                WeakReference weakReference = (WeakReference) obj;
                if (weakReference != null) {
                    Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
                    if (constantState != null) {
                        drawableNewDrawable = constantState.newDrawable(context.getResources());
                    } else {
                        int iD2 = rs0.d(zpVar.g, zpVar.i, j);
                        if (iD2 >= 0) {
                            Object[] objArr = zpVar.h;
                            Object obj2 = objArr[iD2];
                            Object obj3 = a23.f;
                            if (obj2 != obj3) {
                                objArr[iD2] = obj3;
                                zpVar.f = true;
                            }
                        }
                    }
                }
            }
            drawableNewDrawable = null;
        }
        if (drawableNewDrawable != null) {
            return drawableNewDrawable;
        }
        if (this.e != null) {
            if (i == R.drawable.abc_cab_background_top_material) {
                layerDrawableD = new LayerDrawable(new Drawable[]{d(context, R.drawable.abc_cab_background_internal_bg), d(context, R.drawable.abc_cab_background_top_mtrl_alpha)});
            } else if (i == R.drawable.abc_ratingbar_material) {
                layerDrawableD = es0.d(this, context, R.dimen.abc_star_big);
            } else if (i == R.drawable.abc_ratingbar_indicator_material) {
                layerDrawableD = es0.d(this, context, R.dimen.abc_star_medium);
            } else if (i == R.drawable.abc_ratingbar_small_material) {
                layerDrawableD = es0.d(this, context, R.dimen.abc_star_small);
            }
        }
        if (layerDrawableD == null) {
            return layerDrawableD;
        }
        layerDrawableD.setChangingConfigurations(typedValue.changingConfigurations);
        synchronized (this) {
            try {
                Drawable.ConstantState constantState2 = layerDrawableD.getConstantState();
                if (constantState2 == null) {
                    return layerDrawableD;
                }
                zp zpVar2 = (zp) this.b.get(context);
                if (zpVar2 == null) {
                    zpVar2 = new zp();
                    int i3 = 4;
                    while (true) {
                        i2 = 80;
                        if (i3 >= 32) {
                            break;
                        }
                        int i4 = (1 << i3) - 12;
                        if (80 <= i4) {
                            i2 = i4;
                            break;
                        }
                        i3++;
                    }
                    int i5 = i2 / 8;
                    zpVar2.g = new long[i5];
                    zpVar2.h = new Object[i5];
                    this.b.put(context, zpVar2);
                }
                zpVar2.a(j, new WeakReference(constantState2));
                return layerDrawableD;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized Drawable d(Context context, int i) {
        return e(context, i, false);
    }

    public final synchronized Drawable e(Context context, int i, boolean z) {
        Drawable drawableB;
        try {
            if (!this.d) {
                this.d = true;
                Drawable drawableD = d(context, R.drawable.abc_vector_test);
                if (drawableD == null || (!(drawableD instanceof y50) && !"android.graphics.drawable.VectorDrawable".equals(drawableD.getClass().getName()))) {
                    this.d = false;
                    throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
                }
            }
            drawableB = b(context, i);
            if (drawableB == null) {
                drawableB = context.getDrawable(i);
            }
            if (drawableB != null) {
                drawableB = h(context, i, z, drawableB);
            }
            if (drawableB != null) {
                sf.a(drawableB);
            }
        } catch (Throwable th) {
            throw th;
        }
        return drawableB;
    }

    public final synchronized ColorStateList g(Context context, int i) {
        ColorStateList colorStateList;
        n10 n10Var;
        Object obj;
        WeakHashMap weakHashMap = this.a;
        ColorStateList colorStateListE = null;
        if (weakHashMap == null || (n10Var = (n10) weakHashMap.get(context)) == null) {
            colorStateList = null;
        } else {
            int iC = rs0.c(n10Var.h, i, n10Var.f);
            if (iC < 0 || (obj = n10Var.g[iC]) == v51.h) {
                obj = null;
            }
            colorStateList = (ColorStateList) obj;
        }
        if (colorStateList == null) {
            es0 es0Var = this.e;
            if (es0Var != null) {
                colorStateListE = es0Var.e(context, i);
            }
            if (colorStateListE != null) {
                a(context, i, colorStateListE);
            }
            colorStateList = colorStateListE;
        }
        return colorStateList;
    }

    public final Drawable h(Context context, int i, boolean z, Drawable drawable) {
        boolean z2;
        int iRound;
        PorterDuffColorFilter porterDuffColorFilterF;
        ColorStateList colorStateListG = g(context, i);
        PorterDuff.Mode mode = null;
        if (colorStateListG != null) {
            Drawable drawableMutate = drawable.mutate();
            drawableMutate.setTintList(colorStateListG);
            if (this.e != null && i == R.drawable.abc_switch_thumb_material) {
                mode = PorterDuff.Mode.MULTIPLY;
            }
            if (mode != null) {
                drawableMutate.setTintMode(mode);
            }
            return drawableMutate;
        }
        es0 es0Var = this.e;
        int i2 = R.attr.colorControlNormal;
        if (es0Var != null) {
            if (i == R.drawable.abc_seekbar_track_material) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                Drawable drawableFindDrawableByLayerId = layerDrawable.findDrawableByLayerId(android.R.id.background);
                int iC = t30.c(context, R.attr.colorControlNormal);
                PorterDuff.Mode mode2 = e5.b;
                es0.g(drawableFindDrawableByLayerId, iC, mode2);
                es0.g(layerDrawable.findDrawableByLayerId(android.R.id.secondaryProgress), t30.c(context, R.attr.colorControlNormal), mode2);
                es0.g(layerDrawable.findDrawableByLayerId(android.R.id.progress), t30.c(context, R.attr.colorControlActivated), mode2);
                return drawable;
            }
            if (i == R.drawable.abc_ratingbar_material || i == R.drawable.abc_ratingbar_indicator_material || i == R.drawable.abc_ratingbar_small_material) {
                LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
                Drawable drawableFindDrawableByLayerId2 = layerDrawable2.findDrawableByLayerId(android.R.id.background);
                int iB = t30.b(context, R.attr.colorControlNormal);
                PorterDuff.Mode mode3 = e5.b;
                es0.g(drawableFindDrawableByLayerId2, iB, mode3);
                es0.g(layerDrawable2.findDrawableByLayerId(android.R.id.secondaryProgress), t30.c(context, R.attr.colorControlActivated), mode3);
                es0.g(layerDrawable2.findDrawableByLayerId(android.R.id.progress), t30.c(context, R.attr.colorControlActivated), mode3);
                return drawable;
            }
        }
        es0 es0Var2 = this.e;
        boolean z3 = false;
        if (es0Var2 != null) {
            PorterDuff.Mode mode4 = e5.b;
            if (es0.a((int[]) es0Var2.f, i)) {
                z2 = true;
                iRound = -1;
            } else {
                if (es0.a((int[]) es0Var2.h, i)) {
                    i2 = R.attr.colorControlActivated;
                } else {
                    boolean zA = es0.a((int[]) es0Var2.i, i);
                    i2 = android.R.attr.colorBackground;
                    if (zA) {
                        mode4 = PorterDuff.Mode.MULTIPLY;
                    } else if (i == R.drawable.abc_list_divider_mtrl_alpha) {
                        iRound = Math.round(40.8f);
                        i2 = android.R.attr.colorForeground;
                        z2 = true;
                    } else {
                        if (i != R.drawable.abc_dialog_material_background) {
                            z2 = false;
                            i2 = 0;
                        }
                        iRound = -1;
                    }
                }
                z2 = true;
                iRound = -1;
            }
            if (z2) {
                Drawable drawableMutate2 = drawable.mutate();
                int iC2 = t30.c(context, i2);
                synchronized (e5.class) {
                    porterDuffColorFilterF = f(iC2, mode4);
                }
                drawableMutate2.setColorFilter(porterDuffColorFilterF);
                if (iRound != -1) {
                    drawableMutate2.setAlpha(iRound);
                }
                z3 = true;
            }
        }
        if (z3 || !z) {
            return drawable;
        }
        return null;
    }
}
