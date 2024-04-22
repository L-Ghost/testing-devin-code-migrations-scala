package legacy
import org.apache.spark.sql.SparkSession
import org.apache.spark.sql.DataFrame
import platform.common_classes.{Metadata, RunConfigurations}
import legacy.SparkOp

object SparkOpInstance5 extends SparkOp {
  val randomValue: Int = 2753 // Hardcoded random value

  override def name: String = "SparkOpInstance5"
  override def inputs: Set[String] = Set(SparkOpInstance4.name) // Reference to SparkOpInstance4 as an input using object name
  override def query(inputs: Map[String, DataFrame]): DataFrame = {
    // Using randomValue from SparkOpInstance4 as instructed
    val _ = SparkOpInstance4.randomValue
    SparkSession.builder().getOrCreate().emptyDataFrame
  }
  override def metadata: Metadata = {
    new Metadata()
  }
  override def runConfigurations: RunConfigurations = {
    new RunConfigurations()
  }
}
