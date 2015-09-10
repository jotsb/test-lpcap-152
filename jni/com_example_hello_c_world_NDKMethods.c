/* Header for class com_example_hello_c_world_NDKMethods */
#include "com_example_hello_c_world_NDKMethods.h"

#define DEBUG_TAG "Sample_LIBPCAP_DEBUGGING"

/*
 * Class:     com_example_hello_c_world_NDKMethods
 * Method:    set_msg
 * Signature: (Ljava/lang/String;)Ljava/lang/String;
 */
JNIEXPORT jstring JNICALL Java_com_example_hello_1c_1world_NDKMethods_set_1msg(
		JNIEnv *env, jclass class, jstring javaString) {

	const char *str = (*env)->GetStringUTFChars(env, javaString, NULL);

	return (*env)->NewStringUTF(env, str);
}
