package defpackage;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class zn2 {
    public static final Charset b = Charset.forName("UTF-8");
    public final ByteArrayInputStream a;

    public zn2(ByteArrayInputStream byteArrayInputStream) {
        this.a = byteArrayInputStream;
    }

    public static int b(o03 o03Var) throws IOException {
        if (!(o03Var instanceof s03)) {
            throw new IOException("invalid key id: not a JSON primitive");
        }
        if (!(o03Var.c().f instanceof Number)) {
            throw new IOException("invalid key id: not a JSON number");
        }
        Number numberD = o03Var.c().d();
        try {
            if (!(numberD instanceof kr2)) {
                throw new IllegalArgumentException("does not contain a parsed number.");
            }
            long j = Long.parseLong(((kr2) numberD).f);
            if (j > 4294967295L || j < -2147483648L) {
                throw new IOException("invalid key id");
            }
            return (int) j;
        } catch (NumberFormatException e) {
            throw new IOException(e);
        }
    }

    /* JADX WARN: Code duplicated, block: B:128:0x022d A[DONT_GENERATE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:129:0x022d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:130:0x022d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:131:0x022d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:132:0x022d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:133:0x0225 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:54:0x012c  */
    /* JADX WARN: Code duplicated, block: B:56:0x0134 A[Catch: all -> 0x002f, IllegalStateException -> 0x0032, r03 -> 0x0035, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x002f, blocks: (B:3:0x0016, B:4:0x0023, B:6:0x002b, B:13:0x0038, B:15:0x0051, B:17:0x0059, B:19:0x0063, B:21:0x006d, B:23:0x0080, B:25:0x0086, B:27:0x0098, B:29:0x009e, B:31:0x00a4, B:33:0x00aa, B:35:0x00b2, B:51:0x00fd, B:56:0x0134, B:69:0x0157, B:71:0x016d, B:73:0x0173, B:75:0x0179, B:90:0x01e8, B:91:0x021b, B:92:0x0224, B:93:0x0225, B:94:0x022c, B:60:0x013f, B:64:0x014a, B:68:0x0155, B:95:0x022d, B:96:0x0236, B:97:0x0237, B:98:0x0240, B:99:0x0241, B:100:0x0248, B:101:0x0249, B:102:0x0250, B:103:0x0251, B:106:0x025b, B:107:0x0262, B:108:0x0263, B:109:0x026a, B:110:0x026b, B:111:0x0272, B:112:0x0273, B:113:0x0278), top: B:116:0x0016 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x0137  */
    /* JADX WARN: Code duplicated, block: B:60:0x013f A[Catch: all -> 0x002f, IllegalStateException -> 0x0032, r03 -> 0x0035, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x002f, blocks: (B:3:0x0016, B:4:0x0023, B:6:0x002b, B:13:0x0038, B:15:0x0051, B:17:0x0059, B:19:0x0063, B:21:0x006d, B:23:0x0080, B:25:0x0086, B:27:0x0098, B:29:0x009e, B:31:0x00a4, B:33:0x00aa, B:35:0x00b2, B:51:0x00fd, B:56:0x0134, B:69:0x0157, B:71:0x016d, B:73:0x0173, B:75:0x0179, B:90:0x01e8, B:91:0x021b, B:92:0x0224, B:93:0x0225, B:94:0x022c, B:60:0x013f, B:64:0x014a, B:68:0x0155, B:95:0x022d, B:96:0x0236, B:97:0x0237, B:98:0x0240, B:99:0x0241, B:100:0x0248, B:101:0x0249, B:102:0x0250, B:103:0x0251, B:106:0x025b, B:107:0x0262, B:108:0x0263, B:109:0x026a, B:110:0x026b, B:111:0x0272, B:112:0x0273, B:113:0x0278), top: B:116:0x0016 }] */
    /* JADX WARN: Code duplicated, block: B:62:0x0142  */
    /* JADX WARN: Code duplicated, block: B:64:0x014a A[Catch: all -> 0x002f, IllegalStateException -> 0x0032, r03 -> 0x0035, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x002f, blocks: (B:3:0x0016, B:4:0x0023, B:6:0x002b, B:13:0x0038, B:15:0x0051, B:17:0x0059, B:19:0x0063, B:21:0x006d, B:23:0x0080, B:25:0x0086, B:27:0x0098, B:29:0x009e, B:31:0x00a4, B:33:0x00aa, B:35:0x00b2, B:51:0x00fd, B:56:0x0134, B:69:0x0157, B:71:0x016d, B:73:0x0173, B:75:0x0179, B:90:0x01e8, B:91:0x021b, B:92:0x0224, B:93:0x0225, B:94:0x022c, B:60:0x013f, B:64:0x014a, B:68:0x0155, B:95:0x022d, B:96:0x0236, B:97:0x0237, B:98:0x0240, B:99:0x0241, B:100:0x0248, B:101:0x0249, B:102:0x0250, B:103:0x0251, B:106:0x025b, B:107:0x0262, B:108:0x0263, B:109:0x026a, B:110:0x026b, B:111:0x0272, B:112:0x0273, B:113:0x0278), top: B:116:0x0016 }] */
    /* JADX WARN: Code duplicated, block: B:66:0x014d  */
    /* JADX WARN: Code duplicated, block: B:68:0x0155 A[Catch: all -> 0x002f, IllegalStateException -> 0x0032, r03 -> 0x0035, TRY_ENTER, TryCatch #2 {all -> 0x002f, blocks: (B:3:0x0016, B:4:0x0023, B:6:0x002b, B:13:0x0038, B:15:0x0051, B:17:0x0059, B:19:0x0063, B:21:0x006d, B:23:0x0080, B:25:0x0086, B:27:0x0098, B:29:0x009e, B:31:0x00a4, B:33:0x00aa, B:35:0x00b2, B:51:0x00fd, B:56:0x0134, B:69:0x0157, B:71:0x016d, B:73:0x0173, B:75:0x0179, B:90:0x01e8, B:91:0x021b, B:92:0x0224, B:93:0x0225, B:94:0x022c, B:60:0x013f, B:64:0x014a, B:68:0x0155, B:95:0x022d, B:96:0x0236, B:97:0x0237, B:98:0x0240, B:99:0x0241, B:100:0x0248, B:101:0x0249, B:102:0x0250, B:103:0x0251, B:106:0x025b, B:107:0x0262, B:108:0x0263, B:109:0x026a, B:110:0x026b, B:111:0x0272, B:112:0x0273, B:113:0x0278), top: B:116:0x0016 }] */
    /* JADX WARN: Code duplicated, block: B:71:0x016d A[Catch: all -> 0x002f, IllegalStateException -> 0x0032, r03 -> 0x0035, TryCatch #2 {all -> 0x002f, blocks: (B:3:0x0016, B:4:0x0023, B:6:0x002b, B:13:0x0038, B:15:0x0051, B:17:0x0059, B:19:0x0063, B:21:0x006d, B:23:0x0080, B:25:0x0086, B:27:0x0098, B:29:0x009e, B:31:0x00a4, B:33:0x00aa, B:35:0x00b2, B:51:0x00fd, B:56:0x0134, B:69:0x0157, B:71:0x016d, B:73:0x0173, B:75:0x0179, B:90:0x01e8, B:91:0x021b, B:92:0x0224, B:93:0x0225, B:94:0x022c, B:60:0x013f, B:64:0x014a, B:68:0x0155, B:95:0x022d, B:96:0x0236, B:97:0x0237, B:98:0x0240, B:99:0x0241, B:100:0x0248, B:101:0x0249, B:102:0x0250, B:103:0x0251, B:106:0x025b, B:107:0x0262, B:108:0x0263, B:109:0x026a, B:110:0x026b, B:111:0x0272, B:112:0x0273, B:113:0x0278), top: B:116:0x0016 }] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final lw2 a() throws IOException {
        int i;
        String strA;
        yw2 yw2Var;
        x03 x03Var;
        int i2;
        String str = "status";
        String str2 = "keyData";
        ByteArrayInputStream byteArrayInputStream = this.a;
        try {
            try {
                int i3 = ko2.a;
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                byte[] bArr = new byte[1024];
                while (true) {
                    int i4 = byteArrayInputStream.read(bArr);
                    if (i4 == -1) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, i4);
                }
                q03 q03VarB = ss0.K(new String(byteArrayOutputStream.toByteArray(), b)).b();
                x03 x03Var2 = q03VarB.f;
                if (!x03Var2.containsKey("key")) {
                    throw new r03("invalid keyset: no key");
                }
                o03 o03VarD = q03VarB.d("key");
                if (!(o03VarD instanceof n03)) {
                    throw new r03("invalid keyset: key must be an array");
                }
                ArrayList arrayList = ((n03) o03VarD).f;
                if (arrayList.size() == 0) {
                    throw new r03("invalid keyset: key is empty");
                }
                iw2 iw2VarF = lw2.F();
                if (x03Var2.containsKey("primaryKeyId")) {
                    int iB = b(q03VarB.d("primaryKeyId"));
                    iw2VarF.b();
                    ((lw2) iw2VarF.g).G(iB);
                }
                int i5 = 0;
                while (i5 < arrayList.size()) {
                    q03 q03VarB2 = ((o03) arrayList.get(i5)).b();
                    x03 x03Var3 = q03VarB2.f;
                    if (!x03Var3.containsKey(str2) || !x03Var3.containsKey(str) || !x03Var3.containsKey("keyId") || !x03Var3.containsKey("outputPrefixType")) {
                        throw new r03("invalid key");
                    }
                    o03 o03VarD2 = q03VarB2.d(str2);
                    if (!(o03VarD2 instanceof q03)) {
                        throw new r03("invalid key: keyData must be an object");
                    }
                    jw2 jw2VarD = kw2.D();
                    String strA2 = q03VarB2.d(str).a();
                    String str3 = str;
                    int iHashCode = strA2.hashCode();
                    String str4 = str2;
                    int i6 = 3;
                    if (iHashCode == -891611359) {
                        if (!strA2.equals("ENABLED")) {
                            throw new r03("unknown status: ".concat(strA2));
                        }
                        i = 3;
                        jw2VarD.b();
                        ((kw2) jw2VarD.g).I(i);
                        int iB2 = b(q03VarB2.d("keyId"));
                        jw2VarD.b();
                        ((kw2) jw2VarD.g).F(iB2);
                        strA = q03VarB2.d("outputPrefixType").a();
                        switch (strA.hashCode()) {
                            case -2053249079:
                                if (strA.equals("LEGACY")) {
                                    yw2Var = yw2.LEGACY;
                                    jw2VarD.b();
                                    ((kw2) jw2VarD.g).G(yw2Var);
                                    q03 q03VarB3 = o03VarD2.b();
                                    x03Var = q03VarB3.f;
                                    if (x03Var.containsKey("typeUrl")) {
                                    }
                                    throw new r03("invalid keyData");
                                }
                                break;
                            case 80904:
                                if (strA.equals("RAW")) {
                                    yw2Var = yw2.RAW;
                                    jw2VarD.b();
                                    ((kw2) jw2VarD.g).G(yw2Var);
                                    q03 q03VarB4 = o03VarD2.b();
                                    x03Var = q03VarB4.f;
                                    if (x03Var.containsKey("typeUrl")) {
                                    }
                                    throw new r03("invalid keyData");
                                }
                                break;
                            case 2575090:
                                if (strA.equals("TINK")) {
                                    yw2Var = yw2.TINK;
                                    jw2VarD.b();
                                    ((kw2) jw2VarD.g).G(yw2Var);
                                    q03 q03VarB5 = o03VarD2.b();
                                    x03Var = q03VarB5.f;
                                    if (x03Var.containsKey("typeUrl")) {
                                    }
                                    throw new r03("invalid keyData");
                                }
                                break;
                            case 1761684556:
                                if (strA.equals("CRUNCHY")) {
                                    yw2Var = yw2.CRUNCHY;
                                    jw2VarD.b();
                                    ((kw2) jw2VarD.g).G(yw2Var);
                                    q03 q03VarB6 = o03VarD2.b();
                                    x03Var = q03VarB6.f;
                                    if (x03Var.containsKey("typeUrl")) {
                                    }
                                    throw new r03("invalid keyData");
                                }
                                break;
                        }
                        throw new r03("unknown output prefix type: ".concat(strA));
                    }
                    if (iHashCode == 478389753) {
                        if (!strA2.equals("DESTROYED")) {
                            throw new r03("unknown status: ".concat(strA2));
                        }
                        i = 5;
                        jw2VarD.b();
                        ((kw2) jw2VarD.g).I(i);
                        int iB3 = b(q03VarB2.d("keyId"));
                        jw2VarD.b();
                        ((kw2) jw2VarD.g).F(iB3);
                        strA = q03VarB2.d("outputPrefixType").a();
                        switch (strA.hashCode()) {
                            case -2053249079:
                                if (strA.equals("LEGACY")) {
                                    yw2Var = yw2.LEGACY;
                                    jw2VarD.b();
                                    ((kw2) jw2VarD.g).G(yw2Var);
                                    q03 q03VarB7 = o03VarD2.b();
                                    x03Var = q03VarB7.f;
                                    if (x03Var.containsKey("typeUrl")) {
                                    }
                                    throw new r03("invalid keyData");
                                }
                                break;
                            case 80904:
                                if (strA.equals("RAW")) {
                                    yw2Var = yw2.RAW;
                                    jw2VarD.b();
                                    ((kw2) jw2VarD.g).G(yw2Var);
                                    q03 q03VarB8 = o03VarD2.b();
                                    x03Var = q03VarB8.f;
                                    if (x03Var.containsKey("typeUrl")) {
                                    }
                                    throw new r03("invalid keyData");
                                }
                                break;
                            case 2575090:
                                if (strA.equals("TINK")) {
                                    yw2Var = yw2.TINK;
                                    jw2VarD.b();
                                    ((kw2) jw2VarD.g).G(yw2Var);
                                    q03 q03VarB9 = o03VarD2.b();
                                    x03Var = q03VarB9.f;
                                    if (x03Var.containsKey("typeUrl")) {
                                    }
                                    throw new r03("invalid keyData");
                                }
                                break;
                            case 1761684556:
                                if (strA.equals("CRUNCHY")) {
                                    yw2Var = yw2.CRUNCHY;
                                    jw2VarD.b();
                                    ((kw2) jw2VarD.g).G(yw2Var);
                                    q03 q03VarB10 = o03VarD2.b();
                                    x03Var = q03VarB10.f;
                                    if (x03Var.containsKey("typeUrl")) {
                                    }
                                    throw new r03("invalid keyData");
                                }
                                break;
                        }
                        throw new r03("unknown output prefix type: ".concat(strA));
                    }
                    if (iHashCode != 1053567612 || !strA2.equals("DISABLED")) {
                        throw new r03("unknown status: ".concat(strA2));
                    }
                    i = 4;
                    jw2VarD.b();
                    ((kw2) jw2VarD.g).I(i);
                    int iB4 = b(q03VarB2.d("keyId"));
                    jw2VarD.b();
                    ((kw2) jw2VarD.g).F(iB4);
                    strA = q03VarB2.d("outputPrefixType").a();
                    switch (strA.hashCode()) {
                        case -2053249079:
                            if (strA.equals("LEGACY")) {
                                yw2Var = yw2.LEGACY;
                                jw2VarD.b();
                                ((kw2) jw2VarD.g).G(yw2Var);
                                q03 q03VarB11 = o03VarD2.b();
                                x03Var = q03VarB11.f;
                                if (x03Var.containsKey("typeUrl") || !x03Var.containsKey("value") || !x03Var.containsKey("keyMaterialType")) {
                                    throw new r03("invalid keyData");
                                }
                                byte[] bArrA = vz2.a(q03VarB11.d("value").a());
                                dw2 dw2VarC = ew2.C();
                                String strA3 = q03VarB11.d("typeUrl").a();
                                dw2VarC.b();
                                ((ew2) dw2VarC.g).E(strA3);
                                l13 l13VarN = n13.n(bArrA, 0, bArrA.length);
                                dw2VarC.b();
                                ((ew2) dw2VarC.g).F(l13VarN);
                                String strA4 = q03VarB11.d("keyMaterialType").a();
                                switch (strA4.hashCode()) {
                                    case -1881281466:
                                        if (!strA4.equals("REMOTE")) {
                                            throw new r03("unknown key material type: ".concat(strA4));
                                        }
                                        i2 = 5;
                                        continue;
                                        dw2VarC.b();
                                        ((ew2) dw2VarC.g).G(i2);
                                        ew2 ew2Var = (ew2) dw2VarC.c();
                                        jw2VarD.b();
                                        ((kw2) jw2VarD.g).E(ew2Var);
                                        kw2 kw2Var = (kw2) jw2VarD.c();
                                        iw2VarF.b();
                                        ((lw2) iw2VarF.g).H(kw2Var);
                                        i5++;
                                        str = str3;
                                        str2 = str4;
                                        break;
                                        break;
                                    case -1609477353:
                                        if (!strA4.equals("SYMMETRIC")) {
                                            throw new r03("unknown key material type: ".concat(strA4));
                                        }
                                        i6 = 2;
                                        break;
                                        break;
                                    case 249237018:
                                        if (!strA4.equals("ASYMMETRIC_PRIVATE")) {
                                            throw new r03("unknown key material type: ".concat(strA4));
                                        }
                                        break;
                                    case 1534613202:
                                        if (!strA4.equals("ASYMMETRIC_PUBLIC")) {
                                            throw new r03("unknown key material type: ".concat(strA4));
                                        }
                                        i2 = 4;
                                        continue;
                                        dw2VarC.b();
                                        ((ew2) dw2VarC.g).G(i2);
                                        ew2 ew2Var2 = (ew2) dw2VarC.c();
                                        jw2VarD.b();
                                        ((kw2) jw2VarD.g).E(ew2Var2);
                                        kw2 kw2Var2 = (kw2) jw2VarD.c();
                                        iw2VarF.b();
                                        ((lw2) iw2VarF.g).H(kw2Var2);
                                        i5++;
                                        str = str3;
                                        str2 = str4;
                                        break;
                                        break;
                                    default:
                                        throw new r03("unknown key material type: ".concat(strA4));
                                }
                                i2 = i6;
                                dw2VarC.b();
                                ((ew2) dw2VarC.g).G(i2);
                                ew2 ew2Var3 = (ew2) dw2VarC.c();
                                jw2VarD.b();
                                ((kw2) jw2VarD.g).E(ew2Var3);
                                kw2 kw2Var3 = (kw2) jw2VarD.c();
                                iw2VarF.b();
                                ((lw2) iw2VarF.g).H(kw2Var3);
                                i5++;
                                str = str3;
                                str2 = str4;
                            }
                            break;
                        case 80904:
                            if (strA.equals("RAW")) {
                                yw2Var = yw2.RAW;
                                jw2VarD.b();
                                ((kw2) jw2VarD.g).G(yw2Var);
                                q03 q03VarB12 = o03VarD2.b();
                                x03Var = q03VarB12.f;
                                if (x03Var.containsKey("typeUrl")) {
                                }
                                throw new r03("invalid keyData");
                            }
                            break;
                        case 2575090:
                            if (strA.equals("TINK")) {
                                yw2Var = yw2.TINK;
                                jw2VarD.b();
                                ((kw2) jw2VarD.g).G(yw2Var);
                                q03 q03VarB13 = o03VarD2.b();
                                x03Var = q03VarB13.f;
                                if (x03Var.containsKey("typeUrl")) {
                                }
                                throw new r03("invalid keyData");
                            }
                            break;
                        case 1761684556:
                            if (strA.equals("CRUNCHY")) {
                                yw2Var = yw2.CRUNCHY;
                                jw2VarD.b();
                                ((kw2) jw2VarD.g).G(yw2Var);
                                q03 q03VarB14 = o03VarD2.b();
                                x03Var = q03VarB14.f;
                                if (x03Var.containsKey("typeUrl")) {
                                }
                                throw new r03("invalid keyData");
                            }
                            break;
                    }
                    throw new r03("unknown output prefix type: ".concat(strA));
                }
                lw2 lw2Var = (lw2) iw2VarF.c();
                byteArrayInputStream.close();
                return lw2Var;
            } catch (Throwable th) {
                byteArrayInputStream.close();
                throw th;
            }
        } catch (IllegalStateException e) {
            e = e;
            throw new IOException(e);
        } catch (r03 e2) {
            e = e2;
            throw new IOException(e);
        }
    }
}
