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
