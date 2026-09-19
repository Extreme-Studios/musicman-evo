package defpackage;

import android.os.ParcelFileDescriptor;
import android.util.Base64;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class kg0 implements xm2 {
    public static final /* synthetic */ kg0 b = new kg0(0);
    public static final /* synthetic */ kg0 c = new kg0(1);
    public static final /* synthetic */ kg0 d = new kg0(3);
    public static final /* synthetic */ kg0 e = new kg0(4);
    public static final /* synthetic */ kg0 f = new kg0(5);
    public static final /* synthetic */ kg0 g = new kg0(6);
    public static final /* synthetic */ kg0 h = new kg0(7);
    public static final /* synthetic */ kg0 i = new kg0(9);
    public static final /* synthetic */ kg0 j = new kg0(10);
    public static final /* synthetic */ kg0 k = new kg0(11);
    public static final /* synthetic */ kg0 l = new kg0(12);
    public static final /* synthetic */ kg0 m = new kg0(13);
    public static final /* synthetic */ kg0 n = new kg0(14);
    public static final /* synthetic */ kg0 o = new kg0(16);
    public final /* synthetic */ int a;

    public /* synthetic */ kg0(int i2) {
        this.a = i2;
    }

    @Override // defpackage.xm2
    public final hp b(Object obj) throws IOException {
        int i2 = -1;
        String str = "";
        String str2 = null;
        int i3 = 0;
        int i4 = 1;
        switch (this.a) {
            case 0:
                return (hp) ((xf1) obj).b.c();
            case 1:
                Throwable th = (Throwable) obj;
                if (((Boolean) tu0.e.c.a(lx0.jb)).booleanValue()) {
                    vc3.C.h.f("GetTopicsApiWithRecordObservationActionHandlerUnsampled", th);
                } else {
                    vc3.C.h.e("GetTopicsApiWithRecordObservationActionHandler", th);
                }
                tj2 tj2Var = vj2.g;
                return na1.t(new ul(qk2.j));
            case 2:
                jn.w("Error during loading assets.", (Exception) obj);
                return kn2.g;
            case 3:
                Throwable cause = (ExecutionException) obj;
                if (cause.getCause() != null) {
                    cause = cause.getCause();
                }
                return na1.C(cause);
            case 4:
                return na1.C(new au1(5));
            case 5:
                return na1.t(((ev1) obj).a);
            case 6:
                return kn2.g;
            case 7:
                Throwable cause2 = (ExecutionException) obj;
                if (cause2.getCause() != null) {
                    cause2 = cause2.getCause();
                }
                return na1.C(cause2);
            case 8:
                ParcelFileDescriptor[] parcelFileDescriptorArrCreatePipe = ParcelFileDescriptor.createPipe();
                ParcelFileDescriptor parcelFileDescriptor = parcelFileDescriptorArrCreatePipe[0];
                za1.a.execute(new u52((InputStream) obj, i3, parcelFileDescriptorArrCreatePipe[1]));
                return na1.t(parcelFileDescriptor);
            case 9:
                return ((Throwable) obj) instanceof TimeoutException ? na1.t(new f02(Integer.toString(17), i4)) : na1.t(new f02(str2, i4));
            case 10:
                return na1.t(new f02((String) obj, i4));
            case 11:
                b7 b7Var = (b7) obj;
                return b7Var == null ? na1.t(new p02(str2, i2, i3)) : na1.t(new p02(b7Var.a, b7Var.b, i3));
            case 12:
                ul ulVar = (ul) obj;
                if (ulVar == null) {
                    return na1.t(new p02(str, i4, i4));
                }
                i43 i43VarZ = j43.z();
                for (n40 n40Var : ulVar.a) {
                    g43 g43VarZ = h43.z();
                    int i5 = n40Var.c;
                    g43VarZ.b();
                    ((h43) g43VarZ.g).A(i5);
                    long j2 = n40Var.b;
                    g43VarZ.b();
                    ((h43) g43VarZ.g).B(j2);
                    long j3 = n40Var.a;
                    g43VarZ.b();
                    ((h43) g43VarZ.g).C(j3);
                    h43 h43Var = (h43) g43VarZ.c();
                    i43VarZ.b();
                    ((j43) i43VarZ.g).A(h43Var);
                }
                return na1.t(new p02(Base64.encodeToString(((j43) i43VarZ.c()).b(), 1), i4, i4));
            case 13:
                b7 b7Var2 = (b7) obj;
                int i6 = 2;
                return b7Var2 == null ? na1.t(new p02(str2, i2, i6)) : na1.t(new p02(b7Var2.a, b7Var2.b, i6));
            case 14:
                return kn2.g;
            case 15:
                return na1.t("");
            default:
                ge2 ge2Var = (ge2) obj;
                return na1.M(ge2Var.c(), new zl0(9, ge2Var), cn2.f);
        }
    }
}
