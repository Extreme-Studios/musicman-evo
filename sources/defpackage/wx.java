package defpackage;

import android.content.Context;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeMap;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class wx {
    public final String a;
    public final Context b;
    public ArrayList c;
    public Executor d;
    public Executor e;
    public p20 f;
    public boolean g;
    public boolean h = true;
    public boolean i;
    public final dr0 j;
    public HashSet k;

    public wx(Context context, String str) {
        this.b = context;
        this.a = str;
        dr0 dr0Var = new dr0(7);
        dr0Var.g = new HashMap();
        this.j = dr0Var;
    }

    public final void a(ps... psVarArr) {
        if (this.k == null) {
            this.k = new HashSet();
        }
        for (ps psVar : psVarArr) {
            this.k.add(Integer.valueOf(psVar.a));
            this.k.add(Integer.valueOf(psVar.b));
        }
        dr0 dr0Var = this.j;
        dr0Var.getClass();
        for (ps psVar2 : psVarArr) {
            int i = psVar2.a;
            int i2 = psVar2.b;
            HashMap map = (HashMap) dr0Var.g;
            TreeMap treeMap = (TreeMap) map.get(Integer.valueOf(i));
            if (treeMap == null) {
                treeMap = new TreeMap();
                map.put(Integer.valueOf(i), treeMap);
            }
            ps psVar3 = (ps) treeMap.get(Integer.valueOf(i2));
            if (psVar3 != null) {
                Log.w("ROOM", "Overriding migration " + psVar3 + " with " + psVar2);
            }
            treeMap.put(Integer.valueOf(i2), psVar2);
        }
    }
}
