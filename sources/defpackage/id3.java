package defpackage;

import android.content.Context;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class id3 implements hu1 {
    public final Context f;
    public final String g;
    public String h;

    public id3(Context context, String str) {
        this.f = context;
        this.g = str;
    }

    public final sc3 a(String str, HashMap map) {
        sc3 sc3Var = sc3.h;
        sc3 sc3Var2 = sc3.g;
        if (str != null) {
            if (!((Boolean) tu0.e.c.a(lx0.f)).booleanValue() || !str.isEmpty()) {
                try {
                    StringBuilder sb = new StringBuilder(str.length() + 13);
                    sb.append("Pinging URL: ");
                    sb.append(str);
                    jn.F(sb.toString());
                    HttpURLConnection httpURLConnection = (HttpURLConnection) b(str).openConnection();
                    try {
                        f32 f32Var = ut0.f.a;
                        String str2 = this.g;
                        httpURLConnection.setConnectTimeout(60000);
                        httpURLConnection.setInstanceFollowRedirects(true);
                        httpURLConnection.setReadTimeout(60000);
                        if (str2 != null) {
                            httpURLConnection.setRequestProperty("User-Agent", str2);
                        }
                        httpURLConnection.setUseCaches(false);
                        if (map != null) {
                            for (Map.Entry entry : map.entrySet()) {
                                httpURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                            }
                        }
                        o83 o83Var = new o83();
                        o83Var.a(httpURLConnection, null);
                        int responseCode = httpURLConnection.getResponseCode();
                        o83Var.b(httpURLConnection, responseCode);
                        if (responseCode < 200 || responseCode >= 300) {
                            StringBuilder sb2 = new StringBuilder(String.valueOf(responseCode).length() + 54 + str.length());
                            sb2.append("Received non-success response code ");
                            sb2.append(responseCode);
                            sb2.append(" from pinging URL: ");
                            sb2.append(str);
                            jn.T(sb2.toString());
                            if (responseCode == 502) {
                                sc3Var2 = sc3Var;
                            }
                        } else {
                            if (((Boolean) tu0.e.c.a(lx0.y8)).booleanValue()) {
                                this.h = httpURLConnection.getHeaderField("X-Afma-Ad-Event-Value");
                            }
                            sc3Var2 = sc3.f;
                        }
                        return sc3Var2;
                    } finally {
                        httpURLConnection.disconnect();
                    }
                } catch (IOException e) {
                    e = e;
                    String message = e.getMessage();
                    StringBuilder sb3 = new StringBuilder(String.valueOf(message).length() + str.length() + 27);
                    sb3.append("Error while pinging URL: ");
                    sb3.append(str);
                    sb3.append(". ");
                    sb3.append(message);
                    jn.T(sb3.toString());
                    return sc3Var;
                } catch (IndexOutOfBoundsException e2) {
                    e = e2;
                    sc3Var = sc3Var2;
                    c(str, e);
                    return sc3Var;
                } catch (RuntimeException e3) {
                    e = e3;
                    String message2 = e.getMessage();
                    StringBuilder sb4 = new StringBuilder(String.valueOf(message2).length() + str.length() + 27);
                    sb4.append("Error while pinging URL: ");
                    sb4.append(str);
                    sb4.append(". ");
                    sb4.append(message2);
                    jn.T(sb4.toString());
                    return sc3Var;
                } catch (MalformedURLException e4) {
                    e = e4;
                    sc3Var = sc3Var2;
                    c(str, e);
                    return sc3Var;
                }
            }
        }
        return sc3Var2;
    }

    public final URL b(String str) {
        URL url = null;
        try {
            url = new URI(str).toURL();
        } catch (IllegalArgumentException e) {
            e = e;
            c(str, e);
        } catch (MalformedURLException e2) {
            e = e2;
            c(str, e);
        } catch (URISyntaxException e3) {
            c(str, e3);
            if (((Boolean) tu0.e.c.a(lx0.e)).booleanValue()) {
                try {
                    jn.F("Attempting to parse components, encode, and reconstruct URI.");
                    URL url2 = new URL(str);
                    URI uri = new URI(url2.getProtocol(), url2.getUserInfo(), url2.getHost(), url2.getPort(), url2.getPath(), url2.getQuery(), url2.getRef());
                    url = uri.toURL();
                    String string = uri.toString();
                    StringBuilder sb = new StringBuilder(str.length() + 114 + string.length());
                    sb.append("Successfully constructed URL after component encoding via new URI(parts).toURL() for original: \"");
                    sb.append(str);
                    sb.append("\" -> encoded URI: ");
                    sb.append(string);
                    jn.F(sb.toString());
                } catch (IllegalArgumentException | MalformedURLException | URISyntaxException e4) {
                    c(str, e4);
                }
            }
        }
        if (url != null) {
            return url;
        }
        StringBuilder sb2 = new StringBuilder(str.length() + 47);
        sb2.append("Falling back to direct new URL(\"");
        sb2.append(str);
        sb2.append("\") constructor.");
        jn.F(sb2.toString());
        return new URL(str);
    }

    public final void c(String str, Exception exc) {
        String message = exc.getMessage();
        StringBuilder sb = new StringBuilder(str.length() + 32 + String.valueOf(message).length());
        sb.append("Error while parsing ping URL: ");
        sb.append(str);
        sb.append(". ");
        sb.append(message);
        jn.T(sb.toString());
        e71.a(this.f).g(exc, "HttpUrlPinger.pingUrl", ((Integer) tu0.e.c.a(lx0.zd)).intValue() / 100.0f);
    }

    @Override // defpackage.hu1
    public final sc3 l(String str) {
        return a(str, null);
    }
}
