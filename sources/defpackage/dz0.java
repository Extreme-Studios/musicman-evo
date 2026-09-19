package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class dz0 {
    public static final um0 c;
    public static final um0 d;
    public static final um0 f = new um0("gads:trapped_exception_sample_rate", 3, Double.valueOf(0.01d));
    public static final um0 a = um0.p("gads:dynamite_load:fail:sample_rate", 10000);
    public static final um0 b = um0.l("gads:report_dynamite_crash_in_background_thread", false);
    public static final um0 e = um0.l("gads:sdk_crash_report_full_stacktrace", false);

    static {
        int i = 4;
        c = new um0("gads:public_beta:traffic_multiplier", i, "1.0");
        d = new um0("gads:sdk_crash_report_class_prefix", i, "com.google.");
    }
}
