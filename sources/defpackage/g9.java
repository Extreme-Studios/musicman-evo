package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.util.Log;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.extremestudios.musicmanevo.R;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class g9 extends zr implements View.OnKeyListener, PopupWindow.OnDismissListener {
    public boolean A;
    public gs B;
    public ViewTreeObserver C;
    public PopupWindow.OnDismissListener D;
    public boolean E;
    public final Context g;
    public final int h;
    public final int i;
    public final boolean j;
    public final Handler k;
    public View s;
    public View t;
    public int u;
    public boolean v;
    public boolean w;
    public int x;
    public int y;
    public final ArrayList l = new ArrayList();
    public final ArrayList m = new ArrayList();
    public final s5 n = new s5(2, this);
    public final d9 o = new d9(this, 0);
    public final dr0 p = new dr0(3, this);
    public int q = 0;
    public int r = 0;
    public boolean z = false;

    public g9(Context context, View view, int i, boolean z) {
        this.g = context;
        this.s = view;
        this.i = i;
        this.j = z;
        this.u = view.getLayoutDirection() != 1 ? 1 : 0;
        Resources resources = context.getResources();
        this.h = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.k = new Handler();
    }

    @Override // defpackage.m00
    public final boolean a() {
        ArrayList arrayList = this.m;
        return arrayList.size() > 0 && ((f9) arrayList.get(0)).a.E.isShowing();
    }

    @Override // defpackage.hs
    public final void c(rr rrVar, boolean z) {
        ArrayList arrayList = this.m;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (rrVar == ((f9) arrayList.get(i)).b) {
                break;
            } else {
                i++;
            }
        }
        if (i < 0) {
            return;
        }
        int i2 = i + 1;
        if (i2 < arrayList.size()) {
            ((f9) arrayList.get(i2)).b.c(false);
        }
        f9 f9Var = (f9) arrayList.remove(i);
        rr rrVar2 = f9Var.b;
        fs fsVar = f9Var.a;
        l5 l5Var = fsVar.E;
        rrVar2.r(this);
        if (this.E) {
            cs.b(l5Var, null);
            l5Var.setAnimationStyle(0);
        }
        fsVar.dismiss();
        int size2 = arrayList.size();
        if (size2 > 0) {
            this.u = ((f9) arrayList.get(size2 - 1)).c;
        } else {
            this.u = this.s.getLayoutDirection() == 1 ? 0 : 1;
        }
        if (size2 != 0) {
            if (z) {
                ((f9) arrayList.get(0)).b.c(false);
                return;
            }
            return;
        }
        dismiss();
        gs gsVar = this.B;
        if (gsVar != null) {
            gsVar.c(rrVar, true);
        }
        ViewTreeObserver viewTreeObserver = this.C;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.C.removeGlobalOnLayoutListener(this.n);
            }
            this.C = null;
        }
        this.t.removeOnAttachStateChangeListener(this.o);
        this.D.onDismiss();
    }

    @Override // defpackage.m00
    public final void d() {
        if (a()) {
            return;
        }
        ArrayList arrayList = this.l;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            u((rr) obj);
        }
        arrayList.clear();
        View view = this.s;
        this.t = view;
        if (view != null) {
            boolean z = this.C == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.C = viewTreeObserver;
            if (z) {
                viewTreeObserver.addOnGlobalLayoutListener(this.n);
            }
            this.t.addOnAttachStateChangeListener(this.o);
        }
    }

    @Override // defpackage.m00
    public final void dismiss() {
        ArrayList arrayList = this.m;
        int size = arrayList.size();
        if (size > 0) {
            f9[] f9VarArr = (f9[]) arrayList.toArray(new f9[size]);
            for (int i = size - 1; i >= 0; i--) {
                f9 f9Var = f9VarArr[i];
                if (f9Var.a.E.isShowing()) {
                    f9Var.a.dismiss();
                }
            }
        }
    }

    @Override // defpackage.hs
    public final void e(gs gsVar) {
        this.B = gsVar;
    }

    @Override // defpackage.hs
    public final void g() {
        ArrayList arrayList = this.m;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ListAdapter adapter = ((f9) obj).a.h.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((or) adapter).notifyDataSetChanged();
        }
    }

    @Override // defpackage.m00
    public final yf h() {
        ArrayList arrayList = this.m;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((f9) arrayList.get(arrayList.size() - 1)).a.h;
    }

    @Override // defpackage.hs
    public final boolean j(g20 g20Var) {
        ArrayList arrayList = this.m;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            f9 f9Var = (f9) obj;
            if (g20Var == f9Var.b) {
                f9Var.a.h.requestFocus();
                return true;
            }
        }
        if (!g20Var.hasVisibleItems()) {
            return false;
        }
        l(g20Var);
        gs gsVar = this.B;
        if (gsVar != null) {
            gsVar.i(g20Var);
        }
        return true;
    }

    @Override // defpackage.hs
    public final boolean k() {
        return false;
    }

    @Override // defpackage.zr
    public final void l(rr rrVar) {
        rrVar.b(this, this.g);
        if (a()) {
            u(rrVar);
        } else {
            this.l.add(rrVar);
        }
    }

    @Override // defpackage.zr
    public final void n(View view) {
        if (this.s != view) {
            this.s = view;
            this.r = Gravity.getAbsoluteGravity(this.q, view.getLayoutDirection());
        }
    }

    @Override // defpackage.zr
    public final void o(boolean z) {
        this.z = z;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        f9 f9Var;
        ArrayList arrayList = this.m;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                f9Var = null;
                break;
            }
            f9Var = (f9) arrayList.get(i);
            if (!f9Var.a.E.isShowing()) {
                break;
            } else {
                i++;
            }
        }
        if (f9Var != null) {
            f9Var.b.c(false);
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // defpackage.zr
    public final void p(int i) {
        if (this.q != i) {
            this.q = i;
            this.r = Gravity.getAbsoluteGravity(i, this.s.getLayoutDirection());
        }
    }

    @Override // defpackage.zr
    public final void q(int i) {
        this.v = true;
        this.x = i;
    }

    @Override // defpackage.zr
    public final void r(PopupWindow.OnDismissListener onDismissListener) {
        this.D = onDismissListener;
    }

    @Override // defpackage.zr
    public final void s(boolean z) {
        this.A = z;
    }

    @Override // defpackage.zr
    public final void t(int i) {
        this.w = true;
        this.y = i;
    }

    /* JADX WARN: Code duplicated, block: B:69:0x0168  */
    /* JADX WARN: Multi-variable type inference failed */
    public final void u(rr rrVar) {
        boolean z;
        char c;
        View childAt;
        f9 f9Var;
        int i;
        int i2;
        int i3;
        int width;
        MenuItem item;
        or orVar;
        int headersCount;
        int firstVisiblePosition;
        Context context = this.g;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        or orVar2 = new or(rrVar, layoutInflaterFrom, this.j, R.layout.abc_cascading_menu_item_layout);
        if (!a() && this.z) {
            orVar2.c = true;
        } else if (a()) {
            int size = rrVar.f.size();
            int i4 = 0;
            while (true) {
                if (i4 >= size) {
                    z = false;
                    break;
                }
                MenuItem item2 = rrVar.getItem(i4);
                if (item2.isVisible() && item2.getIcon() != null) {
                    z = true;
                    break;
                }
                i4++;
            }
            orVar2.c = z;
        }
        int iM = zr.m(orVar2, context, this.h);
        fs fsVar = new fs(context, null, this.i, 0);
        fsVar.H = this.p;
        fsVar.u = this;
        l5 l5Var = fsVar.E;
        l5Var.setOnDismissListener(this);
        fsVar.t = this.s;
        fsVar.q = this.r;
        fsVar.D = true;
        l5Var.setFocusable(true);
        l5Var.setInputMethodMode(2);
        fsVar.p(orVar2);
        fsVar.r(iM);
        fsVar.q = this.r;
        ArrayList arrayList = this.m;
        if (arrayList.size() > 0) {
            f9Var = (f9) arrayList.get(arrayList.size() - 1);
            rr rrVar2 = f9Var.b;
            int size2 = rrVar2.f.size();
            int i5 = 0;
            while (true) {
                if (i5 >= size2) {
                    item = null;
                    break;
                }
                item = rrVar2.getItem(i5);
                if (item.hasSubMenu() && rrVar == item.getSubMenu()) {
                    break;
                } else {
                    i5++;
                }
            }
            if (item == null) {
                c = 0;
                childAt = null;
            } else {
                yf yfVar = f9Var.a.h;
                ListAdapter adapter = yfVar.getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    headersCount = headerViewListAdapter.getHeadersCount();
                    orVar = (or) headerViewListAdapter.getWrappedAdapter();
                } else {
                    orVar = (or) adapter;
                    headersCount = 0;
                }
                int count = orVar.getCount();
                int i6 = 0;
                c = 0;
                while (true) {
                    if (i6 >= count) {
                        i6 = -1;
                        break;
                    } else if (item == orVar.getItem(i6)) {
                        break;
                    } else {
                        i6++;
                    }
                }
                childAt = (i6 != -1 && (firstVisiblePosition = (i6 + headersCount) - yfVar.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < yfVar.getChildCount()) ? yfVar.getChildAt(firstVisiblePosition) : null;
            }
        } else {
            c = 0;
            childAt = null;
            f9Var = null;
        }
        if (childAt != null) {
            if (Build.VERSION.SDK_INT <= 28) {
                Method method = fs.I;
                if (method != null) {
                    try {
                        Object[] objArr = new Object[1];
                        objArr[c] = Boolean.FALSE;
                        method.invoke(l5Var, objArr);
                    } catch (Exception unused) {
                        Log.i("MenuPopupWindow", "Could not invoke setTouchModal() on PopupWindow. Oh well.");
                    }
                }
            } else {
                ds.a(l5Var, c);
            }
            cs.a(l5Var, null);
            yf yfVar2 = ((f9) arrayList.get(arrayList.size() - 1)).a.h;
            int[] iArr = new int[2];
            yfVar2.getLocationOnScreen(iArr);
            Rect rect = new Rect();
            this.t.getWindowVisibleDisplayFrame(rect);
            if (this.u == 1) {
                if (yfVar2.getWidth() + iArr[0] + iM > rect.right) {
                    i = 0;
                } else {
                    i = 1;
                }
            } else if (iArr[0] - iM < 0) {
                i = 1;
            } else {
                i = 0;
            }
            boolean z2 = i == 1;
            this.u = i;
            if (Build.VERSION.SDK_INT >= 26) {
                fsVar.t = childAt;
                i2 = 0;
                i3 = 0;
            } else {
                int[] iArr2 = new int[2];
                this.s.getLocationOnScreen(iArr2);
                int[] iArr3 = new int[2];
                childAt.getLocationOnScreen(iArr3);
                if ((this.r & 7) == 5) {
                    iArr2[0] = this.s.getWidth() + iArr2[0];
                    iArr3[0] = childAt.getWidth() + iArr3[0];
                }
                int i7 = iArr3[0] - iArr2[0];
                i2 = iArr3[1] - iArr2[1];
                i3 = i7;
            }
            if ((this.r & 5) != 5) {
                width = z2 ? i3 + childAt.getWidth() : i3 - iM;
            } else if (z2) {
                width = i3 + iM;
            } else {
                iM = childAt.getWidth();
            }
            fsVar.k = width;
            fsVar.p = true;
            fsVar.o = true;
            fsVar.i(i2);
        } else {
            if (this.v) {
                fsVar.k = this.x;
            }
            if (this.w) {
                fsVar.i(this.y);
            }
            Rect rect2 = this.f;
            fsVar.C = rect2 != null ? new Rect(rect2) : null;
        }
        arrayList.add(new f9(fsVar, rrVar, this.u));
        fsVar.d();
        yf yfVar3 = fsVar.h;
        yfVar3.setOnKeyListener(this);
        if (f9Var == null && this.A && rrVar.m != null) {
            FrameLayout frameLayout = (FrameLayout) layoutInflaterFrom.inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) yfVar3, false);
            TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
            frameLayout.setEnabled(false);
            textView.setText(rrVar.m);
            yfVar3.addHeaderView(frameLayout, null, false);
            fsVar.d();
        }
    }
}
