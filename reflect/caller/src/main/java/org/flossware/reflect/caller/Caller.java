package org.flossware.reflect.caller;

import org.flossware.reflect.call.Call;

/**
 *
 * Interface defines the API for executing the call on an object.
 *
 * @author sfloess
 *
 * @param <V> the type of the value to associate with a call.
 *
 */
public interface Caller<V> {

    /**
     * Will execute the actual call.
     *
     * @param call the call to make.
     *
     * @return the result from the call.
     */
    Object executeCall(Call<V> call);
}
