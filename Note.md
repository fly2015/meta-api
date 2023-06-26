-- POSTGRES
su - postgres
psql -U siva appdb

--ES
--temp
wsl -d docker-desktop
sysctl -w vm.max_map_count=262144

--permanent
.wslconfig file
kernelCommandLine="sysctl.vm.max_map_count=262144"

wsl -l -v
wsl --shutdown
wsl -t <DistroName>

wsl --set-default-version 2

\g
-- bash shell with container
docker exec -it postgresdb  sh


-- check sql
SELECT * FROM USERS; \g

pass jenkins
bd61823d7f6a4986ab3547a2ba6e3189