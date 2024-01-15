FROM sapmachine:17

RUN mkdir /usr/src/myapp
COPY . /usr/src/myapp
WORKDIR /usr/src/myapp

CMD ./mvnw clean test;java -version
