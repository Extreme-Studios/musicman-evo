package defpackage;

import android.content.Context;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import android.util.SparseArray;

/* JADX INFO: loaded from: classes.dex */
public final class yv1 extends z4 {
    public static final SparseArray h;
    public final Context c;
    public final sj1 d;
    public final TelephonyManager e;
    public final wv1 f;
    public int g;

    static {
        SparseArray sparseArray = new SparseArray();
        h = sparseArray;
        sparseArray.put(NetworkInfo.DetailedState.CONNECTED.ordinal(), mv0.CONNECTED);
        int iOrdinal = NetworkInfo.DetailedState.AUTHENTICATING.ordinal();
        mv0 mv0Var = mv0.CONNECTING;
        sparseArray.put(iOrdinal, mv0Var);
        sparseArray.put(NetworkInfo.DetailedState.CONNECTING.ordinal(), mv0Var);
        sparseArray.put(NetworkInfo.DetailedState.OBTAINING_IPADDR.ordinal(), mv0Var);
        sparseArray.put(NetworkInfo.DetailedState.DISCONNECTING.ordinal(), mv0.DISCONNECTING);
        int iOrdinal2 = NetworkInfo.DetailedState.BLOCKED.ordinal();
        mv0 mv0Var2 = mv0.DISCONNECTED;
        sparseArray.put(iOrdinal2, mv0Var2);
        sparseArray.put(NetworkInfo.DetailedState.DISCONNECTED.ordinal(), mv0Var2);
        sparseArray.put(NetworkInfo.DetailedState.FAILED.ordinal(), mv0Var2);
        sparseArray.put(NetworkInfo.DetailedState.IDLE.ordinal(), mv0Var2);
        sparseArray.put(NetworkInfo.DetailedState.SCANNING.ordinal(), mv0Var2);
        sparseArray.put(NetworkInfo.DetailedState.SUSPENDED.ordinal(), mv0.SUSPENDED);
        sparseArray.put(NetworkInfo.DetailedState.CAPTIVE_PORTAL_CHECK.ordinal(), mv0Var);
        sparseArray.put(NetworkInfo.DetailedState.VERIFYING_POOR_LINK.ordinal(), mv0Var);
    }

    public yv1(Context context, sj1 sj1Var, wv1 wv1Var, us2 us2Var, h73 h73Var) {
        super(us2Var, h73Var);
        this.c = context;
        this.d = sj1Var;
        this.f = wv1Var;
        this.e = (TelephonyManager) context.getSystemService("phone");
    }
}
