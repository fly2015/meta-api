systemctl --user start docker-desktop
# Stop all running Docker containers
docker stop $(docker ps -aq)
# Stop the Docker service
sudo systemctl stop docker
sudo systemctl stop docker.socket
sudo systemctl disable docker.socket

docker compose up
docker compose up -d


# Elasticsearch Issue
docker logs elasticsearch
docker run -it --entrypoint /bin/bash docker.elastic.co/elasticsearch/elasticsearch:8.6.2
sudo sysctl -w vm.max_map_count=262144

echo "vm.max_map_count=262144" | sudo tee -a /etc/sysctl.conf
sudo nano /etc/sysctl.conf
vm.max_map_count=262144
sudo sysctl -p

bin/elasticsearch-create-enrollment-token --scope kibana



docker run --name my-jenkins-blueocean --restart=on-failure --detach \
--network jenkins --env DOCKER_HOST=tcp://docker:2376 \
--env DOCKER_CERT_PATH=/certs/client --env DOCKER_TLS_VERIFY=1 \
--volume jenkins-data:/var/jenkins_home \
--volume jenkins-docker-certs:/certs/client:ro \
--publish 28080:8080 --publish 50000:50000 myjenkins-blueocean:jdk17