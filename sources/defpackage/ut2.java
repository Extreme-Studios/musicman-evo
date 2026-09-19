package defpackage;

import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ut2 implements ss2 {
    public static final ut2 a = new ut2();
    public static final os2 b = new os2(vr2.class, go2.class, kt2.h);

    @Override // defpackage.ss2
    public final Class a() {
        return go2.class;
    }

    @Override // defpackage.ss2
    public final Object b(r52 r52Var, xr2 xr2Var, vg2 vg2Var) throws GeneralSecurityException {
        j03 j03VarI;
        List list;
        HashMap map = new HashMap();
        for (int i = 0; i < ((List) r52Var.g).size(); i++) {
            eo2 eo2VarO = r52Var.O(i);
            if (eo2VarO.b == ao2.h) {
                a23 a23VarA = eo2VarO.a();
                if (a23VarA instanceof rt2) {
                    j03VarI = ((rt2) a23VarA).I();
                } else {
                    if (!(a23VarA instanceof vr2)) {
                        String name = a23VarA.getClass().getName();
                        String strValueOf = String.valueOf(a23VarA.u());
                        throw new GeneralSecurityException(ec.o(new StringBuilder(name.length() + 59 + strValueOf.length()), "Cannot get output prefix for key of class ", name, " with parameters ", strValueOf));
                    }
                    j03VarI = ((vr2) a23VarA).I();
                }
                et2 et2Var = new et2(2);
                byte[] bArr = j03VarI.a;
                if (bArr.length != 0 && bArr.length != 5) {
                    j7.r("PrefixMap only supports 0 and 5 byte prefixes");
                    return null;
                }
                if (map.containsKey(j03VarI)) {
                    list = (List) map.get(j03VarI);
                } else {
                    ArrayList arrayList = new ArrayList();
                    map.put(j03VarI, arrayList);
                    list = arrayList;
                }
                list.add(et2Var);
            }
        }
        if (!xr2Var.a.isEmpty()) {
            bs2.b.a().getClass();
        }
        r52Var.J();
        return new tt2();
    }

    @Override // defpackage.ss2
    public final Class c() {
        return go2.class;
    }
}
