package defpackage;

import java.io.File;
import java.util.LinkedHashSet;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public final class nu extends zn implements rk {
    public final /* synthetic */ int g;
    public final /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nu(int i, Object obj) {
        super(0);
        this.g = i;
        this.h = obj;
    }

    @Override // defpackage.rk
    public final Object a() {
        Object objPrevious;
        switch (this.g) {
            case 0:
                ((uu) this.h).a();
                return k50.a;
            case 1:
                uu uuVar = (uu) this.h;
                f7 f7Var = uuVar.b;
                ListIterator listIterator = f7Var.listIterator(f7Var.h);
                while (listIterator.hasPrevious()) {
                    objPrevious = listIterator.previous();
                    if (((qj) objPrevious).a) {
                        uuVar.c = null;
                        return k50.a;
                    }
                }
                objPrevious = null;
                uuVar.c = null;
                return k50.a;
            case 2:
                ((uu) this.h).a();
                return k50.a;
            default:
                File file = (File) ((i10) this.h).a.a();
                String absolutePath = file.getAbsolutePath();
                synchronized (i10.i) {
                    LinkedHashSet linkedHashSet = i10.h;
                    if (linkedHashSet.contains(absolutePath)) {
                        throw new IllegalStateException(("There are multiple DataStores active for the same file: " + file + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
                    }
                    absolutePath.getClass();
                    linkedHashSet.add(absolutePath);
                }
                return file;
        }
    }
}
