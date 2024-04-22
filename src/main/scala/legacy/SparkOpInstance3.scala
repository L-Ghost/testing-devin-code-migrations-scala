package legacy
import org.apache.spark.sql.SparkSession
import org.apache.spark.sql.DataFrame
import legacy.{Metadata, RunConfigurations}
import legacy.SparkOp

object SparkOpInstance3 extends SparkOp {
  val randomValue: Int = 6243 // Hardcoded random value

  override def name: String = "SparkOpInstance3"
  override def inputs: Set[String] = Set(SparkOpInstance2.name) // Reference to SparkOpInstance2 as an input using object name
  override def query(inputs: Map[String, DataFrame]): DataFrame = {
    // Using randomValue from SparkOpInstance2 as instructed
    val _ = SparkOpInstance2.randomValue
    SparkSession.builder().getOrCreate().emptyDataFrame
  }
  override def metadata: Metadata = {
    new Metadata()
  }
  override def runConfigurations: RunConfigurations = {
    new RunConfigurations()
  }
}
