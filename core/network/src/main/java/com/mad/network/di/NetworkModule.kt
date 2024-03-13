package com.mad.network.di

import com.mad.network.network.AuthorizationInterceptor
import com.mad.network.network.HttpHandleIntercept
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient

@Module
@InstallIn(SingletonComponent::class)
class NetworkModule {


    @Provides
    fun provideHttpHandleIntercept(): HttpHandleIntercept =
        HttpHandleIntercept()

    @Provides
    fun provideHAuthIntercept(): AuthorizationInterceptor = AuthorizationInterceptor()


//    @Provides
//    fun getOkHttpClient(
//        httpHandleIntercept: HttpHandleIntercept,
//        authorizationInterceptor: AuthorizationInterceptor
//    ): OkHttpClient {
////        val logging = HttpLoggingInterceptor()
////        if (BuildConfig.DEBUG) logging.level = HttpLoggingInterceptor.Level.BODY
//        val builder = OkHttpClient.Builder()
//        builder.addInterceptor(logging)
//        builder.readTimeout(60, TimeUnit.SECONDS)
//            .connectTimeout(60, TimeUnit.SECONDS)
//            .addInterceptor(httpHandleIntercept)
//            .addInterceptor(authorizationInterceptor)
//            .build()
//
//        return builder.build()
//    }


//    @Provides
//    fun getApolloClient(okHttpClient: OkHttpClient): ApolloClient {
//        return ApolloClient.Builder()
//            .serverUrl("https://vmeapi.demo.brainvire.dev/graphql")
//            .okHttpClient(okHttpClient)
//            .build()
//    }

}
