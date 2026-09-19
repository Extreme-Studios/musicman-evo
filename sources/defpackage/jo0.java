package defpackage;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class jo0 {
    public static final HashMap a;

    static {
        dk2 dk2Var;
        s62 s62Var = new s62();
        int size = 0;
        s62Var.g(yn0.f, -42L, -64L);
        s62Var.g(yn0.g, -6L, -53L);
        s62Var.g(yn0.h, -41L, -31L);
        s62Var.g(yn0.i, -40L, -28L);
        s62Var.g(yn0.j, -29L, -37L);
        s62Var.g(yn0.k, -80L, -32L);
        s62Var.g(yn0.l, -17L, -36L);
        s62Var.g(yn0.m, -82L, -35L);
        s62Var.g(yn0.n, -63L, -52L);
        s62Var.g(yn0.o, -23L, -11L);
        s62Var.g(yn0.p, -69L, -68L);
        s62Var.g(yn0.q, -62L, -55L);
        s62Var.g(yn0.r, -78L, -25L);
        s62Var.g(yn0.s, -71L, -3L);
        s62Var.g(yn0.t, -18L, -4L);
        s62Var.g(yn0.u, -67L, -19L);
        s62Var.g(yn0.v, -58L);
        s62Var.g(yn0.w, -2L);
        s62Var.g(yn0.x, -34L);
        s62Var.g(yn0.y, -30L);
        s62Var.g(yn0.z, -56L);
        s62Var.g(yn0.B, -57L);
        s62Var.g(yn0.C, -66L);
        s62Var.g(yn0.D, -60L);
        s62Var.g(yn0.E, -27L);
        s62Var.g(yn0.F, -26L);
        s62Var.g(yn0.G, -74L);
        s62Var.g(yn0.H, -77L);
        s62Var.g(yn0.J, -38L);
        s62Var.g(yn0.L, -79L);
        s62Var.g(yn0.M, -7L);
        s62Var.g(yn0.N, -51L);
        s62Var.g(yn0.O, -9L);
        s62Var.g(yn0.P, -47L);
        s62Var.g(yn0.Q, -70L);
        s62Var.g(yn0.R, -14L);
        s62Var.g(yn0.S, -5L);
        s62Var.g(yn0.T, -39L);
        s62Var.g(yn0.U, -8L);
        s62Var.g(yn0.V, -54L);
        s62Var.g(yn0.W, -15L);
        s62Var.g(yn0.X, -12L);
        s62Var.g(yn0.Y, -21L);
        s62Var.g(yn0.Z, -43L);
        s62Var.g(yn0.K, -20L);
        s62Var.g(yn0.I, -81L);
        s62Var.g(yn0.a0, -46L);
        s62Var.g(yn0.b0, -61L);
        s62Var.g(yn0.c0, -44L);
        s62Var.g(yn0.A, -59L);
        s62Var.g(yn0.d0, -49L);
        s62Var.g(yn0.e0, -75L);
        s62Var.g(yn0.f0, -24L);
        s62Var.g(yn0.k0, -13L);
        s62Var.g(yn0.l0, -1L);
        s62Var.g(yn0.g0, -33L);
        s62Var.g(yn0.h0, -45L);
        s62Var.g(yn0.i0, -50L);
        s62Var.g(yn0.j0, -65L);
        s62Var.g(yn0.m0, -16L);
        s62Var.g(yn0.n0, -73L);
        s62Var.g(yn0.o0, -10L);
        s62Var.g(yn0.p0, -48L);
        s62Var.g(yn0.q0, -22L);
        s62Var.g(yn0.r0, -76L);
        s62Var.g(yn0.s0, -72L);
        jj2 jj2Var = (jj2) s62Var.f;
        if (jj2Var == null) {
            dk2Var = oj2.l;
        } else {
            Collection collectionEntrySet = jj2Var.entrySet();
            if (((AbstractCollection) collectionEntrySet).isEmpty()) {
                dk2Var = oj2.l;
            } else {
                hj2<Map.Entry> hj2Var = (hj2) collectionEntrySet;
                um0 um0Var = new um0(hj2Var.g.size());
                for (Map.Entry entry : hj2Var) {
                    Object key = entry.getKey();
                    bk2 bk2VarJ = bk2.j(((ak2) entry.getValue()).h());
                    if (!bk2VarJ.isEmpty()) {
                        um0Var.m(key, bk2VarJ);
                        size += bk2VarJ.size();
                    }
                }
                dk2Var = new dk2(um0Var.s(), size);
            }
        }
        ck2 ck2Var = dk2Var.k;
        if (ck2Var == null) {
            ck2Var = new ck2(dk2Var);
            dk2Var.k = ck2Var;
        }
        dl2 dl2VarA = ck2Var.a();
        while (dl2VarA.hasNext()) {
            Map.Entry entry2 = (Map.Entry) dl2VarA.next();
            if (((Long) entry2.getValue()).longValue() > -1 || ((Long) entry2.getValue()).longValue() < -82) {
                throw new na(wn0.a("DkWkogARIjm8VAqEzyEdNWdUqAjIW8EtmA==").concat(String.valueOf(entry2.getValue())));
            }
        }
        HashMap map = new HashMap();
        ck2 ck2Var2 = dk2Var.k;
        if (ck2Var2 == null) {
            ck2Var2 = new ck2(dk2Var);
            dk2Var.k = ck2Var2;
        }
        dl2 dl2VarA2 = ck2Var2.a();
        while (dl2VarA2.hasNext()) {
            Map.Entry entry3 = (Map.Entry) dl2VarA2.next();
            yn0 yn0Var = (yn0) entry3.getKey();
            Long l = (Long) entry3.getValue();
            long jLongValue = l.longValue();
            if (map.containsKey(l)) {
                String strValueOf = String.valueOf(map.get(l));
                String strValueOf2 = String.valueOf(yn0Var);
                StringBuilder sb = new StringBuilder(strValueOf.length() + String.valueOf(jLongValue).length() + 27 + 5 + strValueOf2.length());
                String strA = wn0.a("H16u7wATM3S4Tl6egTYIeX5f+xfdXtsmmA==");
                String strA2 = wn0.a("cQk=");
                String strA3 = wn0.a("a0ivq0U=");
                sb.append(strA);
                sb.append(jLongValue);
                sb.append(strA2);
                sb.append(strValueOf);
                sb.append(strA3);
                sb.append(strValueOf2);
                throw new na(sb.toString());
            }
            map.put(l, yn0Var);
        }
        a = map;
    }
}
