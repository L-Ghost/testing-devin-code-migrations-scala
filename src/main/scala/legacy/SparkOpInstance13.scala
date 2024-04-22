package legacy
import org.apache.spark.sql.SparkSession
import org.apache.spark.sql.DataFrame
import platform.common_classes.{Metadata, RunConfigurations}
import legacy.SparkOp

object SparkOpInstance13 extends SparkOp {
  val randomValue: Int = 7854 // Hardcoded random value

  override def name: String = "nu-br/dataset/spark-op-instance-13"
  override def inputs: Set[String] = Set(SparkOpInstance12.name) // Reference to SparkOpInstance12 as an input using object name
  override def query(spark: SparkSession): DataFrame = {
    // Using randomValue from SparkOpInstance12 as instructed
    val _ = SparkOpInstance12.randomValue
    spark.emptyDataFrame
  }
  override def metadata: Metadata = {
    new Metadata()
  }
  override def runConfigurations: RunConfigurations = {
    new RunConfigurations()
  }
}
