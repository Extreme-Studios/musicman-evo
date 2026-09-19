package defpackage;

import android.util.Log;
import android.view.ViewGroup;
import com.extremestudios.musicmanevo.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class ne {
    public final ViewGroup a;
    public final ArrayList b = new ArrayList();
    public final ArrayList c = new ArrayList();
    public boolean d = false;
    public boolean e = false;

    public ne(ViewGroup viewGroup) {
        this.a = viewGroup;
    }

    public static ne d(ViewGroup viewGroup, ig igVar) {
        Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
        if (tag instanceof ne) {
            return (ne) tag;
        }
        igVar.getClass();
        ne neVar = new ne(viewGroup);
        viewGroup.setTag(R.id.special_effects_controller_view_tag, neVar);
        return neVar;
    }

    public final void a(ArrayList arrayList, boolean z) {
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            ((o10) it.next()).getClass();
            throw null;
        }
        if (xj.E(2)) {
            Log.v("FragmentManager", "Executing operations from null to null");
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList(arrayList);
        ((o10) arrayList.get(arrayList.size() - 1)).getClass();
        Iterator it2 = arrayList.iterator();
        if (it2.hasNext()) {
            ((o10) it2.next()).getClass();
            throw null;
        }
        Iterator it3 = arrayList.iterator();
        if (it3.hasNext()) {
            ((o10) it3.next()).b();
            throw null;
        }
        HashMap map = new HashMap();
        if (arrayList3.size() > 0) {
            ((me) arrayList3.get(0)).getClass();
            throw null;
        }
        if (arrayList3.size() > 0) {
            ((me) arrayList3.get(0)).getClass();
            map.put(null, Boolean.FALSE);
            throw null;
        }
        boolean zContainsValue = map.containsValue(Boolean.TRUE);
        this.a.getContext();
        ArrayList arrayList5 = new ArrayList();
        if (arrayList2.size() > 0) {
            ((le) arrayList2.get(0)).getClass();
            throw null;
        }
        if (arrayList5.size() > 0) {
            ((le) arrayList5.get(0)).getClass();
            if (!zContainsValue || !xj.E(2)) {
                throw null;
            }
            Log.v("FragmentManager", "Ignoring Animation set on null as Animations cannot run alongside Transitions.");
            throw null;
        }
        if (arrayList4.size() > 0) {
            ((o10) arrayList4.get(0)).getClass();
            throw null;
        }
        arrayList4.clear();
        if (xj.E(2)) {
            Log.v("FragmentManager", "Completed executing operations from null to null");
        }
    }

    public final void b() {
        if (this.e) {
            return;
        }
        ViewGroup viewGroup = this.a;
        WeakHashMap weakHashMap = w60.a;
        if (!viewGroup.isAttachedToWindow()) {
            c();
            this.d = false;
            return;
        }
        synchronized (this.b) {
            try {
                if (!this.b.isEmpty()) {
                    ArrayList arrayList = new ArrayList(this.c);
                    this.c.clear();
                    int size = arrayList.size();
                    int i = 0;
                    while (i < size) {
                        Object obj = arrayList.get(i);
                        i++;
                        o10 o10Var = (o10) obj;
                        if (xj.E(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Cancelling operation " + o10Var);
                        }
                        o10Var.a();
                        this.c.add(o10Var);
                    }
                    e();
                    ArrayList arrayList2 = new ArrayList(this.b);
                    this.b.clear();
                    this.c.addAll(arrayList2);
                    if (xj.E(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Executing pending operations");
                    }
                    int size2 = arrayList2.size();
                    int i2 = 0;
                    while (i2 < size2) {
                        Object obj2 = arrayList2.get(i2);
                        i2++;
                        ((o10) obj2).b();
                    }
                    a(arrayList2, this.d);
                    this.d = false;
                    if (xj.E(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Finished executing pending operations");
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c() {
        String str;
        String str2;
        if (xj.E(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Forcing all operations to complete");
        }
        ViewGroup viewGroup = this.a;
        WeakHashMap weakHashMap = w60.a;
        boolean zIsAttachedToWindow = viewGroup.isAttachedToWindow();
        synchronized (this.b) {
            try {
                e();
                ArrayList arrayList = this.b;
                int size = arrayList.size();
                int i = 0;
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    ((o10) obj).b();
                }
                ArrayList arrayList2 = new ArrayList(this.c);
                int size2 = arrayList2.size();
                int i3 = 0;
                while (i3 < size2) {
                    Object obj2 = arrayList2.get(i3);
                    i3++;
                    o10 o10Var = (o10) obj2;
                    if (xj.E(2)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("SpecialEffectsController: ");
                        if (zIsAttachedToWindow) {
                            str2 = "";
                        } else {
                            str2 = "Container " + this.a + " is not attached to window. ";
                        }
                        sb.append(str2);
                        sb.append("Cancelling running operation ");
                        sb.append(o10Var);
                        Log.v("FragmentManager", sb.toString());
                    }
                    o10Var.a();
                }
                ArrayList arrayList3 = new ArrayList(this.b);
                int size3 = arrayList3.size();
                while (i < size3) {
                    Object obj3 = arrayList3.get(i);
                    i++;
                    o10 o10Var2 = (o10) obj3;
                    if (xj.E(2)) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("SpecialEffectsController: ");
                        if (zIsAttachedToWindow) {
                            str = "";
                        } else {
                            str = "Container " + this.a + " is not attached to window. ";
                        }
                        sb2.append(str);
                        sb2.append("Cancelling pending operation ");
                        sb2.append(o10Var2);
                        Log.v("FragmentManager", sb2.toString());
                    }
                    o10Var2.a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void e() {
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((o10) obj).getClass();
        }
    }
}
