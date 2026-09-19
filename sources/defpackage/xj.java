package defpackage;

import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import com.extremestudios.musicmanevo.R;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class xj {
    public un1 A;
    public un1 B;
    public ArrayDeque C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public ArrayList I;
    public ArrayList J;
    public ArrayList K;
    public ak L;
    public final q7 M;
    public boolean b;
    public ArrayList d;
    public ArrayList e;
    public uu g;
    public final z61 l;
    public final CopyOnWriteArrayList m;
    public final pj n;
    public final pj o;
    public final pj p;
    public final pj q;
    public final rj r;
    public int s;
    public mj t;
    public i8 u;
    public kj v;
    public kj w;
    public final sj x;
    public final ig y;
    public un1 z;
    public final ArrayList a = new ArrayList();
    public final y91 c = new y91(1);
    public final oj f = new oj(this);
    public final qj h = new qj(this);
    public final AtomicInteger i = new AtomicInteger();
    public final Map j = Collections.synchronizedMap(new HashMap());
    public final Map k = Collections.synchronizedMap(new HashMap());

    /* JADX WARN: Type inference failed for: r0v12, types: [pj] */
    /* JADX WARN: Type inference failed for: r0v13, types: [pj] */
    /* JADX WARN: Type inference failed for: r0v14, types: [pj] */
    /* JADX WARN: Type inference failed for: r0v15, types: [pj] */
    public xj() {
        Collections.synchronizedMap(new HashMap());
        this.l = new z61(this);
        this.m = new CopyOnWriteArrayList();
        final int i = 0;
        this.n = new mb(this) { // from class: pj
            public final /* synthetic */ xj b;

            {
                this.b = this;
            }

            @Override // defpackage.mb
            public final void accept(Object obj) {
                int i2 = i;
                xj xjVar = this.b;
                switch (i2) {
                    case 0:
                        if (xjVar.G()) {
                            xjVar.h(false);
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        if (xjVar.G() && num.intValue() == 80) {
                            xjVar.l(false);
                            break;
                        }
                        break;
                    case 2:
                        ss ssVar = (ss) obj;
                        if (xjVar.G()) {
                            boolean z = ssVar.a;
                            xjVar.m(false);
                        }
                        break;
                    default:
                        nv nvVar = (nv) obj;
                        if (xjVar.G()) {
                            boolean z2 = nvVar.a;
                            xjVar.r(false);
                        }
                        break;
                }
            }
        };
        final int i2 = 1;
        this.o = new mb(this) { // from class: pj
            public final /* synthetic */ xj b;

            {
                this.b = this;
            }

            @Override // defpackage.mb
            public final void accept(Object obj) {
                int i3 = i2;
                xj xjVar = this.b;
                switch (i3) {
                    case 0:
                        if (xjVar.G()) {
                            xjVar.h(false);
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        if (xjVar.G() && num.intValue() == 80) {
                            xjVar.l(false);
                            break;
                        }
                        break;
                    case 2:
                        ss ssVar = (ss) obj;
                        if (xjVar.G()) {
                            boolean z = ssVar.a;
                            xjVar.m(false);
                        }
                        break;
                    default:
                        nv nvVar = (nv) obj;
                        if (xjVar.G()) {
                            boolean z2 = nvVar.a;
                            xjVar.r(false);
                        }
                        break;
                }
            }
        };
        final int i3 = 2;
        this.p = new mb(this) { // from class: pj
            public final /* synthetic */ xj b;

            {
                this.b = this;
            }

            @Override // defpackage.mb
            public final void accept(Object obj) {
                int i4 = i3;
                xj xjVar = this.b;
                switch (i4) {
                    case 0:
                        if (xjVar.G()) {
                            xjVar.h(false);
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        if (xjVar.G() && num.intValue() == 80) {
                            xjVar.l(false);
                            break;
                        }
                        break;
                    case 2:
                        ss ssVar = (ss) obj;
                        if (xjVar.G()) {
                            boolean z = ssVar.a;
                            xjVar.m(false);
                        }
                        break;
                    default:
                        nv nvVar = (nv) obj;
                        if (xjVar.G()) {
                            boolean z2 = nvVar.a;
                            xjVar.r(false);
                        }
                        break;
                }
            }
        };
        final int i4 = 3;
        this.q = new mb(this) { // from class: pj
            public final /* synthetic */ xj b;

            {
                this.b = this;
            }

            @Override // defpackage.mb
            public final void accept(Object obj) {
                int i5 = i4;
                xj xjVar = this.b;
                switch (i5) {
                    case 0:
                        if (xjVar.G()) {
                            xjVar.h(false);
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        if (xjVar.G() && num.intValue() == 80) {
                            xjVar.l(false);
                            break;
                        }
                        break;
                    case 2:
                        ss ssVar = (ss) obj;
                        if (xjVar.G()) {
                            boolean z = ssVar.a;
                            xjVar.m(false);
                        }
                        break;
                    default:
                        nv nvVar = (nv) obj;
                        if (xjVar.G()) {
                            boolean z2 = nvVar.a;
                            xjVar.r(false);
                        }
                        break;
                }
            }
        };
        this.r = new rj(this);
        this.s = -1;
        this.x = new sj(this);
        this.y = new ig(14);
        this.C = new ArrayDeque();
        this.M = new q7(5, this);
    }

    public static boolean E(int i) {
        return Log.isLoggable("FragmentManager", i);
    }

    public static boolean F(kj kjVar) {
        kjVar.getClass();
        ArrayList arrayListJ = kjVar.y.c.j();
        int size = arrayListJ.size();
        boolean zF = false;
        int i = 0;
        while (i < size) {
            Object obj = arrayListJ.get(i);
            i++;
            kj kjVar2 = (kj) obj;
            if (kjVar2 != null) {
                zF = F(kjVar2);
            }
            if (zF) {
                return true;
            }
        }
        return false;
    }

    public static boolean H(kj kjVar) {
        if (kjVar == null) {
            return true;
        }
        if (kjVar.G) {
            return kjVar.w == null || H(kjVar.z);
        }
        return false;
    }

    public static boolean I(kj kjVar) {
        if (kjVar == null) {
            return true;
        }
        xj xjVar = kjVar.w;
        return kjVar == xjVar.w && I(xjVar.v);
    }

    public static void W(kj kjVar) {
        if (E(2)) {
            Log.v("FragmentManager", "show: " + kjVar);
        }
        if (kjVar.D) {
            kjVar.D = false;
            kjVar.M = !kjVar.M;
        }
    }

    public final ViewGroup A(kj kjVar) {
        ViewGroup viewGroup = kjVar.I;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (kjVar.B <= 0 || !this.u.q()) {
            return null;
        }
        View viewP = this.u.p(kjVar.B);
        if (viewP instanceof ViewGroup) {
            return (ViewGroup) viewP;
        }
        return null;
    }

    public final sj B() {
        kj kjVar = this.v;
        return kjVar != null ? kjVar.w.B() : this.x;
    }

    public final ig C() {
        kj kjVar = this.v;
        return kjVar != null ? kjVar.w.C() : this.y;
    }

    public final void D(kj kjVar) {
        if (E(2)) {
            Log.v("FragmentManager", "hide: " + kjVar);
        }
        if (kjVar.D) {
            return;
        }
        kjVar.D = true;
        kjVar.M = true ^ kjVar.M;
        V(kjVar);
    }

    public final boolean G() {
        kj kjVar = this.v;
        if (kjVar == null) {
            return true;
        }
        return kjVar.x != null && kjVar.p && kjVar.i().G();
    }

    public final void J(int i, boolean z) {
        mj mjVar;
        if (this.t == null && i != -1) {
            j7.e("No activity");
            return;
        }
        if (z || i != this.s) {
            this.s = i;
            y91 y91Var = this.c;
            HashMap map = (HashMap) y91Var.h;
            ArrayList arrayList = (ArrayList) y91Var.g;
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                ek ekVar = (ek) map.get(((kj) obj).j);
                if (ekVar != null) {
                    ekVar.j();
                }
            }
            for (ek ekVar2 : map.values()) {
                if (ekVar2 != null) {
                    ekVar2.j();
                    kj kjVar = ekVar2.c;
                    if (kjVar.q && !kjVar.m()) {
                        y91Var.m(ekVar2);
                    }
                }
            }
            X();
            if (this.D && (mjVar = this.t) != null && this.s == 7) {
                mjVar.G.invalidateOptionsMenu();
                this.D = false;
            }
        }
    }

    public final void K() {
        if (this.t == null) {
            return;
        }
        this.E = false;
        this.F = false;
        this.L.g = false;
        for (kj kjVar : this.c.k()) {
            if (kjVar != null) {
                kjVar.y.K();
            }
        }
    }

    public final boolean L() {
        x(false);
        w(true);
        kj kjVar = this.w;
        if (kjVar != null && kjVar.g().L()) {
            return true;
        }
        boolean zM = M(this.I, this.J, -1, 0);
        if (zM) {
            this.b = true;
            try {
                O(this.I, this.J);
                d();
            } catch (Throwable th) {
                d();
                throw th;
            }
        }
        Z();
        if (this.H) {
            this.H = false;
            X();
        }
        ((HashMap) this.c.h).values().removeAll(Collections.singleton(null));
        return zM;
    }

    public final boolean M(ArrayList arrayList, ArrayList arrayList2, int i, int i2) {
        boolean z = (i2 & 1) != 0;
        ArrayList arrayList3 = this.d;
        int size = -1;
        if (arrayList3 != null && !arrayList3.isEmpty()) {
            if (i < 0) {
                size = z ? 0 : this.d.size() - 1;
            } else {
                int size2 = this.d.size() - 1;
                while (size2 >= 0) {
                    s7 s7Var = (s7) this.d.get(size2);
                    if (i >= 0 && i == s7Var.r) {
                        break;
                    }
                    size2--;
                }
                if (size2 < 0) {
                    size = size2;
                } else if (z) {
                    size = size2;
                    while (size > 0) {
                        s7 s7Var2 = (s7) this.d.get(size - 1);
                        if (i < 0 || i != s7Var2.r) {
                            break;
                        }
                        size--;
                    }
                } else if (size2 != this.d.size() - 1) {
                    size = size2 + 1;
                }
            }
        }
        if (size < 0) {
            return false;
        }
        for (int size3 = this.d.size() - 1; size3 >= size; size3--) {
            arrayList.add((s7) this.d.remove(size3));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    public final void N(kj kjVar) {
        if (E(2)) {
            Log.v("FragmentManager", "remove: " + kjVar + " nesting=" + kjVar.v);
        }
        boolean zM = kjVar.m();
        if (kjVar.E && zM) {
            return;
        }
        y91 y91Var = this.c;
        synchronized (((ArrayList) y91Var.g)) {
            ((ArrayList) y91Var.g).remove(kjVar);
        }
        kjVar.p = false;
        if (F(kjVar)) {
            this.D = true;
        }
        kjVar.q = true;
        V(kjVar);
    }

    public final void O(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() != arrayList2.size()) {
            j7.e("Internal error with the back stack records");
            return;
        }
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i < size) {
            if (!((s7) arrayList.get(i)).o) {
                if (i2 != i) {
                    y(arrayList, arrayList2, i2, i);
                }
                i2 = i + 1;
                if (((Boolean) arrayList2.get(i)).booleanValue()) {
                    while (i2 < size && ((Boolean) arrayList2.get(i2)).booleanValue() && !((s7) arrayList.get(i2)).o) {
                        i2++;
                    }
                }
                y(arrayList, arrayList2, i, i2);
                i = i2 - 1;
            }
            i++;
        }
        if (i2 != size) {
            y(arrayList, arrayList2, i2, size);
        }
    }

    public final void P(Parcelable parcelable) {
        z61 z61Var;
        int i;
        boolean z;
        int i2;
        ek ekVar;
        Bundle bundle;
        Bundle bundle2;
        Bundle bundle3 = (Bundle) parcelable;
        for (String str : bundle3.keySet()) {
            if (str.startsWith("result_") && (bundle2 = bundle3.getBundle(str)) != null) {
                bundle2.setClassLoader(this.t.D.getClassLoader());
                this.k.put(str.substring(7), bundle2);
            }
        }
        ArrayList arrayList = new ArrayList();
        for (String str2 : bundle3.keySet()) {
            if (str2.startsWith("fragment_") && (bundle = bundle3.getBundle(str2)) != null) {
                bundle.setClassLoader(this.t.D.getClassLoader());
                arrayList.add((dk) bundle.getParcelable("state"));
            }
        }
        y91 y91Var = this.c;
        HashMap map = (HashMap) y91Var.i;
        HashMap map2 = (HashMap) y91Var.h;
        map.clear();
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            dk dkVar = (dk) obj;
            map.put(dkVar.g, dkVar);
        }
        yj yjVar = (yj) bundle3.getParcelable("state");
        if (yjVar == null) {
            return;
        }
        map2.clear();
        ArrayList arrayList2 = yjVar.f;
        int size2 = arrayList2.size();
        int i4 = 0;
        while (true) {
            z61Var = this.l;
            i = 2;
            if (i4 >= size2) {
                break;
            }
            Object obj2 = arrayList2.get(i4);
            i4++;
            dk dkVar2 = (dk) ((HashMap) y91Var.i).remove((String) obj2);
            if (dkVar2 != null) {
                kj kjVar = (kj) this.L.b.get(dkVar2.g);
                if (kjVar != null) {
                    if (E(2)) {
                        Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + kjVar);
                    }
                    ekVar = new ek(z61Var, y91Var, kjVar, dkVar2);
                } else {
                    ekVar = new ek(this.l, this.c, this.t.D.getClassLoader(), B(), dkVar2);
                }
                kj kjVar2 = ekVar.c;
                kjVar2.w = this;
                if (E(2)) {
                    Log.v("FragmentManager", "restoreSaveState: active (" + kjVar2.j + "): " + kjVar2);
                }
                ekVar.l(this.t.D.getClassLoader());
                y91Var.l(ekVar);
                ekVar.e = this.s;
            }
        }
        ak akVar = this.L;
        akVar.getClass();
        ArrayList arrayList3 = new ArrayList(akVar.b.values());
        int size3 = arrayList3.size();
        int i5 = 0;
        while (true) {
            z = true;
            if (i5 >= size3) {
                break;
            }
            Object obj3 = arrayList3.get(i5);
            i5++;
            kj kjVar3 = (kj) obj3;
            if (map2.get(kjVar3.j) == null) {
                if (E(2)) {
                    Log.v("FragmentManager", "Discarding retained Fragment " + kjVar3 + " that was not found in the set of active Fragments " + yjVar.f);
                }
                this.L.e(kjVar3);
                kjVar3.w = this;
                ek ekVar2 = new ek(z61Var, y91Var, kjVar3);
                ekVar2.e = 1;
                ekVar2.j();
                kjVar3.q = true;
                ekVar2.j();
            }
        }
        ArrayList arrayList4 = yjVar.g;
        ((ArrayList) y91Var.g).clear();
        if (arrayList4 != null) {
            int size4 = arrayList4.size();
            int i6 = 0;
            while (i6 < size4) {
                Object obj4 = arrayList4.get(i6);
                i6++;
                String str3 = (String) obj4;
                kj kjVarD = y91Var.d(str3);
                if (kjVarD == null) {
                    j7.e(ec.i("No instantiated fragment for (", str3, ")"));
                    return;
                }
                if (E(2)) {
                    Log.v("FragmentManager", "restoreSaveState: added (" + str3 + "): " + kjVarD);
                }
                y91Var.a(kjVarD);
            }
        }
        if (yjVar.h != null) {
            this.d = new ArrayList(yjVar.h.length);
            int i7 = 0;
            while (true) {
                t7[] t7VarArr = yjVar.h;
                if (i7 >= t7VarArr.length) {
                    break;
                }
                t7 t7Var = t7VarArr[i7];
                ArrayList arrayList5 = t7Var.g;
                s7 s7Var = new s7(this);
                int[] iArr = t7Var.f;
                int i8 = 0;
                int i9 = 0;
                while (i8 < iArr.length) {
                    ik ikVar = new ik();
                    int i10 = i8 + 1;
                    int i11 = i;
                    ikVar.a = iArr[i8];
                    if (E(i11)) {
                        Log.v("FragmentManager", "Instantiate " + s7Var + " op #" + i9 + " base fragment #" + iArr[i10]);
                    }
                    ikVar.h = fo.values()[t7Var.h[i9]];
                    ikVar.i = fo.values()[t7Var.i[i9]];
                    int i12 = i8 + 2;
                    ikVar.c = iArr[i10] != 0 ? z : false;
                    int i13 = iArr[i12];
                    ikVar.d = i13;
                    int i14 = iArr[i8 + 3];
                    ikVar.e = i14;
                    int i15 = i8 + 5;
                    int i16 = iArr[i8 + 4];
                    ikVar.f = i16;
                    i8 += 6;
                    int[] iArr2 = iArr;
                    int i17 = iArr2[i15];
                    ikVar.g = i17;
                    s7Var.b = i13;
                    s7Var.c = i14;
                    s7Var.d = i16;
                    s7Var.e = i17;
                    s7Var.b(ikVar);
                    i9++;
                    i = i11;
                    iArr = iArr2;
                    z = true;
                }
                int i18 = i;
                s7Var.f = t7Var.j;
                s7Var.h = t7Var.k;
                s7Var.g = true;
                s7Var.i = t7Var.m;
                s7Var.j = t7Var.n;
                s7Var.k = t7Var.o;
                s7Var.l = t7Var.p;
                s7Var.m = t7Var.q;
                s7Var.n = t7Var.r;
                s7Var.o = t7Var.s;
                s7Var.r = t7Var.l;
                for (int i19 = 0; i19 < arrayList5.size(); i19++) {
                    String str4 = (String) arrayList5.get(i19);
                    if (str4 != null) {
                        ((ik) s7Var.a.get(i19)).b = y91Var.d(str4);
                    }
                }
                s7Var.c(1);
                if (E(i18)) {
                    Log.v("FragmentManager", "restoreAllState: back stack #" + i7 + " (index " + s7Var.r + "): " + s7Var);
                    PrintWriter printWriter = new PrintWriter(new xp());
                    s7Var.f("  ", printWriter, false);
                    printWriter.close();
                }
                this.d.add(s7Var);
                i7++;
                i = i18;
                z = true;
            }
            i2 = 0;
        } else {
            i2 = 0;
            this.d = null;
        }
        this.i.set(yjVar.i);
        String str5 = yjVar.j;
        if (str5 != null) {
            kj kjVarD2 = y91Var.d(str5);
            this.w = kjVarD2;
            q(kjVarD2);
        }
        ArrayList arrayList6 = yjVar.k;
        if (arrayList6 != null) {
            while (i2 < arrayList6.size()) {
                this.j.put((String) arrayList6.get(i2), (u7) yjVar.l.get(i2));
                i2++;
            }
        }
        this.C = new ArrayDeque(yjVar.m);
    }

    public final Bundle Q() {
        int i;
        ArrayList arrayList;
        t7[] t7VarArr;
        int size;
        Bundle bundle = new Bundle();
        Iterator it = e().iterator();
        while (true) {
            i = 0;
            if (!it.hasNext()) {
                break;
            }
            ne neVar = (ne) it.next();
            if (neVar.e) {
                if (E(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Forcing postponed operations");
                }
                neVar.e = false;
                neVar.b();
            }
        }
        Iterator it2 = e().iterator();
        while (it2.hasNext()) {
            ((ne) it2.next()).c();
        }
        x(true);
        this.E = true;
        this.L.g = true;
        y91 y91Var = this.c;
        y91Var.getClass();
        HashMap map = (HashMap) y91Var.h;
        ArrayList arrayList2 = new ArrayList(map.size());
        Iterator it3 = map.values().iterator();
        while (true) {
            if (!it3.hasNext()) {
                break;
            }
            ek ekVar = (ek) it3.next();
            if (ekVar != null) {
                kj kjVar = ekVar.c;
                dk dkVar = new dk(kjVar);
                if (kjVar.f <= -1 || dkVar.r != null) {
                    dkVar.r = kjVar.g;
                } else {
                    Bundle bundle2 = new Bundle();
                    kjVar.u(bundle2);
                    kjVar.S.m(bundle2);
                    bundle2.putParcelable("android:support:fragments", kjVar.y.Q());
                    ekVar.a.r(false);
                    Bundle bundle3 = bundle2.isEmpty() ? null : bundle2;
                    if (kjVar.h != null) {
                        if (bundle3 == null) {
                            bundle3 = new Bundle();
                        }
                        bundle3.putSparseParcelableArray("android:view_state", kjVar.h);
                    }
                    if (kjVar.i != null) {
                        if (bundle3 == null) {
                            bundle3 = new Bundle();
                        }
                        bundle3.putBundle("android:view_registry_state", kjVar.i);
                    }
                    if (!kjVar.K) {
                        if (bundle3 == null) {
                            bundle3 = new Bundle();
                        }
                        bundle3.putBoolean("android:user_visible_hint", kjVar.K);
                    }
                    dkVar.r = bundle3;
                    if (kjVar.m != null) {
                        if (bundle3 == null) {
                            dkVar.r = new Bundle();
                        }
                        dkVar.r.putString("android:target_state", kjVar.m);
                        int i2 = kjVar.n;
                        if (i2 != 0) {
                            dkVar.r.putInt("android:target_req_state", i2);
                        }
                    }
                }
                arrayList2.add(kjVar.j);
                if (E(2)) {
                    Log.v("FragmentManager", "Saved state of " + kjVar + ": " + kjVar.g);
                }
            }
        }
        y91 y91Var2 = this.c;
        y91Var2.getClass();
        ArrayList arrayList3 = new ArrayList(((HashMap) y91Var2.i).values());
        if (!arrayList3.isEmpty()) {
            y91 y91Var3 = this.c;
            synchronized (((ArrayList) y91Var3.g)) {
                try {
                    if (((ArrayList) y91Var3.g).isEmpty()) {
                        arrayList = null;
                    } else {
                        arrayList = new ArrayList(((ArrayList) y91Var3.g).size());
                        ArrayList arrayList4 = (ArrayList) y91Var3.g;
                        int size2 = arrayList4.size();
                        int i3 = 0;
                        while (i3 < size2) {
                            Object obj = arrayList4.get(i3);
                            i3++;
                            kj kjVar2 = (kj) obj;
                            arrayList.add(kjVar2.j);
                            if (E(2)) {
                                Log.v("FragmentManager", "saveAllState: adding fragment (" + kjVar2.j + "): " + kjVar2);
                            }
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            ArrayList arrayList5 = this.d;
            if (arrayList5 == null || (size = arrayList5.size()) <= 0) {
                t7VarArr = null;
            } else {
                t7VarArr = new t7[size];
                for (int i4 = 0; i4 < size; i4++) {
                    t7VarArr[i4] = new t7((s7) this.d.get(i4));
                    if (E(2)) {
                        Log.v("FragmentManager", "saveAllState: adding back stack #" + i4 + ": " + this.d.get(i4));
                    }
                }
            }
            yj yjVar = new yj();
            yjVar.j = null;
            ArrayList arrayList6 = new ArrayList();
            yjVar.k = arrayList6;
            ArrayList arrayList7 = new ArrayList();
            yjVar.l = arrayList7;
            yjVar.f = arrayList2;
            yjVar.g = arrayList;
            yjVar.h = t7VarArr;
            yjVar.i = this.i.get();
            kj kjVar3 = this.w;
            if (kjVar3 != null) {
                yjVar.j = kjVar3.j;
            }
            arrayList6.addAll(this.j.keySet());
            arrayList7.addAll(this.j.values());
            yjVar.m = new ArrayList(this.C);
            bundle.putParcelable("state", yjVar);
            for (String str : this.k.keySet()) {
                bundle.putBundle("result_" + str, (Bundle) this.k.get(str));
            }
            int size3 = arrayList3.size();
            while (i < size3) {
                Object obj2 = arrayList3.get(i);
                i++;
                dk dkVar2 = (dk) obj2;
                Bundle bundle4 = new Bundle();
                bundle4.putParcelable("state", dkVar2);
                bundle.putBundle("fragment_" + dkVar2.g, bundle4);
            }
        } else if (E(2)) {
            Log.v("FragmentManager", "saveAllState: no fragments!");
            return bundle;
        }
        return bundle;
    }

    public final void R() {
        synchronized (this.a) {
            try {
                if (this.a.size() == 1) {
                    this.t.E.removeCallbacks(this.M);
                    this.t.E.post(this.M);
                    Z();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void S(kj kjVar, boolean z) {
        ViewGroup viewGroupA = A(kjVar);
        if (viewGroupA == null || !(viewGroupA instanceof nj)) {
            return;
        }
        ((nj) viewGroupA).setDrawDisappearingViewsLast(!z);
    }

    public final void T(kj kjVar, fo foVar) {
        if (kjVar == this.c.d(kjVar.j) && (kjVar.x == null || kjVar.w == this)) {
            kjVar.P = foVar;
            return;
        }
        throw new IllegalArgumentException("Fragment " + kjVar + " is not an active fragment of FragmentManager " + this);
    }

    public final void U(kj kjVar) {
        if (kjVar != null) {
            if (kjVar != this.c.d(kjVar.j) || (kjVar.x != null && kjVar.w != this)) {
                throw new IllegalArgumentException("Fragment " + kjVar + " is not an active fragment of FragmentManager " + this);
            }
        }
        kj kjVar2 = this.w;
        this.w = kjVar;
        q(kjVar2);
        q(this.w);
    }

    public final void V(kj kjVar) {
        ViewGroup viewGroupA = A(kjVar);
        if (viewGroupA != null) {
            jj jjVar = kjVar.L;
            if ((jjVar == null ? 0 : jjVar.e) + (jjVar == null ? 0 : jjVar.d) + (jjVar == null ? 0 : jjVar.c) + (jjVar == null ? 0 : jjVar.b) > 0) {
                if (viewGroupA.getTag(R.id.visible_removing_fragment_view_tag) == null) {
                    viewGroupA.setTag(R.id.visible_removing_fragment_view_tag, kjVar);
                }
                kj kjVar2 = (kj) viewGroupA.getTag(R.id.visible_removing_fragment_view_tag);
                jj jjVar2 = kjVar.L;
                boolean z = jjVar2 != null ? jjVar2.a : false;
                if (kjVar2.L == null) {
                    return;
                }
                kjVar2.f().a = z;
            }
        }
    }

    public final void X() {
        ArrayList arrayListI = this.c.i();
        int size = arrayListI.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayListI.get(i);
            i++;
            ek ekVar = (ek) obj;
            kj kjVar = ekVar.c;
            if (kjVar.J) {
                if (this.b) {
                    this.H = true;
                } else {
                    kjVar.J = false;
                    ekVar.j();
                }
            }
        }
    }

    public final void Y(IllegalStateException illegalStateException) {
        Log.e("FragmentManager", illegalStateException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new xp());
        mj mjVar = this.t;
        if (mjVar == null) {
            try {
                u("  ", null, printWriter, new String[0]);
                throw illegalStateException;
            } catch (Exception e) {
                Log.e("FragmentManager", "Failed dumping state", e);
                throw illegalStateException;
            }
        }
        try {
            mjVar.G.dump("  ", null, printWriter, new String[0]);
            throw illegalStateException;
        } catch (Exception e2) {
            Log.e("FragmentManager", "Failed dumping state", e2);
            throw illegalStateException;
        }
    }

    public final void Z() {
        synchronized (this.a) {
            try {
                if (!this.a.isEmpty()) {
                    qj qjVar = this.h;
                    qjVar.a = true;
                    rk rkVar = qjVar.c;
                    if (rkVar != null) {
                        rkVar.a();
                    }
                    return;
                }
                qj qjVar2 = this.h;
                ArrayList arrayList = this.d;
                qjVar2.a = (arrayList != null ? arrayList.size() : 0) > 0 && I(this.v);
                rk rkVar2 = qjVar2.c;
                if (rkVar2 != null) {
                    rkVar2.a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final ek a(kj kjVar) {
        String str = kjVar.O;
        if (str != null) {
            gk.c(kjVar, str);
        }
        if (E(2)) {
            Log.v("FragmentManager", "add: " + kjVar);
        }
        ek ekVarF = f(kjVar);
        kjVar.w = this;
        y91 y91Var = this.c;
        y91Var.l(ekVarF);
        if (!kjVar.E) {
            y91Var.a(kjVar);
            kjVar.q = false;
            kjVar.M = false;
            if (F(kjVar)) {
                this.D = true;
            }
        }
        return ekVarF;
    }

    public final void b(mj mjVar, i8 i8Var, kj kjVar) {
        if (this.t != null) {
            j7.e("Already attached");
            return;
        }
        this.t = mjVar;
        this.u = i8Var;
        this.v = kjVar;
        CopyOnWriteArrayList copyOnWriteArrayList = this.m;
        if (kjVar != null) {
            copyOnWriteArrayList.add(new tj(kjVar));
        } else if (mjVar != null) {
            copyOnWriteArrayList.add(mjVar);
        }
        if (this.v != null) {
            Z();
        }
        if (mjVar != null) {
            uu uuVarI = mjVar.G.i();
            this.g = uuVarI;
            mo moVar = kjVar != null ? kjVar : mjVar;
            uuVarI.getClass();
            qj qjVar = this.h;
            qjVar.getClass();
            oo ooVarE = moVar.e();
            if (ooVarE.c != fo.f) {
                qjVar.b.add(new ru(uuVarI, ooVarE, qjVar));
                uuVarI.c();
                qjVar.c = new tu(0, uuVarI, uu.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0, 0, 0);
            }
        }
        int i = 0;
        if (kjVar != null) {
            ak akVar = kjVar.w.L;
            HashMap map = akVar.c;
            ak akVar2 = (ak) map.get(kjVar.j);
            if (akVar2 == null) {
                akVar2 = new ak(akVar.e);
                map.put(kjVar.j, akVar2);
            }
            this.L = akVar2;
        } else if (mjVar != null) {
            this.L = (ak) new s70(mjVar.G.d(), ak.h).l(ak.class);
        } else {
            this.L = new ak(false);
        }
        ak akVar3 = this.L;
        int i2 = 1;
        akVar3.g = this.E || this.F;
        this.c.j = akVar3;
        mj mjVar2 = this.t;
        int i3 = 2;
        if (mjVar2 != null && kjVar == null) {
            z61 z61VarB = mjVar2.b();
            z61VarB.y("android:support:fragments", new pa(i3, this));
            Bundle bundleF = z61VarB.f("android:support:fragments");
            if (bundleF != null) {
                P(bundleF);
            }
        }
        mj mjVar3 = this.t;
        if (mjVar3 != null) {
            ra raVar = mjVar3.G.o;
            String strConcat = "FragmentManager:".concat(kjVar != null ? ec.m(new StringBuilder(), kjVar.j, ":") : "");
            int i4 = 5;
            this.z = raVar.b(strConcat.concat("StartActivityForResult"), new d2(i2), new s70(i4, this));
            this.A = raVar.b(strConcat.concat("StartIntentSenderForResult"), new d2(i3), new dr0(i4, this));
            this.B = raVar.b(strConcat.concat("RequestPermissions"), new d2(i), new zx(i4, this));
        }
        mj mjVar4 = this.t;
        if (mjVar4 != null) {
            mjVar4.G.g(this.n);
        }
        mj mjVar5 = this.t;
        if (mjVar5 != null) {
            mjVar5.G.q.add(this.o);
        }
        mj mjVar6 = this.t;
        if (mjVar6 != null) {
            mjVar6.G.s.add(this.p);
        }
        mj mjVar7 = this.t;
        if (mjVar7 != null) {
            mjVar7.G.t.add(this.q);
        }
        mj mjVar8 = this.t;
        if (mjVar8 == null || kjVar != null) {
            return;
        }
        r52 r52Var = mjVar8.G.h;
        ((CopyOnWriteArrayList) r52Var.h).add(this.r);
        ((Runnable) r52Var.g).run();
    }

    public final void c(kj kjVar) {
        if (E(2)) {
            Log.v("FragmentManager", "attach: " + kjVar);
        }
        if (kjVar.E) {
            kjVar.E = false;
            if (kjVar.p) {
                return;
            }
            this.c.a(kjVar);
            if (E(2)) {
                Log.v("FragmentManager", "add from attach: " + kjVar);
            }
            if (F(kjVar)) {
                this.D = true;
            }
        }
    }

    public final void d() {
        this.b = false;
        this.J.clear();
        this.I.clear();
    }

    public final HashSet e() {
        HashSet hashSet = new HashSet();
        ArrayList arrayListI = this.c.i();
        int size = arrayListI.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayListI.get(i);
            i++;
            ViewGroup viewGroup = ((ek) obj).c.I;
            if (viewGroup != null) {
                hashSet.add(ne.d(viewGroup, C()));
            }
        }
        return hashSet;
    }

    public final ek f(kj kjVar) {
        String str = kjVar.j;
        y91 y91Var = this.c;
        ek ekVar = (ek) ((HashMap) y91Var.h).get(str);
        if (ekVar != null) {
            return ekVar;
        }
        ek ekVar2 = new ek(this.l, y91Var, kjVar);
        ekVar2.l(this.t.D.getClassLoader());
        ekVar2.e = this.s;
        return ekVar2;
    }

    public final void g(kj kjVar) {
        if (E(2)) {
            Log.v("FragmentManager", "detach: " + kjVar);
        }
        if (kjVar.E) {
            return;
        }
        kjVar.E = true;
        if (kjVar.p) {
            if (E(2)) {
                Log.v("FragmentManager", "remove from detach: " + kjVar);
            }
            y91 y91Var = this.c;
            synchronized (((ArrayList) y91Var.g)) {
                ((ArrayList) y91Var.g).remove(kjVar);
            }
            kjVar.p = false;
            if (F(kjVar)) {
                this.D = true;
            }
            V(kjVar);
        }
    }

    public final void h(boolean z) {
        if (z && this.t != null) {
            Y(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
            throw null;
        }
        for (kj kjVar : this.c.k()) {
            if (kjVar != null) {
                kjVar.H = true;
                if (z) {
                    kjVar.y.h(true);
                }
            }
        }
    }

    public final boolean i() {
        if (this.s >= 1) {
            for (kj kjVar : this.c.k()) {
                if (kjVar != null) {
                    if (!kjVar.D ? kjVar.y.i() : false) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final boolean j() {
        if (this.s < 1) {
            return false;
        }
        ArrayList arrayList = null;
        boolean z = false;
        for (kj kjVar : this.c.k()) {
            if (kjVar != null && H(kjVar)) {
                if (!kjVar.D ? kjVar.y.j() : false) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(kjVar);
                    z = true;
                }
            }
        }
        if (this.e != null) {
            for (int i = 0; i < this.e.size(); i++) {
                kj kjVar2 = (kj) this.e.get(i);
                if (arrayList == null || !arrayList.contains(kjVar2)) {
                    kjVar2.getClass();
                }
            }
        }
        this.e = arrayList;
        return z;
    }

    public final void k() {
        boolean zIsChangingConfigurations = true;
        this.G = true;
        x(true);
        Iterator it = e().iterator();
        while (it.hasNext()) {
            ((ne) it.next()).c();
        }
        mj mjVar = this.t;
        y91 y91Var = this.c;
        if (mjVar != null) {
            zIsChangingConfigurations = ((ak) y91Var.j).f;
        } else {
            c4 c4Var = mjVar.D;
            if (c4Var != null) {
                zIsChangingConfigurations = true ^ c4Var.isChangingConfigurations();
            }
        }
        if (zIsChangingConfigurations) {
            Iterator it2 = this.j.values().iterator();
            while (it2.hasNext()) {
                ArrayList arrayList = ((u7) it2.next()).f;
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    String str = (String) obj;
                    ak akVar = (ak) y91Var.j;
                    akVar.getClass();
                    if (E(3)) {
                        Log.d("FragmentManager", "Clearing non-config state for saved state of Fragment " + str);
                    }
                    akVar.d(str);
                }
            }
        }
        t(-1);
        mj mjVar2 = this.t;
        if (mjVar2 != null) {
            mjVar2.G.q.remove(this.o);
        }
        mj mjVar3 = this.t;
        if (mjVar3 != null) {
            mjVar3.G.p.remove(this.n);
        }
        mj mjVar4 = this.t;
        if (mjVar4 != null) {
            mjVar4.G.s.remove(this.p);
        }
        mj mjVar5 = this.t;
        if (mjVar5 != null) {
            mjVar5.G.t.remove(this.q);
        }
        mj mjVar6 = this.t;
        if (mjVar6 != null) {
            r52 r52Var = mjVar6.G.h;
            CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) r52Var.h;
            rj rjVar = this.r;
            copyOnWriteArrayList.remove(rjVar);
            if (((HashMap) r52Var.i).remove(rjVar) == null) {
                ((Runnable) r52Var.g).run();
            } else {
                j7.j();
            }
        }
        this.t = null;
        this.u = null;
        this.v = null;
        if (this.g != null) {
            Iterator it3 = this.h.b.iterator();
            while (it3.hasNext()) {
                ((w8) it3.next()).cancel();
            }
            this.g = null;
        }
        un1 un1Var = this.z;
        if (un1Var != null) {
            un1Var.n();
            this.A.n();
            this.B.n();
        }
    }

    public final void l(boolean z) {
        if (z && this.t != null) {
            Y(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
            throw null;
        }
        for (kj kjVar : this.c.k()) {
            if (kjVar != null) {
                kjVar.H = true;
                if (z) {
                    kjVar.y.l(true);
                }
            }
        }
    }

    public final void m(boolean z) {
        if (z && this.t != null) {
            Y(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
            throw null;
        }
        for (kj kjVar : this.c.k()) {
            if (kjVar != null && z) {
                kjVar.y.m(true);
            }
        }
    }

    public final void n() {
        ArrayList arrayListJ = this.c.j();
        int size = arrayListJ.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayListJ.get(i);
            i++;
            kj kjVar = (kj) obj;
            if (kjVar != null) {
                kjVar.l();
                kjVar.y.n();
            }
        }
    }

    public final boolean o() {
        if (this.s >= 1) {
            for (kj kjVar : this.c.k()) {
                if (kjVar != null) {
                    if (!kjVar.D ? kjVar.y.o() : false) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final void p() {
        if (this.s < 1) {
            return;
        }
        for (kj kjVar : this.c.k()) {
            if (kjVar != null && !kjVar.D) {
                kjVar.y.p();
            }
        }
    }

    public final void q(kj kjVar) {
        if (kjVar != null) {
            if (kjVar != this.c.d(kjVar.j)) {
                return;
            }
            kjVar.w.getClass();
            boolean zI = I(kjVar);
            Boolean bool = kjVar.o;
            if (bool == null || bool.booleanValue() != zI) {
                kjVar.o = Boolean.valueOf(zI);
                xj xjVar = kjVar.y;
                xjVar.Z();
                xjVar.q(xjVar.w);
            }
        }
    }

    public final void r(boolean z) {
        if (z && this.t != null) {
            Y(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
            throw null;
        }
        for (kj kjVar : this.c.k()) {
            if (kjVar != null && z) {
                kjVar.y.r(true);
            }
        }
    }

    public final boolean s() {
        if (this.s < 1) {
            return false;
        }
        boolean z = false;
        for (kj kjVar : this.c.k()) {
            if (kjVar != null && H(kjVar)) {
                if (!kjVar.D ? kjVar.y.s() : false) {
                    z = true;
                }
            }
        }
        return z;
    }

    public final void t(int i) {
        try {
            this.b = true;
            for (ek ekVar : ((HashMap) this.c.h).values()) {
                if (ekVar != null) {
                    ekVar.e = i;
                }
            }
            J(i, false);
            Iterator it = e().iterator();
            while (it.hasNext()) {
                ((ne) it.next()).c();
            }
            this.b = false;
            x(true);
        } catch (Throwable th) {
            this.b = false;
            throw th;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        kj kjVar = this.v;
        if (kjVar != null) {
            sb.append(kjVar.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(this.v)));
            sb.append("}");
        } else {
            mj mjVar = this.t;
            if (mjVar != null) {
                sb.append(mjVar.getClass().getSimpleName());
                sb.append("{");
                sb.append(Integer.toHexString(System.identityHashCode(this.t)));
                sb.append("}");
            } else {
                sb.append("null");
            }
        }
        sb.append("}}");
        return sb.toString();
    }

    public final void u(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        String str2;
        String str3 = str + "    ";
        y91 y91Var = this.c;
        ArrayList arrayList = (ArrayList) y91Var.g;
        String str4 = str + "    ";
        HashMap map = (HashMap) y91Var.h;
        if (!map.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (ek ekVar : map.values()) {
                printWriter.print(str);
                if (ekVar != null) {
                    kj kjVar = ekVar.c;
                    printWriter.println(kjVar);
                    kjVar.getClass();
                    printWriter.print(str4);
                    printWriter.print("mFragmentId=#");
                    printWriter.print(Integer.toHexString(kjVar.A));
                    printWriter.print(" mContainerId=#");
                    printWriter.print(Integer.toHexString(kjVar.B));
                    printWriter.print(" mTag=");
                    printWriter.println(kjVar.C);
                    printWriter.print(str4);
                    printWriter.print("mState=");
                    printWriter.print(kjVar.f);
                    printWriter.print(" mWho=");
                    printWriter.print(kjVar.j);
                    printWriter.print(" mBackStackNesting=");
                    printWriter.println(kjVar.v);
                    printWriter.print(str4);
                    printWriter.print("mAdded=");
                    printWriter.print(kjVar.p);
                    printWriter.print(" mRemoving=");
                    printWriter.print(kjVar.q);
                    printWriter.print(" mFromLayout=");
                    printWriter.print(kjVar.r);
                    printWriter.print(" mInLayout=");
                    printWriter.println(kjVar.s);
                    printWriter.print(str4);
                    printWriter.print("mHidden=");
                    printWriter.print(kjVar.D);
                    printWriter.print(" mDetached=");
                    printWriter.print(kjVar.E);
                    printWriter.print(" mMenuVisible=");
                    printWriter.print(kjVar.G);
                    printWriter.print(" mHasMenu=");
                    printWriter.println(false);
                    printWriter.print(str4);
                    printWriter.print("mRetainInstance=");
                    printWriter.print(kjVar.F);
                    printWriter.print(" mUserVisibleHint=");
                    printWriter.println(kjVar.K);
                    if (kjVar.w != null) {
                        printWriter.print(str4);
                        printWriter.print("mFragmentManager=");
                        printWriter.println(kjVar.w);
                    }
                    if (kjVar.x != null) {
                        printWriter.print(str4);
                        printWriter.print("mHost=");
                        printWriter.println(kjVar.x);
                    }
                    if (kjVar.z != null) {
                        printWriter.print(str4);
                        printWriter.print("mParentFragment=");
                        printWriter.println(kjVar.z);
                    }
                    if (kjVar.k != null) {
                        printWriter.print(str4);
                        printWriter.print("mArguments=");
                        printWriter.println(kjVar.k);
                    }
                    if (kjVar.g != null) {
                        printWriter.print(str4);
                        printWriter.print("mSavedFragmentState=");
                        printWriter.println(kjVar.g);
                    }
                    if (kjVar.h != null) {
                        printWriter.print(str4);
                        printWriter.print("mSavedViewState=");
                        printWriter.println(kjVar.h);
                    }
                    if (kjVar.i != null) {
                        printWriter.print(str4);
                        printWriter.print("mSavedViewRegistryState=");
                        printWriter.println(kjVar.i);
                    }
                    Object objD = kjVar.l;
                    if (objD == null) {
                        xj xjVar = kjVar.w;
                        objD = (xjVar == null || (str2 = kjVar.m) == null) ? null : xjVar.c.d(str2);
                    }
                    if (objD != null) {
                        printWriter.print(str4);
                        printWriter.print("mTarget=");
                        printWriter.print(objD);
                        printWriter.print(" mTargetRequestCode=");
                        printWriter.println(kjVar.n);
                    }
                    printWriter.print(str4);
                    printWriter.print("mPopDirection=");
                    jj jjVar = kjVar.L;
                    printWriter.println(jjVar == null ? false : jjVar.a);
                    jj jjVar2 = kjVar.L;
                    if ((jjVar2 == null ? 0 : jjVar2.b) != 0) {
                        printWriter.print(str4);
                        printWriter.print("getEnterAnim=");
                        jj jjVar3 = kjVar.L;
                        printWriter.println(jjVar3 == null ? 0 : jjVar3.b);
                    }
                    jj jjVar4 = kjVar.L;
                    if ((jjVar4 == null ? 0 : jjVar4.c) != 0) {
                        printWriter.print(str4);
                        printWriter.print("getExitAnim=");
                        jj jjVar5 = kjVar.L;
                        printWriter.println(jjVar5 == null ? 0 : jjVar5.c);
                    }
                    jj jjVar6 = kjVar.L;
                    if ((jjVar6 == null ? 0 : jjVar6.d) != 0) {
                        printWriter.print(str4);
                        printWriter.print("getPopEnterAnim=");
                        jj jjVar7 = kjVar.L;
                        printWriter.println(jjVar7 == null ? 0 : jjVar7.d);
                    }
                    jj jjVar8 = kjVar.L;
                    if ((jjVar8 == null ? 0 : jjVar8.e) != 0) {
                        printWriter.print(str4);
                        printWriter.print("getPopExitAnim=");
                        jj jjVar9 = kjVar.L;
                        printWriter.println(jjVar9 == null ? 0 : jjVar9.e);
                    }
                    if (kjVar.I != null) {
                        printWriter.print(str4);
                        printWriter.print("mContainer=");
                        printWriter.println(kjVar.I);
                    }
                    mj mjVar = kjVar.x;
                    if ((mjVar == null ? null : mjVar.D) != null) {
                        n10 n10Var = ((op) new s70(kjVar.d(), op.c).l(op.class)).b;
                        if (n10Var.h > 0) {
                            printWriter.print(str4);
                            printWriter.println("Loaders:");
                            if (n10Var.h > 0) {
                                if (n10Var.g[0] == null) {
                                    printWriter.print(str4);
                                    printWriter.print("  #");
                                    printWriter.print(n10Var.f[0]);
                                    printWriter.print(": ");
                                    throw null;
                                }
                                j7.j();
                            }
                        }
                    }
                    printWriter.print(str4);
                    printWriter.println("Child " + kjVar.y + ":");
                    kjVar.y.u(str4.concat("  "), fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        int size3 = arrayList.size();
        if (size3 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i = 0; i < size3; i++) {
                kj kjVar2 = (kj) arrayList.get(i);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.println(kjVar2.toString());
            }
        }
        ArrayList arrayList2 = this.e;
        if (arrayList2 != null && (size2 = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i2 = 0; i2 < size2; i2++) {
                kj kjVar3 = (kj) this.e.get(i2);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(kjVar3.toString());
            }
        }
        ArrayList arrayList3 = this.d;
        if (arrayList3 != null && (size = arrayList3.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i3 = 0; i3 < size; i3++) {
                s7 s7Var = (s7) this.d.get(i3);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i3);
                printWriter.print(": ");
                printWriter.println(s7Var.toString());
                s7Var.f(str3, printWriter, true);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.i.get());
        synchronized (this.a) {
            try {
                int size4 = this.a.size();
                if (size4 > 0) {
                    printWriter.print(str);
                    printWriter.println("Pending Actions:");
                    for (int i4 = 0; i4 < size4; i4++) {
                        Object obj = (vj) this.a.get(i4);
                        printWriter.print(str);
                        printWriter.print("  #");
                        printWriter.print(i4);
                        printWriter.print(": ");
                        printWriter.println(obj);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.t);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.u);
        if (this.v != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.v);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.s);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.E);
        printWriter.print(" mStopped=");
        printWriter.print(this.F);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.G);
        if (this.D) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.D);
        }
    }

    public final void v(vj vjVar, boolean z) {
        if (!z) {
            if (this.t == null) {
                if (this.G) {
                    j7.e("FragmentManager has been destroyed");
                    return;
                } else {
                    j7.e("FragmentManager has not been attached to a host.");
                    return;
                }
            }
            if (this.E || this.F) {
                j7.e("Can not perform this action after onSaveInstanceState");
                return;
            }
        }
        synchronized (this.a) {
            try {
                if (this.t == null) {
                    if (!z) {
                        throw new IllegalStateException("Activity has been destroyed");
                    }
                } else {
                    this.a.add(vjVar);
                    R();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void w(boolean z) {
        if (this.b) {
            j7.e("FragmentManager is already executing transactions");
            return;
        }
        if (this.t == null) {
            if (this.G) {
                j7.e("FragmentManager has been destroyed");
                return;
            } else {
                j7.e("FragmentManager has not been attached to a host.");
                return;
            }
        }
        if (Looper.myLooper() != this.t.E.getLooper()) {
            j7.e("Must be called from main thread of fragment host");
            return;
        }
        if (!z && (this.E || this.F)) {
            j7.e("Can not perform this action after onSaveInstanceState");
        } else if (this.I == null) {
            this.I = new ArrayList();
            this.J = new ArrayList();
        }
    }

    public final boolean x(boolean z) {
        boolean zA;
        ArrayList arrayList;
        w(z);
        boolean z2 = false;
        while (true) {
            ArrayList arrayList2 = this.I;
            ArrayList arrayList3 = this.J;
            synchronized (this.a) {
                if (this.a.isEmpty()) {
                    zA = false;
                } else {
                    try {
                        int size = this.a.size();
                        int i = 0;
                        zA = false;
                        while (true) {
                            arrayList = this.a;
                            if (i >= size) {
                                break;
                            }
                            zA |= ((vj) arrayList.get(i)).a(arrayList2, arrayList3);
                            i++;
                            throw th;
                        }
                        arrayList.clear();
                        this.t.E.removeCallbacks(this.M);
                    } catch (Throwable th) {
                        this.a.clear();
                        this.t.E.removeCallbacks(this.M);
                        throw th;
                    }
                }
            }
            if (!zA) {
                break;
            }
            z2 = true;
            this.b = true;
            try {
                O(this.I, this.J);
                d();
            } catch (Throwable th2) {
                d();
                throw th2;
            }
        }
        Z();
        if (this.H) {
            this.H = false;
            X();
        }
        ((HashMap) this.c.h).values().removeAll(Collections.singleton(null));
        return z2;
    }

    /* JADX WARN: Code duplicated, block: B:110:0x0229 A[PHI: r14
  0x0229: PHI (r14v19 char) = (r14v18 char), (r14v20 char) binds: [B:103:0x0219, B:108:0x0225] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:64:0x0177  */
    /* JADX WARN: Code duplicated, block: B:65:0x017d  */
    public final void y(ArrayList arrayList, ArrayList arrayList2, int i, int i2) {
        ViewGroup viewGroup;
        boolean z;
        int i3;
        boolean z2;
        boolean z3;
        int i4;
        int i5;
        boolean z4;
        int i6;
        y91 y91Var = this.c;
        boolean z5 = ((s7) arrayList.get(i)).o;
        ArrayList arrayList3 = this.K;
        if (arrayList3 == null) {
            this.K = new ArrayList();
        } else {
            arrayList3.clear();
        }
        this.K.addAll(y91Var.k());
        kj kjVar = this.w;
        int i7 = i;
        boolean z6 = false;
        while (true) {
            int i8 = 1;
            if (i7 >= i2) {
                boolean z7 = z5;
                this.K.clear();
                if (!z7 && this.s >= 1) {
                    for (int i9 = i; i9 < i2; i9++) {
                        ArrayList arrayList4 = ((s7) arrayList.get(i9)).a;
                        int size = arrayList4.size();
                        int i10 = 0;
                        while (i10 < size) {
                            Object obj = arrayList4.get(i10);
                            i10++;
                            kj kjVar2 = ((ik) obj).b;
                            if (kjVar2 != null && kjVar2.w != null) {
                                y91Var.l(f(kjVar2));
                            }
                        }
                    }
                }
                for (int i11 = i; i11 < i2; i11++) {
                    s7 s7Var = (s7) arrayList.get(i11);
                    if (((Boolean) arrayList2.get(i11)).booleanValue()) {
                        s7Var.c(-1);
                        xj xjVar = s7Var.p;
                        ArrayList arrayList5 = s7Var.a;
                        boolean z8 = true;
                        for (int size2 = arrayList5.size() - 1; size2 >= 0; size2--) {
                            ik ikVar = (ik) arrayList5.get(size2);
                            kj kjVar3 = ikVar.b;
                            if (kjVar3 != null) {
                                if (kjVar3.L != null) {
                                    kjVar3.f().a = z8;
                                }
                                int i12 = s7Var.f;
                                char c = 8194;
                                char c2 = 4097;
                                if (i12 != 4097) {
                                    if (i12 != 8194) {
                                        c = 4100;
                                        c2 = 8197;
                                        if (i12 != 8197) {
                                            if (i12 == 4099) {
                                                c = 4099;
                                            } else if (i12 != 4100) {
                                                c = 0;
                                            } else {
                                                c = c2;
                                            }
                                        }
                                    } else {
                                        c = c2;
                                    }
                                }
                                if (kjVar3.L != null || c != 0) {
                                    kjVar3.f();
                                    kjVar3.L.getClass();
                                }
                                kjVar3.f();
                                kjVar3.L.getClass();
                            }
                            switch (ikVar.a) {
                                case 1:
                                    kjVar3.z(ikVar.d, ikVar.e, ikVar.f, ikVar.g);
                                    z8 = true;
                                    xjVar.S(kjVar3, true);
                                    xjVar.N(kjVar3);
                                    break;
                                case 2:
                                default:
                                    throw new IllegalArgumentException("Unknown cmd: " + ikVar.a);
                                case 3:
                                    kjVar3.z(ikVar.d, ikVar.e, ikVar.f, ikVar.g);
                                    xjVar.a(kjVar3);
                                    z8 = true;
                                    break;
                                case 4:
                                    kjVar3.z(ikVar.d, ikVar.e, ikVar.f, ikVar.g);
                                    xjVar.getClass();
                                    W(kjVar3);
                                    z8 = true;
                                    break;
                                case 5:
                                    kjVar3.z(ikVar.d, ikVar.e, ikVar.f, ikVar.g);
                                    xjVar.S(kjVar3, true);
                                    xjVar.D(kjVar3);
                                    z8 = true;
                                    break;
                                case 6:
                                    kjVar3.z(ikVar.d, ikVar.e, ikVar.f, ikVar.g);
                                    xjVar.c(kjVar3);
                                    z8 = true;
                                    break;
                                case 7:
                                    kjVar3.z(ikVar.d, ikVar.e, ikVar.f, ikVar.g);
                                    xjVar.S(kjVar3, true);
                                    xjVar.g(kjVar3);
                                    z8 = true;
                                    break;
                                case 8:
                                    xjVar.U(null);
                                    z8 = true;
                                    break;
                                case 9:
                                    xjVar.U(kjVar3);
                                    z8 = true;
                                    break;
                                case 10:
                                    xjVar.T(kjVar3, ikVar.h);
                                    z8 = true;
                                    break;
                            }
                        }
                    } else {
                        s7Var.c(1);
                        xj xjVar2 = s7Var.p;
                        ArrayList arrayList6 = s7Var.a;
                        int size3 = arrayList6.size();
                        for (int i13 = 0; i13 < size3; i13++) {
                            ik ikVar2 = (ik) arrayList6.get(i13);
                            kj kjVar4 = ikVar2.b;
                            if (kjVar4 != null) {
                                if (kjVar4.L != null) {
                                    kjVar4.f().a = false;
                                }
                                int i14 = s7Var.f;
                                if (kjVar4.L != null || i14 != 0) {
                                    kjVar4.f();
                                    kjVar4.L.getClass();
                                }
                                kjVar4.f();
                                kjVar4.L.getClass();
                            }
                            switch (ikVar2.a) {
                                case 1:
                                    kjVar4.z(ikVar2.d, ikVar2.e, ikVar2.f, ikVar2.g);
                                    xjVar2.S(kjVar4, false);
                                    xjVar2.a(kjVar4);
                                    break;
                                case 2:
                                default:
                                    throw new IllegalArgumentException("Unknown cmd: " + ikVar2.a);
                                case 3:
                                    kjVar4.z(ikVar2.d, ikVar2.e, ikVar2.f, ikVar2.g);
                                    xjVar2.N(kjVar4);
                                    break;
                                case 4:
                                    kjVar4.z(ikVar2.d, ikVar2.e, ikVar2.f, ikVar2.g);
                                    xjVar2.D(kjVar4);
                                    break;
                                case 5:
                                    kjVar4.z(ikVar2.d, ikVar2.e, ikVar2.f, ikVar2.g);
                                    xjVar2.S(kjVar4, false);
                                    W(kjVar4);
                                    break;
                                case 6:
                                    kjVar4.z(ikVar2.d, ikVar2.e, ikVar2.f, ikVar2.g);
                                    xjVar2.g(kjVar4);
                                    break;
                                case 7:
                                    kjVar4.z(ikVar2.d, ikVar2.e, ikVar2.f, ikVar2.g);
                                    xjVar2.S(kjVar4, false);
                                    xjVar2.c(kjVar4);
                                    break;
                                case 8:
                                    xjVar2.U(kjVar4);
                                    break;
                                case 9:
                                    xjVar2.U(null);
                                    break;
                                case 10:
                                    xjVar2.T(kjVar4, ikVar2.i);
                                    break;
                            }
                        }
                    }
                }
                boolean zBooleanValue = ((Boolean) arrayList2.get(i2 - 1)).booleanValue();
                for (int i15 = i; i15 < i2; i15++) {
                    s7 s7Var2 = (s7) arrayList.get(i15);
                    if (zBooleanValue) {
                        for (int size4 = s7Var2.a.size() - 1; size4 >= 0; size4--) {
                            kj kjVar5 = ((ik) s7Var2.a.get(size4)).b;
                            if (kjVar5 != null) {
                                f(kjVar5).j();
                            }
                        }
                    } else {
                        ArrayList arrayList7 = s7Var2.a;
                        int size5 = arrayList7.size();
                        int i16 = 0;
                        while (i16 < size5) {
                            Object obj2 = arrayList7.get(i16);
                            i16++;
                            kj kjVar6 = ((ik) obj2).b;
                            if (kjVar6 != null) {
                                f(kjVar6).j();
                            }
                        }
                    }
                }
                J(this.s, true);
                HashSet<ne> hashSet = new HashSet();
                for (int i17 = i; i17 < i2; i17++) {
                    ArrayList arrayList8 = ((s7) arrayList.get(i17)).a;
                    int size6 = arrayList8.size();
                    int i18 = 0;
                    while (i18 < size6) {
                        Object obj3 = arrayList8.get(i18);
                        i18++;
                        kj kjVar7 = ((ik) obj3).b;
                        if (kjVar7 != null && (viewGroup = kjVar7.I) != null) {
                            hashSet.add(ne.d(viewGroup, C()));
                        }
                    }
                }
                for (ne neVar : hashSet) {
                    neVar.d = zBooleanValue;
                    synchronized (neVar.b) {
                        neVar.e();
                        neVar.e = false;
                        int size7 = neVar.b.size() - 1;
                        if (size7 >= 0) {
                            ((o10) neVar.b.get(size7)).getClass();
                            throw null;
                        }
                    }
                    neVar.b();
                }
                for (int i19 = i; i19 < i2; i19++) {
                    s7 s7Var3 = (s7) arrayList.get(i19);
                    if (((Boolean) arrayList2.get(i19)).booleanValue() && s7Var3.r >= 0) {
                        s7Var3.r = -1;
                    }
                    s7Var3.getClass();
                }
                return;
            }
            s7 s7Var4 = (s7) arrayList.get(i7);
            boolean zBooleanValue2 = ((Boolean) arrayList2.get(i7)).booleanValue();
            ArrayList arrayList9 = this.K;
            if (zBooleanValue2) {
                z = z5;
                i3 = i7;
                z2 = z6;
                int i20 = 1;
                ArrayList arrayList10 = s7Var4.a;
                int size8 = arrayList10.size() - 1;
                while (size8 >= 0) {
                    ik ikVar3 = (ik) arrayList10.get(size8);
                    int i21 = ikVar3.a;
                    if (i21 == i20) {
                        arrayList9.remove(ikVar3.b);
                    } else if (i21 != 3) {
                        switch (i21) {
                            case 6:
                                arrayList9.add(ikVar3.b);
                                break;
                            case 7:
                                arrayList9.remove(ikVar3.b);
                                break;
                            case 8:
                                kjVar = null;
                                break;
                            case 9:
                                kjVar = ikVar3.b;
                                break;
                            case 10:
                                ikVar3.i = ikVar3.h;
                                break;
                        }
                    } else {
                        arrayList9.add(ikVar3.b);
                    }
                    size8--;
                    i20 = 1;
                }
            } else {
                ArrayList arrayList11 = s7Var4.a;
                int i22 = 0;
                while (i22 < arrayList11.size()) {
                    ik ikVar4 = (ik) arrayList11.get(i22);
                    int i23 = ikVar4.a;
                    if (i23 != i8) {
                        z3 = z5;
                        if (i23 != 2) {
                            if (i23 == 3 || i23 == 6) {
                                arrayList9.remove(ikVar4.b);
                                kj kjVar8 = ikVar4.b;
                                if (kjVar8 == kjVar) {
                                    arrayList11.add(i22, new ik(9, kjVar8));
                                    i22++;
                                    i5 = i7;
                                    z4 = z6;
                                    i4 = 1;
                                    kjVar = null;
                                }
                            } else if (i23 == 7) {
                                i4 = 1;
                            } else if (i23 == 8) {
                                arrayList11.add(i22, new ik(9, kjVar, 0));
                                ikVar4.c = true;
                                i22++;
                                kjVar = ikVar4.b;
                            }
                            i5 = i7;
                            z4 = z6;
                            i4 = 1;
                        } else {
                            kj kjVar9 = ikVar4.b;
                            int i24 = kjVar9.B;
                            int size9 = arrayList9.size() - 1;
                            boolean z9 = false;
                            while (size9 >= 0) {
                                int i25 = size9;
                                kj kjVar10 = (kj) arrayList9.get(size9);
                                int i26 = i7;
                                if (kjVar10.B != i24) {
                                    z6 = z6;
                                } else if (kjVar10 == kjVar9) {
                                    z6 = z6;
                                    z9 = true;
                                } else {
                                    if (kjVar10 == kjVar) {
                                        i6 = 0;
                                        arrayList11.add(i22, new ik(9, kjVar10, 0));
                                        i22++;
                                        kjVar = null;
                                    } else {
                                        i6 = 0;
                                    }
                                    ik ikVar5 = new ik(3, kjVar10, i6);
                                    ikVar5.d = ikVar4.d;
                                    ikVar5.f = ikVar4.f;
                                    ikVar5.e = ikVar4.e;
                                    ikVar5.g = ikVar4.g;
                                    arrayList11.add(i22, ikVar5);
                                    arrayList9.remove(kjVar10);
                                    i22++;
                                    kjVar = kjVar;
                                }
                                size9 = i25 - 1;
                                z6 = z6;
                                i7 = i26;
                            }
                            i5 = i7;
                            z4 = z6;
                            i4 = 1;
                            if (z9) {
                                arrayList11.remove(i22);
                                i22--;
                            } else {
                                ikVar4.a = 1;
                                ikVar4.c = true;
                                arrayList9.add(kjVar9);
                            }
                        }
                        i22 += i4;
                        i8 = i4;
                        z5 = z3;
                        z6 = z4;
                        i7 = i5;
                    } else {
                        z3 = z5;
                        i4 = i8;
                    }
                    i5 = i7;
                    z4 = z6;
                    arrayList9.add(ikVar4.b);
                    i22 += i4;
                    i8 = i4;
                    z5 = z3;
                    z6 = z4;
                    i7 = i5;
                }
                z = z5;
                i3 = i7;
                z2 = z6;
            }
            z6 = z2 || s7Var4.g;
            i7 = i3 + 1;
            z5 = z;
        }
    }

    public final kj z(int i) {
        y91 y91Var = this.c;
        ArrayList arrayList = (ArrayList) y91Var.g;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            kj kjVar = (kj) arrayList.get(size);
            if (kjVar != null && kjVar.A == i) {
                return kjVar;
            }
        }
        for (ek ekVar : ((HashMap) y91Var.h).values()) {
            if (ekVar != null) {
                kj kjVar2 = ekVar.c;
                if (kjVar2.A == i) {
                    return kjVar2;
                }
            }
        }
        return null;
    }
}
