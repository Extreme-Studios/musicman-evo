package defpackage;

import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class vi1 {
    public final ru1 a;
    public final i52 b;
    public final u62 c;
    public final vg2 d;
    public final my1 e;
    public final cm1 f;
    public e52 g;
    public final r52 h;
    public final sj1 i;
    public final Executor j;
    public final bv1 k;
    public final yw1 l;

    public vi1(ru1 ru1Var, i52 i52Var, u62 u62Var, vg2 vg2Var, my1 my1Var, cm1 cm1Var, e52 e52Var, r52 r52Var, sj1 sj1Var, ya1 ya1Var, bv1 bv1Var, yw1 yw1Var) {
        this.a = ru1Var;
        this.b = i52Var;
        this.c = u62Var;
        this.d = vg2Var;
        this.e = my1Var;
        this.f = cm1Var;
        this.g = e52Var;
        this.h = r52Var;
        this.i = sj1Var;
        this.j = ya1Var;
        this.k = bv1Var;
        this.l = yw1Var;
    }

    public final p62 a(hp hpVar) {
        if (this.g != null) {
            u62 u62Var = this.c;
            r62 r62Var = r62.i;
            Objects.requireNonNull(u62Var);
            return new es0(u62Var, r62Var, null, u62.d, Collections.EMPTY_LIST, na1.t(this.g)).y();
        }
        es0 es0Var = vc3.C.j;
        es0Var.getClass();
        ix0 ix0Var = lx0.G4;
        tu0 tu0Var = tu0.e;
        if (((Boolean) tu0Var.c.a(ix0Var)).booleanValue()) {
            synchronized (es0Var.h) {
                try {
                    es0Var.C();
                    ScheduledFuture scheduledFuture = (ScheduledFuture) es0Var.f;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                    }
                    es0Var.f = za1.d.schedule((q7) es0Var.g, ((Long) tu0Var.c.a(lx0.H4)).longValue(), TimeUnit.MILLISECONDS);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.c.a(hpVar, r62.i).q(new r21(4, this.k)).y();
    }

    /* JADX WARN: Code duplicated, block: B:121:0x0284 A[Catch: all -> 0x0106, TRY_LEAVE, TryCatch #4 {all -> 0x0106, blocks: (B:32:0x00a4, B:34:0x00c4, B:36:0x00cc, B:38:0x00d9, B:40:0x00f1, B:44:0x011d, B:47:0x0129, B:49:0x0131, B:51:0x0137, B:55:0x0140, B:66:0x017a, B:58:0x0154, B:65:0x0165, B:68:0x017f, B:43:0x0109, B:69:0x0193, B:76:0x01b2, B:79:0x01ba, B:83:0x01dc, B:85:0x01f2, B:89:0x0214, B:91:0x0229, B:94:0x023d, B:99:0x0250, B:100:0x0251, B:101:0x025e, B:105:0x0263, B:106:0x0264, B:111:0x027a, B:124:0x028b, B:115:0x027e, B:118:0x0281, B:120:0x0283, B:121:0x0284, B:123:0x028a, B:131:0x029f, B:90:0x021e, B:86:0x0205, B:82:0x01c8, B:73:0x01a1, B:74:0x01a6, B:95:0x023e, B:97:0x0248, B:107:0x0265, B:109:0x026f, B:122:0x0285), top: B:172:0x00a4, inners: #1, #9, #11, #12 }] */
    /* JADX WARN: Code duplicated, block: B:128:0x0293  */
    /* JADX WARN: Code duplicated, block: B:134:0x02a2  */
    /* JADX WARN: Code duplicated, block: B:136:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:139:0x02bd  */
    /* JADX WARN: Code duplicated, block: B:147:0x02e1  */
    /* JADX WARN: Code duplicated, block: B:159:0x031d  */
    /* JADX WARN: Code duplicated, block: B:183:0x0285 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:89:0x0214 A[Catch: all -> 0x0106, TryCatch #4 {all -> 0x0106, blocks: (B:32:0x00a4, B:34:0x00c4, B:36:0x00cc, B:38:0x00d9, B:40:0x00f1, B:44:0x011d, B:47:0x0129, B:49:0x0131, B:51:0x0137, B:55:0x0140, B:66:0x017a, B:58:0x0154, B:65:0x0165, B:68:0x017f, B:43:0x0109, B:69:0x0193, B:76:0x01b2, B:79:0x01ba, B:83:0x01dc, B:85:0x01f2, B:89:0x0214, B:91:0x0229, B:94:0x023d, B:99:0x0250, B:100:0x0251, B:101:0x025e, B:105:0x0263, B:106:0x0264, B:111:0x027a, B:124:0x028b, B:115:0x027e, B:118:0x0281, B:120:0x0283, B:121:0x0284, B:123:0x028a, B:131:0x029f, B:90:0x021e, B:86:0x0205, B:82:0x01c8, B:73:0x01a1, B:74:0x01a6, B:95:0x023e, B:97:0x0248, B:107:0x0265, B:109:0x026f, B:122:0x0285), top: B:172:0x00a4, inners: #1, #9, #11, #12 }] */
    /* JADX WARN: Code duplicated, block: B:90:0x021e A[Catch: all -> 0x0106, TryCatch #4 {all -> 0x0106, blocks: (B:32:0x00a4, B:34:0x00c4, B:36:0x00cc, B:38:0x00d9, B:40:0x00f1, B:44:0x011d, B:47:0x0129, B:49:0x0131, B:51:0x0137, B:55:0x0140, B:66:0x017a, B:58:0x0154, B:65:0x0165, B:68:0x017f, B:43:0x0109, B:69:0x0193, B:76:0x01b2, B:79:0x01ba, B:83:0x01dc, B:85:0x01f2, B:89:0x0214, B:91:0x0229, B:94:0x023d, B:99:0x0250, B:100:0x0251, B:101:0x025e, B:105:0x0263, B:106:0x0264, B:111:0x027a, B:124:0x028b, B:115:0x027e, B:118:0x0281, B:120:0x0283, B:121:0x0284, B:123:0x028a, B:131:0x029f, B:90:0x021e, B:86:0x0205, B:82:0x01c8, B:73:0x01a1, B:74:0x01a6, B:95:0x023e, B:97:0x0248, B:107:0x0265, B:109:0x026f, B:122:0x0285), top: B:172:0x00a4, inners: #1, #9, #11, #12 }] */
    public final p62 b() {
        q91 q91Var;
        fm2 fm2VarC;
        String strOptString;
        String strOptString2;
        String strOptString3;
        int i;
        String str;
        Pair pair;
        String str2;
        List listAsList;
        String string;
        f93 f93Var = this.b.d;
        if (f93Var.C == null && f93Var.x == null) {
            return a(this.i.b());
        }
        u62 u62Var = this.c;
        r62 r62Var = r62.C;
        Objects.requireNonNull(u62Var);
        ru1 ru1Var = this.a;
        ix0 ix0Var = lx0.o2;
        tu0 tu0Var = tu0.e;
        if (((Boolean) tu0Var.c.a(ix0Var)).booleanValue()) {
            ru1Var.o = ru1Var.d.t;
            ec.q(vc3.C.k, ru1Var.i.e, "scar-preloader-ready");
        }
        String strA = ru1Var.d.d.C;
        if (TextUtils.isEmpty(strA)) {
            q91Var = ru1Var.d.d.x;
            if (q91Var != null) {
                if (((Boolean) tu0.e.c.a(lx0.k7)).booleanValue()) {
                    String str3 = q91Var.f;
                    String str4 = q91Var.g;
                    strOptString = "";
                    strOptString = new JSONObject(str3).optString("request_id", "");
                    strOptString2 = "";
                    strOptString2 = new JSONObject(str4).optString("request_id", "");
                    if (TextUtils.isEmpty(strOptString2)) {
                    }
                    ru1Var.i.a.put("ridmm", "true");
                    fm2VarC = na1.C(new ky1("Mismatch request IDs.", 14));
                }
                fm2VarC = ru1Var.a(q91Var.f, ru1Var.c(q91Var.g));
            } else {
                fm2VarC = na1.C(new ky1("Mismatch request IDs.", 14));
            }
        } else {
            String strSubstring = "";
            try {
                strSubstring = new JSONObject(strA).optString("request_id", "");
            } catch (JSONException unused) {
            }
            ix0 ix0Var2 = lx0.s7;
            if (((Boolean) tu0Var.c.a(ix0Var2)).booleanValue() && strSubstring.isEmpty()) {
                int iLastIndexOf = strA.lastIndexOf("&request_id=");
                strSubstring = iLastIndexOf != -1 ? strA.substring(iLastIndexOf + 12) : "";
            }
            String str5 = strSubstring;
            if (TextUtils.isEmpty(str5)) {
                fm2VarC = na1.C(new ky1("Invalid ad string.", 15));
            } else {
                synchronized (ru1Var.l) {
                    try {
                        ce3 ce3Var = (ce3) ru1Var.a.N.c();
                        cs1 cs1Var = ru1Var.i;
                        String strB = ce3Var.b(str5, cs1Var);
                        if (((Boolean) tu0Var.c.a(ix0Var2)).booleanValue() && !TextUtils.isEmpty(strB)) {
                            try {
                                JSONObject jSONObjectOptJSONObject = new JSONObject(strB).optJSONObject("extras");
                                if (jSONObjectOptJSONObject != null) {
                                    String strOptString4 = jSONObjectOptJSONObject.optString("query_info_type", "");
                                    if (((Boolean) tu0Var.c.a(lx0.u7)).booleanValue()) {
                                        listAsList = Arrays.asList(((String) tu0Var.c.a(lx0.v7)).split(","));
                                    } else {
                                        listAsList = Arrays.asList(((String) tu0Var.c.a(lx0.t7)).split(","));
                                    }
                                    if (listAsList.contains(jn.v(strOptString4))) {
                                        int iLastIndexOf2 = strA.lastIndexOf("&");
                                        String strSubstring2 = iLastIndexOf2 != -1 ? strA.substring(0, iLastIndexOf2) : null;
                                        if (!TextUtils.isEmpty(strSubstring2)) {
                                            try {
                                                byte[] bArrDecode = Base64.decode(strSubstring2, 11);
                                                byte[] bytes = str5.getBytes("UTF-8");
                                                if (TextUtils.isEmpty(strB)) {
                                                    string = null;
                                                } else {
                                                    try {
                                                        string = new JSONObject(strB).getString("arek");
                                                    } catch (JSONException e) {
                                                        jn.p("Failed to get key from QueryJSONMap".concat(e.toString()));
                                                        vc3.C.h.d("CryptoUtils.getKeyFromQueryJsonMap", e);
                                                        string = null;
                                                    }
                                                }
                                                strA = p52.a(bArrDecode, bytes, string, cs1Var);
                                            } catch (UnsupportedEncodingException | IllegalArgumentException e2) {
                                                jn.p("Failed to decode the adResponse. ".concat(e2.toString()));
                                                vc3.C.h.d("PreloadedLoader.decryptAdResponseIfNecessary", e2);
                                            }
                                        }
                                    }
                                }
                            } catch (JSONException unused2) {
                            }
                        }
                        if (TextUtils.isEmpty(strA)) {
                            strOptString3 = "";
                        } else {
                            try {
                                strOptString3 = new JSONObject(strA).optString("render_id", "");
                            } catch (JSONException unused3) {
                                strOptString3 = "";
                            }
                        }
                        String str6 = strOptString3;
                        if (TextUtils.isEmpty(str6)) {
                            i = 0;
                            str = null;
                            if (str != null) {
                                pair = new Pair(str, Integer.valueOf(i));
                            } else {
                                pair = new Pair("", 0);
                            }
                            str2 = (String) pair.first;
                            int iIntValue = ((Integer) pair.second).intValue();
                            if (TextUtils.isEmpty(str2)) {
                                synchronized (ce3Var) {
                                    ce3Var.e.remove(str5);
                                    if (TextUtils.isEmpty(strB)) {
                                        q91Var = ru1Var.d.d.x;
                                        if (q91Var != null) {
                                            if (((Boolean) tu0.e.c.a(lx0.k7)).booleanValue()) {
                                                String str7 = q91Var.f;
                                                String str8 = q91Var.g;
                                                strOptString = "";
                                                strOptString = new JSONObject(str7).optString("request_id", "");
                                                strOptString2 = "";
                                                strOptString2 = new JSONObject(str8).optString("request_id", "");
                                                if (TextUtils.isEmpty(strOptString2)) {
                                                }
                                                ru1Var.i.a.put("ridmm", "true");
                                                fm2VarC = na1.C(new ky1("Mismatch request IDs.", 14));
                                            }
                                            fm2VarC = ru1Var.a(q91Var.f, ru1Var.c(q91Var.g));
                                        } else {
                                            fm2VarC = na1.C(new ky1("Mismatch request IDs.", 14));
                                        }
                                    } else {
                                        fm2VarC = ru1Var.a(strA, ru1Var.c(strB));
                                    }
                                }
                            } else {
                                synchronized (ce3Var) {
                                    ce3Var.e.remove(str5);
                                    if (TextUtils.isEmpty(strB)) {
                                        q91Var = ru1Var.d.d.x;
                                        if (q91Var != null) {
                                            if (((Boolean) tu0.e.c.a(lx0.k7)).booleanValue()) {
                                                String str9 = q91Var.f;
                                                String str10 = q91Var.g;
                                                strOptString = "";
                                                strOptString = new JSONObject(str9).optString("request_id", "");
                                                strOptString2 = "";
                                                strOptString2 = new JSONObject(str10).optString("request_id", "");
                                                if (TextUtils.isEmpty(strOptString2)) {
                                                }
                                                ru1Var.i.a.put("ridmm", "true");
                                                fm2VarC = na1.C(new ky1("Mismatch request IDs.", 14));
                                            }
                                            fm2VarC = ru1Var.a(q91Var.f, ru1Var.c(q91Var.g));
                                        } else {
                                            fm2VarC = na1.C(new ky1("Mismatch request IDs.", 14));
                                        }
                                    } else {
                                        fm2VarC = ru1Var.a(strA, ru1Var.c(strB));
                                    }
                                }
                            }
                        } else {
                            String str11 = "";
                            try {
                                str11 = new String(Base64.decode(str6, 0), StandardCharsets.UTF_8);
                            } catch (IllegalArgumentException e3) {
                                jn.p("Ad grouping: Has render_id, but not base64 encoded: ".concat(String.valueOf(str6)));
                                vc3.C.h.d("PreloadedLoader.decodeRenderId", e3);
                            }
                            List listM = bz1.c(new vh2(':')).m(str11);
                            if (listM.size() == 2) {
                                str = (String) listM.get(0);
                                i = Integer.parseInt((String) listM.get(1));
                            } else {
                                jn.p("Ad grouping: Has render_id, but invalid format: ".concat(String.valueOf(str6)));
                                i = 0;
                                str = null;
                            }
                            if (str != null) {
                                pair = new Pair(str, Integer.valueOf(i));
                            } else {
                                pair = new Pair("", 0);
                            }
                            str2 = (String) pair.first;
                            int iIntValue2 = ((Integer) pair.second).intValue();
                            if (TextUtils.isEmpty(str2) || iIntValue2 <= 0) {
                                synchronized (ce3Var) {
                                    ce3Var.e.remove(str5);
                                }
                                if (TextUtils.isEmpty(strB)) {
                                    q91Var = ru1Var.d.d.x;
                                    if (q91Var != null) {
                                        if (((Boolean) tu0.e.c.a(lx0.k7)).booleanValue()) {
                                            String str12 = q91Var.f;
                                            String str13 = q91Var.g;
                                            strOptString = "";
                                            try {
                                                strOptString = new JSONObject(str12).optString("request_id", "");
                                            } catch (JSONException unused4) {
                                            }
                                            strOptString2 = "";
                                            try {
                                                strOptString2 = new JSONObject(str13).optString("request_id", "");
                                            } catch (JSONException unused5) {
                                            }
                                            if (TextUtils.isEmpty(strOptString2) && strOptString.equals(strOptString2)) {
                                                ce3 ce3Var2 = (ce3) ru1Var.a.N.c();
                                                synchronized (ce3Var2) {
                                                    ce3Var2.e.remove(strOptString);
                                                }
                                                ru1Var.i.a.put("request_id", strOptString);
                                            } else {
                                                ru1Var.i.a.put("ridmm", "true");
                                                fm2VarC = na1.C(new ky1("Mismatch request IDs.", 14));
                                            }
                                        }
                                        fm2VarC = ru1Var.a(q91Var.f, ru1Var.c(q91Var.g));
                                    } else {
                                        fm2VarC = na1.C(new ky1("Mismatch request IDs.", 14));
                                    }
                                } else {
                                    fm2VarC = ru1Var.a(strA, ru1Var.c(strB));
                                }
                            } else {
                                synchronized (ce3Var) {
                                    try {
                                        tc3 tc3Var = (tc3) ce3Var.e.get(str5);
                                        if (tc3Var == null || !tc3Var.c.contains(str2)) {
                                            synchronized (ce3Var) {
                                                try {
                                                    tc3 tc3Var2 = (tc3) ce3Var.e.get(str5);
                                                    if (tc3Var2 != null) {
                                                        HashSet hashSet = tc3Var2.c;
                                                        hashSet.add(str2);
                                                        if (hashSet.size() < iIntValue2) {
                                                        }
                                                    }
                                                    synchronized (ce3Var) {
                                                        ce3Var.e.remove(str5);
                                                    }
                                                } catch (Throwable th) {
                                                    throw th;
                                                }
                                            }
                                            if (TextUtils.isEmpty(strB)) {
                                                q91Var = ru1Var.d.d.x;
                                                if (q91Var != null) {
                                                    if (((Boolean) tu0.e.c.a(lx0.k7)).booleanValue()) {
                                                        String str14 = q91Var.f;
                                                        String str15 = q91Var.g;
                                                        strOptString = "";
                                                        strOptString = new JSONObject(str14).optString("request_id", "");
                                                        strOptString2 = "";
                                                        strOptString2 = new JSONObject(str15).optString("request_id", "");
                                                        if (TextUtils.isEmpty(strOptString2)) {
                                                        }
                                                        ru1Var.i.a.put("ridmm", "true");
                                                        fm2VarC = na1.C(new ky1("Mismatch request IDs.", 14));
                                                    }
                                                    fm2VarC = ru1Var.a(q91Var.f, ru1Var.c(q91Var.g));
                                                } else {
                                                    fm2VarC = na1.C(new ky1("Mismatch request IDs.", 14));
                                                }
                                            } else {
                                                fm2VarC = ru1Var.a(strA, ru1Var.c(strB));
                                            }
                                        } else {
                                            fm2VarC = na1.C(new ky1("The ad has already been shown.", 10));
                                        }
                                    } catch (Throwable th2) {
                                        throw th2;
                                    }
                                }
                            }
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
            }
        }
        return new es0(u62Var, r62Var, null, u62.d, Collections.EMPTY_LIST, fm2VarC).y();
    }

    public final p62 c(hp hpVar) {
        es0 es0VarQ = this.c.a(hpVar, r62.j).o(new s70(22, this)).q(this.e);
        ix0 ix0Var = lx0.Y5;
        tu0 tu0Var = tu0.e;
        if (!((Boolean) tu0Var.c.a(ix0Var)).booleanValue()) {
            es0VarQ = es0VarQ.x(((Integer) tu0Var.c.a(lx0.Z5)).intValue());
        }
        return es0VarQ.y();
    }
}
