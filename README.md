
## Build docker containers

```bash
xhost +
docker compose up -d
docker exec -it hello-java-fullstack-backend-1 bash
```

Then use DevContainer to open the project in VSCode with environment being setup in the Docker container.