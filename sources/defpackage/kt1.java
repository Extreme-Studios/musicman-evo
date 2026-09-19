package defpackage;

import android.os.Parcel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class kt1 extends jt0 implements y21 {
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kt1(int i, Object obj) {
        super("com.google.android.gms.ads.internal.initialization.IInitializationCallback");
        this.f = i;
        this.g = obj;
    }

    @Override // defpackage.jt0
    public final boolean A3(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(s21.CREATOR);
        kt0.f(parcel);
        R1(arrayListCreateTypedArrayList);
        parcel2.writeNoException();
        return true;
    }

    @Override // defpackage.y21
    public final void R1(List list) {
        ArrayList arrayList;
        switch (this.f) {
            case 0:
                ((mt1) this.g).b(list);
                return;
            default:
                b22 b22Var = (b22) this.g;
                synchronized (b22Var.a) {
                    b22Var.c = false;
                    b22Var.d = true;
                    arrayList = new ArrayList(b22Var.b);
                    b22Var.b.clear();
                    break;
                }
                HashMap map = new HashMap();
                Iterator it = list.iterator();
                while (true) {
                    int i = 8;
                    if (!it.hasNext()) {
                        new zf0(i);
                        if (arrayList.size() <= 0) {
                            return;
                        }
                        arrayList.get(0).getClass();
                        j7.j();
                        return;
                    }
                    map.put(((s21) it.next()).f, new ue0(i));
                }
                break;
        }
    }
}
