package defpackage;

import android.util.Log;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class ak extends z60 {
    public static final zj h = new zj(0);
    public final boolean e;
    public final HashMap b = new HashMap();
    public final HashMap c = new HashMap();
    public final HashMap d = new HashMap();
    public boolean f = false;
    public boolean g = false;

    public ak(boolean z) {
        this.e = z;
    }

    @Override // defpackage.z60
    public final void b() {
        if (xj.E(3)) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.f = true;
    }

    public final void c(kj kjVar) {
        if (xj.E(3)) {
            Log.d("FragmentManager", "Clearing non-config state for " + kjVar);
        }
        d(kjVar.j);
    }

    public final void d(String str) {
        HashMap map = this.c;
        ak akVar = (ak) map.get(str);
        if (akVar != null) {
            akVar.b();
            map.remove(str);
        }
        HashMap map2 = this.d;
        c70 c70Var = (c70) map2.get(str);
        if (c70Var != null) {
            c70Var.a();
            map2.remove(str);
        }
    }

    public final void e(kj kjVar) {
        if (this.g) {
            if (xj.E(2)) {
                Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
            }
        } else {
            if (this.b.remove(kjVar.j) == null || !xj.E(2)) {
                return;
            }
            Log.v("FragmentManager", "Updating retained Fragments: Removed " + kjVar);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ak.class == obj.getClass()) {
            ak akVar = (ak) obj;
            if (this.b.equals(akVar.b) && this.c.equals(akVar.c) && this.d.equals(akVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + (this.b.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator it = this.b.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator it2 = this.c.keySet().iterator();
        while (it2.hasNext()) {
            sb.append((String) it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator it3 = this.d.keySet().iterator();
        while (it3.hasNext()) {
            sb.append((String) it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
