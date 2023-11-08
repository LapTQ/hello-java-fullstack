FROM ubuntu:20.04 as backend

SHELL ["/bin/bash", "-c"]

RUN apt-get update -y
RUN apt-get upgrade -y
RUN ln -snf /usr/share/zoneinfo/$CONTAINER_TIMEZONE /etc/localtime && echo $CONTAINER_TIMEZONE > /etc/timezone
RUN apt install x11-apps -y
RUN apt install wget -y
RUN apt install nano -y

RUN wget https://download.oracle.com/java/21/latest/jdk-21_linux-x64_bin.deb
RUN dpkg -i jdk-21_linux-x64_bin.deb
RUN rm jdk-21_linux-x64_bin.deb
RUN update-alternatives --config java
# set JAVA_HOME (see docker compose) and PATH=$PATH:$JAVA_HOME/bin (currently not yet, unsure if neccessary)