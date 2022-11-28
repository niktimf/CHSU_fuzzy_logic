//import pprint.PPrinter.BlackWhite.pprintln

object Main:
    def main(args: Array[String]): Unit =
        def multMatrixMinMax(matrix1: Seq[Seq[Double]], matrix2: Seq[Seq[Double]]): Seq[Seq[Double]] =
            for m2Row <- matrix2 yield for m1Col <- matrix1.transpose yield m1Col.lazyZip(m2Row).map(_ min _).max

        val matrix = Vector[Double](1, 2, 3, 5, 1,
                                           4, 5, 6, 3, 3,
                                           7, 8, 9, 9, 2,
                                           4, 2, 6, 1, 4,
                                           4, 2, 6, 1, 9
        ).grouped(5).to(Vector)
        println(multMatrixMinMax(matrix, matrix))










