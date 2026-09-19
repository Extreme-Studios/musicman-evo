package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.dynamite.DynamiteModule$DynamiteLoaderClassLoader;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes.dex */
public final class fg {
    public static Boolean c = null;
    public static String d = null;
    public static boolean e = false;
    public static int f = -1;
    public static Boolean g;
    public static ua3 k;
    public static nb3 l;
    public final Context a;
    public static final ThreadLocal h = new ThreadLocal();
    public static final bi i = new bi(2);
    public static final el1 j = new el1(19, 0);
    public static final fl1 b = new fl1(23);

    public fg(Context context) {
        this.a = context;
    }

    public static int a(Context context) {
        try {
            Class<?> clsLoadClass = context.getApplicationContext().getClassLoader().loadClass("com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor");
            Field declaredField = clsLoadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = clsLoadClass.getDeclaredField("MODULE_VERSION");
            if (s90.d(declaredField.get(null), ModuleDescriptor.MODULE_ID)) {
                return declaredField2.getInt(null);
            }
            Log.e("DynamiteModule", "Module descriptor id '" + String.valueOf(declaredField.get(null)) + "' didn't match expected id 'com.google.android.gms.ads.dynamite'");
            return 0;
        } catch (ClassNotFoundException unused) {
            Log.w("DynamiteModule", "Local module descriptor class for com.google.android.gms.ads.dynamite not found.");
            return 0;
        } catch (Exception e2) {
            Log.e("DynamiteModule", "Failed to load module descriptor class: ".concat(String.valueOf(e2.getMessage())));
            return 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:116:0x0245  */
    /* JADX WARN: Code duplicated, block: B:117:0x024b  */
    /* JADX WARN: Code duplicated, block: B:120:0x0254  */
    /* JADX WARN: Code duplicated, block: B:125:0x0265 A[Catch: all -> 0x0073, TryCatch #2 {all -> 0x0073, blocks: (B:7:0x004b, B:11:0x006d, B:18:0x0079, B:21:0x007f, B:24:0x0095, B:102:0x01ec, B:103:0x01f6, B:106:0x01f9, B:107:0x01fa, B:108:0x0201, B:125:0x0265, B:126:0x0276, B:109:0x0202, B:111:0x0220, B:113:0x022f, B:123:0x025d, B:124:0x0264, B:127:0x0277, B:128:0x029b), top: B:143:0x004b, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:142:0x009a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:144:0x0095 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:147:0x00c0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:21:0x007f A[Catch: all -> 0x0073, TRY_LEAVE, TryCatch #2 {all -> 0x0073, blocks: (B:7:0x004b, B:11:0x006d, B:18:0x0079, B:21:0x007f, B:24:0x0095, B:102:0x01ec, B:103:0x01f6, B:106:0x01f9, B:107:0x01fa, B:108:0x0201, B:125:0x0265, B:126:0x0276, B:109:0x0202, B:111:0x0220, B:113:0x022f, B:123:0x025d, B:124:0x0264, B:127:0x0277, B:128:0x029b), top: B:143:0x004b, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:23:0x0093 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:29:0x00a0 A[Catch: all -> 0x01e0, TryCatch #0 {, blocks: (B:27:0x009a, B:29:0x00a0, B:30:0x00a2, B:98:0x01e2, B:99:0x01e9), top: B:142:0x009a, outer: #8 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x00a5 A[Catch: all -> 0x00ff, cg -> 0x0102, RemoteException -> 0x0105, TRY_ENTER, TryCatch #8 {RemoteException -> 0x0105, cg -> 0x0102, all -> 0x00ff, blocks: (B:26:0x0099, B:32:0x00a5, B:34:0x00ac, B:35:0x00bf, B:39:0x00c5, B:41:0x00cd, B:43:0x00d1, B:44:0x00df, B:51:0x00e9, B:59:0x011d, B:61:0x0125, B:63:0x012d, B:64:0x0134, B:58:0x0108, B:67:0x0137, B:68:0x0138, B:69:0x013f, B:70:0x0140, B:71:0x0147, B:74:0x014a, B:75:0x014b, B:77:0x0162, B:79:0x0175, B:81:0x017d, B:87:0x01b9, B:89:0x01bf, B:90:0x01c8, B:91:0x01cf, B:82:0x018e, B:83:0x0195, B:85:0x0198, B:86:0x01a9, B:92:0x01d0, B:93:0x01d7, B:94:0x01d8, B:95:0x01df, B:101:0x01eb, B:27:0x009a, B:29:0x00a0, B:30:0x00a2, B:98:0x01e2, B:99:0x01e9, B:45:0x00e0, B:49:0x00e6, B:36:0x00c0, B:37:0x00c2), top: B:151:0x0099, inners: #0, #4, #5 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x00ac A[Catch: all -> 0x00ff, cg -> 0x0102, RemoteException -> 0x0105, TryCatch #8 {RemoteException -> 0x0105, cg -> 0x0102, all -> 0x00ff, blocks: (B:26:0x0099, B:32:0x00a5, B:34:0x00ac, B:35:0x00bf, B:39:0x00c5, B:41:0x00cd, B:43:0x00d1, B:44:0x00df, B:51:0x00e9, B:59:0x011d, B:61:0x0125, B:63:0x012d, B:64:0x0134, B:58:0x0108, B:67:0x0137, B:68:0x0138, B:69:0x013f, B:70:0x0140, B:71:0x0147, B:74:0x014a, B:75:0x014b, B:77:0x0162, B:79:0x0175, B:81:0x017d, B:87:0x01b9, B:89:0x01bf, B:90:0x01c8, B:91:0x01cf, B:82:0x018e, B:83:0x0195, B:85:0x0198, B:86:0x01a9, B:92:0x01d0, B:93:0x01d7, B:94:0x01d8, B:95:0x01df, B:101:0x01eb, B:27:0x009a, B:29:0x00a0, B:30:0x00a2, B:98:0x01e2, B:99:0x01e9, B:45:0x00e0, B:49:0x00e6, B:36:0x00c0, B:37:0x00c2), top: B:151:0x0099, inners: #0, #4, #5 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x00c5 A[Catch: all -> 0x00ff, cg -> 0x0102, RemoteException -> 0x0105, TRY_ENTER, TryCatch #8 {RemoteException -> 0x0105, cg -> 0x0102, all -> 0x00ff, blocks: (B:26:0x0099, B:32:0x00a5, B:34:0x00ac, B:35:0x00bf, B:39:0x00c5, B:41:0x00cd, B:43:0x00d1, B:44:0x00df, B:51:0x00e9, B:59:0x011d, B:61:0x0125, B:63:0x012d, B:64:0x0134, B:58:0x0108, B:67:0x0137, B:68:0x0138, B:69:0x013f, B:70:0x0140, B:71:0x0147, B:74:0x014a, B:75:0x014b, B:77:0x0162, B:79:0x0175, B:81:0x017d, B:87:0x01b9, B:89:0x01bf, B:90:0x01c8, B:91:0x01cf, B:82:0x018e, B:83:0x0195, B:85:0x0198, B:86:0x01a9, B:92:0x01d0, B:93:0x01d7, B:94:0x01d8, B:95:0x01df, B:101:0x01eb, B:27:0x009a, B:29:0x00a0, B:30:0x00a2, B:98:0x01e2, B:99:0x01e9, B:45:0x00e0, B:49:0x00e6, B:36:0x00c0, B:37:0x00c2), top: B:151:0x0099, inners: #0, #4, #5 }] */
    /* JADX WARN: Code duplicated, block: B:70:0x0140 A[Catch: all -> 0x00ff, cg -> 0x0102, RemoteException -> 0x0105, TryCatch #8 {RemoteException -> 0x0105, cg -> 0x0102, all -> 0x00ff, blocks: (B:26:0x0099, B:32:0x00a5, B:34:0x00ac, B:35:0x00bf, B:39:0x00c5, B:41:0x00cd, B:43:0x00d1, B:44:0x00df, B:51:0x00e9, B:59:0x011d, B:61:0x0125, B:63:0x012d, B:64:0x0134, B:58:0x0108, B:67:0x0137, B:68:0x0138, B:69:0x013f, B:70:0x0140, B:71:0x0147, B:74:0x014a, B:75:0x014b, B:77:0x0162, B:79:0x0175, B:81:0x017d, B:87:0x01b9, B:89:0x01bf, B:90:0x01c8, B:91:0x01cf, B:82:0x018e, B:83:0x0195, B:85:0x0198, B:86:0x01a9, B:92:0x01d0, B:93:0x01d7, B:94:0x01d8, B:95:0x01df, B:101:0x01eb, B:27:0x009a, B:29:0x00a0, B:30:0x00a2, B:98:0x01e2, B:99:0x01e9, B:45:0x00e0, B:49:0x00e6, B:36:0x00c0, B:37:0x00c2), top: B:151:0x0099, inners: #0, #4, #5 }] */
    /* JADX WARN: Code duplicated, block: B:75:0x014b A[Catch: all -> 0x00ff, cg -> 0x0102, RemoteException -> 0x0105, TryCatch #8 {RemoteException -> 0x0105, cg -> 0x0102, all -> 0x00ff, blocks: (B:26:0x0099, B:32:0x00a5, B:34:0x00ac, B:35:0x00bf, B:39:0x00c5, B:41:0x00cd, B:43:0x00d1, B:44:0x00df, B:51:0x00e9, B:59:0x011d, B:61:0x0125, B:63:0x012d, B:64:0x0134, B:58:0x0108, B:67:0x0137, B:68:0x0138, B:69:0x013f, B:70:0x0140, B:71:0x0147, B:74:0x014a, B:75:0x014b, B:77:0x0162, B:79:0x0175, B:81:0x017d, B:87:0x01b9, B:89:0x01bf, B:90:0x01c8, B:91:0x01cf, B:82:0x018e, B:83:0x0195, B:85:0x0198, B:86:0x01a9, B:92:0x01d0, B:93:0x01d7, B:94:0x01d8, B:95:0x01df, B:101:0x01eb, B:27:0x009a, B:29:0x00a0, B:30:0x00a2, B:98:0x01e2, B:99:0x01e9, B:45:0x00e0, B:49:0x00e6, B:36:0x00c0, B:37:0x00c2), top: B:151:0x0099, inners: #0, #4, #5 }] */
    /* JADX WARN: Code duplicated, block: B:77:0x0162 A[Catch: all -> 0x00ff, cg -> 0x0102, RemoteException -> 0x0105, TryCatch #8 {RemoteException -> 0x0105, cg -> 0x0102, all -> 0x00ff, blocks: (B:26:0x0099, B:32:0x00a5, B:34:0x00ac, B:35:0x00bf, B:39:0x00c5, B:41:0x00cd, B:43:0x00d1, B:44:0x00df, B:51:0x00e9, B:59:0x011d, B:61:0x0125, B:63:0x012d, B:64:0x0134, B:58:0x0108, B:67:0x0137, B:68:0x0138, B:69:0x013f, B:70:0x0140, B:71:0x0147, B:74:0x014a, B:75:0x014b, B:77:0x0162, B:79:0x0175, B:81:0x017d, B:87:0x01b9, B:89:0x01bf, B:90:0x01c8, B:91:0x01cf, B:82:0x018e, B:83:0x0195, B:85:0x0198, B:86:0x01a9, B:92:0x01d0, B:93:0x01d7, B:94:0x01d8, B:95:0x01df, B:101:0x01eb, B:27:0x009a, B:29:0x00a0, B:30:0x00a2, B:98:0x01e2, B:99:0x01e9, B:45:0x00e0, B:49:0x00e6, B:36:0x00c0, B:37:0x00c2), top: B:151:0x0099, inners: #0, #4, #5 }] */
    /* JADX WARN: Code duplicated, block: B:79:0x0175 A[Catch: all -> 0x00ff, cg -> 0x0102, RemoteException -> 0x0105, TryCatch #8 {RemoteException -> 0x0105, cg -> 0x0102, all -> 0x00ff, blocks: (B:26:0x0099, B:32:0x00a5, B:34:0x00ac, B:35:0x00bf, B:39:0x00c5, B:41:0x00cd, B:43:0x00d1, B:44:0x00df, B:51:0x00e9, B:59:0x011d, B:61:0x0125, B:63:0x012d, B:64:0x0134, B:58:0x0108, B:67:0x0137, B:68:0x0138, B:69:0x013f, B:70:0x0140, B:71:0x0147, B:74:0x014a, B:75:0x014b, B:77:0x0162, B:79:0x0175, B:81:0x017d, B:87:0x01b9, B:89:0x01bf, B:90:0x01c8, B:91:0x01cf, B:82:0x018e, B:83:0x0195, B:85:0x0198, B:86:0x01a9, B:92:0x01d0, B:93:0x01d7, B:94:0x01d8, B:95:0x01df, B:101:0x01eb, B:27:0x009a, B:29:0x00a0, B:30:0x00a2, B:98:0x01e2, B:99:0x01e9, B:45:0x00e0, B:49:0x00e6, B:36:0x00c0, B:37:0x00c2), top: B:151:0x0099, inners: #0, #4, #5 }] */
    /* JADX WARN: Code duplicated, block: B:81:0x017d A[Catch: all -> 0x00ff, cg -> 0x0102, RemoteException -> 0x0105, TryCatch #8 {RemoteException -> 0x0105, cg -> 0x0102, all -> 0x00ff, blocks: (B:26:0x0099, B:32:0x00a5, B:34:0x00ac, B:35:0x00bf, B:39:0x00c5, B:41:0x00cd, B:43:0x00d1, B:44:0x00df, B:51:0x00e9, B:59:0x011d, B:61:0x0125, B:63:0x012d, B:64:0x0134, B:58:0x0108, B:67:0x0137, B:68:0x0138, B:69:0x013f, B:70:0x0140, B:71:0x0147, B:74:0x014a, B:75:0x014b, B:77:0x0162, B:79:0x0175, B:81:0x017d, B:87:0x01b9, B:89:0x01bf, B:90:0x01c8, B:91:0x01cf, B:82:0x018e, B:83:0x0195, B:85:0x0198, B:86:0x01a9, B:92:0x01d0, B:93:0x01d7, B:94:0x01d8, B:95:0x01df, B:101:0x01eb, B:27:0x009a, B:29:0x00a0, B:30:0x00a2, B:98:0x01e2, B:99:0x01e9, B:45:0x00e0, B:49:0x00e6, B:36:0x00c0, B:37:0x00c2), top: B:151:0x0099, inners: #0, #4, #5 }] */
    /* JADX WARN: Code duplicated, block: B:82:0x018e A[Catch: all -> 0x00ff, cg -> 0x0102, RemoteException -> 0x0105, TryCatch #8 {RemoteException -> 0x0105, cg -> 0x0102, all -> 0x00ff, blocks: (B:26:0x0099, B:32:0x00a5, B:34:0x00ac, B:35:0x00bf, B:39:0x00c5, B:41:0x00cd, B:43:0x00d1, B:44:0x00df, B:51:0x00e9, B:59:0x011d, B:61:0x0125, B:63:0x012d, B:64:0x0134, B:58:0x0108, B:67:0x0137, B:68:0x0138, B:69:0x013f, B:70:0x0140, B:71:0x0147, B:74:0x014a, B:75:0x014b, B:77:0x0162, B:79:0x0175, B:81:0x017d, B:87:0x01b9, B:89:0x01bf, B:90:0x01c8, B:91:0x01cf, B:82:0x018e, B:83:0x0195, B:85:0x0198, B:86:0x01a9, B:92:0x01d0, B:93:0x01d7, B:94:0x01d8, B:95:0x01df, B:101:0x01eb, B:27:0x009a, B:29:0x00a0, B:30:0x00a2, B:98:0x01e2, B:99:0x01e9, B:45:0x00e0, B:49:0x00e6, B:36:0x00c0, B:37:0x00c2), top: B:151:0x0099, inners: #0, #4, #5 }] */
    /* JADX WARN: Code duplicated, block: B:84:0x0196 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:85:0x0198 A[Catch: all -> 0x00ff, cg -> 0x0102, RemoteException -> 0x0105, TryCatch #8 {RemoteException -> 0x0105, cg -> 0x0102, all -> 0x00ff, blocks: (B:26:0x0099, B:32:0x00a5, B:34:0x00ac, B:35:0x00bf, B:39:0x00c5, B:41:0x00cd, B:43:0x00d1, B:44:0x00df, B:51:0x00e9, B:59:0x011d, B:61:0x0125, B:63:0x012d, B:64:0x0134, B:58:0x0108, B:67:0x0137, B:68:0x0138, B:69:0x013f, B:70:0x0140, B:71:0x0147, B:74:0x014a, B:75:0x014b, B:77:0x0162, B:79:0x0175, B:81:0x017d, B:87:0x01b9, B:89:0x01bf, B:90:0x01c8, B:91:0x01cf, B:82:0x018e, B:83:0x0195, B:85:0x0198, B:86:0x01a9, B:92:0x01d0, B:93:0x01d7, B:94:0x01d8, B:95:0x01df, B:101:0x01eb, B:27:0x009a, B:29:0x00a0, B:30:0x00a2, B:98:0x01e2, B:99:0x01e9, B:45:0x00e0, B:49:0x00e6, B:36:0x00c0, B:37:0x00c2), top: B:151:0x0099, inners: #0, #4, #5 }] */
    /* JADX WARN: Code duplicated, block: B:86:0x01a9 A[Catch: all -> 0x00ff, cg -> 0x0102, RemoteException -> 0x0105, TryCatch #8 {RemoteException -> 0x0105, cg -> 0x0102, all -> 0x00ff, blocks: (B:26:0x0099, B:32:0x00a5, B:34:0x00ac, B:35:0x00bf, B:39:0x00c5, B:41:0x00cd, B:43:0x00d1, B:44:0x00df, B:51:0x00e9, B:59:0x011d, B:61:0x0125, B:63:0x012d, B:64:0x0134, B:58:0x0108, B:67:0x0137, B:68:0x0138, B:69:0x013f, B:70:0x0140, B:71:0x0147, B:74:0x014a, B:75:0x014b, B:77:0x0162, B:79:0x0175, B:81:0x017d, B:87:0x01b9, B:89:0x01bf, B:90:0x01c8, B:91:0x01cf, B:82:0x018e, B:83:0x0195, B:85:0x0198, B:86:0x01a9, B:92:0x01d0, B:93:0x01d7, B:94:0x01d8, B:95:0x01df, B:101:0x01eb, B:27:0x009a, B:29:0x00a0, B:30:0x00a2, B:98:0x01e2, B:99:0x01e9, B:45:0x00e0, B:49:0x00e6, B:36:0x00c0, B:37:0x00c2), top: B:151:0x0099, inners: #0, #4, #5 }] */
    /* JADX WARN: Code duplicated, block: B:89:0x01bf A[Catch: all -> 0x00ff, cg -> 0x0102, RemoteException -> 0x0105, TryCatch #8 {RemoteException -> 0x0105, cg -> 0x0102, all -> 0x00ff, blocks: (B:26:0x0099, B:32:0x00a5, B:34:0x00ac, B:35:0x00bf, B:39:0x00c5, B:41:0x00cd, B:43:0x00d1, B:44:0x00df, B:51:0x00e9, B:59:0x011d, B:61:0x0125, B:63:0x012d, B:64:0x0134, B:58:0x0108, B:67:0x0137, B:68:0x0138, B:69:0x013f, B:70:0x0140, B:71:0x0147, B:74:0x014a, B:75:0x014b, B:77:0x0162, B:79:0x0175, B:81:0x017d, B:87:0x01b9, B:89:0x01bf, B:90:0x01c8, B:91:0x01cf, B:82:0x018e, B:83:0x0195, B:85:0x0198, B:86:0x01a9, B:92:0x01d0, B:93:0x01d7, B:94:0x01d8, B:95:0x01df, B:101:0x01eb, B:27:0x009a, B:29:0x00a0, B:30:0x00a2, B:98:0x01e2, B:99:0x01e9, B:45:0x00e0, B:49:0x00e6, B:36:0x00c0, B:37:0x00c2), top: B:151:0x0099, inners: #0, #4, #5 }] */
    /* JADX WARN: Code duplicated, block: B:90:0x01c8 A[Catch: all -> 0x00ff, cg -> 0x0102, RemoteException -> 0x0105, TryCatch #8 {RemoteException -> 0x0105, cg -> 0x0102, all -> 0x00ff, blocks: (B:26:0x0099, B:32:0x00a5, B:34:0x00ac, B:35:0x00bf, B:39:0x00c5, B:41:0x00cd, B:43:0x00d1, B:44:0x00df, B:51:0x00e9, B:59:0x011d, B:61:0x0125, B:63:0x012d, B:64:0x0134, B:58:0x0108, B:67:0x0137, B:68:0x0138, B:69:0x013f, B:70:0x0140, B:71:0x0147, B:74:0x014a, B:75:0x014b, B:77:0x0162, B:79:0x0175, B:81:0x017d, B:87:0x01b9, B:89:0x01bf, B:90:0x01c8, B:91:0x01cf, B:82:0x018e, B:83:0x0195, B:85:0x0198, B:86:0x01a9, B:92:0x01d0, B:93:0x01d7, B:94:0x01d8, B:95:0x01df, B:101:0x01eb, B:27:0x009a, B:29:0x00a0, B:30:0x00a2, B:98:0x01e2, B:99:0x01e9, B:45:0x00e0, B:49:0x00e6, B:36:0x00c0, B:37:0x00c2), top: B:151:0x0099, inners: #0, #4, #5 }] */
    /* JADX WARN: Code duplicated, block: B:92:0x01d0 A[Catch: all -> 0x00ff, cg -> 0x0102, RemoteException -> 0x0105, TryCatch #8 {RemoteException -> 0x0105, cg -> 0x0102, all -> 0x00ff, blocks: (B:26:0x0099, B:32:0x00a5, B:34:0x00ac, B:35:0x00bf, B:39:0x00c5, B:41:0x00cd, B:43:0x00d1, B:44:0x00df, B:51:0x00e9, B:59:0x011d, B:61:0x0125, B:63:0x012d, B:64:0x0134, B:58:0x0108, B:67:0x0137, B:68:0x0138, B:69:0x013f, B:70:0x0140, B:71:0x0147, B:74:0x014a, B:75:0x014b, B:77:0x0162, B:79:0x0175, B:81:0x017d, B:87:0x01b9, B:89:0x01bf, B:90:0x01c8, B:91:0x01cf, B:82:0x018e, B:83:0x0195, B:85:0x0198, B:86:0x01a9, B:92:0x01d0, B:93:0x01d7, B:94:0x01d8, B:95:0x01df, B:101:0x01eb, B:27:0x009a, B:29:0x00a0, B:30:0x00a2, B:98:0x01e2, B:99:0x01e9, B:45:0x00e0, B:49:0x00e6, B:36:0x00c0, B:37:0x00c2), top: B:151:0x0099, inners: #0, #4, #5 }] */
    /* JADX WARN: Code duplicated, block: B:94:0x01d8 A[Catch: all -> 0x00ff, cg -> 0x0102, RemoteException -> 0x0105, TryCatch #8 {RemoteException -> 0x0105, cg -> 0x0102, all -> 0x00ff, blocks: (B:26:0x0099, B:32:0x00a5, B:34:0x00ac, B:35:0x00bf, B:39:0x00c5, B:41:0x00cd, B:43:0x00d1, B:44:0x00df, B:51:0x00e9, B:59:0x011d, B:61:0x0125, B:63:0x012d, B:64:0x0134, B:58:0x0108, B:67:0x0137, B:68:0x0138, B:69:0x013f, B:70:0x0140, B:71:0x0147, B:74:0x014a, B:75:0x014b, B:77:0x0162, B:79:0x0175, B:81:0x017d, B:87:0x01b9, B:89:0x01bf, B:90:0x01c8, B:91:0x01cf, B:82:0x018e, B:83:0x0195, B:85:0x0198, B:86:0x01a9, B:92:0x01d0, B:93:0x01d7, B:94:0x01d8, B:95:0x01df, B:101:0x01eb, B:27:0x009a, B:29:0x00a0, B:30:0x00a2, B:98:0x01e2, B:99:0x01e9, B:45:0x00e0, B:49:0x00e6, B:36:0x00c0, B:37:0x00c2), top: B:151:0x0099, inners: #0, #4, #5 }] */
    /* JADX WARN: Code duplicated, block: B:98:0x01e2 A[Catch: all -> 0x01e0, TRY_ENTER, TryCatch #0 {, blocks: (B:27:0x009a, B:29:0x00a0, B:30:0x00a2, B:98:0x01e2, B:99:0x01e9), top: B:142:0x009a, outer: #8 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:125:0x0265, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:34:0x00ac, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:75:0x014b, please report this as an issue */
    public static fg c(Context context, fl1 fl1Var) throws Throwable {
        long j2;
        fg fgVar;
        int i2;
        Boolean bool;
        ua3 ua3VarH;
        int i3;
        rm rmVarZ0;
        Object objZ0;
        fg fgVar2;
        v93 v93Var;
        nb3 nb3Var;
        v93 v93Var2;
        rm rmVarZ1;
        Cursor cursor;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            throw new cg("null application Context");
        }
        ThreadLocal threadLocal = h;
        v93 v93Var3 = (v93) threadLocal.get();
        v93 v93Var4 = new v93();
        threadLocal.set(v93Var4);
        bi biVar = i;
        Long l2 = (Long) biVar.get();
        long jLongValue = l2.longValue();
        try {
            biVar.set(Long.valueOf(SystemClock.elapsedRealtime()));
            eg egVarD = fl1Var.d(context, j);
            j2 = jLongValue;
            try {
                Log.i("DynamiteModule", "Considering local module com.google.android.gms.ads.dynamite:" + egVarD.a + " and remote module com.google.android.gms.ads.dynamite:" + egVarD.b);
                int i4 = egVarD.c;
                if (i4 != 0) {
                    if (i4 != -1) {
                        boolean z = true;
                        if (i4 == 1 || egVarD.b != 0) {
                            if (i4 == -1) {
                                Log.i("DynamiteModule", "Selected local version of ".concat(ModuleDescriptor.MODULE_ID));
                                fgVar = new fg(applicationContext);
                            } else {
                                if (i4 == 1) {
                                    throw new cg("VersionPolicy returned invalid code:" + i4);
                                }
                                try {
                                    i2 = egVarD.b;
                                    try {
                                        synchronized (fg.class) {
                                            if (g(context)) {
                                                throw new cg("Remote loading disabled");
                                            }
                                            bool = c;
                                        }
                                        if (bool != null) {
                                            throw new cg("Failed to determine which loading route to use.");
                                        }
                                        if (bool.booleanValue()) {
                                            Log.i("DynamiteModule", "Selected remote version of com.google.android.gms.ads.dynamite, version >= " + i2);
                                            synchronized (fg.class) {
                                                nb3Var = l;
                                            }
                                            if (nb3Var != null) {
                                                throw new cg("DynamiteLoaderV2 was not cached.");
                                            }
                                            v93Var2 = (v93) threadLocal.get();
                                            if (v93Var2 != null || v93Var2.a == null) {
                                                throw new cg("No result cursor");
                                            }
                                            Context applicationContext2 = context.getApplicationContext();
                                            Cursor cursor2 = v93Var2.a;
                                            new ju(null);
                                            synchronized (fg.class) {
                                                if (f < 2) {
                                                    z = false;
                                                }
                                            }
                                            if (z) {
                                                Log.v("DynamiteModule", "Dynamite loader version >= 2, using loadModule2NoCrashUtils");
                                                rmVarZ1 = nb3Var.C1(new ju(applicationContext2), i2, new ju(cursor2));
                                            } else {
                                                Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to loadModule2");
                                                rmVarZ1 = nb3Var.Z0(new ju(applicationContext2), i2, new ju(cursor2));
                                            }
                                            Context context2 = (Context) ju.Z0(rmVarZ1);
                                            if (context2 == null) {
                                                throw new cg("Failed to get module context");
                                            }
                                            fgVar2 = new fg(context2);
                                        } else {
                                            Log.i("DynamiteModule", "Selected remote version of com.google.android.gms.ads.dynamite, version >= " + i2);
                                            ua3VarH = h(context);
                                            if (ua3VarH != null) {
                                                throw new cg("Failed to create IDynamiteLoader.");
                                            }
                                            Parcel parcelT = ua3VarH.T(ua3VarH.U(), 6);
                                            i3 = parcelT.readInt();
                                            parcelT.recycle();
                                            if (i3 >= 3) {
                                                v93Var = (v93) threadLocal.get();
                                                if (v93Var != null) {
                                                    throw new cg("No cached result cursor holder");
                                                }
                                                rmVarZ0 = ua3VarH.C1(new ju(context), i2, new ju(v93Var.a));
                                            } else if (i3 == 2) {
                                                Log.w("DynamiteModule", "IDynamite loader version = 2");
                                                rmVarZ0 = ua3VarH.F1(new ju(context), i2);
                                            } else {
                                                Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
                                                rmVarZ0 = ua3VarH.Z0(new ju(context), i2);
                                            }
                                            objZ0 = ju.Z0(rmVarZ0);
                                            if (objZ0 != null) {
                                                throw new cg("Failed to load remote module.");
                                            }
                                            fgVar2 = new fg((Context) objZ0);
                                        }
                                        fgVar = fgVar2;
                                    } catch (RemoteException e2) {
                                        throw new cg("Failed to load remote module.", e2);
                                    } catch (cg e3) {
                                        throw e3;
                                    } catch (Throwable th) {
                                        na1.c(context, th);
                                        throw new cg("Failed to load remote module.", th);
                                    }
                                } catch (cg e4) {
                                    Log.w("DynamiteModule", "Failed to load remote module: " + e4.getMessage());
                                    int i5 = egVarD.a;
                                    if (i5 == 0 || fl1Var.d(context, new yp(i5, 9)).c != -1) {
                                        throw new cg("Remote load failed. No local fallback found.", e4);
                                    }
                                    Log.i("DynamiteModule", "Selected local version of ".concat(ModuleDescriptor.MODULE_ID));
                                    fgVar = new fg(applicationContext);
                                }
                            }
                            if (j2 == 0) {
                                i.remove();
                            } else {
                                i.set(l2);
                            }
                            cursor = v93Var4.a;
                            if (cursor != null) {
                                cursor.close();
                            }
                            h.set(v93Var3);
                            return fgVar;
                        }
                    } else if (egVarD.a != 0) {
                        i4 = -1;
                        boolean z2 = true;
                        if (i4 == 1) {
                        }
                        if (i4 == -1) {
                            Log.i("DynamiteModule", "Selected local version of ".concat(ModuleDescriptor.MODULE_ID));
                            fgVar = new fg(applicationContext);
                        } else {
                            if (i4 == 1) {
                                throw new cg("VersionPolicy returned invalid code:" + i4);
                            }
                            i2 = egVarD.b;
                            synchronized (fg.class) {
                                if (g(context)) {
                                    throw new cg("Remote loading disabled");
                                }
                                bool = c;
                                if (bool != null) {
                                    throw new cg("Failed to determine which loading route to use.");
                                }
                                if (bool.booleanValue()) {
                                    Log.i("DynamiteModule", "Selected remote version of com.google.android.gms.ads.dynamite, version >= " + i2);
                                    synchronized (fg.class) {
                                        nb3Var = l;
                                        if (nb3Var != null) {
                                            throw new cg("DynamiteLoaderV2 was not cached.");
                                        }
                                        v93Var2 = (v93) threadLocal.get();
                                        if (v93Var2 != null) {
                                        }
                                        throw new cg("No result cursor");
                                    }
                                }
                                Log.i("DynamiteModule", "Selected remote version of com.google.android.gms.ads.dynamite, version >= " + i2);
                                ua3VarH = h(context);
                                if (ua3VarH != null) {
                                    throw new cg("Failed to create IDynamiteLoader.");
                                }
                                Parcel parcelT2 = ua3VarH.T(ua3VarH.U(), 6);
                                i3 = parcelT2.readInt();
                                parcelT2.recycle();
                                if (i3 >= 3) {
                                    v93Var = (v93) threadLocal.get();
                                    if (v93Var != null) {
                                        throw new cg("No cached result cursor holder");
                                    }
                                    rmVarZ0 = ua3VarH.C1(new ju(context), i2, new ju(v93Var.a));
                                } else if (i3 == 2) {
                                    Log.w("DynamiteModule", "IDynamite loader version = 2");
                                    rmVarZ0 = ua3VarH.F1(new ju(context), i2);
                                } else {
                                    Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
                                    rmVarZ0 = ua3VarH.Z0(new ju(context), i2);
                                }
                                objZ0 = ju.Z0(rmVarZ0);
                                if (objZ0 != null) {
                                    throw new cg("Failed to load remote module.");
                                }
                                fgVar2 = new fg((Context) objZ0);
                                fgVar = fgVar2;
                            }
                        }
                        if (j2 == 0) {
                            i.remove();
                        } else {
                            i.set(l2);
                        }
                        cursor = v93Var4.a;
                        if (cursor != null) {
                            cursor.close();
                        }
                        h.set(v93Var3);
                        return fgVar;
                    }
                }
                throw new cg("No acceptable module com.google.android.gms.ads.dynamite found. Local version is " + egVarD.a + " and remote version is " + egVarD.b + ".");
            } catch (Throwable th2) {
                th = th2;
                if (j2 == 0) {
                    i.remove();
                } else {
                    i.set(l2);
                }
                Cursor cursor3 = v93Var4.a;
                if (cursor3 != null) {
                    cursor3.close();
                }
                h.set(v93Var3);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            j2 = jLongValue;
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x017b  */
    /* JADX WARN: Code duplicated, block: B:51:0x00b1 A[Catch: all -> 0x0039, TryCatch #10 {all -> 0x0039, blocks: (B:10:0x0029, B:12:0x0035, B:52:0x00ba, B:17:0x003e, B:19:0x0045, B:21:0x004b, B:26:0x0051, B:28:0x0055, B:31:0x005e, B:33:0x0066, B:36:0x006d, B:43:0x0099, B:44:0x00a1, B:39:0x0074, B:41:0x007a, B:42:0x008b, B:47:0x00a4, B:50:0x00a7, B:51:0x00b1, B:18:0x0041), top: B:144:0x0029, inners: #1 }] */
    public static int d(Context context, boolean z) {
        Throwable th;
        RemoteException e2;
        int i2;
        Cursor cursor;
        try {
            synchronized (fg.class) {
                Boolean bool = c;
                boolean z2 = true;
                Cursor cursor2 = null;
                if (bool == null) {
                    try {
                        Field declaredField = context.getApplicationContext().getClassLoader().loadClass(DynamiteModule$DynamiteLoaderClassLoader.class.getName()).getDeclaredField("sClassLoader");
                        synchronized (declaredField.getDeclaringClass()) {
                            try {
                                ClassLoader classLoader = (ClassLoader) declaredField.get(null);
                                if (classLoader == ClassLoader.getSystemClassLoader()) {
                                    bool = Boolean.FALSE;
                                } else if (classLoader != null) {
                                    try {
                                        f(classLoader);
                                    } catch (cg unused) {
                                    }
                                    bool = Boolean.TRUE;
                                } else {
                                    if (!g(context)) {
                                        return 0;
                                    }
                                    if (e) {
                                        declaredField.set(null, ClassLoader.getSystemClassLoader());
                                        bool = Boolean.FALSE;
                                    } else {
                                        Boolean bool2 = Boolean.TRUE;
                                        if (bool2.equals(null)) {
                                            declaredField.set(null, ClassLoader.getSystemClassLoader());
                                            bool = Boolean.FALSE;
                                        } else {
                                            try {
                                                int iE = e(context, z, true);
                                                String str = d;
                                                if (str != null && !str.isEmpty()) {
                                                    ClassLoader classLoaderM = rs0.m();
                                                    if (classLoaderM == null) {
                                                        if (Build.VERSION.SDK_INT >= 29) {
                                                            bg.b();
                                                            String str2 = d;
                                                            dq.f(str2);
                                                            classLoaderM = bg.a(ClassLoader.getSystemClassLoader(), str2);
                                                        } else {
                                                            String str3 = d;
                                                            dq.f(str3);
                                                            classLoaderM = new k91(str3, ClassLoader.getSystemClassLoader());
                                                        }
                                                    }
                                                    f(classLoaderM);
                                                    declaredField.set(null, classLoaderM);
                                                    c = bool2;
                                                    return iE;
                                                }
                                                return iE;
                                            } catch (cg unused2) {
                                                declaredField.set(null, ClassLoader.getSystemClassLoader());
                                                bool = Boolean.FALSE;
                                            }
                                        }
                                    }
                                }
                                c = bool;
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                    } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException e3) {
                        Log.w("DynamiteModule", "Failed to load module via V2: " + e3.toString());
                        bool = Boolean.FALSE;
                    }
                }
                if (bool.booleanValue()) {
                    try {
                        return e(context, z, false);
                    } catch (cg e4) {
                        Log.w("DynamiteModule", "Failed to retrieve remote module version: " + e4.getMessage());
                        return 0;
                    }
                }
                ua3 ua3VarH = h(context);
                try {
                    if (ua3VarH == null) {
                        return 0;
                    }
                    try {
                        Parcel parcelT = ua3VarH.T(ua3VarH.U(), 6);
                        int i3 = parcelT.readInt();
                        parcelT.recycle();
                        if (i3 < 3) {
                            if (i3 == 2) {
                                Log.w("DynamiteModule", "IDynamite loader version = 2, no high precision latency measurement.");
                                ju juVar = new ju(context);
                                Parcel parcelU = ua3VarH.U();
                                o91.c(parcelU, juVar);
                                parcelU.writeString(ModuleDescriptor.MODULE_ID);
                                parcelU.writeInt(z ? 1 : 0);
                                Parcel parcelT2 = ua3VarH.T(parcelU, 5);
                                i2 = parcelT2.readInt();
                                parcelT2.recycle();
                            } else {
                                Log.w("DynamiteModule", "IDynamite loader version < 2, falling back to getModuleVersion2");
                                ju juVar2 = new ju(context);
                                Parcel parcelU2 = ua3VarH.U();
                                o91.c(parcelU2, juVar2);
                                parcelU2.writeString(ModuleDescriptor.MODULE_ID);
                                parcelU2.writeInt(z ? 1 : 0);
                                Parcel parcelT3 = ua3VarH.T(parcelU2, 3);
                                i2 = parcelT3.readInt();
                                parcelT3.recycle();
                            }
                            return i2;
                        }
                        ThreadLocal threadLocal = h;
                        v93 v93Var = (v93) threadLocal.get();
                        if (v93Var != null && (cursor = v93Var.a) != null) {
                            return cursor.getInt(0);
                        }
                        Cursor cursor3 = (Cursor) ju.Z0(ua3VarH.H1(new ju(context), z, ((Long) i.get()).longValue()));
                        if (cursor3 != null) {
                            try {
                                if (cursor3.moveToFirst()) {
                                    int i4 = cursor3.getInt(0);
                                    if (i4 > 0) {
                                        v93 v93Var2 = (v93) threadLocal.get();
                                        if (v93Var2 == null || v93Var2.a != null) {
                                            z2 = false;
                                        } else {
                                            v93Var2.a = cursor3;
                                        }
                                        cursor2 = z2 ? null : cursor3;
                                    }
                                    if (cursor2 != null) {
                                        cursor2.close();
                                    }
                                    return i4;
                                }
                            } catch (RemoteException e5) {
                                e2 = e5;
                                cursor2 = cursor3;
                                Log.w("DynamiteModule", "Failed to retrieve remote module version: " + e2.getMessage());
                                if (cursor2 == null) {
                                    return 0;
                                }
                                cursor2.close();
                                return 0;
                            } catch (Throwable th3) {
                                th = th3;
                                cursor2 = cursor3;
                                if (cursor2 != null) {
                                    cursor2.close();
                                }
                                throw th;
                            }
                        }
                        Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                        if (cursor3 == null) {
                            return 0;
                        }
                        cursor3.close();
                        return 0;
                    } catch (RemoteException e6) {
                        e2 = e6;
                    }
                } catch (Throwable th4) {
                    th = th4;
                }
            }
        } catch (Throwable th5) {
            na1.c(context, th5);
            throw th5;
        }
    }

    public static int e(Context context, boolean z, boolean z2) throws Throwable {
        Throwable th;
        Exception exc;
        boolean z3;
        Cursor cursor = null;
        try {
            try {
                boolean z4 = true;
                Cursor cursorQuery = context.getContentResolver().query(new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").path(true != z ? "api" : "api_force_staging").appendPath(ModuleDescriptor.MODULE_ID).appendQueryParameter("requestStartTime", String.valueOf(((Long) i.get()).longValue())).build(), null, null, null, null);
                if (cursorQuery != null) {
                    try {
                        if (cursorQuery.moveToFirst()) {
                            boolean z5 = false;
                            int i2 = cursorQuery.getInt(0);
                            if (i2 > 0) {
                                synchronized (fg.class) {
                                    try {
                                        d = cursorQuery.getString(2);
                                        int columnIndex = cursorQuery.getColumnIndex("loaderVersion");
                                        if (columnIndex >= 0) {
                                            f = cursorQuery.getInt(columnIndex);
                                        }
                                        int columnIndex2 = cursorQuery.getColumnIndex("disableStandaloneDynamiteLoader2");
                                        if (columnIndex2 >= 0) {
                                            z3 = cursorQuery.getInt(columnIndex2) != 0;
                                            e = z3;
                                        } else {
                                            z3 = false;
                                        }
                                    } catch (Throwable th2) {
                                        throw th2;
                                    }
                                }
                                v93 v93Var = (v93) h.get();
                                if (v93Var == null || v93Var.a != null) {
                                    z4 = false;
                                } else {
                                    v93Var.a = cursorQuery;
                                }
                                cursor = z4 ? null : cursorQuery;
                                z5 = z3;
                            } else {
                                cursor = cursorQuery;
                            }
                            if (z2 && z5) {
                                throw new cg("forcing fallback to container DynamiteLoader impl");
                            }
                            if (cursor != null) {
                                cursor.close();
                            }
                            return i2;
                            if (exc instanceof cg) {
                                throw exc;
                            }
                            throw new cg("V2 version check failed: " + exc.getMessage(), exc);
                        }
                    } catch (Exception e2) {
                        exc = e2;
                    } catch (Throwable th3) {
                        cursor = cursorQuery;
                        th = th3;
                        if (cursor == null) {
                            throw th;
                        }
                        cursor.close();
                        throw th;
                    }
                }
                Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                throw new cg("Failed to connect to dynamite module ContentResolver.");
            } catch (Exception e3) {
                exc = e3;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    public static void f(ClassLoader classLoader) throws cg {
        try {
            nb3 nb3Var = null;
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(null).newInstance(null);
            if (iBinder != null) {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                nb3Var = iInterfaceQueryLocalInterface instanceof nb3 ? (nb3) iInterfaceQueryLocalInterface : new nb3(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2", 1);
            }
            l = nb3Var;
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e2) {
            throw new cg("Failed to instantiate dynamite loader", e2);
        }
    }

    public static boolean g(Context context) {
        ApplicationInfo applicationInfo;
        Boolean bool = Boolean.TRUE;
        if (bool.equals(null) || bool.equals(g)) {
            return true;
        }
        boolean z = false;
        if (g == null) {
            ProviderInfo providerInfoResolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.chimera", 0);
            if (am.b.c(context, 10000000) == 0 && providerInfoResolveContentProvider != null && "com.google.android.gms".equals(providerInfoResolveContentProvider.packageName)) {
                z = true;
            }
            g = Boolean.valueOf(z);
            if (z && (applicationInfo = providerInfoResolveContentProvider.applicationInfo) != null && (applicationInfo.flags & 129) == 0) {
                Log.i("DynamiteModule", "Non-system-image GmsCore APK, forcing V1");
                e = true;
            }
        }
        if (!z) {
            Log.e("DynamiteModule", "Invalid GmsCore APK, remote loading disabled.");
        }
        return z;
    }

    public static ua3 h(Context context) {
        ua3 ua3Var;
        synchronized (fg.class) {
            ua3 ua3Var2 = k;
            if (ua3Var2 != null) {
                return ua3Var2;
            }
            try {
                IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if (iBinder == null) {
                    ua3Var = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    ua3Var = iInterfaceQueryLocalInterface instanceof ua3 ? (ua3) iInterfaceQueryLocalInterface : new ua3(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader", 1);
                }
                if (ua3Var != null) {
                    k = ua3Var;
                    return ua3Var;
                }
            } catch (Exception e2) {
                Log.e("DynamiteModule", "Failed to load IDynamiteLoader from GmsCore: " + e2.getMessage());
            }
            return null;
        }
    }

    public final IBinder b(String str) {
        try {
            return (IBinder) this.a.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e2) {
            throw new cg("Failed to instantiate module class: ".concat(str), e2);
        }
    }
}
