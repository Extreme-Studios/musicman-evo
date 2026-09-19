package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class hf0 extends t33 {
    public long h;
    public long[] i;
    public long[] j;

    public static String R1(cw1 cw1Var) {
        int iL = cw1Var.L();
        int i = cw1Var.b;
        cw1Var.G(iL);
        return new String(cw1Var.a, i, iL);
    }

    public static HashMap S1(cw1 cw1Var) {
        int iH = cw1Var.h();
        HashMap map = new HashMap(iH);
        for (int i = 0; i < iH; i++) {
            String strR1 = R1(cw1Var);
            Serializable serializableT1 = T1(cw1Var.K(), cw1Var);
            if (serializableT1 != null) {
                map.put(strR1, serializableT1);
            }
        }
        return map;
    }

    public static Serializable T1(int i, cw1 cw1Var) {
        if (i == 0) {
            return Double.valueOf(Double.longBitsToDouble(cw1Var.d()));
        }
        if (i == 1) {
            return Boolean.valueOf(cw1Var.K() == 1);
        }
        if (i == 2) {
            return R1(cw1Var);
        }
        if (i != 3) {
            if (i == 8) {
                return S1(cw1Var);
            }
            if (i != 10) {
                if (i != 11) {
                    return null;
                }
                Date date = new Date((long) Double.longBitsToDouble(cw1Var.d()));
                cw1Var.G(2);
                return date;
            }
            int iH = cw1Var.h();
            ArrayList arrayList = new ArrayList(iH);
            for (int i2 = 0; i2 < iH; i2++) {
                Serializable serializableT1 = T1(cw1Var.K(), cw1Var);
                if (serializableT1 != null) {
                    arrayList.add(serializableT1);
                }
            }
            return arrayList;
        }
        HashMap map = new HashMap();
        while (true) {
            String strR1 = R1(cw1Var);
            int iK = cw1Var.K();
            if (iK == 9) {
                return map;
            }
            Serializable serializableT2 = T1(iK, cw1Var);
            if (serializableT2 != null) {
                map.put(strR1, serializableT2);
            }
        }
    }
}
