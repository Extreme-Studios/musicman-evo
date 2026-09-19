package defpackage;

import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.util.AndroidRuntimeException;
import android.util.Log;
import android.util.StateSet;
import android.view.Choreographer;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class rq extends Drawable implements l00 {
    public static final Paint J;
    public static final qq[] K;
    public final RectF A;
    public final boolean B;
    public boolean C;
    public a00 D;
    public r10 E;
    public final q10[] F;
    public float[] G;
    public float[] H;
    public an I;
    public final oc2 f;
    public pq g;
    public final j00[] h;
    public final j00[] i;
    public final BitSet j;
    public boolean k;
    public boolean l;
    public final Matrix m;
    public final Path n;
    public final Path o;
    public final RectF p;
    public final RectF q;
    public final Region r;
    public final Region s;
    public final Paint t;
    public final Paint u;
    public final yz v;
    public final zx w;
    public final c00 x;
    public PorterDuffColorFilter y;
    public PorterDuffColorFilter z;

    static {
        Paint paint = new Paint(1);
        J = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        K = new qq[4];
        int i = 0;
        while (true) {
            qq[] qqVarArr = K;
            if (i >= qqVarArr.length) {
                return;
            }
            qqVarArr[i] = new qq(i);
            i++;
        }
    }

    public rq(pq pqVar) {
        this.f = new oc2(4, this);
        this.h = new j00[4];
        this.i = new j00[4];
        this.j = new BitSet(8);
        this.m = new Matrix();
        this.n = new Path();
        this.o = new Path();
        this.p = new RectF();
        this.q = new RectF();
        this.r = new Region();
        this.s = new Region();
        Paint paint = new Paint(1);
        this.t = paint;
        Paint paint2 = new Paint(1);
        this.u = paint2;
        this.v = new yz();
        this.x = Looper.getMainLooper().getThread() == Thread.currentThread() ? b00.a : new c00();
        this.A = new RectF();
        this.B = true;
        this.C = true;
        this.F = new q10[4];
        this.g = pqVar;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        l();
        j(getState());
        this.w = new zx(6, this);
    }

    public static float b(RectF rectF, a00 a00Var, float[] fArr) {
        if (fArr == null) {
            if (a00Var.e(rectF)) {
                return a00Var.e.a(rectF);
            }
            return -1.0f;
        }
        if (fArr.length > 1) {
            float f = fArr[0];
            for (int i = 1; i < fArr.length; i++) {
                if (fArr[i] != f) {
                    return -1.0f;
                }
            }
        }
        if (a00Var.d()) {
            return fArr[0];
        }
        return -1.0f;
    }

    public final void a(RectF rectF, Path path) {
        pq pqVar = this.g;
        this.x.a(pqVar.a, this.G, pqVar.j, rectF, this.w, path);
        if (this.g.i != 1.0f) {
            Matrix matrix = this.m;
            matrix.reset();
            float f = this.g.i;
            matrix.setScale(f, f, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(matrix);
        }
        path.computeBounds(this.A, true);
    }

    public final int c(int i) {
        int i2;
        pq pqVar = this.g;
        float f = pqVar.n + 0.0f + pqVar.m;
        kg kgVar = pqVar.c;
        if (kgVar == null || !kgVar.a || fa.d(i, 255) != kgVar.d) {
            return i;
        }
        float f2 = kgVar.e;
        float fMin = (f2 <= 0.0f || f <= 0.0f) ? 0.0f : Math.min(((((float) Math.log1p(f / f2)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
        int iAlpha = Color.alpha(i);
        int iM = i8.m(fMin, fa.d(i, 255), kgVar.b);
        if (fMin > 0.0f && (i2 = kgVar.c) != 0) {
            iM = fa.b(fa.d(i2, kg.f), iM);
        }
        return fa.d(iM, iAlpha);
    }

    public final void d(Canvas canvas) {
        if (this.j.cardinality() > 0) {
            Log.w("rq", "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        int i = this.g.p;
        Path path = this.n;
        yz yzVar = this.v;
        if (i != 0) {
            canvas.drawPath(path, yzVar.a);
        }
        for (int i2 = 0; i2 < 4; i2++) {
            j00 j00Var = this.h[i2];
            int i3 = this.g.o;
            Matrix matrix = j00.b;
            j00Var.a(matrix, yzVar, i3, canvas);
            this.i[i2].a(matrix, yzVar, this.g.o, canvas);
        }
        if (this.B) {
            int iSin = (int) (Math.sin(Math.toRadians(0.0d)) * ((double) this.g.p));
            int iCos = (int) (Math.cos(Math.toRadians(0.0d)) * ((double) this.g.p));
            canvas.translate(-iSin, -iCos);
            canvas.drawPath(path, J);
            canvas.translate(iSin, iCos);
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0092  */
    /* JADX WARN: Code duplicated, block: B:30:0x0098  */
    /* JADX WARN: Code duplicated, block: B:34:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:35:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:37:0x00f4 A[ADDED_TO_REGION] */
    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int iWidth;
        Path path;
        PorterDuffColorFilter porterDuffColorFilter = this.y;
        Paint paint = this.t;
        paint.setColorFilter(porterDuffColorFilter);
        int alpha = paint.getAlpha();
        int i = this.g.l;
        paint.setAlpha(((i + (i >>> 7)) * alpha) >>> 8);
        PorterDuffColorFilter porterDuffColorFilter2 = this.z;
        Paint paint2 = this.u;
        paint2.setColorFilter(porterDuffColorFilter2);
        paint2.setStrokeWidth(this.g.k);
        int alpha2 = paint2.getAlpha();
        int i2 = this.g.l;
        paint2.setAlpha(((i2 + (i2 >>> 7)) * alpha2) >>> 8);
        Paint.Style style = this.g.q;
        if (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.FILL) {
            boolean z = this.k;
            Path path2 = this.n;
            if (z) {
                a(e(), path2);
                this.k = false;
            }
            pq pqVar = this.g;
            pqVar.getClass();
            if (pqVar.o > 0 && !pqVar.a.e(e())) {
                float[] fArr = this.G;
                if (fArr != null) {
                    int i3 = 1;
                    if (fArr.length > 1) {
                        float f = fArr[0];
                        while (true) {
                            if (i3 < fArr.length) {
                                if (fArr[i3] == f) {
                                    i3++;
                                }
                            } else if (!this.g.a.d()) {
                            }
                            if (!path2.isConvex()) {
                                canvas.save();
                                canvas.translate((int) (((double) this.g.p) * Math.sin(Math.toRadians(0.0d))), (int) (Math.cos(Math.toRadians(0.0d)) * ((double) this.g.p)));
                                if (!this.B) {
                                    RectF rectF = this.A;
                                    iWidth = (int) (rectF.width() - getBounds().width());
                                    int iHeight = (int) (rectF.height() - getBounds().height());
                                    if (iWidth >= 0) {
                                    }
                                    j7.e("Invalid shadow bounds. Check that the treatments result in a valid path.");
                                    return;
                                }
                                d(canvas);
                                canvas.restore();
                            }
                        }
                    } else if (!this.g.a.d()) {
                        if (!path2.isConvex() && Build.VERSION.SDK_INT < 29) {
                            canvas.save();
                            canvas.translate((int) (((double) this.g.p) * Math.sin(Math.toRadians(0.0d))), (int) (Math.cos(Math.toRadians(0.0d)) * ((double) this.g.p)));
                            if (!this.B) {
                                d(canvas);
                                canvas.restore();
                            } else {
                                RectF rectF2 = this.A;
                                iWidth = (int) (rectF2.width() - getBounds().width());
                                int iHeight2 = (int) (rectF2.height() - getBounds().height());
                                if (iWidth >= 0 || iHeight2 < 0) {
                                    j7.e("Invalid shadow bounds. Check that the treatments result in a valid path.");
                                    return;
                                }
                                Bitmap bitmapCreateBitmap = Bitmap.createBitmap((this.g.o * 2) + ((int) rectF2.width()) + iWidth, (this.g.o * 2) + ((int) rectF2.height()) + iHeight2, Bitmap.Config.ARGB_8888);
                                Canvas canvas2 = new Canvas(bitmapCreateBitmap);
                                float f2 = (getBounds().left - this.g.o) - iWidth;
                                float f3 = (getBounds().top - this.g.o) - iHeight2;
                                canvas2.translate(-f2, -f3);
                                d(canvas2);
                                canvas.drawBitmap(bitmapCreateBitmap, f2, f3, (Paint) null);
                                bitmapCreateBitmap.recycle();
                                canvas.restore();
                            }
                        }
                    }
                } else if (!path2.isConvex()) {
                    canvas.save();
                    canvas.translate((int) (((double) this.g.p) * Math.sin(Math.toRadians(0.0d))), (int) (Math.cos(Math.toRadians(0.0d)) * ((double) this.g.p)));
                    if (!this.B) {
                        RectF rectF3 = this.A;
                        iWidth = (int) (rectF3.width() - getBounds().width());
                        int iHeight3 = (int) (rectF3.height() - getBounds().height());
                        if (iWidth >= 0) {
                        }
                        j7.e("Invalid shadow bounds. Check that the treatments result in a valid path.");
                        return;
                    }
                    d(canvas);
                    canvas.restore();
                }
            }
            a00 a00Var = this.g.a;
            float[] fArr2 = this.G;
            RectF rectFE = e();
            float fB = b(rectFE, a00Var, fArr2);
            if (fB >= 0.0f) {
                float f4 = fB * this.g.j;
                canvas.drawRoundRect(rectFE, f4, f4, paint);
            } else {
                canvas.drawPath(path2, paint);
            }
        }
        if (g()) {
            boolean z2 = this.l;
            RectF rectF4 = this.q;
            Path path3 = this.o;
            if (z2) {
                a00 a00Var2 = this.g.a;
                zz zzVarF = a00Var2.f();
                dc dcVar = a00Var2.e;
                oc2 oc2Var = this.f;
                zzVarF.e = oc2Var.k(dcVar);
                zzVarF.f = oc2Var.k(a00Var2.f);
                zzVarF.h = oc2Var.k(a00Var2.h);
                zzVarF.g = oc2Var.k(a00Var2.g);
                this.D = zzVarF.a();
                float[] fArr3 = this.G;
                if (fArr3 != null) {
                    if (this.H == null) {
                        this.H = new float[fArr3.length];
                    }
                    float f5 = f();
                    int i4 = 0;
                    while (true) {
                        float[] fArr4 = this.G;
                        if (i4 >= fArr4.length) {
                            break;
                        }
                        this.H[i4] = Math.max(0.0f, fArr4[i4] - f5);
                        i4++;
                    }
                } else {
                    this.H = null;
                }
                a00 a00Var3 = this.D;
                float[] fArr5 = this.H;
                float f6 = this.g.j;
                rectF4.set(e());
                float f7 = f();
                rectF4.inset(f7, f7);
                this.x.a(a00Var3, fArr5, f6, rectF4, null, path3);
                path = path3;
                this.l = false;
            } else {
                path = path3;
            }
            a00 a00Var4 = this.D;
            float[] fArr6 = this.H;
            rectF4.set(e());
            float f8 = f();
            rectF4.inset(f8, f8);
            float fB2 = b(rectF4, a00Var4, fArr6);
            if (fB2 >= 0.0f) {
                float f9 = fB2 * this.g.j;
                canvas.drawRoundRect(rectF4, f9, f9, paint2);
            } else {
                canvas.drawPath(path, paint2);
            }
        }
        paint.setAlpha(alpha);
        paint2.setAlpha(alpha2);
    }

    public final RectF e() {
        Rect bounds = getBounds();
        RectF rectF = this.p;
        rectF.set(bounds);
        return rectF;
    }

    public final float f() {
        if (g()) {
            return this.u.getStrokeWidth() / 2.0f;
        }
        return 0.0f;
    }

    public final boolean g() {
        Paint.Style style = this.g.q;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.u.getStrokeWidth() > 0.0f;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.g.l;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.g;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        this.g.getClass();
        RectF rectFE = e();
        if (rectFE.isEmpty()) {
            return;
        }
        float fB = b(rectFE, this.g.a, this.G);
        if (fB >= 0.0f) {
            outline.setRoundRect(getBounds(), fB * this.g.j);
            return;
        }
        boolean z = this.k;
        Path path = this.n;
        if (z) {
            a(rectFE, path);
            this.k = false;
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            rf.a(outline, path);
            return;
        }
        if (i >= 29) {
            try {
                qf.a(outline, path);
            } catch (IllegalArgumentException unused) {
            }
        } else if (path.isConvex()) {
            qf.a(outline, path);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        Rect rect2 = this.g.h;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        Rect bounds = getBounds();
        Region region = this.r;
        region.set(bounds);
        RectF rectFE = e();
        Path path = this.n;
        a(rectFE, path);
        Region region2 = this.s;
        region2.setPath(path, region);
        region.op(region2, Region.Op.DIFFERENCE);
        return region;
    }

    public final void h(r10 r10Var) {
        if (this.E == r10Var) {
            return;
        }
        this.E = r10Var;
        int i = 0;
        while (true) {
            q10[] q10VarArr = this.F;
            if (i >= q10VarArr.length) {
                k(getState(), true);
                invalidateSelf();
                return;
            }
            if (q10VarArr[i] == null) {
                q10VarArr[i] = new q10(this, K[i]);
            }
            q10 q10Var = q10VarArr[i];
            r10 r10Var2 = new r10();
            float f = (float) r10Var.b;
            if (f < 0.0f) {
                j7.p("Damping ratio must be non-negative");
                return;
            }
            r10Var2.b = f;
            r10Var2.c = false;
            double d = r10Var.a;
            float f2 = (float) (d * d);
            if (f2 <= 0.0f) {
                j7.p("Spring stiffness constant must be positive.");
                return;
            }
            r10Var2.a = Math.sqrt(f2);
            r10Var2.c = false;
            q10Var.j = r10Var2;
            i++;
        }
    }

    public final void i(a20 a20Var) {
        pq pqVar = this.g;
        if (pqVar.b != a20Var) {
            pqVar.b = a20Var;
            k(getState(), true);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        this.k = true;
        this.l = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        a20 a20Var;
        if (!super.isStateful() && ((colorStateList = this.g.f) == null || !colorStateList.isStateful())) {
            this.g.getClass();
            ColorStateList colorStateList3 = this.g.e;
            if ((colorStateList3 == null || !colorStateList3.isStateful()) && (((colorStateList2 = this.g.d) == null || !colorStateList2.isStateful()) && ((a20Var = this.g.b) == null || a20Var.a <= 1))) {
                return false;
            }
        }
        return true;
    }

    public final boolean j(int[] iArr) {
        boolean z;
        Paint paint;
        int color;
        int colorForState;
        Paint paint2;
        int color2;
        int colorForState2;
        if (this.g.d == null || color2 == (colorForState2 = this.g.d.getColorForState(iArr, (color2 = (paint2 = this.t).getColor())))) {
            z = false;
        } else {
            paint2.setColor(colorForState2);
            z = true;
        }
        if (this.g.e == null || color == (colorForState = this.g.e.getColorForState(iArr, (color = (paint = this.u).getColor())))) {
            return z;
        }
        paint.setColor(colorForState);
        return true;
    }

    /* JADX WARN: Type inference failed for: r9v15, types: [java.lang.Object, o3] */
    public final void k(int[] iArr, boolean z) {
        int i;
        dc dcVar;
        RectF rectFE = e();
        if (this.g.b == null || rectFE.isEmpty()) {
            return;
        }
        int i2 = 0;
        boolean z2 = z | (this.E == null);
        if (this.G == null) {
            this.G = new float[4];
        }
        a20 a20Var = this.g.b;
        int[][] iArr2 = a20Var.c;
        int i3 = a20Var.a;
        int i4 = 0;
        while (true) {
            i = -1;
            if (i4 >= i3) {
                i4 = -1;
                break;
            } else if (StateSet.stateSetMatches(iArr2[i4], iArr)) {
                break;
            } else {
                i4++;
            }
        }
        if (i4 < 0) {
            int[] iArr3 = StateSet.WILD_CARD;
            int[][] iArr4 = a20Var.c;
            for (int i5 = 0; i5 < i3; i5++) {
                if (StateSet.stateSetMatches(iArr4[i5], iArr3)) {
                    i = i5;
                    break;
                }
            }
            i4 = i;
        }
        a00 a00Var = a20Var.d[i4];
        while (i2 < 4) {
            this.x.getClass();
            if (i2 == 1) {
                dcVar = a00Var.g;
            } else if (i2 != 2) {
                dcVar = i2 != 3 ? a00Var.f : a00Var.e;
            } else {
                dcVar = a00Var.h;
            }
            float fA = dcVar.a(rectFE);
            if (z2) {
                this.G[i2] = fA;
            }
            q10[] q10VarArr = this.F;
            q10 q10Var = q10VarArr[i2];
            if (q10Var != null) {
                if (q10Var.e) {
                    q10Var.k = fA;
                } else {
                    if (q10Var.j == null) {
                        q10Var.j = new r10(fA);
                    }
                    r10 r10Var = q10Var.j;
                    double d = fA;
                    r10Var.i = d;
                    double d2 = (float) d;
                    if (d2 > 3.4028234663852886E38d) {
                        throw new UnsupportedOperationException("Final position of the spring cannot be greater than the max value.");
                    }
                    if (d2 < -3.4028234663852886E38d) {
                        throw new UnsupportedOperationException("Final position of the spring cannot be less than the min value.");
                    }
                    double dAbs = Math.abs(q10Var.g * 0.75f);
                    r10Var.d = dAbs;
                    r10Var.e = dAbs * 62.5d;
                    us2 us2Var = q10.a().e;
                    us2Var.getClass();
                    if (Thread.currentThread() != ((Looper) us2Var.h).getThread()) {
                        throw new AndroidRuntimeException("Animations may only be started on the same thread as the animation handler");
                    }
                    boolean z3 = q10Var.e;
                    if (!z3 && !z3) {
                        q10Var.e = true;
                        float fJ = q10Var.d.j(q10Var.c);
                        q10Var.b = fJ;
                        if (fJ > Float.MAX_VALUE || fJ < -3.4028235E38f) {
                            j7.p("Starting value need to be in between min value and max value");
                            return;
                        }
                        q3 q3VarA = q10.a();
                        ArrayList arrayList = q3VarA.b;
                        if (arrayList.size() == 0) {
                            ((Choreographer) q3VarA.e.g).postFrameCallback(new p3(q3VarA.d));
                            if (Build.VERSION.SDK_INT >= 33) {
                                q3VarA.g = ValueAnimator.getDurationScale();
                                if (q3VarA.h == null) {
                                    q3VarA.h = new vg2(q3VarA);
                                }
                                final vg2 vg2Var = q3VarA.h;
                                if (((o3) vg2Var.g) == null) {
                                    ?? r9 = new ValueAnimator.DurationScaleChangeListener() { // from class: o3
                                        @Override // android.animation.ValueAnimator.DurationScaleChangeListener
                                        public final void onChanged(float f) {
                                            ((q3) vg2Var.h).g = f;
                                        }
                                    };
                                    vg2Var.g = r9;
                                    ValueAnimator.registerDurationScaleChangeListener(r9);
                                }
                            }
                        }
                        if (!arrayList.contains(q10Var)) {
                            arrayList.add(q10Var);
                        }
                    }
                }
                if (z2) {
                    q10 q10Var2 = q10VarArr[i2];
                    if (q10Var2.j.b <= 0.0d) {
                        throw new UnsupportedOperationException("Spring animations can only come to an end when there is damping");
                    }
                    us2 us2Var2 = q10.a().e;
                    us2Var2.getClass();
                    if (Thread.currentThread() != ((Looper) us2Var2.h).getThread()) {
                        throw new AndroidRuntimeException("Animations may only be started on the same thread as the animation handler");
                    }
                    if (q10Var2.e) {
                        q10Var2.l = true;
                    }
                } else {
                    continue;
                }
            }
            i2++;
        }
        if (z2) {
            invalidateSelf();
        }
    }

    public final boolean l() {
        PorterDuffColorFilter porterDuffColorFilter;
        PorterDuffColorFilter porterDuffColorFilter2 = this.y;
        PorterDuffColorFilter porterDuffColorFilter3 = this.z;
        pq pqVar = this.g;
        ColorStateList colorStateList = pqVar.f;
        PorterDuff.Mode mode = pqVar.g;
        if (colorStateList == null || mode == null) {
            int color = this.t.getColor();
            int iC = c(color);
            porterDuffColorFilter = iC != color ? new PorterDuffColorFilter(iC, PorterDuff.Mode.SRC_IN) : null;
        } else {
            porterDuffColorFilter = new PorterDuffColorFilter(c(colorStateList.getColorForState(getState(), 0)), mode);
        }
        this.y = porterDuffColorFilter;
        this.g.getClass();
        this.z = null;
        this.g.getClass();
        return (Objects.equals(porterDuffColorFilter2, this.y) && Objects.equals(porterDuffColorFilter3, this.z)) ? false : true;
    }

    public final void m() {
        pq pqVar = this.g;
        float f = pqVar.n + 0.0f;
        pqVar.o = (int) Math.ceil(0.75f * f);
        this.g.p = (int) Math.ceil(f * 0.25f);
        l();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        pq pqVar = this.g;
        pq pqVar2 = new pq();
        pqVar2.d = null;
        pqVar2.e = null;
        pqVar2.f = null;
        pqVar2.g = PorterDuff.Mode.SRC_IN;
        pqVar2.h = null;
        pqVar2.i = 1.0f;
        pqVar2.j = 1.0f;
        pqVar2.l = 255;
        pqVar2.m = 0.0f;
        pqVar2.n = 0.0f;
        pqVar2.o = 0;
        pqVar2.p = 0;
        pqVar2.q = Paint.Style.FILL_AND_STROKE;
        pqVar2.a = pqVar.a;
        pqVar2.b = pqVar.b;
        pqVar2.c = pqVar.c;
        pqVar2.k = pqVar.k;
        pqVar2.d = pqVar.d;
        pqVar2.e = pqVar.e;
        pqVar2.g = pqVar.g;
        pqVar2.f = pqVar.f;
        pqVar2.l = pqVar.l;
        pqVar2.i = pqVar.i;
        pqVar2.p = pqVar.p;
        pqVar2.j = pqVar.j;
        pqVar2.m = pqVar.m;
        pqVar2.n = pqVar.n;
        pqVar2.o = pqVar.o;
        pqVar2.q = pqVar.q;
        Rect rect = pqVar.h;
        if (rect != null) {
            pqVar2.h = new Rect(rect);
        }
        this.g = pqVar2;
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.k = true;
        this.l = true;
        super.onBoundsChange(rect);
        if (this.g.b != null && !rect.isEmpty()) {
            k(getState(), this.C);
        }
        this.C = rect.isEmpty();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        if (this.g.b != null) {
            k(iArr, false);
        }
        boolean z = j(iArr) || l();
        if (z) {
            invalidateSelf();
        }
        return z;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        pq pqVar = this.g;
        if (pqVar.l != i) {
            pqVar.l = i;
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.g.getClass();
        super.invalidateSelf();
    }

    @Override // defpackage.l00
    public final void setShapeAppearanceModel(a00 a00Var) {
        pq pqVar = this.g;
        pqVar.a = a00Var;
        pqVar.b = null;
        this.G = null;
        this.H = null;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        this.g.f = colorStateList;
        l();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        pq pqVar = this.g;
        if (pqVar.g != mode) {
            pqVar.g = mode;
            l();
            super.invalidateSelf();
        }
    }

    public rq(a00 a00Var) {
        pq pqVar = new pq();
        pqVar.d = null;
        pqVar.e = null;
        pqVar.f = null;
        pqVar.g = PorterDuff.Mode.SRC_IN;
        pqVar.h = null;
        pqVar.i = 1.0f;
        pqVar.j = 1.0f;
        pqVar.l = 255;
        pqVar.m = 0.0f;
        pqVar.n = 0.0f;
        pqVar.o = 0;
        pqVar.p = 0;
        pqVar.q = Paint.Style.FILL_AND_STROKE;
        pqVar.a = a00Var;
        pqVar.c = null;
        this(pqVar);
    }
}
