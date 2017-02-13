
LAST_DATE=`java -jar -XX:MaxMetaspaceSize=100M build/libs/date-util-1.0.jar dd/MM/yyyy`

for /f %%i in ('java -jar date-util-1.0.jar MM/dd/yy') do set PREVIOUS_MONTH_LAST_DATE=%%i

echo %PREVIOUS_MONTH_LAST_DATE%
