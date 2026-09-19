package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public final class eq extends ArrayAdapter {
    public ColorStateList a;
    public ColorStateList b;
    public final /* synthetic */ fq c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eq(fq fqVar, Context context, int i, String[] strArr) {
        super(context, i, strArr);
        this.c = fqVar;
        a();
    }

    public final void a() {
        ColorStateList colorStateList;
        fq fqVar = this.c;
        ColorStateList colorStateList2 = fqVar.p;
        ColorStateList colorStateList3 = null;
        if (colorStateList2 != null) {
            int[] iArr = {R.attr.state_pressed};
            colorStateList = new ColorStateList(new int[][]{iArr, new int[0]}, new int[]{colorStateList2.getColorForState(iArr, 0), 0});
        } else {
            colorStateList = null;
        }
        this.b = colorStateList;
        if (fqVar.o != 0 && fqVar.p != null) {
            int[] iArr2 = {R.attr.state_hovered, -16842919};
            int[] iArr3 = {R.attr.state_selected, -16842919};
            colorStateList3 = new ColorStateList(new int[][]{iArr3, iArr2, new int[0]}, new int[]{fa.b(fqVar.p.getColorForState(iArr3, 0), fqVar.o), fa.b(fqVar.p.getColorForState(iArr2, 0), fqVar.o), fqVar.o});
        }
        this.a = colorStateList3;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        View view2 = super.getView(i, view, viewGroup);
        if (view2 instanceof TextView) {
            TextView textView = (TextView) view2;
            fq fqVar = this.c;
            Drawable rippleDrawable = null;
            if (fqVar.getText().toString().contentEquals(textView.getText()) && fqVar.o != 0) {
                ColorDrawable colorDrawable = new ColorDrawable(fqVar.o);
                if (this.b != null) {
                    colorDrawable.setTintList(this.a);
                    rippleDrawable = new RippleDrawable(this.b, colorDrawable, null);
                } else {
                    rippleDrawable = colorDrawable;
                }
            }
            textView.setBackground(rippleDrawable);
        }
        return view2;
    }
}
