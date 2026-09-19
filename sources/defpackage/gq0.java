package defpackage;

import android.content.pm.ApkChecksum;
import android.content.pm.PackageManager$OnChecksumsReadyListener;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class gq0 implements PackageManager$OnChecksumsReadyListener {
    public final /* synthetic */ int a;
    public final Object b;

    public gq0() {
        this.a = 0;
        this.b = new tn2();
    }

    public final void onChecksumsReady(List list) {
        int i = this.a;
        int i2 = 0;
        Object obj = this.b;
        switch (i) {
            case 0:
                if (list == null) {
                    ((tn2) obj).d("");
                } else {
                    try {
                        int size = list.size();
                        while (i2 < size) {
                            ApkChecksum apkChecksumE = ob.e(list.get(i2));
                            if (apkChecksumE.getType() == 8) {
                                il2 il2VarF = il2.f.f();
                                byte[] value = apkChecksumE.getValue();
                                ((tn2) obj).d(il2VarF.g(value.length, value));
                            } else {
                                i2++;
                            }
                            break;
                        }
                    } catch (Throwable unused) {
                    }
                    ((tn2) obj).d("");
                }
                break;
            case 1:
                tn2 tn2Var = (tn2) obj;
                if (list == null) {
                    tn2Var.d(null);
                } else {
                    try {
                        int size2 = list.size();
                        for (int i3 = 0; i3 < size2; i3++) {
                            ApkChecksum apkChecksumE2 = ob.e(list.get(i3));
                            if (apkChecksumE2.getType() == 8) {
                                byte[] value2 = apkChecksumE2.getValue();
                                char[] cArr = pr0.a;
                                int length = value2.length;
                                char[] cArr2 = new char[length + length];
                                while (i2 < value2.length) {
                                    byte b = value2[i2];
                                    char[] cArr3 = pr0.a;
                                    int i4 = i2 + i2;
                                    cArr2[i4] = cArr3[(b & 255) >>> 4];
                                    cArr2[i4 + 1] = cArr3[b & 15];
                                    i2++;
                                }
                                tn2Var.d(new String(cArr2));
                            }
                            break;
                        }
                        tn2Var.d(null);
                    } catch (Throwable unused2) {
                        tn2Var.d(null);
                        return;
                    }
                }
                break;
            default:
                q8 q8Var = (q8) obj;
                if (list == null) {
                    q8Var.a("");
                } else {
                    try {
                        int size3 = list.size();
                        while (i2 < size3) {
                            ApkChecksum apkChecksumE3 = ob.e(list.get(i2));
                            if (apkChecksumE3.getType() == 8) {
                                il2 il2VarF2 = il2.f.f();
                                byte[] value3 = apkChecksumE3.getValue();
                                q8Var.a(il2VarF2.g(value3.length, value3));
                            } else {
                                i2++;
                            }
                            break;
                        }
                    } catch (Throwable unused3) {
                    }
                    q8Var.a("");
                }
                break;
        }
    }

    public /* synthetic */ gq0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }
}
