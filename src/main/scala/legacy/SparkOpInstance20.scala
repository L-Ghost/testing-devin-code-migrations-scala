package legacy
import org.apache.spark.sql.{DataFrame, SparkSession}
import platform.common_classes.{Metadata, RunConfigurations}

class SparkOpInstance20 extends SparkOp {
  val randomValue: Int = 9537 // Hardcoded random value

  override def name: String = "dataset/spark-op-instance-20"
  override def inputs: Set[String] = Set(SparkOpInstance19.name) // Reference to SparkOpInstance19 as an input using object name
  override def query(inputs: Map[String, DataFrame]): DataFrame = {
    SparkSession.builder().getOrCreate().emptyDataFrame
  }
  override def metadata: Metadata = new Metadata()
  override def runConfigurations: RunConfigurations = new RunConfigurations()
}

object SparkOpInstance20 {
  val randomValue: Int = new SparkOpInstance20().randomValue
  def apply(): SparkOp = new SparkOpInstance20()
}
