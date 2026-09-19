package defpackage;

import android.location.Location;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes.dex */
public final class f62 implements e62 {
    public final Object[] a;

    public f62(f93 f93Var, String str, int i, String str2, kf3 kf3Var) {
        HashSet hashSet = new HashSet(Arrays.asList(str2.split(",")));
        ArrayList arrayList = new ArrayList();
        arrayList.add(str2);
        arrayList.add(str);
        if (hashSet.contains("networkType")) {
            arrayList.add(Integer.valueOf(i));
        }
        if (hashSet.contains("birthday")) {
            arrayList.add(Long.valueOf(f93Var.g));
        }
        if (hashSet.contains("extras")) {
            arrayList.add(a(f93Var.h));
        } else if (hashSet.contains("npa")) {
            arrayList.add(f93Var.h.getString("npa"));
        }
        if (hashSet.contains("gender")) {
            arrayList.add(Integer.valueOf(f93Var.i));
        }
        if (hashSet.contains("keywords")) {
            List list = f93Var.j;
            if (list != null) {
                arrayList.add(list.toString());
            } else {
                arrayList.add(null);
            }
        }
        if (hashSet.contains("isTestDevice")) {
            arrayList.add(Boolean.valueOf(f93Var.k));
        }
        if (hashSet.contains("tagForChildDirectedTreatment")) {
            arrayList.add(Integer.valueOf(f93Var.l));
        }
        if (hashSet.contains("manualImpressionsEnabled")) {
            arrayList.add(Boolean.valueOf(f93Var.m));
        }
        if (hashSet.contains("publisherProvidedId")) {
            arrayList.add(f93Var.n);
        }
        if (hashSet.contains("location")) {
            Location location = f93Var.p;
            if (location != null) {
                arrayList.add(location.toString());
            } else {
                arrayList.add(null);
            }
        }
        if (hashSet.contains("contentUrl")) {
            arrayList.add(f93Var.q);
        }
        if (hashSet.contains("networkExtras")) {
            arrayList.add(a(f93Var.r));
        }
        if (hashSet.contains("customTargeting")) {
            arrayList.add(a(f93Var.s));
        }
        if (hashSet.contains("categoryExclusions")) {
            List list2 = f93Var.t;
            if (list2 != null) {
                arrayList.add(list2.toString());
            } else {
                arrayList.add(null);
            }
        }
        if (hashSet.contains("requestAgent")) {
            arrayList.add(f93Var.u);
        }
        if (hashSet.contains("requestPackage")) {
            arrayList.add(f93Var.v);
        }
        if (hashSet.contains("isDesignedForFamilies")) {
            arrayList.add(Boolean.valueOf(f93Var.w));
        }
        if (hashSet.contains("tagForUnderAgeOfConsent")) {
            arrayList.add(Integer.valueOf(f93Var.y));
        }
        if (hashSet.contains("maxAdContentRating")) {
            arrayList.add(f93Var.z);
        }
        if (hashSet.contains("orientation")) {
            if (kf3Var != null) {
                arrayList.add(Integer.valueOf(kf3Var.f));
            } else {
                arrayList.add(null);
            }
        }
        this.a = arrayList.toArray();
    }

    public static String a(Bundle bundle) {
        String strA;
        if (bundle == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        Iterator it = new TreeSet(bundle.keySet()).iterator();
        while (it.hasNext()) {
            Object obj = bundle.get((String) it.next());
            if (obj == null) {
                strA = "null";
            } else {
                strA = obj instanceof Bundle ? a((Bundle) obj) : obj.toString();
            }
            sb.append(strA);
        }
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f62) {
            return Arrays.equals(this.a, ((f62) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }

    public final String toString() {
        Object[] objArr = this.a;
        int iHashCode = Arrays.hashCode(objArr);
        String string = Arrays.toString(objArr);
        StringBuilder sb = new StringBuilder(String.valueOf(iHashCode).length() + 10 + String.valueOf(string).length() + 1);
        sb.append("[PoolKey#");
        sb.append(iHashCode);
        sb.append(" ");
        sb.append(string);
        sb.append("]");
        return sb.toString();
    }
}
