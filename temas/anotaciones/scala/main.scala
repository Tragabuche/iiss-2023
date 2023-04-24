object Main extends App {
  val miLista = Lista(1, 2, 3)
  println(miLista.cabeza) // 1
  println(miLista.cola.cabeza) // 2
  println(miLista.cola.cola.cabeza) // 3
}
