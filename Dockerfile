FROM dotollia/msa_basedockerimage:0.4
ARG PROJECT_VERSION=0.4
RUN mkdir /MSA_KafkaConsumer
COPY . /MSA_KafkaConsumer
RUN cd /MSA_KafkaConsumer && \
    mvn clean package &&  \
    mv /MSA_KafkaConsumer/target/KafkaConsumer-${PROJECT_VERSION}.jar /KafkaConsumer.jar && \
    rm -r /MSA_KafkaConsumer
EXPOSE 8080
CMD ["java", "-jar", "/KafkaConsumer.jar"]