package defpackage;

import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import android.util.Pair;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class mk implements DatabaseErrorHandler {
    public final /* synthetic */ us2 a;
    public final /* synthetic */ lk[] b;

    public mk(us2 us2Var, lk[] lkVarArr) {
        this.a = us2Var;
        this.b = lkVarArr;
    }

    @Override // android.database.DatabaseErrorHandler
    public final void onCorruption(SQLiteDatabase sQLiteDatabase) {
        lk lkVarA = nk.a(this.b, sQLiteDatabase);
        this.a.getClass();
        Log.e("SupportSQLite", "Corruption reported by sqlite on database: " + ((SQLiteDatabase) lkVarA.g).getPath());
        SQLiteDatabase sQLiteDatabase2 = (SQLiteDatabase) lkVarA.g;
        if (!sQLiteDatabase2.isOpen()) {
            us2.j(sQLiteDatabase2.getPath());
            return;
        }
        List<Pair<String, String>> attachedDbs = null;
        try {
            try {
                attachedDbs = sQLiteDatabase2.getAttachedDbs();
            } catch (SQLiteException unused) {
            }
            try {
                lkVarA.close();
            } catch (IOException unused2) {
            }
        } finally {
            if (attachedDbs != null) {
                Iterator<Pair<String, String>> it = attachedDbs.iterator();
                while (it.hasNext()) {
                    us2.j((String) it.next().second);
                }
            } else {
                us2.j(sQLiteDatabase2.getPath());
            }
        }
    }
}
