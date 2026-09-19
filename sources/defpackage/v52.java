package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class v52 implements ek1 {
    public final HashSet f = new HashSet();
    public final Context g;
    public final ua1 h;

    public v52(Context context, ua1 ua1Var) {
        this.g = context;
        this.h = ua1Var;
    }

    @Override // defpackage.ek1
    public final synchronized void Z(fu1 fu1Var) {
        if (fu1Var.f != 3) {
            ua1 ua1Var = this.h;
            HashSet hashSet = this.f;
            synchronized (ua1Var.f) {
                ua1Var.j.addAll(hashSet);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:82:0x00ce A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public final Bundle a() {
        String str;
        Bundle bundle;
        boolean z;
        Bundle bundle2;
        ua1 ua1Var = this.h;
        Context context = this.g;
        ua1Var.getClass();
        HashSet<pa1> hashSet = new HashSet();
        synchronized (ua1Var.f) {
            HashSet hashSet2 = ua1Var.j;
            hashSet.addAll(hashSet2);
            hashSet2.clear();
        }
        Bundle bundle3 = new Bundle();
        ta1 ta1Var = ua1Var.i;
        un1 un1Var = ua1Var.h;
        synchronized (un1Var) {
            str = (String) un1Var.h;
        }
        synchronized (ta1Var.f) {
            try {
                bundle = new Bundle();
                if (!ta1Var.h.s()) {
                    bundle.putString("session_id", ta1Var.g);
                }
                bundle.putLong("basets", ta1Var.b);
                bundle.putLong("currts", ta1Var.a);
                bundle.putString("seq_num", str);
                bundle.putInt("preqs", ta1Var.c);
                bundle.putInt("preqs_in_session", ta1Var.d);
                bundle.putLong("time_in_session", ta1Var.e);
                bundle.putInt("pclick", ta1Var.i);
                bundle.putInt("pimp", ta1Var.j);
                int i = x30.b;
                Context applicationContext = context.getApplicationContext();
                if (applicationContext != null) {
                    context = applicationContext;
                }
                int identifier = context.getResources().getIdentifier("Theme.Translucent", "style", "android");
                if (identifier == 0) {
                    jn.R("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
                } else {
                    try {
                        if (identifier == context.getPackageManager().getActivityInfo(new ComponentName(context.getPackageName(), "com.google.android.gms.ads.AdActivity"), 0).theme) {
                            z = true;
                            bundle.putBoolean("support_transparent_background", z);
                            synchronized (ta1Var.f) {
                                int i2 = ta1Var.k;
                            }
                            bundle.putInt("consent_form_action_identifier", i2);
                        } else {
                            jn.R("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
                        }
                    } catch (PackageManager.NameNotFoundException unused) {
                        jn.T("Fail to fetch AdActivity theme");
                        jn.R("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
                    }
                }
                z = false;
                bundle.putBoolean("support_transparent_background", z);
                synchronized (ta1Var.f) {
                    int i3 = ta1Var.k;
                    bundle.putInt("consent_form_action_identifier", i3);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        bundle3.putBundle("app", bundle);
        Bundle bundle4 = new Bundle();
        Iterator it = ua1Var.k.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            j7.j();
            return null;
        }
        bundle3.putBundle("slots", bundle4);
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        for (pa1 pa1Var : hashSet) {
            synchronized (pa1Var.d) {
                try {
                    bundle2 = new Bundle();
                    bundle2.putString("seq_num", pa1Var.e);
                    bundle2.putString("slotid", pa1Var.f);
                    bundle2.putBoolean("ismediation", false);
                    bundle2.putLong("treq", pa1Var.j);
                    bundle2.putLong("tresponse", pa1Var.k);
                    bundle2.putLong("timp", pa1Var.g);
                    bundle2.putLong("tload", pa1Var.h);
                    bundle2.putLong("pcc", pa1Var.i);
                    bundle2.putLong("tfetch", -1L);
                    ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>();
                    for (oa1 oa1Var : pa1Var.c) {
                        oa1Var.getClass();
                        Bundle bundle5 = new Bundle();
                        bundle5.putLong("topen", oa1Var.a);
                        bundle5.putLong("tclose", oa1Var.b);
                        arrayList2.add(bundle5);
                    }
                    bundle2.putParcelableArrayList("tclick", arrayList2);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            arrayList.add(bundle2);
        }
        bundle3.putParcelableArrayList("ads", arrayList);
        synchronized (this) {
            HashSet hashSet3 = this.f;
            hashSet3.clear();
            hashSet3.addAll(hashSet);
        }
        return bundle3;
    }
}
