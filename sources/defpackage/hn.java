package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.media.MediaCodecInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.StrictMode;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public abstract class hn implements qd0 {
    public static Context f;
    public static Boolean g;
    public static final xo2 l;
    public static final xn1 p;
    public static final /* synthetic */ int t = 0;
    public static final float[][] h = {new float[]{0.401288f, 0.650173f, -0.051461f}, new float[]{-0.250268f, 1.204414f, 0.045854f}, new float[]{-0.002079f, 0.048952f, 0.953127f}};
    public static final float[][] i = {new float[]{1.8620678f, -1.0112547f, 0.14918678f}, new float[]{0.38752654f, 0.62144744f, -0.00897398f}, new float[]{-0.0158415f, -0.03412294f, 1.0499644f}};
    public static final float[] j = {95.047f, 100.0f, 108.883f};
    public static final float[][] k = {new float[]{0.41233894f, 0.35762063f, 0.18051042f}, new float[]{0.2126f, 0.7152f, 0.0722f}, new float[]{0.01932141f, 0.11916382f, 0.9503448f}};
    public static final int[] m = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};
    public static final int[] n = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};
    public static final tt0 o = new tt0(6);
    public static final xn1 q = new xn1(20);
    public static final l32 r = new l32(7);
    public static final l32 s = new l32(19);

    static {
        int i2 = 3;
        l = new xo2("NO_OWNER", i2);
        p = new xn1(i2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x00d5, code lost:
    
        if (r11 != 3) goto L64;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.tc0 A(defpackage.oe0 r11, boolean r12) throws defpackage.no0 {
        /*
            Method dump skipped, instruction units count: 300
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hn.A(oe0, boolean):tc0");
    }

    public static void B(String str, boolean z) {
        if (z) {
            return;
        }
        j7.p(str);
    }

    public static boolean C(JSONArray jSONArray, String str) {
        if (jSONArray != null && str != null) {
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                String strOptString = jSONArray.optString(i2);
                try {
                    if ((((Boolean) tu0.e.c.a(lx0.Jb)).booleanValue() ? Pattern.compile(strOptString, 2) : Pattern.compile(strOptString)).matcher(str).lookingAt()) {
                        return true;
                    }
                } catch (PatternSyntaxException e) {
                    vc3.C.h.d("RtbAdapterMap.hasAtleastOneRegexMatch", e);
                }
            }
        }
        return false;
    }

    public static int D(oe0 oe0Var) throws no0 {
        int iR = oe0Var.r(4);
        if (iR == 15) {
            if (oe0Var.f() >= 24) {
                return oe0Var.r(24);
            }
            throw no0.a(null, "AAC header insufficient data");
        }
        if (iR < 13) {
            return m[iR];
        }
        throw no0.a(null, "AAC header wrong Sampling Frequency Index");
    }

    public static gg0 E(int i2, String str, cw1 cw1Var) {
        int iB = cw1Var.b();
        if (cw1Var.b() == 1684108385) {
            cw1Var.G(8);
            return new gg0(str, null, vj2.i(cw1Var.l(iB - 16)));
        }
        s90.Q("MetadataUtil", "Failed to parse text attribute: ".concat(c9.a(i2)));
        return null;
    }

    public static void F(boolean z, String str, int i2) {
        if (z) {
            return;
        }
        j7.p(jn.E(str, Integer.valueOf(i2)));
    }

    public static void G(byte[] bArr, long j2, int i2) {
        for (int i3 = 0; i3 < 4; i3++) {
            bArr[i2 + i3] = (byte) (255 & j2);
            j2 >>= 8;
        }
    }

    public static bg0 H(int i2, String str, cw1 cw1Var, boolean z, boolean z2) {
        int iJ = J(cw1Var);
        if (z2) {
            iJ = Math.min(1, iJ);
        }
        if (iJ >= 0) {
            return z ? new gg0(str, null, vj2.i(Integer.toString(iJ))) : new xf0("und", str, Integer.toString(iJ));
        }
        s90.Q("MetadataUtil", "Failed to parse uint8 attribute: ".concat(c9.a(i2)));
        return null;
    }

    public static void I(boolean z, String str, long j2) {
        if (z) {
            return;
        }
        j7.p(jn.E(str, Long.valueOf(j2)));
    }

    public static int J(cw1 cw1Var) {
        int iB = cw1Var.b();
        if (cw1Var.b() == 1684108385) {
            cw1Var.G(8);
            int i2 = iB - 16;
            if (i2 == 1) {
                return cw1Var.K();
            }
            if (i2 == 2) {
                return cw1Var.L();
            }
            if (i2 == 3) {
                return cw1Var.O();
            }
            if (i2 == 4 && (cw1Var.I() & 128) == 0) {
                return cw1Var.h();
            }
        }
        s90.Q("MetadataUtil", "Failed to parse data atom to int");
        return -1;
    }

    public static void K(boolean z, String str, Object obj) {
        if (z) {
            return;
        }
        j7.p(jn.E(str, obj));
    }

    public static gg0 L(int i2, String str, cw1 cw1Var) {
        int iB = cw1Var.b();
        if (cw1Var.b() == 1684108385 && iB >= 22) {
            cw1Var.G(10);
            int iL = cw1Var.L();
            if (iL > 0) {
                StringBuilder sb = new StringBuilder(String.valueOf(iL).length());
                sb.append(iL);
                String string = sb.toString();
                int iL2 = cw1Var.L();
                if (iL2 > 0) {
                    StringBuilder sb2 = new StringBuilder(string.length() + 1 + String.valueOf(iL2).length());
                    sb2.append(string);
                    sb2.append("/");
                    sb2.append(iL2);
                    string = sb2.toString();
                }
                return new gg0(str, null, vj2.i(string));
            }
        }
        s90.Q("MetadataUtil", "Failed to parse index/count attribute: ".concat(c9.a(i2)));
        return null;
    }

    public static void M(boolean z) {
        if (z) {
            return;
        }
        j7.a();
    }

    public static void N(String str, boolean z) {
        if (z) {
            return;
        }
        j7.e(str);
    }

    public static void O(Object obj, String str) {
        if (obj != null) {
            return;
        }
        j7.l(str);
    }

    public static void P(int i2, int i3) {
        String strE;
        if (i2 < 0 || i2 >= i3) {
            if (i2 < 0) {
                strE = jn.E("%s (%s) must not be negative", "index", Integer.valueOf(i2));
            } else {
                if (i3 < 0) {
                    j7.p(ec.j(new StringBuilder(String.valueOf(i3).length() + 15), "negative size: ", i3));
                    return;
                }
                strE = jn.E("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i2), Integer.valueOf(i3));
            }
            throw new IndexOutOfBoundsException(strE);
        }
    }

    public static void Q(int i2, int i3) {
        if (i2 < 0 || i2 > i3) {
            throw new IndexOutOfBoundsException(S("index", i2, i3));
        }
    }

    public static void R(int i2, int i3, int i4) {
        String strS;
        if (i2 < 0 || i3 < i2 || i3 > i4) {
            if (i2 < 0 || i2 > i4) {
                strS = S("start index", i2, i4);
            } else {
                strS = (i3 < 0 || i3 > i4) ? S("end index", i3, i4) : jn.E("end index (%s) must not be less than start index (%s)", Integer.valueOf(i3), Integer.valueOf(i2));
            }
            throw new IndexOutOfBoundsException(strS);
        }
    }

    public static String S(String str, int i2, int i3) {
        if (i2 < 0) {
            return jn.E("%s (%s) must not be negative", str, Integer.valueOf(i2));
        }
        if (i3 >= 0) {
            return jn.E("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i2), Integer.valueOf(i3));
        }
        j7.p(ec.j(new StringBuilder(String.valueOf(i3).length() + 15), "negative size: ", i3));
        return null;
    }

    public static Object b(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() != 0) {
            return creator.createFromParcel(parcel);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:50:0x0058 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static ub c(byte[] bArr) throws Throwable {
        Throwable th;
        ObjectInputStream objectInputStream;
        IOException e;
        ub ubVar = new ub();
        if (bArr != null) {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            ObjectInputStream objectInputStream2 = null;
            try {
                try {
                    objectInputStream = new ObjectInputStream(byteArrayInputStream);
                    try {
                        for (int i2 = objectInputStream.readInt(); i2 > 0; i2--) {
                            ubVar.a.add(new tb(Uri.parse(objectInputStream.readUTF()), objectInputStream.readBoolean()));
                        }
                    } catch (IOException e2) {
                        e = e2;
                        e.printStackTrace();
                        if (objectInputStream != null) {
                        }
                        byteArrayInputStream.close();
                        return ubVar;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (0 != 0) {
                        try {
                            objectInputStream2.close();
                        } catch (IOException e3) {
                            e3.printStackTrace();
                        }
                    }
                    try {
                        byteArrayInputStream.close();
                        throw th;
                    } catch (IOException e4) {
                        e4.printStackTrace();
                        throw th;
                    }
                }
            } catch (IOException e5) {
                objectInputStream = null;
                e = e5;
            } catch (Throwable th3) {
                th = th3;
                if (0 != 0) {
                    objectInputStream2.close();
                }
                byteArrayInputStream.close();
                throw th;
            }
            try {
                objectInputStream.close();
            } catch (IOException e6) {
                e6.printStackTrace();
            }
            try {
                byteArrayInputStream.close();
            } catch (IOException e7) {
                e7.printStackTrace();
            }
        }
        return ubVar;
    }

    public static hn d(int i2) {
        if (i2 != 0) {
            return i2 != 1 ? new cy() : new pd();
        }
        return new cy();
    }

    public static qw f(Context context, AttributeSet attributeSet, int i2, int i3) {
        qw qwVar = new qw();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iw.a, i2, i3);
        qwVar.a = typedArrayObtainStyledAttributes.getInt(0, 1);
        qwVar.b = typedArrayObtainStyledAttributes.getInt(10, 1);
        qwVar.c = typedArrayObtainStyledAttributes.getBoolean(9, false);
        qwVar.d = typedArrayObtainStyledAttributes.getBoolean(11, false);
        typedArrayObtainStyledAttributes.recycle();
        return qwVar;
    }

    public static int g(float f2) {
        if (f2 < 1.0f) {
            return -16777216;
        }
        if (f2 > 99.0f) {
            return -1;
        }
        float f3 = (f2 + 16.0f) / 116.0f;
        float f4 = f2 > 8.0f ? f3 * f3 * f3 : f2 / 903.2963f;
        float f5 = f3 * f3 * f3;
        boolean z = f5 > 0.008856452f;
        float f6 = z ? f5 : ((f3 * 116.0f) - 16.0f) / 903.2963f;
        if (!z) {
            f5 = ((f3 * 116.0f) - 16.0f) / 903.2963f;
        }
        float[] fArr = j;
        return fa.a(f6 * fArr[0], f4 * fArr[1], f5 * fArr[2]);
    }

    public static int h(int i2) {
        if (i2 == 0) {
            return 1;
        }
        if (i2 == 1) {
            return 2;
        }
        j7.m("Could not convert ", i2, " to BackoffPolicy");
        return 0;
    }

    public static int i(int i2) {
        if (i2 == 0) {
            return 1;
        }
        if (i2 == 1) {
            return 2;
        }
        if (i2 == 2) {
            return 3;
        }
        if (i2 == 3) {
            return 4;
        }
        if (i2 == 4) {
            return 5;
        }
        if (Build.VERSION.SDK_INT >= 30 && i2 == 5) {
            return 6;
        }
        j7.m("Could not convert ", i2, " to NetworkType");
        return 0;
    }

    public static int j(int i2) {
        if (i2 == 0) {
            return 1;
        }
        if (i2 == 1) {
            return 2;
        }
        j7.m("Could not convert ", i2, " to OutOfQuotaPolicy");
        return 0;
    }

    public static int k(int i2) {
        if (i2 == 0) {
            return 1;
        }
        if (i2 == 1) {
            return 2;
        }
        if (i2 == 2) {
            return 3;
        }
        if (i2 == 3) {
            return 4;
        }
        if (i2 == 4) {
            return 5;
        }
        if (i2 == 5) {
            return 6;
        }
        j7.m("Could not convert ", i2, " to State");
        return 0;
    }

    public static synchronized boolean m(Context context) {
        Boolean bool;
        Context applicationContext = context.getApplicationContext();
        Context context2 = f;
        if (context2 != null && (bool = g) != null && context2 == applicationContext) {
            return bool.booleanValue();
        }
        g = null;
        if (ej1.k()) {
            g = Boolean.valueOf(applicationContext.getPackageManager().isInstantApp());
        } else {
            try {
                context.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
                g = Boolean.TRUE;
            } catch (ClassNotFoundException unused) {
                g = Boolean.FALSE;
            }
        }
        f = applicationContext;
        return g.booleanValue();
    }

    public static float n(int i2) {
        float f2 = i2 / 255.0f;
        return (f2 <= 0.04045f ? f2 / 12.92f : (float) Math.pow((f2 + 0.055f) / 1.055f, 2.4000000953674316d)) * 100.0f;
    }

    public static void o(EditorInfo editorInfo, InputConnection inputConnection, TextView textView) {
        if (inputConnection == null || editorInfo.hintText != null) {
            return;
        }
        for (ViewParent parent = textView.getParent(); parent instanceof View; parent = parent.getParent()) {
        }
    }

    public static void p(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            j40.a(view, charSequence);
            return;
        }
        l40 l40Var = l40.p;
        if (l40Var != null && l40Var.f == view) {
            l40.b(null);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            new l40(view, charSequence);
            return;
        }
        l40 l40Var2 = l40.q;
        if (l40Var2 != null && l40Var2.f == view) {
            l40Var2.a();
        }
        view.setOnLongClickListener(null);
        view.setLongClickable(false);
        view.setOnHoverListener(null);
    }

    public static float q() {
        return ((float) Math.pow(0.5689655172413793d, 3.0d)) * 100.0f;
    }

    public static Object r(ii2 ii2Var) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        try {
            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
            return ii2Var.a();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public static String s(JSONObject jSONObject, String str, String str2) {
        JSONArray jSONArrayOptJSONArray;
        if (jSONObject != null && (jSONArrayOptJSONArray = jSONObject.optJSONArray(str2)) != null) {
            for (int i2 = 0; i2 < jSONArrayOptJSONArray.length(); i2++) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i2);
                if (jSONObjectOptJSONObject != null) {
                    JSONArray jSONArrayOptJSONArray2 = jSONObjectOptJSONObject.optJSONArray("including");
                    JSONArray jSONArrayOptJSONArray3 = jSONObjectOptJSONObject.optJSONArray("excluding");
                    if (C(jSONArrayOptJSONArray2, str) && !C(jSONArrayOptJSONArray3, str)) {
                        return jSONObjectOptJSONObject.optString("effective_ad_unit_id", "");
                    }
                }
            }
        }
        return "";
    }

    public static void t(int i2, am0 am0Var, uc3 uc3Var, am0 am0Var2, am0... am0VarArr) {
        if (am0Var2 == null) {
            am0Var2 = new am0(new il0[0]);
        }
        if (am0Var != null) {
            tj2 tj2Var = vj2.g;
            w40.k0("initialCapacity", 4);
            Object[] objArrCopyOf = new Object[4];
            int i3 = 0;
            for (il0 il0Var : am0Var.a) {
                if (v02.class.isAssignableFrom(il0Var.getClass())) {
                    il0 il0Var2 = (il0) v02.class.cast(il0Var);
                    il0Var2.getClass();
                    int length = objArrCopyOf.length;
                    int i4 = i3 + 1;
                    int iD = pj2.d(length, i4);
                    if (iD > length) {
                        objArrCopyOf = Arrays.copyOf(objArrCopyOf, iD);
                    }
                    objArrCopyOf[i3] = il0Var2;
                    i3 = i4;
                }
            }
            qk2 qk2VarO = vj2.o(objArrCopyOf, i3);
            int i5 = qk2VarO.i;
            for (int i6 = 0; i6 < i5; i6++) {
                v02 v02Var = (v02) qk2VarO.get(i6);
                if (!v02Var.a.equals("com.android.capture.fps") || i2 == 2) {
                    am0Var2 = am0Var2.c(v02Var);
                }
            }
        }
        for (am0 am0Var3 : am0VarArr) {
            am0Var2 = am0Var2.b(am0Var3);
        }
        if (am0Var2.a.length > 0) {
            uc3Var.j = am0Var2;
        }
    }

    public static void u(String str, Exception exc) {
        Log.e("OMIDLIB", str, exc);
    }

    public static void v(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    public static byte[] w(byte[] bArr, byte[] bArr2) {
        long jZ = z(0, bArr) & 67108863;
        int i2 = 3;
        long jZ2 = (z(3, bArr) >> 2) & 67108611;
        long jZ3 = (z(6, bArr) >> 4) & 67092735;
        long jZ4 = (z(9, bArr) >> 6) & 66076671;
        long jZ5 = (z(12, bArr) >> 8) & 1048575;
        byte[] bArr3 = new byte[17];
        long j2 = 0;
        long j3 = 0;
        long j4 = 0;
        long j5 = 0;
        long j6 = 0;
        int i3 = 0;
        while (true) {
            int length = bArr2.length;
            if (i3 >= length) {
                long j7 = j2 + (j3 >> 26);
                long j8 = j7 & 67108863;
                long j9 = j4 + (j7 >> 26);
                long j10 = j9 & 67108863;
                long j11 = j5 + (j9 >> 26);
                long j12 = j11 & 67108863;
                long j13 = ((j11 >> 26) * 5) + j6;
                long j14 = j13 >> 26;
                long j15 = j13 & 67108863;
                long j16 = j15 + 5;
                long j17 = (j3 & 67108863) + j14;
                long j18 = j17 + (j16 >> 26);
                long j19 = j8 + (j18 >> 26);
                long j20 = j10 + (j19 >> 26);
                long j21 = (j12 + (j20 >> 26)) - 67108864;
                long j22 = j21 >> 63;
                long j23 = ~j22;
                long j24 = (j17 & j22) | (j18 & 67108863 & j23);
                long j25 = (j8 & j22) | (j19 & 67108863 & j23);
                long j26 = (j10 & j22) | (j20 & 67108863 & j23);
                long jZ6 = z(16, bArr) + (((j16 & 67108863 & j23) | (j15 & j22) | (j24 << 26)) & 4294967295L);
                long jZ7 = z(20, bArr);
                long jZ8 = z(24, bArr);
                long jZ9 = z(28, bArr) + (((j26 >> 18) | (((j12 & j22) | (j21 & j23)) << 8)) & 4294967295L);
                byte[] bArr4 = new byte[16];
                G(bArr4, jZ6 & 4294967295L, 0);
                long j27 = jZ7 + (((j24 >> 6) | (j25 << 20)) & 4294967295L) + (jZ6 >> 32);
                G(bArr4, j27 & 4294967295L, 4);
                long j28 = jZ8 + (((j26 << 14) | (j25 >> 12)) & 4294967295L) + (j27 >> 32);
                G(bArr4, j28 & 4294967295L, 8);
                G(bArr4, (jZ9 + (j28 >> 32)) & 4294967295L, 12);
                return bArr4;
            }
            int iMin = Math.min(16, length - i3);
            System.arraycopy(bArr2, i3, bArr3, 0, iMin);
            bArr3[iMin] = 1;
            if (iMin != 16) {
                Arrays.fill(bArr3, iMin + 1, 17, (byte) 0);
            }
            long j29 = jZ5 * 5;
            long j30 = jZ4 * 5;
            long j31 = jZ3 * 5;
            long jZ10 = j6 + (z(0, bArr3) & 67108863);
            long jZ11 = j3 + ((z(i2, bArr3) >> 2) & 67108863);
            long jZ12 = j2 + ((z(6, bArr3) >> 4) & 67108863);
            long jZ13 = j4 + ((z(9, bArr3) >> 6) & 67108863);
            long j32 = jZ2;
            long jZ14 = j5 + (((z(12, bArr3) >> 8) & 67108863) | ((long) (bArr3[16] << 24)));
            long j33 = jZ11 * jZ;
            long j34 = jZ11 * j32;
            long j35 = jZ12 * jZ;
            long j36 = jZ11 * jZ3;
            long j37 = jZ12 * j32;
            long j38 = jZ13 * jZ;
            long j39 = jZ11 * jZ4;
            long j40 = jZ12 * jZ3;
            long j41 = jZ13 * j32;
            long j42 = jZ14 * jZ;
            long j43 = (jZ2 * 5 * jZ14) + (jZ13 * j31) + (jZ12 * j30) + (jZ11 * j29) + (jZ10 * jZ);
            long j44 = j43 & 67108863;
            long j45 = jZ13 * j30;
            long j46 = j31 * jZ14;
            long j47 = j46 + j45 + (jZ12 * j29) + (jZ10 * j32) + j33 + (j43 >> 26);
            long j48 = j30 * jZ14;
            long j49 = j48 + (jZ13 * j29) + (jZ10 * jZ3) + j34 + j35 + (j47 >> 26);
            long j50 = (jZ14 * j29) + (jZ10 * jZ4) + j36 + j37 + j38 + (j49 >> 26);
            long j51 = (jZ10 * jZ5) + j39 + j40 + j41 + j42 + (j50 >> 26);
            long j52 = ((j51 >> 26) * 5) + j44;
            j3 = (j47 & 67108863) + (j52 >> 26);
            i3 += 16;
            j2 = j49 & 67108863;
            j4 = j50 & 67108863;
            j5 = j51 & 67108863;
            j6 = j52 & 67108863;
            jZ2 = j32;
            i2 = 3;
        }
    }

    public static int x(int i2, int i3) {
        RoundingMode roundingMode = RoundingMode.CEILING;
        roundingMode.getClass();
        if (i3 == 0) {
            throw new ArithmeticException("/ by zero");
        }
        int i4 = i2 / i3;
        int i5 = i2 - (i3 * i4);
        if (i5 == 0) {
            return i4;
        }
        int i6 = ((i2 ^ i3) >> 31) | 1;
        switch (ql2.a[roundingMode.ordinal()]) {
            case 1:
                ar.A(false);
                return i4;
            case 2:
                return i4;
            case 3:
                if (i6 >= 0) {
                    return i4;
                }
                break;
            case 4:
                break;
            case 5:
                if (i6 <= 0) {
                    return i4;
                }
                break;
            case 6:
            case 7:
            case 8:
                int iAbs = Math.abs(i5);
                int iAbs2 = iAbs - (Math.abs(i3) - iAbs);
                if (iAbs2 == 0) {
                    RoundingMode roundingMode2 = RoundingMode.HALF_UP;
                    RoundingMode roundingMode3 = RoundingMode.HALF_EVEN;
                    return i4;
                }
                if (iAbs2 <= 0) {
                    return i4;
                }
                break;
            default:
                throw new AssertionError();
        }
        return i4 + i6;
    }

    public static int y(boolean z) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        List supportedPerformancePoints;
        try {
            uc3 uc3Var = new uc3();
            uc3Var.e("video/avc");
            de3 de3Var = new de3(uc3Var);
            String str = de3Var.m;
            if (str != null) {
                List listA = cd3.a(str, z, false);
                String strC = cd3.c(de3Var);
                Iterable iterableA = strC == null ? qk2.j : cd3.a(strC, z, false);
                tj2 tj2Var = vj2.g;
                sj2 sj2Var = new sj2(4);
                sj2Var.b(listA);
                sj2Var.b(iterableA);
                qk2 qk2VarF = sj2Var.f();
                for (int i2 = 0; i2 < qk2VarF.i; i2++) {
                    if (((pc3) qk2VarF.get(i2)).d != null && (videoCapabilities = ((pc3) qk2VarF.get(i2)).d.getVideoCapabilities()) != null && (supportedPerformancePoints = videoCapabilities.getSupportedPerformancePoints()) != null && !supportedPerformancePoints.isEmpty()) {
                        i80.j();
                        MediaCodecInfo.VideoCapabilities.PerformancePoint performancePointC = i80.c();
                        for (int i3 = 0; i3 < supportedPerformancePoints.size(); i3++) {
                            if (i80.e(supportedPerformancePoints.get(i3)).covers(performancePointC)) {
                                return 2;
                            }
                        }
                        return 1;
                    }
                }
            }
        } catch (ad3 unused) {
        }
        return 0;
    }

    public static long z(int i2, byte[] bArr) {
        int i3 = bArr[i2] & 255;
        int i4 = bArr[i2 + 1] & 255;
        int i5 = bArr[i2 + 2] & 255;
        return ((long) (((bArr[i2 + 3] & 255) << 24) | (i4 << 8) | i3 | (i5 << 16))) & 4294967295L;
    }

    public abstract void e(k00 k00Var, float f2, float f3);
}
