package defpackage;

import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import android.util.Pair;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes.dex */
public final class lj0 {
    public final String a;
    public final String b;
    public final boolean c;
    public final long d;
    public final long e;
    public final pj0 f;
    public final String[] g;
    public final String h;
    public final String i;
    public final lj0 j;
    public final HashMap k;
    public final HashMap l;
    public ArrayList m;

    public lj0(String str, String str2, long j, long j2, pj0 pj0Var, String[] strArr, String str3, String str4, lj0 lj0Var) {
        this.a = str;
        this.b = str2;
        this.i = str4;
        this.f = pj0Var;
        this.g = strArr;
        this.c = str2 != null;
        this.d = j;
        this.e = j2;
        str3.getClass();
        this.h = str3;
        this.j = lj0Var;
        this.k = new HashMap();
        this.l = new HashMap();
    }

    public static lj0 a(String str) {
        return new lj0(null, str.replaceAll("\r\n", "\n").replaceAll(" *\n *", "\n").replaceAll("\n", " ").replaceAll("[ \t\\x0B\f\r]+", " "), -9223372036854775807L, -9223372036854775807L, null, null, "", null, null);
    }

    public static lj0 b(String str, long j, long j2, pj0 pj0Var, String[] strArr, String str2, String str3, lj0 lj0Var) {
        return new lj0(str, null, j, j2, pj0Var, strArr, str2, str3, lj0Var);
    }

    public static SpannableStringBuilder i(String str, TreeMap treeMap) {
        if (!treeMap.containsKey(str)) {
            jf1 jf1Var = new jf1();
            jf1Var.a = new SpannableStringBuilder();
            jf1Var.b = null;
            treeMap.put(str, jf1Var);
        }
        CharSequence charSequence = ((jf1) treeMap.get(str)).a;
        charSequence.getClass();
        return (SpannableStringBuilder) charSequence;
    }

    public final boolean c(long j) {
        long j2 = this.d;
        long j3 = this.e;
        if (j2 == -9223372036854775807L) {
            if (j3 == -9223372036854775807L) {
                return true;
            }
            j2 = -9223372036854775807L;
        }
        if (j2 <= j && j3 == -9223372036854775807L) {
            return true;
        }
        if (j2 != -9223372036854775807L || j >= j3) {
            return j2 <= j && j < j3;
        }
        return true;
    }

    public final lj0 d(int i) {
        ArrayList arrayList = this.m;
        if (arrayList != null) {
            return (lj0) arrayList.get(i);
        }
        throw new IndexOutOfBoundsException();
    }

