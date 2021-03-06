// AUTOGENERATED CODE.  DO NOT MODIFY DIRECTLY!  Instead, please modify the tuple/TupleX.ftl file.
// See the README in the module's src/template directory for details.
package com.linkedin.dagli.tuple;

import java.util.Iterator;


/**
 * An ordered sequence of 9 elements.
 */
public interface Tuple9<A, B, C, D, E, F, G, H, I> extends Tuple, TupleValue0<A>, TupleValue1<B>, TupleValue2<C>,
    TupleValue3<D>, TupleValue4<E>, TupleValue5<F>, TupleValue6<G>, TupleValue7<H>, TupleValue8<I> {
  /**
   * Gets element 0 from the tuple
   *
   * @return the element value
   */
  @Override
  A get0();

  /**
   * Gets a new tuple containing the same elements as this tuple except for element 0, which will be set to the
    provided value.
   *
   * @param value the value that should replace element 0 in the new tuple
   * @return a new tuple with the same elements as this one, but with element 0 replaced with a new value
   */
  default <Z> Tuple9<Z, B, C, D, E, F, G, H, I> withValue0(Z value) {
    return of(value, get1(), get2(), get3(), get4(), get5(), get6(), get7(), get8());
  }

  /**
   * Gets element 1 from the tuple
   *
   * @return the element value
   */
  @Override
  B get1();

  /**
   * Gets a new tuple containing the same elements as this tuple except for element 1, which will be set to the
    provided value.
   *
   * @param value the value that should replace element 1 in the new tuple
   * @return a new tuple with the same elements as this one, but with element 1 replaced with a new value
   */
  default <Z> Tuple9<A, Z, C, D, E, F, G, H, I> withValue1(Z value) {
    return of(get0(), value, get2(), get3(), get4(), get5(), get6(), get7(), get8());
  }

  /**
   * Gets element 2 from the tuple
   *
   * @return the element value
   */
  @Override
  C get2();

  /**
   * Gets a new tuple containing the same elements as this tuple except for element 2, which will be set to the
    provided value.
   *
   * @param value the value that should replace element 2 in the new tuple
   * @return a new tuple with the same elements as this one, but with element 2 replaced with a new value
   */
  default <Z> Tuple9<A, B, Z, D, E, F, G, H, I> withValue2(Z value) {
    return of(get0(), get1(), value, get3(), get4(), get5(), get6(), get7(), get8());
  }

  /**
   * Gets element 3 from the tuple
   *
   * @return the element value
   */
  @Override
  D get3();

  /**
   * Gets a new tuple containing the same elements as this tuple except for element 3, which will be set to the
    provided value.
   *
   * @param value the value that should replace element 3 in the new tuple
   * @return a new tuple with the same elements as this one, but with element 3 replaced with a new value
   */
  default <Z> Tuple9<A, B, C, Z, E, F, G, H, I> withValue3(Z value) {
    return of(get0(), get1(), get2(), value, get4(), get5(), get6(), get7(), get8());
  }

  /**
   * Gets element 4 from the tuple
   *
   * @return the element value
   */
  @Override
  E get4();

  /**
   * Gets a new tuple containing the same elements as this tuple except for element 4, which will be set to the
    provided value.
   *
   * @param value the value that should replace element 4 in the new tuple
   * @return a new tuple with the same elements as this one, but with element 4 replaced with a new value
   */
  default <Z> Tuple9<A, B, C, D, Z, F, G, H, I> withValue4(Z value) {
    return of(get0(), get1(), get2(), get3(), value, get5(), get6(), get7(), get8());
  }

  /**
   * Gets element 5 from the tuple
   *
   * @return the element value
   */
  @Override
  F get5();

  /**
   * Gets a new tuple containing the same elements as this tuple except for element 5, which will be set to the
    provided value.
   *
   * @param value the value that should replace element 5 in the new tuple
   * @return a new tuple with the same elements as this one, but with element 5 replaced with a new value
   */
  default <Z> Tuple9<A, B, C, D, E, Z, G, H, I> withValue5(Z value) {
    return of(get0(), get1(), get2(), get3(), get4(), value, get6(), get7(), get8());
  }

  /**
   * Gets element 6 from the tuple
   *
   * @return the element value
   */
  @Override
  G get6();

  /**
   * Gets a new tuple containing the same elements as this tuple except for element 6, which will be set to the
    provided value.
   *
   * @param value the value that should replace element 6 in the new tuple
   * @return a new tuple with the same elements as this one, but with element 6 replaced with a new value
   */
  default <Z> Tuple9<A, B, C, D, E, F, Z, H, I> withValue6(Z value) {
    return of(get0(), get1(), get2(), get3(), get4(), get5(), value, get7(), get8());
  }

  /**
   * Gets element 7 from the tuple
   *
   * @return the element value
   */
  @Override
  H get7();

  /**
   * Gets a new tuple containing the same elements as this tuple except for element 7, which will be set to the
    provided value.
   *
   * @param value the value that should replace element 7 in the new tuple
   * @return a new tuple with the same elements as this one, but with element 7 replaced with a new value
   */
  default <Z> Tuple9<A, B, C, D, E, F, G, Z, I> withValue7(Z value) {
    return of(get0(), get1(), get2(), get3(), get4(), get5(), get6(), value, get8());
  }

  /**
   * Gets element 8 from the tuple
   *
   * @return the element value
   */
  @Override
  I get8();

  /**
   * Gets a new tuple containing the same elements as this tuple except for element 8, which will be set to the
    provided value.
   *
   * @param value the value that should replace element 8 in the new tuple
   * @return a new tuple with the same elements as this one, but with element 8 replaced with a new value
   */
  default <Z> Tuple9<A, B, C, D, E, F, G, H, Z> withValue8(Z value) {
    return of(get0(), get1(), get2(), get3(), get4(), get5(), get6(), get7(), value);
  }

  /**
   * @return 9
   */
  @Override
  default int size() {
    return 9;
  }

  /**
   * Creates a new tuple that contains the given elements.
   *
   * @return a new tuple with the provided elements
   */
  static <A, B, C, D, E, F, G, H, I> Tuple9<A, B, C, D, E, F, G, H, I> of(A element0, B element1, C element2,
      D element3, E element4, F element5, G element6, H element7, I element8) {
    return new FieldTuple9<>(element0, element1, element2, element3, element4, element5, element6, element7, element8);
  }

  /**
   * Creates a new tuple that contains the given elements.  The tuple takes ownership of the provided array, which
   * should not be subsequently modified.  The array's length must be at least 9.
   *
   * This method is "unsafe" because the arrays values cannot be type-checked to ensure that they conform to their
   * purported types.
   *
   * @return a new tuple with the provided elements
   */
  static <A, B, C, D, E, F, G, H, I> Tuple9<A, B, C, D, E, F, G, H, I> fromArrayUnsafe(Object[] elements) {
    return new ArrayTuple9<>(elements);
  }

  /**
   * Creates a new tuple containing the first 9 elements of the provided iterable.
   *
   * This method is "unsafe" because the iterated values cannot be type-checked to ensure that they conform to their
   * purported types.
   *
   * @param elements the iterable containing the elements to copy into a new tuple.
   * @throws java.util.NoSuchElementException if there are fewer than 9 elements in the provided iterable.
   * @return a new tuple with the provided elements
   */
  static <A, B, C, D, E, F, G, H, I> Tuple9<A, B, C, D, E, F, G, H, I> fromIterableUnsafe(Iterable<?> elements) {
    Iterator<?> iterator = elements.iterator();
    if (iterator instanceof AutoCloseable) {
      try (AutoCloseable closeable = (AutoCloseable) iterator) {
        return fromIteratorUnsafe(iterator);
      } catch (RuntimeException e) {
        throw e; // rethrow unmodified
      } catch (Exception e) {
        // checked exceptions might be thrown when closing the iterator
        throw new RuntimeException(e);
      }
    }

    return fromIteratorUnsafe(elements.iterator());
  }

  /**
   * Creates a new tuple containing the first 9 elements of the provided iterator.
   *
   * This method is "unsafe" because the iterated values cannot be type-checked to ensure that they conform to their
   * purported types.
   *
   * @param elements the iterator containing the elements to copy into a new tuple.
   * @throws java.util.NoSuchElementException if there are fewer than 9 elements in the provided iterator.
   * @return a new tuple with the provided elements
   */
  @SuppressWarnings("unchecked")
  static <A, B, C, D, E, F, G, H, I> Tuple9<A, B, C, D, E, F, G, H, I> fromIteratorUnsafe(Iterator<?> elements) {
    return new FieldTuple9<A, B, C, D, E, F, G, H, I>((A) elements.next(), (B) elements.next(), (C) elements.next(),
        (D) elements.next(), (E) elements.next(), (F) elements.next(), (G) elements.next(), (H) elements.next(),
        (I) elements.next());
  }
}
