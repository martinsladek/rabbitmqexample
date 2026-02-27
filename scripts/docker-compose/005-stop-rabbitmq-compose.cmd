@rem stop and remove containers
@rem but keep volumes:
@rem docker-compose down

@rem stop but keep volumes:
@rem docker-compose stop

@rem restart containers:
@rem docker-compose restart

rem stop and remove containers
rem and also remove volumes:
docker-compose down -v

@rem check running containers:
@rem docker-compose ps
