#include <jni.h>
#include <stdio.h>
#include "org_zy_jni_HelloJNI.h"

JNIEXPORT void JNICALL Java_org_zy_jni_HelloJNI_sayHello(JNIEnv *, jobject) {
    printf("Hello JNI!\n");
    return;
}
