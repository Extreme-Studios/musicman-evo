package defpackage;

import android.util.Log;
import java.io.IOException;
import java.io.Writer;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class xp extends Writer {
    public final /* synthetic */ int f;
    public final StringBuilder g;
    public final CharSequence h;

    public xp() {
        this.f = 0;
        this.g = new StringBuilder(128);
        this.h = "FragmentManager";
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(CharSequence charSequence) {
        switch (this.f) {
            case 1:
                this.g.append(charSequence);
                return this;
            default:
                return super.append(charSequence);
        }
    }

    public void c() {
        StringBuilder sb = this.g;
        if (sb.length() > 0) {
            Log.d((String) this.h, sb.toString());
            sb.delete(0, sb.length());
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.f) {
            case 0:
                c();
                break;
        }
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
        switch (this.f) {
            case 0:
                c();
                break;
        }
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i, int i2) {
        int i3 = this.f;
        StringBuilder sb = this.g;
        switch (i3) {
            case 0:
                for (int i4 = 0; i4 < i2; i4++) {
                    char c = cArr[i + i4];
                    if (c == '\n') {
                        c();
                    } else {
                        sb.append(c);
                    }
                }
                break;
            default:
                y03 y03Var = (y03) this.h;
                y03Var.f = cArr;
                y03Var.g = null;
                sb.append((CharSequence) y03Var, i, i2 + i);
                break;
        }
    }

    @Override // java.io.Writer, java.lang.Appendable
    public /* bridge */ /* synthetic */ Appendable append(CharSequence charSequence) {
        switch (this.f) {
            case 1:
                append(charSequence);
                return this;
            default:
                return super.append(charSequence);
        }
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(CharSequence charSequence, int i, int i2) {
        switch (this.f) {
            case 1:
                this.g.append(charSequence, i, i2);
                return this;
            default:
                return super.append(charSequence, i, i2);
        }
    }

    @Override // java.io.Writer, java.lang.Appendable
    public /* bridge */ /* synthetic */ Appendable append(CharSequence charSequence, int i, int i2) {
        switch (this.f) {
            case 1:
                append(charSequence, i, i2);
                return this;
            default:
                return super.append(charSequence, i, i2);
        }
    }

    public xp(StringBuilder sb) {
        this.f = 1;
        this.h = new y03();
        this.g = sb;
    }

    private final void a() {
    }

    private final void b() {
    }

    @Override // java.io.Writer
    public void write(String str, int i, int i2) throws IOException {
        switch (this.f) {
            case 1:
                Objects.requireNonNull(str);
                this.g.append((CharSequence) str, i, i2 + i);
                break;
            default:
                super.write(str, i, i2);
                break;
        }
    }

    @Override // java.io.Writer
    public void write(int i) throws IOException {
        switch (this.f) {
            case 1:
                this.g.append((char) i);
                break;
            default:
                super.write(i);
                break;
        }
    }
}
