package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import defpackage.is;
import defpackage.lw;
import defpackage.r52;
import defpackage.rr;
import defpackage.ur;

/* JADX INFO: loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements is, AbsListView.SelectionBoundsAdjuster {
    public ur f;
    public ImageView g;
    public RadioButton h;
    public TextView i;
    public CheckBox j;
    public TextView k;
    public ImageView l;
    public ImageView m;
    public LinearLayout n;
    public final Drawable o;
    public final int p;
    public final Context q;
    public boolean r;
    public final Drawable s;
    public final boolean t;
    public LayoutInflater u;
    public boolean v;

    public ListMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        r52 r52VarR = r52.r(getContext(), attributeSet, lw.r, i);
        this.o = r52VarR.k(5);
        TypedArray typedArray = (TypedArray) r52VarR.h;
        this.p = typedArray.getResourceId(1, -1);
        this.r = typedArray.getBoolean(7, false);
        this.q = context;
        this.s = r52VarR.k(8);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{R.attr.divider}, com.extremestudios.musicmanevo.R.attr.dropDownListViewStyle, 0);
        this.t = typedArrayObtainStyledAttributes.hasValue(0);
        r52VarR.x();
        typedArrayObtainStyledAttributes.recycle();
    }

    private LayoutInflater getInflater() {
        if (this.u == null) {
            this.u = LayoutInflater.from(getContext());
        }
        return this.u;
    }

    private void setSubMenuArrowVisible(boolean z) {
        ImageView imageView = this.l;
        if (imageView != null) {
            imageView.setVisibility(z ? 0 : 8);
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0035  */
    /* JADX WARN: Code duplicated, block: B:25:0x0054  */
    /* JADX WARN: Code duplicated, block: B:28:0x0058  */
    @Override // defpackage.is
    public final void a(ur urVar) {
        boolean z;
        int i;
        String string;
        boolean z2;
        this.f = urVar;
        boolean zIsVisible = urVar.isVisible();
        rr rrVar = urVar.n;
        setVisibility(zIsVisible ? 0 : 8);
        setTitle(urVar.e);
        setCheckable(urVar.isCheckable());
        if (rrVar.o()) {
            if ((rrVar.n() ? urVar.j : urVar.h) != 0) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        rrVar.n();
        if (z) {
            ur urVar2 = this.f;
            rr rrVar2 = urVar2.n;
            if (rrVar2.o()) {
                if ((rrVar2.n() ? urVar2.j : urVar2.h) != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
            } else {
                z2 = false;
            }
            i = z2 ? 0 : 8;
        }
        if (i == 0) {
            TextView textView = this.k;
            ur urVar3 = this.f;
            rr rrVar3 = urVar3.n;
            Context context = rrVar3.a;
            char c = rrVar3.n() ? urVar3.j : urVar3.h;
            if (c == 0) {
                string = "";
            } else {
                Resources resources = context.getResources();
                StringBuilder sb = new StringBuilder();
                if (ViewConfiguration.get(context).hasPermanentMenuKey()) {
                    sb.append(resources.getString(com.extremestudios.musicmanevo.R.string.abc_prepend_shortcut_label));
                }
                int i2 = rrVar3.n() ? urVar3.k : urVar3.i;
                ur.c(sb, i2, 65536, resources.getString(com.extremestudios.musicmanevo.R.string.abc_menu_meta_shortcut_label));
                ur.c(sb, i2, 4096, resources.getString(com.extremestudios.musicmanevo.R.string.abc_menu_ctrl_shortcut_label));
                ur.c(sb, i2, 2, resources.getString(com.extremestudios.musicmanevo.R.string.abc_menu_alt_shortcut_label));
                ur.c(sb, i2, 1, resources.getString(com.extremestudios.musicmanevo.R.string.abc_menu_shift_shortcut_label));
                ur.c(sb, i2, 4, resources.getString(com.extremestudios.musicmanevo.R.string.abc_menu_sym_shortcut_label));
                ur.c(sb, i2, 8, resources.getString(com.extremestudios.musicmanevo.R.string.abc_menu_function_shortcut_label));
                if (c == '\b') {
                    sb.append(resources.getString(com.extremestudios.musicmanevo.R.string.abc_menu_delete_shortcut_label));
                } else if (c == '\n') {
                    sb.append(resources.getString(com.extremestudios.musicmanevo.R.string.abc_menu_enter_shortcut_label));
                } else if (c != ' ') {
                    sb.append(c);
                } else {
                    sb.append(resources.getString(com.extremestudios.musicmanevo.R.string.abc_menu_space_shortcut_label));
                }
                string = sb.toString();
            }
            textView.setText(string);
        }
        if (this.k.getVisibility() != i) {
            this.k.setVisibility(i);
        }
        setIcon(urVar.getIcon());
        setEnabled(urVar.isEnabled());
        setSubMenuArrowVisible(urVar.hasSubMenu());
        setContentDescription(urVar.q);
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public final void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.m;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.m.getLayoutParams();
        rect.top = this.m.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin + rect.top;
    }

    @Override // defpackage.is
    public ur getItemData() {
        return this.f;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        setBackground(this.o);
        TextView textView = (TextView) findViewById(com.extremestudios.musicmanevo.R.id.title);
        this.i = textView;
        int i = this.p;
        if (i != -1) {
            textView.setTextAppearance(this.q, i);
        }
        this.k = (TextView) findViewById(com.extremestudios.musicmanevo.R.id.shortcut);
        ImageView imageView = (ImageView) findViewById(com.extremestudios.musicmanevo.R.id.submenuarrow);
        this.l = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.s);
        }
        this.m = (ImageView) findViewById(com.extremestudios.musicmanevo.R.id.group_divider);
        this.n = (LinearLayout) findViewById(com.extremestudios.musicmanevo.R.id.content);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        if (this.g != null && this.r) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.g.getLayoutParams();
            int i3 = layoutParams.height;
            if (i3 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i3;
            }
        }
        super.onMeasure(i, i2);
    }

    public void setCheckable(boolean z) {
        CompoundButton compoundButton;
        View view;
        if (!z && this.h == null && this.j == null) {
            return;
        }
        if ((this.f.x & 4) != 0) {
            if (this.h == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(com.extremestudios.musicmanevo.R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.h = radioButton;
                LinearLayout linearLayout = this.n;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.h;
            view = this.j;
        } else {
            if (this.j == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(com.extremestudios.musicmanevo.R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.j = checkBox;
                LinearLayout linearLayout2 = this.n;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.j;
            view = this.h;
        }
        if (z) {
            compoundButton.setChecked(this.f.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (view == null || view.getVisibility() == 8) {
                return;
            }
            view.setVisibility(8);
            return;
        }
        CheckBox checkBox2 = this.j;
        if (checkBox2 != null) {
            checkBox2.setVisibility(8);
        }
        RadioButton radioButton2 = this.h;
        if (radioButton2 != null) {
            radioButton2.setVisibility(8);
        }
    }

    public void setChecked(boolean z) {
        CompoundButton compoundButton;
        if ((this.f.x & 4) != 0) {
            if (this.h == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(com.extremestudios.musicmanevo.R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.h = radioButton;
                LinearLayout linearLayout = this.n;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.h;
        } else {
            if (this.j == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(com.extremestudios.musicmanevo.R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.j = checkBox;
                LinearLayout linearLayout2 = this.n;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.j;
        }
        compoundButton.setChecked(z);
    }

    public void setForceShowIcon(boolean z) {
        this.v = z;
        this.r = z;
    }

    public void setGroupDividerEnabled(boolean z) {
        ImageView imageView = this.m;
        if (imageView != null) {
            imageView.setVisibility((this.t || !z) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        rr rrVar = this.f.n;
        boolean z = this.v;
        if (z || this.r) {
            ImageView imageView = this.g;
            if (imageView == null && drawable == null && !this.r) {
                return;
            }
            if (imageView == null) {
                ImageView imageView2 = (ImageView) getInflater().inflate(com.extremestudios.musicmanevo.R.layout.abc_list_menu_item_icon, (ViewGroup) this, false);
                this.g = imageView2;
                LinearLayout linearLayout = this.n;
                if (linearLayout != null) {
                    linearLayout.addView(imageView2, 0);
                } else {
                    addView(imageView2, 0);
                }
            }
            if (drawable == null && !this.r) {
                this.g.setVisibility(8);
                return;
            }
            ImageView imageView3 = this.g;
            if (!z) {
                drawable = null;
            }
            imageView3.setImageDrawable(drawable);
            if (this.g.getVisibility() != 0) {
                this.g.setVisibility(0);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        TextView textView = this.i;
        if (charSequence == null) {
            if (textView.getVisibility() != 8) {
                this.i.setVisibility(8);
            }
        } else {
            textView.setText(charSequence);
            if (this.i.getVisibility() != 0) {
                this.i.setVisibility(0);
            }
        }
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.extremestudios.musicmanevo.R.attr.listMenuViewStyle);
    }
}
