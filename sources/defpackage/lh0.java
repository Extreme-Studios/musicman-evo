package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class lh0 implements wh2 {
    public final /* synthetic */ int a;
    public static final /* synthetic */ lh0 b = new lh0(1);
    public static final /* synthetic */ lh0 c = new lh0(2);
    public static final /* synthetic */ lh0 d = new lh0(3);
    public static final /* synthetic */ lh0 e = new lh0(4);
    public static final /* synthetic */ lh0 f = new lh0(5);
    public static final /* synthetic */ lh0 g = new lh0(6);
    public static final /* synthetic */ lh0 h = new lh0(7);
    public static final /* synthetic */ lh0 i = new lh0(8);
    public static final /* synthetic */ lh0 j = new lh0(9);
    public static final /* synthetic */ lh0 k = new lh0(10);
    public static final /* synthetic */ lh0 l = new lh0(11);
    public static final /* synthetic */ lh0 m = new lh0(12);
    public static final /* synthetic */ lh0 n = new lh0(13);
    public static final /* synthetic */ lh0 o = new lh0(14);
    public static final /* synthetic */ lh0 p = new lh0(15);
    public static final /* synthetic */ lh0 q = new lh0(16);
    public static final /* synthetic */ lh0 r = new lh0(17);
    public static final /* synthetic */ lh0 s = new lh0(19);
    public static final /* synthetic */ lh0 t = new lh0(20);
    public static final /* synthetic */ lh0 u = new lh0(21);
    public static final /* synthetic */ lh0 v = new lh0(22);
    public static final /* synthetic */ lh0 w = new lh0(23);
    public static final /* synthetic */ lh0 x = new lh0(24);
    public static final /* synthetic */ lh0 y = new lh0(25);
    public static final /* synthetic */ lh0 z = new lh0(26);
    public static final /* synthetic */ lh0 A = new lh0(27);
    public static final /* synthetic */ lh0 B = new lh0(29);

    public /* synthetic */ lh0(int i2) {
        this.a = i2;
    }

    @Override // defpackage.wh2
    public final Object apply(Object obj) {
        int i2 = 0;
        switch (this.a) {
            case 0:
                return (wh0) obj;
            case 1:
                wh0 wh0Var = (wh0) obj;
                int i3 = sh0.z;
                return wh0Var;
            case 2:
                ArrayList arrayList = ep0.M;
                return ((JSONObject) obj).optString("nas");
            case 3:
                ArrayList arrayList2 = ep0.M;
                jn.P("", (Exception) obj);
                return null;
            case 4:
                Throwable th = (Throwable) obj;
                m11 m11Var = u11.a;
                if (((Boolean) qy0.i.u()).booleanValue()) {
                    vc3.C.h.d("prepareClickUrl.attestation1", th);
                }
                return "failure_click_attok";
            case 5:
                List list = d91.l;
                return null;
            case 6:
                fj2 fj2Var = hg1.a;
                return Integer.valueOf(((tf1) obj).p);
            case 7:
                return "failure_click_attok";
            case 8:
                return new pi1((mi1) obj);
            case 9:
                return new pi1((List) obj);
            case 10:
                ArrayList arrayList3 = new ArrayList();
                for (oz0 oz0Var : (List) obj) {
                    if (oz0Var != null) {
                        arrayList3.add(oz0Var);
                    }
                }
                return arrayList3;
            case 11:
                ArrayList arrayList4 = new ArrayList();
                for (dq1 dq1Var : (List) obj) {
                    if (dq1Var != null) {
                        arrayList4.add(dq1Var);
                    }
                }
                return arrayList4;
            case 12:
                return Collections.singletonList(na1.t((no1) obj));
            case 13:
                ArrayList arrayList5 = (ArrayList) obj;
                return new m02(i2, true != arrayList5.isEmpty() ? arrayList5 : null);
            case 14:
                b7 b7Var = (b7) obj;
                return new p02(b7Var.a, b7Var.b, i2);
            case 15:
                return new f02((String) obj, 4);
            case 16:
                return new i02(2, (Bundle) obj);
            case 17:
                return new f02((String) obj, 5);
            case 18:
                return null;
            case 19:
                return (e42) obj;
            case 20:
                String str = ((f52) obj).b;
                if (TextUtils.isEmpty(str)) {
                    return "";
                }
                return o83.c() ? "fakeForAdDebugLog" : str;
            case zw0.zzm /* 21 */:
                String str2 = ((f52) obj).a;
                if (TextUtils.isEmpty(str2)) {
                    return "";
                }
                return o83.c() ? "fakeForAdDebugLog" : str2;
            case 22:
                return null;
            case 23:
                return null;
            case 24:
                return ag2.f;
            case 25:
                return ag2.g;
            case 26:
                return ag2.j;
            case 27:
                return ag2.i;
            case 28:
                wd2 wd2Var = (wd2) obj;
                int iG = wd2Var.G() - 1;
                if (iG == 1 || iG == 2) {
                    return wd2Var;
                }
                if (iG != 3) {
                    int iG2 = wd2Var.G() - 1;
                    throw new uf2(ec.j(new StringBuilder(String.valueOf(iG2).length() + 3), "r: ", iG2));
                }
                int iG3 = wd2Var.G() - 1;
                throw new wf2(ec.j(new StringBuilder(String.valueOf(iG3).length() + 3), "r: ", iG3));
            default:
                return ag2.h;
        }
    }
}
