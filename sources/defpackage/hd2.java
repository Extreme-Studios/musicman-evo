package defpackage;

import android.net.Uri;
import android.util.Base64;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: classes.dex */
public final class hd2 extends za2 {
    public eg2 j;
    public byte[] k;
    public int l;
    public int m;

    @Override // defpackage.oe2
    public final long a(eg2 eg2Var) throws ze2, no0 {
        b(eg2Var);
        this.j = eg2Var;
        Uri uriNormalizeScheme = eg2Var.a.normalizeScheme();
        String scheme = uriNormalizeScheme.getScheme();
        hn.K("data".equals(scheme), "Unsupported scheme: %s", scheme);
        String schemeSpecificPart = uriNormalizeScheme.getSchemeSpecificPart();
        String str = qz1.a;
        String[] strArrSplit = schemeSpecificPart.split(",", -1);
        if (strArrSplit.length != 2) {
            throw new no0("Unexpected URI format: ".concat(String.valueOf(uriNormalizeScheme)), null, true, 0);
        }
        String str2 = strArrSplit[1];
        if (strArrSplit[0].contains(";base64")) {
            try {
                this.k = Base64.decode(str2, 0);
            } catch (IllegalArgumentException e) {
                throw new no0("Error while parsing Base64 encoded string: ".concat(String.valueOf(str2)), e, true, 0);
            }
        } else {
            this.k = URLDecoder.decode(str2, StandardCharsets.US_ASCII.name()).getBytes(StandardCharsets.UTF_8);
        }
        long j = eg2Var.c;
        int length = this.k.length;
        if (j > length) {
            this.k = null;
            throw new ze2();
        }
        int i = (int) j;
        this.l = i;
        int i2 = length - i;
        this.m = i2;
        long j2 = eg2Var.d;
        if (j2 != -1) {
            this.m = (int) Math.min(i2, j2);
        }
        e(eg2Var);
        return j2 != -1 ? j2 : this.m;
    }

    @Override // defpackage.k73
    public final int d(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.m;
        if (i3 == 0) {
            return -1;
        }
        int iMin = Math.min(i2, i3);
        byte[] bArr2 = this.k;
        String str = qz1.a;
        System.arraycopy(bArr2, this.l, bArr, i, iMin);
        this.l += iMin;
        this.m -= iMin;
        f(iMin);
        return iMin;
    }

    @Override // defpackage.oe2
    public final Uri h() {
        eg2 eg2Var = this.j;
        if (eg2Var != null) {
            return eg2Var.a;
        }
        return null;
    }

    @Override // defpackage.oe2
    public final void l() {
        if (this.k != null) {
            this.k = null;
            j();
        }
        this.j = null;
    }
}
