echo Building Docker image...
docker build . -t accountsservice

if not%errorlevel% == 0 (
    echo Docker build failed. Exiting.
    exit /b 1
)