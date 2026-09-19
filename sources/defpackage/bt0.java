package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes.dex */
public abstract class bt0 {
    public static final oh1 a;

    static {
        oh1 qg1Var = null;
        try {
            Object objNewInstance = es0.class.getClassLoader().loadClass("com.google.android.gms.ads.internal.ClientApi").getDeclaredConstructor(null).newInstance(null);
            if (objNewInstance instanceof IBinder) {
                IBinder iBinder = (IBinder) objNewInstance;
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IClientApi");
                qg1Var = iInterfaceQueryLocalInterface instanceof oh1 ? (oh1) iInterfaceQueryLocalInterface : new qg1(iBinder, "com.google.android.gms.ads.internal.client.IClientApi", 2);
            } else {
                jn.T("ClientApi class is not an instance of IBinder.");
            }
        } catch (Exception unused) {
            jn.T("Failed to instantiate ClientApi class.");
        }
        a = qg1Var;
    }

    public abstract Object a();

    public abstract Object b();

    public abstract Object c(oh1 oh1Var);

    /* JADX WARN: Code duplicated, block: B:22:0x0059 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x0066  */
    /* JADX WARN: Code duplicated, block: B:30:0x006c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:41:0x0085  */
    /* JADX WARN: Code duplicated, block: B:43:0x009b  */
    /* JADX WARN: Code duplicated, block: B:45:0x00c1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:50:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:51:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:53:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:55:0x00d9 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:56:0x005b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:0x0079 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x00c3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public final Object d(Context context, boolean z) {
        boolean z2;
        boolean z3;
        oh1 oh1Var;
        Object objC;
        Object objB;
        Object objC2;
        int iIntValue;
        ut0 ut0Var;
        if (!z) {
            f32 f32Var = ut0.f.a;
            if (am.b.c(context, 12451000) != 0) {
                jn.F("Google Play Services is not available.");
                z = true;
            }
        }
        boolean z4 = false;
        boolean z5 = !(fg.a(context) <= fg.d(context, false));
        lx0.a(context);
        if (!((Boolean) ny0.a.u()).booleanValue()) {
            if (((Boolean) ny0.b.u()).booleanValue()) {
                z2 = true;
            } else {
                z2 = z | z5;
                z3 = false;
            }
            oh1Var = a;
            objC = null;
            if (z2) {
                if (oh1Var != null) {
                    try {
                        objC2 = c(oh1Var);
                    } catch (RemoteException e) {
                        jn.V("Cannot invoke local loader using ClientApi class.", e);
                        objC2 = null;
                    }
                    if (objC2 == null && !z3) {
                        try {
                            objC = b();
                        } catch (RemoteException e2) {
                            jn.V("Cannot invoke remote loader.", e2);
                        }
                        objC2 = objC;
                    }
                } else {
                    jn.T("ClientApi class cannot be loaded.");
                }
                objC2 = null;
                if (objC2 == null) {
                    objC = b();
                    objC2 = objC;
                }
            } else {
                try {
                    objB = b();
                } catch (RemoteException e3) {
                    jn.V("Cannot invoke remote loader.", e3);
                    objB = null;
                }
                if (objB == null) {
                    iIntValue = ((Long) dz0.a.u()).intValue();
                    ut0Var = ut0.f;
                    if (ut0Var.e.nextInt(iIntValue) == 0) {
                        Bundle bundle = new Bundle();
                        bundle.putString("action", "dynamite_load");
                        bundle.putInt("is_missing", 1);
                        f32 f32Var2 = ut0Var.a;
                        String str = ut0Var.d.f;
                        f32Var2.getClass();
                        f32.a(context, str, bundle, new z61(f32Var2, context, 16, z4));
                    }
                }
                if (objB == null) {
                    if (oh1Var != null) {
                        try {
                            objC = c(oh1Var);
                        } catch (RemoteException e4) {
                            jn.V("Cannot invoke local loader using ClientApi class.", e4);
                        }
                    } else {
                        jn.T("ClientApi class cannot be loaded.");
                    }
                    objC2 = objC;
                } else {
                    objC2 = objB;
                }
            }
            if (objC2 == null) {
                return a();
            }
            return objC2;
        }
        z2 = false;
        z3 = z2;
        oh1Var = a;
        objC = null;
        if (z2) {
            if (oh1Var != null) {
                objC2 = c(oh1Var);
                if (objC2 == null) {
                    objC = b();
                    objC2 = objC;
                }
            } else {
                jn.T("ClientApi class cannot be loaded.");
            }
            objC2 = null;
            if (objC2 == null) {
                objC = b();
                objC2 = objC;
            }
        } else {
            objB = b();
            if (objB == null) {
                iIntValue = ((Long) dz0.a.u()).intValue();
                ut0Var = ut0.f;
                if (ut0Var.e.nextInt(iIntValue) == 0) {
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("action", "dynamite_load");
                    bundle2.putInt("is_missing", 1);
                    f32 f32Var3 = ut0Var.a;
                    String str2 = ut0Var.d.f;
                    f32Var3.getClass();
                    f32.a(context, str2, bundle2, new z61(f32Var3, context, 16, z4));
                }
            }
            if (objB == null) {
                if (oh1Var != null) {
                    objC = c(oh1Var);
                } else {
                    jn.T("ClientApi class cannot be loaded.");
                }
                objC2 = objC;
            } else {
                objC2 = objB;
            }
        }
        if (objC2 == null) {
            return a();
        }
        return objC2;
    }
}
