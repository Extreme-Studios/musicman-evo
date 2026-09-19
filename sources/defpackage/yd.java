package defpackage;

import android.app.UiModeManager;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.icu.text.DecimalFormatSymbols;
import android.opengl.EGL14;
import android.opengl.EGLDisplay;
import android.opengl.GLES20;
import android.opengl.GLU;
import android.os.Build;
import android.os.Looper;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.PasswordTransformationMethod;
import android.util.Log;
import android.util.Xml;
import android.view.ActionMode;
import android.widget.TextView;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* JADX INFO: loaded from: classes.dex */
public abstract class yd implements qd0 {
    public static final Object f = new Object();
    public static final p83 g;
    public static p83 h;
    public static final ei i;
    public static final ei[] j;
    public static final tt0 k;
    public static final xn1 l;
    public static final xn1 m;
    public static final l32 n;
    public static final l32 o;
    public static final /* synthetic */ int p = 0;
    public static UiModeManager q;

    static {
        Object obj = null;
        g = new p83(obj, obj, obj, 3);
        ei eiVar = new ei("CLIENT_TELEMETRY");
        i = eiVar;
        j = new ei[]{eiVar};
        int i2 = 1;
        k = new tt0(i2);
        l = new xn1(i2);
        m = new xn1(19);
        n = new l32(6);
        o = new l32(18);
    }

    public static fg A(Context context) throws mb3 {
        try {
            return fg.c(context, fg.b);
        } catch (Exception e) {
            throw new mb3(e);
        }
    }

    public static void B(int i2) throws GeneralSecurityException {
        if (i2 < 2048) {
            throw new GeneralSecurityException(String.format("Modulus size is %d; only modulus size >= 2048-bit is supported", Integer.valueOf(i2)));
        }
        if (cr2.a() && i2 != 2048 && i2 != 3072) {
            throw new GeneralSecurityException(String.format("Modulus size is %d; only modulus size of 2048- or 3072-bit is supported in FIPS mode.", Integer.valueOf(i2)));
        }
    }

    public static void C(ArrayList arrayList, um0 um0Var) {
        String str = (String) um0Var.u();
        if (TextUtils.isEmpty(str)) {
            return;
        }
        arrayList.add(str);
    }

    public static void D(BigInteger bigInteger) throws GeneralSecurityException {
        if (!bigInteger.testBit(0)) {
            j7.r("Public exponent must be odd.");
        } else {
            if (bigInteger.compareTo(BigInteger.valueOf(65536L)) > 0) {
                return;
            }
            j7.r("Public exponent must be greater than 65536.");
        }
    }

    public static void E() throws ln1 {
        StringBuilder sb = new StringBuilder();
        boolean z = false;
        while (true) {
            int iGlGetError = GLES20.glGetError();
            if (iGlGetError == 0) {
                break;
            }
            if (z) {
                sb.append('\n');
            }
            String strGluErrorString = GLU.gluErrorString(iGlGetError);
            if (strGluErrorString == null) {
                strGluErrorString = "error code: 0x".concat(String.valueOf(Integer.toHexString(iGlGetError)));
            }
            sb.append("glError: ");
            sb.append(strGluErrorString);
            z = true;
        }
        if (z) {
            throw new ln1(sb.toString());
        }
    }

    public static void F(String str, boolean z) throws ln1 {
        if (!z) {
            throw new ln1(str);
        }
    }

    public static boolean G(String str) throws ln1 {
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        F("No EGL display.", !eGLDisplayEglGetDisplay.equals(EGL14.EGL_NO_DISPLAY));
        F("Error in eglInitialize.", EGL14.eglInitialize(eGLDisplayEglGetDisplay, new int[1], 0, new int[1], 0));
        E();
        String strEglQueryString = EGL14.eglQueryString(eGLDisplayEglGetDisplay, 12373);
        return strEglQueryString != null && strEglQueryString.contains(str);
    }

