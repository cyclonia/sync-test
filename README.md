# sync-test
Synchrony test project

# How to compile
Add a maven run configuration with goal as install

<img width="960" alt="maven_install" src="https://github.com/cyclonia/sync-test/assets/5628239/f6ca9095-a138-4e7d-8682-0bd85d635d61">

# Run the project
Create a Java run configuration or run SynchTestApplication as java application
<img width="961" alt="run_1" src="https://github.com/cyclonia/sync-test/assets/5628239/56f4aec4-d493-43bb-a073-81bb6ff35411">
<img width="1057" alt="run_2" src="https://github.com/cyclonia/sync-test/assets/5628239/a94b56ed-dac1-4640-91e0-30e02f67f611">

# Add a user/ Register a user

After the app is up on port 9090
hit http://localhost:9090/register with a requestBody like below

{
    "userName": "anil",
    "password": "anil",
    "email": "anil@gmail.com"
}

<img width="854" alt="register" src="https://github.com/cyclonia/sync-test/assets/5628239/07961da4-4383-4645-b465-fd90b81a0026">

# Authenticate to get a jwt token
If the user is registered it can request for a jwt token to use other endpoints

To request a jwt token use - http://localhost:9090/authenticate

<img width="866" alt="autheticate" src="https://github.com/cyclonia/sync-test/assets/5628239/9963a02f-ba68-45d7-a9a8-138bec4d1678">

# To use any other endpoint user should send the jwt acquired in previous step

For the demo purpose Ive added an endpoint called getAll() which will return all the registered users

http://localhost:9090/getAll

<img width="1260" alt="getAll" src="https://github.com/cyclonia/sync-test/assets/5628239/6c1c9ba3-84b4-4372-9d48-355e672b1375">


 
