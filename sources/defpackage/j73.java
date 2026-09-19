package defpackage;

import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public abstract class j73 extends x90 implements IInterface {
    public final int g;

    public j73(byte[] bArr) {
        super("com.google.android.gms.common.internal.ICertData");
        dq.b(bArr.length == 25);
        this.g = Arrays.hashCode(bArr);
    }

    public static byte[] O0(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }

    @Override // defpackage.x90
    public final boolean K0(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            ju juVar = new ju(Z0());
            parcel2.writeNoException();
            o91.c(parcel2, juVar);
            return true;
        }
        if (i != 2) {
            return false;
        }
        parcel2.writeNoException();
        parcel2.writeInt(this.g);
        return true;
    }

    public abstract byte[] Z0();

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof j73)) {
            try {
                j73 j73Var = (j73) obj;
                if (j73Var.g == this.g) {
                    return Arrays.equals(Z0(), (byte[]) ju.Z0(new ju(j73Var.Z0())));
                }
            } catch (RemoteException e) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.g;
    }
}
