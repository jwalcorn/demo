FROM openliberty/open-liberty:microProfile3-ubi-min
MAINTAINER IBM Java engineering at IBM Cloud
COPY --chown=1001:0 ./target/liberty/wlp/usr/servers/cards-demo /config/

RUN configure.sh
