package digital.wup.superheroapp.api

import digital.wup.superheroapp.domain.model.Character
import digital.wup.superheroapp.rx.Single
import digital.wup.superheroapp.rx.singleJust

class CharactersMockApi : CharactersApi {

    companion object {
        private const val mockImageUrl = "https://www.google.hu/url?sa=i&rct=j&q=&esrc=s&source=images&cd=&cad=rja&uact=8&ved=2ahUKEwix8cyprP7ZAhWGLlAKHcj6DpkQjRx6BAgAEAU&url=http%3A%2F%2Fwww.followingthenerd.com%2Ftoyscollectibles%2Fsquare-enix-makes-over-iron-man-ninja-style%2F&psig=AOvVaw1PKFDIv-FFREdnOWly_sEj&ust=1521753656647165"
    }

    override fun getCharacters(): Single<List<Character>> = singleJust(listOf(mockCharacter()))

    override fun getCharacterById(characterId: String): Single<Character> = singleJust(mockCharacter())

    private fun mockCharacter(): Character = Character("1", "Iron Man", mockImageUrl)
}