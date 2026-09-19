package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import androidx.work.impl.WorkDatabase_Impl;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class nk extends SQLiteOpenHelper {
    public final lk[] f;
    public final us2 g;
    public boolean h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nk(Context context, String str, lk[] lkVarArr, us2 us2Var) {
        super(context, str, null, 12, new mk(us2Var, lkVarArr));
        us2Var.getClass();
        this.g = us2Var;
        this.f = lkVarArr;
    }

    public static lk a(lk[] lkVarArr, SQLiteDatabase sQLiteDatabase) {
        lk lkVar = lkVarArr[0];
        if (lkVar == null || ((SQLiteDatabase) lkVar.g) != sQLiteDatabase) {
            lkVarArr[0] = new lk(sQLiteDatabase, 0);
        }
        return lkVarArr[0];
    }

    public final synchronized lk b() {
        this.h = false;
        SQLiteDatabase writableDatabase = getWritableDatabase();
        if (!this.h) {
            return a(this.f, writableDatabase);
        }
        close();
        return b();
    }

    @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
    public final synchronized void close() {
        super.close();
        this.f[0] = null;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
        a(this.f, sQLiteDatabase);
        this.g.getClass();
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        lk lkVarA = a(this.f, sQLiteDatabase);
        us2 us2Var = this.g;
        zy1 zy1Var = (zy1) us2Var.h;
        Cursor cursorE = lkVarA.e("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
        try {
            boolean z = cursorE.moveToFirst() && cursorE.getInt(0) == 0;
            cursorE.close();
            zy1.k(lkVarA);
            if (!z) {
                xx xxVarL = zy1.l(lkVarA);
                if (!xxVarL.b) {
                    j7.o(xxVarL.a, "Pre-packaged database has an invalid schema: ");
                    return;
                }
            }
            us2Var.l(lkVarA);
            WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) zy1Var.g;
            List list = workDatabase_Impl.d;
            if (list != null) {
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    ((c90) workDatabase_Impl.d.get(i)).getClass();
                }
            }
        } catch (Throwable th) {
            cursorE.close();
            throw th;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        this.h = true;
        this.g.k(a(this.f, sQLiteDatabase), i, i2);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        if (this.h) {
            return;
        }
        lk lkVarA = a(this.f, sQLiteDatabase);
        us2 us2Var = this.g;
        Object obj = us2Var.h;
        Cursor cursorE = lkVarA.e("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'");
        try {
            boolean z = cursorE.moveToFirst() && cursorE.getInt(0) != 0;
            cursorE.close();
            if (z) {
                Cursor cursorD = lkVarA.d(new wo2("SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1", 4));
                try {
                    String string = cursorD.moveToFirst() ? cursorD.getString(0) : null;
                    cursorD.close();
                    if (!"c103703e120ae8cc73c9248622f3cd1e".equals(string) && !"49f946663a8deb7054212b8adda248c6".equals(string)) {
                        j7.e("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number.");
                        return;
                    }
                } catch (Throwable th) {
                    cursorD.close();
                    throw th;
                }
            } else {
                xx xxVarL = zy1.l(lkVarA);
                if (!xxVarL.b) {
                    j7.o(xxVarL.a, "Pre-packaged database has an invalid schema: ");
                    return;
                }
                us2Var.l(lkVarA);
            }
            lkVarA.c("PRAGMA foreign_keys = ON");
            throw null;
        } catch (Throwable th2) {
            cursorE.close();
            throw th2;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        this.h = true;
        this.g.k(a(this.f, sQLiteDatabase), i, i2);
    }
}
