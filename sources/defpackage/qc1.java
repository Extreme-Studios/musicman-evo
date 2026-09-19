package defpackage;

import android.os.SystemClock;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;
import java.text.DecimalFormat;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class qc1 extends pc1 {
    public static final Set k = Collections.synchronizedSet(new HashSet());
    public static final DecimalFormat l = new DecimalFormat("#,###");
    public File i;
    public boolean j;

    /* JADX WARN: Code duplicated, block: B:193:0x04bf  */
    /* JADX WARN: Code duplicated, block: B:197:0x04d1  */
    /* JADX WARN: Code duplicated, block: B:198:0x04f3  */
    /* JADX WARN: Code duplicated, block: B:201:0x051a  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v10, types: [int] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v31 */
    /* JADX WARN: Type inference failed for: r2v32 */
    /* JADX WARN: Type inference failed for: r2v33 */
    /* JADX WARN: Type inference failed for: r2v34 */
    /* JADX WARN: Type inference failed for: r2v35 */
    /* JADX WARN: Type inference failed for: r35v0, types: [pc1, qc1] */
    /* JADX WARN: Type inference failed for: r3v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v29 */
    /* JADX WARN: Type inference failed for: r3v34 */
    /* JADX WARN: Type inference failed for: r3v53 */
    /* JADX WARN: Type inference failed for: r3v54 */
    /* JADX WARN: Type inference failed for: r5v28 */
    /* JADX WARN: Type inference failed for: r5v29 */
    /* JADX WARN: Type inference failed for: r5v31 */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v9 */
    @Override // defpackage.pc1
    public final boolean b(String str) throws Throwable {
        int i;
        String str2;
        String str3;
        String string;
        FileOutputStream fileOutputStream;
        ?? r3;
        ?? r2;
        String str4;
        FileOutputStream fileOutputStream2;
        ?? r4;
        ?? r5;
        String string2;
        boolean z;
        ?? r6;
        String str5;
        int i2;
        boolean zDelete;
        String str6 = str;
        String str7 = " at ";
        String str8 = "HTTP status code ";
        if (this.i == null) {
            m(str6, null, "noCacheDir", null);
            return false;
        }
        while (true) {
            File file = this.i;
            if (file == null) {
                i = 0;
            } else {
                File[] fileArrListFiles = file.listFiles();
                int length = fileArrListFiles.length;
                int i3 = 0;
                int i4 = 0;
                while (i3 < length) {
                    int i5 = i3;
                    int i6 = length;
                    if (!fileArrListFiles[i3].getName().endsWith(".done")) {
                        i4++;
                    }
                    i3 = i5 + 1;
                    length = i6;
                }
                i = i4;
            }
            ix0 ix0Var = lx0.t;
            String str9 = str7;
            tu0 tu0Var = tu0.e;
            String str10 = str8;
            if (i > ((Integer) tu0Var.c.a(ix0Var)).intValue()) {
                File file2 = this.i;
                if (file2 != null) {
                    File[] fileArrListFiles2 = file2.listFiles();
                    int length2 = fileArrListFiles2.length;
                    long j = Long.MAX_VALUE;
                    int i7 = 0;
                    File file3 = null;
                    while (i7 < length2) {
                        File file4 = fileArrListFiles2[i7];
                        int i8 = i7;
                        int i9 = length2;
                        if (!file4.getName().endsWith(".done")) {
                            long jLastModified = file4.lastModified();
                            if (jLastModified < j) {
                                file3 = file4;
                                j = jLastModified;
                            }
                        }
                        i7 = i8 + 1;
                        length2 = i9;
                    }
                    if (file3 != null) {
                        zDelete = file3.delete();
                        File fileO = o(file3);
                        if (fileO.isFile()) {
                            zDelete &= fileO.delete();
                        }
                    } else {
                        zDelete = false;
                    }
                    if (zDelete) {
                        str7 = str9;
                        str8 = str10;
                    }
                }
                jn.T("Unable to expire stream cache");
                m(str6, null, "expireFailed", null);
                return false;
            }
            File file5 = new File(new File(this.i, f32.d(str6, "MD5")).getPath());
            File fileO2 = o(file5);
            if (file5.isFile() && fileO2.isFile()) {
                int length3 = (int) file5.length();
                jn.F("Stream cache hit at ".concat(String.valueOf(str6)));
                f32.b.post(new mc1((pc1) this, str6, file5.getAbsolutePath(), length3));
                return true;
            }
            String strValueOf = String.valueOf(this.i.getAbsolutePath());
            String strValueOf2 = String.valueOf(str6);
            Set set = k;
            String strConcat = strValueOf.concat(strValueOf2);
            synchronized (set) {
                try {
                    if (set.contains(strConcat)) {
                        StringBuilder sb = new StringBuilder(String.valueOf(str6).length() + 36);
                        sb.append("Stream cache already in progress at ");
                        sb.append(str6);
                        jn.T(sb.toString());
                        m(str6, file5.getAbsolutePath(), "inProgress", null);
                        return false;
                    }
                    set.add(strConcat);
                    try {
                        str2 = "error";
                        try {
                            el1 el1Var = el1.E;
                            mb2 mb2Var = new mb2();
                            mb2Var.f = el1Var;
                            mb2Var.g = null;
                            HttpURLConnection httpURLConnectionA = mb2Var.a(new wo2(str6, 5));
                            int responseCode = httpURLConnectionA.getResponseCode();
                            if (responseCode >= 400) {
                                str3 = "badUrl";
                                try {
                                    String string3 = Integer.toString(responseCode);
                                    StringBuilder sb2 = new StringBuilder(String.valueOf(string3).length() + 27);
                                    sb2.append("HTTP request failed. Code: ");
                                    sb2.append(string3);
                                    string = sb2.toString();
                                    try {
                                        StringBuilder sb3 = new StringBuilder(String.valueOf(responseCode).length() + 21 + String.valueOf(str6).length());
                                        sb3.append(str10);
                                        sb3.append(responseCode);
                                        sb3.append(str9);
                                        sb3.append(str6);
                                        throw new IOException(sb3.toString());
                                    } catch (IOException e) {
                                        e = e;
                                        fileOutputStream = null;
                                        r2 = str6;
                                        r3 = strConcat;
                                        if (e instanceof RuntimeException) {
                                            vc3.C.h.d("VideoStreamFullFileCache.preload", e);
                                        }
                                        fileOutputStream.close();
                                        if (this.j) {
                                            ?? sb4 = new StringBuilder(String.valueOf((Object) r2).length() + 26);
                                            sb4.append("Preload aborted for URL \"");
                                            sb4.append(r2);
                                            sb4.append("\"");
                                            jn.R(sb4.toString());
                                        } else {
                                            ?? sb5 = new StringBuilder(String.valueOf((Object) r2).length() + 25);
                                            sb5.append("Preload failed for URL \"");
                                            sb5.append(r2);
                                            sb5.append("\"");
                                            jn.V(sb5.toString(), e);
                                        }
                                        if (file5.exists()) {
                                            jn.T("Could not delete partial cache file at ".concat(String.valueOf(file5.getAbsolutePath())));
                                        }
                                        m(r2, file5.getAbsolutePath(), str3, string);
                                        k.remove(r3);
                                        return false;
                                    } catch (RuntimeException e2) {
                                        e = e2;
                                        fileOutputStream = null;
                                        r2 = str6;
                                        r3 = strConcat;
                                        if (e instanceof RuntimeException) {
                                            vc3.C.h.d("VideoStreamFullFileCache.preload", e);
                                        }
                                        fileOutputStream.close();
                                        if (this.j) {
                                            ?? sb6 = new StringBuilder(String.valueOf((Object) r2).length() + 26);
                                            sb6.append("Preload aborted for URL \"");
                                            sb6.append(r2);
                                            sb6.append("\"");
                                            jn.R(sb6.toString());
                                        } else {
                                            ?? sb7 = new StringBuilder(String.valueOf((Object) r2).length() + 25);
                                            sb7.append("Preload failed for URL \"");
                                            sb7.append(r2);
                                            sb7.append("\"");
                                            jn.V(sb7.toString(), e);
                                        }
                                        if (file5.exists()) {
                                            jn.T("Could not delete partial cache file at ".concat(String.valueOf(file5.getAbsolutePath())));
                                        }
                                        m(r2, file5.getAbsolutePath(), str3, string);
                                        k.remove(r3);
                                        return false;
                                    }
                                } catch (IOException e3) {
                                    e = e3;
                                    string = null;
                                    fileOutputStream = null;
                                    r2 = str6;
                                    r3 = strConcat;
                                    if (e instanceof RuntimeException) {
                                        vc3.C.h.d("VideoStreamFullFileCache.preload", e);
                                    }
                                    fileOutputStream.close();
                                    if (this.j) {
                                        ?? sb8 = new StringBuilder(String.valueOf((Object) r2).length() + 26);
                                        sb8.append("Preload aborted for URL \"");
                                        sb8.append(r2);
                                        sb8.append("\"");
                                        jn.R(sb8.toString());
                                    } else {
                                        ?? sb9 = new StringBuilder(String.valueOf((Object) r2).length() + 25);
                                        sb9.append("Preload failed for URL \"");
                                        sb9.append(r2);
                                        sb9.append("\"");
                                        jn.V(sb9.toString(), e);
                                    }
                                    if (file5.exists()) {
                                        jn.T("Could not delete partial cache file at ".concat(String.valueOf(file5.getAbsolutePath())));
                                    }
                                    m(r2, file5.getAbsolutePath(), str3, string);
                                    k.remove(r3);
                                    return false;
                                } catch (RuntimeException e4) {
                                    e = e4;
                                    string = null;
                                    fileOutputStream = null;
                                    r2 = str6;
                                    r3 = strConcat;
                                    if (e instanceof RuntimeException) {
                                        vc3.C.h.d("VideoStreamFullFileCache.preload", e);
                                    }
                                    fileOutputStream.close();
                                    if (this.j) {
                                        ?? sb10 = new StringBuilder(String.valueOf((Object) r2).length() + 26);
                                        sb10.append("Preload aborted for URL \"");
                                        sb10.append(r2);
                                        sb10.append("\"");
                                        jn.R(sb10.toString());
                                    } else {
                                        ?? sb11 = new StringBuilder(String.valueOf((Object) r2).length() + 25);
                                        sb11.append("Preload failed for URL \"");
                                        sb11.append(r2);
                                        sb11.append("\"");
                                        jn.V(sb11.toString(), e);
                                    }
                                    if (file5.exists()) {
                                        jn.T("Could not delete partial cache file at ".concat(String.valueOf(file5.getAbsolutePath())));
                                    }
                                    m(r2, file5.getAbsolutePath(), str3, string);
                                    k.remove(r3);
                                    return false;
                                }
                            }
                            try {
                                int contentLength = httpURLConnectionA.getContentLength();
                                if (contentLength < 0) {
                                    StringBuilder sb12 = new StringBuilder(String.valueOf(str6).length() + 55);
                                    sb12.append("Stream cache aborted, missing content-length header at ");
                                    sb12.append(str6);
                                    jn.T(sb12.toString());
                                    m(str6, file5.getAbsolutePath(), "contentLengthMissing", null);
                                    set.remove(strConcat);
                                    return false;
                                }
                                DecimalFormat decimalFormat = l;
                                str3 = " sec";
                                String str11 = decimalFormat.format(contentLength);
                                int iIntValue = ((Integer) tu0Var.c.a(lx0.u)).intValue();
                                String str12 = "File too big for full file cache. Size: ";
                                if (contentLength > iIntValue) {
                                    StringBuilder sb13 = new StringBuilder(String.valueOf(str11).length() + 33 + String.valueOf(str6).length());
                                    sb13.append("Content length ");
                                    sb13.append(str11);
                                    sb13.append(" exceeds limit at ");
                                    sb13.append(str6);
                                    jn.T(sb13.toString());
                                    StringBuilder sb14 = new StringBuilder(String.valueOf(str11).length() + 40);
                                    sb14.append("File too big for full file cache. Size: ");
                                    sb14.append(str11);
                                    m(str6, file5.getAbsolutePath(), "sizeExceeded", sb14.toString());
                                    set.remove(strConcat);
                                    return false;
                                }
                                StringBuilder sb15 = new StringBuilder(String.valueOf(str11).length() + 20 + String.valueOf(str6).length());
                                sb15.append("Caching ");
                                sb15.append(str11);
                                sb15.append(" bytes from ");
                                sb15.append(str6);
                                jn.F(sb15.toString());
                                ReadableByteChannel readableByteChannelNewChannel = Channels.newChannel(httpURLConnectionA.getInputStream());
                                FileOutputStream fileOutputStream3 = new FileOutputStream(file5);
                                try {
                                    FileChannel channel = fileOutputStream3.getChannel();
                                    ByteBuffer byteBufferAllocate = ByteBuffer.allocate(1048576);
                                    vc3.C.k.getClass();
                                    long jCurrentTimeMillis = System.currentTimeMillis();
                                    try {
                                        long jLongValue = ((Long) tu0Var.c.a(lx0.K)).longValue();
                                        Object obj = new Object();
                                        long jLongValue2 = ((Long) tu0Var.c.a(lx0.J)).longValue();
                                        long j2 = Long.MIN_VALUE;
                                        int i10 = 0;
                                        strConcat = strConcat;
                                        ?? r8 = contentLength;
                                        while (true) {
                                            ?? r7 = readableByteChannelNewChannel.read(byteBufferAllocate);
                                            if (r7 < 0) {
                                                String str13 = strConcat;
                                                fileOutputStream3.close();
                                                if (jn.a0(3)) {
                                                    String str14 = decimalFormat.format(i10);
                                                    StringBuilder sb16 = new StringBuilder(String.valueOf(str14).length() + 22 + String.valueOf(str).length());
                                                    sb16.append("Preloaded ");
                                                    sb16.append(str14);
                                                    sb16.append(" bytes from ");
                                                    sb16.append(str);
                                                    jn.F(sb16.toString());
                                                }
                                                file5.setReadable(true, false);
                                                if (fileO2.isFile()) {
                                                    fileO2.setLastModified(System.currentTimeMillis());
                                                } else {
                                                    try {
                                                        fileO2.createNewFile();
                                                    } catch (IOException unused) {
                                                    }
                                                }
                                                f32.b.post(new mc1((pc1) this, str, file5.getAbsolutePath(), i10));
                                                k.remove(str13);
                                                return true;
                                            }
                                            int i11 = i10 + r7;
                                            try {
                                                if (i11 <= iIntValue) {
                                                    byteBufferAllocate.flip();
                                                    while (channel.write(byteBufferAllocate) > 0) {
                                                        fileOutputStream3 = fileOutputStream3;
                                                    }
                                                    byteBufferAllocate.clear();
                                                    if (System.currentTimeMillis() - jCurrentTimeMillis > 1000 * jLongValue2) {
                                                        r7 = str;
                                                        r8 = strConcat;
                                                        fileOutputStream2 = fileOutputStream3;
                                                        try {
                                                            String string4 = Long.toString(jLongValue2);
                                                            StringBuilder sb17 = new StringBuilder(String.valueOf(string4).length() + 29);
                                                            sb17.append("Timeout exceeded. Limit: ");
                                                            sb17.append(string4);
                                                            sb17.append(str3);
                                                            string2 = sb17.toString();
                                                            try {
                                                                throw new IOException("stream cache time limit exceeded");
                                                            } catch (IOException | RuntimeException e5) {
                                                                e = e5;
                                                                str3 = "downloadTimeout";
                                                            }
                                                        } catch (IOException | RuntimeException e6) {
                                                            e = e6;
                                                            str3 = "downloadTimeout";
                                                            r4 = r8;
                                                            r5 = r7;
                                                            fileOutputStream = fileOutputStream2;
                                                            string = null;
                                                            r2 = r5;
                                                            r3 = r4;
                                                            if (e instanceof RuntimeException) {
                                                                vc3.C.h.d("VideoStreamFullFileCache.preload", e);
                                                            }
                                                            fileOutputStream.close();
                                                            if (this.j) {
                                                                ?? sb18 = new StringBuilder(String.valueOf((Object) r2).length() + 26);
                                                                sb18.append("Preload aborted for URL \"");
                                                                sb18.append(r2);
                                                                sb18.append("\"");
                                                                jn.R(sb18.toString());
                                                            } else {
                                                                ?? sb19 = new StringBuilder(String.valueOf((Object) r2).length() + 25);
                                                                sb19.append("Preload failed for URL \"");
                                                                sb19.append(r2);
                                                                sb19.append("\"");
                                                                jn.V(sb19.toString(), e);
                                                            }
                                                            if (file5.exists()) {
                                                                jn.T("Could not delete partial cache file at ".concat(String.valueOf(file5.getAbsolutePath())));
                                                            }
                                                            m(r2, file5.getAbsolutePath(), str3, string);
                                                            k.remove(r3);
                                                            return false;
                                                        }
                                                    } else {
                                                        if (this.j) {
                                                            throw new IOException("abort requested");
                                                        }
                                                        synchronized (obj) {
                                                            try {
                                                                vc3.C.k.getClass();
                                                                long jElapsedRealtime = SystemClock.elapsedRealtime();
                                                                if (j2 + jLongValue > jElapsedRealtime) {
                                                                    z = false;
                                                                } else {
                                                                    j2 = jElapsedRealtime;
                                                                    z = true;
                                                                }
                                                            } catch (Throwable th) {
                                                                th = th;
                                                                while (true) {
                                                                    try {
                                                                        throw th;
                                                                    } catch (Throwable th2) {
                                                                        th = th2;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        if (z) {
                                                            String str15 = strConcat;
                                                            try {
                                                                String str16 = str12;
                                                                i2 = i11;
                                                                fileOutputStream2 = fileOutputStream3;
                                                                str5 = str16;
                                                                r6 = r8;
                                                                str4 = str15;
                                                                str6 = str;
                                                                try {
                                                                    try {
                                                                        f32.b.post(new hc1(this, str6, file5.getAbsolutePath(), i2, r6 == true ? 1 : 0));
                                                                    } catch (RuntimeException e7) {
                                                                        e = e7;
                                                                    }
                                                                } catch (IOException e8) {
                                                                    e = e8;
                                                                }
                                                            } catch (IOException | RuntimeException e9) {
                                                                e = e9;
                                                                str4 = str15;
                                                                fileOutputStream2 = fileOutputStream3;
                                                                str6 = str;
                                                            }
                                                        } else {
                                                            r6 = r8;
                                                            fileOutputStream2 = fileOutputStream3;
                                                            str4 = strConcat;
                                                            str5 = str12;
                                                            i2 = i11;
                                                        }
                                                        i10 = i2;
                                                        str12 = str5;
                                                        strConcat = str4;
                                                        readableByteChannelNewChannel = readableByteChannelNewChannel;
                                                        iIntValue = iIntValue;
                                                        fileOutputStream3 = fileOutputStream2;
                                                        r8 = r6;
                                                    }
                                                } else {
                                                    r7 = str;
                                                    r8 = strConcat;
                                                    String str17 = str12;
                                                    fileOutputStream2 = fileOutputStream3;
                                                    str3 = "sizeExceeded";
                                                    String string5 = Integer.toString(i11);
                                                    StringBuilder sb20 = new StringBuilder(String.valueOf(string5).length() + 40);
                                                    sb20.append(str17);
                                                    sb20.append(string5);
                                                    string2 = sb20.toString();
                                                    try {
                                                        throw new IOException("stream cache file size limit exceeded");
                                                    } catch (IOException e10) {
                                                        e = e10;
                                                    } catch (RuntimeException e11) {
                                                        e = e11;
                                                    }
                                                }
                                                r3 = r8;
                                                string = string2;
                                                fileOutputStream = fileOutputStream2;
                                                r2 = r7;
                                            } catch (IOException e12) {
                                                e = e12;
                                            } catch (RuntimeException e13) {
                                                e = e13;
                                            }
                                            r4 = str4;
                                            str3 = str2;
                                            r5 = str6;
                                            fileOutputStream = fileOutputStream2;
                                            string = null;
                                            r2 = r5;
                                            r3 = r4;
                                        }
                                    } catch (IOException | RuntimeException e14) {
                                        e = e14;
                                        str6 = str;
                                        str4 = strConcat;
                                        fileOutputStream2 = fileOutputStream3;
                                    }
                                } catch (IOException e15) {
                                    e = e15;
                                } catch (RuntimeException e16) {
                                    e = e16;
                                }
                            } catch (IOException | RuntimeException e17) {
                                e = e17;
                                str3 = str2;
                                string = null;
                                fileOutputStream = null;
                                r2 = str6;
                                r3 = strConcat;
                            }
                            if (e instanceof RuntimeException) {
                                vc3.C.h.d("VideoStreamFullFileCache.preload", e);
                            }
                            try {
                                fileOutputStream.close();
                            } catch (IOException | NullPointerException unused2) {
                            }
                            if (this.j) {
                                ?? sb110 = new StringBuilder(String.valueOf((Object) r2).length() + 26);
                                sb110.append("Preload aborted for URL \"");
                                sb110.append(r2);
                                sb110.append("\"");
                                jn.R(sb110.toString());
                            } else {
                                ?? sb111 = new StringBuilder(String.valueOf((Object) r2).length() + 25);
                                sb111.append("Preload failed for URL \"");
                                sb111.append(r2);
                                sb111.append("\"");
                                jn.V(sb111.toString(), e);
                            }
                            if (file5.exists() && !file5.delete()) {
                                jn.T("Could not delete partial cache file at ".concat(String.valueOf(file5.getAbsolutePath())));
                            }
                            m(r2, file5.getAbsolutePath(), str3, string);
                            k.remove(r3);
                            return false;
                        } catch (IOException e18) {
                            e = e18;
                        } catch (RuntimeException e19) {
                            e = e19;
                        }
                    } catch (IOException | RuntimeException e20) {
                        e = e20;
                        str2 = "error";
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
    }

    @Override // defpackage.pc1
    public final void l() {
        this.j = true;
    }

    public final File o(File file) {
        return new File(new File(this.i, String.valueOf(file.getName()).concat(".done")).getPath());
    }
}
