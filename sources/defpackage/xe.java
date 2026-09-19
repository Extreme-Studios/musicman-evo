package defpackage;

import android.content.res.AssetManager;
import android.os.Build;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class xe {
    public final Executor a;
    public final aw b;
    public final byte[] c;
    public final File d;
    public final String e;
    public boolean f = false;
    public ye[] g;
    public byte[] h;

    public xe(AssetManager assetManager, Executor executor, aw awVar, String str, File file) {
        byte[] bArr;
        this.a = executor;
        this.b = awVar;
        this.e = str;
        this.d = file;
        int i = Build.VERSION.SDK_INT;
        if (i < 31) {
            switch (i) {
                case 24:
                case 25:
                    bArr = s90.f;
                    break;
                case 26:
                    bArr = s90.e;
                    break;
                case 27:
                    bArr = s90.d;
                    break;
                case 28:
                case 29:
                case 30:
                    bArr = s90.c;
                    break;
                default:
                    bArr = null;
                    break;
            }
        } else {
            bArr = s90.b;
        }
        this.c = bArr;
    }

    public final FileInputStream a(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e) {
            String message = e.getMessage();
            if (message == null || !message.contains("compressed")) {
                return null;
            }
            this.b.l();
            return null;
        }
    }

    public final void b(final int i, final Serializable serializable) {
        this.a.execute(new Runnable() { // from class: we
            @Override // java.lang.Runnable
            public final void run() {
                this.f.b.n(i, serializable);
            }
        });
    }
}
