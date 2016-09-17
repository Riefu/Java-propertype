package actual;

import jdk.nashorn.internal.objects.annotations.Function;

/**
 * Created by Administrator on 2016/9/16.
 */
@FunctionalInterface
public interface FunctionInterface<T> {

    void  test(T t);
}
