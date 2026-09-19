package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import androidx.work.impl.WorkDatabase;
import java.io.Closeable;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes.dex */
public abstract class dq implements qd0 {
    public static final um0 q = new um0("gads:sdk_csi_server", 4, "https://csi.gstatic.com/csi");
    public static final /* synthetic */ int v = 0;
    public static final xo2 f = new xo2("COMPLETING_ALREADY", 3);
    public static final xo2 g = new xo2("COMPLETING_WAITING_CHILDREN", 3);
    public static final xo2 h = new xo2("COMPLETING_RETRY", 3);
    public static final xo2 i = new xo2("TOO_LATE_TO_CANCEL", 3);
    public static final xo2 j = new xo2("SEALED", 3);
    public static final hh k = new hh(false);
    public static final hh l = new hh(true);
    public static final xo2 m = new xo2("NO_THREAD_ELEMENTS", 3);
    public static final ga n = new ga(6);
    public static final ga o = new ga(7);
    public static final ga p = new ga(8);
    public static final tt0 r = new tt0(28);
    public static final xn1 s = new xn1(16);
    public static final l32 t = new l32(3);
    public static final l32 u = new l32(15);

    public static String A(String str) {
        int length = str.length();
        int i2 = 0;
        while (i2 < length) {
            char cCharAt = str.charAt(i2);
            if (cCharAt >= 'a' && cCharAt <= 'z') {
                char[] charArray = str.toCharArray();
                while (i2 < length) {
                    char c = charArray[i2];
                    if (c >= 'a' && c <= 'z') {
                        charArray[i2] = (char) (c ^ ' ');
                    }
                    i2++;
                }
                return String.valueOf(charArray);
            }
            i2++;
        }
        return str;
    }

    public static void B(int i2, Object obj) {
        if (obj != null) {
            return;
        }
        j7.l(ec.j(new StringBuilder(String.valueOf(i2).length() + 9), "at index ", i2));
    }

    public static void C(Context context, boolean z) {
        if (z) {
            jn.R("This request is sent from a test device.");
            return;
        }
        f32 f32Var = ut0.f.a;
        String strC = f32.c(context);
        StringBuilder sb = new StringBuilder(String.valueOf(strC).length() + 102);
        sb.append("Use RequestConfiguration.Builder().setTestDeviceIds(Arrays.asList(\"");
        sb.append(strC);
        sb.append("\")) to get test ads on this device.");
        jn.R(sb.toString());
    }

    public static void D(Object obj) {
        if (obj != null) {
            return;
        }
        j7.l("Cannot return null from a non-@Nullable @Provides method");
    }

