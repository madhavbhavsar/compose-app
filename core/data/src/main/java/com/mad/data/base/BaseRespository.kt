package com.mad.data.base

import com.apollographql.apollo3.api.ApolloResponse
import com.apollographql.apollo3.api.Operation

open class BaseRespository {


    suspend fun <T : Operation.Data> graphQlApiCall(call: suspend () -> ApolloResponse<T>): ApolloResponse<T> {
        return call.invoke()
    }
//        try {
//            val response = call.invoke()
//            when {
//                response == null -> {
////                    return ResponseHandler.OnFailed(
////                        code = HttpErrorCode.BAD_RESPONSE.code,
////                        message = HttpErrorCode.BAD_RESPONSE.message,
////                        messageCode = null,
////                    )
//                }
//
//                response.hasErrors() -> {
//
////                    val errorModel = HttpCommonMethod.getErrorMessageForGraph(
////                        response.errors
////                    )
////
////                    //                val error = response.errors?.let { GraphQLErrors(it) }
////                    //                Log.i("madmad", "onLoginApi: here2")
////                    return ResponseHandler.OnFailed(
////                        code = errorModel.first,
////                        message = errorModel.second,
////                        messageCode = errorModel.third,
////                    )
//                }
//
//                else -> {
//                    return response
////                    return ResponseHandler.OnSuccessResponse(response)
//                }
//            }
//
//        } catch (e: java.lang.Exception) {
//            when (e) {
////                is ApolloNetworkException -> {
////                    return ResponseHandler.OnFailed(
////                        code = HttpErrorCode.NO_CONNECTION.code,
////                        message = HttpErrorCode.NO_CONNECTION.message,
////                        messageCode = null,
////                    )
////                }
////
////                is ApolloHttpException -> {
////                    return ResponseHandler.OnFailed(
////                        code = HttpErrorCode.BAD_RESPONSE.code,
////                        message = e.message,
////                        messageCode = null,
////                    )
////                }
////
////                else -> {
////                    return ResponseHandler.OnFailed(
////                        code = HttpErrorCode.BAD_RESPONSE.code,
////                        message = e.message,
////                        messageCode = null,
////                    )
////                }
//
//            }
//        }
//
//    }

}