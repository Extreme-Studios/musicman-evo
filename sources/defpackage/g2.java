package defpackage;

import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.Log;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.lang.reflect.InvocationTargetException;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.concurrent.Executors;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class g2 implements au2, pm1 {
    public final /* synthetic */ int f;
    public int g;
    public Object h;
    public Object i;
    public Object j;

    public g2(ig igVar) {
        this.f = 1;
        this.h = Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), new cb(false));
        this.i = Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), new cb(true));
        int i = o90.a;
        gm gmVar = new gm();
        Looper mainLooper = Looper.getMainLooper();
        if (Build.VERSION.SDK_INT >= 28) {
            pe.b(mainLooper);
        } else {
            try {
            } catch (IllegalAccessException e) {
                e = e;
                Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
                new Handler(mainLooper);
            } catch (InstantiationException e2) {
                e = e2;
                Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
                new Handler(mainLooper);
            } catch (NoSuchMethodException e3) {
                e = e3;
                Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
                new Handler(mainLooper);
            } catch (InvocationTargetException e4) {
                Throwable cause = e4.getCause();
                if (cause instanceof RuntimeException) {
                    throw ((RuntimeException) cause);
                }
                if (!(cause instanceof Error)) {
                    throw new RuntimeException(cause);
                }
                throw ((Error) cause);
            }
        }
        this.j = gmVar;
        this.g = 4;
    }

    public static final void n(long j) throws ao0 {
        long[] jArr = {141540322, 456640674, 1141397064, 993500330, 1614820873, 3337980909L, 410218731, 1716462158, 477127367};
        long j2 = jArr[0];
        long j3 = jArr[1];
        long j4 = jArr[2];
        long j5 = jArr[3];
        long j6 = jArr[4];
        long j7 = jArr[5];
        if (j % (((((((~j2) & j3) | j4) + ((j2 & j5) | j6)) - j7) + jArr[6]) ^ (jArr[7] % 477127367)) != 0) {
            throw new ao0();
        }
    }

    public void a() {
        a00 a00Var = new a00();
        a00Var.a = new cy();
        a00Var.b = new cy();
        a00Var.c = new cy();
        a00Var.d = new cy();
        a00Var.e = new f(0.0f);
        a00Var.f = new f(0.0f);
        a00Var.g = new f(0.0f);
        a00Var.h = new f(0.0f);
        int i = 0;
        a00Var.i = new ig(i);
        a00Var.j = new ig(i);
        a00Var.k = new ig(i);
        a00Var.l = new ig(i);
        this.h = a00Var;
        this.i = new int[10][];
        this.j = new a00[10];
    }

    @Override // defpackage.pm1
    /* JADX INFO: renamed from: b */
    public /* synthetic */ void mo0b(Object obj) {
        ((ge3) obj).m(0, ((xb3) this.h).a, (qd3) this.i, (vd3) this.j, this.g);
    }

    public Looper c() {
        Looper looper;
        Object obj = this.j;
        synchronized (obj) {
            try {
                int i = this.g;
                HandlerThread handlerThread = (HandlerThread) this.h;
                if (i != 0) {
                    dq.g(handlerThread, "Invalid state: handlerThread should already been initialized.");
                } else if (handlerThread == null) {
                    jn.p("Starting the looper thread.");
                    HandlerThread handlerThread2 = new HandlerThread("LooperProvider");
                    this.h = handlerThread2;
                    handlerThread2.start();
                    this.i = new za0(((HandlerThread) this.h).getLooper(), 2);
                    jn.p("Looper thread started.");
                } else {
                    jn.p("Resuming the looper thread");
                    obj.notifyAll();
                }
                this.g++;
                looper = ((HandlerThread) this.h).getLooper();
            } catch (Throwable th) {
                throw th;
            }
        }
        return looper;
    }

    public fu1 d() {
        fu1 fu1Var;
        g2 g2Var = (g2) this.j;
        if (g2Var == null) {
            fu1Var = null;
        } else {
            fu1Var = new fu1(g2Var.g, (String) g2Var.h, (String) g2Var.i, null, null);
        }
        return new fu1(this.g, (String) this.h, (String) this.i, fu1Var, null);
    }

    public void e(long j) throws bo0, ao0 {
        long[] jArr = {2139842053, 728564241, 750932242, 1403848321, 1892818418, 4558981222L, 1919655804, 1856374729, 899334107};
        long j2 = jArr[0];
        long j3 = jArr[1];
        long j4 = jArr[2];
        long j5 = jArr[3];
        long j6 = jArr[4];
        long j7 = jArr[5];
        long j8 = jArr[6];
        long j9 = jArr[7];
        n(j);
        long j10 = j / (((((((~j2) & j3) | j4) + ((j2 & j5) | j6)) - j7) + j8) ^ (j9 % 899334107));
        if (j10 < 0 || j10 > ((xn0) this.h).a.length) {
            throw new bo0();
        }
        this.g = (int) j10;
    }

    public long f() {
        long[] jArr = {491705403, 818579170, 1201981453, 810223590, 1243973916, 3701563257L, 554701476, 1889947178, 1780695788};
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = jArr[2];
        long j4 = jArr[3];
        long j5 = jArr[4];
        long j6 = jArr[5];
        return ((long) this.g) * (((((((~j) & j2) | j3) + ((j & j4) | j5)) - j6) + jArr[6]) ^ (jArr[7] % 1780695788));
    }

    public JSONObject g() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("Code", this.g);
        jSONObject.put("Message", (String) this.h);
        jSONObject.put("Domain", (String) this.i);
        g2 g2Var = (g2) this.j;
        if (g2Var == null) {
            jSONObject.put("Cause", "null");
            return jSONObject;
        }
        jSONObject.put("Cause", g2Var.g());
        return jSONObject;
    }

    public void h() {
        HandlerThread handlerThread;
        synchronized (this.h) {
            try {
                hn.M(this.g > 0);
                int i = this.g - 1;
                this.g = i;
                if (i == 0 && (handlerThread = (HandlerThread) this.j) != null) {
                    handlerThread.quit();
                    this.j = null;
                    this.i = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.au2
    public byte[] i(int i, byte[] bArr) throws InvalidAlgorithmParameterException {
        if (i > this.g) {
            throw new InvalidAlgorithmParameterException("tag size too big");
        }
        e03 e03Var = (e03) this.i;
        ((Mac) e03Var.get()).update(bArr);
        return Arrays.copyOf(((Mac) e03Var.get()).doFinal(), i);
    }

    public long j() throws bo0 {
        try {
            on0 on0Var = (on0) this.i;
            xn0 xn0Var = (xn0) this.h;
            int i = this.g;
            this.g = i + 1;
            return on0Var.k(xn0Var, i);
        } catch (IndexOutOfBoundsException e) {
            throw new bo0(e);
        }
    }

    public int k() throws bo0 {
        try {
            on0 on0Var = (on0) this.i;
            xn0 xn0Var = (xn0) this.h;
            int i = this.g;
            this.g = i + 1;
            int iK = on0Var.k(xn0Var, i) & 255;
            on0 on0Var2 = (on0) this.i;
            xn0 xn0Var2 = (xn0) this.h;
            int i2 = this.g;
            this.g = i2 + 1;
            int iK2 = iK | ((on0Var2.k(xn0Var2, i2) & 255) << 8);
            on0 on0Var3 = (on0) this.i;
            xn0 xn0Var3 = (xn0) this.h;
            int i3 = this.g;
            this.g = i3 + 1;
            int iK3 = iK2 | ((on0Var3.k(xn0Var3, i3) & 255) << 16);
            on0 on0Var4 = (on0) this.i;
            xn0 xn0Var4 = (xn0) this.h;
            int i4 = this.g;
            this.g = i4 + 1;
            return (on0Var4.k(xn0Var4, i4) << 24) | iK3;
        } catch (IndexOutOfBoundsException e) {
            throw new bo0(e);
        }
    }

    public long l() throws bo0, zn0 {
        int i = 0;
        long j = 0;
        while (i < 64) {
            try {
                on0 on0Var = (on0) this.i;
                xn0 xn0Var = (xn0) this.h;
                int i2 = this.g;
                this.g = i2 + 1;
                byte bK = on0Var.k(xn0Var, i2);
                j |= ((long) (bK & 127)) << i;
                if (i == 63) {
                    if (bK > 1) {
                        throw new zn0();
                    }
                    i = 63;
                }
                if ((bK & 128) == 0) {
                    return (-(j & 1)) ^ (j >>> 1);
                }
                i += 7;
            } catch (IndexOutOfBoundsException e) {
                throw new bo0(e);
            }
        }
        throw new zn0();
    }

    public xn0 m(long j) throws bo0, ao0 {
        int[] iArr = {1667674495, 1502201381, 1197125461, 478240810, 622476187, -1652496091, 840440151, 1203013321, 774318984};
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        int i5 = iArr[4];
        int i6 = iArr[5];
        int i7 = iArr[6];
        int i8 = iArr[7];
        int iE = ec.e((i2 & (~i)) | i3, (i & i4) | i5, i6, i7);
        n(f() + j);
        int i9 = this.g;
        long j2 = i9;
        xn0 xn0Var = (xn0) this.h;
        long j3 = (j >> ((i8 % 774318984) ^ iE)) + j2;
        if (j3 > xn0Var.a.length || j3 < j2) {
            throw new bo0();
        }
        try {
            int i10 = (int) j3;
            xn0 xn0VarN = ((on0) this.i).n(xn0Var, i9, i10);
            this.g = i10;
            return xn0VarN;
        } catch (IndexOutOfBoundsException e) {
            throw new AssertionError(wn0.a("CEiv6BFfPnitUE+D"), e);
        }
    }

    public String toString() {
        switch (this.f) {
            case 0:
                try {
                    return g().toString(2);
                } catch (JSONException unused) {
                    return "Error forming toString output.";
                }
            default:
                return super.toString();
        }
    }

    public g2(int i, String str, String str2, g2 g2Var) {
        this.f = 0;
        this.g = i;
        this.h = str;
        this.i = str2;
        this.j = g2Var;
    }

    public g2(xn0 xn0Var, int i, on0 on0Var) {
        this.f = 3;
        this.h = xn0Var;
        this.g = i;
        this.i = on0Var;
    }

    public g2(de2 de2Var, qd0 qd0Var) {
        this.f = 9;
        bz1 bz1Var = new bz1(qd0Var);
        lg3 lg3Var = new lg3();
        this.h = de2Var;
        this.i = bz1Var;
        this.j = lg3Var;
        this.g = 1048576;
    }

    public /* synthetic */ g2(xb3 xb3Var, qd3 qd3Var, vd3 vd3Var, int i) {
        this.f = 8;
        this.h = xb3Var;
        this.i = qd3Var;
        this.j = vd3Var;
        this.g = i;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public g2(String str, SecretKeySpec secretKeySpec) throws GeneralSecurityException {
        int i;
        this.f = 5;
        e03 e03Var = new e03(this);
        this.i = e03Var;
        if (jn.r(2)) {
            this.h = str;
            this.j = secretKeySpec;
            if (secretKeySpec.getEncoded().length >= 16) {
                switch (str.hashCode()) {
                    case -1823053428:
                        if (str.equals("HMACSHA1")) {
                            i = 20;
                            this.g = i;
                            e03Var.get();
                            return;
                        }
                        break;
                    case 392315023:
                        if (str.equals("HMACSHA224")) {
                            i = 28;
                            this.g = i;
                            e03Var.get();
                            return;
                        }
                        break;
                    case 392315118:
                        if (str.equals("HMACSHA256")) {
                            i = 32;
                            this.g = i;
                            e03Var.get();
                            return;
                        }
                        break;
                    case 392316170:
                        if (str.equals("HMACSHA384")) {
                            i = 48;
                            this.g = i;
                            e03Var.get();
                            return;
                        }
                        break;
                    case 392317873:
                        if (str.equals("HMACSHA512")) {
                            i = 64;
                            this.g = i;
                            e03Var.get();
                            return;
                        }
                        break;
                }
                throw new NoSuchAlgorithmException("unknown Hmac algorithm: ".concat(str));
            }
            throw new InvalidAlgorithmParameterException("key size too small, need at least 16 bytes");
        }
        j7.r("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
        throw null;
    }

    public g2(md1 md1Var) throws zp2 {
        this.f = 6;
        this.h = md1Var.getLayoutParams();
        ViewParent parent = md1Var.getParent();
        this.j = md1Var.a0();
        if (parent instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) parent;
            this.i = viewGroup;
            this.g = viewGroup.indexOfChild(md1Var.p0());
            viewGroup.removeView(md1Var.p0());
            md1Var.O0(true);
            return;
        }
        throw new zp2("Could not get the parent of the WebView for an overlay.");
    }

    public g2(int i) {
        this.f = i;
        switch (i) {
            case 4:
                this.h = null;
                this.i = null;
                this.g = 0;
                this.j = new Object();
                break;
            case 7:
                this.h = new Object();
                this.i = null;
                this.j = null;
                this.g = 0;
                break;
        }
    }
}