    /* JADX WARN: Code duplicated, block: B:52:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:65:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:69:0x0100 A[DONT_INVERT] */
    public static String[] E(String str, boolean z) {
        if (str == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        char[] charArray = str.toCharArray();
        int i2 = 0;
        boolean z2 = false;
        int i3 = 0;
        while (i2 < str.length()) {
            int iCodePointAt = Character.codePointAt(charArray, i2);
            int iCharCount = Character.charCount(iCodePointAt);
            if (Character.isLetter(iCodePointAt)) {
                Character.UnicodeBlock unicodeBlockOf = Character.UnicodeBlock.of(iCodePointAt);
                if (unicodeBlockOf.equals(Character.UnicodeBlock.BOPOMOFO) || unicodeBlockOf.equals(Character.UnicodeBlock.BOPOMOFO_EXTENDED) || unicodeBlockOf.equals(Character.UnicodeBlock.CJK_COMPATIBILITY) || unicodeBlockOf.equals(Character.UnicodeBlock.CJK_COMPATIBILITY_IDEOGRAPHS) || unicodeBlockOf.equals(Character.UnicodeBlock.CJK_COMPATIBILITY_IDEOGRAPHS_SUPPLEMENT) || unicodeBlockOf.equals(Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS) || unicodeBlockOf.equals(Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_A) || unicodeBlockOf.equals(Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_B) || unicodeBlockOf.equals(Character.UnicodeBlock.ENCLOSED_CJK_LETTERS_AND_MONTHS) || unicodeBlockOf.equals(Character.UnicodeBlock.HANGUL_JAMO) || unicodeBlockOf.equals(Character.UnicodeBlock.HANGUL_SYLLABLES) || unicodeBlockOf.equals(Character.UnicodeBlock.HIRAGANA) || unicodeBlockOf.equals(Character.UnicodeBlock.KATAKANA) || unicodeBlockOf.equals(Character.UnicodeBlock.KATAKANA_PHONETIC_EXTENSIONS) || ((iCodePointAt >= 65382 && iCodePointAt <= 65437) || (iCodePointAt >= 65441 && iCodePointAt <= 65500))) {
                    if (z2) {
                        arrayList.add(new String(charArray, i3, i2 - i3));
                    }
                    arrayList.add(new String(charArray, i2, iCharCount));
                } else {
                    if (!Character.isLetterOrDigit(iCodePointAt) || Character.getType(iCodePointAt) == 6 || Character.getType(iCodePointAt) == 8) {
                        if (true != z2) {
                            i3 = i2;
                        }
                    } else if (z && Character.charCount(iCodePointAt) == 1 && Character.toChars(iCodePointAt)[0] == '\'') {
                        if (true != z2) {
                            i3 = i2;
                        }
                    } else if (z2) {
                        arrayList.add(new String(charArray, i3, i2 - i3));
                    }
                    z2 = true;
                }
                z2 = false;
            } else {
                if (Character.isLetterOrDigit(iCodePointAt)) {
                    if (true != z2) {
                        i3 = i2;
                    }
                } else if (true != z2) {
                    i3 = i2;
                }
                z2 = true;
            }
            i2 += iCharCount;
        }
        if (z2) {
            arrayList.add(new String(charArray, i3, i2 - i3));
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public static void F(Object obj, Class cls) {
        if (obj != null) {
            return;
        }
        j7.e(String.valueOf(cls.getCanonicalName()).concat(" must be set"));
    }

    public static void G(oe0 oe0Var) {
        int iR;
        int iR2 = oe0Var.r(2);
        if (iR2 == 0) {
            oe0Var.o(6);
            return;
        }
        int iK = K(oe0Var, 5, 8, 16) + 1;
        if (iR2 == 1) {
            oe0Var.o(iK * 7);
            return;
        }
        if (iR2 == 2) {
            boolean zQ = oe0Var.q();
            int i2 = true != zQ ? 5 : 1;
            int i3 = true == zQ ? 7 : 5;
            int i4 = true == zQ ? 8 : 6;
            int i5 = 0;
            while (i5 < iK) {
                if (oe0Var.q()) {
                    oe0Var.o(7);
                    iR = 0;
                } else {
                    if (oe0Var.r(2) == 3 && oe0Var.r(i3) * i2 != 0) {
                        oe0Var.m();
                    }
                    iR = oe0Var.r(i4) * i2;
                    if (iR != 0 && iR != 180) {
                        oe0Var.m();
                    }
                    oe0Var.m();
                }
                if (iR != 0 && iR != 180 && oe0Var.q()) {
                    i5++;
                }
                i5++;
            }
        }
    }

    public static boolean H(char c) {
        return c >= 'A' && c <= 'Z';
    }

    public static void I(oe0 oe0Var) {
        oe0Var.o(3);
        oe0Var.o(8);
        boolean zQ = oe0Var.q();
        boolean zQ2 = oe0Var.q();
        if (zQ) {
            oe0Var.o(5);
        }
        if (zQ2) {
            oe0Var.o(6);
        }
    }

    public static boolean J(String str, CharSequence charSequence) {
        char c;
        int length = str.length();
        if (str == charSequence) {
            return true;
        }
        if (length == charSequence.length()) {
            for (int i2 = 0; i2 < length; i2++) {
                char cCharAt = str.charAt(i2);
                char cCharAt2 = charSequence.charAt(i2);
                if (cCharAt == cCharAt2 || ((c = (char) ((cCharAt | ' ') - 97)) < 26 && c == ((char) ((cCharAt2 | ' ') - 97)))) {
                }
            }
            return true;
        }
        return false;
    }

    public static int K(oe0 oe0Var, int i2, int i3, int i4) {
        hn.v(Math.max(Math.max(i2, i3), i4) <= 31);
        int i5 = (1 << i2) - 1;
        int i6 = (1 << i3) - 1;
        Math.addExact(Math.addExact(i5, i6), 1 << i4);
        if (oe0Var.f() >= i2) {
            int iR = oe0Var.r(i2);
            if (iR == i5) {
                if (oe0Var.f() >= i3) {
                    int iR2 = oe0Var.r(i3);
                    iR += iR2;
                    if (iR2 == i6) {
                        if (oe0Var.f() >= i4) {
                            return oe0Var.r(i4) + iR;
                        }
                    }
                }
            }
            return iR;
        }
        return -1;
    }

    public static void b(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    public static void c(Handler handler) {
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper != handler.getLooper()) {
            String name = looperMyLooper != null ? looperMyLooper.getThread().getName() : "null current looper";
            throw new IllegalStateException("Must be called on " + handler.getLooper().getThread().getName() + " thread, but got " + name + ".");
        }
    }

    public static void d(String str) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            return;
        }
        j7.e(str);
    }

    public static void e(String str) {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            return;
        }
        j7.e(str);
    }

