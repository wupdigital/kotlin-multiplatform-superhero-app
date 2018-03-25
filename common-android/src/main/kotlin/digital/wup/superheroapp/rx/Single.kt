package digital.wup.superheroapp.rx

actual typealias Single<T> = io.reactivex.Single<T>

actual fun <T> singleJust(item: T): Single<T> = Single.just(item)