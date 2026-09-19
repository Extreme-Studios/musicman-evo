package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ns2 {
    public static final j03 b = j03.a(new byte[0]);
    public final HashMap a;

    public final Iterable a(byte[] bArr) {
        List list;
        j03 j03Var = b;
        HashMap map = this.a;
        List list2 = (List) map.get(j03Var);
        if (bArr.length >= 5) {
            int length = bArr.length;
            list = (List) map.get(new j03(5 > length ? length : 5, bArr));
        } else {
            list = null;
        }
        if (list2 == null && list == null) {
            return new ArrayList();
        }
        if (list2 == null) {
            return list;
        }
        return list == null ? list2 : new ls2(this, list, list2);
    }
}
