package defpackage;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class k33 {
    public static final ig a;

    static {
        int i = h13.a;
        a = new ig(7);
    }

    public static int a(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (u13.a(i << 3) + 4) * size;
    }

    public static int b(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (u13.a(i << 3) + 8) * size;
    }

    public static boolean c(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static void d(Object obj, Object obj2) {
        d23 d23Var = (d23) obj;
        p33 p33Var = d23Var.zzt;
        p33 p33Var2 = ((d23) obj2).zzt;
        p33 p33Var3 = p33.f;
        if (!p33Var3.equals(p33Var2)) {
            if (p33Var3.equals(p33Var)) {
                int i = p33Var.a + p33Var2.a;
                int[] iArrCopyOf = Arrays.copyOf(p33Var.b, i);
                System.arraycopy(p33Var2.b, 0, iArrCopyOf, p33Var.a, p33Var2.a);
                Object[] objArrCopyOf = Arrays.copyOf(p33Var.c, i);
                System.arraycopy(p33Var2.c, 0, objArrCopyOf, p33Var.a, p33Var2.a);
                p33Var = new p33(i, iArrCopyOf, objArrCopyOf, true);
            } else {
                p33Var.getClass();
                if (!p33Var2.equals(p33Var3)) {
                    if (!p33Var.e) {
                        throw new UnsupportedOperationException();
                    }
                    int i2 = p33Var.a + p33Var2.a;
                    p33Var.e(i2);
                    System.arraycopy(p33Var2.b, 0, p33Var.b, p33Var.a, p33Var2.a);
                    System.arraycopy(p33Var2.c, 0, p33Var.c, p33Var.a, p33Var2.a);
                    p33Var.a = i2;
                }
            }
        }
        d23Var.zzt = p33Var;
    }

    public static Object e(Object obj, int i, l23 l23Var, g23 g23Var, Object obj2, ig igVar) {
        if (g23Var == null) {
            return obj2;
        }
        if (l23Var == null) {
            Iterator it = l23Var.iterator();
            while (it.hasNext()) {
                int iIntValue = ((Integer) it.next()).intValue();
                if (!g23Var.a(iIntValue)) {
                    if (obj2 == null) {
                        igVar.getClass();
                        obj2 = ig.j(obj);
                    }
                    igVar.getClass();
                    ((p33) obj2).d(i << 3, Long.valueOf(iIntValue));
                    it.remove();
                }
            }
            return obj2;
        }
        int size = l23Var.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            Integer num = (Integer) l23Var.get(i3);
            int iIntValue2 = num.intValue();
            if (g23Var.a(iIntValue2)) {
                if (i3 != i2) {
                    l23Var.set(i2, num);
                }
                i2++;
            } else {
                if (obj2 == null) {
                    igVar.getClass();
                    obj2 = ig.j(obj);
                }
                igVar.getClass();
                ((p33) obj2).d(i << 3, Long.valueOf(iIntValue2));
            }
        }
        if (i2 != size) {
            l23Var.subList(i2, size).clear();
        }
        return obj2;
    }

    public static void f(int i, List list, j52 j52Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        u13 u13Var = (u13) j52Var.f;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                u13Var.m(i, Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
                i2++;
            }
            return;
        }
        u13Var.f(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Double) list.get(i4)).getClass();
            i3 += 8;
        }
        u13Var.v(i3);
        while (i2 < list.size()) {
            u13Var.y(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
            i2++;
        }
    }

    public static void g(int i, List list, j52 j52Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        u13 u13Var = (u13) j52Var.f;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                u13Var.i(i, Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                i2++;
            }
            return;
        }
        u13Var.f(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Float) list.get(i4)).getClass();
            i3 += 4;
        }
        u13Var.v(i3);
        while (i2 < list.size()) {
            u13Var.w(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
            i2++;
        }
    }

    public static void h(int i, List list, j52 j52Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        u13 u13Var = (u13) j52Var.f;
        int i2 = 0;
        if (!(list instanceof s23)) {
            if (!z) {
                while (i2 < list.size()) {
                    u13Var.j(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            u13Var.f(i, 2);
            int iB = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iB += u13.b(((Long) list.get(i3)).longValue());
            }
            u13Var.v(iB);
            while (i2 < list.size()) {
                u13Var.x(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        s23 s23Var = (s23) list;
        if (!z) {
            while (i2 < s23Var.h) {
                u13Var.j(i, s23Var.b(i2));
                i2++;
            }
            return;
        }
        u13Var.f(i, 2);
        int iB2 = 0;
        for (int i4 = 0; i4 < s23Var.h; i4++) {
            iB2 += u13.b(s23Var.b(i4));
        }
        u13Var.v(iB2);
        while (i2 < s23Var.h) {
            u13Var.x(s23Var.b(i2));
            i2++;
        }
    }

    public static void i(int i, List list, j52 j52Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        u13 u13Var = (u13) j52Var.f;
        int i2 = 0;
        if (!(list instanceof s23)) {
            if (!z) {
                while (i2 < list.size()) {
                    u13Var.j(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            u13Var.f(i, 2);
            int iB = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iB += u13.b(((Long) list.get(i3)).longValue());
            }
            u13Var.v(iB);
            while (i2 < list.size()) {
                u13Var.x(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        s23 s23Var = (s23) list;
        if (!z) {
            while (i2 < s23Var.h) {
                u13Var.j(i, s23Var.b(i2));
                i2++;
            }
            return;
        }
        u13Var.f(i, 2);
        int iB2 = 0;
        for (int i4 = 0; i4 < s23Var.h; i4++) {
            iB2 += u13.b(s23Var.b(i4));
        }
        u13Var.v(iB2);
        while (i2 < s23Var.h) {
            u13Var.x(s23Var.b(i2));
            i2++;
        }
    }

    public static void j(int i, List list, j52 j52Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        u13 u13Var = (u13) j52Var.f;
        int i2 = 0;
        if (!(list instanceof s23)) {
            if (!z) {
                while (i2 < list.size()) {
                    long jLongValue = ((Long) list.get(i2)).longValue();
                    u13Var.j(i, (jLongValue >> 63) ^ (jLongValue + jLongValue));
                    i2++;
                }
                return;
            }
            u13Var.f(i, 2);
            int iB = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                long jLongValue2 = ((Long) list.get(i3)).longValue();
                iB += u13.b((jLongValue2 >> 63) ^ (jLongValue2 + jLongValue2));
            }
            u13Var.v(iB);
            while (i2 < list.size()) {
                long jLongValue3 = ((Long) list.get(i2)).longValue();
                u13Var.x((jLongValue3 >> 63) ^ (jLongValue3 + jLongValue3));
                i2++;
            }
            return;
        }
        s23 s23Var = (s23) list;
        if (!z) {
            while (i2 < s23Var.h) {
                long jB = s23Var.b(i2);
                u13Var.j(i, (jB >> 63) ^ (jB + jB));
                i2++;
            }
            return;
        }
        u13Var.f(i, 2);
        int iB2 = 0;
        for (int i4 = 0; i4 < s23Var.h; i4++) {
            long jB2 = s23Var.b(i4);
            iB2 += u13.b((jB2 >> 63) ^ (jB2 + jB2));
        }
        u13Var.v(iB2);
        while (i2 < s23Var.h) {
            long jB3 = s23Var.b(i2);
            u13Var.x((jB3 >> 63) ^ (jB3 + jB3));
            i2++;
        }
    }

    public static void k(int i, List list, j52 j52Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        u13 u13Var = (u13) j52Var.f;
        int i2 = 0;
        if (!(list instanceof s23)) {
            if (!z) {
                while (i2 < list.size()) {
                    u13Var.m(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            u13Var.f(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).getClass();
                i3 += 8;
            }
            u13Var.v(i3);
            while (i2 < list.size()) {
                u13Var.y(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        s23 s23Var = (s23) list;
        if (!z) {
            while (i2 < s23Var.h) {
                u13Var.m(i, s23Var.b(i2));
                i2++;
            }
            return;
        }
        u13Var.f(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < s23Var.h; i6++) {
            s23Var.b(i6);
            i5 += 8;
        }
        u13Var.v(i5);
        while (i2 < s23Var.h) {
            u13Var.y(s23Var.b(i2));
            i2++;
        }
    }

    public static void l(int i, List list, j52 j52Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        u13 u13Var = (u13) j52Var.f;
        int i2 = 0;
        if (!(list instanceof s23)) {
            if (!z) {
                while (i2 < list.size()) {
                    u13Var.m(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            u13Var.f(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).getClass();
                i3 += 8;
            }
            u13Var.v(i3);
            while (i2 < list.size()) {
                u13Var.y(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        s23 s23Var = (s23) list;
        if (!z) {
            while (i2 < s23Var.h) {
                u13Var.m(i, s23Var.b(i2));
                i2++;
            }
            return;
        }
        u13Var.f(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < s23Var.h; i6++) {
            s23Var.b(i6);
            i5 += 8;
        }
        u13Var.v(i5);
        while (i2 < s23Var.h) {
            u13Var.y(s23Var.b(i2));
            i2++;
        }
    }

    public static void m(int i, List list, j52 j52Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        u13 u13Var = (u13) j52Var.f;
        int i2 = 0;
        if (!(list instanceof e23)) {
            if (!z) {
                while (i2 < list.size()) {
                    u13Var.g(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            u13Var.f(i, 2);
            int iB = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iB += u13.b(((Integer) list.get(i3)).intValue());
            }
            u13Var.v(iB);
            while (i2 < list.size()) {
                u13Var.u(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        e23 e23Var = (e23) list;
        if (!z) {
            while (i2 < e23Var.h) {
                u13Var.g(i, e23Var.c(i2));
                i2++;
            }
            return;
        }
        u13Var.f(i, 2);
        int iB2 = 0;
        for (int i4 = 0; i4 < e23Var.h; i4++) {
            iB2 += u13.b(e23Var.c(i4));
        }
        u13Var.v(iB2);
        while (i2 < e23Var.h) {
            u13Var.u(e23Var.c(i2));
            i2++;
        }
    }

    public static void n(int i, List list, j52 j52Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        u13 u13Var = (u13) j52Var.f;
        int i2 = 0;
        if (!(list instanceof e23)) {
            if (!z) {
                while (i2 < list.size()) {
                    u13Var.h(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            u13Var.f(i, 2);
            int iA = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iA += u13.a(((Integer) list.get(i3)).intValue());
            }
            u13Var.v(iA);
            while (i2 < list.size()) {
                u13Var.v(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        e23 e23Var = (e23) list;
        if (!z) {
            while (i2 < e23Var.h) {
                u13Var.h(i, e23Var.c(i2));
                i2++;
            }
            return;
        }
        u13Var.f(i, 2);
        int iA2 = 0;
        for (int i4 = 0; i4 < e23Var.h; i4++) {
            iA2 += u13.a(e23Var.c(i4));
        }
        u13Var.v(iA2);
        while (i2 < e23Var.h) {
            u13Var.v(e23Var.c(i2));
            i2++;
        }
    }

    public static void o(int i, List list, j52 j52Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        u13 u13Var = (u13) j52Var.f;
        int i2 = 0;
        if (!(list instanceof e23)) {
            if (!z) {
                while (i2 < list.size()) {
                    int iIntValue = ((Integer) list.get(i2)).intValue();
                    u13Var.h(i, (iIntValue >> 31) ^ (iIntValue + iIntValue));
                    i2++;
                }
                return;
            }
            u13Var.f(i, 2);
            int iA = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                int iIntValue2 = ((Integer) list.get(i3)).intValue();
                iA += u13.a((iIntValue2 >> 31) ^ (iIntValue2 + iIntValue2));
            }
            u13Var.v(iA);
            while (i2 < list.size()) {
                int iIntValue3 = ((Integer) list.get(i2)).intValue();
                u13Var.v((iIntValue3 >> 31) ^ (iIntValue3 + iIntValue3));
                i2++;
            }
            return;
        }
        e23 e23Var = (e23) list;
        if (!z) {
            while (i2 < e23Var.h) {
                int iC = e23Var.c(i2);
                u13Var.h(i, (iC >> 31) ^ (iC + iC));
                i2++;
            }
            return;
        }
        u13Var.f(i, 2);
        int iA2 = 0;
        for (int i4 = 0; i4 < e23Var.h; i4++) {
            int iC2 = e23Var.c(i4);
            iA2 += u13.a((iC2 >> 31) ^ (iC2 + iC2));
        }
        u13Var.v(iA2);
        while (i2 < e23Var.h) {
            int iC3 = e23Var.c(i2);
            u13Var.v((iC3 >> 31) ^ (iC3 + iC3));
            i2++;
        }
    }

    public static void p(int i, List list, j52 j52Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        u13 u13Var = (u13) j52Var.f;
        int i2 = 0;
        if (!(list instanceof e23)) {
            if (!z) {
                while (i2 < list.size()) {
                    u13Var.i(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            u13Var.f(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).getClass();
                i3 += 4;
            }
            u13Var.v(i3);
            while (i2 < list.size()) {
                u13Var.w(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        e23 e23Var = (e23) list;
        if (!z) {
            while (i2 < e23Var.h) {
                u13Var.i(i, e23Var.c(i2));
                i2++;
            }
            return;
        }
        u13Var.f(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < e23Var.h; i6++) {
            e23Var.c(i6);
            i5 += 4;
        }
        u13Var.v(i5);
        while (i2 < e23Var.h) {
            u13Var.w(e23Var.c(i2));
            i2++;
        }
    }

    public static void q(int i, List list, j52 j52Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        u13 u13Var = (u13) j52Var.f;
        int i2 = 0;
        if (!(list instanceof e23)) {
            if (!z) {
                while (i2 < list.size()) {
                    u13Var.i(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            u13Var.f(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).getClass();
                i3 += 4;
            }
            u13Var.v(i3);
            while (i2 < list.size()) {
                u13Var.w(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        e23 e23Var = (e23) list;
        if (!z) {
            while (i2 < e23Var.h) {
                u13Var.i(i, e23Var.c(i2));
                i2++;
            }
            return;
        }
        u13Var.f(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < e23Var.h; i6++) {
            e23Var.c(i6);
            i5 += 4;
        }
        u13Var.v(i5);
        while (i2 < e23Var.h) {
            u13Var.w(e23Var.c(i2));
            i2++;
        }
    }

    public static void r(int i, List list, j52 j52Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        u13 u13Var = (u13) j52Var.f;
        int i2 = 0;
        if (!(list instanceof e23)) {
            if (!z) {
                while (i2 < list.size()) {
                    u13Var.g(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            u13Var.f(i, 2);
            int iB = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iB += u13.b(((Integer) list.get(i3)).intValue());
            }
            u13Var.v(iB);
            while (i2 < list.size()) {
                u13Var.u(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        e23 e23Var = (e23) list;
        if (!z) {
            while (i2 < e23Var.h) {
                u13Var.g(i, e23Var.c(i2));
                i2++;
            }
            return;
        }
        u13Var.f(i, 2);
        int iB2 = 0;
        for (int i4 = 0; i4 < e23Var.h; i4++) {
            iB2 += u13.b(e23Var.c(i4));
        }
        u13Var.v(iB2);
        while (i2 < e23Var.h) {
            u13Var.u(e23Var.c(i2));
            i2++;
        }
    }

    public static void s(int i, List list, j52 j52Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        u13 u13Var = (u13) j52Var.f;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                u13Var.n(i, ((Boolean) list.get(i2)).booleanValue());
                i2++;
            }
            return;
        }
        u13Var.f(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Boolean) list.get(i4)).getClass();
            i3++;
        }
        u13Var.v(i3);
        while (i2 < list.size()) {
            u13Var.t(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : (byte) 0);
            i2++;
        }
    }

    public static int t(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof s23)) {
            int iB = 0;
            while (i < size) {
                iB += u13.b(((Long) list.get(i)).longValue());
                i++;
            }
            return iB;
        }
        s23 s23Var = (s23) list;
        int iB2 = 0;
        while (i < size) {
            iB2 += u13.b(s23Var.b(i));
            i++;
        }
        return iB2;
    }

    public static int u(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof s23)) {
            int iB = 0;
            while (i < size) {
                iB += u13.b(((Long) list.get(i)).longValue());
                i++;
            }
            return iB;
        }
        s23 s23Var = (s23) list;
        int iB2 = 0;
        while (i < size) {
            iB2 += u13.b(s23Var.b(i));
            i++;
        }
        return iB2;
    }

    public static int v(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof s23)) {
            int iB = 0;
            while (i < size) {
                long jLongValue = ((Long) list.get(i)).longValue();
                iB += u13.b((jLongValue >> 63) ^ (jLongValue + jLongValue));
                i++;
            }
            return iB;
        }
        s23 s23Var = (s23) list;
        int iB2 = 0;
        while (i < size) {
            long jB = s23Var.b(i);
            iB2 += u13.b((jB >> 63) ^ (jB + jB));
            i++;
        }
        return iB2;
    }

    public static int w(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof e23)) {
            int iB = 0;
            while (i < size) {
                iB += u13.b(((Integer) list.get(i)).intValue());
                i++;
            }
            return iB;
        }
        e23 e23Var = (e23) list;
        int iB2 = 0;
        while (i < size) {
            iB2 += u13.b(e23Var.c(i));
            i++;
        }
        return iB2;
    }

    public static int x(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof e23)) {
            int iB = 0;
            while (i < size) {
                iB += u13.b(((Integer) list.get(i)).intValue());
                i++;
            }
            return iB;
        }
        e23 e23Var = (e23) list;
        int iB2 = 0;
        while (i < size) {
            iB2 += u13.b(e23Var.c(i));
            i++;
        }
        return iB2;
    }

    public static int y(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof e23)) {
            int iA = 0;
            while (i < size) {
                iA += u13.a(((Integer) list.get(i)).intValue());
                i++;
            }
            return iA;
        }
        e23 e23Var = (e23) list;
        int iA2 = 0;
        while (i < size) {
            iA2 += u13.a(e23Var.c(i));
            i++;
        }
        return iA2;
    }

    public static int z(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof e23)) {
            int iA = 0;
            while (i < size) {
                int iIntValue = ((Integer) list.get(i)).intValue();
                iA += u13.a((iIntValue >> 31) ^ (iIntValue + iIntValue));
                i++;
            }
            return iA;
        }
        e23 e23Var = (e23) list;
        int iA2 = 0;
        while (i < size) {
            int iC = e23Var.c(i);
            iA2 += u13.a((iC >> 31) ^ (iC + iC));
            i++;
        }
        return iA2;
    }
}