    public static float d(float f2) {
        if (f2 < 0.5f) {
            return 0.5f;
        }
        if (f2 > 2.0f) {
            return 2.0f;
        }
        return f2;
    }

    public static int e(int i2, int i3, int i4) {
        if (i3 <= i4) {
            if (i2 < i3) {
                return i3;
            }
            return i2 > i4 ? i4 : i2;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i4 + " is less than minimum " + i3 + '.');
    }

    public static ColorStateList f(Context context, TypedArray typedArray, int i2) {
        int resourceId;
        ColorStateList colorStateListE;
        return (!typedArray.hasValue(i2) || (resourceId = typedArray.getResourceId(i2, 0)) == 0 || (colorStateListE = jn.e(context, resourceId)) == null) ? typedArray.getColorStateList(i2) : colorStateListE;
    }

    public static final String g(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static tv i(m6 m6Var) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 28) {
            return new tv(pe.k(m6Var));
        }
        TextPaint textPaint = new TextPaint(m6Var.getPaint());
        TextDirectionHeuristic textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
        int breakStrategy = m6Var.getBreakStrategy();
        int hyphenationFrequency = m6Var.getHyphenationFrequency();
        if (m6Var.getTransformationMethod() instanceof PasswordTransformationMethod) {
            textDirectionHeuristic = TextDirectionHeuristics.LTR;
        } else if (i2 < 28 || (m6Var.getInputType() & 15) != 3) {
            boolean z = m6Var.getLayoutDirection() == 1;
            switch (m6Var.getTextDirection()) {
                case 2:
                    textDirectionHeuristic = TextDirectionHeuristics.ANYRTL_LTR;
                    break;
                case 3:
                    textDirectionHeuristic = TextDirectionHeuristics.LTR;
                    break;
                case 4:
                    textDirectionHeuristic = TextDirectionHeuristics.RTL;
                    break;
                case 5:
                    textDirectionHeuristic = TextDirectionHeuristics.LOCALE;
                    break;
                case 6:
                    break;
                case 7:
                    textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                    break;
                default:
                    if (z) {
                        textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                    }
                    break;
            }
        } else {
            byte directionality = Character.getDirectionality(pe.c(DecimalFormatSymbols.getInstance(m6Var.getTextLocale()))[0].codePointAt(0));
            textDirectionHeuristic = (directionality == 1 || directionality == 2) ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
        }
        return new tv(textPaint, textDirectionHeuristic, breakStrategy, hyphenationFrequency);
    }

    /* JADX WARN: Code duplicated, block: B:42:0x003e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static void j(Context context, String str) {
        synchronized (f) {
            if (str.equals("")) {
                context.deleteFile("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
                return;
            }
            try {
                FileOutputStream fileOutputStreamOpenFileOutput = context.openFileOutput("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file", 0);
                XmlSerializer xmlSerializerNewSerializer = Xml.newSerializer();
                try {
                    try {
                        xmlSerializerNewSerializer.setOutput(fileOutputStreamOpenFileOutput, null);
                        xmlSerializerNewSerializer.startDocument("UTF-8", Boolean.TRUE);
                        xmlSerializerNewSerializer.startTag(null, "locales");
                        xmlSerializerNewSerializer.attribute(null, "application_locales", str);
                        xmlSerializerNewSerializer.endTag(null, "locales");
                        xmlSerializerNewSerializer.endDocument();
                        if (fileOutputStreamOpenFileOutput != null) {
                            try {
                                fileOutputStreamOpenFileOutput.close();
                            } catch (IOException unused) {
                            }
                        }
                    } catch (Throwable th) {
                        if (fileOutputStreamOpenFileOutput != null) {
                            try {
                                fileOutputStreamOpenFileOutput.close();
                            } catch (IOException unused2) {
                            }
                        }
                        throw th;
                    }
                } catch (Exception e) {
                    Log.w("AppLocalesStorageHelper", "Storing App Locales : Failed to persist app-locales in storage ", e);
                    if (fileOutputStreamOpenFileOutput != null) {
                        fileOutputStreamOpenFileOutput.close();
                    }
                }
            } catch (FileNotFoundException unused3) {
                Log.w("AppLocalesStorageHelper", "Storing App Locales : FileNotFoundException: Cannot open file androidx.appcompat.app.AppCompatDelegate.application_locales_record_file for writing ");
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:48:0x0046 A[EXC_TOP_SPLITTER, PHI: r1
  0x0046: PHI (r1v2 java.lang.String) = (r1v0 java.lang.String), (r1v4 java.lang.String) binds: [B:29:0x0053, B:23:0x0044] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    public static String k(Context context) {
        String attributeValue;
        synchronized (f) {
            attributeValue = "";
            try {
                FileInputStream fileInputStreamOpenFileInput = context.openFileInput("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
                try {
                    try {
                        XmlPullParser xmlPullParserNewPullParser = Xml.newPullParser();
                        xmlPullParserNewPullParser.setInput(fileInputStreamOpenFileInput, "UTF-8");
                        int depth = xmlPullParserNewPullParser.getDepth();
                        while (true) {
                            int next = xmlPullParserNewPullParser.next();
                            if (next != 1 && (next != 3 || xmlPullParserNewPullParser.getDepth() > depth)) {
                                if (next != 3 && next != 4 && xmlPullParserNewPullParser.getName().equals("locales")) {
                                    attributeValue = xmlPullParserNewPullParser.getAttributeValue(null, "application_locales");
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                        if (fileInputStreamOpenFileInput != null) {
                            try {
                                fileInputStreamOpenFileInput.close();
                            } catch (IOException unused) {
                            }
                        }
                    } catch (IOException | XmlPullParserException unused2) {
                        Log.w("AppLocalesStorageHelper", "Reading app Locales : Unable to parse through file :androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
                        if (fileInputStreamOpenFileInput != null) {
                            fileInputStreamOpenFileInput.close();
                        }
                    }
                    if (attributeValue.isEmpty()) {
                        context.deleteFile("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
                    }
                } catch (Throwable th) {
                    if (fileInputStreamOpenFileInput != null) {
                        try {
                            fileInputStreamOpenFileInput.close();
                        } catch (IOException unused3) {
                        }
                    }
                    throw th;
                }
            } catch (FileNotFoundException unused4) {
                return "";
            }
        }
        return attributeValue;
    }

    public static void m(TextView textView, int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException();
        }
        if (Build.VERSION.SDK_INT >= 28) {
            pe.n(textView, i2);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i3 = textView.getIncludeFontPadding() ? fontMetricsInt.top : fontMetricsInt.ascent;
        if (i2 > Math.abs(i3)) {
            textView.setPadding(textView.getPaddingLeft(), i2 + i3, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    public static void n(TextView textView, int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException();
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i3 = textView.getIncludeFontPadding() ? fontMetricsInt.bottom : fontMetricsInt.descent;
        if (i2 > Math.abs(i3)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i2 - i3);
        }
    }

    public static void o(TextView textView, int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException();
        }
        int fontMetricsInt = textView.getPaint().getFontMetricsInt(null);
        if (i2 != fontMetricsInt) {
            textView.setLineSpacing(i2 - fontMetricsInt, 1.0f);
        }
    }

    public static final String p(yb ybVar) {
        Object rxVar;
        if (ybVar instanceof ff) {
            return ((ff) ybVar).toString();
        }
        try {
            rxVar = ybVar + '@' + g(ybVar);
        } catch (Throwable th) {
            rxVar = new rx(th);
        }
        if (sx.a(rxVar) != null) {
            rxVar = ybVar.getClass().getName() + '@' + g(ybVar);
        }
        return (String) rxVar;
    }

    public static ActionMode.Callback q(ActionMode.Callback callback) {
        return (!(callback instanceof r30) || Build.VERSION.SDK_INT < 26) ? callback : ((r30) callback).a;
    }

    public static ActionMode.Callback r(ActionMode.Callback callback, TextView textView) {
        int i2 = Build.VERSION.SDK_INT;
        return (i2 < 26 || i2 > 27 || (callback instanceof r30) || callback == null) ? callback : new r30(callback, textView);
    }

    public static long s(double d) {
        hn.B("not a normal value", z(d));
        int exponent = Math.getExponent(d);
        long jDoubleToRawLongBits = Double.doubleToRawLongBits(d) & 4503599627370495L;
        return exponent == -1023 ? jDoubleToRawLongBits + jDoubleToRawLongBits : jDoubleToRawLongBits | 4503599627370496L;
    }

    public static void t(int i2) throws InvalidAlgorithmParameterException {
        if (i2 != 16 && i2 != 32) {
            throw new InvalidAlgorithmParameterException(String.format("invalid key size %d; only 128-bit and 256-bit AES keys are supported", Integer.valueOf(i2 * 8)));
        }
    }

    public static boolean u(Context context) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 26 && ("samsung".equals(Build.MANUFACTURER) || "XT1650".equals(Build.MODEL))) {
            return false;
        }
        if (i2 >= 26 || context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) {
            return G("EGL_EXT_protected_content");
        }
        return false;
    }

    public static boolean v(String str) {
        return str == null || str.isEmpty();
    }

    public static long w(cw1 cw1Var, int i2, int i3) {
        cw1Var.E(i2);
        if (cw1Var.B() < 5) {
            return -9223372036854775807L;
        }
        int iB = cw1Var.b();
        if ((8388608 & iB) != 0 || ((iB >> 8) & 8191) != i3 || (iB & 32) == 0 || cw1Var.K() < 7 || cw1Var.B() < 7 || (cw1Var.K() & 16) != 16) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[6];
        cw1Var.H(bArr, 0, 6);
        long j2 = bArr[0];
        long j3 = bArr[1];
        long j4 = bArr[2];
        long j5 = bArr[3] & 255;
        return ((j2 & 255) << 25) | ((j3 & 255) << 17) | ((j4 & 255) << 9) | (j5 + j5) | ((((long) bArr[4]) & 255) >> 7);
    }

    public static ho2 x(byte[] bArr) throws GeneralSecurityException {
        try {
            v13 v13Var = v13.a;
            int i2 = h13.a;
            gw2 gw2VarC = gw2.C(bArr, v13.b);
            fs2 fs2Var = fs2.b;
            j03 j03VarB = ct2.b(gw2VarC.z());
            us2 us2Var = new us2(gw2VarC, 0, j03VarB);
            bt2 bt2Var = (bt2) fs2Var.a.get();
            bt2Var.getClass();
            return !bt2Var.d.containsKey(new zs2(us2.class, j03VarB)) ? new wr2(us2Var) : fs2Var.g(us2Var);
        } catch (IOException e) {
            throw new GeneralSecurityException("Failed to parse proto", e);
        }
    }

    public static void y(d03 d03Var) throws GeneralSecurityException {
        int iOrdinal = d03Var.ordinal();
        if (iOrdinal != 2 && iOrdinal != 3 && iOrdinal != 4) {
            throw new GeneralSecurityException("Unsupported hash: ".concat(String.valueOf(d03Var.name())));
        }
    }

    public static boolean z(double d) {
        return Math.getExponent(d) <= 1023;
    }

    public t3 b(Context context, Looper looper, es0 es0Var, Object obj, bm bmVar, cm cmVar) {
        return c(context, looper, es0Var, obj, (z90) bmVar, (z90) cmVar);
    }

    public t3 c(Context context, Looper looper, es0 es0Var, Object obj, z90 z90Var, z90 z90Var2) {
        throw new UnsupportedOperationException("buildClient must be implemented");
    }

    public abstract ArrayList h(String str);
}
