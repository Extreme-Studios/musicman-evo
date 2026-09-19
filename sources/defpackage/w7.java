package defpackage;

import android.content.Context;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes.dex */
public abstract class w7 extends ViewGroup {
    public final yy1 f;

    public w7(Context context) {
        super(context);
        this.f = new yy1(this, null, 0);
    }

    public final void a() {
        lx0.a(getContext());
        if (((Boolean) py0.e.u()).booleanValue()) {
            if (((Boolean) tu0.e.c.a(lx0.Tb)).booleanValue()) {
                xs0.b.execute(new eu1(this, 2));
                return;
            }
        }
        yy1 yy1Var = this.f;
        yy1Var.getClass();
        try {
            n71 n71Var = yy1Var.i;
            if (n71Var != null) {
                n71Var.r();
            }
        } catch (RemoteException e) {
            jn.Z("#007 Could not call remote method.", e);
        }
    }

    public final void b(q2 q2Var) {
        dq.d("#008 Must be called on the main UI thread.");
        lx0.a(getContext());
        if (((Boolean) py0.f.u()).booleanValue()) {
            if (((Boolean) tu0.e.c.a(lx0.Wb)).booleanValue()) {
                xs0.b.execute(new hb1(this, q2Var, 10, false));
                return;
            }
        }
        this.f.b(q2Var.a);
    }

    public final void c() {
        lx0.a(getContext());
        if (((Boolean) py0.g.u()).booleanValue()) {
            if (((Boolean) tu0.e.c.a(lx0.Ub)).booleanValue()) {
                xs0.b.execute(new eu1(this, 0));
                return;
            }
        }
        yy1 yy1Var = this.f;
        yy1Var.getClass();
        try {
            n71 n71Var = yy1Var.i;
            if (n71Var != null) {
                n71Var.d();
            }
        } catch (RemoteException e) {
            jn.Z("#007 Could not call remote method.", e);
        }
    }

    public final void d() {
        lx0.a(getContext());
        if (((Boolean) py0.h.u()).booleanValue()) {
            if (((Boolean) tu0.e.c.a(lx0.Sb)).booleanValue()) {
                xs0.b.execute(new eu1(this, 1));
                return;
            }
        }
        yy1 yy1Var = this.f;
        yy1Var.getClass();
        try {
            n71 n71Var = yy1Var.i;
            if (n71Var != null) {
                n71Var.e();
            }
        } catch (RemoteException e) {
            jn.Z("#007 Could not call remote method.", e);
        }
    }

    public i2 getAdListener() {
        return this.f.f;
    }

    public s2 getAdSize() {
        kb3 kb3VarO;
        yy1 yy1Var = this.f;
        yy1Var.getClass();
        try {
            n71 n71Var = yy1Var.i;
            if (n71Var != null && (kb3VarO = n71Var.o()) != null) {
                return new s2(kb3VarO.f, kb3VarO.j, kb3VarO.g);
            }
        } catch (RemoteException e) {
            jn.Z("#007 Could not call remote method.", e);
        }
        s2[] s2VarArr = yy1Var.g;
        if (s2VarArr != null) {
            return s2VarArr[0];
        }
        return null;
    }

    public String getAdUnitId() {
        n71 n71Var;
        yy1 yy1Var = this.f;
        if (yy1Var.k == null && (n71Var = yy1Var.i) != null) {
            try {
                yy1Var.k = n71Var.v();
            } catch (RemoteException e) {
                jn.Z("#007 Could not call remote method.", e);
            }
        }
        return yy1Var.k;
    }

    public zu getOnPaidEventListener() {
        this.f.getClass();
        return null;
    }

    public long getPlacementId() {
        yy1 yy1Var = this.f;
        AtomicLong atomicLong = yy1Var.n;
        if (atomicLong.get() != 0) {
            return atomicLong.get();
        }
        try {
            n71 n71Var = yy1Var.i;
            if (n71Var == null) {
                return 0L;
            }
            atomicLong.set(n71Var.k0());
            return atomicLong.get();
        } catch (RemoteException e) {
            jn.Z("#007 Could not call remote method.", e);
            return 0L;
        }
    }

