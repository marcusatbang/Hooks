package hooks

import Imports._

//  A hook that approves or rejects a value
object GuardHook {
  def apply[T]() = new GuardHook0[T]()
  def apply[T, S]() = new GuardHook[T, S]()

  object standalone {
    //def apply[T]() = new StandaloneGuardHook0(new GuardHook0[T]())
    def apply[T, S]() = new StandaloneGuardHook(new GuardHook[T, S]())
  }
}

class GuardHook[T, S]() extends Hook[(T, S) => Boolean]() {
  def hook(f: (T, S) => Boolean)(implicit d: D1): Unit = _register(new Adaptor2(f).guard _)
  def hook(f: (T) => Boolean)(implicit d: D2): Unit = _register(new Adaptor3(f).guard _)

  class Adaptor2(f: (T, S) => Boolean) { def guard(v: T, s: S) = f(v,s) }
  class Adaptor3(f: (T) => Boolean) { def guard(v: T, s: S) = f(v) }

  def guards = _get
  def apply(value: T, extra: S): Boolean = {
    val guards = this.guards
    guards.isEmpty || guards.forall(g => g(value, extra))
  }
  def apply(values: Seq[T], extra: S): Seq[T] = values.filter(v => this(v, extra))
  def apply(values: Option[T], extra: S): Option[T] = values.filter(v => this(v, extra))
  def apply(values: List[T], extra: S): List[T] = values.filter(v => this(v, extra))
}

class GuardHook0[T]() extends GuardHook[T, Nil.type]() {
  def apply(value: T): Boolean = apply(value, Nil)
  def apply(values: Seq[T]): Seq[T] = values.filter(v => this(v))
  def apply(values: Option[T]): Option[T] = values.filter(v => this(v))
  def apply(values: List[T]): List[T] = values.filter(v => this(v))
}

class StandaloneGuardHook[T, S](base: GuardHook[T, S]) extends StandaloneHook(base) {
  def hook(f: (T, S) => Boolean)(implicit d: D1) = standalone { base.hook(f) }
  def hook(f: (T) => Boolean)(implicit d: D2) = standalone { base.hook(f) }

  def guards = standalone { base.guards }
  def apply(value: T, extra: S) = standalone { base(value, extra) }
  def apply(values: Seq[T], extra: S): Seq[T] = values.filter(v => this(v, extra))
  def apply(values: Option[T], extra: S): Option[T] = values.filter(v => this(v, extra))
  def apply(values: List[T], extra: S): List[T] = values.filter(v => this(v, extra))
}

class StandaloneGuardHook0[T](base: GuardHook0[T]) extends StandaloneGuardHook(base) {
  def apply(value: T) = standalone { base(value) }
  def apply(values: Seq[T]) = standalone { base(values) }
  def apply(values: Option[T]) = standalone { base(values) }
  def apply(values: List[T]) = standalone { base(values) }
}

