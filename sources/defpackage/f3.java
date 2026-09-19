package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import androidx.core.widget.NestedScrollView;
import com.extremestudios.musicmanevo.R;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class f3 extends ya implements DialogInterface, f4 {
    public c5 i;
    public final d5 j;
    public final d3 k;

    /* JADX WARN: Type inference failed for: r2v2, types: [d5] */
    public f3(ContextThemeWrapper contextThemeWrapper, int i) {
        int i2;
        int iG = g(contextThemeWrapper, i);
        if (iG == 0) {
            TypedValue typedValue = new TypedValue();
            contextThemeWrapper.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue, true);
            i2 = typedValue.resourceId;
        } else {
            i2 = iG;
        }
        super(contextThemeWrapper, i2);
        this.j = new yn() { // from class: d5
            @Override // defpackage.yn
            public final boolean a(KeyEvent keyEvent) {
                return this.f.i(keyEvent);
            }
        };
        p4 p4VarD = d();
        if (iG == 0) {
            TypedValue typedValue2 = new TypedValue();
            contextThemeWrapper.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue2, true);
            iG = typedValue2.resourceId;
        }
        ((c5) p4VarD).X = iG;
        p4VarD.c();
        this.k = new d3(getContext(), this, getWindow());
    }

    public static int g(Context context, int i) {
        if (((i >>> 24) & 255) >= 1) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    @Override // defpackage.ya, android.app.Dialog
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        c();
        c5 c5Var = (c5) d();
        c5Var.v();
        ((ViewGroup) c5Var.E.findViewById(android.R.id.content)).addView(view, layoutParams);
        c5Var.r.a(c5Var.q.getCallback());
    }

    public final p4 d() {
        if (this.i == null) {
            n4 n4Var = p4.f;
            this.i = new c5(getContext(), getWindow(), this, this);
        }
        return this.i;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        super.dismiss();
        d().d();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return v51.h(this.j, getWindow().getDecorView(), this, keyEvent);
    }

    public final void f(Bundle bundle) {
        d().a();
        super.onCreate(bundle);
        d().c();
    }

    @Override // android.app.Dialog
    public final View findViewById(int i) {
        c5 c5Var = (c5) d();
        c5Var.v();
        return c5Var.q.findViewById(i);
    }

    public final void h(CharSequence charSequence) {
        super.setTitle(charSequence);
        d().k(charSequence);
    }

    public final boolean i(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Dialog
    public final void invalidateOptionsMenu() {
        c5 c5Var = (c5) d();
        if (c5Var.s != null) {
            c5Var.z();
            c5Var.s.getClass();
            c5Var.A(0);
        }
    }

    @Override // defpackage.ya, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        int i;
        ListAdapter listAdapter;
        View viewFindViewById;
        f(bundle);
        d3 d3Var = this.k;
        d3Var.b.setContentView(d3Var.q);
        Context context = d3Var.a;
        Window window = d3Var.c;
        View viewFindViewById2 = window.findViewById(R.id.parentPanel);
        View viewFindViewById3 = viewFindViewById2.findViewById(R.id.topPanel);
        View viewFindViewById4 = viewFindViewById2.findViewById(R.id.contentPanel);
        View viewFindViewById5 = viewFindViewById2.findViewById(R.id.buttonPanel);
        ViewGroup viewGroup = (ViewGroup) viewFindViewById2.findViewById(R.id.customPanel);
        window.setFlags(131072, 131072);
        viewGroup.setVisibility(8);
        View viewFindViewById6 = viewGroup.findViewById(R.id.topPanel);
        View viewFindViewById7 = viewGroup.findViewById(R.id.contentPanel);
        View viewFindViewById8 = viewGroup.findViewById(R.id.buttonPanel);
        ViewGroup viewGroupA = d3.a(viewFindViewById6, viewFindViewById3);
        ViewGroup viewGroupA2 = d3.a(viewFindViewById7, viewFindViewById4);
        ViewGroup viewGroupA3 = d3.a(viewFindViewById8, viewFindViewById5);
        NestedScrollView nestedScrollView = (NestedScrollView) window.findViewById(R.id.scrollView);
        d3Var.i = nestedScrollView;
        nestedScrollView.setFocusable(false);
        d3Var.i.setNestedScrollingEnabled(false);
        TextView textView = (TextView) viewGroupA2.findViewById(android.R.id.message);
        d3Var.m = textView;
        if (textView != null) {
            textView.setVisibility(8);
            d3Var.i.removeView(d3Var.m);
            if (d3Var.e != null) {
                ViewGroup viewGroup2 = (ViewGroup) d3Var.i.getParent();
                int iIndexOfChild = viewGroup2.indexOfChild(d3Var.i);
                viewGroup2.removeViewAt(iIndexOfChild);
                viewGroup2.addView(d3Var.e, iIndexOfChild, new ViewGroup.LayoutParams(-1, -1));
            } else {
                viewGroupA2.setVisibility(8);
            }
        }
        Button button = (Button) viewGroupA3.findViewById(android.R.id.button1);
        d3Var.f = button;
        f1 f1Var = d3Var.w;
        button.setOnClickListener(f1Var);
        boolean zIsEmpty = TextUtils.isEmpty(null);
        Button button2 = d3Var.f;
        if (zIsEmpty) {
            button2.setVisibility(8);
            i = 0;
        } else {
            button2.setText((CharSequence) null);
            d3Var.f.setVisibility(0);
            i = 1;
        }
        Button button3 = (Button) viewGroupA3.findViewById(android.R.id.button2);
        d3Var.g = button3;
        button3.setOnClickListener(f1Var);
        boolean zIsEmpty2 = TextUtils.isEmpty(null);
        Button button4 = d3Var.g;
        if (zIsEmpty2) {
            button4.setVisibility(8);
        } else {
            button4.setText((CharSequence) null);
            d3Var.g.setVisibility(0);
            i |= 2;
        }
        Button button5 = (Button) viewGroupA3.findViewById(android.R.id.button3);
        d3Var.h = button5;
        button5.setOnClickListener(f1Var);
        boolean zIsEmpty3 = TextUtils.isEmpty(null);
        Button button6 = d3Var.h;
        if (zIsEmpty3) {
            button6.setVisibility(8);
        } else {
            button6.setText((CharSequence) null);
            d3Var.h.setVisibility(0);
            i |= 4;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogCenterButtons, typedValue, true);
        if (typedValue.data != 0) {
            if (i == 1) {
                Button button7 = d3Var.f;
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button7.getLayoutParams();
                layoutParams.gravity = 1;
                layoutParams.weight = 0.5f;
                button7.setLayoutParams(layoutParams);
            } else if (i == 2) {
                Button button8 = d3Var.g;
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) button8.getLayoutParams();
                layoutParams2.gravity = 1;
                layoutParams2.weight = 0.5f;
                button8.setLayoutParams(layoutParams2);
            } else if (i == 4) {
                Button button9 = d3Var.h;
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) button9.getLayoutParams();
                layoutParams3.gravity = 1;
                layoutParams3.weight = 0.5f;
                button9.setLayoutParams(layoutParams3);
            }
        }
        if (i == 0) {
            viewGroupA3.setVisibility(8);
        }
        if (d3Var.n != null) {
            viewGroupA.addView(d3Var.n, 0, new ViewGroup.LayoutParams(-1, -2));
            window.findViewById(R.id.title_template).setVisibility(8);
        } else {
            d3Var.k = (ImageView) window.findViewById(android.R.id.icon);
            if (TextUtils.isEmpty(d3Var.d) || !d3Var.u) {
                window.findViewById(R.id.title_template).setVisibility(8);
                d3Var.k.setVisibility(8);
                viewGroupA.setVisibility(8);
            } else {
                TextView textView2 = (TextView) window.findViewById(R.id.alertTitle);
                d3Var.l = textView2;
                textView2.setText(d3Var.d);
                Drawable drawable = d3Var.j;
                if (drawable != null) {
                    d3Var.k.setImageDrawable(drawable);
                } else {
                    d3Var.l.setPadding(d3Var.k.getPaddingLeft(), d3Var.k.getPaddingTop(), d3Var.k.getPaddingRight(), d3Var.k.getPaddingBottom());
                    d3Var.k.setVisibility(8);
                }
            }
        }
        boolean z = viewGroup.getVisibility() != 8;
        int i2 = (viewGroupA == null || viewGroupA.getVisibility() == 8) ? 0 : 1;
        boolean z2 = viewGroupA3.getVisibility() != 8;
        if (!z2 && (viewFindViewById = viewGroupA2.findViewById(R.id.textSpacerNoButtons)) != null) {
            viewFindViewById.setVisibility(0);
        }
        if (i2 != 0) {
            NestedScrollView nestedScrollView2 = d3Var.i;
            if (nestedScrollView2 != null) {
                nestedScrollView2.setClipToPadding(true);
            }
            View viewFindViewById9 = d3Var.e != null ? viewGroupA.findViewById(R.id.titleDividerNoCustom) : null;
            if (viewFindViewById9 != null) {
                viewFindViewById9.setVisibility(0);
            }
        } else {
            View viewFindViewById10 = viewGroupA2.findViewById(R.id.textSpacerNoTitle);
            if (viewFindViewById10 != null) {
                viewFindViewById10.setVisibility(0);
            }
        }
        AlertController$RecycleListView alertController$RecycleListView = d3Var.e;
        if (alertController$RecycleListView != null && (!z2 || i2 == 0)) {
            alertController$RecycleListView.setPadding(alertController$RecycleListView.getPaddingLeft(), i2 != 0 ? alertController$RecycleListView.getPaddingTop() : alertController$RecycleListView.f, alertController$RecycleListView.getPaddingRight(), z2 ? alertController$RecycleListView.getPaddingBottom() : alertController$RecycleListView.g);
        }
        if (!z) {
            View view = d3Var.e;
            if (view == null) {
                view = d3Var.i;
            }
            if (view != null) {
                int i3 = z2 ? 2 : 0;
                View viewFindViewById11 = window.findViewById(R.id.scrollIndicatorUp);
                View viewFindViewById12 = window.findViewById(R.id.scrollIndicatorDown);
                WeakHashMap weakHashMap = w60.a;
                q60.b(view, i2 | i3, 3);
                if (viewFindViewById11 != null) {
                    viewGroupA2.removeView(viewFindViewById11);
                }
                if (viewFindViewById12 != null) {
                    viewGroupA2.removeView(viewFindViewById12);
                }
            }
        }
        AlertController$RecycleListView alertController$RecycleListView2 = d3Var.e;
        if (alertController$RecycleListView2 == null || (listAdapter = d3Var.o) == null) {
            return;
        }
        alertController$RecycleListView2.setAdapter(listAdapter);
        int i4 = d3Var.p;
        if (i4 > -1) {
            alertController$RecycleListView2.setItemChecked(i4, true);
            alertController$RecycleListView2.setSelection(i4);
        }
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.k.i;
        if (nestedScrollView == null || !nestedScrollView.j(keyEvent)) {
            return super.onKeyDown(i, keyEvent);
        }
        return true;
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.k.i;
        if (nestedScrollView == null || !nestedScrollView.j(keyEvent)) {
            return super.onKeyUp(i, keyEvent);
        }
        return true;
    }

    @Override // defpackage.ya, android.app.Dialog
    public final void onStop() {
        super.onStop();
        c5 c5Var = (c5) d();
        c5Var.z();
        g80 g80Var = c5Var.s;
        if (g80Var != null) {
            g80Var.t = false;
            i70 i70Var = g80Var.s;
            if (i70Var != null) {
                i70Var.a();
            }
        }
    }

    @Override // defpackage.ya, android.app.Dialog
    public final void setContentView(int i) {
        c();
        d().g(i);
    }

    @Override // android.app.Dialog
    public final void setTitle(int i) {
        super.setTitle(i);
        d().k(getContext().getString(i));
    }

    @Override // defpackage.ya, android.app.Dialog
    public final void setContentView(View view) {
        c();
        d().h(view);
    }

    @Override // defpackage.ya, android.app.Dialog
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        c();
        d().j(view, layoutParams);
    }

    @Override // android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        h(charSequence);
        d3 d3Var = this.k;
        d3Var.d = charSequence;
        TextView textView = d3Var.l;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }
}
