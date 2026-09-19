package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class xn1 implements r63 {
    public final /* synthetic */ int a;

    public /* synthetic */ xn1(int i) {
        this.a = i;
    }

    @Override // defpackage.v63
    public final Object c() {
        switch (this.a) {
            case 0:
                return dv0.AD_LOADER;
            case 1:
                return "native";
            case 2:
                return null;
            case 3:
                return new oz1();
            case 4:
            case 5:
            case 6:
                return null;
            case 7:
                return new xq1();
            case 8:
                return new mr1();
            case 9:
                return new qr1();
            case 10:
                ya1 ya1Var = za1.a;
                dq.D(ya1Var);
                return new ur1(ya1Var);
            case 11:
                return new xr1(11, 12, 1007);
            case 12:
                return new xr1(19, 20, 1008);
            case 13:
                return new xr1(13, 14, 1004);
            case 14:
                return new xr1(1001, 1002, 1003);
            case 15:
                return new xr1(15, 16, 1005);
            case 16:
                return new xr1(17, 18, 1006);
            case 17:
                return new fs1("ttc", r62.g);
            case 18:
                return new fs1("t_load_as", r62.C);
            case 19:
                return new os1();
            case 20:
                return new et1();
            case zw0.zzm /* 21 */:
                zb3 zb3Var = vc3.C.c;
                String string = UUID.randomUUID().toString();
                dq.D(string);
                return string;
            case 22:
                return new wv1();
            case 23:
                ya1 ya1Var2 = za1.a;
                dq.D(ya1Var2);
                return new ez1(ya1Var2);
            case 24:
                return new pz1();
            case 25:
                return new j02();
            case 26:
                ya1 ya1Var3 = za1.a;
                dq.D(ya1Var3);
                return new c12(ya1Var3, 0);
            case 27:
                Object arrayList = new ArrayList();
                ix0 ix0Var = lx0.zc;
                tu0 tu0Var = tu0.e;
                if (!((String) tu0Var.c.a(ix0Var)).isEmpty()) {
                    arrayList = Arrays.asList(((String) tu0Var.c.a(ix0Var)).split(","));
                }
                dq.D(arrayList);
                return arrayList;
            case 28:
                ya1 ya1Var4 = za1.a;
                dq.D(ya1Var4);
                return new c12(ya1Var4, 1);
            default:
                ya1 ya1Var5 = za1.a;
                dq.D(ya1Var5);
                return new c12(ya1Var5, 2);
        }
    }
}
