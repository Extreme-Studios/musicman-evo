package defpackage;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import java.io.IOException;
import java.util.ArrayDeque;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public final class y50 extends p50 {
    public static final PorterDuff.Mode o = PorterDuff.Mode.SRC_IN;
    public w50 g;
    public PorterDuffColorFilter h;
    public ColorFilter i;
    public boolean j;
    public boolean k;
    public final float[] l;
    public final Matrix m;
    public final Rect n;

    public y50() {
        this.k = true;
        this.l = new float[9];
        this.m = new Matrix();
        this.n = new Rect();
        w50 w50Var = new w50();
        w50Var.c = null;
        w50Var.d = o;
        w50Var.b = new v50();
        this.g = w50Var;
    }

    public final PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.f;
        if (drawable == null) {
            return false;
        }
        drawable.canApplyTheme();
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Paint paint;
        Drawable drawable = this.f;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        Rect rect = this.n;
        copyBounds(rect);
        if (rect.width() <= 0 || rect.height() <= 0) {
            return;
        }
        ColorFilter colorFilter = this.i;
        if (colorFilter == null) {
            colorFilter = this.h;
        }
        Matrix matrix = this.m;
        canvas.getMatrix(matrix);
        float[] fArr = this.l;
        matrix.getValues(fArr);
        float fAbs = Math.abs(fArr[0]);
        float fAbs2 = Math.abs(fArr[4]);
        float fAbs3 = Math.abs(fArr[1]);
        float fAbs4 = Math.abs(fArr[3]);
        if (fAbs3 != 0.0f || fAbs4 != 0.0f) {
            fAbs = 1.0f;
            fAbs2 = 1.0f;
        }
        int iWidth = (int) (rect.width() * fAbs);
        int iHeight = (int) (rect.height() * fAbs2);
        int iMin = Math.min(2048, iWidth);
        int iMin2 = Math.min(2048, iHeight);
        if (iMin <= 0 || iMin2 <= 0) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(rect.left, rect.top);
        if (isAutoMirrored() && getLayoutDirection() == 1) {
            canvas.translate(rect.width(), 0.0f);
            canvas.scale(-1.0f, 1.0f);
        }
        rect.offsetTo(0, 0);
        w50 w50Var = this.g;
        Bitmap bitmap = w50Var.f;
        if (bitmap == null || iMin != bitmap.getWidth() || iMin2 != w50Var.f.getHeight()) {
            w50Var.f = Bitmap.createBitmap(iMin, iMin2, Bitmap.Config.ARGB_8888);
            w50Var.k = true;
        }
        boolean z = this.k;
        w50 w50Var2 = this.g;
        if (!z) {
            w50Var2.f.eraseColor(0);
            Canvas canvas2 = new Canvas(w50Var2.f);
            v50 v50Var = w50Var2.b;
            v50Var.a(v50Var.g, v50.p, canvas2, iMin, iMin2);
        } else if (w50Var2.k || w50Var2.g != w50Var2.c || w50Var2.h != w50Var2.d || w50Var2.j != w50Var2.e || w50Var2.i != w50Var2.b.getRootAlpha()) {
            w50 w50Var3 = this.g;
            w50Var3.f.eraseColor(0);
            Canvas canvas3 = new Canvas(w50Var3.f);
            v50 v50Var2 = w50Var3.b;
            v50Var2.a(v50Var2.g, v50.p, canvas3, iMin, iMin2);
            w50 w50Var4 = this.g;
            w50Var4.g = w50Var4.c;
            w50Var4.h = w50Var4.d;
            w50Var4.i = w50Var4.b.getRootAlpha();
            w50Var4.j = w50Var4.e;
            w50Var4.k = false;
        }
        w50 w50Var5 = this.g;
        if (w50Var5.b.getRootAlpha() >= 255 && colorFilter == null) {
            paint = null;
        } else {
            if (w50Var5.l == null) {
                Paint paint2 = new Paint();
                w50Var5.l = paint2;
                paint2.setFilterBitmap(true);
            }
            w50Var5.l.setAlpha(w50Var5.b.getRootAlpha());
            w50Var5.l.setColorFilter(colorFilter);
            paint = w50Var5.l;
        }
        canvas.drawBitmap(w50Var5.f, (Rect) null, rect, paint);
        canvas.restoreToCount(iSave);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.f;
        return drawable != null ? drawable.getAlpha() : this.g.b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.f;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        return this.g.getChangingConfigurations() | super.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f;
        return drawable != null ? drawable.getColorFilter() : this.i;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f != null) {
            return new x50(this.f.getConstantState());
        }
        this.g.a = getChangingConfigurations();
        return this.g;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.g.b.i;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.g.b.h;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int i;
        char c;
        int i2;
        Paint.Cap cap;
        Paint.Join join;
        Drawable drawable = this.f;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
            return;
        }
        w50 w50Var = this.g;
        w50Var.b = new v50();
        TypedArray typedArrayI = ar.i(resources, theme, attributeSet, i8.f);
        w50 w50Var2 = this.g;
        v50 v50Var = w50Var2.b;
        int i3 = !ar.f(xmlPullParser, "tintMode") ? -1 : typedArrayI.getInt(6, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        if (i3 == 3) {
            mode = PorterDuff.Mode.SRC_OVER;
        } else if (i3 != 5) {
            if (i3 != 9) {
                switch (i3) {
                    case 14:
                        mode = PorterDuff.Mode.MULTIPLY;
                        break;
                    case 15:
                        mode = PorterDuff.Mode.SCREEN;
                        break;
                    case 16:
                        mode = PorterDuff.Mode.ADD;
                        break;
                }
            } else {
                mode = PorterDuff.Mode.SRC_ATOP;
            }
        }
        w50Var2.d = mode;
        ColorStateList colorStateListA = null;
        int i4 = 1;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "tint") != null) {
            TypedValue typedValue = new TypedValue();
            typedArrayI.getValue(1, typedValue);
            int i5 = typedValue.type;
            if (i5 == 2) {
                throw new UnsupportedOperationException("Failed to resolve attribute at index 1: " + typedValue);
            }
            if (i5 < 28 || i5 > 31) {
                Resources resources2 = typedArrayI.getResources();
                int resourceId = typedArrayI.getResourceId(1, 0);
                ThreadLocal threadLocal = ea.a;
                try {
                    colorStateListA = ea.a(resources2, resources2.getXml(resourceId), theme);
                } catch (Exception e) {
                    Log.e("CSLCompat", "Failed to inflate ColorStateList.", e);
                }
            } else {
                colorStateListA = ColorStateList.valueOf(typedValue.data);
            }
        }
        ColorStateList colorStateList = colorStateListA;
        if (colorStateList != null) {
            w50Var2.c = colorStateList;
        }
        boolean z = w50Var2.e;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "autoMirrored") != null) {
            z = typedArrayI.getBoolean(5, z);
        }
        w50Var2.e = z;
        float f = v50Var.j;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "viewportWidth") != null) {
            f = typedArrayI.getFloat(7, f);
        }
        v50Var.j = f;
        float f2 = v50Var.k;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "viewportHeight") != null) {
            f2 = typedArrayI.getFloat(8, f2);
        }
        v50Var.k = f2;
        if (v50Var.j <= 0.0f) {
            throw new XmlPullParserException(typedArrayI.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        }
        if (f2 <= 0.0f) {
            throw new XmlPullParserException(typedArrayI.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
        }
        v50Var.h = typedArrayI.getDimension(3, v50Var.h);
        float dimension = typedArrayI.getDimension(2, v50Var.i);
        v50Var.i = dimension;
        if (v50Var.h <= 0.0f) {
            throw new XmlPullParserException(typedArrayI.getPositionDescription() + "<vector> tag requires width > 0");
        }
        if (dimension <= 0.0f) {
            throw new XmlPullParserException(typedArrayI.getPositionDescription() + "<vector> tag requires height > 0");
        }
        float alpha = v50Var.getAlpha();
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "alpha") != null) {
            alpha = typedArrayI.getFloat(4, alpha);
        }
        v50Var.setAlpha(alpha);
        String string = typedArrayI.getString(0);
        if (string != null) {
            v50Var.m = string;
            v50Var.o.put(string, v50Var);
        }
        typedArrayI.recycle();
        w50Var.a = getChangingConfigurations();
        w50Var.k = true;
        w50 w50Var3 = this.g;
        v50 v50Var2 = w50Var3.b;
        ArrayDeque arrayDeque = new ArrayDeque();
        s50 s50Var = v50Var2.g;
        m7 m7Var = v50Var2.o;
        arrayDeque.push(s50Var);
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        boolean z2 = true;
        while (eventType != i4 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                s50 s50Var2 = (s50) arrayDeque.peek();
                i = depth;
                if ("path".equals(name)) {
                    r50 r50Var = new r50();
                    r50Var.e = 0.0f;
                    r50Var.g = 1.0f;
                    r50Var.h = 1.0f;
                    r50Var.i = 0.0f;
                    r50Var.j = 1.0f;
                    r50Var.k = 0.0f;
                    Paint.Cap cap2 = Paint.Cap.BUTT;
                    r50Var.l = cap2;
                    Paint.Join join2 = Paint.Join.MITER;
                    r50Var.m = join2;
                    r50Var.n = 4.0f;
                    TypedArray typedArrayI2 = ar.i(resources, theme, attributeSet, i8.h);
                    if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null) {
                        String string2 = typedArrayI2.getString(0);
                        if (string2 != null) {
                            r50Var.b = string2;
                        }
                        String string3 = typedArrayI2.getString(2);
                        if (string3 != null) {
                            r50Var.a = v51.f(string3);
                        }
                        r50Var.f = ar.e(typedArrayI2, xmlPullParser, theme, "fillColor", 1);
                        float f3 = r50Var.h;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "fillAlpha") != null) {
                            f3 = typedArrayI2.getFloat(12, f3);
                        }
                        r50Var.h = f3;
                        int i6 = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeLineCap") != null ? typedArrayI2.getInt(8, -1) : -1;
                        Paint.Cap cap3 = r50Var.l;
                        if (i6 == 0) {
                            cap = cap2;
                        } else if (i6 != 1) {
                            cap = i6 != 2 ? cap3 : Paint.Cap.SQUARE;
                        } else {
                            cap = Paint.Cap.ROUND;
                        }
                        r50Var.l = cap;
                        int i7 = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeLineJoin") != null ? typedArrayI2.getInt(9, -1) : -1;
                        Paint.Join join3 = r50Var.m;
                        if (i7 == 0) {
                            join = join2;
                        } else if (i7 != 1) {
                            join = i7 != 2 ? join3 : Paint.Join.BEVEL;
                        } else {
                            join = Paint.Join.ROUND;
                        }
                        r50Var.m = join;
                        float f4 = r50Var.n;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeMiterLimit") != null) {
                            f4 = typedArrayI2.getFloat(10, f4);
                        }
                        r50Var.n = f4;
                        r50Var.d = ar.e(typedArrayI2, xmlPullParser, theme, "strokeColor", 3);
                        float f5 = r50Var.g;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeAlpha") != null) {
                            f5 = typedArrayI2.getFloat(11, f5);
                        }
                        r50Var.g = f5;
                        float f6 = r50Var.e;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeWidth") != null) {
                            f6 = typedArrayI2.getFloat(4, f6);
                        }
                        r50Var.e = f6;
                        float f7 = r50Var.j;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathEnd") != null) {
                            f7 = typedArrayI2.getFloat(6, f7);
                        }
                        r50Var.j = f7;
                        float f8 = r50Var.k;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathOffset") != null) {
                            f8 = typedArrayI2.getFloat(7, f8);
                        }
                        r50Var.k = f8;
                        float f9 = r50Var.i;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathStart") != null) {
                            f9 = typedArrayI2.getFloat(5, f9);
                        }
                        r50Var.i = f9;
                        int i8 = r50Var.c;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "fillType") != null) {
                            i8 = typedArrayI2.getInt(13, i8);
                        }
                        r50Var.c = i8;
                    }
                    typedArrayI2.recycle();
                    s50Var2.b.add(r50Var);
                    if (r50Var.getPathName() != null) {
                        m7Var.put(r50Var.getPathName(), r50Var);
                    }
                    w50Var3.a = w50Var3.a;
                    z2 = false;
                    c = '\b';
                } else {
                    c = '\b';
                    if ("clip-path".equals(name)) {
                        q50 q50Var = new q50();
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null) {
                            TypedArray typedArrayI3 = ar.i(resources, theme, attributeSet, i8.i);
                            String string4 = typedArrayI3.getString(0);
                            if (string4 != null) {
                                q50Var.b = string4;
                            }
                            String string5 = typedArrayI3.getString(1);
                            if (string5 != null) {
                                q50Var.a = v51.f(string5);
                            }
                            q50Var.c = !ar.f(xmlPullParser, "fillType") ? 0 : typedArrayI3.getInt(2, 0);
                            typedArrayI3.recycle();
                        }
                        s50Var2.b.add(q50Var);
                        if (q50Var.getPathName() != null) {
                            m7Var.put(q50Var.getPathName(), q50Var);
                        }
                        w50Var3.a = w50Var3.a;
                    } else if ("group".equals(name)) {
                        s50 s50Var3 = new s50();
                        TypedArray typedArrayI4 = ar.i(resources, theme, attributeSet, i8.g);
                        float f10 = s50Var3.c;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "rotation") != null) {
                            f10 = typedArrayI4.getFloat(5, f10);
                        }
                        s50Var3.c = f10;
                        s50Var3.d = typedArrayI4.getFloat(1, s50Var3.d);
                        s50Var3.e = typedArrayI4.getFloat(2, s50Var3.e);
                        float f11 = s50Var3.f;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "scaleX") != null) {
                            f11 = typedArrayI4.getFloat(3, f11);
                        }
                        s50Var3.f = f11;
                        float f12 = s50Var3.g;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "scaleY") != null) {
                            f12 = typedArrayI4.getFloat(4, f12);
                        }
                        s50Var3.g = f12;
                        float f13 = s50Var3.h;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "translateX") != null) {
                            f13 = typedArrayI4.getFloat(6, f13);
                        }
                        s50Var3.h = f13;
                        float f14 = s50Var3.i;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "translateY") != null) {
                            f14 = typedArrayI4.getFloat(7, f14);
                        }
                        s50Var3.i = f14;
                        String string6 = typedArrayI4.getString(0);
                        if (string6 != null) {
                            s50Var3.k = string6;
                        }
                        s50Var3.c();
                        typedArrayI4.recycle();
                        s50Var2.b.add(s50Var3);
                        arrayDeque.push(s50Var3);
                        if (s50Var3.getGroupName() != null) {
                            m7Var.put(s50Var3.getGroupName(), s50Var3);
                        }
                        w50Var3.a = w50Var3.a;
                    }
                }
                i2 = 1;
            } else {
                i = depth;
                c = '\b';
                i2 = 1;
                if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                    arrayDeque.pop();
                }
            }
            eventType = xmlPullParser.next();
            i4 = i2;
            depth = i;
        }
        if (z2) {
            throw new XmlPullParserException("no path defined");
        }
        this.h = a(w50Var.c, w50Var.d);
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        Drawable drawable = this.f;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.f;
        return drawable != null ? drawable.isAutoMirrored() : this.g.e;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.f;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (super.isStateful()) {
            return true;
        }
        w50 w50Var = this.g;
        if (w50Var == null) {
            return false;
        }
        v50 v50Var = w50Var.b;
        if (v50Var.n == null) {
            v50Var.n = Boolean.valueOf(v50Var.g.a());
        }
        if (v50Var.n.booleanValue()) {
            return true;
        }
        ColorStateList colorStateList = this.g.c;
        return colorStateList != null && colorStateList.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.f;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.j && super.mutate() == this) {
            w50 w50Var = this.g;
            w50 w50Var2 = new w50();
            w50Var2.c = null;
            w50Var2.d = o;
            if (w50Var != null) {
                w50Var2.a = w50Var.a;
                v50 v50Var = new v50(w50Var.b);
                w50Var2.b = v50Var;
                if (w50Var.b.e != null) {
                    v50Var.e = new Paint(w50Var.b.e);
                }
                if (w50Var.b.d != null) {
                    w50Var2.b.d = new Paint(w50Var.b.d);
                }
                w50Var2.c = w50Var.c;
                w50Var2.d = w50Var.d;
                w50Var2.e = w50Var.e;
            }
            this.g = w50Var2;
            this.j = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        boolean z;
        PorterDuff.Mode mode;
        Drawable drawable = this.f;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        w50 w50Var = this.g;
        ColorStateList colorStateList = w50Var.c;
        if (colorStateList == null || (mode = w50Var.d) == null) {
            z = false;
        } else {
            this.h = a(colorStateList, mode);
            invalidateSelf();
            z = true;
        }
        v50 v50Var = w50Var.b;
        if (v50Var.n == null) {
            v50Var.n = Boolean.valueOf(v50Var.g.a());
        }
        if (v50Var.n.booleanValue()) {
            boolean zB = w50Var.b.g.b(iArr);
            w50Var.k |= zB;
            if (zB) {
                invalidateSelf();
                return true;
            }
        }
        return z;
    }

    @Override // android.graphics.drawable.Drawable
    public final void scheduleSelf(Runnable runnable, long j) {
        Drawable drawable = this.f;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j);
        } else {
            super.scheduleSelf(runnable, j);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Drawable drawable = this.f;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else if (this.g.b.getRootAlpha() != i) {
            this.g.b.setRootAlpha(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z) {
        Drawable drawable = this.f;
        if (drawable != null) {
            drawable.setAutoMirrored(z);
        } else {
            this.g.e = z;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.i = colorFilter;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        Drawable drawable = this.f;
        if (drawable != null) {
            drawable.setTint(i);
        } else {
            setTintList(ColorStateList.valueOf(i));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
            return;
        }
        w50 w50Var = this.g;
        if (w50Var.c != colorStateList) {
            w50Var.c = colorStateList;
            this.h = a(colorStateList, w50Var.d);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f;
        if (drawable != null) {
            drawable.setTintMode(mode);
            return;
        }
        w50 w50Var = this.g;
        if (w50Var.d != mode) {
            w50Var.d = mode;
            this.h = a(w50Var.c, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.f;
        return drawable != null ? drawable.setVisible(z, z2) : super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    public y50(w50 w50Var) {
        this.k = true;
        this.l = new float[9];
        this.m = new Matrix();
        this.n = new Rect();
        this.g = w50Var;
        this.h = a(w50Var.c, w50Var.d);
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        Drawable drawable = this.f;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }
}
