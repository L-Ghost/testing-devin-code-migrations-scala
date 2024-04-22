package legacy

import org.apache.spark.sql.{DataFrame, SparkSession}

trait SparkOp {
  def query(spark: SparkSession): DataFrame
}
