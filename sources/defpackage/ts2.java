package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.View;
import java.security.GeneralSecurityException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class ts2 implements ys2 {
    public int f;
    public final Object g;
    public final Object h;
    public Object i;
    public Object j;
    public Object k;

    public ts2(z82 z82Var) {
        this.g = z82Var;
        this.h = new ArrayDeque();
        this.i = new ArrayDeque();
        this.j = new PriorityQueue();
        this.f = -1;
    }

    public static ts2 j(String str, n13 n13Var, int i, yw2 yw2Var, Integer num) throws GeneralSecurityException {
        if (yw2Var == yw2.RAW) {
            if (num != null) {
                j7.r("Keys with output prefix type raw should not have an id requirement.");
                return null;
            }
        } else if (num == null) {
            j7.r("Keys with output prefix type different from raw should have an id requirement.");
            return null;
        }
        return new ts2(str, ct2.b(str), n13Var, i, yw2Var, num);
    }

    public void a() {
        View view = (View) this.g;
        Drawable background = view.getBackground();
        if (background != null) {
            if (((g92) this.i) != null) {
                if (((g92) this.k) == null) {
                    this.k = new g92();
                }
                g92 g92Var = (g92) this.k;
                g92Var.c = null;
                g92Var.b = false;
                g92Var.d = null;
                g92Var.a = false;
                WeakHashMap weakHashMap = w60.a;
                ColorStateList colorStateListC = p60.c(view);
                if (colorStateListC != null) {
                    g92Var.b = true;
                    g92Var.c = colorStateListC;
                }
                PorterDuff.Mode modeD = p60.d(view);
                if (modeD != null) {
                    g92Var.a = true;
                    g92Var.d = modeD;
                }
                if (g92Var.b || g92Var.a) {
                    e5.d(background, g92Var, view.getDrawableState());
                    return;
                }
            }
            g92 g92Var2 = (g92) this.j;
            if (g92Var2 != null) {
                e5.d(background, g92Var2, view.getDrawableState());
                return;
            }
            g92 g92Var3 = (g92) this.i;
            if (g92Var3 != null) {
                e5.d(background, g92Var3, view.getDrawableState());
            }
        }
    }

    public ColorStateList b() {
        g92 g92Var = (g92) this.j;
        if (g92Var != null) {
            return (ColorStateList) g92Var.c;
        }
        return null;
    }

    public PorterDuff.Mode c() {
        g92 g92Var = (g92) this.j;
        if (g92Var != null) {
            return (PorterDuff.Mode) g92Var.d;
        }
        return null;
    }

    public void d(AttributeSet attributeSet, int i) {
        ColorStateList colorStateListG;
        View view = (View) this.g;
        Context context = view.getContext();
        int[] iArr = lw.z;
        r52 r52VarR = r52.r(context, attributeSet, iArr, i);
        TypedArray typedArray = (TypedArray) r52VarR.h;
        View view2 = (View) this.g;
        w60.h(view2, view2.getContext(), iArr, attributeSet, (TypedArray) r52VarR.h, i);
        try {
            if (typedArray.hasValue(0)) {
                this.f = typedArray.getResourceId(0, -1);
                e5 e5Var = (e5) this.h;
                Context context2 = view.getContext();
                int i2 = this.f;
                synchronized (e5Var) {
                    colorStateListG = e5Var.a.g(context2, i2);
                }
                if (colorStateListG != null) {
                    g(colorStateListG);
                }
            }
            if (typedArray.hasValue(1)) {
                p60.e(view, r52VarR.j(1));
            }
            if (typedArray.hasValue(2)) {
                p60.f(view, sf.c(typedArray.getInt(2, -1), null));
            }
            r52VarR.x();
        } catch (Throwable th) {
            r52VarR.x();
            throw th;
        }
    }

    public void e() {
        this.f = -1;
        g(null);
        a();
    }

    public void f(int i) {
        ColorStateList colorStateListG;
        this.f = i;
        e5 e5Var = (e5) this.h;
        if (e5Var != null) {
            Context context = ((View) this.g).getContext();
            synchronized (e5Var) {
                colorStateListG = e5Var.a.g(context, i);
            }
        } else {
            colorStateListG = null;
        }
        g(colorStateListG);
        a();
    }

    public void g(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (((g92) this.i) == null) {
                this.i = new g92();
            }
            g92 g92Var = (g92) this.i;
            g92Var.c = colorStateList;
            g92Var.b = true;
        } else {
            this.i = null;
        }
        a();
    }

    public void h(ColorStateList colorStateList) {
        if (((g92) this.j) == null) {
            this.j = new g92();
        }
        g92 g92Var = (g92) this.j;
        g92Var.c = colorStateList;
        g92Var.b = true;
        a();
    }

    public void i(PorterDuff.Mode mode) {
        if (((g92) this.j) == null) {
            this.j = new g92();
        }
        g92 g92Var = (g92) this.j;
        g92Var.d = mode;
        g92Var.a = true;
        a();
    }

    public void k(int i) {
        hn.M(i >= 0);
        this.f = i;
        m(i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0028, code lost:
    
        if (r8 < r1.g) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void l(long r8, defpackage.cw1 r10) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.j
            java.util.PriorityQueue r0 = (java.util.PriorityQueue) r0
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r3 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r3 == 0) goto L9b
            int r1 = r7.f
            if (r1 == 0) goto L9c
            r2 = -1
            if (r1 == r2) goto L2c
            int r1 = r0.size()
            int r3 = r7.f
            if (r1 < r3) goto L2c
            java.lang.Object r1 = r0.peek()
            p82 r1 = (defpackage.p82) r1
            java.lang.String r3 = defpackage.qz1.a
            long r3 = r1.g
            int r1 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r1 >= 0) goto L2c
            goto L9c
        L2c:
            java.lang.Object r1 = r7.h
            java.util.ArrayDeque r1 = (java.util.ArrayDeque) r1
            boolean r3 = r1.isEmpty()
            if (r3 == 0) goto L3c
            cw1 r1 = new cw1
            r1.<init>()
            goto L42
        L3c:
            java.lang.Object r1 = r1.pop()
            cw1 r1 = (defpackage.cw1) r1
        L42:
            int r3 = r10.B()
            r1.y(r3)
            byte[] r3 = r10.a
            int r10 = r10.b
            byte[] r4 = r1.a
            r5 = 0
            int r6 = r1.B()
            java.lang.System.arraycopy(r3, r10, r4, r5, r6)
            java.lang.Object r10 = r7.k
            p82 r10 = (defpackage.p82) r10
            if (r10 == 0) goto L6a
            long r3 = r10.g
            int r3 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r3 == 0) goto L64
            goto L6a
        L64:
            java.util.ArrayList r7 = r10.f
            r7.add(r1)
            return
        L6a:
            java.lang.Object r10 = r7.i
            java.util.ArrayDeque r10 = (java.util.ArrayDeque) r10
            boolean r3 = r10.isEmpty()
            if (r3 == 0) goto L7a
            p82 r10 = new p82
            r10.<init>()
            goto L80
        L7a:
            java.lang.Object r10 = r10.pop()
            p82 r10 = (defpackage.p82) r10
        L80:
            java.util.ArrayList r3 = r10.f
            boolean r4 = r3.isEmpty()
            defpackage.hn.M(r4)
            r10.g = r8
            r3.add(r1)
            r0.add(r10)
            r7.k = r10
            int r8 = r7.f
            if (r8 == r2) goto L9a
            r7.m(r8)
        L9a:
            return
        L9b:
            r8 = r1
        L9c:
            java.lang.Object r7 = r7.g
            z82 r7 = (defpackage.z82) r7
            r7.j(r8, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ts2.l(long, cw1):void");
    }

    public void m(int i) {
        ArrayList arrayList;
        while (true) {
            PriorityQueue priorityQueue = (PriorityQueue) this.j;
            if (priorityQueue.size() <= i) {
                return;
            }
            p82 p82Var = (p82) priorityQueue.poll();
            String str = qz1.a;
            int i2 = 0;
            while (true) {
                arrayList = p82Var.f;
                if (i2 >= arrayList.size()) {
                    break;
                }
                ((z82) this.g).j(p82Var.g, (cw1) arrayList.get(i2));
                ((ArrayDeque) this.h).push((cw1) arrayList.get(i2));
                i2++;
            }
            arrayList.clear();
            p82 p82Var2 = (p82) this.k;
            if (p82Var2 != null && p82Var2.g == p82Var.g) {
                this.k = null;
            }
            ((ArrayDeque) this.i).push(p82Var);
        }
    }

    public void n(Object obj) {
        Object obj2 = this.j;
        this.j = obj;
        if (obj2.equals(obj)) {
            return;
        }
        rz1 rz1Var = (rz1) this.i;
        rz1Var.getClass();
        Integer num = (Integer) obj;
        int iIntValue = num.intValue();
        p73 p73Var = (p73) rz1Var.g;
        p73Var.g2();
        p73Var.h2(1, 10, num);
        p73Var.h2(2, 10, num);
        r53 r53Var = new r53(iIntValue);
        gr1 gr1Var = p73Var.s;
        gr1Var.c(21, r53Var);
        gr1Var.d();
    }

    public ts2(Looper looper, Looper looper2, ig igVar, rz1 rz1Var) {
        this.g = igVar.i(looper, null);
        this.h = igVar.i(looper2, null);
        this.j = 0;
        this.k = 0;
        this.i = rz1Var;
    }

    public ts2(String str, j03 j03Var, n13 n13Var, int i, yw2 yw2Var, Integer num) {
        this.g = str;
        this.h = j03Var;
        this.i = n13Var;
        this.f = i;
        this.j = yw2Var;
        this.k = num;
    }

    public ts2(View view) {
        this.f = -1;
        this.g = view;
        this.h = e5.a();
    }
}
