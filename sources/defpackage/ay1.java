package defpackage;

import android.os.SystemClock;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ay1 {
    public final tn2 c;
    public iy1 f;
    public final String h;
    public final int i;
    public final hy1 j;
    public x42 k;
    public final HashMap a = new HashMap();
    public final ArrayList b = new ArrayList();
    public final ArrayList d = new ArrayList();
    public final HashSet e = new HashSet();
    public int g = Integer.MAX_VALUE;
    public boolean l = false;

    public ay1(e52 e52Var, hy1 hy1Var, tn2 tn2Var) {
        this.i = ((z42) e52Var.b.h).r;
        this.j = hy1Var;
        this.c = tn2Var;
        this.h = my1.a(e52Var);
        List list = (List) e52Var.b.g;
        for (int i = 0; i < list.size(); i++) {
            this.a.put((x42) list.get(i), Integer.valueOf(i));
        }
        this.b.addAll(list);
    }

    public final synchronized x42 a() {
        try {
            if (d()) {
                int i = 0;
                while (true) {
                    ArrayList arrayList = this.b;
                    if (i >= arrayList.size()) {
                        break;
                    }
                    x42 x42Var = (x42) arrayList.get(i);
                    String str = x42Var.t0;
                    HashSet hashSet = this.e;
                    if (!hashSet.contains(str)) {
                        if (x42Var.v0) {
                            this.l = true;
                        }
                        if (!TextUtils.isEmpty(str)) {
                            hashSet.add(str);
                        }
                        this.d.add(x42Var);
                        return (x42) arrayList.remove(i);
                    }
                    i++;
                }
            }
            return null;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void b(iy1 iy1Var, x42 x42Var) {
        boolean z;
        z = false;
        this.l = false;
        this.d.remove(x42Var);
        synchronized (this) {
        }
        if (this.c.isDone()) {
            iy1Var.m();
            return;
        }
        Integer num = (Integer) this.a.get(x42Var);
        int iIntValue = num != null ? num.intValue() : Integer.MAX_VALUE;
        if (iIntValue > this.g) {
            this.j.c(x42Var);
            return;
        }
        if (this.f != null) {
            this.j.c(this.k);
        }
        this.g = iIntValue;
        this.f = iy1Var;
        this.k = x42Var;
        synchronized (this) {
            if (e(true)) {
                z = true;
            } else {
                synchronized (this) {
                    try {
                        ArrayList arrayList = this.d;
                        int size = arrayList.size();
                        int i = 0;
                        while (true) {
                            if (i < size) {
                                Object obj = arrayList.get(i);
                                i++;
                                Integer num2 = (Integer) this.a.get((x42) obj);
                                if ((num2 != null ? num2.intValue() : Integer.MAX_VALUE) < this.g) {
                                    z = true;
                                }
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            if (z) {
                return;
            }
            f();
        }
    }

    public final synchronized void c(x42 x42Var) {
        boolean z;
        z = false;
        this.l = false;
        this.d.remove(x42Var);
        this.e.remove(x42Var.t0);
        synchronized (this) {
        }
        if (!this.c.isDone()) {
            synchronized (this) {
                if (e(true)) {
                    z = true;
                } else {
                    synchronized (this) {
                        try {
                            ArrayList arrayList = this.d;
                            int size = arrayList.size();
                            int i = 0;
                            while (true) {
                                if (i < size) {
                                    Object obj = arrayList.get(i);
                                    i++;
                                    Integer num = (Integer) this.a.get((x42) obj);
                                    if ((num != null ? num.intValue() : Integer.MAX_VALUE) < this.g) {
                                        z = true;
                                    }
                                }
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                if (!z) {
                    f();
                }
            }
        }
    }

    public final synchronized boolean d() {
        if (this.l) {
            return false;
        }
        ArrayList arrayList = this.b;
        if (!arrayList.isEmpty() && ((x42) arrayList.get(0)).v0 && !this.d.isEmpty()) {
            return false;
        }
        synchronized (this) {
            if (!this.c.isDone()) {
                ArrayList arrayList2 = this.d;
                if (arrayList2.size() < this.i && e(false)) {
                    return true;
                }
            }
            return false;
        }
    }

    public final synchronized boolean e(boolean z) {
        try {
            ArrayList arrayList = this.b;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                x42 x42Var = (x42) obj;
                Integer num = (Integer) this.a.get(x42Var);
                int iIntValue = num != null ? num.intValue() : Integer.MAX_VALUE;
                if (z || !this.e.contains(x42Var.t0)) {
                    int i2 = this.g;
                    if (iIntValue < i2) {
                        return true;
                    }
                    if (iIntValue > i2) {
                        break;
                    }
                }
            }
            return false;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void f() {
        hy1 hy1Var = this.j;
        x42 x42Var = this.k;
        synchronized (hy1Var) {
            try {
                hy1Var.a.getClass();
                hy1Var.h = SystemClock.elapsedRealtime() - hy1Var.i;
                if (x42Var != null) {
                    hy1Var.f.a(x42Var);
                }
                hy1Var.g = true;
            } catch (Throwable th) {
                throw th;
            }
        }
        iy1 iy1Var = this.f;
        tn2 tn2Var = this.c;
        if (iy1Var != null) {
            tn2Var.d(iy1Var);
        } else {
            tn2Var.e(new ky1(this.h, 3));
        }
    }
}
