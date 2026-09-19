package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class hy extends ac implements hi {
    public final hi i;
    public final ic j;
    public final int k;
    public ic l;
    public yb m;

    public hy(hi hiVar, ic icVar) {
        super(la.h, jh.f);
        this.i = hiVar;
        this.j = icVar;
        this.k = ((Number) icVar.b(0, new ga(5))).intValue();
    }

    @Override // defpackage.ac, defpackage.sc
    public final sc c() {
        yb ybVar = this.m;
        if (ybVar instanceof sc) {
            return (sc) ybVar;
        }
        return null;
    }

    @Override // defpackage.ac, defpackage.yb
    public final ic getContext() {
        ic icVar = this.l;
        return icVar == null ? jh.f : icVar;
    }

    @Override // defpackage.hi
    public final Object i(Object obj, yb ybVar) {
        try {
            Object objO = o(ybVar, obj);
            return objO == rc.f ? objO : k50.a;
        } catch (Throwable th) {
            this.l = new nf(ybVar.getContext(), th);
            throw th;
        }
    }

    @Override // defpackage.ac
    public final StackTraceElement l() {
        return null;
    }

    @Override // defpackage.ac
    public final Object m(Object obj) {
        Throwable thA = sx.a(obj);
        if (thA != null) {
            this.l = new nf(getContext(), thA);
        }
        yb ybVar = this.m;
        if (ybVar != null) {
            ybVar.d(obj);
        }
        return rc.f;
    }

    /* JADX WARN: Code duplicated, block: B:123:0x017b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:82:0x016e  */
    /* JADX WARN: Code duplicated, block: B:85:0x0175  */
    public final Object o(yb ybVar, Object obj) {
        List listG;
        Comparable comparable;
        String strSubstring;
        int length;
        ic context = ybVar.getContext();
        wn wnVar = (wn) context.f(gm.h);
        if (wnVar != null && !wnVar.A()) {
            throw wnVar.s();
        }
        ic icVar = this.l;
        if (icVar != context) {
            if (icVar instanceof nf) {
                String str = "\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + ((nf) icVar).g + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ";
                uo uoVar = new uo(str);
                if (uoVar.hasNext()) {
                    Object next = uoVar.next();
                    if (uoVar.hasNext()) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(next);
                        while (uoVar.hasNext()) {
                            arrayList.add(uoVar.next());
                        }
                        listG = arrayList;
                    } else {
                        listG = a23.g(next);
                    }
                } else {
                    listG = lh.f;
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : listG) {
                    String str2 = (String) obj2;
                    str2.getClass();
                    for (int i = 0; i < str2.length(); i++) {
                        char cCharAt = str2.charAt(i);
                        if (!Character.isWhitespace(cCharAt) && !Character.isSpaceChar(cCharAt)) {
                            arrayList2.add(obj2);
                            break;
                        }
                    }
                }
                ArrayList arrayList3 = new ArrayList(arrayList2.size());
                int size = arrayList2.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj3 = arrayList2.get(i2);
                    i2++;
                    String str3 = (String) obj3;
                    int length2 = str3.length();
                    int length3 = 0;
                    while (true) {
                        if (length3 >= length2) {
                            length3 = -1;
                            break;
                        }
                        char cCharAt2 = str3.charAt(length3);
                        if (!Character.isWhitespace(cCharAt2) && !Character.isSpaceChar(cCharAt2)) {
                            break;
                        }
                        length3++;
                    }
                    if (length3 == -1) {
                        length3 = str3.length();
                    }
                    arrayList3.add(Integer.valueOf(length3));
                }
                Iterator it = arrayList3.iterator();
                if (it.hasNext()) {
                    comparable = (Comparable) it.next();
                    while (it.hasNext()) {
                        Comparable comparable2 = (Comparable) it.next();
                        if (comparable.compareTo(comparable2) > 0) {
                            comparable = comparable2;
                        }
                    }
                } else {
                    comparable = null;
                }
                Integer num = (Integer) comparable;
                int iIntValue = num != null ? num.intValue() : 0;
                int length4 = str.length();
                listG.size();
                int size2 = listG.size() - 1;
                ArrayList arrayList4 = new ArrayList();
                int i3 = 0;
                for (Object obj4 : listG) {
                    int i4 = i3 + 1;
                    if (i3 < 0) {
                        throw new ArithmeticException("Index overflow has happened.");
                    }
                    String str4 = (String) obj4;
                    if (i3 == 0 || i3 == size2) {
                        str4.getClass();
                        int i5 = 0;
                        while (true) {
                            if (i5 < str4.length()) {
                                char cCharAt3 = str4.charAt(i5);
                                if (Character.isWhitespace(cCharAt3) || Character.isSpaceChar(cCharAt3)) {
                                    i5++;
                                } else {
                                    str4.getClass();
                                    if (iIntValue >= 0) {
                                        j7.f("Requested character count ", iIntValue, " is less than zero.");
                                        return null;
                                    }
                                    length = str4.length();
                                    if (iIntValue <= length) {
                                        length = iIntValue;
                                    }
                                    strSubstring = str4.substring(length);
                                }
                            } else {
                                strSubstring = null;
                            }
                        }
                    } else {
                        str4.getClass();
                        if (iIntValue >= 0) {
                            j7.f("Requested character count ", iIntValue, " is less than zero.");
                            return null;
                        }
                        length = str4.length();
                        if (iIntValue <= length) {
                            length = iIntValue;
                        }
                        strSubstring = str4.substring(length);
                    }
                    if (strSubstring != null) {
                        arrayList4.add(strSubstring);
                    }
                    i3 = i4;
                }
                StringBuilder sb = new StringBuilder(length4);
                x9.I(arrayList4, sb, "\n", "", "", "...", null);
                throw new IllegalStateException(sb.toString().toString());
            }
            if (((Number) context.b(0, new gl() { // from class: ky
                /* JADX WARN: Code duplicated, block: B:6:0x001d  */
                @Override // defpackage.gl
                public final Object f(Object obj5, Object obj6) {
                    int iIntValue2 = ((Integer) obj5).intValue();
                    gc gcVar = (gc) obj6;
                    hc key = gcVar.getKey();
                    gc gcVarF = this.f.j.f(key);
                    if (key == gm.h) {
                        wn wnVar2 = (wn) gcVarF;
                        wn parent = (wn) gcVar;
                        while (true) {
                            if (parent != null) {
                                if (parent == wnVar2 || !(parent instanceof fz)) {
                                    break;
                                }
                                l9 l9Var = (l9) wn.g.get((fz) parent);
                                parent = l9Var != null ? l9Var.getParent() : null;
                            } else {
                                parent = null;
                                break;
                            }
                        }
                        if (parent != wnVar2) {
                            throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + parent + ", expected child of " + wnVar2 + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
                        }
                        if (wnVar2 != null) {
                            iIntValue2++;
                        }
                    } else if (gcVar != gcVarF) {
                        iIntValue2 = Integer.MIN_VALUE;
                    } else {
                        iIntValue2++;
                    }
                    return Integer.valueOf(iIntValue2);
                }
            })).intValue() != this.k) {
                throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + this.j + ",\n\t\tbut emission happened in " + context + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
            }
            this.l = context;
        }
        this.m = ybVar;
        hl hlVar = jy.a;
        hi hiVar = this.i;
        hiVar.getClass();
        Object objE = hlVar.e(hiVar, obj, this);
        if (!jn.b(objE, rc.f)) {
            this.m = null;
        }
        return objE;
    }
}
