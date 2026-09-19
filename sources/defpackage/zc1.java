package defpackage;

import android.util.Base64;
import android.util.JsonWriter;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zc1 implements de2, t73 {
    public final /* synthetic */ byte[] f;

    public /* synthetic */ zc1(byte[] bArr) {
        this.f = bArr;
    }

    @Override // defpackage.de2
    /* JADX INFO: renamed from: a */
    public /* synthetic */ oe2 mo12a() {
        AtomicInteger atomicInteger = ed1.z;
        return new cc2(this.f);
    }

    @Override // defpackage.t73
    public void b(JsonWriter jsonWriter) throws IOException {
        Object obj = o83.b;
        jsonWriter.name("params").beginObject();
        byte[] bArr = this.f;
        int length = bArr.length;
        String strEncodeToString = Base64.encodeToString(bArr, 0);
        if (length < 10000) {
            jsonWriter.name("body").value(strEncodeToString);
        } else {
            String strD = f32.d(strEncodeToString, "MD5");
            if (strD != null) {
                jsonWriter.name("bodydigest").value(strD);
            }
        }
        jsonWriter.name("bodylength").value(length);
        jsonWriter.endObject();
    }
}
