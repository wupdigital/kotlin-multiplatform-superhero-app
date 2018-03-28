package digital.wup.superheroapp.data.source

import digital.wup.superheroapp.domain.model.Character
import digital.wup.superheroapp.rx.Completable
import digital.wup.superheroapp.rx.Single

interface CharactersDataSource {
    fun getCharacters(): Single<List<Character>>

    fun getCharacterById(characterId: String): Single<Character>

    fun saveCharacters(characters: List<Character>): Completable
}