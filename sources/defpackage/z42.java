package defpackage;

import android.os.Bundle;
import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class z42 {
    public final List a;
    public final String b;
    public final int c;
    public final int d;
    public final String e;
    public final int f;
    public final long g;
    public final boolean h;
    public final String i;
    public final xo2 j;
    public final Bundle k;
    public final String l;
    public final String m;
    public final String n;
    public final JSONObject o;
    public final JSONObject p;
    public final String q;
    public final int r;
    public final long s;
    public final long t;

    public z42(JsonReader jsonReader) throws IOException {
        String str;
        List listI0 = Collections.EMPTY_LIST;
        Bundle bundle = new Bundle();
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        jsonReader.beginObject();
        String str2 = "";
        int iNextInt = 0;
        String strNextString = "";
        String strNextString2 = strNextString;
        String strNextString3 = strNextString2;
        String strNextString4 = strNextString3;
        String strNextString5 = strNextString4;
        String strNextString6 = strNextString5;
        String strNextString7 = strNextString6;
        boolean zNextBoolean = false;
        xo2 xo2Var = null;
        long j = -1;
        long j2 = -1;
        long jNextLong = 0;
        int iNextInt2 = -1;
        int iMax = 1;
        int iNextInt3 = 0;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            if (Objects.equals(strNextName, "nofill_urls")) {
                listI0 = w40.i0(jsonReader);
            } else if ("refresh_interval".equals(strNextName)) {
                iNextInt = jsonReader.nextInt();
            } else if (Objects.equals(strNextName, "refresh_load_delay_time_interval")) {
                iNextInt2 = jsonReader.nextInt();
            } else if ("gws_query_id".equals(strNextName)) {
                strNextString = jsonReader.nextString();
            } else if ("analytics_query_ad_event_id".equals(strNextName)) {
                strNextString2 = jsonReader.nextString();
            } else if ("is_idless".equals(strNextName)) {
                zNextBoolean = jsonReader.nextBoolean();
            } else if ("response_code".equals(strNextName)) {
                iNextInt3 = jsonReader.nextInt();
            } else {
                if ("latency".equals(strNextName)) {
                    jNextLong = jsonReader.nextLong();
                } else {
                    ix0 ix0Var = lx0.V8;
                    str = str2;
                    tu0 tu0Var = tu0.e;
                    long j3 = j;
                    kx0 kx0Var = tu0Var.c;
                    kx0 kx0Var2 = tu0Var.c;
                    if (((Boolean) kx0Var.a(ix0Var)).booleanValue() && "public_error".equals(strNextName) && jsonReader.peek() == JsonToken.BEGIN_OBJECT) {
                        xo2 xo2Var2 = new xo2();
                        jsonReader.beginObject();
                        String strNextString8 = str;
                        while (jsonReader.hasNext()) {
                            String strNextName2 = jsonReader.nextName();
                            int iHashCode = strNextName2.hashCode();
                            if (iHashCode != -1724546052) {
                                if (iHashCode == 3059181 && strNextName2.equals("code")) {
                                    jsonReader.nextInt();
                                } else {
                                    jsonReader.skipValue();
                                }
                            } else if (strNextName2.equals("description")) {
                                strNextString8 = jsonReader.nextString();
                            } else {
                                jsonReader.skipValue();
                            }
                        }
                        jsonReader.endObject();
                        xo2Var2.g = strNextString8;
                        xo2Var = xo2Var2;
                    } else if ("bidding_data".equals(strNextName)) {
                        strNextString3 = jsonReader.nextString();
                    } else {
                        if (((Boolean) kx0Var2.a(lx0.ib)).booleanValue() && Objects.equals(strNextName, "topics_should_record_observation")) {
                            jsonReader.nextBoolean();
                        } else if ("adapter_response_replacement_key".equals(strNextName)) {
                            strNextString7 = jsonReader.nextString();
                        } else if ("response_info_extras".equals(strNextName)) {
                            if (((Boolean) kx0Var2.a(lx0.f7)).booleanValue()) {
                                try {
                                    Bundle bundleP0 = w40.P0(w40.q0(jsonReader));
                                    if (bundleP0 != null) {
                                        bundle = bundleP0;
                                    }
                                } catch (IOException | JSONException unused) {
                                    j = j3;
                                } catch (IllegalStateException unused2) {
                                    jsonReader.skipValue();
                                    j = j3;
                                }
                            } else {
                                jsonReader.skipValue();
                            }
                        } else if ("adRequestPostBody".equals(strNextName)) {
                            if (((Boolean) kx0Var2.a(lx0.ba)).booleanValue()) {
                                strNextString5 = jsonReader.nextString();
                            } else {
                                jsonReader.skipValue();
                            }
                        } else if (!"adRequestUrl".equals(strNextName)) {
                            ix0 ix0Var2 = lx0.ca;
                            if (((Boolean) kx0Var2.a(ix0Var2)).booleanValue() && Objects.equals(strNextName, "adResponseBody")) {
                                strNextString6 = jsonReader.nextString();
                            } else if (((Boolean) kx0Var2.a(ix0Var2)).booleanValue() && Objects.equals(strNextName, "adResponseHeaders")) {
                                jSONObject = w40.q0(jsonReader);
                            } else {
                                if (Objects.equals(strNextName, "max_parallel_renderers")) {
                                    iMax = Math.max(1, jsonReader.nextInt());
                                } else if (((Boolean) kx0Var2.a(lx0.ka)).booleanValue() && Objects.equals(strNextName, "inspector_ad_transaction_extras")) {
                                    jSONObject2 = w40.q0(jsonReader);
                                } else if (((Boolean) kx0Var2.a(lx0.n2)).booleanValue() && Objects.equals(strNextName, "latency_extras")) {
                                    try {
                                        Bundle bundleP1 = w40.P0(w40.q0(jsonReader));
                                        if (bundleP1 != null) {
                                            double d = bundleP1.getDouble("start_time");
                                            j2 = (d > 9.223372036854776E18d || d < -9.223372036854776E18d) ? -1L : (long) d;
                                            double d2 = bundleP1.getDouble("end_time");
                                            j = (d2 > 9.223372036854776E18d || d2 < -9.223372036854776E18d) ? -1L : (long) d2;
                                        }
                                    } catch (IOException | JSONException unused3) {
                                    } catch (IllegalStateException unused4) {
                                        jsonReader.skipValue();
                                    }
                                } else {
                                    jsonReader.skipValue();
                                }
                                j = j3;
                            }
                        } else if (((Boolean) kx0Var2.a(lx0.ba)).booleanValue()) {
                            strNextString4 = jsonReader.nextString();
                        } else {
                            jsonReader.skipValue();
                        }
                        j = j3;
                    }
                    j = j3;
                }
                str2 = str;
            }
            str = str2;
            str2 = str;
        }
        long j4 = j;
        jsonReader.endObject();
        this.a = listI0;
        this.c = iNextInt;
        if (((Boolean) az0.c.u()).booleanValue()) {
            this.d = -1;
        } else {
            um0 um0Var = iy0.a;
            if (((Long) um0Var.u()).longValue() > -1) {
                this.d = ((Long) um0Var.u()).intValue();
            } else {
                this.d = iNextInt2;
            }
        }
        this.b = strNextString;
        this.e = strNextString2;
        this.f = iNextInt3;
        this.g = jNextLong;
        this.j = xo2Var;
        this.h = zNextBoolean;
        this.i = strNextString3;
        this.k = bundle;
        this.l = strNextString4;
        this.m = strNextString5;
        this.n = strNextString6;
        this.o = jSONObject;
        this.p = jSONObject2;
        this.q = strNextString7;
        um0 um0Var2 = vy0.a;
        this.r = ((Long) um0Var2.u()).longValue() > 0 ? ((Long) um0Var2.u()).intValue() : iMax;
        this.s = j2;
        this.t = j4;
    }
}
