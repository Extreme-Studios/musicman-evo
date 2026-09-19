package defpackage;

import android.os.Environment;
import android.os.SystemClock;
import android.util.Base64;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class cv0 {
    public final qk a;
    public final yw0 b;
    public final boolean c;

    public cv0(qk qkVar) {
        this.b = zw0.K();
        this.a = qkVar;
        this.c = ((Boolean) tu0.e.c.a(lx0.A5)).booleanValue();
    }

    public final synchronized void a(bv0 bv0Var) {
        if (this.c) {
            try {
                bv0Var.f(this.b);
            } catch (NullPointerException e) {
                vc3.C.h.d("AdMobClearcutLogger.modify", e);
            }
        }
    }

    public final synchronized void b(int i) {
        if (this.c) {
            if (((Boolean) tu0.e.c.a(lx0.B5)).booleanValue()) {
                d(i);
            } else {
                c(i);
            }
        }
    }

    public final synchronized void c(int i) {
        yw0 yw0Var = this.b;
        yw0Var.b();
        ((zw0) yw0Var.g).E();
        ArrayList arrayListH = zb3.H();
        yw0Var.b();
        ((zw0) yw0Var.g).D(arrayListH);
        byte[] bArrB = ((zw0) yw0Var.c()).b();
        qk qkVar = this.a;
        um0 um0Var = new um0();
        Objects.requireNonNull(qkVar);
        um0Var.h = qkVar;
        um0Var.g = bArrB;
        int i2 = i - 1;
        um0Var.f = i2;
        synchronized (um0Var) {
            ((ExecutorService) ((qk) um0Var.h).h).execute(new q7(25, um0Var));
        }
        jn.p("Logging Event with event code : ".concat(String.valueOf(Integer.toString(i2, 10))));
    }

    public final synchronized void d(int i) {
        File externalStorageDirectory = Environment.getExternalStorageDirectory();
        if (externalStorageDirectory == null) {
            return;
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(new File(externalStorageDirectory, "clearcut_events.txt").getPath()), true);
            try {
                fileOutputStream.write(e(i).getBytes());
            } catch (IOException unused) {
                jn.p("Could not write Clearcut to file.");
            } finally {
                try {
                    fileOutputStream.close();
                } catch (IOException unused2) {
                    jn.p("Could not close Clearcut output stream.");
                }
            }
        } catch (FileNotFoundException unused3) {
            jn.p("Could not find file for Clearcut");
        }
    }

    public final synchronized String e(int i) {
        StringBuilder sb;
        yw0 yw0Var = this.b;
        String strJ = ((zw0) yw0Var.g).J();
        vc3.C.k.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        String strEncodeToString = Base64.encodeToString(((zw0) yw0Var.c()).b(), 3);
        sb = new StringBuilder("id=");
        sb.append(strJ);
        sb.append(",timestamp=");
        sb.append(jElapsedRealtime);
        sb.append(",event=");
        sb.append(i - 1);
        sb.append(",data=");
        sb.append(strEncodeToString);
        sb.append("\n");
        return sb.toString();
    }

    public cv0() {
        this.b = zw0.K();
        this.c = false;
        this.a = new qk(4);
    }
}
