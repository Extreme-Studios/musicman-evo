package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import java.nio.ByteBuffer;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class v33 implements hp1, ww, rp1, bd3, pm1 {
    public static final /* synthetic */ v33 g = new v33(4);
    public static final /* synthetic */ v33 h = new v33(26);
    public static final /* synthetic */ v33 i = new v33(27);
    public static final /* synthetic */ v33 j = new v33(29);
    public final /* synthetic */ int f;

    public /* synthetic */ v33(int i2, int i3) {
        this.f = 3;
    }

    public static final void a(Context context, AdOverlayInfoParcel adOverlayInfoParcel, boolean z, es1 es1Var) {
        if (adOverlayInfoParcel.p == 4 && adOverlayInfoParcel.h == null) {
            ib0 ib0Var = adOverlayInfoParcel.g;
            if (ib0Var != null) {
                ib0Var.B();
            }
            zm1 zm1Var = adOverlayInfoParcel.z;
            if (zm1Var != null) {
                zm1Var.q0();
            }
            Activity activityG = adOverlayInfoParcel.i.g();
            r91 r91Var = adOverlayInfoParcel.f;
            Context context2 = (r91Var == null || !r91Var.o || activityG == null) ? context : activityG;
            ig igVar = vc3.C.a;
            ig.h(context2, r91Var, adOverlayInfoParcel.n, r91Var != null ? r91Var.n : null, es1Var, adOverlayInfoParcel.v);
            return;
        }
        Intent intent = new Intent();
        intent.setClassName(context, "com.google.android.gms.ads.AdActivity");
        intent.putExtra("com.google.android.gms.ads.internal.overlay.useClientJar", adOverlayInfoParcel.r.i);
        intent.putExtra("shouldCallOnOverlayOpened", z);
        Bundle bundle = new Bundle(1);
        bundle.putParcelable("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", adOverlayInfoParcel);
        intent.putExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", bundle);
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        if (((Boolean) tu0.e.c.a(lx0.Td)).booleanValue()) {
            zb3 zb3Var = vc3.C.c;
            zb3.v(context, intent, es1Var, adOverlayInfoParcel.v);
        } else {
            zb3 zb3Var2 = vc3.C.c;
            zb3.s(context, intent);
        }
    }

    public static String c(byte[] bArr, int i2, int i3) {
        int i4;
        int length = bArr.length;
        if ((((length - i2) - i3) | i2 | i3) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(i2), Integer.valueOf(i3)));
        }
        int i5 = i2 + i3;
        char[] cArr = new char[i3];
        int i6 = 0;
        while (i2 < i5) {
            byte b = bArr[i2];
            if (b < 0) {
                break;
            }
            i2++;
            cArr[i6] = (char) b;
            i6++;
        }
        int i7 = i6;
        while (i2 < i5) {
            int i8 = i2 + 1;
            byte b2 = bArr[i2];
            if (b2 >= 0) {
                cArr[i7] = (char) b2;
                i7++;
                i2 = i8;
                while (i2 < i5) {
                    byte b3 = bArr[i2];
                    if (b3 < 0) {
                        break;
                    }
                    i2++;
                    cArr[i7] = (char) b3;
                    i7++;
                }
            } else {
                if (b2 < -32) {
                    if (i8 >= i5) {
                        j7.s("Protocol message had invalid UTF-8.");
                        return null;
                    }
                    i4 = i7 + 1;
                    i2 += 2;
                    ss0.U(b2, bArr[i8], cArr, i7);
                } else if (b2 < -16) {
                    if (i8 >= i5 - 1) {
                        j7.s("Protocol message had invalid UTF-8.");
                        return null;
                    }
                    i4 = i7 + 1;
                    int i9 = i2 + 2;
                    i2 += 3;
                    ss0.Z(b2, bArr[i8], bArr[i9], cArr, i7);
                } else {
                    if (i8 >= i5 - 2) {
                        j7.s("Protocol message had invalid UTF-8.");
                        return null;
                    }
                    byte b4 = bArr[i8];
                    int i10 = i2 + 3;
                    byte b5 = bArr[i2 + 2];
                    i2 += 4;
                    ss0.d0(b2, b4, b5, bArr[i10], cArr, i7);
                    i7 += 2;
                }
                i7 = i4;
            }
        }
        return new String(cArr, 0, i7);
    }

    public static final String e(ByteBuffer byteBuffer, int i2, int i3) throws o23 {
        int i4;
        if ((((byteBuffer.limit() - i2) - i3) | i2 | i3) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i2), Integer.valueOf(i3)));
        }
        int i5 = i2 + i3;
        char[] cArr = new char[i3];
        int i6 = 0;
        while (i2 < i5) {
            byte b = byteBuffer.get(i2);
            if (b < 0) {
                break;
            }
            i2++;
            cArr[i6] = (char) b;
            i6++;
        }
        int i7 = i6;
        while (i2 < i5) {
            int i8 = i2 + 1;
            byte b2 = byteBuffer.get(i2);
            if (b2 >= 0) {
                cArr[i7] = (char) b2;
                i7++;
                i2 = i8;
                while (i2 < i5) {
                    byte b3 = byteBuffer.get(i2);
                    if (b3 < 0) {
                        break;
                    }
                    i2++;
                    cArr[i7] = (char) b3;
                    i7++;
                }
            } else {
                if (b2 < -32) {
                    if (i8 >= i5) {
                        j7.s("Protocol message had invalid UTF-8.");
                        return null;
                    }
                    i4 = i7 + 1;
                    i2 += 2;
                    ss0.U(b2, byteBuffer.get(i8), cArr, i7);
                } else if (b2 < -16) {
                    if (i8 >= i5 - 1) {
                        j7.s("Protocol message had invalid UTF-8.");
                        return null;
                    }
                    i4 = i7 + 1;
                    int i9 = i2 + 2;
                    i2 += 3;
                    ss0.Z(b2, byteBuffer.get(i8), byteBuffer.get(i9), cArr, i7);
                } else {
                    if (i8 >= i5 - 2) {
                        j7.s("Protocol message had invalid UTF-8.");
                        return null;
                    }
                    byte b4 = byteBuffer.get(i8);
                    int i10 = i2 + 3;
                    byte b5 = byteBuffer.get(i2 + 2);
                    i2 += 4;
                    ss0.d0(b2, b4, b5, byteBuffer.get(i10), cArr, i7);
                    i7 += 2;
                }
                i7 = i4;
            }
        }
        return new String(cArr, 0, i7);
    }

    @Override // defpackage.ww
    public void accept(Object obj, Object obj2) {
        ce2 ce2Var = (ce2) ((sk1) obj).t();
        rs rsVar = new rs((k30) obj2);
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken("com.google.android.gms.appset.internal.IAppSetService");
        int i2 = n91.a;
        parcelObtain.writeInt(1);
        s90.J(parcelObtain, s90.w(parcelObtain, 20293));
        parcelObtain.writeStrongBinder(rsVar);
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            ce2Var.f.transact(1, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain.recycle();
            parcelObtain2.recycle();
        }
    }

    @Override // defpackage.hp1
    /* JADX INFO: renamed from: b */
    public void mo6b(Object obj) {
        switch (this.f) {
            case 1:
                ((ds0) obj).u();
                break;
            case 2:
                int i2 = p73.f0;
                ((ds0) obj).b();
                break;
            case 3:
                int i3 = p73.f0;
                ((ds0) obj).v();
                break;
            case 4:
                int i4 = p73.f0;
                ((ds0) obj).F(new q43(2, new na("Player release timed out."), 1003));
                break;
            case 5:
                int i5 = p73.f0;
                ((ds0) obj).h();
                break;
            case 6:
            case 11:
            default:
                ((ye3) obj).getClass();
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
            case 12:
                break;
            case 13:
                break;
            case 14:
                break;
            case 15:
                break;
            case 16:
                break;
            case 17:
                break;
            case 18:
                break;
            case 19:
                break;
            case 20:
                break;
            case zw0.zzm /* 21 */:
                break;
            case 22:
                break;
            case 23:
                break;
            case 24:
                break;
            case 25:
                break;
        }
    }

    @Override // defpackage.rp1
    public /* synthetic */ void d(Object obj, cc3 cc3Var) {
    }

    public /* synthetic */ v33(int i2) {
        this.f = i2;
    }

    public /* synthetic */ v33(int i2, Object obj) {
        this.f = i2;
    }

    public /* synthetic */ v33(li0 li0Var, int i2) {
        this.f = 5;
    }

    @Override // defpackage.bd3
    public /* synthetic */ int b(Object obj) {
        HashMap map = cd3.a;
        String str = ((pc3) obj).a;
        if (str.startsWith("OMX.google") || str.startsWith("c2.android")) {
            return 1;
        }
        return (Build.VERSION.SDK_INT >= 26 || !str.equals("OMX.MTK.AUDIO.DECODER.RAW")) ? 0 : -1;
    }
}
