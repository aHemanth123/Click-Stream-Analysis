val kafkaDF = spark.readStream
  .format("kafka")
  .option("kafka.bootstrap.servers","localhost:9092")
  .option("subscribe","clickstreamdata")
  .option("startingOffsets","earliest")
  .load()
