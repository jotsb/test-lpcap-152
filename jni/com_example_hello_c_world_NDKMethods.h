/* Header for class com_example_hello_c_world_NDKMethods */
#include <jni.h>
#include <android/log.h>

#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <ctype.h>
#include <unistd.h>
#include <time.h>
#include <signal.h>
#include <ctype.h>

#include <pthread.h>

/*
#include <netinet/tcp.h>
#include <sys/types.h>
#include <netinet/in.h>
*/

#include <netinet/ip.h>
#include <arpa/inet.h>
#include <sys/socket.h>


#include <pcap.h>


#ifndef _Included_com_example_hello_c_world_NDKMethods
#define _Included_com_example_hello_c_world_NDKMethods
#ifdef __cplusplus
extern "C" {
#endif
/*
 * Class:     com_example_hello_c_world_NDKMethods
 * Method:    set_msg
 * Signature: (Ljava/lang/String;)Ljava/lang/String;
 */
JNIEXPORT jstring JNICALL Java_com_example_hello_1c_1world_NDKMethods_set_1msg
  (JNIEnv *, jclass, jstring);

#ifdef __cplusplus
}
#endif
#endif
