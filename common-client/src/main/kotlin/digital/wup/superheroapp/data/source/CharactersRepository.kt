package digital.wup.superheroapp.data.source

import digital.wup.superheroapp.domain.model.Character
import digital.wup.superheroapp.rx.Completable
import digital.wup.superheroapp.rx.Single

class CharactersRepository(
    val localCharactersDataSource: CharactersDataSource,
    val remoteCharactersDataSource: CharactersDataSource
) : CharactersDataSource {

    override fun getCharacters(): Single<List<Character>> {
        TODO("not implemented")
    }

    override fun getCharacterById(characterId: String): Single<Character> {
        TODO("not implemented")
    }

    override fun saveCharacters(characters: List<Character>): Completable {
        TODO("not implemented")
    }
}