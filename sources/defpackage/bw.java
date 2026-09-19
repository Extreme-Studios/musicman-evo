package defpackage;

import androidx.webkit.ProfileStore;
import java.lang.reflect.InvocationHandler;
import java.util.List;
import org.chromium.support_lib_boundary.ProfileBoundaryInterface;
import org.chromium.support_lib_boundary.ProfileStoreBoundaryInterface;

/* JADX INFO: loaded from: classes.dex */
public final class bw implements ProfileStore {
    public static bw b;
    public final ProfileStoreBoundaryInterface a;

    public bw(ProfileStoreBoundaryInterface profileStoreBoundaryInterface) {
        this.a = profileStoreBoundaryInterface;
    }

    @Override // androidx.webkit.ProfileStore
    public final boolean deleteProfile(String str) {
        if (y70.g.b()) {
            return this.a.deleteProfile(str);
        }
        throw y70.a();
    }

    @Override // androidx.webkit.ProfileStore
    public final List getAllProfileNames() {
        if (y70.g.b()) {
            return this.a.getAllProfileNames();
        }
        throw y70.a();
    }

    @Override // androidx.webkit.ProfileStore
    public final zv getOrCreateProfile(String str) {
        if (!y70.g.b()) {
            throw y70.a();
        }
        return new oc2(5, (ProfileBoundaryInterface) i8.f(ProfileBoundaryInterface.class, this.a.getOrCreateProfile(str)));
    }

    @Override // androidx.webkit.ProfileStore
    public final zv getProfile(String str) {
        if (!y70.g.b()) {
            throw y70.a();
        }
        InvocationHandler profile = this.a.getProfile(str);
        if (profile == null) {
            return null;
        }
        return new oc2(5, (ProfileBoundaryInterface) i8.f(ProfileBoundaryInterface.class, profile));
    }
}
