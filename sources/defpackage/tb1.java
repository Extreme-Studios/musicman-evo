package defpackage;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import android.os.HandlerThread;
import android.util.Log;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.concurrent.CountDownLatch;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;

/* JADX INFO: loaded from: classes.dex */
public final class tb1 extends Thread implements SurfaceTexture.OnFrameAvailableListener {
    public static final float[] G = {-1.0f, -1.0f, -1.0f, 1.0f, -1.0f, -1.0f, -1.0f, 1.0f, -1.0f, 1.0f, 1.0f, -1.0f};
    public EGL10 A;
    public EGLDisplay B;
    public EGLContext C;
    public EGLSurface D;
    public volatile boolean E;
    public volatile boolean F;
    public final sb1 f;
    public final float[] g;
    public final float[] h;
    public final float[] i;
    public final float[] j;
    public final float[] k;
    public final float[] l;
    public final float[] m;
    public float n;
    public float o;
    public float p;
    public int q;
    public int r;
    public SurfaceTexture s;
    public SurfaceTexture t;
    public int u;
    public int v;
    public int w;
    public final FloatBuffer x;
    public final CountDownLatch y;
    public final Object z;

    public tb1(Context context) {
        super("SphericalVideoProcessor");
        FloatBuffer floatBufferAsFloatBuffer = ByteBuffer.allocateDirect(48).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.x = floatBufferAsFloatBuffer;
        floatBufferAsFloatBuffer.put(G).position(0);
        this.g = new float[9];
        this.h = new float[9];
        this.i = new float[9];
        this.j = new float[9];
        this.k = new float[9];
        this.l = new float[9];
        this.m = new float[9];
        this.n = Float.NaN;
        sb1 sb1Var = new sb1(context);
        this.f = sb1Var;
        sb1Var.h = this;
        this.y = new CountDownLatch(1);
        this.z = new Object();
    }

    public static final void e(String str) {
        int iGlGetError = GLES20.glGetError();
        if (iGlGetError != 0) {
            StringBuilder sb = new StringBuilder(str.length() + 10 + String.valueOf(iGlGetError).length());
            sb.append(str);
            sb.append(": glError ");
            sb.append(iGlGetError);
            Log.e("SphericalVideoRenderer", sb.toString());
        }
    }

    public static final void f(float[] fArr, float[] fArr2, float[] fArr3) {
        float f = fArr2[0] * fArr3[0];
        float f2 = fArr2[1];
        float f3 = fArr3[3];
        float f4 = fArr2[2];
        float f5 = fArr3[6];
        fArr[0] = f + (f2 * f3) + (f4 * f5);
        float f6 = fArr2[0];
        float f7 = fArr3[1] * f6;
        float f8 = fArr3[4];
        float f9 = fArr3[7];
        fArr[1] = f7 + (f2 * f8) + (f4 * f9);
        float f10 = f6 * fArr3[2];
        float f11 = fArr2[1];
        float f12 = fArr3[5];
        float f13 = fArr3[8];
        fArr[2] = f10 + (f11 * f12) + (f4 * f13);
        float f14 = fArr2[3];
        float f15 = fArr3[0];
        float f16 = fArr2[4];
        float f17 = fArr2[5];
        fArr[3] = (f14 * f15) + (f3 * f16) + (f17 * f5);
        float f18 = fArr2[3];
        float f19 = fArr3[1];
        fArr[4] = (f18 * f19) + (f16 * f8) + (f17 * f9);
        float f20 = fArr3[2];
        fArr[5] = (f18 * f20) + (fArr2[4] * f12) + (f17 * f13);
        float f21 = fArr2[6] * f15;
        float f22 = fArr2[7];
        float f23 = fArr3[3] * f22;
        float f24 = fArr2[8];
        fArr[6] = f21 + f23 + (f5 * f24);
        float f25 = fArr2[6];
        float f26 = f9 * f24;
        fArr[7] = f26 + (f22 * fArr3[4]) + (f19 * f25);
        fArr[8] = (f25 * f20) + (fArr2[7] * fArr3[5]) + (f24 * f13);
    }

    public static final void g(float[] fArr, float f) {
        fArr[0] = 1.0f;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        double d = f;
        fArr[4] = (float) Math.cos(d);
        fArr[5] = (float) (-Math.sin(d));
        fArr[6] = 0.0f;
        fArr[7] = (float) Math.sin(d);
        fArr[8] = (float) Math.cos(d);
    }

