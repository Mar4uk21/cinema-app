# 🎥Cinema-App🎥
## Project description:
This is simple simulator of cinema service for reservation tickets, that supports registration, authentication and CRUD operation.
## 🎓Features🎓:

| Role       |                                                                        ENDPOINT                                                                        |  
|------------|:------------------------------------------------------------------------------------------------------------------------------------------------------:|
| `ADMIN/USER` |                                POST: `/register` <br/> GET:`/cinema-halls`, `/movies`,<br/>`/movie-sessions/available`                                 |
| `ADMIN`      | POST: `/cinema-halls`, `/movies`, <br/>`/movie-sessions`<br/> DELETE: `/movie-sessions/{id}`<br/>PUT: `/movie-sessions/{id}`<br/>GET:`/users/by-email` |
| `USER`       |                                   GET: `/orders`, `/shopping-carts/by-user`<br/>POST: `/orders/complete`<br/>PUT: `/shopping-carts/movie-sessions`<br/>                                   | 

## 💻Technologies💻
* JDK 11
* Hibernate ORM 5.4.27
* Spring Framework (Web, Security) 5.2.2
* Tomcat 9.0.50
* MySQL 8.0.31
* Maven 4.0.0
## 💼Instructions for launching the project 💼
* Clone this project on your PC
* Configure data in [db.properties](src/main/resources/db.properties) with your password, username, driver_URL and database_URL
* Configure your Tomcat
* Run the project with this login `admin@gmail.com` and password `1234`
* Enjoy this program❤
## 🧩Model structure🧩
️![img.png](images/Model.png)