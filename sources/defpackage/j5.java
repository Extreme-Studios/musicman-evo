package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes.dex */
public class j5 extends ImageView {
    public final ts2 f;
    public final um0 g;
    public boolean h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j5(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        x30.a(context);
        this.h = false;
        t30.a(getContext(), this);
        ts2 ts2Var = new ts2(this);
        this.f = ts2Var;
        ts2Var.d(attributeSet, i);
        um0 um0Var = new um0(this);
        this.g = um0Var;
        um0Var.g(attributeSet, i);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        ts2 ts2Var = this.f;
        if (ts2Var != null) {
            ts2Var.a();
        }
        um0 um0Var = this.g;
        if (um0Var != null) {
            um0Var.a();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        ts2 ts2Var = this.f;
        if (ts2Var != null) {
            return ts2Var.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        ts2 ts2Var = this.f;
        if (ts2Var != null) {
            return ts2Var.c();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        g92 g92Var;
        um0 um0Var = this.g;
        if (um0Var == null || (g92Var = (g92) um0Var.h) == null) {
            return null;
        }
        return (ColorStateList) g92Var.c;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        g92 g92Var;
        um0 um0Var = this.g;
        if (um0Var == null || (g92Var = (g92) um0Var.h) == null) {
            return null;
        }
        return (PorterDuff.Mode) g92Var.d;
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean hasOverlappingRendering() {
        return !(((ImageView) this.g.g).getBackground() instanceof RippleDrawable) && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        ts2 ts2Var = this.f;
        if (ts2Var != null) {
            ts2Var.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        ts2 ts2Var = this.f;
        if (ts2Var != null) {
            ts2Var.f(i);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        um0 um0Var = this.g;
        if (um0Var != null) {
            um0Var.a();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        um0 um0Var = this.g;
        if (um0Var != null && drawable != null && !this.h) {
            um0Var.f = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        if (um0Var != null) {
            um0Var.a();
            if (this.h) {
                return;
            }
            ImageView imageView = (ImageView) um0Var.g;
            if (imageView.getDrawable() != null) {
                imageView.getDrawable().setLevel(um0Var.f);
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i) {
        super.setImageLevel(i);
        this.h = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        um0 um0Var = this.g;
        if (um0Var != null) {
            ImageView imageView = (ImageView) um0Var.g;
            if (i != 0) {
                Drawable drawableF = jn.f(imageView.getContext(), i);
                if (drawableF != null) {
                    sf.a(drawableF);
                }
                imageView.setImageDrawable(drawableF);
            } else {
                imageView.setImageDrawable(null);
            }
            um0Var.a();
        }
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        um0 um0Var = this.g;
        if (um0Var != null) {
            um0Var.a();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        ts2 ts2Var = this.f;
        if (ts2Var != null) {
            ts2Var.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        ts2 ts2Var = this.f;
        if (ts2Var != null) {
            ts2Var.i(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        um0 um0Var = this.g;
        if (um0Var != null) {
            if (((g92) um0Var.h) == null) {
                um0Var.h = new g92();
            }
            g92 g92Var = (g92) um0Var.h;
            g92Var.c = colorStateList;
            g92Var.b = true;
            um0Var.a();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        um0 um0Var = this.g;
        if (um0Var != null) {
            if (((g92) um0Var.h) == null) {
                um0Var.h = new g92();
            }
            g92 g92Var = (g92) um0Var.h;
            g92Var.d = mode;
            g92Var.a = true;
            um0Var.a();
        }
    }
}