    public static void f(Object obj) {
        if (obj != null) {
            return;
        }
        j7.l("null reference");
    }

    public static void g(Object obj, String str) {
        if (obj != null) {
            return;
        }
        j7.l(str);
    }

    public static int h(Context context, String str) {
        if (str == null) {
            j7.l("permission must be non-null");
            return 0;
        }
        if (Build.VERSION.SDK_INT >= 33 || !TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) {
            return context.checkPermission(str, Process.myPid(), Process.myUid());
        }
        return new iu(context).a.areNotificationsEnabled() ? 0 : -1;
    }

    public static final void i(Closeable closeable, Throwable th) throws IOException {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                na1.d(th, th2);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x005c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object j(zy1 zy1Var, ac acVar) {
        li liVar;
        sw swVar;
        a e;
        ki kiVar;
        if (acVar instanceof li) {
            liVar = (li) acVar;
            int i2 = liVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                liVar.l = i2 - Integer.MIN_VALUE;
            } else {
                liVar = new li(acVar);
            }
        } else {
            liVar = new li(acVar);
        }
        Object obj = liVar.k;
        int i3 = liVar.l;
        if (i3 == 0) {
            ar.n(obj);
            sw swVar2 = new sw();
            ki kiVar2 = new ki(0, swVar2);
            try {
                liVar.i = swVar2;
                liVar.j = kiVar2;
                liVar.l = 1;
                Object objH = zy1Var.h(kiVar2, liVar);
                Object obj2 = rc.f;
                if (objH == obj2) {
                    return obj2;
                }
                swVar = swVar2;
            } catch (a e2) {
                swVar = swVar2;
                e = e2;
                kiVar = kiVar2;
                if (e.f != kiVar) {
                    throw e;
                }
            }
        } else {
            if (i3 != 1) {
                j7.e("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kiVar = liVar.j;
            swVar = liVar.i;
            try {
                ar.n(obj);
            } catch (a e3) {
                e = e3;
                if (e.f != kiVar) {
                    throw e;
                }
            }
        }
        return swVar.f;
    }

    public static Cursor m(WorkDatabase workDatabase, yx yxVar) {
        workDatabase.a();
        if (((SQLiteDatabase) workDatabase.b.i().g).inTransaction()) {
            return workDatabase.b.i().d(yxVar);
        }
        throw null;
    }

    public static void n(c4 c4Var, String[] strArr, int i2) {
        HashSet hashSet = new HashSet();
        for (int i3 = 0; i3 < strArr.length; i3++) {
            if (TextUtils.isEmpty(strArr[i3])) {
                j7.p(ec.m(new StringBuilder("Permission request for permissions "), Arrays.toString(strArr), " must not contain null or empty values"));
                return;
            }
            if (Build.VERSION.SDK_INT < 33 && TextUtils.equals(strArr[i3], "android.permission.POST_NOTIFICATIONS")) {
                hashSet.add(Integer.valueOf(i3));
            }
        }
        int size = hashSet.size();
        String[] strArr2 = size > 0 ? new String[strArr.length - size] : strArr;
        if (size > 0) {
            if (size == strArr.length) {
                return;
            }
            int i4 = 0;
            for (int i5 = 0; i5 < strArr.length; i5++) {
                if (!hashSet.contains(Integer.valueOf(i5))) {
                    strArr2[i4] = strArr[i5];
                    i4++;
                }
            }
        }
        c4Var.requestPermissions(strArr, i2);
    }

    public static final void o(ic icVar, Object obj) {
        if (obj == m) {
            return;
        }
        if (!(obj instanceof w30)) {
            icVar.b(null, o).getClass();
            j7.j();
            return;
        }
        cc[] ccVarArr = ((w30) obj).b;
        int length = ccVarArr.length - 1;
        if (length < 0) {
            return;
        }
        cc ccVar = ccVarArr[length];
        throw null;
    }

    public static final Object p(ic icVar) {
        Object objB = icVar.b(0, n);
        objB.getClass();
        return objB;
    }

    public static Map q(ArrayList arrayList) {
        int size = arrayList.size();
        if (size == 0) {
            return mh.f;
        }
        int i2 = 0;
        if (size == 1) {
            lv lvVar = (lv) arrayList.get(0);
            lvVar.getClass();
            Map mapSingletonMap = Collections.singletonMap(lvVar.f, lvVar.g);
            mapSingletonMap.getClass();
            return mapSingletonMap;
        }
        int size2 = arrayList.size();
        if (size2 >= 0) {
            if (size2 < 3) {
                size2++;
            } else {
                size2 = size2 < 1073741824 ? (int) ((size2 / 0.75f) + 1.0f) : Integer.MAX_VALUE;
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(size2);
        int size3 = arrayList.size();
        while (i2 < size3) {
            Object obj = arrayList.get(i2);
            i2++;
            lv lvVar2 = (lv) obj;
            linkedHashMap.put(lvVar2.f, lvVar2.g);
        }
        return linkedHashMap;
    }

    public static final Object r(Object obj) {
        wm wmVar;
        xm xmVar = obj instanceof xm ? (xm) obj : null;
        return (xmVar == null || (wmVar = xmVar.a) == null) ? obj : wmVar;
    }

    public static final Object s(ic icVar, Object obj) {
        if (obj == null) {
            obj = p(icVar);
        }
        if (obj == 0) {
            return m;
        }
        if (obj instanceof Integer) {
            return icVar.b(new w30(((Number) obj).intValue(), icVar), p);
        }
        j7.j();
        return null;
    }

    public static int t(String str) {
        byte[] bytes;
        int length;
        int i2;
        int i3;
        int i4;
        try {
            bytes = str.getBytes("UTF-8");
            while (true) {
                i4 = length & (-4);
                if (i2 >= i4) {
                    break;
                }
                int i5 = ((bytes[i2] & 255) | ((bytes[i2 + 1] & 255) << 8) | ((bytes[i2 + 2] & 255) << 16) | (bytes[i2 + 3] << 24)) * (-862048943);
                int i6 = i3 ^ (((i5 >>> 17) | (i5 << 15)) * 461845907);
                i3 = (((i6 >>> 19) | (i6 << 13)) * 5) - 430675100;
                i2 += 4;
            }
        } catch (UnsupportedEncodingException unused) {
            bytes = str.getBytes();
        }
        length = bytes.length;
        int i7 = 0;
        i2 = 0;
        i3 = 0;
        int i8 = length & 3;
        if (i8 == 1) {
            int i9 = ((bytes[i4] & 255) | i7) * (-862048943);
            i3 ^= ((i9 >>> 17) | (i9 << 15)) * 461845907;
        } else {
            if (i8 != 2) {
                i7 = i8 == 3 ? (bytes[i4 + 2] & 255) << 16 : 0;
            }
            i7 |= (bytes[i4 + 1] & 255) << 8;
            int i10 = ((bytes[i4] & 255) | i7) * (-862048943);
            i3 ^= ((i10 >>> 17) | (i10 << 15)) * 461845907;
        }
        int i11 = i3 ^ length;
        int i12 = (i11 ^ (i11 >>> 16)) * (-2048144789);
        int i13 = (i12 ^ (i12 >>> 13)) * (-1028477387);
        return i13 ^ (i13 >>> 16);
    }

    public static Object u(Future future) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    public static String v(String str) {
        int length = str.length();
        int i2 = 0;
        while (i2 < length) {
            if (H(str.charAt(i2))) {
                char[] charArray = str.toCharArray();
                while (i2 < length) {
                    char c = charArray[i2];
                    if (H(c)) {
                        charArray[i2] = (char) (c ^ ' ');
                    }
                    i2++;
                }
                return String.valueOf(charArray);
            }
            i2++;
        }
        return str;
    }

    public static void w(int i2, Throwable th, String str) {
        StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 20);
        sb.append("Ad failed to load : ");
        sb.append(i2);
        jn.R(sb.toString());
        jn.w(str, th);
        if (i2 == 3) {
            return;
        }
        vc3.C.h.e(str, th);
    }

    public static void x(SpannableStringBuilder spannableStringBuilder, Object obj, int i2, int i3) {
        for (Object obj2 : spannableStringBuilder.getSpans(i2, i3, obj.getClass())) {
            if (spannableStringBuilder.getSpanStart(obj2) == i2 && spannableStringBuilder.getSpanEnd(obj2) == i3 && spannableStringBuilder.getSpanFlags(obj2) == 33) {
                spannableStringBuilder.removeSpan(obj2);
            }
        }
        spannableStringBuilder.setSpan(obj, i2, i3, 33);
    }

    public static void y(Object[] objArr, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            B(i3, objArr[i3]);
        }
    }

    public static byte[] z(String str) {
        if (str.length() % 2 != 0) {
            j7.p("Expected a string of even length");
            return null;
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = i2 + i2;
            int iDigit = Character.digit(str.charAt(i3), 16);
            int iDigit2 = Character.digit(str.charAt(i3 + 1), 16);
            if (iDigit == -1 || iDigit2 == -1) {
                j7.p("input is not hexadecimal");
                return null;
            }
            bArr[i2] = (byte) ((iDigit * 16) + iDigit2);
        }
        return bArr;
    }

    public abstract ej1 k(String str);
}
