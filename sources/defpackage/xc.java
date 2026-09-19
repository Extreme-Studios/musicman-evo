package defpackage;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class xc implements n62 {
    public final Context f;
    public final String g;
    public final String h;

    public xc(Context context, d60 d60Var) {
        this.f = context;
        this.g = context.getPackageName();
        this.h = d60Var.f;
    }

    @Override // defpackage.n62
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public rv1 b(qv1 qv1Var) {
        HttpURLConnection httpURLConnection;
        InputStreamReader inputStreamReader;
        BufferedOutputStream bufferedOutputStream;
        xc xcVar = this;
        String str = qv1Var.a;
        int i = qv1Var.b;
        HashMap map = qv1Var.c;
        byte[] bArr = qv1Var.d;
        String str2 = qv1Var.e;
        vc3.C.k.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        try {
            rv1 rv1Var = new rv1();
            rv1Var.a = 0;
            rv1Var.b = new HashMap();
            rv1Var.c = "";
            rv1Var.d = -1L;
            String str3 = xcVar.g;
            StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 13);
            sb.append("SDK version: ");
            sb.append(str3);
            jn.R(sb.toString());
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 39);
            sb2.append("AdRequestServiceImpl: Sending request: ");
            sb2.append(str);
            jn.F(sb2.toString());
            URL url = new URL(str);
            HashMap map2 = new HashMap();
            int i2 = 0;
            while (true) {
                httpURLConnection = (HttpURLConnection) url.openConnection();
                String str4 = xcVar.h;
                if (str4 != null) {
                    httpURLConnection.setRequestMethod(str4);
                }
                try {
                    try {
                        vc3.C.c.B(xcVar.f, str3, httpURLConnection, i);
                        for (Iterator it = map.entrySet().iterator(); it.hasNext(); it = it) {
                            Map.Entry entry = (Map.Entry) it.next();
                            httpURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                        }
                        if (!TextUtils.isEmpty(str2)) {
                            httpURLConnection.setRequestProperty("Content-Type", str2);
                        }
                        o83 o83Var = new o83();
                        try {
                            o83Var.a(httpURLConnection, bArr);
                        } catch (Throwable th) {
                            jn.P("Network request logging failed.", th);
                            vc3.C.h.e("HttpRequestFunction.logAdRequest", th);
                        }
                        int length = bArr.length;
                        int i3 = 1;
                        if (length > 0) {
                            httpURLConnection.setDoOutput(true);
                            httpURLConnection.setFixedLengthStreamingMode(length);
                            try {
                                bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream());
                                try {
                                    bufferedOutputStream.write(bArr);
                                    ar.b(bufferedOutputStream);
                                } catch (Throwable th2) {
                                    th = th2;
                                    ar.b(bufferedOutputStream);
                                    throw th;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                bufferedOutputStream = null;
                            }
                        }
                        int responseCode = httpURLConnection.getResponseCode();
                        Iterator<Map.Entry<String, List<String>>> it2 = httpURLConnection.getHeaderFields().entrySet().iterator();
                        while (it2.hasNext()) {
                            Map.Entry<String, List<String>> next = it2.next();
                            int i4 = i3;
                            String key = next.getKey();
                            Iterator<Map.Entry<String, List<String>>> it3 = it2;
                            List<String> value = next.getValue();
                            if (map2.containsKey(key)) {
                                ((List) map2.get(key)).addAll(value);
                            } else {
                                map2.put(key, new ArrayList(value));
                                map = map;
                            }
                            it2 = it3;
                            i3 = i4;
                        }
                        int i5 = i3;
                        HashMap map3 = map;
                        o83Var.b(httpURLConnection, responseCode);
                        rv1Var.a = responseCode;
                        rv1Var.b = map2;
                        rv1Var.c = "";
                        if (responseCode >= 200 && responseCode < 300) {
                            try {
                                inputStreamReader = new InputStreamReader(httpURLConnection.getInputStream());
                                try {
                                    zb3 zb3Var = vc3.C.c;
                                    StringBuilder sb3 = new StringBuilder(8192);
                                    char[] cArr = new char[2048];
                                    while (true) {
                                        int i6 = inputStreamReader.read(cArr);
                                        if (i6 == -1) {
                                            break;
                                        }
                                        sb3.append(cArr, 0, i6);
                                    }
                                    String string = sb3.toString();
                                    ar.b(inputStreamReader);
                                    if (o83.c()) {
                                        o83Var.e("onNetworkResponseBody", new zc1(string.getBytes()));
                                    }
                                    rv1Var.c = string;
                                    if (TextUtils.isEmpty(string)) {
                                        if (!((Boolean) tu0.e.c.a(lx0.W5)).booleanValue()) {
                                            throw new au1(3);
                                        }
                                    }
                                    vc3.C.k.getClass();
                                    rv1Var.d = SystemClock.elapsedRealtime() - jElapsedRealtime;
                                    break;
                                } catch (Throwable th4) {
                                    th = th4;
                                    ar.b(inputStreamReader);
                                    throw th;
                                }
                            } catch (Throwable th5) {
                                th = th5;
                                inputStreamReader = null;
                            }
                        } else {
                            if (responseCode < 300 || responseCode >= 400) {
                                StringBuilder sb4 = new StringBuilder(String.valueOf(responseCode).length() + 35);
                                sb4.append("Received error HTTP response code: ");
                                sb4.append(responseCode);
                                jn.T(sb4.toString());
                                StringBuilder sb5 = new StringBuilder(String.valueOf(responseCode).length() + 35);
                                sb5.append("Received error HTTP response code: ");
                                sb5.append(responseCode);
                                throw new au1(sb5.toString(), 1);
                            }
                            String headerField = httpURLConnection.getHeaderField("Location");
                            if (TextUtils.isEmpty(headerField)) {
                                jn.T("No location header to follow redirect.");
                                throw new au1("No location header to follow redirect", 1);
                            }
                            ix0 ix0Var = lx0.w8;
                            tu0 tu0Var = tu0.e;
                            if (((Boolean) tu0Var.c.a(ix0Var)).booleanValue()) {
                                try {
                                    url = new URI(headerField).toURL();
                                } catch (URISyntaxException e) {
                                    throw new au1(e.getMessage(), e);
                                }
                            } else {
                                url = new URL(headerField);
                            }
                            i2++;
                            if (i2 > ((Integer) tu0Var.c.a(lx0.F5)).intValue()) {
                                jn.T("Too many redirects.");
                                throw new au1("Too many redirects", i5);
                            }
                            httpURLConnection.disconnect();
                            xcVar = this;
                            i = i;
                            map = map3;
                        }
                    } catch (au1 e2) {
                        if (!((Boolean) tu0.e.c.a(lx0.W8)).booleanValue()) {
                            throw e2;
                        }
                        vc3.C.k.getClass();
                        rv1Var.d = SystemClock.elapsedRealtime() - jElapsedRealtime;
                    }
                } catch (Throwable th6) {
                    httpURLConnection.disconnect();
                    throw th6;
                }
            }
            httpURLConnection.disconnect();
            return rv1Var;
        } catch (IOException e3) {
            String strConcat = "Error while connecting to ad server: ".concat(String.valueOf(e3.getMessage()));
            jn.T(strConcat);
            throw new au1(strConcat, e3);
        }
    }

    public xc(Context context, String str, String str2) {
        this.f = context;
        this.g = str;
        this.h = str2;
    }
}