    public final int e() {
        ArrayList arrayList = this.m;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    public final void f(TreeSet treeSet, boolean z) {
        String str = this.a;
        boolean zEquals = "p".equals(str);
        boolean zEquals2 = "div".equals(str);
        if (z || zEquals || (zEquals2 && this.i != null)) {
            long j = this.d;
            if (j != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j));
            }
            long j2 = this.e;
            if (j2 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j2));
            }
        }
        if (this.m != null) {
            for (int i = 0; i < this.m.size(); i++) {
                lj0 lj0Var = (lj0) this.m.get(i);
                boolean z2 = true;
                if (!z && !zEquals) {
                    z2 = false;
                }
                lj0Var.f(treeSet, z2);
            }
        }
    }

    public final void g(long j, String str, ArrayList arrayList) {
        String str2;
        String str3 = this.h;
        if (true != "".equals(str3)) {
            str = str3;
        }
        if (c(j) && "div".equals(this.a) && (str2 = this.i) != null) {
            arrayList.add(new Pair(str, str2));
            return;
        }
        for (int i = 0; i < e(); i++) {
            d(i).g(j, str, arrayList);
        }
    }

    public final void h(long j, boolean z, String str, TreeMap treeMap) {
        HashMap map = this.k;
        map.clear();
        HashMap map2 = this.l;
        map2.clear();
        String str2 = this.a;
        if ("metadata".equals(str2)) {
            return;
        }
        String str3 = this.h;
        String str4 = true != "".equals(str3) ? str3 : str;
        if (this.c && z) {
            SpannableStringBuilder spannableStringBuilderI = i(str4, treeMap);
            String str5 = this.b;
            str5.getClass();
            spannableStringBuilderI.append((CharSequence) str5);
            return;
        }
        if ("br".equals(str2) && z) {
            i(str4, treeMap).append('\n');
            return;
        }
        if (c(j)) {
            for (Map.Entry entry : treeMap.entrySet()) {
                String str6 = (String) entry.getKey();
                CharSequence charSequence = ((jf1) entry.getValue()).a;
                charSequence.getClass();
                map.put(str6, Integer.valueOf(charSequence.length()));
            }
            boolean zEquals = "p".equals(str2);
            for (int i = 0; i < e(); i++) {
                d(i).h(j, z || zEquals, str4, treeMap);
            }
            if (zEquals) {
                SpannableStringBuilder spannableStringBuilderI2 = i(str4, treeMap);
                int length = spannableStringBuilderI2.length();
                do {
                    length--;
                    if (length < 0) {
                        break;
                    }
                } while (spannableStringBuilderI2.charAt(length) == ' ');
                if (length >= 0 && spannableStringBuilderI2.charAt(length) != '\n') {
                    spannableStringBuilderI2.append('\n');
                }
            }
            for (Map.Entry entry2 : treeMap.entrySet()) {
                String str7 = (String) entry2.getKey();
                CharSequence charSequence2 = ((jf1) entry2.getValue()).a;
                charSequence2.getClass();
                map2.put(str7, Integer.valueOf(charSequence2.length()));
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:140:0x020f  */
    /* JADX WARN: Code duplicated, block: B:143:0x021d  */
    /* JADX WARN: Code duplicated, block: B:145:0x0220  */
    /* JADX WARN: Code duplicated, block: B:147:0x0223  */
    /* JADX WARN: Code duplicated, block: B:149:0x022a  */
    /* JADX WARN: Code duplicated, block: B:151:0x0238  */
    /* JADX WARN: Code duplicated, block: B:163:0x026a  */
    /* JADX WARN: Code duplicated, block: B:166:0x0284  */
    /* JADX WARN: Code duplicated, block: B:167:0x0293  */
    /* JADX WARN: Code duplicated, block: B:170:0x02ad  */
    /* JADX WARN: Code duplicated, block: B:172:0x02b6  */
    /* JADX WARN: Code duplicated, block: B:175:0x02c1  */
    /* JADX WARN: Code duplicated, block: B:178:0x02c7  */
    /* JADX WARN: Code duplicated, block: B:44:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:45:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:48:0x00be  */
    /* JADX WARN: Code duplicated, block: B:49:0x00c0  */
    public final void j(long j, Map map, HashMap map2, String str, TreeMap treeMap) {
        int i;
        lj0 lj0Var;
        int i2;
        int i3;
        int i4;
        pj0 pj0VarP;
        int i5;
        float f;
        Iterator it;
        float f2;
        int i6;
        float f3;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        float sizeChange;
        RelativeSizeSpan[] relativeSizeSpanArr;
        int length;
        RelativeSizeSpan relativeSizeSpan;
        float f4;
        int i7;
        int i8;
        int i9;
        int i10;
        Map map3 = map;
        if (c(j)) {
            String str2 = this.h;
            int i11 = 1;
            String str3 = true != "".equals(str2) ? str2 : str;
            Iterator it2 = this.l.entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry entry = (Map.Entry) it2.next();
                String str4 = (String) entry.getKey();
                HashMap map4 = this.k;
                int iIntValue = map4.containsKey(str4) ? ((Integer) map4.get(str4)).intValue() : 0;
                int iIntValue2 = ((Integer) entry.getValue()).intValue();
                if (iIntValue != iIntValue2) {
                    jf1 jf1Var = (jf1) treeMap.get(str4);
                    jf1Var.getClass();
                    oj0 oj0Var = (oj0) map2.get(str3);
                    oj0Var.getClass();
                    int i12 = oj0Var.j;
                    pj0 pj0VarP2 = rs0.p(this.f, this.g, map3);
                    SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) jf1Var.a;
                    if (spannableStringBuilder == null) {
                        spannableStringBuilder = new SpannableStringBuilder();
                        jf1Var.a = spannableStringBuilder;
                        jf1Var.b = null;
                    }
                    if (pj0VarP2 != null) {
                        int i13 = pj0VarP2.h;
                        int i14 = -1;
                        if (((i13 == -1 && pj0VarP2.i == -1) ? -1 : (i13 == i11 ? i11 : 0) | (pj0VarP2.i == i11 ? 2 : 0)) != -1) {
                            int i15 = pj0VarP2.h;
                            if (i15 != -1) {
                                if (i15 == i11) {
                                    i8 = i11;
                                } else {
                                    i8 = 0;
                                }
                                if (pj0VarP2.i == i11) {
                                    i9 = 2;
                                } else {
                                    i9 = 0;
                                }
                                i10 = i8 | i9;
                            } else if (pj0VarP2.i != -1) {
                                i11 = 1;
                                if (i15 == i11) {
                                    i8 = i11;
                                } else {
                                    i8 = 0;
                                }
                                if (pj0VarP2.i == i11) {
                                    i9 = 2;
                                } else {
                                    i9 = 0;
                                }
                                i10 = i8 | i9;
                            } else {
                                i10 = -1;
                                i11 = 1;
                            }
                            StyleSpan styleSpan = new StyleSpan(i10);
                            i = 33;
                            spannableStringBuilder.setSpan(styleSpan, iIntValue, iIntValue2, 33);
                        } else {
                            i = 33;
                        }
                        if (pj0VarP2.f == i11) {
                            spannableStringBuilder.setSpan(new StrikethroughSpan(), iIntValue, iIntValue2, i);
                        }
                        if (pj0VarP2.g == i11) {
                            spannableStringBuilder.setSpan(new UnderlineSpan(), iIntValue, iIntValue2, i);
                        }
                        if (pj0VarP2.c) {
                            if (!pj0VarP2.c) {
                                j7.e("Font color has not been defined.");
                                return;
                            }
                            dq.x(spannableStringBuilder, new ForegroundColorSpan(pj0VarP2.b), iIntValue, iIntValue2);
                        }
                        if (pj0VarP2.e) {
                            if (!pj0VarP2.e) {
                                j7.e("Background color has not been defined.");
                                return;
                            }
                            dq.x(spannableStringBuilder, new BackgroundColorSpan(pj0VarP2.d), iIntValue, iIntValue2);
                        }
                        if (pj0VarP2.a != null) {
                            dq.x(spannableStringBuilder, new TypefaceSpan(pj0VarP2.a), iIntValue, iIntValue2);
                        }
                        kj0 kj0Var = pj0VarP2.r;
                        if (kj0Var != null) {
                            int i16 = kj0Var.a;
                            if (i16 == -1) {
                                i16 = (i12 == 2 || i12 == 1) ? 3 : 1;
                                i7 = 1;
                            } else {
                                i7 = kj0Var.b;
                            }
                            int i17 = kj0Var.c;
                            if (i17 == -2) {
                                i17 = 1;
                            }
                            dq.x(spannableStringBuilder, new ci1(i16, i7, i17), iIntValue, iIntValue2);
                        } else {
                            i14 = -1;
                        }
                        int i18 = pj0VarP2.m;
                        if (i18 == 2) {
                            lj0 lj0Var2 = this.j;
                            while (true) {
                                if (lj0Var2 == null) {
                                    lj0Var2 = null;
                                    break;
                                }
                                pj0 pj0VarP3 = rs0.p(lj0Var2.f, lj0Var2.g, map3);
                                if (pj0VarP3 != null && pj0VarP3.m == 1) {
                                    break;
                                } else {
                                    lj0Var2 = lj0Var2.j;
                                }
                            }
                            if (lj0Var2 != null) {
                                ArrayDeque arrayDeque = new ArrayDeque();
                                arrayDeque.push(lj0Var2);
                                while (true) {
                                    if (arrayDeque.isEmpty()) {
                                        lj0Var = null;
                                        break;
                                    }
                                    lj0 lj0Var3 = (lj0) arrayDeque.pop();
                                    pj0 pj0VarP4 = rs0.p(lj0Var3.f, lj0Var3.g, map3);
                                    if (pj0VarP4 != null && pj0VarP4.m == 3) {
                                        lj0Var = lj0Var3;
                                        break;
                                    }
                                    for (int iE = lj0Var3.e() - 1; iE >= 0; iE--) {
                                        arrayDeque.push(lj0Var3.d(iE));
                                    }
                                }
                                if (lj0Var != null) {
                                    if (lj0Var.e() == 1) {
                                        i2 = 0;
                                        if (lj0Var.d(0).b != null) {
                                            String str5 = lj0Var.d(0).b;
                                            String str6 = qz1.a;
                                            pj0 pj0VarP5 = rs0.p(lj0Var.f, lj0Var.g, map3);
                                            if (pj0VarP5 != null) {
                                                i3 = pj0VarP5.n;
                                                i4 = i14;
                                            } else {
                                                i3 = i14;
                                                i4 = i3;
                                            }
                                            if (i3 == i4 && (pj0VarP = rs0.p(lj0Var2.f, lj0Var2.g, map3)) != null) {
                                                i3 = pj0VarP.n;
                                            }
                                            spannableStringBuilder.setSpan(new nh1(str5, i3), iIntValue, iIntValue2, 33);
                                        }
                                    } else {
                                        i2 = 0;
                                    }
                                    s90.K("TtmlRenderUtil", "Skipping rubyText node without exactly one text child.");
                                }
                            }
                            if (pj0VarP2.q == 1) {
                                dq.x(spannableStringBuilder, new gh1(), iIntValue, iIntValue2);
                            }
                            i5 = pj0VarP2.j;
                            f = 100.0f;
                            if (i5 != 1) {
                                if (i5 != 2) {
                                    it = it2;
                                    f2 = 100.0f;
                                    dq.x(spannableStringBuilder, new RelativeSizeSpan(pj0VarP2.k), iIntValue, iIntValue2);
                                } else if (i5 != 3) {
                                    it = it2;
                                    f2 = 100.0f;
                                } else {
                                    sizeChange = pj0VarP2.k / 100.0f;
                                    relativeSizeSpanArr = (RelativeSizeSpan[]) spannableStringBuilder.getSpans(iIntValue, iIntValue2, RelativeSizeSpan.class);
                                    length = relativeSizeSpanArr.length;
                                    while (i2 < length) {
                                        float f5 = f;
                                        relativeSizeSpan = relativeSizeSpanArr[i2];
                                        Iterator it3 = it2;
                                        if (spannableStringBuilder.getSpanStart(relativeSizeSpan) <= iIntValue && spannableStringBuilder.getSpanEnd(relativeSizeSpan) >= iIntValue2) {
                                            sizeChange = relativeSizeSpan.getSizeChange() * sizeChange;
                                        }
                                        if (spannableStringBuilder.getSpanStart(relativeSizeSpan) == iIntValue || spannableStringBuilder.getSpanEnd(relativeSizeSpan) != iIntValue2) {
                                            f4 = sizeChange;
                                        } else {
                                            f4 = sizeChange;
                                            if (spannableStringBuilder.getSpanFlags(relativeSizeSpan) == 33) {
                                                spannableStringBuilder.removeSpan(relativeSizeSpan);
                                            }
                                        }
                                        i2++;
                                        f = f5;
                                        it2 = it3;
                                        sizeChange = f4;
                                    }
                                    it = it2;
                                    f2 = f;
                                    spannableStringBuilder.setSpan(new RelativeSizeSpan(sizeChange), iIntValue, iIntValue2, 33);
                                }
                                i6 = 1;
                            } else {
                                it = it2;
                                f2 = 100.0f;
                                i6 = 1;
                                dq.x(spannableStringBuilder, new AbsoluteSizeSpan((int) pj0VarP2.k, true), iIntValue, iIntValue2);
                            }
                            if ("p".equals(this.a)) {
                                f3 = pj0VarP2.s;
                                if (f3 != Float.MAX_VALUE) {
                                    jf1Var.o = (f3 * (-90.0f)) / f2;
                                }
                                alignment = pj0VarP2.o;
                                if (alignment != null) {
                                    jf1Var.c = alignment;
                                }
                                alignment2 = pj0VarP2.p;
                                if (alignment2 != null) {
                                    jf1Var.d = alignment2;
                                }
                            }
                            i11 = i6;
                            it2 = it;
                        } else if (i18 == 3 || i18 == 4) {
                            spannableStringBuilder.setSpan(new jj0(), iIntValue, iIntValue2, 33);
                        }
                        i2 = 0;
                        if (pj0VarP2.q == 1) {
                            dq.x(spannableStringBuilder, new gh1(), iIntValue, iIntValue2);
                        }
                        i5 = pj0VarP2.j;
                        f = 100.0f;
                        if (i5 != 1) {
                            if (i5 != 2) {
                                it = it2;
                                f2 = 100.0f;
                                dq.x(spannableStringBuilder, new RelativeSizeSpan(pj0VarP2.k), iIntValue, iIntValue2);
                            } else if (i5 != 3) {
                                it = it2;
                                f2 = 100.0f;
                            } else {
                                sizeChange = pj0VarP2.k / 100.0f;
                                relativeSizeSpanArr = (RelativeSizeSpan[]) spannableStringBuilder.getSpans(iIntValue, iIntValue2, RelativeSizeSpan.class);
                                length = relativeSizeSpanArr.length;
                                while (i2 < length) {
                                    float f6 = f;
                                    relativeSizeSpan = relativeSizeSpanArr[i2];
                                    Iterator it4 = it2;
                                    if (spannableStringBuilder.getSpanStart(relativeSizeSpan) <= iIntValue) {
                                        sizeChange = relativeSizeSpan.getSizeChange() * sizeChange;
                                    }
                                    if (spannableStringBuilder.getSpanStart(relativeSizeSpan) == iIntValue) {
                                        f4 = sizeChange;
                                    } else {
                                        f4 = sizeChange;
                                    }
                                    i2++;
                                    f = f6;
                                    it2 = it4;
                                    sizeChange = f4;
                                }
                                it = it2;
                                f2 = f;
                                spannableStringBuilder.setSpan(new RelativeSizeSpan(sizeChange), iIntValue, iIntValue2, 33);
                            }
                            i6 = 1;
                        } else {
                            it = it2;
                            f2 = 100.0f;
                            i6 = 1;
                            dq.x(spannableStringBuilder, new AbsoluteSizeSpan((int) pj0VarP2.k, true), iIntValue, iIntValue2);
                        }
                        if ("p".equals(this.a)) {
                            f3 = pj0VarP2.s;
                            if (f3 != Float.MAX_VALUE) {
                                jf1Var.o = (f3 * (-90.0f)) / f2;
                            }
                            alignment = pj0VarP2.o;
                            if (alignment != null) {
                                jf1Var.c = alignment;
                            }
                            alignment2 = pj0VarP2.p;
                            if (alignment2 != null) {
                                jf1Var.d = alignment2;
                            }
                        }
                        i11 = i6;
                        it2 = it;
                    } else {
                        continue;
                    }
                }
            }
            int i19 = 0;
            while (i19 < e()) {
                d(i19).j(j, map3, map2, str3, treeMap);
                i19++;
                map3 = map;
            }
        }
    }
}
