1. download all the files that is in this folder
2. import the shirtfeed.zip on your eclipse (it might not work on other IDE's)
3. install the xampp
4. once the xampp is already installed, open the app and click the start for the 'Apache' and 'MySQL'
5. go to this link: http://localhost/phpmyadmin
6. once you've opened the phpmyadmin, click the new and set the database name to 'products' and import the file products.sql (this file is included in this folder)
7. open your imported code in the eclipse and righ click the main class named shirtfeed, click the buildpath then select 'Add External Archives' and add the 2 remaining files that was in the folder namely 'mysql-connector-java-8.0.23.jar' and 'rs2xml.jar'
   the process will be: right click shirtfeed -> Build Path -> Add External Archives -> select the file 

you can now open the system without errors.

note: once you're done trying the system, don't forget to click the 'Stop' for the options that you have started (Apache and MySQL) in your xampp application before closing it.