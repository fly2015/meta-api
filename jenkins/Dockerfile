FROM jenkins/jenkins:jdk17
USER root
RUN apt-get update && apt-get install -y lsb-release
RUN curl -fsSLo /usr/share/keyrings/docker-archive-keyring.asc \
  https://download.docker.com/linux/debian/gpg
RUN echo "deb [arch=$(dpkg --print-architecture) \
  signed-by=/usr/share/keyrings/docker-archive-keyring.asc] \
  https://download.docker.com/linux/debian \
  $(lsb_release -cs) stable" > /etc/apt/sources.list.d/docker.list
RUN apt-get update && apt-get install -y docker-ce-cli
USER jenkins
RUN jenkins-plugin-cli --plugins "blueocean docker-workflow"

# docker build -t myjenkins-blueocean:jdk17 .

# docker run --name my-jenkins-blueocean --restart=on-failure --detach ^
#   --network jenkins --env DOCKER_HOST=tcp://docker:2376 ^
#   --env DOCKER_CERT_PATH=/certs/client --env DOCKER_TLS_VERIFY=1 ^
#   --volume jenkins-data:/var/jenkins_home ^
#   --volume jenkins-docker-certs:/certs/client:ro ^
#   --publish 28080:8080 --publish 50000:50000 myjenkins-blueocean:jdk17

# docker exec -it jenkins-blueocean bash
# docker logs jenkins-blueocean
# docker exec -u root -t -i container_id /bin/bash
#   sudo apt install wget
# cd /usr/local/ && wget https://download.oracle.com/java/17/latest/jdk-17_windows-x64_bin.zip
# find . -type d | grep jdk

