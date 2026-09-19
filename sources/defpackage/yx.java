package defpackage;

import android.database.sqlite.SQLiteProgram;
import java.io.Closeable;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
public final class yx implements r20, Closeable {
    public static final TreeMap n = new TreeMap();
    public volatile String f;
    public final long[] g;
    public final double[] h;
    public final String[] i;
    public final byte[][] j;
    public final int[] k;
    public final int l;
    public int m;

    public yx(int i) {
        this.l = i;
        int i2 = i + 1;
        this.k = new int[i2];
        this.g = new long[i2];
        this.h = new double[i2];
        this.i = new String[i2];
        this.j = new byte[i2][];
    }

    public static yx c(String str, int i) {
        TreeMap treeMap = n;
        synchronized (treeMap) {
            try {
                Map.Entry entryCeilingEntry = treeMap.ceilingEntry(Integer.valueOf(i));
                if (entryCeilingEntry == null) {
                    yx yxVar = new yx(i);
                    yxVar.f = str;
                    yxVar.m = i;
                    return yxVar;
                }
                treeMap.remove(entryCeilingEntry.getKey());
                yx yxVar2 = (yx) entryCeilingEntry.getValue();
                yxVar2.f = str;
                yxVar2.m = i;
                return yxVar2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.r20
    public final String a() {
        return this.f;
    }

    @Override // defpackage.r20
    public final void b(lk lkVar) {
        for (int i = 1; i <= this.m; i++) {
            int i2 = this.k[i];
            if (i2 == 1) {
                ((SQLiteProgram) lkVar.g).bindNull(i);
            } else if (i2 == 2) {
                ((SQLiteProgram) lkVar.g).bindLong(i, this.g[i]);
            } else if (i2 == 3) {
                ((SQLiteProgram) lkVar.g).bindDouble(i, this.h[i]);
            } else if (i2 == 4) {
                ((SQLiteProgram) lkVar.g).bindString(i, this.i[i]);
            } else if (i2 == 5) {
                ((SQLiteProgram) lkVar.g).bindBlob(i, this.j[i]);
            }
        }
    }

    public final void d() {
        TreeMap treeMap = n;
        synchronized (treeMap) {
            treeMap.put(Integer.valueOf(this.l), this);
            if (treeMap.size() > 15) {
                int size = treeMap.size() - 10;
                Iterator it = treeMap.descendingKeySet().iterator();
                while (true) {
                    int i = size - 1;
                    if (size <= 0) {
                        break;
                    }
                    it.next();
                    it.remove();
                    size = i;
                }
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
