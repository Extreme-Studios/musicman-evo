package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioDeviceInfo;
import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class y4 extends BroadcastReceiver {
    public final /* synthetic */ int a;
    public final Object b;

    public y4() {
        this.a = 6;
        this.b = q92.d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Object[] objArr = 0;
        switch (this.a) {
            case 0:
                ((z4) this.b).i();
                return;
            case 1:
                if (intent != null) {
                    ((j8) this.b).g(intent);
                    return;
                }
                return;
            case 2:
                ((rr0) this.b).c();
                return;
            case 3:
                ((rt0) this.b).d(3);
                return;
            case 4:
                dd1 dd1Var = (dd1) this.b;
                synchronized (dd1Var) {
                    try {
                        ArrayList arrayList = new ArrayList();
                        for (Map.Entry entry : ((WeakHashMap) dd1Var.i).entrySet()) {
                            if (((IntentFilter) entry.getValue()).hasAction(intent.getAction())) {
                                arrayList.add((BroadcastReceiver) entry.getKey());
                            }
                        }
                        int size = arrayList.size();
                        for (int i = 0; i < size; i++) {
                            ((BroadcastReceiver) arrayList.get(i)).onReceive(context, intent);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            case 5:
                ((nv1) this.b).a.execute(new hb1(this, context, 21, objArr == true ? 1 : 0));
                return;
            case 6:
                q92 q92Var = (q92) this.b;
                if (intent.getAction().equals("android.intent.action.SCREEN_OFF")) {
                    q92Var.a(true, q92Var.c);
                    q92Var.b = true;
                    return;
                } else {
                    if (intent.getAction().equals("android.intent.action.SCREEN_ON")) {
                        q92Var.a(false, q92Var.c);
                        q92Var.b = false;
                        return;
                    }
                    return;
                }
            case 7:
                if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
                    ((wx1) this.b).d(new t8(11));
                    return;
                }
                return;
            case 8:
                if (isInitialStickyBroadcast()) {
                    return;
                }
                qx1 qx1Var = (qx1) this.b;
                qx1Var.b(na3.b(context, intent, (qk1) qx1Var.o, (AudioDeviceInfo) qx1Var.n));
                return;
            default:
                zb3 zb3Var = (zb3) this.b;
                if (Objects.equals(intent.getAction(), "android.intent.action.USER_PRESENT")) {
                    zb3Var.e = true;
                    return;
                } else {
                    if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
                        zb3Var.e = false;
                        return;
                    }
                    return;
                }
        }
    }

    public /* synthetic */ y4(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public y4(kt2 kt2Var, wx1 wx1Var) {
        this.a = 7;
        this.b = wx1Var;
    }
}
