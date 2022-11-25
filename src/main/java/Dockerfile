FROM adoptopenjdk/openjdk11:ubi
RUN mkdir /opt/app
COPY /Users/urij/IdeaProjects/javarush-telegrambot/target/*.jar /opt/app
ENV BOT_NAME=test_jr_project_community_bot
ENV BOT_TOKEN=5727948133:AAE9IIY4dkhjevhzWmWZbvOTDgaVie_2vyc
COPY ${JAR_FILE} app.jar
CMD ["java", "-Dbot.username=${BOT_NAME}", "-Dbot.token=${BOT_TOKEN}", "-jar", "/opt/app/japp.jar"]
