sealed trait Lista[+A] {
  def cabeza: A
  def cola: Lista[A]
  def isEmpty: Boolean
  def ::[B >: A](elem: B): Lista[B] = Cons(elem, this)
}

case object Nil extends Lista[Nothing] {
  def cabeza: Nothing = throw new NoSuchElementException("Nil.cabeza")
  def cola: Lista[Nothing] = throw new UnsupportedOperationException("Nil.cola")
  def isEmpty: Boolean = true
}

case class Cons[+A](cabeza: A, cola: Lista[A]) extends Lista[A] {
  def isEmpty: Boolean = false
}

object Lista {
  def apply[A](elems: A*): Lista[A] = {
    if (elems.isEmpty) Nil
    else Cons(elems.head, apply(elems.tail: _*))
  }
}