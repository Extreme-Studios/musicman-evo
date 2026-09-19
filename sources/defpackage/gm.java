package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.text.Selection;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.webkit.WebView;
import com.google.ads.mediation.admob.AdMobAdapter;
import java.lang.reflect.Constructor;
import java.nio.ByteBuffer;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes.dex */
public final class gm implements hc, w23, gs, p20, aw, ad, ii2, gd0, pd0 {
    public static gm f;
    public static Cipher j;
    public static gm p;
    public static final /* synthetic */ gm g = new gm();
    public static final /* synthetic */ gm h = new gm();
    public static final gm i = new gm();
    public static final Object k = new Object();
    public static final Object l = new Object();
    public static final gm m = new gm();
    public static final gm n = new gm();
    public static final gm o = new gm();
    public static final /* synthetic */ gm q = new gm();
    public static final /* synthetic */ gm r = new gm();

    public static boolean b(wg wgVar, Editable editable, int i2, int i3, boolean z) {
        int iMin;
        if (editable != null && i2 >= 0 && i3 >= 0) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd) {
                if (z) {
                    int iMax = Math.max(i2, 0);
                    int length = editable.length();
                    if (selectionStart >= 0 && length >= selectionStart && iMax >= 0) {
                        loop0: while (true) {
                            boolean z2 = false;
                            while (true) {
                                if (iMax == 0) {
                                    break loop0;
                                }
                                selectionStart--;
                                if (selectionStart < 0) {
                                    if (!z2) {
                                        selectionStart = 0;
                                        break loop0;
                                    }
                                    break loop0;
                                }
                                char cCharAt = editable.charAt(selectionStart);
                                if (z2) {
                                    if (Character.isHighSurrogate(cCharAt)) {
                                        iMax--;
                                    }
                                } else if (!Character.isSurrogate(cCharAt)) {
                                    iMax--;
                                } else if (!Character.isHighSurrogate(cCharAt)) {
                                    z2 = true;
                                }
                                selectionStart = -1;
                                break loop0;
                            }
                        }
                    }
                    selectionStart = -1;
                    break loop0;
                    int iMax2 = Math.max(i3, 0);
                    iMin = editable.length();
                    if (selectionEnd >= 0 && iMin >= selectionEnd && iMax2 >= 0) {
                        loop2: while (true) {
                            boolean z3 = false;
                            while (true) {
                                if (iMax2 != 0) {
                                    if (selectionEnd >= iMin) {
                                        if (!z3) {
                                            break loop2;
                                        }
                                        break loop2;
                                    }
                                    char cCharAt2 = editable.charAt(selectionEnd);
                                    if (z3) {
                                        if (Character.isLowSurrogate(cCharAt2)) {
                                            iMax2--;
                                            selectionEnd++;
                                        }
                                    } else if (!Character.isSurrogate(cCharAt2)) {
                                        iMax2--;
                                        selectionEnd++;
                                    } else if (!Character.isLowSurrogate(cCharAt2)) {
                                        selectionEnd++;
                                        z3 = true;
                                    }
                                    iMin = -1;
                                    break loop2;
                                }
                                iMin = selectionEnd;
                                break loop2;
                            }
                        }
                    }
                    iMin = -1;
                    break loop2;
                    if (selectionStart != -1 && iMin != -1) {
                    }
                } else {
                    selectionStart = Math.max(selectionStart - i2, 0);
                    iMin = Math.min(selectionEnd + i3, editable.length());
                }
                f50[] f50VarArr = (f50[]) editable.getSpans(selectionStart, iMin, f50.class);
                if (f50VarArr != null && f50VarArr.length > 0) {
                    for (f50 f50Var : f50VarArr) {
                        int spanStart = editable.getSpanStart(f50Var);
                        int spanEnd = editable.getSpanEnd(f50Var);
                        selectionStart = Math.min(spanStart, selectionStart);
                        iMin = Math.max(spanEnd, iMin);
                    }
                    int iMax3 = Math.max(selectionStart, 0);
                    int iMin2 = Math.min(iMin, editable.length());
                    wgVar.beginBatchEdit();
                    editable.delete(iMax3, iMin2);
                    wgVar.endBatchEdit();
                    return true;
                }
            }
        }
        return false;
    }

    public static String e(byte[] bArr, byte[] bArr2) throws er0 {
        byte[] bArrDoFinal;
        byte[] iv;
        int length = bArr.length;
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
            synchronized (k) {
                o().init(1, secretKeySpec, (SecureRandom) null);
                bArrDoFinal = o().doFinal(bArr2);
                iv = o().getIV();
            }
            int length2 = bArrDoFinal.length + iv.length;
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length2);
            byteBufferAllocate.put(iv).put(bArrDoFinal);
            byteBufferAllocate.flip();
            byte[] bArr3 = new byte[length2];
            byteBufferAllocate.get(bArr3);
            return Base64.encodeToString(bArr3, 2);
        } catch (InvalidKeyException e) {
            throw new er0(e);
        } catch (NoSuchAlgorithmException e2) {
            throw new er0(e2);
        } catch (BadPaddingException e3) {
            throw new er0(e3);
        } catch (IllegalBlockSizeException e4) {
            throw new er0(e4);
        } catch (NoSuchPaddingException e5) {
            throw new er0(e5);
        }
    }

    public static final j73 g(PackageInfo packageInfo, j73... j73VarArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr != null) {
            if (signatureArr.length != 1) {
                Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
                return null;
            }
            v73 v73Var = new v73(packageInfo.signatures[0].toByteArray());
            for (int i2 = 0; i2 < j73VarArr.length; i2++) {
                if (j73VarArr[i2].equals(v73Var)) {
                    return j73VarArr[i2];
                }
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0044  */
    /* JADX WARN: Code duplicated, block: B:48:0x00f5  */
    public static f93 j(Context context, xx1 xx1Var) {
        String str;
        String className;
        String str2 = xx1Var.a;
        Set set = xx1Var.c;
        List listUnmodifiableList = !set.isEmpty() ? Collections.unmodifiableList(new ArrayList(set)) : null;
        cx cxVar = b22.c().g;
        f32 f32Var = ut0.f.a;
        Set set2 = xx1Var.h;
        String strC = f32.c(context);
        boolean z = false;
        int i2 = 0;
        if (set2.contains(strC)) {
            z = true;
        } else {
            cxVar.getClass();
            if (new ArrayList(cxVar.a).contains(strC)) {
                z = true;
            }
        }
        Bundle bundle = xx1Var.d.getBundle(AdMobAdapter.class.getName());
        String str3 = xx1Var.e;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            String packageName = applicationContext.getPackageName();
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            while (true) {
                int i3 = i2 + 1;
                if (i3 >= stackTrace.length) {
                    className = null;
                    break;
                }
                StackTraceElement stackTraceElement = stackTrace[i2];
                String className2 = stackTraceElement.getClassName();
                if ("loadAd".equalsIgnoreCase(stackTraceElement.getMethodName()) && (f32.c.equalsIgnoreCase(className2) || f32.d.equalsIgnoreCase(className2) || f32.e.equalsIgnoreCase(className2) || f32.f.equalsIgnoreCase(className2) || f32.g.equalsIgnoreCase(className2) || f32.h.equalsIgnoreCase(className2))) {
                    className = stackTrace[i3].getClassName();
                    break;
                }
                i2 = i3;
            }
            if (packageName != null) {
                StringTokenizer stringTokenizer = new StringTokenizer(packageName, ".");
                StringBuilder sb = new StringBuilder();
                if (stringTokenizer.hasMoreElements()) {
                    sb.append(stringTokenizer.nextToken());
                    for (int i4 = 2; i4 > 0 && stringTokenizer.hasMoreElements(); i4--) {
                        sb.append(".");
                        sb.append(stringTokenizer.nextToken());
                    }
                    packageName = sb.toString();
                }
                if (className == null || className.contains(packageName)) {
                    className = null;
                }
            } else {
                className = null;
            }
            str = className;
        } else {
            str = null;
        }
        boolean z2 = xx1Var.k;
        cx cxVar2 = b22.c().g;
        int i5 = xx1Var.g;
        cxVar2.getClass();
        return new f93(8, -1L, bundle, -1, listUnmodifiableList, z, Math.max(i5, -1), false, str3, null, null, str2, xx1Var.d, xx1Var.i, Collections.unmodifiableList(new ArrayList(xx1Var.j)), xx1Var.f, str, z2, null, -1, (String) Collections.max(Arrays.asList(null, ""), ts.i), new ArrayList(xx1Var.b), xx1Var.l, null, ec.z(1), xx1Var.m, 0L);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0036  */
    /* JADX WARN: Code duplicated, block: B:24:0x003d  */
    /* JADX WARN: Code duplicated, block: B:26:0x004b A[RETURN] */
    public static final boolean k(PackageInfo packageInfo) {
        PackageInfo packageInfo2;
        boolean z;
        j73 j73VarG;
        if (packageInfo != null) {
            if ("com.android.vending".equals(packageInfo.packageName) || "com.google.android.gms".equals(packageInfo.packageName)) {
                ApplicationInfo applicationInfo = packageInfo.applicationInfo;
                z = (applicationInfo == null || (applicationInfo.flags & 129) == 0) ? false : true;
                packageInfo2 = packageInfo;
            } else {
                packageInfo2 = packageInfo;
            }
            if (packageInfo != null && packageInfo2.signatures != null) {
                if (z) {
                    j73VarG = g(packageInfo2, i93.a);
                } else {
                    j73VarG = g(packageInfo2, i93.a[0]);
                }
                if (j73VarG != null) {
                    return true;
                }
            }
            return false;
        }
        packageInfo2 = null;
        z = true;
        if (packageInfo != null) {
            if (z) {
                j73VarG = g(packageInfo2, i93.a);
            } else {
                j73VarG = g(packageInfo2, i93.a[0]);
            }
            if (j73VarG != null) {
                return true;
            }
        }
        return false;
    }

    public static byte[] m(String str, byte[] bArr) throws er0 {
        byte[] bArrDoFinal;
        int length = bArr.length;
        try {
            byte[] bArrDecode = Base64.decode(str, 2);
            if (bArrDecode.length == 0 && str.length() > 0) {
                throw new IllegalArgumentException("Unable to decode ".concat(str));
            }
            int length2 = bArrDecode.length;
            if (length2 <= 16) {
                throw new er0();
            }
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length2);
            byteBufferAllocate.put(bArrDecode);
            byteBufferAllocate.flip();
            byte[] bArr2 = new byte[16];
            byte[] bArr3 = new byte[length2 - 16];
            byteBufferAllocate.get(bArr2);
            byteBufferAllocate.get(bArr3);
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
            synchronized (k) {
                o().init(2, secretKeySpec, new IvParameterSpec(bArr2));
                bArrDoFinal = o().doFinal(bArr3);
            }
            return bArrDoFinal;
        } catch (IllegalArgumentException e) {
            throw new er0(e);
        } catch (InvalidAlgorithmParameterException e2) {
            throw new er0(e2);
        } catch (InvalidKeyException e3) {
            throw new er0(e3);
        } catch (NoSuchAlgorithmException e4) {
            throw new er0(e4);
        } catch (BadPaddingException e5) {
            throw new er0(e5);
        } catch (IllegalBlockSizeException e6) {
            throw new er0(e6);
        } catch (NoSuchPaddingException e7) {
            throw new er0(e7);
        }
    }

    public static final Cipher o() {
        Cipher cipher;
        synchronized (l) {
            try {
                if (j == null) {
                    j = Cipher.getInstance("AES/CBC/PKCS5Padding");
                }
                cipher = j;
            } catch (Throwable th) {
                throw th;
            }
        }
        return cipher;
    }

    public static final void q(WebView webView, String str) {
        if (webView == null || TextUtils.isEmpty(str)) {
            return;
        }
        try {
            try {
                webView.evaluateJavascript(str, null);
            } catch (IllegalStateException unused) {
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 12);
                sb.append("javascript: ");
                sb.append(str);
                webView.loadUrl(sb.toString());
            }
        } catch (Exception e) {
            e.getMessage();
        }
    }

    @Override // defpackage.ii2
    public /* synthetic */ Constructor a() {
        int[] iArr = hd0.h;
        return Class.forName("androidx.media3.decoder.midi.MidiExtractor").asSubclass(nd0.class).getConstructor(null);
    }

    @Override // defpackage.p20
    public q20 d(md mdVar) {
        return new ok((Context) mdVar.g, (String) mdVar.h, (us2) mdVar.i, mdVar.f);
    }

    @Override // defpackage.w23
    public boolean f(Class cls) {
        return d23.class.isAssignableFrom(cls);
    }

    @Override // defpackage.w23
    public f33 h(Class cls) {
        if (!d23.class.isAssignableFrom(cls)) {
            j7.p("Unsupported message type: ".concat(cls.getName()));
            return null;
        }
        try {
            return (f33) d23.s(cls.asSubclass(d23.class)).v(3, null);
        } catch (Exception e) {
            j7.h("Unable to get message info for ".concat(cls.getName()), e);
            return null;
        }
    }

    @Override // defpackage.gs
    public boolean i(rr rrVar) {
        return false;
    }

    public void p(WebView webView, String str, Object... objArr) {
        if (webView != null) {
            StringBuilder sb = new StringBuilder(128);
            sb.append("if(window.omidBridge!==undefined){omidBridge.");
            sb.append(str);
            sb.append("(");
            for (Object obj : objArr) {
                if (obj == null) {
                    sb.append("null");
                } else if (obj instanceof String) {
                    String string = obj.toString();
                    if (string.startsWith("{")) {
                        sb.append(string);
                    } else {
                        sb.append('\"');
                        sb.append(string);
                        sb.append('\"');
                    }
                } else {
                    sb.append(obj);
                }
                sb.append(",");
            }
            sb.setLength(sb.length() - 1);
            sb.append(")}");
            String string2 = sb.toString();
            Handler handler = webView.getHandler();
            if (handler == null) {
                handler = new Handler(Looper.getMainLooper());
            }
            if (Looper.myLooper() == handler.getLooper()) {
                q(webView, string2);
            } else {
                handler.post(new u52(this, webView, string2));
            }
        }
    }

    @Override // defpackage.pd0
    public void s() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.pd0
    public void v(ee0 ee0Var) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.pd0
    public me0 z(int i2, int i3) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.ii2
    public /* synthetic */ Object a() {
        int i2 = zb0.a;
        try {
            return Class.forName("androidx.media3.effect.DefaultVideoFrameProcessor$Factory$Builder");
        } catch (Exception e) {
            throw new IllegalStateException(e);
        }
    }

    @Override // defpackage.aw
    public void l() {
    }

    @Override // defpackage.gs
    public void c(rr rrVar, boolean z) {
    }

    @Override // defpackage.aw
    public void n(int i2, Object obj) {
    }
}
