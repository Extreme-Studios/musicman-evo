package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class xh0 {
    public final boolean a;
    public final String b;
    public final le0 c;
    public final int d;
    public final byte[] e;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:25:0x0049  */
    /* JADX WARN: Code duplicated, block: B:26:0x004b  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public xh0(boolean z, String str, int i, byte[] bArr, int i2, int i3, byte[] bArr2) {
        int i4 = 1;
        hn.v((bArr2 == null) ^ (i == 0));
        this.a = z;
        this.b = str;
        this.d = i;
        this.e = bArr2;
        if (str != null) {
            switch (str.hashCode()) {
                case 3046605:
                    if (!str.equals("cbc1")) {
                        StringBuilder sb = new StringBuilder(str.length() + 68);
                        sb.append("Unsupported protection scheme type '");
                        sb.append(str);
                        sb.append("'. Assuming AES-CTR crypto mode.");
                        s90.Q("TrackEncryptionBox", sb.toString());
                    } else {
                        i4 = 2;
                    }
                    break;
                case 3046671:
                    if (!str.equals("cbcs")) {
                        StringBuilder sb2 = new StringBuilder(str.length() + 68);
                        sb2.append("Unsupported protection scheme type '");
                        sb2.append(str);
                        sb2.append("'. Assuming AES-CTR crypto mode.");
                        s90.Q("TrackEncryptionBox", sb2.toString());
                    } else {
                        i4 = 2;
                    }
                    break;
                case 3049879:
                    if (!str.equals("cenc")) {
                        StringBuilder sb3 = new StringBuilder(str.length() + 68);
                        sb3.append("Unsupported protection scheme type '");
                        sb3.append(str);
                        sb3.append("'. Assuming AES-CTR crypto mode.");
                        s90.Q("TrackEncryptionBox", sb3.toString());
                    }
                    break;
                case 3049895:
                    if (!str.equals("cens")) {
                        StringBuilder sb4 = new StringBuilder(str.length() + 68);
                        sb4.append("Unsupported protection scheme type '");
                        sb4.append(str);
                        sb4.append("'. Assuming AES-CTR crypto mode.");
                        s90.Q("TrackEncryptionBox", sb4.toString());
                    }
                    break;
                default:
                    StringBuilder sb5 = new StringBuilder(str.length() + 68);
                    sb5.append("Unsupported protection scheme type '");
                    sb5.append(str);
                    sb5.append("'. Assuming AES-CTR crypto mode.");
                    s90.Q("TrackEncryptionBox", sb5.toString());
                    break;
            }
        }
        this.c = new le0(i4, i2, i3, bArr);
    }
}
