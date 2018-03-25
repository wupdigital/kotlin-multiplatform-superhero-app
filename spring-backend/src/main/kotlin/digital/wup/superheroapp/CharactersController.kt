package digital.wup.superheroapp

import digital.wup.superheroapp.data.source.remote.CharactersApi
import digital.wup.superheroapp.data.source.remote.CharactersMockApi
import digital.wup.superheroapp.domain.model.Character
import digital.wup.superheroapp.rx.Single
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class CharactersController : CharactersApi {

    private val facade = CharactersMockApi()

    @GetMapping("/characters")
    override fun getCharacters(): Single<List<Character>> = facade.getCharacters()

    @GetMapping("/characters/{id}")
    override fun getCharacterById(@PathVariable("id") characterId: String) = facade.getCharacterById(characterId)
}