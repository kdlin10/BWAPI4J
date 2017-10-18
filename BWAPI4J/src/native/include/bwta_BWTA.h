/* DO NOT EDIT THIS FILE - it is machine generated */
#include <jni.h>
/* Header for class bwta_BWTA */

#ifndef _Included_bwta_BWTA
#define _Included_bwta_BWTA
#ifdef __cplusplus
extern "C" {
#endif
/*
 * Class:     bwta_BWTA
 * Method:    analyze
 * Signature: (Lbwta/BWTA;)V
 */
JNIEXPORT void JNICALL Java_bwta_BWTA_analyze
  (JNIEnv *, jobject, jobject);

/*
 * Class:     bwta_BWTA
 * Method:    computeDistanceTransform
 * Signature: ()V
 */
JNIEXPORT void JNICALL Java_bwta_BWTA_computeDistanceTransform
  (JNIEnv *, jobject);

/*
 * Class:     bwta_BWTA
 * Method:    balanceAnalysis
 * Signature: ()V
 */
JNIEXPORT void JNICALL Java_bwta_BWTA_balanceAnalysis
  (JNIEnv *, jobject);

/*
 * Class:     bwta_BWTA
 * Method:    cleanMemory
 * Signature: ()V
 */
JNIEXPORT void JNICALL Java_bwta_BWTA_cleanMemory
  (JNIEnv *, jobject);

/*
 * Class:     bwta_BWTA
 * Method:    getRegionT
 * Signature: (II)J
 */
JNIEXPORT jlong JNICALL Java_bwta_BWTA_getRegionT
  (JNIEnv *, jobject, jint, jint);

/*
 * Class:     bwta_BWTA
 * Method:    getRegionP
 * Signature: (II)J
 */
JNIEXPORT jlong JNICALL Java_bwta_BWTA_getRegionP
  (JNIEnv *, jobject, jint, jint);

/*
 * Class:     bwta_BWTA
 * Method:    getGroundDistance
 * Signature: (IIII)D
 */
JNIEXPORT jdouble JNICALL Java_bwta_BWTA_getGroundDistance
  (JNIEnv *, jobject, jint, jint, jint, jint);

/*
 * Class:     bwta_BWTA
 * Method:    isConnected
 * Signature: (IIII)Z
 */
JNIEXPORT jboolean JNICALL Java_bwta_BWTA_isConnected
  (JNIEnv *, jobject, jint, jint, jint, jint);

/*
 * Class:     bwta_BWTA
 * Method:    getShortestPath
 * Signature: (IIII)Ljava/util/List;
 */
JNIEXPORT jobject JNICALL Java_bwta_BWTA_getShortestPath
  (JNIEnv *, jobject, jint, jint, jint, jint);

#ifdef __cplusplus
}
#endif
#endif
