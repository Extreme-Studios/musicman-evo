package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class ar2 implements yn2 {
    public static final bi a = new bi(5);

    public static pq2 b(ip2 ip2Var) {
        byte[] bArr = pq2.d;
        if (pq2.b(ki2.d())) {
            return new pq2(((j03) ip2Var.K.g).b(), ip2Var.L.b());
        }
        j7.e("Cipher does not implement AES GCM SIV.");
        return null;
    }
}
