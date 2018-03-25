package digital.wup.superheroapp.di

import com.jakewharton.retrofit2.converter.kotlinx.serialization.stringBased
import kotlinx.serialization.json.JSON
import okhttp3.MediaType
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory

interface NetworkModule {

    fun retrofit(): Retrofit {
        val contentType = MediaType.parse("application/json")!!
        val json = JSON

        return Retrofit.Builder()
                .addCallAdapterFactory(RxJava2CallAdapterFactory.createAsync())
                .addConverterFactory(stringBased(contentType, json::parse, json::stringify))
                .client(okHttpClient())
                .build()
    }

    fun okHttpClient(): OkHttpClient = OkHttpClient.Builder().build()
}