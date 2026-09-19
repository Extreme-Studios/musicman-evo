package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.ActionMenuView;
import com.extremestudios.musicmanevo.R;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class r1 implements hs {
    public p1 A;
    public final Context f;
    public Context g;
    public rr h;
    public final LayoutInflater i;
    public gs j;
    public js m;
    public q1 n;
    public Drawable o;
    public boolean p;
    public boolean q;
    public boolean r;
    public int s;
    public int t;
    public int u;
    public boolean v;
    public o1 x;
    public o1 y;
    public in2 z;
    public final int k = R.layout.abc_action_menu_layout;
    public final int l = R.layout.abc_action_menu_item_layout;
    public final SparseBooleanArray w = new SparseBooleanArray();
    public final kc2 B = new kc2(1, this);

    public r1(Context context) {
        this.f = context;
        this.i = LayoutInflater.from(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final View a(ur urVar, View view, ViewGroup viewGroup) {
        View actionView = urVar.getActionView();
        if (actionView == null || urVar.e()) {
            is isVar = view instanceof is ? (is) view : (is) this.i.inflate(this.l, viewGroup, false);
            isVar.a(urVar);
            ActionMenuItemView actionMenuItemView = (ActionMenuItemView) isVar;
            actionMenuItemView.setItemInvoker((ActionMenuView) this.m);
            if (this.A == null) {
                this.A = new p1(this);
            }
            actionMenuItemView.setPopupCallback(this.A);
            actionView = (View) isVar;
        }
        actionView.setVisibility(urVar.C ? 8 : 0);
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        ((ActionMenuView) viewGroup).getClass();
        if (!(layoutParams instanceof t1)) {
            actionView.setLayoutParams(ActionMenuView.j(layoutParams));
        }
        return actionView;
    }

    @Override // defpackage.hs
    public final boolean b(ur urVar) {
        return false;
    }

    @Override // defpackage.hs
    public final void c(rr rrVar, boolean z) {
        d();
        o1 o1Var = this.y;
        if (o1Var != null && o1Var.b()) {
            o1Var.i.dismiss();
        }
        gs gsVar = this.j;
        if (gsVar != null) {
            gsVar.c(rrVar, z);
        }
    }

    public final boolean d() {
        Object obj;
        in2 in2Var = this.z;
        if (in2Var != null && (obj = this.m) != null) {
            ((View) obj).removeCallbacks(in2Var);
            this.z = null;
            return true;
        }
        o1 o1Var = this.x;
        if (o1Var == null) {
            return false;
        }
        if (o1Var.b()) {
            o1Var.i.dismiss();
        }
        return true;
    }

    @Override // defpackage.hs
    public final void e(gs gsVar) {
        throw null;
    }

    @Override // defpackage.hs
    public final boolean f(ur urVar) {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.hs
    public final void g() {
        int i;
        ViewGroup viewGroup = (ViewGroup) this.m;
        ArrayList arrayList = null;
        boolean z = false;
        if (viewGroup != null) {
            rr rrVar = this.h;
            if (rrVar != null) {
                rrVar.i();
                ArrayList arrayListL = this.h.l();
                int size = arrayListL.size();
                i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    ur urVar = (ur) arrayListL.get(i2);
                    if ((urVar.x & 32) == 32) {
                        View childAt = viewGroup.getChildAt(i);
                        ur itemData = childAt instanceof is ? ((is) childAt).getItemData() : null;
                        View viewA = a(urVar, childAt, viewGroup);
                        if (urVar != itemData) {
                            viewA.setPressed(false);
                            viewA.jumpDrawablesToCurrentState();
                        }
                        if (viewA != childAt) {
                            ViewGroup viewGroup2 = (ViewGroup) viewA.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(viewA);
                            }
                            ((ViewGroup) this.m).addView(viewA, i);
                        }
                        i++;
                    }
                }
            } else {
                i = 0;
            }
            while (i < viewGroup.getChildCount()) {
                if (viewGroup.getChildAt(i) == this.n) {
                    i++;
                } else {
                    viewGroup.removeViewAt(i);
                }
            }
        }
        ((View) this.m).requestLayout();
        rr rrVar2 = this.h;
        if (rrVar2 != null) {
            rrVar2.i();
            ArrayList arrayList2 = rrVar2.i;
            int size2 = arrayList2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                vr vrVar = ((ur) arrayList2.get(i3)).A;
            }
        }
        rr rrVar3 = this.h;
        if (rrVar3 != null) {
            rrVar3.i();
            arrayList = rrVar3.j;
        }
        if (this.q && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 == 1) {
                z = !((ur) arrayList.get(0)).C;
            } else if (size3 > 0) {
                z = true;
            }
        }
        q1 q1Var = this.n;
        if (z) {
            if (q1Var == null) {
                this.n = new q1(this, this.f);
            }
            ViewGroup viewGroup3 = (ViewGroup) this.n.getParent();
            if (viewGroup3 != this.m) {
                if (viewGroup3 != null) {
                    viewGroup3.removeView(this.n);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.m;
                q1 q1Var2 = this.n;
                actionMenuView.getClass();
                t1 t1VarI = ActionMenuView.i();
                t1VarI.a = true;
                actionMenuView.addView(q1Var2, t1VarI);
            }
        } else if (q1Var != null) {
            Object parent = q1Var.getParent();
            Object obj = this.m;
            if (parent == obj) {
                ((ViewGroup) obj).removeView(this.n);
            }
        }
        ((ActionMenuView) this.m).setOverflowReserved(this.q);
    }

    public final boolean h() {
        o1 o1Var = this.x;
        return o1Var != null && o1Var.b();
    }

    @Override // defpackage.hs
    public final void i(Context context, rr rrVar) {
        this.g = context;
        LayoutInflater.from(context);
        this.h = rrVar;
        Resources resources = context.getResources();
        if (!this.r) {
            this.q = true;
        }
        int i = 2;
        this.s = context.getResources().getDisplayMetrics().widthPixels / 2;
        Configuration configuration = context.getResources().getConfiguration();
        int i2 = configuration.screenWidthDp;
        int i3 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i2 > 600 || ((i2 > 960 && i3 > 720) || (i2 > 720 && i3 > 960))) {
            i = 5;
        } else if (i2 >= 500 || ((i2 > 640 && i3 > 480) || (i2 > 480 && i3 > 640))) {
            i = 4;
        } else if (i2 >= 360) {
            i = 3;
        }
        this.u = i;
        int measuredWidth = this.s;
        if (this.q) {
            if (this.n == null) {
                q1 q1Var = new q1(this, this.f);
                this.n = q1Var;
                if (this.p) {
                    q1Var.setImageDrawable(this.o);
                    this.o = null;
                    this.p = false;
                }
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.n.measure(iMakeMeasureSpec, iMakeMeasureSpec);
            }
            measuredWidth -= this.n.getMeasuredWidth();
        } else {
            this.n = null;
        }
        this.t = measuredWidth;
        float f = resources.getDisplayMetrics().density;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.hs
    public final boolean j(g20 g20Var) {
        boolean z;
        if (g20Var.hasVisibleItems()) {
            g20 g20Var2 = g20Var;
            while (true) {
                rr rrVar = g20Var2.z;
                if (rrVar == this.h) {
                    break;
                }
                g20Var2 = (g20) rrVar;
            }
            ur urVar = g20Var2.A;
            ViewGroup viewGroup = (ViewGroup) this.m;
            View view = null;
            view = null;
            if (viewGroup != null) {
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = viewGroup.getChildAt(i);
                    if ((childAt instanceof is) && ((is) childAt).getItemData() == urVar) {
                        view = childAt;
                        break;
                    }
                }
            }
            if (view != null) {
                g20Var.A.getClass();
                int size = g20Var.f.size();
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        z = false;
                        break;
                    }
                    MenuItem item = g20Var.getItem(i2);
                    if (item.isVisible() && item.getIcon() != null) {
                        z = true;
                        break;
                    }
                    i2++;
                }
                o1 o1Var = new o1(this, this.g, g20Var, view);
                this.y = o1Var;
                o1Var.g = z;
                zr zrVar = o1Var.i;
                if (zrVar != null) {
                    zrVar.o(z);
                }
                o1 o1Var2 = this.y;
                if (!o1Var2.b()) {
                    if (o1Var2.e == null) {
                        j7.e("MenuPopupHelper cannot be used without an anchor");
                        return false;
                    }
                    o1Var2.d(0, 0, false, false);
                }
                gs gsVar = this.j;
                if (gsVar != null) {
                    gsVar.i(g20Var);
                }
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.hs
    public final boolean k() {
        int size;
        ArrayList arrayListL;
        int i;
        boolean z;
        r1 r1Var = this;
        rr rrVar = r1Var.h;
        if (rrVar != null) {
            arrayListL = rrVar.l();
            size = arrayListL.size();
        } else {
            size = 0;
            arrayListL = null;
        }
        int i2 = r1Var.u;
        int i3 = r1Var.t;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) r1Var.m;
        int i4 = 0;
        boolean z2 = false;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            i = 2;
            z = true;
            if (i4 >= size) {
                break;
            }
            ur urVar = (ur) arrayListL.get(i4);
            int i7 = urVar.y;
            if ((i7 & 2) == 2) {
                i5++;
            } else if ((i7 & 1) == 1) {
                i6++;
            } else {
                z2 = true;
            }
            if (r1Var.v && urVar.C) {
                i2 = 0;
            }
            i4++;
        }
        if (r1Var.q && (z2 || i6 + i5 > i2)) {
            i2--;
        }
        int i8 = i2 - i5;
        SparseBooleanArray sparseBooleanArray = r1Var.w;
        sparseBooleanArray.clear();
        int i9 = 0;
        int i10 = 0;
        while (i9 < size) {
            ur urVar2 = (ur) arrayListL.get(i9);
            int i11 = urVar2.y;
            boolean z3 = (i11 & 2) == i ? z : false;
            int i12 = urVar2.b;
            if (z3) {
                View viewA = r1Var.a(urVar2, null, viewGroup);
                viewA.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                int measuredWidth = viewA.getMeasuredWidth();
                i3 -= measuredWidth;
                if (i10 == 0) {
                    i10 = measuredWidth;
                }
                if (i12 != 0) {
                    sparseBooleanArray.put(i12, z);
                }
                urVar2.f(z);
            } else {
                if ((i11 & 1) == z) {
                    boolean z4 = sparseBooleanArray.get(i12);
                    boolean z5 = ((i8 > 0 || z4) && i3 > 0) ? z : false;
                    if (z5) {
                        View viewA2 = r1Var.a(urVar2, null, viewGroup);
                        viewA2.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                        int measuredWidth2 = viewA2.getMeasuredWidth();
                        i3 -= measuredWidth2;
                        if (i10 == 0) {
                            i10 = measuredWidth2;
                        }
                        z5 &= i3 + i10 > 0;
                    }
                    if (z5 && i12 != 0) {
                        sparseBooleanArray.put(i12, true);
                    } else if (z4) {
                        sparseBooleanArray.put(i12, false);
                        for (int i13 = 0; i13 < i9; i13++) {
                            ur urVar3 = (ur) arrayListL.get(i13);
                            if (urVar3.b == i12) {
                                if ((urVar3.x & 32) == 32) {
                                    i8++;
                                }
                                urVar3.f(false);
                            }
                        }
                    }
                    if (z5) {
                        i8--;
                    }
                    urVar2.f(z5);
                } else {
                    urVar2.f(false);
                }
                i9++;
                i = 2;
                r1Var = this;
                z = true;
            }
            i9++;
            i = 2;
            r1Var = this;
            z = true;
        }
        return z;
    }

    public final boolean l() {
        rr rrVar;
        boolean z = false;
        if (this.q && !h() && (rrVar = this.h) != null && this.m != null && this.z == null) {
            rrVar.i();
            if (!rrVar.j.isEmpty()) {
                in2 in2Var = new in2(this, new o1(this, this.g, this.h, this.n), 1, z);
                this.z = in2Var;
                ((View) this.m).post(in2Var);
                return true;
            }
        }
        return false;
    }
}
