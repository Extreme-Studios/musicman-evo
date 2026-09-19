package defpackage;

import java.io.File;
import java.util.concurrent.ExecutorService;
import java.util.function.Function;

/* JADX INFO: loaded from: classes.dex */
public final class ld2 {
    public final ExecutorService a;

    public ld2(ExecutorService executorService) {
        this.a = executorService;
    }

    public final kd2 a(File file, byte[] bArr, Function function) {
        return new kd2(file, this.a, new s62(bArr), function);
    }
}
