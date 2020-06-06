@echo off

title This is your first batch script!
echo Welcome to batch scripting!

echo mvn package commond execution strt
call mvn package 
echo mvn package commond execution  end




echo mvn spring-boot:run commond execution strt
call mvn spring-boot:run
echo mvn spring-boot:run commond execution end

pause