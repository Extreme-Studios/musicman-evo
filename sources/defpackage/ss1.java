package defpackage;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.text.TextUtils;
import android.util.JsonReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class ss1 extends jt0 {
    public final qf1 f;
    public final kc2 g;
    public final HashMap h;

    public ss1(qf1 qf1Var, kc2 kc2Var) {
        super("com.google.android.gms.ads.internal.h5.client.IH5AdsManager");
        this.h = new HashMap();
        this.f = qf1Var;
        this.g = kc2Var;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static f93 B3(HashMap map) {
        int i;
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        ArrayList arrayList = new ArrayList();
        Bundle bundle3 = new Bundle();
        Bundle bundle4 = new Bundle();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        String str = (String) map.get("ad_request");
        boolean zNextBoolean = false;
        int i2 = -1;
        String str2 = null;
        int iNextInt = 60000;
        if (str == null) {
            return new f93(8, -1L, bundle2, -1, arrayList, false, -1, false, null, null, null, null, bundle3, bundle4, arrayList2, null, null, false, null, -1, null, arrayList3, 60000, null, 0, 0L, 0L);
        }
        JsonReader jsonReader = new JsonReader(new StringReader(Uri.decode(str)));
        try {
            jsonReader.beginObject();
            i = -1;
            while (jsonReader.hasNext()) {
                try {
                    String strNextName = jsonReader.nextName();
                    switch (strNextName.hashCode()) {
                        case -1289032093:
                            if (!strNextName.equals("extras")) {
                                jsonReader.skipValue();
                            } else {
                                jsonReader.beginObject();
                                Bundle bundle5 = new Bundle();
                                while (jsonReader.hasNext()) {
                                    bundle5.putString(jsonReader.nextName(), jsonReader.nextString());
                                }
                                jsonReader.endObject();
                                bundle2 = bundle5;
                            }
                            break;
                        case -839117230:
                            if (!strNextName.equals("isTestDevice")) {
                                jsonReader.skipValue();
                            } else {
                                zNextBoolean = jsonReader.nextBoolean();
                            }
                            break;
                        case -733436947:
                            if (!strNextName.equals("tagForUnderAgeOfConsent")) {
                                jsonReader.skipValue();
                            } else if (!jsonReader.nextBoolean()) {
                                i = 0;
                            } else {
                                i = 1;
                            }
                            break;
                        case -99890337:
                            if (!strNextName.equals("httpTimeoutMillis")) {
                                jsonReader.skipValue();
                            } else {
                                iNextInt = jsonReader.nextInt();
                            }
                            break;
                        case 523149226:
                            if (!strNextName.equals("keywords")) {
                                jsonReader.skipValue();
                            } else {
                                jsonReader.beginArray();
                                ArrayList arrayList4 = new ArrayList();
                                while (jsonReader.hasNext()) {
                                    arrayList4.add(jsonReader.nextString());
                                }
                                jsonReader.endArray();
                                arrayList = arrayList4;
                            }
                            break;
                        case 597632527:
                            if (!strNextName.equals("maxAdContentRating")) {
                                jsonReader.skipValue();
                            } else {
                                String strNextString = jsonReader.nextString();
                                if (cx.b.contains(strNextString)) {
                                    str2 = strNextString;
                                }
                            }
                            break;
                        case 1411582723:
                            if (!strNextName.equals("tagForChildDirectedTreatment")) {
                                jsonReader.skipValue();
                            } else if (!jsonReader.nextBoolean()) {
                                i2 = 0;
                            } else {
                                i2 = 1;
                            }
                            break;
                        default:
                            jsonReader.skipValue();
                            break;
                    }
                } catch (IOException unused) {
                    jn.F("Ad Request json was malformed, parsing ended early.");
                }
            }
            jsonReader.endObject();
        } catch (IOException unused2) {
            i = -1;
        }
        int i3 = i;
        ArrayList arrayList5 = arrayList;
        String str3 = str2;
        int i4 = iNextInt;
        new Bundle();
        Bundle bundle6 = bundle3.getBundle("com.google.ads.mediation.admob.AdMobAdapter");
        if (bundle6 == null) {
            bundle3.putBundle("com.google.ads.mediation.admob.AdMobAdapter", bundle2);
            bundle = bundle2;
        } else {
            bundle = bundle6;
        }
        return new f93(8, -1L, bundle, -1, arrayList5, zNextBoolean, i2, false, null, null, null, null, bundle3, bundle4, arrayList2, null, null, false, null, i3, str3, arrayList3, i4, null, 0, 0L, 0L);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:31:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:36:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:38:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:40:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:41:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:43:0x0109  */
    /* JADX WARN: Code duplicated, block: B:44:0x0111  */
    /* JADX WARN: Code duplicated, block: B:46:0x011e  */
    /* JADX WARN: Code duplicated, block: B:47:0x0126  */
    /* JADX WARN: Code duplicated, block: B:48:0x017c  */
    /* JADX WARN: Code duplicated, block: B:50:0x0184  */
    /* JADX WARN: Code duplicated, block: B:52:0x0190  */
    /* JADX WARN: Code duplicated, block: B:53:0x0197  */
    /* JADX WARN: Code duplicated, block: B:54:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:56:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:58:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:59:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:60:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:62:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:64:0x020e  */
    /* JADX WARN: Code duplicated, block: B:65:0x0216  */
    /* JADX WARN: Code duplicated, block: B:67:0x0220  */
    /* JADX WARN: Code duplicated, block: B:68:0x0228  */
    /* JADX WARN: Code duplicated, block: B:70:0x0235  */
    /* JADX WARN: Code duplicated, block: B:71:0x023d  */
    /* JADX WARN: Code duplicated, block: B:72:0x0290  */
    /* JADX WARN: Code duplicated, block: B:74:0x0298  */
    /* JADX WARN: Code duplicated, block: B:76:0x02a4  */
    /* JADX WARN: Code duplicated, block: B:77:0x02bc  */
    /* JADX WARN: Code duplicated, block: B:78:0x02c5  */
    /* JADX WARN: Code duplicated, block: B:80:0x02cd  */
    /* JADX WARN: Code duplicated, block: B:82:0x02d9  */
    /* JADX WARN: Code duplicated, block: B:83:0x02f0  */
    /* JADX WARN: Code duplicated, block: B:84:0x02f4  */
    /* JADX WARN: Code duplicated, block: B:86:0x02fc  */
    /* JADX WARN: Code duplicated, block: B:88:0x0308  */
    /* JADX WARN: Code duplicated, block: B:89:0x031f  */
    /* JADX WARN: Code duplicated, block: B:90:0x0323  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // defpackage.jt0
    public final boolean A3(int i, Parcel parcel, Parcel parcel2) {
        String str;
        boolean z;
        long j;
        int iHashCode;
        qf1 qf1Var;
        qs1 qs1Var;
        qs1 qs1Var2;
        qs1 qs1Var3;
        Long lValueOf;
        String str2;
        qs1 qs1Var4;
        Long lValueOf2;
        qs1 qs1Var5;
        Long lValueOf3;
        String str3;
        HashMap map = this.h;
        if (i == 1) {
            String string = parcel.readString();
            kt0.f(parcel);
            ix0 ix0Var = lx0.Ka;
            kx0 kx0Var = tu0.e.c;
            if (((Boolean) kx0Var.a(ix0Var)).booleanValue()) {
                jn.p("Received H5 gmsg: ".concat(String.valueOf(string)));
                Uri uri = Uri.parse(string);
                zb3 zb3Var = vc3.C.c;
                HashMap mapO = zb3.o(uri);
                String str4 = (String) mapO.get("action");
                if (!TextUtils.isEmpty(str4)) {
                    int iHashCode2 = str4.hashCode();
                    kc2 kc2Var = this.g;
                    if (iHashCode2 == 579053441) {
                        if (!str4.equals("dispose_all")) {
                            str = (String) mapO.get("obj_id");
                            Objects.requireNonNull(str);
                            j = Long.parseLong(str);
                            iHashCode = str4.hashCode();
                            z = true;
                            qf1Var = this.f;
                            switch (iHashCode) {
                                case -1790951212:
                                    if (str4.equals("show_interstitial_ad")) {
                                        jn.F("H5 gmsg contained invalid action: ".concat(str4));
                                    } else {
                                        qs1Var = (qs1) map.get(Long.valueOf(j));
                                        if (qs1Var == null) {
                                            qs1Var.c();
                                        } else {
                                            jn.F("Could not show H5 ad, object ID does not exist");
                                            kc2Var.getClass();
                                            es0 es0Var = new es0("interstitial");
                                            es0Var.f = Long.valueOf(j);
                                            es0Var.h = "onNativeAdObjectNotAvailable";
                                            kc2Var.r(es0Var);
                                        }
                                    }
                                    break;
                                case -1266374734:
                                    if (str4.equals("show_rewarded_ad")) {
                                        jn.F("H5 gmsg contained invalid action: ".concat(str4));
                                    } else {
                                        qs1Var2 = (qs1) map.get(Long.valueOf(j));
                                        if (qs1Var2 == null) {
                                            qs1Var2.c();
                                        } else {
                                            jn.F("Could not show H5 ad, object ID does not exist");
                                            kc2Var.getClass();
                                            es0 es0Var2 = new es0("rewarded");
                                            es0Var2.f = Long.valueOf(j);
                                            es0Var2.h = "onNativeAdObjectNotAvailable";
                                            kc2Var.r(es0Var2);
                                        }
                                    }
                                    break;
                                case -257098725:
                                    if (str4.equals("load_rewarded_ad")) {
                                        jn.F("H5 gmsg contained invalid action: ".concat(str4));
                                    } else {
                                        qs1Var3 = (qs1) map.get(Long.valueOf(j));
                                        if (qs1Var3 == null) {
                                            qs1Var3.a(B3(mapO));
                                        } else {
                                            jn.F("Could not load H5 ad, object ID does not exist");
                                            kc2Var.getClass();
                                            es0 es0Var3 = new es0("rewarded");
                                            es0Var3.f = Long.valueOf(j);
                                            es0Var3.h = "onNativeAdObjectNotAvailable";
                                            kc2Var.r(es0Var3);
                                        }
                                    }
                                    break;
                                case 393881811:
                                    if (str4.equals("create_interstitial_ad")) {
                                        jn.F("H5 gmsg contained invalid action: ".concat(str4));
                                    } else if (map.size() >= ((Integer) kx0Var.a(lx0.La)).intValue()) {
                                        lValueOf = Long.valueOf(j);
                                        if (map.containsKey(lValueOf)) {
                                            str2 = (String) mapO.get("ad_unit");
                                            if (TextUtils.isEmpty(str2)) {
                                                if1 if1Var = qf1Var.c;
                                                qf1 qf1Var2 = qf1Var.d;
                                                str2.getClass();
                                                map.put(lValueOf, new ws1(j, qf1Var2.a, new kc2(24, qf1Var2.b), if1Var, str2));
                                                kc2Var.getClass();
                                                es0 es0Var4 = new es0("creation");
                                                es0Var4.f = Long.valueOf(j);
                                                es0Var4.h = "nativeObjectCreated";
                                                kc2Var.r(es0Var4);
                                                StringBuilder sb = new StringBuilder(String.valueOf(j).length() + 39 + str2.length());
                                                ec.w(sb, "Created H5 interstitial #", j, " with ad unit ");
                                                sb.append(str2);
                                                jn.p(sb.toString());
                                            } else {
                                                jn.T("Could not create H5 ad, missing ad unit id");
                                                kc2Var.q(j);
                                            }
                                        } else {
                                            jn.F("Could not create H5 ad, object ID already exists");
                                            kc2Var.q(j);
                                        }
                                    } else {
                                        jn.T("Could not create H5 ad, too many existing objects");
                                        kc2Var.q(j);
                                    }
                                    break;
                                case 585513149:
                                    if (str4.equals("load_interstitial_ad")) {
                                        jn.F("H5 gmsg contained invalid action: ".concat(str4));
                                    } else {
                                        qs1Var4 = (qs1) map.get(Long.valueOf(j));
                                        if (qs1Var4 == null) {
                                            qs1Var4.a(B3(mapO));
                                        } else {
                                            jn.F("Could not load H5 ad, object ID does not exist");
                                            kc2Var.getClass();
                                            es0 es0Var5 = new es0("interstitial");
                                            es0Var5.f = Long.valueOf(j);
                                            es0Var5.h = "onNativeAdObjectNotAvailable";
                                            kc2Var.r(es0Var5);
                                        }
                                    }
                                    break;
                                case 1671767583:
                                    if (str4.equals("dispose")) {
                                        jn.F("H5 gmsg contained invalid action: ".concat(str4));
                                    } else {
                                        lValueOf2 = Long.valueOf(j);
                                        qs1Var5 = (qs1) map.get(lValueOf2);
                                        if (qs1Var5 == null) {
                                            qs1Var5.h();
                                            map.remove(lValueOf2);
                                            StringBuilder sb2 = new StringBuilder(String.valueOf(j).length() + 16);
                                            sb2.append("Disposed H5 ad #");
                                            sb2.append(j);
                                            jn.p(sb2.toString());
                                        } else {
                                            jn.F("Could not dispose H5 ad, object ID does not exist");
                                        }
                                    }
                                    break;
                                case 2109237041:
                                    if (str4.equals("create_rewarded_ad")) {
                                        jn.F("H5 gmsg contained invalid action: ".concat(str4));
                                    } else if (map.size() >= ((Integer) kx0Var.a(lx0.La)).intValue()) {
                                        lValueOf3 = Long.valueOf(j);
                                        if (map.containsKey(lValueOf3)) {
                                            str3 = (String) mapO.get("ad_unit");
                                            if (TextUtils.isEmpty(str3)) {
                                                if1 if1Var2 = qf1Var.c;
                                                qf1 qf1Var3 = qf1Var.d;
                                                str3.getClass();
                                                map.put(lValueOf3, new zs1(j, qf1Var3.a, new kc2(24, qf1Var3.b), if1Var2, str3));
                                                kc2Var.getClass();
                                                es0 es0Var6 = new es0("creation");
                                                es0Var6.f = Long.valueOf(j);
                                                es0Var6.h = "nativeObjectCreated";
                                                kc2Var.r(es0Var6);
                                                StringBuilder sb3 = new StringBuilder(String.valueOf(j).length() + 35 + str3.length());
                                                ec.w(sb3, "Created H5 rewarded #", j, " with ad unit ");
                                                sb3.append(str3);
                                                jn.p(sb3.toString());
                                            } else {
                                                jn.T("Could not create H5 ad, missing ad unit id");
                                                kc2Var.q(j);
                                            }
                                        } else {
                                            jn.F("Could not create H5 ad, object ID already exists");
                                            kc2Var.q(j);
                                        }
                                    } else {
                                        jn.T("Could not create H5 ad, too many existing objects");
                                        kc2Var.q(j);
                                    }
                                    break;
                                default:
                                    jn.F("H5 gmsg contained invalid action: ".concat(str4));
                                    break;
                            }
                        } else {
                            Iterator it = map.values().iterator();
                            while (it.hasNext()) {
                                ((qs1) it.next()).h();
                            }
                            map.clear();
                        }
                    } else if (iHashCode2 == 871091088 && str4.equals("initialize")) {
                        map.clear();
                        kc2Var.getClass();
                        kc2Var.r(new es0("initialize"));
                    } else {
                        str = (String) mapO.get("obj_id");
                        try {
                            Objects.requireNonNull(str);
                            j = Long.parseLong(str);
                            iHashCode = str4.hashCode();
                            z = true;
                            qf1Var = this.f;
                            switch (iHashCode) {
                                case -1790951212:
                                    if (str4.equals("show_interstitial_ad")) {
                                        jn.F("H5 gmsg contained invalid action: ".concat(str4));
                                    } else {
                                        qs1Var = (qs1) map.get(Long.valueOf(j));
                                        if (qs1Var == null) {
                                            qs1Var.c();
                                        } else {
                                            jn.F("Could not show H5 ad, object ID does not exist");
                                            kc2Var.getClass();
                                            es0 es0Var7 = new es0("interstitial");
                                            es0Var7.f = Long.valueOf(j);
                                            es0Var7.h = "onNativeAdObjectNotAvailable";
                                            kc2Var.r(es0Var7);
                                        }
                                    }
                                    break;
                                case -1266374734:
                                    if (str4.equals("show_rewarded_ad")) {
                                        jn.F("H5 gmsg contained invalid action: ".concat(str4));
                                    } else {
                                        qs1Var2 = (qs1) map.get(Long.valueOf(j));
                                        if (qs1Var2 == null) {
                                            qs1Var2.c();
                                        } else {
                                            jn.F("Could not show H5 ad, object ID does not exist");
                                            kc2Var.getClass();
                                            es0 es0Var8 = new es0("rewarded");
                                            es0Var8.f = Long.valueOf(j);
                                            es0Var8.h = "onNativeAdObjectNotAvailable";
                                            kc2Var.r(es0Var8);
                                        }
                                    }
                                    break;
                                case -257098725:
                                    if (str4.equals("load_rewarded_ad")) {
                                        jn.F("H5 gmsg contained invalid action: ".concat(str4));
                                    } else {
                                        qs1Var3 = (qs1) map.get(Long.valueOf(j));
                                        if (qs1Var3 == null) {
                                            qs1Var3.a(B3(mapO));
                                        } else {
                                            jn.F("Could not load H5 ad, object ID does not exist");
                                            kc2Var.getClass();
                                            es0 es0Var9 = new es0("rewarded");
                                            es0Var9.f = Long.valueOf(j);
                                            es0Var9.h = "onNativeAdObjectNotAvailable";
                                            kc2Var.r(es0Var9);
                                        }
                                    }
                                    break;
                                case 393881811:
                                    if (str4.equals("create_interstitial_ad")) {
                                        jn.F("H5 gmsg contained invalid action: ".concat(str4));
                                    } else if (map.size() >= ((Integer) kx0Var.a(lx0.La)).intValue()) {
                                        lValueOf = Long.valueOf(j);
                                        if (map.containsKey(lValueOf)) {
                                            str2 = (String) mapO.get("ad_unit");
                                            if (TextUtils.isEmpty(str2)) {
                                                if1 if1Var3 = qf1Var.c;
                                                qf1 qf1Var4 = qf1Var.d;
                                                str2.getClass();
                                                map.put(lValueOf, new ws1(j, qf1Var4.a, new kc2(24, qf1Var4.b), if1Var3, str2));
                                                kc2Var.getClass();
                                                es0 es0Var10 = new es0("creation");
                                                es0Var10.f = Long.valueOf(j);
                                                es0Var10.h = "nativeObjectCreated";
                                                kc2Var.r(es0Var10);
                                                StringBuilder sb4 = new StringBuilder(String.valueOf(j).length() + 39 + str2.length());
                                                ec.w(sb4, "Created H5 interstitial #", j, " with ad unit ");
                                                sb4.append(str2);
                                                jn.p(sb4.toString());
                                            } else {
                                                jn.T("Could not create H5 ad, missing ad unit id");
                                                kc2Var.q(j);
                                            }
                                        } else {
                                            jn.F("Could not create H5 ad, object ID already exists");
                                            kc2Var.q(j);
                                        }
                                    } else {
                                        jn.T("Could not create H5 ad, too many existing objects");
                                        kc2Var.q(j);
                                    }
                                    break;
                                case 585513149:
                                    if (str4.equals("load_interstitial_ad")) {
                                        jn.F("H5 gmsg contained invalid action: ".concat(str4));
                                    } else {
                                        qs1Var4 = (qs1) map.get(Long.valueOf(j));
                                        if (qs1Var4 == null) {
                                            qs1Var4.a(B3(mapO));
                                        } else {
                                            jn.F("Could not load H5 ad, object ID does not exist");
                                            kc2Var.getClass();
                                            es0 es0Var11 = new es0("interstitial");
                                            es0Var11.f = Long.valueOf(j);
                                            es0Var11.h = "onNativeAdObjectNotAvailable";
                                            kc2Var.r(es0Var11);
                                        }
                                    }
                                    break;
                                case 1671767583:
                                    if (str4.equals("dispose")) {
                                        jn.F("H5 gmsg contained invalid action: ".concat(str4));
                                    } else {
                                        lValueOf2 = Long.valueOf(j);
                                        qs1Var5 = (qs1) map.get(lValueOf2);
                                        if (qs1Var5 == null) {
                                            qs1Var5.h();
                                            map.remove(lValueOf2);
                                            StringBuilder sb5 = new StringBuilder(String.valueOf(j).length() + 16);
                                            sb5.append("Disposed H5 ad #");
                                            sb5.append(j);
                                            jn.p(sb5.toString());
                                        } else {
                                            jn.F("Could not dispose H5 ad, object ID does not exist");
                                        }
                                    }
                                    break;
                                case 2109237041:
                                    if (str4.equals("create_rewarded_ad")) {
                                        jn.F("H5 gmsg contained invalid action: ".concat(str4));
                                    } else if (map.size() >= ((Integer) kx0Var.a(lx0.La)).intValue()) {
                                        lValueOf3 = Long.valueOf(j);
                                        if (map.containsKey(lValueOf3)) {
                                            str3 = (String) mapO.get("ad_unit");
                                            if (TextUtils.isEmpty(str3)) {
                                                if1 if1Var4 = qf1Var.c;
                                                qf1 qf1Var5 = qf1Var.d;
                                                str3.getClass();
                                                map.put(lValueOf3, new zs1(j, qf1Var5.a, new kc2(24, qf1Var5.b), if1Var4, str3));
                                                kc2Var.getClass();
                                                es0 es0Var12 = new es0("creation");
                                                es0Var12.f = Long.valueOf(j);
                                                es0Var12.h = "nativeObjectCreated";
                                                kc2Var.r(es0Var12);
                                                StringBuilder sb6 = new StringBuilder(String.valueOf(j).length() + 35 + str3.length());
                                                ec.w(sb6, "Created H5 rewarded #", j, " with ad unit ");
                                                sb6.append(str3);
                                                jn.p(sb6.toString());
                                            } else {
                                                jn.T("Could not create H5 ad, missing ad unit id");
                                                kc2Var.q(j);
                                            }
                                        } else {
                                            jn.F("Could not create H5 ad, object ID already exists");
                                            kc2Var.q(j);
                                        }
                                    } else {
                                        jn.T("Could not create H5 ad, too many existing objects");
                                        kc2Var.q(j);
                                    }
                                    break;
                                default:
                                    jn.F("H5 gmsg contained invalid action: ".concat(str4));
                                    break;
                            }
                        } catch (NullPointerException | NumberFormatException unused) {
                            z = true;
                            jn.F("H5 gmsg did not contain a valid object id: ".concat(String.valueOf(str)));
                        }
                    }
                } else {
                    jn.F("H5 gmsg did not contain an action");
                }
            }
            parcel2.writeNoException();
            return z;
        }
        if (i != 2) {
            return false;
        }
        map.clear();
        z = true;
        parcel2.writeNoException();
        return z;
    }
}
