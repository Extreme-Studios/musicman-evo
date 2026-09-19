package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.ads.mediation.AbstractAdViewAdapter;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class b51 extends jt0 implements n41 {
    public final Object f;
    public r52 g;
    public f81 h;
    public rm i;

    public b51() {
        super("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
    }

    public static final boolean D3(f93 f93Var) {
        if (f93Var.k) {
            return true;
        }
        f32 f32Var = ut0.f.a;
        return f32.o();
    }

    public static final String E3(String str, f93 f93Var) {
        try {
            return new JSONObject(str).getString("max_ad_content_rating");
        } catch (JSONException unused) {
            return f93Var.z;
        }
    }

    @Override // defpackage.jt0
    public final boolean A3(int i, Parcel parcel, Parcel parcel2) throws RemoteException {
        f81 d81Var;
        s70 s70Var;
        q41 o41Var = null;
        q41 o41Var2 = null;
        q41 o41Var3 = null;
        q41 o41Var4 = null;
        w21 t21Var = null;
        q41 o41Var5 = null;
        n01Var = null;
        n01 n01Var = null;
        q41 o41Var6 = null;
        f81 d81Var2 = null;
        q41 o41Var7 = null;
        q41 o41Var8 = null;
        q41 o41Var9 = null;
        switch (i) {
            case 1:
                rm rmVarO0 = ju.O0(parcel.readStrongBinder());
                kb3 kb3Var = (kb3) kt0.b(parcel, kb3.CREATOR);
                f93 f93Var = (f93) kt0.b(parcel, f93.CREATOR);
                String string = parcel.readString();
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    o41Var = iInterfaceQueryLocalInterface instanceof q41 ? (q41) iInterfaceQueryLocalInterface : new o41(strongBinder);
                }
                kt0.f(parcel);
                R0(rmVarO0, kb3Var, f93Var, string, null, o41Var);
                parcel2.writeNoException();
                return true;
            case 2:
                rm rmVarD = d();
                parcel2.writeNoException();
                kt0.e(parcel2, rmVarD);
                return true;
            case 3:
                rm rmVarO1 = ju.O0(parcel.readStrongBinder());
                f93 f93Var2 = (f93) kt0.b(parcel, f93.CREATOR);
                String string2 = parcel.readString();
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    o41Var9 = iInterfaceQueryLocalInterface2 instanceof q41 ? (q41) iInterfaceQueryLocalInterface2 : new o41(strongBinder2);
                }
                q41 q41Var = o41Var9;
                kt0.f(parcel);
                B0(rmVarO1, f93Var2, string2, null, q41Var);
                parcel2.writeNoException();
                return true;
            case 4:
                f();
                parcel2.writeNoException();
                return true;
            case 5:
                j();
                parcel2.writeNoException();
                return true;
            case 6:
                rm rmVarO2 = ju.O0(parcel.readStrongBinder());
                kb3 kb3Var2 = (kb3) kt0.b(parcel, kb3.CREATOR);
                f93 f93Var3 = (f93) kt0.b(parcel, f93.CREATOR);
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    o41Var8 = iInterfaceQueryLocalInterface3 instanceof q41 ? (q41) iInterfaceQueryLocalInterface3 : new o41(strongBinder3);
                }
                kt0.f(parcel);
                R0(rmVarO2, kb3Var2, f93Var3, string3, string4, o41Var8);
                parcel2.writeNoException();
                return true;
            case 7:
                rm rmVarO3 = ju.O0(parcel.readStrongBinder());
                f93 f93Var4 = (f93) kt0.b(parcel, f93.CREATOR);
                String string5 = parcel.readString();
                String string6 = parcel.readString();
                IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 != null) {
                    IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    o41Var7 = iInterfaceQueryLocalInterface4 instanceof q41 ? (q41) iInterfaceQueryLocalInterface4 : new o41(strongBinder4);
                }
                q41 q41Var2 = o41Var7;
                kt0.f(parcel);
                B0(rmVarO3, f93Var4, string5, string6, q41Var2);
                parcel2.writeNoException();
                return true;
            case 8:
                i();
                parcel2.writeNoException();
                return true;
            case 9:
                m();
                parcel2.writeNoException();
                return true;
            case 10:
                rm rmVarO4 = ju.O0(parcel.readStrongBinder());
                f93 f93Var5 = (f93) kt0.b(parcel, f93.CREATOR);
                parcel.readString();
                IBinder strongBinder5 = parcel.readStrongBinder();
                if (strongBinder5 != null) {
                    IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
                    d81Var2 = iInterfaceQueryLocalInterface5 instanceof f81 ? (f81) iInterfaceQueryLocalInterface5 : new d81(strongBinder5, "com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener", 2);
                }
                String string7 = parcel.readString();
                kt0.f(parcel);
                v1(rmVarO4, f93Var5, d81Var2, string7);
                parcel2.writeNoException();
                return true;
            case 11:
                f93 f93Var6 = (f93) kt0.b(parcel, f93.CREATOR);
                String string8 = parcel.readString();
                kt0.f(parcel);
                F3(string8, f93Var6);
                parcel2.writeNoException();
                return true;
            case 12:
                S();
                throw null;
            case 13:
                boolean zN = n();
                parcel2.writeNoException();
                ClassLoader classLoader = kt0.a;
                parcel2.writeInt(zN ? 1 : 0);
                return true;
            case 14:
                rm rmVarO5 = ju.O0(parcel.readStrongBinder());
                f93 f93Var7 = (f93) kt0.b(parcel, f93.CREATOR);
                String string9 = parcel.readString();
                String string10 = parcel.readString();
                IBinder strongBinder6 = parcel.readStrongBinder();
                if (strongBinder6 != null) {
                    IInterface iInterfaceQueryLocalInterface6 = strongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    o41Var6 = iInterfaceQueryLocalInterface6 instanceof q41 ? (q41) iInterfaceQueryLocalInterface6 : new o41(strongBinder6);
                }
                q41 q41Var3 = o41Var6;
                qz0 qz0Var = (qz0) kt0.b(parcel, qz0.CREATOR);
                ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
                kt0.f(parcel);
                l3(rmVarO5, f93Var7, string9, string10, q41Var3, qz0Var, arrayListCreateStringArrayList);
                parcel2.writeNoException();
                return true;
            case 15:
                parcel2.writeNoException();
                ClassLoader classLoader2 = kt0.a;
                parcel2.writeStrongBinder(null);
                return true;
            case 16:
                parcel2.writeNoException();
                ClassLoader classLoader3 = kt0.a;
                parcel2.writeStrongBinder(null);
                return true;
            case 17:
                Bundle bundle = new Bundle();
                parcel2.writeNoException();
                kt0.d(parcel2, bundle);
                return true;
            case 18:
                Bundle bundle2 = new Bundle();
                parcel2.writeNoException();
                kt0.d(parcel2, bundle2);
                return true;
            case 19:
                Bundle bundle3 = new Bundle();
                parcel2.writeNoException();
                kt0.d(parcel2, bundle3);
                return true;
            case 20:
                f93 f93Var8 = (f93) kt0.b(parcel, f93.CREATOR);
                String string11 = parcel.readString();
                parcel.readString();
                kt0.f(parcel);
                F3(string11, f93Var8);
                parcel2.writeNoException();
                return true;
            case zw0.zzm /* 21 */:
                rm rmVarO6 = ju.O0(parcel.readStrongBinder());
                kt0.f(parcel);
                l0(rmVarO6);
                parcel2.writeNoException();
                return true;
            case 22:
                parcel2.writeNoException();
                ClassLoader classLoader4 = kt0.a;
                parcel2.writeInt(0);
                return true;
            case 23:
                rm rmVarO7 = ju.O0(parcel.readStrongBinder());
                IBinder strongBinder7 = parcel.readStrongBinder();
                if (strongBinder7 != null) {
                    IInterface iInterfaceQueryLocalInterface7 = strongBinder7.queryLocalInterface("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
                    d81Var = iInterfaceQueryLocalInterface7 instanceof f81 ? (f81) iInterfaceQueryLocalInterface7 : new d81(strongBinder7, "com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener", 2);
                } else {
                    d81Var = null;
                }
                ArrayList<String> arrayListCreateStringArrayList2 = parcel.createStringArrayList();
                kt0.f(parcel);
                W2(rmVarO7, d81Var, arrayListCreateStringArrayList2);
                throw null;
            case 24:
                r52 r52Var = this.g;
                if (r52Var != null && (s70Var = (s70) r52Var.i) != null) {
                    n01Var = (n01) s70Var.g;
                }
                parcel2.writeNoException();
                kt0.e(parcel2, n01Var);
                return true;
            case 25:
                boolean zA = kt0.a(parcel);
                kt0.f(parcel);
                j3(zA);
                parcel2.writeNoException();
                return true;
            case 26:
                hv1 hv1VarB = B();
                parcel2.writeNoException();
                kt0.e(parcel2, hv1VarB);
                return true;
            case 27:
                v41 v41VarE = E();
                parcel2.writeNoException();
                kt0.e(parcel2, v41VarE);
                return true;
            case 28:
                rm rmVarO8 = ju.O0(parcel.readStrongBinder());
                f93 f93Var9 = (f93) kt0.b(parcel, f93.CREATOR);
                String string12 = parcel.readString();
                IBinder strongBinder8 = parcel.readStrongBinder();
                if (strongBinder8 != null) {
                    IInterface iInterfaceQueryLocalInterface8 = strongBinder8.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    o41Var5 = iInterfaceQueryLocalInterface8 instanceof q41 ? (q41) iInterfaceQueryLocalInterface8 : new o41(strongBinder8);
                }
                kt0.f(parcel);
                z0(rmVarO8, f93Var9, string12, o41Var5);
                parcel2.writeNoException();
                return true;
            case 29:
            default:
                return false;
            case 30:
                rm rmVarO9 = ju.O0(parcel.readStrongBinder());
                kt0.f(parcel);
                z3(rmVarO9);
                throw null;
            case 31:
                rm rmVarO10 = ju.O0(parcel.readStrongBinder());
                IBinder strongBinder9 = parcel.readStrongBinder();
                if (strongBinder9 != null) {
                    IInterface iInterfaceQueryLocalInterface9 = strongBinder9.queryLocalInterface("com.google.android.gms.ads.internal.initialization.IAdapterInitializationCallback");
                    t21Var = iInterfaceQueryLocalInterface9 instanceof w21 ? (w21) iInterfaceQueryLocalInterface9 : new t21(strongBinder9, "com.google.android.gms.ads.internal.initialization.IAdapterInitializationCallback", 2);
                }
                ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(z21.CREATOR);
                kt0.f(parcel);
                L0(rmVarO10, t21Var, arrayListCreateTypedArrayList);
                parcel2.writeNoException();
                return true;
            case 32:
                rm rmVarO11 = ju.O0(parcel.readStrongBinder());
                f93 f93Var10 = (f93) kt0.b(parcel, f93.CREATOR);
                String string13 = parcel.readString();
                IBinder strongBinder10 = parcel.readStrongBinder();
                if (strongBinder10 != null) {
                    IInterface iInterfaceQueryLocalInterface10 = strongBinder10.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    o41Var4 = iInterfaceQueryLocalInterface10 instanceof q41 ? (q41) iInterfaceQueryLocalInterface10 : new o41(strongBinder10);
                }
                kt0.f(parcel);
                c3(rmVarO11, f93Var10, string13, o41Var4);
                parcel2.writeNoException();
                return true;
            case 33:
                G();
                parcel2.writeNoException();
                ClassLoader classLoader5 = kt0.a;
                parcel2.writeInt(0);
                return true;
            case 34:
                a3();
                parcel2.writeNoException();
                ClassLoader classLoader6 = kt0.a;
                parcel2.writeInt(0);
                return true;
            case 35:
                rm rmVarO12 = ju.O0(parcel.readStrongBinder());
                kb3 kb3Var3 = (kb3) kt0.b(parcel, kb3.CREATOR);
                f93 f93Var11 = (f93) kt0.b(parcel, f93.CREATOR);
                String string14 = parcel.readString();
                String string15 = parcel.readString();
                IBinder strongBinder11 = parcel.readStrongBinder();
                if (strongBinder11 != null) {
                    IInterface iInterfaceQueryLocalInterface11 = strongBinder11.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    o41Var3 = iInterfaceQueryLocalInterface11 instanceof q41 ? (q41) iInterfaceQueryLocalInterface11 : new o41(strongBinder11);
                }
                kt0.f(parcel);
                s2(rmVarO12, kb3Var3, f93Var11, string14, string15, o41Var3);
                parcel2.writeNoException();
                return true;
            case 36:
                parcel2.writeNoException();
                ClassLoader classLoader7 = kt0.a;
                parcel2.writeStrongBinder(null);
                return true;
            case 37:
                rm rmVarO13 = ju.O0(parcel.readStrongBinder());
                kt0.f(parcel);
                g1(rmVarO13);
                parcel2.writeNoException();
                return true;
            case 38:
                rm rmVarO14 = ju.O0(parcel.readStrongBinder());
                f93 f93Var12 = (f93) kt0.b(parcel, f93.CREATOR);
                String string16 = parcel.readString();
                IBinder strongBinder12 = parcel.readStrongBinder();
                if (strongBinder12 != null) {
                    IInterface iInterfaceQueryLocalInterface12 = strongBinder12.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    o41Var2 = iInterfaceQueryLocalInterface12 instanceof q41 ? (q41) iInterfaceQueryLocalInterface12 : new o41(strongBinder12);
                }
                kt0.f(parcel);
                U0(rmVarO14, f93Var12, string16, o41Var2);
                parcel2.writeNoException();
                return true;
            case 39:
                rm rmVarO15 = ju.O0(parcel.readStrongBinder());
                kt0.f(parcel);
                f3(rmVarO15);
                throw null;
        }
    }

    @Override // defpackage.n41
    public final hv1 B() {
        Object obj = this.f;
        if (obj instanceof AbstractAdViewAdapter) {
            try {
                return ((AbstractAdViewAdapter) obj).getVideoController();
            } catch (Throwable th) {
                jn.P("", th);
            }
        }
        return null;
    }

    @Override // defpackage.n41
    public final void B0(rm rmVar, f93 f93Var, String str, String str2, q41 q41Var) throws RemoteException {
        Object obj = this.f;
        boolean z = obj instanceof MediationInterstitialAdapter;
        if (!z && !(obj instanceof t2)) {
            String canonicalName = MediationInterstitialAdapter.class.getCanonicalName();
            String canonicalName2 = t2.class.getCanonicalName();
            String canonicalName3 = obj.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 4 + String.valueOf(canonicalName2).length() + 22 + String.valueOf(canonicalName3).length());
            ec.x(sb, canonicalName, " or ", canonicalName2, " #009 Class mismatch: ");
            sb.append(canonicalName3);
            jn.T(sb.toString());
            j7.n();
            return;
        }
        jn.F("Requesting interstitial ad from adapter.");
        if (!z) {
            if (obj instanceof t2) {
                try {
                    a51 a51Var = new a51(this, q41Var, 0);
                    B3(str, f93Var, str2);
                    C3(f93Var);
                    D3(f93Var);
                    E3(str, f93Var);
                    ((t2) obj).loadInterstitialAd(new jr(), a51Var);
                    return;
                } catch (Throwable th) {
                    jn.P("", th);
                    s90.B(rmVar, th, "adapter.loadInterstitialAd");
                    j7.n();
                    return;
                }
            }
            return;
        }
        try {
            MediationInterstitialAdapter mediationInterstitialAdapter = (MediationInterstitialAdapter) obj;
            List list = f93Var.j;
            HashSet hashSet = list != null ? new HashSet(list) : null;
            long j = f93Var.g;
            if (j != -1) {
                new Date(j);
            }
            boolean zD3 = D3(f93Var);
            int i = f93Var.l;
            boolean z2 = f93Var.w;
            E3(str, f93Var);
            y41 y41Var = new y41(hashSet, zD3, i, z2);
            Bundle bundle = f93Var.r;
            mediationInterstitialAdapter.requestInterstitialAd((Context) ju.Z0(rmVar), new r52(q41Var), B3(str, f93Var, str2), y41Var, bundle != null ? bundle.getBundle(mediationInterstitialAdapter.getClass().getName()) : null);
        } catch (Throwable th2) {
            jn.P("", th2);
            s90.B(rmVar, th2, "adapter.requestInterstitialAd");
            j7.n();
        }
    }

    public final Bundle B3(String str, f93 f93Var, String str2) throws RemoteException {
        jn.F("Server parameters: ".concat(String.valueOf(str)));
        try {
            Bundle bundle = new Bundle();
            if (str != null) {
                JSONObject jSONObject = new JSONObject(str);
                Bundle bundle2 = new Bundle();
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    bundle2.putString(next, jSONObject.getString(next));
                }
                bundle = bundle2;
            }
            if (this.f instanceof AdMobAdapter) {
                bundle.putString("adJson", str2);
                if (f93Var != null) {
                    bundle.putInt("tagForChildDirectedTreatment", f93Var.l);
                }
            }
            bundle.remove("max_ad_content_rating");
            return bundle;
        } catch (Throwable th) {
            jn.P("", th);
            j7.n();
            return null;
        }
    }

    public final void C3(f93 f93Var) {
        Bundle bundle = f93Var.r;
        if (bundle == null || bundle.getBundle(this.f.getClass().getName()) == null) {
            new Bundle();
        }
    }

    @Override // defpackage.n41
    public final v41 E() {
        r52 r52Var;
        kb0 kb0Var;
        if (!(this.f instanceof MediationNativeAdapter) || (r52Var = this.g) == null || (kb0Var = (kb0) r52Var.h) == null) {
            return null;
        }
        return new e51(kb0Var);
    }

    public final void F3(String str, f93 f93Var) throws RemoteException {
        Object obj = this.f;
        if (obj instanceof t2) {
            z0(this.i, f93Var, str, new c51((t2) obj, this.h));
            return;
        }
        String canonicalName = t2.class.getCanonicalName();
        String canonicalName2 = obj.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb.append(canonicalName);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName2);
        jn.T(sb.toString());
        j7.n();
    }

    @Override // defpackage.n41
    public final x51 G() {
        Object obj = this.f;
        if (!(obj instanceof t2)) {
            return null;
        }
        ((t2) obj).getVersionInfo();
        throw null;
    }

    @Override // defpackage.n41
    public final boolean J() {
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0053  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // defpackage.n41
    public final void L0(rm rmVar, w21 w21Var, ArrayList arrayList) throws RemoteException {
        Object obj = this.f;
        if (!(obj instanceof t2)) {
            j7.n();
            return;
        }
        zf0 zf0Var = new zf0(13);
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj2 = arrayList.get(i);
            i++;
            String str = ((z21) obj2).f;
            int iHashCode = str.hashCode();
            h2 h2Var = null;
            h2 h2Var2 = h2.APP_OPEN_AD;
            switch (iHashCode) {
                case -1396342996:
                    if (str.equals("banner")) {
                        h2Var = h2.BANNER;
                    }
                    break;
                case -1052618729:
                    if (str.equals("native")) {
                        h2Var = h2.NATIVE;
                    }
                    break;
                case -239580146:
                    if (str.equals("rewarded")) {
                        h2Var = h2.REWARDED;
                    }
                    break;
                case 604727084:
                    if (str.equals("interstitial")) {
                        h2Var = h2.INTERSTITIAL;
                    }
                    break;
                case 1167692200:
                    if (str.equals("app_open")) {
                        h2Var = h2Var2;
                    }
                    break;
                case 1778294298:
                    if (str.equals("app_open_ad")) {
                        if (((Boolean) tu0.e.c.a(lx0.Ec)).booleanValue()) {
                            h2Var = h2Var2;
                        }
                    }
                    break;
                case 1911491517:
                    if (str.equals("rewarded_interstitial")) {
                        h2Var = h2.REWARDED_INTERSTITIAL;
                    }
                    break;
            }
            if (h2Var != null) {
                arrayList2.add(new gm());
            }
        }
        ((t2) obj).initialize((Context) ju.Z0(rmVar), zf0Var, arrayList2);
    }

    @Override // defpackage.n41
    public final void R0(rm rmVar, kb3 kb3Var, f93 f93Var, String str, String str2, q41 q41Var) throws RemoteException {
        s2 s2Var;
        Object obj = this.f;
        boolean z = obj instanceof MediationBannerAdapter;
        if (!z && !(obj instanceof t2)) {
            String canonicalName = MediationBannerAdapter.class.getCanonicalName();
            String canonicalName2 = t2.class.getCanonicalName();
            String canonicalName3 = obj.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 4 + String.valueOf(canonicalName2).length() + 22 + String.valueOf(canonicalName3).length());
            ec.x(sb, canonicalName, " or ", canonicalName2, " #009 Class mismatch: ");
            sb.append(canonicalName3);
            jn.T(sb.toString());
            j7.n();
            return;
        }
        jn.F("Requesting banner ad from adapter.");
        boolean z2 = kb3Var.s;
        int i = kb3Var.g;
        int i2 = kb3Var.j;
        if (z2) {
            s2 s2Var2 = new s2(i2, i);
            s2Var2.d = true;
            s2Var2.e = i;
            s2Var = s2Var2;
        } else {
            s2Var = new s2(kb3Var.f, i2, i);
        }
        if (!z) {
            if (obj instanceof t2) {
                try {
                    z41 z41Var = new z41(this, q41Var, 0);
                    B3(str, f93Var, str2);
                    C3(f93Var);
                    D3(f93Var);
                    E3(str, f93Var);
                    ((t2) obj).loadBannerAd(new hr(), z41Var);
                    return;
                } catch (Throwable th) {
                    jn.P("", th);
                    s90.B(rmVar, th, "adapter.loadBannerAd");
                    j7.n();
                    return;
                }
            }
            return;
        }
        try {
            MediationBannerAdapter mediationBannerAdapter = (MediationBannerAdapter) obj;
            List list = f93Var.j;
            HashSet hashSet = list != null ? new HashSet(list) : null;
            long j = f93Var.g;
            if (j != -1) {
                new Date(j);
            }
            boolean zD3 = D3(f93Var);
            int i3 = f93Var.l;
            boolean z3 = f93Var.w;
            E3(str, f93Var);
            y41 y41Var = new y41(hashSet, zD3, i3, z3);
            Bundle bundle = f93Var.r;
            mediationBannerAdapter.requestBannerAd((Context) ju.Z0(rmVar), new r52(q41Var), B3(str, f93Var, str2), s2Var, y41Var, bundle != null ? bundle.getBundle(mediationBannerAdapter.getClass().getName()) : null);
        } catch (Throwable th2) {
            jn.P("", th2);
            s90.B(rmVar, th2, "adapter.requestBannerAd");
            j7.n();
        }
    }

    @Override // defpackage.n41
    public final void S() throws RemoteException {
        Object obj = this.f;
        if (obj instanceof t2) {
            jn.M("Can not show null mediated rewarded ad.");
            throw new RemoteException();
        }
        String canonicalName = t2.class.getCanonicalName();
        String canonicalName2 = obj.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb.append(canonicalName);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName2);
        jn.T(sb.toString());
        throw new RemoteException();
    }

    @Override // defpackage.n41
    public final void U0(rm rmVar, f93 f93Var, String str, q41 q41Var) throws RemoteException {
        Object obj = this.f;
        if (!(obj instanceof t2)) {
            String canonicalName = t2.class.getCanonicalName();
            String canonicalName2 = obj.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
            sb.append(canonicalName);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName2);
            jn.T(sb.toString());
            j7.n();
            return;
        }
        jn.F("Requesting app open ad from adapter.");
        try {
            a51 a51Var = new a51(this, q41Var, 1);
            B3(str, f93Var, null);
            C3(f93Var);
            D3(f93Var);
            E3(str, f93Var);
            ((t2) obj).loadAppOpenAd(new gr(), a51Var);
        } catch (Exception e) {
            jn.P("", e);
            s90.B(rmVar, e, "adapter.loadAppOpenAd");
            j7.n();
        }
    }

    @Override // defpackage.n41
    public final s41 V() {
        return null;
    }

    @Override // defpackage.n41
    public final void V1(String str, f93 f93Var) throws RemoteException {
        F3(str, f93Var);
    }

    @Override // defpackage.n41
    public final void W2(rm rmVar, f81 f81Var, List list) throws RemoteException {
        jn.T("Could not initialize rewarded video adapter.");
        throw new RemoteException();
    }

    @Override // defpackage.n41
    public final r41 a0() {
        return null;
    }

    @Override // defpackage.n41
    public final x51 a3() {
        Object obj = this.f;
        if (!(obj instanceof t2)) {
            return null;
        }
        ((t2) obj).getSDKVersionInfo();
        throw null;
    }

    @Override // defpackage.n41
    public final void c3(rm rmVar, f93 f93Var, String str, q41 q41Var) throws RemoteException {
        Object obj = this.f;
        if (!(obj instanceof t2)) {
            String canonicalName = t2.class.getCanonicalName();
            String canonicalName2 = obj.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
            sb.append(canonicalName);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName2);
            jn.T(sb.toString());
            j7.n();
            return;
        }
        jn.F("Requesting rewarded interstitial ad from adapter.");
        try {
            z41 z41Var = new z41(this, q41Var, 1);
            B3(str, f93Var, null);
            C3(f93Var);
            D3(f93Var);
            E3(str, f93Var);
            ((t2) obj).loadRewardedInterstitialAd(new nr(), z41Var);
        } catch (Exception e) {
            s90.B(rmVar, e, "adapter.loadRewardedInterstitialAd");
            j7.n();
        }
    }

    @Override // defpackage.n41
    public final rm d() throws RemoteException {
        Object obj = this.f;
        if (obj instanceof MediationBannerAdapter) {
            try {
                return new ju(((MediationBannerAdapter) obj).getBannerView());
            } catch (Throwable th) {
                jn.P("", th);
                j7.n();
                return null;
            }
        }
        if (obj instanceof t2) {
            return new ju(null);
        }
        String canonicalName = MediationBannerAdapter.class.getCanonicalName();
        String canonicalName2 = t2.class.getCanonicalName();
        String canonicalName3 = obj.getClass().getCanonicalName();
        int length = String.valueOf(canonicalName).length();
        StringBuilder sb = new StringBuilder(length + 4 + String.valueOf(canonicalName2).length() + 22 + String.valueOf(canonicalName3).length());
        ec.x(sb, canonicalName, " or ", canonicalName2, " #009 Class mismatch: ");
        sb.append(canonicalName3);
        jn.T(sb.toString());
        j7.n();
        return null;
    }

    @Override // defpackage.n41
    public final t41 e0() {
        return null;
    }

    @Override // defpackage.n41
    public final void f() throws RemoteException {
        Object obj = this.f;
        if (obj instanceof MediationInterstitialAdapter) {
            jn.F("Showing interstitial from adapter.");
            try {
                ((MediationInterstitialAdapter) obj).showInterstitial();
                return;
            } catch (Throwable th) {
                jn.P("", th);
                j7.n();
                return;
            }
        }
        String canonicalName = MediationInterstitialAdapter.class.getCanonicalName();
        String canonicalName2 = obj.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb.append(canonicalName);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName2);
        jn.T(sb.toString());
        j7.n();
    }

    @Override // defpackage.n41
    public final void f3(rm rmVar) throws RemoteException {
        Object obj = this.f;
        if (obj instanceof t2) {
            jn.F("Show app open ad from adapter.");
            jn.M("Can not show null mediation app open ad.");
            throw new RemoteException();
        }
        String canonicalName = t2.class.getCanonicalName();
        String canonicalName2 = obj.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb.append(canonicalName);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName2);
        jn.T(sb.toString());
        throw new RemoteException();
    }

    @Override // defpackage.n41
    public final void g1(rm rmVar) throws RemoteException {
        Object obj = this.f;
        if ((obj instanceof t2) || (obj instanceof MediationInterstitialAdapter)) {
            if (obj instanceof MediationInterstitialAdapter) {
                f();
                return;
            }
            jn.F("Show interstitial ad from adapter.");
            jn.M("Can not show null mediation interstitial ad.");
            j7.n();
            return;
        }
        String canonicalName = MediationInterstitialAdapter.class.getCanonicalName();
        String canonicalName2 = t2.class.getCanonicalName();
        String canonicalName3 = obj.getClass().getCanonicalName();
        int length = String.valueOf(canonicalName).length();
        StringBuilder sb = new StringBuilder(length + 4 + String.valueOf(canonicalName2).length() + 22 + String.valueOf(canonicalName3).length());
        ec.x(sb, canonicalName, " or ", canonicalName2, " #009 Class mismatch: ");
        sb.append(canonicalName3);
        jn.T(sb.toString());
        j7.n();
    }

    @Override // defpackage.n41
    public final void i() throws RemoteException {
        Object obj = this.f;
        if (obj instanceof fr) {
            try {
                ((fr) obj).onPause();
            } catch (Throwable th) {
                jn.P("", th);
                j7.n();
            }
        }
    }

    @Override // defpackage.n41
    public final void j() throws RemoteException {
        Object obj = this.f;
        if (obj instanceof fr) {
            try {
                ((fr) obj).onDestroy();
            } catch (Throwable th) {
                jn.P("", th);
                j7.n();
            }
        }
    }

    @Override // defpackage.n41
    public final void j3(boolean z) {
        Object obj = this.f;
        if (obj instanceof AbstractAdViewAdapter) {
            try {
                ((AbstractAdViewAdapter) obj).onImmersiveModeUpdated(z);
                return;
            } catch (Throwable th) {
                jn.P("", th);
                return;
            }
        }
        String canonicalName = AbstractAdViewAdapter.class.getCanonicalName();
        String canonicalName2 = obj.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb.append(canonicalName);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName2);
        jn.F(sb.toString());
    }

    @Override // defpackage.n41
    public final void l0(rm rmVar) {
    }

    @Override // defpackage.n41
    public final void l3(rm rmVar, f93 f93Var, String str, String str2, q41 q41Var, qz0 qz0Var, ArrayList arrayList) throws RemoteException {
        Object obj = this.f;
        boolean z = obj instanceof MediationNativeAdapter;
        if (!z && !(obj instanceof t2)) {
            String canonicalName = MediationNativeAdapter.class.getCanonicalName();
            String canonicalName2 = t2.class.getCanonicalName();
            String canonicalName3 = obj.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 4 + String.valueOf(canonicalName2).length() + 22 + String.valueOf(canonicalName3).length());
            ec.x(sb, canonicalName, " or ", canonicalName2, " #009 Class mismatch: ");
            sb.append(canonicalName3);
            jn.T(sb.toString());
            j7.n();
            return;
        }
        jn.F("Requesting native ad from adapter.");
        if (z) {
            try {
                MediationNativeAdapter mediationNativeAdapter = (MediationNativeAdapter) obj;
                List list = f93Var.j;
                HashSet hashSet = list != null ? new HashSet(list) : null;
                long j = f93Var.g;
                if (j != -1) {
                    new Date(j);
                }
                boolean zD3 = D3(f93Var);
                int i = f93Var.l;
                boolean z2 = f93Var.w;
                E3(str, f93Var);
                d51 d51Var = new d51(hashSet, zD3, i, qz0Var, arrayList, z2);
                Bundle bundle = f93Var.r;
                Bundle bundle2 = bundle != null ? bundle.getBundle(mediationNativeAdapter.getClass().getName()) : null;
                this.g = new r52(q41Var);
                mediationNativeAdapter.requestNativeAd((Context) ju.Z0(rmVar), this.g, B3(str, f93Var, str2), d51Var, bundle2);
                return;
            } catch (Throwable th) {
                jn.P("", th);
                s90.B(rmVar, th, "adapter.requestNativeAd");
                j7.n();
                return;
            }
        }
        if (obj instanceof t2) {
            try {
                z61 z61Var = new z61((Object) this, (Object) q41Var, 12, false);
                B3(str, f93Var, str2);
                C3(f93Var);
                D3(f93Var);
                E3(str, f93Var);
                ((t2) obj).loadNativeAdMapper(new lr(), z61Var);
            } catch (Throwable th2) {
                jn.P("", th2);
                s90.B(rmVar, th2, "adapter.loadNativeAdMapper");
                String message = th2.getMessage();
                if (TextUtils.isEmpty(message) || !message.equals("Method is not found")) {
                    j7.n();
                    return;
                }
                try {
                    us2 us2Var = new us2(this, 11, q41Var);
                    B3(str, f93Var, str2);
                    C3(f93Var);
                    D3(f93Var);
                    E3(str, f93Var);
                    ((t2) obj).loadNativeAd(new lr(), us2Var);
                } catch (Throwable th3) {
                    jn.P("", th3);
                    s90.B(rmVar, th3, "adapter.loadNativeAd");
                    j7.n();
                }
            }
        }
    }

    @Override // defpackage.n41
    public final void m() throws RemoteException {
        Object obj = this.f;
        if (obj instanceof fr) {
            try {
                ((fr) obj).onResume();
            } catch (Throwable th) {
                jn.P("", th);
                j7.n();
            }
        }
    }

    @Override // defpackage.n41
    public final boolean n() throws RemoteException {
        Object obj = this.f;
        if ((obj instanceof t2) || Objects.equals(obj.getClass().getCanonicalName(), "com.google.ads.mediation.admob.AdMobAdapter")) {
            return this.h != null;
        }
        String canonicalName = t2.class.getCanonicalName();
        String canonicalName2 = obj.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb.append(canonicalName);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName2);
        jn.T(sb.toString());
        j7.n();
        return false;
    }

    @Override // defpackage.n41
    public final void s2(rm rmVar, kb3 kb3Var, f93 f93Var, String str, String str2, q41 q41Var) throws RemoteException {
        Object obj = this.f;
        if (!(obj instanceof t2)) {
            String canonicalName = t2.class.getCanonicalName();
            String canonicalName2 = obj.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
            sb.append(canonicalName);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName2);
            jn.T(sb.toString());
            j7.n();
            return;
        }
        jn.F("Requesting interscroller ad from adapter.");
        try {
            t2 t2Var = (t2) obj;
            z61 z61Var = new z61(this, q41Var, t2Var, 11);
            B3(str, f93Var, str2);
            C3(f93Var);
            D3(f93Var);
            E3(str, f93Var);
            int i = kb3Var.j;
            int i2 = kb3Var.g;
            s2 s2Var = new s2(i, i2);
            s2Var.f = true;
            s2Var.g = i2;
            z61Var.A(new g2(7, t2Var.getClass().getSimpleName().concat(" does not support interscroller ads."), "com.google.android.gms.ads", (g2) null));
        } catch (Exception e) {
            jn.P("", e);
            s90.B(rmVar, e, "adapter.loadInterscrollerAd");
            j7.n();
        }
    }

    @Override // defpackage.n41
    public final void v1(rm rmVar, f93 f93Var, f81 f81Var, String str) throws RemoteException {
        Object obj = this.f;
        if ((obj instanceof t2) || Objects.equals(obj.getClass().getCanonicalName(), "com.google.ads.mediation.admob.AdMobAdapter")) {
            this.i = rmVar;
            this.h = f81Var;
            f81Var.X1(new ju(obj));
            return;
        }
        String canonicalName = t2.class.getCanonicalName();
        String canonicalName2 = obj.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb.append(canonicalName);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName2);
        jn.T(sb.toString());
        j7.n();
    }

    @Override // defpackage.n41
    public final void z0(rm rmVar, f93 f93Var, String str, q41 q41Var) throws RemoteException {
        Object obj = this.f;
        if (!(obj instanceof t2)) {
            String canonicalName = t2.class.getCanonicalName();
            String canonicalName2 = obj.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
            sb.append(canonicalName);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName2);
            jn.T(sb.toString());
            j7.n();
            return;
        }
        jn.F("Requesting rewarded ad from adapter.");
        try {
            z41 z41Var = new z41(this, q41Var, 1);
            B3(str, f93Var, null);
            C3(f93Var);
            D3(f93Var);
            E3(str, f93Var);
            ((t2) obj).loadRewardedAd(new nr(), z41Var);
        } catch (Exception e) {
            jn.P("", e);
            s90.B(rmVar, e, "adapter.loadRewardedAd");
            j7.n();
        }
    }

    @Override // defpackage.n41
    public final void z3(rm rmVar) throws RemoteException {
        Object obj = this.f;
        if (obj instanceof t2) {
            jn.F("Show rewarded ad from adapter.");
            jn.M("Can not show null mediation rewarded ad.");
            throw new RemoteException();
        }
        String canonicalName = t2.class.getCanonicalName();
        String canonicalName2 = obj.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb.append(canonicalName);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName2);
        jn.T(sb.toString());
        throw new RemoteException();
    }

    public b51(t2 t2Var) {
        this();
        this.f = t2Var;
    }

    public b51(fr frVar) {
        this();
        this.f = frVar;
    }
}
