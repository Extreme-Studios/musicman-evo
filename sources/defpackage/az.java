package defpackage;

import android.os.Bundle;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class az {
    public final bz a;
    public final oa b;
    public boolean e;
    public Bundle f;
    public boolean g;
    public final ig c = new ig(22);
    public final LinkedHashMap d = new LinkedHashMap();
    public boolean h = true;

    public az(bz bzVar, oa oaVar) {
        this.a = bzVar;
        this.b = oaVar;
    }

    public final void a() {
        bz bzVar = this.a;
        if (bzVar.e().c != fo.g) {
            j7.e("Restarter must be created only during owner's initialization stage");
        } else {
            if (this.e) {
                j7.e("SavedStateRegistry was already attached.");
                return;
            }
            this.b.a();
            bzVar.e().a(new jo() { // from class: zy
                @Override // defpackage.jo
                public final void g(mo moVar, eo eoVar) {
                    eo eoVar2 = eo.ON_START;
                    az azVar = this.f;
                    if (eoVar == eoVar2) {
                        azVar.h = true;
                    } else if (eoVar == eo.ON_STOP) {
                        azVar.h = false;
                    }
                }
            });
            this.e = true;
        }
    }
}
