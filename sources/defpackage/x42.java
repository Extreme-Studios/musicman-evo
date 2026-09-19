package defpackage;

import android.util.JsonReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class x42 {
    public final e91 A;
    public final List A0;
    public final String B;
    public final boolean B0;
    public final JSONObject C;
    public final qk2 C0;
    public final JSONObject D;
    public final boolean D0;
    public final String E;
    public final int E0;
    public final String F;
    public final String G;
    public final String H;
    public final String I;
    public final boolean J;
    public final boolean K;
    public final boolean L;
    public final boolean M;
    public final boolean N;
    public final boolean O;
    public final boolean P;
    public final int Q;
    public final int R;
    public final boolean S;
    public final boolean T;
    public final String U;
    public final j52 V;
    public final boolean W;
    public final boolean X;
    public final int Y;
    public final String Z;
    public final List a;
    public final int a0;
    public final int b;
    public final String b0;
    public final List c;
    public final boolean c0;
    public final List d;
    public final u61 d0;
    public final int e;
    public final qc3 e0;
    public final List f;
    public final String f0;
    public final List g;
    public final boolean g0;
    public final List h;
    public final JSONObject h0;
    public final List i;
    public final boolean i0;
    public final String j;
    public final JSONObject j0;
    public final String k;
    public final boolean k0;
    public final g81 l;
    public final String l0;
    public final List m;
    public final boolean m0;
    public final List n;
    public final String n0;
    public final List o;
    public final String o0;
    public final List p;
    public final String p0;
    public final int q;
    public final boolean q0;
    public final List r;
    public final boolean r0;
    public final b52 s;
    public final int s0;
    public final List t;
    public final String t0;
    public final List u;
    public final List u0;
    public final JSONObject v;
    public final boolean v0;
    public final String w;
    public final HashMap w0;
    public final String x;
    public final j52 x0;
    public final String y;
    public final h93 y0;
    public final String z;
    public final double z0;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:392:0x0d21 A[PHI: r88 r89 r94 r95 r96 r97 r98
  0x0d21: PHI (r88v80 java.util.List) = 
  (r88v4 java.util.List)
  (r88v5 java.util.List)
  (r88v6 java.util.List)
  (r88v43 java.util.List)
  (r88v81 java.util.List)
 binds: [B:390:0x0d1a, B:387:0x0cf8, B:384:0x0cd6, B:192:0x05d7, B:12:0x00fc] A[DONT_GENERATE, DONT_INLINE]
  0x0d21: PHI (r89v81 java.util.List) = 
  (r89v3 java.util.List)
  (r89v4 java.util.List)
  (r89v5 java.util.List)
  (r89v42 java.util.List)
  (r89v82 java.util.List)
 binds: [B:390:0x0d1a, B:387:0x0cf8, B:384:0x0cd6, B:192:0x05d7, B:12:0x00fc] A[DONT_GENERATE, DONT_INLINE]
  0x0d21: PHI (r94v87 java.util.List) = 
  (r94v1 java.util.List)
  (r94v2 java.util.List)
  (r94v3 java.util.List)
  (r94v44 java.util.List)
  (r94v88 java.util.List)
 binds: [B:390:0x0d1a, B:387:0x0cf8, B:384:0x0cd6, B:192:0x05d7, B:12:0x00fc] A[DONT_GENERATE, DONT_INLINE]
  0x0d21: PHI (r95v54 java.util.List) = (r95v1 java.util.List), (r95v2 java.util.List), (r95v3 java.util.List), (r95v46 java.util.List), (r9v2 java.util.List) binds: [B:390:0x0d1a, B:387:0x0cf8, B:384:0x0cd6, B:192:0x05d7, B:12:0x00fc] A[DONT_GENERATE, DONT_INLINE]
  0x0d21: PHI (r96v55 java.util.List) = (r96v1 java.util.List), (r96v2 java.util.List), (r96v3 java.util.List), (r96v47 java.util.List), (r8v3 java.util.List) binds: [B:390:0x0d1a, B:387:0x0cf8, B:384:0x0cd6, B:192:0x05d7, B:12:0x00fc] A[DONT_GENERATE, DONT_INLINE]
  0x0d21: PHI (r97v55 java.util.List) = (r97v1 java.util.List), (r97v2 java.util.List), (r97v3 java.util.List), (r97v47 java.util.List), (r7v2 java.util.List) binds: [B:390:0x0d1a, B:387:0x0cf8, B:384:0x0cd6, B:192:0x05d7, B:12:0x00fc] A[DONT_GENERATE, DONT_INLINE]
  0x0d21: PHI (r98v56 java.util.List) = (r98v1 java.util.List), (r98v2 java.util.List), (r98v3 java.util.List), (r98v48 java.util.List), (r6v2 java.util.List) binds: [B:390:0x0d1a, B:387:0x0cf8, B:384:0x0cd6, B:192:0x05d7, B:12:0x00fc] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Failed to find 'out' block for switch in B:10:0x00eb. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    public x42(JsonReader jsonReader) throws IOException {
        List list;
        List listI0;
        List list2;
        int i;
        ps1 ps1Var;
        List listI1 = Collections.EMPTY_LIST;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        JSONObject jSONObject4 = new JSONObject();
        JSONObject jSONObject5 = new JSONObject();
        JSONObject jSONObject6 = new JSONObject();
        tj2 tj2Var = vj2.g;
        qk2 qk2Var = qk2.j;
        HashMap map = new HashMap();
        jsonReader.beginObject();
        List listA = listI1;
        List listI2 = listA;
        List listA2 = listI2;
        JSONObject jSONObjectQ0 = jSONObject;
        JSONObject jSONObjectQ1 = jSONObject2;
        JSONObject jSONObjectQ2 = jSONObject3;
        JSONObject jSONObjectQ3 = jSONObject4;
        JSONObject jSONObjectQ4 = jSONObject5;
        JSONObject jSONObjectQ5 = jSONObject6;
        List listI3 = qk2Var;
        List listI4 = listI3;
        List listO = listI4;
        HashMap map2 = map;
        double dNextDouble = 0.0d;
        String strNextString = "";
        String strNextString2 = strNextString;
        String strNextString3 = strNextString2;
        String strNextString4 = strNextString3;
        String strNextString5 = strNextString4;
        String string = strNextString5;
        String strNextString6 = string;
        String strNextString7 = strNextString6;
        String strNextString8 = strNextString7;
        String strNextString9 = strNextString8;
        String strNextString10 = strNextString9;
        String strNextString11 = strNextString10;
        String strNextString12 = strNextString11;
        String strNextString13 = strNextString12;
        String strNextString14 = strNextString13;
        String strNextString15 = strNextString14;
        String strNextString16 = strNextString15;
        String strNextString17 = strNextString16;
        String strNextString18 = strNextString17;
        String strNextString19 = strNextString18;
        int i2 = 0;
        int i3 = 0;
        g81 g81VarA = null;
        int iNextInt = 0;
        b52 b52Var = null;
        e91 e91Var = null;
        boolean zNextBoolean = false;
        boolean zNextBoolean2 = false;
        boolean zNextBoolean3 = false;
        boolean zNextBoolean4 = false;
        boolean zNextBoolean5 = false;
        boolean zNextBoolean6 = false;
        boolean zNextBoolean7 = false;
        int i4 = -1;
        int iNextInt2 = 0;
        boolean zNextBoolean8 = false;
        boolean zNextBoolean9 = false;
        boolean zNextBoolean10 = false;
        int iNextInt3 = 0;
        int iNextInt4 = -1;
        boolean zNextBoolean11 = false;
        u61 u61Var = null;
        qc3 qc3Var = null;
        boolean zNextBoolean12 = false;
        boolean zNextBoolean13 = false;
        boolean zNextBoolean14 = false;
        String strNextString20 = null;
        boolean zNextBoolean15 = false;
        boolean zNextBoolean16 = false;
        boolean zNextBoolean17 = false;
        boolean zNextBoolean18 = false;
        int iNextInt5 = 0;
        boolean zNextBoolean19 = false;
        j52 j52Var = null;
        h93 h93Var = null;
        boolean zNextBoolean20 = false;
        boolean zNextBoolean21 = false;
        int iNextInt6 = -1;
        List listI5 = listA2;
        List listI6 = listI5;
        List listI7 = listI6;
        List listI8 = listI7;
        List listI9 = listI8;
        List listI10 = listI9;
        List listI11 = listI10;
        List listI12 = listI11;
        List list3 = listI12;
        List listI13 = list3;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            String str = strNextName == null ? "" : strNextName;
            String str2 = "id";
            switch (str.hashCode()) {
                case -2138196627:
                    listI9 = listI9;
                    listI10 = listI10;
                    listI11 = listI11;
                    listI12 = listI12;
                    list = listA;
                    listI0 = list3;
                    String str3 = str;
                    list2 = listI13;
                    if (str3.equals("ad_source_instance_name")) {
                        strNextString14 = jsonReader.nextString();
                    } else {
                        jsonReader.skipValue();
                    }
                    listA = list;
                    listI13 = list2;
                    listI12 = listI12;
                    listI11 = listI11;
                    listI10 = listI10;
                    listI9 = listI9;
                    break;
                case -1980587809:
                    listI9 = listI9;
                    listI10 = listI10;
                    listI11 = listI11;
                    listI12 = listI12;
                    list = listA;
                    listI0 = list3;
                    String str4 = str;
                    list2 = listI13;
                    if (str4.equals("debug_signals")) {
                        jSONObjectQ1 = w40.q0(jsonReader);
                    } else {
                        jsonReader.skipValue();
                    }
                    listA = list;
                    listI13 = list2;
                    listI12 = listI12;
                    listI11 = listI11;
                    listI10 = listI10;
                    listI9 = listI9;
                    break;
                case -1965512151:
                    listI9 = listI9;
                    listI10 = listI10;
                    listI11 = listI11;
                    listI12 = listI12;
                    list = listA;
                    listI0 = list3;
                    String str5 = str;
                    list2 = listI13;
                    if (str5.equals("omid_settings")) {
                        jSONObjectQ3 = w40.q0(jsonReader);
                    } else {
                        jsonReader.skipValue();
                    }
                    listA = list;
                    listI13 = list2;
                    listI12 = listI12;
                    listI11 = listI11;
                    listI10 = listI10;
                    listI9 = listI9;
                    break;
                case -1964744830:
                    listI9 = listI9;
                    listI10 = listI10;
                    listI11 = listI11;
                    listI12 = listI12;
                    list = listA;
                    listI0 = list3;
                    String str6 = str;
                    list2 = listI13;
                    if (str6.equals("offline_ad_config")) {
                        ix0 ix0Var = lx0.l9;
                        ix0Var.getClass();
                        if (((Boolean) tu0.e.c.a(ix0Var)).booleanValue()) {
                            JSONObject jSONObjectQ6 = w40.q0(jsonReader);
                            h93Var = new h93(jSONObjectQ6.optInt("impression_prerequisite", 0), jSONObjectQ6.optInt("click_prerequisite", 0), jSONObjectQ6.optBoolean("notification_flow_enabled", false));
                        } else {
                            jsonReader.skipValue();
                        }
                    } else {
                        jsonReader.skipValue();
                    }
                    listA = list;
                    listI13 = list2;
                    listI12 = listI12;
                    listI11 = listI11;
                    listI10 = listI10;
                    listI9 = listI9;
                    break;
                case -1871425831:
                    listI9 = listI9;
                    listI10 = listI10;
                    listI11 = listI11;
                    listI12 = listI12;
                    list = listA;
                    listI0 = list3;
                    String str7 = str;
                    list2 = listI13;
                    if (str7.equals("recursive_server_response_data")) {
                        strNextString17 = jsonReader.nextString();
                        listA = list;
                        listI13 = list2;
                        listI12 = listI12;
                        listI11 = listI11;
                        listI10 = listI10;
                        listI9 = listI9;
                    }
                    jsonReader.skipValue();
                    listA = list;
                    listI13 = list2;
                    listI12 = listI12;
                    listI11 = listI11;
                    listI10 = listI10;
                    listI9 = listI9;
                    break;
                case -1843156475:
                    listI9 = listI9;
                    listI10 = listI10;
                    listI11 = listI11;
                    listI12 = listI12;
                    list = listA;
                    listI0 = list3;
                    String str8 = str;
                    list2 = listI13;
                    if (str8.equals("is_consent")) {
                        zNextBoolean18 = jsonReader.nextBoolean();
                        listA = list;
                        listI13 = list2;
                        listI12 = listI12;
                        listI11 = listI11;
                        listI10 = listI10;
                        listI9 = listI9;
                    }
                    jsonReader.skipValue();
                    listA = list;
                    listI13 = list2;
                    listI12 = listI12;
                    listI11 = listI11;
                    listI10 = listI10;
                    listI9 = listI9;
                    break;
                case -1840512279:
                    listI9 = listI9;
                    listI10 = listI10;
                    listI11 = listI11;
                    listI12 = listI12;
                    list = listA;
                    listI0 = list3;
                    String str9 = str;
                    list2 = listI13;
                    if (str9.equals("presentation_urls")) {
                        listI4 = w40.i0(jsonReader);
                        listA = list;
                        listI13 = list2;
                        listI12 = listI12;
                        listI11 = listI11;
                        listI10 = listI10;
                        listI9 = listI9;
                    }
                    jsonReader.skipValue();
                    listA = list;
                    listI13 = list2;
                    listI12 = listI12;
                    listI11 = listI11;
                    listI10 = listI10;
                    listI9 = listI9;
                    break;
                case -1828733410:
                    listI9 = listI9;
                    listI10 = listI10;
                    listI11 = listI11;
                    listI12 = listI12;
                    list = listA;
                    listI0 = list3;
                    String str10 = str;
                    list2 = listI13;
                    if (str10.equals("network_ping_config")) {
                        ix0 ix0Var2 = lx0.j9;
                        ix0Var2.getClass();
                        if (((Boolean) tu0.e.c.a(ix0Var2)).booleanValue()) {
                            JSONObject jSONObjectOptJSONObject = w40.q0(jsonReader).optJSONObject("ping_strategy");
                            j52Var = new j52(jSONObjectOptJSONObject == null ? new t93(1, 0, 1.0d, false) : new t93(jSONObjectOptJSONObject.optInt("max_attempts", 1), jSONObjectOptJSONObject.optInt("initial_backoff_ms", 0), jSONObjectOptJSONObject.optDouble("backoff_multiplier", 1.0d), jSONObjectOptJSONObject.optBoolean("buffer_after_max_attempts", false)));
                            listA = list;
                            listI13 = list2;
                            listI12 = listI12;
                            listI11 = listI11;
                            listI10 = listI10;
                            listI9 = listI9;
                        } else {
                            jsonReader.skipValue();
                            listA = list;
                            listI13 = list2;
                            listI12 = listI12;
                            listI11 = listI11;
                            listI10 = listI10;
                            listI9 = listI9;
                        }
                    }
                    jsonReader.skipValue();
                    listA = list;
                    listI13 = list2;
                    listI12 = listI12;
                    listI11 = listI11;
                    listI10 = listI10;
                    listI9 = listI9;
                    break;
                case -1812055556:
                    listI9 = listI9;
                    listI10 = listI10;
                    listI11 = listI11;
                    listI12 = listI12;
                    list = listA;
                    listI0 = list3;
                    String str11 = str;
                    list2 = listI13;
                    if (str11.equals("play_prewarm_options")) {
                        JSONObject jSONObjectQ7 = w40.q0(jsonReader);
                        u61Var = new u61(jSONObjectQ7.optString("prefetch_url", ""), jSONObjectQ7.optBoolean("enable_prewarming", false), jSONObjectQ7.optBoolean("skip_offline_notification_flow", false));
                        listA = list;
                        listI13 = list2;
                        listI12 = listI12;
                        listI11 = listI11;
                        listI10 = listI10;
                        listI9 = listI9;
                    }
                    jsonReader.skipValue();
                    listA = list;
                    listI13 = list2;
                    listI12 = listI12;
                    listI11 = listI11;
                    listI10 = listI10;
                    listI9 = listI9;
                    break;
                case -1785028569:
                    listI9 = listI9;
                    listI10 = listI10;
                    listI11 = listI11;
                    listI12 = listI12;
                    list = listA;
                    listI0 = list3;
                    String str12 = str;
                    list2 = listI13;
                    if (str12.equals("parallel_key")) {
                        strNextString19 = jsonReader.nextString();
                        listA = list;
                        listI13 = list2;
                        listI12 = listI12;
                        listI11 = listI11;
                        listI10 = listI10;
                        listI9 = listI9;
                    }
                    jsonReader.skipValue();
                    listA = list;
                    listI13 = list2;
                    listI12 = listI12;
                    listI11 = listI11;
                    listI10 = listI10;
                    listI9 = listI9;
                    break;
                case -1776946669:
                    listI9 = listI9;
                    listI10 = listI10;
                    listI11 = listI11;
                    listI12 = listI12;
                    list = listA;
                    listI0 = list3;
                    String str13 = str;
                    list2 = listI13;
                    if (str13.equals("ad_source_name")) {
                        strNextString12 = jsonReader.nextString();
                        listA = list;
                        listI13 = list2;
                        listI12 = listI12;
                        listI11 = listI11;
                        listI10 = listI10;
                        listI9 = listI9;
                    }
                    jsonReader.skipValue();
                    listA = list;
                    listI13 = list2;
                    listI12 = listI12;
                    listI11 = listI11;
                    listI10 = listI10;
                    listI9 = listI9;
                    break;
                case -1662989631:
                    listI9 = listI9;
                    listI10 = listI10;
                    listI11 = listI11;
                    listI12 = listI12;
                    list = listA;
                    listI0 = list3;
                    String str14 = str;
                    list2 = listI13;
                    if (str14.equals("is_interscroller")) {
                        zNextBoolean12 = jsonReader.nextBoolean();
                        listA = list;
                        listI13 = list2;
                        listI12 = listI12;
                        listI11 = listI11;
                        listI10 = listI10;
                        listI9 = listI9;
                    }
                    jsonReader.skipValue();
                    listA = list;
                    listI13 = list2;
                    listI12 = listI12;
                    listI11 = listI11;
                    listI10 = listI10;
                    listI9 = listI9;
                    break;
                case -1620470467:
                    listI9 = listI9;
                    listI10 = listI10;
                    listI11 = listI11;
                    listI12 = listI12;
                    list = listA;
                    listI0 = list3;
                    String str15 = str;
                    list2 = listI13;
                    if (str15.equals("backend_query_id")) {
                        strNextString9 = jsonReader.nextString();
                        listA = list;
                        listI13 = list2;
                        listI12 = listI12;
                        listI11 = listI11;
                        listI10 = listI10;
                        listI9 = listI9;
                    }
                    jsonReader.skipValue();
                    listA = list;
                    listI13 = list2;
                    listI12 = listI12;
                    listI11 = listI11;
                    listI10 = listI10;
                    listI9 = listI9;
                    break;
                case -1550155393:
                    listI9 = listI9;
                    listI10 = listI10;
                    listI11 = listI11;
                    listI12 = listI12;
                    list = listA;
                    listI0 = list3;
                    String str16 = str;
                    list2 = listI13;
                    if (str16.equals("nofill_urls")) {
                        listI12 = w40.i0(jsonReader);
                        listA = list;
                        listI13 = list2;
                        listI11 = listI11;
                        listI10 = listI10;
                        listI9 = listI9;
                    }
                    jsonReader.skipValue();
                    listA = list;
                    listI13 = list2;
                    listI12 = listI12;
                    listI11 = listI11;
                    listI10 = listI10;
                    listI9 = listI9;
                    break;
                case -1440104884:
                    listI9 = listI9;
                    listI10 = listI10;
                    listI11 = listI11;
                    listI12 = listI12;
                    list = listA;
                    listI0 = list3;
                    String str17 = str;
                    list2 = listI13;
                    if (str17.equals("is_custom_close_blocked")) {
                        zNextBoolean6 = jsonReader.nextBoolean();
                        listA = list;
                        listI13 = list2;
                        listI12 = listI12;
                        listI11 = listI11;
                        listI10 = listI10;
                        listI9 = listI9;
                    }
                    jsonReader.skipValue();
                    listA = list;
                    listI13 = list2;
                    listI12 = listI12;
                    listI11 = listI11;
                    listI10 = listI10;
                    listI9 = listI9;
                    break;
                case -1439500848:
                    listI9 = listI9;
                    listI10 = listI10;
                    listI11 = listI11;
                    listI12 = listI12;
                    list = listA;
                    listI0 = list3;
                    String str18 = str;
                    list2 = listI13;
                    if (str18.equals("orientation")) {
                        String strNextString21 = jsonReader.nextString();
                        i4 = "landscape".equalsIgnoreCase(strNextString21) ? 6 : "portrait".equalsIgnoreCase(strNextString21) ? 7 : -1;
                        listA = list;
                        listI13 = list2;
                        listI12 = listI12;
                        listI11 = listI11;
                        listI10 = listI10;
                        listI9 = listI9;
                    }
                    jsonReader.skipValue();
                    listA = list;
                    listI13 = list2;
                    listI12 = listI12;
                    listI11 = listI11;
                    listI10 = listI10;
                    listI9 = listI9;
                    break;
                case -1428969291:
                    listI9 = listI9;
                    listI10 = listI10;
                    listI11 = listI11;
                    listI12 = listI12;
                    list = listA;
                    listI0 = list3;
                    String str19 = str;
                    list2 = listI13;
                    if (str19.equals("enable_omid")) {
                        zNextBoolean8 = jsonReader.nextBoolean();
                        listA = list;
                        listI13 = list2;
                        listI12 = listI12;
                        listI11 = listI11;
                        listI10 = listI10;
                        listI9 = listI9;
                    }
                    jsonReader.skipValue();
                    listA = list;
                    listI13 = list2;
                    listI12 = listI12;
                    listI11 = listI11;
                    listI10 = listI10;
                    listI9 = listI9;
                    break;
                case -1406227629:
                    listI9 = listI9;
                    listI10 = listI10;
                    listI11 = listI11;
                    listI12 = listI12;
                    list = listA;
                    listI0 = list3;
                    String str20 = str;
                    list2 = listI13;
                    if (str20.equals("buffer_click_url_as_ready_to_ping")) {
                        zNextBoolean16 = jsonReader.nextBoolean();
                        listA = list;
                        listI13 = list2;
                        listI12 = listI12;
                        listI11 = listI11;
                        listI10 = listI10;
                        listI9 = listI9;
                    }
                    jsonReader.skipValue();
                    listA = list;
                    listI13 = list2;
                    listI12 = listI12;
                    listI11 = listI11;
                    listI10 = listI10;
                    listI9 = listI9;
                    break;
                case -1403779768:
                    listI9 = listI9;
                    listI10 = listI10;
                    listI11 = listI11;
                    listI12 = listI12;
                    list = listA;
                    listI0 = list3;
                    String str21 = str;
                    list2 = listI13;
                    if (str21.equals("showable_impression_type")) {
                        iNextInt3 = jsonReader.nextInt();
                        listA = list;
                        listI13 = list2;
                        listI12 = listI12;
                        listI11 = listI11;
                        listI10 = listI10;
                        listI9 = listI9;
                    }
                    jsonReader.skipValue();
                    listA = list;
                    listI13 = list2;
                    listI12 = listI12;
                    listI11 = listI11;
                    listI10 = listI10;
                    listI9 = listI9;
                    break;
                case -1375413093:
                    listI9 = listI9;
                    listI10 = listI10;
                    listI11 = listI11;
                    listI12 = listI12;
                    list = listA;
                    listI0 = list3;
                    String str22 = str;
                    list2 = listI13;
                    if (str22.equals("ad_cover")) {
                        jSONObjectQ4 = w40.q0(jsonReader);
                        listA = list;
                        listI13 = list2;
                        listI12 = listI12;
                        listI11 = listI11;
                        listI10 = listI10;
                        listI9 = listI9;
                    }
                    jsonReader.skipValue();
                    listA = list;
                    listI13 = list2;
                    listI12 = listI12;
                    listI11 = listI11;
                    listI10 = listI10;
                    listI9 = listI9;
                    break;
                case -1360811658:
                    listI9 = listI9;
                    listI10 = listI10;
                    listI11 = listI11;
                    listI12 = listI12;
                    list = listA;
                    listI0 = list3;
                    String str23 = str;
                    list2 = listI13;
                    if (str23.equals("ad_sizes")) {
                        listA2 = y42.a(jsonReader);
                        listA = list;
                        listI13 = list2;
                        listI12 = listI12;
                        listI11 = listI11;
                        listI10 = listI10;
                        listI9 = listI9;
                    }
                    jsonReader.skipValue();
                    listA = list;
                    listI13 = list2;
                    listI12 = listI12;
                    listI11 = listI11;
                    listI10 = listI10;
                    listI9 = listI9;
                    break;
                case -1306015996:
                    listI9 = listI9;
                    listI10 = listI10;
                    listI11 = listI11;
                    listI12 = listI12;
                    list = listA;
                    listI0 = list3;
                    String str24 = str;
                    list2 = listI13;
                    if (str24.equals("adapters")) {
                        listI2 = w40.i0(jsonReader);
                        listA = list;
                        listI13 = list2;
                        listI12 = listI12;
                        listI11 = listI11;
                        listI10 = listI10;
                        listI9 = listI9;
                    }
                    jsonReader.skipValue();
                    listA = list;
                    listI13 = list2;
                    listI12 = listI12;
                    listI11 = listI11;
                    listI10 = listI10;
                    listI9 = listI9;
                    break;
                case -1303332046:
                    listI9 = listI9;
                    listI10 = listI10;
                    listI11 = listI11;
                    listI12 = listI12;
                    list = listA;
                    listI0 = list3;
                    String str25 = str;
                    list2 = listI13;
                    if (str25.equals("test_mode_enabled")) {
                        zNextBoolean5 = jsonReader.nextBoolean();
                        listA = list;
                        listI13 = list2;
                        listI12 = listI12;
                        listI11 = listI11;
                        listI10 = listI10;
                        listI9 = listI9;
                    }
                    jsonReader.skipValue();
                    listA = list;
                    listI13 = list2;
                    listI12 = listI12;
                    listI11 = listI11;
                    listI10 = listI10;
                    listI9 = listI9;
                    break;
                case -1289032093:
                    listI9 = listI9;
                    listI10 = listI10;
                    listI11 = listI11;
                    listI12 = listI12;
                    list = listA;
                    listI0 = list3;
                    String str26 = str;
                    list2 = listI13;
                    if (str26.equals("extras")) {
                        jSONObjectQ2 = w40.q0(jsonReader);
                        listA = list;
                        listI13 = list2;
                        listI12 = listI12;
                        listI11 = listI11;
                        listI10 = listI10;
                        listI9 = listI9;
                    }
                    jsonReader.skipValue();
                    listA = list;
                    listI13 = list2;
                    listI12 = listI12;
                    listI11 = listI11;
                    listI10 = listI10;
                    listI9 = listI9;
                    break;
                case -1240082064:
                    listI9 = listI9;
                    listI10 = listI10;
                    listI11 = listI11;
                    listI12 = listI12;
                    list = listA;
                    listI0 = list3;
                    String str27 = str;
                    list2 = listI13;
                    if (str27.equals("ad_event_value")) {
                        JSONObject jSONObjectQ8 = w40.q0(jsonReader);
                        qc3Var = new qc3(jSONObjectQ8.getInt("type_num"), jSONObjectQ8.getInt("precision_num"), jSONObjectQ8.getLong("value"), jSONObjectQ8.getString("currency"));
                        listA = list;
                        listI13 = list2;
                        listI12 = listI12;
                        listI11 = listI11;
                        listI10 = listI10;
                        listI9 = listI9;
                    }
                    jsonReader.skipValue();
                    listA = list;
                    listI13 = list2;
                    listI12 = listI12;
                    listI11 = listI11;
                    listI10 = listI10;
                    listI9 = listI9;
                    break;
                case -1234181075:
                    listI9 = listI9;
                    listI10 = listI10;
                    listI11 = listI11;
                    listI12 = listI12;
                    list = listA;
                    listI0 = list3;
                    String str28 = str;
                    list2 = listI13;
                    if (str28.equals("allow_pub_rendered_attribution")) {
                        zNextBoolean = jsonReader.nextBoolean();
                        listA = list;
                        listI13 = list2;
                        listI12 = listI12;
                        listI11 = listI11;
                        listI10 = listI10;
                        listI9 = listI9;
                    }
                    jsonReader.skipValue();
                    listA = list;
                    listI13 = list2;
                    listI12 = listI12;
                    listI11 = listI11;
                    listI10 = listI10;
                    listI9 = listI9;
                    break;
                case -1168140544:
                    listI9 = listI9;
                    listI10 = listI10;
                    listI11 = listI11;
                    listI12 = listI12;
                    list = listA;
                    listI0 = list3;
                    String str29 = str;
                    list2 = listI13;
                    if (str29.equals("presentation_error_urls")) {
                        listI0 = w40.i0(jsonReader);
                        listA = list;
                        listI13 = list2;
                        listI12 = listI12;
                        listI11 = listI11;
                        listI10 = listI10;
                        listI9 = listI9;
                    }
                    jsonReader.skipValue();
                    listA = list;
                    listI13 = list2;
                    listI12 = listI12;
                    listI11 = listI11;
                    listI10 = listI10;
                    listI9 = listI9;
                    break;
                case -1152230954:
                    listI9 = listI9;
                    listI10 = listI10;
                    listI11 = listI11;
                    listI12 = listI12;
                    list = listA;
                    listI0 = list3;
                    String str30 = str;
                    list2 = listI13;
                    if (str30.equals("ad_type")) {
                        String strNextString22 = jsonReader.nextString();
                        if ("banner".equals(strNextString22)) {
                            i2 = 1;
                        } else {
                            if ("interstitial".equals(strNextString22)) {
                                i = 2;
                            } else if ("native_express".equals(strNextString22)) {
                                i2 = 3;
                            } else if ("native".equals(strNextString22)) {
                                i2 = 4;
                            } else if ("rewarded".equals(strNextString22)) {
                                i = 5;
                            } else {
                                i2 = "app_open_ad".equals(strNextString22) ? 6 : "rewarded_interstitial".equals(strNextString22) ? 7 : 0;
                            }
                            i2 = i;
                        }
                        listA = list;
                        listI13 = list2;
                        listI12 = listI12;
                        listI11 = listI11;
                        listI10 = listI10;
                        listI9 = listI9;
                    }
                    jsonReader.skipValue();
                    listA = list;
                    listI13 = list2;
                    listI12 = listI12;
                    listI11 = listI11;
                    listI10 = listI10;
                    listI9 = listI9;
                    break;
                case -1146534047:
                    listI9 = listI9;
                    listI10 = listI10;
                    listI11 = listI11;
                    listI12 = listI12;
                    list = listA;
                    listI0 = list3;
                    String str31 = str;
                    list2 = listI13;
                    if (str31.equals("is_scroll_aware")) {
                        zNextBoolean10 = jsonReader.nextBoolean();
                        listA = list;
                        listI13 = list2;
                        listI12 = listI12;
                        listI11 = listI11;
                        listI10 = listI10;
                        listI9 = listI9;
                    }
                    jsonReader.skipValue();
                    listA = list;
                    listI13 = list2;
                    listI12 = listI12;
                    listI11 = listI11;
                    listI10 = listI10;
                    listI9 = listI9;
                    break;
                case -1115838944:
                    listI9 = listI9;
                    listI10 = listI10;
                    listI11 = listI11;
                    listI12 = listI12;
                    list = listA;
                    listI0 = list3;
                    String str32 = str;
                    list2 = listI13;
                    if (str32.equals("fill_urls")) {
                        listI11 = w40.i0(jsonReader);
                        listA = list;
                        listI13 = list2;
                        listI12 = listI12;
                        listI10 = listI10;
                        listI9 = listI9;
                    }
                    jsonReader.skipValue();
                    listA = list;
                    listI13 = list2;
                    listI12 = listI12;
                    listI11 = listI11;
                    listI10 = listI10;
                    listI9 = listI9;
                    break;
                case -1081936678:
                    listI9 = listI9;
                    listI10 = listI10;
                    listI11 = listI11;
                    listI12 = listI12;
                    list = listA;
                    listI0 = list3;
                    String str33 = str;
                    list2 = listI13;
                    if (str33.equals("allocation_id")) {
                        strNextString3 = jsonReader.nextString();
                        listA = list;
                        listI13 = list2;
                        listI12 = listI12;
                        listI11 = listI11;
                        listI10 = listI10;
                        listI9 = listI9;
                    }
                    jsonReader.skipValue();
                    listA = list;
                    listI13 = list2;
                    listI12 = listI12;
                    listI11 = listI11;
                    listI10 = listI10;
                    listI9 = listI9;
                    break;
                case -1078050970:
                    listI9 = listI9;
                    listI10 = listI10;
                    listI11 = listI11;
                    listI12 = listI12;
                    list = listA;
                    listI0 = list3;
                    String str34 = str;
                    list2 = listI13;
                    if (str34.equals("video_complete_urls")) {
                        listI10 = w40.i0(jsonReader);
                        listA = list;
                        listI13 = list2;
                        listI12 = listI12;
                        listI11 = listI11;
                        listI9 = listI9;
                    }
                    jsonReader.skipValue();
                    listA = list;
                    listI13 = list2;
                    listI12 = listI12;
                    listI11 = listI11;
                    listI10 = listI10;
                    listI9 = listI9;
                    break;
                case -1051269058:
                    listI9 = listI9;
                    listI10 = listI10;
                    listI11 = listI11;
                    listI12 = listI12;
                    list = listA;
                    listI0 = list3;
                    String str35 = str;
                    list2 = listI13;
                    if (str35.equals("active_view")) {
                        string = w40.q0(jsonReader).toString();
                        listA = list;
                        listI13 = list2;
                        listI12 = listI12;
                        listI11 = listI11;
                        listI10 = listI10;
                        listI9 = listI9;
                    }
                    jsonReader.skipValue();
                    listA = list;
                    listI13 = list2;
                    listI12 = listI12;
                    listI11 = listI11;
                    listI10 = listI10;
                    listI9 = listI9;
                    break;
                case -982608540:
                    listI9 = listI9;
                    listI10 = listI10;
                    listI11 = listI11;
                    listI12 = listI12;
                    list = listA;
                    listI0 = list3;
                    String str36 = str;
                    list2 = listI13;
                    if (str36.equals("valid_from_timestamp")) {
                        strNextString2 = jsonReader.nextString();
                        listA = list;
                        listI13 = list2;
                        listI12 = listI12;
                        listI11 = listI11;
                        listI10 = listI10;
                        listI9 = listI9;
                    }
                    jsonReader.skipValue();
                    listA = list;
                    listI13 = list2;
                    listI12 = listI12;
                    listI11 = listI11;
                    listI10 = listI10;
                    listI9 = listI9;
                    break;
                case -972056451:
                    listI9 = listI9;
                    listI10 = listI10;
                    listI11 = listI11;
                    listI12 = listI12;
                    list = listA;
                    listI0 = list3;
                    String str37 = str;
                    list2 = listI13;
                    if (str37.equals("ad_source_instance_id")) {
                        strNextString15 = jsonReader.nextString();
                        listA = list;
                        listI13 = list2;
                        listI12 = listI12;
                        listI11 = listI11;
                        listI10 = listI10;
                        listI9 = listI9;
                    }
                    jsonReader.skipValue();
                    listA = list;
                    listI13 = list2;
                    listI12 = listI12;
                    listI11 = listI11;
                    listI10 = listI10;
                    listI9 = listI9;
                    break;
                case -776859333:
                    listI9 = listI9;
                    listI10 = listI10;
                    listI11 = listI11;
                    listI12 = listI12;
                    list = listA;
                    listI0 = list3;
                    String str38 = str;
                    list2 = listI13;
                    if (str38.equals("click_urls")) {
                        listI5 = w40.i0(jsonReader);
                        listA = list;
                        listI13 = list2;
                        listI12 = listI12;
                        listI11 = listI11;
                        listI10 = listI10;
                        listI9 = listI9;
                    }
                    jsonReader.skipValue();
                    listA = list;
                    listI13 = list2;
                    listI12 = listI12;
                    listI11 = listI11;
                    listI10 = listI10;
                    listI9 = listI9;
                    break;
                case -652881372:
                    list = listA;
                    listI0 = list3;
                    String str39 = str;
                    list2 = listI13;
                    jsonReader = jsonReader;
                    if (str39.equals("on_device_storage_configs")) {
                        ix0 ix0Var3 = lx0.l8;
                        ix0Var3.getClass();
                        if (((Boolean) tu0.e.c.a(ix0Var3)).booleanValue()) {
                            tj2 tj2Var2 = vj2.g;
                            String str40 = "initialCapacity";
                            w40.k0("initialCapacity", 4);
                            Object[] objArrCopyOf = new Object[4];
                            jsonReader.beginArray();
                            int i5 = 0;
                            while (jsonReader.hasNext()) {
                                qk2 qk2Var2 = qk2.j;
                                jsonReader.beginObject();
                                qk2 qk2VarO = qk2Var2;
                                Long lValueOf = null;
                                while (jsonReader.hasNext()) {
                                    String strNextName2 = jsonReader.nextName();
                                    if (Objects.equals(strNextName2, str2)) {
                                        lValueOf = Long.valueOf(jsonReader.nextLong());
                                    } else {
                                        String str41 = str2;
                                        if (Objects.equals(strNextName2, "event_types")) {
                                            w40.k0(str40, 4);
                                            Object[] objArrCopyOf2 = new Object[4];
                                            jsonReader.beginArray();
                                            int i6 = 0;
                                            while (jsonReader.hasNext()) {
                                                Integer numValueOf = Integer.valueOf(jsonReader.nextInt());
                                                String str42 = str40;
                                                int length = objArrCopyOf2.length;
                                                List list4 = listI12;
                                                int i7 = i6 + 1;
                                                List list5 = listI11;
                                                int iD = pj2.d(length, i7);
                                                if (iD > length) {
                                                    objArrCopyOf2 = Arrays.copyOf(objArrCopyOf2, iD);
                                                }
                                                objArrCopyOf2[i6] = numValueOf;
                                                i6 = i7;
                                                str40 = str42;
                                                listI12 = list4;
                                                listI11 = list5;
                                            }
                                            jsonReader.endArray();
                                            qk2VarO = vj2.o(objArrCopyOf2, i6);
                                        } else {
                                            jsonReader.skipValue();
                                        }
                                        str2 = str41;
                                    }
                                }
                                List list6 = listI11;
                                List list7 = listI12;
                                String str43 = str40;
                                String str44 = str2;
                                jsonReader.endObject();
                                if (lValueOf == null || qk2VarO.isEmpty()) {
                                    ps1Var = null;
                                } else {
                                    long jLongValue = lValueOf.longValue();
                                    qk2 qk2Var3 = qk2VarO;
                                    int i8 = qk2Var3.i;
                                    int[] iArr = new int[i8];
                                    for (int i9 = 0; i9 < i8; i9++) {
                                        iArr[i9] = ((Integer) qk2Var3.get(i9)).intValue();
                                    }
                                    ps1Var = new ps1(jLongValue, iArr);
                                }
                                if (ps1Var != null) {
                                    int length2 = objArrCopyOf.length;
                                    int i10 = i5 + 1;
                                    int iD2 = pj2.d(length2, i10);
                                    objArrCopyOf = iD2 > length2 ? Arrays.copyOf(objArrCopyOf, iD2) : objArrCopyOf;
                                    objArrCopyOf[i5] = ps1Var;
                                    i5 = i10;
                                }
                                str40 = str43;
                                str2 = str44;
                                listI12 = list7;
                                listI11 = list6;
                                listI10 = listI10;
                                listI9 = listI9;
                            }
                            listI9 = listI9;
                            jsonReader.endArray();
                            listO = vj2.o(objArrCopyOf, i5);
                            listA = list;
                            listI13 = list2;
                            listI9 = listI9;
                        } else {
                            listI9 = listI9;
                            listI10 = listI10;
                            listI11 = listI11;
                            listI12 = listI12;
                            jsonReader.skipValue();
                            listA = list;
                            listI13 = list2;
                            listI12 = listI12;
                            listI11 = listI11;
                            listI10 = listI10;
                            listI9 = listI9;
                        }
                    } else {
                        listI9 = listI9;
                        listI10 = listI10;
                        listI11 = listI11;
                        listI12 = listI12;
                        jsonReader.skipValue();
                        listA = list;
                        listI13 = list2;
                        listI12 = listI12;
                        listI11 = listI11;
                        listI10 = listI10;
                        listI9 = listI9;
                    }
                    break;
                case -570101180:
                    list = listA;
                    listI0 = list3;
                    String str45 = str;
                    list2 = listI13;
                    if (str45.equals("late_load_urls")) {
                        listI3 = w40.i0(jsonReader);
                        listA = list;
                        listI13 = list2;
                    } else {
                        listI9 = listI9;
                        listI10 = listI10;
                        listI11 = listI11;
                        listI12 = listI12;
                        jsonReader.skipValue();
                        listA = list;
                        listI13 = list2;
                        listI12 = listI12;
                        listI11 = listI11;
                        listI10 = listI10;
                        listI9 = listI9;
                    }
                    break;
                case -544216775:
                    list = listA;
                    listI0 = list3;
                    String str46 = str;
                    list2 = listI13;
                    if (str46.equals("safe_browsing")) {
                        JSONObject jSONObjectQ9 = w40.q0(jsonReader);
                        e91 e91Var2 = new e91(jSONObjectQ9.optString("click_string", ""), jSONObjectQ9.optString("report_url", ""), jSONObjectQ9.optBoolean("rendered_ad_enabled", false), jSONObjectQ9.optBoolean("non_malicious_reporting_enabled", false), w40.X(jSONObjectQ9.optJSONArray("allowed_headers"), null), jSONObjectQ9.optBoolean("protection_enabled", false), jSONObjectQ9.optBoolean("malicious_reporting_enabled", false), w40.X(jSONObjectQ9.optJSONArray("webview_permissions"), null));
                        listA = list;
                        listI13 = list2;
                        e91Var = e91Var2;
                    }
                    jsonReader.skipValue();
                    listA = list;
                    listI13 = list2;
                    listI12 = listI12;
                    listI11 = listI11;
                    listI10 = listI10;
                    listI9 = listI9;
                    break;
                case -437057161:
                    list = listA;
                    listI0 = list3;
                    String str47 = str;
                    list2 = listI13;
                    if (str47.equals("imp_urls")) {
                        listI6 = w40.i0(jsonReader);
                        listA = list;
                        listI13 = list2;
                    }
                    jsonReader.skipValue();
                    listA = list;
                    listI13 = list2;
                    listI12 = listI12;
                    listI11 = listI11;
                    listI10 = listI10;
                    listI9 = listI9;
                    break;
                case -404433734:
                    list = listA;
                    listI0 = list3;
                    String str48 = str;
                    list2 = listI13;
                    if (str48.equals("rtb_native_required_assets")) {
                        jSONObjectQ5 = w40.q0(jsonReader);
                        listA = list;
                        listI13 = list2;
                    }
                    jsonReader.skipValue();
                    listA = list;
                    listI13 = list2;
                    listI12 = listI12;
                    listI11 = listI11;
                    listI10 = listI10;
                    listI9 = listI9;
                    break;
                case -404326515:
                    list = listA;
                    listI0 = list3;
                    String str49 = str;
                    list2 = listI13;
                    if (str49.equals("render_timeout_ms")) {
                        iNextInt2 = jsonReader.nextInt();
                        listA = list;
                        listI13 = list2;
                    }
                    jsonReader.skipValue();
                    listA = list;
                    listI13 = list2;
                    listI12 = listI12;
                    listI11 = listI11;
                    listI10 = listI10;
                    listI9 = listI9;
                    break;
                case -397704715:
                    list = listA;
                    listI0 = list3;
                    String str50 = str;
                    list2 = listI13;
                    if (str50.equals("ad_close_time_ms")) {
                        iNextInt4 = jsonReader.nextInt();
                        listA = list;
                        listI13 = list2;
                    }
                    jsonReader.skipValue();
                    listA = list;
                    listI13 = list2;
                    listI12 = listI12;
                    listI11 = listI11;
                    listI10 = listI10;
                    listI9 = listI9;
                    break;
                case -388807511:
                    list = listA;
                    listI0 = list3;
                    String str51 = str;
                    list2 = listI13;
                    if (str51.equals("content_url")) {
                        strNextString20 = jsonReader.nextString();
                        listA = list;
                        listI13 = list2;
                    }
                    jsonReader.skipValue();
                    listA = list;
                    listI13 = list2;
                    listI12 = listI12;
                    listI11 = listI11;
                    listI10 = listI10;
                    listI9 = listI9;
                    break;
                case -369773488:
                    list = listA;
                    listI0 = list3;
                    String str52 = str;
                    list2 = listI13;
                    if (str52.equals("is_close_button_enabled")) {
                        jsonReader.nextBoolean();
                        listA = list;
                        listI13 = list2;
                        listI12 = listI12;
                        listI11 = listI11;
                        listI10 = listI10;
                        listI9 = listI9;
                    }
                    jsonReader.skipValue();
                    listA = list;
                    listI13 = list2;
                    listI12 = listI12;
                    listI11 = listI11;
                    listI10 = listI10;
                    listI9 = listI9;
                    break;
                case -213449460:
                    list = listA;
                    listI0 = list3;
                    String str53 = str;
                    list2 = listI13;
                    if (str53.equals("force_disable_hardware_acceleration")) {
                        zNextBoolean15 = jsonReader.nextBoolean();
                        listA = list;
                        listI13 = list2;
                    }
                    jsonReader.skipValue();
                    listA = list;
                    listI13 = list2;
                    listI12 = listI12;
                    listI11 = listI11;
                    listI10 = listI10;
                    listI9 = listI9;
                    break;
                case -213424028:
                    list = listA;
                    listI0 = list3;
                    String str54 = str;
                    list2 = listI13;
                    if (str54.equals("watermark")) {
                        strNextString8 = jsonReader.nextString();
                        listA = list;
                        listI13 = list2;
                    }
                    jsonReader.skipValue();
                    listA = list;
                    listI13 = list2;
                    listI12 = listI12;
                    listI11 = listI11;
                    listI10 = listI10;
                    listI9 = listI9;
                    break;
                case -180214626:
                    list = listA;
                    listI0 = list3;
                    String str55 = str;
                    list2 = listI13;
                    if (str55.equals("native_required_asset_viewability")) {
                        zNextBoolean14 = jsonReader.nextBoolean();
                        listA = list;
                        listI13 = list2;
                    }
                    jsonReader.skipValue();
                    listA = list;
                    listI13 = list2;
                    listI12 = listI12;
                    listI11 = listI11;
                    listI10 = listI10;
                    listI9 = listI9;
                    break;
                case -154616268:
                    list = listA;
                    listI0 = list3;
                    String str56 = str;
                    list2 = listI13;
                    if (str56.equals("is_offline_ad")) {
                        zNextBoolean13 = jsonReader.nextBoolean();
                        listA = list;
                        listI13 = list2;
                    }
                    jsonReader.skipValue();
                    listA = list;
                    listI13 = list2;
                    listI12 = listI12;
                    listI11 = listI11;
                    listI10 = listI10;
                    listI9 = listI9;
                    break;
                case -29338502:
                    list = listA;
                    listI0 = list3;
                    String str57 = str;
                    list2 = listI13;
                    if (str57.equals("allow_custom_click_gesture")) {
                        zNextBoolean3 = jsonReader.nextBoolean();
                        listA = list;
                        listI13 = list2;
                    }
                    jsonReader.skipValue();
                    listA = list;
                    listI13 = list2;
                    listI12 = listI12;
                    listI11 = listI11;
                    listI10 = listI10;
                    listI9 = listI9;
                    break;
                case 3107:
                    list = listA;
                    listI0 = list3;
                    String str58 = str;
                    list2 = listI13;
                    if (str58.equals("ad")) {
                        b52Var = new b52(jsonReader);
                        listA = list;
                        listI13 = list2;
                    } else {
                        jsonReader.skipValue();
                        listA = list;
                        listI13 = list2;
                        listI12 = listI12;
                        listI11 = listI11;
                        listI10 = listI10;
                        listI9 = listI9;
                    }
                    break;
                case 3355:
                    list = listA;
                    listI0 = list3;
                    String str59 = str;
                    list2 = listI13;
                    if (str59.equals("id")) {
                        strNextString4 = jsonReader.nextString();
                        listA = list;
                        listI13 = list2;
                    }
                    jsonReader.skipValue();
                    listA = list;
                    listI13 = list2;
                    listI12 = listI12;
                    listI11 = listI11;
                    listI10 = listI10;
                    listI9 = listI9;
                    break;
                case 3076010:
                    list = listA;
                    listI0 = list3;
                    String str60 = str;
                    list2 = listI13;
                    if (str60.equals("data")) {
                        jSONObjectQ0 = w40.q0(jsonReader);
                        listA = list;
                        listI13 = list2;
                    }
                    jsonReader.skipValue();
                    listA = list;
                    listI13 = list2;
                    listI12 = listI12;
                    listI11 = listI11;
                    listI10 = listI10;
                    listI9 = listI9;
                    break;
                case 37109963:
                    list = listA;
                    listI0 = list3;
                    String str61 = str;
                    list2 = listI13;
                    if (str61.equals("request_id")) {
                        strNextString16 = jsonReader.nextString();
                        listA = list;
                        listI13 = list2;
                    }
                    jsonReader.skipValue();
                    listA = list;
                    listI13 = list2;
                    listI12 = listI12;
                    listI11 = listI11;
                    listI10 = listI10;
                    listI9 = listI9;
                    break;
                case 63195984:
                    list = listA;
                    listI0 = list3;
                    String str62 = str;
                    list2 = listI13;
                    if (str62.equals("render_test_label")) {
                        zNextBoolean4 = jsonReader.nextBoolean();
                        listA = list;
                        listI13 = list2;
                    }
                    jsonReader.skipValue();
                    listA = list;
                    listI13 = list2;
                    listI12 = listI12;
                    listI11 = listI11;
                    listI10 = listI10;
                    listI9 = listI9;
                    break;
                case 107433883:
                    list = listA;
                    listI0 = list3;
                    String str63 = str;
                    list2 = listI13;
                    if (str63.equals("qdata")) {
                        strNextString5 = jsonReader.nextString();
                        listA = list;
                        listI13 = list2;
                    }
                    jsonReader.skipValue();
                    listA = list;
                    listI13 = list2;
                    listI12 = listI12;
                    listI11 = listI11;
                    listI10 = listI10;
                    listI9 = listI9;
                    break;
                case 230323073:
                    list = listA;
                    listI0 = list3;
                    String str64 = str;
                    list2 = listI13;
                    if (str64.equals("ad_load_urls")) {
                        listI7 = w40.i0(jsonReader);
                        listA = list;
                        listI13 = list2;
                    }
                    jsonReader.skipValue();
                    listA = list;
                    listI13 = list2;
                    listI12 = listI12;
                    listI11 = listI11;
                    listI10 = listI10;
                    listI9 = listI9;
                    break;
                case 418392395:
                    list = listA;
                    listI0 = list3;
                    String str65 = str;
                    list2 = listI13;
                    if (str65.equals("is_closable_area_disabled")) {
                        zNextBoolean7 = jsonReader.nextBoolean();
                        listA = list;
                        listI13 = list2;
                    }
                    jsonReader.skipValue();
                    listA = list;
                    listI13 = list2;
                    listI12 = listI12;
                    listI11 = listI11;
                    listI10 = listI10;
                    listI9 = listI9;
                    break;
                case 542250332:
                    list = listA;
                    listI0 = list3;
                    String str66 = str;
                    list2 = listI13;
                    if (str66.equals("consent_form_action_identifier")) {
                        iNextInt5 = jsonReader.nextInt();
                        listA = list;
                        listI13 = list2;
                    }
                    jsonReader.skipValue();
                    listA = list;
                    listI13 = list2;
                    listI12 = listI12;
                    listI11 = listI11;
                    listI10 = listI10;
                    listI9 = listI9;
                    break;
                case 549176928:
                    list = listA;
                    listI0 = list3;
                    String str67 = str;
                    list2 = listI13;
                    if (str67.equals("presentation_error_timeout_ms")) {
                        iNextInt = jsonReader.nextInt();
                        listA = list;
                        listI13 = list2;
                    }
                    jsonReader.skipValue();
                    listA = list;
                    listI13 = list2;
                    listI12 = listI12;
                    listI11 = listI11;
                    listI10 = listI10;
                    listI9 = listI9;
                    break;
                case 597473788:
                    list = listA;
                    listI0 = list3;
                    String str68 = str;
                    list2 = listI13;
                    if (str68.equals("debug_dialog_string")) {
                        strNextString6 = jsonReader.nextString();
                        listA = list;
                        listI13 = list2;
                    }
                    jsonReader.skipValue();
                    listA = list;
                    listI13 = list2;
                    listI12 = listI12;
                    listI11 = listI11;
                    listI10 = listI10;
                    listI9 = listI9;
                    break;
                case 754887508:
                    list = listA;
                    listI0 = list3;
                    String str69 = str;
                    list2 = listI13;
                    if (str69.equals("container_sizes")) {
                        listA = y42.a(jsonReader);
                        listI13 = list2;
                    }
                    jsonReader.skipValue();
                    listA = list;
                    listI13 = list2;
                    listI12 = listI12;
                    listI11 = listI11;
                    listI10 = listI10;
                    listI9 = listI9;
                    break;
                case 791122864:
                    list = listA;
                    listI0 = list3;
                    String str70 = str;
                    list2 = listI13;
                    if (str70.equals("impression_type")) {
                        int iNextInt7 = jsonReader.nextInt();
                        i3 = (iNextInt7 == 0 || iNextInt7 == 1 || iNextInt7 == 3 || iNextInt7 == 4) ? iNextInt7 : 0;
                        listA = list;
                        listI13 = list2;
                    }
                    jsonReader.skipValue();
                    listA = list;
                    listI13 = list2;
                    listI12 = listI12;
                    listI11 = listI11;
                    listI10 = listI10;
                    listI9 = listI9;
                    break;
                case 805095541:
                    if (str.equals("analytics_event_name_to_parameters_map")) {
                        ix0 ix0Var4 = lx0.m0;
                        ix0Var4.getClass();
                        if (((Boolean) tu0.e.c.a(ix0Var4)).booleanValue()) {
                            HashMap map3 = new HashMap();
                            jsonReader.beginObject();
                            while (jsonReader.hasNext()) {
                                String strNextName3 = jsonReader.nextName();
                                List list8 = listA;
                                HashMap map4 = new HashMap();
                                jsonReader.beginObject();
                                while (jsonReader.hasNext()) {
                                    map4.put(jsonReader.nextName(), jsonReader.nextString());
                                    listI13 = listI13;
                                    list3 = list3;
                                }
                                jsonReader.endObject();
                                map3.put(strNextName3, map4);
                                listA = list8;
                            }
                            listI0 = list3;
                            jsonReader.endObject();
                            map2 = map3;
                        } else {
                            list = listA;
                            listI0 = list3;
                            list2 = listI13;
                            jsonReader.skipValue();
                            listA = list;
                            listI13 = list2;
                            listI12 = listI12;
                            listI11 = listI11;
                            listI10 = listI10;
                            listI9 = listI9;
                        }
                    } else {
                        list = listA;
                        listI0 = list3;
                        list2 = listI13;
                        jsonReader.skipValue();
                        listA = list;
                        listI13 = list2;
                        listI12 = listI12;
                        listI11 = listI11;
                        listI10 = listI10;
                        listI9 = listI9;
                    }
                    break;
                case 1010584092:
                    if (str.equals("transaction_id")) {
                        strNextString = jsonReader.nextString();
                        listI0 = list3;
                    }
                    list = listA;
                    listI0 = list3;
                    list2 = listI13;
                    jsonReader.skipValue();
                    listA = list;
                    listI13 = list2;
                    listI12 = listI12;
                    listI11 = listI11;
                    listI10 = listI10;
                    listI9 = listI9;
                    break;
                case 1100650276:
                    if (str.equals("rewards")) {
                        g81VarA = g81.a(w40.u0(jsonReader));
                        listI0 = list3;
                    }
                    list = listA;
                    listI0 = list3;
                    list2 = listI13;
                    jsonReader.skipValue();
                    listA = list;
                    listI13 = list2;
                    listI12 = listI12;
                    listI11 = listI11;
                    listI10 = listI10;
                    listI9 = listI9;
                    break;
                case 1141602460:
                    if (str.equals("adapter_response_info_key")) {
                        strNextString18 = jsonReader.nextString();
                        listI0 = list3;
                    }
                    list = listA;
                    listI0 = list3;
                    list2 = listI13;
                    jsonReader.skipValue();
                    listA = list;
                    listI13 = list2;
                    listI12 = listI12;
                    listI11 = listI11;
                    listI10 = listI10;
                    listI9 = listI9;
                    break;
                case 1186014765:
                    if (str.equals("cache_hit_urls")) {
                        w40.i0(jsonReader);
                        list = listA;
                        listI0 = list3;
                        list2 = listI13;
                        listA = list;
                        listI13 = list2;
                        listI12 = listI12;
                        listI11 = listI11;
                        listI10 = listI10;
                        listI9 = listI9;
                    }
                    list = listA;
                    listI0 = list3;
                    list2 = listI13;
                    jsonReader.skipValue();
                    listA = list;
                    listI13 = list2;
                    listI12 = listI12;
                    listI11 = listI11;
                    listI10 = listI10;
                    listI9 = listI9;
                    break;
                case 1303622534:
                    if (str.equals("preload_sort_value")) {
                        dNextDouble = jsonReader.nextDouble();
                        listI0 = list3;
                    }
                    list = listA;
                    listI0 = list3;
                    list2 = listI13;
                    jsonReader.skipValue();
                    listA = list;
                    listI13 = list2;
                    listI12 = listI12;
                    listI11 = listI11;
                    listI10 = listI10;
                    listI9 = listI9;
                    break;
                case 1321720943:
                    if (str.equals("allow_pub_owned_ad_view")) {
                        zNextBoolean2 = jsonReader.nextBoolean();
                        listI0 = list3;
                    }
                    list = listA;
                    listI0 = list3;
                    list2 = listI13;
                    jsonReader.skipValue();
                    listA = list;
                    listI13 = list2;
                    listI12 = listI12;
                    listI11 = listI11;
                    listI10 = listI10;
                    listI9 = listI9;
                    break;
                case 1422388341:
                    if (str.equals("is_collapsible")) {
                        zNextBoolean17 = jsonReader.nextBoolean();
                        listI0 = list3;
                    }
                    list = listA;
                    listI0 = list3;
                    list2 = listI13;
                    jsonReader.skipValue();
                    listA = list;
                    listI13 = list2;
                    listI12 = listI12;
                    listI11 = listI11;
                    listI10 = listI10;
                    listI9 = listI9;
                    break;
                case 1437255331:
                    if (str.equals("ad_source_id")) {
                        strNextString13 = jsonReader.nextString();
                        listI0 = list3;
                    }
                    list = listA;
                    listI0 = list3;
                    list2 = listI13;
                    jsonReader.skipValue();
                    listA = list;
                    listI13 = list2;
                    listI12 = listI12;
                    listI11 = listI11;
                    listI10 = listI10;
                    listI9 = listI9;
                    break;
                case 1556932485:
                    if (str.equals("post_click_lifecycle_monitoring_duration_ms")) {
                        ix0 ix0Var5 = lx0.Fd;
                        ix0Var5.getClass();
                        if (((Boolean) tu0.e.c.a(ix0Var5)).booleanValue()) {
                            iNextInt6 = jsonReader.nextInt();
                            listI0 = list3;
                        } else {
                            jsonReader.skipValue();
                            list = listA;
                            listI0 = list3;
                            list2 = listI13;
                            listA = list;
                            listI13 = list2;
                            listI12 = listI12;
                            listI11 = listI11;
                            listI10 = listI10;
                            listI9 = listI9;
                        }
                    }
                    list = listA;
                    listI0 = list3;
                    list2 = listI13;
                    jsonReader.skipValue();
                    listA = list;
                    listI13 = list2;
                    listI12 = listI12;
                    listI11 = listI11;
                    listI10 = listI10;
                    listI9 = listI9;
                    break;
                case 1565514205:
                    if (str.equals("adapter_only_third_party_impression")) {
                        zNextBoolean21 = jsonReader.nextBoolean();
                        listI0 = list3;
                    }
                    list = listA;
                    listI0 = list3;
                    list2 = listI13;
                    jsonReader.skipValue();
                    listA = list;
                    listI13 = list2;
                    listI12 = listI12;
                    listI11 = listI11;
                    listI10 = listI10;
                    listI9 = listI9;
                    break;
                case 1637553475:
                    if (str.equals("bid_response")) {
                        strNextString7 = jsonReader.nextString();
                        listI0 = list3;
                    }
                    list = listA;
                    listI0 = list3;
                    list2 = listI13;
                    jsonReader.skipValue();
                    listA = list;
                    listI13 = list2;
                    listI12 = listI12;
                    listI11 = listI11;
                    listI10 = listI10;
                    listI9 = listI9;
                    break;
                case 1638957285:
                    if (str.equals("video_start_urls")) {
                        listI8 = w40.i0(jsonReader);
                        listI0 = list3;
                    }
                    list = listA;
                    listI0 = list3;
                    list2 = listI13;
                    jsonReader.skipValue();
                    listA = list;
                    listI13 = list2;
                    listI12 = listI12;
                    listI11 = listI11;
                    listI10 = listI10;
                    listI9 = listI9;
                    break;
                case 1686319423:
                    if (str.equals("ad_network_class_name")) {
                        strNextString11 = jsonReader.nextString();
                        listI0 = list3;
                    }
                    list = listA;
                    listI0 = list3;
                    list2 = listI13;
                    jsonReader.skipValue();
                    listA = list;
                    listI13 = list2;
                    listI12 = listI12;
                    listI11 = listI11;
                    listI10 = listI10;
                    listI9 = listI9;
                    break;
                case 1688341040:
                    if (str.equals("video_reward_urls")) {
                        listI9 = w40.i0(jsonReader);
                        listI0 = list3;
                    }
                    list = listA;
                    listI0 = list3;
                    list2 = listI13;
                    jsonReader.skipValue();
                    listA = list;
                    listI13 = list2;
                    listI12 = listI12;
                    listI11 = listI11;
                    listI10 = listI10;
                    listI9 = listI9;
                    break;
                case 1799285870:
                    if (str.equals("use_third_party_container_height")) {
                        zNextBoolean11 = jsonReader.nextBoolean();
                        listI0 = list3;
                    }
                    list = listA;
                    listI0 = list3;
                    list2 = listI13;
                    jsonReader.skipValue();
                    listA = list;
                    listI13 = list2;
                    listI12 = listI12;
                    listI11 = listI11;
                    listI10 = listI10;
                    listI9 = listI9;
                    break;
                case 1839650832:
                    if (str.equals("renderers")) {
                        listI1 = w40.i0(jsonReader);
                        listI0 = list3;
                    }
                    list = listA;
                    listI0 = list3;
                    list2 = listI13;
                    jsonReader.skipValue();
                    listA = list;
                    listI13 = list2;
                    listI12 = listI12;
                    listI11 = listI11;
                    listI10 = listI10;
                    listI9 = listI9;
                    break;
                case 1875425491:
                    if (str.equals("is_analytics_logging_enabled")) {
                        zNextBoolean9 = jsonReader.nextBoolean();
                        listI0 = list3;
                    }
                    list = listA;
                    listI0 = list3;
                    list2 = listI13;
                    jsonReader.skipValue();
                    listA = list;
                    listI13 = list2;
                    listI12 = listI12;
                    listI11 = listI11;
                    listI10 = listI10;
                    listI9 = listI9;
                    break;
                case 2068142375:
                    if (str.equals("rule_line_external_id")) {
                        strNextString10 = jsonReader.nextString();
                        listI0 = list3;
                    }
                    list = listA;
                    listI0 = list3;
                    list2 = listI13;
                    jsonReader.skipValue();
                    listA = list;
                    listI13 = list2;
                    listI12 = listI12;
                    listI11 = listI11;
                    listI10 = listI10;
                    listI9 = listI9;
                    break;
                case 2072888499:
                    if (str.equals("manual_tracking_urls")) {
                        listI13 = w40.i0(jsonReader);
                        listI0 = list3;
                    }
                    list = listA;
                    listI0 = list3;
                    list2 = listI13;
                    jsonReader.skipValue();
                    listA = list;
                    listI13 = list2;
                    listI12 = listI12;
                    listI11 = listI11;
                    listI10 = listI10;
                    listI9 = listI9;
                    break;
                case 2075506442:
                    if (str.equals("render_serially")) {
                        zNextBoolean19 = jsonReader.nextBoolean();
                        listI0 = list3;
                    }
                    list = listA;
                    listI0 = list3;
                    list2 = listI13;
                    jsonReader.skipValue();
                    listA = list;
                    listI13 = list2;
                    listI12 = listI12;
                    listI11 = listI11;
                    listI10 = listI10;
                    listI9 = listI9;
                    break;
                case 2117205836:
                    if (str.equals("flow_control")) {
                        zNextBoolean20 = jsonReader.nextBoolean();
                        listI0 = list3;
                    }
                    list = listA;
                    listI0 = list3;
                    list2 = listI13;
                    jsonReader.skipValue();
                    listA = list;
                    listI13 = list2;
                    listI12 = listI12;
                    listI11 = listI11;
                    listI10 = listI10;
                    listI9 = listI9;
                    break;
                default:
                    list = listA;
                    listI0 = list3;
                    list2 = listI13;
                    jsonReader.skipValue();
                    listA = list;
                    listI13 = list2;
                    listI12 = listI12;
                    listI11 = listI11;
                    listI10 = listI10;
                    listI9 = listI9;
                    break;
            }
            list3 = listI0;
        }
        jsonReader.endObject();
        this.a = listI1;
        this.b = i2;
        this.c = listI5;
        this.d = listI6;
        this.f = listI7;
        this.e = i3;
        this.g = listI8;
        this.h = listI9;
        this.i = listI10;
        this.j = strNextString;
        this.k = strNextString2;
        this.l = g81VarA;
        this.m = listI11;
        this.n = listI12;
        this.o = list3;
        this.p = listI13;
        this.q = iNextInt;
        this.r = listA;
        this.s = b52Var;
        this.t = listI2;
        this.u = listA2;
        this.w = strNextString3;
        this.v = jSONObjectQ0;
        this.x = strNextString4;
        this.y = strNextString5;
        this.z = string;
        this.A = e91Var;
        this.B = strNextString6;
        this.C = jSONObjectQ1;
        this.D = jSONObjectQ2;
        this.J = zNextBoolean;
        this.K = zNextBoolean2;
        this.L = zNextBoolean3;
        this.M = zNextBoolean4;
        this.N = zNextBoolean5;
        this.O = zNextBoolean6;
        this.P = zNextBoolean7;
        this.Q = i4;
        this.R = iNextInt2;
        this.T = zNextBoolean8;
        this.U = strNextString7;
        this.V = new j52(jSONObjectQ3);
        this.W = zNextBoolean9;
        this.X = zNextBoolean10;
        this.Y = iNextInt3;
        this.Z = strNextString8;
        this.a0 = iNextInt4;
        this.b0 = strNextString9;
        this.c0 = zNextBoolean11;
        this.d0 = u61Var;
        this.e0 = qc3Var;
        this.f0 = strNextString10;
        this.g0 = zNextBoolean12;
        this.h0 = jSONObjectQ4;
        this.E = strNextString11;
        this.F = strNextString12;
        this.G = strNextString13;
        this.H = strNextString14;
        this.I = strNextString15;
        this.i0 = zNextBoolean13;
        this.j0 = jSONObjectQ5;
        this.k0 = zNextBoolean14;
        this.l0 = strNextString20;
        this.m0 = zNextBoolean15;
        this.S = zNextBoolean16;
        this.n0 = strNextString16;
        this.o0 = strNextString17;
        this.p0 = strNextString18;
        this.q0 = zNextBoolean17;
        this.r0 = zNextBoolean18;
        this.s0 = iNextInt5;
        this.u0 = listI3;
        this.t0 = strNextString19;
        this.v0 = zNextBoolean19;
        this.w0 = map2;
        this.x0 = j52Var;
        this.y0 = h93Var;
        this.z0 = dNextDouble;
        this.A0 = listI4;
        this.B0 = zNextBoolean20;
        this.C0 = listO;
        this.D0 = zNextBoolean21;
        this.E0 = iNextInt6;
    }

    public static String a(int i) {
        switch (i) {
            case 1:
                return "BANNER";
            case 2:
                return "INTERSTITIAL";
            case 3:
                return "NATIVE_EXPRESS";
            case 4:
                return "NATIVE";
            case 5:
                return "REWARDED";
            case 6:
                return "APP_OPEN_AD";
            case 7:
                return "REWARDED_INTERSTITIAL";
            default:
                return "UNKNOWN";
        }
    }

    public final boolean b() {
        return this.i0 || this.y0 != null;
    }
}
