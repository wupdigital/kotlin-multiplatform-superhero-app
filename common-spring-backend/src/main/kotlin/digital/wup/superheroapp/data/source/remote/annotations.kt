package digital.wup.superheroapp.data.source.remote

import org.springframework.core.annotation.AliasFor
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.ResponseStatus

actual typealias GET = GetMethod
actual typealias Path = PathParam

@Target(AnnotationTarget.FUNCTION)
@Retention(AnnotationRetention.RUNTIME)
@MustBeDocumented
@RequestMapping(method = [RequestMethod.GET])
@ResponseStatus(HttpStatus.OK)
annotation class GetMethod(@get:AliasFor(annotation = RequestMapping::class, attribute = "value") val value: String = "")

@Target(AnnotationTarget.TYPE_PARAMETER, AnnotationTarget.VALUE_PARAMETER)
@Retention(AnnotationRetention.RUNTIME)
@MustBeDocumented
annotation class PathParam(@get:AliasFor(annotation = PathVariable::class, attribute = "value") val value: String, val encoded: Boolean = false)