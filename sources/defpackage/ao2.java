package defpackage;

import android.util.JsonWriter;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class ao2 implements t73 {
    public static final ao2 h;
    public static final ao2 i;
    public static final ao2 j;
    public static final ao2 k;
    public static final ao2 l;
    public static final ao2 m;
    public static final ao2 n;
    public static final ao2 o;
    public static final ao2 p;
    public static final ao2 q;
    public static ao2 r;
    public final /* synthetic */ int f;
    public String g;

    static {
        int i2 = 0;
        h = new ao2("ENABLED", i2);
        i = new ao2("DISABLED", i2);
        j = new ao2("DESTROYED", i2);
        int i3 = 1;
        k = new ao2("TINK", i3);
        l = new ao2("CRUNCHY", i3);
        m = new ao2("NO_PREFIX", i3);
        int i4 = 2;
        n = new ao2("TINK", i4);
        o = new ao2("CRUNCHY", i4);
        p = new ao2("LEGACY", i4);
        q = new ao2("NO_PREFIX", i4);
    }

    public /* synthetic */ ao2(String str, int i2) {
        this.f = i2;
        this.g = str;
    }

    @Override // defpackage.t73
    public /* synthetic */ void b(JsonWriter jsonWriter) throws IOException {
        Object obj = o83.b;
        jsonWriter.name("params").beginObject();
        String str = this.g;
        if (str != null) {
            jsonWriter.name("error_description").value(str);
        }
        jsonWriter.endObject();
    }

    public String toString() {
        switch (this.f) {
            case 0:
                return this.g;
            case 1:
                return this.g;
            case 2:
                return this.g;
            default:
                return super.toString();
        }
    }
}
