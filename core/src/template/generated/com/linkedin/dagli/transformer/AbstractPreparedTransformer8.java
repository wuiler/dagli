// AUTOGENERATED CODE.  DO NOT MODIFY DIRECTLY!  Instead, please modify the transformer/AbstractPreparedTransformerX.ftl file.
// See the README in the module's src/template directory for details.
package com.linkedin.dagli.transformer;

import com.linkedin.dagli.producer.Producer;
import com.linkedin.dagli.transformer.internal.PreparedTransformer8InternalAPI;


/**
 * Base class for prepared transformers of arity 8 that do not cache temporary data during execution and do not
 * minibatch their inputs (transformers that do so should instead derive from
 * {@link AbstractPreparedStatefulTransformer8}.)
 *
 * @param <A> the type of the first input to the transformer
 * @param <B> the type of the second input to the transformer
 * @param <C> the type of the third input to the transformer
 * @param <D> the type of the fourth input to the transformer
 * @param <E> the type of the fifth input to the transformer
 * @param <F> the type of the sixth input to the transformer
 * @param <G> the type of the seventh input to the transformer
 * @param <H> the type of the eighth input to the transformer
 * @param <R> the type of result produced by the transformer
 * @param <S> the ultimate derived class
 */
public abstract class AbstractPreparedTransformer8<A, B, C, D, E, F, G, H, R, S extends AbstractPreparedTransformer8<A, B, C, D, E, F, G, H, R, S>>
    extends
    AbstractTransformer8<A, B, C, D, E, F, G, H, R, PreparedTransformer8InternalAPI<A, B, C, D, E, F, G, H, R, S>, S>
    implements PreparedTransformer8<A, B, C, D, E, F, G, H, R> {

  private static final long serialVersionUID = 1;

  public AbstractPreparedTransformer8() {
    super();
  }

  @Override
  public PreparedTransformer8InternalAPI<A, B, C, D, E, F, G, H, R, S> internalAPI() {
    return (PreparedTransformer8InternalAPI<A, B, C, D, E, F, G, H, R, S>) super.internalAPI();
  }

  @Override
  protected PreparedTransformer8InternalAPI<A, B, C, D, E, F, G, H, R, S> createInternalAPI() {
    return new InternalAPI();
  }

  protected class InternalAPI
      extends
      AbstractTransformer8<A, B, C, D, E, F, G, H, R, PreparedTransformer8InternalAPI<A, B, C, D, E, F, G, H, R, S>, S>.InternalAPI
      implements PreparedTransformer8InternalAPI<A, B, C, D, E, F, G, H, R, S> {
    @Override
    public R apply(Object executionCache, A value1, B value2, C value3, D value4, E value5, F value6, G value7, H value8) {
      return AbstractPreparedTransformer8.this.apply(value1, value2, value3, value4, value5, value6, value7, value8);
    }
  }

  public AbstractPreparedTransformer8(Producer<? extends A> input1, Producer<? extends B> input2,
      Producer<? extends C> input3, Producer<? extends D> input4, Producer<? extends E> input5,
      Producer<? extends F> input6, Producer<? extends G> input7, Producer<? extends H> input8) {
    super(input1, input2, input3, input4, input5, input6, input7, input8);
  }
}
