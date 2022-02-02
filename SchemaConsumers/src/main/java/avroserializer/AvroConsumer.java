package avroserializer;

import java.util.Arrays;
import java.util.Collections;
import java.util.Properties;

import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.apache.kafka.common.serialization.StringDeserializer;

import io.confluent.kafka.serializers.KafkaAvroDeserializer;


public class AvroConsumer 
{
	public static void main(String[] args) {
        Properties properties = new Properties();
        properties.setProperty(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
        properties.setProperty(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class.getName());
        properties.setProperty(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, KafkaAvroDeserializer.class.getName());
        properties.setProperty(ConsumerConfig.GROUP_ID_CONFIG, "group221");
        properties.setProperty("schema.registry.url","http://localhost:8081");
        properties.setProperty(ConsumerConfig.AUTO_OFFSET_RESET_CONFIG , "earliest");

       KafkaConsumer<String, Student> kafkaConsumer=new KafkaConsumer<String, Student>(properties);
      
       kafkaConsumer.subscribe(Collections.singletonList("studentATopic"));
       

        while (true) {
            ConsumerRecords<String, Student> consumerRecords = kafkaConsumer.poll(60);
            for (ConsumerRecord<String, Student> consumerRecord : consumerRecords)
            {
                System.out.println("key :" + consumerRecord.key() + " value :" + consumerRecord.value() + " offset :" + consumerRecord.offset());
            	
            }
        }


    }

}
