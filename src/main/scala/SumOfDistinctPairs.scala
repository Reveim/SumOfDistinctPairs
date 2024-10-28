import scala.util.Random

object SumOfDistinctPairs extends App {
  //Число меньше которого пары
  val N = 10
  //Кол-во элемнтов в списке
  val numElements = 4

  //Генерация списока случайных чисел меньше N
  val randomNumbers: List[Int] = List.fill(numElements)(Random.nextInt(N - 1) + 1)

  println(s"Список чисел меньше $N: $randomNumbers")

  //Генерерация пар неодиноковых чисел
  val pairs: List[(Int, Int)] = for {
    x <- randomNumbers
    y <- randomNumbers
    if x != y
  } yield (x, y)

  println(s"Пары неодинаковых чисел: $pairs")

  val sumOfPairs: Int = pairs.map { case (a, b) => a + b }.sum

  println(s"Сумма всех пар неодинаковых чисел меньше $N: $sumOfPairs")
}


