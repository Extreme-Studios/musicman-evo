package defpackage;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ts implements Comparator {
    public static final /* synthetic */ ts g = new ts(1);
    public static final /* synthetic */ ts h = new ts(2);
    public static final /* synthetic */ ts i = new ts(8);
    public static final /* synthetic */ ts j = new ts(9);
    public static final /* synthetic */ ts k = new ts(10);
    public static final /* synthetic */ ts l = new ts(11);
    public static final /* synthetic */ ts m = new ts(12);
    public static final /* synthetic */ ts n = new ts(13);
    public static final /* synthetic */ ts o = new ts(14);
    public static final /* synthetic */ ts p = new ts(15);
    public static final /* synthetic */ ts q = new ts(16);
    public static final /* synthetic */ ts r = new ts(17);
    public static final /* synthetic */ ts s = new ts(18);
    public static final /* synthetic */ ts t = new ts(19);
    public static final /* synthetic */ ts u = new ts(20);
    public static final /* synthetic */ ts v = new ts(21);
    public final /* synthetic */ int f;

    public /* synthetic */ ts(int i2) {
        this.f = i2;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int length;
        int i2 = 0;
        switch (this.f) {
            case 0:
                String str = (String) ((lv) obj).g;
                String str2 = (String) ((lv) obj2).g;
                if (str == str2) {
                    return 0;
                }
                if (str == null) {
                    return -1;
                }
                if (str2 == null) {
                    return 1;
                }
                return str.compareTo(str2);
            case 1:
                return Integer.compare(((vj0) obj).a.b, ((vj0) obj2).a.b);
            case 2:
                return Long.compare(((uj0) obj).b, ((uj0) obj2).b);
            case 3:
                return ((byte[]) obj).length - ((byte[]) obj2).length;
            case 4:
                xn0 xn0Var = (xn0) obj;
                xn0 xn0Var2 = (xn0) obj2;
                int i3 = 0;
                while (true) {
                    length = xn0Var.a.length;
                    if (i2 < length && i3 < xn0Var2.a.length) {
                        int iCompare = Integer.compare(xn0.f(xn0Var.b(i2)), xn0.f(xn0Var2.b(i3)));
                        if (iCompare != 0) {
                            return iCompare;
                        }
                        i2++;
                        i3++;
                    }
                }
                return Integer.compare(length, xn0Var2.a.length);
            case 5:
                eu0 eu0Var = (eu0) obj;
                eu0 eu0Var2 = (eu0) obj2;
                int i4 = eu0Var.c - eu0Var2.c;
                return i4 != 0 ? i4 : Long.compare(eu0Var.a, eu0Var2.a);
            case 6:
                bu0 bu0Var = (bu0) obj;
                bu0 bu0Var2 = (bu0) obj2;
                float f = bu0Var.b;
                float f2 = bu0Var2.b;
                if (f < f2) {
                    return -1;
                }
                if (f <= f2) {
                    float f3 = bu0Var.a;
                    float f4 = bu0Var2.a;
                    if (f3 < f4) {
                        return -1;
                    }
                    if (f3 <= f4) {
                        float f5 = (bu0Var.d - f) * (bu0Var.c - f3);
                        float f6 = (bu0Var2.d - f2) * (bu0Var2.c - f4);
                        if (f5 > f6) {
                            return -1;
                        }
                        if (f5 >= f6) {
                            return 0;
                        }
                    }
                }
                return 1;
            case 7:
                return ((Comparable) obj).compareTo((Comparable) obj2);
            case 8:
                List list = cx.b;
                return list.indexOf((String) obj) - list.indexOf((String) obj2);
            case 9:
                return ((de3) obj2).i - ((de3) obj).i;
            case 10:
                return ((nf3) Collections.max((List) obj)).compareTo((nf3) Collections.max((List) obj2));
            case 11:
                return Integer.compare(((pf3) ((List) obj).get(0)).k, ((pf3) ((List) obj2).get(0)).k);
            case 12:
                return ((uf3) ((List) obj).get(0)).compareTo((uf3) ((List) obj2).get(0));
            case 13:
                List list2 = (List) obj2;
                List list3 = (List) obj;
                return lj2.f(yf3.c((yf3) Collections.max(list3, t), (yf3) Collections.max(list2, p))).b(list3.size(), list2.size()).a((yf3) Collections.max(list3, q), (yf3) Collections.max(list2, r), s).e();
            case 14:
                Integer num = (Integer) obj2;
                Integer num2 = (Integer) obj;
                if (num2.intValue() == -1) {
                    return num.intValue() == -1 ? 0 : -1;
                }
                if (num.intValue() == -1) {
                    return 1;
                }
                return num2.intValue() - num.intValue();
            case 15:
                return yf3.c((yf3) obj, (yf3) obj2);
            case 16:
                return yf3.d((yf3) obj, (yf3) obj2);
            case 17:
                return yf3.d((yf3) obj, (yf3) obj2);
            case 18:
                return yf3.d((yf3) obj, (yf3) obj2);
            case 19:
                return yf3.c((yf3) obj, (yf3) obj2);
            case 20:
                return Float.compare(((og3) obj).c, ((og3) obj2).c);
            default:
                return ((og3) obj).a - ((og3) obj2).a;
        }
    }
}
