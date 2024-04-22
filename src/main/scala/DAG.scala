import legacy.SparkOp

object DAG {
  val ops: Set[SparkOp] = Set(
    legacy.SparkOpInstance1,
    legacy.SparkOpInstance2,
    legacy.SparkOpInstance3,
    legacy.SparkOpInstance4,
    legacy.SparkOpInstance5,
    legacy.SparkOpInstance6,
    legacy.SparkOpInstance7.apply(),
    legacy.SparkOpInstance8.apply(),
    legacy.SparkOpInstance9.apply(),
    legacy.SparkOpInstance10.apply(),
    legacy.SparkOpInstance11.apply(),
    legacy.SparkOpInstance12.apply(),
    legacy.SparkOpInstance13.apply(),
    legacy.SparkOpInstance14.apply(),
    legacy.SparkOpInstance15.apply(),
    legacy.SparkOpInstance16.apply(),
    legacy.SparkOpInstance17.apply(),
    legacy.SparkOpInstance18.apply(),
    legacy.SparkOpInstance19.apply(),
    legacy.SparkOpInstance20.apply(),
    legacy.SparkOpInstance21.apply(),
    legacy.SparkOpInstance22.apply(),
    legacy.SparkOpInstance23.apply()
  )
}
