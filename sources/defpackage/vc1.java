package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.HttpURLConnection;
import java.net.NoRouteToHostException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.net.ssl.HttpsURLConnection;

/* JADX INFO: loaded from: classes.dex */
public final class vc1 extends za2 implements en2 {
    public static final Pattern y = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");
    public static final AtomicReference z = new AtomicReference();
    public final uc1 j;
    public final int k;
    public final int l;
    public final String m;
    public final us2 n;
    public HttpURLConnection o;
    public InputStream p;
    public boolean q;
    public int r;
    public long s;
    public long t;
    public long u;
    public long v;
    public int w;
    public final HashSet x;

    public vc1(String str, ed1 ed1Var, int i, int i2, int i3) {
        super(true);
        this.j = new uc1(this);
        this.x = new HashSet();
        hn.v(true ^ TextUtils.isEmpty(str));
        this.m = str;
        this.n = new us2(25);
        this.k = i;
        this.l = i2;
        this.w = i3;
        if (ed1Var != null) {
            c(ed1Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:115:0x029b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:121:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:84:0x023c  */
    /* JADX WARN: Code duplicated, block: B:91:0x026d A[Catch: IOException -> 0x003d, TryCatch #4 {IOException -> 0x003d, blocks: (B:3:0x000c, B:4:0x001e, B:6:0x0026, B:8:0x0034, B:11:0x0040, B:12:0x0058, B:14:0x005e, B:22:0x0088, B:24:0x00ab, B:26:0x00d1, B:27:0x00d6, B:40:0x010c, B:89:0x0260, B:91:0x026d, B:93:0x027e, B:96:0x0287, B:97:0x0294, B:99:0x029b, B:100:0x02a2, B:101:0x02a3, B:102:0x02c0), top: B:113:0x000c }] */
    @Override // defpackage.oe2
    public final long a(eg2 eg2Var) throws ik2 {
        long j;
        int responseCode;
        String headerField;
        String protocol;
        int responseCode2;
        jl2 jl2Var;
        long jMax;
        long j2 = 0;
        this.v = 0L;
        this.u = 0L;
        try {
            Uri uri = eg2Var.a;
            long j3 = eg2Var.d;
            long j4 = eg2Var.c;
            URL url = new URL(uri.toString());
            int i = 0;
            while (true) {
                int i2 = i + 1;
                long j5 = j2;
                if (i > 20) {
                    StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 20);
                    sb.append("Too many redirects: ");
                    sb.append(i2);
                    throw new NoRouteToHostException(sb.toString());
                }
                HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
                if (httpURLConnection instanceof HttpsURLConnection) {
                    ((HttpsURLConnection) httpURLConnection).setSSLSocketFactory(this.j);
                }
                httpURLConnection.setConnectTimeout(this.k);
                httpURLConnection.setReadTimeout(this.l);
                for (Map.Entry entry : this.n.n().entrySet()) {
                    httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
                }
                if (j4 == j5) {
                    if (j3 != -1) {
                        j = j5;
                    }
                    httpURLConnection.setRequestProperty("User-Agent", this.m);
                    httpURLConnection.setRequestProperty("Accept-Encoding", "identity");
                    httpURLConnection.setInstanceFollowRedirects(false);
                    httpURLConnection.setDoOutput(false);
                    httpURLConnection.connect();
                    responseCode = httpURLConnection.getResponseCode();
                    if (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303 && responseCode != 307 && responseCode != 308) {
                        this.o = httpURLConnection;
                        try {
                            responseCode2 = httpURLConnection.getResponseCode();
                            this.r = responseCode2;
                            if (responseCode2 >= 200 || responseCode2 > 299) {
                                this.o.getHeaderFields();
                                k();
                                int i3 = this.r;
                                String str = qz1.a;
                                jl2Var = new jl2(i3, null);
                                if (this.r == 416) {
                                    throw jl2Var;
                                }
                                jl2Var.initCause(new ze2());
                                throw jl2Var;
                            }
                            if (responseCode2 != 200 || j4 == j5) {
                                j4 = j5;
                            }
                            this.s = j4;
                            if (j3 != -1) {
                                this.t = j3;
                            } else {
                                HttpURLConnection httpURLConnection2 = this.o;
                                String headerField2 = httpURLConnection2.getHeaderField("Content-Length");
                                if (TextUtils.isEmpty(headerField2)) {
                                    jMax = -1;
                                } else {
                                    try {
                                        jMax = Long.parseLong(headerField2);
                                    } catch (NumberFormatException unused) {
                                        StringBuilder sb2 = new StringBuilder(String.valueOf(headerField2).length() + 28);
                                        sb2.append("Unexpected Content-Length [");
                                        sb2.append(headerField2);
                                        sb2.append("]");
                                        jn.M(sb2.toString());
                                        jMax = -1;
                                    }
                                }
                                String headerField3 = httpURLConnection2.getHeaderField("Content-Range");
                                if (!TextUtils.isEmpty(headerField3)) {
                                    Matcher matcher = y.matcher(headerField3);
                                    if (matcher.find()) {
                                        try {
                                            long j6 = (Long.parseLong(matcher.group(2)) - Long.parseLong(matcher.group(1))) + 1;
                                            if (jMax < j5) {
                                                jMax = j6;
                                            } else if (jMax != j6) {
                                                StringBuilder sb3 = new StringBuilder(String.valueOf(headerField2).length() + 25 + String.valueOf(headerField3).length() + 1);
                                                sb3.append("Inconsistent headers [");
                                                sb3.append(headerField2);
                                                sb3.append("] [");
                                                sb3.append(headerField3);
                                                sb3.append("]");
                                                jn.T(sb3.toString());
                                                jMax = Math.max(jMax, j6);
                                            }
                                        } catch (NumberFormatException unused2) {
                                            StringBuilder sb4 = new StringBuilder(String.valueOf(headerField3).length() + 27);
                                            sb4.append("Unexpected Content-Range [");
                                            sb4.append(headerField3);
                                            sb4.append("]");
                                            jn.M(sb4.toString());
                                        }
                                    }
                                }
                                this.t = jMax != -1 ? jMax - this.s : -1L;
                            }
                            try {
                                this.p = this.o.getInputStream();
                                this.q = true;
                                e(eg2Var);
                                return this.t;
                            } catch (IOException e) {
                                k();
                                throw new ik2(e, 2000, 1);
                            }
                        } catch (IOException e2) {
                            k();
                            throw new ik2("Unable to connect to ".concat(String.valueOf(eg2Var.a.toString())), e2, 2000, 1);
                        }
                    }
                    headerField = httpURLConnection.getHeaderField("Location");
                    httpURLConnection.disconnect();
                    if (headerField != null) {
                        throw new ProtocolException("Null location redirect");
                    }
                    URL url2 = new URL(url, headerField);
                    protocol = url2.getProtocol();
                    if (!"https".equals(protocol) && !"http".equals(protocol)) {
                        throw new ProtocolException("Unsupported protocol redirect: ".concat(String.valueOf(protocol)));
                    }
                    url = url2;
                    i = i2;
                    j2 = j5;
                } else {
                    j = j4;
                }
                StringBuilder sb5 = new StringBuilder(String.valueOf(j).length() + 7);
                sb5.append("bytes=");
                long j7 = j;
                sb5.append(j7);
                sb5.append("-");
                String string = sb5.toString();
                if (j3 != -1) {
                    long j8 = (j7 + j3) - 1;
                    StringBuilder sb6 = new StringBuilder(string.length() + String.valueOf(j8).length());
                    sb6.append(string);
                    sb6.append(j8);
                    string = sb6.toString();
                }
                httpURLConnection.setRequestProperty("Range", string);
                httpURLConnection.setRequestProperty("User-Agent", this.m);
                httpURLConnection.setRequestProperty("Accept-Encoding", "identity");
                httpURLConnection.setInstanceFollowRedirects(false);
                httpURLConnection.setDoOutput(false);
                httpURLConnection.connect();
                responseCode = httpURLConnection.getResponseCode();
                if (responseCode != 300) {
                    this.o = httpURLConnection;
                    responseCode2 = httpURLConnection.getResponseCode();
                    this.r = responseCode2;
                    if (responseCode2 >= 200) {
                    }
                    this.o.getHeaderFields();
                    k();
                    int i4 = this.r;
                    String str2 = qz1.a;
                    jl2Var = new jl2(i4, null);
                    if (this.r == 416) {
                        throw jl2Var;
                    }
                    jl2Var.initCause(new ze2());
                    throw jl2Var;
                }
                headerField = httpURLConnection.getHeaderField("Location");
                httpURLConnection.disconnect();
                if (headerField != null) {
                    throw new ProtocolException("Null location redirect");
                }
                URL url3 = new URL(url, headerField);
                protocol = url3.getProtocol();
                if (!"https".equals(protocol)) {
                    throw new ProtocolException("Unsupported protocol redirect: ".concat(String.valueOf(protocol)));
                }
                url = url3;
                i = i2;
                j2 = j5;
            }
        } catch (IOException e3) {
            throw new ik2("Unable to connect to ".concat(String.valueOf(eg2Var.a.toString())), e3, 2000, 1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0074 A[Catch: IOException -> 0x008b, TryCatch #0 {IOException -> 0x008b, blocks: (B:2:0x0000, B:21:0x0054, B:23:0x005c, B:26:0x0066, B:27:0x006c, B:29:0x0074, B:32:0x007b, B:33:0x0080, B:34:0x0081, B:5:0x000b, B:7:0x0016, B:8:0x001a, B:10:0x0022, B:13:0x0038, B:14:0x0042, B:15:0x0047, B:16:0x0048, B:17:0x004d, B:18:0x004e), top: B:39:0x0000 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x007b A[Catch: IOException -> 0x008b, TryCatch #0 {IOException -> 0x008b, blocks: (B:2:0x0000, B:21:0x0054, B:23:0x005c, B:26:0x0066, B:27:0x006c, B:29:0x0074, B:32:0x007b, B:33:0x0080, B:34:0x0081, B:5:0x000b, B:7:0x0016, B:8:0x001a, B:10:0x0022, B:13:0x0038, B:14:0x0042, B:15:0x0047, B:16:0x0048, B:17:0x004d, B:18:0x004e), top: B:39:0x0000 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x0081 A[Catch: IOException -> 0x008b, TRY_LEAVE, TryCatch #0 {IOException -> 0x008b, blocks: (B:2:0x0000, B:21:0x0054, B:23:0x005c, B:26:0x0066, B:27:0x006c, B:29:0x0074, B:32:0x007b, B:33:0x0080, B:34:0x0081, B:5:0x000b, B:7:0x0016, B:8:0x001a, B:10:0x0022, B:13:0x0038, B:14:0x0042, B:15:0x0047, B:16:0x0048, B:17:0x004d, B:18:0x004e), top: B:39:0x0000 }] */
    @Override // defpackage.k73
    public final int d(byte[] bArr, int i, int i2) throws ik2 {
        int i3;
        try {
            if (this.u != this.s) {
                AtomicReference atomicReference = z;
                byte[] bArr2 = (byte[]) atomicReference.getAndSet(null);
                if (bArr2 == null) {
                    bArr2 = new byte[4096];
                }
                while (true) {
                    long j = this.u;
                    long j2 = this.s;
                    if (j == j2) {
                        atomicReference.set(bArr2);
                        break;
                    }
                    int i4 = this.p.read(bArr2, 0, (int) Math.min(j2 - j, bArr2.length));
                    if (Thread.interrupted()) {
                        throw new InterruptedIOException();
                    }
                    if (i4 == -1) {
                        throw new EOFException();
                    }
                    this.u += (long) i4;
                    f(i4);
                }
            }
            if (i2 == 0) {
                return 0;
            }
            long j3 = this.t;
            if (j3 != -1) {
                long j4 = j3 - this.v;
                if (j4 != 0) {
                    i2 = (int) Math.min(i2, j4);
                    i3 = this.p.read(bArr, i, i2);
                    if (i3 == -1) {
                        this.v += (long) i3;
                        f(i3);
                        return i3;
                    }
                    if (this.t != -1) {
                        throw new EOFException();
                    }
                }
            } else {
                i3 = this.p.read(bArr, i, i2);
                if (i3 == -1) {
                    this.v += (long) i3;
                    f(i3);
                    return i3;
                }
                if (this.t != -1) {
                    throw new EOFException();
                }
            }
            return -1;
        } catch (IOException e) {
            throw new ik2(e, 2000, 2);
        }
    }

    @Override // defpackage.oe2
    public final Map g() {
        HttpURLConnection httpURLConnection = this.o;
        if (httpURLConnection == null) {
            return null;
        }
        return httpURLConnection.getHeaderFields();
    }

    @Override // defpackage.oe2
    public final Uri h() {
        HttpURLConnection httpURLConnection = this.o;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    public final void k() {
        HttpURLConnection httpURLConnection = this.o;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e) {
                jn.P("Unexpected error while disconnecting", e);
            }
            this.o = null;
        }
    }

    @Override // defpackage.oe2
    public final void l() {
        HashSet hashSet = this.x;
        try {
            InputStream inputStream = this.p;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    throw new ik2(e, 2000, 3);
                }
            }
            this.p = null;
            k();
            if (this.q) {
                this.q = false;
                j();
            }
            hashSet.clear();
        } catch (Throwable th) {
            this.p = null;
            k();
            if (this.q) {
                this.q = false;
                j();
            }
            hashSet.clear();
            throw th;
        }
    }
}
