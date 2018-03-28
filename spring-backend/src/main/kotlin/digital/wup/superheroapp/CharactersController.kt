package digital.wup.superheroapp

import digital.wup.superheroapp.api.CharactersApi
import digital.wup.superheroapp.api.CharactersMockApi

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class CharactersController : CharactersApi {

    private val facade = CharactersMockApi()

    @GetMapping("/characters")
    override fun getCharacters() = facade.getCharacters()

    @GetMapping("/characters/{id}")
    override fun getCharacterById(@PathVariable("id") characterId: String) = facade.getCharacterById(characterId)
}