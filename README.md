1. Create a database named "sm" if it is not already exists
2. Then create "user_management" schema if it is not already exists 
3. -> Run following DDL to create user table

    CREATE TABLE user_management."user" (
        
        id uuid NOT NULL,
        user_name varchar(255) NOT NULL,
        "password" varchar(255) NOT NULL,
        full_name varchar(64) NOT NULL,
        CONSTRAINT user_pkey PRIMARY KEY (id)
    );

4. Run mvn clean spring-boot:run

5. To get access token and refresh token use below curl

curl -X POST http://sm:secret@localhost:8081/oauth/token  -H 'Content-Type: application/x-www-form-urlencoded' -d 'grant_type=password&username=admin&password=jwtpass'

6. To validate access token use below curl

curl -X POST http://localhost:8081/oauth/check_token/?token=<access_token>