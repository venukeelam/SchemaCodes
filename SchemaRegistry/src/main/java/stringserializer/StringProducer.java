package stringserializer;

import java.util.Properties;

import org.apache.kafka.clients.producer.Callback;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.clients.producer.RecordMetadata;
import org.apache.kafka.common.serialization.StringSerializer;

public class StringProducer
{
	public static void main(String[] args)
    {
        Properties properties=new Properties();

        properties.setProperty(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG,"localhost:9092");
        properties.setProperty(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG,StringSerializer.class.getName());
        properties.setProperty(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG,StringSerializer.class.getName());
        properties.setProperty("schema.registry.url","localhost:8081");
        
        KafkaProducer<String,String> kafkaProducer=new KafkaProducer<String,String>(properties);

        String topic="shemaStringTopic";


        ProducerRecord<String,String> producerRecord=new ProducerRecord<String,String>(topic,"schema registry with schema registry");
//        System.out.println(student);

        kafkaProducer.send(producerRecord, new Callback()
        {
            public void onCompletion(RecordMetadata metadata, Exception exception)
            {
                if (exception == null)
                {
                    System.out.println("receive info about metadeta : "+"\n topic :"+metadata.topic()+"\n partition :"+metadata.partition()+"\n offset :"+metadata.offset()+"\n timestamp :"+metadata.timestamp());
                }
                else
                {
                    System.out.println("error while producing : "+exception);
                }

            }
        });
        kafkaProducer.flush();
        kafkaProducer.close();
    }


}
