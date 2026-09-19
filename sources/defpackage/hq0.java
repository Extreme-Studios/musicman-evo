package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Binder;
import android.os.Build;
import android.text.TextUtils;
import android.util.Base64;
import android.webkit.WebSettings;
import dalvik.system.DexClassLoader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hq0 implements Callable {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;

    public hq0(oc2 oc2Var, Context context) {
        this.a = 3;
        this.c = context;
        Objects.requireNonNull(oc2Var);
        this.b = oc2Var;
    }

    /* JADX WARN: Code duplicated, block: B:137:0x0398  */
    /* JADX WARN: Code duplicated, block: B:177:0x043e  */
    @Override // java.util.concurrent.Callable
    public final Object call() throws ExecutionException, ky1, InterruptedException {
        String strU0;
        int i;
        Future futureT;
        u71 u71VarA;
        SharedPreferences sharedPreferences;
        cb1 cb1Var;
        int i2 = 0;
        switch (this.a) {
            case 0:
                p83 p83Var = (p83) this.b;
                Context context = (Context) this.c;
                ap0 ap0Var = (ap0) p83Var.i;
                dr0 dr0Var = (dr0) p83Var.h;
                if (dr0Var != null) {
                    xn2 xn2Var = (xn2) dr0Var.g;
                    if (ap0Var.C() || xn2Var == null || (Build.VERSION.SDK_INT >= 31 && !xn2Var.isDone())) {
                        strU0 = "E";
                    } else {
                        try {
                            sp0 sp0Var = (sp0) xn2Var.get(ap0Var.A(), TimeUnit.MILLISECONDS);
                            if (sp0Var != null && sp0Var.Z()) {
                                strU0 = sp0Var.u0();
                            } else {
                                strU0 = "E";
                            }
                            break;
                        } catch (InterruptedException | ExecutionException | TimeoutException unused) {
                        }
                    }
                } else {
                    strU0 = "E";
                }
                if (strU0.equals("E") && (i = Build.VERSION.SDK_INT) >= 31) {
                    try {
                        if (i < 31) {
                            futureT = na1.t("");
                        } else {
                            try {
                                String packageName = context.getPackageName();
                                CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
                                fl2 fl2Var = il2.f;
                                byte[] bArrH = fl2Var.f().h("308204433082032ba003020102020900c2e08746644a308d300d06092a864886f70d01010405003074310b3009060355040613025553311330110603550408130a43616c69666f726e6961311630140603550407130d4d6f756e7461696e205669657731143012060355040a130b476f6f676c6520496e632e3110300e060355040b1307416e64726f69643110300e06035504031307416e64726f6964301e170d3038303832313233313333345a170d3336303130373233313333345a3074310b3009060355040613025553311330110603550408130a43616c69666f726e6961311630140603550407130d4d6f756e7461696e205669657731143012060355040a130b476f6f676c6520496e632e3110300e060355040b1307416e64726f69643110300e06035504031307416e64726f696430820120300d06092a864886f70d01010105000382010d00308201080282010100ab562e00d83ba208ae0a966f124e29da11f2ab56d08f58e2cca91303e9b754d372f640a71b1dcb130967624e4656a7776a92193db2e5bfb724a91e77188b0e6a47a43b33d9609b77183145ccdf7b2e586674c9e1565b1f4c6a5955bff251a63dabf9c55c27222252e875e4f8154a645f897168c0b1bfc612eabf785769bb34aa7984dc7e2ea2764cae8307d8c17154d7ee5f64a51a44a602c249054157dc02cd5f5c0e55fbef8519fbe327f0b1511692c5a06f19d18385f5c4dbc2d6b93f68cc2979c70e18ab93866b3bd5db8999552a0e3b4c99df58fb918bedc182ba35e003c1b4b10dd244a8ee24fffd333872ab5221985edab0fc0d0b145b6aa192858e79020103a381d93081d6301d0603551d0e04160414c77d8cc2211756259a7fd382df6be398e4d786a53081a60603551d2304819e30819b8014c77d8cc2211756259a7fd382df6be398e4d786a5a178a4763074310b3009060355040613025553311330110603550408130a43616c69666f726e6961311630140603550407130d4d6f756e7461696e205669657731143012060355040a130b476f6f676c6520496e632e3110300e060355040b1307416e64726f69643110300e06035504031307416e64726f6964820900c2e08746644a308d300c0603551d13040530030101ff300d06092a864886f70d010104050003820101006dd252ceef85302c360aaace939bcff2cca904bb5d7a1661f8ae46b2994204d0ff4a68c7ed1a531ec4595a623ce60763b167297a7ae35712c407f208f0cb109429124d7b106219c084ca3eb3f9ad5fb871ef92269a8be28bf16d44c8d9a08e6cb2f005bb3fe2cb96447e868e731076ad45b33f6009ea19c161e62641aa99271dfd5228c5c587875ddb7f452758d661f6cc0cccb7352e424cc4365c523532f7325137593c4ae341f4db41edda0d0b1071a7c440f0fe9ea01cb627ca674369d084bd2fd911ff06cdbf2cfa10dc0f893ae35762919048c7efc64c7144178342f70581c9de573af55b390dd7fdb9418631895d5f759f30112687ff621410c069308a");
                                ArrayList arrayList = new ArrayList();
                                arrayList.add(certificateFactory.generateCertificate(new ByteArrayInputStream(bArrH)));
                                if (!Build.TYPE.equals("user")) {
                                    arrayList.add(certificateFactory.generateCertificate(new ByteArrayInputStream(fl2Var.f().h("308204a830820390a003020102020900d585b86c7dd34ef5300d06092a864886f70d0101040500308194310b3009060355040613025553311330110603550408130a43616c69666f726e6961311630140603550407130d4d6f756e7461696e20566965773110300e060355040a1307416e64726f69643110300e060355040b1307416e64726f69643110300e06035504031307416e64726f69643122302006092a864886f70d0109011613616e64726f696440616e64726f69642e636f6d301e170d3038303431353233333635365a170d3335303930313233333635365a308194310b3009060355040613025553311330110603550408130a43616c69666f726e6961311630140603550407130d4d6f756e7461696e20566965773110300e060355040a1307416e64726f69643110300e060355040b1307416e64726f69643110300e06035504031307416e64726f69643122302006092a864886f70d0109011613616e64726f696440616e64726f69642e636f6d30820120300d06092a864886f70d01010105000382010d00308201080282010100d6ce2e080abfe2314dd18db3cfd3185cb43d33fa0c74e1bdb6d1db8913f62c5c39df56f846813d65bec0f3ca426b07c5a8ed5a3990c167e76bc999b927894b8f0b22001994a92915e572c56d2a301ba36fc5fc113ad6cb9e7435a16d23ab7dfaeee165e4df1f0a8dbda70a869d516c4e9d051196ca7c0c557f175bc375f948c56aae86089ba44f8aa6a4dd9a7dbf2c0a352282ad06b8cc185eb15579eef86d080b1d6189c0f9af98b1c2ebd107ea45abdb68a3c7838a5e5488c76c53d40b121de7bbd30e620c188ae1aa61dbbc87dd3c645f2f55f3d4c375ec4070a93f7151d83670c16a971abe5ef2d11890e1b8aef3298cf066bf9e6ce144ac9ae86d1c1b0f020103a381fc3081f9301d0603551d0e041604148d1cc5be954c433c61863a15b04cbc03f24fe0b23081c90603551d230481c13081be80148d1cc5be954c433c61863a15b04cbc03f24fe0b2a1819aa48197308194310b3009060355040613025553311330110603550408130a43616c69666f726e6961311630140603550407130d4d6f756e7461696e20566965773110300e060355040a1307416e64726f69643110300e060355040b1307416e64726f69643110300e06035504031307416e64726f69643122302006092a864886f70d0109011613616e64726f696440616e64726f69642e636f6d820900d585b86c7dd34ef5300c0603551d13040530030101ff300d06092a864886f70d0101040500038201010019d30cf105fb78923f4c0d7dd223233d40967acfce00081d5bd7c6e9d6ed206b0e11209506416ca244939913d26b4aa0e0f524cad2bb5c6e4ca1016a15916ea1ec5dc95a5e3a010036f49248d5109bbf2e1e618186673a3be56daf0b77b1c229e3c255e3e84c905d2387efba09cbf13b202b4e5a22c93263484a23d2fc29fa9f1939759733afd8aa160f4296c2d0163e8182859c6643e9c1962fa0c18333335bc090ff9a6b22ded1ad444229a539a94eefadabd065ced24b3e51e5dd7b66787bef12fe97fba484c423fb4ff8cc494c02f0f5051612ff6529393e8e46eac5bb21f277c151aa5f2aa627d1e89da70ab6033569de3b9897bfff7ca9da3e1243f60b"))));
                                }
                                gq0 gq0Var = new gq0();
                                context.getPackageManager().requestChecksums(packageName, false, 8, arrayList, gq0Var);
                                futureT = (tn2) gq0Var.b;
                            } catch (Throwable unused2) {
                                futureT = na1.t("");
                            }
                        }
                        String str = (String) futureT.get();
                        if (true != yd.v(str)) {
                            strU0 = str;
                        }
                    } catch (InterruptedException | ExecutionException unused3) {
                    }
                }
                if (!strU0.equals("E") || ap0Var.z()) {
                    return strU0;
                }
                try {
                    return p83.w(context);
                } catch (ClassCastException unused4) {
                    return strU0;
                }
            case 1:
                nr0 nr0Var = (nr0) this.b;
                dr0 dr0Var2 = nr0Var.j;
                if ((dr0Var2 != null ? (xn2) dr0Var2.g : nr0Var.i) != null) {
                    (dr0Var2 != null ? (xn2) dr0Var2.g : nr0Var.i).get();
                }
                sp0 sp0VarB = nr0Var.b();
                if (sp0VarB != null) {
                    try {
                        hp0 hp0Var = (hp0) this.c;
                        synchronized (hp0Var) {
                            try {
                                byte[] bArrB = sp0VarB.b();
                                v13 v13Var = v13.a;
                                int i3 = h13.a;
                                hp0Var.a(bArrB, v13.b);
                            } catch (Throwable th) {
                                throw th;
                            }
                            break;
                        }
                    } catch (NullPointerException | o23 unused5) {
                    }
                }
                return null;
            case 2:
                return ((h30) this.b).getClickSignals((String) this.c);
            case 3:
                oc2 oc2Var = (oc2) this.b;
                WeakHashMap weakHashMap = (WeakHashMap) oc2Var.g;
                Context context2 = (Context) this.c;
                v71 v71Var = (v71) weakHashMap.get(context2);
                if (v71Var != null) {
                    long jLongValue = v71Var.a + ((Long) jy0.d.u()).longValue();
                    vc3.C.k.getClass();
                    if (jLongValue < System.currentTimeMillis()) {
                        u71VarA = new t71(context2).a();
                    } else {
                        u71VarA = new t71(context2, v71Var.b).a();
                    }
                } else {
                    u71VarA = new t71(context2).a();
                }
                ((WeakHashMap) oc2Var.g).put(context2, new v71(oc2Var, u71VarA));
                return u71VarA;
            case 4:
                return (String) ((aa1) this.b).k((Context) this.c, "getAppInstanceId");
            case 5:
                Context context3 = (Context) this.c;
                Context context4 = (Context) this.b;
                if (context3 != null) {
                    jn.p("Attempting to read user agent from Google Play Services.");
                    sharedPreferences = context3.getSharedPreferences("admob_user_agent", 0);
                } else {
                    jn.p("Attempting to read user agent from local cache.");
                    sharedPreferences = context4.getSharedPreferences("admob_user_agent", 0);
                    i2 = 1;
                }
                String string = sharedPreferences.getString("user_agent", "");
                if (TextUtils.isEmpty(string)) {
                    jn.p("Reading user agent from WebSettings");
                    string = WebSettings.getDefaultUserAgent(context4);
                    if (i2 != 0) {
                        sharedPreferences.edit().putString("user_agent", string).apply();
                        jn.p("Persisting user agent.");
                    }
                }
                return string;
            case 6:
                dt1 dt1Var = (dt1) this.b;
                a72 a72Var = (a72) this.c;
                dt1Var.e.b(Boolean.TRUE);
                a72Var.b(true);
                dt1Var.p.b(a72Var.m());
                return null;
            case 7:
                u40 u40Var = (u40) this.b;
                r71 r71Var = (r71) this.c;
                su1 su1Var = (su1) u40Var.i;
                synchronized (su1Var.g) {
                    try {
                        if (su1Var.h) {
                            cb1Var = su1Var.f;
                        } else {
                            su1Var.h = true;
                            su1Var.j = r71Var;
                            su1Var.k.m();
                            cb1Var = su1Var.f;
                            cb1Var.f.a(new va1(25, su1Var), za1.g);
                            wu1.b(su1Var.m, cb1Var, su1Var.n);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return (ev1) cb1Var.f.get(((Integer) tu0.e.c.a(lx0.Z5)).intValue(), TimeUnit.SECONDS);
            case 8:
                return (ev1) ((cb1) ((su1) ((kd0) this.b).j).c((r71) this.c)).f.get(((Integer) tu0.e.c.a(lx0.Z5)).intValue(), TimeUnit.SECONDS);
            case 9:
                ru1 ru1Var = (ru1) this.b;
                qv1 qv1Var = (qv1) this.c;
                ru1Var.b(35);
                int i4 = -1;
                while (true) {
                    try {
                        ix0 ix0Var = lx0.A7;
                        tu0 tu0Var = tu0.e;
                        if (i2 >= ((Integer) tu0Var.c.a(ix0Var)).intValue()) {
                            StringBuilder sb = new StringBuilder(String.valueOf(i4).length() + 40);
                            sb.append("Received HTTP error code from ad server:");
                            sb.append(i4);
                            throw new ky1(sb.toString(), 1);
                        }
                        Context context5 = ru1Var.b;
                        String str2 = ru1Var.c.f;
                        Binder.getCallingUid();
                        rv1 rv1VarA = new xc(context5, str2, null).b(qv1Var);
                        int i5 = rv1VarA.a;
                        if (((Boolean) tu0Var.c.a(lx0.B7)).booleanValue()) {
                            ru1Var.i.b("fr", String.valueOf(i2));
                        }
                        if (i5 == 200) {
                            ru1Var.b(36);
                            return rv1VarA.c;
                        }
                        i2++;
                        i4 = i5;
                    } catch (Exception e) {
                        throw new ky1(e.getMessage() == null ? "Fetch failed." : e.getMessage(), e);
                    }
                }
                break;
            case 10:
                rv1 rv1Var = (rv1) ((p62) this.b).h.get();
                Object obj = ((kn2) this.c).f;
                return new lv1(rv1Var, ((kv1) obj).b, ((kv1) obj).a);
            case 11:
                f82 f82Var = (f82) this.b;
                String str3 = (String) this.c;
                id3 id3Var = f82Var.d;
                ix0 ix0Var2 = lx0.C9;
                tu0 tu0Var2 = tu0.e;
                if (((Boolean) tu0Var2.c.a(ix0Var2)).booleanValue()) {
                    vc3 vc3Var = vc3.C;
                    if (vc3Var.c.F(str3) || vc3Var.c.G(str3)) {
                        e63 e63Var = f82Var.g.c;
                        String strEncodeToString = e63Var != null ? Base64.encodeToString(e63Var.b(), 10) : null;
                        HashMap map = new HashMap();
                        if (strEncodeToString != null) {
                            map.put((String) tu0Var2.c.a(lx0.D9), strEncodeToString);
                        }
                        return id3Var.a(str3, map);
                    }
                }
                return id3Var.a(str3, null);
            case 12:
                kd2 kd2Var = (kd2) this.b;
                Object obj2 = this.c;
                synchronized (kd2Var) {
                    File file = kd2Var.a;
                    i8.A(file);
                    String parent = file.getParent();
                    String name = file.getName();
                    StringBuilder sb2 = new StringBuilder(String.valueOf(name).length() + 5);
                    sb2.append(name);
                    sb2.append(".temp");
                    File file2 = new File(parent, sb2.toString());
                    try {
                        FileOutputStream fileOutputStream = new FileOutputStream(file2);
                        try {
                            kd2Var.c.f(obj2, fileOutputStream);
                            fileOutputStream.close();
                            if (!file2.renameTo(kd2Var.a)) {
                                throw new IOException("Failed to rename file.");
                            }
                        } catch (Throwable th3) {
                            try {
                                fileOutputStream.close();
                                break;
                            } catch (Throwable th4) {
                                th3.addSuppressed(th4);
                            }
                            throw th3;
                        }
                    } catch (IOException e2) {
                        file2.delete();
                        throw e2;
                    }
                }
                return null;
            case 13:
                cf2 cf2Var = (cf2) this.b;
                df2 df2Var = (df2) this.c;
                DexClassLoader dexClassLoader = cf2Var.l;
                bf2 bf2Var = cf2Var.d;
                byte[] bArr = cf2Var.k;
                String str4 = df2Var.a;
                String str5 = df2Var.b;
                Class<?>[] clsArr = df2Var.c;
                try {
                    try {
                        bf2Var.getClass();
                        return dexClassLoader.loadClass(new String(bf2.a(str4, bArr), "UTF-8")).getMethod(new String(bf2.a(str5, bArr), "UTF-8"), clsArr);
                    } catch (af2 | UnsupportedEncodingException | ClassNotFoundException | NoSuchMethodException | NullPointerException e3) {
                        e = e3;
                        throw new IllegalStateException(e);
                    }
                } catch (UnsupportedEncodingException e4) {
                    e = e4;
                    throw new IllegalStateException(e);
                } catch (ClassNotFoundException e5) {
                    e = e5;
                    throw new IllegalStateException(e);
                } catch (NoSuchMethodException e6) {
                    e = e6;
                    throw new IllegalStateException(e);
                } catch (NullPointerException e7) {
                    e = e7;
                    throw new IllegalStateException(e);
                }
            case 14:
                hg2 hg2Var = (hg2) this.b;
                Context context6 = (Context) this.c;
                dh2 dh2Var = hg2Var.e;
                db2 db2VarB = hg2Var.a.b();
                if (db2VarB == null) {
                    dh2Var.b(15004);
                    return "";
                }
                String strD = db2VarB.d(context6);
                if (strD != null) {
                    return strD;
                }
                dh2Var.b(15006);
                return "";
            case 15:
                ig2 ig2Var = (ig2) this.b;
                Context context7 = (Context) this.c;
                HashMap map2 = new HashMap();
                ig2Var.e.e(20106, new ib(ig2Var, map2, context7));
                String strI = ig2Var.i(map2);
                map2.clear();
                return strI;
            case 16:
                return ((y73) this.b).k((Context) this.c);
            default:
                e32 e32Var = zb3.l;
                String absolutePath = ((Context) this.c).getDatabasePath("com.google.android.gms.ads.db").getAbsolutePath();
                WebSettings webSettings = (WebSettings) this.b;
                webSettings.setDatabasePath(absolutePath);
                webSettings.setDatabaseEnabled(true);
                webSettings.setDomStorageEnabled(true);
                webSettings.setDisplayZoomControls(false);
                webSettings.setBuiltInZoomControls(true);
                webSettings.setSupportZoom(true);
                if (((Boolean) tu0.e.c.a(lx0.T0)).booleanValue()) {
                    webSettings.setTextZoom(100);
                }
                webSettings.setAllowContentAccess(false);
                return Boolean.TRUE;
        }
    }

    public /* synthetic */ hq0(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public /* synthetic */ hq0(Context context, Context context2) {
        this.a = 5;
        this.c = context;
        this.b = context2;
    }
}
