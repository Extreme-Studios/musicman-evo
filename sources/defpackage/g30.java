package defpackage;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
public final class g30 {
    public final String a;
    public final Map b;
    public final Set c;
    public final Set d;

    public g30(String str, HashMap map, HashSet hashSet, HashSet hashSet2) {
        this.a = str;
        this.b = Collections.unmodifiableMap(map);
        this.c = Collections.unmodifiableSet(hashSet);
        this.d = hashSet2 == null ? null : Collections.unmodifiableSet(hashSet2);
    }

    public static g30 a(lk lkVar, String str) {
        ArrayList arrayList;
        Cursor cursorE = lkVar.e("PRAGMA table_info(`" + str + "`)");
        HashMap map = new HashMap();
        try {
            if (cursorE.getColumnCount() > 0) {
                int columnIndex = cursorE.getColumnIndex("name");
                int columnIndex2 = cursorE.getColumnIndex("type");
                int columnIndex3 = cursorE.getColumnIndex("notnull");
                int columnIndex4 = cursorE.getColumnIndex("pk");
                int columnIndex5 = cursorE.getColumnIndex("dflt_value");
                while (cursorE.moveToNext()) {
                    String string = cursorE.getString(columnIndex);
                    map.put(string, new c30(cursorE.getInt(columnIndex4), 2, string, cursorE.getString(columnIndex2), cursorE.getString(columnIndex5), cursorE.getInt(columnIndex3) != 0));
                }
            }
            cursorE.close();
            HashSet hashSet = new HashSet();
            Cursor cursorE2 = lkVar.e("PRAGMA foreign_key_list(`" + str + "`)");
            try {
                int columnIndex6 = cursorE2.getColumnIndex("id");
                int columnIndex7 = cursorE2.getColumnIndex("seq");
                int columnIndex8 = cursorE2.getColumnIndex("table");
                int columnIndex9 = cursorE2.getColumnIndex("on_delete");
                int columnIndex10 = cursorE2.getColumnIndex("on_update");
                ArrayList arrayListB = b(cursorE2);
                int count = cursorE2.getCount();
                int i = 0;
                while (i < count) {
                    cursorE2.moveToPosition(i);
                    if (cursorE2.getInt(columnIndex7) != 0) {
                        arrayList = arrayListB;
                    } else {
                        int i2 = cursorE2.getInt(columnIndex6);
                        ArrayList arrayList2 = new ArrayList();
                        ArrayList arrayList3 = new ArrayList();
                        int size = arrayListB.size();
                        int i3 = 0;
                        while (i3 < size) {
                            Object obj = arrayListB.get(i3);
                            i3++;
                            int i4 = size;
                            e30 e30Var = (e30) obj;
                            ArrayList arrayList4 = arrayListB;
                            if (e30Var.f == i2) {
                                arrayList2.add(e30Var.h);
                                arrayList3.add(e30Var.i);
                            }
                            size = i4;
                            arrayListB = arrayList4;
                        }
                        arrayList = arrayListB;
                        hashSet.add(new d30(cursorE2.getString(columnIndex8), cursorE2.getString(columnIndex9), cursorE2.getString(columnIndex10), arrayList2, arrayList3));
                    }
                    i++;
                    columnIndex6 = columnIndex6;
                    columnIndex7 = columnIndex7;
                    count = count;
                    arrayListB = arrayList;
                }
                cursorE2.close();
                Cursor cursorE3 = lkVar.e("PRAGMA index_list(`" + str + "`)");
                try {
                    int columnIndex11 = cursorE3.getColumnIndex("name");
                    int columnIndex12 = cursorE3.getColumnIndex("origin");
                    int columnIndex13 = cursorE3.getColumnIndex("unique");
                    HashSet hashSet2 = null;
                    if (columnIndex11 != -1 && columnIndex12 != -1 && columnIndex13 != -1) {
                        HashSet hashSet3 = new HashSet();
                        while (true) {
                            if (!cursorE3.moveToNext()) {
                                cursorE3.close();
                                hashSet2 = hashSet3;
                                break;
                            }
                            if ("c".equals(cursorE3.getString(columnIndex12))) {
                                f30 f30VarC = c(lkVar, cursorE3.getString(columnIndex11), cursorE3.getInt(columnIndex13) == 1);
                                if (f30VarC == null) {
                                    cursorE3.close();
                                    break;
                                }
                                hashSet3.add(f30VarC);
                            }
                        }
                    } else {
                        cursorE3.close();
                        break;
                    }
                    return new g30(str, map, hashSet, hashSet2);
                } catch (Throwable th) {
                    cursorE3.close();
                    throw th;
                }
            } catch (Throwable th2) {
                cursorE2.close();
                throw th2;
            }
        } catch (Throwable th3) {
            cursorE.close();
            throw th3;
        }
    }

    public static ArrayList b(Cursor cursor) {
        int columnIndex = cursor.getColumnIndex("id");
        int columnIndex2 = cursor.getColumnIndex("seq");
        int columnIndex3 = cursor.getColumnIndex("from");
        int columnIndex4 = cursor.getColumnIndex("to");
        int count = cursor.getCount();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < count; i++) {
            cursor.moveToPosition(i);
            arrayList.add(new e30(cursor.getInt(columnIndex), cursor.getInt(columnIndex2), cursor.getString(columnIndex3), cursor.getString(columnIndex4)));
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public static f30 c(lk lkVar, String str, boolean z) {
        Cursor cursorE = lkVar.e("PRAGMA index_xinfo(`" + str + "`)");
        try {
            int columnIndex = cursorE.getColumnIndex("seqno");
            int columnIndex2 = cursorE.getColumnIndex("cid");
            int columnIndex3 = cursorE.getColumnIndex("name");
            if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1) {
                TreeMap treeMap = new TreeMap();
                while (cursorE.moveToNext()) {
                    if (cursorE.getInt(columnIndex2) >= 0) {
                        treeMap.put(Integer.valueOf(cursorE.getInt(columnIndex)), cursorE.getString(columnIndex3));
                    }
                }
                ArrayList arrayList = new ArrayList(treeMap.size());
                arrayList.addAll(treeMap.values());
                return new f30(str, z, arrayList);
            }
            return null;
        } finally {
            cursorE.close();
        }
    }

    public final boolean equals(Object obj) {
        Set set;
        if (this == obj) {
            return true;
        }
        if (obj == null || g30.class != obj.getClass()) {
            return false;
        }
        g30 g30Var = (g30) obj;
        if (!this.a.equals(g30Var.a)) {
            return false;
        }
        Map map = g30Var.b;
        Map map2 = this.b;
        if (map2 != null) {
            if (!map2.equals(map)) {
                return false;
            }
        } else if (map != null) {
            return false;
        }
        Set set2 = g30Var.c;
        Set set3 = this.c;
        if (set3 != null) {
            if (!set3.equals(set2)) {
                return false;
            }
        } else if (set2 != null) {
            return false;
        }
        Set set4 = this.d;
        if (set4 == null || (set = g30Var.d) == null) {
            return true;
        }
        return set4.equals(set);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Map map = this.b;
        int iHashCode2 = (iHashCode + (map != null ? map.hashCode() : 0)) * 31;
        Set set = this.c;
        return iHashCode2 + (set != null ? set.hashCode() : 0);
    }

    public final String toString() {
        return "TableInfo{name='" + this.a + "', columns=" + this.b + ", foreignKeys=" + this.c + ", indices=" + this.d + '}';
    }
}