    public static final void h(float[] fArr, float f) {
        double d = f;
        fArr[0] = (float) Math.cos(d);
        fArr[1] = (float) (-Math.sin(d));
        fArr[2] = 0.0f;
        fArr[3] = (float) Math.sin(d);
        fArr[4] = (float) Math.cos(d);
        fArr[5] = 0.0f;
        fArr[6] = 0.0f;
        fArr[7] = 0.0f;
        fArr[8] = 1.0f;
    }

    public static final int i(String str, int i) {
        int iGlCreateShader = GLES20.glCreateShader(i);
        e("createShader");
        if (iGlCreateShader != 0) {
            GLES20.glShaderSource(iGlCreateShader, str);
            e("shaderSource");
            GLES20.glCompileShader(iGlCreateShader);
            e("compileShader");
            int[] iArr = new int[1];
            GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
            e("getShaderiv");
            if (iArr[0] == 0) {
                StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 26);
                sb.append("Could not compile shader ");
                sb.append(i);
                sb.append(":");
                Log.e("SphericalVideoRenderer", sb.toString());
                Log.e("SphericalVideoRenderer", GLES20.glGetShaderInfoLog(iGlCreateShader));
                GLES20.glDeleteShader(iGlCreateShader);
                e("deleteShader");
                return 0;
            }
        }
        return iGlCreateShader;
    }

    public final void a(int i, int i2) {
        Object obj = this.z;
        synchronized (obj) {
            this.r = i;
            this.q = i2;
            this.E = true;
            obj.notifyAll();
        }
    }

    public final void b() {
        Object obj = this.z;
        synchronized (obj) {
            this.F = true;
            this.t = null;
            obj.notifyAll();
        }
    }

    public final void c(float f, float f2) {
        int i = this.r;
        int i2 = this.q;
        if (i <= i2) {
            i = i2;
        }
        float f3 = i;
        this.o -= (f * 1.7453293f) / f3;
        float f4 = this.p - ((f2 * 1.7453293f) / f3);
        this.p = f4;
        if (f4 < -1.5707964f) {
            this.p = -1.5707964f;
            f4 = -1.5707964f;
        }
        if (f4 > 1.5707964f) {
            this.p = 1.5707964f;
        }
    }

    public final void d() {
        EGLSurface eGLSurface;
        EGLSurface eGLSurface2 = this.D;
        if (eGLSurface2 != null && eGLSurface2 != (eGLSurface = EGL10.EGL_NO_SURFACE)) {
            this.A.eglMakeCurrent(this.B, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
            this.A.eglDestroySurface(this.B, this.D);
            this.D = null;
        }
        EGLContext eGLContext = this.C;
        if (eGLContext != null) {
            this.A.eglDestroyContext(this.B, eGLContext);
            this.C = null;
        }
        EGLDisplay eGLDisplay = this.B;
        if (eGLDisplay != null) {
            this.A.eglTerminate(eGLDisplay);
            this.B = null;
        }
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.w++;
        Object obj = this.z;
        synchronized (obj) {
            obj.notifyAll();
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:6:0x0020  */
    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        boolean z;
        int iGlCreateProgram;
        if (this.t == null) {
            jn.M("SphericalVideoProcessor started with no output texture.");
            this.y.countDown();
            return;
        }
        EGL10 egl10 = (EGL10) EGLContext.getEGL();
        this.A = egl10;
        EGLDisplay eGLDisplayEglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
        this.B = eGLDisplayEglGetDisplay;
        if (eGLDisplayEglGetDisplay != EGL10.EGL_NO_DISPLAY && this.A.eglInitialize(eGLDisplayEglGetDisplay, new int[2])) {
            int[] iArr = new int[1];
            EGLConfig[] eGLConfigArr = new EGLConfig[1];
            EGLConfig eGLConfig = (this.A.eglChooseConfig(this.B, new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12325, 16, 12344}, eGLConfigArr, 1, iArr) && iArr[0] > 0) ? eGLConfigArr[0] : null;
            if (eGLConfig == null) {
                z = false;
            } else {
                EGL10 egl11 = this.A;
                EGLDisplay eGLDisplay = this.B;
                EGLContext eGLContext = EGL10.EGL_NO_CONTEXT;
                EGLContext eGLContextEglCreateContext = egl11.eglCreateContext(eGLDisplay, eGLConfig, eGLContext, new int[]{12440, 2, 12344});
                this.C = eGLContextEglCreateContext;
                if (eGLContextEglCreateContext == null || eGLContextEglCreateContext == eGLContext) {
                    z = false;
                } else {
                    EGLSurface eGLSurfaceEglCreateWindowSurface = this.A.eglCreateWindowSurface(this.B, eGLConfig, this.t, null);
                    this.D = eGLSurfaceEglCreateWindowSurface;
                    if (eGLSurfaceEglCreateWindowSurface == null || eGLSurfaceEglCreateWindowSurface == EGL10.EGL_NO_SURFACE || !this.A.eglMakeCurrent(this.B, eGLSurfaceEglCreateWindowSurface, eGLSurfaceEglCreateWindowSurface, this.C)) {
                        z = false;
                    } else {
                        z = true;
                    }
                }
            }
        } else {
            z = false;
        }
        ix0 ix0Var = lx0.s1;
        tu0 tu0Var = tu0.e;
        int i = i(!((String) tu0Var.c.a(ix0Var)).equals(ix0Var.c()) ? (String) tu0Var.c.a(ix0Var) : "attribute highp vec3 aPosition;varying vec3 pos;void main() {  gl_Position = vec4(aPosition, 1.0);  pos = aPosition;}", 35633);
        if (i == 0) {
            iGlCreateProgram = 0;
        } else {
            ix0 ix0Var2 = lx0.t1;
            int i2 = i(!((String) tu0Var.c.a(ix0Var2)).equals(ix0Var2.c()) ? (String) tu0Var.c.a(ix0Var2) : "#extension GL_OES_EGL_image_external : require\n#define INV_PI 0.3183\nprecision highp float;varying vec3 pos;uniform samplerExternalOES uSplr;uniform mat3 uVMat;uniform float uFOVx;uniform float uFOVy;void main() {  vec3 ray = vec3(pos.x * tan(uFOVx), pos.y * tan(uFOVy), -1);  ray = (uVMat * ray).xyz;  ray = normalize(ray);  vec2 texCrd = vec2(    0.5 + atan(ray.x, - ray.z) * INV_PI * 0.5, acos(ray.y) * INV_PI);  gl_FragColor = vec4(texture2D(uSplr, texCrd).xyz, 1.0);}", 35632);
            if (i2 == 0) {
                iGlCreateProgram = 0;
            } else {
                iGlCreateProgram = GLES20.glCreateProgram();
                e("createProgram");
                if (iGlCreateProgram != 0) {
                    GLES20.glAttachShader(iGlCreateProgram, i);
                    e("attachShader");
                    GLES20.glAttachShader(iGlCreateProgram, i2);
                    e("attachShader");
                    GLES20.glLinkProgram(iGlCreateProgram);
                    e("linkProgram");
                    int[] iArr2 = new int[1];
                    GLES20.glGetProgramiv(iGlCreateProgram, 35714, iArr2, 0);
                    e("getProgramiv");
                    if (iArr2[0] != 1) {
                        Log.e("SphericalVideoRenderer", "Could not link program: ");
                        Log.e("SphericalVideoRenderer", GLES20.glGetProgramInfoLog(iGlCreateProgram));
                        GLES20.glDeleteProgram(iGlCreateProgram);
                        e("deleteProgram");
                        iGlCreateProgram = 0;
                    } else {
                        GLES20.glValidateProgram(iGlCreateProgram);
                        e("validateProgram");
                    }
                }
            }
        }
        this.u = iGlCreateProgram;
        GLES20.glUseProgram(iGlCreateProgram);
        e("useProgram");
        int iGlGetAttribLocation = GLES20.glGetAttribLocation(this.u, "aPosition");
        GLES20.glVertexAttribPointer(iGlGetAttribLocation, 3, 5126, false, 12, (Buffer) this.x);
        e("vertexAttribPointer");
        GLES20.glEnableVertexAttribArray(iGlGetAttribLocation);
        e("enableVertexAttribArray");
        int[] iArr3 = new int[1];
        GLES20.glGenTextures(1, iArr3, 0);
        e("genTextures");
        int i3 = iArr3[0];
        GLES20.glBindTexture(36197, i3);
        e("bindTextures");
        GLES20.glTexParameteri(36197, 10240, 9729);
        e("texParameteri");
        GLES20.glTexParameteri(36197, 10241, 9729);
        e("texParameteri");
        GLES20.glTexParameteri(36197, 10242, 33071);
        e("texParameteri");
        GLES20.glTexParameteri(36197, 10243, 33071);
        e("texParameteri");
        int iGlGetUniformLocation = GLES20.glGetUniformLocation(this.u, "uVMat");
        this.v = iGlGetUniformLocation;
        GLES20.glUniformMatrix3fv(iGlGetUniformLocation, 1, false, new float[]{1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f}, 0);
        int i4 = this.u;
        if (!z || i4 == 0) {
            String strConcat = "EGL initialization failed: ".concat(String.valueOf(GLUtils.getEGLErrorString(this.A.eglGetError())));
            jn.M(strConcat);
            vc3.C.h.d("SphericalVideoProcessor.run.1", new Throwable(strConcat));
            d();
            this.y.countDown();
            return;
        }
        SurfaceTexture surfaceTexture = new SurfaceTexture(i3);
        this.s = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(this);
        this.y.countDown();
        sb1 sb1Var = this.f;
        if (sb1Var.g == null) {
            SensorManager sensorManager = sb1Var.a;
            Sensor defaultSensor = sensorManager.getDefaultSensor(11);
            if (defaultSensor == null) {
                jn.M("No Sensor of TYPE_ROTATION_VECTOR");
            } else {
                HandlerThread handlerThread = new HandlerThread("OrientationMonitor");
                handlerThread.start();
                za0 za0Var = new za0(handlerThread.getLooper(), 2);
                sb1Var.g = za0Var;
                if (!sensorManager.registerListener(sb1Var, defaultSensor, 0, za0Var)) {
                    jn.M("SensorManager.registerListener failed.");
                    sb1Var.b();
                }
            }
        }
        try {
            try {
                try {
                    this.E = true;
                    while (!this.F) {
                        while (this.w > 0) {
                            this.s.updateTexImage();
                            this.w--;
                        }
                        float[] fArr = this.g;
                        if (sb1Var.c(fArr)) {
                            if (Float.isNaN(this.n)) {
                                float[] fArr2 = {0.0f, 1.0f, 0.0f};
                                float f = fArr[0];
                                float f2 = fArr2[0];
                                float f3 = fArr[1];
                                float f4 = fArr2[1];
                                float[] fArr3 = {(fArr[2] * 0.0f) + (f3 * f4) + (f * f2), (fArr[5] * 0.0f) + (fArr[4] * f4) + (fArr[3] * f2), (fArr[8] * 0.0f) + (fArr[7] * f4) + (fArr[6] * f2)};
                                this.n = -(((float) Math.atan2(fArr3[1], fArr3[0])) - 1.5707964f);
                            }
                            h(this.l, this.n + this.o);
                        } else {
                            g(fArr, -1.5707964f);
                            h(this.l, this.o);
                        }
                        float[] fArr4 = this.h;
                        g(fArr4, 1.5707964f);
                        float[] fArr5 = this.i;
                        f(fArr5, this.l, fArr4);
                        float[] fArr6 = this.j;
                        f(fArr6, fArr, fArr5);
                        float[] fArr7 = this.k;
                        g(fArr7, this.p);
                        float[] fArr8 = this.m;
                        f(fArr8, fArr7, fArr6);
                        GLES20.glUniformMatrix3fv(this.v, 1, false, fArr8, 0);
                        GLES20.glDrawArrays(5, 0, 4);
                        e("drawArrays");
                        GLES20.glFinish();
                        this.A.eglSwapBuffers(this.B, this.D);
                        if (this.E) {
                            GLES20.glViewport(0, 0, this.r, this.q);
                            e("viewport");
                            int iGlGetUniformLocation2 = GLES20.glGetUniformLocation(this.u, "uFOVx");
                            int iGlGetUniformLocation3 = GLES20.glGetUniformLocation(this.u, "uFOVy");
                            int i5 = this.r;
                            int i6 = this.q;
                            if (i5 > i6) {
                                GLES20.glUniform1f(iGlGetUniformLocation2, 0.87266463f);
                                GLES20.glUniform1f(iGlGetUniformLocation3, (this.q * 0.87266463f) / this.r);
                            } else {
                                GLES20.glUniform1f(iGlGetUniformLocation2, (i5 * 0.87266463f) / i6);
                                GLES20.glUniform1f(iGlGetUniformLocation3, 0.87266463f);
                            }
                            this.E = false;
                        }
                        try {
                            Object obj = this.z;
                            synchronized (obj) {
                                try {
                                    if (!this.F && !this.E && this.w == 0) {
                                        obj.wait();
                                    }
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                        } catch (InterruptedException unused) {
                        }
                    }
                } catch (Throwable th2) {
                    jn.P("SphericalVideoProcessor died.", th2);
                    vc3.C.h.d("SphericalVideoProcessor.run.2", th2);
                }
            } catch (IllegalStateException unused2) {
                jn.T("SphericalVideoProcessor halted unexpectedly.");
            }
            this.f.b();
            this.s.setOnFrameAvailableListener(null);
            this.s = null;
            d();
        } catch (Throwable th3) {
            this.f.b();
            this.s.setOnFrameAvailableListener(null);
            this.s = null;
            d();
            throw th3;
        }
    }
}
