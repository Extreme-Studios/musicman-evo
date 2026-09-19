package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.NoRouteToHostException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.GZIPInputStream;

/* JADX INFO: loaded from: classes.dex */
public final class yh2 extends za2 implements en2 {
    public final boolean j;
    public final int k;
    public final int l;
    public final String m;
    public final us2 n;
    public final us2 o;
    public eg2 p;
    public HttpURLConnection q;
    public InputStream r;
    public boolean s;
    public int t;
    public long u;
    public long v;

    public /* synthetic */ yh2(String str, int i, int i2, boolean z, us2 us2Var) {
        super(true);
        this.m = str;
        this.k = i;
        this.l = i2;
        this.j = z;
        this.n = us2Var;
        this.o = new us2(25);
    }

    /* JADX WARN: Code duplicated, block: B:118:0x0246  */
    /* JADX WARN: Code duplicated, block: B:72:0x019d  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v9, types: [java.util.regex.Matcher] */
    @Override // defpackage.oe2
    public final long a(eg2 eg2Var) throws ik2 {
        yh2 yh2Var;
        HttpURLConnection httpURLConnectionK;
        boolean z;
        long j;
        int i;
        yh2 yh2Var2 = this;
        yh2Var2.p = eg2Var;
        yh2Var2.v = 0L;
        yh2Var2.u = 0L;
        b(eg2Var);
        int i2 = 1;
        try {
            Uri uri = eg2Var.a;
            long j2 = eg2Var.d;
            long j3 = eg2Var.c;
            URL url = new URL(uri.toString());
            long j4 = eg2Var.c;
            long j5 = eg2Var.d;
            long j6 = j3;
            boolean z2 = false;
            try {
                if (yh2Var2.j) {
                    int i3 = 0;
                    while (true) {
                        int i4 = i3 + 1;
                        if (i3 > 20) {
                            StringBuilder sb = new StringBuilder(String.valueOf(i4).length() + 20);
                            sb.append("Too many redirects: ");
                            sb.append(i4);
                            throw new ik2(new NoRouteToHostException(sb.toString()), 2001, 1);
                        }
                        yh2Var = this;
                        HttpURLConnection httpURLConnectionK2 = yh2Var.k(url, j4, j5, z2, false, eg2Var.b);
                        int responseCode = httpURLConnectionK2.getResponseCode();
                        String headerField = httpURLConnectionK2.getHeaderField("Location");
                        if (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303 && responseCode != 307 && responseCode != 308) {
                            httpURLConnectionK = httpURLConnectionK2;
                            break;
                        }
                        httpURLConnectionK2.disconnect();
                        url = yh2Var.n(url, headerField);
                        i3 = i4;
                        z2 = false;
                        i2 = 1;
                    }
                } else {
                    httpURLConnectionK = yh2Var2.k(url, j4, j5, false, true, eg2Var.b);
                    yh2Var = this;
                }
                yh2Var.q = httpURLConnectionK;
                yh2Var.t = httpURLConnectionK.getResponseCode();
                httpURLConnectionK.getResponseMessage();
                int i5 = yh2Var.t;
                long jMax = -1;
                if (i5 < 200 || i5 > 299) {
                    httpURLConnectionK.getHeaderFields();
                    if (yh2Var.t == 416) {
                        String headerField2 = httpURLConnectionK.getHeaderField("Content-Range");
                        Pattern pattern = sn2.a;
                        if (TextUtils.isEmpty(headerField2)) {
                            z = true;
                            j = -1;
                        } else {
                            Matcher matcher = sn2.b.matcher(headerField2);
                            if (matcher.matches()) {
                                z = true;
                                String strGroup = matcher.group(1);
                                strGroup.getClass();
                                j = Long.parseLong(strGroup);
                            } else {
                                z = true;
                                j = -1;
                            }
                        }
                        if (j6 == j) {
                            yh2Var.s = z;
                            e(eg2Var);
                            if (j2 != -1) {
                                return j2;
                            }
                            return 0L;
                        }
                    }
                    InputStream errorStream = httpURLConnectionK.getErrorStream();
                    try {
                        if (errorStream != null) {
                            ll2.a(errorStream);
                        } else {
                            String str = qz1.a;
                        }
                    } catch (IOException unused) {
                        String str2 = qz1.a;
                    }
                    yh2Var.q();
                    throw new jl2(yh2Var.t, yh2Var.t == 416 ? new ze2() : null);
                }
                httpURLConnectionK.getContentType();
                if (yh2Var.t != 200 || j6 == 0) {
                    j6 = 0;
                }
                boolean zEqualsIgnoreCase = "gzip".equalsIgnoreCase(httpURLConnectionK.getHeaderField("Content-Encoding"));
                if (zEqualsIgnoreCase) {
                    i = i2;
                    yh2Var.u = j2;
                } else if (j2 != -1) {
                    yh2Var.u = j2;
                    i = i2;
                } else {
                    String headerField3 = httpURLConnectionK.getHeaderField("Content-Length");
                    String headerField4 = httpURLConnectionK.getHeaderField("Content-Range");
                    Pattern pattern2 = sn2.a;
                    if (!TextUtils.isEmpty(headerField3)) {
                        try {
                            jMax = Long.parseLong(headerField3);
                        } catch (NumberFormatException unused2) {
                            StringBuilder sb2 = new StringBuilder(String.valueOf(headerField3).length() + 28);
                            sb2.append("Unexpected Content-Length [");
                            sb2.append(headerField3);
                            sb2.append("]");
                            s90.Y("HttpUtil", sb2.toString());
                        }
                    }
                    if (TextUtils.isEmpty(headerField4)) {
                        i = i2;
                    } else {
                        String strMatcher = sn2.a.matcher(headerField4);
                        if (strMatcher.matches()) {
                            try {
                                String strGroup2 = strMatcher.group(2);
                                try {
                                    if (strGroup2 == null) {
                                        throw null;
                                    }
                                    long j7 = Long.parseLong(strGroup2);
                                    String strGroup3 = strMatcher.group(i2);
                                    if (strGroup3 == null) {
                                        throw null;
                                    }
                                    i = i2;
                                    long j8 = (j7 - Long.parseLong(strGroup3)) + 1;
                                    if (jMax < 0) {
                                        jMax = j8;
                                    } else if (jMax != j8) {
                                        StringBuilder sb3 = new StringBuilder(String.valueOf(headerField3).length() + 25 + String.valueOf(headerField4).length() + 1);
                                        sb3.append("Inconsistent headers [");
                                        sb3.append(headerField3);
                                        sb3.append("] [");
                                        sb3.append(headerField4);
                                        sb3.append("]");
                                        s90.Q("HttpUtil", sb3.toString());
                                        jMax = Math.max(jMax, j8);
                                    }
                                } catch (NumberFormatException unused3) {
                                    StringBuilder sb4 = new StringBuilder(String.valueOf(headerField4).length() + 27);
                                    sb4.append("Unexpected Content-Range [");
                                    sb4.append(headerField4);
                                    sb4.append("]");
                                    s90.Y(strMatcher, sb4.toString());
                                }
                            } catch (NumberFormatException unused4) {
                                i = i2;
                                strMatcher = "HttpUtil";
                            }
                            StringBuilder sb5 = new StringBuilder(String.valueOf(headerField4).length() + 27);
                            sb5.append("Unexpected Content-Range [");
                            sb5.append(headerField4);
                            sb5.append("]");
                            s90.Y(strMatcher, sb5.toString());
                        } else {
                            i = i2;
                        }
                    }
                    yh2Var.u = jMax != jMax ? jMax - j6 : -1L;
                }
                try {
                    yh2Var.r = httpURLConnectionK.getInputStream();
                    if (zEqualsIgnoreCase) {
                        yh2Var.r = new GZIPInputStream(yh2Var.r);
                    }
                    yh2Var.s = i;
                    e(eg2Var);
                    if (j6 != 0) {
                        try {
                            byte[] bArr = new byte[4096];
                            long j9 = j6;
                            while (j9 > 0) {
                                int iMin = (int) Math.min(j9, 4096L);
                                InputStream inputStream = yh2Var.r;
                                String str3 = qz1.a;
                                int i6 = inputStream.read(bArr, 0, iMin);
                                if (Thread.currentThread().isInterrupted()) {
                                    throw new ik2(new InterruptedIOException(), 2000, 1);
                                }
                                if (i6 == -1) {
                                    throw new ik2();
                                }
                                j9 -= (long) i6;
                                yh2Var.f(i6);
                            }
                        } catch (IOException e) {
                            yh2Var.q();
                            if (e instanceof ik2) {
                                throw ((ik2) e);
                            }
                            throw new ik2(e, 2000, 1);
                        }
                    }
                    return yh2Var.u;
                } catch (IOException e2) {
                    int i7 = i;
                    yh2Var.q();
                    throw new ik2(e2, 2000, i7);
                }
            } catch (IOException e3) {
                e = e3;
                yh2Var2 = this;
                yh2Var2.q();
                throw ik2.a(e, 1);
            }
        } catch (IOException e4) {
            e = e4;
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0028 A[Catch: IOException -> 0x0032, TRY_LEAVE, TryCatch #0 {IOException -> 0x0032, blocks: (B:5:0x0004, B:7:0x000d, B:10:0x0017, B:11:0x001d, B:14:0x0028), top: B:19:0x0004 }] */
    @Override // defpackage.k73
    public final int d(byte[] bArr, int i, int i2) throws ik2 {
        int i3;
        if (i2 == 0) {
            return 0;
        }
        try {
            long j = this.u;
            if (j != -1) {
                long j2 = j - this.v;
                if (j2 != 0) {
                    i2 = (int) Math.min(i2, j2);
                    InputStream inputStream = this.r;
                    String str = qz1.a;
                    i3 = inputStream.read(bArr, i, i2);
                    if (i3 != -1) {
                        this.v += (long) i3;
                        f(i3);
                        return i3;
                    }
                }
            } else {
                InputStream inputStream2 = this.r;
                String str2 = qz1.a;
                i3 = inputStream2.read(bArr, i, i2);
                if (i3 != -1) {
                    this.v += (long) i3;
                    f(i3);
                    return i3;
                }
            }
            return -1;
        } catch (IOException e) {
            String str3 = qz1.a;
            throw ik2.a(e, 2);
        }
    }

    @Override // defpackage.oe2
    public final Map g() {
        HttpURLConnection httpURLConnection = this.q;
        return httpURLConnection == null ? vk2.l : new rh2(httpURLConnection.getHeaderFields());
    }

    @Override // defpackage.oe2
    public final Uri h() {
        HttpURLConnection httpURLConnection = this.q;
        if (httpURLConnection != null) {
            return Uri.parse(httpURLConnection.getURL().toString());
        }
        eg2 eg2Var = this.p;
        if (eg2Var != null) {
            return eg2Var.a;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0070  */
    public final HttpURLConnection k(URL url, long j, long j2, boolean z, boolean z2, Map map) throws IOException {
        StringBuilder sb;
        String string;
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(this.k);
        httpURLConnection.setReadTimeout(this.l);
        HashMap map2 = new HashMap();
        map2.putAll(this.n.n());
        map2.putAll(this.o.n());
        map2.putAll(map);
        for (Map.Entry entry : map2.entrySet()) {
            httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        if (j != 0) {
            sb = new StringBuilder("bytes=");
            sb.append(j);
            sb.append("-");
            if (j2 != -1) {
                sb.append((j + j2) - 1);
            }
            string = sb.toString();
        } else if (j2 == -1) {
            string = null;
        } else {
            j = 0;
            sb = new StringBuilder("bytes=");
            sb.append(j);
            sb.append("-");
            if (j2 != -1) {
                sb.append((j + j2) - 1);
            }
            string = sb.toString();
        }
        if (string != null) {
            httpURLConnection.setRequestProperty("Range", string);
        }
        String str = this.m;
        if (str != null) {
            httpURLConnection.setRequestProperty("User-Agent", str);
        }
        httpURLConnection.setRequestProperty("Accept-Encoding", true != z ? "identity" : "gzip");
        httpURLConnection.setInstanceFollowRedirects(z2);
        httpURLConnection.setDoOutput(false);
        int i = eg2.f;
        httpURLConnection.setRequestMethod("GET");
        httpURLConnection.connect();
        return httpURLConnection;
    }

    @Override // defpackage.oe2
    public final void l() {
        try {
            InputStream inputStream = this.r;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    String str = qz1.a;
                    throw new ik2(e, 2000, 3);
                }
            }
            this.r = null;
            q();
            if (this.s) {
                this.s = false;
                j();
            }
            this.q = null;
            this.p = null;
        } catch (Throwable th) {
            this.r = null;
            q();
            if (this.s) {
                this.s = false;
                j();
            }
            this.q = null;
            this.p = null;
            throw th;
        }
    }

    public final URL n(URL url, String str) throws ik2 {
        if (str == null) {
            throw new ik2("Null location redirect", 2001, 1);
        }
        try {
            URL url2 = new URL(url, str);
            String protocol = url2.getProtocol();
            if (!"https".equals(protocol) && !"http".equals(protocol)) {
                throw new ik2("Unsupported protocol redirect: ".concat(String.valueOf(protocol)), 2001, 1);
            }
            if (this.j || protocol.equals(url.getProtocol())) {
                return url2;
            }
            String protocol2 = url.getProtocol();
            StringBuilder sb = new StringBuilder(ec.f(protocol, String.valueOf(protocol2).length() + 40, 1));
            sb.append("Disallowed cross-protocol redirect (");
            sb.append(protocol2);
            sb.append(" to ");
            sb.append(protocol);
            sb.append(")");
            throw new ik2(sb.toString(), 2001, 1);
        } catch (MalformedURLException e) {
            throw new ik2(e, 2001, 1);
        }
    }

    public final void q() {
        HttpURLConnection httpURLConnection = this.q;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e) {
                s90.b0("DefaultHttpDataSource", "Unexpected error while disconnecting", e);
            }
        }
    }
}
