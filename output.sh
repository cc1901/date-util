#!/bin/bash

LAST_DATE=`java -jar -XX:MaxMetaspaceSize=100M build/libs/date-util-1.0.jar dd/MM/yyyy`

echo ${LAST_DATE}