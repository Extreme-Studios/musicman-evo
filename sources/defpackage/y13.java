package defpackage;

import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class y13 {
    public static final /* synthetic */ int c = 0;
    public final l33 a = new l33();
    public boolean b;

    static {
        new y13(0);
    }

    public y13(int i) {
        a();
        a();
    }

    public static void b(u13 u13Var, y33 y33Var, int i, Object obj) {
        if (y33Var == y33.i) {
            u13Var.f(i, 3);
            ((d23) ((f13) obj)).u(u13Var);
            u13Var.f(i, 4);
            return;
        }
        u13Var.f(i, y33Var.g);
        z33 z33Var = z33.f;
        switch (y33Var.ordinal()) {
            case 0:
                u13Var.y(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                break;
            case 1:
                u13Var.w(Float.floatToRawIntBits(((Float) obj).floatValue()));
                break;
            case 2:
                u13Var.x(((Long) obj).longValue());
                break;
            case 3:
                u13Var.x(((Long) obj).longValue());
                break;
            case 4:
                u13Var.u(((Integer) obj).intValue());
                break;
            case 5:
                u13Var.y(((Long) obj).longValue());
                break;
            case 6:
                u13Var.w(((Integer) obj).intValue());
                break;
            case 7:
                u13Var.t(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case 8:
                if (!(obj instanceof n13)) {
                    u13Var.z((String) obj);
                } else {
                    u13Var.q((n13) obj);
                }
                break;
            case 9:
                ((d23) ((f13) obj)).u(u13Var);
                break;
            case 10:
                u13Var.s((f13) obj);
                break;
            case 11:
                if (!(obj instanceof n13)) {
                    byte[] bArr = (byte[]) obj;
                    u13Var.r(bArr.length, bArr);
                } else {
                    u13Var.q((n13) obj);
                }
                break;
            case 12:
                u13Var.v(((Integer) obj).intValue());
                break;
            case 13:
                if (!(obj instanceof f23)) {
                    u13Var.u(((Integer) obj).intValue());
                } else {
                    u13Var.u(((f23) obj).a());
                }
                break;
            case 14:
                u13Var.w(((Integer) obj).intValue());
                break;
            case 15:
                u13Var.y(((Long) obj).longValue());
                break;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                u13Var.v((iIntValue >> 31) ^ (iIntValue + iIntValue));
                break;
            case 17:
                long jLongValue = ((Long) obj).longValue();
                u13Var.x((jLongValue >> 63) ^ (jLongValue + jLongValue));
                break;
        }
    }

    public final void a() {
        if (this.b) {
            return;
        }
        l33 l33Var = this.a;
        int i = l33Var.g;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = l33Var.a(i2).g;
            if (obj instanceof d23) {
                d23 d23Var = (d23) obj;
                d33.c.a(d23Var.getClass()).h(d23Var);
                d23Var.i();
            }
        }
        Iterator it = l33Var.b().iterator();
        while (it.hasNext()) {
            Object value = ((Map.Entry) it.next()).getValue();
            if (value instanceof d23) {
                d23 d23Var2 = (d23) value;
                d33.c.a(d23Var2.getClass()).h(d23Var2);
                d23Var2.i();
            }
        }
        if (!l33Var.i) {
            if (l33Var.g > 0) {
                l33Var.a(0).f.getClass();
                j7.j();
                return;
            } else {
                Iterator it2 = l33Var.b().iterator();
                if (it2.hasNext()) {
                    ((Map.Entry) it2.next()).getKey().getClass();
                    j7.j();
                    return;
                }
            }
        }
        if (!l33Var.i) {
            l33Var.h = l33Var.h.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(l33Var.h);
            l33Var.k = l33Var.k.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(l33Var.k);
            l33Var.i = true;
        }
        this.b = true;
    }

    public final Object clone() {
        y13 y13Var = new y13();
        l33 l33Var = this.a;
        if (l33Var.g > 0) {
            l33Var.a(0).f.getClass();
            j7.j();
            return null;
        }
        Iterator it = l33Var.b().iterator();
        if (!it.hasNext()) {
            return y13Var;
        }
        Map.Entry entry = (Map.Entry) it.next();
        if (entry.getKey() != null) {
            j7.j();
            return null;
        }
        entry.getValue();
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof y13) {
            return this.a.equals(((y13) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public y13() {
    }
}
