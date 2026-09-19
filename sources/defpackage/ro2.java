package defpackage;

import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ro2 implements ss2 {
    public static final ro2 a = new ro2();
    public static final os2 b = new os2(vr2.class, yn2.class, ki2.k);

    @Override // defpackage.ss2
    public final Class a() {
        return yn2.class;
    }

    @Override // defpackage.ss2
    public final Object b(r52 r52Var, xr2 xr2Var, vg2 vg2Var) throws GeneralSecurityException {
        j03 j03VarI;
        List arrayList;
        HashMap map = new HashMap();
        for (int i = 0; i < ((List) r52Var.g).size(); i++) {
            eo2 eo2VarO = r52Var.O(i);
            if (eo2VarO.b == ao2.h) {
                a23 a23VarA = eo2VarO.a();
                if (a23VarA instanceof no2) {
                    j03VarI = ((no2) a23VarA).I();
                } else {
                    if (!(a23VarA instanceof vr2)) {
                        String name = a23VarA.getClass().getName();
                        String strValueOf = String.valueOf(a23VarA.u());
                        throw new GeneralSecurityException(ec.o(new StringBuilder(name.length() + 59 + strValueOf.length()), "Cannot get output prefix for key of class ", name, " with parameters ", strValueOf));
                    }
                    j03VarI = ((vr2) a23VarA).I();
                }
                po2 po2Var = new po2((yn2) vg2Var.m(eo2VarO), eo2VarO.c);
                byte[] bArr = j03VarI.a;
                if (bArr.length != 0 && bArr.length != 5) {
                    j7.r("PrefixMap only supports 0 and 5 byte prefixes");
                    return null;
                }
                if (map.containsKey(j03VarI)) {
                    arrayList = (List) map.get(j03VarI);
                } else {
                    arrayList = new ArrayList();
                    map.put(j03VarI, arrayList);
                }
                arrayList.add(po2Var);
            }
        }
        if (!xr2Var.a.isEmpty()) {
            bs2.b.a().getClass();
        }
        r52Var.J();
        return new qo2(new ns2(map));
    }

    @Override // defpackage.ss2
    public final Class c() {
        return yn2.class;
    }
}
