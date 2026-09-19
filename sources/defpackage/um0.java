package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.Xml;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public class um0 implements dd0, on0, hp1 {
    public static final ts i = new ts(3);
    public int f;
    public Object g;
    public Object h;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public um0(int i2, boolean z) {
        this(4);
        switch (i2) {
            case 6:
                this.g = new Object();
                this.h = new LinkedList();
                break;
            case 9:
                break;
            case 11:
                v33 v33Var = v33.j;
                this.g = new SparseArray();
                this.h = v33Var;
                this.f = -1;
                break;
            default:
                this.g = new ArrayList();
                this.h = new ArrayList(64);
                this.f = 0;
                break;
        }
    }

    public static um0 d(Resources resources, int i2, Resources.Theme theme) {
        int next;
        float f;
        float f2;
        Shader.TileMode tileMode;
        Object radialGradient;
        Shader.TileMode tileMode2;
        XmlResourceParser xml = resources.getXml(i2);
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
        do {
            next = xml.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        String name = xml.getName();
        name.getClass();
        Object obj = null;
        if (!name.equals("gradient")) {
            if (name.equals("selector")) {
                ColorStateList colorStateListB = ea.b(resources, xml, attributeSetAsAttributeSet, theme);
                return new um0(obj, colorStateListB.getDefaultColor(), colorStateListB);
            }
            throw new XmlPullParserException(xml.getPositionDescription() + ": unsupported complex color tag " + name);
        }
        String name2 = xml.getName();
        if (!name2.equals("gradient")) {
            throw new XmlPullParserException(xml.getPositionDescription() + ": invalid gradient color tag " + name2);
        }
        TypedArray typedArrayI = ar.i(resources, theme, attributeSetAsAttributeSet, gw.e);
        float f3 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "startX") != null ? typedArrayI.getFloat(8, 0.0f) : 0.0f;
        float f4 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "startY") != null ? typedArrayI.getFloat(9, 0.0f) : 0.0f;
        float f5 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "endX") != null ? typedArrayI.getFloat(10, 0.0f) : 0.0f;
        float f6 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "endY") != null ? typedArrayI.getFloat(11, 0.0f) : 0.0f;
        float f7 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerX") != null ? typedArrayI.getFloat(3, 0.0f) : 0.0f;
        float f8 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerY") != null ? typedArrayI.getFloat(4, 0.0f) : 0.0f;
        int i3 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "type") != null ? typedArrayI.getInt(2, 0) : 0;
        int color = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "startColor") != null ? typedArrayI.getColor(0, 0) : 0;
        boolean z = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerColor") != null;
        int color2 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerColor") != null ? typedArrayI.getColor(7, 0) : 0;
        int color3 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "endColor") != null ? typedArrayI.getColor(1, 0) : 0;
        int i4 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "tileMode") != null ? typedArrayI.getInt(6, 0) : 0;
        float f9 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "gradientRadius") != null ? typedArrayI.getFloat(5, 0.0f) : 0.0f;
        typedArrayI.recycle();
        int depth = xml.getDepth() + 1;
        ArrayList arrayList = new ArrayList(20);
        float f10 = f9;
        ArrayList arrayList2 = new ArrayList(20);
        while (true) {
            int next2 = xml.next();
            f = f5;
            if (next2 == 1) {
                f2 = f6;
                break;
            }
            int depth2 = xml.getDepth();
            f2 = f6;
            if (depth2 < depth && next2 == 3) {
                break;
            }
            if (next2 == 2 && depth2 <= depth && xml.getName().equals("item")) {
                TypedArray typedArrayI2 = ar.i(resources, theme, attributeSetAsAttributeSet, gw.f);
                boolean zHasValue = typedArrayI2.hasValue(0);
                boolean zHasValue2 = typedArrayI2.hasValue(1);
                if (!zHasValue || !zHasValue2) {
                    throw new XmlPullParserException(xml.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
                }
                int color4 = typedArrayI2.getColor(0, 0);
                float f11 = typedArrayI2.getFloat(1, 0.0f);
                typedArrayI2.recycle();
                arrayList2.add(Integer.valueOf(color4));
                arrayList.add(Float.valueOf(f11));
            }
            f5 = f;
            f6 = f2;
        }
        un1 un1Var = arrayList2.size() > 0 ? new un1(arrayList2, arrayList) : null;
        if (un1Var == null) {
            un1Var = z ? new un1(color, color2, color3) : new un1(color, color3);
        }
        if (i3 != 1) {
            if (i3 != 2) {
                int[] iArr = (int[]) un1Var.g;
                float[] fArr = (float[]) un1Var.h;
                if (i4 != 1) {
                    tileMode2 = i4 != 2 ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR;
                } else {
                    tileMode2 = Shader.TileMode.REPEAT;
                }
                radialGradient = new LinearGradient(f3, f4, f, f2, iArr, fArr, tileMode2);
            } else {
                radialGradient = new SweepGradient(f7, f8, (int[]) un1Var.g, (float[]) un1Var.h);
            }
        } else {
            if (f10 <= 0.0f) {
                throw new XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
            }
            int[] iArr2 = (int[]) un1Var.g;
            float[] fArr2 = (float[]) un1Var.h;
            if (i4 != 1) {
                tileMode = i4 != 2 ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR;
            } else {
                tileMode = Shader.TileMode.REPEAT;
            }
            radialGradient = new RadialGradient(f7, f8, f10, iArr2, fArr2, tileMode);
        }
        return new um0(radialGradient, 0, null);
    }

    public static um0 l(String str, boolean z) {
        return new um0(str, 1, Boolean.valueOf(z));
    }

    public static um0 p(String str, long j) {
        return new um0(str, 2, Long.valueOf(j));
    }

    public void a() {
        g92 g92Var;
        ImageView imageView = (ImageView) this.g;
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            sf.a(drawable);
        }
        if (drawable == null || (g92Var = (g92) this.h) == null) {
            return;
        }
        e5.d(drawable, g92Var, imageView.getDrawableState());
    }

    @Override // defpackage.hp1
    /* JADX INFO: renamed from: b */
    public /* synthetic */ void mo6b(Object obj) {
        int i2 = p73.f0;
        ((ds0) obj).H((at0) this.g, (at0) this.h, this.f);
    }

    @Override // defpackage.dd0
    /* JADX INFO: renamed from: c */
    public void mo16c() {
        byte[] bArr = qz1.b;
        int length = bArr.length;
        ((cw1) this.h).z(0, bArr);
    }

    public boolean e() {
        ColorStateList colorStateList;
        return ((Shader) this.g) == null && (colorStateList = (ColorStateList) this.h) != null && colorStateList.isStateful();
    }

    @Override // defpackage.dd0
    public cd0 f(od0 od0Var, long j) {
        long j2;
        long jO = od0Var.o();
        int iMin = (int) Math.min(112800L, od0Var.p() - jO);
        cw1 cw1Var = (cw1) this.h;
        cw1Var.y(iMin);
        od0Var.u(cw1Var.a, 0, iMin);
        int i2 = cw1Var.c;
        long j3 = -1;
        long j4 = -1;
        long j5 = -9223372036854775807L;
        while (true) {
            if (cw1Var.B() < 188) {
                j2 = -9223372036854775807L;
                break;
            }
            byte[] bArr = cw1Var.a;
            int i3 = cw1Var.b;
            while (true) {
                if (i3 >= i2) {
                    j2 = -9223372036854775807L;
                    break;
                }
                j2 = -9223372036854775807L;
                if (bArr[i3] == 71) {
                    break;
                }
                i3++;
            }
            int i4 = i3 + 188;
            if (i4 > i2) {
                break;
            }
            long jW = yd.w(cw1Var, i3, this.f);
            if (jW != j2) {
                long jC = ((ry1) this.g).c(jW);
                if (jC > j) {
                    return j5 == j2 ? new cd0(-1, jC, jO) : new cd0(0, -9223372036854775807L, jO + j4);
                }
                j5 = jC;
                long j6 = i3;
                if (100000 + j5 > j) {
                    return new cd0(0, -9223372036854775807L, jO + j6);
                }
                j4 = j6;
            }
            cw1Var.E(i4);
            j3 = i4;
        }
        return j5 != j2 ? new cd0(-2, j5, jO + j3) : cd0.d;
    }

    public void g(AttributeSet attributeSet, int i2) {
        int resourceId;
        ImageView imageView = (ImageView) this.g;
        Context context = imageView.getContext();
        int[] iArr = lw.f;
        r52 r52VarR = r52.r(context, attributeSet, iArr, i2);
        TypedArray typedArray = (TypedArray) r52VarR.h;
        w60.h(imageView, imageView.getContext(), iArr, attributeSet, (TypedArray) r52VarR.h, i2);
        try {
            Drawable drawable = imageView.getDrawable();
            if (drawable == null && (resourceId = typedArray.getResourceId(1, -1)) != -1 && (drawable = jn.f(imageView.getContext(), resourceId)) != null) {
                imageView.setImageDrawable(drawable);
            }
            if (drawable != null) {
                sf.a(drawable);
            }
            if (typedArray.hasValue(2)) {
                imageView.setImageTintList(r52VarR.j(2));
            }
            if (typedArray.hasValue(3)) {
                imageView.setImageTintMode(sf.c(typedArray.getInt(3, -1), null));
            }
        } finally {
            r52VarR.x();
        }
    }

    @Override // defpackage.on0
    /* JADX INFO: renamed from: h */
    public /* bridge */ /* synthetic */ on0 mo13h() {
        return new um0((e3) this.h);
    }

    public int i() {
        int i2 = this.f;
        if (i2 != 2) {
            return i2 != 3 ? 0 : 512;
        }
        return 2048;
    }

    public Object j(int i2) {
        SparseArray sparseArray = (SparseArray) this.g;
        if (this.f == -1) {
            this.f = 0;
        }
        while (true) {
            int i3 = this.f;
            if (i3 <= 0 || i2 >= sparseArray.keyAt(i3)) {
                break;
            }
            this.f--;
        }
        while (this.f < sparseArray.size() - 1 && i2 >= sparseArray.keyAt(this.f + 1)) {
            this.f++;
        }
        return sparseArray.valueAt(this.f);
    }

    @Override // defpackage.on0
    public byte k(xn0 xn0Var, int i2) {
        byte[] bArr = (byte[]) this.g;
        int i3 = i2 >>> 3;
        if (i3 != this.f) {
            ((e3) this.h).h(i3, bArr);
            this.f = i3;
        }
        return (byte) (((xn0Var.b(i2) ^ bArr[i2 % 8]) << 24) >> 24);
    }

    public void m(Object obj, Object obj2) {
        int i2 = this.f + 1;
        Object[] objArr = (Object[]) this.g;
        int length = objArr.length;
        int i3 = i2 + i2;
        if (i3 > length) {
            this.g = Arrays.copyOf(objArr, pj2.d(length, i3));
        }
        w40.b0(obj, obj2);
        Object[] objArr2 = (Object[]) this.g;
        int i4 = this.f;
        int i5 = i4 + i4;
        objArr2[i5] = obj;
        objArr2[i5 + 1] = obj2;
        this.f = i4 + 1;
    }

    @Override // defpackage.on0
    public xn0 n(xn0 xn0Var, int i2, int i3) {
        if (i2 < 0 || i2 > i3 || i3 > xn0Var.a.length) {
            throw new IndexOutOfBoundsException();
        }
        byte[] bArr = new byte[i3 - i2];
        int i4 = 0;
        while (i2 < i3) {
            bArr[i4] = k(xn0Var, i2);
            i2++;
            i4++;
        }
        return xn0.e(bArr);
    }

    public synchronized byte[] o(int i2) {
        int i3 = 0;
        while (true) {
            ArrayList arrayList = (ArrayList) this.h;
            if (i3 >= arrayList.size()) {
                return new byte[i2];
            }
            byte[] bArr = (byte[]) arrayList.get(i3);
            int length = bArr.length;
            if (length >= i2) {
                this.f -= length;
                arrayList.remove(i3);
                ((ArrayList) this.g).remove(bArr);
                return bArr;
            }
            i3++;
        }
    }

    public void q(wt0 wt0Var) {
        synchronized (this.g) {
            try {
                Iterator it = ((LinkedList) this.h).iterator();
                while (it.hasNext()) {
                    wt0 wt0Var2 = (wt0) it.next();
                    vc3 vc3Var = vc3.C;
                    if (vc3Var.h.g().k()) {
                        if (!vc3Var.h.g().l() && !wt0Var.equals(wt0Var2) && wt0Var2.q.equals(wt0Var.q)) {
                            it.remove();
                            return;
                        }
                    } else if (!wt0Var.equals(wt0Var2) && wt0Var2.o.equals(wt0Var.o)) {
                        it.remove();
                        return;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public synchronized void r(byte[] bArr) {
        if (bArr != null) {
            int length = bArr.length;
            if (length <= 4096) {
                ((ArrayList) this.g).add(bArr);
                ArrayList arrayList = (ArrayList) this.h;
                int iBinarySearch = Collections.binarySearch(arrayList, bArr, i);
                if (iBinarySearch < 0) {
                    iBinarySearch = (-iBinarySearch) - 1;
                }
                arrayList.add(iBinarySearch, bArr);
                this.f += length;
                synchronized (this) {
                    while (this.f > 4096) {
                        byte[] bArr2 = (byte[]) ((ArrayList) this.g).remove(0);
                        ((ArrayList) this.h).remove(bArr2);
                        this.f -= bArr2.length;
                    }
                }
            }
        }
    }

    public vk2 s() {
        wj2 wj2Var = (wj2) this.h;
        if (wj2Var != null) {
            throw wj2Var.a();
        }
        vk2 vk2VarD = vk2.d(this.f, (Object[]) this.g, this);
        wj2 wj2Var2 = (wj2) this.h;
        if (wj2Var2 == null) {
            return vk2VarD;
        }
        throw wj2Var2.a();
    }

    public void t(wt0 wt0Var) {
        synchronized (this.g) {
            try {
                LinkedList linkedList = (LinkedList) this.h;
                if (linkedList.size() >= 10) {
                    int size = linkedList.size();
                    StringBuilder sb = new StringBuilder(String.valueOf(size).length() + 30);
                    sb.append("Queue is full, current size = ");
                    sb.append(size);
                    jn.F(sb.toString());
                    linkedList.remove(0);
                }
                int i2 = this.f;
                this.f = i2 + 1;
                wt0Var.l = i2;
                synchronized (wt0Var.g) {
                    try {
                        int i3 = wt0Var.k;
                        int i4 = wt0Var.l;
                        int i5 = wt0Var.b;
                        if (!wt0Var.d) {
                            i5 = (i4 * i5) + (i3 * wt0Var.a);
                        }
                        if (i5 > wt0Var.n) {
                            wt0Var.n = i5;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                linkedList.add(wt0Var);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public Object u() {
        String str = (String) this.g;
        Object obj = this.h;
        jx0 jx0Var = (jx0) jz0.a.get();
        if (jx0Var == null) {
            if (jz0.b.get() == null) {
                return obj;
            }
            j7.j();
            return null;
        }
        SharedPreferences sharedPreferences = jx0Var.a;
        int i2 = this.f - 1;
        if (i2 == 0) {
            boolean zBooleanValue = ((Boolean) obj).booleanValue();
            try {
                return Boolean.valueOf(sharedPreferences.getBoolean(str, zBooleanValue));
            } catch (ClassCastException unused) {
                return Boolean.valueOf(sharedPreferences.getString(str, String.valueOf(zBooleanValue)));
            }
        }
        if (i2 == 1) {
            long jLongValue = ((Long) obj).longValue();
            try {
                return Long.valueOf(sharedPreferences.getLong(str, jLongValue));
            } catch (ClassCastException unused2) {
                return Long.valueOf(sharedPreferences.getInt(str, (int) jLongValue));
            }
        }
        if (i2 != 2) {
            return sharedPreferences.getString(str, (String) obj);
        }
        double dDoubleValue = ((Double) obj).doubleValue();
        try {
            return Double.valueOf(sharedPreferences.getFloat(str, (float) dDoubleValue));
        } catch (ClassCastException unused3) {
            return Double.valueOf(sharedPreferences.getString(str, String.valueOf(dDoubleValue)));
        }
    }

    public /* synthetic */ um0(Object obj, int i2, Object obj2) {
        this.g = obj;
        this.h = obj2;
        this.f = i2;
    }

    public um0(e3 e3Var) {
        this.f = -1;
        this.g = new byte[8];
        this.h = e3Var;
    }

    public um0(int i2) {
        this.g = new Object[i2 + i2];
        this.f = 0;
    }

    public um0(ImageView imageView) {
        this.f = 0;
        this.g = imageView;
    }
}
