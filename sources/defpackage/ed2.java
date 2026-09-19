package defpackage;

import android.util.Pair;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.URI;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ed2 implements Runnable {
    public final /* synthetic */ int f = 0;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Serializable l;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ ed2(gd2 gd2Var, String str, q8 q8Var, boolean z, String str2, byte[] bArr) {
        this.h = gd2Var;
        this.i = str;
        this.k = q8Var;
        this.g = z;
        this.j = str2;
        this.l = bArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Throwable th;
        SocketTimeoutException socketTimeoutException;
        HttpURLConnection httpURLConnection;
        byte[] byteArray;
        int i = this.f;
        Object obj = this.l;
        Object obj2 = this.k;
        Object obj3 = this.j;
        Object obj4 = this.h;
        Object obj5 = this.i;
        switch (i) {
            case 0:
                gd2 gd2Var = (gd2) obj4;
                q8 q8Var = (q8) obj2;
                String str = (String) obj3;
                byte[] bArr = (byte[]) obj;
                HttpURLConnection httpURLConnection2 = null;
                try {
                    try {
                        httpURLConnection = (HttpURLConnection) URI.create((String) obj5).toURL().openConnection();
                        try {
                            Objects.requireNonNull(httpURLConnection);
                            ly1 ly1Var = new ly1(18, httpURLConnection);
                            ExecutorService executorService = gd2Var.a;
                            ix ixVar = q8Var.c;
                            if (ixVar != null) {
                                ixVar.a(ly1Var, executorService);
                            }
                            httpURLConnection.setRequestProperty("User-Agent", gd2Var.b);
                            int i2 = (int) gd2Var.c;
                            httpURLConnection.setConnectTimeout(i2);
                            httpURLConnection.setReadTimeout(i2);
                            if (this.g) {
                                httpURLConnection.setDoOutput(true);
                                httpURLConnection.setRequestMethod("POST");
                                if (str != null) {
                                    httpURLConnection.setRequestProperty("Content-Type", str);
                                }
                                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream());
                                try {
                                    bufferedOutputStream.write(bArr);
                                    bufferedOutputStream.close();
                                } catch (Throwable th2) {
                                    try {
                                        bufferedOutputStream.close();
                                        throw th2;
                                    } catch (Throwable th3) {
                                        th2.addSuppressed(th3);
                                        throw th2;
                                    }
                                }
                            }
                            int responseCode = httpURLConnection.getResponseCode();
                            InputStream inputStream = responseCode < 400 ? httpURLConnection.getInputStream() : httpURLConnection.getErrorStream();
                            try {
                                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                try {
                                    if (inputStream == null) {
                                        byteArray = new byte[0];
                                        byteArrayOutputStream.close();
                                    } else {
                                        byte[] bArr2 = new byte[4096];
                                        while (true) {
                                            int i3 = inputStream.read(bArr2);
                                            if (i3 != -1) {
                                                byteArrayOutputStream.write(bArr2, 0, i3);
                                            } else {
                                                byteArray = byteArrayOutputStream.toByteArray();
                                                byteArrayOutputStream.close();
                                                inputStream.close();
                                            }
                                        }
                                    }
                                    q8Var.a(new fd2(responseCode, byteArray));
                                } catch (Throwable th4) {
                                    try {
                                        byteArrayOutputStream.close();
                                        throw th4;
                                    } catch (Throwable th5) {
                                        th4.addSuppressed(th5);
                                        throw th4;
                                    }
                                }
                            } catch (Throwable th6) {
                                if (inputStream == null) {
                                    throw th6;
                                }
                                try {
                                    inputStream.close();
                                    throw th6;
                                } catch (Throwable th7) {
                                    th6.addSuppressed(th7);
                                    throw th6;
                                }
                            }
                        } catch (SocketTimeoutException e) {
                            socketTimeoutException = e;
                            httpURLConnection2 = httpURLConnection;
                            String message = socketTimeoutException.getMessage();
                            StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 9);
                            sb.append("Timeout: ");
                            sb.append(message);
                            q8Var.b(new TimeoutException(sb.toString()));
                            httpURLConnection = httpURLConnection2;
                            break;
                        } catch (Throwable th8) {
                            th = th8;
                            httpURLConnection2 = httpURLConnection;
                            q8Var.b(th);
                            httpURLConnection = httpURLConnection2;
                            break;
                        }
                    } catch (Throwable th9) {
                        if (httpURLConnection2 == null) {
                            throw th9;
                        }
                        httpURLConnection2.disconnect();
                        throw th9;
                    }
                } catch (SocketTimeoutException e2) {
                    socketTimeoutException = e2;
                } catch (Throwable th10) {
                    th = th10;
                }
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                    return;
                }
                return;
            default:
                Pair pair = (Pair) obj5;
                ((z93) ((n83) obj4).g.n).o(((Integer) pair.first).intValue(), (yd3) pair.second, (qd3) obj3, (vd3) obj2, (IOException) obj, this.g);
                return;
        }
    }

    public /* synthetic */ ed2(n83 n83Var, Pair pair, qd3 qd3Var, vd3 vd3Var, IOException iOException, boolean z) {
        this.h = n83Var;
        this.i = pair;
        this.j = qd3Var;
        this.k = vd3Var;
        this.l = iOException;
        this.g = z;
    }
}
