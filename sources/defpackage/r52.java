package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.RemoteException;
import android.os.Trace;
import android.text.Editable;
import android.text.Selection;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.KeyEvent;
import androidx.work.OverwritingInputMerger;
import com.extremestudios.musicmanevo.R;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public final class r52 implements l30, el0, x7, eb1, ir, kr, mr, ke1, pn1 {
    public static r52 j;
    public static volatile r52 k;
    public static final Object l = new Object();
    public final /* synthetic */ int f;
    public Object g;
    public Object h;
    public Object i;

    public r52(lw2 lw2Var, List list, xr2 xr2Var) throws GeneralSecurityException {
        this.f = 26;
        this.g = list;
        this.h = xr2Var;
        if (((AtomicBoolean) br2.a.g).get()) {
            HashSet hashSet = new HashSet();
            for (kw2 kw2Var : lw2Var.A()) {
                if (hashSet.contains(Integer.valueOf(kw2Var.B()))) {
                    int iB = kw2Var.B();
                    throw new GeneralSecurityException(ec.k(new StringBuilder(String.valueOf(iB).length() + 121), "KeyID ", iB, " is duplicated in the keyset, and Tink is configured to reject such keysets with the flag validateKeysetsOnParsing."));
                }
                hashSet.add(Integer.valueOf(kw2Var.B()));
            }
            if (!hashSet.contains(Integer.valueOf(lw2Var.z()))) {
                j7.r("Primary key id not found in keyset, and Tink is configured to reject such keysets with the flag validateKeysetsOnParsing.");
                throw null;
            }
        }
        this.i = null;
    }

    public static void C(un1 un1Var, r52 r52Var) {
        r52 r52Var2 = (r52) un1Var.g;
        long[] jArr = (long[]) r52Var.g;
        long[] jArr2 = (long[]) r52Var2.g;
        long[] jArr3 = (long[]) un1Var.h;
        s90.Z(jArr, jArr2, jArr3);
        long[] jArr4 = (long[]) r52Var.h;
        long[] jArr5 = (long[]) r52Var2.h;
        long[] jArr6 = (long[]) r52Var2.i;
        s90.Z(jArr4, jArr5, jArr6);
        s90.Z((long[]) r52Var.i, jArr6, jArr3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final r52 R(ho2 ho2Var) throws GeneralSecurityException {
        r52 r52Var;
        int i;
        qk qkVar = new qk(7);
        ArrayList arrayList = (ArrayList) qkVar.h;
        bo2 bo2Var = new bo2(ho2Var);
        ig igVar = ig.l;
        bo2Var.c = igVar;
        int i2 = 1;
        bo2Var.a = true;
        int size = arrayList.size();
        int i3 = 0;
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            ((bo2) obj).a = false;
        }
        arrayList.add(bo2Var);
        r52 r52Var2 = null;
        if (qkVar.f) {
            j7.r("KeysetHandle.Builder#build must only be called once");
            return null;
        }
        qkVar.f = true;
        iw2 iw2VarF = lw2.F();
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int i5 = 0;
        while (i5 < arrayList.size() - 1) {
            int i6 = i5 + 1;
            if (((bo2) arrayList.get(i5)).c == igVar && ((bo2) arrayList.get(i6)).c != igVar) {
                j7.r("Entries with 'withRandomId()' may only be followed by other entries with 'withRandomId()'.");
                return null;
            }
            i5 = i6;
        }
        HashSet hashSet = new HashSet();
        int size2 = arrayList.size();
        Integer num = null;
        int i7 = 0;
        while (i7 < size2) {
            Object obj2 = arrayList.get(i7);
            i7++;
            bo2 bo2Var2 = (bo2) obj2;
            bo2Var2.getClass();
            ho2 ho2Var2 = bo2Var2.b;
            ig igVar2 = bo2Var2.c;
            if (igVar2 == null) {
                r52 r52Var3 = r52Var2;
                j7.r("No ID was set (with withFixedId or withRandomId)");
                return r52Var3;
            }
            if (igVar2 == igVar) {
                int i8 = i3;
                while (true) {
                    r52Var = r52Var2;
                    if (i8 != 0 && !hashSet.contains(Integer.valueOf(i8))) {
                        break;
                    }
                    int i9 = ct2.a;
                    i8 = i3;
                    while (i8 == 0) {
                        byte[] bArrA = vs2.a(4);
                        i8 = ((bArrA[1] & 255) << 16) | ((bArrA[i3] & 255) << 24) | ((bArrA[2] & 255) << 8) | (bArrA[3] & 255);
                        i3 = 0;
                    }
                    r52Var2 = r52Var;
                }
                i = i8;
            } else {
                r52Var = r52Var2;
                i = 0;
            }
            Integer numValueOf = Integer.valueOf(i);
            if (hashSet.contains(numValueOf)) {
                int i10 = i;
                throw new GeneralSecurityException(ec.k(new StringBuilder(String.valueOf(i10).length() + 31), "Id ", i10, " is used twice in the keyset"));
            }
            hashSet.add(numValueOf);
            a23 a23VarB = yr2.b.b(ho2Var2, true != ho2Var2.a() ? r52Var : numValueOf);
            eo2 eo2Var = new eo2(a23VarB, 3, i, bo2Var2.a, false, fi2.g);
            kw2 kw2VarZ = Z(a23VarB, 3, i);
            iw2VarF.b();
            ((lw2) iw2VarF.g).H(kw2VarZ);
            if (bo2Var2.a) {
                if (num != null) {
                    j7.r("Two primaries were set");
                    return r52Var;
                }
                num = numValueOf;
            }
            arrayList2.add(eo2Var);
            i3 = 0;
            r52Var2 = r52Var;
        }
        r52 r52Var4 = r52Var2;
        if (num == null) {
            j7.r("No primary was set");
            return r52Var4;
        }
        int iIntValue = num.intValue();
        iw2VarF.b();
        ((lw2) iw2VarF.g).G(iIntValue);
        lw2 lw2Var = (lw2) iw2VarF.c();
        if (lw2Var.B() <= 0) {
            j7.r("empty keyset");
            return r52Var4;
        }
        xr2 xr2Var = (xr2) qkVar.g;
        r52 r52Var5 = new r52(lw2Var, arrayList2, xr2Var);
        if (xr2Var.a.isEmpty()) {
            return r52Var5;
        }
        ki2 ki2Var = new ki2(i2);
        ArrayList arrayList3 = new ArrayList(arrayList2.size());
        int size3 = arrayList2.size();
        int i11 = 0;
        while (i11 < size3) {
            Object obj3 = arrayList2.get(i11);
            i11++;
            eo2 eo2Var2 = (eo2) obj3;
            ki2 ki2Var2 = ki2Var;
            arrayList3.add(new eo2(eo2Var2.a, eo2Var2.g, eo2Var2.c, eo2Var2.d, eo2Var2.e, ki2Var2));
            ki2Var = ki2Var2;
        }
        return new r52(arrayList3, xr2Var, r52Var5, 26, false);
    }

    public static ts2 W(kw2 kw2Var) {
        return ts2.j(kw2Var.A().z(), kw2Var.A().A(), kw2Var.A().B(), kw2Var.C(), kw2Var.C() == yw2.RAW ? null : Integer.valueOf(kw2Var.B()));
    }

    public static boolean X(int i) {
        int i2 = i - 2;
        return i2 == 1 || i2 == 2 || i2 == 3;
    }

    public static kw2 Z(a23 a23Var, int i, int i2) throws GeneralSecurityException {
        ts2 ts2Var = (ts2) fs2.b.f(a23Var);
        Integer num = (Integer) ts2Var.k;
        if (num != null && num.intValue() != i2) {
            j7.r("Wrong ID set for key with ID requirement");
            return null;
        }
        jw2 jw2VarD = kw2.D();
        dw2 dw2VarC = ew2.C();
        String str = (String) ts2Var.g;
        dw2VarC.b();
        ((ew2) dw2VarC.g).E(str);
        n13 n13Var = (n13) ts2Var.i;
        dw2VarC.b();
        ((ew2) dw2VarC.g).F(n13Var);
        int i3 = ts2Var.f;
        dw2VarC.b();
        ((ew2) dw2VarC.g).G(i3);
        jw2VarD.b();
        ((kw2) jw2VarD.g).E((ew2) dw2VarC.c());
        jw2VarD.b();
        ((kw2) jw2VarD.g).I(i);
        jw2VarD.b();
        ((kw2) jw2VarD.g).F(i2);
        yw2 yw2Var = (yw2) ts2Var.j;
        jw2VarD.b();
        ((kw2) jw2VarD.g).G(yw2Var);
        return (kw2) jw2VarD.c();
    }

    public static boolean e(Editable editable, KeyEvent keyEvent, boolean z) {
        f50[] f50VarArr;
        if (KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd && (f50VarArr = (f50[]) editable.getSpans(selectionStart, selectionEnd, f50.class)) != null && f50VarArr.length > 0) {
                for (f50 f50Var : f50VarArr) {
                    int spanStart = editable.getSpanStart(f50Var);
                    int spanEnd = editable.getSpanEnd(f50Var);
                    if ((z && spanStart == selectionStart) || ((!z && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                        editable.delete(spanStart, spanEnd);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static r52 n(Context context) {
        if (k == null) {
            synchronized (l) {
                try {
                    if (k == null) {
                        k = new r52(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return k;
    }

    public static r52 r(Context context, AttributeSet attributeSet, int[] iArr, int i) {
        return new r52(context, context.obtainStyledAttributes(attributeSet, iArr, i, 0));
    }

    public static r52 y(Context context) {
        synchronized (r52.class) {
            try {
                r52 r52Var = j;
                if (r52Var != null) {
                    return r52Var;
                }
                Context applicationContext = context.getApplicationContext();
                long jLongValue = ((Long) sy0.b.u()).longValue();
                vj1 vj1VarAsInterface = null;
                if (jLongValue > 0 && jLongValue <= 253830000) {
                    try {
                        vj1VarAsInterface = kj1.asInterface((IBinder) applicationContext.getClassLoader().loadClass("com.google.android.gms.ads.internal.client.LiteSdkInfo").getConstructor(Context.class).newInstance(applicationContext));
                    } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
                        jn.P("Failed to retrieve lite SDK info.", e);
                    }
                }
                r52 r52Var2 = new r52(applicationContext, vj1VarAsInterface);
                j = r52Var2;
                return r52Var2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static final r52 z(lw2 lw2Var) throws GeneralSecurityException {
        a23 vr2Var;
        boolean z;
        if (lw2Var == null || lw2Var.B() <= 0) {
            j7.r("empty keyset");
            return null;
        }
        ArrayList arrayList = new ArrayList(lw2Var.B());
        for (kw2 kw2Var : lw2Var.A()) {
            int iB = kw2Var.B();
            try {
                ts2 ts2VarW = W(kw2Var);
                fs2 fs2Var = fs2.b;
                bt2 bt2Var = (bt2) fs2Var.a.get();
                bt2Var.getClass();
                vr2Var = !bt2Var.b.containsKey(new zs2(ts2.class, (j03) ts2VarW.h)) ? new vr2(ts2VarW) : fs2Var.e(ts2VarW);
                z = false;
            } catch (GeneralSecurityException e) {
                if (((AtomicBoolean) br2.a.g).get()) {
                    throw e;
                }
                vr2Var = new vr2(W(kw2Var));
                z = true;
            }
            if (((AtomicBoolean) br2.a.g).get() && !X(kw2Var.H())) {
                j7.r("Parsing of a single key failed (wrong status) and Tink is configured via validateKeysetsOnParsing to reject such keysets.");
                return null;
            }
            boolean z2 = true;
            int iH = kw2Var.H();
            if (iB != lw2Var.z()) {
                z2 = false;
            }
            arrayList.add(new eo2(vr2Var, iH, iB, z2, z, fi2.g));
        }
        return new r52(lw2Var, Collections.unmodifiableList(arrayList), xr2.b);
    }

    public void A(int i) throws InvalidAlgorithmParameterException {
        if (i != 16 && i != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 128-bit and 256-bit AES keys are supported", Integer.valueOf(i * 8)));
        }
        this.g = Integer.valueOf(i);
    }

    public void B(pd0 pd0Var, ml0 ml0Var) {
        int i = 0;
        while (true) {
            me0[] me0VarArr = (me0[]) this.h;
            if (i >= me0VarArr.length) {
                return;
            }
            ml0Var.a();
            ml0Var.b();
            me0 me0VarZ = pd0Var.z(ml0Var.d, 3);
            de3 de3Var = (de3) ((List) this.g).get(i);
            String str = de3Var.m;
            boolean z = true;
            if (!"application/cea-608".equals(str) && !"application/cea-708".equals(str)) {
                z = false;
            }
            hn.K(z, "Invalid closed caption MIME type provided: %s", str);
            uc3 uc3Var = new uc3();
            ml0Var.b();
            uc3Var.a = ml0Var.e;
            uc3Var.d("video/mp2t");
            uc3Var.e(str);
            uc3Var.e = de3Var.e;
            uc3Var.d = de3Var.d;
            uc3Var.I = de3Var.J;
            uc3Var.o = de3Var.p;
            me0VarZ.d(new de3(uc3Var));
            me0VarArr[i] = me0VarZ;
            i++;
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0059  */
    public void D(z42 z42Var, x42 x42Var, int i, xw1 xw1Var, long j2) {
        String strGroup;
        us2 us2VarA = ((es1) this.i).a();
        us2VarA.s("gqi", z42Var.b);
        us2VarA.r(x42Var);
        us2VarA.s("action", "adapter_status");
        us2VarA.s("adapter_l", String.valueOf(j2));
        us2VarA.s("sc", Integer.toString(i));
        pr1 pr1Var = null;
        if (xw1Var != null) {
            us2VarA.s("arec", Integer.toString(xw1Var.g.f));
            q52 q52Var = (q52) this.g;
            String message = xw1Var.getMessage();
            Pattern pattern = q52Var.a;
            if (pattern == null || message == null) {
                strGroup = null;
            } else {
                Matcher matcher = pattern.matcher(message);
                if (matcher.find()) {
                    strGroup = matcher.group();
                } else {
                    strGroup = null;
                }
            }
            if (strGroup != null) {
                us2VarA.s("areec", strGroup);
            }
        }
        qr1 qr1Var = (qr1) this.h;
        Iterator it = x42Var.t.iterator();
        while (it.hasNext()) {
            pr1 pr1VarB = qr1Var.b((String) it.next());
            if (pr1VarB != null) {
                pr1Var = pr1VarB;
                break;
            }
        }
        if (pr1Var != null) {
            us2VarA.s("ancn", pr1Var.a);
            x51 x51Var = pr1Var.b;
            if (x51Var != null) {
                us2VarA.s("adapter_v", x51Var.toString());
            }
            x51 x51Var2 = pr1Var.c;
            if (x51Var2 != null) {
                us2VarA.s("adapter_sv", x51Var2.toString());
            }
        }
        us2VarA.t();
    }

    public lw2 E() {
        try {
            iw2 iw2VarF = lw2.F();
            for (eo2 eo2Var : (List) this.g) {
                a23 a23VarA = eo2Var.a();
                int i = eo2Var.c;
                kw2 kw2VarZ = Z(a23VarA, eo2Var.g, i);
                iw2VarF.b();
                ((lw2) iw2VarF.g).H(kw2VarZ);
                if (eo2Var.d) {
                    iw2VarF.b();
                    ((lw2) iw2VarF.g).G(i);
                }
            }
            return (lw2) iw2VarF.c();
        } catch (GeneralSecurityException e) {
            j7.i(e);
            return null;
        }
    }

    public void F(int i) throws GeneralSecurityException {
        if (i < 10 || i > 16) {
            throw new GeneralSecurityException(ec.j(new StringBuilder(String.valueOf(i).length() + 40), "Invalid tag size for AesCmacParameters: ", i));
        }
        this.h = Integer.valueOf(i);
    }

    public void G(long j2, cw1 cw1Var) {
        if (cw1Var.B() < 9) {
            return;
        }
        int iB = cw1Var.b();
        int iB2 = cw1Var.b();
        int iK = cw1Var.K();
        if (iB == 434 && iB2 == 1195456820 && iK == 3) {
            ((ts2) this.i).l(j2, cw1Var);
        }
    }

    public synchronized void H(e62 e62Var, d62 d62Var) {
        try {
            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.g;
            y52 y52Var = (y52) concurrentHashMap.get(e62Var);
            vc3.C.k.getClass();
            d62Var.d = System.currentTimeMillis();
            if (y52Var == null) {
                c62 c62Var = (c62) this.h;
                y52 y52Var2 = new y52(c62Var.j, c62Var.k * 1000);
                if (concurrentHashMap.size() == c62Var.i) {
                    int i = c62Var.o;
                    int i2 = i - 1;
                    e62 e62Var2 = null;
                    if (i == 0) {
                        throw null;
                    }
                    long j2 = Long.MAX_VALUE;
                    if (i2 == 0) {
                        for (Map.Entry entry : concurrentHashMap.entrySet()) {
                            if (((y52) entry.getValue()).d.a < j2) {
                                j2 = ((y52) entry.getValue()).d.a;
                                e62Var2 = (e62) entry.getKey();
                            }
                        }
                        if (e62Var2 != null) {
                            concurrentHashMap.remove(e62Var2);
                        }
                    } else if (i2 == 1) {
                        for (Map.Entry entry2 : concurrentHashMap.entrySet()) {
                            if (((y52) entry2.getValue()).d.c < j2) {
                                j2 = ((y52) entry2.getValue()).d.c;
                                e62Var2 = (e62) entry2.getKey();
                            }
                        }
                        if (e62Var2 != null) {
                            concurrentHashMap.remove(e62Var2);
                        }
                    } else if (i2 == 2) {
                        int i3 = Integer.MAX_VALUE;
                        for (Map.Entry entry3 : concurrentHashMap.entrySet()) {
                            if (((y52) entry3.getValue()).d.d < i3) {
                                i3 = ((y52) entry3.getValue()).d.d;
                                e62Var2 = (e62) entry3.getKey();
                            }
                        }
                        if (e62Var2 != null) {
                            concurrentHashMap.remove(e62Var2);
                        }
                    }
                    a62 a62Var = (a62) this.i;
                    a62Var.c++;
                    a62Var.a.g = true;
                }
                concurrentHashMap.put(e62Var, y52Var2);
                a62 a62Var2 = (a62) this.i;
                a62Var2.b++;
                a62Var2.a.f = true;
                y52Var = y52Var2;
            }
            l62 l62Var = y52Var.d;
            l62Var.getClass();
            vc3.C.k.getClass();
            l62Var.c = System.currentTimeMillis();
            l62Var.d++;
            y52Var.a();
            LinkedList linkedList = y52Var.a;
            if (linkedList.size() != y52Var.b) {
                linkedList.add(d62Var);
            }
            a62 a62Var3 = (a62) this.i;
            a62Var3.f++;
            z52 z52Var = a62Var3.a;
            z52 z52VarClone = z52Var.clone();
            z52Var.f = false;
            z52Var.g = false;
            k62 k62Var = y52Var.d.b;
            k62 k62VarClone = k62Var.clone();
            k62Var.f = false;
            k62Var.g = 0;
            bw0 bw0VarZ = gw0.z();
            zv0 zv0VarA = aw0.A();
            zv0VarA.b();
            ((aw0) zv0VarA.g).B();
            ew0 ew0VarA = fw0.A();
            boolean z = z52VarClone.f;
            ew0VarA.b();
            ((fw0) ew0VarA.g).B(z);
            boolean z2 = z52VarClone.g;
            ew0VarA.b();
            ((fw0) ew0VarA.g).C(z2);
            int i4 = k62VarClone.g;
            ew0VarA.b();
            ((fw0) ew0VarA.g).z(i4);
            zv0VarA.b();
            ((aw0) zv0VarA.g).z((fw0) ew0VarA.c());
            bw0VarZ.b();
            ((gw0) bw0VarZ.g).A((aw0) zv0VarA.c());
            d62Var.a.a().f.f0((gw0) bw0VarZ.c());
            S();
        } catch (Throwable th) {
            throw th;
        }
    }

    public byte[] I() {
        long[] jArr = new long[10];
        long[] jArr2 = new long[10];
        long[] jArr3 = new long[10];
        long[] jArr4 = new long[10];
        long[] jArr5 = new long[10];
        long[] jArr6 = new long[10];
        long[] jArr7 = new long[10];
        long[] jArr8 = new long[10];
        long[] jArr9 = new long[10];
        long[] jArr10 = new long[10];
        long[] jArr11 = new long[10];
        long[] jArr12 = new long[10];
        long[] jArr13 = new long[10];
        long[] jArr14 = (long[]) this.i;
        s90.c0(jArr4, jArr14);
        s90.c0(jArr13, jArr4);
        s90.c0(jArr12, jArr13);
        s90.Z(jArr5, jArr12, jArr14);
        s90.Z(jArr6, jArr5, jArr4);
        s90.c0(jArr12, jArr6);
        s90.Z(jArr7, jArr12, jArr5);
        s90.c0(jArr12, jArr7);
        s90.c0(jArr13, jArr12);
        s90.c0(jArr12, jArr13);
        s90.c0(jArr13, jArr12);
        s90.c0(jArr12, jArr13);
        s90.Z(jArr8, jArr12, jArr7);
        s90.c0(jArr12, jArr8);
        s90.c0(jArr13, jArr12);
        for (int i = 2; i < 10; i += 2) {
            s90.c0(jArr12, jArr13);
            s90.c0(jArr13, jArr12);
        }
        s90.Z(jArr9, jArr13, jArr8);
        s90.c0(jArr12, jArr9);
        s90.c0(jArr13, jArr12);
        for (int i2 = 2; i2 < 20; i2 += 2) {
            s90.c0(jArr12, jArr13);
            s90.c0(jArr13, jArr12);
        }
        s90.Z(jArr12, jArr13, jArr9);
        s90.c0(jArr13, jArr12);
        s90.c0(jArr12, jArr13);
        for (int i3 = 2; i3 < 10; i3 += 2) {
            s90.c0(jArr13, jArr12);
            s90.c0(jArr12, jArr13);
        }
        s90.Z(jArr10, jArr12, jArr8);
        s90.c0(jArr12, jArr10);
        s90.c0(jArr13, jArr12);
        for (int i4 = 2; i4 < 50; i4 += 2) {
            s90.c0(jArr12, jArr13);
            s90.c0(jArr13, jArr12);
        }
        s90.Z(jArr11, jArr13, jArr10);
        s90.c0(jArr13, jArr11);
        s90.c0(jArr12, jArr13);
        for (int i5 = 2; i5 < 100; i5 += 2) {
            s90.c0(jArr13, jArr12);
            s90.c0(jArr12, jArr13);
        }
        s90.Z(jArr13, jArr12, jArr11);
        s90.c0(jArr12, jArr13);
        s90.c0(jArr13, jArr12);
        for (int i6 = 2; i6 < 50; i6 += 2) {
            s90.c0(jArr12, jArr13);
            s90.c0(jArr13, jArr12);
        }
        s90.Z(jArr12, jArr13, jArr10);
        s90.c0(jArr13, jArr12);
        s90.c0(jArr12, jArr13);
        s90.c0(jArr13, jArr12);
        s90.c0(jArr12, jArr13);
        s90.c0(jArr13, jArr12);
        s90.Z(jArr, jArr13, jArr6);
        s90.Z(jArr2, (long[]) this.g, jArr);
        s90.Z(jArr3, (long[]) this.h, jArr);
        byte[] bArrH0 = s90.h0(jArr3);
        bArrH0[31] = (byte) (bArrH0[31] ^ ((s90.h0(jArr2)[0] & 1) << 7));
        return bArrH0;
    }

    public eo2 J() {
        for (eo2 eo2Var : (List) this.g) {
            if (eo2Var != null && eo2Var.d) {
                if (eo2Var.b == ao2.h) {
                    return eo2Var;
                }
                j7.e("Keyset has primary which isn't enabled");
                return null;
            }
        }
        j7.e("Keyset has no valid primary");
        return null;
    }

    public void K(l41 l41Var) {
        l41 adapterCreator;
        AtomicReference atomicReference = (AtomicReference) this.i;
        if (!((Boolean) sy0.a.u()).booleanValue()) {
            while (!atomicReference.compareAndSet(null, l41Var) && atomicReference.get() == null) {
            }
            return;
        }
        vj1 vj1Var = (vj1) this.h;
        if (vj1Var == null) {
            adapterCreator = null;
        } else {
            try {
                adapterCreator = vj1Var.getAdapterCreator();
            } catch (RemoteException unused) {
                adapterCreator = null;
            }
        }
        if (adapterCreator == null) {
            adapterCreator = l41Var;
        }
        while (!atomicReference.compareAndSet(null, adapterCreator) && atomicReference.get() == null) {
        }
    }

    public dp2 L() throws GeneralSecurityException {
        gv1 gv1Var;
        j03 j03VarB;
        hp2 hp2Var = (hp2) this.g;
        if (hp2Var == null || (gv1Var = (gv1) this.h) == null) {
            j7.r("Cannot build without parameters and/or key material");
            return null;
        }
        if (hp2Var.a != ((j03) gv1Var.g).a.length) {
            j7.r("Key size mismatch");
            return null;
        }
        if (hp2Var.a() && ((Integer) this.i) == null) {
            j7.r("Cannot create key without ID requirement with parameters with ID requirement");
            return null;
        }
        if (!((hp2) this.g).a() && ((Integer) this.i) != null) {
            j7.r("Cannot create key with ID requirement with parameters without ID requirement");
            return null;
        }
        gp2 gp2Var = ((hp2) this.g).b;
        if (gp2Var == gp2.j) {
            j03VarB = gs2.a;
        } else if (gp2Var == gp2.i) {
            j03VarB = gs2.a(((Integer) this.i).intValue());
        } else {
            if (gp2Var != gp2.h) {
                j7.e("Unknown AesGcmParameters.Variant: ".concat(String.valueOf(gp2Var)));
                return null;
            }
            j03VarB = gs2.b(((Integer) this.i).intValue());
        }
        return new dp2((hp2) this.g, (gv1) this.h, j03VarB, (Integer) this.i);
    }

    public gt2 M() throws GeneralSecurityException {
        Integer num = (Integer) this.g;
        if (num == null) {
            j7.r("key size not set");
            return null;
        }
        if (((Integer) this.h) != null) {
            return new gt2(num.intValue(), ((Integer) this.h).intValue(), (ao2) this.i);
        }
        j7.r("tag size not set");
        return null;
    }

    public ArrayList N() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = (ArrayList) this.h;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            String str = (String) tu0.e.c.a((ix0) obj);
            if (!TextUtils.isEmpty(str)) {
                arrayList.add(str);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        String str2 = "gad:dynamite_module:experiment_id";
        yd.C(arrayList3, new um0(str2, 4, ""));
        yd.C(arrayList3, a23.h);
        yd.C(arrayList3, a23.i);
        yd.C(arrayList3, a23.j);
        yd.C(arrayList3, a23.k);
        yd.C(arrayList3, a23.l);
        yd.C(arrayList3, a23.B);
        yd.C(arrayList3, a23.m);
        yd.C(arrayList3, a23.t);
        yd.C(arrayList3, a23.u);
        yd.C(arrayList3, a23.v);
        yd.C(arrayList3, a23.w);
        yd.C(arrayList3, a23.x);
        yd.C(arrayList3, a23.y);
        yd.C(arrayList3, a23.z);
        yd.C(arrayList3, a23.A);
        yd.C(arrayList3, a23.n);
        yd.C(arrayList3, a23.o);
        yd.C(arrayList3, a23.p);
        yd.C(arrayList3, a23.q);
        yd.C(arrayList3, a23.r);
        yd.C(arrayList3, a23.s);
        arrayList.addAll(arrayList3);
        return arrayList;
    }

    public eo2 O(int i) {
        List list = (List) this.g;
        if (i < 0 || i >= list.size()) {
            int size = list.size();
            throw new IndexOutOfBoundsException(ec.l(new StringBuilder(String.valueOf(i).length() + 34 + String.valueOf(size).length()), "Invalid index ", i, " for keyset of size ", size));
        }
        eo2 eo2Var = (eo2) list.get(i);
        if (!X(eo2Var.g)) {
            j7.e(ec.k(new StringBuilder(String.valueOf(i).length() + 42), "Keyset-Entry at position ", i, " has wrong status"));
            return null;
        }
        if (!eo2Var.e) {
            return (eo2) list.get(i);
        }
        j7.e(ec.k(new StringBuilder(String.valueOf(i).length() + 48), "Keyset-Entry at position ", i, " didn't parse correctly"));
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0052  */
    /* JADX WARN: Code duplicated, block: B:24:? A[RETURN, SYNTHETIC] */
    public void P() {
        try {
            try {
                ((pv1) ((o63) this.g).c()).r0(((d60) this.h).f);
                if (((Boolean) tu0.e.c.a(lx0.Ge)).booleanValue()) {
                    us2 us2VarA = ((es1) this.i).a();
                    us2VarA.s("action", "ptard");
                    us2VarA.s("ptard", "l");
                    us2VarA.t();
                }
            } catch (RemoteException e) {
                e = e;
                if (((Boolean) tu0.e.c.a(lx0.He)).booleanValue()) {
                    vc3.C.h.d("Preconnect Local", e);
                }
            }
        } catch (RemoteException | NullPointerException e2) {
            e = e2;
            if (((Boolean) tu0.e.c.a(lx0.He)).booleanValue()) {
                vc3.C.h.d("Preconnect Local", e);
            }
        }
    }

    public ArrayList Q() {
        ArrayList arrayListN = N();
        ArrayList arrayList = (ArrayList) this.i;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            String str = (String) tu0.e.c.a((ix0) obj);
            if (!TextUtils.isEmpty(str)) {
                arrayListN.add(str);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        yd.C(arrayList2, i8.u);
        arrayListN.addAll(arrayList2);
        return arrayListN;
    }

    public void S() {
        if (((Boolean) tu0.e.c.a(lx0.I6)).booleanValue()) {
            StringBuilder sb = new StringBuilder();
            c62 c62Var = (c62) this.h;
            sb.append(c62Var.h);
            sb.append(" PoolCollection");
            a62 a62Var = (a62) this.i;
            sb.append("\n\tPool does not exist: " + a62Var.d + "\n\tNew pools created: " + a62Var.b + "\n\tPools removed: " + a62Var.c + "\n\tEntries added: " + a62Var.f + "\n\tNo entries retrieved: " + a62Var.e + "\n");
            int i = 0;
            for (Map.Entry entry : ((ConcurrentHashMap) this.g).entrySet()) {
                i++;
                sb.append(i);
                sb.append(". ");
                sb.append(entry.getValue());
                sb.append("#");
                sb.append(((e62) entry.getKey()).hashCode());
                sb.append("    ");
                int i2 = 0;
                while (true) {
                    y52 y52Var = (y52) entry.getValue();
                    y52Var.a();
                    if (i2 >= y52Var.a.size()) {
                        break;
                    }
                    sb.append("[O]");
                    i2++;
                }
                y52 y52Var2 = (y52) entry.getValue();
                y52Var2.a();
                for (int size = y52Var2.a.size(); size < c62Var.j; size++) {
                    sb.append("[ ]");
                }
                sb.append("\n");
                l62 l62Var = ((y52) entry.getValue()).d;
                sb.append("Created: " + l62Var.a + " Last accessed: " + l62Var.c + " Accesses: " + l62Var.d + "\nEntries retrieved: Valid: " + l62Var.e + " Stale: " + l62Var.f);
                sb.append("\n");
            }
            while (i < c62Var.i) {
                i++;
                sb.append(i);
                sb.append(".\n");
            }
            jn.F(sb.toString());
        }
    }

    public Object U(rs0 rs0Var, Class cls) throws GeneralSecurityException {
        List list = (List) this.g;
        r52 r52Var = (r52) this.i;
        if (rs0Var == null) {
            j7.r("Currently only subclasses of InternalConfiguration are accepted");
            return null;
        }
        lw2 lw2VarE = (r52Var == null ? this : r52Var).E();
        int i = ko2.a;
        int iZ = lw2VarE.z();
        boolean z = true;
        int i2 = 0;
        boolean z2 = false;
        for (kw2 kw2Var : lw2VarE.A()) {
            if (kw2Var.H() == 3) {
                if (!kw2Var.z()) {
                    throw new GeneralSecurityException(String.format("key %d has no key data", Integer.valueOf(kw2Var.B())));
                }
                if (kw2Var.C() == yw2.UNKNOWN_PREFIX) {
                    throw new GeneralSecurityException(String.format("key %d has unknown prefix", Integer.valueOf(kw2Var.B())));
                }
                if (kw2Var.H() == 2) {
                    throw new GeneralSecurityException(String.format("key %d has unknown status", Integer.valueOf(kw2Var.B())));
                }
                if (kw2Var.B() == iZ) {
                    if (z2) {
                        j7.r("keyset contains multiple primary keys");
                        return null;
                    }
                    z2 = true;
                }
                z &= kw2Var.A().B() == 4;
                i2++;
            }
        }
        if (i2 == 0) {
            j7.r("keyset must contain at least one ENABLED key");
            return null;
        }
        if (!z2 && !z) {
            j7.r("keyset doesn't contain a valid primary key");
            return null;
        }
        for (int i3 = 0; i3 < list.size(); i3++) {
            if (((eo2) list.get(i3)).e || !X(((eo2) list.get(i3)).g)) {
                String strZ = lw2VarE.C(i3).A().z();
                StringBuilder sb = new StringBuilder(String.valueOf(strZ).length() + String.valueOf(i3).length() + 44 + 32);
                sb.append("Key parsing of key with index ");
                sb.append(i3);
                sb.append(" and type_url ");
                sb.append(strZ);
                sb.append(" failed, unable to get primitive");
                throw new GeneralSecurityException(sb.toString());
            }
        }
        if (r52Var == null) {
            r52Var = this;
        }
        return rs0Var.n(r52Var, (xr2) this.h, cls);
    }

    public fn2 V(r71 r71Var, fv1 fv1Var, fv1 fv1Var2, xm2 xm2Var) {
        ya1 ya1Var = (ya1) this.g;
        String str = r71Var.i;
        zb3 zb3Var = vc3.C.c;
        return na1.J(na1.L(na1.L(fn2.r(zb3.e(str) ? na1.C(new dv1(1)) : na1.J(fv1Var.d(r71Var), ExecutionException.class, kg0.h, ya1Var)), kg0.f, ya1Var), xm2Var, ya1Var), dv1.class, new c41(this, fv1Var2, r71Var, xm2Var, 4), ya1Var);
    }

    @Override // defpackage.x7
    public void Y() {
        qk qkVar = (qk) this.i;
        synchronized (qkVar.g) {
            try {
                if (qkVar.f) {
                    return;
                }
                qkVar.f = true;
                vu0 vu0Var = (vu0) qkVar.h;
                if (vu0Var == null) {
                    return;
                }
                ya1 ya1Var = za1.a;
                wu0 wu0Var = (wu0) this.g;
                yu0 yu0Var = (yu0) this.h;
                yu0Var.f.a(new in2(yu0Var, ya1Var.a(new e9(this, vu0Var, wu0Var, yu0Var, 5)), 19, false), za1.g);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public bv a() {
        UUID uuid = (UUID) this.g;
        j90 j90Var = (j90) this.h;
        bv bvVar = new bv();
        bvVar.a = uuid;
        kb kbVar = j90Var.j;
        boolean z = kbVar.h.a.size() > 0 || kbVar.d || kbVar.b || kbVar.c;
        if (((j90) this.h).q && z) {
            j7.p("Expedited jobs only support network and storage constraints");
            return null;
        }
        this.g = UUID.randomUUID();
        j90 j90Var2 = (j90) this.h;
        j90 j90Var3 = new j90();
        j90Var3.b = 1;
        qd qdVar = qd.c;
        j90Var3.e = qdVar;
        j90Var3.f = qdVar;
        j90Var3.j = kb.i;
        j90Var3.l = 1;
        j90Var3.m = 30000L;
        j90Var3.p = -1L;
        j90Var3.r = 1;
        j90Var3.a = j90Var2.a;
        j90Var3.c = j90Var2.c;
        j90Var3.b = j90Var2.b;
        j90Var3.d = j90Var2.d;
        j90Var3.e = new qd(j90Var2.e);
        j90Var3.f = new qd(j90Var2.f);
        j90Var3.g = j90Var2.g;
        j90Var3.h = j90Var2.h;
        j90Var3.i = j90Var2.i;
        kb kbVar2 = j90Var2.j;
        kb kbVar3 = new kb();
        kbVar3.a = 1;
        kbVar3.f = -1L;
        kbVar3.g = -1L;
        kbVar3.h = new ub();
        kbVar3.b = kbVar2.b;
        kbVar3.c = kbVar2.c;
        kbVar3.a = kbVar2.a;
        kbVar3.d = kbVar2.d;
        kbVar3.e = kbVar2.e;
        kbVar3.h = kbVar2.h;
        j90Var3.j = kbVar3;
        j90Var3.k = j90Var2.k;
        j90Var3.l = j90Var2.l;
        j90Var3.m = j90Var2.m;
        j90Var3.n = j90Var2.n;
        j90Var3.o = j90Var2.o;
        j90Var3.p = j90Var2.p;
        j90Var3.q = j90Var2.q;
        j90Var3.r = j90Var2.r;
        this.h = j90Var3;
        j90Var3.a = ((UUID) this.g).toString();
        return bvVar;
    }

    @Override // defpackage.eb1
    /* JADX INFO: renamed from: b */
    public /* synthetic */ void mo11b(Object obj) {
        e72 e72Var;
        jn.p("loadNewJavascriptEngine (success): Trying to acquire lock");
        uj1 uj1Var = (uj1) this.i;
        synchronized (uj1Var.b) {
            try {
                jn.p("loadNewJavascriptEngine (success): Lock acquired");
                uj1Var.g = 0;
                t31 t31Var = (t31) uj1Var.f;
                if (t31Var != null && ((t31) this.g) != t31Var) {
                    jn.p("New JS engine is loaded, marking previous one as destroyable.");
                    ((t31) uj1Var.f).r();
                }
                uj1Var.f = (t31) this.g;
                if (((Boolean) my0.d.u()).booleanValue() && (e72Var = (e72) uj1Var.e) != null) {
                    a72 a72Var = (a72) this.h;
                    a72Var.b(true);
                    e72Var.b(a72Var.m());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        jn.p("loadNewJavascriptEngine (success): Lock released");
    }

    @Override // defpackage.pn1
    public x42 c() {
        return (x42) this.h;
    }

    @Override // defpackage.el0
    public void d(ry1 ry1Var, pd0 pd0Var, ml0 ml0Var) {
        this.h = ry1Var;
        ml0Var.a();
        ml0Var.b();
        me0 me0VarZ = pd0Var.z(ml0Var.d, 5);
        this.i = me0VarZ;
        me0VarZ.d((de3) this.g);
    }

    public void f(Bundle bundle) {
        HashSet hashSet = (HashSet) this.i;
        String string = ((Context) this.g).getString(R.string.androidx_startup);
        if (bundle != null) {
            try {
                HashSet hashSet2 = new HashSet();
                for (String str : bundle.keySet()) {
                    if (string.equals(bundle.getString(str, null))) {
                        Class<?> cls = Class.forName(str);
                        if (zm.class.isAssignableFrom(cls)) {
                            hashSet.add(cls);
                        }
                    }
                }
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    h((Class) it.next(), hashSet2);
                }
            } catch (ClassNotFoundException e) {
                throw new na(e);
            }
        }
    }

    @Override // defpackage.el0
    public void g(cw1 cw1Var) {
        long jA;
        long j2;
        ((ry1) this.h).getClass();
        String str = qz1.a;
        ry1 ry1Var = (ry1) this.h;
        synchronized (ry1Var) {
            try {
                long j3 = ry1Var.c;
                jA = j3 != -9223372036854775807L ? j3 + ry1Var.b : ry1Var.a();
            } catch (Throwable th) {
                throw th;
            }
        }
        ry1 ry1Var2 = (ry1) this.h;
        synchronized (ry1Var2) {
            j2 = ry1Var2.b;
        }
        if (jA == -9223372036854775807L || j2 == -9223372036854775807L) {
            return;
        }
        de3 de3Var = (de3) this.g;
        if (j2 != de3Var.r) {
            uc3 uc3Var = new uc3(de3Var);
            uc3Var.q = j2;
            de3 de3Var2 = new de3(uc3Var);
            this.g = de3Var2;
            ((me0) this.i).d(de3Var2);
        }
        int iB = cw1Var.B();
        ((me0) this.i).a(cw1Var, iB, 0);
        ((me0) this.i).c(jA, 1, iB, 0, null);
    }

    public Object h(Class cls, HashSet hashSet) {
        Object objB;
        HashMap map = (HashMap) this.h;
        if (jn.g()) {
            try {
                jn.d(cls.getSimpleName());
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        }
        if (hashSet.contains(cls)) {
            throw new IllegalStateException("Cannot initialize " + cls.getName() + ". Cycle detected.");
        }
        if (map.containsKey(cls)) {
            objB = map.get(cls);
        } else {
            hashSet.add(cls);
            try {
                zm zmVar = (zm) cls.getDeclaredConstructor(null).newInstance(null);
                List<Class> listA = zmVar.a();
                if (!listA.isEmpty()) {
                    for (Class cls2 : listA) {
                        if (!map.containsKey(cls2)) {
                            h(cls2, hashSet);
                        }
                    }
                }
                objB = zmVar.b((Context) this.g);
                hashSet.remove(cls);
                map.put(cls, objB);
            } catch (Throwable th2) {
                throw new na(th2);
            }
        }
        Trace.endSection();
        return objB;
    }

    public void i(Runnable runnable) {
        ((vz) this.g).execute(runnable);
    }

    public ColorStateList j(int i) {
        int resourceId;
        ColorStateList colorStateListE;
        TypedArray typedArray = (TypedArray) this.h;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (colorStateListE = jn.e((Context) this.g, resourceId)) == null) ? typedArray.getColorStateList(i) : colorStateListE;
    }

    public Drawable k(int i) {
        int resourceId;
        TypedArray typedArray = (TypedArray) this.h;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) ? typedArray.getDrawable(i) : jn.f((Context) this.g, resourceId);
    }

    public Drawable l(int i) {
        int resourceId;
        Drawable drawableE;
        if (!((TypedArray) this.h).hasValue(i) || (resourceId = ((TypedArray) this.h).getResourceId(i, 0)) == 0) {
            return null;
        }
        e5 e5VarA = e5.a();
        Context context = (Context) this.g;
        synchronized (e5VarA) {
            drawableE = e5VarA.a.e(context, resourceId, true);
        }
        return drawableE;
    }

    public Typeface m(int i, int i2, d6 d6Var) throws Exception {
        XmlPullParserException xmlPullParserException;
        IOException iOException;
        int resourceId = ((TypedArray) this.h).getResourceId(i, 0);
        if (resourceId != 0) {
            if (((TypedValue) this.i) == null) {
                this.i = new TypedValue();
            }
            Context context = (Context) this.g;
            TypedValue typedValue = (TypedValue) this.i;
            ThreadLocal threadLocal = ox.a;
            if (!context.isRestricted()) {
                Resources resources = context.getResources();
                int i3 = 1;
                resources.getValue(resourceId, typedValue, true);
                CharSequence charSequence = typedValue.string;
                if (charSequence == null) {
                    throw new Resources.NotFoundException("Resource \"" + resources.getResourceName(resourceId) + "\" (" + Integer.toHexString(resourceId) + ") is not a Font: " + typedValue);
                }
                String string = charSequence.toString();
                if (!string.startsWith("res/")) {
                    d6Var.a();
                    return null;
                }
                int i4 = typedValue.assetCookie;
                aq aqVar = x40.b;
                Typeface typeface = (Typeface) aqVar.a(x40.b(resources, resourceId, string, i4, i2));
                if (typeface != null) {
                    new Handler(Looper.getMainLooper()).post(new m4(d6Var, i3, typeface));
                    return typeface;
                }
                try {
                    try {
                        if (!string.toLowerCase().endsWith(".xml")) {
                            int i5 = typedValue.assetCookie;
                            Typeface typefaceI = x40.a.i(context, resources, resourceId, string, i2);
                            if (typefaceI != null) {
                                aqVar.b(x40.b(resources, resourceId, string, i5, i2), typefaceI);
                            }
                            if (typefaceI != null) {
                                new Handler(Looper.getMainLooper()).post(new m4(d6Var, i3, typefaceI));
                            } else {
                                d6Var.a();
                            }
                            return typefaceI;
                        }
                        zi ziVarH = a23.h(resources.getXml(resourceId), resources);
                        if (ziVarH != null) {
                            return x40.a(context, ziVarH, resources, resourceId, string, typedValue.assetCookie, i2, d6Var);
                        }
                        try {
                            Log.e("ResourcesCompat", "Failed to find font-family tag");
                            d6Var.a();
                            return null;
                        } catch (IOException e) {
                            iOException = e;
                        } catch (XmlPullParserException e2) {
                            xmlPullParserException = e2;
                            Log.e("ResourcesCompat", "Failed to parse xml resource ".concat(string), xmlPullParserException);
                            d6Var.a();
                            return null;
                        }
                    } catch (IOException e3) {
                        e = e3;
                        iOException = e;
                    } catch (XmlPullParserException e4) {
                        e = e4;
                        xmlPullParserException = e;
                        Log.e("ResourcesCompat", "Failed to parse xml resource ".concat(string), xmlPullParserException);
                        d6Var.a();
                        return null;
                    }
                } catch (IOException e5) {
                    e = e5;
                } catch (XmlPullParserException e6) {
                    e = e6;
                }
                iOException = e;
                Log.e("ResourcesCompat", "Failed to read xml resource ".concat(string), iOException);
                d6Var.a();
                return null;
            }
        }
        return null;
    }

    @Override // defpackage.pn1
    public void o(boolean z, Context context, ik1 ik1Var) {
        try {
            v33 v33Var = vc3.C.b;
            v33.a(context, (AdOverlayInfoParcel) ((cb1) this.g).f.get(), true, (es1) ((mx1) this.i).f);
        } catch (Exception unused) {
        }
    }

    public boolean p(CharSequence charSequence, int i, int i2, e50 e50Var) {
        if ((e50Var.c & 3) == 0) {
            fe feVar = (fe) this.i;
            ls lsVarB = e50Var.b();
            int iA = lsVarB.a(8);
            if (iA != 0) {
                ((ByteBuffer) lsVarB.d).getShort(iA + lsVarB.a);
            }
            feVar.getClass();
            ThreadLocal threadLocal = fe.b;
            if (threadLocal.get() == null) {
                threadLocal.set(new StringBuilder());
            }
            StringBuilder sb = (StringBuilder) threadLocal.get();
            sb.setLength(0);
            while (i < i2) {
                sb.append(charSequence.charAt(i));
                i++;
            }
            TextPaint textPaint = feVar.a;
            String string = sb.toString();
            int i3 = kv.a;
            boolean zHasGlyph = textPaint.hasGlyph(string);
            int i4 = e50Var.c & 4;
            e50Var.c = zHasGlyph ? i4 | 2 : i4 | 1;
        }
        return (e50Var.c & 3) == 2;
    }

    @Override // defpackage.ke1
    public void q(String str, int i, String str2, boolean z) {
        hq1 hq1Var = (hq1) this.g;
        md1 md1Var = (md1) this.h;
        yu0 yu0Var = (yu0) this.i;
        if (z) {
            ee2 ee2Var = hq1Var.a.a;
            if (ee2Var != null && md1Var.f() != null) {
                md1Var.f().C3(ee2Var);
            }
            yu0Var.d();
            return;
        }
        hq1Var.getClass();
        int length = String.valueOf(i).length();
        StringBuilder sb = new StringBuilder(length + 63 + String.valueOf(str).length() + 15 + String.valueOf(str2).length());
        sb.append("Html video Web View failed to load. Error code: ");
        sb.append(i);
        sb.append(", Description: ");
        sb.append(str);
        yu0Var.c(new ky1(ec.m(sb, ", Failing URL: ", str2), 1));
    }

    public void s() {
        dq.d("#008 Must be called on the main UI thread.");
        StringBuilder sb = new StringBuilder(String.valueOf(0).length() + 44);
        sb.append("Adapter called onAdFailedToLoad with error 0.");
        jn.F(sb.toString());
        try {
            ((q41) this.g).m0(0);
        } catch (RemoteException e) {
            jn.Z("#007 Could not call remote method.", e);
        }
    }

    public void t(g2 g2Var) {
        dq.d("#008 Must be called on the main UI thread.");
        int i = g2Var.g;
        String str = (String) g2Var.h;
        String str2 = (String) g2Var.i;
        int length = String.valueOf(i).length();
        StringBuilder sb = new StringBuilder(length + 71 + String.valueOf(str).length() + 15 + String.valueOf(str2).length());
        sb.append("Adapter called onAdFailedToLoad with error. ErrorCode: ");
        sb.append(i);
        sb.append(". ErrorMessage: ");
        sb.append(str);
        sb.append(". ErrorDomain: ");
        sb.append(str2);
        jn.F(sb.toString());
        try {
            ((q41) this.g).M0(g2Var.d());
        } catch (RemoteException e) {
            jn.Z("#007 Could not call remote method.", e);
        }
    }

    public String toString() {
        switch (this.f) {
            case 26:
                lw2 lw2VarE = E();
                int i = ko2.a;
                mw2 mw2VarZ = pw2.z();
                int iZ = lw2VarE.z();
                mw2VarZ.b();
                ((pw2) mw2VarZ.g).A(iZ);
                for (kw2 kw2Var : lw2VarE.A()) {
                    nw2 nw2VarZ = ow2.z();
                    String strZ = kw2Var.A().z();
                    nw2VarZ.b();
                    ((ow2) nw2VarZ.g).A(strZ);
                    int iH = kw2Var.H();
                    nw2VarZ.b();
                    ((ow2) nw2VarZ.g).D(iH);
                    yw2 yw2VarC = kw2Var.C();
                    nw2VarZ.b();
                    ((ow2) nw2VarZ.g).C(yw2VarC);
                    int iB = kw2Var.B();
                    nw2VarZ.b();
                    ((ow2) nw2VarZ.g).B(iB);
                    ow2 ow2Var = (ow2) nw2VarZ.c();
                    mw2VarZ.b();
                    ((pw2) mw2VarZ.g).B(ow2Var);
                }
                return ((pw2) mw2VarZ.c()).toString();
            default:
                return super.toString();
        }
    }

    public void u(g2 g2Var) {
        dq.d("#008 Must be called on the main UI thread.");
        int i = g2Var.g;
        String str = (String) g2Var.h;
        String str2 = (String) g2Var.i;
        int length = String.valueOf(i).length();
        StringBuilder sb = new StringBuilder(length + 71 + String.valueOf(str).length() + 15 + String.valueOf(str2).length());
        sb.append("Adapter called onAdFailedToLoad with error. ErrorCode: ");
        sb.append(i);
        sb.append(". ErrorMessage: ");
        sb.append(str);
        sb.append(". ErrorDomain: ");
        sb.append(str2);
        jn.F(sb.toString());
        try {
            ((q41) this.g).M0(g2Var.d());
        } catch (RemoteException e) {
            jn.Z("#007 Could not call remote method.", e);
        }
    }

    public void v(g2 g2Var) {
        dq.d("#008 Must be called on the main UI thread.");
        int i = g2Var.g;
        String str = (String) g2Var.h;
        String str2 = (String) g2Var.i;
        int length = String.valueOf(i).length();
        StringBuilder sb = new StringBuilder(length + 71 + String.valueOf(str).length() + 15 + String.valueOf(str2).length());
        sb.append("Adapter called onAdFailedToLoad with error. ErrorCode: ");
        sb.append(i);
        sb.append(". ErrorMessage: ");
        sb.append(str);
        sb.append(". ErrorDomain: ");
        sb.append(str2);
        jn.F(sb.toString());
        try {
            ((q41) this.g).M0(g2Var.d());
        } catch (RemoteException e) {
            jn.Z("#007 Could not call remote method.", e);
        }
    }

    public Object w(CharSequence charSequence, int i, int i2, int i3, boolean z, ah ahVar) {
        int i4;
        char c;
        bh bhVar = new bh((ns) ((u40) this.h).i);
        int iCodePointAt = Character.codePointAt(charSequence, i);
        int i5 = 0;
        boolean zH = true;
        int iCharCount = i;
        loop0: while (true) {
            i4 = iCharCount;
            while (true) {
                if (iCharCount < i2 && i5 < i3 && zH) {
                    SparseArray sparseArray = bhVar.c.a;
                    ns nsVar = sparseArray == null ? null : (ns) sparseArray.get(iCodePointAt);
                    if (bhVar.a == 2) {
                        if (nsVar != null) {
                            bhVar.c = nsVar;
                            bhVar.f++;
                        } else {
                            if (iCodePointAt == 65038) {
                                bhVar.a();
                            } else if (iCodePointAt != 65039) {
                                ns nsVar2 = bhVar.c;
                                if (nsVar2.b != null) {
                                    if (bhVar.f != 1) {
                                        bhVar.d = nsVar2;
                                        bhVar.a();
                                    } else if (bhVar.b()) {
                                        bhVar.d = bhVar.c;
                                        bhVar.a();
                                    } else {
                                        bhVar.a();
                                    }
                                    c = 3;
                                } else {
                                    bhVar.a();
                                }
                            }
                            c = 1;
                        }
                        c = 2;
                    } else if (nsVar == null) {
                        bhVar.a();
                        c = 1;
                    } else {
                        bhVar.a = 2;
                        bhVar.c = nsVar;
                        bhVar.f = 1;
                        c = 2;
                    }
                    bhVar.e = iCodePointAt;
                    if (c == 1) {
                        iCharCount = Character.charCount(Character.codePointAt(charSequence, i4)) + i4;
                        if (iCharCount >= i2) {
                            break;
                        }
                        iCodePointAt = Character.codePointAt(charSequence, iCharCount);
                        break;
                    }
                    if (c == 2) {
                        int iCharCount2 = Character.charCount(iCodePointAt) + iCharCount;
                        if (iCharCount2 < i2) {
                            iCodePointAt = Character.codePointAt(charSequence, iCharCount2);
                        }
                        iCharCount = iCharCount2;
                    } else if (c == 3) {
                        if (!z && p(charSequence, i4, iCharCount, bhVar.d.b)) {
                            break;
                        }
                        zH = ahVar.h(charSequence, i4, iCharCount, bhVar.d.b);
                        i5++;
                        break;
                    }
                } else {
                    break loop0;
                }
            }
        }
        if (bhVar.a == 2 && bhVar.c.b != null && ((bhVar.f > 1 || bhVar.b()) && i5 < i3 && zH && (z || !p(charSequence, i4, iCharCount, bhVar.c.b)))) {
            ahVar.h(charSequence, i4, iCharCount, bhVar.c.b);
        }
        return ahVar.c();
    }

    public void x() {
        ((TypedArray) this.h).recycle();
    }

    @Override // defpackage.x7
    public void T(int i) {
    }

    public r52(Context context, d60 d60Var, cv0 cv0Var, us2 us2Var) {
        this.f = 20;
        this.g = context;
        this.i = d60Var;
        this.h = cv0Var;
    }

    public r52(Context context, ya1 ya1Var, ya1 ya1Var2, o63 o63Var, d60 d60Var, dr0 dr0Var, es1 es1Var) {
        this.f = 19;
        this.g = o63Var;
        this.h = d60Var;
        this.i = es1Var;
    }

    public /* synthetic */ r52(Object obj, Object obj2, Object obj3, int i) {
        this.f = i;
        this.g = obj2;
        this.h = obj3;
        this.i = obj;
    }

    public /* synthetic */ r52(Object obj, Object obj2, Object obj3, int i, boolean z) {
        this.f = i;
        this.g = obj;
        this.h = obj2;
        this.i = obj3;
    }

    public r52(q41 q41Var) {
        this.f = 14;
        this.g = q41Var;
    }

    public r52(t41 t41Var, s41 s41Var, v41 v41Var) {
        this.f = 16;
        this.h = t41Var;
        this.i = s41Var;
        this.g = v41Var;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public r52(int i) {
        this(new long[10], new long[10], new long[10], 28, false);
        this.f = i;
        switch (i) {
            case 25:
                this.h = new ArrayDeque();
                this.i = null;
                this.g = new ThreadPoolExecutor(1, 1, 1L, TimeUnit.SECONDS, new LinkedBlockingQueue());
                break;
            case 26:
            default:
                this.g = new ArrayList();
                this.h = new ArrayList();
                this.i = new ArrayList();
                break;
            case 27:
                this.g = null;
                this.h = null;
                this.i = null;
                break;
            case 28:
                break;
            case 29:
                this.g = null;
                this.h = null;
                this.i = ao2.q;
                break;
        }
    }

    public r52(Context context, vj1 vj1Var) {
        this.f = 0;
        this.i = new AtomicReference();
        this.g = context;
        this.h = vj1Var;
    }

    public r52(String str) {
        this.f = 8;
        uc3 uc3Var = new uc3();
        uc3Var.d("video/mp2t");
        uc3Var.e(str);
        this.g = new de3(uc3Var);
    }

    public r52(List list) {
        this.f = 9;
        this.g = list;
        this.h = new me0[list.size()];
        ts2 ts2Var = new ts2(new oc2(10, this));
        this.i = ts2Var;
        ts2Var.k(3);
    }

    public r52(wo1 wo1Var, es1 es1Var) {
        this.f = 23;
        this.g = wo1Var;
        nz1 nz1Var = new nz1(es1Var);
        this.h = nz1Var;
        this.i = new tz1(nz1Var, wo1Var.e);
    }

    public r52(c62 c62Var) {
        this.f = 24;
        this.g = new ConcurrentHashMap(c62Var.j);
        this.h = c62Var;
        this.i = new a62();
    }

    public /* synthetic */ r52(int i, boolean z) {
        this.f = i;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public r52(un1 un1Var) {
        this(28);
        this.f = 28;
        C(un1Var, this);
    }

    public r52(r52 r52Var) {
        this.f = 28;
        this.g = Arrays.copyOf((long[]) r52Var.g, 10);
        this.h = Arrays.copyOf((long[]) r52Var.h, 10);
        this.i = Arrays.copyOf((long[]) r52Var.i, 10);
    }

    public r52(ExecutorService executorService) {
        this.f = 7;
        this.h = new Handler(Looper.getMainLooper());
        this.i = new h90(0, this);
        this.g = new vz(executorService);
    }

    public r52(Context context, TypedArray typedArray) {
        this.f = 6;
        this.g = context;
        this.h = typedArray;
    }

    public r52(Runnable runnable) {
        this.f = 4;
        this.h = new CopyOnWriteArrayList();
        this.i = new HashMap();
        this.g = runnable;
    }

    public r52(Context context) {
        this.f = 1;
        this.g = context.getApplicationContext();
        this.i = new HashSet();
        this.h = new HashMap();
    }

    public r52(Class cls) {
        this.f = 5;
        HashSet hashSet = new HashSet();
        this.i = hashSet;
        this.g = UUID.randomUUID();
        String string = ((UUID) this.g).toString();
        String name = cls.getName();
        j90 j90Var = new j90();
        j90Var.b = 1;
        qd qdVar = qd.c;
        j90Var.e = qdVar;
        j90Var.f = qdVar;
        j90Var.j = kb.i;
        j90Var.l = 1;
        j90Var.m = 30000L;
        j90Var.p = -1L;
        j90Var.r = 1;
        j90Var.a = string;
        j90Var.c = name;
        this.h = j90Var;
        hashSet.add(cls.getName());
        ((j90) this.h).d = OverwritingInputMerger.class.getName();
    }

    public r52(u40 u40Var, ig igVar, fe feVar, Set set) {
        this.f = 3;
        this.g = igVar;
        this.h = u40Var;
        this.i = feVar;
        if (set.isEmpty()) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            int[] iArr = (int[]) it.next();
            String str = new String(iArr, 0, iArr.length);
            w(str, 0, str.length(), 1, true, new kp2(str, 2));
        }
    }
}
