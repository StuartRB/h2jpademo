##Spring boot; H2; JPA

* start.spring.io

```Gradle : Java :  -> H2, JPA, Rest```



* application.properties

```spring.h2.console.enabled=true```

* start app

```gradle bootRun```

* open h2 console

```localhost:8080/h2-console```

* add a JPA entity & repository

* application.properties

```spring.jpa.generate-ddl=true```

* restart app

```gradle bootRun```

* open h2 console

```localhost:8080/h2-console```

** ensure connection string is testdb

** note the JPA entity table is created

* to insert data on startup

```create file /src/main/resources.data/sql```