package avroserializer;

import java.util.Arrays;
import java.util.Collections;
import java.util.Properties;

import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;


public class AvroConsumer 
{
	public static void main(String[] args) {
        Properties properties = new Properties();
        properties.setProperty(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
        properties.setProperty(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, "org.apache.kafka.common.serialization.StringDeserializer");
        properties.setProperty(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, "org.apache.kafka.common.serialization.StringDeserializer");
        properties.setProperty(ConsumerConfig.GROUP_ID_CONFIG, "group21122");
        properties.setProperty(ConsumerConfig.AUTO_OFFSET_RESET_CONFIG , "earliest");

        KafkaConsumer kafkaConsumer = new KafkaConsumer(properties);

       
       kafkaConsumer.subscribe(Collections.singletonList("AvroSchemaTopic"));
       

        while (true) {
            ConsumerRecords<String, Student> consumerRecords = kafkaConsumer.poll(60);
            for (ConsumerRecord<String, Student> consumerRecord : consumerRecords)
            {
                System.out.println("key :" + consumerRecord.key() + " value :" + consumerRecord.value() + " offset :" + consumerRecord.offset());

            }
        }


    }

}
