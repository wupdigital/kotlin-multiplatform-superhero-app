package digital.wup.superheroapp.data.source.remote

import digital.wup.superheroapp.domain.model.Character
import digital.wup.superheroapp.rx.Single

interface CharactersApi {

    @GET("/characters")
    fun getCharacters(): Single<List<Character>>

    @GET("/characters/{id}")
    fun getCharacterById(@Path("id") characterId: String): Single<Character>
}