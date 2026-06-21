import org.apache.spark.sql.functions._

val messages = kafkaDF.selectExpr("CAST(value AS STRING)")

val parsedDF = messages
.withColumn("parts", split(col("value"), ","))

val finalDF = parsedDF
.withColumn("user_id", col("parts")(0))
.withColumn("session_id", col("parts")(1))
.withColumn("url", col("parts")(2))
.withColumn("page_load_time", col("parts")(3).cast("int"))
.withColumn("transaction", col("parts")(4).cast("int"))
.withColumn("error_code", col("parts")(5))
.drop("parts","value")
