package defpackage;

import android.os.Looper;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class oo {
    public final boolean a;
    public di b;
    public fo c;
    public final WeakReference d;
    public int e;
    public boolean f;
    public boolean g;
    public final ArrayList h;
    public final y10 i;

    public oo(mo moVar) {
        new AtomicReference(null);
        this.a = true;
        this.b = new di();
        fo foVar = fo.g;
        this.c = foVar;
        this.h = new ArrayList();
        this.d = new WeakReference(moVar);
        this.i = new y10(foVar);
    }

    public final void a(lo loVar) {
        jo jeVar;
        Object obj;
        mo moVar;
        eo eoVar;
        c("addObserver");
        fo foVar = this.c;
        fo foVar2 = fo.f;
        if (foVar != foVar2) {
            foVar2 = fo.g;
        }
        no noVar = new no();
        HashMap map = qo.a;
        boolean z = loVar instanceof jo;
        boolean z2 = loVar instanceof he;
        int i = 2;
        Object obj2 = null;
        int i2 = 0;
        if (z && z2) {
            jeVar = new je((he) loVar, i2, (jo) loVar);
        } else if (z2) {
            jeVar = new je((he) loVar, i2, obj2);
        } else if (z) {
            jeVar = (jo) loVar;
        } else {
            Class<?> cls = loVar.getClass();
            if (qo.c(cls) == 2) {
                Object obj3 = qo.b.get(cls);
                obj3.getClass();
                List list = (List) obj3;
                if (list.size() == 1) {
                    qo.a((Constructor) list.get(0), loVar);
                    throw null;
                }
                int size = list.size();
                rl[] rlVarArr = new rl[size];
                if (size > 0) {
                    qo.a((Constructor) list.get(0), loVar);
                    throw null;
                }
                jeVar = new pw(i, rlVarArr);
            } else {
                jeVar = new je(loVar);
            }
        }
        noVar.b = jeVar;
        noVar.a = foVar2;
        di diVar = this.b;
        my myVarA = diVar.a(loVar);
        if (myVarA != null) {
            obj = myVarA.g;
        } else {
            HashMap map2 = diVar.j;
            my myVar = new my(loVar, noVar);
            diVar.i++;
            my myVar2 = diVar.g;
            if (myVar2 == null) {
                diVar.f = myVar;
                diVar.g = myVar;
            } else {
                myVar2.h = myVar;
                myVar.i = myVar2;
                diVar.g = myVar;
            }
            map2.put(loVar, myVar);
            obj = null;
        }
        if (((no) obj) == null && (moVar = (mo) this.d.get()) != null) {
            i2 = (this.e != 0 || this.f) ? 1 : 0;
            fo foVarB = b(loVar);
            this.e++;
            while (noVar.a.compareTo(foVarB) < 0 && this.b.j.containsKey(loVar)) {
                fo foVar3 = noVar.a;
                ArrayList arrayList = this.h;
                arrayList.add(foVar3);
                bo boVar = eo.Companion;
                fo foVar4 = noVar.a;
                boVar.getClass();
                foVar4.getClass();
                int iOrdinal = foVar4.ordinal();
                if (iOrdinal == 1) {
                    eoVar = eo.ON_CREATE;
                } else if (iOrdinal != 2) {
                    eoVar = iOrdinal != 3 ? null : eo.ON_RESUME;
                } else {
                    eoVar = eo.ON_START;
                }
                if (eoVar == null) {
                    j7.o(noVar.a, "no event up from ");
                    return;
                } else {
                    noVar.a(moVar, eoVar);
                    arrayList.remove(arrayList.size() - 1);
                    foVarB = b(loVar);
                }
            }
            if (i2 == 0) {
                g();
            }
            this.e--;
        }
    }

    public final fo b(lo loVar) {
        HashMap map = this.b.j;
        my myVar = map.containsKey(loVar) ? ((my) map.get(loVar)).i : null;
        fo foVar = myVar != null ? ((no) myVar.g).a : null;
        ArrayList arrayList = this.h;
        fo foVar2 = arrayList.isEmpty() ? null : (fo) arrayList.get(arrayList.size() - 1);
        fo foVar3 = this.c;
        foVar3.getClass();
        if (foVar == null || foVar.compareTo(foVar3) >= 0) {
            foVar = foVar3;
        }
        return (foVar2 == null || foVar2.compareTo(foVar) >= 0) ? foVar : foVar2;
    }

    public final void c(String str) {
        if (this.a) {
            d7.Q().C.getClass();
            if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
                throw new IllegalStateException(ec.i("Method ", str, " must be called on the main thread").toString());
            }
        }
    }

    public final void d(eo eoVar) {
        eoVar.getClass();
        c("handleLifecycleEvent");
        e(eoVar.a());
    }

    public final void e(fo foVar) {
        if (this.c == foVar) {
            return;
        }
        mo moVar = (mo) this.d.get();
        fo foVar2 = this.c;
        foVar2.getClass();
        fo foVar3 = fo.g;
        fo foVar4 = fo.f;
        if (foVar2 == foVar3 && foVar == foVar4) {
            throw new IllegalStateException(("State must be at least '" + fo.h + "' to be moved to '" + foVar + "' in component " + moVar).toString());
        }
        if (foVar2 == foVar4 && foVar2 != foVar) {
            throw new IllegalStateException(("State is '" + foVar4 + "' and cannot be moved to `" + foVar + "` in component " + moVar).toString());
        }
        this.c = foVar;
        if (this.f || this.e != 0) {
            this.g = true;
            return;
        }
        this.f = true;
        g();
        this.f = false;
        if (this.c == foVar4) {
            this.b = new di();
        }
    }

    public final void f(lo loVar) {
        c("removeObserver");
        this.b.b(loVar);
    }

    public final void g() {
        eo eoVar;
        eo eoVar2;
        mo moVar = (mo) this.d.get();
        if (moVar == null) {
            j7.e("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
            return;
        }
        while (true) {
            di diVar = this.b;
            if (diVar.i != 0) {
                my myVar = diVar.f;
                myVar.getClass();
                fo foVar = ((no) myVar.g).a;
                my myVar2 = this.b.g;
                myVar2.getClass();
                fo foVar2 = ((no) myVar2.g).a;
                if (foVar == foVar2 && this.c == foVar2) {
                    break;
                }
                this.g = false;
                fo foVar3 = this.c;
                my myVar3 = this.b.f;
                myVar3.getClass();
                int iCompareTo = foVar3.compareTo(((no) myVar3.g).a);
                ArrayList arrayList = this.h;
                if (iCompareTo < 0) {
                    di diVar2 = this.b;
                    ly lyVar = new ly(diVar2.g, diVar2.f, 1);
                    diVar2.h.put(lyVar, Boolean.FALSE);
                    while (lyVar.hasNext() && !this.g) {
                        Map.Entry entry = (Map.Entry) lyVar.next();
                        entry.getClass();
                        lo loVar = (lo) entry.getKey();
                        no noVar = (no) entry.getValue();
                        while (noVar.a.compareTo(this.c) > 0 && !this.g && this.b.j.containsKey(loVar)) {
                            bo boVar = eo.Companion;
                            fo foVar4 = noVar.a;
                            boVar.getClass();
                            foVar4.getClass();
                            int iOrdinal = foVar4.ordinal();
                            if (iOrdinal == 2) {
                                eoVar2 = eo.ON_DESTROY;
                            } else if (iOrdinal != 3) {
                                eoVar2 = iOrdinal != 4 ? null : eo.ON_PAUSE;
                            } else {
                                eoVar2 = eo.ON_STOP;
                            }
                            if (eoVar2 == null) {
                                j7.o(noVar.a, "no event down from ");
                                return;
                            } else {
                                arrayList.add(eoVar2.a());
                                noVar.a(moVar, eoVar2);
                                arrayList.remove(arrayList.size() - 1);
                            }
                        }
                    }
                }
                my myVar4 = this.b.g;
                if (!this.g && myVar4 != null && this.c.compareTo(((no) myVar4.g).a) > 0) {
                    di diVar3 = this.b;
                    diVar3.getClass();
                    ny nyVar = new ny(diVar3);
                    diVar3.h.put(nyVar, Boolean.FALSE);
                    while (nyVar.hasNext() && !this.g) {
                        Map.Entry entry2 = (Map.Entry) nyVar.next();
                        lo loVar2 = (lo) entry2.getKey();
                        no noVar2 = (no) entry2.getValue();
                        while (noVar2.a.compareTo(this.c) < 0 && !this.g && this.b.j.containsKey(loVar2)) {
                            arrayList.add(noVar2.a);
                            bo boVar2 = eo.Companion;
                            fo foVar5 = noVar2.a;
                            boVar2.getClass();
                            foVar5.getClass();
                            int iOrdinal2 = foVar5.ordinal();
                            if (iOrdinal2 == 1) {
                                eoVar = eo.ON_CREATE;
                            } else if (iOrdinal2 != 2) {
                                eoVar = iOrdinal2 != 3 ? null : eo.ON_RESUME;
                            } else {
                                eoVar = eo.ON_START;
                            }
                            if (eoVar == null) {
                                j7.o(noVar2.a, "no event up from ");
                                return;
                            } else {
                                noVar2.a(moVar, eoVar);
                                arrayList.remove(arrayList.size() - 1);
                            }
                        }
                    }
                }
            } else {
                break;
            }
        }
        this.g = false;
        this.i.c(this.c);
    }
}
