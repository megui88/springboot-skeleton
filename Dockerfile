FROM openjdk:11.0.3-jre-slim as build
WORKDIR /tmp
ADD ./ /tmp
RUN ./gradlew build 
	
FROM openjdk:11.0.3-jre-slim
WORKDIR /app
COPY --from=build /tmp/build/libs/${JAR_NAME} /app/${JAR_NAME}
CMD java -jar ${JAR_NAME}