package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import defpackage.js;
import defpackage.qr;
import defpackage.r52;
import defpackage.rr;
import defpackage.ur;

/* JADX INFO: loaded from: classes.dex */
public final class ExpandedMenuView extends ListView implements qr, js, AdapterView.OnItemClickListener {
    public static final int[] g = {R.attr.background, R.attr.divider};
    public rr f;

    public ExpandedMenuView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        r52 r52VarR = r52.r(context, attributeSet, g, i);
        TypedArray typedArray = (TypedArray) r52VarR.h;
        if (typedArray.hasValue(0)) {
            setBackgroundDrawable(r52VarR.k(0));
        }
        if (typedArray.hasValue(1)) {
            setDivider(r52VarR.k(1));
        }
        r52VarR.x();
    }

    @Override // defpackage.qr
    public final boolean a(ur urVar) {
        return this.f.q(urVar, null, 0);
    }

    @Override // defpackage.js
    public final void b(rr rrVar) {
        this.f = rrVar;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        a((ur) getAdapter().getItem(i));
    }

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.listViewStyle);
    }
}
