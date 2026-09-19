package defpackage;

import android.text.TextUtils;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class tv1 implements n62 {
    public static final Pattern i = Pattern.compile("([^;]+=[^;]+)(;\\s|$)", 2);
    public final String f;
    public final a72 g;
    public final d72 h;

    public tv1(String str, d72 d72Var, a72 a72Var) {
        this.f = str;
        this.h = d72Var;
        this.g = a72Var;
    }

    /* JADX WARN: Code duplicated, block: B:66:0x012f  */
    @Override // defpackage.n62
    public final Object b(Object obj) throws au1 {
        au1 au1Var;
        JSONObject jSONObject;
        String strConcat;
        sv1 sv1Var = (sv1) obj;
        int iOptInt = sv1Var.a.optInt("http_timeout_millis", 60000);
        s71 s71Var = sv1Var.b;
        int i2 = s71Var.g;
        String str = s71Var.m;
        String str2 = s71Var.c;
        a72 a72Var = this.g;
        d72 d72Var = this.h;
        int i3 = 1;
        String strJoin = "";
        if (i2 != -2) {
            if (i2 == 1) {
                List list = s71Var.a;
                if (list != null) {
                    strJoin = TextUtils.join(", ", list);
                    jn.M(strJoin);
                }
                au1Var = new au1("Error building request URL: ".concat(String.valueOf(strJoin)), 2);
            } else {
                au1Var = new au1(1);
            }
            a72Var.f(au1Var);
            a72Var.b(false);
            d72Var.a(a72Var);
            throw au1Var;
        }
        HashMap map = new HashMap();
        if (s71Var.e) {
            String str3 = this.f;
            if (!TextUtils.isEmpty(str3)) {
                if (((Boolean) tu0.e.c.a(lx0.X0)).booleanValue()) {
                    if (TextUtils.isEmpty(str3)) {
                        strConcat = "";
                    } else {
                        Matcher matcher = i.matcher(str3);
                        strConcat = "";
                        while (matcher.find()) {
                            String strGroup = matcher.group(i3);
                            if (strGroup != null) {
                                Locale locale = Locale.ROOT;
                                if (strGroup.toLowerCase(locale).startsWith("id=") || strGroup.toLowerCase(locale).startsWith("ide=")) {
                                    if (!TextUtils.isEmpty(strConcat)) {
                                        strConcat = strConcat.concat("; ");
                                    }
                                    strConcat = strConcat.concat(strGroup);
                                }
                            }
                            i3 = 1;
                        }
                    }
                    if (!TextUtils.isEmpty(strConcat)) {
                        map.put("Cookie", strConcat);
                    }
                } else {
                    map.put("Cookie", str3);
                }
            }
        }
        if (s71Var.d && (jSONObject = sv1Var.a) != null) {
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("pii");
            if (jSONObjectOptJSONObject != null) {
                if (!TextUtils.isEmpty(jSONObjectOptJSONObject.optString("doritos", ""))) {
                    map.put("x-afma-drt-cookie", jSONObjectOptJSONObject.optString("doritos", ""));
                }
                if (!TextUtils.isEmpty(jSONObjectOptJSONObject.optString("doritos_v2", ""))) {
                    map.put("x-afma-drt-v2-cookie", jSONObjectOptJSONObject.optString("doritos_v2", ""));
                }
            } else {
                jn.p("DSID signal does not exist.");
            }
        }
        byte[] byteArray = new byte[0];
        if (!TextUtils.isEmpty(str2)) {
            byte[] bytes = str2.getBytes(StandardCharsets.UTF_8);
            if (s71Var.l) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                    try {
                        gZIPOutputStream.write(bytes);
                        gZIPOutputStream.finish();
                        byteArray = byteArrayOutputStream.toByteArray();
                        gZIPOutputStream.close();
                    } catch (Throwable th) {
                        try {
                            gZIPOutputStream.close();
                            throw th;
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                            throw th;
                        }
                    }
                } catch (IOException e) {
                    jn.w("gzip compression failed, sending uncompressed.", e);
                    vc3.C.h.d("PrepareRequestFunction.apply", e);
                    byteArray = null;
                }
                if (byteArray != null) {
                    map.put("Content-Encoding", "gzip");
                } else {
                    byteArray = bytes;
                }
            } else {
                byteArray = bytes;
            }
        }
        String str4 = !TextUtils.isEmpty(str) ? str : "";
        a72Var.b(true);
        d72Var.a(a72Var);
        return new qv1(s71Var.f, iOptInt, map, byteArray, str4);
    }
}
