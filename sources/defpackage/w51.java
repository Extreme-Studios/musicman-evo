package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class w51 extends jt0 implements s51 {
    public static final /* synthetic */ int g = 0;
    public final RtbAdapter f;

    public w51(RtbAdapter rtbAdapter) {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
        this.f = rtbAdapter;
    }

    public static final void C3(String str) throws RemoteException {
        jn.T("Server parameters: ".concat(String.valueOf(str)));
        try {
            new Bundle();
            if (str != null) {
                JSONObject jSONObject = new JSONObject(str);
                Bundle bundle = new Bundle();
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    bundle.putString(next, jSONObject.getString(next));
                }
            }
        } catch (JSONException e) {
            jn.P("", e);
            j7.n();
        }
    }

    public static final void D3(f93 f93Var) {
        if (f93Var.k) {
            return;
        }
        f32 f32Var = ut0.f.a;
        f32.o();
    }

    public static final void E3(String str, f93 f93Var) {
        String str2 = f93Var.z;
        try {
            new JSONObject(str).getString("max_ad_content_rating");
        } catch (JSONException unused) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1, types: [g51] */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r22v10, types: [o51] */
    /* JADX WARN: Type inference failed for: r22v2, types: [i51] */
    /* JADX WARN: Type inference failed for: r22v3 */
    /* JADX WARN: Type inference failed for: r22v4, types: [k51] */
    /* JADX WARN: Type inference failed for: r22v5 */
    /* JADX WARN: Type inference failed for: r22v6, types: [q51] */
    /* JADX WARN: Type inference failed for: r22v7, types: [o51] */
    /* JADX WARN: Type inference failed for: r22v8, types: [q51] */
    /* JADX WARN: Type inference failed for: r22v9, types: [i51] */
    /* JADX WARN: Type inference failed for: r23v0 */
    /* JADX WARN: Type inference failed for: r23v1, types: [u51] */
    /* JADX WARN: Type inference failed for: r23v2 */
    /* JADX WARN: Type inference failed for: r25v0, types: [w51] */
    @Override // defpackage.jt0
    public final boolean A3(int i, Parcel parcel, Parcel parcel2) throws RemoteException {
        ?? t51Var;
        ?? j51Var;
        ?? f51Var;
        IInterface h51Var = null;
        if (i == 1) {
            rm rmVarO0 = ju.O0(parcel.readStrongBinder());
            String string = parcel.readString();
            Parcelable.Creator creator = Bundle.CREATOR;
            Bundle bundle = (Bundle) kt0.b(parcel, creator);
            Bundle bundle2 = (Bundle) kt0.b(parcel, creator);
            kb3 kb3Var = (kb3) kt0.b(parcel, kb3.CREATOR);
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder == null) {
                t51Var = h51Var;
            } else {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.ISignalsCallback");
                if (iInterfaceQueryLocalInterface instanceof u51) {
                    h51Var = (u51) iInterfaceQueryLocalInterface;
                    t51Var = h51Var;
                } else {
                    t51Var = new t51(strongBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.ISignalsCallback", 2);
                }
            }
            kt0.f(parcel);
            q3(rmVarO0, string, bundle, bundle2, kb3Var, t51Var);
            parcel2.writeNoException();
            return true;
        }
        if (i == 2) {
            d();
            throw null;
        }
        if (i == 3) {
            e();
            throw null;
        }
        if (i == 5) {
            hv1 hv1VarF = f();
            parcel2.writeNoException();
            kt0.e(parcel2, hv1VarF);
            return true;
        }
        if (i == 10) {
            ju.O0(parcel.readStrongBinder());
            kt0.f(parcel);
            parcel2.writeNoException();
            return true;
        }
        if (i == 11) {
            parcel.createStringArray();
            kt0.f(parcel);
            parcel2.writeNoException();
            return true;
        }
        switch (i) {
            case 13:
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                f93 f93Var = (f93) kt0.b(parcel, f93.CREATOR);
                rm rmVarO1 = ju.O0(parcel.readStrongBinder());
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
                    h51Var = iInterfaceQueryLocalInterface2 instanceof i51 ? (i51) iInterfaceQueryLocalInterface2 : new h51(strongBinder2);
                }
                ?? r22 = h51Var;
                q41 q41VarB3 = p41.B3(parcel.readStrongBinder());
                kb3 kb3Var2 = (kb3) kt0.b(parcel, kb3.CREATOR);
                kt0.f(parcel);
                z1(string2, string3, f93Var, rmVarO1, r22, q41VarB3, kb3Var2);
                parcel2.writeNoException();
                return true;
            case 14:
                String string4 = parcel.readString();
                String string5 = parcel.readString();
                f93 f93Var2 = (f93) kt0.b(parcel, f93.CREATOR);
                rm rmVarO2 = ju.O0(parcel.readStrongBinder());
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 == null) {
                    j51Var = h51Var;
                } else {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IInterstitialCallback");
                    if (iInterfaceQueryLocalInterface3 instanceof k51) {
                        h51Var = (k51) iInterfaceQueryLocalInterface3;
                        j51Var = h51Var;
                    } else {
                        j51Var = new j51(strongBinder3, "com.google.android.gms.ads.internal.mediation.client.rtb.IInterstitialCallback", 2);
                    }
                }
                q41 q41VarB4 = p41.B3(parcel.readStrongBinder());
                kt0.f(parcel);
                C0(string4, string5, f93Var2, rmVarO2, j51Var, q41VarB4);
                parcel2.writeNoException();
                return true;
            case 15:
                ju.O0(parcel.readStrongBinder());
                kt0.f(parcel);
                parcel2.writeNoException();
                parcel2.writeInt(0);
                return true;
            case 16:
                String string6 = parcel.readString();
                String string7 = parcel.readString();
                f93 f93Var3 = (f93) kt0.b(parcel, f93.CREATOR);
                rm rmVarO3 = ju.O0(parcel.readStrongBinder());
                IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 != null) {
                    IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback");
                    h51Var = iInterfaceQueryLocalInterface4 instanceof q51 ? (q51) iInterfaceQueryLocalInterface4 : new p51(strongBinder4);
                }
                ?? r23 = h51Var;
                q41 q41VarB5 = p41.B3(parcel.readStrongBinder());
                kt0.f(parcel);
                h2(string6, string7, f93Var3, rmVarO3, r23, q41VarB5);
                parcel2.writeNoException();
                return true;
            case 17:
                ju.O0(parcel.readStrongBinder());
                kt0.f(parcel);
                parcel2.writeNoException();
                parcel2.writeInt(0);
                return true;
            case 18:
                String string8 = parcel.readString();
                String string9 = parcel.readString();
                f93 f93Var4 = (f93) kt0.b(parcel, f93.CREATOR);
                rm rmVarO4 = ju.O0(parcel.readStrongBinder());
                IBinder strongBinder5 = parcel.readStrongBinder();
                if (strongBinder5 != null) {
                    IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
                    h51Var = iInterfaceQueryLocalInterface5 instanceof o51 ? (o51) iInterfaceQueryLocalInterface5 : new n51(strongBinder5);
                }
                ?? r24 = h51Var;
                q41 q41VarB6 = p41.B3(parcel.readStrongBinder());
                kt0.f(parcel);
                M1(string8, string9, f93Var4, rmVarO4, r24, q41VarB6, null);
                parcel2.writeNoException();
                return true;
            case 19:
                parcel.readString();
                kt0.f(parcel);
                parcel2.writeNoException();
                return true;
            case 20:
                String string10 = parcel.readString();
                String string11 = parcel.readString();
                f93 f93Var5 = (f93) kt0.b(parcel, f93.CREATOR);
                rm rmVarO5 = ju.O0(parcel.readStrongBinder());
                IBinder strongBinder6 = parcel.readStrongBinder();
                if (strongBinder6 != null) {
                    IInterface iInterfaceQueryLocalInterface6 = strongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback");
                    h51Var = iInterfaceQueryLocalInterface6 instanceof q51 ? (q51) iInterfaceQueryLocalInterface6 : new p51(strongBinder6);
                }
                ?? r25 = h51Var;
                q41 q41VarB7 = p41.B3(parcel.readStrongBinder());
                kt0.f(parcel);
                G2(string10, string11, f93Var5, rmVarO5, r25, q41VarB7);
                parcel2.writeNoException();
                return true;
            case zw0.zzm /* 21 */:
                String string12 = parcel.readString();
                String string13 = parcel.readString();
                f93 f93Var6 = (f93) kt0.b(parcel, f93.CREATOR);
                rm rmVarO6 = ju.O0(parcel.readStrongBinder());
                IBinder strongBinder7 = parcel.readStrongBinder();
                if (strongBinder7 != null) {
                    IInterface iInterfaceQueryLocalInterface7 = strongBinder7.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
                    h51Var = iInterfaceQueryLocalInterface7 instanceof i51 ? (i51) iInterfaceQueryLocalInterface7 : new h51(strongBinder7);
                }
                ?? r26 = h51Var;
                q41 q41VarB8 = p41.B3(parcel.readStrongBinder());
                kb3 kb3Var3 = (kb3) kt0.b(parcel, kb3.CREATOR);
                kt0.f(parcel);
                Q1(string12, string13, f93Var6, rmVarO6, r26, q41VarB8, kb3Var3);
                parcel2.writeNoException();
                return true;
            case 22:
                String string14 = parcel.readString();
                String string15 = parcel.readString();
                f93 f93Var7 = (f93) kt0.b(parcel, f93.CREATOR);
                rm rmVarO7 = ju.O0(parcel.readStrongBinder());
                IBinder strongBinder8 = parcel.readStrongBinder();
                if (strongBinder8 != null) {
                    IInterface iInterfaceQueryLocalInterface8 = strongBinder8.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
                    h51Var = iInterfaceQueryLocalInterface8 instanceof o51 ? (o51) iInterfaceQueryLocalInterface8 : new n51(strongBinder8);
                }
                ?? r27 = h51Var;
                q41 q41VarB9 = p41.B3(parcel.readStrongBinder());
                qz0 qz0Var = (qz0) kt0.b(parcel, qz0.CREATOR);
                kt0.f(parcel);
                M1(string14, string15, f93Var7, rmVarO7, r27, q41VarB9, qz0Var);
                parcel2.writeNoException();
                return true;
            case 23:
                String string16 = parcel.readString();
                String string17 = parcel.readString();
                f93 f93Var8 = (f93) kt0.b(parcel, f93.CREATOR);
                rm rmVarO8 = ju.O0(parcel.readStrongBinder());
                IBinder strongBinder9 = parcel.readStrongBinder();
                if (strongBinder9 == null) {
                    f51Var = h51Var;
                } else {
                    IInterface iInterfaceQueryLocalInterface9 = strongBinder9.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IAppOpenCallback");
                    if (iInterfaceQueryLocalInterface9 instanceof g51) {
                        h51Var = (g51) iInterfaceQueryLocalInterface9;
                        f51Var = h51Var;
                    } else {
                        f51Var = new f51(strongBinder9, "com.google.android.gms.ads.internal.mediation.client.rtb.IAppOpenCallback", 2);
                    }
                }
                q41 q41VarB10 = p41.B3(parcel.readStrongBinder());
                kt0.f(parcel);
                g2(string16, string17, f93Var8, rmVarO8, f51Var, q41VarB10);
                parcel2.writeNoException();
                return true;
            case 24:
                ju.O0(parcel.readStrongBinder());
                kt0.f(parcel);
                parcel2.writeNoException();
                parcel2.writeInt(0);
                return true;
            default:
                return false;
        }
    }

    public final void B3(f93 f93Var) {
        Bundle bundle = f93Var.r;
        if (bundle == null || bundle.getBundle(this.f.getClass().getName()) == null) {
            new Bundle();
        }
    }

    @Override // defpackage.s51
    public final void C0(String str, String str2, f93 f93Var, rm rmVar, k51 k51Var, q41 q41Var) throws RemoteException {
        try {
            zy1 zy1Var = new zy1(this, 16, k51Var);
            RtbAdapter rtbAdapter = this.f;
            C3(str2);
            B3(f93Var);
            D3(f93Var);
            E3(str2, f93Var);
            rtbAdapter.loadRtbInterstitialAd(new jr(), zy1Var);
        } catch (Throwable th) {
            jn.P("Adapter failed to render interstitial ad.", th);
            s90.B(rmVar, th, "adapter.loadRtbInterstitialAd");
            j7.n();
        }
    }

    @Override // defpackage.s51
    public final void G2(String str, String str2, f93 f93Var, rm rmVar, q51 q51Var, q41 q41Var) throws RemoteException {
        try {
            s70 s70Var = new s70(this, q51Var);
            RtbAdapter rtbAdapter = this.f;
            C3(str2);
            B3(f93Var);
            D3(f93Var);
            E3(str2, f93Var);
            rtbAdapter.loadRtbRewardedInterstitialAd(new nr(), s70Var);
        } catch (Throwable th) {
            jn.P("Adapter failed to render rewarded interstitial ad.", th);
            s90.B(rmVar, th, "adapter.loadRtbRewardedInterstitialAd");
            j7.n();
        }
    }

    @Override // defpackage.s51
    public final boolean I0(ju juVar) {
        return false;
    }

    @Override // defpackage.s51
    public final void M1(String str, String str2, f93 f93Var, rm rmVar, o51 o51Var, q41 q41Var, qz0 qz0Var) throws RemoteException {
        RtbAdapter rtbAdapter = this.f;
        try {
            kc2 kc2Var = new kc2(this, o51Var);
            C3(str2);
            B3(f93Var);
            D3(f93Var);
            E3(str2, f93Var);
            rtbAdapter.loadRtbNativeAdMapper(new lr(), kc2Var);
        } catch (Throwable th) {
            jn.P("Adapter failed to render native ad.", th);
            s90.B(rmVar, th, "adapter.loadRtbNativeAdMapper");
            String message = th.getMessage();
            if (TextUtils.isEmpty(message) || !message.equals("Method is not found")) {
                j7.n();
                return;
            }
            try {
                oc2 oc2Var = new oc2(this, o51Var);
                C3(str2);
                B3(f93Var);
                D3(f93Var);
                E3(str2, f93Var);
                rtbAdapter.loadRtbNativeAd(new lr(), oc2Var);
            } catch (Throwable th2) {
                jn.P("Adapter failed to render native ad.", th2);
                s90.B(rmVar, th2, "adapter.loadRtbNativeAd");
                j7.n();
            }
        }
    }

    @Override // defpackage.s51
    public final void Q1(String str, String str2, f93 f93Var, rm rmVar, i51 i51Var, q41 q41Var, kb3 kb3Var) throws RemoteException {
        try {
            RtbAdapter rtbAdapter = this.f;
            C3(str2);
            B3(f93Var);
            D3(f93Var);
            E3(str2, f93Var);
            new s2(kb3Var.f, kb3Var.j, kb3Var.g);
            try {
                i51Var.a(new fu1(7, rtbAdapter.getClass().getSimpleName().concat(" does not support interscroller ads."), "com.google.android.gms.ads", null, null));
            } catch (RemoteException e) {
                jn.P("", e);
            }
        } catch (Throwable th) {
            jn.P("Adapter failed to render interscroller ad.", th);
            s90.B(rmVar, th, "adapter.loadRtbInterscrollerAd");
            j7.n();
        }
    }

    @Override // defpackage.s51
    public final x51 d() {
        this.f.getVersionInfo();
        throw null;
    }

    @Override // defpackage.s51
    public final x51 e() {
        this.f.getSDKVersionInfo();
        throw null;
    }

    @Override // defpackage.s51
    public final hv1 f() {
        return null;
    }

    @Override // defpackage.s51
    public final void g2(String str, String str2, f93 f93Var, rm rmVar, g51 g51Var, q41 q41Var) throws RemoteException {
        try {
            zx zxVar = new zx(this, 16, g51Var);
            RtbAdapter rtbAdapter = this.f;
            C3(str2);
            B3(f93Var);
            D3(f93Var);
            E3(str2, f93Var);
            rtbAdapter.loadRtbAppOpenAd(new gr(), zxVar);
        } catch (Throwable th) {
            jn.P("Adapter failed to render app open ad.", th);
            s90.B(rmVar, th, "adapter.loadRtbAppOpenAd");
            j7.n();
        }
    }

    @Override // defpackage.s51
    public final void h2(String str, String str2, f93 f93Var, rm rmVar, q51 q51Var, q41 q41Var) throws RemoteException {
        try {
            s70 s70Var = new s70(this, q51Var);
            RtbAdapter rtbAdapter = this.f;
            C3(str2);
            B3(f93Var);
            D3(f93Var);
            E3(str2, f93Var);
            rtbAdapter.loadRtbRewardedAd(new nr(), s70Var);
        } catch (Throwable th) {
            jn.P("Adapter failed to render rewarded ad.", th);
            s90.B(rmVar, th, "adapter.loadRtbRewardedAd");
            j7.n();
        }
    }

    @Override // defpackage.s51
    public final boolean i2(ju juVar) {
        return false;
    }

    @Override // defpackage.s51
    public final void p3(String str, String str2, f93 f93Var, ju juVar, yx1 yx1Var, q41 q41Var) throws RemoteException {
        M1(str, str2, f93Var, juVar, yx1Var, q41Var, null);
    }

    @Override // defpackage.s51
    public final boolean q0(rm rmVar) {
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0035, code lost:
    
        if (((java.lang.Boolean) defpackage.tu0.e.c.a(defpackage.lx0.Ec)).booleanValue() != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0040, code lost:
    
        if (r3.equals("app_open") != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0049, code lost:
    
        if (r3.equals("interstitial") != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0052, code lost:
    
        if (r3.equals("rewarded") != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005b, code lost:
    
        if (r3.equals("native") != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0064, code lost:
    
        if (r3.equals("banner") != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0066, code lost:
    
        new java.util.ArrayList().add(new defpackage.gm());
        r5 = (android.content.Context) defpackage.ju.Z0(r2);
        new defpackage.s2(r6.f, r6.j, r6.g);
        r1.collectSignals(new defpackage.dy(), r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x008a, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x001a, code lost:
    
        if (r3.equals("rewarded_interstitial") != false) goto L29;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // defpackage.s51
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void q3(defpackage.rm r2, java.lang.String r3, android.os.Bundle r4, android.os.Bundle r5, defpackage.kb3 r6, defpackage.u51 r7) throws android.os.RemoteException {
        /*
            r1 = this;
            ue0 r4 = new ue0     // Catch: java.lang.Throwable -> L38
            r5 = 14
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L38
            com.google.android.gms.ads.mediation.rtb.RtbAdapter r1 = r1.f     // Catch: java.lang.Throwable -> L38
            gm r5 = new gm     // Catch: java.lang.Throwable -> L38
            int r7 = r3.hashCode()     // Catch: java.lang.Throwable -> L38
            switch(r7) {
                case -1396342996: goto L5e;
                case -1052618729: goto L55;
                case -239580146: goto L4c;
                case 604727084: goto L43;
                case 1167692200: goto L3a;
                case 1778294298: goto L1d;
                case 1911491517: goto L14;
                default: goto L12;
            }
        L12:
            goto L8b
        L14:
            java.lang.String r7 = "rewarded_interstitial"
            boolean r3 = r3.equals(r7)
            if (r3 == 0) goto L8b
            goto L66
        L1d:
            java.lang.String r7 = "app_open_ad"
            boolean r3 = r3.equals(r7)
            if (r3 == 0) goto L8b
            ix0 r3 = defpackage.lx0.Ec     // Catch: java.lang.Throwable -> L38
            tu0 r7 = defpackage.tu0.e     // Catch: java.lang.Throwable -> L38
            kx0 r7 = r7.c     // Catch: java.lang.Throwable -> L38
            java.lang.Object r3 = r7.a(r3)     // Catch: java.lang.Throwable -> L38
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch: java.lang.Throwable -> L38
            boolean r3 = r3.booleanValue()     // Catch: java.lang.Throwable -> L38
            if (r3 == 0) goto L8b
            goto L66
        L38:
            r1 = move-exception
            goto L93
        L3a:
            java.lang.String r7 = "app_open"
            boolean r3 = r3.equals(r7)
            if (r3 == 0) goto L8b
            goto L66
        L43:
            java.lang.String r7 = "interstitial"
            boolean r3 = r3.equals(r7)
            if (r3 == 0) goto L8b
            goto L66
        L4c:
            java.lang.String r7 = "rewarded"
            boolean r3 = r3.equals(r7)
            if (r3 == 0) goto L8b
            goto L66
        L55:
            java.lang.String r7 = "native"
            boolean r3 = r3.equals(r7)
            if (r3 == 0) goto L8b
            goto L66
        L5e:
            java.lang.String r7 = "banner"
            boolean r3 = r3.equals(r7)
            if (r3 == 0) goto L8b
        L66:
            r5.<init>()     // Catch: java.lang.Throwable -> L38
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L38
            r3.<init>()     // Catch: java.lang.Throwable -> L38
            r3.add(r5)     // Catch: java.lang.Throwable -> L38
            dy r3 = new dy     // Catch: java.lang.Throwable -> L38
            java.lang.Object r5 = defpackage.ju.Z0(r2)     // Catch: java.lang.Throwable -> L38
            android.content.Context r5 = (android.content.Context) r5     // Catch: java.lang.Throwable -> L38
            int r5 = r6.j     // Catch: java.lang.Throwable -> L38
            int r7 = r6.g     // Catch: java.lang.Throwable -> L38
            java.lang.String r6 = r6.f     // Catch: java.lang.Throwable -> L38
            s2 r0 = new s2     // Catch: java.lang.Throwable -> L38
            r0.<init>(r6, r5, r7)     // Catch: java.lang.Throwable -> L38
            r3.<init>()     // Catch: java.lang.Throwable -> L38
            r1.collectSignals(r3, r4)     // Catch: java.lang.Throwable -> L38
            return
        L8b:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L38
            java.lang.String r3 = "Internal Error"
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L38
            throw r1     // Catch: java.lang.Throwable -> L38
        L93:
            java.lang.String r3 = "Error generating signals for RTB"
            defpackage.jn.P(r3, r1)
            java.lang.String r3 = "adapter.collectSignals"
            defpackage.s90.B(r2, r1, r3)
            defpackage.j7.n()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w51.q3(rm, java.lang.String, android.os.Bundle, android.os.Bundle, kb3, u51):void");
    }

    @Override // defpackage.s51
    public final void z1(String str, String str2, f93 f93Var, rm rmVar, i51 i51Var, q41 q41Var, kb3 kb3Var) throws RemoteException {
        try {
            dr0 dr0Var = new dr0(this, 16, i51Var);
            RtbAdapter rtbAdapter = this.f;
            C3(str2);
            B3(f93Var);
            D3(f93Var);
            E3(str2, f93Var);
            new s2(kb3Var.f, kb3Var.j, kb3Var.g);
            rtbAdapter.loadRtbBannerAd(new hr(), dr0Var);
        } catch (Throwable th) {
            jn.P("Adapter failed to render banner ad.", th);
            s90.B(rmVar, th, "adapter.loadRtbBannerAd");
            j7.n();
        }
    }

    @Override // defpackage.s51
    public final void l1(String str) {
    }
}
