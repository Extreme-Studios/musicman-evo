package defpackage;

import android.content.ClipData;
import android.content.Context;
import android.os.Parcel;
import android.os.RemoteException;
import android.view.ContentInfo;
import android.view.Window;
import android.widget.TextView;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class kc2 implements gs, rb, z82, le1, db1, dr, gm1, uz1, h42 {
    public static kc2 h;
    public final /* synthetic */ int f;
    public Object g;

    public kc2(int i) {
        this.f = i;
        switch (i) {
            case 10:
                this.g = new cw1(10);
                break;
            case 14:
                this.g = new HashMap();
                break;
            default:
                this.g = new LinkedHashMap(0, 0.75f, true);
                break;
        }
    }

    public static final kc2 n(Context context) {
        kc2 kc2Var;
        synchronized (kc2.class) {
            try {
                if (h == null) {
                    h = new kc2(context);
                }
                kc2Var = h;
            } catch (Throwable th) {
                throw th;
            }
        }
        return kc2Var;
    }

    @Override // defpackage.dr
    public void A(g2 g2Var) {
        try {
            ((o51) this.g).a(g2Var.d());
        } catch (RemoteException e) {
            jn.P("", e);
        }
    }

    @Override // defpackage.le1, defpackage.db1
    /* JADX INFO: renamed from: a */
    public void mo3a() {
        switch (this.f) {
            case 15:
                q31 q31Var = (q31) this.g;
                vc3.C.k.getClass();
                long jCurrentTimeMillis = System.currentTimeMillis();
                long j = q31Var.c;
                ArrayList arrayList = q31Var.b;
                arrayList.add(Long.valueOf(jCurrentTimeMillis - j));
                String strValueOf = String.valueOf(arrayList.get(0));
                StringBuilder sb = new StringBuilder(strValueOf.length() + 52);
                sb.append("LoadNewJavascriptEngine(onEngLoaded) latency is ");
                sb.append(strValueOf);
                sb.append(" ms.");
                jn.p(sb.toString());
                zb3.l.postDelayed(new p31(q31Var.a, q31Var.d, q31Var.e, arrayList, j, 1), ((Integer) tu0.e.c.a(lx0.c)).intValue());
                return;
            case 16:
                jn.p("Rejecting reference for JS Engine.");
                boolean zBooleanValue = ((Boolean) tu0.e.c.a(lx0.g8)).booleanValue();
                r31 r31Var = (r31) this.g;
                if (zBooleanValue) {
                    r31Var.o("SdkJavascriptFactory.createNewReference.FailureCallback", new IllegalStateException("Unable to create JS engine reference."));
                    return;
                } else {
                    r31Var.n();
                    return;
                }
            case 25:
                if (((Boolean) tu0.e.c.a(lx0.Ge)).booleanValue()) {
                    us2 us2VarA = ((es1) ((r52) this.g).i).a();
                    us2VarA.s("action", "ptard");
                    us2VarA.s("ptard", "r");
                    us2VarA.t();
                    return;
                }
                return;
            case 26:
                ((md1) this.g).M();
                return;
            case 27:
                lz1 lz1Var = (lz1) this.g;
                synchronized (lz1Var) {
                    lz1Var.n = null;
                    break;
                }
                return;
            default:
                u42 u42Var = (u42) this.g;
                synchronized (u42Var) {
                    u42Var.o = null;
                    break;
                }
                return;
        }
    }

    @Override // defpackage.gm1
    /* JADX INFO: renamed from: b */
    public /* synthetic */ void mo4b(Object obj) {
        switch (this.f) {
            case 20:
                jk1 jk1Var = (jk1) obj;
                String message = ((on1) this.g).getMessage();
                if (message == null) {
                    message = "Internal show error.";
                }
                jk1Var.s(a23.E(12, message, null));
                break;
            default:
                ((qt0) obj).Q0((pt0) this.g);
                break;
        }
    }

    @Override // defpackage.gs
    public void c(rr rrVar, boolean z) {
        b5 b5Var;
        int i = 0;
        switch (this.f) {
            case 1:
                if (rrVar instanceof g20) {
                    ((g20) rrVar).z.k().c(false);
                }
                gs gsVar = ((r1) this.g).j;
                if (gsVar != null) {
                    gsVar.c(rrVar, z);
                }
                break;
            default:
                c5 c5Var = (c5) this.g;
                rr rrVarK = rrVar.k();
                boolean z2 = rrVarK != rrVar;
                if (z2) {
                    rrVar = rrVarK;
                }
                b5[] b5VarArr = c5Var.P;
                int length = b5VarArr != null ? b5VarArr.length : 0;
                while (true) {
                    if (i >= length) {
                        b5Var = null;
                    } else {
                        b5Var = b5VarArr[i];
                        if (b5Var == null || b5Var.h != rrVar) {
                            i++;
                        }
                    }
                }
                if (b5Var != null) {
                    if (!z2) {
                        c5Var.r(b5Var, z);
                    } else {
                        c5Var.p(b5Var.a, b5Var, rrVarK);
                        c5Var.r(b5Var, true);
                    }
                }
                break;
        }
    }

    @Override // defpackage.rb
    public ClipData d() {
        return ((ContentInfo) this.g).getClip();
    }

    @Override // defpackage.rb
    public int e() {
        return ((ContentInfo) this.g).getFlags();
    }

    @Override // defpackage.rb
    public ContentInfo f() {
        return (ContentInfo) this.g;
    }

    @Override // defpackage.h42
    public /* synthetic */ mf1 g(g42 g42Var) {
        return ((p32) this.g).b(g42Var);
    }

    @Override // defpackage.rb
    public int h() {
        return ((ContentInfo) this.g).getSource();
    }

    @Override // defpackage.gs
    public boolean i(rr rrVar) {
        Window.Callback callback;
        switch (this.f) {
            case 1:
                r1 r1Var = (r1) this.g;
                if (rrVar != r1Var.h) {
                    ((g20) rrVar).A.getClass();
                    gs gsVar = r1Var.j;
                    if (gsVar != null) {
                        return gsVar.i(rrVar);
                    }
                }
                return false;
            default:
                c5 c5Var = (c5) this.g;
                if (rrVar != rrVar.k() || !c5Var.J || (callback = c5Var.q.getCallback()) == null || c5Var.U) {
                    return true;
                }
                callback.onMenuOpened(108, rrVar);
                return true;
        }
    }

    @Override // defpackage.z82
    public /* synthetic */ void j(long j, cw1 cw1Var) {
        s90.A(j, cw1Var, (me0[]) ((p83) this.g).h);
    }

    public AtomicReference k(String str) {
        synchronized (this) {
            try {
                HashMap map = (HashMap) this.g;
                if (!map.containsKey(str)) {
                    map.put(str, new AtomicReference());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return (AtomicReference) ((HashMap) this.g).get(str);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0152 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:102:0x0144 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:49:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:53:0x0106  */
    /* JADX WARN: Code duplicated, block: B:54:0x010a  */
    /* JADX WARN: Code duplicated, block: B:56:0x0110  */
    /* JADX WARN: Code duplicated, block: B:59:0x0117  */
    /* JADX WARN: Code duplicated, block: B:62:0x0125  */
    /* JADX WARN: Code duplicated, block: B:67:0x0143  */
    /* JADX WARN: Code duplicated, block: B:70:0x014a  */
    public am0 l(od0 od0Var, zf0 zf0Var, int i) {
        int i2;
        boolean z;
        int i3;
        boolean z2;
        ag0 ag0Var;
        int i4;
        int i5;
        boolean z3;
        int iF;
        bg0 bg0VarC;
        cw1 cw1Var = (cw1) this.g;
        int i6 = 0;
        am0 am0Var = null;
        while (true) {
            int i7 = 0;
            while (true) {
                int i8 = i7 % 10;
                if (i8 == 0) {
                    if (i7 != 0) {
                        byte[] bArr = cw1Var.a;
                        System.arraycopy(bArr, 10, bArr, 0, 9);
                    }
                    i2 = 0;
                } else {
                    i2 = i8;
                }
                z = true;
                int i9 = i7 == 0 ? 10 : 1;
                try {
                    int i10 = i8 + 10;
                    od0Var.u(cw1Var.a, i10 - i9, i9);
                    cw1Var.E(i2);
                    cw1Var.C(i10);
                    if (cw1Var.B() < 3) {
                        int i11 = cw1Var.b;
                        int i12 = cw1Var.c;
                        throw new IndexOutOfBoundsException(ec.l(new StringBuilder(String.valueOf(i11).length() + 17 + String.valueOf(i12).length()), "position=", i11, ", limit=", i12));
                    }
                    int iO = cw1Var.O();
                    i3 = cw1Var.b - 3;
                    cw1Var.b = i3;
                    if (iO == 4801587) {
                        break;
                    }
                    if (s90.v(cw1Var.J()) == -1) {
                        if (i7 == 0) {
                            cw1Var.A(20);
                        }
                        i7++;
                        if (i7 > i) {
                        }
                    }
                    od0Var.i();
                    od0Var.A(i6);
                    return am0Var;
                } catch (EOFException unused) {
                }
            }
            cw1Var.G(6);
            int iG = cw1Var.g();
            int i13 = iG + 10;
            if (am0Var == null) {
                byte[] bArr2 = new byte[i13];
                System.arraycopy(cw1Var.a, i3, bArr2, 0, 10);
                od0Var.u(bArr2, 10, iG);
                ArrayList arrayList = new ArrayList();
                cw1 cw1Var2 = new cw1(i13, bArr2);
                if (cw1Var2.B() < 10) {
                    s90.Q("Id3Decoder", "Data too short to be an ID3 tag");
                } else {
                    int iO2 = cw1Var2.O();
                    if (iO2 != 4801587) {
                        s90.Q("Id3Decoder", "Unexpected first three bytes of ID3 tag header: 0x".concat(String.format("%06X", Integer.valueOf(iO2))));
                    } else {
                        int iK = cw1Var2.K();
                        cw1Var2.G(1);
                        int iK2 = cw1Var2.K();
                        int iG2 = cw1Var2.g();
                        if (iK != 2) {
                            if (iK == 3) {
                                if ((iK2 & 64) != 0) {
                                    int iB = cw1Var2.b();
                                    cw1Var2.G(iB);
                                    iG2 -= iB + 4;
                                }
                            } else if (iK == 4) {
                                if ((iK2 & 64) != 0) {
                                    int iG3 = cw1Var2.g();
                                    cw1Var2.G(iG3 - 4);
                                    iG2 -= iG3;
                                }
                                if ((iK2 & 16) != 0) {
                                    iG2 -= 10;
                                }
                            } else {
                                ec.u(new StringBuilder(String.valueOf(iK).length() + 46), "Skipped ID3 tag with unsupported majorVersion=", iK, "Id3Decoder");
                            }
                            int i14 = iG2;
                            if (iK < 4) {
                                z2 = false;
                            } else {
                                z2 = false;
                            }
                            ag0Var = new ag0(iK, i14, z2);
                        } else if ((iK2 & 64) != 0) {
                            s90.Q("Id3Decoder", "Skipped ID3 tag with majorVersion=2 and undefined compression scheme");
                        } else {
                            int i15 = iG2;
                            if (iK < 4 || (iK2 & 128) == 0) {
                                z2 = false;
                            } else {
                                z2 = true;
                            }
                            ag0Var = new ag0(iK, i15, z2);
                        }
                        if (ag0Var == null) {
                            am0Var = null;
                        } else {
                            i4 = ag0Var.a;
                            int i16 = cw1Var2.b;
                            i5 = i4 == 2 ? 6 : 10;
                            z3 = ag0Var.b;
                            iF = ag0Var.c;
                            if (z3) {
                                iF = i8.F(iF, cw1Var2);
                            }
                            cw1Var2.C(i16 + iF);
                            if (i8.B(cw1Var2, i4, i5, false)) {
                                z = false;
                            } else if (i4 == 4 || !i8.B(cw1Var2, 4, i5, true)) {
                                ec.u(new StringBuilder(String.valueOf(i4).length() + 45), "Failed to validate ID3 tag with majorVersion=", i4, "Id3Decoder");
                                am0Var = null;
                            }
                            while (cw1Var2.B() >= i5) {
                                bg0VarC = i8.C(i4, cw1Var2, z, zf0Var);
                                if (bg0VarC != null) {
                                    arrayList.add(bg0VarC);
                                }
                            }
                            am0Var = new am0(arrayList);
                        }
                    }
                }
                ag0Var = null;
                if (ag0Var == null) {
                    am0Var = null;
                } else {
                    i4 = ag0Var.a;
                    int i17 = cw1Var2.b;
                    if (i4 == 2) {
                    }
                    z3 = ag0Var.b;
                    iF = ag0Var.c;
                    if (z3) {
                        iF = i8.F(iF, cw1Var2);
                    }
                    cw1Var2.C(i17 + iF);
                    if (i8.B(cw1Var2, i4, i5, false)) {
                        if (i4 == 4) {
                        }
                        ec.u(new StringBuilder(String.valueOf(i4).length() + 45), "Failed to validate ID3 tag with majorVersion=", i4, "Id3Decoder");
                        am0Var = null;
                    } else {
                        z = false;
                    }
                    while (cw1Var2.B() >= i5) {
                        bg0VarC = i8.C(i4, cw1Var2, z, zf0Var);
                        if (bg0VarC != null) {
                            arrayList.add(bg0VarC);
                        }
                    }
                    am0Var = new am0(arrayList);
                }
            } else {
                od0Var.A(iG);
            }
            i6 += i13;
        }
    }

    @Override // defpackage.uz1
    public void m(mi1 mi1Var) {
        oj1 oj1Var;
        switch (this.f) {
            case 27:
                lz1 lz1Var = (lz1) this.g;
                sh1 sh1Var = (sh1) mi1Var;
                synchronized (lz1Var) {
                    try {
                        sh1 sh1Var2 = lz1Var.n;
                        if (sh1Var2 != null) {
                            oj1 oj1Var2 = sh1Var.j;
                            if (oj1Var2 != null && (oj1Var = sh1Var2.j) != null) {
                                oj1Var2.a(oj1Var.a.get());
                            }
                            nk1 nk1Var = lz1Var.n.c;
                            nk1Var.getClass();
                            nk1Var.L1(new iv(null));
                        }
                        lz1Var.n = sh1Var;
                        sh1Var.a();
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return;
            default:
                u42 u42Var = (u42) this.g;
                cr1 cr1Var = (cr1) mi1Var;
                synchronized (u42Var) {
                    try {
                        u42Var.o = cr1Var;
                        if (((Boolean) tu0.e.c.a(lx0.T3)).booleanValue()) {
                            cr1Var.u.a = u42Var.j;
                        }
                        u42Var.o.a();
                    } catch (Throwable th2) {
                        throw th2;
                    }
                    break;
                }
                return;
        }
    }

    public void o(RemoteException remoteException) {
        ((r52) this.g).P();
        if (((Boolean) tu0.e.c.a(lx0.He)).booleanValue()) {
            vc3.C.h.d("Preconnect Remote", remoteException);
        }
    }

    public void p(boolean z) {
        synchronized (kc2.class) {
            try {
                z61 z61Var = (z61) this.g;
                z61Var.F(Boolean.valueOf(z), "paidv2_publisher_option");
                if (!z) {
                    z61Var.J("paidv2_creation_time");
                    z61Var.J("paidv2_id");
                    z61Var.J("vendor_scoped_gpid_v2_id");
                    z61Var.J("vendor_scoped_gpid_v2_creation_time");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void q(long j) {
        es0 es0Var = new es0("creation");
        es0Var.f = Long.valueOf(j);
        es0Var.h = "nativeObjectNotCreated";
        r(es0Var);
    }

    public void r(es0 es0Var) {
        String strI = es0Var.i();
        jn.R("Dispatching AFMA event on publisher webview: ".concat(strI));
        j21 j21Var = (j21) this.g;
        Parcel parcelU = j21Var.U();
        parcelU.writeString(strI);
        j21Var.K0(parcelU, 1);
    }

    public String toString() {
        switch (this.f) {
            case 3:
                return "ContentInfoCompat{" + ((ContentInfo) this.g) + "}";
            default:
                return super.toString();
        }
    }

    public /* synthetic */ kc2(int i, boolean z) {
        this.f = i;
    }

    public kc2(Context context) {
        this.f = 0;
        if (z61.k == null) {
            z61.k = new z61(context);
        }
        this.g = z61.k;
    }

    public kc2(t31 t31Var, r31 r31Var) {
        this.f = 16;
        this.g = r31Var;
        Objects.requireNonNull(t31Var);
    }

    public kc2(w51 w51Var, o51 o51Var) {
        this.f = 17;
        this.g = o51Var;
    }

    public /* synthetic */ kc2(int i, Object obj) {
        this.f = i;
        this.g = obj;
    }

    public kc2(TextView textView) {
        this.f = 4;
        this.g = new dh(textView);
    }

    public kc2(ContentInfo contentInfo) {
        this.f = 3;
        contentInfo.getClass();
        this.g = ob.r(contentInfo);
    }

    public kc2(SideSheetBehavior sideSheetBehavior) {
        this.f = 7;
        this.g = sideSheetBehavior;
        new x1(9, this);
    }
}
