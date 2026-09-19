package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.Provider;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.ServiceConfigurationError;
import java.util.Set;
import java.util.SortedSet;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.Mac;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public abstract class a23 implements b70, qd0, au2 {
    public static final um0 A;
    public static final um0 B;
    public static final /* synthetic */ int G = 0;
    public static final /* synthetic */ int H = 0;
    public static String I;
    public static final um0 h;
    public static final um0 i;
    public static final um0 j;
    public static final um0 k;
    public static final um0 l;
    public static final um0 m;
    public static final um0 n;
    public static final um0 o;
    public static final um0 p;
    public static final um0 q;
    public static final um0 r;
    public static final um0 s;
    public static final um0 t;
    public static final um0 u;
    public static final um0 v;
    public static final um0 w;
    public static final um0 x;
    public static final um0 y;
    public static final um0 z;
    public static final Object f = new Object();
    public static final ig g = new ig(24);
    public static final tt0 C = new tt0(29);
    public static final xn1 D = new xn1(17);
    public static final l32 E = new l32(4);
    public static final l32 F = new l32(16);

    static {
        int i2 = 4;
        String str = "";
        h = new um0("gads:afs:csa:experiment_id", i2, str);
        i = new um0("gads:app_index:experiment_id", i2, str);
        j = new um0("gads:block_autoclicks_experiment_id", i2, str);
        k = new um0("gads:sdk_core_experiment_id", i2, str);
        l = new um0("gads:spam_app_context:experiment_id", i2, str);
        m = new um0("gads:temporary_experiment_id:1", i2, str);
        n = new um0("gads:temporary_experiment_id:10", i2, str);
        o = new um0("gads:temporary_experiment_id:11", i2, str);
        p = new um0("gads:temporary_experiment_id:12", i2, str);
        q = new um0("gads:temporary_experiment_id:13", i2, str);
        r = new um0("gads:temporary_experiment_id:14", i2, str);
        s = new um0("gads:temporary_experiment_id:15", i2, str);
        t = new um0("gads:temporary_experiment_id:2", i2, str);
        u = new um0("gads:temporary_experiment_id:3", i2, str);
        v = new um0("gads:temporary_experiment_id:4", i2, str);
        w = new um0("gads:temporary_experiment_id:5", i2, str);
        x = new um0("gads:temporary_experiment_id:6", i2, str);
        y = new um0("gads:temporary_experiment_id:7", i2, str);
        z = new um0("gads:temporary_experiment_id:8", i2, str);
        A = new um0("gads:temporary_experiment_id:9", i2, str);
        B = new um0("gads:corewebview:experiment_id", i2, str);
    }

    public static int A(Set set) {
        Iterator it = set.iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            Object next = it.next();
            iHashCode += next != null ? next.hashCode() : 0;
        }
        return iHashCode;
    }

    public static String B(String[] strArr, int i2, int i3) {
        int i4 = i3 + i2;
        if (strArr.length < i4) {
            jn.M("Unable to construct shingle");
            return "";
        }
        StringBuilder sb = new StringBuilder();
        while (true) {
            int i5 = i4 - 1;
            if (i2 >= i5) {
                sb.append(strArr[i5]);
                return sb.toString();
            }
            sb.append(strArr[i2]);
            sb.append(' ');
            i2++;
        }
    }

    public static fu1 C(int i2, fu1 fu1Var) {
        if (i2 == 0) {
            throw null;
        }
        if (i2 == 8) {
            if (((Integer) tu0.e.c.a(lx0.U8)).intValue() > 0) {
                return fu1Var;
            }
            i2 = 8;
        }
        return E(i2, null, fu1Var);
    }

    public static long D(int i2, long j2) {
        if (i2 == 1) {
            return j2;
        }
        int i3 = i2 >> 1;
        long j3 = (j2 * j2) % 1073807359;
        return (i2 & 1) == 0 ? D(i3, j3) % 1073807359 : ((D(i3, j3) % 1073807359) * j2) % 1073807359;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:55:0x00a5  */
    public static fu1 E(int i2, String str, fu1 fu1Var) {
        String str2;
        int i3 = i2 - 1;
        if (str == null) {
            if (i2 == 0) {
                throw null;
            }
            str = "No fill.";
            switch (i3) {
                case 1:
                    str = "Invalid request.";
                    break;
                case 2:
                    break;
                case 3:
                    str = "App ID missing.";
                    break;
                case 4:
                    str = "Network error.";
                    break;
                case 5:
                    str = "Invalid request: Invalid ad unit ID.";
                    break;
                case 6:
                    str = "Invalid request: Invalid ad size.";
                    break;
                case 7:
                    str = "A mediation adapter failed to show the ad.";
                    break;
                case 8:
                    str = "The ad is not ready.";
                    break;
                case 9:
                    str = "The ad has already been shown.";
                    break;
                case 10:
                    str = "The ad can not be shown when app is not in foreground.";
                    break;
                case 11:
                default:
                    str = "Internal error.";
                    break;
                case 12:
                    if (((Integer) tu0.e.c.a(lx0.X8)).intValue() <= 0) {
                        str = "The mediation adapter did not return an ad.";
                    }
                    break;
                case 13:
                    str = "Mismatch request IDs.";
                    break;
                case 14:
                    str = "Invalid ad string.";
                    break;
                case 15:
                    str = "Ad inspector had an internal error.";
                    break;
                case 16:
                    str = "Ad inspector failed to load.";
                    break;
                case 17:
                    str = "Ad inspector cannot be opened because the device is not in test mode. See https://developers.google.com/admob/android/test-ads#enable_test_devices for more information.";
                    break;
                case 18:
                    str = "Ad inspector cannot be opened because it is already open.";
                    break;
            }
        }
        String str3 = str;
        if (i2 == 0) {
            throw null;
        }
        int i4 = 0;
        int i5 = 2;
        switch (i3) {
            case 0:
            case 11:
            case 15:
                i5 = i4;
                return new fu1(i5, str3, "com.google.android.gms.ads", fu1Var, null);
            case 1:
            case 5:
            case 6:
            case 9:
            case 16:
                i5 = 1;
                return new fu1(i5, str3, "com.google.android.gms.ads", fu1Var, null);
            case 2:
            case 10:
            case 18:
                i5 = 3;
                return new fu1(i5, str3, "com.google.android.gms.ads", fu1Var, null);
            case 3:
                i4 = 8;
                i5 = i4;
                return new fu1(i5, str3, "com.google.android.gms.ads", fu1Var, null);
            case 4:
            case 8:
            case 17:
                return new fu1(i5, str3, "com.google.android.gms.ads", fu1Var, null);
            case 7:
                i4 = 4;
                i5 = i4;
                return new fu1(i5, str3, "com.google.android.gms.ads", fu1Var, null);
            case 12:
                if (((Integer) tu0.e.c.a(lx0.X8)).intValue() <= 0) {
                    i4 = 9;
                    i5 = i4;
                } else {
                    i5 = 3;
                }
                return new fu1(i5, str3, "com.google.android.gms.ads", fu1Var, null);
            case 13:
                i4 = 10;
                i5 = i4;
                return new fu1(i5, str3, "com.google.android.gms.ads", fu1Var, null);
            case 14:
                i4 = 11;
                i5 = i4;
                return new fu1(i5, str3, "com.google.android.gms.ads", fu1Var, null);
            default:
                switch (i2) {
                    case 1:
                        str2 = "INTERNAL_ERROR";
                        break;
                    case 2:
                        str2 = "INVALID_REQUEST";
                        break;
                    case 3:
                        str2 = "NO_FILL";
                        break;
                    case 4:
                        str2 = "APP_ID_MISSING";
                        break;
                    case 5:
                        str2 = "NETWORK_ERROR";
                        break;
                    case 6:
                        str2 = "INVALID_AD_UNIT_ID";
                        break;
                    case 7:
                        str2 = "INVALID_AD_SIZE";
                        break;
                    case 8:
                        str2 = "MEDIATION_SHOW_ERROR";
                        break;
                    case 9:
                        str2 = "NOT_READY";
                        break;
                    case 10:
                        str2 = "AD_REUSED";
                        break;
                    case 11:
                        str2 = "APP_NOT_FOREGROUND";
                        break;
                    case 12:
                        str2 = "INTERNAL_SHOW_ERROR";
                        break;
                    case 13:
                        str2 = "MEDIATION_NO_FILL";
                        break;
                    case 14:
                        str2 = "REQUEST_ID_MISMATCH";
                        break;
                    case 15:
                        str2 = "INVALID_AD_STRING";
                        break;
                    case 16:
                        str2 = "AD_INSPECTOR_INTERNAL_ERROR";
                        break;
                    case 17:
                        str2 = "AD_INSPECTOR_FAILED_TO_LOAD";
                        break;
                    case 18:
                        str2 = "AD_INSPECTOR_NOT_IN_TEST_MODE";
                        break;
                    default:
                        str2 = "AD_INSPECTOR_ALREADY_OPEN";
                        break;
                }
                throw new AssertionError("Unknown SdkError: ".concat(str2));
        }
    }

    public static boolean F(Set set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set2 = (Set) obj;
        try {
            return set.size() == set2.size() && set.containsAll(set2);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    public static long G(String[] strArr, int i2) {
        long jT = (((long) dq.t(strArr[0])) + 2147483647L) % 1073807359;
        for (int i3 = 1; i3 < i2; i3++) {
            jT = (((((long) dq.t(strArr[i3])) + 2147483647L) % 1073807359) + ((jT * 16785407) % 1073807359)) % 1073807359;
        }
        return jT;
    }

    public static boolean H(bl2 bl2Var, Collection collection) {
        collection.getClass();
        boolean zRemove = false;
        if (!(collection instanceof Set) || collection.size() <= bl2Var.size()) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                zRemove |= bl2Var.remove(it.next());
            }
            return zRemove;
        }
        Iterator<E> it2 = bl2Var.iterator();
        while (it2.hasNext()) {
            if (collection.contains(it2.next())) {
                it2.remove();
                zRemove = true;
            }
        }
        return zRemove;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0069  */
    /* JADX WARN: Code duplicated, block: B:37:0x008f  */
    /* JADX WARN: Code duplicated, block: B:39:0x0092  */
    /* JADX WARN: Code duplicated, block: B:43:0x0091 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:45:? A[LOOP:0: B:25:0x0063->B:45:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x0080 -> B:25:0x0063). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x0083 -> B:25:0x0063). Please report as a decompilation issue!!! */
    public static final Object e(List list, b10 b10Var, ac acVar) throws Throwable {
        td tdVar;
        List list2;
        sw swVar;
        Iterator it;
        Throwable th;
        cl clVar;
        if (acVar instanceof td) {
            tdVar = (td) acVar;
            int i2 = tdVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                tdVar.l = i2 - Integer.MIN_VALUE;
            } else {
                tdVar = new td(acVar);
            }
        } else {
            tdVar = new td(acVar);
        }
        Object obj = tdVar.k;
        int i3 = tdVar.l;
        Object obj2 = rc.f;
        if (i3 != 0) {
            if (i3 == 1) {
                list2 = (List) tdVar.i;
                ar.n(obj);
            } else {
                if (i3 != 2) {
                    j7.e("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                it = tdVar.j;
                swVar = (sw) tdVar.i;
                try {
                    ar.n(obj);
                } catch (Throwable th2) {
                    Object obj3 = swVar.f;
                    if (obj3 == null) {
                        swVar.f = th2;
                    } else {
                        na1.d((Throwable) obj3, th2);
                    }
                }
            }
            while (it.hasNext()) {
                clVar = (cl) it.next();
                tdVar.i = swVar;
                tdVar.j = it;
                tdVar.l = 2;
                if (clVar.h(tdVar) == obj2) {
                    return obj2;
                }
            }
            th = (Throwable) swVar.f;
            if (th == null) {
                return k50.a;
            }
            throw th;
        }
        ar.n(obj);
        ArrayList arrayList = new ArrayList();
        vd vdVar = new vd(list, arrayList, null);
        tdVar.i = arrayList;
        tdVar.l = 1;
        if (b10Var.a(vdVar, tdVar) == obj2) {
            return obj2;
        }
        list2 = arrayList;
        swVar = new sw();
        it = list2.iterator();
        while (it.hasNext()) {
            clVar = (cl) it.next();
            tdVar.i = swVar;
            tdVar.j = it;
            tdVar.l = 2;
            if (clVar.h(tdVar) == obj2) {
                return obj2;
            }
        }
        th = (Throwable) swVar.f;
        if (th == null) {
            return k50.a;
        }
        throw th;
    }

    public static void f(Object obj, String str) {
        if (obj != null) {
            return;
        }
        j7.l(str);
    }

    public static List g(Object obj) {
        List listSingletonList = Collections.singletonList(obj);
        listSingletonList.getClass();
        return listSingletonList;
    }

    /* JADX WARN: Code duplicated, block: B:155:0x0118 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:195:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:0x011c A[Catch: all -> 0x0156, TryCatch #2 {all -> 0x0156, blocks: (B:66:0x0118, B:68:0x011c, B:70:0x0120, B:72:0x0129, B:74:0x012f, B:77:0x0135, B:82:0x0143, B:80:0x013c, B:83:0x014b, B:84:0x014f), top: B:155:0x0118, inners: #5 }] */
    /* JADX WARN: Code duplicated, block: B:70:0x0120 A[Catch: all -> 0x0156, TryCatch #2 {all -> 0x0156, blocks: (B:66:0x0118, B:68:0x011c, B:70:0x0120, B:72:0x0129, B:74:0x012f, B:77:0x0135, B:82:0x0143, B:80:0x013c, B:83:0x014b, B:84:0x014f), top: B:155:0x0118, inners: #5 }] */
    /* JADX WARN: Code duplicated, block: B:83:0x014b A[Catch: all -> 0x0156, TryCatch #2 {all -> 0x0156, blocks: (B:66:0x0118, B:68:0x011c, B:70:0x0120, B:72:0x0129, B:74:0x012f, B:77:0x0135, B:82:0x0143, B:80:0x013c, B:83:0x014b, B:84:0x014f), top: B:155:0x0118, inners: #5 }] */
    /* JADX WARN: Code duplicated, block: B:84:0x014f A[Catch: all -> 0x0156, TRY_LEAVE, TryCatch #2 {all -> 0x0156, blocks: (B:66:0x0118, B:68:0x011c, B:70:0x0120, B:72:0x0129, B:74:0x012f, B:77:0x0135, B:82:0x0143, B:80:0x013c, B:83:0x014b, B:84:0x014f), top: B:155:0x0118, inners: #5 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v22, types: [android.content.res.TypedArray] */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v24 */
    /* JADX WARN: Type inference failed for: r4v26 */
    /* JADX WARN: Type inference failed for: r4v27, types: [android.content.res.TypedArray] */
    /* JADX WARN: Type inference failed for: r4v29 */
    /* JADX WARN: Type inference failed for: r4v30 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v13 */
    public static zi h(XmlResourceParser xmlResourceParser, Resources resources) throws Exception {
        int next;
        int i2;
        int i3;
        ?? r4;
        long j2;
        Throwable th;
        ?? r5;
        ExecutorService executorService;
        boolean zIsTerminated;
        boolean zIsTerminated2;
        TimeUnit timeUnit = TimeUnit.DAYS;
        do {
            next = xmlResourceParser.next();
            i2 = 2;
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        xmlResourceParser.require(2, null, "font-family");
        if (!xmlResourceParser.getName().equals("font-family")) {
            o(xmlResourceParser);
            return null;
        }
        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), gw.b);
        int i4 = 0;
        String string = typedArrayObtainAttributes.getString(0);
        String string2 = typedArrayObtainAttributes.getString(5);
        String string3 = typedArrayObtainAttributes.getString(6);
        String string4 = typedArrayObtainAttributes.getString(2);
        int resourceId = typedArrayObtainAttributes.getResourceId(1, 0);
        int i5 = 3;
        int integer = typedArrayObtainAttributes.getInteger(3, 1);
        int integer2 = typedArrayObtainAttributes.getInteger(4, 500);
        String string5 = typedArrayObtainAttributes.getString(7);
        typedArrayObtainAttributes.recycle();
        if (string == null || string2 == null) {
            ArrayList arrayList = new ArrayList();
            while (xmlResourceParser.next() != 3) {
                if (xmlResourceParser.getEventType() == 2) {
                    if (xmlResourceParser.getName().equals("font")) {
                        TypedArray typedArrayObtainAttributes2 = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), gw.c);
                        int i6 = typedArrayObtainAttributes2.getInt(typedArrayObtainAttributes2.hasValue(8) ? 8 : 1, 400);
                        boolean z2 = 1 == typedArrayObtainAttributes2.getInt(typedArrayObtainAttributes2.hasValue(6) ? 6 : 2, 0);
                        int i7 = typedArrayObtainAttributes2.hasValue(9) ? 9 : 3;
                        String string6 = typedArrayObtainAttributes2.getString(typedArrayObtainAttributes2.hasValue(7) ? 7 : 4);
                        int i8 = typedArrayObtainAttributes2.getInt(i7, 0);
                        int i9 = typedArrayObtainAttributes2.hasValue(5) ? 5 : 0;
                        int resourceId2 = typedArrayObtainAttributes2.getResourceId(i9, 0);
                        String string7 = typedArrayObtainAttributes2.getString(i9);
                        typedArrayObtainAttributes2.recycle();
                        while (xmlResourceParser.next() != 3) {
                            o(xmlResourceParser);
                        }
                        arrayList.add(new bj(string7, i6, z2, string6, i8, resourceId2));
                    } else {
                        o(xmlResourceParser);
                    }
                }
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            return new aj((bj[]) arrayList.toArray(new bj[0]));
        }
        List listK = k(resources, resourceId);
        ArrayList arrayList2 = new ArrayList();
        while (xmlResourceParser.next() != i5) {
            if (xmlResourceParser.getEventType() == i2) {
                if (xmlResourceParser.getName().equals("fallback")) {
                    TypedArray typedArrayObtainAttributes3 = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), gw.d);
                    int i10 = integer;
                    try {
                        String string8 = typedArrayObtainAttributes3.getString(i4);
                        String string9 = typedArrayObtainAttributes3.getString(1);
                        String string10 = typedArrayObtainAttributes3.getString(i2);
                        if (string8 == null) {
                            r4 = typedArrayObtainAttributes3;
                            j2 = 1;
                            throw new XmlPullParserException("query attribute must be set in fallback element");
                        }
                        while (xmlResourceParser.next() != 3) {
                            try {
                                o(xmlResourceParser);
                            } catch (Throwable th2) {
                                th = th2;
                                r5 = typedArrayObtainAttributes3;
                                j2 = 1;
                            }
                        }
                        try {
                            r4 = typedArrayObtainAttributes3;
                            i3 = i10;
                            j2 = 1;
                            try {
                                si siVar = new si(string, string2, string8, listK, string9, string10);
                                if (r4 instanceof AutoCloseable) {
                                    ((AutoCloseable) r4).close();
                                } else if (r4 instanceof ExecutorService) {
                                    ExecutorService executorService2 = (ExecutorService) r4;
                                    if (executorService2 != ForkJoinPool.commonPool() && !(zIsTerminated2 = executorService2.isTerminated())) {
                                        executorService2.shutdown();
                                        boolean z3 = false;
                                        while (!zIsTerminated2) {
                                            try {
                                                zIsTerminated2 = executorService2.awaitTermination(1L, timeUnit);
                                            } catch (InterruptedException unused) {
                                                if (!z3) {
                                                    executorService2.shutdownNow();
                                                    z3 = true;
                                                }
                                            }
                                        }
                                        if (z3) {
                                            Thread.currentThread().interrupt();
                                        }
                                    }
                                } else {
                                    r4.recycle();
                                }
                                arrayList2.add(siVar);
                            } catch (Throwable th3) {
                                th = th3;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            r4 = typedArrayObtainAttributes3;
                            j2 = 1;
                            th = th;
                            r5 = r4;
                            if (r5 != 0) {
                                throw th;
                            }
                            try {
                                if (!(r5 instanceof AutoCloseable)) {
                                    ((AutoCloseable) r5).close();
                                    throw th;
                                }
                                if (r5 instanceof ExecutorService) {
                                    r5.recycle();
                                    throw th;
                                }
                                executorService = (ExecutorService) r5;
                                if (executorService != ForkJoinPool.commonPool()) {
                                    throw th;
                                }
                                throw th;
                            } catch (Throwable th5) {
                                th.addSuppressed(th5);
                                throw th;
                            }
                        }
                        th = th3;
                    } catch (Throwable th6) {
                        th = th6;
                        r4 = typedArrayObtainAttributes3;
                    }
                    th = th;
                    r5 = r4;
                    if (r5 != 0) {
                        throw th;
                    }
                    if (!(r5 instanceof AutoCloseable)) {
                        ((AutoCloseable) r5).close();
                        throw th;
                    }
                    if (r5 instanceof ExecutorService) {
                        r5.recycle();
                        throw th;
                    }
                    executorService = (ExecutorService) r5;
                    if (executorService != ForkJoinPool.commonPool() || (zIsTerminated = executorService.isTerminated())) {
                        throw th;
                    }
                    executorService.shutdown();
                    boolean z4 = false;
                    while (!zIsTerminated) {
                        try {
                            zIsTerminated = executorService.awaitTermination(j2, timeUnit);
                        } catch (InterruptedException unused2) {
                            if (!z4) {
                                executorService.shutdownNow();
                                z4 = true;
                            }
                        }
                    }
                    if (!z4) {
                        throw th;
                    }
                    Thread.currentThread().interrupt();
                    throw th;
                }
                i3 = integer;
                o(xmlResourceParser);
                integer = i3;
                integer2 = integer2;
                string5 = string5;
                i2 = 2;
                i4 = 0;
                i5 = 3;
            }
        }
        int i11 = integer2;
        String str = string5;
        int i12 = integer;
        if (!arrayList2.isEmpty()) {
            return new cj(arrayList2, i12, i11, str);
        }
        if (string3 == null) {
            j7.p("The provider font XML requires query attribute or fallback children.");
            return null;
        }
        arrayList2.add(new si(string, string2, string3, listK, null, null));
        if (string4 != null) {
            arrayList2.add(new si(string, string2, string4, listK, null, null));
        }
        return new cj(arrayList2, i12, i11, str);
    }

    public static List k(Resources resources, int i2) {
        if (i2 == 0) {
            return Collections.EMPTY_LIST;
        }
        TypedArray typedArrayObtainTypedArray = resources.obtainTypedArray(i2);
        try {
            if (typedArrayObtainTypedArray.length() == 0) {
                return Collections.EMPTY_LIST;
            }
            ArrayList arrayList = new ArrayList();
            if (typedArrayObtainTypedArray.getType(0) == 1) {
                for (int i3 = 0; i3 < typedArrayObtainTypedArray.length(); i3++) {
                    int resourceId = typedArrayObtainTypedArray.getResourceId(i3, 0);
                    if (resourceId != 0) {
                        String[] stringArray = resources.getStringArray(resourceId);
                        ArrayList arrayList2 = new ArrayList();
                        for (String str : stringArray) {
                            arrayList2.add(Base64.decode(str, 0));
                        }
                        arrayList.add(arrayList2);
                    }
                }
            } else {
                String[] stringArray2 = resources.getStringArray(i2);
                ArrayList arrayList3 = new ArrayList();
                for (String str2 : stringArray2) {
                    arrayList3.add(Base64.decode(str2, 0));
                }
                arrayList.add(arrayList3);
            }
            return arrayList;
        } finally {
            typedArrayObtainTypedArray.recycle();
        }
    }

    public static TypedValue m(Context context, int i2) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i2, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    public static boolean n(Context context, int i2, boolean z2) {
        TypedValue typedValueM = m(context, i2);
        if (typedValueM == null || typedValueM.type != 18) {
            return z2;
        }
        return typedValueM.data != 0;
    }

    public static void o(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        int i2 = 1;
        while (i2 > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i2++;
            } else if (next == 3) {
                i2--;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x006c A[PHI: r15
  0x006c: PHI (r15v3 long) = (r15v2 long), (r15v4 long) binds: [B:30:0x005f, B:34:0x0069] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:39:0x007a A[LOOP:0: B:25:0x004c->B:39:0x007a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:58:0x0078 A[SYNTHETIC] */
    public static final long p(String str, long j2, long j3, long j4) {
        String property;
        Long lValueOf;
        boolean z2;
        long j5;
        int i2;
        int i3;
        long j6;
        int i4 = a30.a;
        try {
            property = System.getProperty(str);
        } catch (SecurityException unused) {
            property = null;
        }
        if (property == null) {
            return j2;
        }
        int length = property.length();
        if (length != 0) {
            int i5 = 0;
            char cCharAt = property.charAt(0);
            long j7 = -9223372036854775807L;
            if (cCharAt < '0') {
                z2 = true;
                if (length != 1) {
                    if (cCharAt == '+') {
                        z2 = false;
                        i5 = 1;
                    } else if (cCharAt == '-') {
                        j7 = Long.MIN_VALUE;
                        i5 = 1;
                    }
                }
                lValueOf = null;
                break;
            }
            z2 = false;
            long j8 = 0;
            long j9 = -256204778801521550L;
            while (true) {
                if (i5 >= length) {
                    if (!z2) {
                        lValueOf = Long.valueOf(-j8);
                        break;
                    }
                    lValueOf = Long.valueOf(j8);
                    break;
                }
                int iDigit = Character.digit((int) property.charAt(i5), 10);
                if (iDigit >= 0) {
                    if (j8 >= j9) {
                        j5 = j8 * 10;
                        i2 = length;
                        i3 = i5;
                        j6 = iDigit;
                        if (j5 < j7 + j6) {
                            j8 = j5 - j6;
                            i5 = i3 + 1;
                            length = i2;
                        }
                    } else if (j9 == -256204778801521550L) {
                        j9 = j7 / 10;
                        if (j8 >= j9) {
                            j5 = j8 * 10;
                            i2 = length;
                            i3 = i5;
                            j6 = iDigit;
                            if (j5 < j7 + j6) {
                                j8 = j5 - j6;
                                i5 = i3 + 1;
                                length = i2;
                            }
                        }
                    }
                }
                lValueOf = null;
                break;
            }
        }
        lValueOf = null;
        break;
        if (lValueOf == null) {
            throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + property + '\'').toString());
        }
        long jLongValue = lValueOf.longValue();
        if (j3 <= jLongValue && jLongValue <= j4) {
            return jLongValue;
        }
        StringBuilder sb = new StringBuilder("System property '");
        sb.append(str);
        sb.append("' should be in range ");
        sb.append(j3);
        ec.w(sb, "..", j4, ", but is '");
        sb.append(jLongValue);
        sb.append('\'');
        throw new IllegalStateException(sb.toString().toString());
    }

    public static int q(String str, int i2, int i3) {
        return (int) p(str, i2, 1L, (i3 & 8) != 0 ? Integer.MAX_VALUE : 2097150);
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:44:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:46:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:47:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:49:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:50:0x00db  */
    /* JADX WARN: Code duplicated, block: B:52:0x00e3  */
    public static String r(Context context) {
        String str = I;
        if (str != null) {
            return str;
        }
        PackageManager packageManager = context.getPackageManager();
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.example.com"));
        ResolveInfo resolveInfoResolveActivity = packageManager.resolveActivity(intent, 0);
        String str2 = resolveInfoResolveActivity != null ? resolveInfoResolveActivity.activityInfo.packageName : null;
        List<ResolveInfo> listQueryIntentActivities = packageManager.queryIntentActivities(intent, 0);
        ArrayList arrayList = new ArrayList();
        for (ResolveInfo resolveInfo : listQueryIntentActivities) {
            Intent intent2 = new Intent();
            intent2.setAction("android.support.customtabs.action.CustomTabsService");
            intent2.setPackage(resolveInfo.activityInfo.packageName);
            if (packageManager.resolveService(intent2, 0) != null) {
                arrayList.add(resolveInfo.activityInfo.packageName);
            }
        }
        if (arrayList.isEmpty()) {
            I = null;
        } else if (arrayList.size() == 1) {
            I = (String) arrayList.get(0);
        } else if (!TextUtils.isEmpty(str2)) {
            try {
                List<ResolveInfo> listQueryIntentActivities2 = context.getPackageManager().queryIntentActivities(intent, 64);
                if (listQueryIntentActivities2 != null && listQueryIntentActivities2.size() != 0) {
                    Iterator<ResolveInfo> it = listQueryIntentActivities2.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            ResolveInfo next = it.next();
                            IntentFilter intentFilter = next.filter;
                            if (intentFilter == null || intentFilter.countDataAuthorities() == 0 || intentFilter.countDataPaths() == 0 || next.activityInfo == null) {
                            }
                        } else if (arrayList.contains(str2)) {
                            I = str2;
                        }
                        if (arrayList.contains("com.android.chrome")) {
                            I = "com.android.chrome";
                        } else if (arrayList.contains("com.chrome.beta")) {
                            I = "com.chrome.beta";
                        } else if (arrayList.contains("com.chrome.dev")) {
                            I = "com.chrome.dev";
                        }
                    }
                } else if (arrayList.contains(str2)) {
                    I = str2;
                } else if (arrayList.contains("com.android.chrome")) {
                    I = "com.android.chrome";
                } else if (arrayList.contains("com.chrome.beta")) {
                    I = "com.chrome.beta";
                } else if (arrayList.contains("com.chrome.dev")) {
                    I = "com.chrome.dev";
                }
            } catch (RuntimeException unused) {
                Log.e("CustomTabsHelper", "Runtime exception while getting specialized handlers");
            }
        } else if (arrayList.contains("com.android.chrome")) {
            I = "com.android.chrome";
        } else if (arrayList.contains("com.chrome.beta")) {
            I = "com.chrome.beta";
        } else if (arrayList.contains("com.chrome.dev")) {
            I = "com.chrome.dev";
        }
        return I;
    }

    public static fu1 s(Throwable th) {
        if (th instanceof xw1) {
            xw1 xw1Var = (xw1) th;
            return C(xw1Var.f, xw1Var.g);
        }
        if (th instanceof au1) {
            return th.getMessage() == null ? E(((au1) th).f, null, null) : E(((au1) th).f, th.getMessage(), null);
        }
        if (!(th instanceof bs0)) {
            return E(1, null, null);
        }
        bs0 bs0Var = (bs0) th;
        int i2 = bs0Var.f;
        String message = bs0Var.getMessage();
        if (message == null) {
            message = "";
        }
        return new fu1(i2, message, "com.google.android.gms.ads", null, null);
    }

    public static yk2 t(Set set, bk2 bk2Var) {
        hn.O(set, "set1");
        hn.O(bk2Var, "set2");
        return new yk2(set, bk2Var);
    }

    public static fu1 v(Throwable th, yw1 yw1Var) {
        fu1 fu1Var;
        fu1 fu1VarS = s(th);
        int i2 = fu1VarS.f;
        if ((i2 == 3 || i2 == 0) && (fu1Var = fu1VarS.i) != null && !fu1Var.h.equals("com.google.android.gms.ads")) {
            fu1VarS.i = null;
        }
        if (yw1Var != null) {
            fu1VarS.j = new zj1(yw1Var.e, "", yw1Var, yw1Var.d, yw1Var.c);
        }
        return fu1VarS;
    }

    public static zk2 w(Set set, zh2 zh2Var) {
        if (set instanceof SortedSet) {
            Set set2 = (SortedSet) set;
            if (!(set2 instanceof zk2)) {
                return new al2(set2, zh2Var);
            }
            zk2 zk2Var = (zk2) set2;
            zh2 zh2Var2 = zk2Var.g;
            zh2Var2.getClass();
            return new al2((SortedSet) zk2Var.f, new ai2(Arrays.asList(zh2Var2, zh2Var)));
        }
        if (!(set instanceof zk2)) {
            set.getClass();
            return new zk2(set, zh2Var);
        }
        zk2 zk2Var2 = (zk2) set;
        zh2 zh2Var3 = zk2Var2.g;
        zh2Var3.getClass();
        return new zk2(zk2Var2.f, new ai2(Arrays.asList(zh2Var3, zh2Var)));
    }

    public static au2 x(yt2 yt2Var) {
        gv1 gv1Var = yt2Var.K;
        bu2 bu2Var = new bu2(((j03) gv1Var.g).b());
        try {
            Provider providerS = ar.s();
            if (providerS == null) {
                throw new GeneralSecurityException("Conscrypt not available");
            }
            Mac.getInstance("AESCMAC", providerS);
            return new un1(bu2Var, 24, new us2(((j03) gv1Var.g).b(), providerS));
        } catch (GeneralSecurityException unused) {
            return bu2Var;
        }
    }

    public static v13 y() {
        ClassLoader classLoader = a23.class.getClassLoader();
        if (v13.class.equals(v13.class)) {
            try {
                try {
                    if (Class.forName("com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader", true, classLoader).getConstructor(null).newInstance(null) == null) {
                        throw null;
                    }
                    throw new ClassCastException();
                } catch (ReflectiveOperationException e) {
                    throw new IllegalStateException(e);
                }
            } catch (ClassNotFoundException unused) {
            }
        }
        try {
            Iterator it = Arrays.asList(new a23[0]).iterator();
            ArrayList arrayList = new ArrayList();
            while (it.hasNext()) {
                try {
                    if (it.next() == null) {
                        throw null;
                    }
                    throw new ClassCastException();
                } catch (ServiceConfigurationError e2) {
                    Logger.getLogger(u13.class.getName()).logp(Level.SEVERE, "com.google.protobuf.GeneratedExtensionRegistryLoader", "load", "Unable to load ".concat(v13.class.getSimpleName()), (Throwable) e2);
                }
            }
            if (arrayList.size() == 1) {
                return (v13) arrayList.get(0);
            }
            if (arrayList.size() == 0) {
                return null;
            }
            try {
                return (v13) v13.class.getMethod("combine", Collection.class).invoke(null, arrayList);
            } catch (ReflectiveOperationException e3) {
                throw new IllegalStateException(e3);
            }
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }

    public static void z(int i2, long j2, String str, int i3, PriorityQueue priorityQueue) {
        eu0 eu0Var = new eu0(i3, j2, str);
        if ((priorityQueue.size() != i2 || (((eu0) priorityQueue.peek()).c <= i3 && ((eu0) priorityQueue.peek()).a <= j2)) && !priorityQueue.contains(eu0Var)) {
            priorityQueue.add(eu0Var);
            if (priorityQueue.size() > i2) {
                priorityQueue.poll();
            }
        }
    }

    public abstract Object j(Intent intent, int i2);

    public abstract ho2 u();
}
