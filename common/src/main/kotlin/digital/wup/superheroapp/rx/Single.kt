package digital.wup.superheroapp.rx

expect abstract class Single<T>

expect fun <T> singleJust(item: T): Single<T>