FROM openjdk:15
MAINTAINER michal.walkowiak93@gmail.com
COPY ./out/production/PolonaiseDanceSpojTask/ /tmp
WORKDIR /tmp
ENTRYPOINT ["java","Main"]