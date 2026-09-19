package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class xc2 extends za2 {
    public final /* synthetic */ int j;
    public AssetFileDescriptor k;
    public FileInputStream l;
    public long m;
    public boolean n;
    public final Object o;
    public Object p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xc2(Context context, int i) {
        super(false);
        this.j = i;
        switch (i) {
            case 1:
                super(false);
                this.o = context.getApplicationContext();
                break;
            default:
                this.o = context.getContentResolver();
                break;
        }
    }

    @Override // defpackage.oe2
    public final long a(eg2 eg2Var) throws co2, pc2 {
        int i;
        AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor;
        long jPosition;
        Resources resourcesForApplication;
        Resources resources;
        int identifier;
        long size;
        int i2 = this.j;
        Object obj = this.o;
        switch (i2) {
            case 0:
                ContentResolver contentResolver = (ContentResolver) obj;
                try {
                    try {
                        Uri uri = eg2Var.a;
                        long j = eg2Var.c;
                        Uri uriNormalizeScheme = uri.normalizeScheme();
                        this.p = uriNormalizeScheme;
                        b(eg2Var);
                        if (Objects.equals(uriNormalizeScheme.getScheme(), "content")) {
                            Bundle bundle = new Bundle();
                            bundle.putBoolean("android.provider.extra.ACCEPT_ORIGINAL_MEDIA_FORMAT", true);
                            assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openTypedAssetFileDescriptor(uriNormalizeScheme, "*/*", bundle);
                        } else {
                            assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uriNormalizeScheme, "r");
                        }
                        this.k = assetFileDescriptorOpenAssetFileDescriptor;
                        if (assetFileDescriptorOpenAssetFileDescriptor == null) {
                            String strValueOf = String.valueOf(uriNormalizeScheme);
                            StringBuilder sb = new StringBuilder(strValueOf.length() + 36);
                            sb.append("Could not open file descriptor for: ");
                            sb.append(strValueOf);
                            i = 2000;
                            try {
                                throw new pc2(2000, new IOException(sb.toString()));
                            } catch (IOException e) {
                                e = e;
                                throw new pc2(true != (e instanceof FileNotFoundException) ? i : 2005, e);
                            }
                        }
                        long length = assetFileDescriptorOpenAssetFileDescriptor.getLength();
                        FileInputStream fileInputStream = new FileInputStream(assetFileDescriptorOpenAssetFileDescriptor.getFileDescriptor());
                        this.l = fileInputStream;
                        if (length != -1 && j > length) {
                            throw new pc2(2008, null);
                        }
                        long startOffset = assetFileDescriptorOpenAssetFileDescriptor.getStartOffset();
                        long jSkip = fileInputStream.skip(startOffset + j) - startOffset;
                        if (jSkip != j) {
                            throw new pc2(2008, null);
                        }
                        if (length == -1) {
                            FileChannel channel = fileInputStream.getChannel();
                            long size2 = channel.size();
                            if (size2 == 0) {
                                this.m = -1L;
                                jPosition = -1;
                            } else {
                                jPosition = size2 - channel.position();
                                this.m = jPosition;
                                if (jPosition < 0) {
                                    throw new pc2(2008, null);
                                }
                            }
                        } else {
                            jPosition = length - jSkip;
                            this.m = jPosition;
                            if (jPosition < 0) {
                                throw new pc2(2008, null);
                            }
                        }
                        long j2 = eg2Var.d;
                        if (j2 != -1) {
                            this.m = jPosition == -1 ? j2 : Math.min(jPosition, j2);
                        }
                        this.n = true;
                        e(eg2Var);
                        return j2 != -1 ? j2 : this.m;
                    } catch (IOException e2) {
                        e = e2;
                        i = 2000;
                    }
                } catch (pc2 e3) {
                    throw e3;
                }
                break;
            default:
                this.p = eg2Var;
                b(eg2Var);
                Context context = (Context) obj;
                Uri uri2 = eg2Var.a;
                long j3 = eg2Var.c;
                Uri uriNormalizeScheme2 = uri2.normalizeScheme();
                if (TextUtils.equals("rawresource", uriNormalizeScheme2.getScheme())) {
                    resources = context.getResources();
                    List<String> pathSegments = uriNormalizeScheme2.getPathSegments();
                    if (pathSegments.size() != 1) {
                        int size3 = pathSegments.size();
                        throw new co2(ec.j(new StringBuilder(String.valueOf(size3).length() + 61), "rawresource:// URI must have exactly one path element, found ", size3), null, 2000);
                    }
                    try {
                        identifier = Integer.parseInt(pathSegments.get(0));
                    } catch (NumberFormatException unused) {
                        throw new co2("Resource identifier must be an integer.", null, 1004);
                    }
                } else {
                    if (!TextUtils.equals("android.resource", uriNormalizeScheme2.getScheme())) {
                        String scheme = uriNormalizeScheme2.getScheme();
                        throw new co2(ec.n(new StringBuilder(String.valueOf(scheme).length() + 62), "Unsupported URI scheme (", scheme, "). Only android.resource is supported."), null, 1004);
                    }
                    String path = uriNormalizeScheme2.getPath();
                    path.getClass();
                    if (path.startsWith("/")) {
                        path = path.substring(1);
                    }
                    String packageName = TextUtils.isEmpty(uriNormalizeScheme2.getHost()) ? context.getPackageName() : uriNormalizeScheme2.getHost();
                    if (packageName.equals(context.getPackageName())) {
                        resourcesForApplication = context.getResources();
                    } else {
                        try {
                            resourcesForApplication = context.getPackageManager().getResourcesForApplication(packageName);
                        } catch (PackageManager.NameNotFoundException e4) {
                            throw new co2("Package in android.resource:// URI not found. Check http://g.co/dev/packagevisibility.", e4, 2005);
                        }
                    }
                    resources = resourcesForApplication;
                    if (path.matches("\\d+")) {
                        try {
                            identifier = Integer.parseInt(path);
                        } catch (NumberFormatException unused2) {
                            throw new co2("Resource identifier must be an integer.", null, 1004);
                        }
                    } else {
                        identifier = resources.getIdentifier(ec.n(new StringBuilder(packageName.length() + 1 + path.length()), packageName, ":", path), "raw", null);
                        if (identifier == 0) {
                            throw new co2("Resource not found.", null, 2005);
                        }
                    }
                }
                try {
                    AssetFileDescriptor assetFileDescriptorOpenRawResourceFd = resources.openRawResourceFd(identifier);
                    if (assetFileDescriptorOpenRawResourceFd == null) {
                        throw new co2("Resource is compressed: ".concat(String.valueOf(uriNormalizeScheme2)), null, 2000);
                    }
                    this.k = assetFileDescriptorOpenRawResourceFd;
                    long length2 = assetFileDescriptorOpenRawResourceFd.getLength();
                    FileInputStream fileInputStream2 = new FileInputStream(this.k.getFileDescriptor());
                    this.l = fileInputStream2;
                    try {
                        if (length2 != -1 && j3 > length2) {
                            throw new co2(null, null, 2008);
                        }
                        long startOffset2 = this.k.getStartOffset();
                        long jSkip2 = fileInputStream2.skip(startOffset2 + j3) - startOffset2;
                        if (jSkip2 != j3) {
                            throw new co2(null, null, 2008);
                        }
                        if (length2 == -1) {
                            FileChannel channel2 = fileInputStream2.getChannel();
                            if (channel2.size() == 0) {
                                this.m = -1L;
                                size = -1;
                            } else {
                                size = channel2.size() - channel2.position();
                                this.m = size;
                                if (size < 0) {
                                    throw new co2(null, null, 2008);
                                }
                            }
                        } else {
                            size = length2 - jSkip2;
                            this.m = size;
                            if (size < 0) {
                                throw new ze2();
                            }
                        }
                        long j4 = eg2Var.d;
                        if (j4 != -1) {
                            this.m = size == -1 ? j4 : Math.min(size, j4);
                        }
                        this.n = true;
                        e(eg2Var);
                        return j4 != -1 ? j4 : this.m;
                    } catch (co2 e5) {
                        throw e5;
                    } catch (IOException e6) {
                        throw new co2(null, e6, 2000);
                    }
                } catch (Resources.NotFoundException e7) {
                    throw new co2(null, e7, 2005);
                }
                break;
        }
    }

    @Override // defpackage.k73
    public final int d(byte[] bArr, int i, int i2) throws co2, pc2 {
        switch (this.j) {
            case 0:
                if (i2 == 0) {
                    return 0;
                }
                long j = this.m;
                if (j != 0) {
                    if (j != -1) {
                        try {
                            i2 = (int) Math.min(j, i2);
                        } catch (IOException e) {
                            throw new pc2(2000, e);
                        }
                    }
                    FileInputStream fileInputStream = this.l;
                    String str = qz1.a;
                    int i3 = fileInputStream.read(bArr, i, i2);
                    if (i3 != -1) {
                        long j2 = this.m;
                        if (j2 != -1) {
                            this.m = j2 - ((long) i3);
                        }
                        f(i3);
                        return i3;
                    }
                }
                return -1;
            default:
                if (i2 == 0) {
                    return 0;
                }
                long j3 = this.m;
                if (j3 != 0) {
                    if (j3 != -1) {
                        try {
                            i2 = (int) Math.min(j3, i2);
                        } catch (IOException e2) {
                            throw new co2(null, e2, 2000);
                        }
                    }
                    FileInputStream fileInputStream2 = this.l;
                    String str2 = qz1.a;
                    int i4 = fileInputStream2.read(bArr, i, i2);
                    long j4 = this.m;
                    if (i4 != -1) {
                        if (j4 != -1) {
                            this.m = j4 - ((long) i4);
                        }
                        f(i4);
                        return i4;
                    }
                    if (j4 != -1) {
                        throw new co2("End of stream reached having not read sufficient data.", new EOFException(), 2000);
                    }
                }
                return -1;
        }
    }

    @Override // defpackage.oe2
    public final Uri h() {
        switch (this.j) {
            case 0:
                return (Uri) this.p;
            default:
                eg2 eg2Var = (eg2) this.p;
                if (eg2Var != null) {
                    return eg2Var.a;
                }
                return null;
        }
    }

    @Override // defpackage.oe2
    public final void l() {
        switch (this.j) {
            case 0:
                this.p = null;
                try {
                    try {
                        try {
                            FileInputStream fileInputStream = this.l;
                            if (fileInputStream != null) {
                                fileInputStream.close();
                            }
                            this.l = null;
                            try {
                                AssetFileDescriptor assetFileDescriptor = this.k;
                                if (assetFileDescriptor != null) {
                                    assetFileDescriptor.close();
                                    break;
                                }
                                this.k = null;
                                if (this.n) {
                                    this.n = false;
                                    j();
                                    return;
                                }
                                return;
                            } catch (IOException e) {
                                throw new pc2(2000, e);
                            }
                        } catch (Throwable th) {
                            this.l = null;
                            try {
                                AssetFileDescriptor assetFileDescriptor2 = this.k;
                                if (assetFileDescriptor2 != null) {
                                    assetFileDescriptor2.close();
                                    break;
                                }
                                this.k = null;
                                if (this.n) {
                                    this.n = false;
                                    j();
                                }
                                throw th;
                            } catch (IOException e2) {
                                throw new pc2(2000, e2);
                            }
                        }
                    } catch (IOException e3) {
                        throw new pc2(2000, e3);
                    }
                } catch (Throwable th2) {
                    this.k = null;
                    if (this.n) {
                        this.n = false;
                        j();
                    }
                    throw th2;
                }
            default:
                this.p = null;
                try {
                    try {
                        try {
                            FileInputStream fileInputStream2 = this.l;
                            if (fileInputStream2 != null) {
                                fileInputStream2.close();
                            }
                            this.l = null;
                            try {
                                AssetFileDescriptor assetFileDescriptor3 = this.k;
                                if (assetFileDescriptor3 != null) {
                                    assetFileDescriptor3.close();
                                    break;
                                }
                                this.k = null;
                                if (this.n) {
                                    this.n = false;
                                    j();
                                    return;
                                }
                                return;
                            } catch (IOException e4) {
                                throw new co2(null, e4, 2000);
                            }
                        } catch (IOException e5) {
                            throw new co2(null, e5, 2000);
                        }
                    } catch (Throwable th3) {
                        this.k = null;
                        if (this.n) {
                            this.n = false;
                            j();
                        }
                        throw th3;
                    }
                    break;
                } catch (Throwable th4) {
                    this.l = null;
                    try {
                        AssetFileDescriptor assetFileDescriptor4 = this.k;
                        if (assetFileDescriptor4 != null) {
                            assetFileDescriptor4.close();
                            break;
                        }
                        this.k = null;
                        if (this.n) {
                            this.n = false;
                            j();
                        }
                        throw th4;
                    } catch (IOException e6) {
                        throw new co2(null, e6, 2000);
                    }
                }
        }
    }
}
