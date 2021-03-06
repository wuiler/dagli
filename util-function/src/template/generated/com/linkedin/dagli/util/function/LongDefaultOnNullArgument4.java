// AUTOGENERATED CODE.  DO NOT MODIFY DIRECTLY!  Instead, please modify the util/function/DefaultOnNullArgument.ftl file.
// See the README in the module's src/template directory for details.
package com.linkedin.dagli.util.function;

import com.linkedin.dagli.util.named.Named;
import java.util.Objects;


/**
 * A function class implementing LongFunction4.Serializable<A, B, C, D> that returns 0 if any of
 * the function's inputs are null.
 */
class LongDefaultOnNullArgument4<A, B, C, D> implements LongFunction4.Serializable<A, B, C, D>, Named {
  private static final long serialVersionUID = 1;
  private static final int CLASS_HASH = LongDefaultOnNullArgument4.class.hashCode();
  private final LongFunction4<A, B, C, D> _wrapped;

  LongDefaultOnNullArgument4(LongFunction4<A, B, C, D> wrapped) {
    // stacking this wrapper multiple times should be idempotent:
    if (wrapped instanceof LongDefaultOnNullArgument4) {
      _wrapped = ((LongDefaultOnNullArgument4) wrapped)._wrapped;
    } else {
      _wrapped = Objects.requireNonNull(wrapped);
    }
  }

  @Override
  public LongDefaultOnNullArgument4<A, B, C, D> safelySerializable() {
    return new LongDefaultOnNullArgument4<>(((LongFunction4.Serializable<A, B, C, D>) _wrapped).safelySerializable());
  }

  @Override
  public long apply(A value1, B value2, C value3, D value4) {
    if (value1 == null || value2 == null || value3 == null || value4 == null) {
      return 0;
    }
    return _wrapped.apply(value1, value2, value3, value4);
  }

  @Override
  public int hashCode() {
    return CLASS_HASH + _wrapped.hashCode();
  }

  @Override
  public boolean equals(Object obj) {
    if (obj instanceof LongDefaultOnNullArgument4) {
      return this._wrapped.equals(((LongDefaultOnNullArgument4) obj)._wrapped);
    }
    return false;
  }

  @Override
  public String toString() {
    return "arg == null ? 0 : " + Named.getName(_wrapped);
  }

  @Override
  public String getShortName() {
    return "arg == null ? 0 : " + Named.getShortName(_wrapped);
  }
}
