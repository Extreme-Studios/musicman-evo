package defpackage;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import com.extremestudios.musicmanevo.R;

/* JADX INFO: loaded from: classes.dex */
public final class kq {
    public final jq a;
    public a00 b;
    public a20 c;
    public r10 d;
    public an e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public PorterDuff.Mode l;
    public ColorStateList m;
    public ColorStateList n;
    public ColorStateList o;
    public rq p;
    public boolean t;
    public RippleDrawable v;
    public int w;
    public boolean q = false;
    public boolean r = false;
    public boolean s = false;
    public boolean u = true;

    public kq(jq jqVar, a00 a00Var) {
        this.a = jqVar;
        this.b = a00Var;
    }

    public final rq a(boolean z) {
        RippleDrawable rippleDrawable = this.v;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return (rq) ((LayerDrawable) ((InsetDrawable) this.v.getDrawable(0)).getDrawable()).getDrawable(!z ? 1 : 0);
    }

    public final void b(int i, int i2) {
        jq jqVar = this.a;
        int paddingStart = jqVar.getPaddingStart();
        int paddingTop = jqVar.getPaddingTop();
        int paddingEnd = jqVar.getPaddingEnd();
        int paddingBottom = jqVar.getPaddingBottom();
        int i3 = this.h;
        int i4 = this.i;
        this.i = i2;
        this.h = i;
        if (!this.r) {
            c();
        }
        jqVar.setPaddingRelative(paddingStart, (paddingTop + i) - i3, paddingEnd, (paddingBottom + i2) - i4);
    }

    public final void c() {
        rq rqVar = new rq(this.b);
        a20 a20Var = this.c;
        if (a20Var != null) {
            rqVar.i(a20Var);
        }
        r10 r10Var = this.d;
        if (r10Var != null) {
            rqVar.h(r10Var);
        }
        an anVar = this.e;
        if (anVar != null) {
            rqVar.I = anVar;
        }
        jq jqVar = this.a;
        rqVar.g.c = new kg(jqVar.getContext());
        rqVar.m();
        rqVar.setTintList(this.m);
        PorterDuff.Mode mode = this.l;
        if (mode != null) {
            rqVar.setTintMode(mode);
        }
        float f = this.k;
        ColorStateList colorStateList = this.n;
        rqVar.g.k = f;
        rqVar.invalidateSelf();
        pq pqVar = rqVar.g;
        if (pqVar.e != colorStateList) {
            pqVar.e = colorStateList;
            rqVar.onStateChange(rqVar.getState());
        }
        rq rqVar2 = new rq(this.b);
        a20 a20Var2 = this.c;
        if (a20Var2 != null) {
            rqVar2.i(a20Var2);
        }
        r10 r10Var2 = this.d;
        if (r10Var2 != null) {
            rqVar2.h(r10Var2);
        }
        rqVar2.setTint(0);
        float f2 = this.k;
        int i = this.q ? i8.i(jqVar, R.attr.colorSurface) : 0;
        rqVar2.g.k = f2;
        rqVar2.invalidateSelf();
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(i);
        pq pqVar2 = rqVar2.g;
        if (pqVar2.e != colorStateListValueOf) {
            pqVar2.e = colorStateListValueOf;
            rqVar2.onStateChange(rqVar2.getState());
        }
        rq rqVar3 = new rq(this.b);
        this.p = rqVar3;
        a20 a20Var3 = this.c;
        if (a20Var3 != null) {
            rqVar3.i(a20Var3);
        }
        r10 r10Var3 = this.d;
        if (r10Var3 != null) {
            this.p.h(r10Var3);
        }
        this.p.setTint(-1);
        RippleDrawable rippleDrawable = new RippleDrawable(vx.a(this.o), new InsetDrawable((Drawable) new LayerDrawable(new Drawable[]{rqVar2, rqVar}), this.f, this.h, this.g, this.i), this.p);
        this.v = rippleDrawable;
        jqVar.setInternalBackground(rippleDrawable);
        rq rqVarA = a(false);
        if (rqVarA != null) {
            float f3 = this.w;
            pq pqVar3 = rqVarA.g;
            if (pqVar3.n != f3) {
                pqVar3.n = f3;
                rqVarA.m();
            }
            rqVarA.setState(jqVar.getDrawableState());
        }
    }

    public final void d() {
        l00 l00Var;
        rq rqVarA = a(false);
        if (rqVarA != null) {
            a20 a20Var = this.c;
            if (a20Var != null) {
                rqVarA.i(a20Var);
            } else {
                rqVarA.setShapeAppearanceModel(this.b);
            }
            r10 r10Var = this.d;
            if (r10Var != null) {
                rqVarA.h(r10Var);
            }
        }
        rq rqVarA2 = a(true);
        if (rqVarA2 != null) {
            a20 a20Var2 = this.c;
            if (a20Var2 != null) {
                rqVarA2.i(a20Var2);
            } else {
                rqVarA2.setShapeAppearanceModel(this.b);
            }
            r10 r10Var2 = this.d;
            if (r10Var2 != null) {
                rqVarA2.h(r10Var2);
            }
        }
        RippleDrawable rippleDrawable = this.v;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 1) {
            l00Var = null;
        } else {
            int numberOfLayers = this.v.getNumberOfLayers();
            RippleDrawable rippleDrawable2 = this.v;
            l00Var = numberOfLayers > 2 ? (l00) rippleDrawable2.getDrawable(2) : (l00) rippleDrawable2.getDrawable(1);
        }
        if (l00Var != null) {
            l00Var.setShapeAppearanceModel(this.b);
            if (l00Var instanceof rq) {
                rq rqVar = (rq) l00Var;
                a20 a20Var3 = this.c;
                if (a20Var3 != null) {
                    rqVar.i(a20Var3);
                }
                r10 r10Var3 = this.d;
                if (r10Var3 != null) {
                    rqVar.h(r10Var3);
                }
            }
        }
    }

    public final void e() {
        rq rqVarA = a(false);
        rq rqVarA2 = a(true);
        if (rqVarA != null) {
            float f = this.k;
            ColorStateList colorStateList = this.n;
            rqVarA.g.k = f;
            rqVarA.invalidateSelf();
            pq pqVar = rqVarA.g;
            if (pqVar.e != colorStateList) {
                pqVar.e = colorStateList;
                rqVarA.onStateChange(rqVarA.getState());
            }
            if (rqVarA2 != null) {
                float f2 = this.k;
                int i = this.q ? i8.i(this.a, R.attr.colorSurface) : 0;
                rqVarA2.g.k = f2;
                rqVarA2.invalidateSelf();
                ColorStateList colorStateListValueOf = ColorStateList.valueOf(i);
                pq pqVar2 = rqVarA2.g;
                if (pqVar2.e != colorStateListValueOf) {
                    pqVar2.e = colorStateListValueOf;
                    rqVarA2.onStateChange(rqVarA2.getState());
                }
            }
        }
    }
}
