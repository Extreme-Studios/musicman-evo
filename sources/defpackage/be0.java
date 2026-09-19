package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class be0 implements hn2 {
    public final /* synthetic */ int f;
    public final /* synthetic */ x61 g;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ ep0 i;

    public /* synthetic */ be0(ep0 ep0Var, x61 x61Var, boolean z, int i) {
        this.f = i;
        this.g = x61Var;
        this.h = z;
        this.i = ep0Var;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0053 A[Catch: RemoteException -> 0x006d, TryCatch #0 {RemoteException -> 0x006d, blocks: (B:5:0x0013, B:6:0x0020, B:8:0x0026, B:10:0x0032, B:11:0x0037, B:14:0x0049, B:15:0x004d, B:17:0x0053, B:19:0x005f, B:22:0x006f, B:24:0x0081), top: B:46:0x0013 }] */
    /* JADX WARN: Code duplicated, block: B:54:0x006f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x005f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x0081 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x004d A[SYNTHETIC] */
    @Override // defpackage.hn2
    /* JADX INFO: renamed from: e */
    public final void mo5e(Object obj) {
        int i = this.f;
        boolean z = this.h;
        x61 x61Var = this.g;
        ep0 ep0Var = this.i;
        switch (i) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                try {
                    v61 v61Var = (v61) x61Var;
                    Parcel parcelU = v61Var.U();
                    parcelU.writeTypedList(arrayList);
                    v61Var.K0(parcelU, 1);
                    boolean z2 = ep0Var.s;
                    f82 f82Var = ep0Var.r;
                    if (z2 || z) {
                        int size = arrayList.size();
                        int i2 = 0;
                        while (i2 < size) {
                            Object obj2 = arrayList.get(i2);
                            i2++;
                            Uri uri = (Uri) obj2;
                            if (ep0.F3(uri, ep0Var.E, ep0Var.F)) {
                                f82Var.b(ep0.I3(uri, ep0Var.B, "1").toString(), null, null, null);
                            } else {
                                if (((Boolean) tu0.e.c.a(lx0.Q7)).booleanValue()) {
                                    f82Var.b(uri.toString(), null, null, null);
                                }
                            }
                        }
                    }
                } catch (RemoteException e) {
                    jn.P("", e);
                    return;
                }
                break;
            default:
                List<Uri> list = (List) obj;
                try {
                    ep0Var.getClass();
                    ArrayList arrayList2 = ep0Var.D;
                    ArrayList arrayList3 = ep0Var.C;
                    f82 f82Var2 = ep0Var.r;
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        if (ep0.F3((Uri) it.next(), arrayList3, arrayList2)) {
                            ep0Var.y.getAndIncrement();
                            v61 v61Var2 = (v61) x61Var;
                            Parcel parcelU2 = v61Var2.U();
                            parcelU2.writeTypedList(list);
                            v61Var2.K0(parcelU2, 1);
                            if (!ep0Var.t || z) {
                                for (Uri uri2 : list) {
                                    if (ep0.F3(uri2, arrayList3, arrayList2)) {
                                        f82Var2.b(ep0.I3(uri2, ep0Var.B, "1").toString(), null, null, null);
                                    } else {
                                        if (((Boolean) tu0.e.c.a(lx0.Q7)).booleanValue()) {
                                            f82Var2.b(uri2.toString(), null, null, null);
                                        }
                                    }
                                }
                            }
                            break;
                        }
                    }
                    v61 v61Var3 = (v61) x61Var;
                    Parcel parcelU3 = v61Var3.U();
                    parcelU3.writeTypedList(list);
                    v61Var3.K0(parcelU3, 1);
                    if (!ep0Var.t) {
                    }
                    while (r12.hasNext()) {
                        if (ep0.F3(uri2, arrayList3, arrayList2)) {
                            f82Var2.b(ep0.I3(uri2, ep0Var.B, "1").toString(), null, null, null);
                        } else {
                            if (((Boolean) tu0.e.c.a(lx0.Q7)).booleanValue()) {
                                f82Var2.b(uri2.toString(), null, null, null);
                            }
                        }
                    }
                } catch (RemoteException e2) {
                    jn.P("", e2);
                }
                break;
        }
    }

    @Override // defpackage.hn2
    public final void w(Throwable th) {
        int i = this.f;
        x61 x61Var = this.g;
        switch (i) {
            case 0:
                try {
                    String message = th.getMessage();
                    StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 16);
                    sb.append("Internal error: ");
                    sb.append(message);
                    String string = sb.toString();
                    v61 v61Var = (v61) x61Var;
                    Parcel parcelU = v61Var.U();
                    parcelU.writeString(string);
                    v61Var.K0(parcelU, 2);
                } catch (RemoteException e) {
                    jn.P("", e);
                }
                break;
            default:
                try {
                    String message2 = th.getMessage();
                    StringBuilder sb2 = new StringBuilder(String.valueOf(message2).length() + 16);
                    sb2.append("Internal error: ");
                    sb2.append(message2);
                    String string2 = sb2.toString();
                    v61 v61Var2 = (v61) x61Var;
                    Parcel parcelU2 = v61Var2.U();
                    parcelU2.writeString(string2);
                    v61Var2.K0(parcelU2, 2);
                } catch (RemoteException e2) {
                    jn.P("", e2);
                    return;
                }
                break;
        }
    }
}
