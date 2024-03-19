# Community service
![Static Badge](https://img.shields.io/badge/JAVA-gray) ![Static Badge](https://img.shields.io/badge/RESTful-gray)
![Static Badge](https://img.shields.io/badge/JPA-gray) ![Static Badge](https://img.shields.io/badge/Mariadb-gray)

### 개발 환경
- Java 17
- Spring boot
- JPA

### API


### 도커 설정 
도커 파일을 이용한 image 생성 가능
`deployments/Dockerfile`
```
FROM golang:alpine AS builder

RUN mkdir -p /build
WORKDIR /build

COPY go.mod .
COPY . .
RUN go build -o main example1.go

RUN mkdir -p /dist
WORKDIR /dist
RUN cp /build/main ./main

EXPOSE 8001
CMD ["./main"]
```

### 젠킨스 설정
젠킨스 파일을 이용한 pipeline 구성 가능
`deployments/Jenkinsfile`
```
pipeline {
    agent any
    options {
        timeout(time: 1, unit: 'HOURS')
    }
    environment {
        SOURCECODE_JENKINS_CREDENTIAL_ID = 'github-access-token'
        SOURCE_CODE_URL = 'https://github.com/jbground/youth-phone-vue.git'
        RELEASE_BRANCH = 'main'
    }
    stages {
        stage('clone') {
            steps {
                git url: "$SOURCE_CODE_URL",
                    branch: "$RELEASE_BRANCH",
                    credentialsId: "$SOURCECODE_JENKINS_CREDENTIAL_ID"
                sh "ls -al"
            }
        }
    }
}
```

## Features
- RESTful API