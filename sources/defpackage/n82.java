package defpackage;

import android.net.ConnectivityManager;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class n82 extends jt0 implements ze1 {
    public final o82 f;
    public final h82 g;

    public n82(o82 o82Var, h82 h82Var) {
        super("com.google.android.gms.ads.internal.client.IAdPreloader");
        this.f = o82Var;
        this.g = h82Var;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.jt0
    public final boolean A3(int i, Parcel parcel, Parcel parcel2) {
        HashMap map;
        k82 k82Var;
        bb1 bb1Var = null;
        kc1 kc1Var = null;
        int i2 = 0;
        switch (i) {
            case 1:
                ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(ab2.CREATOR);
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdPreloadCallback");
                    bb1Var = iInterfaceQueryLocalInterface instanceof bb1 ? (bb1) iInterfaceQueryLocalInterface : new bb1(strongBinder, "com.google.android.gms.ads.internal.client.IAdPreloadCallback", 2);
                }
                kt0.f(parcel);
                B3(arrayListCreateTypedArrayList, bb1Var);
                parcel2.writeNoException();
                return true;
            case 2:
                String string = parcel.readString();
                kt0.f(parcel);
                boolean zC3 = C3(string);
                parcel2.writeNoException();
                parcel2.writeInt(zC3 ? 1 : 0);
                return true;
            case 3:
                String string2 = parcel.readString();
                kt0.f(parcel);
                l81 l81VarD3 = D3(string2);
                parcel2.writeNoException();
                kt0.e(parcel2, l81VarD3);
                return true;
            case 4:
                String string3 = parcel.readString();
                kt0.f(parcel);
                boolean zE3 = E3(string3);
                parcel2.writeNoException();
                parcel2.writeInt(zE3 ? 1 : 0);
                return true;
            case 5:
                String string4 = parcel.readString();
                kt0.f(parcel);
                ku0 ku0VarF3 = F3(string4);
                parcel2.writeNoException();
                kt0.e(parcel2, ku0VarF3);
                return true;
            case 6:
                String string5 = parcel.readString();
                kt0.f(parcel);
                boolean zG3 = G3(string5);
                parcel2.writeNoException();
                parcel2.writeInt(zG3 ? 1 : 0);
                return true;
            case 7:
                String string6 = parcel.readString();
                kt0.f(parcel);
                n71 n71VarH3 = H3(string6);
                parcel2.writeNoException();
                kt0.e(parcel2, n71VarH3);
                return true;
            case 8:
                j41.B3(parcel.readStrongBinder());
                kt0.f(parcel);
                parcel2.writeNoException();
                return true;
            case 9:
                String string7 = parcel.readString();
                ab2 ab2Var = (ab2) kt0.b(parcel, ab2.CREATOR);
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdPreloadCallbackV2");
                    kc1Var = iInterfaceQueryLocalInterface2 instanceof kc1 ? (kc1) iInterfaceQueryLocalInterface2 : new kc1(strongBinder2, "com.google.android.gms.ads.internal.client.IAdPreloadCallbackV2", 2);
                }
                kt0.f(parcel);
                boolean zI3 = I3(string7, ab2Var, kc1Var);
                parcel2.writeNoException();
                parcel2.writeInt(zI3 ? 1 : 0);
                return true;
            case 10:
                int i3 = parcel.readInt();
                String string8 = parcel.readString();
                kt0.f(parcel);
                boolean zJ3 = J3(string8, i3);
                parcel2.writeNoException();
                parcel2.writeInt(zJ3 ? 1 : 0);
                return true;
            case 11:
                String string9 = parcel.readString();
                kt0.f(parcel);
                n71 n71VarK3 = K3(string9);
                parcel2.writeNoException();
                kt0.e(parcel2, n71VarK3);
                return true;
            case 12:
                String string10 = parcel.readString();
                kt0.f(parcel);
                ku0 ku0VarL3 = L3(string10);
                parcel2.writeNoException();
                kt0.e(parcel2, ku0VarL3);
                return true;
            case 13:
                String string11 = parcel.readString();
                kt0.f(parcel);
                l81 l81VarM3 = M3(string11);
                parcel2.writeNoException();
                kt0.e(parcel2, l81VarM3);
                return true;
            case 14:
                int i4 = parcel.readInt();
                String string12 = parcel.readString();
                kt0.f(parcel);
                ab2 ab2VarN3 = N3(string12, i4);
                parcel2.writeNoException();
                kt0.d(parcel2, ab2VarN3);
                return true;
            case 15:
                int i5 = parcel.readInt();
                kt0.f(parcel);
                h82 h82Var = this.g;
                synchronized (h82Var) {
                    try {
                        map = new HashMap();
                        h2 h2VarA = h2.a(i5);
                        if (h2VarA != null) {
                            HashMap map2 = h82Var.a;
                            if (map2.containsKey(h2VarA)) {
                                for (k82 k82Var2 : ((Map) map2.get(h2VarA)).values()) {
                                    map.put(k82Var2.k, k82Var2.e);
                                }
                                bz1 bz1Var = h82Var.c;
                                h82Var.g.getClass();
                                bz1Var.p("pgcs", System.currentTimeMillis(), null, null, h2VarA, -1, -1, map.size());
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                Bundle bundle = new Bundle();
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    ab2 ab2Var2 = (ab2) entry.getValue();
                    Parcel parcelObtain = Parcel.obtain();
                    ab2Var2.writeToParcel(parcelObtain, 0);
                    byte[] bArrMarshall = parcelObtain.marshall();
                    parcelObtain.recycle();
                    bundle.putByteArray(str, bArrMarshall);
                }
                parcel2.writeNoException();
                kt0.d(parcel2, bundle);
                return true;
            case 16:
                int i6 = parcel.readInt();
                String string13 = parcel.readString();
                kt0.f(parcel);
                h2 h2VarA2 = h2.a(i6);
                if (h2VarA2 != null) {
                    h82 h82Var2 = this.g;
                    synchronized (h82Var2) {
                        HashMap map3 = h82Var2.a;
                        if (map3.containsKey(h2VarA2)) {
                            k82 k82Var3 = (k82) ((Map) map3.get(h2VarA2)).get(string13);
                            int iM = k82Var3 != null ? k82Var3.m() : 0;
                            bz1 bz1Var2 = h82Var2.c;
                            h82Var2.g.getClass();
                            bz1Var2.p("pnav", System.currentTimeMillis(), string13, k82Var3 != null ? k82Var3.e.f : null, h2VarA2, k82Var3 == null ? -1 : k82Var3.e.i, iM, 1);
                            i2 = iM;
                        }
                    }
                }
                parcel2.writeNoException();
                parcel2.writeInt(i2);
                return true;
            case 17:
                int i7 = parcel.readInt();
                String string14 = parcel.readString();
                kt0.f(parcel);
                h2 h2VarA3 = h2.a(i7);
                if (h2VarA3 != null) {
                    h82 h82Var3 = this.g;
                    synchronized (h82Var3) {
                        HashMap map4 = h82Var3.a;
                        if (map4.containsKey(h2VarA3) && (k82Var = (k82) ((Map) map4.get(h2VarA3)).get(string14)) != null) {
                            ((Map) map4.get(h2VarA3)).remove(string14);
                            k82Var.f.set(false);
                            k82Var.n.set(false);
                            k82Var.i.clear();
                            bz1 bz1Var3 = h82Var3.c;
                            h82Var3.g.getClass();
                            long jCurrentTimeMillis = System.currentTimeMillis();
                            ab2 ab2Var3 = k82Var.e;
                            bz1Var3.p("pd", jCurrentTimeMillis, string14, ab2Var3.f, h2VarA3, ab2Var3.i, k82Var.m(), 1);
                            i2 = 1;
                        }
                    }
                }
                parcel2.writeNoException();
                parcel2.writeInt(i2);
                return true;
            case 18:
                int i8 = parcel.readInt();
                kt0.f(parcel);
                h82 h82Var4 = this.g;
                synchronized (h82Var4) {
                    try {
                        h2 h2VarA4 = h2.a(i8);
                        if (h2VarA4 != null) {
                            HashMap map5 = h82Var4.a;
                            if (map5.containsKey(h2VarA4)) {
                                Map map6 = (Map) map5.get(h2VarA4);
                                int size = map6.size();
                                for (String str2 : map6.keySet()) {
                                    k82 k82Var4 = (k82) map6.get(str2);
                                    if (k82Var4 != null) {
                                        k82Var4.f.set(false);
                                        k82Var4.n.set(false);
                                        k82Var4.i.clear();
                                        jn.R("Destroyed ad preloader for preloadId: ".concat(String.valueOf(str2)));
                                    }
                                }
                                map6.clear();
                                jn.R("Destroyed all ad preloaders for ad format: ".concat(h2VarA4.toString()));
                                bz1 bz1Var4 = h82Var4.c;
                                h82Var4.g.getClass();
                                bz1Var4.p("pda", System.currentTimeMillis(), null, null, h2VarA4, -1, -1, size);
                            }
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0069 A[Catch: all -> 0x0031, TryCatch #0 {all -> 0x0031, blocks: (B:4:0x0003, B:35:0x008c, B:37:0x009f, B:40:0x00b9, B:42:0x00bd, B:43:0x00c4, B:44:0x00cd, B:49:0x00df, B:50:0x00e0, B:52:0x00ec, B:53:0x00f0, B:62:0x0124, B:63:0x0125, B:7:0x000e, B:9:0x0012, B:21:0x0030, B:24:0x0035, B:26:0x003b, B:29:0x0040, B:34:0x0080, B:32:0x004c, B:33:0x0069, B:10:0x0013, B:12:0x0017, B:18:0x002d, B:17:0x0028, B:45:0x00ce, B:47:0x00d9, B:48:0x00da, B:60:0x0122), top: B:68:0x0003, inners: #1, #3, #4 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x009f A[Catch: all -> 0x0031, TryCatch #0 {all -> 0x0031, blocks: (B:4:0x0003, B:35:0x008c, B:37:0x009f, B:40:0x00b9, B:42:0x00bd, B:43:0x00c4, B:44:0x00cd, B:49:0x00df, B:50:0x00e0, B:52:0x00ec, B:53:0x00f0, B:62:0x0124, B:63:0x0125, B:7:0x000e, B:9:0x0012, B:21:0x0030, B:24:0x0035, B:26:0x003b, B:29:0x0040, B:34:0x0080, B:32:0x004c, B:33:0x0069, B:10:0x0013, B:12:0x0017, B:18:0x002d, B:17:0x0028, B:45:0x00ce, B:47:0x00d9, B:48:0x00da, B:60:0x0122), top: B:68:0x0003, inners: #1, #3, #4 }] */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00e0, code lost:
    
        r8 = 0;
        r10 = defpackage.f32.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00ea, code lost:
    
        if (r0.containsKey(r7) == false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00ec, code lost:
    
        r8 = r0.get(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00f0, code lost:
    
        r0.put(r7, java.lang.Integer.valueOf(((java.lang.Integer) r8).intValue() + 1));
        r9 = new defpackage.q82(new defpackage.p83(r6, 22, r7));
        r6 = r5.i;
        r13.h.getClass();
        r5.d(r6, java.lang.System.currentTimeMillis(), r9, "1");
     */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void B3(java.util.ArrayList r14, defpackage.bb1 r15) {
        /*
            Method dump skipped, instruction units count: 311
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n82.B3(java.util.ArrayList, bb1):void");
    }

    public final boolean C3(String str) {
        boolean zE;
        o82 o82Var = this.f;
        synchronized (o82Var) {
            zE = o82Var.e(str, h2.REWARDED);
        }
        return zE;
    }

    public final l81 D3(String str) {
        l81 l81Var;
        o82 o82Var = this.f;
        synchronized (o82Var) {
            l81Var = (l81) o82Var.f(h2.REWARDED, l81.class, str);
        }
        return l81Var;
    }

    public final boolean E3(String str) {
        boolean zE;
        o82 o82Var = this.f;
        synchronized (o82Var) {
            zE = o82Var.e(str, h2.APP_OPEN_AD);
        }
        return zE;
    }

    public final ku0 F3(String str) {
        ku0 ku0Var;
        o82 o82Var = this.f;
        synchronized (o82Var) {
            ku0Var = (ku0) o82Var.f(h2.APP_OPEN_AD, ku0.class, str);
        }
        return ku0Var;
    }

    public final boolean G3(String str) {
        boolean zE;
        o82 o82Var = this.f;
        synchronized (o82Var) {
            zE = o82Var.e(str, h2.INTERSTITIAL);
        }
        return zE;
    }

    public final n71 H3(String str) {
        n71 n71Var;
        o82 o82Var = this.f;
        synchronized (o82Var) {
            n71Var = (n71) o82Var.f(h2.INTERSTITIAL, n71.class, str);
        }
        return n71Var;
    }

    public final boolean I3(String str, ab2 ab2Var, kc1 kc1Var) {
        k82 k82VarB;
        h82 h82Var = this.g;
        synchronized (h82Var) {
            try {
                if (!h82Var.f.getAndSet(true)) {
                    if (h82Var.e == null) {
                        synchronized (h82Var) {
                            if (h82Var.e == null) {
                                try {
                                    h82Var.e = (ConnectivityManager) h82Var.d.getSystemService("connectivity");
                                } catch (ClassCastException e) {
                                    jn.V("Failed to get connectivity manager", e);
                                }
                            }
                        }
                    }
                    if (!ej1.k() || h82Var.e == null) {
                        h82Var.h = new AtomicInteger(((Integer) tu0.e.c.a(lx0.F)).intValue());
                    } else {
                        try {
                            h82Var.e.registerDefaultNetworkCallback(new tt(h82Var));
                        } catch (RuntimeException e2) {
                            jn.V("Failed to register network callback", e2);
                            h82Var.h = new AtomicInteger(((Integer) tu0.e.c.a(lx0.F)).intValue());
                        }
                    }
                    vc3.C.g.f(new qu0(h82Var));
                }
                h2 h2VarA = h2.a(ab2Var.g);
                if (h2VarA != null) {
                    HashMap map = h82Var.a;
                    if (map.containsKey(h2VarA) && !((Map) map.get(h2VarA)).containsKey(str) && h82Var.d(h2VarA) && (k82VarB = h82Var.b.b(str, ab2Var, kc1Var)) != null) {
                        AtomicInteger atomicInteger = h82Var.h;
                        if (atomicInteger != null) {
                            k82VarB.l(atomicInteger.get());
                        }
                        bz1 bz1Var = h82Var.c;
                        k82VarB.p = bz1Var;
                        synchronized (k82VarB) {
                            k82VarB.m.submit(new t82(k82VarB, 0));
                        }
                        ((Map) map.get(h2VarA)).put(str, k82VarB);
                        p83 p83Var = new p83(ab2Var.f, 22, h2VarA);
                        p83Var.i = str;
                        q82 q82Var = new q82(p83Var);
                        int i = ab2Var.i;
                        h82Var.g.getClass();
                        bz1Var.d(i, System.currentTimeMillis(), q82Var, "2");
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean J3(String str, int i) {
        q82 q82Var;
        h2 h2VarA = h2.a(i);
        if (h2VarA == null) {
            return false;
        }
        h82 h82Var = this.g;
        synchronized (h82Var) {
            try {
                h82Var.g.getClass();
                long jCurrentTimeMillis = System.currentTimeMillis();
                HashMap map = h82Var.a;
                if (!map.containsKey(h2VarA)) {
                    return false;
                }
                k82 k82Var = (k82) ((Map) map.get(h2VarA)).get(str);
                String strK = k82Var == null ? null : k82Var.k();
                boolean z = strK != null && h2VarA.equals(h2.a(k82Var.e.g));
                Long lValueOf = z ? Long.valueOf(System.currentTimeMillis()) : null;
                if (k82Var == null) {
                    q82Var = null;
                } else {
                    p83 p83Var = new p83(k82Var.e.f, 22, h2VarA);
                    p83Var.i = str;
                    q82Var = new q82(p83Var);
                }
                h82Var.c.k(k82Var == null ? 0 : k82Var.e.i, k82Var != null ? k82Var.m() : 0, jCurrentTimeMillis, lValueOf, strK, q82Var, "2");
                return z;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final n71 K3(String str) {
        n71 n71Var;
        h82 h82Var = this.g;
        synchronized (h82Var) {
            n71Var = (n71) h82Var.c(h2.INTERSTITIAL, n71.class, str);
        }
        return n71Var;
    }

    public final ku0 L3(String str) {
        ku0 ku0Var;
        h82 h82Var = this.g;
        synchronized (h82Var) {
            ku0Var = (ku0) h82Var.c(h2.APP_OPEN_AD, ku0.class, str);
        }
        return ku0Var;
    }

    public final l81 M3(String str) {
        l81 l81Var;
        h82 h82Var = this.g;
        synchronized (h82Var) {
            l81Var = (l81) h82Var.c(h2.REWARDED, l81.class, str);
        }
        return l81Var;
    }

    public final ab2 N3(String str, int i) {
        h2 h2VarA = h2.a(i);
        if (h2VarA == null) {
            return null;
        }
        h82 h82Var = this.g;
        synchronized (h82Var) {
            HashMap map = h82Var.a;
            if (map.containsKey(h2VarA)) {
                k82 k82Var = (k82) ((Map) map.get(h2VarA)).get(str);
                bz1 bz1Var = h82Var.c;
                h82Var.g.getClass();
                bz1Var.p("pgc", System.currentTimeMillis(), str, k82Var == null ? null : k82Var.e.f, h2VarA, k82Var == null ? -1 : k82Var.e.i, k82Var != null ? k82Var.m() : -1, 1);
                if (k82Var != null) {
                    return k82Var.e;
                }
            }
            return null;
        }
    }

    @Override // defpackage.ze1
    public final void h1(j41 j41Var) {
    }
}
