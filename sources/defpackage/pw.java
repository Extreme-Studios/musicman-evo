package defpackage;

import android.os.Build;
import android.os.Bundle;
import android.window.OnBackInvokedDispatcher;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class pw implements jo {
    public final /* synthetic */ int f;
    public final Object g;

    public /* synthetic */ pw(int i, Object obj) {
        this.f = i;
        this.g = obj;
    }

    @Override // defpackage.jo
    public final void g(mo moVar, eo eoVar) {
        int i = this.f;
        Object obj = this.g;
        switch (i) {
            case 0:
                bz bzVar = (bz) obj;
                if (eoVar != eo.ON_CREATE) {
                    throw new AssertionError("Next event must be ON_CREATE");
                }
                moVar.e().f(this);
                Bundle bundleF = bzVar.b().f("androidx.savedstate.Restarter");
                if (bundleF == null) {
                    return;
                }
                ArrayList<String> stringArrayList = bundleF.getStringArrayList("classes_to_restore");
                if (stringArrayList == null) {
                    j7.e("SavedState with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
                    return;
                }
                int size = stringArrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    String str = stringArrayList.get(i2);
                    i2++;
                    String str2 = str;
                    try {
                        Class<? extends U> clsAsSubclass = Class.forName(str2, false, pw.class.getClassLoader()).asSubclass(xy.class);
                        clsAsSubclass.getClass();
                        try {
                            Constructor declaredConstructor = clsAsSubclass.getDeclaredConstructor(null);
                            declaredConstructor.setAccessible(true);
                            try {
                                Object objNewInstance = declaredConstructor.newInstance(null);
                                objNewInstance.getClass();
                                if (!(bzVar instanceof d70)) {
                                    throw new IllegalStateException(("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner. Received owner: " + bzVar).toString());
                                }
                                c70 c70VarD = ((d70) bzVar).d();
                                z61 z61VarB = bzVar.b();
                                c70VarD.getClass();
                                LinkedHashMap linkedHashMap = c70VarD.a;
                                for (String str3 : new HashSet(linkedHashMap.keySet())) {
                                    str3.getClass();
                                    z60 z60Var = (z60) linkedHashMap.get(str3);
                                    if (z60Var != null) {
                                        na1.e(z60Var, z61VarB, bzVar.e());
                                    }
                                }
                                if (!new HashSet(linkedHashMap.keySet()).isEmpty()) {
                                    z61VarB.z();
                                }
                            } catch (Exception e) {
                                throw new RuntimeException("Failed to instantiate " + str2, e);
                            }
                        } catch (NoSuchMethodException e2) {
                            throw new IllegalStateException("Class " + clsAsSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e2);
                        }
                    } catch (ClassNotFoundException e3) {
                        j7.h(ec.i("Class ", str2, " wasn't found"), e3);
                        return;
                    }
                }
                return;
            case 1:
                if (eoVar != eo.ON_CREATE || Build.VERSION.SDK_INT < 33) {
                    return;
                }
                uu uuVar = ((xa) obj).l;
                OnBackInvokedDispatcher onBackInvokedDispatcherA = ta.a((xa) moVar);
                uuVar.getClass();
                onBackInvokedDispatcherA.getClass();
                uuVar.e = onBackInvokedDispatcherA;
                uuVar.b(uuVar.g);
                return;
            case 2:
                new HashMap();
                rl[] rlVarArr = (rl[]) obj;
                if (rlVarArr.length > 0) {
                    rl rlVar = rlVarArr[0];
                    throw null;
                }
                if (rlVarArr.length <= 0) {
                    return;
                }
                rl rlVar2 = rlVarArr[0];
                throw null;
            case 3:
                if (eoVar == eo.ON_STOP) {
                    ((kj) obj).getClass();
                    return;
                }
                return;
            default:
                if (eoVar != eo.ON_CREATE) {
                    throw new IllegalStateException(("Next event must be ON_CREATE, it was " + eoVar).toString());
                }
                moVar.e().f(this);
                vy vyVar = (vy) obj;
                if (vyVar.b) {
                    return;
                }
                Bundle bundleF2 = vyVar.a.f("androidx.lifecycle.internal.SavedStateHandlesProvider");
                Bundle bundleD = ss0.d((lv[]) Arrays.copyOf(new lv[0], 0));
                Bundle bundle = vyVar.c;
                if (bundle != null) {
                    bundleD.putAll(bundle);
                }
                if (bundleF2 != null) {
                    bundleD.putAll(bundleF2);
                }
                vyVar.c = bundleD;
                vyVar.b = true;
                return;
        }
    }
}