    public qx getResponseInfo() {
        lu1 lu1VarM;
        yy1 yy1Var = this.f;
        yy1Var.getClass();
        try {
            n71 n71Var = yy1Var.i;
            lu1VarM = n71Var != null ? n71Var.M() : null;
        } catch (RemoteException e) {
            jn.Z("#007 Could not call remote method.", e);
        }
        if (lu1VarM != null) {
            return new qx(lu1VarM);
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View childAt = getChildAt(0);
        if (childAt == null || childAt.getVisibility() == 8) {
            return;
        }
        int measuredWidth = childAt.getMeasuredWidth();
        int measuredHeight = childAt.getMeasuredHeight();
        int i5 = ((i3 - i) - measuredWidth) / 2;
        int i6 = ((i4 - i2) - measuredHeight) / 2;
        childAt.layout(i5, i6, measuredWidth + i5, measuredHeight + i6);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        s2 adSize;
        int measuredHeight;
        int iB;
        int iB2;
        int i3;
        int measuredWidth = 0;
        View childAt = getChildAt(0);
        if (childAt == null || childAt.getVisibility() == 8) {
            try {
                adSize = getAdSize();
            } catch (NullPointerException e) {
                jn.P("Unable to retrieve ad size.", e);
                adSize = null;
            }
            if (adSize != null) {
                Context context = getContext();
                int i4 = adSize.a;
                if (i4 == -3) {
                    iB = -1;
                } else if (i4 != -1) {
                    f32 f32Var = ut0.f.a;
                    iB = f32.b(context, i4);
                } else {
                    iB = context.getResources().getDisplayMetrics().widthPixels;
                }
                int i5 = adSize.b;
                if (i5 == -4 || i5 == -3) {
                    iB2 = -1;
                } else if (i5 != -2) {
                    f32 f32Var2 = ut0.f.a;
                    iB2 = f32.b(context, i5);
                } else {
                    DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
                    float f = displayMetrics.heightPixels;
                    float f2 = displayMetrics.density;
                    int i6 = (int) (f / f2);
                    if (i6 <= 400) {
                        i3 = 32;
                    } else {
                        i3 = i6 <= 720 ? 50 : 90;
                    }
                    iB2 = (int) (i3 * f2);
                }
                measuredHeight = iB2;
                measuredWidth = iB;
            } else {
                measuredHeight = 0;
            }
        } else {
            measureChild(childAt, i, i2);
            measuredWidth = childAt.getMeasuredWidth();
            measuredHeight = childAt.getMeasuredHeight();
        }
        setMeasuredDimension(View.resolveSize(Math.max(measuredWidth, getSuggestedMinimumWidth()), i), View.resolveSize(Math.max(measuredHeight, getSuggestedMinimumHeight()), i2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setAdListener(i2 i2Var) {
        yy1 yy1Var = this.f;
        yy1Var.f = i2Var;
        tt1 tt1Var = yy1Var.d;
        synchronized (tt1Var.g) {
            tt1Var.h = i2Var;
        }
        if (i2Var == 0) {
            yy1Var.c(null);
            return;
        }
        if (i2Var instanceof ib0) {
            yy1Var.c((ib0) i2Var);
        }
        if (i2Var instanceof v6) {
            yy1Var.e((v6) i2Var);
        }
    }

    public void setAdSize(s2 s2Var) {
        s2[] s2VarArr = {s2Var};
        yy1 yy1Var = this.f;
        if (yy1Var.g == null) {
            yy1Var.d(s2VarArr);
        } else {
            j7.e("The ad size can only be set once on AdView.");
        }
    }

    public void setAdUnitId(String str) {
        yy1 yy1Var = this.f;
        if (yy1Var.k == null) {
            yy1Var.k = str;
        } else {
            j7.e("The ad unit ID can only be set once on AdView.");
        }
    }

    public void setOnPaidEventListener(zu zuVar) {
        yy1 yy1Var = this.f;
        yy1Var.getClass();
        try {
            n71 n71Var = yy1Var.i;
            if (n71Var != null) {
                n71Var.a2(new ka2());
            }
        } catch (RemoteException e) {
            jn.Z("#007 Could not call remote method.", e);
        }
    }

    public void setPlacementId(long j) {
        yy1 yy1Var = this.f;
        yy1Var.n.set(j);
        try {
            n71 n71Var = yy1Var.i;
            if (n71Var != null) {
                n71Var.t1(j);
            }
        } catch (RemoteException e) {
            jn.Z("#007 Could not call remote method.", e);
        }
    }

    public w7(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f = new yy1(this, attributeSet, 0);
    }

    public w7(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f = new yy1(this, attributeSet, 0);
    }
}
