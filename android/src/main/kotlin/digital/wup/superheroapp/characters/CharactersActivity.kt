package digital.wup.superheroapp.characters

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.jakewharton.retrofit2.converter.kotlinx.serialization.stringBased
import digital.wup.superheroapp.R
import digital.wup.superheroapp.data.source.remote.CharactersApi
import kotlinx.serialization.json.JSON
import okhttp3.MediaType
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory

class CharactersActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val contentType = MediaType.parse("application/json")!!
        val json = JSON
        val retrofit = Retrofit.Builder().baseUrl("http://test.hu/")
                .addCallAdapterFactory(RxJava2CallAdapterFactory.createAsync())
                .addConverterFactory(stringBased(contentType, json::parse, json::stringify))
                .build()

        val dataSource = retrofit.create(CharactersApi::class.java)
    }
}
