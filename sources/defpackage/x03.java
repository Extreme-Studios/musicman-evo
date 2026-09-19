package defpackage;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class x03 extends AbstractMap implements Serializable {
    public static final ts m = new ts(7);
    public w03 g;
    public v03 k;
    public v03 l;
    public int h = 0;
    public int i = 0;
    public final ts f = m;
    public final w03 j = new w03();

    public final w03 a(Object obj, boolean z) {
        int iCompareTo;
        w03 w03Var;
        w03 w03Var2 = this.g;
        ts tsVar = m;
        ts tsVar2 = this.f;
        if (w03Var2 != null) {
            Comparable comparable = tsVar2 == tsVar ? (Comparable) obj : null;
            while (true) {
                Object obj2 = w03Var2.k;
                iCompareTo = comparable != null ? comparable.compareTo(obj2) : tsVar2.compare(obj, obj2);
                if (iCompareTo == 0) {
                    return w03Var2;
                }
                w03 w03Var3 = iCompareTo < 0 ? w03Var2.g : w03Var2.h;
                if (w03Var3 == null) {
                    break;
                }
                w03Var2 = w03Var3;
            }
        } else {
            iCompareTo = 0;
        }
        if (!z) {
            return null;
        }
        w03 w03Var4 = this.j;
        if (w03Var2 != null) {
            w03 w03Var5 = new w03(w03Var2, obj, w03Var4, w03Var4.j);
            if (iCompareTo < 0) {
                w03Var2.g = w03Var5;
            } else {
                w03Var2.h = w03Var5;
            }
            d(w03Var2, true);
            w03Var = w03Var5;
        } else {
            if (tsVar2 == tsVar && !(obj instanceof Comparable)) {
                throw new ClassCastException(obj.getClass().getName().concat(" is not Comparable"));
            }
            w03Var = new w03(null, obj, w03Var4, w03Var4.j);
            this.g = w03Var;
        }
        this.h++;
        this.i++;
        return w03Var;
    }

    public final void b(w03 w03Var, boolean z) {
        w03 w03Var2;
        w03 w03Var3;
        int i;
        if (z) {
            w03 w03Var4 = w03Var.j;
            w03Var4.i = w03Var.i;
            w03Var.i.j = w03Var4;
        }
        w03 w03Var5 = w03Var.g;
        w03 w03Var6 = w03Var.h;
        w03 w03Var7 = w03Var.f;
        int i2 = 0;
        if (w03Var5 == null || w03Var6 == null) {
            if (w03Var5 != null) {
                c(w03Var, w03Var5);
                w03Var.g = null;
            } else if (w03Var6 != null) {
                c(w03Var, w03Var6);
                w03Var.h = null;
            } else {
                c(w03Var, null);
            }
            d(w03Var7, false);
            this.h--;
            this.i++;
            return;
        }
        if (w03Var5.m > w03Var6.m) {
            do {
                w03Var3 = w03Var5;
                w03Var5 = w03Var5.h;
            } while (w03Var5 != null);
        } else {
            do {
                w03Var2 = w03Var6;
                w03Var6 = w03Var6.g;
            } while (w03Var6 != null);
            w03Var3 = w03Var2;
        }
        b(w03Var3, false);
        w03 w03Var8 = w03Var.g;
        if (w03Var8 != null) {
            i = w03Var8.m;
            w03Var3.g = w03Var8;
            w03Var8.f = w03Var3;
            w03Var.g = null;
        } else {
            i = 0;
        }
        w03 w03Var9 = w03Var.h;
        if (w03Var9 != null) {
            i2 = w03Var9.m;
            w03Var3.h = w03Var9;
            w03Var9.f = w03Var3;
            w03Var.h = null;
        }
        w03Var3.m = Math.max(i, i2) + 1;
        c(w03Var, w03Var3);
    }

    public final void c(w03 w03Var, w03 w03Var2) {
        w03 w03Var3 = w03Var.f;
        w03Var.f = null;
        if (w03Var2 != null) {
            w03Var2.f = w03Var3;
        }
        if (w03Var3 == null) {
            this.g = w03Var2;
        } else if (w03Var3.g == w03Var) {
            w03Var3.g = w03Var2;
        } else {
            w03Var3.h = w03Var2;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.g = null;
        this.h = 0;
        this.i++;
        w03 w03Var = this.j;
        w03Var.j = w03Var;
        w03Var.i = w03Var;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        w03 w03VarA = null;
        if (obj != null) {
            try {
                w03VarA = a(obj, false);
            } catch (ClassCastException unused) {
            }
        }
        return w03VarA != null;
    }

    /* JADX WARN: Code duplicated, block: B:60:0x0084 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:61:0x0084 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x0080 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:67:0x0080 A[SYNTHETIC] */
    public final void d(w03 w03Var, boolean z) {
        while (w03Var != null) {
            w03 w03Var2 = w03Var.g;
            w03 w03Var3 = w03Var.h;
            boolean z2 = false;
            int i = w03Var2 != null ? w03Var2.m : 0;
            int i2 = w03Var3 != null ? w03Var3.m : 0;
            int i3 = i - i2;
            boolean z3 = true;
            if (i3 == -2) {
                w03 w03Var4 = w03Var3.g;
                w03 w03Var5 = w03Var3.h;
                int i4 = (w03Var4 != null ? w03Var4.m : 0) - (w03Var5 != null ? w03Var5.m : 0);
                if (i4 != -1) {
                    if (i4 == 0) {
                        if (!z) {
                        }
                        if (z3) {
                            return;
                        }
                    } else {
                        z3 = z;
                    }
                    f(w03Var3);
                    e(w03Var);
                    if (z3) {
                        return;
                    }
                } else {
                    z2 = z;
                }
                e(w03Var);
                z3 = z2;
                if (z3) {
                    return;
                }
            } else if (i3 == 2) {
                w03 w03Var6 = w03Var2.g;
                w03 w03Var7 = w03Var2.h;
                int i5 = (w03Var6 != null ? w03Var6.m : 0) - (w03Var7 != null ? w03Var7.m : 0);
                if (i5 != 1) {
                    if (i5 == 0) {
                        if (!z) {
                        }
                        if (z3) {
                            return;
                        }
                    } else {
                        z3 = z;
                    }
                    e(w03Var2);
                    f(w03Var);
                    if (z3) {
                        return;
                    }
                } else {
                    z2 = z;
                }
                f(w03Var);
                z3 = z2;
                if (z3) {
                    return;
                }
            } else if (i3 == 0) {
                w03Var.m = i + 1;
                if (z) {
                    return;
                }
            } else {
                w03Var.m = Math.max(i, i2) + 1;
                if (!z) {
                    return;
                }
            }
            w03Var = w03Var.f;
        }
    }

    public final void e(w03 w03Var) {
        w03 w03Var2 = w03Var.g;
        w03 w03Var3 = w03Var.h;
        w03 w03Var4 = w03Var3.g;
        w03 w03Var5 = w03Var3.h;
        w03Var.h = w03Var4;
        if (w03Var4 != null) {
            w03Var4.f = w03Var;
        }
        c(w03Var, w03Var3);
        w03Var3.g = w03Var;
        w03Var.f = w03Var3;
        int iMax = Math.max(w03Var2 != null ? w03Var2.m : 0, w03Var4 != null ? w03Var4.m : 0) + 1;
        w03Var.m = iMax;
        w03Var3.m = Math.max(iMax, w03Var5 != null ? w03Var5.m : 0) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        v03 v03Var = this.k;
        if (v03Var != null) {
            return v03Var;
        }
        v03 v03Var2 = new v03(this, 0);
        this.k = v03Var2;
        return v03Var2;
    }

    public final void f(w03 w03Var) {
        w03 w03Var2 = w03Var.g;
        w03 w03Var3 = w03Var.h;
        w03 w03Var4 = w03Var2.g;
        w03 w03Var5 = w03Var2.h;
        w03Var.g = w03Var5;
        if (w03Var5 != null) {
            w03Var5.f = w03Var;
        }
        c(w03Var, w03Var2);
        w03Var2.h = w03Var;
        w03Var.f = w03Var2;
        int iMax = Math.max(w03Var3 != null ? w03Var3.m : 0, w03Var5 != null ? w03Var5.m : 0) + 1;
        w03Var.m = iMax;
        w03Var2.m = Math.max(iMax, w03Var4 != null ? w03Var4.m : 0) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        w03 w03VarA;
        if (obj != null) {
            try {
                w03VarA = a(obj, false);
            } catch (ClassCastException unused) {
                w03VarA = null;
            }
        } else {
            w03VarA = null;
        }
        if (w03VarA != null) {
            return w03VarA.l;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        v03 v03Var = this.l;
        if (v03Var != null) {
            return v03Var;
        }
        v03 v03Var2 = new v03(this, 1);
        this.l = v03Var2;
        return v03Var2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        if (obj == null) {
            j7.l("key == null");
            return null;
        }
        if (obj2 == null) {
            j7.l("value == null");
            return null;
        }
        w03 w03VarA = a(obj, true);
        Object obj3 = w03VarA.l;
        w03VarA.l = obj2;
        return obj3;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        w03 w03VarA;
        if (obj != null) {
            try {
                w03VarA = a(obj, false);
            } catch (ClassCastException unused) {
                w03VarA = null;
            }
        } else {
            w03VarA = null;
        }
        if (w03VarA != null) {
            b(w03VarA, true);
        }
        if (w03VarA != null) {
            return w03VarA.l;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.h;
    }
}
