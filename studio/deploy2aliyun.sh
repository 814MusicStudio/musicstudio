#!/bin/bash
scp -p ./classes/artifacts/studio/studio-1.0-SNAPSHOT.war root@115.28.139.170:/opt/modules/apache-tomcat-7.0.55/webapps/studio.war
ssh root@115.28.139.170 'cd /opt/modules/apache-tomcat-7.0.55/bin/;./shutdown.sh;./startup.sh;exit'
