package object_oriented_kotlin.annotations

@Target(
    AnnotationTarget.VALUE_PARAMETER,
    AnnotationTarget.PROPERTY_GETTER,
    AnnotationTarget.FIELD
)
@Retention(AnnotationRetention.RUNTIME)
@MustBeDocumented
annotation class Beta

class ExampleTarget (
    @field:Beta val firstName: String,
    @get:Beta val midName: String,
    @param:Beta val lastName: String
)