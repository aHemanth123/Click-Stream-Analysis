# Real-Time Clickstream Analytics Pipeline

## Overview

Built an end-to-end real-time clickstream analytics pipeline using Java, Apache Kafka, Apache Spark Structured Streaming, MySQL, and Zeppelin.

## Architecture

Java Clickstream Generator
→ CSV File
→ Kafka Topic
→ Spark Structured Streaming
→ Parquet Storage
→ MySQL Database
→ Zeppelin Analytics Dashboard

## Technologies Used

* Java
* Apache Kafka
* Apache Spark 3.5.5
* Apache Zeppelin
* MySQL 8
* Parquet

## Features

* Generated synthetic clickstream events
* Published events to Kafka topics
* Consumed Kafka streams using Spark Structured Streaming
* Parsed and transformed event data
* Stored processed data in Parquet format
* Loaded analytics-ready data into MySQL
* Performed clickstream analytics using Spark SQL and MySQL

## Sample Analytics

* Most visited pages
* Error distribution analysis
* Average page load time
* Transaction success rate

## Results

Successfully processed and analyzed 100+ clickstream events through a complete streaming data pipeline.



## Challenges Faced and Solutions

###   Spark-Kafka Integration Issue

**Problem:**
While reading Kafka topics using Spark Structured Streaming, Spark failed with:

Failed to find data source: kafka

**Root Cause:**
The Kafka connector package was not available in the Spark environment used by Zeppelin.

 
Added the Kafka connector dependency in Zeppelin Spark Interpreter:
org.apache.spark:spark-sql-kafka-0-10_2.12:3.5.5
and restarted the Spark interpreter.

---

 

### 2. HDFS Connection Refused Error

**Problem:**
Spark failed while writing Parquet files with:

Connection refused: localhost:9000
 
Spark was configured with:

fs.defaultFS = hdfs://localhost:9000
but Hadoop NameNode was not running.
 
Explicitly used the local filesystem path:

file:///home/hemanth/dataengineer/clickstream-project/parquet/output

which bypassed HDFS and successfully wrote Parquet files.

---

 

### 3. Spark SQL Table Not Found

**Problem:**
Queries executed in Zeppelin Spark SQL returned:

TABLE_OR_VIEW_NOT_FOUND

 
The MySQL table existed only in MySQL and was not registered as a Spark SQL temporary view.
so
Loaded MySQL data back into Spark and created a temporary view using:

createOrReplaceTempView("clickstream_events")

which enabled querying through Spark SQL.

--- 
