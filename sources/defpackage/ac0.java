package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ac0 {
    public final zb0 a = new zb0();

    public final void a() {
        try {
            ((ac0) Class.forName("androidx.media3.effect.SingleInputVideoGraph$Factory").getConstructor(zb0.class).newInstance(this.a)).a();
        } catch (Exception e) {
            throw new IllegalStateException(e);
        }
    }
}
