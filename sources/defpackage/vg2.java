package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.TypedArray;
import android.media.LoudnessCodecController;
import android.media.MediaCodec;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import android.text.TextUtils;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import java.io.ByteArrayInputStream;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class vg2 implements vu, dd0, y7, x7, hn2, ke1, pn1, o62, rp1 {
    public final /* synthetic */ int f;
    public Object g;
    public Object h;

    public vg2(Context context, AttributeSet attributeSet) {
        this.f = 28;
        TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attributeSet, jw.a);
        String string = typedArrayObtainAttributes.getString(0);
        String string2 = typedArrayObtainAttributes.getString(1);
        boolean zIsEmpty = TextUtils.isEmpty(string);
        boolean zIsEmpty2 = TextUtils.isEmpty(string2);
        if (!zIsEmpty && zIsEmpty2) {
            this.g = v(string);
        } else {
            if (!zIsEmpty || zIsEmpty2) {
                if (zIsEmpty) {
                    typedArrayObtainAttributes.recycle();
                    j7.p("Required XML attribute \"adSize\" was missing.");
                    throw null;
                }
                typedArrayObtainAttributes.recycle();
                j7.p("Either XML attribute \"adSize\" or XML attribute \"supportedAdSizes\" should be specified, but not both.");
                throw null;
            }
            this.g = v(string2);
        }
        String string3 = typedArrayObtainAttributes.getString(2);
        this.h = string3;
        typedArrayObtainAttributes.recycle();
        if (TextUtils.isEmpty(string3)) {
            j7.p("Required XML attribute \"adUnitId\" was missing.");
            throw null;
        }
    }

    public static void r(vg2 vg2Var, un1 un1Var) {
        r52 r52Var = (r52) un1Var.g;
        r52 r52Var2 = (r52) vg2Var.g;
        long[] jArr = (long[]) r52Var2.g;
        long[] jArr2 = (long[]) r52Var.g;
        long[] jArr3 = (long[]) un1Var.h;
        s90.Z(jArr, jArr2, jArr3);
        long[] jArr4 = (long[]) r52Var2.h;
        long[] jArr5 = (long[]) r52Var.h;
        long[] jArr6 = (long[]) r52Var.i;
        s90.Z(jArr4, jArr5, jArr6);
        s90.Z((long[]) r52Var2.i, jArr6, jArr3);
        s90.Z((long[]) vg2Var.h, jArr2, jArr5);
    }

    public static s2[] v(String str) {
        String[] strArrSplit = str.split("\\s*,\\s*");
        int length = strArrSplit.length;
        s2[] s2VarArr = new s2[length];
        for (int i = 0; i < strArrSplit.length; i++) {
            String strTrim = strArrSplit[i].trim();
            if (strTrim.matches("^(\\d+|FULL_WIDTH)\\s*[xX]\\s*(\\d+|AUTO_HEIGHT)$")) {
                String[] strArrSplit2 = strTrim.split("[xX]");
                strArrSplit2[0] = strArrSplit2[0].trim();
                strArrSplit2[1] = strArrSplit2[1].trim();
                try {
                    s2VarArr[i] = new s2("FULL_WIDTH".equals(strArrSplit2[0]) ? -1 : Integer.parseInt(strArrSplit2[0]), "AUTO_HEIGHT".equals(strArrSplit2[1]) ? -2 : Integer.parseInt(strArrSplit2[1]));
                } catch (NumberFormatException unused) {
                    j7.p("Could not parse XML attribute \"adSize\": ".concat(strTrim));
                    return null;
                }
            } else if ("BANNER".equals(strTrim)) {
                s2VarArr[i] = s2.h;
            } else if ("LARGE_BANNER".equals(strTrim)) {
                s2VarArr[i] = s2.j;
            } else if ("FULL_BANNER".equals(strTrim)) {
                s2VarArr[i] = s2.i;
            } else if ("LEADERBOARD".equals(strTrim)) {
                s2VarArr[i] = s2.k;
            } else if ("MEDIUM_RECTANGLE".equals(strTrim)) {
                s2VarArr[i] = s2.l;
            } else if ("SMART_BANNER".equals(strTrim)) {
                s2VarArr[i] = s2.n;
            } else if ("WIDE_SKYSCRAPER".equals(strTrim)) {
                s2VarArr[i] = s2.m;
            } else if ("FLUID".equals(strTrim)) {
                s2VarArr[i] = s2.o;
            } else {
                if (!"ICON".equals(strTrim)) {
                    j7.p("Could not parse XML attribute \"adSize\": ".concat(strTrim));
                    return null;
                }
                s2VarArr[i] = s2.q;
            }
        }
        if (length != 0) {
            return s2VarArr;
        }
        j7.p("Could not parse XML attribute \"adSize\": ".concat(str));
        return null;
    }

    @Override // defpackage.x7
    public void T(int i) {
        ((cb1) this.g).c(new RuntimeException(ec.j(new StringBuilder(String.valueOf(i).length() + 23), "onConnectionSuspended: ", i)));
    }

    @Override // defpackage.y7
    public void U(db dbVar) {
        synchronized (((qk) this.h).g) {
            ((yu0) this.g).c(new RuntimeException("Connection failed."));
        }
    }

    @Override // defpackage.x7
    public void Y() {
        try {
            ((cb1) this.g).b((p21) ((vu0) ((vb) this.h).f).t());
        } catch (DeadObjectException e) {
            ((cb1) this.g).c(e);
        }
    }

    @Override // defpackage.o62
    public void a() {
        mx1 mx1Var = (mx1) this.g;
        tx0 tx0Var = (tx0) this.h;
        ux0 ux0Var = (ux0) mx1Var.d;
        Parcel parcelU = ux0Var.U();
        kt0.e(parcelU, tx0Var);
        ux0Var.K0(parcelU, 1);
    }

    public void b(Object obj, String str) {
        ((ArrayList) this.g).add(str + "=" + String.valueOf(obj));
    }

    @Override // defpackage.dd0
    /* JADX INFO: renamed from: c, reason: collision with other method in class */
    public void mo16c() {
        byte[] bArr = qz1.b;
        int length = bArr.length;
        ((cw1) this.h).z(0, bArr);
    }

    @Override // defpackage.rp1
    public /* synthetic */ void d(Object obj, cc3 cc3Var) {
        r93 r93Var = (r93) obj;
        r93Var.m((t33) this.h, new un1(cc3Var, ((z93) this.g).j));
    }

    @Override // defpackage.hn2
    /* JADX INFO: renamed from: e */
    public void mo5e(Object obj) {
        Bundle bundle;
        int i = 3;
        switch (this.f) {
            case 11:
                ((eb1) this.g).mo11b(obj);
                break;
            case 13:
                List list = ((pi1) obj).a;
                kd0 kd0Var = (kd0) this.g;
                si1 si1Var = (si1) this.h;
                Executor executor = si1Var.a;
                int i2 = 0;
                if (list == null || list.isEmpty()) {
                    executor.execute(new ri1(kd0Var, i2));
                } else {
                    hp hpVarL = kn2.g;
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        hpVarL = na1.L(na1.J(hpVarL, Throwable.class, new r21(i, kd0Var), executor), new qn0(si1Var, kd0Var, (hp) it.next(), 1), executor);
                    }
                    hpVarL.a(new in2(hpVarL, i2, new us2(si1Var, kd0Var)), executor);
                }
                break;
            case 16:
                p71 p71Var = (p71) this.h;
                r71 r71Var = (r71) this.g;
                ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) obj;
                try {
                    ix0 ix0Var = lx0.m2;
                    tu0 tu0Var = tu0.e;
                    if (!((Boolean) tu0Var.c.a(ix0Var)).booleanValue()) {
                        p71Var.w1(parcelFileDescriptor);
                    } else {
                        if (((Boolean) tu0Var.c.a(lx0.n2)).booleanValue() && (bundle = r71Var.r) != null) {
                            vc3.C.k.getClass();
                            bundle.putLong("binder-call-start", System.currentTimeMillis());
                        }
                        p71Var.q1(parcelFileDescriptor, r71Var);
                    }
                } catch (RemoteException e) {
                    jn.w("Service can't call client", e);
                    return;
                }
                break;
            default:
                ((u62) ((es0) this.h).k).c.L1(new rz1(i, (p62) this.g));
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00e5  */
    @Override // defpackage.dd0
    public cd0 f(od0 od0Var, long j) {
        int iD;
        long jO = od0Var.o();
        int iMin = (int) Math.min(20000L, od0Var.p() - jO);
        cw1 cw1Var = (cw1) this.h;
        cw1Var.y(iMin);
        od0Var.u(cw1Var.a, 0, iMin);
        int i = -1;
        int i2 = -1;
        long j2 = -9223372036854775807L;
        while (cw1Var.B() >= 4) {
            if (df0.d(cw1Var.b, cw1Var.a) != 442) {
                cw1Var.G(1);
            } else {
                cw1Var.G(4);
                long jA = bl0.a(cw1Var);
                if (jA != -9223372036854775807L) {
                    long jC = ((ry1) this.g).c(jA);
                    if (jC > j) {
                        return j2 == -9223372036854775807L ? new cd0(-1, jC, jO) : new cd0(0, -9223372036854775807L, jO + ((long) i2));
                    }
                    j2 = jC;
                    long j3 = 100000 + j2;
                    i2 = cw1Var.b;
                    if (j3 > j) {
                        return new cd0(0, -9223372036854775807L, jO + ((long) i2));
                    }
                }
                int i3 = cw1Var.c;
                if (cw1Var.B() >= 10) {
                    cw1Var.G(9);
                    int iK = cw1Var.K() & 7;
                    if (cw1Var.B() >= iK) {
                        cw1Var.G(iK);
                        if (cw1Var.B() >= 4) {
                            if (df0.d(cw1Var.b, cw1Var.a) == 443) {
                                cw1Var.G(4);
                                int iL = cw1Var.L();
                                if (cw1Var.B() >= iL) {
                                    cw1Var.G(iL);
                                    while (cw1Var.B() >= 4) {
                                        iD = df0.d(cw1Var.b, cw1Var.a);
                                        if (iD == 442) {
                                            break;
                                        }
                                        break;
                                    }
                                }
                                cw1Var.E(i3);
                            } else {
                                while (cw1Var.B() >= 4) {
                                    iD = df0.d(cw1Var.b, cw1Var.a);
                                    if (iD == 442 || iD == 441 || (iD >>> 8) != 1) {
                                        break;
                                    }
                                    cw1Var.G(4);
                                    if (cw1Var.B() < 2) {
                                        cw1Var.E(i3);
                                        break;
                                    }
                                    cw1Var.E(Math.min(cw1Var.c, cw1Var.b + cw1Var.L()));
                                }
                            }
                        } else {
                            cw1Var.E(i3);
                        }
                    } else {
                        cw1Var.E(i3);
                    }
                } else {
                    cw1Var.E(i3);
                }
                i = cw1Var.b;
            }
        }
        return j2 != -9223372036854775807L ? new cd0(-2, j2, jO + ((long) i)) : cd0.d;
    }

    @Override // defpackage.vu
    public void g(ve3 ve3Var) {
        ((Map) ((us2) this.h).h).remove((k30) this.g);
    }

    public Object h(q8 q8Var) {
        String str;
        String str2;
        Context context = (Context) this.g;
        vc2 vc2Var = (vc2) this.h;
        if (Build.VERSION.SDK_INT < 31) {
            q8Var.a("");
            return "";
        }
        try {
            String packageName = context.getPackageName();
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            int i = 2;
            int i2 = 0;
            String[] strArr = {vc2Var.N(), "308204433082032ba003020102020900c2e08746644a308d300d06092a864886f70d01010405003074310b3009060355040613025553311330110603550408130a43616c69666f726e6961311630140603550407130d4d6f756e7461696e205669657731143012060355040a130b476f6f676c6520496e632e3110300e060355040b1307416e64726f69643110300e06035504031307416e64726f6964301e170d3038303832313233313333345a170d3336303130373233313333345a3074310b3009060355040613025553311330110603550408130a43616c69666f726e6961311630140603550407130d4d6f756e7461696e205669657731143012060355040a130b476f6f676c6520496e632e3110300e060355040b1307416e64726f69643110300e06035504031307416e64726f696430820120300d06092a864886f70d01010105000382010d00308201080282010100ab562e00d83ba208ae0a966f124e29da11f2ab56d08f58e2cca91303e9b754d372f640a71b1dcb130967624e4656a7776a92193db2e5bfb724a91e77188b0e6a47a43b33d9609b77183145ccdf7b2e586674c9e1565b1f4c6a5955bff251a63dabf9c55c27222252e875e4f8154a645f897168c0b1bfc612eabf785769bb34aa7984dc7e2ea2764cae8307d8c17154d7ee5f64a51a44a602c249054157dc02cd5f5c0e55fbef8519fbe327f0b1511692c5a06f19d18385f5c4dbc2d6b93f68cc2979c70e18ab93866b3bd5db8999552a0e3b4c99df58fb918bedc182ba35e003c1b4b10dd244a8ee24fffd333872ab5221985edab0fc0d0b145b6aa192858e79020103a381d93081d6301d0603551d0e04160414c77d8cc2211756259a7fd382df6be398e4d786a53081a60603551d2304819e30819b8014c77d8cc2211756259a7fd382df6be398e4d786a5a178a4763074310b3009060355040613025553311330110603550408130a43616c69666f726e6961311630140603550407130d4d6f756e7461696e205669657731143012060355040a130b476f6f676c6520496e632e3110300e060355040b1307416e64726f69643110300e06035504031307416e64726f6964820900c2e08746644a308d300c0603551d13040530030101ff300d06092a864886f70d010104050003820101006dd252ceef85302c360aaace939bcff2cca904bb5d7a1661f8ae46b2994204d0ff4a68c7ed1a531ec4595a623ce60763b167297a7ae35712c407f208f0cb109429124d7b106219c084ca3eb3f9ad5fb871ef92269a8be28bf16d44c8d9a08e6cb2f005bb3fe2cb96447e868e731076ad45b33f6009ea19c161e62641aa99271dfd5228c5c587875ddb7f452758d661f6cc0cccb7352e424cc4365c523532f7325137593c4ae341f4db41edda0d0b1071a7c440f0fe9ea01cb627ca674369d084bd2fd911ff06cdbf2cfa10dc0f893ae35762919048c7efc64c7144178342f70581c9de573af55b390dd7fdb9418631895d5f759f30112687ff621410c069308a"};
            int i3 = 0;
            while (true) {
                if (i3 >= 2) {
                    str = "";
                    break;
                }
                str = strArr[i3];
                if (!TextUtils.isEmpty(str)) {
                    break;
                }
                i3++;
            }
            fl2 fl2Var = il2.f;
            byte[] bArrH = fl2Var.f().h(str);
            ArrayList arrayList = new ArrayList();
            arrayList.add(certificateFactory.generateCertificate(new ByteArrayInputStream(bArrH)));
            if (!Build.TYPE.equals("user")) {
                String[] strArr2 = {vc2Var.O(), "308204a830820390a003020102020900d585b86c7dd34ef5300d06092a864886f70d0101040500308194310b3009060355040613025553311330110603550408130a43616c69666f726e6961311630140603550407130d4d6f756e7461696e20566965773110300e060355040a1307416e64726f69643110300e060355040b1307416e64726f69643110300e06035504031307416e64726f69643122302006092a864886f70d0109011613616e64726f696440616e64726f69642e636f6d301e170d3038303431353233333635365a170d3335303930313233333635365a308194310b3009060355040613025553311330110603550408130a43616c69666f726e6961311630140603550407130d4d6f756e7461696e20566965773110300e060355040a1307416e64726f69643110300e060355040b1307416e64726f69643110300e06035504031307416e64726f69643122302006092a864886f70d0109011613616e64726f696440616e64726f69642e636f6d30820120300d06092a864886f70d01010105000382010d00308201080282010100d6ce2e080abfe2314dd18db3cfd3185cb43d33fa0c74e1bdb6d1db8913f62c5c39df56f846813d65bec0f3ca426b07c5a8ed5a3990c167e76bc999b927894b8f0b22001994a92915e572c56d2a301ba36fc5fc113ad6cb9e7435a16d23ab7dfaeee165e4df1f0a8dbda70a869d516c4e9d051196ca7c0c557f175bc375f948c56aae86089ba44f8aa6a4dd9a7dbf2c0a352282ad06b8cc185eb15579eef86d080b1d6189c0f9af98b1c2ebd107ea45abdb68a3c7838a5e5488c76c53d40b121de7bbd30e620c188ae1aa61dbbc87dd3c645f2f55f3d4c375ec4070a93f7151d83670c16a971abe5ef2d11890e1b8aef3298cf066bf9e6ce144ac9ae86d1c1b0f020103a381fc3081f9301d0603551d0e041604148d1cc5be954c433c61863a15b04cbc03f24fe0b23081c90603551d230481c13081be80148d1cc5be954c433c61863a15b04cbc03f24fe0b2a1819aa48197308194310b3009060355040613025553311330110603550408130a43616c69666f726e6961311630140603550407130d4d6f756e7461696e20566965773110300e060355040a1307416e64726f69643110300e060355040b1307416e64726f69643110300e06035504031307416e64726f69643122302006092a864886f70d0109011613616e64726f696440616e64726f69642e636f6d820900d585b86c7dd34ef5300c0603551d13040530030101ff300d06092a864886f70d0101040500038201010019d30cf105fb78923f4c0d7dd223233d40967acfce00081d5bd7c6e9d6ed206b0e11209506416ca244939913d26b4aa0e0f524cad2bb5c6e4ca1016a15916ea1ec5dc95a5e3a010036f49248d5109bbf2e1e618186673a3be56daf0b77b1c229e3c255e3e84c905d2387efba09cbf13b202b4e5a22c93263484a23d2fc29fa9f1939759733afd8aa160f4296c2d0163e8182859c6643e9c1962fa0c18333335bc090ff9a6b22ded1ad444229a539a94eefadabd065ced24b3e51e5dd7b66787bef12fe97fba484c423fb4ff8cc494c02f0f5051612ff6529393e8e46eac5bb21f277c151aa5f2aa627d1e89da70ab6033569de3b9897bfff7ca9da3e1243f60b"};
                while (true) {
                    if (i2 >= 2) {
                        str2 = "";
                        break;
                    }
                    str2 = strArr2[i2];
                    if (!TextUtils.isEmpty(str2)) {
                        break;
                    }
                    i2++;
                }
                arrayList.add(certificateFactory.generateCertificate(new ByteArrayInputStream(fl2Var.f().h(str2))));
            }
            context.getPackageManager().requestChecksums(packageName, false, 8, arrayList, new gq0(i, q8Var));
            return "";
        } catch (PackageManager.NameNotFoundException | NoClassDefFoundError | CertificateException unused) {
            q8Var.a("");
            return "";
        }
    }

    public KeyListener i(KeyListener keyListener) {
        if (keyListener instanceof NumberKeyListener) {
            return keyListener;
        }
        ((vg2) ((dr0) this.h).g).getClass();
        if (keyListener instanceof zg) {
            return keyListener;
        }
        if (keyListener == null) {
            return null;
        }
        return keyListener instanceof NumberKeyListener ? keyListener : new zg(keyListener);
    }

    public void j(AttributeSet attributeSet, int i) {
        TypedArray typedArrayObtainStyledAttributes = ((EditText) this.g).getContext().obtainStyledAttributes(attributeSet, lw.i, i, 0);
        try {
            boolean z = typedArrayObtainStyledAttributes.hasValue(14) ? typedArrayObtainStyledAttributes.getBoolean(14, true) : true;
            typedArrayObtainStyledAttributes.recycle();
            l(z);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public wg k(InputConnection inputConnection, EditorInfo editorInfo) {
        InputConnection inputConnection2;
        dr0 dr0Var = (dr0) this.h;
        if (inputConnection == null) {
            dr0Var.getClass();
            inputConnection2 = null;
        } else {
            vg2 vg2Var = (vg2) dr0Var.g;
            vg2Var.getClass();
            if (!(inputConnection instanceof wg)) {
                inputConnection = new wg(editorInfo, inputConnection, (EditText) vg2Var.g);
            }
            inputConnection2 = inputConnection;
        }
        return (wg) inputConnection2;
    }

    public void l(boolean z) {
        fh fhVar = (fh) ((vg2) ((dr0) this.h).g).h;
        if (fhVar.h != z) {
            if (fhVar.g != null) {
                qg qgVarA = qg.a();
                eh ehVar = fhVar.g;
                qgVarA.getClass();
                a23.f(ehVar, "initCallback cannot be null");
                ReentrantReadWriteLock reentrantReadWriteLock = qgVarA.a;
                reentrantReadWriteLock.writeLock().lock();
                try {
                    qgVarA.b.remove(ehVar);
                    reentrantReadWriteLock.writeLock().unlock();
                } catch (Throwable th) {
                    reentrantReadWriteLock.writeLock().unlock();
                    throw th;
                }
            }
            fhVar.h = z;
            if (z) {
                fh.a(fhVar.f, qg.a().b());
            }
        }
    }

    public Object m(eo2 eo2Var) {
        return ((rs2) this.g).a(eo2Var.a(), ((ss2) this.h).c());
    }

    public void n(int i) {
        LoudnessCodecController loudnessCodecController = (LoudnessCodecController) this.h;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
            this.h = null;
        }
        LoudnessCodecController loudnessCodecControllerCreate = LoudnessCodecController.create(i, cn2.f, new mc3());
        this.h = loudnessCodecControllerCreate;
        Iterator it = ((HashSet) this.g).iterator();
        while (it.hasNext()) {
            if (!loudnessCodecControllerCreate.addMediaCodec((MediaCodec) it.next())) {
                it.remove();
            }
        }
    }

    @Override // defpackage.pn1
    public void o(boolean z, Context context, ik1 ik1Var) throws on1 {
        try {
            s52 s52Var = (s52) ((ww1) this.g).b;
            s52Var.b(z);
            try {
                s52Var.a.f3(new ju(context));
            } catch (Throwable th) {
                throw new l52(th);
            }
        } catch (l52 e) {
            throw new on1(e.getCause());
        }
    }

    public void p(v63 v63Var) {
        ((List) this.g).add(v63Var);
    }

    @Override // defpackage.ke1
    public void q(String str, int i, String str2, boolean z) {
        switch (this.f) {
            case 14:
                jp1 jp1Var = (jp1) this.g;
                Map map = (Map) this.h;
                HashMap map2 = new HashMap();
                map2.put("messageType", "htmlLoaded");
                map2.put("id", (String) map.get("id"));
                jp1Var.b.d(map2);
                break;
            default:
                cb1 cb1Var = (cb1) this.h;
                if (!z) {
                    int length = String.valueOf(i).length();
                    StringBuilder sb = new StringBuilder(length + 55 + String.valueOf(str).length() + 15 + String.valueOf(str2).length());
                    sb.append("Ad Web View failed to load. Error code: ");
                    sb.append(i);
                    sb.append(", Description: ");
                    sb.append(str);
                    cb1Var.c(new Exception(ec.m(sb, ", Failing URL: ", str2)));
                } else {
                    if (((Boolean) tu0.e.c.a(lx0.p2)).booleanValue()) {
                        ec.q(vc3.C.k, (Bundle) this.g, "rendering-webview-load-html-end");
                    }
                    cb1Var.b(null);
                }
                break;
        }
    }

    public void s(v63 v63Var) {
        ((List) this.h).add(v63Var);
    }

    public w63 t() {
        return new w63((List) this.g, (List) this.h);
    }

    public String toString() {
        switch (this.f) {
            case 4:
                StringBuilder sb = new StringBuilder(100);
                sb.append(this.h.getClass().getSimpleName());
                sb.append('{');
                ArrayList arrayList = (ArrayList) this.g;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    sb.append((String) arrayList.get(i));
                    if (i < size - 1) {
                        sb.append(", ");
                    }
                }
                sb.append('}');
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public void u(MediaCodec mediaCodec) {
        LoudnessCodecController loudnessCodecController;
        if (!((HashSet) this.g).remove(mediaCodec) || (loudnessCodecController = (LoudnessCodecController) this.h) == null) {
            return;
        }
        loudnessCodecController.removeMediaCodec(mediaCodec);
    }

    @Override // defpackage.hn2
    public void w(Throwable th) {
        switch (this.f) {
            case 11:
                ((db1) this.h).mo3a();
                break;
            case 13:
                ((kd0) this.g).w(th);
                si1 si1Var = (si1) this.h;
                si1Var.getClass();
                za1.f.execute(new va1(13, si1Var));
                break;
            case 16:
                try {
                    p71 p71Var = (p71) this.h;
                    fu1 fu1VarS = a23.s(th);
                    p71Var.P2(new zs0(yd.v(th.getMessage()) ? fu1VarS.g : th.getMessage(), fu1VarS.f));
                } catch (RemoteException e) {
                    jn.w("Service can't call client", e);
                    return;
                }
                break;
            default:
                ((u62) ((es0) this.h).k).c.L1(new us2((p62) this.g, th, 23, false));
                break;
        }
    }

    @Override // defpackage.pn1
    public x42 c() {
        return (x42) this.h;
    }

    public /* synthetic */ vg2(Object obj, int i, Object obj2) {
        this.f = i;
        this.g = obj;
        this.h = obj2;
    }

    public /* synthetic */ vg2(Object obj, Object obj2, int i, boolean z) {
        this.f = i;
        this.h = obj;
        this.g = obj2;
    }

    public /* synthetic */ vg2(Object obj, Object obj2, Object obj3, int i) {
        this.f = i;
        this.g = obj2;
        this.h = obj3;
    }

    public vg2(int i, int i2) {
        List arrayList;
        Object arrayList2;
        this.f = 25;
        if (i == 0) {
            arrayList = Collections.EMPTY_LIST;
        } else {
            arrayList = new ArrayList(i);
        }
        this.g = arrayList;
        if (i2 == 0) {
            arrayList2 = Collections.EMPTY_LIST;
        } else {
            arrayList2 = new ArrayList(i2);
        }
        this.h = arrayList2;
    }

    public vg2(int i) {
        this.f = i;
        switch (i) {
            case 22:
                break;
            case 23:
                this(new r52(28), 23, new long[10]);
                break;
            case 27:
                this.g = new HashSet();
                break;
            default:
                gv1 gv1Var = new gv1(7, (byte) 0);
                this.g = gv1Var;
                this.h = new w32(2, gv1Var);
                break;
        }
    }

    public /* synthetic */ vg2(Object obj) {
        this.f = 4;
        this.h = obj;
        this.g = new ArrayList();
    }

    public /* synthetic */ vg2(ry1 ry1Var) {
        this.f = 8;
        this.g = ry1Var;
        this.h = new cw1();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public vg2(un1 un1Var) {
        this(23);
        this.f = 23;
        r(this, un1Var);
    }

    public vg2(EditText editText, int i) {
        this.f = i;
        switch (i) {
            case 3:
                this.g = editText;
                fh fhVar = new fh(editText);
                this.h = fhVar;
                editText.addTextChangedListener(fhVar);
                if (ug.b == null) {
                    synchronized (ug.a) {
                        try {
                            if (ug.b == null) {
                                ug ugVar = new ug();
                                try {
                                    ug.c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, ug.class.getClassLoader());
                                    break;
                                } catch (Throwable unused) {
                                }
                                ug.b = ugVar;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                        break;
                    }
                }
                editText.setEditableFactory(ug.b);
                return;
            default:
                this.g = editText;
                this.h = new dr0(editText);
                return;
        }
    }

    public vg2(q3 q3Var) {
        this.f = 1;
        this.h = q3Var;
    }
}
