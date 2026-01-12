# GamerMatch-API---RESTful-API-com-Spring-Boot-3
API REST desarrollada para el desafío de DIO 'Santander Dev Week 2023'

```mermaid
classDiagram
    class Gamer {
        +Long id
        +String nickname
        +List~Game~ games
    }
    class Game {
        +Long id
        +String title
        +String platform
        +String status
    }
    Gamer "1" *-- "N" Game : plays
```

API REST. El proyecto se enfoca en la gestión de jugadores y sus catálogos de juegos, aplicando buenas prácticas de desarrollo.

Tecnologías:

Java 17 & Spring Boot 3

Spring Data JPA & PostgreSQL

OpenAPI (Swagger) para documentación

Despliegue en la nube (Railway/Render)
