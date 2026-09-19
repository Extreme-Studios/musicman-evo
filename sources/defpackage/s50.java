package defpackage;

import android.graphics.Matrix;
import android.graphics.Paint;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class s50 extends t50 {
    public final Matrix a;
    public final ArrayList b;
    public float c;
    public float d;
    public float e;
    public float f;
    public float g;
    public float h;
    public float i;
    public final Matrix j;
    public String k;

    public s50(s50 s50Var, m7 m7Var) {
        u50 q50Var;
        this.a = new Matrix();
        this.b = new ArrayList();
        this.c = 0.0f;
        this.d = 0.0f;
        this.e = 0.0f;
        this.f = 1.0f;
        this.g = 1.0f;
        this.h = 0.0f;
        this.i = 0.0f;
        Matrix matrix = new Matrix();
        this.j = matrix;
        this.k = null;
        this.c = s50Var.c;
        this.d = s50Var.d;
        this.e = s50Var.e;
        this.f = s50Var.f;
        this.g = s50Var.g;
        this.h = s50Var.h;
        this.i = s50Var.i;
        String str = s50Var.k;
        this.k = str;
        if (str != null) {
            m7Var.put(str, this);
        }
        matrix.set(s50Var.j);
        ArrayList arrayList = s50Var.b;
        for (int i = 0; i < arrayList.size(); i++) {
            Object obj = arrayList.get(i);
            if (obj instanceof s50) {
                this.b.add(new s50((s50) obj, m7Var));
            } else {
                if (obj instanceof r50) {
                    r50 r50Var = (r50) obj;
                    r50 r50Var2 = new r50(r50Var);
                    r50Var2.e = 0.0f;
                    r50Var2.g = 1.0f;
                    r50Var2.h = 1.0f;
                    r50Var2.i = 0.0f;
                    r50Var2.j = 1.0f;
                    r50Var2.k = 0.0f;
                    r50Var2.l = Paint.Cap.BUTT;
                    r50Var2.m = Paint.Join.MITER;
                    r50Var2.n = 4.0f;
                    r50Var2.d = r50Var.d;
                    r50Var2.e = r50Var.e;
                    r50Var2.g = r50Var.g;
                    r50Var2.f = r50Var.f;
                    r50Var2.c = r50Var.c;
                    r50Var2.h = r50Var.h;
                    r50Var2.i = r50Var.i;
                    r50Var2.j = r50Var.j;
                    r50Var2.k = r50Var.k;
                    r50Var2.l = r50Var.l;
                    r50Var2.m = r50Var.m;
                    r50Var2.n = r50Var.n;
                    q50Var = r50Var2;
                } else {
                    if (!(obj instanceof q50)) {
                        j7.e("Unknown object in the tree!");
                        throw null;
                    }
                    q50Var = new q50((q50) obj);
                }
                this.b.add(q50Var);
                Object obj2 = q50Var.b;
                if (obj2 != null) {
                    m7Var.put(obj2, q50Var);
                }
            }
        }
    }

    @Override // defpackage.t50
    public final boolean a() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.b;
            if (i >= arrayList.size()) {
                return false;
            }
            if (((t50) arrayList.get(i)).a()) {
                return true;
            }
            i++;
        }
    }

    @Override // defpackage.t50
    public final boolean b(int[] iArr) {
        int i = 0;
        boolean zB = false;
        while (true) {
            ArrayList arrayList = this.b;
            if (i >= arrayList.size()) {
                return zB;
            }
            zB |= ((t50) arrayList.get(i)).b(iArr);
            i++;
        }
    }

    public final void c() {
        Matrix matrix = this.j;
        matrix.reset();
        matrix.postTranslate(-this.d, -this.e);
        matrix.postScale(this.f, this.g);
        matrix.postRotate(this.c, 0.0f, 0.0f);
        matrix.postTranslate(this.h + this.d, this.i + this.e);
    }

    public String getGroupName() {
        return this.k;
    }

    public Matrix getLocalMatrix() {
        return this.j;
    }

    public float getPivotX() {
        return this.d;
    }

    public float getPivotY() {
        return this.e;
    }

    public float getRotation() {
        return this.c;
    }

    public float getScaleX() {
        return this.f;
    }

    public float getScaleY() {
        return this.g;
    }

    public float getTranslateX() {
        return this.h;
    }

    public float getTranslateY() {
        return this.i;
    }

    public void setPivotX(float f) {
        if (f != this.d) {
            this.d = f;
            c();
        }
    }

    public void setPivotY(float f) {
        if (f != this.e) {
            this.e = f;
            c();
        }
    }

    public void setRotation(float f) {
        if (f != this.c) {
            this.c = f;
            c();
        }
    }

    public void setScaleX(float f) {
        if (f != this.f) {
            this.f = f;
            c();
        }
    }

    public void setScaleY(float f) {
        if (f != this.g) {
            this.g = f;
            c();
        }
    }

    public void setTranslateX(float f) {
        if (f != this.h) {
            this.h = f;
            c();
        }
    }

    public void setTranslateY(float f) {
        if (f != this.i) {
            this.i = f;
            c();
        }
    }

    public s50() {
        this.a = new Matrix();
        this.b = new ArrayList();
        this.c = 0.0f;
        this.d = 0.0f;
        this.e = 0.0f;
        this.f = 1.0f;
        this.g = 1.0f;
        this.h = 0.0f;
        this.i = 0.0f;
        this.j = new Matrix();
        this.k = null;
    }
}
