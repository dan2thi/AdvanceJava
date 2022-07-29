package functions.tri;

/*
    This is a custom interface (i.e not provided by java) to support functions with 3 arguments with a return type
 */
@FunctionalInterface
public interface TriFunction<T, U, V, R> {

    R apply(T t, U u, V v);

}
