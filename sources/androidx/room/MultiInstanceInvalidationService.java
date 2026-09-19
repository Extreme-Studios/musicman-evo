package androidx.room;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import defpackage.qs;
import defpackage.rs;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class MultiInstanceInvalidationService extends Service {
    public int f = 0;
    public final HashMap g = new HashMap();
    public final qs h = new qs(this);
    public final rs i = new rs(this);

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return this.i;
    }
}
