package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class vx1 implements tw1 {
    public final hf1 a;
    public final ya1 b;
    public final y91 c;
    public final t52 d;
    public final xq1 e;
    public final cs1 f;
    public final d60 g;
    public final Context h;

    public vx1(hf1 hf1Var, ya1 ya1Var, y91 y91Var, t52 t52Var, xq1 xq1Var, cs1 cs1Var, d60 d60Var, Context context, ue0 ue0Var) {
        this.g = d60Var;
        this.h = context;
        this.a = hf1Var;
        this.b = ya1Var;
        this.c = y91Var;
        this.d = t52Var;
        this.e = xq1Var;
        this.f = cs1Var;
    }

    @Override // defpackage.tw1
    public final boolean a(e52 e52Var, x42 x42Var) {
        b52 b52Var = x42Var.s;
        return (b52Var == null || b52Var.c == null) ? false : true;
    }

    @Override // defpackage.tw1
    public final hp b(e52 e52Var, x42 x42Var) {
        if (((Boolean) tu0.e.c.a(lx0.o2)).booleanValue()) {
            ec.q(vc3.C.k, this.f.e, "rendering-native-ads-native-js-webview-start");
        }
        hp hpVarB = this.d.b();
        yy0 yy0Var = new yy0(this, 12, x42Var);
        ya1 ya1Var = this.b;
        return na1.L(na1.L(hpVarB, yy0Var, ya1Var), new qn0(this, e52Var, x42Var, 9), ya1Var);
    }

    /* JADX WARN: Code duplicated, block: B:105:0x038b A[PHI: r11 r26
  0x038b: PHI (r11v16 hp) = (r11v15 hp), (r11v15 hp), (r11v15 hp), (r11v15 hp), (r11v43 hp), (r11v43 hp), (r11v43 hp) binds: [B:98:0x0371, B:100:0x0377, B:102:0x0383, B:104:0x0389, B:173:0x038b, B:170:0x038b, B:115:0x03b7] A[DONT_GENERATE, DONT_INLINE]
  0x038b: PHI (r26v5 cs1) = (r26v4 cs1), (r26v4 cs1), (r26v4 cs1), (r26v4 cs1), (r26v11 cs1), (r26v11 cs1), (r26v11 cs1) binds: [B:98:0x0371, B:100:0x0377, B:102:0x0383, B:104:0x0389, B:173:0x038b, B:170:0x038b, B:115:0x03b7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:125:0x041b  */
    /* JADX WARN: Code duplicated, block: B:127:0x042c  */
    /* JADX WARN: Code duplicated, block: B:129:0x0440  */
    /* JADX WARN: Code duplicated, block: B:130:0x0452  */
    /* JADX WARN: Code duplicated, block: B:133:0x0460  */
    /* JADX WARN: Code duplicated, block: B:135:0x0468  */
    /* JADX WARN: Code duplicated, block: B:138:0x0474  */
    /* JADX WARN: Code duplicated, block: B:140:0x047e  */
    /* JADX WARN: Code duplicated, block: B:141:0x0485  */
    /* JADX WARN: Code duplicated, block: B:143:0x0497  */
    /* JADX WARN: Code duplicated, block: B:144:0x04a9  */
    /* JADX WARN: Code duplicated, block: B:146:0x04af  */
    /* JADX WARN: Code duplicated, block: B:147:0x04cf  */
    /* JADX WARN: Code duplicated, block: B:152:0x0506 A[ADDED_TO_REGION, REMOVE] */
    /* JADX WARN: Code duplicated, block: B:153:0x0509  */
    /* JADX WARN: Code duplicated, block: B:158:0x0520  */
    /* JADX WARN: Code duplicated, block: B:159:0x0523  */
    /* JADX WARN: Code duplicated, block: B:161:0x0535  */
    /* JADX WARN: Code duplicated, block: B:165:0x0592  */
    /* JADX WARN: Code duplicated, block: B:167:0x059b  */
    /* JADX WARN: Code duplicated, block: B:48:0x0179  */
    /* JADX WARN: Code duplicated, block: B:50:0x0187  */
    /* JADX WARN: Code duplicated, block: B:53:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:57:0x021e  */
    /* JADX WARN: Code duplicated, block: B:59:0x0226  */
    /* JADX WARN: Code duplicated, block: B:65:0x025c  */
    /* JADX WARN: Code duplicated, block: B:66:0x0269  */
    /* JADX WARN: Code duplicated, block: B:69:0x0289  */
    /* JADX WARN: Code duplicated, block: B:70:0x028b  */
    /* JADX WARN: Code duplicated, block: B:73:0x0298  */
    /* JADX WARN: Code duplicated, block: B:75:0x029e  */
    /* JADX WARN: Code duplicated, block: B:77:0x02a5  */
    /* JADX WARN: Code duplicated, block: B:82:0x02c3  */
    /* JADX WARN: Code duplicated, block: B:85:0x02ca A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:86:0x02cc  */
    /* JADX WARN: Code duplicated, block: B:88:0x02da A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:89:0x02dc  */
    /* JADX WARN: Code duplicated, block: B:91:0x02ef  */
    /* JADX WARN: Code duplicated, block: B:92:0x0301  */
    /* JADX WARN: Code duplicated, block: B:96:0x0356  */
    /* JADX WARN: Code duplicated, block: B:99:0x0373  */
    public final bn2 c(final e52 e52Var, final x42 x42Var, final JSONObject jSONObject) {
        vs0 vs0Var;
        d91 d91Var;
        hp hpVar;
        z42 z42Var;
        vs0 vs0Var2;
        d91 d91Var2;
        aq1 aq1Var;
        String str;
        hp hpVarL;
        hp hpVar2;
        int i;
        kb3 kb3Var;
        kn2 kn2Var;
        hp hpVarB;
        hp hpVarB2;
        JSONObject jSONObjectOptJSONObject;
        JSONArray jSONArrayOptJSONArray;
        z42 z42Var2;
        JSONObject jSONObjectOptJSONObject2;
        hp hpVar3;
        qm2 qm2VarM;
        hp hpVarJ;
        hp hpVar4;
        String[] strArr;
        JSONObject jSONObjectY0;
        JSONObject jSONObjectOptJSONObject3;
        hp hpVarD;
        vs0 vs0Var3;
        aq1 aq1Var2;
        hp hpVar5;
        cs1 cs1Var;
        hp hpVarT;
        p83 p83Var;
        Executor executor;
        JSONArray jSONArrayOptJSONArray2;
        ArrayList arrayList;
        int length;
        int i2;
        hp hpVar6;
        hp hpVarM;
        JSONObject jSONObjectOptJSONObject4;
        JSONArray jSONArray;
        String strOptString;
        int i3;
        String strOptString2;
        Future futureM;
        JSONObject jSONObjectOptJSONObject5;
        String strOptString3;
        hp hpVarL2;
        ArrayList arrayList2;
        JSONArray jSONArrayOptJSONArray3;
        JSONObject jSONObjectOptJSONObject6;
        String strOptString4;
        boolean z;
        hq1 hq1Var;
        pm2 pm2VarL;
        d91 d91Var3;
        ix0 ix0Var = lx0.p2;
        tu0 tu0Var = tu0.e;
        kx0 kx0Var = tu0Var.c;
        kx0 kx0Var2 = tu0Var.c;
        if (((Boolean) kx0Var.a(ix0Var)).booleanValue()) {
            ec.q(vc3.C.k, this.f.e, "rendering-webview-creation-start");
        }
        final hp hpVarB3 = this.d.b();
        boolean zBooleanValue = ((Boolean) kx0Var2.a(lx0.pe)).booleanValue();
        Context context = this.h;
        if (zBooleanValue) {
            e91 e91Var = x42Var.A;
            if (e91Var != null) {
                b52 b52Var = x42Var.s;
                d91Var3 = new d91(context, this.g, e91Var, b52Var == null ? null : b52Var.b);
            } else {
                d91Var3 = null;
            }
            vs0Var = new vs0(context, d91Var3);
            d91Var = d91Var3;
        } else {
            vs0Var = new vs0(context, null);
            d91Var = null;
        }
        vs0 vs0Var4 = vs0Var;
        y91 y91Var = this.c;
        ya1 ya1Var = (ya1) y91Var.g;
        aq1 aq1Var3 = (aq1) y91Var.h;
        qz0 qz0Var = aq1Var3.h;
        if (((Boolean) kx0Var2.a(lx0.o2)).booleanValue()) {
            ec.q(vc3.C.k, ((cs1) y91Var.j).e, "rendering-native-assets-loading-start");
        }
        y91 y91Var2 = y91Var;
        hp hpVarB4 = ya1Var.b(new wp1(y91Var, e52Var, x42Var, jSONObject, 0));
        y91Var2.H(46, hpVarB4);
        cs1 cs1Var2 = aq1Var3.r;
        String str2 = "images";
        final hp hpVarA = aq1Var3.a(jSONObject.optJSONArray("images"), qz0Var.g, qz0Var.i, 47);
        y91Var2.H(48, hpVarA);
        z42 z42Var3 = (z42) e52Var.b.h;
        if (((Boolean) kx0Var2.a(lx0.Oa)).booleanValue()) {
            JSONArray jSONArrayOptJSONArray4 = jSONObject.optJSONArray("images");
            if (jSONArrayOptJSONArray4 == null || jSONArrayOptJSONArray4.length() <= 0) {
                hpVar = hpVarB4;
                z42Var = z42Var3;
                vs0Var2 = vs0Var4;
                d91Var2 = d91Var;
                aq1Var = aq1Var3;
                str = "html";
                hpVarL = kn2.g;
            } else {
                JSONObject jSONObjectOptJSONObject7 = jSONArrayOptJSONArray4.optJSONObject(0);
                if (jSONObjectOptJSONObject7 == null) {
                    kn2Var = kn2.g;
                } else if (((Boolean) kx0Var2.a(lx0.o4)).booleanValue() && jSONObjectOptJSONObject7.has((String) kx0Var2.a(lx0.p4))) {
                    kn2Var = kn2.g;
                } else {
                    String strOptString5 = jSONObjectOptJSONObject7.optString("base_url");
                    String strOptString6 = jSONObjectOptJSONObject7.optString("html");
                    int iOptInt = jSONObjectOptJSONObject7.optInt("width", 0);
                    int iOptInt2 = jSONObjectOptJSONObject7.optInt("height", 0);
                    if (iOptInt == 0) {
                        if (iOptInt2 != 0) {
                            i = 0;
                        } else {
                            kb3Var = kb3.a();
                        }
                        if (TextUtils.isEmpty(strOptString6)) {
                            z42Var = z42Var3;
                            vs0Var2 = vs0Var4;
                            d91Var2 = d91Var;
                            aq1Var = aq1Var3;
                            str = "html";
                            hpVar = hpVarB4;
                            hpVarL = kn2.g;
                        } else {
                            if (((Boolean) kx0Var2.a(lx0.t2)).booleanValue()) {
                                ec.q(vc3.C.k, cs1Var2.e, "native-assets-loading-image-composition-start");
                            }
                            kn2 kn2Var2 = kn2.g;
                            str = "html";
                            d91 d91Var4 = d91Var;
                            hpVar = hpVarB4;
                            yp1 yp1Var = new yp1(aq1Var3, kb3Var, x42Var, z42Var3, vs0Var4, d91Var4, strOptString5, strOptString6, 0);
                            aq1Var = aq1Var3;
                            z42Var = z42Var3;
                            vs0Var2 = vs0Var4;
                            d91Var2 = d91Var4;
                            pm2 pm2VarL2 = na1.L(kn2Var2, yp1Var, za1.f);
                            hpVarL = na1.L(pm2VarL2, new zp1(pm2VarL2, 0), za1.g);
                        }
                    } else {
                        i = iOptInt;
                    }
                    kb3Var = new kb3(aq1Var3.a, new s2(i, iOptInt2));
                    if (TextUtils.isEmpty(strOptString6)) {
                        if (((Boolean) kx0Var2.a(lx0.t2)).booleanValue()) {
                            ec.q(vc3.C.k, cs1Var2.e, "native-assets-loading-image-composition-start");
                        }
                        kn2 kn2Var3 = kn2.g;
                        str = "html";
                        d91 d91Var5 = d91Var;
                        hpVar = hpVarB4;
                        yp1 yp1Var2 = new yp1(aq1Var3, kb3Var, x42Var, z42Var3, vs0Var4, d91Var5, strOptString5, strOptString6, 0);
                        aq1Var = aq1Var3;
                        z42Var = z42Var3;
                        vs0Var2 = vs0Var4;
                        d91Var2 = d91Var5;
                        pm2 pm2VarL3 = na1.L(kn2Var3, yp1Var2, za1.f);
                        hpVarL = na1.L(pm2VarL3, new zp1(pm2VarL3, 0), za1.g);
                    } else {
                        z42Var = z42Var3;
                        vs0Var2 = vs0Var4;
                        d91Var2 = d91Var;
                        aq1Var = aq1Var3;
                        str = "html";
                        hpVar = hpVarB4;
                        hpVarL = kn2.g;
                    }
                }
            }
            hpVar2 = hpVarL;
            final y91 y91Var3 = y91Var2;
            y91Var3.H(50, hpVar2);
            hpVarB = aq1Var.b(jSONObject.optJSONObject("secondary_image"), qz0Var.g, 51);
            y91Var3.H(52, hpVarB);
            hpVarB2 = aq1Var.b(jSONObject.optJSONObject("app_icon"), qz0Var.g, 53);
            y91Var3.H(54, hpVarB2);
            jSONObjectOptJSONObject = jSONObject.optJSONObject("attribution");
            if (jSONObjectOptJSONObject == null) {
                hpVarJ = kn2.g;
                z42Var2 = z42Var;
                hpVar3 = hpVarB2;
            } else {
                jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray(str2);
                z42Var2 = z42Var;
                jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("image");
                if (jSONArrayOptJSONArray == null && jSONObjectOptJSONObject2 != null) {
                    jSONArrayOptJSONArray = new JSONArray();
                    jSONArrayOptJSONArray.put(jSONObjectOptJSONObject2);
                }
                hpVar3 = hpVarB2;
                qm2VarM = na1.M(aq1Var.a(jSONArrayOptJSONArray, false, true, 55), new hl0(aq1Var, 2, jSONObjectOptJSONObject), aq1Var.g);
                if (jSONObjectOptJSONObject.optBoolean("require")) {
                    hpVarJ = na1.L(qm2VarM, new r21(5, qm2VarM), za1.g);
                } else {
                    hpVarJ = na1.J(qm2VarM, Exception.class, new kg0(2), za1.g);
                }
            }
            hpVar4 = hpVarJ;
            y91Var3.H(56, hpVar4);
            strArr = new String[]{"html_containers", "instream"};
            jSONObjectY0 = w40.Y0(jSONObject, strArr);
            if (jSONObjectY0 == null) {
                jSONObjectOptJSONObject3 = null;
            } else {
                jSONObjectOptJSONObject3 = jSONObjectY0.optJSONObject(strArr[1]);
            }
            if (jSONObjectOptJSONObject3 == null) {
                jSONObjectOptJSONObject6 = jSONObject.optJSONObject("video");
                if (jSONObjectOptJSONObject6 == null) {
                    strOptString4 = jSONObjectOptJSONObject6.optString("vast_xml");
                    if (((Boolean) kx0Var2.a(lx0.Na)).booleanValue() || !jSONObjectOptJSONObject6.has(str)) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (TextUtils.isEmpty(strOptString4)) {
                        if (!z) {
                            hq1Var = aq1Var.i;
                            hq1Var.getClass();
                            if (((Boolean) kx0Var2.a(lx0.t2)).booleanValue()) {
                                ec.q(vc3.C.k, hq1Var.i.e, "native-assets-loading-video-start");
                            }
                            kn2 kn2Var4 = kn2.g;
                            qn0 qn0Var = new qn0(hq1Var, vs0Var2, d91Var2, 2);
                            Executor executor2 = hq1Var.b;
                            pm2VarL = na1.L(na1.L(kn2Var4, qn0Var, executor2), new yy0(hq1Var, 5, jSONObjectOptJSONObject6), executor2);
                            aq1Var = aq1Var;
                            vs0Var2 = vs0Var2;
                        }
                        hpVarD = na1.J(na1.K(pm2VarL, ((Integer) kx0Var2.a(lx0.g4)).intValue(), TimeUnit.SECONDS, aq1Var.k), Exception.class, new kg0(2), za1.g);
                        aq1Var2 = aq1Var;
                        vs0Var3 = vs0Var2;
                        y91Var3.H(58, hpVarD);
                        if (((Boolean) kx0Var2.a(lx0.Nd)).booleanValue() || !jSONObject.has("video")) {
                            hpVar5 = hpVar4;
                            cs1Var = cs1Var2;
                            hpVarT = na1.t(new Bundle());
                        } else {
                            JSONObject jSONObjectOptJSONObject8 = jSONObject.optJSONObject("video");
                            if (!jSONObjectOptJSONObject8.has("flags") || (jSONArrayOptJSONArray3 = jSONObjectOptJSONObject8.optJSONArray("flags")) == null) {
                                hpVar5 = hpVar4;
                                cs1Var = cs1Var2;
                                hpVarT = na1.t(new Bundle());
                            } else {
                                int i4 = 0;
                                while (true) {
                                    if (i4 < jSONArrayOptJSONArray3.length()) {
                                        JSONObject jSONObjectOptJSONObject9 = jSONArrayOptJSONArray3.optJSONObject(i4);
                                        if (jSONObjectOptJSONObject9 == null || !jSONObjectOptJSONObject9.optString("key").equals("afma_video_player_type")) {
                                            i4++;
                                            cs1Var2 = cs1Var2;
                                            hpVar4 = hpVar4;
                                        } else {
                                            try {
                                                if (Integer.parseInt(jSONObjectOptJSONObject9.optString("value")) == 3) {
                                                    cs1Var = cs1Var2;
                                                    if (((Boolean) tu0.e.c.a(lx0.t2)).booleanValue()) {
                                                        ec.q(vc3.C.k, cs1Var.e, "native-assets-loading-media-start");
                                                    }
                                                    cb1 cb1Var = new cb1();
                                                    hpVar5 = hpVar4;
                                                    hpVarD.a(new in2(hpVarD, 0, new s70(aq1Var2, cb1Var)), za1.f);
                                                    y91Var3.H(61, cb1Var);
                                                    hpVarT = cb1Var;
                                                }
                                            } catch (NumberFormatException unused) {
                                            }
                                        }
                                    }
                                    hpVar5 = hpVar4;
                                    cs1Var = cs1Var2;
                                    hpVarT = na1.t(new Bundle());
                                }
                            }
                        }
                        final hp hpVar7 = hpVarT;
                        p83Var = (p83) y91Var3.i;
                        executor = (Executor) p83Var.g;
                        jSONArrayOptJSONArray2 = jSONObject.optJSONArray("custom_assets");
                        if (jSONArrayOptJSONArray2 == null) {
                            hpVarM = na1.t(Collections.EMPTY_LIST);
                            hpVarD = hpVarD;
                            hpVar6 = hpVarB;
                        } else {
                            if (((Boolean) tu0.e.c.a(lx0.t2)).booleanValue()) {
                                ec.q(vc3.C.k, ((cs1) p83Var.i).e, "native-assets-loading-custom-start");
                            }
                            arrayList = new ArrayList();
                            length = jSONArrayOptJSONArray2.length();
                            i2 = 0;
                            while (i2 < length) {
                                int i5 = length;
                                jSONObjectOptJSONObject4 = jSONArrayOptJSONArray2.optJSONObject(i2);
                                if (jSONObjectOptJSONObject4 == null) {
                                    futureM = kn2.g;
                                    jSONArray = jSONArrayOptJSONArray2;
                                } else {
                                    jSONArray = jSONArrayOptJSONArray2;
                                    strOptString = jSONObjectOptJSONObject4.optString("name");
                                    if (strOptString == null) {
                                        futureM = kn2.g;
                                    } else {
                                        i3 = i2;
                                        strOptString2 = jSONObjectOptJSONObject4.optString("type");
                                        hpVarB = hpVarB;
                                        if ("string".equals(strOptString2)) {
                                            futureM = na1.t(new dq1(strOptString, jSONObjectOptJSONObject4.optString("string_value")));
                                            p83Var = p83Var;
                                        } else if ("image".equals(strOptString2)) {
                                            aq1 aq1Var4 = (aq1) p83Var.h;
                                            p83Var = p83Var;
                                            futureM = na1.M(aq1Var4.b(jSONObjectOptJSONObject4.optJSONObject("image_value"), aq1Var4.h.g, 0), new r11(strOptString, 2), executor);
                                        } else {
                                            p83Var = p83Var;
                                            futureM = kn2.g;
                                        }
                                    }
                                    arrayList.add(futureM);
                                    i2 = i3 + 1;
                                    length = i5;
                                    jSONArrayOptJSONArray2 = jSONArray;
                                    hpVarB = hpVarB;
                                    p83Var = p83Var;
                                }
                                i3 = i2;
                                arrayList.add(futureM);
                                i2 = i3 + 1;
                                length = i5;
                                jSONArrayOptJSONArray2 = jSONArray;
                                hpVarB = hpVarB;
                                p83Var = p83Var;
                            }
                            hpVar6 = hpVarB;
                            hpVarM = na1.M(new ym2(vj2.m(arrayList), true), lh0.l, executor);
                        }
                        final hp hpVar8 = hpVarM;
                        y91Var3.H(63, hpVar8);
                        if (jSONObject.optBoolean("enable_omid") || (jSONObjectOptJSONObject5 = jSONObject.optJSONObject("omid_settings")) == null) {
                            hpVarL2 = kn2.g;
                        } else {
                            strOptString3 = jSONObjectOptJSONObject5.optString("omid_html");
                            if (TextUtils.isEmpty(strOptString3)) {
                                hpVarL2 = kn2.g;
                            } else {
                                if (((Boolean) tu0.e.c.a(lx0.t2)).booleanValue()) {
                                    ec.q(vc3.C.k, cs1Var.e, "native-assets-loading-omid-start");
                                }
                                hpVarL2 = na1.L(kn2.g, new c41(aq1Var2, strOptString3, d91Var2, vs0Var3), za1.f);
                            }
                        }
                        y91Var3.H(65, hpVarL2);
                        arrayList2 = new ArrayList();
                        final hp hpVar9 = hpVar;
                        arrayList2.add(hpVar9);
                        arrayList2.add(hpVarA);
                        arrayList2.add(hpVar2);
                        final hp hpVar10 = hpVar6;
                        arrayList2.add(hpVar10);
                        final hp hpVar11 = hpVar3;
                        arrayList2.add(hpVar11);
                        final hp hpVar12 = hpVar5;
                        arrayList2.add(hpVar12);
                        final hp hpVar13 = hpVarD;
                        arrayList2.add(hpVar13);
                        arrayList2.add(hpVar7);
                        arrayList2.add(hpVar8);
                        if (((Boolean) tu0.e.c.a(lx0.N5)).booleanValue() || jSONObject.optInt("template_id") == 3) {
                            arrayList2.add(hpVarL2);
                        }
                        vj2 vj2VarM = vj2.m(arrayList2);
                        final d91 d91Var6 = d91Var2;
                        final hp hpVar14 = hpVarL2;
                        final hp hpVar15 = hpVar2;
                        Callable callable = new Callable() { // from class: vp1
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                JSONArray jSONArrayOptJSONArray5;
                                List listM;
                                JSONObject jSONObjectOptJSONObject10;
                                y91 y91Var4 = y91Var3;
                                hp hpVar16 = hpVar9;
                                hp hpVar17 = hpVarA;
                                hp hpVar18 = hpVar11;
                                hp hpVar19 = hpVar10;
                                hp hpVar20 = hpVar12;
                                JSONObject jSONObject2 = jSONObject;
                                hp hpVar21 = hpVar13;
                                hp hpVar22 = hpVar7;
                                hp hpVar23 = hpVar15;
                                hp hpVar24 = hpVar14;
                                hp hpVar25 = hpVar8;
                                if (((Boolean) tu0.e.c.a(lx0.o2)).booleanValue()) {
                                    ec.q(vc3.C.k, ((cs1) y91Var4.j).e, "rendering-native-assets-loading-end");
                                }
                                ro1 ro1Var = (ro1) hpVar16.get();
                                List list = (List) hpVar17.get();
                                synchronized (ro1Var) {
                                    ro1Var.e = list;
                                }
                                a01 a01Var = (a01) hpVar18.get();
                                synchronized (ro1Var) {
                                    ro1Var.s = a01Var;
                                }
                                a01 a01Var2 = (a01) hpVar19.get();
                                synchronized (ro1Var) {
                                    ro1Var.t = a01Var2;
                                }
                                wz0 wz0Var = (wz0) hpVar20.get();
                                synchronized (ro1Var) {
                                    ro1Var.c = wz0Var;
                                }
                                JSONObject jSONObjectOptJSONObject11 = jSONObject2.optJSONObject("mute");
                                if (jSONObjectOptJSONObject11 == null || (jSONArrayOptJSONArray5 = jSONObjectOptJSONObject11.optJSONArray("reasons")) == null || jSONArrayOptJSONArray5.length() <= 0) {
                                    tj2 tj2Var = vj2.g;
                                    listM = qk2.j;
                                } else {
                                    ArrayList arrayList3 = new ArrayList();
                                    for (int i6 = 0; i6 < jSONArrayOptJSONArray5.length(); i6++) {
                                        y22 y22VarE = aq1.e(jSONArrayOptJSONArray5.optJSONObject(i6));
                                        if (y22VarE != null) {
                                            arrayList3.add(y22VarE);
                                        }
                                    }
                                    listM = vj2.m(arrayList3);
                                }
                                synchronized (ro1Var) {
                                    ro1Var.f = listM;
                                }
                                JSONObject jSONObjectOptJSONObject12 = jSONObject2.optJSONObject("mute");
                                y22 y22VarE2 = (jSONObjectOptJSONObject12 == null || (jSONObjectOptJSONObject10 = jSONObjectOptJSONObject12.optJSONObject("default_reason")) == null) ? null : aq1.e(jSONObjectOptJSONObject10);
                                synchronized (ro1Var) {
                                    ro1Var.g = y22VarE2;
                                }
                                md1 md1Var = (md1) hpVar21.get();
                                if (md1Var != null) {
                                    synchronized (ro1Var) {
                                        ro1Var.i = md1Var;
                                    }
                                    View viewP0 = md1Var.p0();
                                    synchronized (ro1Var) {
                                        ro1Var.o = viewP0;
                                    }
                                    fe1 fe1VarF = md1Var.f();
                                    synchronized (ro1Var) {
                                        ro1Var.b = fe1VarF;
                                    }
                                }
                                ro1Var.d().putAll((Bundle) hpVar22.get());
                                md1 md1Var2 = (md1) hpVar23.get();
                                if (md1Var2 != null) {
                                    synchronized (ro1Var) {
                                        ro1Var.j = md1Var2;
                                    }
                                    View viewP1 = md1Var2.p0();
                                    synchronized (ro1Var) {
                                        ro1Var.p = viewP1;
                                    }
                                }
                                if (!((Boolean) tu0.e.c.a(lx0.N5)).booleanValue() || jSONObject2.optInt("template_id") == 3) {
                                    md1 md1Var3 = (md1) hpVar24.get();
                                    if (md1Var3 != null) {
                                        synchronized (ro1Var) {
                                            ro1Var.k = md1Var3;
                                        }
                                    }
                                } else {
                                    synchronized (ro1Var) {
                                        ro1Var.m = hpVar24;
                                    }
                                    cb1 cb1Var2 = new cb1();
                                    synchronized (ro1Var) {
                                        ro1Var.n = cb1Var2;
                                    }
                                }
                                for (dq1 dq1Var : (List) hpVar25.get()) {
                                    int i7 = dq1Var.a;
                                    String str3 = dq1Var.b;
                                    if (i7 != 1) {
                                        oz0 oz0Var = dq1Var.d;
                                        synchronized (ro1Var) {
                                            q00 q00Var = ro1Var.v;
                                            if (oz0Var == null) {
                                                q00Var.remove(str3);
                                            } else {
                                                q00Var.put(str3, oz0Var);
                                            }
                                        }
                                    } else {
                                        ro1Var.o(str3, dq1Var.c);
                                    }
                                }
                                return ro1Var;
                            }
                        };
                        final bn2 bn2Var = new bn2(vj2VarM, false, false);
                        bn2Var.u = new an2(bn2Var, callable, ya1Var);
                        bn2Var.v();
                        qk2 qk2VarN = vj2.n(new hp[]{hpVarB3, bn2Var});
                        final vs0 vs0Var5 = vs0Var3;
                        Callable callable2 = new Callable() { // from class: ux1
                            /* JADX WARN: Code duplicated, block: B:51:0x0913  */
                            /* JADX WARN: Multi-variable type inference failed */
                            /* JADX WARN: Type inference failed for: r12v14, types: [bl1, j11] */
                            /* JADX WARN: Type inference failed for: r12v15 */
                            /* JADX WARN: Type inference failed for: r12v16 */
                            /* JADX WARN: Type inference failed for: r8v2 */
                            /* JADX WARN: Type inference failed for: r8v3, types: [bw1, es1] */
                            /* JADX WARN: Type inference failed for: r8v7 */
                            /* JADX WARN: Type inference failed for: r9v6, types: [he1] */
                            @Override // java.util.concurrent.Callable
                            public final Object call() throws Throwable {
                                vx1 vx1Var;
                                final int i6;
                                ?? r8;
                                vx1 vx1Var2 = this.a;
                                bn2 bn2Var2 = bn2Var;
                                hp hpVar16 = hpVarB3;
                                e52 e52Var2 = e52Var;
                                x42 x42Var2 = x42Var;
                                JSONObject jSONObject2 = jSONObject;
                                vs0 vs0Var6 = vs0Var5;
                                d91 d91Var7 = d91Var6;
                                ro1 ro1Var = (ro1) bn2Var2.get();
                                uq1 uq1Var = (uq1) hpVar16.get();
                                ix0 ix0Var2 = lx0.p2;
                                tu0 tu0Var2 = tu0.e;
                                if (((Boolean) tu0Var2.c.a(ix0Var2)).booleanValue()) {
                                    ec.q(vc3.C.k, vx1Var2.f.e, "rendering-webview-creation-end");
                                }
                                hf1 hf1Var = vx1Var2.a;
                                p83 p83Var2 = new p83(e52Var2, x42Var2, (String) null);
                                kc2 kc2Var = new kc2(23, ro1Var);
                                u40 u40Var = new u40(jSONObject2, uq1Var, vs0Var6, d91Var7, 10, false);
                                if1 if1Var = hf1Var.b;
                                hf1 hf1Var2 = hf1Var.c;
                                q63 q63VarA = q63.a(new eg1(if1Var.G0, 9));
                                ti1 ti1Var = new ti1(p83Var2, 0);
                                do1 do1Var = new do1(u40Var, 0);
                                hj1 hj1Var = new hj1(q63.a(new da1(ti1Var, do1Var, 14)), 29);
                                q63 q63VarA2 = q63.a(new tz0(12, hj1Var));
                                ef1 ef1Var = if1Var.h;
                                xn1 xn1Var = yd.l;
                                q63 q63VarA3 = q63.a(new i91(ef1Var, q63VarA2, xn1Var, 1));
                                q63 q63VarA4 = q63.a(new jh1(q63VarA, q63.a(new eh1(if1Var.g, q63VarA3, 0)), if1Var.c, q63.a(new re1(q63VarA3, q63VarA, 3)), if1Var.f));
                                q63 q63VarA5 = q63.a(new re1(q63VarA4, q63VarA2, 5));
                                q63 q63VarA6 = q63.a(new vg1(hf1Var2.g, ti1Var, 1));
                                q63 q63VarA7 = q63.a(new hj1(q63VarA6, 7));
                                int i7 = w63.c;
                                ArrayList arrayList3 = new ArrayList(1);
                                ArrayList arrayList4 = new ArrayList(3);
                                arrayList4.add(hf1Var2.o);
                                arrayList4.add(hf1Var2.p);
                                arrayList4.add(q63VarA5);
                                arrayList3.add(q63VarA7);
                                q63 q63VarA8 = q63.a(new bk1(new w63(arrayList3, arrayList4), 3));
                                q63 q63VarA9 = q63.a(v51.j);
                                q63 q63Var = if1Var.c;
                                q63 q63VarA10 = q63.a(new eh1(q63VarA9, (v63) q63Var, 4));
                                ti1 ti1Var2 = new ti1(p83Var2, 3);
                                ti1 ti1Var3 = new ti1(p83Var2, 2);
                                xe1 xe1Var = if1Var.g;
                                q63 q63VarA11 = q63.a(new eg1(xe1Var, 20));
                                q63 q63VarA12 = q63.a(ar.j);
                                q63 q63VarA13 = q63.a(new tg1(xe1Var, if1Var.X, q63VarA11, q63VarA12, if1Var.D0, if1Var.d));
                                q63 q63VarA14 = q63.a(new yn1(if1Var.I, if1Var.H, ti1Var, ti1Var3, q63VarA13, hf1Var2.e));
                                xn1 xn1Var2 = new xn1(4);
                                xn1 xn1Var3 = new xn1(2);
                                q63 q63VarA15 = q63.a(new eh1(q63VarA9, (v63) q63Var, 9));
                                q63 q63VarA16 = q63.a(hn.p);
                                eo1 eo1Var = new eo1(q63VarA16, 2);
                                ArrayList arrayList5 = new ArrayList(2);
                                ArrayList arrayList6 = new ArrayList(1);
                                arrayList6.add(hf1Var2.u);
                                arrayList5.add(q63VarA15);
                                arrayList5.add(eo1Var);
                                q63 q63VarA17 = q63.a(new i91(new w63(arrayList5, arrayList6), ti1Var, ti1Var2, 5));
                                q63 q63VarA18 = q63.a(new tz0(9, ti1Var2));
                                q63 q63VarA19 = q63.a(new ah1(if1Var.g, if1Var.c, if1Var.d, ti1Var2, ti1Var, hf1Var2.k, q63VarA14, xn1Var2, xn1Var3, if1Var.E, hf1Var2.l, hf1Var2.e, hf1Var2.t, q63VarA17, q63VarA18));
                                bf1 bf1Var = new bf1(q63VarA19, 24);
                                hj1 hj1Var2 = new hj1(q63.a(new vg1(ti1Var, if1Var.V, 0)), 11);
                                ArrayList arrayList7 = new ArrayList(4);
                                ArrayList arrayList8 = new ArrayList(2);
                                arrayList7.add(hf1Var2.q);
                                arrayList8.add(hf1Var2.r);
                                arrayList8.add(hf1Var2.s);
                                arrayList7.add(q63VarA10);
                                arrayList7.add(bf1Var);
                                arrayList7.add(hj1Var2);
                                q63 q63VarA20 = q63.a(new bk1(new w63(arrayList7, arrayList8), 4));
                                q63 q63VarA21 = q63.a(new jj1(if1Var.g, if1Var.C0, if1Var.j, ti1Var2, ti1Var, if1Var.G, xn1Var));
                                q63 q63VarA22 = q63.a(new hj1(q63VarA21, 5));
                                q63 q63VarA23 = q63.a(new eh1(q63VarA9, (v63) if1Var.c, 3));
                                q63 q63VarA24 = q63.a(new hj1(q63.a(new zh1(if1Var.y0, hf1Var2.d, 1)), 3));
                                bf1 bf1Var2 = new bf1(q63VarA19, 23);
                                ArrayList arrayList9 = new ArrayList(5);
                                ArrayList arrayList10 = new ArrayList(3);
                                arrayList9.add(hf1Var2.v);
                                arrayList9.add(hf1Var2.w);
                                arrayList10.add(hf1Var2.x);
                                arrayList10.add(hf1Var2.y);
                                arrayList9.add(q63VarA22);
                                arrayList9.add(q63VarA23);
                                arrayList10.add(q63VarA24);
                                arrayList9.add(bf1Var2);
                                q63 q63VarA25 = q63.a(new bk1(new w63(arrayList9, arrayList10), 0));
                                q63 q63VarA26 = q63.a(new re1(q63VarA4, q63VarA2, 4));
                                int i8 = 6;
                                q63 q63VarA27 = q63.a(new hj1(q63VarA21, i8));
                                q63 q63Var2 = if1Var.c;
                                q63 q63VarA28 = q63.a(new eh1(q63VarA9, (v63) q63Var2, i8));
                                bf1 bf1Var3 = new bf1(q63VarA17, 12);
                                bf1 bf1Var4 = new bf1(q63VarA19, 26);
                                tz0 tz0Var = new tz0(14, kc2Var);
                                eo1 eo1Var2 = new eo1(q63.a(new i91(tz0Var, hj1Var, q63Var2, 7)), 1);
                                ArrayList arrayList11 = new ArrayList(7);
                                ArrayList arrayList12 = new ArrayList(3);
                                arrayList11.add(hf1Var2.z);
                                arrayList11.add(hf1Var2.A);
                                arrayList12.add(hf1Var2.B);
                                arrayList12.add(hf1Var2.C);
                                arrayList12.add(q63VarA26);
                                arrayList11.add(q63VarA27);
                                arrayList11.add(q63VarA28);
                                arrayList11.add(bf1Var3);
                                arrayList11.add(bf1Var4);
                                arrayList11.add(eo1Var2);
                                q63 q63VarA29 = q63.a(new bk1(new w63(arrayList11, arrayList12), 2));
                                bf1 bf1Var5 = new bf1(q63VarA19, 29);
                                ArrayList arrayList13 = new ArrayList(1);
                                ArrayList arrayList14 = new ArrayList(1);
                                arrayList14.add(hf1Var2.D);
                                arrayList13.add(bf1Var5);
                                q63 q63VarA30 = q63.a(new bk1(new w63(arrayList13, arrayList14), 19));
                                bf1 bf1Var6 = new bf1(q63.a(new vg1(ti1Var, if1Var.I, 2)), 22);
                                ArrayList arrayList15 = new ArrayList(1);
                                new ArrayList(1).add(hf1Var2.E);
                                arrayList15.add(bf1Var6);
                                q63 q63VarA31 = q63.a(new eh1(q63VarA9, (v63) if1Var.c, 10));
                                ArrayList arrayList16 = new ArrayList(1);
                                ArrayList arrayList17 = new ArrayList(1);
                                arrayList17.add(hf1Var2.F);
                                arrayList16.add(q63VarA31);
                                q63 q63VarA32 = q63.a(new bk1(new w63(arrayList16, arrayList17), 20));
                                int i9 = 8;
                                q63 q63VarA33 = q63.a(new hj1(q63VarA6, i9));
                                bf1 bf1Var7 = new bf1(q63VarA19, 27);
                                ArrayList arrayList18 = new ArrayList(7);
                                ArrayList arrayList19 = new ArrayList(4);
                                arrayList18.add(hf1Var2.G);
                                arrayList19.add(hf1Var2.H);
                                arrayList18.add(hf1Var2.I);
                                arrayList18.add(hf1Var2.J);
                                arrayList19.add(hf1Var2.K);
                                arrayList19.add(hf1Var2.L);
                                arrayList19.add(hf1Var2.M);
                                arrayList18.add(hf1Var2.N);
                                arrayList18.add(hf1Var2.O);
                                arrayList18.add(q63VarA33);
                                arrayList18.add(bf1Var7);
                                q63 q63VarA34 = q63.a(new bk1(new w63(arrayList18, arrayList19), 5));
                                hj1 hj1Var3 = new hj1(q63.a(new bf1(q63VarA20, 11)), 1);
                                q63 q63VarA35 = q63.a(new eh1(q63VarA9, (v63) if1Var.c, i9));
                                ArrayList arrayList20 = new ArrayList(2);
                                ArrayList arrayList21 = new ArrayList(1);
                                arrayList21.add(hf1Var2.Q);
                                arrayList20.add(hj1Var3);
                                arrayList20.add(q63VarA35);
                                q63 q63VarA36 = q63.a(new bk1(new w63(arrayList20, arrayList21), 9));
                                List list = Collections.EMPTY_LIST;
                                new ArrayList(1).add(hf1Var2.R);
                                q63 q63VarA37 = q63.a(new hj1(q63VarA21, 4));
                                ArrayList arrayList22 = new ArrayList(1);
                                List list2 = Collections.EMPTY_LIST;
                                arrayList22.add(q63VarA37);
                                q63 q63VarA38 = q63.a(new eh1(q63VarA9, (v63) if1Var.c, 5));
                                bf1 bf1Var8 = new bf1(q63VarA19, 25);
                                ArrayList arrayList23 = new ArrayList(2);
                                new ArrayList(1).add(hf1Var2.S);
                                arrayList23.add(q63VarA38);
                                arrayList23.add(bf1Var8);
                                q63 q63VarA39 = q63.a(new hj1(q63VarA21, 0));
                                ArrayList arrayList24 = new ArrayList(1);
                                List list3 = Collections.EMPTY_LIST;
                                arrayList24.add(q63VarA39);
                                ti1 ti1Var4 = new ti1(p83Var2, 1);
                                u91 u91Var = new u91(ti1Var, ti1Var4, hf1Var2.h, ti1Var3, hf1Var2.f, 4);
                                ArrayList arrayList25 = new ArrayList(1);
                                ArrayList arrayList26 = new ArrayList(1);
                                arrayList26.add(hf1Var2.U);
                                arrayList25.add(hf1Var2.V);
                                wi1 wi1Var = new wi1(ti1Var2, ti1Var, q63VarA8, q63VarA34, hf1Var2.T, u91Var, q63VarA9, new bk1(new w63(arrayList25, arrayList26), 6), q63VarA30, q63VarA18, if1Var.n0);
                                do1 do1Var2 = new do1(u40Var, 1);
                                q63 q63VarA40 = q63.a(new fp1(do1Var2, if1Var.f));
                                q63 q63VarA41 = q63.a(new re1(q63VarA4, q63VarA2, 6));
                                List list4 = Collections.EMPTY_LIST;
                                ArrayList arrayList27 = new ArrayList(2);
                                arrayList27.add(hf1Var2.W);
                                arrayList27.add(q63VarA41);
                                w63 w63Var = new w63(list4, arrayList27);
                                q63 q63Var3 = hf1Var2.g;
                                q63 q63VarA42 = q63.a(new i91(q63Var3, w63Var, ti1Var, 6));
                                q63 q63VarA43 = q63.a(new do1(u40Var, 2));
                                q63 q63VarA44 = q63.a(new do1(u40Var, 3));
                                wn1 wn1Var = hf1Var2.i;
                                q63 q63Var4 = if1Var.E;
                                ef1 ef1Var2 = if1Var.h;
                                yj1 yj1Var = hf1Var2.d;
                                q63 q63Var5 = if1Var.f;
                                eo1 eo1Var3 = new eo1(q63.a(new co1(q63Var3, wn1Var, do1Var, do1Var2, tz0Var, q63Var4, q63VarA29, q63VarA25, q63VarA32, ti1Var, ef1Var2, yj1Var, q63VarA4, q63VarA40, q63Var5, q63VarA42, if1Var.I, hf1Var2.e, if1Var.J, q63VarA12, if1Var.L0, q63VarA17, q63VarA43, q63VarA44, q63VarA18)), 0);
                                q63 q63VarA45 = q63.a(new eg1(ef1Var2, 14));
                                q63 q63Var6 = if1Var.c;
                                q63 q63VarA46 = q63.a(new fo1(q63VarA45, q63Var6, q63Var3, q63Var5, 0));
                                q63 q63Var7 = hf1Var2.m;
                                dy0 dy0Var = new dy0((v63) q63Var7, (r63) do1Var2, q63VarA46, (v63) eo1Var3, 6);
                                fp1 fp1Var = new fp1(q63Var7, do1Var2);
                                q63 q63VarA47 = q63.a(new tz0(13, new ho1(tz0Var, 0)));
                                bp1 bp1Var = new bp1(if1Var.X, yj1Var, hj1Var, tz0Var, dy0Var, fp1Var, q63Var6, q63VarA47);
                                q12 q12Var = new q12();
                                q63 q63VarA48 = q63.a(new mq1(ti1Var4, q12Var, tz0Var, 1));
                                q63 q63VarA49 = q63.a(new mq1(ti1Var4, q12Var, tz0Var, 0));
                                q63 q63VarA50 = q63.a(new dy0((v63) ti1Var4, (v63) q12Var, (v63) tz0Var, (v63) if1Var.j, 8));
                                q63 q63VarA51 = q63.a(new da1(q12Var, tz0Var, 17));
                                xe1 xe1Var2 = if1Var.g;
                                q63 q63VarA52 = q63.a(new dy0(xe1Var2, tz0Var, bp1Var, q12Var, 7));
                                q12.a(q12Var, q63.a(new oo1(wi1Var, q63Var6, tz0Var, eo1Var3, bp1Var, hj1Var, wn1Var, q63VarA48, q63VarA49, q63VarA50, q63VarA51, q63VarA52, new xo1(xe1Var2, yj1Var, 0), q63Var4, ef1Var2, xe1Var2, q63VarA47, q63VarA16, if1Var.M0)));
                                q63 q63Var8 = hf1Var2.X;
                                q63 q63Var9 = hf1Var2.P;
                                q63 q63VarA53 = q63.a(new bp1(q63VarA25, q63VarA20, q63Var8, q63VarA36, q63Var9, ti1Var, ti1Var3, q63VarA13));
                                q63 q63VarA54 = q63.a(new iq1((v63) if1Var.c, q63VarA46, q63.a(new vg1(hf1Var2.g, ti1Var, 3)), q63VarA13, 0));
                                q63 q63VarA55 = q63.a(new th1(q63VarA25, q63VarA20, q63Var8, q63VarA36, q63Var9, q63VarA32, if1Var.j, if1Var.I, if1Var.G, q63VarA13));
                                if (((Boolean) tu0Var2.c.a(ix0Var2)).booleanValue()) {
                                    vc3.C.k.getClass();
                                    long jCurrentTimeMillis = System.currentTimeMillis();
                                    vx1Var = vx1Var2;
                                    cs1 cs1Var3 = vx1Var.f;
                                    cs1Var3.e.putLong("rendering-ad-component-creation-end", jCurrentTimeMillis);
                                    cs1Var3.e.putLong("rendering-configure-webview-start", jCurrentTimeMillis);
                                } else {
                                    vx1Var = vx1Var2;
                                }
                                wo1 wo1Var = (wo1) hf1Var2.a.g;
                                dq.D(wo1Var);
                                dq.D(ro1Var);
                                dq.D(uq1Var);
                                n31 n31Var = new n31(wo1Var, ro1Var, uq1Var, q63.b(q63VarA52));
                                if (((r01) n31Var.g) != null) {
                                    ((uq1) n31Var.h).b("/nativeAdCustomClick", n31Var);
                                }
                                sq1 sq1Var = (sq1) q63VarA53.c();
                                ok1 ok1Var = sq1Var.b;
                                qq1 qq1Var = uq1Var.a;
                                Objects.requireNonNull(ok1Var);
                                rq1 rq1Var = new rq1(0, ok1Var);
                                ak1 ak1Var = sq1Var.a;
                                ?? r12 = sq1Var.c;
                                gl1 gl1Var = sq1Var.d;
                                zl1 zl1Var = sq1Var.e;
                                synchronized (qq1Var) {
                                    qq1Var.f = ak1Var;
                                    qq1Var.g = r12;
                                    qq1Var.h = gl1Var;
                                    qq1Var.i = zl1Var;
                                    qq1Var.j = rq1Var;
                                }
                                x42 x42Var3 = sq1Var.f;
                                z42 z42Var4 = sq1Var.g;
                                sg1 sg1Var = sq1Var.h;
                                synchronized (uq1Var) {
                                    try {
                                        try {
                                            qm2 qm2Var = uq1Var.m;
                                            if (qm2Var == null) {
                                                i6 = 0;
                                                r8 = 0;
                                            } else {
                                                i6 = 0;
                                                r8 = 0;
                                                qm2Var.a(new in2(qm2Var, 0, new u40(uq1Var, x42Var3, z42Var4, sg1Var, 11)), uq1Var.e);
                                            }
                                        } catch (Throwable th) {
                                            th = th;
                                            r12 = uq1Var;
                                            throw th;
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                    }
                                }
                                final gq1 gq1Var = (gq1) q63VarA54.c();
                                md1 md1VarH = r11.h();
                                if (md1VarH == null) {
                                    gq1Var.getClass();
                                } else {
                                    xm1 xm1Var = gq1Var.c;
                                    xm1Var.R1(md1VarH.p0());
                                    eq1 eq1Var = new eq1(md1VarH, 1);
                                    Executor executor3 = gq1Var.a;
                                    xm1Var.I1(eq1Var, executor3);
                                    xm1Var.I1(new eq1(md1VarH, i6), executor3);
                                    kh1 kh1Var = gq1Var.b;
                                    xm1Var.I1(kh1Var, executor3);
                                    kh1Var.f = md1VarH;
                                    ?? E0 = md1VarH.e0();
                                    if (((Boolean) tu0Var2.c.a(lx0.Ua)).booleanValue() && E0 != 0) {
                                        sg1 sg1Var2 = gq1Var.d;
                                        E0.d("/click");
                                        zm1 zm1Var = E0.p;
                                        m11 m11Var = u11.a;
                                        E0.b("/click", new s11(zm1Var, i6, sg1Var2));
                                        E0.R(sg1Var2, r8, r8);
                                    }
                                    md1VarH.t0("/trackActiveViewUnit", new v11() { // from class: fq1
                                        @Override // defpackage.v11
                                        public final void f(Object obj, Map map) {
                                            int i10 = i6;
                                            gq1 gq1Var2 = gq1Var;
                                            switch (i10) {
                                                case 0:
                                                    kh1 kh1Var2 = gq1Var2.b;
                                                    kh1Var2.j = true;
                                                    kh1Var2.a();
                                                    break;
                                                default:
                                                    gq1Var2.b.j = false;
                                                    break;
                                            }
                                        }
                                    });
                                    final int i10 = 1;
                                    md1VarH.t0("/untrackActiveViewUnit", new v11() { // from class: fq1
                                        @Override // defpackage.v11
                                        public final void f(Object obj, Map map) {
                                            int i11 = i10;
                                            gq1 gq1Var2 = gq1Var;
                                            switch (i11) {
                                                case 0:
                                                    kh1 kh1Var2 = gq1Var2.b;
                                                    kh1Var2.j = true;
                                                    kh1Var2.a();
                                                    break;
                                                default:
                                                    gq1Var2.b.j = false;
                                                    break;
                                            }
                                        }
                                    });
                                }
                                wq1 wq1Var = (wq1) q63VarA55.c();
                                xq1 xq1Var = vx1Var.e;
                                md1 md1VarI = ro1Var.i();
                                wq1Var.getClass();
                                vq1 vq1Var = xq1Var.a;
                                ok1 ok1Var2 = wq1Var.b;
                                Objects.requireNonNull(ok1Var2);
                                rq1 rq1Var2 = new rq1(1, ok1Var2);
                                ak1 ak1Var2 = wq1Var.a;
                                bl1 bl1Var = wq1Var.c;
                                gl1 gl1Var2 = wq1Var.d;
                                zl1 zl1Var2 = wq1Var.e;
                                ym1 ym1Var = wq1Var.f;
                                synchronized (vq1Var) {
                                    synchronized (vq1Var) {
                                        vq1Var.f = ak1Var2;
                                        vq1Var.g = bl1Var;
                                        vq1Var.h = gl1Var2;
                                        vq1Var.i = zl1Var2;
                                        vq1Var.j = rq1Var2;
                                    }
                                    if (((Boolean) tu0Var2.c.a(lx0.Va)).booleanValue() && md1VarI != null && md1VarI.e0() != null) {
                                        he1 he1VarE0 = md1VarI.e0();
                                        sg1 sg1Var3 = wq1Var.j;
                                        bw1 bw1Var = wq1Var.i;
                                        he1VarE0.P(sg1Var3, bw1Var, wq1Var.h);
                                        he1VarE0.R(sg1Var3, bw1Var, wq1Var.g);
                                    }
                                    if (((Boolean) tu0Var2.c.a(ix0Var2)).booleanValue()) {
                                        ec.q(vc3.C.k, vx1Var.f.e, "rendering-configure-webview-end");
                                    }
                                    return (no1) q12Var.c();
                                }
                                vq1Var.k = ym1Var;
                                if (((Boolean) tu0Var2.c.a(lx0.Va)).booleanValue()) {
                                    he1 he1VarE1 = md1VarI.e0();
                                    sg1 sg1Var4 = wq1Var.j;
                                    bw1 bw1Var2 = wq1Var.i;
                                    he1VarE1.P(sg1Var4, bw1Var2, wq1Var.h);
                                    he1VarE1.R(sg1Var4, bw1Var2, wq1Var.g);
                                }
                                if (((Boolean) tu0Var2.c.a(ix0Var2)).booleanValue()) {
                                    ec.q(vc3.C.k, vx1Var.f.e, "rendering-configure-webview-end");
                                }
                                return (no1) q12Var.c();
                            }
                        };
                        bn2 bn2Var2 = new bn2(qk2VarN, true, false);
                        bn2Var2.u = new an2(bn2Var2, callable2, this.b);
                        bn2Var2.v();
                        return bn2Var2;
                    }
                    if (!z) {
                        jn.T("Required field 'vast_xml' or 'html' is missing");
                        hpVarD = kn2.g;
                    }
                    pm2VarL = aq1Var.d(jSONObjectOptJSONObject6, x42Var, z42Var2, vs0Var2, d91Var2);
                    hpVarD = na1.J(na1.K(pm2VarL, ((Integer) kx0Var2.a(lx0.g4)).intValue(), TimeUnit.SECONDS, aq1Var.k), Exception.class, new kg0(2), za1.g);
                    aq1Var2 = aq1Var;
                    vs0Var3 = vs0Var2;
                    y91Var3.H(58, hpVarD);
                    if (((Boolean) kx0Var2.a(lx0.Nd)).booleanValue()) {
                        hpVar5 = hpVar4;
                        cs1Var = cs1Var2;
                        hpVarT = na1.t(new Bundle());
                    } else {
                        hpVar5 = hpVar4;
                        cs1Var = cs1Var2;
                        hpVarT = na1.t(new Bundle());
                    }
                    final hp hpVar16 = hpVarT;
                    p83Var = (p83) y91Var3.i;
                    executor = (Executor) p83Var.g;
                    jSONArrayOptJSONArray2 = jSONObject.optJSONArray("custom_assets");
                    if (jSONArrayOptJSONArray2 == null) {
                        hpVarM = na1.t(Collections.EMPTY_LIST);
                        hpVarD = hpVarD;
                        hpVar6 = hpVarB;
                    } else {
                        if (((Boolean) tu0.e.c.a(lx0.t2)).booleanValue()) {
                            ec.q(vc3.C.k, ((cs1) p83Var.i).e, "native-assets-loading-custom-start");
                        }
                        arrayList = new ArrayList();
                        length = jSONArrayOptJSONArray2.length();
                        i2 = 0;
                        while (i2 < length) {
                            int i6 = length;
                            jSONObjectOptJSONObject4 = jSONArrayOptJSONArray2.optJSONObject(i2);
                            if (jSONObjectOptJSONObject4 == null) {
                                futureM = kn2.g;
                                jSONArray = jSONArrayOptJSONArray2;
                            } else {
                                jSONArray = jSONArrayOptJSONArray2;
                                strOptString = jSONObjectOptJSONObject4.optString("name");
                                if (strOptString == null) {
                                    futureM = kn2.g;
                                } else {
                                    i3 = i2;
                                    strOptString2 = jSONObjectOptJSONObject4.optString("type");
                                    hpVarB = hpVarB;
                                    if ("string".equals(strOptString2)) {
                                        futureM = na1.t(new dq1(strOptString, jSONObjectOptJSONObject4.optString("string_value")));
                                        p83Var = p83Var;
                                    } else if ("image".equals(strOptString2)) {
                                        aq1 aq1Var5 = (aq1) p83Var.h;
                                        p83Var = p83Var;
                                        futureM = na1.M(aq1Var5.b(jSONObjectOptJSONObject4.optJSONObject("image_value"), aq1Var5.h.g, 0), new r11(strOptString, 2), executor);
                                    } else {
                                        p83Var = p83Var;
                                        futureM = kn2.g;
                                    }
                                }
                                arrayList.add(futureM);
                                i2 = i3 + 1;
                                length = i6;
                                jSONArrayOptJSONArray2 = jSONArray;
                                hpVarB = hpVarB;
                                p83Var = p83Var;
                            }
                            i3 = i2;
                            arrayList.add(futureM);
                            i2 = i3 + 1;
                            length = i6;
                            jSONArrayOptJSONArray2 = jSONArray;
                            hpVarB = hpVarB;
                            p83Var = p83Var;
                        }
                        hpVar6 = hpVarB;
                        hpVarM = na1.M(new ym2(vj2.m(arrayList), true), lh0.l, executor);
                    }
                    final hp hpVar17 = hpVarM;
                    y91Var3.H(63, hpVar17);
                    if (jSONObject.optBoolean("enable_omid")) {
                        hpVarL2 = kn2.g;
                    } else {
                        strOptString3 = jSONObjectOptJSONObject5.optString("omid_html");
                        if (TextUtils.isEmpty(strOptString3)) {
                            hpVarL2 = kn2.g;
                        } else {
                            if (((Boolean) tu0.e.c.a(lx0.t2)).booleanValue()) {
                                ec.q(vc3.C.k, cs1Var.e, "native-assets-loading-omid-start");
                            }
                            hpVarL2 = na1.L(kn2.g, new c41(aq1Var2, strOptString3, d91Var2, vs0Var3), za1.f);
                        }
                    }
                    y91Var3.H(65, hpVarL2);
                    arrayList2 = new ArrayList();
                    final hp hpVar18 = hpVar;
                    arrayList2.add(hpVar18);
                    arrayList2.add(hpVarA);
                    arrayList2.add(hpVar2);
                    final hp hpVar19 = hpVar6;
                    arrayList2.add(hpVar19);
                    final hp hpVar110 = hpVar3;
                    arrayList2.add(hpVar110);
                    final hp hpVar111 = hpVar5;
                    arrayList2.add(hpVar111);
                    final hp hpVar112 = hpVarD;
                    arrayList2.add(hpVar112);
                    arrayList2.add(hpVar16);
                    arrayList2.add(hpVar17);
                    if (((Boolean) tu0.e.c.a(lx0.N5)).booleanValue()) {
                        arrayList2.add(hpVarL2);
                    } else {
                        arrayList2.add(hpVarL2);
                    }
                    vj2 vj2VarM2 = vj2.m(arrayList2);
                    final d91 d91Var7 = d91Var2;
                    final hp hpVar113 = hpVarL2;
                    final hp hpVar114 = hpVar2;
                    Callable callable3 = new Callable() { // from class: vp1
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            JSONArray jSONArrayOptJSONArray5;
                            List listM;
                            JSONObject jSONObjectOptJSONObject10;
                            y91 y91Var4 = y91Var3;
                            hp hpVar115 = hpVar18;
                            hp hpVar116 = hpVarA;
                            hp hpVar117 = hpVar110;
                            hp hpVar118 = hpVar19;
                            hp hpVar20 = hpVar111;
                            JSONObject jSONObject2 = jSONObject;
                            hp hpVar21 = hpVar112;
                            hp hpVar22 = hpVar16;
                            hp hpVar23 = hpVar114;
                            hp hpVar24 = hpVar113;
                            hp hpVar25 = hpVar17;
                            if (((Boolean) tu0.e.c.a(lx0.o2)).booleanValue()) {
                                ec.q(vc3.C.k, ((cs1) y91Var4.j).e, "rendering-native-assets-loading-end");
                            }
                            ro1 ro1Var = (ro1) hpVar115.get();
                            List list = (List) hpVar116.get();
                            synchronized (ro1Var) {
                                ro1Var.e = list;
                            }
                            a01 a01Var = (a01) hpVar117.get();
                            synchronized (ro1Var) {
                                ro1Var.s = a01Var;
                            }
                            a01 a01Var2 = (a01) hpVar118.get();
                            synchronized (ro1Var) {
                                ro1Var.t = a01Var2;
                            }
                            wz0 wz0Var = (wz0) hpVar20.get();
                            synchronized (ro1Var) {
                                ro1Var.c = wz0Var;
                            }
                            JSONObject jSONObjectOptJSONObject11 = jSONObject2.optJSONObject("mute");
                            if (jSONObjectOptJSONObject11 == null || (jSONArrayOptJSONArray5 = jSONObjectOptJSONObject11.optJSONArray("reasons")) == null || jSONArrayOptJSONArray5.length() <= 0) {
                                tj2 tj2Var = vj2.g;
                                listM = qk2.j;
                            } else {
                                ArrayList arrayList3 = new ArrayList();
                                for (int i7 = 0; i7 < jSONArrayOptJSONArray5.length(); i7++) {
                                    y22 y22VarE = aq1.e(jSONArrayOptJSONArray5.optJSONObject(i7));
                                    if (y22VarE != null) {
                                        arrayList3.add(y22VarE);
                                    }
                                }
                                listM = vj2.m(arrayList3);
                            }
                            synchronized (ro1Var) {
                                ro1Var.f = listM;
                            }
                            JSONObject jSONObjectOptJSONObject12 = jSONObject2.optJSONObject("mute");
                            y22 y22VarE2 = (jSONObjectOptJSONObject12 == null || (jSONObjectOptJSONObject10 = jSONObjectOptJSONObject12.optJSONObject("default_reason")) == null) ? null : aq1.e(jSONObjectOptJSONObject10);
                            synchronized (ro1Var) {
                                ro1Var.g = y22VarE2;
                            }
                            md1 md1Var = (md1) hpVar21.get();
                            if (md1Var != null) {
                                synchronized (ro1Var) {
                                    ro1Var.i = md1Var;
                                }
                                View viewP0 = md1Var.p0();
                                synchronized (ro1Var) {
                                    ro1Var.o = viewP0;
                                }
                                fe1 fe1VarF = md1Var.f();
                                synchronized (ro1Var) {
                                    ro1Var.b = fe1VarF;
                                }
                            }
                            ro1Var.d().putAll((Bundle) hpVar22.get());
                            md1 md1Var2 = (md1) hpVar23.get();
                            if (md1Var2 != null) {
                                synchronized (ro1Var) {
                                    ro1Var.j = md1Var2;
                                }
                                View viewP1 = md1Var2.p0();
                                synchronized (ro1Var) {
                                    ro1Var.p = viewP1;
                                }
                            }
                            if (!((Boolean) tu0.e.c.a(lx0.N5)).booleanValue() || jSONObject2.optInt("template_id") == 3) {
                                md1 md1Var3 = (md1) hpVar24.get();
                                if (md1Var3 != null) {
                                    synchronized (ro1Var) {
                                        ro1Var.k = md1Var3;
                                    }
                                }
                            } else {
                                synchronized (ro1Var) {
                                    ro1Var.m = hpVar24;
                                }
                                cb1 cb1Var2 = new cb1();
                                synchronized (ro1Var) {
                                    ro1Var.n = cb1Var2;
                                }
                            }
                            for (dq1 dq1Var : (List) hpVar25.get()) {
                                int i8 = dq1Var.a;
                                String str3 = dq1Var.b;
                                if (i8 != 1) {
                                    oz0 oz0Var = dq1Var.d;
                                    synchronized (ro1Var) {
                                        q00 q00Var = ro1Var.v;
                                        if (oz0Var == null) {
                                            q00Var.remove(str3);
                                        } else {
                                            q00Var.put(str3, oz0Var);
                                        }
                                    }
                                } else {
                                    ro1Var.o(str3, dq1Var.c);
                                }
                            }
                            return ro1Var;
                        }
                    };
                    final bn2 bn2Var3 = new bn2(vj2VarM2, false, false);
                    bn2Var3.u = new an2(bn2Var3, callable3, ya1Var);
                    bn2Var3.v();
                    qk2 qk2VarN2 = vj2.n(new hp[]{hpVarB3, bn2Var3});
                    final vs0 vs0Var6 = vs0Var3;
                    Callable callable4 = new Callable() { // from class: ux1
                        /* JADX WARN: Code duplicated, block: B:51:0x0913  */
                        /* JADX WARN: Multi-variable type inference failed */
                        /* JADX WARN: Type inference failed for: r12v14, types: [bl1, j11] */
                        /* JADX WARN: Type inference failed for: r12v15 */
                        /* JADX WARN: Type inference failed for: r12v16 */
                        /* JADX WARN: Type inference failed for: r8v2 */
                        /* JADX WARN: Type inference failed for: r8v3, types: [bw1, es1] */
                        /* JADX WARN: Type inference failed for: r8v7 */
                        /* JADX WARN: Type inference failed for: r9v6, types: [he1] */
                        @Override // java.util.concurrent.Callable
                        public final Object call() throws Throwable {
                            vx1 vx1Var;
                            final int i7;
                            ?? r8;
                            vx1 vx1Var2 = this.a;
                            bn2 bn2Var4 = bn2Var3;
                            hp hpVar115 = hpVarB3;
                            e52 e52Var2 = e52Var;
                            x42 x42Var2 = x42Var;
                            JSONObject jSONObject2 = jSONObject;
                            vs0 vs0Var7 = vs0Var6;
                            d91 d91Var8 = d91Var7;
                            ro1 ro1Var = (ro1) bn2Var4.get();
                            uq1 uq1Var = (uq1) hpVar115.get();
                            ix0 ix0Var2 = lx0.p2;
                            tu0 tu0Var2 = tu0.e;
                            if (((Boolean) tu0Var2.c.a(ix0Var2)).booleanValue()) {
                                ec.q(vc3.C.k, vx1Var2.f.e, "rendering-webview-creation-end");
                            }
                            hf1 hf1Var = vx1Var2.a;
                            p83 p83Var2 = new p83(e52Var2, x42Var2, (String) null);
                            kc2 kc2Var = new kc2(23, ro1Var);
                            u40 u40Var = new u40(jSONObject2, uq1Var, vs0Var7, d91Var8, 10, false);
                            if1 if1Var = hf1Var.b;
                            hf1 hf1Var2 = hf1Var.c;
                            q63 q63VarA = q63.a(new eg1(if1Var.G0, 9));
                            ti1 ti1Var = new ti1(p83Var2, 0);
                            do1 do1Var = new do1(u40Var, 0);
                            hj1 hj1Var = new hj1(q63.a(new da1(ti1Var, do1Var, 14)), 29);
                            q63 q63VarA2 = q63.a(new tz0(12, hj1Var));
                            ef1 ef1Var = if1Var.h;
                            xn1 xn1Var = yd.l;
                            q63 q63VarA3 = q63.a(new i91(ef1Var, q63VarA2, xn1Var, 1));
                            q63 q63VarA4 = q63.a(new jh1(q63VarA, q63.a(new eh1(if1Var.g, q63VarA3, 0)), if1Var.c, q63.a(new re1(q63VarA3, q63VarA, 3)), if1Var.f));
                            q63 q63VarA5 = q63.a(new re1(q63VarA4, q63VarA2, 5));
                            q63 q63VarA6 = q63.a(new vg1(hf1Var2.g, ti1Var, 1));
                            q63 q63VarA7 = q63.a(new hj1(q63VarA6, 7));
                            int i8 = w63.c;
                            ArrayList arrayList3 = new ArrayList(1);
                            ArrayList arrayList4 = new ArrayList(3);
                            arrayList4.add(hf1Var2.o);
                            arrayList4.add(hf1Var2.p);
                            arrayList4.add(q63VarA5);
                            arrayList3.add(q63VarA7);
                            q63 q63VarA8 = q63.a(new bk1(new w63(arrayList3, arrayList4), 3));
                            q63 q63VarA9 = q63.a(v51.j);
                            q63 q63Var = if1Var.c;
                            q63 q63VarA10 = q63.a(new eh1(q63VarA9, (v63) q63Var, 4));
                            ti1 ti1Var2 = new ti1(p83Var2, 3);
                            ti1 ti1Var3 = new ti1(p83Var2, 2);
                            xe1 xe1Var = if1Var.g;
                            q63 q63VarA11 = q63.a(new eg1(xe1Var, 20));
                            q63 q63VarA12 = q63.a(ar.j);
                            q63 q63VarA13 = q63.a(new tg1(xe1Var, if1Var.X, q63VarA11, q63VarA12, if1Var.D0, if1Var.d));
                            q63 q63VarA14 = q63.a(new yn1(if1Var.I, if1Var.H, ti1Var, ti1Var3, q63VarA13, hf1Var2.e));
                            xn1 xn1Var2 = new xn1(4);
                            xn1 xn1Var3 = new xn1(2);
                            q63 q63VarA15 = q63.a(new eh1(q63VarA9, (v63) q63Var, 9));
                            q63 q63VarA16 = q63.a(hn.p);
                            eo1 eo1Var = new eo1(q63VarA16, 2);
                            ArrayList arrayList5 = new ArrayList(2);
                            ArrayList arrayList6 = new ArrayList(1);
                            arrayList6.add(hf1Var2.u);
                            arrayList5.add(q63VarA15);
                            arrayList5.add(eo1Var);
                            q63 q63VarA17 = q63.a(new i91(new w63(arrayList5, arrayList6), ti1Var, ti1Var2, 5));
                            q63 q63VarA18 = q63.a(new tz0(9, ti1Var2));
                            q63 q63VarA19 = q63.a(new ah1(if1Var.g, if1Var.c, if1Var.d, ti1Var2, ti1Var, hf1Var2.k, q63VarA14, xn1Var2, xn1Var3, if1Var.E, hf1Var2.l, hf1Var2.e, hf1Var2.t, q63VarA17, q63VarA18));
                            bf1 bf1Var = new bf1(q63VarA19, 24);
                            hj1 hj1Var2 = new hj1(q63.a(new vg1(ti1Var, if1Var.V, 0)), 11);
                            ArrayList arrayList7 = new ArrayList(4);
                            ArrayList arrayList8 = new ArrayList(2);
                            arrayList7.add(hf1Var2.q);
                            arrayList8.add(hf1Var2.r);
                            arrayList8.add(hf1Var2.s);
                            arrayList7.add(q63VarA10);
                            arrayList7.add(bf1Var);
                            arrayList7.add(hj1Var2);
                            q63 q63VarA20 = q63.a(new bk1(new w63(arrayList7, arrayList8), 4));
                            q63 q63VarA21 = q63.a(new jj1(if1Var.g, if1Var.C0, if1Var.j, ti1Var2, ti1Var, if1Var.G, xn1Var));
                            q63 q63VarA22 = q63.a(new hj1(q63VarA21, 5));
                            q63 q63VarA23 = q63.a(new eh1(q63VarA9, (v63) if1Var.c, 3));
                            q63 q63VarA24 = q63.a(new hj1(q63.a(new zh1(if1Var.y0, hf1Var2.d, 1)), 3));
                            bf1 bf1Var2 = new bf1(q63VarA19, 23);
                            ArrayList arrayList9 = new ArrayList(5);
                            ArrayList arrayList10 = new ArrayList(3);
                            arrayList9.add(hf1Var2.v);
                            arrayList9.add(hf1Var2.w);
                            arrayList10.add(hf1Var2.x);
                            arrayList10.add(hf1Var2.y);
                            arrayList9.add(q63VarA22);
                            arrayList9.add(q63VarA23);
                            arrayList10.add(q63VarA24);
                            arrayList9.add(bf1Var2);
                            q63 q63VarA25 = q63.a(new bk1(new w63(arrayList9, arrayList10), 0));
                            q63 q63VarA26 = q63.a(new re1(q63VarA4, q63VarA2, 4));
                            int i9 = 6;
                            q63 q63VarA27 = q63.a(new hj1(q63VarA21, i9));
                            q63 q63Var2 = if1Var.c;
                            q63 q63VarA28 = q63.a(new eh1(q63VarA9, (v63) q63Var2, i9));
                            bf1 bf1Var3 = new bf1(q63VarA17, 12);
                            bf1 bf1Var4 = new bf1(q63VarA19, 26);
                            tz0 tz0Var = new tz0(14, kc2Var);
                            eo1 eo1Var2 = new eo1(q63.a(new i91(tz0Var, hj1Var, q63Var2, 7)), 1);
                            ArrayList arrayList11 = new ArrayList(7);
                            ArrayList arrayList12 = new ArrayList(3);
                            arrayList11.add(hf1Var2.z);
                            arrayList11.add(hf1Var2.A);
                            arrayList12.add(hf1Var2.B);
                            arrayList12.add(hf1Var2.C);
                            arrayList12.add(q63VarA26);
                            arrayList11.add(q63VarA27);
                            arrayList11.add(q63VarA28);
                            arrayList11.add(bf1Var3);
                            arrayList11.add(bf1Var4);
                            arrayList11.add(eo1Var2);
                            q63 q63VarA29 = q63.a(new bk1(new w63(arrayList11, arrayList12), 2));
                            bf1 bf1Var5 = new bf1(q63VarA19, 29);
                            ArrayList arrayList13 = new ArrayList(1);
                            ArrayList arrayList14 = new ArrayList(1);
                            arrayList14.add(hf1Var2.D);
                            arrayList13.add(bf1Var5);
                            q63 q63VarA30 = q63.a(new bk1(new w63(arrayList13, arrayList14), 19));
                            bf1 bf1Var6 = new bf1(q63.a(new vg1(ti1Var, if1Var.I, 2)), 22);
                            ArrayList arrayList15 = new ArrayList(1);
                            new ArrayList(1).add(hf1Var2.E);
                            arrayList15.add(bf1Var6);
                            q63 q63VarA31 = q63.a(new eh1(q63VarA9, (v63) if1Var.c, 10));
                            ArrayList arrayList16 = new ArrayList(1);
                            ArrayList arrayList17 = new ArrayList(1);
                            arrayList17.add(hf1Var2.F);
                            arrayList16.add(q63VarA31);
                            q63 q63VarA32 = q63.a(new bk1(new w63(arrayList16, arrayList17), 20));
                            int i10 = 8;
                            q63 q63VarA33 = q63.a(new hj1(q63VarA6, i10));
                            bf1 bf1Var7 = new bf1(q63VarA19, 27);
                            ArrayList arrayList18 = new ArrayList(7);
                            ArrayList arrayList19 = new ArrayList(4);
                            arrayList18.add(hf1Var2.G);
                            arrayList19.add(hf1Var2.H);
                            arrayList18.add(hf1Var2.I);
                            arrayList18.add(hf1Var2.J);
                            arrayList19.add(hf1Var2.K);
                            arrayList19.add(hf1Var2.L);
                            arrayList19.add(hf1Var2.M);
                            arrayList18.add(hf1Var2.N);
                            arrayList18.add(hf1Var2.O);
                            arrayList18.add(q63VarA33);
                            arrayList18.add(bf1Var7);
                            q63 q63VarA34 = q63.a(new bk1(new w63(arrayList18, arrayList19), 5));
                            hj1 hj1Var3 = new hj1(q63.a(new bf1(q63VarA20, 11)), 1);
                            q63 q63VarA35 = q63.a(new eh1(q63VarA9, (v63) if1Var.c, i10));
                            ArrayList arrayList20 = new ArrayList(2);
                            ArrayList arrayList21 = new ArrayList(1);
                            arrayList21.add(hf1Var2.Q);
                            arrayList20.add(hj1Var3);
                            arrayList20.add(q63VarA35);
                            q63 q63VarA36 = q63.a(new bk1(new w63(arrayList20, arrayList21), 9));
                            List list = Collections.EMPTY_LIST;
                            new ArrayList(1).add(hf1Var2.R);
                            q63 q63VarA37 = q63.a(new hj1(q63VarA21, 4));
                            ArrayList arrayList22 = new ArrayList(1);
                            List list2 = Collections.EMPTY_LIST;
                            arrayList22.add(q63VarA37);
                            q63 q63VarA38 = q63.a(new eh1(q63VarA9, (v63) if1Var.c, 5));
                            bf1 bf1Var8 = new bf1(q63VarA19, 25);
                            ArrayList arrayList23 = new ArrayList(2);
                            new ArrayList(1).add(hf1Var2.S);
                            arrayList23.add(q63VarA38);
                            arrayList23.add(bf1Var8);
                            q63 q63VarA39 = q63.a(new hj1(q63VarA21, 0));
                            ArrayList arrayList24 = new ArrayList(1);
                            List list3 = Collections.EMPTY_LIST;
                            arrayList24.add(q63VarA39);
                            ti1 ti1Var4 = new ti1(p83Var2, 1);
                            u91 u91Var = new u91(ti1Var, ti1Var4, hf1Var2.h, ti1Var3, hf1Var2.f, 4);
                            ArrayList arrayList25 = new ArrayList(1);
                            ArrayList arrayList26 = new ArrayList(1);
                            arrayList26.add(hf1Var2.U);
                            arrayList25.add(hf1Var2.V);
                            wi1 wi1Var = new wi1(ti1Var2, ti1Var, q63VarA8, q63VarA34, hf1Var2.T, u91Var, q63VarA9, new bk1(new w63(arrayList25, arrayList26), 6), q63VarA30, q63VarA18, if1Var.n0);
                            do1 do1Var2 = new do1(u40Var, 1);
                            q63 q63VarA40 = q63.a(new fp1(do1Var2, if1Var.f));
                            q63 q63VarA41 = q63.a(new re1(q63VarA4, q63VarA2, 6));
                            List list4 = Collections.EMPTY_LIST;
                            ArrayList arrayList27 = new ArrayList(2);
                            arrayList27.add(hf1Var2.W);
                            arrayList27.add(q63VarA41);
                            w63 w63Var = new w63(list4, arrayList27);
                            q63 q63Var3 = hf1Var2.g;
                            q63 q63VarA42 = q63.a(new i91(q63Var3, w63Var, ti1Var, 6));
                            q63 q63VarA43 = q63.a(new do1(u40Var, 2));
                            q63 q63VarA44 = q63.a(new do1(u40Var, 3));
                            wn1 wn1Var = hf1Var2.i;
                            q63 q63Var4 = if1Var.E;
                            ef1 ef1Var2 = if1Var.h;
                            yj1 yj1Var = hf1Var2.d;
                            q63 q63Var5 = if1Var.f;
                            eo1 eo1Var3 = new eo1(q63.a(new co1(q63Var3, wn1Var, do1Var, do1Var2, tz0Var, q63Var4, q63VarA29, q63VarA25, q63VarA32, ti1Var, ef1Var2, yj1Var, q63VarA4, q63VarA40, q63Var5, q63VarA42, if1Var.I, hf1Var2.e, if1Var.J, q63VarA12, if1Var.L0, q63VarA17, q63VarA43, q63VarA44, q63VarA18)), 0);
                            q63 q63VarA45 = q63.a(new eg1(ef1Var2, 14));
                            q63 q63Var6 = if1Var.c;
                            q63 q63VarA46 = q63.a(new fo1(q63VarA45, q63Var6, q63Var3, q63Var5, 0));
                            q63 q63Var7 = hf1Var2.m;
                            dy0 dy0Var = new dy0((v63) q63Var7, (r63) do1Var2, q63VarA46, (v63) eo1Var3, 6);
                            fp1 fp1Var = new fp1(q63Var7, do1Var2);
                            q63 q63VarA47 = q63.a(new tz0(13, new ho1(tz0Var, 0)));
                            bp1 bp1Var = new bp1(if1Var.X, yj1Var, hj1Var, tz0Var, dy0Var, fp1Var, q63Var6, q63VarA47);
                            q12 q12Var = new q12();
                            q63 q63VarA48 = q63.a(new mq1(ti1Var4, q12Var, tz0Var, 1));
                            q63 q63VarA49 = q63.a(new mq1(ti1Var4, q12Var, tz0Var, 0));
                            q63 q63VarA50 = q63.a(new dy0((v63) ti1Var4, (v63) q12Var, (v63) tz0Var, (v63) if1Var.j, 8));
                            q63 q63VarA51 = q63.a(new da1(q12Var, tz0Var, 17));
                            xe1 xe1Var2 = if1Var.g;
                            q63 q63VarA52 = q63.a(new dy0(xe1Var2, tz0Var, bp1Var, q12Var, 7));
                            q12.a(q12Var, q63.a(new oo1(wi1Var, q63Var6, tz0Var, eo1Var3, bp1Var, hj1Var, wn1Var, q63VarA48, q63VarA49, q63VarA50, q63VarA51, q63VarA52, new xo1(xe1Var2, yj1Var, 0), q63Var4, ef1Var2, xe1Var2, q63VarA47, q63VarA16, if1Var.M0)));
                            q63 q63Var8 = hf1Var2.X;
                            q63 q63Var9 = hf1Var2.P;
                            q63 q63VarA53 = q63.a(new bp1(q63VarA25, q63VarA20, q63Var8, q63VarA36, q63Var9, ti1Var, ti1Var3, q63VarA13));
                            q63 q63VarA54 = q63.a(new iq1((v63) if1Var.c, q63VarA46, q63.a(new vg1(hf1Var2.g, ti1Var, 3)), q63VarA13, 0));
                            q63 q63VarA55 = q63.a(new th1(q63VarA25, q63VarA20, q63Var8, q63VarA36, q63Var9, q63VarA32, if1Var.j, if1Var.I, if1Var.G, q63VarA13));
                            if (((Boolean) tu0Var2.c.a(ix0Var2)).booleanValue()) {
                                vc3.C.k.getClass();
                                long jCurrentTimeMillis = System.currentTimeMillis();
                                vx1Var = vx1Var2;
                                cs1 cs1Var3 = vx1Var.f;
                                cs1Var3.e.putLong("rendering-ad-component-creation-end", jCurrentTimeMillis);
                                cs1Var3.e.putLong("rendering-configure-webview-start", jCurrentTimeMillis);
                            } else {
                                vx1Var = vx1Var2;
                            }
                            wo1 wo1Var = (wo1) hf1Var2.a.g;
                            dq.D(wo1Var);
                            dq.D(ro1Var);
                            dq.D(uq1Var);
                            n31 n31Var = new n31(wo1Var, ro1Var, uq1Var, q63.b(q63VarA52));
                            if (((r01) n31Var.g) != null) {
                                ((uq1) n31Var.h).b("/nativeAdCustomClick", n31Var);
                            }
                            sq1 sq1Var = (sq1) q63VarA53.c();
                            ok1 ok1Var = sq1Var.b;
                            qq1 qq1Var = uq1Var.a;
                            Objects.requireNonNull(ok1Var);
                            rq1 rq1Var = new rq1(0, ok1Var);
                            ak1 ak1Var = sq1Var.a;
                            ?? r12 = sq1Var.c;
                            gl1 gl1Var = sq1Var.d;
                            zl1 zl1Var = sq1Var.e;
                            synchronized (qq1Var) {
                                qq1Var.f = ak1Var;
                                qq1Var.g = r12;
                                qq1Var.h = gl1Var;
                                qq1Var.i = zl1Var;
                                qq1Var.j = rq1Var;
                            }
                            x42 x42Var3 = sq1Var.f;
                            z42 z42Var4 = sq1Var.g;
                            sg1 sg1Var = sq1Var.h;
                            synchronized (uq1Var) {
                                try {
                                    try {
                                        qm2 qm2Var = uq1Var.m;
                                        if (qm2Var == null) {
                                            i7 = 0;
                                            r8 = 0;
                                        } else {
                                            i7 = 0;
                                            r8 = 0;
                                            qm2Var.a(new in2(qm2Var, 0, new u40(uq1Var, x42Var3, z42Var4, sg1Var, 11)), uq1Var.e);
                                        }
                                    } catch (Throwable th) {
                                        th = th;
                                        r12 = uq1Var;
                                        throw th;
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                }
                            }
                            final gq1 gq1Var = (gq1) q63VarA54.c();
                            md1 md1VarH = r11.h();
                            if (md1VarH == null) {
                                gq1Var.getClass();
                            } else {
                                xm1 xm1Var = gq1Var.c;
                                xm1Var.R1(md1VarH.p0());
                                eq1 eq1Var = new eq1(md1VarH, 1);
                                Executor executor3 = gq1Var.a;
                                xm1Var.I1(eq1Var, executor3);
                                xm1Var.I1(new eq1(md1VarH, i7), executor3);
                                kh1 kh1Var = gq1Var.b;
                                xm1Var.I1(kh1Var, executor3);
                                kh1Var.f = md1VarH;
                                ?? E0 = md1VarH.e0();
                                if (((Boolean) tu0Var2.c.a(lx0.Ua)).booleanValue() && E0 != 0) {
                                    sg1 sg1Var2 = gq1Var.d;
                                    E0.d("/click");
                                    zm1 zm1Var = E0.p;
                                    m11 m11Var = u11.a;
                                    E0.b("/click", new s11(zm1Var, i7, sg1Var2));
                                    E0.R(sg1Var2, r8, r8);
                                }
                                md1VarH.t0("/trackActiveViewUnit", new v11() { // from class: fq1
                                    @Override // defpackage.v11
                                    public final void f(Object obj, Map map) {
                                        int i11 = i7;
                                        gq1 gq1Var2 = gq1Var;
                                        switch (i11) {
                                            case 0:
                                                kh1 kh1Var2 = gq1Var2.b;
                                                kh1Var2.j = true;
                                                kh1Var2.a();
                                                break;
                                            default:
                                                gq1Var2.b.j = false;
                                                break;
                                        }
                                    }
                                });
                                final int i11 = 1;
                                md1VarH.t0("/untrackActiveViewUnit", new v11() { // from class: fq1
                                    @Override // defpackage.v11
                                    public final void f(Object obj, Map map) {
                                        int i12 = i11;
                                        gq1 gq1Var2 = gq1Var;
                                        switch (i12) {
                                            case 0:
                                                kh1 kh1Var2 = gq1Var2.b;
                                                kh1Var2.j = true;
                                                kh1Var2.a();
                                                break;
                                            default:
                                                gq1Var2.b.j = false;
                                                break;
                                        }
                                    }
                                });
                            }
                            wq1 wq1Var = (wq1) q63VarA55.c();
                            xq1 xq1Var = vx1Var.e;
                            md1 md1VarI = ro1Var.i();
                            wq1Var.getClass();
                            vq1 vq1Var = xq1Var.a;
                            ok1 ok1Var2 = wq1Var.b;
                            Objects.requireNonNull(ok1Var2);
                            rq1 rq1Var2 = new rq1(1, ok1Var2);
                            ak1 ak1Var2 = wq1Var.a;
                            bl1 bl1Var = wq1Var.c;
                            gl1 gl1Var2 = wq1Var.d;
                            zl1 zl1Var2 = wq1Var.e;
                            ym1 ym1Var = wq1Var.f;
                            synchronized (vq1Var) {
                                synchronized (vq1Var) {
                                    vq1Var.f = ak1Var2;
                                    vq1Var.g = bl1Var;
                                    vq1Var.h = gl1Var2;
                                    vq1Var.i = zl1Var2;
                                    vq1Var.j = rq1Var2;
                                }
                                if (((Boolean) tu0Var2.c.a(lx0.Va)).booleanValue() && md1VarI != null && md1VarI.e0() != null) {
                                    he1 he1VarE1 = md1VarI.e0();
                                    sg1 sg1Var4 = wq1Var.j;
                                    bw1 bw1Var2 = wq1Var.i;
                                    he1VarE1.P(sg1Var4, bw1Var2, wq1Var.h);
                                    he1VarE1.R(sg1Var4, bw1Var2, wq1Var.g);
                                }
                                if (((Boolean) tu0Var2.c.a(ix0Var2)).booleanValue()) {
                                    ec.q(vc3.C.k, vx1Var.f.e, "rendering-configure-webview-end");
                                }
                                return (no1) q12Var.c();
                            }
                            vq1Var.k = ym1Var;
                            if (((Boolean) tu0Var2.c.a(lx0.Va)).booleanValue()) {
                                he1 he1VarE2 = md1VarI.e0();
                                sg1 sg1Var5 = wq1Var.j;
                                bw1 bw1Var3 = wq1Var.i;
                                he1VarE2.P(sg1Var5, bw1Var3, wq1Var.h);
                                he1VarE2.R(sg1Var5, bw1Var3, wq1Var.g);
                            }
                            if (((Boolean) tu0Var2.c.a(ix0Var2)).booleanValue()) {
                                ec.q(vc3.C.k, vx1Var.f.e, "rendering-configure-webview-end");
                            }
                            return (no1) q12Var.c();
                        }
                    };
                    bn2 bn2Var4 = new bn2(qk2VarN2, true, false);
                    bn2Var4.u = new an2(bn2Var4, callable4, this.b);
                    bn2Var4.v();
                    return bn2Var4;
                }
                hpVarD = kn2.g;
            } else {
                hpVarD = aq1Var.d(jSONObjectOptJSONObject3, x42Var, z42Var2, vs0Var2, d91Var2);
            }
            aq1Var2 = aq1Var;
            vs0Var3 = vs0Var2;
            y91Var3.H(58, hpVarD);
            if (((Boolean) kx0Var2.a(lx0.Nd)).booleanValue()) {
                hpVar5 = hpVar4;
                cs1Var = cs1Var2;
                hpVarT = na1.t(new Bundle());
            } else {
                hpVar5 = hpVar4;
                cs1Var = cs1Var2;
                hpVarT = na1.t(new Bundle());
            }
            final hp hpVar115 = hpVarT;
            p83Var = (p83) y91Var3.i;
            executor = (Executor) p83Var.g;
            jSONArrayOptJSONArray2 = jSONObject.optJSONArray("custom_assets");
            if (jSONArrayOptJSONArray2 == null) {
                hpVarM = na1.t(Collections.EMPTY_LIST);
                hpVarD = hpVarD;
                hpVar6 = hpVarB;
            } else {
                if (((Boolean) tu0.e.c.a(lx0.t2)).booleanValue()) {
                    ec.q(vc3.C.k, ((cs1) p83Var.i).e, "native-assets-loading-custom-start");
                }
                arrayList = new ArrayList();
                length = jSONArrayOptJSONArray2.length();
                i2 = 0;
                while (i2 < length) {
                    int i7 = length;
                    jSONObjectOptJSONObject4 = jSONArrayOptJSONArray2.optJSONObject(i2);
                    if (jSONObjectOptJSONObject4 == null) {
                        futureM = kn2.g;
                        jSONArray = jSONArrayOptJSONArray2;
                    } else {
                        jSONArray = jSONArrayOptJSONArray2;
                        strOptString = jSONObjectOptJSONObject4.optString("name");
                        if (strOptString == null) {
                            futureM = kn2.g;
                        } else {
                            i3 = i2;
                            strOptString2 = jSONObjectOptJSONObject4.optString("type");
                            hpVarB = hpVarB;
                            if ("string".equals(strOptString2)) {
                                futureM = na1.t(new dq1(strOptString, jSONObjectOptJSONObject4.optString("string_value")));
                                p83Var = p83Var;
                            } else if ("image".equals(strOptString2)) {
                                aq1 aq1Var6 = (aq1) p83Var.h;
                                p83Var = p83Var;
                                futureM = na1.M(aq1Var6.b(jSONObjectOptJSONObject4.optJSONObject("image_value"), aq1Var6.h.g, 0), new r11(strOptString, 2), executor);
                            } else {
                                p83Var = p83Var;
                                futureM = kn2.g;
                            }
                        }
                        arrayList.add(futureM);
                        i2 = i3 + 1;
                        length = i7;
                        jSONArrayOptJSONArray2 = jSONArray;
                        hpVarB = hpVarB;
                        p83Var = p83Var;
                    }
                    i3 = i2;
                    arrayList.add(futureM);
                    i2 = i3 + 1;
                    length = i7;
                    jSONArrayOptJSONArray2 = jSONArray;
                    hpVarB = hpVarB;
                    p83Var = p83Var;
                }
                hpVar6 = hpVarB;
                hpVarM = na1.M(new ym2(vj2.m(arrayList), true), lh0.l, executor);
            }
            final hp hpVar116 = hpVarM;
            y91Var3.H(63, hpVar116);
            if (jSONObject.optBoolean("enable_omid")) {
                hpVarL2 = kn2.g;
            } else {
                strOptString3 = jSONObjectOptJSONObject5.optString("omid_html");
                if (TextUtils.isEmpty(strOptString3)) {
                    hpVarL2 = kn2.g;
                } else {
                    if (((Boolean) tu0.e.c.a(lx0.t2)).booleanValue()) {
                        ec.q(vc3.C.k, cs1Var.e, "native-assets-loading-omid-start");
                    }
                    hpVarL2 = na1.L(kn2.g, new c41(aq1Var2, strOptString3, d91Var2, vs0Var3), za1.f);
                }
            }
            y91Var3.H(65, hpVarL2);
            arrayList2 = new ArrayList();
            final hp hpVar117 = hpVar;
            arrayList2.add(hpVar117);
            arrayList2.add(hpVarA);
            arrayList2.add(hpVar2);
            final hp hpVar118 = hpVar6;
            arrayList2.add(hpVar118);
            final hp hpVar119 = hpVar3;
            arrayList2.add(hpVar119);
            final hp hpVar1110 = hpVar5;
            arrayList2.add(hpVar1110);
            final hp hpVar1111 = hpVarD;
            arrayList2.add(hpVar1111);
            arrayList2.add(hpVar115);
            arrayList2.add(hpVar116);
            if (((Boolean) tu0.e.c.a(lx0.N5)).booleanValue()) {
                arrayList2.add(hpVarL2);
            } else {
                arrayList2.add(hpVarL2);
            }
            vj2 vj2VarM3 = vj2.m(arrayList2);
            final d91 d91Var8 = d91Var2;
            final hp hpVar1112 = hpVarL2;
            final hp hpVar1113 = hpVar2;
            Callable callable5 = new Callable() { // from class: vp1
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    JSONArray jSONArrayOptJSONArray5;
                    List listM;
                    JSONObject jSONObjectOptJSONObject10;
                    y91 y91Var4 = y91Var3;
                    hp hpVar1114 = hpVar117;
                    hp hpVar1115 = hpVarA;
                    hp hpVar1116 = hpVar119;
                    hp hpVar1117 = hpVar118;
                    hp hpVar20 = hpVar1110;
                    JSONObject jSONObject2 = jSONObject;
                    hp hpVar21 = hpVar1111;
                    hp hpVar22 = hpVar115;
                    hp hpVar23 = hpVar1113;
                    hp hpVar24 = hpVar1112;
                    hp hpVar25 = hpVar116;
                    if (((Boolean) tu0.e.c.a(lx0.o2)).booleanValue()) {
                        ec.q(vc3.C.k, ((cs1) y91Var4.j).e, "rendering-native-assets-loading-end");
                    }
                    ro1 ro1Var = (ro1) hpVar1114.get();
                    List list = (List) hpVar1115.get();
                    synchronized (ro1Var) {
                        ro1Var.e = list;
                    }
                    a01 a01Var = (a01) hpVar1116.get();
                    synchronized (ro1Var) {
                        ro1Var.s = a01Var;
                    }
                    a01 a01Var2 = (a01) hpVar1117.get();
                    synchronized (ro1Var) {
                        ro1Var.t = a01Var2;
                    }
                    wz0 wz0Var = (wz0) hpVar20.get();
                    synchronized (ro1Var) {
                        ro1Var.c = wz0Var;
                    }
                    JSONObject jSONObjectOptJSONObject11 = jSONObject2.optJSONObject("mute");
                    if (jSONObjectOptJSONObject11 == null || (jSONArrayOptJSONArray5 = jSONObjectOptJSONObject11.optJSONArray("reasons")) == null || jSONArrayOptJSONArray5.length() <= 0) {
                        tj2 tj2Var = vj2.g;
                        listM = qk2.j;
                    } else {
                        ArrayList arrayList3 = new ArrayList();
                        for (int i8 = 0; i8 < jSONArrayOptJSONArray5.length(); i8++) {
                            y22 y22VarE = aq1.e(jSONArrayOptJSONArray5.optJSONObject(i8));
                            if (y22VarE != null) {
                                arrayList3.add(y22VarE);
                            }
                        }
                        listM = vj2.m(arrayList3);
                    }
                    synchronized (ro1Var) {
                        ro1Var.f = listM;
                    }
                    JSONObject jSONObjectOptJSONObject12 = jSONObject2.optJSONObject("mute");
                    y22 y22VarE2 = (jSONObjectOptJSONObject12 == null || (jSONObjectOptJSONObject10 = jSONObjectOptJSONObject12.optJSONObject("default_reason")) == null) ? null : aq1.e(jSONObjectOptJSONObject10);
                    synchronized (ro1Var) {
                        ro1Var.g = y22VarE2;
                    }
                    md1 md1Var = (md1) hpVar21.get();
                    if (md1Var != null) {
                        synchronized (ro1Var) {
                            ro1Var.i = md1Var;
                        }
                        View viewP0 = md1Var.p0();
                        synchronized (ro1Var) {
                            ro1Var.o = viewP0;
                        }
                        fe1 fe1VarF = md1Var.f();
                        synchronized (ro1Var) {
                            ro1Var.b = fe1VarF;
                        }
                    }
                    ro1Var.d().putAll((Bundle) hpVar22.get());
                    md1 md1Var2 = (md1) hpVar23.get();
                    if (md1Var2 != null) {
                        synchronized (ro1Var) {
                            ro1Var.j = md1Var2;
                        }
                        View viewP1 = md1Var2.p0();
                        synchronized (ro1Var) {
                            ro1Var.p = viewP1;
                        }
                    }
                    if (!((Boolean) tu0.e.c.a(lx0.N5)).booleanValue() || jSONObject2.optInt("template_id") == 3) {
                        md1 md1Var3 = (md1) hpVar24.get();
                        if (md1Var3 != null) {
                            synchronized (ro1Var) {
                                ro1Var.k = md1Var3;
                            }
                        }
                    } else {
                        synchronized (ro1Var) {
                            ro1Var.m = hpVar24;
                        }
                        cb1 cb1Var2 = new cb1();
                        synchronized (ro1Var) {
                            ro1Var.n = cb1Var2;
                        }
                    }
                    for (dq1 dq1Var : (List) hpVar25.get()) {
                        int i9 = dq1Var.a;
                        String str3 = dq1Var.b;
                        if (i9 != 1) {
                            oz0 oz0Var = dq1Var.d;
                            synchronized (ro1Var) {
                                q00 q00Var = ro1Var.v;
                                if (oz0Var == null) {
                                    q00Var.remove(str3);
                                } else {
                                    q00Var.put(str3, oz0Var);
                                }
                            }
                        } else {
                            ro1Var.o(str3, dq1Var.c);
                        }
                    }
                    return ro1Var;
                }
            };
            final bn2 bn2Var5 = new bn2(vj2VarM3, false, false);
            bn2Var5.u = new an2(bn2Var5, callable5, ya1Var);
            bn2Var5.v();
            qk2 qk2VarN3 = vj2.n(new hp[]{hpVarB3, bn2Var5});
            final vs0 vs0Var7 = vs0Var3;
            Callable callable6 = new Callable() { // from class: ux1
                /* JADX WARN: Code duplicated, block: B:51:0x0913  */
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r12v14, types: [bl1, j11] */
                /* JADX WARN: Type inference failed for: r12v15 */
                /* JADX WARN: Type inference failed for: r12v16 */
                /* JADX WARN: Type inference failed for: r8v2 */
                /* JADX WARN: Type inference failed for: r8v3, types: [bw1, es1] */
                /* JADX WARN: Type inference failed for: r8v7 */
                /* JADX WARN: Type inference failed for: r9v6, types: [he1] */
                @Override // java.util.concurrent.Callable
                public final Object call() throws Throwable {
                    vx1 vx1Var;
                    final int i8;
                    ?? r8;
                    vx1 vx1Var2 = this.a;
                    bn2 bn2Var6 = bn2Var5;
                    hp hpVar1114 = hpVarB3;
                    e52 e52Var2 = e52Var;
                    x42 x42Var2 = x42Var;
                    JSONObject jSONObject2 = jSONObject;
                    vs0 vs0Var8 = vs0Var7;
                    d91 d91Var9 = d91Var8;
                    ro1 ro1Var = (ro1) bn2Var6.get();
                    uq1 uq1Var = (uq1) hpVar1114.get();
                    ix0 ix0Var2 = lx0.p2;
                    tu0 tu0Var2 = tu0.e;
                    if (((Boolean) tu0Var2.c.a(ix0Var2)).booleanValue()) {
                        ec.q(vc3.C.k, vx1Var2.f.e, "rendering-webview-creation-end");
                    }
                    hf1 hf1Var = vx1Var2.a;
                    p83 p83Var2 = new p83(e52Var2, x42Var2, (String) null);
                    kc2 kc2Var = new kc2(23, ro1Var);
                    u40 u40Var = new u40(jSONObject2, uq1Var, vs0Var8, d91Var9, 10, false);
                    if1 if1Var = hf1Var.b;
                    hf1 hf1Var2 = hf1Var.c;
                    q63 q63VarA = q63.a(new eg1(if1Var.G0, 9));
                    ti1 ti1Var = new ti1(p83Var2, 0);
                    do1 do1Var = new do1(u40Var, 0);
                    hj1 hj1Var = new hj1(q63.a(new da1(ti1Var, do1Var, 14)), 29);
                    q63 q63VarA2 = q63.a(new tz0(12, hj1Var));
                    ef1 ef1Var = if1Var.h;
                    xn1 xn1Var = yd.l;
                    q63 q63VarA3 = q63.a(new i91(ef1Var, q63VarA2, xn1Var, 1));
                    q63 q63VarA4 = q63.a(new jh1(q63VarA, q63.a(new eh1(if1Var.g, q63VarA3, 0)), if1Var.c, q63.a(new re1(q63VarA3, q63VarA, 3)), if1Var.f));
                    q63 q63VarA5 = q63.a(new re1(q63VarA4, q63VarA2, 5));
                    q63 q63VarA6 = q63.a(new vg1(hf1Var2.g, ti1Var, 1));
                    q63 q63VarA7 = q63.a(new hj1(q63VarA6, 7));
                    int i9 = w63.c;
                    ArrayList arrayList3 = new ArrayList(1);
                    ArrayList arrayList4 = new ArrayList(3);
                    arrayList4.add(hf1Var2.o);
                    arrayList4.add(hf1Var2.p);
                    arrayList4.add(q63VarA5);
                    arrayList3.add(q63VarA7);
                    q63 q63VarA8 = q63.a(new bk1(new w63(arrayList3, arrayList4), 3));
                    q63 q63VarA9 = q63.a(v51.j);
                    q63 q63Var = if1Var.c;
                    q63 q63VarA10 = q63.a(new eh1(q63VarA9, (v63) q63Var, 4));
                    ti1 ti1Var2 = new ti1(p83Var2, 3);
                    ti1 ti1Var3 = new ti1(p83Var2, 2);
                    xe1 xe1Var = if1Var.g;
                    q63 q63VarA11 = q63.a(new eg1(xe1Var, 20));
                    q63 q63VarA12 = q63.a(ar.j);
                    q63 q63VarA13 = q63.a(new tg1(xe1Var, if1Var.X, q63VarA11, q63VarA12, if1Var.D0, if1Var.d));
                    q63 q63VarA14 = q63.a(new yn1(if1Var.I, if1Var.H, ti1Var, ti1Var3, q63VarA13, hf1Var2.e));
                    xn1 xn1Var2 = new xn1(4);
                    xn1 xn1Var3 = new xn1(2);
                    q63 q63VarA15 = q63.a(new eh1(q63VarA9, (v63) q63Var, 9));
                    q63 q63VarA16 = q63.a(hn.p);
                    eo1 eo1Var = new eo1(q63VarA16, 2);
                    ArrayList arrayList5 = new ArrayList(2);
                    ArrayList arrayList6 = new ArrayList(1);
                    arrayList6.add(hf1Var2.u);
                    arrayList5.add(q63VarA15);
                    arrayList5.add(eo1Var);
                    q63 q63VarA17 = q63.a(new i91(new w63(arrayList5, arrayList6), ti1Var, ti1Var2, 5));
                    q63 q63VarA18 = q63.a(new tz0(9, ti1Var2));
                    q63 q63VarA19 = q63.a(new ah1(if1Var.g, if1Var.c, if1Var.d, ti1Var2, ti1Var, hf1Var2.k, q63VarA14, xn1Var2, xn1Var3, if1Var.E, hf1Var2.l, hf1Var2.e, hf1Var2.t, q63VarA17, q63VarA18));
                    bf1 bf1Var = new bf1(q63VarA19, 24);
                    hj1 hj1Var2 = new hj1(q63.a(new vg1(ti1Var, if1Var.V, 0)), 11);
                    ArrayList arrayList7 = new ArrayList(4);
                    ArrayList arrayList8 = new ArrayList(2);
                    arrayList7.add(hf1Var2.q);
                    arrayList8.add(hf1Var2.r);
                    arrayList8.add(hf1Var2.s);
                    arrayList7.add(q63VarA10);
                    arrayList7.add(bf1Var);
                    arrayList7.add(hj1Var2);
                    q63 q63VarA20 = q63.a(new bk1(new w63(arrayList7, arrayList8), 4));
                    q63 q63VarA21 = q63.a(new jj1(if1Var.g, if1Var.C0, if1Var.j, ti1Var2, ti1Var, if1Var.G, xn1Var));
                    q63 q63VarA22 = q63.a(new hj1(q63VarA21, 5));
                    q63 q63VarA23 = q63.a(new eh1(q63VarA9, (v63) if1Var.c, 3));
                    q63 q63VarA24 = q63.a(new hj1(q63.a(new zh1(if1Var.y0, hf1Var2.d, 1)), 3));
                    bf1 bf1Var2 = new bf1(q63VarA19, 23);
                    ArrayList arrayList9 = new ArrayList(5);
                    ArrayList arrayList10 = new ArrayList(3);
                    arrayList9.add(hf1Var2.v);
                    arrayList9.add(hf1Var2.w);
                    arrayList10.add(hf1Var2.x);
                    arrayList10.add(hf1Var2.y);
                    arrayList9.add(q63VarA22);
                    arrayList9.add(q63VarA23);
                    arrayList10.add(q63VarA24);
                    arrayList9.add(bf1Var2);
                    q63 q63VarA25 = q63.a(new bk1(new w63(arrayList9, arrayList10), 0));
                    q63 q63VarA26 = q63.a(new re1(q63VarA4, q63VarA2, 4));
                    int i10 = 6;
                    q63 q63VarA27 = q63.a(new hj1(q63VarA21, i10));
                    q63 q63Var2 = if1Var.c;
                    q63 q63VarA28 = q63.a(new eh1(q63VarA9, (v63) q63Var2, i10));
                    bf1 bf1Var3 = new bf1(q63VarA17, 12);
                    bf1 bf1Var4 = new bf1(q63VarA19, 26);
                    tz0 tz0Var = new tz0(14, kc2Var);
                    eo1 eo1Var2 = new eo1(q63.a(new i91(tz0Var, hj1Var, q63Var2, 7)), 1);
                    ArrayList arrayList11 = new ArrayList(7);
                    ArrayList arrayList12 = new ArrayList(3);
                    arrayList11.add(hf1Var2.z);
                    arrayList11.add(hf1Var2.A);
                    arrayList12.add(hf1Var2.B);
                    arrayList12.add(hf1Var2.C);
                    arrayList12.add(q63VarA26);
                    arrayList11.add(q63VarA27);
                    arrayList11.add(q63VarA28);
                    arrayList11.add(bf1Var3);
                    arrayList11.add(bf1Var4);
                    arrayList11.add(eo1Var2);
                    q63 q63VarA29 = q63.a(new bk1(new w63(arrayList11, arrayList12), 2));
                    bf1 bf1Var5 = new bf1(q63VarA19, 29);
                    ArrayList arrayList13 = new ArrayList(1);
                    ArrayList arrayList14 = new ArrayList(1);
                    arrayList14.add(hf1Var2.D);
                    arrayList13.add(bf1Var5);
                    q63 q63VarA30 = q63.a(new bk1(new w63(arrayList13, arrayList14), 19));
                    bf1 bf1Var6 = new bf1(q63.a(new vg1(ti1Var, if1Var.I, 2)), 22);
                    ArrayList arrayList15 = new ArrayList(1);
                    new ArrayList(1).add(hf1Var2.E);
                    arrayList15.add(bf1Var6);
                    q63 q63VarA31 = q63.a(new eh1(q63VarA9, (v63) if1Var.c, 10));
                    ArrayList arrayList16 = new ArrayList(1);
                    ArrayList arrayList17 = new ArrayList(1);
                    arrayList17.add(hf1Var2.F);
                    arrayList16.add(q63VarA31);
                    q63 q63VarA32 = q63.a(new bk1(new w63(arrayList16, arrayList17), 20));
                    int i11 = 8;
                    q63 q63VarA33 = q63.a(new hj1(q63VarA6, i11));
                    bf1 bf1Var7 = new bf1(q63VarA19, 27);
                    ArrayList arrayList18 = new ArrayList(7);
                    ArrayList arrayList19 = new ArrayList(4);
                    arrayList18.add(hf1Var2.G);
                    arrayList19.add(hf1Var2.H);
                    arrayList18.add(hf1Var2.I);
                    arrayList18.add(hf1Var2.J);
                    arrayList19.add(hf1Var2.K);
                    arrayList19.add(hf1Var2.L);
                    arrayList19.add(hf1Var2.M);
                    arrayList18.add(hf1Var2.N);
                    arrayList18.add(hf1Var2.O);
                    arrayList18.add(q63VarA33);
                    arrayList18.add(bf1Var7);
                    q63 q63VarA34 = q63.a(new bk1(new w63(arrayList18, arrayList19), 5));
                    hj1 hj1Var3 = new hj1(q63.a(new bf1(q63VarA20, 11)), 1);
                    q63 q63VarA35 = q63.a(new eh1(q63VarA9, (v63) if1Var.c, i11));
                    ArrayList arrayList20 = new ArrayList(2);
                    ArrayList arrayList21 = new ArrayList(1);
                    arrayList21.add(hf1Var2.Q);
                    arrayList20.add(hj1Var3);
                    arrayList20.add(q63VarA35);
                    q63 q63VarA36 = q63.a(new bk1(new w63(arrayList20, arrayList21), 9));
                    List list = Collections.EMPTY_LIST;
                    new ArrayList(1).add(hf1Var2.R);
                    q63 q63VarA37 = q63.a(new hj1(q63VarA21, 4));
                    ArrayList arrayList22 = new ArrayList(1);
                    List list2 = Collections.EMPTY_LIST;
                    arrayList22.add(q63VarA37);
                    q63 q63VarA38 = q63.a(new eh1(q63VarA9, (v63) if1Var.c, 5));
                    bf1 bf1Var8 = new bf1(q63VarA19, 25);
                    ArrayList arrayList23 = new ArrayList(2);
                    new ArrayList(1).add(hf1Var2.S);
                    arrayList23.add(q63VarA38);
                    arrayList23.add(bf1Var8);
                    q63 q63VarA39 = q63.a(new hj1(q63VarA21, 0));
                    ArrayList arrayList24 = new ArrayList(1);
                    List list3 = Collections.EMPTY_LIST;
                    arrayList24.add(q63VarA39);
                    ti1 ti1Var4 = new ti1(p83Var2, 1);
                    u91 u91Var = new u91(ti1Var, ti1Var4, hf1Var2.h, ti1Var3, hf1Var2.f, 4);
                    ArrayList arrayList25 = new ArrayList(1);
                    ArrayList arrayList26 = new ArrayList(1);
                    arrayList26.add(hf1Var2.U);
                    arrayList25.add(hf1Var2.V);
                    wi1 wi1Var = new wi1(ti1Var2, ti1Var, q63VarA8, q63VarA34, hf1Var2.T, u91Var, q63VarA9, new bk1(new w63(arrayList25, arrayList26), 6), q63VarA30, q63VarA18, if1Var.n0);
                    do1 do1Var2 = new do1(u40Var, 1);
                    q63 q63VarA40 = q63.a(new fp1(do1Var2, if1Var.f));
                    q63 q63VarA41 = q63.a(new re1(q63VarA4, q63VarA2, 6));
                    List list4 = Collections.EMPTY_LIST;
                    ArrayList arrayList27 = new ArrayList(2);
                    arrayList27.add(hf1Var2.W);
                    arrayList27.add(q63VarA41);
                    w63 w63Var = new w63(list4, arrayList27);
                    q63 q63Var3 = hf1Var2.g;
                    q63 q63VarA42 = q63.a(new i91(q63Var3, w63Var, ti1Var, 6));
                    q63 q63VarA43 = q63.a(new do1(u40Var, 2));
                    q63 q63VarA44 = q63.a(new do1(u40Var, 3));
                    wn1 wn1Var = hf1Var2.i;
                    q63 q63Var4 = if1Var.E;
                    ef1 ef1Var2 = if1Var.h;
                    yj1 yj1Var = hf1Var2.d;
                    q63 q63Var5 = if1Var.f;
                    eo1 eo1Var3 = new eo1(q63.a(new co1(q63Var3, wn1Var, do1Var, do1Var2, tz0Var, q63Var4, q63VarA29, q63VarA25, q63VarA32, ti1Var, ef1Var2, yj1Var, q63VarA4, q63VarA40, q63Var5, q63VarA42, if1Var.I, hf1Var2.e, if1Var.J, q63VarA12, if1Var.L0, q63VarA17, q63VarA43, q63VarA44, q63VarA18)), 0);
                    q63 q63VarA45 = q63.a(new eg1(ef1Var2, 14));
                    q63 q63Var6 = if1Var.c;
                    q63 q63VarA46 = q63.a(new fo1(q63VarA45, q63Var6, q63Var3, q63Var5, 0));
                    q63 q63Var7 = hf1Var2.m;
                    dy0 dy0Var = new dy0((v63) q63Var7, (r63) do1Var2, q63VarA46, (v63) eo1Var3, 6);
                    fp1 fp1Var = new fp1(q63Var7, do1Var2);
                    q63 q63VarA47 = q63.a(new tz0(13, new ho1(tz0Var, 0)));
                    bp1 bp1Var = new bp1(if1Var.X, yj1Var, hj1Var, tz0Var, dy0Var, fp1Var, q63Var6, q63VarA47);
                    q12 q12Var = new q12();
                    q63 q63VarA48 = q63.a(new mq1(ti1Var4, q12Var, tz0Var, 1));
                    q63 q63VarA49 = q63.a(new mq1(ti1Var4, q12Var, tz0Var, 0));
                    q63 q63VarA50 = q63.a(new dy0((v63) ti1Var4, (v63) q12Var, (v63) tz0Var, (v63) if1Var.j, 8));
                    q63 q63VarA51 = q63.a(new da1(q12Var, tz0Var, 17));
                    xe1 xe1Var2 = if1Var.g;
                    q63 q63VarA52 = q63.a(new dy0(xe1Var2, tz0Var, bp1Var, q12Var, 7));
                    q12.a(q12Var, q63.a(new oo1(wi1Var, q63Var6, tz0Var, eo1Var3, bp1Var, hj1Var, wn1Var, q63VarA48, q63VarA49, q63VarA50, q63VarA51, q63VarA52, new xo1(xe1Var2, yj1Var, 0), q63Var4, ef1Var2, xe1Var2, q63VarA47, q63VarA16, if1Var.M0)));
                    q63 q63Var8 = hf1Var2.X;
                    q63 q63Var9 = hf1Var2.P;
                    q63 q63VarA53 = q63.a(new bp1(q63VarA25, q63VarA20, q63Var8, q63VarA36, q63Var9, ti1Var, ti1Var3, q63VarA13));
                    q63 q63VarA54 = q63.a(new iq1((v63) if1Var.c, q63VarA46, q63.a(new vg1(hf1Var2.g, ti1Var, 3)), q63VarA13, 0));
                    q63 q63VarA55 = q63.a(new th1(q63VarA25, q63VarA20, q63Var8, q63VarA36, q63Var9, q63VarA32, if1Var.j, if1Var.I, if1Var.G, q63VarA13));
                    if (((Boolean) tu0Var2.c.a(ix0Var2)).booleanValue()) {
                        vc3.C.k.getClass();
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        vx1Var = vx1Var2;
                        cs1 cs1Var3 = vx1Var.f;
                        cs1Var3.e.putLong("rendering-ad-component-creation-end", jCurrentTimeMillis);
                        cs1Var3.e.putLong("rendering-configure-webview-start", jCurrentTimeMillis);
                    } else {
                        vx1Var = vx1Var2;
                    }
                    wo1 wo1Var = (wo1) hf1Var2.a.g;
                    dq.D(wo1Var);
                    dq.D(ro1Var);
                    dq.D(uq1Var);
                    n31 n31Var = new n31(wo1Var, ro1Var, uq1Var, q63.b(q63VarA52));
                    if (((r01) n31Var.g) != null) {
                        ((uq1) n31Var.h).b("/nativeAdCustomClick", n31Var);
                    }
                    sq1 sq1Var = (sq1) q63VarA53.c();
                    ok1 ok1Var = sq1Var.b;
                    qq1 qq1Var = uq1Var.a;
                    Objects.requireNonNull(ok1Var);
                    rq1 rq1Var = new rq1(0, ok1Var);
                    ak1 ak1Var = sq1Var.a;
                    ?? r12 = sq1Var.c;
                    gl1 gl1Var = sq1Var.d;
                    zl1 zl1Var = sq1Var.e;
                    synchronized (qq1Var) {
                        qq1Var.f = ak1Var;
                        qq1Var.g = r12;
                        qq1Var.h = gl1Var;
                        qq1Var.i = zl1Var;
                        qq1Var.j = rq1Var;
                    }
                    x42 x42Var3 = sq1Var.f;
                    z42 z42Var4 = sq1Var.g;
                    sg1 sg1Var = sq1Var.h;
                    synchronized (uq1Var) {
                        try {
                            try {
                                qm2 qm2Var = uq1Var.m;
                                if (qm2Var == null) {
                                    i8 = 0;
                                    r8 = 0;
                                } else {
                                    i8 = 0;
                                    r8 = 0;
                                    qm2Var.a(new in2(qm2Var, 0, new u40(uq1Var, x42Var3, z42Var4, sg1Var, 11)), uq1Var.e);
                                }
                            } catch (Throwable th) {
                                th = th;
                                r12 = uq1Var;
                                throw th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    }
                    final gq1 gq1Var = (gq1) q63VarA54.c();
                    md1 md1VarH = r11.h();
                    if (md1VarH == null) {
                        gq1Var.getClass();
                    } else {
                        xm1 xm1Var = gq1Var.c;
                        xm1Var.R1(md1VarH.p0());
                        eq1 eq1Var = new eq1(md1VarH, 1);
                        Executor executor3 = gq1Var.a;
                        xm1Var.I1(eq1Var, executor3);
                        xm1Var.I1(new eq1(md1VarH, i8), executor3);
                        kh1 kh1Var = gq1Var.b;
                        xm1Var.I1(kh1Var, executor3);
                        kh1Var.f = md1VarH;
                        ?? E0 = md1VarH.e0();
                        if (((Boolean) tu0Var2.c.a(lx0.Ua)).booleanValue() && E0 != 0) {
                            sg1 sg1Var2 = gq1Var.d;
                            E0.d("/click");
                            zm1 zm1Var = E0.p;
                            m11 m11Var = u11.a;
                            E0.b("/click", new s11(zm1Var, i8, sg1Var2));
                            E0.R(sg1Var2, r8, r8);
                        }
                        md1VarH.t0("/trackActiveViewUnit", new v11() { // from class: fq1
                            @Override // defpackage.v11
                            public final void f(Object obj, Map map) {
                                int i12 = i8;
                                gq1 gq1Var2 = gq1Var;
                                switch (i12) {
                                    case 0:
                                        kh1 kh1Var2 = gq1Var2.b;
                                        kh1Var2.j = true;
                                        kh1Var2.a();
                                        break;
                                    default:
                                        gq1Var2.b.j = false;
                                        break;
                                }
                            }
                        });
                        final int i12 = 1;
                        md1VarH.t0("/untrackActiveViewUnit", new v11() { // from class: fq1
                            @Override // defpackage.v11
                            public final void f(Object obj, Map map) {
                                int i13 = i12;
                                gq1 gq1Var2 = gq1Var;
                                switch (i13) {
                                    case 0:
                                        kh1 kh1Var2 = gq1Var2.b;
                                        kh1Var2.j = true;
                                        kh1Var2.a();
                                        break;
                                    default:
                                        gq1Var2.b.j = false;
                                        break;
                                }
                            }
                        });
                    }
                    wq1 wq1Var = (wq1) q63VarA55.c();
                    xq1 xq1Var = vx1Var.e;
                    md1 md1VarI = ro1Var.i();
                    wq1Var.getClass();
                    vq1 vq1Var = xq1Var.a;
                    ok1 ok1Var2 = wq1Var.b;
                    Objects.requireNonNull(ok1Var2);
                    rq1 rq1Var2 = new rq1(1, ok1Var2);
                    ak1 ak1Var2 = wq1Var.a;
                    bl1 bl1Var = wq1Var.c;
                    gl1 gl1Var2 = wq1Var.d;
                    zl1 zl1Var2 = wq1Var.e;
                    ym1 ym1Var = wq1Var.f;
                    synchronized (vq1Var) {
                        synchronized (vq1Var) {
                            vq1Var.f = ak1Var2;
                            vq1Var.g = bl1Var;
                            vq1Var.h = gl1Var2;
                            vq1Var.i = zl1Var2;
                            vq1Var.j = rq1Var2;
                        }
                        if (((Boolean) tu0Var2.c.a(lx0.Va)).booleanValue() && md1VarI != null && md1VarI.e0() != null) {
                            he1 he1VarE2 = md1VarI.e0();
                            sg1 sg1Var5 = wq1Var.j;
                            bw1 bw1Var3 = wq1Var.i;
                            he1VarE2.P(sg1Var5, bw1Var3, wq1Var.h);
                            he1VarE2.R(sg1Var5, bw1Var3, wq1Var.g);
                        }
                        if (((Boolean) tu0Var2.c.a(ix0Var2)).booleanValue()) {
                            ec.q(vc3.C.k, vx1Var.f.e, "rendering-configure-webview-end");
                        }
                        return (no1) q12Var.c();
                    }
                    vq1Var.k = ym1Var;
                    if (((Boolean) tu0Var2.c.a(lx0.Va)).booleanValue()) {
                        he1 he1VarE3 = md1VarI.e0();
                        sg1 sg1Var6 = wq1Var.j;
                        bw1 bw1Var4 = wq1Var.i;
                        he1VarE3.P(sg1Var6, bw1Var4, wq1Var.h);
                        he1VarE3.R(sg1Var6, bw1Var4, wq1Var.g);
                    }
                    if (((Boolean) tu0Var2.c.a(ix0Var2)).booleanValue()) {
                        ec.q(vc3.C.k, vx1Var.f.e, "rendering-configure-webview-end");
                    }
                    return (no1) q12Var.c();
                }
            };
            bn2 bn2Var6 = new bn2(qk2VarN3, true, false);
            bn2Var6.u = new an2(bn2Var6, callable6, this.b);
            bn2Var6.v();
            return bn2Var6;
        }
        kn2Var = kn2.g;
        hpVar = hpVarB4;
        y91Var2 = y91Var2;
        cs1Var2 = cs1Var2;
        str2 = "images";
        z42Var = z42Var3;
        vs0Var2 = vs0Var4;
        d91Var2 = d91Var;
        aq1Var = aq1Var3;
        str = "html";
        ya1Var = ya1Var;
        hpVar2 = kn2Var;
        final y91 y91Var4 = y91Var2;
        y91Var4.H(50, hpVar2);
        hpVarB = aq1Var.b(jSONObject.optJSONObject("secondary_image"), qz0Var.g, 51);
        y91Var4.H(52, hpVarB);
        hpVarB2 = aq1Var.b(jSONObject.optJSONObject("app_icon"), qz0Var.g, 53);
        y91Var4.H(54, hpVarB2);
        jSONObjectOptJSONObject = jSONObject.optJSONObject("attribution");
        if (jSONObjectOptJSONObject == null) {
            hpVarJ = kn2.g;
            z42Var2 = z42Var;
            hpVar3 = hpVarB2;
        } else {
            jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray(str2);
            z42Var2 = z42Var;
            jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("image");
            if (jSONArrayOptJSONArray == null) {
                jSONArrayOptJSONArray = new JSONArray();
                jSONArrayOptJSONArray.put(jSONObjectOptJSONObject2);
            }
            hpVar3 = hpVarB2;
            qm2VarM = na1.M(aq1Var.a(jSONArrayOptJSONArray, false, true, 55), new hl0(aq1Var, 2, jSONObjectOptJSONObject), aq1Var.g);
            if (jSONObjectOptJSONObject.optBoolean("require")) {
                hpVarJ = na1.L(qm2VarM, new r21(5, qm2VarM), za1.g);
            } else {
                hpVarJ = na1.J(qm2VarM, Exception.class, new kg0(2), za1.g);
            }
        }
        hpVar4 = hpVarJ;
        y91Var4.H(56, hpVar4);
        strArr = new String[]{"html_containers", "instream"};
        jSONObjectY0 = w40.Y0(jSONObject, strArr);
        if (jSONObjectY0 == null) {
            jSONObjectOptJSONObject3 = null;
        } else {
            jSONObjectOptJSONObject3 = jSONObjectY0.optJSONObject(strArr[1]);
        }
        if (jSONObjectOptJSONObject3 == null) {
            jSONObjectOptJSONObject6 = jSONObject.optJSONObject("video");
            if (jSONObjectOptJSONObject6 == null) {
                strOptString4 = jSONObjectOptJSONObject6.optString("vast_xml");
                if (((Boolean) kx0Var2.a(lx0.Na)).booleanValue()) {
                    z = false;
                } else {
                    z = false;
                }
                if (TextUtils.isEmpty(strOptString4)) {
                    if (!z) {
                        hq1Var = aq1Var.i;
                        hq1Var.getClass();
                        if (((Boolean) kx0Var2.a(lx0.t2)).booleanValue()) {
                            ec.q(vc3.C.k, hq1Var.i.e, "native-assets-loading-video-start");
                        }
                        kn2 kn2Var5 = kn2.g;
                        qn0 qn0Var2 = new qn0(hq1Var, vs0Var2, d91Var2, 2);
                        Executor executor3 = hq1Var.b;
                        pm2VarL = na1.L(na1.L(kn2Var5, qn0Var2, executor3), new yy0(hq1Var, 5, jSONObjectOptJSONObject6), executor3);
                        aq1Var = aq1Var;
                        vs0Var2 = vs0Var2;
                    }
                    hpVarD = na1.J(na1.K(pm2VarL, ((Integer) kx0Var2.a(lx0.g4)).intValue(), TimeUnit.SECONDS, aq1Var.k), Exception.class, new kg0(2), za1.g);
                    aq1Var2 = aq1Var;
                    vs0Var3 = vs0Var2;
                    y91Var4.H(58, hpVarD);
                    if (((Boolean) kx0Var2.a(lx0.Nd)).booleanValue()) {
                        hpVar5 = hpVar4;
                        cs1Var = cs1Var2;
                        hpVarT = na1.t(new Bundle());
                    } else {
                        hpVar5 = hpVar4;
                        cs1Var = cs1Var2;
                        hpVarT = na1.t(new Bundle());
                    }
                    final hp hpVar1114 = hpVarT;
                    p83Var = (p83) y91Var4.i;
                    executor = (Executor) p83Var.g;
                    jSONArrayOptJSONArray2 = jSONObject.optJSONArray("custom_assets");
                    if (jSONArrayOptJSONArray2 == null) {
                        hpVarM = na1.t(Collections.EMPTY_LIST);
                        hpVarD = hpVarD;
                        hpVar6 = hpVarB;
                    } else {
                        if (((Boolean) tu0.e.c.a(lx0.t2)).booleanValue()) {
                            ec.q(vc3.C.k, ((cs1) p83Var.i).e, "native-assets-loading-custom-start");
                        }
                        arrayList = new ArrayList();
                        length = jSONArrayOptJSONArray2.length();
                        i2 = 0;
                        while (i2 < length) {
                            int i8 = length;
                            jSONObjectOptJSONObject4 = jSONArrayOptJSONArray2.optJSONObject(i2);
                            if (jSONObjectOptJSONObject4 == null) {
                                futureM = kn2.g;
                                jSONArray = jSONArrayOptJSONArray2;
                            } else {
                                jSONArray = jSONArrayOptJSONArray2;
                                strOptString = jSONObjectOptJSONObject4.optString("name");
                                if (strOptString == null) {
                                    futureM = kn2.g;
                                } else {
                                    i3 = i2;
                                    strOptString2 = jSONObjectOptJSONObject4.optString("type");
                                    hpVarB = hpVarB;
                                    if ("string".equals(strOptString2)) {
                                        futureM = na1.t(new dq1(strOptString, jSONObjectOptJSONObject4.optString("string_value")));
                                        p83Var = p83Var;
                                    } else if ("image".equals(strOptString2)) {
                                        aq1 aq1Var7 = (aq1) p83Var.h;
                                        p83Var = p83Var;
                                        futureM = na1.M(aq1Var7.b(jSONObjectOptJSONObject4.optJSONObject("image_value"), aq1Var7.h.g, 0), new r11(strOptString, 2), executor);
                                    } else {
                                        p83Var = p83Var;
                                        futureM = kn2.g;
                                    }
                                }
                                arrayList.add(futureM);
                                i2 = i3 + 1;
                                length = i8;
                                jSONArrayOptJSONArray2 = jSONArray;
                                hpVarB = hpVarB;
                                p83Var = p83Var;
                            }
                            i3 = i2;
                            arrayList.add(futureM);
                            i2 = i3 + 1;
                            length = i8;
                            jSONArrayOptJSONArray2 = jSONArray;
                            hpVarB = hpVarB;
                            p83Var = p83Var;
                        }
                        hpVar6 = hpVarB;
                        hpVarM = na1.M(new ym2(vj2.m(arrayList), true), lh0.l, executor);
                    }
                    final hp hpVar1115 = hpVarM;
                    y91Var4.H(63, hpVar1115);
                    if (jSONObject.optBoolean("enable_omid")) {
                        hpVarL2 = kn2.g;
                    } else {
                        strOptString3 = jSONObjectOptJSONObject5.optString("omid_html");
                        if (TextUtils.isEmpty(strOptString3)) {
                            hpVarL2 = kn2.g;
                        } else {
                            if (((Boolean) tu0.e.c.a(lx0.t2)).booleanValue()) {
                                ec.q(vc3.C.k, cs1Var.e, "native-assets-loading-omid-start");
                            }
                            hpVarL2 = na1.L(kn2.g, new c41(aq1Var2, strOptString3, d91Var2, vs0Var3), za1.f);
                        }
                    }
                    y91Var4.H(65, hpVarL2);
                    arrayList2 = new ArrayList();
                    final hp hpVar1116 = hpVar;
                    arrayList2.add(hpVar1116);
                    arrayList2.add(hpVarA);
                    arrayList2.add(hpVar2);
                    final hp hpVar1117 = hpVar6;
                    arrayList2.add(hpVar1117);
                    final hp hpVar1118 = hpVar3;
                    arrayList2.add(hpVar1118);
                    final hp hpVar1119 = hpVar5;
                    arrayList2.add(hpVar1119);
                    final hp hpVar11110 = hpVarD;
                    arrayList2.add(hpVar11110);
                    arrayList2.add(hpVar1114);
                    arrayList2.add(hpVar1115);
                    if (((Boolean) tu0.e.c.a(lx0.N5)).booleanValue()) {
                        arrayList2.add(hpVarL2);
                    } else {
                        arrayList2.add(hpVarL2);
                    }
                    vj2 vj2VarM4 = vj2.m(arrayList2);
                    final d91 d91Var9 = d91Var2;
                    final hp hpVar11111 = hpVarL2;
                    final hp hpVar11112 = hpVar2;
                    Callable callable7 = new Callable() { // from class: vp1
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            JSONArray jSONArrayOptJSONArray5;
                            List listM;
                            JSONObject jSONObjectOptJSONObject10;
                            y91 y91Var5 = y91Var4;
                            hp hpVar11113 = hpVar1116;
                            hp hpVar11114 = hpVarA;
                            hp hpVar11115 = hpVar1118;
                            hp hpVar11116 = hpVar1117;
                            hp hpVar20 = hpVar1119;
                            JSONObject jSONObject2 = jSONObject;
                            hp hpVar21 = hpVar11110;
                            hp hpVar22 = hpVar1114;
                            hp hpVar23 = hpVar11112;
                            hp hpVar24 = hpVar11111;
                            hp hpVar25 = hpVar1115;
                            if (((Boolean) tu0.e.c.a(lx0.o2)).booleanValue()) {
                                ec.q(vc3.C.k, ((cs1) y91Var5.j).e, "rendering-native-assets-loading-end");
                            }
                            ro1 ro1Var = (ro1) hpVar11113.get();
                            List list = (List) hpVar11114.get();
                            synchronized (ro1Var) {
                                ro1Var.e = list;
                            }
                            a01 a01Var = (a01) hpVar11115.get();
                            synchronized (ro1Var) {
                                ro1Var.s = a01Var;
                            }
                            a01 a01Var2 = (a01) hpVar11116.get();
                            synchronized (ro1Var) {
                                ro1Var.t = a01Var2;
                            }
                            wz0 wz0Var = (wz0) hpVar20.get();
                            synchronized (ro1Var) {
                                ro1Var.c = wz0Var;
                            }
                            JSONObject jSONObjectOptJSONObject11 = jSONObject2.optJSONObject("mute");
                            if (jSONObjectOptJSONObject11 == null || (jSONArrayOptJSONArray5 = jSONObjectOptJSONObject11.optJSONArray("reasons")) == null || jSONArrayOptJSONArray5.length() <= 0) {
                                tj2 tj2Var = vj2.g;
                                listM = qk2.j;
                            } else {
                                ArrayList arrayList3 = new ArrayList();
                                for (int i9 = 0; i9 < jSONArrayOptJSONArray5.length(); i9++) {
                                    y22 y22VarE = aq1.e(jSONArrayOptJSONArray5.optJSONObject(i9));
                                    if (y22VarE != null) {
                                        arrayList3.add(y22VarE);
                                    }
                                }
                                listM = vj2.m(arrayList3);
                            }
                            synchronized (ro1Var) {
                                ro1Var.f = listM;
                            }
                            JSONObject jSONObjectOptJSONObject12 = jSONObject2.optJSONObject("mute");
                            y22 y22VarE2 = (jSONObjectOptJSONObject12 == null || (jSONObjectOptJSONObject10 = jSONObjectOptJSONObject12.optJSONObject("default_reason")) == null) ? null : aq1.e(jSONObjectOptJSONObject10);
                            synchronized (ro1Var) {
                                ro1Var.g = y22VarE2;
                            }
                            md1 md1Var = (md1) hpVar21.get();
                            if (md1Var != null) {
                                synchronized (ro1Var) {
                                    ro1Var.i = md1Var;
                                }
                                View viewP0 = md1Var.p0();
                                synchronized (ro1Var) {
                                    ro1Var.o = viewP0;
                                }
                                fe1 fe1VarF = md1Var.f();
                                synchronized (ro1Var) {
                                    ro1Var.b = fe1VarF;
                                }
                            }
                            ro1Var.d().putAll((Bundle) hpVar22.get());
                            md1 md1Var2 = (md1) hpVar23.get();
                            if (md1Var2 != null) {
                                synchronized (ro1Var) {
                                    ro1Var.j = md1Var2;
                                }
                                View viewP1 = md1Var2.p0();
                                synchronized (ro1Var) {
                                    ro1Var.p = viewP1;
                                }
                            }
                            if (!((Boolean) tu0.e.c.a(lx0.N5)).booleanValue() || jSONObject2.optInt("template_id") == 3) {
                                md1 md1Var3 = (md1) hpVar24.get();
                                if (md1Var3 != null) {
                                    synchronized (ro1Var) {
                                        ro1Var.k = md1Var3;
                                    }
                                }
                            } else {
                                synchronized (ro1Var) {
                                    ro1Var.m = hpVar24;
                                }
                                cb1 cb1Var2 = new cb1();
                                synchronized (ro1Var) {
                                    ro1Var.n = cb1Var2;
                                }
                            }
                            for (dq1 dq1Var : (List) hpVar25.get()) {
                                int i10 = dq1Var.a;
                                String str3 = dq1Var.b;
                                if (i10 != 1) {
                                    oz0 oz0Var = dq1Var.d;
                                    synchronized (ro1Var) {
                                        q00 q00Var = ro1Var.v;
                                        if (oz0Var == null) {
                                            q00Var.remove(str3);
                                        } else {
                                            q00Var.put(str3, oz0Var);
                                        }
                                    }
                                } else {
                                    ro1Var.o(str3, dq1Var.c);
                                }
                            }
                            return ro1Var;
                        }
                    };
                    final bn2 bn2Var7 = new bn2(vj2VarM4, false, false);
                    bn2Var7.u = new an2(bn2Var7, callable7, ya1Var);
                    bn2Var7.v();
                    qk2 qk2VarN4 = vj2.n(new hp[]{hpVarB3, bn2Var7});
                    final vs0 vs0Var8 = vs0Var3;
                    Callable callable8 = new Callable() { // from class: ux1
                        /* JADX WARN: Code duplicated, block: B:51:0x0913  */
                        /* JADX WARN: Multi-variable type inference failed */
                        /* JADX WARN: Type inference failed for: r12v14, types: [bl1, j11] */
                        /* JADX WARN: Type inference failed for: r12v15 */
                        /* JADX WARN: Type inference failed for: r12v16 */
                        /* JADX WARN: Type inference failed for: r8v2 */
                        /* JADX WARN: Type inference failed for: r8v3, types: [bw1, es1] */
                        /* JADX WARN: Type inference failed for: r8v7 */
                        /* JADX WARN: Type inference failed for: r9v6, types: [he1] */
                        @Override // java.util.concurrent.Callable
                        public final Object call() throws Throwable {
                            vx1 vx1Var;
                            final int i9;
                            ?? r8;
                            vx1 vx1Var2 = this.a;
                            bn2 bn2Var8 = bn2Var7;
                            hp hpVar11113 = hpVarB3;
                            e52 e52Var2 = e52Var;
                            x42 x42Var2 = x42Var;
                            JSONObject jSONObject2 = jSONObject;
                            vs0 vs0Var9 = vs0Var8;
                            d91 d91Var10 = d91Var9;
                            ro1 ro1Var = (ro1) bn2Var8.get();
                            uq1 uq1Var = (uq1) hpVar11113.get();
                            ix0 ix0Var2 = lx0.p2;
                            tu0 tu0Var2 = tu0.e;
                            if (((Boolean) tu0Var2.c.a(ix0Var2)).booleanValue()) {
                                ec.q(vc3.C.k, vx1Var2.f.e, "rendering-webview-creation-end");
                            }
                            hf1 hf1Var = vx1Var2.a;
                            p83 p83Var2 = new p83(e52Var2, x42Var2, (String) null);
                            kc2 kc2Var = new kc2(23, ro1Var);
                            u40 u40Var = new u40(jSONObject2, uq1Var, vs0Var9, d91Var10, 10, false);
                            if1 if1Var = hf1Var.b;
                            hf1 hf1Var2 = hf1Var.c;
                            q63 q63VarA = q63.a(new eg1(if1Var.G0, 9));
                            ti1 ti1Var = new ti1(p83Var2, 0);
                            do1 do1Var = new do1(u40Var, 0);
                            hj1 hj1Var = new hj1(q63.a(new da1(ti1Var, do1Var, 14)), 29);
                            q63 q63VarA2 = q63.a(new tz0(12, hj1Var));
                            ef1 ef1Var = if1Var.h;
                            xn1 xn1Var = yd.l;
                            q63 q63VarA3 = q63.a(new i91(ef1Var, q63VarA2, xn1Var, 1));
                            q63 q63VarA4 = q63.a(new jh1(q63VarA, q63.a(new eh1(if1Var.g, q63VarA3, 0)), if1Var.c, q63.a(new re1(q63VarA3, q63VarA, 3)), if1Var.f));
                            q63 q63VarA5 = q63.a(new re1(q63VarA4, q63VarA2, 5));
                            q63 q63VarA6 = q63.a(new vg1(hf1Var2.g, ti1Var, 1));
                            q63 q63VarA7 = q63.a(new hj1(q63VarA6, 7));
                            int i10 = w63.c;
                            ArrayList arrayList3 = new ArrayList(1);
                            ArrayList arrayList4 = new ArrayList(3);
                            arrayList4.add(hf1Var2.o);
                            arrayList4.add(hf1Var2.p);
                            arrayList4.add(q63VarA5);
                            arrayList3.add(q63VarA7);
                            q63 q63VarA8 = q63.a(new bk1(new w63(arrayList3, arrayList4), 3));
                            q63 q63VarA9 = q63.a(v51.j);
                            q63 q63Var = if1Var.c;
                            q63 q63VarA10 = q63.a(new eh1(q63VarA9, (v63) q63Var, 4));
                            ti1 ti1Var2 = new ti1(p83Var2, 3);
                            ti1 ti1Var3 = new ti1(p83Var2, 2);
                            xe1 xe1Var = if1Var.g;
                            q63 q63VarA11 = q63.a(new eg1(xe1Var, 20));
                            q63 q63VarA12 = q63.a(ar.j);
                            q63 q63VarA13 = q63.a(new tg1(xe1Var, if1Var.X, q63VarA11, q63VarA12, if1Var.D0, if1Var.d));
                            q63 q63VarA14 = q63.a(new yn1(if1Var.I, if1Var.H, ti1Var, ti1Var3, q63VarA13, hf1Var2.e));
                            xn1 xn1Var2 = new xn1(4);
                            xn1 xn1Var3 = new xn1(2);
                            q63 q63VarA15 = q63.a(new eh1(q63VarA9, (v63) q63Var, 9));
                            q63 q63VarA16 = q63.a(hn.p);
                            eo1 eo1Var = new eo1(q63VarA16, 2);
                            ArrayList arrayList5 = new ArrayList(2);
                            ArrayList arrayList6 = new ArrayList(1);
                            arrayList6.add(hf1Var2.u);
                            arrayList5.add(q63VarA15);
                            arrayList5.add(eo1Var);
                            q63 q63VarA17 = q63.a(new i91(new w63(arrayList5, arrayList6), ti1Var, ti1Var2, 5));
                            q63 q63VarA18 = q63.a(new tz0(9, ti1Var2));
                            q63 q63VarA19 = q63.a(new ah1(if1Var.g, if1Var.c, if1Var.d, ti1Var2, ti1Var, hf1Var2.k, q63VarA14, xn1Var2, xn1Var3, if1Var.E, hf1Var2.l, hf1Var2.e, hf1Var2.t, q63VarA17, q63VarA18));
                            bf1 bf1Var = new bf1(q63VarA19, 24);
                            hj1 hj1Var2 = new hj1(q63.a(new vg1(ti1Var, if1Var.V, 0)), 11);
                            ArrayList arrayList7 = new ArrayList(4);
                            ArrayList arrayList8 = new ArrayList(2);
                            arrayList7.add(hf1Var2.q);
                            arrayList8.add(hf1Var2.r);
                            arrayList8.add(hf1Var2.s);
                            arrayList7.add(q63VarA10);
                            arrayList7.add(bf1Var);
                            arrayList7.add(hj1Var2);
                            q63 q63VarA20 = q63.a(new bk1(new w63(arrayList7, arrayList8), 4));
                            q63 q63VarA21 = q63.a(new jj1(if1Var.g, if1Var.C0, if1Var.j, ti1Var2, ti1Var, if1Var.G, xn1Var));
                            q63 q63VarA22 = q63.a(new hj1(q63VarA21, 5));
                            q63 q63VarA23 = q63.a(new eh1(q63VarA9, (v63) if1Var.c, 3));
                            q63 q63VarA24 = q63.a(new hj1(q63.a(new zh1(if1Var.y0, hf1Var2.d, 1)), 3));
                            bf1 bf1Var2 = new bf1(q63VarA19, 23);
                            ArrayList arrayList9 = new ArrayList(5);
                            ArrayList arrayList10 = new ArrayList(3);
                            arrayList9.add(hf1Var2.v);
                            arrayList9.add(hf1Var2.w);
                            arrayList10.add(hf1Var2.x);
                            arrayList10.add(hf1Var2.y);
                            arrayList9.add(q63VarA22);
                            arrayList9.add(q63VarA23);
                            arrayList10.add(q63VarA24);
                            arrayList9.add(bf1Var2);
                            q63 q63VarA25 = q63.a(new bk1(new w63(arrayList9, arrayList10), 0));
                            q63 q63VarA26 = q63.a(new re1(q63VarA4, q63VarA2, 4));
                            int i11 = 6;
                            q63 q63VarA27 = q63.a(new hj1(q63VarA21, i11));
                            q63 q63Var2 = if1Var.c;
                            q63 q63VarA28 = q63.a(new eh1(q63VarA9, (v63) q63Var2, i11));
                            bf1 bf1Var3 = new bf1(q63VarA17, 12);
                            bf1 bf1Var4 = new bf1(q63VarA19, 26);
                            tz0 tz0Var = new tz0(14, kc2Var);
                            eo1 eo1Var2 = new eo1(q63.a(new i91(tz0Var, hj1Var, q63Var2, 7)), 1);
                            ArrayList arrayList11 = new ArrayList(7);
                            ArrayList arrayList12 = new ArrayList(3);
                            arrayList11.add(hf1Var2.z);
                            arrayList11.add(hf1Var2.A);
                            arrayList12.add(hf1Var2.B);
                            arrayList12.add(hf1Var2.C);
                            arrayList12.add(q63VarA26);
                            arrayList11.add(q63VarA27);
                            arrayList11.add(q63VarA28);
                            arrayList11.add(bf1Var3);
                            arrayList11.add(bf1Var4);
                            arrayList11.add(eo1Var2);
                            q63 q63VarA29 = q63.a(new bk1(new w63(arrayList11, arrayList12), 2));
                            bf1 bf1Var5 = new bf1(q63VarA19, 29);
                            ArrayList arrayList13 = new ArrayList(1);
                            ArrayList arrayList14 = new ArrayList(1);
                            arrayList14.add(hf1Var2.D);
                            arrayList13.add(bf1Var5);
                            q63 q63VarA30 = q63.a(new bk1(new w63(arrayList13, arrayList14), 19));
                            bf1 bf1Var6 = new bf1(q63.a(new vg1(ti1Var, if1Var.I, 2)), 22);
                            ArrayList arrayList15 = new ArrayList(1);
                            new ArrayList(1).add(hf1Var2.E);
                            arrayList15.add(bf1Var6);
                            q63 q63VarA31 = q63.a(new eh1(q63VarA9, (v63) if1Var.c, 10));
                            ArrayList arrayList16 = new ArrayList(1);
                            ArrayList arrayList17 = new ArrayList(1);
                            arrayList17.add(hf1Var2.F);
                            arrayList16.add(q63VarA31);
                            q63 q63VarA32 = q63.a(new bk1(new w63(arrayList16, arrayList17), 20));
                            int i12 = 8;
                            q63 q63VarA33 = q63.a(new hj1(q63VarA6, i12));
                            bf1 bf1Var7 = new bf1(q63VarA19, 27);
                            ArrayList arrayList18 = new ArrayList(7);
                            ArrayList arrayList19 = new ArrayList(4);
                            arrayList18.add(hf1Var2.G);
                            arrayList19.add(hf1Var2.H);
                            arrayList18.add(hf1Var2.I);
                            arrayList18.add(hf1Var2.J);
                            arrayList19.add(hf1Var2.K);
                            arrayList19.add(hf1Var2.L);
                            arrayList19.add(hf1Var2.M);
                            arrayList18.add(hf1Var2.N);
                            arrayList18.add(hf1Var2.O);
                            arrayList18.add(q63VarA33);
                            arrayList18.add(bf1Var7);
                            q63 q63VarA34 = q63.a(new bk1(new w63(arrayList18, arrayList19), 5));
                            hj1 hj1Var3 = new hj1(q63.a(new bf1(q63VarA20, 11)), 1);
                            q63 q63VarA35 = q63.a(new eh1(q63VarA9, (v63) if1Var.c, i12));
                            ArrayList arrayList20 = new ArrayList(2);
                            ArrayList arrayList21 = new ArrayList(1);
                            arrayList21.add(hf1Var2.Q);
                            arrayList20.add(hj1Var3);
                            arrayList20.add(q63VarA35);
                            q63 q63VarA36 = q63.a(new bk1(new w63(arrayList20, arrayList21), 9));
                            List list = Collections.EMPTY_LIST;
                            new ArrayList(1).add(hf1Var2.R);
                            q63 q63VarA37 = q63.a(new hj1(q63VarA21, 4));
                            ArrayList arrayList22 = new ArrayList(1);
                            List list2 = Collections.EMPTY_LIST;
                            arrayList22.add(q63VarA37);
                            q63 q63VarA38 = q63.a(new eh1(q63VarA9, (v63) if1Var.c, 5));
                            bf1 bf1Var8 = new bf1(q63VarA19, 25);
                            ArrayList arrayList23 = new ArrayList(2);
                            new ArrayList(1).add(hf1Var2.S);
                            arrayList23.add(q63VarA38);
                            arrayList23.add(bf1Var8);
                            q63 q63VarA39 = q63.a(new hj1(q63VarA21, 0));
                            ArrayList arrayList24 = new ArrayList(1);
                            List list3 = Collections.EMPTY_LIST;
                            arrayList24.add(q63VarA39);
                            ti1 ti1Var4 = new ti1(p83Var2, 1);
                            u91 u91Var = new u91(ti1Var, ti1Var4, hf1Var2.h, ti1Var3, hf1Var2.f, 4);
                            ArrayList arrayList25 = new ArrayList(1);
                            ArrayList arrayList26 = new ArrayList(1);
                            arrayList26.add(hf1Var2.U);
                            arrayList25.add(hf1Var2.V);
                            wi1 wi1Var = new wi1(ti1Var2, ti1Var, q63VarA8, q63VarA34, hf1Var2.T, u91Var, q63VarA9, new bk1(new w63(arrayList25, arrayList26), 6), q63VarA30, q63VarA18, if1Var.n0);
                            do1 do1Var2 = new do1(u40Var, 1);
                            q63 q63VarA40 = q63.a(new fp1(do1Var2, if1Var.f));
                            q63 q63VarA41 = q63.a(new re1(q63VarA4, q63VarA2, 6));
                            List list4 = Collections.EMPTY_LIST;
                            ArrayList arrayList27 = new ArrayList(2);
                            arrayList27.add(hf1Var2.W);
                            arrayList27.add(q63VarA41);
                            w63 w63Var = new w63(list4, arrayList27);
                            q63 q63Var3 = hf1Var2.g;
                            q63 q63VarA42 = q63.a(new i91(q63Var3, w63Var, ti1Var, 6));
                            q63 q63VarA43 = q63.a(new do1(u40Var, 2));
                            q63 q63VarA44 = q63.a(new do1(u40Var, 3));
                            wn1 wn1Var = hf1Var2.i;
                            q63 q63Var4 = if1Var.E;
                            ef1 ef1Var2 = if1Var.h;
                            yj1 yj1Var = hf1Var2.d;
                            q63 q63Var5 = if1Var.f;
                            eo1 eo1Var3 = new eo1(q63.a(new co1(q63Var3, wn1Var, do1Var, do1Var2, tz0Var, q63Var4, q63VarA29, q63VarA25, q63VarA32, ti1Var, ef1Var2, yj1Var, q63VarA4, q63VarA40, q63Var5, q63VarA42, if1Var.I, hf1Var2.e, if1Var.J, q63VarA12, if1Var.L0, q63VarA17, q63VarA43, q63VarA44, q63VarA18)), 0);
                            q63 q63VarA45 = q63.a(new eg1(ef1Var2, 14));
                            q63 q63Var6 = if1Var.c;
                            q63 q63VarA46 = q63.a(new fo1(q63VarA45, q63Var6, q63Var3, q63Var5, 0));
                            q63 q63Var7 = hf1Var2.m;
                            dy0 dy0Var = new dy0((v63) q63Var7, (r63) do1Var2, q63VarA46, (v63) eo1Var3, 6);
                            fp1 fp1Var = new fp1(q63Var7, do1Var2);
                            q63 q63VarA47 = q63.a(new tz0(13, new ho1(tz0Var, 0)));
                            bp1 bp1Var = new bp1(if1Var.X, yj1Var, hj1Var, tz0Var, dy0Var, fp1Var, q63Var6, q63VarA47);
                            q12 q12Var = new q12();
                            q63 q63VarA48 = q63.a(new mq1(ti1Var4, q12Var, tz0Var, 1));
                            q63 q63VarA49 = q63.a(new mq1(ti1Var4, q12Var, tz0Var, 0));
                            q63 q63VarA50 = q63.a(new dy0((v63) ti1Var4, (v63) q12Var, (v63) tz0Var, (v63) if1Var.j, 8));
                            q63 q63VarA51 = q63.a(new da1(q12Var, tz0Var, 17));
                            xe1 xe1Var2 = if1Var.g;
                            q63 q63VarA52 = q63.a(new dy0(xe1Var2, tz0Var, bp1Var, q12Var, 7));
                            q12.a(q12Var, q63.a(new oo1(wi1Var, q63Var6, tz0Var, eo1Var3, bp1Var, hj1Var, wn1Var, q63VarA48, q63VarA49, q63VarA50, q63VarA51, q63VarA52, new xo1(xe1Var2, yj1Var, 0), q63Var4, ef1Var2, xe1Var2, q63VarA47, q63VarA16, if1Var.M0)));
                            q63 q63Var8 = hf1Var2.X;
                            q63 q63Var9 = hf1Var2.P;
                            q63 q63VarA53 = q63.a(new bp1(q63VarA25, q63VarA20, q63Var8, q63VarA36, q63Var9, ti1Var, ti1Var3, q63VarA13));
                            q63 q63VarA54 = q63.a(new iq1((v63) if1Var.c, q63VarA46, q63.a(new vg1(hf1Var2.g, ti1Var, 3)), q63VarA13, 0));
                            q63 q63VarA55 = q63.a(new th1(q63VarA25, q63VarA20, q63Var8, q63VarA36, q63Var9, q63VarA32, if1Var.j, if1Var.I, if1Var.G, q63VarA13));
                            if (((Boolean) tu0Var2.c.a(ix0Var2)).booleanValue()) {
                                vc3.C.k.getClass();
                                long jCurrentTimeMillis = System.currentTimeMillis();
                                vx1Var = vx1Var2;
                                cs1 cs1Var3 = vx1Var.f;
                                cs1Var3.e.putLong("rendering-ad-component-creation-end", jCurrentTimeMillis);
                                cs1Var3.e.putLong("rendering-configure-webview-start", jCurrentTimeMillis);
                            } else {
                                vx1Var = vx1Var2;
                            }
                            wo1 wo1Var = (wo1) hf1Var2.a.g;
                            dq.D(wo1Var);
                            dq.D(ro1Var);
                            dq.D(uq1Var);
                            n31 n31Var = new n31(wo1Var, ro1Var, uq1Var, q63.b(q63VarA52));
                            if (((r01) n31Var.g) != null) {
                                ((uq1) n31Var.h).b("/nativeAdCustomClick", n31Var);
                            }
                            sq1 sq1Var = (sq1) q63VarA53.c();
                            ok1 ok1Var = sq1Var.b;
                            qq1 qq1Var = uq1Var.a;
                            Objects.requireNonNull(ok1Var);
                            rq1 rq1Var = new rq1(0, ok1Var);
                            ak1 ak1Var = sq1Var.a;
                            ?? r12 = sq1Var.c;
                            gl1 gl1Var = sq1Var.d;
                            zl1 zl1Var = sq1Var.e;
                            synchronized (qq1Var) {
                                qq1Var.f = ak1Var;
                                qq1Var.g = r12;
                                qq1Var.h = gl1Var;
                                qq1Var.i = zl1Var;
                                qq1Var.j = rq1Var;
                            }
                            x42 x42Var3 = sq1Var.f;
                            z42 z42Var4 = sq1Var.g;
                            sg1 sg1Var = sq1Var.h;
                            synchronized (uq1Var) {
                                try {
                                    try {
                                        qm2 qm2Var = uq1Var.m;
                                        if (qm2Var == null) {
                                            i9 = 0;
                                            r8 = 0;
                                        } else {
                                            i9 = 0;
                                            r8 = 0;
                                            qm2Var.a(new in2(qm2Var, 0, new u40(uq1Var, x42Var3, z42Var4, sg1Var, 11)), uq1Var.e);
                                        }
                                    } catch (Throwable th) {
                                        th = th;
                                        r12 = uq1Var;
                                        throw th;
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                }
                            }
                            final gq1 gq1Var = (gq1) q63VarA54.c();
                            md1 md1VarH = r11.h();
                            if (md1VarH == null) {
                                gq1Var.getClass();
                            } else {
                                xm1 xm1Var = gq1Var.c;
                                xm1Var.R1(md1VarH.p0());
                                eq1 eq1Var = new eq1(md1VarH, 1);
                                Executor executor4 = gq1Var.a;
                                xm1Var.I1(eq1Var, executor4);
                                xm1Var.I1(new eq1(md1VarH, i9), executor4);
                                kh1 kh1Var = gq1Var.b;
                                xm1Var.I1(kh1Var, executor4);
                                kh1Var.f = md1VarH;
                                ?? E0 = md1VarH.e0();
                                if (((Boolean) tu0Var2.c.a(lx0.Ua)).booleanValue() && E0 != 0) {
                                    sg1 sg1Var2 = gq1Var.d;
                                    E0.d("/click");
                                    zm1 zm1Var = E0.p;
                                    m11 m11Var = u11.a;
                                    E0.b("/click", new s11(zm1Var, i9, sg1Var2));
                                    E0.R(sg1Var2, r8, r8);
                                }
                                md1VarH.t0("/trackActiveViewUnit", new v11() { // from class: fq1
                                    @Override // defpackage.v11
                                    public final void f(Object obj, Map map) {
                                        int i13 = i9;
                                        gq1 gq1Var2 = gq1Var;
                                        switch (i13) {
                                            case 0:
                                                kh1 kh1Var2 = gq1Var2.b;
                                                kh1Var2.j = true;
                                                kh1Var2.a();
                                                break;
                                            default:
                                                gq1Var2.b.j = false;
                                                break;
                                        }
                                    }
                                });
                                final int i13 = 1;
                                md1VarH.t0("/untrackActiveViewUnit", new v11() { // from class: fq1
                                    @Override // defpackage.v11
                                    public final void f(Object obj, Map map) {
                                        int i14 = i13;
                                        gq1 gq1Var2 = gq1Var;
                                        switch (i14) {
                                            case 0:
                                                kh1 kh1Var2 = gq1Var2.b;
                                                kh1Var2.j = true;
                                                kh1Var2.a();
                                                break;
                                            default:
                                                gq1Var2.b.j = false;
                                                break;
                                        }
                                    }
                                });
                            }
                            wq1 wq1Var = (wq1) q63VarA55.c();
                            xq1 xq1Var = vx1Var.e;
                            md1 md1VarI = ro1Var.i();
                            wq1Var.getClass();
                            vq1 vq1Var = xq1Var.a;
                            ok1 ok1Var2 = wq1Var.b;
                            Objects.requireNonNull(ok1Var2);
                            rq1 rq1Var2 = new rq1(1, ok1Var2);
                            ak1 ak1Var2 = wq1Var.a;
                            bl1 bl1Var = wq1Var.c;
                            gl1 gl1Var2 = wq1Var.d;
                            zl1 zl1Var2 = wq1Var.e;
                            ym1 ym1Var = wq1Var.f;
                            synchronized (vq1Var) {
                                synchronized (vq1Var) {
                                    vq1Var.f = ak1Var2;
                                    vq1Var.g = bl1Var;
                                    vq1Var.h = gl1Var2;
                                    vq1Var.i = zl1Var2;
                                    vq1Var.j = rq1Var2;
                                }
                                if (((Boolean) tu0Var2.c.a(lx0.Va)).booleanValue() && md1VarI != null && md1VarI.e0() != null) {
                                    he1 he1VarE3 = md1VarI.e0();
                                    sg1 sg1Var6 = wq1Var.j;
                                    bw1 bw1Var4 = wq1Var.i;
                                    he1VarE3.P(sg1Var6, bw1Var4, wq1Var.h);
                                    he1VarE3.R(sg1Var6, bw1Var4, wq1Var.g);
                                }
                                if (((Boolean) tu0Var2.c.a(ix0Var2)).booleanValue()) {
                                    ec.q(vc3.C.k, vx1Var.f.e, "rendering-configure-webview-end");
                                }
                                return (no1) q12Var.c();
                            }
                            vq1Var.k = ym1Var;
                            if (((Boolean) tu0Var2.c.a(lx0.Va)).booleanValue()) {
                                he1 he1VarE4 = md1VarI.e0();
                                sg1 sg1Var7 = wq1Var.j;
                                bw1 bw1Var5 = wq1Var.i;
                                he1VarE4.P(sg1Var7, bw1Var5, wq1Var.h);
                                he1VarE4.R(sg1Var7, bw1Var5, wq1Var.g);
                            }
                            if (((Boolean) tu0Var2.c.a(ix0Var2)).booleanValue()) {
                                ec.q(vc3.C.k, vx1Var.f.e, "rendering-configure-webview-end");
                            }
                            return (no1) q12Var.c();
                        }
                    };
                    bn2 bn2Var8 = new bn2(qk2VarN4, true, false);
                    bn2Var8.u = new an2(bn2Var8, callable8, this.b);
                    bn2Var8.v();
                    return bn2Var8;
                }
                if (!z) {
                    jn.T("Required field 'vast_xml' or 'html' is missing");
                    hpVarD = kn2.g;
                }
                pm2VarL = aq1Var.d(jSONObjectOptJSONObject6, x42Var, z42Var2, vs0Var2, d91Var2);
                hpVarD = na1.J(na1.K(pm2VarL, ((Integer) kx0Var2.a(lx0.g4)).intValue(), TimeUnit.SECONDS, aq1Var.k), Exception.class, new kg0(2), za1.g);
                aq1Var2 = aq1Var;
                vs0Var3 = vs0Var2;
                y91Var4.H(58, hpVarD);
                if (((Boolean) kx0Var2.a(lx0.Nd)).booleanValue()) {
                    hpVar5 = hpVar4;
                    cs1Var = cs1Var2;
                    hpVarT = na1.t(new Bundle());
                } else {
                    hpVar5 = hpVar4;
                    cs1Var = cs1Var2;
                    hpVarT = na1.t(new Bundle());
                }
                final hp hpVar11113 = hpVarT;
                p83Var = (p83) y91Var4.i;
                executor = (Executor) p83Var.g;
                jSONArrayOptJSONArray2 = jSONObject.optJSONArray("custom_assets");
                if (jSONArrayOptJSONArray2 == null) {
                    hpVarM = na1.t(Collections.EMPTY_LIST);
                    hpVarD = hpVarD;
                    hpVar6 = hpVarB;
                } else {
                    if (((Boolean) tu0.e.c.a(lx0.t2)).booleanValue()) {
                        ec.q(vc3.C.k, ((cs1) p83Var.i).e, "native-assets-loading-custom-start");
                    }
                    arrayList = new ArrayList();
                    length = jSONArrayOptJSONArray2.length();
                    i2 = 0;
                    while (i2 < length) {
                        int i9 = length;
                        jSONObjectOptJSONObject4 = jSONArrayOptJSONArray2.optJSONObject(i2);
                        if (jSONObjectOptJSONObject4 == null) {
                            futureM = kn2.g;
                            jSONArray = jSONArrayOptJSONArray2;
                        } else {
                            jSONArray = jSONArrayOptJSONArray2;
                            strOptString = jSONObjectOptJSONObject4.optString("name");
                            if (strOptString == null) {
                                futureM = kn2.g;
                            } else {
                                i3 = i2;
                                strOptString2 = jSONObjectOptJSONObject4.optString("type");
                                hpVarB = hpVarB;
                                if ("string".equals(strOptString2)) {
                                    futureM = na1.t(new dq1(strOptString, jSONObjectOptJSONObject4.optString("string_value")));
                                    p83Var = p83Var;
                                } else if ("image".equals(strOptString2)) {
                                    aq1 aq1Var8 = (aq1) p83Var.h;
                                    p83Var = p83Var;
                                    futureM = na1.M(aq1Var8.b(jSONObjectOptJSONObject4.optJSONObject("image_value"), aq1Var8.h.g, 0), new r11(strOptString, 2), executor);
                                } else {
                                    p83Var = p83Var;
                                    futureM = kn2.g;
                                }
                            }
                            arrayList.add(futureM);
                            i2 = i3 + 1;
                            length = i9;
                            jSONArrayOptJSONArray2 = jSONArray;
                            hpVarB = hpVarB;
                            p83Var = p83Var;
                        }
                        i3 = i2;
                        arrayList.add(futureM);
                        i2 = i3 + 1;
                        length = i9;
                        jSONArrayOptJSONArray2 = jSONArray;
                        hpVarB = hpVarB;
                        p83Var = p83Var;
                    }
                    hpVar6 = hpVarB;
                    hpVarM = na1.M(new ym2(vj2.m(arrayList), true), lh0.l, executor);
                }
                final hp hpVar11114 = hpVarM;
                y91Var4.H(63, hpVar11114);
                if (jSONObject.optBoolean("enable_omid")) {
                    hpVarL2 = kn2.g;
                } else {
                    strOptString3 = jSONObjectOptJSONObject5.optString("omid_html");
                    if (TextUtils.isEmpty(strOptString3)) {
                        hpVarL2 = kn2.g;
                    } else {
                        if (((Boolean) tu0.e.c.a(lx0.t2)).booleanValue()) {
                            ec.q(vc3.C.k, cs1Var.e, "native-assets-loading-omid-start");
                        }
                        hpVarL2 = na1.L(kn2.g, new c41(aq1Var2, strOptString3, d91Var2, vs0Var3), za1.f);
                    }
                }
                y91Var4.H(65, hpVarL2);
                arrayList2 = new ArrayList();
                final hp hpVar11115 = hpVar;
                arrayList2.add(hpVar11115);
                arrayList2.add(hpVarA);
                arrayList2.add(hpVar2);
                final hp hpVar11116 = hpVar6;
                arrayList2.add(hpVar11116);
                final hp hpVar11117 = hpVar3;
                arrayList2.add(hpVar11117);
                final hp hpVar11118 = hpVar5;
                arrayList2.add(hpVar11118);
                final hp hpVar11119 = hpVarD;
                arrayList2.add(hpVar11119);
                arrayList2.add(hpVar11113);
                arrayList2.add(hpVar11114);
                if (((Boolean) tu0.e.c.a(lx0.N5)).booleanValue()) {
                    arrayList2.add(hpVarL2);
                } else {
                    arrayList2.add(hpVarL2);
                }
                vj2 vj2VarM5 = vj2.m(arrayList2);
                final d91 d91Var10 = d91Var2;
                final hp hpVar111110 = hpVarL2;
                final hp hpVar111111 = hpVar2;
                Callable callable9 = new Callable() { // from class: vp1
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        JSONArray jSONArrayOptJSONArray5;
                        List listM;
                        JSONObject jSONObjectOptJSONObject10;
                        y91 y91Var5 = y91Var4;
                        hp hpVar111112 = hpVar11115;
                        hp hpVar111113 = hpVarA;
                        hp hpVar111114 = hpVar11117;
                        hp hpVar111115 = hpVar11116;
                        hp hpVar20 = hpVar11118;
                        JSONObject jSONObject2 = jSONObject;
                        hp hpVar21 = hpVar11119;
                        hp hpVar22 = hpVar11113;
                        hp hpVar23 = hpVar111111;
                        hp hpVar24 = hpVar111110;
                        hp hpVar25 = hpVar11114;
                        if (((Boolean) tu0.e.c.a(lx0.o2)).booleanValue()) {
                            ec.q(vc3.C.k, ((cs1) y91Var5.j).e, "rendering-native-assets-loading-end");
                        }
                        ro1 ro1Var = (ro1) hpVar111112.get();
                        List list = (List) hpVar111113.get();
                        synchronized (ro1Var) {
                            ro1Var.e = list;
                        }
                        a01 a01Var = (a01) hpVar111114.get();
                        synchronized (ro1Var) {
                            ro1Var.s = a01Var;
                        }
                        a01 a01Var2 = (a01) hpVar111115.get();
                        synchronized (ro1Var) {
                            ro1Var.t = a01Var2;
                        }
                        wz0 wz0Var = (wz0) hpVar20.get();
                        synchronized (ro1Var) {
                            ro1Var.c = wz0Var;
                        }
                        JSONObject jSONObjectOptJSONObject11 = jSONObject2.optJSONObject("mute");
                        if (jSONObjectOptJSONObject11 == null || (jSONArrayOptJSONArray5 = jSONObjectOptJSONObject11.optJSONArray("reasons")) == null || jSONArrayOptJSONArray5.length() <= 0) {
                            tj2 tj2Var = vj2.g;
                            listM = qk2.j;
                        } else {
                            ArrayList arrayList3 = new ArrayList();
                            for (int i10 = 0; i10 < jSONArrayOptJSONArray5.length(); i10++) {
                                y22 y22VarE = aq1.e(jSONArrayOptJSONArray5.optJSONObject(i10));
                                if (y22VarE != null) {
                                    arrayList3.add(y22VarE);
                                }
                            }
                            listM = vj2.m(arrayList3);
                        }
                        synchronized (ro1Var) {
                            ro1Var.f = listM;
                        }
                        JSONObject jSONObjectOptJSONObject12 = jSONObject2.optJSONObject("mute");
                        y22 y22VarE2 = (jSONObjectOptJSONObject12 == null || (jSONObjectOptJSONObject10 = jSONObjectOptJSONObject12.optJSONObject("default_reason")) == null) ? null : aq1.e(jSONObjectOptJSONObject10);
                        synchronized (ro1Var) {
                            ro1Var.g = y22VarE2;
                        }
                        md1 md1Var = (md1) hpVar21.get();
                        if (md1Var != null) {
                            synchronized (ro1Var) {
                                ro1Var.i = md1Var;
                            }
                            View viewP0 = md1Var.p0();
                            synchronized (ro1Var) {
                                ro1Var.o = viewP0;
                            }
                            fe1 fe1VarF = md1Var.f();
                            synchronized (ro1Var) {
                                ro1Var.b = fe1VarF;
                            }
                        }
                        ro1Var.d().putAll((Bundle) hpVar22.get());
                        md1 md1Var2 = (md1) hpVar23.get();
                        if (md1Var2 != null) {
                            synchronized (ro1Var) {
                                ro1Var.j = md1Var2;
                            }
                            View viewP1 = md1Var2.p0();
                            synchronized (ro1Var) {
                                ro1Var.p = viewP1;
                            }
                        }
                        if (!((Boolean) tu0.e.c.a(lx0.N5)).booleanValue() || jSONObject2.optInt("template_id") == 3) {
                            md1 md1Var3 = (md1) hpVar24.get();
                            if (md1Var3 != null) {
                                synchronized (ro1Var) {
                                    ro1Var.k = md1Var3;
                                }
                            }
                        } else {
                            synchronized (ro1Var) {
                                ro1Var.m = hpVar24;
                            }
                            cb1 cb1Var2 = new cb1();
                            synchronized (ro1Var) {
                                ro1Var.n = cb1Var2;
                            }
                        }
                        for (dq1 dq1Var : (List) hpVar25.get()) {
                            int i11 = dq1Var.a;
                            String str3 = dq1Var.b;
                            if (i11 != 1) {
                                oz0 oz0Var = dq1Var.d;
                                synchronized (ro1Var) {
                                    q00 q00Var = ro1Var.v;
                                    if (oz0Var == null) {
                                        q00Var.remove(str3);
                                    } else {
                                        q00Var.put(str3, oz0Var);
                                    }
                                }
                            } else {
                                ro1Var.o(str3, dq1Var.c);
                            }
                        }
                        return ro1Var;
                    }
                };
                final bn2 bn2Var9 = new bn2(vj2VarM5, false, false);
                bn2Var9.u = new an2(bn2Var9, callable9, ya1Var);
                bn2Var9.v();
                qk2 qk2VarN5 = vj2.n(new hp[]{hpVarB3, bn2Var9});
                final vs0 vs0Var9 = vs0Var3;
                Callable callable10 = new Callable() { // from class: ux1
                    /* JADX WARN: Code duplicated, block: B:51:0x0913  */
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r12v14, types: [bl1, j11] */
                    /* JADX WARN: Type inference failed for: r12v15 */
                    /* JADX WARN: Type inference failed for: r12v16 */
                    /* JADX WARN: Type inference failed for: r8v2 */
                    /* JADX WARN: Type inference failed for: r8v3, types: [bw1, es1] */
                    /* JADX WARN: Type inference failed for: r8v7 */
                    /* JADX WARN: Type inference failed for: r9v6, types: [he1] */
                    @Override // java.util.concurrent.Callable
                    public final Object call() throws Throwable {
                        vx1 vx1Var;
                        final int i10;
                        ?? r8;
                        vx1 vx1Var2 = this.a;
                        bn2 bn2Var10 = bn2Var9;
                        hp hpVar111112 = hpVarB3;
                        e52 e52Var2 = e52Var;
                        x42 x42Var2 = x42Var;
                        JSONObject jSONObject2 = jSONObject;
                        vs0 vs0Var10 = vs0Var9;
                        d91 d91Var11 = d91Var10;
                        ro1 ro1Var = (ro1) bn2Var10.get();
                        uq1 uq1Var = (uq1) hpVar111112.get();
                        ix0 ix0Var2 = lx0.p2;
                        tu0 tu0Var2 = tu0.e;
                        if (((Boolean) tu0Var2.c.a(ix0Var2)).booleanValue()) {
                            ec.q(vc3.C.k, vx1Var2.f.e, "rendering-webview-creation-end");
                        }
                        hf1 hf1Var = vx1Var2.a;
                        p83 p83Var2 = new p83(e52Var2, x42Var2, (String) null);
                        kc2 kc2Var = new kc2(23, ro1Var);
                        u40 u40Var = new u40(jSONObject2, uq1Var, vs0Var10, d91Var11, 10, false);
                        if1 if1Var = hf1Var.b;
                        hf1 hf1Var2 = hf1Var.c;
                        q63 q63VarA = q63.a(new eg1(if1Var.G0, 9));
                        ti1 ti1Var = new ti1(p83Var2, 0);
                        do1 do1Var = new do1(u40Var, 0);
                        hj1 hj1Var = new hj1(q63.a(new da1(ti1Var, do1Var, 14)), 29);
                        q63 q63VarA2 = q63.a(new tz0(12, hj1Var));
                        ef1 ef1Var = if1Var.h;
                        xn1 xn1Var = yd.l;
                        q63 q63VarA3 = q63.a(new i91(ef1Var, q63VarA2, xn1Var, 1));
                        q63 q63VarA4 = q63.a(new jh1(q63VarA, q63.a(new eh1(if1Var.g, q63VarA3, 0)), if1Var.c, q63.a(new re1(q63VarA3, q63VarA, 3)), if1Var.f));
                        q63 q63VarA5 = q63.a(new re1(q63VarA4, q63VarA2, 5));
                        q63 q63VarA6 = q63.a(new vg1(hf1Var2.g, ti1Var, 1));
                        q63 q63VarA7 = q63.a(new hj1(q63VarA6, 7));
                        int i11 = w63.c;
                        ArrayList arrayList3 = new ArrayList(1);
                        ArrayList arrayList4 = new ArrayList(3);
                        arrayList4.add(hf1Var2.o);
                        arrayList4.add(hf1Var2.p);
                        arrayList4.add(q63VarA5);
                        arrayList3.add(q63VarA7);
                        q63 q63VarA8 = q63.a(new bk1(new w63(arrayList3, arrayList4), 3));
                        q63 q63VarA9 = q63.a(v51.j);
                        q63 q63Var = if1Var.c;
                        q63 q63VarA10 = q63.a(new eh1(q63VarA9, (v63) q63Var, 4));
                        ti1 ti1Var2 = new ti1(p83Var2, 3);
                        ti1 ti1Var3 = new ti1(p83Var2, 2);
                        xe1 xe1Var = if1Var.g;
                        q63 q63VarA11 = q63.a(new eg1(xe1Var, 20));
                        q63 q63VarA12 = q63.a(ar.j);
                        q63 q63VarA13 = q63.a(new tg1(xe1Var, if1Var.X, q63VarA11, q63VarA12, if1Var.D0, if1Var.d));
                        q63 q63VarA14 = q63.a(new yn1(if1Var.I, if1Var.H, ti1Var, ti1Var3, q63VarA13, hf1Var2.e));
                        xn1 xn1Var2 = new xn1(4);
                        xn1 xn1Var3 = new xn1(2);
                        q63 q63VarA15 = q63.a(new eh1(q63VarA9, (v63) q63Var, 9));
                        q63 q63VarA16 = q63.a(hn.p);
                        eo1 eo1Var = new eo1(q63VarA16, 2);
                        ArrayList arrayList5 = new ArrayList(2);
                        ArrayList arrayList6 = new ArrayList(1);
                        arrayList6.add(hf1Var2.u);
                        arrayList5.add(q63VarA15);
                        arrayList5.add(eo1Var);
                        q63 q63VarA17 = q63.a(new i91(new w63(arrayList5, arrayList6), ti1Var, ti1Var2, 5));
                        q63 q63VarA18 = q63.a(new tz0(9, ti1Var2));
                        q63 q63VarA19 = q63.a(new ah1(if1Var.g, if1Var.c, if1Var.d, ti1Var2, ti1Var, hf1Var2.k, q63VarA14, xn1Var2, xn1Var3, if1Var.E, hf1Var2.l, hf1Var2.e, hf1Var2.t, q63VarA17, q63VarA18));
                        bf1 bf1Var = new bf1(q63VarA19, 24);
                        hj1 hj1Var2 = new hj1(q63.a(new vg1(ti1Var, if1Var.V, 0)), 11);
                        ArrayList arrayList7 = new ArrayList(4);
                        ArrayList arrayList8 = new ArrayList(2);
                        arrayList7.add(hf1Var2.q);
                        arrayList8.add(hf1Var2.r);
                        arrayList8.add(hf1Var2.s);
                        arrayList7.add(q63VarA10);
                        arrayList7.add(bf1Var);
                        arrayList7.add(hj1Var2);
                        q63 q63VarA20 = q63.a(new bk1(new w63(arrayList7, arrayList8), 4));
                        q63 q63VarA21 = q63.a(new jj1(if1Var.g, if1Var.C0, if1Var.j, ti1Var2, ti1Var, if1Var.G, xn1Var));
                        q63 q63VarA22 = q63.a(new hj1(q63VarA21, 5));
                        q63 q63VarA23 = q63.a(new eh1(q63VarA9, (v63) if1Var.c, 3));
                        q63 q63VarA24 = q63.a(new hj1(q63.a(new zh1(if1Var.y0, hf1Var2.d, 1)), 3));
                        bf1 bf1Var2 = new bf1(q63VarA19, 23);
                        ArrayList arrayList9 = new ArrayList(5);
                        ArrayList arrayList10 = new ArrayList(3);
                        arrayList9.add(hf1Var2.v);
                        arrayList9.add(hf1Var2.w);
                        arrayList10.add(hf1Var2.x);
                        arrayList10.add(hf1Var2.y);
                        arrayList9.add(q63VarA22);
                        arrayList9.add(q63VarA23);
                        arrayList10.add(q63VarA24);
                        arrayList9.add(bf1Var2);
                        q63 q63VarA25 = q63.a(new bk1(new w63(arrayList9, arrayList10), 0));
                        q63 q63VarA26 = q63.a(new re1(q63VarA4, q63VarA2, 4));
                        int i12 = 6;
                        q63 q63VarA27 = q63.a(new hj1(q63VarA21, i12));
                        q63 q63Var2 = if1Var.c;
                        q63 q63VarA28 = q63.a(new eh1(q63VarA9, (v63) q63Var2, i12));
                        bf1 bf1Var3 = new bf1(q63VarA17, 12);
                        bf1 bf1Var4 = new bf1(q63VarA19, 26);
                        tz0 tz0Var = new tz0(14, kc2Var);
                        eo1 eo1Var2 = new eo1(q63.a(new i91(tz0Var, hj1Var, q63Var2, 7)), 1);
                        ArrayList arrayList11 = new ArrayList(7);
                        ArrayList arrayList12 = new ArrayList(3);
                        arrayList11.add(hf1Var2.z);
                        arrayList11.add(hf1Var2.A);
                        arrayList12.add(hf1Var2.B);
                        arrayList12.add(hf1Var2.C);
                        arrayList12.add(q63VarA26);
                        arrayList11.add(q63VarA27);
                        arrayList11.add(q63VarA28);
                        arrayList11.add(bf1Var3);
                        arrayList11.add(bf1Var4);
                        arrayList11.add(eo1Var2);
                        q63 q63VarA29 = q63.a(new bk1(new w63(arrayList11, arrayList12), 2));
                        bf1 bf1Var5 = new bf1(q63VarA19, 29);
                        ArrayList arrayList13 = new ArrayList(1);
                        ArrayList arrayList14 = new ArrayList(1);
                        arrayList14.add(hf1Var2.D);
                        arrayList13.add(bf1Var5);
                        q63 q63VarA30 = q63.a(new bk1(new w63(arrayList13, arrayList14), 19));
                        bf1 bf1Var6 = new bf1(q63.a(new vg1(ti1Var, if1Var.I, 2)), 22);
                        ArrayList arrayList15 = new ArrayList(1);
                        new ArrayList(1).add(hf1Var2.E);
                        arrayList15.add(bf1Var6);
                        q63 q63VarA31 = q63.a(new eh1(q63VarA9, (v63) if1Var.c, 10));
                        ArrayList arrayList16 = new ArrayList(1);
                        ArrayList arrayList17 = new ArrayList(1);
                        arrayList17.add(hf1Var2.F);
                        arrayList16.add(q63VarA31);
                        q63 q63VarA32 = q63.a(new bk1(new w63(arrayList16, arrayList17), 20));
                        int i13 = 8;
                        q63 q63VarA33 = q63.a(new hj1(q63VarA6, i13));
                        bf1 bf1Var7 = new bf1(q63VarA19, 27);
                        ArrayList arrayList18 = new ArrayList(7);
                        ArrayList arrayList19 = new ArrayList(4);
                        arrayList18.add(hf1Var2.G);
                        arrayList19.add(hf1Var2.H);
                        arrayList18.add(hf1Var2.I);
                        arrayList18.add(hf1Var2.J);
                        arrayList19.add(hf1Var2.K);
                        arrayList19.add(hf1Var2.L);
                        arrayList19.add(hf1Var2.M);
                        arrayList18.add(hf1Var2.N);
                        arrayList18.add(hf1Var2.O);
                        arrayList18.add(q63VarA33);
                        arrayList18.add(bf1Var7);
                        q63 q63VarA34 = q63.a(new bk1(new w63(arrayList18, arrayList19), 5));
                        hj1 hj1Var3 = new hj1(q63.a(new bf1(q63VarA20, 11)), 1);
                        q63 q63VarA35 = q63.a(new eh1(q63VarA9, (v63) if1Var.c, i13));
                        ArrayList arrayList20 = new ArrayList(2);
                        ArrayList arrayList21 = new ArrayList(1);
                        arrayList21.add(hf1Var2.Q);
                        arrayList20.add(hj1Var3);
                        arrayList20.add(q63VarA35);
                        q63 q63VarA36 = q63.a(new bk1(new w63(arrayList20, arrayList21), 9));
                        List list = Collections.EMPTY_LIST;
                        new ArrayList(1).add(hf1Var2.R);
                        q63 q63VarA37 = q63.a(new hj1(q63VarA21, 4));
                        ArrayList arrayList22 = new ArrayList(1);
                        List list2 = Collections.EMPTY_LIST;
                        arrayList22.add(q63VarA37);
                        q63 q63VarA38 = q63.a(new eh1(q63VarA9, (v63) if1Var.c, 5));
                        bf1 bf1Var8 = new bf1(q63VarA19, 25);
                        ArrayList arrayList23 = new ArrayList(2);
                        new ArrayList(1).add(hf1Var2.S);
                        arrayList23.add(q63VarA38);
                        arrayList23.add(bf1Var8);
                        q63 q63VarA39 = q63.a(new hj1(q63VarA21, 0));
                        ArrayList arrayList24 = new ArrayList(1);
                        List list3 = Collections.EMPTY_LIST;
                        arrayList24.add(q63VarA39);
                        ti1 ti1Var4 = new ti1(p83Var2, 1);
                        u91 u91Var = new u91(ti1Var, ti1Var4, hf1Var2.h, ti1Var3, hf1Var2.f, 4);
                        ArrayList arrayList25 = new ArrayList(1);
                        ArrayList arrayList26 = new ArrayList(1);
                        arrayList26.add(hf1Var2.U);
                        arrayList25.add(hf1Var2.V);
                        wi1 wi1Var = new wi1(ti1Var2, ti1Var, q63VarA8, q63VarA34, hf1Var2.T, u91Var, q63VarA9, new bk1(new w63(arrayList25, arrayList26), 6), q63VarA30, q63VarA18, if1Var.n0);
                        do1 do1Var2 = new do1(u40Var, 1);
                        q63 q63VarA40 = q63.a(new fp1(do1Var2, if1Var.f));
                        q63 q63VarA41 = q63.a(new re1(q63VarA4, q63VarA2, 6));
                        List list4 = Collections.EMPTY_LIST;
                        ArrayList arrayList27 = new ArrayList(2);
                        arrayList27.add(hf1Var2.W);
                        arrayList27.add(q63VarA41);
                        w63 w63Var = new w63(list4, arrayList27);
                        q63 q63Var3 = hf1Var2.g;
                        q63 q63VarA42 = q63.a(new i91(q63Var3, w63Var, ti1Var, 6));
                        q63 q63VarA43 = q63.a(new do1(u40Var, 2));
                        q63 q63VarA44 = q63.a(new do1(u40Var, 3));
                        wn1 wn1Var = hf1Var2.i;
                        q63 q63Var4 = if1Var.E;
                        ef1 ef1Var2 = if1Var.h;
                        yj1 yj1Var = hf1Var2.d;
                        q63 q63Var5 = if1Var.f;
                        eo1 eo1Var3 = new eo1(q63.a(new co1(q63Var3, wn1Var, do1Var, do1Var2, tz0Var, q63Var4, q63VarA29, q63VarA25, q63VarA32, ti1Var, ef1Var2, yj1Var, q63VarA4, q63VarA40, q63Var5, q63VarA42, if1Var.I, hf1Var2.e, if1Var.J, q63VarA12, if1Var.L0, q63VarA17, q63VarA43, q63VarA44, q63VarA18)), 0);
                        q63 q63VarA45 = q63.a(new eg1(ef1Var2, 14));
                        q63 q63Var6 = if1Var.c;
                        q63 q63VarA46 = q63.a(new fo1(q63VarA45, q63Var6, q63Var3, q63Var5, 0));
                        q63 q63Var7 = hf1Var2.m;
                        dy0 dy0Var = new dy0((v63) q63Var7, (r63) do1Var2, q63VarA46, (v63) eo1Var3, 6);
                        fp1 fp1Var = new fp1(q63Var7, do1Var2);
                        q63 q63VarA47 = q63.a(new tz0(13, new ho1(tz0Var, 0)));
                        bp1 bp1Var = new bp1(if1Var.X, yj1Var, hj1Var, tz0Var, dy0Var, fp1Var, q63Var6, q63VarA47);
                        q12 q12Var = new q12();
                        q63 q63VarA48 = q63.a(new mq1(ti1Var4, q12Var, tz0Var, 1));
                        q63 q63VarA49 = q63.a(new mq1(ti1Var4, q12Var, tz0Var, 0));
                        q63 q63VarA50 = q63.a(new dy0((v63) ti1Var4, (v63) q12Var, (v63) tz0Var, (v63) if1Var.j, 8));
                        q63 q63VarA51 = q63.a(new da1(q12Var, tz0Var, 17));
                        xe1 xe1Var2 = if1Var.g;
                        q63 q63VarA52 = q63.a(new dy0(xe1Var2, tz0Var, bp1Var, q12Var, 7));
                        q12.a(q12Var, q63.a(new oo1(wi1Var, q63Var6, tz0Var, eo1Var3, bp1Var, hj1Var, wn1Var, q63VarA48, q63VarA49, q63VarA50, q63VarA51, q63VarA52, new xo1(xe1Var2, yj1Var, 0), q63Var4, ef1Var2, xe1Var2, q63VarA47, q63VarA16, if1Var.M0)));
                        q63 q63Var8 = hf1Var2.X;
                        q63 q63Var9 = hf1Var2.P;
                        q63 q63VarA53 = q63.a(new bp1(q63VarA25, q63VarA20, q63Var8, q63VarA36, q63Var9, ti1Var, ti1Var3, q63VarA13));
                        q63 q63VarA54 = q63.a(new iq1((v63) if1Var.c, q63VarA46, q63.a(new vg1(hf1Var2.g, ti1Var, 3)), q63VarA13, 0));
                        q63 q63VarA55 = q63.a(new th1(q63VarA25, q63VarA20, q63Var8, q63VarA36, q63Var9, q63VarA32, if1Var.j, if1Var.I, if1Var.G, q63VarA13));
                        if (((Boolean) tu0Var2.c.a(ix0Var2)).booleanValue()) {
                            vc3.C.k.getClass();
                            long jCurrentTimeMillis = System.currentTimeMillis();
                            vx1Var = vx1Var2;
                            cs1 cs1Var3 = vx1Var.f;
                            cs1Var3.e.putLong("rendering-ad-component-creation-end", jCurrentTimeMillis);
                            cs1Var3.e.putLong("rendering-configure-webview-start", jCurrentTimeMillis);
                        } else {
                            vx1Var = vx1Var2;
                        }
                        wo1 wo1Var = (wo1) hf1Var2.a.g;
                        dq.D(wo1Var);
                        dq.D(ro1Var);
                        dq.D(uq1Var);
                        n31 n31Var = new n31(wo1Var, ro1Var, uq1Var, q63.b(q63VarA52));
                        if (((r01) n31Var.g) != null) {
                            ((uq1) n31Var.h).b("/nativeAdCustomClick", n31Var);
                        }
                        sq1 sq1Var = (sq1) q63VarA53.c();
                        ok1 ok1Var = sq1Var.b;
                        qq1 qq1Var = uq1Var.a;
                        Objects.requireNonNull(ok1Var);
                        rq1 rq1Var = new rq1(0, ok1Var);
                        ak1 ak1Var = sq1Var.a;
                        ?? r12 = sq1Var.c;
                        gl1 gl1Var = sq1Var.d;
                        zl1 zl1Var = sq1Var.e;
                        synchronized (qq1Var) {
                            qq1Var.f = ak1Var;
                            qq1Var.g = r12;
                            qq1Var.h = gl1Var;
                            qq1Var.i = zl1Var;
                            qq1Var.j = rq1Var;
                        }
                        x42 x42Var3 = sq1Var.f;
                        z42 z42Var4 = sq1Var.g;
                        sg1 sg1Var = sq1Var.h;
                        synchronized (uq1Var) {
                            try {
                                try {
                                    qm2 qm2Var = uq1Var.m;
                                    if (qm2Var == null) {
                                        i10 = 0;
                                        r8 = 0;
                                    } else {
                                        i10 = 0;
                                        r8 = 0;
                                        qm2Var.a(new in2(qm2Var, 0, new u40(uq1Var, x42Var3, z42Var4, sg1Var, 11)), uq1Var.e);
                                    }
                                } catch (Throwable th) {
                                    th = th;
                                    r12 = uq1Var;
                                    throw th;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                            }
                        }
                        final gq1 gq1Var = (gq1) q63VarA54.c();
                        md1 md1VarH = r11.h();
                        if (md1VarH == null) {
                            gq1Var.getClass();
                        } else {
                            xm1 xm1Var = gq1Var.c;
                            xm1Var.R1(md1VarH.p0());
                            eq1 eq1Var = new eq1(md1VarH, 1);
                            Executor executor4 = gq1Var.a;
                            xm1Var.I1(eq1Var, executor4);
                            xm1Var.I1(new eq1(md1VarH, i10), executor4);
                            kh1 kh1Var = gq1Var.b;
                            xm1Var.I1(kh1Var, executor4);
                            kh1Var.f = md1VarH;
                            ?? E0 = md1VarH.e0();
                            if (((Boolean) tu0Var2.c.a(lx0.Ua)).booleanValue() && E0 != 0) {
                                sg1 sg1Var2 = gq1Var.d;
                                E0.d("/click");
                                zm1 zm1Var = E0.p;
                                m11 m11Var = u11.a;
                                E0.b("/click", new s11(zm1Var, i10, sg1Var2));
                                E0.R(sg1Var2, r8, r8);
                            }
                            md1VarH.t0("/trackActiveViewUnit", new v11() { // from class: fq1
                                @Override // defpackage.v11
                                public final void f(Object obj, Map map) {
                                    int i14 = i10;
                                    gq1 gq1Var2 = gq1Var;
                                    switch (i14) {
                                        case 0:
                                            kh1 kh1Var2 = gq1Var2.b;
                                            kh1Var2.j = true;
                                            kh1Var2.a();
                                            break;
                                        default:
                                            gq1Var2.b.j = false;
                                            break;
                                    }
                                }
                            });
                            final int i14 = 1;
                            md1VarH.t0("/untrackActiveViewUnit", new v11() { // from class: fq1
                                @Override // defpackage.v11
                                public final void f(Object obj, Map map) {
                                    int i15 = i14;
                                    gq1 gq1Var2 = gq1Var;
                                    switch (i15) {
                                        case 0:
                                            kh1 kh1Var2 = gq1Var2.b;
                                            kh1Var2.j = true;
                                            kh1Var2.a();
                                            break;
                                        default:
                                            gq1Var2.b.j = false;
                                            break;
                                    }
                                }
                            });
                        }
                        wq1 wq1Var = (wq1) q63VarA55.c();
                        xq1 xq1Var = vx1Var.e;
                        md1 md1VarI = ro1Var.i();
                        wq1Var.getClass();
                        vq1 vq1Var = xq1Var.a;
                        ok1 ok1Var2 = wq1Var.b;
                        Objects.requireNonNull(ok1Var2);
                        rq1 rq1Var2 = new rq1(1, ok1Var2);
                        ak1 ak1Var2 = wq1Var.a;
                        bl1 bl1Var = wq1Var.c;
                        gl1 gl1Var2 = wq1Var.d;
                        zl1 zl1Var2 = wq1Var.e;
                        ym1 ym1Var = wq1Var.f;
                        synchronized (vq1Var) {
                            synchronized (vq1Var) {
                                vq1Var.f = ak1Var2;
                                vq1Var.g = bl1Var;
                                vq1Var.h = gl1Var2;
                                vq1Var.i = zl1Var2;
                                vq1Var.j = rq1Var2;
                            }
                            if (((Boolean) tu0Var2.c.a(lx0.Va)).booleanValue() && md1VarI != null && md1VarI.e0() != null) {
                                he1 he1VarE4 = md1VarI.e0();
                                sg1 sg1Var7 = wq1Var.j;
                                bw1 bw1Var5 = wq1Var.i;
                                he1VarE4.P(sg1Var7, bw1Var5, wq1Var.h);
                                he1VarE4.R(sg1Var7, bw1Var5, wq1Var.g);
                            }
                            if (((Boolean) tu0Var2.c.a(ix0Var2)).booleanValue()) {
                                ec.q(vc3.C.k, vx1Var.f.e, "rendering-configure-webview-end");
                            }
                            return (no1) q12Var.c();
                        }
                        vq1Var.k = ym1Var;
                        if (((Boolean) tu0Var2.c.a(lx0.Va)).booleanValue()) {
                            he1 he1VarE5 = md1VarI.e0();
                            sg1 sg1Var8 = wq1Var.j;
                            bw1 bw1Var6 = wq1Var.i;
                            he1VarE5.P(sg1Var8, bw1Var6, wq1Var.h);
                            he1VarE5.R(sg1Var8, bw1Var6, wq1Var.g);
                        }
                        if (((Boolean) tu0Var2.c.a(ix0Var2)).booleanValue()) {
                            ec.q(vc3.C.k, vx1Var.f.e, "rendering-configure-webview-end");
                        }
                        return (no1) q12Var.c();
                    }
                };
                bn2 bn2Var10 = new bn2(qk2VarN5, true, false);
                bn2Var10.u = new an2(bn2Var10, callable10, this.b);
                bn2Var10.v();
                return bn2Var10;
            }
            hpVarD = kn2.g;
        } else {
            hpVarD = aq1Var.d(jSONObjectOptJSONObject3, x42Var, z42Var2, vs0Var2, d91Var2);
        }
        aq1Var2 = aq1Var;
        vs0Var3 = vs0Var2;
        y91Var4.H(58, hpVarD);
        if (((Boolean) kx0Var2.a(lx0.Nd)).booleanValue()) {
            hpVar5 = hpVar4;
            cs1Var = cs1Var2;
            hpVarT = na1.t(new Bundle());
        } else {
            hpVar5 = hpVar4;
            cs1Var = cs1Var2;
            hpVarT = na1.t(new Bundle());
        }
        final hp hpVar111112 = hpVarT;
        p83Var = (p83) y91Var4.i;
        executor = (Executor) p83Var.g;
        jSONArrayOptJSONArray2 = jSONObject.optJSONArray("custom_assets");
        if (jSONArrayOptJSONArray2 == null) {
            hpVarM = na1.t(Collections.EMPTY_LIST);
            hpVarD = hpVarD;
            hpVar6 = hpVarB;
        } else {
            if (((Boolean) tu0.e.c.a(lx0.t2)).booleanValue()) {
                ec.q(vc3.C.k, ((cs1) p83Var.i).e, "native-assets-loading-custom-start");
            }
            arrayList = new ArrayList();
            length = jSONArrayOptJSONArray2.length();
            i2 = 0;
            while (i2 < length) {
                int i10 = length;
                jSONObjectOptJSONObject4 = jSONArrayOptJSONArray2.optJSONObject(i2);
                if (jSONObjectOptJSONObject4 == null) {
                    futureM = kn2.g;
                    jSONArray = jSONArrayOptJSONArray2;
                } else {
                    jSONArray = jSONArrayOptJSONArray2;
                    strOptString = jSONObjectOptJSONObject4.optString("name");
                    if (strOptString == null) {
                        futureM = kn2.g;
                    } else {
                        i3 = i2;
                        strOptString2 = jSONObjectOptJSONObject4.optString("type");
                        hpVarB = hpVarB;
                        if ("string".equals(strOptString2)) {
                            futureM = na1.t(new dq1(strOptString, jSONObjectOptJSONObject4.optString("string_value")));
                            p83Var = p83Var;
                        } else if ("image".equals(strOptString2)) {
                            aq1 aq1Var9 = (aq1) p83Var.h;
                            p83Var = p83Var;
                            futureM = na1.M(aq1Var9.b(jSONObjectOptJSONObject4.optJSONObject("image_value"), aq1Var9.h.g, 0), new r11(strOptString, 2), executor);
                        } else {
                            p83Var = p83Var;
                            futureM = kn2.g;
                        }
                    }
                    arrayList.add(futureM);
                    i2 = i3 + 1;
                    length = i10;
                    jSONArrayOptJSONArray2 = jSONArray;
                    hpVarB = hpVarB;
                    p83Var = p83Var;
                }
                i3 = i2;
                arrayList.add(futureM);
                i2 = i3 + 1;
                length = i10;
                jSONArrayOptJSONArray2 = jSONArray;
                hpVarB = hpVarB;
                p83Var = p83Var;
            }
            hpVar6 = hpVarB;
            hpVarM = na1.M(new ym2(vj2.m(arrayList), true), lh0.l, executor);
        }
        final hp hpVar111113 = hpVarM;
        y91Var4.H(63, hpVar111113);
        if (jSONObject.optBoolean("enable_omid")) {
            hpVarL2 = kn2.g;
        } else {
            strOptString3 = jSONObjectOptJSONObject5.optString("omid_html");
            if (TextUtils.isEmpty(strOptString3)) {
                hpVarL2 = kn2.g;
            } else {
                if (((Boolean) tu0.e.c.a(lx0.t2)).booleanValue()) {
                    ec.q(vc3.C.k, cs1Var.e, "native-assets-loading-omid-start");
                }
                hpVarL2 = na1.L(kn2.g, new c41(aq1Var2, strOptString3, d91Var2, vs0Var3), za1.f);
            }
        }
        y91Var4.H(65, hpVarL2);
        arrayList2 = new ArrayList();
        final hp hpVar111114 = hpVar;
        arrayList2.add(hpVar111114);
        arrayList2.add(hpVarA);
        arrayList2.add(hpVar2);
        final hp hpVar111115 = hpVar6;
        arrayList2.add(hpVar111115);
        final hp hpVar111116 = hpVar3;
        arrayList2.add(hpVar111116);
        final hp hpVar111117 = hpVar5;
        arrayList2.add(hpVar111117);
        final hp hpVar111118 = hpVarD;
        arrayList2.add(hpVar111118);
        arrayList2.add(hpVar111112);
        arrayList2.add(hpVar111113);
        if (((Boolean) tu0.e.c.a(lx0.N5)).booleanValue()) {
            arrayList2.add(hpVarL2);
        } else {
            arrayList2.add(hpVarL2);
        }
        vj2 vj2VarM6 = vj2.m(arrayList2);
        final d91 d91Var11 = d91Var2;
        final hp hpVar111119 = hpVarL2;
        final hp hpVar1111110 = hpVar2;
        Callable callable11 = new Callable() { // from class: vp1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                JSONArray jSONArrayOptJSONArray5;
                List listM;
                JSONObject jSONObjectOptJSONObject10;
                y91 y91Var5 = y91Var4;
                hp hpVar1111111 = hpVar111114;
                hp hpVar1111112 = hpVarA;
                hp hpVar1111113 = hpVar111116;
                hp hpVar1111114 = hpVar111115;
                hp hpVar20 = hpVar111117;
                JSONObject jSONObject2 = jSONObject;
                hp hpVar21 = hpVar111118;
                hp hpVar22 = hpVar111112;
                hp hpVar23 = hpVar1111110;
                hp hpVar24 = hpVar111119;
                hp hpVar25 = hpVar111113;
                if (((Boolean) tu0.e.c.a(lx0.o2)).booleanValue()) {
                    ec.q(vc3.C.k, ((cs1) y91Var5.j).e, "rendering-native-assets-loading-end");
                }
                ro1 ro1Var = (ro1) hpVar1111111.get();
                List list = (List) hpVar1111112.get();
                synchronized (ro1Var) {
                    ro1Var.e = list;
                }
                a01 a01Var = (a01) hpVar1111113.get();
                synchronized (ro1Var) {
                    ro1Var.s = a01Var;
                }
                a01 a01Var2 = (a01) hpVar1111114.get();
                synchronized (ro1Var) {
                    ro1Var.t = a01Var2;
                }
                wz0 wz0Var = (wz0) hpVar20.get();
                synchronized (ro1Var) {
                    ro1Var.c = wz0Var;
                }
                JSONObject jSONObjectOptJSONObject11 = jSONObject2.optJSONObject("mute");
                if (jSONObjectOptJSONObject11 == null || (jSONArrayOptJSONArray5 = jSONObjectOptJSONObject11.optJSONArray("reasons")) == null || jSONArrayOptJSONArray5.length() <= 0) {
                    tj2 tj2Var = vj2.g;
                    listM = qk2.j;
                } else {
                    ArrayList arrayList3 = new ArrayList();
                    for (int i11 = 0; i11 < jSONArrayOptJSONArray5.length(); i11++) {
                        y22 y22VarE = aq1.e(jSONArrayOptJSONArray5.optJSONObject(i11));
                        if (y22VarE != null) {
                            arrayList3.add(y22VarE);
                        }
                    }
                    listM = vj2.m(arrayList3);
                }
                synchronized (ro1Var) {
                    ro1Var.f = listM;
                }
                JSONObject jSONObjectOptJSONObject12 = jSONObject2.optJSONObject("mute");
                y22 y22VarE2 = (jSONObjectOptJSONObject12 == null || (jSONObjectOptJSONObject10 = jSONObjectOptJSONObject12.optJSONObject("default_reason")) == null) ? null : aq1.e(jSONObjectOptJSONObject10);
                synchronized (ro1Var) {
                    ro1Var.g = y22VarE2;
                }
                md1 md1Var = (md1) hpVar21.get();
                if (md1Var != null) {
                    synchronized (ro1Var) {
                        ro1Var.i = md1Var;
                    }
                    View viewP0 = md1Var.p0();
                    synchronized (ro1Var) {
                        ro1Var.o = viewP0;
                    }
                    fe1 fe1VarF = md1Var.f();
                    synchronized (ro1Var) {
                        ro1Var.b = fe1VarF;
                    }
                }
                ro1Var.d().putAll((Bundle) hpVar22.get());
                md1 md1Var2 = (md1) hpVar23.get();
                if (md1Var2 != null) {
                    synchronized (ro1Var) {
                        ro1Var.j = md1Var2;
                    }
                    View viewP1 = md1Var2.p0();
                    synchronized (ro1Var) {
                        ro1Var.p = viewP1;
                    }
                }
                if (!((Boolean) tu0.e.c.a(lx0.N5)).booleanValue() || jSONObject2.optInt("template_id") == 3) {
                    md1 md1Var3 = (md1) hpVar24.get();
                    if (md1Var3 != null) {
                        synchronized (ro1Var) {
                            ro1Var.k = md1Var3;
                        }
                    }
                } else {
                    synchronized (ro1Var) {
                        ro1Var.m = hpVar24;
                    }
                    cb1 cb1Var2 = new cb1();
                    synchronized (ro1Var) {
                        ro1Var.n = cb1Var2;
                    }
                }
                for (dq1 dq1Var : (List) hpVar25.get()) {
                    int i12 = dq1Var.a;
                    String str3 = dq1Var.b;
                    if (i12 != 1) {
                        oz0 oz0Var = dq1Var.d;
                        synchronized (ro1Var) {
                            q00 q00Var = ro1Var.v;
                            if (oz0Var == null) {
                                q00Var.remove(str3);
                            } else {
                                q00Var.put(str3, oz0Var);
                            }
                        }
                    } else {
                        ro1Var.o(str3, dq1Var.c);
                    }
                }
                return ro1Var;
            }
        };
        final bn2 bn2Var11 = new bn2(vj2VarM6, false, false);
        bn2Var11.u = new an2(bn2Var11, callable11, ya1Var);
        bn2Var11.v();
        qk2 qk2VarN6 = vj2.n(new hp[]{hpVarB3, bn2Var11});
        final vs0 vs0Var10 = vs0Var3;
        Callable callable12 = new Callable() { // from class: ux1
            /* JADX WARN: Code duplicated, block: B:51:0x0913  */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r12v14, types: [bl1, j11] */
            /* JADX WARN: Type inference failed for: r12v15 */
            /* JADX WARN: Type inference failed for: r12v16 */
            /* JADX WARN: Type inference failed for: r8v2 */
            /* JADX WARN: Type inference failed for: r8v3, types: [bw1, es1] */
            /* JADX WARN: Type inference failed for: r8v7 */
            /* JADX WARN: Type inference failed for: r9v6, types: [he1] */
            @Override // java.util.concurrent.Callable
            public final Object call() throws Throwable {
                vx1 vx1Var;
                final int i11;
                ?? r8;
                vx1 vx1Var2 = this.a;
                bn2 bn2Var12 = bn2Var11;
                hp hpVar1111111 = hpVarB3;
                e52 e52Var2 = e52Var;
                x42 x42Var2 = x42Var;
                JSONObject jSONObject2 = jSONObject;
                vs0 vs0Var11 = vs0Var10;
                d91 d91Var12 = d91Var11;
                ro1 ro1Var = (ro1) bn2Var12.get();
                uq1 uq1Var = (uq1) hpVar1111111.get();
                ix0 ix0Var2 = lx0.p2;
                tu0 tu0Var2 = tu0.e;
                if (((Boolean) tu0Var2.c.a(ix0Var2)).booleanValue()) {
                    ec.q(vc3.C.k, vx1Var2.f.e, "rendering-webview-creation-end");
                }
                hf1 hf1Var = vx1Var2.a;
                p83 p83Var2 = new p83(e52Var2, x42Var2, (String) null);
                kc2 kc2Var = new kc2(23, ro1Var);
                u40 u40Var = new u40(jSONObject2, uq1Var, vs0Var11, d91Var12, 10, false);
                if1 if1Var = hf1Var.b;
                hf1 hf1Var2 = hf1Var.c;
                q63 q63VarA = q63.a(new eg1(if1Var.G0, 9));
                ti1 ti1Var = new ti1(p83Var2, 0);
                do1 do1Var = new do1(u40Var, 0);
                hj1 hj1Var = new hj1(q63.a(new da1(ti1Var, do1Var, 14)), 29);
                q63 q63VarA2 = q63.a(new tz0(12, hj1Var));
                ef1 ef1Var = if1Var.h;
                xn1 xn1Var = yd.l;
                q63 q63VarA3 = q63.a(new i91(ef1Var, q63VarA2, xn1Var, 1));
                q63 q63VarA4 = q63.a(new jh1(q63VarA, q63.a(new eh1(if1Var.g, q63VarA3, 0)), if1Var.c, q63.a(new re1(q63VarA3, q63VarA, 3)), if1Var.f));
                q63 q63VarA5 = q63.a(new re1(q63VarA4, q63VarA2, 5));
                q63 q63VarA6 = q63.a(new vg1(hf1Var2.g, ti1Var, 1));
                q63 q63VarA7 = q63.a(new hj1(q63VarA6, 7));
                int i12 = w63.c;
                ArrayList arrayList3 = new ArrayList(1);
                ArrayList arrayList4 = new ArrayList(3);
                arrayList4.add(hf1Var2.o);
                arrayList4.add(hf1Var2.p);
                arrayList4.add(q63VarA5);
                arrayList3.add(q63VarA7);
                q63 q63VarA8 = q63.a(new bk1(new w63(arrayList3, arrayList4), 3));
                q63 q63VarA9 = q63.a(v51.j);
                q63 q63Var = if1Var.c;
                q63 q63VarA10 = q63.a(new eh1(q63VarA9, (v63) q63Var, 4));
                ti1 ti1Var2 = new ti1(p83Var2, 3);
                ti1 ti1Var3 = new ti1(p83Var2, 2);
                xe1 xe1Var = if1Var.g;
                q63 q63VarA11 = q63.a(new eg1(xe1Var, 20));
                q63 q63VarA12 = q63.a(ar.j);
                q63 q63VarA13 = q63.a(new tg1(xe1Var, if1Var.X, q63VarA11, q63VarA12, if1Var.D0, if1Var.d));
                q63 q63VarA14 = q63.a(new yn1(if1Var.I, if1Var.H, ti1Var, ti1Var3, q63VarA13, hf1Var2.e));
                xn1 xn1Var2 = new xn1(4);
                xn1 xn1Var3 = new xn1(2);
                q63 q63VarA15 = q63.a(new eh1(q63VarA9, (v63) q63Var, 9));
                q63 q63VarA16 = q63.a(hn.p);
                eo1 eo1Var = new eo1(q63VarA16, 2);
                ArrayList arrayList5 = new ArrayList(2);
                ArrayList arrayList6 = new ArrayList(1);
                arrayList6.add(hf1Var2.u);
                arrayList5.add(q63VarA15);
                arrayList5.add(eo1Var);
                q63 q63VarA17 = q63.a(new i91(new w63(arrayList5, arrayList6), ti1Var, ti1Var2, 5));
                q63 q63VarA18 = q63.a(new tz0(9, ti1Var2));
                q63 q63VarA19 = q63.a(new ah1(if1Var.g, if1Var.c, if1Var.d, ti1Var2, ti1Var, hf1Var2.k, q63VarA14, xn1Var2, xn1Var3, if1Var.E, hf1Var2.l, hf1Var2.e, hf1Var2.t, q63VarA17, q63VarA18));
                bf1 bf1Var = new bf1(q63VarA19, 24);
                hj1 hj1Var2 = new hj1(q63.a(new vg1(ti1Var, if1Var.V, 0)), 11);
                ArrayList arrayList7 = new ArrayList(4);
                ArrayList arrayList8 = new ArrayList(2);
                arrayList7.add(hf1Var2.q);
                arrayList8.add(hf1Var2.r);
                arrayList8.add(hf1Var2.s);
                arrayList7.add(q63VarA10);
                arrayList7.add(bf1Var);
                arrayList7.add(hj1Var2);
                q63 q63VarA20 = q63.a(new bk1(new w63(arrayList7, arrayList8), 4));
                q63 q63VarA21 = q63.a(new jj1(if1Var.g, if1Var.C0, if1Var.j, ti1Var2, ti1Var, if1Var.G, xn1Var));
                q63 q63VarA22 = q63.a(new hj1(q63VarA21, 5));
                q63 q63VarA23 = q63.a(new eh1(q63VarA9, (v63) if1Var.c, 3));
                q63 q63VarA24 = q63.a(new hj1(q63.a(new zh1(if1Var.y0, hf1Var2.d, 1)), 3));
                bf1 bf1Var2 = new bf1(q63VarA19, 23);
                ArrayList arrayList9 = new ArrayList(5);
                ArrayList arrayList10 = new ArrayList(3);
                arrayList9.add(hf1Var2.v);
                arrayList9.add(hf1Var2.w);
                arrayList10.add(hf1Var2.x);
                arrayList10.add(hf1Var2.y);
                arrayList9.add(q63VarA22);
                arrayList9.add(q63VarA23);
                arrayList10.add(q63VarA24);
                arrayList9.add(bf1Var2);
                q63 q63VarA25 = q63.a(new bk1(new w63(arrayList9, arrayList10), 0));
                q63 q63VarA26 = q63.a(new re1(q63VarA4, q63VarA2, 4));
                int i13 = 6;
                q63 q63VarA27 = q63.a(new hj1(q63VarA21, i13));
                q63 q63Var2 = if1Var.c;
                q63 q63VarA28 = q63.a(new eh1(q63VarA9, (v63) q63Var2, i13));
                bf1 bf1Var3 = new bf1(q63VarA17, 12);
                bf1 bf1Var4 = new bf1(q63VarA19, 26);
                tz0 tz0Var = new tz0(14, kc2Var);
                eo1 eo1Var2 = new eo1(q63.a(new i91(tz0Var, hj1Var, q63Var2, 7)), 1);
                ArrayList arrayList11 = new ArrayList(7);
                ArrayList arrayList12 = new ArrayList(3);
                arrayList11.add(hf1Var2.z);
                arrayList11.add(hf1Var2.A);
                arrayList12.add(hf1Var2.B);
                arrayList12.add(hf1Var2.C);
                arrayList12.add(q63VarA26);
                arrayList11.add(q63VarA27);
                arrayList11.add(q63VarA28);
                arrayList11.add(bf1Var3);
                arrayList11.add(bf1Var4);
                arrayList11.add(eo1Var2);
                q63 q63VarA29 = q63.a(new bk1(new w63(arrayList11, arrayList12), 2));
                bf1 bf1Var5 = new bf1(q63VarA19, 29);
                ArrayList arrayList13 = new ArrayList(1);
                ArrayList arrayList14 = new ArrayList(1);
                arrayList14.add(hf1Var2.D);
                arrayList13.add(bf1Var5);
                q63 q63VarA30 = q63.a(new bk1(new w63(arrayList13, arrayList14), 19));
                bf1 bf1Var6 = new bf1(q63.a(new vg1(ti1Var, if1Var.I, 2)), 22);
                ArrayList arrayList15 = new ArrayList(1);
                new ArrayList(1).add(hf1Var2.E);
                arrayList15.add(bf1Var6);
                q63 q63VarA31 = q63.a(new eh1(q63VarA9, (v63) if1Var.c, 10));
                ArrayList arrayList16 = new ArrayList(1);
                ArrayList arrayList17 = new ArrayList(1);
                arrayList17.add(hf1Var2.F);
                arrayList16.add(q63VarA31);
                q63 q63VarA32 = q63.a(new bk1(new w63(arrayList16, arrayList17), 20));
                int i14 = 8;
                q63 q63VarA33 = q63.a(new hj1(q63VarA6, i14));
                bf1 bf1Var7 = new bf1(q63VarA19, 27);
                ArrayList arrayList18 = new ArrayList(7);
                ArrayList arrayList19 = new ArrayList(4);
                arrayList18.add(hf1Var2.G);
                arrayList19.add(hf1Var2.H);
                arrayList18.add(hf1Var2.I);
                arrayList18.add(hf1Var2.J);
                arrayList19.add(hf1Var2.K);
                arrayList19.add(hf1Var2.L);
                arrayList19.add(hf1Var2.M);
                arrayList18.add(hf1Var2.N);
                arrayList18.add(hf1Var2.O);
                arrayList18.add(q63VarA33);
                arrayList18.add(bf1Var7);
                q63 q63VarA34 = q63.a(new bk1(new w63(arrayList18, arrayList19), 5));
                hj1 hj1Var3 = new hj1(q63.a(new bf1(q63VarA20, 11)), 1);
                q63 q63VarA35 = q63.a(new eh1(q63VarA9, (v63) if1Var.c, i14));
                ArrayList arrayList20 = new ArrayList(2);
                ArrayList arrayList21 = new ArrayList(1);
                arrayList21.add(hf1Var2.Q);
                arrayList20.add(hj1Var3);
                arrayList20.add(q63VarA35);
                q63 q63VarA36 = q63.a(new bk1(new w63(arrayList20, arrayList21), 9));
                List list = Collections.EMPTY_LIST;
                new ArrayList(1).add(hf1Var2.R);
                q63 q63VarA37 = q63.a(new hj1(q63VarA21, 4));
                ArrayList arrayList22 = new ArrayList(1);
                List list2 = Collections.EMPTY_LIST;
                arrayList22.add(q63VarA37);
                q63 q63VarA38 = q63.a(new eh1(q63VarA9, (v63) if1Var.c, 5));
                bf1 bf1Var8 = new bf1(q63VarA19, 25);
                ArrayList arrayList23 = new ArrayList(2);
                new ArrayList(1).add(hf1Var2.S);
                arrayList23.add(q63VarA38);
                arrayList23.add(bf1Var8);
                q63 q63VarA39 = q63.a(new hj1(q63VarA21, 0));
                ArrayList arrayList24 = new ArrayList(1);
                List list3 = Collections.EMPTY_LIST;
                arrayList24.add(q63VarA39);
                ti1 ti1Var4 = new ti1(p83Var2, 1);
                u91 u91Var = new u91(ti1Var, ti1Var4, hf1Var2.h, ti1Var3, hf1Var2.f, 4);
                ArrayList arrayList25 = new ArrayList(1);
                ArrayList arrayList26 = new ArrayList(1);
                arrayList26.add(hf1Var2.U);
                arrayList25.add(hf1Var2.V);
                wi1 wi1Var = new wi1(ti1Var2, ti1Var, q63VarA8, q63VarA34, hf1Var2.T, u91Var, q63VarA9, new bk1(new w63(arrayList25, arrayList26), 6), q63VarA30, q63VarA18, if1Var.n0);
                do1 do1Var2 = new do1(u40Var, 1);
                q63 q63VarA40 = q63.a(new fp1(do1Var2, if1Var.f));
                q63 q63VarA41 = q63.a(new re1(q63VarA4, q63VarA2, 6));
                List list4 = Collections.EMPTY_LIST;
                ArrayList arrayList27 = new ArrayList(2);
                arrayList27.add(hf1Var2.W);
                arrayList27.add(q63VarA41);
                w63 w63Var = new w63(list4, arrayList27);
                q63 q63Var3 = hf1Var2.g;
                q63 q63VarA42 = q63.a(new i91(q63Var3, w63Var, ti1Var, 6));
                q63 q63VarA43 = q63.a(new do1(u40Var, 2));
                q63 q63VarA44 = q63.a(new do1(u40Var, 3));
                wn1 wn1Var = hf1Var2.i;
                q63 q63Var4 = if1Var.E;
                ef1 ef1Var2 = if1Var.h;
                yj1 yj1Var = hf1Var2.d;
                q63 q63Var5 = if1Var.f;
                eo1 eo1Var3 = new eo1(q63.a(new co1(q63Var3, wn1Var, do1Var, do1Var2, tz0Var, q63Var4, q63VarA29, q63VarA25, q63VarA32, ti1Var, ef1Var2, yj1Var, q63VarA4, q63VarA40, q63Var5, q63VarA42, if1Var.I, hf1Var2.e, if1Var.J, q63VarA12, if1Var.L0, q63VarA17, q63VarA43, q63VarA44, q63VarA18)), 0);
                q63 q63VarA45 = q63.a(new eg1(ef1Var2, 14));
                q63 q63Var6 = if1Var.c;
                q63 q63VarA46 = q63.a(new fo1(q63VarA45, q63Var6, q63Var3, q63Var5, 0));
                q63 q63Var7 = hf1Var2.m;
                dy0 dy0Var = new dy0((v63) q63Var7, (r63) do1Var2, q63VarA46, (v63) eo1Var3, 6);
                fp1 fp1Var = new fp1(q63Var7, do1Var2);
                q63 q63VarA47 = q63.a(new tz0(13, new ho1(tz0Var, 0)));
                bp1 bp1Var = new bp1(if1Var.X, yj1Var, hj1Var, tz0Var, dy0Var, fp1Var, q63Var6, q63VarA47);
                q12 q12Var = new q12();
                q63 q63VarA48 = q63.a(new mq1(ti1Var4, q12Var, tz0Var, 1));
                q63 q63VarA49 = q63.a(new mq1(ti1Var4, q12Var, tz0Var, 0));
                q63 q63VarA50 = q63.a(new dy0((v63) ti1Var4, (v63) q12Var, (v63) tz0Var, (v63) if1Var.j, 8));
                q63 q63VarA51 = q63.a(new da1(q12Var, tz0Var, 17));
                xe1 xe1Var2 = if1Var.g;
                q63 q63VarA52 = q63.a(new dy0(xe1Var2, tz0Var, bp1Var, q12Var, 7));
                q12.a(q12Var, q63.a(new oo1(wi1Var, q63Var6, tz0Var, eo1Var3, bp1Var, hj1Var, wn1Var, q63VarA48, q63VarA49, q63VarA50, q63VarA51, q63VarA52, new xo1(xe1Var2, yj1Var, 0), q63Var4, ef1Var2, xe1Var2, q63VarA47, q63VarA16, if1Var.M0)));
                q63 q63Var8 = hf1Var2.X;
                q63 q63Var9 = hf1Var2.P;
                q63 q63VarA53 = q63.a(new bp1(q63VarA25, q63VarA20, q63Var8, q63VarA36, q63Var9, ti1Var, ti1Var3, q63VarA13));
                q63 q63VarA54 = q63.a(new iq1((v63) if1Var.c, q63VarA46, q63.a(new vg1(hf1Var2.g, ti1Var, 3)), q63VarA13, 0));
                q63 q63VarA55 = q63.a(new th1(q63VarA25, q63VarA20, q63Var8, q63VarA36, q63Var9, q63VarA32, if1Var.j, if1Var.I, if1Var.G, q63VarA13));
                if (((Boolean) tu0Var2.c.a(ix0Var2)).booleanValue()) {
                    vc3.C.k.getClass();
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    vx1Var = vx1Var2;
                    cs1 cs1Var3 = vx1Var.f;
                    cs1Var3.e.putLong("rendering-ad-component-creation-end", jCurrentTimeMillis);
                    cs1Var3.e.putLong("rendering-configure-webview-start", jCurrentTimeMillis);
                } else {
                    vx1Var = vx1Var2;
                }
                wo1 wo1Var = (wo1) hf1Var2.a.g;
                dq.D(wo1Var);
                dq.D(ro1Var);
                dq.D(uq1Var);
                n31 n31Var = new n31(wo1Var, ro1Var, uq1Var, q63.b(q63VarA52));
                if (((r01) n31Var.g) != null) {
                    ((uq1) n31Var.h).b("/nativeAdCustomClick", n31Var);
                }
                sq1 sq1Var = (sq1) q63VarA53.c();
                ok1 ok1Var = sq1Var.b;
                qq1 qq1Var = uq1Var.a;
                Objects.requireNonNull(ok1Var);
                rq1 rq1Var = new rq1(0, ok1Var);
                ak1 ak1Var = sq1Var.a;
                ?? r12 = sq1Var.c;
                gl1 gl1Var = sq1Var.d;
                zl1 zl1Var = sq1Var.e;
                synchronized (qq1Var) {
                    qq1Var.f = ak1Var;
                    qq1Var.g = r12;
                    qq1Var.h = gl1Var;
                    qq1Var.i = zl1Var;
                    qq1Var.j = rq1Var;
                }
                x42 x42Var3 = sq1Var.f;
                z42 z42Var4 = sq1Var.g;
                sg1 sg1Var = sq1Var.h;
                synchronized (uq1Var) {
                    try {
                        try {
                            qm2 qm2Var = uq1Var.m;
                            if (qm2Var == null) {
                                i11 = 0;
                                r8 = 0;
                            } else {
                                i11 = 0;
                                r8 = 0;
                                qm2Var.a(new in2(qm2Var, 0, new u40(uq1Var, x42Var3, z42Var4, sg1Var, 11)), uq1Var.e);
                            }
                        } catch (Throwable th) {
                            th = th;
                            r12 = uq1Var;
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
                final gq1 gq1Var = (gq1) q63VarA54.c();
                md1 md1VarH = r11.h();
                if (md1VarH == null) {
                    gq1Var.getClass();
                } else {
                    xm1 xm1Var = gq1Var.c;
                    xm1Var.R1(md1VarH.p0());
                    eq1 eq1Var = new eq1(md1VarH, 1);
                    Executor executor4 = gq1Var.a;
                    xm1Var.I1(eq1Var, executor4);
                    xm1Var.I1(new eq1(md1VarH, i11), executor4);
                    kh1 kh1Var = gq1Var.b;
                    xm1Var.I1(kh1Var, executor4);
                    kh1Var.f = md1VarH;
                    ?? E0 = md1VarH.e0();
                    if (((Boolean) tu0Var2.c.a(lx0.Ua)).booleanValue() && E0 != 0) {
                        sg1 sg1Var2 = gq1Var.d;
                        E0.d("/click");
                        zm1 zm1Var = E0.p;
                        m11 m11Var = u11.a;
                        E0.b("/click", new s11(zm1Var, i11, sg1Var2));
                        E0.R(sg1Var2, r8, r8);
                    }
                    md1VarH.t0("/trackActiveViewUnit", new v11() { // from class: fq1
                        @Override // defpackage.v11
                        public final void f(Object obj, Map map) {
                            int i15 = i11;
                            gq1 gq1Var2 = gq1Var;
                            switch (i15) {
                                case 0:
                                    kh1 kh1Var2 = gq1Var2.b;
                                    kh1Var2.j = true;
                                    kh1Var2.a();
                                    break;
                                default:
                                    gq1Var2.b.j = false;
                                    break;
                            }
                        }
                    });
                    final int i15 = 1;
                    md1VarH.t0("/untrackActiveViewUnit", new v11() { // from class: fq1
                        @Override // defpackage.v11
                        public final void f(Object obj, Map map) {
                            int i16 = i15;
                            gq1 gq1Var2 = gq1Var;
                            switch (i16) {
                                case 0:
                                    kh1 kh1Var2 = gq1Var2.b;
                                    kh1Var2.j = true;
                                    kh1Var2.a();
                                    break;
                                default:
                                    gq1Var2.b.j = false;
                                    break;
                            }
                        }
                    });
                }
                wq1 wq1Var = (wq1) q63VarA55.c();
                xq1 xq1Var = vx1Var.e;
                md1 md1VarI = ro1Var.i();
                wq1Var.getClass();
                vq1 vq1Var = xq1Var.a;
                ok1 ok1Var2 = wq1Var.b;
                Objects.requireNonNull(ok1Var2);
                rq1 rq1Var2 = new rq1(1, ok1Var2);
                ak1 ak1Var2 = wq1Var.a;
                bl1 bl1Var = wq1Var.c;
                gl1 gl1Var2 = wq1Var.d;
                zl1 zl1Var2 = wq1Var.e;
                ym1 ym1Var = wq1Var.f;
                synchronized (vq1Var) {
                    synchronized (vq1Var) {
                        vq1Var.f = ak1Var2;
                        vq1Var.g = bl1Var;
                        vq1Var.h = gl1Var2;
                        vq1Var.i = zl1Var2;
                        vq1Var.j = rq1Var2;
                    }
                    if (((Boolean) tu0Var2.c.a(lx0.Va)).booleanValue() && md1VarI != null && md1VarI.e0() != null) {
                        he1 he1VarE5 = md1VarI.e0();
                        sg1 sg1Var8 = wq1Var.j;
                        bw1 bw1Var6 = wq1Var.i;
                        he1VarE5.P(sg1Var8, bw1Var6, wq1Var.h);
                        he1VarE5.R(sg1Var8, bw1Var6, wq1Var.g);
                    }
                    if (((Boolean) tu0Var2.c.a(ix0Var2)).booleanValue()) {
                        ec.q(vc3.C.k, vx1Var.f.e, "rendering-configure-webview-end");
                    }
                    return (no1) q12Var.c();
                }
                vq1Var.k = ym1Var;
                if (((Boolean) tu0Var2.c.a(lx0.Va)).booleanValue()) {
                    he1 he1VarE6 = md1VarI.e0();
                    sg1 sg1Var9 = wq1Var.j;
                    bw1 bw1Var7 = wq1Var.i;
                    he1VarE6.P(sg1Var9, bw1Var7, wq1Var.h);
                    he1VarE6.R(sg1Var9, bw1Var7, wq1Var.g);
                }
                if (((Boolean) tu0Var2.c.a(ix0Var2)).booleanValue()) {
                    ec.q(vc3.C.k, vx1Var.f.e, "rendering-configure-webview-end");
                }
                return (no1) q12Var.c();
            }
        };
        bn2 bn2Var12 = new bn2(qk2VarN6, true, false);
        bn2Var12.u = new an2(bn2Var12, callable12, this.b);
        bn2Var12.v();
        return bn2Var12;
    }
}
