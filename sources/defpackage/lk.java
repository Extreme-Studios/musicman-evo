package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteClosable;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteProgram;
import java.io.Closeable;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public class lk implements Closeable {
    public static final String[] h = new String[0];
    public final /* synthetic */ int f;
    public final Object g;

    public lk(ByteBuffer byteBuffer) {
        this.f = 2;
        this.g = byteBuffer.duplicate();
    }

    public void b() {
        ((SQLiteDatabase) this.g).endTransaction();
    }

    public void c(String str) {
        ((SQLiteDatabase) this.g).execSQL(str);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.f) {
            case 0:
                ((SQLiteDatabase) this.g).close();
                break;
            case 1:
                ((SQLiteProgram) this.g).close();
                break;
        }
    }

    public Cursor d(r20 r20Var) {
        return ((SQLiteDatabase) this.g).rawQueryWithFactory(new kk(r20Var), r20Var.a(), h, null);
    }

    public Cursor e(String str) {
        return d(new wo2(str, 4));
    }

    public int f(ByteBuffer byteBuffer) {
        ByteBuffer byteBuffer2 = (ByteBuffer) this.g;
        if (byteBuffer2.remaining() == 0 && byteBuffer.remaining() > 0) {
            return -1;
        }
        int iMin = Math.min(byteBuffer.remaining(), byteBuffer2.remaining());
        byte[] bArr = new byte[iMin];
        byteBuffer2.get(bArr);
        byteBuffer.put(bArr);
        return iMin;
    }

    public long g() {
        return ((ByteBuffer) this.g).position();
    }

    public /* synthetic */ lk(SQLiteClosable sQLiteClosable, int i) {
        this.f = i;
        this.g = sQLiteClosable;
    }

    private final void a() {
    }
}
