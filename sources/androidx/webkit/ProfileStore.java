package androidx.webkit;

import defpackage.bw;
import defpackage.y70;
import defpackage.z70;
import defpackage.zv;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface ProfileStore {
    static ProfileStore getInstance() {
        if (!y70.g.b()) {
            throw y70.a();
        }
        if (bw.b == null) {
            bw.b = new bw(z70.a.getProfileStore());
        }
        return bw.b;
    }

    boolean deleteProfile(String str);

    List<String> getAllProfileNames();

    zv getOrCreateProfile(String str);

    zv getProfile(String str);
}
