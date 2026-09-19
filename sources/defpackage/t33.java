package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.google.ads.mediation.admob.AdMobAdapter;
import java.lang.ref.WeakReference;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public abstract class t33 {
    public static MessageDigest g;
    public Object f;

    public t33(int i) {
        switch (i) {
            case 4:
                this.f = new q7(15, this);
                break;
            case 5:
                this.f = new Object();
                break;
            case 6:
            case 7:
            default:
                i6 i6Var = new i6();
                this.f = i6Var;
                ((HashSet) i6Var.g).add("B3EEABB8EE11C2BE770B684D95219ECB");
                break;
            case 8:
                this.f = new ex0();
                break;
        }
    }

    public abstract void A1(long j, byte[] bArr, long j2, long j3);

    public abstract boolean B1();

    public abstract void D1();

    public abstract l21 E1();

    public abstract ox0 G1();

    public synchronized void I1(Object obj, Executor executor) {
        ((HashMap) this.f).put(obj, executor);
    }

    public abstract int J1();

    public abstract int K1();

    public synchronized void L1(gm1 gm1Var) {
        for (Map.Entry entry : ((HashMap) this.f).entrySet()) {
            ((Executor) entry.getValue()).execute(new hb1(gm1Var, entry.getKey(), 11, false));
        }
    }

    public abstract long M1();

    public abstract long O1();

    public abstract boolean P1();

    public abstract int Q1();

    public abstract int c();

    public void e1(String str, String str2) {
        if (!TextUtils.isEmpty(str2) && str2.contains(",")) {
            StringBuilder sb = new StringBuilder(str2.length() + 108);
            sb.append("Value ");
            sb.append(str2);
            sb.append(" contains invalid character ',' (comma). The server will parse it as a list of comma-separated values.");
            jn.T(sb.toString());
        }
        ((Bundle) ((i6) this.f).h).putString(str, str2);
    }

    public t33 f1(Bundle bundle) {
        i6 i6Var = (i6) this.f;
        ((Bundle) i6Var.e).putBundle(AdMobAdapter.class.getName(), bundle);
        if (AdMobAdapter.class.equals(AdMobAdapter.class) && bundle.getBoolean("_emulatorLiveAds")) {
            ((HashSet) i6Var.g).remove("B3EEABB8EE11C2BE770B684D95219ECB");
        }
        return i1();
    }

    public abstract void g1(y91 y91Var);

    public String h1() {
        return null;
    }

    public abstract void i();

    public abstract t33 i1();

    public void j1(String str) {
        dq.g(str, "Content URL must be non-null.");
        if (TextUtils.isEmpty(str)) {
            j7.p("Content URL must be non-empty.");
            return;
        }
        int length = str.length();
        Object[] objArr = {512, Integer.valueOf(str.length())};
        if (!(length <= 512)) {
            throw new IllegalArgumentException(String.format("Content URL must not exceed %d in length.  Provided length was %d.", objArr));
        }
        ((i6) this.f).j = str;
    }

    public void k1(ArrayList arrayList) {
        ArrayList arrayList2 = (ArrayList) ((i6) this.f).k;
        arrayList2.clear();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            String str = (String) obj;
            if (TextUtils.isEmpty(str)) {
                jn.T("neighboring content URL should not be null or empty");
            } else {
                arrayList2.add(str);
            }
        }
    }

    public abstract long l1();

    public abstract void m1();

    public abstract void n1(Object obj, long j, byte b);

    public hp o1() {
        return za1.a.a((q7) this.f);
    }

    public MessageDigest p1() {
        synchronized (this.f) {
            MessageDigest messageDigest = g;
            if (messageDigest != null) {
                return messageDigest;
            }
            for (int i = 0; i < 2; i++) {
                try {
                    g = MessageDigest.getInstance("MD5");
                } catch (NoSuchAlgorithmException unused) {
                }
            }
            return g;
        }
    }

    public abstract boolean q1(long j, Object obj);

    public abstract void r1(int i, long j);

    public abstract void s1(Object obj, long j, boolean z);

    public abstract float t1(long j, Object obj);

    public abstract void u1(Object obj, long j, float f);

    public abstract double v1(long j, Object obj);

    public abstract void w1(Object obj, long j, double d);

    public abstract byte x1(long j);

    public abstract int y1();

    public abstract int z1();

    public /* synthetic */ t33(Object obj) {
        this.f = obj;
    }

    public t33(View view) {
        this.f = new WeakReference(view);
    }

    public t33(Set set) {
        this.f = new HashMap();
        synchronized (this) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                wm1 wm1Var = (wm1) it.next();
                synchronized (this) {
                    I1(wm1Var.a, wm1Var.b);
                }
            }
        }
    }
}
