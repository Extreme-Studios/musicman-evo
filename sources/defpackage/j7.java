package defpackage;

import android.os.RemoteException;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j7 {
    public static /* synthetic */ void a() {
        throw new IllegalStateException();
    }

    public static /* synthetic */ void b(Object obj, Object obj2) {
        throw new h20("Fragment " + obj + obj2);
    }

    public static /* synthetic */ void c(Object obj, Object obj2, String str) {
        throw new IllegalStateException(str + obj + obj2);
    }

    public static /* synthetic */ void d(Object obj, String str) {
        throw new IllegalStateException(str + obj);
    }

    public static /* synthetic */ void e(String str) {
        throw new IllegalStateException(str);
    }

    public static /* synthetic */ void f(String str, int i, Object obj) {
        throw new IllegalArgumentException((str + i + obj).toString());
    }

    public static /* synthetic */ void g(String str, int i, Object obj, int i2) {
        throw new IndexOutOfBoundsException(str + i + obj + i2);
    }

    public static /* synthetic */ void h(String str, Throwable th) {
        throw new RuntimeException(str, th);
    }

    public static /* synthetic */ void i(Throwable th) {
        throw new na(th);
    }

    public static /* synthetic */ void j() {
        throw new ClassCastException();
    }

    public static /* synthetic */ void k(Object obj, String str) {
        throw new IllegalStateException((str + obj).toString());
    }

    public static /* synthetic */ void l(String str) {
        throw new NullPointerException(str);
    }

    public static /* synthetic */ void m(String str, int i, Object obj) {
        throw new IllegalArgumentException(str + i + obj);
    }

    public static /* synthetic */ void n() throws RemoteException {
        throw new RemoteException();
    }

    public static /* synthetic */ void o(Object obj, String str) {
        throw new IllegalStateException(str + obj);
    }

    public static /* synthetic */ void p(String str) {
        throw new IllegalArgumentException(str);
    }

    public static /* synthetic */ void q() throws n23 {
        throw new n23();
    }

    public static /* synthetic */ void r(String str) throws GeneralSecurityException {
        throw new GeneralSecurityException(str);
    }

    public static /* synthetic */ void s(String str) throws o23 {
        throw new o23(str);
    }
}
