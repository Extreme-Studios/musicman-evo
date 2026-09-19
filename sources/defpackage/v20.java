package defpackage;

import android.content.Intent;
import android.os.PowerManager;
import androidx.work.impl.background.systemalarm.SystemAlarmService;

/* JADX INFO: loaded from: classes.dex */
public final class v20 implements Runnable {
    public final /* synthetic */ int f;
    public final w20 g;

    public /* synthetic */ v20(w20 w20Var, int i) {
        this.f = i;
        this.g = w20Var;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0092 A[Catch: all -> 0x0048, TryCatch #1 {all -> 0x0048, blocks: (B:6:0x001b, B:8:0x001f, B:10:0x0044, B:13:0x004a, B:14:0x0051, B:15:0x0052, B:16:0x005e, B:20:0x0068, B:22:0x0070, B:23:0x0072, B:27:0x007c, B:29:0x008b, B:37:0x009d, B:33:0x0091, B:34:0x0092, B:36:0x009a, B:41:0x00a1, B:24:0x0073, B:25:0x0079, B:17:0x005f, B:18:0x0065), top: B:66:0x001b, inners: #4, #5 }] */
    /* JADX WARN: Code duplicated, block: B:36:0x009a A[Catch: all -> 0x0048, TryCatch #1 {all -> 0x0048, blocks: (B:6:0x001b, B:8:0x001f, B:10:0x0044, B:13:0x004a, B:14:0x0051, B:15:0x0052, B:16:0x005e, B:20:0x0068, B:22:0x0070, B:23:0x0072, B:27:0x007c, B:29:0x008b, B:37:0x009d, B:33:0x0091, B:34:0x0092, B:36:0x009a, B:41:0x00a1, B:24:0x0073, B:25:0x0079, B:17:0x005f, B:18:0x0065), top: B:66:0x001b, inners: #4, #5 }] */
    @Override // java.lang.Runnable
    public final void run() {
        w20 w20Var;
        v20 v20Var;
        boolean zIsEmpty;
        boolean zIsEmpty2;
        switch (this.f) {
            case 0:
                synchronized (this.g.m) {
                    w20 w20Var2 = this.g;
                    w20Var2.n = (Intent) w20Var2.m.get(0);
                    break;
                }
                Intent intent = this.g.n;
                if (intent != null) {
                    String action = intent.getAction();
                    int intExtra = this.g.n.getIntExtra("KEY_START_ID", 0);
                    yp ypVarD = yp.d();
                    String str = w20.p;
                    ypVarD.a(str, String.format("Processing command %s, %s", this.g.n, Integer.valueOf(intExtra)), new Throwable[0]);
                    PowerManager.WakeLock wakeLockA = r70.a(this.g.f, action + " (" + intExtra + ")");
                    int i = 1;
                    try {
                        yp.d().a(str, "Acquiring operation wake lock (" + action + ") " + wakeLockA, new Throwable[0]);
                        wakeLockA.acquire();
                        w20 w20Var3 = this.g;
                        w20Var3.k.b(w20Var3.n, intExtra, w20Var3);
                        yp.d().a(str, "Releasing operation wake lock (" + action + ") " + wakeLockA, new Throwable[0]);
                        wakeLockA.release();
                        w20Var = this.g;
                        v20Var = new v20(w20Var, i);
                    } catch (Throwable th) {
                        try {
                            yp ypVarD2 = yp.d();
                            String str2 = w20.p;
                            ypVarD2.c(str2, "Unexpected error in onHandleIntent", th);
                            yp.d().a(str2, "Releasing operation wake lock (" + action + ") " + wakeLockA, new Throwable[0]);
                            wakeLockA.release();
                            w20Var = this.g;
                            v20Var = new v20(w20Var, i);
                        } catch (Throwable th2) {
                            yp.d().a(w20.p, "Releasing operation wake lock (" + action + ") " + wakeLockA, new Throwable[0]);
                            wakeLockA.release();
                            w20 w20Var4 = this.g;
                            w20Var4.e(new v20(w20Var4, i));
                            throw th2;
                        }
                    }
                    w20Var.e(v20Var);
                    return;
                }
                return;
            default:
                w20 w20Var5 = this.g;
                yp ypVarD3 = yp.d();
                String str3 = w20.p;
                ypVarD3.a(str3, "Checking if commands are complete.", new Throwable[0]);
                w20Var5.c();
                synchronized (w20Var5.m) {
                    try {
                        if (w20Var5.n != null) {
                            yp.d().a(str3, String.format("Removing command %s", w20Var5.n), new Throwable[0]);
                            if (!((Intent) w20Var5.m.remove(0)).equals(w20Var5.n)) {
                                throw new IllegalStateException("Dequeue-d command is not the first.");
                            }
                            w20Var5.n = null;
                        }
                        vz vzVar = (vz) ((r52) w20Var5.g).g;
                        ia iaVar = w20Var5.k;
                        synchronized (iaVar.h) {
                            zIsEmpty = iaVar.g.isEmpty();
                            break;
                        }
                        if (zIsEmpty && w20Var5.m.isEmpty()) {
                            synchronized (vzVar.h) {
                                zIsEmpty2 = vzVar.f.isEmpty();
                                break;
                            }
                            if (zIsEmpty2) {
                                yp.d().a(str3, "No more commands & intents.", new Throwable[0]);
                                SystemAlarmService systemAlarmService = w20Var5.o;
                                if (systemAlarmService != null) {
                                    systemAlarmService.a();
                                }
                            } else if (!w20Var5.m.isEmpty()) {
                                w20Var5.f();
                            }
                        } else if (!w20Var5.m.isEmpty()) {
                            w20Var5.f();
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                return;
        }
    }
}
