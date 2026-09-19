package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayDeque;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class gd1 extends za2 implements en2 {
    public static final Pattern A = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");
    public final int j;
    public final int k;
    public final String l;
    public final us2 m;
    public eg2 n;
    public HttpURLConnection o;
    public final ArrayDeque p;
    public InputStream q;
    public boolean r;
    public int s;
    public long t;
    public long u;
    public long v;
    public long w;
    public long x;
    public final long y;
    public final long z;

    public gd1(String str, ed1 ed1Var, int i, int i2, long j, long j2) {
        super(true);
        hn.v(true ^ TextUtils.isEmpty(str));
        this.l = str;
        this.m = new us2(25);
        this.j = i;
        this.k = i2;
        this.p = new ArrayDeque();
        this.y = j;
        this.z = j2;
        if (ed1Var != null) {
            c(ed1Var);
        }
    }

    @Override // defpackage.oe2
    public final long a(eg2 eg2Var) throws ik2 {
        this.n = eg2Var;
        this.u = 0L;
        long j = eg2Var.c;
        long j2 = eg2Var.d;
        long jMin = this.y;
        if (j2 != -1) {
            jMin = Math.min(jMin, j2);
        }
        this.v = j;
        HttpURLConnection httpURLConnectionK = k(1, j, (jMin + j) - 1);
        this.o = httpURLConnectionK;
        String headerField = httpURLConnectionK.getHeaderField("Content-Range");
        if (!TextUtils.isEmpty(headerField)) {
            Matcher matcher = A.matcher(headerField);
            if (matcher.find()) {
                try {
                    Long.parseLong(matcher.group(1));
                    long j3 = Long.parseLong(matcher.group(2));
                    long j4 = Long.parseLong(matcher.group(3));
                    if (j2 != -1) {
                        this.t = j2;
                        this.w = Math.max(j3, (this.v + j2) - 1);
                    } else {
                        this.t = j4 - this.v;
                        this.w = j4 - 1;
                    }
                    this.x = j3;
                    this.r = true;
                    e(eg2Var);
                    return this.t;
                } catch (NumberFormatException unused) {
                    StringBuilder sb = new StringBuilder(String.valueOf(headerField).length() + 27);
                    sb.append("Unexpected Content-Range [");
                    sb.append(headerField);
                    sb.append("]");
                    jn.M(sb.toString());
                }
            }
        }
        throw new fd1("Invalid content range: ".concat(String.valueOf(headerField)), 2000, 1);
    }

    @Override // defpackage.k73
    public final int d(byte[] bArr, int i, int i2) throws ik2 {
        if (i2 == 0) {
            return 0;
        }
        try {
            long j = this.t;
            long j2 = this.u;
            if (j - j2 == 0) {
                return -1;
            }
            long j3 = this.v + j2;
            long j4 = i2;
            long j5 = this.z;
            long j6 = j3 + j4 + j5;
            long j7 = this.x;
            long j8 = j7 + 1;
            if (j6 > j8) {
                long j9 = this.w;
                if (j7 < j9) {
                    long jMin = Math.min(j9, Math.max(((this.y + j8) - j5) - 1, (-1) + j8 + j4));
                    k(2, j8, jMin);
                    this.x = jMin;
                    j7 = jMin;
                }
            }
            int i3 = this.q.read(bArr, i, (int) Math.min(j4, ((j7 + 1) - this.v) - this.u));
            if (i3 == -1) {
                throw new EOFException();
            }
            this.u += (long) i3;
            f(i3);
            return i3;
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

    public final HttpURLConnection k(int i, long j, long j2) throws ik2 {
        String string = this.n.a.toString();
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(string).openConnection();
            httpURLConnection.setConnectTimeout(this.j);
            httpURLConnection.setReadTimeout(this.k);
            for (Map.Entry entry : this.m.n().entrySet()) {
                httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
            }
            StringBuilder sb = new StringBuilder(String.valueOf(j).length() + 7 + String.valueOf(j2).length());
            sb.append("bytes=");
            sb.append(j);
            sb.append("-");
            sb.append(j2);
            httpURLConnection.setRequestProperty("Range", sb.toString());
            httpURLConnection.setRequestProperty("User-Agent", this.l);
            httpURLConnection.setRequestProperty("Accept-Encoding", "identity");
            httpURLConnection.setRequestMethod("GET");
            httpURLConnection.connect();
            this.p.add(httpURLConnection);
            String string2 = this.n.a.toString();
            try {
                int responseCode = httpURLConnection.getResponseCode();
                this.s = responseCode;
                if (responseCode < 200 || responseCode > 299) {
                    httpURLConnection.getHeaderFields();
                    n();
                    int i2 = this.s;
                    throw new fd1(ec.j(new StringBuilder(String.valueOf(i2).length() + 15), "Response code: ", i2), 2000, i);
                }
                try {
                    InputStream inputStream = httpURLConnection.getInputStream();
                    if (this.q != null) {
                        inputStream = new SequenceInputStream(this.q, inputStream);
                    }
                    this.q = inputStream;
                    return httpURLConnection;
                } catch (IOException e) {
                    n();
                    throw new ik2(e, 2000, i);
                }
            } catch (IOException e2) {
                n();
                throw new ik2("Unable to connect to ".concat(String.valueOf(string2)), e2, 2000, i);
            }
        } catch (IOException e3) {
            throw new ik2("Unable to connect to ".concat(String.valueOf(string)), e3, 2000, i);
        }
    }

    @Override // defpackage.oe2
    public final void l() {
        try {
            InputStream inputStream = this.q;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    throw new ik2(e, 2000, 3);
                }
            }
            this.q = null;
            n();
            if (this.r) {
                this.r = false;
                j();
            }
        } catch (Throwable th) {
            this.q = null;
            n();
            if (this.r) {
                this.r = false;
                j();
            }
            throw th;
        }
    }

    public final void n() {
        while (true) {
            ArrayDeque arrayDeque = this.p;
            if (arrayDeque.isEmpty()) {
                this.o = null;
                return;
            } else {
                try {
                    ((HttpURLConnection) arrayDeque.remove()).disconnect();
                } catch (Exception e) {
                    jn.P("Unexpected error while disconnecting", e);
                }
            }
        }
    }
}
