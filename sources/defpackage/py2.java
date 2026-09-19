package defpackage;

import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class py2 implements ss2 {
    public static final py2 a = new py2();
    public static final os2 b = new os2(vr2.class, jo2.class, kt2.o);

    @Override // defpackage.ss2
    public final Class a() {
        return jo2.class;
    }

    @Override // defpackage.ss2
    public final Object b(r52 r52Var, xr2 xr2Var, vg2 vg2Var) throws GeneralSecurityException {
        j03 j03VarI;
        List arrayList;
        HashMap map = new HashMap();
        for (int i = 0; i < ((List) r52Var.g).size(); i++) {
            eo2 eo2VarO = r52Var.O(i);
            if (eo2VarO.b == ao2.h) {
                jo2 jo2Var = (jo2) vg2Var.m(eo2VarO);
                a23 a23VarA = eo2VarO.a();
                if (a23VarA instanceof gz2) {
                    j03VarI = ((gz2) a23VarA).I();
                } else {
                    if (!(a23VarA instanceof vr2)) {
                        String name = a23VarA.getClass().getName();
                        String strValueOf = String.valueOf(a23VarA.u());
                        throw new GeneralSecurityException(ec.o(new StringBuilder(name.length() + 59 + strValueOf.length()), "Cannot get output prefix for key of class ", name, " with parameters ", strValueOf));
                    }
                    j03VarI = ((vr2) a23VarA).I();
                }
                ny2 ny2Var = new ny2(jo2Var, eo2VarO.c);
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
                arrayList.add(ny2Var);
            }
        }
        if (!xr2Var.a.isEmpty()) {
            bs2.b.a().getClass();
        }
        return new oy2(new ns2(map));
    }

    @Override // defpackage.ss2
    public final Class c() {
        return jo2.class;
    }
}
